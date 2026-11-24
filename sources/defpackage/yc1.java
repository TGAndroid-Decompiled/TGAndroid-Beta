package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class yc1 extends pc1 {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public uib A1;
    public qac B1;
    public qac C1;
    public wc1 D1;
    public float E1;
    public float F1;
    public final ln G1;
    public final ln H1;
    public final ln I1;
    public final ln J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final uc1 P1;
    public final ImageView S0;
    public final ImageView T0;
    public final oc1 U0;
    public bu5 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final xc1 a1;
    public final ho b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final fl0 h1;
    public final fl0 i1;
    public final Drawable j1;
    public float k1;
    public final ln l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final ln s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public uib x1;
    public Path y1;
    public Paint z1;

    public yc1(Activity activity, FrameLayout frameLayout, ela elaVar, FrameLayout frameLayout2, r63 r63Var, sm0 sm0Var) {
        super(activity, frameLayout, elaVar, frameLayout2, r63Var, sm0Var);
        this.W0 = true;
        this.X0 = 0;
        l9b l9bVar = (l9b) this;
        this.a1 = new xc1(l9bVar, l9bVar);
        ho hoVar = new ho(false, true, true);
        this.b1 = hoVar;
        d53 d53Var = d53.f;
        hoVar.n(0.16f, 50L, d53Var);
        hoVar.w(gm.L(15.0f));
        hoVar.x(gm.o());
        hoVar.t("0:00.0", true, true);
        hoVar.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        fl0 fl0Var = new fl0(11, 360928);
        this.h1 = fl0Var;
        fl0 fl0Var2 = new fl0(12, 360928);
        this.i1 = fl0Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        fl0Var.a = gm.L(47.0f);
        fl0Var.b = gm.L(55.0f);
        fl0Var.b();
        fl0Var2.a = gm.L(47.0f);
        fl0Var2.b = gm.L(55.0f);
        fl0Var2.b();
        this.j1 = getContext().getResources().getDrawable(2131231520).mutate();
        this.l1 = new ln(new uc1(l9bVar, (byte) 0), 200L, d53Var, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        uc1 uc1Var = new uc1(l9bVar, (byte) 0);
        d53 d53Var2 = d53.h;
        this.s1 = new ln(uc1Var, 350L, d53Var2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new ln(this, 0L, 350L, d53Var2);
        this.H1 = new ln(new uc1(l9bVar, (byte) 0), 420L, d53Var2, 0);
        this.I1 = new ln(this, 0L, 350L, d53Var2);
        this.J1 = new ln(new uc1(l9bVar, (byte) 0), 350L, d53Var2, 0);
        this.P1 = new uc1(l9bVar, (byte) 1);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        imageView.setImageResource(2131231521);
        imageView.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(jb6.M0(2131754735, null));
        addView(imageView, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new k81(l9bVar, (byte) 6));
        ImageView imageView2 = new ImageView(activity);
        this.T0 = imageView2;
        oc1 oc1Var = new oc1(5);
        this.U0 = oc1Var;
        imageView2.setImageDrawable(oc1Var);
        imageView2.setBackground(cmb.f0(1090519039, 1, gm.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(jb6.M0(2131744276, null));
        A(86400, false);
        addView(imageView2, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new b0(l9bVar, frameLayout, r63Var, (byte) 13));
    }

    public final void A(int i, boolean z) {
        int i2 = 0;
        while (true) {
            if (i2 < 4) {
                if (Q1[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = 2;
                break;
            }
        }
        if (this.X0 == i2) {
            return;
        }
        this.X0 = i2;
        this.U0.d(i / 3600, false, z);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = jb6.M0(2131744184, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744185, null);
            alertDialog$Builder.j(jb6.M0(2131746054, null), new xg0(this, (byte) 29));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, this.a);
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z) {
        int i;
        int i2 = 0;
        if (!z && this.W0) {
            i = 0;
        } else {
            i = 8;
        }
        ImageView imageView = this.T0;
        imageView.setVisibility(i);
        if (z) {
            i2 = 8;
        }
        this.S0.setVisibility(i2);
        if (z) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z) {
        int i;
        if (!z) {
            if (this.W0) {
                i = 0;
            } else {
                i = 8;
            }
            this.T0.setVisibility(i);
            this.S0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return oc7.r1(this.V).l4.i1.f();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return oc7.r1(this.V).l4.j1.f();
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f;
        float f2;
        float f3;
        Paint paint;
        float f4;
        String str2;
        Canvas canvas2;
        int i;
        int i2;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float d = this.G1.d(this.K1);
            float d2 = this.I1.d(this.M1);
            if (this.e1 <= 0) {
                this.e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float L = rectF.left + gm.L(21.0f);
            float L2 = rectF.bottom - gm.L(20.0f);
            xc1 xc1Var = this.a1;
            xc1Var.setBounds((int) (L - gm.L(12.0f)), (int) (L2 - gm.L(12.0f)), (int) (L + gm.L(12.0f)), (int) (L2 + gm.L(12.0f)));
            xc1Var.draw(canvas3);
            int L3 = (int) ((rectF.bottom - gm.L(20.0f)) + gm.L(9.0f));
            ho hoVar = this.b1;
            hoVar.setBounds((int) ((rectF.left + gm.L(33.3f)) - (gm.L(10.0f) * d)), (int) ((rectF.bottom - gm.L(20.0f)) - gm.L(9.0f)), (int) (rectF.left + gm.L(133.3f)), L3);
            long b = this.D1.b();
            int i3 = (int) (b / 1000);
            int i4 = (int) ((b - (i3 * 1000)) / 100);
            int i5 = i3 / 60;
            int i6 = i3 % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(i5);
            sb.append(":");
            if (i6 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(i6);
            sb.append(".");
            sb.append(i4);
            hoVar.t(sb.toString(), true, true);
            hoVar.C = (int) ((1.0f - d) * 255.0f);
            hoVar.draw(canvas3);
            float f5 = 1.0f - d2;
            float f6 = (1.0f - this.c1) * f5;
            Paint c = this.Q.c(1.0f);
            if (c != null) {
                f2 = 10.0f;
                paint = c;
                f = 12.0f;
                f3 = f6;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f = 12.0f;
                f2 = 10.0f;
                f3 = f6;
                paint = c;
            }
            if (f3 > 0.0f) {
                if (this.x1 == null) {
                    this.x1 = new uib(jb6.M0(2131745047, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(gm.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, gm.L(5.0f));
                    this.y1.lineTo(gm.L(3.83f), gm.L(f2));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(gm.L(1.33f));
                this.x1.p = (int) ((rectF.width() - gm.L(116.0f)) - hoVar.c());
                float B = kt6.B(1.0f, this.c1, gm.L(6.0f) * sin, (rectF.centerX() - ((this.x1.j() + gm.L(11.33f)) / 2.0f)) - (gm.R1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i2 = -1;
                } else {
                    i2 = -2130706433;
                }
                int p1 = cmb.p1(f3, i2);
                canvas3.save();
                canvas3.translate(B, rectF.centerY() - gm.L(5.0f));
                this.z1.setColor(p1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str2 = null;
                f4 = 15.0f;
                this.x1.c(B + gm.L(11.33f), rectF.centerY(), 1.0f, p1, canvas3);
            } else {
                f4 = 15.0f;
                str2 = null;
            }
            if (d2 > 0.0f) {
                uib uibVar = this.A1;
                if (uibVar == null) {
                    uibVar = new uib(jb6.M0(2131752523, str2), f4, gm.o());
                    this.A1 = uibVar;
                }
                uibVar.p = (int) ((rectF.width() - gm.L(116.0f)) - hoVar.c());
                float width = ((rectF.width() / 4.0f) * f5) + (rectF.centerX() - (this.A1.j() / 2.0f));
                if (paint != null) {
                    i = -1;
                } else {
                    i = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, cmb.p1(d2, i), canvas2);
                this.u1.set(width - gm.L(f), rectF.top, this.A1.j() + width + gm.L(f), rectF.bottom);
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
    public final void k(Canvas canvas, RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z;
        if (f <= 0.0f) {
            return;
        }
        boolean z2 = this.K1;
        ln lnVar = this.H1;
        float d = lnVar.d(z2);
        boolean z3 = this.M1;
        ln lnVar2 = this.J1;
        float d2 = lnVar2.d(z3);
        float e = this.l1.e(false, this.k1);
        float A = td4.A(1.0f, this.c1, gm.L(30.0f) * e, gm.L(41.0f));
        float f10 = 1.0f - d;
        float f11 = A * f10 * f;
        float R1 = gm.R1(kt6.B(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - gm.L(20.0f)), rectF.left + gm.L(20.0f), d);
        float L = rectF.bottom - gm.L(20.0f);
        boolean e2 = e86.e(360928);
        Paint paint = this.g1;
        if (e2) {
            fl0 fl0Var = this.h1;
            fl0Var.a = gm.L(47.0f);
            Paint paint2 = fl0Var.d;
            f2 = 0.0f;
            fl0Var.b = (gm.L(15.0f) * 0.6f) + gm.L(47.0f);
            f3 = d2;
            fl0 fl0Var2 = this.i1;
            fl0Var2.a = gm.L(50.0f);
            Paint paint3 = fl0Var2.d;
            f4 = f10;
            fl0Var2.b = (gm.L(12.0f) * 0.6f) + gm.L(50.0f);
            fl0Var2.e(e, 1.01f);
            fl0Var.e(e, 1.02f);
            paint3.setColor(cmb.p1(0.15f * f, paint.getColor()));
            canvas.save();
            float f12 = f11 / fl0Var2.a;
            canvas.scale(f12, f12, R1, L);
            fl0Var2.a(R1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(cmb.p1(0.3f * f, paint.getColor()));
            canvas.save();
            float f13 = f11 / fl0Var.a;
            canvas.scale(f13, f13, R1, L);
            fl0Var.a(R1, L, canvas, paint2);
            canvas.restore();
        } else {
            f2 = 0.0f;
            f3 = d2;
            f4 = f10;
        }
        float min = Math.min(f11, gm.L(55.0f));
        float f14 = f * 255.0f;
        paint.setAlpha((int) f14);
        canvas.drawCircle(R1, L, min, paint);
        canvas.save();
        Path path = this.m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(R1, L, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.j1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f4;
        if (this.L1) {
            f5 = f;
        } else {
            f5 = 1.0f;
        }
        int i = (int) (R1 - (intrinsicWidth * f5));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f4;
        if (this.L1) {
            f6 = f;
        } else {
            f6 = 1.0f;
        }
        int i2 = (int) (L - (intrinsicHeight * f6));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f4;
        if (this.L1) {
            f7 = f;
        } else {
            f7 = 1.0f;
        }
        int i3 = (int) ((intrinsicWidth2 * f7) + R1);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f4;
        if (this.L1) {
            f8 = f;
        } else {
            f8 = 1.0f;
        }
        drawable.setBounds(i, i2, i3, (int) ((intrinsicHeight2 * f8) + L));
        float f15 = f4 * 255.0f;
        if (this.L1) {
            f9 = f;
        } else {
            f9 = 1.0f;
        }
        drawable.setAlpha((int) (f15 * f9));
        drawable.draw(canvas);
        if (f3 > f2) {
            float N = (gm.N(19.33f) / 2.0f) * f3 * f;
            RectF rectF2 = gm.P;
            rectF2.set(R1 - N, L - N, R1 + N, L + N);
            canvas.drawRoundRect(rectF2, gm.L(5.33f), gm.L(5.33f), this.f1);
        }
        canvas.restore();
        float f16 = lnVar.c;
        float f17 = lnVar2.c;
        if (this.c1 < 0.4f) {
            z = true;
        } else {
            z = false;
        }
        float z4 = td4.z(1.0f, f16, gm.R1(this.s1.d(z), f2, f17), f);
        float L2 = rectF.right - gm.L(20.0f);
        float U1 = (gm.U1(f17, gm.L(50.0f), gm.L(36.0f)) * z4) / 2.0f;
        float f18 = 1.0f - f17;
        float R12 = gm.R1(((rectF.bottom - gm.L(80.0f)) - U1) - ((gm.L(120.0f) * this.d1) * f18), rectF.bottom - gm.L(20.0f), 1.0f - z4);
        float L3 = (gm.L(36.0f) * z4) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L2 - L3, R12 - U1, L3 + L2, U1 + R12);
        float U12 = gm.U1(f17, gm.L(18.0f), gm.L(14.0f));
        int p1 = cmb.p1(z4, 536870912);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(gm.L(1.0f), 0.0f, gm.L(0.66f), p1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, U12, U12, paint4);
        Paint c = this.S.c(z4);
        if (c == null) {
            Paint paint5 = this.o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * z4));
            canvas.drawRoundRect(rectF3, U12, U12, paint5);
        } else {
            canvas.drawRoundRect(rectF3, U12, U12, c);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * z4));
            canvas.drawRoundRect(rectF3, U12, U12, paint6);
        }
        canvas.save();
        canvas.scale(z4, z4, L2, R12);
        int p12 = cmb.p1(z4, -1);
        Paint paint7 = this.q1;
        paint7.setColor(p12);
        int p13 = cmb.p1(z4 * f18, -1);
        Paint paint8 = this.r1;
        paint8.setColor(p13);
        float L4 = (gm.L(4.0f) * f18) + R12;
        canvas.rotate(this.d1 * 12.0f * f18, L2, L4);
        float U13 = gm.U1(f17, gm.L(15.33f), gm.L(13.0f)) / 2.0f;
        float U14 = gm.U1(f17, gm.L(12.66f), gm.L(13.0f)) / 2.0f;
        float f19 = L4 - U14;
        RectF rectF4 = this.v1;
        rectF4.set(L2 - U13, f19, U13 + L2, L4 + U14);
        canvas.drawRoundRect(rectF4, gm.L(3.66f), gm.L(3.66f), paint7);
        if (f17 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f18, L2, f19);
            canvas.translate(0.0f, U14 * f17);
            canvas.scale(f18, f18, L2, f19);
            Path path2 = this.w1;
            path2.rewind();
            float L5 = gm.L(4.33f);
            float L6 = f19 - gm.L(3.66f);
            float f20 = L2 + L5;
            path2.moveTo(f20, gm.L(3.66f) + L6);
            path2.lineTo(f20, L6);
            RectF rectF5 = gm.P;
            float f21 = L2 - L5;
            rectF5.set(f21, L6 - L5, f20, L5 + L6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f21, (gm.R1(gm.R1(0.4f, 0.0f, this.d1), 1.0f, f17) * gm.L(3.66f)) + L6);
            paint8.setStrokeWidth(gm.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            ln lnVar3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || lnVar3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, gm.L(21.0f), gm.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || lnVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gm.L(180.0f) * f4) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || lnVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gm.L(180.0f) * f4) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        Drawable drawable2 = this.Y0;
        if (drawable2 == null) {
            drawable2 = getContext().getDrawable(2131230879);
            this.Y0 = drawable2;
        }
        drawable2.setAlpha((int) (f14 * f4));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(gm.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - gm.L(48.0f)), (int) (rectF.left + gm.L(40.0f)), (int) ((rectF.top - timelineHeight) - gm.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xc1 xc1Var = this.a1;
        p09 p09Var = xc1Var.h;
        xc1Var.f = true;
        if (xc1Var.g) {
            p09Var.start();
        }
        p09Var.M(xc1Var.i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xc1 xc1Var = this.a1;
        xc1Var.f = false;
        p09 p09Var = xc1Var.h;
        p09Var.stop();
        p09Var.M(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 2131231522;
        } else {
            i = 2131231521;
        }
        ImageView imageView = this.S0;
        imageView.setImageResource(i);
        if (z) {
            i2 = 2131754787;
        } else {
            i2 = 2131754735;
        }
        imageView.setContentDescription(jb6.M0(i2, null));
        this.Z0 = z;
    }

    public void setOnPeriodUpdate(qac qacVar) {
        this.B1 = qacVar;
    }

    public void setOnPremiumHint(qac qacVar) {
        this.C1 = qacVar;
    }

    public void setPeriod(int i) {
        A(i, true);
    }

    public void setPeriodVisible(boolean z) {
        int i;
        this.W0 = z;
        if (z && !this.p0) {
            i = 0;
        } else {
            i = 8;
        }
        this.T0.setVisibility(i);
    }

    @Override
    public final void u(float f) {
        float f2 = 1.0f - f;
        this.T0.setAlpha(f2);
        this.S0.setAlpha(f2);
    }

    public final void z(boolean z, boolean z2) {
        gm.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        this.K0 = false;
        this.L0 = (int) ((getBounds().right - gm.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        invalidate();
        wc1 wc1Var = this.D1;
        if (wc1Var != null) {
            if (!z) {
                if (z2) {
                    wc1Var.y = true;
                    gm.r(wc1Var.h);
                    CameraController.getInstance().stopVideoRecording(wc1Var.a.getCameraSessionRecording(), false, false);
                    wc1Var.a(false);
                } else {
                    wc1Var.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
