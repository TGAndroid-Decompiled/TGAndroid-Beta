package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.yn;
public final class ge implements Runnable {
    public final int f17967a = 0;
    public final int f17968b;
    public final long f17969c;
    public final long d;
    public final Object f17970e;
    public final Object f17971f;
    public final Object h;
    public final Object f17972n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17970e = messagesController;
        this.f17971f = updates_channeldifference;
        this.f17969c = j3;
        this.h = chat;
        this.f17972n = iVar;
        this.f17968b = i10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17967a) {
            case 0:
                int i10 = this.f17968b;
                long j3 = this.d;
                ((MessagesController) this.f17970e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f17971f, this.f17969c, (TLRPC.Chat) this.h, (a0.i) this.f17972n, i10, j3);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f17972n;
                ((b80) this.f17970e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f17968b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17969c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(q.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((b80) this.f17971f).u();
                if (org.telegram.ui.Components.yc.a(n2Var)) {
                    org.telegram.ui.Components.yc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ge(b80 b80Var, int i10, long j3, long j10, b80 b80Var2, yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f17970e = b80Var;
        this.f17968b = i10;
        this.f17969c = j3;
        this.d = j10;
        this.f17971f = b80Var2;
        this.h = ynVar;
        this.f17972n = d6Var;
    }
}
