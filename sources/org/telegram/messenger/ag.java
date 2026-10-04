package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17353a = 0;
    public final boolean f17354b;
    public final long f17355c;
    public final int d;
    public final long f17356e;
    public final Object f17357f;
    public final Object h;
    public final Object f17358n;
    public final Object f17359r;
    public final Object f17360s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17357f = messagesStorage;
        this.f17355c = j3;
        this.f17354b = z10;
        this.h = str;
        this.f17356e = j10;
        this.d = i10;
        this.f17358n = str2;
        this.f17359r = str3;
        this.f17360s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17353a) {
            case 0:
                ((MessagesStorage) this.f17357f).lambda$updateUnreadReactionsCountInternal$261(this.f17355c, this.f17354b, (String) this.h, this.f17356e, this.d, (String) this.f17358n, (String) this.f17359r, (String) this.f17360s);
                return;
            default:
                yh.t5 t5Var = (yh.t5) this.f17357f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17358n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17359r;
                boolean z10 = this.f17354b;
                long j3 = this.f17355c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17360s;
                long j10 = this.f17356e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.z4(t5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t5Var.f52016a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20142id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t5Var.f52016a).sendRequest(tL_messages_getScheduledMessages, new ja(t5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.t5 t5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17357f = t5Var;
        this.h = tLObject;
        this.f17358n = runnable;
        this.f17359r = tL_error;
        this.f17354b = z10;
        this.f17355c = j3;
        this.d = i10;
        this.f17360s = messageObject;
        this.f17356e = j10;
    }
}
