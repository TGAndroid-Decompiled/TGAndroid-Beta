package e2;

import ai.s1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f8562a;
    public final z f8563b;
    public final n f8564c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f8565e;
    public final ArrayDeque f8566f;
    public final Object f8567g;
    public boolean h;
    public final boolean f8568i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f8567g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new o(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f8566f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f8563b;
            if (!zVar.f8593a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f8593a.obtainMessage(1);
                b10.f8591a = obtainMessage;
                Handler handler = zVar.f8593a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f8565e;
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

    public final void c(int i10, m mVar) {
        f();
        this.f8566f.add(new s1(new CopyOnWriteArraySet(this.d), i10, mVar, 8));
    }

    public final void d() {
        f();
        synchronized (this.f8567g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f8564c;
            oVar.d = true;
            if (oVar.f8561c) {
                oVar.f8561c = false;
                nVar.e(oVar.f8559a, oVar.f8560b.d());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, m mVar) {
        c(i10, mVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f8568i) {
            return;
        }
        if (Thread.currentThread() == this.f8563b.f8593a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f8562a = xVar;
        this.d = copyOnWriteArraySet;
        this.f8564c = nVar;
        this.f8567g = new Object();
        this.f8565e = new ArrayDeque();
        this.f8566f = new ArrayDeque();
        this.f8563b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f8564c;
                    if (!oVar.d && oVar.f8561c) {
                        b2.q d = oVar.f8560b.d();
                        oVar.f8560b = new b2.p();
                        oVar.f8561c = false;
                        nVar2.e(oVar.f8559a, d);
                    }
                    if (pVar.f8563b.f8593a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f8568i = z10;
    }
}
