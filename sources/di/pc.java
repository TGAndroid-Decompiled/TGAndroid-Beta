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
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb0;
public final class pc implements NotificationCenter.NotificationCenterDelegate {
    public static pc F2;
    public final cc A0;
    public View A1;
    public boolean A2;
    public sb B0;
    public jf0 B1;
    public boolean B2;
    public h7 C0;
    public final hf0 C1;
    public xb C2;
    public final w7 D0;
    public TextureView D1;
    public float D2;
    public ValueAnimator E;
    public final ad E0;
    public ye0 E1;
    public ValueAnimator E2;
    public kc F;
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
    public ob M0;
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
    public final d91 V0;
    public boolean V1;
    public boolean W;
    public final f4 W0;
    public boolean W1;
    public boolean X;
    public final dc X0;
    public boolean X1;
    public int Y;
    public final FrameLayout Y0;
    public String Y1;
    public int Z;
    public final zc Z0;
    public AnimatorSet Z1;
    public final bi.b f7869a;
    public int f7870a0;
    public final dd f7871a1;
    public boolean a2;
    public final Activity f7872b;
    public int f7873b0;
    public final u6 f7874b1;
    public boolean f7875b2;
    public final int f7876c;
    public final RectF f7877c0;
    public final fc f7878c1;
    public boolean f7879c2;
    public boolean d;
    public final RectF f7880d0;
    public final fb f7881d1;
    public boolean f7882d2;
    public boolean f7883e;
    public final Path f7884e0;
    public final u0 f7885e1;
    public Runnable f7886e2;
    public final WindowManager f7887f;
    public int f7888f0;
    public xi0 f7889f1;
    public AnimatorSet f7890f2;
    public int f7891g0;
    public final aj0 f7892g1;
    public qa f7893g2;
    public final WindowManager.LayoutParams h;
    public final bc f7894h0;
    public xi0 f7895h1;
    public boolean f7896h2;
    public final FrameLayout f7897i0;
    public ImageView f7898i1;
    public AnimatorSet f7899i2;
    public final LinearLayout f7900j0;
    public final r6 f7901j1;
    public ValueAnimator f7902j2;
    public final FrameLayout f7903k0;
    public final f4 f7904k1;
    public boolean f7905k2;
    public final ah.y f7906l0;
    public final f4 l1;
    public s4.b0 f7907l2;
    public final FrameLayout m0;
    public final f4 f7908m1;
    public MediaController.AlbumEntry f7909m2;
    public final oc f7910n;
    public final w2 f7911n0;
    public final f4 f7912n1;
    public ValueAnimator f7913n2;
    public final h8 f7914o0;
    public final v6 f7915o1;
    public o1.k f7916o2;
    public final org.telegram.ui.ActionBar.j5 f7917p0;
    public final cd f7918p1;
    public Boolean f7919p2;
    public ia f7920q0;
    public p f7921q1;
    public ua f7922q2;
    public final hc f7923r;
    public final org.telegram.ui.Components.ja f7924r0;
    public zb f7925r1;
    public AnimatorSet f7926r2;
    public final y2 f7927s;
    public final c7 f7928s0;
    public ac f7929s1;
    public boolean f7930s2;
    public final eb f7931t0;
    public final zc f7932t1;
    public int f7933t2;
    public boolean f7934u0;
    public final d f7935u1;
    public ArrayList f7936u2;
    public boolean v;
    public long f7937v0;
    public rb f7938v1;
    public FrameLayout f7939v2;
    public long f7940w;
    public String f7941w0;
    public qg.c1 f7942w1;
    public boolean f7943w2;
    public gc f7944x;
    public TLRPC.InputPeer f7945x0;
    public View f7946x1;
    public ka f7947x2;
    public final kb0 f7948y;
    public ga f7949y0;
    public View f7950y1;
    public ah.g f7951y2;
    public t f7952z0;
    public View f7953z1;
    public boolean f7954z2;

