package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
public final class k extends h {
    public l f16468u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16468u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f16461f) {
            this.v = f7;
            return;
        }
        if (this.f16468u == null) {
            this.f16468u = new l(f7);
        }
        this.f16468u.f16474i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f16468u;
        if (lVar != null) {
            double d = (float) lVar.f16474i;
            if (d <= this.f16462g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16464j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16461f;
                        if (!z10 && !z10) {
                            this.f16461f = true;
                            if (!this.f16460c) {
                                this.f16459b = this.e.a(this.d);
                            }
                            float f7 = this.f16459b;
                            if (f7 <= this.f16462g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16441f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16443b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new li.k(bVar.f16444c);
                                    }
                                    li.k kVar = bVar.d;
                                    ((Choreographer) kVar.f14821c).postFrameCallback((a) kVar.d);
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
        this.f16468u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16468u = null;
        this.v = Float.MAX_VALUE;
        this.f16468u = new l(f7);
    }
}
