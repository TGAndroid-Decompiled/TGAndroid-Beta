package jh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
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
import hh.oa;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.yd;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ou0;
import org.telegram.ui.rn;
import org.telegram.ui.rr;
import org.telegram.ui.sy;
import org.telegram.ui.ta1;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

public abstract class e4 extends zu0 implements NotificationCenter.NotificationCenterDelegate {
    public x6 A0;
    public boolean A1;
    public boolean A2;
    public org.telegram.ui.ActionBar.f1 A3;
    public lh.w3 B0;
    public boolean B1;
    public a3 B2;
    public final jg.a B3;
    public lh.w3 C0;
    public boolean C1;
    public boolean C2;
    public final og.a C3;
    public lh.w3 D0;
    public long D1;
    public float D2;
    public final og.d D3;
    public int E0;
    public final float E1;
    public t2 E2;
    public final mg.b E3;
    public final i9 F0;
    public int F1;
    public k50 F2;
    public TL_stories.TL_premium_boostsStatus F3;
    public final n3 G0;
    public boolean G1;
    public int G2;
    public ChannelBoostsController.CanApplyBoost G3;
    public final g2 H0;
    public int H1;
    public boolean H2;
    public long H3;
    public final View I0;
    public int I1;
    public final d4 I2;
    public long I3;
    public final ImageView J0;
    public int J1;
    public final AnimationNotificationsLocker J2;
    public boolean J3;
    public final LinearLayout K0;
    public final c4 K1;
    public final org.telegram.ui.Components.y5 K2;
    public TLRPC.TL_channels_sendAsPeers K3;
    public final z2 L0;
    public final com.google.firebase.messaging.m L1;
    public final org.telegram.ui.Components.y5 L2;
    public final v1 L3;
    public org.telegram.ui.Components.i6 M0;
    public y3 M1;
    public float M2;
    public int M3;
    public org.telegram.ui.Components.i6 N0;
    public boolean N1;
    public long N2;
    public final v1 N3;
    public org.telegram.ui.Components.y5 O0;
    public s6 O1;
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
    public final a8.b R3;
    public long S0;
    public z2 S1;
    public x30 S2;
    public final org.telegram.ui.Components.y5 S3;
    public long T0;
    public a T1;
    public final ou0 T2;
    public final org.telegram.ui.Components.y5 T3;
    public boolean U0;
    public q1 U1;
    public boolean U2;
    public final org.telegram.ui.Components.y5 U3;
    public boolean V0;
    public r1 V1;
    public w2 V2;
    public float V3;
    public boolean W0;
    public n1 W1;
    public FrameLayout W2;
    public final Path W3;
    public boolean X0;
    public o2 X1;
    public cg.q X2;
    public boolean X3;
    public final j3 Y0;
    public sg.g Y1;
    public boolean Y2;
    public ValueAnimator Y3;
    public final FrameLayout Z0;
    public lh.w3 Z1;
    public q2 Z2;
    public float Z3;

    public final y2 f13219a1;
    public ValueAnimator a2;
    public float a3;

    public final ImageReceiver f13220b1;

    public wj0 f13221b2;

    public boolean f13222b3;

    public final ImageReceiver f13223c1;

    public LinearLayout f13224c2;

    public boolean f13225c3;

    public final ArrayList f13226d1;

    public TextView f13227d2;

    public boolean f13228d3;

    public Runnable f13229e1;

    public TextView f13230e2;

    public boolean f13231e3;

    public final f3 f13232f1;

    public g8 f13233f2;

    public boolean f13234f3;

    public final sy f13235g1;

    public ViewPropertyAnimator f13236g2;

    public boolean f13237g3;

    public h4 f13238h1;

    public final lg.d f13239h2;

    public final ImageReceiver f13240h3;

    public float f13241i1;

    public final lg.d f13242i2;

    public ig.d f13243i3;

    public final org.telegram.ui.Components.y8 f13244j1;

    public final Paint f13245j2;

    public final ImageReceiver f13246j3;

    public final a4 f13247k1;

    public int f13248k2;

    public org.telegram.ui.Components.k5 f13249k3;
    public final h8 l1;

    public ValueAnimator f13250l2;

    public boolean f13251l3;

    public u5.k f13252m1;

    public float f13253m2;

    public boolean f13254m3;

    public int f13255n1;

    public float f13256n2;

    public wj0 f13257n3;

    public org.telegram.ui.ActionBar.f1 f13258o1;

    public float f13259o2;

    public boolean f13260o3;

    public x3 f13261p1;

    public int f13262p2;

    public float f13263p3;

    public TL_stories.PeerStories f13264q1;

    public boolean f13265q2;

    public boolean f13266q3;

    public final ArrayList f13267r1;

    public boolean f13268r2;

    public float f13269r3;

    public final ImageView f13270s0;

    public final ArrayList f13271s1;

    public boolean f13272s2;

    public int f13273s3;

    public final ImageView f13274t0;

    public final b4 f13275t1;

    public boolean f13276t2;

    public int f13277t3;

    public final ag.d f13278u0;

    public final gf.p0 f13279u1;

    public int f13280u2;

    public int f13281u3;

    public final ri0 f13282v0;

    public ArrayList f13283v1;

    public final int f13284v2;

    public v1 f13285v3;

    public final ImageView f13286w0;

    public int f13287w1;

    public TextView f13288w2;

    public float f13289w3;

    public final org.telegram.ui.ActionBar.c6 f13290x0;

    public long f13291x1;

    public fh.b f13292x2;

    public boolean f13293x3;

    public final n8 f13294y0;

    public boolean f13295y1;

    public int f13296y2;

    public rr f13297y3;

    public final z2 f13298z0;

    public boolean f13299z1;

    public int f13300z2;

    public org.telegram.ui.ActionBar.f1 f13301z3;

