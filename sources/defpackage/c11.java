package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class c11 extends FrameLayout {
    public final m21 E;
    public final q11 a;
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

    public c11(m21 m21Var, q11 q11Var, FrameLayout frameLayout) {
        super(q11Var.getContext());
        this.E = m21Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = q11Var;
        GestureDetector gestureDetector = new GestureDetector(q11Var.getContext(), new b21(this, q11Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(q11Var);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c11.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
