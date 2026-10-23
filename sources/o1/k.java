package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.g3;
public final class k extends h {
    public l f17622u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f17622u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f17615f) {
            this.v = f7;
            return;
        }
        if (this.f17622u == null) {
            this.f17622u = new l(f7);
        }
        this.f17622u.f17628i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f17622u;
        if (lVar != null) {
            double d = (float) lVar.f17628i;
            if (d <= this.f17616g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f17618j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f17615f;
                        if (!z10 && !z10) {
                            this.f17615f = true;
                            if (!this.f17614c) {
                                this.f17613b = this.e.a(this.d);
                            }
                            float f7 = this.f17613b;
                            if (f7 <= this.f17616g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f17595f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f17597b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new g3(bVar.f17598c);
                                    }
                                    g3 g3Var = bVar.d;
                                    ((Choreographer) g3Var.f16266c).postFrameCallback((a) g3Var.d);
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
        this.f17622u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f17622u = null;
        this.v = Float.MAX_VALUE;
        this.f17622u = new l(f7);
    }
}
