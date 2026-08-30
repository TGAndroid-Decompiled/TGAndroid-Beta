package dg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
public final class i1 extends j {
    public final g1 f4570n0;
    public int f4571o0;
    public int f4572p0;
    public boolean f4573q0;
    public f1 f4574r0;

    public i1(Context context, PointF pointF, int i10, f1 f1Var, float f10, int i11) {
        super(context, pointF);
        g1 g1Var = new g1(context, f10);
        this.f4570n0 = g1Var;
        g1Var.setMaxWidth(i11);
        this.f4574r0 = f1Var;
        g1Var.b(i10, f1Var, false);
        m();
        this.f4572p0 = 3;
        g1Var.c(3, this.f4571o0);
        addView(g1Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new h1(this, getContext());
    }

    public int getColor() {
        return this.f4571o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f4572p0 + 1;
        if (i10 == 4) {
            return !this.f4573q0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        return new sk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f4570n0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f4570n0.f4529f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f4570n0.f4529f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f4570n0.h;
    }

    public int getType() {
        return this.f4572p0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.f4573q0 = true;
        this.f4571o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f4570n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f4572p0 = i10;
        this.f4570n0.c(i10, this.f4571o0);
    }
}
