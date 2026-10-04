package ci;

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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ba1;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
public final class kc implements NotificationCenter.NotificationCenterDelegate {
    public static kc F2;
    public final xb A0;
    public View A1;
    public boolean A2;
    public nb B0;
    public vf0 B1;
    public boolean B2;
    public f7 C0;
    public final tf0 C1;
    public sb C2;
    public final t7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final wc E0;
    public kf0 E1;
    public ValueAnimator E2;
    public fc F;
    public final xc F0;
    public mf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final wc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final ad J0;
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
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final j7 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final cb Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final v2 R0;
    public boolean R1;
    public int S;
    public final v2 S0;
    public boolean S1;
    public int T;
    public final b4 T0;
    public float T1;
    public int U;
    public final b4 U0;
    public int U1;
    public boolean V;
    public final ba1 V0;
    public boolean V1;
    public boolean W;
    public final e4 W0;
    public boolean W1;
    public boolean X;
    public final yb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final vc Z0;
    public AnimatorSet Z1;
    public final ai.d f5373a;
    public int f5374a0;
    public final zc f5375a1;
    public boolean a2;
    public final Activity f5376b;
    public int f5377b0;
    public final u6 f5378b1;
    public boolean f5379b2;
    public final int f5380c;
    public final RectF f5381c0;
    public final ac f5382c1;
    public boolean f5383c2;
    public boolean d;
    public final RectF f5384d0;
    public final bb f5385d1;
    public boolean f5386d2;
    public boolean f5387e;
    public final Path f5388e0;
    public final u0 f5389e1;
    public Runnable f5390e2;
    public final WindowManager f5391f;
    public int f5392f0;
    public kj0 f5393f1;
    public AnimatorSet f5394f2;
    public int f5395g0;
    public final nj0 f5396g1;
    public ma f5397g2;
    public final WindowManager.LayoutParams h;
    public final wb f5398h0;
    public kj0 f5399h1;
    public boolean f5400h2;
    public final FrameLayout f5401i0;
    public ImageView f5402i1;
    public AnimatorSet f5403i2;
    public final LinearLayout f5404j0;
    public final r6 f5405j1;
    public ValueAnimator f5406j2;
    public final FrameLayout f5407k0;
    public final e4 f5408k1;
    public boolean f5409k2;
    public final ai.f0 f5410l0;
    public final e4 l1;
    public s4.b0 f5411l2;
    public final FrameLayout m0;
    public final e4 f5412m1;
    public MediaController.AlbumEntry f5413m2;
    public final jc f5414n;
    public final v2 f5415n0;
    public final e4 f5416n1;
    public ValueAnimator f5417n2;
    public final d8 f5418o0;
    public final v6 f5419o1;
    public o1.k f5420o2;
    public final org.telegram.ui.ActionBar.i5 f5421p0;
    public final yc f5422p1;
    public Boolean f5423p2;
    public ea f5424q0;
    public p f5425q1;
    public qa f5426q2;
    public final cc f5427r;
    public final org.telegram.ui.Components.ka f5428r0;
    public ub f5429r1;
    public AnimatorSet f5430r2;
    public final x2 f5431s;
    public final a7 f5432s0;
    public vb f5433s1;
    public boolean f5434s2;
    public final ab f5435t0;
    public final vc f5436t1;
    public int f5437t2;
    public boolean f5438u0;
    public final d f5439u1;
    public ArrayList f5440u2;
    public boolean v;
    public long f5441v0;
    public mb f5442v1;
    public FrameLayout f5443v2;
    public long f5444w;
    public String f5445w0;
    public pg.f1 f5446w1;
    public boolean f5447w2;
    public bc f5448x;
    public TLRPC.InputPeer f5449x0;
    public View f5450x1;
    public ga f5451x2;
    public final ib0 f5452y;
    public ca f5453y0;
    public View f5454y1;
    public ai.o8 f5455y2;
    public t f5456z0;
    public View f5457z1;
    public boolean f5458z2;

