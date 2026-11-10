package h2;

import a8.ia;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f14141a;
    public final i0 f14142b;
    public final p f14143c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f14144e;
    public final ArrayDeque f14145f;
    public final Object f14146g;
    public boolean h;
    public final boolean f14147i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f14146g) {
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
        boolean z9;
        if (this.f14147i) {
            if (Thread.currentThread() == this.f14141a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        ArrayDeque arrayDeque = this.f14145f;
        if (!arrayDeque.isEmpty()) {
            if (this.f14143c != null) {
                i0 i0Var = this.f14142b;
                i0Var.getClass();
                Handler handler = i0Var.f14098a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f14094a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f14144e;
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

    public final void c(int i7, o oVar) {
        boolean z9;
        if (this.f14147i) {
            if (Thread.currentThread() == this.f14141a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        this.f14145f.add(new ai.e0(new CopyOnWriteArraySet(this.d), i7, oVar, 14));
    }

    public final void d() {
        boolean z9;
        if (this.f14147i) {
            if (Thread.currentThread() == this.f14141a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        synchronized (this.f14146g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f14143c;
            qVar.d = true;
            if (pVar != null && qVar.f14140c) {
                qVar.f14140c = false;
                pVar.h(qVar.f14138a, qVar.f14139b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z9) {
        this.f14141a = thread;
        this.d = copyOnWriteArraySet;
        this.f14143c = pVar;
        this.f14146g = new Object();
        this.f14144e = new ArrayDeque();
        this.f14145f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f14142b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f14142b = null;
        }
        this.f14147i = z9;
    }
}
