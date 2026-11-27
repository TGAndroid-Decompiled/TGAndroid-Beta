package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class e86 {
    public final Thread a;
    public final xgb b;
    public final c86 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public e86(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, vgb vgbVar, c86 c86Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = c86Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper != null && vgbVar != null && c86Var != null) {
            this.b = vgbVar.a(looper, new qo3(this, (byte) 1));
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
            this.d.add(new d86(obj));
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
            yve.p(z);
        }
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            if (this.c != null) {
                xgb xgbVar = this.b;
                xgbVar.getClass();
                Handler handler = xgbVar.a;
                if (!handler.hasMessages(1)) {
                    wgb a = xgbVar.a(1);
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

    public final void c(int i, b86 b86Var) {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        }
        this.f.add(new l65(new CopyOnWriteArraySet(this.d), i, b86Var, (byte) 5));
    }

    public final void d() {
        boolean z;
        if (this.i) {
            if (Thread.currentThread() == this.a) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
        }
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            d86 d86Var = (d86) it.next();
            c86 c86Var = this.c;
            d86Var.d = true;
            if (c86Var != null && d86Var.c) {
                d86Var.c = false;
                c86Var.a(d86Var.a, d86Var.b.f());
            }
        }
        this.d.clear();
    }

    public final void e(int i, b86 b86Var) {
        c(i, b86Var);
        b();
    }

    public e86(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
