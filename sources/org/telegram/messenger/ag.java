package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17348a = 0;
    public final boolean f17349b;
    public final long f17350c;
    public final int d;
    public final long f17351e;
    public final Object f17352f;
    public final Object h;
    public final Object f17353n;
    public final Object f17354r;
    public final Object f17355s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17352f = messagesStorage;
        this.f17350c = j3;
        this.f17349b = z10;
        this.h = str;
        this.f17351e = j10;
        this.d = i10;
        this.f17353n = str2;
        this.f17354r = str3;
        this.f17355s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17348a) {
            case 0:
                ((MessagesStorage) this.f17352f).lambda$updateUnreadReactionsCountInternal$261(this.f17350c, this.f17349b, (String) this.h, this.f17351e, this.d, (String) this.f17353n, (String) this.f17354r, (String) this.f17355s);
                return;
            default:
                yh.m5 m5Var = (yh.m5) this.f17352f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17353n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17354r;
                boolean z10 = this.f17349b;
                long j3 = this.f17350c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17355s;
                long j10 = this.f17351e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(m5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(m5Var.f52924a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20142id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(m5Var.f52924a).sendRequest(tL_messages_getScheduledMessages, new ma(m5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.m5 m5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17352f = m5Var;
        this.h = tLObject;
        this.f17353n = runnable;
        this.f17354r = tL_error;
        this.f17349b = z10;
        this.f17350c = j3;
        this.d = i10;
        this.f17355s = messageObject;
        this.f17351e = j10;
    }
}
