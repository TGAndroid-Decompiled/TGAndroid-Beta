package oh;

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
import mh.ja;
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
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.ce;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.z50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.cz;
import org.telegram.ui.ek;
import org.telegram.ui.wr;
import org.telegram.ui.xn;
public abstract class f4 extends pv0 implements NotificationCenter.NotificationCenterDelegate {
    public final a3 A0;
    public boolean A1;
    public int A2;
    public org.telegram.ui.ActionBar.g1 A3;
    public y6 B0;
    public boolean B1;
    public boolean B2;
    public org.telegram.ui.ActionBar.g1 B3;
    public qh.e3 C0;
    public boolean C1;
    public b3 C2;
    public final og.a C3;
    public qh.e3 D0;
    public boolean D1;
    public boolean D2;
    public final tg.a D3;
    public qh.e3 E0;
    public long E1;
    public float E2;
    public final tg.d E3;
    public int F0;
    public final float F1;
    public u2 F2;
    public final rg.b F3;
    public final i9 G0;
    public int G1;
    public z50 G2;
    public TL_stories.TL_premium_boostsStatus G3;
    public final n3 H0;
    public boolean H1;
    public int H2;
    public ChannelBoostsController.CanApplyBoost H3;
    public final h2 I0;
    public int I1;
    public boolean I2;
    public long I3;
    public final View J0;
    public int J1;
    public final e4 J2;
    public long J3;
    public final ImageView K0;
    public int K1;
    public final AnimationNotificationsLocker K2;
    public boolean K3;
    public final LinearLayout L0;
    public final d4 L1;
    public final org.telegram.ui.Components.z5 L2;
    public TLRPC.TL_channels_sendAsPeers L3;
    public final a3 M0;
    public final a9.a M1;
    public final org.telegram.ui.Components.z5 M2;
    public final w1 M3;
    public org.telegram.ui.Components.j6 N0;
    public z3 N1;
    public float N2;
    public int N3;
    public org.telegram.ui.Components.j6 O0;
    public boolean O1;
    public long O2;
    public final w1 O3;
    public org.telegram.ui.Components.z5 P0;
    public t6 P1;
    public boolean P2;
    public final ArrayList P3;
    public org.telegram.ui.Components.z5 Q0;
    public boolean Q1;
    public boolean Q2;
    public final ArrayList Q3;
    public boolean R0;
    public boolean R1;
    public boolean R2;
    public boolean R3;
    public boolean S0;
    public boolean S1;
    public boolean S2;
    public final m2.b S3;
    public long T0;
    public a3 T1;
    public m40 T2;
    public final org.telegram.ui.Components.z5 T3;
    public long U0;
    public a U1;
    public final cv0 U2;
    public final org.telegram.ui.Components.z5 U3;
    public boolean V0;
    public r1 V1;
    public boolean V2;
    public final org.telegram.ui.Components.z5 V3;
    public boolean W0;
    public s1 W1;
    public x2 W2;
    public float W3;
    public boolean X0;
    public o1 X1;
    public FrameLayout X2;
    public final Path X3;
    public boolean Y0;
    public p2 Y1;
    public hg.q Y2;
    public boolean Y3;
    public final j3 Z0;
    public xg.g Z1;
    public boolean Z2;
    public ValueAnimator Z3;
    public final FrameLayout f17054a1;
    public qh.e3 a2;
    public r2 f17055a3;
    public float f17056a4;
    public final z2 f17057b1;
    public ValueAnimator f17058b2;
    public float f17059b3;
    public final ImageReceiver f17060c1;
    public qk0 f17061c2;
    public boolean c3;
    public final ImageReceiver f17062d1;
    public LinearLayout f17063d2;
    public boolean f17064d3;
    public final ArrayList f17065e1;
    public TextView f17066e2;
    public boolean f17067e3;
    public Runnable f17068f1;
    public TextView f17069f2;
    public boolean f17070f3;
    public final g3 f17071g1;
    public g8 f17072g2;
    public boolean f17073g3;
    public final cz f17074h1;
    public ViewPropertyAnimator f17075h2;
    public boolean f17076h3;
    public j4 f17077i1;
    public final qg.b f17078i2;
    public final ImageReceiver f17079i3;
    public float f17080j1;
    public final qg.b f17081j2;
    public ng.d f17082j3;
    public final org.telegram.ui.Components.z8 f17083k1;
    public final Paint f17084k2;
    public final ImageReceiver f17085k3;
    public final b4 l1;
    public int f17086l2;
    public org.telegram.ui.Components.l5 f17087l3;
    public final h8 f17088m1;
    public ValueAnimator f17089m2;
    public boolean f17090m3;
    public h5.u f17091n1;
    public float f17092n2;
    public boolean f17093n3;
    public int f17094o1;
    public float f17095o2;
    public qk0 f17096o3;
    public org.telegram.ui.ActionBar.g1 f17097p1;
    public float f17098p2;
    public boolean f17099p3;
    public y3 f17100q1;
    public int f17101q2;
    public float f17102q3;
    public TL_stories.PeerStories f17103r1;
    public boolean f17104r2;
    public boolean f17105r3;
    public final ArrayList f17106s1;
    public boolean f17107s2;
    public float f17108s3;
    public final ImageView f17109t0;
    public final ArrayList f17110t1;
    public boolean f17111t2;
    public int f17112t3;
    public final ImageView f17113u0;
    public final c4 f17114u1;
    public boolean f17115u2;
    public int f17116u3;
    public final eh.d f17117v0;
    public final lf.o0 f17118v1;
    public int f17119v2;
    public int f17120v3;
    public final kj0 f17121w0;
    public ArrayList f17122w1;
    public final int f17123w2;
    public w1 f17124w3;
    public final ImageView f17125x0;
    public int f17126x1;
    public TextView f17127x2;
    public float f17128x3;
    public final org.telegram.ui.ActionBar.g6 f17129y0;
    public long f17130y1;
    public kh.b f17131y2;
    public boolean f17132y3;
    public final n8 f17133z0;
    public boolean f17134z1;
    public int f17135z2;
    public wr f17136z3;

