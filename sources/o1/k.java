package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.h3;
public final class k extends h {
    public l f16161u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f16161u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void g(float f7) {
        if (this.f16154f) {
            this.v = f7;
            return;
        }
        if (this.f16161u == null) {
            this.f16161u = new l(f7);
        }
        this.f16161u.f16167i = f7;
        h();
    }

    public final void h() {
        l lVar = this.f16161u;
        if (lVar != null) {
            double d = (float) lVar.f16167i;
            if (d <= this.f16155g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f16157j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16154f;
                        if (!z10 && !z10) {
                            this.f16154f = true;
                            if (!this.f16153c) {
                                this.f16152b = this.e.a(this.d);
                            }
                            float f7 = this.f16152b;
                            if (f7 <= this.f16155g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f16134f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f16136b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new h3(bVar.f16137c);
                                    }
                                    h3 h3Var = bVar.d;
                                    ((Choreographer) h3Var.f14851c).postFrameCallback((a) h3Var.d);
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
        this.f16161u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f16161u = null;
        this.v = Float.MAX_VALUE;
        this.f16161u = new l(f7);
    }
}
