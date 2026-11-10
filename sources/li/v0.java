package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class v0 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public final h6 f18932n;
    public final Paint f18933r;
    public final Paint f18934s;
    public q2 f18935w;
    public boolean f18936x;

    public v0(Context context, h6 h6Var) {
        super(context);
        this.f18933r = new Paint(1);
        this.f18934s = new Paint(1);
        this.f18932n = h6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.jl));
        hashSet.add(Integer.valueOf(m6.f27990ig));
    }

    @Override
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        int i7;
        int measuredWidth = getMeasuredWidth();
        if (this.f18936x) {
            i7 = this.f18996c;
        } else {
            i7 = 0;
        }
        return measuredWidth - i7;
    }

    public a getRow() {
        return this.f18994a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i7;
        if (this.f18936x) {
            i7 = 0;
        } else {
            i7 = this.f18996c;
        }
        int g10 = (g() - i7) / 4;
        arrayList.add(c8.m1.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        i9 textSelectionHelper;
        if (this.f18936x) {
            i7 = 0;
        } else {
            i7 = this.f18996c;
        }
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        q2 q2Var = this.f18935w;
        if (q2Var != null && (textSelectionHelper = q2Var.f18790a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f29332p0 && R <= textSelectionHelper.f29335s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f18934s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f18933r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f18933r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = m6.jl;
        h6 h6Var = this.f18932n;
        this.f18933r.setColor(m6.w0(i7, h6Var));
        this.f18934s.setColor(m6.w0(m6.f27990ig, h6Var));
    }
}
