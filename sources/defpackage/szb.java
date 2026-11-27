package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class szb extends iu5 {
    public boolean e;
    public final tzb f;

    public szb(tzb tzbVar) {
        this.f = tzbVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        super.a(recyclerView, f89Var);
        f89Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        tzb tzbVar = this.f;
        ArrayList arrayList = tzbVar.b;
        int m = iu5.m(0, 0);
        int b = f89Var.b();
        if (b >= 0 && b < arrayList.size() && ((kzb) arrayList.get(b)).c != null && xc2.y(15, tzbVar.e())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((kzb) arrayList.get(b)).c;
            if (tzbVar.b0.isEmpty()) {
                View view = f89Var.a;
                if ((view instanceof qzb) && tL_forumTopic.id == 1) {
                    this.e = true;
                    ((qzb) view).setSliding(true);
                    return iu5.m(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return iu5.m(3, 0);
            }
        }
        return m;
    }

    @Override
    public final boolean l() {
        return !this.f.b0.isEmpty();
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        int b;
        tzb tzbVar = this.f;
        ArrayList arrayList = tzbVar.b;
        if (f89Var.f == f89Var2.f && (b = f89Var2.b()) >= 0 && b < arrayList.size() && ((kzb) arrayList.get(b)).c != null && ((kzb) arrayList.get(b)).c.pinned) {
            jzb jzbVar = tzbVar.r;
            int b2 = f89Var.b();
            int b3 = f89Var2.b();
            tzb tzbVar2 = jzbVar.d;
            ArrayList arrayList2 = tzbVar2.b;
            arrayList2.add(b3, (kzb) arrayList2.remove(b2));
            o79 itemAnimator = tzbVar2.O.getItemAnimator();
            gzb gzbVar = tzbVar2.J0;
            if (itemAnimator != gzbVar) {
                tzbVar2.O.setItemAnimator(gzbVar);
            }
            jzbVar.j(b2, b3);
            return true;
        }
        return false;
    }

    @Override
    public final void q(f89 f89Var, int i) {
        tzb tzbVar = this.f;
        if (i == 0) {
            ArrayList arrayList = tzbVar.b;
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((kzb) arrayList.get(i2)).c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
            tzbVar.getMessagesController().g4.w(arrayList2, tzbVar.a);
            return;
        }
        tzbVar.O.K0(false);
        f89Var.a.setPressed(true);
    }

    @Override
    public final void r(f89 f89Var) {
        if (f89Var != null) {
            qzb qzbVar = (qzb) f89Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = qzbVar.O;
            tzb tzbVar = this.f;
            if (tL_forumTopic != null) {
                qyb qybVar = tzbVar.getMessagesController().g4;
                long j = tzbVar.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = qzbVar.O;
                qybVar.A(tL_forumTopic2.id, j, tL_forumTopic2.hidden);
            }
            tzbVar.d1 = qzbVar;
            int i = rzb.o3;
            tzbVar.O.C1(!qzbVar.O.hidden, qzbVar);
            tzbVar.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = qzbVar.d5;
            if (tL_forumTopic3 != null) {
                qzbVar.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
