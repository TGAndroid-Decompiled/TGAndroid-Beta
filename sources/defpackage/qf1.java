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
public abstract class qf1 extends FrameLayout implements vlb {
    public final ln E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final ln J;
    public boolean a;
    public final ylb b;
    public final lka c;
    public final ImageView d;
    public final wi2 e;
    public final io f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public qf1(Context context, ylb ylbVar) {
        super(context);
        this.a = false;
        this.E = new ln(300L, this, d53.f);
        this.J = new ln(400L, this, d53.h);
        this.b = ylbVar;
        anb.h(cmb.c6, ylbVar, this);
        lka lkaVar = new lka(getContext());
        this.c = lkaVar;
        lkaVar.setTextSize(16);
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setEllipsizeByGradient(true);
        addView(lkaVar, qoe.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        wi2 wi2Var = new wi2(gm.L(7.0f), gm.L(1.35f), cmb.v0(cmb.m6, ylbVar));
        this.e = wi2Var;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(wi2Var);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        wi2Var.setBounds(0, 0, gm.L(14.0f), gm.L(14.0f));
        addView(imageView, qoe.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        io ioVar = new io(getContext(), false, true, true);
        this.f = ioVar;
        ioVar.setTextColor(cmb.v0(cmb.y6, ylbVar));
        ioVar.b(0.4f, 120L, d53.g);
        ioVar.setTextSize(gm.L(13.0f));
        addView(ioVar, qoe.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232211).mutate(), context.getDrawable(2131232212).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        uf1.I.setColor(cmb.v0(cmb.Ei, ylbVar));
        uf1.J.setColor(cmb.v0(cmb.U8, ylbVar));
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
        io ioVar = this.f;
        if (z5) {
            if (z6) {
                i2 = 2131743333;
            } else if (this.H) {
                i2 = 2131743334;
            } else {
                i2 = 2131743332;
            }
            ioVar.c(jb6.M0(i2, null), z2, !this.H);
        } else {
            if (z6) {
                i = 2131743337;
            } else if (this.H) {
                i = 2131743338;
            } else {
                i = 2131743336;
            }
            ioVar.c(jb6.M0(i, null), z2, !this.H);
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
            ofFloat.addUpdateListener(new pf1(this, (byte) 1));
            this.G.setDuration(120L);
            this.G.setInterpolator(d53.g);
            this.G.start();
            return;
        }
        if (z4) {
            f = 1.0f;
        }
        this.F = f;
        int i3 = cmb.y6;
        ylb ylbVar = this.b;
        int f3 = on2.f(this.F, cmb.v0(i3, ylbVar), cmb.v0(cmb.m6, ylbVar));
        this.e.b(f3);
        ioVar.setTextColor(f3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.m6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        lka lkaVar = this.c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(jb6.M0(2131743335, null));
            spannableString.setSpan(new do4(cmb.G6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            lkaVar.l(spannableStringBuilder, false);
            return;
        }
        lkaVar.l("@" + str, false);
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
            canvas.drawCircle(gm.L(35.0f), gm.L(29.0f), gm.L(16.0f), uf1.J);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f2 = 255.0f;
            drawableArr[1].setBounds(aq1.A(2, gm.L(35.0f), drawableArr[1]), aq1.y(2, gm.L(29.0f), drawableArr[1]), aq1.w(2, gm.L(35.0f), drawableArr[1]), aq1.i(2, gm.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f2 = 255.0f;
            f3 = 0.0f;
        }
        if (e > f3) {
            Paint paint = uf1.I;
            int i2 = (int) (e * f2);
            paint.setAlpha(i2);
            canvas.drawCircle(gm.L(35.0f), gm.L(29.0f), gm.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i2);
            drawableArr[0].setBounds(aq1.A(2, gm.L(35.0f), drawableArr[0]), aq1.y(2, gm.L(29.0f), drawableArr[0]), aq1.w(2, gm.L(35.0f), drawableArr[0]), aq1.i(2, gm.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.x) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        float e2 = this.E.e(false, f4);
        if (e2 > f3) {
            int alpha = cmb.j0.getAlpha();
            cmb.j0.setAlpha((int) (alpha * e2));
            canvas.drawRect(gm.L(70.0f), getHeight() - 1, getWidth(), getHeight(), cmb.j0);
            cmb.j0.setAlpha(alpha);
        }
        Paint paint2 = uf1.K;
        paint2.setColor(cmb.w0(null, cmb.Ki, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = gm.P;
        rectF.set(getWidth() - gm.L(37.0f), gm.L(25.0f), getWidth() - gm.L(21.0f), gm.L(27.0f));
        canvas.drawRoundRect(rectF, gm.L(0.3f), gm.L(0.3f), paint2);
        rectF.set(getWidth() - gm.L(37.0f), gm.L(31.0f), getWidth() - gm.L(21.0f), gm.L(33.0f));
        canvas.drawRoundRect(rectF, gm.L(0.3f), gm.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), 1073741824));
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
            ofFloat.addUpdateListener(new pf1(this, (byte) 0));
            this.s.addListener(new y7((byte) 12, this, z));
            this.s.setInterpolator(d53.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override
    public final void updateColors() {
        wi2 wi2Var;
        io ioVar;
        ylb ylbVar = this.b;
        try {
            uf1.I.setColor(cmb.v0(cmb.Ei, ylbVar));
            uf1.J.setColor(cmb.v0(cmb.U8, ylbVar));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (wi2Var = this.e) != null && (ioVar = this.f) != null) {
                int f = on2.f(this.F, cmb.v0(cmb.y6, ylbVar), cmb.v0(cmb.m6, ylbVar));
                wi2Var.b(f);
                ioVar.setTextColor(f);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
