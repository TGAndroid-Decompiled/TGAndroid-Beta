package gi;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.se0;
import org.telegram.ui.ee0;
import org.telegram.ui.uw;
import org.telegram.ui.yz0;
public final class q3 extends FrameLayout {
    public static final int f13421e = 0;
    public final int f13422a = 0;
    public boolean f13423b;
    public Object f13424c;
    public final Object d;

    public q3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, mf.e(-2, -2, 17));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f13424c = k9Var;
        f10.addView(k9Var, mf.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131748830, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, mf.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(bd.M0(2131748829, null), false, true);
        f10.addView(dVar, mf.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f22607p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new ai.t(6));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i3 = this.f13422a;
        Object obj = this.d;
        switch (i3) {
            case 2:
                Paint paint = (Paint) this.f13424c;
                if (this.f13423b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((uw) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f13424c;
                if (this.f13423b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((ee0) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                yz0 yz0Var = (yz0) obj;
                if (!this.f13423b && yz0Var.f52471r > 0.0f) {
                    if (((Paint) this.f13424c) == null) {
                        Paint paint3 = new Paint();
                        this.f13424c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f13424c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f13424c).setAlpha((int) (yz0Var.f52471r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f13424c);
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
        switch (this.f13422a) {
            case 5:
                boolean z11 = this.f13423b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f10 = limitPreviewView.f31520a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f31530f0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f13424c, 31);
                        vg.s sVar = limitPreviewView.f31530f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.x0) sVar).f51672b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        float f10;
        int i3;
        switch (this.f13422a) {
            case 1:
                RectF rectF = (RectF) this.f13424c;
                int L = org.telegram.messenger.g0.L(13.0f);
                se0 se0Var = (se0) this.d;
                Drawable drawable = se0Var.f37990l1;
                int i10 = (se0Var.f38000w1 - se0Var.f28617t0) - L;
                if (se0Var.B0 == 1) {
                    i10 = (int) (se0Var.f37989j1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = se0Var.f28617t0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - se0Var.f28617t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f22602m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
                    rectF.set(se0Var.f28618u0, se0Var.f28617t0 + i3, getMeasuredWidth() - se0Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + se0Var.f28617t0 + i3);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.k6.f28171t0.setColor(x02);
                    org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
                }
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false);
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(Color.argb((int) (se0Var.f37991n1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(se0Var.f28618u0, 0.0f, getMeasuredWidth() - se0Var.f28618u0, org.telegram.messenger.g0.f22602m, org.telegram.ui.ActionBar.k6.f28171t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f13422a) {
            case 1:
                se0 se0Var = (se0) this.d;
                if (motionEvent.getAction() == 0 && se0Var.f38000w1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + se0Var.f38000w1 && se0Var.f37991n1.getAlpha() == 0.0f) {
                        se0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f13422a) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                se0.I0((se0) this.d);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        int M;
        switch (this.f13422a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                se0 se0Var = (se0) this.d;
                org.telegram.ui.Components.o5 o5Var = se0Var.f37999v1;
                oe0 oe0Var = se0Var.k1;
                me0 me0Var = se0Var.f37989j1;
                if (!se0Var.W) {
                    this.f13423b = true;
                    int i12 = se0Var.f28618u0;
                    setPadding(i12, org.telegram.messenger.g0.f22602m, i12, 0);
                    this.f13423b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) me0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) se0Var.m1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + se0Var.f28617t0 + org.telegram.messenger.g0.f22602m;
                int R = oe0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        o5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3 - (se0Var.f28618u0 * 2)), 1073741824), i10);
                        M = o5Var.getMeasuredHeight();
                    } else {
                        M = ((oe0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (me0Var.getPaddingTop() != L2) {
                    this.f13423b = true;
                    me0Var.setPinnedSectionOffsetY(-L2);
                    me0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f22603n);
                    this.f13423b = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f13422a) {
            case 1:
                if (!((se0) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f13422a) {
            case 1:
                if (!this.f13423b) {
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
    public void setVisibility(int i3) {
        switch (this.f13422a) {
            case 0:
                super.setVisibility(i3);
                if (i3 == 0 && !this.f13423b) {
                    ((org.telegram.ui.Components.k9) this.f13424c).setImageDrawable(new ch0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f13423b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public q3(se0 se0Var, Context context) {
        super(context);
        this.d = se0Var;
        this.f13423b = false;
        this.f13424c = new RectF();
    }

    public q3(ee0 ee0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ee0Var;
        this.f13423b = z10;
        this.f13424c = new Paint(1);
    }

    public q3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f13424c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f13423b = z10;
    }

    public q3(yz0 yz0Var, Context context, boolean z10) {
        super(context);
        this.d = yz0Var;
        this.f13423b = z10;
    }

    public q3(uw uwVar, Activity activity, boolean z10) {
        super(activity);
        this.d = uwVar;
        this.f13423b = z10;
        this.f13424c = new Paint(1);
    }
}
