package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import l3.g0;
public final class k extends i {
    public l f19045u;
    public float v;

    public k(ib.a aVar) {
        super(aVar);
        this.f19045u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f19045u;
        if (lVar != null) {
            double d = (float) lVar.f19052i;
            if (d <= this.f19040g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f19042j * 0.75f);
                    lVar.d = abs;
                    lVar.f19049e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f19039f;
                        if (!z10 && !z10) {
                            this.f19039f = true;
                            if (!this.f19037c) {
                                this.f19036b = this.f19038e.a(this.d);
                            }
                            float f9 = this.f19036b;
                            if (f9 <= this.f19040g && f9 >= this.h) {
                                ThreadLocal threadLocal = c.f19017f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new c());
                                }
                                c cVar = (c) threadLocal.get();
                                ArrayList arrayList = cVar.f19019b;
                                if (arrayList.size() == 0) {
                                    if (cVar.d == null) {
                                        cVar.d = new g0(cVar.f19020c);
                                    }
                                    g0 g0Var = cVar.d;
                                    ((Choreographer) g0Var.f14097c).postFrameCallback((b) g0Var.d);
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

    public k(Object obj, j jVar) {
        super(obj, jVar);
        this.f19045u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, j jVar, float f9) {
        super(obj, jVar);
        this.f19045u = null;
        this.v = Float.MAX_VALUE;
        this.f19045u = new l(f9);
    }
}
