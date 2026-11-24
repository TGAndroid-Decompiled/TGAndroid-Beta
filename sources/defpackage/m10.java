package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m10 extends ry8 {
    public final l10 E;
    public final l10 F;
    public long G;
    public final float H;
    public final i20 I;
    public float r;
    public float s;
    public int w;
    public long x;
    public long y;

    public m10(i20 i20Var, Activity activity, float f) {
        super(activity);
        this.I = i20Var;
        this.H = f;
        this.w = 0;
        this.E = new l10(this, (byte) 0);
        this.F = new l10(this, (byte) 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
