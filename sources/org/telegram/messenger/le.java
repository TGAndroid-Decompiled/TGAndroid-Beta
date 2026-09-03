package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p70;
import org.telegram.ui.zn;
public final class le implements Runnable {
    public final int f17738a = 0;
    public final int f17739b;
    public final long f17740c;
    public final long d;
    public final Object e;
    public final Object f17741f;
    public final Object h;
    public final Object f17742n;

    public le(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f17741f = updates_channeldifference;
        this.f17740c = j10;
        this.h = chat;
        this.f17742n = hVar;
        this.f17739b = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f17738a) {
            case 0:
                int i10 = this.f17739b;
                long j10 = this.d;
                ((MessagesController) this.e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f17741f, this.f17740c, (TLRPC.Chat) this.h, (a0.h) this.f17742n, i10, j10);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f17742n;
                ((p70) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f17739b);
                StringBuilder sb = new StringBuilder("sound_enabled_");
                long j11 = this.f17740c;
                long j12 = this.d;
                boolean z4 = notificationsSettings.getBoolean(y3.i(j11, j12, sb), true);
                notificationsSettings.edit().putBoolean(y3.i(j11, j12, new StringBuilder("sound_enabled_")), !z4 ? 1 : 0).apply();
                ((p70) this.f17741f).u();
                if (org.telegram.ui.Components.qc.a(p2Var)) {
                    org.telegram.ui.Components.qc.S(z4 ? 1 : 0, p2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public le(p70 p70Var, int i10, long j10, long j11, p70 p70Var2, zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = p70Var;
        this.f17739b = i10;
        this.f17740c = j10;
        this.d = j11;
        this.f17741f = p70Var2;
        this.h = znVar;
        this.f17742n = f6Var;
    }
}
