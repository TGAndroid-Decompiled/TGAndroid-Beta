package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zq;
public final class z6 extends View implements r2 {
    public boolean A0;
    public final org.telegram.ui.Components.f6 B0;
    public final org.telegram.ui.Components.f6 C0;
    public final org.telegram.ui.Components.f6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.f6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.f6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.f6 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.f6 I0;
    public final yc J;
    public final org.telegram.ui.Components.f6 J0;
    public final yc K;
    public final org.telegram.ui.Components.f6 K0;
    public final yc L;
    public final w6 L0;
    public float M;
    public final w6 M0;
    public final org.telegram.ui.Components.f6 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.f6 P;
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
    public final y6 W;
    public final PointF W0;
    public boolean X0;
    public x6 f10205a;
    public boolean f10206a0;
    public final ImageReceiver f10207b;
    public boolean f10208b0;
    public final zq f10209c;
    public boolean f10210c0;
    public final Drawable d;
    public boolean f10211d0;
    public final Drawable e;
    public boolean f10212e0;
    public final Drawable f10213f;
    public boolean f10214f0;
    public float f10215g0;
    public final Drawable h;
    public final org.telegram.ui.Components.f6 f10216h0;
    public float f10217i0;
    public float f10218j0;
    public float f10219k0;
    public float f10220l0;
    public final org.telegram.ui.Components.f6 m0;
    public final Drawable f10221n;
    public float f10222n0;
    public boolean f10223o0;
    public final org.telegram.ui.Components.f6 f10224p0;
    public final org.telegram.ui.Components.f6 f10225q0;
    public final Paint f10226r;
    public boolean f10227r0;
    public final Paint f10228s;
    public final float[] f10229s0;
    public final org.telegram.ui.Components.f6 f10230t0;
    public boolean f10231u0;
    public final Paint v;
    public long f10232v0;
    public final Paint f10233w;
    public boolean f10234w0;
    public final Paint f10235x;
    public boolean f10236x0;
    public final Paint f10237y;
    public float f10238y0;
    public boolean f10239z0;

