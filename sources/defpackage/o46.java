package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
public final class o46 extends l34 {
    public final d46 s0;
    public int t0;
    public int u0;
    public boolean v0;
    public c46 w0;

    public o46(Context context, PointF pointF, int i, c46 c46Var, float f, int i2) {
        super(context, pointF);
        d46 d46Var = new d46(context, f);
        this.s0 = d46Var;
        d46Var.setMaxWidth(i2);
        this.w0 = c46Var;
        d46Var.b(i, c46Var, false);
        m();
        this.u0 = 3;
        d46Var.c(3, this.t0);
        addView(d46Var, nme.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final k34 a() {
        return new n46(this, getContext());
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
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (gl.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (gl.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float e = de9.e(L, 2.0f, getPositionX(), scaleX);
        return new l29(e, de9.e(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + e) - e, L2 * scaleX);
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
