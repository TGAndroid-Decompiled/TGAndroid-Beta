package nh;

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
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.uc;
public final class o6 extends View implements o2 {
    public final Paint A;
    public final org.telegram.ui.Components.d6 A0;
    public final Paint B;
    public final org.telegram.ui.Components.d6 B0;
    public final Paint C;
    public final org.telegram.ui.Components.d6 C0;
    public final Matrix D;
    public float D0;
    public final RadialGradient E;
    public final org.telegram.ui.Components.d6 E0;
    public final uc F;
    public final org.telegram.ui.Components.d6 F0;
    public final uc G;
    public final org.telegram.ui.Components.d6 G0;
    public final uc H;
    public final k6 H0;
    public float I;
    public final k6 I0;
    public final org.telegram.ui.Components.d6 J;
    public final Path J0;
    public boolean K;
    public final Path K0;
    public final org.telegram.ui.Components.d6 L;
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
    public final n6 S;
    public final PointF S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public boolean V;
    public boolean W;
    public l6 f18218a;
    public boolean f18219a0;
    public final ImageReceiver f18220b;
    public boolean f18221b0;
    public final jq f18222c;
    public float f18223c0;
    public final Drawable d;
    public final org.telegram.ui.Components.d6 f18224d0;
    public final Drawable f18225e;
    public float f18226e0;
    public final Drawable f18227f;
    public float f18228f0;
    public float f18229g0;
    public final Drawable h;
    public float f18230h0;
    public final org.telegram.ui.Components.d6 f18231i0;
    public float f18232j0;
    public boolean f18233k0;
    public final org.telegram.ui.Components.d6 f18234l0;
    public final org.telegram.ui.Components.d6 m0;
    public final Drawable f18235n;
    public boolean f18236n0;
    public final float[] f18237o0;
    public final org.telegram.ui.Components.d6 f18238p0;
    public boolean f18239q0;
    public final Paint f18240r;
    public long f18241r0;
    public final Paint f18242s;
    public boolean f18243s0;
    public boolean f18244t0;
    public float f18245u0;
    public final Paint v;
    public boolean f18246v0;
    public final Paint f18247w;
    public boolean f18248w0;
    public final Paint f18249x;
    public final org.telegram.ui.Components.d6 f18250x0;
    public final Paint f18251y;
    public final org.telegram.ui.Components.d6 f18252y0;
    public final org.telegram.ui.Components.d6 f18253z0;

    public o6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f18220b = imageReceiver;
        this.f18240r = new Paint(1);
        Paint paint = new Paint(1);
        this.f18242s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f18247w = paint3;
        Paint paint4 = new Paint(1);
        this.f18249x = paint4;
        Paint paint5 = new Paint(1);
        this.f18251y = paint5;
        Paint paint6 = new Paint(1);
        this.A = paint6;
        Paint paint7 = new Paint(1);
        this.B = paint7;
        Paint paint8 = new Paint(1);
        this.C = paint8;
        Matrix matrix = new Matrix();
        this.D = matrix;
        this.F = new uc(this);
        this.G = new uc(this);
        this.H = new uc(this);
        jr jrVar = jr.h;
        this.J = new org.telegram.ui.Components.d6(this, 0L, 310L, jrVar);
        this.L = new org.telegram.ui.Components.d6(this, 0L, 330L, jrVar);
        this.O = new Path();
        this.P = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.Q = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.R = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f18224d0 = new org.telegram.ui.Components.d6(this, 0L, 200L, jr.f29800f);
        this.f18231i0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.f18232j0 = -1.0f;
        this.f18233k0 = true;
        this.f18234l0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.m0 = new org.telegram.ui.Components.d6(this, 0L, 850L, jrVar);
        this.f18237o0 = new float[2];
        this.f18238p0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.f18250x0 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.f18252y0 = new org.telegram.ui.Components.d6(this, 0L, 650L, jrVar);
        this.f18253z0 = new org.telegram.ui.Components.d6(this, 0L, 160L, jr.f29802i);
        this.A0 = new org.telegram.ui.Components.d6(this, 0L, 750L, jrVar);
        this.B0 = new org.telegram.ui.Components.d6(this, 0L, 650L, jrVar);
        this.C0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.E0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.F0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.G0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.H0 = new k6(this, 2);
        this.I0 = new k6(this, 3);
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
        n6 n6Var = new n6(this, this);
        this.S = n6Var;
        r0.j0.k(this, n6Var);
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
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        jq jqVar = new jq(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f18222c = jqVar;
        jqVar.f29792w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        jqVar.f29787e = dp;
        jqVar.f29788f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.f18225e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f18227f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f18235n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f9, float f10, double d, float f11, PointF pointF) {
        double d10 = f11;
        pointF.x = (float) ((Math.cos(d) * d10) + f9);
        pointF.y = (float) ((Math.sin(d) * d10) + f10);
    }

