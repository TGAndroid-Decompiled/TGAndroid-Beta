package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class j extends h {
    public k f18969u;
    public float v;

    public j(ac.a aVar) {
        super(aVar);
        this.f18969u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f18963f) {
            this.v = f7;
            return;
        }
        if (this.f18969u == null) {
            this.f18969u = new k(f7);
        }
        this.f18969u.f18975i = f7;
        h();
    }

    public final void h() {
        k kVar = this.f18969u;
        if (kVar != null) {
            double d = (float) kVar.f18975i;
            if (d <= this.f18964g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f18966j * 0.75f);
                    kVar.d = abs;
                    kVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f18963f;
                        if (!z10 && !z10) {
                            this.f18963f = true;
                            if (!this.f18962c) {
                                this.f18961b = this.e.a(this.d);
                            }
                            float f7 = this.f18961b;
                            if (f7 <= this.f18964g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f18943f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f18945b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new k6.c(bVar.f18946c);
                                    }
                                    k6.c cVar = bVar.d;
                                    ((Choreographer) cVar.f16407c).postFrameCallback((a) cVar.d);
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
        this.f18969u = null;
        this.v = Float.MAX_VALUE;
    }

    public j(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f18969u = null;
        this.v = Float.MAX_VALUE;
        this.f18969u = new k(f7);
    }
}
