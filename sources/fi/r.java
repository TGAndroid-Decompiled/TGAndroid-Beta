package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
public abstract class r extends m {
    public static final int[] P1 = {21600, 43200, 86400, 172800};
    public c20 A1;
    public c20 B1;
    public p C1;
    public float D1;
    public float E1;
    public final org.telegram.ui.Components.w5 F1;
    public final org.telegram.ui.Components.w5 G1;
    public final org.telegram.ui.Components.w5 H1;
    public final org.telegram.ui.Components.w5 I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public final n O1;
    public final ImageView R0;
    public final ImageView S0;
    public final l T0;
    public k60 U0;
    public boolean V0;
    public int W0;
    public Drawable X0;
    public boolean Y0;
    public final q Z0;
    public final org.telegram.ui.Components.i6 f12692a1;
    public float f12693b1;
    public float f12694c1;
    public long f12695d1;
    public final Paint f12696e1;
    public final Paint f12697f1;
    public final org.telegram.ui.Components.r9 f12698g1;
    public final org.telegram.ui.Components.r9 f12699h1;
    public final Drawable f12700i1;
    public float f12701j1;
    public final org.telegram.ui.Components.w5 f12702k1;
    public final Path l1;
    public final Path f12703m1;
    public final Paint n1;
    public final Paint f12704o1;
    public final Paint f12705p1;
    public final Paint f12706q1;
    public final org.telegram.ui.Components.w5 f12707r1;
    public final RectF f12708s1;
    public final RectF f12709t1;
    public final RectF f12710u1;
    public final Path f12711v1;
    public my0 f12712w1;
    public Path f12713x1;
    public Paint f12714y1;
    public my0 f12715z1;

