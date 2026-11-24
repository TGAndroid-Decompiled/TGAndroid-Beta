package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
public final class hgc implements VoIPService.StateListener, gk7 {
    public static hgc m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public yl5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public xhc G;
    public boolean G0;
    public ggc H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public v31 L;
    public int M;
    public tgc M0;
    public s7c N;
    public cg2 N0;
    public pkb O;
    public cg2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public t8 Q;
    public jo0 R;
    public boolean R0;
    public f7 S;
    public TextView T;
    public xw0 U;
    public boolean U0;
    public w24 V;
    public float V0;
    public float W0;
    public float X0;
    public dgc Y;
    public float Y0;
    public pfc Z;
    public float Z0;
    public final int a;
    public pfc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public aic d0;
    public int d1;
    public ric e;
    public aic e0;
    public int e1;
    public ric f;
    public n4 f0;
    public boolean g0;
    public boolean g1;
    public ric h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public mfc j0;
    public boolean j1;
    public aic k1;
    public boolean l1;
    public boolean m0;
    public egc n;
    public boolean n0;
    public bgc o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public cgc s;
    public boolean s0;
    public float t0;
    public agc u0;
    public int v0;
    public kic w;
    public AccessibilityManager w0;
    public hic x;
    public lic y;
    public boolean z0;
    public final lfc r = new lfc();
    public final be0[] W = new be0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final on L0 = new on(null);
    public final uwb Q0 = new uwb(this, (byte) 7);
    public final sfc S0 = new sfc(this, (byte) 12);
    public final sfc T0 = new sfc(this, (byte) 13);
    public float f1 = 1.0f;

