package bi;

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
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
public final class m8 extends View implements l3 {
    public boolean A0;
    public final org.telegram.ui.Components.d6 B0;
    public final org.telegram.ui.Components.d6 C0;
    public final org.telegram.ui.Components.d6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.d6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.d6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.d6 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.d6 I0;
    public final org.telegram.ui.Components.xc J;
    public final org.telegram.ui.Components.d6 J0;
    public final org.telegram.ui.Components.xc K;
    public final org.telegram.ui.Components.d6 K0;
    public final org.telegram.ui.Components.xc L;
    public final j8 L0;
    public float M;
    public final j8 M0;
    public final org.telegram.ui.Components.d6 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.d6 P;
    public final PointF P0;
    public long Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public final Path S;
    public final PointF S0;
    public final PointF T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final l8 W;
    public final PointF W0;
    public boolean X0;
    public k8 f3104a;
    public boolean f3105a0;
    public final ImageReceiver f3106b;
    public boolean f3107b0;
    public final vq f3108c;
    public boolean f3109c0;
    public final Drawable d;
    public boolean f3110d0;
    public final Drawable e;
    public boolean f3111e0;
    public final Drawable f3112f;
    public boolean f3113f0;
    public float f3114g0;
    public final Drawable h;
    public final org.telegram.ui.Components.d6 f3115h0;
    public float f3116i0;
    public float f3117j0;
    public float f3118k0;
    public float f3119l0;
    public final org.telegram.ui.Components.d6 m0;
    public final Drawable f3120n;
    public float f3121n0;
    public boolean f3122o0;
    public final org.telegram.ui.Components.d6 f3123p0;
    public final org.telegram.ui.Components.d6 f3124q0;
    public final Paint f3125r;
    public boolean f3126r0;
    public final Paint f3127s;
    public final float[] f3128s0;
    public final org.telegram.ui.Components.d6 f3129t0;
    public boolean f3130u0;
    public final Paint v;
    public long f3131v0;
    public final Paint f3132w;
    public boolean f3133w0;
    public final Paint f3134x;
    public boolean f3135x0;
    public final Paint f3136y;
    public float f3137y0;
    public boolean f3138z0;

    public m8(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f3106b = imageReceiver;
        this.f3125r = new Paint(1);
        Paint paint = new Paint(1);
        this.f3127s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f3132w = paint3;
        Paint paint4 = new Paint(1);
        this.f3134x = paint4;
        Paint paint5 = new Paint(1);
        this.f3136y = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new org.telegram.ui.Components.xc(this);
        this.K = new org.telegram.ui.Components.xc(this);
        this.L = new org.telegram.ui.Components.xc(this);
        wr wrVar = wr.h;
        this.N = new org.telegram.ui.Components.d6(this, 0L, 310L, wrVar);
        this.P = new org.telegram.ui.Components.d6(this, 0L, 330L, wrVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f3115h0 = new org.telegram.ui.Components.d6(this, 0L, 200L, wr.f28819f);
        this.m0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.f3121n0 = -1.0f;
        this.f3122o0 = true;
        this.f3123p0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.f3124q0 = new org.telegram.ui.Components.d6(this, 0L, 850L, wrVar);
        this.f3128s0 = new float[2];
        this.f3129t0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.B0 = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.C0 = new org.telegram.ui.Components.d6(this, 0L, 650L, wrVar);
        this.D0 = new org.telegram.ui.Components.d6(this, 0L, 160L, wr.f28821i);
        this.E0 = new org.telegram.ui.Components.d6(this, 0L, 750L, wrVar);
        this.F0 = new org.telegram.ui.Components.d6(this, 0L, 650L, wrVar);
        this.G0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.I0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.J0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.K0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.L0 = new j8(this, 2);
        this.M0 = new j8(this, 3);
        this.N0 = new Path();
        this.O0 = new Path();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        setWillNotDraw(false);
        l8 l8Var = new l8(this, this);
        this.W = l8Var;
        r0.i0.k(this, l8Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.I = radialGradient;
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
        vq vqVar = new vq(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f3108c = vqVar;
        vqVar.f28580w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        vqVar.e = dp;
        vqVar.f28576f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f3112f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f3120n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f7, float f10, double d, float f11, PointF pointF) {
        double d10 = f11;
        pointF.x = (float) ((Math.cos(d) * d10) + f7);
        pointF.y = (float) ((Math.sin(d) * d10) + f10);
    }

    public static void f(Drawable drawable, float f7, float f10) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f7 - max), (int) (f10 - max), (int) (f7 + max), (int) (f10 + max));
    }

