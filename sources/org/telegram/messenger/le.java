package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o70;
import org.telegram.ui.xn;
public final class le implements Runnable {
    public final int f17759a = 0;
    public final int f17760b;
    public final long f17761c;
    public final long d;
    public final Object e;
    public final Object f17762f;
    public final Object h;
    public final Object f17763n;

    public le(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f17762f = updates_channeldifference;
        this.f17761c = j10;
        this.h = chat;
        this.f17763n = hVar;
        this.f17760b = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17759a) {
            case 0:
                int i10 = this.f17760b;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f17762f, this.f17761c, (TLRPC.Chat) this.h, (a0.h) this.f17763n, i10, j10);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f17763n;
                ((o70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f17760b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j11 = this.f17761c;
                long j12 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j11, j12, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j11, j12, new StringBuilder("sound_enabled_")), !z4 ? 1 : 0).apply();
                ((o70) this.f17762f).u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public le(o70 o70Var, int i10, long j10, long j11, o70 o70Var2, xn xnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = o70Var;
        this.f17760b = i10;
        this.f17761c = j10;
        this.d = j11;
        this.f17762f = o70Var2;
        this.h = xnVar;
        this.f17763n = f6Var;
    }
}
