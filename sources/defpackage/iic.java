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
public final class iic implements VoIPService.StateListener, jm7 {
    public static iic m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public yn5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public xjc G;
    public boolean G0;
    public hic H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public c51 L;
    public int M;
    public uic M0;
    public t9c N;
    public qh2 N0;
    public qmb O;
    public qh2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public t8 Q;
    public jp0 R;
    public boolean R0;
    public f7 S;
    public TextView T;
    public ey0 U;
    public boolean U0;
    public h44 V;
    public float V0;
    public float W0;
    public float X0;
    public eic Y;
    public float Y0;
    public phc Z;
    public float Z0;
    public final int a;
    public phc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public TextureViewRenderer c0;
    public float c1;
    public final TLRPC.User d;
    public akc d0;
    public int d1;
    public rkc e;
    public akc e0;
    public int e1;
    public rkc f;
    public n4 f0;
    public boolean g0;
    public boolean g1;
    public rkc h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public mhc j0;
    public boolean j1;
    public akc k1;
    public boolean l1;
    public boolean m0;
    public fic n;
    public boolean n0;
    public cic o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public dic s;
    public boolean s0;
    public float t0;
    public bic u0;
    public int v0;
    public kkc w;
    public AccessibilityManager w0;
    public hkc x;
    public lkc y;
    public boolean z0;
    public final lhc r = new lhc();
    public final bf0[] W = new bf0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final po L0 = new po(null);
    public final oxb Q0 = new oxb(this, (byte) 9);
    public final thc S0 = new thc(this, (byte) 12);
    public final thc T0 = new thc(this, (byte) 13);
    public float f1 = 1.0f;

