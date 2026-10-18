package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.g3;
public final class k extends h {
    public l f17562u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f17562u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f17555f) {
            this.v = f7;
            return;
        }
        if (this.f17562u == null) {
            this.f17562u = new l(f7);
        }
        this.f17562u.f17568i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f17562u;
        if (lVar != null) {
            double d = (float) lVar.f17568i;
            if (d <= this.f17556g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f17558j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f17555f;
                        if (!z10 && !z10) {
                            this.f17555f = true;
                            if (!this.f17554c) {
                                this.f17553b = this.e.a(this.d);
                            }
                            float f7 = this.f17553b;
                            if (f7 <= this.f17556g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f17535f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f17537b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new g3(bVar.f17538c);
                                    }
                                    g3 g3Var = bVar.d;
                                    ((Choreographer) g3Var.f16204c).postFrameCallback((a) g3Var.d);
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
        this.f17562u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f17562u = null;
        this.v = Float.MAX_VALUE;
        this.f17562u = new l(f7);
    }
}
