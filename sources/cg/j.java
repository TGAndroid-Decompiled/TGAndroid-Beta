package cg;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t5;
public final class j implements Choreographer.FrameCallback {
    public static final long[] f4698r;
    public static j f4699s;
    public final Choreographer f4700a;
    public final SparseArray f4701b;
    public final ue.b f4702c;
    public final ue.b d;
    public final ue.b f4703e;
    public long f4704f;
    public long h;
    public int f4705n;

    static {
        int i3;
        boolean z10;
        int i10;
        long j10;
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
            long j11 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j11 |= 1 << i18;
            }
            int i19 = i13 - i15;
            int abs = Math.abs(i19);
            int i20 = 0;
            while (i20 < abs) {
                int i21 = (((i20 * 2) + 1) * 60) / (abs * 2);
                int i22 = 0;
                while (true) {
                    i3 = i11;
                    if (i22 < i11) {
                        int i23 = 0;
                        while (i23 < i14) {
                            if (i23 == 0) {
                                i10 = i22;
                            } else {
                                i10 = -i22;
                            }
                            int i24 = ((i21 + i10) + 60) % 60;
                            long j12 = 1 << i24;
                            if (i19 > 0) {
                                if ((j11 & j12) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            } else if ((j11 & j12) == 0) {
                                i23++;
                                i14 = 2;
                            } else {
                                j10 = (~j12) & j11;
                                j11 = j10;
                                z10 = true;
                                break;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i22++;
                        i11 = i3;
                        i14 = 2;
                    }
                }
                i20++;
                i11 = i3;
                i14 = 2;
            }
            jArr[i12] = j11;
            i12 = i13;
        }
        f4698r = jArr;
    }

    public j() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f4700a = choreographer;
        this.f4701b = new SparseArray();
        this.f4702c = new ue.b();
        this.d = new ue.b();
        this.f4703e = new ue.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static j d() {
        c();
        if (f4699s == null) {
            f4699s = new j();
        }
        return f4699s;
    }

    public final void a(int i3, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i3, 60));
        f(runnable);
        e(max).f4694c.add(runnable);
    }

    public final void b(s5 s5Var, int i3) {
        c();
        int max = Math.max(1, Math.min(i3, 60));
        g(s5Var);
        e(max).f4693b.add(s5Var);
    }

    @Override
    public final void doFrame(long j10) {
        long j11 = this.h;
        long j12 = 0;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j13 = (j10 - j11) + this.f4704f;
            this.f4704f = j13;
            this.h = j10;
            if (j13 >= 16666666) {
                this.f4704f = j13 % 16666666;
                ue.b bVar = this.d;
                ue.b bVar2 = this.f4702c;
                ue.b bVar3 = this.f4703e;
                SparseArray sparseArray = this.f4701b;
                long j14 = 1 << this.f4705n;
                int i3 = 0;
                while (i3 < sparseArray.size()) {
                    i iVar = (i) sparseArray.valueAt(i3);
                    if ((iVar.f4692a & j14) != j12) {
                        ue.b bVar4 = iVar.d;
                        if (bVar4 != null) {
                            iVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = iVar.f4693b.iterator();
                        while (it2.hasNext()) {
                            s5 s5Var = (s5) it2.next();
                            int i10 = s5Var.f37907a;
                            Object obj = s5Var.f37908b;
                            switch (i10) {
                                case 0:
                                    t5 t5Var = (t5) obj;
                                    int i11 = t5Var.R0 + 1;
                                    t5Var.R0 = i11;
                                    if (i11 > 10) {
                                        t5Var.S0 = true;
                                    }
                                    t5Var.i();
                                    if (!t5Var.V0) {
                                        break;
                                    } else {
                                        t5Var.U0 = true;
                                        t5Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.f31400z1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    ch0.g((ch0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = iVar.f4694c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i3++;
                    j12 = 0;
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
                if (this.f4705n % 2 == 0) {
                    Iterator it6 = bVar.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar.clear();
                }
                int i12 = this.f4705n + 1;
                this.f4705n = i12;
                if (i12 == 60) {
                    this.f4705n = 0;
                }
            }
        }
        this.f4700a.postFrameCallback(this);
    }

    public final i e(int i3) {
        int max = Math.max(1, Math.min(i3, 60));
        SparseArray sparseArray = this.f4701b;
        i iVar = (i) sparseArray.get(max);
        if (iVar == null) {
            i iVar2 = new i(f4698r[max - 1]);
            sparseArray.put(max, iVar2);
            return iVar2;
        }
        return iVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = this.f4701b;
                if (i3 < sparseArray.size() && !((i) sparseArray.valueAt(i3)).f4694c.remove(runnable)) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(s5 s5Var) {
        c();
        if (s5Var != null) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = this.f4701b;
                if (i3 < sparseArray.size() && !((i) sparseArray.valueAt(i3)).f4693b.remove(s5Var)) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = this.f4701b;
                if (i3 < sparseArray.size()) {
                    ue.b bVar = ((i) sparseArray.valueAt(i3)).d;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i3++;
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
