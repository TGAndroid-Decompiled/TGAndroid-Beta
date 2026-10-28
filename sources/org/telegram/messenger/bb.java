package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.wn;
public final class bb implements Runnable {
    public final int f19694a = 0;
    public final long f19695b;
    public final long f19696c;
    public final int d;
    public final Object e;
    public final Object f19697f;
    public final Object h;
    public final Object f19698n;

    public bb(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f19697f = updates_channeldifference;
        this.f19695b = j10;
        this.h = chat;
        this.f19698n = hVar;
        this.d = i10;
        this.f19696c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19694a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f19696c;
                ((MessagesController) this.e).lambda$getChannelDifference$347((TLRPC.updates_ChannelDifference) this.f19697f, this.f19695b, (TLRPC.Chat) this.h, (a0.h) this.f19698n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f19695b, this.f19696c, this.d, (TLRPC.Message) this.f19697f, (ArrayList) this.h, (MessageObject) this.f19698n);
                return;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.h;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f19698n;
                ((l80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f19695b;
                long j12 = this.f19696c;
                boolean z10 = notificationsSettings.getBoolean(t.j(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(t.j(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((l80) this.f19697f).u();
                if (org.telegram.ui.Components.wc.a(r2Var)) {
                    org.telegram.ui.Components.wc.T(z10 ? 1 : 0, r2Var, u6Var).j();
                    return;
                }
                return;
        }
    }

    public bb(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f19695b = j10;
        this.f19696c = j11;
        this.d = i10;
        this.f19697f = message;
        this.h = arrayList;
        this.f19698n = messageObject;
    }

    public bb(l80 l80Var, int i10, long j10, long j11, l80 l80Var2, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = l80Var;
        this.d = i10;
        this.f19695b = j10;
        this.f19696c = j11;
        this.f19697f = l80Var2;
        this.h = wnVar;
        this.f19698n = u6Var;
    }
}
