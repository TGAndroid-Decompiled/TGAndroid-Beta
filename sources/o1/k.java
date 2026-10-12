package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.f3;
public final class k extends h {
    public l f16690u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16690u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f16683f) {
            this.v = f7;
            return;
        }
        if (this.f16690u == null) {
            this.f16690u = new l(f7);
        }
        this.f16690u.f16697i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f16690u;
        if (lVar != null) {
            double d = (float) lVar.f16697i;
            if (d <= this.f16684g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16686j * 0.75f);
                    lVar.d = abs;
                    lVar.f16694e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16683f;
                        if (!z10 && !z10) {
                            this.f16683f = true;
                            if (!this.f16681c) {
                                this.f16680b = this.f16682e.a(this.d);
                            }
                            float f7 = this.f16680b;
                            if (f7 <= this.f16684g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16661f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16663b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new f3(bVar.f16664c);
                                    }
                                    f3 f3Var = bVar.d;
                                    ((Choreographer) f3Var.f15424c).postFrameCallback((a) f3Var.d);
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
        this.f16690u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16690u = null;
        this.v = Float.MAX_VALUE;
        this.f16690u = new l(f7);
    }
}
