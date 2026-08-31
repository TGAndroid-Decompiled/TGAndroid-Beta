package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tk0;
public final class g1 extends j {
    public final e1 f5220n0;
    public int f5221o0;
    public int f5222p0;
    public boolean f5223q0;
    public d1 f5224r0;

    public g1(Context context, PointF pointF, int i10, d1 d1Var, float f10, int i11) {
        super(context, pointF);
        e1 e1Var = new e1(context, f10);
        this.f5220n0 = e1Var;
        e1Var.setMaxWidth(i11);
        this.f5224r0 = d1Var;
        e1Var.b(i10, d1Var, false);
        m();
        this.f5222p0 = 3;
        e1Var.c(3, this.f5221o0);
        addView(e1Var, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new f1(this, getContext());
    }

    public int getColor() {
        return this.f5221o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f5222p0 + 1;
        if (i10 == 4) {
            return !this.f5223q0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public tk0 getSelectionBounds() {
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
        return new tk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f5220n0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f5220n0.f5178f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f5220n0.f5178f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f5220n0.h;
    }

    public int getType() {
        return this.f5222p0;
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
        this.f5223q0 = true;
        this.f5221o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f5220n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f5222p0 = i10;
        this.f5220n0.c(i10, this.f5221o0);
    }
}
