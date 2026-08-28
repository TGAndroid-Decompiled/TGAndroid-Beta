package kh;

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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
public final class z6 extends View implements r2 {
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
    public final org.telegram.ui.Components.pc F;
    public final org.telegram.ui.Components.y5 F0;
    public final org.telegram.ui.Components.pc G;
    public final org.telegram.ui.Components.y5 G0;
    public final org.telegram.ui.Components.pc H;
    public final w6 H0;
    public float I;
    public final w6 I0;
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
    public final y6 S;
    public final PointF S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public boolean V;
    public boolean W;
    public x6 f16428a;
    public boolean f16429a0;
    public final ImageReceiver f16430b;
    public boolean f16431b0;
    public final fq f16432c;
    public float f16433c0;
    public final Drawable d;
    public final org.telegram.ui.Components.y5 f16434d0;
    public final Drawable f16435e;
    public float f16436e0;
    public final Drawable f16437f;
    public float f16438f0;
    public float f16439g0;
    public final Drawable h;
    public float f16440h0;
    public final org.telegram.ui.Components.y5 f16441i0;
    public float f16442j0;
    public boolean f16443k0;
    public final org.telegram.ui.Components.y5 f16444l0;
    public final org.telegram.ui.Components.y5 m0;
    public final Drawable f16445n;
    public boolean f16446n0;
    public final float[] f16447o0;
    public final org.telegram.ui.Components.y5 f16448p0;
    public boolean f16449q0;
    public final Paint f16450r;
    public long f16451r0;
    public final Paint f16452s;
    public boolean f16453s0;
    public boolean f16454t0;
    public float f16455u0;
    public final Paint v;
    public boolean f16456v0;
    public final Paint f16457w;
    public boolean f16458w0;
    public final Paint f16459x;
    public final org.telegram.ui.Components.y5 f16460x0;
    public final Paint f16461y;
    public final org.telegram.ui.Components.y5 f16462y0;
    public final org.telegram.ui.Components.y5 f16463z0;

