package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
public abstract class v extends o {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public t01 A1;
    public Utilities.Callback B1;
    public Utilities.Callback C1;
    public t D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.d6 G1;
    public final org.telegram.ui.Components.d6 H1;
    public final org.telegram.ui.Components.d6 I1;
    public final org.telegram.ui.Components.d6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final p P1;
    public final ImageView S0;
    public final ImageView T0;
    public final n U0;
    public w70 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final u f3746a1;
    public final org.telegram.ui.Components.n6 f3747b1;
    public float f3748c1;
    public float f3749d1;
    public long f3750e1;
    public final Paint f3751f1;
    public final Paint f3752g1;
    public final org.telegram.ui.Components.ba f3753h1;
    public final org.telegram.ui.Components.ba f3754i1;
    public final Drawable f3755j1;
    public float f3756k1;
    public final org.telegram.ui.Components.d6 l1;
    public final Path f3757m1;
    public final Path f3758n1;
    public final Paint f3759o1;
    public final Paint f3760p1;
    public final Paint f3761q1;
    public final Paint f3762r1;
    public final org.telegram.ui.Components.d6 f3763s1;
    public final RectF f3764t1;
    public final RectF f3765u1;
    public final RectF f3766v1;
    public final Path f3767w1;
    public t01 f3768x1;
    public Path f3769y1;
    public Paint f3770z1;

