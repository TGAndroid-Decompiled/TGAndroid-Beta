package bg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hk0;
public final class k1 extends k {
    public final i1 m0;
    public int f2368n0;
    public int f2369o0;
    public boolean f2370p0;
    public h1 f2371q0;

    public k1(Context context, PointF pointF, int i10, h1 h1Var, float f9, int i11) {
        super(context, pointF);
        i1 i1Var = new i1(context, f9);
        this.m0 = i1Var;
        i1Var.setMaxWidth(i11);
        this.f2371q0 = h1Var;
        i1Var.b(i10, h1Var, false);
        m();
        this.f2369o0 = 3;
        i1Var.c(3, this.f2368n0);
        addView(i1Var, f6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final j a() {
        return new j1(this, getContext());
    }

    public int getColor() {
        return this.f2368n0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f2369o0 + 1;
        if (i10 == 4) {
            return !this.f2370p0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public hk0 getSelectionBounds() {
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
        return new hk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.f2304f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.f2304f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.h;
    }

    public int getType() {
        return this.f2369o0;
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
        this.f2370p0 = true;
        this.f2368n0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f2369o0 = i10;
        this.m0.c(i10, this.f2368n0);
    }
}
