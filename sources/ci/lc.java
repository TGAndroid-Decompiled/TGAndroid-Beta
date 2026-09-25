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
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
public final class lc implements NotificationCenter.NotificationCenterDelegate {
    public static lc F2;
    public final yb A0;
    public View A1;
    public boolean A2;
    public ob B0;
    public tf0 B1;
    public boolean B2;
    public f7 C0;
    public final rf0 C1;
    public tb C2;
    public final t7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final xc E0;
    public if0 E1;
    public ValueAnimator E2;
    public gc F;
    public final yc F0;
    public kf0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final xc H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final bd J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public l8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public kb M0;
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
    public final db Q0;
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
    public final q91 V0;
    public boolean V1;
    public boolean W;
    public final e4 W0;
    public boolean W1;
    public boolean X;
    public final zb X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final wc Z0;
    public AnimatorSet Z1;
    public final ai.d f5026a;
    public int f5027a0;
    public final ad f5028a1;
    public boolean a2;
    public final Activity f5029b;
    public int f5030b0;
    public final u6 f5031b1;
    public boolean f5032b2;
    public final int f5033c;
    public final RectF f5034c0;
    public final bc f5035c1;
    public boolean f5036c2;
    public boolean d;
    public final RectF f5037d0;
    public final cb f5038d1;
    public boolean f5039d2;
    public boolean e;
    public final Path f5040e0;
    public final u0 f5041e1;
    public Runnable f5042e2;
    public final WindowManager f5043f;
    public int f5044f0;
    public ij0 f5045f1;
    public AnimatorSet f5046f2;
    public int f5047g0;
    public final lj0 f5048g1;
    public na f5049g2;
    public final WindowManager.LayoutParams h;
    public final xb f5050h0;
    public ij0 f5051h1;
    public boolean f5052h2;
    public final FrameLayout f5053i0;
    public ImageView f5054i1;
    public AnimatorSet f5055i2;
    public final LinearLayout f5056j0;
    public final r6 f5057j1;
    public ValueAnimator f5058j2;
    public final FrameLayout f5059k0;
    public final e4 f5060k1;
    public boolean f5061k2;
    public final ai.f0 f5062l0;
    public final e4 l1;
    public s4.b0 f5063l2;
    public final FrameLayout m0;
    public final e4 f5064m1;
    public MediaController.AlbumEntry f5065m2;
    public final kc f5066n;
    public final v2 f5067n0;
    public final e4 f5068n1;
    public ValueAnimator f5069n2;
    public final e8 f5070o0;
    public final v6 f5071o1;
    public o1.k f5072o2;
    public final org.telegram.ui.ActionBar.h5 f5073p0;
    public final zc f5074p1;
    public Boolean f5075p2;
    public fa f5076q0;
    public p f5077q1;
    public ra f5078q2;
    public final dc f5079r;
    public final org.telegram.ui.Components.ja f5080r0;
    public vb f5081r1;
    public AnimatorSet f5082r2;
    public final x2 f5083s;
    public final a7 f5084s0;
    public wb f5085s1;
    public boolean f5086s2;
    public final bb f5087t0;
    public final wc f5088t1;
    public int f5089t2;
    public boolean f5090u0;
    public final d f5091u1;
    public ArrayList f5092u2;
    public boolean v;
    public long f5093v0;
    public nb f5094v1;
    public FrameLayout f5095v2;
    public long f5096w;
    public String f5097w0;
    public pg.f1 f5098w1;
    public boolean f5099w2;
    public cc f5100x;
    public TLRPC.InputPeer f5101x0;
    public View f5102x1;
    public ha f5103x2;
    public final eb0 f5104y;
    public da f5105y0;
    public View f5106y1;
    public ai.o8 f5107y2;
    public t f5108z0;
    public View f5109z1;
    public boolean f5110z2;

