package ci;

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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.tw0;
public abstract class r extends m {
    public static final int[] Q1 = {21600, 43200, 86400, 172800};
    public m11 A1;
    public Utilities.Callback B1;
    public Utilities.Callback C1;
    public p D1;
    public float E1;
    public float F1;
    public final org.telegram.ui.Components.g6 G1;
    public final org.telegram.ui.Components.g6 H1;
    public final org.telegram.ui.Components.g6 I1;
    public final org.telegram.ui.Components.g6 J1;
    public boolean K1;
    public boolean L1;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public final n P1;
    public final ImageView S0;
    public final ImageView T0;
    public final l U0;
    public q80 V0;
    public boolean W0;
    public int X0;
    public Drawable Y0;
    public boolean Z0;
    public final q f5855a1;
    public final org.telegram.ui.Components.q6 f5856b1;
    public float f5857c1;
    public float f5858d1;
    public long f5859e1;
    public final Paint f5860f1;
    public final Paint f5861g1;
    public final org.telegram.ui.Components.da f5862h1;
    public final org.telegram.ui.Components.da f5863i1;
    public final Drawable f5864j1;
    public float f5865k1;
    public final org.telegram.ui.Components.g6 l1;
    public final Path f5866m1;
    public final Path f5867n1;
    public final Paint f5868o1;
    public final Paint f5869p1;
    public final Paint f5870q1;
    public final Paint f5871r1;
    public final org.telegram.ui.Components.g6 f5872s1;
    public final RectF f5873t1;
    public final RectF f5874u1;
    public final RectF f5875v1;
    public final Path f5876w1;
    public m11 f5877x1;
    public Path f5878y1;
    public Paint f5879z1;

