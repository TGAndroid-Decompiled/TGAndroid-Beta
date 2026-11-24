package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ywb implements id2 {
    public final TLRPC.TL_forumTopic a;
    public final sxb b;

    public ywb(sxb sxbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = sxbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override
    public final void p() {
        int i;
        int i2;
        sxb sxbVar = this.b;
        sxbVar.finishPreviewFragment();
        oc7 messagesController = sxbVar.getMessagesController();
        long j = sxbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean o2 = messagesController.o2(-j, tL_forumTopic.id, null);
        sxbVar.getNotificationsController().G(-j, tL_forumTopic.id, !o2);
        if (c41.a(sxbVar)) {
            if (!o2) {
                i = 3;
                i2 = Integer.MAX_VALUE;
            } else {
                i = 4;
                i2 = 0;
            }
            c41.z(sxbVar, i, i2, sxbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void r() {
        this.b.finishPreviewFragment();
        gm.d3(new b7b(this, this.a, (byte) 19), 500L);
    }

    @Override
    public final void s() {
        int i;
        sxb sxbVar = this.b;
        i = ((d) sxbVar).currentAccount;
        SharedPreferences sharedPreferences = oc7.r1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = sxbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb.append(lo7.p(-j, tL_forumTopic.id, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + lo7.p(-j, tL_forumTopic.id, false), z2).apply();
        sxbVar.finishPreviewFragment();
        if (c41.a(sxbVar)) {
            c41.S(z ? 1 : 0, sxbVar.getResourceProvider(), sxbVar).j();
        }
    }

    @Override
    public final void t(int i) {
        sxb sxbVar = this.b;
        long j = sxbVar.a;
        sxbVar.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i == 0) {
            if (sxbVar.getMessagesController().o2(-j, tL_forumTopic.id, null)) {
                sxbVar.getNotificationsController().G(-j, tL_forumTopic.id, false);
            }
            if (c41.a(sxbVar)) {
                c41.z(sxbVar, 4, i, sxbVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        sxbVar.getNotificationsController().H(-j, i, tL_forumTopic.id);
        if (c41.a(sxbVar)) {
            c41.z(sxbVar, 5, i, sxbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void h() {
    }
}
