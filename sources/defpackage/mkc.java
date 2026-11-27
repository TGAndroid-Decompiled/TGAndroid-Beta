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
import org.webrtc.RendererCommon;
public final class mkc implements VoIPService.StateListener, fn7 {
    public static mkc m1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public bo5 E;
    public boolean E0;
    public TextView F;
    public float F0;
    public emc G;
    public boolean G0;
    public lkc H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public long K0;
    public d41 L;
    public int M;
    public zkc M0;
    public sbc N;
    public ug2 N0;
    public oob O;
    public ug2 O0;
    public FrameLayout P;
    public ValueAnimator P0;
    public u8 Q;
    public jo0 R;
    public boolean R0;
    public g7 S;
    public TextView T;
    public fx0 U;
    public boolean U0;
    public r34 V;
    public float V0;
    public float W0;
    public float X0;
    public ikc Y;
    public float Y0;
    public ujc Z;
    public float Z0;
    public final int a;
    public ujc a0;
    public boolean a1;
    public Activity b;
    public boolean b0;
    public float b1;
    public final TLRPC.User c;
    public bnb c0;
    public float c1;
    public final TLRPC.User d;
    public hmc d0;
    public int d1;
    public dnc e;
    public hmc e0;
    public int e1;
    public dnc f;
    public o4 f0;
    public boolean g0;
    public boolean g1;
    public dnc h;
    public View h0;
    public boolean h1;
    public View i0;
    public ValueAnimator i1;
    public ljc j0;
    public boolean j1;
    public hmc k1;
    public boolean l1;
    public boolean m0;
    public jkc n;
    public boolean n0;
    public gkc o0;
    public int p0;
    public int q0;
    public WindowInsets r0;
    public hkc s;
    public boolean s0;
    public float t0;
    public fkc u0;
    public int v0;
    public wmc w;
    public AccessibilityManager w0;
    public tmc x;
    public xmc y;
    public boolean z0;
    public final kjc r = new kjc();
    public final de0[] W = new de0[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint k0 = new Paint();
    public final Paint l0 = new Paint();
    public boolean x0 = true;
    public float y0 = 1.0f;
    public final pn L0 = new pn(null);
    public final pzb Q0 = new pzb(this, (byte) 9);
    public final xjc S0 = new xjc(this, (byte) 12);
    public final xjc T0 = new xjc(this, (byte) 13);
    public float f1 = 1.0f;

    public mkc(int i) {
        this.a = i;
        this.c = uc7.s1(i).X1(Long.valueOf(yac.h(i).e()));
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
        jn7.e().b(this, jn7.R4);
        jn7.f(i).b(this, jn7.P4);
        jn7.e().b(this, jn7.l4);
        jn7.e().b(this, jn7.E2);
        jn7.e().b(this, jn7.J5);
    }

    public static void h(int[] iArr, int i) {
        mkc mkcVar = m1;
        if (mkcVar != null) {
            if (i == 101) {
                if (VoIPService.getSharedState() == null) {
                    mkcVar.u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mkcVar.i(new osa((byte) 9));
                } else if (!mkcVar.b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    xkc.h(mkcVar.b, new xjc(mkcVar, (byte) 4), i);
                    return;
                }
            }
            if (i == 102) {
                if (VoIPService.getSharedState() == null) {
                    mkcVar.u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    mkcVar.t();
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
        mkc mkcVar = m1;
        if (mkcVar != null && mkcVar.u0.getParent() == null) {
            mkc mkcVar2 = m1;
            if (mkcVar2 != null) {
                mkcVar2.d0.d.e();
                m1.e0.d.e();
                m1.c0.e();
                fkc fkcVar = m1.u0;
                if (fkcVar != null) {
                    fkcVar.d();
                }
                m1.b();
            }
            m1 = null;
        }
        if (m1 == null && !activity.isFinishing()) {
            if (dlc.d() != null) {
                z = true;
            } else {
                z = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                mkc mkcVar3 = new mkc(i);
                mkcVar3.b = activity;
                m1 = mkcVar3;
                fkc fkcVar2 = new fkc(activity, !z, mkcVar3);
                m1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                m1.getClass();
                fkcVar2.setLockOnScreen(m1.J0);
                mkcVar3.u0 = fkcVar2;
                wjc wjcVar = new wjc(mkcVar3, (byte) 3);
                WeakHashMap weakHashMap = ihc.a;
                ahc.i(fkcVar2, wjcVar);
                ((WindowManager) activity.getSystemService("window")).addView(fkcVar2, qmc.a());
                mkcVar3.t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                mkcVar3.w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                hkc hkcVar = new hkc(mkcVar3, activity);
                hkcVar.setClipToPadding(false);
                hkcVar.setClipChildren(false);
                hkcVar.setBackgroundColor(-16777216);
                mkcVar3.x();
                mkcVar3.s = hkcVar;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                kjc kjcVar = mkcVar3.r;
                mkcVar3.w = new wmc(activity, z2, kjcVar);
                hmc hmcVar = new hmc(activity, false, true, false, false);
                mkcVar3.d0 = hmcVar;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                hmcVar.d.setScalingType(scalingType);
                mkcVar3.d0.d.setEnableHardwareScaler(true);
                mkcVar3.d0.d.setRotateTextureWithScreen(true);
                mkcVar3.d0.b0 = (byte) 1;
                hkcVar.addView(mkcVar3.w, tre.c(-1.0f, -1));
                TLRPC.User user = mkcVar3.d;
                tmc tmcVar = new tmc(activity, user, kjcVar);
                mkcVar3.x = tmcVar;
                hkcVar.addView(tmcVar, tre.c(-1.0f, -1));
                ?? view = new View(activity);
                if (i86.e(512)) {
                    int i3 = aob.a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i4 = calendar.get(2);
                    int i5 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i4 == 11 && i5 >= 24 && i5 <= 31) || (i4 == 0 && i5 == 1)) {
                        view.a = new wna(0);
                    }
                }
                mkcVar3.y = view;
                hkcVar.addView((View) view, tre.c(220.0f, -1));
                hkcVar.addView(mkcVar3.d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new yd0(orientation, new int[]{-14994098, -14328963}).f(ri6.A(1), new ypb(mkcVar3, (byte) 1), 0L);
                ujc ujcVar = new ujc(activity);
                mkcVar3.Z = ujcVar;
                ujcVar.setDelegate(new wjc(mkcVar3, (byte) 2));
                mkcVar3.Z.d(1.0f, 1.0f);
                mkcVar3.b0 = true;
                hmc hmcVar2 = new hmc(activity, true, false);
                mkcVar3.e0 = hmcVar2;
                hmcVar2.d.setIsCamera(true);
                mkcVar3.e0.d.setUseCameraRotation(true);
                mkcVar3.Z.setOnTapListener(new yjc(mkcVar3, (byte) 1));
                mkcVar3.e0.d.setMirror(true);
                mkcVar3.Z.addView(mkcVar3.e0);
                ujc ujcVar2 = new ujc(activity);
                mkcVar3.a0 = ujcVar2;
                ujcVar2.T = true;
                ujcVar2.c(true, false);
                bnb bnbVar = new bnb(activity);
                mkcVar3.c0 = bnbVar;
                bnbVar.setEnableHardwareScaler(true);
                mkcVar3.c0.setIsCamera(false);
                mkcVar3.c0.setFpsReduction(30.0f);
                mkcVar3.c0.setScalingType(scalingType);
                mkcVar3.a0.addView(mkcVar3.c0, tre.e(-1, -2, 17));
                mkcVar3.a0.setOnTapListener(new yjc(mkcVar3, (byte) 2));
                mkcVar3.a0.setVisibility(8);
                hkcVar.addView(mkcVar3.Z, tre.c(-2.0f, -2));
                hkcVar.addView(mkcVar3.a0);
                View view2 = new View(activity);
                mkcVar3.h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, vm2.o(-16777216, 127)}));
                hkcVar.addView(mkcVar3.h0, tre.e(-1, 160, 80));
                View view3 = new View(activity);
                mkcVar3.i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{vm2.o(-16777216, 102), 0}));
                hkcVar.addView(mkcVar3.i0, tre.e(-1, 160, 48));
                oob oobVar = new oob((byte) 23, activity, mkcVar3);
                mkcVar3.O = oobVar;
                oobVar.setOrientation(0);
                mkcVar3.O.setPadding(0, 0, 0, hl.L(30.0f));
                mkcVar3.O.setClipToPadding(false);
                mkcVar3.O.setContentDescription(ob6.M0(2131742954, null));
                mkcVar3.O.setOnClickListener(new yjc(mkcVar3, (byte) 3));
                mkcVar3.Q = new u8(activity, kjcVar);
                FrameLayout frameLayout = new FrameLayout(activity);
                mkcVar3.P = frameLayout;
                frameLayout.addView(mkcVar3.Q, tre.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                mkcVar3.P.setVisibility(8);
                mkcVar3.P.setOnClickListener(new yjc(mkcVar3, (byte) 4));
                g7 g7Var = new g7(activity, kjcVar);
                mkcVar3.S = g7Var;
                g7Var.setOrientation(1);
                TextView textView = new TextView(activity);
                mkcVar3.T = textView;
                textView.setText(ob6.M0(2131743143, null));
                mkcVar3.T.setTextSize(1, 15.0f);
                mkcVar3.T.setTypeface(hl.o());
                mkcVar3.T.setTextColor(-1);
                mkcVar3.T.setGravity(17);
                fx0 fx0Var = new fx0((byte) 8, activity, mkcVar3);
                mkcVar3.U = fx0Var;
                fx0Var.setTextSize(1, 15.0f);
                mkcVar3.U.setTextColor(-1);
                mkcVar3.U.setGravity(17);
                mkcVar3.U.setText(ob6.a0("CallEmojiKeyTooltip", null, 2131752608, TextUtils.ellipsize(lbc.k(user, true), mkcVar3.U.getPaint(), hl.L(300.0f), TextUtils.TruncateAt.END)));
                mkcVar3.S.setVisibility(8);
                mkcVar3.S.addView(mkcVar3.T);
                mkcVar3.S.addView(mkcVar3.U, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                mkcVar3.S.setPadding(hl.L(18.0f), hl.L(80.0f), hl.L(18.0f), hl.L(18.0f));
                for (int i6 = 0; i6 < 4; i6++) {
                    de0 de0Var = new de0(activity);
                    de0[] de0VarArr = mkcVar3.W;
                    de0VarArr[i6] = de0Var;
                    de0VarArr[i6].getImageReceiver().S0 = true;
                    oob oobVar2 = mkcVar3.O;
                    de0 de0Var2 = de0VarArr[i6];
                    if (i6 == 0) {
                        f = 0.0f;
                    } else {
                        f = 6.0f;
                    }
                    oobVar2.addView(de0Var2, tre.k(f, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ikc ikcVar = new ikc(mkcVar3, activity);
                mkcVar3.Y = ikcVar;
                ikcVar.setOrientation(1);
                mkcVar3.Y.setFocusable(true);
                mkcVar3.Y.setFocusableInTouchMode(true);
                mkcVar3.E = new bo5(activity);
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.q(user);
                bo5 bo5Var = mkcVar3.E;
                int i7 = mkcVar3.a;
                bo5Var.b.m(jn5.m(i7, 0, user), null, rb0Var, user);
                mkcVar3.E.setRoundRadius(hl.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                mkcVar3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                mkcVar3.F.setText(pv3.m(lv2.m(0, user.first_name, user.last_name), mkcVar3.F.getPaint().getFontMetricsInt(), false, null, 0));
                mkcVar3.F.setMaxLines(2);
                mkcVar3.F.setEllipsize(TextUtils.TruncateAt.END);
                mkcVar3.F.setTextColor(-1);
                mkcVar3.F.setGravity(1);
                mkcVar3.F.setImportantForAccessibility(2);
                mkcVar3.Y.addView(mkcVar3.F, tre.t(-2, -2, 1, 8, 0, 8, 6));
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
                do8 do8Var = new do8(frameLayout2, activity, kjcVar);
                do8Var.setTextSize(1, 15.0f);
                do8Var.setTextColor(-1);
                do8Var.setGravity(1);
                do8Var.setPadding(hl.L(12.0f), hl.L(2.0f), hl.L(12.0f), hl.L(2.0f));
                do8Var.setText(ob6.M0(2131742869, null));
                frameLayout3.addView(do8Var, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, tre.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, tre.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131742905, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new t0(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                imc imcVar = new imc(activity);
                frameLayout2.d = imcVar;
                frameLayout2.addView(imcVar, tre.c(-2.0f, -1));
                mkcVar3.G = frameLayout2;
                WeakHashMap weakHashMap2 = ihc.a;
                frameLayout2.setImportantForAccessibility(4);
                mkcVar3.Y.addView(mkcVar3.G, tre.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    lkc lkcVar = new lkc(activity);
                    mkcVar3.H = lkcVar;
                    long j = sharedState.getUser().id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i10 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null) {
                        if (i10 <= 0) {
                            lkcVar.setVisibility(8);
                            mkcVar3.Y.addView(mkcVar3.H, tre.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
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
                    ic0 ic0Var = lkcVar.b;
                    ic0Var.i(min);
                    int i11 = 0;
                    while (i11 < min) {
                        ic0Var.j(i11, i7, uc7.s1(i7).b2(wf3.n(groupParticipants.get(i11).peer)));
                        i11++;
                        j = j;
                    }
                    long j2 = j;
                    ic0Var.a(false, true);
                    if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && wf3.n(groupParticipants.get(0).peer) == j2))) {
                        lkcVar.setVisibility(8);
                    } else {
                        lkcVar.c = new pkb(ob6.H(',', "Participants", max), 14.0f, hl.o());
                        lkcVar.setVisibility(0);
                        lkcVar.invalidate();
                    }
                    mkcVar3.Y.addView(mkcVar3.H, tre.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                mkcVar3.Y.setClipChildren(false);
                mkcVar3.Y.setClipToPadding(false);
                mkcVar3.Y.setPadding(0, 0, 0, hl.L(15.0f));
                mkcVar3.V = new r34(activity);
                mkcVar3.R = new jo0(activity, kjcVar);
                mkcVar3.V.setAlpha(0.0f);
                mkcVar3.R.setVisibility(8);
                hkcVar.addView(mkcVar3.E, tre.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.Y, tre.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.P, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.S, tre.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.O, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.V, tre.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                hkcVar.addView(mkcVar3.R, tre.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                mkcVar3.j0 = new ljc(activity);
                mkcVar3.e = new dnc(activity, kjcVar);
                mkcVar3.f = new dnc(activity, kjcVar);
                mkcVar3.h = new dnc(activity, kjcVar);
                mkcVar3.n = new kmc(activity, 52.0f);
                mkcVar3.e.setTranslationY(hl.L(100.0f));
                mkcVar3.e.setScaleX(0.0f);
                mkcVar3.e.setScaleY(0.0f);
                mkcVar3.e.animate().setStartDelay(150L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mkcVar3.f.setTranslationY(hl.L(100.0f));
                mkcVar3.f.setScaleX(0.0f);
                mkcVar3.f.setScaleY(0.0f);
                mkcVar3.f.animate().setStartDelay(166L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mkcVar3.h.setTranslationY(hl.L(100.0f));
                mkcVar3.h.setScaleX(0.0f);
                mkcVar3.h.setScaleY(0.0f);
                mkcVar3.h.animate().setStartDelay(182L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mkcVar3.n.setTranslationY(hl.L(100.0f));
                mkcVar3.n.setScaleX(0.0f);
                mkcVar3.n.setScaleY(0.0f);
                mkcVar3.n.animate().setStartDelay(198L).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                mkcVar3.j0.addView(mkcVar3.e);
                mkcVar3.j0.addView(mkcVar3.f);
                mkcVar3.j0.addView(mkcVar3.h);
                mkcVar3.j0.addView(mkcVar3.n);
                o4 o4Var = new o4(activity);
                mkcVar3.f0 = o4Var;
                o4Var.setListener(new kkc(mkcVar3));
                mkcVar3.f0.setScaleX(1.15f);
                mkcVar3.f0.setScaleY(1.15f);
                hkcVar.addView(mkcVar3.j0, tre.e(-1, -2, 80));
                if (hl.O1()) {
                    i2 = 100;
                } else {
                    i2 = 27;
                }
                float f2 = i2;
                hkcVar.addView(mkcVar3.f0, tre.d(-1, 186.0f, 80, f2, 0.0f, f2, 0.0f));
                ImageView imageView = new ImageView(activity);
                mkcVar3.J = imageView;
                imageView.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
                mkcVar3.J.setImageResource(2131232050);
                mkcVar3.J.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                hkcVar.addView(mkcVar3.J, tre.e(56, 56, 53));
                iye.a(mkcVar3.J);
                ImageView imageView2 = new ImageView(activity);
                mkcVar3.I = imageView2;
                imageView2.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
                mkcVar3.I.setImageResource(2131232085);
                mkcVar3.I.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                mkcVar3.I.setContentDescription(ob6.M0(2131753749, null));
                hkcVar.addView(mkcVar3.I, tre.e(56, 56, 51));
                iye.a(mkcVar3.I);
                d41 d41Var = new d41(activity, (byte) 5);
                mkcVar3.L = d41Var;
                d41Var.setContentDescription(ob6.M0(2131742891, null));
                mkcVar3.L.setBackground(aob.f0(vm2.o(-1, 76), 1, -1));
                mkcVar3.L.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
                hkcVar.addView(mkcVar3.L, tre.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                mkcVar3.L.setAlpha(0.0f);
                mkcVar3.L.setOnClickListener(new yjc(mkcVar3, (byte) 5));
                mkcVar3.I.setOnClickListener(new yjc(mkcVar3, (byte) 6));
                mkcVar3.J.setOnClickListener(new jjb(mkcVar3, activity, (byte) 13));
                if (mkcVar3.u0.b) {
                    mkcVar3.I.setVisibility(8);
                    mkcVar3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.a = new HashMap();
                linearLayout.b = new ArrayList();
                linearLayout.c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.n = kjcVar;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new i7((byte) 5).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(hl.L(14.0f));
                mkcVar3.M0 = linearLayout;
                linearLayout.setGravity(80);
                mkcVar3.M0.setOnViewsUpdated(new xjc(mkcVar3, (byte) 5));
                hkcVar.addView(mkcVar3.M0, tre.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                ug2 ug2Var = new ug2(activity, 3, kjcVar, true);
                ug2Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                ug2Var.L = alignment;
                ug2Var.d = -1L;
                ug2Var.r0 = new xjc(mkcVar3, (byte) 6);
                ug2Var.U = true;
                ug2Var.h = hl.L(320.0f);
                ug2Var.e = true;
                ug2Var.m(10.0f, 6.0f, 10.0f, 6.0f);
                ug2Var.q(8.0f);
                mkcVar3.N0 = ug2Var;
                ug2Var.t(ob6.M0(2131743907, null));
                hkcVar.addView(mkcVar3.N0, tre.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                ug2 ug2Var2 = new ug2(activity, 1, kjcVar, false);
                ug2Var2.p(true);
                ug2Var2.L = alignment;
                ug2Var2.d = 4000L;
                ug2Var2.U = true;
                ug2Var2.h = hl.L(320.0f);
                ug2Var2.e = true;
                ug2Var2.m(10.0f, 6.0f, 10.0f, 6.0f);
                ug2Var2.q(8.0f);
                mkcVar3.O0 = ug2Var2;
                ug2Var2.t(ob6.M0(2131742954, null));
                hkcVar.addView(mkcVar3.O0, tre.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                mkcVar3.y();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!mkcVar3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        mkcVar3.U0 = z3;
                    }
                    mkcVar3.f();
                }
                fkcVar2.addView(hkcVar);
                if (z) {
                    mkcVar3.F0 = 0.0f;
                    mkcVar3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        mkcVar3.d0.setStub(dlc.d().s);
                        mkcVar3.e0.setStub(dlc.d().r);
                    }
                    mkcVar3.u0.setAlpha(0.0f);
                    mkcVar3.y();
                    mkcVar3.E0 = true;
                    dlc.T = true;
                    if (dlc.V == null) {
                        mkcVar3.L0.d();
                        hl.d3(new xjc(mkcVar3, (byte) 11), 32L);
                    } else {
                        dlc.U.getClass();
                        throw null;
                    }
                } else {
                    mkcVar3.F0 = 1.0f;
                    mkcVar3.x();
                }
                elc.c();
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
        float f9 = dlc.d().d.x + dlc.d().F;
        float f10 = dlc.d().d.y + dlc.d().G;
        final float x = this.Z.getX();
        final float y = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        dlc.U.getClass();
        final float measuredWidth2 = f9 - ((this.d0.getMeasuredWidth() - (this.d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f10 - ((this.d0.getMeasuredHeight() - (this.d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        boolean z4 = this.m0;
        ujc ujcVar = this.Z;
        final float f11 = 0.0f;
        if (z4) {
            int measuredWidth3 = ujcVar.getMeasuredWidth();
            if (this.n0 && measuredWidth3 != 0) {
                f7 = (this.u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c = 0;
                measuredWidth = bp1.v(dlc.d().f, 0.25f, 0.4f, (dlc.d().f * 0.25f) + (f9 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f7)) / 2.0f))) - hl.L(4.0f);
                f8 = bp1.v(dlc.d().h, 0.25f, 0.4f, (dlc.d().h * 0.25f) + (f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f7)) / 2.0f))) - hl.L(4.0f);
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
            measuredWidth = f9 - ((ujcVar.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f10 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f = 0.25f;
            z2 = true;
        }
        final float f13 = measuredWidth;
        if (this.m0) {
            f2 = hl.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        final float L = (hl.L(4.0f) * 1.0f) / f;
        if (this.m0) {
            dlc.U.getClass();
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
            this.d0.setRoundCorners((hl.L(6.0f) * 1.0f) / 0.25f);
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
                mkc mkcVar = mkc.this;
                mkcVar.F0 = f15;
                mkcVar.x();
                if (z2) {
                    float f16 = (f * floatValue) + (scaleX * f15);
                    mkcVar.Z.setScaleX(f16);
                    mkcVar.Z.setScaleY(f16);
                    mkcVar.Z.setTranslationX((f13 * floatValue) + (x * f15));
                    mkcVar.Z.setTranslationY((measuredHeight * floatValue) + (y * f15));
                    mkcVar.Z.setCornerRadius((L * floatValue) + (f2 * f15));
                    mkcVar.Z.setAlpha((f11 * floatValue) + (1.0f * f15));
                }
                float f17 = (f14 * floatValue) + (1.0f * f15);
                mkcVar.d0.setScaleX(f17);
                mkcVar.d0.setScaleY(f17);
                float f18 = 0.0f * f15;
                float f19 = (measuredWidth2 * floatValue) + f18;
                float f20 = (measuredHeight2 * floatValue) + f18;
                mkcVar.d0.setTranslationX(f19);
                mkcVar.d0.setTranslationY(f20);
                mkcVar.d0.setRoundCorners(((hl.L(4.0f) * floatValue) * 1.0f) / f17);
                if (!mkcVar.Z.Q) {
                    mkcVar.e0.d(false, floatValue);
                }
                mkcVar.u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void b() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        jn7.e().n(this, jn7.R4);
        jn7.f(this.a).n(this, jn7.P4);
        jn7.e().n(this, jn7.l4);
        jn7.e().n(this, jn7.E2);
        jn7.e().n(this, jn7.J5);
        sbc sbcVar = this.N;
        if (sbcVar != null) {
            sbcVar.dismiss();
            this.N = null;
        }
    }

    public final void c(boolean z) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z && this.x0) {
            this.C0 = z;
            tmc tmcVar = this.x;
            if (tmcVar.L && z != tmcVar.F) {
                tmcVar.F = z;
                float[] fArr = {1.0f, 0.0f};
                if (z) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                tmcVar.c = ofFloat;
                ofFloat.addUpdateListener(new smc(tmcVar, (byte) 1));
                tmcVar.c.setInterpolator(k43.f);
                tmcVar.c.setDuration(200L);
                tmcVar.c.start();
            }
            if (z) {
                int i = xea.b1;
                if (i < 2) {
                    xea.b1 = i + 2;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", xea.b1);
                    edit.apply();
                }
                this.O0.f(true);
                hl.r(this.S0);
                this.R0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(hl.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(k43.f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(k43.g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(hl.L(140.0f));
                k43 k43Var = k43.f;
                ik8.t(translationY, k43Var, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-hl.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ckc(this, (byte) 3)).setInterpolator(k43Var).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(k43.f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                k43 k43Var2 = k43.f;
                duration.setInterpolator(k43Var2).setListener(new gf4(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(k43Var2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-hl.L(120.0f)).setListener(new ckc(this, (byte) 4)).setDuration(250L).setInterpolator(k43Var2).start();
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
        if (i == jn7.P4) {
            if (this.p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.e0.d.e();
                this.d0.d.e();
                this.c0.e();
                f();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i == jn7.l4) {
            v(true);
        } else if (i == jn7.E2) {
            this.u0.b();
        } else if (i == jn7.R4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i == jn7.J5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e() {
        mkc mkcVar;
        if (this.g1) {
            this.g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.i1 = ofFloat;
            mkcVar = this;
            ofFloat.addUpdateListener(new bt4(mkcVar, this.f1, this.Y0, this.Z0, (byte) 2));
            mkcVar.i1.addListener(new ckc(mkcVar, (byte) 0));
            mkcVar.i1.setDuration(350L);
            mkcVar.i1.setInterpolator(k43.f);
            mkcVar.i1.start();
        } else {
            mkcVar = this;
        }
        mkcVar.h1 = false;
        mkcVar.a1 = false;
    }

    public final void f() {
        this.e0.d.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), new dkc(this));
        this.d0.d.c(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ekc(this), EglBase.CONFIG_PLAIN, new nkc());
        this.c0.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void g() {
        if (!this.G0 && !this.E0) {
            gkc gkcVar = this.o0;
            if (gkcVar != null) {
                gkcVar.a(false, false);
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
                            mkc mkcVar = m1;
                            dlc.f(mkcVar.b, mkcVar.a, mkcVar.u0.getMeasuredWidth(), measuredHeight, 1);
                            WindowInsets windowInsets = m1.r0;
                            if (windowInsets != null) {
                                dlc.W = windowInsets.getSystemWindowInsetTop();
                                m1.r0.getSystemWindowInsetBottom();
                            }
                        }
                        if (dlc.d() != null) {
                            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                            k43 k43Var = k43.f;
                            duration.setInterpolator(k43Var).start();
                            this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                            this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                            this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                            this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(k43Var).start();
                            this.j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                            this.h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                            this.i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                            this.a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                            this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).start();
                            dlc.T = true;
                            this.E0 = true;
                            ValueAnimator a = a(false);
                            this.L0.d();
                            a.addListener(new ckc(this, (byte) 1));
                            a.setDuration(350L);
                            a.setInterpolator(k43Var);
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
            o4 o4Var = this.f0;
            ValueAnimator valueAnimator = o4Var.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                o4Var.c0 = null;
                o4Var.V.stop();
            }
            runnable.run();
            return;
        }
        this.n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f.animate().cancel();
        this.f0.getLocationOnScreen(new int[2]);
        o4 o4Var2 = this.f0;
        ValueAnimator valueAnimator2 = o4Var2.c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            o4Var2.c0 = null;
            o4Var2.V.stop();
        }
        this.n.c(2131230918, -1, -1041108, 1.0f, true, ob6.M0(2131743063, null), false, false);
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
        final int L = hl.L(24.0f);
        final int L2 = hl.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                mkc mkcVar = mkc.this;
                mkcVar.f0.setTranslationY(L2 * floatValue);
                int i = marginEnd;
                int i2 = (int) (i - ((i + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i2;
                marginLayoutParams2.rightMargin = i2;
                mkcVar.f0.requestLayout();
            }
        });
        o4 o4Var3 = this.f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(o4Var3, View.SCALE_X, o4Var3.getScaleX(), 1.0f, 1.0f, 1.0f);
        o4 o4Var4 = this.f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o4Var4, View.SCALE_Y, o4Var4.getScaleY(), 1.0f, 1.0f, 1.0f);
        o4 o4Var5 = this.f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(o4Var5, View.ALPHA, o4Var5.getAlpha(), this.f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new wd8(this, runnable, (byte) 22));
        animatorSet.start();
        hl.d3(new xjc(this, (byte) 7), 133L);
    }

    public final void j(dnc dncVar, VoIPService voIPService) {
        if (!this.n0) {
            dncVar.d(2, false, false);
            dncVar.setOnBtnClickedListener(null);
            dncVar.setEnabled(false);
            return;
        }
        dncVar.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            dncVar.d(2, !voIPService.isSwitchingCamera(), false);
        } else {
            dncVar.d(2, voIPService.isSwitchingCamera(), false);
        }
        dncVar.setOnBtnClickedListener(new o48(this, voIPService, dncVar, (byte) 19));
    }

    public final void k(dnc dncVar, VoIPService voIPService, boolean z) {
        dncVar.d(1, voIPService.isMicMute(), false);
        ujc ujcVar = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        ValueAnimator valueAnimator = ujcVar.g0;
        float f = 0.0f;
        if (!z) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f = 1.0f;
            }
            ujcVar.L = f;
            ujcVar.invalidate();
        } else {
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f2 = ujcVar.L;
            if (isMicMute) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ujcVar.g0 = ofFloat;
            ofFloat.addUpdateListener(ujcVar.h0);
            ujcVar.g0.setDuration(150L);
            ujcVar.g0.start();
        }
        dncVar.setOnBtnClickedListener(new wjc(this, (byte) 4));
    }

    public final void l(final dnc dncVar, final VoIPService voIPService) {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        final int i = 0;
        if (voIPService.isBluetoothOn()) {
            dncVar.d(4, false, false);
            i = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            dncVar.d(5, true, false);
        } else {
            dncVar.d(5, false, false);
            i = 1;
        }
        dncVar.setEnabled(true);
        dncVar.setOnBtnClickedListener(new bnc() {
            @Override
            public final void c(cnc cncVar) {
                if (VoIPService.getSharedInstance() != null) {
                    mkc mkcVar = mkc.this;
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(mkcVar.b, false, Integer.valueOf(i));
                    mkcVar.l(dncVar, voIPService);
                }
            }
        });
    }

    public final void m(dnc dncVar, VoIPService voIPService, boolean z) {
        boolean z2;
        if (!this.n0 && !this.m0) {
            z2 = voIPService.isVideoAvailable();
        } else {
            z2 = true;
        }
        if (z2) {
            if (this.n0) {
                if (voIPService.isScreencast()) {
                    dncVar.d(3, false, z);
                } else {
                    dncVar.d(3, false, z);
                }
            } else {
                dncVar.d(3, true, z);
            }
            dncVar.setOnBtnClickedListener(new wjc(this, (byte) 5));
            dncVar.setEnabled(true);
            return;
        }
        dncVar.d(3, true, false);
        dncVar.setOnClickListener(null);
        dncVar.setEnabled(false);
    }

    public final void o(boolean z, boolean z2) {
        boolean z3;
        int i = 0;
        if (!this.n0 && !this.m0) {
            z3 = true;
        } else {
            z3 = false;
        }
        bo5 bo5Var = this.E;
        Integer num = null;
        if (z) {
            if (z3) {
                if (bo5Var.getTag() == null) {
                    this.E.animate().setListener(null).cancel();
                    this.E.setVisibility(0);
                    if (!this.C0) {
                        bo5 bo5Var2 = this.E;
                        if (z2) {
                            bo5Var2.setAlpha(0.0f);
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                        } else {
                            bo5Var2.setAlpha(0.0f);
                            this.E.setTranslationY(-hl.L(135.0f));
                            this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                        }
                    } else if (z2) {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(hl.L(48.0f));
                        this.E.setScaleX(0.1f);
                        this.E.setScaleY(0.1f);
                    }
                }
            } else if (bo5Var.getTag() != null) {
                this.E.animate().setListener(null).cancel();
                this.E.setTranslationY(0.0f);
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(k43.f).setListener(new ckc(this, (byte) 8)).start();
            }
        } else {
            bo5Var.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            bo5 bo5Var3 = this.E;
            if (!z3) {
                i = 8;
            }
            bo5Var3.setVisibility(i);
        }
        bo5 bo5Var4 = this.E;
        if (z3) {
            num = 1;
        }
        bo5Var4.setTag(num);
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
        elc.c();
        y();
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        wmc wmcVar;
        if (i > 0) {
            this.j1 = true;
        }
        if (this.G != null && (wmcVar = this.w) != null) {
            int i2 = wmcVar.W;
            if ((i2 == 2 || i2 == 3) && this.j1) {
                hl.d3(new me7(this, i, (byte) 26), 400L);
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
        id idVar = new id(0, null, this.b);
        boolean[] zArr = new boolean[3];
        idVar.S = ob6.M0(2131743060, null);
        idVar.U = charSequence;
        idVar.m0 = ob6.M0(2131747558, null);
        idVar.n0 = null;
        idVar.show();
        for (int i = 0; i < 3; i++) {
            if (zArr[i] && (textView = (TextView) idVar.c(-(i + 1))) != null) {
                yob.X(textView, aob.q7, idVar.j1);
            }
        }
        idVar.setCanceledOnTouchOutside(true);
        idVar.setOnDismissListener(new dl8(this, (byte) 14));
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
        ujc ujcVar = this.Z;
        boolean z4 = true;
        if (i == 0) {
            if (z) {
                if (ujcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    ujc ujcVar2 = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(ujcVar2, View.ALPHA, ujcVar2.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        ujc ujcVar3 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ujcVar3, View.SCALE_X, ujcVar3.getScaleX(), 0.7f);
                        ujc ujcVar4 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(ujcVar4, View.SCALE_Y, ujcVar4.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ckc(this, (byte) 7));
                    this.A0.setDuration(250L).setInterpolator(k43.f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                ujcVar.setVisibility(8);
            }
        } else {
            if (ujcVar.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                z2 = z;
            } else {
                z2 = false;
            }
            ujc ujcVar5 = this.Z;
            if (z) {
                if (ujcVar5.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
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
                ujcVar5.setVisibility(0);
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                ujc ujcVar6 = this.Z;
                if (ujcVar6.E < 0.0f) {
                    ujcVar6.d(1.0f, 1.0f);
                    this.b0 = true;
                }
            }
            ujc ujcVar7 = this.Z;
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            ujcVar7.c(z3, z2);
            if (i == 2) {
                z4 = false;
            }
            this.b0 = z4;
        }
        this.Z.setTag(Integer.valueOf(i));
    }

    public final void r(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkc.r(boolean):void");
    }

    public final void s() {
        if (VoIPService.getSharedInstance() != null) {
            xjc xjcVar = this.S0;
            hl.r(xjcVar);
            this.R0 = false;
            if (this.z0 && this.x0) {
                hl.d3(xjcVar, 3000L);
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
                    M0 = ob6.M0(2131754727, null);
                } else {
                    M0 = ob6.M0(2131754728, null);
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
                    gkc gkcVar = new gkc(this, this.s.getContext(), iArr[0], iArr[1]);
                    this.o0 = gkcVar;
                    WindowInsets windowInsets = this.r0;
                    if (windowInsets != null) {
                        gkcVar.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
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
                Transition duration = new i7((byte) 4).setDuration(250L);
                k43 k43Var = k43.f;
                transitionSet.addTransition(duration.setInterpolator(k43Var)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(k43Var));
                transitionSet.excludeChildren(kmc.class, true);
                transitionSet.excludeChildren(dnc.class, true);
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
                this.n.c(2131230918, -1, -1041108, 1.0f, true, ob6.M0(2131743063, null), false, z);
                this.n.setOnClickListener(new yjc(this, (byte) 0));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkc.v(boolean):void");
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
        d41 d41Var = this.L;
        if (i2 != i) {
            hl.L3(d41Var, i);
        } else {
            d41Var.setImageResource(i);
        }
        this.K = i;
    }

    public final void x() {
        this.k0.setColor(vm2.o(-16777216, (int) (this.y0 * 102.0f * this.F0)));
        this.l0.setColor(vm2.o(-16777216, (int) (127.5f * this.F0)));
        hkc hkcVar = this.s;
        if (hkcVar != null) {
            hkcVar.invalidate();
        }
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkc.y():void");
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }
}
