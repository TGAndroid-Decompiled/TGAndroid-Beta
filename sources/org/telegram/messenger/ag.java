package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17344a = 0;
    public final boolean f17345b;
    public final long f17346c;
    public final int d;
    public final long f17347e;
    public final Object f17348f;
    public final Object h;
    public final Object f17349n;
    public final Object f17350r;
    public final Object f17351s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17348f = messagesStorage;
        this.f17346c = j3;
        this.f17345b = z10;
        this.h = str;
        this.f17347e = j10;
        this.d = i10;
        this.f17349n = str2;
        this.f17350r = str3;
        this.f17351s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17344a) {
            case 0:
                ((MessagesStorage) this.f17348f).lambda$updateUnreadReactionsCountInternal$261(this.f17346c, this.f17345b, (String) this.h, this.f17347e, this.d, (String) this.f17349n, (String) this.f17350r, (String) this.f17351s);
                return;
            default:
                yh.m5 m5Var = (yh.m5) this.f17348f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17349n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17350r;
                boolean z10 = this.f17345b;
                long j3 = this.f17346c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17351s;
                long j10 = this.f17347e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(m5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(m5Var.f52880a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20138id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(m5Var.f52880a).sendRequest(tL_messages_getScheduledMessages, new ma(m5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.m5 m5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17348f = m5Var;
        this.h = tLObject;
        this.f17349n = runnable;
        this.f17350r = tL_error;
        this.f17345b = z10;
        this.f17346c = j3;
        this.d = i10;
        this.f17351s = messageObject;
        this.f17347e = j10;
    }
}
