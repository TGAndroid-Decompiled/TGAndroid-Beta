package jg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.a30;
import org.telegram.ui.Components.pj0;
import vh.k9;
import w7.b6;
public final class h3 extends j {
    public final y0 f10007q0;
    public boolean f10008r0;
    public int f10009s0;
    public int f10010t0;
    public final k9 f10011u0;

    public h3(Context context, PointF pointF, int i10, k9 k9Var, float f7, int i11) {
        super(context, pointF);
        y0 y0Var = new y0(context, f7);
        this.f10007q0 = y0Var;
        y0Var.setMaxWidth(i11);
        y0Var.e(0, this.f10009s0);
        this.f10011u0 = k9Var;
        String str = k9Var.f51455c;
        String a2 = k9Var.a();
        y0Var.d(i10, str);
        y0Var.setText(a2);
        m();
        addView(y0Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    public int getColor() {
        return this.f10009s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.f10007q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f10007q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f10007q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f10007q0.J;
    }

    public int getType() {
        return this.f10010t0;
    }

    public int getTypesCount() {
        return this.f10007q0.getTypesCount() - (!this.f10008r0 ? 1 : 0);
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
        this.f10008r0 = true;
        this.f10009s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f10007q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f10007q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f10010t0 = i10;
        this.f10007q0.e(i10, this.f10009s0);
    }
}
