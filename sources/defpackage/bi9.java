package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
public final class bi9 implements jm7 {
    public final int a;
    public final in3 b;
    public k47 c;
    public rcc d;
    public String e;
    public boolean f;
    public boolean h;
    public boolean n;

    public bi9(int i, jo6 jo6Var, in3 in3Var) {
        this.a = i;
        this.b = in3Var;
    }

    public static boolean c(jo6 jo6Var) {
        ArrayList arrayList;
        if (!jo6Var.b) {
            ArrayList arrayList2 = jo6Var.q;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = jo6Var.q;
            } else {
                arrayList = jo6Var.p;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    pcc pccVar = (pcc) arrayList.get(i);
                    if (pccVar != null) {
                        if (pccVar.a == 0) {
                            byte b = pccVar.b;
                            if ((b & 1) != 0 || (b & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList arrayList3 = pccVar.k;
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
        in3 in3Var = this.b;
        ch9 ch9Var = (ch9) in3Var.d;
        IdentityHashMap identityHashMap = ch9Var.i4;
        i07 i07Var = (i07) in3Var.b;
        identityHashMap.remove(i07Var);
        i07Var.a = (byte) 3;
        ch9Var.r4((ll0) in3Var.c, i07Var);
        ch9Var.p3.onContentChanged();
    }

    public final void d() {
        nm7 f = nm7.f(this.a);
        f.n(this, nm7.a2);
        f.n(this, nm7.b2);
        f.n(this, nm7.c2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        in3 in3Var = this.b;
        ll0 ll0Var = (ll0) in3Var.c;
        i07 i07Var = (i07) in3Var.b;
        ch9 ch9Var = (ch9) in3Var.d;
        if (!this.h && !this.n && i2 == this.a && objArr.length != 0 && objArr[0] == this.c) {
            if (i == nm7.b2) {
                long longValue = ((Long) objArr[3]).longValue();
                i07Var.f = ((Float) objArr[4]).floatValue();
                View C1 = ch9Var.C1(ll0Var);
                if (C1 instanceof zh9) {
                    C1.requestLayout();
                    C1.invalidate();
                }
                if (longValue > 0) {
                    this.n = true;
                    d();
                    String str = this.e;
                    rcc rccVar = this.d;
                    int i3 = rccVar.k;
                    int i4 = rccVar.l;
                    int ceil = (int) Math.ceil(rccVar.r / 1000.0d);
                    ch9Var.i4.remove(i07Var);
                    i07Var.b = true;
                    i07Var.e = str;
                    if (i3 > 0) {
                        i07Var.j = i3;
                    }
                    if (i4 > 0) {
                        i07Var.k = i4;
                    }
                    i07Var.l = 0;
                    i07Var.m = 0;
                    i07Var.f = 0.0f;
                    ch9Var.o4(ll0Var);
                    ch9Var.O4((ll0) in3Var.c, i07Var, str, true, i07Var.j, i07Var.k, ceil);
                }
            } else if (i == nm7.c2) {
                b();
            }
        }
    }
}
