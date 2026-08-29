package nh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
public final class gb implements NotificationCenter.NotificationCenterDelegate {
    public static gb B2;
    public ValueAnimator A;
    public final rb A0;
    public te0 A1;
    public ValueAnimator A2;
    public bb B;
    public final sb B0;
    public ve0 B1;
    public float C;
    public final z C0;
    public File C1;
    public final RectF D;
    public final rb D0;
    public ArrayList D1;
    public float E;
    public final y E0;
    public ArrayList E1;
    public int F;
    public final vb F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public o7 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public ga I0;
    public long I1;
    public long J;
    public v0 J0;
    public boolean J1;
    public boolean K;
    public final o6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final z9 M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final n2 N0;
    public boolean N1;
    public int O;
    public final n2 O0;
    public boolean O1;
    public int P;
    public final s3 P0;
    public float P1;
    public int Q;
    public final s3 Q0;
    public int Q1;
    public boolean R;
    public final u81 R0;
    public boolean R1;
    public boolean S;
    public final t3 S0;
    public boolean S1;
    public boolean T;
    public final va T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final qb V0;
    public AnimatorSet V1;
    public int W;
    public final ub W0;
    public boolean W1;
    public int X;
    public final w5 X0;
    public boolean X1;
    public final RectF Y;
    public final wa Y0;
    public boolean Y1;
    public final RectF Z;
    public final y9 Z0;
    public boolean Z1;
    public final lh.b f17736a;
    public final Path f17737a0;
    public final u0 f17738a1;
    public Runnable a2;
    public final Activity f17739b;
    public int f17740b0;
    public xi0 f17741b1;
    public AnimatorSet f17742b2;
    public final int f17743c;
    public int f17744c0;
    public final aj0 f17745c1;
    public m9 f17746c2;
    public boolean d;
    public final ta f17747d0;
    public xi0 f17748d1;
    public boolean f17749d2;
    public boolean f17750e;
    public final FrameLayout f17751e0;
    public ImageView f17752e1;
    public AnimatorSet f17753e2;
    public final WindowManager f17754f;
    public final LinearLayout f17755f0;
    public final cg.i0 f17756f1;
    public ValueAnimator f17757f2;
    public final FrameLayout f17758g0;
    public final t3 f17759g1;
    public boolean f17760g2;
    public final WindowManager.LayoutParams h;
    public final bg.x2 f17761h0;
    public final t3 f17762h1;
    public f2.i0 f17763h2;
    public final FrameLayout f17764i0;
    public final t3 f17765i1;
    public MediaController.AlbumEntry f17766i2;
    public final n2 f17767j0;
    public final t3 f17768j1;
    public ValueAnimator f17769j2;
    public final h7 f17770k0;
    public final x5 f17771k1;
    public o1.k f17772k2;
    public final org.telegram.ui.ActionBar.h5 f17773l0;
    public final tb l1;
    public Boolean f17774l2;
    public e9 m0;
    public p f17775m1;
    public q9 f17776m2;
    public final fb f17777n;
    public final org.telegram.ui.Components.ga f17778n0;
    public ra f17779n1;
    public AnimatorSet f17780n2;
    public final e6 f17781o0;
    public sa f17782o1;
    public boolean f17783o2;
    public final cg.h0 f17784p0;
    public final qb f17785p1;
    public int f17786p2;
    public boolean f17787q0;
    public final d f17788q1;
    public ArrayList f17789q2;
    public final ya f17790r;
    public long f17791r0;
    public ja f17792r1;
    public FrameLayout f17793r2;
    public final p2 f17794s;
    public String f17795s0;
    public ag.t1 f17796s1;
    public boolean f17797s2;
    public TLRPC.InputPeer f17798t0;
    public View f17799t1;
    public g9 f17800t2;
    public c9 f17801u0;
    public View f17802u1;
    public bg.f f17803u2;
    public boolean v;
    public t f17804v0;
    public View f17805v1;
    public boolean f17806v2;
    public long f17807w;
    public final ua f17808w0;
    public View f17809w1;
    public boolean f17810w2;
    public xa f17811x;
    public ka f17812x0;
    public ef0 f17813x1;
    public boolean f17814x2;
    public final jf.s0 f17815y;
    public j6 f17816y0;
    public final cf0 f17817y1;
    public pa f17818y2;
    public final y6 f17819z0;
    public TextureView f17820z1;
    public float f17821z2;

