package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.da;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
public final class t0 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public final e6 f22000n;
    public final Paint f22001r;
    public final Paint f22002s;
    public o2 f22003w;
    public boolean f22004x;

    public t0(Context context, e6 e6Var) {
        super(context);
        this.f22001r = new Paint(1);
        this.f22002s = new Paint(1);
        this.f22000n = e6Var;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.ml));
        hashSet.add(Integer.valueOf(j6.f29005lg));
    }

    @Override
    public final void e(int i7) {
        invalidate();
    }

    public final int g() {
        int i7;
        int measuredWidth = getMeasuredWidth();
        if (this.f22004x) {
            i7 = this.f22108c;
        } else {
            i7 = 0;
        }
        return measuredWidth - i7;
    }

    public a getRow() {
        return this.f22106a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i7;
        if (this.f22004x) {
            i7 = 0;
        } else {
            i7 = this.f22108c;
        }
        int g10 = (g() - i7) / 4;
        arrayList.add(da.a((i7 + g10) - org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f) + (g() - g10), org.telegram.messenger.g0.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        h9 textSelectionHelper;
        if (this.f22004x) {
            i7 = 0;
        } else {
            i7 = this.f22108c;
        }
        int g10 = (g() - i7) / 4;
        int i10 = i7 + g10;
        int g11 = g() - g10;
        o2 o2Var = this.f22003w;
        if (o2Var != null && (textSelectionHelper = o2Var.f21856a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.f30411p0 && R <= textSelectionHelper.f30414s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i10 - org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(12.0f) + g11, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.f22002s);
                float L = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(i10, L, g11, org.telegram.messenger.g0.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22001r);
            }
        }
        canvas2 = canvas;
        float L2 = (org.telegram.messenger.g0.L(12.0f) - org.telegram.messenger.g0.L(1.0f)) / 2.0f;
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(i10, L2, g11, org.telegram.messenger.g0.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f), this.f22001r);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i7 = j6.ml;
        e6 e6Var = this.f22000n;
        this.f22001r.setColor(j6.w0(i7, e6Var));
        this.f22002s.setColor(j6.w0(j6.f29005lg, e6Var));
    }
}
