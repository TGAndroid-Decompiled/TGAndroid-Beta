package e2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f8767a;
    public final z f8768b;
    public final n f8769c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f8770e;
    public final ArrayDeque f8771f;
    public final Object f8772g;
    public boolean h;
    public final boolean f8773i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f8772g) {
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
        ArrayDeque arrayDeque = this.f8771f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f8768b;
            if (!zVar.f8798a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f8798a.obtainMessage(1);
                b10.f8796a = obtainMessage;
                Handler handler = zVar.f8798a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f8770e;
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
        this.f8771f.add(new ah.p(new CopyOnWriteArraySet(this.d), i10, mVar, 9));
    }

    public final void d() {
        f();
        synchronized (this.f8772g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f8769c;
            oVar.d = true;
            if (oVar.f8766c) {
                oVar.f8766c = false;
                nVar.c(oVar.f8764a, oVar.f8765b.d());
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
        if (!this.f8773i) {
            return;
        }
        if (Thread.currentThread() == this.f8768b.f8798a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f8767a = xVar;
        this.d = copyOnWriteArraySet;
        this.f8769c = nVar;
        this.f8772g = new Object();
        this.f8770e = new ArrayDeque();
        this.f8771f = new ArrayDeque();
        this.f8768b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f8769c;
                    if (!oVar.d && oVar.f8766c) {
                        b2.q d = oVar.f8765b.d();
                        oVar.f8765b = new b2.p();
                        oVar.f8766c = false;
                        nVar2.c(oVar.f8764a, d);
                    }
                    if (pVar.f8768b.f8798a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f8773i = z10;
    }
}
