package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o80;
public final class dg implements Runnable {
    public final int f16787a = 0;
    public final boolean f16788b;
    public final long f16789c;
    public final int d;
    public final long e;
    public final Object f16790f;
    public final Object h;
    public final Object f16791n;
    public final Object f16792r;
    public final Object f16793s;

    public dg(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f16790f = messagesStorage;
        this.f16789c = j10;
        this.f16788b = z10;
        this.h = str;
        this.e = j11;
        this.d = i10;
        this.f16791n = str2;
        this.f16792r = str3;
        this.f16793s = str4;
    }

    @Override
    public final void run() {
        switch (this.f16787a) {
            case 0:
                ((MessagesStorage) this.f16790f).lambda$updateUnreadReactionsCountInternal$261(this.f16789c, this.f16788b, (String) this.h, this.e, this.d, (String) this.f16791n, (String) this.f16792r, (String) this.f16793s);
                return;
            default:
                zh.n5 n5Var = (zh.n5) this.f16790f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f16791n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16792r;
                boolean z10 = this.f16788b;
                long j10 = this.f16789c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f16793s;
                long j11 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.u4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f50865a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f19016id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f50865a).sendRequest(tL_messages_getScheduledMessages, new o80(n5Var, messageObject, j11, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public dg(zh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f16790f = n5Var;
        this.h = tLObject;
        this.f16791n = runnable;
        this.f16792r = tL_error;
        this.f16788b = z10;
        this.f16789c = j10;
        this.d = i10;
        this.f16793s = messageObject;
        this.e = j11;
    }
}