    public f4(Context context, final i9 i9Var, c4 c4Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.Y0 = true;
        this.f17065e1 = new ArrayList();
        this.f17094o1 = -5;
        this.F1 = 1.0f;
        d4 d4Var = new d4(this);
        this.L1 = d4Var;
        this.f17092n2 = -1.0f;
        this.f17095o2 = -1.0f;
        this.f17098p2 = -1.0f;
        this.f17123w2 = ConnectionsManager.generateClassGuid();
        this.L2 = new org.telegram.ui.Components.z5(this);
        this.M2 = new org.telegram.ui.Components.z5(this);
        cv0 cv0Var = new cv0();
        this.U2 = cv0Var;
        this.f17059b3 = 1.0f;
        this.M3 = new w1(this, 4);
        this.O3 = new w1(this, 11);
        this.P3 = new ArrayList();
        this.Q3 = new ArrayList();
        this.S3 = new m2.b(this, 3);
        this.T3 = new org.telegram.ui.Components.z5(this);
        this.U3 = new org.telegram.ui.Components.z5(this);
        this.V3 = new org.telegram.ui.Components.z5(this);
        this.X3 = new Path();
        cv0Var.E = new ja.c(this);
        ?? obj = new Object();
        obj.f17026g = new ArrayList();
        this.J2 = obj;
        this.K2 = new AnimationNotificationsLocker();
        this.f17106s1 = new ArrayList();
        this.f17110t1 = new ArrayList();
        z2 z2Var = new z2(this, 0);
        this.f17057b1 = z2Var;
        z2Var.setCrossfadeWithOldImage(false);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.ignoreNotifications = true;
        z2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f17079i3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f17085k3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f17060c1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f17062d1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        z2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f17083k1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.G0 = i9Var;
        this.f17114u1 = c4Var;
        this.M1 = c4Var.f16924g;
        this.P1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        c4Var.f16928l.setColor(-16777216);
        this.f17084k2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f17129y0 = g6Var;
        setClipChildren(false);
        g3 g3Var = new g3(this, context, this.Z0, g6Var, i9Var);
        this.f17071g1 = g3Var;
        rg.b bVar = new rg.b(g6Var, org.telegram.ui.ActionBar.k6.Sd, 0.8f);
        this.F3 = bVar;
        tg.c cVar = new tg.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            tg.d dVar = new tg.d(cVar);
            this.E3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.D3 = dVar;
        } else {
            this.E3 = null;
            this.D3 = cVar;
        }
        vg.i iVar = new vg.i(this);
        og.a aVar = new og.a(this.D3);
        aVar.d = iVar;
        aVar.f16756e = this;
        this.C3 = aVar;
        this.f17078i2 = aVar.c(this, bVar, false);
        qg.b c3 = aVar.c(this, bVar, false);
        this.f17081j2 = c3;
        c3.t(AndroidUtilities.dp(32.0f));
        j3 j3Var = new j3(this, context, c4Var, i9Var);
        this.Z0 = j3Var;
        j3Var.setClipChildren(false);
        this.f17074h1 = new cz(this.f17135z2, j3Var);
        j3Var.addView(g3Var, k7.c6.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), i9Var.f17306y, i9Var, g6Var);
        this.H0 = n3Var;
        n3Var.V.setOnClickListener(new y1(this, 10));
        ImageView imageView = new ImageView(context);
        this.K0 = imageView;
        imageView.setImageDrawable(c4Var.f16929m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new y1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        k7.e6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(c4Var.f16930n);
        imageView2.setPadding(dp, dp, dp, dp);
        a3 a3Var = new a3(this, getContext(), 1);
        this.M0 = a3Var;
        org.telegram.ui.Components.j6 j6Var = this.O0;
        if (j6Var != null) {
            j6Var.setCallback(a3Var);
        }
        a3Var.setWillNotDraw(false);
        a3Var.setOnClickListener(new y1(this, 12));
        a3 a3Var2 = new a3(this, getContext(), 2);
        this.A0 = a3Var2;
        org.telegram.ui.Components.j6 j6Var2 = this.N0;
        if (j6Var2 != null) {
            j6Var2.setCallback(a3Var2);
        }
        a3Var2.setWillNotDraw(false);
        a3Var2.setOnClickListener(new y1(this, 13));
        a3Var2.setOnLongClickListener(new g2(0, this, i9Var));
        y6 y6Var = new y6(context, c4Var);
        this.B0 = y6Var;
        y6Var.setPadding(dp, dp, dp, dp);
        a3Var2.addView(this.B0, k7.c6.e(40, 40, 3));
        a3Var.addView(imageView2, k7.c6.e(40, 40, 3));
        k7.e6.b(a3Var2, 0.3f, 5.0f);
        k7.e6.b(a3Var, 0.3f, 5.0f);
        z2Var.setAllowLoadingOnAttachedOnly(true);
        z2Var.setParentView(j3Var);
        lf.o0 o0Var = new lf.o0(10);
        this.f17118v1 = o0Var;
        j3Var.setOutlineProvider(o0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        b4 b4Var = new b4(context, d4Var);
        this.l1 = b4Var;
        b4Var.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f17806b;

            {
                this.f17806b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f4 f4Var = this.f17806b;
                        long j10 = UserConfig.getInstance(f4Var.f17135z2).clientUserId;
                        long j11 = f4Var.f17130y1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle h = android.support.v4.media.a.h(1, "type");
                            h.putLong("dialog_id", f4Var.f17130y1);
                            i9Var2.H(new fa0(h, null));
                            return;
                        } else if (j11 > 0) {
                            i9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            i9Var2.H(xn.R9(j11));
                            return;
                        }
                    default:
                        f4 f4Var2 = this.f17806b;
                        if (f4Var2.L1.j()) {
                            i9Var.O();
                            if (!i9.A1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            eh.d dVar2 = f4Var2.f17117v0;
                            if (!i9.A1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            dVar2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        f4Var2.c1(true);
                        return;
                }
            }
        });
        j3Var.addView(b4Var, k7.c6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17054a1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.L0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, k7.c6.q(40, 40, 5));
        linearLayout.addView(a3Var, k7.c6.q(40, 40, 5));
        linearLayout.addView(a3Var2, k7.c6.q(40, 40, 5));
        addView(linearLayout, k7.c6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f17109t0 = imageView3;
        imageView3.setImageDrawable(c4Var.f16933q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        j3Var.addView(imageView3, k7.c6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f17113u0 = imageView4;
        imageView4.setImageDrawable(c4Var.f16934r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        j3Var.addView(imageView4, k7.c6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new androidx.mediarouter.app.c(i9Var, 26));
        imageView3.setOnClickListener(new b0(this, g6Var, i9Var, context, c4Var, 1));
        eh.d dVar2 = new eh.d(context, 4);
        this.f17117v0 = dVar2;
        j3Var.addView(dVar2, k7.c6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f17121w0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.f17125x0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(c4Var.f16936t);
        dVar2.addView(imageView6);
        imageView6.setVisibility(8);
        n8 n8Var = new n8(context);
        this.f17133z0 = n8Var;
        n8Var.setOnClickListener(new y1(this, 2));
        j3Var.addView(n8Var, k7.c6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        dVar2.setOnClickListener(new View.OnClickListener(this) {
            public final f4 f17806b;

            {
                this.f17806b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f4 f4Var = this.f17806b;
                        long j10 = UserConfig.getInstance(f4Var.f17135z2).clientUserId;
                        long j11 = f4Var.f17130y1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle h = android.support.v4.media.a.h(1, "type");
                            h.putLong("dialog_id", f4Var.f17130y1);
                            i9Var2.H(new fa0(h, null));
                            return;
                        } else if (j11 > 0) {
                            i9Var2.H(ProfileActivity.m4(j11));
                            return;
                        } else {
                            i9Var2.H(xn.R9(j11));
                            return;
                        }
                    default:
                        f4 f4Var2 = this.f17806b;
                        if (f4Var2.L1.j()) {
                            i9Var.O();
                            if (!i9.A1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            eh.d dVar22 = f4Var2.f17117v0;
                            if (!i9.A1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            dVar22.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        f4Var2.c1(true);
                        return;
                }
            }
        });
        this.f17088m1 = new h8(this, c4Var);
        j3Var.addView(n3Var, k7.c6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.J0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        h2 h2Var = new h2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.I0 = h2Var;
        j3Var.addView(view, k7.c6.e(-1, 200, 87));
        j3Var.addView(h2Var, k7.c6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, k7.c6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        a3Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        a3Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        w9 w9Var = n3Var.T;
        View o10 = w9Var.o(context);
        if (o10 != null) {
            AndroidUtilities.removeFromParent(o10);
            addView(o10);
        }
        w9Var.D = new i2(this, 0);
        w9Var.T(this);
    }

    public static void V0(s6 s6Var, ImageReceiver imageReceiver, String str) {
        if (s6Var.f17744s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(s6Var.f17741f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(s6Var.f17740e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(f4 f4Var, ValueAnimator valueAnimator) {
        float f10;
        n8 n8Var = f4Var.f17133z0;
        f4Var.f17056a4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b4 b4Var = f4Var.l1;
        b4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var.f17056a4);
        b4Var.setAlpha(1.0f - f4Var.f17056a4);
        ImageView imageView = f4Var.f17109t0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var.f17056a4);
        imageView.setAlpha(1.0f - f4Var.f17056a4);
        ImageView imageView2 = f4Var.f17113u0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var.f17056a4);
        imageView2.setAlpha(1.0f - f4Var.f17056a4);
        eh.d dVar = f4Var.f17117v0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var.f17056a4);
        dVar.setAlpha((1.0f - f4Var.f17056a4) * f4Var.f17059b3);
        a3 a3Var = f4Var.T1;
        if (a3Var != null) {
            a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * f4Var.f17056a4);
            f4Var.T1.setAlpha(1.0f - f4Var.f17056a4);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var.f17056a4);
            n8Var.setAlpha(1.0f - f4Var.f17056a4);
        }
        f4Var.H0.setAlpha(1.0f - f4Var.f17056a4);
        z3 z3Var = f4Var.N1;
        if (z3Var == null) {
            f10 = 0.0f;
        } else {
            f10 = ((z8) z3Var).d.S;
        }
        float hideInterfaceAlpha = f4Var.getHideInterfaceAlpha();
        a3 a3Var2 = f4Var.A0;
        if (a3Var2 != null) {
            a3Var2.setAlpha((1.0f - f4Var.f17056a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = f4Var.K0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - f4Var.f17056a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        a3 a3Var3 = f4Var.M0;
        if (a3Var3 != null) {
            a3Var3.setAlpha((1.0f - f4Var.f17056a4) * (1.0f - f10) * hideInterfaceAlpha);
        }
        p2 p2Var = f4Var.Y1;
        if (p2Var != null) {
            p2Var.setAlpha(1.0f - f4Var.f17056a4);
            f4Var.invalidate();
        }
        f4Var.Z0.invalidate();
    }

    public static void a0(f4 f4Var, boolean z4) {
        org.telegram.ui.ActionBar.g1 g1Var = f4Var.A3;
        if (g1Var != null && f4Var.f17136z3 != null && g1Var.getVisibility() == 0) {
            if (z4) {
                if (Math.abs(i9.f17252y1 - 0.2f) < 0.05f) {
                    f4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(i9.f17252y1 - 0.5f) < 0.05f) {
                    f4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(i9.f17252y1 - 1.0f) < 0.05f) {
                    f4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(i9.f17252y1 - 1.5f) < 0.05f) {
                    f4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(i9.f17252y1 - 2.0f) < 0.05f) {
                    f4Var.A3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var2 = f4Var.A3;
                    int i10 = R.string.VideoSpeedCustom;
                    g1Var2.setSubtext(LocaleController.formatString(i10, ef.f.a(i9.f17252y1) + "x"));
                }
            }
            f4Var.f17136z3.a(i9.f17252y1, z4);
        }
    }

    public static void b0(f4 f4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!f4Var.I0() && !f4Var.L1.f16967f) {
            if (UserConfig.getInstance(f4Var.f17135z2).isPremium()) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f4Var.f17129y0).setOnClickListener(new y1(f4Var, 8));
                return;
            }
            Drawable drawable = f4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            j2 j2Var = new j2(f4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f4Var.f17129y0);
            c3.setOnClickListener(new y1(f4Var, 9));
            c3.setIcon(j2Var);
        }
    }

    public static void d0(f4 f4Var) {
        d4 d4Var = f4Var.L1;
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if ((storyItem == null && d4Var.f16964b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = d4Var.h();
        boolean z4 = d4Var.f16966e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), f4Var.getContext(), z4 ? 1 : 0, null, null, new mh.m6(1, f4Var, z4));
            return;
        }
        f4Var.a1();
    }

    public static void e0(f4 f4Var, long j10) {
        String str;
        boolean z4;
        TLRPC.User user;
        if (j10 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(j10));
            str = user2.first_name;
            z4 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(f4Var.f17135z2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z4 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new mh.i(f4Var, MessagesController.getInstance(f4Var.f17135z2), j10, !z4, str, user), 200L);
    }

    public static void f0(f4 f4Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f4Var.getContext(), 0, f4Var.f17129y0);
        if (f4Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f21168a.O = LocaleController.getString(i10);
        if (f4Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f21168a.Q = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new t1(f4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh.c3(13));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        ((z8) f4Var.N1).h(d2Var);
        d2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.f17135z2);
    }

    public float getHideInterfaceAlpha() {
        float f10;
        float f11 = 1.0f - this.L2.f33763c;
        n5 n5Var = this.G0.f17302w;
        if (n5Var == null) {
            f10 = 0.0f;
        } else {
            f10 = n5Var.f17493f;
        }
        return (1.0f - f10) * f11;
    }

    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.L1.f16967f || (i9Var = this.G0) == null || i9Var.f17305x0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.f17305x0.j();
    }

    public static void h0(f4 f4Var) {
        String str;
        ic J;
        org.telegram.ui.ActionBar.g6 g6Var = f4Var.f17129y0;
        j3 j3Var = f4Var.Z0;
        if (f4Var.D1) {
            return;
        }
        if (f4Var.B1) {
            if (f4Var.G3 != null && f4Var.H3 != null) {
                fg.v0.C1(new fg.x1(f4Var, 4), f4Var.G3, f4Var.H3, f4Var.f17130y1, true);
                return;
            }
            i9 i9Var = f4Var.G0;
            if (i9Var != null) {
                i9Var.f17274h1 = true;
                i9Var.P();
            }
            MessagesController.getInstance(f4Var.f17135z2).getBoostsController().getBoostsStats(f4Var.f17130y1, new ng.i(f4Var, 1));
            return;
        }
        p2 p2Var = f4Var.Y1;
        int i10 = -f4Var.f17094o1;
        f4Var.f17094o1 = i10;
        AndroidUtilities.shakeViewSpring(p2Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (f4Var.f17130y1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(f4Var.f17135z2).getUser(Long.valueOf(f4Var.f17130y1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(f4Var.f17135z2).premiumFeaturesBlocked()) {
            J = new qc(j3Var, g6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new qc(j3Var, g6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w1(f4Var, 5));
        }
        J.j();
    }

    public static void j0(f4 f4Var) {
        d4 d4Var = f4Var.L1;
        if (d4Var.f16963a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f21087id = d4Var.f16963a.f21082id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(f4Var.f17135z2).getInputPeer(f4Var.f17130y1);
        ConnectionsManager.getInstance(f4Var.f17135z2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.Y2 != null) {
            return;
        }
        hg.q qVar = new hg.q(getContext(), 2);
        this.Y2 = qVar;
        qVar.setTextSize(1, 14.0f);
        this.Y2.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.Y2.setGravity(19);
        this.Y2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.Y2, k7.c6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.T1 != null) {
            return;
        }
        a3 a3Var = new a3(this, getContext(), 0);
        this.T1 = a3Var;
        a3Var.setClickable(true);
        addView(this.T1, k7.c6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        b3 b3Var = new b3(this, getContext());
        this.C2 = b3Var;
        b3Var.setOnClickListener(new y1(this, 0));
        this.T1.addView(this.C2, k7.c6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        kh.b bVar = new kh.b(1, getContext(), false);
        this.f17131y2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.T1.addView(this.f17131y2, k7.c6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f17127x2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f17127x2.setTextColor(-1);
        this.T1.addView(this.f17127x2, k7.c6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f17114u1.f16935s);
        b3 b3Var2 = this.C2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        b3Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.X2 != null) {
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f17129y0;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        TextView textView2 = new TextView(getContext());
        k7.e6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new y1(this, 3));
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        linearLayout.addView(textView2, k7.c6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, k7.c6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Z0.addView(frameLayout);
        this.X2 = frameLayout;
    }

    public final boolean D0(boolean z4) {
        e1 e1Var;
        TLRPC.Peer i10;
        e1 e1Var2;
        long clientUserId = UserConfig.getInstance(this.f17135z2).getClientUserId();
        long j10 = this.f17130y1;
        i9 i9Var = this.G0;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 < 0 && (e1Var2 = i9Var.f17305x0) != null) {
            if (z4) {
                TLRPC.Peer i12 = e1Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-this.f17130y1));
                if (i9Var.f17305x0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.f17130y1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.f17135z2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && i9Var != null && (e1Var = i9Var.f17305x0) != null && e1Var.l()) {
            if (!z4 || (i10 = i9Var.f17305x0.i()) == null || this.f17130y1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.f17130y1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        e4 e4Var = this.J2;
        org.telegram.ui.o4 o4Var = e4Var.d;
        if (o4Var != null && e4Var.f17023c != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(e4Var.f17023c, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (o4Var != null && (textureView = e4Var.f17024e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            j3 j3Var = this.Z0;
            canvas.scale(i10 / j3Var.getMeasuredWidth(), i11 / j3Var.getMeasuredHeight());
            this.f17057b1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(qh.a8 a8Var, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        z3 z3Var = this.N1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        qh.c8 c8Var = new qh.c8(context, i10, this.f17129y0);
        c8Var.q1(a8Var);
        ek ekVar = c8Var.f45187b;
        if (ekVar != null) {
            for (View view : ekVar.getViewPages()) {
                if (view instanceof qh.w7) {
                    ((qh.w7) view).e(false);
                }
            }
        }
        c8Var.k1(true);
        c8Var.Q = new ng.w(3, this, storyItem);
        ((z8) z3Var).h(c8Var);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        j3 j3Var = this.Z0;
        float x11 = view.getX() + j3Var.getX() + x10;
        float y10 = view.getY() + j3Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        l6 l6Var;
        i9 i9Var = this.G0;
        if (i9Var != null && (l6Var = i9Var.L0) != null && l6Var.f17401e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.f17135z2).getUser(Long.valueOf(this.G0.L0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(ng.q0 q0Var) {
        boolean z4;
        boolean z10;
        int i10;
        TLRPC.Reaction reaction;
        d4 d4Var = this.L1;
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (reaction2 != null && q0Var == null) {
            l0();
            this.P1.g0(this.f17130y1, d4Var.f16963a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f17135z2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f17090m3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = ng.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f17079i3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.f17093n3 = true;
                this.P1.g0(this.f17130y1, d4Var.f16963a, ng.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.P1.g0(this.f17130y1, d4Var.f16963a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = d4Var.f16963a;
        a3 a3Var = this.A0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z4 = !z4;
            this.B0.setReaction(ng.q0.d(reaction));
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        } else {
            this.B0.setReaction(null);
            a3Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        }
        if (this.A1 && z4) {
            TL_stories.StoryItem storyItem3 = d4Var.f16963a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = d4Var.f16963a.views;
            int i11 = storyViews.reactions_count;
            if (z10) {
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
        TL_stories.StoryItem storyItem4 = d4Var.f16963a;
        ng.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        e1 e1Var;
        boolean z4;
        if (this.L3 == null) {
            i9 i9Var = this.G0;
            if (i9Var != null && (e1Var = i9Var.f17305x0) != null) {
                TLRPC.GroupCall groupCall = e1Var.v;
                if (groupCall == null) {
                    z4 = false;
                } else {
                    z4 = !groupCall.messages_enabled;
                }
                if (z4) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.f17135z2).getSendAsPeers(this.f17130y1, true);
            this.L3 = sendAsPeers;
            p2 p2Var = this.Y1;
            if (p2Var != null && sendAsPeers != null) {
                p2Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        p2 p2Var = this.Y1;
        if (p2Var == null) {
            return false;
        }
        boolean z4 = p2Var.f24691v2;
        if (z4) {
            p2Var.s1();
        }
        AndroidUtilities.runOnUIThread(new w1(this, 3), 300L);
        return z4;
    }

    public final void O0() {
        CharSequence charSequence;
        long j10;
        dg.h0 h0Var;
        int i10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.Y1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.f17135z2).getClientUserId();
        TLRPC.Peer i11 = this.G0.f17305x0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.f17135z2;
        String shortName = DialogObject.getShortName(i12, this.f17130y1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.I3;
        dg.h0 h0Var2 = new dg.h0(this, 25);
        b bVar = new b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, bVar, false, false);
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
            j10 = j12;
            h0Var = h0Var2;
            i10 = ((org.telegram.ui.Components.u5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.u5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j10 = j12;
            h0Var = h0Var2;
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
        final oq[] oqVarArr = new oq[1];
        final qh.d dVar = new qh.d(context, null, true);
        final ?? obj = new Object();
        obj.f17759c = clientUserId;
        obj.f17761f = textWithEntities;
        obj.f17762g = jArr[0];
        final o0 o0Var = new o0(i12, context, true);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        final eg.s2 s2Var = new eg.s2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f10.addView(s2Var, k7.c6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final eg.s2 s2Var2 = new eg.s2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f10.addView(s2Var2, k7.c6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final eg.s2 s2Var3 = new eg.s2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f10.addView(s2Var3, k7.c6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
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
                dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), oqVarArr), true, true);
                long j13 = jArr2[0];
                t0 t0Var = obj;
                t0Var.f17762g = j13;
                o0Var.set(t0Var);
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
                ((org.telegram.ui.Components.k6) s2Var.f5475b).c(formatString, true, true);
                ((org.telegram.ui.Components.k6) s2Var2.f5475b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.k6) s2Var3.f5475b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = s.b(i16, num.intValue(), 3);
                int b14 = s.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                rVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        o0Var.set(obj);
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
        if (arrayList.isEmpty() || ((Integer) l.d.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr5[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        rVar.f13770b0 = iArr5;
        rVar.setValue((int) jArr[0]);
        linearLayout.addView(rVar, k7.c6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f10, k7.c6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.k6.f21768j5;
        TextView b10 = k7.g6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, k7.c6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = k7.g6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        org.telegram.ui.b.o(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, k7.c6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(o0Var, k7.c6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, k7.c6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        h3Var.show();
        dVar.setOnClickListener(new eg.o(h0Var, jArr, h3Var, 10));
    }

    public final void P0() {
        if (this.Y1 == null) {
            return;
        }
        t0();
        this.F2.f29072g0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.Y1.P();
        }
        this.F2.J1(-1, true);
        u2 u2Var = this.F2;
        u2Var.W = this.f17130y1;
        u2Var.r1();
        this.F2.m1().setText(this.Y1.getFieldText());
        ((z8) this.N1).h(this.F2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.f17130y1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.f17135z2).getDialog(this.f17130y1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.G0.H(new xn(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.S0(android.net.Uri):void");
    }

    public final void T0(long j10, boolean z4) {
        int i10;
        int i11;
        if (this.H1 != z4) {
            this.H1 = z4;
            kj0 kj0Var = this.f17121w0;
            int i12 = 0;
            if (z4) {
                if (this.G0.f17254a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.N1).d;
                    i9Var.f17276i1 = true;
                    i9Var.P();
                    m2.b bVar = this.S3;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 100L);
                }
                R0(j10);
                g1();
                kj0Var.setAnimation(this.f17114u1.f16937u);
                this.H1 = true;
                this.l1.f16888a.getImageReceiver().setVisible(true, true);
                d4 d4Var = this.L1;
                if (d4Var.f16963a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.f17130y1 + " storyId=" + d4Var.f16963a.f21082id + " " + d4.c(d4Var));
                }
            } else {
                p0();
                kj0Var.a();
                this.f17077i1 = null;
                this.I2 = false;
                this.L2.d(0.0f, true);
                this.Z0.invalidate();
                invalidate();
                q0();
                i9 i9Var2 = ((z8) this.N1).d;
                i9Var2.F0 = false;
                i9Var2.P();
            }
            if (this.H1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f17057b1.setFileLoadingPriority(i10);
            if (this.H1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f17060c1.setFileLoadingPriority(i11);
            if (this.H1) {
                i12 = 2;
            }
            this.f17062d1.setFileLoadingPriority(i12);
            if (this.f17134z1 || this.A1) {
                t6 t6Var = this.P1;
                long j11 = this.f17130y1;
                boolean z10 = this.H1;
                a0.h hVar = t6Var.f17782m;
                r9 r9Var = (r9) hVar.f(j11);
                if (r9Var == null) {
                    r9Var = new r9(t6Var.f17772a, j11, t6Var);
                    hVar.k(r9Var, j11);
                }
                r9Var.b(z10);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.f17130y1 != j10) {
            d4 d4Var = this.L1;
            d4Var.f16964b = null;
            d4Var.f16963a = null;
        }
        this.f17130y1 = j10;
        this.f17122w1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.G0.N0;
        boolean z4 = true;
        if (peerStories != null) {
            this.P1.S(peerStories, true);
            return;
        }
        t6 t6Var = this.P1;
        TL_stories.PeerStories y10 = t6Var.y(j10);
        if (y10 == null) {
            y10 = t6Var.z(j10);
        } else {
            z4 = false;
        }
        t6Var.S(y10, z4);
    }

    public final void W0(long j10, boolean z4, boolean z10) {
        String str;
        if (!z4 && j10 == this.J3 && this.K3 == z10) {
            return;
        }
        this.J3 = j10;
        this.K3 = z10;
        b4 b4Var = this.l1;
        if (j10 >= 0) {
            if (this.f17134z1 && !z10) {
                b4Var.f16889b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                b4Var.f16889b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.f17135z2).getUser(Long.valueOf(j10));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                pq pqVar = new pq(mutate, null);
                pqVar.f30166w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                pqVar.h = dp;
                pqVar.f30163n = dp2;
                b4Var.f16889b.i(pqVar);
            } else {
                b4Var.f16889b.i(null);
            }
            if (user != null) {
                b4Var.f16889b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), b4Var.f16889b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            b4Var.f16889b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-j10));
        jg.c cVar = b4Var.f16889b;
        jg.c cVar2 = b4Var.f16889b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        cVar.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            pq pqVar2 = new pq(mutate2, null);
            pqVar2.f30166w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            pqVar2.h = dp3;
            pqVar2.f30163n = dp4;
            cVar2.i(pqVar2);
            return;
        }
        cVar2.i(null);
    }

    public final void X0(float f10, float f11, j4 j4Var) {
        this.f17080j1 = f10;
        this.f17128x3 = 1.0f / f11;
        if (this.f17077i1 != j4Var) {
            this.f17077i1 = j4Var;
            if (j4Var != null) {
                ImageReceiver imageReceiver = j4Var.f17332a;
                if (imageReceiver.getBitmap() != null) {
                    this.f17057b1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z4) {
        TLRPC.Chat chat;
        boolean z10;
        d4 d4Var = this.L1;
        if (d4Var.f16963a != null) {
            i9 i9Var = this.G0;
            if (i9Var.f17268f != null) {
                String e6 = d4Var.e();
                if (z4) {
                    n2 n2Var = new n2(2, this.f17129y0);
                    if (this.A1) {
                        chat = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-this.f17130y1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.f17135z2).storiesEnabled() && ((!this.A1 && !UserObject.isService(this.f17130y1)) || ChatObject.isPublic(chat))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x2 x2Var = new x2(this, i9Var.f17268f.getContext(), e6, e6, z10, n2Var);
                    this.W2 = x2Var;
                    x2Var.f28834f0 = true;
                    TL_stories.StoryItem storyItem = d4Var.f16963a;
                    storyItem.dialogId = this.f17130y1;
                    x2Var.C0 = storyItem;
                    x2Var.f28844p0 = new o5.i(this, 28);
                    ((z8) this.N1).h(x2Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e6);
                LaunchActivity.D1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        j3 j3Var = this.Z0;
        org.telegram.ui.ActionBar.g6 g6Var = this.f17129y0;
        org.telegram.messenger.y3.s(R.string.UnsupportedAttachment, new qc(j3Var, g6Var), g6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f17129y0);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.Q = string;
        ((z8) this.N1).h(d2Var);
    }

    public final void b1(boolean z4) {
        if (this.f17099p3 != z4) {
            d4 d4Var = this.L1;
            if (d4Var.f16963a != null) {
                this.f17099p3 = z4;
                if (z4) {
                    this.f17096o3.setVisibility(0);
                }
                this.f17096o3.setStoryItem(d4Var.f16963a);
                i9 i9Var = ((z8) this.N1).d;
                i9Var.f17282m1 = z4;
                i9Var.P();
                float f10 = 0.0f;
                if (z4) {
                    float f11 = this.f17102q3;
                    if (z4) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.f17096o3.setTransitionProgress(this.f17102q3);
                    ofFloat.addUpdateListener(new x1(this, 1));
                    ofFloat.addListener(new k2(this, z4, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(pr.f30169g);
                    ofFloat.start();
                    return;
                }
                if (this.f17096o3.getReactionsWindow() != null) {
                    this.f17096o3.getReactionsWindow().e();
                }
                this.f17096o3.animate().alpha(0.0f).setDuration(150L).setListener(new l2(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z4) {
        int i10;
        if (this.D0 == null) {
            qh.e3 e3Var = new qh.e3(getContext(), 1);
            e3Var.l(1.0f, -56.0f);
            this.D0 = e3Var;
            e3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Z0.addView(this.D0, k7.c6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        qh.e3 e3Var2 = this.D0;
        if (z4) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        e3Var2.s(LocaleController.getString(i10));
        this.D0.u();
    }

    public final boolean d1(boolean z4) {
        if (this.G0.O0) {
            z4 = !z4;
        }
        if (z4) {
            if (this.G1 < getStoriesCount() - 1) {
                this.G1++;
                f1(false);
                return true;
            }
        } else {
            int i10 = this.G1;
            if (i10 > 0) {
                this.G1 = i10 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f10;
        e1 e1Var;
        boolean z4;
        int i12 = NotificationCenter.storiesUpdated;
        long j10 = 0;
        i9 i9Var = this.G0;
        boolean z10 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || i9Var.L0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.H0.V.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                n6 o10 = MessagesController.getInstance(this.f17135z2).getStoriesController().o();
                if (o10 != null && o10.a(this.f17135z2, 1) && this.N1 != null) {
                    fg.x1 x1Var = new fg.x1(this, 4);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.D1;
                    }
                    ((z8) this.N1).h(new fg.v0(o10.b(), this.f17135z2, findActivity, x1Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f17135z2).isUserContactBlocked(this.f17130y1);
                if (this.f17130y1 >= 0 && !UserConfig.getInstance(this.f17135z2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.C1 != z4 || this.E1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.C1 = z4;
                    this.E1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    f1(false);
                    r0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.f17130y1 == (-((TLRPC.ChatFull) obj).f20846id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (i9Var != null && (e1Var = i9Var.f17305x0) != null && e1Var.g() == longValue) {
                    f1(false);
                    p2 p2Var = this.Y1;
                    if (p2Var != null) {
                        p2Var.J(true);
                        this.Y1.P1(true);
                        r0(true);
                    }
                    h2 h2Var = this.I0;
                    if (h2Var != null) {
                        e1 e1Var2 = h2Var.M;
                        if (e1Var2 != null) {
                            j10 = e1Var2.j();
                        }
                        if (h2Var.E != j10) {
                            h2Var.f17836e.N(true);
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
        z3 z3Var = this.N1;
        if (z3Var == null || !((z8) z3Var).d.E0) {
            if (this.H1) {
                j1();
                if (this.f17126x1 == 0) {
                    if (!this.B2) {
                        this.B2 = true;
                        ((z8) this.N1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.G1;
                ArrayList arrayList = this.f17106s1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f17110t1;
                if (i13 >= arrayList2.size() + size) {
                    this.G1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.f17134z1 || this.A1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = i9Var.N0;
            if (peerStories != null) {
                this.P1.S(peerStories, true);
            } else {
                long j11 = this.f17130y1;
                if (j11 != 0) {
                    t6 t6Var = this.P1;
                    TL_stories.PeerStories y10 = t6Var.y(j11);
                    if (y10 == null) {
                        y10 = t6Var.z(j11);
                        z10 = true;
                    }
                    t6Var.S(y10, z10);
                }
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f17097p1;
            if (g1Var != null) {
                ViewPropertyAnimator animate = g1Var.animate();
                if (this.P1.K(this.f17130y1) && this.L1.f16966e && !SharedConfig.allowPreparingHevcPlayers()) {
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
        org.telegram.ui.Components.j6 j6Var;
        org.telegram.ui.Components.j6 j6Var2;
        l1();
        if (this.A1 && (j6Var2 = this.N0) != null) {
            j6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.A1 && (j6Var = this.O0) != null) {
            j6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z4 = this.f17105r3;
        LinearLayout linearLayout = this.L0;
        a3 a3Var = this.A0;
        if (z4) {
            float measuredWidth = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f17112t3, measuredWidth - f10, pr.f30169g.getInterpolation(this.f17108s3));
            float lerp2 = AndroidUtilities.lerp(this.f17116u3, measuredHeight - f10, this.f17108s3);
            int lerp3 = AndroidUtilities.lerp(this.f17120v3, dp, this.f17108s3);
            if (this.f17090m3) {
                org.telegram.ui.Components.l5 l5Var = this.f17087l3;
                if (l5Var != null) {
                    float f11 = lerp3;
                    l5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f11), (int) (lerp2 + f11));
                    this.f17087l3.draw(canvas);
                }
            } else {
                float f12 = lerp3;
                ImageReceiver imageReceiver = this.f17085k3;
                imageReceiver.setImageCoords(lerp, lerp2, f12, f12);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f17093n3) {
            float measuredWidth2 = (a3Var.getMeasuredWidth() / 2.0f) + a3Var.getX() + linearLayout.getX();
            float measuredHeight2 = (a3Var.getMeasuredHeight() / 2.0f) + a3Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f17090m3) {
                float f13 = dp2;
                float f14 = f13 / 2.0f;
                float f15 = measuredWidth2 - f14;
                float f16 = measuredHeight2 - f14;
                ImageReceiver imageReceiver2 = this.f17079i3;
                imageReceiver2.setImageCoords(f15, f16, f13, f13);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.f17093n3 = false;
                }
            } else {
                ng.d dVar = this.f17082j3;
                if (dVar != null) {
                    float f17 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f17), (int) (measuredHeight2 - f17), (int) (measuredWidth2 + f17), (int) (measuredHeight2 + f17));
                    this.f17082j3.b(canvas);
                    if (this.f17082j3.c()) {
                        this.f17082j3.d(this);
                        this.f17082j3 = null;
                        this.f17093n3 = false;
                    }
                } else {
                    this.f17093n3 = false;
                }
            }
        }
        p2 p2Var = this.Y1;
        if (p2Var != null) {
            ce ceVar = p2Var.f24685u1;
            ae aeVar2 = p2Var.f24690v1;
            if (p2Var.getAlpha() != 0.0f && (aeVar = p2Var.f24579b1) != null && aeVar.getParent() != null && p2Var.f24579b1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(p2Var.f24579b1.getX() + ceVar.getX() + aeVar2.getX() + p2Var.getX(), p2Var.f24579b1.getY() + ceVar.getY() + aeVar2.getY() + p2Var.getY());
                if (p2Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight(), (int) (p2Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                p2Var.f24579b1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        qk0 qk0Var;
        qk0 qk0Var2;
        tg.d dVar;
        float dp;
        float f10;
        if (view == this.f17055a3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f17055a3.getY(), getMeasuredWidth(), this.f17055a3.getY() + this.f17055a3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        p2 p2Var = this.Y1;
        Paint paint = this.f17084k2;
        a3 a3Var = this.A0;
        c4 c4Var = this.f17114u1;
        if (view == p2Var) {
            float f11 = this.f17092n2;
            d4 d4Var = this.L1;
            if (f11 > 0.0f && !d4Var.f16967f) {
                c4Var.f16928l.setAlpha((int) (f11 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c4Var.f16928l);
            }
            RectF rectF = c4Var.h;
            RectF rectF2 = c4Var.f16925i;
            RectF rectF3 = c4Var.f16926j;
            rectF.set(this.Y1.getX(), this.Y1.getY() + this.Y1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.Y1.getX() + this.Y1.getMeasuredWidth(), this.Y1.getY() + this.Y1.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!d4Var.f16967f) {
                if (this.P2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.Q2 && this.A1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (a3Var != null && a3Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + a3Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                o1 o1Var = this.X1;
                if (o1Var != null && o1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.Y1.getY() + this.Y1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.Y1.getY() + this.Y1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.Y1.setTranslationX((1.0f - this.f17092n2) * dp);
            if (this.Y1.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f10 = ((1.0f - this.f17092n2) * (this.Y1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f10 = 0.0f;
            }
            this.Y1.getEditField().setTranslationY(e2.c.w(1.0f, this.f17092n2, -AndroidUtilities.dp(2.0f), f10));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, c4Var.h, this.f17092n2, rectF3);
            qg.b bVar = this.f17078i2;
            if (bVar != null) {
                bVar.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                bVar.p(dp3);
                bVar.setAlpha((int) ((1.0f - this.f17056a4) * (1.0f - this.f17095o2) * 255.0f * getHideInterfaceAlpha()));
                bVar.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f17092n2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
        } else if (p2Var != null && p2Var.u0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = c4Var.f16927k;
            RectF rectF5 = c4Var.f16927k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.X3;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            qg.b bVar2 = this.f17081j2;
            if (bVar2 != null) {
                bVar2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                bVar2.q(dp4, dp4, dp4, dp4);
                bVar2.setAlpha(255);
                bVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f17061c2 && this.Y1 != null) {
                view.setTranslationY(((this.Y1.getY() + this.Y1.getAnimatedTop()) + (-qk0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f17096o3) {
                    view.setTranslationY((this.L0.getY() + (a3Var.getY() + (-(qk0Var2.getMeasuredHeight() - this.f17096o3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    j3 j3Var = this.Z0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.E3) != null && !dVar.f48128n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(j3Var.getX(), j3Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.f17135z2).storiesEnabled()) {
            return;
        }
        File h = this.L1.h();
        if (h != null && h.exists()) {
            x2 x2Var = this.W2;
            if (x2Var != null) {
                x2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new w1(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f17122w1;
    }

    public long getCurrentPeer() {
        return this.f17130y1;
    }

    public int getListPosition() {
        return this.I1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.Z0;
        Bitmap createBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.G1;
    }

    public t6 getStoriesController() {
        return MessagesController.getInstance(this.f17135z2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.A2, this.f17106s1.size()) + this.f17110t1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f17106s1;
    }

    public final void h1() {
        int i10;
        if (this.D1) {
            TextView textView = this.f17066e2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f17069f2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f17066e2;
        if (textView3 != null) {
            if (this.B1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f17069f2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f17069f2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f17122w1;
        i9 i9Var = this.G0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f17110t1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j10 = ((s6) arrayList2.get(i11)).f17737a;
                    if (((int) (j10 ^ (j10 >>> 32))) == i9Var.M0) {
                        this.G1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f17122w1.indexOf(Integer.valueOf(i9Var.M0));
            if (indexOf < 0 && !this.f17122w1.isEmpty()) {
                if (i9Var.M0 > ((Integer) this.f17122w1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (i9Var.M0 < ((Integer) l.d.i(1, this.f17122w1)).intValue()) {
                    indexOf = this.f17122w1.size() - 1;
                }
            }
            this.G1 = i10 + indexOf;
        } else {
            int i12 = i9Var.f17259b1.get(this.f17130y1, -1);
            this.G1 = i12;
            if (i12 == -1 && !i9Var.K0 && (peerStories = this.f17103r1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f17106s1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f21082id > this.f17103r1.max_read_id) {
                        this.G1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.G1 == -1) {
            this.G1 = 0;
        }
    }

    public final void j1() {
        l6 l6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f17106s1;
        arrayList.clear();
        i9 i9Var = this.G0;
        if (i9Var.K0) {
            if (!i9Var.P0) {
                arrayList.add(i9Var.Q0);
            }
        } else {
            ArrayList arrayList2 = this.f17122w1;
            int i10 = 0;
            ArrayList arrayList3 = this.f17110t1;
            if (arrayList2 != null && (l6Var = i9Var.L0) != null) {
                if (l6Var instanceof d6) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.f17135z2).getStoriesController().E(this.f17130y1);
                    String str = ((d6) i9Var.L0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            s6 s6Var = (s6) E.get(i11);
                            qh.r6 r6Var = s6Var.f17739c;
                            if (r6Var != null && !r6Var.f46008g && TextUtils.equals(r6Var.K0, str)) {
                                arrayList3.add(s6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f17122w1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f10 = i9Var.L0.f(((Integer) obj).intValue());
                    if (f10 != null && (storyItem = f10.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.L0 != null) {
                while (i10 < i9Var.L0.f17404i.size()) {
                    arrayList.add(((MessageObject) i9Var.L0.f17404i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.N0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.f17130y1) {
                    this.f17103r1 = i9Var.N0;
                } else {
                    TL_stories.PeerStories y10 = this.P1.y(this.f17130y1);
                    this.f17103r1 = y10;
                    if (y10 == null) {
                        this.f17103r1 = this.P1.z(this.f17130y1);
                    }
                }
                this.A2 = 0;
                TL_stories.PeerStories peerStories2 = this.f17103r1;
                if (peerStories2 != null) {
                    this.A2 = peerStories2.stories.size();
                    arrayList.addAll(this.f17103r1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.P1.E(this.f17130y1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.f17126x1 = getStoriesCount();
    }

    public final void k0(boolean z4) {
        f4 currentPeerView;
        z50 z50Var = this.G2;
        if (z50Var != null) {
            z50Var.U = null;
            z50Var.d(false);
        }
        long j10 = this.f17130y1;
        TL_stories.StoryItem storyItem = this.L1.f16963a;
        i9 i9Var = this.G0;
        i9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            i9.B1.remove(j10 + (j10 >> 16) + (storyItem.f21082id << 16));
        }
        this.f17070f3 = true;
        y8 y8Var = i9Var.f17279k0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z4) {
            ic I = new qc(this.Z0, this.f17129y0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new w1(this, 2));
            I.f27786r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.f17135z2).ensureMessagesLoaded(this.f17130y1, 0, null);
    }

    public final void k1(boolean z4) {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z10;
        int i12;
        boolean z11;
        d4 d4Var = this.L1;
        TL_stories.StoryItem storyItem = d4Var.f16963a;
        if (storyItem == null) {
            storyItem = d4Var.f16965c;
        }
        boolean z12 = this.A1;
        if (z12 || this.f17134z1) {
            if (storyItem != null) {
                i9 i9Var = this.G0;
                a3 a3Var = this.A0;
                if (z12) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.j6 j6Var = this.O0;
                    if (j6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z4 && this.S0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j6Var.q(num, z11, true);
                        this.S0 = true;
                    } else {
                        this.S0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.j6 j6Var2 = this.N0;
                        String num2 = Integer.toString(i13);
                        if (z4 && this.R0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var2.q(num2, z10, true);
                        this.R0 = true;
                    } else {
                        this.R0 = false;
                    }
                    float f13 = 0.0f;
                    if (!z4) {
                        org.telegram.ui.Components.z5 z5Var = this.P0;
                        if (this.R0) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        z5Var.d(f11, true);
                        org.telegram.ui.Components.z5 z5Var2 = this.Q0;
                        if (z5Var2 != null) {
                            if (this.S0) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            z5Var2.d(f12, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-this.f17130y1));
                    if ((!this.B1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.f17127x2;
                        if (i9Var.L0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.f17127x2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new oq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.f17127x2.setText(spannableStringBuilder);
                    } else {
                        this.f17127x2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = a3Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.R0) {
                        f10 = this.N0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f10 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f10);
                    ((ViewGroup.MarginLayoutParams) this.T1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + a3Var.getLayoutParams().width;
                    a3 a3Var2 = this.M0;
                    if (a3Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = a3Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.S0) {
                            f13 = this.O0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f13);
                        ((ViewGroup.MarginLayoutParams) this.T1.getLayoutParams()).rightMargin += a3Var2.getLayoutParams().width;
                        a3Var2.requestLayout();
                    }
                    this.T1.requestLayout();
                    a3Var.requestLayout();
                    this.f17131y2.setVisibility(8);
                    this.C2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = d4Var.f16963a;
                    g3 g3Var = this.f17071g1;
                    if (storyItem2 == null) {
                        g3Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < g3Var.getChildCount(); i14++) {
                        if (g3Var.getChildAt(i14) instanceof p8) {
                            ((p8) g3Var.getChildAt(i14)).c(storyItem2.views, z4);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.f17135z2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.f17131y2.b(i15, userOrChat, this.f17135z2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.f17131y2.b(i17, null, this.f17135z2);
                    }
                    this.f17131y2.a(false);
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
                    this.f17127x2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.f17131y2.setVisibility(8);
                        this.f17127x2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.f17131y2.setVisibility(0);
                        this.f17127x2.setTranslationX(AndroidUtilities.dp(10.0f) + e2.c.e(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.C2.setVisibility(0);
                } else {
                    TextView textView2 = this.f17127x2;
                    if (i9Var.L0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.f17127x2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.f17131y2.setVisibility(8);
                    this.C2.setVisibility(8);
                }
                a3Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.L0.requestLayout();
                return;
            }
            this.f17127x2.setText("");
            this.C2.setVisibility(8);
            this.f17131y2.setVisibility(8);
        }
    }

    public final void l0() {
        y6 y6Var = this.B0;
        y6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m2(0, y6Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        y6 y6Var2 = new y6(getContext(), this.f17114u1);
        this.B0 = y6Var2;
        y6Var2.setPadding(dp, dp, dp, dp);
        this.B0.setAlpha(0.0f);
        this.B0.setScaleX(0.8f);
        this.B0.setScaleY(0.8f);
        this.B0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.A0.addView(this.B0, k7.c6.e(40, 40, 3));
        this.f17093n3 = false;
    }

    public final void l1() {
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4;
        p2 p2Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i10;
        float f17;
        float f18;
        a3 a3Var;
        ImageView imageView;
        n3 n3Var;
        a3 a3Var2;
        boolean z10;
        float f19;
        qk0 qk0Var;
        float f20;
        int i11;
        float f21;
        float f22;
        float f23 = ((z8) this.N1).d.S;
        if (this.I2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.z5 z5Var = this.L2;
        z5Var.d(f10, false);
        int i12 = this.f17101q2;
        if (i12 != 0 && this.f17104r2) {
            f11 = k7.o.a(this.E2 / i12, 0.0f, 1.0f);
        } else if (this.f17107s2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        org.telegram.ui.Components.z5 z5Var2 = this.T3;
        float f24 = z5Var2.f33763c;
        org.telegram.ui.Components.z5 z5Var3 = this.U3;
        float f25 = z5Var3.f33763c;
        org.telegram.ui.Components.z5 z5Var4 = this.V3;
        float f26 = z5Var4.f33763c;
        if (this.D2) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        z5Var2.d(f12, false);
        if (!this.f17070f3) {
            p2 p2Var2 = this.Y1;
            if (p2Var2 != null && !TextUtils.isEmpty(p2Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            z5Var3.d(f22, false);
        }
        p2 p2Var3 = this.Y1;
        if (p2Var3 != null && p2Var3.f24692v3) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        z5Var4.d(f13, false);
        final p2 p2Var4 = this.Y1;
        if (p2Var4 != null) {
            f4 f4Var = p2Var4.f17623o5;
            int backgroundTop = p2Var4.getBackgroundTop();
            int i13 = p2Var4.f17620l5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (p2Var4.P1 + i13) - backgroundTop;
                p2Var4.setAnimatedTop(i14);
                f4Var.S2 = true;
                ValueAnimator valueAnimator = f4Var.f17058b2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    f4Var.f17058b2.cancel();
                }
                View view = p2Var4.C1;
                if (view != null && view.getVisibility() == 0) {
                    p2Var4.C1.setTranslationY(((1.0f - p2Var4.getTopViewEnterProgress()) * p2Var4.C1.getLayoutParams().height) + p2Var4.P1);
                }
                f4Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                f4Var.f17058b2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                p2 p2Var5 = p2Var4;
                                p2Var5.getClass();
                                p2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f4 f4Var2 = p2Var5.f17623o5;
                                f4Var2.S2 = true;
                                f4Var2.invalidate();
                                p2Var5.invalidate();
                                return;
                            default:
                                p2Var4.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                f4Var.f17058b2.addListener(new dg.l0(p2Var4, 19));
                f4Var.f17058b2.setDuration(250L);
                f4Var.f17058b2.setInterpolator(xh.n.V);
                f4Var.f17058b2.start();
                p2Var4.f17620l5 = 0;
            }
            if (p2Var4.f24631j3) {
                float scrollY = (p2Var4.f17622n5 - p2Var4.B0.getScrollY()) + (p2Var4.f17621m5 - p2Var4.B0.getMeasuredHeight());
                ff ffVar = p2Var4.B0;
                ffVar.setOffsetY(ffVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(p2Var4.B0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                p2 p2Var5 = p2Var4;
                                p2Var5.getClass();
                                p2Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f4 f4Var2 = p2Var5.f17623o5;
                                f4Var2.S2 = true;
                                f4Var2.invalidate();
                                p2Var5.invalidate();
                                return;
                            default:
                                p2Var4.B0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = p2Var4.f17619k5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                p2Var4.f17619k5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(xh.n.V);
                ofFloat2.start();
                p2Var4.f24631j3 = false;
                f4Var.l1();
            }
            p2Var4.getMeasuredHeight();
        }
        p2 p2Var5 = this.Y1;
        if (p2Var5 != null && p2Var5.t0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z11 = this.f17115u2;
        Paint paint = this.f17084k2;
        if (z11) {
            paint.setColor(i0.a.d(this.f17092n2, -14933463, org.telegram.ui.ActionBar.k6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.f17056a4) * org.telegram.messenger.y3.y(1.0f, this.f17095o2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.f17056a4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z12 = this.S2;
        i9 i9Var = this.G0;
        if (z12 || this.W3 != i9Var.f17255a0 || z5Var.f33763c != this.N2 || this.f17098p2 != this.E2 || f11 != this.f17092n2 || f23 != this.f17095o2 || f24 != z5Var2.f33763c || z4 || f26 != z5Var4.f33763c || f25 != z5Var3.f33763c) {
            this.S2 = false;
            this.f17098p2 = this.E2;
            float f27 = z5Var.f33763c;
            float f28 = this.N2;
            j3 j3Var = this.Z0;
            if (f27 != f28) {
                j3Var.invalidate();
            }
            if (f23 != 0.0f) {
                j3Var.setLayerType(2, null);
            } else {
                j3Var.setLayerType(0, null);
            }
            this.N2 = z5Var.f33763c;
            this.f17095o2 = f23;
            this.f17092n2 = f11;
            this.W3 = i9Var.f17255a0;
            float height = this.E2 - (getHeight() - j3Var.getBottom());
            if (this.Y1 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = p2Var.getHeightWithTopView() * f11;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f17086l2 - (getHeight() - j3Var.getBottom());
            p2 p2Var6 = this.Y1;
            if (p2Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = p2Var6.getHeightWithTopView();
                if (this.f17107s2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            p2 p2Var7 = this.Y1;
            if (p2Var7 != null) {
                if (this.a2 != null) {
                    ImageView suggestButton = p2Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.a2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.a2.setTranslationY(-((getHeight() - this.Y1.getY()) + AndroidUtilities.dp(6.0f)));
                }
                xt editField = this.Y1.getEditField();
                ap0 senderSelectView = this.Y1.getSenderSelectView();
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
            if (this.f17115u2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f11);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f17115u2 && !this.f17107s2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f11) + max3;
            h2 h2Var = this.I0;
            mh.d1 d1Var = h2Var.f17833c;
            h2Var.H = dp2;
            if (Math.abs(h2Var.I - max4) > 0.1f) {
                h2Var.I = max4;
                f18 = 0.8f;
                f17 = 8.0f;
                d1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - d1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!d1Var.canScrollVertically(1)) {
                    h2Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 8.0f;
                f18 = 0.8f;
            }
            h2Var.setTranslationY(-h2Var.H);
            h2Var.invalidate();
            qh.j3 j3Var2 = i9Var.A0;
            if (j3Var2 != null) {
                j3Var2.setKeyboardOffset(max);
            }
            qk0 qk0Var2 = this.f17061c2;
            d4 d4Var = this.L1;
            if (qk0Var2 != null) {
                if (this.f17092n2 > 0.0f && (d4Var == null || !d4Var.f16967f)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                qk0Var2.setVisibility(i11);
            }
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                a3Var = this.M0;
                imageView = this.K0;
                n3Var = this.H0;
                a3Var2 = this.A0;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && childAt != this.T1 && childAt.getTag(R.id.parent_tag) == null && childAt != n3Var.T.o(getContext())) {
                    p2 p2Var8 = this.Y1;
                    if (p2Var8 != null && childAt == p2Var8.getEmojiView()) {
                        childAt.setTranslationY(this.Y1.getEmojiView().getMeasuredHeight() - this.E2);
                    } else if (childAt instanceof m40) {
                        m40 m40Var = (m40) childAt;
                        View view2 = m40Var.f28970e;
                        if (view2 != null) {
                            m40Var.g(view2);
                        }
                    } else if (childAt != this.G2 && childAt != j3Var && childAt != imageView && childAt != this.L0 && childAt != a3Var && childAt != this.T2 && childAt != this.a2 && childAt != a3Var2 && ((qk0Var = this.f17096o3) == null || qk0Var.getReactionsWindow() == null || childAt != this.f17096o3.getReactionsWindow().f16037c)) {
                        float f29 = this.f17092n2;
                        f29 = (childAt == this.U1 || childAt == this.W1 || childAt == this.X1 || childAt == this.V1) ? 0.0f : 0.0f;
                        float f30 = 1.0f - f29;
                        float dp3 = (((((-this.H2) * f30) - (AndroidUtilities.dp(7.0f) * f29)) - this.E2) - (AndroidUtilities.dp(f17) * f30)) - (AndroidUtilities.dp(20.0f) * i9Var.f17255a0);
                        if (childAt == this.U1 || childAt == this.W1 || childAt == this.X1 || childAt == this.V1) {
                            dp3 += this.E2;
                        }
                        if (this.f17115u2) {
                            f20 = (1.0f - this.f17095o2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.Y2) {
                            dp3 = i9Var.f17255a0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f17055a3) {
                            dp3 -= this.Y1.getMeasuredHeight() - this.Y1.getAnimatedTop();
                            f20 = this.f17092n2;
                            childAt.invalidate();
                        }
                        if (childAt == this.Z1) {
                            dp3 -= this.Y1.getMeasuredHeight() - this.Y1.getAnimatedTop();
                            f20 *= this.f17092n2;
                        }
                        if (childAt == this.f17061c2) {
                            float f31 = (1.0f - z5Var3.f33763c) * (1.0f - f26) * (1.0f - z5Var2.f33763c) * this.f17092n2;
                            float f32 = f20 * f31 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f32 == 0.0f) {
                                this.f17061c2.n();
                            }
                            childAt.setAlpha(f32);
                            float f33 = (f31 * 0.2f) + f18;
                            childAt.setScaleX(f33);
                            childAt.setScaleY(f33);
                        } else {
                            childAt.setTranslationY(dp3);
                            p2 p2Var9 = this.Y1;
                            if (p2Var9 == null || childAt != p2Var9.K1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.T1) {
                    if (this.f17115u2) {
                        childAt.setAlpha((1.0f - this.f17056a4) * (1.0f - this.f17095o2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f17056a4) * hideInterfaceAlpha);
                    }
                    i15++;
                }
                i15++;
            }
            float f34 = 0.0f;
            float f35 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f17056a4) * f35);
            a3Var2.setAlpha((1.0f - this.f17056a4) * f35);
            if (a3Var != null) {
                a3Var.setAlpha((1.0f - this.f17056a4) * f35);
            }
            for (int i16 = 0; i16 < j3Var.getChildCount(); i16++) {
                View childAt2 = j3Var.getChildAt(i16);
                if (childAt2 != null && childAt2 != this.J0) {
                    b4 b4Var = this.l1;
                    eh.d dVar = this.f17117v0;
                    if (childAt2 != b4Var && childAt2 != this.f17109t0 && childAt2 != this.f17113u0 && childAt2 != dVar && childAt2 != this.T1 && childAt2 != n3Var && childAt2 != this.f17133z0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == dVar) {
                            f19 = this.f17059b3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == n3Var) {
                            childAt2.setAlpha((1.0f - this.f17056a4) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f17056a4) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.Y1 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!d4Var.f16967f) {
                    if (this.P2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.Q2 && this.A1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (a3Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + a3Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    o1 o1Var = this.X1;
                    if (o1Var != null && o1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f34 = dp5;
                }
                p2 p2Var10 = this.Y1;
                float f36 = -AndroidUtilities.dp(10.0f);
                float f37 = -(AndroidUtilities.dp(10.0f) + dp4 + f34);
                float f38 = this.f17092n2;
                if ((this.P2 || this.B1) && !d4Var.f16967f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p2Var10.h1(f36, f37, f38, z10);
                if (this.Y1.getEmojiView() != null) {
                    this.Y1.getEmojiView().setAlpha(this.f17092n2);
                }
            }
        }
    }

    public final void m0(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.Z3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.f17056a4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.Z3 = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 2));
        this.Z3.addListener(new k2(this, z4, 1));
        this.Z3.setDuration(420L);
        this.Z3.setInterpolator(pr.h);
        this.Z3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.f17135z2).isFrozen()) {
            org.telegram.ui.c.b(this.f17135z2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f17076h3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 0, this.f17129y0);
            d2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            d2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            mh.m5 m5Var = new mh.m5(runnable, 9);
            d2Var.f21250i0 = string;
            d2Var.f21251j0 = m5Var;
            String string2 = LocaleController.getString(R.string.Cancel);
            mh.c3 c3Var = new mh.c3(12);
            d2Var.f21252k0 = string2;
            d2Var.f21253l0 = c3Var;
            d2Var.show();
            return;
        }
        runnable.run();
    }

    public final void o0(int i10) {
        boolean z4;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.B2 = false;
        this.S2 = true;
        this.f17132y3 = false;
        this.A1 = false;
        this.B1 = false;
        long j10 = this.f17130y1;
        b4 b4Var = this.l1;
        org.telegram.ui.Components.z8 z8Var = this.f17083k1;
        if (j10 >= 0) {
            if (j10 == UserConfig.getInstance(this.f17135z2).getClientUserId()) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f17134z1 = z13;
            TLRPC.User user = MessagesController.getInstance(this.f17135z2).getUser(Long.valueOf(this.f17130y1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.f17135z2).isUserContactBlocked(this.f17130y1);
            if (!UserConfig.getInstance(this.f17135z2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.C1 = z14;
            this.E1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            z8Var.m(this.f17135z2, user);
            b4Var.f16888a.getImageReceiver().setForUserOrChat(user, z8Var);
            W0(this.f17130y1, true, false);
        } else {
            this.f17134z1 = false;
            this.A1 = true;
            if (this.P1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.f17132y3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-this.f17130y1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.B1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.f17135z2).getChatFull(-this.f17130y1) == null) {
                MessagesStorage.getInstance(this.f17135z2).loadChatInfo(-this.f17130y1, true, new CountDownLatch(1), false, false);
            }
            if (this.B1 && !ChatObject.canSendPlain(chat)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.C1 = z4;
            this.E1 = MessagesController.getInstance(this.f17135z2).getSendPaidMessagesStars(this.f17130y1);
            z8Var.k(this.f17135z2, chat);
            b4Var.f16888a.getImageReceiver().setForUserOrChat(chat, z8Var);
            W0(this.f17130y1, true, false);
        }
        if (this.H1 && (this.f17134z1 || this.A1)) {
            t6 t6Var = this.P1;
            long j11 = this.f17130y1;
            a0.h hVar = t6Var.f17782m;
            r9 r9Var = (r9) hVar.f(j11);
            if (r9Var == null) {
                r9Var = new r9(t6Var.f17772a, j11, t6Var);
                hVar.k(r9Var, j11);
            }
            r9Var.b(true);
        }
        j1();
        this.G1 = i10;
        if (i10 < 0) {
            this.G1 = 0;
        }
        this.T0 = 0L;
        this.V0 = false;
        this.G3 = null;
        this.H3 = null;
        boolean z15 = this.A1;
        j3 j3Var = this.Z0;
        i9 i9Var = this.G0;
        int i13 = 8;
        d4 d4Var = this.L1;
        if (z15) {
            B0();
            if (this.Y1 == null && (this.B1 || d4Var.f16967f)) {
                v0();
            }
            if (this.Y1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.f17135z2).getChat(Long.valueOf(-this.f17130y1));
                p2 p2Var = this.Y1;
                if (d4Var.f16967f || (!I0() && this.B1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i13 = 0;
                }
                p2Var.setVisibility(i13);
                p2 p2Var2 = this.Y1;
                boolean z16 = d4Var.f16967f;
                D0(true);
                p2Var2.i1(z16);
                p2 p2Var3 = this.Y1;
                if (d4Var.f16967f && !D0(true) && (this.f17107s2 || this.Y1.T0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p2Var3.o1(z12, true);
                xt editField = this.Y1.getEditField();
                long j12 = this.f17130y1;
                TL_stories.StoryItem storyItem = d4Var.f16963a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.Y1.b1(this.f17135z2, this.f17130y1);
                this.Y1.K1(chat2, null);
            }
            org.telegram.ui.Components.j6 j6Var = this.N0;
            org.telegram.ui.ActionBar.g6 g6Var = this.f17129y0;
            if (j6Var == null) {
                org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, false, false, false);
                this.N0 = j6Var2;
                a3 a3Var = this.A0;
                j6Var2.setCallback(a3Var);
                this.N0.r(g6Var.B0(org.telegram.ui.ActionBar.k6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.z5(a3Var);
            }
            a3 a3Var2 = this.M0;
            if (a3Var2 != null && this.O0 == null) {
                org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(false, false, false, false);
                this.O0 = j6Var3;
                j6Var3.setCallback(a3Var2);
                this.O0.r(g6Var.B0(org.telegram.ui.ActionBar.k6.G6));
                this.O0.t(AndroidUtilities.dp(14.0f));
                this.Q0 = new org.telegram.ui.Components.z5(a3Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.f17126x1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.f17134z1) {
            B0();
            if (d4Var.f16967f) {
                this.T1.setVisibility(8);
                if (this.Y1 == null) {
                    v0();
                }
                this.Y1.setVisibility(0);
            } else {
                this.T1.setVisibility(0);
                p2 p2Var4 = this.Y1;
                if (p2Var4 != null) {
                    p2Var4.setVisibility(8);
                }
            }
            p2 p2Var5 = this.Y1;
            if (p2Var5 != null) {
                boolean z17 = d4Var.f16967f;
                D0(true);
                p2Var5.i1(z17);
                p2 p2Var6 = this.Y1;
                if (d4Var.f16967f && !D0(true) && (this.f17107s2 || this.Y1.T0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p2Var6.o1(z11, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f17122w1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(i9Var.M0));
                    if (indexOf < 0 && !this.f17122w1.isEmpty()) {
                        if (i9Var.M0 > ((Integer) this.f17122w1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (i9Var.M0 < ((Integer) l.d.i(1, this.f17122w1)).intValue()) {
                            indexOf = this.f17122w1.size() - 1;
                        }
                    }
                    this.G1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f17110t1.isEmpty();
                    ArrayList arrayList2 = this.f17106s1;
                    if (!isEmpty) {
                        this.G1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f21082id > this.P1.f17776f.get(this.f17130y1)) {
                                this.G1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            j3Var.invalidate();
            invalidate();
        } else {
            if (this.Y1 == null) {
                v0();
            }
            if (this.C1 && this.f17063d2 == null) {
                z0();
            }
            if (this.f17063d2 != null) {
                if (this.C1 || this.D1) {
                    h1();
                }
                LinearLayout linearLayout = this.f17063d2;
                if ((this.C1 && !d4Var.f16967f) || this.D1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            g8 g8Var = this.f17072g2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            p2 p2Var7 = this.Y1;
            if (p2Var7 != null) {
                if (!I0() && !UserObject.isService(this.f17130y1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p2Var7.setVisibility(i11);
                p2 p2Var8 = this.Y1;
                boolean z18 = d4Var.f16967f;
                D0(true);
                p2Var8.i1(z18);
                p2 p2Var9 = this.Y1;
                if (d4Var.f16967f && !D0(true) && (this.f17107s2 || this.Y1.T0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p2Var9.o1(z10, true);
                xt editField2 = this.Y1.getEditField();
                long j13 = this.f17130y1;
                TL_stories.StoryItem storyItem2 = d4Var.f16963a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.Y1.b1(this.f17135z2, this.f17130y1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.f17135z2).getUserFull(this.f17130y1);
                if (userFull != null) {
                    this.Y1.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.f17135z2).loadFullUser(MessagesController.getInstance(this.f17135z2).getUser(Long.valueOf(this.f17130y1)), this.f17123w2, false);
                }
            }
            this.f17126x1 = getStoriesCount();
            a3 a3Var3 = this.T1;
            if (a3Var3 != null) {
                a3Var3.setVisibility(8);
            }
            j3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X0 = true;
        this.f17057b1.onAttachedToWindow();
        this.f17062d1.onAttachedToWindow();
        this.f17060c1.onAttachedToWindow();
        this.f17079i3.onAttachedToWindow();
        this.f17085k3.onAttachedToWindow();
        p2 p2Var = this.Y1;
        if (p2Var != null) {
            p2Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17065e1;
            if (i10 < arrayList.size()) {
                ((ng.h0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f17135z2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X0 = false;
        this.f17057b1.onDetachedFromWindow();
        this.f17062d1.onDetachedFromWindow();
        this.f17060c1.onDetachedFromWindow();
        this.f17079i3.onDetachedFromWindow();
        this.f17085k3.onDetachedFromWindow();
        p2 p2Var = this.Y1;
        if (p2Var != null) {
            p2Var.D0();
        }
        org.telegram.ui.Components.l5 l5Var = this.f17087l3;
        if (l5Var != null) {
            l5Var.o(this);
            this.f17087l3 = null;
        }
        ng.d dVar = this.f17082j3;
        if (dVar != null) {
            dVar.d(this);
            this.f17082j3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17065e1;
            if (i10 < arrayList.size()) {
                ((ng.h0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f17135z2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f17114u1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: oh.f4.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f17092n2 = -1.0f;
        this.S2 = true;
        invalidate();
    }

    public final void p0() {
        n3 n3Var = this.H0;
        if (n3Var.T.y()) {
            n3Var.T.f(false);
        }
    }

    public final void q0() {
        if (this.H1) {
            ((z8) this.N1).d.P();
        }
    }

    public final void r0(boolean z4) {
        int i10;
        if (this.Y1 != null && this.c3 && this.X0) {
            w1 w1Var = this.M3;
            AndroidUtilities.cancelRunOnUIThread(w1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.P1.B;
            this.Y1.J(true);
            boolean z10 = this.C1;
            d4 d4Var = this.L1;
            if ((z10 && !d4Var.f16967f) || this.D1) {
                this.f17076h3 = false;
                this.Y1.setEnabled(false);
                this.Y1.j1(" ", z4);
            } else if (this.E1 > 0) {
                this.f17076h3 = false;
                this.Y1.setEnabled(true);
                this.Y1.j1(ja.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.E1, ','))), z4);
            } else {
                if (!d4Var.f16967f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.f17135z2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f17076h3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.f17135z2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.Y1.setEnabled(true);
                        if (((int) this.Y1.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.Y1.getEditField().getMeasuredWidth()) {
                            p2 p2Var = this.Y1;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            p2Var.f24596e = formatString2;
                            p2Var.f24603f = format;
                            p2Var.G1(z4);
                        } else {
                            this.Y1.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z4);
                        }
                        AndroidUtilities.runOnUIThread(w1Var, 1000L);
                        return;
                    }
                }
                this.f17076h3 = false;
                this.Y1.setEnabled(true);
                if (d4Var.f16967f) {
                    long starsPrice = this.Y1.getStarsPrice();
                    if (starsPrice > 0) {
                        this.Y1.j1(ja.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.Y1.K4), z4);
                        oq oqVar = this.Y1.K4[0];
                        if (oqVar != null) {
                            oqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.Y1.j1(LocaleController.getString(R.string.Comment), z4);
                    return;
                }
                p2 p2Var2 = this.Y1;
                if (this.B1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                p2Var2.j1(LocaleController.getString(i10), z4);
            }
        }
    }

    public final boolean s0() {
        if (this.f17099p3) {
            if (this.f17096o3.getReactionsWindow() != null) {
                if (this.f17119v2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f17096o3.getReactionsWindow().f16037c);
                    return true;
                }
                this.f17096o3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        g3 g3Var = this.f17071g1;
        if (g3Var != null) {
            qh.e3 e3Var = g3Var.f17464c;
            if (e3Var != null) {
                e3Var.e(true);
                g3Var.f17464c = null;
            }
            g3Var.f17463b = null;
            g3Var.invalidate();
            g3Var.b(false);
        }
        n3 n3Var = this.H0;
        if (n3Var.T.y()) {
            n3Var.T.f(false);
            return true;
        }
        qh.e3 e3Var2 = this.C0;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        qh.e3 e3Var3 = this.D0;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
        m40 m40Var = this.T2;
        if (m40Var != null) {
            m40Var.b(true);
        }
        y3 y3Var = this.f17100q1;
        if (y3Var != null && y3Var.f33164b) {
            y3Var.a();
            return true;
        }
        p2 p2Var = this.Y1;
        if (p2Var != null && p2Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f17129y0);
            if (this.Y1.Z0) {
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new t1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((z8) this.N1).h(alertDialog$Builder.f21168a);
            return true;
        }
        qk0 qk0Var = this.f17061c2;
        if (qk0Var != null && qk0Var.getReactionsWindow() != null && !this.f17061c2.getReactionsWindow().f16049q) {
            this.f17061c2.getReactionsWindow().d();
            return true;
        }
        p2 p2Var2 = this.Y1;
        if (p2Var2 != null && p2Var2.t0()) {
            if (this.f17119v2 > 0) {
                AndroidUtilities.hideKeyboard(this.Y1.getEmojiView());
                return true;
            }
            this.Y1.n0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            p2 p2Var3 = this.Y1;
            if (p2Var3 != null) {
                long j10 = this.f17130y1;
                TL_stories.StoryItem storyItem = this.L1.f16963a;
                Editable editText = p2Var3.getEditText();
                this.G0.getClass();
                i9.J(j10, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.Y1);
            return true;
        } else if (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            n3Var.C();
            this.f17064d3 = false;
            this.Z0.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.f17135z2 = i10;
        this.P1 = MessagesController.getInstance(i10).storiesController;
        this.f17074h1.f35904b = i10;
        qk0 qk0Var = this.f17061c2;
        if (qk0Var != null) {
            qk0Var.setCurrentAccount(i10);
            this.f17061c2.p(null, null, true);
        }
        qk0 qk0Var2 = this.f17096o3;
        if (qk0Var2 != null) {
            qk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z4) {
        T0(0L, z4);
    }

    public void setDelegate(z3 z3Var) {
        this.N1 = z3Var;
    }

    public void setIsVisible(boolean z4) {
        if (this.c3 != z4) {
            this.c3 = z4;
            if (z4) {
                this.f17057b1.setCurrentAlpha(1.0f);
                r0(false);
            }
        }
    }

    public void setLongpressed(boolean z4) {
        if (this.H1) {
            this.I2 = z4;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z4;
        if (f10 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.Y0 != z4) {
            this.Y0 = z4;
            this.Z0.invalidate();
            if (this.H1 && this.G0.f17254a && Build.VERSION.SDK_INT < 33) {
                m2.b bVar = this.S3;
                if (z4) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(bVar);
                i9 i9Var = ((z8) this.N1).d;
                i9Var.f17276i1 = true;
                i9Var.P();
            }
        }
    }

    public void setPaused(boolean z4) {
        if (this.O1 != z4) {
            this.O1 = z4;
            z2 z2Var = this.f17057b1;
            if (z4) {
                z2Var.stopAnimation();
                z2Var.setAllowStartAnimation(false);
            } else {
                z2Var.startAnimation();
                z2Var.setAllowStartAnimation(true);
            }
            this.U0 = 0L;
            this.Z0.invalidate();
        }
    }

    public final void t0() {
        if (this.F2 == null) {
            u2 u2Var = new u2(this, getContext(), this.f17129y0);
            this.F2 = u2Var;
            u2Var.W1 = new v2(this);
            u2Var.f29072g0.f0();
            u2 u2Var2 = this.F2;
            u2Var2.T = true;
            u2Var2.r1();
            u2 u2Var3 = this.F2;
            u2Var3.U = new w2(this);
            u2Var3.m1().setText(this.Y1.getFieldText());
        }
    }

    public final void u0() {
        if (this.U1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.F3);
            this.U1 = aVar;
            aVar.setOnClickListener(new y1(this, 1));
            addView(this.U1, k7.c6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f17129y0;
        p2 p2Var = new p2(this, AndroidUtilities.findActivity(getContext()), this, new n2(1, g6Var));
        this.Y1 = p2Var;
        p2Var.getEditField().useAnimatedTextDrawable();
        this.Y1.getEditField().setScaleX(0.0f);
        this.Y1.setOverrideKeyboardAnimation(true);
        this.Y1.setClipChildren(false);
        this.Y1.setDelegate(new q2(this));
        setDelegate(this.Y1);
        p2 p2Var2 = this.Y1;
        p2Var2.f24688u4 = false;
        p2Var2.f24693v4 = true;
        if (this.L1.f16967f) {
            p2Var2.V0(false, false, false);
        } else {
            p2Var2.V0(true, true, false);
        }
        this.Y1.e();
        p2 p2Var3 = this.Y1;
        p2Var3.f24699w4 = true;
        addView(p2Var3, k7.c6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.L3 != null) {
            this.Y1.P1(false);
        }
        this.Y1.C2 = this.f17123w2;
        e4 e4Var = this.J2;
        e4Var.f17026g.add(this.Z0);
        e4Var.f17026g.add(this);
        if (this.X0) {
            this.Y1.E0();
        }
        r0(false);
        if (I0()) {
            this.Y1.setVisibility(8);
        }
        xg.g gVar = new xg.g(getContext(), g6Var, this.F3, this.C3);
        this.Z1 = gVar;
        gVar.setOnClickListener(new t1(this, 1));
        addView(this.Z1, k7.c6.e(57, 300, 85));
        this.Z1.setVisibility(8);
        this.Y1.setSideButtonsForAttach(this.Z1);
        this.F0 = getChildCount();
    }

    public final void w0() {
        if (this.f17072g2 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.f17129y0);
        this.f17072g2 = g8Var;
        g8Var.setOnClickListener(new y1(this, 4));
        this.f17072g2.setAlpha(0.0f);
        this.f17072g2.setVisibility(8);
        addView(this.f17072g2, k7.c6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z4;
        if (this.X1 == null && getContext() != null) {
            o1 o1Var = new o1(getContext(), this.F3);
            this.X1 = o1Var;
            o1Var.setOnClickListener(new y1(this, 5));
            o1 o1Var2 = this.X1;
            e1 e1Var = e1.T;
            boolean z10 = true;
            if (e1Var != null && e1Var.o()) {
                z4 = true;
            } else {
                z4 = false;
            }
            o1Var2.b(z4, false);
            o1 o1Var3 = this.X1;
            e1 e1Var2 = e1.T;
            if (e1Var2 != null && !e1Var2.m()) {
                z10 = false;
            }
            o1Var3.a(z10, false);
            addView(this.X1, k7.c6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.W1 == null && getContext() != null) {
            this.V1 = new r1(getContext(), this.f17135z2);
            s1 s1Var = new s1(getContext(), this.V1, this.F3);
            this.W1 = s1Var;
            s1Var.setOnClickListener(new y1(this, 6));
            this.W1.setOnLongClickListener(new v1(this, 1));
            addView(this.W1, k7.c6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.V1, k7.c6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i10;
        if (this.f17063d2 != null) {
            return;
        }
        if (this.Y1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f17063d2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f17066e2 = textView;
        textView.setTextColor(-8026747);
        this.f17066e2.setTextSize(1, 16.0f);
        TextView textView2 = this.f17066e2;
        if (this.B1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f17069f2 = textView3;
        textView3.setTextColor(-1);
        this.f17069f2.setTextSize(1, 12.0f);
        TextView textView4 = this.f17069f2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f17069f2.setGravity(17);
        k7.e6.a(this.f17069f2);
        this.f17069f2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f17069f2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f17063d2.addView(imageView, k7.c6.t(22, 22, 16, 12, 1, 4, 0));
        this.f17063d2.addView(this.f17066e2, k7.c6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f17063d2.addView(this.f17069f2, k7.c6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.Y1.addView(this.f17063d2, k7.c6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
