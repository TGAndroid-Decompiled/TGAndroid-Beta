package bg;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.mh0;
public final class k implements Choreographer.FrameCallback {
    public static final long[] f3284r;
    public static k f3285s;
    public final Choreographer f3286a;
    public final SparseArray f3287b;
    public final xe.b f3288c;
    public final xe.b d;
    public final xe.b f3289e;
    public long f3290f;
    public long h;
    public int f3291n;

    static {
        int i7;
        boolean z10;
        int i10;
        long j3;
        int i11 = 60;
        long[] jArr = new long[60];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = 2;
            int i15 = 1;
            for (int i16 = 2; i16 <= i11; i16++) {
                if (i11 % i16 == 0 && Math.abs(i16 - i13) < Math.abs(i15 - i13)) {
                    i15 = i16;
                }
            }
            int i17 = i11 / i15;
            long j10 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j10 |= 1 << i18;
            }
            int i19 = i13 - i15;
            int abs = Math.abs(i19);
            int i20 = 0;
            while (i20 < abs) {
                int i21 = (((i20 * 2) + 1) * 60) / (abs * 2);
                int i22 = 0;
                while (true) {
                    i7 = i11;
                    if (i22 < i11) {
                        int i23 = 0;
                        while (i23 < i14) {
                            if (i23 == 0) {
                                i10 = i22;
                            } else {
                                i10 = -i22;
                            }
                            int i24 = ((i21 + i10) + 60) % 60;
                            long j11 = 1 << i24;
                            if (i19 > 0) {
                                if ((j10 & j11) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                    j3 = j11 | j10;
                                    j10 = j3;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            } else if ((j10 & j11) == 0) {
                                i23++;
                                i14 = 2;
                            } else {
                                j3 = (~j11) & j10;
                                j10 = j3;
                                z10 = true;
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i22++;
                        i11 = i7;
                        i14 = 2;
                    }
                }
                i20++;
                i11 = i7;
                i14 = 2;
            }
            jArr[i12] = j10;
            i12 = i13;
        }
        f3284r = jArr;
    }

    public k() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f3286a = choreographer;
        this.f3287b = new SparseArray();
        this.f3288c = new xe.b();
        this.d = new xe.b();
        this.f3289e = new xe.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static k d() {
        c();
        if (f3285s == null) {
            f3285s = new k();
        }
        return f3285s;
    }

    public final void a(int i7, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i7, 60));
        f(runnable);
        e(max).f3275c.add(runnable);
    }

    public final void b(a6 a6Var, int i7) {
        c();
        int max = Math.max(1, Math.min(i7, 60));
        g(a6Var);
        e(max).f3274b.add(a6Var);
    }

    @Override
    public final void doFrame(long j3) {
        long j10 = this.h;
        long j11 = 0;
        if (j10 == 0) {
            this.h = j3;
        } else {
            long j12 = (j3 - j10) + this.f3290f;
            this.f3290f = j12;
            this.h = j3;
            if (j12 >= 16666666) {
                this.f3290f = j12 % 16666666;
                xe.b bVar = this.d;
                xe.b bVar2 = this.f3288c;
                xe.b bVar3 = this.f3289e;
                SparseArray sparseArray = this.f3287b;
                long j13 = 1 << this.f3291n;
                int i7 = 0;
                while (i7 < sparseArray.size()) {
                    j jVar = (j) sparseArray.valueAt(i7);
                    if ((jVar.f3273a & j13) != j11) {
                        xe.b bVar4 = jVar.d;
                        if (bVar4 != null) {
                            jVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = jVar.f3274b.iterator();
                        while (it2.hasNext()) {
                            a6 a6Var = (a6) it2.next();
                            int i10 = a6Var.f33251a;
                            Object obj = a6Var.f33252b;
                            switch (i10) {
                                case 0:
                                    b6 b6Var = (b6) obj;
                                    int i11 = b6Var.R0 + 1;
                                    b6Var.R0 = i11;
                                    if (i11 > 10) {
                                        b6Var.S0 = true;
                                    }
                                    b6Var.i();
                                    if (!b6Var.V0) {
                                        break;
                                    } else {
                                        b6Var.U0 = true;
                                        b6Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.E1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    mh0.g((mh0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = jVar.f3275c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i7++;
                    j11 = 0;
                }
                Iterator it4 = bVar3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar3.clear();
                bVar2.clear();
                if (this.f3291n % 2 == 0) {
                    Iterator it6 = bVar.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar.clear();
                }
                int i12 = this.f3291n + 1;
                this.f3291n = i12;
                if (i12 == 60) {
                    this.f3291n = 0;
                }
            }
        }
        this.f3286a.postFrameCallback(this);
    }

    public final j e(int i7) {
        int max = Math.max(1, Math.min(i7, 60));
        SparseArray sparseArray = this.f3287b;
        j jVar = (j) sparseArray.get(max);
        if (jVar == null) {
            j jVar2 = new j(f3284r[max - 1]);
            sparseArray.put(max, jVar2);
            return jVar2;
        }
        return jVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f3287b;
                if (i7 < sparseArray.size() && !((j) sparseArray.valueAt(i7)).f3275c.remove(runnable)) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(a6 a6Var) {
        c();
        if (a6Var != null) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f3287b;
                if (i7 < sparseArray.size() && !((j) sparseArray.valueAt(i7)).f3274b.remove(a6Var)) {
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f3287b;
                if (i7 < sparseArray.size()) {
                    xe.b bVar = ((j) sparseArray.valueAt(i7)).d;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i7++;
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
