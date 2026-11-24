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
public final class yj3 extends FrameLayout {
    public final byte a = 2;
    public Object b;
    public boolean c;
    public final Object d;

    public yj3(Context context) {
        super(context);
        LinearLayout i = hg9.i(context, 1);
        addView(i, qoe.e(-2, -2, 17));
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        i.addView(bf0Var, qoe.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131748579, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        i.addView(textView, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        b61 b61Var = new b61(null, context, true);
        this.d = b61Var;
        b61Var.i(jb6.M0(2131748578, null), false, true);
        i.addView(b61Var, qoe.t((int) ((b61Var.d.e() + gm.L(24.0f)) / gm.p), 38, 1, 0, 18, 0, 0));
        b61Var.setOnClickListener(new x10((byte) 1));
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
                    paint.setStrokeWidth(gm.L(1.33f));
                    paint.setColor(((nk3) obj).getThemedColor(cmb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gm.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.b;
                if (this.c) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(gm.L(1.33f));
                    paint2.setColor(((bj6) obj).getThemedColor(cmb.Ei));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gm.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                ny9 ny9Var = (ny9) obj;
                if (!this.c && ny9Var.r > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint3 = new Paint();
                        this.b = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, gm.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (ny9Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, gm.L(18.0f), getMeasuredHeight(), (Paint) this.b);
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
                        p36 p36Var = limitPreviewView.f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((lp0) ((xg0) p36Var).b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
                int L = gm.L(13.0f);
                ih8 ih8Var = (ih8) this.d;
                Drawable drawable = ih8Var.n1;
                int i2 = (ih8Var.y1 - ih8Var.t0) - L;
                if (ih8Var.B0 == 1) {
                    i2 = (int) (ih8Var.l1.getTranslationY() + i2);
                }
                int L2 = gm.L(20.0f) + i2;
                int L3 = gm.L(15.0f) + getMeasuredHeight();
                int i3 = ih8Var.t0;
                int i4 = L3 + i3;
                if (i3 + i2 < a.getCurrentActionBarHeight()) {
                    float L4 = gm.L(4.0f) + L;
                    float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - i2) - ih8Var.t0) / L4);
                    int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * min);
                    i2 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i4 += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                int i5 = gm.m;
                int i6 = L2 + i5;
                drawable.setBounds(0, i2 + i5, getMeasuredWidth(), i4);
                drawable.draw(canvas);
                if (f != 1.0f) {
                    cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
                    rectF.set(ih8Var.u0, ih8Var.t0 + i, getMeasuredWidth() - ih8Var.u0, gm.L(24.0f) + ih8Var.t0 + i);
                    canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
                }
                if (f != 0.0f) {
                    int L5 = gm.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i6, (getMeasuredWidth() + L5) / 2, gm.L(4.0f) + i6);
                    int w0 = cmb.w0(null, cmb.yj, false);
                    int alpha = Color.alpha(w0);
                    cmb.s0.setColor(w0);
                    cmb.s0.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
                }
                int w02 = cmb.w0(null, cmb.g5, false);
                cmb.s0.setColor(Color.argb((int) (ih8Var.p1.getAlpha() * 255.0f), Color.red(w02), Color.green(w02), Color.blue(w02)));
                canvas.drawRect(ih8Var.u0, 0.0f, getMeasuredWidth() - ih8Var.u0, gm.m, cmb.s0);
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
                ih8 ih8Var = (ih8) this.d;
                if (motionEvent.getAction() == 0 && ih8Var.y1 != 0) {
                    if (motionEvent.getY() < gm.L(12.0f) + ih8Var.y1 && ih8Var.p1.getAlpha() == 0.0f) {
                        ih8Var.dismiss();
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
                ((ih8) this.d).G0();
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
                ih8 ih8Var = (ih8) this.d;
                fn fnVar = ih8Var.x1;
                eh8 eh8Var = ih8Var.m1;
                ch8 ch8Var = ih8Var.l1;
                if (!ih8Var.W) {
                    this.c = true;
                    int i4 = ih8Var.u0;
                    setPadding(i4, gm.m, i4, 0);
                    this.c = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ch8Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ih8Var.o1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                int L = gm.L(15.0f) + ih8Var.t0 + gm.m;
                int R = eh8Var.R();
                for (int i5 = 0; i5 < R; i5++) {
                    if (i5 == 0) {
                        fnVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - (ih8Var.u0 << 1)), 1073741824), i2);
                        M = fnVar.getMeasuredHeight();
                    } else {
                        M = ((eh8Var.M(i5) - 1) * gm.L(50.0f)) + gm.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                } else {
                    i3 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = gm.L(8.0f) + i3;
                if (ch8Var.getPaddingTop() != L2) {
                    this.c = true;
                    ch8Var.setPinnedSectionOffsetY(-L2);
                    ch8Var.setPadding(0, L2, 0, gm.n);
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
                if (!((ih8) this.d).J && super.onTouchEvent(motionEvent)) {
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
                    ((bf0) this.b).setImageDrawable(new p09(2131624316, gm.L(130.0f), gm.L(130.0f)));
                    this.c = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public yj3(ih8 ih8Var, Context context) {
        super(context);
        this.d = ih8Var;
        this.c = false;
        this.b = new RectF();
    }

    public yj3(bj6 bj6Var, Activity activity, boolean z) {
        super(activity);
        this.d = bj6Var;
        this.c = z;
        this.b = new Paint(1);
    }

    public yj3(LimitPreviewView limitPreviewView, Context context, boolean z) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.b = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = z;
    }

    public yj3(ny9 ny9Var, Context context, boolean z) {
        super(context);
        this.d = ny9Var;
        this.c = z;
    }

    public yj3(nk3 nk3Var, Activity activity, boolean z) {
        super(activity);
        this.d = nk3Var;
        this.c = z;
        this.b = new Paint(1);
    }
}
