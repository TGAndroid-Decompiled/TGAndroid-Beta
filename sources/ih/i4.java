package ih;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.oa;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nu0;
import org.telegram.ui.pr;
import org.telegram.ui.py;
import org.telegram.ui.qn;
public abstract class i4 extends xu0 implements NotificationCenter.NotificationCenterDelegate {
    public a7 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public kh.x3 B0;
    public boolean B1;
    public b3 B2;
    public final ig.a B3;
    public kh.x3 C0;
    public boolean C1;
    public boolean C2;
    public final ng.a C3;
    public kh.x3 D0;
    public long D1;
    public float D2;
    public final ng.d D3;
    public int E0;
    public final float E1;
    public u2 E2;
    public final lg.b E3;
    public final m9 F0;
    public int F1;
    public f50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final p3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final h2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final h4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final g4 K1;
    public final org.telegram.ui.Components.y5 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final a3 L0;
    public final com.google.firebase.messaging.m L1;
    public final org.telegram.ui.Components.y5 L2;
    public final x1 L3;
    public org.telegram.ui.Components.i6 M0;
    public c4 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.i6 N0;
    public boolean N1;
    public long N2;
    public final x1 N3;
    public org.telegram.ui.Components.y5 O0;
    public v6 O1;
    public boolean O2;
    public final ArrayList O3;
    public org.telegram.ui.Components.y5 P0;
    public boolean P1;
    public boolean P2;
    public final ArrayList P3;
    public boolean Q0;
    public boolean Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public final androidx.activity.i R3;
    public long S0;
    public a3 S1;
    public s30 S2;
    public final org.telegram.ui.Components.y5 S3;
    public long T0;
    public a T1;
    public final nu0 T2;
    public final org.telegram.ui.Components.y5 T3;
    public boolean U0;
    public s1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.y5 U3;
    public boolean V0;
    public t1 V1;
    public x2 V2;
    public float V3;
    public boolean W0;
    public p1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public p2 X1;
    public bg.t X2;
    public boolean X3;
    public final l3 Y0;
    public rg.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public kh.x3 Z1;
    public r2 Z2;
    public float Z3;
    public final z2 f11532a1;
    public ValueAnimator a2;
    public float a3;
    public final ImageReceiver f11533b1;
    public uj0 f11534b2;
    public boolean f11535b3;
    public final ImageReceiver f11536c1;
    public LinearLayout f11537c2;
    public boolean f11538c3;
    public final ArrayList f11539d1;
    public TextView f11540d2;
    public boolean f11541d3;
    public Runnable f11542e1;
    public TextView f11543e2;
    public boolean f11544e3;
    public final g3 f11545f1;
    public k8 f11546f2;
    public boolean f11547f3;
    public final py f11548g1;
    public ViewPropertyAnimator f11549g2;
    public boolean f11550g3;
    public l4 f11551h1;
    public final kg.d f11552h2;
    public final ImageReceiver f11553h3;
    public float f11554i1;
    public final kg.d f11555i2;
    public hg.d f11556i3;
    public final org.telegram.ui.Components.z8 f11557j1;
    public final Paint f11558j2;
    public final ImageReceiver f11559j3;
    public final e4 f11560k1;
    public int f11561k2;
    public org.telegram.ui.Components.k5 f11562k3;
    public final l8 l1;
    public ValueAnimator f11563l2;
    public boolean f11564l3;
    public t5.l f11565m1;
    public float f11566m2;
    public boolean f11567m3;
    public int f11568n1;
    public float f11569n2;
    public uj0 f11570n3;
    public org.telegram.ui.ActionBar.g1 f11571o1;
    public float f11572o2;
    public boolean f11573o3;
    public b4 f11574p1;
    public int f11575p2;
    public float f11576p3;
    public TL_stories.PeerStories f11577q1;
    public boolean f11578q2;
    public boolean f11579q3;
    public final ArrayList f11580r1;
    public boolean f11581r2;
    public float f11582r3;
    public final ImageView f11583s0;
    public final ArrayList f11584s1;
    public boolean f11585s2;
    public int f11586s3;
    public final ImageView f11587t0;
    public final f4 f11588t1;
    public boolean f11589t2;
    public int f11590t3;
    public final dh.g f11591u0;
    public final ff.p0 f11592u1;
    public int f11593u2;
    public int f11594u3;
    public final pi0 f11595v0;
    public ArrayList f11596v1;
    public final int f11597v2;
    public x1 f11598v3;
    public final ImageView f11599w0;
    public int f11600w1;
    public TextView f11601w2;
    public float f11602w3;
    public final org.telegram.ui.ActionBar.b6 f11603x0;
    public long f11604x1;
    public eh.b f11605x2;
    public boolean f11606x3;
    public final r8 f11607y0;
    public boolean f11608y1;
    public int f11609y2;
    public pr f11610y3;
    public final a3 f11611z0;
    public boolean f11612z1;
    public int f11613z2;
    public org.telegram.ui.ActionBar.g1 f11614z3;

