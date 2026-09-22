package e2;

import ai.s1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f7915a;
    public final z f7916b;
    public final n f7917c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f7918f;
    public final Object f7919g;
    public boolean h;
    public final boolean f7920i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f7919g) {
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
        ArrayDeque arrayDeque = this.f7918f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f7916b;
            if (!zVar.f7942a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f7942a.obtainMessage(1);
                b10.f7940a = obtainMessage;
                Handler handler = zVar.f7942a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
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

    public final void c(int i10, m mVar) {
        f();
        this.f7918f.add(new s1(new CopyOnWriteArraySet(this.d), i10, mVar, 8));
    }

    public final void d() {
        f();
        synchronized (this.f7919g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f7917c;
            oVar.d = true;
            if (oVar.f7914c) {
                oVar.f7914c = false;
                nVar.e(oVar.f7912a, oVar.f7913b.d());
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
        if (!this.f7920i) {
            return;
        }
        if (Thread.currentThread() == this.f7916b.f7942a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f7915a = xVar;
        this.d = copyOnWriteArraySet;
        this.f7917c = nVar;
        this.f7919g = new Object();
        this.e = new ArrayDeque();
        this.f7918f = new ArrayDeque();
        this.f7916b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f7917c;
                    if (!oVar.d && oVar.f7914c) {
                        b2.q d = oVar.f7913b.d();
                        oVar.f7913b = new b2.p();
                        oVar.f7914c = false;
                        nVar2.e(oVar.f7912a, d);
                    }
                    if (pVar.f7916b.f7942a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f7920i = z10;
    }
}
