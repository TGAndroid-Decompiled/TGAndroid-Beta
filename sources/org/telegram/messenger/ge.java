package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o70;
import org.telegram.ui.xn;
public final class ge implements Runnable {
    public final int f16212a = 0;
    public final int f16213b;
    public final long f16214c;
    public final long d;
    public final Object e;
    public final Object f16215f;
    public final Object h;
    public final Object f16216n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16215f = updates_channeldifference;
        this.f16214c = j3;
        this.h = chat;
        this.f16216n = iVar;
        this.f16213b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16212a) {
            case 0:
                int i10 = this.f16213b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16215f, this.f16214c, (TLRPC.Chat) this.h, (a0.i) this.f16216n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f16216n;
                ((o70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16213b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16214c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(z0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(z0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((o70) this.f16215f).u();
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(o70 o70Var, int i10, long j3, long j10, o70 o70Var2, xn xnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = o70Var;
        this.f16213b = i10;
        this.f16214c = j3;
        this.d = j10;
        this.f16215f = o70Var2;
        this.h = xnVar;
        this.f16216n = d6Var;
    }
}
