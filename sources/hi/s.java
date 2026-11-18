package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.y60;
public abstract class s extends n {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public vy0 A1;
    public x10 B1;
    public x10 C1;
    public q D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.c6 G1;
    public final org.telegram.ui.Components.c6 H1;
    public final org.telegram.ui.Components.c6 I1;
    public final org.telegram.ui.Components.c6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final o P1;
    public final ImageView S0;
    public final ImageView T0;
    public final m U0;
    public y60 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final r f15340a1;
    public final org.telegram.ui.Components.m6 f15341b1;
    public float f15342c1;
    public float f15343d1;
    public long f15344e1;
    public final Paint f15345f1;
    public final Paint f15346g1;
    public final org.telegram.ui.Components.w9 f15347h1;
    public final org.telegram.ui.Components.w9 f15348i1;
    public final Drawable f15349j1;
    public float f15350k1;
    public final org.telegram.ui.Components.c6 l1;
    public final Path f15351m1;
    public final Path n1;
    public final Paint f15352o1;
    public final Paint f15353p1;
    public final Paint f15354q1;
    public final Paint f15355r1;
    public final org.telegram.ui.Components.c6 f15356s1;
    public final RectF f15357t1;
    public final RectF f15358u1;
    public final RectF f15359v1;
    public final Path f15360w1;
    public vy0 f15361x1;
    public Path f15362y1;
    public Paint f15363z1;

