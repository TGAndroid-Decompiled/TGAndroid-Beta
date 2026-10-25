package c5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f6143a;
    public final Object f6144b;

    public g(Object obj, int i10) {
        this.f6143a = i10;
        this.f6144b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        r3 r3Var = (r3) this.f6144b;
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
            ((z9.f) r3Var.f17844a).i((String) r3Var.f17846c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f6143a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f6144b);
            case 1:
                return a();
            default:
                c2.b bVar = (c2.b) this.f6144b;
                ((AtomicReference) bVar.f5931c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f5930b).isMarked()) {
                            map = ((z9.d) ((AtomicMarkableReference) bVar.f5930b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f5930b;
                            atomicMarkableReference.set((z9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    r3 r3Var = (r3) bVar.d;
                    ((z9.f) r3Var.f17844a).g((String) r3Var.f17846c, map, bVar.f5929a);
                }
                return null;
        }
    }
}
