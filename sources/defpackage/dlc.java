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
public final class dlc implements VoIPService.StateListener, fn7 {
    public static boolean T = false;
    public static dlc U;
    public static dlc V;
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
    public final iy9 a;
    public final clc b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public final int f;
    public final int h;
    public final View n;
    public final hmc r;
    public final hmc s;
    public float w;
    public ValueAnimator x;
    public final pzb y = new pzb(this, (byte) 10);
    public final float[] E = new float[2];
    public final tv O = new tv((byte) 13);
    public final alc Q = new alc(this, (byte) 0);
    public final alc R = new alc(this, (byte) 1);
    public final blc S = new Object();

    public dlc(Context context, int i, int i2, boolean z) {
        this.f = i;
        this.h = i2;
        float f = i2 * 0.4f;
        int i3 = ((int) ((f * 1.05f) - f)) / 2;
        this.G = i3;
        float f2 = i * 0.4f;
        int i4 = ((int) ((1.05f * f2) - f2)) / 2;
        this.F = i4;
        iy9 iy9Var = new iy9(this, context, context.getDrawable(2131230923));
        this.a = iy9Var;
        iy9Var.setWillNotDraw(false);
        iy9Var.setPadding(i4, i3, i4, i3);
        clc clcVar = new clc(this, context);
        this.b = clcVar;
        hmc hmcVar = new hmc(context, false, true);
        this.s = hmcVar;
        hmcVar.b0 = (byte) 3;
        hmc hmcVar2 = new hmc(context, false, true);
        this.r = hmcVar2;
        hmcVar2.d.setMirror(true);
        clcVar.addView(hmcVar);
        clcVar.addView(hmcVar2);
        clcVar.setBackgroundColor(-7829368);
        iy9Var.addView(clcVar);
        iy9Var.setClipChildren(false);
        iy9Var.setClipToPadding(false);
        if (z) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{vm2.o(-16777216, 76), 0}));
            clcVar.addView(view, -1, hl.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232558);
            imageView.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            imageView.setContentDescription(ob6.M0(2131752006, null));
            clcVar.addView(imageView, tre.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232559);
            imageView2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            imageView2.setContentDescription(ob6.M0(2131747544, null));
            clcVar.addView(imageView2, tre.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new y00((byte) 17));
            imageView2.setOnClickListener(new jjb(this, context, (byte) 15));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        dlc dlcVar = U;
        if (dlcVar != null && V == null && !T && dlcVar.a.getParent() != null && Settings.canDrawOverlays(launchActivity) != dlcVar.e) {
            int i = dlcVar.N;
            int i2 = dlcVar.f;
            int i3 = dlcVar.h;
            b();
            f(launchActivity, i, i2, i3, 0);
        }
    }

    public static void b() {
        if (T) {
            return;
        }
        dlc dlcVar = V;
        if (dlcVar != null) {
            dlcVar.c();
        }
        dlc dlcVar2 = U;
        if (dlcVar2 != null) {
            dlcVar2.c();
        }
        V = null;
        U = null;
        elc.c();
    }

    public static dlc d() {
        dlc dlcVar = V;
        if (dlcVar != null) {
            return dlcVar;
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
            dlc dlcVar = new dlc(activity, i2, i3, false);
            U = dlcVar;
            dlcVar.e = Settings.canDrawOverlays(activity);
            if (U.e) {
                windowManager = (WindowManager) a.b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            dlc dlcVar2 = U;
            dlcVar2.N = i;
            dlcVar2.c = windowManager;
            dlcVar2.d = layoutParams;
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("voippipconfig", 0);
            float f5 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f6 = sharedPreferences.getFloat("relativeY", 0.0f);
            dlc dlcVar3 = U;
            dlcVar3.getClass();
            Point point = hl.q;
            float f7 = point.x;
            float f8 = point.y;
            float L = hl.L(16.0f);
            float L2 = hl.L(16.0f);
            float L3 = hl.L(60.0f);
            float L4 = hl.L(16.0f);
            float f9 = dlcVar3.f * 0.25f;
            float f10 = dlcVar3.h * 0.25f;
            clc clcVar = dlcVar3.b;
            if (clcVar.getMeasuredWidth() != 0) {
                f9 = clcVar.getMeasuredWidth();
            }
            if (clcVar.getMeasuredWidth() != 0) {
                f10 = clcVar.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = dlcVar3.d;
            layoutParams2.x = (int) (((((f7 - L) - L2) - f9) * f5) - (dlcVar3.F - L));
            layoutParams2.y = (int) (((((f8 - L3) - L4) - f10) * f6) - (dlcVar3.G - L3));
            hl.N3(dlcVar3.c, dlcVar3.a, layoutParams2);
            jn7.e().a(U, jn7.D2);
            windowManager.addView(U.a, layoutParams);
            U.r.d.b(VideoCapturerDevice.eglBase.getEglBaseContext(), null);
            U.s.d.b(VideoCapturerDevice.eglBase.getEglBaseContext(), U.S);
            if (i4 == 0) {
                U.a.setScaleX(0.5f);
                U.a.setScaleY(0.5f);
                U.a.setAlpha(0.0f);
                U.a.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).start();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    dlc dlcVar4 = U;
                    sharedInstance.setSinks(dlcVar4.r.d, dlcVar4.s.d);
                }
            } else if (i4 == 1) {
                U.a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    dlc dlcVar5 = U;
                    sharedInstance2.setBackgroundSinks(dlcVar5.r.d, dlcVar5.s.d);
                }
            }
            elc.c();
        }
    }

    public final void c() {
        this.r.d.e();
        this.s.d.e();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        this.a.setVisibility(8);
        if (this.a.getParent() != null) {
            clc clcVar = this.b;
            float[] fArr = this.E;
            int i = clc.h;
            clcVar.getClass();
            Point point = hl.q;
            dlc dlcVar = clcVar.f;
            int i2 = dlcVar.d.x;
            clc clcVar2 = dlcVar.b;
            float left = clcVar2.getLeft() + i2;
            float f = clcVar.b;
            fArr[0] = (left - f) / (((point.x - f) - clcVar.c) - clcVar2.getMeasuredWidth());
            float top = clcVar2.getTop() + dlcVar.d.y;
            float f2 = clcVar.d;
            fArr[1] = (top - f2) / (((point.y - f2) - clcVar.e) - clcVar2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            a.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        jn7.e().n(this, jn7.D2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.D2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (!this.e && !ove.a(a.b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.H) {
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
            hmc hmcVar = this.r;
            hmcVar.d.setMirror(sharedInstance.isFrontFaceCamera());
            hmcVar.setIsScreencast(sharedInstance.isScreencast());
            hmcVar.d(false, 1.0f);
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
            this.x.setDuration(300L).setInterpolator(k43.f);
            this.x.start();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        g();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        elc.c();
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
            hl.d3(new osa((byte) 10), 200L);
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