    public v(Context context, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, zh.b bVar, org.telegram.ui.Components.ia iaVar) {
        super(context, frameLayout, aw0Var, frameLayout2, bVar, iaVar);
        this.W0 = true;
        this.X0 = 0;
        qd qdVar = (qd) this;
        this.f3746a1 = new u(qdVar, qdVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.f3747b1 = n6Var;
        wr wrVar = wr.f28819f;
        n6Var.k(0.16f, 50L, wrVar);
        n6Var.t(AndroidUtilities.dp(15.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.q("0:00.0", true, true);
        n6Var.r(-1);
        Paint paint = new Paint(1);
        this.f3751f1 = paint;
        Paint paint2 = new Paint(1);
        this.f3752g1 = paint2;
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(11, 360928);
        this.f3753h1 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12, 360928);
        this.f3754i1 = baVar2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        baVar.f21768a = AndroidUtilities.dp(47.0f);
        baVar.f21769b = AndroidUtilities.dp(55.0f);
        baVar.b();
        baVar2.f21768a = AndroidUtilities.dp(47.0f);
        baVar2.f21769b = AndroidUtilities.dp(55.0f);
        baVar2.b();
        this.f3755j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new org.telegram.ui.Components.d6(new p(qdVar, 0), 200L, wrVar, 0);
        this.f3757m1 = new Path();
        this.f3758n1 = new Path();
        this.f3759o1 = new Paint(1);
        this.f3760p1 = new Paint(1);
        this.f3761q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f3762r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        p pVar = new p(qdVar, 0);
        wr wrVar2 = wr.h;
        this.f3763s1 = new org.telegram.ui.Components.d6(pVar, 350L, wrVar2);
        this.f3764t1 = new RectF();
        this.f3765u1 = new RectF();
        this.f3766v1 = new RectF();
        this.f3767w1 = new Path();
        this.G1 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar2);
        this.H1 = new org.telegram.ui.Components.d6(new p(qdVar, 0), 420L, wrVar2, 0);
        this.I1 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar2);
        this.J1 = new org.telegram.ui.Components.d6(new p(qdVar, 0), 350L, wrVar2, 0);
        this.P1 = new p(qdVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, w7.a6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new ai.u(qdVar, 3));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        n nVar = new n(5);
        this.U0 = nVar;
        imageView2.setImageDrawable(nVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, w7.a6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new q(qdVar, frameLayout, bVar, 0));
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f3260a);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1.c(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, this.f3260a));
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
        throw new UnsupportedOperationException("Method not decompiled: bi.v.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            float e = this.G1.e(this.K1);
            float e7 = this.I1.e(this.M1);
            if (this.f3750e1 <= 0) {
                this.f3750e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f3750e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            u uVar = this.f3746a1;
            uVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            uVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.n6 n6Var = this.f3747b1;
            n6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
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
            n6Var.q(sb2.toString(), true, true);
            n6Var.f25442w = (int) ((1.0f - e) * 255.0f);
            n6Var.draw(canvas3);
            float f14 = 1.0f - e7;
            float f15 = (1.0f - this.f3748c1) * f14;
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
                if (this.f3768x1 == null) {
                    this.f3768x1 = new t01(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f3769y1 == null) {
                    Path path = new Path();
                    this.f3769y1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f3769y1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f3769y1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.f3770z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f3770z1.setStrokeCap(Paint.Cap.ROUND);
                    this.f3770z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f3770z1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f3768x1.f27257p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float centerX = (rectF.centerX() - ((this.f3768x1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.f3748c1, 1.0f, e7) * (rectF.width() / 6.0f));
                float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, this.f3748c1, AndroidUtilities.dp(6.0f) * sin, centerX);
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                int l1 = org.telegram.ui.ActionBar.j6.l1(f7, i10);
                canvas3.save();
                canvas3.translate(a2, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f3770z1.setColor(l1);
                canvas3.drawPath(this.f3769y1, this.f3770z1);
                canvas3.restore();
                f12 = 15.0f;
                f13 = 0.0f;
                this.f3768x1.c(a2 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f12 = 15.0f;
                f13 = 0.0f;
            }
            if (e7 > f13) {
                if (this.A1 == null) {
                    this.A1 = new t01(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.A1.f27257p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - n6Var.d());
                float width = ((rectF.width() / 4.0f) * f14) + (rectF.centerX() - (this.A1.l() / 2.0f));
                if (paint != null) {
                    i15 = -1;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.j6.l1(e7, i15), canvas2);
                this.f3765u1.set(width - AndroidUtilities.dp(f11), rectF.top, this.A1.l() + width + AndroidUtilities.dp(f11), rectF.bottom);
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
        org.telegram.ui.Components.d6 d6Var = this.H1;
        float e = d6Var.e(z11);
        boolean z12 = this.M1;
        org.telegram.ui.Components.d6 d6Var2 = this.J1;
        float e7 = d6Var2.e(z12);
        float d = this.l1.d(this.f3756k1, false);
        float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f3748c1, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f18 = 1.0f - e;
        float f19 = z13 * f18 * f7;
        float lerp = AndroidUtilities.lerp(com.google.android.gms.internal.vision.e2.a(1.0f, e7, getWidth() * 0.35f * this.f3748c1, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f3752g1;
        if (isEnabled) {
            org.telegram.ui.Components.ba baVar = this.f3753h1;
            baVar.f21768a = AndroidUtilities.dp(47.0f);
            Paint paint2 = baVar.d;
            f12 = 0.0f;
            baVar.f21769b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f10 = e7;
            org.telegram.ui.Components.ba baVar2 = this.f3754i1;
            baVar2.f21768a = AndroidUtilities.dp(50.0f);
            Paint paint3 = baVar2.d;
            f11 = f18;
            baVar2.f21769b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            baVar2.e(d, 1.01f);
            baVar.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f20 = f19 / baVar2.f21768a;
            canvas.scale(f20, f20, lerp, dp);
            baVar2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f21 = f19 / baVar.f21768a;
            canvas.scale(f21, f21, lerp, dp);
            baVar.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = e7;
            f11 = f18;
            f12 = 0.0f;
        }
        float min = Math.min(f19, AndroidUtilities.dp(55.0f));
        float f22 = f7 * 255.0f;
        paint.setAlpha((int) f22);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f3757m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f3755j1;
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
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f3751f1);
        }
        canvas.restore();
        float f24 = d6Var.f22295c;
        float f25 = d6Var2.f22295c;
        if (this.f3748c1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float A = org.telegram.messenger.a2.A(1.0f, f24, AndroidUtilities.lerp(this.f3763s1.e(z10), 0.0f, f25), f7);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f25) * A) / 2.0f;
        float f26 = 1.0f - f25;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.f3749d1) * f26), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - A);
        float dp3 = (AndroidUtilities.dp(36.0f) * A) / 2.0f;
        RectF rectF3 = this.f3764t1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f25);
        int l1 = org.telegram.ui.ActionBar.j6.l1(A, 536870912);
        Paint paint4 = this.f3760p1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.R.c(A);
        if (c10 == null) {
            Paint paint5 = this.f3759o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.e;
            paint6.setAlpha((int) (51.0f * A));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(A, A, dp2, lerp3);
        int l12 = org.telegram.ui.ActionBar.j6.l1(A, -1);
        Paint paint7 = this.f3761q1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.j6.l1(A * f26, -1);
        Paint paint8 = this.f3762r1;
        paint8.setColor(l13);
        float dp4 = (AndroidUtilities.dp(4.0f) * f26) + lerp3;
        canvas.rotate(this.f3749d1 * 12.0f * f26, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float f27 = dp4 - lerp6;
        RectF rectF4 = this.f3766v1;
        rectF4.set(dp2 - lerp5, f27, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f25 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f3749d1 * 12.0f * f26, dp2, f27);
            canvas.translate(0.0f, lerp6 * f25);
            canvas.scale(f26, f26, dp2, f27);
            Path path2 = this.f3767w1;
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
            path2.lineTo(f29, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.f3749d1), 1.0f, f25) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.d6 d6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || d6Var3.f22295c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f3278o0) * 255.0f), 31);
                Path path3 = this.f3758n1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || d6Var3.f22295c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f11) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || d6Var3.f22295c > 0.0f) {
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
        u uVar = this.f3746a1;
        hj0 hj0Var = uVar.h;
        uVar.f3704f = true;
        if (uVar.f3705g) {
            hj0Var.start();
        }
        hj0Var.f23672v0 = uVar.f3706i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u uVar = this.f3746a1;
        uVar.f3704f = false;
        hj0 hj0Var = uVar.h;
        hj0Var.stop();
        hj0Var.f23672v0 = null;
    }

    public void setAmplitude(double d) {
        this.f3756k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
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
        if (z10 && !this.f3279p0) {
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
        this.L0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.f3748c1));
        invalidate();
        t tVar = this.D1;
        if (tVar != null) {
            if (!z10) {
                if (z11) {
                    tVar.f3557x = true;
                    AndroidUtilities.cancelRunOnUIThread(tVar.h);
                    CameraController.getInstance().stopVideoRecording(tVar.f3549a.getCameraSessionRecording(), false, false);
                    tVar.a(false);
                } else {
                    tVar.c();
                }
            }
            this.D1 = null;
        }
        n();
    }
}
