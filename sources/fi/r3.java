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
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.l01;
import org.telegram.ui.me0;
import org.telegram.ui.zw;
public final class r3 extends FrameLayout {
    public static final int f12731e = 0;
    public final int f12732a = 0;
    public boolean f12733b;
    public Object f12734c;
    public final Object d;

    public r3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f12734c = k9Var;
        f10.addView(k9Var, c8.ha.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(id.M0(2131748822, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(id.M0(2131748821, null), false, true);
        f10.addView(dVar, c8.ha.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f22566p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.l1(2));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f12732a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f12734c;
                if (this.f12733b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((zw) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f12734c;
                if (this.f12733b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((me0) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                l01 l01Var = (l01) obj;
                if (!this.f12733b && l01Var.f47479r > 0.0f) {
                    if (((Paint) this.f12734c) == null) {
                        Paint paint3 = new Paint();
                        this.f12734c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f12734c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f12734c).setAlpha((int) (l01Var.f47479r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f12734c);
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
        switch (this.f12732a) {
            case 5:
                boolean z10 = this.f12733b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f31465a;
                    boolean z11 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (f10 == 1.0f && !z10) {
                        z11 = true;
                    }
                    if ((z9 || z11) && limitPreviewView.f31473e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f12734c, 31);
                        ug.s sVar = limitPreviewView.f31473e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f50852b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f12732a) {
            case 1:
                RectF rectF = (RectF) this.f12734c;
                int L = org.telegram.messenger.g0.L(13.0f);
                qe0 qe0Var = (qe0) this.d;
                Drawable drawable = qe0Var.n1;
                int i10 = (qe0Var.f37287y1 - qe0Var.f28704s0) - L;
                if (qe0Var.A0 == 1) {
                    i10 = (int) (qe0Var.l1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = qe0Var.f28704s0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - i10) - qe0Var.f28704s0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f22561m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
                    rectF.set(qe0Var.f28705t0, qe0Var.f28704s0 + i7, getMeasuredWidth() - qe0Var.f28705t0, org.telegram.messenger.g0.L(24.0f) + qe0Var.f28704s0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f28181t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.m6.f28181t0.setColor(x02);
                    org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
                }
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false);
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(Color.argb((int) (qe0Var.f37278p1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(qe0Var.f28705t0, 0.0f, getMeasuredWidth() - qe0Var.f28705t0, org.telegram.messenger.g0.f22561m, org.telegram.ui.ActionBar.m6.f28181t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f12732a) {
            case 1:
                qe0 qe0Var = (qe0) this.d;
                if (motionEvent.getAction() == 0 && qe0Var.f37287y1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + qe0Var.f37287y1 && qe0Var.f37278p1.getAlpha() == 0.0f) {
                        qe0Var.dismiss();
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
        switch (this.f12732a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                qe0.I0((qe0) this.d);
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
        switch (this.f12732a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                qe0 qe0Var = (qe0) this.d;
                org.telegram.ui.Components.p5 p5Var = qe0Var.f37286x1;
                org.telegram.ui.Components.me0 me0Var = qe0Var.f37276m1;
                ke0 ke0Var = qe0Var.l1;
                if (!qe0Var.V) {
                    this.f12733b = true;
                    int i12 = qe0Var.f28705t0;
                    setPadding(i12, org.telegram.messenger.g0.f22561m, i12, 0);
                    this.f12733b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ke0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) qe0Var.f37277o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + qe0Var.f28704s0 + org.telegram.messenger.g0.f22561m;
                int R = me0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        p5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (qe0Var.f28705t0 * 2)), 1073741824), i10);
                        M = p5Var.getMeasuredHeight();
                    } else {
                        M = ((me0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (ke0Var.getPaddingTop() != L2) {
                    this.f12733b = true;
                    ke0Var.setPinnedSectionOffsetY(-L2);
                    ke0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f22562n);
                    this.f12733b = false;
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
        switch (this.f12732a) {
            case 1:
                if (!((qe0) this.d).I && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f12732a) {
            case 1:
                if (!this.f12733b) {
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
        switch (this.f12732a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f12733b) {
                    ((org.telegram.ui.Components.k9) this.f12734c).setImageDrawable(new zg0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f12733b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public r3(qe0 qe0Var, Context context) {
        super(context);
        this.d = qe0Var;
        this.f12733b = false;
        this.f12734c = new RectF();
    }

    public r3(me0 me0Var, Activity activity, boolean z9) {
        super(activity);
        this.d = me0Var;
        this.f12733b = z9;
        this.f12734c = new Paint(1);
    }

    public r3(LimitPreviewView limitPreviewView, Context context, boolean z9) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f12734c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f12733b = z9;
    }

    public r3(l01 l01Var, Context context, boolean z9) {
        super(context);
        this.d = l01Var;
        this.f12733b = z9;
    }

    public r3(zw zwVar, Activity activity, boolean z9) {
        super(activity);
        this.d = zwVar;
        this.f12733b = z9;
        this.f12734c = new Paint(1);
    }
}
