package h5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class m {
    public final y f7262a;
    public final a0 f7263b;
    public final k f7264c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f7265e;
    public final ArrayDeque f7266f;
    public final Object f7267g;
    public boolean h;
    public final boolean f7268i;

    public m(Looper looper, y yVar, k kVar) {
        this(new CopyOnWriteArraySet(), looper, yVar, kVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f7267g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new l(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f7266f;
        if (!arrayDeque.isEmpty()) {
            a0 a0Var = this.f7263b;
            if (!a0Var.f7226a.hasMessages(0)) {
                a0Var.getClass();
                z b10 = a0.b();
                Message obtainMessage = a0Var.f7226a.obtainMessage(0);
                b10.f7315a = obtainMessage;
                Handler handler = a0Var.f7226a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f7265e;
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

    public final void c(int i10, j jVar) {
        f();
        this.f7266f.add(new bh.a(new CopyOnWriteArraySet(this.d), i10, jVar, 4));
    }

    public final void d() {
        f();
        synchronized (this.f7267g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            k kVar = this.f7264c;
            lVar.d = true;
            if (lVar.f7261c) {
                lVar.f7261c = false;
                kVar.d(lVar.f7259a, lVar.f7260b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, j jVar) {
        c(i10, jVar);
        b();
    }

    public final void f() {
        boolean z4;
        if (!this.f7268i) {
            return;
        }
        if (Thread.currentThread() == this.f7263b.f7226a.getLooper().getThread()) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.i(z4);
    }

    public m(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y yVar, k kVar, boolean z4) {
        this.f7262a = yVar;
        this.d = copyOnWriteArraySet;
        this.f7264c = kVar;
        this.f7267g = new Object();
        this.f7265e = new ArrayDeque();
        this.f7266f = new ArrayDeque();
        this.f7263b = yVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                m mVar = m.this;
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    k kVar2 = mVar.f7264c;
                    if (!lVar.d && lVar.f7261c) {
                        g c3 = lVar.f7260b.c();
                        lVar.f7260b = new c2.u();
                        lVar.f7261c = false;
                        kVar2.d(lVar.f7259a, c3);
                    }
                    if (mVar.f7263b.f7226a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f7268i = z4;
    }
}
