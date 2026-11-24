package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
public final class up2 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable b;
    public final wp2 d;
    public final long a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public up2(wp2 wp2Var) {
        this.d = wp2Var;
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
        decorView.postOnAnimation(new mk2(this, (byte) 4));
    }

    @Override
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            qx qxVar = this.d.s;
            synchronized (qxVar.c) {
                z = qxVar.b;
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
