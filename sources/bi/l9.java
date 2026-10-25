package bi;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Runnable {
    public final int f5034a = 0;
    public final long f5035b;
    public final boolean f5036c;
    public final long d;
    public final int e;
    public final Object f5037f;
    public final Object h;
    public final Object f5038n;
    public final Object f5039r;
    public final Object f5040s;

    public l9(ca caVar, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f5037f = caVar;
        this.h = tLObject;
        this.f5038n = runnable;
        this.f5039r = tL_error;
        this.f5036c = z10;
        this.f5035b = j10;
        this.e = i10;
        this.f5040s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f5034a) {
            case 0:
                ca caVar = (ca) this.f5037f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f5038n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f5039r;
                boolean z10 = this.f5036c;
                long j10 = this.f5035b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f5040s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new x8(caVar, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(caVar.f4441a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f22127id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(caVar.f4441a).sendRequest(tL_messages_getScheduledMessages, new e0(caVar, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f5037f).lambda$updateUnreadReactionsCountInternal$264(this.f5035b, this.f5036c, (String) this.h, this.d, this.e, (String) this.f5038n, (String) this.f5039r, (String) this.f5040s);
                return;
        }
    }

    public l9(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f5037f = messagesStorage;
        this.f5035b = j10;
        this.f5036c = z10;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f5038n = str2;
        this.f5039r = str3;
        this.f5040s = str4;
    }
}
