package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f15779a = 0;
    public final boolean f15780b;
    public final long f15781c;
    public final int d;
    public final long e;
    public final Object f15782f;
    public final Object h;
    public final Object f15783n;
    public final Object f15784r;
    public final Object f15785s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15782f = messagesStorage;
        this.f15781c = j3;
        this.f15780b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15783n = str2;
        this.f15784r = str3;
        this.f15785s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15779a) {
            case 0:
                ((MessagesStorage) this.f15782f).lambda$updateUnreadReactionsCountInternal$261(this.f15781c, this.f15780b, (String) this.h, this.e, this.d, (String) this.f15783n, (String) this.f15784r, (String) this.f15785s);
                return;
            default:
                yh.v5 v5Var = (yh.v5) this.f15782f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15783n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15784r;
                boolean z10 = this.f15780b;
                long j3 = this.f15781c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15785s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.c5(v5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(v5Var.f47923a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18221id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(v5Var.f47923a).sendRequest(tL_messages_getScheduledMessages, new ja(v5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(yh.v5 v5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15782f = v5Var;
        this.h = tLObject;
        this.f15783n = runnable;
        this.f15784r = tL_error;
        this.f15780b = z10;
        this.f15781c = j3;
        this.d = i10;
        this.f15785s = messageObject;
        this.e = j10;
    }
}
