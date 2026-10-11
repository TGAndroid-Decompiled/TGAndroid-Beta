package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f18616a;
    public final long f18617b;
    public final int f18618c;
    public final long d;
    public final Object f18619e;
    public final Object f18620f;

    public n9(int i10, long j3, long j10, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f18616a = 3;
        this.f18618c = i10;
        this.f18617b = j3;
        this.d = j10;
        this.f18619e = e1Var;
        this.f18620f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18616a) {
            case 0:
                int i11 = this.f18618c;
                ((MediaDataController) this.f18619e).lambda$loadBotInfo$200(this.f18617b, this.d, (Utilities.Callback) this.f18620f, i11);
                return;
            case 1:
                int i12 = this.f18618c;
                long j3 = this.d;
                ((MessagesController) this.f18619e).lambda$loadFullChat$66(this.f18617b, (TLRPC.TL_messages_chatFull) this.f18620f, i12, j3);
                return;
            case 2:
                int i13 = this.f18618c;
                ((MessagesStorage) this.f18619e).lambda$loadPendingTasks$20(this.f18617b, this.d, (TLMethod) this.f18620f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f18619e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f18620f;
                int i14 = this.f18618c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f18617b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    e1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21155x6, false);
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false);
                    e1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
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

    public n9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f18616a = i11;
        this.f18619e = baseController;
        this.f18617b = j3;
        this.d = j10;
        this.f18620f = obj;
        this.f18618c = i10;
    }

    public n9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f18616a = 1;
        this.f18619e = messagesController;
        this.f18617b = j3;
        this.f18620f = tL_messages_chatFull;
        this.f18618c = i10;
        this.d = j10;
    }
}
