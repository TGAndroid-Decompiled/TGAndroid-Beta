package defpackage;

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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class rb1 extends ib1 {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public tgb A1;
    public p8c B1;
    public p8c C1;
    public pb1 D1;
    public float E1;
    public float F1;
    public final lm G1;
    public final lm H1;
    public final lm I1;
    public final lm J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final nb1 P1;
    public final ImageView S0;
    public final ImageView T0;
    public final hb1 U0;
    public cs5 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final qb1 a1;
    public final gn b1;
    public float c1;
    public float d1;
    public long e1;
    public final Paint f1;
    public final Paint g1;
    public final fk0 h1;
    public final fk0 i1;
    public final Drawable j1;
    public float k1;
    public final lm l1;
    public final Path m1;
    public final Path n1;
    public final Paint o1;
    public final Paint p1;
    public final Paint q1;
    public final Paint r1;
    public final lm s1;
    public final RectF t1;
    public final RectF u1;
    public final RectF v1;
    public final Path w1;
    public tgb x1;
    public Path y1;
    public Paint z1;

    public rb1(Context context, FrameLayout frameLayout, cja cjaVar, FrameLayout frameLayout2, f53 f53Var, sl0 sl0Var) {
        super(context, frameLayout, cjaVar, frameLayout2, f53Var, sl0Var);
        this.W0 = true;
        this.X0 = 0;
        j7b j7bVar = (j7b) this;
        this.a1 = new qb1(j7bVar, j7bVar);
        gn gnVar = new gn(false, true, true);
        this.b1 = gnVar;
        s33 s33Var = s33.f;
        gnVar.n(0.16f, 50L, s33Var);
        gnVar.w(gl.L(15.0f));
        gnVar.x(gl.o());
        gnVar.t("0:00.0", true, true);
        gnVar.u(-1);
        Paint paint = new Paint(1);
        this.f1 = paint;
        Paint paint2 = new Paint(1);
        this.g1 = paint2;
        fk0 fk0Var = new fk0(11, 360928);
        this.h1 = fk0Var;
        fk0 fk0Var2 = new fk0(12, 360928);
        this.i1 = fk0Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        fk0Var.a = gl.L(47.0f);
        fk0Var.b = gl.L(55.0f);
        fk0Var.b();
        fk0Var2.a = gl.L(47.0f);
        fk0Var2.b = gl.L(55.0f);
        fk0Var2.b();
        this.j1 = getContext().getResources().getDrawable(2131231519).mutate();
        this.l1 = new lm(new nb1(j7bVar, (byte) 0), 200L, s33Var, 0);
        this.m1 = new Path();
        this.n1 = new Path();
        this.o1 = new Paint(1);
        this.p1 = new Paint(1);
        this.q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        nb1 nb1Var = new nb1(j7bVar, (byte) 0);
        s33 s33Var2 = s33.h;
        this.s1 = new lm(nb1Var, 350L, s33Var2);
        this.t1 = new RectF();
        this.u1 = new RectF();
        this.v1 = new RectF();
        this.w1 = new Path();
        this.G1 = new lm(this, 0L, 350L, s33Var2);
        this.H1 = new lm(new nb1(j7bVar, (byte) 0), 420L, s33Var2, 0);
        this.I1 = new lm(this, 0L, 350L, s33Var2);
        this.J1 = new lm(new nb1(j7bVar, (byte) 0), 350L, s33Var2, 0);
        this.P1 = new nb1(j7bVar, (byte) 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(2131231520);
        imageView.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(k96.M0(2131754735, null));
        addView(imageView, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new x91(j7bVar, (byte) 3));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        hb1 hb1Var = new hb1(5);
        this.U0 = hb1Var;
        imageView2.setImageDrawable(hb1Var);
        imageView2.setBackground(bkb.f0(1090519039, 1, gl.L(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(k96.M0(2131744350, null));
        A(86400, false);
        addView(imageView2, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new b0(j7bVar, frameLayout, f53Var, (byte) 13));
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
            String M0 = k96.M0(2131744258, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744259, null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new sg0(this, (byte) 26));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            TextView textView = (TextView) alertDialog$Builder.o().c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, this.a);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return na7.q1(this.V).k4.i1.f();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return na7.q1(this.V).k4.j1.f();
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
            float L = rectF.left + gl.L(21.0f);
            float L2 = rectF.bottom - gl.L(20.0f);
            qb1 qb1Var = this.a1;
            qb1Var.setBounds((int) (L - gl.L(12.0f)), (int) (L2 - gl.L(12.0f)), (int) (L + gl.L(12.0f)), (int) (L2 + gl.L(12.0f)));
            qb1Var.draw(canvas3);
            int L3 = (int) ((rectF.bottom - gl.L(20.0f)) + gl.L(9.0f));
            gn gnVar = this.b1;
            gnVar.setBounds((int) ((rectF.left + gl.L(33.3f)) - (gl.L(10.0f) * d)), (int) ((rectF.bottom - gl.L(20.0f)) - gl.L(9.0f)), (int) (rectF.left + gl.L(133.3f)), L3);
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
            gnVar.t(sb.toString(), true, true);
            gnVar.C = (int) ((1.0f - d) * 255.0f);
            gnVar.draw(canvas3);
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
                    this.x1 = new tgb(k96.M0(2131745121, null), 15.0f, null);
                }
                if (this.y1 == null) {
                    Path path = new Path();
                    this.y1 = path;
                    path.moveTo(gl.L(3.83f), 0.0f);
                    this.y1.lineTo(0.0f, gl.L(5.0f));
                    this.y1.lineTo(gl.L(3.83f), gl.L(f2));
                    Paint paint2 = new Paint(1);
                    this.z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.z1.setStrokeCap(Paint.Cap.ROUND);
                    this.z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.z1.setStrokeWidth(gl.L(1.33f));
                this.x1.p = (int) ((rectF.width() - gl.L(116.0f)) - gnVar.c());
                float B = ls6.B(1.0f, this.c1, gl.L(6.0f) * sin, (rectF.centerX() - ((this.x1.j() + gl.L(11.33f)) / 2.0f)) - (gl.R1(this.c1, 1.0f, d2) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i2 = -1;
                } else {
                    i2 = -2130706433;
                }
                int p1 = bkb.p1(f3, i2);
                canvas3.save();
                canvas3.translate(B, rectF.centerY() - gl.L(5.0f));
                this.z1.setColor(p1);
                canvas3.drawPath(this.y1, this.z1);
                canvas3.restore();
                str2 = null;
                f4 = 15.0f;
                this.x1.c(B + gl.L(11.33f), rectF.centerY(), 1.0f, p1, canvas3);
            } else {
                f4 = 15.0f;
                str2 = null;
            }
            if (d2 > 0.0f) {
                tgb tgbVar = this.A1;
                if (tgbVar == null) {
                    tgbVar = new tgb(k96.M0(2131752558, str2), f4, gl.o());
                    this.A1 = tgbVar;
                }
                tgbVar.p = (int) ((rectF.width() - gl.L(116.0f)) - gnVar.c());
                float width = ((rectF.width() / 4.0f) * f5) + (rectF.centerX() - (this.A1.j() / 2.0f));
                if (paint != null) {
                    i = -1;
                } else {
                    i = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, bkb.p1(d2, i), canvas2);
                this.u1.set(width - gl.L(f), rectF.top, this.A1.j() + width + gl.L(f), rectF.bottom);
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
        lm lmVar = this.H1;
        float d = lmVar.d(z2);
        boolean z3 = this.M1;
        lm lmVar2 = this.J1;
        float d2 = lmVar2.d(z3);
        float e = this.l1.e(false, this.k1);
        float A = tb4.A(1.0f, this.c1, gl.L(30.0f) * e, gl.L(41.0f));
        float f10 = 1.0f - d;
        float f11 = A * f10 * f;
        float R1 = gl.R1(ls6.B(1.0f, d2, getWidth() * 0.35f * this.c1, rectF.right - gl.L(20.0f)), rectF.left + gl.L(20.0f), d);
        float L = rectF.bottom - gl.L(20.0f);
        boolean e2 = e66.e(360928);
        Paint paint = this.g1;
        if (e2) {
            fk0 fk0Var = this.h1;
            fk0Var.a = gl.L(47.0f);
            Paint paint2 = fk0Var.d;
            f2 = 0.0f;
            fk0Var.b = (gl.L(15.0f) * 0.6f) + gl.L(47.0f);
            f3 = d2;
            fk0 fk0Var2 = this.i1;
            fk0Var2.a = gl.L(50.0f);
            Paint paint3 = fk0Var2.d;
            f4 = f10;
            fk0Var2.b = (gl.L(12.0f) * 0.6f) + gl.L(50.0f);
            fk0Var2.e(e, 1.01f);
            fk0Var.e(e, 1.02f);
            paint3.setColor(bkb.p1(0.15f * f, paint.getColor()));
            canvas.save();
            float f12 = f11 / fk0Var2.a;
            canvas.scale(f12, f12, R1, L);
            fk0Var2.a(R1, L, canvas, paint3);
            canvas.restore();
            paint2.setColor(bkb.p1(0.3f * f, paint.getColor()));
            canvas.save();
            float f13 = f11 / fk0Var.a;
            canvas.scale(f13, f13, R1, L);
            fk0Var.a(R1, L, canvas, paint2);
            canvas.restore();
        } else {
            f2 = 0.0f;
            f3 = d2;
            f4 = f10;
        }
        float min = Math.min(f11, gl.L(55.0f));
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
            float N = (gl.N(19.33f) / 2.0f) * f3 * f;
            RectF rectF2 = gl.P;
            rectF2.set(R1 - N, L - N, R1 + N, L + N);
            canvas.drawRoundRect(rectF2, gl.L(5.33f), gl.L(5.33f), this.f1);
        }
        canvas.restore();
        float f16 = lmVar.c;
        float f17 = lmVar2.c;
        if (this.c1 < 0.4f) {
            z = true;
        } else {
            z = false;
        }
        float z4 = tb4.z(1.0f, f16, gl.R1(this.s1.d(z), f2, f17), f);
        float L2 = rectF.right - gl.L(20.0f);
        float U1 = (gl.U1(f17, gl.L(50.0f), gl.L(36.0f)) * z4) / 2.0f;
        float f18 = 1.0f - f17;
        float R12 = gl.R1(((rectF.bottom - gl.L(80.0f)) - U1) - ((gl.L(120.0f) * this.d1) * f18), rectF.bottom - gl.L(20.0f), 1.0f - z4);
        float L3 = (gl.L(36.0f) * z4) / 2.0f;
        RectF rectF3 = this.t1;
        rectF3.set(L2 - L3, R12 - U1, L3 + L2, U1 + R12);
        float U12 = gl.U1(f17, gl.L(18.0f), gl.L(14.0f));
        int p1 = bkb.p1(z4, 536870912);
        Paint paint4 = this.p1;
        paint4.setShadowLayer(gl.L(1.0f), 0.0f, gl.L(0.66f), p1);
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
        int p12 = bkb.p1(z4, -1);
        Paint paint7 = this.q1;
        paint7.setColor(p12);
        int p13 = bkb.p1(z4 * f18, -1);
        Paint paint8 = this.r1;
        paint8.setColor(p13);
        float L4 = (gl.L(4.0f) * f18) + R12;
        canvas.rotate(this.d1 * 12.0f * f18, L2, L4);
        float U13 = gl.U1(f17, gl.L(15.33f), gl.L(13.0f)) / 2.0f;
        float U14 = gl.U1(f17, gl.L(12.66f), gl.L(13.0f)) / 2.0f;
        float f19 = L4 - U14;
        RectF rectF4 = this.v1;
        rectF4.set(L2 - U13, f19, U13 + L2, L4 + U14);
        canvas.drawRoundRect(rectF4, gl.L(3.66f), gl.L(3.66f), paint7);
        if (f17 < 1.0f) {
            canvas.save();
            canvas.rotate(this.d1 * 12.0f * f18, L2, f19);
            canvas.translate(0.0f, U14 * f17);
            canvas.scale(f18, f18, L2, f19);
            Path path2 = this.w1;
            path2.rewind();
            float L5 = gl.L(4.33f);
            float L6 = f19 - gl.L(3.66f);
            float f20 = L2 + L5;
            path2.moveTo(f20, gl.L(3.66f) + L6);
            path2.lineTo(f20, L6);
            RectF rectF5 = gl.P;
            float f21 = L2 - L5;
            rectF5.set(f21, L6 - L5, f20, L5 + L6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f21, (gl.R1(gl.R1(0.4f, 0.0f, this.d1), 1.0f, f17) * gl.L(3.66f)) + L6);
            paint8.setStrokeWidth(gl.L(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            lm lmVar3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || lmVar3.c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.o0) * 255.0f), 31);
                Path path3 = this.n1;
                path3.rewind();
                path3.addRoundRect(rectF, gl.L(21.0f), gl.L(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || lmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gl.L(180.0f) * f4) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || lmVar3.c > 0.0f) {
                    canvas.save();
                    canvas.translate((gl.L(180.0f) * f4) + imageView2.getX(), imageView2.getY());
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
        this.Y0.setBounds(gl.L(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - gl.L(48.0f)), (int) (rectF.left + gl.L(40.0f)), (int) ((rectF.top - timelineHeight) - gl.L(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qb1 qb1Var = this.a1;
        oy8 oy8Var = qb1Var.h;
        qb1Var.f = true;
        if (qb1Var.g) {
            oy8Var.start();
        }
        oy8Var.M(qb1Var.i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qb1 qb1Var = this.a1;
        qb1Var.f = false;
        oy8 oy8Var = qb1Var.h;
        oy8Var.stop();
        oy8Var.M(null);
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
            i2 = 2131754787;
        } else {
            i2 = 2131754735;
        }
        imageView.setContentDescription(k96.M0(i2, null));
        this.Z0 = z;
    }

    public void setOnPeriodUpdate(p8c p8cVar) {
        this.B1 = p8cVar;
    }

    public void setOnPremiumHint(p8c p8cVar) {
        this.C1 = p8cVar;
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
        gl.r(this.P1);
        this.L1 = true;
        this.O1 = false;
        this.K0 = false;
        this.L0 = (int) ((getBounds().right - gl.L(20.0f)) - ((getWidth() * 0.35f) * this.c1));
        invalidate();
        pb1 pb1Var = this.D1;
        if (pb1Var != null) {
            if (!z) {
                if (z2) {
                    pb1Var.y = true;
                    gl.r(pb1Var.h);
                    CameraController.getInstance().stopVideoRecording(pb1Var.a.getCameraSessionRecording(), false, false);
                    pb1Var.a(false);
                } else {
                    pb1Var.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
