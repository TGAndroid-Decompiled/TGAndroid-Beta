package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
import org.telegram.ui.un;
public final class ua implements Runnable {
    public final int f21402a = 0;
    public final long f21403b;
    public final long f21404c;
    public final int d;
    public final Object e;
    public final Object f21405f;
    public final Object h;
    public final Object f21406n;

    public ua(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = messagesController;
        this.f21405f = updates_channeldifference;
        this.f21403b = j10;
        this.h = chat;
        this.f21406n = hVar;
        this.d = i10;
        this.f21404c = j11;
    }

    @Override
    public final void run() {
        switch (this.f21402a) {
            case 0:
                int i10 = this.d;
                long j10 = this.f21404c;
                ((MessagesController) this.e).lambda$getChannelDifference$347((TLRPC.updates_ChannelDifference) this.f21405f, this.f21403b, (TLRPC.Chat) this.h, (a0.h) this.f21406n, i10, j10);
                return;
            case 1:
                ((SendMessagesHelper) this.e).lambda$completeSendingGramTransfer$7(this.f21403b, this.f21404c, this.d, (TLRPC.Message) this.f21405f, (ArrayList) this.h, (MessageObject) this.f21406n);
                return;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.h;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f21406n;
                ((k80) this.e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j11 = this.f21403b;
                long j12 = this.f21404c;
                boolean z10 = notificationsSettings.getBoolean(t.j(j11, j12, sb2), true);
                notificationsSettings.edit().putBoolean(t.j(j11, j12, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((k80) this.f21405f).u();
                if (org.telegram.ui.Components.wc.a(r2Var)) {
                    org.telegram.ui.Components.wc.T(z10 ? 1 : 0, r2Var, u6Var).j();
                    return;
                }
                return;
        }
    }

    public ua(SendMessagesHelper sendMessagesHelper, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.e = sendMessagesHelper;
        this.f21403b = j10;
        this.f21404c = j11;
        this.d = i10;
        this.f21405f = message;
        this.h = arrayList;
        this.f21406n = messageObject;
    }

    public ua(k80 k80Var, int i10, long j10, long j11, k80 k80Var2, un unVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = k80Var;
        this.d = i10;
        this.f21403b = j10;
        this.f21404c = j11;
        this.f21405f = k80Var2;
        this.h = unVar;
        this.f21406n = u6Var;
    }
}
