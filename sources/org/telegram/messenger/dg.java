package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
public final class dg implements Runnable {
    public final int f17090a = 0;
    public final boolean f17091b;
    public final long f17092c;
    public final int d;
    public final long e;
    public final Object f17093f;
    public final Object h;
    public final Object f17094n;
    public final Object f17095r;
    public final Object f17096s;

    public dg(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f17093f = messagesStorage;
        this.f17092c = j10;
        this.f17091b = z10;
        this.h = str;
        this.e = j11;
        this.d = i10;
        this.f17094n = str2;
        this.f17095r = str3;
        this.f17096s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17090a) {
            case 0:
                ((MessagesStorage) this.f17093f).lambda$updateUnreadReactionsCountInternal$261(this.f17092c, this.f17091b, (String) this.h, this.e, this.d, (String) this.f17094n, (String) this.f17095r, (String) this.f17096s);
                return;
            default:
                zh.n5 n5Var = (zh.n5) this.f17093f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17094n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17095r;
                boolean z10 = this.f17091b;
                long j10 = this.f17092c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17096s;
                long j11 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.u4(n5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(n5Var.f50864a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f19316id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(n5Var.f50864a).sendRequest(tL_messages_getScheduledMessages, new p80(n5Var, messageObject, j11, runnable));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public dg(zh.n5 n5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f17093f = n5Var;
        this.h = tLObject;
        this.f17094n = runnable;
        this.f17095r = tL_error;
        this.f17091b = z10;
        this.f17092c = j10;
        this.d = i10;
        this.f17096s = messageObject;
        this.e = j11;
    }
}
