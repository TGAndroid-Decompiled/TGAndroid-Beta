package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
public final class nq2 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable b;
    public final pq2 d;
    public final long a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public nq2(pq2 pq2Var) {
        this.d = pq2Var;
    }

    public final void a(View view) {
        if (!this.c) {
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        if (this.c) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new vd2(this, (byte) 10));
    }

    @Override
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            rx rxVar = this.d.s;
            synchronized (rxVar.c) {
                z = rxVar.b;
            }
            if (z) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.a) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
