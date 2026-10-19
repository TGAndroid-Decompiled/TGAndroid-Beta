package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.qn;
public final class dc implements Runnable {
    public final int f18182a = 0;
    public final long f18183b;
    public final long f18184c;
    public final int d;
    public final Object e;
    public final Object f18185f;
    public final Object h;
    public final Object f18186n;

    public dc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f18185f = updates_channeldifference;
        this.f18183b = j10;
        this.h = chat;
        this.f18186n = hVar;
        this.d = i10;
        this.f18184c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18182a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f18184c;
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f18185f, this.f18183b, (TLRPC.Chat) this.h, (a0.h) this.f18186n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f18183b, this.f18184c, this.d, (TLRPC.Message) this.f18185f, (ArrayList) this.h, (MessageObject) this.f18186n);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f18186n;
                ((i80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f18183b;
                long j12 = this.f18184c;
                boolean z10 = notificationsSettings.getBoolean(g0.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(g0.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((i80) this.f18185f).u();
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public dc(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f18183b = j10;
        this.f18184c = j11;
        this.d = i10;
        this.f18185f = message;
        this.h = arrayList;
        this.f18186n = messageObject;
    }

    public dc(i80 i80Var, int i10, long j10, long j11, i80 i80Var2, qn qnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i80Var;
        this.d = i10;
        this.f18183b = j10;
        this.f18184c = j11;
        this.f18185f = i80Var2;
        this.h = qnVar;
        this.f18186n = d6Var;
    }
}
