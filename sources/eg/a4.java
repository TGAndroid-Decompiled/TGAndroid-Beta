package eg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sk0;
import qh.wa;
public final class a4 extends j {
    public final j1 f5072n0;
    public boolean f5073o0;
    public int f5074p0;
    public int f5075q0;
    public final wa f5076r0;

    public a4(Context context, PointF pointF, int i10, wa waVar, float f10, int i11) {
        super(context, pointF);
        j1 j1Var = new j1(context, f10);
        this.f5072n0 = j1Var;
        j1Var.setMaxWidth(i11);
        j1Var.e(0, this.f5074p0);
        this.f5076r0 = waVar;
        String str = waVar.f46283c;
        String a2 = waVar.a();
        j1Var.d(i10, str);
        j1Var.setText(a2);
        m();
        addView(j1Var, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new f1(this, getContext());
    }

    public int getColor() {
        return this.f5074p0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.f5072n0.G;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f5072n0.F;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f5072n0.F;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f5072n0.G;
    }

    public int getType() {
        return this.f5075q0;
    }

    public int getTypesCount() {
        return this.f5072n0.getTypesCount() - (!this.f5073o0 ? 1 : 0);
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
        this.f5073o0 = true;
        this.f5074p0 = i10;
    }

    @Override
    public void setIsVideo(boolean z4) {
        this.f5072n0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f5072n0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f5075q0 = i10;
        this.f5072n0.e(i10, this.f5074p0);
    }
}
