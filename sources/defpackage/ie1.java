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
public abstract class ie1 extends FrameLayout implements tjb {
    public final lm E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final lm J;
    public boolean a;
    public final wjb b;
    public final jia c;
    public final ImageView d;
    public final ih2 e;
    public final hn f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public ie1(Context context, wjb wjbVar) {
        super(context);
        this.a = false;
        this.E = new lm(300L, this, s33.f);
        this.J = new lm(400L, this, s33.h);
        this.b = wjbVar;
        zkb.h(bkb.c6, wjbVar, this);
        jia jiaVar = new jia(getContext());
        this.c = jiaVar;
        jiaVar.setTextSize(16);
        zkb.W(jiaVar, bkb.F6, wjbVar);
        jiaVar.setEllipsizeByGradient(true);
        addView(jiaVar, nme.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        ih2 ih2Var = new ih2(gl.L(7.0f), gl.L(1.35f), bkb.v0(bkb.m6, wjbVar));
        this.e = ih2Var;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(ih2Var);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        ih2Var.setBounds(0, 0, gl.L(14.0f), gl.L(14.0f));
        addView(imageView, nme.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        hn hnVar = new hn(getContext(), false, true, true);
        this.f = hnVar;
        hnVar.setTextColor(bkb.v0(bkb.y6, wjbVar));
        hnVar.b(0.4f, 120L, s33.g);
        hnVar.setTextSize(gl.L(13.0f));
        addView(hnVar, nme.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(2131232210).mutate(), context.getDrawable(2131232211).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        me1.I.setColor(bkb.v0(bkb.Ei, wjbVar));
        me1.J.setColor(bkb.v0(bkb.U8, wjbVar));
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
        hn hnVar = this.f;
        if (z5) {
            if (z6) {
                i2 = 2131743407;
            } else if (this.H) {
                i2 = 2131743408;
            } else {
                i2 = 2131743406;
            }
            hnVar.c(k96.M0(i2, null), z2, !this.H);
        } else {
            if (z6) {
                i = 2131743411;
            } else if (this.H) {
                i = 2131743412;
            } else {
                i = 2131743410;
            }
            hnVar.c(k96.M0(i, null), z2, !this.H);
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
            ofFloat.addUpdateListener(new he1(this, (byte) 1));
            this.G.setDuration(120L);
            this.G.setInterpolator(s33.g);
            this.G.start();
            return;
        }
        if (z4) {
            f = 1.0f;
        }
        this.F = f;
        int i3 = bkb.y6;
        wjb wjbVar = this.b;
        int f3 = bm2.f(this.F, bkb.v0(i3, wjbVar), bkb.v0(bkb.m6, wjbVar));
        this.e.b(f3);
        hnVar.setTextColor(f3);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.m6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        jia jiaVar = this.c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(k96.M0(2131743409, null));
            spannableString.setSpan(new cm4(bkb.G6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            jiaVar.l(spannableStringBuilder, false);
            return;
        }
        jiaVar.l("@" + str, false);
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
            canvas.drawCircle(gl.L(35.0f), gl.L(29.0f), gl.L(16.0f), me1.J);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f2 = 255.0f;
            drawableArr[1].setBounds(oo1.A(2, gl.L(35.0f), drawableArr[1]), oo1.y(2, gl.L(29.0f), drawableArr[1]), oo1.w(2, gl.L(35.0f), drawableArr[1]), oo1.i(2, gl.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f2 = 255.0f;
            f3 = 0.0f;
        }
        if (e > f3) {
            Paint paint = me1.I;
            int i2 = (int) (e * f2);
            paint.setAlpha(i2);
            canvas.drawCircle(gl.L(35.0f), gl.L(29.0f), gl.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i2);
            drawableArr[0].setBounds(oo1.A(2, gl.L(35.0f), drawableArr[0]), oo1.y(2, gl.L(29.0f), drawableArr[0]), oo1.w(2, gl.L(35.0f), drawableArr[0]), oo1.i(2, gl.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.x) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        float e2 = this.E.e(false, f4);
        if (e2 > f3) {
            int alpha = bkb.j0.getAlpha();
            bkb.j0.setAlpha((int) (alpha * e2));
            canvas.drawRect(gl.L(70.0f), getHeight() - 1, getWidth(), getHeight(), bkb.j0);
            bkb.j0.setAlpha(alpha);
        }
        Paint paint2 = me1.K;
        paint2.setColor(bkb.w0(null, bkb.Ki, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = gl.P;
        rectF.set(getWidth() - gl.L(37.0f), gl.L(25.0f), getWidth() - gl.L(21.0f), gl.L(27.0f));
        canvas.drawRoundRect(rectF, gl.L(0.3f), gl.L(0.3f), paint2);
        rectF.set(getWidth() - gl.L(37.0f), gl.L(31.0f), getWidth() - gl.L(21.0f), gl.L(33.0f));
        canvas.drawRoundRect(rectF, gl.L(0.3f), gl.L(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824));
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
            ofFloat.addUpdateListener(new he1(this, (byte) 0));
            this.s.addListener(new y7((byte) 12, this, z));
            this.s.setInterpolator(s33.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override
    public final void updateColors() {
        ih2 ih2Var;
        hn hnVar;
        wjb wjbVar = this.b;
        try {
            me1.I.setColor(bkb.v0(bkb.Ei, wjbVar));
            me1.J.setColor(bkb.v0(bkb.U8, wjbVar));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (ih2Var = this.e) != null && (hnVar = this.f) != null) {
                int f = bm2.f(this.F, bkb.v0(bkb.y6, wjbVar), bkb.v0(bkb.m6, wjbVar));
                ih2Var.b(f);
                hnVar.setTextColor(f);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
