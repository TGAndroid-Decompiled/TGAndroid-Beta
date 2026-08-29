package lh;

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
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import jh.ia;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.de;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lu0;
import org.telegram.ui.pr;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
public abstract class d4 extends hv0 implements NotificationCenter.NotificationCenterDelegate {
    public x6 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public nh.t3 B0;
    public boolean B1;
    public z2 B2;
    public final lg.a B3;
    public nh.t3 C0;
    public boolean C1;
    public boolean C2;
    public final qg.a C3;
    public nh.t3 D0;
    public long D1;
    public float D2;
    public final qg.d D3;
    public int E0;
    public final float E1;
    public s2 E2;
    public final og.b E3;
    public final i9 F0;
    public int F1;
    public s50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final l3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final f2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final c4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final b4 K1;
    public final org.telegram.ui.Components.d6 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final y2 L0;
    public final bg.c2 L1;
    public final org.telegram.ui.Components.d6 L2;
    public final v1 L3;
    public org.telegram.ui.Components.n6 M0;
    public x3 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.n6 N0;
    public boolean N1;
    public long N2;
    public final v1 N3;
    public org.telegram.ui.Components.d6 O0;
    public s6 O1;
    public boolean O2;
    public final ArrayList O3;
    public org.telegram.ui.Components.d6 P0;
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
    public final ag.q1 R3;
    public long S0;
    public y2 S1;
    public g40 S2;
    public final org.telegram.ui.Components.d6 S3;
    public long T0;
    public a T1;
    public final lu0 T2;
    public final org.telegram.ui.Components.d6 T3;
    public boolean U0;
    public q1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.d6 U3;
    public boolean V0;
    public r1 V1;
    public v2 V2;
    public float V3;
    public boolean W0;
    public n1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public n2 X1;
    public eg.r X2;
    public boolean X3;
    public final h3 Y0;
    public ug.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public nh.t3 Z1;
    public p2 Z2;
    public float Z3;
    public final x2 f15468a1;
    public ValueAnimator a2;
    public float f15469a3;
    public final ImageReceiver f15470b1;
    public fk0 f15471b2;
    public boolean f15472b3;
    public final ImageReceiver f15473c1;
    public LinearLayout f15474c2;
    public boolean c3;
    public final ArrayList f15475d1;
    public TextView f15476d2;
    public boolean f15477d3;
    public Runnable f15478e1;
    public TextView f15479e2;
    public boolean f15480e3;
    public final e3 f15481f1;
    public g8 f15482f2;
    public boolean f15483f3;
    public final ry f15484g1;
    public ViewPropertyAnimator f15485g2;
    public boolean f15486g3;
    public h4 f15487h1;
    public final ng.d f15488h2;
    public final ImageReceiver f15489h3;
    public float f15490i1;
    public final ng.d f15491i2;
    public kg.d f15492i3;
    public final org.telegram.ui.Components.e9 f15493j1;
    public final Paint f15494j2;
    public final ImageReceiver f15495j3;
    public final z3 f15496k1;
    public int f15497k2;
    public org.telegram.ui.Components.p5 f15498k3;
    public final h8 l1;
    public ValueAnimator f15499l2;
    public boolean f15500l3;
    public v5.l f15501m1;
    public float f15502m2;
    public boolean f15503m3;
    public int f15504n1;
    public float f15505n2;
    public fk0 f15506n3;
    public org.telegram.ui.ActionBar.g1 f15507o1;
    public float f15508o2;
    public boolean f15509o3;
    public w3 f15510p1;
    public int f15511p2;
    public float f15512p3;
    public TL_stories.PeerStories f15513q1;
    public boolean f15514q2;
    public boolean f15515q3;
    public final ArrayList f15516r1;
    public boolean f15517r2;
    public float f15518r3;
    public final ImageView f15519s0;
    public final ArrayList f15520s1;
    public boolean f15521s2;
    public int f15522s3;
    public final ImageView f15523t0;
    public final a4 f15524t1;
    public boolean f15525t2;
    public int f15526t3;
    public final bh.d f15527u0;
    public final jf.o0 f15528u1;
    public int f15529u2;
    public int f15530u3;
    public final aj0 f15531v0;
    public ArrayList f15532v1;
    public final int f15533v2;
    public v1 f15534v3;
    public final ImageView f15535w0;
    public int f15536w1;
    public TextView f15537w2;
    public float f15538w3;
    public final org.telegram.ui.ActionBar.c6 f15539x0;
    public long f15540x1;
    public hh.b f15541x2;
    public boolean f15542x3;
    public final n8 f15543y0;
    public boolean f15544y1;
    public int f15545y2;
    public pr f15546y3;
    public final y2 f15547z0;
    public boolean f15548z1;
    public int f15549z2;
    public org.telegram.ui.ActionBar.g1 f15550z3;

    public d4(Context context, final i9 i9Var, a4 a4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.X0 = true;
        this.f15475d1 = new ArrayList();
        this.f15504n1 = -5;
        this.E1 = 1.0f;
        b4 b4Var = new b4(this);
        this.K1 = b4Var;
        this.f15502m2 = -1.0f;
        this.f15505n2 = -1.0f;
        this.f15508o2 = -1.0f;
        this.f15533v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.d6(this);
        this.L2 = new org.telegram.ui.Components.d6(this);
        lu0 lu0Var = new lu0();
        this.T2 = lu0Var;
        this.f15469a3 = 1.0f;
        this.L3 = new v1(this, 4);
        this.N3 = new v1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new ag.q1(this, 29);
        this.S3 = new org.telegram.ui.Components.d6(this);
        this.T3 = new org.telegram.ui.Components.d6(this);
        this.U3 = new org.telegram.ui.Components.d6(this);
        this.W3 = new Path();
        lu0Var.E = new ag.o1(this, 21);
        ?? obj = new Object();
        obj.f15431g = new ArrayList();
        this.I2 = obj;
        this.J2 = new AnimationNotificationsLocker();
        this.f15516r1 = new ArrayList();
        this.f15520s1 = new ArrayList();
        x2 x2Var = new x2(this, 0);
        this.f15468a1 = x2Var;
        x2Var.setCrossfadeWithOldImage(false);
        x2Var.setAllowLoadingOnAttachedOnly(true);
        x2Var.ignoreNotifications = true;
        x2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f15489h3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f15495j3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f15470b1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f15473c1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        x2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f15493j1 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.F0 = i9Var;
        this.f15524t1 = a4Var;
        this.L1 = a4Var.f15319g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        a4Var.f15323l.setColor(-16777216);
        this.f15494j2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f15539x0 = c6Var;
        setClipChildren(false);
        e3 e3Var = new e3(this, context, this.Y0, c6Var, i9Var);
        this.f15481f1 = e3Var;
        og.b bVar = new og.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.E3 = bVar;
        qg.c cVar = new qg.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            qg.d dVar = new qg.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        } else {
            this.D3 = null;
            this.C3 = cVar;
        }
        sg.i iVar = new sg.i(this);
        lg.a aVar = new lg.a(this.C3);
        aVar.d = iVar;
        aVar.f15224e = this;
        this.B3 = aVar;
        this.f15488h2 = aVar.c(this, bVar, false);
        ng.d c3 = aVar.c(this, bVar, false);
        this.f15491i2 = c3;
        c3.t(AndroidUtilities.dp(32.0f));
        h3 h3Var = new h3(this, context, a4Var, i9Var);
        this.Y0 = h3Var;
        h3Var.setClipChildren(false);
        this.f15484g1 = new ry(this.f15545y2, h3Var);
        h3Var.addView(e3Var, i7.f6.c(-1.0f, -1));
        l3 l3Var = new l3(this, getContext(), i9Var.f15793y, i9Var, c6Var);
        this.G0 = l3Var;
        l3Var.U.setOnClickListener(new x1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(a4Var.f15324m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new x1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        i7.h6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(a4Var.f15325n);
        imageView2.setPadding(dp, dp, dp, dp);
        y2 y2Var = new y2(this, getContext(), 1);
        this.L0 = y2Var;
        org.telegram.ui.Components.n6 n6Var = this.N0;
        if (n6Var != null) {
            n6Var.setCallback(y2Var);
        }
        y2Var.setWillNotDraw(false);
        y2Var.setOnClickListener(new x1(this, 12));
        y2 y2Var2 = new y2(this, getContext(), 2);
        this.f15547z0 = y2Var2;
        org.telegram.ui.Components.n6 n6Var2 = this.M0;
        if (n6Var2 != null) {
            n6Var2.setCallback(y2Var2);
        }
        y2Var2.setWillNotDraw(false);
        y2Var2.setOnClickListener(new x1(this, 13));
        y2Var2.setOnLongClickListener(new e2(0, this, i9Var));
        x6 x6Var = new x6(context, a4Var);
        this.A0 = x6Var;
        x6Var.setPadding(dp, dp, dp, dp);
        y2Var2.addView(this.A0, i7.f6.e(40, 40, 3));
        y2Var.addView(imageView2, i7.f6.e(40, 40, 3));
        i7.h6.b(y2Var2, 0.3f, 5.0f);
        i7.h6.b(y2Var, 0.3f, 5.0f);
        x2Var.setAllowLoadingOnAttachedOnly(true);
        x2Var.setParentView(h3Var);
        jf.o0 o0Var = new jf.o0(10);
        this.f15528u1 = o0Var;
        h3Var.setOutlineProvider(o0Var);
        h3Var.setClipToOutline(true);
        addView(h3Var);
        z3 z3Var = new z3(context, b4Var);
        this.f15496k1 = z3Var;
        z3Var.setOnClickListener(new View.OnClickListener(this) {
            public final d4 f16256b;

            {
                this.f16256b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        d4 d4Var = this.f16256b;
                        long j10 = UserConfig.getInstance(d4Var.f15545y2).clientUserId;
                        long j11 = d4Var.f15540x1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle h = a4.w.h(1, "type");
                            h.putLong("dialog_id", d4Var.f15540x1);
                            i9Var2.H(new y90(h, null));
                            return;
                        } else if (j11 > 0) {
                            i9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            i9Var2.H(tn.R9(j11));
                            return;
                        }
                    default:
                        d4 d4Var2 = this.f16256b;
                        if (d4Var2.K1.j()) {
                            i9Var.O();
                            if (!i9.f15741z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bh.d dVar2 = d4Var2.f15527u0;
                            if (!i9.f15741z1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            dVar2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        d4Var2.c1(true);
                        return;
                }
            }
        });
        h3Var.addView(z3Var, i7.f6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, i7.f6.q(40, 40, 5));
        linearLayout.addView(y2Var, i7.f6.q(40, 40, 5));
        linearLayout.addView(y2Var2, i7.f6.q(40, 40, 5));
        addView(linearLayout, i7.f6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f15519s0 = imageView3;
        imageView3.setImageDrawable(a4Var.f15328q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        h3Var.addView(imageView3, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f15523t0 = imageView4;
        imageView4.setImageDrawable(a4Var.f15329r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        h3Var.addView(imageView4, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ag.o(i9Var, 26));
        imageView3.setOnClickListener(new b0(this, c6Var, i9Var, context, a4Var, 1));
        bh.d dVar2 = new bh.d(context, 4);
        this.f15527u0 = dVar2;
        h3Var.addView(dVar2, i7.f6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f15531v0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f15535w0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(a4Var.f15331t);
        dVar2.addView(imageView6);
        imageView6.setVisibility(8);
        n8 n8Var = new n8(context);
        this.f15543y0 = n8Var;
        n8Var.setOnClickListener(new x1(this, 2));
        h3Var.addView(n8Var, i7.f6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final d4 f16256b;

            {
                this.f16256b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        d4 d4Var = this.f16256b;
                        long j10 = UserConfig.getInstance(d4Var.f15545y2).clientUserId;
                        long j11 = d4Var.f15540x1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle h = a4.w.h(1, "type");
                            h.putLong("dialog_id", d4Var.f15540x1);
                            i9Var2.H(new y90(h, null));
                            return;
                        } else if (j11 > 0) {
                            i9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            i9Var2.H(tn.R9(j11));
                            return;
                        }
                    default:
                        d4 d4Var2 = this.f16256b;
                        if (d4Var2.K1.j()) {
                            i9Var.O();
                            if (!i9.f15741z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            bh.d dVar22 = d4Var2.f15527u0;
                            if (!i9.f15741z1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            dVar22.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        d4Var2.c1(true);
                        return;
                }
            }
        });
        this.l1 = new h8(this, a4Var);
        h3Var.addView(l3Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        f2 f2Var = new f2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.H0 = f2Var;
        h3Var.addView(view, i7.f6.e(-1, 200, 87));
        h3Var.addView(f2Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        h3Var.addView(frameLayout, i7.f6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k9 = i0.a.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, 0, k9, k9));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, 0, k10, k10));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp4, dp4, dp4, dp4, 0, k11, k11));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        y2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp6, dp6, dp6, dp6, 0, k13, k13));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        y2Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp7, dp7, dp7, dp7, 0, k14, k14));
        u9 u9Var = l3Var.S;
        View o10 = u9Var.o(context);
        if (o10 != null) {
            AndroidUtilities.removeFromParent(o10);
            addView(o10);
        }
        u9Var.D = new g2(this, 0);
        u9Var.T(this);
    }

