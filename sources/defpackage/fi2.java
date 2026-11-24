package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fi2 implements Choreographer.FrameCallback {
    public static final long[] r;
    public static fi2 s;
    public final Choreographer a;
    public final SparseArray b;
    public final g79 c;
    public final g79 d;
    public final g79 e;
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

    public fi2() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new g79(0, false);
        this.d = new g79(0, false);
        this.e = new g79(0, false);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        dq9.m("Choreographer60FpsContent must be used on the main thread");
    }

    public static fi2 d() {
        c();
        fi2 fi2Var = s;
        if (fi2Var == null) {
            fi2 fi2Var2 = new fi2();
            s = fi2Var2;
            return fi2Var2;
        }
        return fi2Var;
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

    public final void b(jn jnVar, int i) {
        c();
        int max = Math.max(1, Math.min(i, 60));
        f(jnVar);
        e(max).b.add(jnVar);
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
                g79 g79Var = this.d;
                g79 g79Var2 = this.c;
                g79 g79Var3 = this.e;
                SparseArray sparseArray = this.b;
                long j5 = 1 << this.n;
                int i = 0;
                while (i < sparseArray.size()) {
                    ei2 ei2Var = (ei2) sparseArray.valueAt(i);
                    if ((ei2Var.a & j5) != j3) {
                        g79 g79Var4 = ei2Var.d;
                        if (g79Var4 != null) {
                            ei2Var.d = null;
                            Iterator it = g79Var4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = ei2Var.b.iterator();
                        while (it2.hasNext()) {
                            jn jnVar = (jn) it2.next();
                            switch (jnVar.a) {
                                case 0:
                                    kn knVar = (kn) jnVar.b;
                                    int i2 = knVar.R0 + 1;
                                    knVar.R0 = i2;
                                    if (i2 > 10) {
                                        knVar.S0 = true;
                                    }
                                    knVar.i();
                                    if (!knVar.V0) {
                                        break;
                                    } else {
                                        knVar.U0 = true;
                                        knVar.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.E1;
                                    ((EditTextBoldCursor) jnVar.b).invalidate();
                                    break;
                                default:
                                    p09 p09Var = (p09) jnVar.b;
                                    int i3 = p09Var.L0 + 1;
                                    p09Var.L0 = i3;
                                    if (i3 > 10) {
                                        p09Var.M0 = true;
                                    }
                                    p09Var.h();
                                    if (!p09Var.P0) {
                                        break;
                                    } else {
                                        p09Var.O0 = true;
                                        p09Var.s();
                                        break;
                                    }
                            }
                        }
                        Iterator it3 = ei2Var.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i++;
                    j3 = 0;
                }
                Iterator it4 = g79Var3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = g79Var2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                g79Var3.clear();
                g79Var2.clear();
                if (this.n % 2 == 0) {
                    Iterator it6 = g79Var.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    g79Var.clear();
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

    public final ei2 e(int i) {
        int max = Math.max(1, Math.min(i, 60));
        SparseArray sparseArray = this.b;
        ei2 ei2Var = (ei2) sparseArray.get(max);
        if (ei2Var == null) {
            ei2 ei2Var2 = new ei2(r[max - 1]);
            sparseArray.put(max, ei2Var2);
            return ei2Var2;
        }
        return ei2Var;
    }

    public final void f(jn jnVar) {
        c();
        if (jnVar != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.b;
                if (i < sparseArray.size() && !((ei2) sparseArray.valueAt(i)).b.remove(jnVar)) {
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
                if (i < sparseArray.size() && !((ei2) sparseArray.valueAt(i)).c.remove(runnable)) {
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
                    g79 g79Var = ((ei2) sparseArray.valueAt(i)).d;
                    if (g79Var == null || !g79Var.remove(runnable)) {
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
