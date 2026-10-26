package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z11;
import org.telegram.ui.LaunchActivity;
public final class sb implements NotificationCenter.NotificationCenterDelegate {
    public static sb F2;
    public final fb A0;
    public View A1;
    public boolean A2;
    public va B0;
    public eg0 B1;
    public boolean B2;
    public s6 C0;
    public final cg0 C1;
    public ab C2;
    public final g7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final dc E0;
    public sf0 E1;
    public ValueAnimator E2;
    public nb F;
    public final ec F0;
    public uf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final dc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final hc J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public w7 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public qa M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final w6 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final ja Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final o2 R0;
    public boolean R1;
    public int S;
    public final o2 S0;
    public boolean S1;
    public int T;
    public final t3 T0;
    public float T1;
    public int U;
    public final t3 U0;
    public int U1;
    public boolean V;
    public final fc1 V0;
    public boolean V1;
    public boolean W;
    public final v3 W0;
    public boolean W1;
    public boolean X;
    public final gb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final cc Z0;
    public AnimatorSet Z1;
    public final di.b f11605a;
    public int f11606a0;
    public final gc f11607a1;
    public boolean a2;
    public final Activity f11608b;
    public int f11609b0;
    public final i6 f11610b1;
    public boolean f11611b2;
    public final int f11612c;
    public final RectF f11613c0;
    public final ib f11614c1;
    public boolean f11615c2;
    public boolean d;
    public final RectF f11616d0;
    public final ia f11617d1;
    public boolean f11618d2;
    public boolean e;
    public final Path f11619e0;
    public final u0 f11620e1;
    public Runnable f11621e2;
    public final WindowManager f11622f;
    public int f11623f0;
    public xj0 f11624f1;
    public AnimatorSet f11625f2;
    public int f11626g0;
    public final ak0 f11627g1;
    public v9 f11628g2;
    public final WindowManager.LayoutParams h;
    public final eb f11629h0;
    public xj0 f11630h1;
    public boolean f11631h2;
    public final FrameLayout f11632i0;
    public ImageView f11633i1;
    public AnimatorSet f11634i2;
    public final LinearLayout f11635j0;
    public final f6 f11636j1;
    public ValueAnimator f11637j2;
    public final FrameLayout f11638k0;
    public final v3 f11639k1;
    public boolean f11640k2;
    public final bh.r f11641l0;
    public final v3 l1;
    public s4.b0 f11642l2;
    public final FrameLayout m0;
    public final v3 f11643m1;
    public MediaController.AlbumEntry f11644m2;
    public final rb f11645n;
    public final o2 f11646n0;
    public final v3 f11647n1;
    public ValueAnimator f11648n2;
    public final p7 f11649o0;
    public final j6 f11650o1;
    public o1.j f11651o2;
    public final org.telegram.ui.ActionBar.b6 f11652p0;
    public final fc f11653p1;
    public Boolean f11654p2;
    public n9 f11655q0;
    public p f11656q1;
    public z9 f11657q2;
    public final kb f11658r;
    public final org.telegram.ui.Components.la f11659r0;
    public cb f11660r1;
    public AnimatorSet f11661r2;
    public final q2 f11662s;
    public final n6 f11663s0;
    public db f11664s1;
    public boolean f11665s2;
    public final bi.cc f11666t0;
    public final cc f11667t1;
    public int f11668t2;
    public boolean f11669u0;
    public final d f11670u1;
    public ArrayList f11671u2;
    public boolean v;
    public long f11672v0;
    public ta f11673v1;
    public FrameLayout f11674v2;
    public long f11675w;
    public String f11676w0;
    public rg.c1 f11677w1;
    public boolean f11678w2;
    public jb f11679x;
    public TLRPC.InputPeer f11680x0;
    public View f11681x1;
    public p9 f11682x2;
    public final ag.b1 f11683y;
    public l9 f11684y0;
    public View f11685y1;
    public ag.r0 f11686y2;
    public t f11687z0;
    public View f11688z1;
    public boolean f11689z2;

