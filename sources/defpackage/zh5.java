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
public final class zh5 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final vnb a;
    public final mm b;
    public final mm c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public zh5(Context context, vnb vnbVar) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = vnbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.x(-1, -1, 8388611));
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setTypeface(hl.o());
        mm mmVar = new mm(new Runnable(this) {
            public final zh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                zh5 zh5Var = this.b;
                switch (b) {
                    case 0:
                        zh5Var.invalidate();
                        LinearLayout linearLayout2 = zh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        zh5Var.invalidate();
                        LinearLayout linearLayout3 = zh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.b = mmVar;
        mmVar.g = 180L;
        mm mmVar2 = new mm(new Runnable(this) {
            public final zh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                zh5 zh5Var = this.b;
                switch (b) {
                    case 0:
                        zh5Var.invalidate();
                        LinearLayout linearLayout2 = zh5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        zh5Var.invalidate();
                        LinearLayout linearLayout3 = zh5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.c = mmVar2;
        mmVar2.g = 180L;
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

    public final void b(ArrayList arrayList, ef7 ef7Var) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            tb tbVar = new tb(getContext(), (byte) 16);
            tbVar.setDrawingCacheEnabled(false);
            tbVar.setOnClickListener(new ae(this, i, ef7Var, (byte) 8));
            tbVar.setPadding(hl.L(12.0f), hl.L(5.0f), hl.L(12.0f), hl.L(5.0f));
            LinearLayout.LayoutParams o = tre.o(-2, -2);
            if (i < arrayList.size() - 1) {
                o.rightMargin = hl.L(4.0f);
            }
            tbVar.b = new pkb(charSequence, this.f);
            linearLayout.addView(tbVar, o);
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
        path.addRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z = this.h;
        vnb vnbVar = this.a;
        if (z) {
            v0 = aob.p1(0.1f, aob.v0(aob.Fi, vnbVar));
        } else {
            v0 = aob.v0(aob.y6, vnbVar) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v0);
        canvas.drawPath(path, paint);
        int v03 = aob.v0(aob.y6, vnbVar);
        TextPaint textPaint = this.f;
        textPaint.setColor(v03);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v02 = aob.v0(aob.Fi, vnbVar);
        } else {
            v02 = aob.v0(aob.Y8, vnbVar);
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
