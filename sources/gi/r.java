package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hp;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;
public abstract class r extends m {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public ly0 A1;
    public u10 B1;
    public u10 C1;
    public p D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.u5 G1;
    public final org.telegram.ui.Components.u5 H1;
    public final org.telegram.ui.Components.u5 I1;
    public final org.telegram.ui.Components.u5 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final n P1;
    public final ImageView S0;
    public final ImageView T0;
    public final l U0;
    public f60 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final q f13459a1;
    public final org.telegram.ui.Components.g6 f13460b1;
    public float f13461c1;
    public float f13462d1;
    public long f13463e1;
    public final Paint f13464f1;
    public final Paint f13465g1;
    public final org.telegram.ui.Components.q9 f13466h1;
    public final org.telegram.ui.Components.q9 f13467i1;
    public final Drawable f13468j1;
    public float k1;
    public final org.telegram.ui.Components.u5 f13469l1;
    public final Path m1;
    public final Path f13470n1;
    public final Paint f13471o1;
    public final Paint f13472p1;
    public final Paint f13473q1;
    public final Paint f13474r1;
    public final org.telegram.ui.Components.u5 f13475s1;
    public final RectF f13476t1;
    public final RectF f13477u1;
    public final RectF f13478v1;
    public final Path f13479w1;
    public ly0 f13480x1;
    public Path f13481y1;
    public Paint f13482z1;

