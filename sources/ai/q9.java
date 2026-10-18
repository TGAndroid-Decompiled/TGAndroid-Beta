package ai;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q9 implements Runnable {
    public final int f2074a = 0;
    public final long f2075b;
    public final boolean f2076c;
    public final long d;
    public final int e;
    public final Object f2077f;
    public final Object h;
    public final Object f2078n;
    public final Object f2079r;
    public final Object f2080s;

    public q9(ga gaVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f2077f = gaVar;
        this.h = tLObject;
        this.f2078n = runnable;
        this.f2079r = tL_error;
        this.f2076c = z10;
        this.f2075b = j10;
        this.e = i10;
        this.f2080s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f2074a) {
            case 0:
                ga gaVar = (ga) this.f2077f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f2078n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2079r;
                boolean z10 = this.f2076c;
                long j10 = this.f2075b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f2080s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new b9(gaVar, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(gaVar.f1352a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f20372id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(gaVar.f1352a).sendRequest(tL_messages_getScheduledMessages, new d0(gaVar, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f2077f).lambda$updateUnreadReactionsCountInternal$261(this.f2075b, this.f2076c, (String) this.h, this.d, this.e, (String) this.f2078n, (String) this.f2079r, (String) this.f2080s);
                return;
        }
    }

    public q9(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f2077f = messagesStorage;
        this.f2075b = j10;
        this.f2076c = z10;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f2078n = str2;
        this.f2079r = str3;
        this.f2080s = str4;
    }
}
