package kh;

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
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
public final class wb implements NotificationCenter.NotificationCenterDelegate {
    public static wb B2;
    public ValueAnimator A;
    public final hc A0;
    public fe0 A1;
    public ValueAnimator A2;
    public rb B;
    public final ic B0;
    public he0 B1;
    public float C;
    public final a0 C0;
    public File C1;
    public final RectF D;
    public final hc D0;
    public ArrayList D1;
    public float E;
    public final z E0;
    public ArrayList E1;
    public int F;
    public final lc F0;
    public ArrayList F1;
    public float G;
    public boolean G0;
    public a8 G1;
    public Float H;
    public boolean H0;
    public boolean H1;
    public boolean I;
    public va I0;
    public long I1;
    public long J;
    public w0 J0;
    public boolean J1;
    public boolean K;
    public final z6 K0;
    public int K1;
    public final AnimationNotificationsLocker L;
    public final d L0;
    public boolean L1;
    public Runnable M;
    public final oa M0;
    public boolean M1;
    public Utilities.Callback4 N;
    public final q2 N0;
    public boolean N1;
    public int O;
    public final q2 O0;
    public boolean O1;
    public int P;
    public final v3 P0;
    public float P1;
    public int Q;
    public final v3 Q0;
    public int Q1;
    public boolean R;
    public final i81 R0;
    public boolean R1;
    public boolean S;
    public final x3 S0;
    public boolean S1;
    public boolean T;
    public final kb T0;
    public boolean T1;
    public int U;
    public final FrameLayout U0;
    public String U1;
    public int V;
    public final gc V0;
    public AnimatorSet V1;
    public int W;
    public final kc W0;
    public boolean W1;
    public int X;
    public final k6 X0;
    public boolean X1;
    public final RectF Y;
    public final mb Y0;
    public boolean Y1;
    public final RectF Z;
    public final na Z0;
    public boolean Z1;
    public final ih.b f16246a;
    public final Path f16247a0;
    public final v0 f16248a1;
    public Runnable a2;
    public final Activity f16249b;
    public int f16250b0;
    public mi0 f16251b1;
    public AnimatorSet f16252b2;
    public final int f16253c;
    public int f16254c0;
    public final pi0 f16255c1;
    public ba f16256c2;
    public boolean d;
    public final ib f16257d0;
    public mi0 f16258d1;
    public boolean f16259d2;
    public boolean f16260e;
    public final FrameLayout f16261e0;
    public ImageView f16262e1;
    public AnimatorSet f16263e2;
    public final WindowManager f16264f;
    public final LinearLayout f16265f0;
    public final h6 f16266f1;
    public ValueAnimator f16267f2;
    public final FrameLayout f16268g0;
    public final x3 f16269g1;
    public boolean f16270g2;
    public final WindowManager.LayoutParams h;
    public final fh.d2 f16271h0;
    public final x3 f16272h1;
    public f2.l0 f16273h2;
    public final FrameLayout f16274i0;
    public final x3 f16275i1;
    public MediaController.AlbumEntry f16276i2;
    public final q2 f16277j0;
    public final x3 f16278j1;
    public ValueAnimator f16279j2;
    public final t7 f16280k0;
    public final l6 f16281k1;
    public o1.j f16282k2;
    public final org.telegram.ui.ActionBar.h5 f16283l0;
    public final jc l1;
    public Boolean f16284l2;
    public t9 m0;
    public q f16285m1;
    public fa f16286m2;
    public final vb f16287n;
    public final org.telegram.ui.Components.ba f16288n0;
    public gb f16289n1;
    public AnimatorSet f16290n2;
    public final q6 f16291o0;
    public hb f16292o1;
    public boolean f16293o2;
    public final fh.l2 f16294p0;
    public final gc f16295p1;
    public int f16296p2;
    public boolean f16297q0;
    public final d f16298q1;
    public ArrayList f16299q2;
    public final ob f16300r;
    public long f16301r0;
    public ya f16302r1;
    public FrameLayout f16303r2;
    public final s2 f16304s;
    public String f16305s0;
    public xf.c1 f16306s1;
    public boolean f16307s2;
    public TLRPC.InputPeer f16308t0;
    public View f16309t1;
    public v9 f16310t2;
    public r9 f16311u0;
    public View f16312u1;
    public bg.c2 f16313u2;
    public boolean v;
    public u f16314v0;
    public View f16315v1;
    public boolean f16316v2;
    public long f16317w;
    public final jb f16318w0;
    public View f16319w1;
    public boolean f16320w2;
    public nb f16321x;
    public za f16322x0;
    public qe0 f16323x1;
    public boolean f16324x2;
    public final ff.t0 f16325y;
    public v6 f16326y0;
    public final oe0 f16327y1;
    public eb f16328y2;
    public final k7 f16329z0;
    public TextureView f16330z1;
    public float f16331z2;

