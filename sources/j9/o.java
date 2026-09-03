package j9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class o implements Callable {
    public final int f9981a;
    public final Object f9982b;

    public o(Object obj, int i10) {
        this.f9981a = i10;
        this.f9982b = obj;
    }

    private final Object a() {
        Map map;
        cb.m mVar = (cb.m) this.f9982b;
        ((AtomicReference) mVar.d).set(null);
        synchronized (mVar) {
            try {
                if (((AtomicMarkableReference) mVar.f2425b).isMarked()) {
                    map = ((d) ((AtomicMarkableReference) mVar.f2425b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f2425b;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            r3 r3Var = (r3) mVar.f2426c;
            ((g) r3Var.f13329a).g((String) r3Var.f13331c, map, mVar.f2424a);
        }
        return null;
    }

    @Override
    public final Object call() {
        boolean z4;
        String str;
        switch (this.f9981a) {
            case 0:
                r3 r3Var = (r3) this.f9982b;
                synchronized (((AtomicMarkableReference) r3Var.h)) {
                    try {
                        z4 = false;
                        if (((AtomicMarkableReference) r3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                            ((AtomicMarkableReference) r3Var.h).set(str, false);
                            z4 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z4) {
                    ((g) r3Var.f13329a).i((String) r3Var.f13331c, str);
                }
                return null;
            case 1:
                return a();
            default:
                return new o2.f((JsReplyProxyBoundaryInterface) this.f9982b);
        }
    }
}
