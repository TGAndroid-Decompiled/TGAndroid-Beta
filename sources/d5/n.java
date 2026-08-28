package d5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
public final class n {
    public final a0 f4369a;
    public final c0 f4370b;
    public final l f4371c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque f4372e;
    public final ArrayDeque f4373f;
    public final Object f4374g;
    public boolean h;
    public final boolean f4375i;

    public n(Looper looper, a0 a0Var, l lVar) {
        this(new CopyOnWriteArraySet(), looper, a0Var, lVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f4374g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new m(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f4373f;
        if (!arrayDeque.isEmpty()) {
            c0 c0Var = this.f4370b;
            if (!c0Var.f4337a.hasMessages(0)) {
                c0Var.getClass();
                b0 b10 = c0.b();
                Message obtainMessage = c0Var.f4337a.obtainMessage(0);
                b10.f4334a = obtainMessage;
                Handler handler = c0Var.f4337a;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                b10.a();
            }
            ArrayDeque arrayDeque2 = this.f4372e;
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

    public final void c(int i9, k kVar) {
        f();
        this.f4373f.add(new i(new CopyOnWriteArraySet(this.d), i9, kVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f4374g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            l lVar = this.f4371c;
            mVar.d = true;
            if (mVar.f4368c) {
                mVar.f4368c = false;
                lVar.g(mVar.f4366a, mVar.f4367b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i9, k kVar) {
        c(i9, kVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f4375i) {
            return;
        }
        if (Thread.currentThread() == this.f4370b.f4337a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.i(z10);
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, a0 a0Var, l lVar) {
        this.f4369a = a0Var;
        this.d = copyOnWriteArraySet;
        this.f4371c = lVar;
        this.f4374g = new Object();
        this.f4372e = new ArrayDeque();
        this.f4373f = new ArrayDeque();
        this.f4370b = a0Var.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                n nVar = n.this;
                Iterator it = nVar.d.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    l lVar2 = nVar.f4371c;
                    if (!mVar.d && mVar.f4368c) {
                        g c10 = mVar.f4367b.c();
                        mVar.f4367b = new c2.t();
                        mVar.f4368c = false;
                        lVar2.g(mVar.f4366a, c10);
                    }
                    if (nVar.f4370b.f4337a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f4375i = true;
    }
}
