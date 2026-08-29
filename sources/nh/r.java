package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;
public abstract class r extends m {
    public static final int[] M1 = {21600, 43200, 86400, 172800};
    public float A1;
    public float B1;
    public final org.telegram.ui.Components.d6 C1;
    public final org.telegram.ui.Components.d6 D1;
    public final org.telegram.ui.Components.d6 E1;
    public final org.telegram.ui.Components.d6 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final n L1;
    public final ImageView O0;
    public final ImageView P0;
    public final l Q0;
    public j70 R0;
    public boolean S0;
    public int T0;
    public Drawable U0;
    public boolean V0;
    public final q W0;
    public final org.telegram.ui.Components.n6 X0;
    public float Y0;
    public float Z0;
    public long f18470a1;
    public final Paint f18471b1;
    public final Paint f18472c1;
    public final org.telegram.ui.Components.y9 f18473d1;
    public final org.telegram.ui.Components.y9 f18474e1;
    public final Drawable f18475f1;
    public float f18476g1;
    public final org.telegram.ui.Components.d6 f18477h1;
    public final Path f18478i1;
    public final Path f18479j1;
    public final Paint f18480k1;
    public final Paint l1;
    public final Paint f18481m1;
    public final Paint f18482n1;
    public final org.telegram.ui.Components.d6 f18483o1;
    public final RectF f18484p1;
    public final RectF f18485q1;
    public final RectF f18486r1;
    public final Path f18487s1;
    public zz0 f18488t1;
    public Path f18489u1;
    public Paint f18490v1;
    public zz0 f18491w1;
    public Utilities.Callback f18492x1;
    public Utilities.Callback f18493y1;
    public p f18494z1;

