package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.eo;
public final class pe implements Runnable {
    public final int f16056a = 0;
    public final int f16057b;
    public final long f16058c;
    public final long d;
    public final Object e;
    public final Object f16059f;
    public final Object h;
    public final Object f16060n;

    public pe(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.e = messagesController;
        this.f16059f = updates_channeldifference;
        this.f16058c = j3;
        this.h = chat;
        this.f16060n = iVar;
        this.f16057b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                int i10 = this.f16057b;
                long j3 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f16059f, this.f16058c, (TLRPC.Chat) this.h, (a0.i) this.f16060n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f16060n;
                ((w70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f16057b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f16058c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(a2.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(a2.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((w70) this.f16059f).u();
                if (org.telegram.ui.Components.wc.a(p2Var)) {
                    org.telegram.ui.Components.wc.S(z10 ? 1 : 0, p2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public pe(w70 w70Var, int i10, long j3, long j10, w70 w70Var2, eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = w70Var;
        this.f16057b = i10;
        this.f16058c = j3;
        this.d = j10;
        this.f16059f = w70Var2;
        this.h = eoVar;
        this.f16060n = f6Var;
    }
}
