package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class yic implements VoIPService.StateListener, jm7 {
    public static boolean T = false;
    public static yic U;
    public static yic V;
    public static int W;
    public final int F;
    public final int G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public boolean L;
    public long M;
    public int N;
    public AnimatorSet P;
    public final qw9 a;
    public final xic b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public final int f;
    public final int h;
    public final View n;
    public final akc r;
    public final akc s;
    public float w;
    public ValueAnimator x;
    public final oxb y = new oxb(this, (byte) 10);
    public final float[] E = new float[2];
    public final sw O = new sw((byte) 13);
    public final vic Q = new vic(this, (byte) 0);
    public final vic R = new vic(this, (byte) 1);
    public final wic S = new Object();

    public yic(Context context, int i, int i2, boolean z) {
        this.f = i;
        this.h = i2;
        float f = i2 * 0.4f;
        int i3 = ((int) ((f * 1.05f) - f)) / 2;
        this.G = i3;
        float f2 = i * 0.4f;
        int i4 = ((int) ((1.05f * f2) - f2)) / 2;
        this.F = i4;
        qw9 qw9Var = new qw9(this, context, context.getDrawable(2131230924));
        this.a = qw9Var;
        qw9Var.setWillNotDraw(false);
        qw9Var.setPadding(i4, i3, i4, i3);
        xic xicVar = new xic(this, context);
        this.b = xicVar;
        akc akcVar = new akc(context, false, true);
        this.s = akcVar;
        akcVar.b0 = (byte) 3;
        akc akcVar2 = new akc(context, false, true);
        this.r = akcVar2;
        akcVar2.d.setMirror(true);
        xicVar.addView(akcVar);
        xicVar.addView(akcVar2);
        xicVar.setBackgroundColor(-7829368);
        qw9Var.addView(xicVar);
        qw9Var.setClipChildren(false);
        qw9Var.setClipToPadding(false);
        if (z) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{on2.p(-16777216, 76), 0}));
            xicVar.addView(view, -1, gm.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232559);
            imageView.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            imageView.setContentDescription(jb6.M0(2131751978, null));
            xicVar.addView(imageView, qoe.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232560);
            imageView2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            imageView2.setContentDescription(jb6.M0(2131747550, null));
            xicVar.addView(imageView2, qoe.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new x10((byte) 17));
            imageView2.setOnClickListener(new fyb(this, context, (byte) 13));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        yic yicVar = U;
        if (yicVar != null && V == null && !T && yicVar.a.getParent() != null && Settings.canDrawOverlays(launchActivity) != yicVar.e) {
            int i = yicVar.N;
            int i2 = yicVar.f;
            int i3 = yicVar.h;
            b();
            f(launchActivity, i, i2, i3, 0);
        }
    }

    public static void b() {
        if (T) {
            return;
        }
        yic yicVar = V;
        if (yicVar != null) {
            yicVar.c();
        }
        yic yicVar2 = U;
        if (yicVar2 != null) {
            yicVar2.c();
        }
        V = null;
        U = null;
        zic.b();
    }

    public static yic d() {
        yic yicVar = V;
        if (yicVar != null) {
            return yicVar;
        }
        return U;
    }

    public static void f(Activity activity, int i, int i2, int i3, int i4) {
        WindowManager windowManager;
        if (U == null && VideoCapturerDevice.eglBase != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            float f = i3;
            float f2 = f * 0.4f;
            float f3 = i2;
            float f4 = 0.4f * f3;
            layoutParams.height = (int) ((f * 0.25f) + ((((int) ((f2 * 1.05f) - f2)) / 2) << 1));
            layoutParams.width = (int) ((f3 * 0.25f) + ((((int) ((1.05f * f4) - f4)) / 2) << 1));
            layoutParams.gravity = 51;
            layoutParams.format = -3;
            if (Settings.canDrawOverlays(activity)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    layoutParams.type = 2038;
                } else {
                    layoutParams.type = 2003;
                }
            } else {
                layoutParams.type = 2;
            }
            layoutParams.flags = 16778120;
            yic yicVar = new yic(activity, i2, i3, false);
            U = yicVar;
            yicVar.e = Settings.canDrawOverlays(activity);
            if (U.e) {
                windowManager = (WindowManager) a.b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            yic yicVar2 = U;
            yicVar2.N = i;
            yicVar2.c = windowManager;
            yicVar2.d = layoutParams;
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("voippipconfig", 0);
            float f5 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f6 = sharedPreferences.getFloat("relativeY", 0.0f);
            yic yicVar3 = U;
            yicVar3.getClass();
            Point point = gm.q;
            float f7 = point.x;
            float f8 = point.y;
            float L = gm.L(16.0f);
            float L2 = gm.L(16.0f);
            float L3 = gm.L(60.0f);
            float L4 = gm.L(16.0f);
            float f9 = yicVar3.f * 0.25f;
            float f10 = yicVar3.h * 0.25f;
            xic xicVar = yicVar3.b;
            if (xicVar.getMeasuredWidth() != 0) {
                f9 = xicVar.getMeasuredWidth();
            }
            if (xicVar.getMeasuredWidth() != 0) {
                f10 = xicVar.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = yicVar3.d;
            layoutParams2.x = (int) (((((f7 - L) - L2) - f9) * f5) - (yicVar3.F - L));
            layoutParams2.y = (int) (((((f8 - L3) - L4) - f10) * f6) - (yicVar3.G - L3));
            gm.N3(yicVar3.c, yicVar3.a, layoutParams2);
            nm7.e().a(U, nm7.D2);
            windowManager.addView(U.a, layoutParams);
            U.r.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            U.s.d.init(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
            if (i4 == 0) {
                U.a.setScaleX(0.5f);
                U.a.setScaleY(0.5f);
                U.a.setAlpha(0.0f);
                U.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    yic yicVar4 = U;
                    sharedInstance.setSinks(yicVar4.r.d, yicVar4.s.d);
                }
            } else if (i4 == 1) {
                U.a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    yic yicVar5 = U;
                    sharedInstance2.setBackgroundSinks(yicVar5.r.d, yicVar5.s.d);
                }
            }
            zic.b();
        }
    }

    public final void c() {
        this.r.d.release();
        this.s.d.release();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            xic xicVar = this.b;
            float[] fArr = this.E;
            int i = xic.h;
            xicVar.getClass();
            Point point = gm.q;
            yic yicVar = xicVar.f;
            int i2 = yicVar.d.x;
            xic xicVar2 = yicVar.b;
            float left = xicVar2.getLeft() + i2;
            float f = xicVar.b;
            fArr[0] = (left - f) / (((point.x - f) - xicVar.c) - xicVar2.getMeasuredWidth());
            float top = xicVar2.getTop() + yicVar.d.y;
            float f2 = xicVar.d;
            fArr[1] = (top - f2) / (((point.y - f2) - xicVar.e) - xicVar2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            a.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        nm7.e().n(this, nm7.D2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.D2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (!this.e && !zse.a(a.b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.H) {
            sharedInstance.setVideoState(false, 1);
        }
    }

    public final void g() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.b.getMeasuredWidth() != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = this.I;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        float f = 1.0f;
        if (sharedInstance != null) {
            if (sharedInstance.getRemoteVideoState() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.I = z2;
            if (sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.H = z3;
            akc akcVar = this.r;
            akcVar.d.setMirror(sharedInstance.isFrontFaceCamera());
            akcVar.setIsScreencast(sharedInstance.isScreencast());
            akcVar.d(false, 1.0f);
        }
        boolean z5 = this.I;
        if (!z) {
            if (!z5) {
                f = 0.0f;
            }
            this.w = f;
        } else if (z4 != z5) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = this.w;
            if (!this.I) {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.x = ofFloat;
            ofFloat.addUpdateListener(this.y);
            this.x.setDuration(300L).setInterpolator(d53.f);
            this.x.start();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        g();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        zic.b();
        g();
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (!z) {
                if (this.H) {
                    sharedInstance.setVideoState(false, 1);
                }
            } else if (sharedInstance.getVideoState(false) == 1) {
                sharedInstance.setVideoState(false, 2);
            }
        }
    }

    @Override
    public final void onStateChanged(int i) {
        if (i == 11 || i == 17 || i == 4 || i == 10) {
            gm.d3(new e1b((byte) 7), 200L);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            b();
        } else if (i == 3 && !sharedInstance.isVideoAvailable()) {
            b();
        } else {
            g();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }
}