    public sb(Activity activity, int i10) {
        ag.b1 b1Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        di.b bVar = new di.b();
        this.f11605a = bVar;
        this.f11675w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f11613c0 = new RectF();
        this.f11616d0 = new RectF();
        this.f11619e0 = new Path();
        new Rect();
        this.f11623f0 = 0;
        this.f11626g0 = -1;
        this.f11684y0 = new l9();
        this.H1 = null;
        this.I1 = null;
        this.J1 = null;
        this.O1 = 0;
        this.P1 = false;
        this.Q1 = false;
        this.R1 = false;
        this.S1 = false;
        this.U1 = -3;
        this.W1 = false;
        ma maVar = new ma(this);
        this.f11618d2 = true;
        this.f11640k2 = true;
        this.f11668t2 = -1;
        this.f11608b = activity;
        this.f11612c = i10;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            b1Var = new ag.b1(launchActivity, true);
        } else {
            b1Var = null;
        }
        this.f11683y = b1Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f11622f = windowManager;
        rb rbVar = new rb(this, activity);
        this.f11645n = rbVar;
        y9 y9Var = new y9(this, 1);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(rbVar, y9Var);
        this.f11645n.setFocusable(true);
        this.f11645n.setImportantForAccessibility(2);
        q2 q2Var = new q2(activity, windowManager, this.f11645n, layoutParams);
        this.f11662s = q2Var;
        q2Var.a(new ya(this));
        this.f11645n.addView(this.f11662s.f11466b, new ViewGroup.LayoutParams(-1, -1));
        rb rbVar2 = this.f11645n;
        kb kbVar = new kb(this, activity);
        this.f11658r = kbVar;
        rbVar2.addView(kbVar);
        kb kbVar2 = this.f11658r;
        eb ebVar = new eb(this, activity);
        this.f11629h0 = ebVar;
        kbVar2.addView(ebVar);
        this.f11658r.addView(this.f11662s.f11467c, new ViewGroup.LayoutParams(-1, -1));
        this.f11659r0 = new org.telegram.ui.Components.la(this.f11629h0);
        this.f11663s0 = new Object();
        kb kbVar3 = this.f11658r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f11632i0 = frameLayout;
        kbVar3.addView(frameLayout);
        kb kbVar4 = this.f11658r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f11638k0 = frameLayout2;
        kbVar4.addView(frameLayout2);
        kb kbVar5 = this.f11658r;
        bh.r rVar = new bh.r(this, activity, 4);
        this.f11641l0 = rVar;
        kbVar5.addView(rVar);
        this.f11641l0.setVisibility(8);
        this.f11641l0.setAlpha(0.0f);
        kb kbVar6 = this.f11658r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        kbVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.f11645n, new k8(2));
        fb fbVar = new fb(this, activity, this.f11659r0, this.f11658r, bVar);
        this.A0 = fbVar;
        rb rbVar3 = this.f11645n;
        Objects.requireNonNull(rbVar3);
        fbVar.setCancelGestures(new di.s8(rbVar3, 27));
        this.A0.setResetState(new p9(this, 13));
        this.f11629h0.addView(this.A0, gb1.i(-1, -1, 119));
        this.A0.setOnClickListener(new r9(this, 12));
        eb ebVar2 = this.f11629h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        ebVar2.setBackgroundColor(i11);
        eb ebVar3 = this.f11629h0;
        ag.v0 v0Var = ag.z0.f1400a;
        ebVar3.setOutlineProvider(new ag.x0(0, AndroidUtilities.dp(12.0f)));
        this.f11629h0.setClipToOutline(true);
        p9 p9Var = new p9(this, 14);
        ?? view = new View(activity);
        view.f27144a = new TextPaint(1);
        view.f27145b = new TextPaint(1);
        ds dsVar = ds.h;
        view.f27150s = new org.telegram.ui.Components.h6((View) view, 0L, 350L, dsVar);
        view.I = new wa0(view, 9);
        view.f27152x = p9Var;
        this.C1 = view;
        gb gbVar = new gb(this, activity, this.f11659r0, this.f11663s0);
        this.X0 = gbVar;
        gbVar.setCollageView(this.A0);
        gb gbVar2 = this.X0;
        gbVar2.v = new p9(this, 15);
        gbVar2.setOnTapListener(new p9(this, 16));
        this.X0.setVisibility(8);
        gb gbVar3 = this.X0;
        gbVar3.N = new p9(this, 17);
        this.f11629h0.addView(gbVar3, gb1.i(-1, -1, 119));
        this.f11629h0.addView(this.C1, gb1.i(-1, -1, 119));
        rb rbVar4 = this.f11645n;
        ib ibVar = new ib(this, activity, rbVar4, rbVar4, this.f11658r, bVar, this.f11659r0);
        this.f11614c1 = ibVar;
        ibVar.setAccount(i10);
        this.f11614c1.setUiBlurBitmap(new y9(this, 6));
        org.telegram.ui.Components.qc.a(this.f11641l0, new bh.c0(this, 4));
        this.f11614c1.setOnHeightUpdate(new q9(this, 13));
        this.f11614c1.setOnPeriodUpdate(new q9(this, 4));
        long j10 = this.N;
        if (j10 != 0) {
            this.f11614c1.setDialogId(j10);
        }
        this.f11614c1.setOnPremiumHint(new q9(this, 5));
        this.f11614c1.setOnKeyboardOpen(new q9(this, 6));
        bi.cc ccVar = new bi.cc(this, activity, 1);
        this.f11666t0 = ccVar;
        this.f11658r.addView(ccVar);
        cc ccVar2 = new cc(activity, this.f11658r, this.f11629h0, bVar, this.f11659r0);
        this.Z0 = ccVar2;
        ccVar2.setOnTimelineClick(new p9(this, 10));
        this.Z0.setOnHeightChange(new p9(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, gb1.h(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gc gcVar = new gc(activity);
        this.f11607a1 = gcVar;
        gcVar.setVisibility(8);
        this.f11607a1.a(false);
        this.Y0.addView(this.f11607a1, gb1.h(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f11641l0.addView(this.Y0, gb1.h(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f11641l0.addView(this.f11614c1, gb1.h(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        cc ccVar3 = new cc(activity, this.f11658r, this.f11629h0, bVar, this.f11659r0);
        this.f11667t1 = ccVar3;
        ccVar3.X0 = true;
        ccVar3.setVisibility(8);
        this.f11667t1.setAlpha(0.0f);
        this.f11641l0.addView(this.f11667t1, gb1.h(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ia iaVar = new ia(this, activity, bVar, this.f11659r0);
        this.f11617d1 = iaVar;
        iaVar.setVisibility(8);
        this.f11641l0.addView(this.f11617d1, gb1.i(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f11646n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        o2 o2Var = this.f11646n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        o2Var.setScaleType(scaleType);
        this.f11646n0.setImageResource(R.drawable.msg_photo_back);
        o2 o2Var2 = this.f11646n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        o2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f11646n0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.f11646n0.setOnClickListener(new r9(this, 1));
        this.f11632i0.addView(this.f11646n0, gb1.i(56, 56, 51));
        this.f11662s.a(this.f11646n0);
        p7 p7Var = new p7(activity, i10);
        this.f11649o0 = p7Var;
        p7Var.a(false, false);
        this.f11649o0.setOnClickListener(new bi.q(16, this, activity));
        this.f11632i0.addView(this.f11649o0, gb1.h(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.f11652p0 = b6Var;
        b6Var.setTextSize(20);
        this.f11652p0.setGravity(19);
        this.f11652p0.setTextColor(-1);
        this.f11652p0.setTypeface(AndroidUtilities.bold());
        this.f11652p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f11652p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f11652p0.setAlpha(0.0f);
        this.f11652p0.setVisibility(8);
        this.f11652p0.setEllipsizeByGradient(true);
        this.f11652p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f11632i0.addView(this.f11652p0, gb1.h(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f11635j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f11635j0.setGravity(5);
        this.f11632i0.addView(this.f11635j0, gb1.h(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        q9 q9Var = new q9(this, 7);
        rb rbVar5 = this.f11645n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f11740w = true;
        imageView2.f11741x = true;
        imageView2.h = q9Var;
        imageView2.f11733a = i10;
        imageView2.f11734b = rbVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.s(imageView2, 21));
        imageView2.f11736f = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f11620e1 = imageView2;
        v3 v3Var = new v3(activity, 1);
        v3Var.l(1.0f, -71.0f);
        v3Var.d = 2000L;
        v3Var.U = false;
        v3Var.H.r(true, false);
        this.f11639k1 = v3Var;
        v3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f11632i0.addView(this.f11639k1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f11627g1 = imageView3;
        imageView3.setScaleType(scaleType);
        ak0 ak0Var = this.f11627g1;
        w7 w7Var = this.K1;
        if (w7Var != null && w7Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        ak0Var.setImageResource(i12);
        this.f11627g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f11627g1.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.f11627g1.setOnClickListener(new r9(this, 2));
        this.f11627g1.setVisibility(8);
        this.f11627g1.setAlpha(0.0f);
        f6 f6Var = new f6(activity);
        this.f11636j1 = f6Var;
        f6Var.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.f11636j1.setVisibility(8);
        this.f11636j1.setAlpha(0.0f);
        this.f11636j1.setOnClickListener(new r9(this, 3));
        this.f11635j0.addView(this.f11636j1, gb1.u(46, 56, 53));
        this.f11635j0.addView(this.f11627g1, gb1.u(46, 56, 53));
        this.f11635j0.addView(this.f11620e1, gb1.i(46, 56, 53));
        dc dcVar = new dc(activity);
        this.E0 = dcVar;
        dcVar.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.E0.setOnClickListener(new r9(this, 4));
        this.E0.setOnLongClickListener(new b5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f11662s.a(this.E0);
        this.f11632i0.addView(this.E0, gb1.i(56, 56, 53));
        ec ecVar = new ec(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = ecVar;
        ecVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new r9(this, 5));
        boolean q5 = c1.q(activity);
        ec ecVar2 = this.F0;
        if (q5) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        ecVar2.setVisibility(i13);
        ec ecVar3 = this.F0;
        if (q5) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ecVar3.setAlpha(f7);
        this.f11662s.a(this.F0);
        this.f11632i0.addView(this.F0, gb1.i(56, 56, 53));
        ?? dcVar2 = new dc(activity);
        this.G0 = dcVar2;
        dcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        if (this.f11687z0 == null) {
            i14 = 6;
            this.f11687z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new r9(this, i14));
        this.G0.a(new u(this.f11687z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f11662s.a(this.G0);
        this.f11632i0.addView(this.G0, gb1.i(56, 56, 53));
        dc dcVar3 = new dc(activity);
        this.H0 = dcVar3;
        dcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new r9(this, 7));
        this.f11662s.a(this.H0);
        this.f11632i0.addView(this.H0, gb1.i(56, 56, 53));
        y yVar = new y(activity, this.f11662s);
        this.I0 = yVar;
        yVar.f11977a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new q9(this, 8));
        this.f11632i0.addView(this.I0, gb1.i(-1, 56, 53));
        v3 v3Var2 = new v3(activity, 1);
        v3Var2.l(1.0f, -20.0f);
        v3Var2.d = 5000L;
        v3Var2.i(true);
        v3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        v3Var2.f11798l0 = new ag.c(16);
        this.l1 = v3Var2;
        v3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f11632i0.addView(this.l1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        v3 v3Var3 = new v3(activity, 2);
        v3Var3.l(0.0f, 28.0f);
        v3Var3.d = 5000L;
        v3Var3.p(true);
        this.f11643m1 = v3Var3;
        this.f11632i0.addView(v3Var3, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        v3 v3Var4 = new v3(activity, 1);
        v3Var4.l(1.0f, -20.0f);
        v3Var4.d = 5000L;
        v3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f11647n1 = v3Var4;
        v3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f11632i0.addView(this.f11647n1, gb1.h(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f10972a = paint;
        Paint paint2 = new Paint(1);
        view2.f10973b = paint2;
        view2.e = new org.telegram.ui.Components.h6((View) view2, 0L, 250L, dsVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        view2.f10974c = r6Var;
        r6Var.n(0.3f, 250L, dsVar);
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.u(-1);
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(view2);
        r6Var.f32121b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        h0(false, false);
        this.f11632i0.addView(this.J0, gb1.h(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f11662s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        w6 w6Var = new w6(activity);
        this.O0 = w6Var;
        w6Var.setDelegate(maVar);
        w6 w6Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        w6Var2.f11870n0 = -1.0f;
        w6Var2.f11871o0 = z10;
        w6Var2.invalidate();
        this.f11638k0.addView(this.O0, gb1.i(-1, 100, 87));
        this.f11662s.a(this.O0);
        w6 w6Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        w6Var3.e(f10, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.i(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f11638k0.addView(this.P0, gb1.h(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new r9(this, 8));
        v3 v3Var5 = new v3(activity, 3);
        v3Var5.p(true);
        v3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        v3Var5.h = AndroidUtilities.dp(320.0f);
        v3Var5.d = 5000L;
        v3Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = v3Var5;
        this.f11638k0.addView(v3Var5, gb1.h(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        fc1 fc1Var = new fc1(activity);
        this.V0 = fc1Var;
        fc1Var.M = false;
        fc1Var.setAlpha(0.0f);
        this.f11638k0.addView(this.V0, gb1.h(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new y9(this, 4));
        fc1 fc1Var2 = this.V0;
        this.T1 = 0.0f;
        fc1Var2.b(0.0f, false);
        g7 g7Var = new g7(activity, i10, new p9(this, 12));
        this.D0 = g7Var;
        g7Var.f10910c = new q9(this, 9);
        this.f11638k0.addView(g7Var, gb1.h(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        ja jaVar = new ja(this, activity);
        this.Q0 = jaVar;
        jaVar.setOnSwitchModeListener(new q9(this, 10));
        this.Q0.setOnSwitchingModeListener(new q9(this, 11));
        this.m0.addView(this.Q0, gb1.i(-1, 48, 55));
        this.f11662s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.m0.addView(this.R0, gb1.h(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f11662s.a(this.R0);
        this.R0.setOnClickListener(new r9(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        this.m0.addView(this.S0, gb1.h(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f11662s.a(this.S0);
        this.S0.setOnClickListener(new r9(this, 10));
        t3 t3Var = new t3(activity);
        this.T0 = t3Var;
        this.m0.addView(t3Var, gb1.h(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f11662s.a(this.T0);
        t3 t3Var2 = new t3(activity);
        this.U0 = t3Var2;
        t3Var2.f11704a.t(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        t3Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, gb1.h(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f11662s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f11670u1 = dVar2;
        dVar2.setVisibility(8);
        this.f11670u1.setAlpha(0.0f);
        this.f11670u1.i(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f11670u1.setOnClickListener(new r9(this, 11));
        this.m0.addView(this.f11670u1, gb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f10998b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f10997a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, gb1.i(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        h6 h6Var = new h6(frameLayout5, activity, string, true);
        frameLayout5.f10999c = h6Var;
        h6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f10999c, gb1.g(-2.0f, -2));
        frameLayout5.e();
        this.f11610b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f11610b1.setOnClickListener(new q9(this, 12));
        this.m0.addView(this.f11610b1, gb1.i(-1, 52, 23));
        fc fcVar = new fc(activity);
        this.f11653p1 = fcVar;
        fcVar.setAlpha(0.0f);
        this.f11653p1.setVisibility(8);
        this.f11629h0.addView(this.f11653p1, gb1.h(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        j6 j6Var = new j6(activity, i10, bVar);
        this.f11650o1 = j6Var;
        this.f11629h0.addView(j6Var, gb1.i(-1, -1, 119));
        l0(false);
    }

    public static sb D(Activity activity, int i10) {
        sb sbVar = F2;
        if (sbVar != null && (sbVar.f11608b != activity || sbVar.f11612c != i10)) {
            sbVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new sb(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(sb sbVar) {
        va vaVar = sbVar.B0;
        boolean z10 = false;
        if (vaVar != null && vaVar.getTextureView() != null) {
            Bitmap bitmap = sbVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                sbVar.f11615c2 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f7 = 0.0f;
            for (int i10 = 0; i10 < 10; i10++) {
                int i11 = 0;
                while (i11 < 10) {
                    i11++;
                    f7 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
                }
            }
            bitmap.recycle();
            if (f7 / 100.0f < 0.22f) {
                z10 = true;
            }
            sbVar.f11615c2 = z10;
            return;
        }
        sbVar.f11615c2 = false;
    }

    public static void b(sb sbVar) {
        ValueAnimator valueAnimator = sbVar.f11637j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sbVar.f11637j2 = null;
        }
        sbVar.f11640k2 = false;
        kb kbVar = sbVar.f11658r;
        float f7 = kbVar.f11135a;
        float f10 = kbVar.f11136b;
        kbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        sbVar.f11637j2 = ofFloat;
        ofFloat.addUpdateListener(new fa(sbVar, f7, f10, 0));
        sbVar.f11637j2.setDuration(340L);
        sbVar.f11637j2.setInterpolator(ds.h);
        sbVar.f11637j2.addListener(new pa(sbVar, 0));
        sbVar.f11637j2.start();
    }

    public static boolean c(sb sbVar) {
        Activity activity = sbVar.f11608b;
        if (activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString m(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new za(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        sb sbVar = F2;
        if (sbVar != null) {
            sbVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        w7 w7Var = this.K1;
        if (w7Var != null) {
            return w7Var.r();
        }
        return 1;
    }

    public final String B() {
        va vaVar = this.B0;
        if (vaVar != null && vaVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f11671u2.get(this.f11668t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 C() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f11608b);
            this.N0 = v0Var;
            this.f11638k0.addView(v0Var, gb1.h(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        int i10;
        va vaVar = this.B0;
        if (vaVar != null && vaVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f11671u2;
                if (this.f11668t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f11668t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f11633i1 == null) {
            xj0 xj0Var = new xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f11630h1 = xj0Var;
            xj0Var.h = true;
            w7 w7Var = this.K1;
            if (w7Var != null && w7Var.f11937y0) {
                xj0Var.M(35);
                this.f11630h1.P(36);
            } else {
                xj0Var.P(0);
                this.f11630h1.M(0);
            }
            this.f11630h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J9, this.f11605a);
            this.f11630h1.Q(w02, "Sunny");
            this.f11630h1.Q(w02, "Path 6");
            this.f11630h1.Q(w02, "Path");
            this.f11630h1.Q(w02, "Path 5");
            this.f11630h1.o();
            ImageView imageView = new ImageView(this.f11608b);
            this.f11633i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f11633i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f11633i1.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
            this.f11633i1.setOnClickListener(new r9(this, 0));
            this.f11633i1.setVisibility(8);
            this.f11633i1.setImageDrawable(this.f11630h1);
            this.f11633i1.setAlpha(0.0f);
            this.f11635j0.addView(this.f11633i1, 0, gb1.u(46, 56, 53));
        }
        return this.f11633i1;
    }

    public final void G() {
        ta taVar = this.f11673v1;
        if (taVar == null) {
            return;
        }
        this.f11674v2 = null;
        taVar.getTopLayout().setAlpha(0.0f);
        this.f11673v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f11673v1.getBottomLayout().setAlpha(0.0f);
        this.f11673v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f11673v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f11673v1.setVisibility(8);
    }

    public final boolean H() {
        float f7;
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        if (!this.a2 && f7 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        qa qaVar;
        if (!this.W && (qaVar = this.M0) != null) {
            if (qaVar.getTranslationY() < (this.f11645n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: fi.sb.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j10) {
        if (!this.S1 && this.K1 != null) {
            v9 v9Var = this.f11628g2;
            if (v9Var != null) {
                AndroidUtilities.cancelRunOnUIThread(v9Var);
            }
            this.f11631h2 = true;
            this.S1 = true;
            this.f11628g2 = new v9(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f11628g2, j10);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f11628g2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: fi.sb.L():boolean");
    }

    public final void M(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (i10 == 0) {
            u(false);
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            g(false, false);
            c0(false);
        }
        if (i10 == 2) {
            this.f11667t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f11641l0.setVisibility(i17);
            this.f11614c1.setVisibility(8);
            this.f11670u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f11610b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f11641l0.setVisibility(i14);
            this.f11627g1.setVisibility(8);
            this.f11636j1.setVisibility(8);
            this.f11620e1.setVisibility(8);
            ImageView imageView = this.f11633i1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.X0.setVisibility(i15);
            this.Z0.setVisibility(8);
            if (i11 != 2) {
                y();
                x();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f11652p0.setVisibility(i16);
            v();
            this.f11653p1.setAlpha(0.0f);
            this.f11653p1.setVisibility(8);
            this.f11607a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            w7 w7Var = this.K1;
            if (w7Var == null || !w7Var.f11915n) {
                t();
                G();
            }
            cg0 cg0Var = this.C1;
            if (cg0Var != null) {
                cg0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            w7 w7Var2 = this.K1;
            if (w7Var2 != null && w7Var2.f11905h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f11607a1.setVisibility(i13);
            this.f11641l0.setAlpha(1.0f);
            this.f11641l0.setTranslationY(0.0f);
            w7 w7Var3 = this.K1;
            if (w7Var3 == null || w7Var3.J0 == 0) {
                i18 = 0;
            }
            this.f11614c1.setVisibility(i18);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            v0 C = C();
            C.f11779r.d(0.0f, true);
            C.a(true);
            di.s8 s8Var = C.h;
            if (s8Var != null) {
                AndroidUtilities.cancelRunOnUIThread(s8Var);
            }
            di.s8 s8Var2 = new di.s8(C, 13);
            C.h = s8Var2;
            AndroidUtilities.runOnUIThread(s8Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        cg0 cg0Var2 = this.C1;
        if (cg0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f11626g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            cg0Var2.setAllowTouch(z11);
        }
        ib ibVar = this.f11614c1;
        if (ibVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            ibVar.f11198e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f11612c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            di.h7 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void N(int i10, int i11) {
        w7 w7Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        w7 w7Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        w7 w7Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        p9 p9Var;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        w7 w7Var4;
        int i17;
        w7 w7Var5;
        w7 w7Var6;
        w7 w7Var7;
        h81 textureView;
        w7 w7Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Y(false);
            this.O0.setVisibility(0);
            w6 w6Var = this.O0;
            if (w6Var != null) {
                w6Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            w7 w7Var9 = this.K1;
            if (w7Var9 != null) {
                w7Var9.i(false);
                this.K1 = null;
            }
            fb fbVar = this.A0;
            if (fbVar != null) {
                fbVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            d0(null);
            a0(new p9(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            v3 v3Var = this.l1;
            if (v3Var != null) {
                v3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f11612c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                w7Var = this.K1;
            } else {
                w7Var = null;
            }
            this.f11620e1.setEntry(w7Var);
            if (this.O1 == 1) {
                this.f11627g1.setVisibility(0);
                w7 w7Var10 = this.K1;
                if (w7Var10 != null && w7Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                e0(z13, false);
                this.f11636j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((dh0) this.f11636j1.f10865c).a(this.X0.k(), false);
                this.f11652p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                w7 w7Var11 = this.K1;
                if (w7Var11 != null && !TextUtils.isEmpty(w7Var11.f11936y)) {
                    this.f11627g1.setVisibility(8);
                    this.f11636j1.setVisibility(0);
                    ((dh0) this.f11636j1.f10865c).a(true, false);
                    this.f11652p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f11652p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f11620e1.setVisibility(0);
            w7 w7Var12 = this.K1;
            if (w7Var12 != null && w7Var12.f11929u) {
                F().setVisibility(0);
                n0(false);
            } else {
                ImageView imageView = this.f11633i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f11610b1.setVisibility(0);
            this.X0.setVisibility(0);
            w7 w7Var13 = this.K1;
            if ((w7Var13 != null && w7Var13.J0 != 0) || this.f11672v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f11614c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            w7 w7Var14 = this.K1;
            if ((w7Var14 != null && w7Var14.J0 != 0) || this.f11672v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f11641l0.setVisibility(0);
            this.f11641l0.clearFocus();
            w7 w7Var15 = this.K1;
            if (w7Var15 == null) {
                i13 = 86400;
            } else {
                i13 = w7Var15.I0;
            }
            this.f11614c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((w7Var2 = this.K1) == null || !w7Var2.f11903g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f11614c1.setPeriodVisible(z10);
            w7 w7Var16 = this.K1;
            if (w7Var16 != null && w7Var16.f11918o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f11614c1.setHasRoundVideo(z11);
            ib ibVar = this.f11614c1;
            if (ibVar == null) {
                j10 = 0;
            } else {
                w7 w7Var17 = this.K1;
                if (w7Var17 == null || !w7Var17.f11915n) {
                    j10 = 0;
                    ibVar.v(null, null);
                } else {
                    TLRPC.Peer peer = w7Var17.f11921q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        w7 w7Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        w7Var18.f11919p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        w7 w7Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        w7Var19.f11919p = append;
                    }
                    String str3 = this.K1.f11925s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f11614c1.v(append, str4);
                }
            }
            w7 w7Var20 = this.K1;
            if (w7Var20 != null && w7Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            cc ccVar = this.Z0;
            boolean z22 = ccVar.f10644j0;
            ccVar.f10644j0 = z12;
            ccVar.f10642i0.f(z12, true);
            ccVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f11652p0.setVisibility(0);
            this.f11667t1.setVisibility(0);
            w7 w7Var21 = this.K1;
            if (w7Var21 != null && w7Var21.f11892b0) {
                this.f11652p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f11641l0.setVisibility(0);
            this.f11670u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f11652p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            w7 w7Var22 = this.K1;
            if (w7Var22 != null && w7Var22.J0 != j10) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (w7Var22 != null && w7Var22.f11903g) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                i14 = R.string.Done;
            } else if (z16) {
                i14 = R.string.UploadBotPreview;
            } else {
                i14 = R.string.Next;
            }
            String string = LocaleController.getString(i14);
            boolean z23 = !z16;
            i6 i6Var = this.f11610b1;
            if (!TextUtils.equals(string, i6Var.d) || z23 != i6Var.e) {
                i6Var.removeView(i6Var.f10999c);
                Context context = i6Var.getContext();
                i6Var.d = string;
                i6Var.e = z23;
                h6 h6Var = new h6(i6Var, context, string, z23);
                i6Var.f10999c = h6Var;
                h6Var.setContentDescription(string);
                i6Var.addView(i6Var.f10999c, gb1.g(-2.0f, -2));
                i6Var.e();
            }
            this.f11667t1.setVisibility(8);
            this.f11670u1.setVisibility(8);
            if (!this.f11631h2) {
                w7 w7Var23 = this.K1;
                if (w7Var23 != null && w7Var23.f11929u) {
                    this.X0.l(w7Var23);
                } else {
                    this.X0.set(w7Var23);
                }
            }
            this.f11631h2 = false;
            ju editText = this.f11614c1.f11199f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                p9Var = null;
            } else {
                p9Var = new p9(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(p9Var);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f11617d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                ia iaVar = this.f11617d1;
                iaVar.c(false, false);
                iaVar.f11108c = arrayList;
                iaVar.d = arrayList2;
                iaVar.e = arrayList3;
                iaVar.f11113w = new q11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                iaVar.K = new q11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                iaVar.f11107b.f32152g3.O(false);
                this.f11617d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((w7Var8 = this.K1) == null || (!w7Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                w7 w7Var24 = this.K1;
                if (w7Var24 != null && (w7Var24.f11894c || w7Var24.f11903g || this.f11669u0)) {
                    if (w7Var24.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    w7 w7Var25 = this.K1;
                    if (w7Var25.K && w7Var25.f11890a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new y9(this, 7));
                    }
                    this.f11614c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ib ibVar2 = this.f11614c1;
                    ibVar2.V = true;
                    ibVar2.f11199f.setText("");
                }
            }
            w7 w7Var26 = this.K1;
            if (w7Var26 != null && ((w7Var26.f11929u && !w7Var26.K) || w7Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f11610b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (w7Var7 = this.K1) != null && !w7Var7.f11929u && !w7Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f11610b1.d(3, z19);
            if (!this.N1 && !this.f11614c1.o()) {
                di.h7 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int A = A();
                di.b7 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f8630a, A) || ((w7Var6 = this.K1) != null && (w7Var6.f11903g || w7Var6.J0 != j10))) {
                    z20 = true;
                    this.f11610b1.setShareEnabled(z20);
                    w7Var4 = this.K1;
                    if (w7Var4 == null && w7Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f11627g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f11652p0.setVisibility(0);
                    this.f11652p0.setTranslationX(0.0f);
                    w7Var5 = this.K1;
                    if (w7Var5 == null && w7Var5.J0 != j10) {
                        this.f11652p0.l("", false);
                    } else if (w7Var5 == null && w7Var5.f11903g) {
                        this.f11652p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (w7Var5 == null && w7Var5.f11929u) {
                        this.f11652p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (w7Var5 == null && w7Var5.f11915n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(this.f11652p0, 32.0f, i18);
                        this.f11652p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(j5Var, 0, 1, 33);
                        if (this.K1.f11921q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f11921q.user_id));
                            j5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f11921q)));
                            j5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f11652p0.l(spannableStringBuilder, false);
                    } else {
                        this.f11652p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f11610b1.setShareEnabled(z20);
            w7Var4 = this.K1;
            if (w7Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f11627g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f11652p0.setVisibility(0);
            this.f11652p0.setTranslationX(0.0f);
            w7Var5 = this.K1;
            if (w7Var5 == null) {
            }
            if (w7Var5 == null) {
            }
            if (w7Var5 == null) {
            }
            if (w7Var5 == null) {
            }
            this.f11652p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            ib ibVar3 = this.f11614c1;
            k80 k80Var = ibVar3.V0;
            if (k80Var != null) {
                k80Var.u();
                ibVar3.V0 = null;
            }
            this.f11639k1.e(z21);
            ia iaVar2 = this.f11617d1;
            if (iaVar2.M) {
                iaVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (w7Var3 = this.K1) != null) {
            if (w7Var3.f11899e0 < j10) {
                w7Var3.f11899e0 = j10;
            }
            this.M1 = w7Var3.f11899e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f11905h0;
            } else {
                duration = this.X0.getDuration();
            }
            w7 w7Var27 = this.K1;
            if (w7Var27.f11905h0 <= 0) {
                w7Var27.f11905h0 = duration;
            }
            File file = w7Var27.Z0;
            if (file == null) {
                file = w7Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            w7 w7Var28 = this.K1;
            this.f11667t1.o(false, absolutePath, w7Var28.f11905h0, w7Var28.P);
            w7 w7Var29 = this.K1;
            float f10 = (float) duration;
            long j11 = w7Var29.Z * f10;
            long j12 = w7Var29.f11889a0 * f10;
            cc ccVar2 = this.f11667t1;
            ccVar2.Z0 = j11;
            ccVar2.f10624a1 = j12;
            xb xbVar = ccVar2.h;
            if (xbVar != null) {
                xb.a(xbVar, true);
            }
            ai.e eVar = new ai.e(this, 22);
            this.f11667t1.setDelegate(new ra(eVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f11667t1.setVideoLeft(max);
            this.f11667t1.setVideoRight(0.04f + max);
            eVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            cg0Var.setAllowTouch(false);
        }
        v3 v3Var2 = this.f11643m1;
        boolean z24 = true;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        ib ibVar4 = this.f11614c1;
        if (ibVar4 != null) {
            g gVar = ibVar4.f11199f;
            gVar.d();
            gVar.k(true);
            this.f11614c1.f11198e0 = true;
        }
        gb gbVar = this.X0;
        if (gbVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            gbVar.x(8, z15);
        }
        ta taVar = this.f11673v1;
        if (taVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            taVar.setCoverPreview(z14);
        }
        v3 v3Var3 = this.f11647n1;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        fb fbVar2 = this.A0;
        if (i11 != 1 || !fbVar2.j()) {
            z24 = false;
        }
        fbVar2.setPreview(z24);
    }

    public final void O() {
        rg.a1 a1Var;
        int i10;
        if (this.f11623f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11682x2 = new p9(this, 3);
            } else {
                Y(false);
            }
        }
        ib ibVar = this.f11614c1;
        if (ibVar != null) {
            ibVar.f11199f.s();
        }
        w6 w6Var = this.O0;
        if (w6Var != null) {
            w6Var.h();
        }
        j6 j6Var = this.f11650o1;
        if (j6Var != null) {
            di.h7 storiesController = MessagesController.getInstance(j6Var.f11057a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f8635i.f(UserConfig.getInstance(storiesController.f8630a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            j6Var.f11058b = storiesController.f8631b.m() + i10 + 1;
            j6Var.f11059c.invalidate();
        }
        ta taVar = this.f11673v1;
        if (taVar != null && (a1Var = taVar.D0.d) != null) {
            a1Var.postRunnable(a1Var.f47366w);
        }
        gb gbVar = this.X0;
        if (gbVar != null) {
            gbVar.x(0, false);
        }
        a1 a1Var2 = MessagesController.getInstance(this.f11612c).getStoriesController().f8648w;
        if (!a1Var2.f10499c && !a1Var2.d) {
            a1Var2.d = true;
            x0 x0Var = new x0(a1Var2, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var2.f10497a);
            messagesStorage.getStorageQueue().postRunnable(new bi.u7((Object) messagesStorage, false, (Object) x0Var, 3));
        }
    }

    public final void P(int i10, int i11) {
        boolean z10;
        ta taVar;
        cb cbVar;
        db dbVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ta taVar2;
        if (i11 == 0) {
            this.f11646n0.setVisibility(8);
        }
        if (i10 == 0 && (taVar2 = this.f11673v1) != null) {
            taVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f11614c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f11627g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f11636j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f11620e1.setVisibility(i14);
            ImageView imageView = this.f11633i1;
            if (imageView != null) {
                if (i11 == 2) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                imageView.setVisibility(i16);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.Z0.setVisibility(i15);
            this.f11652p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (taVar = this.f11673v1) != null) {
            taVar.S0.setLayerType(0, null);
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            cg0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            cb cbVar2 = this.f11660r1;
            if (cbVar2 != null) {
                cbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (cbVar = this.f11660r1) != null) {
            cbVar.setVisibility(8);
            this.f11660r1.setAppearProgress(0.0f);
            cb cbVar3 = this.f11660r1;
            cbVar3.f11032x = null;
            g0 g0Var = cbVar3.f11027f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            cbVar3.d.setVisibility(8);
            cbVar3.f11024a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            db dbVar2 = this.f11664s1;
            if (dbVar2 != null) {
                dbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (dbVar = this.f11664s1) != null) {
            dbVar.setVisibility(8);
            this.f11664s1.setAppearProgress(0.0f);
            db dbVar3 = this.f11664s1;
            dbVar3.f11227b = null;
            g0 g0Var2 = dbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            dbVar3.e.setVisibility(8);
            dbVar3.setVisibility(8);
        }
    }

    public final void Q(mb mbVar) {
        di.b7 o10;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f11612c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f11669u0 = false;
        this.e = false;
        this.B2 = false;
        this.f11663s0.f11306g = false;
        WindowManager windowManager = this.f11622f;
        if (windowManager != null && (rbVar = this.f11645n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f11645n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f11645n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.f11672v0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (mbVar != null) {
            this.F = mbVar;
            this.J = mbVar.f11322a;
            rectF.set(mbVar.f11324c);
            this.G = mbVar.f11323b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f11658r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f11629h0.setBackgroundColor(i11);
        this.f11658r.setTranslationX(0.0f);
        this.f11658r.setTranslationY(0.0f);
        this.f11658r.b(0.0f);
        this.f11658r.setScaleX(1.0f);
        this.f11658r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f11608b, 1);
        f(1.0f, true, new p9(this, 6));
        d();
        this.f11672v0 = 0L;
        this.f11676w0 = "";
    }

    public final void R(lb lbVar, w7 w7Var, long j10) {
        int i10;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i11 = this.f11612c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f11669u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f11622f;
        if (windowManager != null && (rbVar = this.f11645n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f11645n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f11645n, layoutParams);
            f0();
        }
        this.K1 = w7Var;
        this.O1 = w7Var.K ? 1 : 0;
        this.f11663s0.f11306g = false;
        RectF rectF = this.H;
        if (lbVar != null) {
            this.F = lbVar;
            this.J = lbVar.f11322a;
            rectF.set(lbVar.f11324c);
            this.G = lbVar.f11323b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f11658r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f11629h0.setBackgroundColor(i10);
        this.f11658r.setTranslationX(0.0f);
        this.f11658r.setTranslationY(0.0f);
        this.f11658r.b(0.0f);
        this.f11658r.setScaleX(1.0f);
        this.f11658r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f11608b, 1);
        w7 w7Var2 = this.K1;
        if (w7Var2 != null) {
            this.f11614c1.setText(w7Var2.C0);
        }
        K(new ha(this, 0), j10);
        if (this.K1.f11892b0) {
            i13 = 2;
        }
        J(i13, false);
        k0(-1, false, false);
        this.f11610b1.b(false, false);
        d();
        this.f11672v0 = 0L;
        this.f11676w0 = "";
    }

    public final void S() {
        k80 k80Var;
        gb gbVar = this.X0;
        if (gbVar != null) {
            gbVar.x(4, true);
        }
        ib ibVar = this.f11614c1;
        if (ibVar != null && (k80Var = ibVar.V0) != null) {
            k80Var.u();
            ibVar.V0 = null;
        }
        tg.y0 y0Var = new tg.y0((org.telegram.ui.ActionBar.r2) new wa(this, 1), 14, false);
        y0Var.setOnDismissListener(new da(this, 1));
        y0Var.show();
    }

    public final void T(lb lbVar, w7 w7Var) {
        int i10;
        boolean z10;
        int i11;
        di.b7 o10;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i12 = this.f11612c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f11669u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f11622f;
        if (windowManager != null && (rbVar = this.f11645n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f11645n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f11645n, layoutParams);
            f0();
        }
        this.K1 = w7Var;
        o9.a(i12, w7Var);
        w7 w7Var2 = this.K1;
        if (w7Var2 != null && w7Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (w7Var2 != null && w7Var2.f11929u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11663s0.f11306g = z10;
        if (this.f11672v0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (lbVar != null) {
            this.F = lbVar;
            this.J = lbVar.f11322a;
            rectF.set(lbVar.f11324c);
            this.G = lbVar.f11323b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f11658r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f11629h0.setBackgroundColor(i11);
        this.f11658r.setTranslationX(0.0f);
        this.f11658r.setTranslationY(0.0f);
        this.f11658r.b(0.0f);
        this.f11658r.setScaleX(1.0f);
        this.f11658r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f11608b, 1);
        w7 w7Var3 = this.K1;
        if (w7Var3 != null) {
            this.f11614c1.setText(w7Var3.C0);
        }
        this.f11610b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new p9(this, 6));
        d();
        this.f11672v0 = 0L;
        this.f11676w0 = "";
    }

    public final void U() {
        rg.c1 c1Var = this.f11677w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f11681x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f11685y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f11688z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        fc fcVar = this.f11653p1;
        if (fcVar != null) {
            fcVar.bringToFront();
        }
        cg0 cg0Var = this.C1;
        if (cg0Var != null) {
            cg0Var.bringToFront();
        }
        sf0 sf0Var = this.E1;
        if (sf0Var != null) {
            sf0Var.bringToFront();
        }
        uf0 uf0Var = this.F1;
        if (uf0Var != null) {
            uf0Var.bringToFront();
        }
        j6 j6Var = this.f11650o1;
        if (j6Var != null) {
            j6Var.bringToFront();
        }
        p pVar = this.f11656q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(w7 w7Var, boolean z10) {
        File file;
        View view;
        float f7;
        w7 w7Var2;
        boolean z11;
        int i10;
        if (w7Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = w7Var.O0;
            } else {
                file = w7Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.A0.j()) {
                view = this.A0;
            } else {
                view = this.X0;
            }
            if (z10) {
                f7 = 0.33333334f;
            } else {
                f7 = 1.0f;
            }
            int width = (int) (view.getWidth() * f7);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f7), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f7, f7);
            AndroidUtilities.makingGlobalBlurBitmap = true;
            view.draw(canvas);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            canvas.restore();
            Paint paint = new Paint(2);
            h81 textureView = this.X0.getTextureView();
            if (w7Var.K && !w7Var.f11929u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f7, f7);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = w7Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file3 = w7Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            ta taVar = this.f11673v1;
            if (taVar != null && taVar.G0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                ta taVar2 = this.f11673v1;
                taVar2.f10822x0 = true;
                y5 y5Var = taVar2.G0;
                y5Var.f48175a = true;
                y5Var.draw(canvas);
                ta taVar3 = this.f11673v1;
                taVar3.G0.f48175a = false;
                taVar3.f10822x0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = w7.w(this.f11612c, "jpg");
            if (z10) {
                w7Var2 = w7Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new r1(this, createBitmap, z11, w10, w7Var2, 1));
            } else {
                w7Var2 = w7Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (!z11) {
                w7Var2.N0 = w10;
            }
            w7Var2.f11893b1 = createScaledBitmap;
        }
    }

    public final void W() {
        di.b7 o10;
        int size;
        char c10;
        View[] viewPages;
        a71[] a71VarArr;
        n9 n9Var = this.f11655q0;
        BitmapDrawable bitmapDrawable = null;
        if (n9Var != null) {
            n9Var.dismiss();
            this.f11655q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f11620e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            h6 h6Var = this.f11610b1.f10999c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(h6Var, i10);
            return;
        }
        ib ibVar = this.f11614c1;
        if (ibVar != null && ibVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.s6 s6Var = ibVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            ibVar.e();
            return;
        }
        w7 w7Var = this.K1;
        int i12 = this.f11612c;
        if ((w7Var == null || (!w7Var.f11903g && w7Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        di.b bVar = this.f11605a;
        char c11 = 1;
        if (ibVar != null && !this.K1.D0) {
            CharSequence text = ibVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((z11[]) spannable.getSpans(0, text.length(), z11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new wc(this.f11645n, bVar).R(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.y6.gc, 0, new p9(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(ibVar, i13);
                    return;
                }
            }
        }
        w7 w7Var2 = this.K1;
        if (!w7Var2.f11903g && w7Var2.J0 == 0) {
            if (this.N != 0) {
                w7Var2.f11931v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            gb gbVar = this.X0;
            gbVar.x(3, true);
            n9 n9Var2 = new n9(this.f11608b, this.K1.I0, bVar);
            n9Var2.r1(this.K1.E0);
            n9Var2.q1(this.K1.f11931v0);
            n9Var2.F = this.M;
            n9Var2.U = new q9(this, 14);
            n9Var2.f1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            n9Var2.n1(size);
            n9Var2.l1(false);
            CharSequence text2 = ibVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (a71 a71Var : (a71[]) ((Spanned) text2).getSpans(0, text2.length(), a71.class)) {
                    if (a71Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(a71Var.getURL())));
                            if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                                arrayList2.add(UserObject.getPublicUsername(user));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i14 = 0;
                int i15 = -1;
                while (i14 < text2.length()) {
                    char charAt = text2.charAt(i14);
                    char c12 = c11;
                    if (charAt == '@') {
                        i15 = i14 + 1;
                    } else if (charAt == ' ') {
                        if (i15 != -1) {
                            String charSequence = text2.subSequence(i15, i14).toString();
                            TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f22176id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i15 = -1;
                    }
                    i14++;
                    c11 = c12;
                }
                c10 = c11;
                if (i15 != -1) {
                    String charSequence2 = text2.subSequence(i15, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f22176id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            n9Var2.S = arrayList2;
            n9Var2.W = new q9(this, 15);
            n9Var2.X = new q9(this, 16);
            n9Var2.T = new y9(this, 10);
            this.f11655q0 = n9Var2;
            w7 w7Var3 = this.K1;
            if (w7Var3.K) {
                if (gbVar != null && !w7Var3.f11902f0 && this.f11623f0 != 2) {
                    w7Var3.f11899e0 = gbVar.getCurrentPosition();
                    Utilities.Callback q9Var = new q9(this, 17);
                    View view = this.f11677w1;
                    View view2 = this.f11688z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = gbVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    gbVar.h(q9Var, viewArr);
                }
                n9 n9Var3 = this.f11655q0;
                Bitmap bitmap = this.K1.f11904g0;
                p9 p9Var = new p9(this, 20);
                if (bitmap != null) {
                    n9Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                n9Var3.f11312b0 = bitmapDrawable;
                n9Var3.f11314c0 = p9Var;
                h1 h1Var = n9Var3.f11311b;
                if (h1Var != null) {
                    for (View view3 : h1Var.getViewPages()) {
                        if (view3 instanceof g9) {
                            g9 g9Var = (g9) view3;
                            g9Var.g(false);
                            g9Var.e(false);
                        }
                    }
                }
            }
            this.f11655q0.setOnDismissListener(new da(this, 0));
            this.f11655q0.show();
            return;
        }
        w7Var2.f11912l = false;
        h(null);
        o0();
    }

    public final void X(nb nbVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (nbVar != null) {
            this.F = nbVar;
            this.J = nbVar.f11322a;
            rectF.set(nbVar.f11324c);
            this.G = nbVar.f11323b;
        } else {
            this.F = null;
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.J;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f11629h0.setBackgroundColor(i10);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f11678w2 || z10) {
            this.f11665s2 = false;
            Activity activity = this.f11608b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f11665s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    ar arVar = new ar(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    arVar.e = dp;
                    arVar.f26595f = dp2;
                    this.A0.setCameraThumb(arVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f11605a);
                        int i10 = R.raw.permission_request_camera;
                        int i11 = org.telegram.ui.ActionBar.y6.L5;
                        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.x0(null, i11, false), null);
                        alertDialog$Builder.n(i11, null);
                        alertDialog$Builder.f22368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new y9(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f22368a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f11678w2 = true;
                }
            }
            if (!this.f11665s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new p9(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        va vaVar = this.B0;
        if (vaVar != null && vaVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new e2.m0(this, this.B0.getTextureView().getBitmap(), runnable, 9));
            } catch (Throwable unused) {
            }
        }
    }

    public final void b0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f7 = 0.0f;
        int i10 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f7 = 1.0f;
            }
            animate.alpha(f7).setUpdateListener(new sa(this, 1)).setListener(new ai.l0(this, z10, view, 4)).setDuration(320L).setInterpolator(ds.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z10) {
            f7 = 1.0f;
        }
        view.setAlpha(f7);
        m0();
    }

    public final void c0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f11622f.updateViewLayout(this.f11645n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f11612c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void d0(String str) {
        int i10;
        this.E0.clearAnimation();
        va vaVar = this.B0;
        if ((vaVar != null && vaVar.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            b0(this.E0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    i10 = R.drawable.media_photo_flash_auto2;
                    this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                }
            } else {
                str.equals("off");
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.E0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        dc dcVar = this.E0;
        if (dcVar.f10737n != i10) {
            dcVar.f10737n = i10;
            ValueAnimator valueAnimator = dcVar.f10738r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dcVar.f10738r = null;
            }
            dcVar.setDrawable(i10);
        }
        if (this.f11623f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(this.E0, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        di.b7 o10;
        w7 w7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            w6 w6Var = this.O0;
            if (w6Var != null) {
                w6Var.h();
            }
            if (this.f11644m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f11644m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f11644m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            w6 w6Var2 = this.O0;
            if (w6Var2 != null && !this.V1) {
                w6Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f11623f0;
            int i15 = this.f11612c;
            if (i14 == 1) {
                if (!this.N1 && !this.f11614c1.o()) {
                    di.h7 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int A = A();
                    di.b7 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f8630a, A) || ((w7Var = this.K1) != null && (w7Var.f11903g || w7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f11610b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                w7 w7Var2 = this.K1;
                if (w7Var2 == null || w7Var2.J0 == 0) {
                    g0(o10, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i10;
        v0 v0Var;
        this.K0 = z10;
        Boolean bool = this.f11654p2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.f11657q2 = new z9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f11648n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11648n2 = null;
            }
            o1.j jVar = this.f11651o2;
            if (jVar != null) {
                jVar.c();
                this.f11651o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            qa qaVar = this.M0;
            if (qaVar != null) {
                qaVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            kb kbVar = this.f11658r;
            if (kbVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kbVar.setImportantForAccessibility(i10);
            }
            qa qaVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            qaVar2.setImportantForAccessibility(i11);
            this.f11654p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            rb rbVar = this.f11645n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (rbVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, rbVar.getHeight());
            qa qaVar3 = this.M0;
            qaVar3.K = !z10;
            if (this.f11637j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f11640k2 = z11;
            if (z10) {
                o1.j jVar2 = new o1.j(qaVar3, o1.h.f18953n, height);
                this.f11651o2 = jVar2;
                jVar2.f18969u.a(0.75f);
                this.f11651o2.f18969u.b(350.0f);
                this.f11651o2.a(new aa(this, height, 0));
                this.f11651o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f11648n2 = ofFloat;
                ofFloat.addUpdateListener(new ba(this, 0));
                this.f11648n2.addListener(new pa(this, 1));
                this.f11648n2.setDuration(450L);
                this.f11648n2.setInterpolator(ds.h);
                this.f11648n2.start();
            }
            if (!z10 && !this.S1) {
                this.f11642l2 = null;
            }
            if (!z10 && this.f11623f0 == 0 && !this.f11665s2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f11624f1 == null) {
            xj0 xj0Var = new xj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f11624f1 = xj0Var;
            xj0Var.F *= 1.5f;
        }
        this.f11627g1.setAnimation(this.f11624f1);
        int i10 = 20;
        if (!z11) {
            xj0 xj0Var2 = this.f11624f1;
            if (!z10) {
                i10 = 0;
            }
            xj0Var2.N(i10, false, false);
        } else if (z10) {
            xj0 xj0Var3 = this.f11624f1;
            if (xj0Var3.f34736a0 > 20) {
                xj0Var3.N(0, false, false);
            }
            this.f11624f1.P(20);
            this.f11624f1.start();
        } else {
            xj0 xj0Var4 = this.f11624f1;
            int i11 = xj0Var4.f34736a0;
            if (i11 != 0 && i11 < 43) {
                xj0Var4.P(43);
                this.f11624f1.start();
            }
        }
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        kb kbVar = this.f11658r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ba(this, 5));
            this.E.addListener(new bi.l7(this, f7, runnable, 3));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(ds.h);
            } else if (f7 <= 0.0f && kbVar.f11135a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(ds.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(ds.h);
                }
            } else {
                this.E.setDuration(300L);
                this.E.setInterpolator(new u1.a());
            }
            this.E.start();
            return;
        }
        this.L = null;
        this.I = f7;
        j();
        kbVar.invalidate();
        this.f11645n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f11645n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 2));
    }

    public final void g(boolean z10, boolean z11) {
        float f7;
        float dp;
        float dp2;
        float f10;
        float dp3;
        float dp4;
        y yVar;
        if (z10) {
            v3 v3Var = this.l1;
            if (v3Var != null) {
                v3Var.e(true);
            }
            v3 v3Var2 = this.f11643m1;
            if (v3Var2 != null) {
                v3Var2.e(true);
            }
            v3 v3Var3 = this.f11639k1;
            if (v3Var3 != null) {
                v3Var3.e(true);
            }
            v3 v3Var4 = this.W0;
            if (v3Var4 != null) {
                v3Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f11611b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f11611b2 = H();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        l0(z11);
        ja jaVar = this.Q0;
        t3 t3Var = this.U0;
        t3 t3Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f11623f0 == 0 && !H()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t3Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f11623f0 == 0 && !H()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t3Var2, property2, dp3);
            if (z10 || this.f11623f0 != 0 || !H()) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(t3Var, property, f11);
            if (!z10 && this.f11623f0 == 0 && H()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(t3Var, property2, dp4);
            if (z10 || this.f11623f0 != 0 || H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jaVar, property, f12);
            if (z10 || this.f11623f0 != 0 || H()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(jaVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(ds.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f11623f0 == 0 && !H()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        t3Var2.setAlpha(f7);
        if (z10 && this.f11623f0 == 0 && !H()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        t3Var2.setTranslationY(dp);
        if (z10 || this.f11623f0 != 0 || !H()) {
            f11 = 0.0f;
        }
        t3Var.setAlpha(f11);
        if (!z10 && this.f11623f0 == 0 && H()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        t3Var.setTranslationY(dp2);
        if (z10 || this.f11623f0 != 0 || H()) {
            f12 = 0.0f;
        }
        jaVar.setAlpha(f12);
        if (z10 || this.f11623f0 != 0 || H()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        jaVar.setTranslationY(f13);
    }

    public final void g0(di.b7 b7Var, boolean z10) {
        if (this.f11689z2) {
            return;
        }
        tg.j0 j0Var = new tg.j0(b7Var.b(), this.f11612c, this.f11608b, new wa(this, 0), null);
        j0Var.X = A();
        j0Var.setOnDismissListener(new y80(2, this, z10));
        this.X0.x(7, true);
        this.f11689z2 = true;
        j0Var.show();
    }

    public final void h(Runnable runnable) {
        w7 w7Var;
        Runnable runnable2;
        gb gbVar;
        float f7;
        Bitmap.CompressFormat compressFormat;
        eg0 eg0Var = this.B1;
        if (eg0Var != null && (w7Var = this.K1) != null) {
            w7Var.f11908j = eg0Var.d() | w7Var.f11908j;
            w7 w7Var2 = this.K1;
            eg0 eg0Var2 = this.B1;
            File file = w7Var2.Z0;
            if (file != null) {
                file.delete();
                w7Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = eg0Var2.getSavedFilterState();
            w7Var2.f11890a1 = savedFilterState;
            if (!w7Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = eg0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = w7Var2.R;
                        float f10 = 1.0f;
                        boolean z10 = true;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, w7Var2.f11911k0 / 2.0f, w7Var2.f11913l0 / 2.0f);
                        matrix.postRotate(-w7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        w7Var2.f11916n0.preScale(w7Var2.f11911k0 / createBitmap.getWidth(), w7Var2.f11913l0 / createBitmap.getHeight());
                        w7Var2.f11911k0 = createBitmap.getWidth();
                        w7Var2.f11913l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = w7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            w7Var2.Z0.delete();
                        }
                        String k10 = w7.k(w7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        }
                        boolean z11 = z10;
                        int i11 = w7Var2.f11888a;
                        if (!z11) {
                            str = "jpg";
                        }
                        w7Var2.Z0 = w7.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(w7Var2.Z0);
                                if (z11) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new bi.s9(w7Var2, createBitmap, z11, runnable2, 3));
                        }
                    }
                }
                runnable2 = runnable;
            } else {
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (runnable2 == null) {
                w7 w7Var3 = this.K1;
                if (!w7Var3.K && (gbVar = this.X0) != null) {
                    gbVar.set(w7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f11618d2 != z10) {
            this.f11618d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(ds.h).withEndAction(new z9(this, z10, 1)).start();
                return;
            }
            this.J0.clearAnimation();
            if (z10) {
                f7 = 1.0f;
            }
            this.J0.setAlpha(f7);
            if (!z10) {
                this.J0.b(false, false);
            }
        }
    }

    public final void i() {
        if (this.K1 != null && this.D1 != null && this.f11629h0.getMeasuredWidth() > 0 && this.f11629h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f11629h0.getMeasuredWidth() / 2.0f, this.f11629h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f11629h0.getMeasuredWidth() / this.f11629h0.getMeasuredHeight(), this.f11629h0.getMeasuredHeight() / this.f11629h0.getMeasuredWidth(), this.f11629h0.getMeasuredWidth() / 2.0f, this.f11629h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f11629h0.getMeasuredWidth()) * this.K1.f11911k0, (1.0f / this.f11629h0.getMeasuredHeight()) * this.K1.f11913l0);
            matrix.postConcat(this.K1.f11916n0);
            matrix.postScale(this.f11629h0.getMeasuredWidth() / this.K1.f11907i0, this.f11629h0.getMeasuredHeight() / this.K1.f11909j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f7;
        fc1 fc1Var = this.V0;
        if ((fc1Var.getTag() != null && z10) || (fc1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f11621e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                p9 p9Var = new p9(this, 25);
                this.f11621e2 = p9Var;
                AndroidUtilities.runOnUIThread(p9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f11625f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        fc1Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f11625f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            fc1Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f11625f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(fc1Var, property, f7));
        this.f11625f2.addListener(new bh.f0(14, this, z10));
        this.f11625f2.start();
        if (z10) {
            p9 p9Var2 = new p9(this, 26);
            this.f11621e2 = p9Var2;
            AndroidUtilities.runOnUIThread(p9Var2, 2000L);
        }
    }

    public final void j() {
        di.q3 q3Var;
        if (this.J == 1) {
            RectF rectF = this.f11616d0;
            rectF.set(this.f11629h0.getLeft(), this.f11629h0.getTop(), this.f11629h0.getMeasuredWidth(), this.f11629h0.getMeasuredHeight());
            rectF.offset(this.f11658r.getX(), this.f11658r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f11613c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f11629h0.setAlpha(this.I);
            float f10 = rectF3.left;
            eb ebVar = this.f11629h0;
            ebVar.setTranslationX((f10 - ebVar.getLeft()) - this.f11658r.getX());
            float f11 = rectF3.top;
            eb ebVar2 = this.f11629h0;
            ebVar2.setTranslationY((f11 - ebVar2.getTop()) - this.f11658r.getY());
            nb nbVar = this.F;
            if (nbVar != null && (q3Var = nbVar.f11325f) != null) {
                q3Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f11325f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f11629h0.setScaleX(rectF3.width() / this.f11629h0.getMeasuredWidth());
            this.f11629h0.setScaleY(rectF3.height() / this.f11629h0.getMeasuredHeight());
            this.f11632i0.setAlpha(this.I);
            this.f11638k0.setAlpha(this.I);
            this.f11641l0.setAlpha(this.I);
            if (this.f11623f0 == 2) {
                this.f11670u1.setAlpha(this.I);
            }
        }
    }

    public final void j0() {
        n9 n9Var = this.f11655q0;
        if (n9Var != null) {
            n9Var.dismiss();
            this.f11655q0 = null;
        }
        n9 n9Var2 = new n9(this.f11608b, 86400, this.f11605a);
        n9Var2.p1();
        n9Var2.r1(this.f11684y0);
        TLRPC.InputPeer inputPeer = this.f11680x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f11612c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        n9Var2.q1(inputPeer);
        n9Var2.F = this.M;
        n9Var2.U = new q9(this, 18);
        n9Var2.f1(false);
        n9Var2.n1(1);
        n9Var2.l1(false);
        n9Var2.W = new q9(this, 19);
        n9Var2.T = new y9(this, 12);
        this.f11655q0 = n9Var2;
        n9Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: fi.sb.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.sb.k0(int, boolean, boolean):void");
    }

    public final void l() {
        w7 w7Var;
        if (this.f11673v1 != null && (w7Var = this.K1) != null && w7Var.f11929u) {
            File file = w7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = w7.w(this.f11612c, "webp");
            ta taVar = this.f11673v1;
            w7 w7Var2 = this.K1;
            ArrayList arrayList = w7Var2.T0;
            boolean z10 = true;
            if (this.O1 == 1) {
                z10 = false;
            }
            Bitmap q02 = taVar.q0(arrayList, false, false, true, z10, w7Var2);
            try {
                try {
                    q02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (q02.isRecycled()) {
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    try {
                        this.K1.W0.delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    this.K1.W0 = null;
                    if (q02 == null || q02.isRecycled()) {
                        return;
                    }
                }
                q02.recycle();
            } catch (Throwable th2) {
                if (q02 != null && !q02.isRecycled()) {
                    q02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void l0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f7;
        boolean z16;
        va vaVar;
        boolean z17 = false;
        if (this.f11623f0 == 0 && this.O1 == 1 && !this.I0.e && !H()) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0(z11, z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        if (yVar != null && yVar.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        b0(this.f11646n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f11623f0 == 0 && this.Y1 != null && !this.I0.e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f11623f0 == 0 && (vaVar = this.B0) != null && vaVar.f10594a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f11623f0 == 0 && !this.I0.e) {
            z15 = true;
        } else {
            z15 = false;
        }
        b0(this.G0, z15, z10);
        b0(this.H0, this.I0.e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(f7, z10);
        boolean z18 = this.I0.e;
        v3 v3Var = this.f11647n1;
        if (z18) {
            v3Var.u();
        } else {
            v3Var.e(true);
        }
        g(this.a2, z10);
        if (this.O1 == -1 && this.f11623f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f11623f0 == 0) {
            z17 = true;
        }
        AndroidUtilities.updateViewShow(this.R0, z17);
    }

    public final void m0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = this.E0.getAlpha();
        this.f11646n0.setTranslationX(0.0f);
        float alpha5 = this.f11646n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f11977a;
        vVar.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        vVar.invalidate();
    }

    public final void n() {
        boolean z10;
        if (this.K == 0.0f && this.I >= 1.0f && !this.B2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.A2) {
            return;
        }
        ag.b1 b1Var = this.f11683y;
        if (b1Var != null) {
            b1Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        int i10;
        xj0 xj0Var = this.f11630h1;
        if (xj0Var != null) {
            int[] iArr = xj0Var.e;
            int i11 = 0;
            if (z10) {
                w7 w7Var = this.K1;
                if (w7Var != null && w7Var.f11937y0) {
                    i11 = iArr[0];
                }
                xj0Var.P(i11);
                xj0 xj0Var2 = this.f11630h1;
                if (xj0Var2 != null) {
                    xj0Var2.start();
                    return;
                }
                return;
            }
            w7 w7Var2 = this.K1;
            if (w7Var2 != null && w7Var2.f11937y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            xj0Var.N(i10, false, true);
            this.f11630h1.P(i10);
            ImageView imageView = this.f11633i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f11668t2 < 0) {
            this.f11668t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f11671u2 = arrayList;
            arrayList.add("off");
            this.f11671u2.add("auto");
            this.f11671u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            q2 q2Var = this.f11662s;
            q2Var.f11476o = f7;
            q2Var.f11475n = q2.f(f7);
            q2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            q2 q2Var2 = this.f11662s;
            q2Var2.f11477p = f10;
            q2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        p9 p9Var = new p9(this, 2);
        ta taVar = this.f11673v1;
        w7 w7Var = this.K1;
        if (taVar != null && w7Var != null) {
            w7Var.f();
            boolean r02 = taVar.r0();
            boolean z10 = taVar.D0.getPainting().E;
            Utilities.searchQueue.postRunnable(new s9(this, taVar, w7Var.f11907i0, w7Var.f11909j0, w7Var, z10, r02, p9Var, 1));
            return;
        }
        p9Var.run();
    }

    public final void p(boolean z10) {
        gb gbVar;
        if (this.d) {
            n9 n9Var = this.f11655q0;
            if (n9Var != null) {
                n9Var.dismiss();
                this.f11655q0 = null;
            }
            w7 w7Var = this.K1;
            long j10 = 0;
            if (w7Var != null && !w7Var.h) {
                if ((this.v && w7Var.f11903g) || w7Var.f11891b != 0) {
                    w7Var.f11908j = false;
                }
                w7Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (gbVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                s81 s81Var = gbVar.f11393y;
                if (s81Var != null) {
                    s81Var.B();
                    gbVar.f11393y.H();
                    gbVar.f11393y = null;
                }
                s81 s81Var2 = gbVar.f11391x;
                if (s81Var2 != null) {
                    j10 = s81Var2.n();
                    gbVar.f11391x.B();
                    gbVar.f11391x.H();
                    gbVar.f11391x = null;
                }
                s81 s81Var3 = gbVar.e;
                if (s81Var3 != null) {
                    j10 = s81Var3.n();
                    gbVar.e.B();
                    gbVar.e.H();
                    gbVar.e = null;
                }
                callback4.run(Long.valueOf(j10), new z9(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f11675w));
                return;
            }
            gb gbVar2 = this.X0;
            if (gbVar2 != null && !z10) {
                gbVar2.set(null);
            }
            f(0.0f, z10, new p9(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f11645n.setBackgroundColor(0);
                this.f11610b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f11612c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean p0() {
        va vaVar;
        if ((this.P1 || this.Q1) && (vaVar = this.B0) != null && vaVar.isFrontface()) {
            int i10 = this.f11668t2;
            if (i10 == 2 || (i10 == 1 && this.f11615c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f11608b;
        if (this.B0 == null && activity != null) {
            this.B0 = new va(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            w6 w6Var = this.O0;
            float f7 = 0.0f;
            if (w6Var != null) {
                w6Var.f11863g0 = 0.0f;
                w6Var.f11864h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(z());
            this.B0.initTexture();
            this.B0.setDelegate(new y9(this, 0));
            ec ecVar = this.F0;
            if (this.B0.f10594a && this.f11623f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(ecVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f10594a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.B0.f10594a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new s6(activity, new q9(this, 3));
            }
            this.C0.a(this.B0);
            g7 g7Var = this.D0;
            if (g7Var != null) {
                fb fbVar = this.A0;
                Object blurRenderNode = fbVar.getBlurRenderNode();
                g7Var.F = fbVar;
                g7Var.G = blurRenderNode;
                g7Var.invalidate();
            }
        }
    }

    public final void r() {
        w7 w7Var;
        Bitmap bitmap;
        Bitmap q5;
        if (this.B1 == null && (w7Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!w7Var.K) {
                if (w7Var.Z0 == null) {
                    q5 = this.X0.getPhotoBitmap();
                } else {
                    y9 y9Var = new y9(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q5 = w7.q(y9Var, point.x, point.y, 0, true);
                }
                bitmap = q5;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                h81 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                w7 w7Var2 = this.K1;
                if (w7Var2 != null) {
                    savedFilterState = w7Var2.f11890a1;
                }
                eg0 eg0Var = new eg0(this.f11608b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f11659r0, this.f11605a);
                this.B1 = eg0Var;
                this.f11658r.addView(eg0Var);
                cg0 cg0Var = this.C1;
                if (cg0Var != null) {
                    cg0Var.setFilterView(this.B1);
                }
                TextureView myTextureView = this.B1.getMyTextureView();
                this.D1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.X0.o(this.D1, this.B1);
                TextureView textureView2 = this.D1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.D1.animate().alpha(1.0f).setDuration(220L).start();
                }
                i();
                sf0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f11629h0.addView(blurControl);
                }
                uf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f11629h0.addView(curveControl);
                }
                U();
                this.B1.getDoneTextView().setOnClickListener(new r9(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new r9(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f27840i0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            fb fbVar = this.A0;
            if (fbVar != null && fbVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f11608b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        MediaController.AlbumEntry albumEntry = this.f11644m2;
        boolean z13 = !z10;
        fb fbVar2 = this.A0;
        if (fbVar2 != null && fbVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        qa qaVar = new qa(this, this.f11612c, this.f11608b, this.f11605a, albumEntry, z10, z13, z11);
        this.M0 = qaVar;
        qaVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new ha(this, 1));
        this.M0.setOnSelectListener(new ga(0, this, z10));
        this.M0.setOnSelectMultipleListener(new bi.j2(this, 2));
        s4.b0 b0Var = this.f11642l2;
        if (b0Var != null) {
            y2 y2Var = this.M0.e;
            y2Var.B = b0Var;
            y2Var.l0();
        }
        this.f11645n.addView(this.M0, gb1.i(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: fi.sb.t():void");
    }

    public final void u(boolean z10) {
        s6 s6Var = this.C0;
        if (s6Var != null) {
            s6Var.f11591f = null;
            Utilities.globalQueue.cancelRunnable(s6Var.h);
            this.C0 = null;
            fb fbVar = this.A0;
            if (fbVar != null) {
                fbVar.f10746c.a(null);
            }
        }
        g7 g7Var = this.D0;
        if (g7Var != null) {
            g7Var.F = null;
            g7Var.G = null;
            g7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new p9(this, 8));
                return;
            }
            a0(new p9(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            fb fbVar2 = this.A0;
            if (fbVar2 != null) {
                fbVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        qa qaVar = this.M0;
        if (qaVar == null) {
            return;
        }
        this.f11645n.removeView(qaVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f11648n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11648n2 = null;
        }
        o1.j jVar = this.f11651o2;
        if (jVar != null) {
            jVar.c();
            this.f11651o2 = null;
        }
        this.f11654p2 = null;
    }

    public final void x() {
        eg0 eg0Var = this.B1;
        if (eg0Var == null) {
            return;
        }
        eg0Var.e();
        this.C1.setFilterView(null);
        this.f11658r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f11629h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        sf0 sf0Var = this.E1;
        if (sf0Var != null) {
            this.f11629h0.removeView(sf0Var);
            this.E1 = null;
        }
        uf0 uf0Var = this.F1;
        if (uf0Var != null) {
            this.f11629h0.removeView(uf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        ta taVar = this.f11673v1;
        if (taVar != null) {
            taVar.G0.removeAllViews();
            ta taVar2 = this.f11673v1;
            taVar2.D0.h();
            taVar2.G0.setVisibility(8);
            taVar2.F0.setVisibility(8);
            taVar2.f10814t0.postRunnable(new ag.c(14));
            n5 n5Var = taVar2.Z1;
            if (n5Var != null) {
                n5Var.dismiss();
            }
            rg.y yVar = taVar2.I1;
            if (yVar != null) {
                yVar.dismiss();
            }
            this.f11658r.removeView(this.f11673v1);
            this.f11673v1 = null;
            rg.c1 c1Var = this.f11677w1;
            if (c1Var != null) {
                this.f11629h0.removeView(c1Var);
                this.f11677w1 = null;
            }
            View view = this.f11685y1;
            if (view != null) {
                this.f11629h0.removeView(view);
                this.f11685y1 = null;
            }
            View view2 = this.f11681x1;
            if (view2 != null) {
                this.f11629h0.removeView(view2);
                this.f11681x1 = null;
            }
            View view3 = this.f11688z1;
            if (view3 != null) {
                this.f11629h0.removeView(view3);
                this.f11688z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f11629h0.removeView(view4);
                this.A1 = null;
            }
        }
    }

    public final Drawable z() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f11608b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
