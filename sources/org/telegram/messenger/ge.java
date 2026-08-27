package org.telegram.messenger;

import android.content.SharedPreferences;
import java.io.FileNotFoundException;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.rn;

public final class ge implements Runnable {

    public final int f20383a = 0;

    public final int f20384b;

    public final long f20385c;
    public final long d;

    public final Object f20386e;

    public final Object f20387f;
    public final Object h;

    public final Object f20388n;

    public ge(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20386e = messagesController;
        this.f20387f = updates_channeldifference;
        this.f20385c = j10;
        this.h = chat;
        this.f20388n = hVar;
        this.f20384b = i10;
        this.d = j11;
    }

    @Override
    public final void run() throws FileNotFoundException {
        switch (this.f20383a) {
            case 0:
                ((MessagesController) this.f20386e).lambda$getChannelDifference$346((TLRPC.updates_ChannelDifference) this.f20387f, this.f20385c, (TLRPC.Chat) this.h, (a0.h) this.f20388n, this.f20384b, this.d);
                break;
            default:
                b70 b70Var = (b70) this.f20386e;
                b70 b70Var2 = (b70) this.f20387f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f20388n;
                b70Var.u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f20384b);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f20385c;
                long j11 = this.d;
                boolean z10 = notificationsSettings.getBoolean(y1.j(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(y1.j(j10, j11, new StringBuilder("sound_enabled_")), !z10).apply();
                b70Var2.u();
                if (org.telegram.ui.Components.mc.a(n2Var)) {
                    org.telegram.ui.Components.mc.S(z10 ? 1 : 0, n2Var, c6Var).j();
                }
                break;
        }
    }

    public ge(b70 b70Var, int i10, long j10, long j11, b70 b70Var2, rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f20386e = b70Var;
        this.f20384b = i10;
        this.f20385c = j10;
        this.d = j11;
        this.f20387f = b70Var2;
        this.h = rnVar;
        this.f20388n = c6Var;
    }
}
