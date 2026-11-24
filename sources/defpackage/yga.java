package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class yga extends q59 {
    public final Context c;
    public final wr9 d;
    public boolean h;
    public sea s;
    public final nha y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final c0a n = new c0a(this, (byte) 16);
    public final m69 r = new m69();
    public final hu5 w = new hu5(new r20(this, (byte) 7));
    public final HashSet x = new HashSet();

    public yga(nha nhaVar, Context context) {
        this.y = nhaVar;
        this.c = context;
        wr9 E1 = nhaVar.y1.getMessagesController().E1();
        this.d = E1;
        if (nhaVar.h0()) {
            E1.g(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        vr9 vr9Var;
        boolean z;
        int i;
        if (view instanceof hg3) {
            hg3 hg3Var = (hg3) view;
            long dialogId = hg3Var.getDialogId();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                arrayList = this.f;
                if (i3 < arrayList.size()) {
                    if (((vr9) arrayList.get(i3)).a == dialogId) {
                        vr9Var = (vr9) arrayList.get(i3);
                        break;
                    }
                    i3++;
                } else {
                    vr9Var = null;
                    break;
                }
            }
            if (vr9Var == null) {
                return;
            }
            Long valueOf = Long.valueOf(vr9Var.a);
            HashSet hashSet = this.x;
            boolean contains = hashSet.contains(valueOf);
            long j = vr9Var.a;
            nha nhaVar = this.y;
            if (contains) {
                hashSet.remove(Long.valueOf(j));
                if (hashSet.size() <= 0 && nhaVar.F1) {
                    nhaVar.l1(false);
                }
            } else {
                hashSet.add(Long.valueOf(j));
                if (hashSet.size() > 0 && !nhaVar.F1) {
                    nhaVar.l1(true);
                    r7 r7Var = nhaVar.x0;
                    if (r7Var != null) {
                        r7Var.setVisibility(8);
                    }
                    r7 r7Var2 = nhaVar.w0;
                    if (r7Var2 != null) {
                        r7Var2.setVisibility(8);
                    }
                }
            }
            nhaVar.j1(hashSet.size(), true);
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
                        vr9 vr9Var2 = (vr9) arrayList.get(i4);
                        if (vr9Var2.a == longValue) {
                            if (vr9Var2.b) {
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
            r7 r7Var3 = nhaVar.y0;
            if (r7Var3 != null) {
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                r7Var3.setVisibility(i);
            }
            r7 r7Var4 = nhaVar.z0;
            if (r7Var4 != null) {
                if (!z) {
                    i2 = 8;
                }
                r7Var4.setVisibility(i2);
            }
            hg3Var.d0(hashSet.contains(Long.valueOf(vr9Var.a)), true);
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
                return ((vr9) arrayList.get(i)).a;
            }
        }
        return i;
    }

    @Override
    public final int d(int i) {
        return 13;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        if (!(view instanceof hg3)) {
            return;
        }
        hg3 hg3Var = (hg3) view;
        ArrayList arrayList = this.f;
        vr9 vr9Var = (vr9) arrayList.get(i);
        hg3Var.e0(vr9Var.a, vr9Var.d, vr9Var.c(), false, false);
        boolean z = true;
        hg3Var.t0 = true;
        hg3Var.d0(this.x.contains(Long.valueOf(vr9Var.a)), false);
        if (i + 1 >= arrayList.size()) {
            z = false;
        }
        hg3Var.t2 = z;
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xga xgaVar = new xga(this, this.c);
        nha nhaVar = this.y;
        xgaVar.setDialogCellDelegate(nhaVar);
        xgaVar.s0 = true;
        anb.h(cmb.c6, nhaVar.I1, xgaVar);
        return new u69(xgaVar);
    }
}
