package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f18608a;
    public final long f18609b;
    public final int f18610c;
    public final long d;
    public final Object f18611e;
    public final Object f18612f;

    public n9(int i10, long j3, long j10, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2) {
        this.f18608a = 3;
        this.f18610c = i10;
        this.f18609b = j3;
        this.d = j10;
        this.f18611e = f1Var;
        this.f18612f = f1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18608a) {
            case 0:
                int i11 = this.f18610c;
                ((MediaDataController) this.f18611e).lambda$loadBotInfo$200(this.f18609b, this.d, (Utilities.Callback) this.f18612f, i11);
                return;
            case 1:
                int i12 = this.f18610c;
                long j3 = this.d;
                ((MessagesController) this.f18611e).lambda$loadFullChat$66(this.f18609b, (TLRPC.TL_messages_chatFull) this.f18612f, i12, j3);
                return;
            case 2:
                int i13 = this.f18610c;
                ((MessagesStorage) this.f18611e).lambda$loadPendingTasks$20(this.f18609b, this.d, (TLMethod) this.f18612f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18611e;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f18612f;
                int i14 = this.f18610c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f18609b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    f1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21165x6, false);
                    f1Var2.setVisibility(8);
                } else {
                    f1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false);
                    f1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
                        f1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        f1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = x02;
                }
                f1Var.c(i10, i10);
                f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.m1(0.1f, i10));
                return;
        }
    }

    public n9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f18608a = i11;
        this.f18611e = baseController;
        this.f18609b = j3;
        this.d = j10;
        this.f18612f = obj;
        this.f18610c = i10;
    }

    public n9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f18608a = 1;
        this.f18611e = messagesController;
        this.f18609b = j3;
        this.f18612f = tL_messages_chatFull;
        this.f18610c = i10;
        this.d = j10;
    }
}
