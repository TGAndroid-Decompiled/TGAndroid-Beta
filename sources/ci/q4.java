package ci;

import ai.ld;
import ai.ud;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.me;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pr;
import org.telegram.ui.qy;
import org.telegram.ui.sn;
import org.telegram.ui.xu0;
public abstract class q4 extends jw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.d6 B0;
    public long B1;
    public v B2;
    public boolean B3;
    public final f9 C0;
    public boolean C1;
    public int C2;
    public pr C3;
    public final h3 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public n7 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public ei.x3 F0;
    public boolean F1;
    public i3 F2;
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
    public b3 I2;
    public final eh.b I3;
    public final aa J0;
    public int J1;
    public m60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final v3 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final n2 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final p4 M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final o4 O1;
    public final org.telegram.ui.Components.f6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final h3 P0;
    public final com.google.firebase.messaging.l P1;
    public final org.telegram.ui.Components.f6 P2;
    public final d2 P3;
    public org.telegram.ui.Components.p6 Q0;
    public j4 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.p6 R0;
    public boolean R1;
    public long R2;
    public final d2 R3;
    public org.telegram.ui.Components.f6 S0;
    public i7 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.f6 T0;
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
    public h3 W1;
    public r40 W2;
    public final org.telegram.ui.Components.f6 W3;
    public long X0;
    public a X1;
    public final xu0 X2;
    public final org.telegram.ui.Components.f6 X3;
    public boolean Y0;
    public x1 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.f6 Y3;
    public boolean Z0;
    public y1 Z1;
    public e3 Z2;
    public float Z3;
    public boolean f5764a1;
    public u1 a2;
    public FrameLayout f5765a3;
    public final Path f5766a4;
    public boolean f5767b1;
    public v2 f5768b2;
    public ud f5769b3;
    public boolean f5770b4;
    public final r3 f5771c1;
    public kh.h f5772c2;
    public boolean f5773c3;
    public ValueAnimator f5774c4;
    public final FrameLayout f5775d1;
    public ei.x3 f5776d2;
    public x2 f5777d3;
    public float f5778d4;
    public final g3 f5779e1;
    public ValueAnimator f5780e2;
    public float f5781e3;
    public final ImageReceiver f5782f1;
    public cl0 f5783f2;
    public boolean f5784f3;
    public final ImageReceiver f5785g1;
    public LinearLayout f5786g2;
    public boolean f5787g3;
    public final ArrayList f5788h1;
    public TextView f5789h2;
    public boolean f5790h3;
    public Runnable f5791i1;
    public TextView f5792i2;
    public boolean f5793i3;
    public final n3 f5794j1;
    public y8 f5795j2;
    public boolean f5796j3;
    public final qy f5797k1;
    public ViewPropertyAnimator f5798k2;
    public boolean f5799k3;
    public w4 l1;
    public final dh.d f5800l2;
    public final ImageReceiver f5801l3;
    public float f5802m1;
    public final dh.d f5803m2;
    public ah.e f5804m3;
    public final org.telegram.ui.Components.h9 f5805n1;
    public final Paint f5806n2;
    public final ImageReceiver f5807n3;
    public final m4 f5808o1;
    public int f5809o2;
    public org.telegram.ui.Components.r5 f5810o3;
    public final z8 f5811p1;
    public ValueAnimator f5812p2;
    public boolean f5813p3;
    public j6.l f5814q1;
    public float f5815q2;
    public boolean f5816q3;
    public int f5817r1;
    public float f5818r2;
    public cl0 f5819r3;
    public org.telegram.ui.ActionBar.e1 f5820s1;
    public float f5821s2;
    public boolean f5822s3;
    public h4 f5823t1;
    public int f5824t2;
    public float f5825t3;
    public TL_stories.PeerStories f5826u1;
    public boolean f5827u2;
    public boolean f5828u3;
    public final ArrayList f5829v1;
    public boolean f5830v2;
    public float f5831v3;
    public final ImageView f5832w0;
    public final ArrayList f5833w1;
    public boolean f5834w2;
    public int f5835w3;
    public final ImageView f5836x0;
    public final n4 f5837x1;
    public boolean f5838x2;
    public int f5839x3;
    public final i4 f5840y0;
    public final t4 f5841y1;
    public int f5842y2;
    public int y3;
    public final xj0 f5843z0;
    public ArrayList f5844z1;
    public final int f5845z2;
    public d2 f5846z3;

    public q4(Context context, final aa aaVar, n4 n4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.f5767b1 = true;
        this.f5788h1 = new ArrayList();
        this.f5817r1 = -5;
        this.I1 = 1.0f;
        o4 o4Var = new o4(this);
        this.O1 = o4Var;
        this.f5815q2 = -1.0f;
        this.f5818r2 = -1.0f;
        this.f5821s2 = -1.0f;
        this.f5845z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.f6(this);
        this.P2 = new org.telegram.ui.Components.f6(this);
        xu0 xu0Var = new xu0();
        this.X2 = xu0Var;
        this.f5781e3 = 1.0f;
        this.P3 = new d2(this, 4);
        this.R3 = new d2(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new androidx.activity.i(this, 9);
        this.W3 = new org.telegram.ui.Components.f6(this);
        this.X3 = new org.telegram.ui.Components.f6(this);
        this.Y3 = new org.telegram.ui.Components.f6(this);
        this.f5766a4 = new Path();
        xu0Var.E = new ya.c(this, 9);
        ?? obj = new Object();
        obj.f5731g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f5829v1 = new ArrayList();
        this.f5833w1 = new ArrayList();
        g3 g3Var = new g3(this, 0);
        this.f5779e1 = g3Var;
        g3Var.setCrossfadeWithOldImage(false);
        g3Var.setAllowLoadingOnAttachedOnly(true);
        g3Var.ignoreNotifications = true;
        g3Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5801l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5807n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f5782f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f5785g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        g3Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f5805n1 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.J0 = aaVar;
        this.f5837x1 = n4Var;
        this.P1 = n4Var.f5636g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        n4Var.f5640l.setColor(-16777216);
        this.f5806n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = d6Var;
        setClipChildren(false);
        n3 n3Var = new n3(this, context, this.f5771c1, d6Var, aaVar);
        this.f5794j1 = n3Var;
        eh.b bVar = new eh.b(d6Var, org.telegram.ui.ActionBar.h6.Sd, 0.8f);
        this.I3 = bVar;
        gh.c cVar = new gh.c();
        cVar.a(i0.b.f(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            gh.d dVar = new gh.d(cVar);
            this.H3 = dVar;
            dVar.h(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        ih.j jVar = new ih.j(this);
        bh.b bVar2 = new bh.b(this.G3);
        bVar2.f4361f = jVar;
        bVar2.f4362g = this;
        this.F3 = bVar2;
        this.f5800l2 = bVar2.c(this, bVar, false);
        dh.d c10 = bVar2.c(this, bVar, false);
        this.f5803m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        r3 r3Var = new r3(this, context, n4Var, aaVar);
        this.f5771c1 = r3Var;
        r3Var.setClipChildren(false);
        this.f5797k1 = new qy(this.C2, r3Var);
        r3Var.addView(n3Var, w7.z5.d(-1.0f, -1));
        v3 v3Var = new v3(this, getContext(), aaVar.f5230y, aaVar, d6Var);
        this.K0 = v3Var;
        v3Var.f5979b0.setOnClickListener(new f2(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(n4Var.f5641m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new f2(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(n4Var.f5642n);
        imageView2.setPadding(dp, dp, dp, dp);
        h3 h3Var = new h3(this, getContext(), 1);
        this.P0 = h3Var;
        org.telegram.ui.Components.p6 p6Var = this.R0;
        if (p6Var != null) {
            p6Var.setCallback(h3Var);
        }
        h3Var.setWillNotDraw(false);
        h3Var.setOnClickListener(new f2(this, 12));
        h3 h3Var2 = new h3(this, getContext(), 2);
        this.D0 = h3Var2;
        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
        if (p6Var2 != null) {
            p6Var2.setCallback(h3Var2);
        }
        h3Var2.setWillNotDraw(false);
        h3Var2.setOnClickListener(new f2(this, 13));
        h3Var2.setOnLongClickListener(new m2(0, this, aaVar));
        n7 n7Var = new n7(context, n4Var);
        this.E0 = n7Var;
        n7Var.setPadding(dp, dp, dp, dp);
        h3Var2.addView(this.E0, w7.z5.e(40, 40, 3));
        h3Var.addView(imageView2, w7.z5.e(40, 40, 3));
        w7.b6.b(h3Var2, 0.3f, 5.0f);
        w7.b6.b(h3Var, 0.3f, 5.0f);
        g3Var.setAllowLoadingOnAttachedOnly(true);
        g3Var.setParentView(r3Var);
        t4 t4Var = new t4(10);
        this.f5841y1 = t4Var;
        r3Var.setOutlineProvider(t4Var);
        r3Var.setClipToOutline(true);
        addView(r3Var);
        m4 m4Var = new m4(context, o4Var);
        this.f5808o1 = m4Var;
        m4Var.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f5138b;

            {
                this.f5138b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q4 q4Var = this.f5138b;
                        long j10 = UserConfig.getInstance(q4Var.C2).clientUserId;
                        long j11 = q4Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        aa aaVar2 = aaVar;
                        if (i11 == 0) {
                            Bundle j12 = org.telegram.ui.Cells.t0.j(1, "type");
                            j12.putLong("dialog_id", q4Var.B1);
                            aaVar2.H(new wa0(j12, null));
                            return;
                        } else if (j11 > 0) {
                            aaVar2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            aaVar2.H(sn.W9(j11));
                            return;
                        }
                    default:
                        q4 q4Var2 = this.f5138b;
                        if (q4Var2.O1.j()) {
                            aaVar.O();
                            if (!aa.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4 i4Var = q4Var2.f5840y0;
                            if (!aa.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i4Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q4Var2.c1(true);
                        return;
                }
            }
        });
        r3Var.addView(m4Var, w7.z5.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5775d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.z5.q(40, 40, 5));
        linearLayout.addView(h3Var, w7.z5.q(40, 40, 5));
        linearLayout.addView(h3Var2, w7.z5.q(40, 40, 5));
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        ImageView imageView3 = new ImageView(context);
        this.f5832w0 = imageView3;
        imageView3.setImageDrawable(n4Var.f5645q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        r3Var.addView(imageView3, w7.z5.a(40.0f, 2.0f, 15.0f, 2.0f, 0.0f, 40, 53));
        ImageView imageView4 = new ImageView(context);
        this.f5836x0 = imageView4;
        imageView4.setImageDrawable(n4Var.f5646r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        r3Var.addView(imageView4, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        imageView4.setOnClickListener(new ah.g0(aaVar, 13));
        imageView3.setOnClickListener(new e0(this, d6Var, aaVar, context, n4Var, 1));
        i4 i4Var = new i4(context, 0);
        this.f5840y0 = i4Var;
        r3Var.addView(i4Var, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        ?? imageView5 = new ImageView(context);
        this.f5843z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        i4Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(n4Var.f5648t);
        i4Var.addView(imageView6);
        imageView6.setVisibility(8);
        f9 f9Var = new f9(context);
        this.C0 = f9Var;
        f9Var.setOnClickListener(new f2(this, 2));
        r3Var.addView(f9Var, w7.z5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 60, 53));
        i4Var.setOnClickListener(new View.OnClickListener(this) {
            public final q4 f5138b;

            {
                this.f5138b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        q4 q4Var = this.f5138b;
                        long j10 = UserConfig.getInstance(q4Var.C2).clientUserId;
                        long j11 = q4Var.B1;
                        int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        aa aaVar2 = aaVar;
                        if (i11 == 0) {
                            Bundle j12 = org.telegram.ui.Cells.t0.j(1, "type");
                            j12.putLong("dialog_id", q4Var.B1);
                            aaVar2.H(new wa0(j12, null));
                            return;
                        } else if (j11 > 0) {
                            aaVar2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            aaVar2.H(sn.W9(j11));
                            return;
                        }
                    default:
                        q4 q4Var2 = this.f5138b;
                        if (q4Var2.O1.j()) {
                            aaVar.O();
                            if (!aa.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            i4 i4Var2 = q4Var2.f5840y0;
                            if (!aa.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            i4Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        q4Var2.c1(true);
                        return;
                }
            }
        });
        this.f5811p1 = new z8(this, n4Var);
        r3Var.addView(v3Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        n2 n2Var = new n2(this, context, aaVar, aaVar.v, view, frameLayout, aaVar);
        this.L0 = n2Var;
        r3Var.addView(view, w7.z5.e(-1, 200, 87));
        r3Var.addView(n2Var, w7.z5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        r3Var.addView(frameLayout, w7.z5.a(100.0f, 0.0f, 55.0f, 0.0f, 0.0f, -1, 0));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o10 = i0.b.o(-1, 100);
        i4Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o10, o10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int o11 = i0.b.o(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, o11, o11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int o12 = i0.b.o(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp4, dp4, dp4, dp4, 0, o12, o12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int o13 = i0.b.o(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp5, dp5, dp5, dp5, 0, o13, o13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int o14 = i0.b.o(-1, 100);
        h3Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp6, dp6, dp6, dp6, 0, o14, o14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int o15 = i0.b.o(-1, 100);
        h3Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp7, dp7, dp7, dp7, 0, o15, o15));
        org.telegram.ui.Cells.x9 x9Var = v3Var.W;
        View n10 = x9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        x9Var.D = new o2(this, 0);
        x9Var.S(this);
    }

    public static void V0(h7 h7Var, ImageReceiver imageReceiver, String str) {
        if (h7Var.f5474s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(h7Var.f5471f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(h7Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(q4 q4Var, ValueAnimator valueAnimator) {
        float f7;
        f9 f9Var = q4Var.C0;
        q4Var.f5778d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m4 m4Var = q4Var.f5808o1;
        m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.f5778d4);
        m4Var.setAlpha(1.0f - q4Var.f5778d4);
        ImageView imageView = q4Var.f5832w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.f5778d4);
        imageView.setAlpha(1.0f - q4Var.f5778d4);
        ImageView imageView2 = q4Var.f5836x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.f5778d4);
        imageView2.setAlpha(1.0f - q4Var.f5778d4);
        i4 i4Var = q4Var.f5840y0;
        i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.f5778d4);
        i4Var.setAlpha((1.0f - q4Var.f5778d4) * q4Var.f5781e3);
        h3 h3Var = q4Var.W1;
        if (h3Var != null) {
            h3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var.f5778d4);
            q4Var.W1.setAlpha(1.0f - q4Var.f5778d4);
        }
        if (f9Var != null) {
            f9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var.f5778d4);
            f9Var.setAlpha(1.0f - q4Var.f5778d4);
        }
        q4Var.K0.setAlpha(1.0f - q4Var.f5778d4);
        j4 j4Var = q4Var.Q1;
        if (j4Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((r9) j4Var).d.V;
        }
        float hideInterfaceAlpha = q4Var.getHideInterfaceAlpha();
        h3 h3Var2 = q4Var.D0;
        if (h3Var2 != null) {
            h3Var2.setAlpha((1.0f - q4Var.f5778d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = q4Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - q4Var.f5778d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        h3 h3Var3 = q4Var.P0;
        if (h3Var3 != null) {
            h3Var3.setAlpha((1.0f - q4Var.f5778d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        v2 v2Var = q4Var.f5768b2;
        if (v2Var != null) {
            v2Var.setAlpha(1.0f - q4Var.f5778d4);
            q4Var.invalidate();
        }
        q4Var.f5771c1.invalidate();
    }

    public static void a0(q4 q4Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = q4Var.D3;
        if (e1Var != null && q4Var.C3 != null && e1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(aa.B1 - 0.2f) < 0.05f) {
                    q4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(aa.B1 - 0.5f) < 0.05f) {
                    q4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(aa.B1 - 1.0f) < 0.05f) {
                    q4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(aa.B1 - 1.5f) < 0.05f) {
                    q4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(aa.B1 - 2.0f) < 0.05f) {
                    q4Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var2 = q4Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    e1Var2.setSubtext(LocaleController.formatString(i10, ed.a(aa.B1) + "x"));
                }
            }
            q4Var.C3.a(aa.B1, z10);
        }
    }

    public static void b0(q4 q4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!q4Var.I0() && !q4Var.O1.f5693f) {
            if (UserConfig.getInstance(q4Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.B0).setOnClickListener(new f2(q4Var, 8));
                return;
            }
            Drawable drawable = q4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            p2 p2Var = new p2(q4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, q4Var.B0);
            c10.setOnClickListener(new f2(q4Var, 9));
            c10.setIcon(p2Var);
        }
    }

    public static void d0(q4 q4Var) {
        o4 o4Var = q4Var.O1;
        TL_stories.StoryItem storyItem = o4Var.f5690a;
        if ((storyItem == null && o4Var.f5691b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = o4Var.h();
        boolean z10 = o4Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), q4Var.getContext(), z10 ? 1 : 0, null, null, new ai.x8(1, q4Var, z10));
            return;
        }
        q4Var.a1();
    }

    public static void e0(q4 q4Var, long j10) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(q4Var.C2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new ai.m(q4Var, MessagesController.getInstance(q4Var.C2), j10, !z10, str, user), 200L);
    }

    public static void f0(q4 q4Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getContext(), 0, q4Var.B0);
        if (q4Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f20601a.R = LocaleController.getString(i10);
        if (q4Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f20601a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new z1(q4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i1(5));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        ((r9) q4Var.Q1).h(b2Var);
        b2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f26093c;
        c6 c6Var = this.J0.f5225w;
        if (c6Var == null) {
            f7 = 0.0f;
        } else {
            f7 = c6Var.f5282f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        aa aaVar;
        if (!this.O1.f5693f || (aaVar = this.J0) == null || aaVar.A0 == null || D0(true)) {
            return 0L;
        }
        return aaVar.A0.j();
    }

    public static void h0(q4 q4Var) {
        String str;
        qc J;
        org.telegram.ui.ActionBar.d6 d6Var = q4Var.B0;
        r3 r3Var = q4Var.f5771c1;
        if (q4Var.G1) {
            return;
        }
        if (q4Var.E1) {
            if (q4Var.J3 != null && q4Var.K3 != null) {
                sg.j0.D1(new ai.z4(q4Var, 1), q4Var.J3, q4Var.K3, q4Var.B1, true);
                return;
            }
            aa aaVar = q4Var.J0;
            if (aaVar != null) {
                aaVar.f5201k1 = true;
                aaVar.P();
            }
            MessagesController.getInstance(q4Var.C2).getBoostsController().getBoostsStats(q4Var.B1, new g2(q4Var, 0));
            return;
        }
        v2 v2Var = q4Var.f5768b2;
        int i10 = -q4Var.f5817r1;
        q4Var.f5817r1 = i10;
        AndroidUtilities.shakeViewSpring(v2Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (q4Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(q4Var.C2).premiumFeaturesBlocked()) {
            J = new xc(r3Var, d6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new xc(r3Var, d6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new d2(q4Var, 5));
        }
        J.j();
    }

    public static void j0(q4 q4Var) {
        o4 o4Var = q4Var.O1;
        if (o4Var.f5690a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f20511id = o4Var.f5690a.f20506id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(q4Var.C2).getInputPeer(q4Var.B1);
        ConnectionsManager.getInstance(q4Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f5769b3 != null) {
            return;
        }
        ud udVar = new ud(getContext(), 1);
        this.f5769b3 = udVar;
        udVar.setTextSize(1, 14.0f);
        this.f5769b3.setTextColor(i0.b.f(0.5f, -16777216, -1));
        this.f5769b3.setGravity(19);
        this.f5769b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f5769b3, w7.z5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 3));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        h3 h3Var = new h3(this, getContext(), 0);
        this.W1 = h3Var;
        h3Var.setClickable(true);
        addView(this.W1, w7.z5.a(48.0f, 0.0f, 0.0f, 136.0f, 0.0f, -1, 48));
        i3 i3Var = new i3(this, getContext());
        this.F2 = i3Var;
        i3Var.setOnClickListener(new f2(this, 0));
        this.W1.addView(this.F2, w7.z5.a(32.0f, 9.0f, 11.0f, 0.0f, 0.0f, -1, 0));
        v vVar = new v(0, getContext(), false);
        this.B2 = vVar;
        vVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.z5.a(28.0f, 13.0f, 13.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.z5.a(-2.0f, 0.0f, 16.0f, 0.0f, 9.0f, -2, 0));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f5837x1.f5647s);
        i3 i3Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int o10 = i0.b.o(-1, 120);
        i3Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, o10, o10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.N(i0.b.o(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f5765a3 != null) {
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
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        TextView textView2 = new TextView(getContext());
        w7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.h6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, o10, o10));
        textView2.setOnClickListener(new f2(this, 3));
        linearLayout.addView(textView, w7.z5.n(-1, -2));
        linearLayout.addView(textView2, w7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.z5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -1, 17));
        this.f5771c1.addView(frameLayout);
        this.f5765a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        h1 h1Var;
        TLRPC.Peer i10;
        h1 h1Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        int i11 = (this.B1 > 0L ? 1 : (this.B1 == 0L ? 0 : -1));
        aa aaVar = this.J0;
        if (i11 < 0 && (h1Var2 = aaVar.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = h1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (aaVar.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && aaVar != null && (h1Var = aaVar.A0) != null && h1Var.l()) {
            if (!z10 || (i10 = aaVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        p4 p4Var = this.M2;
        org.telegram.ui.o4 o4Var = (org.telegram.ui.o4) p4Var.e;
        if (o4Var != null && ((SurfaceView) p4Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) p4Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (o4Var != null && (textureView = (TextureView) p4Var.f5730f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            r3 r3Var = this.f5771c1;
            canvas.scale(i10 / r3Var.getMeasuredWidth(), i11 / r3Var.getMeasuredHeight());
            this.f5779e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(ei.p9 p9Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        j4 j4Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        ei.r9 r9Var = new ei.r9(context, i10, this.B0);
        r9Var.r1(p9Var);
        ei.h1 h1Var = r9Var.f9746b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof ei.k9) {
                    ((ei.k9) view).e(false);
                }
            }
        }
        r9Var.l1(true);
        r9Var.T = new ah.h0(4, this, storyItem);
        ((r9) j4Var).h(r9Var);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        r3 r3Var = this.f5771c1;
        float x11 = view.getX() + r3Var.getX() + x10;
        float y3 = view.getY() + r3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        a7 a7Var;
        aa aaVar = this.J0;
        if (aaVar != null && (a7Var = aaVar.O0) != null && a7Var.e == 4) {
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

    public final void L0(ah.i1 i1Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        o4 o4Var = this.O1;
        TL_stories.StoryItem storyItem = o4Var.f5690a;
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
            l0();
            this.S1.g0(this.B1, o4Var.f5690a, null);
        } else if (i1Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f5813p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ah.d1.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f5801l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f5816q3 = true;
                this.S1.g0(this.B1, o4Var.f5690a, ah.i1.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, o4Var.f5690a, i1Var);
        }
        TL_stories.StoryItem storyItem2 = o4Var.f5690a;
        h3 h3Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(ah.i1.d(reaction));
            h3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            h3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = o4Var.f5690a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = o4Var.f5690a.views;
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
        TL_stories.StoryItem storyItem4 = o4Var.f5690a;
        ah.l1.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        h1 h1Var;
        boolean z10;
        if (this.O3 == null) {
            aa aaVar = this.J0;
            if (aaVar != null && (h1Var = aaVar.A0) != null) {
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
            v2 v2Var = this.f5768b2;
            if (v2Var != null && sendAsPeers != null) {
                v2Var.O1(true);
            }
        }
    }

    public final boolean N0() {
        v2 v2Var = this.f5768b2;
        if (v2Var == null) {
            return false;
        }
        boolean z10 = v2Var.f24050z2;
        if (z10) {
            v2Var.q1();
        }
        AndroidUtilities.runOnUIThread(new d2(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        g2 g2Var;
        int i10;
        long j11;
        long j12;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f5768b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j13 = this.L3;
        g2 g2Var2 = new g2(this, 1);
        b bVar = new b();
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.d6) bVar, false);
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
            j10 = j13;
            g2Var = g2Var2;
            i10 = ((org.telegram.ui.Components.a6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.a6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j13;
            g2Var = g2Var2;
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
        final long[] jArr = {max};
        final yq[] yqVarArr = new yq[1];
        final ei.d dVar = new ei.d(context, null, true);
        final ?? obj = new Object();
        obj.f6068c = clientUserId;
        obj.f6069f = textWithEntities;
        obj.f6070g = jArr[0];
        final q0 q0Var = new q0(i12, context, true);
        LinearLayout e = wh.e(context, 0);
        final ah.x xVar = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        e.addView(xVar, w7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ah.x xVar2 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        e.addView(xVar2, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ah.x xVar3 = new ah.x(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        e.addView(xVar3, w7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final t tVar = new t(context, bVar, r6);
        final boolean[] zArr = {true};
        g2 g2Var3 = g2Var;
        long j14 = j12;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(ld.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), yqVarArr), true, true);
                long j15 = jArr2[0];
                v0 v0Var = obj;
                v0Var.f6070g = j15;
                q0Var.set(v0Var);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = u.b(i16, intValue2, 0);
                int b11 = u.b(i16, num.intValue(), 1);
                int b12 = u.b(i16, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.q6) xVar.f901b).c(formatString, true, true);
                ((org.telegram.ui.Components.q6) xVar2.f901b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.q6) xVar3.f901b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = u.b(i16, num.intValue(), 3);
                int b14 = u.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                tVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
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
        if (arrayList.isEmpty() || ((Integer) i0.a.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        tVar.f1459e0 = iArr4;
        tVar.setValue((int) jArr[0]);
        linearLayout.addView(tVar, w7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e, w7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.h6.f21092j5;
        TextView b10 = w7.d6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        wh.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(q0Var, w7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        f3Var.show();
        dVar.setOnClickListener(new ai.v0(g2Var3, jArr, f3Var, 3));
    }

    public final void P0() {
        if (this.f5768b2 == null) {
            return;
        }
        t0();
        this.I2.f30586j0.f0();
        this.I2.N1(-1, true);
        b3 b3Var = this.I2;
        b3Var.Z = this.B1;
        b3Var.t1();
        this.I2.o1().setText(this.f5768b2.getFieldText());
        ((r9) this.Q1).h(this.I2);
    }

    public final void Q0() {
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

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.S0(android.net.Uri):void");
    }

    public final void T0(long j10, boolean z10) {
        int i10;
        int i11;
        o4 o4Var;
        if (this.K1 != z10) {
            this.K1 = z10;
            xj0 xj0Var = this.f5843z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f5176a && Build.VERSION.SDK_INT < 33) {
                    aa aaVar = ((r9) this.Q1).d;
                    aaVar.l1 = true;
                    aaVar.P();
                    androidx.activity.i iVar = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 100L);
                }
                R0(j10);
                g1();
                xj0Var.setAnimation(this.f5837x1.f5649u);
                this.K1 = true;
                this.f5808o1.f5610a.getImageReceiver().setVisible(true, true);
                if (this.O1.f5690a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + o4Var.f5690a.f20506id + " " + o4.c(o4Var));
                }
            } else {
                p0();
                xj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f5771c1.invalidate();
                invalidate();
                q0();
                aa aaVar2 = ((r9) this.Q1).d;
                aaVar2.I0 = false;
                aaVar2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f5779e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f5782f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f5785g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                i7 i7Var = this.S1;
                long j11 = this.B1;
                boolean z11 = this.K1;
                a0.h hVar = i7Var.f5502m;
                ja jaVar = (ja) hVar.f(j11);
                if (jaVar == null) {
                    jaVar = new ja(i7Var.f5493a, j11, i7Var);
                    hVar.k(jaVar, j11);
                }
                jaVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.B1 != j10) {
            o4 o4Var = this.O1;
            o4Var.f5691b = null;
            o4Var.f5690a = null;
        }
        this.B1 = j10;
        this.f5844z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        i7 i7Var = this.S1;
        TL_stories.PeerStories y3 = i7Var.y(j10);
        if (y3 == null) {
            y3 = i7Var.z(j10);
        } else {
            z10 = false;
        }
        i7Var.S(y3, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        String str;
        if (!z10 && j10 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j10;
        this.N3 = z11;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m4 m4Var = this.f5808o1;
        if (i10 >= 0) {
            if (this.C1 && !z11) {
                m4Var.f5611b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                m4Var.f5611b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                zq zqVar = new zq(mutate, null);
                zqVar.f32999w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                zqVar.h = dp;
                zqVar.f32996n = dp2;
                m4Var.f5611b.i(zqVar);
            } else {
                m4Var.f5611b.i(null);
            }
            if (user != null) {
                m4Var.f5611b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), m4Var.f5611b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            m4Var.f5611b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j10));
        l4 l4Var = m4Var.f5611b;
        l4 l4Var2 = m4Var.f5611b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        l4Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            zq zqVar2 = new zq(mutate2, null);
            zqVar2.f32999w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            zqVar2.h = dp3;
            zqVar2.f32996n = dp4;
            l4Var2.i(zqVar2);
            return;
        }
        l4Var2.i(null);
    }

    public final void X0(float f7, float f10, w4 w4Var) {
        this.f5802m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != w4Var) {
            this.l1 = w4Var;
            if (w4Var != null) {
                ImageReceiver imageReceiver = w4Var.f6113a;
                if (imageReceiver.getBitmap() != null) {
                    this.f5779e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        o4 o4Var = this.O1;
        if (o4Var.f5690a != null) {
            aa aaVar = this.J0;
            if (aaVar.f5189f != null) {
                String e = o4Var.e();
                if (z10) {
                    t2 t2Var = new t2(2, this.B0);
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
                    e3 e3Var = new e3(this, aaVar.f5189f.getContext(), e, e, z11, t2Var);
                    this.Z2 = e3Var;
                    e3Var.f25663i0 = true;
                    TL_stories.StoryItem storyItem = o4Var.f5690a;
                    storyItem.dialogId = this.B1;
                    e3Var.F0 = storyItem;
                    e3Var.f25675s0 = new a6.i(this, 11);
                    ((r9) this.Q1).h(e3Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.H1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        r3 r3Var = this.f5771c1;
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        wh.q(R.string.UnsupportedAttachment, new xc(r3Var, d6Var), d6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.T = string;
        ((r9) this.Q1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.f5822s3 != z10) {
            o4 o4Var = this.O1;
            if (o4Var.f5690a != null) {
                this.f5822s3 = z10;
                if (z10) {
                    this.f5819r3.setVisibility(0);
                }
                this.f5819r3.setStoryItem(o4Var.f5690a);
                aa aaVar = ((r9) this.Q1).d;
                aaVar.f5210p1 = z10;
                aaVar.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f5825t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f5819r3.setTransitionProgress(this.f5825t3);
                    ofFloat.addUpdateListener(new e2(this, 1));
                    ofFloat.addListener(new q2(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(bs.f25031g);
                    ofFloat.start();
                    return;
                }
                if (this.f5819r3.getReactionsWindow() != null) {
                    this.f5819r3.getReactionsWindow().e();
                }
                this.f5819r3.animate().alpha(0.0f).setDuration(150L).setListener(new r2(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            ei.x3 x3Var = new ei.x3(getContext(), 1);
            x3Var.l(1.0f, -56.0f);
            this.G0 = x3Var;
            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f5771c1.addView(this.G0, w7.z5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
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
        h1 h1Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        aa aaVar = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || aaVar.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f5979b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                c7 o10 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o10 != null && o10.a(this.C2, 1) && this.Q1 != null) {
                    ai.z4 z4Var = new ai.z4(this, 1);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.H1;
                    }
                    ((r9) this.Q1).h(new sg.j0(o10.b(), this.C2, findActivity, z4Var, null));
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
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f20273id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (aaVar != null && (h1Var = aaVar.A0) != null && h1Var.g() == longValue) {
                    f1(false);
                    v2 v2Var = this.f5768b2;
                    if (v2Var != null) {
                        v2Var.I(true);
                        this.f5768b2.O1(true);
                        r0(true);
                    }
                    n2 n2Var = this.L0;
                    if (n2Var != null) {
                        h1 h1Var2 = n2Var.P;
                        if (h1Var2 != null) {
                            j10 = h1Var2.j();
                        }
                        if (n2Var.H != j10) {
                            n2Var.e.N(true);
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
        j4 j4Var = this.Q1;
        if (j4Var == null || !((r9) j4Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((r9) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f5829v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f5833w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = aaVar.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j11 = this.B1;
                if (j11 != 0) {
                    i7 i7Var = this.S1;
                    TL_stories.PeerStories y3 = i7Var.y(j11);
                    if (y3 == null) {
                        y3 = i7Var.z(j11);
                        z11 = true;
                    }
                    i7Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f5820s1;
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
        ke keVar;
        Canvas canvas2;
        org.telegram.ui.Components.p6 p6Var;
        org.telegram.ui.Components.p6 p6Var2;
        l1();
        if (this.D1 && (p6Var2 = this.Q0) != null) {
            p6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (p6Var = this.R0) != null) {
            p6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f5828u3;
        LinearLayout linearLayout = this.O0;
        h3 h3Var = this.D0;
        if (z10) {
            float measuredWidth = (h3Var.getMeasuredWidth() / 2.0f) + h3Var.getX() + linearLayout.getX();
            float measuredHeight = (h3Var.getMeasuredHeight() / 2.0f) + h3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f5835w3, measuredWidth - f7, bs.f25031g.getInterpolation(this.f5831v3));
            float lerp2 = AndroidUtilities.lerp(this.f5839x3, measuredHeight - f7, this.f5831v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f5831v3);
            if (this.f5813p3) {
                org.telegram.ui.Components.r5 r5Var = this.f5810o3;
                if (r5Var != null) {
                    float f10 = lerp3;
                    r5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f5810o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f5807n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f5816q3) {
            float measuredWidth2 = (h3Var.getMeasuredWidth() / 2.0f) + h3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (h3Var.getMeasuredHeight() / 2.0f) + h3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f5813p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f5801l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f5816q3 = false;
                }
            } else {
                ah.e eVar = this.f5804m3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f5804m3.b(canvas);
                    if (this.f5804m3.c()) {
                        this.f5804m3.d(this);
                        this.f5804m3 = null;
                        this.f5816q3 = false;
                    }
                } else {
                    this.f5816q3 = false;
                }
            }
        }
        v2 v2Var = this.f5768b2;
        if (v2Var != null) {
            me meVar = v2Var.f24045y1;
            ke keVar2 = v2Var.f24049z1;
            if (v2Var.getAlpha() != 0.0f && (keVar = v2Var.f23932e1) != null && keVar.getParent() != null && v2Var.f23932e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(v2Var.f23932e1.getX() + meVar.getX() + keVar2.getX() + v2Var.getX(), v2Var.f23932e1.getY() + meVar.getY() + keVar2.getY() + v2Var.getY());
                if (v2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight(), (int) (v2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                v2Var.f23932e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        cl0 cl0Var;
        cl0 cl0Var2;
        gh.d dVar;
        float dp;
        float f7;
        if (view == this.f5777d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f5777d3.getY(), getMeasuredWidth(), this.f5777d3.getY() + this.f5777d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        v2 v2Var = this.f5768b2;
        Paint paint = this.f5806n2;
        h3 h3Var = this.D0;
        n4 n4Var = this.f5837x1;
        if (view == v2Var) {
            float f10 = this.f5815q2;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            o4 o4Var = this.O1;
            if (i10 > 0 && !o4Var.f5693f) {
                n4Var.f5640l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), n4Var.f5640l);
            }
            RectF rectF = n4Var.h;
            RectF rectF2 = n4Var.f5637i;
            RectF rectF3 = n4Var.f5638j;
            rectF.set(this.f5768b2.getX(), this.f5768b2.getY() + this.f5768b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f5768b2.getX() + this.f5768b2.getMeasuredWidth(), this.f5768b2.getY() + this.f5768b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!o4Var.f5693f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (h3Var != null && h3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + h3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                u1 u1Var = this.a2;
                if (u1Var != null && u1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f5768b2.getY() + this.f5768b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f5768b2.getY() + this.f5768b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f5768b2.setTranslationX((1.0f - this.f5815q2) * dp);
            if (this.f5768b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f5815q2) * (this.f5768b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f5768b2.getEditField().setTranslationY(com.google.android.gms.internal.cast.a6.x(1.0f, this.f5815q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, n4Var.h, this.f5815q2, rectF3);
            dh.d dVar2 = this.f5800l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f5778d4) * (1.0f - this.f5818r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f5815q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (v2Var != null && v2Var.s0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = n4Var.f5639k;
            RectF rectF5 = n4Var.f5639k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f5766a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            dh.d dVar3 = this.f5803m2;
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
            if (view == this.f5783f2 && this.f5768b2 != null) {
                view.setTranslationY(((this.f5768b2.getY() + this.f5768b2.getAnimatedTop()) + (-cl0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f5819r3) {
                    view.setTranslationY((this.O0.getY() + (h3Var.getY() + (-(cl0Var2.getMeasuredHeight() - this.f5819r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    r3 r3Var = this.f5771c1;
                    if (view == r3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f11061n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.b.f(0.2f, -16777216, -1));
                        a2.translate(r3Var.getX(), r3Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            e3 e3Var = this.Z2;
            if (e3Var != null) {
                e3Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new d2(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f5844z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        r3 r3Var = this.f5771c1;
        Bitmap createBitmap = Bitmap.createBitmap(r3Var.getWidth(), r3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public i7 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f5829v1.size()) + this.f5833w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f5829v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f5789h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f5792i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f5789h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f5792i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f5792i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f5844z1;
        aa aaVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f5833w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((h7) arrayList2.get(i11)).f5468a;
                    if (((int) (j10 ^ (j10 >>> 32))) == aaVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f5844z1.indexOf(Integer.valueOf(aaVar.P0));
            if (indexOf < 0 && !this.f5844z1.isEmpty()) {
                if (aaVar.P0 > ((Integer) this.f5844z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (aaVar.P0 < ((Integer) i0.a.h(1, this.f5844z1)).intValue()) {
                    indexOf = this.f5844z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = aaVar.f5188e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !aaVar.N0 && (peerStories = this.f5826u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f5829v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f20506id > this.f5826u1.max_read_id) {
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
        a7 a7Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f5829v1;
        arrayList.clear();
        aa aaVar = this.J0;
        if (aaVar.N0) {
            if (!aaVar.S0) {
                arrayList.add(aaVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.f5844z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f5833w1;
            if (arrayList2 != null && (a7Var = aaVar.O0) != null) {
                if (a7Var instanceof t6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((t6) aaVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            h7 h7Var = (h7) E.get(i11);
                            ei.a8 a8Var = h7Var.f5470c;
                            if (a8Var != null && !a8Var.f8711g && TextUtils.equals(a8Var.K0, str)) {
                                arrayList3.add(h7Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f5844z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = aaVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (aaVar.O0 != null) {
                while (i10 < aaVar.O0.f5151i.size()) {
                    arrayList.add(((MessageObject) aaVar.O0.f5151i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = aaVar.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f5826u1 = aaVar.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f5826u1 = y3;
                    if (y3 == null) {
                        this.f5826u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f5826u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f5826u1.stories);
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
        q4 currentPeerView;
        m60 m60Var = this.J2;
        if (m60Var != null) {
            m60Var.f28421f0 = null;
            m60Var.a(false);
        }
        long j10 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f5690a;
        aa aaVar = this.J0;
        aaVar.getClass();
        if (j10 != 0 && storyItem != null) {
            aa.E1.remove(j10 + (j10 >> 16) + (storyItem.f20506id << 16));
        }
        this.f5793i3 = true;
        q9 q9Var = aaVar.f5205n0;
        if (q9Var != null && (currentPeerView = q9Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            qc I = new xc(this.f5771c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new d2(this, 2));
            I.f29647r = false;
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
        o4 o4Var = this.O1;
        TL_stories.StoryItem storyItem = o4Var.f5690a;
        if (storyItem == null) {
            storyItem = o4Var.f5692c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                aa aaVar = this.J0;
                h3 h3Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.p6 p6Var = this.R0;
                    if (p6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p6Var.t(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.p6 p6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        p6Var2.t(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.f6 f6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        f6Var.d(f10, true);
                        org.telegram.ui.Components.f6 f6Var2 = this.T0;
                        if (f6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            f6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (aaVar.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new yq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = h3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + h3Var.getLayoutParams().width;
                    h3 h3Var2 = this.P0;
                    if (h3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = h3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += h3Var2.getLayoutParams().width;
                        h3Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    h3Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = o4Var.f5690a;
                    n3 n3Var = this.f5794j1;
                    if (storyItem2 == null) {
                        n3Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < n3Var.getChildCount(); i14++) {
                        if (n3Var.getChildAt(i14) instanceof h9) {
                            ((h9) n3Var.getChildAt(i14)).c(storyItem2.views, z10);
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
                        yq yqVar = new yq(R.drawable.mini_views_likes, 0);
                        yqVar.setOverrideColor(-53704);
                        yqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(yqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        yq yqVar2 = new yq(R.drawable.mini_repost_story, 0);
                        yqVar2.setOverrideColor(-14161823);
                        yqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(yqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + i0.a.g(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (aaVar.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                h3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        n7 n7Var = this.E0;
        n7Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new s2(0, n7Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        n7 n7Var2 = new n7(getContext(), this.f5837x1);
        this.E0 = n7Var2;
        n7Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.z5.e(40, 40, 3));
        this.f5816q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        v2 v2Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i10;
        float f17;
        float f18;
        int i11;
        h3 h3Var;
        ImageView imageView;
        v3 v3Var;
        h3 h3Var2;
        boolean z11;
        float f19;
        cl0 cl0Var;
        float f20;
        int i12;
        float f21;
        float f22;
        float f23 = ((r9) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.f6 f6Var = this.O2;
        f6Var.d(f7, false);
        int i13 = this.f5824t2;
        if (i13 != 0 && this.f5827u2) {
            f10 = w7.r.a(this.H2 / i13, 0.0f, 1.0f);
        } else if (this.f5830v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.f6 f6Var2 = this.W3;
        float f24 = f6Var2.f26093c;
        org.telegram.ui.Components.f6 f6Var3 = this.X3;
        float f25 = f6Var3.f26093c;
        org.telegram.ui.Components.f6 f6Var4 = this.Y3;
        float f26 = f6Var4.f26093c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        f6Var2.d(f11, false);
        if (!this.f5793i3) {
            v2 v2Var2 = this.f5768b2;
            if (v2Var2 != null && !TextUtils.isEmpty(v2Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            f6Var3.d(f22, false);
        }
        v2 v2Var3 = this.f5768b2;
        if (v2Var3 != null && v2Var3.f24051z3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        f6Var4.d(f12, false);
        final v2 v2Var4 = this.f5768b2;
        if (v2Var4 != null) {
            q4 q4Var = v2Var4.f6076s5;
            f13 = 1.0f;
            int backgroundTop = v2Var4.getBackgroundTop();
            int i14 = v2Var4.p5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (v2Var4.T1 + i14) - backgroundTop;
                v2Var4.setAnimatedTop(i15);
                q4Var.V2 = true;
                ValueAnimator valueAnimator = q4Var.f5780e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    q4Var.f5780e2.cancel();
                }
                View view = v2Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    v2Var4.G1.setTranslationY(((1.0f - v2Var4.getTopViewEnterProgress()) * v2Var4.G1.getLayoutParams().height) + v2Var4.T1);
                }
                q4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                q4Var.f5780e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                v2 v2Var5 = v2Var4;
                                v2Var5.getClass();
                                v2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q4 q4Var2 = v2Var5.f6076s5;
                                q4Var2.V2 = true;
                                q4Var2.invalidate();
                                v2Var5.invalidate();
                                return;
                            default:
                                v2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                q4Var.f5780e2.addListener(new ah.b(v2Var4, 9));
                q4Var.f5780e2.setDuration(250L);
                q4Var.f5780e2.setInterpolator(li.m.V);
                q4Var.f5780e2.start();
                v2Var4.p5 = 0;
            }
            if (v2Var4.f23987n3) {
                float scrollY = (v2Var4.f6075r5 - v2Var4.E0.getScrollY()) + (v2Var4.f6074q5 - v2Var4.E0.getMeasuredHeight());
                pf pfVar = v2Var4.E0;
                pfVar.setOffsetY(pfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(v2Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                v2 v2Var5 = v2Var4;
                                v2Var5.getClass();
                                v2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                q4 q4Var2 = v2Var5.f6076s5;
                                q4Var2.V2 = true;
                                q4Var2.invalidate();
                                v2Var5.invalidate();
                                return;
                            default:
                                v2Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = v2Var4.f6073o5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                v2Var4.f6073o5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(li.m.V);
                ofFloat2.start();
                v2Var4.f23987n3 = false;
                q4Var.l1();
            }
            v2Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        v2 v2Var5 = this.f5768b2;
        if (v2Var5 != null && v2Var5.r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f5838x2;
        Paint paint = this.f5806n2;
        if (z12) {
            paint.setColor(i0.b.f(this.f5815q2, -14933463, org.telegram.ui.ActionBar.h6.m1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.f5778d4) * org.telegram.messenger.q.z(f27, this.f5818r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.b.o(-16777216, (int) ((f13 - this.f5778d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        aa aaVar = this.J0;
        if (z13 || this.Z3 != aaVar.f5185d0 || f6Var.f26093c != this.Q2 || this.f5821s2 != this.H2 || f10 != this.f5815q2 || f23 != this.f5818r2 || f24 != f6Var2.f26093c || z10 || f26 != f6Var4.f26093c || f25 != f6Var3.f26093c) {
            this.V2 = false;
            this.f5821s2 = this.H2;
            int i16 = (f6Var.f26093c > this.Q2 ? 1 : (f6Var.f26093c == this.Q2 ? 0 : -1));
            r3 r3Var = this.f5771c1;
            if (i16 != 0) {
                r3Var.invalidate();
            }
            if (f23 != 0.0f) {
                r3Var.setLayerType(2, null);
            } else {
                r3Var.setLayerType(0, null);
            }
            this.Q2 = f6Var.f26093c;
            this.f5818r2 = f23;
            this.f5815q2 = f10;
            this.Z3 = aaVar.f5185d0;
            float height = this.H2 - (getHeight() - r3Var.getBottom());
            if (this.f5768b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = v2Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f5809o2 - (getHeight() - r3Var.getBottom());
            v2 v2Var6 = this.f5768b2;
            if (v2Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = v2Var6.getHeightWithTopView();
                if (this.f5830v2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            v2 v2Var7 = this.f5768b2;
            if (v2Var7 != null) {
                if (this.f5776d2 != null) {
                    ImageView suggestButton = v2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f5776d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f5776d2.setTranslationY(-((getHeight() - this.f5768b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                iu editField = this.f5768b2.getEditField();
                sp0 senderSelectView = this.f5768b2.getSenderSelectView();
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
            if (this.f5838x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f5838x2 && !this.f5830v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f10) + max3;
            n2 n2Var = this.L0;
            ai.u1 u1Var = n2Var.f6135c;
            n2Var.K = dp2;
            if (Math.abs(n2Var.L - max4) > 0.1f) {
                n2Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                u1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - u1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!u1Var.canScrollVertically(1)) {
                    n2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            n2Var.setTranslationY(-n2Var.K);
            n2Var.invalidate();
            ei.d4 d4Var = aaVar.D0;
            if (d4Var != null) {
                d4Var.setKeyboardOffset(max);
            }
            cl0 cl0Var2 = this.f5783f2;
            o4 o4Var = this.O1;
            if (cl0Var2 != null) {
                if (this.f5815q2 > 0.0f && (o4Var == null || !o4Var.f5693f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                cl0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                h3Var = this.P0;
                imageView = this.N0;
                v3Var = this.K0;
                h3Var2 = this.D0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != v3Var.W.n(getContext())) {
                    v2 v2Var8 = this.f5768b2;
                    if (v2Var8 != null && childAt == v2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f5768b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof r40) {
                        r40 r40Var = (r40) childAt;
                        View view2 = r40Var.e;
                        if (view2 != null) {
                            r40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != r3Var && childAt != imageView && childAt != this.O0 && childAt != h3Var && childAt != this.W2 && childAt != this.f5776d2 && childAt != h3Var2 && ((cl0Var = this.f5819r3) == null || cl0Var.getReactionsWindow() == null || childAt != this.f5819r3.getReactionsWindow().f872c)) {
                        float f28 = this.f5815q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f18) * f29)) - (AndroidUtilities.dp(20.0f) * aaVar.f5185d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f5838x2) {
                            f20 = (1.0f - this.f5818r2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f5769b3) {
                            dp3 = aaVar.f5185d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f5777d3) {
                            dp3 -= this.f5768b2.getMeasuredHeight() - this.f5768b2.getAnimatedTop();
                            f20 = this.f5815q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f5772c2) {
                            dp3 -= this.f5768b2.getMeasuredHeight() - this.f5768b2.getAnimatedTop();
                            f20 *= this.f5815q2;
                        }
                        if (childAt == this.f5783f2) {
                            float f30 = (1.0f - f6Var3.f26093c) * (1.0f - f26) * (1.0f - f6Var2.f26093c) * this.f5815q2;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f5783f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            v2 v2Var9 = this.f5768b2;
                            if (v2Var9 == null || childAt != v2Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f5838x2) {
                        childAt.setAlpha((1.0f - this.f5778d4) * (1.0f - this.f5818r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f5778d4) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f5778d4) * f34);
            h3Var2.setAlpha((1.0f - this.f5778d4) * f34);
            if (h3Var != null) {
                h3Var.setAlpha((1.0f - this.f5778d4) * f34);
            }
            for (int i18 = 0; i18 < r3Var.getChildCount(); i18++) {
                View childAt2 = r3Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.M0) {
                    m4 m4Var = this.f5808o1;
                    i4 i4Var = this.f5840y0;
                    if (childAt2 != m4Var && childAt2 != this.f5832w0 && childAt2 != this.f5836x0 && childAt2 != i4Var && childAt2 != this.W1 && childAt2 != v3Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == i4Var) {
                            f19 = this.f5781e3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == v3Var) {
                            childAt2.setAlpha((1.0f - this.f5778d4) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f5778d4) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f5768b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!o4Var.f5693f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (h3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + h3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    u1 u1Var2 = this.a2;
                    if (u1Var2 != null && u1Var2.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                v2 v2Var10 = this.f5768b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f5815q2;
                if ((this.S2 || this.E1) && !o4Var.f5693f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v2Var10.e1(f35, f36, f37, z11);
                if (this.f5768b2.getEmojiView() != null) {
                    this.f5768b2.getEmojiView().setAlpha(this.f5815q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f5774c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f5778d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f5774c4 = ofFloat;
        ofFloat.addUpdateListener(new e2(this, 2));
        this.f5774c4.addListener(new q2(this, z10, 1));
        this.f5774c4.setDuration(420L);
        this.f5774c4.setInterpolator(bs.h);
        this.f5774c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f5799k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.B0);
            b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 16);
            b2Var.f20666l0 = string;
            b2Var.m0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            i1 i1Var = new i1(4);
            b2Var.f20668n0 = string2;
            b2Var.f20669o0 = i1Var;
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
        long j10 = this.B1;
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        m4 m4Var = this.f5808o1;
        org.telegram.ui.Components.h9 h9Var = this.f5805n1;
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
            h9Var.m(this.C2, user);
            m4Var.f5610a.getImageReceiver().setForUserOrChat(user, h9Var);
            W0(this.B1, true, false);
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
            h9Var.k(this.C2, chat);
            m4Var.f5610a.getImageReceiver().setForUserOrChat(chat, h9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            i7 i7Var = this.S1;
            long j11 = this.B1;
            a0.h hVar = i7Var.f5502m;
            ja jaVar = (ja) hVar.f(j11);
            if (jaVar == null) {
                jaVar = new ja(i7Var.f5493a, j11, i7Var);
                hVar.k(jaVar, j11);
            }
            jaVar.b(true);
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
        r3 r3Var = this.f5771c1;
        aa aaVar = this.J0;
        int i14 = 8;
        o4 o4Var = this.O1;
        if (z16) {
            B0();
            if (this.f5768b2 == null && (this.E1 || o4Var.f5693f)) {
                v0();
            }
            if (this.f5768b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                v2 v2Var = this.f5768b2;
                if (o4Var.f5693f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i14 = 0;
                }
                v2Var.setVisibility(i14);
                v2 v2Var2 = this.f5768b2;
                boolean z17 = o4Var.f5693f;
                D0(true);
                v2Var2.f1(z17);
                v2 v2Var3 = this.f5768b2;
                if (o4Var.f5693f && !D0(true) && (this.f5830v2 || this.f5768b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                v2Var3.m1(z13, true);
                iu editField = this.f5768b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem = o4Var.f5690a;
                aaVar.getClass();
                editField.setText(aa.u(j12, storyItem));
                this.f5768b2.Y0(this.C2, this.B1);
                this.f5768b2.I1(chat2, null);
            }
            org.telegram.ui.Components.p6 p6Var = this.Q0;
            org.telegram.ui.ActionBar.d6 d6Var = this.B0;
            if (p6Var == null) {
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, false, false);
                this.Q0 = p6Var2;
                h3 h3Var = this.D0;
                p6Var2.setCallback(h3Var);
                this.Q0.u(d6Var.u(org.telegram.ui.ActionBar.h6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.f6(h3Var);
            }
            h3 h3Var2 = this.P0;
            if (h3Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, false);
                this.R0 = p6Var3;
                p6Var3.setCallback(h3Var2);
                this.R0.u(d6Var.u(org.telegram.ui.ActionBar.h6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.f6(h3Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            r3Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (o4Var.f5693f) {
                this.W1.setVisibility(8);
                if (this.f5768b2 == null) {
                    v0();
                }
                this.f5768b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                v2 v2Var4 = this.f5768b2;
                if (v2Var4 != null) {
                    v2Var4.setVisibility(8);
                }
            }
            v2 v2Var5 = this.f5768b2;
            if (v2Var5 != null) {
                boolean z18 = o4Var.f5693f;
                D0(true);
                v2Var5.f1(z18);
                v2 v2Var6 = this.f5768b2;
                if (o4Var.f5693f && !D0(true) && (this.f5830v2 || this.f5768b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v2Var6.m1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f5844z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(aaVar.P0));
                    if (indexOf < 0 && !this.f5844z1.isEmpty()) {
                        if (aaVar.P0 > ((Integer) this.f5844z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (aaVar.P0 < ((Integer) i0.a.h(1, this.f5844z1)).intValue()) {
                            indexOf = this.f5844z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f5833w1.isEmpty();
                    ArrayList arrayList2 = this.f5829v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f20506id > this.S1.f5496f.get(this.B1)) {
                                this.J1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            r3Var.invalidate();
            invalidate();
        } else {
            if (this.f5768b2 == null) {
                v0();
            }
            if (this.F1 && this.f5786g2 == null) {
                z0();
            }
            if (this.f5786g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f5786g2;
                if ((this.F1 && !o4Var.f5693f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            y8 y8Var = this.f5795j2;
            if (y8Var != null) {
                y8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            v2 v2Var7 = this.f5768b2;
            if (v2Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                v2Var7.setVisibility(i11);
                v2 v2Var8 = this.f5768b2;
                boolean z19 = o4Var.f5693f;
                D0(true);
                v2Var8.f1(z19);
                v2 v2Var9 = this.f5768b2;
                if (o4Var.f5693f && !D0(true) && (this.f5830v2 || this.f5768b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v2Var9.m1(z11, true);
                iu editField2 = this.f5768b2.getEditField();
                long j13 = this.B1;
                TL_stories.StoryItem storyItem2 = o4Var.f5690a;
                aaVar.getClass();
                editField2.setText(aa.u(j13, storyItem2));
                this.f5768b2.Y0(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f5768b2.I1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f5845z2, false);
                }
            }
            this.A1 = getStoriesCount();
            h3 h3Var3 = this.W1;
            if (h3Var3 != null) {
                h3Var3.setVisibility(8);
            }
            r3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5764a1 = true;
        this.f5779e1.onAttachedToWindow();
        this.f5785g1.onAttachedToWindow();
        this.f5782f1.onAttachedToWindow();
        this.f5801l3.onAttachedToWindow();
        this.f5807n3.onAttachedToWindow();
        v2 v2Var = this.f5768b2;
        if (v2Var != null) {
            v2Var.C0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5788h1;
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
        this.f5764a1 = false;
        this.f5779e1.onDetachedFromWindow();
        this.f5785g1.onDetachedFromWindow();
        this.f5782f1.onDetachedFromWindow();
        this.f5801l3.onDetachedFromWindow();
        this.f5807n3.onDetachedFromWindow();
        v2 v2Var = this.f5768b2;
        if (v2Var != null) {
            v2Var.B0();
        }
        org.telegram.ui.Components.r5 r5Var = this.f5810o3;
        if (r5Var != null) {
            r5Var.o(this);
            this.f5810o3 = null;
        }
        ah.e eVar = this.f5804m3;
        if (eVar != null) {
            eVar.d(this);
            this.f5804m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5788h1;
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
        this.f5837x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f5815q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        v3 v3Var = this.K0;
        if (v3Var.W.x()) {
            v3Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((r9) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f5768b2 != null && this.f5784f3 && this.f5764a1) {
            d2 d2Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(d2Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f5768b2.I(true);
            boolean z11 = this.F1;
            o4 o4Var = this.O1;
            if ((z11 && !o4Var.f5693f) || this.G1) {
                this.f5799k3 = false;
                this.f5768b2.setEnabled(false);
                this.f5768b2.g1(" ", z10);
            } else if (this.H1 > 0) {
                this.f5799k3 = false;
                this.f5768b2.setEnabled(true);
                this.f5768b2.g1(ld.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!o4Var.f5693f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f5799k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f5768b2.setEnabled(true);
                        if (((int) this.f5768b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f5768b2.getEditField().getMeasuredWidth()) {
                            v2 v2Var = this.f5768b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            v2Var.e = formatString2;
                            v2Var.f23937f = format;
                            v2Var.E1(z10);
                        } else {
                            this.f5768b2.g1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(d2Var, 1000L);
                        return;
                    }
                }
                this.f5799k3 = false;
                this.f5768b2.setEnabled(true);
                if (o4Var.f5693f) {
                    long starsPrice = this.f5768b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f5768b2.g1(ld.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f5768b2.O4), z10);
                        yq yqVar = this.f5768b2.O4[0];
                        if (yqVar != null) {
                            yqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f5768b2.g1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                v2 v2Var2 = this.f5768b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                v2Var2.g1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f5822s3) {
            if (this.f5819r3.getReactionsWindow() != null) {
                if (this.f5842y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f5819r3.getReactionsWindow().f872c);
                    return true;
                }
                this.f5819r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        n3 n3Var = this.f5794j1;
        if (n3Var != null) {
            ei.x3 x3Var = n3Var.f5364c;
            if (x3Var != null) {
                x3Var.e(true);
                n3Var.f5364c = null;
            }
            n3Var.f5363b = null;
            n3Var.invalidate();
            n3Var.b(false);
        }
        v3 v3Var = this.K0;
        if (v3Var.W.x()) {
            v3Var.W.f(false);
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
        r40 r40Var = this.W2;
        if (r40Var != null) {
            r40Var.b(true);
        }
        h4 h4Var = this.f5823t1;
        if (h4Var != null && h4Var.f26928b) {
            h4Var.a();
            return true;
        }
        v2 v2Var = this.f5768b2;
        if (v2Var != null && v2Var.t0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f5768b2.f23920c1) {
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new z1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((r9) this.Q1).h(alertDialog$Builder.f20601a);
            return true;
        }
        cl0 cl0Var = this.f5783f2;
        if (cl0Var != null && cl0Var.getReactionsWindow() != null && !this.f5783f2.getReactionsWindow().f883q) {
            this.f5783f2.getReactionsWindow().d();
            return true;
        }
        v2 v2Var2 = this.f5768b2;
        if (v2Var2 != null && v2Var2.r0()) {
            if (this.f5842y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f5768b2.getEmojiView());
                return true;
            }
            this.f5768b2.l0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            v2 v2Var3 = this.f5768b2;
            if (v2Var3 != null) {
                long j10 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f5690a;
                Editable editText = v2Var3.getEditText();
                this.J0.getClass();
                aa.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f5768b2);
            return true;
        } else if (v3Var.getVisibility() != 0 || v3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            v3Var.C();
            this.f5787g3 = false;
            this.f5771c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f5797k1.f40521b = i10;
        cl0 cl0Var = this.f5783f2;
        if (cl0Var != null) {
            cl0Var.setCurrentAccount(i10);
            this.f5783f2.p(null, null, true);
        }
        cl0 cl0Var2 = this.f5819r3;
        if (cl0Var2 != null) {
            cl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(j4 j4Var) {
        this.Q1 = j4Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f5784f3 != z10) {
            this.f5784f3 = z10;
            if (z10) {
                this.f5779e1.setCurrentAlpha(1.0f);
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
        if (this.f5767b1 != z10) {
            this.f5767b1 = z10;
            this.f5771c1.invalidate();
            if (this.K1 && this.J0.f5176a && Build.VERSION.SDK_INT < 33) {
                androidx.activity.i iVar = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(iVar);
                    AndroidUtilities.runOnUIThread(iVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                aa aaVar = ((r9) this.Q1).d;
                aaVar.l1 = true;
                aaVar.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            g3 g3Var = this.f5779e1;
            if (z10) {
                g3Var.stopAnimation();
                g3Var.setAllowStartAnimation(false);
            } else {
                g3Var.startAnimation();
                g3Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f5771c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            b3 b3Var = new b3(this, getContext(), this.B0);
            this.I2 = b3Var;
            b3Var.f30566c2 = new c3(this);
            b3Var.f30586j0.f0();
            b3 b3Var2 = this.I2;
            b3Var2.W = true;
            b3Var2.t1();
            b3 b3Var3 = this.I2;
            b3Var3.X = new d3(this);
            b3Var3.o1().setText(this.f5768b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.I3);
            this.X1 = aVar;
            aVar.setOnClickListener(new f2(this, 1));
            addView(this.X1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 83));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.d6 d6Var = this.B0;
        v2 v2Var = new v2(this, AndroidUtilities.findActivity(getContext()), this, new t2(1, d6Var));
        this.f5768b2 = v2Var;
        v2Var.getEditField().useAnimatedTextDrawable();
        this.f5768b2.getEditField().setScaleX(0.0f);
        this.f5768b2.setOverrideKeyboardAnimation(true);
        this.f5768b2.setClipChildren(false);
        this.f5768b2.setDelegate(new w2(this));
        setDelegate(this.f5768b2);
        v2 v2Var2 = this.f5768b2;
        v2Var2.f24047y4 = false;
        v2Var2.f24052z4 = true;
        if (this.O1.f5693f) {
            v2Var2.S0(false, false, false);
        } else {
            v2Var2.S0(true, true, false);
        }
        this.f5768b2.d();
        v2 v2Var3 = this.f5768b2;
        v2Var3.A4 = true;
        addView(v2Var3, w7.z5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        if (this.O3 != null) {
            this.f5768b2.O1(false);
        }
        this.f5768b2.G2 = this.f5845z2;
        p4 p4Var = this.M2;
        ((ArrayList) p4Var.f5731g).add(this.f5771c1);
        ((ArrayList) p4Var.f5731g).add(this);
        if (this.f5764a1) {
            this.f5768b2.C0();
        }
        r0(false);
        if (I0()) {
            this.f5768b2.setVisibility(8);
        }
        kh.h hVar = new kh.h(getContext(), d6Var, this.I3, this.F3);
        this.f5772c2 = hVar;
        hVar.setOnClickListener(new z1(this, 1));
        addView(this.f5772c2, w7.z5.e(57, 300, 85));
        this.f5772c2.setVisibility(8);
        this.f5768b2.setSideButtonsForAttach(this.f5772c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f5795j2 != null) {
            return;
        }
        y8 y8Var = new y8(getContext(), this.B0);
        this.f5795j2 = y8Var;
        y8Var.setOnClickListener(new f2(this, 4));
        this.f5795j2.setAlpha(0.0f);
        this.f5795j2.setVisibility(8);
        addView(this.f5795j2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            u1 u1Var = new u1(getContext(), this.I3);
            this.a2 = u1Var;
            u1Var.setOnClickListener(new f2(this, 5));
            u1 u1Var2 = this.a2;
            h1 h1Var = h1.W;
            boolean z11 = true;
            if (h1Var != null && h1Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1Var2.b(z10, false);
            u1 u1Var3 = this.a2;
            h1 h1Var2 = h1.W;
            if (h1Var2 != null && !h1Var2.m()) {
                z11 = false;
            }
            u1Var3.a(z11, false);
            addView(this.a2, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new x1(getContext(), this.C2);
            y1 y1Var = new y1(getContext(), this.Y1, this.I3);
            this.Z1 = y1Var;
            y1Var.setOnClickListener(new f2(this, 6));
            this.Z1.setOnLongClickListener(new c2(this, 1));
            addView(this.Z1, w7.z5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
            addView(this.Y1, w7.z5.a(200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 85));
        }
    }

    public final void z0() {
        int i10;
        if (this.f5786g2 != null) {
            return;
        }
        if (this.f5768b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5786g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f5789h2 = textView;
        textView.setTextColor(-8026747);
        this.f5789h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f5789h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f5792i2 = textView3;
        textView3.setTextColor(-1);
        this.f5792i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f5792i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f5792i2.setGravity(17);
        w7.b6.a(this.f5792i2);
        this.f5792i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f5792i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f5786g2.addView(imageView, w7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.f5786g2.addView(this.f5789h2, w7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f5786g2.addView(this.f5792i2, w7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f5768b2.addView(this.f5786g2, w7.z5.a(-1.0f, 14.0f, 0.0f, 8.0f, 0.0f, -1, 119));
    }
}
