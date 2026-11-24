package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rxb extends eu5 {
    public boolean e;
    public final sxb f;

    public rxb(sxb sxbVar) {
        this.f = sxbVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        sxb sxbVar = this.f;
        ArrayList arrayList = sxbVar.b;
        int m = eu5.m(0, 0);
        int b = u69Var.b();
        if (b >= 0 && b < arrayList.size() && ((jxb) arrayList.get(b)).c != null && sd2.y(15, sxbVar.f())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((jxb) arrayList.get(b)).c;
            if (sxbVar.b0.isEmpty()) {
                View view = u69Var.a;
                if ((view instanceof pxb) && tL_forumTopic.id == 1) {
                    this.e = true;
                    ((pxb) view).setSliding(true);
                    return eu5.m(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return eu5.m(3, 0);
            }
        }
        return m;
    }

    @Override
    public final boolean l() {
        return !this.f.b0.isEmpty();
    }

    @Override
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        int b;
        sxb sxbVar = this.f;
        ArrayList arrayList = sxbVar.b;
        if (u69Var.f == u69Var2.f && (b = u69Var2.b()) >= 0 && b < arrayList.size() && ((jxb) arrayList.get(b)).c != null && ((jxb) arrayList.get(b)).c.pinned) {
            ixb ixbVar = sxbVar.r;
            int b2 = u69Var.b();
            int b3 = u69Var2.b();
            sxb sxbVar2 = ixbVar.d;
            ArrayList arrayList2 = sxbVar2.b;
            arrayList2.add(b3, (jxb) arrayList2.remove(b2));
            d69 itemAnimator = sxbVar2.O.getItemAnimator();
            fxb fxbVar = sxbVar2.J0;
            if (itemAnimator != fxbVar) {
                sxbVar2.O.setItemAnimator(fxbVar);
            }
            ixbVar.j(b2, b3);
            return true;
        }
        return false;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        sxb sxbVar = this.f;
        if (i == 0) {
            ArrayList arrayList = sxbVar.b;
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((jxb) arrayList.get(i2)).c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
            sxbVar.getMessagesController().g4.w(arrayList2, sxbVar.a);
            return;
        }
        sxbVar.O.J0(false);
        u69Var.a.setPressed(true);
    }

    @Override
    public final void r(u69 u69Var) {
        if (u69Var != null) {
            pxb pxbVar = (pxb) u69Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = pxbVar.O;
            sxb sxbVar = this.f;
            if (tL_forumTopic != null) {
                qwb qwbVar = sxbVar.getMessagesController().g4;
                long j = sxbVar.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = pxbVar.O;
                qwbVar.A(tL_forumTopic2.id, j, tL_forumTopic2.hidden);
            }
            sxbVar.d1 = pxbVar;
            int i = qxb.o3;
            sxbVar.O.B1(!pxbVar.O.hidden, pxbVar);
            sxbVar.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = pxbVar.d5;
            if (tL_forumTopic3 != null) {
                pxbVar.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
