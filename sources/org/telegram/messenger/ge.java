package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.wn;
public final class ge implements Runnable {
    public final int f16495a = 0;
    public final int f16496b;
    public final long f16497c;
    public final long d;
    public final Object e;
    public final Object f16498f;
    public final Object h;
    public final Object f16499n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16498f = updates_channeldifference;
        this.f16497c = j3;
        this.h = chat;
        this.f16499n = iVar;
        this.f16496b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16495a) {
            case 0:
                int i10 = this.f16496b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16498f, this.f16497c, (TLRPC.Chat) this.h, (a0.i) this.f16499n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f16499n;
                ((b80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16496b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16497c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(f0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(f0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((b80) this.f16498f).u();
                if (org.telegram.ui.Components.yc.a(m2Var)) {
                    org.telegram.ui.Components.yc.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(b80 b80Var, int i10, long j3, long j10, b80 b80Var2, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = b80Var;
        this.f16496b = i10;
        this.f16497c = j3;
        this.d = j10;
        this.f16498f = b80Var2;
        this.h = wnVar;
        this.f16499n = d6Var;
    }
}
