package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.zn;
public final class fc implements Runnable {
    public final int f17869a = 0;
    public final long f17870b;
    public final long f17871c;
    public final int d;
    public final Object f17872e;
    public final Object f17873f;
    public final Object h;
    public final Object f17874n;

    public fc(MessagesController messagesController, TLRPC.updates_ChannelDifference updates_channeldifference, long j3, TLRPC.Chat chat, a0.i iVar, int i10, long j10) {
        this.f17872e = messagesController;
        this.f17873f = updates_channeldifference;
        this.f17870b = j3;
        this.h = chat;
        this.f17874n = iVar;
        this.d = i10;
        this.f17871c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17869a) {
            case 0:
                int i10 = this.d;
                long j3 = this.f17871c;
                ((MessagesController) this.f17872e).lambda$getChannelDifference$345((TLRPC.updates_ChannelDifference) this.f17873f, this.f17870b, (TLRPC.Chat) this.h, (a0.i) this.f17874n, i10, j3);
                return;
            case 1:
                ((SendMessagesHelper) this.f17872e).lambda$completeSendingGramTransfer$7(this.f17870b, this.f17871c, this.d, (TLRPC.Message) this.f17873f, (ArrayList) this.h, (MessageObject) this.f17874n);
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f17874n;
                ((p80) this.f17872e).u();
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.d);
                StringBuilder sb2 = new StringBuilder("sound_enabled_");
                long j10 = this.f17870b;
                long j11 = this.f17871c;
                boolean z10 = notificationsSettings.getBoolean(q.i(j10, j11, sb2), true);
                notificationsSettings.edit().putBoolean(q.i(j10, j11, new StringBuilder("sound_enabled_")), !z10 ? 1 : 0).apply();
                ((p80) this.f17873f).u();
                if (org.telegram.ui.Components.ad.a(m2Var)) {
                    org.telegram.ui.Components.ad.S(z10 ? 1 : 0, m2Var, d6Var).j();
                    return;
                }
                return;
        }
    }

    public fc(SendMessagesHelper sendMessagesHelper, long j3, long j10, int i10, TLRPC.Message message, ArrayList arrayList, MessageObject messageObject) {
        this.f17872e = sendMessagesHelper;
        this.f17870b = j3;
        this.f17871c = j10;
        this.d = i10;
        this.f17873f = message;
        this.h = arrayList;
        this.f17874n = messageObject;
    }

    public fc(p80 p80Var, int i10, long j3, long j10, p80 p80Var2, zn znVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f17872e = p80Var;
        this.d = i10;
        this.f17870b = j3;
        this.f17871c = j10;
        this.f17873f = p80Var2;
        this.h = znVar;
        this.f17874n = d6Var;
    }
}
