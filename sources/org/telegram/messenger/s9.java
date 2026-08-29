package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class s9 implements Runnable {
    public final int f21525a;
    public final long f21526b;
    public final int f21527c;
    public final long d;
    public final Object f21528e;
    public final Object f21529f;

    public s9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f21525a = 3;
        this.f21527c = i10;
        this.f21526b = j10;
        this.d = j11;
        this.f21528e = g1Var;
        this.f21529f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f21525a) {
            case 0:
                int i11 = this.f21527c;
                ((MediaDataController) this.f21528e).lambda$loadBotInfo$199(this.f21526b, this.d, (Utilities.Callback) this.f21529f, i11);
                return;
            case 1:
                int i12 = this.f21527c;
                long j10 = this.d;
                ((MessagesController) this.f21528e).lambda$loadFullChat$67(this.f21526b, (TLRPC.TL_messages_chatFull) this.f21529f, i12, j10);
                return;
            case 2:
                int i13 = this.f21527c;
                ((MessagesStorage) this.f21528e).lambda$loadPendingTasks$20(this.f21526b, this.d, (TLMethod) this.f21529f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f21528e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f21529f;
                int i14 = this.f21527c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f21526b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23418x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                g1Var.c(i10, i10);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i10));
                return;
        }
    }

    public s9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f21525a = i11;
        this.f21528e = baseController;
        this.f21526b = j10;
        this.d = j11;
        this.f21529f = obj;
        this.f21527c = i10;
    }

    public s9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f21525a = 1;
        this.f21528e = messagesController;
        this.f21526b = j10;
        this.f21529f = tL_messages_chatFull;
        this.f21527c = i10;
        this.d = j11;
    }
}
