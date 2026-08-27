package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

public final class j extends h {

    public k f19147u;
    public float v;

    public j(hb.a aVar) {
        super(aVar);
        this.f19147u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        k kVar = this.f19147u;
        if (kVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) kVar.f19154i;
        if (d > this.f19142g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f19144j * 0.75f);
        kVar.d = dAbs;
        kVar.f19151e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z10 = this.f19141f;
        if (z10 || z10) {
            return;
        }
        this.f19141f = true;
        if (!this.f19139c) {
            this.f19138b = this.f19140e.a(this.d);
        }
        float f10 = this.f19138b;
        if (f10 > this.f19142g || f10 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = b.f19119f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        ArrayList arrayList = bVar.f19121b;
        if (arrayList.size() == 0) {
            if (bVar.d == null) {
                bVar.d = new j9.a(bVar.f19122c);
            }
            j9.a aVar = bVar.d;
            ((Choreographer) aVar.f12864c).postFrameCallback((a) aVar.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public j(Object obj, i iVar) {
        super(obj, iVar);
        this.f19147u = null;
        this.v = Float.MAX_VALUE;
    }

    public j(Object obj, i iVar, float f10) {
        super(obj, iVar);
        this.f19147u = null;
        this.v = Float.MAX_VALUE;
        this.f19147u = new k(f10);
    }
}
