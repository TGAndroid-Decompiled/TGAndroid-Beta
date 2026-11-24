package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m95 extends q59 {
    public qd2 c;
    public final int d;
    public ArrayList h;
    public c75 n;
    public final g95 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public m95(qd2 qd2Var, int i, g95 g95Var) {
        this.c = qd2Var;
        this.d = i;
        this.r = g95Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void E(ArrayList arrayList, c75 c75Var) {
        this.h = arrayList;
        this.n = c75Var;
    }

    public final void F(y65 y65Var, boolean z) {
        this.s = z;
        for (int i = 0; i < y65Var.getChildCount(); i++) {
            View childAt = y65Var.getChildAt(i);
            if (childAt instanceof l95) {
                l95 l95Var = (l95) childAt;
                if (l95Var.getVideoParticipant() != null) {
                    l95Var.b(z);
                }
            }
        }
    }

    public final void G(r59 r59Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (z) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            qd2 qd2Var = this.c;
            if (!qd2Var.b.rtmp_stream) {
                arrayList2.addAll(qd2Var.g);
            }
            arrayList.clear();
            qd2 qd2Var2 = this.c;
            if (!qd2Var2.b.rtmp_stream) {
                arrayList.addAll(qd2Var2.f);
            }
            ww7.a(new j95(this, arrayList4, arrayList3), true).c(this);
            gm.V3(r59Var);
            return;
        }
        arrayList2.clear();
        qd2 qd2Var3 = this.c;
        if (!qd2Var3.b.rtmp_stream) {
            arrayList2.addAll(qd2Var3.g);
        }
        arrayList.clear();
        qd2 qd2Var4 = this.c;
        if (!qd2Var4.b.rtmp_stream) {
            arrayList.addAll(qd2Var4.f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        rd2 rd2Var;
        l95 l95Var = (l95) u69Var.a;
        rd2 rd2Var2 = l95Var.f;
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            rd2Var = (rd2) arrayList.get(i);
            groupCallParticipant = ((rd2) arrayList.get(i)).a;
        } else {
            int size = i - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i - arrayList.size());
                rd2Var = null;
            } else {
                return;
            }
        }
        l95Var.e(rd2Var, groupCallParticipant);
        if (rd2Var2 != null && !rd2Var2.equals(rd2Var) && l95Var.L && l95Var.getRenderer() != null) {
            l95Var.b(false);
            if (rd2Var != null) {
                l95Var.b(true);
            }
        } else if (l95Var.L) {
            if (l95Var.getRenderer() == null && rd2Var != null && this.s) {
                l95Var.b(true);
            } else if (l95Var.getRenderer() != null && rd2Var == null) {
                l95Var.b(false);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new l95(this, viewGroup.getContext()));
    }
}
