package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.e3;
public final class k extends h {
    public l f14134u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f14134u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f14134u;
        if (lVar != null) {
            double d = (float) lVar.f14140i;
            if (d <= this.f14128g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f14130j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f14127f;
                        if (!z10 && !z10) {
                            this.f14127f = true;
                            if (!this.f14126c) {
                                this.f14125b = this.e.a(this.d);
                            }
                            float f7 = this.f14125b;
                            if (f7 <= this.f14128g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f14107f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f14109b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new e3(bVar.f14110c);
                                    }
                                    e3 e3Var = bVar.d;
                                    ((Choreographer) e3Var.f13002c).postFrameCallback((a) e3Var.d);
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
        this.f14134u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f14134u = null;
        this.v = Float.MAX_VALUE;
        this.f14134u = new l(f7);
    }
}
