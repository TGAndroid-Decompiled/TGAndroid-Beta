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
    public final Thread f13813a;
    public final i0 f13814b;
    public final p f13815c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f13816e;
    public final ArrayDeque f13817f;
    public final Object f13818g;
    public boolean h;
    public final boolean f13819i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f13818g) {
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
        if (this.f13819i) {
            if (Thread.currentThread() == this.f13813a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        ArrayDeque arrayDeque = this.f13817f;
        if (!arrayDeque.isEmpty()) {
            if (this.f13815c != null) {
                i0 i0Var = this.f13814b;
                i0Var.getClass();
                Handler handler = i0Var.f13771a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f13767a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f13816e;
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
        if (this.f13819i) {
            if (Thread.currentThread() == this.f13813a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        this.f13817f.add(new a1(new CopyOnWriteArraySet(this.d), i7, oVar, 13));
    }

    public final void d() {
        boolean z10;
        if (this.f13819i) {
            if (Thread.currentThread() == this.f13813a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        synchronized (this.f13818g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f13815c;
            qVar.d = true;
            if (pVar != null && qVar.f13812c) {
                qVar.f13812c = false;
                pVar.g(qVar.f13810a, qVar.f13811b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f13813a = thread;
        this.d = copyOnWriteArraySet;
        this.f13815c = pVar;
        this.f13818g = new Object();
        this.f13816e = new ArrayDeque();
        this.f13817f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f13814b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f13814b = null;
        }
        this.f13819i = z10;
    }
}
