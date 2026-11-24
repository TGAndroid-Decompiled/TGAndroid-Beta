package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class wh5 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final ylb a;
    public final ln b;
    public final ln c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public wh5(Context context, ylb ylbVar) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = ylbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.x(-1, -1, 8388611));
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setTypeface(gm.o());
        ln lnVar = new ln(new Runnable(this) {
            public final wh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                wh5 wh5Var = this.b;
                switch (b) {
                    case 0:
                        wh5Var.invalidate();
                        LinearLayout linearLayout2 = wh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        wh5Var.invalidate();
                        LinearLayout linearLayout3 = wh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.b = lnVar;
        lnVar.g = 180L;
        ln lnVar2 = new ln(new Runnable(this) {
            public final wh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                wh5 wh5Var = this.b;
                switch (b) {
                    case 0:
                        wh5Var.invalidate();
                        LinearLayout linearLayout2 = wh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        wh5Var.invalidate();
                        LinearLayout linearLayout3 = wh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.c = lnVar2;
        lnVar2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i, boolean z) {
        this.n = i;
        LinearLayout linearLayout = this.d;
        boolean z2 = !z;
        this.b.e(z2, linearLayout.getChildAt(i).getLeft());
        this.c.e(z2, linearLayout.getChildAt(i).getRight());
    }

    public final void b(ArrayList arrayList, we7 we7Var) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            sb sbVar = new sb(getContext(), (byte) 16);
            sbVar.setDrawingCacheEnabled(false);
            sbVar.setOnClickListener(new wh(this, i, we7Var, (byte) 8));
            sbVar.setPadding(gm.L(12.0f), gm.L(5.0f), gm.L(12.0f), gm.L(5.0f));
            LinearLayout.LayoutParams o = qoe.o(-2, -2);
            if (i < arrayList.size() - 1) {
                o.rightMargin = gm.L(4.0f);
            }
            sbVar.b = new uib(charSequence, this.f);
            linearLayout.addView(sbVar, o);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v0;
        int v02;
        RectF rectF = w;
        rectF.set(this.b.c(), 0.0f, this.c.c(), getMeasuredHeight());
        Path path = this.r;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z = this.h;
        ylb ylbVar = this.a;
        if (z) {
            v0 = cmb.p1(0.1f, cmb.v0(cmb.Ei, ylbVar));
        } else {
            v0 = cmb.v0(cmb.x6, ylbVar) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v0);
        canvas.drawPath(path, paint);
        int v03 = cmb.v0(cmb.x6, ylbVar);
        TextPaint textPaint = this.f;
        textPaint.setColor(v03);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v02 = cmb.v0(cmb.Ei, ylbVar);
        } else {
            v02 = cmb.v0(cmb.X8, ylbVar);
        }
        textPaint.setColor(v02);
        canvas.save();
        canvas.clipPath(path);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.n, false);
    }

    public void setAccent(boolean z) {
        this.h = z;
    }
}
