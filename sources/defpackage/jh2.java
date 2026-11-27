package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jh2 implements Choreographer.FrameCallback {
    public static final long[] r;
    public static jh2 s;
    public final Choreographer a;
    public final SparseArray b;
    public final r89 c;
    public final r89 d;
    public final r89 e;
    public long f;
    public long h;
    public int n;

    static {
        int i;
        boolean z;
        int i2;
        int i3 = 60;
        long[] jArr = new long[60];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = 2;
            int i7 = 1;
            for (int i8 = 2; i8 <= i3; i8++) {
                if (i3 % i8 == 0 && Math.abs(i8 - i5) < Math.abs(i7 - i5)) {
                    i7 = i8;
                }
            }
            int i9 = i3 / i7;
            long j = 0;
            for (int i10 = 0; i10 < i3; i10 += i9) {
                j |= 1 << i10;
            }
            int i11 = i5 - i7;
            int abs = Math.abs(i11);
            int i12 = 0;
            while (i12 < abs) {
                int i13 = (((i12 << 1) + 1) * 60) / (abs << 1);
                int i14 = 0;
                while (true) {
                    i = i3;
                    if (i14 < i3) {
                        int i15 = 0;
                        while (i15 < i6) {
                            if (i15 == 0) {
                                i2 = i14;
                            } else {
                                i2 = -i14;
                            }
                            int i16 = ((i13 + i2) + 60) % 60;
                            long j2 = 1 << i16;
                            long j3 = j & j2;
                            if (i11 > 0) {
                                if (j3 == 0 && (i9 % 2 != 0 || i16 % 2 != 0)) {
                                    j |= j2;
                                    z = true;
                                    break;
                                }
                                i15++;
                                i6 = 2;
                            } else if (j3 == 0) {
                                i15++;
                                i6 = 2;
                            } else {
                                j &= ~j2;
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        if (!z) {
                            i14++;
                            i3 = i;
                            i6 = 2;
                        }
                    }
                }
                i12++;
                i3 = i;
                i6 = 2;
            }
            jArr[i4] = j;
            i4 = i5;
        }
        r = jArr;
    }

    public jh2() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new r89(0, false);
        this.d = new r89(0, false);
        this.e = new r89(0, false);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        grb.i("Choreographer60FpsContent must be used on the main thread");
    }

    public static jh2 d() {
        c();
        jh2 jh2Var = s;
        if (jh2Var == null) {
            jh2 jh2Var2 = new jh2();
            s = jh2Var2;
            return jh2Var2;
        }
        return jh2Var;
    }

    public final void a(int i, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i, 60));
        g(runnable);
        e(max).c.add(runnable);
    }

    public final void b(km kmVar, int i) {
        c();
        int max = Math.max(1, Math.min(i, 60));
        f(kmVar);
        e(max).b.add(kmVar);
    }

    @Override
    public final void doFrame(long j) {
        long j2 = this.h;
        long j3 = 0;
        if (j2 == 0) {
            this.h = j;
        } else {
            long j4 = (j - j2) + this.f;
            this.f = j4;
            this.h = j;
            if (j4 >= 16666666) {
                this.f = j4 % 16666666;
                r89 r89Var = this.d;
                r89 r89Var2 = this.c;
                r89 r89Var3 = this.e;
                SparseArray sparseArray = this.b;
                long j5 = 1 << this.n;
                int i = 0;
                while (i < sparseArray.size()) {
                    ih2 ih2Var = (ih2) sparseArray.valueAt(i);
                    if ((ih2Var.a & j5) != j3) {
                        r89 r89Var4 = ih2Var.d;
                        if (r89Var4 != null) {
                            ih2Var.d = null;
                            Iterator it = r89Var4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = ih2Var.b.iterator();
                        while (it2.hasNext()) {
                            km kmVar = (km) it2.next();
                            switch (kmVar.a) {
                                case 0:
                                    lm lmVar = (lm) kmVar.b;
                                    int i2 = lmVar.R0 + 1;
                                    lmVar.R0 = i2;
                                    if (i2 > 10) {
                                        lmVar.S0 = true;
                                    }
                                    lmVar.i();
                                    if (!lmVar.V0) {
                                        break;
                                    } else {
                                        lmVar.U0 = true;
                                        lmVar.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.F1;
                                    ((EditTextBoldCursor) kmVar.b).invalidate();
                                    break;
                                default:
                                    b29 b29Var = (b29) kmVar.b;
                                    int i3 = b29Var.L0 + 1;
                                    b29Var.L0 = i3;
                                    if (i3 > 10) {
                                        b29Var.M0 = true;
                                    }
                                    b29Var.h();
                                    if (!b29Var.P0) {
                                        break;
                                    } else {
                                        b29Var.O0 = true;
                                        b29Var.s();
                                        break;
                                    }
                            }
                        }
                        Iterator it3 = ih2Var.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i++;
                    j3 = 0;
                }
                Iterator it4 = r89Var3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = r89Var2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                r89Var3.clear();
                r89Var2.clear();
                if (this.n % 2 == 0) {
                    Iterator it6 = r89Var.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    r89Var.clear();
                }
                int i4 = this.n + 1;
                this.n = i4;
                if (i4 == 60) {
                    this.n = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final ih2 e(int i) {
        int max = Math.max(1, Math.min(i, 60));
        SparseArray sparseArray = this.b;
        ih2 ih2Var = (ih2) sparseArray.get(max);
        if (ih2Var == null) {
            ih2 ih2Var2 = new ih2(r[max - 1]);
            sparseArray.put(max, ih2Var2);
            return ih2Var2;
        }
        return ih2Var;
    }

    public final void f(km kmVar) {
        c();
        if (kmVar != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.b;
                if (i < sparseArray.size() && !((ih2) sparseArray.valueAt(i)).b.remove(kmVar)) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.b;
                if (i < sparseArray.size() && !((ih2) sparseArray.valueAt(i)).c.remove(runnable)) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.b;
                if (i < sparseArray.size()) {
                    r89 r89Var = ((ih2) sparseArray.valueAt(i)).d;
                    if (r89Var == null || !r89Var.remove(runnable)) {
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