    public static void V0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.f16174s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f16171f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(r6Var.f16170e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(d4 d4Var, ValueAnimator valueAnimator) {
        float f9;
        n8 n8Var = d4Var.f15543y0;
        d4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z3 z3Var = d4Var.f15496k1;
        z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        z3Var.setAlpha(1.0f - d4Var.Z3);
        ImageView imageView = d4Var.f15519s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        imageView.setAlpha(1.0f - d4Var.Z3);
        ImageView imageView2 = d4Var.f15523t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        imageView2.setAlpha(1.0f - d4Var.Z3);
        bh.d dVar = d4Var.f15527u0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
        dVar.setAlpha((1.0f - d4Var.Z3) * d4Var.f15469a3);
        y2 y2Var = d4Var.S1;
        if (y2Var != null) {
            y2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var.Z3);
            d4Var.S1.setAlpha(1.0f - d4Var.Z3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var.Z3);
            n8Var.setAlpha(1.0f - d4Var.Z3);
        }
        d4Var.G0.setAlpha(1.0f - d4Var.Z3);
        x3 x3Var = d4Var.M1;
        if (x3Var == null) {
            f9 = 0.0f;
        } else {
            f9 = ((z8) x3Var).d.R;
        }
        float hideInterfaceAlpha = d4Var.getHideInterfaceAlpha();
        y2 y2Var2 = d4Var.f15547z0;
        if (y2Var2 != null) {
            y2Var2.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        ImageView imageView3 = d4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        y2 y2Var3 = d4Var.L0;
        if (y2Var3 != null) {
            y2Var3.setAlpha((1.0f - d4Var.Z3) * (1.0f - f9) * hideInterfaceAlpha);
        }
        n2 n2Var = d4Var.X1;
        if (n2Var != null) {
            n2Var.setAlpha(1.0f - d4Var.Z3);
            d4Var.invalidate();
        }
        d4Var.Y0.invalidate();
    }

    public static void a0(d4 d4Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = d4Var.f15550z3;
        if (g1Var != null && d4Var.f15546y3 != null && g1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(i9.f15739x1 - 0.2f) < 0.05f) {
                    d4Var.f15550z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(i9.f15739x1 - 0.5f) < 0.05f) {
                    d4Var.f15550z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(i9.f15739x1 - 1.0f) < 0.05f) {
                    d4Var.f15550z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(i9.f15739x1 - 1.5f) < 0.05f) {
                    d4Var.f15550z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(i9.f15739x1 - 2.0f) < 0.05f) {
                    d4Var.f15550z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var2 = d4Var.f15550z3;
                    int i10 = R.string.VideoSpeedCustom;
                    g1Var2.setSubtext(LocaleController.formatString(i10, cf.f.a(i9.f15739x1) + "x"));
                }
            }
            d4Var.f15546y3.a(i9.f15739x1, z10);
        }
    }

    public static void b0(d4 d4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!d4Var.I0() && !d4Var.K1.f15378f) {
            if (UserConfig.getInstance(d4Var.f15545y2).isPremium()) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.f15539x0).setOnClickListener(new x1(d4Var, 8));
                return;
            }
            Drawable drawable = d4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            h2 h2Var = new h2(d4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, d4Var.f15539x0);
            c3.setOnClickListener(new x1(d4Var, 9));
            c3.setIcon(h2Var);
        }
    }

    public static void d0(d4 d4Var) {
        b4 b4Var = d4Var.K1;
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if ((storyItem == null && b4Var.f15375b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = b4Var.h();
        boolean z10 = b4Var.f15377e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), d4Var.getContext(), z10 ? 1 : 0, null, null, new jh.m6(1, d4Var, z10));
            return;
        }
        d4Var.a1();
    }

    public static void e0(d4 d4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(d4Var.f15545y2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new jh.i(d4Var, MessagesController.getInstance(d4Var.f15545y2), j10, !z10, str, user), 200L);
    }

    public static void f0(d4 d4Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d4Var.getContext(), 0, d4Var.f15539x0);
        if (d4Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
        if (d4Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new s1(d4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.d(26));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        ((z8) d4Var.M1).h(c2Var);
        c2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.f15545y2);
    }

    public float getHideInterfaceAlpha() {
        float f9;
        float f10 = 1.0f - this.K2.f27666c;
        l5 l5Var = this.F0.f15789w;
        if (l5Var == null) {
            f9 = 0.0f;
        } else {
            f9 = l5Var.f15886f;
        }
        return (1.0f - f9) * f10;
    }

    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.K1.f15378f || (i9Var = this.F0) == null || i9Var.f15790w0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.f15790w0.j();
    }

    public static void h0(d4 d4Var) {
        String str;
        mc J;
        org.telegram.ui.ActionBar.c6 c6Var = d4Var.f15539x0;
        h3 h3Var = d4Var.Y0;
        if (d4Var.C1) {
            return;
        }
        if (d4Var.A1) {
            if (d4Var.F3 != null && d4Var.G3 != null) {
                cg.v0.C1(new cg.z1(d4Var, 4), d4Var.F3, d4Var.G3, d4Var.f15540x1, true);
                return;
            }
            i9 i9Var = d4Var.F0;
            if (i9Var != null) {
                i9Var.f15760g1 = true;
                i9Var.P();
            }
            MessagesController.getInstance(d4Var.f15545y2).getBoostsController().getBoostsStats(d4Var.f15540x1, new kg.i(d4Var, 1));
            return;
        }
        n2 n2Var = d4Var.X1;
        int i10 = -d4Var.f15504n1;
        d4Var.f15504n1 = i10;
        AndroidUtilities.shakeViewSpring(n2Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (d4Var.f15540x1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(d4Var.f15545y2).getUser(Long.valueOf(d4Var.f15540x1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(d4Var.f15545y2).premiumFeaturesBlocked()) {
            J = new tc(h3Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new tc(h3Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new v1(d4Var, 5));
        }
        J.j();
    }

    public static void j0(d4 d4Var) {
        b4 b4Var = d4Var.K1;
        if (b4Var.f15374a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f22634id = b4Var.f15374a.f22629id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(d4Var.f15545y2).getInputPeer(d4Var.f15540x1);
        ConnectionsManager.getInstance(d4Var.f15545y2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        eg.r rVar = new eg.r(getContext(), 2);
        this.X2 = rVar;
        rVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, i7.f6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        y2 y2Var = new y2(this, getContext(), 0);
        this.S1 = y2Var;
        y2Var.setClickable(true);
        addView(this.S1, i7.f6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        z2 z2Var = new z2(this, getContext());
        this.B2 = z2Var;
        z2Var.setOnClickListener(new x1(this, 0));
        this.S1.addView(this.B2, i7.f6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        hh.b bVar = new hh.b(1, getContext(), false);
        this.f15541x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.f15541x2, i7.f6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f15537w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f15537w2.setTextColor(-1);
        this.S1.addView(this.f15537w2, i7.f6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f15524t1.f15330s);
        z2 z2Var2 = this.B2;
        int dp = AndroidUtilities.dp(15.0f);
        int k9 = i0.a.k(-1, 120);
        z2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, k9, k9));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f15539x0;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        i7.h6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, k9, k9));
        textView2.setOnClickListener(new x1(this, 3));
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        linearLayout.addView(textView2, i7.f6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, i7.f6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Y0.addView(frameLayout);
        this.W2 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d1 d1Var;
        TLRPC.Peer i10;
        d1 d1Var2;
        long clientUserId = UserConfig.getInstance(this.f15545y2).getClientUserId();
        long j10 = this.f15540x1;
        i9 i9Var = this.F0;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 < 0 && (d1Var2 = i9Var.f15790w0) != null) {
            if (z10) {
                TLRPC.Peer i12 = d1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-this.f15540x1));
                if (i9Var.f15790w0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.f15540x1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.f15545y2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && i9Var != null && (d1Var = i9Var.f15790w0) != null && d1Var.l()) {
            if (!z10 || (i10 = i9Var.f15790w0.i()) == null || this.f15540x1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.f15540x1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        c4 c4Var = this.I2;
        e5.c cVar = c4Var.d;
        if (cVar != null && c4Var.f15428c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(c4Var.f15428c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (cVar != null && (textureView = c4Var.f15429e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            h3 h3Var = this.Y0;
            canvas.scale(i10 / h3Var.getMeasuredWidth(), i11 / h3Var.getMeasuredHeight());
            this.f15468a1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(nh.c9 c9Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        x3 x3Var = this.M1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        nh.e9 e9Var = new nh.e9(context, i10, this.f15539x0);
        e9Var.q1(c9Var);
        nh.g1 g1Var = e9Var.f17603b;
        if (g1Var != null) {
            for (View view : g1Var.getViewPages()) {
                if (view instanceof nh.y8) {
                    ((nh.y8) view).e(false);
                }
            }
        }
        e9Var.k1(true);
        e9Var.P = new kg.w(2, this, storyItem);
        ((z8) x3Var).h(e9Var);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x4 = getX();
        h3 h3Var = this.Y0;
        float x10 = view.getX() + h3Var.getX() + x4;
        float y8 = view.getY() + h3Var.getY() + getY();
        if (motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + view.getWidth() && motionEvent.getY() >= y8 && motionEvent.getY() <= y8 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        k6 k6Var;
        i9 i9Var = this.F0;
        if (i9Var != null && (k6Var = i9Var.K0) != null && k6Var.f15835e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.f15545y2).getUser(Long.valueOf(this.F0.K0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(kg.q0 q0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        b4 b4Var = this.K1;
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && q0Var == null) {
            l0();
            this.O1.g0(this.f15540x1, b4Var.f15374a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f15545y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f15500l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = kg.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f15489h3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.f15503m3 = true;
                this.O1.g0(this.f15540x1, b4Var.f15374a, kg.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.f15540x1, b4Var.f15374a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = b4Var.f15374a;
        y2 y2Var = this.f15547z0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.A0.setReaction(kg.q0.d(reaction));
            y2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.A0.setReaction(null);
            y2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.f15548z1 && z10) {
            TL_stories.StoryItem storyItem3 = b4Var.f15374a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = b4Var.f15374a.views;
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
        TL_stories.StoryItem storyItem4 = b4Var.f15374a;
        kg.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d1 d1Var;
        boolean z10;
        if (this.K3 == null) {
            i9 i9Var = this.F0;
            if (i9Var != null && (d1Var = i9Var.f15790w0) != null) {
                TLRPC.GroupCall groupCall = d1Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.f15545y2).getSendAsPeers(this.f15540x1, true);
            this.K3 = sendAsPeers;
            n2 n2Var = this.X1;
            if (n2Var != null && sendAsPeers != null) {
                n2Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        n2 n2Var = this.X1;
        if (n2Var == null) {
            return false;
        }
        boolean z10 = n2Var.f26200u2;
        if (z10) {
            n2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new v1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        ag.i0 i0Var;
        int i10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.X1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.f15545y2).getClientUserId();
        TLRPC.Peer i11 = this.F0.f15790w0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.f15545y2;
        String shortName = DialogObject.getShortName(i12, this.f15540x1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.H3;
        ag.i0 i0Var2 = new ag.i0(this, 25);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, bVar, false, false);
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
            j10 = j12;
            i0Var = i0Var2;
            i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j12;
            i0Var = i0Var2;
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
            if (length < 0) {
                break;
            }
            int i13 = length * 7;
            int i14 = iArr[i13];
            int[] iArr2 = iArr;
            int i15 = iArr2[i13 + 2];
            if (i10 <= iArr2[i13 + 3] && charSequence.length() <= i15) {
                max = Math.max(max, i14);
                break;
            } else {
                length--;
                iArr = iArr2;
            }
        }
        final long[] jArr = {max};
        final iq[] iqVarArr = new iq[1];
        final nh.d dVar = new nh.d(context, null, true);
        final ?? obj = new Object();
        obj.f16196c = clientUserId;
        obj.f16198f = textWithEntities;
        obj.f16199g = jArr[0];
        final n0 n0Var = new n0(i12, context, true);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
        final bg.x2 x2Var = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        g10.addView(x2Var, i7.f6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final bg.x2 x2Var2 = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        g10.addView(x2Var2, i7.f6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final bg.x2 x2Var3 = new bg.x2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        g10.addView(x2Var3, i7.f6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final r rVar = new r(context, bVar, r6);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), iqVarArr), true, true);
                long j13 = jArr2[0];
                s0 s0Var = obj;
                s0Var.f16199g = j13;
                n0Var.set(s0Var);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = s.b(i16, intValue2, 0);
                int b11 = s.b(i16, num.intValue(), 1);
                int b12 = s.b(i16, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.o6) x2Var.f2608b).c(formatString, true, true);
                ((org.telegram.ui.Components.o6) x2Var2.f2608b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.o6) x2Var3.f2608b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = s.b(i16, num.intValue(), 3);
                int b14 = s.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                rVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        n0Var.set(obj);
        int i16 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr4 = iArr3;
            if (iArr3[i18] >= messageMinPrice) {
                if (i18 > 0 && arrayList.isEmpty() && iArr4[i18] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i19 = iArr4[i18];
                if (i19 > i17) {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
                arrayList.add(Integer.valueOf(i19));
                if (iArr4[i18] == i17) {
                    break;
                }
            }
            i18++;
            iArr3 = iArr4;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) j7.l1.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr5[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        rVar.f11749a0 = iArr5;
        rVar.setValue((int) jArr[0]);
        linearLayout.addView(rVar, i7.f6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(g10, i7.f6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.g6.f23169j5;
        TextView b10 = i7.j6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, i7.f6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = i7.j6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        org.telegram.ui.b.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, i7.f6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(n0Var, i7.f6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, i7.f6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new bg.q(i0Var, jArr, f3Var, 10));
    }

    public final void P0() {
        if (this.X1 == null) {
            return;
        }
        t0();
        this.E2.f31005f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.X1.P();
        }
        this.E2.J1(-1, true);
        s2 s2Var = this.E2;
        s2Var.V = this.f15540x1;
        s2Var.r1();
        this.E2.m1().setText(this.X1.getFieldText());
        ((z8) this.M1).h(this.E2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.f15540x1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.f15545y2).getDialog(this.f15540x1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.F0.H(new tn(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.S0(android.net.Uri):void");
    }

    public final void T0(long j10, boolean z10) {
        int i10;
        int i11;
        if (this.G1 != z10) {
            this.G1 = z10;
            aj0 aj0Var = this.f15531v0;
            int i12 = 0;
            if (z10) {
                if (this.F0.f15742a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.f15762h1 = true;
                    i9Var.P();
                    ag.q1 q1Var = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
                    AndroidUtilities.runOnUIThread(q1Var, 100L);
                }
                R0(j10);
                g1();
                aj0Var.setAnimation(this.f15524t1.f15332u);
                this.G1 = true;
                this.f15496k1.f16453a.getImageReceiver().setVisible(true, true);
                b4 b4Var = this.K1;
                if (b4Var.f15374a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.f15540x1 + " storyId=" + b4Var.f15374a.f22629id + " " + b4.c(b4Var));
                }
            } else {
                p0();
                aj0Var.a();
                this.f15487h1 = null;
                this.H2 = false;
                this.K2.d(0.0f, true);
                this.Y0.invalidate();
                invalidate();
                q0();
                i9 i9Var2 = ((z8) this.M1).d;
                i9Var2.E0 = false;
                i9Var2.P();
            }
            if (this.G1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f15468a1.setFileLoadingPriority(i10);
            if (this.G1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f15470b1.setFileLoadingPriority(i11);
            if (this.G1) {
                i12 = 2;
            }
            this.f15473c1.setFileLoadingPriority(i12);
            if (this.f15544y1 || this.f15548z1) {
                s6 s6Var = this.O1;
                long j11 = this.f15540x1;
                boolean z11 = this.G1;
                a0.h hVar = s6Var.f16228m;
                r9 r9Var = (r9) hVar.f(j11);
                if (r9Var == null) {
                    r9Var = new r9(s6Var.f16218a, j11, s6Var);
                    hVar.k(r9Var, j11);
                }
                r9Var.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.f15540x1 != j10) {
            b4 b4Var = this.K1;
            b4Var.f15375b = null;
            b4Var.f15374a = null;
        }
        this.f15540x1 = j10;
        this.f15532v1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.F0.M0;
        boolean z10 = true;
        if (peerStories != null) {
            this.O1.S(peerStories, true);
            return;
        }
        s6 s6Var = this.O1;
        TL_stories.PeerStories y8 = s6Var.y(j10);
        if (y8 == null) {
            y8 = s6Var.z(j10);
        } else {
            z10 = false;
        }
        s6Var.S(y8, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        z3 z3Var = this.f15496k1;
        if (j10 >= 0) {
            if (this.f15544y1 && !z11) {
                z3Var.f16454b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                z3Var.f16454b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.f15545y2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                jq jqVar = new jq(mutate, null);
                jqVar.f29792w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                jqVar.h = dp;
                jqVar.f29789n = dp2;
                z3Var.f16454b.i(jqVar);
            } else {
                z3Var.f16454b.i(null);
            }
            if (user != null) {
                z3Var.f16454b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), z3Var.f16454b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            z3Var.f16454b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-j10));
        gg.c cVar = z3Var.f16454b;
        gg.c cVar2 = z3Var.f16454b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        cVar.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            jq jqVar2 = new jq(mutate2, null);
            jqVar2.f29792w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            jqVar2.h = dp3;
            jqVar2.f29789n = dp4;
            cVar2.i(jqVar2);
            return;
        }
        cVar2.i(null);
    }

    public final void X0(float f9, float f10, h4 h4Var) {
        this.f15490i1 = f9;
        this.f15538w3 = 1.0f / f10;
        if (this.f15487h1 != h4Var) {
            this.f15487h1 = h4Var;
            if (h4Var != null) {
                ImageReceiver imageReceiver = h4Var.f15658a;
                if (imageReceiver.getBitmap() != null) {
                    this.f15468a1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        b4 b4Var = this.K1;
        if (b4Var.f15374a != null) {
            i9 i9Var = this.F0;
            if (i9Var.f15756f != null) {
                String e10 = b4Var.e();
                if (z10) {
                    l2 l2Var = new l2(2, this.f15539x0);
                    if (this.f15548z1) {
                        chat = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-this.f15540x1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.f15545y2).storiesEnabled() && ((!this.f15548z1 && !UserObject.isService(this.f15540x1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v2 v2Var = new v2(this, i9Var.f15756f.getContext(), e10, e10, z11, l2Var);
                    this.V2 = v2Var;
                    v2Var.f27834e0 = true;
                    TL_stories.StoryItem storyItem = b4Var.f15374a;
                    storyItem.dialogId = this.f15540x1;
                    v2Var.B0 = storyItem;
                    v2Var.f27845o0 = new za.c(this, 24);
                    ((z8) this.M1).h(v2Var);
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
        h3 h3Var = this.Y0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f15539x0;
        org.telegram.messenger.x3.s(R.string.UnsupportedAttachment, new tc(h3Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f15539x0);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.P = string;
        ((z8) this.M1).h(c2Var);
    }

    public final void b1(boolean z10) {
        if (this.f15509o3 != z10) {
            b4 b4Var = this.K1;
            if (b4Var.f15374a != null) {
                this.f15509o3 = z10;
                if (z10) {
                    this.f15506n3.setVisibility(0);
                }
                this.f15506n3.setStoryItem(b4Var.f15374a);
                i9 i9Var = ((z8) this.M1).d;
                i9Var.l1 = z10;
                i9Var.P();
                float f9 = 0.0f;
                if (z10) {
                    float f10 = this.f15512p3;
                    if (z10) {
                        f9 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    this.f15506n3.setTransitionProgress(this.f15512p3);
                    ofFloat.addUpdateListener(new w1(this, 1));
                    ofFloat.addListener(new i2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(jr.f29801g);
                    ofFloat.start();
                    return;
                }
                if (this.f15506n3.getReactionsWindow() != null) {
                    this.f15506n3.getReactionsWindow().e();
                }
                this.f15506n3.animate().alpha(0.0f).setDuration(150L).setListener(new j2(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.C0 == null) {
            nh.t3 t3Var = new nh.t3(getContext(), 1);
            t3Var.m(1.0f, -56.0f);
            this.C0 = t3Var;
            t3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, i7.f6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        nh.t3 t3Var2 = this.C0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        t3Var2.t(LocaleController.getString(i10));
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
            int i10 = this.F1;
            if (i10 > 0) {
                this.F1 = i10 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f9;
        d1 d1Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        i9 i9Var = this.F0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || i9Var.K0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.G0.U.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                m6 o10 = MessagesController.getInstance(this.f15545y2).getStoriesController().o();
                if (o10 != null && o10.a(this.f15545y2, 1) && this.M1 != null) {
                    cg.z1 z1Var = new cg.z1(this, 4);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.C1;
                    }
                    ((z8) this.M1).h(new cg.v0(o10.b(), this.f15545y2, findActivity, z1Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f15545y2).isUserContactBlocked(this.f15540x1);
                if (this.f15540x1 >= 0 && !UserConfig.getInstance(this.f15545y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
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
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f15540x1 == (-((TLRPC.ChatFull) obj).f22393id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (i9Var != null && (d1Var = i9Var.f15790w0) != null && d1Var.g() == longValue) {
                    f1(false);
                    n2 n2Var = this.X1;
                    if (n2Var != null) {
                        n2Var.J(true);
                        this.X1.P1(true);
                        r0(true);
                    }
                    f2 f2Var = this.H0;
                    if (f2Var != null) {
                        d1 d1Var2 = f2Var.L;
                        if (d1Var2 != null) {
                            j10 = d1Var2.j();
                        }
                        if (f2Var.D != j10) {
                            f2Var.f16281e.N(true);
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
        x3 x3Var = this.M1;
        if (x3Var == null || !((z8) x3Var).d.D0) {
            if (this.G1) {
                j1();
                if (this.f15536w1 == 0) {
                    if (!this.A2) {
                        this.A2 = true;
                        ((z8) this.M1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.F1;
                ArrayList arrayList = this.f15516r1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f15520s1;
                if (i13 >= arrayList2.size() + size) {
                    this.F1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.f15544y1 || this.f15548z1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = i9Var.M0;
            if (peerStories != null) {
                this.O1.S(peerStories, true);
            } else {
                long j11 = this.f15540x1;
                if (j11 != 0) {
                    s6 s6Var = this.O1;
                    TL_stories.PeerStories y8 = s6Var.y(j11);
                    if (y8 == null) {
                        y8 = s6Var.z(j11);
                        z11 = true;
                    }
                    s6Var.S(y8, z11);
                }
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f15507o1;
            if (g1Var != null) {
                ViewPropertyAnimator animate = g1Var.animate();
                if (this.O1.K(this.f15540x1) && this.K1.f15377e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f9 = 0.5f;
                } else {
                    f9 = 1.0f;
                }
                animate.alpha(f9).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        de deVar;
        Canvas canvas2;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.Components.n6 n6Var2;
        l1();
        if (this.f15548z1 && (n6Var2 = this.M0) != null) {
            n6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.f15548z1 && (n6Var = this.N0) != null) {
            n6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f15515q3;
        LinearLayout linearLayout = this.K0;
        y2 y2Var = this.f15547z0;
        if (z10) {
            float measuredWidth = (y2Var.getMeasuredWidth() / 2.0f) + y2Var.getX() + linearLayout.getX();
            float measuredHeight = (y2Var.getMeasuredHeight() / 2.0f) + y2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f9 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f15522s3, measuredWidth - f9, jr.f29801g.getInterpolation(this.f15518r3));
            float lerp2 = AndroidUtilities.lerp(this.f15526t3, measuredHeight - f9, this.f15518r3);
            int lerp3 = AndroidUtilities.lerp(this.f15530u3, dp, this.f15518r3);
            if (this.f15500l3) {
                org.telegram.ui.Components.p5 p5Var = this.f15498k3;
                if (p5Var != null) {
                    float f10 = lerp3;
                    p5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f15498k3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f15495j3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f15503m3) {
            float measuredWidth2 = (y2Var.getMeasuredWidth() / 2.0f) + y2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (y2Var.getMeasuredHeight() / 2.0f) + y2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f15500l3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f15489h3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.f15503m3 = false;
                }
            } else {
                kg.d dVar = this.f15492i3;
                if (dVar != null) {
                    float f16 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f15492i3.b(canvas);
                    if (this.f15492i3.c()) {
                        this.f15492i3.d(this);
                        this.f15492i3 = null;
                        this.f15503m3 = false;
                    }
                } else {
                    this.f15503m3 = false;
                }
            }
        }
        n2 n2Var = this.X1;
        if (n2Var != null) {
            fe feVar = n2Var.f26194t1;
            de deVar2 = n2Var.f26199u1;
            if (n2Var.getAlpha() != 0.0f && (deVar = n2Var.f26088a1) != null && deVar.getParent() != null && n2Var.f26088a1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(n2Var.f26088a1.getX() + feVar.getX() + deVar2.getX() + n2Var.getX(), n2Var.f26088a1.getY() + feVar.getY() + deVar2.getY() + n2Var.getY());
                if (n2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight(), (int) (n2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                n2Var.f26088a1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fk0 fk0Var;
        fk0 fk0Var2;
        qg.d dVar;
        float dp;
        float f9;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        n2 n2Var = this.X1;
        Paint paint = this.f15494j2;
        y2 y2Var = this.f15547z0;
        a4 a4Var = this.f15524t1;
        if (view == n2Var) {
            float f10 = this.f15502m2;
            b4 b4Var = this.K1;
            if (f10 > 0.0f && !b4Var.f15378f) {
                a4Var.f15323l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a4Var.f15323l);
            }
            RectF rectF = a4Var.h;
            RectF rectF2 = a4Var.f15320i;
            RectF rectF3 = a4Var.f15321j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!b4Var.f15378f) {
                if (this.O2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.f15548z1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (y2Var != null && y2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + y2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                n1 n1Var = this.W1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.f15502m2) * dp);
            if (this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f9 = ((1.0f - this.f15502m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f9 = 0.0f;
            }
            this.X1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.f15502m2, -AndroidUtilities.dp(2.0f), f9));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, a4Var.h, this.f15502m2, rectF3);
            ng.d dVar2 = this.f15488h2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.Z3) * (1.0f - this.f15505n2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f15502m2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (n2Var != null && n2Var.u0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = a4Var.f15322k;
            RectF rectF5 = a4Var.f15322k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.W3;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            ng.d dVar3 = this.f15491i2;
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
            if (view == this.f15471b2 && this.X1 != null) {
                view.setTranslationY(((this.X1.getY() + this.X1.getAnimatedTop()) + (-fk0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f15506n3) {
                    view.setTranslationY((this.K0.getY() + (y2Var.getY() + (-(fk0Var2.getMeasuredHeight() - this.f15506n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    h3 h3Var = this.Y0;
                    if (view == h3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.f46673n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(h3Var.getX(), h3Var.getY());
                        view.draw(a2);
                        dVar.b();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.f15545y2).storiesEnabled()) {
            return;
        }
        File h = this.K1.h();
        if (h != null && h.exists()) {
            v2 v2Var = this.V2;
            if (v2Var != null) {
                v2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new v1(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f15532v1;
    }

    public long getCurrentPeer() {
        return this.f15540x1;
    }

    public int getListPosition() {
        return this.H1;
    }

    public Bitmap getPlayingBitmap() {
        h3 h3Var = this.Y0;
        Bitmap createBitmap = Bitmap.createBitmap(h3Var.getWidth(), h3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.F1;
    }

    public s6 getStoriesController() {
        return MessagesController.getInstance(this.f15545y2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.f15549z2, this.f15516r1.size()) + this.f15520s1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f15516r1;
    }

    public final void h1() {
        int i10;
        if (this.C1) {
            TextView textView = this.f15476d2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f15479e2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f15476d2;
        if (textView3 != null) {
            if (this.A1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f15479e2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f15479e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f15532v1;
        i9 i9Var = this.F0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f15520s1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((r6) arrayList2.get(i11)).f16167a;
                    if (((int) (j10 ^ (j10 >>> 32))) == i9Var.L0) {
                        this.F1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f15532v1.indexOf(Integer.valueOf(i9Var.L0));
            if (indexOf < 0 && !this.f15532v1.isEmpty()) {
                if (i9Var.L0 > ((Integer) this.f15532v1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.L0 < ((Integer) j7.l1.i(1, this.f15532v1)).intValue()) {
                    indexOf = this.f15532v1.size() - 1;
                }
            }
            this.F1 = i10 + indexOf;
        } else {
            int i12 = i9Var.f15744a1.get(this.f15540x1, -1);
            this.F1 = i12;
            if (i12 == -1 && !i9Var.J0 && (peerStories = this.f15513q1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f15516r1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f22629id > this.f15513q1.max_read_id) {
                        this.F1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.F1 == -1) {
            this.F1 = 0;
        }
    }

    public final void j1() {
        k6 k6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f15516r1;
        arrayList.clear();
        i9 i9Var = this.F0;
        if (i9Var.J0) {
            if (!i9Var.O0) {
                arrayList.add(i9Var.P0);
            }
        } else {
            ArrayList arrayList2 = this.f15532v1;
            int i10 = 0;
            ArrayList arrayList3 = this.f15520s1;
            if (arrayList2 != null && (k6Var = i9Var.K0) != null) {
                if (k6Var instanceof c6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.f15545y2).getStoriesController().E(this.f15540x1);
                    String str = ((c6) i9Var.K0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            r6 r6Var = (r6) E.get(i11);
                            nh.o7 o7Var = r6Var.f16169c;
                            if (o7Var != null && !o7Var.f18270g && TextUtils.equals(o7Var.K0, str)) {
                                arrayList3.add(r6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f15532v1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f9 = i9Var.K0.f(((Integer) obj).intValue());
                    if (f9 != null && (storyItem = f9.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.K0 != null) {
                while (i10 < i9Var.K0.f15838i.size()) {
                    arrayList.add(((MessageObject) i9Var.K0.f15838i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.f15540x1) {
                    this.f15513q1 = i9Var.M0;
                } else {
                    TL_stories.PeerStories y8 = this.O1.y(this.f15540x1);
                    this.f15513q1 = y8;
                    if (y8 == null) {
                        this.f15513q1 = this.O1.z(this.f15540x1);
                    }
                }
                this.f15549z2 = 0;
                TL_stories.PeerStories peerStories2 = this.f15513q1;
                if (peerStories2 != null) {
                    this.f15549z2 = peerStories2.stories.size();
                    arrayList.addAll(this.f15513q1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.O1.E(this.f15540x1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.f15536w1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        d4 currentPeerView;
        s50 s50Var = this.F2;
        if (s50Var != null) {
            s50Var.T = null;
            s50Var.d(false);
        }
        long j10 = this.f15540x1;
        TL_stories.StoryItem storyItem = this.K1.f15374a;
        i9 i9Var = this.F0;
        i9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            i9.A1.remove(j10 + (j10 >> 16) + (storyItem.f22629id << 16));
        }
        this.f15480e3 = true;
        y8 y8Var = i9Var.f15765j0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            mc I = new tc(this.Y0, this.f15539x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new v1(this, 2));
            I.f30660r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.f15545y2).ensureMessagesLoaded(this.f15540x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        int i11;
        float f9;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        b4 b4Var = this.K1;
        TL_stories.StoryItem storyItem = b4Var.f15374a;
        if (storyItem == null) {
            storyItem = b4Var.f15376c;
        }
        boolean z13 = this.f15548z1;
        if (z13 || this.f15544y1) {
            if (storyItem != null) {
                i9 i9Var = this.F0;
                y2 y2Var = this.f15547z0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.n6 n6Var = this.N0;
                    if (n6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.R0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6Var.q(num, z12, true);
                        this.R0 = true;
                    } else {
                        this.R0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.n6 n6Var2 = this.M0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.Q0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n6Var2.q(num2, z11, true);
                        this.Q0 = true;
                    } else {
                        this.Q0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.d6 d6Var = this.O0;
                        if (this.Q0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        d6Var.d(f10, true);
                        org.telegram.ui.Components.d6 d6Var2 = this.P0;
                        if (d6Var2 != null) {
                            if (this.R0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            d6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-this.f15540x1));
                    if ((!this.A1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f15537w2;
                        if (i9Var.K0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.f15537w2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new iq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.f15537w2.setText(spannableStringBuilder);
                    } else {
                        this.f15537w2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = y2Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.Q0) {
                        f9 = this.M0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f9 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f9);
                    ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + y2Var.getLayoutParams().width;
                    y2 y2Var2 = this.L0;
                    if (y2Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = y2Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.R0) {
                            f12 = this.N0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += y2Var2.getLayoutParams().width;
                        y2Var2.requestLayout();
                    }
                    this.S1.requestLayout();
                    y2Var.requestLayout();
                    this.f15541x2.setVisibility(8);
                    this.B2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = b4Var.f15374a;
                    e3 e3Var = this.f15481f1;
                    if (storyItem2 == null) {
                        e3Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < e3Var.getChildCount(); i14++) {
                        if (e3Var.getChildAt(i14) instanceof p8) {
                            ((p8) e3Var.getChildAt(i14)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.f15545y2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.f15541x2.b(i15, userOrChat, this.f15545y2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.f15541x2.b(i17, null, this.f15545y2);
                    }
                    this.f15541x2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        iq iqVar = new iq(R.drawable.mini_views_likes, 0);
                        iqVar.setOverrideColor(-53704);
                        iqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(iqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        iq iqVar2 = new iq(R.drawable.mini_repost_story, 0);
                        iqVar2.setOverrideColor(-14161823);
                        iqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(iqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f15537w2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f15541x2.setVisibility(8);
                        this.f15537w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.f15541x2.setVisibility(0);
                        this.f15537w2.setTranslationX(AndroidUtilities.dp(10.0f) + com.google.android.recaptcha.internal.a.f(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                } else {
                    TextView textView2 = this.f15537w2;
                    if (i9Var.K0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.f15537w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.f15541x2.setVisibility(8);
                    this.B2.setVisibility(8);
                }
                y2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.K0.requestLayout();
                return;
            }
            this.f15537w2.setText("");
            this.B2.setVisibility(8);
            this.f15541x2.setVisibility(8);
        }
    }

    public final void l0() {
        x6 x6Var = this.A0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new k2(0, x6Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        x6 x6Var2 = new x6(getContext(), this.f15524t1);
        this.A0 = x6Var2;
        x6Var2.setPadding(dp, dp, dp, dp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f15547z0.addView(this.A0, i7.f6.e(40, 40, 3));
        this.f15503m3 = false;
    }

    public final void l1() {
        float f9;
        float f10;
        float f11;
        float f12;
        boolean z10;
        n2 n2Var;
        float heightWithTopView;
        float f13;
        float f14;
        float f15;
        float dp;
        int i10;
        float f16;
        float f17;
        y2 y2Var;
        ImageView imageView;
        l3 l3Var;
        y2 y2Var2;
        boolean z11;
        float f18;
        fk0 fk0Var;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22 = ((z8) this.M1).d.R;
        if (this.H2) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.K2;
        d6Var.d(f9, false);
        int i12 = this.f15511p2;
        if (i12 != 0 && this.f15514q2) {
            f10 = i7.w.a(this.D2 / i12, 0.0f, 1.0f);
        } else if (this.f15517r2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var2 = this.S3;
        float f23 = d6Var2.f27666c;
        org.telegram.ui.Components.d6 d6Var3 = this.T3;
        float f24 = d6Var3.f27666c;
        org.telegram.ui.Components.d6 d6Var4 = this.U3;
        float f25 = d6Var4.f27666c;
        if (this.C2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        d6Var2.d(f11, false);
        if (!this.f15480e3) {
            n2 n2Var2 = this.X1;
            if (n2Var2 != null && !TextUtils.isEmpty(n2Var2.getFieldText())) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            d6Var3.d(f21, false);
        }
        n2 n2Var3 = this.X1;
        if (n2Var3 != null && n2Var3.f26201u3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        d6Var4.d(f12, false);
        final n2 n2Var4 = this.X1;
        if (n2Var4 != null) {
            d4 d4Var = n2Var4.f15971n5;
            int backgroundTop = n2Var4.getBackgroundTop();
            int i13 = n2Var4.f15968k5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (n2Var4.O1 + i13) - backgroundTop;
                n2Var4.setAnimatedTop(i14);
                d4Var.R2 = true;
                ValueAnimator valueAnimator = d4Var.a2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    d4Var.a2.cancel();
                }
                View view = n2Var4.B1;
                if (view != null && view.getVisibility() == 0) {
                    n2Var4.B1.setTranslationY(((1.0f - n2Var4.getTopViewEnterProgress()) * n2Var4.B1.getLayoutParams().height) + n2Var4.O1);
                }
                d4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                d4Var.a2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                n2 n2Var5 = n2Var4;
                                n2Var5.getClass();
                                n2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                d4 d4Var2 = n2Var5.f15971n5;
                                d4Var2.R2 = true;
                                d4Var2.invalidate();
                                n2Var5.invalidate();
                                return;
                            default:
                                n2Var4.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                d4Var.a2.addListener(new ag.m0(n2Var4, 18));
                d4Var.a2.setDuration(250L);
                d4Var.a2.setInterpolator(uh.m.V);
                d4Var.a2.start();
                n2Var4.f15968k5 = 0;
            }
            if (n2Var4.f26140i3) {
                float scrollY = (n2Var4.f15970m5 - n2Var4.A0.getScrollY()) + (n2Var4.f15969l5 - n2Var4.A0.getMeasuredHeight());
                jf jfVar = n2Var4.A0;
                jfVar.setOffsetY(jfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(n2Var4.A0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                n2 n2Var5 = n2Var4;
                                n2Var5.getClass();
                                n2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                d4 d4Var2 = n2Var5.f15971n5;
                                d4Var2.R2 = true;
                                d4Var2.invalidate();
                                n2Var5.invalidate();
                                return;
                            default:
                                n2Var4.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = n2Var4.f15967j5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                n2Var4.f15967j5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(uh.m.V);
                ofFloat2.start();
                n2Var4.f26140i3 = false;
                d4Var.l1();
            }
            n2Var4.getMeasuredHeight();
        }
        n2 n2Var5 = this.X1;
        if (n2Var5 != null && n2Var5.t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f15525t2;
        Paint paint = this.f15494j2;
        if (z12) {
            paint.setColor(i0.a.d(this.f15502m2, -14933463, org.telegram.ui.ActionBar.g6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.Z3) * org.telegram.messenger.x3.y(1.0f, this.f15505n2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.Z3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.R2;
        i9 i9Var = this.F0;
        if (z13 || this.V3 != i9Var.Z || d6Var.f27666c != this.M2 || this.f15508o2 != this.D2 || f10 != this.f15502m2 || f22 != this.f15505n2 || f23 != d6Var2.f27666c || z10 || f25 != d6Var4.f27666c || f24 != d6Var3.f27666c) {
            this.R2 = false;
            this.f15508o2 = this.D2;
            float f26 = d6Var.f27666c;
            float f27 = this.M2;
            h3 h3Var = this.Y0;
            if (f26 != f27) {
                h3Var.invalidate();
            }
            if (f22 != 0.0f) {
                h3Var.setLayerType(2, null);
            } else {
                h3Var.setLayerType(0, null);
            }
            this.M2 = d6Var.f27666c;
            this.f15505n2 = f22;
            this.f15502m2 = f10;
            this.V3 = i9Var.Z;
            float height = this.D2 - (getHeight() - h3Var.getBottom());
            if (this.X1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = n2Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f15497k2 - (getHeight() - h3Var.getBottom());
            n2 n2Var6 = this.X1;
            if (n2Var6 == null) {
                f14 = 0.0f;
            } else {
                float heightWithTopView2 = n2Var6.getHeightWithTopView();
                if (this.f15517r2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                f14 = heightWithTopView2 * f13;
            }
            float max2 = Math.max(0.0f, height2 + f14);
            n2 n2Var7 = this.X1;
            if (n2Var7 != null) {
                if (this.Z1 != null) {
                    ImageView suggestButton = n2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.Z1.n(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.Z1.setTranslationY(-((getHeight() - this.X1.getY()) + AndroidUtilities.dp(6.0f)));
                }
                st editField = this.X1.getEditField();
                qo0 senderSelectView = this.X1.getSenderSelectView();
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
            if (this.f15525t2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f15525t2 && !this.f15517r2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f15) * f10) + max3;
            f2 f2Var = this.H0;
            jh.e1 e1Var = f2Var.f16279c;
            f2Var.G = dp2;
            if (Math.abs(f2Var.H - max4) > 0.1f) {
                f2Var.H = max4;
                f17 = 0.8f;
                f16 = 8.0f;
                e1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - e1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!e1Var.canScrollVertically(1)) {
                    f2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f16 = 8.0f;
                f17 = 0.8f;
            }
            f2Var.setTranslationY(-f2Var.G);
            f2Var.invalidate();
            nh.y3 y3Var = i9Var.f15795z0;
            if (y3Var != null) {
                y3Var.setKeyboardOffset(max);
            }
            fk0 fk0Var2 = this.f15471b2;
            b4 b4Var = this.K1;
            if (fk0Var2 != null) {
                if (this.f15502m2 > 0.0f && (b4Var == null || !b4Var.f15378f)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                fk0Var2.setVisibility(i11);
            }
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                y2Var = this.L0;
                imageView = this.J0;
                l3Var = this.G0;
                y2Var2 = this.f15547z0;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && childAt != this.S1 && childAt.getTag(R.id.parent_tag) == null && childAt != l3Var.S.o(getContext())) {
                    n2 n2Var8 = this.X1;
                    if (n2Var8 != null && childAt == n2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.X1.getEmojiView().getMeasuredHeight() - this.D2);
                    } else if (childAt instanceof g40) {
                        g40 g40Var = (g40) childAt;
                        View view2 = g40Var.f28748e;
                        if (view2 != null) {
                            g40Var.g(view2);
                        }
                    } else if (childAt != this.F2 && childAt != h3Var && childAt != imageView && childAt != this.K0 && childAt != y2Var && childAt != this.S2 && childAt != this.Z1 && childAt != y2Var2 && ((fk0Var = this.f15506n3) == null || fk0Var.getReactionsWindow() == null || childAt != this.f15506n3.getReactionsWindow().f13683c)) {
                        float f28 = this.f15502m2;
                        f28 = (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.G2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.D2) - (AndroidUtilities.dp(f16) * f29)) - (AndroidUtilities.dp(20.0f) * i9Var.Z);
                        if (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) {
                            dp3 += this.D2;
                        }
                        if (this.f15525t2) {
                            f19 = (1.0f - this.f15505n2) * hideInterfaceAlpha;
                        } else {
                            f19 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.X2) {
                            dp3 = i9Var.Z * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.Z2) {
                            dp3 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                            f19 = this.f15502m2;
                            childAt.invalidate();
                        }
                        if (childAt == this.Y1) {
                            dp3 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                            f19 *= this.f15502m2;
                        }
                        if (childAt == this.f15471b2) {
                            float f30 = (1.0f - d6Var3.f27666c) * (1.0f - f25) * (1.0f - d6Var2.f27666c) * this.f15502m2;
                            float f31 = f19 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f15471b2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            n2 n2Var9 = this.X1;
                            if (n2Var9 == null || childAt != n2Var9.J1) {
                                childAt.setAlpha(f19);
                            }
                        }
                    }
                } else if (childAt == this.S1) {
                    if (this.f15525t2) {
                        childAt.setAlpha((1.0f - this.Z3) * (1.0f - this.f15505n2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.Z3) * hideInterfaceAlpha);
                    }
                    i15++;
                }
                i15++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f22) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.Z3) * f34);
            y2Var2.setAlpha((1.0f - this.Z3) * f34);
            if (y2Var != null) {
                y2Var.setAlpha((1.0f - this.Z3) * f34);
            }
            for (int i16 = 0; i16 < h3Var.getChildCount(); i16++) {
                View childAt2 = h3Var.getChildAt(i16);
                if (childAt2 != null && childAt2 != this.I0) {
                    z3 z3Var = this.f15496k1;
                    bh.d dVar = this.f15527u0;
                    if (childAt2 != z3Var && childAt2 != this.f15519s0 && childAt2 != this.f15523t0 && childAt2 != dVar && childAt2 != this.S1 && childAt2 != l3Var && childAt2 != this.f15543y0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == dVar) {
                            f18 = this.f15469a3;
                        } else {
                            f18 = 1.0f;
                        }
                        if (childAt2 == l3Var) {
                            childAt2.setAlpha((1.0f - this.Z3) * f18 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.Z3) * f18 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.X1 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!b4Var.f15378f) {
                    if (this.O2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.P2 && this.f15548z1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (y2Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + y2Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    n1 n1Var = this.W1;
                    if (n1Var != null && n1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                n2 n2Var10 = this.X1;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f15502m2;
                if ((this.O2 || this.A1) && !b4Var.f15378f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2Var10.h1(f35, f36, f37, z11);
                if (this.X1.getEmojiView() != null) {
                    this.X1.getEmojiView().setAlpha(this.f15502m2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.Z3;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.Y3 = ofFloat;
        ofFloat.addUpdateListener(new w1(this, 2));
        this.Y3.addListener(new i2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(jr.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.f15545y2).isFrozen()) {
            org.telegram.ui.c.b(this.f15545y2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f15486g3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 0, this.f15539x0);
            c2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            c2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            l4.s0 s0Var = new l4.s0(runnable, 4);
            c2Var.f22790h0 = string;
            c2Var.f22791i0 = s0Var;
            String string2 = LocaleController.getString(R.string.Cancel);
            k3.d dVar = new k3.d(25);
            c2Var.f22792j0 = string2;
            c2Var.f22793k0 = dVar;
            c2Var.show();
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
        this.A2 = false;
        this.R2 = true;
        this.f15542x3 = false;
        this.f15548z1 = false;
        this.A1 = false;
        long j10 = this.f15540x1;
        z3 z3Var = this.f15496k1;
        org.telegram.ui.Components.e9 e9Var = this.f15493j1;
        if (j10 >= 0) {
            if (j10 == UserConfig.getInstance(this.f15545y2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f15544y1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.f15545y2).getUser(Long.valueOf(this.f15540x1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f15545y2).isUserContactBlocked(this.f15540x1);
            if (!UserConfig.getInstance(this.f15545y2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.B1 = z15;
            this.D1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            e9Var.m(this.f15545y2, user);
            z3Var.f16453a.getImageReceiver().setForUserOrChat(user, e9Var);
            W0(this.f15540x1, true, false);
        } else {
            this.f15544y1 = false;
            this.f15548z1 = true;
            if (this.O1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.f15542x3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-this.f15540x1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.A1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.f15545y2).getChatFull(-this.f15540x1) == null) {
                MessagesStorage.getInstance(this.f15545y2).loadChatInfo(-this.f15540x1, true, new CountDownLatch(1), false, false);
            }
            if (this.A1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B1 = z10;
            this.D1 = MessagesController.getInstance(this.f15545y2).getSendPaidMessagesStars(this.f15540x1);
            e9Var.k(this.f15545y2, chat);
            z3Var.f16453a.getImageReceiver().setForUserOrChat(chat, e9Var);
            W0(this.f15540x1, true, false);
        }
        if (this.G1 && (this.f15544y1 || this.f15548z1)) {
            s6 s6Var = this.O1;
            long j11 = this.f15540x1;
            a0.h hVar = s6Var.f16228m;
            r9 r9Var = (r9) hVar.f(j11);
            if (r9Var == null) {
                r9Var = new r9(s6Var.f16218a, j11, s6Var);
                hVar.k(r9Var, j11);
            }
            r9Var.b(true);
        }
        j1();
        this.F1 = i10;
        if (i10 < 0) {
            this.F1 = 0;
        }
        this.S0 = 0L;
        this.U0 = false;
        this.F3 = null;
        this.G3 = null;
        boolean z16 = this.f15548z1;
        h3 h3Var = this.Y0;
        i9 i9Var = this.F0;
        int i13 = 8;
        b4 b4Var = this.K1;
        if (z16) {
            B0();
            if (this.X1 == null && (this.A1 || b4Var.f15378f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.f15545y2).getChat(Long.valueOf(-this.f15540x1));
                n2 n2Var = this.X1;
                if (b4Var.f15378f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i13 = 0;
                }
                n2Var.setVisibility(i13);
                n2 n2Var2 = this.X1;
                boolean z17 = b4Var.f15378f;
                D0(true);
                n2Var2.i1(z17);
                n2 n2Var3 = this.X1;
                if (b4Var.f15378f && !D0(true) && (this.f15517r2 || this.X1.S0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2Var3.o1(z13, true);
                st editField = this.X1.getEditField();
                long j12 = this.f15540x1;
                TL_stories.StoryItem storyItem = b4Var.f15374a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.X1.b1(this.f15545y2, this.f15540x1);
                this.X1.K1(chat2, null);
            }
            org.telegram.ui.Components.n6 n6Var = this.M0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f15539x0;
            if (n6Var == null) {
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.M0 = n6Var2;
                y2 y2Var = this.f15547z0;
                n6Var2.setCallback(y2Var);
                this.M0.r(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.d6(y2Var);
            }
            y2 y2Var2 = this.L0;
            if (y2Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.N0 = n6Var3;
                n6Var3.setCallback(y2Var2);
                this.N0.r(c6Var.C0(org.telegram.ui.ActionBar.g6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.d6(y2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.f15536w1 = getStoriesCount();
            h3Var.invalidate();
            invalidate();
        } else if (this.f15544y1) {
            B0();
            if (b4Var.f15378f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                n2 n2Var4 = this.X1;
                if (n2Var4 != null) {
                    n2Var4.setVisibility(8);
                }
            }
            n2 n2Var5 = this.X1;
            if (n2Var5 != null) {
                boolean z18 = b4Var.f15378f;
                D0(true);
                n2Var5.i1(z18);
                n2 n2Var6 = this.X1;
                if (b4Var.f15378f && !D0(true) && (this.f15517r2 || this.X1.S0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2Var6.o1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f15532v1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.L0));
                    if (indexOf < 0 && !this.f15532v1.isEmpty()) {
                        if (i9Var.L0 > ((Integer) this.f15532v1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.L0 < ((Integer) j7.l1.i(1, this.f15532v1)).intValue()) {
                            indexOf = this.f15532v1.size() - 1;
                        }
                    }
                    this.F1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f15520s1.isEmpty();
                    ArrayList arrayList2 = this.f15516r1;
                    if (!isEmpty) {
                        this.F1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f22629id > this.O1.f16222f.get(this.f15540x1)) {
                                this.F1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            h3Var.invalidate();
            invalidate();
        } else {
            if (this.X1 == null) {
                v0();
            }
            if (this.B1 && this.f15474c2 == null) {
                z0();
            }
            if (this.f15474c2 != null) {
                if (this.B1 || this.C1) {
                    h1();
                }
                LinearLayout linearLayout = this.f15474c2;
                if ((this.B1 && !b4Var.f15378f) || this.C1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            g8 g8Var = this.f15482f2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            n2 n2Var7 = this.X1;
            if (n2Var7 != null) {
                if (!I0() && !UserObject.isService(this.f15540x1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                n2Var7.setVisibility(i11);
                n2 n2Var8 = this.X1;
                boolean z19 = b4Var.f15378f;
                D0(true);
                n2Var8.i1(z19);
                n2 n2Var9 = this.X1;
                if (b4Var.f15378f && !D0(true) && (this.f15517r2 || this.X1.S0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2Var9.o1(z11, true);
                st editField2 = this.X1.getEditField();
                long j13 = this.f15540x1;
                TL_stories.StoryItem storyItem2 = b4Var.f15374a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.X1.b1(this.f15545y2, this.f15540x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.f15545y2).getUserFull(this.f15540x1);
                if (userFull != null) {
                    this.X1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.f15545y2).loadFullUser(MessagesController.getInstance(this.f15545y2).getUser(Long.valueOf(this.f15540x1)), this.f15533v2, false);
                }
            }
            this.f15536w1 = getStoriesCount();
            y2 y2Var3 = this.S1;
            if (y2Var3 != null) {
                y2Var3.setVisibility(8);
            }
            h3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.f15468a1.onAttachedToWindow();
        this.f15473c1.onAttachedToWindow();
        this.f15470b1.onAttachedToWindow();
        this.f15489h3.onAttachedToWindow();
        this.f15495j3.onAttachedToWindow();
        n2 n2Var = this.X1;
        if (n2Var != null) {
            n2Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15475d1;
            if (i10 < arrayList.size()) {
                ((kg.h0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f15545y2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.f15468a1.onDetachedFromWindow();
        this.f15473c1.onDetachedFromWindow();
        this.f15470b1.onDetachedFromWindow();
        this.f15489h3.onDetachedFromWindow();
        this.f15495j3.onDetachedFromWindow();
        n2 n2Var = this.X1;
        if (n2Var != null) {
            n2Var.D0();
        }
        org.telegram.ui.Components.p5 p5Var = this.f15498k3;
        if (p5Var != null) {
            p5Var.o(this);
            this.f15498k3 = null;
        }
        kg.d dVar = this.f15492i3;
        if (dVar != null) {
            dVar.d(this);
            this.f15492i3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15475d1;
            if (i10 < arrayList.size()) {
                ((kg.h0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f15545y2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f15524t1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: lh.d4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f15502m2 = -1.0f;
        this.R2 = true;
        invalidate();
    }

    public final void p0() {
        l3 l3Var = this.G0;
        if (l3Var.S.y()) {
            l3Var.S.f(false);
        }
    }

    public final void q0() {
        if (this.G1) {
            ((z8) this.M1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.X1 != null && this.f15472b3 && this.W0) {
            v1 v1Var = this.L3;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.O1.B;
            this.X1.J(true);
            boolean z11 = this.B1;
            b4 b4Var = this.K1;
            if ((z11 && !b4Var.f15378f) || this.C1) {
                this.f15486g3 = false;
                this.X1.setEnabled(false);
                this.X1.j1(" ", z10);
            } else if (this.D1 > 0) {
                this.f15486g3 = false;
                this.X1.setEnabled(true);
                this.X1.j1(ia.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
            } else {
                if (!b4Var.f15378f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f15545y2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f15486g3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.f15545y2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.X1.setEnabled(true);
                        if (((int) this.X1.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.X1.getEditField().getMeasuredWidth()) {
                            n2 n2Var = this.X1;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            n2Var.f26111e = formatString2;
                            n2Var.f26118f = format;
                            n2Var.G1(z10);
                        } else {
                            this.X1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(v1Var, 1000L);
                        return;
                    }
                }
                this.f15486g3 = false;
                this.X1.setEnabled(true);
                if (b4Var.f15378f) {
                    long starsPrice = this.X1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.X1.j1(ia.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.X1.J4), z10);
                        iq iqVar = this.X1.J4[0];
                        if (iqVar != null) {
                            iqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.X1.j1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                n2 n2Var2 = this.X1;
                if (this.A1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                n2Var2.j1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f15509o3) {
            if (this.f15506n3.getReactionsWindow() != null) {
                if (this.f15529u2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f15506n3.getReactionsWindow().f13683c);
                    return true;
                }
                this.f15506n3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        e3 e3Var = this.f15481f1;
        if (e3Var != null) {
            nh.t3 t3Var = e3Var.f15935c;
            if (t3Var != null) {
                t3Var.e(true);
                e3Var.f15935c = null;
            }
            e3Var.f15934b = null;
            e3Var.invalidate();
            e3Var.b(false);
        }
        l3 l3Var = this.G0;
        if (l3Var.S.y()) {
            l3Var.S.f(false);
            return true;
        }
        nh.t3 t3Var2 = this.B0;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        nh.t3 t3Var3 = this.C0;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
        g40 g40Var = this.S2;
        if (g40Var != null) {
            g40Var.b(true);
        }
        w3 w3Var = this.f15510p1;
        if (w3Var != null && w3Var.f32371b) {
            w3Var.a();
            return true;
        }
        n2 n2Var = this.X1;
        if (n2Var != null && n2Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f15539x0);
            if (this.X1.Y0) {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new s1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((z8) this.M1).h(alertDialog$Builder.f22714a);
            return true;
        }
        fk0 fk0Var = this.f15471b2;
        if (fk0Var != null && fk0Var.getReactionsWindow() != null && !this.f15471b2.getReactionsWindow().f13695q) {
            this.f15471b2.getReactionsWindow().d();
            return true;
        }
        n2 n2Var2 = this.X1;
        if (n2Var2 != null && n2Var2.t0()) {
            if (this.f15529u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.n0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            n2 n2Var3 = this.X1;
            if (n2Var3 != null) {
                long j10 = this.f15540x1;
                TL_stories.StoryItem storyItem = this.K1.f15374a;
                Editable editText = n2Var3.getEditText();
                this.F0.getClass();
                i9.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.X1);
            return true;
        } else if (l3Var.getVisibility() != 0 || l3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            l3Var.C();
            this.c3 = false;
            this.Y0.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.f15545y2 = i10;
        this.O1 = MessagesController.getInstance(i10).storiesController;
        this.f15484g1.f42226b = i10;
        fk0 fk0Var = this.f15471b2;
        if (fk0Var != null) {
            fk0Var.setCurrentAccount(i10);
            this.f15471b2.p(null, null, true);
        }
        fk0 fk0Var2 = this.f15506n3;
        if (fk0Var2 != null) {
            fk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(x3 x3Var) {
        this.M1 = x3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f15472b3 != z10) {
            this.f15472b3 = z10;
            if (z10) {
                this.f15468a1.setCurrentAlpha(1.0f);
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

    public void setOffset(float f9) {
        boolean z10;
        if (f9 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X0 != z10) {
            this.X0 = z10;
            this.Y0.invalidate();
            if (this.G1 && this.F0.f15742a && Build.VERSION.SDK_INT < 33) {
                ag.q1 q1Var = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(q1Var);
                    AndroidUtilities.runOnUIThread(q1Var, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(q1Var);
                i9 i9Var = ((z8) this.M1).d;
                i9Var.f15762h1 = true;
                i9Var.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            x2 x2Var = this.f15468a1;
            if (z10) {
                x2Var.stopAnimation();
                x2Var.setAllowStartAnimation(false);
            } else {
                x2Var.startAnimation();
                x2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            s2 s2Var = new s2(this, getContext(), this.f15539x0);
            this.E2 = s2Var;
            s2Var.V1 = new t2(this);
            s2Var.f31005f0.f0();
            s2 s2Var2 = this.E2;
            s2Var2.S = true;
            s2Var2.r1();
            s2 s2Var3 = this.E2;
            s2Var3.T = new u2(this);
            s2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.E3);
            this.T1 = aVar;
            aVar.setOnClickListener(new x1(this, 1));
            addView(this.T1, i7.f6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.f15539x0;
        n2 n2Var = new n2(this, AndroidUtilities.findActivity(getContext()), this, new l2(1, c6Var));
        this.X1 = n2Var;
        n2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new o2(this));
        setDelegate(this.X1);
        n2 n2Var2 = this.X1;
        n2Var2.f26197t4 = false;
        n2Var2.f26202u4 = true;
        if (this.K1.f15378f) {
            n2Var2.V0(false, false, false);
        } else {
            n2Var2.V0(true, true, false);
        }
        this.X1.e();
        n2 n2Var3 = this.X1;
        n2Var3.f26207v4 = true;
        addView(n2Var3, i7.f6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.P1(false);
        }
        this.X1.B2 = this.f15533v2;
        c4 c4Var = this.I2;
        c4Var.f15431g.add(this.Y0);
        c4Var.f15431g.add(this);
        if (this.W0) {
            this.X1.E0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        ug.g gVar = new ug.g(getContext(), c6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new s1(this, 1));
        addView(this.Y1, i7.f6.e(57, 300, 85));
        this.Y1.setVisibility(8);
        this.X1.setSideButtonsForAttach(this.Y1);
        this.E0 = getChildCount();
    }

    public final void w0() {
        if (this.f15482f2 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.f15539x0);
        this.f15482f2 = g8Var;
        g8Var.setOnClickListener(new x1(this, 4));
        this.f15482f2.setAlpha(0.0f);
        this.f15482f2.setVisibility(8);
        addView(this.f15482f2, i7.f6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z10;
        if (this.W1 == null && getContext() != null) {
            n1 n1Var = new n1(getContext(), this.E3);
            this.W1 = n1Var;
            n1Var.setOnClickListener(new x1(this, 5));
            n1 n1Var2 = this.W1;
            d1 d1Var = d1.S;
            boolean z11 = true;
            if (d1Var != null && d1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            n1Var2.b(z10, false);
            n1 n1Var3 = this.W1;
            d1 d1Var2 = d1.S;
            if (d1Var2 != null && !d1Var2.m()) {
                z11 = false;
            }
            n1Var3.a(z11, false);
            addView(this.W1, i7.f6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.V1 == null && getContext() != null) {
            this.U1 = new q1(getContext(), this.f15545y2);
            r1 r1Var = new r1(getContext(), this.U1, this.E3);
            this.V1 = r1Var;
            r1Var.setOnClickListener(new x1(this, 6));
            this.V1.setOnLongClickListener(new u1(this, 1));
            addView(this.V1, i7.f6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.U1, i7.f6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i10;
        if (this.f15474c2 != null) {
            return;
        }
        if (this.X1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f15474c2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f15476d2 = textView;
        textView.setTextColor(-8026747);
        this.f15476d2.setTextSize(1, 16.0f);
        TextView textView2 = this.f15476d2;
        if (this.A1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f15479e2 = textView3;
        textView3.setTextColor(-1);
        this.f15479e2.setTextSize(1, 12.0f);
        TextView textView4 = this.f15479e2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f15479e2.setGravity(17);
        i7.h6.a(this.f15479e2);
        this.f15479e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f15479e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f15474c2.addView(imageView, i7.f6.t(22, 22, 16, 12, 1, 4, 0));
        this.f15474c2.addView(this.f15476d2, i7.f6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f15474c2.addView(this.f15479e2, i7.f6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.f15474c2, i7.f6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
