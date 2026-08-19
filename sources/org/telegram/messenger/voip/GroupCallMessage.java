package org.telegram.messenger.voip;

import java.util.ArrayList;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public class GroupCallMessage {
    private static final int FLAG_IS_OUT = 1;
    private static final int FLAG_SEND_CONFIRMED = 8;
    private static final int FLAG_SEND_DELAYED = 2;
    private static final int FLAG_SEND_ERROR = 4;
    public final int currentAccount;
    private int flags;
    public final long fromId;
    private final ArrayList<Runnable> listeners = new ArrayList<>();
    public final TLRPC.TL_textWithEntities message;
    public final long randomId;
    public final long reactionAnimatedEmojiId;
    public final ReactionsLayoutInBubble.VisibleReaction visibleReaction;

    public GroupCallMessage(int i, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        long j3;
        TLRPC.TL_availableReaction tL_availableReaction;
        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromEmojicon;
        this.currentAccount = i;
        this.fromId = j;
        this.randomId = j2;
        this.message = tL_textWithEntities;
        ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities.entities;
        if (arrayList == null || arrayList.size() != 1) {
            j3 = 0;
        } else {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(0);
            if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                j3 = ((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id;
            } else {
                j3 = 0;
            }
        }
        if (j3 != 0) {
            visibleReactionFromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(Long.valueOf(j3));
        } else {
            ArrayList<TLRPC.MessageEntity> arrayList2 = tL_textWithEntities.entities;
            visibleReactionFromEmojicon = ((arrayList2 == null || arrayList2.isEmpty()) && (tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(tL_textWithEntities.text)) != null) ? ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tL_availableReaction) : null;
        }
        this.reactionAnimatedEmojiId = j3;
        this.visibleReaction = visibleReactionFromEmojicon;
    }

    public void setIsOut(boolean z) {
        this.flags = BitwiseUtils.setFlag(this.flags, 1, z);
    }

    public void setIsSendDelayed(boolean z) {
        this.flags = BitwiseUtils.setFlag(this.flags, 2, z);
    }

    public void setIsSendError(boolean z) {
        this.flags = BitwiseUtils.setFlag(this.flags, 4, z);
    }

    public void setIsSendConfirmed(boolean z) {
        this.flags = BitwiseUtils.setFlag(this.flags, 8, z);
    }

    public boolean isOut() {
        return BitwiseUtils.hasFlag(this.flags, 1);
    }

    public boolean isSendDelayed() {
        return BitwiseUtils.hasFlag(this.flags, 2);
    }

    public boolean isSendError() {
        return BitwiseUtils.hasFlag(this.flags, 4);
    }

    public boolean isSendConfirmed() {
        return BitwiseUtils.hasFlag(this.flags, 8);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
    }
}
