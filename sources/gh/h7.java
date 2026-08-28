package gh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f8223a = 0;
    public final long f8224b;
    public final boolean f8225c;
    public final long d;
    public final int f8226e;
    public final Object f8227f;
    public final Object h;
    public final Object f8228n;
    public final Object f8229r;
    public final Object f8230s;

    public h7(v7 v7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i9, MessageObject messageObject, long j11) {
        this.f8227f = v7Var;
        this.h = tLObject;
        this.f8228n = runnable;
        this.f8229r = tL_error;
        this.f8225c = z10;
        this.f8224b = j10;
        this.f8226e = i9;
        this.f8230s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f8223a) {
            case 0:
                v7 v7Var = (v7) this.f8227f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f8228n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f8229r;
                boolean z10 = this.f8225c;
                long j10 = this.f8224b;
                int i9 = this.f8226e;
                MessageObject messageObject = (MessageObject) this.f8230s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new t6(v7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(v7Var.f9045a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f22480id.add(Integer.valueOf(i9));
                    ConnectionsManager.getInstance(v7Var.f9045a).sendRequest(tL_messages_getScheduledMessages, new w(v7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f8227f).lambda$updateUnreadReactionsCountInternal$261(this.f8224b, this.f8225c, (String) this.h, this.d, this.f8226e, (String) this.f8228n, (String) this.f8229r, (String) this.f8230s);
                return;
        }
    }

    public h7(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i9, String str2, String str3, String str4) {
        this.f8227f = messagesStorage;
        this.f8224b = j10;
        this.f8225c = z10;
        this.h = str;
        this.d = j11;
        this.f8226e = i9;
        this.f8228n = str2;
        this.f8229r = str3;
        this.f8230s = str4;
    }
}
