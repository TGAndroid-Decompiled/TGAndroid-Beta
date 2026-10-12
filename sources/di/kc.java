package di;

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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xf0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zf0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb0;
public final class kc implements NotificationCenter.NotificationCenterDelegate {
    public static kc F2;
    public final xb A0;
    public View A1;
    public boolean A2;
    public nb B0;
    public ig0 B1;
    public boolean B2;
    public e7 C0;
    public final gg0 C1;
    public sb C2;
    public final s7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final vc E0;
    public xf0 E1;
    public ValueAnimator E2;
    public fc F;
    public final wc F0;
    public zf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final vc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final zc J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public k8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public jb M0;
    public long M1;
    public long N;
    public u0 N0;
    public boolean N1;
    public boolean O;
    public final i7 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final cb Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final u2 R0;
    public boolean R1;
    public int S;
    public final u2 S0;
    public boolean S1;
    public int T;
    public final a4 T0;
    public float T1;
    public int U;
    public final a4 U0;
    public int U1;
    public boolean V;
    public final ea1 V0;
    public boolean V1;
    public boolean W;
    public final d4 W0;
    public boolean W1;
    public boolean X;
    public final yb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final uc Z0;
    public AnimatorSet Z1;
    public final bi.b f7234a;
    public int f7235a0;
    public final yc f7236a1;
    public boolean a2;
    public final Activity f7237b;
    public int f7238b0;
    public final s6 f7239b1;
    public boolean f7240b2;
    public final int f7241c;
    public final RectF f7242c0;
    public final ac f7243c1;
    public boolean f7244c2;
    public boolean d;
    public final RectF f7245d0;
    public final bb f7246d1;
    public boolean f7247d2;
    public boolean e;
    public final Path f7248e0;
    public final t0 f7249e1;
    public Runnable f7250e2;
    public final WindowManager f7251f;
    public int f7252f0;
    public yj0 f7253f1;
    public AnimatorSet f7254f2;
    public int f7255g0;
    public final bk0 f7256g1;
    public ma f7257g2;
    public final WindowManager.LayoutParams h;
    public final wb f7258h0;
    public yj0 f7259h1;
    public boolean f7260h2;
    public final FrameLayout f7261i0;
    public ImageView f7262i1;
    public AnimatorSet f7263i2;
    public final LinearLayout f7264j0;
    public final p6 f7265j1;
    public ValueAnimator f7266j2;
    public final FrameLayout f7267k0;
    public final d4 f7268k1;
    public boolean f7269k2;
    public final ah.x f7270l0;
    public final d4 l1;
    public s4.a0 f7271l2;
    public final FrameLayout m0;
    public final d4 f7272m1;
    public MediaController.AlbumEntry f7273m2;
    public final jc f7274n;
    public final u2 f7275n0;
    public final d4 f7276n1;
    public ValueAnimator f7277n2;
    public final d8 f7278o0;
    public final t6 f7279o1;
    public o1.k f7280o2;
    public final org.telegram.ui.ActionBar.h5 f7281p0;
    public final xc f7282p1;
    public Boolean f7283p2;
    public ea f7284q0;
    public p f7285q1;
    public qa f7286q2;
    public final cc f7287r;
    public final org.telegram.ui.Components.la f7288r0;
    public ub f7289r1;
    public AnimatorSet f7290r2;
    public final w2 f7291s;
    public final z6 f7292s0;
    public vb f7293s1;
    public boolean f7294s2;
    public final ab f7295t0;
    public final uc f7296t1;
    public int f7297t2;
    public boolean f7298u0;
    public final d f7299u1;
    public ArrayList f7300u2;
    public boolean v;
    public long f7301v0;
    public mb f7302v1;
    public FrameLayout f7303v2;
    public long f7304w;
    public String f7305w0;
    public qg.c1 f7306w1;
    public boolean f7307w2;
    public bc f7308x;
    public TLRPC.InputPeer f7309x0;
    public View f7310x1;
    public ga f7311x2;
    public final nb0 f7312y;
    public ca f7313y0;
    public View f7314y1;
    public ah.g f7315y2;
    public t f7316z0;
    public View f7317z1;
    public boolean f7318z2;