    public iic(int i) {
        this.a = i;
        this.c = oc7.r1(i).W1(Long.valueOf(z8c.h(i).e()));
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
        nm7.e().b(this, nm7.S4);
        nm7.f(i).b(this, nm7.Q4);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.E2);
        nm7.e().b(this, nm7.K5);
    }

    public static void h(int[] iArr, int i) {
        iic iicVar = m1;
        if (iicVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    iicVar.u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    iicVar.i(new e1b((byte) 6));
                } else if (!iicVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    sic.h(iicVar.b, new thc(iicVar, (byte) 3), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    iicVar.u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    iicVar.t();
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
        iic iicVar = m1;
        if (iicVar != null && iicVar.u0.getParent() == null) {
            iic iicVar2 = m1;
            if (iicVar2 != null) {
                iicVar2.d0.d.release();
                m1.e0.d.release();
                m1.c0.release();
                bic bicVar = m1.u0;
                if (bicVar != null) {
                    bicVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 == null && !activity.isFinishing()) {
            if (yic.d() != null) {
                z = true;
            } else {
                z = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                iic iicVar3 = new iic(i);
                iicVar3.b = activity;
                m1 = iicVar3;
                bic bicVar2 = new bic(activity, !z, iicVar3);
                m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                m1.getClass();
                bicVar2.setLockOnScreen(m1.J0);
                iicVar3.u0 = bicVar2;
                shc shcVar = new shc(iicVar3, (byte) 3);
                WeakHashMap weakHashMap = kfc.a;
                cfc.i(bicVar2, shcVar);
                ((WindowManager) activity.getSystemService("window")).addView(bicVar2, ekc.a());
                iicVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                iicVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                dic dicVar = new dic(iicVar3, activity);
                dicVar.setClipToPadding(false);
                dicVar.setClipChildren(false);
                dicVar.setBackgroundColor(-16777216);
                iicVar3.x();
                iicVar3.s = dicVar;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lhc lhcVar = iicVar3.r;
                iicVar3.w = new kkc(activity, z2, lhcVar);
                akc akcVar = new akc(activity, false, true, false, false);
                iicVar3.d0 = akcVar;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                akcVar.d.setScalingType(scalingType);
                iicVar3.d0.d.setEnableHardwareScaler(true);
                iicVar3.d0.d.setRotateTextureWithScreen(true);
                iicVar3.d0.b0 = (byte) 1;
                dicVar.addView(iicVar3.w, qoe.c(-1.0f, -1));
                TLRPC.User user = iicVar3.d;
                hkc hkcVar = new hkc(activity, user, lhcVar);
                iicVar3.x = hkcVar;
                dicVar.addView(hkcVar, qoe.c(-1.0f, -1));
                ?? view = new View(activity);
                if (e86.e(512)) {
                    int i3 = cmb.a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i4 = calendar.get(2);
                    int i5 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i4 == 11 && i5 >= 24 && i5 <= 31) || (i4 == 0 && i5 == 1)) {
                        view.a = new dma(0);
                    }
                }
                iicVar3.y = view;
                dicVar.addView((View) view, qoe.c(220.0f, -1));
                dicVar.addView(iicVar3.d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new we0(orientation, new int[]{-14994098, -14328963}).f(ni6.A(1), new aob(iicVar3, (byte) 1), 0L);
                phc phcVar = new phc(activity);
                iicVar3.Z = phcVar;
                phcVar.setDelegate(new shc(iicVar3, (byte) 2));
                iicVar3.Z.d(1.0f, 1.0f);
                iicVar3.b0 = true;
                akc akcVar2 = new akc(activity, true, false);
                iicVar3.e0 = akcVar2;
                akcVar2.d.setIsCamera(true);
                iicVar3.e0.d.setUseCameraRotation(true);
                iicVar3.Z.setOnTapListener(new uhc(iicVar3, (byte) 1));
                iicVar3.e0.d.setMirror(true);
                iicVar3.Z.addView(iicVar3.e0);
                phc phcVar2 = new phc(activity);
                iicVar3.a0 = phcVar2;
                phcVar2.T = true;
                phcVar2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                iicVar3.c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                iicVar3.c0.setIsCamera(false);
                iicVar3.c0.setFpsReduction(30.0f);
                iicVar3.c0.setScalingType(scalingType);
                iicVar3.a0.addView(iicVar3.c0, qoe.e(-1, -2, 17));
                iicVar3.a0.setOnTapListener(new uhc(iicVar3, (byte) 2));
                iicVar3.a0.setVisibility(8);
                dicVar.addView(iicVar3.Z, qoe.c(-2.0f, -2));
                dicVar.addView(iicVar3.a0);
                View view2 = new View(activity);
                iicVar3.h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, on2.p(-16777216, 127)}));
                dicVar.addView(iicVar3.h0, qoe.e(-1, 160, 80));
                View view3 = new View(activity);
                iicVar3.i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{on2.p(-16777216, 102), 0}));
                dicVar.addView(iicVar3.i0, qoe.e(-1, 160, 48));
                qmb qmbVar = new qmb((byte) 23, activity, iicVar3);
                iicVar3.O = qmbVar;
                qmbVar.setOrientation(0);
                iicVar3.O.setPadding(0, 0, 0, gm.L(30.0f));
                iicVar3.O.setClipToPadding(false);
                iicVar3.O.setContentDescription(jb6.M0(2131742986, null));
                iicVar3.O.setOnClickListener(new uhc(iicVar3, (byte) 3));
                iicVar3.Q = new t8(activity, lhcVar);
                FrameLayout frameLayout = new FrameLayout(activity);
                iicVar3.P = frameLayout;
                frameLayout.addView(iicVar3.Q, qoe.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                iicVar3.P.setVisibility(8);
                iicVar3.P.setOnClickListener(new uhc(iicVar3, (byte) 4));
                f7 f7Var = new f7(activity, lhcVar);
                iicVar3.S = f7Var;
                f7Var.setOrientation(1);
                TextView textView = new TextView(activity);
                iicVar3.T = textView;
                textView.setText(jb6.M0(2131743175, null));
                iicVar3.T.setTextSize(1, 15.0f);
                iicVar3.T.setTypeface(gm.o());
                iicVar3.T.setTextColor(-1);
                iicVar3.T.setGravity(17);
                ey0 ey0Var = new ey0((byte) 8, activity, iicVar3);
                iicVar3.U = ey0Var;
                ey0Var.setTextSize(1, 15.0f);
                iicVar3.U.setTextColor(-1);
                iicVar3.U.setGravity(17);
                iicVar3.U.setText(jb6.a0("CallEmojiKeyTooltip", null, 2131752580, TextUtils.ellipsize(m9c.k(user, true), iicVar3.U.getPaint(), gm.L(300.0f), TextUtils.TruncateAt.END)));
                iicVar3.S.setVisibility(8);
                iicVar3.S.addView(iicVar3.T);
                iicVar3.S.addView(iicVar3.U, qoe.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                iicVar3.S.setPadding(gm.L(18.0f), gm.L(80.0f), gm.L(18.0f), gm.L(18.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    bf0 bf0Var = new bf0(activity);
                    bf0[] bf0VarArr = iicVar3.W;
                    bf0VarArr[i6] = bf0Var;
                    bf0VarArr[i6].getImageReceiver().S0 = true;
                    qmb qmbVar2 = iicVar3.O;
                    bf0 bf0Var2 = bf0VarArr[i6];
                    if (i6 == 0) {
                        f = 0.0f;
                    } else {
                        f = 6.0f;
                    }
                    qmbVar2.addView(bf0Var2, qoe.k(f, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                eic eicVar = new eic(iicVar3, activity);
                iicVar3.Y = eicVar;
                eicVar.setOrientation(1);
                iicVar3.Y.setFocusable(true);
                iicVar3.Y.setFocusableInTouchMode(true);
                iicVar3.E = new yn5(activity);
                pc0 pc0Var = new pc0((ylb) null);
                pc0Var.q(user);
                yn5 yn5Var = iicVar3.E;
                int i7 = iicVar3.a;
                yn5Var.b.m(gn5.m(i7, 0, user), null, pc0Var, user);
                iicVar3.E.setRoundRadius(gm.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                iicVar3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                iicVar3.F.setText(gw3.m(bw2.m(0, user.first_name, user.last_name), iicVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
                iicVar3.F.setMaxLines(2);
                iicVar3.F.setEllipsize(TextUtils.TruncateAt.END);
                iicVar3.F.setTextColor(-1);
                iicVar3.F.setGravity(1);
                iicVar3.F.setImportantForAccessibility(2);
                iicVar3.Y.addView(iicVar3.F, qoe.t(-2, -2, 1, 8, 0, 8, 6));
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
                sm8 sm8Var = new sm8(frameLayout2, activity, lhcVar);
                sm8Var.setTextSize(1, 15.0f);
                sm8Var.setTextColor(-1);
                sm8Var.setGravity(1);
                sm8Var.setPadding(gm.L(12.0f), gm.L(2.0f), gm.L(12.0f), gm.L(2.0f));
                sm8Var.setText(jb6.M0(2131742901, null));
                frameLayout3.addView(sm8Var, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, qoe.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, qoe.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131742937, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new s0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                bkc bkcVar = new bkc(activity);
                frameLayout2.d = bkcVar;
                frameLayout2.addView(bkcVar, qoe.c(-2.0f, -1));
                iicVar3.G = frameLayout2;
                WeakHashMap weakHashMap2 = kfc.a;
                frameLayout2.setImportantForAccessibility(4);
                iicVar3.Y.addView(iicVar3.G, qoe.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    hic hicVar = new hic(activity);
                    iicVar3.H = hicVar;
                    long j = sharedState.getUser().id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i10 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null) {
                        if (i10 <= 0) {
                            hicVar.setVisibility(8);
                            iicVar3.Y.addView(iicVar3.H, qoe.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
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
                    gd0 gd0Var = hicVar.b;
                    gd0Var.i(min);
                    int i11 = 0;
                    while (i11 < min) {
                        gd0Var.j(i11, i7, oc7.r1(i7).a2(pg3.n(groupParticipants.get(i11).peer)));
                        i11++;
                        j = j;
                    }
                    long j2 = j;
                    gd0Var.a(false, true);
                    if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && pg3.n(groupParticipants.get(0).peer) == j2))) {
                        hicVar.setVisibility(8);
                    } else {
                        hicVar.c = new uib(jb6.H(',', "Participants", max), 14.0f, gm.o());
                        hicVar.setVisibility(0);
                        hicVar.invalidate();
                    }
                    iicVar3.Y.addView(iicVar3.H, qoe.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                iicVar3.Y.setClipChildren(false);
                iicVar3.Y.setClipToPadding(false);
                iicVar3.Y.setPadding(0, 0, 0, gm.L(15.0f));
                iicVar3.V = new h44(activity);
                iicVar3.R = new jp0(activity, lhcVar);
                iicVar3.V.setAlpha(0.0f);
                iicVar3.R.setVisibility(8);
                dicVar.addView(iicVar3.E, qoe.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.Y, qoe.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.P, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.S, qoe.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.O, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.V, qoe.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                dicVar.addView(iicVar3.R, qoe.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                iicVar3.j0 = new mhc(activity);
                iicVar3.e = new rkc(activity, lhcVar);
                iicVar3.f = new rkc(activity, lhcVar);
                iicVar3.h = new rkc(activity, lhcVar);
                iicVar3.n = new dkc(activity, 52.0f);
                iicVar3.e.setTranslationY(gm.L(100.0f));
                iicVar3.e.setScaleX(0.0f);
                iicVar3.e.setScaleY(0.0f);
                iicVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                iicVar3.f.setTranslationY(gm.L(100.0f));
                iicVar3.f.setScaleX(0.0f);
                iicVar3.f.setScaleY(0.0f);
                iicVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                iicVar3.h.setTranslationY(gm.L(100.0f));
                iicVar3.h.setScaleX(0.0f);
                iicVar3.h.setScaleY(0.0f);
                iicVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                iicVar3.n.setTranslationY(gm.L(100.0f));
                iicVar3.n.setScaleX(0.0f);
                iicVar3.n.setScaleY(0.0f);
                iicVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                iicVar3.j0.addView(iicVar3.e);
                iicVar3.j0.addView(iicVar3.f);
                iicVar3.j0.addView(iicVar3.h);
                iicVar3.j0.addView(iicVar3.n);
                n4 n4Var = new n4(activity);
                iicVar3.f0 = n4Var;
                n4Var.setListener(new gic(iicVar3));
                iicVar3.f0.setScaleX(1.15f);
                iicVar3.f0.setScaleY(1.15f);
                dicVar.addView(iicVar3.j0, qoe.e(-1, -2, 80));
                if (gm.O1()) {
                    i2 = 100;
                } else {
                    i2 = 27;
                }
                float f2 = i2;
                dicVar.addView(iicVar3.f0, qoe.d(-1, 186.0f, 80, f2, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(activity);
                iicVar3.J = imageView;
                imageView.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
                iicVar3.J.setImageResource(2131232051);
                iicVar3.J.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                dicVar.addView(iicVar3.J, qoe.e(56, 56, 53));
                rve.a(iicVar3.J);
                ImageView imageView2 = new ImageView(activity);
                iicVar3.I = imageView2;
                imageView2.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
                iicVar3.I.setImageResource(2131232086);
                iicVar3.I.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
                iicVar3.I.setContentDescription(jb6.M0(2131753721, null));
                dicVar.addView(iicVar3.I, qoe.e(56, 56, 51));
                rve.a(iicVar3.I);
                c51 c51Var = new c51(activity, (byte) 5);
                iicVar3.L = c51Var;
                c51Var.setContentDescription(jb6.M0(2131742923, null));
                iicVar3.L.setBackground(cmb.f0(on2.p(-1, 76), 1, -1));
                iicVar3.L.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
                dicVar.addView(iicVar3.L, qoe.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                iicVar3.L.setAlpha(0.0f);
                iicVar3.L.setOnClickListener(new uhc(iicVar3, (byte) 5));
                iicVar3.I.setOnClickListener(new uhc(iicVar3, (byte) 6));
                iicVar3.J.setOnClickListener(new fyb(iicVar3, activity, (byte) 11));
                if (iicVar3.u0.b) {
                    iicVar3.I.setVisibility(8);
                    iicVar3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.a = new HashMap();
                linearLayout.b = new ArrayList();
                linearLayout.c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.n = lhcVar;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new h7((byte) 5).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(gm.L(14.0f));
                iicVar3.M0 = linearLayout;
                linearLayout.setGravity(80);
                iicVar3.M0.setOnViewsUpdated(new thc(iicVar3, (byte) 5));
                dicVar.addView(iicVar3.M0, qoe.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                qh2 qh2Var = new qh2(activity, 3, lhcVar, true);
                qh2Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                qh2Var.L = alignment;
                qh2Var.d = -1L;
                qh2Var.r0 = new thc(iicVar3, (byte) 6);
                qh2Var.U = true;
                qh2Var.h = gm.L(320.0f);
                qh2Var.e = true;
                qh2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
                qh2Var.q(8.0f);
                iicVar3.N0 = qh2Var;
                qh2Var.t(jb6.M0(2131743939, null));
                dicVar.addView(iicVar3.N0, qoe.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                qh2 qh2Var2 = new qh2(activity, 1, lhcVar, false);
                qh2Var2.p(true);
                qh2Var2.L = alignment;
                qh2Var2.d = 4000L;
                qh2Var2.U = true;
                qh2Var2.h = gm.L(320.0f);
                qh2Var2.e = true;
                qh2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
                qh2Var2.q(8.0f);
                iicVar3.O0 = qh2Var2;
                qh2Var2.t(jb6.M0(2131742986, null));
                dicVar.addView(iicVar3.O0, qoe.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                iicVar3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!iicVar3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iicVar3.U0 = z3;
                    }
                    iicVar3.f();
                }
                bicVar2.addView(dicVar);
                if (z) {
                    iicVar3.F0 = 0.0f;
                    iicVar3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        iicVar3.d0.setStub(yic.d().s);
                        iicVar3.e0.setStub(yic.d().r);
                    }
                    iicVar3.u0.setAlpha(0.0f);
                    iicVar3.y();
                    iicVar3.E0 = true;
                    yic.T = true;
                    if (yic.V == null) {
                        iicVar3.L0.d();
                        gm.d3(new thc(iicVar3, (byte) 11), 32L);
                    } else {
                        yic.U.getClass();
                        throw null;
                    }
                } else {
                    iicVar3.F0 = 1.0f;
                    iicVar3.x();
                }
                zic.b();
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
        float f9 = yic.d().d.x + yic.d().F;
        float f10 = yic.d().d.y + yic.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        yic.U.getClass();
        final float measuredWidth2 = f9 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f10 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        phc phcVar = this.Z;
        final float f11 = 0.0f;
        if (z4) {
            int measuredWidth3 = phcVar.getMeasuredWidth();
            if (this.n0 && measuredWidth3 != 0) {
                f7 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = aq1.v(yic.d().f, 0.25f, 0.4f, (yic.d().f * 0.25f) + (f9 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f7)) / 2.0f))) - gm.L(4.0f);
                f8 = aq1.v(yic.d().h, 0.25f, 0.4f, (yic.d().h * 0.25f) + (f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f7)) / 2.0f))) - gm.L(4.0f);
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
            measuredWidth = f9 - ((phcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f13 = measuredWidth;
        if (this.m0) {
            f2 = gm.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        final float L = (gm.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            yic.U.getClass();
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
            this.d0.setRoundCorners((gm.L(6.0f) * 1.0f) / 0.25f);
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
                iic iicVar = iic.this;
                iicVar.F0 = f15;
                iicVar.x();
                if (z2) {
                    float f16 = (f * floatValue) + (scaleX * f15);
                    iicVar.Z.setScaleX(f16);
                    iicVar.Z.setScaleY(f16);
                    iicVar.Z.setTranslationX((f13 * floatValue) + (x * f15));
                    iicVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f15));
                    iicVar.Z.setCornerRadius((L * floatValue) + (f2 * f15));
                    iicVar.Z.setAlpha((f11 * floatValue) + (1.0f * f15));
                }
                float f17 = (f14 * floatValue) + (1.0f * f15);
                iicVar.d0.setScaleX(f17);
                iicVar.d0.setScaleY(f17);
                float f18 = 0.0f * f15;
                float f19 = (measuredWidth2 * floatValue) + f18;
                float f20 = (measuredHeight2 * floatValue) + f18;
                iicVar.d0.setTranslationX(f19);
                iicVar.d0.setTranslationY(f20);
                iicVar.d0.setRoundCorners(((gm.L(4.0f) * floatValue) * 1.0f) / f17);
                if (!iicVar.Z.Q) {
                    iicVar.e0.d(false, floatValue);
                }
                iicVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        nm7.e().n(this, nm7.S4);
        nm7.f(this.a).n(this, nm7.Q4);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.E2);
        nm7.e().n(this, nm7.K5);
        t9c t9cVar = this.N;
        if (t9cVar != null) {
            t9cVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            hkc hkcVar = this.x;
            if (hkcVar.L && z != hkcVar.F) {
                hkcVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                hkcVar.c = ofFloat;
                ofFloat.addUpdateListener(new gkc(hkcVar, (byte) 1));
                hkcVar.c.setInterpolator(d53.f);
                hkcVar.c.setDuration(200L);
                hkcVar.c.start();
            }
            if (z) {
                int i = gda.b1;
                if (i < 2) {
                    gda.b1 = i + 2;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gda.b1);
                    edit.apply();
                }
                this.O0.f(true);
                gm.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(gm.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(d53.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(d53.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(gm.L(140.0f));
                d53 d53Var = d53.f;
                wi8.t(translationY, d53Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-gm.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new yhc(this, (byte) 3)).setInterpolator(d53Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(d53.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                d53 d53Var2 = d53.f;
                duration.setInterpolator(d53Var2).setListener(new jf4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(d53Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-gm.L(120.0f)).setListener(new yhc(this, (byte) 4)).setDuration(250L).setInterpolator(d53Var2).start();
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
        if (i == nm7.Q4) {
            if (this.p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.e0.d.release();
                this.d0.d.release();
                this.c0.release();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i == nm7.m4) {
            v(true);
        } else if (i == nm7.E2) {
            this.u0.b();
        } else if (i == nm7.S4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i == nm7.K5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        iic iicVar;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            iicVar = this;
            ofFloat.addUpdateListener(new ys4(iicVar, this.f1, this.Y0, this.Z0, (byte) 2));
            iicVar.i1.addListener(new yhc(iicVar, (byte) 0));
            iicVar.i1.setDuration(350L);
            iicVar.i1.setInterpolator(d53.f);
            iicVar.i1.start();
        } else {
            iicVar = this;
        }
        iicVar.h1 = false;
        iicVar.a1 = false;
    }

    public final void f() {
        this.e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new zhc(this));
        this.d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new aic(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            cic cicVar = this.o0;
            if (cicVar != null) {
                cicVar.a(false, false);
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
                            iic iicVar = m1;
                            yic.f(iicVar.b, iicVar.a, iicVar.u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = m1.r0;
                            if (windowInsets != null) {
                                yic.W = windowInsets.getSystemWindowInsetTop();
                                m1.r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (yic.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            d53 d53Var = d53.f;
                            duration.setInterpolator(d53Var).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53Var).start();
                            this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                            this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                            this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                            this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).start();
                            yic.T = true;
                            this.E0 = true;
                            ValueAnimator a = a(false);
                            this.L0.d();
                            a.addListener(new yhc(this, (byte) 1));
                            a.setDuration(350L);
                            a.setInterpolator(d53Var);
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
        this.n.c(2131230919, -1, -1041108, 1.0f, true, jb6.M0(2131743095, null), false, false);
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
        final int L = gm.L(24.0f);
        final int L2 = gm.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                iic iicVar = iic.this;
                iicVar.f0.setTranslationY(L2 * floatValue);
                int i = marginEnd;
                int i2 = (int) (i - ((i + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2;
                marginLayoutParams2.rightMargin = i2;
                iicVar.f0.requestLayout();
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
        animatorSet.addListener(new ic8(this, runnable, (byte) 22));
        animatorSet.start();
        gm.d3(new thc(this, (byte) 7), 133L);
    }

    public final void j(rkc rkcVar, VoIPService voIPService) {
        if (!this.n0) {
            rkcVar.d(2, false, false);
            rkcVar.setOnBtnClickedListener(null);
            rkcVar.setEnabled(false);
            return;
        }
        rkcVar.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            rkcVar.d(2, !voIPService.isSwitchingCamera(), false);
        } else {
            rkcVar.d(2, voIPService.isSwitchingCamera(), false);
        }
        rkcVar.setOnBtnClickedListener(new jq9(this, voIPService, rkcVar, (byte) 10));
    }

    public final void k(rkc rkcVar, VoIPService voIPService, boolean z) {
        rkcVar.d(1, voIPService.isMicMute(), false);
        phc phcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = phcVar.g0;
        float f = 0.0f;
        if (!z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f = 1.0f;
            }
            phcVar.L = f;
            phcVar.invalidate();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = phcVar.L;
            if (isMicMute) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            phcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(phcVar.h0);
            phcVar.g0.setDuration(150L);
            phcVar.g0.start();
        }
        rkcVar.setOnBtnClickedListener(new shc(this, (byte) 4));
    }

    public final void l(final rkc rkcVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            rkcVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            rkcVar.d(5, true, false);
        } else {
            rkcVar.d(5, false, false);
            i = 1;
        }
        rkcVar.setEnabled(true);
        rkcVar.setOnBtnClickedListener(new pkc() {
            @Override
            public final void a(qkc qkcVar) {
                if (VoIPService.getSharedInstance() != null) {
                    iic iicVar = iic.this;
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(iicVar.b, false, Integer.valueOf(i));
                    iicVar.l(rkcVar, voIPService);
                }
            }
        });
    }

    public final void m(rkc rkcVar, VoIPService voIPService, boolean z) {
        boolean z2;
        if (!this.n0 && !this.m0) {
            z2 = voIPService.isVideoAvailable();
        } else {
            z2 = true;
        }
        if (z2) {
            if (this.n0) {
                if (voIPService.isScreencast()) {
                    rkcVar.d(3, false, z);
                } else {
                    rkcVar.d(3, false, z);
                }
            } else {
                rkcVar.d(3, true, z);
            }
            rkcVar.setOnBtnClickedListener(new shc(this, (byte) 5));
            rkcVar.setEnabled(true);
            return;
        }
        rkcVar.d(3, true, false);
        rkcVar.setOnClickListener(null);
        rkcVar.setEnabled(false);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3;
        int i = 0;
        if (!this.n0 && !this.m0) {
            z3 = true;
        } else {
            z3 = false;
        }
        yn5 yn5Var = this.E;
        Integer num = null;
        if (z) {
            if (z3) {
                if (yn5Var.getTag() == null) {
                    this.E.animate().setListener(null).cancel();
                    this.E.setVisibility(0);
                    if (!this.C0) {
                        yn5 yn5Var2 = this.E;
                        if (z2) {
                            yn5Var2.setAlpha(0.0f);
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                        } else {
                            yn5Var2.setAlpha(0.0f);
                            this.E.setTranslationY(-gm.L(135.0f));
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                        }
                    } else if (z2) {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(gm.L(48.0f));
                        this.E.setScaleX(0.1f);
                        this.E.setScaleY(0.1f);
                    }
                }
            } else if (yn5Var.getTag() != null) {
                this.E.animate().setListener(null).cancel();
                this.E.setTranslationY(0.0f);
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(d53.f).setListener(new yhc(this, (byte) 8)).start();
            }
        } else {
            yn5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            yn5 yn5Var3 = this.E;
            if (!z3) {
                i = 8;
            }
            yn5Var3.setVisibility(i);
        }
        yn5 yn5Var4 = this.E;
        if (z3) {
            num = 1;
        }
        yn5Var4.setTag(num);
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
        zic.b();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        kkc kkcVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G != null && (kkcVar = this.w) != null) {
            int i2 = kkcVar.W;
            if ((i2 == 2 || i2 == 3) && this.j1) {
                gm.d3(new ge7(this, i, (byte) 25), 400L);
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
        he heVar = new he(0, null, this.b);
        boolean[] zArr = new boolean[3];
        heVar.S = jb6.M0(2131743092, null);
        heVar.U = charSequence;
        heVar.m0 = jb6.M0(2131747564, null);
        heVar.n0 = null;
        heVar.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) heVar.c(-(i + 1))) != null) {
                anb.X(textView, cmb.p7, heVar.j1);
            }
        }
        heVar.setCanceledOnTouchOutside(true);
        heVar.setOnDismissListener(new qj8(this, (byte) 14));
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
        phc phcVar = this.Z;
        boolean z4 = true;
        if (i == 0) {
            if (z) {
                if (phcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    phc phcVar2 = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(phcVar2, View.ALPHA, phcVar2.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        phc phcVar3 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(phcVar3, View.SCALE_X, phcVar3.getScaleX(), 0.7f);
                        phc phcVar4 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(phcVar4, View.SCALE_Y, phcVar4.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new yhc(this, (byte) 7));
                    this.A0.setDuration(250L).setInterpolator(d53.f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                phcVar.setVisibility(8);
            }
        } else {
            if (phcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                z2 = z;
            } else {
                z2 = false;
            }
            phc phcVar5 = this.Z;
            if (z) {
                if (phcVar5.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
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
                phcVar5.setVisibility(0);
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                phc phcVar6 = this.Z;
                if (phcVar6.E < 0.0f) {
                    phcVar6.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            phc phcVar7 = this.Z;
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            phcVar7.c(z3, z2);
            if (i == 2) {
                z4 = false;
            }
            this.b0 = z4;
        }
        this.Z.setTag(Integer.valueOf(i));
    }

    public final void r(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.r(boolean):void");
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            thc thcVar = this.S0;
            gm.r(thcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                gm.d3(thcVar, 3000L);
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
                    M0 = jb6.M0(2131754731, null);
                } else {
                    M0 = jb6.M0(2131754732, null);
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
                    cic cicVar = new cic(this, this.s.getContext(), iArr[0], iArr[1]);
                    this.o0 = cicVar;
                    WindowInsets windowInsets = this.r0;
                    if (windowInsets != null) {
                        cicVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
                d53 d53Var = d53.f;
                transitionSet.addTransition(duration.setInterpolator(d53Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(d53Var));
                transitionSet.excludeChildren(dkc.class, true);
                transitionSet.excludeChildren(rkc.class, true);
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
                this.n.c(2131230919, -1, -1041108, 1.0f, true, jb6.M0(2131743095, null), false, z);
                this.n.setOnClickListener(new uhc(this, (byte) 0));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.v(boolean):void");
    }

    public final void w() {
        int i;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i = 2131230917;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i = 2131230925;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i = 2131230921;
        } else {
            i = 2131230922;
        }
        int i2 = this.K;
        c51 c51Var = this.L;
        if (i2 != i) {
            gm.L3(c51Var, i);
        } else {
            c51Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(on2.p(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(on2.p(-16777216, (int) (127.5f * this.F0)));
        dic dicVar = this.s;
        if (dicVar != null) {
            dicVar.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.y():void");
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }
}
