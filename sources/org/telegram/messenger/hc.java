package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.sn;
public final class hc implements Runnable {
    public final int f18600a = 0;
    public final long f18601b;
    public final long f18602c;
    public final int d;
    public final Object e;
    public final Object f18603f;
    public final Object h;
    public final Object f18604n;

    public hc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f18603f = updates_channeldifference;
        this.f18601b = j10;
        this.h = chat;
        this.f18604n = hVar;
        this.d = i10;
        this.f18602c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f18602c;
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f18603f, this.f18601b, (TLRPC.Chat) this.h, (a0.h) this.f18604n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f18601b, this.f18602c, this.d, (TLRPC.Message) this.f18603f, (ArrayList) this.h, (MessageObject) this.f18604n);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f18604n;
                ((j80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f18601b;
                long j12 = this.f18602c;
                boolean z10 = notificationsSettings.getBoolean(v0.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(v0.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((j80) this.f18603f).u();
                if (org.telegram.ui.Components.xc.a(o2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, o2Var, g6Var).j();
                    return;
                }
                return;
        }
    }

    public hc(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f18601b = j10;
        this.f18602c = j11;
        this.d = i10;
        this.f18603f = message;
        this.h = arrayList;
        this.f18604n = messageObject;
    }

    public hc(j80 j80Var, int i10, long j10, long j11, j80 j80Var2, sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = j80Var;
        this.d = i10;
        this.f18601b = j10;
        this.f18602c = j11;
        this.f18603f = j80Var2;
        this.h = snVar;
        this.f18604n = g6Var;
    }
}
