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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.bx;
import org.telegram.ui.i01;
import org.telegram.ui.le0;
public final class y3 extends FrameLayout {
    public static final int f15859e = 0;
    public final int f15860a = 0;
    public boolean f15861b;
    public Object f15862c;
    public final Object d;

    public y3(Context context) {
        super(context);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.na.e(-2, -2, 17));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f15862c = p9Var;
        g10.addView(p9Var, c8.na.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131748629, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView, c8.na.t(-2, -2, 1, 0, 8, 0, 0));
        e eVar = new e(context, null, true);
        this.d = eVar;
        eVar.i(gd.N0(2131748628, null), false, true);
        g10.addView(eVar, c8.na.t((int) ((eVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f24225p), 38, 1, 0, 18, 0, 0));
        eVar.setOnClickListener(new bi.o(7));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f15860a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f15862c;
                if (this.f15861b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((bx) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f15862c;
                if (this.f15861b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((le0) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                i01 i01Var = (i01) obj;
                if (!this.f15861b && i01Var.f48683r > 0.0f) {
                    if (((Paint) this.f15862c) == null) {
                        Paint paint3 = new Paint();
                        this.f15862c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f15862c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f15862c).setAlpha((int) (i01Var.f48683r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f15862c);
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
        switch (this.f15860a) {
            case 5:
                boolean z11 = this.f15861b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f33124a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f33134f0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f15862c, 31);
                        ug.s sVar = limitPreviewView.f33134f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f53063b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f15860a) {
            case 1:
                RectF rectF = (RectF) this.f15862c;
                int L = org.telegram.messenger.g0.L(13.0f);
                ef0 ef0Var = (ef0) this.d;
                Drawable drawable = ef0Var.f34703o1;
                int i10 = (ef0Var.f34714z1 - ef0Var.f30260t0) - L;
                if (ef0Var.B0 == 1) {
                    i10 = (int) (ef0Var.f34702m1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = ef0Var.f30260t0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - ef0Var.f30260t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f24220m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
                    rectF.set(ef0Var.f30261u0, ef0Var.f30260t0 + i7, getMeasuredWidth() - ef0Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + ef0Var.f30260t0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29742t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.n6.f29742t0.setColor(x02);
                    org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
                }
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false);
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(Color.argb((int) (ef0Var.f34705q1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(ef0Var.f30261u0, 0.0f, getMeasuredWidth() - ef0Var.f30261u0, org.telegram.messenger.g0.f24220m, org.telegram.ui.ActionBar.n6.f29742t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f15860a) {
            case 1:
                ef0 ef0Var = (ef0) this.d;
                if (motionEvent.getAction() == 0 && ef0Var.f34714z1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + ef0Var.f34714z1 && ef0Var.f34705q1.getAlpha() == 0.0f) {
                        ef0Var.dismiss();
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
        switch (this.f15860a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ef0.J0((ef0) this.d);
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
        switch (this.f15860a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                ef0 ef0Var = (ef0) this.d;
                org.telegram.ui.Components.w5 w5Var = ef0Var.f34713y1;
                af0 af0Var = ef0Var.n1;
                ye0 ye0Var = ef0Var.f34702m1;
                if (!ef0Var.W) {
                    this.f15861b = true;
                    int i12 = ef0Var.f30261u0;
                    setPadding(i12, org.telegram.messenger.g0.f24220m, i12, 0);
                    this.f15861b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ye0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ef0Var.f34704p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + ef0Var.f30260t0 + org.telegram.messenger.g0.f24220m;
                int R = af0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        w5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (ef0Var.f30261u0 * 2)), 1073741824), i10);
                        M = w5Var.getMeasuredHeight();
                    } else {
                        M = ((af0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (ye0Var.getPaddingTop() != L2) {
                    this.f15861b = true;
                    ye0Var.setPinnedSectionOffsetY(-L2);
                    ye0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f24221n);
                    this.f15861b = false;
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
        switch (this.f15860a) {
            case 1:
                if (!((ef0) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f15860a) {
            case 1:
                if (!this.f15861b) {
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
        switch (this.f15860a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f15861b) {
                    ((org.telegram.ui.Components.p9) this.f15862c).setImageDrawable(new nh0(2131624321, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f15861b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public y3(ef0 ef0Var, Context context) {
        super(context);
        this.d = ef0Var;
        this.f15861b = false;
        this.f15862c = new RectF();
    }

    public y3(le0 le0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = le0Var;
        this.f15861b = z10;
        this.f15862c = new Paint(1);
    }

    public y3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f15862c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f15861b = z10;
    }

    public y3(i01 i01Var, Context context, boolean z10) {
        super(context);
        this.d = i01Var;
        this.f15861b = z10;
    }

    public y3(bx bxVar, Activity activity, boolean z10) {
        super(activity);
        this.d = bxVar;
        this.f15861b = z10;
        this.f15862c = new Paint(1);
    }
}
