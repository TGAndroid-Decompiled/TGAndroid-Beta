package defpackage;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
public abstract class k34 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final lm e;
    public boolean f;
    public final l34 h;

    public k34(l34 l34Var, Context context) {
        super(context);
        this.h = l34Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new lm(this, 0L, 250L, s33.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{gl.L(10.0f), gl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(gl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gl.N(2.66f));
        paint3.setShadowLayer(gl.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f, float f2);

    public final void b() {
        l34 l34Var = this.h;
        l29 selectionBounds = l34Var.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(l34Var.getRotation());
    }

    public float getShowAlpha() {
        return this.e.d(this.f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k34.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
