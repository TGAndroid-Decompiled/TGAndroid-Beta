package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f16008a = 0;
    public final boolean f16009b;
    public final long f16010c;
    public final int d;
    public final long e;
    public final Object f16011f;
    public final Object h;
    public final Object f16012n;
    public final Object f16013r;
    public final Object f16014s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f16011f = messagesStorage;
        this.f16010c = j3;
        this.f16009b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f16012n = str2;
        this.f16013r = str3;
        this.f16014s = str4;
    }

    @Override
    public final void run() {
        switch (this.f16008a) {
            case 0:
                ((MessagesStorage) this.f16011f).lambda$updateUnreadReactionsCountInternal$261(this.f16010c, this.f16009b, (String) this.h, this.e, this.d, (String) this.f16012n, (String) this.f16013r, (String) this.f16014s);
                return;
            default:
                yh.u5 u5Var = (yh.u5) this.f16011f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f16012n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16013r;
                boolean z10 = this.f16009b;
                long j3 = this.f16010c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f16014s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.a5(u5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(u5Var.f48132a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18443id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(u5Var.f48132a).sendRequest(tL_messages_getScheduledMessages, new ja(u5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(yh.u5 u5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f16011f = u5Var;
        this.h = tLObject;
        this.f16012n = runnable;
        this.f16013r = tL_error;
        this.f16009b = z10;
        this.f16010c = j3;
        this.d = i10;
        this.f16014s = messageObject;
        this.e = j10;
    }
}
