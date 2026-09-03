package lh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements Runnable {
    public final int f12414a = 0;
    public final long f12415b;
    public final boolean f12416c;
    public final long d;
    public final int e;
    public final Object f12417f;
    public final Object h;
    public final Object f12418n;
    public final Object f12419r;
    public final Object f12420s;

    public f7(t7 t7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z4, long j10, int i10, MessageObject messageObject, long j11) {
        this.f12417f = t7Var;
        this.h = tLObject;
        this.f12418n = runnable;
        this.f12419r = tL_error;
        this.f12416c = z4;
        this.f12415b = j10;
        this.e = i10;
        this.f12420s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f12414a) {
            case 0:
                t7 t7Var = (t7) this.f12417f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f12418n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12419r;
                boolean z4 = this.f12416c;
                long j10 = this.f12415b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f12420s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new r6(t7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z4) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t7Var.f13133a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f19259id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t7Var.f13133a).sendRequest(tL_messages_getScheduledMessages, new v(t7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f12417f).lambda$updateUnreadReactionsCountInternal$261(this.f12415b, this.f12416c, (String) this.h, this.d, this.e, (String) this.f12418n, (String) this.f12419r, (String) this.f12420s);
                return;
        }
    }

    public f7(MessagesStorage messagesStorage, long j10, boolean z4, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f12417f = messagesStorage;
        this.f12415b = j10;
        this.f12416c = z4;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f12418n = str2;
        this.f12419r = str3;
        this.f12420s = str4;
    }
}
