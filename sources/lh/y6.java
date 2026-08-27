package lh;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

public final class y6 extends View implements q2 {
    public final Paint A;
    public final org.telegram.ui.Components.y5 A0;
    public final Paint B;
    public final org.telegram.ui.Components.y5 B0;
    public final Paint C;
    public final org.telegram.ui.Components.y5 C0;
    public final Matrix D;
    public float D0;
    public final RadialGradient E;
    public final org.telegram.ui.Components.y5 E0;
    public final org.telegram.ui.Components.nc F;
    public final org.telegram.ui.Components.y5 F0;
    public final org.telegram.ui.Components.nc G;
    public final org.telegram.ui.Components.y5 G0;
    public final org.telegram.ui.Components.nc H;
    public final v6 H0;
    public float I;
    public final v6 I0;
    public final org.telegram.ui.Components.y5 J;
    public final Path J0;
    public boolean K;
    public final Path K0;
    public final org.telegram.ui.Components.y5 L;
    public final PointF L0;
    public long M;
    public final PointF M0;
    public long N;
    public final PointF N0;
    public final Path O;
    public final PointF O0;
    public final PointF P;
    public final PointF P0;
    public final PointF Q;
    public final PointF Q0;
    public final PointF R;
    public final PointF R0;
    public final x6 S;
    public final PointF S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public boolean V;
    public boolean W;

    public w6 f17084a;

    public boolean f17085a0;

    public final ImageReceiver f17086b;

    public boolean f17087b0;

    public final dq f17088c;

    public float f17089c0;
    public final Drawable d;

    public final org.telegram.ui.Components.y5 f17090d0;

    public final Drawable f17091e;

    public float f17092e0;

    public final Drawable f17093f;

    public float f17094f0;

    public float f17095g0;
    public final Drawable h;

    public float f17096h0;

    public final org.telegram.ui.Components.y5 f17097i0;

    public float f17098j0;

    public boolean f17099k0;

    public final org.telegram.ui.Components.y5 f17100l0;
    public final org.telegram.ui.Components.y5 m0;

    public final Drawable f17101n;

    public boolean f17102n0;

    public final float[] f17103o0;

    public final org.telegram.ui.Components.y5 f17104p0;

    public boolean f17105q0;

    public final Paint f17106r;

    public long f17107r0;

    public final Paint f17108s;

    public boolean f17109s0;

    public boolean f17110t0;

    public float f17111u0;
    public final Paint v;

    public boolean f17112v0;

    public final Paint f17113w;

    public boolean f17114w0;

    public final Paint f17115x;

    public final org.telegram.ui.Components.y5 f17116x0;

    public final Paint f17117y;

    public final org.telegram.ui.Components.y5 f17118y0;

    public final org.telegram.ui.Components.y5 f17119z0;

