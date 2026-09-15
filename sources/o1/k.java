package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import m.e3;
public final class k extends h {
    public l f15351u;
    public float v;

    public k(j jVar) {
        super(jVar);
        this.f15351u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.f15351u;
        if (lVar != null) {
            double d = (float) lVar.f15357i;
            if (d <= this.f15345g) {
                if (d >= this.h) {
                    double abs = Math.abs(this.f15347j * 0.75f);
                    lVar.d = abs;
                    lVar.e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f15344f;
                        if (!z10 && !z10) {
                            this.f15344f = true;
                            if (!this.f15343c) {
                                this.f15342b = this.e.a(this.d);
                            }
                            float f7 = this.f15342b;
                            if (f7 <= this.f15345g && f7 >= this.h) {
                                ThreadLocal threadLocal = b.f15324f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new b());
                                }
                                b bVar = (b) threadLocal.get();
                                ArrayList arrayList = bVar.f15326b;
                                if (arrayList.size() == 0) {
                                    if (bVar.d == null) {
                                        bVar.d = new e3(bVar.f15327c);
                                    }
                                    e3 e3Var = bVar.d;
                                    ((Choreographer) e3Var.f14166c).postFrameCallback((a) e3Var.d);
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
        this.f15351u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.f15351u = null;
        this.v = Float.MAX_VALUE;
        this.f15351u = new l(f7);
    }
}
