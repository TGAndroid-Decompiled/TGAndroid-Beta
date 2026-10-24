package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xo;
public final class s9 implements Runnable {
    public final int f19544a;
    public final long f19545b;
    public final int f19546c;
    public final long d;
    public final Object e;
    public final Object f19547f;

    public s9(int i10, long j10, long j11, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f19544a = 3;
        this.f19546c = i10;
        this.f19545b = j10;
        this.d = j11;
        this.e = e1Var;
        this.f19547f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19544a) {
            case 0:
                int i11 = this.f19546c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f19545b, this.d, (Utilities.Callback) this.f19547f, i11);
                return;
            case 1:
                int i12 = this.f19546c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$66(this.f19545b, (TLRPC.TL_messages_chatFull) this.f19547f, i12, j10);
                return;
            case 2:
                int i13 = this.f19546c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f19545b, this.d, (TLMethod) this.f19547f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f19547f;
                int i14 = this.f19546c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f19545b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    e1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.k6.f21554x6;
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int i15 = org.telegram.ui.ActionBar.k6.f21422q7;
                    e1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        e1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        e1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = i15;
                }
                xo.c(e1Var, i10);
                return;
        }
    }

    public s9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f19544a = i11;
        this.e = baseController;
        this.f19545b = j10;
        this.d = j11;
        this.f19547f = obj;
        this.f19546c = i10;
    }

    public s9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f19544a = 1;
        this.e = messagesController;
        this.f19545b = j10;
        this.f19547f = tL_messages_chatFull;
        this.f19546c = i10;
        this.d = j11;
    }
}
