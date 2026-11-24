package defpackage;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i52 extends i98 {
    public ArrayList a = new ArrayList();
    public final l52 b;

    public i52(l52 l52Var) {
        this.b = l52Var;
    }

    @Override
    public final void C() {
        l52 l52Var = this.b;
        l52Var.c();
        l52Var.i(l52Var.Q.Q, false);
    }

    @Override
    public final int D(int i, oac oacVar) {
        if (i >= 0 && i < this.a.size()) {
            Integer valueOf = Integer.valueOf(((jm6) this.a.get(i)).C);
            l52 l52Var = this.b;
            int indexOf = l52Var.h.indexOf(valueOf);
            ArrayList arrayList = l52Var.h;
            if (indexOf >= 0) {
                if (arrayList.size() > 1) {
                    l52Var.h.remove(indexOf);
                    l52Var.c();
                    return indexOf;
                }
                return -1;
            }
            arrayList.add(valueOf);
            l52Var.c();
            return l52Var.h.size() - 1;
        }
        return -1;
    }

    @Override
    public final int G() {
        return this.b.h.size();
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jm6 jm6Var;
        ArrayList arrayList;
        l52 l52Var = this.b;
        ArrayList arrayList2 = l52Var.b;
        m52 m52Var = l52Var.Q;
        if (i >= 0 && i < this.a.size() && w(i) && (jm6Var = (jm6) this.a.get(i)) != null) {
            int size = arrayList2.size();
            k52 k52Var = null;
            j52 j52Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                k52Var = (k52) arrayList2.get(i2);
                if (k52Var != null && (arrayList = k52Var.h) != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        j52 j52Var2 = (j52) arrayList.get(i3);
                        if (j52Var2 != null && j52Var2.b == jm6Var && j52Var2.k > 0.5d) {
                            j52Var = (j52) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (j52Var != null) {
                        break;
                    }
                }
            }
            if (k52Var != null && j52Var != null) {
                p98 p98Var = new p98();
                int[] iArr = new int[2];
                l52Var.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - m52Var.b.R();
                }
                p98Var.b = iArr[0];
                p98Var.c = iArr[1] + ((int) k52Var.a);
                p98Var.k = 1.0f;
                p98Var.d = l52Var;
                ImageReceiver imageReceiver = j52Var.c;
                p98Var.a = imageReceiver;
                p98Var.e = imageReceiver.p();
                p98Var.h = r3;
                RectF rectF = j52Var.q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                p98Var.j = (int) (-l52Var.getY());
                p98Var.i = l52Var.getHeight() - ((int) (((-l52Var.getY()) + m52Var.r.getHeight()) - m52Var.b.T0()));
                return p98Var;
            }
        }
        return null;
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((jm6) obj).C);
        l52 l52Var = this.b;
        if (l52Var.h.size() > 1 && (indexOf = l52Var.h.indexOf(valueOf)) >= 0) {
            l52Var.h.remove(indexOf);
            l52Var.c();
            return indexOf;
        }
        return -1;
    }

    @Override
    public final int S(int i) {
        jm6 jm6Var;
        if (i >= 0 && i < this.a.size() && (jm6Var = (jm6) this.a.get(i)) != null) {
            return this.b.h.indexOf(Integer.valueOf(jm6Var.C));
        }
        return -1;
    }

    @Override
    public final void X(int i) {
        jm6 jm6Var;
        ArrayList arrayList;
        boolean z;
        l52 l52Var = this.b;
        ArrayList arrayList2 = l52Var.b;
        if (i >= 0 && i < this.a.size() && (jm6Var = (jm6) this.a.get(i)) != null) {
            int i2 = jm6Var.C;
            l52Var.invalidate();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                k52 k52Var = (k52) arrayList2.get(i3);
                if (k52Var != null && (arrayList = k52Var.h) != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        j52 j52Var = (j52) arrayList.get(i4);
                        if (j52Var != null && j52Var.b.C == i2) {
                            j52Var.f(jm6Var);
                        }
                    }
                    g52 g52Var = k52Var.k;
                    if (g52Var != null && ((ArrayList) g52Var.f) != null) {
                        z = false;
                        for (int i5 = 0; i5 < ((ArrayList) k52Var.k.f).size(); i5++) {
                            if (((jm6) ((ArrayList) k52Var.k.f).get(i5)).C == i2) {
                                ((ArrayList) k52Var.k.f).set(i5, jm6Var);
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        k52Var.b(k52Var.k, true);
                    }
                }
            }
            l52Var.g();
            l52Var.invalidate();
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
            return this.b.h.contains(Integer.valueOf(((jm6) this.a.get(i)).C));
        }
        return false;
    }
}
