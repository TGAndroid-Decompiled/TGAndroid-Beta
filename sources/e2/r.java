package e2;

import a8.yb;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f9713a;
    public final i0 f9714b;
    public final p f9715c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f9716f;
    public final Object f9717g;
    public boolean h;
    public final boolean f9718i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f9717g) {
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
        if (this.f9718i) {
            if (Thread.currentThread() == this.f9713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        ArrayDeque arrayDeque = this.f9716f;
        if (!arrayDeque.isEmpty()) {
            if (this.f9715c != null) {
                i0 i0Var = this.f9714b;
                i0Var.getClass();
                Handler handler = i0Var.f9672a;
                if (!handler.hasMessages(1)) {
                    h0 a2 = i0Var.a(1);
                    Message message = a2.f9668a;
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
        if (this.f9718i) {
            if (Thread.currentThread() == this.f9713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        this.f9716f.add(new ai.h0(new CopyOnWriteArraySet(this.d), i10, oVar, 9));
    }

    public final void d() {
        boolean z10;
        if (this.f9718i) {
            if (Thread.currentThread() == this.f9713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        synchronized (this.f9717g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f9715c;
            qVar.d = true;
            if (pVar != null && qVar.f9709c) {
                qVar.f9709c = false;
                pVar.f(qVar.f9707a, qVar.f9708b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, o oVar) {
        c(i10, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f9713a = thread;
        this.d = copyOnWriteArraySet;
        this.f9715c = pVar;
        this.f9717g = new Object();
        this.e = new ArrayDeque();
        this.f9716f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f9714b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f9714b = null;
        }
        this.f9718i = z10;
    }
}
