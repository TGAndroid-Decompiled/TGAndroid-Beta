package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
import org.telegram.ui.wn;
public final class ge implements Runnable {
    public final int f16471a = 0;
    public final int f16472b;
    public final long f16473c;
    public final long d;
    public final Object e;
    public final Object f16474f;
    public final Object h;
    public final Object f16475n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16474f = updates_channeldifference;
        this.f16473c = j3;
        this.h = chat;
        this.f16475n = iVar;
        this.f16472b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16471a) {
            case 0:
                int i10 = this.f16472b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16474f, this.f16473c, (TLRPC.Chat) this.h, (a0.i) this.f16475n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f16475n;
                ((z70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16472b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16473c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(f0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(f0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((z70) this.f16474f).u();
                if (org.telegram.ui.Components.xc.a(m2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(z70 z70Var, int i10, long j3, long j10, z70 z70Var2, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = z70Var;
        this.f16472b = i10;
        this.f16473c = j3;
        this.d = j10;
        this.f16474f = z70Var2;
        this.h = wnVar;
        this.f16475n = d6Var;
    }
}
