package ag;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
public final class n implements Choreographer.FrameCallback {
    public static final long[] f1344r;
    public static n f1345s;
    public final Choreographer f1346a;
    public final SparseArray f1347b;
    public final se.b f1348c;
    public final se.b d;
    public final se.b e;
    public long f1349f;
    public long h;
    public int f1350n;

    static {
        int i10;
        boolean z10;
        int i11;
        long j10;
        int i12 = 60;
        long[] jArr = new long[60];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = 2;
            int i16 = 1;
            for (int i17 = 2; i17 <= i12; i17++) {
                if (i12 % i17 == 0 && Math.abs(i17 - i14) < Math.abs(i16 - i14)) {
                    i16 = i17;
                }
            }
            int i18 = i12 / i16;
            long j11 = 0;
            for (int i19 = 0; i19 < i12; i19 += i18) {
                j11 |= 1 << i19;
            }
            int i20 = i14 - i16;
            int abs = Math.abs(i20);
            int i21 = 0;
            while (i21 < abs) {
                int i22 = (((i21 * 2) + 1) * 60) / (abs * 2);
                int i23 = 0;
                while (true) {
                    i10 = i12;
                    if (i23 < i12) {
                        int i24 = 0;
                        while (i24 < i15) {
                            if (i24 == 0) {
                                i11 = i23;
                            } else {
                                i11 = -i23;
                            }
                            int i25 = ((i22 + i11) + 60) % 60;
                            long j12 = 1 << i25;
                            if (i20 > 0) {
                                if ((j11 & j12) == 0 && (i18 % 2 != 0 || i25 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i24++;
                                i15 = 2;
                            } else if ((j11 & j12) == 0) {
                                i24++;
                                i15 = 2;
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
                        i23++;
                        i12 = i10;
                        i15 = 2;
                    }
                }
                i21++;
                i12 = i10;
                i15 = 2;
            }
            jArr[i13] = j11;
            i13 = i14;
        }
        f1344r = jArr;
    }

    public n() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f1346a = choreographer;
        this.f1347b = new SparseArray();
        this.f1348c = new se.b();
        this.d = new se.b();
        this.e = new se.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static n d() {
        c();
        if (f1345s == null) {
            f1345s = new n();
        }
        return f1345s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        g(runnable);
        e(max).f1334c.add(runnable);
    }

    public final void b(m mVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        f(mVar);
        e(max).f1333b.add(mVar);
    }

    @Override
    public final void doFrame(long j10) {
        long j11 = this.h;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j12 = (j10 - j11) + this.f1349f;
            this.f1349f = j12;
            this.h = j10;
            if (j12 >= 16666666) {
                this.f1349f = j12 % 16666666;
                long j13 = 1 << this.f1350n;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f1347b;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    l lVar = (l) sparseArray.valueAt(i10);
                    if ((lVar.f1332a & j13) != 0) {
                        se.b bVar = lVar.d;
                        if (bVar != null) {
                            lVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = lVar.f1333b.iterator();
                        while (it2.hasNext()) {
                            ((m) it2.next()).doFrame(j10);
                        }
                        Iterator it3 = lVar.f1334c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                se.b bVar2 = this.e;
                Iterator it4 = bVar2.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                se.b bVar3 = this.f1348c;
                Iterator it5 = bVar3.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                if (this.f1350n % 2 == 0) {
                    se.b bVar4 = this.d;
                    Iterator it6 = bVar4.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.f1350n + 1;
                this.f1350n = i11;
                if (i11 == 60) {
                    this.f1350n = 0;
                }
            }
        }
        this.f1346a.postFrameCallback(this);
    }

    public final l e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.f1347b;
        l lVar = (l) sparseArray.get(max);
        if (lVar == null) {
            l lVar2 = new l(f1344r[max - 1]);
            sparseArray.put(max, lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final void f(m mVar) {
        c();
        if (mVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f1347b;
                if (i10 < sparseArray.size() && !((l) sparseArray.valueAt(i10)).f1333b.remove(mVar)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f1347b;
                if (i10 < sparseArray.size() && !((l) sparseArray.valueAt(i10)).f1334c.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f1347b;
                if (i10 < sparseArray.size()) {
                    se.b bVar = ((l) sparseArray.valueAt(i10)).d;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i10++;
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
