package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Runnable {
    public final int f17160a;
    public final long f17161b;
    public final int f17162c;
    public final long d;
    public final Object e;
    public final Object f17163f;

    public o9(int i10, long j3, long j10, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2) {
        this.f17160a = 3;
        this.f17162c = i10;
        this.f17161b = j3;
        this.d = j10;
        this.e = f1Var;
        this.f17163f = f1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17160a) {
            case 0:
                int i11 = this.f17162c;
                ((MediaDataController) this.e).lambda$loadBotInfo$199(this.f17161b, this.d, (Utilities.Callback) this.f17163f, i11);
                return;
            case 1:
                int i12 = this.f17162c;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$67(this.f17161b, (TLRPC.TL_messages_chatFull) this.f17163f, i12, j3);
                return;
            case 2:
                int i13 = this.f17162c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f17161b, this.d, (TLMethod) this.f17163f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.e;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f17163f;
                int i14 = this.f17162c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f17161b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    f1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19475x6, false);
                    f1Var2.setVisibility(8);
                } else {
                    f1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false);
                    f1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
                        f1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        f1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                f1Var.c(i10, i10);
                f1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
                return;
        }
    }

    public o9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f17160a = i11;
        this.e = baseController;
        this.f17161b = j3;
        this.d = j10;
        this.f17163f = obj;
        this.f17162c = i10;
    }

    public o9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f17160a = 1;
        this.e = messagesController;
        this.f17161b = j3;
        this.f17163f = tL_messages_chatFull;
        this.f17162c = i10;
        this.d = j10;
    }
}
