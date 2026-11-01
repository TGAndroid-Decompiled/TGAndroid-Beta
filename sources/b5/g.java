package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.p3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f2492a;
    public final Object f2493b;

    public g(Object obj, int i10) {
        this.f2492a = i10;
        this.f2493b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        p3 p3Var = (p3) this.f2493b;
        synchronized (((AtomicMarkableReference) p3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) p3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) p3Var.h).getReference();
                    ((AtomicMarkableReference) p3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) p3Var.f12519a).i((String) p3Var.f12521c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f2492a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f2493b);
            case 1:
                return a();
            default:
                ac.a aVar = (ac.a) this.f2493b;
                ((AtomicReference) aVar.f364c).set(null);
                synchronized (aVar) {
                    try {
                        if (((AtomicMarkableReference) aVar.f363b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) aVar.f363b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) aVar.f363b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    p3 p3Var = (p3) aVar.d;
                    ((y9.f) p3Var.f12519a).g((String) p3Var.f12521c, map, aVar.f362a);
                }
                return null;
        }
    }
}
