package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public final class ec9 extends jb9 implements tjb, eib {
    public final wjb n;
    public final Paint r;
    public final Paint s;
    public vd9 w;
    public boolean x;

    public ec9(Context context, wjb wjbVar) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.n = wjbVar;
        setWillNotDraw(false);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.ll));
        hashSet.add(Integer.valueOf(bkb.kg));
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

    public lk0 getRow() {
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
        arrayList.add(wse.a((i + g) - gl.L(12.0f), 0, gl.L(12.0f) + (g() - g), gl.L(12.0f)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        fib textSelectionHelper;
        if (this.x) {
            i = 0;
        } else {
            i = this.c;
        }
        int g = (g() - i) / 4;
        int i2 = i + g;
        int g2 = g() - g;
        vd9 vd9Var = this.w;
        if (vd9Var != null && (textSelectionHelper = vd9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2 = canvas;
                canvas2.drawRoundRect(i2 - gl.L(12.0f), 0.0f, gl.L(12.0f) + g2, gl.L(12.0f), gl.L(6.0f), gl.L(6.0f), this.s);
                float L = (gl.L(12.0f) - gl.L(1.0f)) / 2.0f;
                RectF rectF = gl.P;
                rectF.set(i2, L, g2, gl.L(1.0f) + L);
                canvas2.drawRoundRect(rectF, gl.L(0.5f), gl.L(0.5f), this.r);
            }
        }
        canvas2 = canvas;
        float L2 = (gl.L(12.0f) - gl.L(1.0f)) / 2.0f;
        RectF rectF2 = gl.P;
        rectF2.set(i2, L2, g2, gl.L(1.0f) + L2);
        canvas2.drawRoundRect(rectF2, gl.L(0.5f), gl.L(0.5f), this.r);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(12.0f));
    }

    @Override
    public final void updateColors() {
        int i = bkb.ll;
        wjb wjbVar = this.n;
        this.r.setColor(bkb.v0(i, wjbVar));
        this.s.setColor(bkb.v0(bkb.kg, wjbVar));
    }
}
