package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f15905a = 0;
    public final boolean f15906b;
    public final long f15907c;
    public final int d;
    public final long e;
    public final Object f15908f;
    public final Object h;
    public final Object f15909n;
    public final Object f15910r;
    public final Object f15911s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15908f = messagesStorage;
        this.f15907c = j3;
        this.f15906b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15909n = str2;
        this.f15910r = str3;
        this.f15911s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15905a) {
            case 0:
                ((MessagesStorage) this.f15908f).lambda$updateUnreadReactionsCountInternal$261(this.f15907c, this.f15906b, (String) this.h, this.e, this.d, (String) this.f15909n, (String) this.f15910r, (String) this.f15911s);
                return;
            default:
                yh.t5 t5Var = (yh.t5) this.f15908f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15909n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15910r;
                boolean z10 = this.f15906b;
                long j3 = this.f15907c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15911s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.z4(t5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t5Var.f48028a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18421id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t5Var.f48028a).sendRequest(tL_messages_getScheduledMessages, new ja(t5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.t5 t5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15908f = t5Var;
        this.h = tLObject;
        this.f15909n = runnable;
        this.f15910r = tL_error;
        this.f15906b = z10;
        this.f15907c = j3;
        this.d = i10;
        this.f15911s = messageObject;
        this.e = j10;
    }
}
