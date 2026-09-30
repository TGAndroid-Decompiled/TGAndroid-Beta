package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f17102a;
    public final long f17103b;
    public final int f17104c;
    public final long d;
    public final Object e;
    public final Object f17105f;

    public n9(int i10, long j3, long j10, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2) {
        this.f17102a = 3;
        this.f17104c = i10;
        this.f17103b = j3;
        this.d = j10;
        this.e = e1Var;
        this.f17105f = e1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17102a) {
            case 0:
                int i11 = this.f17104c;
                ((MediaDataController) this.e).lambda$loadBotInfo$200(this.f17103b, this.d, (Utilities.Callback) this.f17105f, i11);
                return;
            case 1:
                int i12 = this.f17104c;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$loadFullChat$67(this.f17103b, (TLRPC.TL_messages_chatFull) this.f17105f, i12, j3);
                return;
            case 2:
                int i13 = this.f17104c;
                ((MessagesStorage) this.e).lambda$loadPendingTasks$20(this.f17103b, this.d, (TLMethod) this.f17105f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.f17105f;
                int i14 = this.f17104c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f17103b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    e1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19442x6, false);
                    e1Var2.setVisibility(8);
                } else {
                    e1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false);
                    e1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
                        e1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        e1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                e1Var.c(i10, i10);
                e1Var.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.1f, i10));
                return;
        }
    }

    public n9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f17102a = i11;
        this.e = baseController;
        this.f17103b = j3;
        this.d = j10;
        this.f17105f = obj;
        this.f17104c = i10;
    }

    public n9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f17102a = 1;
        this.e = messagesController;
        this.f17103b = j3;
        this.f17105f = tL_messages_chatFull;
        this.f17104c = i10;
        this.d = j10;
    }
}
