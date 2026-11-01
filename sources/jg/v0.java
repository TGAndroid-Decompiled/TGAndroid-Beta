package jg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.a30;
import org.telegram.ui.Components.pj0;
import w7.b6;
public final class v0 extends j {
    public final t0 f10301q0;
    public int f10302r0;
    public int f10303s0;
    public boolean f10304t0;
    public s0 f10305u0;

    public v0(Context context, PointF pointF, int i10, s0 s0Var, float f7, int i11) {
        super(context, pointF);
        t0 t0Var = new t0(context, f7);
        this.f10301q0 = t0Var;
        t0Var.setMaxWidth(i11);
        this.f10305u0 = s0Var;
        t0Var.b(i10, s0Var, false);
        m();
        this.f10303s0 = 3;
        t0Var.c(3, this.f10302r0);
        addView(t0Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    public int getColor() {
        return this.f10302r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f10303s0 + 1;
        if (i10 == 4) {
            return !this.f10304t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = a30.x(L, 2.0f, getPositionX(), scaleX);
        return new pj0(x10, a30.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f10301q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f10301q0.f10241f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f10301q0.f10241f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f10301q0.h;
    }

    public int getType() {
        return this.f10303s0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.f10304t0 = true;
        this.f10302r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f10301q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f10303s0 = i10;
        this.f10301q0.c(i10, this.f10302r0);
    }
}
