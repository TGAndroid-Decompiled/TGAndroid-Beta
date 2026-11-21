package h2;

import a8.la;
import ai.c1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f13839a;
    public final i0 f13840b;
    public final p f13841c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f13842e;
    public final ArrayDeque f13843f;
    public final Object f13844g;
    public boolean h;
    public final boolean f13845i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f13844g) {
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
        if (this.f13845i) {
            if (Thread.currentThread() == this.f13839a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        ArrayDeque arrayDeque = this.f13843f;
        if (!arrayDeque.isEmpty()) {
            if (this.f13841c != null) {
                i0 i0Var = this.f13840b;
                i0Var.getClass();
                Handler handler = i0Var.f13797a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f13793a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f13842e;
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
        boolean z10;
        if (this.f13845i) {
            if (Thread.currentThread() == this.f13839a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        this.f13843f.add(new c1(new CopyOnWriteArraySet(this.d), i7, oVar, 13));
    }

    public final void d() {
        boolean z10;
        if (this.f13845i) {
            if (Thread.currentThread() == this.f13839a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        synchronized (this.f13844g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f13841c;
            qVar.d = true;
            if (pVar != null && qVar.f13838c) {
                qVar.f13838c = false;
                pVar.i(qVar.f13836a, qVar.f13837b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f13839a = thread;
        this.d = copyOnWriteArraySet;
        this.f13841c = pVar;
        this.f13844g = new Object();
        this.f13842e = new ArrayDeque();
        this.f13843f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f13840b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f13840b = null;
        }
        this.f13845i = z10;
    }
}
