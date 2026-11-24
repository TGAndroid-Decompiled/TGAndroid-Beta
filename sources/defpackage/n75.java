package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n75 extends n39 {
    public fc2 c;
    public final int d;
    public ArrayList h;
    public e55 n;
    public final h75 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public n75(fc2 fc2Var, int i, h75 h75Var) {
        this.c = fc2Var;
        this.d = i;
        this.r = h75Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E(ArrayList arrayList, e55 e55Var) {
        this.h = arrayList;
        this.n = e55Var;
    }

    public final void F(a55 a55Var, boolean z) {
        this.s = z;
        for (int i = 0; i < a55Var.getChildCount(); i++) {
            View childAt = a55Var.getChildAt(i);
            if (childAt instanceof m75) {
                m75 m75Var = (m75) childAt;
                if (m75Var.getVideoParticipant() != null) {
                    m75Var.b(z);
                }
            }
        }
    }

    public final void G(o39 o39Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (z) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(arrayList);
            arrayList2.clear();
            fc2 fc2Var = this.c;
            if (!fc2Var.b.rtmp_stream) {
                arrayList2.addAll(fc2Var.g);
            }
            arrayList.clear();
            fc2 fc2Var2 = this.c;
            if (!fc2Var2.b.rtmp_stream) {
                arrayList.addAll(fc2Var2.f);
            }
            vu7.a(new k75(this, arrayList4, arrayList3), true).c(this);
            gl.V3(o39Var);
            return;
        }
        arrayList2.clear();
        fc2 fc2Var3 = this.c;
        if (!fc2Var3.b.rtmp_stream) {
            arrayList2.addAll(fc2Var3.g);
        }
        arrayList.clear();
        fc2 fc2Var4 = this.c;
        if (!fc2Var4.b.rtmp_stream) {
            arrayList.addAll(fc2Var4.f);
        }
        f();
    }

    @Override
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        gc2 gc2Var;
        m75 m75Var = (m75) s49Var.a;
        gc2 gc2Var2 = m75Var.f;
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            gc2Var = (gc2) arrayList.get(i);
            groupCallParticipant = ((gc2) arrayList.get(i)).a;
        } else {
            int size = i - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i - arrayList.size());
                gc2Var = null;
            } else {
                return;
            }
        }
        m75Var.e(gc2Var, groupCallParticipant);
        if (gc2Var2 != null && !gc2Var2.equals(gc2Var) && m75Var.L && m75Var.getRenderer() != null) {
            m75Var.b(false);
            if (gc2Var != null) {
                m75Var.b(true);
            }
        } else if (m75Var.L) {
            if (m75Var.getRenderer() == null && gc2Var != null && this.s) {
                m75Var.b(true);
            } else if (m75Var.getRenderer() != null && gc2Var == null) {
                m75Var.b(false);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new m75(this, viewGroup.getContext()));
    }
}
