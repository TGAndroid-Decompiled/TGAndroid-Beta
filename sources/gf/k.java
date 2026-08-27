package gf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class k implements Choreographer.FrameCallback {

    public static k f7023s;

    public final Choreographer f7024a;

    public final LinkedHashSet f7025b;

    public final SparseArray f7026c;
    public final yd.b d;

    public final yd.b f7027e;

    public final yd.b f7028f;
    public long h;

    public long f7029n;

    public int f7030r;

    public k() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f7024a = choreographer;
        this.f7025b = new LinkedHashSet();
        this.f7026c = new SparseArray();
        this.d = new yd.b(true);
        this.f7027e = new yd.b(true);
        this.f7028f = new yd.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static k d() {
        c();
        if (f7023s == null) {
            f7023s = new k();
        }
        return f7023s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int iMax = Math.max(1, Math.min(i10, 60));
        g(runnable);
        e(iMax).f7008e.add(runnable);
    }

    public final void b(j jVar, int i10) {
        c();
        int iMax = Math.max(1, Math.min(i10, 60));
        f(jVar);
        e(iMax).d.add(jVar);
    }

    @Override
    public final void doFrame(long j10) {
        yd.b bVar;
        Iterator it;
        Iterator it2;
        Iterator it3;
        long j11 = this.f7029n;
        if (j11 == 0) {
            this.f7029n = j10;
        } else {
            long j12 = (j10 - j11) + this.h;
            this.h = j12;
            this.f7029n = j10;
            if (j12 >= 16666666) {
                this.h = j12 % 16666666;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f7026c;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    i iVar = (i) sparseArray.valueAt(i10);
                    int i11 = iVar.f7006b;
                    if (i11 <= 0) {
                        long j13 = iVar.f7007c + 16666666;
                        iVar.f7007c = j13;
                        long j14 = iVar.f7005a;
                        if (j13 >= j14) {
                            iVar.f7007c = j13 % j14;
                            bVar = iVar.f7009f;
                            if (bVar != null) {
                                iVar.f7009f = null;
                                it3 = bVar.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                            }
                            it = iVar.d.iterator();
                            while (it.hasNext()) {
                                ((j) it.next()).doFrame(j10);
                            }
                            it2 = iVar.f7008e.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                        }
                    } else if (this.f7030r % i11 == 0) {
                        bVar = iVar.f7009f;
                        if (bVar != null) {
                            iVar.f7009f = null;
                            it3 = bVar.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                        }
                        it = iVar.d.iterator();
                        while (it.hasNext()) {
                            ((j) it.next()).doFrame(j10);
                        }
                        it2 = iVar.f7008e.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    }
                    i10++;
                }
                LinkedHashSet linkedHashSet = this.f7025b;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((j) it4.next()).doFrame(j10);
                }
                yd.b bVar2 = this.f7028f;
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                yd.b bVar3 = this.d;
                Iterator it6 = bVar3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.f7030r % 2 == 0) {
                    yd.b bVar4 = this.f7027e;
                    Iterator it7 = bVar4.iterator();
                    while (it7.hasNext()) {
                        ((Drawable) it7.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                this.f7030r++;
            }
        }
        this.f7024a.postFrameCallback(this);
    }

    public final i e(int i10) {
        SparseArray sparseArray = this.f7026c;
        i iVar = (i) sparseArray.get(i10);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1000000000 / ((long) i10), 60 % i10 == 0 ? 60 / i10 : 0);
        sparseArray.put(i10, iVar2);
        return iVar2;
    }

    public final void f(j jVar) {
        c();
        if (jVar == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f7026c;
            if (i10 >= sparseArray.size() || ((i) sparseArray.valueAt(i10)).d.remove(jVar)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f7026c;
            if (i10 >= sparseArray.size() || ((i) sparseArray.valueAt(i10)).f7008e.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f7026c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            yd.b bVar = ((i) sparseArray.valueAt(i10)).f7009f;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