    public s(Context context, FrameLayout frameLayout, au0 au0Var, FrameLayout frameLayout2, fi.b bVar, org.telegram.ui.Components.ca caVar) {
        super(context, frameLayout, au0Var, frameLayout2, bVar, caVar);
        this.W0 = true;
        this.X0 = 0;
        ja jaVar = (ja) this;
        this.f15340a1 = new r(jaVar, jaVar);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f15341b1 = m6Var;
        lr lrVar = lr.f37208f;
        m6Var.n(0.16f, 50L, lrVar);
        m6Var.w(org.telegram.messenger.g0.L(15.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.t("0:00.0", true, true);
        m6Var.u(-1);
        Paint paint = new Paint(1);
        this.f15345f1 = paint;
        Paint paint2 = new Paint(1);
        this.f15346g1 = paint2;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(11, 360928);
        this.f15347h1 = w9Var;
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(12, 360928);
        this.f15348i1 = w9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        w9Var.f41628a = org.telegram.messenger.g0.L(47.0f);
        w9Var.f41629b = org.telegram.messenger.g0.L(55.0f);
        w9Var.b();
        w9Var2.f41628a = org.telegram.messenger.g0.L(47.0f);
        w9Var2.f41629b = org.telegram.messenger.g0.L(55.0f);
        w9Var2.b();
        this.f15349j1 = getContext().getResources().getDrawable(2131231516).mutate();
        this.l1 = new org.telegram.ui.Components.c6(new o(jaVar, 0), 200L, lrVar, 0);
        this.f15351m1 = new Path();
        this.n1 = new Path();
        this.f15352o1 = new Paint(1);
        this.f15353p1 = new Paint(1);
        this.f15354q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f15355r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        o oVar = new o(jaVar, 0);
        lr lrVar2 = lr.h;
        this.f15356s1 = new org.telegram.ui.Components.c6(oVar, 350L, lrVar2);
        this.f15357t1 = new RectF();
        this.f15358u1 = new RectF();
        this.f15359v1 = new RectF();
        this.f15360w1 = new Path();
        this.G1 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar2);
        this.H1 = new org.telegram.ui.Components.c6(new o(jaVar, 0), 420L, lrVar2, 0);
        this.I1 = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar2);
        this.J1 = new org.telegram.ui.Components.c6(new o(jaVar, 0), 350L, lrVar2, 0);
        this.P1 = new o(jaVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(2131231517);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(gd.M0(2131754736, null));
        addView(imageView, c8.ma.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.d(jaVar, 29));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        m mVar = new m(5);
        this.U0 = mVar;
        imageView2.setImageDrawable(mVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(gd.M0(2131744355, null));
        A(86400, false);
        addView(imageView2, c8.ma.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new ah.h(jaVar, frameLayout, bVar, 13));
    }

    public final void A(int i7, boolean z10) {
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (Q1[i10] == i7) {
                    break;
                }
                i10++;
            } else {
                i10 = 2;
                break;
            }
        }
        if (this.X0 == i10) {
            return;
        }
        this.X0 = i10;
        this.U0.d(i7 / 3600, false, z10);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f15042a);
            String M0 = gd.M0(2131744263, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = gd.M0(2131744264, null);
            alertDialog$Builder.k(gd.M0(2131746126, null), new di.c7(this, 16));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, this.f15042a);
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i7;
        int i10 = 0;
        if (!z10 && this.W0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.T0;
        imageView.setVisibility(i7);
        if (z10) {
            i10 = 8;
        }
        this.S0.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i7;
        if (!z10) {
            if (this.W0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.T0.setVisibility(i7);
            this.S0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.s.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return mp.u1(this.V).Y4;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return mp.u1(this.V).Z4;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f10;
        float f11;
        float f12;
        Paint paint;
        float f13;
        String str2;
        Canvas canvas2;
        int i7;
        int i10;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float d = this.G1.d(this.K1);
            float d2 = this.I1.d(this.M1);
            if (this.f15344e1 <= 0) {
                this.f15344e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f15344e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.g0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
            r rVar = this.f15340a1;
            rVar.setBounds((int) (L - org.telegram.messenger.g0.L(12.0f)), (int) (L2 - org.telegram.messenger.g0.L(12.0f)), (int) (L + org.telegram.messenger.g0.L(12.0f)), (int) (L2 + org.telegram.messenger.g0.L(12.0f)));
            rVar.draw(canvas3);
            int L3 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) + org.telegram.messenger.g0.L(9.0f));
            org.telegram.ui.Components.m6 m6Var = this.f15341b1;
            m6Var.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(33.3f)) - (org.telegram.messenger.g0.L(10.0f) * d)), (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(9.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(133.3f)), L3);
            long b10 = this.D1.b();
            int i11 = (int) (b10 / 1000);
            int i12 = (int) ((b10 - (i11 * 1000)) / 100);
            int i13 = i11 / 60;
            int i14 = i11 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13);
            sb2.append(":");
            if (i14 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(i14);
            sb2.append(".");
            sb2.append(i12);
            m6Var.t(sb2.toString(), true, true);
            m6Var.C = (int) ((1.0f - d) * 255.0f);
            m6Var.draw(canvas3);
            float f14 = 1.0f - d2;
            float f15 = (1.0f - this.f15342c1) * f14;
            Paint c10 = this.Q.c(1.0f);
            if (c10 != null) {
                f11 = 10.0f;
                paint = c10;
                f10 = 12.0f;
                f12 = f15;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = 12.0f;
                f11 = 10.0f;
                f12 = f15;
                paint = c10;
            }
            if (f12 > 0.0f) {
                if (this.f15361x1 == null) {
                    this.f15361x1 = new vy0(gd.M0(2131745118, null), 15.0f, null);
                }
                if (this.f15362y1 == null) {
                    Path path = new Path();
                    this.f15362y1 = path;
                    path.moveTo(org.telegram.messenger.g0.L(3.83f), 0.0f);
                    this.f15362y1.lineTo(0.0f, org.telegram.messenger.g0.L(5.0f));
                    this.f15362y1.lineTo(org.telegram.messenger.g0.L(3.83f), org.telegram.messenger.g0.L(f11));
                    Paint paint2 = new Paint(1);
                    this.f15363z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f15363z1.setStrokeCap(Paint.Cap.ROUND);
                    this.f15363z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f15363z1.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                this.f15361x1.f41493p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - m6Var.c());
                float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.f15342c1, org.telegram.messenger.g0.L(6.0f) * sin, (rectF.centerX() - ((this.f15361x1.k() + org.telegram.messenger.g0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.g0.T1(this.f15342c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int r12 = org.telegram.ui.ActionBar.n6.r1(f12, i10);
                canvas3.save();
                canvas3.translate(t6, rectF.centerY() - org.telegram.messenger.g0.L(5.0f));
                this.f15363z1.setColor(r12);
                canvas3.drawPath(this.f15362y1, this.f15363z1);
                canvas3.restore();
                str2 = null;
                f13 = 15.0f;
                this.f15361x1.c(t6 + org.telegram.messenger.g0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f13 = 15.0f;
                str2 = null;
            }
            if (d2 > 0.0f) {
                if (this.A1 == null) {
                    this.A1 = new vy0(gd.M0(2131752559, str2), f13, org.telegram.messenger.g0.o());
                }
                this.A1.f41493p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - m6Var.c());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.k() / 2.0f));
                if (paint != null) {
                    i7 = -1;
                } else {
                    i7 = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.n6.r1(d2, i7), canvas2);
                this.f15358u1.set(width - org.telegram.messenger.g0.L(f10), rectF.top, this.A1.k() + width + org.telegram.messenger.g0.L(f10), rectF.bottom);
            } else {
                canvas2 = canvas;
            }
            if (paint != null) {
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
            }
            invalidate();
        }
    }

    @Override
    public final void k(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z11 = this.K1;
        org.telegram.ui.Components.c6 c6Var = this.H1;
        float d = c6Var.d(z11);
        boolean z12 = this.M1;
        org.telegram.ui.Components.c6 c6Var2 = this.J1;
        float d2 = c6Var2.d(z12);
        float e10 = this.l1.e(false, this.f15350k1);
        float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f15342c1, org.telegram.messenger.g0.L(30.0f) * e10, org.telegram.messenger.g0.L(41.0f));
        float f19 = 1.0f - d;
        float f20 = z13 * f19 * f10;
        float T1 = org.telegram.messenger.g0.T1(com.google.android.gms.internal.vision.e2.t(1.0f, d2, getWidth() * 0.35f * this.f15342c1, rectF.right - org.telegram.messenger.g0.L(20.0f)), rectF.left + org.telegram.messenger.g0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
        boolean e11 = pc.e(360928);
        Paint paint = this.f15346g1;
        if (e11) {
            org.telegram.ui.Components.w9 w9Var = this.f15347h1;
            w9Var.f41628a = org.telegram.messenger.g0.L(47.0f);
            Paint paint2 = w9Var.d;
            f11 = 0.0f;
            w9Var.f41629b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
            f12 = d2;
            org.telegram.ui.Components.w9 w9Var2 = this.f15348i1;
            w9Var2.f41628a = org.telegram.messenger.g0.L(50.0f);
            Paint paint3 = w9Var2.d;
            f13 = f19;
            w9Var2.f41629b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
            w9Var2.e(e10, 1.01f);
            w9Var.e(e10, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.n6.r1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f21 = f20 / w9Var2.f41628a;
            canvas.scale(f21, f21, T1, L);
            w9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f22 = f20 / w9Var.f41628a;
            canvas.scale(f22, f22, T1, L);
            w9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f11 = 0.0f;
            f12 = d2;
            f13 = f19;
        }
        float min = Math.min(f20, org.telegram.messenger.g0.L(55.0f));
        float f23 = f10 * 255.0f;
        paint.setAlpha((int) f23);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.f15351m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f15349j1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f13;
        if (this.L1) {
            f14 = f10;
        } else {
            f14 = 1.0f;
        }
        int i7 = (int) (T1 - (intrinsicWidth * f14));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f13;
        if (this.L1) {
            f15 = f10;
        } else {
            f15 = 1.0f;
        }
        int i10 = (int) (L - (intrinsicHeight * f15));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f13;
        if (this.L1) {
            f16 = f10;
        } else {
            f16 = 1.0f;
        }
        int i11 = (int) ((intrinsicWidth2 * f16) + T1);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f13;
        if (this.L1) {
            f17 = f10;
        } else {
            f17 = 1.0f;
        }
        drawable.setBounds(i7, i10, i11, (int) ((intrinsicHeight2 * f17) + L));
        float f24 = f13 * 255.0f;
        if (this.L1) {
            f18 = f10;
        } else {
            f18 = 1.0f;
        }
        drawable.setAlpha((int) (f24 * f18));
        drawable.draw(canvas);
        if (f12 > f11) {
            float N = (org.telegram.messenger.g0.N(19.33f) / 2.0f) * f12 * f10;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(T1 - N, L - N, T1 + N, L + N);
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(5.33f), this.f15345f1);
        }
        canvas.restore();
        float f25 = c6Var.f33892c;
        float f26 = c6Var2.f33892c;
        if (this.f15342c1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float A = org.telegram.messenger.f3.A(1.0f, f25, org.telegram.messenger.g0.T1(this.f15356s1.d(z10), f11, f26), f10);
        float L2 = rectF.right - org.telegram.messenger.g0.L(20.0f);
        float W1 = (org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(36.0f)) * A) / 2.0f;
        float f27 = 1.0f - f26;
        float T12 = org.telegram.messenger.g0.T1(((rectF.bottom - org.telegram.messenger.g0.L(80.0f)) - W1) - ((org.telegram.messenger.g0.L(120.0f) * this.f15343d1) * f27), rectF.bottom - org.telegram.messenger.g0.L(20.0f), 1.0f - A);
        float L3 = (org.telegram.messenger.g0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f15357t1;
        rectF3.set(L2 - L3, T12 - W1, L3 + L2, W1 + T12);
        float W12 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f));
        int r12 = org.telegram.ui.ActionBar.n6.r1(A, 536870912);
        Paint paint4 = this.f15353p1;
        paint4.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.S.c(A);
        if (c10 == null) {
            Paint paint5 = this.f15352o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c10);
            Paint paint6 = this.f15049e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L2, T12);
        int r13 = org.telegram.ui.ActionBar.n6.r1(A, -1);
        Paint paint7 = this.f15354q1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.n6.r1(A * f27, -1);
        Paint paint8 = this.f15355r1;
        paint8.setColor(r14);
        float L4 = (org.telegram.messenger.g0.L(4.0f) * f27) + T12;
        canvas.rotate(this.f15343d1 * 12.0f * f27, L2, L4);
        float W13 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(15.33f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float W14 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float f28 = L4 - W14;
        RectF rectF4 = this.f15359v1;
        rectF4.set(L2 - W13, f28, W13 + L2, L4 + W14);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(3.66f), paint7);
        if (f26 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f15343d1 * 12.0f * f27, L2, f28);
            canvas.translate(0.0f, W14 * f26);
            canvas.scale(f27, f27, L2, f28);
            Path path2 = this.f15360w1;
            path2.rewind();
            float L5 = org.telegram.messenger.g0.L(4.33f);
            float L6 = f28 - org.telegram.messenger.g0.L(3.66f);
            float f29 = L2 + L5;
            path2.moveTo(f29, org.telegram.messenger.g0.L(3.66f) + L6);
            path2.lineTo(f29, L6);
            RectF rectF5 = org.telegram.messenger.g0.P;
            float f30 = L2 - L5;
            rectF5.set(f30, L6 - L5, f29, L5 + L6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f30, (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(0.4f, 0.0f, this.f15343d1), 1.0f, f26) * org.telegram.messenger.g0.L(3.66f)) + L6);
            paint8.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.c6 c6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || c6Var3.f33892c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f15061o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || c6Var3.f33892c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || c6Var3.f33892c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.Y0 == null) {
            this.Y0 = getContext().getDrawable(2131230878);
        }
        this.Y0.setAlpha((int) (f23 * f13));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(org.telegram.messenger.g0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r rVar = this.f15340a1;
        mh0 mh0Var = rVar.h;
        rVar.f15305f = true;
        if (rVar.f15306g) {
            mh0Var.start();
        }
        mh0Var.R(rVar.f15307i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.f15340a1;
        rVar.f15305f = false;
        mh0 mh0Var = rVar.h;
        mh0Var.stop();
        mh0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.f15350k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i7;
        int i10;
        if (z10) {
            i7 = 2131231518;
        } else {
            i7 = 2131231517;
        }
        ImageView imageView = this.S0;
        imageView.setImageResource(i7);
        if (z10) {
            i10 = 2131754788;
        } else {
            i10 = 2131754736;
        }
        imageView.setContentDescription(gd.M0(i10, null));
        this.Z0 = z10;
    }

    public void setOnPeriodUpdate(x10 x10Var) {
        this.B1 = x10Var;
    }

    public void setOnPremiumHint(x10 x10Var) {
        this.C1 = x10Var;
    }

    public void setPeriod(int i7) {
        A(i7, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i7;
        this.W0 = z10;
        if (z10 && !this.f15062p0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.T0.setVisibility(i7);
    }

    @Override
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.T0.setAlpha(f11);
        this.S0.setAlpha(f11);
    }

    public final void z(boolean z10, boolean z11) {
        org.telegram.messenger.g0.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        this.K0 = false;
        this.L0 = (int) ((getBounds().right - org.telegram.messenger.g0.L(20.0f)) - ((getWidth() * 0.35f) * this.f15342c1));
        invalidate();
        q qVar = this.D1;
        if (qVar != null) {
            if (!z10) {
                if (z11) {
                    qVar.f14823y = true;
                    org.telegram.messenger.g0.r(qVar.h);
                    CameraController.getInstance().stopVideoRecording(qVar.f14813a.getCameraSessionRecording(), false, false);
                    qVar.a(false);
                } else {
                    qVar.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
