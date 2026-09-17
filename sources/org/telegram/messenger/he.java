package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.bo;
public final class he implements Runnable {
    public final int f16339a = 0;
    public final int f16340b;
    public final long f16341c;
    public final long d;
    public final Object e;
    public final Object f16342f;
    public final Object h;
    public final Object f16343n;

    public he(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16342f = updates_channeldifference;
        this.f16341c = j3;
        this.h = chat;
        this.f16343n = iVar;
        this.f16340b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16339a) {
            case 0:
                int i10 = this.f16340b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16342f, this.f16341c, (TLRPC.Chat) this.h, (a0.i) this.f16343n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f16343n;
                ((n70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16340b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16341c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(w1.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(w1.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((n70) this.f16342f).u();
                if (org.telegram.ui.Components.vc.a(o2Var)) {
                    org.telegram.ui.Components.vc.S(z10 ? 1 : 0, o2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public he(n70 n70Var, int i10, long j3, long j10, n70 n70Var2, bo boVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = n70Var;
        this.f16340b = i10;
        this.f16341c = j3;
        this.d = j10;
        this.f16342f = n70Var2;
        this.h = boVar;
        this.f16343n = f6Var;
    }
}
