package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f15665a = 0;
    public final boolean f15666b;
    public final long f15667c;
    public final int d;
    public final long e;
    public final Object f15668f;
    public final Object h;
    public final Object f15669n;
    public final Object f15670r;
    public final Object f15671s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15668f = messagesStorage;
        this.f15667c = j3;
        this.f15666b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15669n = str2;
        this.f15670r = str3;
        this.f15671s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15665a) {
            case 0:
                ((MessagesStorage) this.f15668f).lambda$updateUnreadReactionsCountInternal$261(this.f15667c, this.f15666b, (String) this.h, this.e, this.d, (String) this.f15669n, (String) this.f15670r, (String) this.f15671s);
                return;
            default:
                yh.t5 t5Var = (yh.t5) this.f15668f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15669n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15670r;
                boolean z10 = this.f15666b;
                long j3 = this.f15667c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15671s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.a5(t5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t5Var.f47732a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18183id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t5Var.f47732a).sendRequest(tL_messages_getScheduledMessages, new ja(t5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.t5 t5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15668f = t5Var;
        this.h = tLObject;
        this.f15669n = runnable;
        this.f15670r = tL_error;
        this.f15666b = z10;
        this.f15667c = j3;
        this.d = i10;
        this.f15671s = messageObject;
        this.e = j10;
    }
}
