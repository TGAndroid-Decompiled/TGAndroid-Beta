package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m2.t;
public final class k extends h {
    public l f16825u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16825u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f16825u;
        if (lVar != null) {
            double d = (float) lVar.f16832i;
            if (d <= this.f16819g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16821j * 0.75f);
                    lVar.d = abs;
                    lVar.f16829e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16818f;
                        if (!z10 && !z10) {
                            this.f16818f = true;
                            if (!this.f16816c) {
                                this.f16815b = this.f16817e.a(this.d);
                            }
                            float f7 = this.f16815b;
                            if (f7 <= this.f16819g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16796f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16798b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new t(bVar.f16799c);
                                    }
                                    t tVar = bVar.d;
                                    ((Choreographer) tVar.f15818c).postFrameCallback((a) tVar.d);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public k(Object obj, i iVar) {
        super(obj, iVar);
        this.f16825u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16825u = null;
        this.v = Float.MAX_VALUE;
        this.f16825u = new l(f7);
    }
}
