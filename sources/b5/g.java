package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f2587a;
    public final Object f2588b;

    public g(Object obj, int i10) {
        this.f2587a = i10;
        this.f2588b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        q3 q3Var = (q3) this.f2588b;
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
            ((y9.f) q3Var.f15219a).i((String) q3Var.f15221c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f2587a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f2588b);
            case 1:
                return a();
            default:
                c2.b bVar = (c2.b) this.f2588b;
                ((AtomicReference) bVar.f4120c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f4119b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) bVar.f4119b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f4119b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    q3 q3Var = (q3) bVar.d;
                    ((y9.f) q3Var.f15219a).g((String) q3Var.f15221c, map, bVar.f4118a);
                }
                return null;
        }
    }
}
