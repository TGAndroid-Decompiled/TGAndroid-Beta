package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f3414a;
    public final Object f3415b;

    public g(Object obj, int i10) {
        this.f3414a = i10;
        this.f3415b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        q3 q3Var = (q3) this.f3415b;
        synchronized (((AtomicMarkableReference) q3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) q3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) q3Var.h).getReference();
                    ((AtomicMarkableReference) q3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((x9.f) q3Var.f14288a).i((String) q3Var.f14290c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f3414a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f3415b);
            case 1:
                return a();
            default:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f3415b;
                ((AtomicReference) mVar.f7330c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.f7329b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.f7329b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f7329b;
                            atomicMarkableReference.set((x9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    q3 q3Var = (q3) mVar.d;
                    ((x9.f) q3Var.f14288a).g((String) q3Var.f14290c, map, mVar.f7328a);
                }
                return null;
        }
    }
}
