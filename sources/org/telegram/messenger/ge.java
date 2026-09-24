package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y70;
import org.telegram.ui.wn;
public final class ge implements Runnable {
    public final int f16456a = 0;
    public final int f16457b;
    public final long f16458c;
    public final long d;
    public final Object e;
    public final Object f16459f;
    public final Object h;
    public final Object f16460n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16459f = updates_channeldifference;
        this.f16458c = j3;
        this.h = chat;
        this.f16460n = iVar;
        this.f16457b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16456a) {
            case 0:
                int i10 = this.f16457b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16459f, this.f16458c, (TLRPC.Chat) this.h, (a0.i) this.f16460n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f16460n;
                ((y70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16457b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16458c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(f0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(f0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((y70) this.f16459f).u();
                if (org.telegram.ui.Components.yc.a(m2Var)) {
                    org.telegram.ui.Components.yc.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(y70 y70Var, int i10, long j3, long j10, y70 y70Var2, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = y70Var;
        this.f16457b = i10;
        this.f16458c = j3;
        this.d = j10;
        this.f16459f = y70Var2;
        this.h = wnVar;
        this.f16460n = d6Var;
    }
}
