package defpackage;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class y52 extends yc8 {
    public ArrayList a = new ArrayList();
    public final b62 b;

    public y52(b62 b62Var) {
        this.b = b62Var;
    }

    @Override
    public final void C() {
        b62 b62Var = this.b;
        b62Var.c();
        b62Var.i(b62Var.Q.Q, false);
    }

    @Override
    public final int D(int i, oec oecVar) {
        if (i >= 0 && i < this.a.size()) {
            Integer valueOf = Integer.valueOf(((no6) this.a.get(i)).C);
            b62 b62Var = this.b;
            int indexOf = b62Var.h.indexOf(valueOf);
            ArrayList arrayList = b62Var.h;
            if (indexOf >= 0) {
                if (arrayList.size() > 1) {
                    b62Var.h.remove(indexOf);
                    b62Var.c();
                    return indexOf;
                }
                return -1;
            }
            arrayList.add(valueOf);
            b62Var.c();
            return b62Var.h.size() - 1;
        }
        return -1;
    }

    @Override
    public final int G() {
        return this.b.h.size();
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        no6 no6Var;
        ArrayList arrayList;
        b62 b62Var = this.b;
        ArrayList arrayList2 = b62Var.b;
        c62 c62Var = b62Var.Q;
        if (i >= 0 && i < this.a.size() && w(i) && (no6Var = (no6) this.a.get(i)) != null) {
            int size = arrayList2.size();
            a62 a62Var = null;
            z52 z52Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                a62Var = (a62) arrayList2.get(i2);
                if (a62Var != null && (arrayList = a62Var.h) != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        z52 z52Var2 = (z52) arrayList.get(i3);
                        if (z52Var2 != null && z52Var2.b == no6Var && z52Var2.k > 0.5d) {
                            z52Var = (z52) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (z52Var != null) {
                        break;
                    }
                }
            }
            if (a62Var != null && z52Var != null) {
                fd8 fd8Var = new fd8();
                int[] iArr = new int[2];
                b62Var.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - c62Var.b.Q();
                }
                fd8Var.b = iArr[0];
                fd8Var.c = iArr[1] + ((int) a62Var.a);
                fd8Var.k = 1.0f;
                fd8Var.d = b62Var;
                ImageReceiver imageReceiver = z52Var.c;
                fd8Var.a = imageReceiver;
                fd8Var.e = imageReceiver.p();
                fd8Var.h = r3;
                RectF rectF = z52Var.q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                fd8Var.j = (int) (-b62Var.getY());
                fd8Var.i = b62Var.getHeight() - ((int) (((-b62Var.getY()) + c62Var.r.getHeight()) - c62Var.b.U0()));
                return fd8Var;
            }
        }
        return null;
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((no6) obj).C);
        b62 b62Var = this.b;
        if (b62Var.h.size() > 1 && (indexOf = b62Var.h.indexOf(valueOf)) >= 0) {
            b62Var.h.remove(indexOf);
            b62Var.c();
            return indexOf;
        }
        return -1;
    }

    @Override
    public final int S(int i) {
        no6 no6Var;
        if (i >= 0 && i < this.a.size() && (no6Var = (no6) this.a.get(i)) != null) {
            return this.b.h.indexOf(Integer.valueOf(no6Var.C));
        }
        return -1;
    }

    @Override
    public final void X(int i) {
        no6 no6Var;
        ArrayList arrayList;
        boolean z;
        b62 b62Var = this.b;
        ArrayList arrayList2 = b62Var.b;
        if (i >= 0 && i < this.a.size() && (no6Var = (no6) this.a.get(i)) != null) {
            int i2 = no6Var.C;
            b62Var.invalidate();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                a62 a62Var = (a62) arrayList2.get(i3);
                if (a62Var != null && (arrayList = a62Var.h) != null) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        z52 z52Var = (z52) arrayList.get(i4);
                        if (z52Var != null && z52Var.b.C == i2) {
                            z52Var.f(no6Var);
                        }
                    }
                    w52 w52Var = a62Var.k;
                    if (w52Var != null && ((ArrayList) w52Var.f) != null) {
                        z = false;
                        for (int i5 = 0; i5 < ((ArrayList) a62Var.k.f).size(); i5++) {
                            if (((no6) ((ArrayList) a62Var.k.f).get(i5)).C == i2) {
                                ((ArrayList) a62Var.k.f).set(i5, no6Var);
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        a62Var.b(a62Var.k, true);
                    }
                }
            }
            b62Var.g();
            b62Var.invalidate();
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
            return this.b.h.contains(Integer.valueOf(((no6) this.a.get(i)).C));
        }
        return false;
    }
}
