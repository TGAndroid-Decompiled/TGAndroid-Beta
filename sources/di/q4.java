package di;

import a8.ee;
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
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
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
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cq0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.oy;
import org.telegram.ui.sr;
import org.telegram.ui.un;
public abstract class q4 extends vw0 implements NotificationCenter.NotificationCenterDelegate {
    public final m2 A0;
    public int A1;
    public boolean A2;
    public long A3;
    public final View B0;
    public int B1;
    public final p4 B2;
    public long B3;
    public final ImageView C0;
    public int C1;
    public final AnimationNotificationsLocker C2;
    public boolean C3;
    public final LinearLayout D0;
    public final o4 D1;
    public final org.telegram.ui.Components.h6 D2;
    public TLRPC.TL_channels_sendAsPeers D3;
    public final g3 E0;
    public final aa.m0 E1;
    public final org.telegram.ui.Components.h6 E2;
    public final c2 E3;
    public org.telegram.ui.Components.r6 F0;
    public j4 F1;
    public float F2;
    public int F3;
    public org.telegram.ui.Components.r6 G0;
    public boolean G1;
    public long G2;
    public final c2 G3;
    public org.telegram.ui.Components.h6 H0;
    public h7 H1;
    public boolean H2;
    public final ArrayList H3;
    public org.telegram.ui.Components.h6 I0;
    public boolean I1;
    public boolean I2;
    public final ArrayList I3;
    public boolean J0;
    public boolean J1;
    public boolean J2;
    public boolean J3;
    public boolean K0;
    public boolean K1;
    public boolean K2;
    public final a5.d K3;
    public long L0;
    public g3 L1;
    public t40 L2;
    public final org.telegram.ui.Components.h6 L3;
    public long M0;
    public a M1;
    public final cv0 M2;
    public final org.telegram.ui.Components.h6 M3;
    public boolean N0;
    public w1 N1;
    public boolean N2;
    public final org.telegram.ui.Components.h6 N3;
    public boolean O0;
    public x1 O1;
    public d3 O2;
    public float O3;
    public boolean P0;
    public t1 P1;
    public FrameLayout P2;
    public final Path P3;
    public boolean Q0;
    public u2 Q1;
    public md Q2;
    public boolean Q3;
    public final q3 R0;
    public lh.h R1;
    public boolean R2;
    public ValueAnimator R3;
    public final FrameLayout S0;
    public fi.v3 S1;
    public w2 S2;
    public float S3;
    public final f3 T0;
    public ValueAnimator T1;
    public float T2;
    public final ImageReceiver U0;
    public fl0 U1;
    public boolean U2;
    public final ImageReceiver V0;
    public LinearLayout V1;
    public boolean V2;
    public final ArrayList W0;
    public TextView W1;
    public boolean W2;
    public Runnable X0;
    public TextView X1;
    public boolean X2;
    public final m3 Y0;
    public w8 Y1;
    public boolean Y2;
    public final oy Z0;
    public ViewPropertyAnimator Z1;
    public boolean Z2;
    public v4 f8965a1;
    public final eh.d a2;
    public final ImageReceiver f8966a3;
    public float f8967b1;
    public final eh.d f8968b2;
    public bh.e f8969b3;
    public final org.telegram.ui.Components.j9 f8970c1;
    public final Paint f8971c2;
    public final ImageReceiver f8972c3;
    public final m4 f8973d1;
    public int f8974d2;
    public org.telegram.ui.Components.t5 f8975d3;
    public final x8 f8976e1;
    public ValueAnimator f8977e2;
    public boolean f8978e3;
    public k6.m f8979f1;
    public float f8980f2;
    public boolean f8981f3;
    public int f8982g1;
    public float f8983g2;
    public fl0 f8984g3;
    public org.telegram.ui.ActionBar.g1 f8985h1;
    public float f8986h2;
    public boolean f8987h3;
    public h4 f8988i1;
    public int f8989i2;
    public float f8990i3;
    public TL_stories.PeerStories f8991j1;
    public boolean f8992j2;
    public boolean f8993j3;
    public final ArrayList f8994k1;
    public boolean f8995k2;
    public float f8996k3;
    public final ImageView f8997l0;
    public final ArrayList l1;
    public boolean f8998l2;
    public int f8999l3;
    public final ImageView m0;
    public final n4 f9000m1;
    public boolean f9001m2;
    public int f9002m3;
    public final i4 f9003n0;
    public final ag.w0 f9004n1;
    public int f9005n2;
    public int f9006n3;
    public final ak0 f9007o0;
    public ArrayList f9008o1;
    public final int f9009o2;
    public c2 f9010o3;
    public final ImageView f9011p0;
    public int f9012p1;
    public TextView f9013p2;
    public float f9014p3;
    public final org.telegram.ui.ActionBar.u6 f9015q0;
    public long f9016q1;
    public v f9017q2;
    public boolean f9018q3;
    public final d9 f9019r0;
    public boolean f9020r1;
    public int f9021r2;
    public sr f9022r3;
    public final g3 f9023s0;
    public boolean f9024s1;
    public int f9025s2;
    public org.telegram.ui.ActionBar.g1 f9026s3;
    public m7 f9027t0;
    public boolean f9028t1;
    public boolean f9029t2;
    public org.telegram.ui.ActionBar.g1 f9030t3;
    public fi.v3 f9031u0;
    public boolean f9032u1;
    public h3 f9033u2;
    public final ch.b f9034u3;
    public fi.v3 f9035v0;
    public boolean f9036v1;
    public boolean f9037v2;
    public final hh.a f9038v3;
    public fi.v3 f9039w0;
    public long f9040w1;
    public float f9041w2;
    public final hh.d f9042w3;
    public int f9043x0;
    public final float f9044x1;
    public a3 f9045x2;
    public final fh.b f9046x3;
    public final y9 f9047y0;
    public int f9048y1;
    public o60 f9049y2;
    public TL_stories.TL_premium_boostsStatus y3;
    public final u3 f9050z0;
    public boolean f9051z1;
    public int f9052z2;
    public ChannelBoostsController.CanApplyBoost f9053z3;

