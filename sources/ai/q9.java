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
    public final int f2077a = 0;
    public final long f2078b;
    public final boolean f2079c;
    public final long d;
    public final int e;
    public final Object f2080f;
    public final Object h;
    public final Object f2081n;
    public final Object f2082r;
    public final Object f2083s;

    public q9(ha haVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f2080f = haVar;
        this.h = tLObject;
        this.f2081n = runnable;
        this.f2082r = tL_error;
        this.f2079c = z10;
        this.f2078b = j10;
        this.e = i10;
        this.f2083s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f2077a) {
            case 0:
                ha haVar = (ha) this.f2080f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f2081n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2082r;
                boolean z10 = this.f2079c;
                long j10 = this.f2078b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f2083s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new c9(haVar, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(haVar.f1413a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f20443id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(haVar.f1413a).sendRequest(tL_messages_getScheduledMessages, new d0(haVar, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f2080f).lambda$updateUnreadReactionsCountInternal$261(this.f2078b, this.f2079c, (String) this.h, this.d, this.e, (String) this.f2081n, (String) this.f2082r, (String) this.f2083s);
                return;
        }
    }

    public q9(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f2080f = messagesStorage;
        this.f2078b = j10;
        this.f2079c = z10;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f2081n = str2;
        this.f2082r = str3;
        this.f2083s = str4;
    }
}