    public kc(Activity activity, int i10) {
        nb0 nb0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        bi.b bVar = new bi.b();
        this.f7234a = bVar;
        this.f7304w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f7242c0 = new RectF();
        this.f7245d0 = new RectF();
        this.f7248e0 = new Path();
        new Rect();
        this.f7252f0 = 0;
        this.f7255g0 = -1;
        this.f7313y0 = new ca();
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
        fb fbVar = new fb(this);
        this.f7247d2 = true;
        this.f7269k2 = true;
        this.f7297t2 = -1;
        this.f7237b = activity;
        this.f7241c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            nb0Var = new nb0(launchActivity, true);
        } else {
            nb0Var = null;
        }
        this.f7312y = nb0Var;
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
        this.f7251f = windowManager;
        jc jcVar = new jc(this, activity);
        this.f7274n = jcVar;
        pa paVar = new pa(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(jcVar, paVar);
        this.f7274n.setFocusable(true);
        this.f7274n.setImportantForAccessibility(2);
        w2 w2Var = new w2(activity, windowManager, this.f7274n, layoutParams);
        this.f7291s = w2Var;
        w2Var.a(new qb(this));
        this.f7274n.addView(this.f7291s.f8028b, new ViewGroup.LayoutParams(-1, -1));
        jc jcVar2 = this.f7274n;
        cc ccVar = new cc(this, activity);
        this.f7287r = ccVar;
        jcVar2.addView(ccVar);
        cc ccVar2 = this.f7287r;
        wb wbVar = new wb(this, activity);
        this.f7258h0 = wbVar;
        ccVar2.addView(wbVar);
        this.f7287r.addView(this.f7291s.f8029c, new ViewGroup.LayoutParams(-1, -1));
        this.f7288r0 = new org.telegram.ui.Components.la(this.f7258h0);
        this.f7292s0 = new Object();
        cc ccVar3 = this.f7287r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f7261i0 = frameLayout;
        ccVar3.addView(frameLayout);
        cc ccVar4 = this.f7287r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f7267k0 = frameLayout2;
        ccVar4.addView(frameLayout2);
        cc ccVar5 = this.f7287r;
        ah.x xVar = new ah.x(this, activity, 2);
        this.f7270l0 = xVar;
        ccVar5.addView(xVar);
        this.f7270l0.setVisibility(8);
        this.f7270l0.setAlpha(0.0f);
        cc ccVar6 = this.f7287r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        ccVar6.addView(frameLayout3);
        org.telegram.ui.Components.sc.a(this.f7274n, new z8(2));
        xb xbVar = new xb(this, activity, this.f7288r0, this.f7287r, bVar);
        this.A0 = xbVar;
        jc jcVar3 = this.f7274n;
        Objects.requireNonNull(jcVar3);
        xbVar.setCancelGestures(new x8(jcVar3, 2));
        this.A0.setResetState(new ga(this, 13));
        this.f7258h0.addView(this.A0, w7.a6.e(-1, -1, 119));
        this.A0.setOnClickListener(new ia(this, 12));
        wb wbVar2 = this.f7258h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        wbVar2.setBackgroundColor(i11);
        wb wbVar3 = this.f7258h0;
        bi.a2 a2Var = zf.j0.f50191a;
        wbVar3.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(12.0f)));
        this.f7258h0.setClipToOutline(true);
        ga gaVar = new ga(this, 14);
        ?? view = new View(activity);
        view.f25266a = new TextPaint(1);
        view.f25267b = new TextPaint(1);
        es esVar = es.h;
        view.f25272s = new org.telegram.ui.Components.g6((View) view, 0L, 350L, esVar);
        view.I = new yc0(view, 8);
        view.f25274x = gaVar;
        this.C1 = view;
        yb ybVar = new yb(this, activity, this.f7288r0, this.f7292s0);
        this.X0 = ybVar;
        ybVar.setCollageView(this.A0);
        yb ybVar2 = this.X0;
        ybVar2.v = new ga(this, 15);
        ybVar2.setOnTapListener(new ga(this, 16));
        this.X0.setVisibility(8);
        yb ybVar3 = this.X0;
        ybVar3.N = new ga(this, 17);
        this.f7258h0.addView(ybVar3, w7.a6.e(-1, -1, 119));
        this.f7258h0.addView(this.C1, w7.a6.e(-1, -1, 119));
        jc jcVar4 = this.f7274n;
        ac acVar = new ac(this, activity, jcVar4, jcVar4, this.f7287r, bVar, this.f7288r0);
        this.f7243c1 = acVar;
        acVar.setAccount(i10);
        this.f7243c1.setUiBlurBitmap(new pa(this, 6));
        org.telegram.ui.Components.sc.a(this.f7270l0, new ah.m0(this, 4));
        this.f7243c1.setOnHeightUpdate(new ha(this, 13));
        this.f7243c1.setOnPeriodUpdate(new ha(this, 4));
        long j10 = this.N;
        if (j10 != 0) {
            this.f7243c1.setDialogId(j10);
        }
        this.f7243c1.setOnPremiumHint(new ha(this, 5));
        this.f7243c1.setOnKeyboardOpen(new ha(this, 6));
        ab abVar = new ab(this, activity, 0);
        this.f7295t0 = abVar;
        this.f7287r.addView(abVar);
        uc ucVar = new uc(activity, this.f7287r, this.f7258h0, bVar, this.f7288r0);
        this.Z0 = ucVar;
        ucVar.setOnTimelineClick(new ga(this, 10));
        this.Z0.setOnHeightChange(new ga(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.a6.a(f11, 0.0f, 0.0f, 0.0f, 0.0f, -1, 87));
        yc ycVar = new yc(activity);
        this.f7236a1 = ycVar;
        ycVar.setVisibility(8);
        this.f7236a1.a(false);
        this.Y0.addView(this.f7236a1, w7.a6.a(25.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        this.f7270l0.addView(this.Y0, w7.a6.a(413, 0.0f, 0.0f, 0.0f, 68.0f, -1, 87));
        this.f7270l0.addView(this.f7243c1, w7.a6.a(-1.0f, 0.0f, 200.0f, 0.0f, 0.0f, -1, 87));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        uc ucVar2 = new uc(activity, this.f7287r, this.f7258h0, bVar, this.f7288r0);
        this.f7296t1 = ucVar2;
        ucVar2.X0 = true;
        ucVar2.setVisibility(8);
        this.f7296t1.setAlpha(0.0f);
        this.f7270l0.addView(this.f7296t1, w7.a6.a(f11, 0.0f, 0.0f, 0.0f, 6.0f, -1, 87));
        bb bbVar = new bb(this, activity, bVar, this.f7288r0);
        this.f7246d1 = bbVar;
        bbVar.setVisibility(8);
        this.f7270l0.addView(this.f7246d1, w7.a6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f7275n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        u2 u2Var = this.f7275n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        u2Var.setScaleType(scaleType);
        this.f7275n0.setImageResource(R.drawable.msg_photo_back);
        u2 u2Var2 = this.f7275n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f7275n0.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.f7275n0.setOnClickListener(new ia(this, 1));
        this.f7261i0.addView(this.f7275n0, w7.a6.e(56, 56, 51));
        this.f7291s.a(this.f7275n0);
        d8 d8Var = new d8(activity, i10);
        this.f7278o0 = d8Var;
        d8Var.a(false, false);
        this.f7278o0.setOnClickListener(new bi.u1(6, this, activity));
        this.f7261i0.addView(this.f7278o0, w7.a6.a(56.0f, 50.0f, 0.0f, 50.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f7281p0 = h5Var;
        h5Var.setTextSize(20);
        this.f7281p0.setGravity(19);
        this.f7281p0.setTextColor(-1);
        this.f7281p0.setTypeface(AndroidUtilities.bold());
        this.f7281p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f7281p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f7281p0.setAlpha(0.0f);
        this.f7281p0.setVisibility(8);
        this.f7281p0.setEllipsizeByGradient(true);
        this.f7281p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f7261i0.addView(this.f7281p0, w7.a6.a(56.0f, 71.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f7264j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f7264j0.setGravity(5);
        this.f7261i0.addView(this.f7264j0, w7.a6.a(56.0f, 0.0f, 0.0f, 8.0f, 0.0f, -1, 7));
        ha haVar = new ha(this, 7);
        jc jcVar5 = this.f7274n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f7819w = true;
        imageView2.f7820x = true;
        imageView2.h = haVar;
        imageView2.f7812a = i10;
        imageView2.f7813b = jcVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.g0(imageView2, 10));
        imageView2.f7815f = new gq(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f7249e1 = imageView2;
        d4 d4Var = new d4(activity, 1);
        d4Var.l(1.0f, -71.0f);
        d4Var.d = 2000L;
        d4Var.U = false;
        d4Var.H.r(true, false);
        this.f7268k1 = d4Var;
        d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7261i0.addView(this.f7268k1, w7.a6.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 48));
        ?? imageView3 = new ImageView(activity);
        this.f7256g1 = imageView3;
        imageView3.setScaleType(scaleType);
        bk0 bk0Var = this.f7256g1;
        k8 k8Var = this.K1;
        if (k8Var != null && k8Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        bk0Var.setImageResource(i12);
        this.f7256g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f7256g1.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.f7256g1.setOnClickListener(new ia(this, 2));
        this.f7256g1.setVisibility(8);
        this.f7256g1.setAlpha(0.0f);
        p6 p6Var = new p6(activity);
        this.f7265j1 = p6Var;
        p6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.f7265j1.setVisibility(8);
        this.f7265j1.setAlpha(0.0f);
        this.f7265j1.setOnClickListener(new ia(this, 3));
        this.f7264j0.addView(this.f7265j1, w7.a6.q(46, 56, 53));
        this.f7264j0.addView(this.f7256g1, w7.a6.q(46, 56, 53));
        this.f7264j0.addView(this.f7249e1, w7.a6.e(46, 56, 53));
        vc vcVar = new vc(activity);
        this.E0 = vcVar;
        vcVar.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.E0.setOnClickListener(new ia(this, 4));
        this.E0.setOnLongClickListener(new l5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f7291s.a(this.E0);
        this.f7261i0.addView(this.E0, w7.a6.e(56, 56, 53));
        wc wcVar = new wc(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = wcVar;
        wcVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ia(this, 5));
        boolean q6 = c1.q(activity);
        wc wcVar2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        wcVar2.setVisibility(i13);
        wc wcVar3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        wcVar3.setAlpha(f7);
        this.f7291s.a(this.F0);
        this.f7261i0.addView(this.F0, w7.a6.e(56, 56, 53));
        ?? vcVar2 = new vc(activity);
        this.G0 = vcVar2;
        vcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        if (this.f7316z0 == null) {
            i14 = 6;
            this.f7316z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new ia(this, i14));
        this.G0.a(new u(this.f7316z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f7291s.a(this.G0);
        this.f7261i0.addView(this.G0, w7.a6.e(56, 56, 53));
        vc vcVar3 = new vc(activity);
        this.H0 = vcVar3;
        vcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ia(this, 7));
        this.f7291s.a(this.H0);
        this.f7261i0.addView(this.H0, w7.a6.e(56, 56, 53));
        y yVar = new y(activity, this.f7291s);
        this.I0 = yVar;
        yVar.f8112a.u0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new ha(this, 8));
        this.f7261i0.addView(this.I0, w7.a6.e(-1, 56, 53));
        d4 d4Var2 = new d4(activity, 1);
        d4Var2.l(1.0f, -20.0f);
        d4Var2.d = 5000L;
        d4Var2.i();
        d4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        d4Var2.f6801l0 = new ah.j(10);
        this.l1 = d4Var2;
        d4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7261i0.addView(this.l1, w7.a6.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 48));
        d4 d4Var3 = new d4(activity, 2);
        d4Var3.l(0.0f, 28.0f);
        d4Var3.d = 5000L;
        d4Var3.p(true);
        this.f7272m1 = d4Var3;
        this.f7261i0.addView(d4Var3, w7.a6.a(-1.0f, 0.0f, 0.0f, 52.0f, 0.0f, -1, 48));
        d4 d4Var4 = new d4(activity, 1);
        d4Var4.l(1.0f, -20.0f);
        d4Var4.d = 5000L;
        d4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f7276n1 = d4Var4;
        d4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7261i0.addView(this.f7276n1, w7.a6.a(-1.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 48));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f8196a = paint;
        Paint paint2 = new Paint(1);
        view2.f8197b = paint2;
        view2.e = new org.telegram.ui.Components.g6((View) view2, 0L, 250L, esVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        view2.f8198c = r6Var;
        r6Var.n(0.3f, 250L, esVar);
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.u(-1);
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(view2);
        r6Var.f28748b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        h0(false, false);
        this.f7261i0.addView(this.J0, w7.a6.a(45.0f, 56.0f, 0.0f, 56.0f, 0.0f, -1, 55));
        this.f7291s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        i7 i7Var = new i7(activity);
        this.O0 = i7Var;
        i7Var.setDelegate(fbVar);
        i7 i7Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        i7Var2.f7062n0 = -1.0f;
        i7Var2.f7063o0 = z10;
        i7Var2.invalidate();
        this.f7267k0.addView(this.O0, w7.a6.e(-1, 100, 87));
        this.f7291s.a(this.O0);
        i7 i7Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        i7Var3.e(f10, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f7267k0.addView(this.P0, w7.a6.a(48.0f, 20.0f, 20.0f, 20.0f, 20.0f, -1, 87));
        this.P0.setOnClickListener(new ia(this, 8));
        d4 d4Var5 = new d4(activity, 3);
        d4Var5.p(true);
        d4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        d4Var5.h = AndroidUtilities.dp(320.0f);
        d4Var5.d = 5000L;
        d4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = d4Var5;
        this.f7267k0.addView(d4Var5, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
        ea1 ea1Var = new ea1(activity);
        this.V0 = ea1Var;
        ea1Var.M = false;
        ea1Var.setAlpha(0.0f);
        this.f7267k0.addView(this.V0, w7.a6.a(50.0f, 0.0f, 0.0f, 0.0f, 108.0f, -1, 81));
        this.V0.setDelegate(new pa(this, 4));
        ea1 ea1Var2 = this.V0;
        this.T1 = 0.0f;
        ea1Var2.b(0.0f, false);
        s7 s7Var = new s7(activity, i10, new ga(this, 12));
        this.D0 = s7Var;
        s7Var.f7774c = new ha(this, 9);
        this.f7267k0.addView(s7Var, w7.a6.a(80.0f, 0.0f, 0.0f, 0.0f, 90.0f, -1, 87));
        cb cbVar = new cb(this, activity);
        this.Q0 = cbVar;
        cbVar.setOnSwitchModeListener(new ha(this, 10));
        this.Q0.setOnSwitchingModeListener(new ha(this, 11));
        this.m0.addView(this.Q0, w7.a6.e(-1, 48, 55));
        this.f7291s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.a6.a(24.0f, 20.0f, 0.0f, 20.0f, 4.0f, 24, 19));
        this.f7291s.a(this.R0);
        this.R0.setOnClickListener(new ia(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.a6.a(24.0f, 20.0f, 0.0f, 20.0f, 4.0f, 24, 21));
        this.f7291s.a(this.S0);
        this.S0.setOnClickListener(new ia(this, 10));
        a4 a4Var = new a4(activity);
        this.T0 = a4Var;
        this.m0.addView(a4Var, w7.a6.a(32.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 17));
        this.f7291s.a(this.T0);
        a4 a4Var2 = new a4(activity);
        this.U0 = a4Var2;
        a4Var2.f6590a.t(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        a4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.a6.a(32.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 17));
        this.f7291s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f7299u1 = dVar2;
        dVar2.setVisibility(8);
        this.f7299u1.setAlpha(0.0f);
        this.f7299u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f7299u1.setOnClickListener(new ia(this, 11));
        this.m0.addView(this.f7299u1, w7.a6.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f7766b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f7765a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.a6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        r6 r6Var2 = new r6(frameLayout5, activity, string, true);
        frameLayout5.f7767c = r6Var2;
        r6Var2.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f7767c, w7.a6.d(-2.0f, -2));
        frameLayout5.e();
        this.f7239b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f7239b1.setOnClickListener(new ha(this, 12));
        this.m0.addView(this.f7239b1, w7.a6.e(-1, 52, 23));
        xc xcVar = new xc(activity);
        this.f7282p1 = xcVar;
        xcVar.setAlpha(0.0f);
        this.f7282p1.setVisibility(8);
        this.f7258h0.addView(this.f7282p1, w7.a6.a(120.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 81));
        t6 t6Var = new t6(activity, i10, bVar);
        this.f7279o1 = t6Var;
        this.f7258h0.addView(t6Var, w7.a6.e(-1, -1, 119));
        l0(false);
    }

    public static kc D(Activity activity, int i10) {
        kc kcVar = F2;
        if (kcVar != null && (kcVar.f7237b != activity || kcVar.f7241c != i10)) {
            kcVar.p(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new kc(activity, i10);
        }
        return F2;
    }

    public static void Z(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static void a(kc kcVar) {
        nb nbVar = kcVar.B0;
        boolean z10 = false;
        if (nbVar != null && nbVar.getTextureView() != null) {
            Bitmap bitmap = kcVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                kcVar.f7244c2 = false;
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
            kcVar.f7244c2 = z10;
            return;
        }
        kcVar.f7244c2 = false;
    }

    public static void b(kc kcVar) {
        ValueAnimator valueAnimator = kcVar.f7266j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            kcVar.f7266j2 = null;
        }
        kcVar.f7269k2 = false;
        cc ccVar = kcVar.f7287r;
        float f7 = ccVar.f6742a;
        float f10 = ccVar.f6743b;
        ccVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        kcVar.f7266j2 = ofFloat;
        ofFloat.addUpdateListener(new xa(kcVar, f7, f10, 0));
        kcVar.f7266j2.setDuration(340L);
        kcVar.f7266j2.setInterpolator(es.h);
        kcVar.f7266j2.addListener(new ib(kcVar, 0));
        kcVar.f7266j2.start();
    }

    public static boolean c(kc kcVar) {
        Activity activity = kcVar.f7237b;
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
        spannableString.setSpan(new rb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void w() {
        kc kcVar = F2;
        if (kcVar != null) {
            kcVar.p(false);
        }
        F2 = null;
    }

    public final int A() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        k8 k8Var = this.K1;
        if (k8Var != null) {
            return k8Var.r();
        }
        return 1;
    }

    public final String B() {
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                return (String) this.f7300u2.get(this.f7297t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final u0 C() {
        if (this.N0 == null) {
            u0 u0Var = new u0(this.f7237b);
            this.N0 = u0Var;
            this.f7267k0.addView(u0Var, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 78.0f, -1, 87));
        }
        return this.N0;
    }

    public final String E() {
        int i10;
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                o();
                ArrayList arrayList = this.f7300u2;
                if (this.f7297t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f7297t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView F() {
        if (this.f7262i1 == null) {
            yj0 yj0Var = new yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f7259h1 = yj0Var;
            yj0Var.h = true;
            k8 k8Var = this.K1;
            if (k8Var != null && k8Var.f7221y0) {
                yj0Var.M(35);
                this.f7259h1.P(36);
            } else {
                yj0Var.P(0);
                this.f7259h1.M(0);
            }
            this.f7259h1.Z = true;
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.J9, this.f7234a);
            this.f7259h1.Q(w02, "Sunny");
            this.f7259h1.Q(w02, "Path 6");
            this.f7259h1.Q(w02, "Path");
            this.f7259h1.Q(w02, "Path 5");
            this.f7259h1.o();
            ImageView imageView = new ImageView(this.f7237b);
            this.f7262i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f7262i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f7262i1.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
            this.f7262i1.setOnClickListener(new ia(this, 0));
            this.f7262i1.setVisibility(8);
            this.f7262i1.setImageDrawable(this.f7259h1);
            this.f7262i1.setAlpha(0.0f);
            this.f7264j0.addView(this.f7262i1, 0, w7.a6.q(46, 56, 53));
        }
        return this.f7262i1;
    }

    public final void G() {
        mb mbVar = this.f7302v1;
        if (mbVar == null) {
            return;
        }
        this.f7303v2 = null;
        mbVar.getTopLayout().setAlpha(0.0f);
        this.f7302v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f7302v1.getBottomLayout().setAlpha(0.0f);
        this.f7302v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f7302v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f7302v1.setVisibility(8);
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
        jb jbVar;
        if (!this.W && (jbVar = this.M0) != null) {
            if (jbVar.getTranslationY() < (this.f7274n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.kc.J(int, boolean):void");
    }

    public final void K(Runnable runnable, long j10) {
        if (!this.S1 && this.K1 != null) {
            ma maVar = this.f7257g2;
            if (maVar != null) {
                AndroidUtilities.cancelRunOnUIThread(maVar);
            }
            this.f7260h2 = true;
            this.S1 = true;
            this.f7257g2 = new ma(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f7257g2, j10);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f7257g2, 800L);
        }
    }

    public final boolean L() {
        throw new UnsupportedOperationException("Method not decompiled: di.kc.L():boolean");
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
            this.f7296t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f7270l0.setVisibility(i17);
            this.f7243c1.setVisibility(8);
            this.f7299u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f7239b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f7270l0.setVisibility(i14);
            this.f7256g1.setVisibility(8);
            this.f7265j1.setVisibility(8);
            this.f7249e1.setVisibility(8);
            ImageView imageView = this.f7262i1;
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
            this.f7281p0.setVisibility(i16);
            v();
            this.f7282p1.setAlpha(0.0f);
            this.f7282p1.setVisibility(8);
            this.f7236a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            k8 k8Var = this.K1;
            if (k8Var == null || !k8Var.f7199n) {
                t();
                G();
            }
            gg0 gg0Var = this.C1;
            if (gg0Var != null) {
                gg0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            k8 k8Var2 = this.K1;
            if (k8Var2 != null && k8Var2.f7189h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f7236a1.setVisibility(i13);
            this.f7270l0.setAlpha(1.0f);
            this.f7270l0.setTranslationY(0.0f);
            k8 k8Var3 = this.K1;
            if (k8Var3 == null || k8Var3.J0 == 0) {
                i18 = 0;
            }
            this.f7243c1.setVisibility(i18);
        }
        if (i11 == 0 && this.V1) {
            C().setVisibility(0);
            u0 C = C();
            C.f7881r.d(0.0f, true);
            C.a(true);
            bi.la laVar = C.h;
            if (laVar != null) {
                AndroidUtilities.cancelRunOnUIThread(laVar);
            }
            bi.la laVar2 = new bi.la(C, 18);
            C.h = laVar2;
            AndroidUtilities.runOnUIThread(laVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        gg0 gg0Var2 = this.C1;
        if (gg0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f7255g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            gg0Var2.setAllowTouch(z11);
        }
        ac acVar = this.f7243c1;
        if (acVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            acVar.f7381e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f7241c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            bi.x8 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void N(int i10, int i11) {
        k8 k8Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        k8 k8Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        k8 k8Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        ga gaVar;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        k8 k8Var4;
        int i17;
        k8 k8Var5;
        k8 k8Var6;
        k8 k8Var7;
        x71 textureView;
        k8 k8Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Y(false);
            this.O0.setVisibility(0);
            i7 i7Var = this.O0;
            if (i7Var != null) {
                i7Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            k8 k8Var9 = this.K1;
            if (k8Var9 != null) {
                k8Var9.i(false);
                this.K1 = null;
            }
            xb xbVar = this.A0;
            if (xbVar != null) {
                xbVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            d0(null);
            a0(new ga(this, 18));
            u0 u0Var = this.N0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            this.W0.e(true);
            d4 d4Var = this.l1;
            if (d4Var != null) {
                d4Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f7241c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                k8Var = this.K1;
            } else {
                k8Var = null;
            }
            this.f7249e1.setEntry(k8Var);
            if (this.O1 == 1) {
                this.f7256g1.setVisibility(0);
                k8 k8Var10 = this.K1;
                if (k8Var10 != null && k8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                e0(z13, false);
                this.f7265j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((gh0) this.f7265j1.f7588c).a(this.X0.k(), false);
                this.f7281p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                k8 k8Var11 = this.K1;
                if (k8Var11 != null && !TextUtils.isEmpty(k8Var11.f7220y)) {
                    this.f7256g1.setVisibility(8);
                    this.f7265j1.setVisibility(0);
                    ((gh0) this.f7265j1.f7588c).a(true, false);
                    this.f7281p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f7281p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f7249e1.setVisibility(0);
            k8 k8Var12 = this.K1;
            if (k8Var12 != null && k8Var12.f7213u) {
                F().setVisibility(0);
                n0(false);
            } else {
                ImageView imageView = this.f7262i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f7239b1.setVisibility(0);
            this.X0.setVisibility(0);
            k8 k8Var13 = this.K1;
            if ((k8Var13 != null && k8Var13.J0 != 0) || this.f7301v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f7243c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            k8 k8Var14 = this.K1;
            if ((k8Var14 != null && k8Var14.J0 != 0) || this.f7301v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f7270l0.setVisibility(0);
            this.f7270l0.clearFocus();
            k8 k8Var15 = this.K1;
            if (k8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = k8Var15.I0;
            }
            this.f7243c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((k8Var2 = this.K1) == null || !k8Var2.f7187g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7243c1.setPeriodVisible(z10);
            k8 k8Var16 = this.K1;
            if (k8Var16 != null && k8Var16.f7202o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f7243c1.setHasRoundVideo(z11);
            ac acVar = this.f7243c1;
            if (acVar == null) {
                j10 = 0;
            } else {
                k8 k8Var17 = this.K1;
                if (k8Var17 == null || !k8Var17.f7199n) {
                    j10 = 0;
                    acVar.v(null, null);
                } else {
                    TLRPC.Peer peer = k8Var17.f7205q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        k8 k8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        k8Var18.f7203p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        k8 k8Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        k8Var19.f7203p = append;
                    }
                    String str3 = this.K1.f7209s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f7243c1.v(append, str4);
                }
            }
            k8 k8Var20 = this.K1;
            if (k8Var20 != null && k8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            uc ucVar = this.Z0;
            boolean z22 = ucVar.f7930j0;
            ucVar.f7930j0 = z12;
            ucVar.f7928i0.f(z12, true);
            ucVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f7281p0.setVisibility(0);
            this.f7296t1.setVisibility(0);
            k8 k8Var21 = this.K1;
            if (k8Var21 != null && k8Var21.f7176b0) {
                this.f7281p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f7270l0.setVisibility(0);
            this.f7299u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f7281p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            k8 k8Var22 = this.K1;
            if (k8Var22 != null && k8Var22.J0 != j10) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (k8Var22 != null && k8Var22.f7187g) {
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
            s6 s6Var = this.f7239b1;
            if (!TextUtils.equals(string, s6Var.d) || z23 != s6Var.e) {
                s6Var.removeView(s6Var.f7767c);
                Context context = s6Var.getContext();
                s6Var.d = string;
                s6Var.e = z23;
                r6 r6Var = new r6(s6Var, context, string, z23);
                s6Var.f7767c = r6Var;
                r6Var.setContentDescription(string);
                s6Var.addView(s6Var.f7767c, w7.a6.d(-2.0f, -2));
                s6Var.e();
            }
            this.f7296t1.setVisibility(8);
            this.f7299u1.setVisibility(8);
            if (!this.f7260h2) {
                k8 k8Var23 = this.K1;
                if (k8Var23 != null && k8Var23.f7213u) {
                    this.X0.l(k8Var23);
                } else {
                    this.X0.set(k8Var23);
                }
            }
            this.f7260h2 = false;
            nu editText = this.f7243c1.f7382f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                gaVar = null;
            } else {
                gaVar = new ga(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(gaVar);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f7246d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                bb bbVar = this.f7246d1;
                bbVar.c(false, false);
                bbVar.f7754c = arrayList;
                bbVar.d = arrayList2;
                bbVar.e = arrayList3;
                bbVar.f7759w = new h11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                bbVar.K = new h11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                bbVar.f7753b.W2.N(false);
                this.f7246d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((k8Var8 = this.K1) == null || (!k8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                k8 k8Var24 = this.K1;
                if (k8Var24 != null && (k8Var24.f7178c || k8Var24.f7187g || this.f7298u0)) {
                    if (k8Var24.P0 != null) {
                        y();
                        t();
                        G();
                    }
                    k8 k8Var25 = this.K1;
                    if (k8Var25.K && k8Var25.f7174a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new pa(this, 7));
                    }
                    this.f7243c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ac acVar2 = this.f7243c1;
                    acVar2.V = true;
                    acVar2.f7382f.setText("");
                }
            }
            k8 k8Var26 = this.K1;
            if (k8Var26 != null && ((k8Var26.f7213u && !k8Var26.K) || k8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f7239b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (k8Var7 = this.K1) != null && !k8Var7.f7213u && !k8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f7239b1.d(3, z19);
            if (!this.N1 && !this.f7243c1.o()) {
                bi.x8 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int A = A();
                bi.q8 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f3962a, A) || ((k8Var6 = this.K1) != null && (k8Var6.f7187g || k8Var6.J0 != j10))) {
                    z20 = true;
                    this.f7239b1.setShareEnabled(z20);
                    k8Var4 = this.K1;
                    if (k8Var4 == null && k8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f7256g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f7281p0.setVisibility(0);
                    this.f7281p0.setTranslationX(0.0f);
                    k8Var5 = this.K1;
                    if (k8Var5 == null && k8Var5.J0 != j10) {
                        this.f7281p0.l("", false);
                    } else if (k8Var5 == null && k8Var5.f7187g) {
                        this.f7281p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (k8Var5 == null && k8Var5.f7213u) {
                        this.f7281p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (k8Var5 == null && k8Var5.f7199n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(this.f7281p0, 32.0f, i18);
                        this.f7281p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(k5Var, 0, 1, 33);
                        if (this.K1.f7205q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f7205q.user_id));
                            k5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f7205q)));
                            k5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f7281p0.l(spannableStringBuilder, false);
                    } else {
                        this.f7281p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f7239b1.setShareEnabled(z20);
            k8Var4 = this.K1;
            if (k8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f7256g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f7281p0.setVisibility(0);
            this.f7281p0.setTranslationX(0.0f);
            k8Var5 = this.K1;
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            this.f7281p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            ac acVar3 = this.f7243c1;
            m80 m80Var = acVar3.V0;
            if (m80Var != null) {
                m80Var.u();
                acVar3.V0 = null;
            }
            this.f7268k1.e(z21);
            bb bbVar2 = this.f7246d1;
            if (bbVar2.M) {
                bbVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (k8Var3 = this.K1) != null) {
            if (k8Var3.f7183e0 < j10) {
                k8Var3.f7183e0 = j10;
            }
            this.M1 = k8Var3.f7183e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f7189h0;
            } else {
                duration = this.X0.getDuration();
            }
            k8 k8Var27 = this.K1;
            if (k8Var27.f7189h0 <= 0) {
                k8Var27.f7189h0 = duration;
            }
            File file = k8Var27.Z0;
            if (file == null) {
                file = k8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            k8 k8Var28 = this.K1;
            this.f7296t1.o(false, absolutePath, k8Var28.f7189h0, k8Var28.P);
            k8 k8Var29 = this.K1;
            float f10 = (float) duration;
            long j11 = k8Var29.Z * f10;
            long j12 = k8Var29.f7173a0 * f10;
            uc ucVar2 = this.f7296t1;
            ucVar2.Z0 = j11;
            ucVar2.f7910a1 = j12;
            pc pcVar = ucVar2.h;
            if (pcVar != null) {
                pc.a(pcVar, true);
            }
            ci.u uVar = new ci.u(this, 8);
            this.f7296t1.setDelegate(new kb(uVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f7296t1.setVideoLeft(max);
            this.f7296t1.setVideoRight(0.04f + max);
            uVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        gg0 gg0Var = this.C1;
        if (gg0Var != null) {
            gg0Var.setAllowTouch(false);
        }
        d4 d4Var2 = this.f7272m1;
        boolean z24 = true;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        org.telegram.ui.Components.sc.e();
        ac acVar4 = this.f7243c1;
        if (acVar4 != null) {
            g gVar = acVar4.f7382f;
            gVar.d();
            gVar.k(true);
            this.f7243c1.f7381e0 = true;
        }
        yb ybVar = this.X0;
        if (ybVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            ybVar.x(8, z15);
        }
        mb mbVar = this.f7302v1;
        if (mbVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            mbVar.setCoverPreview(z14);
        }
        d4 d4Var3 = this.f7276n1;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        xb xbVar2 = this.A0;
        if (i11 != 1 || !xbVar2.j()) {
            z24 = false;
        }
        xbVar2.setPreview(z24);
    }

    public final void O() {
        qg.a1 a1Var;
        int i10;
        if (this.f7252f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7311x2 = new ga(this, 3);
            } else {
                Y(false);
            }
        }
        ac acVar = this.f7243c1;
        if (acVar != null) {
            acVar.f7382f.s();
        }
        i7 i7Var = this.O0;
        if (i7Var != null) {
            i7Var.h();
        }
        t6 t6Var = this.f7279o1;
        if (t6Var != null) {
            bi.x8 storiesController = MessagesController.getInstance(t6Var.f7832a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f3967i.f(UserConfig.getInstance(storiesController.f3962a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            t6Var.f7833b = storiesController.f3963b.m() + i10 + 1;
            t6Var.f7834c.invalidate();
        }
        mb mbVar = this.f7302v1;
        if (mbVar != null && (a1Var = mbVar.O0.d) != null) {
            a1Var.postRunnable(a1Var.f43387w);
        }
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(0, false);
        }
        a1 a1Var2 = MessagesController.getInstance(this.f7241c).getStoriesController().f3980w;
        if (!a1Var2.f6585c && !a1Var2.d) {
            a1Var2.d = true;
            w0 w0Var = new w0(a1Var2, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(a1Var2.f6583a);
            messagesStorage.getStorageQueue().postRunnable(new x0((Object) messagesStorage, false, (Object) w0Var, 0));
        }
    }

    public final void P(int i10, int i11) {
        boolean z10;
        mb mbVar;
        ub ubVar;
        vb vbVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        mb mbVar2;
        if (i11 == 0) {
            this.f7275n0.setVisibility(8);
        }
        if (i10 == 0 && (mbVar2 = this.f7302v1) != null) {
            mbVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f7243c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f7256g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f7265j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f7249e1.setVisibility(i14);
            ImageView imageView = this.f7262i1;
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
            this.f7281p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (mbVar = this.f7302v1) != null) {
            mbVar.f7517d1.setLayerType(0, null);
        }
        gg0 gg0Var = this.C1;
        if (gg0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            gg0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            ub ubVar2 = this.f7289r1;
            if (ubVar2 != null) {
                ubVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (ubVar = this.f7289r1) != null) {
            ubVar.setVisibility(8);
            this.f7289r1.setAppearProgress(0.0f);
            ub ubVar3 = this.f7289r1;
            ubVar3.f7027x = null;
            g0 g0Var = ubVar3.f7022f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            ubVar3.d.setVisibility(8);
            ubVar3.f7019a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            vb vbVar2 = this.f7293s1;
            if (vbVar2 != null) {
                vbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (vbVar = this.f7293s1) != null) {
            vbVar.setVisibility(8);
            this.f7293s1.setAppearProgress(0.0f);
            vb vbVar3 = this.f7293s1;
            vbVar3.f7332b = null;
            g0 g0Var2 = vbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            vbVar3.e.setVisibility(8);
            vbVar3.setVisibility(8);
        }
    }

    public final void Q(ec ecVar) {
        bi.q8 o10;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i10 = this.f7241c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f7298u0 = false;
        this.e = false;
        this.B2 = false;
        this.f7292s0.f8186g = false;
        WindowManager windowManager = this.f7251f;
        if (windowManager != null && (jcVar = this.f7274n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f7274n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f7274n, layoutParams);
            f0();
        }
        this.A0.setCameraThumb(z());
        if (this.f7301v0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            g0(o10, true);
        }
        J(0, false);
        k0(-1, false, false);
        RectF rectF = this.H;
        if (ecVar != null) {
            this.F = ecVar;
            this.J = ecVar.f6955a;
            rectF.set(ecVar.f6957c);
            this.G = ecVar.f6956b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7287r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f7258h0.setBackgroundColor(i11);
        this.f7287r.setTranslationX(0.0f);
        this.f7287r.setTranslationY(0.0f);
        this.f7287r.b(0.0f);
        this.f7287r.setScaleX(1.0f);
        this.f7287r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7237b, 1);
        f(1.0f, true, new ga(this, 6));
        d();
        this.f7301v0 = 0L;
        this.f7305w0 = "";
    }

    public final void R(dc dcVar, k8 k8Var, long j10) {
        int i10;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i11 = this.f7241c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f7298u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f7251f;
        if (windowManager != null && (jcVar = this.f7274n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f7274n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f7274n, layoutParams);
            f0();
        }
        this.K1 = k8Var;
        this.O1 = k8Var.K ? 1 : 0;
        this.f7292s0.f8186g = false;
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.f6955a;
            rectF.set(dcVar.f6957c);
            this.G = dcVar.f6956b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7287r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f7258h0.setBackgroundColor(i10);
        this.f7287r.setTranslationX(0.0f);
        this.f7287r.setTranslationY(0.0f);
        this.f7287r.b(0.0f);
        this.f7287r.setScaleX(1.0f);
        this.f7287r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7237b, 1);
        k8 k8Var2 = this.K1;
        if (k8Var2 != null) {
            this.f7243c1.setText(k8Var2.C0);
        }
        K(new za(this, 0), j10);
        if (this.K1.f7176b0) {
            i13 = 2;
        }
        J(i13, false);
        k0(-1, false, false);
        this.f7239b1.b(false, false);
        d();
        this.f7301v0 = 0L;
        this.f7305w0 = "";
    }

    public final void S() {
        m80 m80Var;
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(4, true);
        }
        ac acVar = this.f7243c1;
        if (acVar != null && (m80Var = acVar.V0) != null) {
            m80Var.u();
            acVar.V0 = null;
        }
        sg.y0 y0Var = new sg.y0((org.telegram.ui.ActionBar.m2) new ob(this, 1), 14, false);
        y0Var.setOnDismissListener(new va(this, 1));
        y0Var.show();
    }

    public final void T(dc dcVar, k8 k8Var) {
        int i10;
        boolean z10;
        int i11;
        bi.q8 o10;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i12 = this.f7241c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f7298u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f7251f;
        if (windowManager != null && (jcVar = this.f7274n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f7274n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f7274n, layoutParams);
            f0();
        }
        this.K1 = k8Var;
        fa.a(i12, k8Var);
        k8 k8Var2 = this.K1;
        if (k8Var2 != null && k8Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (k8Var2 != null && k8Var2.f7213u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7292s0.f8186g = z10;
        if (this.f7301v0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            g0(o10, true);
        }
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.f6955a;
            rectF.set(dcVar.f6957c);
            this.G = dcVar.f6956b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7287r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f7258h0.setBackgroundColor(i11);
        this.f7287r.setTranslationX(0.0f);
        this.f7287r.setTranslationY(0.0f);
        this.f7287r.b(0.0f);
        this.f7287r.setScaleX(1.0f);
        this.f7287r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7237b, 1);
        k8 k8Var3 = this.K1;
        if (k8Var3 != null) {
            this.f7243c1.setText(k8Var3.C0);
        }
        this.f7239b1.b(true, false);
        J(1, false);
        k0(-1, false, false);
        f(1.0f, true, new ga(this, 6));
        d();
        this.f7301v0 = 0L;
        this.f7305w0 = "";
    }

    public final void U() {
        qg.c1 c1Var = this.f7306w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f7310x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f7314y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f7317z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        xc xcVar = this.f7282p1;
        if (xcVar != null) {
            xcVar.bringToFront();
        }
        gg0 gg0Var = this.C1;
        if (gg0Var != null) {
            gg0Var.bringToFront();
        }
        xf0 xf0Var = this.E1;
        if (xf0Var != null) {
            xf0Var.bringToFront();
        }
        zf0 zf0Var = this.F1;
        if (zf0Var != null) {
            zf0Var.bringToFront();
        }
        t6 t6Var = this.f7279o1;
        if (t6Var != null) {
            t6Var.bringToFront();
        }
        p pVar = this.f7285q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void V(k8 k8Var, boolean z10) {
        File file;
        View view;
        float f7;
        k8 k8Var2;
        boolean z11;
        int i10;
        if (k8Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = k8Var.O0;
            } else {
                file = k8Var.N0;
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
            x71 textureView = this.X0.getTextureView();
            if (k8Var.K && !k8Var.f7213u && textureView != null) {
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
            File file2 = k8Var.Q0;
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
            File file3 = k8Var.P0;
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
            mb mbVar = this.f7302v1;
            if (mbVar != null && mbVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                mb mbVar2 = this.f7302v1;
                mbVar2.I0 = true;
                i6 i6Var = mbVar2.R0;
                i6Var.f44225a = true;
                i6Var.draw(canvas);
                mb mbVar3 = this.f7302v1;
                mbVar3.R0.f44225a = false;
                mbVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w9 = k8.w(this.f7241c, "jpg");
            if (z10) {
                k8Var2 = k8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new t1(this, createBitmap, z11, w9, k8Var2, 1));
            } else {
                k8Var2 = k8Var;
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
                k8Var2.N0 = w9;
            }
            k8Var2.f7177b1 = createScaledBitmap;
        }
    }

    public final void W() {
        bi.q8 o10;
        int size;
        char c10;
        View[] viewPages;
        s61[] s61VarArr;
        ea eaVar = this.f7284q0;
        BitmapDrawable bitmapDrawable = null;
        if (eaVar != null) {
            eaVar.dismiss();
            this.f7284q0 = null;
        }
        if (this.N1) {
            t0 t0Var = this.f7249e1;
            t0Var.getClass();
            t0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            r6 r6Var = this.f7239b1.f7767c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(r6Var, i10);
            return;
        }
        ac acVar = this.f7243c1;
        if (acVar != null && acVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.s6 s6Var = acVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            acVar.e();
            return;
        }
        k8 k8Var = this.K1;
        int i12 = this.f7241c;
        if ((k8Var == null || (!k8Var.f7187g && k8Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, A())) {
            g0(o10, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        bi.b bVar = this.f7234a;
        char c11 = 1;
        if (acVar != null && !this.K1.D0) {
            CharSequence text = acVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((q11[]) spannable.getSpans(0, text.length(), q11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.zc(this.f7274n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.g6.f19960gc, 0, new ga(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(acVar, i13);
                    return;
                }
            }
        }
        k8 k8Var2 = this.K1;
        if (!k8Var2.f7187g && k8Var2.J0 == 0) {
            if (this.N != 0) {
                k8Var2.f7215v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            yb ybVar = this.X0;
            ybVar.x(3, true);
            ea eaVar2 = new ea(this.f7237b, this.K1.I0, bVar);
            eaVar2.r1(this.K1.E0);
            eaVar2.q1(this.K1.f7215v0);
            eaVar2.F = this.M;
            eaVar2.U = new ha(this, 14);
            eaVar2.f1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            eaVar2.n1(size);
            eaVar2.l1(false);
            CharSequence text2 = acVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (s61 s61Var : (s61[]) ((Spanned) text2).getSpans(0, text2.length(), s61.class)) {
                    if (s61Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(s61Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f19363id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f19363id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            eaVar2.S = arrayList2;
            eaVar2.W = new ha(this, 15);
            eaVar2.X = new ha(this, 16);
            eaVar2.T = new pa(this, 10);
            this.f7284q0 = eaVar2;
            k8 k8Var3 = this.K1;
            if (k8Var3.K) {
                if (ybVar != null && !k8Var3.f7186f0 && this.f7252f0 != 2) {
                    k8Var3.f7183e0 = ybVar.getCurrentPosition();
                    Utilities.Callback haVar = new ha(this, 17);
                    View view = this.f7306w1;
                    View view2 = this.f7317z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = ybVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    ybVar.h(haVar, viewArr);
                }
                ea eaVar3 = this.f7284q0;
                Bitmap bitmap = this.K1.f7188g0;
                ga gaVar = new ga(this, 20);
                if (bitmap != null) {
                    eaVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                eaVar3.f6915b0 = bitmapDrawable;
                eaVar3.f6917c0 = gaVar;
                h1 h1Var = eaVar3.f6914b;
                if (h1Var != null) {
                    for (View view3 : h1Var.getViewPages()) {
                        if (view3 instanceof x9) {
                            x9 x9Var = (x9) view3;
                            x9Var.g(false);
                            x9Var.e(false);
                        }
                    }
                }
            }
            this.f7284q0.setOnDismissListener(new va(this, 0));
            this.f7284q0.show();
            return;
        }
        k8Var2.f7196l = false;
        h(null);
        o0();
    }

    public final void X(fc fcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (fcVar != null) {
            this.F = fcVar;
            this.J = fcVar.f6955a;
            rectF.set(fcVar.f6957c);
            this.G = fcVar.f6956b;
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
        this.f7258h0.setBackgroundColor(i10);
    }

    public final void Y(boolean z10) {
        boolean z11;
        if (!this.f7307w2 || z10) {
            this.f7294s2 = false;
            Activity activity = this.f7237b;
            if (activity != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f7294s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    cr crVar = new cr(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    crVar.e = dp;
                    crVar.f24194f = dp2;
                    this.A0.setCameraThumb(crVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f7234a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                        alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new pa(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f19548a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f7307w2 = true;
                }
            }
            if (!this.f7294s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    q();
                } else {
                    CameraController.getInstance().initCamera(new ga(this, 0));
                }
            }
        }
    }

    public final void a0(Runnable runnable) {
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new a3.l0(this, this.B0.getTextureView().getBitmap(), runnable, 21));
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
            animate.alpha(f7).setUpdateListener(new lb(this, 1)).setListener(new ah.q0(this, z10, view, 2)).setDuration(320L).setInterpolator(es.h).start();
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
            this.f7251f.updateViewLayout(this.f7274n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void d() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f7241c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void d0(String str) {
        int i10;
        this.E0.clearAnimation();
        nb nbVar = this.B0;
        if ((nbVar != null && nbVar.isDual()) || this.a2) {
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
        vc vcVar = this.E0;
        if (vcVar.f8021n != i10) {
            vcVar.f8021n = i10;
            ValueAnimator valueAnimator = vcVar.f8022r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vcVar.f8022r = null;
            }
            vcVar.setDrawable(i10);
        }
        if (this.f7252f0 == 0 && !this.I0.e && this.Y1 != null && !H()) {
            z10 = true;
        }
        b0(this.E0, z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bi.q8 o10;
        k8 k8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            i7 i7Var = this.O0;
            if (i7Var != null) {
                i7Var.h();
            }
            if (this.f7273m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f7273m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f7273m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            i7 i7Var2 = this.O0;
            if (i7Var2 != null && !this.V1) {
                i7Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f7252f0;
            int i15 = this.f7241c;
            if (i14 == 1) {
                if (!this.N1 && !this.f7243c1.o()) {
                    bi.x8 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int A = A();
                    bi.q8 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f3962a, A) || ((k8Var = this.K1) != null && (k8Var.f7187g || k8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f7239b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                k8 k8Var2 = this.K1;
                if (k8Var2 == null || k8Var2.J0 == 0) {
                    g0(o10, true);
                }
            }
        }
    }

    public final void e(boolean z10) {
        float height;
        boolean z11;
        int i10;
        u0 u0Var;
        this.K0 = z10;
        Boolean bool = this.f7283p2;
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
                this.f7286q2 = new qa(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f7277n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f7277n2 = null;
            }
            o1.k kVar = this.f7280o2;
            if (kVar != null) {
                kVar.c();
                this.f7280o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    s(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            jb jbVar = this.M0;
            if (jbVar != null) {
                jbVar.K = false;
            }
            if (z10 && (u0Var = this.N0) != null) {
                u0Var.a(false);
            }
            int i11 = 4;
            cc ccVar = this.f7287r;
            if (ccVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ccVar.setImportantForAccessibility(i10);
            }
            jb jbVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            jbVar2.setImportantForAccessibility(i11);
            this.f7283p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            jc jcVar = this.f7274n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (jcVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, jcVar.getHeight());
            jb jbVar3 = this.M0;
            jbVar3.K = !z10;
            if (this.f7266j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f7269k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(jbVar3, o1.h.f16451n, height);
                this.f7280o2 = kVar2;
                kVar2.f16468u.a(0.75f);
                this.f7280o2.f16468u.b(350.0f);
                this.f7280o2.a(new ra(this, height, 0));
                this.f7280o2.h();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f7277n2 = ofFloat;
                ofFloat.addUpdateListener(new sa(this, 0));
                this.f7277n2.addListener(new ib(this, 1));
                this.f7277n2.setDuration(450L);
                this.f7277n2.setInterpolator(es.h);
                this.f7277n2.start();
            }
            if (!z10 && !this.S1) {
                this.f7271l2 = null;
            }
            if (!z10 && this.f7252f0 == 0 && !this.f7294s2) {
                q();
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f7253f1 == null) {
            yj0 yj0Var = new yj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f7253f1 = yj0Var;
            yj0Var.F *= 1.5f;
        }
        this.f7256g1.setAnimation(this.f7253f1);
        int i10 = 20;
        if (!z11) {
            yj0 yj0Var2 = this.f7253f1;
            if (!z10) {
                i10 = 0;
            }
            yj0Var2.N(i10, false, false);
        } else if (z10) {
            yj0 yj0Var3 = this.f7253f1;
            if (yj0Var3.f31602a0 > 20) {
                yj0Var3.N(0, false, false);
            }
            this.f7253f1.P(20);
            this.f7253f1.start();
        } else {
            yj0 yj0Var4 = this.f7253f1;
            int i11 = yj0Var4.f31602a0;
            if (i11 != 0 && i11 < 43) {
                yj0Var4.P(43);
                this.f7253f1.start();
            }
        }
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        cc ccVar = this.f7287r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new sa(this, 5));
            this.E.addListener(new bi.i2(this, f7, runnable, 2));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(es.h);
            } else if (f7 <= 0.0f && ccVar.f6742a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(es.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(es.h);
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
        ccVar.invalidate();
        this.f7274n.invalidate();
        runnable.run();
        n();
    }

    public final void f0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f7274n.findOnBackInvokedDispatcher()) == null) {
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
            d4 d4Var = this.l1;
            if (d4Var != null) {
                d4Var.e(true);
            }
            d4 d4Var2 = this.f7272m1;
            if (d4Var2 != null) {
                d4Var2.e(true);
            }
            d4 d4Var3 = this.f7268k1;
            if (d4Var3 != null) {
                d4Var3.e(true);
            }
            d4 d4Var4 = this.W0;
            if (d4Var4 != null) {
                d4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f7240b2 == H()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f7240b2 = H();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        l0(z11);
        cb cbVar = this.Q0;
        a4 a4Var = this.U0;
        a4 a4Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f7252f0 == 0 && !H()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f7252f0 == 0 && !H()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a4Var2, property2, dp3);
            if (z10 || this.f7252f0 != 0 || !H()) {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a4Var, property, f11);
            if (!z10 && this.f7252f0 == 0 && H()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a4Var, property2, dp4);
            if (z10 || this.f7252f0 != 0 || H()) {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cbVar, property, f12);
            if (z10 || this.f7252f0 != 0 || H()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(cbVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(es.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f7252f0 == 0 && !H()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        a4Var2.setAlpha(f7);
        if (z10 && this.f7252f0 == 0 && !H()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        a4Var2.setTranslationY(dp);
        if (z10 || this.f7252f0 != 0 || !H()) {
            f11 = 0.0f;
        }
        a4Var.setAlpha(f11);
        if (!z10 && this.f7252f0 == 0 && H()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        a4Var.setTranslationY(dp2);
        if (z10 || this.f7252f0 != 0 || H()) {
            f12 = 0.0f;
        }
        cbVar.setAlpha(f12);
        if (z10 || this.f7252f0 != 0 || H()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        cbVar.setTranslationY(f13);
    }

    public final void g0(bi.q8 q8Var, boolean z10) {
        if (this.f7318z2) {
            return;
        }
        sg.j0 j0Var = new sg.j0(q8Var.b(), this.f7241c, this.f7237b, new ob(this, 0), null);
        j0Var.X = A();
        j0Var.setOnDismissListener(new b90(2, this, z10));
        this.X0.x(7, true);
        this.f7318z2 = true;
        j0Var.show();
    }

    public final void h(Runnable runnable) {
        k8 k8Var;
        Runnable runnable2;
        yb ybVar;
        float f7;
        Bitmap.CompressFormat compressFormat;
        ig0 ig0Var = this.B1;
        if (ig0Var != null && (k8Var = this.K1) != null) {
            k8Var.f7192j = ig0Var.d() | k8Var.f7192j;
            k8 k8Var2 = this.K1;
            ig0 ig0Var2 = this.B1;
            File file = k8Var2.Z0;
            if (file != null) {
                file.delete();
                k8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = ig0Var2.getSavedFilterState();
            k8Var2.f7174a1 = savedFilterState;
            if (!k8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = ig0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = k8Var2.R;
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
                        matrix.postScale(f7, f10, k8Var2.f7195k0 / 2.0f, k8Var2.f7197l0 / 2.0f);
                        matrix.postRotate(-k8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        k8Var2.f7200n0.preScale(k8Var2.f7195k0 / createBitmap.getWidth(), k8Var2.f7197l0 / createBitmap.getHeight());
                        k8Var2.f7195k0 = createBitmap.getWidth();
                        k8Var2.f7197l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = k8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            k8Var2.Z0.delete();
                        }
                        String k10 = k8.k(k8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        }
                        boolean z11 = z10;
                        int i11 = k8Var2.f7172a;
                        if (!z11) {
                            str = "jpg";
                        }
                        k8Var2.Z0 = k8.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(k8Var2.Z0);
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
                            Utilities.themeQueue.postRunnable(new bi.h4(k8Var2, createBitmap, z11, runnable2, 2));
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
                k8 k8Var3 = this.K1;
                if (!k8Var3.K && (ybVar = this.X0) != null) {
                    ybVar.set(k8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void h0(boolean z10, boolean z11) {
        if (this.f7247d2 != z10) {
            this.f7247d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(es.h).withEndAction(new qa(this, z10, 1)).start();
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
        if (this.K1 != null && this.D1 != null && this.f7258h0.getMeasuredWidth() > 0 && this.f7258h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f7258h0.getMeasuredWidth() / 2.0f, this.f7258h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f7258h0.getMeasuredWidth() / this.f7258h0.getMeasuredHeight(), this.f7258h0.getMeasuredHeight() / this.f7258h0.getMeasuredWidth(), this.f7258h0.getMeasuredWidth() / 2.0f, this.f7258h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f7258h0.getMeasuredWidth()) * this.K1.f7195k0, (1.0f / this.f7258h0.getMeasuredHeight()) * this.K1.f7197l0);
            matrix.postConcat(this.K1.f7200n0);
            matrix.postScale(this.f7258h0.getMeasuredWidth() / this.K1.f7191i0, this.f7258h0.getMeasuredHeight() / this.K1.f7193j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void i0(boolean z10) {
        Integer num;
        float f7;
        ea1 ea1Var = this.V0;
        if ((ea1Var.getTag() != null && z10) || (ea1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f7250e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ga gaVar = new ga(this, 25);
                this.f7250e2 = gaVar;
                AndroidUtilities.runOnUIThread(gaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f7254f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        ea1Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7254f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            ea1Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f7254f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(ea1Var, property, f7));
        this.f7254f2.addListener(new ah.p0(14, this, z10));
        this.f7254f2.start();
        if (z10) {
            ga gaVar2 = new ga(this, 26);
            this.f7250e2 = gaVar2;
            AndroidUtilities.runOnUIThread(gaVar2, 2000L);
        }
    }

    public final void j() {
        bi.o4 o4Var;
        if (this.J == 1) {
            RectF rectF = this.f7245d0;
            rectF.set(this.f7258h0.getLeft(), this.f7258h0.getTop(), this.f7258h0.getMeasuredWidth(), this.f7258h0.getMeasuredHeight());
            rectF.offset(this.f7287r.getX(), this.f7287r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f7242c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f7258h0.setAlpha(this.I);
            float f10 = rectF3.left;
            wb wbVar = this.f7258h0;
            wbVar.setTranslationX((f10 - wbVar.getLeft()) - this.f7287r.getX());
            float f11 = rectF3.top;
            wb wbVar2 = this.f7258h0;
            wbVar2.setTranslationY((f11 - wbVar2.getTop()) - this.f7287r.getY());
            fc fcVar = this.F;
            if (fcVar != null && (o4Var = fcVar.f6958f) != null) {
                o4Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f6958f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f7258h0.setScaleX(rectF3.width() / this.f7258h0.getMeasuredWidth());
            this.f7258h0.setScaleY(rectF3.height() / this.f7258h0.getMeasuredHeight());
            this.f7261i0.setAlpha(this.I);
            this.f7267k0.setAlpha(this.I);
            this.f7270l0.setAlpha(this.I);
            if (this.f7252f0 == 2) {
                this.f7299u1.setAlpha(this.I);
            }
        }
    }

    public final void j0() {
        ea eaVar = this.f7284q0;
        if (eaVar != null) {
            eaVar.dismiss();
            this.f7284q0 = null;
        }
        ea eaVar2 = new ea(this.f7237b, 86400, this.f7234a);
        eaVar2.p1();
        eaVar2.r1(this.f7313y0);
        TLRPC.InputPeer inputPeer = this.f7309x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f7241c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        eaVar2.q1(inputPeer);
        eaVar2.F = this.M;
        eaVar2.U = new ha(this, 18);
        eaVar2.f1(false);
        eaVar2.n1(1);
        eaVar2.l1(false);
        eaVar2.W = new ha(this, 19);
        eaVar2.T = new pa(this, 12);
        this.f7284q0 = eaVar2;
        eaVar2.show();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: di.kc.k():void");
    }

    public final void k0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.kc.k0(int, boolean, boolean):void");
    }

    public final void l() {
        k8 k8Var;
        if (this.f7302v1 != null && (k8Var = this.K1) != null && k8Var.f7213u) {
            File file = k8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = k8.w(this.f7241c, "webp");
            mb mbVar = this.f7302v1;
            k8 k8Var2 = this.K1;
            ArrayList arrayList = k8Var2.T0;
            boolean z10 = true;
            if (this.O1 == 1) {
                z10 = false;
            }
            Bitmap s02 = mbVar.s0(arrayList, false, false, true, z10, k8Var2);
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
        nb nbVar;
        boolean z17 = false;
        if (this.f7252f0 == 0 && this.O1 == 1 && !this.I0.e && !H()) {
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
        b0(this.f7275n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f7252f0 == 0 && this.Y1 != null && !this.I0.e && !H()) {
            z13 = true;
        } else {
            z13 = false;
        }
        b0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f7252f0 == 0 && (nbVar = this.B0) != null && nbVar.f6683a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        b0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f7252f0 == 0 && !this.I0.e) {
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
        d4 d4Var = this.f7276n1;
        if (z18) {
            d4Var.u();
        } else {
            d4Var.e(true);
        }
        g(this.a2, z10);
        if (this.O1 == -1 && this.f7252f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f7252f0 == 0) {
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
        this.f7275n0.setTranslationX(0.0f);
        float alpha5 = this.f7275n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f8112a;
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
        nb0 nb0Var = this.f7312y;
        if (nb0Var != null) {
            nb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void n0(boolean z10) {
        int i10;
        yj0 yj0Var = this.f7259h1;
        if (yj0Var != null) {
            int[] iArr = yj0Var.e;
            int i11 = 0;
            if (z10) {
                k8 k8Var = this.K1;
                if (k8Var != null && k8Var.f7221y0) {
                    i11 = iArr[0];
                }
                yj0Var.P(i11);
                yj0 yj0Var2 = this.f7259h1;
                if (yj0Var2 != null) {
                    yj0Var2.start();
                    return;
                }
                return;
            }
            k8 k8Var2 = this.K1;
            if (k8Var2 != null && k8Var2.f7221y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            yj0Var.N(i10, false, true);
            this.f7259h1.P(i10);
            ImageView imageView = this.f7262i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void o() {
        if (this.f7297t2 < 0) {
            this.f7297t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f7300u2 = arrayList;
            arrayList.add("off");
            this.f7300u2.add("auto");
            this.f7300u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            w2 w2Var = this.f7291s;
            w2Var.f8038o = f7;
            w2Var.f8037n = w2.f(f7);
            w2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            w2 w2Var2 = this.f7291s;
            w2Var2.f8039p = f10;
            w2Var2.i();
        }
    }

    public final void o0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ga gaVar = new ga(this, 2);
        mb mbVar = this.f7302v1;
        k8 k8Var = this.K1;
        if (mbVar != null && k8Var != null) {
            k8Var.f();
            boolean t02 = mbVar.t0();
            boolean z10 = mbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ja(this, mbVar, k8Var.f7191i0, k8Var.f7193j0, k8Var, z10, t02, gaVar, 1));
            return;
        }
        gaVar.run();
    }

    public final void p(boolean z10) {
        yb ybVar;
        if (this.d) {
            ea eaVar = this.f7284q0;
            if (eaVar != null) {
                eaVar.dismiss();
                this.f7284q0 = null;
            }
            k8 k8Var = this.K1;
            long j10 = 0;
            if (k8Var != null && !k8Var.h) {
                if ((this.v && k8Var.f7187g) || k8Var.f7175b != 0) {
                    k8Var.f7192j = false;
                }
                k8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (ybVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                h81 h81Var = ybVar.f6625y;
                if (h81Var != null) {
                    h81Var.B();
                    ybVar.f6625y.H();
                    ybVar.f6625y = null;
                }
                h81 h81Var2 = ybVar.f6623x;
                if (h81Var2 != null) {
                    j10 = h81Var2.n();
                    ybVar.f6623x.B();
                    ybVar.f6623x.H();
                    ybVar.f6623x = null;
                }
                h81 h81Var3 = ybVar.e;
                if (h81Var3 != null) {
                    j10 = h81Var3.n();
                    ybVar.e.B();
                    ybVar.e.H();
                    ybVar.e = null;
                }
                callback4.run(Long.valueOf(j10), new qa(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f7304w));
                return;
            }
            yb ybVar2 = this.X0;
            if (ybVar2 != null && !z10) {
                ybVar2.set(null);
            }
            f(0.0f, z10, new ga(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f7274n.setBackgroundColor(0);
                this.f7239b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f7241c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean p0() {
        nb nbVar;
        if ((this.P1 || this.Q1) && (nbVar = this.B0) != null && nbVar.isFrontface()) {
            int i10 = this.f7297t2;
            if (i10 == 2 || (i10 == 1 && this.f7244c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        boolean z10;
        Activity activity = this.f7237b;
        if (this.B0 == null && activity != null) {
            this.B0 = new nb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            i7 i7Var = this.O0;
            float f7 = 0.0f;
            if (i7Var != null) {
                i7Var.f7055g0 = 0.0f;
                i7Var.f7056h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(z());
            this.B0.initTexture();
            this.B0.setDelegate(new pa(this, 0));
            wc wcVar = this.F0;
            if (this.B0.f6683a && this.f7252f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b0(wcVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f6683a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!c1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", c1.p(ApplicationLoader.applicationContext, false))) && this.B0.f6683a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new e7(activity, new ha(this, 3));
            }
            this.C0.a(this.B0);
            s7 s7Var = this.D0;
            if (s7Var != null) {
                xb xbVar = this.A0;
                Object blurRenderNode = xbVar.getBlurRenderNode();
                s7Var.F = xbVar;
                s7Var.G = blurRenderNode;
                s7Var.invalidate();
            }
        }
    }

    public final void r() {
        k8 k8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (k8Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!k8Var.K) {
                if (k8Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    pa paVar = new pa(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = k8.q(paVar, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                x71 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                k8 k8Var2 = this.K1;
                if (k8Var2 != null) {
                    savedFilterState = k8Var2.f7174a1;
                }
                ig0 ig0Var = new ig0(this.f7237b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f7288r0, this.f7234a);
                this.B1 = ig0Var;
                this.f7287r.addView(ig0Var);
                gg0 gg0Var = this.C1;
                if (gg0Var != null) {
                    gg0Var.setFilterView(this.B1);
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
                xf0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f7258h0.addView(blurControl);
                }
                zf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f7258h0.addView(curveControl);
                }
                U();
                this.B1.getDoneTextView().setOnClickListener(new ia(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new ia(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f25955i0.setVisibility(0);
            }
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            xb xbVar = this.A0;
            if (xbVar != null && xbVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f7237b == null) {
            return;
        }
        if (this.M0 != null) {
            v();
        }
        MediaController.AlbumEntry albumEntry = this.f7273m2;
        boolean z13 = !z10;
        xb xbVar2 = this.A0;
        if (xbVar2 != null && xbVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        jb jbVar = new jb(this, this.f7241c, this.f7237b, this.f7234a, albumEntry, z10, z13, z11);
        this.M0 = jbVar;
        jbVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new za(this, 1));
        this.M0.setOnSelectListener(new ya(0, this, z10));
        this.M0.setOnSelectMultipleListener(new zh.w0(this, 2));
        s4.a0 a0Var = this.f7271l2;
        if (a0Var != null) {
            e3 e3Var = this.M0.e;
            e3Var.B = a0Var;
            e3Var.l0();
        }
        this.f7274n.addView(this.M0, w7.a6.e(-1, -1, 119));
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: di.kc.t():void");
    }

    public final void u(boolean z10) {
        e7 e7Var = this.C0;
        if (e7Var != null) {
            e7Var.f6896f = null;
            Utilities.globalQueue.cancelRunnable(e7Var.h);
            this.C0 = null;
            xb xbVar = this.A0;
            if (xbVar != null) {
                xbVar.f6858c.a(null);
            }
        }
        s7 s7Var = this.D0;
        if (s7Var != null) {
            s7Var.F = null;
            s7Var.G = null;
            s7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                a0(new ga(this, 8));
                return;
            }
            a0(new ga(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            xb xbVar2 = this.A0;
            if (xbVar2 != null) {
                xbVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void v() {
        jb jbVar = this.M0;
        if (jbVar == null) {
            return;
        }
        this.f7274n.removeView(jbVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f7277n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7277n2 = null;
        }
        o1.k kVar = this.f7280o2;
        if (kVar != null) {
            kVar.c();
            this.f7280o2 = null;
        }
        this.f7283p2 = null;
    }

    public final void x() {
        ig0 ig0Var = this.B1;
        if (ig0Var == null) {
            return;
        }
        ig0Var.e();
        this.C1.setFilterView(null);
        this.f7287r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f7258h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        xf0 xf0Var = this.E1;
        if (xf0Var != null) {
            this.f7258h0.removeView(xf0Var);
            this.E1 = null;
        }
        zf0 zf0Var = this.F1;
        if (zf0Var != null) {
            this.f7258h0.removeView(zf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void y() {
        mb mbVar = this.f7302v1;
        if (mbVar != null) {
            mbVar.R0.removeAllViews();
            mb mbVar2 = this.f7302v1;
            mbVar2.O0.h();
            mbVar2.R0.setVisibility(8);
            mbVar2.Q0.setVisibility(8);
            mbVar2.E0.postRunnable(new ah.j(8));
            x5 x5Var = mbVar2.f7532k2;
            if (x5Var != null) {
                x5Var.dismiss();
            }
            qg.x xVar = mbVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f7287r.removeView(this.f7302v1);
            this.f7302v1 = null;
            qg.c1 c1Var = this.f7306w1;
            if (c1Var != null) {
                this.f7258h0.removeView(c1Var);
                this.f7306w1 = null;
            }
            View view = this.f7314y1;
            if (view != null) {
                this.f7258h0.removeView(view);
                this.f7314y1 = null;
            }
            View view2 = this.f7310x1;
            if (view2 != null) {
                this.f7258h0.removeView(view2);
                this.f7310x1 = null;
            }
            View view3 = this.f7317z1;
            if (view3 != null) {
                this.f7258h0.removeView(view3);
                this.f7317z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f7258h0.removeView(view4);
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
        return this.f7237b.getResources().getDrawable(R.drawable.icplaceholder);
    }
}
