package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.p3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f3416a;
    public final Object f3417b;

    public g(Object obj, int i10) {
        this.f3416a = i10;
        this.f3417b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        p3 p3Var = (p3) this.f3417b;
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
            ((x9.f) p3Var.f14280a).i((String) p3Var.f14282c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f3416a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f3417b);
            case 1:
                return a();
            default:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f3417b;
                ((AtomicReference) mVar.f7332c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.f7331b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.f7331b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f7331b;
                            atomicMarkableReference.set((x9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    p3 p3Var = (p3) mVar.d;
                    ((x9.f) p3Var.f14280a).g((String) p3Var.f14282c, map, mVar.f7330a);
                }
                return null;
        }
    }
}
