package bg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import i7.f6;
import nh.dc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hk0;
public final class g4 extends k {
    public final n1 m0;
    public boolean f2272n0;
    public int f2273o0;
    public int f2274p0;
    public final dc f2275q0;

    public g4(Context context, PointF pointF, int i10, dc dcVar, float f9, int i11) {
        super(context, pointF);
        n1 n1Var = new n1(context, f9);
        this.m0 = n1Var;
        n1Var.setMaxWidth(i11);
        n1Var.e(0, this.f2273o0);
        this.f2275q0 = dcVar;
        String str = dcVar.f17552c;
        String a2 = dcVar.a();
        n1Var.d(i10, str);
        n1Var.setText(a2);
        m();
        addView(n1Var, f6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final j a() {
        return new j1(this, getContext());
    }

    public int getColor() {
        return this.f2273o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.m0.F;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.f2274p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.f2272n0 ? 1 : 0);
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
        this.f2272n0 = true;
        this.f2273o0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.m0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f2274p0 = i10;
        this.m0.e(i10, this.f2273o0);
    }
}
