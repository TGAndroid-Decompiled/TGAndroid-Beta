package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public final class vf9 extends ze9 implements snb, zlb {
    public final vnb n;
    public final Paint r;
    public final Paint s;
    public nh9 w;
    public boolean x;

    public vf9(Context context, vnb vnbVar) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = vnbVar;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.ml));
        hashSet.add(Integer.valueOf(aob.lg));
    }

    @Override
    public final void e(int i) {
        invalidate();
    }

    public final int g() {
        int i;
        int measuredWidth = getMeasuredWidth();
        if (this.x) {
            i = this.c;
        } else {
            i = 0;
        }
        return measuredWidth - i;
    }

    public mk0 getRow() {
        return this.a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        int i;
        if (this.x) {
            i = 0;
        } else {
            i = this.c;
        }
        int g = (g() - i) / 4;
        arrayList.add(oxe.a((i + g) - hl.L(12.0f), 0, hl.L(12.0f) + (g() - g), hl.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        amb textSelectionHelper;
        if (this.x) {
            i = 0;
        } else {
            i = this.c;
        }
        int g = (g() - i) / 4;
        int i2 = i + g;
        int g2 = g() - g;
        nh9 nh9Var = this.w;
        if (nh9Var != null && (textSelectionHelper = nh9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S >= 0 && S >= textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i2 - hl.L(12.0f), 0.0f, hl.L(12.0f) + g2, hl.L(12.0f), hl.L(6.0f), hl.L(6.0f), this.s);
                float L = (hl.L(12.0f) - hl.L(1.0f)) / 2.0f;
                RectF rectF = hl.P;
                rectF.set(i2, L, g2, hl.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, hl.L(0.5f), hl.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (hl.L(12.0f) - hl.L(1.0f)) / 2.0f;
        RectF rectF2 = hl.P;
        rectF2.set(i2, L2, g2, hl.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, hl.L(0.5f), hl.L(0.5f), this.r);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i = aob.ml;
        vnb vnbVar = this.n;
        this.r.setColor(aob.v0(i, vnbVar));
        this.s.setColor(aob.v0(aob.lg, vnbVar));
    }
}
