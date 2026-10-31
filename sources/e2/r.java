package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.t6;
public final class r {
    public final Thread f6188a;
    public final i0 f6189b;
    public final p f6190c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f6191f;
    public final Object f6192g;
    public boolean h;
    public final boolean f6193i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f6192g) {
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
        if (this.f6193i) {
            if (Thread.currentThread() == this.f6188a) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
        }
        ArrayDeque arrayDeque = this.f6191f;
        if (!arrayDeque.isEmpty()) {
            if (this.f6190c != null) {
                i0 i0Var = this.f6189b;
                i0Var.getClass();
                Handler handler = i0Var.f6151a;
                if (!handler.hasMessages(1)) {
                    h0 a2 = i0Var.a(1);
                    Message message = a2.f6147a;
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
        if (this.f6193i) {
            if (Thread.currentThread() == this.f6188a) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
        }
        this.f6191f.add(new ag.o0(new CopyOnWriteArraySet(this.d), i10, oVar, 3));
    }

    public final void d() {
        boolean z10;
        if (this.f6193i) {
            if (Thread.currentThread() == this.f6188a) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
        }
        synchronized (this.f6192g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f6190c;
            qVar.d = true;
            if (pVar != null && qVar.f6187c) {
                qVar.f6187c = false;
                pVar.c(qVar.f6185a, qVar.f6186b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, o oVar) {
        c(i10, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f6188a = thread;
        this.d = copyOnWriteArraySet;
        this.f6190c = pVar;
        this.f6192g = new Object();
        this.e = new ArrayDeque();
        this.f6191f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f6189b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f6189b = null;
        }
        this.f6193i = z10;
    }
}
