package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
import org.telegram.ui.zn;
public final class fc implements Runnable {
    public final int f17834a = 0;
    public final long f17835b;
    public final long f17836c;
    public final int d;
    public final Object f17837e;
    public final Object f17838f;
    public final Object h;
    public final Object f17839n;

    public fc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17837e = messagesController;
        this.f17838f = updates_channeldifference;
        this.f17835b = j3;
        this.h = chat;
        this.f17839n = iVar;
        this.d = i10;
        this.f17836c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17834a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17836c;
                ((MessagesController) this.f17837e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17838f, this.f17835b, (TLRPC.Chat) this.h, (a0.i) this.f17839n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17837e).lambda$completeSendingGramTransfer$7(this.f17835b, this.f17836c, this.d, (TLRPC.Message) this.f17838f, (ArrayList) this.h, (MessageObject) this.f17839n);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f17839n;
                ((q80) this.f17837e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17835b;
                long j11 = this.f17836c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((q80) this.f17838f).u();
                if (org.telegram.ui.Components.ad.a(n2Var)) {
                    org.telegram.ui.Components.ad.S(z10 ? 1 : 0, n2Var, e6Var).j();
                    return;
                }
                return;
        }
    }

    public fc(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17837e = sendMessagesHelper;
        this.f17835b = j3;
        this.f17836c = j10;
        this.d = i10;
        this.f17838f = message;
        this.h = arrayList;
        this.f17839n = messageObject;
    }

    public fc(q80 q80Var, int i10, long j3, long j10, q80 q80Var2, zn znVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f17837e = q80Var;
        this.d = i10;
        this.f17835b = j3;
        this.f17836c = j10;
        this.f17838f = q80Var2;
        this.h = znVar;
        this.f17839n = e6Var;
    }
}
