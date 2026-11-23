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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.cx;
import org.telegram.ui.k01;
import org.telegram.ui.me0;
public final class p3 extends FrameLayout {
    public static final int f15252e = 0;
    public final int f15253a = 0;
    public boolean f15254b;
    public Object f15255c;
    public final Object d;

    public p3(Context context) {
        super(context);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        addView(g10, c8.ma.e(-2, -2, 17));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f15255c = q9Var;
        g10.addView(q9Var, c8.ma.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131748629, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(textView, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        e eVar = new e(context, null, true);
        this.d = eVar;
        eVar.i(hd.N0(2131748628, null), false, true);
        g10.addView(eVar, c8.ma.t((int) ((eVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f24045p), 38, 1, 0, 18, 0, 0));
        eVar.setOnClickListener(new bi.o(7));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f15253a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f15255c;
                if (this.f15254b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((cx) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f15255c;
                if (this.f15254b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((me0) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                k01 k01Var = (k01) obj;
                if (!this.f15254b && k01Var.f49166r > 0.0f) {
                    if (((Paint) this.f15255c) == null) {
                        Paint paint3 = new Paint();
                        this.f15255c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f15255c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f15255c).setAlpha((int) (k01Var.f49166r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f15255c);
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
        switch (this.f15253a) {
            case 5:
                boolean z11 = this.f15254b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f33060a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f33070f0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f15255c, 31);
                        ug.s sVar = limitPreviewView.f33070f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f52929b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f15253a) {
            case 1:
                RectF rectF = (RectF) this.f15255c;
                int L = org.telegram.messenger.g0.L(13.0f);
                ff0 ff0Var = (ff0) this.d;
                Drawable drawable = ff0Var.f35219o1;
                int i10 = (ff0Var.f35230z1 - ff0Var.f30210t0) - L;
                if (ff0Var.B0 == 1) {
                    i10 = (int) (ff0Var.f35218m1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = ff0Var.f30210t0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - ff0Var.f30210t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f24040m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
                    rectF.set(ff0Var.f30211u0, ff0Var.f30210t0 + i7, getMeasuredWidth() - ff0Var.f30211u0, org.telegram.messenger.g0.L(24.0f) + ff0Var.f30210t0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.f29672t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.m6.f29672t0.setColor(x02);
                    org.telegram.ui.ActionBar.m6.f29672t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29672t0);
                }
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false);
                org.telegram.ui.ActionBar.m6.f29672t0.setColor(Color.argb((int) (ff0Var.f35221q1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(ff0Var.f30211u0, 0.0f, getMeasuredWidth() - ff0Var.f30211u0, org.telegram.messenger.g0.f24040m, org.telegram.ui.ActionBar.m6.f29672t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f15253a) {
            case 1:
                ff0 ff0Var = (ff0) this.d;
                if (motionEvent.getAction() == 0 && ff0Var.f35230z1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + ff0Var.f35230z1 && ff0Var.f35221q1.getAlpha() == 0.0f) {
                        ff0Var.dismiss();
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
        switch (this.f15253a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                ff0.J0((ff0) this.d);
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
        switch (this.f15253a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                ff0 ff0Var = (ff0) this.d;
                org.telegram.ui.Components.x5 x5Var = ff0Var.f35229y1;
                bf0 bf0Var = ff0Var.n1;
                ze0 ze0Var = ff0Var.f35218m1;
                if (!ff0Var.W) {
                    this.f15254b = true;
                    int i12 = ff0Var.f30211u0;
                    setPadding(i12, org.telegram.messenger.g0.f24040m, i12, 0);
                    this.f15254b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ze0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ff0Var.f35220p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + ff0Var.f30210t0 + org.telegram.messenger.g0.f24040m;
                int R = bf0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        x5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (ff0Var.f30211u0 * 2)), 1073741824), i10);
                        M = x5Var.getMeasuredHeight();
                    } else {
                        M = ((bf0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (ze0Var.getPaddingTop() != L2) {
                    this.f15254b = true;
                    ze0Var.setPinnedSectionOffsetY(-L2);
                    ze0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f24041n);
                    this.f15254b = false;
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
        switch (this.f15253a) {
            case 1:
                if (!((ff0) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f15253a) {
            case 1:
                if (!this.f15254b) {
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
        switch (this.f15253a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f15254b) {
                    ((org.telegram.ui.Components.q9) this.f15255c).setImageDrawable(new oh0(2131624321, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f15254b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public p3(ff0 ff0Var, Context context) {
        super(context);
        this.d = ff0Var;
        this.f15254b = false;
        this.f15255c = new RectF();
    }

    public p3(me0 me0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = me0Var;
        this.f15254b = z10;
        this.f15255c = new Paint(1);
    }

    public p3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f15255c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f15254b = z10;
    }

    public p3(k01 k01Var, Context context, boolean z10) {
        super(context);
        this.d = k01Var;
        this.f15254b = z10;
    }

    public p3(cx cxVar, Activity activity, boolean z10) {
        super(activity);
        this.d = cxVar;
        this.f15254b = z10;
        this.f15255c = new Paint(1);
    }
}
