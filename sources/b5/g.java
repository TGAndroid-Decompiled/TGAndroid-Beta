package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
public final class g implements Callable {
    public final int f3762a;
    public final Object f3763b;

    public g(Object obj, int i10) {
        this.f3762a = i10;
        this.f3763b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        r3 r3Var = (r3) this.f3763b;
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
            ((x9.f) r3Var.f15554a).i((String) r3Var.f15556c, str);
        }
        return null;
    }

    @Override
    public final Object call() {
        Map map;
        switch (this.f3762a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.f3763b);
            case 1:
                return a();
            default:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f3763b;
                ((AtomicReference) mVar.f7949c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.f7948b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.f7948b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.f7948b;
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
                    ((x9.f) r3Var.f15554a).g((String) r3Var.f15556c, map, mVar.f7947a);
                }
                return null;
        }
    }
}
