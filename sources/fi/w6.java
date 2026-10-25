package fi;

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
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.xc;
public final class w6 extends View implements p2 {
    public boolean A0;
    public final org.telegram.ui.Components.h6 B0;
    public final org.telegram.ui.Components.h6 C0;
    public final org.telegram.ui.Components.h6 D0;
    public final Paint E;
    public final org.telegram.ui.Components.h6 E0;
    public final Paint F;
    public final org.telegram.ui.Components.h6 F0;
    public final Paint G;
    public final org.telegram.ui.Components.h6 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.h6 I0;
    public final xc J;
    public final org.telegram.ui.Components.h6 J0;
    public final xc K;
    public final org.telegram.ui.Components.h6 K0;
    public final xc L;
    public final t6 L0;
    public float M;
    public final t6 M0;
    public final org.telegram.ui.Components.h6 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.h6 P;
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
    public final v6 W;
    public final PointF W0;
    public boolean X0;
    public u6 f11853a;
    public boolean f11854a0;
    public final ImageReceiver f11855b;
    public boolean f11856b0;
    public final ar f11857c;
    public boolean f11858c0;
    public final Drawable d;
    public boolean f11859d0;
    public final Drawable e;
    public boolean f11860e0;
    public final Drawable f11861f;
    public boolean f11862f0;
    public float f11863g0;
    public final Drawable h;
    public final org.telegram.ui.Components.h6 f11864h0;
    public float f11865i0;
    public float f11866j0;
    public float f11867k0;
    public float f11868l0;
    public final org.telegram.ui.Components.h6 m0;
    public final Drawable f11869n;
    public float f11870n0;
    public boolean f11871o0;
    public final org.telegram.ui.Components.h6 f11872p0;
    public final org.telegram.ui.Components.h6 f11873q0;
    public final Paint f11874r;
    public boolean f11875r0;
    public final Paint f11876s;
    public final float[] f11877s0;
    public final org.telegram.ui.Components.h6 f11878t0;
    public boolean f11879u0;
    public final Paint v;
    public long f11880v0;
    public final Paint f11881w;
    public boolean f11882w0;
    public final Paint f11883x;
    public boolean f11884x0;
    public final Paint f11885y;
    public float f11886y0;
    public boolean f11887z0;

