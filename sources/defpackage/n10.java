package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class n10 extends e29 {
    public final m10 E;
    public final m10 F;
    public long G;
    public final float H;
    public final j20 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    public n10(j20 j20Var, Activity activity, float f) {
        super(activity);
        this.I = j20Var;
        this.H = f;
        this.w = 0;
        this.E = new m10(this, (byte) 0);
        this.F = new m10(this, (byte) 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
