package ei;

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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.w91;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;
public final class vb implements NotificationCenter.NotificationCenterDelegate {
    public static vb F2;
    public final ib A0;
    public View A1;
    public boolean A2;
    public ya B0;
    public cg0 B1;
    public boolean B2;
    public v6 C0;
    public final ag0 C1;
    public db C2;
    public final j7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final hc E0;
    public rf0 E1;
    public ValueAnimator E2;
    public qb F;
    public final ic F0;
    public tf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final hc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final lc J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public a8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public ua M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final z6 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final na Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final q2 R0;
    public boolean R1;
    public int S;
    public final q2 S0;
    public boolean S1;
    public int T;
    public final v3 T0;
    public float T1;
    public int U;
    public final v3 U0;
    public int U1;
    public boolean V;
    public final w91 V0;
    public boolean V1;
    public boolean W;
    public final x3 W0;
    public boolean W1;
    public boolean X;
    public final jb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final gc Z0;
    public AnimatorSet Z1;
    public final ci.b f9948a;
    public int f9949a0;
    public final kc f9950a1;
    public boolean a2;
    public final Activity f9951b;
    public int f9952b0;
    public final k6 f9953b1;
    public boolean f9954b2;
    public final int f9955c;
    public final RectF f9956c0;
    public final lb f9957c1;
    public boolean f9958c2;
    public boolean d;
    public final RectF f9959d0;
    public final ma f9960d1;
    public boolean f9961d2;
    public boolean e;
    public final Path f9962e0;
    public final u0 f9963e1;
    public Runnable f9964e2;
    public final WindowManager f9965f;
    public int f9966f0;
    public uj0 f9967f1;
    public AnimatorSet f9968f2;
    public int f9969g0;
    public final xj0 f9970g1;
    public z9 f9971g2;
    public final WindowManager.LayoutParams h;
    public final hb f9972h0;
    public uj0 f9973h1;
    public boolean f9974h2;
    public final FrameLayout f9975i0;
    public ImageView f9976i1;
    public AnimatorSet f9977i2;
    public final LinearLayout f9978j0;
    public final g6 f9979j1;
    public ValueAnimator f9980j2;
    public final FrameLayout f9981k0;
    public final x3 f9982k1;
    public boolean f9983k2;
    public final ah.x f9984l0;
    public final x3 l1;
    public s4.a0 f9985l2;
    public final FrameLayout m0;
    public final x3 f9986m1;
    public MediaController.AlbumEntry f9987m2;
    public final ub f9988n;
    public final q2 f9989n0;
    public final x3 f9990n1;
    public ValueAnimator f9991n2;
    public final t7 f9992o0;
    public final l6 f9993o1;
    public o1.k f9994o2;
    public final org.telegram.ui.ActionBar.j5 f9995p0;
    public final jc f9996p1;
    public Boolean f9997p2;
    public r9 f9998q0;
    public p f9999q1;
    public da f10000q2;
    public final nb f10001r;
    public final org.telegram.ui.Components.ja f10002r0;
    public fb f10003r1;
    public AnimatorSet f10004r2;
    public final s2 f10005s;
    public final q6 f10006s0;
    public gb f10007s1;
    public boolean f10008s2;
    public final ai.ic f10009t0;
    public final gc f10010t1;
    public int f10011t2;
    public boolean f10012u0;
    public final d f10013u1;
    public ArrayList f10014u2;
    public boolean v;
    public long f10015v0;
    public xa f10016v1;
    public FrameLayout f10017v2;
    public long f10018w;
    public String f10019w0;
    public qg.e1 f10020w1;
    public boolean f10021w2;
    public mb f10022x;
    public TLRPC.InputPeer f10023x0;
    public View f10024x1;
    public t9 f10025x2;
    public final pa0 f10026y;
    public p9 f10027y0;
    public View f10028y1;
    public ah.g f10029y2;
    public t f10030z0;
    public View f10031z1;
    public boolean f10032z2;

