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
    public final int f14044a = 0;
    public final long f14045b;
    public final boolean f14046c;
    public final long d;
    public final int f14047e;
    public final Object f14048f;
    public final Object h;
    public final Object f14049n;
    public final Object f14050r;
    public final Object f14051s;

    public f7(t7 t7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z4, long j10, int i10, MessageObject messageObject, long j11) {
        this.f14048f = t7Var;
        this.h = tLObject;
        this.f14049n = runnable;
        this.f14050r = tL_error;
        this.f14046c = z4;
        this.f14045b = j10;
        this.f14047e = i10;
        this.f14051s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f14044a) {
            case 0:
                t7 t7Var = (t7) this.f14048f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f14049n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f14050r;
                boolean z4 = this.f14046c;
                long j10 = this.f14045b;
                int i10 = this.f14047e;
                MessageObject messageObject = (MessageObject) this.f14051s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new r6(t7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z4) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t7Var.f14830a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f20945id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t7Var.f14830a).sendRequest(tL_messages_getScheduledMessages, new u(t7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f14048f).lambda$updateUnreadReactionsCountInternal$261(this.f14045b, this.f14046c, (String) this.h, this.d, this.f14047e, (String) this.f14049n, (String) this.f14050r, (String) this.f14051s);
                return;
        }
    }

    public f7(MessagesStorage messagesStorage, long j10, boolean z4, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f14048f = messagesStorage;
        this.f14045b = j10;
        this.f14046c = z4;
        this.h = str;
        this.d = j11;
        this.f14047e = i10;
        this.f14049n = str2;
        this.f14050r = str3;
        this.f14051s = str4;
    }
}
