package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zo;
public final class r9 implements Runnable {
    public final int f19470a;
    public final long f19471b;
    public final int f19472c;
    public final long d;
    public final Object e;
    public final Object f19473f;

    public r9(int i10, long j10, long j11, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f19470a = 3;
        this.f19472c = i10;
        this.f19471b = j10;
        this.d = j11;
        this.e = e1Var;
        this.f19473f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19470a) {
            case 0:
                int i11 = this.f19472c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f19471b, this.d, (Utilities.Callback) this.f19473f, i11);
                return;
            case 1:
                int i12 = this.f19472c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$66(this.f19471b, (TLRPC.TL_messages_chatFull) this.f19473f, i12, j10);
                return;
            case 2:
                int i13 = this.f19472c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f19471b, this.d, (TLMethod) this.f19473f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f19473f;
                int i14 = this.f19472c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f19471b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    e1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.k6.f21553x6;
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int i15 = org.telegram.ui.ActionBar.k6.f21421q7;
                    e1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        e1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        e1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = i15;
                }
                zo.c(e1Var, i10);
                return;
        }
    }

    public r9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f19470a = i11;
        this.e = baseController;
        this.f19471b = j10;
        this.d = j11;
        this.f19473f = obj;
        this.f19472c = i10;
    }

    public r9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f19470a = 1;
        this.e = messagesController;
        this.f19471b = j10;
        this.f19473f = tL_messages_chatFull;
        this.f19472c = i10;
        this.d = j11;
    }
}
