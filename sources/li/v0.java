package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
public final class v0 extends y implements org.telegram.ui.ActionBar.b6, h9 {
    public final g6 f18927n;
    public final Paint f18928r;
    public final Paint f18929s;
    public q2 f18930w;
    public boolean f18931x;

    public v0(Context context, g6 g6Var) {
        super(context);
        this.f18928r = new Paint(1);
        this.f18929s = new Paint(1);
        this.f18927n = g6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.jl));
        hashSet.add(Integer.valueOf(l6.f27965ig));
    }

    @Override
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        int i7;
        int measuredWidth = getMeasuredWidth();
        if (this.f18931x) {
            i7 = this.f18991c;
        } else {
            i7 = 0;
        }
        return measuredWidth - i7;
    }

    public a getRow() {
        return this.f18989a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i7;
        if (this.f18931x) {
            i7 = 0;
        } else {
            i7 = this.f18991c;
        }
        int g10 = (g() - i7) / 4;
        arrayList.add(c8.m1.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        i9 textSelectionHelper;
        if (this.f18931x) {
            i7 = 0;
        } else {
            i7 = this.f18991c;
        }
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        q2 q2Var = this.f18930w;
        if (q2Var != null && (textSelectionHelper = q2Var.f18787a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f29321p0 && R <= textSelectionHelper.f29324s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f18929s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f18928r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f18928r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = l6.jl;
        g6 g6Var = this.f18927n;
        this.f18928r.setColor(l6.w0(i7, g6Var));
        this.f18929s.setColor(l6.w0(l6.f27965ig, g6Var));
    }
}
