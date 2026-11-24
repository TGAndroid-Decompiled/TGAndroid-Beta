package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
public final class o66 extends w44 {
    public final d66 s0;
    public int t0;
    public int u0;
    public boolean v0;
    public c66 w0;

    public o66(Context context, PointF pointF, int i, c66 c66Var, float f, int i2) {
        super(context, pointF);
        d66 d66Var = new d66(context, f);
        this.s0 = d66Var;
        d66Var.setMaxWidth(i2);
        this.w0 = c66Var;
        d66Var.b(i, c66Var, false);
        m();
        this.u0 = 3;
        d66Var.c(3, this.t0);
        addView(d66Var, qoe.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final v44 a() {
        return new n66(this, getContext());
    }

    public int getColor() {
        return this.t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i = this.u0 + 1;
        if (i == 4) {
            return !this.v0 ? 1 : 0;
        }
        return i;
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
        return this.s0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.s0.f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.s0.f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.s0.h;
    }

    public int getType() {
        return this.u0;
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
        this.v0 = true;
        this.t0 = i;
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setType(int i) {
        this.u0 = i;
        this.s0.c(i, this.t0);
    }
}
