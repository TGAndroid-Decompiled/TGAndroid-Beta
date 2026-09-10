package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f2112a;
    public final Object f2113b;

    public g(Object obj, int i10) {
        this.f2112a = i10;
        this.f2113b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        r3 r3Var = (r3) this.f2113b;
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) r3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                    ((AtomicMarkableReference) r3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((x9.f) r3Var.f13137a).i((String) r3Var.f13139c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f2112a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f2113b);
            case 1:
                return a();
            default:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f2113b;
                ((AtomicReference) mVar.f6102c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.f6101b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.f6101b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f6101b;
                            atomicMarkableReference.set((x9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    r3 r3Var = (r3) mVar.d;
                    ((x9.f) r3Var.f13137a).g((String) r3Var.f13139c, map, mVar.f6100a);
                }
                return null;
        }
    }
}
