package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
public final class xf9 implements gk7 {
    public final int a;
    public final xl3 b;
    public k27 c;
    public oac d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public xf9(int i, jm6 jm6Var, xl3 xl3Var) {
        this.a = i;
        this.b = xl3Var;
    }

    public static boolean c(jm6 jm6Var) {
        ArrayList arrayList;
        if (!jm6Var.b) {
            ArrayList arrayList2 = jm6Var.q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = jm6Var.q;
            } else {
                arrayList = jm6Var.p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    mac macVar = (mac) arrayList.get(i);
                    if (macVar != null) {
                        if (macVar.a == 0) {
                            byte b = macVar.b;
                            if ((b & 1) != 0 || (b & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = macVar.k;
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
                    MediaController.w().d(this.c);
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
        xl3 xl3Var = this.b;
        ye9 ye9Var = (ye9) xl3Var.d;
        IdentityHashMap identityHashMap = ye9Var.i4;
        iy6 iy6Var = (iy6) xl3Var.b;
        identityHashMap.remove(iy6Var);
        iy6Var.a = (byte) 3;
        ye9Var.r4((lk0) xl3Var.c, iy6Var);
        ye9Var.p3.onContentChanged();
    }

    public final void d() {
        kk7 f = kk7.f(this.a);
        f.n(this, kk7.Z1);
        f.n(this, kk7.a2);
        f.n(this, kk7.b2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xl3 xl3Var = this.b;
        lk0 lk0Var = (lk0) xl3Var.c;
        iy6 iy6Var = (iy6) xl3Var.b;
        ye9 ye9Var = (ye9) xl3Var.d;
        if (!this.h && !this.n && i2 == this.a && objArr.length != 0 && objArr[0] == this.c) {
            if (i == kk7.a2) {
                long longValue = ((Long) objArr[3]).longValue();
                iy6Var.f = ((Float) objArr[4]).floatValue();
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof vf9) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.n = true;
                    d();
                    String str = this.e;
                    oac oacVar = this.d;
                    int i3 = oacVar.k;
                    int i4 = oacVar.l;
                    int ceil = (int) Math.ceil(oacVar.r / 1000.0d);
                    ye9Var.i4.remove(iy6Var);
                    iy6Var.b = true;
                    iy6Var.e = str;
                    if (i3 > 0) {
                        iy6Var.j = i3;
                    }
                    if (i4 > 0) {
                        iy6Var.k = i4;
                    }
                    iy6Var.l = 0;
                    iy6Var.m = 0;
                    iy6Var.f = 0.0f;
                    ye9Var.o4(lk0Var);
                    ye9Var.O4((lk0) xl3Var.c, iy6Var, str, true, iy6Var.j, iy6Var.k, ceil);
                }
            } else if (i == kk7.b2) {
                b();
            }
        }
    }
}
