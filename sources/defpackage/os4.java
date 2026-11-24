package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public final class os4 {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ps4 f;
    public final ps4 g;
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
    public final c1 e = new c1(this, (byte) 5);

    public os4(Context context, ps4 ps4Var) {
        this.f = ps4Var;
        this.g = ps4Var;
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
        w26.j("Context must not be null");
        throw null;
    }
}
