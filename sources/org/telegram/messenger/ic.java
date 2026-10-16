package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.fo;
public final class ic implements Runnable {
    public final int f17181a = 0;
    public final long f17182b;
    public final long f17183c;
    public final int d;
    public final Object e;
    public final Object f17184f;
    public final Object h;
    public final Object f17185n;

    public ic(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f17184f = updates_channeldifference;
        this.f17182b = j10;
        this.h = chat;
        this.f17185n = hVar;
        this.d = i10;
        this.f17183c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17181a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f17183c;
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17184f, this.f17182b, (TLRPC.Chat) this.h, (a0.h) this.f17185n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f17182b, this.f17183c, this.d, (TLRPC.Message) this.f17184f, (ArrayList) this.h, (MessageObject) this.f17185n);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f17185n;
                ((l80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f17182b;
                long j12 = this.f17183c;
                boolean z10 = notificationsSettings.getBoolean(g0.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(g0.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((l80) this.f17184f).u();
                if (org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.S(z10 ? 1 : 0, m2Var, c6Var).j();
                    return;
                }
                return;
        }
    }

    public ic(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f17182b = j10;
        this.f17183c = j11;
        this.d = i10;
        this.f17184f = message;
        this.h = arrayList;
        this.f17185n = messageObject;
    }

    public ic(l80 l80Var, int i10, long j10, long j11, l80 l80Var2, fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = l80Var;
        this.d = i10;
        this.f17182b = j10;
        this.f17183c = j11;
        this.f17184f = l80Var2;
        this.h = foVar;
        this.f17185n = c6Var;
    }
}
