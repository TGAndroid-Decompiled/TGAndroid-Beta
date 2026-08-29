package jh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e7 implements Runnable {
    public final int f12018a = 0;
    public final long f12019b;
    public final boolean f12020c;
    public final long d;
    public final int f12021e;
    public final Object f12022f;
    public final Object h;
    public final Object f12023n;
    public final Object f12024r;
    public final Object f12025s;

    public e7(s7 s7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f12022f = s7Var;
        this.h = tLObject;
        this.f12023n = runnable;
        this.f12024r = tL_error;
        this.f12020c = z10;
        this.f12019b = j10;
        this.f12021e = i10;
        this.f12025s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f12018a) {
            case 0:
                s7 s7Var = (s7) this.f12022f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f12023n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12024r;
                boolean z10 = this.f12020c;
                long j10 = this.f12019b;
                int i10 = this.f12021e;
                MessageObject messageObject = (MessageObject) this.f12025s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new q6(s7Var, tLObject, 5));
                    runnable.run();
                    return;
                } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && !z10) {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(s7Var.f12787a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f22492id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(s7Var.f12787a).sendRequest(tL_messages_getScheduledMessages, new v(s7Var, messageObject, j11, runnable, 2));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            default:
                ((MessagesStorage) this.f12022f).lambda$updateUnreadReactionsCountInternal$261(this.f12019b, this.f12020c, (String) this.h, this.d, this.f12021e, (String) this.f12023n, (String) this.f12024r, (String) this.f12025s);
                return;
        }
    }

    public e7(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f12022f = messagesStorage;
        this.f12019b = j10;
        this.f12020c = z10;
        this.h = str;
        this.d = j11;
        this.f12021e = i10;
        this.f12023n = str2;
        this.f12024r = str3;
        this.f12025s = str4;
    }
}
