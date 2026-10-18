package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f19056a;
    public final long f19057b;
    public final int f19058c;
    public final long d;
    public final Object e;
    public final Object f19059f;

    public n9(int i10, long j10, long j11, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f19056a = 3;
        this.f19058c = i10;
        this.f19057b = j10;
        this.d = j11;
        this.e = e1Var;
        this.f19059f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19056a) {
            case 0:
                int i11 = this.f19058c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f19057b, this.d, (Utilities.Callback) this.f19059f, i11);
                return;
            case 1:
                int i12 = this.f19058c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$66(this.f19057b, (TLRPC.TL_messages_chatFull) this.f19059f, i12, j10);
                return;
            case 2:
                int i13 = this.f19058c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f19057b, this.d, (TLMethod) this.f19059f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f19059f;
                int i14 = this.f19058c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f19057b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    e1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21363x6, false);
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false);
                    e1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        e1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        e1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = x02;
                }
                e1Var.c(i10, i10);
                e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i10));
                return;
        }
    }

    public n9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f19056a = i11;
        this.e = baseController;
        this.f19057b = j10;
        this.d = j11;
        this.f19059f = obj;
        this.f19058c = i10;
    }

    public n9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f19056a = 1;
        this.e = messagesController;
        this.f19057b = j10;
        this.f19059f = tL_messages_chatFull;
        this.f19058c = i10;
        this.d = j11;
    }
}
