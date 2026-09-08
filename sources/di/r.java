package di;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
public abstract class r extends m {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public f01 A1;
    public Utilities.Callback B1;
    public Utilities.Callback C1;
    public p D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.e6 G1;
    public final org.telegram.ui.Components.e6 H1;
    public final org.telegram.ui.Components.e6 I1;
    public final org.telegram.ui.Components.e6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final n P1;
    public final ImageView S0;
    public final ImageView T0;
    public final l U0;
    public n70 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final q f8053a1;
    public final org.telegram.ui.Components.p6 f8054b1;
    public float f8055c1;
    public float f8056d1;
    public long f8057e1;
    public final Paint f8058f1;
    public final Paint f8059g1;
    public final org.telegram.ui.Components.ca f8060h1;
    public final org.telegram.ui.Components.ca f8061i1;
    public final Drawable f8062j1;
    public float f8063k1;
    public final org.telegram.ui.Components.e6 l1;
    public final Path f8064m1;
    public final Path f8065n1;
    public final Paint f8066o1;
    public final Paint f8067p1;
    public final Paint f8068q1;
    public final Paint f8069r1;
    public final org.telegram.ui.Components.e6 f8070s1;
    public final RectF f8071t1;
    public final RectF f8072u1;
    public final RectF f8073v1;
    public final Path f8074w1;
    public f01 f8075x1;
    public Path f8076y1;
    public Paint f8077z1;

