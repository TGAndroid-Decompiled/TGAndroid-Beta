package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.fa;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
public final class u0 extends y implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 f22453n;
    public final Paint f22454r;
    public final Paint f22455s;
    public r2 f22456w;
    public boolean f22457x;

    public u0(Context context, h6 h6Var) {
        super(context);
        this.f22454r = new Paint(1);
        this.f22455s = new Paint(1);
        this.f22453n = h6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.ml));
        hashSet.add(Integer.valueOf(m6.f29537lg));
    }

    @Override
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        int i7;
        int measuredWidth = getMeasuredWidth();
        if (this.f22457x) {
            i7 = this.f22533c;
        } else {
            i7 = 0;
        }
        return measuredWidth - i7;
    }

    public a getRow() {
        return this.f22531a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i7;
        if (this.f22457x) {
            i7 = 0;
        } else {
            i7 = this.f22533c;
        }
        int g10 = (g() - i7) / 4;
        arrayList.add(fa.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        j9 textSelectionHelper;
        if (this.f22457x) {
            i7 = 0;
        } else {
            i7 = this.f22533c;
        }
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        r2 r2Var = this.f22456w;
        if (r2Var != null && (textSelectionHelper = r2Var.f22359a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30923p0 && R <= textSelectionHelper.f30926s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f22455s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22454r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22454r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = m6.ml;
        h6 h6Var = this.f22453n;
        this.f22454r.setColor(m6.w0(i7, h6Var));
        this.f22455s.setColor(m6.w0(m6.f29537lg, h6Var));
    }
}
