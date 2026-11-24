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
public final class xf5 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final wjb a;
    public final lm b;
    public final lm c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public xf5(Context context, wjb wjbVar) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = wjbVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.x(-1, -1, 8388611));
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setTypeface(gl.o());
        lm lmVar = new lm(new Runnable(this) {
            public final xf5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                xf5 xf5Var = this.b;
                switch (b) {
                    case 0:
                        xf5Var.invalidate();
                        LinearLayout linearLayout2 = xf5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        xf5Var.invalidate();
                        LinearLayout linearLayout3 = xf5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.b = lmVar;
        lmVar.g = 180L;
        lm lmVar2 = new lm(new Runnable(this) {
            public final xf5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                xf5 xf5Var = this.b;
                switch (b) {
                    case 0:
                        xf5Var.invalidate();
                        LinearLayout linearLayout2 = xf5Var.d;
                        linearLayout2.invalidate();
                        while (i < linearLayout2.getChildCount()) {
                            linearLayout2.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                    default:
                        xf5Var.invalidate();
                        LinearLayout linearLayout3 = xf5Var.d;
                        linearLayout3.invalidate();
                        while (i < linearLayout3.getChildCount()) {
                            linearLayout3.getChildAt(i).invalidate();
                            i++;
                        }
                        return;
                }
            }
        });
        this.c = lmVar2;
        lmVar2.g = 180L;
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

    public final void b(ArrayList arrayList, uc7 uc7Var) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i = 0; i < arrayList.size(); i++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i);
            sb sbVar = new sb(getContext(), (byte) 15);
            sbVar.setDrawingCacheEnabled(false);
            sbVar.setOnClickListener(new wg(this, i, uc7Var, (byte) 8));
            sbVar.setPadding(gl.L(12.0f), gl.L(5.0f), gl.L(12.0f), gl.L(5.0f));
            LinearLayout.LayoutParams o = nme.o(-2, -2);
            if (i < arrayList.size() - 1) {
                o.rightMargin = gl.L(4.0f);
            }
            sbVar.b = new tgb(charSequence, this.f);
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
        path.addRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z = this.h;
        wjb wjbVar = this.a;
        if (z) {
            v0 = bkb.p1(0.1f, bkb.v0(bkb.Ei, wjbVar));
        } else {
            v0 = bkb.v0(bkb.x6, wjbVar) & 520093695;
        }
        Paint paint = this.e;
        paint.setColor(v0);
        canvas.drawPath(path, paint);
        int v03 = bkb.v0(bkb.x6, wjbVar);
        TextPaint textPaint = this.f;
        textPaint.setColor(v03);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.h) {
            v02 = bkb.v0(bkb.Ei, wjbVar);
        } else {
            v02 = bkb.v0(bkb.X8, wjbVar);
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
