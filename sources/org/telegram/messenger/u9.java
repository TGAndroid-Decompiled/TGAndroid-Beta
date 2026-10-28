package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
public final class u9 implements Runnable {
    public final int f21399a;
    public final long f21400b;
    public final int f21401c;
    public final long d;
    public final Object e;
    public final Object f21402f;

    public u9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f21399a = 3;
        this.f21401c = i10;
        this.f21400b = j10;
        this.d = j11;
        this.e = g1Var;
        this.f21402f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f21399a) {
            case 0:
                int i11 = this.f21401c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f21400b, this.d, (Utilities.Callback) this.f21402f, i11);
                return;
            case 1:
                int i12 = this.f21401c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$66(this.f21400b, (TLRPC.TL_messages_chatFull) this.f21402f, i12, j10);
                return;
            case 2:
                int i13 = this.f21401c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f21400b, this.d, (TLMethod) this.f21402f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f21402f;
                int i14 = this.f21401c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f21400b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.y6.f23732x6;
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int i15 = org.telegram.ui.ActionBar.y6.f23599q7;
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j11, j12)) {
                        g1Var2.j(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.j(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = i15;
                }
                bp.c(g1Var, i10);
                return;
        }
    }

    public u9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f21399a = i11;
        this.e = baseController;
        this.f21400b = j10;
        this.d = j11;
        this.f21402f = obj;
        this.f21401c = i10;
    }

    public u9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f21399a = 1;
        this.e = messagesController;
        this.f21400b = j10;
        this.f21402f = tL_messages_chatFull;
        this.f21401c = i10;
        this.d = j11;
    }
}
