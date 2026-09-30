package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f15934a = 0;
    public final boolean f15935b;
    public final long f15936c;
    public final int d;
    public final long e;
    public final Object f15937f;
    public final Object h;
    public final Object f15938n;
    public final Object f15939r;
    public final Object f15940s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f15937f = messagesStorage;
        this.f15936c = j3;
        this.f15935b = z10;
        this.h = str;
        this.e = j10;
        this.d = i10;
        this.f15938n = str2;
        this.f15939r = str3;
        this.f15940s = str4;
    }

    @Override
    public final void run() {
        switch (this.f15934a) {
            case 0:
                ((MessagesStorage) this.f15937f).lambda$updateUnreadReactionsCountInternal$261(this.f15936c, this.f15935b, (String) this.h, this.e, this.d, (String) this.f15938n, (String) this.f15939r, (String) this.f15940s);
                return;
            default:
                yh.s5 s5Var = (yh.s5) this.f15937f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f15938n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15939r;
                boolean z10 = this.f15935b;
                long j3 = this.f15936c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f15940s;
                long j10 = this.e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new yh.z4(s5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.f48119a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f18452id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s5Var.f48119a).sendRequest(tL_messages_getScheduledMessages, new ja(s5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(yh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f15937f = s5Var;
        this.h = tLObject;
        this.f15938n = runnable;
        this.f15939r = tL_error;
        this.f15935b = z10;
        this.f15936c = j3;
        this.d = i10;
        this.f15940s = messageObject;
        this.e = j10;
    }
}