    public final boolean b() {
        if (this.H0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.f3126r0) {
            if ((!z10 || f12 - f10 <= AndroidUtilities.dp(100.0f)) && Math.abs(f11 - f7) <= f13) {
                return true;
            }
            return false;
        } else if (v7.a7.a(f7, f10, f11, f12) <= f13) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f7) {
        long j3;
        if (f7 > 180.0f) {
            j3 = 620;
        } else {
            j3 = 310;
        }
        this.N.f22297g = j3;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        l8 l8Var = this.W;
        if (l8Var != null && l8Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(float f7, boolean z10) {
        boolean z11;
        if (Math.abs(f7 - this.H0) < 0.01f) {
            return;
        }
        this.H0 = f7;
        if (!z10) {
            if (f7 > 0.0f && !this.f3126r0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.I0.f(z11, true);
            this.J0.d(f7, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f3130u0 = false;
        if (!z10) {
            org.telegram.ui.Components.d6 d6Var = this.f3129t0;
            d6Var.getClass();
            d6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        k8 k8Var = this.f3104a;
        ImageReceiver imageReceiver = this.f3106b;
        if (k8Var != null) {
            k8Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f48517w.f2684b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((r9) arrayList2.get(0)).O0 != null) {
                this.f3106b.setImage(ImageLocation.getForPath(((r9) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f3108c, 0L, null, null, 0);
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
            this.f3106b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f3108c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f3106b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f3108c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f3106b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f3108c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f3108c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3106b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f3106b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
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
        char c10;
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
        long j3;
        Canvas canvas3;
        float f34;
        float f35;
        float f36;
        float f37;
        float f38;
        org.telegram.ui.Components.d6 d6Var;
        org.telegram.ui.Components.xc xcVar;
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
        if (this.f3126r0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d12 = this.f3123p0.d(f7, false);
        if (this.f3126r0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d13 = this.f3124q0.d(f10, false);
        float f45 = this.f3121n0;
        if (f45 < 0.0f) {
            if (this.f3122o0) {
                f44 = 1.0f;
            } else {
                f44 = 0.0f;
            }
            f45 = this.m0.d(f44, false);
        }
        float max = Math.max(d12, f45);
        if (this.f3133w0) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d14 = this.B0.d(f11, false);
        org.telegram.ui.Components.xc xcVar2 = this.J;
        if (Math.abs(this.f3137y0 - this.f3116i0) < AndroidUtilities.dp(64.0f) && (this.f3126r0 || xcVar2.h)) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d15 = this.C0.d(f12, false) * d14;
        if (Math.abs(this.f3137y0 - this.f3116i0) < AndroidUtilities.dp(64.0f)) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d16 = this.D0.d(f13, false) * d14;
        float clamp = Utilities.clamp((this.f3137y0 - this.f3116i0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.f3137y0 - this.f3116i0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        if (Math.min(Math.abs(this.f3137y0 - this.f3119l0), Math.abs(this.f3137y0 - this.f3118k0)) < AndroidUtilities.dp(16.0f)) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        float d17 = this.F0.d(f14, false) * d14;
        if (this.H0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f46 = 1.0f - d12;
        float e = this.I0.e(z10) * f46;
        float d18 = this.J0.d(this.H0, false);
        float e7 = this.K0.e(b());
        if (this.f3138z0) {
            f15 = d12 * max * d14;
        } else {
            f15 = 0.0f;
        }
        if (f15 > 0.0f) {
            f21 = 1.0f;
            float dp = this.f3116i0 - AndroidUtilities.dp(50.0f);
            f22 = 0.0f;
            float dp2 = this.f3116i0 + AndroidUtilities.dp(50.0f);
            Paint paint2 = this.E;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = this.F;
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f18 = e;
            float f47 = f15;
            f20 = d13;
            f17 = d17;
            f16 = d16;
            c10 = 1;
            f19 = e7;
            canvas.drawLine(dp2, this.f3117j0, AndroidUtilities.lerp(dp2, this.f3119l0 - AndroidUtilities.dp(30.0f), f15), this.f3117j0, paint3);
            canvas.drawLine(dp2, this.f3117j0, AndroidUtilities.lerp(dp2, this.f3119l0 - AndroidUtilities.dp(30.0f), f47), this.f3117j0, paint2);
            canvas.drawLine(dp, this.f3117j0, AndroidUtilities.lerp(dp, this.f3118k0 + AndroidUtilities.dp(30.0f), f47), this.f3117j0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp, this.f3117j0, AndroidUtilities.lerp(dp, this.f3118k0 + AndroidUtilities.dp(30.0f), f47), this.f3117j0, paint2);
        } else {
            f16 = d16;
            f17 = d17;
            f18 = e;
            f19 = e7;
            f20 = d13;
            c10 = 1;
            f21 = 1.0f;
            f22 = 0.0f;
            canvas2 = canvas;
        }
        float f48 = this.f3116i0;
        float lerp = AndroidUtilities.lerp(f48, this.E0.d((AndroidUtilities.dp(4.0f) * clamp) + f48, false), d15);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d12), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d15);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d12), AndroidUtilities.dp(32.0f), d15);
        if (this.f3122o0) {
            f23 = 0.0f;
        } else {
            f23 = 0.2f;
        }
        float lerp4 = AndroidUtilities.lerp(xcVar2.a(f23), (this.f3115h0.d(this.f3114g0, false) * 0.2f) + f21, d12);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f49 = lerp - lerp2;
        float f50 = this.f3117j0;
        float f51 = lerp + lerp2;
        rectF4.set(f49, f50 - lerp2, f51, f50 + lerp2);
        float f52 = f21 - f19;
        int d19 = i0.a.d(max * f52, -1, -577231);
        Paint paint4 = this.f3125r;
        paint4.setColor(d19);
        int i11 = (f19 > f22 ? 1 : (f19 == f22 ? 0 : -1));
        if (i11 > 0) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.f3116i0, this.f3117j0);
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
        canvas2.scale(f29, f29, this.f3116i0, this.f3117j0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (i11 > 0) {
            Paint paint5 = this.G;
            paint5.setStrokeWidth(AndroidUtilities.dp(4.0f));
            Path path = this.S;
            path.rewind();
            PointF pointF = this.T;
            f32 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f53 = pointF.x;
            PointF pointF2 = this.U;
            float f54 = f19 / 0.3f;
            rectF2 = rectF;
            f31 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f53, pointF2.x, Utilities.clamp(f54, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f54, 1.0f, 0.0f)));
            if (f19 > 0.3f) {
                float f55 = pointF2.x;
                PointF pointF3 = this.V;
                float f56 = (f19 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f55, pointF3.x, Utilities.clamp(f56, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f56, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f3116i0, this.f3117j0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f31 = lerp3;
            f32 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f29, 1.0f);
        canvas2.scale(max2, max2, this.f3116i0, this.f3117j0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d15) * AndroidUtilities.dp(5.0f) * f18) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d15) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f18);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f19);
        float f57 = this.f3116i0;
        float f58 = this.f3117j0;
        RectF rectF5 = rectF2;
        rectF5.set(f57 - lerp6, f58 - lerp6, f57 + lerp6, f58 + lerp6);
        Paint paint6 = this.f3127s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f18) * 255.0f * f24));
        canvas2.drawCircle(this.f3116i0, this.f3117j0, lerp6, paint6);
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
        long currentTimeMillis = System.currentTimeMillis() - this.Q;
        if (this.f3126r0) {
            f33 = 0.0f;
        } else {
            f33 = 1.0f - f20;
        }
        if (this.f3104a != null) {
            j3 = 177000;
        } else {
            j3 = 60000;
        }
        long j10 = j3;
        float min = Math.min((((float) currentTimeMillis) / ((float) 60000)) * 360.0f, 360.0f);
        float e10 = this.f3129t0.e(this.f3130u0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e10 * f32, 1.0f - f33) * 255.0f));
        if (e10 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            zp.a(this.f3128s0, (float) ((SystemClock.elapsedRealtime() - this.f3131v0) % 5400));
            invalidate();
            float[] fArr = this.f3128s0;
            float f59 = fArr[0];
            float f60 = fArr[c10];
            float f61 = (f59 + f60) / 2.0f;
            float abs = Math.abs(f60 - f59) / 2.0f;
            if (this.f3130u0) {
                float f62 = min / 2.0f;
                f61 = AndroidUtilities.lerp((-90.0f) + f62, f61, e10);
                abs = AndroidUtilities.lerp(f62, abs, e10);
            }
            float f63 = f61 - abs;
            float f64 = abs * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f63, f64, false, paint7);
        }
        if (this.f3126r0) {
            invalidate();
            long j11 = currentTimeMillis / 1000;
            if (j11 != this.R / 1000) {
                ((sc) this.f3104a).f3660a.J0.a(j11, true);
            }
            if (j10 > 0 && currentTimeMillis >= j10) {
                post(new j8(this, 0));
            }
            this.R = currentTimeMillis;
        }
        canvas3.restore();
        boolean z13 = this.A0;
        org.telegram.ui.Components.xc xcVar3 = this.L;
        if (z13) {
            float a2 = xcVar3.a(0.2f) * f26;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.f3118k0, this.f3117j0);
                canvas3.drawCircle(this.f3118k0, this.f3117j0, AndroidUtilities.dp(22.0f), this.f3132w);
                canvas3.rotate(-getRotation(), this.f3118k0, this.f3117j0);
                this.f3112f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a10 = xcVar3.a(0.2f) * f46 * f24;
        if (a10 > 0.0f) {
            canvas3.save();
            canvas3.scale(a10, a10, this.f3118k0, this.f3117j0);
            canvas3.rotate(-getRotation(), this.f3118k0, this.f3117j0);
            this.f3106b.draw(canvas3);
            canvas3.restore();
        }
        if (this.O) {
            f34 = 1.0f;
        } else {
            f34 = 0.0f;
        }
        float d20 = this.P.d(f34, false);
        Paint paint8 = this.f3134x;
        org.telegram.ui.Components.d6 d6Var2 = this.N;
        org.telegram.ui.Components.xc xcVar4 = this.K;
        if (d20 > 0.0f) {
            canvas3.save();
            float a11 = xcVar4.a(0.2f) * d20 * f24;
            canvas3.scale(a11, a11, this.f3119l0, this.f3117j0);
            canvas3.rotate(d6Var2.d(this.M, false) - getRotation(), this.f3119l0, this.f3117j0);
            canvas3.drawCircle(this.f3119l0, this.f3117j0, AndroidUtilities.dp(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (d20 < 1.0f) {
            canvas3.save();
            f35 = f24;
            float A = org.telegram.messenger.a2.A(1.0f, d20, xcVar4.a(0.2f), f35);
            canvas3.scale(A, A, this.f3119l0, this.f3117j0);
            canvas3.rotate(d6Var2.d(this.M, false) - getRotation(), this.f3119l0, this.f3117j0);
            canvas3.drawCircle(this.f3119l0, this.f3117j0, AndroidUtilities.dp(22.0f), this.f3132w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f35 = f24;
        }
        if (this.f3138z0 && !b()) {
            float f65 = f17;
            f36 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f65), Math.max(f65, d15)) * f27 * f30 * f26;
        } else {
            f36 = 0.0f;
        }
        if (!this.f3138z0 && this.f3126r0) {
            f37 = 1.0f;
        } else {
            f37 = 0.0f;
        }
        float d21 = this.G0.d(f37, false);
        int i12 = (f36 > 0.0f ? 1 : (f36 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            Paint paint9 = this.f3136y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.f3137y0, this.f3117j0, f36, paint9);
            float f66 = this.f3137y0;
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
                float f71 = this.f3117j0;
                PointF pointF4 = this.P0;
                a(lerp, f71, d26, lerp2, pointF4);
                float f72 = this.f3117j0;
                PointF pointF5 = this.Q0;
                a(lerp, f72, d27, lerp2, pointF5);
                float f73 = this.f3117j0;
                PointF pointF6 = this.R0;
                float f74 = f43;
                a(f66, f73, d29, f74, pointF6);
                float f75 = this.f3117j0;
                PointF pointF7 = this.S0;
                a(f66, f75, d30, f74, pointF7);
                f38 = f74;
                f40 = f35;
                d6Var = d6Var2;
                xcVar = xcVar4;
                float min2 = Math.min(1.0f, (abs2 * 2.0f) / f67) * Math.min(clamp3 * 2.4f, v7.a7.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f67);
                float f76 = lerp2 * min2;
                float f77 = f38 * min2;
                a(pointF4.x, pointF4.y, d26 - 1.5707963705062866d, f76, this.T0);
                a(pointF5.x, pointF5.y, d27 + 1.5707963705062866d, f76, this.U0);
                a(pointF6.x, pointF6.y, d29 + 1.5707963705062866d, f77, this.V0);
                a(pointF7.x, pointF7.y, d30 - 1.5707963705062866d, f77, this.W0);
                float f78 = f26;
                float C = com.google.android.gms.internal.vision.e2.C(f27, f30, f78, f16);
                if (C > 0.0f) {
                    Path path2 = this.N0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.T0;
                    float f79 = pointF8.x;
                    float f80 = pointF8.y;
                    f26 = f78;
                    PointF pointF9 = this.V0;
                    path2.cubicTo(f79, f80, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.W0;
                    float f81 = pointF10.x;
                    float f82 = pointF10.y;
                    PointF pointF11 = this.U0;
                    path2.cubicTo(f81, f82, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f83 = this.f3117j0;
                    rectF3.set(f28, f83 - lerp2, f25, f83 + lerp2);
                    float f84 = f31;
                    canvas3.drawRoundRect(rectF3, f84, f84, paint9);
                } else {
                    f26 = f78;
                }
            } else {
                f38 = f36;
                d6Var = d6Var2;
                xcVar = xcVar4;
                f39 = d21;
                i10 = i12;
                f40 = f35;
            }
        } else {
            f38 = f36;
            d6Var = d6Var2;
            xcVar = xcVar4;
            f39 = d21;
            i10 = i12;
            f40 = f35;
            f41 = 22.0f;
        }
        if (i10 > 0 || f39 > 0.0f) {
            float a12 = xcVar3.a(0.2f) * f26 * f40;
            canvas3.save();
            Path path3 = this.O0;
            path3.rewind();
            if (i10 > 0) {
                path3.addCircle(this.f3137y0, this.f3117j0, f38, Path.Direction.CW);
            }
            if (f39 > 0.0f && this.A0) {
                path3.addCircle(this.f3118k0, this.f3117j0, f39 * AndroidUtilities.dp(f41) * a12, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.A0) {
                canvas3.save();
                canvas3.scale(a12, a12, this.f3118k0, this.f3117j0);
                canvas3.drawCircle(this.f3118k0, this.f3117j0, AndroidUtilities.dp(f41), paint8);
                canvas3.rotate(-getRotation(), this.f3118k0, this.f3117j0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a13 = xcVar.a(0.2f) * f40;
            canvas3.save();
            canvas3.scale(a13, a13, this.f3119l0, this.f3117j0);
            canvas3.rotate(d6Var.d(this.M, false) - getRotation(), this.f3119l0, this.f3117j0);
            canvas3.drawCircle(this.f3119l0, this.f3117j0, AndroidUtilities.dp(f41), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        l8 l8Var = this.W;
        if (l8Var != null) {
            boolean b10 = b();
            boolean z14 = this.f3105a0;
            boolean z15 = this.f3126r0;
            if (z14 == z15 && this.f3107b0 == b10 && this.f3109c0 == this.O && this.f3110d0 == this.f3122o0 && this.f3111e0 == this.f3130u0 && this.f3113f0 == this.A0) {
                return;
            }
            this.f3105a0 = z15;
            this.f3107b0 = b10;
            this.f3109c0 = this.O;
            this.f3110d0 = this.f3122o0;
            this.f3111e0 = this.f3130u0;
            this.f3113f0 = this.A0;
            l8Var.i();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.f3116i0 = f7 / 2.0f;
        this.f3117j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.f3116i0;
        this.f3118k0 = f10 - min;
        float f11 = f10 + min;
        this.f3119l0 = f11;
        float f12 = this.f3117j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f3119l0;
        float f14 = this.f3117j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f3112f, this.f3118k0, this.f3117j0);
        f(this.h, this.f3118k0, this.f3117j0);
        f(this.f3120n, this.f3118k0, this.f3117j0);
        this.f3106b.setImageCoords(this.f3118k0 - AndroidUtilities.dp(20.0f), this.f3117j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f3116i0, this.f3117j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        l8 l8Var = this.W;
        if (l8Var != null) {
            l8Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f3119l0, this.f3118k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.f3119l0, this.f3117j0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f3130u0;
        org.telegram.ui.Components.xc xcVar = this.L;
        org.telegram.ui.Components.xc xcVar2 = this.J;
        org.telegram.ui.Components.xc xcVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            xcVar2.c(false);
            xcVar3.c(false);
            xcVar.c(false);
        } else if (action == 0 || this.f3133w0) {
            xcVar2.c(c(clamp, y3, this.f3116i0, this.f3117j0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y3, this.f3119l0, this.f3117j0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xcVar3.c(z10);
            if (c(clamp, y3, this.f3118k0, this.f3117j0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            xcVar.c(z11);
        }
        j8 j8Var = this.M0;
        j8 j8Var2 = this.L0;
        if (action == 0) {
            this.f3133w0 = true;
            this.f3135x0 = (xcVar2.h || xcVar3.h) ? true : true;
            System.currentTimeMillis();
            this.f3137y0 = clamp;
            if (Math.abs(clamp - this.f3116i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(j8Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (xcVar3.h) {
                AndroidUtilities.runOnUIThread(j8Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f3133w0) {
                this.f3137y0 = Utilities.clamp(clamp, this.f3119l0, this.f3118k0);
                invalidate();
                if (this.f3126r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((sc) this.f3104a).b();
                }
                if (this.f3126r0 && this.f3138z0) {
                    float clamp2 = Utilities.clamp(((this.f3117j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    ce ceVar = ((sc) this.f3104a).f3660a;
                    ceVar.V0.b(clamp2, true);
                    ceVar.j0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f3133w0) {
                this.f3133w0 = false;
                this.f3135x0 = false;
                AndroidUtilities.cancelRunOnUIThread(j8Var2);
                AndroidUtilities.cancelRunOnUIThread(j8Var);
                boolean z15 = this.f3126r0;
                if (!z15 && xcVar.h) {
                    ce ceVar2 = ((sc) this.f3104a).f3660a;
                    if (ceVar2.f2448f0 == 0 && !ceVar2.P1 && !ceVar2.Q1 && ce.b(ceVar2)) {
                        ceVar2.f(true);
                    }
                } else if (z15 && this.f3138z0) {
                    if (xcVar.h) {
                        this.f3138z0 = false;
                        this.G0.d(1.0f, true);
                        u4 u4Var = ((sc) this.f3104a).f3660a.T0;
                        u4Var.f3715a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        u4Var.invalidate();
                    } else {
                        this.f3126r0 = false;
                        this.f3131v0 = SystemClock.elapsedRealtime();
                        this.f3130u0 = true;
                        ((sc) this.f3104a).d(false);
                    }
                } else if (xcVar2.h) {
                    if (b()) {
                        ((sc) this.f3104a).a();
                    } else if (!this.f3122o0 && !this.f3126r0 && !this.f3138z0) {
                        ((sc) this.f3104a).c();
                    } else if (!this.f3126r0) {
                        if (ce.d(((sc) this.f3104a).f3660a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((sc) this.f3104a).e(new j8(this, 1), false);
                        }
                    } else {
                        this.f3126r0 = false;
                        this.f3131v0 = SystemClock.elapsedRealtime();
                        this.f3130u0 = true;
                        ((sc) this.f3104a).d(false);
                    }
                }
                this.f3138z0 = false;
                if (xcVar3.h) {
                    d(180.0f);
                    ((sc) this.f3104a).b();
                }
                xcVar2.c(false);
                xcVar3.c(false);
                xcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z13;
    }

    public void setDelegate(k8 k8Var) {
        this.f3104a = k8Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f3127s.setColor(i0.a.d(f7, -1, -16777216));
        this.f3132w.setColor(i0.a.d(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.d(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.d(f7, 402653184, 805306368));
        int d = i0.a.d(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f3112f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), mode));
    }
}