    public r(Context context, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, ei.b bVar, org.telegram.ui.Components.x9 x9Var) {
        super(context, frameLayout, qt0Var, frameLayout2, bVar, x9Var);
        this.W0 = true;
        this.X0 = 0;
        la laVar = (la) this;
        this.f13459a1 = new q(laVar, laVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f13460b1 = g6Var;
        xq xqVar = xq.f40452f;
        g6Var.n(0.16f, 50L, xqVar);
        g6Var.w(org.telegram.messenger.g0.L(15.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.t("0:00.0", true, true);
        g6Var.u(-1);
        Paint paint = new Paint(1);
        this.f13464f1 = paint;
        Paint paint2 = new Paint(1);
        this.f13465g1 = paint2;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(11, 360928);
        this.f13466h1 = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(12, 360928);
        this.f13467i1 = q9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        q9Var.f37381a = org.telegram.messenger.g0.L(47.0f);
        q9Var.f37382b = org.telegram.messenger.g0.L(55.0f);
        q9Var.b();
        q9Var2.f37381a = org.telegram.messenger.g0.L(47.0f);
        q9Var2.f37382b = org.telegram.messenger.g0.L(55.0f);
        q9Var2.b();
        this.f13468j1 = getContext().getResources().getDrawable(2131231515).mutate();
        this.f13469l1 = new org.telegram.ui.Components.u5(new n(laVar, 0), 200L, xqVar, 0);
        this.m1 = new Path();
        this.f13470n1 = new Path();
        this.f13471o1 = new Paint(1);
        this.f13472p1 = new Paint(1);
        this.f13473q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f13474r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(laVar, 0);
        xq xqVar2 = xq.h;
        this.f13475s1 = new org.telegram.ui.Components.u5(nVar, 350L, xqVar2);
        this.f13476t1 = new RectF();
        this.f13477u1 = new RectF();
        this.f13478v1 = new RectF();
        this.f13479w1 = new Path();
        this.G1 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar2);
        this.H1 = new org.telegram.ui.Components.u5(new n(laVar, 0), 420L, xqVar2, 0);
        this.I1 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar2);
        this.J1 = new org.telegram.ui.Components.u5(new n(laVar, 0), 350L, xqVar2, 0);
        this.P1 = new n(laVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(2131231516);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(bd.M0(2131754736, null));
        addView(imageView, mf.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ai.b(laVar, 24));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        l lVar = new l(5);
        this.U0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(bd.M0(2131744600, null));
        A(86400, false);
        addView(imageView2, mf.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new ai.h(laVar, frameLayout, bVar, 13));
    }

    public final void A(int i3, boolean z10) {
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (Q1[i10] == i3) {
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
        this.U0.d(i3 / 3600, false, z10);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f13135a);
            String M0 = bd.M0(2131744508, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131744509, null);
            alertDialog$Builder.k(bd.M0(2131746329, null), new ei.y8(this, 5));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, this.f13135a);
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i3;
        int i10 = 0;
        if (!z10 && this.W0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ImageView imageView = this.T0;
        imageView.setVisibility(i3);
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
        int i3;
        if (!z10) {
            if (this.W0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            this.T0.setVisibility(i3);
            this.S0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.r.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return hp.s1(this.V).V4;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return hp.s1(this.V).W4;
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
        int i3;
        int i10;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float d = this.G1.d(this.K1);
            float d10 = this.I1.d(this.M1);
            if (this.f13463e1 <= 0) {
                this.f13463e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f13463e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.g0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
            q qVar = this.f13459a1;
            qVar.setBounds((int) (L - org.telegram.messenger.g0.L(12.0f)), (int) (L2 - org.telegram.messenger.g0.L(12.0f)), (int) (L + org.telegram.messenger.g0.L(12.0f)), (int) (L2 + org.telegram.messenger.g0.L(12.0f)));
            qVar.draw(canvas3);
            int L3 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) + org.telegram.messenger.g0.L(9.0f));
            org.telegram.ui.Components.g6 g6Var = this.f13460b1;
            g6Var.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(33.3f)) - (org.telegram.messenger.g0.L(10.0f) * d)), (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(9.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(133.3f)), L3);
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
            g6Var.t(sb2.toString(), true, true);
            g6Var.B = (int) ((1.0f - d) * 255.0f);
            g6Var.draw(canvas3);
            float f14 = 1.0f - d10;
            float f15 = (1.0f - this.f13461c1) * f14;
            Paint c2 = this.Q.c(1.0f);
            if (c2 != null) {
                f11 = 10.0f;
                paint = c2;
                f10 = 12.0f;
                f12 = f15;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = 12.0f;
                f11 = 10.0f;
                f12 = f15;
                paint = c2;
            }
            if (f12 > 0.0f) {
                if (this.f13480x1 == null) {
                    this.f13480x1 = new ly0(bd.M0(2131745323, null), 15.0f, null);
                }
                if (this.f13481y1 == null) {
                    Path path = new Path();
                    this.f13481y1 = path;
                    path.moveTo(org.telegram.messenger.g0.L(3.83f), 0.0f);
                    this.f13481y1.lineTo(0.0f, org.telegram.messenger.g0.L(5.0f));
                    this.f13481y1.lineTo(org.telegram.messenger.g0.L(3.83f), org.telegram.messenger.g0.L(f11));
                    Paint paint2 = new Paint(1);
                    this.f13482z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f13482z1.setStrokeCap(Paint.Cap.ROUND);
                    this.f13482z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f13482z1.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                this.f13480x1.f35929p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - g6Var.c());
                float D = a1.g.D(1.0f, this.f13461c1, org.telegram.messenger.g0.L(6.0f) * sin, (rectF.centerX() - ((this.f13480x1.k() + org.telegram.messenger.g0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.g0.T1(this.f13461c1, 1.0f, d10) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int r12 = org.telegram.ui.ActionBar.k6.r1(f12, i10);
                canvas3.save();
                canvas3.translate(D, rectF.centerY() - org.telegram.messenger.g0.L(5.0f));
                this.f13482z1.setColor(r12);
                canvas3.drawPath(this.f13481y1, this.f13482z1);
                canvas3.restore();
                str2 = null;
                f13 = 15.0f;
                this.f13480x1.c(D + org.telegram.messenger.g0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f13 = 15.0f;
                str2 = null;
            }
            if (d10 > 0.0f) {
                if (this.A1 == null) {
                    this.A1 = new ly0(bd.M0(2131752570, str2), f13, org.telegram.messenger.g0.o());
                }
                this.A1.f35929p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - g6Var.c());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.k() / 2.0f));
                if (paint != null) {
                    i3 = -1;
                } else {
                    i3 = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.r1(d10, i3), canvas2);
                this.f13477u1.set(width - org.telegram.messenger.g0.L(f10), rectF.top, this.A1.k() + width + org.telegram.messenger.g0.L(f10), rectF.bottom);
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
        org.telegram.ui.Components.u5 u5Var = this.H1;
        float d = u5Var.d(z11);
        boolean z12 = this.M1;
        org.telegram.ui.Components.u5 u5Var2 = this.J1;
        float d10 = u5Var2.d(z12);
        float e10 = this.f13469l1.e(false, this.k1);
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.f13461c1, org.telegram.messenger.g0.L(30.0f) * e10, org.telegram.messenger.g0.L(41.0f));
        float f19 = 1.0f - d;
        float f20 = y9 * f19 * f10;
        float T1 = org.telegram.messenger.g0.T1(a1.g.D(1.0f, d10, getWidth() * 0.35f * this.f13461c1, rectF.right - org.telegram.messenger.g0.L(20.0f)), rectF.left + org.telegram.messenger.g0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
        boolean e11 = lc.e(360928);
        Paint paint = this.f13465g1;
        if (e11) {
            org.telegram.ui.Components.q9 q9Var = this.f13466h1;
            q9Var.f37381a = org.telegram.messenger.g0.L(47.0f);
            Paint paint2 = q9Var.d;
            f11 = 0.0f;
            q9Var.f37382b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
            f12 = d10;
            org.telegram.ui.Components.q9 q9Var2 = this.f13467i1;
            q9Var2.f37381a = org.telegram.messenger.g0.L(50.0f);
            Paint paint3 = q9Var2.d;
            f13 = f19;
            q9Var2.f37382b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
            q9Var2.e(e10, 1.01f);
            q9Var.e(e10, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.k6.r1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f21 = f20 / q9Var2.f37381a;
            canvas.scale(f21, f21, T1, L);
            q9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f22 = f20 / q9Var.f37381a;
            canvas.scale(f22, f22, T1, L);
            q9Var.a(T1, L, canvas, paint2);
            canvas.restore();
        } else {
            f11 = 0.0f;
            f12 = d10;
            f13 = f19;
        }
        float min = Math.min(f20, org.telegram.messenger.g0.L(55.0f));
        float f23 = f10 * 255.0f;
        paint.setAlpha((int) f23);
        canvas.drawCircle(T1, L, min, paint);
        canvas.save();
        Path path = this.m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f13468j1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f13;
        if (this.L1) {
            f14 = f10;
        } else {
            f14 = 1.0f;
        }
        int i3 = (int) (T1 - (intrinsicWidth * f14));
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
        drawable.setBounds(i3, i10, i11, (int) ((intrinsicHeight2 * f17) + L));
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
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(5.33f), this.f13464f1);
        }
        canvas.restore();
        float f25 = u5Var.f38645c;
        float f26 = u5Var2.f38645c;
        if (this.f13461c1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float A = org.telegram.messenger.k5.A(1.0f, f25, org.telegram.messenger.g0.T1(this.f13475s1.d(z10), f11, f26), f10);
        float L2 = rectF.right - org.telegram.messenger.g0.L(20.0f);
        float W1 = (org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(36.0f)) * A) / 2.0f;
        float f27 = 1.0f - f26;
        float T12 = org.telegram.messenger.g0.T1(((rectF.bottom - org.telegram.messenger.g0.L(80.0f)) - W1) - ((org.telegram.messenger.g0.L(120.0f) * this.f13462d1) * f27), rectF.bottom - org.telegram.messenger.g0.L(20.0f), 1.0f - A);
        float L3 = (org.telegram.messenger.g0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f13476t1;
        rectF3.set(L2 - L3, T12 - W1, L3 + L2, W1 + T12);
        float W12 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f));
        int r12 = org.telegram.ui.ActionBar.k6.r1(A, 536870912);
        Paint paint4 = this.f13472p1;
        paint4.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c2 = this.S.c(A);
        if (c2 == null) {
            Paint paint5 = this.f13471o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c2);
            Paint paint6 = this.f13142e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L2, T12);
        int r13 = org.telegram.ui.ActionBar.k6.r1(A, -1);
        Paint paint7 = this.f13473q1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.k6.r1(A * f27, -1);
        Paint paint8 = this.f13474r1;
        paint8.setColor(r14);
        float L4 = (org.telegram.messenger.g0.L(4.0f) * f27) + T12;
        canvas.rotate(this.f13462d1 * 12.0f * f27, L2, L4);
        float W13 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(15.33f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float W14 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float f28 = L4 - W14;
        RectF rectF4 = this.f13478v1;
        rectF4.set(L2 - W13, f28, W13 + L2, L4 + W14);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(3.66f), paint7);
        if (f26 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f13462d1 * 12.0f * f27, L2, f28);
            canvas.translate(0.0f, W14 * f26);
            canvas.scale(f27, f27, L2, f28);
            Path path2 = this.f13479w1;
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
            path2.lineTo(f30, (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(0.4f, 0.0f, this.f13462d1), 1.0f, f26) * org.telegram.messenger.g0.L(3.66f)) + L6);
            paint8.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.u5 u5Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || u5Var3.f38645c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f13154o0) * 255.0f), 31);
                Path path3 = this.f13470n1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || u5Var3.f38645c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || u5Var3.f38645c > 0.0f) {
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
        q qVar = this.f13459a1;
        ch0 ch0Var = qVar.h;
        qVar.f13407f = true;
        if (qVar.f13408g) {
            ch0Var.start();
        }
        ch0Var.R(qVar.f13409i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.f13459a1;
        qVar.f13407f = false;
        ch0 ch0Var = qVar.h;
        ch0Var.stop();
        ch0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i3;
        int i10;
        if (z10) {
            i3 = 2131231517;
        } else {
            i3 = 2131231516;
        }
        ImageView imageView = this.S0;
        imageView.setImageResource(i3);
        if (z10) {
            i10 = 2131754788;
        } else {
            i10 = 2131754736;
        }
        imageView.setContentDescription(bd.M0(i10, null));
        this.Z0 = z10;
    }

    public void setOnPeriodUpdate(u10 u10Var) {
        this.B1 = u10Var;
    }

    public void setOnPremiumHint(u10 u10Var) {
        this.C1 = u10Var;
    }

    public void setPeriod(int i3) {
        A(i3, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i3;
        this.W0 = z10;
        if (z10 && !this.f13155p0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.T0.setVisibility(i3);
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
        this.L0 = (int) ((getBounds().right - org.telegram.messenger.g0.L(20.0f)) - ((getWidth() * 0.35f) * this.f13461c1));
        invalidate();
        p pVar = this.D1;
        if (pVar != null) {
            if (!z10) {
                if (z11) {
                    pVar.f13253y = true;
                    org.telegram.messenger.g0.r(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.f13243a.getCameraSessionRecording(), false, false);
                    pVar.a(false);
                } else {
                    pVar.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
