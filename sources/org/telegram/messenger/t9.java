package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
public final class t9 implements Runnable {
    public final int f21318a;
    public final long f21319b;
    public final int f21320c;
    public final long d;
    public final Object e;
    public final Object f21321f;

    public t9(int i10, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f21318a = 3;
        this.f21320c = i10;
        this.f21319b = j10;
        this.d = j11;
        this.e = g1Var;
        this.f21321f = g1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f21318a) {
            case 0:
                int i11 = this.f21320c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f21319b, this.d, (Utilities.Callback) this.f21321f, i11);
                return;
            case 1:
                int i12 = this.f21320c;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$66(this.f21319b, (TLRPC.TL_messages_chatFull) this.f21321f, i12, j10);
                return;
            case 2:
                int i13 = this.f21320c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f21319b, this.d, (TLMethod) this.f21321f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f21321f;
                int i14 = this.f21320c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j11 = this.f21319b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.j(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.y6.f23731x6;
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.j(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int i15 = org.telegram.ui.ActionBar.y6.f23598q7;
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

    public t9(BaseController baseController, long j10, long j11, Object obj, int i10, int i11) {
        this.f21318a = i11;
        this.e = baseController;
        this.f21319b = j10;
        this.d = j11;
        this.f21321f = obj;
        this.f21320c = i10;
    }

    public t9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f21318a = 1;
        this.e = messagesController;
        this.f21319b = j10;
        this.f21321f = tL_messages_chatFull;
        this.f21320c = i10;
        this.d = j11;
    }
}
