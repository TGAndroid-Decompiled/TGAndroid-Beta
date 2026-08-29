package h9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class o implements Callable {
    public final int f7973a;
    public final Object f7974b;

    public o(Object obj, int i10) {
        this.f7973a = i10;
        this.f7974b = obj;
    }

    private final Object a() {
        Map map;
        ab.m mVar = (ab.m) this.f7974b;
        ((AtomicReference) mVar.d).set(null);
        synchronized (mVar) {
            try {
                if (((AtomicMarkableReference) mVar.f325b).isMarked()) {
                    map = ((d) ((AtomicMarkableReference) mVar.f325b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f325b;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            s3 s3Var = (s3) mVar.f326c;
            ((g) s3Var.f16688a).g((String) s3Var.f16690c, map, mVar.f324a);
        }
        return null;
    }

    @Override
    public final Object call() {
        boolean z10;
        String str;
        switch (this.f7973a) {
            case 0:
                s3 s3Var = (s3) this.f7974b;
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
                    ((g) s3Var.f16688a).i((String) s3Var.f16690c, str);
                }
                return null;
            case 1:
                return a();
            default:
                return new o2.f((JsReplyProxyBoundaryInterface) this.f7974b);
        }
    }
}
