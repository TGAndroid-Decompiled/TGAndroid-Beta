package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
public final class cib implements Runnable {
    public final byte a;
    public final Object b;

    public cib(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        boolean z;
        String str;
        jb4 jb4Var = (jb4) this.b;
        synchronized (((AtomicMarkableReference) jb4Var.g)) {
            z = false;
            if (((AtomicMarkableReference) jb4Var.g).isMarked()) {
                str = (String) ((AtomicMarkableReference) jb4Var.g).getReference();
                ((AtomicMarkableReference) jb4Var.g).set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            ((hd7) jb4Var.b).i((String) jb4Var.a, str);
        }
    }

    private final void b() {
        xf4 xf4Var = (xf4) this.b;
        Map map = null;
        ((AtomicReference) xf4Var.c).set(null);
        synchronized (xf4Var) {
            if (((AtomicMarkableReference) xf4Var.b).isMarked()) {
                map = ((qv5) ((AtomicMarkableReference) xf4Var.b).getReference()).a();
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) xf4Var.b;
                atomicMarkableReference.set((qv5) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            jb4 jb4Var = (jb4) xf4Var.d;
            ((hd7) jb4Var.b).h((String) jb4Var.a, map, xf4Var.a);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cib.run():void");
    }
}
