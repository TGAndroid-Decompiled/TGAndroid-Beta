package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.tn;
public final class je implements Runnable {
    public final int f20678a = 0;
    public final int f20679b;
    public final long f20680c;
    public final long d;
    public final Object f20681e;
    public final Object f20682f;
    public final Object h;
    public final Object f20683n;

    public je(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20681e = messagesController;
        this.f20682f = updates_channeldifference;
        this.f20680c = j10;
        this.h = chat;
        this.f20683n = hVar;
        this.f20679b = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20678a) {
            case 0:
                int i10 = this.f20679b;
                long j10 = this.d;
                ((MessagesController) this.f20681e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f20682f, this.f20680c, (TLRPC.Chat) this.h, (a0.h) this.f20683n, i10, j10);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f20683n;
                ((j70) this.f20681e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f20679b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f20680c;
                long j12 = this.d;
                boolean z10 = notificationsSettings.getBoolean(x3.j(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(x3.j(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((j70) this.f20682f).u();
                if (org.telegram.ui.Components.tc.a(o2Var)) {
                    org.telegram.ui.Components.tc.S(z10 ? 1 : 0, o2Var, c6Var).j();
                    return;
                }
                return;
        }
    }

    public je(j70 j70Var, int i10, long j10, long j11, j70 j70Var2, tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f20681e = j70Var;
        this.f20679b = i10;
        this.f20680c = j10;
        this.d = j11;
        this.f20682f = j70Var2;
        this.h = tnVar;
        this.f20683n = c6Var;
    }
}
