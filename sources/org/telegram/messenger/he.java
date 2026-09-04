package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.co;
public final class he implements Runnable {
    public final int f17882a = 0;
    public final int f17883b;
    public final long f17884c;
    public final long d;
    public final Object f17885e;
    public final Object f17886f;
    public final Object h;
    public final Object f17887n;

    public he(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17885e = messagesController;
        this.f17886f = updates_channeldifference;
        this.f17884c = j3;
        this.h = chat;
        this.f17887n = iVar;
        this.f17883b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17882a) {
            case 0:
                int i10 = this.f17883b;
                long j3 = this.d;
                ((MessagesController) this.f17885e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f17886f, this.f17884c, (TLRPC.Chat) this.h, (a0.i) this.f17887n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f17887n;
                ((n70) this.f17885e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f17883b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17884c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(w1.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(w1.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((n70) this.f17886f).u();
                if (org.telegram.ui.Components.yc.a(n2Var)) {
                    org.telegram.ui.Components.yc.S(z10 ? 1 : 0, n2Var, f6Var).j();
                    return;
                }
                return;
        }
    }

    public he(n70 n70Var, int i10, long j3, long j10, n70 n70Var2, co coVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f17885e = n70Var;
        this.f17883b = i10;
        this.f17884c = j3;
        this.d = j10;
        this.f17886f = n70Var2;
        this.h = coVar;
        this.f17887n = f6Var;
    }
}
