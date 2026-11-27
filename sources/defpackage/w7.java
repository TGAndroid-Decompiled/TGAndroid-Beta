package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
public final class w7 extends x7 {
    public final v7 h0;
    public String i0;

    public w7(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        v7 v7Var = new v7(this, (byte) 0);
        this.h0 = v7Var;
        setAccessibilityDelegate(v7Var);
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
