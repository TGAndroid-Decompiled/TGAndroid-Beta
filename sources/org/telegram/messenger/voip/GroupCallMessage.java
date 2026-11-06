package org.telegram.messenger.voip;

import c8.yc;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
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
    public final ch.o0 visibleReaction;

    public GroupCallMessage(int r3, long r4, long r6, org.telegram.tgnet.TLRPC.TL_textWithEntities r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.GroupCallMessage.<init>(int, long, long, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public boolean isOut() {
        return yc.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return yc.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return yc.a(this.flags, 2);
    }

    public boolean isSendError() {
        return yc.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Runnable runnable = arrayList.get(i7);
            i7++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z9) {
        this.flags = yc.b(this.flags, 1, z9);
    }

    public void setIsSendConfirmed(boolean z9) {
        this.flags = yc.b(this.flags, 8, z9);
    }

    public void setIsSendDelayed(boolean z9) {
        this.flags = yc.b(this.flags, 2, z9);
    }

    public void setIsSendError(boolean z9) {
        this.flags = yc.b(this.flags, 4, z9);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}
