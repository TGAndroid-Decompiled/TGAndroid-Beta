package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p95 extends c79 {
    public vc2 c;
    public final int d;
    public ArrayList h;
    public g75 n;
    public final j95 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public p95(vc2 vc2Var, int i, j95 j95Var) {
        this.c = vc2Var;
        this.d = i;
        this.r = j95Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E(ArrayList arrayList, g75 g75Var) {
        this.h = arrayList;
        this.n = g75Var;
    }

    public final void F(c75 c75Var, boolean z) {
        this.s = z;
        for (int i = 0; i < c75Var.getChildCount(); i++) {
            View childAt = c75Var.getChildAt(i);
            if (childAt instanceof o95) {
                o95 o95Var = (o95) childAt;
                if (o95Var.getVideoParticipant() != null) {
                    o95Var.b(z);
                }
            }
        }
    }

    public final void G(d79 d79Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (z) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            vc2 vc2Var = this.c;
            if (!vc2Var.b.rtmp_stream) {
                arrayList2.addAll(vc2Var.g);
            }
            arrayList.clear();
            vc2 vc2Var2 = this.c;
            if (!vc2Var2.b.rtmp_stream) {
                arrayList.addAll(vc2Var2.f);
            }
            cy7.a(new m95(this, arrayList4, arrayList3), true).c(this);
            hl.V3(d79Var);
            return;
        }
        arrayList2.clear();
        vc2 vc2Var3 = this.c;
        if (!vc2Var3.b.rtmp_stream) {
            arrayList2.addAll(vc2Var3.g);
        }
        arrayList.clear();
        vc2 vc2Var4 = this.c;
        if (!vc2Var4.b.rtmp_stream) {
            arrayList.addAll(vc2Var4.f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        wc2 wc2Var;
        o95 o95Var = (o95) f89Var.a;
        wc2 wc2Var2 = o95Var.f;
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            wc2Var = (wc2) arrayList.get(i);
            groupCallParticipant = ((wc2) arrayList.get(i)).a;
        } else {
            int size = i - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i - arrayList.size());
                wc2Var = null;
            } else {
                return;
            }
        }
        o95Var.e(wc2Var, groupCallParticipant);
        if (wc2Var2 != null && !wc2Var2.equals(wc2Var) && o95Var.L && o95Var.getRenderer() != null) {
            o95Var.b(false);
            if (wc2Var != null) {
                o95Var.b(true);
            }
        } else if (o95Var.L) {
            if (o95Var.getRenderer() == null && wc2Var != null && this.s) {
                o95Var.b(true);
            } else if (o95Var.getRenderer() != null && wc2Var == null) {
                o95Var.b(false);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        return new f89(new o95(this, viewGroup.getContext()));
    }
}
