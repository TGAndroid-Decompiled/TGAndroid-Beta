package org.telegram.messenger;

import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;

public final class q9 implements Runnable {

    public final int f21336a;

    public final long f21337b;

    public final int f21338c;
    public final long d;

    public final Object f21339e;

    public final Object f21340f;

    public q9(int i10, long j10, long j11, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2) {
        this.f21336a = 3;
        this.f21338c = i10;
        this.f21337b = j10;
        this.d = j11;
        this.f21339e = f1Var;
        this.f21340f = f1Var2;
    }

    @Override
    public final void run() {
        int iW0;
        switch (this.f21336a) {
            case 0:
                ((MediaDataController) this.f21339e).lambda$loadBotInfo$199(this.f21337b, this.d, (Utilities.Callback) this.f21340f, this.f21338c);
                break;
            case 1:
                ((MessagesController) this.f21339e).lambda$loadFullChat$67(this.f21337b, (TLRPC.TL_messages_chatFull) this.f21340f, this.f21338c, this.d);
                break;
            case 2:
                ((MessagesStorage) this.f21339e).lambda$loadPendingTasks$20(this.f21337b, this.d, (TLMethod) this.f21340f, this.f21338c);
                break;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f21339e;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f21340f;
                int i10 = this.f21338c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = this.f21337b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    f1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23406x6, false);
                    f1Var2.setVisibility(8);
                } else {
                    f1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false);
                    f1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i10).isDialogNotificationsSoundEnabled(j10, j11)) {
                        f1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        f1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    iW0 = iW1;
                }
                f1Var.c(iW0, iW0);
                f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iW0));
                break;
        }
    }

    public q9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f21336a = i11;
        this.f21339e = baseController;
        this.f21337b = j10;
        this.d = j11;
        this.f21340f = obj;
        this.f21338c = i10;
    }

    public q9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f21336a = 1;
        this.f21339e = messagesController;
        this.f21337b = j10;
        this.f21340f = tL_messages_chatFull;
        this.f21338c = i10;
        this.d = j11;
    }
}
