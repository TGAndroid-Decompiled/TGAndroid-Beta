package defpackage;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.FrameLayout;
public final class k21 extends FrameLayout {
    public final u31 E;
    public final y21 a;
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

    public k21(u31 u31Var, y21 y21Var, FrameLayout frameLayout) {
        super(y21Var.getContext());
        this.E = u31Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = y21Var;
        GestureDetector gestureDetector = new GestureDetector(y21Var.getContext(), new j31(this, y21Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(y21Var);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k21.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
