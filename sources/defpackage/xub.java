package defpackage;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class xub implements xb2 {
    public final TLRPC.TL_forumTopic a;
    public final qvb b;

    public xub(qvb qvbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = qvbVar;
        this.a = tL_forumTopic;
    }

    @Override
    public final void dismiss() {
        this.b.finishPreviewFragment();
    }

    @Override
    public final void i() {
        int i;
        int i2;
        qvb qvbVar = this.b;
        qvbVar.finishPreviewFragment();
        na7 messagesController = qvbVar.getMessagesController();
        long j = qvbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        boolean n2 = messagesController.n2(-j, tL_forumTopic.id, null);
        qvbVar.getNotificationsController().G(-j, tL_forumTopic.id, !n2);
        if (u21.a(qvbVar)) {
            if (!n2) {
                i = 3;
                i2 = Integer.MAX_VALUE;
            } else {
                i = 4;
                i2 = 0;
            }
            u21.z(qvbVar, i, i2, qvbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void l() {
        this.b.finishPreviewFragment();
        gl.d3(new a5b(this, this.a, (byte) 17), 500L);
    }

    @Override
    public final void n() {
        int i;
        qvb qvbVar = this.b;
        i = ((d) qvbVar).currentAccount;
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = qvbVar.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        sb.append(im7.p(-j, tL_forumTopic.id, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z ? 1 : 0;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("sound_enabled_" + im7.p(-j, tL_forumTopic.id, false), z2).apply();
        qvbVar.finishPreviewFragment();
        if (u21.a(qvbVar)) {
            u21.S(z ? 1 : 0, qvbVar.getResourceProvider(), qvbVar).j();
        }
    }

    @Override
    public final void p(int i) {
        qvb qvbVar = this.b;
        long j = qvbVar.a;
        qvbVar.finishPreviewFragment();
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (i == 0) {
            if (qvbVar.getMessagesController().n2(-j, tL_forumTopic.id, null)) {
                qvbVar.getNotificationsController().G(-j, tL_forumTopic.id, false);
            }
            if (u21.a(qvbVar)) {
                u21.z(qvbVar, 4, i, qvbVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        qvbVar.getNotificationsController().H(-j, i, tL_forumTopic.id);
        if (u21.a(qvbVar)) {
            u21.z(qvbVar, 5, i, qvbVar.getResourceProvider()).j();
        }
    }

    @Override
    public final void a() {
    }
}
