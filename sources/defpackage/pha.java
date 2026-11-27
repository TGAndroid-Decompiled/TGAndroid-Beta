package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pha extends iu5 {
    public jga e;
    public final eja f;

    public pha(eja ejaVar) {
        this.f = ejaVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f89 f89Var) {
        super.a(recyclerView, f89Var);
        f89Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, f89 f89Var) {
        bja bjaVar;
        j79 adapter = recyclerView.getAdapter();
        jga jgaVar = null;
        if (adapter instanceof bja) {
            bjaVar = (bja) adapter;
        } else {
            bjaVar = null;
        }
        if (l() && bjaVar != null && bjaVar.M(f89Var.b())) {
            zha zhaVar = this.f.n0[0];
            if (zhaVar != null) {
                jgaVar = zhaVar.h;
            }
            this.e = jgaVar;
            if (jgaVar != null) {
                jgaVar.setItemAnimator(zhaVar.d);
            }
            return iu5.m(15, 0);
        }
        return iu5.m(0, 0);
    }

    @Override
    public final boolean l() {
        eja ejaVar = this.f;
        if (!ejaVar.F1) {
            fga fgaVar = ejaVar.c0;
            if (fgaVar == null || !fgaVar.f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        bja bjaVar;
        u5b u5bVar;
        ArrayList arrayList;
        j79 adapter = recyclerView.getAdapter();
        if (adapter instanceof bja) {
            bjaVar = (bja) adapter;
        } else {
            bjaVar = null;
        }
        if (bjaVar == null || !bjaVar.M(f89Var.b()) || !bjaVar.M(f89Var2.b())) {
            return false;
        }
        int b = f89Var.b();
        int b2 = f89Var2.b();
        ArrayList arrayList2 = bjaVar.E;
        if (!bjaVar.h && (u5bVar = bjaVar.s) != null && b >= 0 && b < u5bVar.i.size() && b2 >= 0 && b2 < bjaVar.s.i.size()) {
            if (!(bjaVar.s instanceof o5b) && bjaVar.n <= 0) {
                arrayList = new ArrayList(bjaVar.s.g);
            } else {
                arrayList = new ArrayList();
                for (int i = 0; i < bjaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((r47) bjaVar.s.i.get(i)).e1()));
                }
            }
            if (!bjaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                bjaVar.F = true;
            }
            r47 r47Var = (r47) bjaVar.s.i.get(b);
            r47 r47Var2 = (r47) bjaVar.s.i.get(b2);
            arrayList.remove(Integer.valueOf(r47Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(r47Var.e1()));
            bjaVar.s.C(arrayList, false);
            bjaVar.j(b, b2);
        }
        return true;
    }

    @Override
    public final void q(f89 f89Var, int i) {
        u5b u5bVar;
        ArrayList arrayList;
        boolean z;
        jga jgaVar = this.e;
        if (jgaVar != null && f89Var != null) {
            jgaVar.f1(false);
        }
        jga jgaVar2 = this.e;
        if (i == 0) {
            if (jgaVar2 != null && (jgaVar2.getAdapter() instanceof bja)) {
                bja bjaVar = (bja) this.e.getAdapter();
                ArrayList arrayList2 = bjaVar.E;
                if (!bjaVar.h && (u5bVar = bjaVar.s) != null && bjaVar.F) {
                    if (!(u5bVar instanceof o5b) && bjaVar.n <= 0) {
                        arrayList = u5bVar.g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i2 = 0; i2 < bjaVar.s.i.size(); i2++) {
                            arrayList.add(Integer.valueOf(((r47) bjaVar.s.i.get(i2)).e1()));
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                break;
                            } else if (arrayList2.get(i3) != arrayList.get(i3)) {
                                z = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        bjaVar.s.C(arrayList, true);
                    }
                    bjaVar.F = false;
                }
            }
            jga jgaVar3 = this.e;
            if (jgaVar3 != null) {
                jgaVar3.setItemAnimator(null);
                return;
            }
            return;
        }
        if (jgaVar2 != null) {
            jgaVar2.K0(false);
        }
        if (f89Var != null) {
            f89Var.a.setPressed(true);
        }
    }

    @Override
    public final void r(f89 f89Var) {
    }
}