    public z6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f10207b = imageReceiver;
        this.f10226r = new Paint(1);
        Paint paint = new Paint(1);
        this.f10228s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f10233w = paint3;
        Paint paint4 = new Paint(1);
        this.f10235x = paint4;
        Paint paint5 = new Paint(1);
        this.f10237y = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new yc(this);
        this.K = new yc(this);
        this.L = new yc(this);
        bs bsVar = bs.h;
        this.N = new org.telegram.ui.Components.f6(this, 0L, 310L, bsVar);
        this.P = new org.telegram.ui.Components.f6(this, 0L, 330L, bsVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f10216h0 = new org.telegram.ui.Components.f6(this, 0L, 200L, bs.f25012f);
        this.m0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.f10222n0 = -1.0f;
        this.f10223o0 = true;
        this.f10224p0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.f10225q0 = new org.telegram.ui.Components.f6(this, 0L, 850L, bsVar);
        this.f10229s0 = new float[2];
        this.f10230t0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.B0 = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.C0 = new org.telegram.ui.Components.f6(this, 0L, 650L, bsVar);
        this.D0 = new org.telegram.ui.Components.f6(this, 0L, 160L, bs.f25014i);
        this.E0 = new org.telegram.ui.Components.f6(this, 0L, 750L, bsVar);
        this.F0 = new org.telegram.ui.Components.f6(this, 0L, 650L, bsVar);
        this.G0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.I0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.J0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.K0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.L0 = new w6(this, 2);
        this.M0 = new w6(this, 3);
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
        y6 y6Var = new y6(this, this);
        this.W = y6Var;
        r0.i0.j(this, y6Var);
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
        zq zqVar = new zq(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f10209c = zqVar;
        zqVar.f33023w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        zqVar.e = dp;
        zqVar.f33019f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f10213f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f10221n = mutate6;
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
        if (this.f10227r0) {
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
        this.N.f26110g = j10;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        y6 y6Var = this.W;
        if (y6Var != null && y6Var.f(motionEvent)) {
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
            if (f7 > 0.0f && !this.f10227r0) {
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
        this.f10231u0 = false;
        if (!z10) {
            org.telegram.ui.Components.f6 f6Var = this.f10230t0;
            f6Var.getClass();
            f6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        x6 x6Var = this.f10205a;
        ImageReceiver imageReceiver = this.f10207b;
        if (x6Var != null) {
            x6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f5509w.f8673b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((a8) arrayList2.get(0)).O0 != null) {
                this.f10207b.setImage(ImageLocation.getForPath(((a8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f10209c, 0L, null, null, 0);
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
            this.f10207b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f10209c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f10207b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f10209c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f10207b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f10209c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f10209c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10207b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f10207b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: ei.z6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.f10217i0 = f7 / 2.0f;
        this.f10218j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.f10217i0;
        this.f10219k0 = f10 - min;
        float f11 = f10 + min;
        this.f10220l0 = f11;
        float f12 = this.f10218j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f10220l0;
        float f14 = this.f10218j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f10213f, this.f10219k0, this.f10218j0);
        f(this.h, this.f10219k0, this.f10218j0);
        f(this.f10221n, this.f10219k0, this.f10218j0);
        this.f10207b.setImageCoords(this.f10219k0 - AndroidUtilities.dp(20.0f), this.f10218j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f10217i0, this.f10218j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        y6 y6Var = this.W;
        if (y6Var != null) {
            y6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f10220l0, this.f10219k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.f10220l0, this.f10218j0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f10231u0;
        yc ycVar = this.L;
        yc ycVar2 = this.J;
        yc ycVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            ycVar2.c(false);
            ycVar3.c(false);
            ycVar.c(false);
        } else if (action == 0 || this.f10234w0) {
            ycVar2.c(c(clamp, y3, this.f10217i0, this.f10218j0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y3, this.f10220l0, this.f10218j0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ycVar3.c(z10);
            if (c(clamp, y3, this.f10219k0, this.f10218j0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            ycVar.c(z11);
        }
        w6 w6Var = this.M0;
        w6 w6Var2 = this.L0;
        if (action == 0) {
            this.f10234w0 = true;
            if (ycVar2.f32598i || ycVar3.f32598i) {
                z14 = true;
            }
            this.f10236x0 = z14;
            System.currentTimeMillis();
            this.f10238y0 = clamp;
            if (Math.abs(clamp - this.f10217i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(w6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (ycVar3.f32598i) {
                AndroidUtilities.runOnUIThread(w6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f10234w0) {
                this.f10238y0 = Utilities.clamp(clamp, this.f10220l0, this.f10219k0);
                invalidate();
                if (this.f10227r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((qa) this.f10205a).b();
                }
                if (this.f10227r0 && this.f10239z0) {
                    float clamp2 = Utilities.clamp(((this.f10218j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    vb vbVar = ((qa) this.f10205a).f9662a;
                    vbVar.V0.b(clamp2, true);
                    vbVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f10234w0) {
                this.f10234w0 = false;
                this.f10236x0 = false;
                AndroidUtilities.cancelRunOnUIThread(w6Var2);
                AndroidUtilities.cancelRunOnUIThread(w6Var);
                boolean z15 = this.f10227r0;
                if (!z15 && ycVar.f32598i) {
                    ((qa) this.f10205a).c();
                } else if (z15 && this.f10239z0) {
                    if (ycVar.f32598i) {
                        this.f10239z0 = false;
                        this.G0.d(1.0f, true);
                        v3 v3Var = ((qa) this.f10205a).f9662a.T0;
                        v3Var.f9932a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        v3Var.invalidate();
                    } else {
                        this.f10227r0 = false;
                        this.f10232v0 = SystemClock.elapsedRealtime();
                        this.f10231u0 = true;
                        ((qa) this.f10205a).e(false);
                    }
                } else if (ycVar2.f32598i) {
                    if (b()) {
                        ((qa) this.f10205a).a();
                    } else if (!this.f10223o0 && !this.f10227r0 && !this.f10239z0) {
                        ((qa) this.f10205a).d();
                    } else if (!this.f10227r0) {
                        if (vb.c(((qa) this.f10205a).f9662a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((qa) this.f10205a).f(new w6(this, 1), false);
                        }
                    } else {
                        this.f10227r0 = false;
                        this.f10232v0 = SystemClock.elapsedRealtime();
                        this.f10231u0 = true;
                        ((qa) this.f10205a).e(false);
                    }
                }
                this.f10239z0 = false;
                if (ycVar3.f32598i) {
                    d(180.0f);
                    ((qa) this.f10205a).b();
                }
                ycVar2.c(false);
                ycVar3.c(false);
                ycVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z13;
    }

    public void setDelegate(x6 x6Var) {
        this.f10205a = x6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f10228s.setColor(i0.a.f(f7, -1, -16777216));
        this.f10233w.setColor(i0.a.f(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.f(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.f(f7, 402653184, 805306368));
        int f10 = i0.a.f(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f10, mode));
        this.f10213f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f7, -1, -16777216), mode));
    }
}
