package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17358a = 0;
    public final boolean f17359b;
    public final long f17360c;
    public final int d;
    public final long f17361e;
    public final Object f17362f;
    public final Object h;
    public final Object f17363n;
    public final Object f17364r;
    public final Object f17365s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17362f = messagesStorage;
        this.f17360c = j3;
        this.f17359b = z10;
        this.h = str;
        this.f17361e = j10;
        this.d = i10;
        this.f17363n = str2;
        this.f17364r = str3;
        this.f17365s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17358a) {
            case 0:
                ((MessagesStorage) this.f17362f).lambda$updateUnreadReactionsCountInternal$261(this.f17360c, this.f17359b, (String) this.h, this.f17361e, this.d, (String) this.f17363n, (String) this.f17364r, (String) this.f17365s);
                return;
            default:
                yh.u5 u5Var = (yh.u5) this.f17362f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17363n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17364r;
                boolean z10 = this.f17359b;
                long j3 = this.f17360c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17365s;
                long j10 = this.f17361e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.a5(u5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(u5Var.f52085a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20147id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(u5Var.f52085a).sendRequest(tL_messages_getScheduledMessages, new ja(u5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.u5 u5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17362f = u5Var;
        this.h = tLObject;
        this.f17363n = runnable;
        this.f17364r = tL_error;
        this.f17359b = z10;
        this.f17360c = j3;
        this.d = i10;
        this.f17365s = messageObject;
        this.f17361e = j10;
    }
}