    public pc(Activity activity, int i10) {
        kb0 kb0Var;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        boolean z10;
        float f10;
        bi.b bVar = new bi.b();
        this.f7869a = bVar;
        this.f7940w = 0L;
        this.H = new RectF();
        this.M = true;
        this.P = new AnimationNotificationsLocker();
        this.f7877c0 = new RectF();
        this.f7880d0 = new RectF();
        this.f7884e0 = new Path();
        new Rect();
        this.f7888f0 = 0;
        this.f7891g0 = -1;
        this.f7949y0 = new ga();
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
        this.f7882d2 = true;
        this.f7905k2 = true;
        this.f7933t2 = -1;
        this.f7872b = activity;
        this.f7876c = i10;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            kb0Var = new kb0(launchActivity, true);
        } else {
            kb0Var = null;
        }
        this.f7948y = kb0Var;
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
        this.f7887f = windowManager;
        oc ocVar = new oc(this, activity);
        this.f7910n = ocVar;
        ta taVar = new ta(this, 1);
        WeakHashMap weakHashMap = r0.i0.f44725a;
        r0.a0.j(ocVar, taVar);
        this.f7910n.setFocusable(true);
        this.f7910n.setImportantForAccessibility(2);
        y2 y2Var = new y2(activity, windowManager, this.f7910n, layoutParams);
        this.f7927s = y2Var;
        y2Var.a(new vb(this));
        this.f7910n.addView(this.f7927s.f8477b, new ViewGroup.LayoutParams(-1, -1));
        oc ocVar2 = this.f7910n;
        hc hcVar = new hc(this, activity);
        this.f7923r = hcVar;
        ocVar2.addView(hcVar);
        hc hcVar2 = this.f7923r;
        bc bcVar = new bc(this, activity);
        this.f7894h0 = bcVar;
        hcVar2.addView(bcVar);
        this.f7923r.addView(this.f7927s.f8478c, new ViewGroup.LayoutParams(-1, -1));
        this.f7924r0 = new org.telegram.ui.Components.ja(this.f7894h0);
        this.f7928s0 = new Object();
        hc hcVar3 = this.f7923r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f7897i0 = frameLayout;
        hcVar3.addView(frameLayout);
        hc hcVar4 = this.f7923r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f7903k0 = frameLayout2;
        hcVar4.addView(frameLayout2);
        hc hcVar5 = this.f7923r;
        ah.y yVar = new ah.y(this, activity, 3);
        this.f7906l0 = yVar;
        hcVar5.addView(yVar);
        this.f7906l0.setVisibility(8);
        this.f7906l0.setAlpha(0.0f);
        hc hcVar6 = this.f7923r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.m0 = frameLayout3;
        hcVar6.addView(frameLayout3);
        org.telegram.ui.Components.qc.a(this.f7910n, new c9(2));
        cc ccVar = new cc(this, activity, this.f7924r0, this.f7923r, bVar);
        this.A0 = ccVar;
        oc ocVar3 = this.f7910n;
        Objects.requireNonNull(ocVar3);
        ccVar.setCancelGestures(new bi.oa(ocVar3, 29));
        this.A0.setResetState(new ka(this, 13));
        this.f7894h0.addView(this.A0, w7.x5.e(-1, -1, 119));
        this.A0.setOnClickListener(new ma(this, 12));
        bc bcVar2 = this.f7894h0;
        int i15 = this.J;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        bcVar2.setBackgroundColor(i11);
        bc bcVar3 = this.f7894h0;
        bi.z1 z1Var = yf.j0.f50141a;
        bcVar3.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(12.0f)));
        this.f7894h0.setClipToOutline(true);
        ka kaVar = new ka(this, 14);
        ?? view = new View(activity);
        view.f26746a = new TextPaint(1);
        view.f26747b = new TextPaint(1);
        pr prVar = pr.h;
        view.f26753s = new org.telegram.ui.Components.e6((View) view, 0L, 350L, prVar);
        view.I = new cc0(view, 7);
        view.f26755x = kaVar;
        this.C1 = view;
        dc dcVar = new dc(this, activity, this.f7924r0, this.f7928s0);
        this.X0 = dcVar;
        dcVar.setCollageView(this.A0);
        dc dcVar2 = this.X0;
        dcVar2.v = new ka(this, 15);
        dcVar2.setOnTapListener(new ka(this, 16));
        this.X0.setVisibility(8);
        dc dcVar3 = this.X0;
        dcVar3.N = new ka(this, 17);
        this.f7894h0.addView(dcVar3, w7.x5.e(-1, -1, 119));
        this.f7894h0.addView(this.C1, w7.x5.e(-1, -1, 119));
        oc ocVar4 = this.f7910n;
        fc fcVar = new fc(this, activity, ocVar4, ocVar4, this.f7923r, bVar, this.f7924r0);
        this.f7878c1 = fcVar;
        fcVar.setAccount(i10);
        this.f7878c1.setUiBlurBitmap(new ta(this, 6));
        org.telegram.ui.Components.qc.a(this.f7906l0, new ah.n0(this, 4));
        this.f7878c1.setOnHeightUpdate(new la(this, 13));
        this.f7878c1.setOnPeriodUpdate(new la(this, 4));
        long j3 = this.N;
        if (j3 != 0) {
            this.f7878c1.setDialogId(j3);
        }
        this.f7878c1.setOnPremiumHint(new la(this, 5));
        this.f7878c1.setOnKeyboardOpen(new la(this, 6));
        eb ebVar = new eb(this, activity, 0);
        this.f7931t0 = ebVar;
        this.f7923r.addView(ebVar);
        zc zcVar = new zc(activity, this.f7923r, this.f7894h0, bVar, this.f7924r0);
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
        this.f7871a1 = ddVar;
        ddVar.setVisibility(8);
        this.f7871a1.a(false);
        this.Y0.addView(this.f7871a1, w7.x5.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f7906l0.addView(this.Y0, w7.x5.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f7906l0.addView(this.f7878c1, w7.x5.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.A0.setTimelineView(this.Z0);
        this.A0.setPreviewView(this.X0);
        zc zcVar2 = new zc(activity, this.f7923r, this.f7894h0, bVar, this.f7924r0);
        this.f7932t1 = zcVar2;
        zcVar2.X0 = true;
        zcVar2.setVisibility(8);
        this.f7932t1.setAlpha(0.0f);
        this.f7906l0.addView(this.f7932t1, w7.x5.d(-1, f11, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        fb fbVar = new fb(this, activity, bVar, this.f7924r0);
        this.f7881d1 = fbVar;
        fbVar.setVisibility(8);
        this.f7906l0.addView(this.f7881d1, w7.x5.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f7911n0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        w2 w2Var = this.f7911n0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        w2Var.setScaleType(scaleType);
        this.f7911n0.setImageResource(R.drawable.msg_photo_back);
        w2 w2Var2 = this.f7911n0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        w2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f7911n0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f7911n0.setOnClickListener(new ma(this, 1));
        this.f7897i0.addView(this.f7911n0, w7.x5.e(56, 56, 51));
        this.f7927s.a(this.f7911n0);
        h8 h8Var = new h8(activity, i10);
        this.f7914o0 = h8Var;
        h8Var.a(false, false);
        this.f7914o0.setOnClickListener(new bi.u1(6, this, activity));
        this.f7897i0.addView(this.f7914o0, w7.x5.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.f7917p0 = j5Var;
        j5Var.setTextSize(20);
        this.f7917p0.setGravity(19);
        this.f7917p0.setTextColor(-1);
        this.f7917p0.setTypeface(AndroidUtilities.bold());
        this.f7917p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.f7917p0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.f7917p0.setAlpha(0.0f);
        this.f7917p0.setVisibility(8);
        this.f7917p0.setEllipsizeByGradient(true);
        this.f7917p0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f7897i0.addView(this.f7917p0, w7.x5.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f7900j0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f7900j0.setGravity(5);
        this.f7897i0.addView(this.f7900j0, w7.x5.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        la laVar = new la(this, 7);
        oc ocVar5 = this.f7910n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f8248w = true;
        imageView2.f8249x = true;
        imageView2.h = laVar;
        imageView2.f8240a = i10;
        imageView2.f8241b = ocVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new ah.h0(imageView2, 10));
        imageView2.f8244f = new sp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f7885e1 = imageView2;
        f4 f4Var = new f4(activity, 1);
        f4Var.l(1.0f, -71.0f);
        f4Var.d = 2000L;
        f4Var.U = false;
        f4Var.H.o(true, false, false);
        this.f7904k1 = f4Var;
        f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7897i0.addView(this.f7904k1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f7892g1 = imageView3;
        imageView3.setScaleType(scaleType);
        aj0 aj0Var = this.f7892g1;
        o8 o8Var = this.K1;
        if (o8Var != null && o8Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        aj0Var.setImageResource(i12);
        this.f7892g1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f7892g1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f7892g1.setOnClickListener(new ma(this, 2));
        this.f7892g1.setVisibility(8);
        this.f7892g1.setAlpha(0.0f);
        r6 r6Var = new r6(activity);
        this.f7901j1 = r6Var;
        r6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f7901j1.setVisibility(8);
        this.f7901j1.setAlpha(0.0f);
        this.f7901j1.setOnClickListener(new ma(this, 3));
        this.f7900j0.addView(this.f7901j1, w7.x5.q(46, 56, 53));
        this.f7900j0.addView(this.f7892g1, w7.x5.q(46, 56, 53));
        this.f7900j0.addView(this.f7885e1, w7.x5.e(46, 56, 53));
        ad adVar = new ad(activity);
        this.E0 = adVar;
        adVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.setOnClickListener(new ma(this, 4));
        this.E0.setOnLongClickListener(new n5(this, 1));
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.f7927s.a(this.E0);
        this.f7897i0.addView(this.E0, w7.x5.e(56, 56, 53));
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
        this.f7927s.a(this.F0);
        this.f7897i0.addView(this.F0, w7.x5.e(56, 56, 53));
        ?? adVar2 = new ad(activity);
        this.G0 = adVar2;
        adVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.G0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.f7952z0 == null) {
            i14 = 6;
            this.f7952z0 = (t) t.a().get(6);
        } else {
            i14 = 6;
        }
        this.G0.setOnClickListener(new ma(this, i14));
        this.G0.a(new u(this.f7952z0, false), false);
        this.G0.setSelected(false);
        this.G0.setVisibility(0);
        this.G0.setAlpha(1.0f);
        this.f7927s.a(this.G0);
        this.f7897i0.addView(this.G0, w7.x5.e(56, 56, 53));
        ad adVar3 = new ad(activity);
        this.H0 = adVar3;
        adVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.H0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.H0.a(new u(new t("../../.."), true), false);
        this.H0.setVisibility(8);
        this.H0.setAlpha(0.0f);
        this.H0.setOnClickListener(new ma(this, 7));
        this.f7927s.a(this.H0);
        this.f7897i0.addView(this.H0, w7.x5.e(56, 56, 53));
        y yVar2 = new y(activity, this.f7927s);
        this.I0 = yVar2;
        yVar2.f8468a.u0(6);
        this.I0.setSelected((t) null);
        this.I0.setOnLayoutClick(new la(this, 8));
        this.f7897i0.addView(this.I0, w7.x5.e(-1, 56, 53));
        f4 f4Var2 = new f4(activity, 1);
        f4Var2.l(1.0f, -20.0f);
        f4Var2.d = 5000L;
        f4Var2.i();
        f4Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        f4Var2.f7238l0 = new ah.j(10);
        this.l1 = f4Var2;
        f4Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7897i0.addView(this.l1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f4 f4Var3 = new f4(activity, 2);
        f4Var3.l(0.0f, 28.0f);
        f4Var3.d = 5000L;
        f4Var3.p(true);
        this.f7908m1 = f4Var3;
        this.f7897i0.addView(f4Var3, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f4 f4Var4 = new f4(activity, 1);
        f4Var4.l(1.0f, -20.0f);
        f4Var4.d = 5000L;
        f4Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f7912n1 = f4Var4;
        f4Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f7897i0.addView(this.f7912n1, w7.x5.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f7212a = paint;
        Paint paint2 = new Paint(1);
        view2.f7213b = paint2;
        view2.f7215e = new org.telegram.ui.Components.e6((View) view2, 0L, 250L, prVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        view2.f7214c = p6Var;
        p6Var.k(0.3f, 250L, prVar);
        p6Var.t(AndroidUtilities.dp(13.0f));
        p6Var.r(-1);
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(view2);
        p6Var.f29312b = 1;
        view2.a(0L, false);
        this.J0 = view2;
        i0(false, false);
        this.f7897i0.addView(this.J0, w7.x5.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f7927s.a(this.J0);
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
        l7Var2.f7580n0 = -1.0f;
        l7Var2.f7581o0 = z10;
        l7Var2.invalidate();
        this.f7903k0.addView(this.O0, w7.x5.e(-1, 100, 87));
        this.f7927s.a(this.O0);
        l7 l7Var3 = this.O0;
        if (this.A0.j()) {
            f10 = this.A0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        l7Var3.e(f10, true);
        d dVar = new d(activity, bVar, true);
        this.P0 = dVar;
        dVar.setRoundRadius(24);
        this.P0.setColor(-2473124);
        this.P0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.P0.setAlpha(0.0f);
        this.P0.setScaleX(0.8f);
        this.P0.setScaleY(0.8f);
        this.P0.setVisibility(8);
        this.f7903k0.addView(this.P0, w7.x5.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.P0.setOnClickListener(new ma(this, 8));
        f4 f4Var5 = new f4(activity, 3);
        f4Var5.p(true);
        f4Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        f4Var5.h = AndroidUtilities.dp(320.0f);
        f4Var5.d = 5000L;
        f4Var5.K = Layout.Alignment.ALIGN_CENTER;
        this.W0 = f4Var5;
        this.f7903k0.addView(f4Var5, w7.x5.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        d91 d91Var = new d91(activity);
        this.V0 = d91Var;
        d91Var.M = false;
        d91Var.setAlpha(0.0f);
        this.f7903k0.addView(this.V0, w7.x5.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.V0.setDelegate(new ta(this, 4));
        d91 d91Var2 = this.V0;
        this.T1 = 0.0f;
        d91Var2.b(0.0f, false);
        w7 w7Var = new w7(activity, i10, new ka(this, 12));
        this.D0 = w7Var;
        w7Var.f8364c = new la(this, 9);
        this.f7903k0.addView(w7Var, w7.x5.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        gb gbVar = new gb(this, activity);
        this.Q0 = gbVar;
        gbVar.setOnSwitchModeListener(new la(this, 10));
        this.Q0.setOnSwitchingModeListener(new la(this, 11));
        this.m0.addView(this.Q0, w7.x5.e(-1, 48, 55));
        this.f7927s.a(this.Q0);
        ?? imageView4 = new ImageView(activity);
        this.R0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.R0.setImageResource(R.drawable.stream_flip);
        this.R0.setScaleType(scaleType);
        this.R0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.R0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.R0, w7.x5.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f7927s.a(this.R0);
        this.R0.setOnClickListener(new ma(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.S0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.S0.setImageResource(R.drawable.stream_settings);
        this.S0.setScaleType(scaleType);
        this.S0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.S0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.m0.addView(this.S0, w7.x5.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f7927s.a(this.S0);
        this.S0.setOnClickListener(new ma(this, 10));
        c4 c4Var = new c4(activity);
        this.T0 = c4Var;
        this.m0.addView(c4Var, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f7927s.a(this.T0);
        c4 c4Var2 = new c4(activity);
        this.U0 = c4Var2;
        c4Var2.f7014a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        c4Var2.invalidate();
        this.U0.setAlpha(0.0f);
        this.m0.addView(this.U0, w7.x5.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f7927s.a(this.U0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f7935u1 = dVar2;
        dVar2.setVisibility(8);
        this.f7935u1.setAlpha(0.0f);
        this.f7935u1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f7935u1.setOnClickListener(new ma(this, 11));
        this.m0.addView(this.f7935u1, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f8276b = new ArrayList();
        frameLayout5.f8278e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f8275a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, w7.x5.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f8278e = true;
        t6 t6Var = new t6(frameLayout5, activity, string, true);
        frameLayout5.f8277c = t6Var;
        t6Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f8277c, w7.x5.c(-2.0f, -2));
        frameLayout5.e();
        this.f7874b1 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.f7874b1.setOnClickListener(new la(this, 12));
        this.m0.addView(this.f7874b1, w7.x5.e(-1, 52, 23));
        cd cdVar = new cd(activity);
        this.f7918p1 = cdVar;
        cdVar.setAlpha(0.0f);
        this.f7918p1.setVisibility(8);
        this.f7894h0.addView(this.f7918p1, w7.x5.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        v6 v6Var = new v6(activity, i10, bVar);
        this.f7915o1 = v6Var;
        this.f7894h0.addView(v6Var, w7.x5.e(-1, -1, 119));
        m0(false);
    }

    public static pc E(Activity activity, int i10) {
        pc pcVar = F2;
        if (pcVar != null && (pcVar.f7872b != activity || pcVar.f7876c != i10)) {
            pcVar.q(false);
            F2 = null;
        }
        if (F2 == null) {
            F2 = new pc(activity, i10);
        }
        return F2;
    }

    public static void a(pc pcVar) {
        sb sbVar = pcVar.B0;
        boolean z10 = false;
        if (sbVar != null && sbVar.getTextureView() != null) {
            Bitmap bitmap = pcVar.B0.getTextureView().getBitmap();
            if (bitmap == null) {
                pcVar.f7879c2 = false;
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
            pcVar.f7879c2 = z10;
            return;
        }
        pcVar.f7879c2 = false;
    }

    public static void a0(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z10).apply();
    }

    public static boolean b(pc pcVar) {
        Activity activity = pcVar.f7872b;
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

    public static void c(pc pcVar) {
        ValueAnimator valueAnimator = pcVar.f7902j2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            pcVar.f7902j2 = null;
        }
        pcVar.f7905k2 = false;
        hc hcVar = pcVar.f7923r;
        float f7 = hcVar.f7377a;
        float f10 = hcVar.f7378b;
        hcVar.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        pcVar.f7902j2 = ofFloat;
        ofFloat.addUpdateListener(new bb(pcVar, f7, f10, 0));
        pcVar.f7902j2.setDuration(340L);
        pcVar.f7902j2.setInterpolator(pr.h);
        pcVar.f7902j2.addListener(new mb(pcVar, 0));
        pcVar.f7902j2.start();
    }

    public static boolean d(pc pcVar) {
        Activity activity = pcVar.f7872b;
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
        spannableString.setSpan(new wb(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        pc pcVar = F2;
        if (pcVar != null) {
            pcVar.q(false);
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
        return this.f7872b.getResources().getDrawable(R.drawable.icplaceholder);
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
        sb sbVar = this.B0;
        if (sbVar != null && sbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f7936u2.get(this.f7933t2);
            }
            return this.B0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final v0 D() {
        if (this.N0 == null) {
            v0 v0Var = new v0(this.f7872b);
            this.N0 = v0Var;
            this.f7903k0.addView(v0Var, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.N0;
    }

    public final String F() {
        int i10;
        sb sbVar = this.B0;
        if (sbVar != null && sbVar.getCameraSession() != null) {
            if (this.B0.isFrontface() && !this.B0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f7936u2;
                if (this.f7933t2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f7933t2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.B0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f7898i1 == null) {
            xi0 xi0Var = new xi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f7895h1 = xi0Var;
            xi0Var.h = true;
            o8 o8Var = this.K1;
            if (o8Var != null && o8Var.f7818y0) {
                xi0Var.K(35);
                this.f7895h1.N(36);
            } else {
                xi0Var.N(0);
                this.f7895h1.K(0);
            }
            this.f7895h1.f32578a0 = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.f7869a);
            this.f7895h1.O(v02, "Sunny");
            this.f7895h1.O(v02, "Path 6");
            this.f7895h1.O(v02, "Path");
            this.f7895h1.O(v02, "Path 5");
            this.f7895h1.m();
            ImageView imageView = new ImageView(this.f7872b);
            this.f7898i1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f7898i1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f7898i1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.f7898i1.setOnClickListener(new ma(this, 0));
            this.f7898i1.setVisibility(8);
            this.f7898i1.setImageDrawable(this.f7895h1);
            this.f7898i1.setAlpha(0.0f);
            this.f7900j0.addView(this.f7898i1, 0, w7.x5.q(46, 56, 53));
        }
        return this.f7898i1;
    }

    public final void H() {
        rb rbVar = this.f7938v1;
        if (rbVar == null) {
            return;
        }
        this.f7939v2 = null;
        rbVar.getTopLayout().setAlpha(0.0f);
        this.f7938v1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f7938v1.getBottomLayout().setAlpha(0.0f);
        this.f7938v1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f7938v1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f7938v1.setVisibility(8);
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
        ob obVar;
        if (!this.W && (obVar = this.M0) != null) {
            if (obVar.getTranslationY() < (this.f7910n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.pc.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j3) {
        if (!this.S1 && this.K1 != null) {
            qa qaVar = this.f7893g2;
            if (qaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(qaVar);
            }
            this.f7896h2 = true;
            this.S1 = true;
            this.f7893g2 = new qa(this, runnable, 1);
            this.X0.setAlpha(0.0f);
            this.X0.setVisibility(0);
            this.X0.n(this.K1, this.f7893g2, j3);
            this.X0.p(this.K1, false);
            AndroidUtilities.runOnUIThread(this.f7893g2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: di.pc.M():boolean");
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
            this.f7932t1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f7906l0.setVisibility(i17);
            this.f7878c1.setVisibility(8);
            this.f7935u1.setVisibility(8);
        }
        if (i10 == 1) {
            this.f7874b1.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f7906l0.setVisibility(i14);
            this.f7892g1.setVisibility(8);
            this.f7901j1.setVisibility(8);
            this.f7885e1.setVisibility(8);
            ImageView imageView = this.f7898i1;
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
            this.f7917p0.setVisibility(i16);
            w();
            this.f7918p1.setAlpha(0.0f);
            this.f7918p1.setVisibility(8);
            this.f7871a1.setVisibility(8);
            this.H1 = null;
            this.I1 = null;
            this.J1 = null;
        }
        if (i11 == 1) {
            o8 o8Var = this.K1;
            if (o8Var == null || !o8Var.f7796n) {
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
            if (o8Var2 != null && o8Var2.f7786h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f7871a1.setVisibility(i13);
            this.f7906l0.setAlpha(1.0f);
            this.f7906l0.setTranslationY(0.0f);
            o8 o8Var3 = this.K1;
            this.f7878c1.setVisibility((o8Var3 == null || o8Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.V1) {
            D().setVisibility(0);
            v0 D = D();
            D.f8307r.d(0.0f, true);
            D.a(true);
            bi.oa oaVar = D.h;
            if (oaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(oaVar);
            }
            bi.oa oaVar2 = new bi.oa(D, 15);
            D.h = oaVar2;
            AndroidUtilities.runOnUIThread(oaVar2, 3500L);
            this.O0.h();
        }
        this.V1 = false;
        hf0 hf0Var2 = this.C1;
        if (hf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f7891g0) == -1 || i12 == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hf0Var2.setAllowTouch(z11);
        }
        fc fcVar = this.f7878c1;
        if (fcVar != null) {
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            fcVar.f7620e0 = z10;
        }
        if (i11 == 1) {
            int i19 = this.f7876c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            bi.u8 storiesController = MessagesController.getInstance(i19).getStoriesController();
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
        u61 textureView;
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
            cc ccVar = this.A0;
            if (ccVar != null) {
                ccVar.e();
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
        int i18 = this.f7876c;
        if (i11 != 1 && i10 != 1) {
            j3 = 0;
        } else {
            if (i11 == 1) {
                o8Var = this.K1;
            } else {
                o8Var = null;
            }
            this.f7885e1.setEntry(o8Var);
            if (this.O1 == 1) {
                this.f7892g1.setVisibility(0);
                o8 o8Var10 = this.K1;
                if (o8Var10 != null && o8Var10.Y) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f0(z13, false);
                this.f7901j1.setVisibility(0);
                this.X0.x(-9982, false);
                ((fg0) this.f7901j1.f8097c).a(this.X0.k(), false);
                this.f7917p0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                o8 o8Var11 = this.K1;
                if (o8Var11 != null && !TextUtils.isEmpty(o8Var11.f7817y)) {
                    this.f7892g1.setVisibility(8);
                    this.f7901j1.setVisibility(0);
                    ((fg0) this.f7901j1.f8097c).a(true, false);
                    this.f7917p0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.f7917p0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f7885e1.setVisibility(0);
            o8 o8Var12 = this.K1;
            if (o8Var12 != null && o8Var12.f7810u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f7898i1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.f7874b1.setVisibility(0);
            this.X0.setVisibility(0);
            o8 o8Var13 = this.K1;
            if ((o8Var13 != null && o8Var13.J0 != 0) || this.f7937v0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.f7878c1.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y0.getLayoutParams();
            o8 o8Var14 = this.K1;
            if ((o8Var14 != null && o8Var14.J0 != 0) || this.f7937v0 != 0) {
                f7 = 12.0f;
            } else {
                f7 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f7);
            this.Y0.setLayoutParams(layoutParams);
            this.f7906l0.setVisibility(0);
            this.f7906l0.clearFocus();
            o8 o8Var15 = this.K1;
            if (o8Var15 == null) {
                i13 = 86400;
            } else {
                i13 = o8Var15.I0;
            }
            this.f7878c1.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((o8Var2 = this.K1) == null || !o8Var2.f7784g)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f7878c1.setPeriodVisible(z10);
            o8 o8Var16 = this.K1;
            if (o8Var16 != null && o8Var16.f7799o0 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f7878c1.setHasRoundVideo(z11);
            fc fcVar = this.f7878c1;
            if (fcVar == null) {
                j3 = 0;
            } else {
                o8 o8Var17 = this.K1;
                if (o8Var17 == null || !o8Var17.f7796n) {
                    j3 = 0;
                    fcVar.v(null, null);
                } else {
                    TLRPC.Peer peer = o8Var17.f7802q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j3 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        o8 o8Var18 = this.K1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        o8Var18.f7800p = append;
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
                        o8Var19.f7800p = append;
                    }
                    String str3 = this.K1.f7806s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.f7878c1.v(str4, append);
                }
            }
            o8 o8Var20 = this.K1;
            if (o8Var20 != null && o8Var20.v() && this.K1.t()) {
                z12 = false;
            } else {
                z12 = true;
            }
            zc zcVar = this.Z0;
            boolean z22 = zcVar.f8586j0;
            zcVar.f8586j0 = z12;
            zcVar.f8584i0.f(z12, true);
            zcVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.f7917p0.setVisibility(0);
            this.f7932t1.setVisibility(0);
            o8 o8Var21 = this.K1;
            if (o8Var21 != null && o8Var21.f7772b0) {
                this.f7917p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f7906l0.setVisibility(0);
            this.f7935u1.setVisibility(0);
        }
        if (i11 == 2) {
            this.f7917p0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.N1 = false;
            o8 o8Var22 = this.K1;
            if (o8Var22 != null && o8Var22.J0 != j3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o8Var22 != null && o8Var22.f7784g) {
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
            u6 u6Var = this.f7874b1;
            if (!TextUtils.equals(string, u6Var.d) || z23 != u6Var.f8278e) {
                u6Var.removeView(u6Var.f8277c);
                Context context = u6Var.getContext();
                u6Var.d = string;
                u6Var.f8278e = z23;
                t6 t6Var = new t6(u6Var, context, string, z23);
                u6Var.f8277c = t6Var;
                t6Var.setContentDescription(string);
                u6Var.addView(u6Var.f8277c, w7.x5.c(-2.0f, -2));
                u6Var.e();
            }
            this.f7932t1.setVisibility(8);
            this.f7935u1.setVisibility(8);
            if (!this.f7896h2) {
                o8 o8Var23 = this.K1;
                if (o8Var23 != null && o8Var23.f7810u) {
                    this.X0.l(o8Var23);
                } else {
                    this.X0.set(o8Var23);
                }
            }
            this.f7896h2 = false;
            zt editText = this.f7878c1.f7621f.getEditText();
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
            this.f7881d1.setVisibility(i15);
            ArrayList arrayList = this.H1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.J1;
                ArrayList arrayList3 = this.I1;
                fb fbVar = this.f7881d1;
                fbVar.c(false, false);
                fbVar.f8263c = arrayList;
                fbVar.d = arrayList2;
                fbVar.f8264e = arrayList3;
                fbVar.f8269w = new f01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                fbVar.K = new f01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                fbVar.f8262b.Y2.N(false);
                this.f7881d1.setSelected(this.H1.indexOf(this.K1));
            }
            if (!z16 && !z17 && this.H1 == null && ((o8Var8 = this.K1) == null || (!o8Var8.v() && this.K1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.Z0.setMaxCount(i16);
            if (i10 != 2) {
                o8 o8Var24 = this.K1;
                if (o8Var24 != null && (o8Var24.f7774c || o8Var24.f7784g || this.f7934u0)) {
                    if (o8Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    o8 o8Var25 = this.K1;
                    if (o8Var25.K && o8Var25.f7770a1 != null && (textureView = this.X0.getTextureView()) != null) {
                        textureView.setDelegate(new ta(this, 7));
                    }
                    this.f7878c1.setText(this.K1.C0);
                } else if (i10 != 2) {
                    fc fcVar2 = this.f7878c1;
                    fcVar2.V = true;
                    fcVar2.f7621f.setText("");
                }
            }
            o8 o8Var26 = this.K1;
            if (o8Var26 != null && ((o8Var26.f7810u && !o8Var26.K) || o8Var26.v())) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.f7874b1.d(4, z18);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (o8Var7 = this.K1) != null && !o8Var7.f7810u && !o8Var7.v()) {
                z19 = true;
            } else {
                z19 = false;
            }
            this.f7874b1.d(3, z19);
            if (!this.N1 && !this.f7878c1.o()) {
                bi.u8 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                bi.n8 o9 = storiesController.o();
                if (o9 == null || !o9.a(storiesController.f3832a, B) || ((o8Var6 = this.K1) != null && (o8Var6.f7784g || o8Var6.J0 != j3))) {
                    z20 = true;
                    this.f7874b1.setShareEnabled(z20);
                    o8Var4 = this.K1;
                    if (o8Var4 == null && o8Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f7892g1.setImageResource(i17);
                    this.X0.setVisibility(0);
                    this.Z0.setVisibility(0);
                    this.f7917p0.setVisibility(0);
                    this.f7917p0.setTranslationX(0.0f);
                    o8Var5 = this.K1;
                    if (o8Var5 == null && o8Var5.J0 != j3) {
                        this.f7917p0.l("", false);
                    } else if (o8Var5 == null && o8Var5.f7784g) {
                        this.f7917p0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (o8Var5 == null && o8Var5.f7810u) {
                        this.f7917p0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (o8Var5 == null && o8Var5.f7796n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this.f7917p0, 32.0f, i18);
                        this.f7917p0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(g5Var, 0, 1, 33);
                        if (this.K1.f7802q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.K1.f7802q.user_id));
                            g5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.K1.f7802q)));
                            g5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.f7917p0.l(spannableStringBuilder, false);
                    } else {
                        this.f7917p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z21 = true;
                }
            }
            z20 = false;
            this.f7874b1.setShareEnabled(z20);
            o8Var4 = this.K1;
            if (o8Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f7892g1.setImageResource(i17);
            this.X0.setVisibility(0);
            this.Z0.setVisibility(0);
            this.f7917p0.setVisibility(0);
            this.f7917p0.setTranslationX(0.0f);
            o8Var5 = this.K1;
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            if (o8Var5 == null) {
            }
            this.f7917p0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z21 = true;
        }
        if (i10 == z21) {
            fc fcVar3 = this.f7878c1;
            n70 n70Var = fcVar3.V0;
            if (n70Var != null) {
                n70Var.u();
                fcVar3.V0 = null;
            }
            this.f7904k1.e(z21);
            fb fbVar2 = this.f7881d1;
            if (fbVar2.M) {
                fbVar2.c(false, z21);
            }
        }
        if (i11 == 2 && (o8Var3 = this.K1) != null) {
            if (o8Var3.f7780e0 < j3) {
                o8Var3.f7780e0 = j3;
            }
            this.M1 = o8Var3.f7780e0;
            if (this.X0.getDuration() < 100) {
                duration = this.K1.f7786h0;
            } else {
                duration = this.X0.getDuration();
            }
            o8 o8Var27 = this.K1;
            if (o8Var27.f7786h0 <= 0) {
                o8Var27.f7786h0 = duration;
            }
            File file = o8Var27.Z0;
            if (file == null) {
                file = o8Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            o8 o8Var28 = this.K1;
            this.f7932t1.o(false, absolutePath, o8Var28.f7786h0, o8Var28.P);
            o8 o8Var29 = this.K1;
            float f10 = (float) duration;
            long j10 = o8Var29.Z * f10;
            long j11 = o8Var29.f7769a0 * f10;
            zc zcVar2 = this.f7932t1;
            zcVar2.Z0 = j10;
            zcVar2.f8565a1 = j11;
            uc ucVar = zcVar2.h;
            if (ucVar != null) {
                uc.a(ucVar, true);
            }
            ci.u uVar = new ci.u(this, 8);
            this.f7932t1.setDelegate(new pb(uVar));
            float max = (((float) this.M1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f7932t1.setVideoLeft(max);
            this.f7932t1.setVideoRight(0.04f + max);
            uVar.run(Boolean.TRUE, Float.valueOf(max));
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            hf0Var.setAllowTouch(false);
        }
        f4 f4Var2 = this.f7908m1;
        boolean z24 = true;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        org.telegram.ui.Components.qc.e();
        fc fcVar4 = this.f7878c1;
        if (fcVar4 != null) {
            g gVar = fcVar4.f7621f;
            gVar.d();
            gVar.k(true);
            this.f7878c1.f7620e0 = true;
        }
        dc dcVar = this.X0;
        if (dcVar != null) {
            if (i11 != 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            dcVar.x(8, z15);
        }
        rb rbVar = this.f7938v1;
        if (rbVar != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            rbVar.setCoverPreview(z14);
        }
        f4 f4Var3 = this.f7912n1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        cc ccVar2 = this.A0;
        ccVar2.setPreview((i11 == 1 && ccVar2.j()) ? false : false);
    }

    public final void P() {
        qg.a1 a1Var;
        int i10;
        if (this.f7888f0 == 0) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7947x2 = new ka(this, 3);
            } else {
                Z(false);
            }
        }
        fc fcVar = this.f7878c1;
        if (fcVar != null) {
            fcVar.f7621f.s();
        }
        l7 l7Var = this.O0;
        if (l7Var != null) {
            l7Var.h();
        }
        v6 v6Var = this.f7915o1;
        if (v6Var != null) {
            bi.u8 storiesController = MessagesController.getInstance(v6Var.f8318a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f3838i.f(UserConfig.getInstance(storiesController.f3832a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            v6Var.f8319b = storiesController.f3833b.m() + i10 + 1;
            v6Var.f8320c.invalidate();
        }
        rb rbVar = this.f7938v1;
        if (rbVar != null && (a1Var = rbVar.O0.d) != null) {
            a1Var.postRunnable(a1Var.f44404w);
        }
        dc dcVar = this.X0;
        if (dcVar != null) {
            dcVar.x(0, false);
        }
        b1 b1Var = MessagesController.getInstance(this.f7876c).getStoriesController().f3851w;
        if (!b1Var.f6964c && !b1Var.d) {
            b1Var.d = true;
            x0 x0Var = new x0(b1Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(b1Var.f6962a);
            messagesStorage.getStorageQueue().postRunnable(new y0((Object) messagesStorage, false, (Object) x0Var, 0));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z10;
        rb rbVar;
        zb zbVar;
        ac acVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        rb rbVar2;
        if (i11 == 0) {
            this.f7911n0.setVisibility(8);
        }
        if (i10 == 0 && (rbVar2 = this.f7938v1) != null) {
            rbVar2.setVisibility(8);
        }
        if (i10 == -1) {
            this.f7878c1.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f7892g1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f7901j1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f7885e1.setVisibility(i14);
            ImageView imageView = this.f7898i1;
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
            this.f7917p0.setVisibility(8);
        }
        boolean z11 = true;
        if (i11 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X0.setAllowCropping(z10);
        if ((i11 == 0 || i10 == 0) && (rbVar = this.f7938v1) != null) {
            rbVar.f7986d1.setLayerType(0, null);
        }
        hf0 hf0Var = this.C1;
        if (hf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z11 = false;
            }
            hf0Var.setAllowTouch(z11);
        }
        if (i11 == 3) {
            zb zbVar2 = this.f7925r1;
            if (zbVar2 != null) {
                zbVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (zbVar = this.f7925r1) != null) {
            zbVar.setVisibility(8);
            this.f7925r1.setAppearProgress(0.0f);
            zb zbVar3 = this.f7925r1;
            zbVar3.f7447x = null;
            g0 g0Var = zbVar3.f7442f;
            g0Var.L = null;
            g0Var.d = null;
            g0Var.J = false;
            zbVar3.d.setVisibility(8);
            zbVar3.f7438a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            ac acVar2 = this.f7929s1;
            if (acVar2 != null) {
                acVar2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (acVar = this.f7929s1) != null) {
            acVar.setVisibility(8);
            this.f7929s1.setAppearProgress(0.0f);
            ac acVar3 = this.f7929s1;
            acVar3.f7649b = null;
            g0 g0Var2 = acVar3.h;
            g0Var2.L = null;
            g0Var2.d = null;
            g0Var2.J = false;
            acVar3.f7651e.setVisibility(8);
            acVar3.setVisibility(8);
        }
    }

    public final void R(jc jcVar) {
        bi.n8 o9;
        oc ocVar;
        if (this.d) {
            return;
        }
        int i10 = this.f7876c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.b.b(i10);
            return;
        }
        int i11 = 0;
        this.f7934u0 = false;
        this.f7883e = false;
        this.B2 = false;
        this.f7928s0.f7022g = false;
        WindowManager windowManager = this.f7887f;
        if (windowManager != null && (ocVar = this.f7910n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.f7910n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
            windowManager.addView(this.f7910n, layoutParams);
            g0();
        }
        this.A0.setCameraThumb(A());
        if (this.f7937v0 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            h0(o9, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.H;
        if (jcVar != null) {
            this.F = jcVar;
            this.J = jcVar.f7510a;
            rectF.set(jcVar.f7512c);
            this.G = jcVar.f7511b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7923r.c();
        int i12 = this.J;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f7894h0.setBackgroundColor(i11);
        this.f7923r.setTranslationX(0.0f);
        this.f7923r.setTranslationY(0.0f);
        this.f7923r.b(0.0f);
        this.f7923r.setScaleX(1.0f);
        this.f7923r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7872b, 1);
        g(1.0f, true, new ka(this, 6));
        e();
        this.f7937v0 = 0L;
        this.f7941w0 = "";
    }

    public final void S(ic icVar, o8 o8Var, long j3) {
        int i10;
        oc ocVar;
        if (this.d) {
            return;
        }
        int i11 = this.f7876c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.b.b(i11);
            return;
        }
        this.f7934u0 = false;
        this.f7883e = false;
        this.B2 = false;
        WindowManager windowManager = this.f7887f;
        if (windowManager != null && (ocVar = this.f7910n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.f7910n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
            windowManager.addView(this.f7910n, layoutParams);
            g0();
        }
        this.K1 = o8Var;
        this.O1 = o8Var.K ? 1 : 0;
        this.f7928s0.f7022g = false;
        RectF rectF = this.H;
        if (icVar != null) {
            this.F = icVar;
            this.J = icVar.f7510a;
            rectF.set(icVar.f7512c);
            this.G = icVar.f7511b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7923r.c();
        int i12 = this.J;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f7894h0.setBackgroundColor(i10);
        this.f7923r.setTranslationX(0.0f);
        this.f7923r.setTranslationY(0.0f);
        this.f7923r.b(0.0f);
        this.f7923r.setScaleX(1.0f);
        this.f7923r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7872b, 1);
        o8 o8Var2 = this.K1;
        if (o8Var2 != null) {
            this.f7878c1.setText(o8Var2.C0);
        }
        L(new db(this, 0), j3);
        if (this.K1.f7772b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.f7874b1.b(false, false);
        e();
        this.f7937v0 = 0L;
        this.f7941w0 = "";
    }

    public final void T() {
        n70 n70Var;
        dc dcVar = this.X0;
        if (dcVar != null) {
            dcVar.x(4, true);
        }
        fc fcVar = this.f7878c1;
        if (fcVar != null && (n70Var = fcVar.V0) != null) {
            n70Var.u();
            fcVar.V0 = null;
        }
        sg.a1 a1Var = new sg.a1((org.telegram.ui.ActionBar.n2) new tb(this, 1), 14, false);
        a1Var.setOnDismissListener(new za(this, 1));
        a1Var.show();
    }

    public final void U(ic icVar, o8 o8Var) {
        int i10;
        boolean z10;
        int i11;
        bi.n8 o9;
        oc ocVar;
        if (this.d) {
            return;
        }
        int i12 = this.f7876c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.b.b(i12);
            return;
        }
        this.f7934u0 = true;
        this.f7883e = false;
        this.B2 = false;
        WindowManager windowManager = this.f7887f;
        if (windowManager != null && (ocVar = this.f7910n) != null && ocVar.getParent() == null) {
            oc ocVar2 = this.f7910n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ocVar2, layoutParams);
            windowManager.addView(this.f7910n, layoutParams);
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
        if (o8Var2 != null && o8Var2.f7810u && i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7928s0.f7022g = z10;
        if (this.f7937v0 == 0 && (o9 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o9.a(i12, 1)) {
            h0(o9, true);
        }
        RectF rectF = this.H;
        if (icVar != null) {
            this.F = icVar;
            this.J = icVar.f7510a;
            rectF.set(icVar.f7512c);
            this.G = icVar.f7511b;
            this.F.e();
        } else {
            this.J = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.G = AndroidUtilities.dp(8.0f);
        }
        this.f7923r.c();
        int i13 = this.J;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f7894h0.setBackgroundColor(i11);
        this.f7923r.setTranslationX(0.0f);
        this.f7923r.setTranslationY(0.0f);
        this.f7923r.b(0.0f);
        this.f7923r.setScaleX(1.0f);
        this.f7923r.setScaleY(1.0f);
        this.K = 0.0f;
        AndroidUtilities.lockOrientation(this.f7872b, 1);
        o8 o8Var3 = this.K1;
        if (o8Var3 != null) {
            this.f7878c1.setText(o8Var3.C0);
        }
        this.f7874b1.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new ka(this, 6));
        e();
        this.f7937v0 = 0L;
        this.f7941w0 = "";
    }

    public final void V() {
        qg.c1 c1Var = this.f7942w1;
        if (c1Var != null) {
            c1Var.bringToFront();
        }
        View view = this.f7946x1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f7950y1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f7953z1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.A1;
        if (view4 != null) {
            view4.bringToFront();
        }
        cd cdVar = this.f7918p1;
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
        v6 v6Var = this.f7915o1;
        if (v6Var != null) {
            v6Var.bringToFront();
        }
        p pVar = this.f7921q1;
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
            u61 textureView = this.X0.getTextureView();
            if (o8Var.K && !o8Var.f7810u && textureView != null) {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            rb rbVar = this.f7938v1;
            if (rbVar != null && rbVar.R0 != null) {
                canvas.save();
                canvas.scale(f7, f7);
                rb rbVar2 = this.f7938v1;
                rbVar2.I0 = true;
                k6 k6Var = rbVar2.R0;
                k6Var.f45182a = true;
                k6Var.draw(canvas);
                rb rbVar3 = this.f7938v1;
                rbVar3.R0.f45182a = false;
                rbVar3.I0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = o8.w(this.f7876c, "jpg");
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
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (!z11) {
                o8Var2.N0 = w10;
            }
            o8Var2.f7773b1 = createScaledBitmap;
        }
    }

    public final void X() {
        bi.n8 o9;
        int size;
        char c10;
        View[] viewPages;
        o51[] o51VarArr;
        ia iaVar = this.f7920q0;
        BitmapDrawable bitmapDrawable = null;
        if (iaVar != null) {
            iaVar.dismiss();
            this.f7920q0 = null;
        }
        if (this.N1) {
            u0 u0Var = this.f7885e1;
            u0Var.getClass();
            u0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            t6 t6Var = this.f7874b1.f8277c;
            int i10 = -this.U1;
            this.U1 = i10;
            AndroidUtilities.shakeViewSpring(t6Var, i10);
            return;
        }
        fc fcVar = this.f7878c1;
        if (fcVar != null && fcVar.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.q6 q6Var = fcVar.v;
            int i11 = -this.U1;
            this.U1 = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            fcVar.e();
            return;
        }
        o8 o8Var = this.K1;
        int i12 = this.f7876c;
        if ((o8Var == null || (!o8Var.f7784g && o8Var.J0 == 0)) && (o9 = MessagesController.getInstance(i12).storiesController.o()) != null && o9.a(i12, B())) {
            h0(o9, false);
            return;
        }
        this.K1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        bi.b bVar = this.f7869a;
        if (fcVar != null && !this.K1.D0) {
            CharSequence text = fcVar.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((o01[]) spannable.getSpans(0, text.length(), o01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new org.telegram.ui.Components.yc(this.f7910n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.gc, 0, new ka(this, 27), bVar)).k(true);
                    int i13 = -this.U1;
                    this.U1 = i13;
                    AndroidUtilities.shakeViewSpring(fcVar, i13);
                    return;
                }
            }
        }
        o8 o8Var2 = this.K1;
        if (!o8Var2.f7784g && o8Var2.J0 == 0) {
            if (this.N != 0) {
                o8Var2.f7812v0 = MessagesController.getInstance(i12).getInputPeer(this.N);
            }
            dc dcVar = this.X0;
            dcVar.x(3, true);
            ia iaVar2 = new ia(this.f7872b, this.K1.I0, bVar);
            iaVar2.q1(this.K1.E0);
            iaVar2.p1(this.K1.f7812v0);
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
            CharSequence text2 = fcVar.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (o51 o51Var : (o51[]) ((Spanned) text2).getSpans(0, text2.length(), o51.class)) {
                    if (o51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(o51Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f20043id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f20043id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
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
            this.f7920q0 = iaVar2;
            o8 o8Var3 = this.K1;
            if (o8Var3.K) {
                if (dcVar != null && !o8Var3.f7783f0 && this.f7888f0 != 2) {
                    o8Var3.f7780e0 = dcVar.getCurrentPosition();
                    Utilities.Callback laVar = new la(this, 17);
                    View view = this.f7942w1;
                    View view2 = this.f7953z1;
                    View[] viewArr = new View[3];
                    viewArr[0] = dcVar;
                    viewArr[c10] = view;
                    viewArr[2] = view2;
                    dcVar.h(laVar, viewArr);
                }
                ia iaVar3 = this.f7920q0;
                Bitmap bitmap = this.K1.f7785g0;
                ka kaVar = new ka(this, 20);
                if (bitmap != null) {
                    iaVar3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                iaVar3.f7419b0 = bitmapDrawable;
                iaVar3.f7421c0 = kaVar;
                i1 i1Var = iaVar3.f7418b;
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
            this.f7920q0.setOnDismissListener(new za(this, 0));
            this.f7920q0.show();
            return;
        }
        o8Var2.f7793l = false;
        i(null);
        p0();
    }

    public final void Y(kc kcVar) {
        int i10 = 0;
        RectF rectF = this.H;
        if (kcVar != null) {
            this.F = kcVar;
            this.J = kcVar.f7510a;
            rectF.set(kcVar.f7512c);
            this.G = kcVar.f7511b;
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
        this.f7894h0.setBackgroundColor(i10);
    }

    public final void Z(boolean z10) {
        Activity activity;
        boolean z11;
        if (!this.f7943w2 || z10) {
            this.f7930s2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f7872b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f7930s2 = z11;
                if (z11) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    oq oqVar = new oq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    oqVar.f29189e = dp;
                    oqVar.f29190f = dp2;
                    this.A0.setCameraThumb(oqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f7869a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.f20225a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ta(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f20225a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f7943w2 = true;
                }
            }
            if (!this.f7930s2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new ka(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        sb sbVar = this.B0;
        if (sbVar != null && sbVar.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new a3.k0(this, this.B0.getTextureView().getBitmap(), runnable, 21));
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
            animate.alpha(f7).setUpdateListener(new qb(this, 1)).setListener(new ah.r0(this, z10, view, 2)).setDuration(320L).setInterpolator(pr.h).start();
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
            this.f7887f.updateViewLayout(this.f7910n, layoutParams);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bi.n8 o9;
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
            if (this.f7909m2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f7909m2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f7909m2 = albumEntry;
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
            int i14 = this.f7888f0;
            int i15 = this.f7876c;
            if (i14 == 1) {
                if (!this.N1 && !this.f7878c1.o()) {
                    bi.u8 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    bi.n8 o10 = storiesController.o();
                    if (o10 == null || !o10.a(storiesController.f3832a, B) || ((o8Var = this.K1) != null && (o8Var.f7784g || o8Var.J0 != 0))) {
                        z10 = true;
                    }
                }
                this.f7874b1.setShareEnabled(z10);
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
        int i10 = this.f7876c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.E0.clearAnimation();
        sb sbVar = this.B0;
        if ((sbVar != null && sbVar.isDual()) || this.a2) {
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
        if (adVar.f6954n != i10) {
            adVar.f6954n = i10;
            ValueAnimator valueAnimator = adVar.f6955r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                adVar.f6955r = null;
            }
            adVar.setDrawable(i10);
        }
        if (this.f7888f0 == 0 && !this.I0.f8471e && this.Y1 != null && !I()) {
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
        Boolean bool = this.f7919p2;
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
                this.f7922q2 = new ua(this, z10, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f7913n2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f7913n2 = null;
            }
            o1.k kVar = this.f7916o2;
            if (kVar != null) {
                kVar.c();
                this.f7916o2 = null;
            }
            if (this.M0 == null) {
                if (z10) {
                    t(false);
                }
                if (this.M0 == null) {
                    return;
                }
            }
            ob obVar = this.M0;
            if (obVar != null) {
                obVar.K = false;
            }
            if (z10 && (v0Var = this.N0) != null) {
                v0Var.a(false);
            }
            int i11 = 4;
            hc hcVar = this.f7923r;
            if (hcVar != null) {
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                hcVar.setImportantForAccessibility(i10);
            }
            ob obVar2 = this.M0;
            if (z10) {
                i11 = 0;
            }
            obVar2.setImportantForAccessibility(i11);
            this.f7919p2 = Boolean.valueOf(z10);
            float translationY = this.M0.getTranslationY();
            oc ocVar = this.f7910n;
            if (z10) {
                height = 0.0f;
            } else {
                height = (ocVar.getHeight() - this.M0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, ocVar.getHeight());
            ob obVar3 = this.M0;
            obVar3.K = !z10;
            if (this.f7902j2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f7905k2 = z11;
            if (z10) {
                o1.k kVar2 = new o1.k(obVar3, o1.h.f16834n, height);
                this.f7916o2 = kVar2;
                kVar2.f16852u.a(0.75f);
                this.f7916o2.f16852u.b(350.0f);
                this.f7916o2.a(new va(this, height, 0));
                this.f7916o2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f7913n2 = ofFloat;
                ofFloat.addUpdateListener(new wa(this, 0));
                this.f7913n2.addListener(new mb(this, 1));
                this.f7913n2.setDuration(450L);
                this.f7913n2.setInterpolator(pr.h);
                this.f7913n2.start();
            }
            if (!z10 && !this.S1) {
                this.f7907l2 = null;
            }
            if (!z10 && this.f7888f0 == 0 && !this.f7930s2) {
                r();
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f7889f1 == null) {
            xi0 xi0Var = new xi0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f7889f1 = xi0Var;
            xi0Var.F *= 1.5f;
        }
        this.f7892g1.setAnimation(this.f7889f1);
        int i10 = 20;
        if (!z11) {
            xi0 xi0Var2 = this.f7889f1;
            if (!z10) {
                i10 = 0;
            }
            xi0Var2.L(i10, false, false);
        } else if (z10) {
            xi0 xi0Var3 = this.f7889f1;
            if (xi0Var3.f32580b0 > 20) {
                xi0Var3.L(0, false, false);
            }
            this.f7889f1.N(20);
            this.f7889f1.start();
        } else {
            xi0 xi0Var4 = this.f7889f1;
            int i11 = xi0Var4.f32580b0;
            if (i11 != 0 && i11 < 43) {
                xi0Var4.N(43);
                this.f7889f1.start();
            }
        }
    }

    public final void g(float f7, boolean z10, Runnable runnable) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        hc hcVar = this.f7923r;
        if (z10) {
            this.P.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.L = Float.valueOf(this.K);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new wa(this, 5));
            this.E.addListener(new bi.h2(this, f7, runnable, 2));
            if (f7 < 1.0f && this.v) {
                this.E.setDuration(250L);
                this.E.setInterpolator(pr.h);
            } else if (f7 <= 0.0f && hcVar.f7377a >= AndroidUtilities.dp(20.0f)) {
                if (f7 < 0.0f && this.O) {
                    this.E.setDuration(200L);
                    this.E.setInterpolator(pr.h);
                    this.O = false;
                } else {
                    this.E.setDuration(400L);
                    this.E.setInterpolator(pr.h);
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
        hcVar.invalidate();
        this.f7910n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f7910n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 2));
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
            f4 f4Var2 = this.f7908m1;
            if (f4Var2 != null) {
                f4Var2.e(true);
            }
            f4 f4Var3 = this.f7904k1;
            if (f4Var3 != null) {
                f4Var3.e(true);
            }
            f4 f4Var4 = this.W0;
            if (f4Var4 != null) {
                f4Var4.e(true);
            }
        }
        if (this.a2 == z10 && this.f7875b2 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.Z1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Z1 = null;
        }
        this.a2 = z10;
        this.f7875b2 = I();
        if (z10 && (yVar = this.I0) != null && yVar.f8471e) {
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
            if (z10 && this.f7888f0 == 0 && !I()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c4Var2, property, f10);
            Property property2 = View.TRANSLATION_Y;
            if (z10 && this.f7888f0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c4Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c4Var, property, (!z10 && this.f7888f0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z10 && this.f7888f0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c4Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gbVar, property, (z10 || this.f7888f0 != 0 || I()) ? 0.0f : 0.0f);
            if (z10 || this.f7888f0 != 0 || I()) {
                f13 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(gbVar, property2, f13));
            this.Z1.setDuration(260L);
            this.Z1.setInterpolator(pr.h);
            this.Z1.start();
            return;
        }
        if (z10 && this.f7888f0 == 0 && !I()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        c4Var2.setAlpha(f7);
        if (z10 && this.f7888f0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        c4Var2.setTranslationY(dp);
        c4Var.setAlpha((!z10 && this.f7888f0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z10 && this.f7888f0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        c4Var.setTranslationY(dp2);
        gbVar.setAlpha((z10 || this.f7888f0 != 0 || I()) ? 0.0f : 0.0f);
        if (z10 || this.f7888f0 != 0 || I()) {
            f13 = AndroidUtilities.dp(16.0f);
        }
        gbVar.setTranslationY(f13);
    }

    public final void h0(bi.n8 n8Var, boolean z10) {
        if (this.f7954z2) {
            return;
        }
        sg.k0 k0Var = new sg.k0(n8Var.b(), this.f7876c, this.f7872b, new tb(this, 0), null);
        k0Var.X = B();
        k0Var.setOnDismissListener(new b80(2, this, z10));
        this.X0.x(7, true);
        this.f7954z2 = true;
        k0Var.show();
    }

    public final void i(Runnable runnable) {
        o8 o8Var;
        Runnable runnable2;
        dc dcVar;
        float f7;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        jf0 jf0Var = this.B1;
        if (jf0Var != null && (o8Var = this.K1) != null) {
            o8Var.f7789j = jf0Var.d() | o8Var.f7789j;
            o8 o8Var2 = this.K1;
            jf0 jf0Var2 = this.B1;
            File file = o8Var2.Z0;
            if (file != null) {
                file.delete();
                o8Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = jf0Var2.getSavedFilterState();
            o8Var2.f7770a1 = savedFilterState;
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
                        matrix.postScale(f7, f10, o8Var2.f7792k0 / 2.0f, o8Var2.f7794l0 / 2.0f);
                        matrix.postRotate(-o8Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        o8Var2.f7797n0.preScale(o8Var2.f7792k0 / createBitmap.getWidth(), o8Var2.f7794l0 / createBitmap.getHeight());
                        o8Var2.f7792k0 = createBitmap.getWidth();
                        o8Var2.f7794l0 = createBitmap.getHeight();
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
                        int i11 = o8Var2.f7768a;
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
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new bi.e4(o8Var2, createBitmap, z10, runnable2, 2));
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
                if (!o8Var3.K && (dcVar = this.X0) != null) {
                    dcVar.set(o8Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z10, boolean z11) {
        if (this.f7882d2 != z10) {
            this.f7882d2 = z10;
            float f7 = 0.0f;
            if (z11) {
                ViewPropertyAnimator animate = this.J0.animate();
                if (z10) {
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(350L).setInterpolator(pr.h).withEndAction(new ua(this, z10, 1)).start();
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
        if (this.K1 != null && this.D1 != null && this.f7894h0.getMeasuredWidth() > 0 && this.f7894h0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.K1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f7894h0.getMeasuredWidth() / 2.0f, this.f7894h0.getMeasuredHeight() / 2.0f);
                if ((this.K1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f7894h0.getMeasuredWidth() / this.f7894h0.getMeasuredHeight(), this.f7894h0.getMeasuredHeight() / this.f7894h0.getMeasuredWidth(), this.f7894h0.getMeasuredWidth() / 2.0f, this.f7894h0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f7894h0.getMeasuredWidth()) * this.K1.f7792k0, (1.0f / this.f7894h0.getMeasuredHeight()) * this.K1.f7794l0);
            matrix.postConcat(this.K1.f7797n0);
            matrix.postScale(this.f7894h0.getMeasuredWidth() / this.K1.f7788i0, this.f7894h0.getMeasuredHeight() / this.K1.f7790j0);
            this.D1.setTransform(matrix);
            this.D1.invalidate();
        }
    }

    public final void j0(boolean z10) {
        Integer num;
        float f7;
        d91 d91Var = this.V0;
        if ((d91Var.getTag() != null && z10) || (d91Var.getTag() == null && !z10)) {
            if (z10) {
                Runnable runnable = this.f7886e2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                ka kaVar = new ka(this, 25);
                this.f7886e2 = kaVar;
                AndroidUtilities.runOnUIThread(kaVar, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f7890f2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        d91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7890f2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z10) {
            d91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f7890f2;
        Property property = View.ALPHA;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(d91Var, property, f7));
        this.f7890f2.addListener(new ah.q0(14, this, z10));
        this.f7890f2.start();
        if (z10) {
            ka kaVar2 = new ka(this, 26);
            this.f7886e2 = kaVar2;
            AndroidUtilities.runOnUIThread(kaVar2, 2000L);
        }
    }

    public final void k() {
        bi.l4 l4Var;
        if (this.J == 1) {
            RectF rectF = this.f7880d0;
            rectF.set(this.f7894h0.getLeft(), this.f7894h0.getTop(), this.f7894h0.getMeasuredWidth(), this.f7894h0.getMeasuredHeight());
            rectF.offset(this.f7923r.getX(), this.f7923r.getY());
            float f7 = this.I;
            RectF rectF2 = this.H;
            RectF rectF3 = this.f7877c0;
            AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
            this.f7894h0.setAlpha(this.I);
            float f10 = rectF3.left;
            bc bcVar = this.f7894h0;
            bcVar.setTranslationX((f10 - bcVar.getLeft()) - this.f7923r.getX());
            float f11 = rectF3.top;
            bc bcVar2 = this.f7894h0;
            bcVar2.setTranslationY((f11 - bcVar2.getTop()) - this.f7923r.getY());
            kc kcVar = this.F;
            if (kcVar != null && (l4Var = kcVar.f7514f) != null) {
                l4Var.setTranslationX((rectF.left - rectF2.left) * this.I);
                this.F.f7514f.setTranslationY((rectF.top - rectF2.top) * this.I);
            }
            this.f7894h0.setScaleX(rectF3.width() / this.f7894h0.getMeasuredWidth());
            this.f7894h0.setScaleY(rectF3.height() / this.f7894h0.getMeasuredHeight());
            this.f7897i0.setAlpha(this.I);
            this.f7903k0.setAlpha(this.I);
            this.f7906l0.setAlpha(this.I);
            if (this.f7888f0 == 2) {
                this.f7935u1.setAlpha(this.I);
            }
        }
    }

    public final void k0() {
        ia iaVar = this.f7920q0;
        if (iaVar != null) {
            iaVar.dismiss();
            this.f7920q0 = null;
        }
        ia iaVar2 = new ia(this.f7872b, 86400, this.f7869a);
        iaVar2.o1();
        iaVar2.q1(this.f7949y0);
        TLRPC.InputPeer inputPeer = this.f7945x0;
        if (inputPeer == null) {
            if (this.N != 0) {
                inputPeer = MessagesController.getInstance(this.f7876c).getInputPeer(this.N);
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
        this.f7920q0 = iaVar2;
        iaVar2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: di.pc.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.pc.l0(int, boolean, boolean):void");
    }

    public final void m() {
        o8 o8Var;
        boolean z10;
        if (this.f7938v1 != null && (o8Var = this.K1) != null && o8Var.f7810u) {
            File file = o8Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                this.K1.W0 = null;
            }
            this.K1.W0 = o8.w(this.f7876c, "webp");
            rb rbVar = this.f7938v1;
            o8 o8Var2 = this.K1;
            ArrayList arrayList = o8Var2.T0;
            if (this.O1 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            Bitmap t02 = rbVar.t0(arrayList, false, false, true, z10, o8Var2);
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
        sb sbVar;
        boolean z17 = false;
        if (this.f7888f0 == 0 && this.O1 == 1 && !this.I0.f8471e && !I()) {
            z11 = true;
        } else {
            z11 = false;
        }
        i0(z11, z10);
        this.G0.setSelected(this.A0.j());
        y yVar = this.I0;
        if (yVar != null && yVar.f8471e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0(this.f7911n0, z12, z10);
        if (!this.a2 && this.O1 != -1 && this.f7888f0 == 0 && this.Y1 != null && !this.I0.f8471e && !I()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.E0, z13, z10);
        if (!this.a2 && this.O1 != -1 && this.f7888f0 == 0 && (sbVar = this.B0) != null && sbVar.f7068a && !this.I0.f8471e && !this.A0.j()) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.F0, z14, z10);
        if (!this.a2 && this.O1 != -1 && this.f7888f0 == 0 && !this.I0.f8471e) {
            z15 = true;
        } else {
            z15 = false;
        }
        c0(this.G0, z15, z10);
        c0(this.H0, this.I0.f8471e, z10);
        if (this.A0.j()) {
            f7 = this.A0.getFilledProgress();
        } else {
            f7 = 0.0f;
        }
        this.O0.e(f7, z10);
        boolean z18 = this.I0.f8471e;
        f4 f4Var = this.f7912n1;
        if (z18) {
            f4Var.u();
        } else {
            f4Var.e(true);
        }
        h(this.a2, z10);
        if (this.O1 == -1 && this.f7888f0 == 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        AndroidUtilities.updateViewShow(this.S0, z16);
        if (this.O1 == -1 && this.f7888f0 == 0) {
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
        this.f7911n0.setTranslationX(0.0f);
        float alpha5 = this.f7911n0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        v vVar = this.I0.f8468a;
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
        kb0 kb0Var = this.f7948y;
        if (kb0Var != null) {
            kb0Var.a(!z10);
        }
        this.A2 = z10;
    }

    public final void o0(boolean z10) {
        int i10;
        xi0 xi0Var = this.f7895h1;
        if (xi0Var != null) {
            int[] iArr = xi0Var.f32584e;
            int i11 = 0;
            if (z10) {
                o8 o8Var = this.K1;
                if (o8Var != null && o8Var.f7818y0) {
                    i11 = iArr[0];
                }
                xi0Var.N(i11);
                xi0 xi0Var2 = this.f7895h1;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                    return;
                }
                return;
            }
            o8 o8Var2 = this.K1;
            if (o8Var2 != null && o8Var2.f7818y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            xi0Var.L(i10, false, true);
            this.f7895h1.N(i10);
            ImageView imageView = this.f7898i1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f7933t2 < 0) {
            this.f7933t2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f7936u2 = arrayList;
            arrayList.add("off");
            this.f7936u2.add("auto");
            this.f7936u2.add("on");
            float f7 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            y2 y2Var = this.f7927s;
            y2Var.f8488o = f7;
            y2Var.f8487n = y2.f(f7);
            y2Var.g();
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            y2 y2Var2 = this.f7927s;
            y2Var2.f8489p = f10;
            y2Var2.i();
        }
    }

    public final void p0() {
        if (this.W1) {
            return;
        }
        this.W1 = true;
        ka kaVar = new ka(this, 2);
        rb rbVar = this.f7938v1;
        o8 o8Var = this.K1;
        if (rbVar != null && o8Var != null) {
            o8Var.f();
            boolean u02 = rbVar.u0();
            boolean z10 = rbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new na(this, rbVar, o8Var.f7788i0, o8Var.f7790j0, o8Var, z10, u02, kaVar, 1));
            return;
        }
        kaVar.run();
    }

    public final void q(boolean z10) {
        dc dcVar;
        if (this.d) {
            ia iaVar = this.f7920q0;
            if (iaVar != null) {
                iaVar.dismiss();
                this.f7920q0 = null;
            }
            o8 o8Var = this.K1;
            long j3 = 0;
            if (o8Var != null && !o8Var.h) {
                if ((this.v && o8Var.f7784g) || o8Var.f7771b != 0) {
                    o8Var.f7789j = false;
                }
                o8Var.i(false);
            }
            this.K1 = null;
            Utilities.Callback4 callback4 = this.R;
            if (callback4 != null && (dcVar = this.X0) != null) {
                if (this.f7883e) {
                    return;
                }
                this.f7883e = true;
                g71 g71Var = dcVar.f7129y;
                if (g71Var != null) {
                    g71Var.B();
                    dcVar.f7129y.H();
                    dcVar.f7129y = null;
                }
                g71 g71Var2 = dcVar.f7127x;
                if (g71Var2 != null) {
                    j3 = g71Var2.n();
                    dcVar.f7127x.B();
                    dcVar.f7127x.H();
                    dcVar.f7127x = null;
                }
                g71 g71Var3 = dcVar.f7103e;
                if (g71Var3 != null) {
                    j3 = g71Var3.n();
                    dcVar.f7103e.B();
                    dcVar.f7103e.H();
                    dcVar.f7103e = null;
                }
                callback4.run(Long.valueOf(j3), new ua(this, z10, 2), Boolean.valueOf(this.v), Long.valueOf(this.f7940w));
                return;
            }
            dc dcVar2 = this.X0;
            if (dcVar2 != null && !z10) {
                dcVar2.set(null);
            }
            g(0.0f, z10, new ka(this, 23));
            int i10 = this.J;
            if (i10 == 1 || i10 == 0) {
                this.f7910n.setBackgroundColor(0);
                this.f7874b1.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f7876c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        sb sbVar;
        if ((this.P1 || this.Q1) && (sbVar = this.B0) != null && sbVar.isFrontface()) {
            int i10 = this.f7933t2;
            if (i10 == 2 || (i10 == 1 && this.f7879c2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z10;
        Activity activity = this.f7872b;
        if (this.B0 == null && activity != null) {
            this.B0 = new sb(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            l7 l7Var = this.O0;
            float f7 = 0.0f;
            if (l7Var != null) {
                l7Var.f7573g0 = 0.0f;
                l7Var.f7574h0.d(0.0f, true);
            }
            this.B0.recordHevc = !this.A0.j();
            this.B0.setThumbDrawable(A());
            this.B0.initTexture();
            this.B0.setDelegate(new ta(this, 0));
            bd bdVar = this.F0;
            if (this.B0.f7068a && this.f7888f0 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0(bdVar, z10, true);
            z zVar = this.G0;
            if (!this.B0.f7068a) {
                f7 = AndroidUtilities.dp(46.0f);
            }
            zVar.setTranslationX(f7);
            this.A0.setCameraView(this.B0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.W0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!d1.q(this.B0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", d1.p(ApplicationLoader.applicationContext, false))) && this.B0.f7068a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.l1.u();
            }
            if (this.C0 == null) {
                this.C0 = new h7(activity, new la(this, 3));
            }
            this.C0.a(this.B0);
            w7 w7Var = this.D0;
            if (w7Var != null) {
                cc ccVar = this.A0;
                Object blurRenderNode = ccVar.getBlurRenderNode();
                w7Var.F = ccVar;
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
                u61 textureView = this.X0.getTextureView();
                int orientation = this.X0.getOrientation();
                o8 o8Var2 = this.K1;
                if (o8Var2 != null) {
                    savedFilterState = o8Var2.f7770a1;
                }
                jf0 jf0Var = new jf0(this.f7872b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f7924r0, this.f7869a);
                this.B1 = jf0Var;
                this.f7923r.addView(jf0Var);
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
                    this.f7894h0.addView(blurControl);
                }
                af0 curveControl = this.B1.getCurveControl();
                this.F1 = curveControl;
                if (curveControl != null) {
                    this.f7894h0.addView(curveControl);
                }
                V();
                this.B1.getDoneTextView().setOnClickListener(new ma(this, 13));
                this.B1.getCancelTextView().setOnClickListener(new ma(this, 14));
                this.B1.getToolsView().setVisibility(8);
                this.B1.getToolsView().setAlpha(0.0f);
                this.B1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.B1.f27507i0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.M0 != null) {
            cc ccVar = this.A0;
            if (ccVar != null && ccVar.j()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.M0.P) {
                return;
            }
        }
        if (this.f7872b == null) {
            return;
        }
        if (this.M0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f7909m2;
        boolean z13 = !z10;
        cc ccVar2 = this.A0;
        if (ccVar2 != null && ccVar2.j()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ob obVar = new ob(this, this.f7876c, this.f7872b, this.f7869a, albumEntry, z10, z13, z11);
        this.M0 = obVar;
        obVar.G.setVisibility(8);
        this.M0.setMultipleOnClick(this.A0.j());
        this.M0.setMaxCount(Math.min(10, t.b() - this.A0.getFilledCount()));
        this.M0.setOnBackClickListener(new db(this, 1));
        this.M0.setOnSelectListener(new cb(z10, this, 0));
        this.M0.setOnSelectMultipleListener(new zh.x0(this, 2));
        s4.b0 b0Var = this.f7907l2;
        if (b0Var != null) {
            g3 g3Var = this.M0.f8397e;
            g3Var.B = b0Var;
            g3Var.l0();
        }
        this.f7910n.addView(this.M0, w7.x5.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: di.pc.u():void");
    }

    public final void v(boolean z10) {
        h7 h7Var = this.C0;
        if (h7Var != null) {
            h7Var.f7353f = null;
            Utilities.globalQueue.cancelRunnable(h7Var.h);
            this.C0 = null;
            cc ccVar = this.A0;
            if (ccVar != null) {
                ccVar.f7151c.b(null);
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
            cc ccVar2 = this.A0;
            if (ccVar2 != null) {
                ccVar2.setCameraView(null);
            }
            this.B0 = null;
        }
    }

    public final void w() {
        ob obVar = this.M0;
        if (obVar == null) {
            return;
        }
        this.f7910n.removeView(obVar);
        this.M0 = null;
        ValueAnimator valueAnimator = this.f7913n2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7913n2 = null;
        }
        o1.k kVar = this.f7916o2;
        if (kVar != null) {
            kVar.c();
            this.f7916o2 = null;
        }
        this.f7919p2 = null;
    }

    public final void y() {
        jf0 jf0Var = this.B1;
        if (jf0Var == null) {
            return;
        }
        jf0Var.e();
        this.C1.setFilterView(null);
        this.f7923r.removeView(this.B1);
        TextureView textureView = this.D1;
        if (textureView != null) {
            this.f7894h0.removeView(textureView);
            this.D1 = null;
        }
        this.X0.o(null, null);
        ye0 ye0Var = this.E1;
        if (ye0Var != null) {
            this.f7894h0.removeView(ye0Var);
            this.E1 = null;
        }
        af0 af0Var = this.F1;
        if (af0Var != null) {
            this.f7894h0.removeView(af0Var);
            this.F1 = null;
        }
        this.B1 = null;
    }

    public final void z() {
        rb rbVar = this.f7938v1;
        if (rbVar != null) {
            rbVar.R0.removeAllViews();
            rb rbVar2 = this.f7938v1;
            rbVar2.O0.h();
            rbVar2.R0.setVisibility(8);
            rbVar2.Q0.setVisibility(8);
            rbVar2.E0.postRunnable(new ah.j(8));
            z5 z5Var = rbVar2.f8001k2;
            if (z5Var != null) {
                z5Var.dismiss();
            }
            qg.x xVar = rbVar2.T1;
            if (xVar != null) {
                xVar.dismiss();
            }
            this.f7923r.removeView(this.f7938v1);
            this.f7938v1 = null;
            qg.c1 c1Var = this.f7942w1;
            if (c1Var != null) {
                this.f7894h0.removeView(c1Var);
                this.f7942w1 = null;
            }
            View view = this.f7950y1;
            if (view != null) {
                this.f7894h0.removeView(view);
                this.f7950y1 = null;
            }
            View view2 = this.f7946x1;
            if (view2 != null) {
                this.f7894h0.removeView(view2);
                this.f7946x1 = null;
            }
            View view3 = this.f7953z1;
            if (view3 != null) {
                this.f7894h0.removeView(view3);
                this.f7953z1 = null;
            }
            View view4 = this.A1;
            if (view4 != null) {
                this.f7894h0.removeView(view4);
                this.A1 = null;
            }
        }
    }
}
