package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
public final class oj9 implements fn7 {
    public final int a;
    public final pm3 b;
    public r47 c;
    public oec d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public oj9(int i, no6 no6Var, pm3 pm3Var) {
        this.a = i;
        this.b = pm3Var;
    }

    public static boolean c(no6 no6Var) {
        ArrayList arrayList;
        if (!no6Var.b) {
            ArrayList arrayList2 = no6Var.q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = no6Var.q;
            } else {
                arrayList = no6Var.p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    mec mecVar = (mec) arrayList.get(i);
                    if (mecVar != null) {
                        if (mecVar.a == 0) {
                            byte b = mecVar.b;
                            if ((b & 1) != 0 || (b & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = mecVar.k;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!this.n && !this.h) {
            this.h = true;
            if (this.c != null && this.d != null) {
                try {
                    MediaController.z().d(this.c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        d();
        pm3 pm3Var = this.b;
        pi9 pi9Var = (pi9) pm3Var.d;
        IdentityHashMap identityHashMap = pi9Var.i4;
        p07 p07Var = (p07) pm3Var.b;
        identityHashMap.remove(p07Var);
        p07Var.a = (byte) 3;
        pi9Var.s4((mk0) pm3Var.c, p07Var);
        pi9Var.p3.onContentChanged();
    }

    public final void d() {
        jn7 f = jn7.f(this.a);
        f.n(this, jn7.a2);
        f.n(this, jn7.b2);
        f.n(this, jn7.c2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pm3 pm3Var = this.b;
        mk0 mk0Var = (mk0) pm3Var.c;
        p07 p07Var = (p07) pm3Var.b;
        pi9 pi9Var = (pi9) pm3Var.d;
        if (!this.h && !this.n && i2 == this.a && objArr.length != 0 && objArr[0] == this.c) {
            if (i == jn7.b2) {
                long longValue = ((Long) objArr[3]).longValue();
                p07Var.f = ((Float) objArr[4]).floatValue();
                View D1 = pi9Var.D1(mk0Var);
                if (D1 instanceof mj9) {
                    D1.requestLayout();
                    D1.invalidate();
                }
                if (longValue > 0) {
                    this.n = true;
                    d();
                    String str = this.e;
                    oec oecVar = this.d;
                    int i3 = oecVar.k;
                    int i4 = oecVar.l;
                    int ceil = (int) Math.ceil(oecVar.r / 1000.0d);
                    pi9Var.i4.remove(p07Var);
                    p07Var.b = true;
                    p07Var.e = str;
                    if (i3 > 0) {
                        p07Var.j = i3;
                    }
                    if (i4 > 0) {
                        p07Var.k = i4;
                    }
                    p07Var.l = 0;
                    p07Var.m = 0;
                    p07Var.f = 0.0f;
                    pi9Var.p4(mk0Var);
                    pi9Var.P4((mk0) pm3Var.c, p07Var, str, true, p07Var.j, p07Var.k, ceil);
                }
            } else if (i == jn7.c2) {
                b();
            }
        }
    }
}
