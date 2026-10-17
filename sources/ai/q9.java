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
    public final int f2070a = 0;
    public final long f2071b;
    public final boolean f2072c;
    public final long d;
    public final int e;
    public final Object f2073f;
    public final Object h;
    public final Object f2074n;
    public final Object f2075r;
    public final Object f2076s;

    public q9(fa faVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f2073f = faVar;
        this.h = tLObject;
        this.f2074n = runnable;
        this.f2075r = tL_error;
        this.f2072c = z10;
        this.f2071b = j10;
        this.e = i10;
        this.f2076s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f2070a) {
            case 0:
                fa faVar = (fa) this.f2073f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f2074n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2075r;
                boolean z10 = this.f2072c;
                long j10 = this.f2071b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f2076s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new b9(faVar, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(faVar.f1311a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f20372id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(faVar.f1311a).sendRequest(tL_messages_getScheduledMessages, new d0(faVar, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f2073f).lambda$updateUnreadReactionsCountInternal$261(this.f2071b, this.f2072c, (String) this.h, this.d, this.e, (String) this.f2074n, (String) this.f2075r, (String) this.f2076s);
                return;
        }
    }

    public q9(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f2073f = messagesStorage;
        this.f2071b = j10;
        this.f2072c = z10;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f2074n = str2;
        this.f2075r = str3;
        this.f2076s = str4;
    }
}
