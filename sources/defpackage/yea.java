package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class yea extends n39 {
    public final Context c;
    public final vp9 d;
    public boolean h;
    public sca s;
    public final nfa y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final z6a n = new z6a(this, (byte) 8);
    public final k49 r = new k49();
    public final is5 w = new is5(new r10(this, (byte) 7));
    public final HashSet x = new HashSet();

    public yea(nfa nfaVar, Context context) {
        this.y = nfaVar;
        this.c = context;
        vp9 D1 = nfaVar.y1.getMessagesController().D1();
        this.d = D1;
        if (nfaVar.h0()) {
            D1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        up9 up9Var;
        boolean z;
        int i;
        if (view instanceof ue3) {
            ue3 ue3Var = (ue3) view;
            long dialogId = ue3Var.getDialogId();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                arrayList = this.f;
                if (i3 < arrayList.size()) {
                    if (((up9) arrayList.get(i3)).a == dialogId) {
                        up9Var = (up9) arrayList.get(i3);
                        break;
                    }
                    i3++;
                } else {
                    up9Var = null;
                    break;
                }
            }
            if (up9Var == null) {
                return;
            }
            Long valueOf = Long.valueOf(up9Var.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            long j = up9Var.a;
            nfa nfaVar = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(j));
                if (hashSet.size() <= 0 && nfaVar.F1) {
                    nfaVar.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(j));
                if (hashSet.size() > 0 && !nfaVar.F1) {
                    nfaVar.l1(true);
                    r7 r7Var = nfaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility(8);
                    }
                    r7 r7Var2 = nfaVar.w0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                }
            }
            nfaVar.j1(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList.size()) {
                        up9 up9Var2 = (up9) arrayList.get(i4);
                        if (up9Var2.a == longValue) {
                            if (up9Var2.b) {
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                        } else {
                            i4++;
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            r7 r7Var3 = nfaVar.y0;
            if (r7Var3 != null) {
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                r7Var3.setVisibility(i);
            }
            r7 r7Var4 = nfaVar.z0;
            if (r7Var4 != null) {
                if (!z) {
                    i2 = 8;
                }
                r7Var4.setVisibility(i2);
            }
            ue3Var.e0(hashSet.contains(Long.valueOf(up9Var.a)), true);
        }
    }

    public final void F(boolean z) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.j);
        if (z) {
            f();
        }
    }

    @Override
    public final int b() {
        return this.f.size();
    }

    @Override
    public final long c(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                return ((up9) arrayList.get(i)).a;
            }
        }
        return i;
    }

    @Override
    public final int d(int i) {
        return 13;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        if (!(view instanceof ue3)) {
            return;
        }
        ue3 ue3Var = (ue3) view;
        ArrayList arrayList = this.f;
        up9 up9Var = (up9) arrayList.get(i);
        ue3Var.f0(up9Var.a, up9Var.d, up9Var.c(), false, false);
        boolean z = true;
        ue3Var.t0 = true;
        ue3Var.e0(this.x.contains(Long.valueOf(up9Var.a)), false);
        if (i + 1 >= arrayList.size()) {
            z = false;
        }
        ue3Var.t2 = z;
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        xea xeaVar = new xea(this, this.c);
        nfa nfaVar = this.y;
        xeaVar.setDialogCellDelegate(nfaVar);
        xeaVar.s0 = true;
        zkb.h(bkb.c6, nfaVar.I1, xeaVar);
        return new s49(xeaVar);
    }
}
