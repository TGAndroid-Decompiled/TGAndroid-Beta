package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Runnable {
    public final int f18649a;
    public final long f18650b;
    public final int f18651c;
    public final long d;
    public final Object f18652e;
    public final Object f18653f;

    public n9(int i10, long j3, long j10, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2) {
        this.f18649a = 3;
        this.f18651c = i10;
        this.f18650b = j3;
        this.d = j10;
        this.f18652e = f1Var;
        this.f18653f = f1Var2;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18649a) {
            case 0:
                int i11 = this.f18651c;
                ((MediaDataController) this.f18652e).lambda$loadBotInfo$200(this.f18650b, this.d, (Utilities.Callback) this.f18653f, i11);
                return;
            case 1:
                int i12 = this.f18651c;
                long j3 = this.d;
                ((MessagesController) this.f18652e).lambda$loadFullChat$67(this.f18650b, (TLRPC.TL_messages_chatFull) this.f18653f, i12, j3);
                return;
            case 2:
                int i13 = this.f18651c;
                ((MessagesStorage) this.f18652e).lambda$loadPendingTasks$20(this.f18650b, this.d, (TLMethod) this.f18653f, i13);
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f18652e;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.f18653f;
                int i14 = this.f18651c;
                MessagesController messagesController = MessagesController.getInstance(i14);
                long j10 = this.f18650b;
                long j11 = this.d;
                if (messagesController.isDialogMuted(j10, j11)) {
                    f1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i10 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21197x6, false);
                    f1Var2.setVisibility(8);
                } else {
                    f1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false);
                    f1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i14).isDialogNotificationsSoundEnabled(j10, j11)) {
                        f1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        f1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i10 = w02;
                }
                f1Var.c(i10, i10);
                f1Var.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.1f, i10));
                return;
        }
    }

    public n9(BaseController baseController, long j3, long j10, Object obj, int i10, int i11) {
        this.f18649a = i11;
        this.f18652e = baseController;
        this.f18650b = j3;
        this.d = j10;
        this.f18653f = obj;
        this.f18651c = i10;
    }

    public n9(MessagesController messagesController, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j10) {
        this.f18649a = 1;
        this.f18652e = messagesController;
        this.f18650b = j3;
        this.f18653f = tL_messages_chatFull;
        this.f18651c = i10;
        this.d = j10;
    }
}
