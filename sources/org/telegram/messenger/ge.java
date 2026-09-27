package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.xn;
public final class ge implements Runnable {
    public final int f16467a = 0;
    public final int f16468b;
    public final long f16469c;
    public final long d;
    public final Object e;
    public final Object f16470f;
    public final Object h;
    public final Object f16471n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16470f = updates_channeldifference;
        this.f16469c = j3;
        this.h = chat;
        this.f16471n = iVar;
        this.f16468b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16467a) {
            case 0:
                int i10 = this.f16468b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16470f, this.f16469c, (TLRPC.Chat) this.h, (a0.i) this.f16471n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f16471n;
                ((a80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16468b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16469c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(l0.h(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(l0.h(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((a80) this.f16470f).u();
                if (org.telegram.ui.Components.xc.a(o2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, o2Var, e6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(a80 a80Var, int i10, long j3, long j10, a80 a80Var2, xn xnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = a80Var;
        this.f16468b = i10;
        this.f16469c = j3;
        this.d = j10;
        this.f16470f = a80Var2;
        this.h = xnVar;
        this.f16471n = e6Var;
    }
}
