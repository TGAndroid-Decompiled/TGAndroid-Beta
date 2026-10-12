package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
import org.telegram.ui.eo;
public final class ic implements Runnable {
    public final int f17866a = 0;
    public final long f17867b;
    public final long f17868c;
    public final int d;
    public final Object f17869e;
    public final Object f17870f;
    public final Object h;
    public final Object f17871n;

    public ic(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17869e = messagesController;
        this.f17870f = updates_channeldifference;
        this.f17867b = j3;
        this.h = chat;
        this.f17871n = iVar;
        this.d = i10;
        this.f17868c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17866a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17868c;
                ((MessagesController) this.f17869e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17870f, this.f17867b, (TLRPC.Chat) this.h, (a0.i) this.f17871n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17869e).lambda$completeSendingGramTransfer$7(this.f17867b, this.f17868c, this.d, (TLRPC.Message) this.f17870f, (ArrayList) this.h, (MessageObject) this.f17871n);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f17871n;
                ((s80) this.f17869e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17867b;
                long j11 = this.f17868c;
                boolean z10 = notificationsSettings.getBoolean(v0.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(v0.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((s80) this.f17870f).u();
                if (org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.S(z10 ? 1 : 0, m2Var, c6Var).j();
                    return;
                }
                return;
        }
    }

    public ic(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17869e = sendMessagesHelper;
        this.f17867b = j3;
        this.f17868c = j10;
        this.d = i10;
        this.f17870f = message;
        this.h = arrayList;
        this.f17871n = messageObject;
    }

    public ic(s80 s80Var, int i10, long j3, long j10, s80 s80Var2, eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f17869e = s80Var;
        this.d = i10;
        this.f17867b = j3;
        this.f17868c = j10;
        this.f17870f = s80Var2;
        this.h = eoVar;
        this.f17871n = c6Var;
    }
}
