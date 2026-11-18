package h2;

import a8.la;
import ai.a1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f13810a;
    public final i0 f13811b;
    public final p f13812c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f13813e;
    public final ArrayDeque f13814f;
    public final Object f13815g;
    public boolean h;
    public final boolean f13816i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f13815g) {
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
        if (this.f13816i) {
            if (Thread.currentThread() == this.f13810a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        ArrayDeque arrayDeque = this.f13814f;
        if (!arrayDeque.isEmpty()) {
            if (this.f13812c != null) {
                i0 i0Var = this.f13811b;
                i0Var.getClass();
                Handler handler = i0Var.f13768a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f13764a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f13813e;
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
        if (this.f13816i) {
            if (Thread.currentThread() == this.f13810a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        this.f13814f.add(new a1(new CopyOnWriteArraySet(this.d), i7, oVar, 13));
    }

    public final void d() {
        boolean z10;
        if (this.f13816i) {
            if (Thread.currentThread() == this.f13810a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        synchronized (this.f13815g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f13812c;
            qVar.d = true;
            if (pVar != null && qVar.f13809c) {
                qVar.f13809c = false;
                pVar.g(qVar.f13807a, qVar.f13808b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f13810a = thread;
        this.d = copyOnWriteArraySet;
        this.f13812c = pVar;
        this.f13815g = new Object();
        this.f13813e = new ArrayDeque();
        this.f13814f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f13811b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f13811b = null;
        }
        this.f13816i = z10;
    }
}
