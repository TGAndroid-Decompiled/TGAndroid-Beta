package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f15768a = 0;
    public final boolean f15769b;
    public final long f15770c;
    public final int d;
    public final long e;
    public final Object f15771f;
    public final Object h;
    public final Object f15772n;
    public final Object f15773r;
    public final Object f15774s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15771f = messagesStorage;
        this.f15770c = j3;
        this.f15769b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15772n = str2;
        this.f15773r = str3;
        this.f15774s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15768a) {
            case 0:
                ((MessagesStorage) this.f15771f).lambda$updateUnreadReactionsCountInternal$261(this.f15770c, this.f15769b, (String) this.h, this.e, this.d, (String) this.f15772n, (String) this.f15773r, (String) this.f15774s);
                return;
            default:
                yh.u5 u5Var = (yh.u5) this.f15771f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15772n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15773r;
                boolean z10 = this.f15769b;
                long j3 = this.f15770c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15774s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.b5(u5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(u5Var.f47801a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18209id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(u5Var.f47801a).sendRequest(tL_messages_getScheduledMessages, new ja(u5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(yh.u5 u5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15771f = u5Var;
        this.h = tLObject;
        this.f15772n = runnable;
        this.f15773r = tL_error;
        this.f15769b = z10;
        this.f15770c = j3;
        this.d = i10;
        this.f15774s = messageObject;
        this.e = j10;
    }
}
