package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
public final class c1 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public final org.telegram.ui.ActionBar.p6 f2885n;
    public final Paint f2886r;
    public final Paint f2887s;
    public z2 f2888w;
    public boolean f2889x;

    public c1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2886r = new Paint(1);
        this.f2887s = new Paint(1);
        this.f2885n = p6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.jl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21029ig));
    }

    @Override
    public final void e(int i10) {
        invalidate();
    }

    public final int g() {
        int i10;
        int measuredWidth = getMeasuredWidth();
        if (this.f2889x) {
            i10 = this.f2883c;
        } else {
            i10 = 0;
        }
        return measuredWidth - i10;
    }

    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        int i10;
        if (this.f2889x) {
            i10 = 0;
        } else {
            i10 = this.f2883c;
        }
        int g10 = (g() - i10) / 4;
        arrayList.add(v7.b5.a((i10 + g10) - org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f) + (g() - g10), org.telegram.messenger.i0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        k9 textSelectionHelper;
        if (this.f2889x) {
            i10 = 0;
        } else {
            i10 = this.f2883c;
        }
        int g10 = (g() - i10) / 4;
        int i11 = i10 + g10;
        int g11 = g() - g10;
        z2 z2Var = this.f2888w;
        if (z2Var != null && (textSelectionHelper = z2Var.f3477a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f22187p0 && R <= textSelectionHelper.f22190s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i11 - org.telegram.messenger.i0.L(12.0f), 0.0f, org.telegram.messenger.i0.L(12.0f) + g11, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.f2887s);
                float L = (org.telegram.messenger.i0.L(12.0f) - org.telegram.messenger.i0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(i11, L, g11, org.telegram.messenger.i0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f), this.f2886r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.i0.L(12.0f) - org.telegram.messenger.i0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(i11, L2, g11, org.telegram.messenger.i0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f), this.f2886r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.jl;
        org.telegram.ui.ActionBar.p6 p6Var = this.f2885n;
        this.f2886r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f2887s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21029ig, p6Var));
    }
}