    public e4(Context context, final i9 i9Var, b4 b4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.X0 = true;
        this.f13226d1 = new ArrayList();
        this.f13255n1 = -5;
        this.E1 = 1.0f;
        c4 c4Var = new c4(this);
        this.K1 = c4Var;
        this.f13253m2 = -1.0f;
        this.f13256n2 = -1.0f;
        this.f13259o2 = -1.0f;
        this.f13284v2 = ConnectionsManager.generateClassGuid();
        this.K2 = new org.telegram.ui.Components.y5(this);
        this.L2 = new org.telegram.ui.Components.y5(this);
        ou0 ou0Var = new ou0();
        this.T2 = ou0Var;
        this.a3 = 1.0f;
        this.L3 = new v1(this, 4);
        this.N3 = new v1(this, 11);
        this.O3 = new ArrayList();
        this.P3 = new ArrayList();
        this.R3 = new a8.b(this, 24);
        this.S3 = new org.telegram.ui.Components.y5(this);
        this.T3 = new org.telegram.ui.Components.y5(this);
        this.U3 = new org.telegram.ui.Components.y5(this);
        this.W3 = new Path();
        ou0Var.E = new ga.c(this, 20);
        d4 d4Var = new d4();
        d4Var.f13196g = new ArrayList();
        this.I2 = d4Var;
        this.J2 = new AnimationNotificationsLocker();
        this.f13267r1 = new ArrayList();
        this.f13271s1 = new ArrayList();
        final int i10 = 0;
        y2 y2Var = new y2(this, i10);
        this.f13219a1 = y2Var;
        y2Var.setCrossfadeWithOldImage(false);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.ignoreNotifications = true;
        y2Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f13240h3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f13246j3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f13220b1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f13223c1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        y2Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f13244j1 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.F0 = i9Var;
        this.f13275t1 = b4Var;
        this.L1 = b4Var.f13087g;
        this.O1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        b4Var.f13091l.setColor(-16777216);
        this.f13245j2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.f13290x0 = c6Var;
        setClipChildren(false);
        f3 f3Var = new f3(this, context, this.Y0, c6Var, i9Var);
        this.f13232f1 = f3Var;
        mg.b bVar = new mg.b(c6Var, org.telegram.ui.ActionBar.g6.Sd, 0.8f);
        this.E3 = bVar;
        og.c cVar = new og.c();
        cVar.a(i0.b.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.D3 = null;
            this.C3 = cVar;
        } else {
            og.d dVar = new og.d(cVar);
            this.D3 = dVar;
            dVar.f(AndroidUtilities.dp(8.0f));
            this.C3 = dVar;
        }
        qg.j jVar = new qg.j(this);
        jg.a aVar = new jg.a(this.C3);
        aVar.d = jVar;
        aVar.f12943e = this;
        this.B3 = aVar;
        this.f13239h2 = aVar.c(this, bVar, false);
        lg.d dVarC = aVar.c(this, bVar, false);
        this.f13242i2 = dVarC;
        dVarC.t(AndroidUtilities.dp(32.0f));
        j3 j3Var = new j3(this, context, b4Var, i9Var);
        this.Y0 = j3Var;
        j3Var.setClipChildren(false);
        this.f13235g1 = new sy(this.f13296y2, j3Var);
        j3Var.addView(f3Var, h7.z5.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext(), i9Var.f13515y, i9Var, c6Var);
        this.G0 = n3Var;
        n3Var.U.setOnClickListener(new x1(this, 10));
        ImageView imageView = new ImageView(context);
        this.J0 = imageView;
        imageView.setImageDrawable(b4Var.f13092m);
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new x1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        h7.b6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(b4Var.f13093n);
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        z2 z2Var = new z2(this, getContext(), 1);
        this.L0 = z2Var;
        org.telegram.ui.Components.i6 i6Var = this.N0;
        if (i6Var != null) {
            i6Var.setCallback(z2Var);
        }
        z2Var.setWillNotDraw(false);
        z2Var.setOnClickListener(new x1(this, 12));
        z2 z2Var2 = new z2(this, getContext(), 2);
        this.f13298z0 = z2Var2;
        org.telegram.ui.Components.i6 i6Var2 = this.M0;
        if (i6Var2 != null) {
            i6Var2.setCallback(z2Var2);
        }
        z2Var2.setWillNotDraw(false);
        z2Var2.setOnClickListener(new x1(this, 13));
        z2Var2.setOnLongClickListener(new f2(i10, this, i9Var));
        x6 x6Var = new x6(context, b4Var);
        this.A0 = x6Var;
        x6Var.setPadding(iDp, iDp, iDp, iDp);
        z2Var2.addView(this.A0, h7.z5.e(40, 40, 3));
        z2Var.addView(imageView2, h7.z5.e(40, 40, 3));
        h7.b6.b(z2Var2, 0.3f, 5.0f);
        h7.b6.b(z2Var, 0.3f, 5.0f);
        y2Var.setAllowLoadingOnAttachedOnly(true);
        y2Var.setParentView(j3Var);
        gf.p0 p0Var = new gf.p0(10);
        this.f13279u1 = p0Var;
        j3Var.setOutlineProvider(p0Var);
        j3Var.setClipToOutline(true);
        addView(j3Var);
        a4 a4Var = new a4(context, c4Var);
        this.f13247k1 = a4Var;
        a4Var.setOnClickListener(new View.OnClickListener(this) {

            public final e4 f13991b;

            {
                this.f13991b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e4 e4Var = this.f13991b;
                        long j10 = UserConfig.getInstance(e4Var.f13296y2).clientUserId;
                        long j11 = e4Var.f13291x1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle bundleG = a9.p.g(1, "type");
                            bundleG.putLong("dialog_id", e4Var.f13291x1);
                            i9Var2.H(new o90(bundleG, null));
                        } else if (j11 <= 0) {
                            i9Var2.H(rn.R9(j11));
                        } else {
                            i9Var2.H(ProfileActivity.m4(j11));
                        }
                        break;
                    default:
                        e4 e4Var2 = this.f13991b;
                        if (!e4Var2.K1.j()) {
                            e4Var2.c1(true);
                        } else {
                            i9Var.O();
                            if (!i9.f13463z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e4Var2.f13278u0.setContentDescription(LocaleController.getString(!i9.f13463z1 ? R.string.Mute : R.string.Unmute));
                        }
                        break;
                }
            }
        });
        j3Var.addView(a4Var, h7.z5.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
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
        linearLayout.addView(imageView, h7.z5.q(40, 40, 5));
        linearLayout.addView(z2Var, h7.z5.q(40, 40, 5));
        linearLayout.addView(z2Var2, h7.z5.q(40, 40, 5));
        addView(linearLayout, h7.z5.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f13270s0 = imageView3;
        imageView3.setImageDrawable(b4Var.f13096q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        j3Var.addView(imageView3, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f13274t0 = imageView4;
        imageView4.setImageDrawable(b4Var.f13097r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        j3Var.addView(imageView4, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new ag.w0(i9Var, 22));
        imageView3.setOnClickListener(new b0(this, c6Var, i9Var, context, b4Var, 1));
        ag.d dVar2 = new ag.d(context, 2);
        this.f13278u0 = dVar2;
        j3Var.addView(dVar2, h7.z5.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ri0 ri0Var = new ri0(context);
        this.f13282v0 = ri0Var;
        ri0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        dVar2.addView(ri0Var);
        ImageView imageView5 = new ImageView(context);
        this.f13286w0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(b4Var.f13099t);
        dVar2.addView(imageView5);
        imageView5.setVisibility(8);
        n8 n8Var = new n8(context);
        this.f13294y0 = n8Var;
        n8Var.setOnClickListener(new x1(this, 2));
        j3Var.addView(n8Var, h7.z5.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i11 = 1;
        dVar2.setOnClickListener(new View.OnClickListener(this) {

            public final e4 f13991b;

            {
                this.f13991b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e4 e4Var = this.f13991b;
                        long j10 = UserConfig.getInstance(e4Var.f13296y2).clientUserId;
                        long j11 = e4Var.f13291x1;
                        i9 i9Var2 = i9Var;
                        if (j10 == j11) {
                            Bundle bundleG = a9.p.g(1, "type");
                            bundleG.putLong("dialog_id", e4Var.f13291x1);
                            i9Var2.H(new o90(bundleG, null));
                        } else if (j11 <= 0) {
                            i9Var2.H(rn.R9(j11));
                        } else {
                            i9Var2.H(ProfileActivity.m4(j11));
                        }
                        break;
                    default:
                        e4 e4Var2 = this.f13991b;
                        if (!e4Var2.K1.j()) {
                            e4Var2.c1(true);
                        } else {
                            i9Var.O();
                            if (!i9.f13463z1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            e4Var2.f13278u0.setContentDescription(LocaleController.getString(!i9.f13463z1 ? R.string.Mute : R.string.Unmute));
                        }
                        break;
                }
            }
        });
        this.l1 = new h8(this, b4Var);
        j3Var.addView(n3Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.I0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        g2 g2Var = new g2(this, context, i9Var, i9Var.v, view, frameLayout, i9Var);
        this.H0 = g2Var;
        j3Var.addView(view, h7.z5.e(-1, 200, 87));
        j3Var.addView(g2Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        j3Var.addView(frameLayout, h7.z5.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int iDp2 = AndroidUtilities.dp(20.0f);
        int iK = i0.b.k(-1, 100);
        dVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK, iK));
        int iDp3 = AndroidUtilities.dp(20.0f);
        int iK2 = i0.b.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, 0, iK2, iK2));
        int iDp4 = AndroidUtilities.dp(20.0f);
        int iK3 = i0.b.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp4, iDp4, iDp4, iDp4, 0, iK3, iK3));
        int iDp5 = AndroidUtilities.dp(20.0f);
        int iK4 = i0.b.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp5, iDp5, iDp5, iDp5, 0, iK4, iK4));
        int iDp6 = AndroidUtilities.dp(20.0f);
        int iK5 = i0.b.k(-1, 100);
        z2Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp6, iDp6, iDp6, iDp6, 0, iK5, iK5));
        int iDp7 = AndroidUtilities.dp(20.0f);
        int iK6 = i0.b.k(-1, 100);
        z2Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp7, iDp7, iDp7, iDp7, 0, iK6, iK6));
        t9 t9Var = n3Var.S;
        View viewO = t9Var.o(context);
        if (viewO != null) {
            AndroidUtilities.removeFromParent(viewO);
            addView(viewO);
        }
        t9Var.D = new h2(this, 0);
        t9Var.T(this);
    }

    public static void V0(r6 r6Var, ImageReceiver imageReceiver, String str) {
        if (r6Var.f13912s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f13909f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(r6Var.f13908e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(e4 e4Var, ValueAnimator valueAnimator) {
        n8 n8Var = e4Var.f13294y0;
        e4Var.Z3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a4 a4Var = e4Var.f13247k1;
        a4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        a4Var.setAlpha(1.0f - e4Var.Z3);
        ImageView imageView = e4Var.f13270s0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        imageView.setAlpha(1.0f - e4Var.Z3);
        ImageView imageView2 = e4Var.f13274t0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        imageView2.setAlpha(1.0f - e4Var.Z3);
        ag.d dVar = e4Var.f13278u0;
        dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
        dVar.setAlpha((1.0f - e4Var.Z3) * e4Var.a3);
        z2 z2Var = e4Var.S1;
        if (z2Var != null) {
            z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * e4Var.Z3);
            e4Var.S1.setAlpha(1.0f - e4Var.Z3);
        }
        if (n8Var != null) {
            n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var.Z3);
            n8Var.setAlpha(1.0f - e4Var.Z3);
        }
        e4Var.G0.setAlpha(1.0f - e4Var.Z3);
        y3 y3Var = e4Var.M1;
        float f10 = y3Var == null ? 0.0f : ((z8) y3Var).d.R;
        float hideInterfaceAlpha = e4Var.getHideInterfaceAlpha();
        z2 z2Var2 = e4Var.f13298z0;
        if (z2Var2 != null) {
            z2Var2.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        ImageView imageView3 = e4Var.J0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        z2 z2Var3 = e4Var.L0;
        if (z2Var3 != null) {
            z2Var3.setAlpha((1.0f - e4Var.Z3) * (1.0f - f10) * hideInterfaceAlpha);
        }
        o2 o2Var = e4Var.X1;
        if (o2Var != null) {
            o2Var.setAlpha(1.0f - e4Var.Z3);
            e4Var.invalidate();
        }
        e4Var.Y0.invalidate();
    }

    public static void a0(e4 e4Var, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = e4Var.f13301z3;
        if (f1Var == null || e4Var.f13297y3 == null || f1Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            if (Math.abs(i9.f13461x1 - 0.2f) < 0.05f) {
                e4Var.f13301z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(i9.f13461x1 - 0.5f) < 0.05f) {
                e4Var.f13301z3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(i9.f13461x1 - 1.0f) < 0.05f) {
                e4Var.f13301z3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(i9.f13461x1 - 1.5f) < 0.05f) {
                e4Var.f13301z3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(i9.f13461x1 - 2.0f) < 0.05f) {
                e4Var.f13301z3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                e4Var.f13301z3.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, af.g.a(i9.f13461x1) + "x"));
            }
        }
        e4Var.f13297y3.a(i9.f13461x1, z10);
    }

    public static void b0(e4 e4Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (e4Var.I0() || e4Var.K1.f13145f) {
            return;
        }
        if (UserConfig.getInstance(e4Var.f13296y2).isPremium()) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e4Var.f13290x0).setOnClickListener(new x1(e4Var, 8));
            return;
        }
        Drawable drawable = e4Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        i2 i2Var = new i2(e4Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
        org.telegram.ui.ActionBar.f1 f1VarC = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, e4Var.f13290x0);
        f1VarC.setOnClickListener(new x1(e4Var, 9));
        f1VarC.setIcon(i2Var);
    }

    public static void d0(e4 e4Var) {
        c4 c4Var = e4Var.K1;
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if ((storyItem == null && c4Var.f13142b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File fileH = c4Var.h();
        boolean z10 = c4Var.f13144e;
        if (fileH == null || !fileH.exists()) {
            e4Var.a1();
            return;
        }
        MediaController.saveFile(fileH.toString(), e4Var.getContext(), z10 ? 1 : 0, null, null, new hh.o6(1, e4Var, z10));
    }

    public static void e0(e4 e4Var, long j10) {
        String str;
        boolean z10;
        TLObject tLObject;
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(j10));
            str = user.first_name;
            z10 = user.stories_hidden;
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(e4Var.f13296y2).getChat(Long.valueOf(-j10));
            str = chat.title;
            z10 = chat.stories_hidden;
            tLObject = chat;
        }
        AndroidUtilities.runOnUIThread(new hh.i(e4Var, MessagesController.getInstance(e4Var.f13296y2), j10, !z10, str, tLObject), 200L);
    }

    public static void f0(e4 e4Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e4Var.getContext(), 0, e4Var.f13290x0);
        alertDialog$Builder.f22702a.N = LocaleController.getString(e4Var.I0() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(e4Var.I0() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new s1(e4Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia.l(16));
        z8 z8Var = (z8) e4Var.M1;
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        z8Var.h(b2Var);
        b2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.f13296y2);
    }

    public float getHideInterfaceAlpha() {
        float f10 = 1.0f - this.K2.f34812c;
        k5 k5Var = this.F0.f13511w;
        return (1.0f - (k5Var == null ? 0.0f : k5Var.f13581f)) * f10;
    }

    public long getMessageMinPrice() {
        i9 i9Var;
        if (!this.K1.f13145f || (i9Var = this.F0) == null || i9Var.f13512w0 == null || D0(true)) {
            return 0L;
        }
        return i9Var.f13512w0.j();
    }

    public static void h0(e4 e4Var) {
        org.telegram.ui.ActionBar.c6 c6Var = e4Var.f13290x0;
        j3 j3Var = e4Var.Y0;
        if (e4Var.C1) {
            return;
        }
        int i10 = 1;
        if (!e4Var.A1) {
            o2 o2Var = e4Var.X1;
            int i11 = -e4Var.f13255n1;
            e4Var.f13255n1 = i11;
            AndroidUtilities.shakeViewSpring(o2Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            String userName = e4Var.f13291x1 >= 0 ? UserObject.getUserName(MessagesController.getInstance(e4Var.f13296y2).getUser(Long.valueOf(e4Var.f13291x1))) : "";
            (MessagesController.getInstance(e4Var.f13296y2).premiumFeaturesBlocked() ? new mc(j3Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : new mc(j3Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new v1(e4Var, 5))).j();
            return;
        }
        if (e4Var.F3 != null && e4Var.G3 != null) {
            ag.i1.C1(new ag.r2(e4Var, 4), e4Var.F3, e4Var.G3, e4Var.f13291x1, true);
            return;
        }
        i9 i9Var = e4Var.F0;
        if (i9Var != null) {
            i9Var.f13482g1 = true;
            i9Var.P();
        }
        MessagesController.getInstance(e4Var.f13296y2).getBoostsController().getBoostsStats(e4Var.f13291x1, new ig.i(e4Var, i10));
    }

    public static void j0(e4 e4Var) {
        c4 c4Var = e4Var.K1;
        if (c4Var.f13141a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f22622id = c4Var.f13141a.f22617id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(e4Var.f13296y2).getInputPeer(e4Var.f13291x1);
        ConnectionsManager.getInstance(e4Var.f13296y2).sendRequest(tL_stories_exportStoryLink, new x2());
    }

    public final void A0() {
        if (this.X2 != null) {
            return;
        }
        cg.q qVar = new cg.q(getContext(), 2);
        this.X2 = qVar;
        qVar.setTextSize(1, 14.0f);
        this.X2.setTextColor(i0.b.d(0.5f, -16777216, -1));
        this.X2.setGravity(19);
        this.X2.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.X2, h7.z5.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.S1 != null) {
            return;
        }
        z2 z2Var = new z2(this, getContext(), 0);
        this.S1 = z2Var;
        z2Var.setClickable(true);
        addView(this.S1, h7.z5.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        a3 a3Var = new a3(this, getContext());
        this.B2 = a3Var;
        a3Var.setOnClickListener(new x1(this, 0));
        this.S1.addView(this.B2, h7.z5.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        fh.b bVar = new fh.b(1, getContext(), false);
        this.f13292x2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.S1.addView(this.f13292x2, h7.z5.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f13288w2 = textView;
        textView.setTextSize(1, 14.0f);
        this.f13288w2.setTextColor(-1);
        this.S1.addView(this.f13288w2, h7.z5.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f13275t1.f13098s);
        a3 a3Var2 = this.B2;
        int iDp = AndroidUtilities.dp(15.0f);
        int iK = i0.b.k(-1, 120);
        a3Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.M(i0.b.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f13290x0;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        h7.b6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int iDp = AndroidUtilities.dp(8.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iK, iK));
        textView2.setOnClickListener(new x1(this, 3));
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        linearLayout.addView(textView2, h7.z5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, h7.z5.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.Y0.addView(frameLayout);
        this.W2 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d1 d1Var;
        TLRPC.Peer peerI;
        d1 d1Var2;
        long clientUserId = UserConfig.getInstance(this.f13296y2).getClientUserId();
        long j10 = this.f13291x1;
        i9 i9Var = this.F0;
        if (j10 >= 0 || (d1Var2 = i9Var.f13512w0) == null) {
            if (j10 < 0 || i9Var == null || (d1Var = i9Var.f13512w0) == null || !d1Var.l()) {
                return false;
            }
            return !z10 || (peerI = i9Var.f13512w0.i()) == null || this.f13291x1 == DialogObject.getPeerDialogId(peerI) || DialogObject.getPeerDialogId(peerI) == clientUserId || this.f13291x1 == clientUserId;
        }
        if (!z10) {
            return false;
        }
        TLRPC.Peer peerI2 = d1Var2.i();
        TLRPC.Chat chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
        if (i9Var.f13512w0.l() || ChatObject.canManageCalls(chat)) {
            return peerI2 == null || this.f13291x1 == DialogObject.getPeerDialogId(peerI2) || DialogObject.getPeerDialogId(peerI2) == UserConfig.getInstance(this.f13296y2).getClientUserId();
        }
        return false;
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        d4 d4Var = this.I2;
        c5.c cVar = d4Var.d;
        if (cVar != null && d4Var.f13193c != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(d4Var.f13193c, bitmapCreateBitmap);
            }
            if (bitmapCreateBitmap != null) {
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (cVar != null && (textureView = d4Var.f13194e) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        j3 j3Var = this.Y0;
        canvas.scale(i10 / j3Var.getMeasuredWidth(), i11 / j3Var.getMeasuredHeight());
        this.f13219a1.draw(canvas);
        canvas.restore();
    }

    public final void F0(lh.o9 o9Var, TL_stories.StoryItem storyItem) {
        y3 y3Var = this.M1;
        lh.q9 q9Var = new lh.q9(getContext(), storyItem.pinned ? Integer.MAX_VALUE : storyItem.expire_date - storyItem.date, this.f13290x0);
        q9Var.q1(o9Var);
        lh.h1 h1Var = q9Var.f16593b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof lh.k9) {
                    ((lh.k9) view).e(false);
                }
            }
        }
        q9Var.k1(true);
        q9Var.P = new z1(0, this, storyItem);
        ((z8) y3Var).h(q9Var);
    }

    public final boolean G0(ViewGroup viewGroup, float f10, float f11, boolean z10) {
        lh.w3 w3Var;
        o2 o2Var;
        d4 d4Var;
        c5.c cVar;
        if (viewGroup != null) {
            lh.w3 w3Var2 = this.B0;
            if ((w3Var2 == null || !w3Var2.R) && ((w3Var = this.C0) == null || !w3Var.R)) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        n3 n3Var = this.G0;
                        if (childAt == n3Var) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f10, (int) f11)) {
                                float top = f11 - childAt.getTop();
                                z7 z7Var = n3Var.U;
                                if (z7Var.f14200w == 1.0f && !n3Var.f13059o0) {
                                    if (top > z7Var.getTranslationY() + (n3Var.f13058n0.getTop() - n3Var.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.Y0 || (d4Var = this.I2) == null || (cVar = d4Var.d) == null || !G0(cVar, f10 - childAt.getX(), f11 - childAt.getY(), z10)) && (!childAt.isClickable() || !rect2.contains((int) f10, (int) f11))) {
                            f3 f3Var = this.f13232f1;
                            if (childAt == f3Var && f3Var.f13659b == null && (f10 < AndroidUtilities.dp(60.0f) || f10 > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                Matrix matrix = f3Var.f13661e;
                                float[] fArr = f3Var.f13662f;
                                for (int i11 = 0; i11 < f3Var.getChildCount(); i11++) {
                                    View childAt2 = f3Var.getChildAt(i11);
                                    if (childAt2 != f3Var.d && (childAt2 instanceof p8)) {
                                        childAt2.getMatrix().invert(matrix);
                                        fArr[0] = f10;
                                        fArr[1] = f11;
                                        matrix.mapPoints(fArr);
                                        if (fArr[0] < childAt2.getLeft() || fArr[0] > childAt2.getRight() || fArr[1] < childAt2.getTop() || fArr[1] > childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                g2 g2Var = this.H0;
                                if (childAt == g2Var) {
                                    ta1 ta1Var = g2Var.f14015f;
                                    hh.f1 f1Var = g2Var.f14012c;
                                    ta1 ta1Var2 = g2Var.f14015f;
                                    ta1Var.getHitRect(rect2);
                                    if (!rect2.contains((int) ((f10 - g2Var.getX()) - ta1Var2.getX()), (int) ((f11 - g2Var.getY()) - ta1Var2.getY()))) {
                                        if (g2Var.f14011b0) {
                                            continue;
                                        } else if (!this.f13268r2) {
                                            if (f11 > g2Var.s() + g2Var.getY() || f1Var.E(f10, (f11 - g2Var.getY()) - f1Var.getY()) != null) {
                                            }
                                        }
                                    }
                                } else if ((!this.f13268r2 || childAt != this.X1 || f11 <= rect2.top) && ((z10 || !rect2.contains((int) f10, (int) f11) || (((!childAt.isClickable() && childAt != this.f13221b2) || !childAt.isEnabled()) && ((o2Var = this.X1) == null || childAt != o2Var.getRecordCircle()))) && (!childAt.isEnabled() || !(childAt instanceof ViewGroup) || !G0((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), z10)))) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x8 = getX();
        j3 j3Var = this.Y0;
        float x10 = view.getX() + j3Var.getX() + x8;
        float y10 = view.getY() + j3Var.getY() + getY();
        return motionEvent.getX() >= x10 && motionEvent.getX() <= x10 + ((float) view.getWidth()) && motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + ((float) view.getHeight());
    }

    public final boolean I0() {
        j6 j6Var;
        i9 i9Var = this.F0;
        return (i9Var == null || (j6Var = i9Var.K0) == null || j6Var.f13537e != 4) ? false : true;
    }

    public final boolean J0() {
        TLRPC.User user;
        return I0() && (user = MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(this.F0.K0.d))) != null && user.bot && user.bot_can_edit;
    }

    public abstract boolean K0();

    public final void L0(ig.q0 q0Var) {
        boolean z10;
        TLRPC.Reaction reaction;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z11 = reaction2 != null;
        if (reaction2 != null && q0Var == null) {
            l0();
            this.O1.g0(this.f13291x1, c4Var.f13141a, null);
        } else if (q0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f13296y2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f13251l3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String strA = ig.m0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f13240h3;
                imageReceiver.setImage(forDocument, strA, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                this.f13254m3 = true;
                this.O1.g0(this.f13291x1, c4Var.f13141a, ig.q0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.O1.g0(this.f13291x1, c4Var.f13141a, q0Var);
        }
        TL_stories.StoryItem storyItem2 = c4Var.f13141a;
        z2 z2Var = this.f13298z0;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.A0.setReaction(null);
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z10 = false;
        } else {
            z11 = !z11;
            this.A0.setReaction(ig.q0.d(reaction));
            z2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z10 = true;
        }
        if (this.f13299z1 && z11) {
            TL_stories.StoryItem storyItem3 = c4Var.f13141a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = c4Var.f13141a.views;
            int i10 = storyViews.reactions_count + (z10 ? 1 : -1);
            storyViews.reactions_count = i10;
            if (i10 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = c4Var.f13141a;
        ig.s0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d1 d1Var;
        if (this.K3 != null) {
            return;
        }
        i9 i9Var = this.F0;
        if (i9Var != null && (d1Var = i9Var.f13512w0) != null) {
            TLRPC.GroupCall groupCall = d1Var.v;
            if (groupCall == null ? false : !groupCall.messages_enabled) {
                return;
            }
        }
        TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.f13296y2).getSendAsPeers(this.f13291x1, true);
        this.K3 = sendAsPeers;
        o2 o2Var = this.X1;
        if (o2Var == null || sendAsPeers == null) {
            return;
        }
        o2Var.O1(true);
    }

    public final boolean N0() {
        o2 o2Var = this.X1;
        if (o2Var == null) {
            return false;
        }
        boolean z10 = o2Var.f26185u2;
        if (z10) {
            o2Var.r1();
        }
        AndroidUtilities.runOnUIThread(new v1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        int length;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.X1.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.f13296y2).getClientUserId();
        TLRPC.Peer peerI = this.F0.f13512w0.i();
        if (peerI != null) {
            clientUserId = DialogObject.getPeerDialogId(peerI);
        }
        Context context = getContext();
        final int i10 = this.f13296y2;
        String shortName = DialogObject.getShortName(i10, this.f13291x1);
        long messageMinPrice = getMessageMinPrice();
        long j10 = this.H3;
        ag.n0 n0Var = new ag.n0(this, 20);
        b bVar = new b();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, bVar, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i10).starsGroupcallMessageLimits;
        CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (textWithEntities2 instanceof Spannable) {
            Spannable spannable = (Spannable) textWithEntities2;
            charSequence = textWithEntities2;
            length = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = textWithEntities2;
            length = 0;
        }
        int iMax = (int) Math.max(messageMinPrice, j10 <= 0 ? 100L : j10);
        int length2 = (iArr.length / 7) - 1;
        while (length2 >= 0) {
            int i11 = length2 * 7;
            int i12 = iArr[i11];
            int[] iArr2 = iArr;
            int i13 = iArr2[i11 + 2];
            if (length <= iArr2[i11 + 3] && charSequence.length() <= i13) {
                iMax = Math.max(iMax, i12);
                break;
            } else {
                length2--;
                iArr = iArr2;
            }
        }
        final long[] jArr = {iMax};
        final cq[] cqVarArr = new cq[1];
        final lh.d dVar = new lh.d(context, null, true);
        final s0 s0Var = new s0();
        s0Var.f13931c = clientUserId;
        s0Var.f13933f = textWithEntities;
        s0Var.f13934g = jArr[0];
        final n0 n0Var2 = new n0(i10, context, true);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        final ag.p1 p1Var = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        linearLayoutG.addView(p1Var, h7.z5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final ag.p1 p1Var2 = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        linearLayoutG.addView(p1Var2, h7.z5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final ag.p1 p1Var3 = new ag.p1(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        linearLayoutG.addView(p1Var3, h7.z5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final r rVar = new r(context, bVar, callbackArr);
        final boolean[] zArr = {true};
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long jIntValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = jIntValue;
                dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(jIntValue, ',')), cqVarArr), true, true);
                long j11 = jArr2[0];
                s0 s0Var2 = s0Var;
                s0Var2.f13934g = j11;
                n0Var2.set(s0Var2);
                int iIntValue = num.intValue();
                int i14 = i10;
                int iB = s.b(i14, iIntValue, 0);
                int iB2 = s.b(i14, num.intValue(), 1);
                int iB3 = s.b(i14, num.intValue(), 2);
                ((org.telegram.ui.Components.j6) p1Var.f594b).c(iB >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(iB / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(iB)), true, true);
                ((org.telegram.ui.Components.j6) p1Var2.f594b).c(LocaleController.formatNumber(iB2, ','), true, true);
                ((org.telegram.ui.Components.j6) p1Var3.f594b).c(LocaleController.formatNumber(iB3, ','), true, true);
                int iB4 = s.b(i14, num.intValue(), 3);
                int iB5 = s.b(i14, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                rVar.f(iB4, iB5, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        n0Var2.set(s0Var);
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i14 = MessagesController.getInstance(i10).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (int i16 = 9; i15 < i16; i16 = 9) {
            int[] iArr4 = iArr3;
            if (iArr3[i15] >= messageMinPrice) {
                if (i15 > 0 && arrayList.isEmpty() && iArr4[i15] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i17 = iArr4[i15];
                if (i17 <= i14) {
                    arrayList.add(Integer.valueOf(i17));
                    if (iArr4[i15] == i14) {
                        break;
                    }
                } else {
                    arrayList.add(Integer.valueOf(i14));
                    break;
                }
            }
            i15++;
            iArr3 = iArr4;
        }
        if (arrayList.isEmpty() || ((Integer) i0.a.i(1, arrayList)).intValue() < i14) {
            arrayList.add(Integer.valueOf(i14));
        }
        int[] iArr5 = new int[arrayList.size()];
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            iArr5[i18] = ((Integer) arrayList.get(i18)).intValue();
        }
        rVar.f9344a0 = iArr5;
        rVar.setValue((int) jArr[0]);
        linearLayout.addView(rVar, h7.z5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(linearLayoutG, h7.z5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i19 = org.telegram.ui.ActionBar.g6.f23161j5;
        TextView textViewB = h7.d6.b(context, 20.0f, i19, true, bVar);
        textViewB.setGravity(17);
        textViewB.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(textViewB, h7.z5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView textViewB2 = h7.d6.b(context, 14.0f, i19, false, bVar);
        textViewB2.setGravity(17);
        rl.n(R.string.LiveStoryHighlightText, new Object[]{shortName}, textViewB2);
        linearLayout.addView(textViewB2, h7.z5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(n0Var2, h7.z5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, h7.z5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar.setOnClickListener(new gg.f(n0Var, jArr, e3Var, 9));
    }

    public final void P0() {
        if (this.X1 == null) {
            return;
        }
        t0();
        this.E2.f28650f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.X1.P();
        }
        this.E2.J1(-1, true);
        t2 t2Var = this.E2;
        t2Var.V = this.f13291x1;
        t2Var.r1();
        this.E2.m1().setText(this.X1.getFieldText());
        ((z8) this.M1).h(this.E2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j10 = this.f13291x1;
        if (j10 < 0) {
            bundle.putLong("chat_id", -j10);
        } else {
            bundle.putLong("user_id", j10);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.f13296y2).getDialog(this.f13291x1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.F0.H(new rn(bundle));
    }

    public final void R0(long j10) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        long j11;
        d1 d1Var;
        boolean z10 = this.G1;
        d4 d4Var = this.I2;
        if (!z10) {
            d4Var.d = null;
            return;
        }
        c4 c4Var = this.K1;
        boolean z11 = c4Var.f13145f;
        j3 j3Var = this.Y0;
        if (!z11) {
            if (!c4Var.f13144e) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): null, not a video");
                ((z8) this.M1).c(null, null, 0L, this.I2);
                d4Var.d = null;
                d4Var.f13195f = false;
                return;
            }
            if (c4Var.f() == null || !new File(c4Var.f()).exists()) {
                TL_stories.StoryItem storyItem = c4Var.f13141a;
                if (storyItem != null) {
                    storyItem.dialogId = this.f13291x1;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = c4Var.f13141a;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.f13296y2).getFileReference(c4Var.f13141a);
                            }
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(this.f13296y2);
                            sb2.append("&id=");
                            sb2.append(document2.f22386id);
                            sb2.append("&hash=");
                            sb2.append(document2.access_hash);
                            sb2.append("&dc=");
                            sb2.append(document2.dc_id);
                            sb2.append("&size=");
                            sb2.append(document2.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(c4Var.f13141a.fileReference);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb2.append(Utilities.bytesToHex(bArr));
                            sb2.append("&sid=");
                            sb2.append(c4Var.f13141a.f22617id);
                            sb2.append("&did=");
                            sb2.append(c4Var.f13141a.dialogId);
                            Uri uri2 = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from " + uri2);
                            this.N2 = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = uri2;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                        }
                    } catch (Exception unused2) {
                        document2 = null;
                    }
                } else {
                    document = null;
                    uri = null;
                }
            } else {
                Uri uriFromFile = Uri.fromFile(new File(c4Var.f()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j10 + "): playing from attachPath " + uriFromFile);
                this.N2 = 0L;
                uri = uriFromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j10 + "): playing from null?");
            }
            ((z8) this.M1).c(document, uri, j10, this.I2);
            j3Var.invalidate();
            return;
        }
        y3 y3Var = this.M1;
        TL_stories.StoryItem storyItem3 = c4Var.f13141a;
        long j12 = this.f13291x1;
        int i10 = storyItem3.f22617id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z12 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        z8 z8Var = (z8) y3Var;
        z8Var.i(true, true);
        i9 i9Var = z8Var.d;
        d1 d1Var2 = i9Var.f13512w0;
        if (d1Var2 == null || d1Var2.f13175b != j12 || !d1Var2.f(inputGroupCall)) {
            lh.c4 c4Var2 = i9Var.f13517z0;
            if (c4Var2 != null) {
                c4Var2.d(j12, null);
                lh.c4 c4Var3 = i9Var.f13517z0;
                SurfaceViewRenderer surfaceViewRenderer = c4Var3.f15736c;
                if (surfaceViewRenderer != null) {
                    surfaceViewRenderer.clearImage();
                }
                TextureViewRenderer textureViewRenderer = c4Var3.d;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                c4Var3.f15740r = false;
                c4Var3.e(false, false);
            }
            i1 i1Var = i1.V;
            if (i1Var.O && (d1Var = i1Var.v) != null && d1Var.f(inputGroupCall)) {
                d1 d1Var3 = i1Var.v;
                i1Var.v = null;
                i9Var.f13512w0 = d1Var3;
                i1Var.k(false);
            } else {
                d1 d1Var4 = i9Var.f13512w0;
                if (d1Var4 != null) {
                    if (!d1Var4.f13179n && (!i1Var.O || i1Var.v != d1Var4)) {
                        d1Var4.e();
                    } else if (d1Var4.K != i9Var.f13517z0.getSink()) {
                        i9Var.f13512w0.s(null);
                    }
                    i9Var.f13512w0 = null;
                }
            }
            if (i1Var.O) {
                i1.j();
            }
            h9 h9Var = i9Var.f13510v0;
            if (h9Var != null) {
                h9Var.release(null);
                i9Var.f13510v0 = null;
            }
            d4 d4Var2 = i9Var.C0;
            if (d4Var2 != null) {
                d4Var2.f13192b = null;
                d4Var2.f13191a = null;
                d4Var2.f13195f = false;
                d4Var2.d = null;
                d4Var2.f13194e = null;
                d4Var2.f13193c = null;
                d4Var2.a();
                i9Var.C0 = null;
            }
            if (i9Var.f13512w0 != null) {
                j11 = j12;
            } else {
                d1 d1Var5 = d1.S;
                if (d1Var5 == null || !d1Var5.f(inputGroupCall)) {
                    d1 d1Var6 = new d1(z8Var.f14205c, i9Var.h, storyItem3, j12, i10, z12, inputGroupCall, false, false);
                    j11 = j12;
                    i9Var.f13512w0 = d1Var6;
                } else {
                    i9Var.f13512w0 = d1.S;
                    j11 = j12;
                }
            }
            lh.c4 c4Var4 = i9Var.A0;
            if (c4Var4 != null) {
                i9Var.f13512w0.s(c4Var4.getSink());
            } else {
                i9Var.f13512w0.s(i9Var.f13517z0.getSink());
            }
            i9Var.C0 = d4Var;
            d4Var.f13195f = false;
            d4Var.d = i9Var.f13509u0;
            lh.c4 c4Var5 = i9Var.f13517z0;
            d4Var.f13194e = c4Var5.d;
            d4Var.f13193c = c4Var5.f15736c;
            d4Var.f13191a = i9Var.f13512w0;
            c4Var5.d(j11, d4Var);
            i9Var.C0.a();
        }
        j3Var.invalidate();
    }

    public final void S0(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri uri2;
        String str;
        String str2;
        boolean z10;
        if (uri == null || (storyItem = this.K1.f13141a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String string = uri.toString();
        if (string.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = string.split("/1/")[1];
                int iIndexOf = str3.indexOf("/ACTUAL");
                uri2 = iIndexOf != -1 ? Uri.parse(URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8")) : uri;
            } catch (Exception e9) {
                FileLog.e(e9);
                uri2 = uri;
            }
        } else {
            uri2 = uri;
        }
        String path = AndroidUtilities.getPath(uri2);
        if (BuildVars.NO_SCOPED_STORAGE) {
            if (path == null) {
                String string2 = uri2.toString();
                String strCopyFileToCache = MediaController.copyFileToCache(uri2, "file");
                if (strCopyFileToCache == null) {
                    Z0();
                    return;
                } else {
                    str2 = string2;
                    str = strCopyFileToCache;
                }
            } else {
                str = path;
                str2 = str;
            }
            z10 = false;
        } else {
            str = path;
            str2 = str;
            z10 = true;
        }
        if (z10) {
            SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, uri2, null, null, this.f13291x1, null, null, storyItem, null, null, true, 0, null, null, false);
        } else {
            SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.f13291x1, null, null, storyItem, null, null, true, 0, null, null, false);
        }
    }

    public final void T0(long j10, boolean z10) {
        if (this.G1 != z10) {
            this.G1 = z10;
            ri0 ri0Var = this.f13282v0;
            if (z10) {
                if (this.F0.f13464a && Build.VERSION.SDK_INT < 33) {
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.f13484h1 = true;
                    i9Var.P();
                    a8.b bVar = this.R3;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 100L);
                }
                R0(j10);
                g1();
                ri0Var.setAnimation(this.f13275t1.f13100u);
                this.G1 = true;
                this.f13247k1.f13033a.getImageReceiver().setVisible(true, true);
                c4 c4Var = this.K1;
                if (c4Var.f13141a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.f13291x1 + " storyId=" + c4Var.f13141a.f22617id + " " + c4.c(c4Var));
                }
            } else {
                p0();
                ri0Var.a();
                this.f13238h1 = null;
                this.H2 = false;
                this.K2.d(0.0f, true);
                this.Y0.invalidate();
                invalidate();
                q0();
                i9 i9Var2 = ((z8) this.M1).d;
                i9Var2.E0 = false;
                i9Var2.P();
            }
            this.f13219a1.setFileLoadingPriority(this.G1 ? 3 : 2);
            this.f13220b1.setFileLoadingPriority(this.G1 ? 2 : 0);
            this.f13223c1.setFileLoadingPriority(this.G1 ? 2 : 0);
            if (this.f13295y1 || this.f13299z1) {
                s6 s6Var = this.O1;
                long j11 = this.f13291x1;
                boolean z11 = this.G1;
                a0.h hVar = s6Var.f13965m;
                r9 r9Var = (r9) hVar.f(j11);
                if (r9Var == null) {
                    r9Var = new r9(s6Var.f13955a, j11, s6Var);
                    hVar.k(r9Var, j11);
                }
                r9Var.b(z11);
            }
        }
    }

    public final void U0(int i10, long j10) {
        if (this.f13291x1 != j10) {
            c4 c4Var = this.K1;
            c4Var.f13142b = null;
            c4Var.f13141a = null;
        }
        this.f13291x1 = j10;
        this.f13283v1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.F0.M0;
        boolean z10 = true;
        if (peerStories != null) {
            this.O1.S(peerStories, true);
            return;
        }
        s6 s6Var = this.O1;
        TL_stories.PeerStories peerStoriesY = s6Var.y(j10);
        if (peerStoriesY == null) {
            peerStoriesY = s6Var.z(j10);
        } else {
            z10 = false;
        }
        s6Var.S(peerStoriesY, z10);
    }

    public final void W0(long j10, boolean z10, boolean z11) {
        if (!z10 && j10 == this.I3 && this.J3 == z11) {
            return;
        }
        this.I3 = j10;
        this.J3 = z11;
        a4 a4Var = this.f13247k1;
        if (j10 < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-j10));
            eg.c cVar = a4Var.f13034b;
            eg.c cVar2 = a4Var.f13034b;
            cVar.l(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title), false);
            if (chat == null || !chat.verified) {
                cVar2.i(null);
                return;
            }
            Drawable drawableMutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            drawableMutate.setAlpha(255);
            dq dqVar = new dq(drawableMutate, null);
            dqVar.f27828w = true;
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            dqVar.h = iDp;
            dqVar.f27825n = iDp2;
            cVar2.i(dqVar);
            return;
        }
        if (this.f13295y1 && !z11) {
            a4Var.f13034b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
            a4Var.f13034b.i(null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(j10));
        if (user == null || !user.verified) {
            a4Var.f13034b.i(null);
        } else {
            Drawable drawableMutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            drawableMutate2.setAlpha(255);
            dq dqVar2 = new dq(drawableMutate2, null);
            dqVar2.f27828w = true;
            int iDp3 = AndroidUtilities.dp(16.0f);
            int iDp4 = AndroidUtilities.dp(16.0f);
            dqVar2.h = iDp3;
            dqVar2.f27825n = iDp4;
            a4Var.f13034b.i(dqVar2);
        }
        if (user != null) {
            a4Var.f13034b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), a4Var.f13034b.getPaint().getFontMetricsInt(), false), false);
        } else {
            a4Var.f13034b.l(null, false);
        }
    }

    public final void X0(float f10, float f11, h4 h4Var) {
        this.f13241i1 = f10;
        this.f13289w3 = 1.0f / f11;
        if (this.f13238h1 == h4Var) {
            return;
        }
        this.f13238h1 = h4Var;
        if (h4Var != null) {
            ImageReceiver imageReceiver = h4Var.f13381a;
            if (imageReceiver.getBitmap() != null) {
                this.f13219a1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
            }
        }
    }

    public final void Y0(boolean z10) {
        c4 c4Var = this.K1;
        if (c4Var.f13141a != null) {
            i9 i9Var = this.F0;
            if (i9Var.f13478f != null) {
                String strE = c4Var.e();
                if (!z10) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", strE);
                    LaunchActivity.C1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                w2 w2Var = new w2(this, i9Var.f13478f.getContext(), strE, strE, MessagesController.getInstance(this.f13296y2).storiesEnabled() && (!(this.f13299z1 || UserObject.isService(this.f13291x1)) || ChatObject.isPublic(this.f13299z1 ? MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1)) : null)), new m2(2, this.f13290x0));
                this.V2 = w2Var;
                w2Var.f32526e0 = true;
                TL_stories.StoryItem storyItem = c4Var.f13141a;
                storyItem.dialogId = this.f13291x1;
                w2Var.B0 = storyItem;
                w2Var.f32537o0 = new k5.i(this, 21);
                ((z8) this.M1).h(w2Var);
            }
        }
    }

    public final void Z0() {
        j3 j3Var = this.Y0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13290x0;
        org.telegram.messenger.y1.r(R.string.UnsupportedAttachment, new mc(j3Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f13290x0);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = string;
        ((z8) this.M1).h(b2Var);
    }

    public final void b1(boolean z10) {
        if (this.f13260o3 != z10) {
            c4 c4Var = this.K1;
            if (c4Var.f13141a == null) {
                return;
            }
            this.f13260o3 = z10;
            int i10 = 0;
            if (z10) {
                this.f13257n3.setVisibility(0);
            }
            this.f13257n3.setStoryItem(c4Var.f13141a);
            i9 i9Var = ((z8) this.M1).d;
            i9Var.l1 = z10;
            i9Var.P();
            if (!z10) {
                if (this.f13257n3.getReactionsWindow() != null) {
                    this.f13257n3.getReactionsWindow().e();
                }
                this.f13257n3.animate().alpha(0.0f).setDuration(150L).setListener(new k2(this, i10)).start();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13263p3, z10 ? 1.0f : 0.0f);
            this.f13257n3.setTransitionProgress(this.f13263p3);
            valueAnimatorOfFloat.addUpdateListener(new w1(this, 1));
            valueAnimatorOfFloat.addListener(new j2(this, z10, i10));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(er.f28123g);
            valueAnimatorOfFloat.start();
        }
    }

    public final void c1(boolean z10) {
        if (this.C0 == null) {
            lh.w3 w3Var = new lh.w3(getContext(), 1);
            w3Var.m(1.0f, -56.0f);
            this.C0 = w3Var;
            w3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.Y0.addView(this.C0, h7.z5.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.C0.t(LocaleController.getString(z10 ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.C0.v();
    }

    public final boolean d1(boolean z10) {
        if (this.F0.N0) {
            z10 = !z10;
        }
        if (!z10) {
            int i10 = this.F1;
            if (i10 > 0) {
                this.F1 = i10 - 1;
                f1(false);
                return true;
            }
        } else if (this.F1 < getStoriesCount() - 1) {
            this.F1++;
            f1(false);
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d1 d1Var;
        int i12 = NotificationCenter.storiesUpdated;
        i9 i9Var = this.F0;
        boolean z10 = false;
        if (i10 == i12 || (i10 == NotificationCenter.storiesListUpdated && i9Var.K0 == objArr[0])) {
            y3 y3Var = this.M1;
            if (y3Var == null || !((z8) y3Var).d.D0) {
                if (this.G1) {
                    j1();
                    if (this.f13287w1 == 0) {
                        if (this.A2) {
                            return;
                        }
                        this.A2 = true;
                        ((z8) this.M1).j();
                        return;
                    }
                    int i13 = this.F1;
                    ArrayList arrayList = this.f13267r1;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.f13271s1;
                    if (i13 >= arrayList2.size() + size) {
                        this.F1 = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    f1(false);
                    if (this.f13295y1 || this.f13299z1) {
                        k1(true);
                    }
                }
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories != null) {
                    this.O1.S(peerStories, true);
                } else {
                    long j10 = this.f13291x1;
                    if (j10 != 0) {
                        s6 s6Var = this.O1;
                        TL_stories.PeerStories peerStoriesY = s6Var.y(j10);
                        if (peerStoriesY == null) {
                            peerStoriesY = s6Var.z(j10);
                            z10 = true;
                        }
                        s6Var.S(peerStoriesY, z10);
                    }
                }
                org.telegram.ui.ActionBar.f1 f1Var = this.f13258o1;
                if (f1Var != null) {
                    f1Var.animate().alpha((this.O1.K(this.f13291x1) && this.K1.f13144e && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.storyQualityUpdate) {
            f1(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.G0.U.invalidate();
            return;
        }
        if (i10 == NotificationCenter.stealthModeChanged) {
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.storiesLimitUpdate) {
            l6 l6VarO = MessagesController.getInstance(this.f13296y2).getStoriesController().o();
            if (l6VarO == null || !l6VarO.a(this.f13296y2, 1) || this.M1 == null) {
                return;
            }
            ag.r2 r2Var = new ag.r2(this, 4);
            Context contextFindActivity = AndroidUtilities.findActivity(getContext());
            if (contextFindActivity == null) {
                contextFindActivity = LaunchActivity.C1;
            }
            ((z8) this.M1).h(new ag.i1(l6VarO.b(), this.f13296y2, contextFindActivity, r2Var, null));
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.f13296y2).isUserContactBlocked(this.f13291x1);
            boolean z11 = this.f13291x1 >= 0 && !UserConfig.getInstance(this.f13296y2).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            if (this.B1 == z11 && this.D1 == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
                return;
            }
            this.B1 = z11;
            this.D1 = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            f1(false);
            r0(true);
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.f13291x1 == (-((TLRPC.ChatFull) obj).f22381id)) {
                f1(false);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.liveStoryUpdated) {
            if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            }
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        if (i9Var == null || (d1Var = i9Var.f13512w0) == null || d1Var.g() != jLongValue) {
            return;
        }
        f1(false);
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.K(true);
            this.X1.O1(true);
            r0(true);
        }
        g2 g2Var = this.H0;
        if (g2Var != null) {
            d1 d1Var2 = g2Var.L;
            if (g2Var.D != (d1Var2 != null ? d1Var2.j() : 0L)) {
                g2Var.f14014e.N(true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wd wdVar;
        Canvas canvas2;
        org.telegram.ui.Components.i6 i6Var;
        org.telegram.ui.Components.i6 i6Var2;
        l1();
        if (this.f13299z1 && (i6Var2 = this.M0) != null) {
            i6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.f13299z1 && (i6Var = this.N0) != null) {
            i6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f13266q3;
        LinearLayout linearLayout = this.K0;
        z2 z2Var = this.f13298z0;
        if (z10) {
            float measuredWidth = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int iDp = AndroidUtilities.dp(24.0f);
            float f10 = iDp / 2.0f;
            float fLerp = AndroidUtilities.lerp(this.f13273s3, measuredWidth - f10, er.f28123g.getInterpolation(this.f13269r3));
            float fLerp2 = AndroidUtilities.lerp(this.f13277t3, measuredHeight - f10, this.f13269r3);
            int iLerp = AndroidUtilities.lerp(this.f13281u3, iDp, this.f13269r3);
            if (this.f13251l3) {
                org.telegram.ui.Components.k5 k5Var = this.f13249k3;
                if (k5Var != null) {
                    float f11 = iLerp;
                    k5Var.setBounds((int) fLerp, (int) fLerp2, (int) (fLerp + f11), (int) (fLerp2 + f11));
                    this.f13249k3.draw(canvas);
                }
            } else {
                float f12 = iLerp;
                ImageReceiver imageReceiver = this.f13246j3;
                imageReceiver.setImageCoords(fLerp, fLerp2, f12, f12);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f13254m3) {
            float measuredWidth2 = (z2Var.getMeasuredWidth() / 2.0f) + z2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (z2Var.getMeasuredHeight() / 2.0f) + z2Var.getY() + linearLayout.getY();
            int iDp2 = AndroidUtilities.dp(120.0f);
            if (this.f13251l3) {
                ig.d dVar = this.f13243i3;
                if (dVar != null) {
                    float f13 = iDp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f13), (int) (measuredHeight2 - f13), (int) (measuredWidth2 + f13), (int) (measuredHeight2 + f13));
                    this.f13243i3.b(canvas);
                    if (this.f13243i3.c()) {
                        this.f13243i3.d(this);
                        this.f13243i3 = null;
                        this.f13254m3 = false;
                    }
                } else {
                    this.f13254m3 = false;
                }
            } else {
                float f14 = iDp2;
                float f15 = f14 / 2.0f;
                float f16 = measuredWidth2 - f15;
                float f17 = measuredHeight2 - f15;
                ImageReceiver imageReceiver2 = this.f13240h3;
                imageReceiver2.setImageCoords(f16, f17, f14, f14);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().y()) {
                    this.f13254m3 = false;
                }
            }
        }
        o2 o2Var = this.X1;
        if (o2Var != null) {
            yd ydVar = o2Var.f26179t1;
            wd wdVar2 = o2Var.f26184u1;
            if (o2Var.getAlpha() == 0.0f || (wdVar = o2Var.f26073a1) == null || wdVar.getParent() == null || o2Var.f26073a1.getVisibility() != 0) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(o2Var.f26073a1.getX() + ydVar.getX() + wdVar2.getX() + o2Var.getX(), o2Var.f26073a1.getY() + ydVar.getY() + wdVar2.getY() + o2Var.getY());
            if (o2Var.getAlpha() != 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight(), (int) (o2Var.getAlpha() * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            o2Var.f26073a1.draw(canvas2);
            canvas2.restoreToCount(iSave);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        og.d dVar;
        float fDp;
        if (view == this.Z2) {
            canvas.save();
            canvas.clipRect(0.0f, this.Z2.getY(), getMeasuredWidth(), this.Z2.getY() + this.Z2.getMeasuredHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild;
        }
        o2 o2Var = this.X1;
        Paint paint = this.f13245j2;
        z2 z2Var = this.f13298z0;
        b4 b4Var = this.f13275t1;
        if (view == o2Var) {
            float f10 = this.f13253m2;
            c4 c4Var = this.K1;
            if (f10 > 0.0f && !c4Var.f13145f) {
                b4Var.f13091l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), b4Var.f13091l);
            }
            RectF rectF = b4Var.h;
            RectF rectF2 = b4Var.f13088i;
            RectF rectF3 = b4Var.f13089j;
            rectF.set(this.X1.getX(), this.X1.getY() + this.X1.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.X1.getX() + this.X1.getMeasuredWidth(), this.X1.getY() + this.X1.getMeasuredHeight());
            float fDp2 = AndroidUtilities.dp(40.0f);
            if (c4Var.f13145f) {
                fDp = AndroidUtilities.dp(46.0f);
                fDp2 = AndroidUtilities.dp(46.0f);
                n1 n1Var = this.W1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.O2) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.f13299z1) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                if (z2Var != null && z2Var.getVisibility() == 0) {
                    fDp2 = (fDp2 - AndroidUtilities.dp(40.0f)) + z2Var.getLayoutParams().width;
                }
                fDp = 0.0f;
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + fDp, ((this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - fDp2, (this.X1.getY() + this.X1.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.X1.setTranslationX((1.0f - this.f13253m2) * fDp);
            this.X1.getEditField().setTranslationY(com.google.android.recaptcha.internal.a.z(1.0f, this.f13253m2, -AndroidUtilities.dp(2.0f), this.X1.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? ((1.0f - this.f13253m2) * (this.X1.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f : 0.0f));
            float fDp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, b4Var.h, this.f13253m2, rectF3);
            lg.d dVar2 = this.f13239h2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(fDp3);
                dVar2.setAlpha((int) ((1.0f - this.Z3) * (1.0f - this.f13256n2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, fDp3, fDp3, paint);
            }
            if (this.f13253m2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild2;
            }
        } else {
            if (o2Var != null && o2Var.u0(view)) {
                float fDp4 = AndroidUtilities.dp(30.0f);
                RectF rectF4 = b4Var.f13090k;
                RectF rectF5 = b4Var.f13090k;
                rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.W3;
                path.rewind();
                path.addRoundRect(rectF5, fDp4, fDp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                lg.d dVar3 = this.f13242i2;
                if (dVar3 != null) {
                    dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    dVar3.q(fDp4, fDp4, fDp4, fDp4);
                    dVar3.setAlpha(255);
                    dVar3.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF5, fDp4, fDp4, paint);
                }
                boolean zDrawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild3;
            }
            wj0 wj0Var = this.f13221b2;
            if (view != wj0Var || this.X1 == null) {
                wj0 wj0Var2 = this.f13257n3;
                if (view == wj0Var2) {
                    view.setTranslationY((this.K0.getY() + (z2Var.getY() + (-(wj0Var2.getMeasuredHeight() - this.f13257n3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    j3 j3Var = this.Y0;
                    if (view == j3Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.D3) != null && !dVar.f19455n) {
                        RecordingCanvas recordingCanvasA = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        recordingCanvasA.drawColor(i0.b.d(0.2f, -16777216, -1));
                        recordingCanvasA.translate(j3Var.getX(), j3Var.getY());
                        view.draw(recordingCanvasA);
                        dVar.b();
                    }
                }
            } else {
                view.setTranslationY(((this.X1.getY() + this.X1.getAnimatedTop()) + (-wj0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e1() {
        if (MessagesController.getInstance(this.f13296y2).storiesEnabled()) {
            File fileH = this.K1.h();
            if (fileH == null || !fileH.exists()) {
                a1();
                return;
            }
            w2 w2Var = this.V2;
            if (w2Var != null) {
                w2Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new v1(this, 8), 120L);
        }
    }

    public final void f1(boolean z10) {
        r6 r6Var;
        TL_stories.StoryItem storyItem;
        sy syVar;
        boolean z11;
        boolean z12;
        boolean z13;
        ImageReceiver imageReceiver;
        int i10;
        i9 i9Var;
        f9 f9Var;
        ImageReceiver imageReceiver2;
        TL_stories.StoryItem storyItem2;
        boolean z14;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z15;
        Drawable drawableCreateStripedBitmap;
        TL_stories.StoryItem storyItem3;
        r6 r6Var2;
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem4;
        TL_stories.StoryItem storyItem5;
        r6 r6Var3;
        int i11;
        lh.z7 z7Var;
        TL_stories.StoryItem storyItem6;
        r6 r6Var4;
        int i12;
        lh.z7 z7Var2;
        boolean z16;
        boolean z17;
        d1 d1Var;
        boolean z18;
        j3 j3Var;
        n3 n3Var;
        a4 a4Var;
        o2 o2Var;
        boolean z19;
        r6 r6Var5;
        ec ecVar;
        si0 si0Var;
        TL_stories.StoryItem storyItem7;
        TextView[] textViewArr;
        boolean z20;
        boolean z21;
        r6 r6Var6;
        TL_stories.StoryItem storyItem8;
        boolean z22;
        ImageReceiver imageReceiver3;
        j3 j3Var2;
        n3 n3Var2;
        a4 a4Var2;
        boolean z23;
        CharSequence charSequence;
        a4 a4Var3;
        String storyDate;
        TL_stories.StoryItem storyItem9;
        a4 a4Var4;
        a4 a4Var5;
        SpannableStringBuilder spannableStringBuilder;
        a4 a4Var6;
        v7 v7VarI;
        SpannableStringBuilder spannableStringBuilder2;
        String str;
        org.telegram.ui.g5 g5Var;
        TLRPC.Chat chat;
        d1 d1Var2;
        int i13;
        TLRPC.GroupCall groupCall;
        int i14;
        TL_stories.StoryItem storyItem10;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document;
        TLRPC.Photo photo;
        boolean z24;
        lh.w3 w3Var;
        lh.w3 w3Var2;
        j6 j6Var;
        CharSequence charSequence2;
        TL_stories.StoryItem storyItem11;
        CharSequence spannableStringBuilder3;
        a4 a4Var7;
        CharSequence charSequence3;
        CharSequence string;
        a4 a4Var8;
        TL_stories.StoryItem storyItem12;
        y3 y3Var;
        boolean z25;
        LinearLayout linearLayout;
        boolean z26;
        LinearLayout linearLayout2;
        TLRPC.Chat chat2;
        o2 o2Var2;
        o2 o2Var3;
        o2 o2Var4;
        o2 o2Var5;
        z2 z2Var;
        FrameLayout frameLayout;
        cg.q qVar;
        int i15;
        int i16;
        u1 u1Var;
        boolean z27;
        sg.g gVar;
        a aVar;
        g2 g2Var;
        n1 n1Var;
        TL_stories.StoryItem storyItem13;
        boolean z28;
        z2 z2Var2;
        ImageView imageView;
        z2 z2Var3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zL;
        ag.d dVar;
        r6 r6Var7;
        n8 n8Var;
        TL_stories.StoryItem storyItem14;
        boolean z29;
        boolean z30;
        float f10;
        r6 r6Var8;
        ViewPropertyAnimator viewPropertyAnimator;
        j6 j6Var2;
        int iDp;
        lh.w3 w3Var3;
        ImageView imageView2;
        ImageView imageView3;
        int i21;
        int i22;
        TL_stories.StoryItem storyItem15;
        TLRPC.Reaction reaction;
        boolean z31;
        float f11;
        boolean zJ;
        ImageView imageView4;
        ri0 ri0Var;
        int i23;
        TL_stories.StoryItem storyItem16;
        int i24;
        MessageObject messageObject;
        int i25;
        int i26;
        int i27;
        TLRPC.MessageMedia messageMedia3;
        o2 o2Var6;
        TL_stories.StoryItem storyItem17;
        int i28;
        int i29;
        FrameLayout.LayoutParams layoutParams;
        n1 n1Var2;
        float f12;
        int iDp2;
        int i30;
        d1 d1Var3;
        boolean z32;
        d1 d1Var4;
        boolean z33;
        d1 d1Var5;
        int i31;
        o2 o2Var7;
        int i32;
        o2 o2Var8;
        z2 z2Var4;
        o2 o2Var9;
        boolean z34;
        d1 d1Var6;
        String str2;
        int i33;
        TLRPC.GroupCall groupCall2;
        int i34;
        BitmapDrawable bitmapDrawable;
        sy syVar2;
        i9 i9Var2;
        ?? r10;
        TLRPC.MessageMedia messageMedia4;
        j6 j6Var3;
        ArrayList arrayList2 = this.f13267r1;
        boolean zIsEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f13271s1;
        if (zIsEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.R2 = true;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem18 = c4Var.f13141a;
        r6 r6Var9 = c4Var.f13142b;
        String strS = l7.s();
        this.V0 = false;
        this.Y2 = false;
        int i35 = this.F1;
        boolean z35 = this.P1;
        boolean z36 = this.Q1;
        boolean z37 = this.R1;
        i9 i9Var3 = this.F0;
        if (i9Var3 == null || (j6Var3 = i9Var3.K0) == null || j6Var3.f13537e != 4) {
            TL_stories.StoryItem storyItem19 = (i35 < 0 || i35 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i35);
            int size = i35 - arrayList2.size();
            TL_stories.StoryItem storyItem20 = storyItem19;
            r6Var = (size < 0 || size >= arrayList3.size()) ? null : (r6) arrayList3.get(size);
            storyItem = storyItem20;
        } else {
            r6Var = (i35 < 0 || i35 >= arrayList3.size()) ? null : (r6) arrayList3.get(i35);
            int size2 = i35 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        c4Var.f13143c = null;
        f3 f3Var = this.f13232f1;
        sy syVar3 = this.f13235g1;
        y2 y2Var = this.f13219a1;
        if (r6Var == null) {
            r6Var9 = r6Var9;
            syVar = syVar3;
            z11 = z35;
            z12 = z36;
            z13 = z37;
            imageReceiver = y2Var;
            i10 = i35;
            this.P1 = false;
            this.Q1 = false;
            this.R1 = false;
            if (storyItem == null) {
                if (i9Var3 != null) {
                    i9Var3.q(true);
                    return;
                }
                return;
            }
            r6 r6VarT = this.O1.t(this.f13291x1, storyItem);
            if (r6VarT != null) {
                String str3 = r6VarT.f13909f;
                this.Q1 = true;
                imageReceiver.setCrossfadeWithOldImage(false);
                imageReceiver.setCrossfadeDuration(this.f13229e1 == null ? 150 : 0);
                if (r6VarT.f13912s) {
                    i9Var = i9Var3;
                    r6Var2 = r6VarT;
                    imageReceiver.setImage(null, null, ImageLocation.getForPath(str3), strS, null, 0L, null, null, 0);
                } else {
                    i9Var = i9Var3;
                    r6Var2 = r6VarT;
                    imageReceiver.setImage(null, null, ImageLocation.getForPath(str3), strS, null, 0L, null, null, 0);
                }
                c4Var.f13142b = r6Var2;
                c4Var.f13148j = null;
                c4Var.f13147i = null;
                c4Var.f13141a = null;
                c4Var.d = false;
                c4Var.f13144e = c4Var.m();
                TL_stories.StoryItem storyItem21 = c4Var.f13141a;
                c4Var.f13145f = (storyItem21 == null || (messageMedia = storyItem21.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                f3Var.c(null, m8.a(r6Var2.f13907c), syVar);
                c4Var.f13143c = storyItem;
                this.Q2 = false;
                this.P2 = false;
                this.O2 = false;
            } else {
                storyItem18 = storyItem18;
                i9Var = i9Var3;
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                boolean zEndsWith = messageMedia5 != null && MessageObject.isVideoDocument(messageMedia5.getDocument());
                storyItem.dialogId = this.f13291x1;
                imageReceiver.setCrossfadeWithOldImage(z12);
                imageReceiver.setCrossfadeDuration(150);
                TLRPC.MessageMedia messageMedia6 = storyItem.media;
                if (messageMedia6 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.Y2 = true;
                    MessagesController.getInstance(this.f13296y2).getStoriesController().p(storyItem.f22617id, this.f13291x1);
                    storyItem2 = storyItem;
                    z14 = z12;
                } else {
                    String str4 = storyItem.attachPath;
                    if (str4 != null) {
                        if (messageMedia6 == null) {
                            zEndsWith = str4.toLowerCase().endsWith(".mp4");
                        }
                        if (zEndsWith) {
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            Drawable drawableCreateStripedBitmap2 = messageMedia7 != null ? ImageLoader.createStripedBitmap(messageMedia7.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                if (ImageLoader.getInstance().isInMemCache(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false) + "@" + strS, false)) {
                                    z15 = z12;
                                    imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), strS, null, null, drawableCreateStripedBitmap2, 0L, null, null, 0);
                                } else {
                                    z15 = z12;
                                    imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), s3.c.l(strS, "_pframe"), null, null, drawableCreateStripedBitmap2, 0L, null, null, 0);
                                }
                            } else {
                                z15 = z12;
                                imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), s3.c.l(strS, "_pframe"), null, null, drawableCreateStripedBitmap2, 0L, null, null, 0);
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia8 = storyItem.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 != null) {
                                z15 = z12;
                                drawableCreateStripedBitmap = ImageLoader.createStripedBitmap(photo2.sizes);
                            } else {
                                z15 = z12;
                                drawableCreateStripedBitmap = null;
                            }
                            if (z15) {
                                z15 = z12;
                                z15 = z12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), strS, ImageLocation.getForPath(storyItem.firstFramePath), strS, drawableCreateStripedBitmap, 0L, null, null, 0);
                            } else {
                                z15 = z12;
                                z15 = z12;
                                imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), strS, null, null, drawableCreateStripedBitmap, 0L, null, null, 0);
                            }
                        }
                        storyItem2 = storyItem;
                        z14 = z15;
                    } else {
                        Drawable drawable = ((i9Var.K0 != null || i9Var.J0) && (f9Var = i9Var.f13496o0) != null && (imageReceiver2 = f9Var.f13335c) != null && f9Var.f13345o == storyItem.f22617id) ? imageReceiver2.getDrawable() : null;
                        storyItem.dialogId = this.f13291x1;
                        if (zEndsWith) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            ImageLocation forDocument = ImageLocation.getForDocument(storyItem.media.getDocument());
                            String strL = s3.c.l(strS, "_pframe");
                            ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument());
                            TL_stories.StoryItem storyItem22 = storyItem;
                            z14 = z12;
                            imageReceiver.setImage(null, null, forDocument, strL, forDocument2, strS, drawable, 0L, null, storyItem22, 0);
                            storyItem2 = storyItem22;
                        } else {
                            storyItem2 = storyItem;
                            z14 = z12;
                            TLRPC.MessageMedia messageMedia9 = storyItem2.media;
                            TLRPC.Photo photo3 = messageMedia9 != null ? messageMedia9.photo : null;
                            if (photo3 == null || (arrayList = photo3.sizes) == null) {
                                imageReceiver.clearImage();
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, Integer.MAX_VALUE);
                                FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
                                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo3), strS, null, null, drawable, 0L, null, storyItem2, 0);
                            }
                        }
                    }
                }
                storyItem2.dialogId = this.f13291x1;
                f3Var.d(z10 ? null : storyItem2, syVar);
                c4Var.n(storyItem2);
                boolean z38 = (this.Y2 || (storyItem3 = c4Var.f13141a) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.Q2 = z38;
                this.O2 = z38;
                if (z38) {
                    this.O2 = c4Var.d() && c4Var.f13141a.isPublic;
                }
                if (this.O2) {
                    TL_stories.StoryItem storyItem23 = c4Var.f13141a;
                    this.O2 = storyItem23.pinned || !l7.w(this.f13296y2, storyItem23);
                }
                boolean z39 = this.O2;
                this.P2 = z39;
                if (z39 && this.f13299z1) {
                    TLRPC.Chat chat3 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
                    this.P2 = chat3 != null && ChatObject.isPublic(chat3);
                }
                if (this.Q2) {
                    if (this.f13299z1) {
                        TLRPC.Chat chat4 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
                        this.Q2 = (chat4 == null || ChatObject.getPublicUsername(chat4) == null) ? false : true;
                    } else {
                        TLRPC.User user = MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(this.f13291x1));
                        this.Q2 = (user == null || UserObject.getPublicUsername(user) == null || !c4Var.f13141a.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.f13296y2).processReadStories(this.f13291x1, storyItem2.f22617id);
            }
            storyItem4 = c4Var.f13141a;
            if (storyItem4 != null && !z10) {
                i9Var.L0 = storyItem4.f22617id;
            }
            i9Var.f13487j0.A();
            this.U2 = true;
            if (this.f13295y1 || this.f13299z1) {
                k1(false);
            }
            storyItem5 = c4Var.f13141a;
            r6Var3 = c4Var.f13142b;
            if (storyItem5 != null) {
                i11 = storyItem5.f22617id;
            } else if (r6Var3 != null || (z7Var = r6Var3.f13907c) == null) {
                i11 = 0;
            } else {
                i11 = z7Var.f17207f;
            }
            if (storyItem18 != null) {
                storyItem6 = storyItem18;
                i12 = storyItem6.f22617id;
                r6Var4 = r6Var9;
            } else {
                storyItem6 = storyItem18;
                r6Var4 = r6Var9;
                if (r6Var9 != null || (z7Var2 = r6Var4.f13907c) == null) {
                    i12 = 0;
                } else {
                    i12 = z7Var2.f17207f;
                }
            }
            if (i11 == i12 && (r6Var4 == null || storyItem5 == null || !TextUtils.equals(r6Var4.f13908e, storyItem5.attachPath))) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (z16 || (this.Q1 == z14 && this.P1 == z11 && this.R1 == z13)) {
                z17 = false;
            } else {
                z17 = true;
            }
            d1Var = i9Var.f13512w0;
            if (d1Var != null) {
                i33 = this.M3;
                groupCall2 = d1Var.v;
                if (groupCall2 == null) {
                    i34 = 0;
                } else {
                    i34 = groupCall2.participants_count;
                }
                if (i33 != Math.max(1, i34)) {
                    z18 = true;
                } else {
                    z18 = false;
                }
            } else {
                z18 = false;
            }
            j3Var = this.Y0;
            n3Var = this.G0;
            a4Var = this.f13247k1;
            if ((r6Var4 != null || (str2 = r6Var4.f13908e) == null || !str2.equals(c4Var.f())) && (storyItem6 == null || (storyItem7 = c4Var.f13141a) == null || storyItem6.f22617id != storyItem7.f22617id)) {
                o2Var = this.X1;
                if (o2Var != null) {
                    if (storyItem6 != null && !TextUtils.isEmpty(o2Var.getEditField().getText())) {
                        i9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                    }
                    this.X1.getEditField().setText(i9.u(this.f13291x1, c4Var.f13141a));
                    if (c4Var.f13145f) {
                        z19 = false;
                        this.X1.U0(false, false, false);
                    } else {
                        z19 = false;
                        this.X1.U0(true, true, false);
                    }
                } else {
                    z19 = false;
                }
                if (c4Var.f13145f) {
                    M0();
                }
                syVar.c();
                this.S0 = 0L;
                this.U0 = z19;
                r6Var5 = c4Var.f13142b;
                if (r6Var5 != null) {
                    si0Var = a4Var.d;
                    if (si0Var != null) {
                        si0Var.e(r6Var5.h, z19);
                    }
                    a4Var.f13033a.invalidate();
                } else if (!z17) {
                    a4Var.h = 0.0f;
                }
                ecVar = ec.f28012w;
                if (ecVar != null && ecVar.h == j3Var) {
                    ecVar.b();
                }
                n3Var.J();
                q0();
                z18 = true;
            }
            if (!z18 || (r6Var4 != null && c4Var.f13142b == null)) {
                a4Var.setOnSubtitleClick(null);
                textViewArr = a4Var.f13035c;
                this.M3 = 0;
                z20 = z16;
                z21 = z17;
                W0(this.f13291x1, false, c4Var.f13145f);
                r6Var6 = c4Var.f13142b;
                if (r6Var6 == null) {
                    if (I0()) {
                        storyItem10 = c4Var.f13141a;
                        if (storyItem10 != null && (messageMedia2 = storyItem10.media) != null) {
                            document = messageMedia2.document;
                            if (document != null) {
                                string = LocaleController.formatStoryDate(document.date);
                            } else {
                                photo = messageMedia2.photo;
                                if (photo != null) {
                                    string = LocaleController.formatStoryDate(photo.date);
                                }
                            }
                        }
                        z22 = z18;
                        imageReceiver3 = imageReceiver;
                        j3Var2 = j3Var;
                        n3Var2 = n3Var;
                        a4Var2 = a4Var;
                        z23 = z21;
                        charSequence = "";
                    } else {
                        storyItem8 = c4Var.f13141a;
                        if (storyItem8 == null) {
                            z22 = z18;
                            imageReceiver3 = imageReceiver;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            a4Var2 = a4Var;
                            z23 = z21;
                            charSequence = null;
                        } else if (storyItem8.media instanceof TLRPC.TL_messageMediaVideoStream) {
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                            spannableStringBuilder4.setSpan(new b3(), 0, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append((CharSequence) "  ");
                            d1Var2 = i9Var.f13512w0;
                            if (d1Var2 != null) {
                                groupCall = d1Var2.v;
                                if (groupCall == null) {
                                    i14 = 0;
                                } else {
                                    i14 = groupCall.participants_count;
                                }
                                i13 = 1;
                                this.M3 = Math.max(1, i14);
                            } else {
                                i13 = 1;
                            }
                            spannableStringBuilder4.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i13, this.M3)));
                            string = spannableStringBuilder4;
                        } else if (storyItem8.date == -1) {
                            string = LocaleController.getString(R.string.CachedStory);
                        } else {
                            if (c4Var.i() != null) {
                                v7VarI = c4Var.i();
                                spannableStringBuilder2 = new SpannableStringBuilder();
                                z22 = z18;
                                imageReceiver3 = imageReceiver;
                                SpannableString spannableString = new SpannableString("r");
                                j3Var2 = j3Var;
                                n3Var2 = n3Var;
                                spannableString.setSpan(new cq(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                                spannableStringBuilder2.append((CharSequence) spannableString).append((CharSequence) " ");
                                if (v7VarI.f14059b != null) {
                                    g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.f13296y2);
                                    SpannableString spannableString2 = new SpannableString("a");
                                    spannableString2.setSpan(g5Var, 0, 1, 33);
                                    spannableStringBuilder2.append((CharSequence) spannableString2).append((CharSequence) " ");
                                    if (v7VarI.f14059b.longValue() > 0) {
                                        TLRPC.User user2 = MessagesController.getInstance(this.f13296y2).getUser(v7VarI.f14059b);
                                        g5Var.e(user2);
                                        spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user2));
                                    } else {
                                        chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-v7VarI.f14059b.longValue()));
                                        g5Var.b(chat);
                                        if (chat != null) {
                                            spannableStringBuilder2.append((CharSequence) chat.title);
                                        }
                                    }
                                } else {
                                    str = c4Var.f13141a.fwd_from.from_name;
                                    if (str != null) {
                                        spannableStringBuilder2.append((CharSequence) str);
                                    }
                                }
                                a4Var.setOnSubtitleClick(new ag.q0(23, this, v7VarI));
                                SpannableString spannableString3 = new SpannableString(".");
                                ps psVar = new ps();
                                psVar.f31657b = AndroidUtilities.dp(1.5f);
                                psVar.f31658c = 5.0f;
                                spannableString3.setSpan(psVar, 0, spannableString3.length(), 33);
                                spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.f13141a.date));
                                a4Var6 = a4Var;
                                spannableStringBuilder = spannableStringBuilder2;
                            } else {
                                z22 = z18;
                                imageReceiver3 = imageReceiver;
                                j3Var2 = j3Var;
                                n3Var2 = n3Var;
                                if (this.A1 || (storyItem9 = c4Var.f13141a) == null || storyItem9.from_id == null) {
                                    a4Var3 = a4Var;
                                    storyDate = LocaleController.formatStoryDate(c4Var.f13141a.date);
                                    charSequence3 = storyDate;
                                    a4Var7 = a4Var3;
                                    if (c4Var.f13141a.edited) {
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(storyDate);
                                        ps psVar2 = new ps();
                                        psVar2.f31657b = AndroidUtilities.dp(1.5f);
                                        psVar2.f31658c = 5.0f;
                                        spannableStringBuilderValueOf.append((CharSequence) " . ").setSpan(psVar2, spannableStringBuilderValueOf.length() - 2, spannableStringBuilderValueOf.length() - 1, 0);
                                        spannableStringBuilderValueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                        charSequence3 = spannableStringBuilderValueOf;
                                        a4Var7 = a4Var3;
                                    }
                                    charSequence = charSequence3;
                                    z23 = z21;
                                    a4Var2 = a4Var7;
                                } else {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.f13296y2);
                                    SpannableString spannableString4 = new SpannableString("a");
                                    spannableString4.setSpan(g5Var2, 0, 1, 33);
                                    spannableStringBuilder5.append((CharSequence) spannableString4).append((CharSequence) " ");
                                    long peerDialogId = DialogObject.getPeerDialogId(c4Var.f13141a.from_id);
                                    if (peerDialogId > 0) {
                                        TLRPC.User user3 = MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(peerDialogId));
                                        g5Var2.e(user3);
                                        spannableStringBuilder5.append((CharSequence) UserObject.getUserName(user3));
                                        a4Var5 = a4Var;
                                    } else {
                                        a4Var4 = a4Var;
                                        TLRPC.Chat chat5 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-peerDialogId));
                                        g5Var2.b(chat5);
                                        if (chat5 != null) {
                                            a4Var5 = a4Var4;
                                            spannableStringBuilder5.append((CharSequence) chat5.title);
                                            a4Var5 = a4Var4;
                                        }
                                    }
                                    a4Var5 = a4Var4;
                                    a4Var5.setOnSubtitleClick(new gh.o(this, peerDialogId, 2));
                                    SpannableString spannableString5 = new SpannableString(".");
                                    ps psVar3 = new ps();
                                    psVar3.f31657b = AndroidUtilities.dp(1.5f);
                                    psVar3.f31658c = 5.0f;
                                    spannableString5.setSpan(psVar3, 0, spannableString5.length(), 33);
                                    spannableStringBuilder5.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.f13141a.date));
                                    spannableStringBuilder = spannableStringBuilder5;
                                    a4Var6 = a4Var5;
                                }
                            }
                            z23 = false;
                            a4Var2 = a4Var6;
                            charSequence = spannableStringBuilder;
                        }
                    }
                    if (charSequence != null) {
                        j6Var = i9Var.K0;
                        if (j6Var == null && (storyItem11 = c4Var.f13141a) != null && j6Var.m(storyItem11.f22617id)) {
                            if (!(charSequence instanceof SpannableStringBuilder)) {
                                spannableStringBuilder3 = charSequence;
                                spannableStringBuilder3 = new SpannableStringBuilder(charSequence);
                            }
                            spannableStringBuilder3 = charSequence;
                            SpannableString spannableString6 = new SpannableString("p ");
                            z24 = false;
                            spannableString6.setSpan(new cq(R.drawable.msg_pin_mini), 0, 1, 33);
                            ((SpannableStringBuilder) spannableStringBuilder3).insert(0, (CharSequence) spannableString6);
                            charSequence2 = spannableStringBuilder3;
                        } else {
                            z24 = false;
                            charSequence2 = charSequence;
                        }
                        a4Var2.c(charSequence2, z23);
                    } else {
                        z24 = false;
                    }
                    w3Var = this.B0;
                    if (w3Var != null) {
                        w3Var.e(z24);
                    }
                    w3Var2 = this.C0;
                    a4Var8 = a4Var2;
                    if (w3Var2 != null) {
                        w3Var2.e(z24);
                        a4Var8 = a4Var2;
                    }
                } else if (r6Var6.E) {
                    string = LocaleController.getString(R.string.FailedToUploadStory);
                } else {
                    string = l7.u(textViewArr[0], this.Q1);
                }
                z22 = z18;
                imageReceiver3 = imageReceiver;
                j3Var2 = j3Var;
                n3Var2 = n3Var;
                a4Var7 = a4Var;
                charSequence3 = string;
                charSequence = charSequence3;
                z23 = z21;
                a4Var2 = a4Var7;
                if (charSequence != null) {
                    j6Var = i9Var.K0;
                    if (j6Var == null) {
                        z24 = false;
                        charSequence2 = charSequence;
                    } else {
                        z24 = false;
                        charSequence2 = charSequence;
                    }
                    a4Var2.c(charSequence2, z23);
                } else {
                    z24 = false;
                }
                w3Var = this.B0;
                if (w3Var != null) {
                    w3Var.e(z24);
                }
                w3Var2 = this.C0;
                a4Var8 = a4Var2;
                if (w3Var2 != null) {
                    w3Var2.e(z24);
                    a4Var8 = a4Var2;
                }
            } else {
                z20 = z16;
                z22 = z18;
                imageReceiver3 = imageReceiver;
                j3Var2 = j3Var;
                n3Var2 = n3Var;
                a4Var8 = a4Var;
            }
            storyItem12 = c4Var.f13141a;
            if (storyItem6 == storyItem12 || r6Var4 != c4Var.f13142b) {
                c4Var.o();
            } else if (c4Var.f13146g != (storyItem12 != null && storyItem12.translated && storyItem12.translatedText != null && TextUtils.equals(storyItem12.translatedLng, b31.C()))) {
                c4Var.o();
            }
            if ((c4Var.f13146g || storyItem6 != c4Var.f13141a) && (y3Var = this.M1) != null) {
                i9 i9Var4 = ((z8) y3Var).d;
                i9Var4.V0 = false;
                i9Var4.P();
            }
            if (c4Var.f13145f || (d1Var6 = i9Var.f13512w0) == null || !c4Var.k(d1Var6.g()) || !i9Var.f13512w0.b()) {
                z25 = false;
            } else {
                z25 = true;
            }
            if (z25 != this.C1) {
                this.C1 = z25;
                if (z25) {
                    z0();
                }
                if (this.f13224c2 != null && (this.B1 || this.C1)) {
                    h1();
                }
                o2Var9 = this.X1;
                if (o2Var9 != null) {
                    o2Var9.setEnabled((this.B1 || c4Var.f13145f) && !this.C1);
                    z34 = true;
                    this.X1.O1(true);
                } else {
                    z34 = true;
                }
                r0(z34);
            }
            linearLayout = this.f13224c2;
            if (linearLayout != null) {
                linearLayout.setVisibility(((this.B1 || c4Var.f13145f) && !this.C1) ? 8 : 0);
            }
            z26 = this.Y2;
            linearLayout2 = this.K0;
            if (z26) {
                C0();
                A0();
                this.W2.setVisibility(0);
                this.X2.setVisibility(0);
                this.Q2 = false;
                this.P2 = false;
                this.O2 = false;
                o2Var8 = this.X1;
                if (o2Var8 != null) {
                    o2Var8.setVisibility(8);
                }
                z2Var4 = this.S1;
                if (z2Var4 != null) {
                    z2Var4.setVisibility(8);
                }
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
            } else {
                if (this.f13291x1 < 0) {
                    chat2 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
                } else {
                    chat2 = null;
                }
                if (c4Var.f13145f) {
                    if (this.X1 == null) {
                        v0();
                    }
                    u0();
                    y0();
                    x0();
                    this.X1.setVisibility(0);
                } else if ((!UserObject.isService(this.f13291x1) || I0()) && (o2Var2 = this.X1) != null) {
                    o2Var2.setVisibility(8);
                } else if (!this.f13295y1 && ((!this.f13299z1 || (this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) && (o2Var3 = this.X1) != null)) {
                    o2Var3.setVisibility(0);
                }
                o2Var4 = this.X1;
                if (o2Var4 != null) {
                    if (c4Var.f13145f) {
                        u1Var = new u1(this, 0);
                    } else {
                        u1Var = null;
                    }
                    o2Var4.setOnSendButtonLongClick(u1Var);
                    o2 o2Var10 = this.X1;
                    boolean z40 = c4Var.f13145f;
                    D0(true);
                    o2Var10.h1(z40);
                    o2 o2Var11 = this.X1;
                    if (c4Var.f13145f || D0(true) || !(this.f13268r2 || this.X1.S0)) {
                        z27 = false;
                    } else {
                        z27 = true;
                    }
                    o2Var11.n1(z27, true);
                }
                if (this.B1 && this.f13224c2 == null) {
                    z0();
                }
                if (this.f13224c2 != null) {
                    if (this.B1 || this.C1) {
                        h1();
                    }
                    this.f13224c2.setVisibility(((this.B1 || c4Var.f13145f) && !this.C1) ? 8 : 0);
                }
                o2Var5 = this.X1;
                if (o2Var5 != null) {
                    o2Var5.setEnabled((this.B1 || c4Var.f13145f) && !this.C1);
                }
                z2Var = this.S1;
                if (z2Var != null) {
                    if (this.f13295y1 || c4Var.f13145f) {
                        i16 = 8;
                    } else {
                        i16 = 0;
                    }
                    z2Var.setVisibility(i16);
                }
                frameLayout = this.W2;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                if (UserObject.isService(this.f13291x1)) {
                    A0();
                    this.X2.setVisibility(0);
                } else {
                    qVar = this.X2;
                    if (qVar != null) {
                        qVar.setVisibility(8);
                    }
                }
                if (linearLayout2 != null) {
                    if (I0()) {
                        i15 = 8;
                    } else {
                        i15 = 0;
                    }
                    linearLayout2.setVisibility(i15);
                }
            }
            gVar = this.Y1;
            if (gVar != null) {
                o2Var7 = this.X1;
                if (o2Var7 == null && o2Var7.getVisibility() == 0 && !c4Var.f13145f) {
                    i32 = 0;
                } else {
                    i32 = 8;
                }
                gVar.setVisibility(i32);
            }
            aVar = this.T1;
            g2Var = this.H0;
            if (aVar != null) {
                if (this.Y2 && c4Var.f13145f) {
                    i31 = 0;
                } else {
                    i31 = 8;
                }
                aVar.setVisibility(i31);
                this.T1.a(g2Var.g(), false);
                this.T1.setCount(g2Var.getUnreadMessagesCount());
            }
            n1Var = this.W1;
            if (n1Var != null) {
                if (this.Y2 && c4Var.f13145f && (d1Var5 = d1.S) != null && c4Var.k(d1Var5.g())) {
                    i30 = 0;
                } else {
                    i30 = 8;
                }
                n1Var.setVisibility(i30);
                n1 n1Var3 = this.W1;
                d1Var3 = d1.S;
                if (d1Var3 == null && d1Var3.o()) {
                    z32 = true;
                } else {
                    z32 = false;
                }
                n1Var3.b(z32, true);
                n1 n1Var4 = this.W1;
                d1Var4 = d1.S;
                if (d1Var4 != null || d1Var4.m()) {
                    z33 = true;
                } else {
                    z33 = false;
                }
                n1Var4.a(z33, true);
            }
            if (this.V1 != null) {
                q1 q1Var = this.U1;
                if (this.Y2 && c4Var.f13145f) {
                    i28 = 0;
                } else {
                    i28 = 8;
                }
                q1Var.setVisibility(i28);
                r1 r1Var = this.V1;
                if (this.Y2 && c4Var.f13145f) {
                    i29 = 0;
                } else {
                    i29 = 8;
                }
                r1Var.setVisibility(i29);
                layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
                n1Var2 = this.W1;
                if (n1Var2 == null && n1Var2.getVisibility() == 0) {
                    f12 = 54.0f;
                } else {
                    f12 = 7.0f;
                }
                iDp2 = AndroidUtilities.dp(f12);
                if (layoutParams.rightMargin != iDp2) {
                    layoutParams.rightMargin = iDp2;
                    this.V1.setLayoutParams(layoutParams);
                }
            }
            if (!c4Var.f13145f || ((c4Var.h == null && c4Var.i() == null && c4Var.g() == null) || this.Y2)) {
                n3 n3Var3 = n3Var2;
                if (this.G1) {
                    i9 i9Var5 = ((z8) this.M1).d;
                    i9Var5.H0 = false;
                    i9Var5.P();
                    y3 y3Var2 = this.M1;
                    this.f13234f3 = false;
                    ((z8) y3Var2).e();
                }
                n3Var3.setVisibility(8);
            } else {
                n3 n3Var4 = n3Var2;
                n3Var4.U.b(c4Var.h, c4Var.i(), c4Var.g(), i9Var.V0 && !c4Var.f13146g && (storyItem17 = c4Var.f13141a) != null && storyItem17.translated, storyItem6 == c4Var.f13141a);
                n3Var4.setVisibility(0);
            }
            storyItem13 = c4Var.f13141a;
            if (storyItem13 != null) {
                messageMedia3 = storyItem13.media;
                if (messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream) {
                    if (g2Var.r(this.f13291x1, ((TLRPC.TL_messageMediaVideoStream) messageMedia3).call)) {
                        g2Var.q(false, false);
                        this.H3 = 0L;
                        o2Var6 = this.X1;
                        if (o2Var6 != null) {
                            o2Var6.K(true);
                            this.X1.Q1();
                            r0(true);
                        }
                    }
                    g2Var.setVisibility(0);
                } else {
                    g2Var.r(this.f13291x1, null);
                    g2Var.setVisibility(8);
                }
            } else {
                g2Var.r(this.f13291x1, null);
                g2Var.setVisibility(8);
            }
            j3Var2.invalidate();
            if (this.M1 != null && K0()) {
                ((z8) this.M1).a(this.F1, this.f13291x1);
            }
            z28 = this.f13299z1;
            z2Var2 = this.L0;
            imageView = this.J0;
            z2Var3 = this.f13298z0;
            if (z28) {
                if (this.O2 || c4Var.f13145f) {
                    i25 = 4;
                } else {
                    i25 = 0;
                }
                imageView.setVisibility(i25);
                if (z2Var2 != null) {
                    if (this.P2 || c4Var.f13145f) {
                        i27 = 8;
                    } else {
                        i27 = 0;
                    }
                    z2Var2.setVisibility(i27);
                }
                if (!this.R1 || c4Var.f13145f) {
                    i26 = 8;
                } else {
                    i26 = 0;
                }
                z2Var3.setVisibility(i26);
            } else {
                if (this.O2 || c4Var.f13145f) {
                    i17 = 4;
                } else {
                    i17 = 0;
                }
                imageView.setVisibility(i17);
                if (z2Var2 != null) {
                    z2Var2.setVisibility(8);
                }
                if (!this.f13295y1 || c4Var.f13145f) {
                    i18 = 8;
                } else {
                    i18 = 0;
                }
                z2Var3.setVisibility(i18);
                z2Var3.getLayoutParams().width = AndroidUtilities.dp(40.0f);
            }
            z2Var3.requestLayout();
            i9Var.f13466a1.append(this.f13291x1, i10);
            if (this.G1) {
                R0(0L);
                g1();
                imageReceiver3.bumpPriority();
            }
            g2Var.setLivePlayer(i9Var.f13512w0);
            this.H1 = 0;
            if (i9Var.K0 != null && (storyItem16 = c4Var.f13141a) != null) {
                int i36 = storyItem16.f22617id;
                for (i24 = 0; i24 < i9Var.K0.f13540i.size(); i24++) {
                    messageObject = (MessageObject) i9Var.K0.f13540i.get(i24);
                    if (messageObject == null && messageObject.getId() == i36) {
                        this.H1 = i24;
                        break;
                    }
                }
            }
            i19 = this.F1;
            this.I1 = i19;
            i20 = this.f13287w1;
            this.J1 = i20;
            if (i9Var.N0) {
                this.I1 = (i20 - 1) - i19;
            }
            zL = c4Var.l();
            dVar = this.f13278u0;
            if (zL) {
                dVar.setVisibility(0);
                if (c4Var.j()) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.5f;
                }
                this.a3 = f11;
                zJ = c4Var.j();
                imageView4 = this.f13286w0;
                ri0Var = this.f13282v0;
                if (zJ) {
                    ri0Var.setVisibility(0);
                    imageView4.setVisibility(8);
                    if (i9.f13463z1) {
                        i23 = R.string.Unmute;
                    } else {
                        i23 = R.string.Mute;
                    }
                    dVar.setContentDescription(LocaleController.getString(i23));
                } else {
                    ri0Var.setVisibility(8);
                    imageView4.setVisibility(0);
                    dVar.setContentDescription(LocaleController.getString(R.string.NoSound));
                }
                dVar.setAlpha((1.0f - this.Z3) * this.a3);
            } else {
                dVar.setVisibility(8);
            }
            r6Var7 = c4Var.f13142b;
            n8Var = this.f13294y0;
            if (r6Var7 != null) {
                boolean z41 = this.f13295y1;
                if (z20 || !this.X3) {
                    z31 = false;
                } else {
                    z31 = true;
                }
                n8Var.a(z41, r6Var7, z31);
            } else {
                storyItem14 = c4Var.f13141a;
                if (storyItem14 != null) {
                    boolean z42 = this.f13295y1;
                    if (z20 || !this.X3) {
                        z30 = false;
                    } else {
                        z30 = true;
                    }
                    n8Var.b(z42, storyItem14, z30);
                } else {
                    boolean z43 = this.f13295y1;
                    if (z20 || !this.X3) {
                        z29 = false;
                    } else {
                        z29 = true;
                    }
                    n8Var.b(z43, null, z29);
                }
            }
            this.X3 = false;
            if (dVar.getVisibility() == 0) {
                f10 = -AndroidUtilities.dp(44.0f);
            } else {
                f10 = 0.0f;
            }
            n8Var.setTranslationX(f10);
            if (z22) {
                this.f13254m3 = false;
                storyItem15 = c4Var.f13141a;
                if (storyItem15 != null || (reaction = storyItem15.sent_reaction) == null) {
                    this.A0.setReaction(null);
                } else {
                    this.A0.setReaction(ig.q0.d(reaction));
                }
            }
            r6Var8 = c4Var.f13142b;
            if (r6Var8 == null && r6Var8.E) {
                w0();
                this.f13233f2.set(c4Var.f13142b.f13907c.f17240x);
                this.f13233f2.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimator2 = this.f13236g2;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    this.f13236g2 = null;
                }
                if (z20) {
                    ViewPropertyAnimator interpolator = this.f13233f2.animate().alpha(1.0f).setDuration(180L).setInterpolator(er.h);
                    this.f13236g2 = interpolator;
                    interpolator.start();
                } else {
                    this.f13233f2.setAlpha(1.0f);
                }
            } else if (this.f13233f2 != null) {
                viewPropertyAnimator = this.f13236g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f13236g2 = null;
                }
                if (z20 || this.f13233f2.getVisibility() != 0) {
                    this.f13233f2.setAlpha(0.0f);
                    this.f13233f2.setVisibility(8);
                } else {
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.f13233f2.animate().alpha(0.0f).setDuration(180L).setInterpolator(er.h).withEndAction(new v1(this, 0));
                    this.f13236g2 = viewPropertyAnimatorWithEndAction;
                    viewPropertyAnimatorWithEndAction.start();
                }
            }
            this.f13275t1.a(i9.f13463z1, false);
            if (this.G1 && c4Var.f13141a != null) {
                FileLog.d("StoryViewer displayed story dialogId=" + this.f13291x1 + " storyId=" + c4Var.f13141a.f22617id + " " + c4.c(c4Var));
            }
            if (this.f13295y1) {
                c5.f(this.f13296y2, this.f13291x1, c4Var.f13141a);
            }
            eg.c cVar = a4Var8.f13034b;
            j6Var2 = i9Var.K0;
            if (j6Var2 != null || j6Var2.g() == this.J1) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(56.0f);
            }
            cVar.setPadding(0, 0, iDp, 0);
            MessagesController.getInstance(this.f13296y2).getTranslateController().detectStoryLanguage(c4Var.f13141a);
            if (!z10 && !this.f13295y1 && this.f13285v3 == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
                v1 v1Var = new v1(this, 1);
                this.f13285v3 = v1Var;
                AndroidUtilities.runOnUIThread(v1Var, 500L);
            }
            w3Var3 = this.C0;
            if ((w3Var3 != null || !w3Var3.R) && c4Var.j() && i9.f13463z1) {
                if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                    AndroidUtilities.cancelRunOnUIThread(this.N3);
                    AndroidUtilities.runOnUIThread(this.N3, 250L);
                }
            }
            imageView2 = this.f13270s0;
            if (imageView2 != null) {
                if (I0() || J0() || c4Var.f13144e) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                imageView2.setVisibility(i22);
            }
            imageView3 = this.f13274t0;
            if (imageView3 != null) {
                if (c4Var.f13145f || n8Var.f13710f) {
                    i21 = 8;
                } else {
                    i21 = 0;
                }
                imageView3.setVisibility(i21);
            }
        }
        lh.z7 z7Var3 = r6Var.f13907c;
        this.Q1 = false;
        boolean z44 = r6Var.E;
        this.R1 = z44;
        this.P1 = !z44;
        y2Var.setCrossfadeWithOldImage(false);
        y2Var.setCrossfadeDuration(150);
        Bitmap bitmap = z7Var3.f17198b1;
        if (bitmap != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
            Utilities.blurBitmap(bitmapCreateBitmap, 3);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
        } else {
            bitmapDrawable = null;
        }
        if (r6Var.f13912s || r6Var.D) {
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            imageReceiver = y2Var;
            syVar2 = syVar3;
            z11 = z35;
            z12 = z36;
            z13 = z37;
            i9Var2 = i9Var3;
            i10 = i35;
            r10 = 0;
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f13909f), strS, null, null, bitmapDrawable2, 0L, null, null, 0);
        } else {
            BitmapDrawable bitmapDrawable3 = bitmapDrawable;
            imageReceiver = y2Var;
            r10 = 0;
            syVar2 = syVar3;
            z11 = z35;
            z13 = z37;
            z12 = z36;
            i9Var2 = i9Var3;
            i10 = i35;
            imageReceiver.setImage(null, null, ImageLocation.getForPath(r6Var.f13908e), strS, null, null, bitmapDrawable3, 0L, null, null, 0);
        }
        c4Var.f13142b = r6Var;
        c4Var.f13148j = r10;
        c4Var.f13147i = r10;
        c4Var.f13141a = r10;
        c4Var.d = false;
        c4Var.f13144e = c4Var.m();
        TL_stories.StoryItem storyItem24 = c4Var.f13141a;
        c4Var.f13145f = (storyItem24 == null || (messageMedia4 = storyItem24.media) == null || !(messageMedia4 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
        syVar = syVar2;
        f3Var.c(r10, m8.a(z7Var3), syVar);
        this.Q2 = false;
        this.P2 = false;
        this.O2 = false;
        i9 i9Var6 = i9Var2;
        storyItem18 = storyItem18;
        i9Var = i9Var6;
        z14 = z12;
        storyItem4 = c4Var.f13141a;
        if (storyItem4 != null) {
            i9Var.L0 = storyItem4.f22617id;
        }
        i9Var.f13487j0.A();
        this.U2 = true;
        if (this.f13295y1) {
            k1(false);
        } else {
            k1(false);
        }
        storyItem5 = c4Var.f13141a;
        r6Var3 = c4Var.f13142b;
        if (storyItem5 != null) {
            i11 = storyItem5.f22617id;
        } else if (r6Var3 != null) {
            i11 = 0;
        } else {
            i11 = 0;
        }
        if (storyItem18 != null) {
            storyItem6 = storyItem18;
            i12 = storyItem6.f22617id;
            r6Var4 = r6Var9;
        } else {
            storyItem6 = storyItem18;
            r6Var4 = r6Var9;
            if (r6Var9 != null) {
                i12 = 0;
            } else {
                i12 = 0;
            }
        }
        if (i11 == i12) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (z16) {
            z17 = false;
        } else {
            z17 = false;
        }
        d1Var = i9Var.f13512w0;
        if (d1Var != null) {
            i33 = this.M3;
            groupCall2 = d1Var.v;
            if (groupCall2 == null) {
                i34 = 0;
            } else {
                i34 = groupCall2.participants_count;
            }
            if (i33 != Math.max(1, i34)) {
                z18 = true;
            } else {
                z18 = false;
            }
        } else {
            z18 = false;
        }
        j3Var = this.Y0;
        n3Var = this.G0;
        a4Var = this.f13247k1;
        if (r6Var4 != null) {
            o2Var = this.X1;
            if (o2Var != null) {
                if (storyItem6 != null) {
                    i9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                }
                this.X1.getEditField().setText(i9.u(this.f13291x1, c4Var.f13141a));
                if (c4Var.f13145f) {
                    z19 = false;
                    this.X1.U0(false, false, false);
                } else {
                    z19 = false;
                    this.X1.U0(true, true, false);
                }
            } else {
                z19 = false;
            }
            if (c4Var.f13145f) {
                M0();
            }
            syVar.c();
            this.S0 = 0L;
            this.U0 = z19;
            r6Var5 = c4Var.f13142b;
            if (r6Var5 != null) {
                si0Var = a4Var.d;
                if (si0Var != null) {
                    si0Var.e(r6Var5.h, z19);
                }
                a4Var.f13033a.invalidate();
            } else if (!z17) {
                a4Var.h = 0.0f;
            }
            ecVar = ec.f28012w;
            if (ecVar != null) {
                ecVar.b();
            }
            n3Var.J();
            q0();
            z18 = true;
        } else {
            o2Var = this.X1;
            if (o2Var != null) {
                if (storyItem6 != null) {
                    i9.J(storyItem6.dialogId, storyItem6, this.X1.getEditField().getText());
                }
                this.X1.getEditField().setText(i9.u(this.f13291x1, c4Var.f13141a));
                if (c4Var.f13145f) {
                    z19 = false;
                    this.X1.U0(false, false, false);
                } else {
                    z19 = false;
                    this.X1.U0(true, true, false);
                }
            } else {
                z19 = false;
            }
            if (c4Var.f13145f) {
                M0();
            }
            syVar.c();
            this.S0 = 0L;
            this.U0 = z19;
            r6Var5 = c4Var.f13142b;
            if (r6Var5 != null) {
                si0Var = a4Var.d;
                if (si0Var != null) {
                    si0Var.e(r6Var5.h, z19);
                }
                a4Var.f13033a.invalidate();
            } else if (!z17) {
                a4Var.h = 0.0f;
            }
            ecVar = ec.f28012w;
            if (ecVar != null) {
                ecVar.b();
            }
            n3Var.J();
            q0();
            z18 = true;
        }
        if (z18) {
            a4Var.setOnSubtitleClick(null);
            textViewArr = a4Var.f13035c;
            this.M3 = 0;
            z20 = z16;
            z21 = z17;
            W0(this.f13291x1, false, c4Var.f13145f);
            r6Var6 = c4Var.f13142b;
            if (r6Var6 == null) {
                if (I0()) {
                    storyItem10 = c4Var.f13141a;
                    if (storyItem10 != null) {
                        document = messageMedia2.document;
                        if (document != null) {
                            string = LocaleController.formatStoryDate(document.date);
                        } else {
                            photo = messageMedia2.photo;
                            if (photo != null) {
                                string = LocaleController.formatStoryDate(photo.date);
                            }
                        }
                    }
                    z22 = z18;
                    imageReceiver3 = imageReceiver;
                    j3Var2 = j3Var;
                    n3Var2 = n3Var;
                    a4Var2 = a4Var;
                    z23 = z21;
                    charSequence = "";
                } else {
                    storyItem8 = c4Var.f13141a;
                    if (storyItem8 == null) {
                        z22 = z18;
                        imageReceiver3 = imageReceiver;
                        j3Var2 = j3Var;
                        n3Var2 = n3Var;
                        a4Var2 = a4Var;
                        z23 = z21;
                        charSequence = null;
                    } else if (storyItem8.media instanceof TLRPC.TL_messageMediaVideoStream) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                        spannableStringBuilder6.setSpan(new b3(), 0, spannableStringBuilder6.length(), 33);
                        spannableStringBuilder6.append((CharSequence) "  ");
                        d1Var2 = i9Var.f13512w0;
                        if (d1Var2 != null) {
                            groupCall = d1Var2.v;
                            if (groupCall == null) {
                                i14 = 0;
                            } else {
                                i14 = groupCall.participants_count;
                            }
                            i13 = 1;
                            this.M3 = Math.max(1, i14);
                        } else {
                            i13 = 1;
                        }
                        spannableStringBuilder6.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i13, this.M3)));
                        string = spannableStringBuilder6;
                    } else if (storyItem8.date == -1) {
                        string = LocaleController.getString(R.string.CachedStory);
                    } else {
                        if (c4Var.i() != null) {
                            v7VarI = c4Var.i();
                            spannableStringBuilder2 = new SpannableStringBuilder();
                            z22 = z18;
                            imageReceiver3 = imageReceiver;
                            SpannableString spannableString7 = new SpannableString("r");
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            spannableString7.setSpan(new cq(R.drawable.mini_repost_story), 0, spannableString7.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString7).append((CharSequence) " ");
                            if (v7VarI.f14059b != null) {
                                g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.f13296y2);
                                SpannableString spannableString8 = new SpannableString("a");
                                spannableString8.setSpan(g5Var, 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) spannableString8).append((CharSequence) " ");
                                if (v7VarI.f14059b.longValue() > 0) {
                                    TLRPC.User user4 = MessagesController.getInstance(this.f13296y2).getUser(v7VarI.f14059b);
                                    g5Var.e(user4);
                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user4));
                                } else {
                                    chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-v7VarI.f14059b.longValue()));
                                    g5Var.b(chat);
                                    if (chat != null) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    }
                                }
                            } else {
                                str = c4Var.f13141a.fwd_from.from_name;
                                if (str != null) {
                                    spannableStringBuilder2.append((CharSequence) str);
                                }
                            }
                            a4Var.setOnSubtitleClick(new ag.q0(23, this, v7VarI));
                            SpannableString spannableString9 = new SpannableString(".");
                            ps psVar4 = new ps();
                            psVar4.f31657b = AndroidUtilities.dp(1.5f);
                            psVar4.f31658c = 5.0f;
                            spannableString9.setSpan(psVar4, 0, spannableString9.length(), 33);
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString9).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.f13141a.date));
                            a4Var6 = a4Var;
                            spannableStringBuilder = spannableStringBuilder2;
                        } else {
                            z22 = z18;
                            imageReceiver3 = imageReceiver;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            if (this.A1) {
                            }
                            a4Var3 = a4Var;
                            storyDate = LocaleController.formatStoryDate(c4Var.f13141a.date);
                            charSequence3 = storyDate;
                            a4Var7 = a4Var3;
                            if (c4Var.f13141a.edited) {
                                SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(storyDate);
                                ps psVar5 = new ps();
                                psVar5.f31657b = AndroidUtilities.dp(1.5f);
                                psVar5.f31658c = 5.0f;
                                spannableStringBuilderValueOf2.append((CharSequence) " . ").setSpan(psVar5, spannableStringBuilderValueOf2.length() - 2, spannableStringBuilderValueOf2.length() - 1, 0);
                                spannableStringBuilderValueOf2.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                charSequence3 = spannableStringBuilderValueOf2;
                                a4Var7 = a4Var3;
                            }
                            charSequence = charSequence3;
                            z23 = z21;
                            a4Var2 = a4Var7;
                        }
                        z23 = false;
                        a4Var2 = a4Var6;
                        charSequence = spannableStringBuilder;
                    }
                }
                if (charSequence != null) {
                    j6Var = i9Var.K0;
                    if (j6Var == null) {
                        z24 = false;
                        charSequence2 = charSequence;
                    } else {
                        z24 = false;
                        charSequence2 = charSequence;
                    }
                    a4Var2.c(charSequence2, z23);
                } else {
                    z24 = false;
                }
                w3Var = this.B0;
                if (w3Var != null) {
                    w3Var.e(z24);
                }
                w3Var2 = this.C0;
                a4Var8 = a4Var2;
                if (w3Var2 != null) {
                    w3Var2.e(z24);
                    a4Var8 = a4Var2;
                }
            } else if (r6Var6.E) {
                string = LocaleController.getString(R.string.FailedToUploadStory);
            } else {
                string = l7.u(textViewArr[0], this.Q1);
            }
            z22 = z18;
            imageReceiver3 = imageReceiver;
            j3Var2 = j3Var;
            n3Var2 = n3Var;
            a4Var7 = a4Var;
            charSequence3 = string;
            charSequence = charSequence3;
            z23 = z21;
            a4Var2 = a4Var7;
            if (charSequence != null) {
                j6Var = i9Var.K0;
                if (j6Var == null) {
                    z24 = false;
                    charSequence2 = charSequence;
                } else {
                    z24 = false;
                    charSequence2 = charSequence;
                }
                a4Var2.c(charSequence2, z23);
            } else {
                z24 = false;
            }
            w3Var = this.B0;
            if (w3Var != null) {
                w3Var.e(z24);
            }
            w3Var2 = this.C0;
            a4Var8 = a4Var2;
            if (w3Var2 != null) {
                w3Var2.e(z24);
                a4Var8 = a4Var2;
            }
        } else {
            a4Var.setOnSubtitleClick(null);
            textViewArr = a4Var.f13035c;
            this.M3 = 0;
            z20 = z16;
            z21 = z17;
            W0(this.f13291x1, false, c4Var.f13145f);
            r6Var6 = c4Var.f13142b;
            if (r6Var6 == null) {
                if (I0()) {
                    storyItem10 = c4Var.f13141a;
                    if (storyItem10 != null) {
                        document = messageMedia2.document;
                        if (document != null) {
                            string = LocaleController.formatStoryDate(document.date);
                        } else {
                            photo = messageMedia2.photo;
                            if (photo != null) {
                                string = LocaleController.formatStoryDate(photo.date);
                            }
                        }
                    }
                    z22 = z18;
                    imageReceiver3 = imageReceiver;
                    j3Var2 = j3Var;
                    n3Var2 = n3Var;
                    a4Var2 = a4Var;
                    z23 = z21;
                    charSequence = "";
                } else {
                    storyItem8 = c4Var.f13141a;
                    if (storyItem8 == null) {
                        z22 = z18;
                        imageReceiver3 = imageReceiver;
                        j3Var2 = j3Var;
                        n3Var2 = n3Var;
                        a4Var2 = a4Var;
                        z23 = z21;
                        charSequence = null;
                    } else if (storyItem8.media instanceof TLRPC.TL_messageMediaVideoStream) {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                        spannableStringBuilder7.setSpan(new b3(), 0, spannableStringBuilder7.length(), 33);
                        spannableStringBuilder7.append((CharSequence) "  ");
                        d1Var2 = i9Var.f13512w0;
                        if (d1Var2 != null) {
                            groupCall = d1Var2.v;
                            if (groupCall == null) {
                                i14 = 0;
                            } else {
                                i14 = groupCall.participants_count;
                            }
                            i13 = 1;
                            this.M3 = Math.max(1, i14);
                        } else {
                            i13 = 1;
                        }
                        spannableStringBuilder7.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i13, this.M3)));
                        string = spannableStringBuilder7;
                    } else if (storyItem8.date == -1) {
                        string = LocaleController.getString(R.string.CachedStory);
                    } else {
                        if (c4Var.i() != null) {
                            v7VarI = c4Var.i();
                            spannableStringBuilder2 = new SpannableStringBuilder();
                            z22 = z18;
                            imageReceiver3 = imageReceiver;
                            SpannableString spannableString10 = new SpannableString("r");
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            spannableString10.setSpan(new cq(R.drawable.mini_repost_story), 0, spannableString10.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString10).append((CharSequence) " ");
                            if (v7VarI.f14059b != null) {
                                g5Var = new org.telegram.ui.g5(textViewArr[0], 15.0f, this.f13296y2);
                                SpannableString spannableString11 = new SpannableString("a");
                                spannableString11.setSpan(g5Var, 0, 1, 33);
                                spannableStringBuilder2.append((CharSequence) spannableString11).append((CharSequence) " ");
                                if (v7VarI.f14059b.longValue() > 0) {
                                    TLRPC.User user5 = MessagesController.getInstance(this.f13296y2).getUser(v7VarI.f14059b);
                                    g5Var.e(user5);
                                    spannableStringBuilder2.append((CharSequence) UserObject.getUserName(user5));
                                } else {
                                    chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-v7VarI.f14059b.longValue()));
                                    g5Var.b(chat);
                                    if (chat != null) {
                                        spannableStringBuilder2.append((CharSequence) chat.title);
                                    }
                                }
                            } else {
                                str = c4Var.f13141a.fwd_from.from_name;
                                if (str != null) {
                                    spannableStringBuilder2.append((CharSequence) str);
                                }
                            }
                            a4Var.setOnSubtitleClick(new ag.q0(23, this, v7VarI));
                            SpannableString spannableString12 = new SpannableString(".");
                            ps psVar6 = new ps();
                            psVar6.f31657b = AndroidUtilities.dp(1.5f);
                            psVar6.f31658c = 5.0f;
                            spannableString12.setSpan(psVar6, 0, spannableString12.length(), 33);
                            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) spannableString12).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(c4Var.f13141a.date));
                            a4Var6 = a4Var;
                            spannableStringBuilder = spannableStringBuilder2;
                        } else {
                            z22 = z18;
                            imageReceiver3 = imageReceiver;
                            j3Var2 = j3Var;
                            n3Var2 = n3Var;
                            if (this.A1) {
                            }
                            a4Var3 = a4Var;
                            storyDate = LocaleController.formatStoryDate(c4Var.f13141a.date);
                            charSequence3 = storyDate;
                            a4Var7 = a4Var3;
                            if (c4Var.f13141a.edited) {
                                SpannableStringBuilder spannableStringBuilderValueOf3 = SpannableStringBuilder.valueOf(storyDate);
                                ps psVar7 = new ps();
                                psVar7.f31657b = AndroidUtilities.dp(1.5f);
                                psVar7.f31658c = 5.0f;
                                spannableStringBuilderValueOf3.append((CharSequence) " . ").setSpan(psVar7, spannableStringBuilderValueOf3.length() - 2, spannableStringBuilderValueOf3.length() - 1, 0);
                                spannableStringBuilderValueOf3.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                charSequence3 = spannableStringBuilderValueOf3;
                                a4Var7 = a4Var3;
                            }
                            charSequence = charSequence3;
                            z23 = z21;
                            a4Var2 = a4Var7;
                        }
                        z23 = false;
                        a4Var2 = a4Var6;
                        charSequence = spannableStringBuilder;
                    }
                }
                if (charSequence != null) {
                    j6Var = i9Var.K0;
                    if (j6Var == null) {
                        z24 = false;
                        charSequence2 = charSequence;
                    } else {
                        z24 = false;
                        charSequence2 = charSequence;
                    }
                    a4Var2.c(charSequence2, z23);
                } else {
                    z24 = false;
                }
                w3Var = this.B0;
                if (w3Var != null) {
                    w3Var.e(z24);
                }
                w3Var2 = this.C0;
                a4Var8 = a4Var2;
                if (w3Var2 != null) {
                    w3Var2.e(z24);
                    a4Var8 = a4Var2;
                }
            } else if (r6Var6.E) {
                string = LocaleController.getString(R.string.FailedToUploadStory);
            } else {
                string = l7.u(textViewArr[0], this.Q1);
            }
            z22 = z18;
            imageReceiver3 = imageReceiver;
            j3Var2 = j3Var;
            n3Var2 = n3Var;
            a4Var7 = a4Var;
            charSequence3 = string;
            charSequence = charSequence3;
            z23 = z21;
            a4Var2 = a4Var7;
            if (charSequence != null) {
                j6Var = i9Var.K0;
                if (j6Var == null) {
                    z24 = false;
                    charSequence2 = charSequence;
                } else {
                    z24 = false;
                    charSequence2 = charSequence;
                }
                a4Var2.c(charSequence2, z23);
            } else {
                z24 = false;
            }
            w3Var = this.B0;
            if (w3Var != null) {
                w3Var.e(z24);
            }
            w3Var2 = this.C0;
            a4Var8 = a4Var2;
            if (w3Var2 != null) {
                w3Var2.e(z24);
                a4Var8 = a4Var2;
            }
        }
        storyItem12 = c4Var.f13141a;
        if (storyItem6 == storyItem12) {
            c4Var.o();
        } else {
            c4Var.o();
        }
        if (c4Var.f13146g) {
            i9 i9Var7 = ((z8) y3Var).d;
            i9Var7.V0 = false;
            i9Var7.P();
        } else {
            i9 i9Var8 = ((z8) y3Var).d;
            i9Var8.V0 = false;
            i9Var8.P();
        }
        if (c4Var.f13145f) {
            z25 = false;
        } else {
            z25 = false;
        }
        if (z25 != this.C1) {
            this.C1 = z25;
            if (z25) {
                z0();
            }
            if (this.f13224c2 != null) {
                h1();
            }
            o2Var9 = this.X1;
            if (o2Var9 != null) {
                o2Var9.setEnabled((this.B1 || c4Var.f13145f) && !this.C1);
                z34 = true;
                this.X1.O1(true);
            } else {
                z34 = true;
            }
            r0(z34);
        }
        linearLayout = this.f13224c2;
        if (linearLayout != null) {
            linearLayout.setVisibility(((this.B1 || c4Var.f13145f) && !this.C1) ? 8 : 0);
        }
        z26 = this.Y2;
        linearLayout2 = this.K0;
        if (z26) {
            C0();
            A0();
            this.W2.setVisibility(0);
            this.X2.setVisibility(0);
            this.Q2 = false;
            this.P2 = false;
            this.O2 = false;
            o2Var8 = this.X1;
            if (o2Var8 != null) {
                o2Var8.setVisibility(8);
            }
            z2Var4 = this.S1;
            if (z2Var4 != null) {
                z2Var4.setVisibility(8);
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        } else {
            if (this.f13291x1 < 0) {
                chat2 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
            } else {
                chat2 = null;
            }
            if (c4Var.f13145f) {
                if (this.X1 == null) {
                    v0();
                }
                u0();
                y0();
                x0();
                this.X1.setVisibility(0);
            } else if (UserObject.isService(this.f13291x1)) {
                o2Var2.setVisibility(8);
            } else {
                o2Var2.setVisibility(8);
            }
            o2Var4 = this.X1;
            if (o2Var4 != null) {
                if (c4Var.f13145f) {
                    u1Var = new u1(this, 0);
                } else {
                    u1Var = null;
                }
                o2Var4.setOnSendButtonLongClick(u1Var);
                o2 o2Var12 = this.X1;
                boolean z45 = c4Var.f13145f;
                D0(true);
                o2Var12.h1(z45);
                o2 o2Var13 = this.X1;
                if (c4Var.f13145f) {
                    z27 = false;
                } else {
                    z27 = false;
                }
                o2Var13.n1(z27, true);
            }
            if (this.B1) {
                z0();
            }
            if (this.f13224c2 != null) {
                if (this.B1) {
                    h1();
                } else {
                    h1();
                }
                this.f13224c2.setVisibility(((this.B1 || c4Var.f13145f) && !this.C1) ? 8 : 0);
            }
            o2Var5 = this.X1;
            if (o2Var5 != null) {
                o2Var5.setEnabled((this.B1 || c4Var.f13145f) && !this.C1);
            }
            z2Var = this.S1;
            if (z2Var != null) {
                if (this.f13295y1) {
                    i16 = 8;
                } else {
                    i16 = 8;
                }
                z2Var.setVisibility(i16);
            }
            frameLayout = this.W2;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (UserObject.isService(this.f13291x1)) {
                A0();
                this.X2.setVisibility(0);
            } else {
                qVar = this.X2;
                if (qVar != null) {
                    qVar.setVisibility(8);
                }
            }
            if (linearLayout2 != null) {
                if (I0()) {
                    i15 = 8;
                } else {
                    i15 = 0;
                }
                linearLayout2.setVisibility(i15);
            }
        }
        gVar = this.Y1;
        if (gVar != null) {
            o2Var7 = this.X1;
            if (o2Var7 == null) {
                i32 = 8;
            } else {
                i32 = 8;
            }
            gVar.setVisibility(i32);
        }
        aVar = this.T1;
        g2Var = this.H0;
        if (aVar != null) {
            if (this.Y2) {
                i31 = 8;
            } else {
                i31 = 8;
            }
            aVar.setVisibility(i31);
            this.T1.a(g2Var.g(), false);
            this.T1.setCount(g2Var.getUnreadMessagesCount());
        }
        n1Var = this.W1;
        if (n1Var != null) {
            if (this.Y2) {
                i30 = 8;
            } else {
                i30 = 8;
            }
            n1Var.setVisibility(i30);
            n1 n1Var5 = this.W1;
            d1Var3 = d1.S;
            if (d1Var3 == null) {
                z32 = false;
            } else {
                z32 = false;
            }
            n1Var5.b(z32, true);
            n1 n1Var6 = this.W1;
            d1Var4 = d1.S;
            if (d1Var4 != null) {
                z33 = true;
            } else {
                z33 = true;
            }
            n1Var6.a(z33, true);
        }
        if (this.V1 != null) {
            q1 q1Var2 = this.U1;
            if (this.Y2) {
                i28 = 8;
            } else {
                i28 = 8;
            }
            q1Var2.setVisibility(i28);
            r1 r1Var2 = this.V1;
            if (this.Y2) {
                i29 = 8;
            } else {
                i29 = 8;
            }
            r1Var2.setVisibility(i29);
            layoutParams = (FrameLayout.LayoutParams) this.V1.getLayoutParams();
            n1Var2 = this.W1;
            if (n1Var2 == null) {
                f12 = 7.0f;
            } else {
                f12 = 7.0f;
            }
            iDp2 = AndroidUtilities.dp(f12);
            if (layoutParams.rightMargin != iDp2) {
                layoutParams.rightMargin = iDp2;
                this.V1.setLayoutParams(layoutParams);
            }
        }
        if (c4Var.f13145f) {
            n3 n3Var5 = n3Var2;
            if (this.G1) {
                i9 i9Var9 = ((z8) this.M1).d;
                i9Var9.H0 = false;
                i9Var9.P();
                y3 y3Var3 = this.M1;
                this.f13234f3 = false;
                ((z8) y3Var3).e();
            }
            n3Var5.setVisibility(8);
        } else {
            n3 n3Var6 = n3Var2;
            if (this.G1) {
                i9 i9Var10 = ((z8) this.M1).d;
                i9Var10.H0 = false;
                i9Var10.P();
                y3 y3Var4 = this.M1;
                this.f13234f3 = false;
                ((z8) y3Var4).e();
            }
            n3Var6.setVisibility(8);
        }
        storyItem13 = c4Var.f13141a;
        if (storyItem13 != null) {
            messageMedia3 = storyItem13.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream) {
                if (g2Var.r(this.f13291x1, ((TLRPC.TL_messageMediaVideoStream) messageMedia3).call)) {
                    g2Var.q(false, false);
                    this.H3 = 0L;
                    o2Var6 = this.X1;
                    if (o2Var6 != null) {
                        o2Var6.K(true);
                        this.X1.Q1();
                        r0(true);
                    }
                }
                g2Var.setVisibility(0);
            } else {
                g2Var.r(this.f13291x1, null);
                g2Var.setVisibility(8);
            }
        } else {
            g2Var.r(this.f13291x1, null);
            g2Var.setVisibility(8);
        }
        j3Var2.invalidate();
        if (this.M1 != null) {
            ((z8) this.M1).a(this.F1, this.f13291x1);
        }
        z28 = this.f13299z1;
        z2Var2 = this.L0;
        imageView = this.J0;
        z2Var3 = this.f13298z0;
        if (z28) {
            if (this.O2) {
                i25 = 4;
            } else {
                i25 = 4;
            }
            imageView.setVisibility(i25);
            if (z2Var2 != null) {
                if (this.P2) {
                    i27 = 8;
                } else {
                    i27 = 8;
                }
                z2Var2.setVisibility(i27);
            }
            if (this.R1) {
                i26 = 8;
            } else {
                i26 = 8;
            }
            z2Var3.setVisibility(i26);
        } else {
            if (this.O2) {
                i17 = 4;
            } else {
                i17 = 4;
            }
            imageView.setVisibility(i17);
            if (z2Var2 != null) {
                z2Var2.setVisibility(8);
            }
            if (this.f13295y1) {
                i18 = 8;
            } else {
                i18 = 8;
            }
            z2Var3.setVisibility(i18);
            z2Var3.getLayoutParams().width = AndroidUtilities.dp(40.0f);
        }
        z2Var3.requestLayout();
        i9Var.f13466a1.append(this.f13291x1, i10);
        if (this.G1) {
            R0(0L);
            g1();
            imageReceiver3.bumpPriority();
        }
        g2Var.setLivePlayer(i9Var.f13512w0);
        this.H1 = 0;
        if (i9Var.K0 != null) {
            int i37 = storyItem16.f22617id;
            while (i24 < i9Var.K0.f13540i.size()) {
                messageObject = (MessageObject) i9Var.K0.f13540i.get(i24);
                if (messageObject == null) {
                }
            }
        }
        i19 = this.F1;
        this.I1 = i19;
        i20 = this.f13287w1;
        this.J1 = i20;
        if (i9Var.N0) {
            this.I1 = (i20 - 1) - i19;
        }
        zL = c4Var.l();
        dVar = this.f13278u0;
        if (zL) {
            dVar.setVisibility(0);
            if (c4Var.j()) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            this.a3 = f11;
            zJ = c4Var.j();
            imageView4 = this.f13286w0;
            ri0Var = this.f13282v0;
            if (zJ) {
                ri0Var.setVisibility(0);
                imageView4.setVisibility(8);
                if (i9.f13463z1) {
                    i23 = R.string.Mute;
                } else {
                    i23 = R.string.Unmute;
                }
                dVar.setContentDescription(LocaleController.getString(i23));
            } else {
                ri0Var.setVisibility(8);
                imageView4.setVisibility(0);
                dVar.setContentDescription(LocaleController.getString(R.string.NoSound));
            }
            dVar.setAlpha((1.0f - this.Z3) * this.a3);
        } else {
            dVar.setVisibility(8);
        }
        r6Var7 = c4Var.f13142b;
        n8Var = this.f13294y0;
        if (r6Var7 != null) {
            boolean z46 = this.f13295y1;
            if (z20) {
                z31 = false;
            } else {
                z31 = false;
            }
            n8Var.a(z46, r6Var7, z31);
        } else {
            storyItem14 = c4Var.f13141a;
            if (storyItem14 != null) {
                boolean z47 = this.f13295y1;
                if (z20) {
                    z30 = false;
                } else {
                    z30 = false;
                }
                n8Var.b(z47, storyItem14, z30);
            } else {
                boolean z48 = this.f13295y1;
                if (z20) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                n8Var.b(z48, null, z29);
            }
        }
        this.X3 = false;
        if (dVar.getVisibility() == 0) {
            f10 = -AndroidUtilities.dp(44.0f);
        } else {
            f10 = 0.0f;
        }
        n8Var.setTranslationX(f10);
        if (z22) {
            this.f13254m3 = false;
            storyItem15 = c4Var.f13141a;
            if (storyItem15 != null) {
                this.A0.setReaction(null);
            } else {
                this.A0.setReaction(null);
            }
        }
        r6Var8 = c4Var.f13142b;
        if (r6Var8 == null) {
            if (this.f13233f2 != null) {
                viewPropertyAnimator = this.f13236g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f13236g2 = null;
                }
                if (z20) {
                    this.f13233f2.setAlpha(0.0f);
                    this.f13233f2.setVisibility(8);
                } else {
                    this.f13233f2.setAlpha(0.0f);
                    this.f13233f2.setVisibility(8);
                }
            }
        } else if (this.f13233f2 != null) {
            viewPropertyAnimator = this.f13236g2;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.f13236g2 = null;
            }
            if (z20) {
                this.f13233f2.setAlpha(0.0f);
                this.f13233f2.setVisibility(8);
            } else {
                this.f13233f2.setAlpha(0.0f);
                this.f13233f2.setVisibility(8);
            }
        }
        this.f13275t1.a(i9.f13463z1, false);
        if (this.G1) {
            FileLog.d("StoryViewer displayed story dialogId=" + this.f13291x1 + " storyId=" + c4Var.f13141a.f22617id + " " + c4.c(c4Var));
        }
        if (this.f13295y1) {
            c5.f(this.f13296y2, this.f13291x1, c4Var.f13141a);
        }
        eg.c cVar2 = a4Var8.f13034b;
        j6Var2 = i9Var.K0;
        if (j6Var2 != null) {
            iDp = 0;
        } else {
            iDp = 0;
        }
        cVar2.setPadding(0, 0, iDp, 0);
        MessagesController.getInstance(this.f13296y2).getTranslateController().detectStoryLanguage(c4Var.f13141a);
        if (!z10) {
            v1 v1Var2 = new v1(this, 1);
            this.f13285v3 = v1Var2;
            AndroidUtilities.runOnUIThread(v1Var2, 500L);
        }
        w3Var3 = this.C0;
        if (w3Var3 != null) {
            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                AndroidUtilities.cancelRunOnUIThread(this.N3);
                AndroidUtilities.runOnUIThread(this.N3, 250L);
            }
        } else if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
            AndroidUtilities.cancelRunOnUIThread(this.N3);
            AndroidUtilities.runOnUIThread(this.N3, 250L);
        }
        imageView2 = this.f13270s0;
        if (imageView2 != null) {
            if (I0()) {
                i22 = 0;
            } else {
                i22 = 0;
            }
            imageView2.setVisibility(i22);
        }
        imageView3 = this.f13274t0;
        if (imageView3 != null) {
            if (c4Var.f13145f) {
                i21 = 8;
            } else {
                i21 = 8;
            }
            imageView3.setVisibility(i21);
        }
    }

    public final void g1() {
        ArrayList arrayList;
        int size;
        ImageReceiver imageReceiver;
        boolean zIsEmpty;
        ArrayList arrayList2;
        TL_stories.StoryItem storyItem;
        r6 r6VarT;
        TLRPC.MessageMedia messageMedia;
        boolean zEndsWith;
        String str;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        ImageReceiver imageReceiver2;
        TL_stories.StoryItem storyItem2;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList6;
        TLRPC.MessageMedia messageMedia2;
        boolean z10;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int i11;
        ArrayList arrayList10;
        byte[] bArr;
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String strL = com.google.android.recaptcha.internal.a.l(iMax, "_", iMax);
        ArrayList arrayList11 = this.O3;
        arrayList11.clear();
        ArrayList arrayList12 = this.P3;
        arrayList12.clear();
        int i12 = 0;
        while (true) {
            arrayList = this.f13226d1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((ig.h0) arrayList.get(i12)).b(false);
            i12++;
        }
        arrayList.clear();
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                break;
            }
            int i14 = this.F1;
            if (i13 == 0) {
                size = i14 - 1;
                imageReceiver = this.f13220b1;
                if (size < 0) {
                    imageReceiver.clearImage();
                } else {
                    ArrayList arrayList13 = this.f13271s1;
                    zIsEmpty = arrayList13.isEmpty();
                    arrayList2 = this.f13267r1;
                    if (!zIsEmpty || size < arrayList2.size()) {
                        if (!arrayList2.isEmpty()) {
                            if (size < 0) {
                                size = 0;
                            }
                            if (size >= arrayList2.size()) {
                                size = arrayList2.size() - 1;
                            }
                            storyItem = (TL_stories.StoryItem) arrayList2.get(size);
                            long j10 = this.f13291x1;
                            storyItem.dialogId = j10;
                            r6VarT = this.O1.t(j10, storyItem);
                            if (r6VarT != null) {
                                V0(r6VarT, imageReceiver, strL);
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i10 = i13;
                                storyItem2 = storyItem;
                            } else {
                                messageMedia = storyItem.media;
                                if (messageMedia == null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                                    zEndsWith = true;
                                } else {
                                    zEndsWith = false;
                                }
                                str = storyItem.attachPath;
                                if (str != null) {
                                    if (storyItem.media == null) {
                                        zEndsWith = str.toLowerCase().endsWith(".mp4");
                                    }
                                    if (zEndsWith) {
                                        i10 = i13;
                                        arrayList3 = arrayList11;
                                        arrayList5 = arrayList;
                                        arrayList4 = arrayList12;
                                        imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), s3.c.l(strL, "_pframe"), ImageLocation.getForPath(storyItem.firstFramePath), strL, null, null, null, 0L, null, null, 0);
                                        storyItem2 = storyItem;
                                    } else {
                                        arrayList3 = arrayList11;
                                        arrayList4 = arrayList12;
                                        arrayList5 = arrayList;
                                        i10 = i13;
                                        String str2 = strL;
                                        imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str2, null, null, null, 0L, null, null, 0);
                                        storyItem2 = storyItem;
                                        strL = str2;
                                    }
                                } else {
                                    arrayList3 = arrayList11;
                                    arrayList4 = arrayList12;
                                    arrayList5 = arrayList;
                                    i10 = i13;
                                    imageReceiver2 = imageReceiver;
                                    if (zEndsWith) {
                                        storyItem2 = storyItem;
                                        imageReceiver2.setImage(ImageLocation.getForDocument(storyItem.media.getDocument()), s3.c.l(strL, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000), storyItem.media.getDocument()), strL, null, null, null, 0L, null, storyItem2, 0);
                                    } else {
                                        storyItem2 = storyItem;
                                        TLRPC.MessageMedia messageMedia3 = storyItem2.media;
                                        photo = messageMedia3 != null ? messageMedia3.photo : null;
                                        if (photo != null || (arrayList6 = photo.sizes) == null) {
                                            imageReceiver2.clearImage();
                                        } else {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList6, Integer.MAX_VALUE);
                                            FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                            imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), strL, null, null, null, 0L, null, storyItem2, 0);
                                        }
                                    }
                                }
                            }
                            messageMedia2 = storyItem2.media;
                            if (messageMedia2 == null && MessageObject.isVideoDocument(messageMedia2.getDocument())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                TLRPC.Document document = storyItem2.media.getDocument();
                                if (storyItem2.fileReference == 0) {
                                    storyItem2.fileReference = FileLoader.getInstance(this.f13296y2).getFileReference(storyItem2);
                                }
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("?account=");
                                    sb2.append(this.f13296y2);
                                    sb2.append("&id=");
                                    sb2.append(document.f22386id);
                                    sb2.append("&hash=");
                                    sb2.append(document.access_hash);
                                    sb2.append("&dc=");
                                    sb2.append(document.dc_id);
                                    sb2.append("&size=");
                                    sb2.append(document.size);
                                    sb2.append("&mime=");
                                    sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                                    sb2.append("&rid=");
                                    sb2.append(storyItem2.fileReference);
                                    sb2.append("&name=");
                                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                                    sb2.append("&reference=");
                                    bArr = document.file_reference;
                                    if (bArr == null) {
                                        bArr = new byte[0];
                                    }
                                    sb2.append(Utilities.bytesToHex(bArr));
                                    sb2.append("&sid=");
                                    sb2.append(storyItem2.f22617id);
                                    sb2.append("&did=");
                                    sb2.append(storyItem2.dialogId);
                                    arrayList7 = arrayList3;
                                    try {
                                        arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb2.toString()));
                                        arrayList8 = arrayList4;
                                        try {
                                            arrayList8.add(document);
                                        } catch (UnsupportedEncodingException e9) {
                                            e = e9;
                                            e.printStackTrace();
                                        }
                                    } catch (UnsupportedEncodingException e10) {
                                        e = e10;
                                        arrayList8 = arrayList4;
                                        e.printStackTrace();
                                        if (storyItem2.media_areas != null) {
                                            i11 = 0;
                                            while (i11 < storyItem2.media_areas.size()) {
                                                if (storyItem2.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem2.media_areas.get(i11);
                                                    ig.h0 h0Var = new ig.h0(this);
                                                    h0Var.e(ig.q0.d(tL_mediaAreaSuggestedReaction.reaction));
                                                    h0Var.b(this.W0);
                                                    arrayList10 = arrayList5;
                                                    arrayList10.add(h0Var);
                                                } else {
                                                    arrayList10 = arrayList5;
                                                }
                                                i11++;
                                                arrayList5 = arrayList10;
                                            }
                                        }
                                        arrayList9 = arrayList5;
                                        i13 = i10 + 1;
                                        arrayList11 = arrayList7;
                                        arrayList = arrayList9;
                                        arrayList12 = arrayList8;
                                    }
                                } catch (UnsupportedEncodingException e11) {
                                    e = e11;
                                    arrayList7 = arrayList3;
                                }
                            } else {
                                arrayList7 = arrayList3;
                                arrayList8 = arrayList4;
                            }
                            if (storyItem2.media_areas != null) {
                                i11 = 0;
                                while (i11 < storyItem2.media_areas.size()) {
                                    if (storyItem2.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction2 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem2.media_areas.get(i11);
                                        ig.h0 h0Var2 = new ig.h0(this);
                                        h0Var2.e(ig.q0.d(tL_mediaAreaSuggestedReaction2.reaction));
                                        h0Var2.b(this.W0);
                                        arrayList10 = arrayList5;
                                        arrayList10.add(h0Var2);
                                    } else {
                                        arrayList10 = arrayList5;
                                    }
                                    i11++;
                                    arrayList5 = arrayList10;
                                }
                            }
                            arrayList9 = arrayList5;
                        }
                        i13 = i10 + 1;
                        arrayList11 = arrayList7;
                        arrayList = arrayList9;
                        arrayList12 = arrayList8;
                    } else {
                        V0((r6) arrayList13.get(size - arrayList2.size()), imageReceiver, strL);
                    }
                }
            } else {
                size = i14 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.f13223c1;
                if (size >= storiesCount) {
                    imageReceiver3.clearImage();
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList14 = this.f13271s1;
                    zIsEmpty = arrayList14.isEmpty();
                    arrayList2 = this.f13267r1;
                    if (zIsEmpty) {
                        if (!arrayList2.isEmpty()) {
                            if (size < 0) {
                                size = 0;
                            }
                            if (size >= arrayList2.size()) {
                                size = arrayList2.size() - 1;
                            }
                            storyItem = (TL_stories.StoryItem) arrayList2.get(size);
                            long j11 = this.f13291x1;
                            storyItem.dialogId = j11;
                            r6VarT = this.O1.t(j11, storyItem);
                            if (r6VarT != null) {
                                V0(r6VarT, imageReceiver, strL);
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i10 = i13;
                                storyItem2 = storyItem;
                            } else {
                                messageMedia = storyItem.media;
                                if (messageMedia == null) {
                                    zEndsWith = false;
                                } else {
                                    zEndsWith = false;
                                }
                                str = storyItem.attachPath;
                                if (str != null) {
                                    if (storyItem.media == null) {
                                        zEndsWith = str.toLowerCase().endsWith(".mp4");
                                    }
                                    if (zEndsWith) {
                                        i10 = i13;
                                        arrayList3 = arrayList11;
                                        arrayList5 = arrayList;
                                        arrayList4 = arrayList12;
                                        imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), s3.c.l(strL, "_pframe"), ImageLocation.getForPath(storyItem.firstFramePath), strL, null, null, null, 0L, null, null, 0);
                                        storyItem2 = storyItem;
                                    } else {
                                        arrayList3 = arrayList11;
                                        arrayList4 = arrayList12;
                                        arrayList5 = arrayList;
                                        i10 = i13;
                                        String str3 = strL;
                                        imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str3, null, null, null, 0L, null, null, 0);
                                        storyItem2 = storyItem;
                                        strL = str3;
                                    }
                                } else {
                                    arrayList3 = arrayList11;
                                    arrayList4 = arrayList12;
                                    arrayList5 = arrayList;
                                    i10 = i13;
                                    imageReceiver2 = imageReceiver;
                                    if (zEndsWith) {
                                        storyItem2 = storyItem;
                                        imageReceiver2.setImage(ImageLocation.getForDocument(storyItem.media.getDocument()), s3.c.l(strL, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000), storyItem.media.getDocument()), strL, null, null, null, 0L, null, storyItem2, 0);
                                    } else {
                                        storyItem2 = storyItem;
                                        TLRPC.MessageMedia messageMedia4 = storyItem2.media;
                                        if (messageMedia4 != null) {
                                        }
                                        if (photo != null) {
                                            imageReceiver2.clearImage();
                                        } else {
                                            imageReceiver2.clearImage();
                                        }
                                    }
                                }
                            }
                            messageMedia2 = storyItem2.media;
                            if (messageMedia2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                TLRPC.Document document2 = storyItem2.media.getDocument();
                                if (storyItem2.fileReference == 0) {
                                    storyItem2.fileReference = FileLoader.getInstance(this.f13296y2).getFileReference(storyItem2);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("?account=");
                                sb3.append(this.f13296y2);
                                sb3.append("&id=");
                                sb3.append(document2.f22386id);
                                sb3.append("&hash=");
                                sb3.append(document2.access_hash);
                                sb3.append("&dc=");
                                sb3.append(document2.dc_id);
                                sb3.append("&size=");
                                sb3.append(document2.size);
                                sb3.append("&mime=");
                                sb3.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                                sb3.append("&rid=");
                                sb3.append(storyItem2.fileReference);
                                sb3.append("&name=");
                                sb3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                                sb3.append("&reference=");
                                bArr = document2.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                sb3.append(Utilities.bytesToHex(bArr));
                                sb3.append("&sid=");
                                sb3.append(storyItem2.f22617id);
                                sb3.append("&did=");
                                sb3.append(storyItem2.dialogId);
                                arrayList7 = arrayList3;
                                arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb3.toString()));
                                arrayList8 = arrayList4;
                                arrayList8.add(document2);
                            } else {
                                arrayList7 = arrayList3;
                                arrayList8 = arrayList4;
                            }
                            if (storyItem2.media_areas != null) {
                                i11 = 0;
                                while (i11 < storyItem2.media_areas.size()) {
                                    if (storyItem2.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction3 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem2.media_areas.get(i11);
                                        ig.h0 h0Var3 = new ig.h0(this);
                                        h0Var3.e(ig.q0.d(tL_mediaAreaSuggestedReaction3.reaction));
                                        h0Var3.b(this.W0);
                                        arrayList10 = arrayList5;
                                        arrayList10.add(h0Var3);
                                    } else {
                                        arrayList10 = arrayList5;
                                    }
                                    i11++;
                                    arrayList5 = arrayList10;
                                }
                            }
                            arrayList9 = arrayList5;
                        }
                    } else if (!arrayList2.isEmpty()) {
                        if (size < 0) {
                            size = 0;
                        }
                        if (size >= arrayList2.size()) {
                            size = arrayList2.size() - 1;
                        }
                        storyItem = (TL_stories.StoryItem) arrayList2.get(size);
                        long j12 = this.f13291x1;
                        storyItem.dialogId = j12;
                        r6VarT = this.O1.t(j12, storyItem);
                        if (r6VarT != null) {
                            V0(r6VarT, imageReceiver, strL);
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList;
                            i10 = i13;
                            storyItem2 = storyItem;
                        } else {
                            messageMedia = storyItem.media;
                            if (messageMedia == null) {
                                zEndsWith = false;
                            } else {
                                zEndsWith = false;
                            }
                            str = storyItem.attachPath;
                            if (str != null) {
                                if (storyItem.media == null) {
                                    zEndsWith = str.toLowerCase().endsWith(".mp4");
                                }
                                if (zEndsWith) {
                                    i10 = i13;
                                    arrayList3 = arrayList11;
                                    arrayList5 = arrayList;
                                    arrayList4 = arrayList12;
                                    imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), s3.c.l(strL, "_pframe"), ImageLocation.getForPath(storyItem.firstFramePath), strL, null, null, null, 0L, null, null, 0);
                                    storyItem2 = storyItem;
                                } else {
                                    arrayList3 = arrayList11;
                                    arrayList4 = arrayList12;
                                    arrayList5 = arrayList;
                                    i10 = i13;
                                    String str4 = strL;
                                    imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str4, null, null, null, 0L, null, null, 0);
                                    storyItem2 = storyItem;
                                    strL = str4;
                                }
                            } else {
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList12;
                                arrayList5 = arrayList;
                                i10 = i13;
                                imageReceiver2 = imageReceiver;
                                if (zEndsWith) {
                                    storyItem2 = storyItem;
                                    imageReceiver2.setImage(ImageLocation.getForDocument(storyItem.media.getDocument()), s3.c.l(strL, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000), storyItem.media.getDocument()), strL, null, null, null, 0L, null, storyItem2, 0);
                                } else {
                                    storyItem2 = storyItem;
                                    TLRPC.MessageMedia messageMedia5 = storyItem2.media;
                                    if (messageMedia5 != null) {
                                    }
                                    if (photo != null) {
                                        imageReceiver2.clearImage();
                                    } else {
                                        imageReceiver2.clearImage();
                                    }
                                }
                            }
                        }
                        messageMedia2 = storyItem2.media;
                        if (messageMedia2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.Document document3 = storyItem2.media.getDocument();
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.f13296y2).getFileReference(storyItem2);
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("?account=");
                            sb4.append(this.f13296y2);
                            sb4.append("&id=");
                            sb4.append(document3.f22386id);
                            sb4.append("&hash=");
                            sb4.append(document3.access_hash);
                            sb4.append("&dc=");
                            sb4.append(document3.dc_id);
                            sb4.append("&size=");
                            sb4.append(document3.size);
                            sb4.append("&mime=");
                            sb4.append(URLEncoder.encode(document3.mime_type, "UTF-8"));
                            sb4.append("&rid=");
                            sb4.append(storyItem2.fileReference);
                            sb4.append("&name=");
                            sb4.append(URLEncoder.encode(FileLoader.getDocumentFileName(document3), "UTF-8"));
                            sb4.append("&reference=");
                            bArr = document3.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb4.append(Utilities.bytesToHex(bArr));
                            sb4.append("&sid=");
                            sb4.append(storyItem2.f22617id);
                            sb4.append("&did=");
                            sb4.append(storyItem2.dialogId);
                            arrayList7 = arrayList3;
                            arrayList7.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document3) + sb4.toString()));
                            arrayList8 = arrayList4;
                            arrayList8.add(document3);
                        } else {
                            arrayList7 = arrayList3;
                            arrayList8 = arrayList4;
                        }
                        if (storyItem2.media_areas != null) {
                            i11 = 0;
                            while (i11 < storyItem2.media_areas.size()) {
                                if (storyItem2.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction4 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem2.media_areas.get(i11);
                                    ig.h0 h0Var4 = new ig.h0(this);
                                    h0Var4.e(ig.q0.d(tL_mediaAreaSuggestedReaction4.reaction));
                                    h0Var4.b(this.W0);
                                    arrayList10 = arrayList5;
                                    arrayList10.add(h0Var4);
                                } else {
                                    arrayList10 = arrayList5;
                                }
                                i11++;
                                arrayList5 = arrayList10;
                            }
                        }
                        arrayList9 = arrayList5;
                    }
                    i13 = i10 + 1;
                    arrayList11 = arrayList7;
                    arrayList = arrayList9;
                    arrayList12 = arrayList8;
                }
            }
            arrayList8 = arrayList12;
            arrayList9 = arrayList;
            i10 = i13;
            arrayList7 = arrayList11;
            i13 = i10 + 1;
            arrayList11 = arrayList7;
            arrayList = arrayList9;
            arrayList12 = arrayList8;
        }
        ArrayList arrayList15 = arrayList12;
        ArrayList arrayList16 = arrayList11;
        z8 z8Var = (z8) this.M1;
        i9 i9Var = z8Var.d;
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            boolean z11 = i9Var.D0;
            ArrayList arrayList17 = i9Var.I0;
            if (z11) {
                return;
            }
            for (int i15 = 0; i15 < arrayList17.size(); i15++) {
                for (int i16 = 0; i16 < arrayList16.size(); i16++) {
                    if (((Uri) arrayList16.get(i16)).equals(((h9) arrayList17.get(i15)).uri)) {
                        arrayList16.remove(i16);
                    }
                }
            }
            for (int i17 = 0; i17 < arrayList16.size(); i17++) {
                Uri uri = (Uri) arrayList16.get(i17);
                h9 h9Var = new h9(i9Var, i9Var.f13516y0, i9Var.f13514x0);
                h9Var.setOnSeekUpdate(new p6(14, z8Var, h9Var));
                h9Var.uri = uri;
                TLRPC.Document document4 = (TLRPC.Document) arrayList15.get(i17);
                h9Var.document = document4;
                FileStreamLoadOperation.setPriorityForDocument(document4, 0);
                h9Var.preparePlayer(uri, i9.f13463z1, i9.f13461x1);
                arrayList17.add(h9Var);
                if (arrayList17.size() > 2) {
                    ((h9) arrayList17.remove(0)).release(null);
                }
            }
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f13283v1;
    }

    public long getCurrentPeer() {
        return this.f13291x1;
    }

    public int getListPosition() {
        return this.H1;
    }

    public Bitmap getPlayingBitmap() {
        j3 j3Var = this.Y0;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(j3Var.getWidth(), j3Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(bitmapCreateBitmap), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        return bitmapCreateBitmap;
    }

    public int getSelectedPosition() {
        return this.F1;
    }

    public s6 getStoriesController() {
        return MessagesController.getInstance(this.f13296y2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.f13300z2, this.f13267r1.size()) + this.f13271s1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f13267r1;
    }

    public final void h1() {
        if (this.C1) {
            TextView textView = this.f13227d2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f13230e2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f13227d2;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.A1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.f13230e2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f13230e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int size;
        ArrayList arrayList = this.f13283v1;
        i9 i9Var = this.F0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f13271s1;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                size = 0;
            } else {
                size = arrayList2.size();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    long j10 = ((r6) arrayList2.get(i10)).f13905a;
                    if (((int) (j10 ^ (j10 >>> 32))) == i9Var.L0) {
                        this.F1 = i10;
                        return;
                    }
                }
            }
            int iIndexOf = this.f13283v1.indexOf(Integer.valueOf(i9Var.L0));
            if (iIndexOf < 0 && !this.f13283v1.isEmpty()) {
                if (i9Var.L0 > ((Integer) this.f13283v1.get(0)).intValue()) {
                    iIndexOf = 0;
                } else if (i9Var.L0 < ((Integer) i0.a.i(1, this.f13283v1)).intValue()) {
                    iIndexOf = this.f13283v1.size() - 1;
                }
            }
            this.F1 = size + iIndexOf;
        } else {
            int i11 = i9Var.f13466a1.get(this.f13291x1, -1);
            this.F1 = i11;
            if (i11 == -1 && !i9Var.J0 && (peerStories = this.f13264q1) != null && peerStories.max_read_id > 0) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f13267r1;
                    if (i12 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i12)).f22617id > this.f13264q1.max_read_id) {
                        this.F1 = i12;
                        break;
                    }
                    i12++;
                }
            }
        }
        if (this.F1 == -1) {
            this.F1 = 0;
        }
    }

    public final void j1() {
        j6 j6Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f13267r1;
        arrayList.clear();
        i9 i9Var = this.F0;
        if (!i9Var.J0) {
            ArrayList arrayList2 = this.f13283v1;
            int i10 = 0;
            ArrayList arrayList3 = this.f13271s1;
            if (arrayList2 != null && (j6Var = i9Var.K0) != null) {
                if (j6Var instanceof b6) {
                    arrayList3.clear();
                    ArrayList arrayListE = MessagesController.getInstance(this.f13296y2).getStoriesController().E(this.f13291x1);
                    String str = ((b6) i9Var.K0).E;
                    if (arrayListE != null) {
                        for (int i11 = 0; i11 < arrayListE.size(); i11++) {
                            r6 r6Var = (r6) arrayListE.get(i11);
                            lh.z7 z7Var = r6Var.f13907c;
                            if (z7Var != null && !z7Var.f17209g && TextUtils.equals(z7Var.K0, str)) {
                                arrayList3.add(r6Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f13283v1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject messageObjectF = i9Var.K0.f(((Integer) obj).intValue());
                    if (messageObjectF != null && (storyItem = messageObjectF.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (i9Var.K0 != null) {
                while (i10 < i9Var.K0.f13540i.size()) {
                    arrayList.add(((MessageObject) i9Var.K0.f13540i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = i9Var.M0;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.f13291x1) {
                    TL_stories.PeerStories peerStoriesY = this.O1.y(this.f13291x1);
                    this.f13264q1 = peerStoriesY;
                    if (peerStoriesY == null) {
                        this.f13264q1 = this.O1.z(this.f13291x1);
                    }
                } else {
                    this.f13264q1 = i9Var.M0;
                }
                this.f13300z2 = 0;
                TL_stories.PeerStories peerStories2 = this.f13264q1;
                if (peerStories2 != null) {
                    this.f13300z2 = peerStories2.stories.size();
                    arrayList.addAll(this.f13264q1.stories);
                }
                arrayList3.clear();
                ArrayList arrayListE2 = this.O1.E(this.f13291x1);
                if (arrayListE2 != null) {
                    arrayList3.addAll(arrayListE2);
                }
            }
        } else if (!i9Var.O0) {
            arrayList.add(i9Var.P0);
        }
        this.f13287w1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        e4 currentPeerView;
        k50 k50Var = this.F2;
        if (k50Var != null) {
            k50Var.T = null;
            k50Var.d(false);
        }
        long j10 = this.f13291x1;
        TL_stories.StoryItem storyItem = this.K1.f13141a;
        i9 i9Var = this.F0;
        i9Var.getClass();
        if (j10 != 0 && storyItem != null) {
            i9.A1.remove(j10 + (j10 >> 16) + (((long) storyItem.f22617id) << 16));
        }
        this.f13231e3 = true;
        y8 y8Var = i9Var.f13487j0;
        if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            ec ecVarI = new mc(this.Y0, this.f13290x0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new v1(this, 2));
            ecVarI.f28028r = false;
            ecVarI.k(false);
        }
        MessagesController.getInstance(this.f13296y2).ensureMessagesLoaded(this.f13291x1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        c4 c4Var = this.K1;
        TL_stories.StoryItem storyItem = c4Var.f13141a;
        if (storyItem == null) {
            storyItem = c4Var.f13143c;
        }
        boolean z11 = this.f13299z1;
        if (z11 || this.f13295y1) {
            if (storyItem == null) {
                this.f13288w2.setText("");
                this.B2.setVisibility(8);
                this.f13292x2.setVisibility(8);
                return;
            }
            i9 i9Var = this.F0;
            z2 z2Var = this.f13298z0;
            if (!z11) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.f13288w2.setText(LocaleController.getString(i9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.f13288w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.f13292x2.setVisibility(8);
                    this.B2.setVisibility(8);
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < storyItem.views.recent_viewers.size(); i12++) {
                        TLObject userOrChat = MessagesController.getInstance(this.f13296y2).getUserOrChat(storyItem.views.recent_viewers.get(i12).longValue());
                        if (userOrChat != null) {
                            this.f13292x2.b(i11, userOrChat, this.f13296y2);
                            i11++;
                        }
                        if (i11 >= 3) {
                            break;
                        }
                    }
                    for (int i13 = i11; i13 < 3; i13++) {
                        this.f13292x2.b(i13, null, this.f13296y2);
                    }
                    this.f13292x2.a(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cq cqVar = new cq(R.drawable.mini_views_likes, 0);
                        cqVar.setOverrideColor(-53704);
                        cqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        cq cqVar2 = new cq(R.drawable.mini_repost_story, 0);
                        cqVar2.setOverrideColor(-14161823);
                        cqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(cqVar2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.f13288w2.setText(spannableStringBuilder);
                    if (i11 == 0) {
                        this.f13292x2.setVisibility(8);
                        this.f13288w2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.f13292x2.setVisibility(0);
                        this.f13288w2.setTranslationX(AndroidUtilities.dp(10.0f) + i0.a.e(i11, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.B2.setVisibility(0);
                }
                z2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.K0.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            org.telegram.ui.Components.i6 i6Var = this.N0;
            if (i6Var == null || (i10 = storyViews2.forwards_count) <= 0) {
                this.R0 = false;
            } else {
                i6Var.q(Integer.toString(i10), z10 && this.R0, true);
                this.R0 = true;
            }
            int i14 = storyItem.views.reactions_count;
            if (i14 > 0) {
                this.M0.q(Integer.toString(i14), z10 && this.Q0, true);
                this.Q0 = true;
            } else {
                this.Q0 = false;
            }
            if (!z10) {
                this.O0.d(this.Q0 ? 1.0f : 0.0f, true);
                org.telegram.ui.Components.y5 y5Var = this.P0;
                if (y5Var != null) {
                    y5Var.d(this.R0 ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
            if (!(this.A1 && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.f13288w2.setText(LocaleController.getString(i9Var.K0 == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.f13288w2.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new cq(R.drawable.filled_views, 0), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.f13288w2.setText(spannableStringBuilder2);
            } else {
                this.f13288w2.setText("");
            }
            z2Var.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.Q0 ? this.M0.d + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + z2Var.getLayoutParams().width;
            z2 z2Var2 = this.L0;
            if (z2Var2 != null) {
                z2Var2.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.R0 ? this.N0.d + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.S1.getLayoutParams()).rightMargin += z2Var2.getLayoutParams().width;
                z2Var2.requestLayout();
            }
            this.S1.requestLayout();
            z2Var.requestLayout();
            this.f13292x2.setVisibility(8);
            this.B2.setVisibility(8);
            TL_stories.StoryItem storyItem2 = c4Var.f13141a;
            f3 f3Var = this.f13232f1;
            if (storyItem2 == null) {
                f3Var.getClass();
                return;
            }
            for (int i15 = 0; i15 < f3Var.getChildCount(); i15++) {
                if (f3Var.getChildAt(i15) instanceof p8) {
                    ((p8) f3Var.getChildAt(i15)).c(storyItem2.views, z10);
                }
            }
        }
    }

    public final void l0() {
        x6 x6Var = this.A0;
        x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(0, x6Var)).setDuration(150L).start();
        int iDp = AndroidUtilities.dp(8.0f);
        x6 x6Var2 = new x6(getContext(), this.f13275t1);
        this.A0 = x6Var2;
        x6Var2.setPadding(iDp, iDp, iDp, iDp);
        this.A0.setAlpha(0.0f);
        this.A0.setScaleX(0.8f);
        this.A0.setScaleY(0.8f);
        this.A0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.f13298z0.addView(this.A0, h7.z5.e(40, 40, 3));
        this.f13254m3 = false;
    }

    public final void l1() {
        float f10;
        float f11;
        float f12;
        z2 z2Var;
        ImageView imageView;
        n3 n3Var;
        z2 z2Var2;
        wj0 wj0Var;
        float f13;
        float f14 = ((z8) this.M1).d.R;
        float f15 = this.H2 ? 1.0f : 0.0f;
        org.telegram.ui.Components.y5 y5Var = this.K2;
        y5Var.d(f15, false);
        int i10 = this.f13262p2;
        float fA = (i10 == 0 || !this.f13265q2) ? this.f13268r2 ? 1.0f : 0.0f : h7.n.a(this.D2 / i10, 0.0f, 1.0f);
        org.telegram.ui.Components.y5 y5Var2 = this.S3;
        float f16 = y5Var2.f34812c;
        org.telegram.ui.Components.y5 y5Var3 = this.T3;
        float f17 = y5Var3.f34812c;
        org.telegram.ui.Components.y5 y5Var4 = this.U3;
        float f18 = y5Var4.f34812c;
        y5Var2.d(this.C2 ? 1.0f : 0.0f, false);
        if (!this.f13231e3) {
            o2 o2Var = this.X1;
            y5Var3.d((o2Var == null || TextUtils.isEmpty(o2Var.getFieldText())) ? 0.0f : 1.0f, false);
        }
        o2 o2Var2 = this.X1;
        y5Var4.d((o2Var2 == null || !o2Var2.f26186u3) ? 0.0f : 1.0f, false);
        final o2 o2Var3 = this.X1;
        if (o2Var3 != null) {
            e4 e4Var = o2Var3.f13742n5;
            int backgroundTop = o2Var3.getBackgroundTop();
            int i11 = o2Var3.f13739k5;
            if (i11 != 0 && backgroundTop != i11) {
                int i12 = (o2Var3.O1 + i11) - backgroundTop;
                o2Var3.setAnimatedTop(i12);
                e4Var.R2 = true;
                ValueAnimator valueAnimator = e4Var.a2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    e4Var.a2.cancel();
                }
                View view = o2Var3.B1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var3.B1.setTranslationY(((1.0f - o2Var3.getTopViewEnterProgress()) * o2Var3.B1.getLayoutParams().height) + o2Var3.O1);
                }
                e4Var.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i12, 0.0f);
                e4Var.a2 = valueAnimatorOfFloat;
                final int i13 = 0;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i13) {
                            case 0:
                                o2 o2Var4 = o2Var3;
                                o2Var4.getClass();
                                o2Var4.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                e4 e4Var2 = o2Var4.f13742n5;
                                e4Var2.R2 = true;
                                e4Var2.invalidate();
                                o2Var4.invalidate();
                                break;
                            default:
                                o2Var3.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                break;
                        }
                    }
                });
                e4Var.a2.addListener(new ag.r1(o2Var3, 15));
                e4Var.a2.setDuration(250L);
                e4Var.a2.setInterpolator(sh.m.V);
                e4Var.a2.start();
                o2Var3.f13739k5 = 0;
            }
            if (o2Var3.f26125i3) {
                float scrollY = (o2Var3.f13741m5 - o2Var3.A0.getScrollY()) + (o2Var3.f13740l5 - o2Var3.A0.getMeasuredHeight());
                bf bfVar = o2Var3.A0;
                bfVar.setOffsetY(bfVar.getOffsetY() - scrollY);
                final int i14 = 1;
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(o2Var3.A0.getOffsetY(), 0.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i14) {
                            case 0:
                                o2 o2Var4 = o2Var3;
                                o2Var4.getClass();
                                o2Var4.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                e4 e4Var2 = o2Var4.f13742n5;
                                e4Var2.R2 = true;
                                e4Var2.invalidate();
                                o2Var4.invalidate();
                                break;
                            default:
                                o2Var3.A0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                break;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = o2Var3.f13738j5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                o2Var3.f13738j5 = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.setDuration(250L);
                valueAnimatorOfFloat2.setInterpolator(sh.m.V);
                valueAnimatorOfFloat2.start();
                o2Var3.f26125i3 = false;
                e4Var.l1();
            }
            o2Var3.getMeasuredHeight();
        }
        o2 o2Var4 = this.X1;
        boolean z10 = o2Var4 != null && o2Var4.t0();
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z11 = this.f13276t2;
        Paint paint = this.f13245j2;
        if (z11) {
            paint.setColor(i0.b.d(this.f13253m2, -14933463, org.telegram.ui.ActionBar.g6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.Z3) * org.telegram.messenger.y1.z(1.0f, this.f13256n2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.b.k(-16777216, (int) ((1.0f - this.Z3) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z12 = this.R2;
        i9 i9Var = this.F0;
        if (!z12 && this.V3 == i9Var.Z && y5Var.f34812c == this.M2 && this.f13259o2 == this.D2 && fA == this.f13253m2 && f14 == this.f13256n2 && f16 == y5Var2.f34812c && !z10 && f18 == y5Var4.f34812c && f17 == y5Var3.f34812c) {
            return;
        }
        this.R2 = false;
        this.f13259o2 = this.D2;
        float f19 = y5Var.f34812c;
        float f20 = this.M2;
        j3 j3Var = this.Y0;
        if (f19 != f20) {
            j3Var.invalidate();
        }
        if (f14 != 0.0f) {
            j3Var.setLayerType(2, null);
        } else {
            j3Var.setLayerType(0, null);
        }
        this.M2 = y5Var.f34812c;
        this.f13256n2 = f14;
        this.f13253m2 = fA;
        this.V3 = i9Var.Z;
        float height = this.D2 - (getHeight() - j3Var.getBottom());
        o2 o2Var5 = this.X1;
        float fMax = Math.max(0.0f, height + (o2Var5 == null ? 0.0f : o2Var5.getHeightWithTopView() * fA));
        float height2 = this.f13248k2 - (getHeight() - j3Var.getBottom());
        o2 o2Var6 = this.X1;
        float fMax2 = Math.max(0.0f, height2 + (o2Var6 == null ? 0.0f : o2Var6.getHeightWithTopView() * (this.f13268r2 ? 1.0f : 0.0f)));
        o2 o2Var7 = this.X1;
        if (o2Var7 != null) {
            if (this.Z1 != null) {
                ImageView suggestButton = o2Var7.getSuggestButton();
                if (suggestButton != null) {
                    this.Z1.n(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                }
                this.Z1.setTranslationY(-((getHeight() - this.X1.getY()) + AndroidUtilities.dp(6.0f)));
            }
            lt editField = this.X1.getEditField();
            go0 senderSelectView = this.X1.getSenderSelectView();
            if (editField != null) {
                f13 = 1.0f;
                f10 = 6.0f;
                float fLerp = AndroidUtilities.lerp(0.88f, 1.0f, fA);
                editField.setScaleX(fLerp);
                editField.setScaleY(fLerp);
            } else {
                f13 = 1.0f;
                f10 = 6.0f;
            }
            if (senderSelectView != null) {
                float fLerp2 = AndroidUtilities.lerp(0.8f, f13, fA);
                senderSelectView.setScaleX(fLerp2);
                senderSelectView.setScaleY(fLerp2);
                senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, fA));
            }
        } else {
            f10 = 6.0f;
        }
        float fMax3 = Math.max(0.0f, (this.f13276t2 ? 0.0f : AndroidUtilities.dp(58.0f) * (1.0f - fA)) + fMax);
        float fMax4 = Math.max(0.0f, fMax2 + ((this.f13276t2 || this.f13268r2) ? 0 : AndroidUtilities.dp(58.0f)));
        float fDp = (AndroidUtilities.dp(f10) * fA) + fMax3;
        g2 g2Var = this.H0;
        hh.f1 f1Var = g2Var.f14012c;
        g2Var.G = fDp;
        if (Math.abs(g2Var.H - fMax4) > 0.1f) {
            g2Var.H = fMax4;
            f12 = 0.8f;
            f11 = 8.0f;
            f1Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) fMax4) - f1Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
            if (!f1Var.canScrollVertically(1)) {
                g2Var.d.h1(0, AndroidUtilities.dp(100.0f));
            }
        } else {
            f11 = 8.0f;
            f12 = 0.8f;
        }
        g2Var.setTranslationY(-g2Var.G);
        g2Var.invalidate();
        lh.c4 c4Var = i9Var.f13517z0;
        if (c4Var != null) {
            c4Var.setKeyboardOffset(fMax);
        }
        wj0 wj0Var2 = this.f13221b2;
        c4 c4Var2 = this.K1;
        if (wj0Var2 != null) {
            wj0Var2.setVisibility((this.f13253m2 <= 0.0f || (c4Var2 != null && c4Var2.f13145f)) ? 8 : 0);
        }
        int i15 = 0;
        while (true) {
            int childCount = getChildCount();
            z2Var = this.L0;
            imageView = this.J0;
            n3Var = this.G0;
            z2Var2 = this.f13298z0;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 0 || childAt == this.S1 || childAt.getTag(R.id.parent_tag) != null || childAt == n3Var.S.o(getContext())) {
                if (childAt == this.S1) {
                    if (this.f13276t2) {
                        childAt.setAlpha((1.0f - this.Z3) * (1.0f - this.f13256n2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.Z3) * hideInterfaceAlpha);
                    }
                }
                i15++;
            } else {
                o2 o2Var8 = this.X1;
                if (o2Var8 != null && childAt == o2Var8.getEmojiView()) {
                    childAt.setTranslationY(this.X1.getEmojiView().getMeasuredHeight() - this.D2);
                } else if (childAt instanceof x30) {
                    x30 x30Var = (x30) childAt;
                    View view2 = x30Var.f34454e;
                    if (view2 != null) {
                        x30Var.g(view2);
                    }
                } else if (childAt != this.F2 && childAt != j3Var && childAt != imageView && childAt != this.K0 && childAt != z2Var && childAt != this.S2 && childAt != this.Z1 && childAt != z2Var2 && ((wj0Var = this.f13257n3) == null || wj0Var.getReactionsWindow() == null || childAt != this.f13257n3.getReactionsWindow().f11270c)) {
                    float f21 = this.f13253m2;
                    if (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) {
                        f21 = 0.0f;
                    }
                    float f22 = 1.0f - f21;
                    float fDp2 = (((((-this.G2) * f22) - (AndroidUtilities.dp(7.0f) * f21)) - this.D2) - (AndroidUtilities.dp(f11) * f22)) - (AndroidUtilities.dp(20.0f) * i9Var.Z);
                    if (childAt == this.T1 || childAt == this.V1 || childAt == this.W1 || childAt == this.U1) {
                        fDp2 += this.D2;
                    }
                    float f23 = this.f13276t2 ? (1.0f - this.f13256n2) * hideInterfaceAlpha : hideInterfaceAlpha * 1.0f;
                    if (childAt == this.X2) {
                        fDp2 = i9Var.Z * (-AndroidUtilities.dp(20.0f));
                    }
                    if (childAt == this.Z2) {
                        fDp2 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                        f23 = this.f13253m2;
                        childAt.invalidate();
                    }
                    if (childAt == this.Y1) {
                        fDp2 -= this.X1.getMeasuredHeight() - this.X1.getAnimatedTop();
                        f23 *= this.f13253m2;
                    }
                    if (childAt == this.f13221b2) {
                        float f24 = (1.0f - y5Var3.f34812c) * (1.0f - f18) * (1.0f - y5Var2.f34812c) * this.f13253m2;
                        float f25 = f23 * f24 * 1.0f;
                        if (childAt.getAlpha() != 0.0f && f25 == 0.0f) {
                            this.f13221b2.n();
                        }
                        childAt.setAlpha(f25);
                        float f26 = (f24 * 0.2f) + f12;
                        childAt.setScaleX(f26);
                        childAt.setScaleY(f26);
                    } else {
                        childAt.setTranslationY(fDp2);
                        o2 o2Var9 = this.X1;
                        if (o2Var9 == null || childAt != o2Var9.J1) {
                            childAt.setAlpha(f23);
                        }
                    }
                }
            }
            i15++;
        }
        float f27 = 0.0f;
        float f28 = (1.0f - f14) * hideInterfaceAlpha;
        imageView.setAlpha((1.0f - this.Z3) * f28);
        z2Var2.setAlpha((1.0f - this.Z3) * f28);
        if (z2Var != null) {
            z2Var.setAlpha((1.0f - this.Z3) * f28);
        }
        for (int i16 = 0; i16 < j3Var.getChildCount(); i16++) {
            View childAt2 = j3Var.getChildAt(i16);
            if (childAt2 != null && childAt2 != this.I0) {
                a4 a4Var = this.f13247k1;
                ag.d dVar = this.f13278u0;
                if (childAt2 == a4Var || childAt2 == this.f13270s0 || childAt2 == this.f13274t0 || childAt2 == dVar || childAt2 == this.S1 || childAt2 == n3Var || childAt2 == this.f13294y0) {
                    float f29 = childAt2 == dVar ? this.a3 : 1.0f;
                    if (childAt2 == n3Var) {
                        childAt2.setAlpha((1.0f - this.Z3) * f29 * hideInterfaceAlpha);
                    } else {
                        childAt2.setAlpha((1.0f - this.Z3) * f29 * hideInterfaceAlpha);
                    }
                } else {
                    childAt2.setAlpha(hideInterfaceAlpha);
                }
            }
        }
        if (this.X1 != null) {
            float fDp3 = AndroidUtilities.dp(40.0f);
            if (c4Var2.f13145f) {
                float fDp4 = AndroidUtilities.dp(46.0f);
                fDp3 = AndroidUtilities.dp(46.0f);
                n1 n1Var = this.W1;
                if (n1Var != null && n1Var.getVisibility() == 0) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                f27 = fDp4;
            } else {
                if (this.O2) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                if (this.P2 && this.f13299z1) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                if (z2Var2.getVisibility() == 0) {
                    fDp3 = (fDp3 - AndroidUtilities.dp(40.0f)) + z2Var2.getLayoutParams().width;
                }
            }
            this.X1.g1(-AndroidUtilities.dp(10.0f), -(AndroidUtilities.dp(10.0f) + fDp3 + f27), this.f13253m2, (this.O2 || this.A1) && !c4Var2.f13145f);
            if (this.X1.getEmojiView() != null) {
                this.X1.getEmojiView().setAlpha(this.f13253m2);
            }
        }
    }

    public final void m0(boolean z10) {
        ValueAnimator valueAnimator = this.Y3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.Z3, z10 ? 1.0f : 0.0f);
        this.Y3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w1(this, 2));
        this.Y3.addListener(new j2(this, z10, 1));
        this.Y3.setDuration(420L);
        this.Y3.setInterpolator(er.h);
        this.Y3.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.f13296y2).isFrozen()) {
            org.telegram.ui.b.b(this.f13296y2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 <= 0 || !this.f13237g3) {
            runnable.run();
            return;
        }
        int i11 = i10 - 1;
        SharedConfig.stealthModeSendMessageConfirm = i11;
        SharedConfig.updateStealthModeSendMessageConfirm(i11);
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 0, this.f13290x0);
        b2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        b2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        h3.x xVar = new h3.x(runnable, 22);
        b2Var.f22754h0 = string;
        b2Var.f22755i0 = xVar;
        String string2 = LocaleController.getString(R.string.Cancel);
        ia.l lVar = new ia.l(15);
        b2Var.f22756j0 = string2;
        b2Var.f22757k0 = lVar;
        b2Var.show();
    }

    public final void o0(int i10) {
        this.A2 = false;
        this.R2 = true;
        this.f13293x3 = false;
        this.f13299z1 = false;
        this.A1 = false;
        long j10 = this.f13291x1;
        a4 a4Var = this.f13247k1;
        org.telegram.ui.Components.y8 y8Var = this.f13244j1;
        if (j10 >= 0) {
            this.f13295y1 = j10 == UserConfig.getInstance(this.f13296y2).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(this.f13291x1));
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.f13296y2).isUserContactBlocked(this.f13291x1);
            this.B1 = !UserConfig.getInstance(this.f13296y2).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.D1 = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            y8Var.m(this.f13296y2, user);
            a4Var.f13033a.getImageReceiver().setForUserOrChat(user, y8Var);
            W0(this.f13291x1, true, false);
        } else {
            this.f13295y1 = false;
            this.f13299z1 = true;
            if (this.O1.h(j10) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.f13293x3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.A1 = !zIsChannelAndNotMegaGroup;
            if (!zIsChannelAndNotMegaGroup && MessagesController.getInstance(this.f13296y2).getChatFull(-this.f13291x1) == null) {
                MessagesStorage.getInstance(this.f13296y2).loadChatInfo(-this.f13291x1, true, new CountDownLatch(1), false, false);
            }
            this.B1 = this.A1 && !ChatObject.canSendPlain(chat);
            this.D1 = MessagesController.getInstance(this.f13296y2).getSendPaidMessagesStars(this.f13291x1);
            y8Var.k(this.f13296y2, chat);
            a4Var.f13033a.getImageReceiver().setForUserOrChat(chat, y8Var);
            W0(this.f13291x1, true, false);
        }
        if (this.G1 && (this.f13295y1 || this.f13299z1)) {
            s6 s6Var = this.O1;
            long j11 = this.f13291x1;
            a0.h hVar = s6Var.f13965m;
            r9 r9Var = (r9) hVar.f(j11);
            if (r9Var == null) {
                r9Var = new r9(s6Var.f13955a, j11, s6Var);
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
        boolean z10 = this.f13299z1;
        j3 j3Var = this.Y0;
        i9 i9Var = this.F0;
        int i11 = 8;
        c4 c4Var = this.K1;
        if (z10) {
            B0();
            if (this.X1 == null && (this.A1 || c4Var.f13145f)) {
                v0();
            }
            if (this.X1 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.f13296y2).getChat(Long.valueOf(-this.f13291x1));
                o2 o2Var = this.X1;
                if (c4Var.f13145f || (!I0() && this.A1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i11 = 0;
                }
                o2Var.setVisibility(i11);
                o2 o2Var2 = this.X1;
                boolean z11 = c4Var.f13145f;
                D0(true);
                o2Var2.h1(z11);
                this.X1.n1(c4Var.f13145f && !D0(true) && (this.f13268r2 || this.X1.S0), true);
                lt editField = this.X1.getEditField();
                long j12 = this.f13291x1;
                TL_stories.StoryItem storyItem = c4Var.f13141a;
                i9Var.getClass();
                editField.setText(i9.u(j12, storyItem));
                this.X1.a1(this.f13296y2, this.f13291x1);
                this.X1.J1(chat2, null);
            }
            org.telegram.ui.Components.i6 i6Var = this.M0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f13290x0;
            if (i6Var == null) {
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.M0 = i6Var2;
                z2 z2Var = this.f13298z0;
                i6Var2.setCallback(z2Var);
                this.M0.r(c6Var.N0(org.telegram.ui.ActionBar.g6.G6));
                this.M0.t(AndroidUtilities.dp(14.0f));
                this.O0 = new org.telegram.ui.Components.y5(z2Var);
            }
            z2 z2Var2 = this.L0;
            if (z2Var2 != null && this.N0 == null) {
                org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, false, false);
                this.N0 = i6Var3;
                i6Var3.setCallback(z2Var2);
                this.N0.r(c6Var.N0(org.telegram.ui.ActionBar.g6.G6));
                this.N0.t(AndroidUtilities.dp(14.0f));
                this.P0 = new org.telegram.ui.Components.y5(z2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.f13287w1 = getStoriesCount();
            j3Var.invalidate();
            invalidate();
        } else if (this.f13295y1) {
            B0();
            if (c4Var.f13145f) {
                this.S1.setVisibility(8);
                if (this.X1 == null) {
                    v0();
                }
                this.X1.setVisibility(0);
            } else {
                this.S1.setVisibility(0);
                o2 o2Var3 = this.X1;
                if (o2Var3 != null) {
                    o2Var3.setVisibility(8);
                }
            }
            o2 o2Var4 = this.X1;
            if (o2Var4 != null) {
                boolean z12 = c4Var.f13145f;
                D0(true);
                o2Var4.h1(z12);
                this.X1.n1(c4Var.f13145f && !D0(true) && (this.f13268r2 || this.X1.S0), true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f13283v1;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(i9Var.L0));
                    if (iIndexOf < 0 && !this.f13283v1.isEmpty()) {
                        if (i9Var.L0 > ((Integer) this.f13283v1.get(0)).intValue()) {
                            iIndexOf = 0;
                        } else if (i9Var.L0 < ((Integer) i0.a.i(1, this.f13283v1)).intValue()) {
                            iIndexOf = this.f13283v1.size() - 1;
                        }
                    }
                    this.F1 = Math.max(0, iIndexOf);
                } else {
                    boolean zIsEmpty = this.f13271s1.isEmpty();
                    ArrayList arrayList2 = this.f13267r1;
                    if (zIsEmpty) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i12)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i12)).f22617id > this.O1.f13959f.get(this.f13291x1)) {
                                this.F1 = i12;
                                break;
                            }
                        }
                    } else {
                        this.F1 = arrayList2.size();
                    }
                }
            }
            f1(false);
            j3Var.invalidate();
            invalidate();
        } else {
            if (this.X1 == null) {
                v0();
            }
            if (this.B1 && this.f13224c2 == null) {
                z0();
            }
            if (this.f13224c2 != null) {
                if (this.B1 || this.C1) {
                    h1();
                }
                this.f13224c2.setVisibility(((!this.B1 || c4Var.f13145f) && !this.C1) ? 8 : 0);
            }
            g8 g8Var = this.f13233f2;
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            o2 o2Var5 = this.X1;
            if (o2Var5 != null) {
                o2Var5.setVisibility((I0() || UserObject.isService(this.f13291x1)) ? 8 : 0);
                o2 o2Var6 = this.X1;
                boolean z13 = c4Var.f13145f;
                D0(true);
                o2Var6.h1(z13);
                this.X1.n1(c4Var.f13145f && !D0(true) && (this.f13268r2 || this.X1.S0), true);
                lt editField2 = this.X1.getEditField();
                long j13 = this.f13291x1;
                TL_stories.StoryItem storyItem2 = c4Var.f13141a;
                i9Var.getClass();
                editField2.setText(i9.u(j13, storyItem2));
                this.X1.a1(this.f13296y2, this.f13291x1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.f13296y2).getUserFull(this.f13291x1);
                if (userFull != null) {
                    this.X1.J1(null, userFull);
                } else {
                    MessagesController.getInstance(this.f13296y2).loadFullUser(MessagesController.getInstance(this.f13296y2).getUser(Long.valueOf(this.f13291x1)), this.f13284v2, false);
                }
            }
            this.f13287w1 = getStoriesCount();
            z2 z2Var3 = this.S1;
            if (z2Var3 != null) {
                z2Var3.setVisibility(8);
            }
            j3Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.W0 = true;
        this.f13219a1.onAttachedToWindow();
        this.f13223c1.onAttachedToWindow();
        this.f13220b1.onAttachedToWindow();
        this.f13240h3.onAttachedToWindow();
        this.f13246j3.onAttachedToWindow();
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13226d1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f13296y2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ig.h0) arrayList.get(i10)).b(true);
            i10++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W0 = false;
        this.f13219a1.onDetachedFromWindow();
        this.f13223c1.onDetachedFromWindow();
        this.f13220b1.onDetachedFromWindow();
        this.f13240h3.onDetachedFromWindow();
        this.f13246j3.onDetachedFromWindow();
        o2 o2Var = this.X1;
        if (o2Var != null) {
            o2Var.D0();
        }
        org.telegram.ui.Components.k5 k5Var = this.f13249k3;
        if (k5Var != null) {
            k5Var.o(this);
            this.f13249k3 = null;
        }
        ig.d dVar = this.f13243i3;
        if (dVar != null) {
            dVar.d(this);
            this.f13243i3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13226d1;
            if (i10 >= arrayList.size()) {
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.f13296y2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ig.h0) arrayList.get(i10)).b(false);
            i10++;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f13275t1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        char c10;
        wj0 wj0Var;
        q2 q2Var;
        i9 i9Var = this.F0;
        if (i9Var.f13467b) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        int i12 = 0;
        if (this.G1 && this.V2 == null) {
            this.f13280u2 = ((z8) this.M1).d.f13491l0;
        } else {
            this.f13280u2 = 0;
        }
        int size = i9Var.f13467b ? View.MeasureSpec.getSize(i11) : View.MeasureSpec.getSize(i11) + this.f13280u2;
        int size2 = (int) ((View.MeasureSpec.getSize(i10) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.f13280u2 < AndroidUtilities.dp(20.0f)) {
            this.f13280u2 = 0;
        }
        int visibleEmojiPadding = this.f13280u2;
        wj0 wj0Var2 = this.f13257n3;
        if (wj0Var2 == null || wj0Var2.getReactionsWindow() == null || this.f13257n3.getReactionsWindow().f11282q) {
            o2 o2Var = this.X1;
            if (o2Var != null && (o2Var.t0() || this.X1.f26107f3)) {
                if (this.X1.getEmojiView().getMeasuredHeight() == 0) {
                    visibleEmojiPadding = this.X1.getEmojiPadding();
                } else {
                    o2 o2Var2 = this.X1;
                    if (o2Var2.f26186u3) {
                        o2Var2.L();
                        visibleEmojiPadding = this.X1.getStickersExpandedHeight();
                    } else {
                        visibleEmojiPadding = o2Var2.getVisibleEmojiPadding();
                    }
                }
            }
        } else {
            this.f13257n3.getReactionsWindow().f11270c.animate().translationY(-this.f13280u2).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
            visibleEmojiPadding = 0;
        }
        boolean z10 = this.f13268r2;
        int i13 = this.f13248k2;
        a4 a4Var = this.f13247k1;
        int i14 = 1;
        if (i13 != visibleEmojiPadding) {
            this.f13268r2 = false;
            int i15 = 3;
            c4 c4Var = this.K1;
            f10 = 8.0f;
            if (visibleEmojiPadding <= 0 || !this.G1) {
                o2 o2Var3 = this.X1;
                if (o2Var3 != null) {
                    i9.J(this.f13291x1, c4Var.f13141a, o2Var3.getEditText());
                }
            } else {
                this.f13268r2 = true;
                this.f13231e3 = false;
                this.f13262p2 = visibleEmojiPadding;
                if (this.f13221b2 == null) {
                    wj0 wj0Var3 = new wj0(1, this.f13296y2, getContext(), LaunchActivity.R(), new m2(i15, this.f13290x0));
                    this.f13221b2 = wj0Var3;
                    wj0Var3.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    wj0 wj0Var4 = this.f13221b2;
                    wj0Var4.J0 = true;
                    addView(wj0Var4, this.E0, h7.z5.d(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.f13221b2.setDelegate(new e3(this));
                    this.f13221b2.p(null, null, true);
                }
                this.f13221b2.setFragment(LaunchActivity.R());
                this.f13221b2.setHint(LocaleController.getString(this.A1 ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                ig.m0 m0Var = ig.m0.B;
                if (m0Var != null) {
                    m0Var.f11360l = true;
                }
                ig.m0 m0Var2 = ig.m0.C;
                if (m0Var2 != null) {
                    m0Var2.f11360l = true;
                }
            }
            o2 o2Var4 = this.X1;
            if (o2Var4 != null) {
                o2Var4.n1(c4Var.f13145f && !D0(true) && this.f13268r2, true);
            }
            if (this.f13268r2 && (q2Var = this.Z2) != null) {
                q2Var.setVisibility(0);
            }
            if (!this.f13268r2 && (wj0Var = this.f13221b2) != null) {
                wj0Var.n();
            }
            a4Var.setEnabled(!this.f13268r2);
            if (this.X1 != null) {
                AndroidUtilities.updateViewVisibilityAnimated(null, !this.f13268r2, 0.1f, true);
            }
            if (this.G1 && this.f13268r2) {
                i9 i9Var2 = ((z8) this.M1).d;
                if (!i9Var2.f13513x) {
                    i9Var2.f13513x = true;
                    i9Var2.P();
                }
            }
            this.f13248k2 = visibleEmojiPadding;
            ValueAnimator valueAnimator = this.f13250l2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.J2.lock();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.D2, visibleEmojiPadding);
            this.f13250l2 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new w1(this, i12));
            this.f13250l2.addListener(new k2(this, i14));
            if (this.f13268r2) {
                this.f13250l2.setDuration(250L);
                this.f13250l2.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                i9Var.m();
            } else {
                this.f13250l2.setDuration(500L);
                this.f13250l2.setInterpolator(er.h);
            }
            this.f13250l2.start();
            boolean z11 = this.f13268r2;
            if (z11 != z10) {
                if (z11) {
                    com.google.firebase.messaging.m mVar = this.L1;
                    Canvas canvas = (Canvas) mVar.f4603b;
                    Bitmap bitmap = (Bitmap) mVar.f4604c;
                    E0(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(i0.b.k(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (c4Var.f13145f) {
                        lh.w3 w3Var = this.Z1;
                        if (w3Var == null) {
                            if (!D0(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                                lh.w3 w3Var2 = new lh.w3(getContext(), 3);
                                this.Z1 = w3Var2;
                                w3Var2.t(LocaleController.getString(R.string.LiveStoryHighlightHint));
                                this.Z1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                                lh.w3 w3Var3 = this.Z1;
                                w3Var3.G = Layout.Alignment.ALIGN_OPPOSITE;
                                w3Var3.f16984h0 = new hh.m5(21, this, w3Var2);
                                addView(w3Var3, h7.z5.e(-1, 100, 87));
                                this.Z1.v();
                                l1();
                            }
                        } else if (!w3Var.R) {
                            removeView(w3Var);
                            if (!D0(true)) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                                lh.w3 w3Var4 = new lh.w3(getContext(), 3);
                                this.Z1 = w3Var4;
                                w3Var4.t(LocaleController.getString(R.string.LiveStoryHighlightHint));
                                this.Z1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                                lh.w3 w3Var5 = this.Z1;
                                w3Var5.G = Layout.Alignment.ALIGN_OPPOSITE;
                                w3Var5.f16984h0 = new hh.m5(21, this, w3Var4);
                                addView(w3Var5, h7.z5.e(-1, 100, 87));
                                this.Z1.v();
                                l1();
                            }
                        }
                    }
                } else {
                    o2 o2Var5 = this.X1;
                    if (o2Var5 != null) {
                        o2Var5.getEditField().clearFocus();
                    }
                    lh.w3 w3Var6 = this.Z1;
                    if (w3Var6 != null) {
                        w3Var6.e(true);
                    }
                }
                this.f13265q2 = true;
            } else {
                this.f13265q2 = false;
            }
        } else {
            f10 = 8.0f;
        }
        o2 o2Var6 = this.X1;
        if (o2Var6 != null && o2Var6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.X1.getEmojiView().getLayoutParams()).gravity = 80;
        }
        j3 j3Var = this.Y0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j3Var.getLayoutParams();
        layoutParams.height = size2;
        boolean z12 = size - size2 > AndroidUtilities.dp(64.0f);
        this.f13276t2 = z12;
        int iDp = (size - ((z12 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams.topMargin = iDp;
        if (this.f13276t2) {
            this.G2 = (((-iDp) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.G2 = ((-iDp) + size) - size2;
        }
        if (this.f13276t2 != this.f13272s2) {
            j3Var.setLayoutParams(layoutParams);
        }
        z2 z2Var = this.S1;
        if (z2Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) z2Var.getLayoutParams();
            if (this.f13276t2) {
                layoutParams2.topMargin = AndroidUtilities.dp(f10) + iDp + size2;
            } else {
                layoutParams2.topMargin = (iDp + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        cg.q qVar = this.X2;
        if (qVar != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
            if (this.f13276t2) {
                c10 = 0;
                this.X2.setTextColor(i0.b.d(0.5f, -16777216, -1));
                layoutParams3.topMargin = AndroidUtilities.dp(12.0f) + iDp + size2;
            } else {
                this.X2.setTextColor(i0.b.k(-1, 191));
                layoutParams3.topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                c10 = 0;
            }
        } else {
            c10 = 0;
        }
        k50 k50Var = this.F2;
        if (k50Var != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) k50Var.getLayoutParams();
            if (visibleEmojiPadding == 0) {
                layoutParams4.bottomMargin = org.telegram.messenger.y1.A(64.0f, iDp + size2, size);
            } else {
                layoutParams4.bottomMargin = AndroidUtilities.dp(64.0f) + visibleEmojiPadding;
            }
        }
        boolean z13 = this.f13276t2;
        LinearLayout linearLayout = this.K0;
        n3 n3Var = this.G0;
        if (z13) {
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + iDp + size2;
            ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f10);
            if (this.f13272s2 != this.f13276t2) {
                n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
            }
            n3Var.f13061q0 = AndroidUtilities.dp(f10);
        } else {
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            int iDp2 = this.f13295y1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
            ((FrameLayout.LayoutParams) n3Var.getLayoutParams()).bottomMargin = iDp2;
            if (this.f13272s2 != this.f13276t2) {
                n3Var.setLayoutParams((FrameLayout.LayoutParams) n3Var.getLayoutParams());
            }
            n3Var.f13061q0 = iDp2;
        }
        this.R2 = true;
        float fDp = AndroidUtilities.dp(48.0f);
        if (this.f13294y0.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(60.0f);
        }
        if (this.f13278u0.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(40.0f);
        }
        eg.c cVar = a4Var.f13034b;
        TextView[] textViewArr = a4Var.f13035c;
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) cVar.getLayoutParams();
        if (layoutParams5.rightMargin != fDp) {
            int i16 = (int) fDp;
            layoutParams5.rightMargin = i16;
            ((FrameLayout.LayoutParams) textViewArr[c10].getLayoutParams()).rightMargin = i16;
            ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i16;
            a4Var.forceLayout();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.f13272s2 = this.f13276t2;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f13253m2 = -1.0f;
        this.R2 = true;
        invalidate();
    }

    public final void p0() {
        n3 n3Var = this.G0;
        if (n3Var.S.y()) {
            n3Var.S.f(false);
        }
    }

    public final void q0() {
        if (this.G1) {
            ((z8) this.M1).d.P();
        }
    }

    public final void r0(boolean z10) {
        if (this.X1 != null && this.f13222b3 && this.W0) {
            v1 v1Var = this.L3;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.O1.B;
            this.X1.K(true);
            boolean z11 = this.B1;
            c4 c4Var = this.K1;
            if ((z11 && !c4Var.f13145f) || this.C1) {
                this.f13237g3 = false;
                this.X1.setEnabled(false);
                this.X1.i1(" ", z10);
                return;
            }
            if (this.D1 > 0) {
                this.f13237g3 = false;
                this.X1.setEnabled(true);
                this.X1.i1(oa.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.D1, ','))), z10);
                return;
            }
            if (!c4Var.f13145f && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.f13296y2).getCurrentTime();
                int i10 = tL_storiesStealthMode.active_until_date;
                if (currentTime < i10) {
                    this.f13237g3 = true;
                    int currentTime2 = i10 - ConnectionsManager.getInstance(this.f13296y2).getCurrentTime();
                    int i11 = currentTime2 / 60;
                    int i12 = currentTime2 % 60;
                    int i13 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int iMeasureText = (int) this.X1.getEditField().getPaint().measureText(LocaleController.formatString(i13, String.format(locale, "%02d:%02d", 99, 99)));
                    this.X1.setEnabled(true);
                    if (iMeasureText * 1.2f >= this.X1.getEditField().getMeasuredWidth()) {
                        o2 o2Var = this.X1;
                        String string = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                        String str = String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
                        o2Var.f26096e = string;
                        o2Var.f26103f = str;
                        o2Var.F1(z10);
                    } else {
                        this.X1.i1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12))), z10);
                    }
                    AndroidUtilities.runOnUIThread(v1Var, 1000L);
                    return;
                }
            }
            this.f13237g3 = false;
            this.X1.setEnabled(true);
            if (!c4Var.f13145f) {
                this.X1.i1(LocaleController.getString(this.A1 ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z10);
                return;
            }
            long starsPrice = this.X1.getStarsPrice();
            if (starsPrice <= 0) {
                this.X1.i1(LocaleController.getString(R.string.Comment), z10);
                return;
            }
            this.X1.i1(oa.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.X1.J4), z10);
            cq cqVar = this.X1.J4[0];
            if (cqVar != null) {
                cqVar.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean s0() {
        if (this.f13260o3) {
            if (this.f13257n3.getReactionsWindow() == null) {
                b1(false);
                return true;
            }
            if (this.f13280u2 > 0) {
                AndroidUtilities.hideKeyboard(this.f13257n3.getReactionsWindow().f11270c);
                return true;
            }
            this.f13257n3.getReactionsWindow().d();
            return true;
        }
        f3 f3Var = this.f13232f1;
        if (f3Var != null) {
            lh.w3 w3Var = f3Var.f13660c;
            if (w3Var != null) {
                w3Var.e(true);
                f3Var.f13660c = null;
            }
            f3Var.f13659b = null;
            f3Var.invalidate();
            f3Var.b(false);
        }
        n3 n3Var = this.G0;
        if (n3Var.S.y()) {
            n3Var.S.f(false);
            return true;
        }
        lh.w3 w3Var2 = this.B0;
        if (w3Var2 != null) {
            w3Var2.e(true);
        }
        lh.w3 w3Var3 = this.C0;
        if (w3Var3 != null) {
            w3Var3.e(true);
        }
        x30 x30Var = this.S2;
        if (x30Var != null) {
            x30Var.b(true);
        }
        x3 x3Var = this.f13261p1;
        if (x3Var != null && x3Var.f30454b) {
            x3Var.a();
            return true;
        }
        o2 o2Var = this.X1;
        if (o2Var != null && o2Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f13290x0);
            if (this.X1.Y0) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new s1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((z8) this.M1).h(alertDialog$Builder.f22702a);
            return true;
        }
        wj0 wj0Var = this.f13221b2;
        if (wj0Var != null && wj0Var.getReactionsWindow() != null && !this.f13221b2.getReactionsWindow().f11282q) {
            this.f13221b2.getReactionsWindow().d();
            return true;
        }
        o2 o2Var2 = this.X1;
        if (o2Var2 != null && o2Var2.t0()) {
            if (this.f13280u2 > 0) {
                AndroidUtilities.hideKeyboard(this.X1.getEmojiView());
                return true;
            }
            this.X1.n0(true, false, true);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (n3Var.getVisibility() != 0 || n3Var.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            n3Var.C();
            this.f13225c3 = false;
            this.Y0.invalidate();
            return true;
        }
        o2 o2Var3 = this.X1;
        if (o2Var3 != null) {
            long j10 = this.f13291x1;
            TL_stories.StoryItem storyItem = this.K1.f13141a;
            Editable editText = o2Var3.getEditText();
            this.F0.getClass();
            i9.J(j10, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.X1);
        return true;
    }

    public void setAccount(int i10) {
        this.f13296y2 = i10;
        this.O1 = MessagesController.getInstance(i10).storiesController;
        this.f13235g1.f42713b = i10;
        wj0 wj0Var = this.f13221b2;
        if (wj0Var != null) {
            wj0Var.setCurrentAccount(i10);
            this.f13221b2.p(null, null, true);
        }
        wj0 wj0Var2 = this.f13257n3;
        if (wj0Var2 != null) {
            wj0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(y3 y3Var) {
        this.M1 = y3Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f13222b3 == z10) {
            return;
        }
        this.f13222b3 = z10;
        if (z10) {
            this.f13219a1.setCurrentAlpha(1.0f);
            r0(false);
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.G1) {
            this.H2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f10) {
        boolean z10 = f10 == 0.0f;
        if (this.X0 != z10) {
            this.X0 = z10;
            this.Y0.invalidate();
            if (this.G1 && this.F0.f13464a && Build.VERSION.SDK_INT < 33) {
                a8.b bVar = this.R3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    i9 i9Var = ((z8) this.M1).d;
                    i9Var.f13484h1 = true;
                    i9Var.P();
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            y2 y2Var = this.f13219a1;
            if (z10) {
                y2Var.stopAnimation();
                y2Var.setAllowStartAnimation(false);
            } else {
                y2Var.startAnimation();
                y2Var.setAllowStartAnimation(true);
            }
            this.T0 = 0L;
            this.Y0.invalidate();
        }
    }

    public final void t0() {
        if (this.E2 == null) {
            t2 t2Var = new t2(this, getContext(), this.f13290x0);
            this.E2 = t2Var;
            t2Var.V1 = new u2(this);
            t2Var.f28650f0.f0();
            t2 t2Var2 = this.E2;
            t2Var2.S = true;
            t2Var2.r1();
            t2 t2Var3 = this.E2;
            t2Var3.T = new v2(this);
            t2Var3.m1().setText(this.X1.getFieldText());
        }
    }

    public final void u0() {
        if (this.T1 != null || getContext() == null) {
            return;
        }
        a aVar = new a(getContext(), this.E3);
        this.T1 = aVar;
        aVar.setOnClickListener(new x1(this, 1));
        addView(this.T1, h7.z5.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.f13290x0;
        o2 o2Var = new o2(this, AndroidUtilities.findActivity(getContext()), this, new m2(1, c6Var));
        this.X1 = o2Var;
        o2Var.getEditField().useAnimatedTextDrawable();
        this.X1.getEditField().setScaleX(0.0f);
        this.X1.setOverrideKeyboardAnimation(true);
        this.X1.setClipChildren(false);
        this.X1.setDelegate(new p2(this));
        setDelegate(this.X1);
        o2 o2Var2 = this.X1;
        o2Var2.f26182t4 = false;
        o2Var2.f26187u4 = true;
        if (this.K1.f13145f) {
            o2Var2.U0(false, false, false);
        } else {
            o2Var2.U0(true, true, false);
        }
        this.X1.d();
        o2 o2Var3 = this.X1;
        o2Var3.v4 = true;
        addView(o2Var3, h7.z5.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.K3 != null) {
            this.X1.O1(false);
        }
        this.X1.B2 = this.f13284v2;
        d4 d4Var = this.I2;
        d4Var.f13196g.add(this.Y0);
        d4Var.f13196g.add(this);
        if (this.W0) {
            this.X1.E0();
        }
        r0(false);
        if (I0()) {
            this.X1.setVisibility(8);
        }
        sg.g gVar = new sg.g(getContext(), c6Var, this.E3, this.B3);
        this.Y1 = gVar;
        gVar.setOnClickListener(new s1(this, 1));
        addView(this.Y1, h7.z5.e(57, 300, 85));
        this.Y1.setVisibility(8);
        this.X1.setSideButtonsForAttach(this.Y1);
        this.E0 = getChildCount();
    }

    public final void w0() {
        if (this.f13233f2 != null) {
            return;
        }
        g8 g8Var = new g8(getContext(), this.f13290x0);
        this.f13233f2 = g8Var;
        g8Var.setOnClickListener(new x1(this, 4));
        this.f13233f2.setAlpha(0.0f);
        this.f13233f2.setVisibility(8);
        addView(this.f13233f2, h7.z5.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        if (this.W1 != null || getContext() == null) {
            return;
        }
        n1 n1Var = new n1(getContext(), this.E3);
        this.W1 = n1Var;
        n1Var.setOnClickListener(new x1(this, 5));
        n1 n1Var2 = this.W1;
        d1 d1Var = d1.S;
        boolean z10 = true;
        n1Var2.b(d1Var != null && d1Var.o(), false);
        n1 n1Var3 = this.W1;
        d1 d1Var2 = d1.S;
        if (d1Var2 != null && !d1Var2.m()) {
            z10 = false;
        }
        n1Var3.a(z10, false);
        addView(this.W1, h7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void y0() {
        if (this.V1 != null || getContext() == null) {
            return;
        }
        this.U1 = new q1(getContext(), this.f13296y2);
        r1 r1Var = new r1(getContext(), this.U1, this.E3);
        this.V1 = r1Var;
        r1Var.setOnClickListener(new x1(this, 6));
        this.V1.setOnLongClickListener(new u1(this, 1));
        addView(this.V1, h7.z5.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.U1, h7.z5.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void z0() {
        if (this.f13224c2 != null) {
            return;
        }
        if (this.X1 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13224c2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f13227d2 = textView;
        textView.setTextColor(-8026747);
        this.f13227d2.setTextSize(1, 16.0f);
        this.f13227d2.setText(LocaleController.getString(this.A1 ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.f13230e2 = textView2;
        textView2.setTextColor(-1);
        this.f13230e2.setTextSize(1, 12.0f);
        TextView textView3 = this.f13230e2;
        int iDp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 452984831, 855638015, 855638015));
        this.f13230e2.setGravity(17);
        h7.b6.a(this.f13230e2);
        this.f13230e2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f13230e2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f13224c2.addView(imageView, h7.z5.t(22, 22, 16, 12, 1, 4, 0));
        this.f13224c2.addView(this.f13227d2, h7.z5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f13224c2.addView(this.f13230e2, h7.z5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.X1.addView(this.f13224c2, h7.z5.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
