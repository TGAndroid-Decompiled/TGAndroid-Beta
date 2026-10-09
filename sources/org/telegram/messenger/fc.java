package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.zn;
public final class fc implements Runnable {
    public final int f17830a = 0;
    public final long f17831b;
    public final long f17832c;
    public final int d;
    public final Object f17833e;
    public final Object f17834f;
    public final Object h;
    public final Object f17835n;

    public fc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17833e = messagesController;
        this.f17834f = updates_channeldifference;
        this.f17831b = j3;
        this.h = chat;
        this.f17835n = iVar;
        this.d = i10;
        this.f17832c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17832c;
                ((MessagesController) this.f17833e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17834f, this.f17831b, (TLRPC.Chat) this.h, (a0.i) this.f17835n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17833e).lambda$completeSendingGramTransfer$7(this.f17831b, this.f17832c, this.d, (TLRPC.Message) this.f17834f, (ArrayList) this.h, (MessageObject) this.f17835n);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f17835n;
                ((p80) this.f17833e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17831b;
                long j11 = this.f17832c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((p80) this.f17834f).u();
                if (org.telegram.ui.Components.ad.a(n2Var)) {
                    org.telegram.ui.Components.ad.S(z10 ? 1 : 0, n2Var, e6Var).j();
                    return;
                }
                return;
        }
    }

    public fc(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17833e = sendMessagesHelper;
        this.f17831b = j3;
        this.f17832c = j10;
        this.d = i10;
        this.f17834f = message;
        this.h = arrayList;
        this.f17835n = messageObject;
    }

    public fc(p80 p80Var, int i10, long j3, long j10, p80 p80Var2, zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f17833e = p80Var;
        this.d = i10;
        this.f17831b = j3;
        this.f17832c = j10;
        this.f17834f = p80Var2;
        this.h = znVar;
        this.f17835n = e6Var;
    }
}
