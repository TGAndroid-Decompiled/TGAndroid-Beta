package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m2.t;
public final class k extends h {
    public l f16852u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16852u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f16852u;
        if (lVar != null) {
            double d = (float) lVar.f16859i;
            if (d <= this.f16846g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16848j * 0.75f);
                    lVar.d = abs;
                    lVar.f16856e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16845f;
                        if (!z10 && !z10) {
                            this.f16845f = true;
                            if (!this.f16843c) {
                                this.f16842b = this.f16844e.a(this.d);
                            }
                            float f7 = this.f16842b;
                            if (f7 <= this.f16846g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16823f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16825b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new t(bVar.f16826c);
                                    }
                                    t tVar = bVar.d;
                                    ((Choreographer) tVar.f15845c).postFrameCallback((a) tVar.d);
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
        this.f16852u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16852u = null;
        this.v = Float.MAX_VALUE;
        this.f16852u = new l(f7);
    }
}