    public vb(Activity activity, int i10) {
        int i11;
        ci.b bVar = new ci.b();
        this.f9948a = bVar;
        this.f10018w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f9956c0 = new RectF();
        this.f9959d0 = new RectF();
        this.f9962e0 = new Path();
        new Rect();
        this.f9966f0 = 0;
        this.f9969g0 = -1;
        this.f10027y0 = new p9();
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
        qa qaVar = new qa(this);
        this.f9961d2 = true;
        this.f9983k2 = true;
        this.f10011t2 = -1;
        this.f9951b = activity;
        this.f9955c = i10;
        LaunchActivity launchActivity = LaunchActivity.H1;
        this.f10026y = launchActivity != null ? new pa0(launchActivity, true) : null;
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
        this.f9965f = windowManager;
        ub ubVar = new ub(this, activity);
        this.f9988n = ubVar;
        ca caVar = new ca(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(ubVar, caVar);
        this.f9988n.setFocusable(true);
        this.f9988n.setImportantForAccessibility(2);
        s2 s2Var = new s2(activity, windowManager, this.f9988n, layoutParams);
        this.f10005s = s2Var;
        s2Var.a(new bb(this));
        this.f9988n.addView(this.f10005s.f9768b, new ViewGroup.LayoutParams(-1, -1));
        ub ubVar2 = this.f9988n;
        nb nbVar = new nb(this, activity);
        this.f10001r = nbVar;
        ubVar2.addView(nbVar);
        nb nbVar2 = this.f10001r;
        hb hbVar = new hb(this, activity);
        this.f9972h0 = hbVar;
        nbVar2.addView(hbVar);
        this.f10001r.addView(this.f10005s.f9769c, new ViewGroup.LayoutParams(-1, -1));
        this.f10002r0 = new org.telegram.ui.Components.ja(this.f9972h0);
        this.f10006s0 = new Object();
        nb nbVar3 = this.f10001r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9975i0 = frameLayout;
        nbVar3.addView(frameLayout);
        nb nbVar4 = this.f10001r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f9981k0 = frameLayout2;
        nbVar4.addView(frameLayout2);
        nb nbVar5 = this.f10001r;
        ah.x xVar = new ah.x(this, activity, 5);
        this.f9984l0 = xVar;
        nbVar5.addView(xVar);
        this.f9984l0.setVisibility(8);
        this.f9984l0.setAlpha(0.0f);
        nb nbVar6 = this.f10001r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        nbVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.f9988n, new o8(2));
        ib ibVar = new ib(this, activity, this.f10002r0, this.f10001r, bVar);
        this.A0 = ibVar;
        ub ubVar3 = this.f9988n;
        Objects.requireNonNull(ubVar3);
        ibVar.setCancelGestures(new com.google.firebase.messaging.s(ubVar3, 23));
        this.A0.setResetState(new t9(this, 13));
        this.f9972h0.addView(this.A0, w7.z5.e(-1, -1, 119));
        this.A0.setOnClickListener(new v9(this, 12));
        hb hbVar2 = this.f9972h0;
        int i12 = this.J;
        hbVar2.setBackgroundColor((i12 == 1 || i12 == 0) ? 0 : -14737633);
        hb hbVar3 = this.f9972h0;
        ci.n1 n1Var = zf.j0.f51574a;
        hbVar3.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(12.0f)));
        this.f9972h0.setClipToOutline(true);
        t9 t9Var = new t9(this, 14);
        ?? view = new View(activity);
        view.f24579a = new TextPaint(1);
        view.f24580b = new TextPaint(1);
        bs bsVar = bs.h;
        view.f24585s = new org.telegram.ui.Components.f6((View) view, 0L, 350L, bsVar);
        view.I = new rc0(view, 7);
        view.f24587x = t9Var;
        this.C1 = view;
        jb jbVar = new jb(this, activity, this.f10002r0, this.f10006s0);
        this.X0 = jbVar;
        jbVar.setCollageView(this.A0);
        jb jbVar2 = this.X0;
        jbVar2.v = new t9(this, 15);
        jbVar2.setOnTapListener(new t9(this, 16));
        this.X0.setVisibility(8);
        jb jbVar3 = this.X0;
        jbVar3.N = new t9(this, 17);
        this.f9972h0.addView(jbVar3, w7.z5.e(-1, -1, 119));
        this.f9972h0.addView(this.C1, w7.z5.e(-1, -1, 119));
        ub ubVar4 = this.f9988n;
        lb lbVar = new lb(this, activity, ubVar4, ubVar4, this.f10001r, bVar, this.f10002r0);
        this.f9957c1 = lbVar;
        lbVar.setAccount(i10);
        this.f9957c1.setUiBlurBitmap(new ca(this, 6));
        org.telegram.ui.Components.qc.a(this.f9984l0, new ah.m0(this, 4));
        this.f9957c1.setOnHeightUpdate(new u9(this, 13));
        this.f9957c1.setOnPeriodUpdate(new u9(this, 4));
        long j10 = this.N;
        if (j10 != 0) {
            this.f9957c1.setDialogId(j10);
        }
        this.f9957c1.setOnPremiumHint(new u9(this, 5));
        this.f9957c1.setOnKeyboardOpen(new u9(this, 6));
        ai.ic icVar = new ai.ic(this, activity, 1);
        this.f10009t0 = icVar;
        this.f10001r.addView(icVar);
        gc gcVar = new gc(activity, this.f10001r, this.f9972h0, bVar, this.f10002r0);
        this.Z0 = gcVar;
        gcVar.setOnTimelineClick(new t9(this, 10));
        this.Z0.setOnHeightChange(new t9(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f7 = 388;
        frameLayout4.addView(this.Z0, w7.z5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kc kcVar = new kc(activity);
        this.f9950a1 = kcVar;
        kcVar.setVisibility(8);
        this.f9950a1.a(false);
        this.Y0.addView(this.f9950a1, w7.z5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f9984l0.addView(this.Y0, w7.z5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f9984l0.addView(this.f9957c1, w7.z5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        gc gcVar2 = new gc(activity, this.f10001r, this.f9972h0, bVar, this.f10002r0);
        this.f10010t1 = gcVar2;
        gcVar2.X0 = true;
        gcVar2.setVisibility(8);
        this.f10010t1.setAlpha(0.0f);
        this.f9984l0.addView(this.f10010t1, w7.z5.d(-1, f7, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        ma maVar = new ma(this, activity, bVar, this.f10002r0);
        this.f9960d1 = maVar;
        maVar.setVisibility(8);
        this.f9984l0.addView(this.f9960d1, w7.z5.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f9989n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        q2 q2Var = this.f9989n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q2Var.setScaleType(scaleType);
        this.f9989n0.setImageResource(R.drawable.msg_photo_back);
        q2 q2Var2 = this.f9989n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        q2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f9989n0.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.f9989n0.setOnClickListener(new v9(this, 1));
        this.f9975i0.addView(this.f9989n0, w7.z5.e(56, 56, 51));
        this.f10005s.a(this.f9989n0);
        t7 t7Var = new t7(activity, i10);
        this.f9992o0 = t7Var;
        t7Var.a(false, false);
        this.f9992o0.setOnClickListener(new ai.p(16, this, activity));
        this.f9975i0.addView(this.f9992o0, w7.z5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.f9995p0 = j5Var;
        j5Var.setTextSize(20);
        this.f9995p0.setGravity(19);
        this.f9995p0.setTextColor(-1);
        this.f9995p0.setTypeface(AndroidUtilities.bold());
        this.f9995p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f9995p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f9995p0.setAlpha(0.0f);
        this.f9995p0.setVisibility(8);
        this.f9995p0.setEllipsizeByGradient(true);
        this.f9995p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f9975i0.addView(this.f9995p0, w7.z5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f9978j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f9978j0.setGravity(5);
        this.f9975i0.addView(this.f9978j0, w7.z5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        u9 u9Var = new u9(this, 7);
        ub ubVar5 = this.f9988n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f9882w = true;
        imageView2.f9883x = true;
        imageView2.h = u9Var;
        imageView2.f9875a = i10;
        imageView2.f9876b = ubVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.g0(imageView2, 20));
        imageView2.f9878f = new dq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f9963e1 = imageView2;
        x3 x3Var = new x3(activity, 1);
        x3Var.l(1.0f, -71.0f);
        x3Var.d = 2000L;
        x3Var.U = false;
        x3Var.H.r(true, false);
        this.f9982k1 = x3Var;
        x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f9975i0.addView(this.f9982k1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f9970g1 = imageView3;
        imageView3.setScaleType(scaleType);
        xj0 xj0Var = this.f9970g1;
        a8 a8Var = this.K1;
        xj0Var.setImageResource((a8Var == null || !a8Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.f9970g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f9970g1.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.f9970g1.setOnClickListener(new v9(this, 2));
        this.f9970g1.setVisibility(8);
        this.f9970g1.setAlpha(0.0f);
        g6 g6Var = new g6(activity);
        this.f9979j1 = g6Var;
        g6Var.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.f9979j1.setVisibility(8);
        this.f9979j1.setAlpha(0.0f);
        this.f9979j1.setOnClickListener(new v9(this, 3));
        this.f9978j0.addView(this.f9979j1, w7.z5.q(46, 56, 53));
        this.f9978j0.addView(this.f9970g1, w7.z5.q(46, 56, 53));
        this.f9978j0.addView(this.f9963e1, w7.z5.e(46, 56, 53));
        hc hcVar = new hc(activity);
        this.E0 = hcVar;
        hcVar.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.E0.setOnClickListener(new v9(this, 4));
        this.E0.setOnLongClickListener(new c5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f10005s.a(this.E0);
        this.f9975i0.addView(this.E0, w7.z5.e(56, 56, 53));
        ic icVar2 = new ic(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = icVar2;
        icVar2.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new v9(this, 5));
        boolean q6 = c1.q(activity);
        this.F0.setVisibility(q6 ? 0 : 8);
        this.F0.setAlpha(q6 ? 1.0f : 0.0f);
        this.f10005s.a(this.F0);
        this.f9975i0.addView(this.F0, w7.z5.e(56, 56, 53));
        ?? hcVar2 = new hc(activity);
        this.G0 = hcVar2;
        hcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        if (this.f10030z0 == null) {
            i11 = 6;
            this.f10030z0 = (t) t.a().get(6);
        } else {
            i11 = 6;
        }
        this.G0.setOnClickListener(new v9(this, i11));
        this.G0.a(new u(this.f10030z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f10005s.a(this.G0);
        this.f9975i0.addView(this.G0, w7.z5.e(56, 56, 53));
        hc hcVar3 = new hc(activity);
        this.H0 = hcVar3;
        hcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new v9(this, 7));
        this.f10005s.a(this.H0);
        this.f9975i0.addView(this.H0, w7.z5.e(56, 56, 53));
        y yVar = new y(activity, this.f10005s);
        this.I0 = yVar;
        yVar.f10120a.u0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new u9(this, 8));
        this.f9975i0.addView(this.I0, w7.z5.e(-1, 56, 53));
        x3 x3Var2 = new x3(activity, 1);
        x3Var2.l(1.0f, -20.0f);
        x3Var2.d = 5000L;
        x3Var2.i(true);
        x3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        x3Var2.f10081l0 = new ah.j(13);
        this.l1 = x3Var2;
        x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f9975i0.addView(this.l1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        x3 x3Var3 = new x3(activity, 2);
        x3Var3.l(0.0f, 28.0f);
        x3Var3.d = 5000L;
        x3Var3.p(true);
        this.f9986m1 = x3Var3;
        this.f9975i0.addView(x3Var3, w7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        x3 x3Var4 = new x3(activity, 1);
        x3Var4.l(1.0f, -20.0f);
        x3Var4.d = 5000L;
        x3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f9990n1 = x3Var4;
        x3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f9975i0.addView(this.f9990n1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f9389a = paint;
        Paint paint2 = new Paint(1);
        view2.f9390b = paint2;
        view2.e = new org.telegram.ui.Components.f6((View) view2, 0L, 250L, bsVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        view2.f9391c = p6Var;
        p6Var.n(0.3f, 250L, bsVar);
        p6Var.w(AndroidUtilities.dp(13.0f));
        p6Var.u(-1);
        p6Var.x(AndroidUtilities.bold());
        p6Var.setCallback(view2);
        p6Var.f29192b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        h0(false, false);
        this.f9975i0.addView(this.J0, w7.z5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f10005s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        z6 z6Var = new z6(activity);
        this.O0 = z6Var;
        z6Var.setDelegate(qaVar);
        z6 z6Var2 = this.O0;
        boolean z10 = this.O1 == 1;
        z6Var2.f10223n0 = -1.0f;
        z6Var2.f10224o0 = z10;
        z6Var2.invalidate();
        this.f9981k0.addView(this.O0, w7.z5.e(-1, 100, 87));
        this.f10005s.a(this.O0);
        this.O0.e(this.A0.j() ? this.A0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f9981k0.addView(this.P0, w7.z5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new v9(this, 8));
        x3 x3Var5 = new x3(activity, 3);
        x3Var5.p(true);
        x3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        x3Var5.h = AndroidUtilities.dp(320.0f);
        x3Var5.d = 5000L;
        x3Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = x3Var5;
        this.f9981k0.addView(x3Var5, w7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        w91 w91Var = new w91(activity);
        this.V0 = w91Var;
        w91Var.M = false;
        w91Var.setAlpha(0.0f);
        this.f9981k0.addView(this.V0, w7.z5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new ca(this, 4));
        w91 w91Var2 = this.V0;
        this.T1 = 0.0f;
        w91Var2.b(0.0f, false);
        j7 j7Var = new j7(activity, i10, new t9(this, 12));
        this.D0 = j7Var;
        j7Var.f9260c = new u9(this, 9);
        this.f9981k0.addView(j7Var, w7.z5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        na naVar = new na(this, activity);
        this.Q0 = naVar;
        naVar.setOnSwitchModeListener(new u9(this, 10));
        this.Q0.setOnSwitchingModeListener(new u9(this, 11));
        this.m0.addView(this.Q0, w7.z5.e(-1, 48, 55));
        this.f10005s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.z5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f10005s.a(this.R0);
        this.R0.setOnClickListener(new v9(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.z5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f10005s.a(this.S0);
        this.S0.setOnClickListener(new v9(this, 10));
        v3 v3Var = new v3(activity);
        this.T0 = v3Var;
        this.m0.addView(v3Var, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f10005s.a(this.T0);
        v3 v3Var2 = new v3(activity);
        this.U0 = v3Var2;
        v3Var2.f9933a.t(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        v3Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f10005s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f10013u1 = dVar2;
        dVar2.setVisibility(8);
        this.f10013u1.setAlpha(0.0f);
        this.f10013u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f10013u1.setOnClickListener(new v9(this, 11));
        this.m0.addView(this.f10013u1, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f9316b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f9315a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.z5.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        j6 j6Var = new j6(frameLayout5, activity, string, true);
        frameLayout5.f9317c = j6Var;
        j6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f9317c, w7.z5.c(-2.0f, -2));
        frameLayout5.e();
        this.f9953b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f9953b1.setOnClickListener(new u9(this, 12));
        this.m0.addView(this.f9953b1, w7.z5.e(-1, 52, 23));
        jc jcVar = new jc(activity);
        this.f9996p1 = jcVar;
        jcVar.setAlpha(0.0f);
        this.f9996p1.setVisibility(8);
        this.f9972h0.addView(this.f9996p1, w7.z5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        l6 l6Var = new l6(activity, i10, bVar);
        this.f9993o1 = l6Var;
        this.f9972h0.addView(l6Var, w7.z5.e(-1, -1, 119));
        l0(false);
    }

    public static vb D(Activity activity, int i10) {
        vb vbVar = F2;
        if (vbVar != null && (vbVar.f9951b != activity || vbVar.f9955c != i10)) {
            vbVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new vb(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(vb vbVar) {
        ya yaVar = vbVar.B0;
        boolean z10 = false;
        if (yaVar != null && yaVar.getTextureView() != null) {
            Bitmap bitmap = vbVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                vbVar.f9958c2 = false;
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
            vbVar.f9958c2 = z10;
            return;
        }
        vbVar.f9958c2 = false;
    }

    public static void b(vb vbVar) {
        ValueAnimator valueAnimator = vbVar.f9980j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            vbVar.f9980j2 = null;
        }
        vbVar.f9983k2 = false;
        nb nbVar = vbVar.f10001r;
        float f7 = nbVar.f9530a;
        float f10 = nbVar.f9531b;
        nbVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        vbVar.f9980j2 = ofFloat;
        ofFloat.addUpdateListener(new ja(vbVar, f7, f10, 0));
        vbVar.f9980j2.setDuration(340L);
        vbVar.f9980j2.setInterpolator(bs.h);
        vbVar.f9980j2.addListener(new ta(vbVar, 0));
        vbVar.f9980j2.start();
    }

    public static boolean c(vb vbVar) {
        Activity activity = vbVar.f9951b;
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
        spannableString.setSpan(new cb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        vb vbVar = F2;
        if (vbVar != null) {
            vbVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        a8 a8Var = this.K1;
        if (a8Var != null) {
            return a8Var.r();
        }
        return 1;
    }

    public final String B() {
        ya yaVar = this.B0;
        if (yaVar != null && yaVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f10014u2.get(this.f10011t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 C() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f9951b);
            this.N0 = v0Var;
            this.f9981k0.addView(v0Var, w7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String E() {
        int i10;
        ya yaVar = this.B0;
        if (yaVar != null && yaVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f10014u2;
                if (this.f10011t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f10011t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f9976i1 == null) {
            uj0 uj0Var = new uj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f9973h1 = uj0Var;
            uj0Var.h = true;
            a8 a8Var = this.K1;
            if (a8Var != null && a8Var.f8744y0) {
                uj0Var.M(35);
                this.f9973h1.P(36);
            } else {
                uj0Var.P(0);
                this.f9973h1.M(0);
            }
            this.f9973h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J9, this.f9948a);
            this.f9973h1.Q(w02, "Sunny");
            this.f9973h1.Q(w02, "Path 6");
            this.f9973h1.Q(w02, "Path");
            this.f9973h1.Q(w02, "Path 5");
            this.f9973h1.o();
            ImageView imageView = new ImageView(this.f9951b);
            this.f9976i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f9976i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f9976i1.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
            this.f9976i1.setOnClickListener(new v9(this, 0));
            this.f9976i1.setVisibility(8);
            this.f9976i1.setImageDrawable(this.f9973h1);
            this.f9976i1.setAlpha(0.0f);
            this.f9978j0.addView(this.f9976i1, 0, w7.z5.q(46, 56, 53));
        }
        return this.f9976i1;
    }

    public final void G() {
        xa xaVar = this.f10016v1;
        if (xaVar == null) {
            return;
        }
        this.f10017v2 = null;
        xaVar.getTopLayout().setAlpha(0.0f);
        this.f10016v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f10016v1.getBottomLayout().setAlpha(0.0f);
        this.f10016v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f10016v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f10016v1.setVisibility(8);
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
        ua uaVar;
        if (!this.W && (uaVar = this.M0) != null) {
            if (uaVar.getTranslationY() < (this.f9988n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ei.vb.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j10) {
        if (!this.S1 && this.K1 != null) {
            z9 z9Var = this.f9971g2;
            if (z9Var != null) {
                AndroidUtilities.cancelRunOnUIThread(z9Var);
            }
            this.f9974h2 = true;
            this.S1 = true;
            this.f9971g2 = new z9(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f9971g2, j10);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f9971g2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: ei.vb.L():boolean");
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
            this.f10010t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f9984l0.setVisibility(i17);
            this.f9957c1.setVisibility(8);
            this.f10013u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f9953b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f9984l0.setVisibility(i14);
            this.f9970g1.setVisibility(8);
            this.f9979j1.setVisibility(8);
            this.f9963e1.setVisibility(8);
            ImageView imageView = this.f9976i1;
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
            this.f9995p0.setVisibility(i16);
            v();
            this.f9996p1.setAlpha(0.0f);
            this.f9996p1.setVisibility(8);
            this.f9950a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            a8 a8Var = this.K1;
            if (a8Var == null || !a8Var.f8722n) {
                t();
                G();
            }
            ag0 ag0Var = this.C1;
            if (ag0Var != null) {
                ag0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            a8 a8Var2 = this.K1;
            if (a8Var2 != null && a8Var2.f8712h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f9950a1.setVisibility(i13);
            this.f9984l0.setAlpha(1.0f);
            this.f9984l0.setTranslationY(0.0f);
            a8 a8Var3 = this.K1;
            if (a8Var3 == null || a8Var3.J0 == 0) {
                i18 = 0;
            }
            this.f9957c1.setVisibility(i18);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            v0 C = C();
            C.f9927r.d(0.0f, true);
            C.a(true);
            com.google.firebase.messaging.s sVar = C.h;
            if (sVar != null) {
                AndroidUtilities.cancelRunOnUIThread(sVar);
            }
            com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(C, 9);
            C.h = sVar2;
            AndroidUtilities.runOnUIThread(sVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        ag0 ag0Var2 = this.C1;
        if (ag0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f9969g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ag0Var2.setAllowTouch(z11);
        }
        lb lbVar = this.f9957c1;
        if (lbVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            lbVar.f9399e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f9955c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            ci.h7 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void N(int i10, int i11) {
        a8 a8Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        a8 a8Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        a8 a8Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        t9 t9Var;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        a8 a8Var4;
        int i17;
        a8 a8Var5;
        a8 a8Var6;
        a8 a8Var7;
        p71 textureView;
        a8 a8Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Y(false);
            this.O0.setVisibility(0);
            z6 z6Var = this.O0;
            if (z6Var != null) {
                z6Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            a8 a8Var9 = this.K1;
            if (a8Var9 != null) {
                a8Var9.i(false);
                this.K1 = null;
            }
            ib ibVar = this.A0;
            if (ibVar != null) {
                ibVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            d0(null);
            a0(new t9(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            x3 x3Var = this.l1;
            if (x3Var != null) {
                x3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f9955c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                a8Var = this.K1;
            } else {
                a8Var = null;
            }
            this.f9963e1.setEntry(a8Var);
            if (this.O1 == 1) {
                this.f9970g1.setVisibility(0);
                a8 a8Var10 = this.K1;
                if (a8Var10 != null && a8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                e0(z13, false);
                this.f9979j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((ah0) this.f9979j1.f9071c).a(this.X0.k(), false);
                this.f9995p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                a8 a8Var11 = this.K1;
                if (a8Var11 != null && !TextUtils.isEmpty(a8Var11.f8743y)) {
                    this.f9970g1.setVisibility(8);
                    this.f9979j1.setVisibility(0);
                    ((ah0) this.f9979j1.f9071c).a(true, false);
                    this.f9995p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f9995p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f9963e1.setVisibility(0);
            a8 a8Var12 = this.K1;
            if (a8Var12 != null && a8Var12.f8736u) {
                F().setVisibility(0);
                n0(false);
            } else {
                ImageView imageView = this.f9976i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f9953b1.setVisibility(0);
            this.X0.setVisibility(0);
            a8 a8Var13 = this.K1;
            if ((a8Var13 != null && a8Var13.J0 != 0) || this.f10015v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f9957c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            a8 a8Var14 = this.K1;
            if ((a8Var14 != null && a8Var14.J0 != 0) || this.f10015v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f9984l0.setVisibility(0);
            this.f9984l0.clearFocus();
            a8 a8Var15 = this.K1;
            if (a8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = a8Var15.I0;
            }
            this.f9957c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((a8Var2 = this.K1) == null || !a8Var2.f8710g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9957c1.setPeriodVisible(z10);
            a8 a8Var16 = this.K1;
            if (a8Var16 != null && a8Var16.f8725o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f9957c1.setHasRoundVideo(z11);
            lb lbVar = this.f9957c1;
            if (lbVar == null) {
                j10 = 0;
            } else {
                a8 a8Var17 = this.K1;
                if (a8Var17 == null || !a8Var17.f8722n) {
                    j10 = 0;
                    lbVar.v(null, null);
                } else {
                    TLRPC.Peer peer = a8Var17.f8728q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        a8 a8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        a8Var18.f8726p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        a8 a8Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        a8Var19.f8726p = append;
                    }
                    String str3 = this.K1.f8732s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f9957c1.v(append, str4);
                }
            }
            a8 a8Var20 = this.K1;
            if (a8Var20 != null && a8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            gc gcVar = this.Z0;
            boolean z22 = gcVar.f9102j0;
            gcVar.f9102j0 = z12;
            gcVar.f9100i0.f(z12, true);
            gcVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f9995p0.setVisibility(0);
            this.f10010t1.setVisibility(0);
            a8 a8Var21 = this.K1;
            if (a8Var21 != null && a8Var21.f8699b0) {
                this.f9995p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f9984l0.setVisibility(0);
            this.f10013u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f9995p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            a8 a8Var22 = this.K1;
            if (a8Var22 != null && a8Var22.J0 != j10) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (a8Var22 != null && a8Var22.f8710g) {
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
            k6 k6Var = this.f9953b1;
            if (!TextUtils.equals(string, k6Var.d) || z23 != k6Var.e) {
                k6Var.removeView(k6Var.f9317c);
                Context context = k6Var.getContext();
                k6Var.d = string;
                k6Var.e = z23;
                j6 j6Var = new j6(k6Var, context, string, z23);
                k6Var.f9317c = j6Var;
                j6Var.setContentDescription(string);
                k6Var.addView(k6Var.f9317c, w7.z5.c(-2.0f, -2));
                k6Var.e();
            }
            this.f10010t1.setVisibility(8);
            this.f10013u1.setVisibility(8);
            if (!this.f9974h2) {
                a8 a8Var23 = this.K1;
                if (a8Var23 != null && a8Var23.f8736u) {
                    this.X0.l(a8Var23);
                } else {
                    this.X0.set(a8Var23);
                }
            }
            this.f9974h2 = false;
            iu editText = this.f9957c1.f9400f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                t9Var = null;
            } else {
                t9Var = new t9(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(t9Var);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f9960d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                ma maVar = this.f9960d1;
                maVar.c(false, false);
                maVar.f9367c = arrayList;
                maVar.d = arrayList2;
                maVar.e = arrayList3;
                maVar.f9372w = new d11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                maVar.K = new d11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                maVar.f9366b.W2.N(false);
                this.f9960d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((a8Var8 = this.K1) == null || (!a8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                a8 a8Var24 = this.K1;
                if (a8Var24 != null && (a8Var24.f8701c || a8Var24.f8710g || this.f10012u0)) {
                    if (a8Var24.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    a8 a8Var25 = this.K1;
                    if (a8Var25.K && a8Var25.f8697a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new ca(this, 7));
                    }
                    this.f9957c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    lb lbVar2 = this.f9957c1;
                    lbVar2.V = true;
                    lbVar2.f9400f.setText("");
                }
            }
            a8 a8Var26 = this.K1;
            if (a8Var26 != null && ((a8Var26.f8736u && !a8Var26.K) || a8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f9953b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (a8Var7 = this.K1) != null && !a8Var7.f8736u && !a8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f9953b1.d(3, z19);
            if (!this.N1 && !this.f9957c1.o()) {
                ci.h7 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int A = A();
                ci.b7 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f5397a, A) || ((a8Var6 = this.K1) != null && (a8Var6.f8710g || a8Var6.J0 != j10))) {
                    z20 = true;
                    this.f9953b1.setShareEnabled(z20);
                    a8Var4 = this.K1;
                    if (a8Var4 == null && a8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f9970g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f9995p0.setVisibility(0);
                    this.f9995p0.setTranslationX(0.0f);
                    a8Var5 = this.K1;
                    if (a8Var5 == null && a8Var5.J0 != j10) {
                        this.f9995p0.l("", false);
                    } else if (a8Var5 == null && a8Var5.f8710g) {
                        this.f9995p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (a8Var5 == null && a8Var5.f8736u) {
                        this.f9995p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (a8Var5 == null && a8Var5.f8722n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(this.f9995p0, 32.0f, i18);
                        this.f9995p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(l5Var, 0, 1, 33);
                        if (this.K1.f8728q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f8728q.user_id));
                            l5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f8728q)));
                            l5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f9995p0.l(spannableStringBuilder, false);
                    } else {
                        this.f9995p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f9953b1.setShareEnabled(z20);
            a8Var4 = this.K1;
            if (a8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f9970g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f9995p0.setVisibility(0);
            this.f9995p0.setTranslationX(0.0f);
            a8Var5 = this.K1;
            if (a8Var5 == null) {
            }
            if (a8Var5 == null) {
            }
            if (a8Var5 == null) {
            }
            if (a8Var5 == null) {
            }
            this.f9995p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            lb lbVar3 = this.f9957c1;
            i80 i80Var = lbVar3.V0;
            if (i80Var != null) {
                i80Var.u();
                lbVar3.V0 = null;
            }
            this.f9982k1.e(z21);
            ma maVar2 = this.f9960d1;
            if (maVar2.M) {
                maVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (a8Var3 = this.K1) != null) {
            if (a8Var3.f8706e0 < j10) {
                a8Var3.f8706e0 = j10;
            }
            this.M1 = a8Var3.f8706e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f8712h0;
            } else {
                duration = this.X0.getDuration();
            }
            a8 a8Var27 = this.K1;
            if (a8Var27.f8712h0 <= 0) {
                a8Var27.f8712h0 = duration;
            }
            File file = a8Var27.Z0;
            if (file == null) {
                file = a8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            a8 a8Var28 = this.K1;
            this.f10010t1.o(false, absolutePath, a8Var28.f8712h0, a8Var28.P);
            a8 a8Var29 = this.K1;
            float f10 = (float) duration;
            long j11 = a8Var29.Z * f10;
            long j12 = a8Var29.f8696a0 * f10;
            gc gcVar2 = this.f10010t1;
            gcVar2.Z0 = j11;
            gcVar2.f9082a1 = j12;
            ac acVar = gcVar2.h;
            if (acVar != null) {
                ac.a(acVar, true);
            }
            ai.q qVar = new ai.q(this, 19);
            this.f10010t1.setDelegate(new va(qVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f10010t1.setVideoLeft(max);
            this.f10010t1.setVideoRight(0.04f + max);
            qVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        ag0 ag0Var = this.C1;
        if (ag0Var != null) {
            ag0Var.setAllowTouch(false);
        }
        x3 x3Var2 = this.f9986m1;
        boolean z24 = true;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        lb lbVar4 = this.f9957c1;
        if (lbVar4 != null) {
            g gVar = lbVar4.f9400f;
            gVar.d();
            gVar.k(true);
            this.f9957c1.f9399e0 = true;
        }
        jb jbVar = this.X0;
        if (jbVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            jbVar.x(8, z15);
        }
        xa xaVar = this.f10016v1;
        if (xaVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            xaVar.setCoverPreview(z14);
        }
        x3 x3Var3 = this.f9990n1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ib ibVar2 = this.A0;
        if (i11 != 1 || !ibVar2.j()) {
            z24 = false;
        }
        ibVar2.setPreview(z24);
    }

    public final void O() {
        qg.c1 c1Var;
        int i10;
        if (this.f9966f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f10025x2 = new t9(this, 3);
            } else {
                Y(false);
            }
        }
        lb lbVar = this.f9957c1;
        if (lbVar != null) {
            lbVar.f9400f.s();
        }
        z6 z6Var = this.O0;
        if (z6Var != null) {
            z6Var.h();
        }
        l6 l6Var = this.f9993o1;
        if (l6Var != null) {
            ci.h7 storiesController = MessagesController.getInstance(l6Var.f9377a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f5402i.f(UserConfig.getInstance(storiesController.f5397a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            l6Var.f9378b = storiesController.f5398b.m() + i10 + 1;
            l6Var.f9379c.invalidate();
        }
        xa xaVar = this.f10016v1;
        if (xaVar != null && (c1Var = xaVar.O0.d) != null) {
            c1Var.postRunnable(c1Var.f44485w);
        }
        jb jbVar = this.X0;
        if (jbVar != null) {
            jbVar.x(0, false);
        }
        a1 a1Var = MessagesController.getInstance(this.f9955c).getStoriesController().f5415w;
        if (!a1Var.f8675c && !a1Var.d) {
            a1Var.d = true;
            x0 x0Var = new x0(a1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.f8673a);
            messagesStorage.getStorageQueue().postRunnable(new ai.x7((Object) messagesStorage, false, (Object) x0Var, 3));
        }
    }

    public final void P(int i10, int i11) {
        boolean z10;
        xa xaVar;
        fb fbVar;
        gb gbVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        xa xaVar2;
        if (i11 == 0) {
            this.f9989n0.setVisibility(8);
        }
        if (i10 == 0 && (xaVar2 = this.f10016v1) != null) {
            xaVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f9957c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f9970g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f9979j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f9963e1.setVisibility(i14);
            ImageView imageView = this.f9976i1;
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
            this.f9995p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (xaVar = this.f10016v1) != null) {
            xaVar.f9005d1.setLayerType(0, null);
        }
        ag0 ag0Var = this.C1;
        if (ag0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            ag0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            fb fbVar2 = this.f10003r1;
            if (fbVar2 != null) {
                fbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (fbVar = this.f10003r1) != null) {
            fbVar.setVisibility(8);
            this.f10003r1.setAppearProgress(0.0f);
            fb fbVar3 = this.f10003r1;
            fbVar3.f9228x = null;
            g0 g0Var = fbVar3.f9223f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            fbVar3.d.setVisibility(8);
            fbVar3.f9220a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            gb gbVar2 = this.f10007s1;
            if (gbVar2 != null) {
                gbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (gbVar = this.f10007s1) != null) {
            gbVar.setVisibility(8);
            this.f10007s1.setAppearProgress(0.0f);
            gb gbVar3 = this.f10007s1;
            gbVar3.f9428b = null;
            g0 g0Var2 = gbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            gbVar3.e.setVisibility(8);
            gbVar3.setVisibility(8);
        }
    }

    public final void Q(pb pbVar) {
        ci.b7 o10;
        ub ubVar;
        if (this.d) {
            return;
        }
        int i10 = this.f9955c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f10012u0 = false;
        this.e = false;
        this.B2 = false;
        this.f10006s0.f9648g = false;
        WindowManager windowManager = this.f9965f;
        if (windowManager != null && (ubVar = this.f9988n) != null && ubVar.getParent() == null) {
            ub ubVar2 = this.f9988n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ubVar2, layoutParams);
            windowManager.addView(this.f9988n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.f10015v0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (pbVar != null) {
            this.F = pbVar;
            this.J = pbVar.f9664a;
            rectF.set(pbVar.f9666c);
            this.G = pbVar.f9665b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f10001r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f9972h0.setBackgroundColor(i11);
        this.f10001r.setTranslationX(0.0f);
        this.f10001r.setTranslationY(0.0f);
        this.f10001r.b(0.0f);
        this.f10001r.setScaleX(1.0f);
        this.f10001r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f9951b, 1);
        f(1.0f, true, new t9(this, 6));
        d();
        this.f10015v0 = 0L;
        this.f10019w0 = "";
    }

    public final void R(ob obVar, a8 a8Var, long j10) {
        int i10;
        ub ubVar;
        if (this.d) {
            return;
        }
        int i11 = this.f9955c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f10012u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f9965f;
        if (windowManager != null && (ubVar = this.f9988n) != null && ubVar.getParent() == null) {
            ub ubVar2 = this.f9988n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ubVar2, layoutParams);
            windowManager.addView(this.f9988n, layoutParams);
            f0();
        }
        this.K1 = a8Var;
        this.O1 = a8Var.K ? 1 : 0;
        this.f10006s0.f9648g = false;
        RectF rectF = this.H;
        if (obVar != null) {
            this.F = obVar;
            this.J = obVar.f9664a;
            rectF.set(obVar.f9666c);
            this.G = obVar.f9665b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f10001r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f9972h0.setBackgroundColor(i10);
        this.f10001r.setTranslationX(0.0f);
        this.f10001r.setTranslationY(0.0f);
        this.f10001r.b(0.0f);
        this.f10001r.setScaleX(1.0f);
        this.f10001r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f9951b, 1);
        a8 a8Var2 = this.K1;
        if (a8Var2 != null) {
            this.f9957c1.setText(a8Var2.C0);
        }
        K(new la(this, 0), j10);
        if (this.K1.f8699b0) {
            i13 = 2;
        }
        J(i13, false);
        k0(-1, false, false);
        this.f9953b1.b(false, false);
        d();
        this.f10015v0 = 0L;
        this.f10019w0 = "";
    }

    public final void S() {
        i80 i80Var;
        jb jbVar = this.X0;
        if (jbVar != null) {
            jbVar.x(4, true);
        }
        lb lbVar = this.f9957c1;
        if (lbVar != null && (i80Var = lbVar.V0) != null) {
            i80Var.u();
            lbVar.V0 = null;
        }
        sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.n2) new za(this, 1), 14, false);
        y0Var.setOnDismissListener(new ha(this, 1));
        y0Var.show();
    }

    public final void T(ob obVar, a8 a8Var) {
        int i10;
        boolean z10;
        int i11;
        ci.b7 o10;
        ub ubVar;
        if (this.d) {
            return;
        }
        int i12 = this.f9955c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f10012u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f9965f;
        if (windowManager != null && (ubVar = this.f9988n) != null && ubVar.getParent() == null) {
            ub ubVar2 = this.f9988n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ubVar2, layoutParams);
            windowManager.addView(this.f9988n, layoutParams);
            f0();
        }
        this.K1 = a8Var;
        s9.a(i12, a8Var);
        a8 a8Var2 = this.K1;
        if (a8Var2 != null && a8Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (a8Var2 != null && a8Var2.f8736u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10006s0.f9648g = z10;
        if (this.f10015v0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (obVar != null) {
            this.F = obVar;
            this.J = obVar.f9664a;
            rectF.set(obVar.f9666c);
            this.G = obVar.f9665b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f10001r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f9972h0.setBackgroundColor(i11);
        this.f10001r.setTranslationX(0.0f);
        this.f10001r.setTranslationY(0.0f);
        this.f10001r.b(0.0f);
        this.f10001r.setScaleX(1.0f);
        this.f10001r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f9951b, 1);
        a8 a8Var3 = this.K1;
        if (a8Var3 != null) {
            this.f9957c1.setText(a8Var3.C0);
        }
        this.f9953b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new t9(this, 6));
        d();
        this.f10015v0 = 0L;
        this.f10019w0 = "";
    }

    public final void U() {
        qg.e1 e1Var = this.f10020w1;
        if (e1Var != null) {
            e1Var.bringToFront();
        }
        View view = this.f10024x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f10028y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f10031z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        jc jcVar = this.f9996p1;
        if (jcVar != null) {
            jcVar.bringToFront();
        }
        ag0 ag0Var = this.C1;
        if (ag0Var != null) {
            ag0Var.bringToFront();
        }
        rf0 rf0Var = this.E1;
        if (rf0Var != null) {
            rf0Var.bringToFront();
        }
        tf0 tf0Var = this.F1;
        if (tf0Var != null) {
            tf0Var.bringToFront();
        }
        l6 l6Var = this.f9993o1;
        if (l6Var != null) {
            l6Var.bringToFront();
        }
        p pVar = this.f9999q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(a8 a8Var, boolean z10) {
        File file;
        View view;
        float f7;
        a8 a8Var2;
        boolean z11;
        int i10;
        if (a8Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = a8Var.O0;
            } else {
                file = a8Var.N0;
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
            p71 textureView = this.X0.getTextureView();
            if (a8Var.K && !a8Var.f8736u && textureView != null) {
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
            File file2 = a8Var.Q0;
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
            File file3 = a8Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            xa xaVar = this.f10016v1;
            if (xaVar != null && xaVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                xa xaVar2 = this.f10016v1;
                xaVar2.I0 = true;
                z5 z5Var = xaVar2.R0;
                z5Var.f45315a = true;
                z5Var.draw(canvas);
                xa xaVar3 = this.f10016v1;
                xaVar3.R0.f45315a = false;
                xaVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w9 = a8.w(this.f9955c, "jpg");
            if (z10) {
                a8Var2 = a8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new s1(this, createBitmap, z11, w9, a8Var2, 1));
            } else {
                a8Var2 = a8Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w9));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (!z11) {
                a8Var2.N0 = w9;
            }
            a8Var2.f8700b1 = createScaledBitmap;
        }
    }

    public final void W() {
        ci.b7 o10;
        int size;
        char c10;
        View[] viewPages;
        m61[] m61VarArr;
        r9 r9Var = this.f9998q0;
        BitmapDrawable bitmapDrawable = null;
        if (r9Var != null) {
            r9Var.dismiss();
            this.f9998q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f9963e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            j6 j6Var = this.f9953b1.f9317c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(j6Var, i10);
            return;
        }
        lb lbVar = this.f9957c1;
        if (lbVar != null && lbVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.q6 q6Var = lbVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            lbVar.e();
            return;
        }
        a8 a8Var = this.K1;
        int i12 = this.f9955c;
        if ((a8Var == null || (!a8Var.f8710g && a8Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        ci.b bVar = this.f9948a;
        char c11 = 1;
        if (lbVar != null && !this.K1.D0) {
            CharSequence text = lbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((m11[]) spannable.getSpans(0, text.length(), m11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new xc(this.f9988n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.h6.f21045gc, 0, new t9(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(lbVar, i13);
                    return;
                }
            }
        }
        a8 a8Var2 = this.K1;
        if (!a8Var2.f8710g && a8Var2.J0 == 0) {
            if (this.N != 0) {
                a8Var2.f8738v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            jb jbVar = this.X0;
            jbVar.x(3, true);
            r9 r9Var2 = new r9(this.f9951b, this.K1.I0, bVar);
            r9Var2.r1(this.K1.E0);
            r9Var2.q1(this.K1.f8738v0);
            r9Var2.F = this.M;
            r9Var2.U = new u9(this, 14);
            r9Var2.f1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            r9Var2.n1(size);
            r9Var2.l1(false);
            CharSequence text2 = lbVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (m61 m61Var : (m61[]) ((Spanned) text2).getSpans(0, text2.length(), m61.class)) {
                    if (m61Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(m61Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f20419id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f20419id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            r9Var2.S = arrayList2;
            r9Var2.W = new u9(this, 15);
            r9Var2.X = new u9(this, 16);
            r9Var2.T = new ca(this, 10);
            this.f9998q0 = r9Var2;
            a8 a8Var3 = this.K1;
            if (a8Var3.K) {
                if (jbVar != null && !a8Var3.f8709f0 && this.f9966f0 != 2) {
                    a8Var3.f8706e0 = jbVar.getCurrentPosition();
                    Utilities.Callback u9Var = new u9(this, 17);
                    View view = this.f10020w1;
                    View view2 = this.f10031z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = jbVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    jbVar.h(u9Var, viewArr);
                }
                r9 r9Var3 = this.f9998q0;
                Bitmap bitmap = this.K1.f8711g0;
                t9 t9Var = new t9(this, 20);
                if (bitmap != null) {
                    r9Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                r9Var3.f9746b0 = bitmapDrawable;
                r9Var3.f9748c0 = t9Var;
                h1 h1Var = r9Var3.f9745b;
                if (h1Var != null) {
                    for (View view3 : h1Var.getViewPages()) {
                        if (view3 instanceof k9) {
                            k9 k9Var = (k9) view3;
                            k9Var.g(false);
                            k9Var.e(false);
                        }
                    }
                }
            }
            this.f9998q0.setOnDismissListener(new ha(this, 0));
            this.f9998q0.show();
            return;
        }
        a8Var2.f8719l = false;
        h(null);
        o0();
    }

    public final void X(qb qbVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (qbVar != null) {
            this.F = qbVar;
            this.J = qbVar.f9664a;
            rectF.set(qbVar.f9666c);
            this.G = qbVar.f9665b;
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
        this.f9972h0.setBackgroundColor(i10);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f10021w2 || z10) {
            this.f10008s2 = false;
            Activity activity = this.f9951b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f10008s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    zq zqVar = new zq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    zqVar.e = dp;
                    zqVar.f32995f = dp2;
                    this.A0.setCameraThumb(zqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f9948a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                        alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ca(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f20601a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f10021w2 = true;
                }
            }
            if (!this.f10008s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new t9(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        ya yaVar = this.B0;
        if (yaVar != null && yaVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new z1(this, this.B0.getTextureView().getBitmap(), runnable, 8));
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
            animate.alpha(f7).setUpdateListener(new wa(this, 1)).setListener(new ah.q0(this, z10, view, 2)).setDuration(320L).setInterpolator(bs.h).start();
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
            this.f9965f.updateViewLayout(this.f9988n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f9955c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void d0(String str) {
        int i10;
        this.E0.clearAnimation();
        ya yaVar = this.B0;
        if ((yaVar != null && yaVar.isDual()) || this.a2) {
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
        hc hcVar = this.E0;
        if (hcVar.f9174n != i10) {
            hcVar.f9174n = i10;
            ValueAnimator valueAnimator = hcVar.f9175r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                hcVar.f9175r = null;
            }
            hcVar.setDrawable(i10);
        }
        if (this.f9966f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(this.E0, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ci.b7 o10;
        a8 a8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            z6 z6Var = this.O0;
            if (z6Var != null) {
                z6Var.h();
            }
            if (this.f9987m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f9987m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f9987m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            z6 z6Var2 = this.O0;
            if (z6Var2 != null && !this.V1) {
                z6Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f9966f0;
            int i15 = this.f9955c;
            if (i14 == 1) {
                if (!this.N1 && !this.f9957c1.o()) {
                    ci.h7 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int A = A();
                    ci.b7 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f5397a, A) || ((a8Var = this.K1) != null && (a8Var.f8710g || a8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f9953b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                a8 a8Var2 = this.K1;
                if (a8Var2 == null || a8Var2.J0 == 0) {
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
        Boolean bool = this.f9997p2;
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
                this.f10000q2 = new da(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f9991n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f9991n2 = null;
            }
            o1.k kVar = this.f9994o2;
            if (kVar != null) {
                kVar.c();
                this.f9994o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            ua uaVar = this.M0;
            if (uaVar != null) {
                uaVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            nb nbVar = this.f10001r;
            if (nbVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                nbVar.setImportantForAccessibility(i10);
            }
            ua uaVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            uaVar2.setImportantForAccessibility(i11);
            this.f9997p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            ub ubVar = this.f9988n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (ubVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, ubVar.getHeight());
            ua uaVar3 = this.M0;
            uaVar3.K = !z10;
            if (this.f9980j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f9983k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(uaVar3, o1.h.f17541n, height);
                this.f9994o2 = kVar2;
                kVar2.f17558u.a(0.75f);
                this.f9994o2.f17558u.b(350.0f);
                this.f9994o2.a(new ea(this, height, 0));
                this.f9994o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f9991n2 = ofFloat;
                ofFloat.addUpdateListener(new fa(this, 0));
                this.f9991n2.addListener(new ta(this, 1));
                this.f9991n2.setDuration(450L);
                this.f9991n2.setInterpolator(bs.h);
                this.f9991n2.start();
            }
            if (!z10 && !this.S1) {
                this.f9985l2 = null;
            }
            if (!z10 && this.f9966f0 == 0 && !this.f10008s2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f9967f1 == null) {
            uj0 uj0Var = new uj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f9967f1 = uj0Var;
            uj0Var.F *= 1.5f;
        }
        this.f9970g1.setAnimation(this.f9967f1);
        int i10 = 20;
        if (!z11) {
            uj0 uj0Var2 = this.f9967f1;
            if (!z10) {
                i10 = 0;
            }
            uj0Var2.N(i10, false, false);
        } else if (z10) {
            uj0 uj0Var3 = this.f9967f1;
            if (uj0Var3.f31001a0 > 20) {
                uj0Var3.N(0, false, false);
            }
            this.f9967f1.P(20);
            this.f9967f1.start();
        } else {
            uj0 uj0Var4 = this.f9967f1;
            int i11 = uj0Var4.f31001a0;
            if (i11 != 0 && i11 < 43) {
                uj0Var4.P(43);
                this.f9967f1.start();
            }
        }
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        nb nbVar = this.f10001r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new fa(this, 5));
            this.E.addListener(new ai.o7(this, f7, runnable, 3));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(bs.h);
            } else if (f7 <= 0.0f && nbVar.f9530a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(bs.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(bs.h);
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
        nbVar.invalidate();
        this.f9988n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f9988n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 2));
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
            x3 x3Var = this.l1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            x3 x3Var2 = this.f9986m1;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
            x3 x3Var3 = this.f9982k1;
            if (x3Var3 != null) {
                x3Var3.e(true);
            }
            x3 x3Var4 = this.W0;
            if (x3Var4 != null) {
                x3Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f9954b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f9954b2 = H();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        l0(z11);
        na naVar = this.Q0;
        v3 v3Var = this.U0;
        v3 v3Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f9966f0 == 0 && !H()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v3Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f9966f0 == 0 && !H()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(v3Var2, property2, dp3);
            if (z10 || this.f9966f0 != 0 || !H()) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v3Var, property, f11);
            if (!z10 && this.f9966f0 == 0 && H()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v3Var, property2, dp4);
            if (z10 || this.f9966f0 != 0 || H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(naVar, property, f12);
            if (z10 || this.f9966f0 != 0 || H()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(naVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(bs.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f9966f0 == 0 && !H()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v3Var2.setAlpha(f7);
        if (z10 && this.f9966f0 == 0 && !H()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        v3Var2.setTranslationY(dp);
        if (z10 || this.f9966f0 != 0 || !H()) {
            f11 = 0.0f;
        }
        v3Var.setAlpha(f11);
        if (!z10 && this.f9966f0 == 0 && H()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        v3Var.setTranslationY(dp2);
        if (z10 || this.f9966f0 != 0 || H()) {
            f12 = 0.0f;
        }
        naVar.setAlpha(f12);
        if (z10 || this.f9966f0 != 0 || H()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        naVar.setTranslationY(f13);
    }

    public final void g0(ci.b7 b7Var, boolean z10) {
        if (this.f10032z2) {
            return;
        }
        sg.k0 k0Var = new sg.k0(b7Var.b(), this.f9955c, this.f9951b, new za(this, 0), null);
        k0Var.X = A();
        k0Var.setOnDismissListener(new w80(2, this, z10));
        this.X0.x(7, true);
        this.f10032z2 = true;
        k0Var.show();
    }

    public final void h(Runnable runnable) {
        a8 a8Var;
        Runnable runnable2;
        jb jbVar;
        float f7;
        Bitmap.CompressFormat compressFormat;
        cg0 cg0Var = this.B1;
        if (cg0Var != null && (a8Var = this.K1) != null) {
            a8Var.f8715j = cg0Var.d() | a8Var.f8715j;
            a8 a8Var2 = this.K1;
            cg0 cg0Var2 = this.B1;
            File file = a8Var2.Z0;
            if (file != null) {
                file.delete();
                a8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = cg0Var2.getSavedFilterState();
            a8Var2.f8697a1 = savedFilterState;
            if (!a8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = cg0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = a8Var2.R;
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
                        matrix.postScale(f7, f10, a8Var2.f8718k0 / 2.0f, a8Var2.f8720l0 / 2.0f);
                        matrix.postRotate(-a8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        a8Var2.f8723n0.preScale(a8Var2.f8718k0 / createBitmap.getWidth(), a8Var2.f8720l0 / createBitmap.getHeight());
                        a8Var2.f8718k0 = createBitmap.getWidth();
                        a8Var2.f8720l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = a8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            a8Var2.Z0.delete();
                        }
                        String k10 = a8.k(a8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        }
                        boolean z11 = z10;
                        int i11 = a8Var2.f8695a;
                        if (!z11) {
                            str = "jpg";
                        }
                        a8Var2.Z0 = a8.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(a8Var2.Z0);
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
                            Utilities.themeQueue.postRunnable(new ai.x9(a8Var2, createBitmap, z11, runnable2, 3));
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
                a8 a8Var3 = this.K1;
                if (!a8Var3.K && (jbVar = this.X0) != null) {
                    jbVar.set(a8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f9961d2 != z10) {
            this.f9961d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(bs.h).withEndAction(new da(this, z10, 1)).start();
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
        if (this.K1 != null && this.D1 != null && this.f9972h0.getMeasuredWidth() > 0 && this.f9972h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f9972h0.getMeasuredWidth() / 2.0f, this.f9972h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f9972h0.getMeasuredWidth() / this.f9972h0.getMeasuredHeight(), this.f9972h0.getMeasuredHeight() / this.f9972h0.getMeasuredWidth(), this.f9972h0.getMeasuredWidth() / 2.0f, this.f9972h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f9972h0.getMeasuredWidth()) * this.K1.f8718k0, (1.0f / this.f9972h0.getMeasuredHeight()) * this.K1.f8720l0);
            matrix.postConcat(this.K1.f8723n0);
            matrix.postScale(this.f9972h0.getMeasuredWidth() / this.K1.f8714i0, this.f9972h0.getMeasuredHeight() / this.K1.f8716j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f7;
        w91 w91Var = this.V0;
        if ((w91Var.getTag() != null && z10) || (w91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f9964e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                t9 t9Var = new t9(this, 25);
                this.f9964e2 = t9Var;
                AndroidUtilities.runOnUIThread(t9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f9968f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        w91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f9968f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            w91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f9968f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(w91Var, property, f7));
        this.f9968f2.addListener(new ah.p0(14, this, z10));
        this.f9968f2.start();
        if (z10) {
            t9 t9Var2 = new t9(this, 26);
            this.f9964e2 = t9Var2;
            AndroidUtilities.runOnUIThread(t9Var2, 2000L);
        }
    }

    public final void j() {
        ci.q3 q3Var;
        if (this.J == 1) {
            RectF rectF = this.f9959d0;
            rectF.set(this.f9972h0.getLeft(), this.f9972h0.getTop(), this.f9972h0.getMeasuredWidth(), this.f9972h0.getMeasuredHeight());
            rectF.offset(this.f10001r.getX(), this.f10001r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f9956c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f9972h0.setAlpha(this.I);
            float f10 = rectF3.left;
            hb hbVar = this.f9972h0;
            hbVar.setTranslationX((f10 - hbVar.getLeft()) - this.f10001r.getX());
            float f11 = rectF3.top;
            hb hbVar2 = this.f9972h0;
            hbVar2.setTranslationY((f11 - hbVar2.getTop()) - this.f10001r.getY());
            qb qbVar = this.F;
            if (qbVar != null && (q3Var = qbVar.f9667f) != null) {
                q3Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f9667f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f9972h0.setScaleX(rectF3.width() / this.f9972h0.getMeasuredWidth());
            this.f9972h0.setScaleY(rectF3.height() / this.f9972h0.getMeasuredHeight());
            this.f9975i0.setAlpha(this.I);
            this.f9981k0.setAlpha(this.I);
            this.f9984l0.setAlpha(this.I);
            if (this.f9966f0 == 2) {
                this.f10013u1.setAlpha(this.I);
            }
        }
    }

    public final void j0() {
        r9 r9Var = this.f9998q0;
        if (r9Var != null) {
            r9Var.dismiss();
            this.f9998q0 = null;
        }
        r9 r9Var2 = new r9(this.f9951b, 86400, this.f9948a);
        r9Var2.p1();
        r9Var2.r1(this.f10027y0);
        TLRPC.InputPeer inputPeer = this.f10023x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f9955c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        r9Var2.q1(inputPeer);
        r9Var2.F = this.M;
        r9Var2.U = new u9(this, 18);
        r9Var2.f1(false);
        r9Var2.n1(1);
        r9Var2.l1(false);
        r9Var2.W = new u9(this, 19);
        r9Var2.T = new ca(this, 12);
        this.f9998q0 = r9Var2;
        r9Var2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: ei.vb.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.vb.k0(int, boolean, boolean):void");
    }

    public final void l() {
        a8 a8Var;
        if (this.f10016v1 != null && (a8Var = this.K1) != null && a8Var.f8736u) {
            File file = a8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = a8.w(this.f9955c, "webp");
            xa xaVar = this.f10016v1;
            a8 a8Var2 = this.K1;
            ArrayList arrayList = a8Var2.T0;
            boolean z10 = true;
            if (this.O1 == 1) {
                z10 = false;
            }
            Bitmap s02 = xaVar.s0(arrayList, false, false, true, z10, a8Var2);
            try {
                try {
                    s02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (s02.isRecycled()) {
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    try {
                        this.K1.W0.delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    this.K1.W0 = null;
                    if (s02 == null || s02.isRecycled()) {
                        return;
                    }
                }
                s02.recycle();
            } catch (Throwable th2) {
                if (s02 != null && !s02.isRecycled()) {
                    s02.recycle();
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
        ya yaVar;
        boolean z17 = false;
        if (this.f9966f0 == 0 && this.O1 == 1 && !this.I0.e && !H()) {
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
        b0(this.f9989n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f9966f0 == 0 && this.Y1 != null && !this.I0.e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f9966f0 == 0 && (yaVar = this.B0) != null && yaVar.f8808a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f9966f0 == 0 && !this.I0.e) {
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
        x3 x3Var = this.f9990n1;
        if (z18) {
            x3Var.u();
        } else {
            x3Var.e(true);
        }
        g(this.a2, z10);
        if (this.O1 == -1 && this.f9966f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f9966f0 == 0) {
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
        this.f9989n0.setTranslationX(0.0f);
        float alpha5 = this.f9989n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f10120a;
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
        pa0 pa0Var = this.f10026y;
        if (pa0Var != null) {
            pa0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        int i10;
        uj0 uj0Var = this.f9973h1;
        if (uj0Var != null) {
            int[] iArr = uj0Var.e;
            int i11 = 0;
            if (z10) {
                a8 a8Var = this.K1;
                if (a8Var != null && a8Var.f8744y0) {
                    i11 = iArr[0];
                }
                uj0Var.P(i11);
                uj0 uj0Var2 = this.f9973h1;
                if (uj0Var2 != null) {
                    uj0Var2.start();
                    return;
                }
                return;
            }
            a8 a8Var2 = this.K1;
            if (a8Var2 != null && a8Var2.f8744y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            uj0Var.N(i10, false, true);
            this.f9973h1.P(i10);
            ImageView imageView = this.f9976i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f10011t2 < 0) {
            this.f10011t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f10014u2 = arrayList;
            arrayList.add("off");
            this.f10014u2.add("auto");
            this.f10014u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            s2 s2Var = this.f10005s;
            s2Var.f9778o = f7;
            s2Var.f9777n = s2.f(f7);
            s2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            s2 s2Var2 = this.f10005s;
            s2Var2.f9779p = f10;
            s2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        t9 t9Var = new t9(this, 2);
        xa xaVar = this.f10016v1;
        a8 a8Var = this.K1;
        if (xaVar != null && a8Var != null) {
            a8Var.f();
            boolean t02 = xaVar.t0();
            boolean z10 = xaVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new w9(this, xaVar, a8Var.f8714i0, a8Var.f8716j0, a8Var, z10, t02, t9Var, 1));
            return;
        }
        t9Var.run();
    }

    public final void p(boolean z10) {
        jb jbVar;
        if (this.d) {
            r9 r9Var = this.f9998q0;
            if (r9Var != null) {
                r9Var.dismiss();
                this.f9998q0 = null;
            }
            a8 a8Var = this.K1;
            long j10 = 0;
            if (a8Var != null && !a8Var.h) {
                if ((this.v && a8Var.f8710g) || a8Var.f8698b != 0) {
                    a8Var.f8715j = false;
                }
                a8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (jbVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                a81 a81Var = jbVar.f9738y;
                if (a81Var != null) {
                    a81Var.B();
                    jbVar.f9738y.H();
                    jbVar.f9738y = null;
                }
                a81 a81Var2 = jbVar.f9736x;
                if (a81Var2 != null) {
                    j10 = a81Var2.n();
                    jbVar.f9736x.B();
                    jbVar.f9736x.H();
                    jbVar.f9736x = null;
                }
                a81 a81Var3 = jbVar.e;
                if (a81Var3 != null) {
                    j10 = a81Var3.n();
                    jbVar.e.B();
                    jbVar.e.H();
                    jbVar.e = null;
                }
                callback4.run(Long.valueOf(j10), new da(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f10018w));
                return;
            }
            jb jbVar2 = this.X0;
            if (jbVar2 != null && !z10) {
                jbVar2.set(null);
            }
            f(0.0f, z10, new t9(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f9988n.setBackgroundColor(0);
                this.f9953b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f9955c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean p0() {
        ya yaVar;
        if ((this.P1 || this.Q1) && (yaVar = this.B0) != null && yaVar.isFrontface()) {
            int i10 = this.f10011t2;
            if (i10 == 2 || (i10 == 1 && this.f9958c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f9951b;
        if (this.B0 == null && activity != null) {
            this.B0 = new ya(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            z6 z6Var = this.O0;
            float f7 = 0.0f;
            if (z6Var != null) {
                z6Var.f10216g0 = 0.0f;
                z6Var.f10217h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(z());
            this.B0.initTexture();
            this.B0.setDelegate(new ca(this, 0));
            ic icVar = this.F0;
            if (this.B0.f8808a && this.f9966f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(icVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f8808a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.B0.f8808a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new v6(activity, new u9(this, 3));
            }
            this.C0.a(this.B0);
            j7 j7Var = this.D0;
            if (j7Var != null) {
                ib ibVar = this.A0;
                Object blurRenderNode = ibVar.getBlurRenderNode();
                j7Var.F = ibVar;
                j7Var.G = blurRenderNode;
                j7Var.invalidate();
            }
        }
    }

    public final void r() {
        a8 a8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (a8Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!a8Var.K) {
                if (a8Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    ca caVar = new ca(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = a8.q(caVar, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                p71 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                a8 a8Var2 = this.K1;
                if (a8Var2 != null) {
                    savedFilterState = a8Var2.f8697a1;
                }
                cg0 cg0Var = new cg0(this.f9951b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f10002r0, this.f9948a);
                this.B1 = cg0Var;
                this.f10001r.addView(cg0Var);
                ag0 ag0Var = this.C1;
                if (ag0Var != null) {
                    ag0Var.setFilterView(this.B1);
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
                rf0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f9972h0.addView(blurControl);
                }
                tf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f9972h0.addView(curveControl);
                }
                U();
                this.B1.getDoneTextView().setOnClickListener(new v9(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new v9(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f25216i0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            ib ibVar = this.A0;
            if (ibVar != null && ibVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f9951b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        MediaController.AlbumEntry albumEntry = this.f9987m2;
        boolean z13 = !z10;
        ib ibVar2 = this.A0;
        if (ibVar2 != null && ibVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ua uaVar = new ua(this, this.f9955c, this.f9951b, this.f9948a, albumEntry, z10, z13, z11);
        this.M0 = uaVar;
        uaVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new la(this, 1));
        this.M0.setOnSelectListener(new ka(0, this, z10));
        this.M0.setOnSelectMultipleListener(new ai.h2(this, 2));
        s4.a0 a0Var = this.f9985l2;
        if (a0Var != null) {
            a3 a3Var = this.M0.e;
            a3Var.B = a0Var;
            a3Var.l0();
        }
        this.f9988n.addView(this.M0, w7.z5.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: ei.vb.t():void");
    }

    public final void u(boolean z10) {
        v6 v6Var = this.C0;
        if (v6Var != null) {
            v6Var.f9940f = null;
            Utilities.globalQueue.cancelRunnable(v6Var.h);
            this.C0 = null;
            ib ibVar = this.A0;
            if (ibVar != null) {
                ibVar.f8921c.a(null);
            }
        }
        j7 j7Var = this.D0;
        if (j7Var != null) {
            j7Var.F = null;
            j7Var.G = null;
            j7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new t9(this, 8));
                return;
            }
            a0(new t9(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            ib ibVar2 = this.A0;
            if (ibVar2 != null) {
                ibVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        ua uaVar = this.M0;
        if (uaVar == null) {
            return;
        }
        this.f9988n.removeView(uaVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f9991n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9991n2 = null;
        }
        o1.k kVar = this.f9994o2;
        if (kVar != null) {
            kVar.c();
            this.f9994o2 = null;
        }
        this.f9997p2 = null;
    }

    public final void x() {
        cg0 cg0Var = this.B1;
        if (cg0Var == null) {
            return;
        }
        cg0Var.e();
        this.C1.setFilterView(null);
        this.f10001r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f9972h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        rf0 rf0Var = this.E1;
        if (rf0Var != null) {
            this.f9972h0.removeView(rf0Var);
            this.E1 = null;
        }
        tf0 tf0Var = this.F1;
        if (tf0Var != null) {
            this.f9972h0.removeView(tf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        xa xaVar = this.f10016v1;
        if (xaVar != null) {
            xaVar.R0.removeAllViews();
            xa xaVar2 = this.f10016v1;
            xaVar2.O0.h();
            xaVar2.R0.setVisibility(8);
            xaVar2.Q0.setVisibility(8);
            xaVar2.E0.postRunnable(new ah.j(11));
            o5 o5Var = xaVar2.f9020k2;
            if (o5Var != null) {
                o5Var.dismiss();
            }
            qg.x xVar = xaVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f10001r.removeView(this.f10016v1);
            this.f10016v1 = null;
            qg.e1 e1Var = this.f10020w1;
            if (e1Var != null) {
                this.f9972h0.removeView(e1Var);
                this.f10020w1 = null;
            }
            View view = this.f10028y1;
            if (view != null) {
                this.f9972h0.removeView(view);
                this.f10028y1 = null;
            }
            View view2 = this.f10024x1;
            if (view2 != null) {
                this.f9972h0.removeView(view2);
                this.f10024x1 = null;
            }
            View view3 = this.f10031z1;
            if (view3 != null) {
                this.f9972h0.removeView(view3);
                this.f10031z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f9972h0.removeView(view4);
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
        return this.f9951b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
