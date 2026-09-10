package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f15546a = 0;
    public final boolean f15547b;
    public final long f15548c;
    public final int d;
    public final long e;
    public final Object f15549f;
    public final Object h;
    public final Object f15550n;
    public final Object f15551r;
    public final Object f15552s;

    public jg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15549f = messagesStorage;
        this.f15548c = j3;
        this.f15547b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15550n = str2;
        this.f15551r = str3;
        this.f15552s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15546a) {
            case 0:
                ((MessagesStorage) this.f15549f).lambda$updateUnreadReactionsCountInternal$261(this.f15548c, this.f15547b, (String) this.h, this.e, this.d, (String) this.f15550n, (String) this.f15551r, (String) this.f15552s);
                return;
            default:
                xh.v5 v5Var = (xh.v5) this.f15549f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15550n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15551r;
                boolean z10 = this.f15547b;
                long j3 = this.f15548c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15552s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new xh.a5(v5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(v5Var.f46176a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f17295id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(v5Var.f46176a).sendRequest(tL_messages_getScheduledMessages, new qa(v5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public jg(xh.v5 v5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15549f = v5Var;
        this.h = tLObject;
        this.f15550n = runnable;
        this.f15551r = tL_error;
        this.f15547b = z10;
        this.f15548c = j3;
        this.d = i10;
        this.f15552s = messageObject;
        this.e = j10;
    }
}
