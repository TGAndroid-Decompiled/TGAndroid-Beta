package g2;

import ai.e3;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b8.zb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class s {
    public final Thread f11900a;
    public final j0 f11901b;
    public final q f11902c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f11903e;
    public final ArrayDeque f11904f;
    public final Object f11905g;
    public boolean h;
    public final boolean f11906i;

    public s(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f11905g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new r(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        boolean z10;
        if (this.f11906i) {
            if (Thread.currentThread() == this.f11900a) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
        }
        ArrayDeque arrayDeque = this.f11904f;
        if (!arrayDeque.isEmpty()) {
            if (this.f11902c != null) {
                j0 j0Var = this.f11901b;
                j0Var.getClass();
                Handler handler = j0Var.f11857a;
                if (!handler.hasMessages(1)) {
                    i0 a10 = j0Var.a(1);
                    Message message = a10.f11853a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a10.a();
                }
            }
            ArrayDeque arrayDeque2 = this.f11903e;
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

    public final void c(int i3, p pVar) {
        boolean z10;
        if (this.f11906i) {
            if (Thread.currentThread() == this.f11900a) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
        }
        this.f11904f.add(new e3(new CopyOnWriteArraySet(this.d), i3, pVar, 10));
    }

    public final void d() {
        boolean z10;
        if (this.f11906i) {
            if (Thread.currentThread() == this.f11900a) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
        }
        synchronized (this.f11905g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            q qVar = this.f11902c;
            rVar.d = true;
            if (qVar != null && rVar.f11899c) {
                rVar.f11899c = false;
                qVar.e(rVar.f11897a, rVar.f11898b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i3, p pVar) {
        c(i3, pVar);
        b();
    }

    public s(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, h0 h0Var, q qVar, boolean z10) {
        this.f11900a = thread;
        this.d = copyOnWriteArraySet;
        this.f11902c = qVar;
        this.f11905g = new Object();
        this.f11903e = new ArrayDeque();
        this.f11904f = new ArrayDeque();
        if (looper != null && h0Var != null && qVar != null) {
            this.f11901b = h0Var.a(looper, new o(this, 0));
        } else {
            this.f11901b = null;
        }
        this.f11906i = z10;
    }
}
