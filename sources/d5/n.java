package d5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class n {

    public final b0 f4814a;

    public final d0 f4815b;

    public final l f4816c;
    public final CopyOnWriteArraySet d;

    public final ArrayDeque f4817e;

    public final ArrayDeque f4818f;

    public final Object f4819g;
    public boolean h;

    public final boolean f4820i;

    public n(Looper looper, b0 b0Var, l lVar) {
        this(new CopyOnWriteArraySet(), looper, b0Var, lVar);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f4819g) {
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
        ArrayDeque arrayDeque = this.f4818f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        d0 d0Var = this.f4815b;
        if (!d0Var.f4782a.hasMessages(0)) {
            d0Var.getClass();
            c0 c0VarB = d0.b();
            Message messageObtainMessage = d0Var.f4782a.obtainMessage(0);
            c0VarB.f4780a = messageObtainMessage;
            Handler handler = d0Var.f4782a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            c0VarB.a();
        }
        ArrayDeque arrayDeque2 = this.f4817e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i10, k kVar) {
        f();
        this.f4818f.add(new i(new CopyOnWriteArraySet(this.d), i10, kVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f4819g) {
            this.h = true;
        }
        for (m mVar : this.d) {
            l lVar = this.f4816c;
            mVar.d = true;
            if (mVar.f4813c) {
                mVar.f4813c = false;
                lVar.e(mVar.f4811a, mVar.f4812b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i10, k kVar) {
        c(i10, kVar);
        b();
    }

    public final void f() {
        if (this.f4820i) {
            a.i(Thread.currentThread() == this.f4815b.f4782a.getLooper().getThread());
        }
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, b0 b0Var, l lVar) {
        this.f4814a = b0Var;
        this.d = copyOnWriteArraySet;
        this.f4816c = lVar;
        this.f4819g = new Object();
        this.f4817e = new ArrayDeque();
        this.f4818f = new ArrayDeque();
        this.f4815b = b0Var.a(looper, new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                n nVar = this.f4810a;
                for (m mVar : nVar.d) {
                    l lVar2 = nVar.f4816c;
                    if (!mVar.d && mVar.f4813c) {
                        g gVarC = mVar.f4812b.c();
                        mVar.f4812b = new c2.t();
                        mVar.f4813c = false;
                        lVar2.e(mVar.f4811a, gVarC);
                    }
                    if (nVar.f4815b.f4782a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f4820i = true;
    }
}
