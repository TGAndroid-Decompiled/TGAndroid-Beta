package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class tgc extends View {
    public sgc a;
    public int b;
    public final RectF c;
    public CharSequence d;
    public uib e;
    public boolean f;
    public cba h;
    public final ln n;
    public final vgc r;

    public tgc(vgc vgcVar, Context context) {
        super(context);
        this.r = vgcVar;
        this.c = new RectF();
        this.n = new ln(360L, this, d53.h);
    }

    @Override
    public int getId() {
        return this.a.a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        sgc sgcVar = this.a;
        if (sgcVar != null && (i = this.r.H) != -1 && sgcVar.a == i) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        sgc sgcVar = this.a;
        vgc vgcVar = this.r;
        setMeasuredDimension(gm.L(vgcVar.r << 1) + sgcVar.a(vgcVar.c) + vgcVar.J, View.MeasureSpec.getSize(i2));
    }

    public void setReordering(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        invalidate();
    }
}
