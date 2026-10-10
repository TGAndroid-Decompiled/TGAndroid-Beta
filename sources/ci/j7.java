package ci;

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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.is;
public final class j7 extends View implements v2 {
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
    public final org.telegram.ui.Components.bd J;
    public final org.telegram.ui.Components.g6 J0;
    public final org.telegram.ui.Components.bd K;
    public final org.telegram.ui.Components.g6 K0;
    public final org.telegram.ui.Components.bd L;
    public final g7 L0;
    public float M;
    public final g7 M0;
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
    public final i7 W;
    public final PointF W0;
    public boolean X0;
    public h7 f5250a;
    public boolean f5251a0;
    public final ImageReceiver f5252b;
    public boolean f5253b0;
    public final fr f5254c;
    public boolean f5255c0;
    public final Drawable d;
    public boolean f5256d0;
    public final Drawable f5257e;
    public boolean f5258e0;
    public final Drawable f5259f;
    public boolean f5260f0;
    public float f5261g0;
    public final Drawable h;
    public final org.telegram.ui.Components.g6 f5262h0;
    public float f5263i0;
    public float f5264j0;
    public float f5265k0;
    public float f5266l0;
    public final org.telegram.ui.Components.g6 m0;
    public final Drawable f5267n;
    public float f5268n0;
    public boolean f5269o0;
    public final org.telegram.ui.Components.g6 f5270p0;
    public final org.telegram.ui.Components.g6 f5271q0;
    public final Paint f5272r;
    public boolean f5273r0;
    public final Paint f5274s;
    public final float[] f5275s0;
    public final org.telegram.ui.Components.g6 f5276t0;
    public boolean f5277u0;
    public final Paint v;
    public long f5278v0;
    public final Paint f5279w;
    public boolean f5280w0;
    public final Paint f5281x;
    public boolean f5282x0;
    public final Paint f5283y;
    public float f5284y0;
    public boolean f5285z0;

