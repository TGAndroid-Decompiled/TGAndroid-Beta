package dg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
import ph.za;
public final class c4 extends j {
    public final l1 f4440n0;
    public boolean f4441o0;
    public int f4442p0;
    public int f4443q0;
    public final za f4444r0;

    public c4(Context context, PointF pointF, int i10, za zaVar, float f10, int i11) {
        super(context, pointF);
        l1 l1Var = new l1(context, f10);
        this.f4440n0 = l1Var;
        l1Var.setMaxWidth(i11);
        l1Var.e(0, this.f4442p0);
        this.f4444r0 = zaVar;
        String str = zaVar.f42705c;
        String a2 = zaVar.a();
        l1Var.d(i10, str);
        l1Var.setText(a2);
        m();
        addView(l1Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new h1(this, getContext());
    }

    public int getColor() {
        return this.f4442p0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public rk0 getSelectionBounds() {
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
        return new rk0(c3, org.telegram.ui.b.c(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + c3) - c3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f4440n0.G;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f4440n0.F;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f4440n0.F;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f4440n0.G;
    }

    public int getType() {
        return this.f4443q0;
    }

    public int getTypesCount() {
        return this.f4440n0.getTypesCount() - (!this.f4441o0 ? 1 : 0);
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
        this.f4441o0 = true;
        this.f4442p0 = i10;
    }

    @Override
    public void setIsVideo(boolean z4) {
        this.f4440n0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f4440n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f4443q0 = i10;
        this.f4440n0.e(i10, this.f4442p0);
    }
}
