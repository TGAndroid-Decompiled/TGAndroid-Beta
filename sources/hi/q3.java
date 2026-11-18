package hi;

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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.cx;
import org.telegram.ui.j01;
import org.telegram.ui.le0;
public final class q3 extends FrameLayout {
    public static final int f15266e = 0;
    public final int f15267a = 0;
    public boolean f15268b;
    public Object f15269c;
    public final Object d;

    public q3(Context context) {
        super(context);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.ma.e(-2, -2, 17));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f15269c = q9Var;
        g10.addView(q9Var, c8.ma.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131748630, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(gd.M0(2131748629, null), false, true);
        g10.addView(dVar, c8.ma.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f24120p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.o(7));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f15267a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f15269c;
                if (this.f15268b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((cx) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f15269c;
                if (this.f15268b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((le0) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                j01 j01Var = (j01) obj;
                if (!this.f15268b && j01Var.f48838r > 0.0f) {
                    if (((Paint) this.f15269c) == null) {
                        Paint paint3 = new Paint();
                        this.f15269c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f15269c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f15269c).setAlpha((int) (j01Var.f48838r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f15269c);
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        switch (this.f15267a) {
            case 5:
                boolean z11 = this.f15268b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f33024a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f33034f0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f15269c, 31);
                        ug.s sVar = limitPreviewView.f33034f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f52894b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int i7;
        switch (this.f15267a) {
            case 1:
                RectF rectF = (RectF) this.f15269c;
                int L = org.telegram.messenger.g0.L(13.0f);
                df0 df0Var = (df0) this.d;
                Drawable drawable = df0Var.f34421o1;
                int i10 = (df0Var.f34432z1 - df0Var.f30226t0) - L;
                if (df0Var.B0 == 1) {
                    i10 = (int) (df0Var.f34420m1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = df0Var.f30226t0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - df0Var.f30226t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f24115m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false));
                    rectF.set(df0Var.f30227u0, df0Var.f30226t0 + i7, getMeasuredWidth() - df0Var.f30227u0, org.telegram.messenger.g0.L(24.0f) + df0Var.f30226t0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29687t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.n6.f29687t0.setColor(x02);
                    org.telegram.ui.ActionBar.n6.f29687t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29687t0);
                }
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false);
                org.telegram.ui.ActionBar.n6.f29687t0.setColor(Color.argb((int) (df0Var.f34423q1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(df0Var.f30227u0, 0.0f, getMeasuredWidth() - df0Var.f30227u0, org.telegram.messenger.g0.f24115m, org.telegram.ui.ActionBar.n6.f29687t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f15267a) {
            case 1:
                df0 df0Var = (df0) this.d;
                if (motionEvent.getAction() == 0 && df0Var.f34432z1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + df0Var.f34432z1 && df0Var.f34423q1.getAlpha() == 0.0f) {
                        df0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f15267a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                df0.J0((df0) this.d);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int M;
        switch (this.f15267a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                df0 df0Var = (df0) this.d;
                org.telegram.ui.Components.w5 w5Var = df0Var.f34431y1;
                ze0 ze0Var = df0Var.n1;
                xe0 xe0Var = df0Var.f34420m1;
                if (!df0Var.W) {
                    this.f15268b = true;
                    int i12 = df0Var.f30227u0;
                    setPadding(i12, org.telegram.messenger.g0.f24115m, i12, 0);
                    this.f15268b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) xe0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) df0Var.f34422p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + df0Var.f30226t0 + org.telegram.messenger.g0.f24115m;
                int R = ze0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        w5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (df0Var.f30227u0 * 2)), 1073741824), i10);
                        M = w5Var.getMeasuredHeight();
                    } else {
                        M = ((ze0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (xe0Var.getPaddingTop() != L2) {
                    this.f15268b = true;
                    xe0Var.setPinnedSectionOffsetY(-L2);
                    xe0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f24116n);
                    this.f15268b = false;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f15267a) {
            case 1:
                if (!((df0) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f15267a) {
            case 1:
                if (!this.f15268b) {
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
    public void setVisibility(int i7) {
        switch (this.f15267a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f15268b) {
                    ((org.telegram.ui.Components.q9) this.f15269c).setImageDrawable(new mh0(2131624321, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f15268b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public q3(df0 df0Var, Context context) {
        super(context);
        this.d = df0Var;
        this.f15268b = false;
        this.f15269c = new RectF();
    }

    public q3(le0 le0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = le0Var;
        this.f15268b = z10;
        this.f15269c = new Paint(1);
    }

    public q3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f15269c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f15268b = z10;
    }

    public q3(j01 j01Var, Context context, boolean z10) {
        super(context);
        this.d = j01Var;
        this.f15268b = z10;
    }

    public q3(cx cxVar, Activity activity, boolean z10) {
        super(activity);
        this.d = cxVar;
        this.f15268b = z10;
        this.f15269c = new Paint(1);
    }
}
