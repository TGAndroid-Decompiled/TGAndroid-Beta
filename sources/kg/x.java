package kg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.a21;
import org.telegram.ui.ay;
import org.telegram.ui.pf0;
import org.telegram.ui.t5;
import w7.b6;
public final class x extends FrameLayout {
    public static final int e = 0;
    public final int f11321a = 5;
    public boolean f11322b;
    public Object f11323c;
    public final Object d;

    public x(Context context) {
        super(context);
        LinearLayout f7 = m5.f(context, 1);
        addView(f7, b6.e(-2, -2, 17));
        g9 g9Var = new g9(context);
        this.f11323c = g9Var;
        f7.addView(g9Var, b6.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131748832, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(textView, b6.t(-2, -2, 1, 0, 8, 0, 0));
        vh.d dVar = new vh.d(context, null, true);
        this.d = dVar;
        dVar.i(cd.L0(2131748831, null), false, true);
        f7.addView(dVar, b6.t((int) ((dVar.d.e() + org.telegram.messenger.i0.L(24.0f)) / org.telegram.messenger.i0.f16025p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bh.c(26));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f11321a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.f11323c;
                if (this.f11322b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                    paint.setColor(((ay) obj).getThemedColor(t6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f11323c;
                if (this.f11322b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
                    paint2.setColor(((pf0) obj).getThemedColor(t6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                a21 a21Var = (a21) obj;
                if (!this.f11322b && a21Var.f35532r > 0.0f) {
                    if (((Paint) this.f11323c) == null) {
                        Paint paint3 = new Paint();
                        this.f11323c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f11323c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f11323c).setAlpha((int) (a21Var.f35532r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(18.0f), getMeasuredHeight(), (Paint) this.f11323c);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.f11321a) {
            case 0:
                boolean z11 = this.f11322b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f7 = limitPreviewView.f24097a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24104e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f11323c, 31);
                        w wVar = limitPreviewView.f24104e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((t5) ((org.telegram.ui.y0) wVar).f43674b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        int i10;
        switch (this.f11321a) {
            case 1:
                RectF rectF = (RectF) this.f11323c;
                int L = org.telegram.messenger.i0.L(13.0f);
                tf0 tf0Var = (tf0) this.d;
                Drawable drawable = tf0Var.f30555k1;
                int i11 = (tf0Var.f30565v1 - tf0Var.f21614s0) - L;
                if (tf0Var.A0 == 1) {
                    i11 = (int) (tf0Var.f30553i1.getTranslationY() + i11);
                }
                int L2 = org.telegram.messenger.i0.L(20.0f) + i11;
                int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
                int i12 = tf0Var.f21614s0;
                int i13 = L3 + i12;
                if (i12 + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.i0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - i11) - tf0Var.f21614s0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * min);
                    i11 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i13 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i14 = org.telegram.messenger.i0.f16020m;
                int i15 = L2 + i14;
                drawable.setBounds(0, i11 + i14, getMeasuredWidth(), i13);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    t6.f21217t0.setColor(t6.x0(null, t6.f21001h5, false));
                    rectF.set(tf0Var.f21615t0, tf0Var.f21614s0 + i10, getMeasuredWidth() - tf0Var.f21615t0, org.telegram.messenger.i0.L(24.0f) + tf0Var.f21614s0 + i10);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, t6.f21217t0);
                }
                if (f7 != 0.0f) {
                    int L5 = org.telegram.messenger.i0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i15, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.i0.L(4.0f) + i15);
                    int x02 = t6.x0(null, t6.wj, false);
                    int alpha = Color.alpha(x02);
                    t6.f21217t0.setColor(x02);
                    t6.f21217t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), t6.f21217t0);
                }
                int x03 = t6.x0(null, t6.f21001h5, false);
                t6.f21217t0.setColor(Color.argb((int) (tf0Var.f30556m1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(tf0Var.f21615t0, 0.0f, getMeasuredWidth() - tf0Var.f21615t0, org.telegram.messenger.i0.f16020m, t6.f21217t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f11321a) {
            case 1:
                tf0 tf0Var = (tf0) this.d;
                if (motionEvent.getAction() == 0 && tf0Var.f30565v1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.i0.L(12.0f) + tf0Var.f30565v1 && tf0Var.f30556m1.getAlpha() == 0.0f) {
                        tf0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f11321a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                tf0.I0((tf0) this.d);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int M;
        switch (this.f11321a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                tf0 tf0Var = (tf0) this.d;
                n5 n5Var = tf0Var.f30564u1;
                org.telegram.ui.Components.pf0 pf0Var = tf0Var.f30554j1;
                nf0 nf0Var = tf0Var.f30553i1;
                if (!tf0Var.V) {
                    this.f11322b = true;
                    int i13 = tf0Var.f21615t0;
                    setPadding(i13, org.telegram.messenger.i0.f16020m, i13, 0);
                    this.f11322b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) nf0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) tf0Var.l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L = org.telegram.messenger.i0.L(15.0f) + tf0Var.f21614s0 + org.telegram.messenger.i0.f16020m;
                int R = pf0Var.R();
                for (int i14 = 0; i14 < R; i14++) {
                    if (i14 == 0) {
                        n5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (tf0Var.f21615t0 * 2)), 1073741824), i11);
                        M = n5Var.getMeasuredHeight();
                    } else {
                        M = ((pf0Var.M(i14) - 1) * org.telegram.messenger.i0.L(50.0f)) + org.telegram.messenger.i0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i12 = paddingTop - L;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.i0.L(8.0f) + i12;
                if (nf0Var.getPaddingTop() != L2) {
                    this.f11322b = true;
                    nf0Var.setPinnedSectionOffsetY(-L2);
                    nf0Var.setPadding(0, L2, 0, org.telegram.messenger.i0.f16021n);
                    this.f11322b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f11321a) {
            case 1:
                if (!((tf0) this.d).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f11321a) {
            case 1:
                if (!this.f11322b) {
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
    public void setVisibility(int i10) {
        switch (this.f11321a) {
            case 5:
                super.setVisibility(i10);
                if (i10 == 0 && !this.f11322b) {
                    ((g9) this.f11323c).setImageDrawable(new bi0(2131624318, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
                    this.f11322b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public x(pf0 pf0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = pf0Var;
        this.f11322b = z10;
        this.f11323c = new Paint(1);
    }

    public x(tf0 tf0Var, Context context) {
        super(context);
        this.d = tf0Var;
        this.f11322b = false;
        this.f11323c = new RectF();
    }

    public x(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f11323c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f11322b = z10;
    }

    public x(a21 a21Var, Context context, boolean z10) {
        super(context);
        this.d = a21Var;
        this.f11322b = z10;
    }

    public x(ay ayVar, Activity activity, boolean z10) {
        super(activity);
        this.d = ayVar;
        this.f11322b = z10;
        this.f11323c = new Paint(1);
    }
}
