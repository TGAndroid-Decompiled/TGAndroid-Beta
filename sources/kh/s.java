package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xu0;
public abstract class s extends m {
    public static final int[] M1 = {21600, 43200, 86400, 172800};
    public float A1;
    public float B1;
    public final org.telegram.ui.Components.y5 C1;
    public final org.telegram.ui.Components.y5 D1;
    public final org.telegram.ui.Components.y5 E1;
    public final org.telegram.ui.Components.y5 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final n L1;
    public final ImageView O0;
    public final ImageView P0;
    public final l Q0;
    public x60 R0;
    public boolean S0;
    public int T0;
    public Drawable U0;
    public boolean V0;
    public final r W0;
    public final org.telegram.ui.Components.i6 X0;
    public float Y0;
    public float Z0;
    public long f15979a1;
    public final Paint f15980b1;
    public final Paint f15981c1;
    public final org.telegram.ui.Components.t9 f15982d1;
    public final org.telegram.ui.Components.t9 f15983e1;
    public final Drawable f15984f1;
    public float f15985g1;
    public final org.telegram.ui.Components.y5 f15986h1;
    public final Path f15987i1;
    public final Path f15988j1;
    public final Paint f15989k1;
    public final Paint l1;
    public final Paint f15990m1;
    public final Paint f15991n1;
    public final org.telegram.ui.Components.y5 f15992o1;
    public final RectF f15993p1;
    public final RectF f15994q1;
    public final RectF f15995r1;
    public final Path f15996s1;
    public nz0 f15997t1;
    public Path f15998u1;
    public Paint f15999v1;
    public nz0 f16000w1;
    public Utilities.Callback f16001x1;
    public Utilities.Callback f16002y1;
    public q f16003z1;

