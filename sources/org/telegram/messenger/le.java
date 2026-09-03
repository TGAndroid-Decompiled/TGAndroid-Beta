package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.xn;
public final class le implements Runnable {
    public final int f19269a = 0;
    public final int f19270b;
    public final long f19271c;
    public final long d;
    public final Object f19272e;
    public final Object f19273f;
    public final Object h;
    public final Object f19274n;

    public le(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19272e = messagesController;
        this.f19273f = updates_channeldifference;
        this.f19271c = j10;
        this.h = chat;
        this.f19274n = hVar;
        this.f19270b = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19269a) {
            case 0:
                int i10 = this.f19270b;
                long j10 = this.d;
                ((MessagesController) this.f19272e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f19273f, this.f19271c, (TLRPC.Chat) this.h, (a0.h) this.f19274n, i10, j10);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f19274n;
                ((q70) this.f19272e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f19270b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j11 = this.f19271c;
                long j12 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j11, j12, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j11, j12, new StringBuilder("sound_enabled_")), !z4 ? 1 : 0).apply();
                ((q70) this.f19273f).u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, g6Var).j();
                    return;
                }
                return;
        }
    }

    public le(q70 q70Var, int i10, long j10, long j11, q70 q70Var2, xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f19272e = q70Var;
        this.f19270b = i10;
        this.f19271c = j10;
        this.d = j11;
        this.f19273f = q70Var2;
        this.h = xnVar;
        this.f19274n = g6Var;
    }
}
