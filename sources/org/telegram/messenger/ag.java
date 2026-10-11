package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17379a = 0;
    public final boolean f17380b;
    public final long f17381c;
    public final int d;
    public final long f17382e;
    public final Object f17383f;
    public final Object h;
    public final Object f17384n;
    public final Object f17385r;
    public final Object f17386s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17383f = messagesStorage;
        this.f17381c = j3;
        this.f17380b = z10;
        this.h = str;
        this.f17382e = j10;
        this.d = i10;
        this.f17384n = str2;
        this.f17385r = str3;
        this.f17386s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17379a) {
            case 0:
                ((MessagesStorage) this.f17383f).lambda$updateUnreadReactionsCountInternal$261(this.f17381c, this.f17380b, (String) this.h, this.f17382e, this.d, (String) this.f17384n, (String) this.f17385r, (String) this.f17386s);
                return;
            default:
                yh.n5 n5Var = (yh.n5) this.f17383f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17384n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17385r;
                boolean z10 = this.f17380b;
                long j3 = this.f17381c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17386s;
                long j10 = this.f17382e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f53031a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f20168id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f53031a).sendRequest(tL_messages_getScheduledMessages, new ma(n5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17383f = n5Var;
        this.h = tLObject;
        this.f17384n = runnable;
        this.f17385r = tL_error;
        this.f17380b = z10;
        this.f17381c = j3;
        this.d = i10;
        this.f17386s = messageObject;
        this.f17382e = j10;
    }
}
