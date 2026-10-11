package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17343a = 0;
    public final boolean f17344b;
    public final long f17345c;
    public final int d;
    public final long f17346e;
    public final Object f17347f;
    public final Object h;
    public final Object f17348n;
    public final Object f17349r;
    public final Object f17350s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17347f = messagesStorage;
        this.f17345c = j3;
        this.f17344b = z10;
        this.h = str;
        this.f17346e = j10;
        this.d = i10;
        this.f17348n = str2;
        this.f17349r = str3;
        this.f17350s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17343a) {
            case 0:
                ((MessagesStorage) this.f17347f).lambda$updateUnreadReactionsCountInternal$261(this.f17345c, this.f17344b, (String) this.h, this.f17346e, this.d, (String) this.f17348n, (String) this.f17349r, (String) this.f17350s);
                return;
            default:
                yh.n5 n5Var = (yh.n5) this.f17347f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17348n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17349r;
                boolean z10 = this.f17344b;
                long j3 = this.f17345c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17350s;
                long j10 = this.f17346e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f52997a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20132id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f52997a).sendRequest(tL_messages_getScheduledMessages, new ma(n5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17347f = n5Var;
        this.h = tLObject;
        this.f17348n = runnable;
        this.f17349r = tL_error;
        this.f17344b = z10;
        this.f17345c = j3;
        this.d = i10;
        this.f17350s = messageObject;
        this.f17346e = j10;
    }
}
