package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f17265a = 0;
    public final boolean f17266b;
    public final long f17267c;
    public final int d;
    public final long f17268e;
    public final Object f17269f;
    public final Object h;
    public final Object f17270n;
    public final Object f17271r;
    public final Object f17272s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17269f = messagesStorage;
        this.f17267c = j3;
        this.f17266b = z10;
        this.h = str;
        this.f17268e = j10;
        this.d = i10;
        this.f17270n = str2;
        this.f17271r = str3;
        this.f17272s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17265a) {
            case 0:
                ((MessagesStorage) this.f17269f).lambda$updateUnreadReactionsCountInternal$261(this.f17267c, this.f17266b, (String) this.h, this.f17268e, this.d, (String) this.f17270n, (String) this.f17271r, (String) this.f17272s);
                return;
            default:
                zh.s5 s5Var = (zh.s5) this.f17269f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17270n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17271r;
                boolean z10 = this.f17266b;
                long j3 = this.f17267c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17272s;
                long j10 = this.f17268e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.y4(s5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.f52566a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19969id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s5Var.f52566a).sendRequest(tL_messages_getScheduledMessages, new ja(s5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(zh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17269f = s5Var;
        this.h = tLObject;
        this.f17270n = runnable;
        this.f17271r = tL_error;
        this.f17266b = z10;
        this.f17267c = j3;
        this.d = i10;
        this.f17272s = messageObject;
        this.f17268e = j10;
    }
}
