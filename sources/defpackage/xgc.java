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
public final class xgc implements VoIPService.StateListener, gk7 {
    public static boolean T = false;
    public static xgc U;
    public static xgc V;
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
    public final gw9 a;
    public final wgc b;
    public WindowManager c;
    public WindowManager.LayoutParams d;
    public boolean e;
    public final int f;
    public final int h;
    public final View n;
    public final aic r;
    public final aic s;
    public float w;
    public ValueAnimator x;
    public final uwb y = new uwb(this, (byte) 8);
    public final float[] E = new float[2];
    public final sv O = new sv((byte) 13);
    public final ugc Q = new ugc(this, (byte) 0);
    public final ugc R = new ugc(this, (byte) 1);
    public final vgc S = new Object();

    public xgc(Context context, int i, int i2, boolean z) {
        this.f = i;
        this.h = i2;
        float f = i2 * 0.4f;
        int i3 = ((int) ((f * 1.05f) - f)) / 2;
        this.G = i3;
        float f2 = i * 0.4f;
        int i4 = ((int) ((1.05f * f2) - f2)) / 2;
        this.F = i4;
        gw9 gw9Var = new gw9(this, context, context.getDrawable(2131230923));
        this.a = gw9Var;
        gw9Var.setWillNotDraw(false);
        gw9Var.setPadding(i4, i3, i4, i3);
        wgc wgcVar = new wgc(this, context);
        this.b = wgcVar;
        aic aicVar = new aic(context, false, true);
        this.s = aicVar;
        aicVar.b0 = (byte) 3;
        aic aicVar2 = new aic(context, false, true);
        this.r = aicVar2;
        aicVar2.d.setMirror(true);
        wgcVar.addView(aicVar);
        wgcVar.addView(aicVar2);
        wgcVar.setBackgroundColor(-7829368);
        gw9Var.addView(wgcVar);
        gw9Var.setClipChildren(false);
        gw9Var.setClipToPadding(false);
        if (z) {
            View view = new View(context);
            this.n = view;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bm2.o(-16777216, 76), 0}));
            wgcVar.addView(view, -1, gl.L(60.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232547);
            imageView.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            imageView.setContentDescription(k96.M0(2131752029, null));
            wgcVar.addView(imageView, nme.d(40, 40.0f, 53, 4.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(2131232548);
            imageView2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            imageView2.setContentDescription(k96.M0(2131747624, null));
            wgcVar.addView(imageView2, nme.d(40, 40.0f, 51, 4.0f, 4.0f, 4.0f, 0.0f));
            imageView.setOnClickListener(new x00((byte) 17));
            imageView2.setOnClickListener(new vzb(this, context, (byte) 12));
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
        g();
    }

    public static void a(LaunchActivity launchActivity) {
        xgc xgcVar = U;
        if (xgcVar != null && V == null && !T && xgcVar.a.getParent() != null && Settings.canDrawOverlays(launchActivity) != xgcVar.e) {
            int i = xgcVar.N;
            int i2 = xgcVar.f;
            int i3 = xgcVar.h;
            b();
            f(launchActivity, i, i2, i3, 0);
        }
    }

    public static void b() {
        if (T) {
            return;
        }
        xgc xgcVar = V;
        if (xgcVar != null) {
            xgcVar.c();
        }
        xgc xgcVar2 = U;
        if (xgcVar2 != null) {
            xgcVar2.c();
        }
        V = null;
        U = null;
        ygc.b();
    }

    public static xgc d() {
        xgc xgcVar = V;
        if (xgcVar != null) {
            return xgcVar;
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
            xgc xgcVar = new xgc(activity, i2, i3, false);
            U = xgcVar;
            xgcVar.e = Settings.canDrawOverlays(activity);
            if (U.e) {
                windowManager = (WindowManager) a.b.getSystemService("window");
            } else {
                windowManager = (WindowManager) activity.getSystemService("window");
            }
            xgc xgcVar2 = U;
            xgcVar2.N = i;
            xgcVar2.c = windowManager;
            xgcVar2.d = layoutParams;
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("voippipconfig", 0);
            float f5 = sharedPreferences.getFloat("relativeX", 1.0f);
            float f6 = sharedPreferences.getFloat("relativeY", 0.0f);
            xgc xgcVar3 = U;
            xgcVar3.getClass();
            Point point = gl.q;
            float f7 = point.x;
            float f8 = point.y;
            float L = gl.L(16.0f);
            float L2 = gl.L(16.0f);
            float L3 = gl.L(60.0f);
            float L4 = gl.L(16.0f);
            float f9 = xgcVar3.f * 0.25f;
            float f10 = xgcVar3.h * 0.25f;
            wgc wgcVar = xgcVar3.b;
            if (wgcVar.getMeasuredWidth() != 0) {
                f9 = wgcVar.getMeasuredWidth();
            }
            if (wgcVar.getMeasuredWidth() != 0) {
                f10 = wgcVar.getMeasuredHeight();
            }
            WindowManager.LayoutParams layoutParams2 = xgcVar3.d;
            layoutParams2.x = (int) (((((f7 - L) - L2) - f9) * f5) - (xgcVar3.F - L));
            layoutParams2.y = (int) (((((f8 - L3) - L4) - f10) * f6) - (xgcVar3.G - L3));
            gl.N3(xgcVar3.c, xgcVar3.a, layoutParams2);
            kk7.e().a(U, kk7.C2);
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
                    xgc xgcVar4 = U;
                    sharedInstance.setSinks(xgcVar4.r.d, xgcVar4.s.d);
                }
            } else if (i4 == 1) {
                U.a.setAlpha(0.0f);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    xgc xgcVar5 = U;
                    sharedInstance2.setBackgroundSinks(xgcVar5.r.d, xgcVar5.s.d);
                }
            }
            ygc.b();
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
            wgc wgcVar = this.b;
            float[] fArr = this.E;
            int i = wgc.h;
            wgcVar.getClass();
            Point point = gl.q;
            xgc xgcVar = wgcVar.f;
            int i2 = xgcVar.d.x;
            wgc wgcVar2 = xgcVar.b;
            float left = wgcVar2.getLeft() + i2;
            float f = wgcVar.b;
            fArr[0] = (left - f) / (((point.x - f) - wgcVar.c) - wgcVar2.getMeasuredWidth());
            float top = wgcVar2.getTop() + xgcVar.d.y;
            float f2 = wgcVar.d;
            fArr[1] = (top - f2) / (((point.y - f2) - wgcVar.e) - wgcVar2.getMeasuredHeight());
            fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
            fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
            a.b.getSharedPreferences("voippipconfig", 0).edit().putFloat("relativeX", Math.min(1.0f, Math.max(0.0f, this.E[0]))).putFloat("relativeY", Math.min(1.0f, Math.max(0.0f, this.E[1]))).apply();
            try {
                this.c.removeView(this.a);
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        kk7.e().n(this, kk7.C2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.C2) {
            b();
        }
    }

    public final void e() {
        VoIPService sharedInstance;
        if (!this.e && !wqe.a(a.b) && (sharedInstance = VoIPService.getSharedInstance()) != null && this.H) {
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
            aic aicVar = this.r;
            aicVar.d.setMirror(sharedInstance.isFrontFaceCamera());
            aicVar.setIsScreencast(sharedInstance.isScreencast());
            aicVar.d(false, 1.0f);
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
            this.x.setDuration(300L).setInterpolator(s33.f);
            this.x.start();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        g();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        ygc.b();
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
            gl.d3(new cza((byte) 7), 200L);
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