    public s(Context context, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, ih.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context, frameLayout, xu0Var, frameLayout2, bVar, baVar);
        this.S0 = true;
        this.T0 = 0;
        mb mbVar = (mb) this;
        this.W0 = new r(mbVar, mbVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.X0 = i6Var;
        gr grVar = gr.f28844f;
        i6Var.k(0.16f, 50L, grVar);
        i6Var.t(AndroidUtilities.dp(15.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.q("0:00.0", true, true);
        i6Var.r(-1);
        Paint paint = new Paint(1);
        this.f15980b1 = paint;
        Paint paint2 = new Paint(1);
        this.f15981c1 = paint2;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(11, 360928);
        this.f15982d1 = t9Var;
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(12, 360928);
        this.f15983e1 = t9Var2;
        paint.setColor(-1);
        paint2.setColor(-15033089);
        t9Var.f32647a = AndroidUtilities.dp(47.0f);
        t9Var.f32648b = AndroidUtilities.dp(55.0f);
        t9Var.b();
        t9Var2.f32647a = AndroidUtilities.dp(47.0f);
        t9Var2.f32648b = AndroidUtilities.dp(55.0f);
        t9Var2.b();
        this.f15984f1 = getContext().getResources().getDrawable(R.drawable.input_video_pressed).mutate();
        this.f15986h1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 200L, grVar, 0);
        this.f15987i1 = new Path();
        this.f15988j1 = new Path();
        this.f15989k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.f15990m1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f15991n1 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        n nVar = new n(mbVar, 0);
        gr grVar2 = gr.h;
        this.f15992o1 = new org.telegram.ui.Components.y5(nVar, 350L, grVar2);
        this.f15993p1 = new RectF();
        this.f15994q1 = new RectF();
        this.f15995r1 = new RectF();
        this.f15996s1 = new Path();
        this.C1 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar2);
        this.D1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 420L, grVar2, 0);
        this.E1 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar2);
        this.F1 = new org.telegram.ui.Components.y5(new n(mbVar, 0), 350L, grVar2, 0);
        this.L1 = new n(mbVar, 1);
        ImageView imageView = new ImageView(context);
        this.O0 = imageView;
        imageView.setImageResource(R.drawable.input_video_story);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        addView(imageView, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 6.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(mbVar, 26));
        ImageView imageView2 = new ImageView(context);
        this.P0 = imageView2;
        l lVar = new l(5);
        this.Q0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        imageView2.setContentDescription(LocaleController.getString(R.string.StoryPeriodHint));
        A(86400, false);
        addView(imageView2, g7.e6.d(44, 44.0f, 85, 0.0f, 0.0f, 51.0f, 6.0f));
        imageView2.setOnClickListener(new fg.f(mbVar, frameLayout, bVar, 13));
    }

    public final void A(int i9, boolean z10) {
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                if (M1[i10] == i9) {
                    break;
                }
                i10++;
            } else {
                i10 = 2;
                break;
            }
        }
        if (this.T0 == i10) {
            return;
        }
        this.T0 = i10;
        this.Q0.d(i9 / 3600, false, z10);
    }

    public final void B() {
        if (this.V0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f15623a);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StoryRemoveRoundTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StoryRemoveRoundMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new p(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            TextView textView = (TextView) alertDialog$Builder.o().d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, this.f15623a));
            }
        }
    }

    @Override
    public final int b() {
        return 36;
    }

    @Override
    public final void c(boolean z10) {
        int i9;
        int i10 = 0;
        if (!z10 && this.S0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ImageView imageView = this.P0;
        imageView.setVisibility(i9);
        if (z10) {
            i10 = 8;
        }
        this.O0.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i9;
        if (!z10) {
            if (this.S0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            this.P0.setVisibility(i9);
            this.O0.setVisibility(0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: kh.s.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        int i9;
        Canvas canvas3 = canvas;
        if (this.f16003z1 != null) {
            float e10 = this.C1.e(this.G1);
            float e11 = this.E1.e(this.I1);
            if (this.f15979a1 <= 0) {
                this.f15979a1 = System.currentTimeMillis();
            }
            float sin = (((float) Math.sin((((float) (System.currentTimeMillis() - this.f15979a1)) / 900.0f) * 3.141592653589793d)) + 1.0f) / 2.0f;
            float dp = rectF.left + AndroidUtilities.dp(21.0f);
            float dp2 = rectF.bottom - AndroidUtilities.dp(20.0f);
            r rVar = this.W0;
            rVar.setBounds((int) (dp - AndroidUtilities.dp(12.0f)), (int) (dp2 - AndroidUtilities.dp(12.0f)), (int) (dp + AndroidUtilities.dp(12.0f)), (int) (dp2 + AndroidUtilities.dp(12.0f)));
            rVar.draw(canvas3);
            int dp3 = (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) + AndroidUtilities.dp(9.0f));
            org.telegram.ui.Components.i6 i6Var = this.X0;
            i6Var.setBounds((int) ((rectF.left + AndroidUtilities.dp(33.3f)) - (AndroidUtilities.dp(10.0f) * e10)), (int) ((rectF.bottom - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(9.0f)), (int) (rectF.left + AndroidUtilities.dp(133.3f)), dp3);
            long b10 = this.f16003z1.b();
            int i10 = (int) (b10 / 1000);
            int i11 = (int) ((b10 - (i10 * 1000)) / 100);
            int i12 = i10 / 60;
            int i13 = i10 % 60;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(":");
            if (i13 < 10) {
                str = "0";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(i13);
            sb2.append(".");
            sb2.append(i11);
            i6Var.q(sb2.toString(), true, true);
            i6Var.f29351w = (int) ((1.0f - e10) * 255.0f);
            i6Var.draw(canvas3);
            float f15 = 1.0f - e11;
            float f16 = (1.0f - this.Y0) * f15;
            Paint c10 = this.L.c(1.0f);
            if (c10 != null) {
                f10 = f16;
                paint = c10;
                f11 = 10.0f;
                f12 = 12.0f;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas3 = canvas;
            } else {
                f10 = f16;
                paint = c10;
                f11 = 10.0f;
                f12 = 12.0f;
            }
            int i14 = -2130706433;
            if (f10 > 0.0f) {
                if (this.f15997t1 == null) {
                    this.f15997t1 = new nz0(LocaleController.getString(R.string.SlideToCancel2), 15.0f, null);
                }
                if (this.f15998u1 == null) {
                    Path path = new Path();
                    this.f15998u1 = path;
                    path.moveTo(AndroidUtilities.dp(3.83f), 0.0f);
                    this.f15998u1.lineTo(0.0f, AndroidUtilities.dp(5.0f));
                    this.f15998u1.lineTo(AndroidUtilities.dp(3.83f), AndroidUtilities.dp(f11));
                    Paint paint2 = new Paint(1);
                    this.f15999v1 = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.f15999v1.setStrokeCap(Paint.Cap.ROUND);
                    this.f15999v1.setStrokeJoin(Paint.Join.ROUND);
                }
                this.f15999v1.setStrokeWidth(AndroidUtilities.dp(1.33f));
                this.f15997t1.f31234p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float centerX = (rectF.centerX() - ((this.f15997t1.l() + AndroidUtilities.dp(11.33f)) / 2.0f)) - (AndroidUtilities.lerp(this.Y0, 1.0f, e11) * (rectF.width() / 6.0f));
                float C = j3.r0.C(1.0f, this.Y0, AndroidUtilities.dp(6.0f) * sin, centerX);
                if (paint != null) {
                    i9 = -1;
                } else {
                    i9 = -2130706433;
                }
                int l1 = org.telegram.ui.ActionBar.f6.l1(f10, i9);
                canvas3.save();
                canvas3.translate(C, rectF.centerY() - AndroidUtilities.dp(5.0f));
                this.f15999v1.setColor(l1);
                canvas3.drawPath(this.f15998u1, this.f15999v1);
                canvas3.restore();
                f13 = 15.0f;
                f14 = 0.0f;
                this.f15997t1.c(C + AndroidUtilities.dp(11.33f), rectF.centerY(), 1.0f, l1, canvas3);
            } else {
                f13 = 15.0f;
                f14 = 0.0f;
            }
            if (e11 > f14) {
                if (this.f16000w1 == null) {
                    this.f16000w1 = new nz0(LocaleController.getString(R.string.CancelRound), f13, AndroidUtilities.bold());
                }
                this.f16000w1.f31234p = (int) ((rectF.width() - AndroidUtilities.dp(116.0f)) - i6Var.d());
                float width = ((rectF.width() / 4.0f) * f15) + (rectF.centerX() - (this.f16000w1.l() / 2.0f));
                if (paint != null) {
                    i14 = -1;
                }
                canvas2 = canvas;
                this.f16000w1.c(width, rectF.centerY(), 1.0f, org.telegram.ui.ActionBar.f6.l1(e11, i14), canvas2);
                this.f15994q1.set(width - AndroidUtilities.dp(f12), rectF.top, this.f16000w1.l() + width + AndroidUtilities.dp(f12), rectF.bottom);
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
        boolean z11 = this.G1;
        org.telegram.ui.Components.y5 y5Var = this.D1;
        float e10 = y5Var.e(z11);
        boolean z12 = this.I1;
        org.telegram.ui.Components.y5 y5Var2 = this.F1;
        float e11 = y5Var2.e(z12);
        float d = this.f15986h1.d(this.f15985g1, false);
        float z13 = e2.c.z(1.0f, this.Y0, AndroidUtilities.dp(30.0f) * d, AndroidUtilities.dp(41.0f));
        float f19 = 1.0f - e10;
        float f20 = z13 * f19 * f10;
        float lerp = AndroidUtilities.lerp(j3.r0.C(1.0f, e11, getWidth() * 0.35f * this.Y0, rectF.right - AndroidUtilities.dp(20.0f)), rectF.left + AndroidUtilities.dp(20.0f), e10);
        float dp = rectF.bottom - AndroidUtilities.dp(20.0f);
        boolean isEnabled = LiteMode.isEnabled(360928);
        Paint paint = this.f15981c1;
        if (isEnabled) {
            org.telegram.ui.Components.t9 t9Var = this.f15982d1;
            t9Var.f32647a = AndroidUtilities.dp(47.0f);
            Paint paint2 = t9Var.d;
            f13 = 0.0f;
            t9Var.f32648b = (AndroidUtilities.dp(15.0f) * 0.6f) + AndroidUtilities.dp(47.0f);
            f11 = e11;
            org.telegram.ui.Components.t9 t9Var2 = this.f15983e1;
            t9Var2.f32647a = AndroidUtilities.dp(50.0f);
            Paint paint3 = t9Var2.d;
            f12 = f19;
            t9Var2.f32648b = (AndroidUtilities.dp(12.0f) * 0.6f) + AndroidUtilities.dp(50.0f);
            t9Var2.e(d, 1.01f);
            t9Var.e(d, 1.02f);
            paint3.setColor(org.telegram.ui.ActionBar.f6.l1(0.15f * f10, paint.getColor()));
            canvas.save();
            float f21 = f20 / t9Var2.f32647a;
            canvas.scale(f21, f21, lerp, dp);
            t9Var2.a(lerp, dp, canvas, paint3);
            canvas.restore();
            paint2.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f * f10, paint.getColor()));
            canvas.save();
            float f22 = f20 / t9Var.f32647a;
            canvas.scale(f22, f22, lerp, dp);
            t9Var.a(lerp, dp, canvas, paint2);
            canvas.restore();
        } else {
            f11 = e11;
            f12 = f19;
            f13 = 0.0f;
        }
        float min = Math.min(f20, AndroidUtilities.dp(55.0f));
        float f23 = f10 * 255.0f;
        paint.setAlpha((int) f23);
        canvas.drawCircle(lerp, dp, min, paint);
        canvas.save();
        Path path = this.f15987i1;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(lerp, dp, min, direction);
        canvas.clipPath(path);
        Drawable drawable = this.f15984f1;
        float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.H1) {
            f14 = f10;
        } else {
            f14 = 1.0f;
        }
        int i9 = (int) (lerp - (intrinsicWidth * f14));
        float intrinsicHeight = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.H1) {
            f15 = f10;
        } else {
            f15 = 1.0f;
        }
        int i10 = (int) (dp - (intrinsicHeight * f15));
        float intrinsicWidth2 = (drawable.getIntrinsicWidth() / 2.0f) * f12;
        if (this.H1) {
            f16 = f10;
        } else {
            f16 = 1.0f;
        }
        int i11 = (int) ((intrinsicWidth2 * f16) + lerp);
        float intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2.0f) * f12;
        if (this.H1) {
            f17 = f10;
        } else {
            f17 = 1.0f;
        }
        drawable.setBounds(i9, i10, i11, (int) ((intrinsicHeight2 * f17) + dp));
        float f24 = f12 * 255.0f;
        if (this.H1) {
            f18 = f10;
        } else {
            f18 = 1.0f;
        }
        drawable.setAlpha((int) (f24 * f18));
        drawable.draw(canvas);
        if (f11 > f13) {
            float dpf2 = (AndroidUtilities.dpf2(19.33f) / 2.0f) * f11 * f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(lerp - dpf2, dp - dpf2, lerp + dpf2, dp + dpf2);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.33f), AndroidUtilities.dp(5.33f), this.f15980b1);
        }
        canvas.restore();
        float f25 = y5Var.f34854c;
        float f26 = y5Var2.f34854c;
        if (this.Y0 < 0.4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float y10 = org.telegram.messenger.l0.y(1.0f, f25, AndroidUtilities.lerp(this.f15992o1.e(z10), 0.0f, f26), f10);
        float dp2 = rectF.right - AndroidUtilities.dp(20.0f);
        float lerp2 = (AndroidUtilities.lerp(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(36.0f), f26) * y10) / 2.0f;
        float f27 = 1.0f - f26;
        float lerp3 = AndroidUtilities.lerp(((rectF.bottom - AndroidUtilities.dp(80.0f)) - lerp2) - ((AndroidUtilities.dp(120.0f) * this.Z0) * f27), rectF.bottom - AndroidUtilities.dp(20.0f), 1.0f - y10);
        float dp3 = (AndroidUtilities.dp(36.0f) * y10) / 2.0f;
        RectF rectF3 = this.f15993p1;
        rectF3.set(dp2 - dp3, lerp3 - lerp2, dp3 + dp2, lerp2 + lerp3);
        float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), f26);
        int l1 = org.telegram.ui.ActionBar.f6.l1(y10, 536870912);
        Paint paint4 = this.l1;
        paint4.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), l1);
        paint4.setColor(0);
        canvas.drawRoundRect(rectF3, lerp4, lerp4, paint4);
        Paint c10 = this.N.c(y10);
        if (c10 == null) {
            Paint paint5 = this.f15989k1;
            paint5.setColor(1073741824);
            paint5.setAlpha((int) (64.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint5);
        } else {
            canvas.drawRoundRect(rectF3, lerp4, lerp4, c10);
            Paint paint6 = this.f15630e;
            paint6.setAlpha((int) (51.0f * y10));
            canvas.drawRoundRect(rectF3, lerp4, lerp4, paint6);
        }
        canvas.save();
        canvas.scale(y10, y10, dp2, lerp3);
        int l12 = org.telegram.ui.ActionBar.f6.l1(y10, -1);
        Paint paint7 = this.f15990m1;
        paint7.setColor(l12);
        int l13 = org.telegram.ui.ActionBar.f6.l1(y10 * f27, -1);
        Paint paint8 = this.f15991n1;
        paint8.setColor(l13);
        float dp4 = (AndroidUtilities.dp(4.0f) * f27) + lerp3;
        canvas.rotate(this.Z0 * 12.0f * f27, dp2, dp4);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(15.33f), AndroidUtilities.dp(13.0f), f26) / 2.0f;
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(13.0f), f26) / 2.0f;
        float f28 = dp4 - lerp6;
        RectF rectF4 = this.f15995r1;
        rectF4.set(dp2 - lerp5, f28, lerp5 + dp2, dp4 + lerp6);
        canvas.drawRoundRect(rectF4, AndroidUtilities.dp(3.66f), AndroidUtilities.dp(3.66f), paint7);
        if (f26 < 1.0f) {
            canvas.save();
            canvas.rotate(this.Z0 * 12.0f * f27, dp2, f28);
            canvas.translate(0.0f, lerp6 * f26);
            canvas.scale(f27, f27, dp2, f28);
            Path path2 = this.f15996s1;
            path2.rewind();
            float dp5 = AndroidUtilities.dp(4.33f);
            float dp6 = f28 - AndroidUtilities.dp(3.66f);
            float f29 = dp2 + dp5;
            path2.moveTo(f29, AndroidUtilities.dp(3.66f) + dp6);
            path2.lineTo(f29, dp6);
            RectF rectF5 = AndroidUtilities.rectTmp;
            float f30 = dp2 - dp5;
            rectF5.set(f30, dp6 - dp5, f29, dp5 + dp6);
            path2.arcTo(rectF5, 0.0f, -180.0f, false);
            path2.lineTo(f30, (AndroidUtilities.lerp(AndroidUtilities.lerp(0.4f, 0.0f, this.Z0), 1.0f, f26) * AndroidUtilities.dp(3.66f)) + dp6);
            paint8.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.drawPath(path2, paint8);
            canvas.restore();
        }
        canvas.restore();
        if (this.G1) {
            ImageView imageView = this.O0;
            int visibility = imageView.getVisibility();
            org.telegram.ui.Components.y5 y5Var3 = this.I0;
            ImageView imageView2 = this.P0;
            if (visibility == 4 || imageView2.getVisibility() == 4 || y5Var3.f34854c > 0.0f) {
                canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.f15638k0) * 255.0f), 31);
                Path path3 = this.f15988j1;
                path3.rewind();
                path3.addRoundRect(rectF, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), direction);
                canvas.clipPath(path3);
                if (imageView.getVisibility() == 4 || y5Var3.f34854c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView.getX(), imageView.getY());
                    imageView.draw(canvas);
                    canvas.restore();
                }
                if (imageView2.getVisibility() == 4 || y5Var3.f34854c > 0.0f) {
                    canvas.save();
                    canvas.translate((AndroidUtilities.dp(180.0f) * f12) + imageView2.getX(), imageView2.getY());
                    imageView2.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
        if (this.U0 == null) {
            this.U0 = getContext().getDrawable(R.drawable.avd_flip);
        }
        this.U0.setAlpha((int) (f23 * f12));
        float timelineHeight = getTimelineHeight();
        this.U0.setBounds(AndroidUtilities.dp(4.0f) + ((int) rectF.left), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(48.0f)), (int) (rectF.left + AndroidUtilities.dp(40.0f)), (int) ((rectF.top - timelineHeight) - AndroidUtilities.dp(12.0f)));
        this.U0.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r rVar = this.W0;
        mi0 mi0Var = rVar.h;
        rVar.f15914f = true;
        if (rVar.f15915g) {
            mi0Var.start();
        }
        mi0Var.f30863r0 = rVar.f15916i;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r rVar = this.W0;
        rVar.f15914f = false;
        mi0 mi0Var = rVar.h;
        mi0Var.stop();
        mi0Var.f30863r0 = null;
    }

    public void setAmplitude(double d) {
        this.f15985g1 = (float) (Math.min(1800.0d, d) / 1800.0d);
        invalidate();
    }

    public void setHasRoundVideo(boolean z10) {
        int i9;
        int i10;
        if (z10) {
            i9 = R.drawable.input_video_story_remove;
        } else {
            i9 = R.drawable.input_video_story;
        }
        ImageView imageView = this.O0;
        imageView.setImageResource(i9);
        if (z10) {
            i10 = R.string.AccDescrRemoveRoundVideo;
        } else {
            i10 = R.string.AccDescrVideoMessage;
        }
        imageView.setContentDescription(LocaleController.getString(i10));
        this.V0 = z10;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.f16001x1 = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.f16002y1 = callback;
    }

    public void setPeriod(int i9) {
        A(i9, true);
    }

    public void setPeriodVisible(boolean z10) {
        int i9;
        this.S0 = z10;
        if (z10 && !this.f15639l0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.P0.setVisibility(i9);
    }

    @Override
    public final void u(float f10) {
        float f11 = 1.0f - f10;
        this.P0.setAlpha(f11);
        this.O0.setAlpha(f11);
    }

    public final void z(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.L1);
        this.H1 = true;
        this.K1 = false;
        this.G0 = false;
        this.H0 = (int) ((getBounds().right - AndroidUtilities.dp(20.0f)) - ((getWidth() * 0.35f) * this.Y0));
        invalidate();
        q qVar = this.f16003z1;
        if (qVar != null) {
            if (!z10) {
                if (z11) {
                    qVar.f15162x = true;
                    AndroidUtilities.cancelRunOnUIThread(qVar.h);
                    CameraController.getInstance().stopVideoRecording(qVar.f15153a.getCameraSessionRecording(), false, false);
                    qVar.a(false);
                } else {
                    qVar.c();
                }
            }
            this.f16003z1 = null;
        }
        n();
    }
}
