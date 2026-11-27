package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class yyb implements nc2 {
    public final TLRPC.TL_forumTopic a;
    public final tzb b;

    public yyb(tzb tzbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = tzbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override
    public final void l() {
        int i;
        int i2;
        tzb tzbVar = this.b;
        tzbVar.finishPreviewFragment();
        uc7 messagesController = tzbVar.getMessagesController();
        long j = tzbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean p2 = messagesController.p2(-j, tL_forumTopic.id, null);
        tzbVar.getNotificationsController().G(-j, tL_forumTopic.id, !p2);
        if (d31.a(tzbVar)) {
            if (!p2) {
                i = 3;
                i2 = Integer.MAX_VALUE;
            } else {
                i = 4;
                i2 = 0;
            }
            d31.z(tzbVar, i, i2, tzbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void m() {
        this.b.finishPreviewFragment();
        hl.d3(new bcb(this, this.a, (byte) 14), 500L);
    }

    @Override
    public final void p() {
        int i;
        tzb tzbVar = this.b;
        i = ((e) tzbVar).currentAccount;
        SharedPreferences sharedPreferences = uc7.s1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = tzbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb.append(ip7.p(-j, tL_forumTopic.id, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + ip7.p(-j, tL_forumTopic.id, false), z2).apply();
        tzbVar.finishPreviewFragment();
        if (d31.a(tzbVar)) {
            d31.S(z ? 1 : 0, tzbVar.getResourceProvider(), tzbVar).j();
        }
    }

    @Override
    public final void q(int i) {
        tzb tzbVar = this.b;
        long j = tzbVar.a;
        tzbVar.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i == 0) {
            if (tzbVar.getMessagesController().p2(-j, tL_forumTopic.id, null)) {
                tzbVar.getNotificationsController().G(-j, tL_forumTopic.id, false);
            }
            if (d31.a(tzbVar)) {
                d31.z(tzbVar, 4, i, tzbVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        tzbVar.getNotificationsController().H(-j, i, tL_forumTopic.id);
        if (d31.a(tzbVar)) {
            d31.z(tzbVar, 5, i, tzbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void i() {
    }
}
