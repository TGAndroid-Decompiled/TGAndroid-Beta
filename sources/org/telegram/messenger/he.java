package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.bo;
public final class he implements Runnable {
    public final int f16324a = 0;
    public final int f16325b;
    public final long f16326c;
    public final long d;
    public final Object e;
    public final Object f16327f;
    public final Object h;
    public final Object f16328n;

    public he(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16327f = updates_channeldifference;
        this.f16326c = j3;
        this.h = chat;
        this.f16328n = iVar;
        this.f16325b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16324a) {
            case 0:
                int i10 = this.f16325b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16327f, this.f16326c, (TLRPC.Chat) this.h, (a0.i) this.f16328n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f16328n;
                ((n70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16325b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16326c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(y0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(y0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((n70) this.f16327f).u();
                if (org.telegram.ui.Components.vc.a(n2Var)) {
                    org.telegram.ui.Components.vc.S(z10 ? 1 : 0, n2Var, e6Var).j();
                    return;
                }
                return;
        }
    }

    public he(n70 n70Var, int i10, long j3, long j10, n70 n70Var2, bo boVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = n70Var;
        this.f16325b = i10;
        this.f16326c = j3;
        this.d = j10;
        this.f16327f = n70Var2;
        this.h = boVar;
        this.f16328n = e6Var;
    }
}
