package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class j extends h {
    public k f18800u;
    public float v;

    public j(gb.a aVar) {
        super(aVar);
        this.f18800u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        k kVar = this.f18800u;
        if (kVar != null) {
            double d = (float) kVar.f18807i;
            if (d <= this.f18795g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f18797j * 0.75f);
                    kVar.d = abs;
                    kVar.f18804e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f18794f;
                        if (!z10 && !z10) {
                            this.f18794f = true;
                            if (!this.f18792c) {
                                this.f18791b = this.f18793e.a(this.d);
                            }
                            float f10 = this.f18791b;
                            if (f10 <= this.f18795g && f10 >= this.h) {
                                ThreadLocal threadLocal = b.f18772f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f18774b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new j4.c(bVar.f18775c);
                                    }
                                    j4.c cVar = bVar.d;
                                    ((Choreographer) cVar.f13432c).postFrameCallback((a) cVar.d);
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

    public j(Object obj, i iVar) {
        super(obj, iVar);
        this.f18800u = null;
        this.v = Float.MAX_VALUE;
    }

    public j(Object obj, i iVar, float f10) {
        super(obj, iVar);
        this.f18800u = null;
        this.v = Float.MAX_VALUE;
        this.f18800u = new k(f10);
    }
}