    public kc(Activity activity, int i10) {
        ib0 ib0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        ai.d dVar = new ai.d();
        this.f5373a = dVar;
        this.f5444w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f5381c0 = new RectF();
        this.f5384d0 = new RectF();
        this.f5388e0 = new Path();
        new Rect();
        this.f5392f0 = 0;
        this.f5395g0 = -1;
        this.f5453y0 = new ca();
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
        this.f5386d2 = true;
        this.f5409k2 = true;
        this.f5437t2 = -1;
        this.f5376b = activity;
        this.f5380c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            ib0Var = new ib0(launchActivity, true);
        } else {
            ib0Var = null;
        }
        this.f5452y = ib0Var;
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
        this.f5391f = windowManager;
        jc jcVar = new jc(this, activity);
        this.f5414n = jcVar;
        pa paVar = new pa(this, 1);
        WeakHashMap weakHashMap = r0.i0.f45595a;
        r0.a0.j(jcVar, paVar);
        this.f5414n.setFocusable(true);
        this.f5414n.setImportantForAccessibility(2);
        x2 x2Var = new x2(activity, windowManager, this.f5414n, layoutParams);
        this.f5431s = x2Var;
        x2Var.a(new qb(this));
        this.f5414n.addView(this.f5431s.f6265b, new ViewGroup.LayoutParams(-1, -1));
        jc jcVar2 = this.f5414n;
        cc ccVar = new cc(this, activity);
        this.f5427r = ccVar;
        jcVar2.addView(ccVar);
        cc ccVar2 = this.f5427r;
        wb wbVar = new wb(this, activity);
        this.f5398h0 = wbVar;
        ccVar2.addView(wbVar);
        this.f5427r.addView(this.f5431s.f6266c, new ViewGroup.LayoutParams(-1, -1));
        this.f5428r0 = new org.telegram.ui.Components.ka(this.f5398h0);
        this.f5432s0 = new Object();
        cc ccVar3 = this.f5427r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f5401i0 = frameLayout;
        ccVar3.addView(frameLayout);
        cc ccVar4 = this.f5427r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f5407k0 = frameLayout2;
        ccVar4.addView(frameLayout2);
        cc ccVar5 = this.f5427r;
        ai.f0 f0Var = new ai.f0(this, activity, 2);
        this.f5410l0 = f0Var;
        ccVar5.addView(f0Var);
        this.f5410l0.setVisibility(8);
        this.f5410l0.setAlpha(0.0f);
        cc ccVar6 = this.f5427r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        ccVar6.addView(frameLayout3);
        org.telegram.ui.Components.rc.a(this.f5414n, new z8(2));
        xb xbVar = new xb(this, activity, this.f5428r0, this.f5427r, dVar);
        this.A0 = xbVar;
        jc jcVar3 = this.f5414n;
        Objects.requireNonNull(jcVar3);
        xbVar.setCancelGestures(new androidx.fragment.app.a0(jcVar3, 23));
        this.A0.setResetState(new ga(this, 13));
        this.f5398h0.addView(this.A0, w7.z5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ia(this, 12));
        wb wbVar2 = this.f5398h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        wbVar2.setBackgroundColor(i11);
        wb wbVar3 = this.f5398h0;
        ai.k2 k2Var = yf.f0.f50979a;
        wbVar3.setOutlineProvider(new yf.d0(0, AndroidUtilities.dp(12.0f)));
        this.f5398h0.setClipToOutline(true);
        ga gaVar = new ga(this, 14);
        ?? view = new View(activity);
        view.f31032a = new TextPaint(1);
        view.f31033b = new TextPaint(1);
        tr trVar = tr.h;
        view.f31039s = new org.telegram.ui.Components.e6((View) view, 0L, 350L, trVar);
        view.I = new lc0(view, 8);
        view.f31041x = gaVar;
        this.C1 = view;
        yb ybVar = new yb(this, activity, this.f5428r0, this.f5432s0);
        this.X0 = ybVar;
        ybVar.setCollageView(this.A0);
        yb ybVar2 = this.X0;
        ybVar2.v = new ga(this, 15);
        ybVar2.setOnTapListener(new ga(this, 16));
        this.X0.setVisibility(8);
        yb ybVar3 = this.X0;
        ybVar3.N = new ga(this, 17);
        this.f5398h0.addView(ybVar3, w7.z5.e(-1, -1, 119));
        this.f5398h0.addView(this.C1, w7.z5.e(-1, -1, 119));
        jc jcVar4 = this.f5414n;
        ac acVar = new ac(this, activity, jcVar4, jcVar4, this.f5427r, dVar, this.f5428r0);
        this.f5382c1 = acVar;
        acVar.setAccount(i10);
        this.f5382c1.setUiBlurBitmap(new pa(this, 6));
        org.telegram.ui.Components.rc.a(this.f5410l0, new ai.w4(this, 3));
        this.f5382c1.setOnHeightUpdate(new ha(this, 13));
        this.f5382c1.setOnPeriodUpdate(new ha(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f5382c1.setDialogId(j3);
        }
        this.f5382c1.setOnPremiumHint(new ha(this, 5));
        this.f5382c1.setOnKeyboardOpen(new ha(this, 6));
        ab abVar = new ab(this, activity, 0);
        this.f5435t0 = abVar;
        this.f5427r.addView(abVar);
        vc vcVar = new vc(activity, this.f5427r, this.f5398h0, dVar, this.f5428r0);
        this.Z0 = vcVar;
        vcVar.setOnTimelineClick(new ga(this, 10));
        this.Z0.setOnHeightChange(new ga(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.z5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        zc zcVar = new zc(activity);
        this.f5375a1 = zcVar;
        zcVar.setVisibility(8);
        this.f5375a1.a(false);
        this.Y0.addView(this.f5375a1, w7.z5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f5410l0.addView(this.Y0, w7.z5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f5410l0.addView(this.f5382c1, w7.z5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        vc vcVar2 = new vc(activity, this.f5427r, this.f5398h0, dVar, this.f5428r0);
        this.f5436t1 = vcVar2;
        vcVar2.X0 = true;
        vcVar2.setVisibility(8);
        this.f5436t1.setAlpha(0.0f);
        this.f5410l0.addView(this.f5436t1, w7.z5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        bb bbVar = new bb(this, activity, dVar, this.f5428r0);
        this.f5385d1 = bbVar;
        bbVar.setVisibility(8);
        this.f5410l0.addView(this.f5385d1, w7.z5.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f5415n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        v2 v2Var = this.f5415n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        v2Var.setScaleType(scaleType);
        this.f5415n0.setImageResource(R.drawable.msg_photo_back);
        v2 v2Var2 = this.f5415n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        v2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5415n0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.f5415n0.setOnClickListener(new ia(this, 1));
        this.f5401i0.addView(this.f5415n0, w7.z5.e(56, 56, 51));
        this.f5431s.a(this.f5415n0);
        d8 d8Var = new d8(activity, i10);
        this.f5418o0 = d8Var;
        d8Var.a(false, false);
        this.f5418o0.setOnClickListener(new ai.f2(6, this, activity));
        this.f5401i0.addView(this.f5418o0, w7.z5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(activity);
        this.f5421p0 = i5Var;
        i5Var.setTextSize(20);
        this.f5421p0.setGravity(19);
        this.f5421p0.setTextColor(-1);
        this.f5421p0.setTypeface(AndroidUtilities.bold());
        this.f5421p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f5421p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f5421p0.setAlpha(0.0f);
        this.f5421p0.setVisibility(8);
        this.f5421p0.setEllipsizeByGradient(true);
        this.f5421p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f5401i0.addView(this.f5421p0, w7.z5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f5404j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f5404j0.setGravity(5);
        this.f5401i0.addView(this.f5404j0, w7.z5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        ha haVar = new ha(this, 7);
        jc jcVar5 = this.f5414n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f6050w = true;
        imageView2.f6051x = true;
        imageView2.h = haVar;
        imageView2.f6042a = i10;
        imageView2.f6043b = jcVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.v0(imageView2, 9));
        imageView2.f6046f = new wp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f5389e1 = imageView2;
        e4 e4Var = new e4(activity, 1);
        e4Var.l(1.0f, -71.0f);
        e4Var.d = 2000L;
        e4Var.U = false;
        e4Var.H.o(true, false, false);
        this.f5408k1 = e4Var;
        e4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5401i0.addView(this.f5408k1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f5396g1 = imageView3;
        imageView3.setScaleType(scaleType);
        nj0 nj0Var = this.f5396g1;
        k8 k8Var = this.K1;
        if (k8Var != null && k8Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        nj0Var.setImageResource(i12);
        this.f5396g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5396g1.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.f5396g1.setOnClickListener(new ia(this, 2));
        this.f5396g1.setVisibility(8);
        this.f5396g1.setAlpha(0.0f);
        r6 r6Var = new r6(activity);
        this.f5405j1 = r6Var;
        r6Var.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.f5405j1.setVisibility(8);
        this.f5405j1.setAlpha(0.0f);
        this.f5405j1.setOnClickListener(new ia(this, 3));
        this.f5404j0.addView(this.f5405j1, w7.z5.q(46, 56, 53));
        this.f5404j0.addView(this.f5396g1, w7.z5.q(46, 56, 53));
        this.f5404j0.addView(this.f5389e1, w7.z5.e(46, 56, 53));
        wc wcVar = new wc(activity);
        this.E0 = wcVar;
        wcVar.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ia(this, 4));
        this.E0.setOnLongClickListener(new m5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f5431s.a(this.E0);
        this.f5401i0.addView(this.E0, w7.z5.e(56, 56, 53));
        xc xcVar = new xc(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = xcVar;
        xcVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ia(this, 5));
        boolean q6 = d1.q(activity);
        xc xcVar2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        xcVar2.setVisibility(i13);
        xc xcVar3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        xcVar3.setAlpha(f7);
        this.f5431s.a(this.F0);
        this.f5401i0.addView(this.F0, w7.z5.e(56, 56, 53));
        ?? wcVar2 = new wc(activity);
        this.G0 = wcVar2;
        wcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        if (this.f5456z0 == null) {
            i14 = 6;
            this.f5456z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new ia(this, i14));
        this.G0.a(new u(this.f5456z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f5431s.a(this.G0);
        this.f5401i0.addView(this.G0, w7.z5.e(56, 56, 53));
        wc wcVar3 = new wc(activity);
        this.H0 = wcVar3;
        wcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ia(this, 7));
        this.f5431s.a(this.H0);
        this.f5401i0.addView(this.H0, w7.z5.e(56, 56, 53));
        y yVar = new y(activity, this.f5431s);
        this.I0 = yVar;
        yVar.f6323a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new ha(this, 8));
        this.f5401i0.addView(this.I0, w7.z5.e(-1, 56, 53));
        e4 e4Var2 = new e4(activity, 1);
        e4Var2.l(1.0f, -20.0f);
        e4Var2.d = 5000L;
        e4Var2.i();
        e4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        e4Var2.f4997l0 = new ai.f(9);
        this.l1 = e4Var2;
        e4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5401i0.addView(this.l1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(activity, 2);
        e4Var3.l(0.0f, 28.0f);
        e4Var3.d = 5000L;
        e4Var3.p(true);
        this.f5412m1 = e4Var3;
        this.f5401i0.addView(e4Var3, w7.z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        e4 e4Var4 = new e4(activity, 1);
        e4Var4.l(1.0f, -20.0f);
        e4Var4.d = 5000L;
        e4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f5416n1 = e4Var4;
        e4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5401i0.addView(this.f5416n1, w7.z5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f4716a = paint;
        Paint paint2 = new Paint(1);
        view2.f4717b = paint2;
        view2.f4719e = new org.telegram.ui.Components.e6((View) view2, 0L, 250L, trVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        view2.f4718c = o6Var;
        o6Var.k(0.3f, 250L, trVar);
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.r(-1);
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(view2);
        o6Var.f29239b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        i0(false, false);
        this.f5401i0.addView(this.J0, w7.z5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f5431s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        j7 j7Var = new j7(activity);
        this.O0 = j7Var;
        j7Var.setDelegate(fbVar);
        j7 j7Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j7Var2.f5233n0 = -1.0f;
        j7Var2.f5234o0 = z10;
        j7Var2.invalidate();
        this.f5407k0.addView(this.O0, w7.z5.e(-1, 100, 87));
        this.f5431s.a(this.O0);
        j7 j7Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        j7Var3.e(f10, true);
        d dVar2 = new d(activity, dVar, true);
        this.P0 = dVar2;
        dVar2.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f5407k0.addView(this.P0, w7.z5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ia(this, 8));
        e4 e4Var5 = new e4(activity, 3);
        e4Var5.p(true);
        e4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        e4Var5.h = AndroidUtilities.dp(320.0f);
        e4Var5.d = 5000L;
        e4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = e4Var5;
        this.f5407k0.addView(e4Var5, w7.z5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        ba1 ba1Var = new ba1(activity);
        this.V0 = ba1Var;
        ba1Var.M = false;
        ba1Var.setAlpha(0.0f);
        this.f5407k0.addView(this.V0, w7.z5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new pa(this, 4));
        ba1 ba1Var2 = this.V0;
        this.T1 = 0.0f;
        ba1Var2.b(0.0f, false);
        t7 t7Var = new t7(activity, i10, new ga(this, 12));
        this.D0 = t7Var;
        t7Var.f5988c = new ha(this, 9);
        this.f5407k0.addView(t7Var, w7.z5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        cb cbVar = new cb(this, activity);
        this.Q0 = cbVar;
        cbVar.setOnSwitchModeListener(new ha(this, 10));
        this.Q0.setOnSwitchingModeListener(new ha(this, 11));
        this.m0.addView(this.Q0, w7.z5.e(-1, 48, 55));
        this.f5431s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.z5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5431s.a(this.R0);
        this.R0.setOnClickListener(new ia(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.z5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5431s.a(this.S0);
        this.S0.setOnClickListener(new ia(this, 10));
        b4 b4Var = new b4(activity);
        this.T0 = b4Var;
        this.m0.addView(b4Var, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5431s.a(this.T0);
        b4 b4Var2 = new b4(activity);
        this.U0 = b4Var2;
        b4Var2.f4734a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        b4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.z5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5431s.a(this.U0);
        d dVar3 = new d(activity, dVar, true);
        dVar3.setRoundRadius(24);
        this.f5439u1 = dVar3;
        dVar3.setVisibility(8);
        this.f5439u1.setAlpha(0.0f);
        this.f5439u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f5439u1.setOnClickListener(new ia(this, 11));
        this.m0.addView(this.f5439u1, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f6065b = new ArrayList();
        frameLayout5.f6067e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f6064a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.z5.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f6067e = true;
        t6 t6Var = new t6(frameLayout5, activity, string, true);
        frameLayout5.f6066c = t6Var;
        t6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f6066c, w7.z5.c(-2.0f, -2));
        frameLayout5.e();
        this.f5378b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f5378b1.setOnClickListener(new ha(this, 12));
        this.m0.addView(this.f5378b1, w7.z5.e(-1, 52, 23));
        yc ycVar = new yc(activity);
        this.f5422p1 = ycVar;
        ycVar.setAlpha(0.0f);
        this.f5422p1.setVisibility(8);
        this.f5398h0.addView(this.f5422p1, w7.z5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        v6 v6Var = new v6(activity, i10, dVar);
        this.f5419o1 = v6Var;
        this.f5398h0.addView(v6Var, w7.z5.e(-1, -1, 119));
        m0(false);
    }

    public static kc E(Activity activity, int i10) {
        kc kcVar = F2;
        if (kcVar != null && (kcVar.f5376b != activity || kcVar.f5380c != i10)) {
            kcVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new kc(activity, i10);
        }
        return F2;
    }

    public static void a(kc kcVar) {
        nb nbVar = kcVar.B0;
        boolean z10 = false;
        if (nbVar != null && nbVar.getTextureView() != null) {
            Bitmap bitmap = kcVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                kcVar.f5383c2 = false;
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
            kcVar.f5383c2 = z10;
            return;
        }
        kcVar.f5383c2 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(kc kcVar) {
        Activity activity = kcVar.f5376b;
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

    public static void c(kc kcVar) {
        ValueAnimator valueAnimator = kcVar.f5406j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            kcVar.f5406j2 = null;
        }
        kcVar.f5409k2 = false;
        cc ccVar = kcVar.f5427r;
        float f7 = ccVar.f4842a;
        float f10 = ccVar.f4843b;
        ccVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        kcVar.f5406j2 = ofFloat;
        ofFloat.addUpdateListener(new xa(kcVar, f7, f10, 0));
        kcVar.f5406j2.setDuration(340L);
        kcVar.f5406j2.setInterpolator(tr.h);
        kcVar.f5406j2.addListener(new ib(kcVar, 0));
        kcVar.f5406j2.start();
    }

    public static boolean d(kc kcVar) {
        Activity activity = kcVar.f5376b;
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
        spannableString.setSpan(new rb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        kc kcVar = F2;
        if (kcVar != null) {
            kcVar.q(false);
        }
        F2 = null;
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
        return this.f5376b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
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

    public final String C() {
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f5440u2.get(this.f5437t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 D() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f5376b);
            this.N0 = v0Var;
            this.f5407k0.addView(v0Var, w7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        int i10;
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f5440u2;
                if (this.f5437t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f5437t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f5402i1 == null) {
            kj0 kj0Var = new kj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5399h1 = kj0Var;
            kj0Var.h = true;
            k8 k8Var = this.K1;
            if (k8Var != null && k8Var.f5359y0) {
                kj0Var.M(35);
                this.f5399h1.P(36);
            } else {
                kj0Var.P(0);
                this.f5399h1.M(0);
            }
            this.f5399h1.Z = true;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.J9, this.f5373a);
            this.f5399h1.Q(v02, "Sunny");
            this.f5399h1.Q(v02, "Path 6");
            this.f5399h1.Q(v02, "Path");
            this.f5399h1.Q(v02, "Path 5");
            this.f5399h1.o();
            ImageView imageView = new ImageView(this.f5376b);
            this.f5402i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f5402i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f5402i1.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
            this.f5402i1.setOnClickListener(new ia(this, 0));
            this.f5402i1.setVisibility(8);
            this.f5402i1.setImageDrawable(this.f5399h1);
            this.f5402i1.setAlpha(0.0f);
            this.f5404j0.addView(this.f5402i1, 0, w7.z5.q(46, 56, 53));
        }
        return this.f5402i1;
    }

    public final void H() {
        mb mbVar = this.f5442v1;
        if (mbVar == null) {
            return;
        }
        this.f5443v2 = null;
        mbVar.getTopLayout().setAlpha(0.0f);
        this.f5442v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f5442v1.getBottomLayout().setAlpha(0.0f);
        this.f5442v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f5442v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f5442v1.setVisibility(8);
    }

    public final boolean I() {
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

    public final boolean J() {
        jb jbVar;
        if (!this.W && (jbVar = this.M0) != null) {
            if (jbVar.getTranslationY() < (this.f5414n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            ma maVar = this.f5397g2;
            if (maVar != null) {
                AndroidUtilities.cancelRunOnUIThread(maVar);
            }
            this.f5400h2 = true;
            this.S1 = true;
            this.f5397g2 = new ma(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f5397g2, j3);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f5397g2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.M():boolean");
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
            this.O0.setVisibility(8);
            this.V0.setVisibility(8);
            this.Q0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.f5436t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f5410l0.setVisibility(i17);
            this.f5382c1.setVisibility(8);
            this.f5439u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f5378b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5410l0.setVisibility(i14);
            this.f5396g1.setVisibility(8);
            this.f5405j1.setVisibility(8);
            this.f5389e1.setVisibility(8);
            ImageView imageView = this.f5402i1;
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
                z();
                y();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.f5421p0.setVisibility(i16);
            w();
            this.f5422p1.setAlpha(0.0f);
            this.f5422p1.setVisibility(8);
            this.f5375a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            k8 k8Var = this.K1;
            if (k8Var == null || !k8Var.f5337n) {
                u();
                H();
            }
            tf0 tf0Var = this.C1;
            if (tf0Var != null) {
                tf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            k8 k8Var2 = this.K1;
            if (k8Var2 != null && k8Var2.f5327h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5375a1.setVisibility(i13);
            this.f5410l0.setAlpha(1.0f);
            this.f5410l0.setTranslationY(0.0f);
            k8 k8Var3 = this.K1;
            this.f5382c1.setVisibility((k8Var3 == null || k8Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.f6101r.d(0.0f, true);
            D.a(true);
            androidx.fragment.app.a0 a0Var = D.h;
            if (a0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
            }
            androidx.fragment.app.a0 a0Var2 = new androidx.fragment.app.a0(D, 9);
            D.h = a0Var2;
            AndroidUtilities.runOnUIThread(a0Var2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        tf0 tf0Var2 = this.C1;
        if (tf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f5395g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            tf0Var2.setAllowTouch(z11);
        }
        ac acVar = this.f5382c1;
        if (acVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            acVar.f5516e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f5380c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            ai.l9 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        k8 k8Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j3;
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
        t71 textureView;
        k8 k8Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            j7 j7Var = this.O0;
            if (j7Var != null) {
                j7Var.g(false);
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
            e0(null);
            b0(new ga(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            e4 e4Var = this.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f5380c;
        if (i11 != 1 && i10 != 1) {
            j3 = 0;
        } else {
            if (i11 == 1) {
                k8Var = this.K1;
            } else {
                k8Var = null;
            }
            this.f5389e1.setEntry(k8Var);
            if (this.O1 == 1) {
                this.f5396g1.setVisibility(0);
                k8 k8Var10 = this.K1;
                if (k8Var10 != null && k8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f5405j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((sg0) this.f5405j1.f5868c).a(this.X0.k(), false);
                this.f5421p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                k8 k8Var11 = this.K1;
                if (k8Var11 != null && !TextUtils.isEmpty(k8Var11.f5358y)) {
                    this.f5396g1.setVisibility(8);
                    this.f5405j1.setVisibility(0);
                    ((sg0) this.f5405j1.f5868c).a(true, false);
                    this.f5421p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f5421p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f5389e1.setVisibility(0);
            k8 k8Var12 = this.K1;
            if (k8Var12 != null && k8Var12.f5351u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f5402i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f5378b1.setVisibility(0);
            this.X0.setVisibility(0);
            k8 k8Var13 = this.K1;
            if ((k8Var13 != null && k8Var13.J0 != 0) || this.f5441v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f5382c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            k8 k8Var14 = this.K1;
            if ((k8Var14 != null && k8Var14.J0 != 0) || this.f5441v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f5410l0.setVisibility(0);
            this.f5410l0.clearFocus();
            k8 k8Var15 = this.K1;
            if (k8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = k8Var15.I0;
            }
            this.f5382c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((k8Var2 = this.K1) == null || !k8Var2.f5325g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5382c1.setPeriodVisible(z10);
            k8 k8Var16 = this.K1;
            if (k8Var16 != null && k8Var16.f5340o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5382c1.setHasRoundVideo(z11);
            ac acVar = this.f5382c1;
            if (acVar == null) {
                j3 = 0;
            } else {
                k8 k8Var17 = this.K1;
                if (k8Var17 == null || !k8Var17.f5337n) {
                    j3 = 0;
                    acVar.v(null, null);
                } else {
                    TLRPC.Peer peer = k8Var17.f5343q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        k8 k8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        k8Var18.f5341p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        k8 k8Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        k8Var19.f5341p = append;
                    }
                    String str3 = this.K1.f5347s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f5382c1.v(str4, append);
                }
            }
            k8 k8Var20 = this.K1;
            if (k8Var20 != null && k8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            vc vcVar = this.Z0;
            boolean z22 = vcVar.f6157j0;
            vcVar.f6157j0 = z12;
            vcVar.f6155i0.f(z12, true);
            vcVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f5421p0.setVisibility(0);
            this.f5436t1.setVisibility(0);
            k8 k8Var21 = this.K1;
            if (k8Var21 != null && k8Var21.f5313b0) {
                this.f5421p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f5410l0.setVisibility(0);
            this.f5439u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f5421p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            k8 k8Var22 = this.K1;
            if (k8Var22 != null && k8Var22.J0 != j3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (k8Var22 != null && k8Var22.f5325g) {
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
            u6 u6Var = this.f5378b1;
            if (!TextUtils.equals(string, u6Var.d) || z23 != u6Var.f6067e) {
                u6Var.removeView(u6Var.f6066c);
                Context context = u6Var.getContext();
                u6Var.d = string;
                u6Var.f6067e = z23;
                t6 t6Var = new t6(u6Var, context, string, z23);
                u6Var.f6066c = t6Var;
                t6Var.setContentDescription(string);
                u6Var.addView(u6Var.f6066c, w7.z5.c(-2.0f, -2));
                u6Var.e();
            }
            this.f5436t1.setVisibility(8);
            this.f5439u1.setVisibility(8);
            if (!this.f5400h2) {
                k8 k8Var23 = this.K1;
                if (k8Var23 != null && k8Var23.f5351u) {
                    this.X0.l(k8Var23);
                } else {
                    this.X0.set(k8Var23);
                }
            }
            this.f5400h2 = false;
            eu editText = this.f5382c1.f5517f.getEditText();
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
            this.f5385d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                bb bbVar = this.f5385d1;
                bbVar.c(false, false);
                bbVar.f5964c = arrayList;
                bbVar.d = arrayList2;
                bbVar.f5965e = arrayList3;
                bbVar.f5970w = new e11(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                bbVar.K = new e11(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                bbVar.f5963b.f25244f3.N(false);
                this.f5385d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((k8Var8 = this.K1) == null || (!k8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                k8 k8Var24 = this.K1;
                if (k8Var24 != null && (k8Var24.f5315c || k8Var24.f5325g || this.f5438u0)) {
                    if (k8Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    k8 k8Var25 = this.K1;
                    if (k8Var25.K && k8Var25.f5311a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new pa(this, 7));
                    }
                    this.f5382c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ac acVar2 = this.f5382c1;
                    acVar2.V = true;
                    acVar2.f5517f.setText("");
                }
            }
            k8 k8Var26 = this.K1;
            if (k8Var26 != null && ((k8Var26.f5351u && !k8Var26.K) || k8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f5378b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (k8Var7 = this.K1) != null && !k8Var7.f5351u && !k8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f5378b1.d(3, z19);
            if (!this.N1 && !this.f5382c1.o()) {
                ai.l9 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                ai.f9 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.f1290a, B) || ((k8Var6 = this.K1) != null && (k8Var6.f5325g || k8Var6.J0 != j3))) {
                    z20 = true;
                    this.f5378b1.setShareEnabled(z20);
                    k8Var4 = this.K1;
                    if (k8Var4 == null && k8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f5396g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f5421p0.setVisibility(0);
                    this.f5421p0.setTranslationX(0.0f);
                    k8Var5 = this.K1;
                    if (k8Var5 == null && k8Var5.J0 != j3) {
                        this.f5421p0.l("", false);
                    } else if (k8Var5 == null && k8Var5.f5325g) {
                        this.f5421p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (k8Var5 == null && k8Var5.f5351u) {
                        this.f5421p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (k8Var5 == null && k8Var5.f5337n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(this.f5421p0, 32.0f, i18);
                        this.f5421p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(h5Var, 0, 1, 33);
                        if (this.K1.f5343q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f5343q.user_id));
                            h5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f5343q)));
                            h5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f5421p0.l(spannableStringBuilder, false);
                    } else {
                        this.f5421p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f5378b1.setShareEnabled(z20);
            k8Var4 = this.K1;
            if (k8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f5396g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f5421p0.setVisibility(0);
            this.f5421p0.setTranslationX(0.0f);
            k8Var5 = this.K1;
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            if (k8Var5 == null) {
            }
            this.f5421p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            ac acVar3 = this.f5382c1;
            b80 b80Var = acVar3.V0;
            if (b80Var != null) {
                b80Var.u();
                acVar3.V0 = null;
            }
            this.f5408k1.e(z21);
            bb bbVar2 = this.f5385d1;
            if (bbVar2.M) {
                bbVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (k8Var3 = this.K1) != null) {
            if (k8Var3.f5321e0 < j3) {
                k8Var3.f5321e0 = j3;
            }
            this.M1 = k8Var3.f5321e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f5327h0;
            } else {
                duration = this.X0.getDuration();
            }
            k8 k8Var27 = this.K1;
            if (k8Var27.f5327h0 <= 0) {
                k8Var27.f5327h0 = duration;
            }
            File file = k8Var27.Z0;
            if (file == null) {
                file = k8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            k8 k8Var28 = this.K1;
            this.f5436t1.o(false, absolutePath, k8Var28.f5327h0, k8Var28.P);
            k8 k8Var29 = this.K1;
            float f10 = (float) duration;
            long j10 = k8Var29.Z * f10;
            long j11 = k8Var29.f5310a0 * f10;
            vc vcVar2 = this.f5436t1;
            vcVar2.Z0 = j10;
            vcVar2.f6136a1 = j11;
            pc pcVar = vcVar2.h;
            if (pcVar != null) {
                pc.a(pcVar, true);
            }
            bi.v vVar = new bi.v(this, 8);
            this.f5436t1.setDelegate(new kb(vVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f5436t1.setVideoLeft(max);
            this.f5436t1.setVideoRight(0.04f + max);
            vVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            tf0Var.setAllowTouch(false);
        }
        e4 e4Var2 = this.f5412m1;
        boolean z24 = true;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        org.telegram.ui.Components.rc.e();
        ac acVar4 = this.f5382c1;
        if (acVar4 != null) {
            g gVar = acVar4.f5517f;
            gVar.d();
            gVar.k(true);
            this.f5382c1.f5516e0 = true;
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
        mb mbVar = this.f5442v1;
        if (mbVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            mbVar.setCoverPreview(z14);
        }
        e4 e4Var3 = this.f5416n1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        xb xbVar2 = this.A0;
        xbVar2.setPreview((i11 == 1 && xbVar2.j()) ? false : false);
    }

    public final void P() {
        pg.d1 d1Var;
        int i10;
        if (this.f5392f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f5451x2 = new ga(this, 3);
            } else {
                Z(false);
            }
        }
        ac acVar = this.f5382c1;
        if (acVar != null) {
            acVar.f5517f.s();
        }
        j7 j7Var = this.O0;
        if (j7Var != null) {
            j7Var.h();
        }
        v6 v6Var = this.f5419o1;
        if (v6Var != null) {
            ai.l9 storiesController = MessagesController.getInstance(v6Var.f6116a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f1296i.f(UserConfig.getInstance(storiesController.f1290a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            v6Var.f6117b = storiesController.f1291b.m() + i10 + 1;
            v6Var.f6118c.invalidate();
        }
        mb mbVar = this.f5442v1;
        if (mbVar != null && (d1Var = mbVar.O0.d) != null) {
            d1Var.postRunnable(d1Var.f44448w);
        }
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.f5380c).getStoriesController().f1309w;
        if (!b1Var.f4728c && !b1Var.d) {
            b1Var.d = true;
            x0 x0Var = new x0(b1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.f4726a);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, false, (Object) x0Var, 0));
        }
    }

    public final void Q(int i10, int i11) {
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
            this.f5415n0.setVisibility(8);
        }
        if (i10 == 0 && (mbVar2 = this.f5442v1) != null) {
            mbVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f5382c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f5396g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5405j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5389e1.setVisibility(i14);
            ImageView imageView = this.f5402i1;
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
            this.f5421p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (mbVar = this.f5442v1) != null) {
            mbVar.f5750d1.setLayerType(0, null);
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            tf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            ub ubVar2 = this.f5429r1;
            if (ubVar2 != null) {
                ubVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (ubVar = this.f5429r1) != null) {
            ubVar.setVisibility(8);
            this.f5429r1.setAppearProgress(0.0f);
            ub ubVar3 = this.f5429r1;
            ubVar3.f5197x = null;
            g0 g0Var = ubVar3.f5192f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            ubVar3.d.setVisibility(8);
            ubVar3.f5188a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            vb vbVar2 = this.f5433s1;
            if (vbVar2 != null) {
                vbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (vbVar = this.f5433s1) != null) {
            vbVar.setVisibility(8);
            this.f5433s1.setAppearProgress(0.0f);
            vb vbVar3 = this.f5433s1;
            vbVar3.f5545b = null;
            g0 g0Var2 = vbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            vbVar3.f5547e.setVisibility(8);
            vbVar3.setVisibility(8);
        }
    }

    public final void R(ec ecVar) {
        ai.f9 o9;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i10 = this.f5380c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f5438u0 = false;
        this.f5387e = false;
        this.B2 = false;
        this.f5432s0.f4703g = false;
        WindowManager windowManager = this.f5391f;
        if (windowManager != null && (jcVar = this.f5414n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f5414n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f5414n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.f5441v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (ecVar != null) {
            this.F = ecVar;
            this.J = ecVar.f5090a;
            rectF.set(ecVar.f5092c);
            this.G = ecVar.f5091b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5427r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f5398h0.setBackgroundColor(i11);
        this.f5427r.setTranslationX(0.0f);
        this.f5427r.setTranslationY(0.0f);
        this.f5427r.b(0.0f);
        this.f5427r.setScaleX(1.0f);
        this.f5427r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5376b, 1);
        g(1.0f, true, new ga(this, 6));
        e();
        this.f5441v0 = 0L;
        this.f5445w0 = "";
    }

    public final void S(dc dcVar, k8 k8Var, long j3) {
        int i10;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i11 = this.f5380c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f5438u0 = false;
        this.f5387e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5391f;
        if (windowManager != null && (jcVar = this.f5414n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f5414n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f5414n, layoutParams);
            g0();
        }
        this.K1 = k8Var;
        this.O1 = k8Var.K ? 1 : 0;
        this.f5432s0.f4703g = false;
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.f5090a;
            rectF.set(dcVar.f5092c);
            this.G = dcVar.f5091b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5427r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f5398h0.setBackgroundColor(i10);
        this.f5427r.setTranslationX(0.0f);
        this.f5427r.setTranslationY(0.0f);
        this.f5427r.b(0.0f);
        this.f5427r.setScaleX(1.0f);
        this.f5427r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5376b, 1);
        k8 k8Var2 = this.K1;
        if (k8Var2 != null) {
            this.f5382c1.setText(k8Var2.C0);
        }
        L(new za(this, 0), j3);
        if (this.K1.f5313b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.f5378b1.b(false, false);
        e();
        this.f5441v0 = 0L;
        this.f5445w0 = "";
    }

    public final void T() {
        b80 b80Var;
        yb ybVar = this.X0;
        if (ybVar != null) {
            ybVar.x(4, true);
        }
        ac acVar = this.f5382c1;
        if (acVar != null && (b80Var = acVar.V0) != null) {
            b80Var.u();
            acVar.V0 = null;
        }
        rg.y0 y0Var = new rg.y0((org.telegram.ui.ActionBar.n2) new ob(this, 1), 14, false);
        y0Var.setOnDismissListener(new va(this, 1));
        y0Var.show();
    }

    public final void U(dc dcVar, k8 k8Var) {
        int i10;
        boolean z10;
        int i11;
        ai.f9 o9;
        jc jcVar;
        if (this.d) {
            return;
        }
        int i12 = this.f5380c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f5438u0 = true;
        this.f5387e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5391f;
        if (windowManager != null && (jcVar = this.f5414n) != null && jcVar.getParent() == null) {
            jc jcVar2 = this.f5414n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, jcVar2, layoutParams);
            windowManager.addView(this.f5414n, layoutParams);
            g0();
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
        if (k8Var2 != null && k8Var2.f5351u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5432s0.f4703g = z10;
        if (this.f5441v0 == 0 && (o9 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o9.a(i12, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (dcVar != null) {
            this.F = dcVar;
            this.J = dcVar.f5090a;
            rectF.set(dcVar.f5092c);
            this.G = dcVar.f5091b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5427r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f5398h0.setBackgroundColor(i11);
        this.f5427r.setTranslationX(0.0f);
        this.f5427r.setTranslationY(0.0f);
        this.f5427r.b(0.0f);
        this.f5427r.setScaleX(1.0f);
        this.f5427r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5376b, 1);
        k8 k8Var3 = this.K1;
        if (k8Var3 != null) {
            this.f5382c1.setText(k8Var3.C0);
        }
        this.f5378b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ga(this, 6));
        e();
        this.f5441v0 = 0L;
        this.f5445w0 = "";
    }

    public final void V() {
        pg.f1 f1Var = this.f5446w1;
        if (f1Var != null) {
            f1Var.bringToFront();
        }
        View view = this.f5450x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f5454y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f5457z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        yc ycVar = this.f5422p1;
        if (ycVar != null) {
            ycVar.bringToFront();
        }
        tf0 tf0Var = this.C1;
        if (tf0Var != null) {
            tf0Var.bringToFront();
        }
        kf0 kf0Var = this.E1;
        if (kf0Var != null) {
            kf0Var.bringToFront();
        }
        mf0 mf0Var = this.F1;
        if (mf0Var != null) {
            mf0Var.bringToFront();
        }
        v6 v6Var = this.f5419o1;
        if (v6Var != null) {
            v6Var.bringToFront();
        }
        p pVar = this.f5425q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(k8 k8Var, boolean z10) {
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
            t71 textureView = this.X0.getTextureView();
            if (k8Var.K && !k8Var.f5351u && textureView != null) {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            mb mbVar = this.f5442v1;
            if (mbVar != null && mbVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                mb mbVar2 = this.f5442v1;
                mbVar2.I0 = true;
                j6 j6Var = mbVar2.R0;
                j6Var.f44993a = true;
                j6Var.draw(canvas);
                mb mbVar3 = this.f5442v1;
                mbVar3.R0.f44993a = false;
                mbVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = k8.w(this.f5380c, "jpg");
            if (z10) {
                k8Var2 = k8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new u1(this, createBitmap, z11, w10, k8Var2, 1));
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
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (!z11) {
                k8Var2.N0 = w10;
            }
            k8Var2.f5314b1 = createScaledBitmap;
        }
    }

    public final void X() {
        ai.f9 o9;
        int size;
        char c10;
        View[] viewPages;
        n61[] n61VarArr;
        ea eaVar = this.f5424q0;
        BitmapDrawable bitmapDrawable = null;
        if (eaVar != null) {
            eaVar.dismiss();
            this.f5424q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f5389e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            t6 t6Var = this.f5378b1.f6066c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(t6Var, i10);
            return;
        }
        ac acVar = this.f5382c1;
        if (acVar != null && acVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.p6 p6Var = acVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(p6Var, i11);
            acVar.e();
            return;
        }
        k8 k8Var = this.K1;
        int i12 = this.f5380c;
        if ((k8Var == null || (!k8Var.f5325g && k8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        ai.d dVar = this.f5373a;
        if (acVar != null && !this.K1.D0) {
            CharSequence text = acVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((n11[]) spannable.getSpans(0, text.length(), n11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.yc(this.f5414n, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.i6.gc, 0, new ga(this, 27), dVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(acVar, i13);
                    return;
                }
            }
        }
        k8 k8Var2 = this.K1;
        if (!k8Var2.f5325g && k8Var2.J0 == 0) {
            if (this.N != 0) {
                k8Var2.f5353v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            yb ybVar = this.X0;
            ybVar.x(3, true);
            ea eaVar2 = new ea(this.f5376b, this.K1.I0, dVar);
            eaVar2.q1(this.K1.E0);
            eaVar2.p1(this.K1.f5353v0);
            eaVar2.F = this.M;
            eaVar2.U = new ha(this, 14);
            eaVar2.e1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            eaVar2.m1(size);
            eaVar2.k1(false);
            CharSequence text2 = acVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (n61 n61Var : (n61[]) ((Spanned) text2).getSpans(0, text2.length(), n61.class)) {
                    if (n61Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(n61Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f20184id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                }
                c10 = 1;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f20184id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
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
            this.f5424q0 = eaVar2;
            k8 k8Var3 = this.K1;
            if (k8Var3.K) {
                if (ybVar != null && !k8Var3.f5324f0 && this.f5392f0 != 2) {
                    k8Var3.f5321e0 = ybVar.getCurrentPosition();
                    Utilities.Callback haVar = new ha(this, 17);
                    View view = this.f5446w1;
                    View view2 = this.f5457z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = ybVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    ybVar.h(haVar, viewArr);
                }
                ea eaVar3 = this.f5424q0;
                Bitmap bitmap = this.K1.f5326g0;
                ga gaVar = new ga(this, 20);
                if (bitmap != null) {
                    eaVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                eaVar3.f5048b0 = bitmapDrawable;
                eaVar3.f5050c0 = gaVar;
                i1 i1Var = eaVar3.f5047b;
                if (i1Var != null) {
                    for (View view3 : i1Var.getViewPages()) {
                        if (view3 instanceof x9) {
                            x9 x9Var = (x9) view3;
                            x9Var.g(false);
                            x9Var.e(false);
                        }
                    }
                }
            }
            this.f5424q0.setOnDismissListener(new va(this, 0));
            this.f5424q0.show();
            return;
        }
        k8Var2.f5334l = false;
        i(null);
        p0();
    }

    public final void Y(fc fcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (fcVar != null) {
            this.F = fcVar;
            this.J = fcVar.f5090a;
            rectF.set(fcVar.f5092c);
            this.G = fcVar.f5091b;
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
        this.f5398h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f5447w2 || z10) {
            this.f5434s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f5376b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f5434s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    sq sqVar = new sq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    sqVar.f30851e = dp;
                    sqVar.f30852f = dp2;
                    this.A0.setCameraThumb(sqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f5373a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                        alertDialog$Builder.f20367a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new pa(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f20367a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f5447w2 = true;
                }
            }
            if (!this.f5434s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new ga(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        nb nbVar = this.B0;
        if (nbVar != null && nbVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new a3.k0(this, this.B0.getTextureView().getBitmap(), runnable, 20));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c0(View view, boolean z10, boolean z11) {
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
            animate.alpha(f7).setUpdateListener(new lb(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 1)).setDuration(320L).setInterpolator(tr.h).start();
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
            this.f5391f.updateViewLayout(this.f5414n, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ai.f9 o9;
        k8 k8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            j7 j7Var = this.O0;
            if (j7Var != null) {
                j7Var.h();
            }
            if (this.f5413m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f5413m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f5413m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            j7 j7Var2 = this.O0;
            if (j7Var2 != null && !this.V1) {
                j7Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f5392f0;
            int i15 = this.f5380c;
            if (i14 == 1) {
                if (!this.N1 && !this.f5382c1.o()) {
                    ai.l9 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    ai.f9 o10 = storiesController.o();
                    if (o10 == null || !o10.a(storiesController.f1290a, B) || ((k8Var = this.K1) != null && (k8Var.f5325g || k8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f5378b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                k8 k8Var2 = this.K1;
                if (k8Var2 == null || k8Var2.J0 == 0) {
                    h0(o9, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f5380c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        nb nbVar = this.B0;
        if ((nbVar != null && nbVar.isDual()) || this.a2) {
            str = null;
        }
        this.Y1 = str;
        boolean z10 = false;
        if (str == null) {
            c0(this.E0, false, true);
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
        wc wcVar = this.E0;
        if (wcVar.f6258n != i10) {
            wcVar.f6258n = i10;
            ValueAnimator valueAnimator = wcVar.f6259r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                wcVar.f6259r = null;
            }
            wcVar.setDrawable(i10);
        }
        if (this.f5392f0 == 0 && !this.I0.f6326e && this.Y1 != null && !I()) {
            z10 = true;
        }
        c0(this.E0, z10, true);
    }

    public final void f(boolean z10) {
        float height;
        boolean z11;
        int i10;
        v0 v0Var;
        this.K0 = z10;
        Boolean bool = this.f5423p2;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            if (this.M0.U) {
                this.f5426q2 = new qa(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f5417n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5417n2 = null;
            }
            o1.k kVar = this.f5420o2;
            if (kVar != null) {
                kVar.c();
                this.f5420o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            jb jbVar = this.M0;
            if (jbVar != null) {
                jbVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            cc ccVar = this.f5427r;
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
            this.f5423p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            jc jcVar = this.f5414n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (jcVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, jcVar.getHeight());
            jb jbVar3 = this.M0;
            jbVar3.K = !z10;
            if (this.f5406j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5409k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(jbVar3, o1.h.f16965n, height);
                this.f5420o2 = kVar2;
                kVar2.f16983u.a(0.75f);
                this.f5420o2.f16983u.b(350.0f);
                this.f5420o2.a(new ra(this, height, 0));
                this.f5420o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f5417n2 = ofFloat;
                ofFloat.addUpdateListener(new sa(this, 0));
                this.f5417n2.addListener(new ib(this, 1));
                this.f5417n2.setDuration(450L);
                this.f5417n2.setInterpolator(tr.h);
                this.f5417n2.start();
            }
            if (!z10 && !this.S1) {
                this.f5411l2 = null;
            }
            if (!z10 && this.f5392f0 == 0 && !this.f5434s2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f5393f1 == null) {
            kj0 kj0Var = new kj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5393f1 = kj0Var;
            kj0Var.F *= 1.5f;
        }
        this.f5396g1.setAnimation(this.f5393f1);
        int i10 = 20;
        if (!z11) {
            kj0 kj0Var2 = this.f5393f1;
            if (!z10) {
                i10 = 0;
            }
            kj0Var2.N(i10, false, false);
        } else if (z10) {
            kj0 kj0Var3 = this.f5393f1;
            if (kj0Var3.f28118a0 > 20) {
                kj0Var3.N(0, false, false);
            }
            this.f5393f1.P(20);
            this.f5393f1.start();
        } else {
            kj0 kj0Var4 = this.f5393f1;
            int i11 = kj0Var4.f28118a0;
            if (i11 != 0 && i11 < 43) {
                kj0Var4.P(43);
                this.f5393f1.start();
            }
        }
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        cc ccVar = this.f5427r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new sa(this, 5));
            this.E.addListener(new ai.t2(this, f7, runnable, 2));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(tr.h);
            } else if (f7 <= 0.0f && ccVar.f4842a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(tr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(tr.h);
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
        k();
        ccVar.invalidate();
        this.f5414n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f5414n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new ai.rb(this, 2));
    }

    public final void h(boolean z10, boolean z11) {
        float f7;
        float dp;
        float dp2;
        float f10;
        float dp3;
        float dp4;
        y yVar;
        if (z10) {
            e4 e4Var = this.l1;
            if (e4Var != null) {
                e4Var.e(true);
            }
            e4 e4Var2 = this.f5412m1;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
            e4 e4Var3 = this.f5408k1;
            if (e4Var3 != null) {
                e4Var3.e(true);
            }
            e4 e4Var4 = this.W0;
            if (e4Var4 != null) {
                e4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f5379b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f5379b2 = I();
        if (z10 && (yVar = this.I0) != null && yVar.f6326e) {
            yVar.a(false, z11);
        }
        m0(z11);
        cb cbVar = this.Q0;
        b4 b4Var = this.U0;
        b4 b4Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f5392f0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f5392f0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b4Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b4Var, property, (!z10 && this.f5392f0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f5392f0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b4Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cbVar, property, (z10 || this.f5392f0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f5392f0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(cbVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(tr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f5392f0 == 0 && !I()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        b4Var2.setAlpha(f7);
        if (z10 && this.f5392f0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        b4Var2.setTranslationY(dp);
        b4Var.setAlpha((!z10 && this.f5392f0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f5392f0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        b4Var.setTranslationY(dp2);
        cbVar.setAlpha((z10 || this.f5392f0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f5392f0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        cbVar.setTranslationY(f13);
    }

    public final void h0(ai.f9 f9Var, boolean z10) {
        if (this.f5458z2) {
            return;
        }
        rg.k0 k0Var = new rg.k0(f9Var.b(), this.f5380c, this.f5376b, new ob(this, 0), null);
        k0Var.X = B();
        k0Var.setOnDismissListener(new p80(2, this, z10));
        this.X0.x(7, true);
        this.f5458z2 = true;
        k0Var.show();
    }

    public final void i(Runnable runnable) {
        k8 k8Var;
        Runnable runnable2;
        yb ybVar;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        vf0 vf0Var = this.B1;
        if (vf0Var != null && (k8Var = this.K1) != null) {
            k8Var.f5330j = vf0Var.d() | k8Var.f5330j;
            k8 k8Var2 = this.K1;
            vf0 vf0Var2 = this.B1;
            File file = k8Var2.Z0;
            if (file != null) {
                file.delete();
                k8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = vf0Var2.getSavedFilterState();
            k8Var2.f5311a1 = savedFilterState;
            if (!k8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = vf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = k8Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, k8Var2.f5333k0 / 2.0f, k8Var2.f5335l0 / 2.0f);
                        matrix.postRotate(-k8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        k8Var2.f5338n0.preScale(k8Var2.f5333k0 / createBitmap.getWidth(), k8Var2.f5335l0 / createBitmap.getHeight());
                        k8Var2.f5333k0 = createBitmap.getWidth();
                        k8Var2.f5335l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = k8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            k8Var2.Z0.delete();
                        }
                        String k10 = k8.k(k8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = k8Var2.f5309a;
                        if (!z10) {
                            str = "jpg";
                        }
                        k8Var2.Z0 = k8.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(k8Var2.Z0);
                                if (z10) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new ai.s4(k8Var2, createBitmap, z10, runnable2, 2));
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

    public final void i0(boolean z10, boolean z11) {
        if (this.f5386d2 != z10) {
            this.f5386d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(tr.h).withEndAction(new qa(this, z10, 1)).start();
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

    public final void j() {
        if (this.K1 != null && this.D1 != null && this.f5398h0.getMeasuredWidth() > 0 && this.f5398h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f5398h0.getMeasuredWidth() / 2.0f, this.f5398h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f5398h0.getMeasuredWidth() / this.f5398h0.getMeasuredHeight(), this.f5398h0.getMeasuredHeight() / this.f5398h0.getMeasuredWidth(), this.f5398h0.getMeasuredWidth() / 2.0f, this.f5398h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f5398h0.getMeasuredWidth()) * this.K1.f5333k0, (1.0f / this.f5398h0.getMeasuredHeight()) * this.K1.f5335l0);
            matrix.postConcat(this.K1.f5338n0);
            matrix.postScale(this.f5398h0.getMeasuredWidth() / this.K1.f5329i0, this.f5398h0.getMeasuredHeight() / this.K1.f5331j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f7;
        ba1 ba1Var = this.V0;
        if ((ba1Var.getTag() != null && z10) || (ba1Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f5390e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ga gaVar = new ga(this, 25);
                this.f5390e2 = gaVar;
                AndroidUtilities.runOnUIThread(gaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f5394f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        ba1Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5394f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            ba1Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f5394f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(ba1Var, property, f7));
        this.f5394f2.addListener(new ai.n(13, this, z10));
        this.f5394f2.start();
        if (z10) {
            ga gaVar2 = new ga(this, 26);
            this.f5390e2 = gaVar2;
            AndroidUtilities.runOnUIThread(gaVar2, 2000L);
        }
    }

    public final void k() {
        ai.a5 a5Var;
        if (this.J == 1) {
            RectF rectF = this.f5384d0;
            rectF.set(this.f5398h0.getLeft(), this.f5398h0.getTop(), this.f5398h0.getMeasuredWidth(), this.f5398h0.getMeasuredHeight());
            rectF.offset(this.f5427r.getX(), this.f5427r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f5381c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f5398h0.setAlpha(this.I);
            float f10 = rectF3.left;
            wb wbVar = this.f5398h0;
            wbVar.setTranslationX((f10 - wbVar.getLeft()) - this.f5427r.getX());
            float f11 = rectF3.top;
            wb wbVar2 = this.f5398h0;
            wbVar2.setTranslationY((f11 - wbVar2.getTop()) - this.f5427r.getY());
            fc fcVar = this.F;
            if (fcVar != null && (a5Var = fcVar.f5094f) != null) {
                a5Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f5094f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f5398h0.setScaleX(rectF3.width() / this.f5398h0.getMeasuredWidth());
            this.f5398h0.setScaleY(rectF3.height() / this.f5398h0.getMeasuredHeight());
            this.f5401i0.setAlpha(this.I);
            this.f5407k0.setAlpha(this.I);
            this.f5410l0.setAlpha(this.I);
            if (this.f5392f0 == 2) {
                this.f5439u1.setAlpha(this.I);
            }
        }
    }

    public final void k0() {
        ea eaVar = this.f5424q0;
        if (eaVar != null) {
            eaVar.dismiss();
            this.f5424q0 = null;
        }
        ea eaVar2 = new ea(this.f5376b, 86400, this.f5373a);
        eaVar2.o1();
        eaVar2.q1(this.f5453y0);
        TLRPC.InputPeer inputPeer = this.f5449x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f5380c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        eaVar2.p1(inputPeer);
        eaVar2.F = this.M;
        eaVar2.U = new ha(this, 18);
        eaVar2.e1(false);
        eaVar2.m1(1);
        eaVar2.k1(false);
        eaVar2.W = new ha(this, 19);
        eaVar2.T = new pa(this, 12);
        this.f5424q0 = eaVar2;
        eaVar2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.l0(int, boolean, boolean):void");
    }

    public final void m() {
        k8 k8Var;
        boolean z10;
        if (this.f5442v1 != null && (k8Var = this.K1) != null && k8Var.f5351u) {
            File file = k8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = k8.w(this.f5380c, "webp");
            mb mbVar = this.f5442v1;
            k8 k8Var2 = this.K1;
            ArrayList arrayList = k8Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = mbVar.t0(arrayList, false, false, true, z10, k8Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (t02.isRecycled()) {
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
        float f7;
        boolean z16;
        nb nbVar;
        boolean z17 = false;
        if (this.f5392f0 == 0 && this.O1 == 1 && !this.I0.f6326e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        if (yVar != null && yVar.f6326e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f5415n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f5392f0 == 0 && this.Y1 != null && !this.I0.f6326e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f5392f0 == 0 && (nbVar = this.B0) != null && nbVar.f4883a && !this.I0.f6326e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f5392f0 == 0 && !this.I0.f6326e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.G0, z15, z10);
        c0(this.H0, this.I0.f6326e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(f7, z10);
        boolean z18 = this.I0.f6326e;
        e4 e4Var = this.f5416n1;
        if (z18) {
            e4Var.u();
        } else {
            e4Var.e(true);
        }
        h(this.a2, z10);
        if (this.O1 == -1 && this.f5392f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f5392f0 == 0) {
            z17 = true;
        }
        AndroidUtilities.updateViewShow(this.R0, z17);
    }

    public final void n0() {
        this.H0.setTranslationX(-0.0f);
        float alpha = (this.H0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.F0.setTranslationX(-alpha);
        float alpha2 = (this.F0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.G0.setTranslationX(-alpha2);
        float alpha3 = (this.G0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.E0.setTranslationX(-alpha3);
        float alpha4 = this.E0.getAlpha();
        this.f5415n0.setTranslationX(0.0f);
        float alpha5 = this.f5415n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f6323a;
        vVar.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        vVar.invalidate();
    }

    public final void o() {
        boolean z10;
        if (this.K == 0.0f && this.I >= 1.0f && !this.B2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 == this.A2) {
            return;
        }
        ib0 ib0Var = this.f5452y;
        if (ib0Var != null) {
            ib0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        kj0 kj0Var = this.f5399h1;
        if (kj0Var != null) {
            int[] iArr = kj0Var.f28124e;
            int i11 = 0;
            if (z10) {
                k8 k8Var = this.K1;
                if (k8Var != null && k8Var.f5359y0) {
                    i11 = iArr[0];
                }
                kj0Var.P(i11);
                kj0 kj0Var2 = this.f5399h1;
                if (kj0Var2 != null) {
                    kj0Var2.start();
                    return;
                }
                return;
            }
            k8 k8Var2 = this.K1;
            if (k8Var2 != null && k8Var2.f5359y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            kj0Var.N(i10, false, true);
            this.f5399h1.P(i10);
            ImageView imageView = this.f5402i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f5437t2 < 0) {
            this.f5437t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f5440u2 = arrayList;
            arrayList.add("off");
            this.f5440u2.add("auto");
            this.f5440u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            x2 x2Var = this.f5431s;
            x2Var.f6276o = f7;
            x2Var.f6275n = x2.f(f7);
            x2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            x2 x2Var2 = this.f5431s;
            x2Var2.f6277p = f10;
            x2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ga gaVar = new ga(this, 2);
        mb mbVar = this.f5442v1;
        k8 k8Var = this.K1;
        if (mbVar != null && k8Var != null) {
            k8Var.f();
            boolean u02 = mbVar.u0();
            boolean z10 = mbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ja(this, mbVar, k8Var.f5329i0, k8Var.f5331j0, k8Var, z10, u02, gaVar, 1));
            return;
        }
        gaVar.run();
    }

    public final void q(boolean z10) {
        yb ybVar;
        if (this.d) {
            ea eaVar = this.f5424q0;
            if (eaVar != null) {
                eaVar.dismiss();
                this.f5424q0 = null;
            }
            k8 k8Var = this.K1;
            long j3 = 0;
            if (k8Var != null && !k8Var.h) {
                if ((this.v && k8Var.f5325g) || k8Var.f5312b != 0) {
                    k8Var.f5330j = false;
                }
                k8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (ybVar = this.X0) != null) {
                if (this.f5387e) {
                    return;
                }
                this.f5387e = true;
                d81 d81Var = ybVar.f4770y;
                if (d81Var != null) {
                    d81Var.B();
                    ybVar.f4770y.H();
                    ybVar.f4770y = null;
                }
                d81 d81Var2 = ybVar.f4768x;
                if (d81Var2 != null) {
                    j3 = d81Var2.n();
                    ybVar.f4768x.B();
                    ybVar.f4768x.H();
                    ybVar.f4768x = null;
                }
                d81 d81Var3 = ybVar.f4744e;
                if (d81Var3 != null) {
                    j3 = d81Var3.n();
                    ybVar.f4744e.B();
                    ybVar.f4744e.H();
                    ybVar.f4744e = null;
                }
                callback4.run(Long.valueOf(j3), new qa(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f5444w));
                return;
            }
            yb ybVar2 = this.X0;
            if (ybVar2 != null && !z10) {
                ybVar2.set(null);
            }
            g(0.0f, z10, new ga(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f5414n.setBackgroundColor(0);
                this.f5378b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f5380c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        nb nbVar;
        if ((this.P1 || this.Q1) && (nbVar = this.B0) != null && nbVar.isFrontface()) {
            int i10 = this.f5437t2;
            if (i10 == 2 || (i10 == 1 && this.f5383c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f5376b;
        if (this.B0 == null && activity != null) {
            this.B0 = new nb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            j7 j7Var = this.O0;
            float f7 = 0.0f;
            if (j7Var != null) {
                j7Var.f5226g0 = 0.0f;
                j7Var.f5227h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(A());
            this.B0.initTexture();
            this.B0.setDelegate(new pa(this, 0));
            xc xcVar = this.F0;
            if (this.B0.f4883a && this.f5392f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(xcVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f4883a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!d1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.B0.f4883a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new f7(activity, new ha(this, 3));
            }
            this.C0.a(this.B0);
            t7 t7Var = this.D0;
            if (t7Var != null) {
                xb xbVar = this.A0;
                Object blurRenderNode = xbVar.getBlurRenderNode();
                t7Var.F = xbVar;
                t7Var.G = blurRenderNode;
                t7Var.invalidate();
            }
        }
    }

    public final void s() {
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
                t71 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                k8 k8Var2 = this.K1;
                if (k8Var2 != null) {
                    savedFilterState = k8Var2.f5311a1;
                }
                vf0 vf0Var = new vf0(this.f5376b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f5428r0, this.f5373a);
                this.B1 = vf0Var;
                this.f5427r.addView(vf0Var);
                tf0 tf0Var = this.C1;
                if (tf0Var != null) {
                    tf0Var.setFilterView(this.B1);
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
                j();
                kf0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f5398h0.addView(blurControl);
                }
                mf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f5398h0.addView(curveControl);
                }
                V();
                this.B1.getDoneTextView().setOnClickListener(new ia(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new ia(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f31655i0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
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
        if (this.f5376b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f5413m2;
        boolean z13 = !z10;
        xb xbVar2 = this.A0;
        if (xbVar2 != null && xbVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        jb jbVar = new jb(this, this.f5380c, this.f5376b, this.f5373a, albumEntry, z10, z13, z11);
        this.M0 = jbVar;
        jbVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new za(this, 1));
        this.M0.setOnSelectListener(new ya(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new yh.x0(this, 2));
        s4.b0 b0Var = this.f5411l2;
        if (b0Var != null) {
            f3 f3Var = this.M0.f6214e;
            f3Var.B = b0Var;
            f3Var.l0();
        }
        this.f5414n.addView(this.M0, w7.z5.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ci.kc.u():void");
    }

    public final void v(boolean z10) {
        f7 f7Var = this.C0;
        if (f7Var != null) {
            f7Var.f5079f = null;
            Utilities.globalQueue.cancelRunnable(f7Var.h);
            this.C0 = null;
            xb xbVar = this.A0;
            if (xbVar != null) {
                xbVar.f4942c.b(null);
            }
        }
        t7 t7Var = this.D0;
        if (t7Var != null) {
            t7Var.F = null;
            t7Var.G = null;
            t7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new ga(this, 8));
                return;
            }
            b0(new ga(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            xb xbVar2 = this.A0;
            if (xbVar2 != null) {
                xbVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        jb jbVar = this.M0;
        if (jbVar == null) {
            return;
        }
        this.f5414n.removeView(jbVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f5417n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5417n2 = null;
        }
        o1.k kVar = this.f5420o2;
        if (kVar != null) {
            kVar.c();
            this.f5420o2 = null;
        }
        this.f5423p2 = null;
    }

    public final void y() {
        vf0 vf0Var = this.B1;
        if (vf0Var == null) {
            return;
        }
        vf0Var.e();
        this.C1.setFilterView(null);
        this.f5427r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f5398h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        kf0 kf0Var = this.E1;
        if (kf0Var != null) {
            this.f5398h0.removeView(kf0Var);
            this.E1 = null;
        }
        mf0 mf0Var = this.F1;
        if (mf0Var != null) {
            this.f5398h0.removeView(mf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        mb mbVar = this.f5442v1;
        if (mbVar != null) {
            mbVar.R0.removeAllViews();
            mb mbVar2 = this.f5442v1;
            mbVar2.O0.h();
            mbVar2.R0.setVisibility(8);
            mbVar2.Q0.setVisibility(8);
            mbVar2.E0.postRunnable(new ai.f(7));
            y5 y5Var = mbVar2.f5765k2;
            if (y5Var != null) {
                y5Var.dismiss();
            }
            pg.x xVar = mbVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f5427r.removeView(this.f5442v1);
            this.f5442v1 = null;
            pg.f1 f1Var = this.f5446w1;
            if (f1Var != null) {
                this.f5398h0.removeView(f1Var);
                this.f5446w1 = null;
            }
            View view = this.f5454y1;
            if (view != null) {
                this.f5398h0.removeView(view);
                this.f5454y1 = null;
            }
            View view2 = this.f5450x1;
            if (view2 != null) {
                this.f5398h0.removeView(view2);
                this.f5450x1 = null;
            }
            View view3 = this.f5457z1;
            if (view3 != null) {
                this.f5398h0.removeView(view3);
                this.f5457z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f5398h0.removeView(view4);
                this.A1 = null;
            }
        }
    }
}
