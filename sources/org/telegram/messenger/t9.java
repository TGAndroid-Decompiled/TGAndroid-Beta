package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class t9 implements Runnable {
    public final int f20080a;
    public final long f20081b;
    public final int f20082c;
    public final long d;
    public final Object f20083e;
    public final Object f20084f;

    public t9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f20080a = 3;
        this.f20082c = i10;
        this.f20081b = j10;
        this.d = j11;
        this.f20083e = g1Var;
        this.f20084f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f20080a) {
            case 0:
                int i11 = this.f20082c;
                ((MediaDataController) this.f20083e).lambda$loadBotInfo$199(this.f20081b, this.d, (Utilities.Callback) this.f20084f, i11);
                return;
            case 1:
                int i12 = this.f20082c;
                long j10 = this.d;
                ((MessagesController) this.f20083e).lambda$loadFullChat$67(this.f20081b, (TLRPC.TL_messages_chatFull) this.f20084f, i12, j10);
                return;
            case 2:
                int i13 = this.f20082c;
                ((MessagesStorage) this.f20083e).lambda$loadPendingTasks$20(this.f20081b, this.d, (TLMethod) this.f20084f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f20083e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f20084f;
                int i14 = this.f20082c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f20081b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22017x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                g1Var.c(i10, i10);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
                return;
        }
    }

    public t9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f20080a = i11;
        this.f20083e = baseController;
        this.f20081b = j10;
        this.d = j11;
        this.f20084f = obj;
        this.f20082c = i10;
    }

    public t9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f20080a = 1;
        this.f20083e = messagesController;
        this.f20081b = j10;
        this.f20084f = tL_messages_chatFull;
        this.f20082c = i10;
        this.d = j11;
    }
}