    public r(Context context, FrameLayout frameLayout, tw0 tw0Var, FrameLayout frameLayout2, ai.d dVar, org.telegram.ui.Components.ma maVar) {
        super(context, frameLayout, tw0Var, frameLayout2, dVar, maVar);
        this.W0 = true;
        this.X0 = 0;
        bc bcVar = (bc) this;
        this.f5855a1 = new q(bcVar, bcVar);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.f5856b1 = q6Var;
        is isVar = is.f27443f;
        q6Var.n(0.16f, 50L, isVar);
        q6Var.w(AndroidUtilities.dp(15.0f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.t("0:00.0", true, true);
        q6Var.u(-1);
        Paint paint = new Paint(1);
        this.f5860f1 = paint;
        Paint paint2 = new Paint(1);
        this.f5861g1 = paint2;
        org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(11, 360928);
        this.f5862h1 = daVar;
        org.telegram.ui.Components.da daVar2 = new org.telegram.ui.Components.da(12, 360928);
        this.f5863i1 = daVar2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        daVar.f25605a = AndroidUtilities.dp(47.0f);
        daVar.f25606b = AndroidUtilities.dp(55.0f);
        daVar.b();
        daVar2.f25605a = AndroidUtilities.dp(47.0f);
        daVar2.f25606b = AndroidUtilities.dp(55.0f);
        daVar2.b();
        this.f5864j1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.l1 = new org.telegram.ui.Components.g6(new n(bcVar, 0), 200L, isVar, 0);
        this.f5866m1 = new Path();
        this.f5867n1 = new Path();
        this.f5868o1 = new Paint(1);
        this.f5869p1 = new Paint(1);
        this.f5870q1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f5871r1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(bcVar, 0);
        is isVar2 = is.h;
        this.f5872s1 = new org.telegram.ui.Components.g6(nVar, 350L, isVar2);
        this.f5873t1 = new RectF();
        this.f5874u1 = new RectF();
        this.f5875v1 = new RectF();
        this.f5876w1 = new Path();
        this.G1 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar2);
        this.H1 = new org.telegram.ui.Components.g6(new n(bcVar, 0), 420L, isVar2, 0);
        this.I1 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar2);
        this.J1 = new org.telegram.ui.Components.g6(new n(bcVar, 0), 350L, isVar2, 0);
        this.P1 = new n(bcVar, 1);
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, w7.x5.a(44.0f, 0.0f, 0.0f, 11.0f, 6.0f, 44, 85));
        imageView.setOnClickListener(new ai.v0(bcVar, 8));
        ImageView imageView2 = new ImageView(context);
        this.T0 = imageView2;
        l lVar = new l(5);
        this.U0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, w7.x5.a(44.0f, 0.0f, 0.0f, 51.0f, 6.0f, 44, 85));
        imageView2.setOnClickListener(new ai.d0(bcVar, frameLayout, dVar, 4));
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f5546a);
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new a1.c(this, 14));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, this.f5546a));
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
        throw new UnsupportedOperationException("Method not decompiled: ci.r.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
        float f10;
        float f11;
        Paint paint;
        float f12;
        Canvas canvas2;
        int i10;
        int i11;
        Canvas canvas3 = canvas;
        if (this.D1 != null) {
            float e7 = this.G1.e(this.K1);
            float e10 = this.I1.e(this.M1);
            if (this.f5859e1 <= 0) {
                this.f5859e1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f5859e1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            q qVar = this.f5855a1;
            qVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            qVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.q6 q6Var = this.f5856b1;
            q6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e7)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
            long b10 = this.D1.b();
            int i12 = (int) (b10 / 1000);
            int i13 = (int) ((b10 - (i12 * 1000)) / 100);
            int i14 = i12 / 60;
            int i15 = i12 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14);
            sb2.append(":");
            if (i15 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(i15);
            sb2.append(".");
            sb2.append(i13);
            q6Var.t(sb2.toString(), true, true);
            q6Var.B = (int) ((1.0f - e7) * 255.0f);
            q6Var.draw(canvas3);
            float f13 = 1.0f - e10;
            float f14 = (1.0f - this.f5857c1) * f13;
            Paint c10 = this.P.c(1.0f);
            if (c10 != null) {
                f10 = 10.0f;
                paint = c10;
                f7 = 12.0f;
                f11 = f14;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f7 = 12.0f;
                f10 = 10.0f;
                f11 = f14;
                paint = c10;
            }
            if (f11 > 0.0f) {
                if (this.f5877x1 == null) {
                    this.f5877x1 = new m11(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f5878y1 == null) {
                    Path path = new Path();
                    this.f5878y1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f5878y1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f5878y1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f10));
                    Paint paint2 = new Paint(1);
                    this.f5879z1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f5879z1.setStrokeCap(Paint.Cap.ROUND);
                    this.f5879z1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f5879z1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f5877x1.f28613p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - q6Var.c());
                float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, this.f5857c1, AndroidUtilities.dp(6.0f) * sin, (rectF.centerX() - ((this.f5877x1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.f5857c1, 1.0f, e10) * (rectF.width() / 6.0f)));
                if (paint != null) {
                    i11 = -1;
                } else {
                    i11 = -2130706433;
                }
                int m12 = org.telegram.ui.ActionBar.i6.m1(f11, i11);
                canvas3.save();
                canvas3.translate(b11, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f5879z1.setColor(m12);
                canvas3.drawPath(this.f5878y1, this.f5879z1);
                canvas3.restore();
                f12 = 15.0f;
                this.f5877x1.c(b11 + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, m12, canvas3);
            } else {
                f12 = 15.0f;
            }
            if (e10 > 0.0f) {
                if (this.A1 == null) {
                    this.A1 = new m11(LocaleController.getString(R.string.CancelRound), f12, AndroidUtilities.bold());
                }
                this.A1.f28613p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - q6Var.c());
                float width = ((rectF.width() / 4.0f) * f13) + (rectF.centerX() - (this.A1.l() / 2.0f));
                if (paint != null) {
                    i10 = -1;
                } else {
                    i10 = -2130706433;
                }
                canvas2 = canvas;
                this.A1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.i6.m1(e10, i10), canvas2);
                this.f5874u1.set(width - AndroidUtilities.dp(f7), rectF.top, this.A1.l() + width + AndroidUtilities.dp(f7), rectF.bottom);
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
        org.telegram.ui.Components.g6 g6Var = this.H1;
        float e7 = g6Var.e(z11);
        boolean z12 = this.M1;
        org.telegram.ui.Components.g6 g6Var2 = this.J1;
        float e10 = g6Var2.e(z12);
        float d = this.l1.d(this.f5865k1, false);
        float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f5857c1, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f18 = 1.0f - e7;
        float f19 = y3 * f18 * f7;
        float lerp = AndroidUtilities.lerp(com.google.android.gms.internal.vision.e2.b(1.0f, e10, getWidth() * 0.35f * this.f5857c1, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e7);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f5861g1;
        if (isEnabled) {
            org.telegram.ui.Components.da daVar = this.f5862h1;
            daVar.f25605a = AndroidUtilities.dp(47.0f);
            Paint paint2 = daVar.d;
            f10 = 0.0f;
            daVar.f25606b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f11 = e10;
            org.telegram.ui.Components.da daVar2 = this.f5863i1;
            daVar2.f25605a = AndroidUtilities.dp(50.0f);
            Paint paint3 = daVar2.d;
            f12 = f18;
            daVar2.f25606b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            daVar2.e(d, 1.01f);
            daVar.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.i6.m1(0.15f * f7, paint.getColor()));
            canvas.save();
            float f20 = f19 / daVar2.f25605a;
            canvas.scale(f20, f20, lerp, dp);
            daVar2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.i6.m1(0.3f * f7, paint.getColor()));
            canvas.save();
            float f21 = f19 / daVar.f25605a;
            canvas.scale(f21, f21, lerp, dp);
            daVar.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f10 = 0.0f;
            f11 = e10;
            f12 = f18;
        }
        float min = Math.min(f19, AndroidUtilities.dp(55.0f));
        float f22 = f7 * 255.0f;
        paint.setAlpha((int) f22);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f5866m1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f5864j1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.L1) {
            f13 = f7;
        } else {
            f13 = 1.0f;
        }
        int i10 = (int) (lerp - (intrinsicWidth * f13));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.L1) {
            f14 = f7;
        } else {
            f14 = 1.0f;
        }
        int i11 = (int) (dp - (intrinsicHeight * f14));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.L1) {
            f15 = f7;
        } else {
            f15 = 1.0f;
        }
        int i12 = (int) ((intrinsicWidth2 * f15) + lerp);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.L1) {
            f16 = f7;
        } else {
            f16 = 1.0f;
        }
        drawable.setBounds(i10, i11, i12, (int) ((intrinsicHeight2 * f16) + dp));
        float f23 = f12 * 255.0f;
        if (this.L1) {
            f17 = f7;
        } else {
            f17 = 1.0f;
        }
        drawable.setAlpha((int) (f23 * f17));
        drawable.draw(canvas);
        if (f11 > f10) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f11 * f7;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f5860f1);
        }
        canvas.restore();
        float f24 = g6Var.f26616c;
        float f25 = g6Var2.f26616c;
        if (this.f5857c1 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float z13 = org.telegram.messenger.q.z(1.0f, f24, AndroidUtilities.lerp(this.f5872s1.e(z10), f10, f25), f7);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f25) * z13) / 2.0f;
        float f26 = 1.0f - f25;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.f5858d1) * f26), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - z13);
        float dp3 = (AndroidUtilities.dp(36.0f) * z13) / 2.0f;
        RectF rectF3 = this.f5873t1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f25);
        int m12 = org.telegram.ui.ActionBar.i6.m1(z13, 536870912);
        Paint paint4 = this.f5869p1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), m12);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.R.c(z13);
        if (c10 == null) {
            Paint paint5 = this.f5868o1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * z13));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.f5553e;
            paint6.setAlpha((int) (51.0f * z13));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(z13, z13, dp2, lerp3);
        int m13 = org.telegram.ui.ActionBar.i6.m1(z13, -1);
        Paint paint7 = this.f5870q1;
        paint7.setColor(m13);
        int m14 = org.telegram.ui.ActionBar.i6.m1(z13 * f26, -1);
        Paint paint8 = this.f5871r1;
        paint8.setColor(m14);
        float dp4 = (AndroidUtilities.dp(4.0f) * f26) + lerp3;
        canvas.rotate(this.f5858d1 * 12.0f * f26, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f25) / 2.0f;
        float f27 = dp4 - lerp6;
        RectF rectF4 = this.f5875v1;
        rectF4.set(dp2 - lerp5, f27, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f25 < 1.0f) {
            canvas.save();
            canvas.rotate(this.f5858d1 * 12.0f * f26, dp2, f27);
            canvas.translate(0.0f, lerp6 * f25);
            canvas.scale(f26, f26, dp2, f27);
            Path path2 = this.f5876w1;
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
            path2.lineTo(f29, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.f5858d1), 1.0f, f25) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.K1) {
            ImageView imageView = this.S0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.g6 g6Var3 = this.M0;
            ImageView imageView2 = this.T0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || g6Var3.f26616c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f5565o0) * 255.0f), 31);
                Path path3 = this.f5867n1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || g6Var3.f26616c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || g6Var3.f26616c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.Y0 == null) {
            this.Y0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.Y0.setAlpha((int) (f22 * f12));
        float timelineHeight = getTimelineHeight();
        this.Y0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.Y0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q qVar = this.f5855a1;
        dk0 dk0Var = qVar.h;
        qVar.f5747f = true;
        if (qVar.f5748g) {
            dk0Var.start();
        }
        dk0Var.R(qVar.f5749i);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.f5855a1;
        qVar.f5747f = false;
        dk0 dk0Var = qVar.h;
        dk0Var.stop();
        dk0Var.R(null);
    }

    public void setAmplitude(double d) {
        this.f5865k1 = (float) (Math.min(1800.0d, d) / 1800.0d);
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
        if (z10 && !this.f5566p0) {
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
        this.L0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.f5857c1));
        invalidate();
        p pVar = this.D1;
        if (pVar != null) {
            if (!z10) {
                if (z11) {
                    pVar.f5689x = true;
                    AndroidUtilities.cancelRunOnUIThread(pVar.h);
                    CameraController.getInstance().stopVideoRecording(pVar.f5680a.getCameraSessionRecording(), false, false);
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
