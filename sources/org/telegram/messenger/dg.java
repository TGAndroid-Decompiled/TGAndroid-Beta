package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class dg implements Runnable {
    public final int f17422a = 0;
    public final boolean f17423b;
    public final long f17424c;
    public final int d;
    public final long f17425e;
    public final Object f17426f;
    public final Object h;
    public final Object f17427n;
    public final Object f17428r;
    public final Object f17429s;

    public dg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17426f = messagesStorage;
        this.f17424c = j3;
        this.f17423b = z10;
        this.h = str;
        this.f17425e = j10;
        this.d = i10;
        this.f17427n = str2;
        this.f17428r = str3;
        this.f17429s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17422a) {
            case 0:
                ((MessagesStorage) this.f17426f).lambda$updateUnreadReactionsCountInternal$261(this.f17424c, this.f17423b, (String) this.h, this.f17425e, this.d, (String) this.f17427n, (String) this.f17428r, (String) this.f17429s);
                return;
            default:
                yh.n5 n5Var = (yh.n5) this.f17426f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17427n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17428r;
                boolean z10 = this.f17423b;
                long j3 = this.f17424c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17429s;
                long j10 = this.f17425e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f53146a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19903id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f53146a).sendRequest(tL_messages_getScheduledMessages, new v80(n5Var, messageObject, j10, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public dg(yh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17426f = n5Var;
        this.h = tLObject;
        this.f17427n = runnable;
        this.f17428r = tL_error;
        this.f17423b = z10;
        this.f17424c = j3;
        this.d = i10;
        this.f17429s = messageObject;
        this.f17425e = j10;
    }
}
