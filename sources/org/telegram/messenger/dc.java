package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.sn;
public final class dc implements Runnable {
    public final int f18175a = 0;
    public final long f18176b;
    public final long f18177c;
    public final int d;
    public final Object e;
    public final Object f18178f;
    public final Object h;
    public final Object f18179n;

    public dc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f18178f = updates_channeldifference;
        this.f18176b = j10;
        this.h = chat;
        this.f18179n = hVar;
        this.d = i10;
        this.f18177c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18175a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f18177c;
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f18178f, this.f18176b, (TLRPC.Chat) this.h, (a0.h) this.f18179n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f18176b, this.f18177c, this.d, (TLRPC.Message) this.f18178f, (ArrayList) this.h, (MessageObject) this.f18179n);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f18179n;
                ((i80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f18176b;
                long j12 = this.f18177c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((i80) this.f18178f).u();
                if (org.telegram.ui.Components.xc.a(n2Var)) {
                    org.telegram.ui.Components.xc.S(z10 ? 1 : 0, n2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public dc(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f18176b = j10;
        this.f18177c = j11;
        this.d = i10;
        this.f18178f = message;
        this.h = arrayList;
        this.f18179n = messageObject;
    }

    public dc(i80 i80Var, int i10, long j10, long j11, i80 i80Var2, sn snVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i80Var;
        this.d = i10;
        this.f18176b = j10;
        this.f18177c = j11;
        this.f18178f = i80Var2;
        this.h = snVar;
        this.f18179n = d6Var;
    }
}
