package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class a86 {
    public final Thread a;
    public final dfb b;
    public final y76 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public a86(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, bfb bfbVar, y76 y76Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = y76Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper != null && bfbVar != null && y76Var != null) {
            this.b = bfbVar.a(looper, new jp3(this, (byte) 1));
        } else {
            this.b = null;
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.d.add(new z76(obj));
        }
    }

    public final void b() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        }
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            if (this.c != null) {
                dfb dfbVar = this.b;
                dfbVar.getClass();
                Handler handler = dfbVar.a;
                if (!handler.hasMessages(1)) {
                    cfb a = dfbVar.a(1);
                    Message message = a.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a.a();
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

    public final void c(int i, x76 x76Var) {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        }
        this.f.add(new h65(new CopyOnWriteArraySet(this.d), i, x76Var, (byte) 5));
    }

    public final void d() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z76 z76Var = (z76) it.next();
            y76 y76Var = this.c;
            z76Var.d = true;
            if (y76Var != null && z76Var.c) {
                z76Var.c = false;
                y76Var.c(z76Var.a, z76Var.b.f());
            }
        }
        this.d.clear();
    }

    public final void e(int i, x76 x76Var) {
        c(i, x76Var);
        b();
    }

    public a86(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
