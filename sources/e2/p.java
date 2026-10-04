package e2;

import ai.s1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class p {
    public final x f8567a;
    public final z f8568b;
    public final n f8569c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f8570e;
    public final ArrayDeque f8571f;
    public final Object f8572g;
    public boolean h;
    public final boolean f8573i;

    public p(Looper looper, x xVar, n nVar) {
        this(new CopyOnWriteArraySet(), looper, xVar, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f8572g) {
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
        ArrayDeque arrayDeque = this.f8571f;
        if (!arrayDeque.isEmpty()) {
            z zVar = this.f8568b;
            if (!zVar.f8598a.hasMessages(1)) {
                zVar.getClass();
                y b10 = z.b();
                Message obtainMessage = zVar.f8598a.obtainMessage(1);
                b10.f8596a = obtainMessage;
                Handler handler = zVar.f8598a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f8570e;
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
        this.f8571f.add(new s1(new CopyOnWriteArraySet(this.d), i10, mVar, 8));
    }

    public final void d() {
        f();
        synchronized (this.f8572g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = this.f8569c;
            oVar.d = true;
            if (oVar.f8566c) {
                oVar.f8566c = false;
                nVar.e(oVar.f8564a, oVar.f8565b.d());
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
        if (!this.f8573i) {
            return;
        }
        if (Thread.currentThread() == this.f8568b.f8598a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.g(z10);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, x xVar, n nVar, boolean z10) {
        this.f8567a = xVar;
        this.d = copyOnWriteArraySet;
        this.f8569c = nVar;
        this.f8572g = new Object();
        this.f8570e = new ArrayDeque();
        this.f8571f = new ArrayDeque();
        this.f8568b = xVar.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                p pVar = p.this;
                Iterator it = pVar.d.iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = pVar.f8569c;
                    if (!oVar.d && oVar.f8566c) {
                        b2.q d = oVar.f8565b.d();
                        oVar.f8565b = new b2.p();
                        oVar.f8566c = false;
                        nVar2.e(oVar.f8564a, d);
                    }
                    if (pVar.f8568b.f8598a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f8573i = z10;
    }
}
