package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class q9 implements Runnable {
    public final int f18665a;
    public final long f18666b;
    public final int f18667c;
    public final long d;
    public final Object f18668e;
    public final Object f18669f;

    public q9(int i10, long j3, long j10, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f18665a = 3;
        this.f18667c = i10;
        this.f18666b = j3;
        this.d = j10;
        this.f18668e = e1Var;
        this.f18669f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18665a) {
            case 0:
                int i11 = this.f18667c;
                ((MediaDataController) this.f18668e).lambda$loadBotInfo$200(this.f18666b, this.d, (Utilities.Callback) this.f18669f, i11);
                return;
            case 1:
                int i12 = this.f18667c;
                long j3 = this.d;
                ((MessagesController) this.f18668e).lambda$loadFullChat$66(this.f18666b, (TLRPC.TL_messages_chatFull) this.f18669f, i12, j3);
                return;
            case 2:
                int i13 = this.f18667c;
                ((MessagesStorage) this.f18668e).lambda$loadPendingTasks$20(this.f18666b, this.d, (TLMethod) this.f18669f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f18668e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f18669f;
                int i14 = this.f18667c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f18666b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    e1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20930x6, false);
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false);
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

    public q9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f18665a = i11;
        this.f18668e = baseController;
        this.f18666b = j3;
        this.d = j10;
        this.f18669f = obj;
        this.f18667c = i10;
    }

    public q9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f18665a = 1;
        this.f18668e = messagesController;
        this.f18666b = j3;
        this.f18669f = tL_messages_chatFull;
        this.f18667c = i10;
        this.d = j10;
    }
}
