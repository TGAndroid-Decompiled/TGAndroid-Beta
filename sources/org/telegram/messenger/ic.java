package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
import org.telegram.ui.sn;
public final class ic implements Runnable {
    public final int f18673a = 0;
    public final long f18674b;
    public final long f18675c;
    public final int d;
    public final Object e;
    public final Object f18676f;
    public final Object h;
    public final Object f18677n;

    public ic(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f18676f = updates_channeldifference;
        this.f18674b = j10;
        this.h = chat;
        this.f18677n = hVar;
        this.d = i10;
        this.f18675c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18673a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f18675c;
                ((MessagesController) this.e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f18676f, this.f18674b, (TLRPC.Chat) this.h, (a0.h) this.f18677n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f18674b, this.f18675c, this.d, (TLRPC.Message) this.f18676f, (ArrayList) this.h, (MessageObject) this.f18677n);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f18677n;
                ((h80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f18674b;
                long j12 = this.f18675c;
                boolean z10 = notificationsSettings.getBoolean(v0.i(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(v0.i(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((h80) this.f18676f).u();
                if (org.telegram.ui.Components.vc.a(o2Var)) {
                    org.telegram.ui.Components.vc.S(z10 ? 1 : 0, o2Var, g6Var).j();
                    return;
                }
                return;
        }
    }

    public ic(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f18674b = j10;
        this.f18675c = j11;
        this.d = i10;
        this.f18676f = message;
        this.h = arrayList;
        this.f18677n = messageObject;
    }

    public ic(h80 h80Var, int i10, long j10, long j11, h80 h80Var2, sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = h80Var;
        this.d = i10;
        this.f18674b = j10;
        this.f18675c = j11;
        this.f18676f = h80Var2;
        this.h = snVar;
        this.f18677n = g6Var;
    }
}
