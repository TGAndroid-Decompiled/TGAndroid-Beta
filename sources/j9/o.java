package j9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class o implements Callable {
    public final int f9328a;
    public final Object f9329b;

    public o(Object obj, int i10) {
        this.f9328a = i10;
        this.f9329b = obj;
    }

    private final Object a() {
        Map map;
        cb.m mVar = (cb.m) this.f9329b;
        ((AtomicReference) mVar.d).set(null);
        synchronized (mVar) {
            try {
                if (((AtomicMarkableReference) mVar.f2256b).isMarked()) {
                    map = ((d) ((AtomicMarkableReference) mVar.f2256b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f2256b;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            s3 s3Var = (s3) mVar.f2257c;
            ((g) s3Var.f13625a).g((String) s3Var.f13627c, map, mVar.f2255a);
        }
        return null;
    }

    @Override
    public final Object call() {
        boolean z4;
        String str;
        switch (this.f9328a) {
            case 0:
                s3 s3Var = (s3) this.f9329b;
                synchronized (((AtomicMarkableReference) s3Var.h)) {
                    try {
                        z4 = false;
                        if (((AtomicMarkableReference) s3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                            ((AtomicMarkableReference) s3Var.h).set(str, false);
                            z4 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z4) {
                    ((g) s3Var.f13625a).i((String) s3Var.f13627c, str);
                }
                return null;
            case 1:
                return a();
            default:
                return new o2.f((JsReplyProxyBoundaryInterface) this.f9329b);
        }
    }
}
