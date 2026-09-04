package org.telegram.messenger.voip;

import ah.j1;
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
    public final j1 visibleReaction;

    public GroupCallMessage(int r3, long r4, long r6, org.telegram.tgnet.TLRPC.TL_textWithEntities r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.GroupCallMessage.<init>(int, long, long, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public boolean isOut() {
        return w7.b0.a(this.flags, 1);
    }

    public boolean isSendConfirmed() {
        return w7.b0.a(this.flags, 8);
    }

    public boolean isSendDelayed() {
        return w7.b0.a(this.flags, 2);
    }

    public boolean isSendError() {
        return w7.b0.a(this.flags, 4);
    }

    public void notifyStateUpdate() {
        ArrayList<Runnable> arrayList = this.listeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Runnable runnable = arrayList.get(i10);
            i10++;
            runnable.run();
        }
    }

    public void setIsOut(boolean z10) {
        this.flags = w7.b0.b(this.flags, 1, z10);
    }

    public void setIsSendConfirmed(boolean z10) {
        this.flags = w7.b0.b(this.flags, 8, z10);
    }

    public void setIsSendDelayed(boolean z10) {
        this.flags = w7.b0.b(this.flags, 2, z10);
    }

    public void setIsSendError(boolean z10) {
        this.flags = w7.b0.b(this.flags, 4, z10);
    }

    public void subscribeToStateUpdates(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unsubscribeFromStateUpdates(Runnable runnable) {
        this.listeners.remove(runnable);
    }
}
