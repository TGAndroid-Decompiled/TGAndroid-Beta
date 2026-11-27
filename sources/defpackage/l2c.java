package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
public final class l2c extends FrameLayout implements snb {
    public final Path E;
    public final GradientDrawable F;
    public float G;
    public float H;
    public vpa I;
    public final guc J;
    public long K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public TL_wallet.walletTransaction S;
    public final LinearLayout T;
    public final de0 U;
    public Drawable V;
    public final TextView W;
    public final int a;
    public final TextView a0;
    public final vnb b;
    public boolean b0;
    public final rb0 c;
    public boolean c0;
    public final ImageView d;
    public boolean d0;
    public final de0 e;
    public boolean e0;
    public final TextView f;
    public ShapeDrawable f0;
    public boolean g0;
    public final TextView h;
    public boolean h0;
    public final TextView n;
    public final TextView r;
    public final Drawable s;
    public final Drawable w;
    public final xuc x;
    public final Paint y;

    public l2c(int i, vnb vnbVar, Context context) {
        super(context);
        this.c = new rb0((vnb) null);
        this.y = new Paint(1);
        this.E = new Path();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.F = gradientDrawable;
        this.J = new guc();
        this.a = i;
        this.b = vnbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        de0 de0Var = new de0(context);
        this.e = de0Var;
        de0Var.setRoundRadius(hl.L(23.0f));
        addView(de0Var, tre.d(46, 46.0f, 51, 13.0f, 12.0f, 0.0f, 15.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.d(-1, -1.0f, 119, 71.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, tre.l(1.0f, 0, -2));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        textView.setMaxWidth(hl.L(120.0f));
        TextView m = ik8.m(linearLayout2, textView, tre.k(0.0f, 9.0f, 0.0f, 0.0f, -1, 18), context);
        this.h = m;
        m.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m.setEllipsize(truncateAt);
        m.setIncludeFontPadding(false);
        m.setGravity(16);
        m.setTextSize(1, 13.0f);
        TextView m2 = ik8.m(linearLayout2, m, tre.k(0.0f, 2.0f, 0.0f, 0.0f, -1, 16), context);
        this.n = m2;
        m2.setSingleLine(true);
        m2.setEllipsize(truncateAt);
        m2.setIncludeFontPadding(false);
        m2.setGravity(16);
        m2.setTextSize(1, 13.0f);
        linearLayout2.addView(m2, tre.k(0.0f, 2.0f, 0.0f, 10.0f, -1, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.T = linearLayout3;
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, tre.k(0.0f, -2.0f, 0.0f, 8.0f, -2, -2));
        de0 de0Var2 = new de0(context);
        this.U = de0Var2;
        de0Var2.setRoundRadius(hl.L(8.0f));
        linearLayout3.addView(de0Var2, tre.t(40, 40, 51, 2, 2, 6, 2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout3.addView(linearLayout4, tre.q(0, -1, 1.0f, 51, 0, 2, 10, 2));
        TextView textView2 = new TextView(context);
        this.W = textView2;
        ik8.v(textView2, 1, 14.0f);
        TextView m3 = ik8.m(linearLayout4, textView2, tre.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.a0 = m3;
        m3.setTextSize(1, 14.0f);
        linearLayout4.addView(m3, tre.t(-1, -2, 55, 0, 0, 0, 0));
        xuc xucVar = new xuc(context);
        this.x = xucVar;
        this.r = xucVar.a;
        Drawable e = c00.e(context, 2131232843);
        this.s = e;
        e.setBounds(0, 0, hl.L(16.0f), hl.L(16.0f));
        Drawable e2 = c00.e(context, 2131232859);
        this.w = e2;
        e2.setBounds(0, 0, hl.L(16.0f), hl.L(16.0f));
        linearLayout.addView(xucVar, tre.q(-2, -1, 0.0f, 53, 8, 0, 0, 0));
        setClipChildren(false);
        setClipToPadding(false);
        gradientDrawable.setCornerRadius(hl.L(16.0f));
        setBackground(gradientDrawable);
        updateColors();
    }

    private void setDateBelowNft(boolean z) {
        boolean z2;
        float f;
        float f2;
        View view = this.n;
        LinearLayout linearLayout = (LinearLayout) view.getParent();
        if (linearLayout != null) {
            int indexOfChild = linearLayout.indexOfChild(view);
            View view2 = this.T;
            if (indexOfChild > linearLayout.indexOfChild(view2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                linearLayout.removeView(view);
                linearLayout.addView(view, linearLayout.indexOfChild(view2) + (z ? 1 : 0), layoutParams);
                if (z) {
                    f = 4.0f;
                } else {
                    f = -2.0f;
                }
                layoutParams2.topMargin = hl.L(f);
                if (z) {
                    f2 = 2.0f;
                } else {
                    f2 = 8.0f;
                }
                layoutParams2.bottomMargin = hl.L(f2);
                layoutParams.topMargin = hl.L(2.0f);
                layoutParams.bottomMargin = hl.L(10.0f);
            }
        }
    }

    private void setIconColor(ol5 ol5Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setShaderFactory(new g2c(ol5Var));
        this.d.setBackground(shapeDrawable);
    }

    private void setPendingProgress(float f) {
        this.G = f;
        this.F.setColor(aob.p1(this.G, aob.v0(aob.d6, this.b)));
        c();
        setElevation(hl.L(8.0f) * f);
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineAmbientShadowColor(1493903946);
            setOutlineSpotShadowColor(1493903946);
        }
        if (!this.N) {
            f = 0.0f;
        }
        xuc xucVar = this.x;
        xucVar.d = f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0 && xucVar.c == null) {
            yrc yrcVar = new yrc(40, xucVar.getContext(), true);
            xucVar.c = yrcVar;
            yrcVar.setContinuousRotation(300.0f);
            xucVar.addView(xucVar.c, tre.c(40.0f, 40));
        }
        yrc yrcVar2 = xucVar.c;
        if (yrcVar2 != null && i == 0) {
            yrcVar2.setPaused(true);
            xucVar.removeView(xucVar.c);
            xucVar.c = null;
        }
        xucVar.a();
        xucVar.requestLayout();
        invalidate();
    }

    public final CharSequence a(k2c k2cVar, String str) {
        int indexOf;
        String a = k2cVar.a(str);
        Typeface typeface = vqc.x;
        if (str != null && a != null && (indexOf = a.indexOf(8230)) > 0 && indexOf < a.length() - 1) {
            String substring = a.substring(0, indexOf);
            String substring2 = a.substring(indexOf + 1);
            int length = str.length();
            if (str.startsWith(substring) && str.endsWith(substring2)) {
                if (length >= substring2.length() + substring.length() + 4) {
                    String substring3 = str.substring(substring.length(), substring.length() + 2);
                    String substring4 = str.substring((length - substring2.length()) - 2, length - substring2.length());
                    SpannableString spannableString = new SpannableString(a);
                    spannableString.setSpan(new vqc(substring, substring3, substring4, substring2, this.b), 0, spannableString.length(), 33);
                    return spannableString;
                }
            }
        }
        return a;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.a7));
    }

    public final void b(boolean z, float f) {
        TL_wallet.walletTransaction wallettransaction;
        yrc pendingDiamond;
        boolean z2;
        float y;
        float y2;
        int i;
        if (!z || this.L == null || this.M != f) {
            this.M = f;
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            if (z && f == 0.0f && this.G > 0.0f && !isAttachedToWindow()) {
                return;
            }
            if (z) {
                float f2 = this.G;
                if (f2 != f) {
                    if (f == 0.0f && f2 > 0.0f && (wallettransaction = this.S) != null && !wallettransaction.failed && (pendingDiamond = getPendingDiamond()) != null) {
                        RectF a = quc.a(pendingDiamond, this);
                        float centerX = a.centerX();
                        float centerY = a.centerY();
                        guc gucVar = this.J;
                        gucVar.getClass();
                        float f3 = hl.p;
                        for (int i2 = 0; i2 < 56; i2++) {
                            int i3 = i2 % 10;
                            if (i3 <= 6) {
                                y = gucVar.y(-0.3f, 0.3f) + 3.1415927f;
                                y2 = gucVar.y(140.0f, 560.0f);
                            } else if (i3 <= 8) {
                                if (((Random) gucVar.c).nextBoolean()) {
                                    i = 1;
                                } else {
                                    i = -1;
                                }
                                y = (gucVar.y(0.5f, 1.4f) * i) + 3.1415927f;
                                y2 = gucVar.y(60.0f, 240.0f);
                            } else {
                                y = gucVar.y(0.0f, 6.2831855f);
                                y2 = gucVar.y(40.0f, 160.0f);
                            }
                            gucVar.j(centerX, centerY, y, y2 * f3, gucVar.y(2.2f, 6.5f) * f3, gucVar.y(0.8f, 1.4f), 2.4f);
                        }
                        if (!this.Q && this.N) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.R = z2;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, f);
                    this.L = ofFloat;
                    ofFloat.setDuration(260L);
                    this.L.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                    this.L.addUpdateListener(new pzb(this, (byte) 3));
                    this.L.addListener(new omb(this, (byte) 8));
                    this.L.start();
                    return;
                }
            }
            setPendingProgress(f);
        }
    }

    public final void c() {
        float f = (this.G * 0.035f) + 1.0f;
        setScaleX(((this.H * 0.012f) + 1.0f) * f);
        setScaleY((1.0f - (this.H * 0.04f)) * f);
        setTranslationY(hl.L(4.0f) * this.H);
        float f2 = this.H;
        xuc xucVar = this.x;
        xucVar.e = f2;
        xucVar.a();
    }

    public final void d() {
        vpa vpaVar = this.I;
        if (vpaVar != null) {
            vpaVar.d();
            this.I = null;
        }
        this.H = 0.0f;
        c();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yrc pendingDiamond;
        super.dispatchDraw(canvas);
        if (this.R && isAttachedToWindow() && getWindowVisibility() == 0 && (getRootView() instanceof ViewGroup) && (pendingDiamond = getPendingDiamond()) != null && pendingDiamond.getWidth() > 0 && pendingDiamond.getHeight() > 0) {
            this.R = false;
            this.Q = true;
            RectF a = quc.a(pendingDiamond, (ViewGroup) getRootView());
            LaunchActivity.a0(a.centerX(), a.centerY(), 1.5f);
        }
        guc gucVar = this.J;
        gucVar.p(canvas);
        if (gucVar.q()) {
            postInvalidateOnAnimation();
        }
        float f = this.G;
        if (f > 0.0f) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.K;
            int i = aob.Fi;
            vnb vnbVar = this.b;
            int v0 = aob.v0(i, vnbVar);
            Paint paint = this.y;
            paint.setShader(null);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(aob.v0(aob.d6, vnbVar));
            float f2 = 255.0f * f;
            paint.setAlpha(Math.round(f2));
            canvas.drawCircle(hl.L(52.0f), hl.L(51.0f), hl.L(8.0f) * f, paint);
            paint.setColor(v0);
            paint.setAlpha(Math.round(f2));
            paint.setStrokeWidth(hl.L(1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(hl.L(52.0f), hl.L(51.0f), hl.L(7.0f) * f, paint);
            e(canvas, ((float) (uptimeMillis % 1000)) * 0.36f, hl.L(4.6f) * f);
            e(canvas, (((float) (uptimeMillis % 6000)) * 0.06f) + 120.0f, hl.L(3.2f) * f);
            float f3 = ((float) (uptimeMillis % 1600)) / 1600.0f;
            float width = getWidth() * 0.5f;
            float g = bp1.g(width, 2.0f, getWidth(), f3, -width);
            float f4 = width / 2.0f;
            float f5 = g - f4;
            float f6 = g + f4;
            int i2 = 16777215 & v0;
            paint.setShader(new LinearGradient(f5, 0.0f, f6, 0.0f, new int[]{i2, v0, -7346433, i2}, new float[]{0.0f, 0.45f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
            paint.setAlpha(Math.round(f * 150.0f * ((float) Math.sin(f3 * 3.141592653589793d))));
            paint.setStrokeWidth(hl.L(1.5f));
            canvas.drawRoundRect(hl.L(1.0f), hl.L(1.0f), getWidth() - hl.L(1.0f), getHeight() - hl.L(1.0f), hl.L(16.0f), hl.L(16.0f), paint);
            paint.setShader(null);
            if (isAttachedToWindow() && isShown() && getWindowVisibility() == 0) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.G > 0.0f && (view == this.e || view == this.d)) {
            int save = canvas.save();
            Path path = this.E;
            path.rewind();
            path.addCircle(hl.L(52.0f), hl.L(51.0f), hl.L(10.0f) * this.G, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(Canvas canvas, float f, float f2) {
        double radians = Math.toRadians(f - 90.0f);
        canvas.drawLine(hl.L(52.0f), hl.L(51.0f), (((float) Math.cos(radians)) * f2) + hl.L(52.0f), (((float) Math.sin(radians)) * f2) + hl.L(51.0f), this.y);
    }

    public final void f(boolean z) {
        float f;
        this.P = z;
        xuc xucVar = this.x;
        xucVar.f = z;
        xucVar.a();
        if (!this.O && !z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        b(!z, f);
    }

    public final void g(ValueAnimator valueAnimator) {
        setPendingProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public yrc getPendingDiamond() {
        return this.x.c;
    }

    public final void h(org.telegram.tgnet.tl.TL_wallet.walletTransaction r28, defpackage.k2c r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2c.h(org.telegram.tgnet.tl.TL_wallet$walletTransaction, k2c, boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        if (!this.O && !this.P) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        b(true, f);
    }

    @Override
    public final void onDetachedFromWindow() {
        d();
        ((ArrayList) this.J.b).clear();
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L = null;
        }
        this.P = false;
        xuc xucVar = this.x;
        xucVar.f = false;
        xucVar.a();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.b0 && this.G < 1.0f) {
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.y;
            paint.setStyle(style);
            paint.setColor(aob.j0.getColor());
            paint.setAlpha(Math.round((1.0f - this.G) * aob.j0.getAlpha()));
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(71.0f);
            }
            float f = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (ob6.a0) {
                i = hl.L(71.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, height, width - i, getHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.h0;
        LinearLayout linearLayout = this.T;
        int i3 = 0;
        if (z && linearLayout.getVisibility() == 0) {
            xuc xucVar = this.x;
            if (xucVar.getVisibility() == 0) {
                xucVar.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), 0);
                i3 = -(hl.L(8.0f) + xucVar.getMeasuredWidth());
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != i3) {
            layoutParams.rightMargin = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        int v0;
        int i = aob.d6;
        vnb vnbVar = this.b;
        this.F.setColor(aob.p1(this.G, aob.v0(i, vnbVar)));
        int i2 = aob.G6;
        this.f.setTextColor(aob.v0(i2, vnbVar));
        this.h.setTextColor(aob.v0(i2, vnbVar));
        int i3 = aob.z6;
        this.n.setTextColor(aob.v0(i3, vnbVar));
        if (this.c0 && !this.O) {
            v0 = aob.v0(i3, vnbVar);
        } else if (this.d0) {
            v0 = aob.v0(aob.lk, vnbVar);
        } else {
            v0 = aob.v0(i2, vnbVar);
        }
        this.x.a.setTextColor(v0);
        this.w.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        int v02 = aob.v0(aob.a7, vnbVar);
        LinearLayout linearLayout = this.T;
        if (linearLayout.getBackground() instanceof ShapeDrawable) {
            ShapeDrawable shapeDrawable = (ShapeDrawable) linearLayout.getBackground();
            if (shapeDrawable.getPaint().getColor() != v02) {
                shapeDrawable.getPaint().setColor(v02);
                shapeDrawable.invalidateSelf();
            }
        } else {
            linearLayout.setBackground(aob.b0(hl.L(10.0f), v02));
        }
        this.W.setTextColor(aob.v0(i2, vnbVar));
        if (!this.g0) {
            i2 = i3;
        }
        this.a0.setTextColor(aob.v0(i2, vnbVar));
    }
}
