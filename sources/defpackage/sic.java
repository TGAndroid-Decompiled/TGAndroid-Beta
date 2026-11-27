package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class sic extends View {
    public ric a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public pkb e;
    public boolean f;
    public tca h;
    public final mm n;
    public final uic r;

    public sic(uic uicVar, Context context) {
        super(context);
        this.r = uicVar;
        this.c = new RectF();
        this.n = new mm(360L, this, k43.h);
    }

    @Override
    public int getId() {
        return this.a.a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sic.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ric ricVar = this.a;
        if (ricVar != null && (i = this.r.H) != -1 && ricVar.a == i) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ric ricVar = this.a;
        uic uicVar = this.r;
        setMeasuredDimension(hl.L(uicVar.r << 1) + ricVar.a(uicVar.c) + uicVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
