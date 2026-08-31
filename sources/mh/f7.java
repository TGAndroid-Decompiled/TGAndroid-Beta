package mh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements Runnable {
    public final int f14042a = 0;
    public final long f14043b;
    public final boolean f14044c;
    public final long d;
    public final int f14045e;
    public final Object f14046f;
    public final Object h;
    public final Object f14047n;
    public final Object f14048r;
    public final Object f14049s;

    public f7(t7 t7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z4, long j10, int i10, MessageObject messageObject, long j11) {
        this.f14046f = t7Var;
        this.h = tLObject;
        this.f14047n = runnable;
        this.f14048r = tL_error;
        this.f14044c = z4;
        this.f14043b = j10;
        this.f14045e = i10;
        this.f14049s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f14042a) {
            case 0:
                t7 t7Var = (t7) this.f14046f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f14047n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f14048r;
                boolean z4 = this.f14044c;
                long j10 = this.f14043b;
                int i10 = this.f14045e;
                MessageObject messageObject = (MessageObject) this.f14049s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new r6(t7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z4) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t7Var.f14828a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f20943id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t7Var.f14828a).sendRequest(tL_messages_getScheduledMessages, new u(t7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f14046f).lambda$updateUnreadReactionsCountInternal$261(this.f14043b, this.f14044c, (String) this.h, this.d, this.f14045e, (String) this.f14047n, (String) this.f14048r, (String) this.f14049s);
                return;
        }
    }

    public f7(MessagesStorage messagesStorage, long j10, boolean z4, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f14046f = messagesStorage;
        this.f14043b = j10;
        this.f14044c = z4;
        this.h = str;
        this.d = j11;
        this.f14045e = i10;
        this.f14047n = str2;
        this.f14048r = str3;
        this.f14049s = str4;
    }
}
