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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.f01;
import org.telegram.ui.je0;
import org.telegram.ui.yw;
public final class q3 extends FrameLayout {
    public static final int f14896e = 0;
    public final int f14897a = 0;
    public boolean f14898b;
    public Object f14899c;
    public final Object d;

    public q3(Context context) {
        super(context);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, c8.ja.e(-2, -2, 17));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f14899c = i9Var;
        f10.addView(i9Var, c8.ja.r(130, 130, 1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131748822, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(textView, c8.ja.t(-2, -2, 1, 0, 8, 0, 0));
        d dVar = new d(context, null, true);
        this.d = dVar;
        dVar.i(hd.M0(2131748821, null), false, true);
        f10.addView(dVar, c8.ja.t((int) ((dVar.d.e() + org.telegram.messenger.g0.L(24.0f)) / org.telegram.messenger.g0.f23608p), 38, 1, 0, 18, 0, 0));
        dVar.setOnClickListener(new bi.o(5));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -11184811}));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f14897a;
        Object obj = this.d;
        switch (i7) {
            case 2:
                Paint paint = (Paint) this.f14899c;
                if (this.f14898b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint.setColor(((yw) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f14899c;
                if (this.f14898b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                    paint2.setColor(((je0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                f01 f01Var = (f01) obj;
                if (!this.f14898b && f01Var.f46959r > 0.0f) {
                    if (((Paint) this.f14899c) == null) {
                        Paint paint3 = new Paint();
                        this.f14899c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f14899c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f14899c).setAlpha((int) (f01Var.f46959r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f14899c);
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
        switch (this.f14897a) {
            case 5:
                boolean z11 = this.f14898b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f10 = limitPreviewView.f32627a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f32637f0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f14899c, 31);
                        ug.s sVar = limitPreviewView.f32637f0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.t5) ((org.telegram.ui.w0) sVar).f52340b).v0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f14897a) {
            case 1:
                RectF rectF = (RectF) this.f14899c;
                int L = org.telegram.messenger.g0.L(13.0f);
                te0 te0Var = (te0) this.d;
                Drawable drawable = te0Var.f39681o1;
                int i10 = (te0Var.f39692z1 - te0Var.f29716t0) - L;
                if (te0Var.B0 == 1) {
                    i10 = (int) (te0Var.f39680m1.getTranslationY() + i10);
                }
                int L2 = org.telegram.messenger.g0.L(20.0f) + i10;
                int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
                int i11 = te0Var.f29716t0;
                int i12 = L3 + i11;
                if (i11 + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i10) - te0Var.f29716t0) / L4);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * min);
                    i10 -= currentActionBarHeight;
                    L2 -= currentActionBarHeight;
                    i12 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i13 = org.telegram.messenger.g0.f23603m;
                int i14 = L2 + i13;
                drawable.setBounds(0, i10 + i13, getMeasuredWidth(), i12);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                    rectF.set(te0Var.f29717u0, te0Var.f29716t0 + i7, getMeasuredWidth() - te0Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + te0Var.f29716t0 + i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.f29140t0);
                }
                if (f10 != 0.0f) {
                    int L5 = org.telegram.messenger.g0.L(36.0f);
                    rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(4.0f) + i14);
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.zj, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.j6.f29140t0.setColor(x02);
                    org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
                }
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false);
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(Color.argb((int) (te0Var.f39683q1.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(te0Var.f29717u0, 0.0f, getMeasuredWidth() - te0Var.f29717u0, org.telegram.messenger.g0.f23603m, org.telegram.ui.ActionBar.j6.f29140t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f14897a) {
            case 1:
                te0 te0Var = (te0) this.d;
                if (motionEvent.getAction() == 0 && te0Var.f39692z1 != 0) {
                    if (motionEvent.getY() < org.telegram.messenger.g0.L(12.0f) + te0Var.f39692z1 && te0Var.f39683q1.getAlpha() == 0.0f) {
                        te0Var.dismiss();
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
        switch (this.f14897a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                te0.I0((te0) this.d);
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
        switch (this.f14897a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                te0 te0Var = (te0) this.d;
                org.telegram.ui.Components.o5 o5Var = te0Var.f39691y1;
                pe0 pe0Var = te0Var.n1;
                ne0 ne0Var = te0Var.f39680m1;
                if (!te0Var.W) {
                    this.f14898b = true;
                    int i12 = te0Var.f29717u0;
                    setPadding(i12, org.telegram.messenger.g0.f23603m, i12, 0);
                    this.f14898b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ne0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) te0Var.f39682p1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L = org.telegram.messenger.g0.L(15.0f) + te0Var.f29716t0 + org.telegram.messenger.g0.f23603m;
                int R = pe0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        o5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7 - (te0Var.f29717u0 * 2)), 1073741824), i10);
                        M = o5Var.getMeasuredHeight();
                    } else {
                        M = ((pe0Var.M(i13) - 1) * org.telegram.messenger.g0.L(50.0f)) + org.telegram.messenger.g0.L(32.0f);
                    }
                    L = M + L;
                }
                if (L < paddingTop) {
                    i11 = paddingTop - L;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int L2 = org.telegram.messenger.g0.L(8.0f) + i11;
                if (ne0Var.getPaddingTop() != L2) {
                    this.f14898b = true;
                    ne0Var.setPinnedSectionOffsetY(-L2);
                    ne0Var.setPadding(0, L2, 0, org.telegram.messenger.g0.f23604n);
                    this.f14898b = false;
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
        switch (this.f14897a) {
            case 1:
                if (!((te0) this.d).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f14897a) {
            case 1:
                if (!this.f14898b) {
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
        switch (this.f14897a) {
            case 0:
                super.setVisibility(i7);
                if (i7 == 0 && !this.f14898b) {
                    ((org.telegram.ui.Components.i9) this.f14899c).setImageDrawable(new ch0(2131624321, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
                    this.f14898b = true;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public q3(te0 te0Var, Context context) {
        super(context);
        this.d = te0Var;
        this.f14898b = false;
        this.f14899c = new RectF();
    }

    public q3(je0 je0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = je0Var;
        this.f14898b = z10;
        this.f14899c = new Paint(1);
    }

    public q3(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f14899c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f14898b = z10;
    }

    public q3(f01 f01Var, Context context, boolean z10) {
        super(context);
        this.d = f01Var;
        this.f14898b = z10;
    }

    public q3(yw ywVar, Activity activity, boolean z10) {
        super(activity);
        this.d = ywVar;
        this.f14898b = z10;
        this.f14899c = new Paint(1);
    }
}
