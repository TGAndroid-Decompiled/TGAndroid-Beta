package ci;

import ai.nd;
import ai.wd;
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
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pr;
import org.telegram.ui.qy;
import org.telegram.ui.sn;
import org.telegram.ui.xu0;
public abstract class p4 extends nw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.g6 B0;
    public long B1;
    public v B2;
    public boolean B3;
    public final e9 C0;
    public boolean C1;
    public int C2;
    public pr C3;
    public final g3 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public m7 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public ei.x3 F0;
    public boolean F1;
    public h3 F2;
    public final bh.b F3;
    public ei.x3 G0;
    public boolean G1;
    public boolean G2;
    public final gh.a G3;
    public ei.x3 H0;
    public long H1;
    public float H2;
    public final gh.d H3;
    public int I0;
    public final float I1;
    public a3 I2;
    public final eh.b I3;
    public final z9 J0;
    public int J1;
    public l60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final u3 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final m2 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final o4 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final n4 O1;
    public final org.telegram.ui.Components.d6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final g3 P0;
    public final com.google.firebase.messaging.l P1;
    public final org.telegram.ui.Components.d6 P2;
    public final c2 P3;
    public org.telegram.ui.Components.n6 Q0;
    public i4 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.n6 R0;
    public boolean R1;
    public long R2;
    public final c2 R3;
    public org.telegram.ui.Components.d6 S0;
    public h7 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.d6 T0;
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
    public final androidx.activity.i V3;
    public long W0;
    public g3 W1;
    public p40 W2;
    public final org.telegram.ui.Components.d6 W3;
    public long X0;
    public a X1;
    public final xu0 X2;
    public final org.telegram.ui.Components.d6 X3;
    public boolean Y0;
    public w1 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.d6 Y3;
    public boolean Z0;
    public x1 Z1;
    public d3 Z2;
    public float Z3;
    public boolean f5649a1;
    public t1 a2;
    public FrameLayout f5650a3;
    public final Path f5651a4;
    public boolean f5652b1;
    public u2 f5653b2;
    public wd f5654b3;
    public boolean f5655b4;
    public final q3 f5656c1;
    public kh.h f5657c2;
    public boolean f5658c3;
    public ValueAnimator f5659c4;
    public final FrameLayout f5660d1;
    public ei.x3 f5661d2;
    public w2 f5662d3;
    public float f5663d4;
    public final f3 f5664e1;
    public ValueAnimator f5665e2;
    public float f5666e3;
    public final ImageReceiver f5667f1;
    public fl0 f5668f2;
    public boolean f5669f3;
    public final ImageReceiver f5670g1;
    public LinearLayout f5671g2;
    public boolean f5672g3;
    public final ArrayList f5673h1;
    public TextView f5674h2;
    public boolean f5675h3;
    public Runnable f5676i1;
    public TextView f5677i2;
    public boolean f5678i3;
    public final m3 f5679j1;
    public x8 f5680j2;
    public boolean f5681j3;
    public final qy f5682k1;
    public ViewPropertyAnimator f5683k2;
    public boolean f5684k3;
    public v4 l1;
    public final dh.d f5685l2;
    public final ImageReceiver f5686l3;
    public float f5687m1;
    public final dh.d f5688m2;
    public ah.e f5689m3;
    public final org.telegram.ui.Components.f9 f5690n1;
    public final Paint f5691n2;
    public final ImageReceiver f5692n3;
    public final l4 f5693o1;
    public int f5694o2;
    public org.telegram.ui.Components.p5 f5695o3;
    public final y8 f5696p1;
    public ValueAnimator f5697p2;
    public boolean f5698p3;
    public j6.l f5699q1;
    public float f5700q2;
    public boolean f5701q3;
    public int f5702r1;
    public float f5703r2;
    public fl0 f5704r3;
    public org.telegram.ui.ActionBar.e1 f5705s1;
    public float f5706s2;
    public boolean f5707s3;
    public g4 f5708t1;
    public int f5709t2;
    public float f5710t3;
    public TL_stories.PeerStories f5711u1;
    public boolean f5712u2;
    public boolean f5713u3;
    public final ArrayList f5714v1;
    public boolean f5715v2;
    public float f5716v3;
    public final ImageView f5717w0;
    public final ArrayList f5718w1;
    public boolean f5719w2;
    public int f5720w3;
    public final ImageView f5721x0;
    public final m4 f5722x1;
    public boolean f5723x2;
    public int f5724x3;
    public final h4 f5725y0;
    public final s4 f5726y1;
    public int f5727y2;
    public int y3;
    public final ak0 f5728z0;
    public ArrayList f5729z1;
    public final int f5730z2;
    public c2 f5731z3;

    public p4(Context context, final z9 z9Var, m4 m4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.f5652b1 = true;
        this.f5673h1 = new ArrayList();
        this.f5702r1 = -5;
        this.I1 = 1.0f;
        n4 n4Var = new n4(this);
        this.O1 = n4Var;
        this.f5700q2 = -1.0f;
        this.f5703r2 = -1.0f;
        this.f5706s2 = -1.0f;
        this.f5730z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.d6(this);
        this.P2 = new org.telegram.ui.Components.d6(this);
        xu0 xu0Var = new xu0();
        this.X2 = xu0Var;
        this.f5666e3 = 1.0f;
        this.P3 = new c2(this, 4);
        this.R3 = new c2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new androidx.activity.i(this, 9);
        this.W3 = new org.telegram.ui.Components.d6(this);
        this.X3 = new org.telegram.ui.Components.d6(this);
        this.Y3 = new org.telegram.ui.Components.d6(this);
        this.f5651a4 = new Path();
        xu0Var.E = new ya.c(this, 9);
        ?? obj = new Object();
        obj.f5635g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f5714v1 = new ArrayList();
        this.f5718w1 = new ArrayList();
        f3 f3Var = new f3(this, 0);
        this.f5664e1 = f3Var;
        f3Var.setCrossfadeWithOldImage(false);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.ignoreNotifications = true;
        f3Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5686l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5692n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f5667f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f5670g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        f3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f5690n1 = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.J0 = z9Var;
        this.f5722x1 = m4Var;
        this.P1 = m4Var.f5540g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        m4Var.f5544l.setColor(-16777216);
        this.f5691n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = g6Var;
        setClipChildren(false);
        m3 m3Var = new m3(this, context, this.f5656c1, g6Var, z9Var);
        this.f5679j1 = m3Var;
        eh.b bVar = new eh.b(g6Var, org.telegram.ui.ActionBar.k6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.a.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        ih.k kVar = new ih.k(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.f4365f = kVar;
        bVar2.f4366g = this;
        this.F3 = bVar2;
        this.f5685l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.f5688m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        q3 q3Var = new q3(this, context, m4Var, z9Var);
        this.f5656c1 = q3Var;
        q3Var.setClipChildren(false);
        this.f5682k1 = new qy(this.C2, q3Var);
        q3Var.addView(m3Var, w7.z5.c(-1.0f, -1));
        u3 u3Var = new u3(this, getContext(), z9Var.f6274y, z9Var, g6Var);
        this.K0 = u3Var;
        u3Var.f5876b0.setOnClickListener(new e2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(m4Var.f5545m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new e2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(m4Var.f5546n);
        imageView2.setPadding(dp, dp, dp, dp);
        g3 g3Var = new g3(this, getContext(), 1);
        this.P0 = g3Var;
        org.telegram.ui.Components.n6 n6Var = this.R0;
        if (n6Var != null) {
            n6Var.setCallback(g3Var);
        }
        g3Var.setWillNotDraw(false);
        g3Var.setOnClickListener(new e2(this, 12));
        g3 g3Var2 = new g3(this, getContext(), 2);
        this.D0 = g3Var2;
        org.telegram.ui.Components.n6 n6Var2 = this.Q0;
        if (n6Var2 != null) {
            n6Var2.setCallback(g3Var2);
        }
        g3Var2.setWillNotDraw(false);
        g3Var2.setOnClickListener(new e2(this, 13));
        g3Var2.setOnLongClickListener(new l2(0, this, z9Var));
        m7 m7Var = new m7(context, m4Var);
        this.E0 = m7Var;
        m7Var.setPadding(dp, dp, dp, dp);
        g3Var2.addView(this.E0, w7.z5.e(40, 40, 3));
        g3Var.addView(imageView2, w7.z5.e(40, 40, 3));
        w7.b6.b(g3Var2, 0.3f, 5.0f);
        w7.b6.b(g3Var, 0.3f, 5.0f);
        f3Var.setAllowLoadingOnAttachedOnly(true);
        f3Var.setParentView(q3Var);
        s4 s4Var = new s4(10);
        this.f5726y1 = s4Var;
        q3Var.setOutlineProvider(s4Var);
        q3Var.setClipToOutline(true);
        addView(q3Var);
        l4 l4Var = new l4(context, n4Var);
        this.f5693o1 = l4Var;
        l4Var.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f6180b;

            {
                this.f6180b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        p4 p4Var = this.f6180b;
                        long j10 = UserConfig.getInstance(p4Var.C2).clientUserId;
                        long j11 = p4Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        z9 z9Var2 = z9Var;
                        if (i11 == 0) {
                            Bundle i12 = org.telegram.ui.Cells.b1.i(1, "type");
                            i12.putLong("dialog_id", p4Var.B1);
                            z9Var2.H(new va0(i12, null));
                            return;
                        } else if (j11 > 0) {
                            z9Var2.H(ProfileActivity.o4(j11));
                            return;
                        } else {
                            z9Var2.H(sn.W9(j11));
                            return;
                        }
                    default:
                        p4 p4Var2 = this.f6180b;
                        if (p4Var2.O1.j()) {
                            z9Var.O();
                            if (!z9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            h4 h4Var = p4Var2.f5725y0;
                            if (!z9.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            h4Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        p4Var2.b1(true);
                        return;
                }
            }
        });
        q3Var.addView(l4Var, w7.z5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5660d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.z5.q(40, 40, 5));
        linearLayout.addView(g3Var, w7.z5.q(40, 40, 5));
        linearLayout.addView(g3Var2, w7.z5.q(40, 40, 5));
        addView(linearLayout, w7.z5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f5717w0 = imageView3;
        imageView3.setImageDrawable(m4Var.f5549q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        q3Var.addView(imageView3, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f5721x0 = imageView4;
        imageView4.setImageDrawable(m4Var.f5550r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        q3Var.addView(imageView4, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ah.g0(z9Var, 13));
        imageView3.setOnClickListener(new e0(this, g6Var, z9Var, context, m4Var, 1));
        h4 h4Var = new h4(context, 0);
        this.f5725y0 = h4Var;
        q3Var.addView(h4Var, w7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f5728z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        h4Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(m4Var.f5552t);
        h4Var.addView(imageView6);
        imageView6.setVisibility(8);
        e9 e9Var = new e9(context);
        this.C0 = e9Var;
        e9Var.setOnClickListener(new e2(this, 2));
        q3Var.addView(e9Var, w7.z5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        h4Var.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f6180b;

            {
                this.f6180b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        p4 p4Var = this.f6180b;
                        long j10 = UserConfig.getInstance(p4Var.C2).clientUserId;
                        long j11 = p4Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        z9 z9Var2 = z9Var;
                        if (i11 == 0) {
                            Bundle i12 = org.telegram.ui.Cells.b1.i(1, "type");
                            i12.putLong("dialog_id", p4Var.B1);
                            z9Var2.H(new va0(i12, null));
                            return;
                        } else if (j11 > 0) {
                            z9Var2.H(ProfileActivity.o4(j11));
                            return;
                        } else {
                            z9Var2.H(sn.W9(j11));
                            return;
                        }
                    default:
                        p4 p4Var2 = this.f6180b;
                        if (p4Var2.O1.j()) {
                            z9Var.O();
                            if (!z9.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            h4 h4Var2 = p4Var2.f5725y0;
                            if (!z9.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            h4Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        p4Var2.b1(true);
                        return;
                }
            }
        });
        this.f5696p1 = new y8(this, m4Var);
        q3Var.addView(u3Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        m2 m2Var = new m2(this, context, z9Var, z9Var.v, view, frameLayout, z9Var);
        this.L0 = m2Var;
        q3Var.addView(view, w7.z5.e(-1, 200, 87));
        q3Var.addView(m2Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        q3Var.addView(frameLayout, w7.z5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o10 = i0.a.o(-1, 100);
        h4Var.setBackground(org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int o12 = i0.a.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.j0(dp4, dp4, dp4, dp4, 0, o12, o12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int o13 = i0.a.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.j0(dp5, dp5, dp5, dp5, 0, o13, o13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int o14 = i0.a.o(-1, 100);
        g3Var2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp6, dp6, dp6, dp6, 0, o14, o14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int o15 = i0.a.o(-1, 100);
        g3Var.setBackground(org.telegram.ui.ActionBar.k6.j0(dp7, dp7, dp7, dp7, 0, o15, o15));
        org.telegram.ui.Cells.y9 y9Var = u3Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new n2(this, 0);
        y9Var.S(this);
    }

    public static void U0(g7 g7Var, ImageReceiver imageReceiver, String str) {
        if (g7Var.f5370s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(g7Var.f5367f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Y(p4 p4Var, ValueAnimator valueAnimator) {
        float f7;
        e9 e9Var = p4Var.C0;
        p4Var.f5663d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        l4 l4Var = p4Var.f5693o1;
        l4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.f5663d4);
        l4Var.setAlpha(1.0f - p4Var.f5663d4);
        ImageView imageView = p4Var.f5717w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.f5663d4);
        imageView.setAlpha(1.0f - p4Var.f5663d4);
        ImageView imageView2 = p4Var.f5721x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.f5663d4);
        imageView2.setAlpha(1.0f - p4Var.f5663d4);
        h4 h4Var = p4Var.f5725y0;
        h4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.f5663d4);
        h4Var.setAlpha((1.0f - p4Var.f5663d4) * p4Var.f5666e3);
        g3 g3Var = p4Var.W1;
        if (g3Var != null) {
            g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * p4Var.f5663d4);
            p4Var.W1.setAlpha(1.0f - p4Var.f5663d4);
        }
        if (e9Var != null) {
            e9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var.f5663d4);
            e9Var.setAlpha(1.0f - p4Var.f5663d4);
        }
        p4Var.K0.setAlpha(1.0f - p4Var.f5663d4);
        i4 i4Var = p4Var.Q1;
        if (i4Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((q9) i4Var).d.V;
        }
        float hideInterfaceAlpha = p4Var.getHideInterfaceAlpha();
        g3 g3Var2 = p4Var.D0;
        if (g3Var2 != null) {
            g3Var2.setAlpha((1.0f - p4Var.f5663d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = p4Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - p4Var.f5663d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        g3 g3Var3 = p4Var.P0;
        if (g3Var3 != null) {
            g3Var3.setAlpha((1.0f - p4Var.f5663d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        u2 u2Var = p4Var.f5653b2;
        if (u2Var != null) {
            u2Var.setAlpha(1.0f - p4Var.f5663d4);
            p4Var.invalidate();
        }
        p4Var.f5656c1.invalidate();
    }

    public static void Z(p4 p4Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = p4Var.D3;
        if (e1Var != null && p4Var.C3 != null && e1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(z9.B1 - 0.2f) < 0.05f) {
                    p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(z9.B1 - 0.5f) < 0.05f) {
                    p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(z9.B1 - 1.0f) < 0.05f) {
                    p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(z9.B1 - 1.5f) < 0.05f) {
                    p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(z9.B1 - 2.0f) < 0.05f) {
                    p4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var2 = p4Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    e1Var2.setSubtext(LocaleController.formatString(i10, cd.a(z9.B1) + "x"));
                }
            }
            p4Var.C3.a(z9.B1, z10);
        }
    }

    public static void a0(p4 p4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!p4Var.H0() && !p4Var.O1.f5598f) {
            if (UserConfig.getInstance(p4Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, p4Var.B0).setOnClickListener(new e2(p4Var, 8));
                return;
            }
            Drawable drawable = p4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            o2 o2Var = new o2(p4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, p4Var.B0);
            c10.setOnClickListener(new e2(p4Var, 9));
            c10.setIcon(o2Var);
        }
    }

    public static void c0(p4 p4Var) {
        n4 n4Var = p4Var.O1;
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if ((storyItem == null && n4Var.f5596b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = n4Var.h();
        boolean z10 = n4Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), p4Var.getContext(), z10 ? 1 : 0, null, null, new ai.y8(1, p4Var, z10));
            return;
        }
        p4Var.Z0();
    }

    public static void d0(p4 p4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(p4Var.C2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new ai.m(p4Var, MessagesController.getInstance(p4Var.C2), j10, !z10, str, user), 200L);
    }

    public static void e0(p4 p4Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getContext(), 0, p4Var.B0);
        if (p4Var.H0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
        if (p4Var.H0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y1(p4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c3.m(7));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        ((q9) p4Var.Q1).h(c2Var);
        c2Var.i();
    }

    public static void g0(p4 p4Var) {
        String str;
        oc J;
        org.telegram.ui.ActionBar.g6 g6Var = p4Var.B0;
        q3 q3Var = p4Var.f5656c1;
        if (p4Var.G1) {
            return;
        }
        if (p4Var.E1) {
            if (p4Var.J3 != null && p4Var.K3 != null) {
                sg.j0.G1(new ai.a5(p4Var, 1), p4Var.J3, p4Var.K3, p4Var.B1, true);
                return;
            }
            z9 z9Var = p4Var.J0;
            if (z9Var != null) {
                z9Var.f6245k1 = true;
                z9Var.P();
            }
            MessagesController.getInstance(p4Var.C2).getBoostsController().getBoostsStats(p4Var.B1, new f2(p4Var, 0));
            return;
        }
        u2 u2Var = p4Var.f5653b2;
        int i10 = -p4Var.f5702r1;
        p4Var.f5702r1 = i10;
        AndroidUtilities.shakeViewSpring(u2Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (p4Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(p4Var.C2).premiumFeaturesBlocked()) {
            J = new vc(q3Var, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new vc(q3Var, g6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new c2(p4Var, 5));
        }
        J.j();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f25568c;
        b6 b6Var = this.J0.f6269w;
        if (b6Var == null) {
            f7 = 0.0f;
        } else {
            f7 = b6Var.f5181f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        z9 z9Var;
        if (!this.O1.f5598f || (z9Var = this.J0) == null || z9Var.A0 == null || C0(true)) {
            return 0L;
        }
        return z9Var.A0.j();
    }

    public static void i0(p4 p4Var) {
        n4 n4Var = p4Var.O1;
        if (n4Var.f5595a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f20583id = n4Var.f5595a.f20578id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(p4Var.C2).getInputPeer(p4Var.B1);
        ConnectionsManager.getInstance(p4Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.W1 != null) {
            return;
        }
        g3 g3Var = new g3(this, getContext(), 0);
        this.W1 = g3Var;
        g3Var.setClickable(true);
        addView(this.W1, w7.z5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        h3 h3Var = new h3(this, getContext());
        this.F2 = h3Var;
        h3Var.setOnClickListener(new e2(this, 0));
        this.W1.addView(this.F2, w7.z5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        v vVar = new v(0, getContext(), false);
        this.B2 = vVar;
        vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.z5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.z5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f5722x1.f5551s);
        h3 h3Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int o10 = i0.a.o(-1, 120);
        h3Var2.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.N(i0.a.o(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void B0() {
        if (this.f5650a3 != null) {
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
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        TextView textView2 = new TextView(getContext());
        w7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 30);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, o10, o10);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 30);
        textView2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView2, j02, O, h, g6Var);
        textView2.setOnClickListener(new e2(this, 3));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        linearLayout.addView(textView2, w7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.f5656c1.addView(frameLayout);
        this.f5650a3 = frameLayout;
    }

    public final boolean C0(boolean z10) {
        h1 h1Var;
        TLRPC.Peer i10;
        h1 h1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        int i11 = (this.B1 > 0L ? 1 : (this.B1 == 0L ? 0 : -1));
        z9 z9Var = this.J0;
        if (i11 < 0 && (h1Var2 = z9Var.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = h1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (z9Var.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && z9Var != null && (h1Var = z9Var.A0) != null && h1Var.l()) {
            if (!z10 || (i10 = z9Var.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void D0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        o4 o4Var = this.M2;
        org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) o4Var.e;
        if (n4Var != null && ((SurfaceView) o4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) o4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (n4Var != null && (textureView = (TextureView) o4Var.f5634f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            q3 q3Var = this.f5656c1;
            canvas.scale(i10 / q3Var.getMeasuredWidth(), i11 / q3Var.getMeasuredHeight());
            this.f5664e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void E0(ei.p9 p9Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        i4 i4Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        ei.r9 r9Var = new ei.r9(context, i10, this.B0);
        r9Var.r1(p9Var);
        ei.h1 h1Var = r9Var.f9760b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof ei.k9) {
                    ((ei.k9) view).e(false);
                }
            }
        }
        r9Var.l1(true);
        r9Var.T = new ah.h0(5, this, storyItem);
        ((q9) i4Var).h(r9Var);
    }

    public final boolean F0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.F0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean G0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        q3 q3Var = this.f5656c1;
        float x11 = view.getX() + q3Var.getX() + x10;
        float y3 = view.getY() + q3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean H0() {
        z6 z6Var;
        z9 z9Var = this.J0;
        if (z9Var != null && (z6Var = z9Var.O0) != null && z6Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        TLRPC.User user;
        if (!H0() || (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean J0();

    public final void K0(ah.i1 i1Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        n4 n4Var = this.O1;
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && i1Var == null) {
            k0();
            this.S1.g0(this.B1, n4Var.f5595a, null);
        } else if (i1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f5698p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.d1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f5686l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f5701q3 = true;
                this.S1.g0(this.B1, n4Var.f5595a, ah.i1.c(tL_availableReaction));
            }
        } else {
            k0();
            this.S1.g0(this.B1, n4Var.f5595a, i1Var);
        }
        TL_stories.StoryItem storyItem2 = n4Var.f5595a;
        g3 g3Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(ah.i1.d(reaction));
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            g3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = n4Var.f5595a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = n4Var.f5595a.views;
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
        TL_stories.StoryItem storyItem4 = n4Var.f5595a;
        ah.l1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        j1(true);
    }

    public final void L0() {
        h1 h1Var;
        boolean z10;
        if (this.O3 == null) {
            z9 z9Var = this.J0;
            if (z9Var != null && (h1Var = z9Var.A0) != null) {
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
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
            this.O3 = sendAsPeers;
            u2 u2Var = this.f5653b2;
            if (u2Var != null && sendAsPeers != null) {
                u2Var.M1(true);
            }
        }
    }

    public final boolean M0() {
        u2 u2Var = this.f5653b2;
        if (u2Var == null) {
            return false;
        }
        boolean z10 = u2Var.f24200z2;
        if (z10) {
            u2Var.p1();
        }
        AndroidUtilities.runOnUIThread(new c2(this, 3), 300L);
        return z10;
    }

    public final void N0() {
        CharSequence charSequence;
        long j10;
        f2 f2Var;
        int i10;
        long j11;
        long j12;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f5653b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j13 = this.L3;
        f2 f2Var2 = new f2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.g6) bVar, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        h3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j10 = j13;
            f2Var = f2Var2;
            i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
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
        ei.d dVar = new ei.d(context, null, true);
        ?? obj = new Object();
        obj.f6003c = clientUserId;
        obj.f6004f = textWithEntities;
        obj.f6005g = jArr[0];
        q0 q0Var = new q0(i12, context, true);
        LinearLayout e = tl.e(context, 0);
        ah.x xVar = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        e.addView(xVar, w7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        ah.x xVar2 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        e.addView(xVar2, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        ah.x xVar3 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        e.addView(xVar3, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        t tVar = new t(context, bVar, r6);
        f2 f2Var3 = f2Var;
        long j14 = j12;
        Utilities.Callback[] callbackArr = {new s(jArr, dVar, new vq[1], (v0) obj, q0Var, i12, xVar, xVar2, xVar3, tVar, new boolean[]{true})};
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
        if (arrayList.isEmpty() || ((Integer) i2.o1.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        tVar.f1580e0 = iArr4;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, w7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.k6.f21290j5;
        TextView b10 = w7.d6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        tl.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(q0Var, w7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        h3Var.show();
        dVar.setOnClickListener(new ai.v0(f2Var3, jArr, h3Var, 3));
    }

    public final void O0() {
        if (this.f5653b2 == null) {
            return;
        }
        s0();
        this.I2.f30158j0.f0();
        this.I2.R1(-1, true);
        a3 a3Var = this.I2;
        a3Var.Z = this.B1;
        a3Var.w1();
        this.I2.r1().setText(this.f5653b2.getFieldText());
        ((q9) this.Q1).h(this.I2);
    }

    public final void P0() {
        Bundle bundle = new Bundle();
        long j10 = this.B1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new sn(bundle));
    }

    public final void Q0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.Q0(long):void");
    }

    public final void R0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.R0(android.net.Uri):void");
    }

    public final void S0(long j10, boolean z10) {
        int i10;
        int i11;
        n4 n4Var;
        if (this.K1 != z10) {
            this.K1 = z10;
            ak0 ak0Var = this.f5728z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f6220a && Build.VERSION.SDK_INT < 33) {
                    z9 z9Var = ((q9) this.Q1).d;
                    z9Var.l1 = true;
                    z9Var.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                Q0(j10);
                f1();
                ak0Var.setAnimation(this.f5722x1.f5553u);
                this.K1 = true;
                this.f5693o1.f5514a.getImageReceiver().setVisible(true, true);
                if (this.O1.f5595a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + n4Var.f5595a.f20578id + " " + n4.c(n4Var));
                }
            } else {
                o0();
                ak0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f5656c1.invalidate();
                invalidate();
                p0();
                z9 z9Var2 = ((q9) this.Q1).d;
                z9Var2.I0 = false;
                z9Var2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f5664e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f5667f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f5670g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                h7 h7Var = this.S1;
                long j11 = this.B1;
                boolean z11 = this.K1;
                a0.h hVar = h7Var.f5408m;
                ia iaVar = (ia) hVar.f(j11);
                if (iaVar == null) {
                    iaVar = new ia(h7Var.f5399a, j11, h7Var);
                    hVar.k(iaVar, j11);
                }
                iaVar.b(z11);
            }
        }
    }

    public final void T0(int i10, long j10) {
        if (this.B1 != j10) {
            n4 n4Var = this.O1;
            n4Var.f5596b = null;
            n4Var.f5595a = null;
        }
        this.B1 = j10;
        this.f5729z1 = null;
        n0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        h7 h7Var = this.S1;
        TL_stories.PeerStories y3 = h7Var.y(j10);
        if (y3 == null) {
            y3 = h7Var.z(j10);
        } else {
            z10 = false;
        }
        h7Var.S(y3, z10);
    }

    public final void V0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j10;
        this.N3 = z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        l4 l4Var = this.f5693o1;
        if (i10 >= 0) {
            if (this.C1 && !z11) {
                l4Var.f5515b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                l4Var.f5515b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                wq wqVar = new wq(mutate, null);
                wqVar.f32329w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                wqVar.h = dp;
                wqVar.f32326n = dp2;
                l4Var.f5515b.i(wqVar);
            } else {
                l4Var.f5515b.i(null);
            }
            if (user != null) {
                l4Var.f5515b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), l4Var.f5515b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            l4Var.f5515b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j10));
        k4 k4Var = l4Var.f5515b;
        k4 k4Var2 = l4Var.f5515b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        k4Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            wq wqVar2 = new wq(mutate2, null);
            wqVar2.f32329w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            wqVar2.h = dp3;
            wqVar2.f32326n = dp4;
            k4Var2.i(wqVar2);
            return;
        }
        k4Var2.i(null);
    }

    public final void W0(float f7, float f10, v4 v4Var) {
        this.f5687m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != v4Var) {
            this.l1 = v4Var;
            if (v4Var != null) {
                ImageReceiver imageReceiver = v4Var.f6016a;
                if (imageReceiver.getBitmap() != null) {
                    this.f5664e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void X0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        n4 n4Var = this.O1;
        if (n4Var.f5595a != null) {
            z9 z9Var = this.J0;
            if (z9Var.f6233f != null) {
                String e = n4Var.e();
                if (z10) {
                    s2 s2Var = new s2(2, this.B0);
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
                    d3 d3Var = new d3(this, z9Var.f6233f.getContext(), e, e, z11, s2Var);
                    this.Z2 = d3Var;
                    d3Var.f27133j0 = true;
                    TL_stories.StoryItem storyItem = n4Var.f5595a;
                    storyItem.dialogId = this.B1;
                    d3Var.G0 = storyItem;
                    d3Var.f27145t0 = new a6.i(this, 11);
                    ((q9) this.Q1).h(d3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.I1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Y0() {
        q3 q3Var = this.f5656c1;
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        tl.q(R.string.UnsupportedAttachment, new vc(q3Var, g6Var), g6Var);
    }

    public final void Z0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.T = string;
        ((q9) this.Q1).h(c2Var);
    }

    public final void a1(boolean z10) {
        if (this.f5707s3 != z10) {
            n4 n4Var = this.O1;
            if (n4Var.f5595a != null) {
                this.f5707s3 = z10;
                if (z10) {
                    this.f5704r3.setVisibility(0);
                }
                this.f5704r3.setStoryItem(n4Var.f5595a);
                z9 z9Var = ((q9) this.Q1).d;
                z9Var.f6254p1 = z10;
                z9Var.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f5710t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f5704r3.setTransitionProgress(this.f5710t3);
                    ofFloat.addUpdateListener(new d2(this, 1));
                    ofFloat.addListener(new p2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(zr.f33338g);
                    ofFloat.start();
                    return;
                }
                if (this.f5704r3.getReactionsWindow() != null) {
                    this.f5704r3.getReactionsWindow().e();
                }
                this.f5704r3.animate().alpha(0.0f).setDuration(150L).setListener(new q2(this, 0)).start();
            }
        }
    }

    public final void b1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            ei.x3 x3Var = new ei.x3(getContext(), 1);
            x3Var.l(1.0f, -56.0f);
            this.G0 = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f5656c1.addView(this.G0, w7.z5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        ei.x3 x3Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        x3Var2.s(LocaleController.getString(i10));
        this.G0.u();
    }

    public final boolean c1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.J1 < getStoriesCount() - 1) {
                this.J1++;
                e1(false);
                return true;
            }
        } else {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                e1(false);
                return true;
            }
        }
        return false;
    }

    public final void d1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            d3 d3Var = this.Z2;
            if (d3Var != null) {
                d3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new c2(this, 8), 120L);
            return;
        }
        Z0();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        h1 h1Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        z9 z9Var = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || z9Var.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                e1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f5876b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                q0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                b7 o10 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o10 != null && o10.a(this.C2, 1) && this.Q1 != null) {
                    ai.a5 a5Var = new ai.a5(this, 1);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.I1;
                    }
                    ((q9) this.Q1).h(new sg.j0(o10.b(), this.C2, findActivity, a5Var, null));
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
                    e1(false);
                    q0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f20345id)) {
                    e1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (z9Var != null && (h1Var = z9Var.A0) != null && h1Var.g() == longValue) {
                    e1(false);
                    u2 u2Var = this.f5653b2;
                    if (u2Var != null) {
                        u2Var.F(true);
                        this.f5653b2.M1(true);
                        q0(true);
                    }
                    m2 m2Var = this.L0;
                    if (m2Var != null) {
                        h1 h1Var2 = m2Var.P;
                        if (h1Var2 != null) {
                            j10 = h1Var2.j();
                        }
                        if (m2Var.H != j10) {
                            m2Var.e.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                L0();
                return;
            } else {
                return;
            }
        }
        i4 i4Var = this.Q1;
        if (i4Var == null || !((q9) i4Var).d.H0) {
            if (this.K1) {
                i1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((q9) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f5714v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f5718w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                e1(false);
                if (this.C1 || this.D1) {
                    j1(true);
                }
            }
            TL_stories.PeerStories peerStories = z9Var.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j11 = this.B1;
                if (j11 != 0) {
                    h7 h7Var = this.S1;
                    TL_stories.PeerStories y3 = h7Var.y(j11);
                    if (y3 == null) {
                        y3 = h7Var.z(j11);
                        z11 = true;
                    }
                    h7Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f5705s1;
            if (e1Var != null) {
                ViewPropertyAnimator animate = e1Var.animate();
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
        ie ieVar;
        Canvas canvas2;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.Components.n6 n6Var2;
        k1();
        if (this.D1 && (n6Var2 = this.Q0) != null) {
            n6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (n6Var = this.R0) != null) {
            n6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f5713u3;
        LinearLayout linearLayout = this.O0;
        g3 g3Var = this.D0;
        if (z10) {
            float measuredWidth = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f5720w3, measuredWidth - f7, zr.f33338g.getInterpolation(this.f5716v3));
            float lerp2 = AndroidUtilities.lerp(this.f5724x3, measuredHeight - f7, this.f5716v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f5716v3);
            if (this.f5698p3) {
                org.telegram.ui.Components.p5 p5Var = this.f5695o3;
                if (p5Var != null) {
                    float f10 = lerp3;
                    p5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f5695o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f5692n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f5701q3) {
            float measuredWidth2 = (g3Var.getMeasuredWidth() / 2.0f) + g3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (g3Var.getMeasuredHeight() / 2.0f) + g3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f5698p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f5686l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f5701q3 = false;
                }
            } else {
                ah.e eVar = this.f5689m3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f5689m3.b(canvas);
                    if (this.f5689m3.c()) {
                        this.f5689m3.d(this);
                        this.f5689m3 = null;
                        this.f5701q3 = false;
                    }
                } else {
                    this.f5701q3 = false;
                }
            }
        }
        u2 u2Var = this.f5653b2;
        if (u2Var != null) {
            ke keVar = u2Var.f24195y1;
            ie ieVar2 = u2Var.f24199z1;
            if (u2Var.getAlpha() != 0.0f && (ieVar = u2Var.f24079e1) != null && ieVar.getParent() != null && u2Var.f24079e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(u2Var.f24079e1.getX() + keVar.getX() + ieVar2.getX() + u2Var.getX(), u2Var.f24079e1.getY() + keVar.getY() + ieVar2.getY() + u2Var.getY());
                if (u2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, u2Var.getMeasuredWidth(), u2Var.getMeasuredHeight(), (int) (u2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                u2Var.f24079e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fl0 fl0Var;
        fl0 fl0Var2;
        gh.d dVar;
        float dp;
        float f7;
        if (view == this.f5662d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f5662d3.getY(), getMeasuredWidth(), this.f5662d3.getY() + this.f5662d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        u2 u2Var = this.f5653b2;
        Paint paint = this.f5691n2;
        g3 g3Var = this.D0;
        m4 m4Var = this.f5722x1;
        if (view == u2Var) {
            float f10 = this.f5700q2;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            n4 n4Var = this.O1;
            if (i10 > 0 && !n4Var.f5598f) {
                m4Var.f5544l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m4Var.f5544l);
            }
            RectF rectF = m4Var.h;
            RectF rectF2 = m4Var.f5541i;
            RectF rectF3 = m4Var.f5542j;
            rectF.set(this.f5653b2.getX(), this.f5653b2.getY() + this.f5653b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f5653b2.getX() + this.f5653b2.getMeasuredWidth(), this.f5653b2.getY() + this.f5653b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!n4Var.f5598f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (g3Var != null && g3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + g3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                t1 t1Var = this.a2;
                if (t1Var != null && t1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f5653b2.getY() + this.f5653b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f5653b2.getY() + this.f5653b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f5653b2.setTranslationX((1.0f - this.f5700q2) * dp);
            if (this.f5653b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f5700q2) * (this.f5653b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f5653b2.getEditField().setTranslationY(com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f5700q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, m4Var.h, this.f5700q2, rectF3);
            dh.d dVar2 = this.f5685l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f5663d4) * (1.0f - this.f5703r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f5700q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (u2Var != null && u2Var.r0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = m4Var.f5543k;
            RectF rectF5 = m4Var.f5543k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f5651a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            dh.d dVar3 = this.f5688m2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.r(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f5668f2 && this.f5653b2 != null) {
                view.setTranslationY(((this.f5653b2.getY() + this.f5653b2.getAnimatedTop()) + (-fl0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f5704r3) {
                    view.setTranslationY((this.O0.getY() + (g3Var.getY() + (-(fl0Var2.getMeasuredHeight() - this.f5704r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    q3 q3Var = this.f5656c1;
                    if (view == q3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f11079n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.f(0.2f, -16777216, -1));
                        a2.translate(q3Var.getX(), q3Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.e1(boolean):void");
    }

    public final void f1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.f1():void");
    }

    public final void g1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f5674h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f5677i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f5674h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f5677i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f5677i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f5729z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        q3 q3Var = this.f5656c1;
        Bitmap createBitmap = Bitmap.createBitmap(q3Var.getWidth(), q3Var.getHeight(), Bitmap.Config.ARGB_8888);
        D0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public h7 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f5714v1.size()) + this.f5718w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f5714v1;
    }

    public final void h1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f5729z1;
        z9 z9Var = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f5718w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((g7) arrayList2.get(i11)).f5364a;
                    if (((int) (j10 ^ (j10 >>> 32))) == z9Var.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f5729z1.indexOf(Integer.valueOf(z9Var.P0));
            if (indexOf < 0 && !this.f5729z1.isEmpty()) {
                if (z9Var.P0 > ((Integer) this.f5729z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (z9Var.P0 < ((Integer) i2.o1.i(1, this.f5729z1)).intValue()) {
                    indexOf = this.f5729z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = z9Var.f6232e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !z9Var.N0 && (peerStories = this.f5711u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f5714v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f20578id > this.f5711u1.max_read_id) {
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

    public final void i1() {
        z6 z6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f5714v1;
        arrayList.clear();
        z9 z9Var = this.J0;
        if (z9Var.N0) {
            if (!z9Var.S0) {
                arrayList.add(z9Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f5729z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f5718w1;
            if (arrayList2 != null && (z6Var = z9Var.O0) != null) {
                if (z6Var instanceof s6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((s6) z9Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            g7 g7Var = (g7) E.get(i11);
                            ei.a8 a8Var = g7Var.f5366c;
                            if (a8Var != null && !a8Var.f8718g && TextUtils.equals(a8Var.K0, str)) {
                                arrayList3.add(g7Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f5729z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = z9Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (z9Var.O0 != null) {
                while (i10 < z9Var.O0.f6193i.size()) {
                    arrayList.add(((MessageObject) z9Var.O0.f6193i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = z9Var.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f5711u1 = z9Var.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f5711u1 = y3;
                    if (y3 == null) {
                        this.f5711u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f5711u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f5711u1.stories);
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

    public final void j0(boolean z10) {
        p4 currentPeerView;
        l60 l60Var = this.J2;
        if (l60Var != null) {
            l60Var.f28189f0 = null;
            l60Var.a(false);
        }
        long j10 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f5595a;
        z9 z9Var = this.J0;
        z9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            z9.E1.remove(j10 + (j10 >> 16) + (storyItem.f20578id << 16));
        }
        this.f5678i3 = true;
        p9 p9Var = z9Var.f6249n0;
        if (p9Var != null && (currentPeerView = p9Var.getCurrentPeerView()) != null) {
            currentPeerView.r0();
        }
        if (z10) {
            oc I = new vc(this.f5656c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new c2(this, 2));
            I.f29211r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void j1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        n4 n4Var = this.O1;
        TL_stories.StoryItem storyItem = n4Var.f5595a;
        if (storyItem == null) {
            storyItem = n4Var.f5597c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                z9 z9Var = this.J0;
                g3 g3Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.n6 n6Var = this.R0;
                    if (n6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6Var.t(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.n6 n6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n6Var2.t(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.d6 d6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        d6Var.d(f10, true);
                        org.telegram.ui.Components.d6 d6Var2 = this.T0;
                        if (d6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            d6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (z9Var.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new vq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = g3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + g3Var.getLayoutParams().width;
                    g3 g3Var2 = this.P0;
                    if (g3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = g3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += g3Var2.getLayoutParams().width;
                        g3Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    g3Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = n4Var.f5595a;
                    m3 m3Var = this.f5679j1;
                    if (storyItem2 == null) {
                        m3Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < m3Var.getChildCount(); i14++) {
                        if (m3Var.getChildAt(i14) instanceof g9) {
                            ((g9) m3Var.getChildAt(i14)).c(storyItem2.views, z10);
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
                        vq vqVar = new vq(R.drawable.mini_views_likes, 0);
                        vqVar.setOverrideColor(-53704);
                        vqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(vqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        vq vqVar2 = new vq(R.drawable.mini_repost_story, 0);
                        vqVar2.setOverrideColor(-14161823);
                        vqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(vqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.gms.internal.play_billing.k3.v(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (z9Var.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                g3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void k0() {
        m7 m7Var = this.E0;
        m7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r2(0, m7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        m7 m7Var2 = new m7(getContext(), this.f5722x1);
        this.E0 = m7Var2;
        m7Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.z5.e(40, 40, 3));
        this.f5701q3 = false;
    }

    public final void k1() {
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
        float f23 = ((q9) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.O2;
        d6Var.d(f7, false);
        int i13 = this.f5709t2;
        if (i13 != 0 && this.f5712u2) {
            f10 = w7.r.a(this.H2 / i13, 0.0f, 1.0f);
        } else if (this.f5715v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var2 = this.W3;
        float f24 = d6Var2.f25568c;
        org.telegram.ui.Components.d6 d6Var3 = this.X3;
        float f25 = d6Var3.f25568c;
        org.telegram.ui.Components.d6 d6Var4 = this.Y3;
        float f26 = d6Var4.f25568c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        d6Var2.d(f11, false);
        if (!this.f5678i3) {
            u2 u2Var2 = this.f5653b2;
            if (u2Var2 != null && !TextUtils.isEmpty(u2Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            d6Var3.d(f22, false);
        }
        u2 u2Var3 = this.f5653b2;
        if (u2Var3 != null && u2Var3.f24201z3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        d6Var4.d(f12, false);
        final u2 u2Var4 = this.f5653b2;
        if (u2Var4 != null) {
            p4 p4Var = u2Var4.f5981w5;
            f13 = 1.0f;
            int backgroundTop = u2Var4.getBackgroundTop();
            int i14 = u2Var4.f5978t5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (u2Var4.T1 + i14) - backgroundTop;
                u2Var4.setAnimatedTop(i15);
                p4Var.V2 = true;
                ValueAnimator valueAnimator = p4Var.f5665e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    p4Var.f5665e2.cancel();
                }
                View view = u2Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var4.G1.setTranslationY(((1.0f - u2Var4.getTopViewEnterProgress()) * u2Var4.G1.getLayoutParams().height) + u2Var4.T1);
                }
                p4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                p4Var.f5665e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                u2 u2Var5 = u2Var4;
                                u2Var5.getClass();
                                u2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                p4 p4Var2 = u2Var5.f5981w5;
                                p4Var2.V2 = true;
                                p4Var2.invalidate();
                                u2Var5.invalidate();
                                return;
                            default:
                                u2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                p4Var.f5665e2.addListener(new ah.b(u2Var4, 9));
                p4Var.f5665e2.setDuration(250L);
                p4Var.f5665e2.setInterpolator(li.m.V);
                p4Var.f5665e2.start();
                u2Var4.f5978t5 = 0;
            }
            if (u2Var4.f24134n3) {
                float scrollY = (u2Var4.f5980v5 - u2Var4.E0.getScrollY()) + (u2Var4.f5979u5 - u2Var4.E0.getMeasuredHeight());
                nf nfVar = u2Var4.E0;
                nfVar.setOffsetY(nfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u2Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                u2 u2Var5 = u2Var4;
                                u2Var5.getClass();
                                u2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                p4 p4Var2 = u2Var5.f5981w5;
                                p4Var2.V2 = true;
                                p4Var2.invalidate();
                                u2Var5.invalidate();
                                return;
                            default:
                                u2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = u2Var4.f5977s5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u2Var4.f5977s5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(li.m.V);
                ofFloat2.start();
                u2Var4.f24134n3 = false;
                p4Var.k1();
            }
            u2Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        u2 u2Var5 = this.f5653b2;
        if (u2Var5 != null && u2Var5.q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f5723x2;
        Paint paint = this.f5691n2;
        if (z12) {
            paint.setColor(i0.a.f(this.f5700q2, -14933463, org.telegram.ui.ActionBar.k6.o1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.f5663d4) * org.telegram.messenger.v0.A(f27, this.f5703r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.o(-16777216, (int) ((f13 - this.f5663d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        z9 z9Var = this.J0;
        if (z13 || this.Z3 != z9Var.f6229d0 || d6Var.f25568c != this.Q2 || this.f5706s2 != this.H2 || f10 != this.f5700q2 || f23 != this.f5703r2 || f24 != d6Var2.f25568c || z10 || f26 != d6Var4.f25568c || f25 != d6Var3.f25568c) {
            this.V2 = false;
            this.f5706s2 = this.H2;
            int i16 = (d6Var.f25568c > this.Q2 ? 1 : (d6Var.f25568c == this.Q2 ? 0 : -1));
            q3 q3Var = this.f5656c1;
            if (i16 != 0) {
                q3Var.invalidate();
            }
            if (f23 != 0.0f) {
                q3Var.setLayerType(2, null);
            } else {
                q3Var.setLayerType(0, null);
            }
            this.Q2 = d6Var.f25568c;
            this.f5703r2 = f23;
            this.f5700q2 = f10;
            this.Z3 = z9Var.f6229d0;
            float height = this.H2 - (getHeight() - q3Var.getBottom());
            if (this.f5653b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = u2Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f5694o2 - (getHeight() - q3Var.getBottom());
            u2 u2Var6 = this.f5653b2;
            if (u2Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = u2Var6.getHeightWithTopView();
                if (this.f5715v2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            u2 u2Var7 = this.f5653b2;
            if (u2Var7 != null) {
                if (this.f5661d2 != null) {
                    ImageView suggestButton = u2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f5661d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f5661d2.setTranslationY(-((getHeight() - this.f5653b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                gu editField = this.f5653b2.getEditField();
                wp0 senderSelectView = this.f5653b2.getSenderSelectView();
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
            if (this.f5723x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f5723x2 && !this.f5715v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f10) + max3;
            m2 m2Var = this.L0;
            ai.u1 u1Var = m2Var.f6083c;
            m2Var.K = dp2;
            if (Math.abs(m2Var.L - max4) > 0.1f) {
                m2Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                u1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - u1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!u1Var.canScrollVertically(1)) {
                    m2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            m2Var.setTranslationY(-m2Var.K);
            m2Var.invalidate();
            ei.d4 d4Var = z9Var.D0;
            if (d4Var != null) {
                d4Var.setKeyboardOffset(max);
            }
            fl0 fl0Var2 = this.f5668f2;
            n4 n4Var = this.O1;
            if (fl0Var2 != null) {
                if (this.f5700q2 > 0.0f && (n4Var == null || !n4Var.f5598f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                fl0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                g3Var = this.P0;
                imageView = this.N0;
                u3Var = this.K0;
                g3Var2 = this.D0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != u3Var.W.n(getContext())) {
                    u2 u2Var8 = this.f5653b2;
                    if (u2Var8 != null && childAt == u2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f5653b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof p40) {
                        p40 p40Var = (p40) childAt;
                        View view2 = p40Var.e;
                        if (view2 != null) {
                            p40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != q3Var && childAt != imageView && childAt != this.O0 && childAt != g3Var && childAt != this.W2 && childAt != this.f5661d2 && childAt != g3Var2 && ((fl0Var = this.f5704r3) == null || fl0Var.getReactionsWindow() == null || childAt != this.f5704r3.getReactionsWindow().f871c)) {
                        float f28 = this.f5700q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f18) * f29)) - (AndroidUtilities.dp(20.0f) * z9Var.f6229d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f5723x2) {
                            f20 = (1.0f - this.f5703r2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f5654b3) {
                            dp3 = z9Var.f6229d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f5662d3) {
                            dp3 -= this.f5653b2.getMeasuredHeight() - this.f5653b2.getAnimatedTop();
                            f20 = this.f5700q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f5657c2) {
                            dp3 -= this.f5653b2.getMeasuredHeight() - this.f5653b2.getAnimatedTop();
                            f20 *= this.f5700q2;
                        }
                        if (childAt == this.f5668f2) {
                            float f30 = (1.0f - d6Var3.f25568c) * (1.0f - f26) * (1.0f - d6Var2.f25568c) * this.f5700q2;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f5668f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            u2 u2Var9 = this.f5653b2;
                            if (u2Var9 == null || childAt != u2Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f5723x2) {
                        childAt.setAlpha((1.0f - this.f5663d4) * (1.0f - this.f5703r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f5663d4) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f5663d4) * f34);
            g3Var2.setAlpha((1.0f - this.f5663d4) * f34);
            if (g3Var != null) {
                g3Var.setAlpha((1.0f - this.f5663d4) * f34);
            }
            for (int i18 = 0; i18 < q3Var.getChildCount(); i18++) {
                View childAt2 = q3Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.M0) {
                    l4 l4Var = this.f5693o1;
                    h4 h4Var = this.f5725y0;
                    if (childAt2 != l4Var && childAt2 != this.f5717w0 && childAt2 != this.f5721x0 && childAt2 != h4Var && childAt2 != this.W1 && childAt2 != u3Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == h4Var) {
                            f19 = this.f5666e3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == u3Var) {
                            childAt2.setAlpha((1.0f - this.f5663d4) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f5663d4) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f5653b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!n4Var.f5598f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (g3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + g3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    t1 t1Var = this.a2;
                    if (t1Var != null && t1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                u2 u2Var10 = this.f5653b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f5700q2;
                if ((this.S2 || this.E1) && !n4Var.f5598f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2Var10.e1(f35, f36, f37, z11);
                if (this.f5653b2.getEmojiView() != null) {
                    this.f5653b2.getEmojiView().setAlpha(this.f5700q2);
                }
            }
        }
    }

    public final void l0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f5659c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f5663d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f5659c4 = ofFloat;
        ofFloat.addUpdateListener(new d2(this, 2));
        this.f5659c4.addListener(new p2(this, z10, 1));
        this.f5659c4.setDuration(420L);
        this.f5659c4.setInterpolator(zr.h);
        this.f5659c4.start();
    }

    public final void m0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f5684k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.B0);
            c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            c2Var.n(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 16);
            c2Var.f20771n0 = string;
            c2Var.f20772o0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            c3.m mVar = new c3.m(6);
            c2Var.f20773p0 = string2;
            c2Var.f20774q0 = mVar;
            c2Var.show();
            return;
        }
        runnable.run();
    }

    public final void n0(int i10) {
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
        long j10 = this.B1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        l4 l4Var = this.f5693o1;
        org.telegram.ui.Components.f9 f9Var = this.f5690n1;
        if (i13 >= 0) {
            if (j10 == UserConfig.getInstance(this.C2).getClientUserId()) {
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
            f9Var.m(this.C2, user);
            l4Var.f5514a.getImageReceiver().setForUserOrChat(user, f9Var);
            V0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
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
            f9Var.k(this.C2, chat);
            l4Var.f5514a.getImageReceiver().setForUserOrChat(chat, f9Var);
            V0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            h7 h7Var = this.S1;
            long j11 = this.B1;
            a0.h hVar = h7Var.f5408m;
            ia iaVar = (ia) hVar.f(j11);
            if (iaVar == null) {
                iaVar = new ia(h7Var.f5399a, j11, h7Var);
                hVar.k(iaVar, j11);
            }
            iaVar.b(true);
        }
        i1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z16 = this.D1;
        q3 q3Var = this.f5656c1;
        z9 z9Var = this.J0;
        int i14 = 8;
        n4 n4Var = this.O1;
        if (z16) {
            A0();
            if (this.f5653b2 == null && (this.E1 || n4Var.f5598f)) {
                u0();
            }
            if (this.f5653b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                u2 u2Var = this.f5653b2;
                if (n4Var.f5598f || (!H0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i14 = 0;
                }
                u2Var.setVisibility(i14);
                u2 u2Var2 = this.f5653b2;
                boolean z17 = n4Var.f5598f;
                C0(true);
                u2Var2.f1(z17);
                u2 u2Var3 = this.f5653b2;
                if (n4Var.f5598f && !C0(true) && (this.f5715v2 || this.f5653b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                u2Var3.l1(z13, true);
                gu editField = this.f5653b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem = n4Var.f5595a;
                z9Var.getClass();
                editField.setText(z9.u(j12, storyItem));
                this.f5653b2.Y0(this.C2, this.B1);
                this.f5653b2.H1(chat2, null);
            }
            org.telegram.ui.Components.n6 n6Var = this.Q0;
            org.telegram.ui.ActionBar.g6 g6Var = this.B0;
            if (n6Var == null) {
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, false, false);
                this.Q0 = n6Var2;
                g3 g3Var = this.D0;
                n6Var2.setCallback(g3Var);
                this.Q0.u(g6Var.g(org.telegram.ui.ActionBar.k6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.d6(g3Var);
            }
            g3 g3Var2 = this.P0;
            if (g3Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, false);
                this.R0 = n6Var3;
                n6Var3.setCallback(g3Var2);
                this.R0.u(g6Var.g(org.telegram.ui.ActionBar.k6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.d6(g3Var2);
            }
            if (i10 == -1) {
                h1();
            }
            e1(false);
            this.A1 = getStoriesCount();
            q3Var.invalidate();
            invalidate();
        } else if (this.C1) {
            A0();
            if (n4Var.f5598f) {
                this.W1.setVisibility(8);
                if (this.f5653b2 == null) {
                    u0();
                }
                this.f5653b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                u2 u2Var4 = this.f5653b2;
                if (u2Var4 != null) {
                    u2Var4.setVisibility(8);
                }
            }
            u2 u2Var5 = this.f5653b2;
            if (u2Var5 != null) {
                boolean z18 = n4Var.f5598f;
                C0(true);
                u2Var5.f1(z18);
                u2 u2Var6 = this.f5653b2;
                if (n4Var.f5598f && !C0(true) && (this.f5715v2 || this.f5653b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u2Var6.l1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f5729z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(z9Var.P0));
                    if (indexOf < 0 && !this.f5729z1.isEmpty()) {
                        if (z9Var.P0 > ((Integer) this.f5729z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (z9Var.P0 < ((Integer) i2.o1.i(1, this.f5729z1)).intValue()) {
                            indexOf = this.f5729z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f5718w1.isEmpty();
                    ArrayList arrayList2 = this.f5714v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f20578id > this.S1.f5402f.get(this.B1)) {
                                this.J1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            e1(false);
            q3Var.invalidate();
            invalidate();
        } else {
            if (this.f5653b2 == null) {
                u0();
            }
            if (this.F1 && this.f5671g2 == null) {
                y0();
            }
            if (this.f5671g2 != null) {
                if (this.F1 || this.G1) {
                    g1();
                }
                LinearLayout linearLayout = this.f5671g2;
                if ((this.F1 && !n4Var.f5598f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            x8 x8Var = this.f5680j2;
            if (x8Var != null) {
                x8Var.setVisibility(8);
            }
            if (i10 == -1) {
                h1();
            }
            e1(false);
            u2 u2Var7 = this.f5653b2;
            if (u2Var7 != null) {
                if (!H0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                u2Var7.setVisibility(i11);
                u2 u2Var8 = this.f5653b2;
                boolean z19 = n4Var.f5598f;
                C0(true);
                u2Var8.f1(z19);
                u2 u2Var9 = this.f5653b2;
                if (n4Var.f5598f && !C0(true) && (this.f5715v2 || this.f5653b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2Var9.l1(z11, true);
                gu editField2 = this.f5653b2.getEditField();
                long j13 = this.B1;
                TL_stories.StoryItem storyItem2 = n4Var.f5595a;
                z9Var.getClass();
                editField2.setText(z9.u(j13, storyItem2));
                this.f5653b2.Y0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f5653b2.H1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f5730z2, false);
                }
            }
            this.A1 = getStoriesCount();
            g3 g3Var3 = this.W1;
            if (g3Var3 != null) {
                g3Var3.setVisibility(8);
            }
            q3Var.invalidate();
            invalidate();
        }
        q0(false);
    }

    public final void o0() {
        u3 u3Var = this.K0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5649a1 = true;
        this.f5664e1.onAttachedToWindow();
        this.f5670g1.onAttachedToWindow();
        this.f5667f1.onAttachedToWindow();
        this.f5686l3.onAttachedToWindow();
        this.f5692n3.onAttachedToWindow();
        u2 u2Var = this.f5653b2;
        if (u2Var != null) {
            u2Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5673h1;
            if (i10 < arrayList.size()) {
                ((ah.y0) arrayList.get(i10)).b(true);
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
        this.f5649a1 = false;
        this.f5664e1.onDetachedFromWindow();
        this.f5670g1.onDetachedFromWindow();
        this.f5667f1.onDetachedFromWindow();
        this.f5686l3.onDetachedFromWindow();
        this.f5692n3.onDetachedFromWindow();
        u2 u2Var = this.f5653b2;
        if (u2Var != null) {
            u2Var.B0();
        }
        org.telegram.ui.Components.p5 p5Var = this.f5695o3;
        if (p5Var != null) {
            p5Var.o(this);
            this.f5695o3 = null;
        }
        ah.e eVar = this.f5689m3;
        if (eVar != null) {
            eVar.d(this);
            this.f5689m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5673h1;
            if (i10 < arrayList.size()) {
                ((ah.y0) arrayList.get(i10)).b(false);
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
        this.f5722x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5700q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        if (this.K1) {
            ((q9) this.Q1).d.P();
        }
    }

    public final void q0(boolean z10) {
        int i10;
        if (this.f5653b2 != null && this.f5669f3 && this.f5649a1) {
            c2 c2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(c2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f5653b2.F(true);
            boolean z11 = this.F1;
            n4 n4Var = this.O1;
            if ((z11 && !n4Var.f5598f) || this.G1) {
                this.f5684k3 = false;
                this.f5653b2.setEnabled(false);
                this.f5653b2.g1(" ", z10);
            } else if (this.H1 > 0) {
                this.f5684k3 = false;
                this.f5653b2.setEnabled(true);
                this.f5653b2.g1(nd.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!n4Var.f5598f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f5684k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f5653b2.setEnabled(true);
                        if (((int) this.f5653b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f5653b2.getEditField().getMeasuredWidth()) {
                            u2 u2Var = this.f5653b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            u2Var.e = formatString2;
                            u2Var.f24084f = format;
                            u2Var.D1(z10);
                        } else {
                            this.f5653b2.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(c2Var, 1000L);
                        return;
                    }
                }
                this.f5684k3 = false;
                this.f5653b2.setEnabled(true);
                if (n4Var.f5598f) {
                    long starsPrice = this.f5653b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f5653b2.g1(nd.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f5653b2.O4), z10);
                        vq vqVar = this.f5653b2.O4[0];
                        if (vqVar != null) {
                            vqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f5653b2.g1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                u2 u2Var2 = this.f5653b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                u2Var2.g1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean r0() {
        if (this.f5707s3) {
            if (this.f5704r3.getReactionsWindow() != null) {
                if (this.f5727y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f5704r3.getReactionsWindow().f871c);
                    return true;
                }
                this.f5704r3.getReactionsWindow().d();
                return true;
            }
            a1(false);
            return true;
        }
        m3 m3Var = this.f5679j1;
        if (m3Var != null) {
            ei.x3 x3Var = m3Var.f5263c;
            if (x3Var != null) {
                x3Var.e(true);
                m3Var.f5263c = null;
            }
            m3Var.f5262b = null;
            m3Var.invalidate();
            m3Var.b(false);
        }
        u3 u3Var = this.K0;
        if (u3Var.W.x()) {
            u3Var.W.f(false);
            return true;
        }
        ei.x3 x3Var2 = this.F0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = this.G0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        p40 p40Var = this.W2;
        if (p40Var != null) {
            p40Var.b(true);
        }
        g4 g4Var = this.f5708t1;
        if (g4Var != null && g4Var.f26427b) {
            g4Var.a();
            return true;
        }
        u2 u2Var = this.f5653b2;
        if (u2Var != null && u2Var.s0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f5653b2.f24067c1) {
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new y1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((q9) this.Q1).h(alertDialog$Builder.f20679a);
            return true;
        }
        fl0 fl0Var = this.f5668f2;
        if (fl0Var != null && fl0Var.getReactionsWindow() != null && !this.f5668f2.getReactionsWindow().f882q) {
            this.f5668f2.getReactionsWindow().d();
            return true;
        }
        u2 u2Var2 = this.f5653b2;
        if (u2Var2 != null && u2Var2.q0()) {
            if (this.f5727y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f5653b2.getEmojiView());
                return true;
            }
            this.f5653b2.k0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            u2 u2Var3 = this.f5653b2;
            if (u2Var3 != null) {
                long j10 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f5595a;
                Editable editText = u2Var3.getEditText();
                this.J0.getClass();
                z9.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f5653b2);
            return true;
        } else if (u3Var.getVisibility() != 0 || u3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            u3Var.C();
            this.f5672g3 = false;
            this.f5656c1.invalidate();
            return true;
        }
    }

    public final void s0() {
        if (this.I2 == null) {
            a3 a3Var = new a3(this, getContext(), this.B0);
            this.I2 = a3Var;
            a3Var.f30138c2 = new b3(this);
            a3Var.f30158j0.f0();
            a3 a3Var2 = this.I2;
            a3Var2.W = true;
            a3Var2.w1();
            a3 a3Var3 = this.I2;
            a3Var3.X = new c3(this);
            a3Var3.r1().setText(this.f5653b2.getFieldText());
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f5682k1.f40951b = i10;
        fl0 fl0Var = this.f5668f2;
        if (fl0Var != null) {
            fl0Var.setCurrentAccount(i10);
            this.f5668f2.p(null, null, true);
        }
        fl0 fl0Var2 = this.f5704r3;
        if (fl0Var2 != null) {
            fl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        S0(0L, z10);
    }

    public void setDelegate(i4 i4Var) {
        this.Q1 = i4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f5669f3 != z10) {
            this.f5669f3 = z10;
            if (z10) {
                this.f5664e1.setCurrentAlpha(1.0f);
                q0(false);
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
        if (this.f5652b1 != z10) {
            this.f5652b1 = z10;
            this.f5656c1.invalidate();
            if (this.K1 && this.J0.f6220a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                z9 z9Var = ((q9) this.Q1).d;
                z9Var.l1 = true;
                z9Var.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            f3 f3Var = this.f5664e1;
            if (z10) {
                f3Var.stopAnimation();
                f3Var.setAllowStartAnimation(false);
            } else {
                f3Var.startAnimation();
                f3Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f5656c1.invalidate();
        }
    }

    public final void t0() {
        if (this.X1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.I3);
            this.X1 = aVar;
            aVar.setOnClickListener(new e2(this, 1));
            addView(this.X1, w7.z5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.B0;
        u2 u2Var = new u2(this, AndroidUtilities.findActivity(getContext()), this, new s2(1, g6Var));
        this.f5653b2 = u2Var;
        u2Var.getEditField().useAnimatedTextDrawable();
        this.f5653b2.getEditField().setScaleX(0.0f);
        this.f5653b2.setOverrideKeyboardAnimation(true);
        this.f5653b2.setClipChildren(false);
        this.f5653b2.setDelegate(new v2(this));
        setDelegate(this.f5653b2);
        u2 u2Var2 = this.f5653b2;
        u2Var2.f24197y4 = false;
        u2Var2.f24202z4 = true;
        if (this.O1.f5598f) {
            u2Var2.S0(false, false, false);
        } else {
            u2Var2.S0(true, true, false);
        }
        this.f5653b2.updateColors();
        u2 u2Var3 = this.f5653b2;
        u2Var3.A4 = true;
        addView(u2Var3, w7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.f5653b2.M1(false);
        }
        this.f5653b2.G2 = this.f5730z2;
        o4 o4Var = this.M2;
        ((ArrayList) o4Var.f5635g).add(this.f5656c1);
        ((ArrayList) o4Var.f5635g).add(this);
        if (this.f5649a1) {
            this.f5653b2.C0();
        }
        q0(false);
        if (H0()) {
            this.f5653b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), g6Var, this.I3, this.F3);
        this.f5657c2 = hVar;
        hVar.setOnClickListener(new y1(this, 1));
        addView(this.f5657c2, w7.z5.e(57, 300, 85));
        this.f5657c2.setVisibility(8);
        this.f5653b2.setSideButtonsForAttach(this.f5657c2);
        this.I0 = getChildCount();
    }

    public final void v0() {
        if (this.f5680j2 != null) {
            return;
        }
        x8 x8Var = new x8(getContext(), this.B0);
        this.f5680j2 = x8Var;
        x8Var.setOnClickListener(new e2(this, 4));
        this.f5680j2.setAlpha(0.0f);
        this.f5680j2.setVisibility(8);
        addView(this.f5680j2, w7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void w0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            t1 t1Var = new t1(getContext(), this.I3);
            this.a2 = t1Var;
            t1Var.setOnClickListener(new e2(this, 5));
            t1 t1Var2 = this.a2;
            h1 h1Var = h1.W;
            boolean z11 = true;
            if (h1Var != null && h1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            t1Var2.b(z10, false);
            t1 t1Var3 = this.a2;
            h1 h1Var2 = h1.W;
            if (h1Var2 != null && !h1Var2.m()) {
                z11 = false;
            }
            t1Var3.a(z11, false);
            addView(this.a2, w7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void x0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new w1(getContext(), this.C2);
            x1 x1Var = new x1(getContext(), this.Y1, this.I3);
            this.Z1 = x1Var;
            x1Var.setOnClickListener(new e2(this, 6));
            this.Z1.setOnLongClickListener(new b2(this, 1));
            addView(this.Z1, w7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.Y1, w7.z5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void y0() {
        int i10;
        if (this.f5671g2 != null) {
            return;
        }
        if (this.f5653b2 == null) {
            u0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5671g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f5674h2 = textView;
        textView.setTextColor(-8026747);
        this.f5674h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f5674h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f5677i2 = textView3;
        textView3.setTextColor(-1);
        this.f5677i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f5677i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f5677i2.setGravity(17);
        w7.b6.a(this.f5677i2);
        this.f5677i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f5677i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f5671g2.addView(imageView, w7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.f5671g2.addView(this.f5674h2, w7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f5671g2.addView(this.f5677i2, w7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f5653b2.addView(this.f5671g2, w7.z5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void z0() {
        if (this.f5654b3 != null) {
            return;
        }
        wd wdVar = new wd(getContext(), 1);
        this.f5654b3 = wdVar;
        wdVar.setTextSize(1, 14.0f);
        this.f5654b3.setTextColor(i0.a.f(0.5f, -16777216, -1));
        this.f5654b3.setGravity(19);
        this.f5654b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f5654b3, w7.z5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }
}
