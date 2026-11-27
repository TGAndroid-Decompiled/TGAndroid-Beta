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
public abstract class zb1 extends qb1 {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public pkb A1;
    public pcc B1;
    public pcc C1;
    public xb1 D1;
    public float E1;
    public float F1;
    public final mm G1;
    public final mm H1;
    public final mm I1;
    public final mm J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final vb1 P1;
    public final ImageView S0;
    public final ImageView T0;
    public final pb1 U0;
    public fu5 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final yb1 a1;
    public final hn b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final gk0 h1;
    public final gk0 i1;
    public final Drawable j1;
    public float k1;
    public final mm l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final mm s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public pkb x1;
    public Path y1;
    public Paint z1;

    public zb1(Activity activity, FrameLayout frameLayout, wma wmaVar, FrameLayout frameLayout2, x53 x53Var, tl0 tl0Var) {
        super(activity, frameLayout, wmaVar, frameLayout2, x53Var, tl0Var);
        this.W0 = true;
        this.X0 = 0;
        ibb ibbVar = (ibb) this;
        this.a1 = new yb1(ibbVar, ibbVar);
        hn hnVar = new hn(false, true, true);
        this.b1 = hnVar;
        k43 k43Var = k43.f;
        hnVar.n(0.16f, 50L, k43Var);
        hnVar.w(hl.L(15.0f));
        hnVar.x(hl.o());
        hnVar.t("0:00.0", true, true);
        hnVar.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        gk0 gk0Var = new gk0(11, 360928);
        this.h1 = gk0Var;
        gk0 gk0Var2 = new gk0(12, 360928);
        this.i1 = gk0Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        gk0Var.a = hl.L(47.0f);
        gk0Var.b = hl.L(55.0f);
        gk0Var.b();
        gk0Var2.a = hl.L(47.0f);
        gk0Var2.b = hl.L(55.0f);
        gk0Var2.b();
        this.j1 = getContext().getResources().getDrawable(2131231519).mutate();
        this.l1 = new mm(new vb1(ibbVar, (byte) 0), 200L, k43Var, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        vb1 vb1Var = new vb1(ibbVar, (byte) 0);
        k43 k43Var2 = k43.h;
        this.s1 = new mm(vb1Var, 350L, k43Var2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new mm(this, 0L, 350L, k43Var2);
        this.H1 = new mm(new vb1(ibbVar, (byte) 0), 420L, k43Var2, 0);
        this.I1 = new mm(this, 0L, 350L, k43Var2);
        this.J1 = new mm(new vb1(ibbVar, (byte) 0), 350L, k43Var2, 0);
        this.P1 = new vb1(ibbVar, (byte) 1);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        imageView.setImageResource(2131231520);
        imageView.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(ob6.M0(2131754731, null));
        addView(imageView, tre.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new r81(ibbVar, (byte) 5));
        ImageView imageView2 = new ImageView(activity);
        this.T0 = imageView2;
        pb1 pb1Var = new pb1(5);
        this.U0 = pb1Var;
        imageView2.setImageDrawable(pb1Var);
        imageView2.setBackground(aob.f0(1090519039, 1, hl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(ob6.M0(2131744244, null));
        A(86400, false);
        addView(imageView2, tre.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new c0(ibbVar, frameLayout, x53Var, (byte) 13));
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
        this.U0.f(i / 3600, false, z);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = ob6.M0(2131744152, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744153, null);
            alertDialog$Builder.j(ob6.M0(2131746048, null), new tg0(this, (byte) 28));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, this.a);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return uc7.s1(this.V).l4.q1.f();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return uc7.s1(this.V).l4.r1.f();
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
            float L = rectF.left + hl.L(21.0f);
            float L2 = rectF.bottom - hl.L(20.0f);
            yb1 yb1Var = this.a1;
            yb1Var.setBounds((int) (L - hl.L(12.0f)), (int) (L2 - hl.L(12.0f)), (int) (L + hl.L(12.0f)), (int) (L2 + hl.L(12.0f)));
            yb1Var.draw(canvas3);
            int L3 = (int) ((rectF.bottom - hl.L(20.0f)) + hl.L(9.0f));
            hn hnVar = this.b1;
            hnVar.setBounds((int) ((rectF.left + hl.L(33.3f)) - (hl.L(10.0f) * d)), (int) ((rectF.bottom - hl.L(20.0f)) - hl.L(9.0f)), (int) (rectF.left + hl.L(133.3f)), L3);
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
            hnVar.t(sb.toString(), true, true);
            hnVar.C = (int) ((1.0f - d) * 255.0f);
            hnVar.draw(canvas3);
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
                    this.x1 = new pkb(ob6.M0(2131745041, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(hl.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, hl.L(5.0f));
                    this.y1.lineTo(hl.L(3.83f), hl.L(f2));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(hl.L(1.33f));
                this.x1.p = (int) ((rectF.width() - hl.L(116.0f)) - hnVar.c());
                float B = qu6.B(1.0f, this.c1, hl.L(6.0f) * sin, (rectF.centerX() - ((this.x1.j() + hl.L(11.33f)) / 2.0f)) - (hl.R1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i2 = -1;
                } else {
                    i2 = -2130706433;
                }
                int p1 = aob.p1(f3, i2);
                canvas3.save();
                canvas3.translate(B, rectF.centerY() - hl.L(5.0f));
                this.z1.setColor(p1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str2 = null;
                f4 = 15.0f;
                this.x1.c(B + hl.L(11.33f), rectF.centerY(), 1.0f, p1, canvas3);
            } else {
                f4 = 15.0f;
                str2 = null;
            }
            if (d2 > 0.0f) {
                pkb pkbVar = this.A1;
                if (pkbVar == null) {
                    pkbVar = new pkb(ob6.M0(2131752551, str2), f4, hl.o());
                    this.A1 = pkbVar;
                }
                pkbVar.p = (int) ((rectF.width() - hl.L(116.0f)) - hnVar.c());
                float width = ((rectF.width() / 4.0f) * f5) + (rectF.centerX() - (this.A1.j() / 2.0f));
                if (paint != null) {
                    i = -1;
                } else {
                    i = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, aob.p1(d2, i), canvas2);
                this.u1.set(width - hl.L(f), rectF.top, this.A1.j() + width + hl.L(f), rectF.bottom);
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
        mm mmVar = this.H1;
        float d = mmVar.d(z2);
        boolean z3 = this.M1;
        mm mmVar2 = this.J1;
        float d2 = mmVar2.d(z3);
        float e = this.l1.e(false, this.k1);
        float A = qd4.A(1.0f, this.c1, hl.L(30.0f) * e, hl.L(41.0f));
        float f10 = 1.0f - d;
        float f11 = A * f10 * f;
        float R1 = hl.R1(qu6.B(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - hl.L(20.0f)), rectF.left + hl.L(20.0f), d);
        float L = rectF.bottom - hl.L(20.0f);
        boolean e2 = i86.e(360928);
        Paint paint = this.g1;
        if (e2) {
            gk0 gk0Var = this.h1;
            gk0Var.a = hl.L(47.0f);
            Paint paint2 = gk0Var.d;
            f2 = 0.0f;
            gk0Var.b = (hl.L(15.0f) * 0.6f) + hl.L(47.0f);
            f3 = d2;
            gk0 gk0Var2 = this.i1;
            gk0Var2.a = hl.L(50.0f);
            Paint paint3 = gk0Var2.d;
            f4 = f10;
            gk0Var2.b = (hl.L(12.0f) * 0.6f) + hl.L(50.0f);
            gk0Var2.e(e, 1.01f);
            gk0Var.e(e, 1.02f);
            paint3.setColor(aob.p1(0.15f * f, paint.getColor()));
            canvas.save();
            float f12 = f11 / gk0Var2.a;
            canvas.scale(f12, f12, R1, L);
            gk0Var2.a(R1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(aob.p1(0.3f * f, paint.getColor()));
            canvas.save();
            float f13 = f11 / gk0Var.a;
            canvas.scale(f13, f13, R1, L);
            gk0Var.a(R1, L, canvas, paint2);
            canvas.restore();
        } else {
            f2 = 0.0f;
            f3 = d2;
            f4 = f10;
        }
        float min = Math.min(f11, hl.L(55.0f));
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
            float N = (hl.N(19.33f) / 2.0f) * f3 * f;
            RectF rectF2 = hl.P;
            rectF2.set(R1 - N, L - N, R1 + N, L + N);
            canvas.drawRoundRect(rectF2, hl.L(5.33f), hl.L(5.33f), this.f1);
        }
        canvas.restore();
        float f16 = mmVar.c;
        float f17 = mmVar2.c;
        if (this.c1 < 0.4f) {
            z = true;
        } else {
            z = false;
        }
        float z4 = qd4.z(1.0f, f16, hl.R1(this.s1.d(z), f2, f17), f);
        float L2 = rectF.right - hl.L(20.0f);
        float U1 = (hl.U1(f17, hl.L(50.0f), hl.L(36.0f)) * z4) / 2.0f;
        float f18 = 1.0f - f17;
        float R12 = hl.R1(((rectF.bottom - hl.L(80.0f)) - U1) - ((hl.L(120.0f) * this.d1) * f18), rectF.bottom - hl.L(20.0f), 1.0f - z4);
        float L3 = (hl.L(36.0f) * z4) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L2 - L3, R12 - U1, L3 + L2, U1 + R12);
        float U12 = hl.U1(f17, hl.L(18.0f), hl.L(14.0f));
        int p1 = aob.p1(z4, 536870912);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(0.66f), p1);
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
        int p12 = aob.p1(z4, -1);
        Paint paint7 = this.q1;
        paint7.setColor(p12);
        int p13 = aob.p1(z4 * f18, -1);
        Paint paint8 = this.r1;
        paint8.setColor(p13);
        float L4 = (hl.L(4.0f) * f18) + R12;
        canvas.rotate(this.d1 * 12.0f * f18, L2, L4);
        float U13 = hl.U1(f17, hl.L(15.33f), hl.L(13.0f)) / 2.0f;
        float U14 = hl.U1(f17, hl.L(12.66f), hl.L(13.0f)) / 2.0f;
        float f19 = L4 - U14;
        RectF rectF4 = this.v1;
        rectF4.set(L2 - U13, f19, U13 + L2, L4 + U14);
        canvas.drawRoundRect(rectF4, hl.L(3.66f), hl.L(3.66f), paint7);
        if (f17 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f18, L2, f19);
            canvas.translate(0.0f, U14 * f17);
            canvas.scale(f18, f18, L2, f19);
            Path path2 = this.w1;
            path2.rewind();
            float L5 = hl.L(4.33f);
            float L6 = f19 - hl.L(3.66f);
            float f20 = L2 + L5;
            path2.moveTo(f20, hl.L(3.66f) + L6);
            path2.lineTo(f20, L6);
            RectF rectF5 = hl.P;
            float f21 = L2 - L5;
            rectF5.set(f21, L6 - L5, f20, L5 + L6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f21, (hl.R1(hl.R1(0.4f, 0.0f, this.d1), 1.0f, f17) * hl.L(3.66f)) + L6);
            paint8.setStrokeWidth(hl.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            mm mmVar3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || mmVar3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, hl.L(21.0f), hl.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || mmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((hl.L(180.0f) * f4) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || mmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((hl.L(180.0f) * f4) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        Drawable drawable2 = this.Y0;
        if (drawable2 == null) {
            drawable2 = getContext().getDrawable(2131230878);
            this.Y0 = drawable2;
        }
        drawable2.setAlpha((int) (f14 * f4));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(hl.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - hl.L(48.0f)), (int) (rectF.left + hl.L(40.0f)), (int) ((rectF.top - timelineHeight) - hl.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yb1 yb1Var = this.a1;
        b29 b29Var = yb1Var.h;
        yb1Var.f = true;
        if (yb1Var.g) {
            b29Var.start();
        }
        b29Var.M(yb1Var.i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yb1 yb1Var = this.a1;
        yb1Var.f = false;
        b29 b29Var = yb1Var.h;
        b29Var.stop();
        b29Var.M(null);
    }

    public void setAmplitude(double d) {
        this.k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 2131231521;
        } else {
            i = 2131231520;
        }
        ImageView imageView = this.S0;
        imageView.setImageResource(i);
        if (z) {
            i2 = 2131754783;
        } else {
            i2 = 2131754731;
        }
        imageView.setContentDescription(ob6.M0(i2, null));
        this.Z0 = z;
    }

    public void setOnPeriodUpdate(pcc pccVar) {
        this.B1 = pccVar;
    }

    public void setOnPremiumHint(pcc pccVar) {
        this.C1 = pccVar;
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
        hl.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        this.K0 = false;
        this.L0 = (int) ((getBounds().right - hl.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        invalidate();
        xb1 xb1Var = this.D1;
        if (xb1Var != null) {
            if (!z) {
                if (z2) {
                    xb1Var.y = true;
                    hl.r(xb1Var.h);
                    CameraController.getInstance().stopVideoRecording(xb1Var.a.getCameraSessionRecording(), false, false);
                    xb1Var.a(false);
                } else {
                    xb1Var.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
