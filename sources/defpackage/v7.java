package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class v7 extends w7 {
    public final u7 h0;
    public String i0;

    public v7(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u7 u7Var = new u7(this, (byte) 0);
        this.h0 = u7Var;
        setAccessibilityDelegate(u7Var);
    }

    public final void e(boolean z, float f) {
        d(z, (f - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.h0.e(this, accessibilityNodeInfo);
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!super.performAccessibilityAction(i, bundle) && !this.h0.g(this, i, bundle)) {
            return false;
        }
        return true;
    }

    public void setLabel(String str) {
        this.i0 = str;
    }

    @Override
    public void setStops(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (fArr[i] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
