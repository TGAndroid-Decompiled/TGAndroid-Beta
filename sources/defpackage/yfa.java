package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class yfa extends eu5 {
    public sea e;
    public final nha f;

    public yfa(nha nhaVar) {
        this.f = nhaVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, u69 u69Var) {
        super.a(recyclerView, u69Var);
        u69Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, u69 u69Var) {
        kha khaVar;
        y59 adapter = recyclerView.getAdapter();
        sea seaVar = null;
        if (adapter instanceof kha) {
            khaVar = (kha) adapter;
        } else {
            khaVar = null;
        }
        if (l() && khaVar != null && khaVar.M(u69Var.b())) {
            iga igaVar = this.f.n0[0];
            if (igaVar != null) {
                seaVar = igaVar.h;
            }
            this.e = seaVar;
            if (seaVar != null) {
                seaVar.setItemAnimator(igaVar.d);
            }
            return eu5.m(15, 0);
        }
        return eu5.m(0, 0);
    }

    @Override
    public final boolean l() {
        nha nhaVar = this.f;
        if (!nhaVar.F1) {
            oea oeaVar = nhaVar.c0;
            if (oeaVar == null || !oeaVar.f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        kha khaVar;
        z3b z3bVar;
        ArrayList arrayList;
        y59 adapter = recyclerView.getAdapter();
        if (adapter instanceof kha) {
            khaVar = (kha) adapter;
        } else {
            khaVar = null;
        }
        if (khaVar == null || !khaVar.M(u69Var.b()) || !khaVar.M(u69Var2.b())) {
            return false;
        }
        int b = u69Var.b();
        int b2 = u69Var2.b();
        ArrayList arrayList2 = khaVar.E;
        if (!khaVar.h && (z3bVar = khaVar.s) != null && b >= 0 && b < z3bVar.i.size() && b2 >= 0 && b2 < khaVar.s.i.size()) {
            if (!(khaVar.s instanceof t3b) && khaVar.n <= 0) {
                arrayList = new ArrayList(khaVar.s.g);
            } else {
                arrayList = new ArrayList();
                for (int i = 0; i < khaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((k47) khaVar.s.i.get(i)).e1()));
                }
            }
            if (!khaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                khaVar.F = true;
            }
            k47 k47Var = (k47) khaVar.s.i.get(b);
            k47 k47Var2 = (k47) khaVar.s.i.get(b2);
            arrayList.remove(Integer.valueOf(k47Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(k47Var.e1()));
            khaVar.s.C(arrayList, false);
            khaVar.j(b, b2);
        }
        return true;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        z3b z3bVar;
        ArrayList arrayList;
        boolean z;
        sea seaVar = this.e;
        if (seaVar != null && u69Var != null) {
            seaVar.e1(false);
        }
        sea seaVar2 = this.e;
        if (i == 0) {
            if (seaVar2 != null && (seaVar2.getAdapter() instanceof kha)) {
                kha khaVar = (kha) this.e.getAdapter();
                ArrayList arrayList2 = khaVar.E;
                if (!khaVar.h && (z3bVar = khaVar.s) != null && khaVar.F) {
                    if (!(z3bVar instanceof t3b) && khaVar.n <= 0) {
                        arrayList = z3bVar.g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i2 = 0; i2 < khaVar.s.i.size(); i2++) {
                            arrayList.add(Integer.valueOf(((k47) khaVar.s.i.get(i2)).e1()));
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
                        khaVar.s.C(arrayList, true);
                    }
                    khaVar.F = false;
                }
            }
            sea seaVar3 = this.e;
            if (seaVar3 != null) {
                seaVar3.setItemAnimator(null);
                return;
            }
            return;
        }
        if (seaVar2 != null) {
            seaVar2.J0(false);
        }
        if (u69Var != null) {
            u69Var.a.setPressed(true);
        }
    }

    @Override
    public final void r(u69 u69Var) {
    }
}