    public static void f(Drawable drawable, float f9, float f10) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f9 - max), (int) (f10 - max), (int) (f9 + max), (int) (f10 + max));
    }

    public final boolean b() {
        if (this.D0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f9, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f18236n0) {
            if ((!z10 || f12 - f10 <= AndroidUtilities.dp(100.0f)) && Math.abs(f11 - f9) <= f13) {
                return true;
            }
            return false;
        } else if (i7.z5.a(f9, f10, f11, f12) <= f13) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f9) {
        long j10;
        if (f9 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.J.f27669g = j10;
        this.I += f9;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        n6 n6Var = this.S;
        if (n6Var != null && n6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(float f9, boolean z10) {
        boolean z11;
        if (Math.abs(f9 - this.D0) < 0.01f) {
            return;
        }
        this.D0 = f9;
        if (!z10) {
            if (f9 > 0.0f && !this.f18236n0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0.f(z11, true);
            this.F0.d(f9, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f18239q0 = false;
        if (!z10) {
            org.telegram.ui.Components.d6 d6Var = this.f18238p0;
            d6Var.getClass();
            d6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        l6 l6Var = this.f18218a;
        ImageReceiver imageReceiver = this.f18220b;
        if (l6Var != null) {
            l6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f16237w.f17373b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((o7) arrayList2.get(0)).O0 != null) {
                this.f18220b.setImage(ImageLocation.getForPath(((o7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f18222c, 0L, null, null, 0);
                return;
            }
        }
        MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbumEntry;
        if (albumEntry != null && (arrayList = albumEntry.photos) != null && !arrayList.isEmpty()) {
            photoEntry = albumEntry.photos.get(0);
        } else {
            photoEntry = null;
        }
        if (photoEntry != null && (str = photoEntry.thumbPath) != null) {
            this.f18220b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f18222c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f18220b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f18222c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f18220b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f18222c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f18222c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18220b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f18220b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        char c3;
        float f21;
        float f22;
        Canvas canvas2;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        RectF rectF;
        Paint paint;
        float f30;
        RectF rectF2;
        float f31;
        float f32;
        boolean z11;
        boolean z12;
        RectF rectF3;
        float f33;
        long j10;
        Canvas canvas3;
        float f34;
        float f35;
        float f36;
        float f37;
        float f38;
        org.telegram.ui.Components.d6 d6Var;
        uc ucVar;
        float f39;
        int i10;
        float f40;
        float f41;
        float f42;
        float f43;
        double d;
        double d10;
        double d11;
        float f44;
        if (this.f18236n0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d12 = this.f18234l0.d(f9, false);
        if (this.f18236n0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d13 = this.m0.d(f10, false);
        float f45 = this.f18232j0;
        if (f45 < 0.0f) {
            if (this.f18233k0) {
                f44 = 1.0f;
            } else {
                f44 = 0.0f;
            }
            f45 = this.f18231i0.d(f44, false);
        }
        float max = Math.max(d12, f45);
        if (this.f18243s0) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d14 = this.f18250x0.d(f11, false);
        uc ucVar2 = this.F;
        if (Math.abs(this.f18245u0 - this.f18226e0) < AndroidUtilities.dp(64.0f) && (this.f18236n0 || ucVar2.h)) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d15 = this.f18252y0.d(f12, false) * d14;
        if (Math.abs(this.f18245u0 - this.f18226e0) < AndroidUtilities.dp(64.0f)) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d16 = this.f18253z0.d(f13, false) * d14;
        float clamp = Utilities.clamp((this.f18245u0 - this.f18226e0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.f18245u0 - this.f18226e0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        if (Math.min(Math.abs(this.f18245u0 - this.f18230h0), Math.abs(this.f18245u0 - this.f18229g0)) < AndroidUtilities.dp(16.0f)) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        float d17 = this.B0.d(f14, false) * d14;
        if (this.D0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f46 = 1.0f - d12;
        float e10 = this.E0.e(z10) * f46;
        float d18 = this.F0.d(this.D0, false);
        float e11 = this.G0.e(b());
        if (this.f18246v0) {
            f15 = d12 * max * d14;
        } else {
            f15 = 0.0f;
        }
        if (f15 > 0.0f) {
            f21 = 1.0f;
            float dp = this.f18226e0 - AndroidUtilities.dp(50.0f);
            f22 = 0.0f;
            float dp2 = this.f18226e0 + AndroidUtilities.dp(50.0f);
            Paint paint2 = this.A;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = this.B;
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f18 = e10;
            float f47 = f15;
            f20 = d13;
            f17 = d17;
            f16 = d16;
            c3 = 1;
            f19 = e11;
            canvas.drawLine(dp2, this.f18228f0, AndroidUtilities.lerp(dp2, this.f18230h0 - AndroidUtilities.dp(30.0f), f15), this.f18228f0, paint3);
            canvas.drawLine(dp2, this.f18228f0, AndroidUtilities.lerp(dp2, this.f18230h0 - AndroidUtilities.dp(30.0f), f47), this.f18228f0, paint2);
            canvas.drawLine(dp, this.f18228f0, AndroidUtilities.lerp(dp, this.f18229g0 + AndroidUtilities.dp(30.0f), f47), this.f18228f0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp, this.f18228f0, AndroidUtilities.lerp(dp, this.f18229g0 + AndroidUtilities.dp(30.0f), f47), this.f18228f0, paint2);
        } else {
            f16 = d16;
            f17 = d17;
            f18 = e10;
            f19 = e11;
            f20 = d13;
            c3 = 1;
            f21 = 1.0f;
            f22 = 0.0f;
            canvas2 = canvas;
        }
        float f48 = this.f18226e0;
        float lerp = AndroidUtilities.lerp(f48, this.A0.d((AndroidUtilities.dp(4.0f) * clamp) + f48, false), d15);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d12), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d15);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d12), AndroidUtilities.dp(32.0f), d15);
        if (this.f18233k0) {
            f23 = 0.0f;
        } else {
            f23 = 0.2f;
        }
        float lerp4 = AndroidUtilities.lerp(ucVar2.a(f23), (this.f18224d0.d(this.f18223c0, false) * 0.2f) + f21, d12);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f49 = lerp - lerp2;
        float f50 = this.f18228f0;
        float f51 = lerp + lerp2;
        rectF4.set(f49, f50 - lerp2, f51, f50 + lerp2);
        float f52 = f21 - f19;
        int d19 = i0.a.d(max * f52, -1, -577231);
        Paint paint4 = this.f18240r;
        paint4.setColor(d19);
        int i11 = (f19 > f22 ? 1 : (f19 == f22 ? 0 : -1));
        if (i11 > 0) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.f18226e0, this.f18228f0);
            paint4.setAlpha((int) (f52 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f25 = f51;
            f26 = d12;
            f28 = f49;
            f24 = f52;
            f29 = lerp4;
            rectF = rectF4;
            f30 = max;
            f27 = d14;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f24 = f52;
            f25 = f51;
            f26 = d12;
            f27 = d14;
            f28 = f49;
            f29 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f30 = max;
            canvas2.save();
        }
        canvas2.scale(f29, f29, this.f18226e0, this.f18228f0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (i11 > 0) {
            Paint paint5 = this.C;
            paint5.setStrokeWidth(AndroidUtilities.dp(4.0f));
            Path path = this.O;
            path.rewind();
            PointF pointF = this.P;
            f32 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f53 = pointF.x;
            PointF pointF2 = this.Q;
            float f54 = f19 / 0.3f;
            rectF2 = rectF;
            f31 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f53, pointF2.x, Utilities.clamp(f54, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f54, 1.0f, 0.0f)));
            if (f19 > 0.3f) {
                float f55 = pointF2.x;
                PointF pointF3 = this.R;
                float f56 = (f19 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f55, pointF3.x, Utilities.clamp(f56, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f56, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f18226e0, this.f18228f0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f31 = lerp3;
            f32 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f29, 1.0f);
        canvas2.scale(max2, max2, this.f18226e0, this.f18228f0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d15) * AndroidUtilities.dp(5.0f) * f18) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d15) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f18);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f19);
        float f57 = this.f18226e0;
        float f58 = this.f18228f0;
        RectF rectF5 = rectF2;
        rectF5.set(f57 - lerp6, f58 - lerp6, f57 + lerp6, f58 + lerp6);
        Paint paint6 = this.f18242s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f18) * 255.0f * f24));
        canvas2.drawCircle(this.f18226e0, this.f18228f0, lerp6, paint6);
        if (f18 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d18 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 & z11) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d18 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.M;
        if (this.f18236n0) {
            f33 = 0.0f;
        } else {
            f33 = 1.0f - f20;
        }
        if (this.f18218a != null) {
            j10 = 177000;
        } else {
            j10 = 60000;
        }
        long j11 = j10;
        float min = Math.min((((float) currentTimeMillis) / ((float) 60000)) * 360.0f, 360.0f);
        float e12 = this.f18238p0.e(this.f18239q0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e12 * f32, 1.0f - f33) * 255.0f));
        if (e12 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            np.a(this.f18237o0, (float) ((SystemClock.elapsedRealtime() - this.f18241r0) % 5400));
            invalidate();
            float[] fArr = this.f18237o0;
            float f59 = fArr[0];
            float f60 = fArr[c3];
            float f61 = (f59 + f60) / 2.0f;
            float abs = Math.abs(f60 - f59) / 2.0f;
            if (this.f18239q0) {
                float f62 = min / 2.0f;
                f61 = AndroidUtilities.lerp((-90.0f) + f62, f61, e12);
                abs = AndroidUtilities.lerp(f62, abs, e12);
            }
            float f63 = f61 - abs;
            float f64 = abs * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f63, f64, false, paint7);
        }
        if (this.f18236n0) {
            invalidate();
            long j12 = currentTimeMillis / 1000;
            if (j12 != this.N / 1000) {
                ((ca) this.f18218a).f17486a.F0.a(j12, true);
            }
            if (j11 > 0 && currentTimeMillis >= j11) {
                post(new k6(this, 0));
            }
            this.N = currentTimeMillis;
        }
        canvas3.restore();
        boolean z13 = this.f18248w0;
        uc ucVar3 = this.H;
        if (z13) {
            float a2 = ucVar3.a(0.2f) * f26;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.f18229g0, this.f18228f0);
                canvas3.drawCircle(this.f18229g0, this.f18228f0, AndroidUtilities.dp(22.0f), this.f18247w);
                canvas3.rotate(-getRotation(), this.f18229g0, this.f18228f0);
                this.f18227f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = ucVar3.a(0.2f) * f46 * f24;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.f18229g0, this.f18228f0);
            canvas3.rotate(-getRotation(), this.f18229g0, this.f18228f0);
            this.f18220b.draw(canvas3);
            canvas3.restore();
        }
        if (this.K) {
            f34 = 1.0f;
        } else {
            f34 = 0.0f;
        }
        float d20 = this.L.d(f34, false);
        Paint paint8 = this.f18249x;
        org.telegram.ui.Components.d6 d6Var2 = this.J;
        uc ucVar4 = this.G;
        if (d20 > 0.0f) {
            canvas3.save();
            float a11 = ucVar4.a(0.2f) * d20 * f24;
            canvas3.scale(a11, a11, this.f18230h0, this.f18228f0);
            canvas3.rotate(d6Var2.d(this.I, false) - getRotation(), this.f18230h0, this.f18228f0);
            canvas3.drawCircle(this.f18230h0, this.f18228f0, AndroidUtilities.dp(22.0f), paint8);
            this.f18225e.draw(canvas3);
            canvas3.restore();
        }
        if (d20 < 1.0f) {
            canvas3.save();
            f35 = f24;
            float y8 = org.telegram.messenger.x3.y(1.0f, d20, ucVar4.a(0.2f), f35);
            canvas3.scale(y8, y8, this.f18230h0, this.f18228f0);
            canvas3.rotate(d6Var2.d(this.I, false) - getRotation(), this.f18230h0, this.f18228f0);
            canvas3.drawCircle(this.f18230h0, this.f18228f0, AndroidUtilities.dp(22.0f), this.f18247w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f35 = f24;
        }
        if (this.f18246v0 && !b()) {
            float f65 = f17;
            f36 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f65), Math.max(f65, d15)) * f27 * f30 * f26;
        } else {
            f36 = 0.0f;
        }
        if (!this.f18246v0 && this.f18236n0) {
            f37 = 1.0f;
        } else {
            f37 = 0.0f;
        }
        float d21 = this.C0.d(f37, false);
        int i12 = (f36 > 0.0f ? 1 : (f36 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            Paint paint9 = this.f18251y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.f18245u0, this.f18228f0, f36, paint9);
            float f66 = this.f18245u0;
            f41 = 22.0f;
            float clamp3 = Utilities.clamp(1.0f - ((Math.abs(clamp2) * f27) / 1.3f), 1.0f, 0.0f);
            float abs2 = Math.abs(lerp - f66);
            if (abs2 < lerp2 + (f36 * 2.0f) && clamp3 < 0.6f) {
                float f67 = lerp2 + f36;
                if (abs2 < f67) {
                    float f68 = lerp2 * lerp2;
                    float f69 = abs2 * abs2;
                    float f70 = f36 * f36;
                    f43 = f36;
                    f39 = d21;
                    i10 = i12;
                    double acos = Math.acos(((f68 + f69) - f70) / ((lerp2 * 2.0f) * abs2));
                    d10 = Math.acos(((f70 + f69) - f68) / (f42 * abs2));
                    d = acos;
                } else {
                    f43 = f36;
                    f39 = d21;
                    i10 = i12;
                    d = 0.0d;
                    d10 = 0.0d;
                }
                if (f66 > lerp) {
                    d11 = 0.0d;
                } else {
                    d11 = 3.141592653589793d;
                }
                double d22 = d;
                double acos2 = (float) Math.acos((lerp2 - f43) / abs2);
                double d23 = acos2 - d22;
                double d24 = clamp3;
                double d25 = d23 * d24;
                double d26 = d11 + d22 + d25;
                double d27 = (d11 - d22) - d25;
                double d28 = ((3.141592653589793d - d10) - acos2) * d24;
                double d29 = ((d11 + 3.141592653589793d) - d10) - d28;
                double d30 = (d11 - 3.141592653589793d) + d10 + d28;
                float f71 = this.f18228f0;
                PointF pointF4 = this.L0;
                a(lerp, f71, d26, lerp2, pointF4);
                float f72 = this.f18228f0;
                PointF pointF5 = this.M0;
                a(lerp, f72, d27, lerp2, pointF5);
                float f73 = this.f18228f0;
                PointF pointF6 = this.N0;
                float f74 = f43;
                a(f66, f73, d29, f74, pointF6);
                float f75 = this.f18228f0;
                PointF pointF7 = this.O0;
                a(f66, f75, d30, f74, pointF7);
                f38 = f74;
                f40 = f35;
                d6Var = d6Var2;
                ucVar = ucVar4;
                float min2 = Math.min(1.0f, (abs2 * 2.0f) / f67) * Math.min(clamp3 * 2.4f, i7.z5.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f67);
                float f76 = lerp2 * min2;
                float f77 = f38 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f76, this.P0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f76, this.Q0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f77, this.R0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f77, this.S0);
                float f78 = f26;
                float C = com.google.android.recaptcha.internal.a.C(f27, f30, f78, f16);
                if (C > 0.0f) {
                    Path path2 = this.J0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.P0;
                    float f79 = pointF8.x;
                    float f80 = pointF8.y;
                    f26 = f78;
                    PointF pointF9 = this.R0;
                    path2.cubicTo(f79, f80, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.S0;
                    float f81 = pointF10.x;
                    float f82 = pointF10.y;
                    PointF pointF11 = this.Q0;
                    path2.cubicTo(f81, f82, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f83 = this.f18228f0;
                    rectF3.set(f28, f83 - lerp2, f25, f83 + lerp2);
                    float f84 = f31;
                    canvas3.drawRoundRect(rectF3, f84, f84, paint9);
                } else {
                    f26 = f78;
                }
            } else {
                f38 = f36;
                d6Var = d6Var2;
                ucVar = ucVar4;
                f39 = d21;
                i10 = i12;
                f40 = f35;
            }
        } else {
            f38 = f36;
            d6Var = d6Var2;
            ucVar = ucVar4;
            f39 = d21;
            i10 = i12;
            f40 = f35;
            f41 = 22.0f;
        }
        if (i10 > 0 || f39 > 0.0f) {
            float a12 = ucVar3.a(0.2f) * f26 * f40;
            canvas3.save();
            Path path3 = this.K0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.f18245u0, this.f18228f0, f38, Path.Direction.CW);
            }
            if (f39 > 0.0f && this.f18248w0) {
                path3.addCircle(this.f18229g0, this.f18228f0, f39 * AndroidUtilities.dp(f41) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.f18248w0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.f18229g0, this.f18228f0);
                canvas3.drawCircle(this.f18229g0, this.f18228f0, AndroidUtilities.dp(f41), paint8);
                canvas3.rotate(-getRotation(), this.f18229g0, this.f18228f0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = ucVar.a(0.2f) * f40;
            canvas3.save();
            canvas3.scale(a13, a13, this.f18230h0, this.f18228f0);
            canvas3.rotate(d6Var.d(this.I, false) - getRotation(), this.f18230h0, this.f18228f0);
            canvas3.drawCircle(this.f18230h0, this.f18228f0, AndroidUtilities.dp(f41), paint8);
            this.f18225e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        n6 n6Var = this.S;
        if (n6Var != null) {
            boolean b10 = b();
            boolean z14 = this.T;
            boolean z15 = this.f18236n0;
            if (z14 == z15 && this.U == b10 && this.V == this.K && this.W == this.f18233k0 && this.f18219a0 == this.f18239q0 && this.f18221b0 == this.f18248w0) {
                return;
            }
            this.T = z15;
            this.U = b10;
            this.V = this.K;
            this.W = this.f18233k0;
            this.f18219a0 = this.f18239q0;
            this.f18221b0 = this.f18248w0;
            n6Var.i();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f9 = size;
        this.f18226e0 = f9 / 2.0f;
        this.f18228f0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f9 * 0.35f);
        float f10 = this.f18226e0;
        this.f18229g0 = f10 - min;
        float f11 = f10 + min;
        this.f18230h0 = f11;
        float f12 = this.f18228f0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f18230h0;
        float f14 = this.f18228f0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.f18225e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f18227f, this.f18229g0, this.f18228f0);
        f(this.h, this.f18229g0, this.f18228f0);
        f(this.f18235n, this.f18229g0, this.f18228f0);
        this.f18220b.setImageCoords(this.f18229g0 - AndroidUtilities.dp(20.0f), this.f18228f0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.D;
        matrix.reset();
        matrix.postTranslate(this.f18226e0, this.f18228f0);
        this.E.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        n6 n6Var = this.S;
        if (n6Var != null) {
            n6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f18230h0, this.f18229g0);
        float y8 = motionEvent.getY() + 0.0f;
        boolean c3 = c(clamp, y8, this.f18230h0, this.f18228f0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f18239q0;
        uc ucVar = this.H;
        uc ucVar2 = this.F;
        uc ucVar3 = this.G;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            ucVar2.c(false);
            ucVar3.c(false);
            ucVar.c(false);
        } else if (action == 0 || this.f18243s0) {
            ucVar2.c(c(clamp, y8, this.f18226e0, this.f18228f0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y8, this.f18230h0, this.f18228f0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ucVar3.c(z10);
            if (c(clamp, y8, this.f18229g0, this.f18228f0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            ucVar.c(z11);
        }
        k6 k6Var = this.I0;
        k6 k6Var2 = this.H0;
        if (action == 0) {
            this.f18243s0 = true;
            this.f18244t0 = (ucVar2.h || ucVar3.h) ? true : true;
            System.currentTimeMillis();
            this.f18245u0 = clamp;
            if (Math.abs(clamp - this.f18226e0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(k6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (ucVar3.h) {
                AndroidUtilities.runOnUIThread(k6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f18243s0) {
                this.f18245u0 = Utilities.clamp(clamp, this.f18230h0, this.f18229g0);
                invalidate();
                if (this.f18236n0 && !this.T0 && c3) {
                    d(180.0f);
                    ((ca) this.f18218a).b();
                }
                if (this.f18236n0 && this.f18246v0) {
                    float clamp2 = Utilities.clamp(((this.f18228f0 - AndroidUtilities.dp(48.0f)) - y8) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    gb gbVar = ((ca) this.f18218a).f17486a;
                    gbVar.R0.b(clamp2, true);
                    gbVar.j0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f18243s0) {
                this.f18243s0 = false;
                this.f18244t0 = false;
                AndroidUtilities.cancelRunOnUIThread(k6Var2);
                AndroidUtilities.cancelRunOnUIThread(k6Var);
                boolean z15 = this.f18236n0;
                if (!z15 && ucVar.h) {
                    gb gbVar2 = ((ca) this.f18218a).f17486a;
                    if (gbVar2.f17740b0 == 0 && !gbVar2.L1 && !gbVar2.M1 && gb.b(gbVar2)) {
                        gbVar2.f(true);
                    }
                } else if (z15 && this.f18246v0) {
                    if (ucVar.h) {
                        this.f18246v0 = false;
                        this.C0.d(1.0f, true);
                        s3 s3Var = ((ca) this.f18218a).f17486a.P0;
                        s3Var.f18545a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        s3Var.invalidate();
                    } else {
                        this.f18236n0 = false;
                        this.f18241r0 = SystemClock.elapsedRealtime();
                        this.f18239q0 = true;
                        ((ca) this.f18218a).d(false);
                    }
                } else if (ucVar2.h) {
                    if (b()) {
                        ((ca) this.f18218a).a();
                    } else if (!this.f18233k0 && !this.f18236n0 && !this.f18246v0) {
                        ((ca) this.f18218a).c();
                    } else if (!this.f18236n0) {
                        if (gb.d(((ca) this.f18218a).f17486a)) {
                            this.N = 0L;
                            this.M = System.currentTimeMillis();
                            this.f18248w0 = false;
                            ((ca) this.f18218a).e(new k6(this, 1), false);
                        }
                    } else {
                        this.f18236n0 = false;
                        this.f18241r0 = SystemClock.elapsedRealtime();
                        this.f18239q0 = true;
                        ((ca) this.f18218a).d(false);
                    }
                }
                this.f18246v0 = false;
                if (ucVar3.h) {
                    d(180.0f);
                    ((ca) this.f18218a).b();
                }
                ucVar2.c(false);
                ucVar3.c(false);
                ucVar.c(false);
                invalidate();
            }
            return false;
        }
        this.T0 = c3;
        return z13;
    }

    public void setDelegate(l6 l6Var) {
        this.f18218a = l6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f9) {
        this.f18242s.setColor(i0.a.d(f9, -1, -16777216));
        this.f18247w.setColor(i0.a.d(f9, 1677721600, 369098752));
        this.A.setColor(i0.a.d(f9, 1493172223, 285212671));
        this.B.setColor(i0.a.d(f9, 402653184, 805306368));
        int d = i0.a.d(f9, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f18227f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), mode));
    }
}
