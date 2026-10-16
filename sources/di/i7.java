package di;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
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
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
public final class i7 extends View implements v2 {
    public boolean A0;
    public final org.telegram.ui.Components.g6 B0;
    public final org.telegram.ui.Components.g6 C0;
    public final org.telegram.ui.Components.g6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.g6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.g6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.g6 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.g6 I0;
    public final org.telegram.ui.Components.ad J;
    public final org.telegram.ui.Components.g6 J0;
    public final org.telegram.ui.Components.ad K;
    public final org.telegram.ui.Components.g6 K0;
    public final org.telegram.ui.Components.ad L;
    public final f7 L0;
    public float M;
    public final f7 M0;
    public final org.telegram.ui.Components.g6 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.g6 P;
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
    public final h7 W;
    public final PointF W0;
    public boolean X0;
    public g7 f7048a;
    public boolean f7049a0;
    public final ImageReceiver f7050b;
    public boolean f7051b0;
    public final cr f7052c;
    public boolean f7053c0;
    public final Drawable d;
    public boolean f7054d0;
    public final Drawable e;
    public boolean f7055e0;
    public final Drawable f7056f;
    public boolean f7057f0;
    public float f7058g0;
    public final Drawable h;
    public final org.telegram.ui.Components.g6 f7059h0;
    public float f7060i0;
    public float f7061j0;
    public float f7062k0;
    public float f7063l0;
    public final org.telegram.ui.Components.g6 m0;
    public final Drawable f7064n;
    public float f7065n0;
    public boolean f7066o0;
    public final org.telegram.ui.Components.g6 f7067p0;
    public final org.telegram.ui.Components.g6 f7068q0;
    public final Paint f7069r;
    public boolean f7070r0;
    public final Paint f7071s;
    public final float[] f7072s0;
    public final org.telegram.ui.Components.g6 f7073t0;
    public boolean f7074u0;
    public final Paint v;
    public long f7075v0;
    public final Paint f7076w;
    public boolean f7077w0;
    public final Paint f7078x;
    public boolean f7079x0;
    public final Paint f7080y;
    public float f7081y0;
    public boolean f7082z0;

