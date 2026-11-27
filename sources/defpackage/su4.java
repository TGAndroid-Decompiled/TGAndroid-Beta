package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class su4 {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final tu4 f;
    public final tu4 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public MotionEvent m;
    public MotionEvent n;
    public boolean o;
    public float p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public VelocityTracker v;
    public long u = ViewConfiguration.getLongPressTimeout();
    public final d1 e = new d1(this, (byte) 5);

    public su4(Context context, tu4 tu4Var) {
        this.f = tu4Var;
        this.g = tu4Var;
        if (context != null) {
            this.t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.a = scaledTouchSlop * scaledTouchSlop;
            this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        }
        lq5.j("Context must not be null");
        throw null;
    }
}
