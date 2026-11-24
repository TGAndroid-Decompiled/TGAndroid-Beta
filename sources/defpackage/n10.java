package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class n10 extends ry8 {
    public final i20 E;
    public float r;
    public float s;
    public boolean w;
    public final o1 x;
    public final float y;

    public n10(i20 i20Var, Activity activity, float f) {
        super(activity);
        this.E = i20Var;
        this.y = f;
        this.x = new o1(this, (byte) 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
