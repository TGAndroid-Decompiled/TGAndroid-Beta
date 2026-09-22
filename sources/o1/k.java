package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f15537u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f15537u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f15537u;
        if (lVar != null) {
            double d = (float) lVar.f15543i;
            if (d <= this.f15531g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f15533j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f15530f;
                        if (!z10 && !z10) {
                            this.f15530f = true;
                            if (!this.f15529c) {
                                this.f15528b = this.e.a(this.d);
                            }
                            float f7 = this.f15528b;
                            if (f7 <= this.f15531g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f15510f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f15512b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new lf.h(bVar.f15513c);
                                    }
                                    lf.h hVar = bVar.d;
                                    ((Choreographer) hVar.f14231c).postFrameCallback((a) hVar.d);
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
        this.f15537u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f15537u = null;
        this.v = Float.MAX_VALUE;
        this.f15537u = new l(f7);
    }
}
