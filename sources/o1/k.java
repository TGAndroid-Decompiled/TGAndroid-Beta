package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f16983u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16983u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f16983u;
        if (lVar != null) {
            double d = (float) lVar.f16990i;
            if (d <= this.f16977g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16979j * 0.75f);
                    lVar.d = abs;
                    lVar.f16987e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16976f;
                        if (!z10 && !z10) {
                            this.f16976f = true;
                            if (!this.f16974c) {
                                this.f16973b = this.f16975e.a(this.d);
                            }
                            float f7 = this.f16973b;
                            if (f7 <= this.f16977g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16954f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16956b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new la.h(bVar.f16957c);
                                    }
                                    la.h hVar = bVar.d;
                                    ((Choreographer) hVar.f15398c).postFrameCallback((a) hVar.d);
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
        this.f16983u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16983u = null;
        this.v = Float.MAX_VALUE;
        this.f16983u = new l(f7);
    }
}