    public w6(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f11855b = imageReceiver;
        this.f11874r = new Paint(1);
        Paint paint = new Paint(1);
        this.f11876s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f11881w = paint3;
        Paint paint4 = new Paint(1);
        this.f11883x = paint4;
        Paint paint5 = new Paint(1);
        this.f11885y = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new xc(this);
        this.K = new xc(this);
        this.L = new xc(this);
        ds dsVar = ds.h;
        this.N = new org.telegram.ui.Components.h6(this, 0L, 310L, dsVar);
        this.P = new org.telegram.ui.Components.h6(this, 0L, 330L, dsVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f11864h0 = new org.telegram.ui.Components.h6(this, 0L, 200L, ds.f27584f);
        this.m0 = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.f11870n0 = -1.0f;
        this.f11871o0 = true;
        this.f11872p0 = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.f11873q0 = new org.telegram.ui.Components.h6(this, 0L, 850L, dsVar);
        this.f11877s0 = new float[2];
        this.f11878t0 = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.B0 = new org.telegram.ui.Components.h6(this, 0L, 350L, dsVar);
        this.C0 = new org.telegram.ui.Components.h6(this, 0L, 650L, dsVar);
        this.D0 = new org.telegram.ui.Components.h6(this, 0L, 160L, ds.f27586i);
        this.E0 = new org.telegram.ui.Components.h6(this, 0L, 750L, dsVar);
        this.F0 = new org.telegram.ui.Components.h6(this, 0L, 650L, dsVar);
        this.G0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.I0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.J0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.K0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.L0 = new t6(this, 2);
        this.M0 = new t6(this, 3);
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
        v6 v6Var = new v6(this, this);
        this.W = v6Var;
        r0.i0.k(this, v6Var);
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
        ar arVar = new ar(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f11857c = arVar;
        arVar.f26597w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        arVar.e = dp;
        arVar.f26593f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f11861f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f11869n = mutate6;
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
        if (this.f11875r0) {
            if ((!z10 || f12 - f10 <= AndroidUtilities.dp(100.0f)) && Math.abs(f11 - f7) <= f13) {
                return true;
            }
            return false;
        } else if (a8.ic.a(f7, f10, f11, f12) <= f13) {
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
        this.N.f28811g = j10;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        v6 v6Var = this.W;
        if (v6Var != null && v6Var.f(motionEvent)) {
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
            if (f7 > 0.0f && !this.f11875r0) {
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
        this.f11879u0 = false;
        if (!z10) {
            org.telegram.ui.Components.h6 h6Var = this.f11878t0;
            h6Var.getClass();
            h6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        u6 u6Var = this.f11853a;
        ImageReceiver imageReceiver = this.f11855b;
        if (u6Var != null) {
            u6Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f8648w.f10498b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((w7) arrayList2.get(0)).O0 != null) {
                this.f11855b.setImage(ImageLocation.getForPath(((w7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f11857c, 0L, null, null, 0);
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
            this.f11855b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f11857c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f11855b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f11857c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f11855b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f11857c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f11857c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11855b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f11855b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: fi.w6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.f11865i0 = f7 / 2.0f;
        this.f11866j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.f11865i0;
        this.f11867k0 = f10 - min;
        float f11 = f10 + min;
        this.f11868l0 = f11;
        float f12 = this.f11866j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f11868l0;
        float f14 = this.f11866j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f11861f, this.f11867k0, this.f11866j0);
        f(this.h, this.f11867k0, this.f11866j0);
        f(this.f11869n, this.f11867k0, this.f11866j0);
        this.f11855b.setImageCoords(this.f11867k0 - AndroidUtilities.dp(20.0f), this.f11866j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f11865i0, this.f11866j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        v6 v6Var = this.W;
        if (v6Var != null) {
            v6Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f11868l0, this.f11867k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.f11868l0, this.f11866j0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f11879u0;
        xc xcVar = this.L;
        xc xcVar2 = this.J;
        xc xcVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            xcVar2.c(false);
            xcVar3.c(false);
            xcVar.c(false);
        } else if (action == 0 || this.f11882w0) {
            xcVar2.c(c(clamp, y3, this.f11865i0, this.f11866j0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y3, this.f11868l0, this.f11866j0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xcVar3.c(z10);
            if (c(clamp, y3, this.f11867k0, this.f11866j0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            xcVar.c(z11);
        }
        t6 t6Var = this.M0;
        t6 t6Var2 = this.L0;
        if (action == 0) {
            this.f11882w0 = true;
            if (xcVar2.f34687i || xcVar3.f34687i) {
                z14 = true;
            }
            this.f11884x0 = z14;
            System.currentTimeMillis();
            this.f11886y0 = clamp;
            if (Math.abs(clamp - this.f11865i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(t6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (xcVar3.f34687i) {
                AndroidUtilities.runOnUIThread(t6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f11882w0) {
                this.f11886y0 = Utilities.clamp(clamp, this.f11868l0, this.f11867k0);
                invalidate();
                if (this.f11875r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((ma) this.f11853a).b();
                }
                if (this.f11875r0 && this.f11887z0) {
                    float clamp2 = Utilities.clamp(((this.f11866j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    sb sbVar = ((ma) this.f11853a).f11270a;
                    sbVar.V0.b(clamp2, true);
                    sbVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f11882w0) {
                this.f11882w0 = false;
                this.f11884x0 = false;
                AndroidUtilities.cancelRunOnUIThread(t6Var2);
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                boolean z15 = this.f11875r0;
                if (!z15 && xcVar.f34687i) {
                    ((ma) this.f11853a).c();
                } else if (z15 && this.f11887z0) {
                    if (xcVar.f34687i) {
                        this.f11887z0 = false;
                        this.G0.d(1.0f, true);
                        t3 t3Var = ((ma) this.f11853a).f11270a.T0;
                        t3Var.f11704a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        t3Var.invalidate();
                    } else {
                        this.f11875r0 = false;
                        this.f11880v0 = SystemClock.elapsedRealtime();
                        this.f11879u0 = true;
                        ((ma) this.f11853a).e(false);
                    }
                } else if (xcVar2.f34687i) {
                    if (b()) {
                        ((ma) this.f11853a).a();
                    } else if (!this.f11871o0 && !this.f11875r0 && !this.f11887z0) {
                        ((ma) this.f11853a).d();
                    } else if (!this.f11875r0) {
                        if (sb.c(((ma) this.f11853a).f11270a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((ma) this.f11853a).f(new t6(this, 1), false);
                        }
                    } else {
                        this.f11875r0 = false;
                        this.f11880v0 = SystemClock.elapsedRealtime();
                        this.f11879u0 = true;
                        ((ma) this.f11853a).e(false);
                    }
                }
                this.f11887z0 = false;
                if (xcVar3.f34687i) {
                    d(180.0f);
                    ((ma) this.f11853a).b();
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

    public void setDelegate(u6 u6Var) {
        this.f11853a = u6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f11876s.setColor(i0.a.f(f7, -1, -16777216));
        this.f11881w.setColor(i0.a.f(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.f(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.f(f7, 402653184, 805306368));
        int f10 = i0.a.f(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f10, mode));
        this.f11861f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f7, -1, -16777216), mode));
    }
}