    public i4(Context context, final m9 m9Var, f4 f4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null);
        this.X0 = true;
        this.f11539d1 = new ArrayList();
        this.f11568n1 = -5;
        this.E1 = 1.0f;
        g4 g4Var = new g4(this);
        this.K1 = g4Var;
        this.f11566m2 = -1.0f;
        this.f11569n2 = -1.0f;
        this.f11572o2 = -1.0f;
        this.f11597v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.y5(this);
        this.L2 = new org.telegram.ui.Components.y5(this);
        nu0 nu0Var = new nu0();
        this.T2 = nu0Var;
        this.a3 = 1.0f;
        this.L3 = new x1(this, 4);
        this.N3 = new x1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new androidx.activity.i(this, 24);
        this.S3 = new org.telegram.ui.Components.y5(this);
        this.T3 = new org.telegram.ui.Components.y5(this);
        this.U3 = new org.telegram.ui.Components.y5(this);
        this.W3 = new Path();
        nu0Var.E = new xa.c(this, 19);
        ?? obj = new Object();
        obj.f11505g = new ArrayList();
        this.I2 = obj;
        this.J2 = new AnimationNotificationsLocker();
        this.f11580r1 = new ArrayList();
        this.f11584s1 = new ArrayList();
        z2 z2Var = new z2(this, 0);
        this.f11532a1 = z2Var;
        z2Var.setCrossfadeWithOldImage(false);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.ignoreNotifications = true;
        z2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11553h3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f11559j3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f11533b1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f11536c1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        z2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f11557j1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.F0 = m9Var;
        this.f11588t1 = f4Var;
        this.L1 = f4Var.f11418g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        f4Var.f11422l.setColor(-16777216);
        this.f11558j2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f11603x0 = b6Var;
        setClipChildren(false);
        g3 g3Var = new g3(this, context, this.Y0, b6Var, m9Var);
        this.f11545f1 = g3Var;
        lg.b bVar = new lg.b(b6Var, org.telegram.ui.ActionBar.f6.Sd, 0.8f);
        this.E3 = bVar;
        ng.c cVar = new ng.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            ng.d dVar = new ng.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        } else {
            this.D3 = null;
            this.C3 = cVar;
        }
        pg.i iVar = new pg.i(this);
        ig.a aVar = new ig.a(this.C3);
        aVar.d = iVar;
        aVar.f11131e = this;
        this.B3 = aVar;
        this.f11552h2 = aVar.c(this, bVar, false);
        kg.d c10 = aVar.c(this, bVar, false);
        this.f11555i2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        l3 l3Var = new l3(this, context, f4Var, m9Var);
        this.Y0 = l3Var;
        l3Var.setClipChildren(false);
        this.f11548g1 = new py(this.f11609y2, l3Var);
        l3Var.addView(g3Var, g7.e6.c(-1.0f, -1));
        p3 p3Var = new p3(this, getContext(), m9Var.f11834y, m9Var, b6Var);
        this.G0 = p3Var;
        p3Var.U.setOnClickListener(new z1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(f4Var.f11423m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new z1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        g7.g6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(f4Var.f11424n);
        imageView2.setPadding(dp, dp, dp, dp);
        a3 a3Var = new a3(this, getContext(), 1);
        this.L0 = a3Var;
        org.telegram.ui.Components.i6 i6Var = this.N0;
        if (i6Var != null) {
            i6Var.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new z1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.f11611z0 = a3Var2;
        org.telegram.ui.Components.i6 i6Var2 = this.M0;
        if (i6Var2 != null) {
            i6Var2.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new z1(this, 13));
        a3Var2.setOnLongClickListener(new g2(0, this, m9Var));
        a7 a7Var = new a7(context, f4Var);
        this.A0 = a7Var;
        a7Var.setPadding(dp, dp, dp, dp);
        a3Var2.addView(this.A0, g7.e6.e(40, 40, 3));
        a3Var.addView(imageView2, g7.e6.e(40, 40, 3));
        g7.g6.b(a3Var2, 0.3f, 5.0f);
        g7.g6.b(a3Var, 0.3f, 5.0f);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.setParentView(l3Var);
        ff.p0 p0Var = new ff.p0(10);
        this.f11592u1 = p0Var;
        l3Var.setOutlineProvider(p0Var);
        l3Var.setClipToOutline(true);
        addView(l3Var);
        e4 e4Var = new e4(context, g4Var);
        this.f11560k1 = e4Var;
        e4Var.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f12226b;

            {
                this.f12226b = this;
            }

            @Override
            public final void onClick(View view) {
                int i9;
                switch (r3) {
                    case 0:
                        i4 i4Var = this.f12226b;
                        long j10 = UserConfig.getInstance(i4Var.f11609y2).clientUserId;
                        long j11 = i4Var.f11604x1;
                        m9 m9Var2 = m9Var;
                        if (j10 == j11) {
                            Bundle h = aa.d.h(1, "type");
                            h.putLong("dialog_id", i4Var.f11604x1);
                            m9Var2.H(new k90(h, null));
                            return;
                        } else if (j11 > 0) {
                            m9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            m9Var2.H(qn.R9(j11));
                            return;
                        }
                    default:
                        i4 i4Var2 = this.f12226b;
                        if (i4Var2.K1.j()) {
                            m9Var.O();
                            if (!m9.f11782z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            dh.g gVar = i4Var2.f11591u0;
                            if (!m9.f11782z1) {
                                i9 = R.string.Mute;
                            } else {
                                i9 = R.string.Unmute;
                            }
                            gVar.setContentDescription(LocaleController.getString(i9));
                            return;
                        }
                        i4Var2.c1(true);
                        return;
                }
            }
        });
        l3Var.addView(e4Var, g7.e6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.K0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, g7.e6.q(40, 40, 5));
        linearLayout.addView(a3Var, g7.e6.q(40, 40, 5));
        linearLayout.addView(a3Var2, g7.e6.q(40, 40, 5));
        addView(linearLayout, g7.e6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f11583s0 = imageView3;
        imageView3.setImageDrawable(f4Var.f11427q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        l3Var.addView(imageView3, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f11587t0 = imageView4;
        imageView4.setImageDrawable(f4Var.f11428r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        l3Var.addView(imageView4, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new androidx.mediarouter.app.c(m9Var, 20));
        imageView3.setOnClickListener(new d0(this, b6Var, m9Var, context, f4Var, 1));
        dh.g gVar = new dh.g(context, 1);
        this.f11591u0 = gVar;
        l3Var.addView(gVar, g7.e6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f11595v0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        gVar.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f11599w0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(f4Var.f11430t);
        gVar.addView(imageView6);
        imageView6.setVisibility(8);
        r8 r8Var = new r8(context);
        this.f11607y0 = r8Var;
        r8Var.setOnClickListener(new z1(this, 2));
        l3Var.addView(r8Var, g7.e6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        gVar.setOnClickListener(new View.OnClickListener(this) {
            public final i4 f12226b;

            {
                this.f12226b = this;
            }

            @Override
            public final void onClick(View view) {
                int i9;
                switch (r3) {
                    case 0:
                        i4 i4Var = this.f12226b;
                        long j10 = UserConfig.getInstance(i4Var.f11609y2).clientUserId;
                        long j11 = i4Var.f11604x1;
                        m9 m9Var2 = m9Var;
                        if (j10 == j11) {
                            Bundle h = aa.d.h(1, "type");
                            h.putLong("dialog_id", i4Var.f11604x1);
                            m9Var2.H(new k90(h, null));
                            return;
                        } else if (j11 > 0) {
                            m9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            m9Var2.H(qn.R9(j11));
                            return;
                        }
                    default:
                        i4 i4Var2 = this.f12226b;
                        if (i4Var2.K1.j()) {
                            m9Var.O();
                            if (!m9.f11782z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            dh.g gVar2 = i4Var2.f11591u0;
                            if (!m9.f11782z1) {
                                i9 = R.string.Mute;
                            } else {
                                i9 = R.string.Unmute;
                            }
                            gVar2.setContentDescription(LocaleController.getString(i9));
                            return;
                        }
                        i4Var2.c1(true);
                        return;
                }
            }
        });
        this.l1 = new l8(this, f4Var);
        l3Var.addView(p3Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        h2 h2Var = new h2(this, context, m9Var, m9Var.v, view, frameLayout, m9Var);
        this.H0 = h2Var;
        l3Var.addView(view, g7.e6.e(-1, 200, 87));
        l3Var.addView(h2Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        l3Var.addView(frameLayout, g7.e6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        gVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        x9 x9Var = p3Var.S;
        View o6 = x9Var.o(context);
        if (o6 != null) {
            AndroidUtilities.removeFromParent(o6);
            addView(o6);
        }
        x9Var.D = new i2(this, 0);
        x9Var.T(this);
    }

    public static void V0(u6 u6Var, ImageReceiver imageReceiver, String str) {
        if (u6Var.f12198s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(u6Var.f12195f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(u6Var.f12194e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(i4 i4Var, ValueAnimator valueAnimator) {
        float f10;
        r8 r8Var = i4Var.f11607y0;
        i4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e4 e4Var = i4Var.f11560k1;
        e4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        e4Var.setAlpha(1.0f - i4Var.Z3);
        ImageView imageView = i4Var.f11583s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        imageView.setAlpha(1.0f - i4Var.Z3);
        ImageView imageView2 = i4Var.f11587t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        imageView2.setAlpha(1.0f - i4Var.Z3);
        dh.g gVar = i4Var.f11591u0;
        gVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
        gVar.setAlpha((1.0f - i4Var.Z3) * i4Var.a3);
        a3 a3Var = i4Var.S1;
        if (a3Var != null) {
            a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * i4Var.Z3);
            i4Var.S1.setAlpha(1.0f - i4Var.Z3);
        }
        if (r8Var != null) {
            r8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var.Z3);
            r8Var.setAlpha(1.0f - i4Var.Z3);
        }
        i4Var.G0.setAlpha(1.0f - i4Var.Z3);
        c4 c4Var = i4Var.M1;
        if (c4Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((d9) c4Var).d.R;
        }
        float hideInterfaceAlpha = i4Var.getHideInterfaceAlpha();
        a3 a3Var2 = i4Var.f11611z0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = i4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = i4Var.L0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - i4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        p2 p2Var = i4Var.X1;
        if (p2Var != null) {
            p2Var.setAlpha(1.0f - i4Var.Z3);
            i4Var.invalidate();
        }
        i4Var.Y0.invalidate();
    }

    public static void a0(i4 i4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = i4Var.f11614z3;
        if (g1Var != null && i4Var.f11610y3 != null && g1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(m9.f11780x1 - 0.2f) < 0.05f) {
                    i4Var.f11614z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(m9.f11780x1 - 0.5f) < 0.05f) {
                    i4Var.f11614z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(m9.f11780x1 - 1.0f) < 0.05f) {
                    i4Var.f11614z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(m9.f11780x1 - 1.5f) < 0.05f) {
                    i4Var.f11614z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(m9.f11780x1 - 2.0f) < 0.05f) {
                    i4Var.f11614z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var2 = i4Var.f11614z3;
                    int i9 = R.string.VideoSpeedCustom;
                    g1Var2.setSubtext(LocaleController.formatString(i9, vc.a(m9.f11780x1) + "x"));
                }
            }
            i4Var.f11610y3.a(m9.f11780x1, z10);
        }
    }

    public static void b0(i4 i4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!i4Var.I0() && !i4Var.K1.f11470f) {
            if (UserConfig.getInstance(i4Var.f11609y2).isPremium()) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, i4Var.f11603x0).setOnClickListener(new z1(i4Var, 8));
                return;
            }
            Drawable drawable = i4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            j2 j2Var = new j2(i4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, i4Var.f11603x0);
            c10.setOnClickListener(new z1(i4Var, 9));
            c10.setIcon(j2Var);
        }
    }

    public static void d0(i4 i4Var) {
        g4 g4Var = i4Var.K1;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if ((storyItem == null && g4Var.f11467b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = g4Var.h();
        boolean z10 = g4Var.f11469e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), i4Var.getContext(), z10 ? 1 : 0, null, null, new gh.p6(1, i4Var, z10));
            return;
        }
        i4Var.a1();
    }

    public static void e0(i4 i4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i4Var.f11609y2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new gh.i(i4Var, MessagesController.getInstance(i4Var.f11609y2), j10, !z10, str, user), 200L);
    }

    public static void f0(i4 i4Var) {
        int i9;
        int i10;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i4Var.getContext(), 0, i4Var.f11603x0);
        if (i4Var.I0()) {
            i9 = R.string.DeleteBotPreviewTitle;
        } else {
            i9 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
        if (i4Var.I0()) {
            i10 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i10 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new u1(i4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i3.i(7));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        ((d9) i4Var.M1).h(c2Var);
        c2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.f11609y2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.K2.f34854c;
        o5 o5Var = this.F0.f11830w;
        if (o5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = o5Var.f11894f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        m9 m9Var;
        if (!this.K1.f11470f || (m9Var = this.F0) == null || m9Var.f11831w0 == null || D0(true)) {
            return 0L;
        }
        return m9Var.f11831w0.j();
    }

    public static void h0(i4 i4Var) {
        String str;
        gc J;
        org.telegram.ui.ActionBar.b6 b6Var = i4Var.f11603x0;
        l3 l3Var = i4Var.Y0;
        if (i4Var.C1) {
            return;
        }
        if (i4Var.A1) {
            if (i4Var.F3 != null && i4Var.G3 != null) {
                zf.j0.C1(new bg.i1(i4Var, 3), i4Var.F3, i4Var.G3, i4Var.f11604x1, true);
                return;
            }
            m9 m9Var = i4Var.F0;
            if (m9Var != null) {
                m9Var.f11801g1 = true;
                m9Var.P();
            }
            MessagesController.getInstance(i4Var.f11609y2).getBoostsController().getBoostsStats(i4Var.f11604x1, new hg.i(i4Var, 1));
            return;
        }
        p2 p2Var = i4Var.X1;
        int i9 = -i4Var.f11568n1;
        i4Var.f11568n1 = i9;
        AndroidUtilities.shakeViewSpring(p2Var, i9);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (i4Var.f11604x1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(i4Var.f11609y2).getUser(Long.valueOf(i4Var.f11604x1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(i4Var.f11609y2).premiumFeaturesBlocked()) {
            J = new oc(l3Var, b6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new oc(l3Var, b6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new x1(i4Var, 5));
        }
        J.j();
    }

    public static void j0(i4 i4Var) {
        g4 g4Var = i4Var.K1;
        if (g4Var.f11466a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f22622id = g4Var.f11466a.f22617id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(i4Var.f11609y2).getInputPeer(i4Var.f11604x1);
        ConnectionsManager.getInstance(i4Var.f11609y2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        bg.t tVar = new bg.t(getContext(), 2);
        this.X2 = tVar;
        tVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, g7.e6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        a3 a3Var = new a3(this, getContext(), 0);
        this.S1 = a3Var;
        a3Var.setClickable(true);
        addView(this.S1, g7.e6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        b3 b3Var = new b3(this, getContext());
        this.B2 = b3Var;
        b3Var.setOnClickListener(new z1(this, 0));
        this.S1.addView(this.B2, g7.e6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        eh.b bVar = new eh.b(1, getContext(), false);
        this.f11605x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.f11605x2, g7.e6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f11601w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f11601w2.setTextColor(-1);
        this.S1.addView(this.f11601w2, g7.e6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f11588t1.f11429s);
        b3 b3Var2 = this.B2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.W2 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f11603x0;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        TextView textView2 = new TextView(getContext());
        g7.g6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i10 = org.telegram.ui.ActionBar.f6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new z1(this, 3));
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        linearLayout.addView(textView2, g7.e6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, g7.e6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Y0.addView(frameLayout);
        this.W2 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        f1 f1Var;
        TLRPC.Peer i9;
        f1 f1Var2;
        long clientUserId = UserConfig.getInstance(this.f11609y2).getClientUserId();
        long j10 = this.f11604x1;
        m9 m9Var = this.F0;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0 && (f1Var2 = m9Var.f11831w0) != null) {
            if (z10) {
                TLRPC.Peer i11 = f1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-this.f11604x1));
                if (m9Var.f11831w0.l() || ChatObject.canManageCalls(chat)) {
                    if (i11 == null || this.f11604x1 == DialogObject.getPeerDialogId(i11) || DialogObject.getPeerDialogId(i11) == UserConfig.getInstance(this.f11609y2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i10 >= 0 && m9Var != null && (f1Var = m9Var.f11831w0) != null && f1Var.l()) {
            if (!z10 || (i9 = m9Var.f11831w0.i()) == null || this.f11604x1 == DialogObject.getPeerDialogId(i9) || DialogObject.getPeerDialogId(i9) == clientUserId || this.f11604x1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i9, int i10) {
        TextureView textureView;
        h4 h4Var = this.I2;
        c5.c cVar = h4Var.d;
        if (cVar != null && h4Var.f11502c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(h4Var.f11502c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (cVar != null && (textureView = h4Var.f11503e) != null) {
            Bitmap bitmap = textureView.getBitmap(i9, i10);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            l3 l3Var = this.Y0;
            canvas.scale(i9 / l3Var.getMeasuredWidth(), i10 / l3Var.getMeasuredHeight());
            this.f11532a1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(kh.r9 r9Var, TL_stories.StoryItem storyItem) {
        int i9;
        View[] viewPages;
        c4 c4Var = this.M1;
        Context context = getContext();
        if (storyItem.pinned) {
            i9 = Integer.MAX_VALUE;
        } else {
            i9 = storyItem.expire_date - storyItem.date;
        }
        kh.t9 t9Var = new kh.t9(context, i9, this.f11603x0);
        t9Var.q1(r9Var);
        kh.j1 j1Var = t9Var.f16097b;
        if (j1Var != null) {
            for (View view : j1Var.getViewPages()) {
                if (view instanceof kh.n9) {
                    ((kh.n9) view).e(false);
                }
            }
        }
        t9Var.k1(true);
        t9Var.P = new b5.d(29, this, storyItem);
        ((d9) c4Var).h(t9Var);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        l3 l3Var = this.Y0;
        float x11 = view.getX() + l3Var.getX() + x10;
        float y10 = view.getY() + l3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        n6 n6Var;
        m9 m9Var = this.F0;
        if (m9Var != null && (n6Var = m9Var.K0) != null && n6Var.f11848e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.f11609y2).getUser(Long.valueOf(this.F0.K0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(hg.r0 r0Var) {
        boolean z10;
        boolean z11;
        int i9;
        TLRPC.Reaction reaction;
        g4 g4Var = this.K1;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && r0Var == null) {
            l0();
            this.O1.g0(this.f11604x1, g4Var.f11466a, null);
        } else if (r0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f11609y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f11564l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = hg.n0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f11553h3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.f11567m3 = true;
                this.O1.g0(this.f11604x1, g4Var.f11466a, hg.r0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.f11604x1, g4Var.f11466a, r0Var);
        }
        TL_stories.StoryItem storyItem2 = g4Var.f11466a;
        a3 a3Var = this.f11611z0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.A0.setReaction(hg.r0.d(reaction));
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.A0.setReaction(null);
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.f11612z1 && z10) {
            TL_stories.StoryItem storyItem3 = g4Var.f11466a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = g4Var.f11466a.views;
            int i10 = storyViews.reactions_count;
            if (z11) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            int i11 = i10 + i9;
            storyViews.reactions_count = i11;
            if (i11 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = g4Var.f11466a;
        hg.t0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        f1 f1Var;
        boolean z10;
        if (this.K3 == null) {
            m9 m9Var = this.F0;
            if (m9Var != null && (f1Var = m9Var.f11831w0) != null) {
                TLRPC.GroupCall groupCall = f1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.f11609y2).getSendAsPeers(this.f11604x1, true);
            this.K3 = sendAsPeers;
            p2 p2Var = this.X1;
            if (p2Var != null && sendAsPeers != null) {
                p2Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        p2 p2Var = this.X1;
        if (p2Var == null) {
            return false;
        }
        boolean z10 = p2Var.f26189u2;
        if (z10) {
            p2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new x1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        bg.i iVar;
        int i9;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.X1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.f11609y2).getClientUserId();
        TLRPC.Peer i10 = this.F0.f11831w0.i();
        if (i10 != null) {
            clientUserId = DialogObject.getPeerDialogId(i10);
        }
        Context context = getContext();
        final int i11 = this.f11609y2;
        String shortName = DialogObject.getShortName(i11, this.f11604x1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.H3;
        bg.i iVar2 = new bg.i(this, 18);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i11).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j12;
            iVar = iVar2;
            i9 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j12;
            iVar = iVar2;
            i9 = 0;
        }
        if (j10 <= 0) {
            j11 = 100;
        } else {
            j11 = j10;
        }
        int max = (int) Math.max(messageMinPrice, j11);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            int i12 = length * 7;
            int i13 = iArr[i12];
            int[] iArr2 = iArr;
            int i14 = iArr2[i12 + 2];
            if (i9 <= iArr2[i12 + 3] && charSequence.length() <= i14) {
                max = Math.max(max, i13);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        final long[] jArr = {max};
        final eq[] eqVarArr = new eq[1];
        final kh.d dVar = new kh.d(context, null, true);
        final ?? obj = new Object();
        obj.f12176c = clientUserId;
        obj.f12178f = textWithEntities;
        obj.f12179g = jArr[0];
        final p0 p0Var = new p0(i11, context, true);
        LinearLayout f10 = ll.f(context, 0);
        final fh.d2 d2Var = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f10.addView(d2Var, g7.e6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final fh.d2 d2Var2 = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f10.addView(d2Var2, g7.e6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final fh.d2 d2Var3 = new fh.d2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f10.addView(d2Var3, g7.e6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final t tVar = new t(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), eqVarArr), true, true);
                long j13 = jArr2[0];
                u0 u0Var = obj;
                u0Var.f12179g = j13;
                p0Var.set(u0Var);
                int intValue2 = num.intValue();
                int i15 = i11;
                int b10 = u.b(i15, intValue2, 0);
                int b11 = u.b(i15, num.intValue(), 1);
                int b12 = u.b(i15, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.j6) d2Var.f6412b).c(formatString, true, true);
                ((org.telegram.ui.Components.j6) d2Var2.f6412b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.j6) d2Var3.f6412b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = u.b(i15, num.intValue(), 3);
                int b14 = u.b(i15, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                tVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        p0Var.set(obj);
        int i15 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i16 = MessagesController.getInstance(i11).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i17] >= messageMinPrice) {
                if (i17 > 0 && arrayList.isEmpty() && iArr4[i17] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i18 = iArr4[i17];
                if (i18 > i16) {
                    arrayList.add(Integer.valueOf(i16));
                    break;
                }
                arrayList.add(Integer.valueOf(i18));
                if (iArr4[i17] == i16) {
                    break;
                }
            }
            i17++;
            iArr3 = iArr4;
            i15 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) j3.r0.j(1, arrayList)).intValue() < i16) {
            arrayList.add(Integer.valueOf(i16));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            iArr5[i19] = ((Integer) arrayList.get(i19)).intValue();
        }
        tVar.f8166a0 = iArr5;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, g7.e6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f10, g7.e6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i20 = org.telegram.ui.ActionBar.f6.f23108j5;
        TextView b10 = g7.i6.b(context, 20.0f, i20, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, g7.e6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = g7.i6.b(context, 14.0f, i20, false, bVar);
        b11.setGravity(17);
        ll.q(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, g7.e6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(p0Var, g7.e6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, g7.e6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new fg.f(iVar, jArr, f3Var, 9));
    }

    public final void P0() {
        if (this.X1 == null) {
            return;
        }
        t0();
        this.E2.f30114f0.e0();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 21 || i9 == 22) {
            this.X1.O();
        }
        this.E2.J1(-1, true);
        u2 u2Var = this.E2;
        u2Var.V = this.f11604x1;
        u2Var.r1();
        this.E2.m1().setText(this.X1.getFieldText());
        ((d9) this.M1).h(this.E2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.f11604x1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.f11609y2).getDialog(this.f11604x1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.F0.H(new qn(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.S0(android.net.Uri):void");
    }

    public final void T0(long j10, boolean z10) {
        int i9;
        int i10;
        if (this.G1 != z10) {
            this.G1 = z10;
            pi0 pi0Var = this.f11595v0;
            int i11 = 0;
            if (z10) {
                if (this.F0.f11783a && Build.VERSION.SDK_INT < 33) {
                    m9 m9Var = ((d9) this.M1).d;
                    m9Var.f11803h1 = true;
                    m9Var.P();
                    androidx.activity.i iVar = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j10);
                g1();
                pi0Var.setAnimation(this.f11588t1.f11431u);
                this.G1 = true;
                this.f11560k1.f11354a.getImageReceiver().setVisible(true, true);
                g4 g4Var = this.K1;
                if (g4Var.f11466a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.f11604x1 + " storyId=" + g4Var.f11466a.f22617id + " " + g4.c(g4Var));
                }
            } else {
                p0();
                pi0Var.a();
                this.f11551h1 = null;
                this.H2 = false;
                this.K2.d(0.0f, true);
                this.Y0.invalidate();
                invalidate();
                q0();
                m9 m9Var2 = ((d9) this.M1).d;
                m9Var2.E0 = false;
                m9Var2.P();
            }
            if (this.G1) {
                i9 = 3;
            } else {
                i9 = 2;
            }
            this.f11532a1.setFileLoadingPriority(i9);
            if (this.G1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f11533b1.setFileLoadingPriority(i10);
            if (this.G1) {
                i11 = 2;
            }
            this.f11536c1.setFileLoadingPriority(i11);
            if (this.f11608y1 || this.f11612z1) {
                v6 v6Var = this.O1;
                long j11 = this.f11604x1;
                boolean z11 = this.G1;
                a0.h hVar = v6Var.f12246m;
                v9 v9Var = (v9) hVar.f(j11);
                if (v9Var == null) {
                    v9Var = new v9(v6Var.f12236a, j11, v6Var);
                    hVar.k(v9Var, j11);
                }
                v9Var.b(z11);
            }
        }
    }

    public final void U0(int i9, long j10) {
        if (this.f11604x1 != j10) {
            g4 g4Var = this.K1;
            g4Var.f11467b = null;
            g4Var.f11466a = null;
        }
        this.f11604x1 = j10;
        this.f11596v1 = null;
        o0(i9);
        TL_stories.PeerStories peerStories = this.F0.M0;
        boolean z10 = true;
        if (peerStories != null) {
            this.O1.S(peerStories, true);
            return;
        }
        v6 v6Var = this.O1;
        TL_stories.PeerStories y10 = v6Var.y(j10);
        if (y10 == null) {
            y10 = v6Var.z(j10);
        } else {
            z10 = false;
        }
        v6Var.S(y10, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        e4 e4Var = this.f11560k1;
        if (j10 >= 0) {
            if (this.f11608y1 && !z11) {
                e4Var.f11355b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                e4Var.f11355b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.f11609y2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                fq fqVar = new fq(mutate, null);
                fqVar.f28550w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                fqVar.h = dp;
                fqVar.f28547n = dp2;
                e4Var.f11355b.i(fqVar);
            } else {
                e4Var.f11355b.i(null);
            }
            if (user != null) {
                e4Var.f11355b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), e4Var.f11355b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            e4Var.f11355b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-j10));
        dg.c cVar = e4Var.f11355b;
        dg.c cVar2 = e4Var.f11355b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        cVar.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            fq fqVar2 = new fq(mutate2, null);
            fqVar2.f28550w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            fqVar2.h = dp3;
            fqVar2.f28547n = dp4;
            cVar2.i(fqVar2);
            return;
        }
        cVar2.i(null);
    }

    public final void X0(float f10, float f11, l4 l4Var) {
        this.f11554i1 = f10;
        this.f11602w3 = 1.0f / f11;
        if (this.f11551h1 != l4Var) {
            this.f11551h1 = l4Var;
            if (l4Var != null) {
                ImageReceiver imageReceiver = l4Var.f11706a;
                if (imageReceiver.getBitmap() != null) {
                    this.f11532a1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        g4 g4Var = this.K1;
        if (g4Var.f11466a != null) {
            m9 m9Var = this.F0;
            if (m9Var.f11797f != null) {
                String e10 = g4Var.e();
                if (z10) {
                    n2 n2Var = new n2(2, this.f11603x0);
                    if (this.f11612z1) {
                        chat = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-this.f11604x1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.f11609y2).storiesEnabled() && ((!this.f11612z1 && !UserObject.isService(this.f11604x1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x2 x2Var = new x2(this, m9Var.f11797f.getContext(), e10, e10, z11, n2Var);
                    this.V2 = x2Var;
                    x2Var.f32248e0 = true;
                    TL_stories.StoryItem storyItem = g4Var.f11466a;
                    storyItem.dialogId = this.f11604x1;
                    x2Var.B0 = storyItem;
                    x2Var.f32259o0 = new fa.c(this, 22);
                    ((d9) this.M1).h(x2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e10);
                LaunchActivity.C1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        l3 l3Var = this.Y0;
        org.telegram.ui.ActionBar.b6 b6Var = this.f11603x0;
        ll.p(R.string.UnsupportedAttachment, new oc(l3Var, b6Var), b6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f11603x0);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.P = string;
        ((d9) this.M1).h(c2Var);
    }

    public final void b1(boolean z10) {
        if (this.f11573o3 != z10) {
            g4 g4Var = this.K1;
            if (g4Var.f11466a != null) {
                this.f11573o3 = z10;
                if (z10) {
                    this.f11570n3.setVisibility(0);
                }
                this.f11570n3.setStoryItem(g4Var.f11466a);
                m9 m9Var = ((d9) this.M1).d;
                m9Var.l1 = z10;
                m9Var.P();
                float f10 = 0.0f;
                if (z10) {
                    float f11 = this.f11576p3;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f11570n3.setTransitionProgress(this.f11576p3);
                    ofFloat.addUpdateListener(new y1(this, 1));
                    ofFloat.addListener(new k2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(gr.f28845g);
                    ofFloat.start();
                    return;
                }
                if (this.f11570n3.getReactionsWindow() != null) {
                    this.f11570n3.getReactionsWindow().e();
                }
                this.f11570n3.animate().alpha(0.0f).setDuration(150L).setListener(new l2(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i9;
        if (this.C0 == null) {
            kh.x3 x3Var = new kh.x3(getContext(), 1);
            x3Var.m(1.0f, -56.0f);
            this.C0 = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, g7.e6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        kh.x3 x3Var2 = this.C0;
        if (z10) {
            i9 = R.string.StoryNoSound;
        } else {
            i9 = R.string.StoryTapToSound;
        }
        x3Var2.t(LocaleController.getString(i9));
        this.C0.v();
    }

    public final boolean d1(boolean z10) {
        if (this.F0.N0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.F1 < getStoriesCount() - 1) {
                this.F1++;
                f1(false);
                return true;
            }
        } else {
            int i9 = this.F1;
            if (i9 > 0) {
                this.F1 = i9 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        float f10;
        f1 f1Var;
        boolean z10;
        int i11 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        m9 m9Var = this.F0;
        boolean z11 = false;
        if (i9 != i11 && (i9 != NotificationCenter.storiesListUpdated || m9Var.K0 != objArr[0])) {
            if (i9 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i9 == NotificationCenter.emojiLoaded) {
                this.G0.U.invalidate();
                return;
            } else if (i9 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i9 == NotificationCenter.storiesLimitUpdate) {
                p6 o6 = MessagesController.getInstance(this.f11609y2).getStoriesController().o();
                if (o6 != null && o6.a(this.f11609y2, 1) && this.M1 != null) {
                    bg.i1 i1Var = new bg.i1(this, 3);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.C1;
                    }
                    ((d9) this.M1).h(new zf.j0(o6.b(), this.f11609y2, findActivity, i1Var, null));
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f11609y2).isUserContactBlocked(this.f11604x1);
                if (this.f11604x1 >= 0 && !UserConfig.getInstance(this.f11609y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.B1 != z10 || this.D1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.B1 = z10;
                    this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    f1(false);
                    r0(true);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f11604x1 == (-((TLRPC.ChatFull) obj).f22381id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (m9Var != null && (f1Var = m9Var.f11831w0) != null && f1Var.g() == longValue) {
                    f1(false);
                    p2 p2Var = this.X1;
                    if (p2Var != null) {
                        p2Var.J(true);
                        this.X1.P1(true);
                        r0(true);
                    }
                    h2 h2Var = this.H0;
                    if (h2Var != null) {
                        f1 f1Var2 = h2Var.L;
                        if (f1Var2 != null) {
                            j10 = f1Var2.j();
                        }
                        if (h2Var.D != j10) {
                            h2Var.f12278e.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            } else {
                return;
            }
        }
        c4 c4Var = this.M1;
        if (c4Var == null || !((d9) c4Var).d.D0) {
            if (this.G1) {
                j1();
                if (this.f11600w1 == 0) {
                    if (!this.A2) {
                        this.A2 = true;
                        ((d9) this.M1).j();
                        return;
                    }
                    return;
                }
                int i12 = this.F1;
                ArrayList arrayList = this.f11580r1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f11584s1;
                if (i12 >= arrayList2.size() + size) {
                    this.F1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.f11608y1 || this.f11612z1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = m9Var.M0;
            if (peerStories != null) {
                this.O1.S(peerStories, true);
            } else {
                long j11 = this.f11604x1;
                if (j11 != 0) {
                    v6 v6Var = this.O1;
                    TL_stories.PeerStories y10 = v6Var.y(j11);
                    if (y10 == null) {
                        y10 = v6Var.z(j11);
                        z11 = true;
                    }
                    v6Var.S(y10, z11);
                }
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f11571o1;
            if (g1Var != null) {
                ViewPropertyAnimator animate = g1Var.animate();
                if (this.O1.K(this.f11604x1) && this.K1.f11469e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                animate.alpha(f10).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ae aeVar;
        Canvas canvas2;
        org.telegram.ui.Components.i6 i6Var;
        org.telegram.ui.Components.i6 i6Var2;
        l1();
        if (this.f11612z1 && (i6Var2 = this.M0) != null) {
            i6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.f11612z1 && (i6Var = this.N0) != null) {
            i6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f11579q3;
        LinearLayout linearLayout = this.K0;
        a3 a3Var = this.f11611z0;
        if (z10) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f11586s3, measuredWidth - f10, gr.f28845g.getInterpolation(this.f11582r3));
            float lerp2 = AndroidUtilities.lerp(this.f11590t3, measuredHeight - f10, this.f11582r3);
            int lerp3 = AndroidUtilities.lerp(this.f11594u3, dp, this.f11582r3);
            if (this.f11564l3) {
                org.telegram.ui.Components.k5 k5Var = this.f11562k3;
                if (k5Var != null) {
                    float f11 = lerp3;
                    k5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f11), (int) (lerp2 + f11));
                    this.f11562k3.draw(canvas);
                }
            } else {
                float f12 = lerp3;
                ImageReceiver imageReceiver = this.f11559j3;
                imageReceiver.setImageCoords(lerp, lerp2, f12, f12);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f11567m3) {
            float measuredWidth2 = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f11564l3) {
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.f11553h3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.f11567m3 = false;
                }
            } else {
                hg.d dVar = this.f11556i3;
                if (dVar != null) {
                    float f17 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f17), (int) (measuredHeight2 - f17), (int) (measuredWidth2 + f17), (int) (measuredHeight2 + f17));
                    this.f11556i3.b(canvas);
                    if (this.f11556i3.c()) {
                        this.f11556i3.d(this);
                        this.f11556i3 = null;
                        this.f11567m3 = false;
                    }
                } else {
                    this.f11567m3 = false;
                }
            }
        }
        p2 p2Var = this.X1;
        if (p2Var != null) {
            ce ceVar = p2Var.f26183t1;
            ae aeVar2 = p2Var.f26188u1;
            if (p2Var.getAlpha() != 0.0f && (aeVar = p2Var.f26077a1) != null && aeVar.getParent() != null && p2Var.f26077a1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(p2Var.f26077a1.getX() + ceVar.getX() + aeVar2.getX() + p2Var.getX(), p2Var.f26077a1.getY() + ceVar.getY() + aeVar2.getY() + p2Var.getY());
                if (p2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), (int) (p2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                p2Var.f26077a1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        uj0 uj0Var;
        uj0 uj0Var2;
        ng.d dVar;
        float dp;
        float f10;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        p2 p2Var = this.X1;
        Paint paint = this.f11558j2;
        a3 a3Var = this.f11611z0;
        f4 f4Var = this.f11588t1;
        if (view == p2Var) {
            float f11 = this.f11566m2;
            g4 g4Var = this.K1;
            if (f11 > 0.0f && !g4Var.f11470f) {
                f4Var.f11422l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), f4Var.f11422l);
            }
            RectF rectF = f4Var.h;
            RectF rectF2 = f4Var.f11419i;
            RectF rectF3 = f4Var.f11420j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!g4Var.f11470f) {
                if (this.O2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.f11612z1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + a3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                p1 p1Var = this.W1;
                if (p1Var != null && p1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.f11566m2) * dp);
            if (this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f10 = ((1.0f - this.f11566m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.X1.getEditField().setTranslationY(e2.c.z(1.0f, this.f11566m2, -AndroidUtilities.dp(2.0f), f10));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, f4Var.h, this.f11566m2, rectF3);
            kg.d dVar2 = this.f11552h2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.Z3) * (1.0f - this.f11569n2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f11566m2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (p2Var != null && p2Var.t0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = f4Var.f11421k;
            RectF rectF5 = f4Var.f11421k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.W3;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            kg.d dVar3 = this.f11555i2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.q(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f11534b2 && this.X1 != null) {
                view.setTranslationY(((this.X1.getY() + this.X1.getAnimatedTop()) + (-uj0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f11570n3) {
                    view.setTranslationY((this.K0.getY() + (a3Var.getY() + (-(uj0Var2.getMeasuredHeight() - this.f11570n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    l3 l3Var = this.Y0;
                    if (view == l3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.f18606n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(l3Var.getX(), l3Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.f11609y2).storiesEnabled()) {
            return;
        }
        File h = this.K1.h();
        if (h != null && h.exists()) {
            x2 x2Var = this.V2;
            if (x2Var != null) {
                x2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new x1(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f11596v1;
    }

    public long getCurrentPeer() {
        return this.f11604x1;
    }

    public int getListPosition() {
        return this.H1;
    }

    public Bitmap getPlayingBitmap() {
        l3 l3Var = this.Y0;
        Bitmap createBitmap = Bitmap.createBitmap(l3Var.getWidth(), l3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.F1;
    }

    public v6 getStoriesController() {
        return MessagesController.getInstance(this.f11609y2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.f11613z2, this.f11580r1.size()) + this.f11584s1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f11580r1;
    }

    public final void h1() {
        int i9;
        if (this.C1) {
            TextView textView = this.f11540d2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f11543e2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f11540d2;
        if (textView3 != null) {
            if (this.A1) {
                i9 = R.string.StoryGroupRepliesLocked;
            } else {
                i9 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i9));
        }
        TextView textView4 = this.f11543e2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f11543e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i9;
        ArrayList arrayList = this.f11596v1;
        m9 m9Var = this.F0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f11584s1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i9 = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j10 = ((u6) arrayList2.get(i10)).f12191a;
                    if (((int) (j10 ^ (j10 >>> 32))) == m9Var.L0) {
                        this.F1 = i10;
                        return;
                    }
                }
            } else {
                i9 = 0;
            }
            int indexOf = this.f11596v1.indexOf(Integer.valueOf(m9Var.L0));
            if (indexOf < 0 && !this.f11596v1.isEmpty()) {
                if (m9Var.L0 > ((Integer) this.f11596v1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (m9Var.L0 < ((Integer) j3.r0.j(1, this.f11596v1)).intValue()) {
                    indexOf = this.f11596v1.size() - 1;
                }
            }
            this.F1 = i9 + indexOf;
        } else {
            int i11 = m9Var.f11785a1.get(this.f11604x1, -1);
            this.F1 = i11;
            if (i11 == -1 && !m9Var.J0 && (peerStories = this.f11577q1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f11580r1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i12)).f22617id > this.f11577q1.max_read_id) {
                        this.F1 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        if (this.F1 == -1) {
            this.F1 = 0;
        }
    }

    public final void j1() {
        n6 n6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f11580r1;
        arrayList.clear();
        m9 m9Var = this.F0;
        if (m9Var.J0) {
            if (!m9Var.O0) {
                arrayList.add(m9Var.P0);
            }
        } else {
            ArrayList arrayList2 = this.f11596v1;
            int i9 = 0;
            ArrayList arrayList3 = this.f11584s1;
            if (arrayList2 != null && (n6Var = m9Var.K0) != null) {
                if (n6Var instanceof f6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.f11609y2).getStoriesController().E(this.f11604x1);
                    String str = ((f6) m9Var.K0).E;
                    if (E != null) {
                        for (int i10 = 0; i10 < E.size(); i10++) {
                            u6 u6Var = (u6) E.get(i10);
                            kh.a8 a8Var = u6Var.f12193c;
                            if (a8Var != null && !a8Var.f14917g && TextUtils.equals(a8Var.K0, str)) {
                                arrayList3.add(u6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f11596v1;
                int size = arrayList4.size();
                while (i9 < size) {
                    Object obj = arrayList4.get(i9);
                    i9++;
                    MessageObject f10 = m9Var.K0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (m9Var.K0 != null) {
                while (i9 < m9Var.K0.f11851i.size()) {
                    arrayList.add(((MessageObject) m9Var.K0.f11851i.get(i9)).storyItem);
                    i9++;
                }
            } else {
                TL_stories.PeerStories peerStories = m9Var.M0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.f11604x1) {
                    this.f11577q1 = m9Var.M0;
                } else {
                    TL_stories.PeerStories y10 = this.O1.y(this.f11604x1);
                    this.f11577q1 = y10;
                    if (y10 == null) {
                        this.f11577q1 = this.O1.z(this.f11604x1);
                    }
                }
                this.f11613z2 = 0;
                TL_stories.PeerStories peerStories2 = this.f11577q1;
                if (peerStories2 != null) {
                    this.f11613z2 = peerStories2.stories.size();
                    arrayList.addAll(this.f11577q1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.O1.E(this.f11604x1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.f11600w1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        i4 currentPeerView;
        f50 f50Var = this.F2;
        if (f50Var != null) {
            f50Var.T = null;
            f50Var.d(false);
        }
        long j10 = this.f11604x1;
        TL_stories.StoryItem storyItem = this.K1.f11466a;
        m9 m9Var = this.F0;
        m9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            m9.A1.remove(j10 + (j10 >> 16) + (storyItem.f22617id << 16));
        }
        this.f11544e3 = true;
        c9 c9Var = m9Var.f11806j0;
        if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            gc I = new oc(this.Y0, this.f11603x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new x1(this, 2));
            I.f28745r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.f11609y2).ensureMessagesLoaded(this.f11604x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        boolean z11;
        int i11;
        boolean z12;
        g4 g4Var = this.K1;
        TL_stories.StoryItem storyItem = g4Var.f11466a;
        if (storyItem == null) {
            storyItem = g4Var.f11468c;
        }
        boolean z13 = this.f11612z1;
        if (z13 || this.f11608y1) {
            if (storyItem != null) {
                m9 m9Var = this.F0;
                a3 a3Var = this.f11611z0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.i6 i6Var = this.N0;
                    if (i6Var != null && (i11 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i11);
                        if (z10 && this.R0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        i6Var.q(num, z12, true);
                        this.R0 = true;
                    } else {
                        this.R0 = false;
                    }
                    int i12 = storyItem.views.reactions_count;
                    if (i12 > 0) {
                        org.telegram.ui.Components.i6 i6Var2 = this.M0;
                        String num2 = Integer.toString(i12);
                        if (z10 && this.Q0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i6Var2.q(num2, z11, true);
                        this.Q0 = true;
                    } else {
                        this.Q0 = false;
                    }
                    float f13 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.y5 y5Var = this.O0;
                        if (this.Q0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        y5Var.d(f11, true);
                        org.telegram.ui.Components.y5 y5Var2 = this.P0;
                        if (y5Var2 != null) {
                            if (this.R0) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            y5Var2.d(f12, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-this.f11604x1));
                    if ((!this.A1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f11601w2;
                        if (m9Var.K0 == null) {
                            i10 = R.string.NobodyViews;
                        } else {
                            i10 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i10));
                        this.f11601w2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new eq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.f11601w2.setText(spannableStringBuilder);
                    } else {
                        this.f11601w2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = a3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.Q0) {
                        f10 = this.M0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f10);
                    ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + a3Var.getLayoutParams().width;
                    a3 a3Var2 = this.L0;
                    if (a3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = a3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.R0) {
                            f13 = this.N0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f13);
                        ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += a3Var2.getLayoutParams().width;
                        a3Var2.requestLayout();
                    }
                    this.S1.requestLayout();
                    a3Var.requestLayout();
                    this.f11605x2.setVisibility(8);
                    this.B2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = g4Var.f11466a;
                    g3 g3Var = this.f11545f1;
                    if (storyItem2 == null) {
                        g3Var.getClass();
                        return;
                    }
                    for (int i13 = 0; i13 < g3Var.getChildCount(); i13++) {
                        if (g3Var.getChildAt(i13) instanceof t8) {
                            ((t8) g3Var.getChildAt(i13)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i14 = 0;
                    for (int i15 = 0; i15 < storyItem.views.recent_viewers.size(); i15++) {
                        TLObject userOrChat = MessagesController.getInstance(this.f11609y2).getUserOrChat(storyItem.views.recent_viewers.get(i15).longValue());
                        if (userOrChat != null) {
                            this.f11605x2.b(i14, userOrChat, this.f11609y2);
                            i14++;
                        }
                        if (i14 >= 3) {
                            break;
                        }
                    }
                    for (int i16 = i14; i16 < 3; i16++) {
                        this.f11605x2.b(i16, null, this.f11609y2);
                    }
                    this.f11605x2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        eq eqVar = new eq(R.drawable.mini_views_likes, 0);
                        eqVar.setOverrideColor(-53704);
                        eqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(eqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        eq eqVar2 = new eq(R.drawable.mini_repost_story, 0);
                        eqVar2.setOverrideColor(-14161823);
                        eqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(eqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f11601w2.setText(spannableStringBuilder2);
                    if (i14 == 0) {
                        this.f11605x2.setVisibility(8);
                        this.f11601w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.f11605x2.setVisibility(0);
                        this.f11601w2.setTranslationX(AndroidUtilities.dp(10.0f) + e2.c.e(i14, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                } else {
                    TextView textView2 = this.f11601w2;
                    if (m9Var.K0 == null) {
                        i9 = R.string.NobodyViews;
                    } else {
                        i9 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i9));
                    this.f11601w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.f11605x2.setVisibility(8);
                    this.B2.setVisibility(8);
                }
                a3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.K0.requestLayout();
                return;
            }
            this.f11601w2.setText("");
            this.B2.setVisibility(8);
            this.f11605x2.setVisibility(8);
        }
    }

    public final void l0() {
        a7 a7Var = this.A0;
        a7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m2(0, a7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        a7 a7Var2 = new a7(getContext(), this.f11588t1);
        this.A0 = a7Var2;
        a7Var2.setPadding(dp, dp, dp, dp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f11611z0.addView(this.A0, g7.e6.e(40, 40, 3));
        this.f11567m3 = false;
    }

    public final void l1() {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        p2 p2Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i9;
        float f17;
        float f18;
        a3 a3Var;
        ImageView imageView;
        p3 p3Var;
        a3 a3Var2;
        boolean z11;
        float f19;
        uj0 uj0Var;
        float f20;
        int i10;
        float f21;
        float f22;
        float f23 = ((d9) this.M1).d.R;
        if (this.H2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.y5 y5Var = this.K2;
        y5Var.d(f10, false);
        int i11 = this.f11575p2;
        if (i11 != 0 && this.f11578q2) {
            f11 = g7.n.a(this.D2 / i11, 0.0f, 1.0f);
        } else if (this.f11581r2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.y5 y5Var2 = this.S3;
        float f24 = y5Var2.f34854c;
        org.telegram.ui.Components.y5 y5Var3 = this.T3;
        float f25 = y5Var3.f34854c;
        org.telegram.ui.Components.y5 y5Var4 = this.U3;
        float f26 = y5Var4.f34854c;
        if (this.C2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        y5Var2.d(f12, false);
        if (!this.f11544e3) {
            p2 p2Var2 = this.X1;
            if (p2Var2 != null && !TextUtils.isEmpty(p2Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            y5Var3.d(f22, false);
        }
        p2 p2Var3 = this.X1;
        if (p2Var3 != null && p2Var3.f26190u3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        y5Var4.d(f13, false);
        final p2 p2Var4 = this.X1;
        if (p2Var4 != null) {
            i4 i4Var = p2Var4.f11943n5;
            int backgroundTop = p2Var4.getBackgroundTop();
            int i12 = p2Var4.f11940k5;
            if (i12 != 0 && backgroundTop != i12) {
                int i13 = (p2Var4.O1 + i12) - backgroundTop;
                p2Var4.setAnimatedTop(i13);
                i4Var.R2 = true;
                ValueAnimator valueAnimator = i4Var.a2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    i4Var.a2.cancel();
                }
                View view = p2Var4.B1;
                if (view != null && view.getVisibility() == 0) {
                    p2Var4.B1.setTranslationY(((1.0f - p2Var4.getTopViewEnterProgress()) * p2Var4.B1.getLayoutParams().height) + p2Var4.O1);
                }
                i4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i13, 0.0f);
                i4Var.a2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                p2 p2Var5 = p2Var4;
                                p2Var5.getClass();
                                p2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                i4 i4Var2 = p2Var5.f11943n5;
                                i4Var2.R2 = true;
                                i4Var2.invalidate();
                                p2Var5.invalidate();
                                return;
                            default:
                                p2Var4.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                i4Var.a2.addListener(new ag.e(p2Var4, 13));
                i4Var.a2.setDuration(250L);
                i4Var.a2.setInterpolator(rh.m.V);
                i4Var.a2.start();
                p2Var4.f11940k5 = 0;
            }
            if (p2Var4.f26129i3) {
                float scrollY = (p2Var4.f11942m5 - p2Var4.A0.getScrollY()) + (p2Var4.f11941l5 - p2Var4.A0.getMeasuredHeight());
                ff ffVar = p2Var4.A0;
                ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(p2Var4.A0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                p2 p2Var5 = p2Var4;
                                p2Var5.getClass();
                                p2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                i4 i4Var2 = p2Var5.f11943n5;
                                i4Var2.R2 = true;
                                i4Var2.invalidate();
                                p2Var5.invalidate();
                                return;
                            default:
                                p2Var4.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = p2Var4.f11939j5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                p2Var4.f11939j5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(rh.m.V);
                ofFloat2.start();
                p2Var4.f26129i3 = false;
                i4Var.l1();
            }
            p2Var4.getMeasuredHeight();
        }
        p2 p2Var5 = this.X1;
        if (p2Var5 != null && p2Var5.s0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f11589t2;
        Paint paint = this.f11558j2;
        if (z12) {
            paint.setColor(i0.a.d(this.f11566m2, -14933463, org.telegram.ui.ActionBar.f6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.Z3) * org.telegram.messenger.l0.y(1.0f, this.f11569n2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.Z3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.R2;
        m9 m9Var = this.F0;
        if (z13 || this.V3 != m9Var.Z || y5Var.f34854c != this.M2 || this.f11572o2 != this.D2 || f11 != this.f11566m2 || f23 != this.f11569n2 || f24 != y5Var2.f34854c || z10 || f26 != y5Var4.f34854c || f25 != y5Var3.f34854c) {
            this.R2 = false;
            this.f11572o2 = this.D2;
            float f27 = y5Var.f34854c;
            float f28 = this.M2;
            l3 l3Var = this.Y0;
            if (f27 != f28) {
                l3Var.invalidate();
            }
            if (f23 != 0.0f) {
                l3Var.setLayerType(2, null);
            } else {
                l3Var.setLayerType(0, null);
            }
            this.M2 = y5Var.f34854c;
            this.f11569n2 = f23;
            this.f11566m2 = f11;
            this.V3 = m9Var.Z;
            float height = this.D2 - (getHeight() - l3Var.getBottom());
            if (this.X1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = p2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f11561k2 - (getHeight() - l3Var.getBottom());
            p2 p2Var6 = this.X1;
            if (p2Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = p2Var6.getHeightWithTopView();
                if (this.f11581r2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            p2 p2Var7 = this.X1;
            if (p2Var7 != null) {
                if (this.Z1 != null) {
                    ImageView suggestButton = p2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.Z1.n(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.Z1.setTranslationY(-((getHeight() - this.X1.getY()) + AndroidUtilities.dp(6.0f)));
                }
                mt editField = this.X1.getEditField();
                fo0 senderSelectView = this.X1.getSenderSelectView();
                if (editField != null) {
                    f21 = 1.0f;
                    f16 = 6.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f11);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f21 = 1.0f;
                    f16 = 6.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f21, f11);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f11));
                }
            } else {
                f16 = 6.0f;
            }
            if (this.f11589t2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f11589t2 && !this.f11581r2) {
                i9 = AndroidUtilities.dp(58.0f);
            } else {
                i9 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i9);
            float dp2 = (AndroidUtilities.dp(f16) * f11) + max3;
            h2 h2Var = this.H0;
            gh.f1 f1Var = h2Var.f12276c;
            h2Var.G = dp2;
            if (Math.abs(h2Var.H - max4) > 0.1f) {
                h2Var.H = max4;
                f18 = 0.8f;
                f17 = 8.0f;
                f1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - f1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!f1Var.canScrollVertically(1)) {
                    h2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 8.0f;
                f18 = 0.8f;
            }
            h2Var.setTranslationY(-h2Var.G);
            h2Var.invalidate();
            kh.d4 d4Var = m9Var.f11836z0;
            if (d4Var != null) {
                d4Var.setKeyboardOffset(max);
            }
            uj0 uj0Var2 = this.f11534b2;
            g4 g4Var = this.K1;
            if (uj0Var2 != null) {
                if (this.f11566m2 > 0.0f && (g4Var == null || !g4Var.f11470f)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                uj0Var2.setVisibility(i10);
            }
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                a3Var = this.L0;
                imageView = this.J0;
                p3Var = this.G0;
                a3Var2 = this.f11611z0;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() == 0 && childAt != this.S1 && childAt.getTag(R.id.parent_tag) == null && childAt != p3Var.S.o(getContext())) {
                    p2 p2Var8 = this.X1;
                    if (p2Var8 != null && childAt == p2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.X1.getEmojiView().getMeasuredHeight() - this.D2);
                    } else if (childAt instanceof s30) {
                        s30 s30Var = (s30) childAt;
                        View view2 = s30Var.f32345e;
                        if (view2 != null) {
                            s30Var.g(view2);
                        }
                    } else if (childAt != this.F2 && childAt != l3Var && childAt != imageView && childAt != this.K0 && childAt != a3Var && childAt != this.S2 && childAt != this.Z1 && childAt != a3Var2 && ((uj0Var = this.f11570n3) == null || uj0Var.getReactionsWindow() == null || childAt != this.f11570n3.getReactionsWindow().f10576c)) {
                        float f29 = this.f11566m2;
                        f29 = (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float dp3 = (((((-this.G2) * f30) - (AndroidUtilities.dp(7.0f) * f29)) - this.D2) - (AndroidUtilities.dp(f17) * f30)) - (AndroidUtilities.dp(20.0f) * m9Var.Z);
                        if (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) {
                            dp3 += this.D2;
                        }
                        if (this.f11589t2) {
                            f20 = (1.0f - this.f11569n2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.X2) {
                            dp3 = m9Var.Z * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.Z2) {
                            dp3 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                            f20 = this.f11566m2;
                            childAt.invalidate();
                        }
                        if (childAt == this.Y1) {
                            dp3 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                            f20 *= this.f11566m2;
                        }
                        if (childAt == this.f11534b2) {
                            float f31 = (1.0f - y5Var3.f34854c) * (1.0f - f26) * (1.0f - y5Var2.f34854c) * this.f11566m2;
                            float f32 = f20 * f31 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f32 == 0.0f) {
                                this.f11534b2.n();
                            }
                            childAt.setAlpha(f32);
                            float f33 = (f31 * 0.2f) + f18;
                            childAt.setScaleX(f33);
                            childAt.setScaleY(f33);
                        } else {
                            childAt.setTranslationY(dp3);
                            p2 p2Var9 = this.X1;
                            if (p2Var9 == null || childAt != p2Var9.J1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.S1) {
                    if (this.f11589t2) {
                        childAt.setAlpha((1.0f - this.Z3) * (1.0f - this.f11569n2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.Z3) * hideInterfaceAlpha);
                    }
                    i14++;
                }
                i14++;
            }
            float f34 = 0.0f;
            float f35 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.Z3) * f35);
            a3Var2.setAlpha((1.0f - this.Z3) * f35);
            if (a3Var != null) {
                a3Var.setAlpha((1.0f - this.Z3) * f35);
            }
            for (int i15 = 0; i15 < l3Var.getChildCount(); i15++) {
                View childAt2 = l3Var.getChildAt(i15);
                if (childAt2 != null && childAt2 != this.I0) {
                    e4 e4Var = this.f11560k1;
                    dh.g gVar = this.f11591u0;
                    if (childAt2 != e4Var && childAt2 != this.f11583s0 && childAt2 != this.f11587t0 && childAt2 != gVar && childAt2 != this.S1 && childAt2 != p3Var && childAt2 != this.f11607y0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == gVar) {
                            f19 = this.a3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == p3Var) {
                            childAt2.setAlpha((1.0f - this.Z3) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.Z3) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.X1 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!g4Var.f11470f) {
                    if (this.O2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.P2 && this.f11612z1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (a3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + a3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    p1 p1Var = this.W1;
                    if (p1Var != null && p1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f34 = dp5;
                }
                p2 p2Var10 = this.X1;
                float f36 = -AndroidUtilities.dp(10.0f);
                float f37 = -(AndroidUtilities.dp(10.0f) + dp4 + f34);
                float f38 = this.f11566m2;
                if ((this.O2 || this.A1) && !g4Var.f11470f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p2Var10.h1(f36, f37, f38, z11);
                if (this.X1.getEmojiView() != null) {
                    this.X1.getEmojiView().setAlpha(this.f11566m2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.Z3;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Y3 = ofFloat;
        ofFloat.addUpdateListener(new y1(this, 2));
        this.Y3.addListener(new k2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(gr.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.f11609y2).isFrozen()) {
            org.telegram.ui.b.b(this.f11609y2);
            return;
        }
        int i9 = SharedConfig.stealthModeSendMessageConfirm;
        if (i9 > 0 && this.f11550g3) {
            int i10 = i9 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i10;
            SharedConfig.updateStealthModeSendMessageConfirm(i10);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.f11603x0);
            c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            c2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            gh.i3 i3Var = new gh.i3(runnable, 21);
            c2Var.f22773h0 = string;
            c2Var.f22774i0 = i3Var;
            String string2 = LocaleController.getString(R.string.Cancel);
            i3.i iVar = new i3.i(6);
            c2Var.f22775j0 = string2;
            c2Var.f22776k0 = iVar;
            c2Var.show();
            return;
        }
        runnable.run();
    }

    public final void o0(int i9) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.A2 = false;
        this.R2 = true;
        this.f11606x3 = false;
        this.f11612z1 = false;
        this.A1 = false;
        long j10 = this.f11604x1;
        e4 e4Var = this.f11560k1;
        org.telegram.ui.Components.z8 z8Var = this.f11557j1;
        if (j10 >= 0) {
            if (j10 == UserConfig.getInstance(this.f11609y2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f11608y1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.f11609y2).getUser(Long.valueOf(this.f11604x1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f11609y2).isUserContactBlocked(this.f11604x1);
            if (!UserConfig.getInstance(this.f11609y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.B1 = z15;
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            z8Var.m(this.f11609y2, user);
            e4Var.f11354a.getImageReceiver().setForUserOrChat(user, z8Var);
            W0(this.f11604x1, true, false);
        } else {
            this.f11608y1 = false;
            this.f11612z1 = true;
            if (this.O1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.f11606x3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-this.f11604x1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.A1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.f11609y2).getChatFull(-this.f11604x1) == null) {
                MessagesStorage.getInstance(this.f11609y2).loadChatInfo(-this.f11604x1, true, new CountDownLatch(1), false, false);
            }
            if (this.A1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B1 = z10;
            this.D1 = MessagesController.getInstance(this.f11609y2).getSendPaidMessagesStars(this.f11604x1);
            z8Var.k(this.f11609y2, chat);
            e4Var.f11354a.getImageReceiver().setForUserOrChat(chat, z8Var);
            W0(this.f11604x1, true, false);
        }
        if (this.G1 && (this.f11608y1 || this.f11612z1)) {
            v6 v6Var = this.O1;
            long j11 = this.f11604x1;
            a0.h hVar = v6Var.f12246m;
            v9 v9Var = (v9) hVar.f(j11);
            if (v9Var == null) {
                v9Var = new v9(v6Var.f12236a, j11, v6Var);
                hVar.k(v9Var, j11);
            }
            v9Var.b(true);
        }
        j1();
        this.F1 = i9;
        if (i9 < 0) {
            this.F1 = 0;
        }
        this.S0 = 0L;
        this.U0 = false;
        this.F3 = null;
        this.G3 = null;
        boolean z16 = this.f11612z1;
        l3 l3Var = this.Y0;
        m9 m9Var = this.F0;
        int i12 = 8;
        g4 g4Var = this.K1;
        if (z16) {
            B0();
            if (this.X1 == null && (this.A1 || g4Var.f11470f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.f11609y2).getChat(Long.valueOf(-this.f11604x1));
                p2 p2Var = this.X1;
                if (g4Var.f11470f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i12 = 0;
                }
                p2Var.setVisibility(i12);
                p2 p2Var2 = this.X1;
                boolean z17 = g4Var.f11470f;
                D0(true);
                p2Var2.i1(z17);
                p2 p2Var3 = this.X1;
                if (g4Var.f11470f && !D0(true) && (this.f11581r2 || this.X1.S0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                p2Var3.o1(z13, true);
                mt editField = this.X1.getEditField();
                long j12 = this.f11604x1;
                TL_stories.StoryItem storyItem = g4Var.f11466a;
                m9Var.getClass();
                editField.setText(m9.u(j12, storyItem));
                this.X1.b1(this.f11609y2, this.f11604x1);
                this.X1.K1(chat2, null);
            }
            org.telegram.ui.Components.i6 i6Var = this.M0;
            org.telegram.ui.ActionBar.b6 b6Var = this.f11603x0;
            if (i6Var == null) {
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.M0 = i6Var2;
                a3 a3Var = this.f11611z0;
                i6Var2.setCallback(a3Var);
                this.M0.r(b6Var.N0(org.telegram.ui.ActionBar.f6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.y5(a3Var);
            }
            a3 a3Var2 = this.L0;
            if (a3Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.N0 = i6Var3;
                i6Var3.setCallback(a3Var2);
                this.N0.r(b6Var.N0(org.telegram.ui.ActionBar.f6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.y5(a3Var2);
            }
            if (i9 == -1) {
                i1();
            }
            f1(false);
            this.f11600w1 = getStoriesCount();
            l3Var.invalidate();
            invalidate();
        } else if (this.f11608y1) {
            B0();
            if (g4Var.f11470f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                p2 p2Var4 = this.X1;
                if (p2Var4 != null) {
                    p2Var4.setVisibility(8);
                }
            }
            p2 p2Var5 = this.X1;
            if (p2Var5 != null) {
                boolean z18 = g4Var.f11470f;
                D0(true);
                p2Var5.i1(z18);
                p2 p2Var6 = this.X1;
                if (g4Var.f11470f && !D0(true) && (this.f11581r2 || this.X1.S0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p2Var6.o1(z12, true);
            }
            if (i9 == -1) {
                ArrayList arrayList = this.f11596v1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(m9Var.L0));
                    if (indexOf < 0 && !this.f11596v1.isEmpty()) {
                        if (m9Var.L0 > ((Integer) this.f11596v1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (m9Var.L0 < ((Integer) j3.r0.j(1, this.f11596v1)).intValue()) {
                            indexOf = this.f11596v1.size() - 1;
                        }
                    }
                    this.F1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f11584s1.isEmpty();
                    ArrayList arrayList2 = this.f11580r1;
                    if (!isEmpty) {
                        this.F1 = arrayList2.size();
                    } else {
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i13)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i13)).f22617id > this.O1.f12240f.get(this.f11604x1)) {
                                this.F1 = i13;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            l3Var.invalidate();
            invalidate();
        } else {
            if (this.X1 == null) {
                v0();
            }
            if (this.B1 && this.f11537c2 == null) {
                z0();
            }
            if (this.f11537c2 != null) {
                if (this.B1 || this.C1) {
                    h1();
                }
                LinearLayout linearLayout = this.f11537c2;
                if ((this.B1 && !g4Var.f11470f) || this.C1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            k8 k8Var = this.f11546f2;
            if (k8Var != null) {
                k8Var.setVisibility(8);
            }
            if (i9 == -1) {
                i1();
            }
            f1(false);
            p2 p2Var7 = this.X1;
            if (p2Var7 != null) {
                if (!I0() && !UserObject.isService(this.f11604x1)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p2Var7.setVisibility(i10);
                p2 p2Var8 = this.X1;
                boolean z19 = g4Var.f11470f;
                D0(true);
                p2Var8.i1(z19);
                p2 p2Var9 = this.X1;
                if (g4Var.f11470f && !D0(true) && (this.f11581r2 || this.X1.S0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p2Var9.o1(z11, true);
                mt editField2 = this.X1.getEditField();
                long j13 = this.f11604x1;
                TL_stories.StoryItem storyItem2 = g4Var.f11466a;
                m9Var.getClass();
                editField2.setText(m9.u(j13, storyItem2));
                this.X1.b1(this.f11609y2, this.f11604x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.f11609y2).getUserFull(this.f11604x1);
                if (userFull != null) {
                    this.X1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.f11609y2).loadFullUser(MessagesController.getInstance(this.f11609y2).getUser(Long.valueOf(this.f11604x1)), this.f11597v2, false);
                }
            }
            this.f11600w1 = getStoriesCount();
            a3 a3Var3 = this.S1;
            if (a3Var3 != null) {
                a3Var3.setVisibility(8);
            }
            l3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.f11532a1.onAttachedToWindow();
        this.f11536c1.onAttachedToWindow();
        this.f11533b1.onAttachedToWindow();
        this.f11553h3.onAttachedToWindow();
        this.f11559j3.onAttachedToWindow();
        p2 p2Var = this.X1;
        if (p2Var != null) {
            p2Var.D0();
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f11539d1;
            if (i9 < arrayList.size()) {
                ((hg.i0) arrayList.get(i9)).b(true);
                i9++;
            } else {
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f11609y2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.f11532a1.onDetachedFromWindow();
        this.f11536c1.onDetachedFromWindow();
        this.f11533b1.onDetachedFromWindow();
        this.f11553h3.onDetachedFromWindow();
        this.f11559j3.onDetachedFromWindow();
        p2 p2Var = this.X1;
        if (p2Var != null) {
            p2Var.C0();
        }
        org.telegram.ui.Components.k5 k5Var = this.f11562k3;
        if (k5Var != null) {
            k5Var.o(this);
            this.f11562k3 = null;
        }
        hg.d dVar = this.f11556i3;
        if (dVar != null) {
            dVar.d(this);
            this.f11556i3 = null;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f11539d1;
            if (i9 < arrayList.size()) {
                ((hg.i0) arrayList.get(i9)).b(false);
                i9++;
            } else {
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f11609y2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f11588t1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ih.i4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f11566m2 = -1.0f;
        this.R2 = true;
        invalidate();
    }

    public final void p0() {
        p3 p3Var = this.G0;
        if (p3Var.S.y()) {
            p3Var.S.f(false);
        }
    }

    public final void q0() {
        if (this.G1) {
            ((d9) this.M1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i9;
        if (this.X1 != null && this.f11535b3 && this.W0) {
            x1 x1Var = this.L3;
            AndroidUtilities.cancelRunOnUIThread(x1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.O1.B;
            this.X1.J(true);
            boolean z11 = this.B1;
            g4 g4Var = this.K1;
            if ((z11 && !g4Var.f11470f) || this.C1) {
                this.f11550g3 = false;
                this.X1.setEnabled(false);
                this.X1.j1(" ", z10);
            } else if (this.D1 > 0) {
                this.f11550g3 = false;
                this.X1.setEnabled(true);
                this.X1.j1(oa.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
            } else {
                if (!g4Var.f11470f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f11609y2).getCurrentTime();
                    int i10 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i10) {
                        this.f11550g3 = true;
                        int currentTime2 = i10 - ConnectionsManager.getInstance(this.f11609y2).getCurrentTime();
                        int i11 = currentTime2 / 60;
                        int i12 = currentTime2 % 60;
                        int i13 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99));
                        this.X1.setEnabled(true);
                        if (((int) this.X1.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.X1.getEditField().getMeasuredWidth()) {
                            p2 p2Var = this.X1;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                            p2Var.f26100e = formatString2;
                            p2Var.f26107f = format;
                            p2Var.G1(z10);
                        } else {
                            this.X1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                        }
                        AndroidUtilities.runOnUIThread(x1Var, 1000L);
                        return;
                    }
                }
                this.f11550g3 = false;
                this.X1.setEnabled(true);
                if (g4Var.f11470f) {
                    long starsPrice = this.X1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.X1.j1(oa.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.X1.J4), z10);
                        eq eqVar = this.X1.J4[0];
                        if (eqVar != null) {
                            eqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.X1.j1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                p2 p2Var2 = this.X1;
                if (this.A1) {
                    i9 = R.string.ReplyToGroupStory;
                } else {
                    i9 = R.string.ReplyPrivately;
                }
                p2Var2.j1(LocaleController.getString(i9), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f11573o3) {
            if (this.f11570n3.getReactionsWindow() != null) {
                if (this.f11593u2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f11570n3.getReactionsWindow().f10576c);
                    return true;
                }
                this.f11570n3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        g3 g3Var = this.f11545f1;
        if (g3Var != null) {
            kh.x3 x3Var = g3Var.f12006c;
            if (x3Var != null) {
                x3Var.e(true);
                g3Var.f12006c = null;
            }
            g3Var.f12005b = null;
            g3Var.invalidate();
            g3Var.b(false);
        }
        p3 p3Var = this.G0;
        if (p3Var.S.y()) {
            p3Var.S.f(false);
            return true;
        }
        kh.x3 x3Var2 = this.B0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        kh.x3 x3Var3 = this.C0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        s30 s30Var = this.S2;
        if (s30Var != null) {
            s30Var.b(true);
        }
        b4 b4Var = this.f11574p1;
        if (b4Var != null && b4Var.f31171b) {
            b4Var.a();
            return true;
        }
        p2 p2Var = this.X1;
        if (p2Var != null && p2Var.u0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f11603x0);
            if (this.X1.Y0) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new u1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((d9) this.M1).h(alertDialog$Builder.f22702a);
            return true;
        }
        uj0 uj0Var = this.f11534b2;
        if (uj0Var != null && uj0Var.getReactionsWindow() != null && !this.f11534b2.getReactionsWindow().f10588q) {
            this.f11534b2.getReactionsWindow().d();
            return true;
        }
        p2 p2Var2 = this.X1;
        if (p2Var2 != null && p2Var2.s0()) {
            if (this.f11593u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.m0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            p2 p2Var3 = this.X1;
            if (p2Var3 != null) {
                long j10 = this.f11604x1;
                TL_stories.StoryItem storyItem = this.K1.f11466a;
                Editable editText = p2Var3.getEditText();
                this.F0.getClass();
                m9.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.X1);
            return true;
        } else if (p3Var.getVisibility() != 0 || p3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            p3Var.C();
            this.f11538c3 = false;
            this.Y0.invalidate();
            return true;
        }
    }

    public void setAccount(int i9) {
        this.f11609y2 = i9;
        this.O1 = MessagesController.getInstance(i9).storiesController;
        this.f11548g1.f41617b = i9;
        uj0 uj0Var = this.f11534b2;
        if (uj0Var != null) {
            uj0Var.setCurrentAccount(i9);
            this.f11534b2.p(null, null, true);
        }
        uj0 uj0Var2 = this.f11570n3;
        if (uj0Var2 != null) {
            uj0Var2.setCurrentAccount(i9);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(c4 c4Var) {
        this.M1 = c4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f11535b3 != z10) {
            this.f11535b3 = z10;
            if (z10) {
                this.f11532a1.setCurrentAlpha(1.0f);
                r0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.G1) {
            this.H2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X0 != z10) {
            this.X0 = z10;
            this.Y0.invalidate();
            if (this.G1 && this.F0.f11783a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                m9 m9Var = ((d9) this.M1).d;
                m9Var.f11803h1 = true;
                m9Var.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            z2 z2Var = this.f11532a1;
            if (z10) {
                z2Var.stopAnimation();
                z2Var.setAllowStartAnimation(false);
            } else {
                z2Var.startAnimation();
                z2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            u2 u2Var = new u2(this, getContext(), this.f11603x0);
            this.E2 = u2Var;
            u2Var.V1 = new v2(this);
            u2Var.f30114f0.e0();
            u2 u2Var2 = this.E2;
            u2Var2.S = true;
            u2Var2.r1();
            u2 u2Var3 = this.E2;
            u2Var3.T = new w2(this);
            u2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.E3);
            this.T1 = aVar;
            aVar.setOnClickListener(new z1(this, 1));
            addView(this.T1, g7.e6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.b6 b6Var = this.f11603x0;
        p2 p2Var = new p2(this, AndroidUtilities.findActivity(getContext()), this, new n2(1, b6Var));
        this.X1 = p2Var;
        p2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new q2(this));
        setDelegate(this.X1);
        p2 p2Var2 = this.X1;
        p2Var2.f26186t4 = false;
        p2Var2.f26191u4 = true;
        if (this.K1.f11470f) {
            p2Var2.V0(false, false, false);
        } else {
            p2Var2.V0(true, true, false);
        }
        this.X1.d();
        p2 p2Var3 = this.X1;
        p2Var3.v4 = true;
        addView(p2Var3, g7.e6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.P1(false);
        }
        this.X1.B2 = this.f11597v2;
        h4 h4Var = this.I2;
        h4Var.f11505g.add(this.Y0);
        h4Var.f11505g.add(this);
        if (this.W0) {
            this.X1.D0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        rg.g gVar = new rg.g(getContext(), b6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new u1(this, 1));
        addView(this.Y1, g7.e6.e(57, 300, 85));
        this.Y1.setVisibility(8);
        this.X1.setSideButtonsForAttach(this.Y1);
        this.E0 = getChildCount();
    }

    public final void w0() {
        if (this.f11546f2 != null) {
            return;
        }
        k8 k8Var = new k8(getContext(), this.f11603x0);
        this.f11546f2 = k8Var;
        k8Var.setOnClickListener(new z1(this, 4));
        this.f11546f2.setAlpha(0.0f);
        this.f11546f2.setVisibility(8);
        addView(this.f11546f2, g7.e6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z10;
        if (this.W1 == null && getContext() != null) {
            p1 p1Var = new p1(getContext(), this.E3);
            this.W1 = p1Var;
            p1Var.setOnClickListener(new z1(this, 5));
            p1 p1Var2 = this.W1;
            f1 f1Var = f1.S;
            boolean z11 = true;
            if (f1Var != null && f1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            p1Var2.b(z10, false);
            p1 p1Var3 = this.W1;
            f1 f1Var2 = f1.S;
            if (f1Var2 != null && !f1Var2.m()) {
                z11 = false;
            }
            p1Var3.a(z11, false);
            addView(this.W1, g7.e6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.V1 == null && getContext() != null) {
            this.U1 = new s1(getContext(), this.f11609y2);
            t1 t1Var = new t1(getContext(), this.U1, this.E3);
            this.V1 = t1Var;
            t1Var.setOnClickListener(new z1(this, 6));
            this.V1.setOnLongClickListener(new w1(this, 1));
            addView(this.V1, g7.e6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.U1, g7.e6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i9;
        if (this.f11537c2 != null) {
            return;
        }
        if (this.X1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f11537c2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f11540d2 = textView;
        textView.setTextColor(-8026747);
        this.f11540d2.setTextSize(1, 16.0f);
        TextView textView2 = this.f11540d2;
        if (this.A1) {
            i9 = R.string.StoryGroupRepliesLocked;
        } else {
            i9 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i9));
        TextView textView3 = new TextView(getContext());
        this.f11543e2 = textView3;
        textView3.setTextColor(-1);
        this.f11543e2.setTextSize(1, 12.0f);
        TextView textView4 = this.f11543e2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f11543e2.setGravity(17);
        g7.g6.a(this.f11543e2);
        this.f11543e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f11543e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f11537c2.addView(imageView, g7.e6.t(22, 22, 16, 12, 1, 4, 0));
        this.f11537c2.addView(this.f11540d2, g7.e6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f11537c2.addView(this.f11543e2, g7.e6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.f11537c2, g7.e6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
