package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17215a = 0;
    public final boolean f17216b;
    public final long f17217c;
    public final int d;
    public final long f17218e;
    public final Object f17219f;
    public final Object h;
    public final Object f17220n;
    public final Object f17221r;
    public final Object f17222s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17219f = messagesStorage;
        this.f17217c = j3;
        this.f17216b = z10;
        this.h = str;
        this.f17218e = j10;
        this.d = i10;
        this.f17220n = str2;
        this.f17221r = str3;
        this.f17222s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17215a) {
            case 0:
                ((MessagesStorage) this.f17219f).lambda$updateUnreadReactionsCountInternal$261(this.f17217c, this.f17216b, (String) this.h, this.f17218e, this.d, (String) this.f17220n, (String) this.f17221r, (String) this.f17222s);
                return;
            default:
                zh.s5 s5Var = (zh.s5) this.f17219f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17220n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17221r;
                boolean z10 = this.f17216b;
                long j3 = this.f17217c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17222s;
                long j10 = this.f17218e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.y4(s5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.f52598a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19996id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s5Var.f52598a).sendRequest(tL_messages_getScheduledMessages, new ia(s5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(zh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17219f = s5Var;
        this.h = tLObject;
        this.f17220n = runnable;
        this.f17221r = tL_error;
        this.f17216b = z10;
        this.f17217c = j3;
        this.d = i10;
        this.f17222s = messageObject;
        this.f17218e = j10;
    }
}
