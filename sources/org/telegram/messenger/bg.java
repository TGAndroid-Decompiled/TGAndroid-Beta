package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f15993a = 0;
    public final boolean f15994b;
    public final long f15995c;
    public final int d;
    public final long e;
    public final Object f15996f;
    public final Object h;
    public final Object f15997n;
    public final Object f15998r;
    public final Object f15999s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15996f = messagesStorage;
        this.f15995c = j3;
        this.f15994b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15997n = str2;
        this.f15998r = str3;
        this.f15999s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15993a) {
            case 0:
                ((MessagesStorage) this.f15996f).lambda$updateUnreadReactionsCountInternal$261(this.f15995c, this.f15994b, (String) this.h, this.e, this.d, (String) this.f15997n, (String) this.f15998r, (String) this.f15999s);
                return;
            default:
                yh.u5 u5Var = (yh.u5) this.f15996f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15997n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15998r;
                boolean z10 = this.f15994b;
                long j3 = this.f15995c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15999s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.a5(u5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(u5Var.f48111a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18428id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(u5Var.f48111a).sendRequest(tL_messages_getScheduledMessages, new ja(u5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(yh.u5 u5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15996f = u5Var;
        this.h = tLObject;
        this.f15997n = runnable;
        this.f15998r = tL_error;
        this.f15994b = z10;
        this.f15995c = j3;
        this.d = i10;
        this.f15999s = messageObject;
        this.e = j10;
    }
}
