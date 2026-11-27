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
public final class gj3 extends FrameLayout {
    public final byte a = 2;
    public Object b;
    public boolean c;
    public final Object d;

    public gj3(Context context) {
        super(context);
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.e(-2, -2, 17));
        de0 de0Var = new de0(context);
        this.b = de0Var;
        j.addView(de0Var, tre.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131748576, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        j.addView(textView, tre.t(-2, -2, 1, 0, 8, 0, 0));
        c51 c51Var = new c51(null, context, true);
        this.d = c51Var;
        c51Var.i(ob6.M0(2131748575, null), false, true);
        j.addView(c51Var, tre.t((int) ((c51Var.d.e() + hl.L(24.0f)) / hl.p), 38, 1, 0, 18, 0, 0));
        c51Var.setOnClickListener(new y00((byte) 1));
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
                    paint.setStrokeWidth(hl.L(1.33f));
                    paint.setColor(((uj3) obj).getThemedColor(aob.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, hl.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.b;
                if (this.c) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(hl.L(1.33f));
                    paint2.setColor(((fj6) obj).getThemedColor(aob.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, hl.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                e0a e0aVar = (e0a) obj;
                if (!this.c && e0aVar.r > 0.0f) {
                    if (((Paint) this.b) == null) {
                        Paint paint3 = new Paint();
                        this.b = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, hl.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.b).setAlpha((int) (e0aVar.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, hl.L(18.0f), getMeasuredHeight(), (Paint) this.b);
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
                        t36 t36Var = limitPreviewView.f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((lo0) ((tg0) t36Var).b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
                int L = hl.L(13.0f);
                ui8 ui8Var = (ui8) this.d;
                Drawable drawable = ui8Var.n1;
                int i2 = (ui8Var.y1 - ui8Var.t0) - L;
                if (ui8Var.B0 == 1) {
                    i2 = (int) (ui8Var.l1.getTranslationY() + i2);
                }
                int L2 = hl.L(20.0f) + i2;
                int L3 = hl.L(15.0f) + getMeasuredHeight();
                int i3 = ui8Var.t0;
                int i4 = L3 + i3;
                if (i3 + i2 < a.getCurrentActionBarHeight()) {
                    float L4 = hl.L(4.0f) + L;
                    float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - i2) - ui8Var.t0) / L4);
                    int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * min);
                    i2 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i4 += currentActionBarHeight;
                    f = 1.0f - min;
                } else {
                    f = 1.0f;
                }
                int i5 = hl.m;
                int i6 = L2 + i5;
                drawable.setBounds(0, i2 + i5, getMeasuredWidth(), i4);
                drawable.draw(canvas);
                if (f != 1.0f) {
                    aob.s0.setColor(aob.w0(null, aob.h5, false));
                    rectF.set(ui8Var.u0, ui8Var.t0 + i, getMeasuredWidth() - ui8Var.u0, hl.L(24.0f) + ui8Var.t0 + i);
                    canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
                }
                if (f != 0.0f) {
                    int L5 = hl.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i6, (getMeasuredWidth() + L5) / 2, hl.L(4.0f) + i6);
                    int w0 = aob.w0(null, aob.zj, false);
                    int alpha = Color.alpha(w0);
                    aob.s0.setColor(w0);
                    aob.s0.setAlpha((int) (alpha * 1.0f * f));
                    canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
                }
                int w02 = aob.w0(null, aob.h5, false);
                aob.s0.setColor(Color.argb((int) (ui8Var.p1.getAlpha() * 255.0f), Color.red(w02), Color.green(w02), Color.blue(w02)));
                canvas.drawRect(ui8Var.u0, 0.0f, getMeasuredWidth() - ui8Var.u0, hl.m, aob.s0);
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
                ui8 ui8Var = (ui8) this.d;
                if (motionEvent.getAction() == 0 && ui8Var.y1 != 0) {
                    if (motionEvent.getY() < hl.L(12.0f) + ui8Var.y1 && ui8Var.p1.getAlpha() == 0.0f) {
                        ui8Var.dismiss();
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
                ((ui8) this.d).H0();
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
                ui8 ui8Var = (ui8) this.d;
                gm gmVar = ui8Var.x1;
                qi8 qi8Var = ui8Var.m1;
                oi8 oi8Var = ui8Var.l1;
                if (!ui8Var.W) {
                    this.c = true;
                    int i4 = ui8Var.u0;
                    setPadding(i4, hl.m, i4, 0);
                    this.c = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) oi8Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ui8Var.o1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
                int L = hl.L(15.0f) + ui8Var.t0 + hl.m;
                int R = qi8Var.R();
                for (int i5 = 0; i5 < R; i5++) {
                    if (i5 == 0) {
                        gmVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - (ui8Var.u0 << 1)), 1073741824), i2);
                        M = gmVar.getMeasuredHeight();
                    } else {
                        M = ((qi8Var.M(i5) - 1) * hl.L(50.0f)) + hl.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i3 = paddingTop - L;
                } else {
                    i3 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = hl.L(8.0f) + i3;
                if (oi8Var.getPaddingTop() != L2) {
                    this.c = true;
                    oi8Var.setPinnedSectionOffsetY(-L2);
                    oi8Var.setPadding(0, L2, 0, hl.n);
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
                if (!((ui8) this.d).J && super.onTouchEvent(motionEvent)) {
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
                    ((de0) this.b).setImageDrawable(new b29(2131624316, hl.L(130.0f), hl.L(130.0f)));
                    this.c = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public gj3(ui8 ui8Var, Context context) {
        super(context);
        this.d = ui8Var;
        this.c = false;
        this.b = new RectF();
    }

    public gj3(fj6 fj6Var, Activity activity, boolean z) {
        super(activity);
        this.d = fj6Var;
        this.c = z;
        this.b = new Paint(1);
    }

    public gj3(LimitPreviewView limitPreviewView, Context context, boolean z) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.b = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.c = z;
    }

    public gj3(e0a e0aVar, Context context, boolean z) {
        super(context);
        this.d = e0aVar;
        this.c = z;
    }

    public gj3(uj3 uj3Var, Activity activity, boolean z) {
        super(activity);
        this.d = uj3Var;
        this.c = z;
        this.b = new Paint(1);
    }
}