    public j7(Activity activity) {
        super(activity);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f5252b = imageReceiver;
        this.f5272r = new Paint(1);
        Paint paint = new Paint(1);
        this.f5274s = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        Paint paint3 = new Paint(1);
        this.f5279w = paint3;
        Paint paint4 = new Paint(1);
        this.f5281x = paint4;
        Paint paint5 = new Paint(1);
        this.f5283y = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new org.telegram.ui.Components.bd(this);
        this.K = new org.telegram.ui.Components.bd(this);
        this.L = new org.telegram.ui.Components.bd(this);
        is isVar = is.h;
        this.N = new org.telegram.ui.Components.g6(this, 0L, 310L, isVar);
        this.P = new org.telegram.ui.Components.g6(this, 0L, 330L, isVar);
        this.S = new Path();
        this.T = new PointF(-AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(2.3333333f));
        this.U = new PointF(-AndroidUtilities.dpf2(2.8333333f), AndroidUtilities.dpf2(8.666667f));
        this.V = new PointF(AndroidUtilities.dpf2(9.666667f), AndroidUtilities.dpf2(-3.6666667f));
        this.f5262h0 = new org.telegram.ui.Components.g6(this, 0L, 200L, is.f27443f);
        this.m0 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.f5268n0 = -1.0f;
        this.f5269o0 = true;
        this.f5270p0 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.f5271q0 = new org.telegram.ui.Components.g6(this, 0L, 850L, isVar);
        this.f5275s0 = new float[2];
        this.f5276t0 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.B0 = new org.telegram.ui.Components.g6(this, 0L, 350L, isVar);
        this.C0 = new org.telegram.ui.Components.g6(this, 0L, 650L, isVar);
        this.D0 = new org.telegram.ui.Components.g6(this, 0L, 160L, is.f27445i);
        this.E0 = new org.telegram.ui.Components.g6(this, 0L, 750L, isVar);
        this.F0 = new org.telegram.ui.Components.g6(this, 0L, 650L, isVar);
        this.G0 = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.I0 = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.J0 = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.K0 = new org.telegram.ui.Components.g6(this, 0L, 320L, isVar);
        this.L0 = new g7(this, 2);
        this.M0 = new g7(this, 3);
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
        i7 i7Var = new i7(this, this);
        this.W = i7Var;
        r0.i0.j(this, i7Var);
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
        fr frVar = new fr(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(6.0f), -13750737), mutate);
        this.f5254c = frVar;
        frVar.f26503w = false;
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        frVar.f26498e = dp;
        frVar.f26499f = dp2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.f5257e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f5259f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.f5267n = mutate6;
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
        if (this.f5273r0) {
            if ((!z10 || f12 - f10 <= AndroidUtilities.dp(100.0f)) && Math.abs(f11 - f7) <= f13) {
                return true;
            }
            return false;
        } else if (v7.z6.a(f7, f10, f11, f12) <= f13) {
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
        this.N.f26619g = j3;
        this.M += f7;
        invalidate();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        i7 i7Var = this.W;
        if (i7Var != null && i7Var.f(motionEvent)) {
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
            if (f7 > 0.0f && !this.f5273r0) {
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
        this.f5277u0 = false;
        if (!z10) {
            org.telegram.ui.Components.g6 g6Var = this.f5276t0;
            g6Var.getClass();
            g6Var.d(0.0f, true);
        }
        invalidate();
    }

    public final void h() {
        MediaController.PhotoEntry photoEntry;
        String str;
        ArrayList<MediaController.PhotoEntry> arrayList;
        h7 h7Var = this.f5250a;
        ImageReceiver imageReceiver = this.f5252b;
        if (h7Var != null) {
            h7Var.getClass();
            ArrayList arrayList2 = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getStoriesController().f1425w.f4712b;
            imageReceiver.setOrientation(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((l8) arrayList2.get(0)).O0 != null) {
                this.f5252b.setImage(ImageLocation.getForPath(((l8) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, this.f5254c, 0L, null, null, 0);
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
            this.f5252b.setImage(ImageLocation.getForPath(str), "80_80", null, null, this.f5254c, 0L, null, null, 0);
        } else if (photoEntry != null && photoEntry.path != null) {
            if (photoEntry.isVideo) {
                this.f5252b.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f5254c, 0L, null, null, 0);
                return;
            }
            imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
            this.f5252b.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), "80_80", null, null, this.f5254c, 0L, null, null, 0);
        } else {
            imageReceiver.setImageBitmap(this.f5254c);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5252b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f5252b.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: ci.j7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(100.0f);
        float f7 = size;
        this.f5263i0 = f7 / 2.0f;
        this.f5264j0 = dp / 2.0f;
        float min = Math.min(AndroidUtilities.dp(135.0f), f7 * 0.35f);
        float f10 = this.f5263i0;
        this.f5265k0 = f10 - min;
        float f11 = f10 + min;
        this.f5266l0 = f11;
        float f12 = this.f5264j0;
        float dp2 = AndroidUtilities.dp(14.0f);
        this.d.setBounds((int) (f11 - dp2), (int) (f12 - dp2), (int) (f11 + dp2), (int) (f12 + dp2));
        float f13 = this.f5266l0;
        float f14 = this.f5264j0;
        float dp3 = AndroidUtilities.dp(14.0f);
        this.f5257e.setBounds((int) (f13 - dp3), (int) (f14 - dp3), (int) (f13 + dp3), (int) (f14 + dp3));
        f(this.f5259f, this.f5265k0, this.f5264j0);
        f(this.h, this.f5265k0, this.f5264j0);
        f(this.f5267n, this.f5265k0, this.f5264j0);
        this.f5252b.setImageCoords(this.f5265k0 - AndroidUtilities.dp(20.0f), this.f5264j0 - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.f5263i0, this.f5264j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, dp);
        i7 i7Var = this.W;
        if (i7Var != null) {
            i7Var.i();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int action = motionEvent.getAction();
        float clamp = Utilities.clamp(motionEvent.getX() + 0.0f, this.f5266l0, this.f5265k0);
        float y3 = motionEvent.getY() + 0.0f;
        boolean c10 = c(clamp, y3, this.f5266l0, this.f5264j0, AndroidUtilities.dp(7.0f), true);
        boolean z12 = this.f5277u0;
        org.telegram.ui.Components.bd bdVar = this.L;
        org.telegram.ui.Components.bd bdVar2 = this.J;
        org.telegram.ui.Components.bd bdVar3 = this.K;
        boolean z13 = true;
        boolean z14 = false;
        if (z12) {
            bdVar2.c(false);
            bdVar3.c(false);
            bdVar.c(false);
        } else if (action == 0 || this.f5280w0) {
            bdVar2.c(c(clamp, y3, this.f5263i0, this.f5264j0, AndroidUtilities.dp(60.0f), false));
            if (c(clamp, y3, this.f5266l0, this.f5264j0, AndroidUtilities.dp(30.0f), true) && !b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bdVar3.c(z10);
            if (c(clamp, y3, this.f5265k0, this.f5264j0, AndroidUtilities.dp(30.0f), false) && !b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            bdVar.c(z11);
        }
        g7 g7Var = this.M0;
        g7 g7Var2 = this.L0;
        if (action == 0) {
            this.f5280w0 = true;
            if (bdVar2.f24928i || bdVar3.f24928i) {
                z14 = true;
            }
            this.f5282x0 = z14;
            System.currentTimeMillis();
            this.f5284y0 = clamp;
            if (Math.abs(clamp - this.f5263i0) < AndroidUtilities.dp(50.0f)) {
                AndroidUtilities.runOnUIThread(g7Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (bdVar3.f24928i) {
                AndroidUtilities.runOnUIThread(g7Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (action == 2) {
            if (this.f5280w0) {
                this.f5284y0 = Utilities.clamp(clamp, this.f5266l0, this.f5265k0);
                invalidate();
                if (this.f5273r0 && !this.X0 && c10) {
                    d(180.0f);
                    ((gb) this.f5250a).b();
                }
                if (this.f5273r0 && this.f5285z0) {
                    float clamp2 = Utilities.clamp(((this.f5264j0 - AndroidUtilities.dp(48.0f)) - y3) / (AndroidUtilities.displaySize.y / 2.0f), 1.0f, 0.0f);
                    lc lcVar = ((gb) this.f5250a).f5132a;
                    lcVar.V0.b(clamp2, true);
                    lcVar.i0(false);
                }
            }
            return false;
        } else if (action != 1 && action != 3) {
            z13 = false;
        } else {
            if (this.f5280w0) {
                this.f5280w0 = false;
                this.f5282x0 = false;
                AndroidUtilities.cancelRunOnUIThread(g7Var2);
                AndroidUtilities.cancelRunOnUIThread(g7Var);
                boolean z15 = this.f5273r0;
                if (!z15 && bdVar.f24928i) {
                    ((gb) this.f5250a).c();
                } else if (z15 && this.f5285z0) {
                    if (bdVar.f24928i) {
                        this.f5285z0 = false;
                        this.G0.d(1.0f, true);
                        a4 a4Var = ((gb) this.f5250a).f5132a.T0;
                        a4Var.f4719a.t(LocaleController.getString(R.string.StoryHintPinchToZoom), true, true);
                        a4Var.invalidate();
                    } else {
                        this.f5273r0 = false;
                        this.f5278v0 = SystemClock.elapsedRealtime();
                        this.f5277u0 = true;
                        ((gb) this.f5250a).e(false);
                    }
                } else if (bdVar2.f24928i) {
                    if (b()) {
                        ((gb) this.f5250a).a();
                    } else if (!this.f5269o0 && !this.f5273r0 && !this.f5285z0) {
                        ((gb) this.f5250a).d();
                    } else if (!this.f5273r0) {
                        if (lc.c(((gb) this.f5250a).f5132a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((gb) this.f5250a).f(new g7(this, 1), false);
                        }
                    } else {
                        this.f5273r0 = false;
                        this.f5278v0 = SystemClock.elapsedRealtime();
                        this.f5277u0 = true;
                        ((gb) this.f5250a).e(false);
                    }
                }
                this.f5285z0 = false;
                if (bdVar3.f24928i) {
                    d(180.0f);
                    ((gb) this.f5250a).b();
                }
                bdVar2.c(false);
                bdVar3.c(false);
                bdVar.c(false);
                invalidate();
            }
            return false;
        }
        this.X0 = c10;
        return z13;
    }

    public void setDelegate(h7 h7Var) {
        this.f5250a = h7Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.O) {
            this.O = z10;
            invalidate();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f5274s.setColor(i0.a.d(f7, -1, -16777216));
        this.f5279w.setColor(i0.a.d(f7, 1677721600, 369098752));
        this.E.setColor(i0.a.d(f7, 1493172223, 285212671));
        this.F.setColor(i0.a.d(f7, 402653184, 805306368));
        int d = i0.a.d(f7, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(d, mode));
        this.f5259f.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), mode));
    }
}
