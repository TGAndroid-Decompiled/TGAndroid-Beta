package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class n20 extends s09 {
    public final i30 E;
    public float r;
    public float s;
    public boolean w;
    public final o1 x;
    public final float y;

    public n20(i30 i30Var, Activity activity, float f) {
        super(activity);
        this.E = i30Var;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n20.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
