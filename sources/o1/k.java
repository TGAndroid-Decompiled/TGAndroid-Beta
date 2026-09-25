package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f15533u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f15533u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f15533u;
        if (lVar != null) {
            double d = (float) lVar.f15539i;
            if (d <= this.f15527g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f15529j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f15526f;
                        if (!z10 && !z10) {
                            this.f15526f = true;
                            if (!this.f15525c) {
                                this.f15524b = this.e.a(this.d);
                            }
                            float f7 = this.f15524b;
                            if (f7 <= this.f15527g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f15506f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f15508b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new la.h(bVar.f15509c);
                                    }
                                    la.h hVar = bVar.d;
                                    ((Choreographer) hVar.f14167c).postFrameCallback((a) hVar.d);
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
        this.f15533u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f15533u = null;
        this.v = Float.MAX_VALUE;
        this.f15533u = new l(f7);
    }
}
