package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o10 extends e29 {
    public final j20 E;
    public float r;
    public float s;
    public boolean w;
    public final p1 x;
    public final float y;

    public o10(j20 j20Var, Activity activity, float f) {
        super(activity);
        this.E = j20Var;
        this.y = f;
        this.x = new p1(this, (byte) 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
