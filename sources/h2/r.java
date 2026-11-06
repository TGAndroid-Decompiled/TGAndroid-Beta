package h2;

import a8.ia;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f14139a;
    public final i0 f14140b;
    public final p f14141c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f14142e;
    public final ArrayDeque f14143f;
    public final Object f14144g;
    public boolean h;
    public final boolean f14145i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f14144g) {
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
        if (this.f14145i) {
            if (Thread.currentThread() == this.f14139a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        ArrayDeque arrayDeque = this.f14143f;
        if (!arrayDeque.isEmpty()) {
            if (this.f14141c != null) {
                i0 i0Var = this.f14140b;
                i0Var.getClass();
                Handler handler = i0Var.f14096a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f14092a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f14142e;
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
        if (this.f14145i) {
            if (Thread.currentThread() == this.f14139a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        this.f14143f.add(new ai.e0(new CopyOnWriteArraySet(this.d), i7, oVar, 14));
    }

    public final void d() {
        boolean z9;
        if (this.f14145i) {
            if (Thread.currentThread() == this.f14139a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        synchronized (this.f14144g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f14141c;
            qVar.d = true;
            if (pVar != null && qVar.f14138c) {
                qVar.f14138c = false;
                pVar.h(qVar.f14136a, qVar.f14137b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z9) {
        this.f14139a = thread;
        this.d = copyOnWriteArraySet;
        this.f14141c = pVar;
        this.f14144g = new Object();
        this.f14142e = new ArrayDeque();
        this.f14143f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f14140b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f14140b = null;
        }
        this.f14145i = z9;
    }
}
