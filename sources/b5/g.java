package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f4200a;
    public final Object f4201b;

    public g(Object obj, int i10) {
        this.f4200a = i10;
        this.f4201b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        s3 s3Var = (s3) this.f4201b;
        synchronized (((AtomicMarkableReference) s3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) s3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                    ((AtomicMarkableReference) s3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) s3Var.f16334a).i((String) s3Var.f16336c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f4200a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f4201b);
            case 1:
                return a();
            default:
                c2.b bVar = (c2.b) this.f4201b;
                ((AtomicReference) bVar.f4491c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f4490b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) bVar.f4490b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f4490b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    s3 s3Var = (s3) bVar.d;
                    ((y9.f) s3Var.f16334a).g((String) s3Var.f16336c, map, bVar.f4489a);
                }
                return null;
        }
    }
}
