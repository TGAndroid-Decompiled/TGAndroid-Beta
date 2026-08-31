package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.xn;
public final class le implements Runnable {
    public final int f19267a = 0;
    public final int f19268b;
    public final long f19269c;
    public final long d;
    public final Object f19270e;
    public final Object f19271f;
    public final Object h;
    public final Object f19272n;

    public le(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19270e = messagesController;
        this.f19271f = updates_channeldifference;
        this.f19269c = j10;
        this.h = chat;
        this.f19272n = hVar;
        this.f19268b = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19267a) {
            case 0:
                int i10 = this.f19268b;
                long j10 = this.d;
                ((MessagesController) this.f19270e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f19271f, this.f19269c, (TLRPC.Chat) this.h, (a0.h) this.f19272n, i10, j10);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f19272n;
                ((q70) this.f19270e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f19268b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j11 = this.f19269c;
                long j12 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j11, j12, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j11, j12, new StringBuilder("sound_enabled_")), !z4 ? 1 : 0).apply();
                ((q70) this.f19271f).u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, g6Var).j();
                    return;
                }
                return;
        }
    }

    public le(q70 q70Var, int i10, long j10, long j11, q70 q70Var2, xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f19270e = q70Var;
        this.f19268b = i10;
        this.f19269c = j10;
        this.d = j11;
        this.f19271f = q70Var2;
        this.h = xnVar;
        this.f19272n = g6Var;
    }
}
