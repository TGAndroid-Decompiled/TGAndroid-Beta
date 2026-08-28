package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Runnable {
    public final int f20952a;
    public final long f20953b;
    public final int f20954c;
    public final long d;
    public final Object f20955e;
    public final Object f20956f;

    public m9(int i9, long j10, long j11, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2) {
        this.f20952a = 3;
        this.f20954c = i9;
        this.f20953b = j10;
        this.d = j11;
        this.f20955e = g1Var;
        this.f20956f = g1Var2;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f20952a) {
            case 0:
                int i10 = this.f20954c;
                ((MediaDataController) this.f20955e).lambda$loadBotInfo$199(this.f20953b, this.d, (Utilities.Callback) this.f20956f, i10);
                return;
            case 1:
                int i11 = this.f20954c;
                long j10 = this.d;
                ((MessagesController) this.f20955e).lambda$loadFullChat$67(this.f20953b, (TLRPC.TL_messages_chatFull) this.f20956f, i11, j10);
                return;
            case 2:
                int i12 = this.f20954c;
                ((MessagesStorage) this.f20955e).lambda$loadPendingTasks$20(this.f20953b, this.d, (TLMethod) this.f20956f, i12);
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f20955e;
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f20956f;
                int i13 = this.f20954c;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j11 = this.f20953b;
                long j12 = this.d;
                if (messagesController.isDialogMuted(j11, j12)) {
                    g1Var.g(LocaleController.getString(R.string.UnmuteNotifications), R.drawable.msg_unmute, null);
                    i9 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23351x6, false);
                    g1Var2.setVisibility(8);
                } else {
                    g1Var.g(LocaleController.getString(R.string.MuteNotifications), R.drawable.msg_mute, null);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false);
                    g1Var2.setVisibility(0);
                    if (MessagesController.getInstance(i13).isDialogNotificationsSoundEnabled(j11, j12)) {
                        g1Var2.g(LocaleController.getString(R.string.SoundOff), R.drawable.msg_tone_off, null);
                    } else {
                        g1Var2.g(LocaleController.getString(R.string.SoundOn), R.drawable.msg_tone_on, null);
                    }
                    i9 = w02;
                }
                g1Var.c(i9, i9);
                g1Var.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
                return;
        }
    }

    public m9(BaseController baseController, long j10, long j11, Object obj, int i9, int i10) {
        this.f20952a = i10;
        this.f20955e = baseController;
        this.f20953b = j10;
        this.d = j11;
        this.f20956f = obj;
        this.f20954c = i9;
    }

    public m9(MessagesController messagesController, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i9, long j11) {
        this.f20952a = 1;
        this.f20955e = messagesController;
        this.f20953b = j10;
        this.f20956f = tL_messages_chatFull;
        this.f20954c = i9;
        this.d = j11;
    }
}