    public r(Context context, FrameLayout frameLayout, ov0 ov0Var, FrameLayout frameLayout2, bi.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(context, frameLayout, ov0Var, frameLayout2, bVar, jaVar);
        this.W0 = true;
        this.X0 = 0;
        fc fcVar = (fc) this;
        this.f8053a1 = new q(fcVar, fcVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.f8054b1 = p6Var;
        pr prVar = pr.f29493f;
        p6Var.k(0.16f, 50L, prVar);
        p6Var.t(AndroidUtilities.dp(15.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.q("0:00.0", true, true);
        p6Var.r(-1);
        Paint paint = new Paint(1);
        this.f8058f1 = paint;
        Paint paint2 = new Paint(1);
        this.f8059g1 = paint2;
        org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(11, 360928);
        this.f8060h1 = caVar;
        org.telegram.ui.Components.ca caVar2 = new org.telegram.ui.Components.ca(12, 360928);
        this.f8061i1 = caVar2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        caVar.f24953a = AndroidUtilities.dp(47.0f);
        caVar.f24954b = AndroidUtilities.dp(55.0f);
        caVar.b();
        caVar2.f24953a = AndroidUtilities.dp(47.0f);
        caVar2.f24954b = AndroidUtilities.dp(55.0f);
        caVar2.b();
        this.f8062j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 200L, prVar, 0);
        this.f8064m1 = new Path();
        this.f8065n1 = new Path();
        this.f8066o1 = new Paint(1);
        this.f8067p1 = new Paint(1);
        this.f8068q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f8069r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(fcVar, 0);
        pr prVar2 = pr.h;
        this.f8070s1 = new org.telegram.ui.Components.e6(nVar, 350L, prVar2);
        this.f8071t1 = new RectF();
        this.f8072u1 = new RectF();
        this.f8073v1 = new RectF();
        this.f8074w1 = new Path();
        this.G1 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar2);
        this.H1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 420L, prVar2, 0);
        this.I1 = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar2);
        this.J1 = new org.telegram.ui.Components.e6(new n(fcVar, 0), 350L, prVar2, 0);
        this.P1 = new n(fcVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, w7.x5.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ah.h0(fcVar, 9));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        l lVar = new l(5);
        this.U0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, w7.x5.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new bi.x(fcVar, frameLayout, bVar, 4));
    }

    public final void A(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 < 4) {
                if (Q1[i11] == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = 2;
                break;
            }
        }
        if (this.X0 == i11) {
            return;
        }
        this.X0 = i11;
        this.U0.d(i10 / 3600, false, z10);
    }

    public final void B() {
        if (this.Z0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f7612a);
            alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1.c(this, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20925q7, this.f7612a));
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
        if (!z10 && this.W0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.T0;
        imageView.setVisibility(i10);
        if (z10) {
            i11 = 8;
        }
        this.S0.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        if (!z10) {
            if (this.W0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.T0.setVisibility(i10);
            this.S0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.r.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.U).storyCaptionLengthLimitDefault;
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.U).storyCaptionLengthLimitPremium;
    }

    public int getTimelineHeight() {
        return 0;
    }

    @Override
    public final void j(Canvas canvas, RectF rectF) {
        String str;
        float f7;
        Paint paint;
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        int i10;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float e7 = this.G1.e(this.K1);
            float e10 = this.I1.e(this.M1);
            if (this.f8057e1 <= 0) {
                this.f8057e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f8057e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            q qVar = this.f8053a1;
            qVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            qVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.p6 p6Var = this.f8054b1;
            p6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e7)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
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
            p6Var.q(sb2.toString(), true, true);
            p6Var.f29330w = (int) ((1.0f - e7) * 255.0f);
            p6Var.draw(canvas3);
            float f14 = 1.0f - e10;
            float f15 = (1.0f - this.f8055c1) * f14;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f7 = f15;
                paint = c10;
                f10 = 10.0f;
                f11 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f7 = f15;
                paint = c10;
                f10 = 10.0f;
                f11 = 12.0f;
            }
            int i15 = -2130706433;
            if (f7 > 0.0f) {
                if (this.f8075x1 == null) {
                    this.f8075x1 = new f01(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f8076y1 == null) {
                    Path path = new Path();
                    this.f8076y1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f8076y1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f8076y1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.f8077z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f8077z1.setStrokeCap(Paint.Cap.ROUND);
                    this.f8077z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f8077z1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f8075x1.f25885p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - p6Var.d());
                float centerX = (rectF.centerX() - ((this.f8075x1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.f8055c1, 1.0f, e10) * (rectF.width() / 6.0f));
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, this.f8055c1, AndroidUtilities.dp(6.0f) * sin, centerX);
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int l1 = org.telegram.ui.ActionBar.j6.l1(f7, i10);
                canvas3.save();
                canvas3.translate(b11, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f8077z1.setColor(l1);
                canvas3.drawPath(this.f8076y1, this.f8077z1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.f8075x1.c(b11 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (e10 > f13) {
                if (this.A1 == null) {
                    this.A1 = new f01(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.A1.f25885p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - p6Var.d());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.l() / 2.0f));
                if (paint != null) {
                    i15 = -1;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.j6.l1(e10, i15), canvas2);
                this.f8072u1.set(width - AndroidUtilities.dp(f11), rectF.top, this.A1.l() + width + AndroidUtilities.dp(f11), rectF.bottom);
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
    public final void k(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10;
        if (f7 <= 0.0f) {
            return;
        }
        boolean z11 = this.K1;
        org.telegram.ui.Components.e6 e6Var = this.H1;
        float e7 = e6Var.e(z11);
        boolean z12 = this.M1;
        org.telegram.ui.Components.e6 e6Var2 = this.J1;
        float e10 = e6Var2.e(z12);
        float d = this.l1.d(this.f8063k1, false);
        float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f8055c1, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f18 = 1.0f - e7;
        float f19 = z13 * f18 * f7;
        float lerp = AndroidUtilities.lerp(com.google.android.gms.internal.vision.e2.b(1.0f, e10, getWidth() * 0.35f * this.f8055c1, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e7);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f8059g1;
        if (isEnabled) {
            org.telegram.ui.Components.ca caVar = this.f8060h1;
            caVar.f24953a = AndroidUtilities.dp(47.0f);
            Paint paint2 = caVar.d;
            f12 = 0.0f;
            caVar.f24954b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f10 = e10;
            org.telegram.ui.Components.ca caVar2 = this.f8061i1;
            caVar2.f24953a = AndroidUtilities.dp(50.0f);
            Paint paint3 = caVar2.d;
            f11 = f18;
            caVar2.f24954b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            caVar2.e(d, 1.01f);
            caVar.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f20 = f19 / caVar2.f24953a;
            canvas.scale(f20, f20, lerp, dp);
            caVar2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f21 = f19 / caVar.f24953a;
            canvas.scale(f21, f21, lerp, dp);
            caVar.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = e10;
            f11 = f18;
            f12 = 0.0f;
        }
        float min = Math.min(f19, AndroidUtilities.dp(55.0f));
        float f22 = f7 * 255.0f;
        paint.setAlpha((int) f22);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f8064m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f8062j1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f11;
        if (this.L1) {
            f13 = f7;
        } else {
            f13 = 1.0f;
        }
        int i10 = (int) (lerp - (intrinsicWidth * f13));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f11;
        if (this.L1) {
            f14 = f7;
        } else {
            f14 = 1.0f;
        }
        int i11 = (int) (dp - (intrinsicHeight * f14));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f11;
        if (this.L1) {
            f15 = f7;
        } else {
            f15 = 1.0f;
        }
        int i12 = (int) ((intrinsicWidth2 * f15) + lerp);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f11;
        if (this.L1) {
            f16 = f7;
        } else {
            f16 = 1.0f;
        }
        drawable.setBounds(i10, i11, i12, (int) ((intrinsicHeight2 * f16) + dp));
        float f23 = f11 * 255.0f;
        if (this.L1) {
            f17 = f7;
        } else {
            f17 = 1.0f;
        }
        drawable.setAlpha((int) (f23 * f17));
        drawable.draw(canvas);
        if (f10 > f12) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f10 * f7;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f8058f1);
        }
        canvas.restore();
        float f24 = e6Var.f25592c;
        float f25 = e6Var2.f25592c;
        if (this.f8055c1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float A = org.telegram.messenger.w1.A(1.0f, f24, AndroidUtilities.lerp(this.f8070s1.e(z10), 0.0f, f25), f7);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f25) * A) / 2.0f;
        float f26 = 1.0f - f25;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.f8056d1) * f26), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - A);
        float dp3 = (AndroidUtilities.dp(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f8071t1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f25);
        int l1 = org.telegram.ui.ActionBar.j6.l1(A, 536870912);
        Paint paint4 = this.f8067p1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.f8066o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.f7619e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(A, A, dp2, lerp3);
        int l12 = org.telegram.ui.ActionBar.j6.l1(A, -1);
        Paint paint7 = this.f8068q1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.j6.l1(A * f26, -1);
        Paint paint8 = this.f8069r1;
        paint8.setColor(l13);
        float dp4 = (AndroidUtilities.dp(4.0f) * f26) + lerp3;
        canvas.rotate(this.f8056d1 * 12.0f * f26, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float f27 = dp4 - lerp6;
        RectF rectF4 = this.f8073v1;
        rectF4.set(dp2 - lerp5, f27, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f25 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f8056d1 * 12.0f * f26, dp2, f27);
            canvas.translate(0.0f, lerp6 * f25);
            canvas.scale(f26, f26, dp2, f27);
            Path path2 = this.f8074w1;
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
            path2.lineTo(f29, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.f8056d1), 1.0f, f25) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.e6 e6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || e6Var3.f25592c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f7631o0) * 255.0f), 31);
                Path path3 = this.f8065n1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || e6Var3.f25592c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || e6Var3.f25592c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.Y0 == null) {
            this.Y0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.Y0.setAlpha((int) (f22 * f11));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.f8053a1;
        xi0 xi0Var = qVar.h;
        qVar.f7959f = true;
        if (qVar.f7960g) {
            xi0Var.start();
        }
        xi0Var.f32605v0 = qVar.f7961i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.f8053a1;
        qVar.f7959f = false;
        xi0 xi0Var = qVar.h;
        xi0Var.stop();
        xi0Var.f32605v0 = null;
    }

    public void setAmplitude(double d) {
        this.f8063k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
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
        ImageView imageView = this.S0;
        imageView.setImageResource(i10);
        if (z10) {
            i11 = R.string.AccDescrRemoveRoundVideo;
        } else {
            i11 = R.string.AccDescrVideoMessage;
        }
        imageView.setContentDescription(LocaleController.getString(i11));
        this.Z0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.B1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.C1 = callback;
    }

    public void setPeriod(int i10) {
        A(i10, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i10;
        this.W0 = z10;
        if (z10 && !this.f7632p0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.T0.setVisibility(i10);
    }

    @Override
    public final void u(float f7) {
        float f10 = 1.0f - f7;
        this.T0.setAlpha(f10);
        this.S0.setAlpha(f10);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.P1);
        this.L1 = true;
        this.O1 = false;
        this.K0 = false;
        this.L0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.f8055c1));
        invalidate();
        p pVar = this.D1;
        if (pVar != null) {
            if (!z10) {
                if (z11) {
                    pVar.f8039x = true;
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.f8030a.getCameraSessionRecording(), false, false);
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
