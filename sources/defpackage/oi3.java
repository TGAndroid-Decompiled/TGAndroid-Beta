package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class oi3 extends FrameLayout {
    public final byte a = 3;
    public Object b;
    public boolean c;
    public final Object d;

    public oi3(Context context) {
        super(context);
        LinearLayout j = de9.j(context, 1);
        addView(j, nme.e(-2, -2, 17));
        be0 be0Var = new be0(context);
        this.b = be0Var;
        j.addView(be0Var, nme.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131748630, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        j.addView(textView, nme.t(-2, -2, 1, 0, 8, 0, 0));
        u41 u41Var = new u41(null, context, true);
        this.d = u41Var;
        u41Var.i(k96.M0(2131748629, null), false, true);
        j.addView(u41Var, nme.t((int) ((u41Var.d.e() + gl.L(24.0f)) / gl.p), 38, 1, 0, 18, 0, 0));
        u41Var.setOnClickListener(new x00((byte) 1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                Paint paint = (Paint) this.b;
                if (this.c) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(gl.L(1.33f));
                    paint.setColor(((cj3) obj).getThemedColor(bkb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.b;
                if (this.c) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(gl.L(1.33f));
                    paint2.setColor(((ah6) obj).getThemedColor(bkb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                lw9 lw9Var = (lw9) obj;
                if (!this.c && lw9Var.r > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint3 = new Paint();
                        this.b = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, gl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (lw9Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        switch (this.a) {
            case 1:
                boolean z2 = this.c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j);
                    float f = limitPreviewView.a;
                    boolean z3 = false;
                    if (f != 0.0f && f <= 1.0f && z2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (f == 1.0f && !z2) {
                        z3 = true;
                    }
                    if ((z || z3) && limitPreviewView.e()) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.b, 31);
                        p16 p16Var = limitPreviewView.f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((lo0) ((sg0) p16Var).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        switch (this.a) {
            case 4:
                RectF rectF = (RectF) this.b;
                int L = gl.L(13.0f);
                gf8 gf8Var = (gf8) this.d;
                Drawable drawable = gf8Var.n1;
                int i2 = (gf8Var.y1 - gf8Var.t0) - L;
                if (gf8Var.B0 == 1) {
                    i2 = (int) (gf8Var.l1.getTranslationY() + i2);
                }
                int L2 = gl.L(20.0f) + i2;
                int L3 = gl.L(15.0f) + getMeasuredHeight();
                int i3 = gf8Var.t0;
                int i4 = L3 + i3;
                if (i3 + i2 < a.getCurrentActionBarHeight()) {
                    float L4 = gl.L(4.0f) + L;
                    float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - i2) - gf8Var.t0) / L4);
                    int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * min);
                    i2 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i4 += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                int i5 = gl.m;
                int i6 = L2 + i5;
                drawable.setBounds(0, i2 + i5, getMeasuredWidth(), i4);
                drawable.draw(canvas);
                if (f != 1.0f) {
                    bkb.s0.setColor(bkb.w0(null, bkb.g5, false));
                    rectF.set(gf8Var.u0, gf8Var.t0 + i, getMeasuredWidth() - gf8Var.u0, gl.L(24.0f) + gf8Var.t0 + i);
                    canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
                }
                if (f != 0.0f) {
                    int L5 = gl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i6, (getMeasuredWidth() + L5) / 2, gl.L(4.0f) + i6);
                    int w0 = bkb.w0(null, bkb.yj, false);
                    int alpha = Color.alpha(w0);
                    bkb.s0.setColor(w0);
                    bkb.s0.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
                }
                int w02 = bkb.w0(null, bkb.g5, false);
                bkb.s0.setColor(Color.argb((int) (gf8Var.p1.getAlpha() * 255.0f), Color.red(w02), Color.green(w02), Color.blue(w02)));
                canvas.drawRect(gf8Var.u0, 0.0f, getMeasuredWidth() - gf8Var.u0, gl.m, bkb.s0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                gf8 gf8Var = (gf8) this.d;
                if (motionEvent.getAction() == 0 && gf8Var.y1 != 0) {
                    if (motionEvent.getY() < gl.L(12.0f) + gf8Var.y1 && gf8Var.p1.getAlpha() == 0.0f) {
                        gf8Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                ((gf8) this.d).G0();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int M;
        switch (this.a) {
            case 4:
                int size = View.MeasureSpec.getSize(i2);
                gf8 gf8Var = (gf8) this.d;
                fm fmVar = gf8Var.x1;
                cf8 cf8Var = gf8Var.m1;
                af8 af8Var = gf8Var.l1;
                if (!gf8Var.W) {
                    this.c = true;
                    int i4 = gf8Var.u0;
                    setPadding(i4, gl.m, i4, 0);
                    this.c = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) af8Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) gf8Var.o1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                int L = gl.L(15.0f) + gf8Var.t0 + gl.m;
                int R = cf8Var.R();
                for (int i5 = 0; i5 < R; i5++) {
                    if (i5 == 0) {
                        fmVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - (gf8Var.u0 << 1)), 1073741824), i2);
                        M = fmVar.getMeasuredHeight();
                    } else {
                        M = ((cf8Var.M(i5) - 1) * gl.L(50.0f)) + gl.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                } else {
                    i3 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = gl.L(8.0f) + i3;
                if (af8Var.getPaddingTop() != L2) {
                    this.c = true;
                    af8Var.setPinnedSectionOffsetY(-L2);
                    af8Var.setPadding(0, L2, 0, gl.n);
                    this.c = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                if (!((gf8) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 4:
                if (!this.c) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i == 0 && !this.c) {
                    ((be0) this.b).setImageDrawable(new oy8(2131624315, gl.L(130.0f), gl.L(130.0f)));
                    this.c = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public oi3(gf8 gf8Var, Context context) {
        super(context);
        this.d = gf8Var;
        this.c = false;
        this.b = new RectF();
    }

    public oi3(ah6 ah6Var, Activity activity, boolean z) {
        super(activity);
        this.d = ah6Var;
        this.c = z;
        this.b = new Paint(1);
    }

    public oi3(LimitPreviewView limitPreviewView, Context context, boolean z) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.b = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = z;
    }

    public oi3(lw9 lw9Var, Context context, boolean z) {
        super(context);
        this.d = lw9Var;
        this.c = z;
    }

    public oi3(cj3 cj3Var, Activity activity, boolean z) {
        super(activity);
        this.d = cj3Var;
        this.c = z;
        this.b = new Paint(1);
    }
}
