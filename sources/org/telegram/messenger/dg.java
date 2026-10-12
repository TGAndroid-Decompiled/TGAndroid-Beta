package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class dg implements Runnable {
    public final int f17421a = 0;
    public final boolean f17422b;
    public final long f17423c;
    public final int d;
    public final long f17424e;
    public final Object f17425f;
    public final Object h;
    public final Object f17426n;
    public final Object f17427r;
    public final Object f17428s;

    public dg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17425f = messagesStorage;
        this.f17423c = j3;
        this.f17422b = z10;
        this.h = str;
        this.f17424e = j10;
        this.d = i10;
        this.f17426n = str2;
        this.f17427r = str3;
        this.f17428s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17421a) {
            case 0:
                ((MessagesStorage) this.f17425f).lambda$updateUnreadReactionsCountInternal$261(this.f17423c, this.f17422b, (String) this.h, this.f17424e, this.d, (String) this.f17426n, (String) this.f17427r, (String) this.f17428s);
                return;
            default:
                yh.n5 n5Var = (yh.n5) this.f17425f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17426n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17427r;
                boolean z10 = this.f17422b;
                long j3 = this.f17423c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17428s;
                long j10 = this.f17424e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.t4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f53134a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19902id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f53134a).sendRequest(tL_messages_getScheduledMessages, new v80(n5Var, messageObject, j10, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public dg(yh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17425f = n5Var;
        this.h = tLObject;
        this.f17426n = runnable;
        this.f17427r = tL_error;
        this.f17422b = z10;
        this.f17423c = j3;
        this.d = i10;
        this.f17428s = messageObject;
        this.f17424e = j10;
    }
}