    public z6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f16430b = imageReceiver;
        this.f16450r = new Paint(1);
        Paint paint = new Paint(1);
        this.f16452s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f16457w = paint3;
        Paint paint4 = new Paint(1);
        this.f16459x = paint4;
        Paint paint5 = new Paint(1);
        this.f16461y = paint5;
        Paint paint6 = new Paint(1);
        this.A = paint6;
        Paint paint7 = new Paint(1);
        this.B = paint7;
        Paint paint8 = new Paint(1);
        this.C = paint8;
        Matrix matrix = new Matrix();
        this.D = matrix;
        this.F = new org.telegram.ui.Components.pc(this);
        this.G = new org.telegram.ui.Components.pc(this);
        this.H = new org.telegram.ui.Components.pc(this);
        gr grVar = gr.h;
        this.J = new org.telegram.ui.Components.y5(this, 0L, 310L, grVar);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 330L, grVar);
        this.O = new Path();
        this.P = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.Q = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.R = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f16434d0 = new org.telegram.ui.Components.y5(this, 0L, 200L, gr.f28844f);
        this.f16441i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.f16442j0 = -1.0f;
        this.f16443k0 = true;
        this.f16444l0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 850L, grVar);
        this.f16447o0 = new float[2];
        this.f16448p0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.f16460x0 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.f16462y0 = new org.telegram.ui.Components.y5(this, 0L, 650L, grVar);
        this.f16463z0 = new org.telegram.ui.Components.y5(this, 0L, 160L, gr.f28846i);
        this.A0 = new org.telegram.ui.Components.y5(this, 0L, 750L, grVar);
        this.B0 = new org.telegram.ui.Components.y5(this, 0L, 650L, grVar);
        this.C0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.E0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.F0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.G0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.H0 = new w6(this, 2);
        this.I0 = new w6(this, 3);
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
        y6 y6Var = new y6(this, this);
        this.S = y6Var;
        r0.j0.k(this, y6Var);
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
        fq fqVar = new fq(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f16432c = fqVar;
        fqVar.f28550w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        fqVar.f28545e = dp;
        fqVar.f28546f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.f16435e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f16437f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f16445n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d9 = f12;
        pointF.x = (float) ((Math.cos(d) * d9) + f10);
        pointF.y = (float) ((Math.sin(d) * d9) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        if (this.D0 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f16446n0) {
            if ((!z10 || f13 - f11 <= AndroidUtilities.dp(100.0f)) && Math.abs(f12 - f10) <= f14) {
                return true;
            }
            return false;
        } else if (g7.w.a(f10, f11, f12, f13) <= f14) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f10) {
        long j10;
        if (f10 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.J.f34857g = j10;
        this.I += f10;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        y6 y6Var = this.S;
        if (y6Var != null && y6Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(float f10, boolean z10) {
        boolean z11;
        if (Math.abs(f10 - this.D0) < 0.01f) {
            return;
        }
        this.D0 = f10;
        if (!z10) {
            if (f10 > 0.0f && !this.f16446n0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0.f(z11, true);
            this.F0.d(f10, true);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.f16449q0 = false;
        if (!z10) {
            org.telegram.ui.Components.y5 y5Var = this.f16448p0;
            y5Var.getClass();
            y5Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        x6 x6Var = this.f16428a;
        ImageReceiver imageReceiver = this.f16430b;
        if (x6Var != null) {
            x6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f12255w.f14977b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((a8) arrayList2.get(0)).O0 != null) {
                this.f16430b.setImage(ImageLocation.getForPath(((a8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f16432c, 0L, null, null, 0);
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
            this.f16430b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f16432c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f16430b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f16432c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f16430b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f16432c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f16432c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16430b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f16430b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z10;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        char c10;
        float f22;
        float f23;
        Canvas canvas2;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        RectF rectF;
        Paint paint;
        float f31;
        RectF rectF2;
        float f32;
        float f33;
        boolean z11;
        boolean z12;
        RectF rectF3;
        float f34;
        long j10;
        Canvas canvas3;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        org.telegram.ui.Components.y5 y5Var;
        org.telegram.ui.Components.pc pcVar;
        float f40;
        int i9;
        float f41;
        float f42;
        float f43;
        float f44;
        double d;
        double d9;
        double d10;
        float f45;
        if (this.f16446n0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d11 = this.f16444l0.d(f10, false);
        if (this.f16446n0) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d12 = this.m0.d(f11, false);
        float f46 = this.f16442j0;
        if (f46 < 0.0f) {
            if (this.f16443k0) {
                f45 = 1.0f;
            } else {
                f45 = 0.0f;
            }
            f46 = this.f16441i0.d(f45, false);
        }
        float max = Math.max(d11, f46);
        if (this.f16453s0) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float d13 = this.f16460x0.d(f12, false);
        org.telegram.ui.Components.pc pcVar2 = this.F;
        if (Math.abs(this.f16455u0 - this.f16436e0) < AndroidUtilities.dp(64.0f) && (this.f16446n0 || pcVar2.h)) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float d14 = this.f16462y0.d(f13, false) * d13;
        if (Math.abs(this.f16455u0 - this.f16436e0) < AndroidUtilities.dp(64.0f)) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        float d15 = this.f16463z0.d(f14, false) * d13;
        float clamp = Utilities.clamp((this.f16455u0 - this.f16436e0) / AndroidUtilities.dp(16.0f), 1.0f, -1.0f);
        float clamp2 = Utilities.clamp((this.f16455u0 - this.f16436e0) / AndroidUtilities.dp(64.0f), 1.0f, -1.0f);
        if (Math.min(Math.abs(this.f16455u0 - this.f16440h0), Math.abs(this.f16455u0 - this.f16439g0)) < AndroidUtilities.dp(16.0f)) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        float d16 = this.B0.d(f15, false) * d13;
        if (this.D0 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f47 = 1.0f - d11;
        float e10 = this.E0.e(z10) * f47;
        float d17 = this.F0.d(this.D0, false);
        float e11 = this.G0.e(b());
        if (this.f16456v0) {
            f16 = d11 * max * d13;
        } else {
            f16 = 0.0f;
        }
        if (f16 > 0.0f) {
            f22 = 1.0f;
            float dp = this.f16436e0 - AndroidUtilities.dp(50.0f);
            f23 = 0.0f;
            float dp2 = this.f16436e0 + AndroidUtilities.dp(50.0f);
            Paint paint2 = this.A;
            paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Paint paint3 = this.B;
            paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
            f19 = e10;
            float f48 = f16;
            f21 = d12;
            f18 = d16;
            f17 = d15;
            c10 = 1;
            f20 = e11;
            canvas.drawLine(dp2, this.f16438f0, AndroidUtilities.lerp(dp2, this.f16440h0 - AndroidUtilities.dp(30.0f), f16), this.f16438f0, paint3);
            canvas.drawLine(dp2, this.f16438f0, AndroidUtilities.lerp(dp2, this.f16440h0 - AndroidUtilities.dp(30.0f), f48), this.f16438f0, paint2);
            canvas.drawLine(dp, this.f16438f0, AndroidUtilities.lerp(dp, this.f16439g0 + AndroidUtilities.dp(30.0f), f48), this.f16438f0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(dp, this.f16438f0, AndroidUtilities.lerp(dp, this.f16439g0 + AndroidUtilities.dp(30.0f), f48), this.f16438f0, paint2);
        } else {
            f17 = d15;
            f18 = d16;
            f19 = e10;
            f20 = e11;
            f21 = d12;
            c10 = 1;
            f22 = 1.0f;
            f23 = 0.0f;
            canvas2 = canvas;
        }
        float f49 = this.f16436e0;
        float lerp = AndroidUtilities.lerp(f49, this.A0.d((AndroidUtilities.dp(4.0f) * clamp) + f49, false), d14);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(12.0f), d11), AndroidUtilities.dp(32.0f) - (Math.abs(clamp2) * AndroidUtilities.dp(4.0f)), d14);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), d11), AndroidUtilities.dp(32.0f), d14);
        if (this.f16443k0) {
            f24 = 0.0f;
        } else {
            f24 = 0.2f;
        }
        float lerp4 = AndroidUtilities.lerp(pcVar2.a(f24), (this.f16434d0.d(this.f16433c0, false) * 0.2f) + f22, d11);
        RectF rectF4 = AndroidUtilities.rectTmp;
        float f50 = lerp - lerp2;
        float f51 = this.f16438f0;
        float f52 = lerp + lerp2;
        rectF4.set(f50, f51 - lerp2, f52, f51 + lerp2);
        float f53 = f22 - f20;
        int d18 = i0.a.d(max * f53, -1, -577231);
        Paint paint4 = this.f16450r;
        paint4.setColor(d18);
        int i10 = (f20 > f23 ? 1 : (f20 == f23 ? 0 : -1));
        if (i10 > 0) {
            canvas2.save();
            canvas2.scale(lerp4, lerp4, this.f16436e0, this.f16438f0);
            paint4.setAlpha((int) (f53 * 255.0f));
            canvas2.drawRoundRect(rectF4, lerp3, lerp3, paint4);
            canvas2.restore();
            f26 = f52;
            f27 = d11;
            f29 = f50;
            f25 = f53;
            f30 = lerp4;
            rectF = rectF4;
            f31 = max;
            f28 = d13;
            paint = paint4;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            f25 = f53;
            f26 = f52;
            f27 = d11;
            f28 = d13;
            f29 = f50;
            f30 = lerp4;
            rectF = rectF4;
            paint = paint4;
            f31 = max;
            canvas2.save();
        }
        canvas2.scale(f30, f30, this.f16436e0, this.f16438f0);
        paint.setAlpha(255);
        canvas2.drawRoundRect(rectF, lerp3, lerp3, paint);
        if (i10 > 0) {
            Paint paint5 = this.C;
            paint5.setStrokeWidth(AndroidUtilities.dp(4.0f));
            Path path = this.O;
            path.rewind();
            PointF pointF = this.P;
            f33 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f54 = pointF.x;
            PointF pointF2 = this.Q;
            float f55 = f20 / 0.3f;
            rectF2 = rectF;
            f32 = lerp3;
            path.lineTo(AndroidUtilities.lerp(f54, pointF2.x, Utilities.clamp(f55, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF.y, pointF2.y, Utilities.clamp(f55, 1.0f, 0.0f)));
            if (f20 > 0.3f) {
                float f56 = pointF2.x;
                PointF pointF3 = this.R;
                float f57 = (f20 - 0.3f) / 0.7f;
                path.lineTo(AndroidUtilities.lerp(f56, pointF3.x, Utilities.clamp(f57, 1.0f, 0.0f)), AndroidUtilities.lerp(pointF2.y, pointF3.y, Utilities.clamp(f57, 1.0f, 0.0f)));
            }
            canvas2.translate(this.f16436e0, this.f16438f0);
            canvas2.drawPath(path, paint5);
        } else {
            rectF2 = rectF;
            f32 = lerp3;
            f33 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f30, 1.0f);
        canvas2.scale(max2, max2, this.f16436e0, this.f16438f0);
        float max3 = Math.max(AndroidUtilities.dpf2(33.5f), ((1.0f - d14) * AndroidUtilities.dp(5.0f) * f19) + AndroidUtilities.lerp(AndroidUtilities.dpf2(4.5f), AndroidUtilities.dp(9.0f), d14) + lerp2);
        float lerp5 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), f19);
        float lerp6 = AndroidUtilities.lerp(max3, (lerp2 - lerp5) - AndroidUtilities.dp(4.0f), f20);
        float f58 = this.f16436e0;
        float f59 = this.f16438f0;
        RectF rectF5 = rectF2;
        rectF5.set(f58 - lerp6, f59 - lerp6, f58 + lerp6, f59 + lerp6);
        Paint paint6 = this.f16452s;
        paint6.setStrokeWidth(lerp5);
        paint6.setAlpha((int) (AndroidUtilities.lerp(1.0f, 0.3f, f19) * 255.0f * f25));
        canvas2.drawCircle(this.f16436e0, this.f16438f0, lerp6, paint6);
        if (f19 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d17 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 & z11) {
            paint6.setAlpha(255);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, d17 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.M;
        if (this.f16446n0) {
            f34 = 0.0f;
        } else {
            f34 = 1.0f - f21;
        }
        if (this.f16428a != null) {
            j10 = 177000;
        } else {
            j10 = 60000;
        }
        long j11 = j10;
        float min = Math.min((((float) currentTimeMillis) / ((float) 60000)) * 360.0f, 360.0f);
        float e12 = this.f16448p0.e(this.f16449q0);
        Paint paint7 = this.v;
        paint7.setStrokeWidth(lerp5);
        paint7.setAlpha((int) (Math.max(e12 * f33, 1.0f - f34) * 255.0f));
        if (e12 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            jp.a(this.f16447o0, (float) ((SystemClock.elapsedRealtime() - this.f16451r0) % 5400));
            invalidate();
            float[] fArr = this.f16447o0;
            float f60 = fArr[0];
            float f61 = fArr[c10];
            float f62 = (f60 + f61) / 2.0f;
            float abs = Math.abs(f61 - f60) / 2.0f;
            if (this.f16449q0) {
                float f63 = min / 2.0f;
                f62 = AndroidUtilities.lerp((-90.0f) + f63, f62, e12);
                abs = AndroidUtilities.lerp(f63, abs, e12);
            }
            float f64 = f62 - abs;
            float f65 = abs * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f64, f65, false, paint7);
        }
        if (this.f16446n0) {
            invalidate();
            long j12 = currentTimeMillis / 1000;
            if (j12 != this.N / 1000) {
                ((ra) this.f16428a).f15971a.F0.a(j12, true);
            }
            if (j11 > 0 && currentTimeMillis >= j11) {
                post(new w6(this, 0));
            }
            this.N = currentTimeMillis;
        }
        canvas3.restore();
        boolean z13 = this.f16458w0;
        org.telegram.ui.Components.pc pcVar3 = this.H;
        if (z13) {
            float a2 = pcVar3.a(0.2f) * f27;
            if (a2 > 0.0f) {
                canvas3.save();
                canvas3.scale(a2, a2, this.f16439g0, this.f16438f0);
                canvas3.drawCircle(this.f16439g0, this.f16438f0, AndroidUtilities.dp(22.0f), this.f16457w);
                canvas3.rotate(-getRotation(), this.f16439g0, this.f16438f0);
                this.f16437f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a3 = pcVar3.a(0.2f) * f47 * f25;
        if (a3 > 0.0f) {
            canvas3.save();
            canvas3.scale(a3, a3, this.f16439g0, this.f16438f0);
            canvas3.rotate(-getRotation(), this.f16439g0, this.f16438f0);
            this.f16430b.draw(canvas3);
            canvas3.restore();
        }
        if (this.K) {
            f35 = 1.0f;
        } else {
            f35 = 0.0f;
        }
        float d19 = this.L.d(f35, false);
        Paint paint8 = this.f16459x;
        org.telegram.ui.Components.y5 y5Var2 = this.J;
        org.telegram.ui.Components.pc pcVar4 = this.G;
        if (d19 > 0.0f) {
            canvas3.save();
            float a10 = pcVar4.a(0.2f) * d19 * f25;
            canvas3.scale(a10, a10, this.f16440h0, this.f16438f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.f16440h0, this.f16438f0);
            canvas3.drawCircle(this.f16440h0, this.f16438f0, AndroidUtilities.dp(22.0f), paint8);
            this.f16435e.draw(canvas3);
            canvas3.restore();
        }
        if (d19 < 1.0f) {
            canvas3.save();
            f36 = f25;
            float y10 = org.telegram.messenger.l0.y(1.0f, d19, pcVar4.a(0.2f), f36);
            canvas3.scale(y10, y10, this.f16440h0, this.f16438f0);
            canvas3.rotate(y5Var2.d(this.I, false) - getRotation(), this.f16440h0, this.f16438f0);
            canvas3.drawCircle(this.f16440h0, this.f16438f0, AndroidUtilities.dp(22.0f), this.f16457w);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f36 = f25;
        }
        if (this.f16456v0 && !b()) {
            float f66 = f18;
            f37 = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.lerp((Math.abs(clamp2) * AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(22.0f), f66), Math.max(f66, d14)) * f28 * f31 * f27;
        } else {
            f37 = 0.0f;
        }
        if (!this.f16456v0 && this.f16446n0) {
            f38 = 1.0f;
        } else {
            f38 = 0.0f;
        }
        float d20 = this.C0.d(f38, false);
        int i11 = (f37 > 0.0f ? 1 : (f37 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            Paint paint9 = this.f16461y;
            paint9.setAlpha(255);
            canvas3.drawCircle(this.f16455u0, this.f16438f0, f37, paint9);
            float f67 = this.f16455u0;
            f42 = 22.0f;
            float clamp3 = Utilities.clamp(1.0f - ((Math.abs(clamp2) * f28) / 1.3f), 1.0f, 0.0f);
            float abs2 = Math.abs(lerp - f67);
            if (abs2 < lerp2 + (f37 * 2.0f) && clamp3 < 0.6f) {
                float f68 = lerp2 + f37;
                if (abs2 < f68) {
                    float f69 = lerp2 * lerp2;
                    float f70 = abs2 * abs2;
                    float f71 = f37 * f37;
                    f44 = f37;
                    f40 = d20;
                    i9 = i11;
                    double acos = Math.acos(((f69 + f70) - f71) / ((lerp2 * 2.0f) * abs2));
                    d9 = Math.acos(((f71 + f70) - f69) / (f43 * abs2));
                    d = acos;
                } else {
                    f44 = f37;
                    f40 = d20;
                    i9 = i11;
                    d = 0.0d;
                    d9 = 0.0d;
                }
                if (f67 > lerp) {
                    d10 = 0.0d;
                } else {
                    d10 = 3.141592653589793d;
                }
                double d21 = d;
                double acos2 = (float) Math.acos((lerp2 - f44) / abs2);
                double d22 = acos2 - d21;
                double d23 = clamp3;
                double d24 = d22 * d23;
                double d25 = d10 + d21 + d24;
                double d26 = (d10 - d21) - d24;
                double d27 = ((3.141592653589793d - d9) - acos2) * d23;
                double d28 = ((d10 + 3.141592653589793d) - d9) - d27;
                double d29 = (d10 - 3.141592653589793d) + d9 + d27;
                float f72 = this.f16438f0;
                PointF pointF4 = this.L0;
                a(lerp, f72, d25, lerp2, pointF4);
                float f73 = this.f16438f0;
                PointF pointF5 = this.M0;
                a(lerp, f73, d26, lerp2, pointF5);
                float f74 = this.f16438f0;
                PointF pointF6 = this.N0;
                float f75 = f44;
                a(f67, f74, d28, f75, pointF6);
                float f76 = this.f16438f0;
                PointF pointF7 = this.O0;
                a(f67, f76, d29, f75, pointF7);
                f39 = f75;
                f41 = f36;
                y5Var = y5Var2;
                pcVar = pcVar4;
                float min2 = Math.min(1.0f, (abs2 * 2.0f) / f68) * Math.min(clamp3 * 2.4f, g7.w.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f68);
                float f77 = lerp2 * min2;
                float f78 = f39 * min2;
                a(pointF4.x, pointF4.y, d25 - 1.5707963705062866d, f77, this.P0);
                a(pointF5.x, pointF5.y, d26 + 1.5707963705062866d, f77, this.Q0);
                a(pointF6.x, pointF6.y, d28 + 1.5707963705062866d, f78, this.R0);
                a(pointF7.x, pointF7.y, d29 - 1.5707963705062866d, f78, this.S0);
                float f79 = f27;
                float C = e2.c.C(f28, f31, f79, f17);
                if (C > 0.0f) {
                    Path path2 = this.J0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.P0;
                    float f80 = pointF8.x;
                    float f81 = pointF8.y;
                    f27 = f79;
                    PointF pointF9 = this.R0;
                    path2.cubicTo(f80, f81, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.S0;
                    float f82 = pointF10.x;
                    float f83 = pointF10.y;
                    PointF pointF11 = this.Q0;
                    path2.cubicTo(f82, f83, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint9);
                    float f84 = this.f16438f0;
                    rectF3.set(f29, f84 - lerp2, f26, f84 + lerp2);
                    float f85 = f32;
                    canvas3.drawRoundRect(rectF3, f85, f85, paint9);
                } else {
                    f27 = f79;
                }
            } else {
                f39 = f37;
                y5Var = y5Var2;
                pcVar = pcVar4;
                f40 = d20;
                i9 = i11;
                f41 = f36;
            }
        } else {
            f39 = f37;
            y5Var = y5Var2;
            pcVar = pcVar4;
            f40 = d20;
            i9 = i11;
            f41 = f36;
            f42 = 22.0f;
        }
        if (i9 > 0 || f40 > 0.0f) {
            float a11 = pcVar3.a(0.2f) * f27 * f41;
            canvas3.save();
            Path path3 = this.K0;
            path3.rewind();
            if (i9 > 0) {
                path3.addCircle(this.f16455u0, this.f16438f0, f39, Path.Direction.CW);
            }
            if (f40 > 0.0f && this.f16458w0) {
                path3.addCircle(this.f16439g0, this.f16438f0, f40 * AndroidUtilities.dp(f42) * a11, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.f16458w0) {
                canvas3.save();
                canvas3.scale(a11, a11, this.f16439g0, this.f16438f0);
                canvas3.drawCircle(this.f16439g0, this.f16438f0, AndroidUtilities.dp(f42), paint8);
                canvas3.rotate(-getRotation(), this.f16439g0, this.f16438f0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a12 = pcVar.a(0.2f) * f41;
            canvas3.save();
            canvas3.scale(a12, a12, this.f16440h0, this.f16438f0);
            canvas3.rotate(y5Var.d(this.I, false) - getRotation(), this.f16440h0, this.f16438f0);
            canvas3.drawCircle(this.f16440h0, this.f16438f0, AndroidUtilities.dp(f42), paint8);
            this.f16435e.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        y6 y6Var = this.S;
        if (y6Var != null) {
            boolean b10 = b();
            boolean z14 = this.T;
            boolean z15 = this.f16446n0;
            if (z14 == z15 && this.U == b10 && this.V == this.K && this.W == this.f16443k0 && this.f16429a0 == this.f16449q0 && this.f16431b0 == this.f16458w0) {
                return;
            }
            this.T = z15;
            this.U = b10;
            this.V = this.K;
            this.W = this.f16443k0;
            this.f16429a0 = this.f16449q0;
            this.f16431b0 = this.f16458w0;
            y6Var.i();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(100.0f);
        float f10 = size;
        this.f16436e0 = f10 / 2.0f;
        this.f16438f0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f10 * 0.35f);
        float f11 = this.f16436e0;
        this.f16439g0 = f11 - min;
        float f12 = f11 + min;
        this.f16440h0 = f12;
        float f13 = this.f16438f0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f12 - dp2), (int) (f13 - dp2), (int) (f12 + dp2), (int) (f13 + dp2));
        float f14 = this.f16440h0;
        float f15 = this.f16438f0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.f16435e.setBounds((int) (f14 - dp3), (int) (f15 - dp3), (int) (f14 + dp3), (int) (f15 + dp3));
        f(this.f16437f, this.f16439g0, this.f16438f0);
        f(this.h, this.f16439g0, this.f16438f0);
        f(this.f16445n, this.f16439g0, this.f16438f0);
        this.f16430b.setImageCoords(this.f16439g0 - AndroidUtilities.dp(20.0f), this.f16438f0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.D;
        matrix.reset();
        matrix.postTranslate(this.f16436e0, this.f16438f0);
        this.E.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        y6 y6Var = this.S;
        if (y6Var != null) {
            y6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f16440h0, this.f16439g0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y10, this.f16440h0, this.f16438f0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f16449q0;
        org.telegram.ui.Components.pc pcVar = this.H;
        org.telegram.ui.Components.pc pcVar2 = this.F;
        org.telegram.ui.Components.pc pcVar3 = this.G;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            pcVar2.c(false);
            pcVar3.c(false);
            pcVar.c(false);
        } else if (action == 0 || this.f16453s0) {
            pcVar2.c(c(clamp, y10, this.f16436e0, this.f16438f0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y10, this.f16440h0, this.f16438f0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            pcVar3.c(z10);
            if (c(clamp, y10, this.f16439g0, this.f16438f0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            pcVar.c(z11);
        }
        w6 w6Var = this.I0;
        w6 w6Var2 = this.H0;
        if (action == 0) {
            this.f16453s0 = true;
            this.f16454t0 = (pcVar2.h || pcVar3.h) ? true : true;
            System.currentTimeMillis();
            this.f16455u0 = clamp;
            if (Math.abs(clamp - this.f16436e0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(w6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (pcVar3.h) {
                AndroidUtilities.runOnUIThread(w6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f16453s0) {
                this.f16455u0 = Utilities.clamp(clamp, this.f16440h0, this.f16439g0);
                invalidate();
                if (this.f16446n0 && !this.T0 && c10) {
                    d(180.0f);
                    ((ra) this.f16428a).b();
                }
                if (this.f16446n0 && this.f16456v0) {
                    float clamp2 = Utilities.clamp(((this.f16438f0 - AndroidUtilities.dp(48.0f)) - y10) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    wb wbVar = ((ra) this.f16428a).f15971a;
                    wbVar.R0.b(clamp2, true);
                    wbVar.j0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f16453s0) {
                this.f16453s0 = false;
                this.f16454t0 = false;
                AndroidUtilities.cancelRunOnUIThread(w6Var2);
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                boolean z15 = this.f16446n0;
                if (!z15 && pcVar.h) {
                    wb wbVar2 = ((ra) this.f16428a).f15971a;
                    if (wbVar2.f16250b0 == 0 && !wbVar2.L1 && !wbVar2.M1 && wb.b(wbVar2)) {
                        wbVar2.f(true);
                    }
                } else if (z15 && this.f16456v0) {
                    if (pcVar.h) {
                        this.f16456v0 = false;
                        this.C0.d(1.0f, true);
                        v3 v3Var = ((ra) this.f16428a).f15971a.P0;
                        v3Var.f16192a.q(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        v3Var.invalidate();
                    } else {
                        this.f16446n0 = false;
                        this.f16451r0 = SystemClock.elapsedRealtime();
                        this.f16449q0 = true;
                        ((ra) this.f16428a).d(false);
                    }
                } else if (pcVar2.h) {
                    if (b()) {
                        ((ra) this.f16428a).a();
                    } else if (!this.f16443k0 && !this.f16446n0 && !this.f16456v0) {
                        ((ra) this.f16428a).c();
                    } else if (!this.f16446n0) {
                        if (wb.d(((ra) this.f16428a).f15971a)) {
                            this.N = 0L;
                            this.M = System.currentTimeMillis();
                            this.f16458w0 = false;
                            ((ra) this.f16428a).e(new w6(this, 1), false);
                        }
                    } else {
                        this.f16446n0 = false;
                        this.f16451r0 = SystemClock.elapsedRealtime();
                        this.f16449q0 = true;
                        ((ra) this.f16428a).d(false);
                    }
                }
                this.f16456v0 = false;
                if (pcVar3.h) {
                    d(180.0f);
                    ((ra) this.f16428a).b();
                }
                pcVar2.c(false);
                pcVar3.c(false);
                pcVar.c(false);
                invalidate();
            }
            return false;
        }
        this.T0 = c10;
        return z13;
    }

    public void setDelegate(x6 x6Var) {
        this.f16428a = x6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.K) {
            this.K = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f16452s.setColor(i0.a.d(f10, -1, -16777216));
        this.f16457w.setColor(i0.a.d(f10, 1677721600, 369098752));
        this.A.setColor(i0.a.d(f10, 1493172223, 285212671));
        this.B.setColor(i0.a.d(f10, 402653184, 805306368));
        int d = i0.a.d(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f16437f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), mode));
    }
}
