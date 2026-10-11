package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
import org.telegram.ui.zn;
public final class fc implements Runnable {
    public final int f17833a = 0;
    public final long f17834b;
    public final long f17835c;
    public final int d;
    public final Object f17836e;
    public final Object f17837f;
    public final Object h;
    public final Object f17838n;

    public fc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17836e = messagesController;
        this.f17837f = updates_channeldifference;
        this.f17834b = j3;
        this.h = chat;
        this.f17838n = iVar;
        this.d = i10;
        this.f17835c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17835c;
                ((MessagesController) this.f17836e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17837f, this.f17834b, (TLRPC.Chat) this.h, (a0.i) this.f17838n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17836e).lambda$completeSendingGramTransfer$7(this.f17834b, this.f17835c, this.d, (TLRPC.Message) this.f17837f, (ArrayList) this.h, (MessageObject) this.f17838n);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f17838n;
                ((q80) this.f17836e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17834b;
                long j11 = this.f17835c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((q80) this.f17837f).u();
                if (org.telegram.ui.Components.ad.a(m2Var)) {
                    org.telegram.ui.Components.ad.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public fc(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17836e = sendMessagesHelper;
        this.f17834b = j3;
        this.f17835c = j10;
        this.d = i10;
        this.f17837f = message;
        this.h = arrayList;
        this.f17838n = messageObject;
    }

    public fc(q80 q80Var, int i10, long j3, long j10, q80 q80Var2, zn znVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f17836e = q80Var;
        this.d = i10;
        this.f17834b = j3;
        this.f17835c = j10;
        this.f17837f = q80Var2;
        this.h = znVar;
        this.f17838n = d6Var;
    }
}
