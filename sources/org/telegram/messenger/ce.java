package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;
public final class ce implements Runnable {
    public final int f19991a = 0;
    public final int f19992b;
    public final long f19993c;
    public final long d;
    public final Object f19994e;
    public final Object f19995f;
    public final Object h;
    public final Object f19996n;

    public ce(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i9, long j11) {
        this.f19994e = messagesController;
        this.f19995f = updates_channeldifference;
        this.f19993c = j10;
        this.h = chat;
        this.f19996n = hVar;
        this.f19992b = i9;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19991a) {
            case 0:
                int i9 = this.f19992b;
                long j10 = this.d;
                ((MessagesController) this.f19994e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f19995f, this.f19993c, (TLRPC.Chat) this.h, (a0.h) this.f19996n, i9, j10);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f19996n;
                ((x60) this.f19994e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f19992b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f19993c;
                long j12 = this.d;
                boolean z10 = notificationsSettings.getBoolean(l0.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(l0.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((x60) this.f19995f).u();
                if (org.telegram.ui.Components.oc.a(o2Var)) {
                    org.telegram.ui.Components.oc.S(z10 ? 1 : 0, o2Var, b6Var).j();
                    return;
                }
                return;
        }
    }

    public ce(x60 x60Var, int i9, long j10, long j11, x60 x60Var2, qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f19994e = x60Var;
        this.f19992b = i9;
        this.f19993c = j10;
        this.d = j11;
        this.f19995f = x60Var2;
        this.h = qnVar;
        this.f19996n = b6Var;
    }
}
