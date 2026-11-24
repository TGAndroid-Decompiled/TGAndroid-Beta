package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class yda extends fs5 {
    public sca e;
    public final nfa f;

    public yda(nfa nfaVar) {
        this.f = nfaVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s49 s49Var) {
        super.a(recyclerView, s49Var);
        s49Var.a.setPressed(false);
    }

    @Override
    public final int f(RecyclerView recyclerView, s49 s49Var) {
        kfa kfaVar;
        w39 adapter = recyclerView.getAdapter();
        sca scaVar = null;
        if (adapter instanceof kfa) {
            kfaVar = (kfa) adapter;
        } else {
            kfaVar = null;
        }
        if (l() && kfaVar != null && kfaVar.M(s49Var.b())) {
            iea ieaVar = this.f.n0[0];
            if (ieaVar != null) {
                scaVar = ieaVar.h;
            }
            this.e = scaVar;
            if (scaVar != null) {
                scaVar.setItemAnimator(ieaVar.d);
            }
            return fs5.m(15, 0);
        }
        return fs5.m(0, 0);
    }

    @Override
    public final boolean l() {
        nfa nfaVar = this.f;
        if (!nfaVar.F1) {
            oca ocaVar = nfaVar.c0;
            if (ocaVar == null || !ocaVar.f) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        kfa kfaVar;
        y1b y1bVar;
        ArrayList arrayList;
        w39 adapter = recyclerView.getAdapter();
        if (adapter instanceof kfa) {
            kfaVar = (kfa) adapter;
        } else {
            kfaVar = null;
        }
        if (kfaVar == null || !kfaVar.M(s49Var.b()) || !kfaVar.M(s49Var2.b())) {
            return false;
        }
        int b = s49Var.b();
        int b2 = s49Var2.b();
        ArrayList arrayList2 = kfaVar.E;
        if (!kfaVar.h && (y1bVar = kfaVar.s) != null && b >= 0 && b < y1bVar.i.size() && b2 >= 0 && b2 < kfaVar.s.i.size()) {
            if (!(kfaVar.s instanceof s1b) && kfaVar.n <= 0) {
                arrayList = new ArrayList(kfaVar.s.g);
            } else {
                arrayList = new ArrayList();
                for (int i = 0; i < kfaVar.s.i.size(); i++) {
                    arrayList.add(Integer.valueOf(((k27) kfaVar.s.i.get(i)).e1()));
                }
            }
            if (!kfaVar.F) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                kfaVar.F = true;
            }
            k27 k27Var = (k27) kfaVar.s.i.get(b);
            k27 k27Var2 = (k27) kfaVar.s.i.get(b2);
            arrayList.remove(Integer.valueOf(k27Var.e1()));
            arrayList.add(Utilities.j(b2, arrayList.size(), 0), Integer.valueOf(k27Var.e1()));
            kfaVar.s.C(arrayList, false);
            kfaVar.j(b, b2);
        }
        return true;
    }

    @Override
    public final void q(s49 s49Var, int i) {
        y1b y1bVar;
        ArrayList arrayList;
        boolean z;
        sca scaVar = this.e;
        if (scaVar != null && s49Var != null) {
            scaVar.e1(false);
        }
        sca scaVar2 = this.e;
        if (i == 0) {
            if (scaVar2 != null && (scaVar2.getAdapter() instanceof kfa)) {
                kfa kfaVar = (kfa) this.e.getAdapter();
                ArrayList arrayList2 = kfaVar.E;
                if (!kfaVar.h && (y1bVar = kfaVar.s) != null && kfaVar.F) {
                    if (!(y1bVar instanceof s1b) && kfaVar.n <= 0) {
                        arrayList = y1bVar.g;
                    } else {
                        arrayList = new ArrayList();
                        for (int i2 = 0; i2 < kfaVar.s.i.size(); i2++) {
                            arrayList.add(Integer.valueOf(((k27) kfaVar.s.i.get(i2)).e1()));
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
                        kfaVar.s.C(arrayList, true);
                    }
                    kfaVar.F = false;
                }
            }
            sca scaVar3 = this.e;
            if (scaVar3 != null) {
                scaVar3.setItemAnimator(null);
                return;
            }
            return;
        }
        if (scaVar2 != null) {
            scaVar2.J0(false);
        }
        if (s49Var != null) {
            s49Var.a.setPressed(true);
        }
    }

    @Override
    public final void r(s49 s49Var) {
    }
}
