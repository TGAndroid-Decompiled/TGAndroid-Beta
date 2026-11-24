package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m20 extends s09 {
    public final l20 E;
    public final l20 F;
    public long G;
    public final float H;
    public final i30 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    public m20(i30 i30Var, Activity activity, float f) {
        super(activity);
        this.I = i30Var;
        this.H = f;
        this.w = 0;
        this.E = new l20(this, (byte) 0);
        this.F = new l20(this, (byte) 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
