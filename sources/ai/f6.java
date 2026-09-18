package ai;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.as;
import org.telegram.ui.gz;
import org.telegram.ui.pv0;
import org.telegram.ui.zn;
public abstract class f6 extends bw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.e6 B0;
    public long B1;
    public h0 B2;
    public boolean B3;
    public final nb C0;
    public boolean C1;
    public int C2;
    public as C3;
    public final m4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.f1 D3;
    public q9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.f1 E3;
    public ci.f4 F0;
    public boolean F1;
    public n4 F2;
    public final ah.c F3;
    public ci.f4 G0;
    public boolean G1;
    public boolean G2;
    public final fh.a G3;
    public ci.f4 H0;
    public long H1;
    public float H2;
    public final fh.d H3;
    public int I0;
    public final float I1;
    public g4 I2;
    public final dh.b I3;
    public final jc J0;
    public int J1;
    public b60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final h5 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final r3 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final e6 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final d6 O1;
    public final org.telegram.ui.Components.e6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final m4 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.e6 P2;
    public final c3 P3;
    public org.telegram.ui.Components.o6 Q0;
    public y5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.o6 R0;
    public boolean R1;
    public long R2;
    public final c3 R3;
    public org.telegram.ui.Components.e6 S0;
    public l9 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.e6 T0;
    public boolean T1;
    public boolean T2;
    public final ArrayList T3;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V0;
    public boolean V1;
    public boolean V2;
    public final q4 V3;
    public long W0;
    public m4 W1;
    public i40 W2;
    public final org.telegram.ui.Components.e6 W3;
    public long X0;
    public c X1;
    public final pv0 X2;
    public final org.telegram.ui.Components.e6 X3;
    public boolean Y0;
    public w2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.e6 Y3;
    public boolean Z0;
    public x2 Z1;
    public j4 Z2;
    public float Z3;
    public boolean f796a1;
    public r2 a2;
    public FrameLayout f797a3;
    public final Path f798a4;
    public boolean f799b1;
    public a4 f800b2;
    public p4 f801b3;
    public boolean f802b4;
    public final a5 f803c1;
    public jh.h f804c2;
    public boolean f805c3;
    public ValueAnimator f806c4;
    public final FrameLayout f807d1;
    public ci.f4 f808d2;
    public c4 f809d3;
    public float f810d4;
    public final l4 f811e1;
    public ValueAnimator f812e2;
    public float f813e3;
    public final ImageReceiver f814f1;
    public qk0 f815f2;
    public boolean f816f3;
    public final ImageReceiver f817g1;
    public LinearLayout f818g2;
    public boolean f819g3;
    public final ArrayList f820h1;
    public TextView f821h2;
    public boolean f822h3;
    public Runnable f823i1;
    public TextView f824i2;
    public boolean f825i3;
    public final v4 f826j1;
    public gb f827j2;
    public boolean j3;
    public final gz f828k1;
    public ViewPropertyAnimator f829k2;
    public boolean f830k3;
    public m6 l1;
    public final ch.d f831l2;
    public final ImageReceiver f832l3;
    public float f833m1;
    public final ch.d f834m2;
    public zg.d f835m3;
    public final org.telegram.ui.Components.h9 f836n1;
    public final Paint f837n2;
    public final ImageReceiver f838n3;
    public final b6 f839o1;
    public int f840o2;
    public org.telegram.ui.Components.q5 f841o3;
    public final hb f842p1;
    public ValueAnimator f843p2;
    public boolean f844p3;
    public j6.l f845q1;
    public float f846q2;
    public boolean f847q3;
    public int f848r1;
    public float f849r2;
    public qk0 f850r3;
    public org.telegram.ui.ActionBar.f1 f851s1;
    public float f852s2;
    public boolean f853s3;
    public w5 f854t1;
    public int f855t2;
    public float f856t3;
    public TL_stories.PeerStories f857u1;
    public boolean f858u2;
    public boolean f859u3;
    public final ArrayList f860v1;
    public boolean f861v2;
    public float f862v3;
    public final ImageView f863w0;
    public final ArrayList f864w1;
    public boolean f865w2;
    public int f866w3;
    public final ImageView f867x0;
    public final c6 f868x1;
    public boolean f869x2;
    public int f870x3;
    public final x5 f871y0;
    public final j6 f872y1;
    public int f873y2;
    public int y3;
    public final lj0 f874z0;
    public ArrayList f875z1;
    public final int f876z2;
    public c3 f877z3;

    public f6(Context context, final jc jcVar, c6 c6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.f799b1 = true;
        this.f820h1 = new ArrayList();
        this.f848r1 = -5;
        this.I1 = 1.0f;
        d6 d6Var = new d6(this);
        this.O1 = d6Var;
        this.f846q2 = -1.0f;
        this.f849r2 = -1.0f;
        this.f852s2 = -1.0f;
        this.f876z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.e6(this);
        this.P2 = new org.telegram.ui.Components.e6(this);
        pv0 pv0Var = new pv0();
        this.X2 = pv0Var;
        this.f813e3 = 1.0f;
        this.P3 = new c3(this, 4);
        this.R3 = new c3(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new q4(this, 0);
        this.W3 = new org.telegram.ui.Components.e6(this);
        this.X3 = new org.telegram.ui.Components.e6(this);
        this.Y3 = new org.telegram.ui.Components.e6(this);
        this.f798a4 = new Path();
        pv0Var.E = new a6.m(this, 1);
        ?? obj = new Object();
        obj.f768g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f860v1 = new ArrayList();
        this.f864w1 = new ArrayList();
        l4 l4Var = new l4(this, 0);
        this.f811e1 = l4Var;
        l4Var.setCrossfadeWithOldImage(false);
        l4Var.setAllowLoadingOnAttachedOnly(true);
        l4Var.ignoreNotifications = true;
        l4Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f832l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f838n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f814f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f817g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        l4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f836n1 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        this.J0 = jcVar;
        this.f868x1 = c6Var;
        this.P1 = c6Var.f631g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        c6Var.f635l.setColor(-16777216);
        this.f837n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = e6Var;
        setClipChildren(false);
        v4 v4Var = new v4(this, context, this.f803c1, e6Var, jcVar);
        this.f826j1 = v4Var;
        dh.b bVar = new dh.b(e6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.I3 = bVar;
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            fh.d dVar = new fh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        hh.k kVar = new hh.k(this);
        ah.c cVar2 = new ah.c(this.G3);
        cVar2.f425f = kVar;
        cVar2.f426g = this;
        this.F3 = cVar2;
        this.f831l2 = cVar2.c(this, bVar, false);
        ch.d c10 = cVar2.c(this, bVar, false);
        this.f834m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        a5 a5Var = new a5(this, context, c6Var, jcVar);
        this.f803c1 = a5Var;
        a5Var.setClipChildren(false);
        this.f828k1 = new gz(this.C2, a5Var);
        a5Var.addView(v4Var, w7.y5.c(-1.0f, -1));
        h5 h5Var = new h5(this, getContext(), jcVar.f1121y, jcVar, e6Var);
        this.K0 = h5Var;
        h5Var.f1717b0.setOnClickListener(new e3(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(c6Var.f636m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e3(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.a6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(c6Var.f637n);
        imageView2.setPadding(dp, dp, dp, dp);
        m4 m4Var = new m4(this, getContext(), 1);
        this.P0 = m4Var;
        org.telegram.ui.Components.o6 o6Var = this.R0;
        if (o6Var != null) {
            o6Var.setCallback(m4Var);
        }
        m4Var.setWillNotDraw(false);
        m4Var.setOnClickListener(new e3(this, 12));
        m4 m4Var2 = new m4(this, getContext(), 2);
        this.D0 = m4Var2;
        org.telegram.ui.Components.o6 o6Var2 = this.Q0;
        if (o6Var2 != null) {
            o6Var2.setCallback(m4Var2);
        }
        m4Var2.setWillNotDraw(false);
        m4Var2.setOnClickListener(new e3(this, 13));
        m4Var2.setOnLongClickListener(new q3(0, this, jcVar));
        q9 q9Var = new q9(context, c6Var);
        this.E0 = q9Var;
        q9Var.setPadding(dp, dp, dp, dp);
        m4Var2.addView(this.E0, w7.y5.e(40, 40, 3));
        m4Var.addView(imageView2, w7.y5.e(40, 40, 3));
        w7.a6.b(m4Var2, 0.3f, 5.0f);
        w7.a6.b(m4Var, 0.3f, 5.0f);
        l4Var.setAllowLoadingOnAttachedOnly(true);
        l4Var.setParentView(a5Var);
        j6 j6Var = new j6(10);
        this.f872y1 = j6Var;
        a5Var.setOutlineProvider(j6Var);
        a5Var.setClipToOutline(true);
        addView(a5Var);
        b6 b6Var = new b6(context, d6Var);
        this.f839o1 = b6Var;
        b6Var.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f1780b;

            {
                this.f1780b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f6 f6Var = this.f1780b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        jc jcVar2 = jcVar;
                        if (j3 == j10) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", f6Var.B1);
                            jcVar2.H(new ka0(f7, null));
                            return;
                        } else if (j10 > 0) {
                            jcVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            jcVar2.H(zn.R9(j10));
                            return;
                        }
                    default:
                        f6 f6Var2 = this.f1780b;
                        if (f6Var2.O1.j()) {
                            jcVar.O();
                            if (!jc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            x5 x5Var = f6Var2.f871y0;
                            if (!jc.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            x5Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        f6Var2.c1(true);
                        return;
                }
            }
        });
        a5Var.addView(b6Var, w7.y5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f807d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.y5.q(40, 40, 5));
        linearLayout.addView(m4Var, w7.y5.q(40, 40, 5));
        linearLayout.addView(m4Var2, w7.y5.q(40, 40, 5));
        addView(linearLayout, w7.y5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f863w0 = imageView3;
        imageView3.setImageDrawable(c6Var.f640q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a5Var.addView(imageView3, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f867x0 = imageView4;
        imageView4.setImageDrawable(c6Var.f641r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        a5Var.addView(imageView4, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new v0(jcVar, 1));
        imageView3.setOnClickListener(new s0(this, e6Var, jcVar, context, c6Var, 1));
        x5 x5Var = new x5(context, 0);
        this.f871y0 = x5Var;
        a5Var.addView(x5Var, w7.y5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f874z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        x5Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(c6Var.f643t);
        x5Var.addView(imageView6);
        imageView6.setVisibility(8);
        nb nbVar = new nb(context);
        this.C0 = nbVar;
        nbVar.setOnClickListener(new e3(this, 2));
        a5Var.addView(nbVar, w7.y5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        x5Var.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f1780b;

            {
                this.f1780b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f6 f6Var = this.f1780b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        jc jcVar2 = jcVar;
                        if (j3 == j10) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", f6Var.B1);
                            jcVar2.H(new ka0(f7, null));
                            return;
                        } else if (j10 > 0) {
                            jcVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            jcVar2.H(zn.R9(j10));
                            return;
                        }
                    default:
                        f6 f6Var2 = this.f1780b;
                        if (f6Var2.O1.j()) {
                            jcVar.O();
                            if (!jc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            x5 x5Var2 = f6Var2.f871y0;
                            if (!jc.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            x5Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        f6Var2.c1(true);
                        return;
                }
            }
        });
        this.f842p1 = new hb(this, c6Var);
        a5Var.addView(h5Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        r3 r3Var = new r3(this, context, jcVar, jcVar.v, view, frameLayout, jcVar);
        this.L0 = r3Var;
        a5Var.addView(view, w7.y5.e(-1, 200, 87));
        a5Var.addView(r3Var, w7.y5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        a5Var.addView(frameLayout, w7.y5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        x5Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        m4Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        m4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.aa aaVar = h5Var.W;
        View o9 = aaVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        aaVar.D = new s3(this, 0);
        aaVar.T(this);
    }

    public static void V0(k9 k9Var, ImageReceiver imageReceiver, String str) {
        if (k9Var.f1147s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(k9Var.f1144f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(k9Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(f6 f6Var, ValueAnimator valueAnimator) {
        float f7;
        nb nbVar = f6Var.C0;
        f6Var.f810d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b6 b6Var = f6Var.f839o1;
        b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f810d4);
        b6Var.setAlpha(1.0f - f6Var.f810d4);
        ImageView imageView = f6Var.f863w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f810d4);
        imageView.setAlpha(1.0f - f6Var.f810d4);
        ImageView imageView2 = f6Var.f867x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f810d4);
        imageView2.setAlpha(1.0f - f6Var.f810d4);
        x5 x5Var = f6Var.f871y0;
        x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f810d4);
        x5Var.setAlpha((1.0f - f6Var.f810d4) * f6Var.f813e3);
        m4 m4Var = f6Var.W1;
        if (m4Var != null) {
            m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var.f810d4);
            f6Var.W1.setAlpha(1.0f - f6Var.f810d4);
        }
        if (nbVar != null) {
            nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f810d4);
            nbVar.setAlpha(1.0f - f6Var.f810d4);
        }
        f6Var.K0.setAlpha(1.0f - f6Var.f810d4);
        y5 y5Var = f6Var.Q1;
        if (y5Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((ac) y5Var).d.V;
        }
        float hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        m4 m4Var2 = f6Var.D0;
        if (m4Var2 != null) {
            m4Var2.setAlpha((1.0f - f6Var.f810d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = f6Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - f6Var.f810d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        m4 m4Var3 = f6Var.P0;
        if (m4Var3 != null) {
            m4Var3.setAlpha((1.0f - f6Var.f810d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        a4 a4Var = f6Var.f800b2;
        if (a4Var != null) {
            a4Var.setAlpha(1.0f - f6Var.f810d4);
            f6Var.invalidate();
        }
        f6Var.f803c1.invalidate();
    }

    public static void a0(f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = f6Var.D3;
        if (f1Var != null && f6Var.C3 != null && f1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(jc.B1 - 0.2f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(jc.B1 - 0.5f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(jc.B1 - 1.0f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(jc.B1 - 1.5f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(jc.B1 - 2.0f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.f1 f1Var2 = f6Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    f1Var2.setSubtext(LocaleController.formatString(i10, ed.a(jc.B1) + "x"));
                }
            }
            f6Var.C3.a(jc.B1, z10);
        }
    }

    public static void b0(f6 f6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!f6Var.I0() && !f6Var.O1.f709f) {
            if (UserConfig.getInstance(f6Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0).setOnClickListener(new e3(f6Var, 8));
                return;
            }
            Drawable drawable = f6Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            t3 t3Var = new t3(f6Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0);
            c10.setOnClickListener(new e3(f6Var, 9));
            c10.setIcon(t3Var);
        }
    }

    public static void d0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.f706a;
        if ((storyItem == null && d6Var.f707b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = d6Var.h();
        boolean z10 = d6Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), f6Var.getContext(), z10 ? 1 : 0, null, null, new i3(0, f6Var, z10));
            return;
        }
        f6Var.a1();
    }

    public static void e0(f6 f6Var, long j3) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(j3));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f6Var.C2).getChat(Long.valueOf(-j3));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new h3(f6Var, MessagesController.getInstance(f6Var.C2), j3, !z10, str, user), 200L);
    }

    public static void f0(f6 f6Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f6Var.getContext(), 0, f6Var.B0);
        if (f6Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f18622a.R = LocaleController.getString(i10);
        if (f6Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f18622a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(f6Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w1(6));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        ((ac) f6Var.Q1).h(b2Var);
        b2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f23794c;
        r7 r7Var = this.J0.f1116w;
        if (r7Var == null) {
            f7 = 0.0f;
        } else {
            f7 = r7Var.f1474f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        jc jcVar;
        if (!this.O1.f709f || (jcVar = this.J0) == null || jcVar.A0 == null || D0(true)) {
            return 0L;
        }
        return jcVar.A0.j();
    }

    public static void h0(f6 f6Var) {
        String str;
        org.telegram.ui.Components.qc J;
        org.telegram.ui.ActionBar.e6 e6Var = f6Var.B0;
        a5 a5Var = f6Var.f803c1;
        if (f6Var.G1) {
            return;
        }
        if (f6Var.E1) {
            if (f6Var.J3 != null && f6Var.K3 != null) {
                rg.j0.C1(new y3(f6Var, 0), f6Var.J3, f6Var.K3, f6Var.B1, true);
                return;
            }
            jc jcVar = f6Var.J0;
            if (jcVar != null) {
                jcVar.f1092k1 = true;
                jcVar.P();
            }
            MessagesController.getInstance(f6Var.C2).getBoostsController().getBoostsStats(f6Var.B1, new f3(f6Var, 0));
            return;
        }
        a4 a4Var = f6Var.f800b2;
        int i10 = -f6Var.f848r1;
        f6Var.f848r1 = i10;
        AndroidUtilities.shakeViewSpring(a4Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (f6Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(f6Var.C2).premiumFeaturesBlocked()) {
            J = new xc(a5Var, e6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new xc(a5Var, e6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c3(f6Var, 5));
        }
        J.j();
    }

    public static void j0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        if (d6Var.f706a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f18536id = d6Var.f706a.f18531id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(f6Var.B1);
        ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f801b3 != null) {
            return;
        }
        p4 p4Var = new p4(getContext(), 0);
        this.f801b3 = p4Var;
        p4Var.setTextSize(1, 14.0f);
        this.f801b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.f801b3.setGravity(19);
        this.f801b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f801b3, w7.y5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        m4 m4Var = new m4(this, getContext(), 0);
        this.W1 = m4Var;
        m4Var.setClickable(true);
        addView(this.W1, w7.y5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        n4 n4Var = new n4(this, getContext());
        this.F2 = n4Var;
        n4Var.setOnClickListener(new e3(this, 0));
        this.W1.addView(this.F2, w7.y5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        h0 h0Var = new h0(0, getContext(), false);
        this.B2 = h0Var;
        h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.y5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.y5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f868x1.f642s);
        n4 n4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        n4Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f797a3 != null) {
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        TextView textView2 = new TextView(getContext());
        w7.a6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, e6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, e6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new e3(this, 3));
        linearLayout.addView(textView, w7.y5.n(-1, -2));
        linearLayout.addView(textView2, w7.y5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.y5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.f803c1.addView(frameLayout);
        this.f797a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d2 d2Var;
        TLRPC.Peer i10;
        d2 d2Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        jc jcVar = this.J0;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 < 0 && (d2Var2 = jcVar.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = d2Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (jcVar.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && jcVar != null && (d2Var = jcVar.A0) != null && d2Var.l()) {
            if (!z10 || (i10 = jcVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        e6 e6Var = this.M2;
        org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) e6Var.e;
        if (k4Var != null && ((SurfaceView) e6Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) e6Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (k4Var != null && (textureView = (TextureView) e6Var.f767f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            a5 a5Var = this.f803c1;
            canvas.scale(i10 / a5Var.getMeasuredWidth(), i11 / a5Var.getMeasuredHeight());
            this.f811e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(ci.ga gaVar, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        y5 y5Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        ci.ia iaVar = new ci.ia(context, i10, this.B0);
        iaVar.q1(gaVar);
        ci.i1 i1Var = iaVar.f4806b;
        if (i1Var != null) {
            for (View view : i1Var.getViewPages()) {
                if (view instanceof ci.ba) {
                    ((ci.ba) view).e(false);
                }
            }
        }
        iaVar.k1(true);
        iaVar.T = new ah.b(1, this, storyItem);
        ((ac) y5Var).h(iaVar);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        a5 a5Var = this.f803c1;
        float x11 = view.getX() + a5Var.getX() + x10;
        float y3 = view.getY() + a5Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        d9 d9Var;
        jc jcVar = this.J0;
        if (jcVar != null && (d9Var = jcVar.O0) != null && d9Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(zg.o0 o0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        d6 d6Var = this.O1;
        TL_stories.StoryItem storyItem = d6Var.f706a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && o0Var == null) {
            l0();
            this.S1.g0(this.B1, d6Var.f706a, null);
        } else if (o0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f844p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = zg.k0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f832l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f847q3 = true;
                this.S1.g0(this.B1, d6Var.f706a, zg.o0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, d6Var.f706a, o0Var);
        }
        TL_stories.StoryItem storyItem2 = d6Var.f706a;
        m4 m4Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(zg.o0.d(reaction));
            m4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            m4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = d6Var.f706a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = d6Var.f706a.views;
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
        TL_stories.StoryItem storyItem4 = d6Var.f706a;
        zg.q0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d2 d2Var;
        boolean z10;
        if (this.O3 == null) {
            jc jcVar = this.J0;
            if (jcVar != null && (d2Var = jcVar.A0) != null) {
                TLRPC.GroupCall groupCall = d2Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
            this.O3 = sendAsPeers;
            a4 a4Var = this.f800b2;
            if (a4Var != null && sendAsPeers != null) {
                a4Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        a4 a4Var = this.f800b2;
        if (a4Var == null) {
            return false;
        }
        boolean z10 = a4Var.f22057y2;
        if (z10) {
            a4Var.r1();
        }
        AndroidUtilities.runOnUIThread(new c3(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        y1 y1Var;
        int i10;
        long j10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f800b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.L3;
        y1 y1Var2 = new y1(this, 1);
        d dVar = new d();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.e6) dVar, false);
        f3Var.fixNavigationBar();
        f3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j12;
            y1Var = y1Var2;
            i10 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j12;
            y1Var = y1Var2;
            i10 = 0;
        }
        if (j3 <= 0) {
            j10 = 100;
        } else {
            j10 = j3;
        }
        int max = (int) Math.max(messageMinPrice, j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i13 = length * 7;
                int i14 = iArr[i13];
                j11 = messageMinPrice;
                int i15 = iArr[i13 + 2];
                if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                    max = Math.max(max, i14);
                    break;
                } else {
                    length--;
                    messageMinPrice = j11;
                }
            } else {
                j11 = messageMinPrice;
                break;
            }
        }
        final long[] jArr = {max};
        final oq[] oqVarArr = new oq[1];
        final ci.d dVar2 = new ci.d(context, null, true);
        final ?? obj = new Object();
        obj.f1229c = clientUserId;
        obj.f1230f = textWithEntities;
        obj.f1231g = jArr[0];
        final h1 h1Var = new h1(i12, context, true);
        LinearLayout e = wh.e(context, 0);
        final f0 f0Var = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), dVar);
        e.addView(f0Var, w7.y5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final f0 f0Var2 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), dVar);
        e.addView(f0Var2, w7.y5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final f0 f0Var3 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), dVar);
        e.addView(f0Var3, w7.y5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final e0 e0Var = new e0(context, dVar, r6);
        final boolean[] zArr = {true};
        y1 y1Var3 = y1Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar2.g(yh.v7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), oqVarArr), true, true);
                long j14 = jArr2[0];
                m1 m1Var = obj;
                m1Var.f1231g = j14;
                h1Var.set(m1Var);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = g0.b(i16, intValue2, 0);
                int b11 = g0.b(i16, num.intValue(), 1);
                int b12 = g0.b(i16, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.p6) f0Var.f785b).c(formatString, true, true);
                ((org.telegram.ui.Components.p6) f0Var2.f785b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.p6) f0Var3.f785b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = g0.b(i16, num.intValue(), 3);
                int b14 = g0.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                e0Var.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        h1Var.set(obj);
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
            if (iArr2[i18] >= j13) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
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
        if (arrayList.isEmpty() || ((Integer) hg.k0.g(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        e0Var.f47670e0 = iArr4;
        e0Var.setValue((int) jArr[0]);
        linearLayout.addView(e0Var, w7.y5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.y5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.f19169j5;
        TextView b10 = w7.c6.b(context, 20.0f, i21, true, dVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.y5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.c6.b(context, 14.0f, i21, false, dVar);
        b11.setGravity(17);
        wh.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.y5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(h1Var, w7.y5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar2, w7.y5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar2.setOnClickListener(new d0(y1Var3, jArr, f3Var, 0));
    }

    public final void P0() {
        if (this.f800b2 == null) {
            return;
        }
        t0();
        this.I2.f29033j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.f800b2.P();
        }
        this.I2.J1(-1, true);
        g4 g4Var = this.I2;
        g4Var.Z = this.B1;
        g4Var.r1();
        this.I2.m1().setText(this.f800b2.getFieldText());
        ((ac) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j3 = this.B1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new zn(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.S0(android.net.Uri):void");
    }

    public final void T0(long j3, boolean z10) {
        int i10;
        int i11;
        if (this.K1 != z10) {
            this.K1 = z10;
            lj0 lj0Var = this.f874z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f1067a && Build.VERSION.SDK_INT < 33) {
                    jc jcVar = ((ac) this.Q1).d;
                    jcVar.l1 = true;
                    jcVar.P();
                    q4 q4Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(q4Var);
                    AndroidUtilities.runOnUIThread(q4Var, 100L);
                }
                R0(j3);
                g1();
                lj0Var.setAnimation(this.f868x1.f644u);
                this.K1 = true;
                this.f839o1.f582a.getImageReceiver().setVisible(true, true);
                d6 d6Var = this.O1;
                if (d6Var.f706a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + d6Var.f706a.f18531id + " " + d6.c(d6Var));
                }
            } else {
                p0();
                lj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f803c1.invalidate();
                invalidate();
                q0();
                jc jcVar2 = ((ac) this.Q1).d;
                jcVar2.I0 = false;
                jcVar2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f811e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f814f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f817g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                l9 l9Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = l9Var.f1202m;
                sc scVar = (sc) iVar.f(j10);
                if (scVar == null) {
                    scVar = new sc(l9Var.f1193a, j10, l9Var);
                    iVar.k(scVar, j10);
                }
                scVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            d6 d6Var = this.O1;
            d6Var.f707b = null;
            d6Var.f706a = null;
        }
        this.B1 = j3;
        this.f875z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        l9 l9Var = this.S1;
        TL_stories.PeerStories y3 = l9Var.y(j3);
        if (y3 == null) {
            y3 = l9Var.z(j3);
        } else {
            z10 = false;
        }
        l9Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        b6 b6Var = this.f839o1;
        if (j3 >= 0) {
            if (this.C1 && !z11) {
                b6Var.f583b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                b6Var.f583b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                pq pqVar = new pq(mutate, null);
                pqVar.f27303w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                pqVar.h = dp;
                pqVar.f27300n = dp2;
                b6Var.f583b.i(pqVar);
            } else {
                b6Var.f583b.i(null);
            }
            if (user != null) {
                b6Var.f583b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), b6Var.f583b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            b6Var.f583b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
        a6 a6Var = b6Var.f583b;
        a6 a6Var2 = b6Var.f583b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        a6Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            pq pqVar2 = new pq(mutate2, null);
            pqVar2.f27303w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            pqVar2.h = dp3;
            pqVar2.f27300n = dp4;
            a6Var2.i(pqVar2);
            return;
        }
        a6Var2.i(null);
    }

    public final void X0(float f7, float f10, m6 m6Var) {
        this.f833m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != m6Var) {
            this.l1 = m6Var;
            if (m6Var != null) {
                ImageReceiver imageReceiver = m6Var.f1251a;
                if (imageReceiver.getBitmap() != null) {
                    this.f811e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        d6 d6Var = this.O1;
        if (d6Var.f706a != null) {
            jc jcVar = this.J0;
            if (jcVar.f1080f != null) {
                String e = d6Var.e();
                if (z10) {
                    x3 x3Var = new x3(2, this.B0);
                    if (this.D1) {
                        chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.C2).storiesEnabled() && ((!this.D1 && !UserObject.isService(this.B1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j4 j4Var = new j4(this, jcVar.f1080f.getContext(), e, e, z11, x3Var);
                    this.Z2 = j4Var;
                    j4Var.f29723i0 = true;
                    TL_stories.StoryItem storyItem = d6Var.f706a;
                    storyItem.dialogId = this.B1;
                    j4Var.F0 = storyItem;
                    j4Var.f29735s0 = new xa.c(this, 2);
                    ((ac) this.Q1).h(j4Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        a5 a5Var = this.f803c1;
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        wh.o(R.string.UnsupportedAttachment, new xc(a5Var, e6Var), e6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
        b2Var.T = string;
        ((ac) this.Q1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.f853s3 != z10) {
            d6 d6Var = this.O1;
            if (d6Var.f706a != null) {
                this.f853s3 = z10;
                if (z10) {
                    this.f850r3.setVisibility(0);
                }
                this.f850r3.setStoryItem(d6Var.f706a);
                jc jcVar = ((ac) this.Q1).d;
                jcVar.f1101p1 = z10;
                jcVar.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f856t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f850r3.setTransitionProgress(this.f856t3);
                    ofFloat.addUpdateListener(new d3(this, 1));
                    ofFloat.addListener(new u3(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(qr.f27716g);
                    ofFloat.start();
                    return;
                }
                if (this.f850r3.getReactionsWindow() != null) {
                    this.f850r3.getReactionsWindow().e();
                }
                this.f850r3.animate().alpha(0.0f).setDuration(150L).setListener(new v3(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            ci.f4 f4Var = new ci.f4(getContext(), 1);
            f4Var.l(1.0f, -56.0f);
            this.G0 = f4Var;
            f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f803c1.addView(this.G0, w7.y5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        ci.f4 f4Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        f4Var2.s(LocaleController.getString(i10));
        this.G0.u();
    }

    public final boolean d1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.J1 < getStoriesCount() - 1) {
                this.J1++;
                f1(false);
                return true;
            }
        } else {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        d2 d2Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j3 = 0;
        jc jcVar = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || jcVar.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f1717b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                f9 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o9 != null && o9.a(this.C2, 1) && this.Q1 != null) {
                    y3 y3Var = new y3(this, 0);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.G1;
                    }
                    ((ac) this.Q1).h(new rg.j0(o9.b(), this.C2, findActivity, y3Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
                if (this.B1 >= 0 && !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F1 != z10 || this.H1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.F1 = z10;
                    this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    f1(false);
                    r0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f18297id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (jcVar != null && (d2Var = jcVar.A0) != null && d2Var.g() == longValue) {
                    f1(false);
                    a4 a4Var = this.f800b2;
                    if (a4Var != null) {
                        a4Var.K(true);
                        this.f800b2.P1(true);
                        r0(true);
                    }
                    r3 r3Var = this.L0;
                    if (r3Var != null) {
                        d2 d2Var2 = r3Var.P;
                        if (d2Var2 != null) {
                            j3 = d2Var2.j();
                        }
                        if (r3Var.H != j3) {
                            r3Var.e.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            } else {
                return;
            }
        }
        y5 y5Var = this.Q1;
        if (y5Var == null || !((ac) y5Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((ac) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f860v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f864w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = jcVar.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j10 = this.B1;
                if (j10 != 0) {
                    l9 l9Var = this.S1;
                    TL_stories.PeerStories y3 = l9Var.y(j10);
                    if (y3 == null) {
                        y3 = l9Var.z(j10);
                        z11 = true;
                    }
                    l9Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.f1 f1Var = this.f851s1;
            if (f1Var != null) {
                ViewPropertyAnimator animate = f1Var.animate();
                if (this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) {
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
        org.telegram.ui.Components.o6 o6Var;
        org.telegram.ui.Components.o6 o6Var2;
        l1();
        if (this.D1 && (o6Var2 = this.Q0) != null) {
            o6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (o6Var = this.R0) != null) {
            o6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f859u3;
        LinearLayout linearLayout = this.O0;
        m4 m4Var = this.D0;
        if (z10) {
            float measuredWidth = (m4Var.getMeasuredWidth() / 2.0f) + m4Var.getX() + linearLayout.getX();
            float measuredHeight = (m4Var.getMeasuredHeight() / 2.0f) + m4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f866w3, measuredWidth - f7, qr.f27716g.getInterpolation(this.f862v3));
            float lerp2 = AndroidUtilities.lerp(this.f870x3, measuredHeight - f7, this.f862v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f862v3);
            if (this.f844p3) {
                org.telegram.ui.Components.q5 q5Var = this.f841o3;
                if (q5Var != null) {
                    float f10 = lerp3;
                    q5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f841o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f838n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f847q3) {
            float measuredWidth2 = (m4Var.getMeasuredWidth() / 2.0f) + m4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (m4Var.getMeasuredHeight() / 2.0f) + m4Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f844p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f832l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f847q3 = false;
                }
            } else {
                zg.d dVar = this.f835m3;
                if (dVar != null) {
                    float f16 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f835m3.b(canvas);
                    if (this.f835m3.c()) {
                        this.f835m3.d(this);
                        this.f835m3 = null;
                        this.f847q3 = false;
                    }
                } else {
                    this.f847q3 = false;
                }
            }
        }
        a4 a4Var = this.f800b2;
        if (a4Var != null) {
            me meVar = a4Var.f22050x1;
            ke keVar2 = a4Var.f22056y1;
            if (a4Var.getAlpha() != 0.0f && (keVar = a4Var.f21945e1) != null && keVar.getParent() != null && a4Var.f21945e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(a4Var.f21945e1.getX() + meVar.getX() + keVar2.getX() + a4Var.getX(), a4Var.f21945e1.getY() + meVar.getY() + keVar2.getY() + a4Var.getY());
                if (a4Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, a4Var.getMeasuredWidth(), a4Var.getMeasuredHeight(), (int) (a4Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                a4Var.f21945e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qk0 qk0Var;
        qk0 qk0Var2;
        fh.d dVar;
        float dp;
        float f7;
        if (view == this.f809d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f809d3.getY(), getMeasuredWidth(), this.f809d3.getY() + this.f809d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        a4 a4Var = this.f800b2;
        Paint paint = this.f837n2;
        m4 m4Var = this.D0;
        c6 c6Var = this.f868x1;
        if (view == a4Var) {
            float f10 = this.f846q2;
            d6 d6Var = this.O1;
            if (f10 > 0.0f && !d6Var.f709f) {
                c6Var.f635l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c6Var.f635l);
            }
            RectF rectF = c6Var.h;
            RectF rectF2 = c6Var.f632i;
            RectF rectF3 = c6Var.f633j;
            rectF.set(this.f800b2.getX(), this.f800b2.getY() + this.f800b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f800b2.getX() + this.f800b2.getMeasuredWidth(), this.f800b2.getY() + this.f800b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!d6Var.f709f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (m4Var != null && m4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + m4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                r2 r2Var = this.a2;
                if (r2Var != null && r2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f800b2.getY() + this.f800b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f800b2.getY() + this.f800b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f800b2.setTranslationX((1.0f - this.f846q2) * dp);
            if (this.f800b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f846q2) * (this.f800b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f800b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.f846q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, c6Var.h, this.f846q2, rectF3);
            ch.d dVar2 = this.f831l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f810d4) * (1.0f - this.f849r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f846q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (a4Var != null && a4Var.u0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = c6Var.f634k;
            RectF rectF5 = c6Var.f634k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f798a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            ch.d dVar3 = this.f834m2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.r(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f815f2 && this.f800b2 != null) {
                view.setTranslationY(((this.f800b2.getY() + this.f800b2.getAnimatedTop()) + (-qk0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f850r3) {
                    view.setTranslationY((this.O0.getY() + (m4Var.getY() + (-(qk0Var2.getMeasuredHeight() - this.f850r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    a5 a5Var = this.f803c1;
                    if (view == a5Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f9077n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(a5Var.getX(), a5Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            j4 j4Var = this.Z2;
            if (j4Var != null) {
                j4Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c3(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f875z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        a5 a5Var = this.f803c1;
        Bitmap createBitmap = Bitmap.createBitmap(a5Var.getWidth(), a5Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public l9 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f860v1.size()) + this.f864w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f860v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f821h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f824i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f821h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f824i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f824i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f875z1;
        jc jcVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f864w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((k9) arrayList2.get(i11)).f1141a;
                    if (((int) (j3 ^ (j3 >>> 32))) == jcVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f875z1.indexOf(Integer.valueOf(jcVar.P0));
            if (indexOf < 0 && !this.f875z1.isEmpty()) {
                if (jcVar.P0 > ((Integer) this.f875z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (jcVar.P0 < ((Integer) hg.k0.g(1, this.f875z1)).intValue()) {
                    indexOf = this.f875z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = jcVar.f1079e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !jcVar.N0 && (peerStories = this.f857u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f860v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f18531id > this.f857u1.max_read_id) {
                        this.J1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.J1 == -1) {
            this.J1 = 0;
        }
    }

    public final void j1() {
        d9 d9Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f860v1;
        arrayList.clear();
        jc jcVar = this.J0;
        if (jcVar.N0) {
            if (!jcVar.S0) {
                arrayList.add(jcVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.f875z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f864w1;
            if (arrayList2 != null && (d9Var = jcVar.O0) != null) {
                if (d9Var instanceof t8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((t8) jcVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            k9 k9Var = (k9) E.get(i11);
                            ci.o8 o8Var = k9Var.f1143c;
                            if (o8Var != null && !o8Var.f5157g && TextUtils.equals(o8Var.K0, str)) {
                                arrayList3.add(k9Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f875z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = jcVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (jcVar.O0 != null) {
                while (i10 < jcVar.O0.f721i.size()) {
                    arrayList.add(((MessageObject) jcVar.O0.f721i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = jcVar.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f857u1 = jcVar.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f857u1 = y3;
                    if (y3 == null) {
                        this.f857u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f857u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f857u1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.S1.E(this.B1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        f6 currentPeerView;
        b60 b60Var = this.J2;
        if (b60Var != null) {
            b60Var.f22834d0 = null;
            b60Var.a(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f706a;
        jc jcVar = this.J0;
        jcVar.getClass();
        if (j3 != 0 && storyItem != null) {
            jc.E1.remove(j3 + (j3 >> 16) + (storyItem.f18531id << 16));
        }
        this.f825i3 = true;
        zb zbVar = jcVar.f1096n0;
        if (zbVar != null && (currentPeerView = zbVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            org.telegram.ui.Components.qc I = new xc(this.f803c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c3(this, 2));
            I.f27558r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        d6 d6Var = this.O1;
        TL_stories.StoryItem storyItem = d6Var.f706a;
        if (storyItem == null) {
            storyItem = d6Var.f708c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                jc jcVar = this.J0;
                m4 m4Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.o6 o6Var = this.R0;
                    if (o6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        o6Var.q(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.o6 o6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        o6Var2.q(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.e6 e6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        e6Var.d(f10, true);
                        org.telegram.ui.Components.e6 e6Var2 = this.T0;
                        if (e6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            e6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (jcVar.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new oq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = m4Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + m4Var.getLayoutParams().width;
                    m4 m4Var2 = this.P0;
                    if (m4Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = m4Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += m4Var2.getLayoutParams().width;
                        m4Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    m4Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = d6Var.f706a;
                    v4 v4Var = this.f826j1;
                    if (storyItem2 == null) {
                        v4Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < v4Var.getChildCount(); i14++) {
                        if (v4Var.getChildAt(i14) instanceof pb) {
                            ((pb) v4Var.getChildAt(i14)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.C2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.B2.b(i15, userOrChat, this.C2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.B2.b(i17, null, this.C2);
                    }
                    this.B2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        oq oqVar = new oq(R.drawable.mini_views_likes, 0);
                        oqVar.setOverrideColor(-53704);
                        oqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(oqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        oq oqVar2 = new oq(R.drawable.mini_repost_story, 0);
                        oqVar2.setOverrideColor(-14161823);
                        oqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(oqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + hg.k0.f(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (jcVar.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                m4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        q9 q9Var = this.E0;
        q9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new w3(0, q9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        q9 q9Var2 = new q9(getContext(), this.f868x1);
        this.E0 = q9Var2;
        q9Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.y5.e(40, 40, 3));
        this.f847q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        a4 a4Var;
        float heightWithTopView;
        float f13;
        float f14;
        float f15;
        float dp;
        int i10;
        float f16;
        float f17;
        m4 m4Var;
        ImageView imageView;
        h5 h5Var;
        m4 m4Var2;
        boolean z11;
        float f18;
        qk0 qk0Var;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22 = ((ac) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.e6 e6Var = this.O2;
        e6Var.d(f7, false);
        int i12 = this.f855t2;
        if (i12 != 0 && this.f858u2) {
            f10 = w7.q.a(this.H2 / i12, 0.0f, 1.0f);
        } else if (this.f861v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.e6 e6Var2 = this.W3;
        float f23 = e6Var2.f23794c;
        org.telegram.ui.Components.e6 e6Var3 = this.X3;
        float f24 = e6Var3.f23794c;
        org.telegram.ui.Components.e6 e6Var4 = this.Y3;
        float f25 = e6Var4.f23794c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        e6Var2.d(f11, false);
        if (!this.f825i3) {
            a4 a4Var2 = this.f800b2;
            if (a4Var2 != null && !TextUtils.isEmpty(a4Var2.getFieldText())) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            e6Var3.d(f21, false);
        }
        a4 a4Var3 = this.f800b2;
        if (a4Var3 != null && a4Var3.y3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        e6Var4.d(f12, false);
        final a4 a4Var4 = this.f800b2;
        if (a4Var4 != null) {
            f6 f6Var = a4Var4.f516r5;
            int backgroundTop = a4Var4.getBackgroundTop();
            int i13 = a4Var4.f514o5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (a4Var4.S1 + i13) - backgroundTop;
                a4Var4.setAnimatedTop(i14);
                f6Var.V2 = true;
                ValueAnimator valueAnimator = f6Var.f812e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    f6Var.f812e2.cancel();
                }
                View view = a4Var4.F1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var4.F1.setTranslationY(((1.0f - a4Var4.getTopViewEnterProgress()) * a4Var4.F1.getLayoutParams().height) + a4Var4.S1);
                }
                f6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                f6Var.f812e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                a4 a4Var5 = a4Var4;
                                a4Var5.getClass();
                                a4Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f6 f6Var2 = a4Var5.f516r5;
                                f6Var2.V2 = true;
                                f6Var2.invalidate();
                                a4Var5.invalidate();
                                return;
                            default:
                                a4Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                f6Var.f812e2.addListener(new b(a4Var4, 4));
                f6Var.f812e2.setDuration(250L);
                f6Var.f812e2.setInterpolator(ji.n.V);
                f6Var.f812e2.start();
                a4Var4.f514o5 = 0;
            }
            if (a4Var4.f21992m3) {
                float scrollY = (a4Var4.f515q5 - a4Var4.E0.getScrollY()) + (a4Var4.p5 - a4Var4.E0.getMeasuredHeight());
                pf pfVar = a4Var4.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(a4Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                a4 a4Var5 = a4Var4;
                                a4Var5.getClass();
                                a4Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f6 f6Var2 = a4Var5.f516r5;
                                f6Var2.V2 = true;
                                f6Var2.invalidate();
                                a4Var5.invalidate();
                                return;
                            default:
                                a4Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = a4Var4.f513n5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                a4Var4.f513n5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                a4Var4.f21992m3 = false;
                f6Var.l1();
            }
            a4Var4.getMeasuredHeight();
        }
        a4 a4Var5 = this.f800b2;
        if (a4Var5 != null && a4Var5.t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f869x2;
        Paint paint = this.f837n2;
        if (z12) {
            paint.setColor(i0.a.d(this.f846q2, -14933463, org.telegram.ui.ActionBar.j6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.f810d4) * org.telegram.messenger.q.A(1.0f, this.f849r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.f810d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        jc jcVar = this.J0;
        if (z13 || this.Z3 != jcVar.f1076d0 || e6Var.f23794c != this.Q2 || this.f852s2 != this.H2 || f10 != this.f846q2 || f22 != this.f849r2 || f23 != e6Var2.f23794c || z10 || f25 != e6Var4.f23794c || f24 != e6Var3.f23794c) {
            this.V2 = false;
            this.f852s2 = this.H2;
            float f26 = e6Var.f23794c;
            float f27 = this.Q2;
            a5 a5Var = this.f803c1;
            if (f26 != f27) {
                a5Var.invalidate();
            }
            if (f22 != 0.0f) {
                a5Var.setLayerType(2, null);
            } else {
                a5Var.setLayerType(0, null);
            }
            this.Q2 = e6Var.f23794c;
            this.f849r2 = f22;
            this.f846q2 = f10;
            this.Z3 = jcVar.f1076d0;
            float height = this.H2 - (getHeight() - a5Var.getBottom());
            if (this.f800b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = a4Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f840o2 - (getHeight() - a5Var.getBottom());
            a4 a4Var6 = this.f800b2;
            if (a4Var6 == null) {
                f14 = 0.0f;
            } else {
                float heightWithTopView2 = a4Var6.getHeightWithTopView();
                if (this.f861v2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                f14 = heightWithTopView2 * f13;
            }
            float max2 = Math.max(0.0f, height2 + f14);
            a4 a4Var7 = this.f800b2;
            if (a4Var7 != null) {
                if (this.f808d2 != null) {
                    ImageView suggestButton = a4Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f808d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f808d2.setTranslationY(-((getHeight() - this.f800b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                bu editField = this.f800b2.getEditField();
                kp0 senderSelectView = this.f800b2.getSenderSelectView();
                if (editField != null) {
                    f20 = 1.0f;
                    f15 = 6.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f10);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f20 = 1.0f;
                    f15 = 6.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f20, f10);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f10));
                }
            } else {
                f15 = 6.0f;
            }
            if (this.f869x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f869x2 && !this.f861v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f15) * f10) + max3;
            r3 r3Var = this.L0;
            w0 w0Var = r3Var.f1330c;
            r3Var.K = dp2;
            if (Math.abs(r3Var.L - max4) > 0.1f) {
                r3Var.L = max4;
                f17 = 0.8f;
                f16 = 8.0f;
                w0Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - w0Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!w0Var.canScrollVertically(1)) {
                    r3Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f16 = 8.0f;
                f17 = 0.8f;
            }
            r3Var.setTranslationY(-r3Var.K);
            r3Var.invalidate();
            ci.l4 l4Var = jcVar.D0;
            if (l4Var != null) {
                l4Var.setKeyboardOffset(max);
            }
            qk0 qk0Var2 = this.f815f2;
            d6 d6Var = this.O1;
            if (qk0Var2 != null) {
                if (this.f846q2 > 0.0f && (d6Var == null || !d6Var.f709f)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                qk0Var2.setVisibility(i11);
            }
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                m4Var = this.P0;
                imageView = this.N0;
                h5Var = this.K0;
                m4Var2 = this.D0;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != h5Var.W.o(getContext())) {
                    a4 a4Var8 = this.f800b2;
                    if (a4Var8 != null && childAt == a4Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f800b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof i40) {
                        i40 i40Var = (i40) childAt;
                        View view2 = i40Var.e;
                        if (view2 != null) {
                            i40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != a5Var && childAt != imageView && childAt != this.O0 && childAt != m4Var && childAt != this.W2 && childAt != this.f808d2 && childAt != m4Var2 && ((qk0Var = this.f850r3) == null || qk0Var.getReactionsWindow() == null || childAt != this.f850r3.getReactionsWindow().f49228c)) {
                        float f28 = this.f846q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f16) * f29)) - (AndroidUtilities.dp(20.0f) * jcVar.f1076d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f869x2) {
                            f19 = (1.0f - this.f849r2) * hideInterfaceAlpha;
                        } else {
                            f19 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f801b3) {
                            dp3 = jcVar.f1076d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f809d3) {
                            dp3 -= this.f800b2.getMeasuredHeight() - this.f800b2.getAnimatedTop();
                            f19 = this.f846q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f804c2) {
                            dp3 -= this.f800b2.getMeasuredHeight() - this.f800b2.getAnimatedTop();
                            f19 *= this.f846q2;
                        }
                        if (childAt == this.f815f2) {
                            float f30 = (1.0f - e6Var3.f23794c) * (1.0f - f25) * (1.0f - e6Var2.f23794c) * this.f846q2;
                            float f31 = f19 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f815f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            a4 a4Var9 = this.f800b2;
                            if (a4Var9 == null || childAt != a4Var9.N1) {
                                childAt.setAlpha(f19);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f869x2) {
                        childAt.setAlpha((1.0f - this.f810d4) * (1.0f - this.f849r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f810d4) * hideInterfaceAlpha);
                    }
                    i15++;
                }
                i15++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f22) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f810d4) * f34);
            m4Var2.setAlpha((1.0f - this.f810d4) * f34);
            if (m4Var != null) {
                m4Var.setAlpha((1.0f - this.f810d4) * f34);
            }
            for (int i16 = 0; i16 < a5Var.getChildCount(); i16++) {
                View childAt2 = a5Var.getChildAt(i16);
                if (childAt2 != null && childAt2 != this.M0) {
                    b6 b6Var = this.f839o1;
                    x5 x5Var = this.f871y0;
                    if (childAt2 != b6Var && childAt2 != this.f863w0 && childAt2 != this.f867x0 && childAt2 != x5Var && childAt2 != this.W1 && childAt2 != h5Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == x5Var) {
                            f18 = this.f813e3;
                        } else {
                            f18 = 1.0f;
                        }
                        if (childAt2 == h5Var) {
                            childAt2.setAlpha((1.0f - this.f810d4) * f18 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f810d4) * f18 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f800b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!d6Var.f709f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (m4Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + m4Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    r2 r2Var = this.a2;
                    if (r2Var != null && r2Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                a4 a4Var10 = this.f800b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f846q2;
                if ((this.S2 || this.E1) && !d6Var.f709f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a4Var10.g1(f35, f36, f37, z11);
                if (this.f800b2.getEmojiView() != null) {
                    this.f800b2.getEmojiView().setAlpha(this.f846q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f806c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f810d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f806c4 = ofFloat;
        ofFloat.addUpdateListener(new d3(this, 2));
        this.f806c4.addListener(new u3(this, z10, 1));
        this.f806c4.setDuration(420L);
        this.f806c4.setInterpolator(qr.h);
        this.f806c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f830k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.B0);
            b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 5);
            b2Var.f18663l0 = string;
            b2Var.m0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            w1 w1Var = new w1(5);
            b2Var.f18665n0 = string2;
            b2Var.f18666o0 = w1Var;
            b2Var.show();
            return;
        }
        runnable.run();
    }

    public final void o0(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        b6 b6Var = this.f839o1;
        org.telegram.ui.Components.h9 h9Var = this.f836n1;
        if (j3 >= 0) {
            if (j3 == UserConfig.getInstance(this.C2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.C1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            if (!UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.F1 = z15;
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            h9Var.m(this.C2, user);
            b6Var.f582a.getImageReceiver().setForUserOrChat(user, h9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j3) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.B3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.E1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.C2).getChatFull(-this.B1) == null) {
                MessagesStorage.getInstance(this.C2).loadChatInfo(-this.B1, true, new CountDownLatch(1), false, false);
            }
            if (this.E1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F1 = z10;
            this.H1 = MessagesController.getInstance(this.C2).getSendPaidMessagesStars(this.B1);
            h9Var.k(this.C2, chat);
            b6Var.f582a.getImageReceiver().setForUserOrChat(chat, h9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            l9 l9Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = l9Var.f1202m;
            sc scVar = (sc) iVar.f(j10);
            if (scVar == null) {
                scVar = new sc(l9Var.f1193a, j10, l9Var);
                iVar.k(scVar, j10);
            }
            scVar.b(true);
        }
        j1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z16 = this.D1;
        a5 a5Var = this.f803c1;
        jc jcVar = this.J0;
        int i13 = 8;
        d6 d6Var = this.O1;
        if (z16) {
            B0();
            if (this.f800b2 == null && (this.E1 || d6Var.f709f)) {
                v0();
            }
            if (this.f800b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                a4 a4Var = this.f800b2;
                if (d6Var.f709f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i13 = 0;
                }
                a4Var.setVisibility(i13);
                a4 a4Var2 = this.f800b2;
                boolean z17 = d6Var.f709f;
                D0(true);
                a4Var2.h1(z17);
                a4 a4Var3 = this.f800b2;
                if (d6Var.f709f && !D0(true) && (this.f861v2 || this.f800b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                a4Var3.n1(z13, true);
                bu editField = this.f800b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = d6Var.f706a;
                jcVar.getClass();
                editField.setText(jc.u(j11, storyItem));
                this.f800b2.a1(this.C2, this.B1);
                this.f800b2.J1(chat2, null);
            }
            org.telegram.ui.Components.o6 o6Var = this.Q0;
            org.telegram.ui.ActionBar.e6 e6Var = this.B0;
            if (o6Var == null) {
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(false, false, false, false);
                this.Q0 = o6Var2;
                m4 m4Var = this.D0;
                o6Var2.setCallback(m4Var);
                this.Q0.r(e6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.e6(m4Var);
            }
            m4 m4Var2 = this.P0;
            if (m4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(false, false, false, false);
                this.R0 = o6Var3;
                o6Var3.setCallback(m4Var2);
                this.R0.r(e6Var.G0(org.telegram.ui.ActionBar.j6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.e6(m4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            a5Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (d6Var.f709f) {
                this.W1.setVisibility(8);
                if (this.f800b2 == null) {
                    v0();
                }
                this.f800b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                a4 a4Var4 = this.f800b2;
                if (a4Var4 != null) {
                    a4Var4.setVisibility(8);
                }
            }
            a4 a4Var5 = this.f800b2;
            if (a4Var5 != null) {
                boolean z18 = d6Var.f709f;
                D0(true);
                a4Var5.h1(z18);
                a4 a4Var6 = this.f800b2;
                if (d6Var.f709f && !D0(true) && (this.f861v2 || this.f800b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                a4Var6.n1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f875z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(jcVar.P0));
                    if (indexOf < 0 && !this.f875z1.isEmpty()) {
                        if (jcVar.P0 > ((Integer) this.f875z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (jcVar.P0 < ((Integer) hg.k0.g(1, this.f875z1)).intValue()) {
                            indexOf = this.f875z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f864w1.isEmpty();
                    ArrayList arrayList2 = this.f860v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f18531id > this.S1.f1196f.get(this.B1)) {
                                this.J1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            a5Var.invalidate();
            invalidate();
        } else {
            if (this.f800b2 == null) {
                v0();
            }
            if (this.F1 && this.f818g2 == null) {
                z0();
            }
            if (this.f818g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f818g2;
                if ((this.F1 && !d6Var.f709f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            gb gbVar = this.f827j2;
            if (gbVar != null) {
                gbVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            a4 a4Var7 = this.f800b2;
            if (a4Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                a4Var7.setVisibility(i11);
                a4 a4Var8 = this.f800b2;
                boolean z19 = d6Var.f709f;
                D0(true);
                a4Var8.h1(z19);
                a4 a4Var9 = this.f800b2;
                if (d6Var.f709f && !D0(true) && (this.f861v2 || this.f800b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a4Var9.n1(z11, true);
                bu editField2 = this.f800b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = d6Var.f706a;
                jcVar.getClass();
                editField2.setText(jc.u(j12, storyItem2));
                this.f800b2.a1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f800b2.J1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f876z2, false);
                }
            }
            this.A1 = getStoriesCount();
            m4 m4Var3 = this.W1;
            if (m4Var3 != null) {
                m4Var3.setVisibility(8);
            }
            a5Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f796a1 = true;
        this.f811e1.onAttachedToWindow();
        this.f817g1.onAttachedToWindow();
        this.f814f1.onAttachedToWindow();
        this.f832l3.onAttachedToWindow();
        this.f838n3.onAttachedToWindow();
        a4 a4Var = this.f800b2;
        if (a4Var != null) {
            a4Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f820h1;
            if (i10 < arrayList.size()) {
                ((zg.f0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f796a1 = false;
        this.f811e1.onDetachedFromWindow();
        this.f817g1.onDetachedFromWindow();
        this.f814f1.onDetachedFromWindow();
        this.f832l3.onDetachedFromWindow();
        this.f838n3.onDetachedFromWindow();
        a4 a4Var = this.f800b2;
        if (a4Var != null) {
            a4Var.D0();
        }
        org.telegram.ui.Components.q5 q5Var = this.f841o3;
        if (q5Var != null) {
            q5Var.o(this);
            this.f841o3 = null;
        }
        zg.d dVar = this.f835m3;
        if (dVar != null) {
            dVar.d(this);
            this.f835m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f820h1;
            if (i10 < arrayList.size()) {
                ((zg.f0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f868x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f846q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        h5 h5Var = this.K0;
        if (h5Var.W.y()) {
            h5Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((ac) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f800b2 != null && this.f816f3 && this.f796a1) {
            c3 c3Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f800b2.K(true);
            boolean z11 = this.F1;
            d6 d6Var = this.O1;
            if ((z11 && !d6Var.f709f) || this.G1) {
                this.f830k3 = false;
                this.f800b2.setEnabled(false);
                this.f800b2.i1(" ", z10);
            } else if (this.H1 > 0) {
                this.f830k3 = false;
                this.f800b2.setEnabled(true);
                this.f800b2.i1(yh.v7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!d6Var.f709f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f830k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f800b2.setEnabled(true);
                        if (((int) this.f800b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f800b2.getEditField().getMeasuredWidth()) {
                            a4 a4Var = this.f800b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            a4Var.e = formatString2;
                            a4Var.f21950f = format;
                            a4Var.F1(z10);
                        } else {
                            this.f800b2.i1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(c3Var, 1000L);
                        return;
                    }
                }
                this.f830k3 = false;
                this.f800b2.setEnabled(true);
                if (d6Var.f709f) {
                    long starsPrice = this.f800b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f800b2.i1(yh.v7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f800b2.N4), z10);
                        oq oqVar = this.f800b2.N4[0];
                        if (oqVar != null) {
                            oqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f800b2.i1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                a4 a4Var2 = this.f800b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                a4Var2.i1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f853s3) {
            if (this.f850r3.getReactionsWindow() != null) {
                if (this.f873y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f850r3.getReactionsWindow().f49228c);
                    return true;
                }
                this.f850r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        v4 v4Var = this.f826j1;
        if (v4Var != null) {
            ci.f4 f4Var = v4Var.f1266c;
            if (f4Var != null) {
                f4Var.e(true);
                v4Var.f1266c = null;
            }
            v4Var.f1265b = null;
            v4Var.invalidate();
            v4Var.b(false);
        }
        h5 h5Var = this.K0;
        if (h5Var.W.y()) {
            h5Var.W.f(false);
            return true;
        }
        ci.f4 f4Var2 = this.F0;
        if (f4Var2 != null) {
            f4Var2.e(true);
        }
        ci.f4 f4Var3 = this.G0;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        i40 i40Var = this.W2;
        if (i40Var != null) {
            i40Var.b(true);
        }
        w5 w5Var = this.f854t1;
        if (w5Var != null && w5Var.f30366b) {
            w5Var.a();
            return true;
        }
        a4 a4Var = this.f800b2;
        if (a4Var != null && a4Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f800b2.f21933c1) {
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f18622a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((ac) this.Q1).h(alertDialog$Builder.f18622a);
            return true;
        }
        qk0 qk0Var = this.f815f2;
        if (qk0Var != null && qk0Var.getReactionsWindow() != null && !this.f815f2.getReactionsWindow().f49239q) {
            this.f815f2.getReactionsWindow().d();
            return true;
        }
        a4 a4Var2 = this.f800b2;
        if (a4Var2 != null && a4Var2.t0()) {
            if (this.f873y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f800b2.getEmojiView());
                return true;
            }
            this.f800b2.n0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            a4 a4Var3 = this.f800b2;
            if (a4Var3 != null) {
                long j3 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f706a;
                Editable editText = a4Var3.getEditText();
                this.J0.getClass();
                jc.J(j3, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f800b2);
            return true;
        } else if (h5Var.getVisibility() != 0 || h5Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            h5Var.C();
            this.f819g3 = false;
            this.f803c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f828k1.f33970b = i10;
        qk0 qk0Var = this.f815f2;
        if (qk0Var != null) {
            qk0Var.setCurrentAccount(i10);
            this.f815f2.p(null, null, true);
        }
        qk0 qk0Var2 = this.f850r3;
        if (qk0Var2 != null) {
            qk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(y5 y5Var) {
        this.Q1 = y5Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f816f3 != z10) {
            this.f816f3 = z10;
            if (z10) {
                this.f811e1.setCurrentAlpha(1.0f);
                r0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.K1) {
            this.L2 = z10;
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
        if (this.f799b1 != z10) {
            this.f799b1 = z10;
            this.f803c1.invalidate();
            if (this.K1 && this.J0.f1067a && Build.VERSION.SDK_INT < 33) {
                q4 q4Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(q4Var);
                    AndroidUtilities.runOnUIThread(q4Var, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(q4Var);
                jc jcVar = ((ac) this.Q1).d;
                jcVar.l1 = true;
                jcVar.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            l4 l4Var = this.f811e1;
            if (z10) {
                l4Var.stopAnimation();
                l4Var.setAllowStartAnimation(false);
            } else {
                l4Var.startAnimation();
                l4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f803c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            g4 g4Var = new g4(this, getContext(), this.B0);
            this.I2 = g4Var;
            g4Var.Z1 = new h4(this);
            g4Var.f29033j0.f0();
            g4 g4Var2 = this.I2;
            g4Var2.W = true;
            g4Var2.r1();
            g4 g4Var3 = this.I2;
            g4Var3.X = new i4(this);
            g4Var3.m1().setText(this.f800b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            c cVar = new c(getContext(), this.I3);
            this.X1 = cVar;
            cVar.setOnClickListener(new e3(this, 1));
            addView(this.X1, w7.y5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.B0;
        a4 a4Var = new a4(this, AndroidUtilities.findActivity(getContext()), this, new x3(1, e6Var));
        this.f800b2 = a4Var;
        a4Var.getEditField().useAnimatedTextDrawable();
        this.f800b2.getEditField().setScaleX(0.0f);
        this.f800b2.setOverrideKeyboardAnimation(true);
        this.f800b2.setClipChildren(false);
        this.f800b2.setDelegate(new b4(this));
        setDelegate(this.f800b2);
        a4 a4Var2 = this.f800b2;
        a4Var2.f22053x4 = false;
        a4Var2.f22058y4 = true;
        if (this.O1.f709f) {
            a4Var2.U0(false, false, false);
        } else {
            a4Var2.U0(true, true, false);
        }
        this.f800b2.e();
        a4 a4Var3 = this.f800b2;
        a4Var3.f22063z4 = true;
        addView(a4Var3, w7.y5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.f800b2.P1(false);
        }
        this.f800b2.F2 = this.f876z2;
        e6 e6Var2 = this.M2;
        ((ArrayList) e6Var2.f768g).add(this.f803c1);
        ((ArrayList) e6Var2.f768g).add(this);
        if (this.f796a1) {
            this.f800b2.E0();
        }
        r0(false);
        if (I0()) {
            this.f800b2.setVisibility(8);
        }
        jh.h hVar = new jh.h(getContext(), e6Var, this.I3, this.F3);
        this.f804c2 = hVar;
        hVar.setOnClickListener(new y2(this, 1));
        addView(this.f804c2, w7.y5.e(57, 300, 85));
        this.f804c2.setVisibility(8);
        this.f800b2.setSideButtonsForAttach(this.f804c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f827j2 != null) {
            return;
        }
        gb gbVar = new gb(getContext(), this.B0);
        this.f827j2 = gbVar;
        gbVar.setOnClickListener(new e3(this, 4));
        this.f827j2.setAlpha(0.0f);
        this.f827j2.setVisibility(8);
        addView(this.f827j2, w7.y5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            r2 r2Var = new r2(getContext(), this.I3);
            this.a2 = r2Var;
            r2Var.setOnClickListener(new e3(this, 5));
            r2 r2Var2 = this.a2;
            d2 d2Var = d2.W;
            boolean z11 = true;
            if (d2Var != null && d2Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var2.b(z10, false);
            r2 r2Var3 = this.a2;
            d2 d2Var2 = d2.W;
            if (d2Var2 != null && !d2Var2.m()) {
                z11 = false;
            }
            r2Var3.a(z11, false);
            addView(this.a2, w7.y5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new w2(getContext(), this.C2);
            x2 x2Var = new x2(getContext(), this.Y1, this.I3);
            this.Z1 = x2Var;
            x2Var.setOnClickListener(new e3(this, 6));
            this.Z1.setOnLongClickListener(new b3(this, 1));
            addView(this.Z1, w7.y5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.Y1, w7.y5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i10;
        if (this.f818g2 != null) {
            return;
        }
        if (this.f800b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f818g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f821h2 = textView;
        textView.setTextColor(-8026747);
        this.f821h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f821h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f824i2 = textView3;
        textView3.setTextColor(-1);
        this.f824i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f824i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f824i2.setGravity(17);
        w7.a6.a(this.f824i2);
        this.f824i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f824i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f818g2.addView(imageView, w7.y5.t(22, 22, 16, 12, 1, 4, 0));
        this.f818g2.addView(this.f821h2, w7.y5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f818g2.addView(this.f824i2, w7.y5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f800b2.addView(this.f818g2, w7.y5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
