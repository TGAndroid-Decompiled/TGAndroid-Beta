package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.PhotoViewer;
public final class ns4 {
    public static final int x;
    public static final int y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final c1 f;
    public final ms4 g;
    public ls4 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public MotionEvent n;
    public MotionEvent o;
    public MotionEvent p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public VelocityTracker w;

    static {
        ViewConfiguration.getLongPressTimeout();
        x = ViewConfiguration.getTapTimeout();
        y = ViewConfiguration.getDoubleTapTimeout();
    }

    public ns4(Context context, ms4 ms4Var) {
        int scaledTouchSlop;
        int i;
        int i2;
        this.f = new c1(this, (byte) 4);
        this.g = ms4Var;
        if (ms4Var instanceof ls4) {
            this.h = (ls4) ms4Var;
        }
        this.v = true;
        if (context == null) {
            i = ViewConfiguration.getTouchSlop();
            this.d = ViewConfiguration.getMinimumFlingVelocity();
            this.e = ViewConfiguration.getMaximumFlingVelocity();
            i2 = 100;
            scaledTouchSlop = i;
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.d = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = viewConfiguration.getScaledMaximumFlingVelocity();
            i = scaledTouchSlop2;
            i2 = scaledDoubleTapSlop;
        }
        this.a = i * i;
        this.b = scaledTouchSlop * scaledTouchSlop;
        this.c = i2 * i2;
    }

    public final boolean a(android.view.MotionEvent r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns4.a(android.view.MotionEvent):boolean");
    }

    public ns4(Context context, PhotoViewer photoViewer) {
        this(context, (ms4) photoViewer);
    }
}
