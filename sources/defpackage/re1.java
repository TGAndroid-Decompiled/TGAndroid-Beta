package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class re1 extends FrameLayout implements snb {
    public final mm E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final mm J;
    public boolean a;
    public final vnb b;
    public final ema c;
    public final ImageView d;
    public final di2 e;
    public final in f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public re1(Context context, vnb vnbVar) {
        super(context);
        this.a = false;
        this.E = new mm(300L, this, k43.f);
        this.J = new mm(400L, this, k43.h);
        this.b = vnbVar;
        yob.h(aob.d6, vnbVar, this);
        ema emaVar = new ema(getContext());
        this.c = emaVar;
        emaVar.setTextSize(16);
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setEllipsizeByGradient(true);
        addView(emaVar, tre.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        di2 di2Var = new di2(hl.L(7.0f), hl.L(1.35f), aob.v0(aob.n6, vnbVar));
        this.e = di2Var;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(di2Var);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        di2Var.setBounds(0, 0, hl.L(14.0f), hl.L(14.0f));
        addView(imageView, tre.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        in inVar = new in(getContext(), false, true, true);
        this.f = inVar;
        inVar.setTextColor(aob.v0(aob.z6, vnbVar));
        inVar.b(0.4f, 120L, k43.g);
        inVar.setTextSize(hl.L(13.0f));
        addView(inVar, tre.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232210).mutate(), context.getDrawable(2131232211).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ve1.I.setColor(aob.v0(aob.Fi, vnbVar));
        ve1.J.setColor(aob.v0(aob.V8, vnbVar));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z, boolean z2, long j) {
        boolean z3;
        int i;
        boolean z4;
        int i2;
        this.w = tL_username;
        this.x = z;
        this.y = j;
        invalidate();
        if (this.w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        if (j == 0 && tL_username.editable) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.I = z3;
        b(tL_username.username);
        boolean z5 = this.a;
        boolean z6 = this.I;
        in inVar = this.f;
        if (z5) {
            if (z6) {
                i2 = 2131743301;
            } else if (this.H) {
                i2 = 2131743302;
            } else {
                i2 = 2131743300;
            }
            inVar.c(ob6.M0(i2, null), z2, !this.H);
        } else {
            if (z6) {
                i = 2131743305;
            } else if (this.H) {
                i = 2131743306;
            } else {
                i = 2131743304;
            }
            inVar.c(ob6.M0(i, null), z2, !this.H);
        }
        if (!this.H && !this.I) {
            z4 = false;
        } else {
            z4 = true;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        float f = 0.0f;
        if (z2) {
            float f2 = this.F;
            if (z4) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new qe1(this, (byte) 1));
            this.G.setDuration(120L);
            this.G.setInterpolator(k43.g);
            this.G.start();
            return;
        }
        if (z4) {
            f = 1.0f;
        }
        this.F = f;
        int i3 = aob.z6;
        vnb vnbVar = this.b;
        int f3 = vm2.f(this.F, aob.v0(i3, vnbVar), aob.v0(aob.n6, vnbVar));
        this.e.b(f3);
        inVar.setTextColor(f3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ema emaVar = this.c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(ob6.M0(2131743303, null));
            spannableString.setSpan(new ho4(aob.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            emaVar.l(spannableStringBuilder, false);
            return;
        }
        emaVar.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        super.onDraw(canvas);
        if (this.H) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.J.e(false, f);
        int i = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i < 0) {
            f3 = 0.0f;
            canvas.drawCircle(hl.L(35.0f), hl.L(29.0f), hl.L(16.0f), ve1.J);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f2 = 255.0f;
            drawableArr[1].setBounds(bp1.A(2, hl.L(35.0f), drawableArr[1]), bp1.y(2, hl.L(29.0f), drawableArr[1]), bp1.w(2, hl.L(35.0f), drawableArr[1]), bp1.i(2, hl.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f2 = 255.0f;
            f3 = 0.0f;
        }
        if (e > f3) {
            Paint paint = ve1.I;
            int i2 = (int) (e * f2);
            paint.setAlpha(i2);
            canvas.drawCircle(hl.L(35.0f), hl.L(29.0f), hl.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i2);
            drawableArr[0].setBounds(bp1.A(2, hl.L(35.0f), drawableArr[0]), bp1.y(2, hl.L(29.0f), drawableArr[0]), bp1.w(2, hl.L(35.0f), drawableArr[0]), bp1.i(2, hl.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.x) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        float e2 = this.E.e(false, f4);
        if (e2 > f3) {
            int alpha = aob.j0.getAlpha();
            aob.j0.setAlpha((int) (alpha * e2));
            canvas.drawRect(hl.L(70.0f), getHeight() - 1, getWidth(), getHeight(), aob.j0);
            aob.j0.setAlpha(alpha);
        }
        Paint paint2 = ve1.K;
        paint2.setColor(aob.w0(null, aob.Li, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = hl.P;
        rectF.set(getWidth() - hl.L(37.0f), hl.L(25.0f), getWidth() - hl.L(21.0f), hl.L(27.0f));
        canvas.drawRoundRect(rectF, hl.L(0.3f), hl.L(0.3f), paint2);
        rectF.set(getWidth() - hl.L(37.0f), hl.L(31.0f), getWidth() - hl.L(21.0f), hl.L(33.0f));
        canvas.drawRoundRect(rectF, hl.L(0.3f), hl.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }

    public void setLoading(boolean z) {
        float f;
        if (this.r != z) {
            this.r = z;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f2 = this.n;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new qe1(this, (byte) 0));
            this.s.addListener(new z7((byte) 12, this, z));
            this.s.setInterpolator(k43.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override
    public final void updateColors() {
        di2 di2Var;
        in inVar;
        vnb vnbVar = this.b;
        try {
            ve1.I.setColor(aob.v0(aob.Fi, vnbVar));
            ve1.J.setColor(aob.v0(aob.V8, vnbVar));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (di2Var = this.e) != null && (inVar = this.f) != null) {
                int f = vm2.f(this.F, aob.v0(aob.z6, vnbVar), aob.v0(aob.n6, vnbVar));
                di2Var.b(f);
                inVar.setTextColor(f);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
