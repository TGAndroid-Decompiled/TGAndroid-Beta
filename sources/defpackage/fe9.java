package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public final class fe9 extends jd9 implements vlb, fkb {
    public final ylb n;
    public final Paint r;
    public final Paint s;
    public zf9 w;
    public boolean x;

    public fe9(Context context, ylb ylbVar) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = ylbVar;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.ll));
        hashSet.add(Integer.valueOf(cmb.kg));
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

    public ll0 getRow() {
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
        arrayList.add(zue.a((i + g) - gm.L(12.0f), 0, gm.L(12.0f) + (g() - g), gm.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        gkb textSelectionHelper;
        if (this.x) {
            i = 0;
        } else {
            i = this.c;
        }
        int g = (g() - i) / 4;
        int i2 = i + g;
        int g2 = g() - g;
        zf9 zf9Var = this.w;
        if (zf9Var != null && (textSelectionHelper = zf9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i2 - gm.L(12.0f), 0.0f, gm.L(12.0f) + g2, gm.L(12.0f), gm.L(6.0f), gm.L(6.0f), this.s);
                float L = (gm.L(12.0f) - gm.L(1.0f)) / 2.0f;
                RectF rectF = gm.P;
                rectF.set(i2, L, g2, gm.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, gm.L(0.5f), gm.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (gm.L(12.0f) - gm.L(1.0f)) / 2.0f;
        RectF rectF2 = gm.P;
        rectF2.set(i2, L2, g2, gm.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, gm.L(0.5f), gm.L(0.5f), this.r);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i = cmb.ll;
        ylb ylbVar = this.n;
        this.r.setColor(cmb.v0(i, ylbVar));
        this.s.setColor(cmb.v0(cmb.kg, ylbVar));
    }
}
