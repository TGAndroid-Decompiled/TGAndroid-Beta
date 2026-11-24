package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
public final class hsc extends l34 {
    public final hb6 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public final fsc w0;

    public hsc(Context context, PointF pointF, int i, fsc fscVar, float f, int i2) {
        super(context, pointF);
        hb6 hb6Var = new hb6(context, f);
        this.s0 = hb6Var;
        hb6Var.setMaxWidth(i2);
        hb6Var.e(0, this.u0);
        this.w0 = fscVar;
        String str = fscVar.c;
        String a = fscVar.a();
        hb6Var.d(i, str);
        hb6Var.setText(a);
        m();
        addView(hb6Var, nme.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final k34 a() {
        return new n46(this, getContext());
    }

    public int getColor() {
        return this.u0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