    public wb(Activity activity, int i9) {
        int i10;
        ih.b bVar = new ih.b();
        this.f16246a = bVar;
        this.f16317w = 0L;
        this.D = new RectF();
        this.I = true;
        this.L = new AnimationNotificationsLocker();
        this.Y = new RectF();
        this.Z = new RectF();
        this.f16247a0 = new Path();
        new Rect();
        this.f16250b0 = 0;
        this.f16254c0 = -1;
        this.f16311u0 = new r9();
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
        ra raVar = new ra(this);
        this.Z1 = true;
        this.f16270g2 = true;
        this.f16296p2 = -1;
        this.f16249b = activity;
        this.f16253c = i9;
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.f16325y = launchActivity != null ? new ff.t0(launchActivity, true) : null;
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
        this.f16264f = windowManager;
        vb vbVar = new vb(this, activity);
        this.f16287n = vbVar;
        ea eaVar = new ea(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(vbVar, eaVar);
        this.f16287n.setFocusable(true);
        this.f16287n.setImportantForAccessibility(2);
        s2 s2Var = new s2(activity, windowManager, this.f16287n, layoutParams);
        this.f16304s = s2Var;
        s2Var.a(new cb(this));
        this.f16287n.addView(this.f16304s.f16010b, new ViewGroup.LayoutParams(-1, -1));
        vb vbVar2 = this.f16287n;
        ob obVar = new ob(this, activity);
        this.f16300r = obVar;
        vbVar2.addView(obVar);
        ob obVar2 = this.f16300r;
        ib ibVar = new ib(this, activity);
        this.f16257d0 = ibVar;
        obVar2.addView(ibVar);
        this.f16300r.addView(this.f16304s.f16011c, new ViewGroup.LayoutParams(-1, -1));
        this.f16288n0 = new org.telegram.ui.Components.ba(this.f16257d0);
        this.f16291o0 = new Object();
        ob obVar3 = this.f16300r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f16261e0 = frameLayout;
        obVar3.addView(frameLayout);
        ob obVar4 = this.f16300r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f16268g0 = frameLayout2;
        obVar4.addView(frameLayout2);
        ob obVar5 = this.f16300r;
        fh.d2 d2Var = new fh.d2(this, activity, 6);
        this.f16271h0 = d2Var;
        obVar5.addView(d2Var);
        this.f16271h0.setVisibility(8);
        this.f16271h0.setAlpha(0.0f);
        ob obVar6 = this.f16300r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f16274i0 = frameLayout3;
        obVar6.addView(frameLayout3);
        org.telegram.ui.Components.gc.a(this.f16287n, new bg.z(6));
        jb jbVar = new jb(this, activity, this.f16288n0, this.f16300r, bVar);
        this.f16318w0 = jbVar;
        vb vbVar3 = this.f16287n;
        Objects.requireNonNull(vbVar3);
        jbVar.setCancelGestures(new f1(vbVar3, 13));
        this.f16318w0.setResetState(new v9(this, 13));
        this.f16257d0.addView(this.f16318w0, g7.e6.e(-1, -1, 119));
        this.f16318w0.setOnClickListener(new x9(this, 12));
        ib ibVar2 = this.f16257d0;
        int i11 = this.F;
        ibVar2.setBackgroundColor((i11 == 1 || i11 == 0) ? 0 : -14737633);
        ib ibVar3 = this.f16257d0;
        bg.q1 q1Var = ff.r0.f6254a;
        ibVar3.setOutlineProvider(new ff.q0(0, AndroidUtilities.dp(12.0f)));
        this.f16257d0.setClipToOutline(true);
        v9 v9Var = new v9(this, 14);
        ?? view = new View(activity);
        view.f31365a = new TextPaint(1);
        view.f31366b = new TextPaint(1);
        gr grVar = gr.h;
        view.f31372s = new org.telegram.ui.Components.y5((View) view, 0L, 350L, grVar);
        view.E = new ib0(view, 7);
        view.f31374x = v9Var;
        this.f16327y1 = view;
        kb kbVar = new kb(this, activity, this.f16288n0, this.f16291o0);
        this.T0 = kbVar;
        kbVar.setCollageView(this.f16318w0);
        kb kbVar2 = this.T0;
        kbVar2.v = new v9(this, 15);
        kbVar2.setOnTapListener(new v9(this, 16));
        this.T0.setVisibility(8);
        kb kbVar3 = this.T0;
        kbVar3.J = new v9(this, 17);
        this.f16257d0.addView(kbVar3, g7.e6.e(-1, -1, 119));
        this.f16257d0.addView(this.f16327y1, g7.e6.e(-1, -1, 119));
        vb vbVar4 = this.f16287n;
        mb mbVar = new mb(this, activity, vbVar4, vbVar4, this.f16300r, bVar, this.f16288n0);
        this.Y0 = mbVar;
        mbVar.setAccount(i9);
        this.Y0.setUiBlurBitmap(new ea(this, 6));
        org.telegram.ui.Components.gc.a(this.f16271h0, new fh.y0(this, 5));
        this.Y0.setOnHeightUpdate(new w9(this, 13));
        this.Y0.setOnPeriodUpdate(new w9(this, 4));
        long j10 = this.J;
        if (j10 != 0) {
            this.Y0.setDialogId(j10);
        }
        this.Y0.setOnPremiumHint(new w9(this, 5));
        this.Y0.setOnKeyboardOpen(new w9(this, 6));
        fh.l2 l2Var = new fh.l2(this, activity, 2);
        this.f16294p0 = l2Var;
        this.f16300r.addView(l2Var);
        gc gcVar = new gc(activity, this.f16300r, this.f16257d0, bVar, this.f16288n0);
        this.V0 = gcVar;
        gcVar.setOnTimelineClick(new v9(this, 10));
        this.V0.setOnHeightChange(new v9(this, 11));
        this.T0.setVideoTimelineView(this.V0);
        this.V0.setVisibility(8);
        this.V0.setAlpha(0.0f);
        this.V0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.U0 = frameLayout4;
        float f10 = 388;
        frameLayout4.addView(this.V0, g7.e6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kc kcVar = new kc(activity);
        this.W0 = kcVar;
        kcVar.setVisibility(8);
        this.W0.a(false);
        this.U0.addView(this.W0, g7.e6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f16271h0.addView(this.U0, g7.e6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f16271h0.addView(this.Y0, g7.e6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f16318w0.setTimelineView(this.V0);
        this.f16318w0.setPreviewView(this.T0);
        gc gcVar2 = new gc(activity, this.f16300r, this.f16257d0, bVar, this.f16288n0);
        this.f16295p1 = gcVar2;
        gcVar2.T0 = true;
        gcVar2.setVisibility(8);
        this.f16295p1.setAlpha(0.0f);
        this.f16271h0.addView(this.f16295p1, g7.e6.d(-1, f10, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        na naVar = new na(this, activity, bVar, this.f16288n0);
        this.Z0 = naVar;
        naVar.setVisibility(8);
        this.f16271h0.addView(this.Z0, g7.e6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f16277j0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        q2 q2Var = this.f16277j0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        q2Var.setScaleType(scaleType);
        this.f16277j0.setImageResource(R.drawable.msg_photo_back);
        q2 q2Var2 = this.f16277j0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        q2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f16277j0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f16277j0.setOnClickListener(new x9(this, 1));
        this.f16261e0.addView(this.f16277j0, g7.e6.e(56, 56, 51));
        this.f16304s.a(this.f16277j0);
        t7 t7Var = new t7(activity, i9);
        this.f16280k0 = t7Var;
        t7Var.a(false, false);
        this.f16280k0.setOnClickListener(new bg.u1(27, this, activity));
        this.f16261e0.addView(this.f16280k0, g7.e6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f16283l0 = h5Var;
        h5Var.setTextSize(20);
        this.f16283l0.setGravity(19);
        this.f16283l0.setTextColor(-1);
        this.f16283l0.setTypeface(AndroidUtilities.bold());
        this.f16283l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f16283l0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f16283l0.setAlpha(0.0f);
        this.f16283l0.setVisibility(8);
        this.f16283l0.setEllipsizeByGradient(true);
        this.f16283l0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f16261e0.addView(this.f16283l0, g7.e6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f16265f0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f16265f0.setGravity(5);
        this.f16261e0.addView(this.f16265f0, g7.e6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        w9 w9Var = new w9(this, 7);
        vb vbVar5 = this.f16287n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f16190w = true;
        imageView2.f16191x = true;
        imageView2.h = w9Var;
        imageView2.f16182a = i9;
        imageView2.f16183b = vbVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new androidx.mediarouter.app.c(imageView2, 27));
        imageView2.f16186f = new jp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f16248a1 = imageView2;
        x3 x3Var = new x3(activity, 1);
        x3Var.m(1.0f, -71.0f);
        x3Var.d = 2000L;
        x3Var.Q = false;
        x3Var.D.o(true, false, false);
        this.f16269g1 = x3Var;
        x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16261e0.addView(this.f16269g1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f16255c1 = imageView3;
        imageView3.setScaleType(scaleType);
        pi0 pi0Var = this.f16255c1;
        a8 a8Var = this.G1;
        pi0Var.setImageResource((a8Var == null || !a8Var.Y) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.f16255c1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f16255c1.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f16255c1.setOnClickListener(new x9(this, 2));
        this.f16255c1.setVisibility(8);
        this.f16255c1.setAlpha(0.0f);
        h6 h6Var = new h6(activity);
        this.f16266f1 = h6Var;
        h6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f16266f1.setVisibility(8);
        this.f16266f1.setAlpha(0.0f);
        this.f16266f1.setOnClickListener(new x9(this, 3));
        this.f16265f0.addView(this.f16266f1, g7.e6.q(46, 56, 53));
        this.f16265f0.addView(this.f16255c1, g7.e6.q(46, 56, 53));
        this.f16265f0.addView(this.f16248a1, g7.e6.e(46, 56, 53));
        hc hcVar = new hc(activity);
        this.A0 = hcVar;
        hcVar.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.A0.setOnClickListener(new x9(this, 4));
        this.A0.setOnLongClickListener(new d5(this, 1));
        this.A0.setVisibility(8);
        this.A0.setAlpha(0.0f);
        this.f16304s.a(this.A0);
        this.f16261e0.addView(this.A0, g7.e6.e(56, 56, 53));
        ic icVar = new ic(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.B0 = icVar;
        icVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.B0.setOnClickListener(new x9(this, 5));
        boolean q10 = d1.q(activity);
        this.B0.setVisibility(q10 ? 0 : 8);
        this.B0.setAlpha(q10 ? 1.0f : 0.0f);
        this.f16304s.a(this.B0);
        this.f16261e0.addView(this.B0, g7.e6.e(56, 56, 53));
        ?? hcVar2 = new hc(activity);
        this.C0 = hcVar2;
        hcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.C0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        if (this.f16314v0 == null) {
            i10 = 6;
            this.f16314v0 = (u) u.a().get(6);
        } else {
            i10 = 6;
        }
        this.C0.setOnClickListener(new x9(this, i10));
        this.C0.a(new v(this.f16314v0, false), false);
        this.C0.setSelected(false);
        this.C0.setVisibility(0);
        this.C0.setAlpha(1.0f);
        this.f16304s.a(this.C0);
        this.f16261e0.addView(this.C0, g7.e6.e(56, 56, 53));
        hc hcVar3 = new hc(activity);
        this.D0 = hcVar3;
        hcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.D0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.D0.a(new v(new u("../../.."), true), false);
        this.D0.setVisibility(8);
        this.D0.setAlpha(0.0f);
        this.D0.setOnClickListener(new x9(this, 7));
        this.f16304s.a(this.D0);
        this.f16261e0.addView(this.D0, g7.e6.e(56, 56, 53));
        z zVar = new z(activity, this.f16304s);
        this.E0 = zVar;
        zVar.f16415a.u0(6);
        this.E0.setSelected((u) null);
        this.E0.setOnLayoutClick(new w9(this, 8));
        this.f16261e0.addView(this.E0, g7.e6.e(-1, 56, 53));
        x3 x3Var2 = new x3(activity, 1);
        x3Var2.m(1.0f, -20.0f);
        x3Var2.d = 5000L;
        x3Var2.i();
        x3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        x3Var2.f16352h0 = new bg.d2(17);
        this.f16272h1 = x3Var2;
        x3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16261e0.addView(this.f16272h1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        x3 x3Var3 = new x3(activity, 2);
        x3Var3.m(0.0f, 28.0f);
        x3Var3.d = 5000L;
        x3Var3.q(true);
        this.f16275i1 = x3Var3;
        this.f16261e0.addView(x3Var3, g7.e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        x3 x3Var4 = new x3(activity, 1);
        x3Var4.m(1.0f, -20.0f);
        x3Var4.d = 5000L;
        x3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f16278j1 = x3Var4;
        x3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f16261e0.addView(this.f16278j1, g7.e6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f15619a = paint;
        Paint paint2 = new Paint(1);
        view2.f15620b = paint2;
        view2.f15622e = new org.telegram.ui.Components.y5((View) view2, 0L, 250L, grVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        view2.f15621c = i6Var;
        i6Var.k(0.3f, 250L, grVar);
        i6Var.t(AndroidUtilities.dp(13.0f));
        i6Var.r(-1);
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(view2);
        i6Var.f29333b = 1;
        view2.a(0L, false);
        this.F0 = view2;
        i0(false, false);
        this.f16261e0.addView(this.F0, g7.e6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f16304s.a(this.F0);
        MediaController.loadGalleryPhotosAlbums(0);
        z6 z6Var = new z6(activity);
        this.K0 = z6Var;
        z6Var.setDelegate(raVar);
        z6 z6Var2 = this.K0;
        boolean z10 = this.K1 == 1;
        z6Var2.f16442j0 = -1.0f;
        z6Var2.f16443k0 = z10;
        z6Var2.invalidate();
        this.f16268g0.addView(this.K0, g7.e6.e(-1, 100, 87));
        this.f16304s.a(this.K0);
        this.K0.e(this.f16318w0.j() ? this.f16318w0.getFilledProgress() : 0.0f, true);
        d dVar = new d(activity, bVar, true);
        this.L0 = dVar;
        dVar.setRoundRadius(24);
        this.L0.setColor(-2473124);
        this.L0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.L0.setAlpha(0.0f);
        this.L0.setScaleX(0.8f);
        this.L0.setScaleY(0.8f);
        this.L0.setVisibility(8);
        this.f16268g0.addView(this.L0, g7.e6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.L0.setOnClickListener(new x9(this, 8));
        x3 x3Var5 = new x3(activity, 3);
        x3Var5.q(true);
        x3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        x3Var5.h = AndroidUtilities.dp(320.0f);
        x3Var5.d = 5000L;
        x3Var5.G = Layout.Alignment.ALIGN_CENTER;
        this.S0 = x3Var5;
        this.f16268g0.addView(x3Var5, g7.e6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        i81 i81Var = new i81(activity);
        this.R0 = i81Var;
        i81Var.I = false;
        i81Var.setAlpha(0.0f);
        this.f16268g0.addView(this.R0, g7.e6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.R0.setDelegate(new ea(this, 4));
        i81 i81Var2 = this.R0;
        this.P1 = 0.0f;
        i81Var2.b(0.0f, false);
        k7 k7Var = new k7(activity, i9, new v9(this, 12));
        this.f16329z0 = k7Var;
        k7Var.f15530c = new w9(this, 9);
        this.f16268g0.addView(k7Var, g7.e6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        oa oaVar = new oa(this, activity);
        this.M0 = oaVar;
        oaVar.setOnSwitchModeListener(new w9(this, 10));
        this.M0.setOnSwitchingModeListener(new w9(this, 11));
        this.f16274i0.addView(this.M0, g7.e6.e(-1, 48, 55));
        this.f16304s.a(this.M0);
        ?? imageView4 = new ImageView(activity);
        this.N0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.N0.setImageResource(R.drawable.stream_flip);
        this.N0.setScaleType(scaleType);
        this.N0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f16274i0.addView(this.N0, g7.e6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f16304s.a(this.N0);
        this.N0.setOnClickListener(new x9(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.O0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.O0.setImageResource(R.drawable.stream_settings);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        this.f16274i0.addView(this.O0, g7.e6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f16304s.a(this.O0);
        this.O0.setOnClickListener(new x9(this, 10));
        v3 v3Var = new v3(activity);
        this.P0 = v3Var;
        this.f16274i0.addView(v3Var, g7.e6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f16304s.a(this.P0);
        v3 v3Var2 = new v3(activity);
        this.Q0 = v3Var2;
        v3Var2.f16192a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        v3Var2.invalidate();
        this.Q0.setAlpha(0.0f);
        this.f16274i0.addView(this.Q0, g7.e6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f16304s.a(this.Q0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f16298q1 = dVar2;
        dVar2.setVisibility(8);
        this.f16298q1.setAlpha(0.0f);
        this.f16298q1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f16298q1.setOnClickListener(new x9(this, 11));
        this.f16274i0.addView(this.f16298q1, g7.e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f15521b = new ArrayList();
        frameLayout5.f15523e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f15520a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, g7.e6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f15523e = true;
        j6 j6Var = new j6(frameLayout5, activity, string, true);
        frameLayout5.f15522c = j6Var;
        j6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f15522c, g7.e6.c(-2.0f, -2));
        frameLayout5.e();
        this.X0 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.X0.setOnClickListener(new w9(this, 12));
        this.f16274i0.addView(this.X0, g7.e6.e(-1, 52, 23));
        jc jcVar = new jc(activity);
        this.l1 = jcVar;
        jcVar.setAlpha(0.0f);
        this.l1.setVisibility(8);
        this.f16257d0.addView(this.l1, g7.e6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        l6 l6Var = new l6(activity, i9, bVar);
        this.f16281k1 = l6Var;
        this.f16257d0.addView(l6Var, g7.e6.e(-1, -1, 119));
        m0(false);
    }

    public static wb E(Activity activity, int i9) {
        wb wbVar = B2;
        if (wbVar != null && (wbVar.f16249b != activity || wbVar.f16253c != i9)) {
            wbVar.q(false);
            B2 = null;
        }
        if (B2 == null) {
            B2 = new wb(activity, i9);
        }
        return B2;
    }

    public static void a(wb wbVar) {
        za zaVar = wbVar.f16322x0;
        boolean z10 = false;
        if (zaVar != null && zaVar.getTextureView() != null) {
            Bitmap bitmap = wbVar.f16322x0.getTextureView().getBitmap();
            if (bitmap == null) {
                wbVar.Y1 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f10 = 0.0f;
            for (int i9 = 0; i9 < 10; i9++) {
                int i10 = 0;
                while (i10 < 10) {
                    i10++;
                    f10 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i9 + 1) * width, i10 * height));
                }
            }
            bitmap.recycle();
            if (f10 / 100.0f < 0.22f) {
                z10 = true;
            }
            wbVar.Y1 = z10;
            return;
        }
        wbVar.Y1 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(wb wbVar) {
        Activity activity = wbVar.f16249b;
        if (activity == null) {
            return true;
        }
        int i9 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i9 >= 33) {
            z10 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? true : true;
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i9 >= 23) {
            if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                z10 = true;
            }
            if (z10) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z10;
    }

    public static void c(wb wbVar) {
        ValueAnimator valueAnimator = wbVar.f16267f2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            wbVar.f16267f2 = null;
        }
        wbVar.f16270g2 = false;
        ob obVar = wbVar.f16300r;
        float f10 = obVar.f15805a;
        float f11 = obVar.f15806b;
        obVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        wbVar.f16267f2 = ofFloat;
        ofFloat.addUpdateListener(new ka(wbVar, f10, f11, 0));
        wbVar.f16267f2.setDuration(340L);
        wbVar.f16267f2.setInterpolator(gr.h);
        wbVar.f16267f2.addListener(new ua(wbVar, 0));
        wbVar.f16267f2.start();
    }

    public static boolean d(wb wbVar) {
        Activity activity = wbVar.f16249b;
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
        int i9 = -dp;
        mutate.setBounds(i9 / 4, i9, (dp / 4) * 3, 0);
        spannableString.setSpan(new db(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        wb wbVar = B2;
        if (wbVar != null) {
            wbVar.q(false);
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
        return this.f16249b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.E1;
        if (arrayList != null) {
            return arrayList.size();
        }
        a8 a8Var = this.G1;
        if (a8Var != null) {
            return a8Var.r();
        }
        return 1;
    }

    public final String C() {
        za zaVar = this.f16322x0;
        if (zaVar != null && zaVar.getCameraSession() != null) {
            if (this.f16322x0.isFrontface() && !this.f16322x0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f16299q2.get(this.f16296p2);
            }
            return this.f16322x0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final w0 D() {
        if (this.J0 == null) {
            w0 w0Var = new w0(this.f16249b);
            this.J0 = w0Var;
            this.f16268g0.addView(w0Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.J0;
    }

    public final String F() {
        int i9;
        za zaVar = this.f16322x0;
        if (zaVar != null && zaVar.getCameraSession() != null) {
            if (this.f16322x0.isFrontface() && !this.f16322x0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f16299q2;
                if (this.f16296p2 + 1 >= arrayList.size()) {
                    i9 = 0;
                } else {
                    i9 = this.f16296p2 + 1;
                }
                return (String) arrayList.get(i9);
            }
            return this.f16322x0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f16262e1 == null) {
            int i9 = R.raw.sun_outline;
            mi0 mi0Var = new mi0(i9, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f16258d1 = mi0Var;
            mi0Var.h = true;
            a8 a8Var = this.G1;
            if (a8Var != null && a8Var.f14951y0) {
                mi0Var.K(35);
                this.f16258d1.N(36);
            } else {
                mi0Var.N(0);
                this.f16258d1.K(0);
            }
            this.f16258d1.W = true;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J9, this.f16246a);
            this.f16258d1.O(v02, "Sunny");
            this.f16258d1.O(v02, "Path 6");
            this.f16258d1.O(v02, "Path");
            this.f16258d1.O(v02, "Path 5");
            this.f16258d1.m();
            ImageView imageView = new ImageView(this.f16249b);
            this.f16262e1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f16262e1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f16262e1.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
            this.f16262e1.setOnClickListener(new x9(this, 0));
            this.f16262e1.setVisibility(8);
            this.f16262e1.setImageDrawable(this.f16258d1);
            this.f16262e1.setAlpha(0.0f);
            this.f16265f0.addView(this.f16262e1, 0, g7.e6.q(46, 56, 53));
        }
        return this.f16262e1;
    }

    public final void H() {
        ya yaVar = this.f16302r1;
        if (yaVar == null) {
            return;
        }
        this.f16303r2 = null;
        yaVar.getTopLayout().setAlpha(0.0f);
        this.f16302r1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f16302r1.getBottomLayout().setAlpha(0.0f);
        this.f16302r1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f16302r1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f16302r1.setVisibility(8);
    }

    public final boolean I() {
        float f10;
        if (this.f16318w0.j()) {
            f10 = this.f16318w0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.W1 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        va vaVar;
        if (!this.S && (vaVar = this.I0) != null) {
            if (vaVar.getTranslationY() < (this.f16287n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: kh.wb.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j10) {
        if (!this.O1 && this.G1 != null) {
            ba baVar = this.f16256c2;
            if (baVar != null) {
                AndroidUtilities.cancelRunOnUIThread(baVar);
            }
            this.f16259d2 = true;
            this.O1 = true;
            this.f16256c2 = new ba(this, runnable, 1);
            this.T0.setAlpha(0.0f);
            this.T0.setVisibility(0);
            this.T0.n(this.G1, this.f16256c2, j10);
            this.T0.p(this.G1, false);
            AndroidUtilities.runOnUIThread(this.f16256c2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: kh.wb.M():boolean");
    }

    public final void N(int i9, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        if (i9 == 0) {
            v(false);
            this.K0.setVisibility(8);
            this.R0.setVisibility(8);
            this.M0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i9 == 2) {
            this.f16295p1.setVisibility(8);
            if (i10 == 1) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f16271h0.setVisibility(i16);
            this.Y0.setVisibility(8);
            this.f16298q1.setVisibility(8);
        }
        if (i9 == 1) {
            this.X0.setVisibility(8);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f16271h0.setVisibility(i13);
            this.f16255c1.setVisibility(8);
            this.f16266f1.setVisibility(8);
            this.f16248a1.setVisibility(8);
            ImageView imageView = this.f16262e1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.T0.setVisibility(i14);
            this.V0.setVisibility(8);
            if (i10 != 2) {
                z();
                y();
            }
            if (i10 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.f16283l0.setVisibility(i15);
            w();
            this.l1.setAlpha(0.0f);
            this.l1.setVisibility(8);
            this.W0.setVisibility(8);
            this.D1 = null;
            this.E1 = null;
            this.F1 = null;
        }
        if (i10 == 1) {
            a8 a8Var = this.G1;
            if (a8Var == null || !a8Var.f14929n) {
                u();
                H();
            }
            oe0 oe0Var = this.f16327y1;
            if (oe0Var != null) {
                oe0Var.setAllowTouch(false);
            }
            this.T0.x(2, false);
            this.T0.x(3, false);
            this.T0.x(4, false);
            this.T0.x(5, false);
            this.T0.x(7, false);
            a8 a8Var2 = this.G1;
            if (a8Var2 != null && a8Var2.f14919h0 >= 30000) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.W0.setVisibility(i12);
            this.f16271h0.setAlpha(1.0f);
            this.f16271h0.setTranslationY(0.0f);
            a8 a8Var3 = this.G1;
            this.Y0.setVisibility((a8Var3 == null || a8Var3.J0 == 0) ? 0 : 0);
        }
        if (i10 == 0 && this.R1) {
            D().setVisibility(0);
            w0 D = D();
            D.f16227r.d(0.0f, true);
            D.a(true);
            ih.g gVar = D.h;
            if (gVar != null) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
            }
            ih.g gVar2 = new ih.g(D, 29);
            D.h = gVar2;
            AndroidUtilities.runOnUIThread(gVar2, 3500L);
            this.K0.h();
        }
        this.R1 = false;
        oe0 oe0Var2 = this.f16327y1;
        if (oe0Var2 != null) {
            if (i10 == 1 && ((i11 = this.f16254c0) == -1 || i11 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            oe0Var2.setAllowTouch(z11);
        }
        mb mbVar = this.Y0;
        if (mbVar != null) {
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            mbVar.f15624a0 = z10;
        }
        if (i10 == 1) {
            int i18 = this.f16253c;
            MediaDataController.getInstance(i18).checkStickers(0);
            MediaDataController.getInstance(i18).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i18).loadRecents(2, false, true, false);
            ih.v6 storiesController = MessagesController.getInstance(i18).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i18).getStoriesController().R();
        }
    }

    public final void O(int i9, int i10) {
        long j10;
        String str;
        SpannableStringBuilder append;
        a8 a8Var;
        a8 a8Var2;
        int i11;
        boolean z10;
        a8 a8Var3;
        a8 a8Var4;
        a8 a8Var5;
        y51 textureView;
        a8 a8Var6;
        boolean z11 = true;
        if (i10 == 0) {
            Z(false);
            this.K0.setVisibility(0);
            z6 z6Var = this.K0;
            if (z6Var != null) {
                z6Var.g(false);
            }
            this.M0.setVisibility(0);
            this.R0.setVisibility(0);
            this.R0.setAlpha(0.0f);
            this.F0.a(0L, true);
            a8 a8Var7 = this.G1;
            if (a8Var7 != null) {
                a8Var7.i(false);
                this.G1 = null;
            }
            jb jbVar = this.f16318w0;
            if (jbVar != null) {
                jbVar.e();
                this.K0.e(0.0f, false);
            }
        }
        if (i9 == 0) {
            e0(null);
            b0(new v9(this, 18));
            w0 w0Var = this.J0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            this.S0.e(true);
            x3 x3Var = this.f16272h1;
            if (x3Var != null) {
                x3Var.e(true);
            }
        }
        String str2 = "";
        int i12 = this.f16253c;
        if (i10 == 1 || i9 == 1) {
            this.f16248a1.setEntry(i10 == 1 ? this.G1 : null);
            if (this.K1 == 1) {
                this.f16255c1.setVisibility(0);
                a8 a8Var8 = this.G1;
                f0(a8Var8 != null && a8Var8.Y, false);
                this.f16266f1.setVisibility(0);
                this.T0.x(-9982, false);
                ((qf0) this.f16266f1.f15398c).a(this.T0.k(), false);
                this.f16283l0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                a8 a8Var9 = this.G1;
                if (a8Var9 != null && !TextUtils.isEmpty(a8Var9.f14950y)) {
                    this.f16255c1.setVisibility(8);
                    this.f16266f1.setVisibility(0);
                    ((qf0) this.f16266f1.f15398c).a(true, false);
                    this.f16283l0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f16283l0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f16248a1.setVisibility(0);
            a8 a8Var10 = this.G1;
            if (a8Var10 != null && a8Var10.f14943u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f16262e1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.X0.setVisibility(0);
            this.T0.setVisibility(0);
            a8 a8Var11 = this.G1;
            this.Y0.setVisibility(((a8Var11 == null || a8Var11.J0 == 0) && this.f16301r0 == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.U0.getLayoutParams();
            a8 a8Var12 = this.G1;
            layoutParams.bottomMargin = AndroidUtilities.dp(((a8Var12 == null || a8Var12.J0 == 0) && this.f16301r0 == 0) ? 68.0f : 12.0f);
            this.U0.setLayoutParams(layoutParams);
            this.f16271h0.setVisibility(0);
            this.f16271h0.clearFocus();
            a8 a8Var13 = this.G1;
            this.Y0.A(a8Var13 == null ? 86400 : a8Var13.I0, false);
            this.Y0.setPeriodVisible(!MessagesController.getInstance(i12).premiumFeaturesBlocked() && ((a8Var = this.G1) == null || !a8Var.f14917g));
            a8 a8Var14 = this.G1;
            this.Y0.setHasRoundVideo((a8Var14 == null || a8Var14.f14932o0 == null) ? false : true);
            mb mbVar = this.Y0;
            if (mbVar == null) {
                j10 = 0;
            } else {
                a8 a8Var15 = this.G1;
                if (a8Var15 != null && a8Var15.f14929n) {
                    TLRPC.Peer peer = a8Var15.f14935q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i12).getUser(Long.valueOf(peer.user_id)));
                        a8 a8Var16 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        a8Var16.f14933p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        a8 a8Var17 = this.G1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        a8Var17.f14933p = append;
                    }
                    String str3 = this.G1.f14939s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.Y0.v(str4, append);
                } else {
                    j10 = 0;
                    mbVar.v(null, null);
                }
            }
            a8 a8Var18 = this.G1;
            boolean z12 = (a8Var18 != null && a8Var18.v() && this.G1.t()) ? false : true;
            gc gcVar = this.V0;
            boolean z13 = gcVar.f15341f0;
            gcVar.f15341f0 = z12;
            gcVar.f15338e0.f(z12, true);
            gcVar.invalidate();
        } else {
            j10 = 0;
        }
        if (i10 == 2 || i9 == 2) {
            this.f16283l0.setVisibility(0);
            this.f16295p1.setVisibility(0);
            a8 a8Var19 = this.G1;
            if (a8Var19 != null && a8Var19.f14905b0) {
                this.f16283l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f16271h0.setVisibility(0);
            this.f16298q1.setVisibility(0);
        }
        if (i10 == 2) {
            this.f16283l0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i10 == 1) {
            this.J1 = false;
            a8 a8Var20 = this.G1;
            boolean z14 = (a8Var20 == null || a8Var20.J0 == j10) ? false : true;
            boolean z15 = a8Var20 != null && a8Var20.f14917g;
            if (z15) {
                i11 = R.string.Done;
            } else {
                i11 = z14 ? R.string.UploadBotPreview : R.string.Next;
            }
            String string = LocaleController.getString(i11);
            boolean z16 = !z14;
            k6 k6Var = this.X0;
            if (!TextUtils.equals(string, k6Var.d) || z16 != k6Var.f15523e) {
                k6Var.removeView(k6Var.f15522c);
                Context context = k6Var.getContext();
                k6Var.d = string;
                k6Var.f15523e = z16;
                j6 j6Var = new j6(k6Var, context, string, z16);
                k6Var.f15522c = j6Var;
                j6Var.setContentDescription(string);
                k6Var.addView(k6Var.f15522c, g7.e6.c(-2.0f, -2));
                k6Var.e();
            }
            this.f16295p1.setVisibility(8);
            this.f16298q1.setVisibility(8);
            if (!this.f16259d2) {
                a8 a8Var21 = this.G1;
                if (a8Var21 != null && a8Var21.f14943u) {
                    this.T0.l(a8Var21);
                } else {
                    this.T0.set(a8Var21);
                }
            }
            this.f16259d2 = false;
            this.Y0.f15632f.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i12).storyEntitiesAllowed() ? null : new v9(this, 19));
            this.Z0.setVisibility(this.D1 == null ? 8 : 0);
            ArrayList arrayList = this.D1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.F1;
                ArrayList arrayList3 = this.E1;
                na naVar = this.Z0;
                naVar.c(false, false);
                naVar.f15690c = arrayList;
                naVar.d = arrayList2;
                naVar.f15691e = arrayList3;
                naVar.f15696w = new nz0(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                naVar.G = new nz0(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                naVar.f15689b.U2.N(false);
                this.Z0.setSelected(this.D1.indexOf(this.G1));
            }
            this.V0.setMaxCount((z14 || z15 || this.D1 != null || ((a8Var6 = this.G1) != null && (a8Var6.v() || !this.G1.K))) ? 1 : 3);
            if (i9 != 2) {
                a8 a8Var22 = this.G1;
                if (a8Var22 != null && (a8Var22.f14907c || a8Var22.f14917g || this.f16297q0)) {
                    if (a8Var22.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    a8 a8Var23 = this.G1;
                    if (a8Var23.K && a8Var23.f14903a1 != null && (textureView = this.T0.getTextureView()) != null) {
                        textureView.setDelegate(new ea(this, 7));
                    }
                    this.Y0.setText(this.G1.C0);
                } else if (i9 != 2) {
                    mb mbVar2 = this.Y0;
                    mbVar2.R = true;
                    mbVar2.f15632f.setText("");
                }
            }
            a8 a8Var24 = this.G1;
            this.X0.d(4, a8Var24 == null || ((!a8Var24.f14943u || a8Var24.K) && !a8Var24.v()));
            this.X0.d(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (a8Var5 = this.G1) == null || a8Var5.f14943u || a8Var5.v()) ? false : true);
            if (!this.J1 && !this.Y0.o()) {
                ih.v6 storiesController = MessagesController.getInstance(i12).getStoriesController();
                int B = B();
                ih.p6 o6 = storiesController.o();
                if (o6 == null || !o6.a(storiesController.f12236a, B) || ((a8Var4 = this.G1) != null && (a8Var4.f14917g || a8Var4.J0 != j10))) {
                    z10 = true;
                    this.X0.setShareEnabled(z10);
                    a8 a8Var25 = this.G1;
                    this.f16255c1.setImageResource((a8Var25 == null && a8Var25.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
                    this.T0.setVisibility(0);
                    this.V0.setVisibility(0);
                    this.f16283l0.setVisibility(0);
                    this.f16283l0.setTranslationX(0.0f);
                    a8Var3 = this.G1;
                    if (a8Var3 == null && a8Var3.J0 != j10) {
                        this.f16283l0.l("", false);
                    } else if (a8Var3 == null && a8Var3.f14917g) {
                        this.f16283l0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (a8Var3 == null && a8Var3.f14943u) {
                        this.f16283l0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (a8Var3 == null && a8Var3.f14929n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(this.f16283l0, 32.0f, i12);
                        this.f16283l0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(f5Var, 0, 1, 33);
                        if (this.G1.f14935q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(this.G1.f14935q.user_id));
                            f5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.G1.f14935q)));
                            f5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f16283l0.l(spannableStringBuilder, false);
                    } else {
                        this.f16283l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z11 = true;
                }
            }
            z10 = false;
            this.X0.setShareEnabled(z10);
            a8 a8Var252 = this.G1;
            this.f16255c1.setImageResource((a8Var252 == null && a8Var252.Y) ? R.drawable.media_unmute : R.drawable.media_mute);
            this.T0.setVisibility(0);
            this.V0.setVisibility(0);
            this.f16283l0.setVisibility(0);
            this.f16283l0.setTranslationX(0.0f);
            a8Var3 = this.G1;
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            if (a8Var3 == null) {
            }
            this.f16283l0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z11 = true;
        }
        if (i9 == z11) {
            mb mbVar3 = this.Y0;
            x60 x60Var = mbVar3.R0;
            if (x60Var != null) {
                x60Var.u();
                mbVar3.R0 = null;
            }
            this.f16269g1.e(z11);
            na naVar2 = this.Z0;
            if (naVar2.I) {
                naVar2.c(false, z11);
            }
        }
        if (i10 == 2 && (a8Var2 = this.G1) != null) {
            if (a8Var2.f14913e0 < j10) {
                a8Var2.f14913e0 = j10;
            }
            this.I1 = a8Var2.f14913e0;
            long duration = this.T0.getDuration() < 100 ? this.G1.f14919h0 : this.T0.getDuration();
            a8 a8Var26 = this.G1;
            if (a8Var26.f14919h0 <= 0) {
                a8Var26.f14919h0 = duration;
            }
            File file = a8Var26.Z0;
            if (file == null) {
                file = a8Var26.L;
            }
            String absolutePath = file.getAbsolutePath();
            a8 a8Var27 = this.G1;
            this.f16295p1.o(false, absolutePath, a8Var27.f14919h0, a8Var27.P);
            a8 a8Var28 = this.G1;
            float f10 = (float) duration;
            long j11 = a8Var28.Z * f10;
            long j12 = a8Var28.f14902a0 * f10;
            gc gcVar2 = this.f16295p1;
            gcVar2.V0 = j11;
            gcVar2.W0 = j12;
            bc bcVar = gcVar2.h;
            if (bcVar != null) {
                bc.a(bcVar, true);
            }
            b8 b8Var = new b8(this, 1);
            this.f16295p1.setDelegate(new wa(b8Var));
            float max = (((float) this.I1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f16295p1.setVideoLeft(max);
            this.f16295p1.setVideoRight(0.04f + max);
            b8Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        oe0 oe0Var = this.f16327y1;
        if (oe0Var != null) {
            oe0Var.setAllowTouch(false);
        }
        x3 x3Var2 = this.f16275i1;
        boolean z17 = true;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        org.telegram.ui.Components.gc.e();
        mb mbVar4 = this.Y0;
        if (mbVar4 != null) {
            g gVar = mbVar4.f15632f;
            gVar.d();
            gVar.k(true);
            this.Y0.f15624a0 = true;
        }
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(8, i10 != 1);
        }
        ya yaVar = this.f16302r1;
        if (yaVar != null) {
            yaVar.setCoverPreview(i10 != 1);
        }
        x3 x3Var3 = this.f16278j1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        jb jbVar2 = this.f16318w0;
        jbVar2.setPreview((i10 == 1 && jbVar2.j()) ? false : false);
    }

    public final void P() {
        xf.a1 a1Var;
        int i9;
        if (this.f16250b0 == 0) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f16310t2 = new v9(this, 3);
            } else {
                Z(false);
            }
        }
        mb mbVar = this.Y0;
        if (mbVar != null) {
            mbVar.f15632f.s();
        }
        z6 z6Var = this.K0;
        if (z6Var != null) {
            z6Var.h();
        }
        l6 l6Var = this.f16281k1;
        if (l6Var != null) {
            ih.v6 storiesController = MessagesController.getInstance(l6Var.f15600a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f12242i.f(UserConfig.getInstance(storiesController.f12236a).clientUserId);
            if (peerStories != null) {
                i9 = peerStories.stories.size();
            } else {
                i9 = 0;
            }
            l6Var.f15601b = storiesController.f12237b.m() + i9 + 1;
            l6Var.f15602c.invalidate();
        }
        ya yaVar = this.f16302r1;
        if (yaVar != null && (a1Var = yaVar.K0.d) != null) {
            a1Var.postRunnable(a1Var.f49167w);
        }
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.f16253c).getStoriesController().f12255w;
        if (!b1Var.f14978c && !b1Var.d) {
            b1Var.d = true;
            y0 y0Var = new y0(b1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.f14976a);
            messagesStorage.getStorageQueue().postRunnable(new gh.u5((Object) messagesStorage, false, (Object) y0Var, 3));
        }
    }

    public final void Q(int i9, int i10) {
        boolean z10;
        ya yaVar;
        gb gbVar;
        hb hbVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ya yaVar2;
        if (i10 == 0) {
            this.f16277j0.setVisibility(8);
        }
        if (i9 == 0 && (yaVar2 = this.f16302r1) != null) {
            yaVar2.setVisibility(8);
        }
        if (i9 == -1) {
            this.Y0.setVisibility(8);
            if (i10 == 2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            this.f16255c1.setVisibility(i11);
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f16266f1.setVisibility(i12);
            if (i10 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f16248a1.setVisibility(i13);
            ImageView imageView = this.f16262e1;
            if (imageView != null) {
                if (i10 == 2) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                imageView.setVisibility(i15);
            }
            if (i10 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.V0.setVisibility(i14);
            this.f16283l0.setVisibility(8);
        }
        boolean z11 = true;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T0.setAllowCropping(z10);
        if ((i10 == 0 || i9 == 0) && (yaVar = this.f16302r1) != null) {
            yaVar.Z0.setLayerType(0, null);
        }
        oe0 oe0Var = this.f16327y1;
        if (oe0Var != null) {
            if (i10 != 1 && i10 != -1) {
                z11 = false;
            }
            oe0Var.setAllowTouch(z11);
        }
        if (i10 == 3) {
            gb gbVar2 = this.f16289n1;
            if (gbVar2 != null) {
                gbVar2.setAppearProgress(1.0f);
            }
        } else if (i9 == 3 && (gbVar = this.f16289n1) != null) {
            gbVar.setVisibility(8);
            this.f16289n1.setAppearProgress(0.0f);
            gb gbVar3 = this.f16289n1;
            gbVar3.f15502x = null;
            h0 h0Var = gbVar3.f15497f;
            h0Var.H = null;
            h0Var.d = null;
            h0Var.F = false;
            gbVar3.d.setVisibility(8);
            gbVar3.f15493a.setCropEditorDrawing(null);
        }
        if (i10 == 4) {
            hb hbVar2 = this.f16292o1;
            if (hbVar2 != null) {
                hbVar2.setAppearProgress(1.0f);
            }
        } else if (i9 == 4 && (hbVar = this.f16292o1) != null) {
            hbVar.setVisibility(8);
            this.f16292o1.setAppearProgress(0.0f);
            hb hbVar3 = this.f16292o1;
            hbVar3.f15721b = null;
            h0 h0Var2 = hbVar3.h;
            h0Var2.H = null;
            h0Var2.d = null;
            h0Var2.F = false;
            hbVar3.f15723e.setVisibility(8);
            hbVar3.setVisibility(8);
        }
    }

    public final void R(qb qbVar) {
        ih.p6 o6;
        vb vbVar;
        if (this.d) {
            return;
        }
        int i9 = this.f16253c;
        if (MessagesController.getInstance(i9).isFrozen()) {
            org.telegram.ui.b.b(i9);
            return;
        }
        int i10 = 0;
        this.f16297q0 = false;
        this.f16260e = false;
        this.f16324x2 = false;
        this.f16291o0.f15884g = false;
        WindowManager windowManager = this.f16264f;
        if (windowManager != null && (vbVar = this.f16287n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.f16287n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.f16287n, layoutParams);
            g0();
        }
        this.f16318w0.setCameraThumb(A());
        if (this.f16301r0 == 0 && (o6 = MessagesController.getInstance(i9).getStoriesController().o()) != null && o6.a(i9, 1)) {
            h0(o6, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.D;
        if (qbVar != null) {
            this.B = qbVar;
            this.F = qbVar.f15972a;
            rectF.set(qbVar.f15974c);
            this.C = qbVar.f15973b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16300r.c();
        int i11 = this.F;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f16257d0.setBackgroundColor(i10);
        this.f16300r.setTranslationX(0.0f);
        this.f16300r.setTranslationY(0.0f);
        this.f16300r.b(0.0f);
        this.f16300r.setScaleX(1.0f);
        this.f16300r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16249b, 1);
        g(1.0f, true, new v9(this, 6));
        e();
        this.f16301r0 = 0L;
        this.f16305s0 = "";
    }

    public final void S(pb pbVar, a8 a8Var, long j10) {
        int i9;
        vb vbVar;
        if (this.d) {
            return;
        }
        int i10 = this.f16253c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        this.f16297q0 = false;
        this.f16260e = false;
        this.f16324x2 = false;
        WindowManager windowManager = this.f16264f;
        if (windowManager != null && (vbVar = this.f16287n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.f16287n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.f16287n, layoutParams);
            g0();
        }
        this.G1 = a8Var;
        this.K1 = a8Var.K ? 1 : 0;
        this.f16291o0.f15884g = false;
        RectF rectF = this.D;
        if (pbVar != null) {
            this.B = pbVar;
            this.F = pbVar.f15972a;
            rectF.set(pbVar.f15974c);
            this.C = pbVar.f15973b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16300r.c();
        int i11 = this.F;
        int i12 = 1;
        if (i11 != 1 && i11 != 0) {
            i9 = -14737633;
        } else {
            i9 = 0;
        }
        this.f16257d0.setBackgroundColor(i9);
        this.f16300r.setTranslationX(0.0f);
        this.f16300r.setTranslationY(0.0f);
        this.f16300r.b(0.0f);
        this.f16300r.setScaleX(1.0f);
        this.f16300r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16249b, 1);
        a8 a8Var2 = this.G1;
        if (a8Var2 != null) {
            this.Y0.setText(a8Var2.C0);
        }
        L(new ma(this, 0), j10);
        if (this.G1.f14905b0) {
            i12 = 2;
        }
        K(i12, false);
        l0(-1, false, false);
        this.X0.b(false, false);
        e();
        this.f16301r0 = 0L;
        this.f16305s0 = "";
    }

    public final void T() {
        x60 x60Var;
        kb kbVar = this.T0;
        if (kbVar != null) {
            kbVar.x(4, true);
        }
        mb mbVar = this.Y0;
        if (mbVar != null && (x60Var = mbVar.R0) != null) {
            x60Var.u();
            mbVar.R0 = null;
        }
        zf.x0 x0Var = new zf.x0((org.telegram.ui.ActionBar.o2) new ab(this, 1), 14, false);
        x0Var.setOnDismissListener(new ja(this, 1));
        x0Var.show();
    }

    public final void U(pb pbVar, a8 a8Var) {
        int i9;
        boolean z10;
        int i10;
        ih.p6 o6;
        vb vbVar;
        if (this.d) {
            return;
        }
        int i11 = this.f16253c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f16297q0 = true;
        this.f16260e = false;
        this.f16324x2 = false;
        WindowManager windowManager = this.f16264f;
        if (windowManager != null && (vbVar = this.f16287n) != null && vbVar.getParent() == null) {
            vb vbVar2 = this.f16287n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, vbVar2, layoutParams);
            windowManager.addView(this.f16287n, layoutParams);
            g0();
        }
        this.G1 = a8Var;
        u9.a(i11, a8Var);
        a8 a8Var2 = this.G1;
        if (a8Var2 != null && a8Var2.K) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        this.K1 = i9;
        if (a8Var2 != null && a8Var2.f14943u && i9 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16291o0.f15884g = z10;
        if (this.f16301r0 == 0 && (o6 = MessagesController.getInstance(i11).getStoriesController().o()) != null && o6.a(i11, 1)) {
            h0(o6, true);
        }
        RectF rectF = this.D;
        if (pbVar != null) {
            this.B = pbVar;
            this.F = pbVar.f15972a;
            rectF.set(pbVar.f15974c);
            this.C = pbVar.f15973b;
            this.B.e();
        } else {
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        this.f16300r.c();
        int i12 = this.F;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f16257d0.setBackgroundColor(i10);
        this.f16300r.setTranslationX(0.0f);
        this.f16300r.setTranslationY(0.0f);
        this.f16300r.b(0.0f);
        this.f16300r.setScaleX(1.0f);
        this.f16300r.setScaleY(1.0f);
        this.G = 0.0f;
        AndroidUtilities.lockOrientation(this.f16249b, 1);
        a8 a8Var3 = this.G1;
        if (a8Var3 != null) {
            this.Y0.setText(a8Var3.C0);
        }
        this.X0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new v9(this, 6));
        e();
        this.f16301r0 = 0L;
        this.f16305s0 = "";
    }

    public final void V() {
        xf.c1 c1Var = this.f16306s1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f16309t1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f16312u1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f16315v1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f16319w1;
        if (view4 != null) {
            view4.bringToFront();
        }
        jc jcVar = this.l1;
        if (jcVar != null) {
            jcVar.bringToFront();
        }
        oe0 oe0Var = this.f16327y1;
        if (oe0Var != null) {
            oe0Var.bringToFront();
        }
        fe0 fe0Var = this.A1;
        if (fe0Var != null) {
            fe0Var.bringToFront();
        }
        he0 he0Var = this.B1;
        if (he0Var != null) {
            he0Var.bringToFront();
        }
        l6 l6Var = this.f16281k1;
        if (l6Var != null) {
            l6Var.bringToFront();
        }
        q qVar = this.f16285m1;
        if (qVar != null) {
            qVar.bringToFront();
        }
    }

    public final void W(a8 a8Var, boolean z10) {
        File file;
        View view;
        float f10;
        a8 a8Var2;
        boolean z11;
        int i9;
        if (a8Var != null && this.T0.getWidth() > 0 && this.T0.getHeight() > 0) {
            if (z10) {
                file = a8Var.O0;
            } else {
                file = a8Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.f16318w0.j()) {
                view = this.f16318w0;
            } else {
                view = this.T0;
            }
            if (z10) {
                f10 = 0.33333334f;
            } else {
                f10 = 1.0f;
            }
            int width = (int) (view.getWidth() * f10);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f10, f10);
            AndroidUtilities.makingGlobalBlurBitmap = true;
            view.draw(canvas);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            canvas.restore();
            Paint paint = new Paint(2);
            y51 textureView = this.T0.getTextureView();
            if (a8Var.K && !a8Var.f14943u && textureView != null) {
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            ya yaVar = this.f16302r1;
            if (yaVar != null && yaVar.N0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                ya yaVar2 = this.f16302r1;
                yaVar2.E0 = true;
                a6 a6Var = yaVar2.N0;
                a6Var.f49782a = true;
                a6Var.draw(canvas);
                ya yaVar3 = this.f16302r1;
                yaVar3.N0.f49782a = false;
                yaVar3.E0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w8 = a8.w(this.f16253c, "jpg");
            if (z10) {
                a8Var2 = a8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new bg.m(this, createBitmap, z11, w8, a8Var2, 2));
            } else {
                a8Var2 = a8Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i9 = 95;
                    } else {
                        i9 = 99;
                    }
                    createBitmap.compress(compressFormat, i9, new FileOutputStream(w8));
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            if (!z11) {
                a8Var2.N0 = w8;
            }
            a8Var2.f14906b1 = createScaledBitmap;
        }
    }

    public final void X() {
        ih.p6 o6;
        int size;
        char c10;
        View[] viewPages;
        s41[] s41VarArr;
        t9 t9Var = this.m0;
        BitmapDrawable bitmapDrawable = null;
        if (t9Var != null) {
            t9Var.dismiss();
            this.m0 = null;
        }
        if (this.J1) {
            v0 v0Var = this.f16248a1;
            v0Var.getClass();
            v0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            j6 j6Var = this.X0.f15522c;
            int i9 = -this.Q1;
            this.Q1 = i9;
            AndroidUtilities.shakeViewSpring(j6Var, i9);
            return;
        }
        mb mbVar = this.Y0;
        if (mbVar != null && mbVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.j6 j6Var2 = mbVar.v;
            int i10 = -this.Q1;
            this.Q1 = i10;
            AndroidUtilities.shakeViewSpring(j6Var2, i10);
            mbVar.e();
            return;
        }
        a8 a8Var = this.G1;
        int i11 = this.f16253c;
        if ((a8Var == null || (!a8Var.f14917g && a8Var.J0 == 0)) && (o6 = MessagesController.getInstance(i11).storiesController.o()) != null && o6.a(i11, B())) {
            h0(o6, false);
            return;
        }
        this.G1.D0 = MessagesController.getInstance(i11).storyEntitiesAllowed();
        ih.b bVar = this.f16246a;
        if (mbVar != null && !this.G1.D0) {
            CharSequence text = mbVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((wz0[]) spannable.getSpans(0, text.length(), wz0.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.oc(this.f16287n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.f6.f23061gc, 0, new v9(this, 27), bVar)).k(true);
                    int i12 = -this.Q1;
                    this.Q1 = i12;
                    AndroidUtilities.shakeViewSpring(mbVar, i12);
                    return;
                }
            }
        }
        a8 a8Var2 = this.G1;
        if (!a8Var2.f14917g && a8Var2.J0 == 0) {
            if (this.J != 0) {
                a8Var2.f14945v0 = MessagesController.getInstance(i11).getInputPeer(this.J);
            }
            kb kbVar = this.T0;
            kbVar.x(3, true);
            t9 t9Var2 = new t9(this.f16249b, this.G1.I0, bVar);
            t9Var2.q1(this.G1.E0);
            t9Var2.p1(this.G1.f14945v0);
            t9Var2.B = this.I;
            t9Var2.Q = new w9(this, 14);
            t9Var2.e1(!this.f16318w0.j());
            ArrayList arrayList = this.E1;
            if (arrayList == null) {
                size = this.G1.r();
            } else {
                size = arrayList.size();
            }
            t9Var2.m1(size);
            t9Var2.k1(false);
            CharSequence text2 = mbVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (s41 s41Var : (s41[]) ((Spanned) text2).getSpans(0, text2.length(), s41.class)) {
                    if (s41Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(Long.parseLong(s41Var.getURL())));
                            if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                                arrayList2.add(UserObject.getPublicUsername(user));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i13 = -1;
                for (int i14 = 0; i14 < text2.length(); i14++) {
                    char charAt = text2.charAt(i14);
                    if (charAt == '@') {
                        i13 = i14 + 1;
                    } else if (charAt == ' ') {
                        if (i13 != -1) {
                            String charSequence = text2.subSequence(i13, i14).toString();
                            TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(charSequence);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f22527id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i13 = -1;
                    }
                }
                c10 = 1;
                if (i13 != -1) {
                    String charSequence2 = text2.subSequence(i13, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i11).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f22527id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            t9Var2.O = arrayList2;
            t9Var2.S = new w9(this, 15);
            t9Var2.T = new w9(this, 16);
            t9Var2.P = new ea(this, 10);
            this.m0 = t9Var2;
            a8 a8Var3 = this.G1;
            if (a8Var3.K) {
                if (kbVar != null && !a8Var3.f14916f0 && this.f16250b0 != 2) {
                    a8Var3.f14913e0 = kbVar.getCurrentPosition();
                    Utilities.Callback w9Var = new w9(this, 17);
                    View view = this.f16306s1;
                    View view2 = this.f16315v1;
                    View[] viewArr = new View[3];
                    viewArr[0] = kbVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    kbVar.h(w9Var, viewArr);
                }
                t9 t9Var3 = this.m0;
                Bitmap bitmap = this.G1.f14918g0;
                v9 v9Var = new v9(this, 20);
                if (bitmap != null) {
                    t9Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                t9Var3.X = bitmapDrawable;
                t9Var3.Y = v9Var;
                j1 j1Var = t9Var3.f16097b;
                if (j1Var != null) {
                    for (View view3 : j1Var.getViewPages()) {
                        if (view3 instanceof n9) {
                            n9 n9Var = (n9) view3;
                            n9Var.g(false);
                            n9Var.e(false);
                        }
                    }
                }
            }
            this.m0.setOnDismissListener(new ja(this, 0));
            this.m0.show();
            return;
        }
        a8Var2.f14926l = false;
        i(null);
        p0();
    }

    public final void Y(rb rbVar) {
        int i9 = 0;
        RectF rectF = this.D;
        if (rbVar != null) {
            this.B = rbVar;
            this.F = rbVar.f15972a;
            rectF.set(rbVar.f15974c);
            this.C = rbVar.f15973b;
        } else {
            this.B = null;
            this.F = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.C = AndroidUtilities.dp(8.0f);
        }
        int i10 = this.F;
        if (i10 != 1 && i10 != 0) {
            i9 = -14737633;
        }
        this.f16257d0.setBackgroundColor(i9);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f16307s2 || z10) {
            this.f16293o2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f16249b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f16293o2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    fq fqVar = new fq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    fqVar.f28545e = dp;
                    fqVar.f28546f = dp2;
                    this.f16318w0.setCameraThumb(fqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f16246a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                        alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ea(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f22702a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f16307s2 = true;
                }
            }
            if (!this.f16293o2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new v9(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        za zaVar = this.f16322x0;
        if (zaVar != null && zaVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new ih.h3(this, this.f16322x0.getTextureView().getBitmap(), runnable, 18));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        float f10 = 0.0f;
        int i9 = 0;
        if (z11) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z10) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setUpdateListener(new xa(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 2)).setDuration(320L).setInterpolator(gr.h).start();
            return;
        }
        view.animate().cancel();
        if (!z10) {
            i9 = 8;
        }
        view.setVisibility(i9);
        if (z10) {
            f10 = 1.0f;
        }
        view.setAlpha(f10);
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
            this.f16264f.updateViewLayout(this.f16287n, layoutParams);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ih.p6 o6;
        a8 a8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i9 == NotificationCenter.albumsDidLoad) {
            z6 z6Var = this.K0;
            if (z6Var != null) {
                z6Var.h();
            }
            if (this.f16276i2 != null && MediaController.allMediaAlbums != null) {
                for (int i11 = 0; i11 < MediaController.allMediaAlbums.size(); i11++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i11);
                    int i12 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f16276i2;
                    if (i12 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f16276i2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i9 == NotificationCenter.storiesDraftsUpdated) {
            z6 z6Var2 = this.K0;
            if (z6Var2 != null && !this.R1) {
                z6Var2.h();
            }
        } else if (i9 == NotificationCenter.storiesLimitUpdate) {
            int i13 = this.f16250b0;
            int i14 = this.f16253c;
            if (i13 == 1) {
                if (!this.J1 && !this.Y0.o()) {
                    ih.v6 storiesController = MessagesController.getInstance(i14).getStoriesController();
                    int B = B();
                    ih.p6 o9 = storiesController.o();
                    if (o9 == null || !o9.a(storiesController.f12236a, B) || ((a8Var = this.G1) != null && (a8Var.f14917g || a8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.X0.setShareEnabled(z10);
            } else if (i13 == 0 && (o6 = MessagesController.getInstance(i14).getStoriesController().o()) != null && o6.a(i14, 1)) {
                a8 a8Var2 = this.G1;
                if (a8Var2 == null || a8Var2.J0 == 0) {
                    h0(o6, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i9 = this.f16253c;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i9;
        this.A0.clearAnimation();
        za zaVar = this.f16322x0;
        if ((zaVar != null && zaVar.isDual()) || this.W1) {
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
                    i9 = R.drawable.media_photo_flash_auto2;
                    this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                }
            } else {
                str.equals("off");
            }
            i9 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i9 = R.drawable.media_photo_flash_on2;
                this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i9 = R.drawable.media_photo_flash_off2;
            this.A0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        hc hcVar = this.A0;
        if (hcVar.f15408n != i9) {
            hcVar.f15408n = i9;
            ValueAnimator valueAnimator = hcVar.f15409r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                hcVar.f15409r = null;
            }
            hcVar.setDrawable(i9);
        }
        if (this.f16250b0 == 0 && !this.E0.f16418e && this.U1 != null && !I()) {
            z10 = true;
        }
        c0(this.A0, z10, true);
    }

    public final void f(boolean z10) {
        float height;
        boolean z11;
        int i9;
        w0 w0Var;
        this.G0 = z10;
        Boolean bool = this.f16284l2;
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
                this.f16286m2 = new fa(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f16279j2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f16279j2 = null;
            }
            o1.j jVar = this.f16282k2;
            if (jVar != null) {
                jVar.c();
                this.f16282k2 = null;
            }
            if (this.I0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.I0 == null) {
                    return;
                }
            }
            va vaVar = this.I0;
            if (vaVar != null) {
                vaVar.G = false;
            }
            if (z10 && (w0Var = this.J0) != null) {
                w0Var.a(false);
            }
            int i10 = 4;
            ob obVar = this.f16300r;
            if (obVar != null) {
                if (z10) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
                obVar.setImportantForAccessibility(i9);
            }
            va vaVar2 = this.I0;
            if (z10) {
                i10 = 0;
            }
            vaVar2.setImportantForAccessibility(i10);
            this.f16284l2 = Boolean.valueOf(z10);
            float translationY = this.I0.getTranslationY();
            vb vbVar = this.f16287n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (vbVar.getHeight() - this.I0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, vbVar.getHeight());
            va vaVar3 = this.I0;
            vaVar3.G = !z10;
            if (this.f16267f2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f16270g2 = z11;
            if (z10) {
                o1.j jVar2 = new o1.j(vaVar3, o1.h.f18783n, height);
                this.f16282k2 = jVar2;
                jVar2.f18800u.a(0.75f);
                this.f16282k2.f18800u.b(350.0f);
                this.f16282k2.a(new ga(this, height, 0));
                this.f16282k2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f16279j2 = ofFloat;
                ofFloat.addUpdateListener(new ha(this, 0));
                this.f16279j2.addListener(new ua(this, 1));
                this.f16279j2.setDuration(450L);
                this.f16279j2.setInterpolator(gr.h);
                this.f16279j2.start();
            }
            if (!z10 && !this.O1) {
                this.f16273h2 = null;
            }
            if (!z10 && this.f16250b0 == 0 && !this.f16293o2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f16251b1 == null) {
            mi0 mi0Var = new mi0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f16251b1 = mi0Var;
            mi0Var.B *= 1.5f;
        }
        this.f16255c1.setAnimation(this.f16251b1);
        int i9 = 20;
        if (!z11) {
            mi0 mi0Var2 = this.f16251b1;
            if (!z10) {
                i9 = 0;
            }
            mi0Var2.L(i9, false, false);
        } else if (z10) {
            mi0 mi0Var3 = this.f16251b1;
            if (mi0Var3.X > 20) {
                mi0Var3.L(0, false, false);
            }
            this.f16251b1.N(20);
            this.f16251b1.start();
        } else {
            mi0 mi0Var4 = this.f16251b1;
            int i10 = mi0Var4.X;
            if (i10 != 0 && i10 < 43) {
                mi0Var4.N(43);
                this.f16251b1.start();
            }
        }
    }

    public final void g(float f10, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A = null;
        }
        ob obVar = this.f16300r;
        if (z10) {
            this.L.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.H = Float.valueOf(this.G);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new ha(this, 5));
            this.A.addListener(new gh.o5(this, f10, runnable, 3));
            if (f10 < 1.0f && this.v) {
                this.A.setDuration(250L);
                this.A.setInterpolator(gr.h);
            } else if (f10 <= 0.0f && obVar.f15805a >= AndroidUtilities.dp(20.0f)) {
                if (f10 < 0.0f && this.K) {
                    this.A.setDuration(200L);
                    this.A.setInterpolator(gr.h);
                    this.K = false;
                } else {
                    this.A.setDuration(400L);
                    this.A.setInterpolator(gr.h);
                }
            } else {
                this.A.setDuration(300L);
                this.A.setInterpolator(new u1.a());
            }
            this.A.start();
            return;
        }
        this.H = null;
        this.E = f10;
        k();
        obVar.invalidate();
        this.f16287n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f16287n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 3));
    }

    public final void h(boolean z10, boolean z11) {
        float f10;
        float dp;
        float dp2;
        float f11;
        float dp3;
        float dp4;
        z zVar;
        if (z10) {
            x3 x3Var = this.f16272h1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            x3 x3Var2 = this.f16275i1;
            if (x3Var2 != null) {
                x3Var2.e(true);
            }
            x3 x3Var3 = this.f16269g1;
            if (x3Var3 != null) {
                x3Var3.e(true);
            }
            x3 x3Var4 = this.S0;
            if (x3Var4 != null) {
                x3Var4.e(true);
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
        if (z10 && (zVar = this.E0) != null && zVar.f16418e) {
            zVar.a(false, z11);
        }
        m0(z11);
        oa oaVar = this.M0;
        v3 v3Var = this.Q0;
        v3 v3Var2 = this.P0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.V1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f16250b0 == 0 && !I()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f16250b0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(v3Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(v3Var, property, (!z10 && this.f16250b0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f16250b0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v3Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(oaVar, property, (z10 || this.f16250b0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f16250b0 != 0 || I()) {
                f14 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(oaVar, property2, f14));
            this.V1.setDuration(260L);
            this.V1.setInterpolator(gr.h);
            this.V1.start();
            return;
        }
        if (z10 && this.f16250b0 == 0 && !I()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v3Var2.setAlpha(f10);
        if (z10 && this.f16250b0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        v3Var2.setTranslationY(dp);
        v3Var.setAlpha((!z10 && this.f16250b0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f16250b0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        v3Var.setTranslationY(dp2);
        oaVar.setAlpha((z10 || this.f16250b0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f16250b0 != 0 || I()) {
            f14 = AndroidUtilities.dp(16.0f);
        }
        oaVar.setTranslationY(f14);
    }

    public final void h0(ih.p6 p6Var, boolean z10) {
        if (this.f16316v2) {
            return;
        }
        zf.j0 j0Var = new zf.j0(p6Var.b(), this.f16253c, this.f16249b, new ab(this, 0), null);
        j0Var.T = B();
        j0Var.setOnDismissListener(new l70(2, this, z10));
        this.T0.x(7, true);
        this.f16316v2 = true;
        j0Var.show();
    }

    public final void i(Runnable runnable) {
        a8 a8Var;
        Runnable runnable2;
        kb kbVar;
        float f10;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        qe0 qe0Var = this.f16323x1;
        if (qe0Var != null && (a8Var = this.G1) != null) {
            a8Var.f14922j = qe0Var.d() | a8Var.f14922j;
            a8 a8Var2 = this.G1;
            qe0 qe0Var2 = this.f16323x1;
            File file = a8Var2.Z0;
            if (file != null) {
                file.delete();
                a8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = qe0Var2.getSavedFilterState();
            a8Var2.f14903a1 = savedFilterState;
            if (!a8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = qe0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i9 = a8Var2.R;
                        float f11 = 1.0f;
                        if (i9 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i9 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, a8Var2.f14925k0 / 2.0f, a8Var2.f14927l0 / 2.0f);
                        matrix.postRotate(-a8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        a8Var2.f14930n0.preScale(a8Var2.f14925k0 / createBitmap.getWidth(), a8Var2.f14927l0 / createBitmap.getHeight());
                        a8Var2.f14925k0 = createBitmap.getWidth();
                        a8Var2.f14927l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = a8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            a8Var2.Z0.delete();
                        }
                        String k10 = a8.k(a8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i10 = a8Var2.f14901a;
                        if (!z10) {
                            str = "jpg";
                        }
                        a8Var2.Z0 = a8.w(i10, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(a8Var2.Z0);
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
                            Utilities.themeQueue.postRunnable(new bg.d(a8Var2, createBitmap, z10, runnable2, 4));
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
                a8 a8Var3 = this.G1;
                if (!a8Var3.K && (kbVar = this.T0) != null) {
                    kbVar.set(a8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.Z1 != z10) {
            this.Z1 = z10;
            float f10 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.F0.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(gr.h).withEndAction(new fa(this, z10, 1)).start();
                return;
            }
            this.F0.clearAnimation();
            if (z10) {
                f10 = 1.0f;
            }
            this.F0.setAlpha(f10);
            if (!z10) {
                this.F0.b(false, false);
            }
        }
    }

    public final void j() {
        if (this.G1 != null && this.f16330z1 != null && this.f16257d0.getMeasuredWidth() > 0 && this.f16257d0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i9 = this.G1.Q;
            if (i9 != 0) {
                matrix.postRotate(-i9, this.f16257d0.getMeasuredWidth() / 2.0f, this.f16257d0.getMeasuredHeight() / 2.0f);
                if ((this.G1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f16257d0.getMeasuredWidth() / this.f16257d0.getMeasuredHeight(), this.f16257d0.getMeasuredHeight() / this.f16257d0.getMeasuredWidth(), this.f16257d0.getMeasuredWidth() / 2.0f, this.f16257d0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f16257d0.getMeasuredWidth()) * this.G1.f14925k0, (1.0f / this.f16257d0.getMeasuredHeight()) * this.G1.f14927l0);
            matrix.postConcat(this.G1.f14930n0);
            matrix.postScale(this.f16257d0.getMeasuredWidth() / this.G1.f14921i0, this.f16257d0.getMeasuredHeight() / this.G1.f14923j0);
            this.f16330z1.setTransform(matrix);
            this.f16330z1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f10;
        i81 i81Var = this.R0;
        if ((i81Var.getTag() != null && z10) || (i81Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.a2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                v9 v9Var = new v9(this, 25);
                this.a2 = v9Var;
                AndroidUtilities.runOnUIThread(v9Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f16252b2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        i81Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f16252b2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            i81Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f16252b2;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(i81Var, property, f10));
        this.f16252b2.addListener(new hg.b0(14, this, z10));
        this.f16252b2.start();
        if (z10) {
            v9 v9Var2 = new v9(this, 26);
            this.a2 = v9Var2;
            AndroidUtilities.runOnUIThread(v9Var2, 2000L);
        }
    }

    public final void k() {
        ih.l3 l3Var;
        if (this.F == 1) {
            RectF rectF = this.Z;
            rectF.set(this.f16257d0.getLeft(), this.f16257d0.getTop(), this.f16257d0.getMeasuredWidth(), this.f16257d0.getMeasuredHeight());
            rectF.offset(this.f16300r.getX(), this.f16300r.getY());
            float f10 = this.E;
            RectF rectF2 = this.D;
            RectF rectF3 = this.Y;
            AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
            this.f16257d0.setAlpha(this.E);
            float f11 = rectF3.left;
            ib ibVar = this.f16257d0;
            ibVar.setTranslationX((f11 - ibVar.getLeft()) - this.f16300r.getX());
            float f12 = rectF3.top;
            ib ibVar2 = this.f16257d0;
            ibVar2.setTranslationY((f12 - ibVar2.getTop()) - this.f16300r.getY());
            rb rbVar = this.B;
            if (rbVar != null && (l3Var = rbVar.f15976f) != null) {
                l3Var.setTranslationX((rectF.left - rectF2.left) * this.E);
                this.B.f15976f.setTranslationY((rectF.top - rectF2.top) * this.E);
            }
            this.f16257d0.setScaleX(rectF3.width() / this.f16257d0.getMeasuredWidth());
            this.f16257d0.setScaleY(rectF3.height() / this.f16257d0.getMeasuredHeight());
            this.f16261e0.setAlpha(this.E);
            this.f16268g0.setAlpha(this.E);
            this.f16271h0.setAlpha(this.E);
            if (this.f16250b0 == 2) {
                this.f16298q1.setAlpha(this.E);
            }
        }
    }

    public final void k0() {
        t9 t9Var = this.m0;
        if (t9Var != null) {
            t9Var.dismiss();
            this.m0 = null;
        }
        t9 t9Var2 = new t9(this.f16249b, 86400, this.f16246a);
        t9Var2.o1();
        t9Var2.q1(this.f16311u0);
        TLRPC.InputPeer inputPeer = this.f16308t0;
        if (inputPeer == null) {
            if (this.J != 0) {
                inputPeer = MessagesController.getInstance(this.f16253c).getInputPeer(this.J);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        t9Var2.p1(inputPeer);
        t9Var2.B = this.I;
        t9Var2.Q = new w9(this, 18);
        t9Var2.e1(false);
        t9Var2.m1(1);
        t9Var2.k1(false);
        t9Var2.S = new w9(this, 19);
        t9Var2.P = new ea(this, 12);
        this.m0 = t9Var2;
        t9Var2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: kh.wb.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: kh.wb.l0(int, boolean, boolean):void");
    }

    public final void m() {
        a8 a8Var;
        boolean z10;
        if (this.f16302r1 != null && (a8Var = this.G1) != null && a8Var.f14943u) {
            File file = a8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                this.G1.W0 = null;
            }
            this.G1.W0 = a8.w(this.f16253c, "webp");
            ya yaVar = this.f16302r1;
            a8 a8Var2 = this.G1;
            ArrayList arrayList = a8Var2.T0;
            if (this.K1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = yaVar.t0(arrayList, false, false, true, z10, a8Var2);
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
            } catch (Throwable th) {
                if (t02 != null && !t02.isRecycled()) {
                    t02.recycle();
                }
                throw th;
            }
        }
    }

    public final void m0(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f10;
        boolean z16;
        za zaVar;
        boolean z17 = false;
        if (this.f16250b0 == 0 && this.K1 == 1 && !this.E0.f16418e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.C0.setSelected(this.f16318w0.j());
        z zVar = this.E0;
        if (zVar != null && zVar.f16418e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f16277j0, z12, z10);
        if (!this.W1 && this.K1 != -1 && this.f16250b0 == 0 && this.U1 != null && !this.E0.f16418e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.A0, z13, z10);
        if (!this.W1 && this.K1 != -1 && this.f16250b0 == 0 && (zaVar = this.f16322x0) != null && zaVar.f15079a && !this.E0.f16418e && !this.f16318w0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.B0, z14, z10);
        if (!this.W1 && this.K1 != -1 && this.f16250b0 == 0 && !this.E0.f16418e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.C0, z15, z10);
        c0(this.D0, this.E0.f16418e, z10);
        if (this.f16318w0.j()) {
            f10 = this.f16318w0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.K0.e(f10, z10);
        boolean z18 = this.E0.f16418e;
        x3 x3Var = this.f16278j1;
        if (z18) {
            x3Var.v();
        } else {
            x3Var.e(true);
        }
        h(this.W1, z10);
        if (this.K1 == -1 && this.f16250b0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.O0, z16);
        if (this.K1 == -1 && this.f16250b0 == 0) {
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
        this.f16277j0.setTranslationX(0.0f);
        float alpha5 = this.f16277j0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        w wVar = this.E0.f16415a;
        wVar.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        wVar.invalidate();
    }

    public final void o() {
        boolean z10;
        if (this.G == 0.0f && this.E >= 1.0f && !this.f16324x2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.f16320w2) {
            return;
        }
        ff.t0 t0Var = this.f16325y;
        if (t0Var != null) {
            t0Var.a(!z10);
        }
        this.f16320w2 = z10;
    }

    public final void o0(boolean z10) {
        int i9;
        mi0 mi0Var = this.f16258d1;
        if (mi0Var != null) {
            int[] iArr = mi0Var.f30847e;
            int i10 = 0;
            if (z10) {
                a8 a8Var = this.G1;
                if (a8Var != null && a8Var.f14951y0) {
                    i10 = iArr[0];
                }
                mi0Var.N(i10);
                mi0 mi0Var2 = this.f16258d1;
                if (mi0Var2 != null) {
                    mi0Var2.start();
                    return;
                }
                return;
            }
            a8 a8Var2 = this.G1;
            if (a8Var2 != null && a8Var2.f14951y0) {
                i9 = iArr[0] - 1;
            } else {
                i9 = 0;
            }
            mi0Var.L(i9, false, true);
            this.f16258d1.N(i9);
            ImageView imageView = this.f16262e1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f16296p2 < 0) {
            this.f16296p2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f16299q2 = arrayList;
            arrayList.add("off");
            this.f16299q2.add("auto");
            this.f16299q2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            s2 s2Var = this.f16304s;
            s2Var.f16021o = f10;
            s2Var.f16020n = s2.f(f10);
            s2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            s2 s2Var2 = this.f16304s;
            s2Var2.f16022p = f11;
            s2Var2.i();
        }
    }

    public final void p0() {
        if (this.S1) {
            return;
        }
        this.S1 = true;
        v9 v9Var = new v9(this, 2);
        ya yaVar = this.f16302r1;
        a8 a8Var = this.G1;
        if (yaVar != null && a8Var != null) {
            a8Var.f();
            boolean u02 = yaVar.u0();
            boolean z10 = yaVar.K0.getPainting().E;
            Utilities.searchQueue.postRunnable(new y9(this, yaVar, a8Var.f14921i0, a8Var.f14923j0, a8Var, z10, u02, v9Var, 1));
            return;
        }
        v9Var.run();
    }

    public final void q(boolean z10) {
        kb kbVar;
        if (this.d) {
            t9 t9Var = this.m0;
            if (t9Var != null) {
                t9Var.dismiss();
                this.m0 = null;
            }
            a8 a8Var = this.G1;
            long j10 = 0;
            if (a8Var != null && !a8Var.h) {
                if ((this.v && a8Var.f14917g) || a8Var.f14904b != 0) {
                    a8Var.f14922j = false;
                }
                a8Var.i(false);
            }
            this.G1 = null;
            Utilities.Callback4 callback4 = this.N;
            if (callback4 != null && (kbVar = this.T0) != null) {
                if (this.f16260e) {
                    return;
                }
                this.f16260e = true;
                k61 k61Var = kbVar.f15961y;
                if (k61Var != null) {
                    k61Var.C();
                    kbVar.f15961y.I();
                    kbVar.f15961y = null;
                }
                k61 k61Var2 = kbVar.f15960x;
                if (k61Var2 != null) {
                    j10 = k61Var2.o();
                    kbVar.f15960x.C();
                    kbVar.f15960x.I();
                    kbVar.f15960x = null;
                }
                k61 k61Var3 = kbVar.f15936e;
                if (k61Var3 != null) {
                    j10 = k61Var3.o();
                    kbVar.f15936e.C();
                    kbVar.f15936e.I();
                    kbVar.f15936e = null;
                }
                callback4.run(Long.valueOf(j10), new fa(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f16317w));
                return;
            }
            kb kbVar2 = this.T0;
            if (kbVar2 != null && !z10) {
                kbVar2.set(null);
            }
            g(0.0f, z10, new v9(this, 23));
            int i9 = this.F;
            if (i9 == 1 || i9 == 0) {
                this.f16287n.setBackgroundColor(0);
                this.X0.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i10 = this.f16253c;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        za zaVar;
        if ((this.L1 || this.M1) && (zaVar = this.f16322x0) != null && zaVar.isFrontface()) {
            int i9 = this.f16296p2;
            if (i9 == 2 || (i9 == 1 && this.Y1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f16249b;
        if (this.f16322x0 == null && activity != null) {
            this.f16322x0 = new za(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            z6 z6Var = this.K0;
            float f10 = 0.0f;
            if (z6Var != null) {
                z6Var.f16433c0 = 0.0f;
                z6Var.f16434d0.d(0.0f, true);
            }
            this.f16322x0.recordHevc = !this.f16318w0.j();
            this.f16322x0.setThumbDrawable(A());
            this.f16322x0.initTexture();
            this.f16322x0.setDelegate(new ea(this, 0));
            ic icVar = this.B0;
            if (this.f16322x0.f15079a && this.f16250b0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(icVar, z10, true);
            a0 a0Var = this.C0;
            if (!this.f16322x0.f15079a) {
                f10 = AndroidUtilities.dp(46.0f);
            }
            a0Var.setTranslationX(f10);
            this.f16318w0.setCameraView(this.f16322x0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.S0.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!d1.q(this.f16322x0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.f16322x0.f15079a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.f16272h1.v();
            }
            if (this.f16326y0 == null) {
                this.f16326y0 = new v6(activity, new w9(this, 3));
            }
            this.f16326y0.a(this.f16322x0);
            k7 k7Var = this.f16329z0;
            if (k7Var != null) {
                jb jbVar = this.f16318w0;
                Object blurRenderNode = jbVar.getBlurRenderNode();
                k7Var.B = jbVar;
                k7Var.C = blurRenderNode;
                k7Var.invalidate();
            }
        }
    }

    public final void s() {
        a8 a8Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.f16323x1 == null && (a8Var = this.G1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!a8Var.K) {
                if (a8Var.Z0 == null) {
                    q10 = this.T0.getPhotoBitmap();
                } else {
                    ea eaVar = new ea(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q10 = a8.q(eaVar, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.G1.K) {
                y51 textureView = this.T0.getTextureView();
                int orientation = this.T0.getOrientation();
                a8 a8Var2 = this.G1;
                if (a8Var2 != null) {
                    savedFilterState = a8Var2.f14903a1;
                }
                qe0 qe0Var = new qe0(this.f16249b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f16288n0, this.f16246a);
                this.f16323x1 = qe0Var;
                this.f16300r.addView(qe0Var);
                oe0 oe0Var = this.f16327y1;
                if (oe0Var != null) {
                    oe0Var.setFilterView(this.f16323x1);
                }
                TextureView myTextureView = this.f16323x1.getMyTextureView();
                this.f16330z1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.T0.o(this.f16330z1, this.f16323x1);
                TextureView textureView2 = this.f16330z1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.f16330z1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                fe0 blurControl = this.f16323x1.getBlurControl();
                this.A1 = blurControl;
                if (blurControl != null) {
                    this.f16257d0.addView(blurControl);
                }
                he0 curveControl = this.f16323x1.getCurveControl();
                this.B1 = curveControl;
                if (curveControl != null) {
                    this.f16257d0.addView(curveControl);
                }
                V();
                this.f16323x1.getDoneTextView().setOnClickListener(new x9(this, 13));
                this.f16323x1.getCancelTextView().setOnClickListener(new x9(this, 14));
                this.f16323x1.getToolsView().setVisibility(8);
                this.f16323x1.getToolsView().setAlpha(0.0f);
                this.f16323x1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.f16323x1.f31898e0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.I0 != null) {
            jb jbVar = this.f16318w0;
            if (jbVar != null && jbVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.I0.L) {
                return;
            }
        }
        if (this.f16249b == null) {
            return;
        }
        if (this.I0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f16276i2;
        boolean z13 = !z10;
        jb jbVar2 = this.f16318w0;
        if (jbVar2 != null && jbVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        va vaVar = new va(this, this.f16253c, this.f16249b, this.f16246a, albumEntry, z10, z13, z11);
        this.I0 = vaVar;
        vaVar.C.setVisibility(8);
        this.I0.setMultipleOnClick(this.f16318w0.j());
        this.I0.setMaxCount(Math.min(10, u.b() - this.f16318w0.getFilledCount()));
        this.I0.setOnBackClickListener(new ma(this, 1));
        this.I0.setOnSelectListener(new la(z10, this, 0));
        this.I0.setOnSelectMultipleListener(new gh.q1(this, 2));
        f2.l0 l0Var = this.f16273h2;
        if (l0Var != null) {
            a3 a3Var = this.I0.f15865e;
            a3Var.B = l0Var;
            a3Var.l0();
        }
        this.f16287n.addView(this.I0, g7.e6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: kh.wb.u():void");
    }

    public final void v(boolean z10) {
        v6 v6Var = this.f16326y0;
        if (v6Var != null) {
            v6Var.f16201f = null;
            Utilities.globalQueue.cancelRunnable(v6Var.h);
            this.f16326y0 = null;
            jb jbVar = this.f16318w0;
            if (jbVar != null) {
                jbVar.f15198c.a(null);
            }
        }
        k7 k7Var = this.f16329z0;
        if (k7Var != null) {
            k7Var.B = null;
            k7Var.C = null;
            k7Var.invalidate();
        }
        if (this.f16322x0 != null) {
            if (z10) {
                b0(new v9(this, 8));
                return;
            }
            b0(new v9(this, 9));
            this.f16322x0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f16322x0);
            jb jbVar2 = this.f16318w0;
            if (jbVar2 != null) {
                jbVar2.setCameraView(null);
            }
            this.f16322x0 = null;
        }
    }

    public final void w() {
        va vaVar = this.I0;
        if (vaVar == null) {
            return;
        }
        this.f16287n.removeView(vaVar);
        this.I0 = null;
        ValueAnimator valueAnimator = this.f16279j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16279j2 = null;
        }
        o1.j jVar = this.f16282k2;
        if (jVar != null) {
            jVar.c();
            this.f16282k2 = null;
        }
        this.f16284l2 = null;
    }

    public final void y() {
        qe0 qe0Var = this.f16323x1;
        if (qe0Var == null) {
            return;
        }
        qe0Var.e();
        this.f16327y1.setFilterView(null);
        this.f16300r.removeView(this.f16323x1);
        TextureView textureView = this.f16330z1;
        if (textureView != null) {
            this.f16257d0.removeView(textureView);
            this.f16330z1 = null;
        }
        this.T0.o(null, null);
        fe0 fe0Var = this.A1;
        if (fe0Var != null) {
            this.f16257d0.removeView(fe0Var);
            this.A1 = null;
        }
        he0 he0Var = this.B1;
        if (he0Var != null) {
            this.f16257d0.removeView(he0Var);
            this.B1 = null;
        }
        this.f16323x1 = null;
    }

    public final void z() {
        ya yaVar = this.f16302r1;
        if (yaVar != null) {
            yaVar.N0.removeAllViews();
            ya yaVar2 = this.f16302r1;
            yaVar2.K0.h();
            yaVar2.N0.setVisibility(8);
            yaVar2.M0.setVisibility(8);
            yaVar2.A0.postRunnable(new bg.d2(15));
            p5 p5Var = yaVar2.f15280g2;
            if (p5Var != null) {
                p5Var.dismiss();
            }
            xf.x xVar = yaVar2.P1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f16300r.removeView(this.f16302r1);
            this.f16302r1 = null;
            xf.c1 c1Var = this.f16306s1;
            if (c1Var != null) {
                this.f16257d0.removeView(c1Var);
                this.f16306s1 = null;
            }
            View view = this.f16312u1;
            if (view != null) {
                this.f16257d0.removeView(view);
                this.f16312u1 = null;
            }
            View view2 = this.f16309t1;
            if (view2 != null) {
                this.f16257d0.removeView(view2);
                this.f16309t1 = null;
            }
            View view3 = this.f16315v1;
            if (view3 != null) {
                this.f16257d0.removeView(view3);
                this.f16315v1 = null;
            }
            View view4 = this.f16319w1;
            if (view4 != null) {
                this.f16257d0.removeView(view4);
                this.f16319w1 = null;
            }
        }
    }
}