    public r(Context context, FrameLayout frameLayout, rt0 rt0Var, FrameLayout frameLayout2, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(context, frameLayout, rt0Var, frameLayout2, bVar, y9Var);
        this.V0 = true;
        this.W0 = 0;
        la laVar = (la) this;
        this.Z0 = new q(laVar, laVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f12692a1 = i6Var;
        xq xqVar = xq.f40366f;
        i6Var.n(0.16f, 50L, xqVar);
        i6Var.w(org.telegram.messenger.g0.L(15.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.t("0:00.0", true, true);
        i6Var.u(-1);
        Paint paint = new Paint(1);
        this.f12696e1 = paint;
        Paint paint2 = new Paint(1);
        this.f12697f1 = paint2;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(11, 360928);
        this.f12698g1 = r9Var;
        org.telegram.ui.Components.r9 r9Var2 = new org.telegram.ui.Components.r9(12, 360928);
        this.f12699h1 = r9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        r9Var.f37573a = org.telegram.messenger.g0.L(47.0f);
        r9Var.f37574b = org.telegram.messenger.g0.L(55.0f);
        r9Var.b();
        r9Var2.f37573a = org.telegram.messenger.g0.L(47.0f);
        r9Var2.f37574b = org.telegram.messenger.g0.L(55.0f);
        r9Var2.b();
        this.f12700i1 = getContext().getResources().getDrawable(2131231515).mutate();
        this.f12702k1 = new org.telegram.ui.Components.w5(new n(laVar, 0), 200L, xqVar, 0);
        this.l1 = new Path();
        this.f12703m1 = new Path();
        this.n1 = new Paint(1);
        this.f12704o1 = new Paint(1);
        this.f12705p1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f12706q1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(laVar, 0);
        xq xqVar2 = xq.h;
        this.f12707r1 = new org.telegram.ui.Components.w5(nVar, 350L, xqVar2);
        this.f12708s1 = new RectF();
        this.f12709t1 = new RectF();
        this.f12710u1 = new RectF();
        this.f12711v1 = new Path();
        this.F1 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar2);
        this.G1 = new org.telegram.ui.Components.w5(new n(laVar, 0), 420L, xqVar2, 0);
        this.H1 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar2);
        this.I1 = new org.telegram.ui.Components.w5(new n(laVar, 0), 350L, xqVar2, 0);
        this.O1 = new n(laVar, 1);
        ImageView imageView = new ImageView(context);
        this.R0 = imageView;
        imageView.setImageResource(2131231516);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(id.M0(2131754736, null));
        addView(imageView, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.d(laVar, 21));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        l lVar = new l(5);
        this.T0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(id.M0(2131744593, null));
        A(86400, false);
        addView(imageView2, c8.ha.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new ah.g(laVar, frameLayout, bVar, 8));
    }

    public final void A(int i7, boolean z9) {
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (P1[i10] == i7) {
                    break;
                }
                i10++;
            } else {
                i10 = 2;
                break;
            }
        }
        if (this.W0 == i10) {
            return;
        }
        this.W0 = i10;
        this.T0.d(i7 / 3600, false, z9);
    }

    public final void B() {
        if (this.Y0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.f12356a);
            String M0 = id.M0(2131744501, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = id.M0(2131744502, null);
            alertDialog$Builder.k(id.M0(2131746322, null), new di.q4(this, 9));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            TextView textView = (TextView) alertDialog$Builder.p().d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, this.f12356a);
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z9) {
        int i7;
        int i10 = 0;
        if (!z9 && this.V0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.S0;
        imageView.setVisibility(i7);
        if (z9) {
            i10 = 8;
        }
        this.R0.setVisibility(i10);
        if (z9) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z9) {
        int i7;
        if (!z9) {
            if (this.V0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.S0.setVisibility(i7);
            this.R0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return qp.s1(this.U).V4;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return qp.s1(this.U).W4;
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
        if (this.C1 != null) {
            float d = this.F1.d(this.J1);
            float d2 = this.H1.d(this.L1);
            if (this.f12695d1 <= 0) {
                this.f12695d1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f12695d1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + org.telegram.messenger.g0.L(21.0f);
            float L2 = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
            q qVar = this.Z0;
            qVar.setBounds((int) (L - org.telegram.messenger.g0.L(12.0f)), (int) (L2 - org.telegram.messenger.g0.L(12.0f)), (int) (L + org.telegram.messenger.g0.L(12.0f)), (int) (L2 + org.telegram.messenger.g0.L(12.0f)));
            qVar.draw(canvas3);
            int L3 = (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) + org.telegram.messenger.g0.L(9.0f));
            org.telegram.ui.Components.i6 i6Var = this.f12692a1;
            i6Var.setBounds((int) ((rectF.left + org.telegram.messenger.g0.L(33.3f)) - (org.telegram.messenger.g0.L(10.0f) * d)), (int) ((rectF.bottom - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(9.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(133.3f)), L3);
            long b10 = this.C1.b();
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
            i6Var.t(sb2.toString(), true, true);
            i6Var.B = (int) ((1.0f - d) * 255.0f);
            i6Var.draw(canvas3);
            float f14 = 1.0f - d2;
            float f15 = (1.0f - this.f12693b1) * f14;
            Paint c10 = this.P.c(1.0f);
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
                if (this.f12712w1 == null) {
                    this.f12712w1 = new my0(id.M0(2131745316, null), 15.0f, null);
                }
                if (this.f12713x1 == null) {
                    Path path = new Path();
                    this.f12713x1 = path;
                    path.moveTo(org.telegram.messenger.g0.L(3.83f), 0.0f);
                    this.f12713x1.lineTo(0.0f, org.telegram.messenger.g0.L(5.0f));
                    this.f12713x1.lineTo(org.telegram.messenger.g0.L(3.83f), org.telegram.messenger.g0.L(f11));
                    Paint paint2 = new Paint(1);
                    this.f12714y1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f12714y1.setStrokeCap(Paint.Cap.ROUND);
                    this.f12714y1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f12714y1.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
                this.f12712w1.f36158p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - i6Var.c());
                float v = com.google.android.recaptcha.internal.a.v(1.0f, this.f12693b1, org.telegram.messenger.g0.L(6.0f) * sin, (rectF.centerX() - ((this.f12712w1.k() + org.telegram.messenger.g0.L(11.33f)) / 2.0f)) - (org.telegram.messenger.g0.T1(this.f12693b1, 1.0f, d2) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int r12 = org.telegram.ui.ActionBar.k6.r1(f12, i10);
                canvas3.save();
                canvas3.translate(v, rectF.centerY() - org.telegram.messenger.g0.L(5.0f));
                this.f12714y1.setColor(r12);
                canvas3.drawPath(this.f12713x1, this.f12714y1);
                canvas3.restore();
                str2 = null;
                f13 = 15.0f;
                this.f12712w1.c(v + org.telegram.messenger.g0.L(11.33f), rectF.centerY(), 1.0f, r12, canvas3);
            } else {
                f13 = 15.0f;
                str2 = null;
            }
            if (d2 > 0.0f) {
                if (this.f12715z1 == null) {
                    this.f12715z1 = new my0(id.M0(2131752570, str2), f13, org.telegram.messenger.g0.o());
                }
                this.f12715z1.f36158p = (int) ((rectF.width() - org.telegram.messenger.g0.L(116.0f)) - i6Var.c());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.f12715z1.k() / 2.0f));
                if (paint != null) {
                    i7 = -1;
                } else {
                    i7 = -2130706433;
                }
                canvas2 = canvas;
                this.f12715z1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.k6.r1(d2, i7), canvas2);
                this.f12709t1.set(width - org.telegram.messenger.g0.L(f10), rectF.top, this.f12715z1.k() + width + org.telegram.messenger.g0.L(f10), rectF.bottom);
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
        boolean z9;
        if (f10 <= 0.0f) {
            return;
        }
        boolean z10 = this.J1;
        org.telegram.ui.Components.w5 w5Var = this.G1;
        float d = w5Var.d(z10);
        boolean z11 = this.L1;
        org.telegram.ui.Components.w5 w5Var2 = this.I1;
        float d2 = w5Var2.d(z11);
        float e10 = this.f12702k1.e(false, this.f12701j1);
        float z12 = com.google.android.recaptcha.internal.a.z(1.0f, this.f12693b1, org.telegram.messenger.g0.L(30.0f) * e10, org.telegram.messenger.g0.L(41.0f));
        float f19 = 1.0f - d;
        float f20 = z12 * f19 * f10;
        float T1 = org.telegram.messenger.g0.T1(com.google.android.recaptcha.internal.a.v(1.0f, d2, getWidth() * 0.35f * this.f12693b1, rectF.right - org.telegram.messenger.g0.L(20.0f)), rectF.left + org.telegram.messenger.g0.L(20.0f), d);
        float L = rectF.bottom - org.telegram.messenger.g0.L(20.0f);
        boolean e11 = sc.e(360928);
        Paint paint = this.f12697f1;
        if (e11) {
            org.telegram.ui.Components.r9 r9Var = this.f12698g1;
            r9Var.f37573a = org.telegram.messenger.g0.L(47.0f);
            Paint paint2 = r9Var.d;
            f11 = 0.0f;
            r9Var.f37574b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
            f12 = d2;
            org.telegram.ui.Components.r9 r9Var2 = this.f12699h1;
            r9Var2.f37573a = org.telegram.messenger.g0.L(50.0f);
            Paint paint3 = r9Var2.d;
            f13 = f19;
            r9Var2.f37574b = (org.telegram.messenger.g0.L(12.0f) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
            r9Var2.e(e10, 1.01f);
            r9Var.e(e10, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.k6.r1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f21 = f20 / r9Var2.f37573a;
            canvas.scale(f21, f21, T1, L);
            r9Var2.a(T1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f22 = f20 / r9Var.f37573a;
            canvas.scale(f22, f22, T1, L);
            r9Var.a(T1, L, canvas, paint2);
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
        Path path = this.l1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(T1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f12700i1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f13;
        if (this.K1) {
            f14 = f10;
        } else {
            f14 = 1.0f;
        }
        int i7 = (int) (T1 - (intrinsicWidth * f14));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f13;
        if (this.K1) {
            f15 = f10;
        } else {
            f15 = 1.0f;
        }
        int i10 = (int) (L - (intrinsicHeight * f15));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f13;
        if (this.K1) {
            f16 = f10;
        } else {
            f16 = 1.0f;
        }
        int i11 = (int) ((intrinsicWidth2 * f16) + T1);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f13;
        if (this.K1) {
            f17 = f10;
        } else {
            f17 = 1.0f;
        }
        drawable.setBounds(i7, i10, i11, (int) ((intrinsicHeight2 * f17) + L));
        float f24 = f13 * 255.0f;
        if (this.K1) {
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
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(5.33f), this.f12696e1);
        }
        canvas.restore();
        float f25 = w5Var.f39805c;
        float f26 = w5Var2.f39805c;
        if (this.f12693b1 < 0.4f) {
            z9 = true;
        } else {
            z9 = false;
        }
        float A = org.telegram.messenger.k5.A(1.0f, f25, org.telegram.messenger.g0.T1(this.f12707r1.d(z9), f11, f26), f10);
        float L2 = rectF.right - org.telegram.messenger.g0.L(20.0f);
        float W1 = (org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(36.0f)) * A) / 2.0f;
        float f27 = 1.0f - f26;
        float T12 = org.telegram.messenger.g0.T1(((rectF.bottom - org.telegram.messenger.g0.L(80.0f)) - W1) - ((org.telegram.messenger.g0.L(120.0f) * this.f12694c1) * f27), rectF.bottom - org.telegram.messenger.g0.L(20.0f), 1.0f - A);
        float L3 = (org.telegram.messenger.g0.L(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f12708s1;
        rectF3.set(L2 - L3, T12 - W1, L3 + L2, W1 + T12);
        float W12 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(14.0f));
        int r12 = org.telegram.ui.ActionBar.k6.r1(A, 536870912);
        Paint paint4 = this.f12704o1;
        paint4.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), r12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, W12, W12, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.n1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, W12, W12, c10);
            Paint paint6 = this.f12363e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, W12, W12, paint6);
        }
        canvas.save();
        canvas.scale(A, A, L2, T12);
        int r13 = org.telegram.ui.ActionBar.k6.r1(A, -1);
        Paint paint7 = this.f12705p1;
        paint7.setColor(r13);
        int r14 = org.telegram.ui.ActionBar.k6.r1(A * f27, -1);
        Paint paint8 = this.f12706q1;
        paint8.setColor(r14);
        float L4 = (org.telegram.messenger.g0.L(4.0f) * f27) + T12;
        canvas.rotate(this.f12694c1 * 12.0f * f27, L2, L4);
        float W13 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(15.33f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float W14 = org.telegram.messenger.g0.W1(f26, org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(13.0f)) / 2.0f;
        float f28 = L4 - W14;
        RectF rectF4 = this.f12710u1;
        rectF4.set(L2 - W13, f28, W13 + L2, L4 + W14);
        canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(3.66f), paint7);
        if (f26 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f12694c1 * 12.0f * f27, L2, f28);
            canvas.translate(0.0f, W14 * f26);
            canvas.scale(f27, f27, L2, f28);
            Path path2 = this.f12711v1;
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
            path2.lineTo(f30, (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(0.4f, 0.0f, this.f12694c1), 1.0f, f26) * org.telegram.messenger.g0.L(3.66f)) + L6);
            paint8.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.J1) {
            ImageView imageView = this.R0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.w5 w5Var3 = this.L0;
            ImageView imageView2 = this.S0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || w5Var3.f39805c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f12374n0) * 255.0f), 31);
                Path path3 = this.f12703m1;
                path3.rewind();
                path3.addRoundRect(rectF, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || w5Var3.f39805c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || w5Var3.f39805c > 0.0f) {
                    canvas.save();
                    canvas.translate((org.telegram.messenger.g0.L(180.0f) * f13) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.X0 == null) {
            this.X0 = getContext().getDrawable(2131230878);
        }
        this.X0.setAlpha((int) (f23 * f13));
        float timelineHeight = getTimelineHeight();
        this.X0.setBounds(org.telegram.messenger.g0.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(48.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(40.0f)), (int) ((rectF.top - timelineHeight) - org.telegram.messenger.g0.L(12.0f)));
        this.X0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.Z0;
        zg0 zg0Var = qVar.h;
        qVar.f12633f = true;
        if (qVar.f12634g) {
            zg0Var.start();
        }
        zg0Var.R(qVar.f12635i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.Z0;
        qVar.f12633f = false;
        zg0 zg0Var = qVar.h;
        zg0Var.stop();
        zg0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.f12701j1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z9) {
        int i7;
        int i10;
        if (z9) {
            i7 = 2131231517;
        } else {
            i7 = 2131231516;
        }
        ImageView imageView = this.R0;
        imageView.setImageResource(i7);
        if (z9) {
            i10 = 2131754788;
        } else {
            i10 = 2131754736;
        }
        imageView.setContentDescription(id.M0(i10, null));
        this.Y0 = z9;
    }

    public void setOnPeriodUpdate(c20 c20Var) {
        this.A1 = c20Var;
    }

    public void setOnPremiumHint(c20 c20Var) {
        this.B1 = c20Var;
    }

    public void setPeriod(int i7) {
        A(i7, true);
    }

    public void setPeriodVisible(boolean z9) {
        int i7;
        this.V0 = z9;
        if (z9 && !this.f12375o0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.S0.setVisibility(i7);
    }

    @Override
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.S0.setAlpha(f11);
        this.R0.setAlpha(f11);
    }

    public final void z(boolean z9, boolean z10) {
        org.telegram.messenger.g0.r(this.O1);
        this.K1 = true;
        this.N1 = false;
        this.J0 = false;
        this.K0 = (int) ((getBounds().right - org.telegram.messenger.g0.L(20.0f)) - ((getWidth() * 0.35f) * this.f12693b1));
        invalidate();
        p pVar = this.C1;
        if (pVar != null) {
            if (!z9) {
                if (z10) {
                    pVar.f12336y = true;
                    org.telegram.messenger.g0.r(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.f12326a.getCameraSessionRecording(), false, false);
                    pVar.a(false);
                } else {
                    pVar.c();
                }
            }
            this.C1 = null;
        }
        n();
    }
}
