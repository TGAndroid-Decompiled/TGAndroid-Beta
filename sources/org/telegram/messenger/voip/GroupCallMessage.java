package org.telegram.messenger.voip;

import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.core.BitwiseUtils;
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

    public GroupCallMessage(int r3, long r4, long r6, org.telegram.tgnet.TLRPC.TL_textWithEntities r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.GroupCallMessage.<init>(int, long, long, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
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
        Iterator<Runnable> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}
