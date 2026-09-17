package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.p3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f2518a;
    public final Object f2519b;

    public g(Object obj, int i10) {
        this.f2518a = i10;
        this.f2519b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        p3 p3Var = (p3) this.f2519b;
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
            ((x9.f) p3Var.f15661a).i((String) p3Var.f15663c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f2518a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f2519b);
            case 1:
                return a();
            default:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f2519b;
                ((AtomicReference) mVar.f6400c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.f6399b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.f6399b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f6399b;
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
                    ((x9.f) p3Var.f15661a).g((String) p3Var.f15663c, map, mVar.f6398a);
                }
                return null;
        }
    }
}
