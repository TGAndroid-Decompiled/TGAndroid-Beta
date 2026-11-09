package fi;

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
import org.telegram.messenger.id;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.re0;
import org.telegram.ui.k01;
import org.telegram.ui.le0;
import org.telegram.ui.yw;
public final class r3 extends FrameLayout {
    public static final int f12727e = 0;
    public final int f12728a = 0;
    public boolean f12729b;
    public Object f12730c;
    public final Object d;

    public r3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f12730c = l9Var;
        f10.addView(l9Var, c8.ha.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(id.M0(2131748822, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(id.M0(2131748821, null), false, true);
        f10.addView(dVar, c8.ha.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f22562p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.l1(2));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f12728a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f12730c;
                if (this.f12729b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((yw) obj).getThemedColor(org.telegram.ui.ActionBar.l6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f12730c;
                if (this.f12729b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((le0) obj).getThemedColor(org.telegram.ui.ActionBar.l6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                k01 k01Var = (k01) obj;
                if (!this.f12729b && k01Var.f47150r > 0.0f) {
                    if (((Paint) this.f12730c) == null) {
                        Paint paint3 = new Paint();
                        this.f12730c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f12730c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f12730c).setAlpha((int) (k01Var.f47150r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f12730c);
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
        boolean z9;
        switch (this.f12728a) {
            case 5:
                boolean z10 = this.f12729b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f31454a;
                    boolean z11 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (f10 == 1.0f && !z10) {
                        z11 = true;
                    }
                    if ((z9 || z11) && limitPreviewView.f31462e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f12730c, 31);
                        ug.s sVar = limitPreviewView.f31462e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f50811b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f12728a) {
            case 1:
                RectF rectF = (RectF) this.f12730c;
                int L = org.telegram.messenger.g0.L(13.0f);
                re0 re0Var = (re0) this.d;
                Drawable drawable = re0Var.f37687k1;
                int i10 = (re0Var.f37696v1 - re0Var.f28653s0) - L;
                if (re0Var.A0 == 1) {
                    i10 = (int) (re0Var.f37685i1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = re0Var.f28653s0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - re0Var.f28653s0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f22557m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
                    rectF.set(re0Var.f28654t0, re0Var.f28653s0 + i7, getMeasuredWidth() - re0Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + re0Var.f28653s0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.f28156t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.wj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.l6.f28156t0.setColor(x02);
                    org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
                }
                int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false);
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(Color.argb((int) (re0Var.f37688m1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(re0Var.f28654t0, 0.0f, getMeasuredWidth() - re0Var.f28654t0, org.telegram.messenger.g0.f22557m, org.telegram.ui.ActionBar.l6.f28156t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f12728a) {
            case 1:
                re0 re0Var = (re0) this.d;
                if (motionEvent.getAction() == 0 && re0Var.f37696v1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + re0Var.f37696v1 && re0Var.f37688m1.getAlpha() == 0.0f) {
                        re0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f12728a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                re0.I0((re0) this.d);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int M;
        switch (this.f12728a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                re0 re0Var = (re0) this.d;
                org.telegram.ui.Components.q5 q5Var = re0Var.f37695u1;
                ne0 ne0Var = re0Var.f37686j1;
                org.telegram.ui.Components.le0 le0Var = re0Var.f37685i1;
                if (!re0Var.V) {
                    this.f12729b = true;
                    int i12 = re0Var.f28654t0;
                    setPadding(i12, org.telegram.messenger.g0.f22557m, i12, 0);
                    this.f12729b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) le0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) re0Var.l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + re0Var.f28653s0 + org.telegram.messenger.g0.f22557m;
                int R = ne0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        q5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (re0Var.f28654t0 * 2)), 1073741824), i10);
                        M = q5Var.getMeasuredHeight();
                    } else {
                        M = ((ne0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (le0Var.getPaddingTop() != L2) {
                    this.f12729b = true;
                    le0Var.setPinnedSectionOffsetY(-L2);
                    le0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f22558n);
                    this.f12729b = false;
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
        switch (this.f12728a) {
            case 1:
                if (!((re0) this.d).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f12728a) {
            case 1:
                if (!this.f12729b) {
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
        switch (this.f12728a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f12729b) {
                    ((org.telegram.ui.Components.l9) this.f12730c).setImageDrawable(new ah0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f12729b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public r3(re0 re0Var, Context context) {
        super(context);
        this.d = re0Var;
        this.f12729b = false;
        this.f12730c = new RectF();
    }

    public r3(le0 le0Var, Activity activity, boolean z9) {
        super(activity);
        this.d = le0Var;
        this.f12729b = z9;
        this.f12730c = new Paint(1);
    }

    public r3(LimitPreviewView limitPreviewView, Context context, boolean z9) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f12730c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f12729b = z9;
    }

    public r3(k01 k01Var, Context context, boolean z9) {
        super(context);
        this.d = k01Var;
        this.f12729b = z9;
    }

    public r3(yw ywVar, Activity activity, boolean z9) {
        super(activity);
        this.d = ywVar;
        this.f12729b = z9;
        this.f12730c = new Paint(1);
    }
}
