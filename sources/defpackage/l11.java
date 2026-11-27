package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class l11 extends FrameLayout {
    public final v21 E;
    public final z11 a;
    public final Rect b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public final FrameLayout y;

    public l11(v21 v21Var, z11 z11Var, FrameLayout frameLayout) {
        super(z11Var.getContext());
        this.E = v21Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = z11Var;
        GestureDetector gestureDetector = new GestureDetector(z11Var.getContext(), new k21(this, z11Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(z11Var);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
