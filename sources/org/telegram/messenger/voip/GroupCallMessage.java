package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;

public class GroupCallMessage {
    public final int currentAccount;
    public final long fromId;
    public final TLRPC.TL_textWithEntities message;
    public final long reactionAnimatedEmojiId;
    public final ReactionsLayoutInBubble.VisibleReaction visibleReaction;

    public GroupCallMessage(int r4, long r5, org.telegram.tgnet.TLRPC.TL_textWithEntities r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.GroupCallMessage.<init>(int, long, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }
}
