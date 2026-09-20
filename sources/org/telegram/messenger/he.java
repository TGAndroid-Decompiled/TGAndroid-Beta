package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v70;
import org.telegram.ui.zn;
public final class he implements Runnable {
    public final int f16555a = 0;
    public final int f16556b;
    public final long f16557c;
    public final long d;
    public final Object e;
    public final Object f16558f;
    public final Object h;
    public final Object f16559n;

    public he(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16558f = updates_channeldifference;
        this.f16557c = j3;
        this.h = chat;
        this.f16559n = iVar;
        this.f16556b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16555a) {
            case 0:
                int i10 = this.f16556b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16558f, this.f16557c, (TLRPC.Chat) this.h, (a0.i) this.f16559n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f16559n;
                ((v70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16556b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16557c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(l0.h(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(l0.h(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((v70) this.f16558f).u();
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, n2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public he(v70 v70Var, int i10, long j3, long j10, v70 v70Var2, zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = v70Var;
        this.f16556b = i10;
        this.f16557c = j3;
        this.d = j10;
        this.f16558f = v70Var2;
        this.h = znVar;
        this.f16559n = f6Var;
    }
}