    public r(Context context, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(context, frameLayout, hv0Var, frameLayout2, bVar, gaVar);
        this.S0 = true;
        this.T0 = 0;
        wa waVar = (wa) this;
        this.W0 = new q(waVar, waVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.X0 = n6Var;
        jr jrVar = jr.f29800f;
        n6Var.k(0.16f, 50L, jrVar);
        n6Var.t(AndroidUtilities.dp(15.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.q("0:00.0", true, true);
        n6Var.r(-1);
        Paint paint = new Paint(1);
        this.f18471b1 = paint;
        Paint paint2 = new Paint(1);
        this.f18472c1 = paint2;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(11, 360928);
        this.f18473d1 = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(12, 360928);
        this.f18474e1 = y9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        y9Var.f34975a = AndroidUtilities.dp(47.0f);
        y9Var.f34976b = AndroidUtilities.dp(55.0f);
        y9Var.b();
        y9Var2.f34975a = AndroidUtilities.dp(47.0f);
        y9Var2.f34976b = AndroidUtilities.dp(55.0f);
        y9Var2.b();
        this.f18475f1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.f18477h1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 200L, jrVar, 0);
        this.f18478i1 = new Path();
        this.f18479j1 = new Path();
        this.f18480k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.f18481m1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f18482n1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(waVar, 0);
        jr jrVar2 = jr.h;
        this.f18483o1 = new org.telegram.ui.Components.d6(nVar, 350L, jrVar2);
        this.f18484p1 = new RectF();
        this.f18485q1 = new RectF();
        this.f18486r1 = new RectF();
        this.f18487s1 = new Path();
        this.C1 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar2);
        this.D1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 420L, jrVar2, 0);
        this.E1 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar2);
        this.F1 = new org.telegram.ui.Components.d6(new n(waVar, 0), 350L, jrVar2, 0);
        this.L1 = new n(waVar, 1);
        ImageView imageView = new ImageView(context);
        this.O0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new mh.n(waVar, 2));
        ImageView imageView2 = new ImageView(context);
        this.P0 = imageView2;
        l lVar = new l(5);
        this.Q0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, i7.f6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new bg.q(waVar, frameLayout, bVar, 14));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 < 4) {
                if (M1[i11] == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = 2;
                break;
            }
        }
        if (this.T0 == i11) {
            return;
        }
        this.T0 = i11;
        this.Q0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.V0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f18067a);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new l4.s0(this, 12));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, this.f18067a));
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        int i11 = 0;
        if (!z10 && this.S0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.P0;
        imageView.setVisibility(i10);
        if (z10) {
            i11 = 8;
        }
        this.O0.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        if (!z10) {
            if (this.S0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.P0.setVisibility(i10);
            this.O0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.r.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitDefault;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f9;
        Paint paint;
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        int i10;
        Canvas canvas3 = canvas;
        if (this.f18494z1 != null) {
            float e10 = this.C1.e(this.G1);
            float e11 = this.E1.e(this.I1);
            if (this.f18470a1 <= 0) {
                this.f18470a1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f18470a1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            q qVar = this.W0;
            qVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            qVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.n6 n6Var = this.X0;
            n6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e10)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
            long b10 = this.f18494z1.b();
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
            n6Var.q(sb2.toString(), true, true);
            n6Var.f30880w = (int) ((1.0f - e10) * 255.0f);
            n6Var.draw(canvas3);
            float f14 = 1.0f - e11;
            float f15 = (1.0f - this.Y0) * f14;
            Paint c3 = this.L.c(1.0f);
            if (c3 != null) {
                f9 = f15;
                paint = c3;
                f10 = 10.0f;
                f11 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f9 = f15;
                paint = c3;
                f10 = 10.0f;
                f11 = 12.0f;
            }
            int i15 = -2130706433;
            if (f9 > 0.0f) {
                if (this.f18488t1 == null) {
                    this.f18488t1 = new zz0(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f18489u1 == null) {
                    Path path = new Path();
                    this.f18489u1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f18489u1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f18489u1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.f18490v1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f18490v1.setStrokeCap(Paint.Cap.ROUND);
                    this.f18490v1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f18490v1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f18488t1.f35473p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float centerX = (rectF.centerX() - ((this.f18488t1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Y0, 1.0f, e11) * (rectF.width() / 6.0f));
                float b11 = th.b(1.0f, this.Y0, AndroidUtilities.dp(6.0f) * sin, centerX);
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int l1 = org.telegram.ui.ActionBar.g6.l1(f9, i10);
                canvas3.save();
                canvas3.translate(b11, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f18490v1.setColor(l1);
                canvas3.drawPath(this.f18489u1, this.f18490v1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.f18488t1.c(b11 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (e11 > f13) {
                if (this.f18491w1 == null) {
                    this.f18491w1 = new zz0(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.f18491w1.f35473p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.f18491w1.l() / 2.0f));
                if (paint != null) {
                    i15 = -1;
                }
                canvas2 = canvas;
                this.f18491w1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.g6.l1(e11, i15), canvas2);
                this.f18485q1.set(width - AndroidUtilities.dp(f11), rectF.top, this.f18491w1.l() + width + AndroidUtilities.dp(f11), rectF.bottom);
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
    public final void k(Canvas canvas, RectF rectF, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        if (f9 <= 0.0f) {
            return;
        }
        boolean z11 = this.G1;
        org.telegram.ui.Components.d6 d6Var = this.D1;
        float e10 = d6Var.e(z11);
        boolean z12 = this.I1;
        org.telegram.ui.Components.d6 d6Var2 = this.F1;
        float e11 = d6Var2.e(z12);
        float d = this.f18477h1.d(this.f18476g1, false);
        float z13 = com.google.android.recaptcha.internal.a.z(1.0f, this.Y0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f18 = 1.0f - e10;
        float f19 = z13 * f18 * f9;
        float lerp = AndroidUtilities.lerp(th.b(1.0f, e11, getWidth() * 0.35f * this.Y0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e10);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f18472c1;
        if (isEnabled) {
            org.telegram.ui.Components.y9 y9Var = this.f18473d1;
            y9Var.f34975a = AndroidUtilities.dp(47.0f);
            Paint paint2 = y9Var.d;
            f12 = 0.0f;
            y9Var.f34976b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f10 = e11;
            org.telegram.ui.Components.y9 y9Var2 = this.f18474e1;
            y9Var2.f34975a = AndroidUtilities.dp(50.0f);
            Paint paint3 = y9Var2.d;
            f11 = f18;
            y9Var2.f34976b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            y9Var2.e(d, 1.01f);
            y9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f * f9, paint.getColor()));
            canvas.save();
            float f20 = f19 / y9Var2.f34975a;
            canvas.scale(f20, f20, lerp, dp);
            y9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f * f9, paint.getColor()));
            canvas.save();
            float f21 = f19 / y9Var.f34975a;
            canvas.scale(f21, f21, lerp, dp);
            y9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = e11;
            f11 = f18;
            f12 = 0.0f;
        }
        float min = Math.min(f19, AndroidUtilities.dp(55.0f));
        float f22 = f9 * 255.0f;
        paint.setAlpha((int) f22);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f18478i1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f18475f1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f11;
        if (this.H1) {
            f13 = f9;
        } else {
            f13 = 1.0f;
        }
        int i10 = (int) (lerp - (intrinsicWidth * f13));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f11;
        if (this.H1) {
            f14 = f9;
        } else {
            f14 = 1.0f;
        }
        int i11 = (int) (dp - (intrinsicHeight * f14));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f11;
        if (this.H1) {
            f15 = f9;
        } else {
            f15 = 1.0f;
        }
        int i12 = (int) ((intrinsicWidth2 * f15) + lerp);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f11;
        if (this.H1) {
            f16 = f9;
        } else {
            f16 = 1.0f;
        }
        drawable.setBounds(i10, i11, i12, (int) ((intrinsicHeight2 * f16) + dp));
        float f23 = f11 * 255.0f;
        if (this.H1) {
            f17 = f9;
        } else {
            f17 = 1.0f;
        }
        drawable.setAlpha((int) (f23 * f17));
        drawable.draw(canvas);
        if (f10 > f12) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f10 * f9;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f18471b1);
        }
        canvas.restore();
        float f24 = d6Var.f27666c;
        float f25 = d6Var2.f27666c;
        if (this.Y0 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float y8 = org.telegram.messenger.x3.y(1.0f, f24, AndroidUtilities.lerp(this.f18483o1.e(z10), 0.0f, f25), f9);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f25) * y8) / 2.0f;
        float f26 = 1.0f - f25;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.Z0) * f26), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y8);
        float dp3 = (AndroidUtilities.dp(36.0f) * y8) / 2.0f;
        RectF rectF3 = this.f18484p1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f25);
        int l1 = org.telegram.ui.ActionBar.g6.l1(y8, 536870912);
        Paint paint4 = this.l1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c3 = this.N.c(y8);
        if (c3 == null) {
            Paint paint5 = this.f18480k1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * y8));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c3);
            Paint paint6 = this.f18074e;
            paint6.setAlpha((int) (51.0f * y8));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y8, y8, dp2, lerp3);
        int l12 = org.telegram.ui.ActionBar.g6.l1(y8, -1);
        Paint paint7 = this.f18481m1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.g6.l1(y8 * f26, -1);
        Paint paint8 = this.f18482n1;
        paint8.setColor(l13);
        float dp4 = (AndroidUtilities.dp(4.0f) * f26) + lerp3;
        canvas.rotate(this.Z0 * 12.0f * f26, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float f27 = dp4 - lerp6;
        RectF rectF4 = this.f18486r1;
        rectF4.set(dp2 - lerp5, f27, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f25 < 1.0f) {
            canvas.save();
            canvas.rotate(this.Z0 * 12.0f * f26, dp2, f27);
            canvas.translate(0.0f, lerp6 * f25);
            canvas.scale(f26, f26, dp2, f27);
            Path path2 = this.f18487s1;
            path2.rewind();
            float dp5 = AndroidUtilities.dp(4.33f);
            float dp6 = f27 - AndroidUtilities.dp(3.66f);
            float f28 = dp2 + dp5;
            path2.moveTo(f28, AndroidUtilities.dp(3.66f) + dp6);
            path2.lineTo(f28, dp6);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f29 = dp2 - dp5;
            rectF5.set(f29, dp6 - dp5, f28, dp5 + dp6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f29, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.Z0), 1.0f, f25) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.G1) {
            ImageView imageView = this.O0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.d6 d6Var3 = this.I0;
            ImageView imageView2 = this.P0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || d6Var3.f27666c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f18082k0) * 255.0f), 31);
                Path path3 = this.f18479j1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || d6Var3.f27666c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || d6Var3.f27666c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.U0 == null) {
            this.U0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.U0.setAlpha((int) (f22 * f11));
        float timelineHeight = getTimelineHeight();
        this.U0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.U0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.W0;
        xi0 xi0Var = qVar.h;
        qVar.f18385f = true;
        if (qVar.f18386g) {
            xi0Var.start();
        }
        xi0Var.f34753r0 = qVar.f18387i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.W0;
        qVar.f18385f = false;
        xi0 xi0Var = qVar.h;
        xi0Var.stop();
        xi0Var.f34753r0 = null;
    }

    public void setAmplitude(double d) {
        this.f18476g1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = R.drawable.input_video_story_remove;
        } else {
            i10 = R.drawable.input_video_story;
        }
        ImageView imageView = this.O0;
        imageView.setImageResource(i10);
        if (z10) {
            i11 = R.string.AccDescrRemoveRoundVideo;
        } else {
            i11 = R.string.AccDescrVideoMessage;
        }
        imageView.setContentDescription(LocaleController.getString(i11));
        this.V0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.f18492x1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.f18493y1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i10;
        this.S0 = z10;
        if (z10 && !this.f18083l0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.P0.setVisibility(i10);
    }

    @Override
    public final void u(float f9) {
        float f10 = 1.0f - f9;
        this.P0.setAlpha(f10);
        this.O0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.L1);
        this.H1 = true;
        this.K1 = false;
        this.G0 = false;
        this.H0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Y0));
        invalidate();
        p pVar = this.f18494z1;
        if (pVar != null) {
            if (!z10) {
                if (z11) {
                    pVar.f18681x = true;
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.f18672a.getCameraSessionRecording(), false, false);
                    pVar.a(false);
                } else {
                    pVar.c();
                }
            }
            this.f18494z1 = null;
        }
        n();
    }
}
