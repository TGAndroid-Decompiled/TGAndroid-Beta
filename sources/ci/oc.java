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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mb0;
public final class oc implements NotificationCenter.NotificationCenterDelegate {
    public static oc F2;
    public final bc A0;
    public View A1;
    public boolean A2;
    public rb B0;
    public jf0 B1;
    public boolean B2;
    public h7 C0;
    public final hf0 C1;
    public wb C2;
    public final w7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final ad E0;
    public ye0 E1;
    public ValueAnimator E2;
    public jc F;
    public final bd F0;
    public af0 F1;
    public float G;
    public final z G0;
    public File G1;
    public final RectF H;
    public final ad H0;
    public ArrayList H1;
    public float I;
    public final y I0;
    public ArrayList I1;
    public int J;
    public final ed J0;
    public ArrayList J1;
    public float K;
    public boolean K0;
    public o8 K1;
    public Float L;
    public boolean L0;
    public boolean L1;
    public boolean M;
    public nb M0;
    public long M1;
    public long N;
    public v0 N0;
    public boolean N1;
    public boolean O;
    public final l7 O0;
    public int O1;
    public final AnimationNotificationsLocker P;
    public final d P0;
    public boolean P1;
    public Runnable Q;
    public final gb Q0;
    public boolean Q1;
    public Utilities.Callback4 R;
    public final w2 R0;
    public boolean R1;
    public int S;
    public final w2 S0;
    public boolean S1;
    public int T;
    public final c4 T0;
    public float T1;
    public int U;
    public final c4 U0;
    public int U1;
    public boolean V;
    public final f91 V0;
    public boolean V1;
    public boolean W;
    public final f4 W0;
    public boolean W1;
    public boolean X;
    public final cc X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final zc Z0;
    public AnimatorSet Z1;
    public final ai.d f5204a;
    public int f5205a0;
    public final dd f5206a1;
    public boolean a2;
    public final Activity f5207b;
    public int f5208b0;
    public final v6 f5209b1;
    public boolean f5210b2;
    public final int f5211c;
    public final RectF f5212c0;
    public final ec f5213c1;
    public boolean f5214c2;
    public boolean d;
    public final RectF f5215d0;
    public final fb f5216d1;
    public boolean f5217d2;
    public boolean e;
    public final Path f5218e0;
    public final u0 f5219e1;
    public Runnable f5220e2;
    public final WindowManager f5221f;
    public int f5222f0;
    public yi0 f5223f1;
    public AnimatorSet f5224f2;
    public int f5225g0;
    public final bj0 f5226g1;
    public qa f5227g2;
    public final WindowManager.LayoutParams h;
    public final ac f5228h0;
    public yi0 f5229h1;
    public boolean f5230h2;
    public final FrameLayout f5231i0;
    public ImageView f5232i1;
    public AnimatorSet f5233i2;
    public final LinearLayout f5234j0;
    public final s6 f5235j1;
    public ValueAnimator f5236j2;
    public final FrameLayout f5237k0;
    public final f4 f5238k1;
    public boolean f5239k2;
    public final ai.f0 f5240l0;
    public final f4 l1;
    public s4.b0 f5241l2;
    public final FrameLayout m0;
    public final f4 f5242m1;
    public MediaController.AlbumEntry f5243m2;
    public final nc f5244n;
    public final w2 f5245n0;
    public final f4 f5246n1;
    public ValueAnimator f5247n2;
    public final h8 f5248o0;
    public final w6 f5249o1;
    public o1.k f5250o2;
    public final org.telegram.ui.ActionBar.k5 f5251p0;
    public final cd f5252p1;
    public Boolean f5253p2;
    public ia f5254q0;
    public p f5255q1;
    public ua f5256q2;
    public final gc f5257r;
    public final org.telegram.ui.Components.ha f5258r0;
    public yb f5259r1;
    public AnimatorSet f5260r2;
    public final y2 f5261s;
    public final c7 f5262s0;
    public zb f5263s1;
    public boolean f5264s2;
    public final eb f5265t0;
    public final zc f5266t1;
    public int f5267t2;
    public boolean f5268u0;
    public final d f5269u1;
    public ArrayList f5270u2;
    public boolean v;
    public long f5271v0;
    public qb f5272v1;
    public FrameLayout f5273v2;
    public long f5274w;
    public String f5275w0;
    public pg.c1 f5276w1;
    public boolean f5277w2;
    public fc f5278x;
    public TLRPC.InputPeer f5279x0;
    public View f5280x1;
    public ka f5281x2;
    public final mb0 f5282y;
    public ga f5283y0;
    public View f5284y1;
    public ai.n8 f5285y2;
    public t f5286z0;
    public View f5287z1;
    public boolean f5288z2;

