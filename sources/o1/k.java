package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f15549u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f15549u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f15549u;
        if (lVar != null) {
            double d = (float) lVar.f15555i;
            if (d <= this.f15543g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f15545j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f15542f;
                        if (!z10 && !z10) {
                            this.f15542f = true;
                            if (!this.f15541c) {
                                this.f15540b = this.e.a(this.d);
                            }
                            float f7 = this.f15540b;
                            if (f7 <= this.f15543g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f15522f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f15524b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new la.h(bVar.f15525c);
                                    }
                                    la.h hVar = bVar.d;
                                    ((Choreographer) hVar.f14183c).postFrameCallback((a) hVar.d);
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
        this.f15549u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f15549u = null;
        this.v = Float.MAX_VALUE;
        this.f15549u = new l(f7);
    }
}
