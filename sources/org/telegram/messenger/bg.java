package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f15957a = 0;
    public final boolean f15958b;
    public final long f15959c;
    public final int d;
    public final long e;
    public final Object f15960f;
    public final Object h;
    public final Object f15961n;
    public final Object f15962r;
    public final Object f15963s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15960f = messagesStorage;
        this.f15959c = j3;
        this.f15958b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15961n = str2;
        this.f15962r = str3;
        this.f15963s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15957a) {
            case 0:
                ((MessagesStorage) this.f15960f).lambda$updateUnreadReactionsCountInternal$261(this.f15959c, this.f15958b, (String) this.h, this.e, this.d, (String) this.f15961n, (String) this.f15962r, (String) this.f15963s);
                return;
            default:
                yh.t5 t5Var = (yh.t5) this.f15960f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15961n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15962r;
                boolean z10 = this.f15958b;
                long j3 = this.f15959c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15963s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.a5(t5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t5Var.f48042a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18396id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t5Var.f48042a).sendRequest(tL_messages_getScheduledMessages, new ja(t5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(yh.t5 t5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15960f = t5Var;
        this.h = tLObject;
        this.f15961n = runnable;
        this.f15962r = tL_error;
        this.f15958b = z10;
        this.f15959c = j3;
        this.d = i10;
        this.f15963s = messageObject;
        this.e = j10;
    }
}