    public lc(Activity activity, int i10) {
        eb0 eb0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        ai.d dVar = new ai.d();
        this.f5026a = dVar;
        this.f5096w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f5034c0 = new RectF();
        this.f5037d0 = new RectF();
        this.f5040e0 = new Path();
        new Rect();
        this.f5044f0 = 0;
        this.f5047g0 = -1;
        this.f5105y0 = new da();
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
        gb gbVar = new gb(this);
        this.f5039d2 = true;
        this.f5061k2 = true;
        this.f5089t2 = -1;
        this.f5029b = activity;
        this.f5033c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            eb0Var = new eb0(launchActivity, true);
        } else {
            eb0Var = null;
        }
        this.f5104y = eb0Var;
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
        this.f5043f = windowManager;
        kc kcVar = new kc(this, activity);
        this.f5066n = kcVar;
        qa qaVar = new qa(this, 1);
        WeakHashMap weakHashMap = r0.i0.f42129a;
        r0.a0.j(kcVar, qaVar);
        this.f5066n.setFocusable(true);
        this.f5066n.setImportantForAccessibility(2);
        x2 x2Var = new x2(activity, windowManager, this.f5066n, layoutParams);
        this.f5083s = x2Var;
        x2Var.a(new rb(this));
        this.f5066n.addView(this.f5083s.f5808b, new ViewGroup.LayoutParams(-1, -1));
        kc kcVar2 = this.f5066n;
        dc dcVar = new dc(this, activity);
        this.f5079r = dcVar;
        kcVar2.addView(dcVar);
        dc dcVar2 = this.f5079r;
        xb xbVar = new xb(this, activity);
        this.f5050h0 = xbVar;
        dcVar2.addView(xbVar);
        this.f5079r.addView(this.f5083s.f5809c, new ViewGroup.LayoutParams(-1, -1));
        this.f5080r0 = new org.telegram.ui.Components.ja(this.f5050h0);
        this.f5084s0 = new Object();
        dc dcVar3 = this.f5079r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f5053i0 = frameLayout;
        dcVar3.addView(frameLayout);
        dc dcVar4 = this.f5079r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f5059k0 = frameLayout2;
        dcVar4.addView(frameLayout2);
        dc dcVar5 = this.f5079r;
        ai.f0 f0Var = new ai.f0(this, activity, 2);
        this.f5062l0 = f0Var;
        dcVar5.addView(f0Var);
        this.f5062l0.setVisibility(8);
        this.f5062l0.setAlpha(0.0f);
        dc dcVar6 = this.f5079r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        dcVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.f5066n, new a9(2));
        yb ybVar = new yb(this, activity, this.f5080r0, this.f5079r, dVar);
        this.A0 = ybVar;
        kc kcVar3 = this.f5066n;
        Objects.requireNonNull(kcVar3);
        ybVar.setCancelGestures(new androidx.fragment.app.a0(kcVar3, 23));
        this.A0.setResetState(new ha(this, 13));
        this.f5050h0.addView(this.A0, w7.y5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ja(this, 12));
        xb xbVar2 = this.f5050h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        xbVar2.setBackgroundColor(i11);
        xb xbVar3 = this.f5050h0;
        ai.k2 k2Var = yf.i0.f47112a;
        xbVar3.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(12.0f)));
        this.f5050h0.setClipToOutline(true);
        ha haVar = new ha(this, 14);
        ?? view = new View(activity);
        view.f27959a = new TextPaint(1);
        view.f27960b = new TextPaint(1);
        rr rrVar = rr.h;
        view.f27965s = new org.telegram.ui.Components.e6((View) view, 0L, 350L, rrVar);
        view.I = new ic0(view, 8);
        view.f27967x = haVar;
        this.C1 = view;
        zb zbVar = new zb(this, activity, this.f5080r0, this.f5084s0);
        this.X0 = zbVar;
        zbVar.setCollageView(this.A0);
        zb zbVar2 = this.X0;
        zbVar2.v = new ha(this, 15);
        zbVar2.setOnTapListener(new ha(this, 16));
        this.X0.setVisibility(8);
        zb zbVar3 = this.X0;
        zbVar3.N = new ha(this, 17);
        this.f5050h0.addView(zbVar3, w7.y5.e(-1, -1, 119));
        this.f5050h0.addView(this.C1, w7.y5.e(-1, -1, 119));
        kc kcVar4 = this.f5066n;
        bc bcVar = new bc(this, activity, kcVar4, kcVar4, this.f5079r, dVar, this.f5080r0);
        this.f5035c1 = bcVar;
        bcVar.setAccount(i10);
        this.f5035c1.setUiBlurBitmap(new qa(this, 6));
        org.telegram.ui.Components.qc.a(this.f5062l0, new ai.w4(this, 3));
        this.f5035c1.setOnHeightUpdate(new ia(this, 13));
        this.f5035c1.setOnPeriodUpdate(new ia(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f5035c1.setDialogId(j3);
        }
        this.f5035c1.setOnPremiumHint(new ia(this, 5));
        this.f5035c1.setOnKeyboardOpen(new ia(this, 6));
        bb bbVar = new bb(this, activity, 0);
        this.f5087t0 = bbVar;
        this.f5079r.addView(bbVar);
        wc wcVar = new wc(activity, this.f5079r, this.f5050h0, dVar, this.f5080r0);
        this.Z0 = wcVar;
        wcVar.setOnTimelineClick(new ha(this, 10));
        this.Z0.setOnHeightChange(new ha(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.y5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ad adVar = new ad(activity);
        this.f5028a1 = adVar;
        adVar.setVisibility(8);
        this.f5028a1.a(false);
        this.Y0.addView(this.f5028a1, w7.y5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f5062l0.addView(this.Y0, w7.y5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f5062l0.addView(this.f5035c1, w7.y5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        wc wcVar2 = new wc(activity, this.f5079r, this.f5050h0, dVar, this.f5080r0);
        this.f5088t1 = wcVar2;
        wcVar2.X0 = true;
        wcVar2.setVisibility(8);
        this.f5088t1.setAlpha(0.0f);
        this.f5062l0.addView(this.f5088t1, w7.y5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        cb cbVar = new cb(this, activity, dVar, this.f5080r0);
        this.f5038d1 = cbVar;
        cbVar.setVisibility(8);
        this.f5062l0.addView(this.f5038d1, w7.y5.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f5067n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        v2 v2Var = this.f5067n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        v2Var.setScaleType(scaleType);
        this.f5067n0.setImageResource(R.drawable.msg_photo_back);
        v2 v2Var2 = this.f5067n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        v2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5067n0.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.f5067n0.setOnClickListener(new ja(this, 1));
        this.f5053i0.addView(this.f5067n0, w7.y5.e(56, 56, 51));
        this.f5083s.a(this.f5067n0);
        e8 e8Var = new e8(activity, i10);
        this.f5070o0 = e8Var;
        e8Var.a(false, false);
        this.f5070o0.setOnClickListener(new ai.f2(6, this, activity));
        this.f5053i0.addView(this.f5070o0, w7.y5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f5073p0 = h5Var;
        h5Var.setTextSize(20);
        this.f5073p0.setGravity(19);
        this.f5073p0.setTextColor(-1);
        this.f5073p0.setTypeface(AndroidUtilities.bold());
        this.f5073p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f5073p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f5073p0.setAlpha(0.0f);
        this.f5073p0.setVisibility(8);
        this.f5073p0.setEllipsizeByGradient(true);
        this.f5073p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f5053i0.addView(this.f5073p0, w7.y5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f5056j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f5056j0.setGravity(5);
        this.f5053i0.addView(this.f5056j0, w7.y5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        ia iaVar = new ia(this, 7);
        kc kcVar5 = this.f5066n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f5595w = true;
        imageView2.f5596x = true;
        imageView2.h = iaVar;
        imageView2.f5588a = i10;
        imageView2.f5589b = kcVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.v0(imageView2, 9));
        imageView2.f5591f = new up(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f5041e1 = imageView2;
        e4 e4Var = new e4(activity, 1);
        e4Var.l(1.0f, -71.0f);
        e4Var.d = 2000L;
        e4Var.U = false;
        e4Var.H.o(true, false, false);
        this.f5060k1 = e4Var;
        e4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5053i0.addView(this.f5060k1, w7.y5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f5048g1 = imageView3;
        imageView3.setScaleType(scaleType);
        lj0 lj0Var = this.f5048g1;
        l8 l8Var = this.K1;
        if (l8Var != null && l8Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        lj0Var.setImageResource(i12);
        this.f5048g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5048g1.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.f5048g1.setOnClickListener(new ja(this, 2));
        this.f5048g1.setVisibility(8);
        this.f5048g1.setAlpha(0.0f);
        r6 r6Var = new r6(activity);
        this.f5057j1 = r6Var;
        r6Var.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.f5057j1.setVisibility(8);
        this.f5057j1.setAlpha(0.0f);
        this.f5057j1.setOnClickListener(new ja(this, 3));
        this.f5056j0.addView(this.f5057j1, w7.y5.q(46, 56, 53));
        this.f5056j0.addView(this.f5048g1, w7.y5.q(46, 56, 53));
        this.f5056j0.addView(this.f5041e1, w7.y5.e(46, 56, 53));
        xc xcVar = new xc(activity);
        this.E0 = xcVar;
        xcVar.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ja(this, 4));
        this.E0.setOnLongClickListener(new m5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f5083s.a(this.E0);
        this.f5053i0.addView(this.E0, w7.y5.e(56, 56, 53));
        yc ycVar = new yc(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = ycVar;
        ycVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ja(this, 5));
        boolean q6 = d1.q(activity);
        yc ycVar2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        ycVar2.setVisibility(i13);
        yc ycVar3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ycVar3.setAlpha(f7);
        this.f5083s.a(this.F0);
        this.f5053i0.addView(this.F0, w7.y5.e(56, 56, 53));
        ?? xcVar2 = new xc(activity);
        this.G0 = xcVar2;
        xcVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        if (this.f5108z0 == null) {
            i14 = 6;
            this.f5108z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new ja(this, i14));
        this.G0.a(new u(this.f5108z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f5083s.a(this.G0);
        this.f5053i0.addView(this.G0, w7.y5.e(56, 56, 53));
        xc xcVar3 = new xc(activity);
        this.H0 = xcVar3;
        xcVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ja(this, 7));
        this.f5083s.a(this.H0);
        this.f5053i0.addView(this.H0, w7.y5.e(56, 56, 53));
        y yVar = new y(activity, this.f5083s);
        this.I0 = yVar;
        yVar.f5858a.u0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new ia(this, 8));
        this.f5053i0.addView(this.I0, w7.y5.e(-1, 56, 53));
        e4 e4Var2 = new e4(activity, 1);
        e4Var2.l(1.0f, -20.0f);
        e4Var2.d = 5000L;
        e4Var2.i();
        e4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        e4Var2.f4615l0 = new ai.f(9);
        this.l1 = e4Var2;
        e4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5053i0.addView(this.l1, w7.y5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(activity, 2);
        e4Var3.l(0.0f, 28.0f);
        e4Var3.d = 5000L;
        e4Var3.p(true);
        this.f5064m1 = e4Var3;
        this.f5053i0.addView(e4Var3, w7.y5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        e4 e4Var4 = new e4(activity, 1);
        e4Var4.l(1.0f, -20.0f);
        e4Var4.d = 5000L;
        e4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f5068n1 = e4Var4;
        e4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5053i0.addView(this.f5068n1, w7.y5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f4423a = paint;
        Paint paint2 = new Paint(1);
        view2.f4424b = paint2;
        view2.e = new org.telegram.ui.Components.e6((View) view2, 0L, 250L, rrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        view2.f4425c = o6Var;
        o6Var.k(0.3f, 250L, rrVar);
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.r(-1);
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(view2);
        o6Var.f26930b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        i0(false, false);
        this.f5053i0.addView(this.J0, w7.y5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f5083s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        j7 j7Var = new j7(activity);
        this.O0 = j7Var;
        j7Var.setDelegate(gbVar);
        j7 j7Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j7Var2.f4845n0 = -1.0f;
        j7Var2.f4846o0 = z10;
        j7Var2.invalidate();
        this.f5059k0.addView(this.O0, w7.y5.e(-1, 100, 87));
        this.f5083s.a(this.O0);
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
        this.f5059k0.addView(this.P0, w7.y5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ja(this, 8));
        e4 e4Var5 = new e4(activity, 3);
        e4Var5.p(true);
        e4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        e4Var5.h = AndroidUtilities.dp(320.0f);
        e4Var5.d = 5000L;
        e4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = e4Var5;
        this.f5059k0.addView(e4Var5, w7.y5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        q91 q91Var = new q91(activity);
        this.V0 = q91Var;
        q91Var.M = false;
        q91Var.setAlpha(0.0f);
        this.f5059k0.addView(this.V0, w7.y5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new qa(this, 4));
        q91 q91Var2 = this.V0;
        this.T1 = 0.0f;
        q91Var2.b(0.0f, false);
        t7 t7Var = new t7(activity, i10, new ha(this, 12));
        this.D0 = t7Var;
        t7Var.f5558c = new ia(this, 9);
        this.f5059k0.addView(t7Var, w7.y5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        db dbVar = new db(this, activity);
        this.Q0 = dbVar;
        dbVar.setOnSwitchModeListener(new ia(this, 10));
        this.Q0.setOnSwitchingModeListener(new ia(this, 11));
        this.m0.addView(this.Q0, w7.y5.e(-1, 48, 55));
        this.f5083s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.y5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5083s.a(this.R0);
        this.R0.setOnClickListener(new ja(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.y5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5083s.a(this.S0);
        this.S0.setOnClickListener(new ja(this, 10));
        b4 b4Var = new b4(activity);
        this.T0 = b4Var;
        this.m0.addView(b4Var, w7.y5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5083s.a(this.T0);
        b4 b4Var2 = new b4(activity);
        this.U0 = b4Var2;
        b4Var2.f4374a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        b4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.y5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5083s.a(this.U0);
        d dVar3 = new d(activity, dVar, true);
        dVar3.setRoundRadius(24);
        this.f5091u1 = dVar3;
        dVar3.setVisibility(8);
        this.f5091u1.setAlpha(0.0f);
        this.f5091u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f5091u1.setOnClickListener(new ja(this, 11));
        this.m0.addView(this.f5091u1, w7.y5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f5609b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f5608a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.y5.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        t6 t6Var = new t6(frameLayout5, activity, string, true);
        frameLayout5.f5610c = t6Var;
        t6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f5610c, w7.y5.c(-2.0f, -2));
        frameLayout5.e();
        this.f5031b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f5031b1.setOnClickListener(new ia(this, 12));
        this.m0.addView(this.f5031b1, w7.y5.e(-1, 52, 23));
        zc zcVar = new zc(activity);
        this.f5074p1 = zcVar;
        zcVar.setAlpha(0.0f);
        this.f5074p1.setVisibility(8);
        this.f5050h0.addView(this.f5074p1, w7.y5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        v6 v6Var = new v6(activity, i10, dVar);
        this.f5071o1 = v6Var;
        this.f5050h0.addView(v6Var, w7.y5.e(-1, -1, 119));
        m0(false);
    }

    public static lc E(Activity activity, int i10) {
        lc lcVar = F2;
        if (lcVar != null && (lcVar.f5029b != activity || lcVar.f5033c != i10)) {
            lcVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new lc(activity, i10);
        }
        return F2;
    }

    public static void a(lc lcVar) {
        ob obVar = lcVar.B0;
        boolean z10 = false;
        if (obVar != null && obVar.getTextureView() != null) {
            Bitmap bitmap = lcVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                lcVar.f5036c2 = false;
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
            lcVar.f5036c2 = z10;
            return;
        }
        lcVar.f5036c2 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(lc lcVar) {
        Activity activity = lcVar.f5029b;
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

    public static void c(lc lcVar) {
        ValueAnimator valueAnimator = lcVar.f5058j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            lcVar.f5058j2 = null;
        }
        lcVar.f5061k2 = false;
        dc dcVar = lcVar.f5079r;
        float f7 = dcVar.f4551a;
        float f10 = dcVar.f4552b;
        dcVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        lcVar.f5058j2 = ofFloat;
        ofFloat.addUpdateListener(new ya(lcVar, f7, f10, 0));
        lcVar.f5058j2.setDuration(340L);
        lcVar.f5058j2.setInterpolator(rr.h);
        lcVar.f5058j2.addListener(new jb(lcVar, 0));
        lcVar.f5058j2.start();
    }

    public static boolean d(lc lcVar) {
        Activity activity = lcVar.f5029b;
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
        spannableString.setSpan(new sb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        lc lcVar = F2;
        if (lcVar != null) {
            lcVar.q(false);
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
        return this.f5029b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        l8 l8Var = this.K1;
        if (l8Var != null) {
            return l8Var.r();
        }
        return 1;
    }

    public final String C() {
        ob obVar = this.B0;
        if (obVar != null && obVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f5092u2.get(this.f5089t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 D() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f5029b);
            this.N0 = v0Var;
            this.f5059k0.addView(v0Var, w7.y5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        int i10;
        ob obVar = this.B0;
        if (obVar != null && obVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f5092u2;
                if (this.f5089t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f5089t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f5054i1 == null) {
            ij0 ij0Var = new ij0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5051h1 = ij0Var;
            ij0Var.h = true;
            l8 l8Var = this.K1;
            if (l8Var != null && l8Var.f5013y0) {
                ij0Var.M(35);
                this.f5051h1.P(36);
            } else {
                ij0Var.P(0);
                this.f5051h1.M(0);
            }
            this.f5051h1.Z = true;
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.J9, this.f5026a);
            this.f5051h1.Q(v02, "Sunny");
            this.f5051h1.Q(v02, "Path 6");
            this.f5051h1.Q(v02, "Path");
            this.f5051h1.Q(v02, "Path 5");
            this.f5051h1.o();
            ImageView imageView = new ImageView(this.f5029b);
            this.f5054i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f5054i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f5054i1.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
            this.f5054i1.setOnClickListener(new ja(this, 0));
            this.f5054i1.setVisibility(8);
            this.f5054i1.setImageDrawable(this.f5051h1);
            this.f5054i1.setAlpha(0.0f);
            this.f5056j0.addView(this.f5054i1, 0, w7.y5.q(46, 56, 53));
        }
        return this.f5054i1;
    }

    public final void H() {
        nb nbVar = this.f5094v1;
        if (nbVar == null) {
            return;
        }
        this.f5095v2 = null;
        nbVar.getTopLayout().setAlpha(0.0f);
        this.f5094v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f5094v1.getBottomLayout().setAlpha(0.0f);
        this.f5094v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f5094v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f5094v1.setVisibility(8);
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
        kb kbVar;
        if (!this.W && (kbVar = this.M0) != null) {
            if (kbVar.getTranslationY() < (this.f5066n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            na naVar = this.f5049g2;
            if (naVar != null) {
                AndroidUtilities.cancelRunOnUIThread(naVar);
            }
            this.f5052h2 = true;
            this.S1 = true;
            this.f5049g2 = new na(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f5049g2, j3);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f5049g2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.M():boolean");
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
            this.f5088t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f5062l0.setVisibility(i17);
            this.f5035c1.setVisibility(8);
            this.f5091u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f5031b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5062l0.setVisibility(i14);
            this.f5048g1.setVisibility(8);
            this.f5057j1.setVisibility(8);
            this.f5041e1.setVisibility(8);
            ImageView imageView = this.f5054i1;
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
            this.f5073p0.setVisibility(i16);
            w();
            this.f5074p1.setAlpha(0.0f);
            this.f5074p1.setVisibility(8);
            this.f5028a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            l8 l8Var = this.K1;
            if (l8Var == null || !l8Var.f4991n) {
                u();
                H();
            }
            rf0 rf0Var = this.C1;
            if (rf0Var != null) {
                rf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            l8 l8Var2 = this.K1;
            if (l8Var2 != null && l8Var2.f4981h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5028a1.setVisibility(i13);
            this.f5062l0.setAlpha(1.0f);
            this.f5062l0.setTranslationY(0.0f);
            l8 l8Var3 = this.K1;
            this.f5035c1.setVisibility((l8Var3 == null || l8Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.f5658r.d(0.0f, true);
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
        rf0 rf0Var2 = this.C1;
        if (rf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f5047g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            rf0Var2.setAllowTouch(z11);
        }
        bc bcVar = this.f5035c1;
        if (bcVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            bcVar.f5120e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f5033c;
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
        l8 l8Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j3;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        l8 l8Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        l8 l8Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        ha haVar;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        l8 l8Var4;
        int i17;
        l8 l8Var5;
        l8 l8Var6;
        l8 l8Var7;
        i71 textureView;
        l8 l8Var8;
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
            l8 l8Var9 = this.K1;
            if (l8Var9 != null) {
                l8Var9.i(false);
                this.K1 = null;
            }
            yb ybVar = this.A0;
            if (ybVar != null) {
                ybVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new ha(this, 18));
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
        int i18 = this.f5033c;
        if (i11 != 1 && i10 != 1) {
            j3 = 0;
        } else {
            if (i11 == 1) {
                l8Var = this.K1;
            } else {
                l8Var = null;
            }
            this.f5041e1.setEntry(l8Var);
            if (this.O1 == 1) {
                this.f5048g1.setVisibility(0);
                l8 l8Var10 = this.K1;
                if (l8Var10 != null && l8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f5057j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((pg0) this.f5057j1.f5458c).a(this.X0.k(), false);
                this.f5073p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                l8 l8Var11 = this.K1;
                if (l8Var11 != null && !TextUtils.isEmpty(l8Var11.f5012y)) {
                    this.f5048g1.setVisibility(8);
                    this.f5057j1.setVisibility(0);
                    ((pg0) this.f5057j1.f5458c).a(true, false);
                    this.f5073p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f5073p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f5041e1.setVisibility(0);
            l8 l8Var12 = this.K1;
            if (l8Var12 != null && l8Var12.f5005u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f5054i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f5031b1.setVisibility(0);
            this.X0.setVisibility(0);
            l8 l8Var13 = this.K1;
            if ((l8Var13 != null && l8Var13.J0 != 0) || this.f5093v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f5035c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            l8 l8Var14 = this.K1;
            if ((l8Var14 != null && l8Var14.J0 != 0) || this.f5093v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f5062l0.setVisibility(0);
            this.f5062l0.clearFocus();
            l8 l8Var15 = this.K1;
            if (l8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = l8Var15.I0;
            }
            this.f5035c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((l8Var2 = this.K1) == null || !l8Var2.f4979g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5035c1.setPeriodVisible(z10);
            l8 l8Var16 = this.K1;
            if (l8Var16 != null && l8Var16.f4994o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5035c1.setHasRoundVideo(z11);
            bc bcVar = this.f5035c1;
            if (bcVar == null) {
                j3 = 0;
            } else {
                l8 l8Var17 = this.K1;
                if (l8Var17 == null || !l8Var17.f4991n) {
                    j3 = 0;
                    bcVar.v(null, null);
                } else {
                    TLRPC.Peer peer = l8Var17.f4997q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        l8 l8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        l8Var18.f4995p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        l8 l8Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        l8Var19.f4995p = append;
                    }
                    String str3 = this.K1.f5001s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f5035c1.v(str4, append);
                }
            }
            l8 l8Var20 = this.K1;
            if (l8Var20 != null && l8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            wc wcVar = this.Z0;
            boolean z22 = wcVar.f5765j0;
            wcVar.f5765j0 = z12;
            wcVar.f5763i0.f(z12, true);
            wcVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f5073p0.setVisibility(0);
            this.f5088t1.setVisibility(0);
            l8 l8Var21 = this.K1;
            if (l8Var21 != null && l8Var21.f4968b0) {
                this.f5073p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f5062l0.setVisibility(0);
            this.f5091u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f5073p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            l8 l8Var22 = this.K1;
            if (l8Var22 != null && l8Var22.J0 != j3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (l8Var22 != null && l8Var22.f4979g) {
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
            u6 u6Var = this.f5031b1;
            if (!TextUtils.equals(string, u6Var.d) || z23 != u6Var.e) {
                u6Var.removeView(u6Var.f5610c);
                Context context = u6Var.getContext();
                u6Var.d = string;
                u6Var.e = z23;
                t6 t6Var = new t6(u6Var, context, string, z23);
                u6Var.f5610c = t6Var;
                t6Var.setContentDescription(string);
                u6Var.addView(u6Var.f5610c, w7.y5.c(-2.0f, -2));
                u6Var.e();
            }
            this.f5088t1.setVisibility(8);
            this.f5091u1.setVisibility(8);
            if (!this.f5052h2) {
                l8 l8Var23 = this.K1;
                if (l8Var23 != null && l8Var23.f5005u) {
                    this.X0.l(l8Var23);
                } else {
                    this.X0.set(l8Var23);
                }
            }
            this.f5052h2 = false;
            cu editText = this.f5035c1.f5121f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                haVar = null;
            } else {
                haVar = new ha(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(haVar);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f5038d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                cb cbVar = this.f5038d1;
                cbVar.c(false, false);
                cbVar.f5536c = arrayList;
                cbVar.d = arrayList2;
                cbVar.e = arrayList3;
                cbVar.f5541w = new t01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                cbVar.K = new t01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                cbVar.f5535b.Y2.N(false);
                this.f5038d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((l8Var8 = this.K1) == null || (!l8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                l8 l8Var24 = this.K1;
                if (l8Var24 != null && (l8Var24.f4970c || l8Var24.f4979g || this.f5090u0)) {
                    if (l8Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    l8 l8Var25 = this.K1;
                    if (l8Var25.K && l8Var25.f4966a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new qa(this, 7));
                    }
                    this.f5035c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    bc bcVar2 = this.f5035c1;
                    bcVar2.V = true;
                    bcVar2.f5121f.setText("");
                }
            }
            l8 l8Var26 = this.K1;
            if (l8Var26 != null && ((l8Var26.f5005u && !l8Var26.K) || l8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f5031b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (l8Var7 = this.K1) != null && !l8Var7.f5005u && !l8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f5031b1.d(3, z19);
            if (!this.N1 && !this.f5035c1.o()) {
                ai.l9 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                ai.f9 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.f1192a, B) || ((l8Var6 = this.K1) != null && (l8Var6.f4979g || l8Var6.J0 != j3))) {
                    z20 = true;
                    this.f5031b1.setShareEnabled(z20);
                    l8Var4 = this.K1;
                    if (l8Var4 == null && l8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f5048g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f5073p0.setVisibility(0);
                    this.f5073p0.setTranslationX(0.0f);
                    l8Var5 = this.K1;
                    if (l8Var5 == null && l8Var5.J0 != j3) {
                        this.f5073p0.l("", false);
                    } else if (l8Var5 == null && l8Var5.f4979g) {
                        this.f5073p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (l8Var5 == null && l8Var5.f5005u) {
                        this.f5073p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (l8Var5 == null && l8Var5.f4991n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f5073p0, 32.0f, i18);
                        this.f5073p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.K1.f4997q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f4997q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f4997q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f5073p0.l(spannableStringBuilder, false);
                    } else {
                        this.f5073p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f5031b1.setShareEnabled(z20);
            l8Var4 = this.K1;
            if (l8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f5048g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f5073p0.setVisibility(0);
            this.f5073p0.setTranslationX(0.0f);
            l8Var5 = this.K1;
            if (l8Var5 == null) {
            }
            if (l8Var5 == null) {
            }
            if (l8Var5 == null) {
            }
            if (l8Var5 == null) {
            }
            this.f5073p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            bc bcVar3 = this.f5035c1;
            y70 y70Var = bcVar3.V0;
            if (y70Var != null) {
                y70Var.u();
                bcVar3.V0 = null;
            }
            this.f5060k1.e(z21);
            cb cbVar2 = this.f5038d1;
            if (cbVar2.M) {
                cbVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (l8Var3 = this.K1) != null) {
            if (l8Var3.f4975e0 < j3) {
                l8Var3.f4975e0 = j3;
            }
            this.M1 = l8Var3.f4975e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f4981h0;
            } else {
                duration = this.X0.getDuration();
            }
            l8 l8Var27 = this.K1;
            if (l8Var27.f4981h0 <= 0) {
                l8Var27.f4981h0 = duration;
            }
            File file = l8Var27.Z0;
            if (file == null) {
                file = l8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            l8 l8Var28 = this.K1;
            this.f5088t1.o(false, absolutePath, l8Var28.f4981h0, l8Var28.P);
            l8 l8Var29 = this.K1;
            float f10 = (float) duration;
            long j10 = l8Var29.Z * f10;
            long j11 = l8Var29.f4965a0 * f10;
            wc wcVar2 = this.f5088t1;
            wcVar2.Z0 = j10;
            wcVar2.f5745a1 = j11;
            qc qcVar = wcVar2.h;
            if (qcVar != null) {
                qc.a(qcVar, true);
            }
            bi.v vVar = new bi.v(this, 8);
            this.f5088t1.setDelegate(new lb(vVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f5088t1.setVideoLeft(max);
            this.f5088t1.setVideoRight(0.04f + max);
            vVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        rf0 rf0Var = this.C1;
        if (rf0Var != null) {
            rf0Var.setAllowTouch(false);
        }
        e4 e4Var2 = this.f5064m1;
        boolean z24 = true;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        bc bcVar4 = this.f5035c1;
        if (bcVar4 != null) {
            g gVar = bcVar4.f5121f;
            gVar.d();
            gVar.k(true);
            this.f5035c1.f5120e0 = true;
        }
        zb zbVar = this.X0;
        if (zbVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            zbVar.x(8, z15);
        }
        nb nbVar = this.f5094v1;
        if (nbVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            nbVar.setCoverPreview(z14);
        }
        e4 e4Var3 = this.f5068n1;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
        yb ybVar2 = this.A0;
        ybVar2.setPreview((i11 == 1 && ybVar2.j()) ? false : false);
    }

    public final void P() {
        pg.d1 d1Var;
        int i10;
        if (this.f5044f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f5103x2 = new ha(this, 3);
            } else {
                Z(false);
            }
        }
        bc bcVar = this.f5035c1;
        if (bcVar != null) {
            bcVar.f5121f.s();
        }
        j7 j7Var = this.O0;
        if (j7Var != null) {
            j7Var.h();
        }
        v6 v6Var = this.f5071o1;
        if (v6Var != null) {
            ai.l9 storiesController = MessagesController.getInstance(v6Var.f5672a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f1197i.f(UserConfig.getInstance(storiesController.f1192a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            v6Var.f5673b = storiesController.f1193b.m() + i10 + 1;
            v6Var.f5674c.invalidate();
        }
        nb nbVar = this.f5094v1;
        if (nbVar != null && (d1Var = nbVar.O0.d) != null) {
            d1Var.postRunnable(d1Var.f41097w);
        }
        zb zbVar = this.X0;
        if (zbVar != null) {
            zbVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.f5033c).getStoriesController().f1210w;
        if (!b1Var.f4369c && !b1Var.d) {
            b1Var.d = true;
            x0 x0Var = new x0(b1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.f4367a);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, false, (Object) x0Var, 0));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z10;
        nb nbVar;
        vb vbVar;
        wb wbVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        nb nbVar2;
        if (i11 == 0) {
            this.f5067n0.setVisibility(8);
        }
        if (i10 == 0 && (nbVar2 = this.f5094v1) != null) {
            nbVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f5035c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f5048g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5057j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5041e1.setVisibility(i14);
            ImageView imageView = this.f5054i1;
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
            this.f5073p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (nbVar = this.f5094v1) != null) {
            nbVar.f5336d1.setLayerType(0, null);
        }
        rf0 rf0Var = this.C1;
        if (rf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            rf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            vb vbVar2 = this.f5081r1;
            if (vbVar2 != null) {
                vbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (vbVar = this.f5081r1) != null) {
            vbVar.setVisibility(8);
            this.f5081r1.setAppearProgress(0.0f);
            vb vbVar3 = this.f5081r1;
            vbVar3.f4810x = null;
            g0 g0Var = vbVar3.f4805f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            vbVar3.d.setVisibility(8);
            vbVar3.f4802a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            wb wbVar2 = this.f5085s1;
            if (wbVar2 != null) {
                wbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (wbVar = this.f5085s1) != null) {
            wbVar.setVisibility(8);
            this.f5085s1.setAppearProgress(0.0f);
            wb wbVar3 = this.f5085s1;
            wbVar3.f5149b = null;
            g0 g0Var2 = wbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            wbVar3.e.setVisibility(8);
            wbVar3.setVisibility(8);
        }
    }

    public final void R(fc fcVar) {
        ai.f9 o9;
        kc kcVar;
        if (this.d) {
            return;
        }
        int i10 = this.f5033c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f5090u0 = false;
        this.e = false;
        this.B2 = false;
        this.f5084s0.f4349g = false;
        WindowManager windowManager = this.f5043f;
        if (windowManager != null && (kcVar = this.f5066n) != null && kcVar.getParent() == null) {
            kc kcVar2 = this.f5066n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, kcVar2, layoutParams);
            windowManager.addView(this.f5066n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.f5093v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (fcVar != null) {
            this.F = fcVar;
            this.J = fcVar.f4735a;
            rectF.set(fcVar.f4737c);
            this.G = fcVar.f4736b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5079r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f5050h0.setBackgroundColor(i11);
        this.f5079r.setTranslationX(0.0f);
        this.f5079r.setTranslationY(0.0f);
        this.f5079r.b(0.0f);
        this.f5079r.setScaleX(1.0f);
        this.f5079r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5029b, 1);
        g(1.0f, true, new ha(this, 6));
        e();
        this.f5093v0 = 0L;
        this.f5097w0 = "";
    }

    public final void S(ec ecVar, l8 l8Var, long j3) {
        int i10;
        kc kcVar;
        if (this.d) {
            return;
        }
        int i11 = this.f5033c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f5090u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5043f;
        if (windowManager != null && (kcVar = this.f5066n) != null && kcVar.getParent() == null) {
            kc kcVar2 = this.f5066n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, kcVar2, layoutParams);
            windowManager.addView(this.f5066n, layoutParams);
            g0();
        }
        this.K1 = l8Var;
        this.O1 = l8Var.K ? 1 : 0;
        this.f5084s0.f4349g = false;
        RectF rectF = this.H;
        if (ecVar != null) {
            this.F = ecVar;
            this.J = ecVar.f4735a;
            rectF.set(ecVar.f4737c);
            this.G = ecVar.f4736b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5079r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f5050h0.setBackgroundColor(i10);
        this.f5079r.setTranslationX(0.0f);
        this.f5079r.setTranslationY(0.0f);
        this.f5079r.b(0.0f);
        this.f5079r.setScaleX(1.0f);
        this.f5079r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5029b, 1);
        l8 l8Var2 = this.K1;
        if (l8Var2 != null) {
            this.f5035c1.setText(l8Var2.C0);
        }
        L(new ab(this, 0), j3);
        if (this.K1.f4968b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.f5031b1.b(false, false);
        e();
        this.f5093v0 = 0L;
        this.f5097w0 = "";
    }

    public final void T() {
        y70 y70Var;
        zb zbVar = this.X0;
        if (zbVar != null) {
            zbVar.x(4, true);
        }
        bc bcVar = this.f5035c1;
        if (bcVar != null && (y70Var = bcVar.V0) != null) {
            y70Var.u();
            bcVar.V0 = null;
        }
        rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.m2) new pb(this, 1), 14, false);
        x0Var.setOnDismissListener(new wa(this, 1));
        x0Var.show();
    }

    public final void U(ec ecVar, l8 l8Var) {
        int i10;
        boolean z10;
        int i11;
        ai.f9 o9;
        kc kcVar;
        if (this.d) {
            return;
        }
        int i12 = this.f5033c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f5090u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5043f;
        if (windowManager != null && (kcVar = this.f5066n) != null && kcVar.getParent() == null) {
            kc kcVar2 = this.f5066n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, kcVar2, layoutParams);
            windowManager.addView(this.f5066n, layoutParams);
            g0();
        }
        this.K1 = l8Var;
        ga.a(i12, l8Var);
        l8 l8Var2 = this.K1;
        if (l8Var2 != null && l8Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (l8Var2 != null && l8Var2.f5005u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5084s0.f4349g = z10;
        if (this.f5093v0 == 0 && (o9 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o9.a(i12, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (ecVar != null) {
            this.F = ecVar;
            this.J = ecVar.f4735a;
            rectF.set(ecVar.f4737c);
            this.G = ecVar.f4736b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5079r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f5050h0.setBackgroundColor(i11);
        this.f5079r.setTranslationX(0.0f);
        this.f5079r.setTranslationY(0.0f);
        this.f5079r.b(0.0f);
        this.f5079r.setScaleX(1.0f);
        this.f5079r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5029b, 1);
        l8 l8Var3 = this.K1;
        if (l8Var3 != null) {
            this.f5035c1.setText(l8Var3.C0);
        }
        this.f5031b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ha(this, 6));
        e();
        this.f5093v0 = 0L;
        this.f5097w0 = "";
    }

    public final void V() {
        pg.f1 f1Var = this.f5098w1;
        if (f1Var != null) {
            f1Var.bringToFront();
        }
        View view = this.f5102x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f5106y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f5109z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        zc zcVar = this.f5074p1;
        if (zcVar != null) {
            zcVar.bringToFront();
        }
        rf0 rf0Var = this.C1;
        if (rf0Var != null) {
            rf0Var.bringToFront();
        }
        if0 if0Var = this.E1;
        if (if0Var != null) {
            if0Var.bringToFront();
        }
        kf0 kf0Var = this.F1;
        if (kf0Var != null) {
            kf0Var.bringToFront();
        }
        v6 v6Var = this.f5071o1;
        if (v6Var != null) {
            v6Var.bringToFront();
        }
        p pVar = this.f5077q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(l8 l8Var, boolean z10) {
        File file;
        View view;
        float f7;
        l8 l8Var2;
        boolean z11;
        int i10;
        if (l8Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = l8Var.O0;
            } else {
                file = l8Var.N0;
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
            i71 textureView = this.X0.getTextureView();
            if (l8Var.K && !l8Var.f5005u && textureView != null) {
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
            File file2 = l8Var.Q0;
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
            File file3 = l8Var.P0;
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
            nb nbVar = this.f5094v1;
            if (nbVar != null && nbVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                nb nbVar2 = this.f5094v1;
                nbVar2.I0 = true;
                j6 j6Var = nbVar2.R0;
                j6Var.f41610a = true;
                j6Var.draw(canvas);
                nb nbVar3 = this.f5094v1;
                nbVar3.R0.f41610a = false;
                nbVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = l8.w(this.f5033c, "jpg");
            if (z10) {
                l8Var2 = l8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new u1(this, createBitmap, z11, w10, l8Var2, 1));
            } else {
                l8Var2 = l8Var;
                z11 = z10;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z11) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (!z11) {
                l8Var2.N0 = w10;
            }
            l8Var2.f4969b1 = createScaledBitmap;
        }
    }

    public final void X() {
        ai.f9 o9;
        int size;
        char c10;
        View[] viewPages;
        c61[] c61VarArr;
        fa faVar = this.f5076q0;
        BitmapDrawable bitmapDrawable = null;
        if (faVar != null) {
            faVar.dismiss();
            this.f5076q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f5041e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            t6 t6Var = this.f5031b1.f5610c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(t6Var, i10);
            return;
        }
        bc bcVar = this.f5035c1;
        if (bcVar != null && bcVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.p6 p6Var = bcVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(p6Var, i11);
            bcVar.e();
            return;
        }
        l8 l8Var = this.K1;
        int i12 = this.f5033c;
        if ((l8Var == null || (!l8Var.f4979g && l8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        ai.d dVar = this.f5026a;
        if (bcVar != null && !this.K1.D0) {
            CharSequence text = bcVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((c11[]) spannable.getSpans(0, text.length(), c11.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.xc(this.f5066n, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.h6.gc, 0, new ha(this, 27), dVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(bcVar, i13);
                    return;
                }
            }
        }
        l8 l8Var2 = this.K1;
        if (!l8Var2.f4979g && l8Var2.J0 == 0) {
            if (this.N != 0) {
                l8Var2.f5007v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            zb zbVar = this.X0;
            zbVar.x(3, true);
            fa faVar2 = new fa(this.f5029b, this.K1.I0, dVar);
            faVar2.q1(this.K1.E0);
            faVar2.p1(this.K1.f5007v0);
            faVar2.F = this.M;
            faVar2.U = new ia(this, 14);
            faVar2.e1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            faVar2.m1(size);
            faVar2.k1(false);
            CharSequence text2 = bcVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (c61 c61Var : (c61[]) ((Spanned) text2).getSpans(0, text2.length(), c61.class)) {
                    if (c61Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(c61Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f18483id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f18483id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            faVar2.S = arrayList2;
            faVar2.W = new ia(this, 15);
            faVar2.X = new ia(this, 16);
            faVar2.T = new qa(this, 10);
            this.f5076q0 = faVar2;
            l8 l8Var3 = this.K1;
            if (l8Var3.K) {
                if (zbVar != null && !l8Var3.f4978f0 && this.f5044f0 != 2) {
                    l8Var3.f4975e0 = zbVar.getCurrentPosition();
                    Utilities.Callback iaVar = new ia(this, 17);
                    View view = this.f5098w1;
                    View view2 = this.f5109z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = zbVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    zbVar.h(iaVar, viewArr);
                }
                fa faVar3 = this.f5076q0;
                Bitmap bitmap = this.K1.f4980g0;
                ha haVar = new ha(this, 20);
                if (bitmap != null) {
                    faVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                faVar3.f4698b0 = bitmapDrawable;
                faVar3.f4700c0 = haVar;
                i1 i1Var = faVar3.f4697b;
                if (i1Var != null) {
                    for (View view3 : i1Var.getViewPages()) {
                        if (view3 instanceof y9) {
                            y9 y9Var = (y9) view3;
                            y9Var.g(false);
                            y9Var.e(false);
                        }
                    }
                }
            }
            this.f5076q0.setOnDismissListener(new wa(this, 0));
            this.f5076q0.show();
            return;
        }
        l8Var2.f4988l = false;
        i(null);
        p0();
    }

    public final void Y(gc gcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (gcVar != null) {
            this.F = gcVar;
            this.J = gcVar.f4735a;
            rectF.set(gcVar.f4737c);
            this.G = gcVar.f4736b;
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
        this.f5050h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f5099w2 || z10) {
            this.f5086s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f5029b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f5086s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    qq qqVar = new qq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    qqVar.e = dp;
                    qqVar.f27736f = dp2;
                    this.A0.setCameraThumb(qqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f5026a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                        alertDialog$Builder.f18662a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new qa(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f18662a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f5099w2 = true;
                }
            }
            if (!this.f5086s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new ha(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        ob obVar = this.B0;
        if (obVar != null && obVar.getTextureView() != null) {
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
            animate.alpha(f7).setUpdateListener(new mb(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 1)).setDuration(320L).setInterpolator(rr.h).start();
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
            this.f5043f.updateViewLayout(this.f5066n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ai.f9 o9;
        l8 l8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            j7 j7Var = this.O0;
            if (j7Var != null) {
                j7Var.h();
            }
            if (this.f5065m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f5065m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f5065m2 = albumEntry;
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
            int i14 = this.f5044f0;
            int i15 = this.f5033c;
            if (i14 == 1) {
                if (!this.N1 && !this.f5035c1.o()) {
                    ai.l9 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    ai.f9 o10 = storiesController.o();
                    if (o10 == null || !o10.a(storiesController.f1192a, B) || ((l8Var = this.K1) != null && (l8Var.f4979g || l8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f5031b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                l8 l8Var2 = this.K1;
                if (l8Var2 == null || l8Var2.J0 == 0) {
                    h0(o9, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f5033c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        ob obVar = this.B0;
        if ((obVar != null && obVar.isDual()) || this.a2) {
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
        xc xcVar = this.E0;
        if (xcVar.f5856n != i10) {
            xcVar.f5856n = i10;
            ValueAnimator valueAnimator = xcVar.f5857r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                xcVar.f5857r = null;
            }
            xcVar.setDrawable(i10);
        }
        if (this.f5044f0 == 0 && !this.I0.e && this.Y1 != null && !I()) {
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
        Boolean bool = this.f5075p2;
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
                this.f5078q2 = new ra(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f5069n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5069n2 = null;
            }
            o1.k kVar = this.f5072o2;
            if (kVar != null) {
                kVar.c();
                this.f5072o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            kb kbVar = this.M0;
            if (kbVar != null) {
                kbVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            dc dcVar = this.f5079r;
            if (dcVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                dcVar.setImportantForAccessibility(i10);
            }
            kb kbVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            kbVar2.setImportantForAccessibility(i11);
            this.f5075p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            kc kcVar = this.f5066n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (kcVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, kcVar.getHeight());
            kb kbVar3 = this.M0;
            kbVar3.K = !z10;
            if (this.f5058j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5061k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(kbVar3, o1.h.f15516n, height);
                this.f5072o2 = kVar2;
                kVar2.f15533u.a(0.75f);
                this.f5072o2.f15533u.b(350.0f);
                this.f5072o2.a(new sa(this, height, 0));
                this.f5072o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f5069n2 = ofFloat;
                ofFloat.addUpdateListener(new ta(this, 0));
                this.f5069n2.addListener(new jb(this, 1));
                this.f5069n2.setDuration(450L);
                this.f5069n2.setInterpolator(rr.h);
                this.f5069n2.start();
            }
            if (!z10 && !this.S1) {
                this.f5063l2 = null;
            }
            if (!z10 && this.f5044f0 == 0 && !this.f5086s2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f5045f1 == null) {
            ij0 ij0Var = new ij0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5045f1 = ij0Var;
            ij0Var.F *= 1.5f;
        }
        this.f5048g1.setAnimation(this.f5045f1);
        int i10 = 20;
        if (!z11) {
            ij0 ij0Var2 = this.f5045f1;
            if (!z10) {
                i10 = 0;
            }
            ij0Var2.N(i10, false, false);
        } else if (z10) {
            ij0 ij0Var3 = this.f5045f1;
            if (ij0Var3.f25069a0 > 20) {
                ij0Var3.N(0, false, false);
            }
            this.f5045f1.P(20);
            this.f5045f1.start();
        } else {
            ij0 ij0Var4 = this.f5045f1;
            int i11 = ij0Var4.f25069a0;
            if (i11 != 0 && i11 < 43) {
                ij0Var4.P(43);
                this.f5045f1.start();
            }
        }
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        dc dcVar = this.f5079r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ta(this, 5));
            this.E.addListener(new ai.t2(this, f7, runnable, 2));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(rr.h);
            } else if (f7 <= 0.0f && dcVar.f4551a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(rr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(rr.h);
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
        dcVar.invalidate();
        this.f5066n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f5066n.findOnBackInvokedDispatcher()) == null) {
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
            e4 e4Var2 = this.f5064m1;
            if (e4Var2 != null) {
                e4Var2.e(true);
            }
            e4 e4Var3 = this.f5060k1;
            if (e4Var3 != null) {
                e4Var3.e(true);
            }
            e4 e4Var4 = this.W0;
            if (e4Var4 != null) {
                e4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f5032b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f5032b2 = I();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        m0(z11);
        db dbVar = this.Q0;
        b4 b4Var = this.U0;
        b4 b4Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f5044f0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f5044f0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b4Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b4Var, property, (!z10 && this.f5044f0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f5044f0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b4Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dbVar, property, (z10 || this.f5044f0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f5044f0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(dbVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(rr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f5044f0 == 0 && !I()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        b4Var2.setAlpha(f7);
        if (z10 && this.f5044f0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        b4Var2.setTranslationY(dp);
        b4Var.setAlpha((!z10 && this.f5044f0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f5044f0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        b4Var.setTranslationY(dp2);
        dbVar.setAlpha((z10 || this.f5044f0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f5044f0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        dbVar.setTranslationY(f13);
    }

    public final void h0(ai.f9 f9Var, boolean z10) {
        if (this.f5110z2) {
            return;
        }
        rg.j0 j0Var = new rg.j0(f9Var.b(), this.f5033c, this.f5029b, new pb(this, 0), null);
        j0Var.X = B();
        j0Var.setOnDismissListener(new m80(2, this, z10));
        this.X0.x(7, true);
        this.f5110z2 = true;
        j0Var.show();
    }

    public final void i(Runnable runnable) {
        l8 l8Var;
        Runnable runnable2;
        zb zbVar;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        tf0 tf0Var = this.B1;
        if (tf0Var != null && (l8Var = this.K1) != null) {
            l8Var.f4984j = tf0Var.d() | l8Var.f4984j;
            l8 l8Var2 = this.K1;
            tf0 tf0Var2 = this.B1;
            File file = l8Var2.Z0;
            if (file != null) {
                file.delete();
                l8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = tf0Var2.getSavedFilterState();
            l8Var2.f4966a1 = savedFilterState;
            if (!l8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = tf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = l8Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, l8Var2.f4987k0 / 2.0f, l8Var2.f4989l0 / 2.0f);
                        matrix.postRotate(-l8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        l8Var2.f4992n0.preScale(l8Var2.f4987k0 / createBitmap.getWidth(), l8Var2.f4989l0 / createBitmap.getHeight());
                        l8Var2.f4987k0 = createBitmap.getWidth();
                        l8Var2.f4989l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = l8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            l8Var2.Z0.delete();
                        }
                        String k10 = l8.k(l8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = l8Var2.f4964a;
                        if (!z10) {
                            str = "jpg";
                        }
                        l8Var2.Z0 = l8.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(l8Var2.Z0);
                                if (z10) {
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
                            Utilities.themeQueue.postRunnable(new ai.s4(l8Var2, createBitmap, z10, runnable2, 2));
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
                l8 l8Var3 = this.K1;
                if (!l8Var3.K && (zbVar = this.X0) != null) {
                    zbVar.set(l8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f5039d2 != z10) {
            this.f5039d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(rr.h).withEndAction(new ra(this, z10, 1)).start();
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
        if (this.K1 != null && this.D1 != null && this.f5050h0.getMeasuredWidth() > 0 && this.f5050h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f5050h0.getMeasuredWidth() / 2.0f, this.f5050h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f5050h0.getMeasuredWidth() / this.f5050h0.getMeasuredHeight(), this.f5050h0.getMeasuredHeight() / this.f5050h0.getMeasuredWidth(), this.f5050h0.getMeasuredWidth() / 2.0f, this.f5050h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f5050h0.getMeasuredWidth()) * this.K1.f4987k0, (1.0f / this.f5050h0.getMeasuredHeight()) * this.K1.f4989l0);
            matrix.postConcat(this.K1.f4992n0);
            matrix.postScale(this.f5050h0.getMeasuredWidth() / this.K1.f4983i0, this.f5050h0.getMeasuredHeight() / this.K1.f4985j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f7;
        q91 q91Var = this.V0;
        if ((q91Var.getTag() != null && z10) || (q91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f5042e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ha haVar = new ha(this, 25);
                this.f5042e2 = haVar;
                AndroidUtilities.runOnUIThread(haVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f5046f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        q91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5046f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            q91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f5046f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(q91Var, property, f7));
        this.f5046f2.addListener(new ai.n(13, this, z10));
        this.f5046f2.start();
        if (z10) {
            ha haVar2 = new ha(this, 26);
            this.f5042e2 = haVar2;
            AndroidUtilities.runOnUIThread(haVar2, 2000L);
        }
    }

    public final void k() {
        ai.a5 a5Var;
        if (this.J == 1) {
            RectF rectF = this.f5037d0;
            rectF.set(this.f5050h0.getLeft(), this.f5050h0.getTop(), this.f5050h0.getMeasuredWidth(), this.f5050h0.getMeasuredHeight());
            rectF.offset(this.f5079r.getX(), this.f5079r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f5034c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f5050h0.setAlpha(this.I);
            float f10 = rectF3.left;
            xb xbVar = this.f5050h0;
            xbVar.setTranslationX((f10 - xbVar.getLeft()) - this.f5079r.getX());
            float f11 = rectF3.top;
            xb xbVar2 = this.f5050h0;
            xbVar2.setTranslationY((f11 - xbVar2.getTop()) - this.f5079r.getY());
            gc gcVar = this.F;
            if (gcVar != null && (a5Var = gcVar.f4738f) != null) {
                a5Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f4738f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f5050h0.setScaleX(rectF3.width() / this.f5050h0.getMeasuredWidth());
            this.f5050h0.setScaleY(rectF3.height() / this.f5050h0.getMeasuredHeight());
            this.f5053i0.setAlpha(this.I);
            this.f5059k0.setAlpha(this.I);
            this.f5062l0.setAlpha(this.I);
            if (this.f5044f0 == 2) {
                this.f5091u1.setAlpha(this.I);
            }
        }
    }

    public final void k0() {
        fa faVar = this.f5076q0;
        if (faVar != null) {
            faVar.dismiss();
            this.f5076q0 = null;
        }
        fa faVar2 = new fa(this.f5029b, 86400, this.f5026a);
        faVar2.o1();
        faVar2.q1(this.f5105y0);
        TLRPC.InputPeer inputPeer = this.f5101x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f5033c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        faVar2.p1(inputPeer);
        faVar2.F = this.M;
        faVar2.U = new ia(this, 18);
        faVar2.e1(false);
        faVar2.m1(1);
        faVar2.k1(false);
        faVar2.W = new ia(this, 19);
        faVar2.T = new qa(this, 12);
        this.f5076q0 = faVar2;
        faVar2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.l0(int, boolean, boolean):void");
    }

    public final void m() {
        l8 l8Var;
        boolean z10;
        if (this.f5094v1 != null && (l8Var = this.K1) != null && l8Var.f5005u) {
            File file = l8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = l8.w(this.f5033c, "webp");
            nb nbVar = this.f5094v1;
            l8 l8Var2 = this.K1;
            ArrayList arrayList = l8Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = nbVar.t0(arrayList, false, false, true, z10, l8Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.K1.W0));
                    if (t02.isRecycled()) {
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
        ob obVar;
        boolean z17 = false;
        if (this.f5044f0 == 0 && this.O1 == 1 && !this.I0.e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        if (yVar != null && yVar.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f5067n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f5044f0 == 0 && this.Y1 != null && !this.I0.e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f5044f0 == 0 && (obVar = this.B0) != null && obVar.f4492a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f5044f0 == 0 && !this.I0.e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.G0, z15, z10);
        c0(this.H0, this.I0.e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(f7, z10);
        boolean z18 = this.I0.e;
        e4 e4Var = this.f5068n1;
        if (z18) {
            e4Var.u();
        } else {
            e4Var.e(true);
        }
        h(this.a2, z10);
        if (this.O1 == -1 && this.f5044f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f5044f0 == 0) {
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
        this.f5067n0.setTranslationX(0.0f);
        float alpha5 = this.f5067n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f5858a;
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
        eb0 eb0Var = this.f5104y;
        if (eb0Var != null) {
            eb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        ij0 ij0Var = this.f5051h1;
        if (ij0Var != null) {
            int[] iArr = ij0Var.e;
            int i11 = 0;
            if (z10) {
                l8 l8Var = this.K1;
                if (l8Var != null && l8Var.f5013y0) {
                    i11 = iArr[0];
                }
                ij0Var.P(i11);
                ij0 ij0Var2 = this.f5051h1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                    return;
                }
                return;
            }
            l8 l8Var2 = this.K1;
            if (l8Var2 != null && l8Var2.f5013y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            ij0Var.N(i10, false, true);
            this.f5051h1.P(i10);
            ImageView imageView = this.f5054i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f5089t2 < 0) {
            this.f5089t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f5092u2 = arrayList;
            arrayList.add("off");
            this.f5092u2.add("auto");
            this.f5092u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            x2 x2Var = this.f5083s;
            x2Var.f5818o = f7;
            x2Var.f5817n = x2.f(f7);
            x2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            x2 x2Var2 = this.f5083s;
            x2Var2.f5819p = f10;
            x2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ha haVar = new ha(this, 2);
        nb nbVar = this.f5094v1;
        l8 l8Var = this.K1;
        if (nbVar != null && l8Var != null) {
            l8Var.f();
            boolean u02 = nbVar.u0();
            boolean z10 = nbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ka(this, nbVar, l8Var.f4983i0, l8Var.f4985j0, l8Var, z10, u02, haVar, 1));
            return;
        }
        haVar.run();
    }

    public final void q(boolean z10) {
        zb zbVar;
        if (this.d) {
            fa faVar = this.f5076q0;
            if (faVar != null) {
                faVar.dismiss();
                this.f5076q0 = null;
            }
            l8 l8Var = this.K1;
            long j3 = 0;
            if (l8Var != null && !l8Var.h) {
                if ((this.v && l8Var.f4979g) || l8Var.f4967b != 0) {
                    l8Var.f4984j = false;
                }
                l8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (zbVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                s71 s71Var = zbVar.f4409y;
                if (s71Var != null) {
                    s71Var.B();
                    zbVar.f4409y.H();
                    zbVar.f4409y = null;
                }
                s71 s71Var2 = zbVar.f4407x;
                if (s71Var2 != null) {
                    j3 = s71Var2.n();
                    zbVar.f4407x.B();
                    zbVar.f4407x.H();
                    zbVar.f4407x = null;
                }
                s71 s71Var3 = zbVar.e;
                if (s71Var3 != null) {
                    j3 = s71Var3.n();
                    zbVar.e.B();
                    zbVar.e.H();
                    zbVar.e = null;
                }
                callback4.run(Long.valueOf(j3), new ra(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f5096w));
                return;
            }
            zb zbVar2 = this.X0;
            if (zbVar2 != null && !z10) {
                zbVar2.set(null);
            }
            g(0.0f, z10, new ha(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f5066n.setBackgroundColor(0);
                this.f5031b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f5033c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        ob obVar;
        if ((this.P1 || this.Q1) && (obVar = this.B0) != null && obVar.isFrontface()) {
            int i10 = this.f5089t2;
            if (i10 == 2 || (i10 == 1 && this.f5036c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f5029b;
        if (this.B0 == null && activity != null) {
            this.B0 = new ob(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            j7 j7Var = this.O0;
            float f7 = 0.0f;
            if (j7Var != null) {
                j7Var.f4838g0 = 0.0f;
                j7Var.f4839h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(A());
            this.B0.initTexture();
            this.B0.setDelegate(new qa(this, 0));
            yc ycVar = this.F0;
            if (this.B0.f4492a && this.f5044f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(ycVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f4492a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!d1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.B0.f4492a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new f7(activity, new ia(this, 3));
            }
            this.C0.a(this.B0);
            t7 t7Var = this.D0;
            if (t7Var != null) {
                yb ybVar = this.A0;
                Object blurRenderNode = ybVar.getBlurRenderNode();
                t7Var.F = ybVar;
                t7Var.G = blurRenderNode;
                t7Var.invalidate();
            }
        }
    }

    public final void s() {
        l8 l8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (l8Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!l8Var.K) {
                if (l8Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    qa qaVar = new qa(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = l8.q(qaVar, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                i71 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                l8 l8Var2 = this.K1;
                if (l8Var2 != null) {
                    savedFilterState = l8Var2.f4966a1;
                }
                tf0 tf0Var = new tf0(this.f5029b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f5080r0, this.f5026a);
                this.B1 = tf0Var;
                this.f5079r.addView(tf0Var);
                rf0 rf0Var = this.C1;
                if (rf0Var != null) {
                    rf0Var.setFilterView(this.B1);
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
                if0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f5050h0.addView(blurControl);
                }
                kf0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f5050h0.addView(curveControl);
                }
                V();
                this.B1.getDoneTextView().setOnClickListener(new ja(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new ja(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f28494i0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            yb ybVar = this.A0;
            if (ybVar != null && ybVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f5029b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f5065m2;
        boolean z13 = !z10;
        yb ybVar2 = this.A0;
        if (ybVar2 != null && ybVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        kb kbVar = new kb(this, this.f5033c, this.f5029b, this.f5026a, albumEntry, z10, z13, z11);
        this.M0 = kbVar;
        kbVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new ab(this, 1));
        this.M0.setOnSelectListener(new za(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new yh.x0(this, 2));
        s4.b0 b0Var = this.f5063l2;
        if (b0Var != null) {
            f3 f3Var = this.M0.e;
            f3Var.B = b0Var;
            f3Var.l0();
        }
        this.f5066n.addView(this.M0, w7.y5.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.u():void");
    }

    public final void v(boolean z10) {
        f7 f7Var = this.C0;
        if (f7Var != null) {
            f7Var.f4679f = null;
            Utilities.globalQueue.cancelRunnable(f7Var.h);
            this.C0 = null;
            yb ybVar = this.A0;
            if (ybVar != null) {
                ybVar.f4564c.b(null);
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
                b0(new ha(this, 8));
                return;
            }
            b0(new ha(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            yb ybVar2 = this.A0;
            if (ybVar2 != null) {
                ybVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        kb kbVar = this.M0;
        if (kbVar == null) {
            return;
        }
        this.f5066n.removeView(kbVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f5069n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5069n2 = null;
        }
        o1.k kVar = this.f5072o2;
        if (kVar != null) {
            kVar.c();
            this.f5072o2 = null;
        }
        this.f5075p2 = null;
    }

    public final void y() {
        tf0 tf0Var = this.B1;
        if (tf0Var == null) {
            return;
        }
        tf0Var.e();
        this.C1.setFilterView(null);
        this.f5079r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f5050h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        if0 if0Var = this.E1;
        if (if0Var != null) {
            this.f5050h0.removeView(if0Var);
            this.E1 = null;
        }
        kf0 kf0Var = this.F1;
        if (kf0Var != null) {
            this.f5050h0.removeView(kf0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        nb nbVar = this.f5094v1;
        if (nbVar != null) {
            nbVar.R0.removeAllViews();
            nb nbVar2 = this.f5094v1;
            nbVar2.O0.h();
            nbVar2.R0.setVisibility(8);
            nbVar2.Q0.setVisibility(8);
            nbVar2.E0.postRunnable(new ai.f(7));
            y5 y5Var = nbVar2.f5351k2;
            if (y5Var != null) {
                y5Var.dismiss();
            }
            pg.x xVar = nbVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f5079r.removeView(this.f5094v1);
            this.f5094v1 = null;
            pg.f1 f1Var = this.f5098w1;
            if (f1Var != null) {
                this.f5050h0.removeView(f1Var);
                this.f5098w1 = null;
            }
            View view = this.f5106y1;
            if (view != null) {
                this.f5050h0.removeView(view);
                this.f5106y1 = null;
            }
            View view2 = this.f5102x1;
            if (view2 != null) {
                this.f5050h0.removeView(view2);
                this.f5102x1 = null;
            }
            View view3 = this.f5109z1;
            if (view3 != null) {
                this.f5050h0.removeView(view3);
                this.f5109z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f5050h0.removeView(view4);
                this.A1 = null;
            }
        }
    }
}
