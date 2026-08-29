package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bg.x2;
import bg.z2;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
public class d1 extends FrameLayout implements b90 {
    public boolean A;
    public boolean B;
    public qq C;
    public boolean D;
    public boolean E;
    public final d6 F;
    public final d6 G;
    public np H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public final Paint f3089a;
    public float f3090b;
    public boolean f3091c;
    public final b1 d;
    public final b1 f3092e;
    public final int f3093f;
    public boolean h;
    public float f3094n;
    public final x2 f3095r;
    public ValueAnimator f3096s;
    public final Path v;
    public final org.telegram.ui.Components.voip.h f3097w;
    public boolean f3098x;
    public final aj0 f3099y;

    public d1(Context context, c6 c6Var, boolean z10) {
        this(AndroidUtilities.dp(8.0f), context, c6Var, z10);
    }

    public final void a(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.A && z10) {
            z10 = true;
        }
        this.A = true;
        b1 b1Var = this.d;
        if (z10 && b1Var.f31265c.f()) {
            b1Var.a();
        }
        b1Var.c(str, z10, true);
        x2 x2Var = this.f3095r;
        x2Var.setContentDescription(str);
        if (!this.E) {
            x2Var.setOnClickListener(onClickListener);
        }
    }

    @Override
    public final boolean b() {
        return this.J;
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.h = true;
        this.f3098x = z10;
        b1 b1Var = this.f3092e;
        b1Var.c(charSequence, z11, true);
        b1Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f3096s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f3096s.cancel();
        }
        float f9 = 0.0f;
        if (!z10) {
            if (this.h) {
                f9 = 1.0f;
            }
            this.f3094n = f9;
            e();
            return;
        }
        float f10 = this.f3094n;
        if (this.h) {
            f9 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f3096s = ofFloat;
        ofFloat.addUpdateListener(new c1(this, 0));
        this.f3096s.addListener(new ag.m0(this, 3));
        this.f3096s.setDuration(250L);
        this.f3096s.setInterpolator(jr.f29800f);
        this.f3096s.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp;
        qq qqVar = this.C;
        b1 b1Var = this.f3092e;
        if (qqVar != null) {
            pq pqVar = qqVar.f32029a;
            if (pqVar.h == 0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(pqVar.C - 0.5f) + pqVar.f31747s;
            }
            d6 d6Var = this.F;
            d6Var.d(((dp * 0.85f) + AndroidUtilities.dp(3.0f)) / 2.0f, false);
            float e10 = (b1Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(3.0f);
            d6 d6Var2 = this.G;
            d6Var2.d(e10, false);
            b1Var.setTranslationX(-d6Var.f27666c);
            this.C.setTranslationX(d6Var2.f27666c - d6Var.f27666c);
        } else if (b1Var != null) {
            b1Var.setTranslationX(0.0f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float f9 = this.f3094n;
        Paint paint = this.f3089a;
        int i10 = this.f3093f;
        if (f9 != 1.0f || !this.f3098x) {
            if (this.f3091c) {
                float f10 = this.f3090b + 0.016f;
                this.f3090b = f10;
                if (f10 > 3.0f) {
                    this.f3091c = false;
                }
            } else {
                float f11 = this.f3090b - 0.016f;
                this.f3090b = f11;
                if (f11 < 1.0f) {
                    this.f3091c = true;
                }
            }
            if (this.D) {
                s1.d().f((-getMeasuredWidth()) * 0.1f * this.f3090b, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f12 = i10;
                canvas.drawRoundRect(rectF, f12, f12, s1.d().e());
            } else {
                paint.setAlpha(255);
                float f13 = i10;
                canvas.drawRoundRect(rectF, f13, f13, paint);
            }
            invalidate();
        }
        if (!BuildVars.IS_BILLING_UNAVAILABLE && !this.B) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.h hVar = this.f3097w;
            hVar.f33720f = measuredWidth;
            hVar.a(i10, canvas, rectF, null);
        }
        float f14 = this.f3094n;
        if (f14 != 0.0f && this.f3098x) {
            paint.setAlpha((int) (f14 * 255.0f));
            if (this.f3094n != 1.0f) {
                Path path = this.v;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f3094n, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f15 = i10;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            } else {
                float f16 = i10;
                canvas.drawRoundRect(rectF, f16, f16, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f9 = this.f3094n;
        b1 b1Var = this.f3092e;
        b1Var.setAlpha(f9);
        b1Var.setTranslationY((1.0f - this.f3094n) * AndroidUtilities.dp(12.0f));
        x2 x2Var = this.f3095r;
        x2Var.setAlpha(1.0f - this.f3094n);
        x2Var.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.f3094n);
        int i11 = 0;
        if (this.f3094n == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        x2Var.setVisibility(i10);
        if (this.f3094n == 0.0f) {
            i11 = 4;
        }
        b1Var.setVisibility(i11);
        invalidate();
    }

    public aj0 getIconView() {
        return this.f3099y;
    }

    public o6 getTextView() {
        return this.d;
    }

    @Override
    public final boolean isEnabled() {
        return this.f3095r.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f3095r.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.B = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.f3099y;
        aj0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.h hVar = this.f3097w;
        hVar.f33721g = 2.0f;
        hVar.f33729p = new a4.g(this, 27);
        invalidate();
        aj0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f9;
        if (this.J != z10) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K = null;
            }
            float f10 = this.I;
            this.J = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new bg.q1(this, 7));
            this.K.addListener(new z2(2, this, z10));
            this.K.setDuration(320L);
            this.K.setInterpolator(jr.h);
            this.K.start();
        }
    }

    public d1(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f3089a = paint;
        this.v = new Path();
        this.D = true;
        this.F = new d6(this);
        this.G = new d6(this);
        this.I = 0.0f;
        this.f3093f = i10;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3097w = hVar;
        hVar.f33727n = 1.2f;
        hVar.f33724k = false;
        hVar.f33726m = 4.0f;
        LinearLayout g10 = x3.g(context, 0);
        b1 b1Var = new b1(this, context, 0);
        this.d = b1Var;
        b1Var.b(0.35f, 350L, jr.h);
        b1Var.setGravity(17);
        b1Var.setTextColor(-1);
        b1Var.setTextSize(AndroidUtilities.dp(14.0f));
        b1Var.setTypeface(AndroidUtilities.bold());
        ?? imageView = new ImageView(context);
        this.f3099y = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        x2 x2Var = new x2(this, context, 3);
        this.f3095r = x2Var;
        x2Var.addView(g10, f6.e(-2, -2, 17));
        int k9 = i0.a.k(-1, 120);
        x2Var.setBackground(g6.i0(i10, i10, i10, i10, 0, k9, k9));
        g10.addView(b1Var, f6.q(-2, -2, 16));
        g10.addView((View) imageView, f6.p(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(x2Var);
        setOutlineProvider(jf.q0.f11669b);
        setClipToOutline(true);
        h6.b(this, 0.02f, 1.2f);
        if (z10) {
            b1 b1Var2 = new b1(this, context, 1);
            this.f3092e = b1Var2;
            b1Var2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            b1Var2.setGravity(17);
            b1Var2.setTextColor(g6.v0(g6.Sh, c6Var));
            b1Var2.setTextSize(AndroidUtilities.dp(14.0f));
            b1Var2.setTypeface(AndroidUtilities.bold());
            b1Var2.getDrawable().D = true;
            int dp = AndroidUtilities.dp(8.0f);
            int k10 = i0.a.k(-1, 120);
            b1Var2.setBackground(g6.i0(dp, dp, dp, dp, 0, k10, k10));
            addView(b1Var2);
            paint.setColor(g6.v0(g6.Oh, c6Var));
            e();
        }
    }
}
