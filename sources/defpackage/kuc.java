package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
public final class kuc extends w44 {
    public final gd6 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public final iuc w0;

    public kuc(Context context, PointF pointF, int i, iuc iucVar, float f, int i2) {
        super(context, pointF);
        gd6 gd6Var = new gd6(context, f);
        this.s0 = gd6Var;
        gd6Var.setMaxWidth(i2);
        gd6Var.e(0, this.u0);
        this.w0 = iucVar;
        String str = iucVar.c;
        String a = iucVar.a();
        gd6Var.d(i, str);
        gd6Var.setText(a);
        m();
        addView(gd6Var, qoe.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final v44 a() {
        return new n66(this, getContext());
    }

    public int getColor() {
        return this.u0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public o49 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (gm.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (gm.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float e = hg9.e(L, 2.0f, getPositionX(), scaleX);
        return new o49(e, hg9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.s0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.s0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.s0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.s0.K;
    }

    public int getType() {
        return this.v0;
    }

    public int getTypesCount() {
        return this.s0.getTypesCount() - (!this.t0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public void setColor(int i) {
        this.t0 = true;
        this.u0 = i;
    }

    @Override
    public void setIsVideo(boolean z) {
        this.s0.setIsVideo(true);
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.v0 = i;
        this.s0.e(i, this.u0);
    }
}
