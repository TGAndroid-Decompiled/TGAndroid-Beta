package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f16938u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16938u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f16931f) {
            this.v = f7;
            return;
        }
        if (this.f16938u == null) {
            this.f16938u = new l(f7);
        }
        this.f16938u.f16945i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f16938u;
        if (lVar != null) {
            double d = (float) lVar.f16945i;
            if (d <= this.f16932g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16934j * 0.75f);
                    lVar.d = abs;
                    lVar.f16942e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16931f;
                        if (!z10 && !z10) {
                            this.f16931f = true;
                            if (!this.f16929c) {
                                this.f16928b = this.f16930e.a(this.d);
                            }
                            float f7 = this.f16928b;
                            if (f7 <= this.f16932g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16909f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16911b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new la.h(bVar.f16912c);
                                    }
                                    la.h hVar = bVar.d;
                                    ((Choreographer) hVar.f15463c).postFrameCallback((a) hVar.d);
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
        this.f16938u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16938u = null;
        this.v = Float.MAX_VALUE;
        this.f16938u = new l(f7);
    }
}
