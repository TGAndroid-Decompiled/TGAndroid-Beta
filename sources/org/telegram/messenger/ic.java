package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
import org.telegram.ui.eo;
public final class ic implements Runnable {
    public final int f17867a = 0;
    public final long f17868b;
    public final long f17869c;
    public final int d;
    public final Object f17870e;
    public final Object f17871f;
    public final Object h;
    public final Object f17872n;

    public ic(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17870e = messagesController;
        this.f17871f = updates_channeldifference;
        this.f17868b = j3;
        this.h = chat;
        this.f17872n = iVar;
        this.d = i10;
        this.f17869c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17867a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17869c;
                ((MessagesController) this.f17870e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17871f, this.f17868b, (TLRPC.Chat) this.h, (a0.i) this.f17872n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17870e).lambda$completeSendingGramTransfer$7(this.f17868b, this.f17869c, this.d, (TLRPC.Message) this.f17871f, (ArrayList) this.h, (MessageObject) this.f17872n);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f17872n;
                ((s80) this.f17870e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17868b;
                long j11 = this.f17869c;
                boolean z10 = notificationsSettings.getBoolean(v0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(v0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((s80) this.f17871f).u();
                if (org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.S(z10 ? 1 : 0, m2Var, c6Var).j();
                    return;
                }
                return;
        }
    }

    public ic(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17870e = sendMessagesHelper;
        this.f17868b = j3;
        this.f17869c = j10;
        this.d = i10;
        this.f17871f = message;
        this.h = arrayList;
        this.f17872n = messageObject;
    }

    public ic(s80 s80Var, int i10, long j3, long j10, s80 s80Var2, eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f17870e = s80Var;
        this.d = i10;
        this.f17868b = j3;
        this.f17869c = j10;
        this.f17871f = s80Var2;
        this.h = eoVar;
        this.f17872n = c6Var;
    }
}
