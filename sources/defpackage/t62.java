package defpackage;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class t62 extends jb8 {
    public ArrayList a = new ArrayList();
    public final w62 b;

    public t62(w62 w62Var) {
        this.b = w62Var;
    }

    @Override
    public final void D() {
        w62 w62Var = this.b;
        w62Var.c();
        w62Var.i(w62Var.Q.Q, false);
    }

    @Override
    public final int E(int i, rcc rccVar) {
        if (i >= 0 && i < this.a.size()) {
            Integer valueOf = Integer.valueOf(((jo6) this.a.get(i)).C);
            w62 w62Var = this.b;
            int indexOf = w62Var.h.indexOf(valueOf);
            ArrayList arrayList = w62Var.h;
            if (indexOf >= 0) {
                if (arrayList.size() > 1) {
                    w62Var.h.remove(indexOf);
                    w62Var.c();
                    return indexOf;
                }
                return -1;
            }
            arrayList.add(valueOf);
            w62Var.c();
            return w62Var.h.size() - 1;
        }
        return -1;
    }

    @Override
    public final int H() {
        return this.b.h.size();
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jo6 jo6Var;
        ArrayList arrayList;
        w62 w62Var = this.b;
        ArrayList arrayList2 = w62Var.b;
        x62 x62Var = w62Var.Q;
        if (i >= 0 && i < this.a.size() && w(i) && (jo6Var = (jo6) this.a.get(i)) != null) {
            int size = arrayList2.size();
            v62 v62Var = null;
            u62 u62Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                v62Var = (v62) arrayList2.get(i2);
                if (v62Var != null && (arrayList = v62Var.h) != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        u62 u62Var2 = (u62) arrayList.get(i3);
                        if (u62Var2 != null && u62Var2.b == jo6Var && u62Var2.k > 0.5d) {
                            u62Var = (u62) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (u62Var != null) {
                        break;
                    }
                }
            }
            if (v62Var != null && u62Var != null) {
                qb8 qb8Var = new qb8();
                int[] iArr = new int[2];
                w62Var.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - x62Var.b.Q();
                }
                qb8Var.b = iArr[0];
                qb8Var.c = iArr[1] + ((int) v62Var.a);
                qb8Var.k = 1.0f;
                qb8Var.d = w62Var;
                ImageReceiver imageReceiver = u62Var.c;
                qb8Var.a = imageReceiver;
                qb8Var.e = imageReceiver.p();
                qb8Var.h = r3;
                RectF rectF = u62Var.q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                qb8Var.j = (int) (-w62Var.getY());
                qb8Var.i = w62Var.getHeight() - ((int) (((-w62Var.getY()) + x62Var.r.getHeight()) - x62Var.b.T0()));
                return qb8Var;
            }
        }
        return null;
    }

    @Override
    public final int S(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((jo6) obj).C);
        w62 w62Var = this.b;
        if (w62Var.h.size() > 1 && (indexOf = w62Var.h.indexOf(valueOf)) >= 0) {
            w62Var.h.remove(indexOf);
            w62Var.c();
            return indexOf;
        }
        return -1;
    }

    @Override
    public final int T(int i) {
        jo6 jo6Var;
        if (i >= 0 && i < this.a.size() && (jo6Var = (jo6) this.a.get(i)) != null) {
            return this.b.h.indexOf(Integer.valueOf(jo6Var.C));
        }
        return -1;
    }

    @Override
    public final void Y(int i) {
        jo6 jo6Var;
        ArrayList arrayList;
        boolean z;
        w62 w62Var = this.b;
        ArrayList arrayList2 = w62Var.b;
        if (i >= 0 && i < this.a.size() && (jo6Var = (jo6) this.a.get(i)) != null) {
            int i2 = jo6Var.C;
            w62Var.invalidate();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                v62 v62Var = (v62) arrayList2.get(i3);
                if (v62Var != null && (arrayList = v62Var.h) != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        u62 u62Var = (u62) arrayList.get(i4);
                        if (u62Var != null && u62Var.b.C == i2) {
                            u62Var.f(jo6Var);
                        }
                    }
                    r62 r62Var = v62Var.k;
                    if (r62Var != null && ((ArrayList) r62Var.f) != null) {
                        z = false;
                        for (int i5 = 0; i5 < ((ArrayList) v62Var.k.f).size(); i5++) {
                            if (((jo6) ((ArrayList) v62Var.k.f).get(i5)).C == i2) {
                                ((ArrayList) v62Var.k.f).set(i5, jo6Var);
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        v62Var.b(v62Var.k, true);
                    }
                }
            }
            w62Var.g();
            w62Var.invalidate();
        }
    }

    @Override
    public final ArrayList d() {
        return this.b.h;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final HashMap u() {
        return this.b.d;
    }

    @Override
    public final boolean w(int i) {
        if (i >= 0 && i < this.a.size()) {
            return this.b.h.contains(Integer.valueOf(((jo6) this.a.get(i)).C));
        }
        return false;
    }
}
