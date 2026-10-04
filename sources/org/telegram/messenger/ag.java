package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17349a = 0;
    public final boolean f17350b;
    public final long f17351c;
    public final int d;
    public final long f17352e;
    public final Object f17353f;
    public final Object h;
    public final Object f17354n;
    public final Object f17355r;
    public final Object f17356s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17353f = messagesStorage;
        this.f17351c = j3;
        this.f17350b = z10;
        this.h = str;
        this.f17352e = j10;
        this.d = i10;
        this.f17354n = str2;
        this.f17355r = str3;
        this.f17356s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17349a) {
            case 0:
                ((MessagesStorage) this.f17353f).lambda$updateUnreadReactionsCountInternal$261(this.f17351c, this.f17350b, (String) this.h, this.f17352e, this.d, (String) this.f17354n, (String) this.f17355r, (String) this.f17356s);
                return;
            default:
                yh.t5 t5Var = (yh.t5) this.f17353f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17354n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17355r;
                boolean z10 = this.f17350b;
                long j3 = this.f17351c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17356s;
                long j10 = this.f17352e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.z4(t5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t5Var.f52011a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20138id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t5Var.f52011a).sendRequest(tL_messages_getScheduledMessages, new ja(t5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.t5 t5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17353f = t5Var;
        this.h = tLObject;
        this.f17354n = runnable;
        this.f17355r = tL_error;
        this.f17350b = z10;
        this.f17351c = j3;
        this.d = i10;
        this.f17356s = messageObject;
        this.f17352e = j10;
    }
}
