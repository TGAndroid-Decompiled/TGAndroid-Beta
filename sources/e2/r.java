package e2;

import a8.yb;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f9712a;
    public final i0 f9713b;
    public final p f9714c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f9715f;
    public final Object f9716g;
    public boolean h;
    public final boolean f9717i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f9716g) {
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
        if (this.f9717i) {
            if (Thread.currentThread() == this.f9712a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        ArrayDeque arrayDeque = this.f9715f;
        if (!arrayDeque.isEmpty()) {
            if (this.f9714c != null) {
                i0 i0Var = this.f9713b;
                i0Var.getClass();
                Handler handler = i0Var.f9671a;
                if (!handler.hasMessages(1)) {
                    h0 a2 = i0Var.a(1);
                    Message message = a2.f9667a;
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
        if (this.f9717i) {
            if (Thread.currentThread() == this.f9712a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        this.f9715f.add(new ai.h0(new CopyOnWriteArraySet(this.d), i10, oVar, 9));
    }

    public final void d() {
        boolean z10;
        if (this.f9717i) {
            if (Thread.currentThread() == this.f9712a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        synchronized (this.f9716g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f9714c;
            qVar.d = true;
            if (pVar != null && qVar.f9708c) {
                qVar.f9708c = false;
                pVar.f(qVar.f9706a, qVar.f9707b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, o oVar) {
        c(i10, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f9712a = thread;
        this.d = copyOnWriteArraySet;
        this.f9714c = pVar;
        this.f9716g = new Object();
        this.e = new ArrayDeque();
        this.f9715f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f9713b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f9713b = null;
        }
        this.f9717i = z10;
    }
}
