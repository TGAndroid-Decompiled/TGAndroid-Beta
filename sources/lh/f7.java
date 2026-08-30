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
    public final int f12430a = 0;
    public final long f12431b;
    public final boolean f12432c;
    public final long d;
    public final int e;
    public final Object f12433f;
    public final Object h;
    public final Object f12434n;
    public final Object f12435r;
    public final Object f12436s;

    public f7(t7 t7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z4, long j10, int i10, MessageObject messageObject, long j11) {
        this.f12433f = t7Var;
        this.h = tLObject;
        this.f12434n = runnable;
        this.f12435r = tL_error;
        this.f12432c = z4;
        this.f12431b = j10;
        this.e = i10;
        this.f12436s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f12430a) {
            case 0:
                t7 t7Var = (t7) this.f12433f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f12434n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12435r;
                boolean z4 = this.f12432c;
                long j10 = this.f12431b;
                int i10 = this.e;
                MessageObject messageObject = (MessageObject) this.f12436s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new r6(t7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z4) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(t7Var.f13149a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f19284id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(t7Var.f13149a).sendRequest(tL_messages_getScheduledMessages, new v(t7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f12433f).lambda$updateUnreadReactionsCountInternal$261(this.f12431b, this.f12432c, (String) this.h, this.d, this.e, (String) this.f12434n, (String) this.f12435r, (String) this.f12436s);
                return;
        }
    }

    public f7(MessagesStorage messagesStorage, long j10, boolean z4, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f12433f = messagesStorage;
        this.f12431b = j10;
        this.f12432c = z4;
        this.h = str;
        this.d = j11;
        this.e = i10;
        this.f12434n = str2;
        this.f12435r = str3;
        this.f12436s = str4;
    }
}
