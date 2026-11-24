package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
public final class fr2 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable b;
    public final hr2 d;
    public final long a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public fr2(hr2 hr2Var) {
        this.d = hr2Var;
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
        decorView.postOnAnimation(new xf2(this, (byte) 9));
    }

    @Override
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
            this.b = null;
            ry ryVar = this.d.s;
            synchronized (ryVar.c) {
                z = ryVar.b;
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
