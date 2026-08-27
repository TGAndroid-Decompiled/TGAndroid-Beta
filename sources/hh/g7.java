package hh;

import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class g7 implements Runnable {

    public final int f9330a = 0;

    public final long f9331b;

    public final boolean f9332c;
    public final long d;

    public final int f9333e;

    public final Object f9334f;
    public final Object h;

    public final Object f9335n;

    public final Object f9336r;

    public final Object f9337s;

    public g7(u7 u7Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i10, MessageObject messageObject, long j11) {
        this.f9334f = u7Var;
        this.h = tLObject;
        this.f9335n = runnable;
        this.f9336r = tL_error;
        this.f9332c = z10;
        this.f9331b = j10;
        this.f9333e = i10;
        this.f9337s = messageObject;
        this.d = j11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f9330a) {
            case 0:
                u7 u7Var = (u7) this.f9334f;
                TLObject tLObject = (TLObject) this.h;
                Runnable runnable = (Runnable) this.f9335n;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9336r;
                boolean z10 = this.f9332c;
                long j10 = this.f9331b;
                int i10 = this.f9333e;
                MessageObject messageObject = (MessageObject) this.f9337s;
                long j11 = this.d;
                if (tLObject instanceof TLRPC.Updates) {
                    Utilities.stageQueue.postRunnable(new s6(u7Var, tLObject, 5));
                    runnable.run();
                } else if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || z10) {
                    runnable.run();
                } else {
                    TLRPC.TL_messages_getScheduledMessages tL_messages_getScheduledMessages = new TLRPC.TL_messages_getScheduledMessages();
                    tL_messages_getScheduledMessages.peer = MessagesController.getInstance(u7Var.f10151a).getInputPeer(j10);
                    tL_messages_getScheduledMessages.f22480id.add(Integer.valueOf(i10));
                    ConnectionsManager.getInstance(u7Var.f10151a).sendRequest(tL_messages_getScheduledMessages, new w(u7Var, messageObject, j11, runnable, 2));
                }
                break;
            default:
                ((MessagesStorage) this.f9334f).lambda$updateUnreadReactionsCountInternal$261(this.f9331b, this.f9332c, (String) this.h, this.d, this.f9333e, (String) this.f9335n, (String) this.f9336r, (String) this.f9337s);
                break;
        }
    }

    public g7(MessagesStorage messagesStorage, long j10, boolean z10, String str, long j11, int i10, String str2, String str3, String str4) {
        this.f9334f = messagesStorage;
        this.f9331b = j10;
        this.f9332c = z10;
        this.h = str;
        this.d = j11;
        this.f9333e = i10;
        this.f9335n = str2;
        this.f9336r = str3;
        this.f9337s = str4;
    }
}
