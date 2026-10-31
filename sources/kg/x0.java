package kg;

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
import org.telegram.messenger.m5;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t5;
import w7.b6;
import w7.e6;
public class x0 extends FrameLayout implements s80 {
    public final org.telegram.ui.Components.voip.g D;
    public boolean E;
    public final ei0 F;
    public boolean G;
    public boolean H;
    public lq I;
    public boolean J;
    public boolean K;
    public final t5 L;
    public final t5 M;
    public kp N;
    public float O;
    public boolean P;
    public ValueAnimator Q;
    public final Paint f11324a;
    public final boolean f11325b;
    public final p6 f11326c;
    public float d;
    public boolean e;
    public final w0 f11327f;
    public final w0 h;
    public final int f11328n;
    public boolean f11329r;
    public float f11330s;
    public final jg.l0 f11331w;
    public ValueAnimator f11332x;
    public final Path f11333y;

    public x0(Context context, p6 p6Var, boolean z10) {
        this(org.telegram.messenger.i0.L(8.0f), context, p6Var, z10);
    }

    @Override
    public final boolean a() {
        return this.P;
    }

    public final void b(String str, View.OnClickListener onClickListener, boolean z10) {
        if (!this.G && z10) {
            z10 = true;
        }
        this.G = true;
        w0 w0Var = this.f11327f;
        if (z10 && w0Var.f25984c.h()) {
            w0Var.a();
        }
        w0Var.c(str, z10, true);
        jg.l0 l0Var = this.f11331w;
        l0Var.setContentDescription(str);
        if (!this.K) {
            l0Var.setOnClickListener(onClickListener);
        }
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        this.f11329r = true;
        this.E = z10;
        w0 w0Var = this.h;
        w0Var.c(charSequence, z11, true);
        w0Var.setContentDescription(charSequence);
        d(z11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.f11332x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f11332x.cancel();
        }
        float f7 = 0.0f;
        if (!z10) {
            if (this.f11329r) {
                f7 = 1.0f;
            }
            this.f11330s = f7;
            e();
            return;
        }
        float f10 = this.f11330s;
        if (this.f11329r) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f11332x = ofFloat;
        ofFloat.addUpdateListener(new bg.o(this, 2));
        this.f11332x.addListener(new bg.e(this, 7));
        this.f11332x.setDuration(250L);
        this.f11332x.setInterpolator(gr.f26495f);
        this.f11332x.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L;
        lq lqVar = this.I;
        w0 w0Var = this.h;
        if (lqVar != null) {
            kq kqVar = lqVar.f28163a;
            if (kqVar.h == 0) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(kqVar.C - 0.5f) + kqVar.f27882s;
            }
            t5 t5Var = this.L;
            t5Var.e(false, ((L * 0.85f) + org.telegram.messenger.i0.L(3.0f)) / 2.0f);
            float e = (w0Var.getDrawable().e() / 2.0f) + (getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(3.0f);
            t5 t5Var2 = this.M;
            t5Var2.e(false, e);
            w0Var.setTranslationX(-t5Var.f30445c);
            this.I.setTranslationX(t5Var2.f30445c - t5Var.f30445c);
        } else if (w0Var != null) {
            w0Var.setTranslationX(0.0f);
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        int i10 = (this.f11330s > 1.0f ? 1 : (this.f11330s == 1.0f ? 0 : -1));
        p6 p6Var = this.f11326c;
        boolean z10 = this.f11325b;
        int i11 = this.f11328n;
        Paint paint = this.f11324a;
        if (i10 != 0 || !this.E) {
            if (this.e) {
                float f7 = this.d + 0.016f;
                this.d = f7;
                if (f7 > 3.0f) {
                    this.e = false;
                }
            } else {
                float f10 = this.d - 0.016f;
                this.d = f10;
                if (f10 < 1.0f) {
                    this.e = true;
                }
            }
            if (this.J) {
                ea.f.d().f((-getMeasuredWidth()) * 0.1f * this.d, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float f11 = i11;
                canvas.drawRoundRect(rectF, f11, f11, ea.f.d().e());
            } else {
                if (z10) {
                    paint.setColor(t6.w0(t6.Ci, p6Var));
                }
                paint.setAlpha(255);
                float f12 = i11;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            }
            invalidate();
        }
        boolean z11 = v2.f18448a;
        if (!this.H) {
            int measuredWidth = getMeasuredWidth();
            org.telegram.ui.Components.voip.g gVar = this.D;
            gVar.f31436f = measuredWidth;
            gVar.a(i11, canvas, rectF, null);
        }
        if (this.f11330s != 0.0f && this.E) {
            if (z10) {
                paint.setColor(t6.w0(t6.Ci, p6Var));
            }
            paint.setAlpha((int) (this.f11330s * 255.0f));
            if (this.f11330s != 1.0f) {
                Path path = this.f11333y;
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.f11330s, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float f13 = i11;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                canvas.restore();
            } else {
                float f14 = i11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i10;
        float f7 = this.f11330s;
        w0 w0Var = this.h;
        w0Var.setAlpha(f7);
        w0Var.setTranslationY((1.0f - this.f11330s) * org.telegram.messenger.i0.L(12.0f));
        jg.l0 l0Var = this.f11331w;
        l0Var.setAlpha(1.0f - this.f11330s);
        l0Var.setTranslationY((-org.telegram.messenger.i0.L(12.0f)) * this.f11330s);
        int i11 = 0;
        if (this.f11330s == 1.0f) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        l0Var.setVisibility(i10);
        if (this.f11330s == 0.0f) {
            i11 = 4;
        }
        w0Var.setVisibility(i11);
        invalidate();
    }

    public ei0 getIconView() {
        return this.F;
    }

    public f6 getTextView() {
        return this.f11327f;
    }

    @Override
    public final boolean isEnabled() {
        return this.f11331w.isEnabled();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f11331w.setEnabled(z10);
    }

    public void setFlickerDisabled(boolean z10) {
        this.H = z10;
        invalidate();
    }

    public void setIcon(int i10) {
        ei0 ei0Var = this.F;
        ei0Var.f(i10, 24, 24, null);
        org.telegram.ui.Components.voip.g gVar = this.D;
        gVar.f31437g = 2.0f;
        gVar.f31445p = new gg.c(this, 23);
        invalidate();
        ei0Var.setVisibility(0);
    }

    @Override
    public void setLoading(boolean z10) {
        float f7;
        if (this.P != z10) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            float f10 = this.O;
            this.P = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 10));
            this.Q.addListener(new eg.m(3, this, z10));
            this.Q.setDuration(320L);
            this.Q.setInterpolator(gr.h);
            this.Q.start();
        }
    }

    public x0(int i10, Context context, p6 p6Var, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.f11324a = paint;
        this.f11333y = new Path();
        this.J = true;
        this.L = new t5(this);
        this.M = new t5(this);
        this.O = 0.0f;
        this.f11328n = i10;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.D = gVar;
        gVar.f31443n = 1.2f;
        gVar.f31440k = false;
        gVar.f31442m = 4.0f;
        LinearLayout f7 = m5.f(context, 0);
        w0 w0Var = new w0(this, context, 0);
        this.f11327f = w0Var;
        w0Var.b(0.35f, 350L, gr.h);
        w0Var.setGravity(17);
        w0Var.setTextColor(-1);
        w0Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        w0Var.setTypeface(org.telegram.messenger.i0.o());
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setColorFilter(-1);
        imageView.setVisibility(8);
        jg.l0 l0Var = new jg.l0(this, context, 4);
        this.f11331w = l0Var;
        l0Var.addView(f7, b6.e(-2, -2, 17));
        int o10 = i0.b.o(-1, 120);
        l0Var.setBackground(t6.k0(i10, i10, i10, i10, 0, o10, o10));
        f7.addView(w0Var, b6.r(-2, -2, 16));
        f7.addView((View) imageView, b6.q(24, 24, 0.0f, 16, 4, 0, 0, 0));
        addView(l0Var);
        setOutlineProvider(rf.e0.f46527b);
        setClipToOutline(true);
        e6.b(this, 0.02f, 1.2f);
        if (z10) {
            w0 w0Var2 = new w0(this, context, 1);
            this.h = w0Var2;
            w0Var2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            w0Var2.setGravity(17);
            a7.Z(w0Var2, t6.Gi, p6Var);
            w0Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
            w0Var2.setTypeface(org.telegram.messenger.i0.o());
            w0Var2.getDrawable().J = true;
            int L = org.telegram.messenger.i0.L(8.0f);
            int o11 = i0.b.o(-1, 120);
            w0Var2.setBackground(t6.k0(L, L, L, L, 0, o11, o11));
            addView(w0Var2);
            paint.setColor(t6.w0(t6.Ci, p6Var));
            this.f11325b = true;
            this.f11326c = p6Var;
            e();
        }
    }
}
