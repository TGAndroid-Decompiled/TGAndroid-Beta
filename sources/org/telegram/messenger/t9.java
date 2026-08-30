package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class t9 implements Runnable {
    public final int f18481a;
    public final long f18482b;
    public final int f18483c;
    public final long d;
    public final Object e;
    public final Object f18484f;

    public t9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f18481a = 3;
        this.f18483c = i10;
        this.f18482b = j10;
        this.d = j11;
        this.e = g1Var;
        this.f18484f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18481a) {
            case 0:
                int i11 = this.f18483c;
                ((MediaDataController) this.e).lambda$loadBotInfo$199(this.f18482b, this.d, (Utilities.Callback) this.f18484f, i11);
                return;
            case 1:
                int i12 = this.f18483c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$67(this.f18482b, (TLRPC.TL_messages_chatFull) this.f18484f, i12, j10);
                return;
            case 2:
                int i13 = this.f18483c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f18482b, this.d, (TLMethod) this.f18484f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f18484f;
                int i14 = this.f18483c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f18482b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20263x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
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

    public t9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f18481a = i11;
        this.e = baseController;
        this.f18482b = j10;
        this.d = j11;
        this.f18484f = obj;
        this.f18483c = i10;
    }

    public t9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f18481a = 1;
        this.e = messagesController;
        this.f18482b = j10;
        this.f18484f = tL_messages_chatFull;
        this.f18483c = i10;
        this.d = j11;
    }
}