    public hgc(int i) {
        this.a = i;
        this.c = na7.q1(i).V1(Long.valueOf(y6c.h(i).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.q0 = -1;
        this.p0 = sharedState.getCallState();
        kk7.e().b(this, kk7.Q4);
        kk7.f(i).b(this, kk7.O4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.D2);
        kk7.e().b(this, kk7.I5);
    }

    public static void h(int[] iArr, int i) {
        hgc hgcVar = m1;
        if (hgcVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    hgcVar.u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    hgcVar.i(new cza((byte) 6));
                } else if (!hgcVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    rgc.h(hgcVar.b, new sfc(hgcVar, (byte) 3), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    hgcVar.u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    hgcVar.t();
                }
            }
        }
    }

    public static void n(Activity activity, int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int size;
        int size2;
        float f;
        hgc hgcVar = m1;
        if (hgcVar != null && hgcVar.u0.getParent() == null) {
            hgc hgcVar2 = m1;
            if (hgcVar2 != null) {
                hgcVar2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                agc agcVar = m1.u0;
                if (agcVar != null) {
                    agcVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 == null && !activity.isFinishing()) {
            if (xgc.d() != null) {
                z = true;
            } else {
                z = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                hgc hgcVar3 = new hgc(i);
                hgcVar3.b = activity;
                m1 = hgcVar3;
                agc agcVar2 = new agc(activity, !z, hgcVar3);
                m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                m1.getClass();
                agcVar2.setLockOnScreen(m1.J0);
                hgcVar3.u0 = agcVar2;
                rfc rfcVar = new rfc(hgcVar3, (byte) 3);
                WeakHashMap weakHashMap = jdc.a;
                bdc.i(agcVar2, rfcVar);
                ((WindowManager) activity.getSystemService("window")).addView(agcVar2, eic.a());
                hgcVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                hgcVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                cgc cgcVar = new cgc(hgcVar3, activity);
                cgcVar.setClipToPadding(false);
                cgcVar.setClipChildren(false);
                cgcVar.setBackgroundColor(-16777216);
                hgcVar3.x();
                hgcVar3.s = cgcVar;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lfc lfcVar = hgcVar3.r;
                hgcVar3.w = new kic(activity, z2, lfcVar);
                aic aicVar = new aic(activity, false, true, false, false);
                hgcVar3.d0 = aicVar;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                aicVar.d.setScalingType(scalingType);
                hgcVar3.d0.d.setEnableHardwareScaler(true);
                hgcVar3.d0.d.setRotateTextureWithScreen(true);
                hgcVar3.d0.b0 = (byte) 1;
                cgcVar.addView(hgcVar3.w, nme.c(-1.0f, -1));
                TLRPC.User user = hgcVar3.d;
                hic hicVar = new hic(activity, user, lfcVar);
                hgcVar3.x = hicVar;
                cgcVar.addView(hicVar, nme.c(-1.0f, -1));
                ?? view = new View(activity);
                if (e66.e(512)) {
                    int i3 = bkb.a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i4 = calendar.get(2);
                    int i5 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i4 == 11 && i5 >= 24 && i5 <= 31) || (i4 == 0 && i5 == 1)) {
                        view.a = new cka(0);
                    }
                }
                hgcVar3.y = view;
                cgcVar.addView((View) view, nme.c(220.0f, -1));
                cgcVar.addView(hgcVar3.d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new wd0(orientation, new int[]{-14994098, -14328963}).f(l69.y(1), new zlb(hgcVar3, (byte) 1), 0L);
                pfc pfcVar = new pfc(activity);
                hgcVar3.Z = pfcVar;
                pfcVar.setDelegate(new rfc(hgcVar3, (byte) 2));
                hgcVar3.Z.d(1.0f, 1.0f);
                hgcVar3.b0 = true;
                aic aicVar2 = new aic(activity, true, false);
                hgcVar3.e0 = aicVar2;
                aicVar2.d.setIsCamera(true);
                hgcVar3.e0.d.setUseCameraRotation(true);
                hgcVar3.Z.setOnTapListener(new tfc(hgcVar3, (byte) 1));
                hgcVar3.e0.d.setMirror(true);
                hgcVar3.Z.addView(hgcVar3.e0);
                pfc pfcVar2 = new pfc(activity);
                hgcVar3.a0 = pfcVar2;
                pfcVar2.T = true;
                pfcVar2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                hgcVar3.c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                hgcVar3.c0.setIsCamera(false);
                hgcVar3.c0.setFpsReduction(30.0f);
                hgcVar3.c0.setScalingType(scalingType);
                hgcVar3.a0.addView(hgcVar3.c0, nme.e(-1, -2, 17));
                hgcVar3.a0.setOnTapListener(new tfc(hgcVar3, (byte) 2));
                hgcVar3.a0.setVisibility(8);
                cgcVar.addView(hgcVar3.Z, nme.c(-2.0f, -2));
                cgcVar.addView(hgcVar3.a0);
                View view2 = new View(activity);
                hgcVar3.h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, bm2.o(-16777216, 127)}));
                cgcVar.addView(hgcVar3.h0, nme.e(-1, 160, 80));
                View view3 = new View(activity);
                hgcVar3.i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{bm2.o(-16777216, 102), 0}));
                cgcVar.addView(hgcVar3.i0, nme.e(-1, 160, 48));
                pkb pkbVar = new pkb((byte) 23, activity, hgcVar3);
                hgcVar3.O = pkbVar;
                pkbVar.setOrientation(0);
                hgcVar3.O.setPadding(0, 0, 0, gl.L(30.0f));
                hgcVar3.O.setClipToPadding(false);
                hgcVar3.O.setContentDescription(k96.M0(2131743060, null));
                hgcVar3.O.setOnClickListener(new tfc(hgcVar3, (byte) 3));
                hgcVar3.Q = new t8(activity, lfcVar);
                FrameLayout frameLayout = new FrameLayout(activity);
                hgcVar3.P = frameLayout;
                frameLayout.addView(hgcVar3.Q, nme.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                hgcVar3.P.setVisibility(8);
                hgcVar3.P.setOnClickListener(new tfc(hgcVar3, (byte) 4));
                f7 f7Var = new f7(activity, lfcVar);
                hgcVar3.S = f7Var;
                f7Var.setOrientation(1);
                TextView textView = new TextView(activity);
                hgcVar3.T = textView;
                textView.setText(k96.M0(2131743249, null));
                hgcVar3.T.setTextSize(1, 15.0f);
                hgcVar3.T.setTypeface(gl.o());
                hgcVar3.T.setTextColor(-1);
                hgcVar3.T.setGravity(17);
                xw0 xw0Var = new xw0((byte) 8, activity, hgcVar3);
                hgcVar3.U = xw0Var;
                xw0Var.setTextSize(1, 15.0f);
                hgcVar3.U.setTextColor(-1);
                hgcVar3.U.setGravity(17);
                hgcVar3.U.setText(k96.a0("CallEmojiKeyTooltip", null, 2131752615, TextUtils.ellipsize(l7c.k(user, true), hgcVar3.U.getPaint(), gl.L(300.0f), TextUtils.TruncateAt.END)));
                hgcVar3.S.setVisibility(8);
                hgcVar3.S.addView(hgcVar3.T);
                hgcVar3.S.addView(hgcVar3.U, nme.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                hgcVar3.S.setPadding(gl.L(18.0f), gl.L(80.0f), gl.L(18.0f), gl.L(18.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    be0 be0Var = new be0(activity);
                    be0[] be0VarArr = hgcVar3.W;
                    be0VarArr[i6] = be0Var;
                    be0VarArr[i6].getImageReceiver().S0 = true;
                    pkb pkbVar2 = hgcVar3.O;
                    be0 be0Var2 = be0VarArr[i6];
                    if (i6 == 0) {
                        f = 0.0f;
                    } else {
                        f = 6.0f;
                    }
                    pkbVar2.addView(be0Var2, nme.k(f, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                dgc dgcVar = new dgc(hgcVar3, activity);
                hgcVar3.Y = dgcVar;
                dgcVar.setOrientation(1);
                hgcVar3.Y.setFocusable(true);
                hgcVar3.Y.setFocusableInTouchMode(true);
                hgcVar3.E = new yl5(activity);
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.q(user);
                yl5 yl5Var = hgcVar3.E;
                int i7 = hgcVar3.a;
                yl5Var.b.m(gl5.m(i7, 0, user), null, pb0Var, user);
                hgcVar3.E.setRoundRadius(gl.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                hgcVar3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                hgcVar3.F.setText(vu3.m(qu2.m(0, user.first_name, user.last_name), hgcVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
                hgcVar3.F.setMaxLines(2);
                hgcVar3.F.setEllipsize(TextUtils.TruncateAt.END);
                hgcVar3.F.setTextColor(-1);
                hgcVar3.F.setGravity(1);
                hgcVar3.F.setImportantForAccessibility(2);
                hgcVar3.Y.addView(hgcVar3.F, nme.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.a = new TextView[2];
                int i8 = 0;
                for (int i9 = 2; i8 < i9; i9 = 2) {
                    frameLayout2.a[i8] = new TextView(activity);
                    frameLayout2.a[i8].setTextSize(1, 15.0f);
                    frameLayout2.a[i8].setTextColor(-1);
                    frameLayout2.a[i8].setGravity(1);
                    frameLayout2.addView(frameLayout2.a[i8]);
                    i8++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.c = frameLayout3;
                qk8 qk8Var = new qk8(frameLayout2, activity, lfcVar);
                qk8Var.setTextSize(1, 15.0f);
                qk8Var.setTextColor(-1);
                qk8Var.setGravity(1);
                qk8Var.setPadding(gl.L(12.0f), gl.L(2.0f), gl.L(12.0f), gl.L(2.0f));
                qk8Var.setText(k96.M0(2131742975, null));
                frameLayout3.addView(qk8Var, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, nme.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, nme.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131743011, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new s0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                bic bicVar = new bic(activity);
                frameLayout2.d = bicVar;
                frameLayout2.addView(bicVar, nme.c(-2.0f, -1));
                hgcVar3.G = frameLayout2;
                WeakHashMap weakHashMap2 = jdc.a;
                frameLayout2.setImportantForAccessibility(4);
                hgcVar3.Y.addView(hgcVar3.G, nme.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    ggc ggcVar = new ggc(activity);
                    hgcVar3.H = ggcVar;
                    long j = sharedState.getUser().id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i10 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null) {
                        if (i10 <= 0) {
                            ggcVar.setVisibility(8);
                            hgcVar3.Y.addView(hgcVar3.H, nme.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                        } else {
                            size = 0;
                        }
                    } else {
                        size = groupParticipants.size();
                    }
                    int max = Math.max(i10, size);
                    if (groupParticipants == null) {
                        size2 = 0;
                    } else {
                        size2 = groupParticipants.size();
                    }
                    int min = Math.min(3, size2);
                    gc0 gc0Var = ggcVar.b;
                    gc0Var.i(min);
                    int i11 = 0;
                    while (i11 < min) {
                        gc0Var.j(i11, i7, na7.q1(i7).Z1(cf3.n(groupParticipants.get(i11).peer)));
                        i11++;
                        j = j;
                    }
                    long j2 = j;
                    gc0Var.a(false, true);
                    if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && cf3.n(groupParticipants.get(0).peer) == j2))) {
                        ggcVar.setVisibility(8);
                    } else {
                        ggcVar.c = new tgb(k96.H(',', "Participants", max), 14.0f, gl.o());
                        ggcVar.setVisibility(0);
                        ggcVar.invalidate();
                    }
                    hgcVar3.Y.addView(hgcVar3.H, nme.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                hgcVar3.Y.setClipChildren(false);
                hgcVar3.Y.setClipToPadding(false);
                hgcVar3.Y.setPadding(0, 0, 0, gl.L(15.0f));
                hgcVar3.V = new w24(activity);
                hgcVar3.R = new jo0(activity, lfcVar);
                hgcVar3.V.setAlpha(0.0f);
                hgcVar3.R.setVisibility(8);
                cgcVar.addView(hgcVar3.E, nme.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.Y, nme.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.P, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.S, nme.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.O, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.V, nme.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                cgcVar.addView(hgcVar3.R, nme.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                hgcVar3.j0 = new mfc(activity);
                hgcVar3.e = new ric(activity, lfcVar);
                hgcVar3.f = new ric(activity, lfcVar);
                hgcVar3.h = new ric(activity, lfcVar);
                hgcVar3.n = new dic(activity, 52.0f);
                hgcVar3.e.setTranslationY(gl.L(100.0f));
                hgcVar3.e.setScaleX(0.0f);
                hgcVar3.e.setScaleY(0.0f);
                hgcVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hgcVar3.f.setTranslationY(gl.L(100.0f));
                hgcVar3.f.setScaleX(0.0f);
                hgcVar3.f.setScaleY(0.0f);
                hgcVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hgcVar3.h.setTranslationY(gl.L(100.0f));
                hgcVar3.h.setScaleX(0.0f);
                hgcVar3.h.setScaleY(0.0f);
                hgcVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hgcVar3.n.setTranslationY(gl.L(100.0f));
                hgcVar3.n.setScaleX(0.0f);
                hgcVar3.n.setScaleY(0.0f);
                hgcVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                hgcVar3.j0.addView(hgcVar3.e);
                hgcVar3.j0.addView(hgcVar3.f);
                hgcVar3.j0.addView(hgcVar3.h);
                hgcVar3.j0.addView(hgcVar3.n);
                n4 n4Var = new n4(activity);
                hgcVar3.f0 = n4Var;
                n4Var.setListener(new fgc(hgcVar3));
                hgcVar3.f0.setScaleX(1.15f);
                hgcVar3.f0.setScaleY(1.15f);
                cgcVar.addView(hgcVar3.j0, nme.e(-1, -2, 80));
                if (gl.O1()) {
                    i2 = 100;
                } else {
                    i2 = 27;
                }
                float f2 = i2;
                cgcVar.addView(hgcVar3.f0, nme.d(-1, 186.0f, 80, f2, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(activity);
                hgcVar3.J = imageView;
                imageView.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
                hgcVar3.J.setImageResource(2131232050);
                hgcVar3.J.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                cgcVar.addView(hgcVar3.J, nme.e(56, 56, 53));
                ote.a(hgcVar3.J);
                ImageView imageView2 = new ImageView(activity);
                hgcVar3.I = imageView2;
                imageView2.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
                hgcVar3.I.setImageResource(2131232085);
                hgcVar3.I.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                hgcVar3.I.setContentDescription(k96.M0(2131753753, null));
                cgcVar.addView(hgcVar3.I, nme.e(56, 56, 51));
                ote.a(hgcVar3.I);
                v31 v31Var = new v31(activity, (byte) 5);
                hgcVar3.L = v31Var;
                v31Var.setContentDescription(k96.M0(2131742997, null));
                hgcVar3.L.setBackground(bkb.f0(bm2.o(-1, 76), 1, -1));
                hgcVar3.L.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
                cgcVar.addView(hgcVar3.L, nme.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                hgcVar3.L.setAlpha(0.0f);
                hgcVar3.L.setOnClickListener(new tfc(hgcVar3, (byte) 5));
                hgcVar3.I.setOnClickListener(new tfc(hgcVar3, (byte) 6));
                hgcVar3.J.setOnClickListener(new vzb(hgcVar3, activity, (byte) 10));
                if (hgcVar3.u0.b) {
                    hgcVar3.I.setVisibility(8);
                    hgcVar3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.a = new HashMap();
                linearLayout.b = new ArrayList();
                linearLayout.c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.n = lfcVar;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new h7((byte) 5).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(gl.L(14.0f));
                hgcVar3.M0 = linearLayout;
                linearLayout.setGravity(80);
                hgcVar3.M0.setOnViewsUpdated(new sfc(hgcVar3, (byte) 5));
                cgcVar.addView(hgcVar3.M0, nme.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                cg2 cg2Var = new cg2(activity, 3, lfcVar, true);
                cg2Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                cg2Var.L = alignment;
                cg2Var.d = -1L;
                cg2Var.r0 = new sfc(hgcVar3, (byte) 6);
                cg2Var.U = true;
                cg2Var.h = gl.L(320.0f);
                cg2Var.e = true;
                cg2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
                cg2Var.q(8.0f);
                hgcVar3.N0 = cg2Var;
                cg2Var.t(k96.M0(2131744013, null));
                cgcVar.addView(hgcVar3.N0, nme.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                cg2 cg2Var2 = new cg2(activity, 1, lfcVar, false);
                cg2Var2.p(true);
                cg2Var2.L = alignment;
                cg2Var2.d = 4000L;
                cg2Var2.U = true;
                cg2Var2.h = gl.L(320.0f);
                cg2Var2.e = true;
                cg2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
                cg2Var2.q(8.0f);
                hgcVar3.O0 = cg2Var2;
                cg2Var2.t(k96.M0(2131743060, null));
                cgcVar.addView(hgcVar3.O0, nme.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hgcVar3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!hgcVar3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hgcVar3.U0 = z3;
                    }
                    hgcVar3.f();
                }
                agcVar2.addView(cgcVar);
                if (z) {
                    hgcVar3.F0 = 0.0f;
                    hgcVar3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        hgcVar3.d0.setStub(xgc.d().s);
                        hgcVar3.e0.setStub(xgc.d().r);
                    }
                    hgcVar3.u0.setAlpha(0.0f);
                    hgcVar3.y();
                    hgcVar3.E0 = true;
                    xgc.T = true;
                    if (xgc.V == null) {
                        hgcVar3.L0.d();
                        gl.e3(new sfc(hgcVar3, (byte) 11), 32L);
                    } else {
                        xgc.U.getClass();
                        throw null;
                    }
                } else {
                    hgcVar3.F0 = 1.0f;
                    hgcVar3.x();
                }
                ygc.b();
            }
        }
    }

    public final ValueAnimator a(boolean z) {
        char c;
        float measuredWidth;
        final float measuredHeight;
        final float f;
        final boolean z2;
        final float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z3;
        this.Z.animate().cancel();
        float f9 = xgc.d().d.x + xgc.d().F;
        float f10 = xgc.d().d.y + xgc.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        xgc.U.getClass();
        final float measuredWidth2 = f9 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f10 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        pfc pfcVar = this.Z;
        final float f11 = 0.0f;
        if (z4) {
            int measuredWidth3 = pfcVar.getMeasuredWidth();
            if (this.n0 && measuredWidth3 != 0) {
                f7 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = oo1.v(xgc.d().f, 0.25f, 0.4f, (xgc.d().f * 0.25f) + (f9 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f7)) / 2.0f))) - gl.L(4.0f);
                f8 = oo1.v(xgc.d().h, 0.25f, 0.4f, (xgc.d().h * 0.25f) + (f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f7)) / 2.0f))) - gl.L(4.0f);
                z3 = true;
            } else {
                c = 0;
                f7 = 0.0f;
                measuredWidth = 1.0f;
                f8 = 1.0f;
                z3 = false;
            }
            float f12 = f7;
            measuredHeight = f8;
            z2 = z3;
            f = f12;
        } else {
            c = 0;
            measuredWidth = f9 - ((pfcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f13 = measuredWidth;
        if (this.m0) {
            f2 = gl.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        final float L = (gl.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            xgc.U.getClass();
        } else {
            f11 = 1.0f;
        }
        if (z) {
            if (z2) {
                this.Z.setScaleX(f);
                this.Z.setScaleY(f);
                this.Z.setTranslationX(f13);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L);
                this.Z.setAlpha(f11);
            }
            this.d0.setScaleX(0.25f);
            this.d0.setScaleY(0.25f);
            this.d0.setTranslationX(measuredWidth2);
            this.d0.setTranslationY(measuredHeight2);
            f3 = 0.25f;
            this.d0.setRoundCorners((gl.L(6.0f) * 1.0f) / 0.25f);
        } else {
            f3 = 0.25f;
        }
        if (z) {
            f5 = 1.0f;
            f4 = 0.0f;
        } else {
            f4 = 1.0f;
            f5 = 0.0f;
        }
        float[] fArr = new float[2];
        fArr[c] = f5;
        fArr[1] = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        this.F0 = f6;
        x();
        final float f14 = f3;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f15 = 1.0f - floatValue;
                hgc hgcVar = hgc.this;
                hgcVar.F0 = f15;
                hgcVar.x();
                if (z2) {
                    float f16 = (f * floatValue) + (scaleX * f15);
                    hgcVar.Z.setScaleX(f16);
                    hgcVar.Z.setScaleY(f16);
                    hgcVar.Z.setTranslationX((f13 * floatValue) + (x * f15));
                    hgcVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f15));
                    hgcVar.Z.setCornerRadius((L * floatValue) + (f2 * f15));
                    hgcVar.Z.setAlpha((f11 * floatValue) + (1.0f * f15));
                }
                float f17 = (f14 * floatValue) + (1.0f * f15);
                hgcVar.d0.setScaleX(f17);
                hgcVar.d0.setScaleY(f17);
                float f18 = 0.0f * f15;
                float f19 = (measuredWidth2 * floatValue) + f18;
                float f20 = (measuredHeight2 * floatValue) + f18;
                hgcVar.d0.setTranslationX(f19);
                hgcVar.d0.setTranslationY(f20);
                hgcVar.d0.setRoundCorners(((gl.L(4.0f) * floatValue) * 1.0f) / f17);
                if (!hgcVar.Z.Q) {
                    hgcVar.e0.d(false, floatValue);
                }
                hgcVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        kk7.e().n(this, kk7.Q4);
        kk7.f(this.a).n(this, kk7.O4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.D2);
        kk7.e().n(this, kk7.I5);
        s7c s7cVar = this.N;
        if (s7cVar != null) {
            s7cVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            hic hicVar = this.x;
            if (hicVar.L && z != hicVar.F) {
                hicVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                hicVar.c = ofFloat;
                ofFloat.addUpdateListener(new gic(hicVar, (byte) 1));
                hicVar.c.setInterpolator(s33.f);
                hicVar.c.setDuration(200L);
                hicVar.c.start();
            }
            if (z) {
                int i = gba.c1;
                if (i < 2) {
                    gba.c1 = i + 2;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gba.c1);
                    edit.apply();
                }
                this.O0.f(true);
                gl.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(gl.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(s33.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(s33.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(gl.L(140.0f));
                s33 s33Var = s33.f;
                ug8.t(translationY, s33Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-gl.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new xfc(this, (byte) 3)).setInterpolator(s33Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(s33.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                s33 s33Var2 = s33.f;
                duration.setInterpolator(s33Var2).setListener(new id4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(s33Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gl.L(120.0f)).setListener(new xfc(this, (byte) 4)).setDuration(250L).setInterpolator(s33Var2).start();
            }
            this.q0 = this.p0;
            y();
        }
    }

    public final void d() {
        this.u0.b();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.O4) {
            if (this.p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.e0.d.release();
                this.d0.d.release();
                this.c0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i == kk7.k4) {
            v(true);
        } else if (i == kk7.D2) {
            this.u0.b();
        } else if (i == kk7.Q4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i == kk7.I5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        hgc hgcVar;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            hgcVar = this;
            ofFloat.addUpdateListener(new xq4(hgcVar, this.f1, this.Y0, this.Z0, (byte) 2));
            hgcVar.i1.addListener(new xfc(hgcVar, (byte) 0));
            hgcVar.i1.setDuration(350L);
            hgcVar.i1.setInterpolator(s33.f);
            hgcVar.i1.start();
        } else {
            hgcVar = this;
        }
        hgcVar.h1 = false;
        hgcVar.a1 = false;
    }

    public final void f() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yfc(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zfc(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            bgc bgcVar = this.o0;
            if (bgcVar != null) {
                bgcVar.a(false, false);
            } else if (this.m0 && this.n0 && this.H0) {
                this.H0 = false;
                this.Z.setRelativePosition(this.a0);
                this.b0 = false;
                this.q0 = this.p0;
                y();
            } else if (this.C0) {
                c(false);
            } else if (this.S.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (!this.G0 && m1 != null) {
                        this.G0 = true;
                        if (VoIPService.getSharedInstance() != null) {
                            int measuredHeight = m1.u0.getMeasuredHeight();
                            hgc hgcVar = m1;
                            xgc.f(hgcVar.b, hgcVar.a, hgcVar.u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = m1.r0;
                            if (windowInsets != null) {
                                xgc.W = windowInsets.getSystemWindowInsetTop();
                                m1.r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (xgc.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            s33 s33Var = s33.f;
                            duration.setInterpolator(s33Var).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(s33Var).start();
                            this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                            this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                            this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                            this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).start();
                            xgc.T = true;
                            this.E0 = true;
                            ValueAnimator a = a(false);
                            this.L0.d();
                            a.addListener(new xfc(this, (byte) 1));
                            a.setDuration(350L);
                            a.setInterpolator(s33Var);
                            a.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.u0.b();
            }
        }
    }

    public final void i(Runnable runnable) {
        if (this.f.getVisibility() == 0) {
            this.f0.getLocationOnScreen(new int[2]);
            n4 n4Var = this.f0;
            ValueAnimator valueAnimator = n4Var.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                n4Var.c0 = null;
                n4Var.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        n4 n4Var2 = this.f0;
        ValueAnimator valueAnimator2 = n4Var2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            n4Var2.c0 = null;
            n4Var2.V.stop();
        }
        this.n.c(2131230918, -1, -1041108, 1.0f, true, k96.M0(2131743169, null), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f.d(3, true, false);
        this.n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        final int L = gl.L(24.0f);
        final int L2 = gl.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                hgc hgcVar = hgc.this;
                hgcVar.f0.setTranslationY(L2 * floatValue);
                int i = marginEnd;
                int i2 = (int) (i - ((i + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2;
                marginLayoutParams2.rightMargin = i2;
                hgcVar.f0.requestLayout();
            }
        });
        n4 n4Var3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n4Var3, View.SCALE_X, n4Var3.getScaleX(), 1.0f, 1.0f, 1.0f);
        n4 n4Var4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n4Var4, View.SCALE_Y, n4Var4.getScaleY(), 1.0f, 1.0f, 1.0f);
        n4 n4Var5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(n4Var5, View.ALPHA, n4Var5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new eh8(this, runnable, (byte) 21));
        animatorSet.start();
        gl.e3(new sfc(this, (byte) 7), 133L);
    }

    public final void j(ric ricVar, VoIPService voIPService) {
        if (!this.n0) {
            ricVar.d(2, false, false);
            ricVar.setOnBtnClickedListener(null);
            ricVar.setEnabled(false);
            return;
        }
        ricVar.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            ricVar.d(2, !voIPService.isSwitchingCamera(), false);
        } else {
            ricVar.d(2, voIPService.isSwitchingCamera(), false);
        }
        ricVar.setOnBtnClickedListener(new io9(this, voIPService, ricVar, (byte) 10));
    }

    public final void k(ric ricVar, VoIPService voIPService, boolean z) {
        ricVar.d(1, voIPService.isMicMute(), false);
        pfc pfcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = pfcVar.g0;
        float f = 0.0f;
        if (!z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f = 1.0f;
            }
            pfcVar.L = f;
            pfcVar.invalidate();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = pfcVar.L;
            if (isMicMute) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            pfcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(pfcVar.h0);
            pfcVar.g0.setDuration(150L);
            pfcVar.g0.start();
        }
        ricVar.setOnBtnClickedListener(new rfc(this, (byte) 4));
    }

    public final void l(final ric ricVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            ricVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            ricVar.d(5, true, false);
        } else {
            ricVar.d(5, false, false);
            i = 1;
        }
        ricVar.setEnabled(true);
        ricVar.setOnBtnClickedListener(new pic() {
            @Override
            public final void a(qic qicVar) {
                if (VoIPService.getSharedInstance() != null) {
                    hgc hgcVar = hgc.this;
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(hgcVar.b, false, Integer.valueOf(i));
                    hgcVar.l(ricVar, voIPService);
                }
            }
        });
    }

    public final void m(ric ricVar, VoIPService voIPService, boolean z) {
        boolean z2;
        if (!this.n0 && !this.m0) {
            z2 = voIPService.isVideoAvailable();
        } else {
            z2 = true;
        }
        if (z2) {
            if (this.n0) {
                if (voIPService.isScreencast()) {
                    ricVar.d(3, false, z);
                } else {
                    ricVar.d(3, false, z);
                }
            } else {
                ricVar.d(3, true, z);
            }
            ricVar.setOnBtnClickedListener(new rfc(this, (byte) 5));
            ricVar.setEnabled(true);
            return;
        }
        ricVar.d(3, true, false);
        ricVar.setOnClickListener(null);
        ricVar.setEnabled(false);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3;
        int i = 0;
        if (!this.n0 && !this.m0) {
            z3 = true;
        } else {
            z3 = false;
        }
        yl5 yl5Var = this.E;
        Integer num = null;
        if (z) {
            if (z3) {
                if (yl5Var.getTag() == null) {
                    this.E.animate().setListener(null).cancel();
                    this.E.setVisibility(0);
                    if (!this.C0) {
                        yl5 yl5Var2 = this.E;
                        if (z2) {
                            yl5Var2.setAlpha(0.0f);
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                        } else {
                            yl5Var2.setAlpha(0.0f);
                            this.E.setTranslationY(-gl.L(135.0f));
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                        }
                    } else if (z2) {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(gl.L(48.0f));
                        this.E.setScaleX(0.1f);
                        this.E.setScaleY(0.1f);
                    }
                }
            } else if (yl5Var.getTag() != null) {
                this.E.animate().setListener(null).cancel();
                this.E.setTranslationY(0.0f);
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(s33.f).setListener(new xfc(this, (byte) 8)).start();
            }
        } else {
            yl5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            yl5 yl5Var3 = this.E;
            if (!z3) {
                i = 8;
            }
            yl5Var3.setVisibility(i);
        }
        yl5 yl5Var4 = this.E;
        if (z3) {
            num = 1;
        }
        yl5Var4.setTag(num);
    }

    @Override
    public final void onAudioSettingsChanged() {
        u(true);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        this.q0 = this.p0;
        y();
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        this.q0 = this.p0;
        if (i2 == 2 && !this.U0) {
            this.U0 = true;
        }
        ygc.b();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        kic kicVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G != null && (kicVar = this.w) != null) {
            int i2 = kicVar.W;
            if ((i2 == 2 || i2 == 3) && this.j1) {
                gl.e3(new on7(this, i, (byte) 23), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i) {
        int i2 = this.p0;
        if (i2 != i) {
            this.q0 = i2;
            this.p0 = i;
            if (this.u0 != null) {
                y();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        this.q0 = this.p0;
        if (z && !this.U0) {
            this.U0 = true;
        }
        y();
    }

    public final void p(CharSequence charSequence) {
        TextView textView;
        if (this.b.isFinishing()) {
            return;
        }
        hd hdVar = new hd(0, null, this.b);
        boolean[] zArr = new boolean[3];
        hdVar.S = k96.M0(2131743166, null);
        hdVar.U = charSequence;
        hdVar.m0 = k96.M0(2131747638, null);
        hdVar.n0 = null;
        hdVar.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) hdVar.c(-(i + 1))) != null) {
                zkb.X(textView, bkb.p7, hdVar.j1);
            }
        }
        hdVar.setCanceledOnTouchOutside(true);
        hdVar.setOnDismissListener(new ph8(this, (byte) 14));
    }

    public final void q(int i, boolean z) {
        boolean z2;
        boolean z3;
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.x0);
        }
        if (!z && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        pfc pfcVar = this.Z;
        boolean z4 = true;
        if (i == 0) {
            if (z) {
                if (pfcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    pfc pfcVar2 = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(pfcVar2, View.ALPHA, pfcVar2.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        pfc pfcVar3 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pfcVar3, View.SCALE_X, pfcVar3.getScaleX(), 0.7f);
                        pfc pfcVar4 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(pfcVar4, View.SCALE_Y, pfcVar4.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new xfc(this, (byte) 7));
                    this.A0.setDuration(250L).setInterpolator(s33.f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                pfcVar.setVisibility(8);
            }
        } else {
            if (pfcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                z2 = z;
            } else {
                z2 = false;
            }
            pfc pfcVar5 = this.Z;
            if (z) {
                if (pfcVar5.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                    if (this.Z.getVisibility() == 8) {
                        this.Z.setAlpha(0.0f);
                        this.Z.setScaleX(0.7f);
                        this.Z.setScaleY(0.7f);
                        this.Z.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.A0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.7f, 1.0f));
                    this.A0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                pfcVar5.setVisibility(0);
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                pfc pfcVar6 = this.Z;
                if (pfcVar6.E < 0.0f) {
                    pfcVar6.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            pfc pfcVar7 = this.Z;
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            pfcVar7.c(z3, z2);
            if (i == 2) {
                z4 = false;
            }
            this.b0 = z4;
        }
        this.Z.setTag(Integer.valueOf(i));
    }

    public final void r(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgc.r(boolean):void");
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            sfc sfcVar = this.S0;
            gl.r(sfcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                gl.e3(sfcVar, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void t() {
        String M0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.w0.isTouchExplorationEnabled()) {
                if (!this.n0) {
                    M0 = k96.M0(2131754731, null);
                } else {
                    M0 = k96.M0(2131754732, null);
                }
                this.s.announceForAccessibility(M0);
            }
            if (!this.n0) {
                if (this.o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f.getLocationOnScreen(iArr);
                    bgc bgcVar = new bgc(this, this.s.getContext(), iArr[0], iArr[1]);
                    this.o0 = bgcVar;
                    WindowInsets windowInsets = this.r0;
                    if (windowInsets != null) {
                        bgcVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.s.addView(this.o0);
                    return;
                }
                return;
            }
            this.e0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.q0 = this.p0;
            y();
        }
    }

    public final void u(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new h7((byte) 4).setDuration(250L);
                s33 s33Var = s33.f;
                transitionSet.addTransition(duration.setInterpolator(s33Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(s33Var));
                transitionSet.excludeChildren(dic.class, true);
                transitionSet.excludeChildren(ric.class, true);
                TransitionManager.beginDelayedTransition(this.j0, transitionSet);
            }
            int i = this.p0;
            if (i == 11) {
                this.e.setVisibility(8);
                this.f.setVisibility(8);
                this.h.setVisibility(8);
                this.n.setVisibility(8);
                return;
            }
            int i2 = 0;
            if (i != 15 && i != 17) {
                if (m1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.n0 || this.m0)) {
                    j(this.e, sharedInstance);
                    if (this.x0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                } else {
                    l(this.e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                }
                m(this.f, sharedInstance, false);
                k(this.h, sharedInstance, z);
                this.n.c(2131230918, -1, -1041108, 1.0f, true, k96.M0(2131743169, null), false, z);
                this.n.setOnClickListener(new tfc(this, (byte) 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i == 15) {
                    if (!sharedInstance.isScreencast() && (this.n0 || this.m0)) {
                        j(this.e, sharedInstance);
                        if (this.x0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    } else {
                        l(this.e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    }
                    m(this.f, sharedInstance, false);
                    k(this.h, sharedInstance, z);
                } else {
                    this.e.setVisibility(8);
                    this.f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f = 0;
                i2 = 16;
            }
            if (this.f.getVisibility() == 0) {
                this.f.f = i2;
                i2 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f = i2;
                i2 += 16;
            }
            if (this.n.getVisibility() == 0) {
                this.n.G = i2;
            }
            w();
        }
    }

    public final void v(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgc.v(boolean):void");
    }

    public final void w() {
        int i;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i = 2131230916;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i = 2131230924;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i = 2131230920;
        } else {
            i = 2131230921;
        }
        int i2 = this.K;
        v31 v31Var = this.L;
        if (i2 != i) {
            gl.M3(v31Var, i);
        } else {
            v31Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(bm2.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(bm2.o(-16777216, (int) (127.5f * this.F0)));
        cgc cgcVar = this.s;
        if (cgcVar != null) {
            cgcVar.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgc.y():void");
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }
}
