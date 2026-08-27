package lh;

import android.animation.Animator;
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
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;

public final class sb implements NotificationCenter.NotificationCenterDelegate {
    public static sb B2;
    public ValueAnimator A;
    public final dc A0;
    public ke0 A1;
    public ValueAnimator A2;
    public nb B;
    public final ec B0;
    public me0 B1;
    public float C;
    public final a0 C0;
    public File C1;
    public final RectF D;
    public final dc D0;
    public ArrayList D1;
    public float E;
    public final z E0;
    public ArrayList E1;
    public int F;
    public final hc F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public z7 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public sa I0;
    public long I1;
    public long J;
    public v0 J0;
    public boolean J1;
    public boolean K;
    public final y6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final la M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final p2 N0;
    public boolean N1;
    public int O;
    public final p2 O0;
    public boolean O1;
    public int P;
    public final u3 P0;
    public float P1;
    public int Q;
    public final u3 Q0;
    public int Q1;
    public boolean R;
    public final k81 R0;
    public boolean R1;
    public boolean S;
    public final w3 S0;
    public boolean S1;
    public boolean T;
    public final hb T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final cc V0;
    public AnimatorSet V1;
    public int W;
    public final gc W0;
    public boolean W1;
    public int X;
    public final i6 X0;
    public boolean X1;
    public final RectF Y;
    public final ib Y0;
    public boolean Y1;
    public final RectF Z;
    public final ka Z0;
    public boolean Z1;

    public final jh.b f16742a;

    public final Path f16743a0;

    public final u0 f16744a1;
    public Runnable a2;

    public final Activity f16745b;

    public int f16746b0;

    public oi0 f16747b1;

    public AnimatorSet f16748b2;

    public final int f16749c;

    public int f16750c0;

    public final ri0 f16751c1;

    public y9 f16752c2;
    public boolean d;

    public final fb f16753d0;

    public oi0 f16754d1;

    public boolean f16755d2;

    public boolean f16756e;

    public final FrameLayout f16757e0;

    public ImageView f16758e1;

    public AnimatorSet f16759e2;

    public final WindowManager f16760f;

    public final LinearLayout f16761f0;

    public final ag.t0 f16762f1;

    public ValueAnimator f16763f2;

    public final FrameLayout f16764g0;

    public final w3 f16765g1;

    public boolean f16766g2;
    public final WindowManager.LayoutParams h;

    public final ag.p1 f16767h0;

    public final w3 f16768h1;

    public f2.j0 f16769h2;

    public final FrameLayout f16770i0;

    public final w3 f16771i1;

    public MediaController.AlbumEntry f16772i2;

    public final p2 f16773j0;

    public final w3 f16774j1;

    public ValueAnimator f16775j2;

    public final s7 f16776k0;

    public final j6 f16777k1;

    public o1.j f16778k2;

    public final org.telegram.ui.ActionBar.h5 f16779l0;
    public final fc l1;

    public Boolean f16780l2;
    public q9 m0;

    public q f16781m1;

    public ca f16782m2;

    public final rb f16783n;

    public final org.telegram.ui.Components.z9 f16784n0;

    public db f16785n1;

    public AnimatorSet f16786n2;

    public final p6 f16787o0;

    public eb f16788o1;

    public boolean f16789o2;

    public final ag.s0 f16790p0;

    public final cc f16791p1;

    public int f16792p2;

    public boolean f16793q0;

    public final d f16794q1;

    public ArrayList f16795q2;

    public final kb f16796r;

    public long f16797r0;

    public va f16798r1;

    public FrameLayout f16799r2;

    public final r2 f16800s;

    public String f16801s0;

    public yf.b1 f16802s1;

    public boolean f16803s2;

    public TLRPC.InputPeer f16804t0;

    public View f16805t1;

    public s9 f16806t2;

    public o9 f16807u0;

    public View f16808u1;

    public cg.w1 f16809u2;
    public boolean v;

    public u f16810v0;

    public View f16811v1;

    public boolean f16812v2;

    public long f16813w;

    public final gb f16814w0;

    public View f16815w1;

    public boolean f16816w2;

    public jb f16817x;

    public wa f16818x0;

    public ve0 f16819x1;

    public boolean f16820x2;

    public final gf.t0 f16821y;

    public u6 f16822y0;

    public final te0 f16823y1;

    public bb f16824y2;

    public final i7 f16825z0;

    public TextureView f16826z1;

    public float f16827z2;

