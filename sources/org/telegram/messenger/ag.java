package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final int f17188a = 0;
    public final boolean f17189b;
    public final long f17190c;
    public final int d;
    public final long f17191e;
    public final Object f17192f;
    public final Object h;
    public final Object f17193n;
    public final Object f17194r;
    public final Object f17195s;

    public ag(MessagesStorage messagesStorage, long j3, boolean z10, String str, long j10, int i10, String str2, String str3, String str4) {
        this.f17192f = messagesStorage;
        this.f17190c = j3;
        this.f17189b = z10;
        this.h = str;
        this.f17191e = j10;
        this.d = i10;
        this.f17193n = str2;
        this.f17194r = str3;
        this.f17195s = str4;
    }

    @Override
    public final void run() {
        switch (this.f17188a) {
            case 0:
                ((MessagesStorage) this.f17192f).lambda$updateUnreadReactionsCountInternal$261(this.f17190c, this.f17189b, (String) this.h, this.f17191e, this.d, (String) this.f17193n, (String) this.f17194r, (String) this.f17195s);
                return;
            default:
                zh.s5 s5Var = (zh.s5) this.f17192f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f17193n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17194r;
                boolean z10 = this.f17189b;
                long j3 = this.f17190c;
                int i10 = this.d;
                MessageObject messageObject = (MessageObject) this.f17195s;
                long j10 = this.f17191e;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new zh.y4(s5Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s5Var.f52566a).getInputPeer(j3);
                    tL_messages_getScheduledMessages.f19969id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s5Var.f52566a).sendRequest(tL_messages_getScheduledMessages, new ia(s5Var, messageObject, j10, runnable, 8));
                    return;
                } else {
                    runnable.run();
                    return;
                }
        }
    }

    public ag(zh.s5 s5Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j3, int i10, MessageObject messageObject, long j10) {
        this.f17192f = s5Var;
        this.h = tLObject;
        this.f17193n = runnable;
        this.f17194r = tL_error;
        this.f17189b = z10;
        this.f17190c = j3;
        this.d = i10;
        this.f17195s = messageObject;
        this.f17191e = j10;
    }
}
