package h2;

import a8.ja;
import ai.a1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class r {
    public final Thread f13498a;
    public final i0 f13499b;
    public final p f13500c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f13501e;
    public final ArrayDeque f13502f;
    public final Object f13503g;
    public boolean h;
    public final boolean f13504i;

    public r(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f13503g) {
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
        if (this.f13504i) {
            if (Thread.currentThread() == this.f13498a) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
        }
        ArrayDeque arrayDeque = this.f13502f;
        if (!arrayDeque.isEmpty()) {
            if (this.f13500c != null) {
                i0 i0Var = this.f13499b;
                i0Var.getClass();
                Handler handler = i0Var.f13456a;
                if (!handler.hasMessages(1)) {
                    h0 a10 = i0Var.a(1);
                    Message message = a10.f13452a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f13501e;
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
        if (this.f13504i) {
            if (Thread.currentThread() == this.f13498a) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
        }
        this.f13502f.add(new a1(new CopyOnWriteArraySet(this.d), i7, oVar, 12));
    }

    public final void d() {
        boolean z10;
        if (this.f13504i) {
            if (Thread.currentThread() == this.f13498a) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
        }
        synchronized (this.f13503g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            p pVar = this.f13500c;
            qVar.d = true;
            if (pVar != null && qVar.f13497c) {
                qVar.f13497c = false;
                pVar.e(qVar.f13495a, qVar.f13496b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i7, o oVar) {
        c(i7, oVar);
        b();
    }

    public r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, g0 g0Var, p pVar, boolean z10) {
        this.f13498a = thread;
        this.d = copyOnWriteArraySet;
        this.f13500c = pVar;
        this.f13503g = new Object();
        this.f13501e = new ArrayDeque();
        this.f13502f = new ArrayDeque();
        if (looper != null && g0Var != null && pVar != null) {
            this.f13499b = g0Var.a(looper, new n(this, 0));
        } else {
            this.f13499b = null;
        }
        this.f13504i = z10;
    }
}