    public sb(Activity activity, int i10) {
        int i11;
        jh.b bVar = new jh.b();
        this.f16742a = bVar;
        this.f16813w = 0L;
        this.D = new RectF();
        int i12 = 1;
        this.I = true;
        this.L = new AnimationNotificationsLocker();
        this.Y = new RectF();
        this.Z = new RectF();
        this.f16743a0 = new Path();
        new Rect();
        this.f16746b0 = 0;
        this.f16750c0 = -1;
        this.f16807u0 = new o9();
        this.D1 = null;
        this.E1 = null;
        this.F1 = null;
        this.K1 = 0;
        this.L1 = false;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.Q1 = -3;
        this.S1 = false;
        oa oaVar = new oa(this);
        this.Z1 = true;
        this.f16766g2 = true;
        this.f16792p2 = -1;
        this.f16745b = activity;
        this.f16749c = i10;
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.f16821y = launchActivity != null ? new gf.t0(launchActivity, true) : null;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        int i13 = 16;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f16760f = windowManager;
        rb rbVar = new rb(this, activity);
        this.f16783n = rbVar;
        ba baVar = new ba(this, i12);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(rbVar, baVar);
        this.f16783n.setFocusable(true);
        this.f16783n.setImportantForAccessibility(2);
        r2 r2Var = new r2(activity, windowManager, this.f16783n, layoutParams);
        this.f16800s = r2Var;
        r2Var.a(new za(this));
        this.f16783n.addView(this.f16800s.f16627b, new ViewGroup.LayoutParams(-1, -1));
        rb rbVar2 = this.f16783n;
        kb kbVar = new kb(this, activity);
        this.f16796r = kbVar;
        rbVar2.addView(kbVar);
        kb kbVar2 = this.f16796r;
        fb fbVar = new fb(this, activity);
        this.f16753d0 = fbVar;
        kbVar2.addView(fbVar);
        this.f16796r.addView(this.f16800s.f16628c, new ViewGroup.LayoutParams(-1, -1));
        this.f16784n0 = new org.telegram.ui.Components.z9(this.f16753d0);
        this.f16787o0 = new p6();
        kb kbVar3 = this.f16796r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f16757e0 = frameLayout;
        kbVar3.addView(frameLayout);
        kb kbVar4 = this.f16796r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f16764g0 = frameLayout2;
        kbVar4.addView(frameLayout2);
        kb kbVar5 = this.f16796r;
        ag.p1 p1Var = new ag.p1(this, activity, 9);
        this.f16767h0 = p1Var;
        kbVar5.addView(p1Var);
        this.f16767h0.setVisibility(8);
        this.f16767h0.setAlpha(0.0f);
        kb kbVar6 = this.f16796r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f16770i0 = frameLayout3;
        kbVar6.addView(frameLayout3);
        int i14 = 6;
        org.telegram.ui.Components.ec.a(this.f16783n, new cg.w(i14));
        int i15 = 8;
        gb gbVar = new gb(this, activity, this.f16784n0, this.f16796r, bVar);
        this.f16814w0 = gbVar;
        rb rbVar3 = this.f16783n;
        Objects.requireNonNull(rbVar3);
        gbVar.setCancelGestures(new kh.c(rbVar3, 20));
        this.f16814w0.setResetState(new s9(this, 13));
        this.f16753d0.addView(this.f16814w0, h7.z5.e(-1, -1, 119));
        this.f16814w0.setOnClickListener(new u9(this, 12));
        fb fbVar2 = this.f16753d0;
        int i16 = this.F;
        fbVar2.setBackgroundColor((i16 == 1 || i16 == 0) ? 0 : -14737633);
        fb fbVar3 = this.f16753d0;
        float fDp = AndroidUtilities.dp(12.0f);
        cg.l1 l1Var = gf.r0.f7054a;
        fbVar3.setOutlineProvider(new gf.q0(0, fDp));
        this.f16753d0.setClipToOutline(true);
        s9 s9Var = new s9(this, 14);
        te0 te0Var = new te0(activity);
        te0Var.f32750a = new TextPaint(1);
        te0Var.f32751b = new TextPaint(1);
        er erVar = er.h;
        te0Var.f32757s = new org.telegram.ui.Components.y5(te0Var, 0L, 350L, erVar);
        te0Var.E = new mb0(te0Var, 7);
        te0Var.f32759x = s9Var;
        this.f16823y1 = te0Var;
        hb hbVar = new hb(this, activity, this.f16784n0, this.f16787o0);
        this.T0 = hbVar;
        hbVar.setCollageView(this.f16814w0);
        hb hbVar2 = this.T0;
        hbVar2.v = new s9(this, 15);
        hbVar2.setOnTapListener(new s9(this, i13));
        this.T0.setVisibility(8);
        hb hbVar3 = this.T0;
        hbVar3.J = new s9(this, 17);
        this.f16753d0.addView(hbVar3, h7.z5.e(-1, -1, 119));
        this.f16753d0.addView(this.f16823y1, h7.z5.e(-1, -1, 119));
        rb rbVar4 = this.f16783n;
        ib ibVar = new ib(this, activity, rbVar4, rbVar4, this.f16796r, bVar, this.f16784n0);
        this.Y0 = ibVar;
        ibVar.setAccount(i10);
        this.Y0.setUiBlurBitmap(new ba(this, i14));
        int i17 = 5;
        org.telegram.ui.Components.ec.a(this.f16767h0, new gh.w0(this, i17));
        this.Y0.setOnHeightUpdate(new t9(this, 13));
        this.Y0.setOnPeriodUpdate(new t9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new t9(this, i17));
        this.Y0.setOnKeyboardOpen(new t9(this, i14));
        ag.s0 s0Var = new ag.s0(this, activity, 3);
        this.f16790p0 = s0Var;
        this.f16796r.addView(s0Var);
        cc ccVar = new cc(activity, this.f16796r, this.f16753d0, bVar, this.f16784n0);
        this.V0 = ccVar;
        ccVar.setOnTimelineClick(new s9(this, 10));
        this.V0.setOnHeightChange(new s9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.V0, h7.z5.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gc gcVar = new gc(activity);
        this.W0 = gcVar;
        gcVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, h7.z5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f16767h0.addView(this.U0, h7.z5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f16767h0.addView(this.Y0, h7.z5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f16814w0.setTimelineView(this.V0);
        this.f16814w0.setPreviewView(this.T0);
        cc ccVar2 = new cc(activity, this.f16796r, this.f16753d0, bVar, this.f16784n0);
        this.f16791p1 = ccVar2;
        ccVar2.T0 = true;
        ccVar2.setVisibility(8);
        this.f16791p1.setAlpha(0.0f);
        this.f16767h0.addView(this.f16791p1, h7.z5.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ka kaVar = new ka(this, activity, bVar, this.f16784n0);
        this.Z0 = kaVar;
        kaVar.setVisibility(8);
        this.f16767h0.addView(this.Z0, h7.z5.e(-1, -2, 85));
        p2 p2Var = new p2(activity);
        this.f16773j0 = p2Var;
        p2Var.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        p2 p2Var2 = this.f16773j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p2Var2.setScaleType(scaleType);
        this.f16773j0.setImageResource(R.drawable.msg_photo_back);
        p2 p2Var3 = this.f16773j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        p2Var3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f16773j0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f16773j0.setOnClickListener(new u9(this, i12));
        this.f16757e0.addView(this.f16773j0, h7.z5.e(56, 56, 51));
        this.f16800s.a(this.f16773j0);
        s7 s7Var = new s7(activity, i10);
        this.f16776k0 = s7Var;
        s7Var.a(false, false);
        this.f16776k0.setOnClickListener(new ag.q0(28, this, activity));
        this.f16757e0.addView(this.f16776k0, h7.z5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f16779l0 = h5Var;
        h5Var.setTextSize(20);
        this.f16779l0.setGravity(19);
        this.f16779l0.setTextColor(-1);
        this.f16779l0.setTypeface(AndroidUtilities.bold());
        this.f16779l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f16779l0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f16779l0.setAlpha(0.0f);
        this.f16779l0.setVisibility(8);
        this.f16779l0.setEllipsizeByGradient(true);
        this.f16779l0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f16757e0.addView(this.f16779l0, h7.z5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f16761f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f16761f0.setGravity(5);
        this.f16757e0.addView(this.f16761f0, h7.z5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        t9 t9Var = new t9(this, 7);
        rb rbVar5 = this.f16783n;
        u0 u0Var = new u0(activity);
        u0Var.f16894w = true;
        u0Var.f16895x = true;
        u0Var.h = t9Var;
        u0Var.f16886a = i10;
        u0Var.f16887b = rbVar5;
        u0Var.setScaleType(scaleType);
        u0Var.setColorFilter(new PorterDuffColorFilter(-1, mode));
        u0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        u0Var.setVisibility(8);
        u0Var.setAlpha(0.0f);
        u0Var.setOnClickListener(new ag.w0(u0Var, 29));
        u0Var.f16890f = new hp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        u0Var.d();
        this.f16744a1 = u0Var;
        w3 w3Var = new w3(activity, 1);
        w3Var.m(1.0f, -71.0f);
        w3Var.d = 2000L;
        w3Var.Q = false;
        w3Var.D.o(true, false, false);
        this.f16765g1 = w3Var;
        w3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16757e0.addView(this.f16765g1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ri0 ri0Var = new ri0(activity);
        this.f16751c1 = ri0Var;
        ri0Var.setScaleType(scaleType);
        ri0 ri0Var2 = this.f16751c1;
        z7 z7Var = this.G1;
        ri0Var2.setImageResource((z7Var == null || !z7Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.f16751c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f16751c1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f16751c1.setOnClickListener(new u9(this, 2));
        this.f16751c1.setVisibility(8);
        this.f16751c1.setAlpha(0.0f);
        ag.t0 t0Var = new ag.t0(activity);
        this.f16762f1 = t0Var;
        t0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f16762f1.setVisibility(8);
        this.f16762f1.setAlpha(0.0f);
        this.f16762f1.setOnClickListener(new u9(this, 3));
        this.f16761f0.addView(this.f16762f1, h7.z5.q(46, 56, 53));
        this.f16761f0.addView(this.f16751c1, h7.z5.q(46, 56, 53));
        this.f16761f0.addView(this.f16744a1, h7.z5.e(46, 56, 53));
        dc dcVar = new dc(activity);
        this.A0 = dcVar;
        dcVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new u9(this, 4));
        this.A0.setOnLongClickListener(new b5(this, i12));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.f16800s.a(this.A0);
        this.f16757e0.addView(this.A0, h7.z5.e(56, 56, 53));
        ec ecVar = new ec(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = ecVar;
        ecVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new u9(this, 5));
        boolean zQ = c1.q(activity);
        this.B0.setVisibility(zQ ? 0 : 8);
        this.B0.setAlpha(zQ ? 1.0f : 0.0f);
        this.f16800s.a(this.B0);
        this.f16757e0.addView(this.B0, h7.z5.e(56, 56, 53));
        a0 a0Var = new a0(activity);
        this.C0 = a0Var;
        a0Var.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        if (this.f16810v0 == null) {
            i11 = 6;
            this.f16810v0 = (u) u.a().get(6);
        } else {
            i11 = 6;
        }
        this.C0.setOnClickListener(new u9(this, i11));
        this.C0.a(new v(this.f16810v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.f16800s.a(this.C0);
        this.f16757e0.addView(this.C0, h7.z5.e(56, 56, 53));
        dc dcVar2 = new dc(activity);
        this.D0 = dcVar2;
        dcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.D0.a(new v(new u("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new u9(this, 7));
        this.f16800s.a(this.D0);
        this.f16757e0.addView(this.D0, h7.z5.e(56, 56, 53));
        z zVar = new z(activity, this.f16800s);
        this.E0 = zVar;
        zVar.f17134a.u0(6);
        this.E0.setSelected((u) null);
        this.E0.setOnLayoutClick(new t9(this, i15));
        this.f16757e0.addView(this.E0, h7.z5.e(-1, 56, 53));
        w3 w3Var2 = new w3(activity, 1);
        w3Var2.m(1.0f, -20.0f);
        w3Var2.d = 5000L;
        w3Var2.i();
        w3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        w3Var2.f16984h0 = new ag.l3(18);
        this.f16768h1 = w3Var2;
        w3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16757e0.addView(this.f16768h1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        w3 w3Var3 = new w3(activity, 2);
        w3Var3.m(0.0f, 28.0f);
        w3Var3.d = 5000L;
        w3Var3.q(true);
        this.f16771i1 = w3Var3;
        this.f16757e0.addView(w3Var3, h7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        w3 w3Var4 = new w3(activity, 1);
        w3Var4.m(1.0f, -20.0f);
        w3Var4.d = 5000L;
        w3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f16774j1 = w3Var4;
        w3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16757e0.addView(this.f16774j1, h7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        hc hcVar = new hc(activity);
        Paint paint = new Paint(1);
        hcVar.f16083a = paint;
        Paint paint2 = new Paint(1);
        hcVar.f16084b = paint2;
        hcVar.f16086e = new org.telegram.ui.Components.y5(hcVar, 0L, 250L, erVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        hcVar.f16085c = i6Var;
        i6Var.k(0.3f, 250L, erVar);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(hcVar);
        i6Var.f29239b = 1;
        hcVar.a(0L, false);
        this.F0 = hcVar;
        i0(false, false);
        this.f16757e0.addView(this.F0, h7.z5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f16800s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        y6 y6Var = new y6(activity);
        this.K0 = y6Var;
        y6Var.setDelegate(oaVar);
        y6 y6Var2 = this.K0;
        boolean z10 = this.K1 == 1;
        y6Var2.f17098j0 = -1.0f;
        y6Var2.f17099k0 = z10;
        y6Var2.invalidate();
        this.f16764g0.addView(this.K0, h7.z5.e(-1, 100, 87));
        this.f16800s.a(this.K0);
        this.K0.e(this.f16814w0.j() ? this.f16814w0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.L0 = dVar;
        dVar.setRoundRadius(24);
        this.L0.setColor(-2473124);
        this.L0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.L0.setAlpha(0.0f);
        this.L0.setScaleX(0.8f);
        this.L0.setScaleY(0.8f);
        this.L0.setVisibility(8);
        this.f16764g0.addView(this.L0, h7.z5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new u9(this, 8));
        w3 w3Var5 = new w3(activity, 3);
        w3Var5.q(true);
        w3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        w3Var5.h = AndroidUtilities.dp(320.0f);
        w3Var5.d = 5000L;
        w3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = w3Var5;
        this.f16764g0.addView(w3Var5, h7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        k81 k81Var = new k81(activity);
        this.R0 = k81Var;
        k81Var.I = false;
        k81Var.setAlpha(0.0f);
        this.f16764g0.addView(this.R0, h7.z5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new ba(this, 4));
        k81 k81Var2 = this.R0;
        this.P1 = 0.0f;
        k81Var2.b(0.0f, false);
        int i18 = 12;
        i7 i7Var = new i7(activity, i10, new s9(this, i18));
        this.f16825z0 = i7Var;
        int i19 = 9;
        i7Var.f16119c = new t9(this, i19);
        this.f16764g0.addView(i7Var, h7.z5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        la laVar = new la(this, activity);
        this.M0 = laVar;
        int i20 = 10;
        laVar.setOnSwitchModeListener(new t9(this, i20));
        int i21 = 11;
        this.M0.setOnSwitchingModeListener(new t9(this, i21));
        this.f16770i0.addView(this.M0, h7.z5.e(-1, 48, 55));
        this.f16800s.a(this.M0);
        p2 p2Var4 = new p2(activity);
        this.N0 = p2Var4;
        p2Var4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f16770i0.addView(this.N0, h7.z5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f16800s.a(this.N0);
        this.N0.setOnClickListener(new u9(this, i19));
        p2 p2Var5 = new p2(activity);
        this.O0 = p2Var5;
        p2Var5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f16770i0.addView(this.O0, h7.z5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f16800s.a(this.O0);
        this.O0.setOnClickListener(new u9(this, i20));
        u3 u3Var = new u3(activity);
        this.P0 = u3Var;
        this.f16770i0.addView(u3Var, h7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f16800s.a(this.P0);
        u3 u3Var2 = new u3(activity);
        this.Q0 = u3Var2;
        u3Var2.f16902a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        u3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.f16770i0.addView(this.Q0, h7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f16800s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f16794q1 = dVar2;
        dVar2.setVisibility(8);
        this.f16794q1.setAlpha(0.0f);
        this.f16794q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f16794q1.setOnClickListener(new u9(this, i21));
        this.f16770i0.addView(this.f16794q1, h7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        i6 i6Var2 = new i6(activity);
        i6Var2.f16110b = new ArrayList();
        i6Var2.f16112e = true;
        i6Var2.h = true;
        View view = new View(activity);
        i6Var2.f16109a = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        i6Var2.addView(view, h7.z5.e(-1, -1, 119));
        i6Var2.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        i6Var2.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        i6Var2.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        i6Var2.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        i6Var2.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        i6Var2.d = string;
        i6Var2.f16112e = true;
        h6 h6Var = new h6(i6Var2, activity, string, true);
        i6Var2.f16111c = h6Var;
        h6Var.setContentDescription(LocaleController.getString(R.string.Send));
        i6Var2.addView(i6Var2.f16111c, h7.z5.c(-2.0f, -2));
        i6Var2.e();
        this.X0 = i6Var2;
        i6Var2.setVisibility(8);
        this.X0.setOnClickListener(new t9(this, i18));
        this.f16770i0.addView(this.X0, h7.z5.e(-1, 52, 23));
        fc fcVar = new fc(activity);
        this.l1 = fcVar;
        fcVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.f16753d0.addView(this.l1, h7.z5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        j6 j6Var = new j6(activity, i10, bVar);
        this.f16777k1 = j6Var;
        this.f16753d0.addView(j6Var, h7.z5.e(-1, -1, 119));
        m0(false);
    }

    public static sb E(Activity activity, int i10) {
        sb sbVar = B2;
        if (sbVar != null && (sbVar.f16745b != activity || sbVar.f16749c != i10)) {
            sbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new sb(activity, i10);
        }
        return B2;
    }

    public static void a(sb sbVar) {
        wa waVar = sbVar.f16818x0;
        if (waVar == null || waVar.getTextureView() == null) {
            sbVar.Y1 = false;
            return;
        }
        Bitmap bitmap = sbVar.f16818x0.getTextureView().getBitmap();
        if (bitmap == null) {
            sbVar.Y1 = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float fComputePerceivedBrightness = 0.0f;
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = 0;
            while (i11 < 10) {
                i11++;
                fComputePerceivedBrightness += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
            }
        }
        float f10 = fComputePerceivedBrightness / 100.0f;
        bitmap.recycle();
        sbVar.Y1 = f10 < 0.22f;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(sb sbVar) {
        Activity activity = sbVar.f16745b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 33) {
            z10 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            z10 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z10;
    }

    public static void c(sb sbVar) {
        ValueAnimator valueAnimator = sbVar.f16763f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            sbVar.f16763f2 = null;
        }
        int i10 = 0;
        sbVar.f16766g2 = false;
        kb kbVar = sbVar.f16796r;
        float f10 = kbVar.f16260a;
        float f11 = kbVar.f16261b;
        kbVar.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        sbVar.f16763f2 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ha(sbVar, f10, f11, i10));
        sbVar.f16763f2.setDuration(340L);
        sbVar.f16763f2.setInterpolator(er.h);
        sbVar.f16763f2.addListener(new ra(sbVar, i10));
        sbVar.f16763f2.start();
    }

    public static boolean d(sb sbVar) {
        Activity activity = sbVar.f16745b;
        if (Build.VERSION.SDK_INT < 23 || activity == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int iDp = AndroidUtilities.dp(35.0f);
        int i10 = -iDp;
        drawableMutate.setBounds(i10 / 4, i10, (iDp / 4) * 3, 0);
        spannableString.setSpan(new ab(drawableMutate, drawableMutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        sb sbVar = B2;
        if (sbVar != null) {
            sbVar.q(false);
        }
        B2 = null;
    }

    public final Drawable A() {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        return bitmapDecodeFile != null ? new BitmapDrawable(bitmapDecodeFile) : this.f16745b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.E1;
        if (arrayList != null) {
            return arrayList.size();
        }
        z7 z7Var = this.G1;
        if (z7Var != null) {
            return z7Var.r();
        }
        return 1;
    }

    public final String C() {
        wa waVar = this.f16818x0;
        if (waVar == null || waVar.getCameraSession() == null) {
            return null;
        }
        if (!this.f16818x0.isFrontface() || this.f16818x0.getCameraSession().hasFlashModes()) {
            return this.f16818x0.getCameraSession().getCurrentFlashMode();
        }
        p();
        return (String) this.f16795q2.get(this.f16792p2);
    }

    public final v0 D() {
        if (this.J0 == null) {
            v0 v0Var = new v0(this.f16745b);
            this.J0 = v0Var;
            this.f16764g0.addView(v0Var, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        wa waVar = this.f16818x0;
        if (waVar == null || waVar.getCameraSession() == null) {
            return null;
        }
        if (!this.f16818x0.isFrontface() || this.f16818x0.getCameraSession().hasFlashModes()) {
            return this.f16818x0.getCameraSession().getNextFlashMode();
        }
        p();
        ArrayList arrayList = this.f16795q2;
        return (String) arrayList.get(this.f16792p2 + 1 >= arrayList.size() ? 0 : this.f16792p2 + 1);
    }

    public final ImageView G() {
        if (this.f16758e1 == null) {
            oi0 oi0Var = new oi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f16754d1 = oi0Var;
            oi0Var.h = true;
            z7 z7Var = this.G1;
            if (z7Var == null || !z7Var.f17243y0) {
                oi0Var.N(0);
                this.f16754d1.K(0);
            } else {
                oi0Var.K(35);
                this.f16754d1.N(36);
            }
            this.f16754d1.W = true;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.f16742a);
            this.f16754d1.O(iV0, "Sunny");
            this.f16754d1.O(iV0, "Path 6");
            this.f16754d1.O(iV0, "Path");
            this.f16754d1.O(iV0, "Path 5");
            this.f16754d1.m();
            ImageView imageView = new ImageView(this.f16745b);
            this.f16758e1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f16758e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f16758e1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
            this.f16758e1.setOnClickListener(new u9(this, 0));
            this.f16758e1.setVisibility(8);
            this.f16758e1.setImageDrawable(this.f16754d1);
            this.f16758e1.setAlpha(0.0f);
            this.f16761f0.addView(this.f16758e1, 0, h7.z5.q(46, 56, 53));
        }
        return this.f16758e1;
    }

    public final void H() {
        va vaVar = this.f16798r1;
        if (vaVar == null) {
            return;
        }
        this.f16799r2 = null;
        vaVar.getTopLayout().setAlpha(0.0f);
        this.f16798r1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f16798r1.getBottomLayout().setAlpha(0.0f);
        this.f16798r1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f16798r1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f16798r1.setVisibility(8);
    }

    public final boolean I() {
        return !this.W1 && (this.f16814w0.j() ? this.f16814w0.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean J() {
        sa saVar;
        if (this.S || (saVar = this.I0) == null) {
            return false;
        }
        return saVar.getTranslationY() < ((float) ((this.f16783n.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
    }

    public final void K(int i10, boolean z10) {
        z7 z7Var;
        z7 z7Var2;
        int i11;
        int i12;
        float fDp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        ImageView imageView;
        z7 z7Var3;
        z7 z7Var4;
        z7 z7Var5;
        z7 z7Var6;
        wa waVar;
        int i13 = this.f16746b0;
        if (i10 == i13) {
            return;
        }
        this.f16746b0 = i10;
        AnimatorSet animatorSet = this.f16759e2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        O(i13, i10);
        i6 i6Var = this.X0;
        if (i6Var != null) {
            i6Var.b(i10 == 1, z10);
        }
        z zVar = this.E0;
        i0(i10 == 0 && this.K1 == 1 && !zVar.f17137e && !I(), z10);
        if (i10 != 1) {
            this.W0.a(z10);
        }
        c0(this.f16773j0, !zVar.f17137e, z10);
        c0(this.A0, (this.W1 || i10 != 0 || zVar.f17137e || this.U1 == null || I()) ? false : true, z10);
        boolean z11 = this.W1;
        gb gbVar = this.f16814w0;
        c0(this.B0, (z11 || i10 != 0 || (waVar = this.f16818x0) == null || !waVar.f15721a || zVar.f17137e || gbVar.j()) ? false : true, true);
        c0(this.C0, (this.W1 || i10 != 0 || zVar.f17137e) ? false : true, z10);
        m0(z10);
        u0 u0Var = this.f16744a1;
        ag.t0 t0Var = this.f16762f1;
        ri0 ri0Var = this.f16751c1;
        cc ccVar = this.f16791p1;
        cc ccVar2 = this.V0;
        d dVar = this.f16794q1;
        org.telegram.ui.ActionBar.h5 h5Var = this.f16779l0;
        ib ibVar = this.Y0;
        u3 u3Var = this.Q0;
        u3 u3Var2 = this.P0;
        i7 i7Var = this.f16825z0;
        hb hbVar = this.T0;
        ag.p1 p1Var = this.f16767h0;
        la laVar = this.M0;
        y6 y6Var = this.K0;
        if (!z10) {
            wa waVar2 = this.f16818x0;
            if (waVar2 != null) {
                waVar2.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            }
            hbVar.setAlpha(((i10 != 1 || gbVar.j()) && i10 != 2) ? 0.0f : 1.0f);
            gbVar.setAlpha((i10 == 0 || (i10 == 1 && gbVar.j())) ? 1.0f : 0.0f);
            y6Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            y6Var.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            i7Var.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            laVar.setAlpha((i10 != 0 || I()) ? 0.0f : 1.0f);
            laVar.setTranslationY((i10 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            u3Var2.setAlpha((i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f);
            u3Var.setAlpha((i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f);
            p1Var.setAlpha((i10 == 1 || i10 == 2) ? 1.0f : 0.0f);
            p1Var.setTranslationY((i10 == 1 || i10 == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            ibVar.setAlpha(i10 == 2 ? 0.0f : 1.0f);
            ri0Var.setAlpha((i10 == 1 && this.K1 == 1) ? 1.0f : 0.0f);
            t0Var.setAlpha((i10 != 1 || (this.K1 != 1 && ((z7Var2 = this.G1) == null || TextUtils.isEmpty(z7Var2.f17242y)))) ? 0.0f : 1.0f);
            int i14 = 1;
            u0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.f16758e1;
            if (imageView2 != null) {
                imageView2.setAlpha((i10 == 1 && (z7Var = this.G1) != null && z7Var.f17235u) ? 1.0f : 0.0f);
                i14 = 1;
            }
            ccVar2.setAlpha(i10 == i14 ? 1.0f : 0.0f);
            ccVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            h5Var.setAlpha((i10 == i14 || i10 == 2) ? 1.0f : 0.0f);
            dVar.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            N(i13, i10);
            return;
        }
        this.f16759e2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        wa waVar3 = this.f16818x0;
        if (waVar3 != null) {
            i11 = 1;
            arrayList.add(ObjectAnimator.ofFloat(waVar3, (Property<wa, Float>) View.ALPHA, i10 == 0 ? 1.0f : 0.0f));
        } else {
            i11 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i11];
        fArr[0] = ((i10 != i11 || gbVar.j()) && i10 != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(hbVar, (Property<hb, Float>) property, fArr));
        float[] fArr2 = new float[i11];
        fArr2[0] = (i10 == 0 || (i10 == i11 && gbVar.j())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(gbVar, (Property<gb, Float>) property, fArr2));
        float[] fArr3 = new float[i11];
        fArr3[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(y6Var, (Property<y6, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i11];
        fArr4[0] = i10 == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(y6Var, (Property<y6, Float>) property2, fArr4));
        float[] fArr5 = new float[i11];
        fArr5[0] = i10 == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(i7Var, (Property<i7, Float>) property, fArr5));
        float[] fArr6 = new float[i11];
        fArr6[0] = (i10 != 0 || I()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property2, (i10 != 0 || I()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property, (i10 == 0 && this.W1 && !I()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property, (i10 == 0 && !this.W1 && I()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, ((i10 == 1 && ((z7Var6 = this.G1) == null || z7Var6.J0 == 0)) || i10 == 2) ? 1.0f : 0.0f));
        if (i10 != 1 || ((z7Var5 = this.G1) != null && z7Var5.J0 != 0)) {
            i12 = 2;
            if (i10 != 2) {
                fDp = AndroidUtilities.dp(12.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property2, fDp));
            if (i10 == i12) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, f10));
            if (i10 != 1 || i10 == i12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, f11));
            if (i10 == i12) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, f12));
            if (i10 == 1) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, f13));
            if (i10 == 2) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, f14));
            if (i10 == 1 || this.K1 != 1) {
                f15 = 0.0f;
            } else {
                f15 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, f15));
            if (i10 == 1 || (this.K1 != 1 && ((z7Var4 = this.G1) == null || TextUtils.isEmpty(z7Var4.f17242y)))) {
                f16 = 0.0f;
            } else {
                f16 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, f16));
            if (i10 == 1) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, f17));
            imageView = this.f16758e1;
            if (imageView != null) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 || (z7Var3 = this.G1) == null || !z7Var3.f17235u) ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<k81, Float>) property, 0.0f));
            this.f16759e2.playTogether(arrayList);
            this.f16759e2.addListener(new qa(this, i13, i10, 0));
            this.f16759e2.setDuration(460L);
            this.f16759e2.setInterpolator(er.h);
            this.f16759e2.start();
        }
        i12 = 2;
        fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property2, fDp));
        if (i10 == i12) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, f10));
        if (i10 != 1) {
            f11 = 1.0f;
        } else {
            f11 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, f11));
        if (i10 == i12) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(dVar, (Property<d, Float>) property, f12));
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ccVar2, (Property<cc, Float>) property, f13));
        if (i10 == 2) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ccVar, (Property<cc, Float>) property, f14));
        if (i10 == 1) {
            f15 = 0.0f;
        } else {
            f15 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, f15));
        if (i10 == 1) {
            f16 = 0.0f;
        } else {
            f16 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, f16));
        if (i10 == 1) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, f17));
        imageView = this.f16758e1;
        if (imageView != null) {
            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i10 == 1 || (z7Var3 = this.G1) == null || !z7Var3.f17235u) ? 0.0f : 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.R0, (Property<k81, Float>) property, 0.0f));
        this.f16759e2.playTogether(arrayList);
        this.f16759e2.addListener(new qa(this, i13, i10, 0));
        this.f16759e2.setDuration(460L);
        this.f16759e2.setInterpolator(er.h);
        this.f16759e2.start();
    }

    public final void L(Runnable runnable, long j10) {
        if (this.O1 || this.G1 == null) {
            return;
        }
        y9 y9Var = this.f16752c2;
        if (y9Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y9Var);
        }
        this.f16755d2 = true;
        this.O1 = true;
        this.f16752c2 = new y9(this, runnable, 1);
        this.T0.setAlpha(0.0f);
        this.T0.setVisibility(0);
        this.T0.n(this.G1, this.f16752c2, j10);
        this.T0.p(this.G1, false);
        AndroidUtilities.runOnUIThread(this.f16752c2, 800L);
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: lh.sb.M():boolean");
    }

    public final void N(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            v(false);
            this.K0.setVisibility(8);
            this.R0.setVisibility(8);
            this.M0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.f16791p1.setVisibility(8);
            this.f16767h0.setVisibility(i11 == 1 ? 0 : 8);
            this.Y0.setVisibility(8);
            this.f16794q1.setVisibility(8);
        }
        if (i10 == 1) {
            this.X0.setVisibility(8);
            this.f16767h0.setVisibility(i11 == 2 ? 0 : 8);
            this.f16751c1.setVisibility(8);
            this.f16762f1.setVisibility(8);
            this.f16744a1.setVisibility(8);
            ImageView imageView = this.f16758e1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.T0.setVisibility(i11 == 2 ? 0 : 8);
            this.V0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            this.f16779l0.setVisibility(i11 == 2 ? 0 : 8);
            w();
            this.l1.setAlpha(0.0f);
            this.l1.setVisibility(8);
            this.W0.setVisibility(8);
            this.D1 = null;
            this.E1 = null;
            this.F1 = null;
        }
        if (i11 == 1) {
            z7 z7Var = this.G1;
            if (z7Var == null || !z7Var.f17221n) {
                u();
                H();
            }
            te0 te0Var = this.f16823y1;
            if (te0Var != null) {
                te0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            z7 z7Var2 = this.G1;
            this.W0.setVisibility((z7Var2 == null || z7Var2.f17211h0 < 30000) ? 8 : 0);
            this.f16767h0.setAlpha(1.0f);
            this.f16767h0.setTranslationY(0.0f);
            z7 z7Var3 = this.G1;
            this.Y0.setVisibility((z7Var3 == null || z7Var3.J0 == 0) ? 0 : 8);
        }
        if (i11 == 0 && this.R1) {
            D().setVisibility(0);
            v0 v0VarD = D();
            v0VarD.f16934r.d(0.0f, true);
            v0VarD.a(true);
            kh.c cVar = v0VarD.h;
            if (cVar != null) {
                AndroidUtilities.cancelRunOnUIThread(cVar);
            }
            kh.c cVar2 = new kh.c(v0VarD, 6);
            v0VarD.h = cVar2;
            AndroidUtilities.runOnUIThread(cVar2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        te0 te0Var2 = this.f16823y1;
        if (te0Var2 != null) {
            te0Var2.setAllowTouch(i11 == 1 && ((i12 = this.f16750c0) == -1 || i12 == 1));
        }
        ib ibVar = this.Y0;
        if (ibVar != null) {
            ibVar.f16330a0 = i11 != 1;
        }
        if (i11 == 1) {
            int i13 = this.f16749c;
            MediaDataController.getInstance(i13).checkStickers(0);
            MediaDataController.getInstance(i13).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i13).loadRecents(2, false, true, false);
            jh.s6 storiesController = MessagesController.getInstance(i13).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i13).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        SpannableStringBuilder spannableStringBuilderAppend;
        z7 z7Var;
        z7 z7Var2;
        int i12;
        boolean z10;
        z7 z7Var3;
        z7 z7Var4;
        a61 textureView;
        z7 z7Var5;
        long j10 = 0;
        boolean z11 = true;
        if (i11 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            y6 y6Var = this.K0;
            if (y6Var != null) {
                y6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            z7 z7Var6 = this.G1;
            if (z7Var6 != null) {
                z7Var6.i(false);
                this.G1 = null;
            }
            gb gbVar = this.f16814w0;
            if (gbVar != null) {
                gbVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new s9(this, 18));
            v0 v0Var = this.J0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.S0.e(true);
            w3 w3Var = this.f16768h1;
            if (w3Var != null) {
                w3Var.e(true);
            }
        }
        int i13 = this.f16749c;
        if (i11 == 1 || i10 == 1) {
            this.f16744a1.setEntry(i11 == 1 ? this.G1 : null);
            if (this.K1 == 1) {
                this.f16751c1.setVisibility(0);
                z7 z7Var7 = this.G1;
                f0(z7Var7 != null && z7Var7.Y, false);
                this.f16762f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((tf0) this.f16762f1.f662c).a(this.T0.k(), false);
                this.f16779l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                z7 z7Var8 = this.G1;
                if (z7Var8 == null || TextUtils.isEmpty(z7Var8.f17242y)) {
                    this.f16779l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f16751c1.setVisibility(8);
                    this.f16762f1.setVisibility(0);
                    ((tf0) this.f16762f1.f662c).a(true, false);
                    this.f16779l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f16744a1.setVisibility(0);
            z7 z7Var9 = this.G1;
            if (z7Var9 == null || !z7Var9.f17235u) {
                ImageView imageView = this.f16758e1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                G().setVisibility(0);
                o0(false);
            }
            this.X0.setVisibility(0);
            this.T0.setVisibility(0);
            z7 z7Var10 = this.G1;
            this.Y0.setVisibility(((z7Var10 == null || z7Var10.J0 == 0) && this.f16797r0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            z7 z7Var11 = this.G1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((z7Var11 == null || z7Var11.J0 == 0) && this.f16797r0 == 0) ? 68.0f : 12.0f);
            this.U0.setLayoutParams(layoutParams);
            this.f16767h0.setVisibility(0);
            this.f16767h0.clearFocus();
            z7 z7Var12 = this.G1;
            this.Y0.A(z7Var12 == null ? 86400 : z7Var12.I0, false);
            this.Y0.setPeriodVisible(!MessagesController.getInstance(i13).premiumFeaturesBlocked() && ((z7Var = this.G1) == null || !z7Var.f17209g));
            z7 z7Var13 = this.G1;
            this.Y0.setHasRoundVideo((z7Var13 == null || z7Var13.f17224o0 == null) ? false : true);
            ib ibVar = this.Y0;
            if (ibVar == null) {
                j10 = 0;
            } else {
                z7 z7Var14 = this.G1;
                if (z7Var14 == null || !z7Var14.f17221n) {
                    j10 = 0;
                    ibVar.v(null, null);
                } else {
                    TLRPC.Peer peer = z7Var14.f17227q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String userName = UserObject.getUserName(MessagesController.getInstance(i13).getUser(Long.valueOf(peer.user_id)));
                        z7 z7Var15 = this.G1;
                        spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        z7Var15.f17225p = spannableStringBuilderAppend;
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        z7 z7Var16 = this.G1;
                        spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        z7Var16.f17225p = spannableStringBuilderAppend;
                    }
                    String str2 = this.G1.f17231s;
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    CharSequence charSequence = str2;
                    if (zIsEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new pa(), 0, spannableString.length(), 33);
                        charSequence = spannableString;
                    }
                    this.Y0.v(charSequence, spannableStringBuilderAppend);
                }
            }
            z7 z7Var17 = this.G1;
            boolean z12 = (z7Var17 != null && z7Var17.v() && this.G1.t()) ? false : true;
            cc ccVar = this.V0;
            boolean z13 = ccVar.f15779f0;
            ccVar.f15779f0 = z12;
            ccVar.f15776e0.f(z12, true);
            ccVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i11 == 2 || i10 == 2) {
            this.f16779l0.setVisibility(0);
            this.f16791p1.setVisibility(0);
            z7 z7Var18 = this.G1;
            if (z7Var18 != null && z7Var18.f17197b0) {
                this.f16779l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f16767h0.setVisibility(0);
            this.f16794q1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f16779l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.J1 = false;
            z7 z7Var19 = this.G1;
            boolean z14 = (z7Var19 == null || z7Var19.J0 == j10) ? false : true;
            boolean z15 = z7Var19 != null && z7Var19.f17209g;
            if (z15) {
                i12 = R.string.Done;
            } else {
                i12 = z14 ? R.string.UploadBotPreview : R.string.Next;
            }
            String string = LocaleController.getString(i12);
            boolean z16 = !z14;
            i6 i6Var = this.X0;
            if (!TextUtils.equals(string, i6Var.d) || z16 != i6Var.f16112e) {
                i6Var.removeView(i6Var.f16111c);
                Context context = i6Var.getContext();
                i6Var.d = string;
                i6Var.f16112e = z16;
                h6 h6Var = new h6(i6Var, context, string, z16);
                i6Var.f16111c = h6Var;
                h6Var.setContentDescription(string);
                i6Var.addView(i6Var.f16111c, h7.z5.c(-2.0f, -2));
                i6Var.e();
            }
            this.f16791p1.setVisibility(8);
            this.f16794q1.setVisibility(8);
            if (!this.f16755d2) {
                z7 z7Var20 = this.G1;
                if (z7Var20 == null || !z7Var20.f17235u) {
                    this.T0.set(z7Var20);
                } else {
                    this.T0.l(z7Var20);
                }
            }
            this.f16755d2 = false;
            this.Y0.f16338f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i13).storyEntitiesAllowed() ? null : new s9(this, 19));
            this.Z0.setVisibility(this.D1 == null ? 8 : 0);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                ka kaVar = this.Z0;
                kaVar.c(false, false);
                kaVar.f16229c = arrayList;
                kaVar.d = arrayList2;
                kaVar.f16230e = arrayList3;
                kaVar.f16235w = new pz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                kaVar.G = new pz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                kaVar.f16228b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            this.V0.setMaxCount((z14 || z15 || this.D1 != null || ((z7Var5 = this.G1) != null && (z7Var5.v() || !this.G1.K))) ? 1 : 3);
            if (i10 != 2) {
                z7 z7Var21 = this.G1;
                if (z7Var21 != null && (z7Var21.f17199c || z7Var21.f17209g || this.f16793q0)) {
                    if (z7Var21.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    z7 z7Var22 = this.G1;
                    if (z7Var22.K && z7Var22.f17195a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new ba(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i10 != 2) {
                    ib ibVar2 = this.Y0;
                    ibVar2.R = true;
                    ibVar2.f16338f.setText("");
                }
            }
            z7 z7Var23 = this.G1;
            this.X0.d(4, z7Var23 == null || ((!z7Var23.f17235u || z7Var23.K) && !z7Var23.v()));
            this.X0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (z7Var4 = this.G1) == null || z7Var4.f17235u || z7Var4.v()) ? false : true);
            if (this.J1 || this.Y0.o()) {
                z10 = false;
            } else {
                jh.s6 storiesController = MessagesController.getInstance(i13).getStoriesController();
                int iB = B();
                jh.l6 l6VarO = storiesController.o();
                if (l6VarO == null || !l6VarO.a(storiesController.f13955a, iB) || ((z7Var3 = this.G1) != null && (z7Var3.f17209g || z7Var3.J0 != j10))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            this.X0.setShareEnabled(z10);
            z7 z7Var24 = this.G1;
            this.f16751c1.setImageResource((z7Var24 == null || !z7Var24.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.f16779l0.setVisibility(0);
            this.f16779l0.setTranslationX(0.0f);
            z7 z7Var25 = this.G1;
            if (z7Var25 != null && z7Var25.J0 != j10) {
                this.f16779l0.l("", false);
            } else if (z7Var25 != null && z7Var25.f17209g) {
                this.f16779l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
            } else if (z7Var25 != null && z7Var25.f17235u) {
                this.f16779l0.l(LocaleController.getString(R.string.RecorderRepost), false);
            } else if (z7Var25 == null || !z7Var25.f17221n) {
                this.f16779l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f16779l0, 32.0f, i13);
                this.f16779l0.setTranslationX(-AndroidUtilities.dp(6.0f));
                SpannableString spannableString2 = new SpannableString("a");
                spannableString2.setSpan(g5Var, 0, 1, 33);
                if (this.G1.f17227q instanceof TLRPC.TL_peerUser) {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(this.G1.f17227q.user_id));
                    g5Var.e(user);
                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i13).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.G1.f17227q)));
                    g5Var.b(chat2);
                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) (chat2 != null ? chat2.title : ""));
                }
                this.f16779l0.l(spannableStringBuilder, false);
            }
            z11 = true;
        }
        if (i10 == z11) {
            ib ibVar3 = this.Y0;
            b70 b70Var = ibVar3.R0;
            if (b70Var != null) {
                b70Var.u();
                ibVar3.R0 = null;
            }
            this.f16765g1.e(z11);
            ka kaVar2 = this.Z0;
            if (kaVar2.I) {
                kaVar2.c(false, z11);
            }
        }
        if (i11 == 2 && (z7Var2 = this.G1) != null) {
            if (z7Var2.f17205e0 < j10) {
                z7Var2.f17205e0 = j10;
            }
            this.I1 = z7Var2.f17205e0;
            long duration = this.T0.getDuration() < 100 ? this.G1.f17211h0 : this.T0.getDuration();
            z7 z7Var26 = this.G1;
            if (z7Var26.f17211h0 <= 0) {
                z7Var26.f17211h0 = duration;
            }
            File file = z7Var26.Z0;
            if (file == null) {
                file = z7Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            z7 z7Var27 = this.G1;
            this.f16791p1.o(false, absolutePath, z7Var27.f17211h0, z7Var27.P);
            z7 z7Var28 = this.G1;
            float f10 = duration;
            long j11 = (long) (z7Var28.Z * f10);
            long j12 = (long) (z7Var28.f17194a0 * f10);
            cc ccVar2 = this.f16791p1;
            ccVar2.V0 = j11;
            ccVar2.W0 = j12;
            xb xbVar = ccVar2.h;
            if (xbVar != null) {
                xb.a(xbVar, true);
            }
            a8 a8Var = new a8(this, 1);
            this.f16791p1.setDelegate(new ta(a8Var));
            float fMax = (this.I1 / Math.max(1L, duration)) * 0.96f;
            this.f16791p1.setVideoLeft(fMax);
            this.f16791p1.setVideoRight(0.04f + fMax);
            a8Var.run(Boolean.TRUE, Float.valueOf(fMax));
        }
        te0 te0Var = this.f16823y1;
        if (te0Var != null) {
            te0Var.setAllowTouch(false);
        }
        w3 w3Var2 = this.f16771i1;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        org.telegram.ui.Components.ec.e();
        ib ibVar4 = this.Y0;
        if (ibVar4 != null) {
            g gVar = ibVar4.f16338f;
            gVar.d();
            gVar.k(true);
            this.Y0.f16330a0 = true;
        }
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(8, i11 != 1);
        }
        va vaVar = this.f16798r1;
        if (vaVar != null) {
            vaVar.setCoverPreview(i11 != 1);
        }
        w3 w3Var3 = this.f16774j1;
        if (w3Var3 != null) {
            w3Var3.e(true);
        }
        gb gbVar2 = this.f16814w0;
        gbVar2.setPreview(i11 == 1 && gbVar2.j());
    }

    public final void P() {
        yf.z0 z0Var;
        boolean z10 = false;
        if (this.f16746b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Z(false);
            } else {
                this.f16806t2 = new s9(this, 3);
            }
        }
        ib ibVar = this.Y0;
        if (ibVar != null) {
            ibVar.f16338f.s();
        }
        y6 y6Var = this.K0;
        if (y6Var != null) {
            y6Var.h();
        }
        j6 j6Var = this.f16777k1;
        if (j6Var != null) {
            jh.s6 storiesController = MessagesController.getInstance(j6Var.f16188a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f13961i.f(UserConfig.getInstance(storiesController.f13955a).clientUserId);
            j6Var.f16189b = storiesController.f13956b.m() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            j6Var.f16190c.invalidate();
        }
        va vaVar = this.f16798r1;
        if (vaVar != null && (z0Var = vaVar.K0.d) != null) {
            z0Var.postRunnable(z0Var.f50138w);
        }
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(0, false);
        }
        a1 a1Var = MessagesController.getInstance(this.f16749c).getStoriesController().f13974w;
        if (a1Var.f15626c || a1Var.d) {
            return;
        }
        a1Var.d = true;
        x0 x0Var = new x0(a1Var, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.f15624a);
        messagesStorage.getStorageQueue().postRunnable(new hh.t5(messagesStorage, z10, x0Var, 3));
    }

    public final void Q(int i10, int i11) {
        va vaVar;
        db dbVar;
        eb ebVar;
        va vaVar2;
        if (i11 == 0) {
            this.f16773j0.setVisibility(8);
        }
        if (i10 == 0 && (vaVar2 = this.f16798r1) != null) {
            vaVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Y0.setVisibility(8);
            this.f16751c1.setVisibility(i11 == 2 ? 0 : 8);
            this.f16762f1.setVisibility(i11 == 2 ? 0 : 8);
            this.f16744a1.setVisibility(i11 == 2 ? 0 : 8);
            ImageView imageView = this.f16758e1;
            if (imageView != null) {
                imageView.setVisibility(i11 == 2 ? 0 : 8);
            }
            this.V0.setVisibility(i11 == 2 ? 0 : 8);
            this.f16779l0.setVisibility(8);
        }
        boolean z10 = true;
        this.T0.setAllowCropping(i11 == -1);
        if ((i11 == 0 || i10 == 0) && (vaVar = this.f16798r1) != null) {
            vaVar.Z0.setLayerType(0, null);
        }
        te0 te0Var = this.f16823y1;
        if (te0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            te0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            db dbVar2 = this.f16785n1;
            if (dbVar2 != null) {
                dbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (dbVar = this.f16785n1) != null) {
            dbVar.setVisibility(8);
            this.f16785n1.setAppearProgress(0.0f);
            db dbVar3 = this.f16785n1;
            dbVar3.f16158x = null;
            g0 g0Var = dbVar3.f16153f;
            g0Var.H = null;
            g0Var.d = null;
            g0Var.F = false;
            dbVar3.d.setVisibility(8);
            dbVar3.f16149a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            eb ebVar2 = this.f16788o1;
            if (ebVar2 != null) {
                ebVar2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i10 != 4 || (ebVar = this.f16788o1) == null) {
            return;
        }
        ebVar.setVisibility(8);
        this.f16788o1.setAppearProgress(0.0f);
        eb ebVar3 = this.f16788o1;
        ebVar3.f16366b = null;
        g0 g0Var2 = ebVar3.h;
        g0Var2.H = null;
        g0Var2.d = null;
        g0Var2.F = false;
        ebVar3.f16368e.setVisibility(8);
        ebVar3.setVisibility(8);
    }

    public final void R(mb mbVar) {
        jh.l6 l6VarO;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f16749c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f16793q0 = false;
        this.f16756e = false;
        this.f16820x2 = false;
        this.f16787o0.f16531g = false;
        WindowManager windowManager = this.f16760f;
        if (windowManager != null && (rbVar = this.f16783n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f16783n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f16783n, layoutParams);
            g0();
        }
        this.f16814w0.setCameraThumb(A());
        if (this.f16797r0 == 0 && (l6VarO = MessagesController.getInstance(i10).getStoriesController().o()) != null && l6VarO.a(i10, 1)) {
            h0(l6VarO, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.D;
        if (mbVar != null) {
            this.B = mbVar;
            this.F = mbVar.f16454a;
            rectF.set(mbVar.f16456c);
            this.C = mbVar.f16455b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16796r.c();
        int i12 = this.F;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f16753d0.setBackgroundColor(i11);
        this.f16796r.setTranslationX(0.0f);
        this.f16796r.setTranslationY(0.0f);
        this.f16796r.b(0.0f);
        this.f16796r.setScaleX(1.0f);
        this.f16796r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16745b, 1);
        g(1.0f, true, new s9(this, 6));
        e();
        this.f16797r0 = 0L;
        this.f16801s0 = "";
    }

    public final void S(lb lbVar, z7 z7Var, long j10) {
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f16749c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f16793q0 = false;
        this.f16756e = false;
        this.f16820x2 = false;
        WindowManager windowManager = this.f16760f;
        if (windowManager != null && (rbVar = this.f16783n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f16783n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f16783n, layoutParams);
            g0();
        }
        this.G1 = z7Var;
        this.K1 = z7Var.K ? 1 : 0;
        this.f16787o0.f16531g = false;
        RectF rectF = this.D;
        if (lbVar != null) {
            this.B = lbVar;
            this.F = lbVar.f16454a;
            rectF.set(lbVar.f16456c);
            this.C = lbVar.f16455b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16796r.c();
        int i11 = this.F;
        this.f16753d0.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        this.f16796r.setTranslationX(0.0f);
        this.f16796r.setTranslationY(0.0f);
        this.f16796r.b(0.0f);
        this.f16796r.setScaleX(1.0f);
        this.f16796r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16745b, 1);
        z7 z7Var2 = this.G1;
        if (z7Var2 != null) {
            this.Y0.setText(z7Var2.C0);
        }
        L(new ja(this, 0), j10);
        K(this.G1.f17197b0 ? 2 : 1, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.f16797r0 = 0L;
        this.f16801s0 = "";
    }

    public final void T() {
        b70 b70Var;
        hb hbVar = this.T0;
        if (hbVar != null) {
            hbVar.x(4, true);
        }
        ib ibVar = this.Y0;
        if (ibVar != null && (b70Var = ibVar.R0) != null) {
            b70Var.u();
            ibVar.R0 = null;
        }
        ag.g2 g2Var = new ag.g2((org.telegram.ui.ActionBar.n2) new xa(this, 1), 14, false);
        g2Var.setOnDismissListener(new ga(this, 1));
        g2Var.show();
    }

    public final void U(lb lbVar, z7 z7Var) {
        jh.l6 l6VarO;
        rb rbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f16749c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f16793q0 = true;
        this.f16756e = false;
        this.f16820x2 = false;
        WindowManager windowManager = this.f16760f;
        if (windowManager != null && (rbVar = this.f16783n) != null && rbVar.getParent() == null) {
            rb rbVar2 = this.f16783n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, rbVar2, layoutParams);
            windowManager.addView(this.f16783n, layoutParams);
            g0();
        }
        this.G1 = z7Var;
        r9.a(i10, z7Var);
        z7 z7Var2 = this.G1;
        int i11 = (z7Var2 == null || !z7Var2.K) ? 0 : 1;
        this.K1 = i11;
        this.f16787o0.f16531g = z7Var2 != null && z7Var2.f17235u && i11 == 1;
        if (this.f16797r0 == 0 && (l6VarO = MessagesController.getInstance(i10).getStoriesController().o()) != null && l6VarO.a(i10, 1)) {
            h0(l6VarO, true);
        }
        RectF rectF = this.D;
        if (lbVar != null) {
            this.B = lbVar;
            this.F = lbVar.f16454a;
            rectF.set(lbVar.f16456c);
            this.C = lbVar.f16455b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16796r.c();
        int i12 = this.F;
        this.f16753d0.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        this.f16796r.setTranslationX(0.0f);
        this.f16796r.setTranslationY(0.0f);
        this.f16796r.b(0.0f);
        this.f16796r.setScaleX(1.0f);
        this.f16796r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16745b, 1);
        z7 z7Var3 = this.G1;
        if (z7Var3 != null) {
            this.Y0.setText(z7Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new s9(this, 6));
        e();
        this.f16797r0 = 0L;
        this.f16801s0 = "";
    }

    public final void V() {
        yf.b1 b1Var = this.f16802s1;
        if (b1Var != null) {
            b1Var.bringToFront();
        }
        View view = this.f16805t1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f16808u1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f16811v1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f16815w1;
        if (view4 != null) {
            view4.bringToFront();
        }
        fc fcVar = this.l1;
        if (fcVar != null) {
            fcVar.bringToFront();
        }
        te0 te0Var = this.f16823y1;
        if (te0Var != null) {
            te0Var.bringToFront();
        }
        ke0 ke0Var = this.A1;
        if (ke0Var != null) {
            ke0Var.bringToFront();
        }
        me0 me0Var = this.B1;
        if (me0Var != null) {
            me0Var.bringToFront();
        }
        j6 j6Var = this.f16777k1;
        if (j6Var != null) {
            j6Var.bringToFront();
        }
        q qVar = this.f16781m1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void W(z7 z7Var, boolean z10) {
        z7 z7Var2;
        boolean z11;
        if (z7Var == null || this.T0.getWidth() <= 0 || this.T0.getHeight() <= 0) {
            return;
        }
        File file = z10 ? z7Var.O0 : z7Var.N0;
        if (file != null) {
            file.delete();
        }
        View view = this.f16814w0.j() ? this.f16814w0 : this.T0;
        float f10 = z10 ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        canvas.scale(f10, f10);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
        canvas.restore();
        Paint paint = new Paint(2);
        a61 textureView = this.T0.getTextureView();
        if (z7Var.K && !z7Var.f17235u && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f10, f10);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = z7Var.Q0;
        if (file2 != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / bitmapDecodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                bitmapDecodeFile.recycle();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        File file3 = z7Var.P0;
        if (file3 != null) {
            try {
                Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / bitmapDecodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(bitmapDecodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                bitmapDecodeFile2.recycle();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        va vaVar = this.f16798r1;
        if (vaVar != null && vaVar.N0 != null) {
            canvas.save();
            canvas.scale(f10, f10);
            va vaVar2 = this.f16798r1;
            vaVar2.E0 = true;
            z5 z5Var = vaVar2.N0;
            z5Var.f50372a = true;
            z5Var.draw(canvas);
            va vaVar3 = this.f16798r1;
            vaVar3.N0.f50372a = false;
            vaVar3.E0 = false;
            canvas.restore();
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 40, 22, true);
        File fileW = z7.w(this.f16749c, "jpg");
        if (z10) {
            z7Var2 = z7Var;
            z11 = z10;
            Utilities.searchQueue.postRunnable(new cg.j(this, bitmapCreateBitmap, z11, fileW, z7Var2, 2));
        } else {
            z7Var2 = z7Var;
            z11 = z10;
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(fileW));
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        if (!z11) {
            z7Var2.N0 = fileW;
        }
        z7Var2.f17198b1 = bitmapCreateScaledBitmap;
    }

    public final void X() {
        jh.l6 l6VarO;
        char c10;
        q9 q9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (q9Var != null) {
            q9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            u0 u0Var = this.f16744a1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            h6 h6Var = this.X0.f16111c;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(h6Var, i10);
            return;
        }
        ib ibVar = this.Y0;
        if (ibVar != null && ibVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.j6 j6Var = ibVar.v;
            int i11 = -this.Q1;
            this.Q1 = i11;
            AndroidUtilities.shakeViewSpring(j6Var, i11);
            ibVar.e();
            return;
        }
        z7 z7Var = this.G1;
        int i12 = this.f16749c;
        int i13 = 0;
        if ((z7Var == null || (!z7Var.f17209g && z7Var.J0 == 0)) && (l6VarO = MessagesController.getInstance(i12).storiesController.o()) != null && l6VarO.a(i12, B())) {
            h0(l6VarO, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        jh.b bVar = this.f16742a;
        if (ibVar != null && !this.G1.D0) {
            CharSequence text = ibVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((yz0[]) spannable.getSpans(0, text.length(), yz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.mc(this.f16783n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new s9(this, 27), bVar)).k(true);
                    int i14 = -this.Q1;
                    this.Q1 = i14;
                    AndroidUtilities.shakeViewSpring(ibVar, i14);
                    return;
                }
            }
        }
        z7 z7Var2 = this.G1;
        if (z7Var2.f17209g || z7Var2.J0 != 0) {
            z7Var2.f17218l = false;
            i(null);
            p0();
            return;
        }
        if (this.J != 0) {
            z7Var2.f17237v0 = MessagesController.getInstance(i12).getInputPeer(this.J);
        }
        hb hbVar = this.T0;
        hbVar.x(3, true);
        q9 q9Var2 = new q9(this.f16745b, this.G1.I0, bVar);
        q9Var2.q1(this.G1.E0);
        q9Var2.p1(this.G1.f17237v0);
        q9Var2.B = this.I;
        q9Var2.Q = new t9(this, 14);
        q9Var2.e1(!this.f16814w0.j());
        ArrayList arrayList = this.E1;
        q9Var2.m1(arrayList == null ? this.G1.r() : arrayList.size());
        q9Var2.k1(false);
        CharSequence text2 = ibVar.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (u41 u41Var : (u41[]) ((Spanned) text2).getSpans(0, text2.length(), u41.class)) {
                if (u41Var != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(u41Var.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i15 = -1;
            for (int i16 = 0; i16 < text2.length(); i16++) {
                char cCharAt = text2.charAt(i16);
                if (cCharAt == '@') {
                    i15 = i16 + 1;
                } else if (cCharAt == ' ') {
                    if (i15 != -1) {
                        String string = text2.subSequence(i15, i16).toString();
                        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(string);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f22527id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(string)) {
                                arrayList2.add(string);
                            }
                        }
                    }
                    i15 = -1;
                }
            }
            c10 = 1;
            if (i15 != -1) {
                String string2 = text2.subSequence(i15, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(string2);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f22527id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(string2)) {
                        arrayList2.add(string2);
                    }
                }
            }
        } else {
            c10 = 1;
        }
        q9Var2.O = arrayList2;
        q9Var2.S = new t9(this, 15);
        q9Var2.T = new t9(this, 16);
        q9Var2.P = new ba(this, 10);
        this.m0 = q9Var2;
        z7 z7Var3 = this.G1;
        if (z7Var3.K) {
            if (hbVar != null && !z7Var3.f17208f0 && this.f16746b0 != 2) {
                z7Var3.f17205e0 = hbVar.getCurrentPosition();
                t9 t9Var = new t9(this, 17);
                yf.b1 b1Var = this.f16802s1;
                View view = this.f16811v1;
                View[] viewArr = new View[3];
                viewArr[0] = hbVar;
                viewArr[c10] = b1Var;
                viewArr[2] = view;
                hbVar.h(t9Var, viewArr);
            }
            q9 q9Var3 = this.m0;
            Bitmap bitmap = this.G1.f17210g0;
            s9 s9Var = new s9(this, 20);
            if (bitmap != null) {
                q9Var3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            q9Var3.X = bitmapDrawable;
            q9Var3.Y = s9Var;
            h1 h1Var = q9Var3.f16593b;
            if (h1Var != null) {
                for (View view2 : h1Var.getViewPages()) {
                    if (view2 instanceof k9) {
                        k9 k9Var = (k9) view2;
                        k9Var.g(false);
                        k9Var.e(false);
                    }
                }
            }
        }
        this.m0.setOnDismissListener(new ga(this, i13));
        this.m0.show();
    }

    public final void Y(nb nbVar) {
        int i10 = 0;
        RectF rectF = this.D;
        if (nbVar != null) {
            this.B = nbVar;
            this.F = nbVar.f16454a;
            rectF.set(nbVar.f16456c);
            this.C = nbVar.f16455b;
        } else {
            this.B = null;
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.F;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f16753d0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        if (!this.f16803s2 || z10) {
            this.f16789o2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f16745b) != null) {
                boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.f16789o2 = z11;
                if (z11) {
                    Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    dq dqVar = new dq(new ColorDrawable(-14540254), drawableMutate);
                    int iDp = AndroidUtilities.dp(64.0f);
                    int iDp2 = AndroidUtilities.dp(64.0f);
                    dqVar.f27823e = iDp;
                    dqVar.f27824f = iDp2;
                    this.f16814w0.setCameraThumb(dqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f16742a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ba(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f22702a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f16803s2 = true;
                }
            }
            if (this.f16789o2) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                r();
            } else {
                CameraController.getInstance().initCamera(new s9(this, 0));
            }
        }
    }

    public final void b0(Runnable runnable) {
        wa waVar = this.f16818x0;
        if (waVar == null || waVar.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new j3.m(this, this.f16818x0.getTextureView().getBitmap(), runnable, 18));
        } catch (Throwable unused) {
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
            view.animate().alpha(z10 ? 1.0f : 0.0f).setUpdateListener(new ua(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 2)).setDuration(320L).setInterpolator(er.h).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z10 ? 0 : 8);
            view.setAlpha(z10 ? 1.0f : 0.0f);
            n0();
        }
    }

    public final void d0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f16760f.updateViewLayout(this.f16783n, layoutParams);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jh.l6 l6VarO;
        z7 z7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            y6 y6Var = this.K0;
            if (y6Var != null) {
                y6Var.h();
            }
            if (this.f16772i2 == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                int i13 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.f16772i2;
                if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.f16772i2 = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.storiesDraftsUpdated) {
            y6 y6Var2 = this.K0;
            if (y6Var2 == null || this.R1) {
                return;
            }
            y6Var2.h();
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f16746b0;
            int i15 = this.f16749c;
            if (i14 != 1) {
                if (i14 == 0 && (l6VarO = MessagesController.getInstance(i15).getStoriesController().o()) != null && l6VarO.a(i15, 1)) {
                    z7 z7Var2 = this.G1;
                    if (z7Var2 == null || z7Var2.J0 == 0) {
                        h0(l6VarO, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.J1 && !this.Y0.o()) {
                jh.s6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                int iB = B();
                jh.l6 l6VarO2 = storiesController.o();
                if (l6VarO2 == null || !l6VarO2.a(storiesController.f13955a, iB) || ((z7Var = this.G1) != null && (z7Var.f17209g || z7Var.J0 != 0))) {
                    z10 = true;
                }
            }
            this.X0.setShareEnabled(z10);
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f16749c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.A0.clearAnimation();
        wa waVar = this.f16818x0;
        if ((waVar != null && waVar.isDual()) || this.W1) {
            str = null;
        }
        this.U1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.A0, false, true);
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3551) {
            if (iHashCode == 109935) {
                str.equals("off");
            } else if (iHashCode == 3005871 && str.equals("auto")) {
                i10 = R.drawable.media_photo_flash_auto2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else if (str.equals("on")) {
            i10 = R.drawable.media_photo_flash_on2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
        } else {
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        dc dcVar = this.A0;
        if (dcVar.f15884n != i10) {
            dcVar.f15884n = i10;
            ValueAnimator valueAnimator = dcVar.f15885r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dcVar.f15885r = null;
            }
            dcVar.setDrawable(i10);
        }
        if (this.f16746b0 == 0 && !this.E0.f17137e && this.U1 != null && !I()) {
            z10 = true;
        }
        c0(this.A0, z10, true);
    }

    public final void f(boolean z10) {
        v0 v0Var;
        this.G0 = z10;
        Boolean bool = this.f16780l2;
        if (bool == null || bool.booleanValue() != z10) {
            int i10 = 0;
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            if (this.I0.Q) {
                this.f16782m2 = new ca(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f16775j2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f16775j2 = null;
            }
            o1.j jVar = this.f16778k2;
            if (jVar != null) {
                jVar.c();
                this.f16778k2 = null;
            }
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            sa saVar = this.I0;
            if (saVar != null) {
                saVar.G = false;
            }
            if (z10 && (v0Var = this.J0) != null) {
                v0Var.a(false);
            }
            kb kbVar = this.f16796r;
            if (kbVar != null) {
                kbVar.setImportantForAccessibility(z10 ? 4 : 0);
            }
            this.I0.setImportantForAccessibility(z10 ? 0 : 4);
            this.f16780l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            rb rbVar = this.f16783n;
            float height = z10 ? 0.0f : (rbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            int i11 = 1;
            Math.max(1, rbVar.getHeight());
            sa saVar2 = this.I0;
            saVar2.G = !z10;
            this.f16766g2 = this.f16763f2 == null;
            if (z10) {
                o1.j jVar2 = new o1.j(saVar2, o1.h.f19130n, height);
                this.f16778k2 = jVar2;
                jVar2.f19147u.a(0.75f);
                this.f16778k2.f19147u.b(350.0f);
                this.f16778k2.a(new da(this, height, i10));
                this.f16778k2.f();
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
                this.f16775j2 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ea(this, i10));
                this.f16775j2.addListener(new ra(this, i11));
                this.f16775j2.setDuration(450L);
                this.f16775j2.setInterpolator(er.h);
                this.f16775j2.start();
            }
            if (!z10 && !this.O1) {
                this.f16769h2 = null;
            }
            if (z10 || this.f16746b0 != 0 || this.f16789o2) {
                return;
            }
            r();
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f16747b1 == null) {
            oi0 oi0Var = new oi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f16747b1 = oi0Var;
            oi0Var.B *= 1.5f;
        }
        this.f16751c1.setAnimation(this.f16747b1);
        if (!z11) {
            this.f16747b1.L(z10 ? 20 : 0, false, false);
            return;
        }
        if (z10) {
            oi0 oi0Var2 = this.f16747b1;
            if (oi0Var2.X > 20) {
                oi0Var2.L(0, false, false);
            }
            this.f16747b1.N(20);
            this.f16747b1.start();
            return;
        }
        oi0 oi0Var3 = this.f16747b1;
        int i10 = oi0Var3.X;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        oi0Var3.N(43);
        this.f16747b1.start();
    }

    public final void g(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        kb kbVar = this.f16796r;
        if (!z10) {
            this.H = null;
            this.E = f10;
            k();
            kbVar.invalidate();
            this.f16783n.invalidate();
            runnable.run();
            o();
            return;
        }
        this.L.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.H = Float.valueOf(this.G);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.E, f10);
        this.A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ea(this, 5));
        this.A.addListener(new hh.n5(this, f10, runnable, 3));
        if (f10 < 1.0f && this.v) {
            this.A.setDuration(250L);
            this.A.setInterpolator(er.h);
        } else if (f10 > 0.0f || kbVar.f16260a < AndroidUtilities.dp(20.0f)) {
            this.A.setDuration(300L);
            this.A.setInterpolator(new u1.a());
        } else if (f10 >= 0.0f || !this.K) {
            this.A.setDuration(400L);
            this.A.setInterpolator(er.h);
        } else {
            this.A.setDuration(200L);
            this.A.setInterpolator(er.h);
            this.K = false;
        }
        this.A.start();
    }

    public final void g0() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.f16783n.findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 3));
        }
    }

    public final void h(boolean z10, boolean z11) {
        z zVar;
        if (z10) {
            w3 w3Var = this.f16768h1;
            if (w3Var != null) {
                w3Var.e(true);
            }
            w3 w3Var2 = this.f16771i1;
            if (w3Var2 != null) {
                w3Var2.e(true);
            }
            w3 w3Var3 = this.f16765g1;
            if (w3Var3 != null) {
                w3Var3.e(true);
            }
            w3 w3Var4 = this.S0;
            if (w3Var4 != null) {
                w3Var4.e(true);
            }
        }
        if (this.W1 == z10 && this.X1 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.V1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.V1 = null;
        }
        this.W1 = z10;
        this.X1 = I();
        if (z10 && (zVar = this.E0) != null && zVar.f17137e) {
            zVar.a(false, z11);
        }
        m0(z11);
        la laVar = this.M0;
        u3 u3Var = this.Q0;
        u3 u3Var2 = this.P0;
        if (!z11) {
            u3Var2.setAlpha((z10 && this.f16746b0 == 0 && !I()) ? 1.0f : 0.0f);
            u3Var2.setTranslationY((z10 && this.f16746b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            u3Var.setAlpha((!z10 && this.f16746b0 == 0 && I()) ? 0.6f : 0.0f);
            u3Var.setTranslationY((!z10 && this.f16746b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f));
            laVar.setAlpha((z10 || this.f16746b0 != 0 || I()) ? 0.0f : 1.0f);
            laVar.setTranslationY((z10 || this.f16746b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.V1 = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property, (z10 && this.f16746b0 == 0 && !I()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(u3Var2, (Property<u3, Float>) property2, (z10 && this.f16746b0 == 0 && !I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property, (!z10 && this.f16746b0 == 0 && I()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(u3Var, (Property<u3, Float>) property2, (!z10 && this.f16746b0 == 0 && I()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property, (z10 || this.f16746b0 != 0 || I()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(laVar, (Property<la, Float>) property2, (z10 || this.f16746b0 != 0 || I()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.V1.setDuration(260L);
        this.V1.setInterpolator(er.h);
        this.V1.start();
    }

    public final void h0(jh.l6 l6Var, boolean z10) {
        if (this.f16812v2) {
            return;
        }
        ya yaVar = new ya(l6Var.b(), this.f16749c, this.f16745b, new xa(this, 0), null);
        yaVar.T = B();
        yaVar.setOnDismissListener(new p70(2, this, z10));
        this.T0.x(7, true);
        this.f16812v2 = true;
        yaVar.show();
    }

    public final void i(Runnable runnable) {
        z7 z7Var;
        Runnable runnable2;
        hb hbVar;
        ve0 ve0Var = this.f16819x1;
        if (ve0Var == null || (z7Var = this.G1) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        z7Var.f17214j = ve0Var.d() | z7Var.f17214j;
        z7 z7Var2 = this.G1;
        ve0 ve0Var2 = this.f16819x1;
        File file = z7Var2.Z0;
        if (file != null) {
            file.delete();
            z7Var2.Z0 = null;
        }
        MediaController.SavedFilterState savedFilterState = ve0Var2.getSavedFilterState();
        z7Var2.f17195a1 = savedFilterState;
        if (z7Var2.K) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = ve0Var2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i10 = z7Var2.R;
                    matrix.postScale(i10 == 1 ? -1.0f : 1.0f, i10 == 2 ? -1.0f : 1.0f, z7Var2.f17217k0 / 2.0f, z7Var2.f17219l0 / 2.0f);
                    matrix.postRotate(-z7Var2.Q);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    z7Var2.f17222n0.preScale(z7Var2.f17217k0 / bitmapCreateBitmap.getWidth(), z7Var2.f17219l0 / bitmapCreateBitmap.getHeight());
                    z7Var2.f17217k0 = bitmapCreateBitmap.getWidth();
                    z7Var2.f17219l0 = bitmapCreateBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = z7Var2.Z0;
                    if (file2 != null && file2.exists()) {
                        z7Var2.Z0.delete();
                    }
                    String strK = z7.k(z7Var2.L);
                    boolean z10 = "png".equals(strK) || "webp".equals(strK);
                    z7Var2.Z0 = z7.w(z7Var2.f17193a, z10 ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            bitmapCreateBitmap.compress(z10 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(z7Var2.Z0));
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        bitmapCreateBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new cg.c(z7Var2, bitmapCreateBitmap, z10, runnable2, 4));
                    }
                } else if (runnable != null) {
                    runnable.run();
                }
            } else if (runnable != null) {
                runnable.run();
            }
            runnable2 = runnable;
        }
        if (runnable2 == null) {
            z7 z7Var3 = this.G1;
            if (z7Var3.K || (hbVar = this.T0) == null) {
                return;
            }
            hbVar.set(z7Var3);
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z11) {
            this.F0.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(350L).setInterpolator(er.h).withEndAction(new ca(this, z10, 1)).start();
            return;
        }
        this.F0.clearAnimation();
        this.F0.setAlpha(z10 ? 1.0f : 0.0f);
        if (z10) {
            return;
        }
        this.F0.b(false, false);
    }

    public final void j() {
        if (this.G1 == null || this.f16826z1 == null || this.f16753d0.getMeasuredWidth() <= 0 || this.f16753d0.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        int i10 = this.G1.Q;
        if (i10 != 0) {
            matrix.postRotate(-i10, this.f16753d0.getMeasuredWidth() / 2.0f, this.f16753d0.getMeasuredHeight() / 2.0f);
            if ((this.G1.Q / 90) % 2 == 1) {
                matrix.postScale(this.f16753d0.getMeasuredWidth() / this.f16753d0.getMeasuredHeight(), this.f16753d0.getMeasuredHeight() / this.f16753d0.getMeasuredWidth(), this.f16753d0.getMeasuredWidth() / 2.0f, this.f16753d0.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.f16753d0.getMeasuredWidth()) * this.G1.f17217k0, (1.0f / this.f16753d0.getMeasuredHeight()) * this.G1.f17219l0);
        matrix.postConcat(this.G1.f17222n0);
        matrix.postScale(this.f16753d0.getMeasuredWidth() / this.G1.f17213i0, this.f16753d0.getMeasuredHeight() / this.G1.f17215j0);
        this.f16826z1.setTransform(matrix);
        this.f16826z1.invalidate();
    }

    public final void j0(boolean z10) {
        k81 k81Var = this.R0;
        if ((k81Var.getTag() != null && z10) || (k81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                s9 s9Var = new s9(this, 25);
                this.a2 = s9Var;
                AndroidUtilities.runOnUIThread(s9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f16748b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        k81Var.setTag(z10 ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f16748b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            k81Var.setVisibility(0);
        }
        this.f16748b2.playTogether(ObjectAnimator.ofFloat(k81Var, (Property<k81, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f16748b2.addListener(new ag.x(16, this, z10));
        this.f16748b2.start();
        if (z10) {
            s9 s9Var2 = new s9(this, 26);
            this.a2 = s9Var2;
            AndroidUtilities.runOnUIThread(s9Var2, 2000L);
        }
    }

    public final void k() {
        jh.j3 j3Var;
        if (this.F != 1) {
            return;
        }
        float left = this.f16753d0.getLeft();
        float top = this.f16753d0.getTop();
        float measuredWidth = this.f16753d0.getMeasuredWidth();
        float measuredHeight = this.f16753d0.getMeasuredHeight();
        RectF rectF = this.Z;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.f16796r.getX(), this.f16796r.getY());
        float f10 = this.E;
        RectF rectF2 = this.D;
        RectF rectF3 = this.Y;
        AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
        this.f16753d0.setAlpha(this.E);
        float f11 = rectF3.left;
        fb fbVar = this.f16753d0;
        fbVar.setTranslationX((f11 - fbVar.getLeft()) - this.f16796r.getX());
        float f12 = rectF3.top;
        fb fbVar2 = this.f16753d0;
        fbVar2.setTranslationY((f12 - fbVar2.getTop()) - this.f16796r.getY());
        nb nbVar = this.B;
        if (nbVar != null && (j3Var = nbVar.f16458f) != null) {
            j3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
            this.B.f16458f.setTranslationY((rectF.top - rectF2.top) * this.E);
        }
        this.f16753d0.setScaleX(rectF3.width() / this.f16753d0.getMeasuredWidth());
        this.f16753d0.setScaleY(rectF3.height() / this.f16753d0.getMeasuredHeight());
        this.f16757e0.setAlpha(this.E);
        this.f16764g0.setAlpha(this.E);
        this.f16767h0.setAlpha(this.E);
        if (this.f16746b0 == 2) {
            this.f16794q1.setAlpha(this.E);
        }
    }

    public final void k0() {
        q9 q9Var = this.m0;
        if (q9Var != null) {
            q9Var.dismiss();
            this.m0 = null;
        }
        q9 q9Var2 = new q9(this.f16745b, 86400, this.f16742a);
        q9Var2.o1();
        q9Var2.q1(this.f16807u0);
        TLRPC.InputPeer inputPeer = this.f16804t0;
        if (inputPeer == null) {
            inputPeer = this.J != 0 ? MessagesController.getInstance(this.f16749c).getInputPeer(this.J) : new TLRPC.TL_inputPeerSelf();
        }
        q9Var2.p1(inputPeer);
        q9Var2.B = this.I;
        q9Var2.Q = new t9(this, 18);
        q9Var2.e1(false);
        q9Var2.m1(1);
        q9Var2.k1(false);
        q9Var2.S = new t9(this, 19);
        q9Var2.P = new ba(this, 12);
        this.m0 = q9Var2;
        q9Var2.show();
    }

    public final void l() {
        z7 z7Var;
        Bitmap bitmapCreateBitmap;
        Bitmap blurBitmap;
        boolean z10;
        int i10;
        ImageReceiver photoImage;
        ?? r10;
        if (this.f16798r1 == null || (z7Var = this.G1) == null) {
            return;
        }
        z7Var.f();
        this.G1.f17214j |= this.f16798r1.u0();
        z7 z7Var2 = this.G1;
        ArrayList arrayList = z7Var2.T0;
        if (arrayList == null) {
            z7Var2.T0 = new ArrayList();
        } else {
            arrayList.clear();
        }
        va vaVar = this.f16798r1;
        z7 z7Var3 = this.G1;
        vaVar.t0(z7Var3.T0, false, false, false, false, z7Var3);
        z7 z7Var4 = this.G1;
        if (!z7Var4.K) {
            z7Var4.S0 = Utilities.clamp(this.f16798r1.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.f16798r1.getMasks();
        this.G1.U0 = masks != null ? new ArrayList(masks) : null;
        z7 z7Var5 = this.G1;
        boolean z11 = z7Var5.K;
        boolean zE = z7Var5.E();
        this.G1.T0 = new ArrayList();
        va vaVar2 = this.f16798r1;
        z7 z7Var6 = this.G1;
        Bitmap bitmapT0 = vaVar2.t0(z7Var6.T0, true, false, false, !z11, z7Var6);
        if (this.G1.T0.isEmpty()) {
            this.G1.T0 = null;
        }
        try {
            File file = this.G1.P0;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.G1.R0;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.G1.Q0;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        z7 z7Var7 = this.G1;
        z7Var7.P0 = null;
        z7Var7.R0 = null;
        z7Var7.Q0 = null;
        int i11 = this.f16749c;
        FileLoader fileLoader = FileLoader.getInstance(i11);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        z7 z7Var8 = this.G1;
        z7Var7.P0 = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapT0, compressFormat, z7Var8.f17213i0, z7Var8.f17215j0, 87, false, 101, 101), true);
        if (bitmapT0 != null && !bitmapT0.isRecycled()) {
            bitmapT0.recycle();
        }
        z7 z7Var9 = this.G1;
        if (z7Var9.f17235u) {
            File file4 = z7Var9.Y0;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                this.G1.Y0 = null;
            }
            z7 z7Var10 = this.G1;
            long j10 = z7Var10.f17245z0;
            if (j10 != Long.MIN_VALUE) {
                Drawable drawableE = z7Var10.f17241x0;
                if (drawableE == null) {
                    drawableE = q6.e(null, i11, j10, this.Y1);
                }
                if (drawableE != null) {
                    this.G1.Y0 = z7.w(i11, "webp");
                    z7 z7Var11 = this.G1;
                    bitmapCreateBitmap = Bitmap.createBitmap(z7Var11.f17213i0, z7Var11.f17215j0, Bitmap.Config.ARGB_8888);
                    z7.j(new Canvas(bitmapCreateBitmap), drawableE, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    try {
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.Y0));
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                        } catch (Throwable th) {
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (!bitmapCreateBitmap.isRecycled()) {
                        }
                    }
                }
            }
        }
        z7 z7Var12 = this.G1;
        boolean z12 = z7Var12.f17235u;
        float f10 = z12;
        if (z12) {
            File file5 = z7Var12.X0;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.G1.X0 = null;
            }
            z7 z7Var13 = this.G1;
            boolean z13 = z7Var13.f17235u;
            f10 = z13;
            if (z13 && (z10 = z7Var13.K)) {
                i10 = z7Var13.f17217k0;
                int i12 = z7Var13.f17219l0;
                zf.e1 e1VarS0 = this.f16798r1.s0();
                if (e1VarS0 != null) {
                    zf.x0 x0Var = e1VarS0.f50388n0;
                    if (x0Var.getChildCount() == 1 && i10 > 0 && i12 > 0) {
                        if ((x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1) && (photoImage = ((org.telegram.ui.Cells.s1) x0Var.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            f10 = i10;
                            f10 = i10;
                            f10 = i10;
                            f10 = i10;
                            float f11 = i10;
                            float f12 = i12;
                            float fMax = Math.max(photoImage.getImageWidth() / f11, photoImage.getImageHeight() / f12);
                            int i13 = (int) ((f11 * fMax) / 2.0f);
                            int i14 = (int) ((f12 * fMax) / 2.0f);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
                            float[] fArr = new float[8];
                            for (int i15 = 0; i15 < photoImage.getRoundRadius().length; i15++) {
                                int i16 = i15 * 2;
                                fArr[i16] = photoImage.getRoundRadius()[i15];
                                fArr[i16 + 1] = photoImage.getRoundRadius()[i15];
                            }
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            Path path = new Path();
                            canvas.scale(0.5f, 0.5f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f13 = (i13 * 2.0f) / 2.0f;
                            float imageWidth = f13 - (photoImage.getImageWidth() / 2.0f);
                            float f14 = (i14 * 2.0f) / 2.0f;
                            float imageHeight = f14 - (photoImage.getImageHeight() / 2.0f);
                            ?? imageWidth2 = (photoImage.getImageWidth() / 2.0f) + f13;
                            rectF.set(imageWidth, imageHeight, imageWidth2, (photoImage.getImageHeight() / 2.0f) + f14);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.G1.X0 = z7.w(i11, "webp");
                                Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
                                imageWidth2 = this.G1.X0;
                                bitmapCreateBitmap2.compress(compressFormat2, 100, new FileOutputStream((File) imageWidth2));
                                r10 = imageWidth2;
                            } catch (Exception e12) {
                                FileLog.e(e12);
                                this.G1.X0 = null;
                                r10 = imageWidth2;
                            }
                            bitmapCreateBitmap2.recycle();
                            f10 = r10;
                        }
                    }
                }
            }
        }
        if (!zE) {
            va vaVar3 = this.f16798r1;
            ArrayList arrayList2 = new ArrayList();
            z7 z7Var14 = this.G1;
            int i17 = z7Var14.f17213i0;
            Bitmap bitmapT1 = vaVar3.t0(arrayList2, false, true, false, false, z7Var14);
            z7 z7Var15 = this.G1;
            FileLoader fileLoader2 = FileLoader.getInstance(i11);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            z7 z7Var16 = this.G1;
            f10 = z7Var16.f17213i0;
            z7Var15.R0 = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapT1, compressFormat3, f10, z7Var16.f17215j0, 87, false, 101, 101), true);
            if (bitmapT1 != null && !bitmapT1.isRecycled()) {
                bitmapT1.recycle();
            }
        }
        bitmapCreateBitmap = f10;
        if (this.f16798r1.K0.getPainting().E) {
            blurBitmap = this.f16798r1.getBlurBitmap();
            z7 z7Var17 = this.G1;
            FileLoader fileLoader3 = FileLoader.getInstance(i11);
            Bitmap.CompressFormat compressFormat4 = Bitmap.CompressFormat.PNG;
            z7 z7Var18 = this.G1;
            z7Var17.Q0 = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat4, z7Var18.f17213i0, z7Var18.f17215j0, 87, false, 101, 101), true);
            if (blurBitmap != null && !blurBitmap.isRecycled()) {
                bitmapCreateBitmap = blurBitmap;
                bitmapCreateBitmap = blurBitmap;
                blurBitmap.recycle();
                bitmapCreateBitmap = blurBitmap;
            }
        }
        bitmapCreateBitmap = blurBitmap;
        bitmapCreateBitmap = blurBitmap;
        bitmapCreateBitmap = blurBitmap;
    }

    public final void l0(int i10, boolean z10, boolean z11) {
        float f10;
        db dbVar;
        int i11;
        float f11;
        eb ebVar;
        Property property;
        int i12;
        z7 z7Var;
        float f12;
        ImageView imageView;
        int i13;
        fb fbVar;
        int contentHeight;
        float f13;
        me0 me0Var;
        ke0 ke0Var;
        float f14;
        float f15;
        float fDp;
        float fDp2;
        Property property2;
        float f16;
        float f17;
        float f18;
        float f19;
        ImageView imageView2;
        int i14;
        z7 z7Var2;
        boolean z12;
        float f20;
        float f21;
        float f22;
        z7 z7Var3;
        uf.e eVar;
        uf.e eVar2;
        va vaVar;
        va vaVar2;
        int i15 = this.f16750c0;
        if (i15 != i10 || z10) {
            ib ibVar = this.Y0;
            if (i10 == -1 || ibVar == null || !ibVar.K1) {
                this.f16750c0 = i10;
                AnimatorSet animatorSet = this.f16786n2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f16786n2 = null;
                }
                org.telegram.ui.ActionBar.h5 h5Var = this.f16779l0;
                cc ccVar = this.V0;
                u0 u0Var = this.f16744a1;
                p2 p2Var = this.f16773j0;
                ag.t0 t0Var = this.f16762f1;
                ri0 ri0Var = this.f16751c1;
                if (i15 != i10) {
                    if (i10 == -1) {
                        p2Var.setVisibility(0);
                        ibVar.setVisibility(0);
                        va vaVar3 = this.f16798r1;
                        if (vaVar3 != null) {
                            vaVar3.D0(null, true);
                        }
                        u0Var.setVisibility(0);
                        z7 z7Var4 = this.G1;
                        if (z7Var4 == null || !z7Var4.f17235u) {
                            ImageView imageView3 = this.f16758e1;
                            if (imageView3 != null) {
                                imageView3.setVisibility(8);
                            }
                        } else {
                            G().setVisibility(0);
                            o0(false);
                        }
                        h5Var.setVisibility(0);
                        if (this.K1 == 1) {
                            ri0Var.setVisibility(0);
                            t0Var.setVisibility(0);
                        } else {
                            z7 z7Var5 = this.G1;
                            if (z7Var5 != null && !TextUtils.isEmpty(z7Var5.f17242y)) {
                                ri0Var.setVisibility(8);
                                t0Var.setVisibility(0);
                            }
                        }
                        ccVar.setVisibility(0);
                    }
                    if (i10 == 0 && (vaVar2 = this.f16798r1) != null) {
                        vaVar2.setVisibility(0);
                    }
                    if ((i10 == 0 || i15 == 0) && (vaVar = this.f16798r1) != null) {
                        vaVar.Z0.setLayerType(2, null);
                    }
                    va vaVar4 = this.f16798r1;
                    if (vaVar4 != null) {
                        vaVar4.K1.b(i10 != 0);
                    }
                    ibVar.H.b(i10 != -1);
                    org.telegram.ui.Components.ec.e();
                    if (this.f16819x1 != null && i15 == 1) {
                        i(null);
                    }
                    te0 te0Var = this.f16823y1;
                    if (te0Var != null) {
                        te0Var.setAllowTouch(false);
                    }
                    this.f16765g1.e(true);
                    rb rbVar = this.f16783n;
                    hb hbVar = this.T0;
                    Activity activity = this.f16745b;
                    if (i10 == 3) {
                        if (this.f16785n1 == null) {
                            db dbVar2 = new db(this, activity, hbVar);
                            this.f16785n1 = dbVar2;
                            rbVar.addView(dbVar2.d);
                            rbVar.addView(this.f16785n1);
                        }
                        this.f16785n1.setVisibility(0);
                        z7 z7Var6 = this.G1;
                        if (z7Var6 != null) {
                            this.f16785n1.setEntry(z7Var6);
                        }
                    } else if (i15 == 3) {
                        hbVar.b();
                        db dbVar3 = this.f16785n1;
                        if (dbVar3 != null) {
                            dbVar3.f16149a.setCropEditorDrawing(dbVar3);
                            dbVar3.f16159y = true;
                        }
                    }
                    if (i10 == 4) {
                        if (this.f16788o1 == null) {
                            eb ebVar2 = new eb(this, activity, hbVar);
                            this.f16788o1 = ebVar2;
                            rbVar.addView(ebVar2.f16368e);
                            rbVar.addView(this.f16788o1);
                        }
                        this.f16788o1.setVisibility(0);
                    } else if (i15 == 4) {
                        hbVar.b();
                        eb ebVar3 = this.f16788o1;
                        if (ebVar3 != null) {
                            ebVar3.A = true;
                        }
                    }
                }
                this.X0.b((i10 == -1 || i10 == 2) && this.E > 0.0f, z11);
                ArrayList arrayList = new ArrayList();
                ve0 ve0Var = this.f16819x1;
                boolean z13 = ve0Var == null && i10 == 1;
                float f23 = 1.0f;
                if (i10 != 1) {
                    f10 = 0.0f;
                    if (i15 == 1 && ve0Var != null) {
                        this.f16799r2 = null;
                        arrayList.add(ObjectAnimator.ofFloat(ve0Var.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16819x1.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                    }
                    if (i10 == 0) {
                        u();
                        this.f16799r2 = this.f16798r1;
                        Property property3 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property3, f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getTopLayout(), (Property<View, Float>) property3, 0.0f, 1.0f));
                        View topLayout = this.f16798r1.getTopLayout();
                        Property property4 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property4, -AndroidUtilities.dp(16.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property3, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property4, AndroidUtilities.dp(48.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f10));
                    } else if (i15 == 0 && this.f16798r1 != null) {
                        this.f16799r2 = null;
                        Property property5 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property5, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getTopLayout(), (Property<View, Float>) property5, f10));
                        View topLayout2 = this.f16798r1.getTopLayout();
                        Property property6 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property6, -AndroidUtilities.dp(16.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property5, f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property6, AndroidUtilities.dp(48.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                    }
                    dbVar = this.f16785n1;
                    if (dbVar != null) {
                        eVar2 = dbVar.h;
                        if (i10 == 3) {
                            Property property7 = View.ALPHA;
                            i11 = 2;
                            arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<uf.e, Float>) property7, 0.0f, 1.0f));
                            uf.e eVar3 = this.f16785n1.h;
                            Property property8 = View.TRANSLATION_Y;
                            f11 = 52.0f;
                            arrayList.add(ObjectAnimator.ofFloat(eVar3, (Property<uf.e, Float>) property8, AndroidUtilities.dp(52.0f), f10));
                            arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property7, 0.0f, 1.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property8, AndroidUtilities.dp(52.0f), f10));
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f16785n1.getAppearProgress(), 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new ea(this, 1));
                            arrayList.add(valueAnimatorOfFloat);
                        } else {
                            i11 = 2;
                            f11 = 52.0f;
                            if (i15 == 3) {
                                Property property9 = View.ALPHA;
                                arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<uf.e, Float>) property9, 1.0f, 0.0f));
                                uf.e eVar4 = this.f16785n1.h;
                                Property property10 = View.TRANSLATION_Y;
                                arrayList.add(ObjectAnimator.ofFloat(eVar4, (Property<uf.e, Float>) property10, f10, AndroidUtilities.dp(52.0f)));
                                arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property9, 1.0f, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property10, f10, AndroidUtilities.dp(52.0f)));
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.f16785n1.getAppearProgress(), f10);
                                valueAnimatorOfFloat2.addUpdateListener(new ea(this, i11));
                                arrayList.add(valueAnimatorOfFloat2);
                            }
                        }
                    } else {
                        i11 = 2;
                        f11 = 52.0f;
                    }
                    ebVar = this.f16788o1;
                    if (ebVar != null) {
                        eVar = ebVar.f16370n;
                        if (i10 == 4) {
                            Property property11 = View.ALPHA;
                            float[] fArr = new float[i11];
                            
                            fArr[0] = 0.0f;
                            fArr[1] = 1.0f;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property11, fArr));
                            uf.e eVar5 = this.f16788o1.f16370n;
                            Property property12 = View.TRANSLATION_Y;
                            float[] fArr2 = new float[i11];
                            fArr2[0] = AndroidUtilities.dp(f11);
                            fArr2[1] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(eVar5, (Property<uf.e, Float>) property12, fArr2));
                            float[] fArr3 = new float[i11];
                            
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            arrayList.add(ObjectAnimator.ofFloat(this.f16788o1.f16371r, (Property<FrameLayout, Float>) property11, fArr3));
                            FrameLayout frameLayout = this.f16788o1.f16371r;
                            float[] fArr4 = new float[i11];
                            fArr4[0] = AndroidUtilities.dp(f11);
                            fArr4[1] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property12, fArr4));
                            float[] fArr5 = new float[i11];
                            fArr5[0] = this.f16788o1.getAppearProgress();
                            fArr5[1] = 1.0f;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr5);
                            valueAnimatorOfFloat3.addUpdateListener(new ea(this, 3));
                            arrayList.add(valueAnimatorOfFloat3);
                        } else if (i15 == 4) {
                            Property property13 = View.ALPHA;
                            float[] fArr6 = new float[i11];
                            
                            fArr6[0] = 1.0f;
                            fArr6[1] = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property13, fArr6));
                            uf.e eVar6 = this.f16788o1.f16370n;
                            Property property14 = View.TRANSLATION_Y;
                            float fDp3 = AndroidUtilities.dp(f11);
                            float[] fArr7 = new float[i11];
                            fArr7[0] = f10;
                            fArr7[1] = fDp3;
                            arrayList.add(ObjectAnimator.ofFloat(eVar6, (Property<uf.e, Float>) property14, fArr7));
                            float[] fArr8 = new float[i11];
                            
                            fArr8[0] = 1.0f;
                            fArr8[1] = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(this.f16788o1.f16371r, (Property<FrameLayout, Float>) property13, fArr8));
                            FrameLayout frameLayout2 = this.f16788o1.f16371r;
                            float fDp4 = AndroidUtilities.dp(f11);
                            float[] fArr9 = new float[i11];
                            fArr9[0] = f10;
                            fArr9[1] = fDp4;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property14, fArr9));
                            float[] fArr10 = new float[i11];
                            fArr10[0] = this.f16788o1.getAppearProgress();
                            fArr10[1] = f10;
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr10);
                            valueAnimatorOfFloat4.addUpdateListener(new ea(this, 4));
                            arrayList.add(valueAnimatorOfFloat4);
                        }
                    }
                    property = View.ALPHA;
                    if (i10 != -1 || i10 == 2) {
                        i12 = 1;
                        float f24 = this.K1 == 1 ? 1.0f : 0.0f;
                        float[] fArr11 = new float[i12];
                        fArr11[0] = f24;
                        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.f17242y)))) ? 1.0f : 0.0f));
                        if (i10 != -1 || i10 == 2) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, f12));
                        imageView = this.f16758e1;
                        if (imageView != null) {
                            i13 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, ((i10 != -1 || i10 == 2) && (z7Var3 = this.G1) != null && z7Var3.f17235u) ? 1.0f : 0.0f));
                        } else {
                            i13 = 1;
                        }
                        int i16 = this.f16746b0;
                        float[] fArr12 = new float[i13];
                        fArr12[0] = ((i16 != i13 || i16 == 2) && i10 == -1) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr12));
                        fbVar = this.f16753d0;
                        if (i10 == i13) {
                            fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.2f);
                            contentHeight = AndroidUtilities.dp(164.0f);
                        } else if (i10 == 0) {
                            fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.6f);
                            contentHeight = AndroidUtilities.dp(40.0f);
                        } else if (i10 == 2) {
                            fbVar.setPivotY(0.0f);
                            contentHeight = ccVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            contentHeight = 0;
                        }
                        if (contentHeight > 0) {
                            int height = fbVar.getHeight() - ((int) fbVar.getPivotY());
                            f13 = (height - contentHeight) / height;
                        } else {
                            f13 = 1.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_X, f13));
                        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_Y, f13));
                        if (i10 == -1) {
                            arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.TRANSLATION_Y, 0.0f));
                        }
                        me0Var = this.B1;
                        if (me0Var != null) {
                            if (i10 == 1) {
                                f22 = 1.0f;
                            } else {
                                f22 = 0.0f;
                            }
                            arrayList.add(ObjectAnimator.ofFloat(me0Var, (Property<me0, Float>) property, f22));
                        }
                        ke0Var = this.A1;
                        if (ke0Var != null) {
                            if (i10 == 1) {
                                f21 = 1.0f;
                            } else {
                                f21 = 0.0f;
                            }
                            arrayList.add(ObjectAnimator.ofFloat(ke0Var, (Property<ke0, Float>) property, f21));
                        }
                        if (i10 == -1) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, f14));
                        if (i10 != -1 || i10 == 2) {
                            f15 = 1.0f;
                        } else {
                            f15 = 0.0f;
                        }
                        float[] fArr13 = {f15};
                        ag.p1 p1Var = this.f16767h0;
                        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property, fArr13));
                        Property property15 = View.TRANSLATION_Y;
                        if (i10 != -1 || i10 == 2) {
                            fDp = 0.0f;
                        } else {
                            fDp = AndroidUtilities.dp(120.0f);
                        }
                        arrayList.add(ObjectAnimator.ofFloat(p1Var, (Property<ag.p1, Float>) property15, fDp));
                        if (i10 != -1 && i10 != 2) {
                            f23 = 0.0f;
                        }
                        FrameLayout frameLayout3 = this.U0;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, f23));
                        if (i10 == 2) {
                            fDp2 = AndroidUtilities.dp(68.0f);
                        } else {
                            fDp2 = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()));
                        }
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property15, fDp2));
                        LinearLayout linearLayout = this.f16761f0;
                        linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                        property2 = View.ROTATION;
                        if (i10 == 2) {
                            f16 = -90.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property2, f16));
                        if (i10 == 2) {
                            f17 = 90.0f;
                        } else {
                            f17 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, f17));
                        if (i10 == 2) {
                            f18 = 90.0f;
                        } else {
                            f18 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property2, f18));
                        if (i10 == 2) {
                            f19 = 90.0f;
                        } else {
                            f19 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property2, f19));
                        imageView2 = this.f16758e1;
                        if (imageView2 != null) {
                            if (i10 == 2) {
                                f20 = 90.0f;
                            } else {
                                f20 = 0.0f;
                            }
                            arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, f20));
                        }
                        if (this.f16784n0.c()) {
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            i14 = 0;
                            valueAnimatorOfFloat5.addUpdateListener(new ua(this, i14));
                            arrayList.add(valueAnimatorOfFloat5);
                        } else {
                            i14 = 0;
                        }
                        if (ccVar != null) {
                            z7Var2 = this.G1;
                            if (z7Var2 == null && z7Var2.v() && this.G1.t() && i10 != 2) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (ccVar.f15779f0 == z12 || !z11) {
                                ccVar.f15779f0 = z12;
                                if (!z11) {
                                    ccVar.f15776e0.f(z12, true);
                                }
                                ccVar.invalidate();
                            }
                        }
                        if (!z11) {
                            while (i14 < arrayList.size()) {
                                Animator animator = (Animator) arrayList.get(i14);
                                animator.setDuration(1L);
                                animator.start();
                                i14++;
                            }
                            if (i15 != i10) {
                                Q(i15, i10);
                                return;
                            }
                            return;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f16786n2 = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.f16786n2.setDuration(320L);
                        this.f16786n2.setInterpolator(er.h);
                        this.f16786n2.addListener(new qa(this, i15, i10, 1));
                        if (z13) {
                            this.f16786n2.setStartDelay(120L);
                        }
                        this.f16786n2.start();
                    }
                    i12 = 1;
                    float[] fArr14 = new float[i12];
                    fArr14[0] = f24;
                    arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, fArr14));
                    arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.f17242y)))) ? 1.0f : 0.0f));
                    if (i10 != -1) {
                        f12 = 1.0f;
                    } else {
                        f12 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, f12));
                    imageView = this.f16758e1;
                    if (imageView != null) {
                        i13 = 1;
                        arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, ((i10 != -1 || i10 == 2) && (z7Var3 = this.G1) != null && z7Var3.f17235u) ? 1.0f : 0.0f));
                    } else {
                        i13 = 1;
                    }
                    int i17 = this.f16746b0;
                    float[] fArr15 = new float[i13];
                    fArr15[0] = ((i17 != i13 || i17 == 2) && i10 == -1) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr15));
                    fbVar = this.f16753d0;
                    if (i10 == i13) {
                        fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.2f);
                        contentHeight = AndroidUtilities.dp(164.0f);
                    } else if (i10 == 0) {
                        fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.6f);
                        contentHeight = AndroidUtilities.dp(40.0f);
                    } else if (i10 == 2) {
                        fbVar.setPivotY(0.0f);
                        contentHeight = ccVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                    } else {
                        contentHeight = 0;
                    }
                    if (contentHeight > 0) {
                        int height2 = fbVar.getHeight() - ((int) fbVar.getPivotY());
                        f13 = (height2 - contentHeight) / height2;
                    } else {
                        f13 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_X, f13));
                    arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_Y, f13));
                    if (i10 == -1) {
                        arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.TRANSLATION_Y, 0.0f));
                    }
                    me0Var = this.B1;
                    if (me0Var != null) {
                        if (i10 == 1) {
                            f22 = 1.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(me0Var, (Property<me0, Float>) property, f22));
                    }
                    ke0Var = this.A1;
                    if (ke0Var != null) {
                        if (i10 == 1) {
                            f21 = 1.0f;
                        } else {
                            f21 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(ke0Var, (Property<ke0, Float>) property, f21));
                    }
                    if (i10 == -1) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, f14));
                    if (i10 != -1) {
                        f15 = 1.0f;
                    } else {
                        f15 = 1.0f;
                    }
                    float[] fArr16 = {f15};
                    ag.p1 p1Var2 = this.f16767h0;
                    arrayList.add(ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property, fArr16));
                    Property property16 = View.TRANSLATION_Y;
                    if (i10 != -1) {
                        fDp = 0.0f;
                    } else {
                        fDp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(p1Var2, (Property<ag.p1, Float>) property16, fDp));
                    if (i10 != -1) {
                        f23 = 0.0f;
                    }
                    FrameLayout frameLayout4 = this.U0;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property, f23));
                    if (i10 == 2) {
                        fDp2 = AndroidUtilities.dp(68.0f);
                    } else {
                        fDp2 = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()));
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property16, fDp2));
                    LinearLayout linearLayout2 = this.f16761f0;
                    linearLayout2.setPivotX(linearLayout2.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                    property2 = View.ROTATION;
                    if (i10 == 2) {
                        f16 = -90.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property2, f16));
                    if (i10 == 2) {
                        f17 = 90.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, f17));
                    if (i10 == 2) {
                        f18 = 90.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property2, f18));
                    if (i10 == 2) {
                        f19 = 90.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property2, f19));
                    imageView2 = this.f16758e1;
                    if (imageView2 != null) {
                        if (i10 == 2) {
                            f20 = 90.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, f20));
                    }
                    if (this.f16784n0.c()) {
                        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        i14 = 0;
                        valueAnimatorOfFloat6.addUpdateListener(new ua(this, i14));
                        arrayList.add(valueAnimatorOfFloat6);
                    } else {
                        i14 = 0;
                    }
                    if (ccVar != null) {
                        z7Var2 = this.G1;
                        if (z7Var2 == null) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (ccVar.f15779f0 == z12) {
                            ccVar.f15779f0 = z12;
                            if (!z11) {
                                ccVar.f15776e0.f(z12, true);
                            }
                            ccVar.invalidate();
                        } else {
                            ccVar.f15779f0 = z12;
                            if (!z11) {
                                ccVar.f15776e0.f(z12, true);
                            }
                            ccVar.invalidate();
                        }
                    }
                    if (!z11) {
                        while (i14 < arrayList.size()) {
                            Animator animator2 = (Animator) arrayList.get(i14);
                            animator2.setDuration(1L);
                            animator2.start();
                            i14++;
                        }
                        if (i15 != i10) {
                            Q(i15, i10);
                            return;
                        }
                        return;
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.f16786n2 = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.f16786n2.setDuration(320L);
                    this.f16786n2.setInterpolator(er.h);
                    this.f16786n2.addListener(new qa(this, i15, i10, 1));
                    if (z13) {
                        this.f16786n2.setStartDelay(120L);
                    }
                    this.f16786n2.start();
                }
                s();
                ve0 ve0Var2 = this.f16819x1;
                this.f16799r2 = ve0Var2;
                FrameLayout toolsView = ve0Var2 != null ? ve0Var2.getToolsView() : null;
                if (toolsView != null) {
                    toolsView.setAlpha(0.0f);
                    toolsView.setVisibility(0);
                    f10 = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
                } else {
                    f10 = 0.0f;
                }
                if (i10 == 0) {
                    u();
                    this.f16799r2 = this.f16798r1;
                    Property property17 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property17, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getTopLayout(), (Property<View, Float>) property17, 0.0f, 1.0f));
                    View topLayout3 = this.f16798r1.getTopLayout();
                    Property property18 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout3, (Property<View, Float>) property18, -AndroidUtilities.dp(16.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property17, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property18, AndroidUtilities.dp(48.0f), f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f10));
                } else if (i15 == 0) {
                    this.f16799r2 = null;
                    Property property19 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(p2Var, (Property<p2, Float>) property19, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getTopLayout(), (Property<View, Float>) property19, f10));
                    View topLayout4 = this.f16798r1.getTopLayout();
                    Property property20 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout4, (Property<View, Float>) property20, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property19, f10));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getBottomLayout(), (Property<View, Float>) property20, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.f16798r1.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                dbVar = this.f16785n1;
                if (dbVar != null) {
                    eVar2 = dbVar.h;
                    if (i10 == 3) {
                        Property property21 = View.ALPHA;
                        i11 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<uf.e, Float>) property21, 0.0f, 1.0f));
                        uf.e eVar7 = this.f16785n1.h;
                        Property property22 = View.TRANSLATION_Y;
                        f11 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar7, (Property<uf.e, Float>) property22, AndroidUtilities.dp(52.0f), f10));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property21, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property22, AndroidUtilities.dp(52.0f), f10));
                        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(this.f16785n1.getAppearProgress(), 1.0f);
                        valueAnimatorOfFloat7.addUpdateListener(new ea(this, 1));
                        arrayList.add(valueAnimatorOfFloat7);
                    } else {
                        i11 = 2;
                        f11 = 52.0f;
                        if (i15 == 3) {
                            Property property23 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(eVar2, (Property<uf.e, Float>) property23, 1.0f, 0.0f));
                            uf.e eVar8 = this.f16785n1.h;
                            Property property110 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(eVar8, (Property<uf.e, Float>) property110, f10, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property23, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.f16785n1.f16154n, (Property<FrameLayout, Float>) property110, f10, AndroidUtilities.dp(52.0f)));
                            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(this.f16785n1.getAppearProgress(), f10);
                            valueAnimatorOfFloat8.addUpdateListener(new ea(this, i11));
                            arrayList.add(valueAnimatorOfFloat8);
                        }
                    }
                } else {
                    i11 = 2;
                    f11 = 52.0f;
                }
                ebVar = this.f16788o1;
                if (ebVar != null) {
                    eVar = ebVar.f16370n;
                    if (i10 == 4) {
                        Property property111 = View.ALPHA;
                        float[] fArr17 = new float[i11];
                        
                        fArr17[0] = 0.0f;
                        fArr17[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property111, fArr17));
                        uf.e eVar9 = this.f16788o1.f16370n;
                        Property property112 = View.TRANSLATION_Y;
                        float[] fArr18 = new float[i11];
                        fArr18[0] = AndroidUtilities.dp(f11);
                        fArr18[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(eVar9, (Property<uf.e, Float>) property112, fArr18));
                        float[] fArr19 = new float[i11];
                        
                        fArr19[0] = 0.0f;
                        fArr19[1] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.f16788o1.f16371r, (Property<FrameLayout, Float>) property111, fArr19));
                        FrameLayout frameLayout5 = this.f16788o1.f16371r;
                        float[] fArr20 = new float[i11];
                        fArr20[0] = AndroidUtilities.dp(f11);
                        fArr20[1] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property112, fArr20));
                        float[] fArr21 = new float[i11];
                        fArr21[0] = this.f16788o1.getAppearProgress();
                        fArr21[1] = 1.0f;
                        ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(fArr21);
                        valueAnimatorOfFloat9.addUpdateListener(new ea(this, 3));
                        arrayList.add(valueAnimatorOfFloat9);
                    } else if (i15 == 4) {
                        Property property113 = View.ALPHA;
                        float[] fArr22 = new float[i11];
                        
                        fArr22[0] = 1.0f;
                        fArr22[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(eVar, (Property<uf.e, Float>) property113, fArr22));
                        uf.e eVar10 = this.f16788o1.f16370n;
                        Property property114 = View.TRANSLATION_Y;
                        float fDp5 = AndroidUtilities.dp(f11);
                        float[] fArr23 = new float[i11];
                        fArr23[0] = f10;
                        fArr23[1] = fDp5;
                        arrayList.add(ObjectAnimator.ofFloat(eVar10, (Property<uf.e, Float>) property114, fArr23));
                        float[] fArr24 = new float[i11];
                        
                        fArr24[0] = 1.0f;
                        fArr24[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(this.f16788o1.f16371r, (Property<FrameLayout, Float>) property113, fArr24));
                        FrameLayout frameLayout6 = this.f16788o1.f16371r;
                        float fDp6 = AndroidUtilities.dp(f11);
                        float[] fArr25 = new float[i11];
                        fArr25[0] = f10;
                        fArr25[1] = fDp6;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout6, (Property<FrameLayout, Float>) property114, fArr25));
                        float[] fArr110 = new float[i11];
                        fArr110[0] = this.f16788o1.getAppearProgress();
                        fArr110[1] = f10;
                        ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(fArr110);
                        valueAnimatorOfFloat10.addUpdateListener(new ea(this, 4));
                        arrayList.add(valueAnimatorOfFloat10);
                    }
                }
                property = View.ALPHA;
                if (i10 != -1) {
                    i12 = 1;
                    if (this.K1 == 1) {
                    }
                } else {
                    i12 = 1;
                    if (this.K1 == 1) {
                    }
                }
                float[] fArr111 = new float[i12];
                fArr111[0] = f24;
                arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property, fArr111));
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, ((i10 != -1 || i10 == 2) && (this.K1 == i12 || !((z7Var = this.G1) == null || TextUtils.isEmpty(z7Var.f17242y)))) ? 1.0f : 0.0f));
                if (i10 != -1) {
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property, f12));
                imageView = this.f16758e1;
                if (imageView != null) {
                    i13 = 1;
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, ((i10 != -1 || i10 == 2) && (z7Var3 = this.G1) != null && z7Var3.f17235u) ? 1.0f : 0.0f));
                } else {
                    i13 = 1;
                }
                int i18 = this.f16746b0;
                float[] fArr112 = new float[i13];
                fArr112[0] = ((i18 != i13 || i18 == 2) && i10 == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, fArr112));
                fbVar = this.f16753d0;
                if (i10 == i13) {
                    fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.2f);
                    contentHeight = AndroidUtilities.dp(164.0f);
                } else if (i10 == 0) {
                    fbVar.setPivotY(fbVar.getMeasuredHeight() * 0.6f);
                    contentHeight = AndroidUtilities.dp(40.0f);
                } else if (i10 == 2) {
                    fbVar.setPivotY(0.0f);
                    contentHeight = ccVar.getContentHeight() + AndroidUtilities.dp(8.0f);
                } else {
                    contentHeight = 0;
                }
                if (contentHeight > 0) {
                    int height3 = fbVar.getHeight() - ((int) fbVar.getPivotY());
                    f13 = (height3 - contentHeight) / height3;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_X, f13));
                arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.SCALE_Y, f13));
                if (i10 == -1) {
                    arrayList.add(ObjectAnimator.ofFloat(fbVar, (Property<fb, Float>) View.TRANSLATION_Y, 0.0f));
                }
                me0Var = this.B1;
                if (me0Var != null) {
                    if (i10 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(me0Var, (Property<me0, Float>) property, f22));
                }
                ke0Var = this.A1;
                if (ke0Var != null) {
                    if (i10 == 1) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(ke0Var, (Property<ke0, Float>) property, f21));
                }
                if (i10 == -1) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ibVar, (Property<ib, Float>) property, f14));
                if (i10 != -1) {
                    f15 = 1.0f;
                } else {
                    f15 = 1.0f;
                }
                float[] fArr113 = {f15};
                ag.p1 p1Var3 = this.f16767h0;
                arrayList.add(ObjectAnimator.ofFloat(p1Var3, (Property<ag.p1, Float>) property, fArr113));
                Property property115 = View.TRANSLATION_Y;
                if (i10 != -1) {
                    fDp = 0.0f;
                } else {
                    fDp = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(p1Var3, (Property<ag.p1, Float>) property115, fDp));
                if (i10 != -1) {
                    f23 = 0.0f;
                }
                FrameLayout frameLayout7 = this.U0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property, f23));
                if (i10 == 2) {
                    fDp2 = AndroidUtilities.dp(68.0f);
                } else {
                    fDp2 = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ibVar.getEditTextHeight()));
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property115, fDp2));
                LinearLayout linearLayout3 = this.f16761f0;
                linearLayout3.setPivotX(linearLayout3.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                property2 = View.ROTATION;
                if (i10 == 2) {
                    f16 = -90.0f;
                } else {
                    f16 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(linearLayout3, (Property<LinearLayout, Float>) property2, f16));
                if (i10 == 2) {
                    f17 = 90.0f;
                } else {
                    f17 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, f17));
                if (i10 == 2) {
                    f18 = 90.0f;
                } else {
                    f18 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) property2, f18));
                if (i10 == 2) {
                    f19 = 90.0f;
                } else {
                    f19 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(u0Var, (Property<u0, Float>) property2, f19));
                imageView2 = this.f16758e1;
                if (imageView2 != null) {
                    if (i10 == 2) {
                        f20 = 90.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, f20));
                }
                if (this.f16784n0.c()) {
                    ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    i14 = 0;
                    valueAnimatorOfFloat11.addUpdateListener(new ua(this, i14));
                    arrayList.add(valueAnimatorOfFloat11);
                } else {
                    i14 = 0;
                }
                if (ccVar != null) {
                    z7Var2 = this.G1;
                    if (z7Var2 == null) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (ccVar.f15779f0 == z12) {
                        ccVar.f15779f0 = z12;
                        if (!z11) {
                            ccVar.f15776e0.f(z12, true);
                        }
                        ccVar.invalidate();
                    } else {
                        ccVar.f15779f0 = z12;
                        if (!z11) {
                            ccVar.f15776e0.f(z12, true);
                        }
                        ccVar.invalidate();
                    }
                }
                if (!z11) {
                    while (i14 < arrayList.size()) {
                        Animator animator3 = (Animator) arrayList.get(i14);
                        animator3.setDuration(1L);
                        animator3.start();
                        i14++;
                    }
                    if (i15 != i10) {
                        Q(i15, i10);
                        return;
                    }
                    return;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f16786n2 = animatorSet4;
                animatorSet4.playTogether(arrayList);
                this.f16786n2.setDuration(320L);
                this.f16786n2.setInterpolator(er.h);
                this.f16786n2.addListener(new qa(this, i15, i10, 1));
                if (z13) {
                    this.f16786n2.setStartDelay(120L);
                }
                this.f16786n2.start();
            }
        }
    }

    public final void m() {
        z7 z7Var;
        if (this.f16798r1 == null || (z7Var = this.G1) == null || !z7Var.f17235u) {
            return;
        }
        File file = z7Var.W0;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            this.G1.W0 = null;
        }
        this.G1.W0 = z7.w(this.f16749c, "webp");
        va vaVar = this.f16798r1;
        z7 z7Var2 = this.G1;
        Bitmap bitmapT0 = vaVar.t0(z7Var2.T0, false, false, true, this.K1 != 1, z7Var2);
        try {
            try {
                bitmapT0.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.W0));
                if (bitmapT0.isRecycled()) {
                    return;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                try {
                    this.G1.W0.delete();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.G1.W0 = null;
                if (bitmapT0 == null || bitmapT0.isRecycled()) {
                    return;
                }
            }
            bitmapT0.recycle();
        } catch (Throwable th) {
            if (bitmapT0 != null && !bitmapT0.isRecycled()) {
                bitmapT0.recycle();
            }
            throw th;
        }
    }

    public final void m0(boolean z10) {
        wa waVar;
        boolean z11 = false;
        i0(this.f16746b0 == 0 && this.K1 == 1 && !this.E0.f17137e && !I(), z10);
        this.C0.setSelected(this.f16814w0.j());
        z zVar = this.E0;
        c0(this.f16773j0, zVar == null || !zVar.f17137e, z10);
        c0(this.A0, (this.W1 || this.K1 == -1 || this.f16746b0 != 0 || this.U1 == null || this.E0.f17137e || I()) ? false : true, z10);
        c0(this.B0, (this.W1 || this.K1 == -1 || this.f16746b0 != 0 || (waVar = this.f16818x0) == null || !waVar.f15721a || this.E0.f17137e || this.f16814w0.j()) ? false : true, z10);
        c0(this.C0, (this.W1 || this.K1 == -1 || this.f16746b0 != 0 || this.E0.f17137e) ? false : true, z10);
        c0(this.D0, this.E0.f17137e, z10);
        this.K0.e(this.f16814w0.j() ? this.f16814w0.getFilledProgress() : 0.0f, z10);
        boolean z12 = this.E0.f17137e;
        w3 w3Var = this.f16774j1;
        if (z12) {
            w3Var.v();
        } else {
            w3Var.e(true);
        }
        h(this.W1, z10);
        AndroidUtilities.updateViewShow(this.O0, this.K1 == -1 && this.f16746b0 == 0);
        if (this.K1 == -1 && this.f16746b0 == 0) {
            z11 = true;
        }
        AndroidUtilities.updateViewShow(this.N0, z11);
    }

    public final void n0() {
        this.D0.setTranslationX(-0.0f);
        float alpha = (this.D0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.B0.setTranslationX(-alpha);
        float alpha2 = (this.B0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.C0.setTranslationX(-alpha2);
        float alpha3 = (this.C0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.A0.setTranslationX(-alpha3);
        float alpha4 = (this.A0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha3;
        this.f16773j0.setTranslationX(0.0f);
        float alpha5 = (this.f16773j0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f);
        float fDp = alpha4 + AndroidUtilities.dp(8.0f);
        w wVar = this.E0.f17134a;
        wVar.setPadding((int) alpha5, 0, (int) fDp, 0);
        wVar.invalidate();
    }

    public final void o() {
        boolean z10 = this.G != 0.0f || this.E < 1.0f || this.f16820x2;
        if (z10 == this.f16816w2) {
            return;
        }
        gf.t0 t0Var = this.f16821y;
        if (t0Var != null) {
            t0Var.a(!z10);
        }
        this.f16816w2 = z10;
    }

    public final void o0(boolean z10) {
        oi0 oi0Var = this.f16754d1;
        if (oi0Var != null) {
            int[] iArr = oi0Var.f31312e;
            int i10 = 0;
            if (!z10) {
                z7 z7Var = this.G1;
                int i11 = (z7Var == null || !z7Var.f17243y0) ? 0 : iArr[0] - 1;
                oi0Var.L(i11, false, true);
                this.f16754d1.N(i11);
                ImageView imageView = this.f16758e1;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            z7 z7Var2 = this.G1;
            if (z7Var2 != null && z7Var2.f17243y0) {
                i10 = iArr[0];
            }
            oi0Var.N(i10);
            oi0 oi0Var2 = this.f16754d1;
            if (oi0Var2 != null) {
                oi0Var2.start();
            }
        }
    }

    public final void p() {
        if (this.f16792p2 < 0) {
            this.f16792p2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f16795q2 = arrayList;
            arrayList.add("off");
            this.f16795q2.add("auto");
            this.f16795q2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            r2 r2Var = this.f16800s;
            r2Var.f16638o = f10;
            r2Var.f16637n = r2.f(f10);
            r2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            r2 r2Var2 = this.f16800s;
            r2Var2.f16639p = f11;
            r2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        s9 s9Var = new s9(this, 2);
        va vaVar = this.f16798r1;
        z7 z7Var = this.G1;
        if (vaVar == null || z7Var == null) {
            s9Var.run();
            return;
        }
        z7Var.f();
        boolean zU0 = vaVar.u0();
        boolean z10 = vaVar.K0.getPainting().E;
        Utilities.searchQueue.postRunnable(new v9(this, vaVar, z7Var.f17213i0, z7Var.f17215j0, z7Var, z10, zU0, s9Var, 1));
    }

    public final void q(boolean z10) {
        hb hbVar;
        if (this.d) {
            q9 q9Var = this.m0;
            if (q9Var != null) {
                q9Var.dismiss();
                this.m0 = null;
            }
            z7 z7Var = this.G1;
            long jO = 0;
            if (z7Var != null && !z7Var.h) {
                if ((this.v && z7Var.f17209g) || z7Var.f17196b != 0) {
                    z7Var.f17214j = false;
                }
                z7Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 == null || (hbVar = this.T0) == null) {
                hb hbVar2 = this.T0;
                if (hbVar2 != null && !z10) {
                    hbVar2.set(null);
                }
                g(0.0f, z10, new s9(this, 23));
                int i10 = this.F;
                if (i10 == 1 || i10 == 0) {
                    this.f16783n.setBackgroundColor(0);
                    this.X0.b(false, true);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
                int i11 = this.f16749c;
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                return;
            }
            if (this.f16756e) {
                return;
            }
            this.f16756e = true;
            m61 m61Var = hbVar.f16590y;
            if (m61Var != null) {
                m61Var.C();
                hbVar.f16590y.I();
                hbVar.f16590y = null;
            }
            m61 m61Var2 = hbVar.f16589x;
            if (m61Var2 != null) {
                jO = m61Var2.o();
                hbVar.f16589x.C();
                hbVar.f16589x.I();
                hbVar.f16589x = null;
            }
            m61 m61Var3 = hbVar.f16565e;
            if (m61Var3 != null) {
                jO = m61Var3.o();
                hbVar.f16565e.C();
                hbVar.f16565e.I();
                hbVar.f16565e = null;
            }
            callback4.run(Long.valueOf(jO), new ca(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f16813w));
        }
    }

    public final boolean q0() {
        wa waVar;
        if ((!this.L1 && !this.M1) || (waVar = this.f16818x0) == null || !waVar.isFrontface()) {
            return false;
        }
        int i10 = this.f16792p2;
        return i10 == 2 || (i10 == 1 && this.Y1);
    }

    public final void r() {
        Activity activity = this.f16745b;
        if (this.f16818x0 != null || activity == null) {
            return;
        }
        this.f16818x0 = new wa(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        y6 y6Var = this.K0;
        if (y6Var != null) {
            y6Var.f17089c0 = 0.0f;
            y6Var.f17090d0.d(0.0f, true);
        }
        this.f16818x0.recordHevc = !this.f16814w0.j();
        this.f16818x0.setThumbDrawable(A());
        this.f16818x0.initTexture();
        this.f16818x0.setDelegate(new ba(this, 0));
        c0(this.B0, this.f16818x0.f15721a && this.f16746b0 == 0, true);
        this.C0.setTranslationX(this.f16818x0.f15721a ? 0.0f : AndroidUtilities.dp(46.0f));
        this.f16814w0.setCameraView(this.f16818x0);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.S0.v();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!c1.q(this.f16818x0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.f16818x0.f15721a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.f16768h1.v();
        }
        if (this.f16822y0 == null) {
            this.f16822y0 = new u6(activity, new t9(this, 3));
        }
        this.f16822y0.a(this.f16818x0);
        i7 i7Var = this.f16825z0;
        if (i7Var != null) {
            gb gbVar = this.f16814w0;
            Object blurRenderNode = gbVar.getBlurRenderNode();
            i7Var.B = gbVar;
            i7Var.C = blurRenderNode;
            i7Var.invalidate();
        }
    }

    public final void s() {
        z7 z7Var;
        Bitmap bitmap;
        Bitmap bitmapQ;
        if (this.f16819x1 != null || (z7Var = this.G1) == null) {
            return;
        }
        if (z7Var.K) {
            bitmap = null;
        } else {
            if (z7Var.Z0 == null) {
                bitmapQ = this.T0.getPhotoBitmap();
            } else {
                ba baVar = new ba(this, 11);
                Point point = AndroidUtilities.displaySize;
                bitmapQ = z7.q(baVar, point.x, point.y, 0, true);
            }
            bitmap = bitmapQ;
        }
        if (bitmap != null || this.G1.K) {
            a61 textureView = this.T0.getTextureView();
            int orientation = this.T0.getOrientation();
            z7 z7Var2 = this.G1;
            ve0 ve0Var = new ve0(this.f16745b, textureView, bitmap, null, orientation, z7Var2 != null ? z7Var2.f17195a1 : null, null, 0, false, false, this.f16784n0, this.f16742a);
            this.f16819x1 = ve0Var;
            this.f16796r.addView(ve0Var);
            te0 te0Var = this.f16823y1;
            if (te0Var != null) {
                te0Var.setFilterView(this.f16819x1);
            }
            TextureView myTextureView = this.f16819x1.getMyTextureView();
            this.f16826z1 = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.T0.o(this.f16826z1, this.f16819x1);
            TextureView textureView2 = this.f16826z1;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.f16826z1.animate().alpha(1.0f).setDuration(220L).start();
            }
            j();
            ke0 blurControl = this.f16819x1.getBlurControl();
            this.A1 = blurControl;
            if (blurControl != null) {
                this.f16753d0.addView(blurControl);
            }
            me0 curveControl = this.f16819x1.getCurveControl();
            this.B1 = curveControl;
            if (curveControl != null) {
                this.f16753d0.addView(curveControl);
            }
            V();
            this.f16819x1.getDoneTextView().setOnClickListener(new u9(this, 13));
            this.f16819x1.getCancelTextView().setOnClickListener(new u9(this, 14));
            this.f16819x1.getToolsView().setVisibility(8);
            this.f16819x1.getToolsView().setAlpha(0.0f);
            this.f16819x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.f16819x1.f33386e0.setVisibility(0);
        }
    }

    public final void t(boolean z10) {
        if (this.I0 != null) {
            gb gbVar = this.f16814w0;
            if ((gbVar != null && gbVar.j()) == this.I0.L) {
                return;
            }
        }
        if (this.f16745b == null) {
            return;
        }
        if (this.I0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f16772i2;
        boolean z11 = !z10;
        gb gbVar2 = this.f16814w0;
        sa saVar = new sa(this, this.f16749c, this.f16745b, this.f16742a, albumEntry, z10, z11, gbVar2 != null && gbVar2.j());
        this.I0 = saVar;
        saVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.f16814w0.j());
        this.I0.setMaxCount(Math.min(10, u.b() - this.f16814w0.getFilledCount()));
        this.I0.setOnBackClickListener(new ja(this, 1));
        this.I0.setOnSelectListener(new ia(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new hh.q1(this, 2));
        f2.j0 j0Var = this.f16769h2;
        if (j0Var != null) {
            z2 z2Var = this.I0.f16514e;
            z2Var.B = j0Var;
            z2Var.l0();
        }
        this.f16783n.addView(this.I0, h7.z5.e(-1, -1, 119));
    }

    public final void u() {
        Bitmap bitmapCreateBitmap;
        z7 z7Var;
        boolean z10;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        z7 z7Var2;
        boolean z14;
        yf.b1 renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file;
        File file2;
        if (this.f16798r1 != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.T0.getPaintSize();
        z7 z7Var3 = this.G1;
        Bitmap bitmapDecodeFile = (z7Var3 == null || !(z7Var3.f17199c || z7Var3.f17209g || this.D1 != null) || (file2 = z7Var3.P0) == null) ? null : BitmapFactory.decodeFile(file2.getPath());
        if (bitmapDecodeFile == null) {
            bitmapDecodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap = bitmapDecodeFile;
        z7 z7Var4 = this.G1;
        if (z7Var4 != null && ((z7Var4.f17199c || z7Var4.f17209g || this.D1 != null) && (file = z7Var4.Q0) != null)) {
            bitmapCreateBitmap = BitmapFactory.decodeFile(file.getPath());
            boolean z15 = bitmapCreateBitmap != null;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmapCreateBitmap;
            int measuredWidth = this.f16753d0.getMeasuredWidth();
            int measuredHeight = this.f16753d0.getMeasuredHeight();
            z7Var = this.G1;
            if (z7Var != null || z7Var.M) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z7Var == null) {
                obj = r3;
            } else {
                obj = z7Var.L;
            }
            if (z7Var == null && z7Var.K) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z7Var != null || z7Var.J0 == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            int orientation = this.T0.getOrientation();
            z7 z7Var5 = this.G1;
            ArrayList arrayList = z7Var5 != null ? z7Var5.T0 : null;
            MediaController.CropState cropState = new MediaController.CropState();
            p6 p6Var = this.f16787o0;
            hb hbVar = this.T0;
            Activity activity = this.f16745b;
            z13 = z15;
            va vaVar = new va(this, activity, z10, obj, z11, z12, this.f16783n, activity, this.f16749c, bitmap, bitmap2, orientation, arrayList, z7Var5, measuredWidth, measuredHeight, cropState, this.f16784n0, this.f16742a, p6Var, hbVar);
            this.f16798r1 = vaVar;
            z7Var2 = this.G1;
            if (z7Var2 != null || z7Var2.f17242y == null) {
                z14 = false;
            } else {
                z14 = true;
            }
            vaVar.setHasAudio(z14);
            this.f16798r1.setBlurManager(this.f16784n0);
            this.f16796r.addView(this.f16798r1);
            renderView = this.f16798r1.getRenderView();
            this.f16802s1 = renderView;
            if (renderView != null) {
                renderView.getPainting().E = z13;
                this.f16753d0.addView(this.f16802s1);
            }
            renderInputView = this.f16798r1.getRenderInputView();
            this.f16805t1 = renderInputView;
            if (renderInputView != null) {
                this.f16753d0.addView(renderInputView);
            }
            textDimView = this.f16798r1.getTextDimView();
            this.f16808u1 = textDimView;
            if (textDimView != null) {
                this.f16753d0.addView(textDimView);
            }
            entitiesView = this.f16798r1.getEntitiesView();
            this.f16811v1 = entitiesView;
            if (entitiesView != null) {
                this.f16753d0.addView(entitiesView);
            }
            selectionEntitiesView = this.f16798r1.getSelectionEntitiesView();
            this.f16815w1 = selectionEntitiesView;
            if (selectionEntitiesView != null) {
                this.f16753d0.addView(selectionEntitiesView);
            }
            V();
            this.f16798r1.setOnDoneButtonClickedListener(new s9(this, 21));
            this.f16798r1.setOnCancelButtonClickedListener(new s9(this, 22));
            va vaVar2 = this.f16798r1;
            vaVar2.N0.setVisibility(0);
            vaVar2.K0.setVisibility(0);
            vaVar2.L0.setVisibility(0);
        }
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmapCreateBitmap;
        int measuredWidth2 = this.f16753d0.getMeasuredWidth();
        int measuredHeight2 = this.f16753d0.getMeasuredHeight();
        z7Var = this.G1;
        if (z7Var != null) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z7Var == null) {
            obj = r3;
        } else {
            obj = z7Var.L;
        }
        if (z7Var == null) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (z7Var != null) {
            z12 = false;
        } else {
            z12 = false;
        }
        int orientation2 = this.T0.getOrientation();
        z7 z7Var6 = this.G1;
        ArrayList arrayList2 = z7Var6 != null ? z7Var6.T0 : null;
        MediaController.CropState cropState2 = new MediaController.CropState();
        p6 p6Var2 = this.f16787o0;
        hb hbVar2 = this.T0;
        Activity activity2 = this.f16745b;
        z13 = z15;
        va vaVar3 = new va(this, activity2, z10, obj, z11, z12, this.f16783n, activity2, this.f16749c, bitmap, bitmap3, orientation2, arrayList2, z7Var6, measuredWidth2, measuredHeight2, cropState2, this.f16784n0, this.f16742a, p6Var2, hbVar2);
        this.f16798r1 = vaVar3;
        z7Var2 = this.G1;
        if (z7Var2 != null) {
            z14 = false;
        } else {
            z14 = false;
        }
        vaVar3.setHasAudio(z14);
        this.f16798r1.setBlurManager(this.f16784n0);
        this.f16796r.addView(this.f16798r1);
        renderView = this.f16798r1.getRenderView();
        this.f16802s1 = renderView;
        if (renderView != null) {
            renderView.getPainting().E = z13;
            this.f16753d0.addView(this.f16802s1);
        }
        renderInputView = this.f16798r1.getRenderInputView();
        this.f16805t1 = renderInputView;
        if (renderInputView != null) {
            this.f16753d0.addView(renderInputView);
        }
        textDimView = this.f16798r1.getTextDimView();
        this.f16808u1 = textDimView;
        if (textDimView != null) {
            this.f16753d0.addView(textDimView);
        }
        entitiesView = this.f16798r1.getEntitiesView();
        this.f16811v1 = entitiesView;
        if (entitiesView != null) {
            this.f16753d0.addView(entitiesView);
        }
        selectionEntitiesView = this.f16798r1.getSelectionEntitiesView();
        this.f16815w1 = selectionEntitiesView;
        if (selectionEntitiesView != null) {
            this.f16753d0.addView(selectionEntitiesView);
        }
        V();
        this.f16798r1.setOnDoneButtonClickedListener(new s9(this, 21));
        this.f16798r1.setOnCancelButtonClickedListener(new s9(this, 22));
        va vaVar4 = this.f16798r1;
        vaVar4.N0.setVisibility(0);
        vaVar4.K0.setVisibility(0);
        vaVar4.L0.setVisibility(0);
    }

    public final void v(boolean z10) {
        u6 u6Var = this.f16822y0;
        if (u6Var != null) {
            u6Var.f16911f = null;
            Utilities.globalQueue.cancelRunnable(u6Var.h);
            this.f16822y0 = null;
            gb gbVar = this.f16814w0;
            if (gbVar != null) {
                gbVar.f15893c.a(null);
            }
        }
        i7 i7Var = this.f16825z0;
        if (i7Var != null) {
            i7Var.B = null;
            i7Var.C = null;
            i7Var.invalidate();
        }
        if (this.f16818x0 != null) {
            if (z10) {
                b0(new s9(this, 8));
                return;
            }
            b0(new s9(this, 9));
            this.f16818x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f16818x0);
            gb gbVar2 = this.f16814w0;
            if (gbVar2 != null) {
                gbVar2.setCameraView(null);
            }
            this.f16818x0 = null;
        }
    }

    public final void w() {
        sa saVar = this.I0;
        if (saVar == null) {
            return;
        }
        this.f16783n.removeView(saVar);
        this.I0 = null;
        ValueAnimator valueAnimator = this.f16775j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16775j2 = null;
        }
        o1.j jVar = this.f16778k2;
        if (jVar != null) {
            jVar.c();
            this.f16778k2 = null;
        }
        this.f16780l2 = null;
    }

    public final void y() {
        ve0 ve0Var = this.f16819x1;
        if (ve0Var == null) {
            return;
        }
        ve0Var.e();
        this.f16823y1.setFilterView(null);
        this.f16796r.removeView(this.f16819x1);
        TextureView textureView = this.f16826z1;
        if (textureView != null) {
            this.f16753d0.removeView(textureView);
            this.f16826z1 = null;
        }
        this.T0.o(null, null);
        ke0 ke0Var = this.A1;
        if (ke0Var != null) {
            this.f16753d0.removeView(ke0Var);
            this.A1 = null;
        }
        me0 me0Var = this.B1;
        if (me0Var != null) {
            this.f16753d0.removeView(me0Var);
            this.B1 = null;
        }
        this.f16819x1 = null;
    }

    public final void z() {
        va vaVar = this.f16798r1;
        if (vaVar == null) {
            return;
        }
        vaVar.N0.removeAllViews();
        va vaVar2 = this.f16798r1;
        vaVar2.K0.h();
        vaVar2.N0.setVisibility(8);
        vaVar2.M0.setVisibility(8);
        vaVar2.A0.postRunnable(new ag.l3(16));
        o5 o5Var = vaVar2.f15970g2;
        if (o5Var != null) {
            o5Var.dismiss();
        }
        yf.x xVar = vaVar2.P1;
        if (xVar != null) {
            xVar.dismiss();
        }
        this.f16796r.removeView(this.f16798r1);
        this.f16798r1 = null;
        yf.b1 b1Var = this.f16802s1;
        if (b1Var != null) {
            this.f16753d0.removeView(b1Var);
            this.f16802s1 = null;
        }
        View view = this.f16808u1;
        if (view != null) {
            this.f16753d0.removeView(view);
            this.f16808u1 = null;
        }
        View view2 = this.f16805t1;
        if (view2 != null) {
            this.f16753d0.removeView(view2);
            this.f16805t1 = null;
        }
        View view3 = this.f16811v1;
        if (view3 != null) {
            this.f16753d0.removeView(view3);
            this.f16811v1 = null;
        }
        View view4 = this.f16815w1;
        if (view4 != null) {
            this.f16753d0.removeView(view4);
            this.f16815w1 = null;
        }
    }
}
