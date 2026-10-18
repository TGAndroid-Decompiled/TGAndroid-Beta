package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;
public final class r {
    public final Thread f8273a;
    public final i0 f8274b;
    public final p f8275c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f8276f;
    public final Object f8277g;
    public boolean h;
    public final boolean f8278i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f8277g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new q(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        boolean z10;
        if (this.f8278i) {
            if (Thread.currentThread() == this.f8273a) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
        }
        ArrayDeque arrayDeque = this.f8276f;
        if (!arrayDeque.isEmpty()) {
            if (this.f8275c != null) {
                i0 i0Var = this.f8274b;
                i0Var.getClass();
                Handler handler = i0Var.f8238a;
                if (!handler.hasMessages(1)) {
                    h0 a2 = i0Var.a(1);
                    Message message = a2.f8234a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a2.a();
                }
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i10, o oVar) {
        boolean z10;
        if (this.f8278i) {
            if (Thread.currentThread() == this.f8273a) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
        }
        this.f8276f.add(new ah.o(new CopyOnWriteArraySet(this.d), i10, oVar, 8));
    }

    public final void d() {
        boolean z10;
        if (this.f8278i) {
            if (Thread.currentThread() == this.f8273a) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
        }
        synchronized (this.f8277g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f8275c;
            qVar.d = true;
            if (pVar != null && qVar.f8272c) {
                qVar.f8272c = false;
                pVar.c(qVar.f8270a, qVar.f8271b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, o oVar) {
        c(i10, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f8273a = thread;
        this.d = copyOnWriteArraySet;
        this.f8275c = pVar;
        this.f8277g = new Object();
        this.e = new ArrayDeque();
        this.f8276f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f8274b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f8274b = null;
        }
        this.f8278i = z10;
    }
}