    public gb(Activity activity, int i10) {
        jf.s0 s0Var;
        int i11;
        int i12;
        int i13;
        float f9;
        int i14;
        boolean z10;
        float f10;
        lh.b bVar = new lh.b();
        this.f17736a = bVar;
        this.f17807w = 0L;
        this.D = new RectF();
        this.I = true;
        this.L = new AnimationNotificationsLocker();
        this.Y = new RectF();
        this.Z = new RectF();
        this.f17737a0 = new Path();
        new Rect();
        this.f17740b0 = 0;
        this.f17744c0 = -1;
        this.f17801u0 = new c9();
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
        ca caVar = new ca(this);
        this.Z1 = true;
        this.f17760g2 = true;
        this.f17786p2 = -1;
        this.f17739b = activity;
        this.f17743c = i10;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            s0Var = new jf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.f17815y = s0Var;
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
        this.f17754f = windowManager;
        fb fbVar = new fb(this, activity);
        this.f17777n = fbVar;
        p9 p9Var = new p9(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(fbVar, p9Var);
        this.f17777n.setFocusable(true);
        this.f17777n.setImportantForAccessibility(2);
        p2 p2Var = new p2(activity, windowManager, this.f17777n, layoutParams);
        this.f17794s = p2Var;
        p2Var.a(new na(this));
        this.f17777n.addView(this.f17794s.f18331b, new ViewGroup.LayoutParams(-1, -1));
        fb fbVar2 = this.f17777n;
        ya yaVar = new ya(this, activity);
        this.f17790r = yaVar;
        fbVar2.addView(yaVar);
        ya yaVar2 = this.f17790r;
        ta taVar = new ta(this, activity);
        this.f17747d0 = taVar;
        yaVar2.addView(taVar);
        this.f17790r.addView(this.f17794s.f18332c, new ViewGroup.LayoutParams(-1, -1));
        this.f17778n0 = new org.telegram.ui.Components.ga(this.f17747d0);
        this.f17781o0 = new Object();
        ya yaVar3 = this.f17790r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f17751e0 = frameLayout;
        yaVar3.addView(frameLayout);
        ya yaVar4 = this.f17790r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f17758g0 = frameLayout2;
        yaVar4.addView(frameLayout2);
        ya yaVar5 = this.f17790r;
        bg.x2 x2Var = new bg.x2(this, activity, 12);
        this.f17761h0 = x2Var;
        yaVar5.addView(x2Var);
        this.f17761h0.setVisibility(8);
        this.f17761h0.setAlpha(0.0f);
        ya yaVar6 = this.f17790r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f17764i0 = frameLayout3;
        yaVar6.addView(frameLayout3);
        mc.a(this.f17777n, new eg.x(6));
        ua uaVar = new ua(this, activity, this.f17778n0, this.f17790r, bVar);
        this.f17808w0 = uaVar;
        fb fbVar3 = this.f17777n;
        Objects.requireNonNull(fbVar3);
        uaVar.setCancelGestures(new m6(fbVar3, 4));
        this.f17808w0.setResetState(new g9(this, 13));
        this.f17747d0.addView(this.f17808w0, i7.f6.e(-1, -1, 119));
        this.f17808w0.setOnClickListener(new i9(this, 12));
        ta taVar2 = this.f17747d0;
        int i15 = this.F;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        taVar2.setBackgroundColor(i11);
        ta taVar3 = this.f17747d0;
        eg.k1 k1Var = jf.q0.f11668a;
        taVar3.setOutlineProvider(new jf.p0(0, AndroidUtilities.dp(12.0f)));
        this.f17747d0.setClipToOutline(true);
        g9 g9Var = new g9(this, 14);
        ?? view = new View(activity);
        view.f27466a = new TextPaint(1);
        view.f27467b = new TextPaint(1);
        jr jrVar = jr.h;
        view.f27473s = new org.telegram.ui.Components.d6((View) view, 0L, 350L, jrVar);
        view.E = new xb0(view, 7);
        view.f27475x = g9Var;
        this.f17817y1 = view;
        va vaVar = new va(this, activity, this.f17778n0, this.f17781o0);
        this.T0 = vaVar;
        vaVar.setCollageView(this.f17808w0);
        va vaVar2 = this.T0;
        vaVar2.v = new g9(this, 15);
        vaVar2.setOnTapListener(new g9(this, 16));
        this.T0.setVisibility(8);
        va vaVar3 = this.T0;
        vaVar3.J = new g9(this, 17);
        this.f17747d0.addView(vaVar3, i7.f6.e(-1, -1, 119));
        this.f17747d0.addView(this.f17817y1, i7.f6.e(-1, -1, 119));
        fb fbVar4 = this.f17777n;
        wa waVar = new wa(this, activity, fbVar4, fbVar4, this.f17790r, bVar, this.f17778n0);
        this.Y0 = waVar;
        waVar.setAccount(i10);
        this.Y0.setUiBlurBitmap(new p9(this, 6));
        mc.a(this.f17761h0, new ih.u0(this, 5));
        this.Y0.setOnHeightUpdate(new h9(this, 13));
        this.Y0.setOnPeriodUpdate(new h9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new h9(this, 5));
        this.Y0.setOnKeyboardOpen(new h9(this, 6));
        cg.h0 h0Var = new cg.h0(this, activity, 3);
        this.f17784p0 = h0Var;
        this.f17790r.addView(h0Var);
        qb qbVar = new qb(activity, this.f17790r, this.f17747d0, bVar, this.f17778n0);
        this.V0 = qbVar;
        qbVar.setOnTimelineClick(new g9(this, 10));
        this.V0.setOnHeightChange(new g9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.V0, i7.f6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ub ubVar = new ub(activity);
        this.W0 = ubVar;
        ubVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, i7.f6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f17761h0.addView(this.U0, i7.f6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f17761h0.addView(this.Y0, i7.f6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f17808w0.setTimelineView(this.V0);
        this.f17808w0.setPreviewView(this.T0);
        qb qbVar2 = new qb(activity, this.f17790r, this.f17747d0, bVar, this.f17778n0);
        this.f17785p1 = qbVar2;
        qbVar2.T0 = true;
        qbVar2.setVisibility(8);
        this.f17785p1.setAlpha(0.0f);
        this.f17761h0.addView(this.f17785p1, i7.f6.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        y9 y9Var = new y9(this, activity, bVar, this.f17778n0);
        this.Z0 = y9Var;
        y9Var.setVisibility(8);
        this.f17761h0.addView(this.Z0, i7.f6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f17767j0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        n2 n2Var = this.f17767j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var.setScaleType(scaleType);
        this.f17767j0.setImageResource(R.drawable.msg_photo_back);
        n2 n2Var2 = this.f17767j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        n2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f17767j0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f17767j0.setOnClickListener(new i9(this, 1));
        this.f17751e0.addView(this.f17767j0, i7.f6.e(56, 56, 51));
        this.f17794s.a(this.f17767j0);
        h7 h7Var = new h7(activity, i10);
        this.f17770k0 = h7Var;
        h7Var.a(false, false);
        this.f17770k0.setOnClickListener(new r7(1, this, activity));
        this.f17751e0.addView(this.f17770k0, i7.f6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f17773l0 = h5Var;
        h5Var.setTextSize(20);
        this.f17773l0.setGravity(19);
        this.f17773l0.setTextColor(-1);
        this.f17773l0.setTypeface(AndroidUtilities.bold());
        this.f17773l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f17773l0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f17773l0.setAlpha(0.0f);
        this.f17773l0.setVisibility(8);
        this.f17773l0.setEllipsizeByGradient(true);
        this.f17773l0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f17751e0.addView(this.f17773l0, i7.f6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f17755f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f17755f0.setGravity(5);
        this.f17751e0.addView(this.f17755f0, i7.f6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        h9 h9Var = new h9(this, 7);
        fb fbVar5 = this.f17777n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f18710w = true;
        imageView2.f18711x = true;
        imageView2.h = h9Var;
        imageView2.f18702a = i10;
        imageView2.f18703b = fbVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new mh.n(imageView2, 3));
        imageView2.f18706f = new np(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f17738a1 = imageView2;
        t3 t3Var = new t3(activity, 1);
        t3Var.m(1.0f, -71.0f);
        t3Var.d = 2000L;
        t3Var.Q = false;
        t3Var.D.o(true, false, false);
        this.f17759g1 = t3Var;
        t3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f17751e0.addView(this.f17759g1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f17745c1 = imageView3;
        imageView3.setScaleType(scaleType);
        aj0 aj0Var = this.f17745c1;
        o7 o7Var = this.G1;
        if (o7Var != null && o7Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        aj0Var.setImageResource(i12);
        this.f17745c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f17745c1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f17745c1.setOnClickListener(new i9(this, 2));
        this.f17745c1.setVisibility(8);
        this.f17745c1.setAlpha(0.0f);
        cg.i0 i0Var = new cg.i0(activity);
        this.f17756f1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f17756f1.setVisibility(8);
        this.f17756f1.setAlpha(0.0f);
        this.f17756f1.setOnClickListener(new i9(this, 3));
        this.f17755f0.addView(this.f17756f1, i7.f6.q(46, 56, 53));
        this.f17755f0.addView(this.f17745c1, i7.f6.q(46, 56, 53));
        this.f17755f0.addView(this.f17738a1, i7.f6.e(46, 56, 53));
        rb rbVar = new rb(activity);
        this.A0 = rbVar;
        rbVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new i9(this, 4));
        this.A0.setOnLongClickListener(new bg.g0(this, 2));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.f17794s.a(this.A0);
        this.f17751e0.addView(this.A0, i7.f6.e(56, 56, 53));
        sb sbVar = new sb(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = sbVar;
        sbVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new i9(this, 5));
        boolean q6 = c1.q(activity);
        sb sbVar2 = this.B0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        sbVar2.setVisibility(i13);
        sb sbVar3 = this.B0;
        if (q6) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        sbVar3.setAlpha(f9);
        this.f17794s.a(this.B0);
        this.f17751e0.addView(this.B0, i7.f6.e(56, 56, 53));
        ?? rbVar2 = new rb(activity);
        this.C0 = rbVar2;
        rbVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        if (this.f17804v0 == null) {
            i14 = 6;
            this.f17804v0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.C0.setOnClickListener(new i9(this, i14));
        this.C0.a(new u(this.f17804v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.f17794s.a(this.C0);
        this.f17751e0.addView(this.C0, i7.f6.e(56, 56, 53));
        rb rbVar3 = new rb(activity);
        this.D0 = rbVar3;
        rbVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.D0.a(new u(new t("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new i9(this, 7));
        this.f17794s.a(this.D0);
        this.f17751e0.addView(this.D0, i7.f6.e(56, 56, 53));
        y yVar = new y(activity, this.f17794s);
        this.E0 = yVar;
        yVar.f18845a.u0(6);
        this.E0.setSelected((t) null);
        this.E0.setOnLayoutClick(new h9(this, 8));
        this.f17751e0.addView(this.E0, i7.f6.e(-1, 56, 53));
        t3 t3Var2 = new t3(activity, 1);
        t3Var2.m(1.0f, -20.0f);
        t3Var2.d = 5000L;
        t3Var2.i();
        t3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        t3Var2.f18597h0 = new ag.o0(22);
        this.f17762h1 = t3Var2;
        t3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f17751e0.addView(this.f17762h1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        t3 t3Var3 = new t3(activity, 2);
        t3Var3.m(0.0f, 28.0f);
        t3Var3.d = 5000L;
        t3Var3.q(true);
        this.f17765i1 = t3Var3;
        this.f17751e0.addView(t3Var3, i7.f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        t3 t3Var4 = new t3(activity, 1);
        t3Var4.m(1.0f, -20.0f);
        t3Var4.d = 5000L;
        t3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f17768j1 = t3Var4;
        t3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f17751e0.addView(this.f17768j1, i7.f6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f18767a = paint;
        Paint paint2 = new Paint(1);
        view2.f18768b = paint2;
        view2.f18770e = new org.telegram.ui.Components.d6((View) view2, 0L, 250L, jrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        view2.f18769c = n6Var;
        n6Var.k(0.3f, 250L, jrVar);
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.r(-1);
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(view2);
        n6Var.f30862b = 1;
        view2.a(0L, false);
        this.F0 = view2;
        i0(false, false);
        this.f17751e0.addView(this.F0, i7.f6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f17794s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        o6 o6Var = new o6(activity);
        this.K0 = o6Var;
        o6Var.setDelegate(caVar);
        o6 o6Var2 = this.K0;
        if (this.K1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6Var2.f18232j0 = -1.0f;
        o6Var2.f18233k0 = z10;
        o6Var2.invalidate();
        this.f17758g0.addView(this.K0, i7.f6.e(-1, 100, 87));
        this.f17794s.a(this.K0);
        o6 o6Var3 = this.K0;
        if (this.f17808w0.j()) {
            f10 = this.f17808w0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        o6Var3.e(f10, true);
        d dVar = new d(activity, bVar, true);
        this.L0 = dVar;
        dVar.setRoundRadius(24);
        this.L0.setColor(-2473124);
        this.L0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.L0.setAlpha(0.0f);
        this.L0.setScaleX(0.8f);
        this.L0.setScaleY(0.8f);
        this.L0.setVisibility(8);
        this.f17758g0.addView(this.L0, i7.f6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new i9(this, 8));
        t3 t3Var5 = new t3(activity, 3);
        t3Var5.q(true);
        t3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        t3Var5.h = AndroidUtilities.dp(320.0f);
        t3Var5.d = 5000L;
        t3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = t3Var5;
        this.f17758g0.addView(t3Var5, i7.f6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        u81 u81Var = new u81(activity);
        this.R0 = u81Var;
        u81Var.I = false;
        u81Var.setAlpha(0.0f);
        this.f17758g0.addView(this.R0, i7.f6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new p9(this, 4));
        u81 u81Var2 = this.R0;
        this.P1 = 0.0f;
        u81Var2.b(0.0f, false);
        y6 y6Var = new y6(activity, i10, new g9(this, 12));
        this.f17819z0 = y6Var;
        y6Var.f18881c = new h9(this, 9);
        this.f17758g0.addView(y6Var, i7.f6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        z9 z9Var = new z9(this, activity);
        this.M0 = z9Var;
        z9Var.setOnSwitchModeListener(new h9(this, 10));
        this.M0.setOnSwitchingModeListener(new h9(this, 11));
        this.f17764i0.addView(this.M0, i7.f6.e(-1, 48, 55));
        this.f17794s.a(this.M0);
        ?? imageView4 = new ImageView(activity);
        this.N0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f17764i0.addView(this.N0, i7.f6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f17794s.a(this.N0);
        this.N0.setOnClickListener(new i9(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.O0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        this.f17764i0.addView(this.O0, i7.f6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f17794s.a(this.O0);
        this.O0.setOnClickListener(new i9(this, 10));
        s3 s3Var = new s3(activity);
        this.P0 = s3Var;
        this.f17764i0.addView(s3Var, i7.f6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f17794s.a(this.P0);
        s3 s3Var2 = new s3(activity);
        this.Q0 = s3Var2;
        s3Var2.f18545a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        s3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.f17764i0.addView(this.Q0, i7.f6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f17794s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f17788q1 = dVar2;
        dVar2.setVisibility(8);
        this.f17788q1.setAlpha(0.0f);
        this.f17788q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f17788q1.setOnClickListener(new i9(this, 11));
        this.f17764i0.addView(this.f17788q1, i7.f6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f18789b = new ArrayList();
        frameLayout5.f18791e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f18788a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, i7.f6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f18791e = true;
        v5 v5Var = new v5(frameLayout5, activity, string, true);
        frameLayout5.f18790c = v5Var;
        v5Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f18790c, i7.f6.c(-2.0f, -2));
        frameLayout5.e();
        this.X0 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.X0.setOnClickListener(new h9(this, 12));
        this.f17764i0.addView(this.X0, i7.f6.e(-1, 52, 23));
        tb tbVar = new tb(activity);
        this.l1 = tbVar;
        tbVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.f17747d0.addView(this.l1, i7.f6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        x5 x5Var = new x5(activity, i10, bVar);
        this.f17771k1 = x5Var;
        this.f17747d0.addView(x5Var, i7.f6.e(-1, -1, 119));
        m0(false);
    }

    public static gb E(Activity activity, int i10) {
        gb gbVar = B2;
        if (gbVar != null && (gbVar.f17739b != activity || gbVar.f17743c != i10)) {
            gbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new gb(activity, i10);
        }
        return B2;
    }

    public static void a(gb gbVar) {
        ka kaVar = gbVar.f17812x0;
        boolean z10 = false;
        if (kaVar != null && kaVar.getTextureView() != null) {
            Bitmap bitmap = gbVar.f17812x0.getTextureView().getBitmap();
            if (bitmap == null) {
                gbVar.Y1 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f9 = 0.0f;
            for (int i10 = 0; i10 < 10; i10++) {
                int i11 = 0;
                while (i11 < 10) {
                    i11++;
                    f9 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
                }
            }
            bitmap.recycle();
            if (f9 / 100.0f < 0.22f) {
                z10 = true;
            }
            gbVar.Y1 = z10;
            return;
        }
        gbVar.Y1 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(gb gbVar) {
        Activity activity = gbVar.f17739b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 33) {
            z10 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? true : true;
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                z10 = true;
            }
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z10;
    }

    public static void c(gb gbVar) {
        ValueAnimator valueAnimator = gbVar.f17757f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            gbVar.f17757f2 = null;
        }
        gbVar.f17760g2 = false;
        ya yaVar = gbVar.f17790r;
        float f9 = yaVar.f18912a;
        float f10 = yaVar.f18913b;
        yaVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        gbVar.f17757f2 = ofFloat;
        ofFloat.addUpdateListener(new v9(gbVar, f9, f10, 0));
        gbVar.f17757f2.setDuration(340L);
        gbVar.f17757f2.setInterpolator(jr.h);
        gbVar.f17757f2.addListener(new fa(gbVar, 0));
        gbVar.f17757f2.start();
    }

    public static boolean d(gb gbVar) {
        Activity activity = gbVar.f17739b;
        if (Build.VERSION.SDK_INT >= 23 && activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new oa(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        gb gbVar = B2;
        if (gbVar != null) {
            gbVar.q(false);
        }
        B2 = null;
    }

    public final Drawable A() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f17739b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.E1;
        if (arrayList != null) {
            return arrayList.size();
        }
        o7 o7Var = this.G1;
        if (o7Var != null) {
            return o7Var.r();
        }
        return 1;
    }

    public final String C() {
        ka kaVar = this.f17812x0;
        if (kaVar != null && kaVar.getCameraSession() != null) {
            if (this.f17812x0.isFrontface() && !this.f17812x0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f17789q2.get(this.f17786p2);
            }
            return this.f17812x0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 D() {
        if (this.J0 == null) {
            v0 v0Var = new v0(this.f17739b);
            this.J0 = v0Var;
            this.f17758g0.addView(v0Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        int i10;
        ka kaVar = this.f17812x0;
        if (kaVar != null && kaVar.getCameraSession() != null) {
            if (this.f17812x0.isFrontface() && !this.f17812x0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f17789q2;
                if (this.f17786p2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f17786p2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.f17812x0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f17752e1 == null) {
            int i10 = R.raw.sun_outline;
            xi0 xi0Var = new xi0(i10, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f17748d1 = xi0Var;
            xi0Var.h = true;
            o7 o7Var = this.G1;
            if (o7Var != null && o7Var.f18304y0) {
                xi0Var.K(35);
                this.f17748d1.N(36);
            } else {
                xi0Var.N(0);
                this.f17748d1.K(0);
            }
            this.f17748d1.W = true;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.f17736a);
            this.f17748d1.O(v02, "Sunny");
            this.f17748d1.O(v02, "Path 6");
            this.f17748d1.O(v02, "Path");
            this.f17748d1.O(v02, "Path 5");
            this.f17748d1.m();
            ImageView imageView = new ImageView(this.f17739b);
            this.f17752e1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f17752e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f17752e1.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
            this.f17752e1.setOnClickListener(new i9(this, 0));
            this.f17752e1.setVisibility(8);
            this.f17752e1.setImageDrawable(this.f17748d1);
            this.f17752e1.setAlpha(0.0f);
            this.f17755f0.addView(this.f17752e1, 0, i7.f6.q(46, 56, 53));
        }
        return this.f17752e1;
    }

    public final void H() {
        ja jaVar = this.f17792r1;
        if (jaVar == null) {
            return;
        }
        this.f17793r2 = null;
        jaVar.getTopLayout().setAlpha(0.0f);
        this.f17792r1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f17792r1.getBottomLayout().setAlpha(0.0f);
        this.f17792r1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f17792r1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f17792r1.setVisibility(8);
    }

    public final boolean I() {
        float f9;
        if (this.f17808w0.j()) {
            f9 = this.f17808w0.getFilledProgress();
        } else {
            f9 = 0.0f;
        }
        if (!this.W1 && f9 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        ga gaVar;
        if (!this.S && (gaVar = this.I0) != null) {
            if (gaVar.getTranslationY() < (this.f17777n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: nh.gb.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j10) {
        if (!this.O1 && this.G1 != null) {
            m9 m9Var = this.f17746c2;
            if (m9Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m9Var);
            }
            this.f17749d2 = true;
            this.O1 = true;
            this.f17746c2 = new m9(this, runnable, 1);
            this.T0.setAlpha(0.0f);
            this.T0.setVisibility(0);
            this.T0.n(this.G1, this.f17746c2, j10);
            this.T0.p(this.G1, false);
            AndroidUtilities.runOnUIThread(this.f17746c2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: nh.gb.M():boolean");
    }

    public final void N(int i10, int i11) {
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
            v(false);
            this.K0.setVisibility(8);
            this.R0.setVisibility(8);
            this.M0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.f17785p1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f17761h0.setVisibility(i17);
            this.Y0.setVisibility(8);
            this.f17788q1.setVisibility(8);
        }
        if (i10 == 1) {
            this.X0.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f17761h0.setVisibility(i14);
            this.f17745c1.setVisibility(8);
            this.f17756f1.setVisibility(8);
            this.f17738a1.setVisibility(8);
            ImageView imageView = this.f17752e1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.T0.setVisibility(i15);
            this.V0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f17773l0.setVisibility(i16);
            w();
            this.l1.setAlpha(0.0f);
            this.l1.setVisibility(8);
            this.W0.setVisibility(8);
            this.D1 = null;
            this.E1 = null;
            this.F1 = null;
        }
        if (i11 == 1) {
            o7 o7Var = this.G1;
            if (o7Var == null || !o7Var.f18282n) {
                u();
                H();
            }
            cf0 cf0Var = this.f17817y1;
            if (cf0Var != null) {
                cf0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            o7 o7Var2 = this.G1;
            if (o7Var2 != null && o7Var2.f18272h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.W0.setVisibility(i13);
            this.f17761h0.setAlpha(1.0f);
            this.f17761h0.setTranslationY(0.0f);
            o7 o7Var3 = this.G1;
            this.Y0.setVisibility((o7Var3 == null || o7Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.R1) {
            D().setVisibility(0);
            v0 D = D();
            D.f18739r.d(0.0f, true);
            D.a(true);
            lh.m5 m5Var = D.h;
            if (m5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(m5Var);
            }
            lh.m5 m5Var2 = new lh.m5(D, 20);
            D.h = m5Var2;
            AndroidUtilities.runOnUIThread(m5Var2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        cf0 cf0Var2 = this.f17817y1;
        if (cf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f17744c0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            cf0Var2.setAllowTouch(z11);
        }
        wa waVar = this.Y0;
        if (waVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            waVar.f18068a0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f17743c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            lh.s6 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        o7 o7Var;
        int i12;
        float f9;
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        o7 o7Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        o7 o7Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        g9 g9Var;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        o7 o7Var4;
        int i17;
        o7 o7Var5;
        o7 o7Var6;
        o7 o7Var7;
        l61 textureView;
        o7 o7Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            o6 o6Var = this.K0;
            if (o6Var != null) {
                o6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            o7 o7Var9 = this.G1;
            if (o7Var9 != null) {
                o7Var9.i(false);
                this.G1 = null;
            }
            ua uaVar = this.f17808w0;
            if (uaVar != null) {
                uaVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new g9(this, 18));
            v0 v0Var = this.J0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.S0.e(true);
            t3 t3Var = this.f17762h1;
            if (t3Var != null) {
                t3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f17743c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                o7Var = this.G1;
            } else {
                o7Var = null;
            }
            this.f17738a1.setEntry(o7Var);
            if (this.K1 == 1) {
                this.f17745c1.setVisibility(0);
                o7 o7Var10 = this.G1;
                if (o7Var10 != null && o7Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f17756f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((cg0) this.f17756f1.f3158c).a(this.T0.k(), false);
                this.f17773l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                o7 o7Var11 = this.G1;
                if (o7Var11 != null && !TextUtils.isEmpty(o7Var11.f18303y)) {
                    this.f17745c1.setVisibility(8);
                    this.f17756f1.setVisibility(0);
                    ((cg0) this.f17756f1.f3158c).a(true, false);
                    this.f17773l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f17773l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f17738a1.setVisibility(0);
            o7 o7Var12 = this.G1;
            if (o7Var12 != null && o7Var12.f18296u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f17752e1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.X0.setVisibility(0);
            this.T0.setVisibility(0);
            o7 o7Var13 = this.G1;
            if ((o7Var13 != null && o7Var13.J0 != 0) || this.f17791r0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.Y0.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            o7 o7Var14 = this.G1;
            if ((o7Var14 != null && o7Var14.J0 != 0) || this.f17791r0 != 0) {
                f9 = 12.0f;
            } else {
                f9 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f9);
            this.U0.setLayoutParams(layoutParams);
            this.f17761h0.setVisibility(0);
            this.f17761h0.clearFocus();
            o7 o7Var15 = this.G1;
            if (o7Var15 == null) {
                i13 = 86400;
            } else {
                i13 = o7Var15.I0;
            }
            this.Y0.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((o7Var2 = this.G1) == null || !o7Var2.f18270g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Y0.setPeriodVisible(z10);
            o7 o7Var16 = this.G1;
            if (o7Var16 != null && o7Var16.f18285o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.Y0.setHasRoundVideo(z11);
            wa waVar = this.Y0;
            if (waVar == null) {
                j10 = 0;
            } else {
                o7 o7Var17 = this.G1;
                if (o7Var17 == null || !o7Var17.f18282n) {
                    j10 = 0;
                    waVar.v(null, null);
                } else {
                    TLRPC.Peer peer = o7Var17.f18288q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        o7 o7Var18 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        o7Var18.f18286p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        o7 o7Var19 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        o7Var19.f18286p = append;
                    }
                    String str3 = this.G1.f18292s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.Y0.v(str4, append);
                }
            }
            o7 o7Var20 = this.G1;
            if (o7Var20 != null && o7Var20.v() && this.G1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            qb qbVar = this.V0;
            boolean z22 = qbVar.f18428f0;
            qbVar.f18428f0 = z12;
            qbVar.f18425e0.f(z12, true);
            qbVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f17773l0.setVisibility(0);
            this.f17785p1.setVisibility(0);
            o7 o7Var21 = this.G1;
            if (o7Var21 != null && o7Var21.f18258b0) {
                this.f17773l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f17761h0.setVisibility(0);
            this.f17788q1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f17773l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.J1 = false;
            o7 o7Var22 = this.G1;
            if (o7Var22 != null && o7Var22.J0 != j10) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o7Var22 != null && o7Var22.f18270g) {
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
            w5 w5Var = this.X0;
            if (!TextUtils.equals(string, w5Var.d) || z23 != w5Var.f18791e) {
                w5Var.removeView(w5Var.f18790c);
                Context context = w5Var.getContext();
                w5Var.d = string;
                w5Var.f18791e = z23;
                v5 v5Var = new v5(w5Var, context, string, z23);
                w5Var.f18790c = v5Var;
                v5Var.setContentDescription(string);
                w5Var.addView(w5Var.f18790c, i7.f6.c(-2.0f, -2));
                w5Var.e();
            }
            this.f17785p1.setVisibility(8);
            this.f17788q1.setVisibility(8);
            if (!this.f17749d2) {
                o7 o7Var23 = this.G1;
                if (o7Var23 != null && o7Var23.f18296u) {
                    this.T0.l(o7Var23);
                } else {
                    this.T0.set(o7Var23);
                }
            }
            this.f17749d2 = false;
            st editText = this.Y0.f18076f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                g9Var = null;
            } else {
                g9Var = new g9(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(g9Var);
            if (this.D1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.Z0.setVisibility(i15);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                y9 y9Var = this.Z0;
                y9Var.c(false, false);
                y9Var.f17695c = arrayList;
                y9Var.d = arrayList2;
                y9Var.f17696e = arrayList3;
                y9Var.f17701w = new zz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                y9Var.G = new zz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                y9Var.f17694b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            if (!z16 && !z17 && this.D1 == null && ((o7Var8 = this.G1) == null || (!o7Var8.v() && this.G1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.V0.setMaxCount(i16);
            if (i10 != 2) {
                o7 o7Var24 = this.G1;
                if (o7Var24 != null && (o7Var24.f18260c || o7Var24.f18270g || this.f17787q0)) {
                    if (o7Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    o7 o7Var25 = this.G1;
                    if (o7Var25.K && o7Var25.f18256a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new p9(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i10 != 2) {
                    wa waVar2 = this.Y0;
                    waVar2.R = true;
                    waVar2.f18076f.setText("");
                }
            }
            o7 o7Var26 = this.G1;
            if (o7Var26 != null && ((o7Var26.f18296u && !o7Var26.K) || o7Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.X0.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (o7Var7 = this.G1) != null && !o7Var7.f18296u && !o7Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.X0.d(3, z19);
            if (!this.J1 && !this.Y0.o()) {
                lh.s6 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                lh.m6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f16218a, B) || ((o7Var6 = this.G1) != null && (o7Var6.f18270g || o7Var6.J0 != j10))) {
                    z20 = true;
                    this.X0.setShareEnabled(z20);
                    o7Var4 = this.G1;
                    if (o7Var4 == null && o7Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f17745c1.setImageResource(i17);
                    this.T0.setVisibility(0);
                    this.V0.setVisibility(0);
                    this.f17773l0.setVisibility(0);
                    this.f17773l0.setTranslationX(0.0f);
                    o7Var5 = this.G1;
                    if (o7Var5 == null && o7Var5.J0 != j10) {
                        this.f17773l0.l("", false);
                    } else if (o7Var5 == null && o7Var5.f18270g) {
                        this.f17773l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (o7Var5 == null && o7Var5.f18296u) {
                        this.f17773l0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (o7Var5 == null && o7Var5.f18282n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f17773l0, 32.0f, i18);
                        this.f17773l0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.G1.f18288q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.G1.f18288q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.G1.f18288q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f17773l0.l(spannableStringBuilder, false);
                    } else {
                        this.f17773l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.X0.setShareEnabled(z20);
            o7Var4 = this.G1;
            if (o7Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f17745c1.setImageResource(i17);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.f17773l0.setVisibility(0);
            this.f17773l0.setTranslationX(0.0f);
            o7Var5 = this.G1;
            if (o7Var5 == null) {
            }
            if (o7Var5 == null) {
            }
            if (o7Var5 == null) {
            }
            if (o7Var5 == null) {
            }
            this.f17773l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            wa waVar3 = this.Y0;
            j70 j70Var = waVar3.R0;
            if (j70Var != null) {
                j70Var.u();
                waVar3.R0 = null;
            }
            this.f17759g1.e(z21);
            y9 y9Var2 = this.Z0;
            if (y9Var2.I) {
                y9Var2.c(false, z21);
            }
        }
        if (i11 == 2 && (o7Var3 = this.G1) != null) {
            if (o7Var3.f18266e0 < j10) {
                o7Var3.f18266e0 = j10;
            }
            this.I1 = o7Var3.f18266e0;
            if (this.T0.getDuration() < 100) {
                duration = this.G1.f18272h0;
            } else {
                duration = this.T0.getDuration();
            }
            o7 o7Var27 = this.G1;
            if (o7Var27.f18272h0 <= 0) {
                o7Var27.f18272h0 = duration;
            }
            File file = o7Var27.Z0;
            if (file == null) {
                file = o7Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            o7 o7Var28 = this.G1;
            this.f17785p1.o(false, absolutePath, o7Var28.f18272h0, o7Var28.P);
            o7 o7Var29 = this.G1;
            float f10 = (float) duration;
            long j11 = o7Var29.Z * f10;
            long j12 = o7Var29.f18255a0 * f10;
            qb qbVar2 = this.f17785p1;
            qbVar2.V0 = j11;
            qbVar2.W0 = j12;
            lb lbVar = qbVar2.h;
            if (lbVar != null) {
                lb.a(lbVar, true);
            }
            t4 t4Var = new t4(this, 2);
            this.f17785p1.setDelegate(new ha(t4Var));
            float max = (((float) this.I1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f17785p1.setVideoLeft(max);
            this.f17785p1.setVideoRight(0.04f + max);
            t4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        cf0 cf0Var = this.f17817y1;
        if (cf0Var != null) {
            cf0Var.setAllowTouch(false);
        }
        t3 t3Var2 = this.f17765i1;
        boolean z24 = true;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        mc.e();
        wa waVar4 = this.Y0;
        if (waVar4 != null) {
            g gVar = waVar4.f18076f;
            gVar.d();
            gVar.k(true);
            this.Y0.f18068a0 = true;
        }
        va vaVar = this.T0;
        if (vaVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            vaVar.x(8, z15);
        }
        ja jaVar = this.f17792r1;
        if (jaVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            jaVar.setCoverPreview(z14);
        }
        t3 t3Var3 = this.f17768j1;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        ua uaVar2 = this.f17808w0;
        uaVar2.setPreview((i11 == 1 && uaVar2.j()) ? false : false);
    }

    public final void P() {
        ag.r1 r1Var;
        int i10;
        if (this.f17740b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f17800t2 = new g9(this, 3);
            } else {
                Z(false);
            }
        }
        wa waVar = this.Y0;
        if (waVar != null) {
            waVar.f18076f.s();
        }
        o6 o6Var = this.K0;
        if (o6Var != null) {
            o6Var.h();
        }
        x5 x5Var = this.f17771k1;
        if (x5Var != null) {
            lh.s6 storiesController = MessagesController.getInstance(x5Var.f18827a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f16224i.f(UserConfig.getInstance(storiesController.f16218a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            x5Var.f18828b = storiesController.f16219b.m() + i10 + 1;
            x5Var.f18829c.invalidate();
        }
        ja jaVar = this.f17792r1;
        if (jaVar != null && (r1Var = jaVar.K0.d) != null) {
            r1Var.postRunnable(r1Var.f648w);
        }
        va vaVar = this.T0;
        if (vaVar != null) {
            vaVar.x(0, false);
        }
        a1 a1Var = MessagesController.getInstance(this.f17743c).getStoriesController().f16237w;
        if (!a1Var.f17374c && !a1Var.d) {
            a1Var.d = true;
            x0 x0Var = new x0(a1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var.f17372a);
            messagesStorage.getStorageQueue().postRunnable(new jh.r5((Object) messagesStorage, false, (Object) x0Var, 3));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z10;
        ja jaVar;
        ra raVar;
        sa saVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ja jaVar2;
        if (i11 == 0) {
            this.f17767j0.setVisibility(8);
        }
        if (i10 == 0 && (jaVar2 = this.f17792r1) != null) {
            jaVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Y0.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f17745c1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f17756f1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f17738a1.setVisibility(i14);
            ImageView imageView = this.f17752e1;
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
            this.V0.setVisibility(i15);
            this.f17773l0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (jaVar = this.f17792r1) != null) {
            jaVar.Z0.setLayerType(0, null);
        }
        cf0 cf0Var = this.f17817y1;
        if (cf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            cf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            ra raVar2 = this.f17779n1;
            if (raVar2 != null) {
                raVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (raVar = this.f17779n1) != null) {
            raVar.setVisibility(8);
            this.f17779n1.setAppearProgress(0.0f);
            ra raVar3 = this.f17779n1;
            raVar3.f17925x = null;
            g0 g0Var = raVar3.f17920f;
            g0Var.H = null;
            g0Var.d = null;
            g0Var.F = false;
            raVar3.d.setVisibility(8);
            raVar3.f17916a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            sa saVar2 = this.f17782o1;
            if (saVar2 != null) {
                saVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (saVar = this.f17782o1) != null) {
            saVar.setVisibility(8);
            this.f17782o1.setAppearProgress(0.0f);
            sa saVar3 = this.f17782o1;
            saVar3.f18104b = null;
            g0 g0Var2 = saVar3.h;
            g0Var2.H = null;
            g0Var2.d = null;
            g0Var2.F = false;
            saVar3.f18106e.setVisibility(8);
            saVar3.setVisibility(8);
        }
    }

    public final void R(ab abVar) {
        lh.m6 o10;
        fb fbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f17743c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.f17787q0 = false;
        this.f17750e = false;
        this.f17814x2 = false;
        this.f17781o0.f17598g = false;
        WindowManager windowManager = this.f17754f;
        if (windowManager != null && (fbVar = this.f17777n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.f17777n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.f17777n, layoutParams);
            g0();
        }
        this.f17808w0.setCameraThumb(A());
        if (this.f17791r0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.D;
        if (abVar != null) {
            this.B = abVar;
            this.F = abVar.f17444a;
            rectF.set(abVar.f17446c);
            this.C = abVar.f17445b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f17790r.c();
        int i12 = this.F;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f17747d0.setBackgroundColor(i11);
        this.f17790r.setTranslationX(0.0f);
        this.f17790r.setTranslationY(0.0f);
        this.f17790r.b(0.0f);
        this.f17790r.setScaleX(1.0f);
        this.f17790r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f17739b, 1);
        g(1.0f, true, new g9(this, 6));
        e();
        this.f17791r0 = 0L;
        this.f17795s0 = "";
    }

    public final void S(za zaVar, o7 o7Var, long j10) {
        int i10;
        fb fbVar;
        if (this.d) {
            return;
        }
        int i11 = this.f17743c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.c.b(i11);
            return;
        }
        this.f17787q0 = false;
        this.f17750e = false;
        this.f17814x2 = false;
        WindowManager windowManager = this.f17754f;
        if (windowManager != null && (fbVar = this.f17777n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.f17777n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.f17777n, layoutParams);
            g0();
        }
        this.G1 = o7Var;
        this.K1 = o7Var.K ? 1 : 0;
        this.f17781o0.f17598g = false;
        RectF rectF = this.D;
        if (zaVar != null) {
            this.B = zaVar;
            this.F = zaVar.f17444a;
            rectF.set(zaVar.f17446c);
            this.C = zaVar.f17445b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f17790r.c();
        int i12 = this.F;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f17747d0.setBackgroundColor(i10);
        this.f17790r.setTranslationX(0.0f);
        this.f17790r.setTranslationY(0.0f);
        this.f17790r.b(0.0f);
        this.f17790r.setScaleX(1.0f);
        this.f17790r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f17739b, 1);
        o7 o7Var2 = this.G1;
        if (o7Var2 != null) {
            this.Y0.setText(o7Var2.C0);
        }
        L(new x9(this, 0), j10);
        if (this.G1.f18258b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.f17791r0 = 0L;
        this.f17795s0 = "";
    }

    public final void T() {
        j70 j70Var;
        va vaVar = this.T0;
        if (vaVar != null) {
            vaVar.x(4, true);
        }
        wa waVar = this.Y0;
        if (waVar != null && (j70Var = waVar.R0) != null) {
            j70Var.u();
            waVar.R0 = null;
        }
        cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) new la(this, 1), 14, false);
        p1Var.setOnDismissListener(new u9(this, 1));
        p1Var.show();
    }

    public final void U(za zaVar, o7 o7Var) {
        int i10;
        boolean z10;
        int i11;
        lh.m6 o10;
        fb fbVar;
        if (this.d) {
            return;
        }
        int i12 = this.f17743c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.c.b(i12);
            return;
        }
        this.f17787q0 = true;
        this.f17750e = false;
        this.f17814x2 = false;
        WindowManager windowManager = this.f17754f;
        if (windowManager != null && (fbVar = this.f17777n) != null && fbVar.getParent() == null) {
            fb fbVar2 = this.f17777n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, fbVar2, layoutParams);
            windowManager.addView(this.f17777n, layoutParams);
            g0();
        }
        this.G1 = o7Var;
        f9.a(i12, o7Var);
        o7 o7Var2 = this.G1;
        if (o7Var2 != null && o7Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.K1 = i10;
        if (o7Var2 != null && o7Var2.f18296u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17781o0.f17598g = z10;
        if (this.f17791r0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.D;
        if (zaVar != null) {
            this.B = zaVar;
            this.F = zaVar.f17444a;
            rectF.set(zaVar.f17446c);
            this.C = zaVar.f17445b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f17790r.c();
        int i13 = this.F;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f17747d0.setBackgroundColor(i11);
        this.f17790r.setTranslationX(0.0f);
        this.f17790r.setTranslationY(0.0f);
        this.f17790r.b(0.0f);
        this.f17790r.setScaleX(1.0f);
        this.f17790r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f17739b, 1);
        o7 o7Var3 = this.G1;
        if (o7Var3 != null) {
            this.Y0.setText(o7Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new g9(this, 6));
        e();
        this.f17791r0 = 0L;
        this.f17795s0 = "";
    }

    public final void V() {
        ag.t1 t1Var = this.f17796s1;
        if (t1Var != null) {
            t1Var.bringToFront();
        }
        View view = this.f17799t1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f17802u1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f17805v1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f17809w1;
        if (view4 != null) {
            view4.bringToFront();
        }
        tb tbVar = this.l1;
        if (tbVar != null) {
            tbVar.bringToFront();
        }
        cf0 cf0Var = this.f17817y1;
        if (cf0Var != null) {
            cf0Var.bringToFront();
        }
        te0 te0Var = this.A1;
        if (te0Var != null) {
            te0Var.bringToFront();
        }
        ve0 ve0Var = this.B1;
        if (ve0Var != null) {
            ve0Var.bringToFront();
        }
        x5 x5Var = this.f17771k1;
        if (x5Var != null) {
            x5Var.bringToFront();
        }
        p pVar = this.f17775m1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(o7 o7Var, boolean z10) {
        File file;
        View view;
        float f9;
        o7 o7Var2;
        boolean z11;
        int i10;
        if (o7Var != null && this.T0.getWidth() > 0 && this.T0.getHeight() > 0) {
            if (z10) {
                file = o7Var.O0;
            } else {
                file = o7Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.f17808w0.j()) {
                view = this.f17808w0;
            } else {
                view = this.T0;
            }
            if (z10) {
                f9 = 0.33333334f;
            } else {
                f9 = 1.0f;
            }
            int width = (int) (view.getWidth() * f9);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f9), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f9, f9);
            AndroidUtilities.makingGlobalBlurBitmap = true;
            view.draw(canvas);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            canvas.restore();
            Paint paint = new Paint(2);
            l61 textureView = this.T0.getTextureView();
            if (o7Var.K && !o7Var.f18296u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f9, f9);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = o7Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            File file3 = o7Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            ja jaVar = this.f17792r1;
            if (jaVar != null && jaVar.N0 != null) {
                canvas.save();
                canvas.scale(f9, f9);
                ja jaVar2 = this.f17792r1;
                jaVar2.E0 = true;
                n5 n5Var = jaVar2.N0;
                n5Var.f2137a = true;
                n5Var.draw(canvas);
                ja jaVar3 = this.f17792r1;
                jaVar3.N0.f2137a = false;
                jaVar3.E0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = o7.w(this.f17743c, "jpg");
            if (z10) {
                o7Var2 = o7Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new eg.j(this, createBitmap, z11, w10, o7Var2, 2));
            } else {
                o7Var2 = o7Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            if (!z11) {
                o7Var2.N0 = w10;
            }
            o7Var2.f18259b1 = createScaledBitmap;
        }
    }

    public final void X() {
        lh.m6 o10;
        int size;
        char c3;
        View[] viewPages;
        d51[] d51VarArr;
        e9 e9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (e9Var != null) {
            e9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            u0 u0Var = this.f17738a1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            v5 v5Var = this.X0.f18790c;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(v5Var, i10);
            return;
        }
        wa waVar = this.Y0;
        if (waVar != null && waVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.o6 o6Var = waVar.v;
            int i11 = -this.Q1;
            this.Q1 = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            waVar.e();
            return;
        }
        o7 o7Var = this.G1;
        int i12 = this.f17743c;
        if ((o7Var == null || (!o7Var.f18270g && o7Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        lh.b bVar = this.f17736a;
        if (waVar != null && !this.G1.D0) {
            CharSequence text = waVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((i01[]) spannable.getSpans(0, text.length(), i01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new tc(this.f17777n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.gc, 0, new g9(this, 27), bVar)).k(true);
                    int i13 = -this.Q1;
                    this.Q1 = i13;
                    AndroidUtilities.shakeViewSpring(waVar, i13);
                    return;
                }
            }
        }
        o7 o7Var2 = this.G1;
        if (!o7Var2.f18270g && o7Var2.J0 == 0) {
            if (this.J != 0) {
                o7Var2.f18298v0 = MessagesController.getInstance(i12).getInputPeer(this.J);
            }
            va vaVar = this.T0;
            vaVar.x(3, true);
            e9 e9Var2 = new e9(this.f17739b, this.G1.I0, bVar);
            e9Var2.q1(this.G1.E0);
            e9Var2.p1(this.G1.f18298v0);
            e9Var2.B = this.I;
            e9Var2.Q = new h9(this, 14);
            e9Var2.e1(!this.f17808w0.j());
            ArrayList arrayList = this.E1;
            if (arrayList == null) {
                size = this.G1.r();
            } else {
                size = arrayList.size();
            }
            e9Var2.m1(size);
            e9Var2.k1(false);
            CharSequence text2 = waVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (d51 d51Var : (d51[]) ((Spanned) text2).getSpans(0, text2.length(), d51.class)) {
                    if (d51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(d51Var.getURL())));
                            if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                                arrayList2.add(UserObject.getPublicUsername(user));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i14 = -1;
                for (int i15 = 0; i15 < text2.length(); i15++) {
                    char charAt = text2.charAt(i15);
                    if (charAt == '@') {
                        i14 = i15 + 1;
                    } else if (charAt == ' ') {
                        if (i14 != -1) {
                            String charSequence = text2.subSequence(i14, i15).toString();
                            TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f22539id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                }
                c3 = 1;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f22539id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c3 = 1;
            }
            e9Var2.O = arrayList2;
            e9Var2.S = new h9(this, 15);
            e9Var2.T = new h9(this, 16);
            e9Var2.P = new p9(this, 10);
            this.m0 = e9Var2;
            o7 o7Var3 = this.G1;
            if (o7Var3.K) {
                if (vaVar != null && !o7Var3.f18269f0 && this.f17740b0 != 2) {
                    o7Var3.f18266e0 = vaVar.getCurrentPosition();
                    Utilities.Callback h9Var = new h9(this, 17);
                    View view = this.f17796s1;
                    View view2 = this.f17805v1;
                    View[] viewArr = new View[3];
                    viewArr[0] = vaVar;
                    viewArr[c3] = view;
                    viewArr[2] = view2;
                    vaVar.h(h9Var, viewArr);
                }
                e9 e9Var3 = this.m0;
                Bitmap bitmap = this.G1.f18271g0;
                g9 g9Var = new g9(this, 20);
                if (bitmap != null) {
                    e9Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                e9Var3.X = bitmapDrawable;
                e9Var3.Y = g9Var;
                g1 g1Var = e9Var3.f17603b;
                if (g1Var != null) {
                    for (View view3 : g1Var.getViewPages()) {
                        if (view3 instanceof y8) {
                            y8 y8Var = (y8) view3;
                            y8Var.g(false);
                            y8Var.e(false);
                        }
                    }
                }
            }
            this.m0.setOnDismissListener(new u9(this, 0));
            this.m0.show();
            return;
        }
        o7Var2.f18279l = false;
        i(null);
        p0();
    }

    public final void Y(bb bbVar) {
        int i10 = 0;
        RectF rectF = this.D;
        if (bbVar != null) {
            this.B = bbVar;
            this.F = bbVar.f17444a;
            rectF.set(bbVar.f17446c);
            this.C = bbVar.f17445b;
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
        this.f17747d0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f17797s2 || z10) {
            this.f17783o2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f17739b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f17783o2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    jq jqVar = new jq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    jqVar.f29787e = dp;
                    jqVar.f29788f = dp2;
                    this.f17808w0.setCameraThumb(jqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f17736a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p9(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f22714a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f17797s2 = true;
                }
            }
            if (!this.f17783o2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new g9(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        ka kaVar = this.f17812x0;
        if (kaVar != null && kaVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new l3.m(this, this.f17812x0.getTextureView().getBitmap(), runnable, 18));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f9 = 0.0f;
        int i10 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f9 = 1.0f;
            }
            animate.alpha(f9).setUpdateListener(new ia(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 3)).setDuration(320L).setInterpolator(jr.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z10) {
            f9 = 1.0f;
        }
        view.setAlpha(f9);
        n0();
    }

    public final void d0(boolean z10) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z10) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f17754f.updateViewLayout(this.f17777n, layoutParams);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lh.m6 o10;
        o7 o7Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            o6 o6Var = this.K0;
            if (o6Var != null) {
                o6Var.h();
            }
            if (this.f17766i2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f17766i2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f17766i2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            o6 o6Var2 = this.K0;
            if (o6Var2 != null && !this.R1) {
                o6Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f17740b0;
            int i15 = this.f17743c;
            if (i14 == 1) {
                if (!this.J1 && !this.Y0.o()) {
                    lh.s6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    lh.m6 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f16218a, B) || ((o7Var = this.G1) != null && (o7Var.f18270g || o7Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.X0.setShareEnabled(z10);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                o7 o7Var2 = this.G1;
                if (o7Var2 == null || o7Var2.J0 == 0) {
                    h0(o10, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f17743c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.A0.clearAnimation();
        ka kaVar = this.f17812x0;
        if ((kaVar != null && kaVar.isDual()) || this.W1) {
            str = null;
        }
        this.U1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.A0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    i10 = R.drawable.media_photo_flash_auto2;
                    this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                }
            } else {
                str.equals("off");
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        rb rbVar = this.A0;
        if (rbVar.f18538n != i10) {
            rbVar.f18538n = i10;
            ValueAnimator valueAnimator = rbVar.f18539r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                rbVar.f18539r = null;
            }
            rbVar.setDrawable(i10);
        }
        if (this.f17740b0 == 0 && !this.E0.f18848e && this.U1 != null && !I()) {
            z10 = true;
        }
        c0(this.A0, z10, true);
    }

    public final void f(boolean z10) {
        float height;
        boolean z11;
        int i10;
        v0 v0Var;
        this.G0 = z10;
        Boolean bool = this.f17774l2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            if (this.I0.Q) {
                this.f17776m2 = new q9(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f17769j2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f17769j2 = null;
            }
            o1.k kVar = this.f17772k2;
            if (kVar != null) {
                kVar.c();
                this.f17772k2 = null;
            }
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            ga gaVar = this.I0;
            if (gaVar != null) {
                gaVar.G = false;
            }
            if (z10 && (v0Var = this.J0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            ya yaVar = this.f17790r;
            if (yaVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                yaVar.setImportantForAccessibility(i10);
            }
            ga gaVar2 = this.I0;
            if (z10) {
                i11 = 0;
            }
            gaVar2.setImportantForAccessibility(i11);
            this.f17774l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            fb fbVar = this.f17777n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (fbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, fbVar.getHeight());
            ga gaVar3 = this.I0;
            gaVar3.G = !z10;
            if (this.f17757f2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f17760g2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(gaVar3, o1.i.f19028n, height);
                this.f17772k2 = kVar2;
                kVar2.f19045u.a(0.75f);
                this.f17772k2.f19045u.b(350.0f);
                this.f17772k2.a(new r9(this, height, 0));
                this.f17772k2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f17769j2 = ofFloat;
                ofFloat.addUpdateListener(new s9(this, 0));
                this.f17769j2.addListener(new fa(this, 1));
                this.f17769j2.setDuration(450L);
                this.f17769j2.setInterpolator(jr.h);
                this.f17769j2.start();
            }
            if (!z10 && !this.O1) {
                this.f17763h2 = null;
            }
            if (!z10 && this.f17740b0 == 0 && !this.f17783o2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f17741b1 == null) {
            xi0 xi0Var = new xi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f17741b1 = xi0Var;
            xi0Var.B *= 1.5f;
        }
        this.f17745c1.setAnimation(this.f17741b1);
        int i10 = 20;
        if (!z11) {
            xi0 xi0Var2 = this.f17741b1;
            if (!z10) {
                i10 = 0;
            }
            xi0Var2.L(i10, false, false);
        } else if (z10) {
            xi0 xi0Var3 = this.f17741b1;
            if (xi0Var3.X > 20) {
                xi0Var3.L(0, false, false);
            }
            this.f17741b1.N(20);
            this.f17741b1.start();
        } else {
            xi0 xi0Var4 = this.f17741b1;
            int i11 = xi0Var4.X;
            if (i11 != 0 && i11 < 43) {
                xi0Var4.N(43);
                this.f17741b1.start();
            }
        }
    }

    public final void g(float f9, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        ya yaVar = this.f17790r;
        if (z10) {
            this.L.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.H = Float.valueOf(this.G);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f9);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new s9(this, 5));
            this.A.addListener(new jh.l5(this, f9, runnable, 3));
            if (f9 < 1.0f && this.v) {
                this.A.setDuration(250L);
                this.A.setInterpolator(jr.h);
            } else if (f9 <= 0.0f && yaVar.f18912a >= AndroidUtilities.dp(20.0f)) {
                if (f9 < 0.0f && this.K) {
                    this.A.setDuration(200L);
                    this.A.setInterpolator(jr.h);
                    this.K = false;
                } else {
                    this.A.setDuration(400L);
                    this.A.setInterpolator(jr.h);
                }
            } else {
                this.A.setDuration(300L);
                this.A.setInterpolator(new u1.a());
            }
            this.A.start();
            return;
        }
        this.H = null;
        this.E = f9;
        k();
        yaVar.invalidate();
        this.f17777n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f17777n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.q(this, 4));
    }

    public final void h(boolean z10, boolean z11) {
        float f9;
        float dp;
        float dp2;
        float f10;
        float dp3;
        float dp4;
        y yVar;
        if (z10) {
            t3 t3Var = this.f17762h1;
            if (t3Var != null) {
                t3Var.e(true);
            }
            t3 t3Var2 = this.f17765i1;
            if (t3Var2 != null) {
                t3Var2.e(true);
            }
            t3 t3Var3 = this.f17759g1;
            if (t3Var3 != null) {
                t3Var3.e(true);
            }
            t3 t3Var4 = this.S0;
            if (t3Var4 != null) {
                t3Var4.e(true);
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
        if (z10 && (yVar = this.E0) != null && yVar.f18848e) {
            yVar.a(false, z11);
        }
        m0(z11);
        z9 z9Var = this.M0;
        s3 s3Var = this.Q0;
        s3 s3Var2 = this.P0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f17740b0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s3Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f17740b0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(s3Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s3Var, property, (!z10 && this.f17740b0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f17740b0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s3Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(z9Var, property, (z10 || this.f17740b0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f17740b0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(z9Var, property2, f13));
            this.V1.setDuration(260L);
            this.V1.setInterpolator(jr.h);
            this.V1.start();
            return;
        }
        if (z10 && this.f17740b0 == 0 && !I()) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        s3Var2.setAlpha(f9);
        if (z10 && this.f17740b0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        s3Var2.setTranslationY(dp);
        s3Var.setAlpha((!z10 && this.f17740b0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f17740b0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        s3Var.setTranslationY(dp2);
        z9Var.setAlpha((z10 || this.f17740b0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f17740b0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        z9Var.setTranslationY(f13);
    }

    public final void h0(lh.m6 m6Var, boolean z10) {
        if (this.f17806v2) {
            return;
        }
        cg.v0 v0Var = new cg.v0(m6Var.b(), this.f17743c, this.f17739b, new la(this, 0), null);
        v0Var.T = B();
        v0Var.setOnDismissListener(new y70(2, this, z10));
        this.T0.x(7, true);
        this.f17806v2 = true;
        v0Var.show();
    }

    public final void i(Runnable runnable) {
        o7 o7Var;
        Runnable runnable2;
        va vaVar;
        float f9;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        ef0 ef0Var = this.f17813x1;
        if (ef0Var != null && (o7Var = this.G1) != null) {
            o7Var.f18275j = ef0Var.d() | o7Var.f18275j;
            o7 o7Var2 = this.G1;
            ef0 ef0Var2 = this.f17813x1;
            File file = o7Var2.Z0;
            if (file != null) {
                file.delete();
                o7Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = ef0Var2.getSavedFilterState();
            o7Var2.f18256a1 = savedFilterState;
            if (!o7Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = ef0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = o7Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f9 = -1.0f;
                        } else {
                            f9 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f9, f10, o7Var2.f18278k0 / 2.0f, o7Var2.f18280l0 / 2.0f);
                        matrix.postRotate(-o7Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        o7Var2.f18283n0.preScale(o7Var2.f18278k0 / createBitmap.getWidth(), o7Var2.f18280l0 / createBitmap.getHeight());
                        o7Var2.f18278k0 = createBitmap.getWidth();
                        o7Var2.f18280l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = o7Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            o7Var2.Z0.delete();
                        }
                        String k9 = o7.k(o7Var2.L);
                        String str = "webp";
                        if (!"png".equals(k9) && !"webp".equals(k9)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = o7Var2.f18254a;
                        if (!z10) {
                            str = "jpg";
                        }
                        o7Var2.Z0 = o7.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(o7Var2.Z0);
                                if (z10) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new ag.w0(o7Var2, createBitmap, z10, runnable2, 5));
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
                o7 o7Var3 = this.G1;
                if (!o7Var3.K && (vaVar = this.T0) != null) {
                    vaVar.set(o7Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 != z10) {
            this.Z1 = z10;
            float f9 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.F0.animate();
                if (z10) {
                    f9 = 1.0f;
                }
                animate.alpha(f9).setDuration(350L).setInterpolator(jr.h).withEndAction(new q9(this, z10, 1)).start();
                return;
            }
            this.F0.clearAnimation();
            if (z10) {
                f9 = 1.0f;
            }
            this.F0.setAlpha(f9);
            if (!z10) {
                this.F0.b(false, false);
            }
        }
    }

    public final void j() {
        if (this.G1 != null && this.f17820z1 != null && this.f17747d0.getMeasuredWidth() > 0 && this.f17747d0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.G1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f17747d0.getMeasuredWidth() / 2.0f, this.f17747d0.getMeasuredHeight() / 2.0f);
                if ((this.G1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f17747d0.getMeasuredWidth() / this.f17747d0.getMeasuredHeight(), this.f17747d0.getMeasuredHeight() / this.f17747d0.getMeasuredWidth(), this.f17747d0.getMeasuredWidth() / 2.0f, this.f17747d0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f17747d0.getMeasuredWidth()) * this.G1.f18278k0, (1.0f / this.f17747d0.getMeasuredHeight()) * this.G1.f18280l0);
            matrix.postConcat(this.G1.f18283n0);
            matrix.postScale(this.f17747d0.getMeasuredWidth() / this.G1.f18274i0, this.f17747d0.getMeasuredHeight() / this.G1.f18276j0);
            this.f17820z1.setTransform(matrix);
            this.f17820z1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f9;
        u81 u81Var = this.R0;
        if ((u81Var.getTag() != null && z10) || (u81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                g9 g9Var = new g9(this, 25);
                this.a2 = g9Var;
                AndroidUtilities.runOnUIThread(g9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f17742b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        u81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17742b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            u81Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f17742b2;
        Property property = View.ALPHA;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(u81Var, property, f9));
        this.f17742b2.addListener(new bg.z2(17, this, z10));
        this.f17742b2.start();
        if (z10) {
            g9 g9Var2 = new g9(this, 26);
            this.a2 = g9Var2;
            AndroidUtilities.runOnUIThread(g9Var2, 2000L);
        }
    }

    public final void k() {
        lh.h3 h3Var;
        if (this.F == 1) {
            RectF rectF = this.Z;
            rectF.set(this.f17747d0.getLeft(), this.f17747d0.getTop(), this.f17747d0.getMeasuredWidth(), this.f17747d0.getMeasuredHeight());
            rectF.offset(this.f17790r.getX(), this.f17790r.getY());
            float f9 = this.E;
            RectF rectF2 = this.D;
            RectF rectF3 = this.Y;
            AndroidUtilities.lerp(rectF2, rectF, f9, rectF3);
            this.f17747d0.setAlpha(this.E);
            float f10 = rectF3.left;
            ta taVar = this.f17747d0;
            taVar.setTranslationX((f10 - taVar.getLeft()) - this.f17790r.getX());
            float f11 = rectF3.top;
            ta taVar2 = this.f17747d0;
            taVar2.setTranslationY((f11 - taVar2.getTop()) - this.f17790r.getY());
            bb bbVar = this.B;
            if (bbVar != null && (h3Var = bbVar.f17448f) != null) {
                h3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
                this.B.f17448f.setTranslationY((rectF.top - rectF2.top) * this.E);
            }
            this.f17747d0.setScaleX(rectF3.width() / this.f17747d0.getMeasuredWidth());
            this.f17747d0.setScaleY(rectF3.height() / this.f17747d0.getMeasuredHeight());
            this.f17751e0.setAlpha(this.E);
            this.f17758g0.setAlpha(this.E);
            this.f17761h0.setAlpha(this.E);
            if (this.f17740b0 == 2) {
                this.f17788q1.setAlpha(this.E);
            }
        }
    }

    public final void k0() {
        e9 e9Var = this.m0;
        if (e9Var != null) {
            e9Var.dismiss();
            this.m0 = null;
        }
        e9 e9Var2 = new e9(this.f17739b, 86400, this.f17736a);
        e9Var2.o1();
        e9Var2.q1(this.f17801u0);
        TLRPC.InputPeer inputPeer = this.f17798t0;
        if (inputPeer == null) {
            if (this.J != 0) {
                inputPeer = MessagesController.getInstance(this.f17743c).getInputPeer(this.J);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        e9Var2.p1(inputPeer);
        e9Var2.B = this.I;
        e9Var2.Q = new h9(this, 18);
        e9Var2.e1(false);
        e9Var2.m1(1);
        e9Var2.k1(false);
        e9Var2.S = new h9(this, 19);
        e9Var2.P = new p9(this, 12);
        this.m0 = e9Var2;
        e9Var2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: nh.gb.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: nh.gb.l0(int, boolean, boolean):void");
    }

    public final void m() {
        o7 o7Var;
        boolean z10;
        if (this.f17792r1 != null && (o7Var = this.G1) != null && o7Var.f18296u) {
            File file = o7Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.G1.W0 = null;
            }
            this.G1.W0 = o7.w(this.f17743c, "webp");
            ja jaVar = this.f17792r1;
            o7 o7Var2 = this.G1;
            ArrayList arrayList = o7Var2.T0;
            if (this.K1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = jaVar.t0(arrayList, false, false, true, z10, o7Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.G1.W0));
                    if (t02.isRecycled()) {
                        return;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    try {
                        this.G1.W0.delete();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    this.G1.W0 = null;
                    if (t02 == null || t02.isRecycled()) {
                        return;
                    }
                }
                t02.recycle();
            } catch (Throwable th2) {
                if (t02 != null && !t02.isRecycled()) {
                    t02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void m0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f9;
        boolean z16;
        ka kaVar;
        boolean z17 = false;
        if (this.f17740b0 == 0 && this.K1 == 1 && !this.E0.f18848e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.C0.setSelected(this.f17808w0.j());
        y yVar = this.E0;
        if (yVar != null && yVar.f18848e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f17767j0, z12, z10);
        if (!this.W1 && this.K1 != -1 && this.f17740b0 == 0 && this.U1 != null && !this.E0.f18848e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.A0, z13, z10);
        if (!this.W1 && this.K1 != -1 && this.f17740b0 == 0 && (kaVar = this.f17812x0) != null && kaVar.f17457a && !this.E0.f18848e && !this.f17808w0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.B0, z14, z10);
        if (!this.W1 && this.K1 != -1 && this.f17740b0 == 0 && !this.E0.f18848e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.C0, z15, z10);
        c0(this.D0, this.E0.f18848e, z10);
        if (this.f17808w0.j()) {
            f9 = this.f17808w0.getFilledProgress();
        } else {
            f9 = 0.0f;
        }
        this.K0.e(f9, z10);
        boolean z18 = this.E0.f18848e;
        t3 t3Var = this.f17768j1;
        if (z18) {
            t3Var.v();
        } else {
            t3Var.e(true);
        }
        h(this.W1, z10);
        if (this.K1 == -1 && this.f17740b0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.O0, z16);
        if (this.K1 == -1 && this.f17740b0 == 0) {
            z17 = true;
        }
        AndroidUtilities.updateViewShow(this.N0, z17);
    }

    public final void n0() {
        this.D0.setTranslationX(-0.0f);
        float alpha = (this.D0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.B0.setTranslationX(-alpha);
        float alpha2 = (this.B0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.C0.setTranslationX(-alpha2);
        float alpha3 = (this.C0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.A0.setTranslationX(-alpha3);
        float alpha4 = this.A0.getAlpha();
        this.f17767j0.setTranslationX(0.0f);
        float alpha5 = this.f17767j0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.E0.f18845a;
        vVar.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        vVar.invalidate();
    }

    public final void o() {
        boolean z10;
        if (this.G == 0.0f && this.E >= 1.0f && !this.f17814x2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.f17810w2) {
            return;
        }
        jf.s0 s0Var = this.f17815y;
        if (s0Var != null) {
            s0Var.a(!z10);
        }
        this.f17810w2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        xi0 xi0Var = this.f17748d1;
        if (xi0Var != null) {
            int[] iArr = xi0Var.f34737e;
            int i11 = 0;
            if (z10) {
                o7 o7Var = this.G1;
                if (o7Var != null && o7Var.f18304y0) {
                    i11 = iArr[0];
                }
                xi0Var.N(i11);
                xi0 xi0Var2 = this.f17748d1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                    return;
                }
                return;
            }
            o7 o7Var2 = this.G1;
            if (o7Var2 != null && o7Var2.f18304y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            xi0Var.L(i10, false, true);
            this.f17748d1.N(i10);
            ImageView imageView = this.f17752e1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f17786p2 < 0) {
            this.f17786p2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f17789q2 = arrayList;
            arrayList.add("off");
            this.f17789q2.add("auto");
            this.f17789q2.add("on");
            float f9 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            p2 p2Var = this.f17794s;
            p2Var.f18342o = f9;
            p2Var.f18341n = p2.f(f9);
            p2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            p2 p2Var2 = this.f17794s;
            p2Var2.f18343p = f10;
            p2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        g9 g9Var = new g9(this, 2);
        ja jaVar = this.f17792r1;
        o7 o7Var = this.G1;
        if (jaVar != null && o7Var != null) {
            o7Var.f();
            boolean u02 = jaVar.u0();
            boolean z10 = jaVar.K0.getPainting().E;
            Utilities.searchQueue.postRunnable(new j9(this, jaVar, o7Var.f18274i0, o7Var.f18276j0, o7Var, z10, u02, g9Var, 1));
            return;
        }
        g9Var.run();
    }

    public final void q(boolean z10) {
        va vaVar;
        if (this.d) {
            e9 e9Var = this.m0;
            if (e9Var != null) {
                e9Var.dismiss();
                this.m0 = null;
            }
            o7 o7Var = this.G1;
            long j10 = 0;
            if (o7Var != null && !o7Var.h) {
                if ((this.v && o7Var.f18270g) || o7Var.f18257b != 0) {
                    o7Var.f18275j = false;
                }
                o7Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 != null && (vaVar = this.T0) != null) {
                if (this.f17750e) {
                    return;
                }
                this.f17750e = true;
                x61 x61Var = vaVar.f17676y;
                if (x61Var != null) {
                    x61Var.C();
                    vaVar.f17676y.I();
                    vaVar.f17676y = null;
                }
                x61 x61Var2 = vaVar.f17675x;
                if (x61Var2 != null) {
                    j10 = x61Var2.o();
                    vaVar.f17675x.C();
                    vaVar.f17675x.I();
                    vaVar.f17675x = null;
                }
                x61 x61Var3 = vaVar.f17651e;
                if (x61Var3 != null) {
                    j10 = x61Var3.o();
                    vaVar.f17651e.C();
                    vaVar.f17651e.I();
                    vaVar.f17651e = null;
                }
                callback4.run(Long.valueOf(j10), new q9(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f17807w));
                return;
            }
            va vaVar2 = this.T0;
            if (vaVar2 != null && !z10) {
                vaVar2.set(null);
            }
            g(0.0f, z10, new g9(this, 23));
            int i10 = this.F;
            if (i10 == 1 || i10 == 0) {
                this.f17777n.setBackgroundColor(0);
                this.X0.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f17743c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        ka kaVar;
        if ((this.L1 || this.M1) && (kaVar = this.f17812x0) != null && kaVar.isFrontface()) {
            int i10 = this.f17786p2;
            if (i10 == 2 || (i10 == 1 && this.Y1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f17739b;
        if (this.f17812x0 == null && activity != null) {
            this.f17812x0 = new ka(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            o6 o6Var = this.K0;
            float f9 = 0.0f;
            if (o6Var != null) {
                o6Var.f18223c0 = 0.0f;
                o6Var.f18224d0.d(0.0f, true);
            }
            this.f17812x0.recordHevc = !this.f17808w0.j();
            this.f17812x0.setThumbDrawable(A());
            this.f17812x0.initTexture();
            this.f17812x0.setDelegate(new p9(this, 0));
            sb sbVar = this.B0;
            if (this.f17812x0.f17457a && this.f17740b0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(sbVar, z10, true);
            z zVar = this.C0;
            if (!this.f17812x0.f17457a) {
                f9 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f9);
            this.f17808w0.setCameraView(this.f17812x0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.S0.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.f17812x0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.f17812x0.f17457a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.f17762h1.v();
            }
            if (this.f17816y0 == null) {
                this.f17816y0 = new j6(activity, new h9(this, 3));
            }
            this.f17816y0.a(this.f17812x0);
            y6 y6Var = this.f17819z0;
            if (y6Var != null) {
                ua uaVar = this.f17808w0;
                Object blurRenderNode = uaVar.getBlurRenderNode();
                y6Var.B = uaVar;
                y6Var.C = blurRenderNode;
                y6Var.invalidate();
            }
        }
    }

    public final void s() {
        o7 o7Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.f17813x1 == null && (o7Var = this.G1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!o7Var.K) {
                if (o7Var.Z0 == null) {
                    q6 = this.T0.getPhotoBitmap();
                } else {
                    p9 p9Var = new p9(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = o7.q(p9Var, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.G1.K) {
                l61 textureView = this.T0.getTextureView();
                int orientation = this.T0.getOrientation();
                o7 o7Var2 = this.G1;
                if (o7Var2 != null) {
                    savedFilterState = o7Var2.f18256a1;
                }
                ef0 ef0Var = new ef0(this.f17739b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f17778n0, this.f17736a);
                this.f17813x1 = ef0Var;
                this.f17790r.addView(ef0Var);
                cf0 cf0Var = this.f17817y1;
                if (cf0Var != null) {
                    cf0Var.setFilterView(this.f17813x1);
                }
                TextureView myTextureView = this.f17813x1.getMyTextureView();
                this.f17820z1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.T0.o(this.f17820z1, this.f17813x1);
                TextureView textureView2 = this.f17820z1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.f17820z1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                te0 blurControl = this.f17813x1.getBlurControl();
                this.A1 = blurControl;
                if (blurControl != null) {
                    this.f17747d0.addView(blurControl);
                }
                ve0 curveControl = this.f17813x1.getCurveControl();
                this.B1 = curveControl;
                if (curveControl != null) {
                    this.f17747d0.addView(curveControl);
                }
                V();
                this.f17813x1.getDoneTextView().setOnClickListener(new i9(this, 13));
                this.f17813x1.getCancelTextView().setOnClickListener(new i9(this, 14));
                this.f17813x1.getToolsView().setVisibility(8);
                this.f17813x1.getToolsView().setAlpha(0.0f);
                this.f17813x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.f17813x1.f28030e0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.I0 != null) {
            ua uaVar = this.f17808w0;
            if (uaVar != null && uaVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.I0.L) {
                return;
            }
        }
        if (this.f17739b == null) {
            return;
        }
        if (this.I0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f17766i2;
        boolean z13 = !z10;
        ua uaVar2 = this.f17808w0;
        if (uaVar2 != null && uaVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ga gaVar = new ga(this, this.f17743c, this.f17739b, this.f17736a, albumEntry, z10, z13, z11);
        this.I0 = gaVar;
        gaVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.f17808w0.j());
        this.I0.setMaxCount(Math.min(10, t.b() - this.f17808w0.getFilledCount()));
        this.I0.setOnBackClickListener(new x9(this, 1));
        this.I0.setOnSelectListener(new w9(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new jh.o1(this, 2));
        f2.i0 i0Var = this.f17763h2;
        if (i0Var != null) {
            x2 x2Var = this.I0.f18174e;
            x2Var.B = i0Var;
            x2Var.l0();
        }
        this.f17777n.addView(this.I0, i7.f6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: nh.gb.u():void");
    }

    public final void v(boolean z10) {
        j6 j6Var = this.f17816y0;
        if (j6Var != null) {
            j6Var.f17962f = null;
            Utilities.globalQueue.cancelRunnable(j6Var.h);
            this.f17816y0 = null;
            ua uaVar = this.f17808w0;
            if (uaVar != null) {
                uaVar.f17560c.a(null);
            }
        }
        y6 y6Var = this.f17819z0;
        if (y6Var != null) {
            y6Var.B = null;
            y6Var.C = null;
            y6Var.invalidate();
        }
        if (this.f17812x0 != null) {
            if (z10) {
                b0(new g9(this, 8));
                return;
            }
            b0(new g9(this, 9));
            this.f17812x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f17812x0);
            ua uaVar2 = this.f17808w0;
            if (uaVar2 != null) {
                uaVar2.setCameraView(null);
            }
            this.f17812x0 = null;
        }
    }

    public final void w() {
        ga gaVar = this.I0;
        if (gaVar == null) {
            return;
        }
        this.f17777n.removeView(gaVar);
        this.I0 = null;
        ValueAnimator valueAnimator = this.f17769j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f17769j2 = null;
        }
        o1.k kVar = this.f17772k2;
        if (kVar != null) {
            kVar.c();
            this.f17772k2 = null;
        }
        this.f17774l2 = null;
    }

    public final void y() {
        ef0 ef0Var = this.f17813x1;
        if (ef0Var == null) {
            return;
        }
        ef0Var.e();
        this.f17817y1.setFilterView(null);
        this.f17790r.removeView(this.f17813x1);
        TextureView textureView = this.f17820z1;
        if (textureView != null) {
            this.f17747d0.removeView(textureView);
            this.f17820z1 = null;
        }
        this.T0.o(null, null);
        te0 te0Var = this.A1;
        if (te0Var != null) {
            this.f17747d0.removeView(te0Var);
            this.A1 = null;
        }
        ve0 ve0Var = this.B1;
        if (ve0Var != null) {
            this.f17747d0.removeView(ve0Var);
            this.B1 = null;
        }
        this.f17813x1 = null;
    }

    public final void z() {
        ja jaVar = this.f17792r1;
        if (jaVar != null) {
            jaVar.N0.removeAllViews();
            ja jaVar2 = this.f17792r1;
            jaVar2.K0.h();
            jaVar2.N0.setVisibility(8);
            jaVar2.M0.setVisibility(8);
            jaVar2.A0.postRunnable(new ag.o0(20));
            c5 c5Var = jaVar2.f18635g2;
            if (c5Var != null) {
                c5Var.dismiss();
            }
            ag.f0 f0Var = jaVar2.P1;
            if (f0Var != null) {
                f0Var.dismiss();
            }
            this.f17790r.removeView(this.f17792r1);
            this.f17792r1 = null;
            ag.t1 t1Var = this.f17796s1;
            if (t1Var != null) {
                this.f17747d0.removeView(t1Var);
                this.f17796s1 = null;
            }
            View view = this.f17802u1;
            if (view != null) {
                this.f17747d0.removeView(view);
                this.f17802u1 = null;
            }
            View view2 = this.f17799t1;
            if (view2 != null) {
                this.f17747d0.removeView(view2);
                this.f17799t1 = null;
            }
            View view3 = this.f17805v1;
            if (view3 != null) {
                this.f17747d0.removeView(view3);
                this.f17805v1 = null;
            }
            View view4 = this.f17809w1;
            if (view4 != null) {
                this.f17747d0.removeView(view4);
                this.f17809w1 = null;
            }
        }
    }
}