    public oc(Activity activity, int i10) {
        mb0 mb0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        ai.d dVar = new ai.d();
        this.f5204a = dVar;
        this.f5274w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f5212c0 = new RectF();
        this.f5215d0 = new RectF();
        this.f5218e0 = new Path();
        new Rect();
        this.f5222f0 = 0;
        this.f5225g0 = -1;
        this.f5283y0 = new ga();
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
        jb jbVar = new jb(this);
        this.f5217d2 = true;
        this.f5239k2 = true;
        this.f5267t2 = -1;
        this.f5207b = activity;
        this.f5211c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            mb0Var = new mb0(launchActivity, true);
        } else {
            mb0Var = null;
        }
        this.f5282y = mb0Var;
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
        this.f5221f = windowManager;
        nc ncVar = new nc(this, activity);
        this.f5244n = ncVar;
        ta taVar = new ta(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.a0.j(ncVar, taVar);
        this.f5244n.setFocusable(true);
        this.f5244n.setImportantForAccessibility(2);
        y2 y2Var = new y2(activity, windowManager, this.f5244n, layoutParams);
        this.f5261s = y2Var;
        y2Var.a(new ub(this));
        this.f5244n.addView(this.f5261s.f5807b, new ViewGroup.LayoutParams(-1, -1));
        nc ncVar2 = this.f5244n;
        gc gcVar = new gc(this, activity);
        this.f5257r = gcVar;
        ncVar2.addView(gcVar);
        gc gcVar2 = this.f5257r;
        ac acVar = new ac(this, activity);
        this.f5228h0 = acVar;
        gcVar2.addView(acVar);
        this.f5257r.addView(this.f5261s.f5808c, new ViewGroup.LayoutParams(-1, -1));
        this.f5258r0 = new org.telegram.ui.Components.ha(this.f5228h0);
        this.f5262s0 = new Object();
        gc gcVar3 = this.f5257r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f5231i0 = frameLayout;
        gcVar3.addView(frameLayout);
        gc gcVar4 = this.f5257r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f5237k0 = frameLayout2;
        gcVar4.addView(frameLayout2);
        gc gcVar5 = this.f5257r;
        ai.f0 f0Var = new ai.f0(this, activity, 2);
        this.f5240l0 = f0Var;
        gcVar5.addView(f0Var);
        this.f5240l0.setVisibility(8);
        this.f5240l0.setAlpha(0.0f);
        gc gcVar6 = this.f5257r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        gcVar6.addView(frameLayout3);
        org.telegram.ui.Components.oc.a(this.f5244n, new d9(2));
        bc bcVar = new bc(this, activity, this.f5258r0, this.f5257r, dVar);
        this.A0 = bcVar;
        nc ncVar3 = this.f5244n;
        Objects.requireNonNull(ncVar3);
        bcVar.setCancelGestures(new androidx.fragment.app.a0(ncVar3, 23));
        this.A0.setResetState(new ka(this, 13));
        this.f5228h0.addView(this.A0, w7.x5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ma(this, 12));
        ac acVar2 = this.f5228h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        acVar2.setBackgroundColor(i11);
        ac acVar3 = this.f5228h0;
        ai.k2 k2Var = yf.j0.f46866a;
        acVar3.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(12.0f)));
        this.f5228h0.setClipToOutline(true);
        ka kaVar = new ka(this, 14);
        ?? view = new View(activity);
        view.f24653a = new TextPaint(1);
        view.f24654b = new TextPaint(1);
        qr qrVar = qr.h;
        view.f24659s = new org.telegram.ui.Components.c6((View) view, 0L, 350L, qrVar);
        view.I = new bc0(view, 7);
        view.f24661x = kaVar;
        this.C1 = view;
        cc ccVar = new cc(this, activity, this.f5258r0, this.f5262s0);
        this.X0 = ccVar;
        ccVar.setCollageView(this.A0);
        cc ccVar2 = this.X0;
        ccVar2.v = new ka(this, 15);
        ccVar2.setOnTapListener(new ka(this, 16));
        this.X0.setVisibility(8);
        cc ccVar3 = this.X0;
        ccVar3.N = new ka(this, 17);
        this.f5228h0.addView(ccVar3, w7.x5.e(-1, -1, 119));
        this.f5228h0.addView(this.C1, w7.x5.e(-1, -1, 119));
        nc ncVar4 = this.f5244n;
        ec ecVar = new ec(this, activity, ncVar4, ncVar4, this.f5257r, dVar, this.f5258r0);
        this.f5213c1 = ecVar;
        ecVar.setAccount(i10);
        this.f5213c1.setUiBlurBitmap(new ta(this, 6));
        org.telegram.ui.Components.oc.a(this.f5240l0, new ai.w4(this, 3));
        this.f5213c1.setOnHeightUpdate(new la(this, 13));
        this.f5213c1.setOnPeriodUpdate(new la(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f5213c1.setDialogId(j3);
        }
        this.f5213c1.setOnPremiumHint(new la(this, 5));
        this.f5213c1.setOnKeyboardOpen(new la(this, 6));
        eb ebVar = new eb(this, activity, 0);
        this.f5265t0 = ebVar;
        this.f5257r.addView(ebVar);
        zc zcVar = new zc(activity, this.f5257r, this.f5228h0, dVar, this.f5258r0);
        this.Z0 = zcVar;
        zcVar.setOnTimelineClick(new ka(this, 10));
        this.Z0.setOnHeightChange(new ka(this, 11));
        this.X0.setVideoTimelineView(this.Z0);
        this.Z0.setVisibility(8);
        this.Z0.setAlpha(0.0f);
        this.Z0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.Y0 = frameLayout4;
        float f11 = 388;
        frameLayout4.addView(this.Z0, w7.x5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        dd ddVar = new dd(activity);
        this.f5206a1 = ddVar;
        ddVar.setVisibility(8);
        this.f5206a1.a(false);
        this.Y0.addView(this.f5206a1, w7.x5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f5240l0.addView(this.Y0, w7.x5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f5240l0.addView(this.f5213c1, w7.x5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        zc zcVar2 = new zc(activity, this.f5257r, this.f5228h0, dVar, this.f5258r0);
        this.f5266t1 = zcVar2;
        zcVar2.X0 = true;
        zcVar2.setVisibility(8);
        this.f5266t1.setAlpha(0.0f);
        this.f5240l0.addView(this.f5266t1, w7.x5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        fb fbVar = new fb(this, activity, dVar, this.f5258r0);
        this.f5216d1 = fbVar;
        fbVar.setVisibility(8);
        this.f5240l0.addView(this.f5216d1, w7.x5.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f5245n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        w2 w2Var = this.f5245n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        this.f5245n0.setImageResource(R.drawable.msg_photo_back);
        w2 w2Var2 = this.f5245n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        w2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5245n0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f5245n0.setOnClickListener(new ma(this, 1));
        this.f5231i0.addView(this.f5245n0, w7.x5.e(56, 56, 51));
        this.f5261s.a(this.f5245n0);
        h8 h8Var = new h8(activity, i10);
        this.f5248o0 = h8Var;
        h8Var.a(false, false);
        this.f5248o0.setOnClickListener(new ai.f2(6, this, activity));
        this.f5231i0.addView(this.f5248o0, w7.x5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f5251p0 = k5Var;
        k5Var.setTextSize(20);
        this.f5251p0.setGravity(19);
        this.f5251p0.setTextColor(-1);
        this.f5251p0.setTypeface(AndroidUtilities.bold());
        this.f5251p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f5251p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f5251p0.setAlpha(0.0f);
        this.f5251p0.setVisibility(8);
        this.f5251p0.setEllipsizeByGradient(true);
        this.f5251p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f5231i0.addView(this.f5251p0, w7.x5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f5234j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f5234j0.setGravity(5);
        this.f5231i0.addView(this.f5234j0, w7.x5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        la laVar = new la(this, 7);
        nc ncVar5 = this.f5244n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f5598w = true;
        imageView2.f5599x = true;
        imageView2.h = laVar;
        imageView2.f5591a = i10;
        imageView2.f5592b = ncVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ai.v0(imageView2, 9));
        imageView2.f5594f = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f5219e1 = imageView2;
        f4 f4Var = new f4(activity, 1);
        f4Var.l(1.0f, -71.0f);
        f4Var.d = 2000L;
        f4Var.U = false;
        f4Var.H.o(true, false, false);
        this.f5238k1 = f4Var;
        f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5231i0.addView(this.f5238k1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f5226g1 = imageView3;
        imageView3.setScaleType(scaleType);
        bj0 bj0Var = this.f5226g1;
        o8 o8Var = this.K1;
        if (o8Var != null && o8Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        bj0Var.setImageResource(i12);
        this.f5226g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f5226g1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f5226g1.setOnClickListener(new ma(this, 2));
        this.f5226g1.setVisibility(8);
        this.f5226g1.setAlpha(0.0f);
        s6 s6Var = new s6(activity);
        this.f5235j1 = s6Var;
        s6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f5235j1.setVisibility(8);
        this.f5235j1.setAlpha(0.0f);
        this.f5235j1.setOnClickListener(new ma(this, 3));
        this.f5234j0.addView(this.f5235j1, w7.x5.q(46, 56, 53));
        this.f5234j0.addView(this.f5226g1, w7.x5.q(46, 56, 53));
        this.f5234j0.addView(this.f5219e1, w7.x5.e(46, 56, 53));
        ad adVar = new ad(activity);
        this.E0 = adVar;
        adVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ma(this, 4));
        this.E0.setOnLongClickListener(new n5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f5261s.a(this.E0);
        this.f5231i0.addView(this.E0, w7.x5.e(56, 56, 53));
        bd bdVar = new bd(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.F0 = bdVar;
        bdVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.F0.setOnClickListener(new ma(this, 5));
        boolean q6 = d1.q(activity);
        bd bdVar2 = this.F0;
        if (q6) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        bdVar2.setVisibility(i13);
        bd bdVar3 = this.F0;
        if (q6) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        bdVar3.setAlpha(f7);
        this.f5261s.a(this.F0);
        this.f5231i0.addView(this.F0, w7.x5.e(56, 56, 53));
        ?? adVar2 = new ad(activity);
        this.G0 = adVar2;
        adVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.f5286z0 == null) {
            i14 = 6;
            this.f5286z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new ma(this, i14));
        this.G0.a(new u(this.f5286z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f5261s.a(this.G0);
        this.f5231i0.addView(this.G0, w7.x5.e(56, 56, 53));
        ad adVar3 = new ad(activity);
        this.H0 = adVar3;
        adVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ma(this, 7));
        this.f5261s.a(this.H0);
        this.f5231i0.addView(this.H0, w7.x5.e(56, 56, 53));
        y yVar = new y(activity, this.f5261s);
        this.I0 = yVar;
        yVar.f5799a.v0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new la(this, 8));
        this.f5231i0.addView(this.I0, w7.x5.e(-1, 56, 53));
        f4 f4Var2 = new f4(activity, 1);
        f4Var2.l(1.0f, -20.0f);
        f4Var2.d = 5000L;
        f4Var2.i();
        f4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        f4Var2.f4638l0 = new ai.f(9);
        this.l1 = f4Var2;
        f4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5231i0.addView(this.l1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f4 f4Var3 = new f4(activity, 2);
        f4Var3.l(0.0f, 28.0f);
        f4Var3.d = 5000L;
        f4Var3.p(true);
        this.f5242m1 = f4Var3;
        this.f5231i0.addView(f4Var3, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f4 f4Var4 = new f4(activity, 1);
        f4Var4.l(1.0f, -20.0f);
        f4Var4.d = 5000L;
        f4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f5246n1 = f4Var4;
        f4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f5231i0.addView(this.f5246n1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f4614a = paint;
        Paint paint2 = new Paint(1);
        view2.f4615b = paint2;
        view2.e = new org.telegram.ui.Components.c6((View) view2, 0L, 250L, qrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true, false);
        view2.f4616c = m6Var;
        m6Var.k(0.3f, 250L, qrVar);
        m6Var.t(AndroidUtilities.dp(13.0f));
        m6Var.r(-1);
        m6Var.u(AndroidUtilities.bold());
        m6Var.setCallback(view2);
        m6Var.f26070b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        i0(false, false);
        this.f5231i0.addView(this.J0, w7.x5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f5261s.a(this.J0);
        MediaController.loadGalleryPhotosAlbums(0);
        l7 l7Var = new l7(activity);
        this.O0 = l7Var;
        l7Var.setDelegate(jbVar);
        l7 l7Var2 = this.O0;
        if (this.O1 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l7Var2.f4957n0 = -1.0f;
        l7Var2.f4958o0 = z10;
        l7Var2.invalidate();
        this.f5237k0.addView(this.O0, w7.x5.e(-1, 100, 87));
        this.f5261s.a(this.O0);
        l7 l7Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        l7Var3.e(f10, true);
        d dVar2 = new d(activity, dVar, true);
        this.P0 = dVar2;
        dVar2.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f5237k0.addView(this.P0, w7.x5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ma(this, 8));
        f4 f4Var5 = new f4(activity, 3);
        f4Var5.p(true);
        f4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        f4Var5.h = AndroidUtilities.dp(320.0f);
        f4Var5.d = 5000L;
        f4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = f4Var5;
        this.f5237k0.addView(f4Var5, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        f91 f91Var = new f91(activity);
        this.V0 = f91Var;
        f91Var.M = false;
        f91Var.setAlpha(0.0f);
        this.f5237k0.addView(this.V0, w7.x5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new ta(this, 4));
        f91 f91Var2 = this.V0;
        this.T1 = 0.0f;
        f91Var2.b(0.0f, false);
        w7 w7Var = new w7(activity, i10, new ka(this, 12));
        this.D0 = w7Var;
        w7Var.f5703c = new la(this, 9);
        this.f5237k0.addView(w7Var, w7.x5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        gb gbVar = new gb(this, activity);
        this.Q0 = gbVar;
        gbVar.setOnSwitchModeListener(new la(this, 10));
        this.Q0.setOnSwitchingModeListener(new la(this, 11));
        this.m0.addView(this.Q0, w7.x5.e(-1, 48, 55));
        this.f5261s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.x5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5261s.a(this.R0);
        this.R0.setOnClickListener(new ma(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.x5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f5261s.a(this.S0);
        this.S0.setOnClickListener(new ma(this, 10));
        c4 c4Var = new c4(activity);
        this.T0 = c4Var;
        this.m0.addView(c4Var, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5261s.a(this.T0);
        c4 c4Var2 = new c4(activity);
        this.U0 = c4Var2;
        c4Var2.f4427a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        c4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f5261s.a(this.U0);
        d dVar3 = new d(activity, dVar, true);
        dVar3.setRoundRadius(24);
        this.f5269u1 = dVar3;
        dVar3.setVisibility(8);
        this.f5269u1.setAlpha(0.0f);
        this.f5269u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f5269u1.setOnClickListener(new ma(this, 11));
        this.m0.addView(this.f5269u1, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f5657b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f5656a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.x5.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        u6 u6Var = new u6(frameLayout5, activity, string, true);
        frameLayout5.f5658c = u6Var;
        u6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f5658c, w7.x5.c(-2.0f, -2));
        frameLayout5.e();
        this.f5209b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f5209b1.setOnClickListener(new la(this, 12));
        this.m0.addView(this.f5209b1, w7.x5.e(-1, 52, 23));
        cd cdVar = new cd(activity);
        this.f5252p1 = cdVar;
        cdVar.setAlpha(0.0f);
        this.f5252p1.setVisibility(8);
        this.f5228h0.addView(this.f5252p1, w7.x5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        w6 w6Var = new w6(activity, i10, dVar);
        this.f5249o1 = w6Var;
        this.f5228h0.addView(w6Var, w7.x5.e(-1, -1, 119));
        m0(false);
    }

    public static oc E(Activity activity, int i10) {
        oc ocVar = F2;
        if (ocVar != null && (ocVar.f5207b != activity || ocVar.f5211c != i10)) {
            ocVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new oc(activity, i10);
        }
        return F2;
    }

    public static void a(oc ocVar) {
        rb rbVar = ocVar.B0;
        boolean z10 = false;
        if (rbVar != null && rbVar.getTextureView() != null) {
            Bitmap bitmap = ocVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                ocVar.f5214c2 = false;
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
            ocVar.f5214c2 = z10;
            return;
        }
        ocVar.f5214c2 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(oc ocVar) {
        Activity activity = ocVar.f5207b;
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

    public static void c(oc ocVar) {
        ValueAnimator valueAnimator = ocVar.f5236j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            ocVar.f5236j2 = null;
        }
        ocVar.f5239k2 = false;
        gc gcVar = ocVar.f5257r;
        float f7 = gcVar.f4730a;
        float f10 = gcVar.f4731b;
        gcVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ocVar.f5236j2 = ofFloat;
        ofFloat.addUpdateListener(new bb(ocVar, f7, f10, 0));
        ocVar.f5236j2.setDuration(340L);
        ocVar.f5236j2.setInterpolator(qr.h);
        ocVar.f5236j2.addListener(new mb(ocVar, 0));
        ocVar.f5236j2.start();
    }

    public static boolean d(oc ocVar) {
        Activity activity = ocVar.f5207b;
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
        spannableString.setSpan(new vb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        oc ocVar = F2;
        if (ocVar != null) {
            ocVar.q(false);
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
        return this.f5207b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.I1;
        if (arrayList != null) {
            return arrayList.size();
        }
        o8 o8Var = this.K1;
        if (o8Var != null) {
            return o8Var.r();
        }
        return 1;
    }

    public final String C() {
        rb rbVar = this.B0;
        if (rbVar != null && rbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f5270u2.get(this.f5267t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 D() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f5207b);
            this.N0 = v0Var;
            this.f5237k0.addView(v0Var, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        int i10;
        rb rbVar = this.B0;
        if (rbVar != null && rbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f5270u2;
                if (this.f5267t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f5267t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f5232i1 == null) {
            yi0 yi0Var = new yi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5229h1 = yi0Var;
            yi0Var.h = true;
            o8 o8Var = this.K1;
            if (o8Var != null && o8Var.f5191y0) {
                yi0Var.M(35);
                this.f5229h1.P(36);
            } else {
                yi0Var.P(0);
                this.f5229h1.M(0);
            }
            this.f5229h1.Z = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.f5204a);
            this.f5229h1.Q(v02, "Sunny");
            this.f5229h1.Q(v02, "Path 6");
            this.f5229h1.Q(v02, "Path");
            this.f5229h1.Q(v02, "Path 5");
            this.f5229h1.o();
            ImageView imageView = new ImageView(this.f5207b);
            this.f5232i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f5232i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f5232i1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.f5232i1.setOnClickListener(new ma(this, 0));
            this.f5232i1.setVisibility(8);
            this.f5232i1.setImageDrawable(this.f5229h1);
            this.f5232i1.setAlpha(0.0f);
            this.f5234j0.addView(this.f5232i1, 0, w7.x5.q(46, 56, 53));
        }
        return this.f5232i1;
    }

    public final void H() {
        qb qbVar = this.f5272v1;
        if (qbVar == null) {
            return;
        }
        this.f5273v2 = null;
        qbVar.getTopLayout().setAlpha(0.0f);
        this.f5272v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f5272v1.getBottomLayout().setAlpha(0.0f);
        this.f5272v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f5272v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f5272v1.setVisibility(8);
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
        nb nbVar;
        if (!this.W && (nbVar = this.M0) != null) {
            if (nbVar.getTranslationY() < (this.f5244n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ci.oc.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            qa qaVar = this.f5227g2;
            if (qaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(qaVar);
            }
            this.f5230h2 = true;
            this.S1 = true;
            this.f5227g2 = new qa(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f5227g2, j3);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f5227g2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: ci.oc.M():boolean");
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
            this.f5266t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f5240l0.setVisibility(i17);
            this.f5213c1.setVisibility(8);
            this.f5269u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f5209b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5240l0.setVisibility(i14);
            this.f5226g1.setVisibility(8);
            this.f5235j1.setVisibility(8);
            this.f5219e1.setVisibility(8);
            ImageView imageView = this.f5232i1;
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
            this.f5251p0.setVisibility(i16);
            w();
            this.f5252p1.setAlpha(0.0f);
            this.f5252p1.setVisibility(8);
            this.f5206a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            o8 o8Var = this.K1;
            if (o8Var == null || !o8Var.f5169n) {
                u();
                H();
            }
            hf0 hf0Var = this.C1;
            if (hf0Var != null) {
                hf0Var.setAllowTouch(false);
            }
            this.X0.x(2, false);
            this.X0.x(3, false);
            this.X0.x(4, false);
            this.X0.x(5, false);
            this.X0.x(7, false);
            o8 o8Var2 = this.K1;
            if (o8Var2 != null && o8Var2.f5159h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5206a1.setVisibility(i13);
            this.f5240l0.setAlpha(1.0f);
            this.f5240l0.setTranslationY(0.0f);
            o8 o8Var3 = this.K1;
            this.f5213c1.setVisibility((o8Var3 == null || o8Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.f5645r.d(0.0f, true);
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
        hf0 hf0Var2 = this.C1;
        if (hf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f5225g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hf0Var2.setAllowTouch(z11);
        }
        ec ecVar = this.f5213c1;
        if (ecVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            ecVar.f4994e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f5211c;
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
        o8 o8Var;
        int i12;
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        long j3;
        String str;
        SpannableStringBuilder append;
        boolean z12;
        o8 o8Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        o8 o8Var3;
        long duration;
        boolean z16;
        boolean z17;
        int i14;
        ka kaVar;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        o8 o8Var4;
        int i17;
        o8 o8Var5;
        o8 o8Var6;
        o8 o8Var7;
        v61 textureView;
        o8 o8Var8;
        boolean z21 = true;
        if (i11 == 0) {
            Z(false);
            this.O0.setVisibility(0);
            l7 l7Var = this.O0;
            if (l7Var != null) {
                l7Var.g(false);
            }
            this.Q0.setVisibility(0);
            this.V0.setVisibility(0);
            this.V0.setAlpha(0.0f);
            this.J0.a(0L, true);
            o8 o8Var9 = this.K1;
            if (o8Var9 != null) {
                o8Var9.i(false);
                this.K1 = null;
            }
            bc bcVar = this.A0;
            if (bcVar != null) {
                bcVar.e();
                this.O0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new ka(this, 18));
            v0 v0Var = this.N0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            this.W0.e(true);
            f4 f4Var = this.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f5211c;
        if (i11 != 1 && i10 != 1) {
            j3 = 0;
        } else {
            if (i11 == 1) {
                o8Var = this.K1;
            } else {
                o8Var = null;
            }
            this.f5219e1.setEntry(o8Var);
            if (this.O1 == 1) {
                this.f5226g1.setVisibility(0);
                o8 o8Var10 = this.K1;
                if (o8Var10 != null && o8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f5235j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((gg0) this.f5235j1.f5517c).a(this.X0.k(), false);
                this.f5251p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                o8 o8Var11 = this.K1;
                if (o8Var11 != null && !TextUtils.isEmpty(o8Var11.f5190y)) {
                    this.f5226g1.setVisibility(8);
                    this.f5235j1.setVisibility(0);
                    ((gg0) this.f5235j1.f5517c).a(true, false);
                    this.f5251p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f5251p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f5219e1.setVisibility(0);
            o8 o8Var12 = this.K1;
            if (o8Var12 != null && o8Var12.f5183u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f5232i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f5209b1.setVisibility(0);
            this.X0.setVisibility(0);
            o8 o8Var13 = this.K1;
            if ((o8Var13 != null && o8Var13.J0 != 0) || this.f5271v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f5213c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            o8 o8Var14 = this.K1;
            if ((o8Var14 != null && o8Var14.J0 != 0) || this.f5271v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f5240l0.setVisibility(0);
            this.f5240l0.clearFocus();
            o8 o8Var15 = this.K1;
            if (o8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = o8Var15.I0;
            }
            this.f5213c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((o8Var2 = this.K1) == null || !o8Var2.f5157g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f5213c1.setPeriodVisible(z10);
            o8 o8Var16 = this.K1;
            if (o8Var16 != null && o8Var16.f5172o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5213c1.setHasRoundVideo(z11);
            ec ecVar = this.f5213c1;
            if (ecVar == null) {
                j3 = 0;
            } else {
                o8 o8Var17 = this.K1;
                if (o8Var17 == null || !o8Var17.f5169n) {
                    j3 = 0;
                    ecVar.v(null, null);
                } else {
                    TLRPC.Peer peer = o8Var17.f5175q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        o8 o8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        o8Var18.f5173p = append;
                    } else {
                        j3 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        o8 o8Var19 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        o8Var19.f5173p = append;
                    }
                    String str3 = this.K1.f5179s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f5213c1.v(str4, append);
                }
            }
            o8 o8Var20 = this.K1;
            if (o8Var20 != null && o8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            zc zcVar = this.Z0;
            boolean z22 = zcVar.f5905j0;
            zcVar.f5905j0 = z12;
            zcVar.f5903i0.f(z12, true);
            zcVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f5251p0.setVisibility(0);
            this.f5266t1.setVisibility(0);
            o8 o8Var21 = this.K1;
            if (o8Var21 != null && o8Var21.f5146b0) {
                this.f5251p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f5240l0.setVisibility(0);
            this.f5269u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f5251p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            o8 o8Var22 = this.K1;
            if (o8Var22 != null && o8Var22.J0 != j3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o8Var22 != null && o8Var22.f5157g) {
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
            v6 v6Var = this.f5209b1;
            if (!TextUtils.equals(string, v6Var.d) || z23 != v6Var.e) {
                v6Var.removeView(v6Var.f5658c);
                Context context = v6Var.getContext();
                v6Var.d = string;
                v6Var.e = z23;
                u6 u6Var = new u6(v6Var, context, string, z23);
                v6Var.f5658c = u6Var;
                u6Var.setContentDescription(string);
                v6Var.addView(v6Var.f5658c, w7.x5.c(-2.0f, -2));
                v6Var.e();
            }
            this.f5266t1.setVisibility(8);
            this.f5269u1.setVisibility(8);
            if (!this.f5230h2) {
                o8 o8Var23 = this.K1;
                if (o8Var23 != null && o8Var23.f5183u) {
                    this.X0.l(o8Var23);
                } else {
                    this.X0.set(o8Var23);
                }
            }
            this.f5230h2 = false;
            bu editText = this.f5213c1.f4995f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                kaVar = null;
            } else {
                kaVar = new ka(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(kaVar);
            if (this.H1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f5216d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                fb fbVar = this.f5216d1;
                fbVar.c(false, false);
                fbVar.f5612c = arrayList;
                fbVar.d = arrayList2;
                fbVar.e = arrayList3;
                fbVar.f5617w = new h01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                fbVar.K = new h01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                fbVar.f5611b.Y2.N(false);
                this.f5216d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((o8Var8 = this.K1) == null || (!o8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                o8 o8Var24 = this.K1;
                if (o8Var24 != null && (o8Var24.f5148c || o8Var24.f5157g || this.f5268u0)) {
                    if (o8Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    o8 o8Var25 = this.K1;
                    if (o8Var25.K && o8Var25.f5144a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new ta(this, 7));
                    }
                    this.f5213c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    ec ecVar2 = this.f5213c1;
                    ecVar2.V = true;
                    ecVar2.f4995f.setText("");
                }
            }
            o8 o8Var26 = this.K1;
            if (o8Var26 != null && ((o8Var26.f5183u && !o8Var26.K) || o8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f5209b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (o8Var7 = this.K1) != null && !o8Var7.f5183u && !o8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f5209b1.d(3, z19);
            if (!this.N1 && !this.f5213c1.o()) {
                ai.l9 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                ai.f9 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.f1193a, B) || ((o8Var6 = this.K1) != null && (o8Var6.f5157g || o8Var6.J0 != j3))) {
                    z20 = true;
                    this.f5209b1.setShareEnabled(z20);
                    o8Var4 = this.K1;
                    if (o8Var4 == null && o8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f5226g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f5251p0.setVisibility(0);
                    this.f5251p0.setTranslationX(0.0f);
                    o8Var5 = this.K1;
                    if (o8Var5 == null && o8Var5.J0 != j3) {
                        this.f5251p0.l("", false);
                    } else if (o8Var5 == null && o8Var5.f5157g) {
                        this.f5251p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (o8Var5 == null && o8Var5.f5183u) {
                        this.f5251p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (o8Var5 == null && o8Var5.f5169n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f5251p0, 32.0f, i18);
                        this.f5251p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.K1.f5175q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f5175q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f5175q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f5251p0.l(spannableStringBuilder, false);
                    } else {
                        this.f5251p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f5209b1.setShareEnabled(z20);
            o8Var4 = this.K1;
            if (o8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f5226g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f5251p0.setVisibility(0);
            this.f5251p0.setTranslationX(0.0f);
            o8Var5 = this.K1;
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            this.f5251p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            ec ecVar3 = this.f5213c1;
            n70 n70Var = ecVar3.V0;
            if (n70Var != null) {
                n70Var.u();
                ecVar3.V0 = null;
            }
            this.f5238k1.e(z21);
            fb fbVar2 = this.f5216d1;
            if (fbVar2.M) {
                fbVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (o8Var3 = this.K1) != null) {
            if (o8Var3.f5153e0 < j3) {
                o8Var3.f5153e0 = j3;
            }
            this.M1 = o8Var3.f5153e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f5159h0;
            } else {
                duration = this.X0.getDuration();
            }
            o8 o8Var27 = this.K1;
            if (o8Var27.f5159h0 <= 0) {
                o8Var27.f5159h0 = duration;
            }
            File file = o8Var27.Z0;
            if (file == null) {
                file = o8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            o8 o8Var28 = this.K1;
            this.f5266t1.o(false, absolutePath, o8Var28.f5159h0, o8Var28.P);
            o8 o8Var29 = this.K1;
            float f10 = (float) duration;
            long j10 = o8Var29.Z * f10;
            long j11 = o8Var29.f5143a0 * f10;
            zc zcVar2 = this.f5266t1;
            zcVar2.Z0 = j10;
            zcVar2.f5885a1 = j11;
            tc tcVar = zcVar2.h;
            if (tcVar != null) {
                tc.a(tcVar, true);
            }
            bi.v vVar = new bi.v(this, 8);
            this.f5266t1.setDelegate(new ob(vVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f5266t1.setVideoLeft(max);
            this.f5266t1.setVideoRight(0.04f + max);
            vVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.setAllowTouch(false);
        }
        f4 f4Var2 = this.f5242m1;
        boolean z24 = true;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        org.telegram.ui.Components.oc.e();
        ec ecVar4 = this.f5213c1;
        if (ecVar4 != null) {
            g gVar = ecVar4.f4995f;
            gVar.d();
            gVar.k(true);
            this.f5213c1.f4994e0 = true;
        }
        cc ccVar = this.X0;
        if (ccVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            ccVar.x(8, z15);
        }
        qb qbVar = this.f5272v1;
        if (qbVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            qbVar.setCoverPreview(z14);
        }
        f4 f4Var3 = this.f5246n1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        bc bcVar2 = this.A0;
        bcVar2.setPreview((i11 == 1 && bcVar2.j()) ? false : false);
    }

    public final void P() {
        pg.a1 a1Var;
        int i10;
        if (this.f5222f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f5281x2 = new ka(this, 3);
            } else {
                Z(false);
            }
        }
        ec ecVar = this.f5213c1;
        if (ecVar != null) {
            ecVar.f4995f.s();
        }
        l7 l7Var = this.O0;
        if (l7Var != null) {
            l7Var.h();
        }
        w6 w6Var = this.f5249o1;
        if (w6Var != null) {
            ai.l9 storiesController = MessagesController.getInstance(w6Var.f5697a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f1198i.f(UserConfig.getInstance(storiesController.f1193a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            w6Var.f5698b = storiesController.f1194b.m() + i10 + 1;
            w6Var.f5699c.invalidate();
        }
        qb qbVar = this.f5272v1;
        if (qbVar != null && (a1Var = qbVar.O0.d) != null) {
            a1Var.postRunnable(a1Var.f40841w);
        }
        cc ccVar = this.X0;
        if (ccVar != null) {
            ccVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.f5211c).getStoriesController().f1211w;
        if (!b1Var.f4383c && !b1Var.d) {
            b1Var.d = true;
            x0 x0Var = new x0(b1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.f4381a);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, false, (Object) x0Var, 0));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z10;
        qb qbVar;
        yb ybVar;
        zb zbVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        qb qbVar2;
        if (i11 == 0) {
            this.f5245n0.setVisibility(8);
        }
        if (i10 == 0 && (qbVar2 = this.f5272v1) != null) {
            qbVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f5213c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f5226g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f5235j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f5219e1.setVisibility(i14);
            ImageView imageView = this.f5232i1;
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
            this.f5251p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (qbVar = this.f5272v1) != null) {
            qbVar.f5414d1.setLayerType(0, null);
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            hf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            yb ybVar2 = this.f5259r1;
            if (ybVar2 != null) {
                ybVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (ybVar = this.f5259r1) != null) {
            ybVar.setVisibility(8);
            this.f5259r1.setAppearProgress(0.0f);
            yb ybVar3 = this.f5259r1;
            ybVar3.f4833x = null;
            g0 g0Var = ybVar3.f4828f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            ybVar3.d.setVisibility(8);
            ybVar3.f4825a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            zb zbVar2 = this.f5263s1;
            if (zbVar2 != null) {
                zbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (zbVar = this.f5263s1) != null) {
            zbVar.setVisibility(8);
            this.f5263s1.setAppearProgress(0.0f);
            zb zbVar3 = this.f5263s1;
            zbVar3.f5023b = null;
            g0 g0Var2 = zbVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            zbVar3.e.setVisibility(8);
            zbVar3.setVisibility(8);
        }
    }

    public final void R(ic icVar) {
        ai.f9 o9;
        nc ncVar;
        if (this.d) {
            return;
        }
        int i10 = this.f5211c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f5268u0 = false;
        this.e = false;
        this.B2 = false;
        this.f5262s0.f4434g = false;
        WindowManager windowManager = this.f5221f;
        if (windowManager != null && (ncVar = this.f5244n) != null && ncVar.getParent() == null) {
            nc ncVar2 = this.f5244n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ncVar2, layoutParams);
            windowManager.addView(this.f5244n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.f5271v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (icVar != null) {
            this.F = icVar;
            this.J = icVar.f4860a;
            rectF.set(icVar.f4862c);
            this.G = icVar.f4861b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5257r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f5228h0.setBackgroundColor(i11);
        this.f5257r.setTranslationX(0.0f);
        this.f5257r.setTranslationY(0.0f);
        this.f5257r.b(0.0f);
        this.f5257r.setScaleX(1.0f);
        this.f5257r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5207b, 1);
        g(1.0f, true, new ka(this, 6));
        e();
        this.f5271v0 = 0L;
        this.f5275w0 = "";
    }

    public final void S(hc hcVar, o8 o8Var, long j3) {
        int i10;
        nc ncVar;
        if (this.d) {
            return;
        }
        int i11 = this.f5211c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f5268u0 = false;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5221f;
        if (windowManager != null && (ncVar = this.f5244n) != null && ncVar.getParent() == null) {
            nc ncVar2 = this.f5244n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ncVar2, layoutParams);
            windowManager.addView(this.f5244n, layoutParams);
            g0();
        }
        this.K1 = o8Var;
        this.O1 = o8Var.K ? 1 : 0;
        this.f5262s0.f4434g = false;
        RectF rectF = this.H;
        if (hcVar != null) {
            this.F = hcVar;
            this.J = hcVar.f4860a;
            rectF.set(hcVar.f4862c);
            this.G = hcVar.f4861b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5257r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f5228h0.setBackgroundColor(i10);
        this.f5257r.setTranslationX(0.0f);
        this.f5257r.setTranslationY(0.0f);
        this.f5257r.b(0.0f);
        this.f5257r.setScaleX(1.0f);
        this.f5257r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5207b, 1);
        o8 o8Var2 = this.K1;
        if (o8Var2 != null) {
            this.f5213c1.setText(o8Var2.C0);
        }
        L(new db(this, 0), j3);
        if (this.K1.f5146b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.f5209b1.b(false, false);
        e();
        this.f5271v0 = 0L;
        this.f5275w0 = "";
    }

    public final void T() {
        n70 n70Var;
        cc ccVar = this.X0;
        if (ccVar != null) {
            ccVar.x(4, true);
        }
        ec ecVar = this.f5213c1;
        if (ecVar != null && (n70Var = ecVar.V0) != null) {
            n70Var.u();
            ecVar.V0 = null;
        }
        rg.x0 x0Var = new rg.x0((org.telegram.ui.ActionBar.o2) new sb(this, 1), 14, false);
        x0Var.setOnDismissListener(new za(this, 1));
        x0Var.show();
    }

    public final void U(hc hcVar, o8 o8Var) {
        int i10;
        boolean z10;
        int i11;
        ai.f9 o9;
        nc ncVar;
        if (this.d) {
            return;
        }
        int i12 = this.f5211c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f5268u0 = true;
        this.e = false;
        this.B2 = false;
        WindowManager windowManager = this.f5221f;
        if (windowManager != null && (ncVar = this.f5244n) != null && ncVar.getParent() == null) {
            nc ncVar2 = this.f5244n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ncVar2, layoutParams);
            windowManager.addView(this.f5244n, layoutParams);
            g0();
        }
        this.K1 = o8Var;
        ja.a(i12, o8Var);
        o8 o8Var2 = this.K1;
        if (o8Var2 != null && o8Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.O1 = i10;
        if (o8Var2 != null && o8Var2.f5183u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5262s0.f4434g = z10;
        if (this.f5271v0 == 0 && (o9 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o9.a(i12, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (hcVar != null) {
            this.F = hcVar;
            this.J = hcVar.f4860a;
            rectF.set(hcVar.f4862c);
            this.G = hcVar.f4861b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f5257r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f5228h0.setBackgroundColor(i11);
        this.f5257r.setTranslationX(0.0f);
        this.f5257r.setTranslationY(0.0f);
        this.f5257r.b(0.0f);
        this.f5257r.setScaleX(1.0f);
        this.f5257r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f5207b, 1);
        o8 o8Var3 = this.K1;
        if (o8Var3 != null) {
            this.f5213c1.setText(o8Var3.C0);
        }
        this.f5209b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ka(this, 6));
        e();
        this.f5271v0 = 0L;
        this.f5275w0 = "";
    }

    public final void V() {
        pg.c1 c1Var = this.f5276w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f5280x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f5284y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f5287z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        cd cdVar = this.f5252p1;
        if (cdVar != null) {
            cdVar.bringToFront();
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.bringToFront();
        }
        ye0 ye0Var = this.E1;
        if (ye0Var != null) {
            ye0Var.bringToFront();
        }
        af0 af0Var = this.F1;
        if (af0Var != null) {
            af0Var.bringToFront();
        }
        w6 w6Var = this.f5249o1;
        if (w6Var != null) {
            w6Var.bringToFront();
        }
        p pVar = this.f5255q1;
        if (pVar != null) {
            pVar.bringToFront();
        }
    }

    public final void W(o8 o8Var, boolean z10) {
        File file;
        View view;
        float f7;
        o8 o8Var2;
        boolean z11;
        int i10;
        if (o8Var != null && this.X0.getWidth() > 0 && this.X0.getHeight() > 0) {
            if (z10) {
                file = o8Var.O0;
            } else {
                file = o8Var.N0;
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
            v61 textureView = this.X0.getTextureView();
            if (o8Var.K && !o8Var.f5183u && textureView != null) {
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
            File file2 = o8Var.Q0;
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
            File file3 = o8Var.P0;
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
            qb qbVar = this.f5272v1;
            if (qbVar != null && qbVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                qb qbVar2 = this.f5272v1;
                qbVar2.I0 = true;
                k6 k6Var = qbVar2.R0;
                k6Var.f41351a = true;
                k6Var.draw(canvas);
                qb qbVar3 = this.f5272v1;
                qbVar3.R0.f41351a = false;
                qbVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = o8.w(this.f5211c, "jpg");
            if (z10) {
                o8Var2 = o8Var;
                z11 = z10;
                Utilities.searchQueue.postRunnable(new u1(this, createBitmap, z11, w10, o8Var2, 1));
            } else {
                o8Var2 = o8Var;
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
                o8Var2.N0 = w10;
            }
            o8Var2.f5147b1 = createScaledBitmap;
        }
    }

    public final void X() {
        ai.f9 o9;
        int size;
        char c10;
        View[] viewPages;
        q51[] q51VarArr;
        ia iaVar = this.f5254q0;
        BitmapDrawable bitmapDrawable = null;
        if (iaVar != null) {
            iaVar.dismiss();
            this.f5254q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f5219e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            u6 u6Var = this.f5209b1.f5658c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(u6Var, i10);
            return;
        }
        ec ecVar = this.f5213c1;
        if (ecVar != null && ecVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.n6 n6Var = ecVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(n6Var, i11);
            ecVar.e();
            return;
        }
        o8 o8Var = this.K1;
        int i12 = this.f5211c;
        if ((o8Var == null || (!o8Var.f5157g && o8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        ai.d dVar = this.f5204a;
        if (ecVar != null && !this.K1.D0) {
            CharSequence text = ecVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((q01[]) spannable.getSpans(0, text.length(), q01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.vc(this.f5244n, dVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new ka(this, 27), dVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(ecVar, i13);
                    return;
                }
            }
        }
        o8 o8Var2 = this.K1;
        if (!o8Var2.f5157g && o8Var2.J0 == 0) {
            if (this.N != 0) {
                o8Var2.f5185v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            cc ccVar = this.X0;
            ccVar.x(3, true);
            ia iaVar2 = new ia(this.f5207b, this.K1.I0, dVar);
            iaVar2.q1(this.K1.E0);
            iaVar2.p1(this.K1.f5185v0);
            iaVar2.F = this.M;
            iaVar2.U = new la(this, 14);
            iaVar2.e1(!this.A0.j());
            ArrayList arrayList = this.I1;
            if (arrayList == null) {
                size = this.K1.r();
            } else {
                size = arrayList.size();
            }
            iaVar2.m1(size);
            iaVar2.k1(false);
            CharSequence text2 = ecVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (q51 q51Var : (q51[]) ((Spanned) text2).getSpans(0, text2.length(), q51.class)) {
                    if (q51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(q51Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f18268id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f18268id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c10 = 1;
            }
            iaVar2.S = arrayList2;
            iaVar2.W = new la(this, 15);
            iaVar2.X = new la(this, 16);
            iaVar2.T = new ta(this, 10);
            this.f5254q0 = iaVar2;
            o8 o8Var3 = this.K1;
            if (o8Var3.K) {
                if (ccVar != null && !o8Var3.f5156f0 && this.f5222f0 != 2) {
                    o8Var3.f5153e0 = ccVar.getCurrentPosition();
                    Utilities.Callback laVar = new la(this, 17);
                    View view = this.f5276w1;
                    View view2 = this.f5287z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = ccVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    ccVar.h(laVar, viewArr);
                }
                ia iaVar3 = this.f5254q0;
                Bitmap bitmap = this.K1.f5158g0;
                ka kaVar = new ka(this, 20);
                if (bitmap != null) {
                    iaVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                iaVar3.f4807b0 = bitmapDrawable;
                iaVar3.f4809c0 = kaVar;
                i1 i1Var = iaVar3.f4806b;
                if (i1Var != null) {
                    for (View view3 : i1Var.getViewPages()) {
                        if (view3 instanceof ba) {
                            ba baVar = (ba) view3;
                            baVar.g(false);
                            baVar.e(false);
                        }
                    }
                }
            }
            this.f5254q0.setOnDismissListener(new za(this, 0));
            this.f5254q0.show();
            return;
        }
        o8Var2.f5166l = false;
        i(null);
        p0();
    }

    public final void Y(jc jcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (jcVar != null) {
            this.F = jcVar;
            this.J = jcVar.f4860a;
            rectF.set(jcVar.f4862c);
            this.G = jcVar.f4861b;
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
        this.f5228h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f5277w2 || z10) {
            this.f5264s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f5207b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f5264s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    pq pqVar = new pq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    pqVar.e = dp;
                    pqVar.f27112f = dp2;
                    this.A0.setCameraThumb(pqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f5204a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.f18447a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ta(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f18447a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f5277w2 = true;
                }
            }
            if (!this.f5264s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new ka(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        rb rbVar = this.B0;
        if (rbVar != null && rbVar.getTextureView() != null) {
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
            animate.alpha(f7).setUpdateListener(new pb(this, 1)).setListener(new androidx.fragment.app.g(this, z10, view, 1)).setDuration(320L).setInterpolator(qr.h).start();
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
            this.f5221f.updateViewLayout(this.f5244n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ai.f9 o9;
        o8 o8Var;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            l7 l7Var = this.O0;
            if (l7Var != null) {
                l7Var.h();
            }
            if (this.f5243m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f5243m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f5243m2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            l7 l7Var2 = this.O0;
            if (l7Var2 != null && !this.V1) {
                l7Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f5222f0;
            int i15 = this.f5211c;
            if (i14 == 1) {
                if (!this.N1 && !this.f5213c1.o()) {
                    ai.l9 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    ai.f9 o10 = storiesController.o();
                    if (o10 == null || !o10.a(storiesController.f1193a, B) || ((o8Var = this.K1) != null && (o8Var.f5157g || o8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f5209b1.setShareEnabled(z10);
            } else if (i14 == 0 && (o9 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o9.a(i15, 1)) {
                o8 o8Var2 = this.K1;
                if (o8Var2 == null || o8Var2.J0 == 0) {
                    h0(o9, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f5211c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        rb rbVar = this.B0;
        if ((rbVar != null && rbVar.isDual()) || this.a2) {
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
        ad adVar = this.E0;
        if (adVar.f4374n != i10) {
            adVar.f4374n = i10;
            ValueAnimator valueAnimator = adVar.f4375r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                adVar.f4375r = null;
            }
            adVar.setDrawable(i10);
        }
        if (this.f5222f0 == 0 && !this.I0.e && this.Y1 != null && !I()) {
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
        Boolean bool = this.f5253p2;
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
                this.f5256q2 = new ua(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f5247n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5247n2 = null;
            }
            o1.k kVar = this.f5250o2;
            if (kVar != null) {
                kVar.c();
                this.f5250o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            nb nbVar = this.M0;
            if (nbVar != null) {
                nbVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            gc gcVar = this.f5257r;
            if (gcVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                gcVar.setImportantForAccessibility(i10);
            }
            nb nbVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            nbVar2.setImportantForAccessibility(i11);
            this.f5253p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            nc ncVar = this.f5244n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (ncVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, ncVar.getHeight());
            nb nbVar3 = this.M0;
            nbVar3.K = !z10;
            if (this.f5236j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5239k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(nbVar3, o1.h.f15344n, height);
                this.f5250o2 = kVar2;
                kVar2.f15361u.a(0.75f);
                this.f5250o2.f15361u.b(350.0f);
                this.f5250o2.a(new va(this, height, 0));
                this.f5250o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f5247n2 = ofFloat;
                ofFloat.addUpdateListener(new wa(this, 0));
                this.f5247n2.addListener(new mb(this, 1));
                this.f5247n2.setDuration(450L);
                this.f5247n2.setInterpolator(qr.h);
                this.f5247n2.start();
            }
            if (!z10 && !this.S1) {
                this.f5241l2 = null;
            }
            if (!z10 && this.f5222f0 == 0 && !this.f5264s2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f5223f1 == null) {
            yi0 yi0Var = new yi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f5223f1 = yi0Var;
            yi0Var.F *= 1.5f;
        }
        this.f5226g1.setAnimation(this.f5223f1);
        int i10 = 20;
        if (!z11) {
            yi0 yi0Var2 = this.f5223f1;
            if (!z10) {
                i10 = 0;
            }
            yi0Var2.N(i10, false, false);
        } else if (z10) {
            yi0 yi0Var3 = this.f5223f1;
            if (yi0Var3.f30222a0 > 20) {
                yi0Var3.N(0, false, false);
            }
            this.f5223f1.P(20);
            this.f5223f1.start();
        } else {
            yi0 yi0Var4 = this.f5223f1;
            int i11 = yi0Var4.f30222a0;
            if (i11 != 0 && i11 < 43) {
                yi0Var4.P(43);
                this.f5223f1.start();
            }
        }
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        gc gcVar = this.f5257r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new wa(this, 5));
            this.E.addListener(new ai.t2(this, f7, runnable, 2));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(qr.h);
            } else if (f7 <= 0.0f && gcVar.f4730a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(qr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(qr.h);
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
        gcVar.invalidate();
        this.f5244n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f5244n.findOnBackInvokedDispatcher()) == null) {
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
            f4 f4Var = this.l1;
            if (f4Var != null) {
                f4Var.e(true);
            }
            f4 f4Var2 = this.f5242m1;
            if (f4Var2 != null) {
                f4Var2.e(true);
            }
            f4 f4Var3 = this.f5238k1;
            if (f4Var3 != null) {
                f4Var3.e(true);
            }
            f4 f4Var4 = this.W0;
            if (f4Var4 != null) {
                f4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f5210b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f5210b2 = I();
        if (z10 && (yVar = this.I0) != null && yVar.e) {
            yVar.a(false, z11);
        }
        m0(z11);
        gb gbVar = this.Q0;
        c4 c4Var = this.U0;
        c4 c4Var2 = this.T0;
        float f11 = 0.6f;
        float f12 = 1.0f;
        float f13 = 0.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Z1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10 && this.f5222f0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f5222f0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c4Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c4Var, property, (!z10 && this.f5222f0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f5222f0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c4Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gbVar, property, (z10 || this.f5222f0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f5222f0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(gbVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(qr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f5222f0 == 0 && !I()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        c4Var2.setAlpha(f7);
        if (z10 && this.f5222f0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        c4Var2.setTranslationY(dp);
        c4Var.setAlpha((!z10 && this.f5222f0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f5222f0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        c4Var.setTranslationY(dp2);
        gbVar.setAlpha((z10 || this.f5222f0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f5222f0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        gbVar.setTranslationY(f13);
    }

    public final void h0(ai.f9 f9Var, boolean z10) {
        if (this.f5288z2) {
            return;
        }
        rg.j0 j0Var = new rg.j0(f9Var.b(), this.f5211c, this.f5207b, new sb(this, 0), null);
        j0Var.X = B();
        j0Var.setOnDismissListener(new b80(2, this, z10));
        this.X0.x(7, true);
        this.f5288z2 = true;
        j0Var.show();
    }

    public final void i(Runnable runnable) {
        o8 o8Var;
        Runnable runnable2;
        cc ccVar;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        jf0 jf0Var = this.B1;
        if (jf0Var != null && (o8Var = this.K1) != null) {
            o8Var.f5162j = jf0Var.d() | o8Var.f5162j;
            o8 o8Var2 = this.K1;
            jf0 jf0Var2 = this.B1;
            File file = o8Var2.Z0;
            if (file != null) {
                file.delete();
                o8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = jf0Var2.getSavedFilterState();
            o8Var2.f5144a1 = savedFilterState;
            if (!o8Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = jf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = o8Var2.R;
                        float f10 = 1.0f;
                        if (i10 == 1) {
                            f7 = -1.0f;
                        } else {
                            f7 = 1.0f;
                        }
                        if (i10 == 2) {
                            f10 = -1.0f;
                        }
                        matrix.postScale(f7, f10, o8Var2.f5165k0 / 2.0f, o8Var2.f5167l0 / 2.0f);
                        matrix.postRotate(-o8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        o8Var2.f5170n0.preScale(o8Var2.f5165k0 / createBitmap.getWidth(), o8Var2.f5167l0 / createBitmap.getHeight());
                        o8Var2.f5165k0 = createBitmap.getWidth();
                        o8Var2.f5167l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = o8Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            o8Var2.Z0.delete();
                        }
                        String k10 = o8.k(o8Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = o8Var2.f5142a;
                        if (!z10) {
                            str = "jpg";
                        }
                        o8Var2.Z0 = o8.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(o8Var2.Z0);
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
                            Utilities.themeQueue.postRunnable(new ai.s4(o8Var2, createBitmap, z10, runnable2, 2));
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
                o8 o8Var3 = this.K1;
                if (!o8Var3.K && (ccVar = this.X0) != null) {
                    ccVar.set(o8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f5217d2 != z10) {
            this.f5217d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(qr.h).withEndAction(new ua(this, z10, 1)).start();
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
        if (this.K1 != null && this.D1 != null && this.f5228h0.getMeasuredWidth() > 0 && this.f5228h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f5228h0.getMeasuredWidth() / 2.0f, this.f5228h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f5228h0.getMeasuredWidth() / this.f5228h0.getMeasuredHeight(), this.f5228h0.getMeasuredHeight() / this.f5228h0.getMeasuredWidth(), this.f5228h0.getMeasuredWidth() / 2.0f, this.f5228h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f5228h0.getMeasuredWidth()) * this.K1.f5165k0, (1.0f / this.f5228h0.getMeasuredHeight()) * this.K1.f5167l0);
            matrix.postConcat(this.K1.f5170n0);
            matrix.postScale(this.f5228h0.getMeasuredWidth() / this.K1.f5161i0, this.f5228h0.getMeasuredHeight() / this.K1.f5163j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f7;
        f91 f91Var = this.V0;
        if ((f91Var.getTag() != null && z10) || (f91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f5220e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ka kaVar = new ka(this, 25);
                this.f5220e2 = kaVar;
                AndroidUtilities.runOnUIThread(kaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f5224f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        f91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5224f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            f91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f5224f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(f91Var, property, f7));
        this.f5224f2.addListener(new ai.n(13, this, z10));
        this.f5224f2.start();
        if (z10) {
            ka kaVar2 = new ka(this, 26);
            this.f5220e2 = kaVar2;
            AndroidUtilities.runOnUIThread(kaVar2, 2000L);
        }
    }

    public final void k() {
        ai.a5 a5Var;
        if (this.J == 1) {
            RectF rectF = this.f5215d0;
            rectF.set(this.f5228h0.getLeft(), this.f5228h0.getTop(), this.f5228h0.getMeasuredWidth(), this.f5228h0.getMeasuredHeight());
            rectF.offset(this.f5257r.getX(), this.f5257r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f5212c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f5228h0.setAlpha(this.I);
            float f10 = rectF3.left;
            ac acVar = this.f5228h0;
            acVar.setTranslationX((f10 - acVar.getLeft()) - this.f5257r.getX());
            float f11 = rectF3.top;
            ac acVar2 = this.f5228h0;
            acVar2.setTranslationY((f11 - acVar2.getTop()) - this.f5257r.getY());
            jc jcVar = this.F;
            if (jcVar != null && (a5Var = jcVar.f4863f) != null) {
                a5Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f4863f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f5228h0.setScaleX(rectF3.width() / this.f5228h0.getMeasuredWidth());
            this.f5228h0.setScaleY(rectF3.height() / this.f5228h0.getMeasuredHeight());
            this.f5231i0.setAlpha(this.I);
            this.f5237k0.setAlpha(this.I);
            this.f5240l0.setAlpha(this.I);
            if (this.f5222f0 == 2) {
                this.f5269u1.setAlpha(this.I);
            }
        }
    }

    public final void k0() {
        ia iaVar = this.f5254q0;
        if (iaVar != null) {
            iaVar.dismiss();
            this.f5254q0 = null;
        }
        ia iaVar2 = new ia(this.f5207b, 86400, this.f5204a);
        iaVar2.o1();
        iaVar2.q1(this.f5283y0);
        TLRPC.InputPeer inputPeer = this.f5279x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f5211c).getInputPeer(this.N);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        iaVar2.p1(inputPeer);
        iaVar2.F = this.M;
        iaVar2.U = new la(this, 18);
        iaVar2.e1(false);
        iaVar2.m1(1);
        iaVar2.k1(false);
        iaVar2.W = new la(this, 19);
        iaVar2.T = new ta(this, 12);
        this.f5254q0 = iaVar2;
        iaVar2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: ci.oc.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ci.oc.l0(int, boolean, boolean):void");
    }

    public final void m() {
        o8 o8Var;
        boolean z10;
        if (this.f5272v1 != null && (o8Var = this.K1) != null && o8Var.f5183u) {
            File file = o8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = o8.w(this.f5211c, "webp");
            qb qbVar = this.f5272v1;
            o8 o8Var2 = this.K1;
            ArrayList arrayList = o8Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = qbVar.t0(arrayList, false, false, true, z10, o8Var2);
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
        rb rbVar;
        boolean z17 = false;
        if (this.f5222f0 == 0 && this.O1 == 1 && !this.I0.e && !I()) {
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
        c0(this.f5245n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f5222f0 == 0 && this.Y1 != null && !this.I0.e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f5222f0 == 0 && (rbVar = this.B0) != null && rbVar.f4478a && !this.I0.e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f5222f0 == 0 && !this.I0.e) {
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
        f4 f4Var = this.f5246n1;
        if (z18) {
            f4Var.u();
        } else {
            f4Var.e(true);
        }
        h(this.a2, z10);
        if (this.O1 == -1 && this.f5222f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f5222f0 == 0) {
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
        this.f5245n0.setTranslationX(0.0f);
        float alpha5 = this.f5245n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f5799a;
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
        mb0 mb0Var = this.f5282y;
        if (mb0Var != null) {
            mb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        yi0 yi0Var = this.f5229h1;
        if (yi0Var != null) {
            int[] iArr = yi0Var.e;
            int i11 = 0;
            if (z10) {
                o8 o8Var = this.K1;
                if (o8Var != null && o8Var.f5191y0) {
                    i11 = iArr[0];
                }
                yi0Var.P(i11);
                yi0 yi0Var2 = this.f5229h1;
                if (yi0Var2 != null) {
                    yi0Var2.start();
                    return;
                }
                return;
            }
            o8 o8Var2 = this.K1;
            if (o8Var2 != null && o8Var2.f5191y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            yi0Var.N(i10, false, true);
            this.f5229h1.P(i10);
            ImageView imageView = this.f5232i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f5267t2 < 0) {
            this.f5267t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f5270u2 = arrayList;
            arrayList.add("off");
            this.f5270u2.add("auto");
            this.f5270u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            y2 y2Var = this.f5261s;
            y2Var.f5817o = f7;
            y2Var.f5816n = y2.f(f7);
            y2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            y2 y2Var2 = this.f5261s;
            y2Var2.f5818p = f10;
            y2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ka kaVar = new ka(this, 2);
        qb qbVar = this.f5272v1;
        o8 o8Var = this.K1;
        if (qbVar != null && o8Var != null) {
            o8Var.f();
            boolean u02 = qbVar.u0();
            boolean z10 = qbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new na(this, qbVar, o8Var.f5161i0, o8Var.f5163j0, o8Var, z10, u02, kaVar, 1));
            return;
        }
        kaVar.run();
    }

    public final void q(boolean z10) {
        cc ccVar;
        if (this.d) {
            ia iaVar = this.f5254q0;
            if (iaVar != null) {
                iaVar.dismiss();
                this.f5254q0 = null;
            }
            o8 o8Var = this.K1;
            long j3 = 0;
            if (o8Var != null && !o8Var.h) {
                if ((this.v && o8Var.f5157g) || o8Var.f5145b != 0) {
                    o8Var.f5162j = false;
                }
                o8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (ccVar = this.X0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                h71 h71Var = ccVar.f4536y;
                if (h71Var != null) {
                    h71Var.B();
                    ccVar.f4536y.H();
                    ccVar.f4536y = null;
                }
                h71 h71Var2 = ccVar.f4534x;
                if (h71Var2 != null) {
                    j3 = h71Var2.n();
                    ccVar.f4534x.B();
                    ccVar.f4534x.H();
                    ccVar.f4534x = null;
                }
                h71 h71Var3 = ccVar.e;
                if (h71Var3 != null) {
                    j3 = h71Var3.n();
                    ccVar.e.B();
                    ccVar.e.H();
                    ccVar.e = null;
                }
                callback4.run(Long.valueOf(j3), new ua(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f5274w));
                return;
            }
            cc ccVar2 = this.X0;
            if (ccVar2 != null && !z10) {
                ccVar2.set(null);
            }
            g(0.0f, z10, new ka(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f5244n.setBackgroundColor(0);
                this.f5209b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f5211c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        rb rbVar;
        if ((this.P1 || this.Q1) && (rbVar = this.B0) != null && rbVar.isFrontface()) {
            int i10 = this.f5267t2;
            if (i10 == 2 || (i10 == 1 && this.f5214c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f5207b;
        if (this.B0 == null && activity != null) {
            this.B0 = new rb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            l7 l7Var = this.O0;
            float f7 = 0.0f;
            if (l7Var != null) {
                l7Var.f4950g0 = 0.0f;
                l7Var.f4951h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(A());
            this.B0.initTexture();
            this.B0.setDelegate(new ta(this, 0));
            bd bdVar = this.F0;
            if (this.B0.f4478a && this.f5222f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(bdVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f4478a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!d1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.B0.f4478a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new h7(activity, new la(this, 3));
            }
            this.C0.a(this.B0);
            w7 w7Var = this.D0;
            if (w7Var != null) {
                bc bcVar = this.A0;
                Object blurRenderNode = bcVar.getBlurRenderNode();
                w7Var.F = bcVar;
                w7Var.G = blurRenderNode;
                w7Var.invalidate();
            }
        }
    }

    public final void s() {
        o8 o8Var;
        Bitmap bitmap;
        Bitmap q6;
        if (this.B1 == null && (o8Var = this.K1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!o8Var.K) {
                if (o8Var.Z0 == null) {
                    q6 = this.X0.getPhotoBitmap();
                } else {
                    ta taVar = new ta(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q6 = o8.q(taVar, point.x, point.y, 0, true);
                }
                bitmap = q6;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.K1.K) {
                v61 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                o8 o8Var2 = this.K1;
                if (o8Var2 != null) {
                    savedFilterState = o8Var2.f5144a1;
                }
                jf0 jf0Var = new jf0(this.f5207b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f5258r0, this.f5204a);
                this.B1 = jf0Var;
                this.f5257r.addView(jf0Var);
                hf0 hf0Var = this.C1;
                if (hf0Var != null) {
                    hf0Var.setFilterView(this.B1);
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
                ye0 blurControl = this.B1.getBlurControl();
                this.E1 = blurControl;
                if (blurControl != null) {
                    this.f5228h0.addView(blurControl);
                }
                af0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f5228h0.addView(curveControl);
                }
                V();
                this.B1.getDoneTextView().setOnClickListener(new ma(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new ma(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f25247i0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            bc bcVar = this.A0;
            if (bcVar != null && bcVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f5207b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f5243m2;
        boolean z13 = !z10;
        bc bcVar2 = this.A0;
        if (bcVar2 != null && bcVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        nb nbVar = new nb(this, this.f5211c, this.f5207b, this.f5204a, albumEntry, z10, z13, z11);
        this.M0 = nbVar;
        nbVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new db(this, 1));
        this.M0.setOnSelectListener(new cb(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new yh.x0(this, 2));
        s4.b0 b0Var = this.f5241l2;
        if (b0Var != null) {
            g3 g3Var = this.M0.e;
            g3Var.B = b0Var;
            g3Var.l0();
        }
        this.f5244n.addView(this.M0, w7.x5.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ci.oc.u():void");
    }

    public final void v(boolean z10) {
        h7 h7Var = this.C0;
        if (h7Var != null) {
            h7Var.f4752f = null;
            Utilities.globalQueue.cancelRunnable(h7Var.h);
            this.C0 = null;
            bc bcVar = this.A0;
            if (bcVar != null) {
                bcVar.f4558c.b(null);
            }
        }
        w7 w7Var = this.D0;
        if (w7Var != null) {
            w7Var.F = null;
            w7Var.G = null;
            w7Var.invalidate();
        }
        if (this.B0 != null) {
            if (z10) {
                b0(new ka(this, 8));
                return;
            }
            b0(new ka(this, 9));
            this.B0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.B0);
            bc bcVar2 = this.A0;
            if (bcVar2 != null) {
                bcVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        nb nbVar = this.M0;
        if (nbVar == null) {
            return;
        }
        this.f5244n.removeView(nbVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f5247n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5247n2 = null;
        }
        o1.k kVar = this.f5250o2;
        if (kVar != null) {
            kVar.c();
            this.f5250o2 = null;
        }
        this.f5253p2 = null;
    }

    public final void y() {
        jf0 jf0Var = this.B1;
        if (jf0Var == null) {
            return;
        }
        jf0Var.e();
        this.C1.setFilterView(null);
        this.f5257r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f5228h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        ye0 ye0Var = this.E1;
        if (ye0Var != null) {
            this.f5228h0.removeView(ye0Var);
            this.E1 = null;
        }
        af0 af0Var = this.F1;
        if (af0Var != null) {
            this.f5228h0.removeView(af0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        qb qbVar = this.f5272v1;
        if (qbVar != null) {
            qbVar.R0.removeAllViews();
            qb qbVar2 = this.f5272v1;
            qbVar2.O0.h();
            qbVar2.R0.setVisibility(8);
            qbVar2.Q0.setVisibility(8);
            qbVar2.E0.postRunnable(new ai.f(7));
            z5 z5Var = qbVar2.f5429k2;
            if (z5Var != null) {
                z5Var.dismiss();
            }
            pg.x xVar = qbVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f5257r.removeView(this.f5272v1);
            this.f5272v1 = null;
            pg.c1 c1Var = this.f5276w1;
            if (c1Var != null) {
                this.f5228h0.removeView(c1Var);
                this.f5276w1 = null;
            }
            View view = this.f5284y1;
            if (view != null) {
                this.f5228h0.removeView(view);
                this.f5284y1 = null;
            }
            View view2 = this.f5280x1;
            if (view2 != null) {
                this.f5228h0.removeView(view2);
                this.f5280x1 = null;
            }
            View view3 = this.f5287z1;
            if (view3 != null) {
                this.f5228h0.removeView(view3);
                this.f5287z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f5228h0.removeView(view4);
                this.A1 = null;
            }
        }
    }
}
