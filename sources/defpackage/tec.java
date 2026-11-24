package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class tec extends View {
    public sec a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public tgb e;
    public boolean f;
    public c9a h;
    public final lm n;
    public final vec r;

    public tec(vec vecVar, Context context) {
        super(context);
        this.r = vecVar;
        this.c = new RectF();
        this.n = new lm(360L, this, s33.h);
    }

    @Override
    public int getId() {
        return this.a.a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tec.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        sec secVar = this.a;
        if (secVar != null && (i = this.r.H) != -1 && secVar.a == i) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        sec secVar = this.a;
        vec vecVar = this.r;
        setMeasuredDimension(gl.L(vecVar.r << 1) + secVar.a(vecVar.c) + vecVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
