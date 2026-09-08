package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements Runnable {
    public final int f17292a = 0;
    public final boolean f17293b;
    public final long f17294c;
    public final int d;
    public final long f17295e;
    public final Object f17296f;
    public final Object h;
    public final Object f17297n;
    public final Object f17298r;
    public final Object f17299s;

    public bg(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17296f = messagesStorage;
        this.f17294c = j3;
        this.f17293b = z10;
        this.h = str;
        this.f17295e = j10;
        this.d = i10;
        this.f17297n = str2;
        this.f17298r = str3;
        this.f17299s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17292a) {
            case 0:
                ((MessagesStorage) this.f17296f).lambda$updateUnreadReactionsCountInternal$261(this.f17294c, this.f17293b, (String) this.h, this.f17295e, this.d, (String) this.f17297n, (String) this.f17298r, (String) this.f17299s);
                return;
            default:
                zh.s5 s5Var = (zh.s5) this.f17296f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17297n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17298r;
                boolean z10 = this.f17293b;
                long j3 = this.f17294c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17299s;
                long j10 = this.f17295e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.y4(s5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.f52597a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19996id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s5Var.f52597a).sendRequest(tL_messages_getScheduledMessages, new ja(s5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public bg(zh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17296f = s5Var;
        this.h = tLObject;
        this.f17297n = runnable;
        this.f17298r = tL_error;
        this.f17293b = z10;
        this.f17294c = j3;
        this.d = i10;
        this.f17299s = messageObject;
        this.f17295e = j10;
    }
}
