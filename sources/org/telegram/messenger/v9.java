package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class v9 implements Runnable {
    public final int f16576a;
    public final long f16577b;
    public final int f16578c;
    public final long d;
    public final Object e;
    public final Object f16579f;

    public v9(int i10, long j3, long j10, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f16576a = 3;
        this.f16578c = i10;
        this.f16577b = j3;
        this.d = j10;
        this.e = g1Var;
        this.f16579f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f16576a) {
            case 0:
                int i11 = this.f16578c;
                ((MediaDataController) this.e).lambda$loadBotInfo$199(this.f16577b, this.d, (Utilities.Callback) this.f16579f, i11);
                return;
            case 1:
                int i12 = this.f16578c;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$67(this.f16577b, (TLRPC.TL_messages_chatFull) this.f16579f, i12, j3);
                return;
            case 2:
                int i13 = this.f16578c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f16577b, this.d, (TLMethod) this.f16579f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f16579f;
                int i14 = this.f16578c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f16577b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18289x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                g1Var.c(i10, i10);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i10));
                return;
        }
    }

    public v9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f16576a = i11;
        this.e = baseController;
        this.f16577b = j3;
        this.d = j10;
        this.f16579f = obj;
        this.f16578c = i10;
    }

    public v9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f16576a = 1;
        this.e = messagesController;
        this.f16577b = j3;
        this.f16579f = tL_messages_chatFull;
        this.f16578c = i10;
        this.d = j10;
    }
}