    public i7(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f7050b = imageReceiver;
        this.f7069r = new Paint(1);
        Paint paint = new Paint(1);
        this.f7071s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f7076w = paint3;
        Paint paint4 = new Paint(1);
        this.f7078x = paint4;
        Paint paint5 = new Paint(1);
        this.f7080y = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new org.telegram.ui.Components.ad(this);
        this.K = new org.telegram.ui.Components.ad(this);
        this.L = new org.telegram.ui.Components.ad(this);
        es esVar = es.h;
        this.N = new org.telegram.ui.Components.g6(this, 0L, 310L, esVar);
        this.P = new org.telegram.ui.Components.g6(this, 0L, 330L, esVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f7059h0 = new org.telegram.ui.Components.g6(this, 0L, 200L, es.f24465f);
        this.m0 = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.f7065n0 = -1.0f;
        this.f7066o0 = true;
        this.f7067p0 = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.f7068q0 = new org.telegram.ui.Components.g6(this, 0L, 850L, esVar);
        this.f7072s0 = new float[2];
        this.f7073t0 = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.B0 = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
        this.C0 = new org.telegram.ui.Components.g6(this, 0L, 650L, esVar);
        this.D0 = new org.telegram.ui.Components.g6(this, 0L, 160L, es.f24467i);
        this.E0 = new org.telegram.ui.Components.g6(this, 0L, 750L, esVar);
        this.F0 = new org.telegram.ui.Components.g6(this, 0L, 650L, esVar);
        this.G0 = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.I0 = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.J0 = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.K0 = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.L0 = new f7(this, 2);
        this.M0 = new f7(this, 3);
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
        h7 h7Var = new h7(this, this);
        this.W = h7Var;
        r0.i0.j(this, h7Var);
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
        cr crVar = new cr(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f7052c = crVar;
        crVar.f23883w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        crVar.e = dp;
        crVar.f23879f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f7056f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f7064n = mutate6;
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
        if (this.f7070r0) {
            if ((!z10 || f12 - f10 <= AndroidUtilities.dp(100.0f)) && Math.abs(f11 - f7) <= f13) {
                return true;
            }
            return false;
        } else if (v7.f7.a(f7, f10, f11, f12) <= f13) {
            return true;
        } else {
            return false;
        }
    }

    public final void d(float f7) {
        long j10;
        if (f7 > 180.0f) {
            j10 = 620;
        } else {
            j10 = 310;
        }
        this.N.f24887g = j10;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        h7 h7Var = this.W;
        if (h7Var != null && h7Var.f(motionEvent)) {
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
            if (f7 > 0.0f && !this.f7070r0) {
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
        this.f7074u0 = false;
        if (!z10) {
            org.telegram.ui.Components.g6 g6Var = this.f7073t0;
            g6Var.getClass();
            g6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        g7 g7Var = this.f7048a;
        ImageReceiver imageReceiver = this.f7050b;
        if (g7Var != null) {
            g7Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f3984w.f6587b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((k8) arrayList2.get(0)).O0 != null) {
                this.f7050b.setImage(ImageLocation.getForPath(((k8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f7052c, 0L, null, null, 0);
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
            this.f7050b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f7052c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f7050b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f7052c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f7050b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f7052c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f7052c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7050b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f7050b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: di.i7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.f7060i0 = f7 / 2.0f;
        this.f7061j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.f7060i0;
        this.f7062k0 = f10 - min;
        float f11 = f10 + min;
        this.f7063l0 = f11;
        float f12 = this.f7061j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f7063l0;
        float f14 = this.f7061j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f7056f, this.f7062k0, this.f7061j0);
        f(this.h, this.f7062k0, this.f7061j0);
        f(this.f7064n, this.f7062k0, this.f7061j0);
        this.f7050b.setImageCoords(this.f7062k0 - AndroidUtilities.dp(20.0f), this.f7061j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f7060i0, this.f7061j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        h7 h7Var = this.W;
        if (h7Var != null) {
            h7Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f7063l0, this.f7062k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.f7063l0, this.f7061j0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f7074u0;
        org.telegram.ui.Components.ad adVar = this.L;
        org.telegram.ui.Components.ad adVar2 = this.J;
        org.telegram.ui.Components.ad adVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            adVar2.c(false);
            adVar3.c(false);
            adVar.c(false);
        } else if (action == 0 || this.f7077w0) {
            adVar2.c(c(clamp, y3, this.f7060i0, this.f7061j0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y3, this.f7063l0, this.f7061j0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            adVar3.c(z10);
            if (c(clamp, y3, this.f7062k0, this.f7061j0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            adVar.c(z11);
        }
        f7 f7Var = this.M0;
        f7 f7Var2 = this.L0;
        if (action == 0) {
            this.f7077w0 = true;
            if (adVar2.f23201i || adVar3.f23201i) {
                z14 = true;
            }
            this.f7079x0 = z14;
            System.currentTimeMillis();
            this.f7081y0 = clamp;
            if (Math.abs(clamp - this.f7060i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(f7Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (adVar3.f23201i) {
                AndroidUtilities.runOnUIThread(f7Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f7077w0) {
                this.f7081y0 = Utilities.clamp(clamp, this.f7063l0, this.f7062k0);
                invalidate();
                if (this.f7070r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((fb) this.f7048a).b();
                }
                if (this.f7070r0 && this.f7082z0) {
                    float clamp2 = Utilities.clamp(((this.f7061j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    kc kcVar = ((fb) this.f7048a).f6957a;
                    kcVar.V0.b(clamp2, true);
                    kcVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f7077w0) {
                this.f7077w0 = false;
                this.f7079x0 = false;
                AndroidUtilities.cancelRunOnUIThread(f7Var2);
                AndroidUtilities.cancelRunOnUIThread(f7Var);
                boolean z15 = this.f7070r0;
                if (!z15 && adVar.f23201i) {
                    ((fb) this.f7048a).c();
                } else if (z15 && this.f7082z0) {
                    if (adVar.f23201i) {
                        this.f7082z0 = false;
                        this.G0.d(1.0f, true);
                        a4 a4Var = ((fb) this.f7048a).f6957a.T0;
                        a4Var.f6593a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        a4Var.invalidate();
                    } else {
                        this.f7070r0 = false;
                        this.f7075v0 = SystemClock.elapsedRealtime();
                        this.f7074u0 = true;
                        ((fb) this.f7048a).e(false);
                    }
                } else if (adVar2.f23201i) {
                    if (b()) {
                        ((fb) this.f7048a).a();
                    } else if (!this.f7066o0 && !this.f7070r0 && !this.f7082z0) {
                        ((fb) this.f7048a).d();
                    } else if (!this.f7070r0) {
                        if (kc.c(((fb) this.f7048a).f6957a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((fb) this.f7048a).f(new f7(this, 1), false);
                        }
                    } else {
                        this.f7070r0 = false;
                        this.f7075v0 = SystemClock.elapsedRealtime();
                        this.f7074u0 = true;
                        ((fb) this.f7048a).e(false);
                    }
                }
                this.f7082z0 = false;
                if (adVar3.f23201i) {
                    d(180.0f);
                    ((fb) this.f7048a).b();
                }
                adVar2.c(false);
                adVar3.c(false);
                adVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z13;
    }

    public void setDelegate(g7 g7Var) {
        this.f7048a = g7Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f7071s.setColor(i0.a.d(f7, -1, -16777216));
        this.f7076w.setColor(i0.a.d(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.d(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.d(f7, 402653184, 805306368));
        int d = i0.a.d(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f7056f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), mode));
    }
}
