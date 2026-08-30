package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import l7.w0;
public final class j extends h {
    public k f16198u;
    public float v;

    public j(kb.a aVar) {
        super(aVar);
        this.f16198u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        k kVar = this.f16198u;
        if (kVar != null) {
            double d = (float) kVar.f16204i;
            if (d <= this.f16193g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16195j * 0.75f);
                    kVar.d = abs;
                    kVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z4 = this.f16192f;
                        if (!z4 && !z4) {
                            this.f16192f = true;
                            if (!this.f16191c) {
                                this.f16190b = this.e.a(this.d);
                            }
                            float f10 = this.f16190b;
                            if (f10 <= this.f16193g && f10 >= this.h) {
                                ThreadLocal threadLocal = b.f16172f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16174b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new w0(bVar.f16175c);
                                    }
                                    w0 w0Var = bVar.d;
                                    ((Choreographer) w0Var.f11677c).postFrameCallback((a) w0Var.d);
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
        this.f16198u = null;
        this.v = Float.MAX_VALUE;
    }

    public j(Object obj, i iVar, float f10) {
        super(obj, iVar);
        this.f16198u = null;
        this.v = Float.MAX_VALUE;
        this.f16198u = new k(f10);
    }
}