    public q4(Context context, final y9 y9Var, n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null);
        this.Q0 = true;
        this.W0 = new ArrayList();
        this.f8982g1 = -5;
        this.f9044x1 = 1.0f;
        o4 o4Var = new o4(this);
        this.D1 = o4Var;
        this.f8980f2 = -1.0f;
        this.f8983g2 = -1.0f;
        this.f8986h2 = -1.0f;
        this.f9009o2 = ConnectionsManager.generateClassGuid();
        this.D2 = new org.telegram.ui.Components.h6(this);
        this.E2 = new org.telegram.ui.Components.h6(this);
        cv0 cv0Var = new cv0();
        this.M2 = cv0Var;
        this.T2 = 1.0f;
        this.E3 = new c2(this, 4);
        this.G3 = new c2(this, 11);
        this.H3 = new ArrayList();
        this.I3 = new ArrayList();
        this.K3 = new a5.d(this, 19);
        this.L3 = new org.telegram.ui.Components.h6(this);
        this.M3 = new org.telegram.ui.Components.h6(this);
        this.N3 = new org.telegram.ui.Components.h6(this);
        this.P3 = new Path();
        cv0Var.E = new b6.i(this, 15);
        ?? obj = new Object();
        obj.f8904g = new ArrayList();
        this.B2 = obj;
        this.C2 = new AnimationNotificationsLocker();
        this.f8994k1 = new ArrayList();
        this.l1 = new ArrayList();
        f3 f3Var = new f3(this, 0);
        this.T0 = f3Var;
        f3Var.setCrossfadeWithOldImage(false);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.ignoreNotifications = true;
        f3Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f8966a3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f8972c3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.U0 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.V0 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        f3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f8970c1 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f9047y0 = y9Var;
        this.f9000m1 = n4Var;
        this.E1 = n4Var.f8821g;
        this.H1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        n4Var.f8825l.setColor(-16777216);
        this.f8971c2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f9015q0 = u6Var;
        setClipChildren(false);
        m3 m3Var = new m3(this, context, this.R0, u6Var, y9Var);
        this.Y0 = m3Var;
        fh.b bVar = new fh.b(u6Var, org.telegram.ui.ActionBar.y6.Sd, 0.8f);
        this.f9046x3 = bVar;
        hh.c cVar = new hh.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            hh.d dVar = new hh.d(cVar);
            this.f9042w3 = dVar;
            dVar.d(AndroidUtilities.dp(8.0f));
            this.f9038v3 = dVar;
        } else {
            this.f9042w3 = null;
            this.f9038v3 = cVar;
        }
        jh.k kVar = new jh.k(this);
        ch.b bVar2 = new ch.b(this.f9038v3);
        bVar2.f6301f = kVar;
        bVar2.f6302g = this;
        this.f9034u3 = bVar2;
        this.a2 = bVar2.c(this, bVar, false);
        eh.d c10 = bVar2.c(this, bVar, false);
        this.f8968b2 = c10;
        c10.A(AndroidUtilities.dp(32.0f));
        q3 q3Var = new q3(this, context, n4Var, y9Var);
        this.R0 = q3Var;
        q3Var.setClipChildren(false);
        this.Z0 = new oy(this.f9021r2, q3Var);
        q3Var.addView(m3Var, gb1.g(-1.0f, -1));
        u3 u3Var = new u3(this, getContext(), y9Var.f9470y, y9Var, u6Var);
        this.f9050z0 = u3Var;
        u3Var.f8911b0.setOnClickListener(new e2(this, 10));
        ImageView imageView = new ImageView(context);
        this.C0 = imageView;
        imageView.setImageDrawable(n4Var.f8826m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        gb1.b(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(n4Var.f8827n);
        imageView2.setPadding(dp, dp, dp, dp);
        g3 g3Var = new g3(this, getContext(), 1);
        this.E0 = g3Var;
        org.telegram.ui.Components.r6 r6Var = this.G0;
        if (r6Var != null) {
            r6Var.setCallback(g3Var);
        }
        g3Var.setWillNotDraw(false);
        g3Var.setOnClickListener(new e2(this, 12));
        g3 g3Var2 = new g3(this, getContext(), 2);
        this.f9023s0 = g3Var2;
        org.telegram.ui.Components.r6 r6Var2 = this.F0;
        if (r6Var2 != null) {
            r6Var2.setCallback(g3Var2);
        }
        g3Var2.setWillNotDraw(false);
        g3Var2.setOnClickListener(new e2(this, 13));
        g3Var2.setOnLongClickListener(new l2(0, this, y9Var));
        m7 m7Var = new m7(context, n4Var);
        this.f9027t0 = m7Var;
        m7Var.setPadding(dp, dp, dp, dp);
        g3Var2.addView(this.f9027t0, gb1.i(40, 40, 3));
        g3Var.addView(imageView2, gb1.i(40, 40, 3));
        gb1.c(g3Var2, 0.3f, 5.0f);
        gb1.c(g3Var, 0.3f, 5.0f);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.setParentView(q3Var);
        ag.w0 w0Var = new ag.w0(10);
        this.f9004n1 = w0Var;
        q3Var.setOutlineProvider(w0Var);
        q3Var.setClipToOutline(true);
        addView(q3Var);
        m4 m4Var = new m4(context, o4Var);
        this.f8973d1 = m4Var;
        m4Var.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f9480b;

            {
                this.f9480b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q4 q4Var = this.f9480b;
                        long j10 = UserConfig.getInstance(q4Var.f9021r2).clientUserId;
                        long j11 = q4Var.f9016q1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        y9 y9Var2 = y9Var;
                        if (i11 == 0) {
                            Bundle g7 = b10.g(1, "type");
                            g7.putLong("dialog_id", q4Var.f9016q1);
                            y9Var2.H(new ta0(g7, null));
                            return;
                        } else if (j11 > 0) {
                            y9Var2.H(ProfileActivity.t4(j11));
                            return;
                        } else {
                            y9Var2.H(un.ba(j11));
                            return;
                        }
                    default:
                        q4 q4Var2 = this.f9480b;
                        if (q4Var2.D1.j()) {
                            y9Var.O();
                            if (!y9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4 i4Var = q4Var2.f9003n0;
                            if (!y9.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i4Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q4Var2.a1(true);
                        return;
                }
            }
        });
        q3Var.addView(m4Var, gb1.h(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S0 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.D0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, gb1.u(40, 40, 5));
        linearLayout.addView(g3Var, gb1.u(40, 40, 5));
        linearLayout.addView(g3Var2, gb1.u(40, 40, 5));
        addView(linearLayout, gb1.h(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f8997l0 = imageView3;
        imageView3.setImageDrawable(n4Var.f8830q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.y6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        q3Var.addView(imageView3, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.m0 = imageView4;
        imageView4.setImageDrawable(n4Var.f8831r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.y6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        q3Var.addView(imageView4, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ai.s(y9Var, 14));
        imageView3.setOnClickListener(new e0(this, u6Var, y9Var, context, n4Var, 1));
        i4 i4Var = new i4(context, 0);
        this.f9003n0 = i4Var;
        q3Var.addView(i4Var, gb1.h(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f9007o0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        i4Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f9011p0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(n4Var.f8833t);
        i4Var.addView(imageView6);
        imageView6.setVisibility(8);
        d9 d9Var = new d9(context);
        this.f9019r0 = d9Var;
        d9Var.setOnClickListener(new e2(this, 2));
        q3Var.addView(d9Var, gb1.h(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        i4Var.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f9480b;

            {
                this.f9480b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q4 q4Var = this.f9480b;
                        long j10 = UserConfig.getInstance(q4Var.f9021r2).clientUserId;
                        long j11 = q4Var.f9016q1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        y9 y9Var2 = y9Var;
                        if (i11 == 0) {
                            Bundle g7 = b10.g(1, "type");
                            g7.putLong("dialog_id", q4Var.f9016q1);
                            y9Var2.H(new ta0(g7, null));
                            return;
                        } else if (j11 > 0) {
                            y9Var2.H(ProfileActivity.t4(j11));
                            return;
                        } else {
                            y9Var2.H(un.ba(j11));
                            return;
                        }
                    default:
                        q4 q4Var2 = this.f9480b;
                        if (q4Var2.D1.j()) {
                            y9Var.O();
                            if (!y9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4 i4Var2 = q4Var2.f9003n0;
                            if (!y9.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i4Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q4Var2.a1(true);
                        return;
                }
            }
        });
        this.f8976e1 = new x8(this, n4Var);
        q3Var.addView(u3Var, gb1.h(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.B0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        m2 m2Var = new m2(this, context, y9Var, y9Var.v, view, frameLayout, y9Var);
        this.A0 = m2Var;
        q3Var.addView(view, gb1.i(-1, 200, 87));
        q3Var.addView(m2Var, gb1.h(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        q3Var.addView(frameLayout, gb1.h(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o10 = i0.a.o(-1, 100);
        i4Var.setBackground(org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.y6.j0(dp4, dp4, dp4, dp4, 0, o12, o12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.j0(dp5, dp5, dp5, dp5, 0, o13, o13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int o14 = i0.a.o(-1, 100);
        g3Var2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp6, dp6, dp6, dp6, 0, o14, o14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int o15 = i0.a.o(-1, 100);
        g3Var.setBackground(org.telegram.ui.ActionBar.y6.j0(dp7, dp7, dp7, dp7, 0, o15, o15));
        org.telegram.ui.Cells.ca caVar = u3Var.W;
        View n10 = caVar.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        caVar.D = new n2(this, 0);
        caVar.S(this);
    }

    public static void T0(g7 g7Var, ImageReceiver imageReceiver, String str) {
        if (g7Var.f8589s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(g7Var.f8586f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void X(q4 q4Var, ValueAnimator valueAnimator) {
        float f7;
        d9 d9Var = q4Var.f9019r0;
        q4Var.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m4 m4Var = q4Var.f8973d1;
        m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        m4Var.setAlpha(1.0f - q4Var.S3);
        ImageView imageView = q4Var.f8997l0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        imageView.setAlpha(1.0f - q4Var.S3);
        ImageView imageView2 = q4Var.m0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        imageView2.setAlpha(1.0f - q4Var.S3);
        i4 i4Var = q4Var.f9003n0;
        i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
        i4Var.setAlpha((1.0f - q4Var.S3) * q4Var.T2);
        g3 g3Var = q4Var.L1;
        if (g3Var != null) {
            g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var.S3);
            q4Var.L1.setAlpha(1.0f - q4Var.S3);
        }
        if (d9Var != null) {
            d9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.S3);
            d9Var.setAlpha(1.0f - q4Var.S3);
        }
        q4Var.f9050z0.setAlpha(1.0f - q4Var.S3);
        j4 j4Var = q4Var.F1;
        if (j4Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((p9) j4Var).d.V;
        }
        float hideInterfaceAlpha = q4Var.getHideInterfaceAlpha();
        g3 g3Var2 = q4Var.f9023s0;
        if (g3Var2 != null) {
            g3Var2.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = q4Var.C0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        g3 g3Var3 = q4Var.E0;
        if (g3Var3 != null) {
            g3Var3.setAlpha((1.0f - q4Var.S3) * (1.0f - f7) * hideInterfaceAlpha);
        }
        u2 u2Var = q4Var.Q1;
        if (u2Var != null) {
            u2Var.setAlpha(1.0f - q4Var.S3);
            q4Var.invalidate();
        }
        q4Var.R0.invalidate();
    }

    public static void Y(q4 q4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = q4Var.f9026s3;
        if (g1Var != null && q4Var.f9022r3 != null && g1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(y9.B1 - 0.2f) < 0.05f) {
                    q4Var.f9026s3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(y9.B1 - 0.5f) < 0.05f) {
                    q4Var.f9026s3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(y9.B1 - 1.0f) < 0.05f) {
                    q4Var.f9026s3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(y9.B1 - 1.5f) < 0.05f) {
                    q4Var.f9026s3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(y9.B1 - 2.0f) < 0.05f) {
                    q4Var.f9026s3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var2 = q4Var.f9026s3;
                    int i10 = R.string.VideoSpeedCustom;
                    g1Var2.setSubtext(LocaleController.formatString(i10, dd.a(y9.B1) + "x"));
                }
            }
            q4Var.f9022r3.a(y9.B1, z10);
        }
    }

    public static void Z(q4 q4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!q4Var.G0() && !q4Var.D1.f8874f) {
            if (UserConfig.getInstance(q4Var.f9021r2).isPremium()) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.f9015q0).setOnClickListener(new e2(q4Var, 8));
                return;
            }
            Drawable drawable = q4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            o2 o2Var = new o2(q4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.f9015q0);
            c10.setOnClickListener(new e2(q4Var, 9));
            c10.setIcon(o2Var);
        }
    }

    public static void b0(q4 q4Var) {
        o4 o4Var = q4Var.D1;
        TL_stories.StoryItem storyItem = o4Var.f8871a;
        if ((storyItem == null && o4Var.f8872b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = o4Var.h();
        boolean z10 = o4Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), q4Var.getContext(), z10 ? 1 : 0, null, null, new bi.t8(1, q4Var, z10));
            return;
        }
        q4Var.Y0();
    }

    public static void c0(q4 q4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(q4Var.f9021r2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.f9021r2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new bi.n(q4Var, MessagesController.getInstance(q4Var.f9021r2), j10, !z10, str, user), 200L);
    }

    public static void d0(q4 q4Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getContext(), 0, q4Var.f9015q0);
        if (q4Var.G0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f22368a.R = LocaleController.getString(i10);
        if (q4Var.G0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y1(q4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c2.i(16));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        ((p9) q4Var.F1).h(e2Var);
        e2Var.i();
    }

    public static void f0(q4 q4Var) {
        String str;
        qc J;
        org.telegram.ui.ActionBar.u6 u6Var = q4Var.f9015q0;
        q3 q3Var = q4Var.R0;
        if (q4Var.f9036v1) {
            return;
        }
        if (q4Var.f9028t1) {
            if (q4Var.y3 != null && q4Var.f9053z3 != null) {
                tg.j0.G1(new bi.v4(q4Var, 1), q4Var.y3, q4Var.f9053z3, q4Var.f9016q1, true);
                return;
            }
            y9 y9Var = q4Var.f9047y0;
            if (y9Var != null) {
                y9Var.f9441k1 = true;
                y9Var.P();
            }
            MessagesController.getInstance(q4Var.f9021r2).getBoostsController().getBoostsStats(q4Var.f9016q1, new f2(q4Var, 0));
            return;
        }
        u2 u2Var = q4Var.Q1;
        int i10 = -q4Var.f8982g1;
        q4Var.f8982g1 = i10;
        AndroidUtilities.shakeViewSpring(u2Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (q4Var.f9016q1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(q4Var.f9021r2).getUser(Long.valueOf(q4Var.f9016q1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(q4Var.f9021r2).premiumFeaturesBlocked()) {
            J = new wc(q3Var, u6Var).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new wc(q3Var, u6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c2(q4Var, 5));
        }
        J.j();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.f9021r2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.D2.f28811c;
        b6 b6Var = this.f9047y0.f9465w;
        if (b6Var == null) {
            f7 = 0.0f;
        } else {
            f7 = b6Var.f8429f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        y9 y9Var;
        if (!this.D1.f8874f || (y9Var = this.f9047y0) == null || y9Var.A0 == null || B0(true)) {
            return 0L;
        }
        return y9Var.A0.j();
    }

    public static void h0(q4 q4Var) {
        o4 o4Var = q4Var.D1;
        if (o4Var.f8871a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f22271id = o4Var.f8871a.f22266id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(q4Var.f9021r2).getInputPeer(q4Var.f9016q1);
        ConnectionsManager.getInstance(q4Var.f9021r2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.P2 != null) {
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
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f9015q0;
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        TextView textView2 = new TextView(getContext());
        gb1.b(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 30);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i11, 30);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView2, j02, N, h, u6Var);
        textView2.setOnClickListener(new e2(this, 3));
        linearLayout.addView(textView, gb1.r(-1, -2));
        linearLayout.addView(textView2, gb1.o(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, gb1.h(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.R0.addView(frameLayout);
        this.P2 = frameLayout;
    }

    public final boolean B0(boolean z10) {
        h1 h1Var;
        TLRPC.Peer i10;
        h1 h1Var2;
        long clientUserId = UserConfig.getInstance(this.f9021r2).getClientUserId();
        int i11 = (this.f9016q1 > 0L ? 1 : (this.f9016q1 == 0L ? 0 : -1));
        y9 y9Var = this.f9047y0;
        if (i11 < 0 && (h1Var2 = y9Var.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = h1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-this.f9016q1));
                if (y9Var.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.f9016q1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.f9021r2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && y9Var != null && (h1Var = y9Var.A0) != null && h1Var.l()) {
            if (!z10 || (i10 = y9Var.A0.i()) == null || this.f9016q1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.f9016q1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void C0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        p4 p4Var = this.B2;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) p4Var.e;
        if (m4Var != null && ((SurfaceView) p4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) p4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (m4Var != null && (textureView = (TextureView) p4Var.f8903f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            q3 q3Var = this.R0;
            canvas.scale(i10 / q3Var.getMeasuredWidth(), i11 / q3Var.getMeasuredHeight());
            this.T0.draw(canvas);
            canvas.restore();
        }
    }

    public final void D0(fi.l9 l9Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        j4 j4Var = this.F1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        fi.n9 n9Var = new fi.n9(context, i10, this.f9015q0);
        n9Var.r1(l9Var);
        fi.h1 h1Var = n9Var.f11311b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof fi.g9) {
                    ((fi.g9) view).e(false);
                }
            }
        }
        n9Var.l1(true);
        n9Var.T = new ai.f0(10, this, storyItem);
        ((p9) j4Var).h(n9Var);
    }

    public final boolean E0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.E0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean F0(MotionEvent motionEvent, View view) {
        float x9 = getX();
        q3 q3Var = this.R0;
        float x10 = view.getX() + q3Var.getX() + x9;
        float y3 = view.getY() + q3Var.getY() + getY();
        if (motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean G0() {
        z6 z6Var;
        y9 y9Var = this.f9047y0;
        if (y9Var != null && (z6Var = y9Var.O0) != null && z6Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        TLRPC.User user;
        if (!G0() || (user = MessagesController.getInstance(this.f9021r2).getUser(Long.valueOf(this.f9047y0.O0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean I0();

    public final void J0(bh.x0 x0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        o4 o4Var = this.D1;
        TL_stories.StoryItem storyItem = o4Var.f8871a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && x0Var == null) {
            j0();
            this.H1.g0(this.f9016q1, o4Var.f8871a, null);
        } else if (x0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f9021r2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f8978e3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = bh.s0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f8966a3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f8981f3 = true;
                this.H1.g0(this.f9016q1, o4Var.f8871a, bh.x0.c(tL_availableReaction));
            }
        } else {
            j0();
            this.H1.g0(this.f9016q1, o4Var.f8871a, x0Var);
        }
        TL_stories.StoryItem storyItem2 = o4Var.f8871a;
        g3 g3Var = this.f9023s0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.f9027t0.setReaction(bh.x0.d(reaction));
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.f9027t0.setReaction(null);
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.f9024s1 && z10) {
            TL_stories.StoryItem storyItem3 = o4Var.f8871a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = o4Var.f8871a.views;
            int i11 = storyViews.reactions_count;
            if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i12 = i11 + i10;
            storyViews.reactions_count = i12;
            if (i12 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = o4Var.f8871a;
        bh.a1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        i1(true);
    }

    public final void K0() {
        h1 h1Var;
        boolean z10;
        if (this.D3 == null) {
            y9 y9Var = this.f9047y0;
            if (y9Var != null && (h1Var = y9Var.A0) != null) {
                TLRPC.GroupCall groupCall = h1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.f9021r2).getSendAsPeers(this.f9016q1, true);
            this.D3 = sendAsPeers;
            u2 u2Var = this.Q1;
            if (u2Var != null && sendAsPeers != null) {
                u2Var.M1(true);
            }
        }
    }

    public final boolean L0() {
        u2 u2Var = this.Q1;
        if (u2Var == null) {
            return false;
        }
        boolean z10 = u2Var.f25992z2;
        if (z10) {
            u2Var.p1();
        }
        AndroidUtilities.runOnUIThread(new c2(this, 3), 300L);
        return z10;
    }

    public final void M0() {
        CharSequence charSequence;
        long j10;
        f2 f2Var;
        int i10;
        long j11;
        long j12;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.Q1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.f9021r2).getClientUserId();
        TLRPC.Peer i11 = this.f9047y0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        int i12 = this.f9021r2;
        String shortName = DialogObject.getShortName(i12, this.f9016q1);
        long messageMinPrice = getMessageMinPrice();
        long j13 = this.A3;
        f2 f2Var2 = new f2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, (org.telegram.ui.ActionBar.u6) bVar, false);
        k3Var.fixNavigationBar();
        k3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        k3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j13;
            f2Var = f2Var2;
            i10 = ((org.telegram.ui.Components.c6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.c6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j13;
            f2Var = f2Var2;
            i10 = 0;
        }
        if (j10 <= 0) {
            j11 = 100;
        } else {
            j11 = j10;
        }
        int max = (int) Math.max(messageMinPrice, j11);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i13 = length * 7;
                int i14 = iArr[i13];
                j12 = messageMinPrice;
                int i15 = iArr[i13 + 2];
                if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                    max = Math.max(max, i14);
                    break;
                } else {
                    length--;
                    messageMinPrice = j12;
                }
            } else {
                j12 = messageMinPrice;
                break;
            }
        }
        long[] jArr = {max};
        fi.d dVar = new fi.d(context, null, true);
        ?? obj = new Object();
        obj.f9240c = clientUserId;
        obj.f9241f = textWithEntities;
        obj.f9242g = jArr[0];
        q0 q0Var = new q0(i12, context, true);
        LinearLayout d = vh.d(context, 0);
        bh.r rVar = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        d.addView(rVar, gb1.t(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        bh.r rVar2 = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        d.addView(rVar2, gb1.t(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        bh.r rVar3 = new bh.r(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        d.addView(rVar3, gb1.t(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r6);
        f2 f2Var3 = f2Var;
        long j14 = j12;
        Utilities.Callback[] callbackArr = {new s(jArr, dVar, new zq[1], (v0) obj, q0Var, i12, rVar, rVar2, rVar3, tVar, new boolean[]{true})};
        q0Var.set(obj);
        int i16 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i18] >= j14) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j14) {
                    arrayList.add(Integer.valueOf((int) j14));
                }
                int i19 = iArr3[i18];
                if (i19 > i17) {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
                arrayList.add(Integer.valueOf(i19));
                if (iArr3[i18] == i17) {
                    break;
                }
            }
            i18++;
            iArr2 = iArr3;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) ic.a.g(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        tVar.f5798e0 = iArr4;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, gb1.o(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(d, gb1.o(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.y6.f23464j5;
        TextView L = gb1.L(context, 20.0f, i21, true, bVar);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(L, gb1.o(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView L2 = gb1.L(context, 14.0f, i21, false, bVar);
        L2.setGravity(17);
        vh.o(R.string.LiveStoryHighlightText, new Object[]{shortName}, L2);
        linearLayout.addView(L2, gb1.o(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(q0Var, gb1.x(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, gb1.o(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        k3Var.show();
        dVar.setOnClickListener(new bi.w0(f2Var3, jArr, k3Var, 3));
    }

    public final void N0() {
        if (this.Q1 == null) {
            return;
        }
        r0();
        this.f9045x2.f33033j0.f0();
        this.f9045x2.Q1(-1, true);
        a3 a3Var = this.f9045x2;
        a3Var.Z = this.f9016q1;
        a3Var.v1();
        this.f9045x2.r1().setText(this.Q1.getFieldText());
        ((p9) this.F1).h(this.f9045x2);
    }

    public final void O0() {
        Bundle bundle = new Bundle();
        long j10 = this.f9016q1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.f9021r2).getDialog(this.f9016q1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.f9047y0.H(new un(bundle));
    }

    public final void P0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.P0(long):void");
    }

    public final void Q0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.Q0(android.net.Uri):void");
    }

    public final void R0(long j10, boolean z10) {
        int i10;
        int i11;
        o4 o4Var;
        if (this.f9051z1 != z10) {
            this.f9051z1 = z10;
            ak0 ak0Var = this.f9007o0;
            int i12 = 0;
            if (z10) {
                if (this.f9047y0.f9416a && Build.VERSION.SDK_INT < 33) {
                    y9 y9Var = ((p9) this.F1).d;
                    y9Var.l1 = true;
                    y9Var.P();
                    a5.d dVar = this.K3;
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 100L);
                }
                P0(j10);
                e1();
                ak0Var.setAnimation(this.f9000m1.f8834u);
                this.f9051z1 = true;
                this.f8973d1.f8776a.getImageReceiver().setVisible(true, true);
                if (this.D1.f8871a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.f9016q1 + " storyId=" + o4Var.f8871a.f22266id + " " + o4.c(o4Var));
                }
            } else {
                n0();
                ak0Var.a();
                this.f8965a1 = null;
                this.A2 = false;
                this.D2.d(0.0f, true);
                this.R0.invalidate();
                invalidate();
                o0();
                y9 y9Var2 = ((p9) this.F1).d;
                y9Var2.I0 = false;
                y9Var2.P();
            }
            if (this.f9051z1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.T0.setFileLoadingPriority(i10);
            if (this.f9051z1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.U0.setFileLoadingPriority(i11);
            if (this.f9051z1) {
                i12 = 2;
            }
            this.V0.setFileLoadingPriority(i12);
            if (this.f9020r1 || this.f9024s1) {
                h7 h7Var = this.H1;
                long j11 = this.f9016q1;
                boolean z11 = this.f9051z1;
                a0.h hVar = h7Var.f8639m;
                ha haVar = (ha) hVar.f(j11);
                if (haVar == null) {
                    haVar = new ha(h7Var.f8630a, j11, h7Var);
                    hVar.k(haVar, j11);
                }
                haVar.b(z11);
            }
        }
    }

    public final void S0(int i10, long j10) {
        if (this.f9016q1 != j10) {
            o4 o4Var = this.D1;
            o4Var.f8872b = null;
            o4Var.f8871a = null;
        }
        this.f9016q1 = j10;
        this.f9008o1 = null;
        m0(i10);
        TL_stories.PeerStories peerStories = this.f9047y0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.H1.S(peerStories, true);
            return;
        }
        h7 h7Var = this.H1;
        TL_stories.PeerStories y3 = h7Var.y(j10);
        if (y3 == null) {
            y3 = h7Var.z(j10);
        } else {
            z10 = false;
        }
        h7Var.S(y3, z10);
    }

    public final void U0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.B3 && this.C3 == z11) {
            return;
        }
        this.B3 = j10;
        this.C3 = z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m4 m4Var = this.f8973d1;
        if (i10 >= 0) {
            if (this.f9020r1 && !z11) {
                m4Var.f8777b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                m4Var.f8777b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.f9021r2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                ar arVar = new ar(mutate, null);
                arVar.f26599w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                arVar.h = dp;
                arVar.f26596n = dp2;
                m4Var.f8777b.i(arVar);
            } else {
                m4Var.f8777b.i(null);
            }
            if (user != null) {
                m4Var.f8777b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), m4Var.f8777b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            m4Var.f8777b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-j10));
        l4 l4Var = m4Var.f8777b;
        l4 l4Var2 = m4Var.f8777b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        l4Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            ar arVar2 = new ar(mutate2, null);
            arVar2.f26599w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            arVar2.h = dp3;
            arVar2.f26596n = dp4;
            l4Var2.i(arVar2);
            return;
        }
        l4Var2.i(null);
    }

    public final void V0(float f7, float f10, v4 v4Var) {
        this.f8967b1 = f7;
        this.f9014p3 = 1.0f / f10;
        if (this.f8965a1 != v4Var) {
            this.f8965a1 = v4Var;
            if (v4Var != null) {
                ImageReceiver imageReceiver = v4Var.f9253a;
                if (imageReceiver.getBitmap() != null) {
                    this.T0.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void W0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        o4 o4Var = this.D1;
        if (o4Var.f8871a != null) {
            y9 y9Var = this.f9047y0;
            if (y9Var.f9429f != null) {
                String e = o4Var.e();
                if (z10) {
                    s2 s2Var = new s2(2, this.f9015q0);
                    if (this.f9024s1) {
                        chat = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-this.f9016q1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.f9021r2).storiesEnabled() && ((!this.f9024s1 && !UserObject.isService(this.f9016q1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d3 d3Var = new d3(this, y9Var.f9429f.getContext(), e, e, z11, s2Var);
                    this.O2 = d3Var;
                    d3Var.f30711j0 = true;
                    TL_stories.StoryItem storyItem = o4Var.f8871a;
                    storyItem.dialogId = this.f9016q1;
                    d3Var.G0 = storyItem;
                    d3Var.f30723t0 = new a4.l(this, 13);
                    ((p9) this.F1).h(d3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.I1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void X0() {
        q3 q3Var = this.R0;
        org.telegram.ui.ActionBar.u6 u6Var = this.f9015q0;
        vh.n(R.string.UnsupportedAttachment, new wc(q3Var, u6Var), u6Var);
    }

    public final void Y0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f9015q0);
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.T = string;
        ((p9) this.F1).h(e2Var);
    }

    public final void Z0(boolean z10) {
        if (this.f8987h3 != z10) {
            o4 o4Var = this.D1;
            if (o4Var.f8871a != null) {
                this.f8987h3 = z10;
                if (z10) {
                    this.f8984g3.setVisibility(0);
                }
                this.f8984g3.setStoryItem(o4Var.f8871a);
                y9 y9Var = ((p9) this.F1).d;
                y9Var.f9450p1 = z10;
                y9Var.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f8990i3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f8984g3.setTransitionProgress(this.f8990i3);
                    ofFloat.addUpdateListener(new d2(this, 1));
                    ofFloat.addListener(new p2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(ds.f27587g);
                    ofFloat.start();
                    return;
                }
                if (this.f8984g3.getReactionsWindow() != null) {
                    this.f8984g3.getReactionsWindow().e();
                }
                this.f8984g3.animate().alpha(0.0f).setDuration(150L).setListener(new q2(this, 0)).start();
            }
        }
    }

    public final void a1(boolean z10) {
        int i10;
        if (this.f9035v0 == null) {
            fi.v3 v3Var = new fi.v3(getContext(), 1);
            v3Var.l(1.0f, -56.0f);
            this.f9035v0 = v3Var;
            v3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.addView(this.f9035v0, gb1.h(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        fi.v3 v3Var2 = this.f9035v0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        v3Var2.s(LocaleController.getString(i10));
        this.f9035v0.u();
    }

    public final boolean b1(boolean z10) {
        if (this.f9047y0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.f9048y1 < getStoriesCount() - 1) {
                this.f9048y1++;
                d1(false);
                return true;
            }
        } else {
            int i10 = this.f9048y1;
            if (i10 > 0) {
                this.f9048y1 = i10 - 1;
                d1(false);
                return true;
            }
        }
        return false;
    }

    public final void c1() {
        if (!MessagesController.getInstance(this.f9021r2).storiesEnabled()) {
            return;
        }
        File h = this.D1.h();
        if (h != null && h.exists()) {
            d3 d3Var = this.O2;
            if (d3Var != null) {
                d3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c2(this, 8), 120L);
            return;
        }
        Y0();
    }

    public final void d1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.d1(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        h1 h1Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        y9 y9Var = this.f9047y0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || y9Var.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                d1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.f9050z0.f8911b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                p0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                b7 o10 = MessagesController.getInstance(this.f9021r2).getStoriesController().o();
                if (o10 != null && o10.a(this.f9021r2, 1) && this.F1 != null) {
                    bi.v4 v4Var = new bi.v4(this, 1);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.I1;
                    }
                    ((p9) this.F1).h(new tg.j0(o10.b(), this.f9021r2, findActivity, v4Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f9021r2).isUserContactBlocked(this.f9016q1);
                if (this.f9016q1 >= 0 && !UserConfig.getInstance(this.f9021r2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f9032u1 != z10 || this.f9040w1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.f9032u1 = z10;
                    this.f9040w1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    d1(false);
                    p0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f9016q1 == (-((TLRPC.ChatFull) obj).f22028id)) {
                    d1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (y9Var != null && (h1Var = y9Var.A0) != null && h1Var.g() == longValue) {
                    d1(false);
                    u2 u2Var = this.Q1;
                    if (u2Var != null) {
                        u2Var.G(true);
                        this.Q1.M1(true);
                        p0(true);
                    }
                    m2 m2Var = this.A0;
                    if (m2Var != null) {
                        h1 h1Var2 = m2Var.P;
                        if (h1Var2 != null) {
                            j10 = h1Var2.j();
                        }
                        if (m2Var.H != j10) {
                            m2Var.e.O(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                K0();
                return;
            } else {
                return;
            }
        }
        j4 j4Var = this.F1;
        if (j4Var == null || !((p9) j4Var).d.H0) {
            if (this.f9051z1) {
                h1();
                if (this.f9012p1 == 0) {
                    if (!this.f9029t2) {
                        this.f9029t2 = true;
                        ((p9) this.F1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.f9048y1;
                ArrayList arrayList = this.f8994k1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.l1;
                if (i13 >= arrayList2.size() + size) {
                    this.f9048y1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                d1(false);
                if (this.f9020r1 || this.f9024s1) {
                    i1(true);
                }
            }
            TL_stories.PeerStories peerStories = y9Var.Q0;
            if (peerStories != null) {
                this.H1.S(peerStories, true);
            } else {
                long j11 = this.f9016q1;
                if (j11 != 0) {
                    h7 h7Var = this.H1;
                    TL_stories.PeerStories y3 = h7Var.y(j11);
                    if (y3 == null) {
                        y3 = h7Var.z(j11);
                        z11 = true;
                    }
                    h7Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f8985h1;
            if (g1Var != null) {
                ViewPropertyAnimator animate = g1Var.animate();
                if (this.H1.K(this.f9016q1) && this.D1.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.r6 r6Var;
        org.telegram.ui.Components.r6 r6Var2;
        j1();
        if (this.f9024s1 && (r6Var2 = this.F0) != null) {
            r6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.f9024s1 && (r6Var = this.G0) != null) {
            r6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f8993j3;
        LinearLayout linearLayout = this.D0;
        g3 g3Var = this.f9023s0;
        if (z10) {
            float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f8999l3, measuredWidth - f7, ds.f27587g.getInterpolation(this.f8996k3));
            float lerp2 = AndroidUtilities.lerp(this.f9002m3, measuredHeight - f7, this.f8996k3);
            int lerp3 = AndroidUtilities.lerp(this.f9006n3, dp, this.f8996k3);
            if (this.f8978e3) {
                org.telegram.ui.Components.t5 t5Var = this.f8975d3;
                if (t5Var != null) {
                    float f10 = lerp3;
                    t5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f8975d3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f8972c3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f8981f3) {
            float measuredWidth2 = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f8978e3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f8966a3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f8981f3 = false;
                }
            } else {
                bh.e eVar = this.f8969b3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f8969b3.b(canvas);
                    if (this.f8969b3.c()) {
                        this.f8969b3.d(this);
                        this.f8969b3 = null;
                        this.f8981f3 = false;
                    }
                } else {
                    this.f8981f3 = false;
                }
            }
        }
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            me meVar = u2Var.f25987y1;
            ke keVar2 = u2Var.f25991z1;
            if (u2Var.getAlpha() != 0.0f && (keVar = u2Var.f25871e1) != null && keVar.getParent() != null && u2Var.f25871e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(u2Var.f25871e1.getX() + meVar.getX() + keVar2.getX() + u2Var.getX(), u2Var.f25871e1.getY() + meVar.getY() + keVar2.getY() + u2Var.getY());
                if (u2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, u2Var.getMeasuredWidth(), u2Var.getMeasuredHeight(), (int) (u2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                u2Var.f25871e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fl0 fl0Var;
        fl0 fl0Var2;
        hh.d dVar;
        float dp;
        float f7;
        if (view == this.S2) {
            canvas.save();
            canvas.clipRect(0.0f, this.S2.getY(), getMeasuredWidth(), this.S2.getY() + this.S2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        u2 u2Var = this.Q1;
        Paint paint = this.f8971c2;
        g3 g3Var = this.f9023s0;
        n4 n4Var = this.f9000m1;
        if (view == u2Var) {
            float f10 = this.f8980f2;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            o4 o4Var = this.D1;
            if (i10 > 0 && !o4Var.f8874f) {
                n4Var.f8825l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n4Var.f8825l);
            }
            RectF rectF = n4Var.h;
            RectF rectF2 = n4Var.f8822i;
            RectF rectF3 = n4Var.f8823j;
            rectF.set(this.Q1.getX(), this.Q1.getY() + this.Q1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.Q1.getX() + this.Q1.getMeasuredWidth(), this.Q1.getY() + this.Q1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!o4Var.f8874f) {
                if (this.H2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.I2 && this.f9024s1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (g3Var != null && g3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + g3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                t1 t1Var = this.P1;
                if (t1Var != null && t1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.Q1.getY() + this.Q1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.Q1.getY() + this.Q1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.Q1.setTranslationX((1.0f - this.f8980f2) * dp);
            if (this.Q1.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f8980f2) * (this.Q1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.Q1.getEditField().setTranslationY(c3.h0.z(1.0f, this.f8980f2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, n4Var.h, this.f8980f2, rectF3);
            eh.d dVar2 = this.a2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.x(dp3);
                dVar2.setAlpha((int) ((1.0f - this.S3) * (1.0f - this.f8983g2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f8980f2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (u2Var != null && u2Var.r0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = n4Var.f8824k;
            RectF rectF5 = n4Var.f8824k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.P3;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            eh.d dVar3 = this.f8968b2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.y(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.U1 && this.Q1 != null) {
                view.setTranslationY(((this.Q1.getY() + this.Q1.getAnimatedTop()) + (-fl0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f8984g3) {
                    view.setTranslationY((this.D0.getY() + (g3Var.getY() + (-(fl0Var2.getMeasuredHeight() - this.f8984g3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    q3 q3Var = this.R0;
                    if (view == q3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.f9042w3) != null && !dVar.f12843r) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.f(0.2f, -16777216, -1));
                        a2.translate(q3Var.getX(), q3Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.e1():void");
    }

    public final void f1() {
        int i10;
        if (this.f9036v1) {
            TextView textView = this.W1;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.X1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.W1;
        if (textView3 != null) {
            if (this.f9028t1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.X1;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.X1.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void g1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f9008o1;
        y9 y9Var = this.f9047y0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.l1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((g7) arrayList2.get(i11)).f8583a;
                    if (((int) (j10 ^ (j10 >>> 32))) == y9Var.P0) {
                        this.f9048y1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f9008o1.indexOf(Integer.valueOf(y9Var.P0));
            if (indexOf < 0 && !this.f9008o1.isEmpty()) {
                if (y9Var.P0 > ((Integer) this.f9008o1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (y9Var.P0 < ((Integer) ic.a.g(1, this.f9008o1)).intValue()) {
                    indexOf = this.f9008o1.size() - 1;
                }
            }
            this.f9048y1 = i10 + indexOf;
        } else {
            int i12 = y9Var.f9428e1.get(this.f9016q1, -1);
            this.f9048y1 = i12;
            if (i12 == -1 && !y9Var.N0 && (peerStories = this.f8991j1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f8994k1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f22266id > this.f8991j1.max_read_id) {
                        this.f9048y1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.f9048y1 == -1) {
            this.f9048y1 = 0;
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f9008o1;
    }

    public long getCurrentPeer() {
        return this.f9016q1;
    }

    public int getListPosition() {
        return this.A1;
    }

    public Bitmap getPlayingBitmap() {
        q3 q3Var = this.R0;
        Bitmap createBitmap = Bitmap.createBitmap(q3Var.getWidth(), q3Var.getHeight(), Bitmap.Config.ARGB_8888);
        C0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.f9048y1;
    }

    public h7 getStoriesController() {
        return MessagesController.getInstance(this.f9021r2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.f9025s2, this.f8994k1.size()) + this.l1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f8994k1;
    }

    public final void h1() {
        z6 z6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f8994k1;
        arrayList.clear();
        y9 y9Var = this.f9047y0;
        if (y9Var.N0) {
            if (!y9Var.S0) {
                arrayList.add(y9Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f9008o1;
            int i10 = 0;
            ArrayList arrayList3 = this.l1;
            if (arrayList2 != null && (z6Var = y9Var.O0) != null) {
                if (z6Var instanceof s6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.f9021r2).getStoriesController().E(this.f9016q1);
                    String str = ((s6) y9Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            g7 g7Var = (g7) E.get(i11);
                            fi.w7 w7Var = g7Var.f8585c;
                            if (w7Var != null && !w7Var.f11903g && TextUtils.equals(w7Var.K0, str)) {
                                arrayList3.add(g7Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f9008o1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = y9Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (y9Var.O0 != null) {
                while (i10 < y9Var.O0.f9493i.size()) {
                    arrayList.add(((MessageObject) y9Var.O0.f9493i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = y9Var.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.f9016q1) {
                    this.f8991j1 = y9Var.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.H1.y(this.f9016q1);
                    this.f8991j1 = y3;
                    if (y3 == null) {
                        this.f8991j1 = this.H1.z(this.f9016q1);
                    }
                }
                this.f9025s2 = 0;
                TL_stories.PeerStories peerStories2 = this.f8991j1;
                if (peerStories2 != null) {
                    this.f9025s2 = peerStories2.stories.size();
                    arrayList.addAll(this.f8991j1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.H1.E(this.f9016q1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.f9012p1 = getStoriesCount();
    }

    public final void i0(boolean z10) {
        q4 currentPeerView;
        o60 o60Var = this.f9049y2;
        if (o60Var != null) {
            o60Var.f31179f0 = null;
            o60Var.a(false);
        }
        long j10 = this.f9016q1;
        TL_stories.StoryItem storyItem = this.D1.f8871a;
        y9 y9Var = this.f9047y0;
        y9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            y9.E1.remove(j10 + (j10 >> 16) + (storyItem.f22266id << 16));
        }
        this.X2 = true;
        o9 o9Var = y9Var.f9445n0;
        if (o9Var != null && (currentPeerView = o9Var.getCurrentPeerView()) != null) {
            currentPeerView.q0();
        }
        if (z10) {
            qc I = new wc(this.R0, this.f9015q0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c2(this, 2));
            I.f31898s = false;
            I.k(false);
        }
        MessagesController.getInstance(this.f9021r2).ensureMessagesLoaded(this.f9016q1, 0, null);
    }

    public final void i1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        o4 o4Var = this.D1;
        TL_stories.StoryItem storyItem = o4Var.f8871a;
        if (storyItem == null) {
            storyItem = o4Var.f8873c;
        }
        boolean z13 = this.f9024s1;
        if (z13 || this.f9020r1) {
            if (storyItem != null) {
                y9 y9Var = this.f9047y0;
                g3 g3Var = this.f9023s0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.r6 r6Var = this.G0;
                    if (r6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.K0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        r6Var.t(num, z12, true);
                        this.K0 = true;
                    } else {
                        this.K0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.r6 r6Var2 = this.F0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.J0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        r6Var2.t(num2, z11, true);
                        this.J0 = true;
                    } else {
                        this.J0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.h6 h6Var = this.H0;
                        if (this.J0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        h6Var.d(f10, true);
                        org.telegram.ui.Components.h6 h6Var2 = this.I0;
                        if (h6Var2 != null) {
                            if (this.K0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            h6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-this.f9016q1));
                    if ((!this.f9028t1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f9013p2;
                        if (y9Var.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.f9013p2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new zq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.f9013p2.setText(spannableStringBuilder);
                    } else {
                        this.f9013p2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = g3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.J0) {
                        f7 = this.F0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.L1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + g3Var.getLayoutParams().width;
                    g3 g3Var2 = this.E0;
                    if (g3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = g3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.K0) {
                            f12 = this.G0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.L1.getLayoutParams()).rightMargin += g3Var2.getLayoutParams().width;
                        g3Var2.requestLayout();
                    }
                    this.L1.requestLayout();
                    g3Var.requestLayout();
                    this.f9017q2.setVisibility(8);
                    this.f9033u2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = o4Var.f8871a;
                    m3 m3Var = this.Y0;
                    if (storyItem2 == null) {
                        m3Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < m3Var.getChildCount(); i14++) {
                        if (m3Var.getChildAt(i14) instanceof f9) {
                            ((f9) m3Var.getChildAt(i14)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.f9021r2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.f9017q2.b(i15, userOrChat, this.f9021r2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.f9017q2.b(i17, null, this.f9021r2);
                    }
                    this.f9017q2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        zq zqVar = new zq(R.drawable.mini_views_likes, 0);
                        zqVar.setOverrideColor(-53704);
                        zqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(zqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        zq zqVar2 = new zq(R.drawable.mini_repost_story, 0);
                        zqVar2.setOverrideColor(-14161823);
                        zqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(zqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f9013p2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f9017q2.setVisibility(8);
                        this.f9013p2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.f9017q2.setVisibility(0);
                        this.f9013p2.setTranslationX(AndroidUtilities.dp(10.0f) + c3.h0.w(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.f9033u2.setVisibility(0);
                } else {
                    TextView textView2 = this.f9013p2;
                    if (y9Var.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.f9013p2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.f9017q2.setVisibility(8);
                    this.f9033u2.setVisibility(8);
                }
                g3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.D0.requestLayout();
                return;
            }
            this.f9013p2.setText("");
            this.f9033u2.setVisibility(8);
            this.f9017q2.setVisibility(8);
        }
    }

    public final void j0() {
        m7 m7Var = this.f9027t0;
        m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r2(0, m7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        m7 m7Var2 = new m7(getContext(), this.f9000m1);
        this.f9027t0 = m7Var2;
        m7Var2.setPadding(dp, dp, dp, dp);
        this.f9027t0.setAlpha(0.0f);
        this.f9027t0.setScaleX(0.8f);
        this.f9027t0.setScaleY(0.8f);
        this.f9027t0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f9023s0.addView(this.f9027t0, gb1.i(40, 40, 3));
        this.f8981f3 = false;
    }

    public final void j1() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        u2 u2Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i10;
        float f17;
        float f18;
        int i11;
        g3 g3Var;
        ImageView imageView;
        u3 u3Var;
        g3 g3Var2;
        boolean z11;
        float f19;
        fl0 fl0Var;
        float f20;
        int i12;
        float f21;
        float f22;
        float f23 = ((p9) this.F1).d.V;
        if (this.A2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.h6 h6Var = this.D2;
        h6Var.d(f7, false);
        int i13 = this.f8989i2;
        if (i13 != 0 && this.f8992j2) {
            f10 = ee.a(this.f9041w2 / i13, 0.0f, 1.0f);
        } else if (this.f8995k2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.h6 h6Var2 = this.L3;
        float f24 = h6Var2.f28811c;
        org.telegram.ui.Components.h6 h6Var3 = this.M3;
        float f25 = h6Var3.f28811c;
        org.telegram.ui.Components.h6 h6Var4 = this.N3;
        float f26 = h6Var4.f28811c;
        if (this.f9037v2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        h6Var2.d(f11, false);
        if (!this.X2) {
            u2 u2Var2 = this.Q1;
            if (u2Var2 != null && !TextUtils.isEmpty(u2Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            h6Var3.d(f22, false);
        }
        u2 u2Var3 = this.Q1;
        if (u2Var3 != null && u2Var3.f25993z3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        h6Var4.d(f12, false);
        final u2 u2Var4 = this.Q1;
        if (u2Var4 != null) {
            q4 q4Var = u2Var4.f9227w5;
            f13 = 1.0f;
            int backgroundTop = u2Var4.getBackgroundTop();
            int i14 = u2Var4.f9224t5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (u2Var4.T1 + i14) - backgroundTop;
                u2Var4.setAnimatedTop(i15);
                q4Var.K2 = true;
                ValueAnimator valueAnimator = q4Var.T1;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q4Var.T1.cancel();
                }
                View view = u2Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var4.G1.setTranslationY(((1.0f - u2Var4.getTopViewEnterProgress()) * u2Var4.G1.getLayoutParams().height) + u2Var4.T1);
                }
                q4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                q4Var.T1 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                u2 u2Var5 = u2Var4;
                                u2Var5.getClass();
                                u2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q4 q4Var2 = u2Var5.f9227w5;
                                q4Var2.K2 = true;
                                q4Var2.invalidate();
                                u2Var5.invalidate();
                                return;
                            default:
                                u2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                q4Var.T1.addListener(new bh.b(u2Var4, 10));
                q4Var.T1.setDuration(250L);
                q4Var.T1.setInterpolator(mi.m.V);
                q4Var.T1.start();
                u2Var4.f9224t5 = 0;
            }
            if (u2Var4.f25926n3) {
                float scrollY = (u2Var4.f9226v5 - u2Var4.E0.getScrollY()) + (u2Var4.f9225u5 - u2Var4.E0.getMeasuredHeight());
                pf pfVar = u2Var4.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u2Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                u2 u2Var5 = u2Var4;
                                u2Var5.getClass();
                                u2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q4 q4Var2 = u2Var5.f9227w5;
                                q4Var2.K2 = true;
                                q4Var2.invalidate();
                                u2Var5.invalidate();
                                return;
                            default:
                                u2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = u2Var4.f9223s5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u2Var4.f9223s5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(mi.m.V);
                ofFloat2.start();
                u2Var4.f25926n3 = false;
                q4Var.j1();
            }
            u2Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        u2 u2Var5 = this.Q1;
        if (u2Var5 != null && u2Var5.q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f9001m2;
        Paint paint = this.f8971c2;
        if (z12) {
            paint.setColor(i0.a.f(this.f8980f2, -14933463, org.telegram.ui.ActionBar.y6.o1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.S3) * org.telegram.messenger.t.A(f27, this.f8983g2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f13 - this.S3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.K2;
        y9 y9Var = this.f9047y0;
        if (z13 || this.O3 != y9Var.f9425d0 || h6Var.f28811c != this.F2 || this.f8986h2 != this.f9041w2 || f10 != this.f8980f2 || f23 != this.f8983g2 || f24 != h6Var2.f28811c || z10 || f26 != h6Var4.f28811c || f25 != h6Var3.f28811c) {
            this.K2 = false;
            this.f8986h2 = this.f9041w2;
            int i16 = (h6Var.f28811c > this.F2 ? 1 : (h6Var.f28811c == this.F2 ? 0 : -1));
            q3 q3Var = this.R0;
            if (i16 != 0) {
                q3Var.invalidate();
            }
            if (f23 != 0.0f) {
                q3Var.setLayerType(2, null);
            } else {
                q3Var.setLayerType(0, null);
            }
            this.F2 = h6Var.f28811c;
            this.f8983g2 = f23;
            this.f8980f2 = f10;
            this.O3 = y9Var.f9425d0;
            float height = this.f9041w2 - (getHeight() - q3Var.getBottom());
            if (this.Q1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = u2Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f8974d2 - (getHeight() - q3Var.getBottom());
            u2 u2Var6 = this.Q1;
            if (u2Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = u2Var6.getHeightWithTopView();
                if (this.f8995k2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            u2 u2Var7 = this.Q1;
            if (u2Var7 != null) {
                if (this.S1 != null) {
                    ImageView suggestButton = u2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.S1.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.S1.setTranslationY(-((getHeight() - this.Q1.getY()) + AndroidUtilities.dp(6.0f)));
                }
                ju editField = this.Q1.getEditField();
                cq0 senderSelectView = this.Q1.getSenderSelectView();
                if (editField != null) {
                    f16 = 6.0f;
                    f21 = 1.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f10);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f16 = 6.0f;
                    f21 = 1.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f21, f10);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f10));
                }
            } else {
                f16 = 6.0f;
            }
            if (this.f9001m2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f9001m2 && !this.f8995k2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f10) + max3;
            m2 m2Var = this.A0;
            bi.r1 r1Var = m2Var.f9344c;
            m2Var.K = dp2;
            if (Math.abs(m2Var.L - max4) > 0.1f) {
                m2Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                r1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - r1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!r1Var.canScrollVertically(1)) {
                    m2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            m2Var.setTranslationY(-m2Var.K);
            m2Var.invalidate();
            fi.b4 b4Var = y9Var.D0;
            if (b4Var != null) {
                b4Var.setKeyboardOffset(max);
            }
            fl0 fl0Var2 = this.U1;
            o4 o4Var = this.D1;
            if (fl0Var2 != null) {
                if (this.f8980f2 > 0.0f && (o4Var == null || !o4Var.f8874f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                fl0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                g3Var = this.E0;
                imageView = this.C0;
                u3Var = this.f9050z0;
                g3Var2 = this.f9023s0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.L1 && childAt.getTag(R.id.parent_tag) == null && childAt != u3Var.W.n(getContext())) {
                    u2 u2Var8 = this.Q1;
                    if (u2Var8 != null && childAt == u2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.Q1.getEmojiView().getMeasuredHeight() - this.f9041w2);
                    } else if (childAt instanceof t40) {
                        t40 t40Var = (t40) childAt;
                        View view2 = t40Var.e;
                        if (view2 != null) {
                            t40Var.g(view2);
                        }
                    } else if (childAt != this.f9049y2 && childAt != q3Var && childAt != imageView && childAt != this.D0 && childAt != g3Var && childAt != this.L2 && childAt != this.S1 && childAt != g3Var2 && ((fl0Var = this.f8984g3) == null || fl0Var.getReactionsWindow() == null || childAt != this.f8984g3.getReactionsWindow().f4049c)) {
                        float f28 = this.f8980f2;
                        f28 = (childAt == this.M1 || childAt == this.O1 || childAt == this.P1 || childAt == this.N1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.f9052z2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.f9041w2) - (AndroidUtilities.dp(f18) * f29)) - (AndroidUtilities.dp(20.0f) * y9Var.f9425d0);
                        if (childAt == this.M1 || childAt == this.O1 || childAt == this.P1 || childAt == this.N1) {
                            dp3 += this.f9041w2;
                        }
                        if (this.f9001m2) {
                            f20 = (1.0f - this.f8983g2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.Q2) {
                            dp3 = y9Var.f9425d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.S2) {
                            dp3 -= this.Q1.getMeasuredHeight() - this.Q1.getAnimatedTop();
                            f20 = this.f8980f2;
                            childAt.invalidate();
                        }
                        if (childAt == this.R1) {
                            dp3 -= this.Q1.getMeasuredHeight() - this.Q1.getAnimatedTop();
                            f20 *= this.f8980f2;
                        }
                        if (childAt == this.U1) {
                            float f30 = (1.0f - h6Var3.f28811c) * (1.0f - f26) * (1.0f - h6Var2.f28811c) * this.f8980f2;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.U1.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            u2 u2Var9 = this.Q1;
                            if (u2Var9 == null || childAt != u2Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.L1) {
                    if (this.f9001m2) {
                        childAt.setAlpha((1.0f - this.S3) * (1.0f - this.f8983g2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.S3) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.S3) * f34);
            g3Var2.setAlpha((1.0f - this.S3) * f34);
            if (g3Var != null) {
                g3Var.setAlpha((1.0f - this.S3) * f34);
            }
            for (int i18 = 0; i18 < q3Var.getChildCount(); i18++) {
                View childAt2 = q3Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.B0) {
                    m4 m4Var = this.f8973d1;
                    i4 i4Var = this.f9003n0;
                    if (childAt2 != m4Var && childAt2 != this.f8997l0 && childAt2 != this.m0 && childAt2 != i4Var && childAt2 != this.L1 && childAt2 != u3Var && childAt2 != this.f9019r0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == i4Var) {
                            f19 = this.T2;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == u3Var) {
                            childAt2.setAlpha((1.0f - this.S3) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.S3) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.Q1 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!o4Var.f8874f) {
                    if (this.H2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.I2 && this.f9024s1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (g3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + g3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    t1 t1Var = this.P1;
                    if (t1Var != null && t1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                u2 u2Var10 = this.Q1;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f8980f2;
                if ((this.H2 || this.f9028t1) && !o4Var.f8874f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2Var10.e1(f35, f36, f37, z11);
                if (this.Q1.getEmojiView() != null) {
                    this.Q1.getEmojiView().setAlpha(this.f8980f2);
                }
            }
        }
    }

    public final void k0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.R3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.S3;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.R3 = ofFloat;
        ofFloat.addUpdateListener(new d2(this, 2));
        this.R3.addListener(new p2(this, z10, 1));
        this.R3.setDuration(420L);
        this.R3.setInterpolator(ds.h);
        this.R3.start();
    }

    public final void l0(Runnable runnable) {
        if (MessagesController.getInstance(this.f9021r2).isFrozen()) {
            org.telegram.ui.b.b(this.f9021r2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.Z2) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 0, this.f9015q0);
            e2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            e2Var.n(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 24);
            e2Var.f22583n0 = string;
            e2Var.f22584o0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            c2.i iVar = new c2.i(15);
            e2Var.f22585p0 = string2;
            e2Var.f22586q0 = iVar;
            e2Var.show();
            return;
        }
        runnable.run();
    }

    public final void m0(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f9029t2 = false;
        this.K2 = true;
        this.f9018q3 = false;
        this.f9024s1 = false;
        this.f9028t1 = false;
        long j10 = this.f9016q1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m4 m4Var = this.f8973d1;
        org.telegram.ui.Components.j9 j9Var = this.f8970c1;
        if (i13 >= 0) {
            if (j10 == UserConfig.getInstance(this.f9021r2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f9020r1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.f9021r2).getUser(Long.valueOf(this.f9016q1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f9021r2).isUserContactBlocked(this.f9016q1);
            if (!UserConfig.getInstance(this.f9021r2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f9032u1 = z15;
            this.f9040w1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            j9Var.m(this.f9021r2, user);
            m4Var.f8776a.getImageReceiver().setForUserOrChat(user, j9Var);
            U0(this.f9016q1, true, false);
        } else {
            this.f9020r1 = false;
            this.f9024s1 = true;
            if (this.H1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.f9018q3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-this.f9016q1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.f9028t1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.f9021r2).getChatFull(-this.f9016q1) == null) {
                MessagesStorage.getInstance(this.f9021r2).loadChatInfo(-this.f9016q1, true, new CountDownLatch(1), false, false);
            }
            if (this.f9028t1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f9032u1 = z10;
            this.f9040w1 = MessagesController.getInstance(this.f9021r2).getSendPaidMessagesStars(this.f9016q1);
            j9Var.k(this.f9021r2, chat);
            m4Var.f8776a.getImageReceiver().setForUserOrChat(chat, j9Var);
            U0(this.f9016q1, true, false);
        }
        if (this.f9051z1 && (this.f9020r1 || this.f9024s1)) {
            h7 h7Var = this.H1;
            long j11 = this.f9016q1;
            a0.h hVar = h7Var.f8639m;
            ha haVar = (ha) hVar.f(j11);
            if (haVar == null) {
                haVar = new ha(h7Var.f8630a, j11, h7Var);
                hVar.k(haVar, j11);
            }
            haVar.b(true);
        }
        h1();
        this.f9048y1 = i10;
        if (i10 < 0) {
            this.f9048y1 = 0;
        }
        this.L0 = 0L;
        this.N0 = false;
        this.y3 = null;
        this.f9053z3 = null;
        boolean z16 = this.f9024s1;
        q3 q3Var = this.R0;
        y9 y9Var = this.f9047y0;
        int i14 = 8;
        o4 o4Var = this.D1;
        if (z16) {
            z0();
            if (this.Q1 == null && (this.f9028t1 || o4Var.f8874f)) {
                t0();
            }
            if (this.Q1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.f9021r2).getChat(Long.valueOf(-this.f9016q1));
                u2 u2Var = this.Q1;
                if (o4Var.f8874f || (!G0() && this.f9028t1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i14 = 0;
                }
                u2Var.setVisibility(i14);
                u2 u2Var2 = this.Q1;
                boolean z17 = o4Var.f8874f;
                B0(true);
                u2Var2.f1(z17);
                u2 u2Var3 = this.Q1;
                if (o4Var.f8874f && !B0(true) && (this.f8995k2 || this.Q1.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                u2Var3.l1(z13, true);
                ju editField = this.Q1.getEditField();
                long j12 = this.f9016q1;
                TL_stories.StoryItem storyItem = o4Var.f8871a;
                y9Var.getClass();
                editField.setText(y9.u(j12, storyItem));
                this.Q1.Y0(this.f9021r2, this.f9016q1);
                this.Q1.H1(chat2, null);
            }
            org.telegram.ui.Components.r6 r6Var = this.F0;
            org.telegram.ui.ActionBar.u6 u6Var = this.f9015q0;
            if (r6Var == null) {
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, false, false);
                this.F0 = r6Var2;
                g3 g3Var = this.f9023s0;
                r6Var2.setCallback(g3Var);
                this.F0.u(u6Var.g(org.telegram.ui.ActionBar.y6.G6));
                this.F0.w(AndroidUtilities.dp(14.0f));
                this.H0 = new org.telegram.ui.Components.h6(g3Var);
            }
            g3 g3Var2 = this.E0;
            if (g3Var2 != null && this.G0 == null) {
                org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(false, false, false);
                this.G0 = r6Var3;
                r6Var3.setCallback(g3Var2);
                this.G0.u(u6Var.g(org.telegram.ui.ActionBar.y6.G6));
                this.G0.w(AndroidUtilities.dp(14.0f));
                this.I0 = new org.telegram.ui.Components.h6(g3Var2);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            this.f9012p1 = getStoriesCount();
            q3Var.invalidate();
            invalidate();
        } else if (this.f9020r1) {
            z0();
            if (o4Var.f8874f) {
                this.L1.setVisibility(8);
                if (this.Q1 == null) {
                    t0();
                }
                this.Q1.setVisibility(0);
            } else {
                this.L1.setVisibility(0);
                u2 u2Var4 = this.Q1;
                if (u2Var4 != null) {
                    u2Var4.setVisibility(8);
                }
            }
            u2 u2Var5 = this.Q1;
            if (u2Var5 != null) {
                boolean z18 = o4Var.f8874f;
                B0(true);
                u2Var5.f1(z18);
                u2 u2Var6 = this.Q1;
                if (o4Var.f8874f && !B0(true) && (this.f8995k2 || this.Q1.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u2Var6.l1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f9008o1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(y9Var.P0));
                    if (indexOf < 0 && !this.f9008o1.isEmpty()) {
                        if (y9Var.P0 > ((Integer) this.f9008o1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (y9Var.P0 < ((Integer) ic.a.g(1, this.f9008o1)).intValue()) {
                            indexOf = this.f9008o1.size() - 1;
                        }
                    }
                    this.f9048y1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.l1.isEmpty();
                    ArrayList arrayList2 = this.f8994k1;
                    if (!isEmpty) {
                        this.f9048y1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f22266id > this.H1.f8633f.get(this.f9016q1)) {
                                this.f9048y1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            d1(false);
            q3Var.invalidate();
            invalidate();
        } else {
            if (this.Q1 == null) {
                t0();
            }
            if (this.f9032u1 && this.V1 == null) {
                x0();
            }
            if (this.V1 != null) {
                if (this.f9032u1 || this.f9036v1) {
                    f1();
                }
                LinearLayout linearLayout = this.V1;
                if ((this.f9032u1 && !o4Var.f8874f) || this.f9036v1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            w8 w8Var = this.Y1;
            if (w8Var != null) {
                w8Var.setVisibility(8);
            }
            if (i10 == -1) {
                g1();
            }
            d1(false);
            u2 u2Var7 = this.Q1;
            if (u2Var7 != null) {
                if (!G0() && !UserObject.isService(this.f9016q1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                u2Var7.setVisibility(i11);
                u2 u2Var8 = this.Q1;
                boolean z19 = o4Var.f8874f;
                B0(true);
                u2Var8.f1(z19);
                u2 u2Var9 = this.Q1;
                if (o4Var.f8874f && !B0(true) && (this.f8995k2 || this.Q1.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2Var9.l1(z11, true);
                ju editField2 = this.Q1.getEditField();
                long j13 = this.f9016q1;
                TL_stories.StoryItem storyItem2 = o4Var.f8871a;
                y9Var.getClass();
                editField2.setText(y9.u(j13, storyItem2));
                this.Q1.Y0(this.f9021r2, this.f9016q1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.f9021r2).getUserFull(this.f9016q1);
                if (userFull != null) {
                    this.Q1.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.f9021r2).loadFullUser(MessagesController.getInstance(this.f9021r2).getUser(Long.valueOf(this.f9016q1)), this.f9009o2, false);
                }
            }
            this.f9012p1 = getStoriesCount();
            g3 g3Var3 = this.L1;
            if (g3Var3 != null) {
                g3Var3.setVisibility(8);
            }
            q3Var.invalidate();
            invalidate();
        }
        p0(false);
    }

    public final void n0() {
        u3 u3Var = this.f9050z0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
        }
    }

    public final void o0() {
        if (this.f9051z1) {
            ((p9) this.F1).d.P();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P0 = true;
        this.T0.onAttachedToWindow();
        this.V0.onAttachedToWindow();
        this.U0.onAttachedToWindow();
        this.f8966a3.onAttachedToWindow();
        this.f8972c3.onAttachedToWindow();
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            u2Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W0;
            if (i10 < arrayList.size()) {
                ((bh.n0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f9021r2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P0 = false;
        this.T0.onDetachedFromWindow();
        this.V0.onDetachedFromWindow();
        this.U0.onDetachedFromWindow();
        this.f8966a3.onDetachedFromWindow();
        this.f8972c3.onDetachedFromWindow();
        u2 u2Var = this.Q1;
        if (u2Var != null) {
            u2Var.B0();
        }
        org.telegram.ui.Components.t5 t5Var = this.f8975d3;
        if (t5Var != null) {
            t5Var.o(this);
            this.f8975d3 = null;
        }
        bh.e eVar = this.f8969b3;
        if (eVar != null) {
            eVar.d(this);
            this.f8969b3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W0;
            if (i10 < arrayList.size()) {
                ((bh.n0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f9021r2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9000m1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.q4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8980f2 = -1.0f;
        this.K2 = true;
        invalidate();
    }

    public final void p0(boolean z10) {
        int i10;
        if (this.Q1 != null && this.U2 && this.P0) {
            c2 c2Var = this.E3;
            AndroidUtilities.cancelRunOnUIThread(c2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.H1.B;
            this.Q1.G(true);
            boolean z11 = this.f9032u1;
            o4 o4Var = this.D1;
            if ((z11 && !o4Var.f8874f) || this.f9036v1) {
                this.Z2 = false;
                this.Q1.setEnabled(false);
                this.Q1.g1(" ", z10);
            } else if (this.f9040w1 > 0) {
                this.Z2 = false;
                this.Q1.setEnabled(true);
                this.Q1.g1(bi.dd.P0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.f9040w1, ','))), z10);
            } else {
                if (!o4Var.f8874f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f9021r2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.Z2 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.f9021r2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.Q1.setEnabled(true);
                        if (((int) this.Q1.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.Q1.getEditField().getMeasuredWidth()) {
                            u2 u2Var = this.Q1;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            u2Var.e = formatString2;
                            u2Var.f25876f = format;
                            u2Var.D1(z10);
                        } else {
                            this.Q1.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(c2Var, 1000L);
                        return;
                    }
                }
                this.Z2 = false;
                this.Q1.setEnabled(true);
                if (o4Var.f8874f) {
                    long starsPrice = this.Q1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.Q1.g1(bi.dd.U0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.Q1.O4), z10);
                        zq zqVar = this.Q1.O4[0];
                        if (zqVar != null) {
                            zqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.Q1.g1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                u2 u2Var2 = this.Q1;
                if (this.f9028t1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                u2Var2.g1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean q0() {
        if (this.f8987h3) {
            if (this.f8984g3.getReactionsWindow() != null) {
                if (this.f9005n2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f8984g3.getReactionsWindow().f4049c);
                    return true;
                }
                this.f8984g3.getReactionsWindow().d();
                return true;
            }
            Z0(false);
            return true;
        }
        m3 m3Var = this.Y0;
        if (m3Var != null) {
            fi.v3 v3Var = m3Var.f8465c;
            if (v3Var != null) {
                v3Var.e(true);
                m3Var.f8465c = null;
            }
            m3Var.f8464b = null;
            m3Var.invalidate();
            m3Var.b(false);
        }
        u3 u3Var = this.f9050z0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
            return true;
        }
        fi.v3 v3Var2 = this.f9031u0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        fi.v3 v3Var3 = this.f9035v0;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
        t40 t40Var = this.L2;
        if (t40Var != null) {
            t40Var.b(true);
        }
        h4 h4Var = this.f8988i1;
        if (h4Var != null && h4Var.f29713b) {
            h4Var.a();
            return true;
        }
        u2 u2Var = this.Q1;
        if (u2Var != null && u2Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f9015q0);
            if (this.Q1.f25859c1) {
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((p9) this.F1).h(alertDialog$Builder.f22368a);
            return true;
        }
        fl0 fl0Var = this.U1;
        if (fl0Var != null && fl0Var.getReactionsWindow() != null && !this.U1.getReactionsWindow().f4060q) {
            this.U1.getReactionsWindow().d();
            return true;
        }
        u2 u2Var2 = this.Q1;
        if (u2Var2 != null && u2Var2.q0()) {
            if (this.f9005n2 > 0) {
                AndroidUtilities.hideKeyboard(this.Q1.getEmojiView());
                return true;
            }
            this.Q1.k0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            u2 u2Var3 = this.Q1;
            if (u2Var3 != null) {
                long j10 = this.f9016q1;
                TL_stories.StoryItem storyItem = this.D1.f8871a;
                Editable editText = u2Var3.getEditText();
                this.f9047y0.getClass();
                y9.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.Q1);
            return true;
        } else if (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            u3Var.D();
            this.V2 = false;
            this.R0.invalidate();
            return true;
        }
    }

    public final void r0() {
        if (this.f9045x2 == null) {
            a3 a3Var = new a3(this, getContext(), this.f9015q0);
            this.f9045x2 = a3Var;
            a3Var.f33013c2 = new b3(this);
            a3Var.f33033j0.f0();
            a3 a3Var2 = this.f9045x2;
            a3Var2.W = true;
            a3Var2.v1();
            a3 a3Var3 = this.f9045x2;
            a3Var3.X = new c3(this);
            a3Var3.r1().setText(this.Q1.getFieldText());
        }
    }

    public final void s0() {
        if (this.M1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.f9046x3);
            this.M1 = aVar;
            aVar.setOnClickListener(new e2(this, 1));
            addView(this.M1, gb1.h(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public void setAccount(int i10) {
        this.f9021r2 = i10;
        this.H1 = MessagesController.getInstance(i10).storiesController;
        this.Z0.f42305b = i10;
        fl0 fl0Var = this.U1;
        if (fl0Var != null) {
            fl0Var.setCurrentAccount(i10);
            this.U1.p(null, null, true);
        }
        fl0 fl0Var2 = this.f8984g3;
        if (fl0Var2 != null) {
            fl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        R0(0L, z10);
    }

    public void setDelegate(j4 j4Var) {
        this.F1 = j4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.U2 != z10) {
            this.U2 = z10;
            if (z10) {
                this.T0.setCurrentAlpha(1.0f);
                p0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.f9051z1) {
            this.A2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10;
        if (f7 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.Q0 != z10) {
            this.Q0 = z10;
            this.R0.invalidate();
            if (this.f9051z1 && this.f9047y0.f9416a && Build.VERSION.SDK_INT < 33) {
                a5.d dVar = this.K3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(dVar);
                y9 y9Var = ((p9) this.F1).d;
                y9Var.l1 = true;
                y9Var.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.G1 != z10) {
            this.G1 = z10;
            f3 f3Var = this.T0;
            if (z10) {
                f3Var.stopAnimation();
                f3Var.setAllowStartAnimation(false);
            } else {
                f3Var.startAnimation();
                f3Var.setAllowStartAnimation(true);
            }
            this.M0 = 0L;
            this.R0.invalidate();
        }
    }

    public final void t0() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f9015q0;
        u2 u2Var = new u2(this, AndroidUtilities.findActivity(getContext()), this, new s2(1, u6Var));
        this.Q1 = u2Var;
        u2Var.getEditField().useAnimatedTextDrawable();
        this.Q1.getEditField().setScaleX(0.0f);
        this.Q1.setOverrideKeyboardAnimation(true);
        this.Q1.setClipChildren(false);
        this.Q1.setDelegate(new v2(this));
        setDelegate(this.Q1);
        u2 u2Var2 = this.Q1;
        u2Var2.f25989y4 = false;
        u2Var2.f25994z4 = true;
        if (this.D1.f8874f) {
            u2Var2.S0(false, false, false);
        } else {
            u2Var2.S0(true, true, false);
        }
        this.Q1.updateColors();
        u2 u2Var3 = this.Q1;
        u2Var3.A4 = true;
        addView(u2Var3, gb1.h(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.D3 != null) {
            this.Q1.M1(false);
        }
        this.Q1.G2 = this.f9009o2;
        p4 p4Var = this.B2;
        ((ArrayList) p4Var.f8904g).add(this.R0);
        ((ArrayList) p4Var.f8904g).add(this);
        if (this.P0) {
            this.Q1.C0();
        }
        p0(false);
        if (G0()) {
            this.Q1.setVisibility(8);
        }
        lh.h hVar = new lh.h(getContext(), u6Var, this.f9046x3, this.f9034u3);
        this.R1 = hVar;
        hVar.setOnClickListener(new y1(this, 1));
        addView(this.R1, gb1.i(57, 300, 85));
        this.R1.setVisibility(8);
        this.Q1.setSideButtonsForAttach(this.R1);
        this.f9043x0 = getChildCount();
    }

    public final void u0() {
        if (this.Y1 != null) {
            return;
        }
        w8 w8Var = new w8(getContext(), this.f9015q0);
        this.Y1 = w8Var;
        w8Var.setOnClickListener(new e2(this, 4));
        this.Y1.setAlpha(0.0f);
        this.Y1.setVisibility(8);
        addView(this.Y1, gb1.h(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void v0() {
        boolean z10;
        if (this.P1 == null && getContext() != null) {
            t1 t1Var = new t1(getContext(), this.f9046x3);
            this.P1 = t1Var;
            t1Var.setOnClickListener(new e2(this, 5));
            t1 t1Var2 = this.P1;
            h1 h1Var = h1.W;
            boolean z11 = true;
            if (h1Var != null && h1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            t1Var2.b(z10, false);
            t1 t1Var3 = this.P1;
            h1 h1Var2 = h1.W;
            if (h1Var2 != null && !h1Var2.m()) {
                z11 = false;
            }
            t1Var3.a(z11, false);
            addView(this.P1, gb1.h(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void w0() {
        if (this.O1 == null && getContext() != null) {
            this.N1 = new w1(getContext(), this.f9021r2);
            x1 x1Var = new x1(getContext(), this.N1, this.f9046x3);
            this.O1 = x1Var;
            x1Var.setOnClickListener(new e2(this, 6));
            this.O1.setOnLongClickListener(new b2(this, 1));
            addView(this.O1, gb1.h(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.N1, gb1.h(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void x0() {
        int i10;
        if (this.V1 != null) {
            return;
        }
        if (this.Q1 == null) {
            t0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.V1 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.W1 = textView;
        textView.setTextColor(-8026747);
        this.W1.setTextSize(1, 16.0f);
        TextView textView2 = this.W1;
        if (this.f9028t1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.X1 = textView3;
        textView3.setTextColor(-1);
        this.X1.setTextSize(1, 12.0f);
        TextView textView4 = this.X1;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.X1.setGravity(17);
        gb1.b(this.X1);
        this.X1.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.X1.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.V1.addView(imageView, gb1.x(22, 22, 16, 12, 1, 4, 0));
        this.V1.addView(this.W1, gb1.v(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.V1.addView(this.X1, gb1.v(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.Q1.addView(this.V1, gb1.h(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void y0() {
        if (this.Q2 != null) {
            return;
        }
        md mdVar = new md(getContext(), 1);
        this.Q2 = mdVar;
        mdVar.setTextSize(1, 14.0f);
        this.Q2.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.Q2.setGravity(19);
        this.Q2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.Q2, gb1.h(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void z0() {
        if (this.L1 != null) {
            return;
        }
        g3 g3Var = new g3(this, getContext(), 0);
        this.L1 = g3Var;
        g3Var.setClickable(true);
        addView(this.L1, gb1.h(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        h3 h3Var = new h3(this, getContext());
        this.f9033u2 = h3Var;
        h3Var.setOnClickListener(new e2(this, 0));
        this.L1.addView(this.f9033u2, gb1.h(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.f9017q2 = vVar;
        vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.L1.addView(this.f9017q2, gb1.h(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f9013p2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f9013p2.setTextColor(-1);
        this.L1.addView(this.f9013p2, gb1.h(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f9000m1.f8832s);
        h3 h3Var2 = this.f9033u2;
        int dp = AndroidUtilities.dp(15.0f);
        int o10 = i0.a.o(-1, 120);
        h3Var2.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.y6.N(i0.a.o(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }
}