    public y6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f17086b = imageReceiver;
        this.f17106r = new Paint(1);
        Paint paint = new Paint(1);
        this.f17108s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f17113w = paint3;
        Paint paint4 = new Paint(1);
        this.f17115x = paint4;
        Paint paint5 = new Paint(1);
        this.f17117y = paint5;
        Paint paint6 = new Paint(1);
        this.A = paint6;
        Paint paint7 = new Paint(1);
        this.B = paint7;
        Paint paint8 = new Paint(1);
        this.C = paint8;
        Matrix matrix = new Matrix();
        this.D = matrix;
        this.F = new org.telegram.ui.Components.nc(this);
        this.G = new org.telegram.ui.Components.nc(this);
        this.H = new org.telegram.ui.Components.nc(this);
        er erVar = er.h;
        this.J = new org.telegram.ui.Components.y5(this, 0L, 310L, erVar);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 330L, erVar);
        this.O = new Path();
        this.P = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.Q = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.R = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f17090d0 = new org.telegram.ui.Components.y5(this, 0L, 200L, er.f28122f);
        this.f17097i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.f17098j0 = -1.0f;
        this.f17099k0 = true;
        this.f17100l0 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 850L, erVar);
        this.f17103o0 = new float[2];
        this.f17104p0 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.f17116x0 = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.f17118y0 = new org.telegram.ui.Components.y5(this, 0L, 650L, erVar);
        this.f17119z0 = new org.telegram.ui.Components.y5(this, 0L, 160L, er.f28124i);
        this.A0 = new org.telegram.ui.Components.y5(this, 0L, 750L, erVar);
        this.B0 = new org.telegram.ui.Components.y5(this, 0L, 650L, erVar);
        this.C0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.E0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.F0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.G0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.H0 = new v6(this, 2);
        this.I0 = new v6(this, 3);
        this.J0 = new Path();
        this.K0 = new Path();
        this.L0 = new PointF();
        this.M0 = new PointF();
        this.N0 = new PointF();
        this.O0 = new PointF();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        setWillNotDraw(false);
        x6 x6Var = new x6(this, this);
        this.S = x6Var;
        r0.j0.k(this, x6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.setParentView(this);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        dq dqVar = new dq(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), -13750737), drawableMutate);
        this.f17088c = dqVar;
        dqVar.f27828w = false;
        int iDp = AndroidUtilities.dp(24.0f);
        int iDp2 = AndroidUtilities.dp(24.0f);
        dqVar.f27823e = iDp;
        dqVar.f27824f = iDp2;
        Drawable drawableMutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.f17091e = drawableMutate3;
        drawableMutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f17093f = drawableMutate4;
        drawableMutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = drawableMutate5;
        drawableMutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable drawableMutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f17101n = drawableMutate6;
        drawableMutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d10 = f12;
        pointF.x = (float) ((Math.cos(d) * d10) + ((double) f10));
        pointF.y = (float) ((Math.sin(d) * d10) + ((double) f11));
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float fMax = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - fMax), (int) (f11 - fMax), (int) (f10 + fMax), (int) (f11 + fMax));
    }

    public final boolean b() {
        return this.D0 >= 1.0f;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f17102n0) {
            return (!z10 || f13 - f11 <= ((float) AndroidUtilities.dp(100.0f))) && Math.abs(f12 - f10) <= f14;
        }
        return h7.y.a(f10, f11, f12, f13) <= f14;
    }

    public final void d(float f10) {
        this.J.f34815g = f10 > 180.0f ? 620L : 310L;
        this.I += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        x6 x6Var = this.S;
        if (x6Var == null || !x6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f10, boolean z10) {
        if (Math.abs(f10 - this.D0) < 0.01f) {
            return;
        }
        this.D0 = f10;
        if (!z10) {
            this.E0.f(f10 > 0.0f && !this.f17102n0, true);
            this.F0.d(f10, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f17105q0 = false;
        if (!z10) {
            org.telegram.ui.Components.y5 y5Var = this.f17104p0;
            y5Var.getClass();
            y5Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        w6 w6Var = this.f17084a;
        ImageReceiver imageReceiver = this.f17086b;
        if (w6Var != null) {
            w6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f13974w.f15625b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((z7) arrayList2.get(0)).O0 != null) {
                this.f17086b.setImage(ImageLocation.getForPath(((z7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f17088c, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        MediaController.PhotoEntry photoEntry = (albumEntry == null || (arrayList = albumEntry.photos) == null || arrayList.isEmpty()) ? null : albumEntry.photos.get(0);
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.f17086b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f17088c, 0L, null, null, 0);
            return;
        }
        if (photoEntry == null || photoEntry.path == null) {
            imageReceiver.setImageBitmap(this.f17088c);
            return;
        }
        if (photoEntry.isVideo) {
            this.f17086b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f17088c, 0L, null, null, 0);
            return;
        }
        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
        this.f17086b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f17088c, 0L, null, null, 0);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17086b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f17086b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        Canvas canvas2;
        float f15;
        float f16;
        RectF rectF;
        Paint paint;
        float f17;
        RectF rectF2;
        Canvas canvas3;
        float f18;
        float fLerp;
        float f19;
        org.telegram.ui.Components.y5 y5Var;
        org.telegram.ui.Components.nc ncVar;
        float f20;
        float f21;
        double d;
        double dAcos;
        float fD = this.f17100l0.d(this.f17102n0 ? 1.0f : 0.0f, false);
        float fD2 = this.m0.d(this.f17102n0 ? 1.0f : 0.0f, false);
        float fD3 = this.f17098j0;
        if (fD3 < 0.0f) {
            fD3 = this.f17097i0.d(this.f17099k0 ? 1.0f : 0.0f, false);
        }
        float fMax = Math.max(fD, fD3);
        float fD4 = this.f17116x0.d(this.f17109s0 ? 1.0f : 0.0f, false);
        float fAbs = Math.abs(this.f17111u0 - this.f17092e0);
        float fDp = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.nc ncVar2 = this.F;
        float fD5 = this.f17118y0.d((fAbs >= fDp || !(this.f17102n0 || ncVar2.h)) ? 0.0f : 1.0f, false) * fD4;
        float fD6 = this.f17119z0.d(Math.abs(this.f17111u0 - this.f17092e0) < ((float) AndroidUtilities.dp(64.0f)) ? 1.0f : 0.0f, false) * fD4;
        float fClamp = Utilities.clamp((this.f17111u0 - this.f17092e0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float fClamp2 = Utilities.clamp((this.f17111u0 - this.f17092e0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        float fD7 = this.B0.d(Math.min(Math.abs(this.f17111u0 - this.f17096h0), Math.abs(this.f17111u0 - this.f17095g0)) < ((float) AndroidUtilities.dp(16.0f)) ? 1.0f : 0.0f, false) * fD4;
        float f22 = 1.0f - fD;
        float fE = this.E0.e(this.D0 > 0.0f) * f22;
        float fD8 = this.F0.d(this.D0, false);
        float fE2 = this.G0.e(b());
        float f23 = this.f17112v0 ? fD * fMax * fD4 : 0.0f;
        if (f23 > 0.0f) {
            f13 = 1.0f;
            float fDp2 = this.f17092e0 - AndroidUtilities.dp(50.0f);
            f14 = 0.0f;
            float fDp3 = this.f17092e0 + AndroidUtilities.dp(50.0f);
            float fDp4 = AndroidUtilities.dp(2.0f);
            Paint paint2 = this.A;
            paint2.setStrokeWidth(fDp4);
            float fDp5 = AndroidUtilities.dp(2.0f);
            Paint paint3 = this.B;
            paint3.setStrokeWidth(fDp5);
            float f24 = f23;
            f12 = fD2;
            f10 = fD6;
            c10 = 1;
            f11 = fE2;
            canvas.drawLine(fDp3, this.f17094f0, AndroidUtilities.lerp(fDp3, this.f17096h0 - AndroidUtilities.dp(30.0f), f23), this.f17094f0, paint3);
            canvas.drawLine(fDp3, this.f17094f0, AndroidUtilities.lerp(fDp3, this.f17096h0 - AndroidUtilities.dp(30.0f), f24), this.f17094f0, paint2);
            canvas.drawLine(fDp2, this.f17094f0, AndroidUtilities.lerp(fDp2, this.f17095g0 + AndroidUtilities.dp(30.0f), f24), this.f17094f0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(fDp2, this.f17094f0, AndroidUtilities.lerp(fDp2, this.f17095g0 + AndroidUtilities.dp(30.0f), f24), this.f17094f0, paint2);
        } else {
            f10 = fD6;
            f11 = fE2;
            f12 = fD2;
            c10 = 1;
            f13 = 1.0f;
            f14 = 0.0f;
            canvas2 = canvas;
        }
        float f25 = this.f17092e0;
        float fLerp2 = AndroidUtilities.lerp(f25, this.A0.d((AndroidUtilities.dp(4.0f) * fClamp) + f25, false), fD5);
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), fD), AndroidUtilities.dp(32.0f) - (Math.abs(fClamp2) * AndroidUtilities.dp(4.0f)), fD5);
        float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), fD), AndroidUtilities.dp(32.0f), fD5);
        float fLerp5 = AndroidUtilities.lerp(ncVar2.a(this.f17099k0 ? 0.0f : 0.2f), (this.f17090d0.d(this.f17089c0, false) * 0.2f) + f13, fD);
        RectF rectF3 = AndroidUtilities.rectTmp;
        float f26 = fLerp2 - fLerp3;
        float f27 = this.f17094f0;
        float f28 = fLerp2 + fLerp3;
        rectF3.set(f26, f27 - fLerp3, f28, f27 + fLerp3);
        float f29 = f13 - f11;
        int iD = i0.b.d(fMax * f29, -1, -577231);
        Paint paint4 = this.f17106r;
        paint4.setColor(iD);
        if (f11 > f14) {
            canvas2.save();
            canvas2.scale(fLerp5, fLerp5, this.f17092e0, this.f17094f0);
            paint4.setAlpha((int) (f29 * 255.0f));
            canvas2.drawRoundRect(rectF3, fLerp4, fLerp4, paint4);
            canvas2.restore();
            f15 = f29;
            f16 = fLerp5;
            rectF = rectF3;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f15 = f29;
            f16 = fLerp5;
            rectF = rectF3;
            paint = paint4;
            canvas2.save();
        }
        canvas2.scale(f16, f16, this.f17092e0, this.f17094f0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, fLerp4, fLerp4, paint);
        if (f11 > f14) {
            float fDp6 = AndroidUtilities.dp(4.0f);
            Paint paint5 = this.C;
            paint5.setStrokeWidth(fDp6);
            Path path = this.O;
            path.rewind();
            PointF pointF = this.P;
            f17 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f30 = pointF.x;
            PointF pointF2 = this.Q;
            float f31 = f11 / 0.3f;
            path.lineTo(AndroidUtilities.lerp(f30, pointF2.x, Utilities.clamp(f31, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f31, 1.0f, 0.0f)));
            if (f11 > 0.3f) {
                float f32 = pointF2.x;
                PointF pointF3 = this.R;
                float f33 = (f11 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f32, pointF3.x, Utilities.clamp(f33, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f33, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f17092e0, this.f17094f0);
            canvas2.drawPath(path, paint5);
        } else {
            f17 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float fMax2 = Math.max(f16, 1.0f);
        canvas2.scale(fMax2, fMax2, this.f17092e0, this.f17094f0);
        float fMax3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - fD5) * AndroidUtilities.dp(5.0f) * fE) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), fD5) + fLerp3);
        float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), fE);
        float fLerp7 = AndroidUtilities.lerp(fMax3, (fLerp3 - fLerp6) - AndroidUtilities.dp(4.0f), f11);
        float f34 = this.f17092e0;
        float f35 = this.f17094f0;
        RectF rectF4 = rectF;
        rectF4.set(f34 - fLerp7, f35 - fLerp7, f34 + fLerp7, f35 + fLerp7);
        Paint paint6 = this.f17108s;
        paint6.setStrokeWidth(fLerp6);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, fE) * 255.0f * f15));
        canvas2.drawCircle(this.f17092e0, this.f17094f0, fLerp7, paint6);
        if ((fD8 > 0.0f) && ((fE > 0.0f ? 1 : (fE == 0.0f ? 0 : -1)) > 0)) {
            paint6.setAlpha(255);
            rectF2 = rectF4;
            canvas2.drawArc(rectF2, -90.0f, fD8 * 360.0f, false, paint6);
        } else {
            rectF2 = rectF4;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.M;
        float f36 = this.f17102n0 ? 0.0f : 1.0f - f12;
        long j10 = this.f17084a != null ? 177000L : 60000L;
        float fMin = Math.min((jCurrentTimeMillis / 60000) * 360.0f, 360.0f);
        float fE3 = this.f17104p0.e(this.f17105q0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(fLerp6);
        paint7.setAlpha((int) (Math.max(fE3 * f17, 1.0f - f36) * 255.0f));
        if (fE3 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF2, -90.0f, fMin, false, paint7);
        } else {
            hp.a(this.f17103o0, (SystemClock.elapsedRealtime() - this.f17107r0) % 5400);
            invalidate();
            float[] fArr = this.f17103o0;
            float f37 = fArr[0];
            float f38 = fArr[c10];
            float fLerp8 = (f37 + f38) / 2.0f;
            float fAbs2 = Math.abs(f38 - f37) / 2.0f;
            if (this.f17105q0) {
                float f39 = fMin / 2.0f;
                fLerp8 = AndroidUtilities.lerp((-90.0f) + f39, fLerp8, fE3);
                fAbs2 = AndroidUtilities.lerp(f39, fAbs2, fE3);
            }
            float f40 = fLerp8 - fAbs2;
            float f41 = fAbs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF2, f40, f41, false, paint7);
        }
        if (this.f17102n0) {
            invalidate();
            long j11 = jCurrentTimeMillis / 1000;
            if (j11 != this.N / 1000) {
                ((oa) this.f17084a).f16494a.F0.a(j11, true);
            }
            if (j10 > 0 && jCurrentTimeMillis >= j10) {
                post(new v6(this, 0));
            }
            this.N = jCurrentTimeMillis;
        }
        canvas3.restore();
        boolean z10 = this.f17114w0;
        org.telegram.ui.Components.nc ncVar3 = this.H;
        if (z10) {
            float fA = ncVar3.a(0.2f) * fD;
            if (fA > 0.0f) {
                canvas3.save();
                canvas3.scale(fA, fA, this.f17095g0, this.f17094f0);
                canvas3.drawCircle(this.f17095g0, this.f17094f0, AndroidUtilities.dp(22.0f), this.f17113w);
                canvas3.rotate(-getRotation(), this.f17095g0, this.f17094f0);
                this.f17093f.draw(canvas3);
                canvas3.restore();
            }
        }
        float fA2 = ncVar3.a(0.2f) * f22 * f15;
        if (fA2 > 0.0f) {
            canvas3.save();
            canvas3.scale(fA2, fA2, this.f17095g0, this.f17094f0);
            canvas3.rotate(-getRotation(), this.f17095g0, this.f17094f0);
            this.f17086b.draw(canvas3);
            canvas3.restore();
        }
        float fD9 = this.L.d(this.K ? 1.0f : 0.0f, false);
        Paint paint8 = this.f17115x;
        org.telegram.ui.Components.y5 y5Var2 = this.J;
        org.telegram.ui.Components.nc ncVar4 = this.G;
        if (fD9 > 0.0f) {
            canvas3.save();
            float fA3 = ncVar4.a(0.2f) * fD9 * f15;
            canvas3.scale(fA3, fA3, this.f17096h0, this.f17094f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.f17096h0, this.f17094f0);
            canvas3.drawCircle(this.f17096h0, this.f17094f0, AndroidUtilities.dp(22.0f), paint8);
            this.f17091e.draw(canvas3);
            canvas3.restore();
        }
        if (fD9 < 1.0f) {
            canvas3.save();
            f18 = f15;
            float fZ = org.telegram.messenger.y1.z(1.0f, fD9, ncVar4.a(0.2f), f18);
            canvas3.scale(fZ, fZ, this.f17096h0, this.f17094f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.f17096h0, this.f17094f0);
            canvas3.drawCircle(this.f17096h0, this.f17094f0, AndroidUtilities.dp(22.0f), this.f17113w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f18 = f15;
        }
        if (!this.f17112v0 || b()) {
            fLerp = 0.0f;
        } else {
            fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(fClamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), fD7), Math.max(fD7, fD5)) * fD4 * fMax * fD;
        }
        float fD10 = this.C0.d((this.f17112v0 || !this.f17102n0) ? 0.0f : 1.0f, false);
        int i10 = (fLerp > 0.0f ? 1 : (fLerp == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint9 = this.f17117y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.f17111u0, this.f17094f0, fLerp, paint9);
            float f42 = this.f17111u0;
            float fAbs3 = 1.0f - ((Math.abs(fClamp2) * fD4) / 1.3f);
            f21 = 22.0f;
            float fClamp3 = Utilities.clamp(fAbs3, 1.0f, 0.0f);
            float fAbs4 = Math.abs(fLerp2 - f42);
            float f43 = fLerp * 2.0f;
            if (fAbs4 >= fLerp3 + f43 || fClamp3 >= 0.6f) {
                f19 = fLerp;
                y5Var = y5Var2;
                ncVar = ncVar4;
                fD10 = fD10;
                i10 = i10;
                f20 = f18;
            } else {
                float f44 = fLerp3 + fLerp;
                if (fAbs4 < f44) {
                    float f45 = fLerp3 * fLerp3;
                    float f46 = fAbs4 * fAbs4;
                    float f47 = fLerp * fLerp;
                    double dAcos2 = Math.acos(((f45 + f46) - f47) / ((fLerp3 * 2.0f) * fAbs4));
                    dAcos = Math.acos(((f47 + f46) - f45) / (f43 * fAbs4));
                    d = dAcos2;
                } else {
                    d = 0.0d;
                    dAcos = 0.0d;
                }
                double d10 = f42 > fLerp2 ? 0.0d : 3.141592653589793d;
                double d11 = d;
                double dAcos3 = (float) Math.acos((fLerp3 - fLerp) / fAbs4);
                double d12 = dAcos3 - d11;
                double d13 = fClamp3;
                double d14 = d12 * d13;
                double d15 = d10 + d11 + d14;
                double d16 = (d10 - d11) - d14;
                double d17 = ((3.141592653589793d - dAcos) - dAcos3) * d13;
                double d18 = ((d10 + 3.141592653589793d) - dAcos) - d17;
                double d19 = (d10 - 3.141592653589793d) + dAcos + d17;
                float f48 = this.f17094f0;
                PointF pointF4 = this.L0;
                a(fLerp2, f48, d15, fLerp3, pointF4);
                float f49 = this.f17094f0;
                PointF pointF5 = this.M0;
                a(fLerp2, f49, d16, fLerp3, pointF5);
                float f50 = this.f17094f0;
                PointF pointF6 = this.N0;
                float f51 = fLerp;
                a(f42, f50, d18, f51, pointF6);
                float f52 = this.f17094f0;
                PointF pointF7 = this.O0;
                a(f42, f52, d19, f51, pointF7);
                f19 = f51;
                f20 = f18;
                y5Var = y5Var2;
                ncVar = ncVar4;
                float fMin2 = Math.min(1.0f, (fAbs4 * 2.0f) / f44) * Math.min(fClamp3 * 2.4f, h7.y.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f44);
                float f53 = fLerp3 * fMin2;
                float f54 = f19 * fMin2;
                a(pointF4.x, pointF4.y, d15 - 1.5707963705062866d, f53, this.P0);
                a(pointF5.x, pointF5.y, d16 + 1.5707963705062866d, f53, this.Q0);
                a(pointF6.x, pointF6.y, d18 + 1.5707963705062866d, f54, this.R0);
                a(pointF7.x, pointF7.y, d19 - 1.5707963705062866d, f54, this.S0);
                float fC = com.google.android.recaptcha.internal.a.C(fD4, fMax, fD, f10);
                if (fC > 0.0f) {
                    Path path2 = this.J0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.P0;
                    float f55 = pointF8.x;
                    float f56 = pointF8.y;
                    fD = fD;
                    PointF pointF9 = this.R0;
                    path2.cubicTo(f55, f56, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.S0;
                    float f57 = pointF10.x;
                    float f58 = pointF10.y;
                    PointF pointF11 = this.Q0;
                    path2.cubicTo(f57, f58, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (fC * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f59 = this.f17094f0;
                    rectF2.set(f26, f59 - fLerp3, f28, f59 + fLerp3);
                    canvas3.drawRoundRect(rectF2, fLerp4, fLerp4, paint9);
                } else {
                    fD = fD;
                }
            }
        } else {
            f19 = fLerp;
            y5Var = y5Var2;
            ncVar = ncVar4;
            fD10 = fD10;
            i10 = i10;
            f20 = f18;
            f21 = 22.0f;
        }
        if (i10 > 0 || fD10 > 0.0f) {
            float fA4 = ncVar3.a(0.2f) * fD * f20;
            canvas3.save();
            Path path3 = this.K0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.f17111u0, this.f17094f0, f19, Path.Direction.CW);
            }
            if (fD10 > 0.0f && this.f17114w0) {
                path3.addCircle(this.f17095g0, this.f17094f0, fD10 * AndroidUtilities.dp(f21) * fA4, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.f17114w0) {
                canvas3.save();
                canvas3.scale(fA4, fA4, this.f17095g0, this.f17094f0);
                canvas3.drawCircle(this.f17095g0, this.f17094f0, AndroidUtilities.dp(f21), paint8);
                canvas3.rotate(-getRotation(), this.f17095g0, this.f17094f0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float fA5 = ncVar.a(0.2f) * f20;
            canvas3.save();
            canvas3.scale(fA5, fA5, this.f17096h0, this.f17094f0);
            canvas3.rotate(y5Var.d(this.I, false) - getRotation(), this.f17096h0, this.f17094f0);
            canvas3.drawCircle(this.f17096h0, this.f17094f0, AndroidUtilities.dp(f21), paint8);
            this.f17091e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        x6 x6Var = this.S;
        if (x6Var == null) {
            return;
        }
        boolean zB = b();
        boolean z11 = this.T;
        boolean z12 = this.f17102n0;
        if (z11 == z12 && this.U == zB && this.V == this.K && this.W == this.f17099k0 && this.f17085a0 == this.f17105q0 && this.f17087b0 == this.f17114w0) {
            return;
        }
        this.T = z12;
        this.U = zB;
        this.V = this.K;
        this.W = this.f17099k0;
        this.f17085a0 = this.f17105q0;
        this.f17087b0 = this.f17114w0;
        x6Var.i();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(100.0f);
        float f10 = size;
        this.f17092e0 = f10 / 2.0f;
        this.f17094f0 = iDp / 2.0f;
        float fMin = Math.min(AndroidUtilities.dp(135.0f), f10 * 0.35f);
        float f11 = this.f17092e0;
        this.f17095g0 = f11 - fMin;
        float f12 = f11 + fMin;
        this.f17096h0 = f12;
        float f13 = this.f17094f0;
        float fDp = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f12 - fDp), (int) (f13 - fDp), (int) (f12 + fDp), (int) (f13 + fDp));
        float f14 = this.f17096h0;
        float f15 = this.f17094f0;
        float fDp2 = AndroidUtilities.dp(14.0f);
        this.f17091e.setBounds((int) (f14 - fDp2), (int) (f15 - fDp2), (int) (f14 + fDp2), (int) (f15 + fDp2));
        f(this.f17093f, this.f17095g0, this.f17094f0);
        f(this.h, this.f17095g0, this.f17094f0);
        f(this.f17101n, this.f17095g0, this.f17094f0);
        this.f17086b.setImageCoords(this.f17095g0 - AndroidUtilities.dp(20.0f), this.f17094f0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.D;
        matrix.reset();
        matrix.postTranslate(this.f17092e0, this.f17094f0);
        this.E.setLocalMatrix(matrix);
        setMeasuredDimension(size, iDp);
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float fClamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f17096h0, this.f17095g0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean zC = c(fClamp, y10, this.f17096h0, this.f17094f0, AndroidUtilities.dp(7.0f), true);
        boolean z10 = this.f17105q0;
        org.telegram.ui.Components.nc ncVar = this.H;
        org.telegram.ui.Components.nc ncVar2 = this.F;
        org.telegram.ui.Components.nc ncVar3 = this.G;
        boolean z11 = true;
        if (z10) {
            ncVar2.c(false);
            ncVar3.c(false);
            ncVar.c(false);
        } else if (action == 0 || this.f17109s0) {
            ncVar2.c(c(fClamp, y10, this.f17092e0, this.f17094f0, AndroidUtilities.dp(60.0f), false));
            ncVar3.c(c(fClamp, y10, this.f17096h0, this.f17094f0, (float) AndroidUtilities.dp(30.0f), true) && !b());
            ncVar.c(c(fClamp, y10, this.f17095g0, this.f17094f0, (float) AndroidUtilities.dp(30.0f), false) && !b());
        }
        v6 v6Var = this.I0;
        v6 v6Var2 = this.H0;
        if (action == 0) {
            this.f17109s0 = true;
            this.f17110t0 = ncVar2.h || ncVar3.h;
            System.currentTimeMillis();
            this.f17111u0 = fClamp;
            if (Math.abs(fClamp - this.f17092e0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(v6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (ncVar3.h) {
                AndroidUtilities.runOnUIThread(v6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.f17109s0) {
                    this.f17111u0 = Utilities.clamp(fClamp, this.f17096h0, this.f17095g0);
                    invalidate();
                    if (this.f17102n0 && !this.T0 && zC) {
                        d(180.0f);
                        ((oa) this.f17084a).b();
                    }
                    if (this.f17102n0 && this.f17112v0) {
                        float fClamp2 = Utilities.clamp(((this.f17094f0 - AndroidUtilities.dp(48.0f)) - y10) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                        sb sbVar = ((oa) this.f17084a).f16494a;
                        sbVar.R0.b(fClamp2, true);
                        sbVar.j0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.f17109s0) {
                    this.f17109s0 = false;
                    this.f17110t0 = false;
                    AndroidUtilities.cancelRunOnUIThread(v6Var2);
                    AndroidUtilities.cancelRunOnUIThread(v6Var);
                    boolean z12 = this.f17102n0;
                    if (!z12 && ncVar.h) {
                        sb sbVar2 = ((oa) this.f17084a).f16494a;
                        if (sbVar2.f16746b0 == 0 && !sbVar2.L1 && !sbVar2.M1 && sb.b(sbVar2)) {
                            sbVar2.f(true);
                        }
                    } else if (z12 && this.f17112v0) {
                        if (ncVar.h) {
                            this.f17112v0 = false;
                            this.C0.d(1.0f, true);
                            u3 u3Var = ((oa) this.f17084a).f16494a.P0;
                            u3Var.f16902a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                            u3Var.invalidate();
                        } else {
                            this.f17102n0 = false;
                            this.f17107r0 = SystemClock.elapsedRealtime();
                            this.f17105q0 = true;
                            ((oa) this.f17084a).d(false);
                        }
                    } else if (ncVar2.h) {
                        if (b()) {
                            ((oa) this.f17084a).a();
                        } else if (!this.f17099k0 && !this.f17102n0 && !this.f17112v0) {
                            ((oa) this.f17084a).c();
                        } else if (this.f17102n0) {
                            this.f17102n0 = false;
                            this.f17107r0 = SystemClock.elapsedRealtime();
                            this.f17105q0 = true;
                            ((oa) this.f17084a).d(false);
                        } else if (sb.d(((oa) this.f17084a).f16494a)) {
                            this.N = 0L;
                            this.M = System.currentTimeMillis();
                            this.f17114w0 = false;
                            ((oa) this.f17084a).e(new v6(this, 1), false);
                        }
                    }
                    this.f17112v0 = false;
                    if (ncVar3.h) {
                        d(180.0f);
                        ((oa) this.f17084a).b();
                    }
                    ncVar2.c(false);
                    ncVar3.c(false);
                    ncVar.c(false);
                    invalidate();
                }
                return false;
            }
            z11 = false;
        }
        this.T0 = zC;
        return z11;
    }

    public void setDelegate(w6 w6Var) {
        this.f17084a = w6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f17108s.setColor(i0.b.d(f10, -1, -16777216));
        this.f17113w.setColor(i0.b.d(f10, 1677721600, 369098752));
        this.A.setColor(i0.b.d(f10, 1493172223, 285212671));
        this.B.setColor(i0.b.d(f10, 402653184, 805306368));
        int iD = i0.b.d(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(iD, mode));
        this.f17093f.setColorFilter(new PorterDuffColorFilter(i0.b.d(f10, -1, -16777216), mode));
    }
}
