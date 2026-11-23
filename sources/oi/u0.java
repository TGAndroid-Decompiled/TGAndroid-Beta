package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.ga;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class u0 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public final i6 f22520n;
    public final Paint f22521r;
    public final Paint f22522s;
    public r2 f22523w;
    public boolean f22524x;

    public u0(Context context, i6 i6Var) {
        super(context);
        this.f22521r = new Paint(1);
        this.f22522s = new Paint(1);
        this.f22520n = i6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.ml));
        hashSet.add(Integer.valueOf(n6.f29607lg));
    }

    @Override
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        int i7;
        int measuredWidth = getMeasuredWidth();
        if (this.f22524x) {
            i7 = this.f22600c;
        } else {
            i7 = 0;
        }
        return measuredWidth - i7;
    }

    public a getRow() {
        return this.f22598a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i7;
        if (this.f22524x) {
            i7 = 0;
        } else {
            i7 = this.f22600c;
        }
        int g10 = (g() - i7) / 4;
        arrayList.add(ga.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        i9 textSelectionHelper;
        if (this.f22524x) {
            i7 = 0;
        } else {
            i7 = this.f22600c;
        }
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        r2 r2Var = this.f22523w;
        if (r2Var != null && (textSelectionHelper = r2Var.f22417a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30923p0 && R <= textSelectionHelper.f30926s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f22522s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22521r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22521r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = n6.ml;
        i6 i6Var = this.f22520n;
        this.f22521r.setColor(n6.w0(i7, i6Var));
        this.f22522s.setColor(n6.w0(n6.f29607lg, i6Var));
    }
}
