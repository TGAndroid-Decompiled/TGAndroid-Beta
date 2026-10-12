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
import org.telegram.messenger.am;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cs;
import org.telegram.ui.eo;
import org.telegram.ui.hz;
import org.telegram.ui.sv0;
public abstract class f6 extends yw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.c6 B0;
    public long B1;
    public h0 B2;
    public boolean B3;
    public final ob C0;
    public boolean C1;
    public int C2;
    public cs C3;
    public final n4 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.e1 D3;
    public r9 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.e1 E3;
    public ci.d4 F0;
    public boolean F1;
    public o4 F2;
    public final ah.c F3;
    public ci.d4 G0;
    public boolean G1;
    public boolean G2;
    public final fh.a G3;
    public ci.d4 H0;
    public long H1;
    public float H2;
    public final fh.d H3;
    public int I0;
    public final float I1;
    public h4 I2;
    public final dh.b I3;
    public final kc J0;
    public int J1;
    public w60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final h5 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final s3 L0;
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
    public final org.telegram.ui.Components.g6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final n4 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.g6 P2;
    public final d3 P3;
    public org.telegram.ui.Components.q6 Q0;
    public y5 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.q6 R0;
    public boolean R1;
    public long R2;
    public final d3 R3;
    public org.telegram.ui.Components.g6 S0;
    public m9 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.g6 T0;
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
    public final r4 V3;
    public long W0;
    public n4 W1;
    public c50 W2;
    public final org.telegram.ui.Components.g6 W3;
    public long X0;
    public c X1;
    public final sv0 X2;
    public final org.telegram.ui.Components.g6 X3;
    public boolean Y0;
    public x2 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.g6 Y3;
    public boolean Z0;
    public y2 Z1;
    public k4 Z2;
    public float Z3;
    public boolean f946a1;
    public s2 a2;
    public FrameLayout f947a3;
    public final Path f948a4;
    public boolean f949b1;
    public b4 f950b2;
    public q4 f951b3;
    public boolean f952b4;
    public final b5 f953c1;
    public jh.h f954c2;
    public boolean f955c3;
    public ValueAnimator f956c4;
    public final FrameLayout f957d1;
    public ci.d4 f958d2;
    public d4 f959d3;
    public float f960d4;
    public final m4 f961e1;
    public ValueAnimator f962e2;
    public float f963e3;
    public final ImageReceiver f964f1;
    public nl0 f965f2;
    public boolean f966f3;
    public final ImageReceiver f967g1;
    public LinearLayout f968g2;
    public boolean f969g3;
    public final ArrayList f970h1;
    public TextView f971h2;
    public boolean f972h3;
    public Runnable f973i1;
    public TextView f974i2;
    public boolean f975i3;
    public final w4 f976j1;
    public hb f977j2;
    public boolean j3;
    public final hz f978k1;
    public ViewPropertyAnimator f979k2;
    public boolean f980k3;
    public m6 l1;
    public final ch.d f981l2;
    public final ImageReceiver f982l3;
    public float f983m1;
    public final ch.d f984m2;
    public zg.d f985m3;
    public final org.telegram.ui.Components.j9 f986n1;
    public final Paint f987n2;
    public final ImageReceiver f988n3;
    public final b6 f989o1;
    public int f990o2;
    public org.telegram.ui.Components.s5 f991o3;
    public final ib f992p1;
    public ValueAnimator f993p2;
    public boolean f994p3;
    public j6.l f995q1;
    public float f996q2;
    public boolean f997q3;
    public int f998r1;
    public float f999r2;
    public nl0 f1000r3;
    public org.telegram.ui.ActionBar.e1 f1001s1;
    public float f1002s2;
    public boolean f1003s3;
    public w5 f1004t1;
    public int f1005t2;
    public float f1006t3;
    public TL_stories.PeerStories f1007u1;
    public boolean f1008u2;
    public boolean f1009u3;
    public final ArrayList f1010v1;
    public boolean f1011v2;
    public float f1012v3;
    public final ImageView f1013w0;
    public final ArrayList f1014w1;
    public boolean f1015w2;
    public int f1016w3;
    public final ImageView f1017x0;
    public final c6 f1018x1;
    public boolean f1019x2;
    public int f1020x3;
    public final x5 f1021y0;
    public final j6 f1022y1;
    public int f1023y2;
    public int y3;
    public final ik0 f1024z0;
    public ArrayList f1025z1;
    public final int f1026z2;
    public d3 f1027z3;

    public f6(Context context, final kc kcVar, c6 c6Var, org.telegram.ui.ActionBar.c6 c6Var2) {
        super(context, null);
        this.f949b1 = true;
        this.f970h1 = new ArrayList();
        this.f998r1 = -5;
        this.I1 = 1.0f;
        d6 d6Var = new d6(this);
        this.O1 = d6Var;
        this.f996q2 = -1.0f;
        this.f999r2 = -1.0f;
        this.f1002s2 = -1.0f;
        this.f1026z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.g6(this);
        this.P2 = new org.telegram.ui.Components.g6(this);
        sv0 sv0Var = new sv0();
        this.X2 = sv0Var;
        this.f963e3 = 1.0f;
        this.P3 = new d3(this, 4);
        this.R3 = new d3(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new r4(this, 0);
        this.W3 = new org.telegram.ui.Components.g6(this);
        this.X3 = new org.telegram.ui.Components.g6(this);
        this.Y3 = new org.telegram.ui.Components.g6(this);
        this.f948a4 = new Path();
        sv0Var.E = new a6.m(this, 1);
        ?? obj = new Object();
        obj.f885g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f1010v1 = new ArrayList();
        this.f1014w1 = new ArrayList();
        m4 m4Var = new m4(this, 0);
        this.f961e1 = m4Var;
        m4Var.setCrossfadeWithOldImage(false);
        m4Var.setAllowLoadingOnAttachedOnly(true);
        m4Var.ignoreNotifications = true;
        m4Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f982l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f988n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f964f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f967g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        m4Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f986n1 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
        this.J0 = kcVar;
        this.f1018x1 = c6Var;
        this.P1 = c6Var.f762g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        c6Var.f766l.setColor(-16777216);
        this.f987n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = c6Var2;
        setClipChildren(false);
        w4 w4Var = new w4(this, context, this.f953c1, c6Var2, kcVar);
        this.f976j1 = w4Var;
        dh.b bVar = new dh.b(c6Var2, org.telegram.ui.ActionBar.h6.Sd, 0.8f);
        this.I3 = bVar;
        fh.c cVar = new fh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            fh.d dVar = new fh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        hh.j jVar = new hh.j(this);
        ah.c cVar2 = new ah.c(this.G3);
        cVar2.f547f = jVar;
        cVar2.f548g = this;
        this.F3 = cVar2;
        this.f981l2 = cVar2.c(this, bVar, false);
        ch.d c10 = cVar2.c(this, bVar, false);
        this.f984m2 = c10;
        c10.u(AndroidUtilities.dp(32.0f));
        b5 b5Var = new b5(this, context, c6Var, kcVar);
        this.f953c1 = b5Var;
        b5Var.setClipChildren(false);
        this.f978k1 = new hz(this.C2, b5Var);
        b5Var.addView(w4Var, w7.w5.d(-1.0f, -1));
        h5 h5Var = new h5(this, getContext(), kcVar.f1306y, kcVar, c6Var2);
        this.K0 = h5Var;
        h5Var.f1967b0.setOnClickListener(new f3(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(c6Var.f767m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new f3(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.y5.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(c6Var.f768n);
        imageView2.setPadding(dp, dp, dp, dp);
        n4 n4Var = new n4(this, getContext(), 1);
        this.P0 = n4Var;
        org.telegram.ui.Components.q6 q6Var = this.R0;
        if (q6Var != null) {
            q6Var.setCallback(n4Var);
        }
        n4Var.setWillNotDraw(false);
        n4Var.setOnClickListener(new f3(this, 12));
        n4 n4Var2 = new n4(this, getContext(), 2);
        this.D0 = n4Var2;
        org.telegram.ui.Components.q6 q6Var2 = this.Q0;
        if (q6Var2 != null) {
            q6Var2.setCallback(n4Var2);
        }
        n4Var2.setWillNotDraw(false);
        n4Var2.setOnClickListener(new f3(this, 13));
        n4Var2.setOnLongClickListener(new r3(0, this, kcVar));
        r9 r9Var = new r9(context, c6Var);
        this.E0 = r9Var;
        r9Var.setPadding(dp, dp, dp, dp);
        n4Var2.addView(this.E0, w7.w5.e(40, 40, 3));
        n4Var.addView(imageView2, w7.w5.e(40, 40, 3));
        w7.y5.b(n4Var2, 0.3f, 5.0f);
        w7.y5.b(n4Var, 0.3f, 5.0f);
        m4Var.setAllowLoadingOnAttachedOnly(true);
        m4Var.setParentView(b5Var);
        j6 j6Var = new j6(10);
        this.f1022y1 = j6Var;
        b5Var.setOutlineProvider(j6Var);
        b5Var.setClipToOutline(true);
        addView(b5Var);
        b6 b6Var = new b6(context, d6Var);
        this.f989o1 = b6Var;
        b6Var.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f640b;

            {
                this.f640b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f6 f6Var = this.f640b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                        kc kcVar2 = kcVar;
                        if (i11 == 0) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", f6Var.B1);
                            kcVar2.H(new hb0(f7, null));
                            return;
                        } else if (j10 > 0) {
                            kcVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            kcVar2.H(eo.W9(j10));
                            return;
                        }
                    default:
                        f6 f6Var2 = this.f640b;
                        if (f6Var2.O1.j()) {
                            kcVar.O();
                            if (!kc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            x5 x5Var = f6Var2.f1021y0;
                            if (!kc.D1) {
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
        b5Var.addView(b6Var, w7.w5.a(-2.0f, 0.0f, 17.0f, 0.0f, 0.0f, -1, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f957d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.w5.q(40, 40, 5));
        linearLayout.addView(n4Var, w7.w5.q(40, 40, 5));
        linearLayout.addView(n4Var2, w7.w5.q(40, 40, 5));
        addView(linearLayout, w7.w5.a(-2.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2, 5));
        ImageView imageView3 = new ImageView(context);
        this.f1013w0 = imageView3;
        imageView3.setImageDrawable(c6Var.f771q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        b5Var.addView(imageView3, w7.w5.a(40.0f, 2.0f, 15.0f, 2.0f, 0.0f, 40, 53));
        ImageView imageView4 = new ImageView(context);
        this.f1017x0 = imageView4;
        imageView4.setImageDrawable(c6Var.f772r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        b5Var.addView(imageView4, w7.w5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        imageView4.setOnClickListener(new v0(kcVar, 1));
        imageView3.setOnClickListener(new s0(this, c6Var2, kcVar, context, c6Var, 1));
        x5 x5Var = new x5(context, 0);
        this.f1021y0 = x5Var;
        b5Var.addView(x5Var, w7.w5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 40, 53));
        ?? imageView5 = new ImageView(context);
        this.f1024z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        x5Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(c6Var.f774t);
        x5Var.addView(imageView6);
        imageView6.setVisibility(8);
        ob obVar = new ob(context);
        this.C0 = obVar;
        obVar.setOnClickListener(new f3(this, 2));
        b5Var.addView(obVar, w7.w5.a(40.0f, 2.0f, 15.0f, 42.0f, 0.0f, 60, 53));
        x5Var.setOnClickListener(new View.OnClickListener(this) {
            public final f6 f640b;

            {
                this.f640b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        f6 f6Var = this.f640b;
                        long j3 = UserConfig.getInstance(f6Var.C2).clientUserId;
                        long j10 = f6Var.B1;
                        int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                        kc kcVar2 = kcVar;
                        if (i11 == 0) {
                            Bundle f7 = org.telegram.ui.Cells.c1.f(1, "type");
                            f7.putLong("dialog_id", f6Var.B1);
                            kcVar2.H(new hb0(f7, null));
                            return;
                        } else if (j10 > 0) {
                            kcVar2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            kcVar2.H(eo.W9(j10));
                            return;
                        }
                    default:
                        f6 f6Var2 = this.f640b;
                        if (f6Var2.O1.j()) {
                            kcVar.O();
                            if (!kc.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            x5 x5Var2 = f6Var2.f1021y0;
                            if (!kc.D1) {
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
        this.f992p1 = new ib(this, c6Var);
        b5Var.addView(h5Var, w7.w5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        s3 s3Var = new s3(this, context, kcVar, kcVar.v, view, frameLayout, kcVar);
        this.L0 = s3Var;
        b5Var.addView(view, w7.w5.e(-1, 200, 87));
        b5Var.addView(s3Var, w7.w5.a(-1.0f, 0.0f, 64.0f, 0.0f, 0.0f, -1, 0));
        b5Var.addView(frameLayout, w7.w5.a(100.0f, 0.0f, 55.0f, 0.0f, 0.0f, -1, 0));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        x5Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        n4Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        n4Var.setBackground(org.telegram.ui.ActionBar.h6.j0(dp7, dp7, dp7, dp7, 0, k15, k15));
        org.telegram.ui.Cells.y9 y9Var = h5Var.W;
        View n10 = y9Var.n(context);
        if (n10 != null) {
            AndroidUtilities.removeFromParent(n10);
            addView(n10);
        }
        y9Var.D = new t3(this, 0);
        y9Var.S(this);
    }

    public static void V0(l9 l9Var, ImageReceiver imageReceiver, String str) {
        if (l9Var.f1354s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(l9Var.f1351f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(l9Var.f1350e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(f6 f6Var, ValueAnimator valueAnimator) {
        float f7;
        ob obVar = f6Var.C0;
        f6Var.f960d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b6 b6Var = f6Var.f989o1;
        b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f960d4);
        b6Var.setAlpha(1.0f - f6Var.f960d4);
        ImageView imageView = f6Var.f1013w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f960d4);
        imageView.setAlpha(1.0f - f6Var.f960d4);
        ImageView imageView2 = f6Var.f1017x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f960d4);
        imageView2.setAlpha(1.0f - f6Var.f960d4);
        x5 x5Var = f6Var.f1021y0;
        x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f960d4);
        x5Var.setAlpha((1.0f - f6Var.f960d4) * f6Var.f963e3);
        n4 n4Var = f6Var.W1;
        if (n4Var != null) {
            n4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var.f960d4);
            f6Var.W1.setAlpha(1.0f - f6Var.f960d4);
        }
        if (obVar != null) {
            obVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var.f960d4);
            obVar.setAlpha(1.0f - f6Var.f960d4);
        }
        f6Var.K0.setAlpha(1.0f - f6Var.f960d4);
        y5 y5Var = f6Var.Q1;
        if (y5Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((bc) y5Var).d.V;
        }
        float hideInterfaceAlpha = f6Var.getHideInterfaceAlpha();
        n4 n4Var2 = f6Var.D0;
        if (n4Var2 != null) {
            n4Var2.setAlpha((1.0f - f6Var.f960d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = f6Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - f6Var.f960d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        n4 n4Var3 = f6Var.P0;
        if (n4Var3 != null) {
            n4Var3.setAlpha((1.0f - f6Var.f960d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b4 b4Var = f6Var.f950b2;
        if (b4Var != null) {
            b4Var.setAlpha(1.0f - f6Var.f960d4);
            f6Var.invalidate();
        }
        f6Var.f953c1.invalidate();
    }

    public static void a0(f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.e1 e1Var = f6Var.D3;
        if (e1Var != null && f6Var.C3 != null && e1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(kc.B1 - 0.2f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(kc.B1 - 0.5f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(kc.B1 - 1.0f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(kc.B1 - 1.5f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(kc.B1 - 2.0f) < 0.05f) {
                    f6Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.e1 e1Var2 = f6Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    e1Var2.setSubtext(LocaleController.formatString(i10, gd.a(kc.B1) + "x"));
                }
            }
            f6Var.C3.a(kc.B1, z10);
        }
    }

    public static void b0(f6 f6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!f6Var.I0() && !f6Var.O1.f824f) {
            if (UserConfig.getInstance(f6Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0).setOnClickListener(new f3(f6Var, 8));
                return;
            }
            Drawable drawable = f6Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            u3 u3Var = new u3(f6Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 0);
            org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, f6Var.B0);
            c10.setOnClickListener(new f3(f6Var, 9));
            c10.setIcon(u3Var);
        }
    }

    public static void d0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        TL_stories.StoryItem storyItem = d6Var.f820a;
        if ((storyItem == null && d6Var.f821b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = d6Var.h();
        boolean z10 = d6Var.f823e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), f6Var.getContext(), z10 ? 1 : 0, null, null, new j3(0, f6Var, z10));
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
        AndroidUtilities.runOnUIThread(new i3(f6Var, MessagesController.getInstance(f6Var.C2), j3, !z10, str, user), 200L);
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
        alertDialog$Builder.f20142a.R = LocaleController.getString(i10);
        if (f6Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f20142a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new z2(f6Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w1(6));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        ((bc) f6Var.Q1).h(a2Var);
        a2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f26301c;
        t7 t7Var = this.J0.f1301w;
        if (t7Var == null) {
            f7 = 0.0f;
        } else {
            f7 = t7Var.f1740f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        kc kcVar;
        if (!this.O1.f824f || (kcVar = this.J0) == null || kcVar.A0 == null || D0(true)) {
            return 0L;
        }
        return kcVar.A0.j();
    }

    public static void h0(f6 f6Var) {
        String str;
        org.telegram.ui.Components.sc J;
        org.telegram.ui.ActionBar.c6 c6Var = f6Var.B0;
        b5 b5Var = f6Var.f953c1;
        if (f6Var.G1) {
            return;
        }
        if (f6Var.E1) {
            if (f6Var.J3 != null && f6Var.K3 != null) {
                rg.j0.D1(new z3(f6Var, 0), f6Var.J3, f6Var.K3, f6Var.B1, true);
                return;
            }
            kc kcVar = f6Var.J0;
            if (kcVar != null) {
                kcVar.f1277k1 = true;
                kcVar.P();
            }
            MessagesController.getInstance(f6Var.C2).getBoostsController().getBoostsStats(f6Var.B1, new g3(f6Var, 0));
            return;
        }
        b4 b4Var = f6Var.f950b2;
        int i10 = -f6Var.f998r1;
        f6Var.f998r1 = i10;
        AndroidUtilities.shakeViewSpring(b4Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (f6Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(f6Var.C2).premiumFeaturesBlocked()) {
            J = new zc(b5Var, c6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new zc(b5Var, c6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new d3(f6Var, 5));
        }
        J.j();
    }

    public static void j0(f6 f6Var) {
        d6 d6Var = f6Var.O1;
        if (d6Var.f820a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f20047id = d6Var.f820a.f20042id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(f6Var.B1);
        ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f951b3 != null) {
            return;
        }
        q4 q4Var = new q4(getContext(), 0);
        this.f951b3 = q4Var;
        q4Var.setTextSize(1, 14.0f);
        this.f951b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.f951b3.setGravity(19);
        this.f951b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f951b3, w7.w5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, 3));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        n4 n4Var = new n4(this, getContext(), 0);
        this.W1 = n4Var;
        n4Var.setClickable(true);
        addView(this.W1, w7.w5.a(48.0f, 0.0f, 0.0f, 136.0f, 0.0f, -1, 48));
        o4 o4Var = new o4(this, getContext());
        this.F2 = o4Var;
        o4Var.setOnClickListener(new f3(this, 0));
        this.W1.addView(this.F2, w7.w5.a(32.0f, 9.0f, 11.0f, 0.0f, 0.0f, -1, 0));
        h0 h0Var = new h0(0, getContext(), false);
        this.B2 = h0Var;
        h0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.w5.a(28.0f, 13.0f, 13.0f, 0.0f, 0.0f, -1, 0));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.w5.a(-2.0f, 0.0f, 16.0f, 0.0f, 9.0f, -2, 0));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f1018x1.f773s);
        o4 o4Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        o4Var2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.N(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f947a3 != null) {
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
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        TextView textView2 = new TextView(getContext());
        w7.y5.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.h6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(i11, c6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, k10, k10));
        textView2.setOnClickListener(new f3(this, 3));
        linearLayout.addView(textView, w7.w5.n(-1, -2));
        linearLayout.addView(textView2, w7.w5.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.w5.a(-2.0f, 72.0f, 0.0f, 72.0f, 0.0f, -1, 17));
        this.f953c1.addView(frameLayout);
        this.f947a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        d2 d2Var;
        TLRPC.Peer i10;
        d2 d2Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        int i11 = (this.B1 > 0L ? 1 : (this.B1 == 0L ? 0 : -1));
        kc kcVar = this.J0;
        if (i11 < 0 && (d2Var2 = kcVar.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = d2Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (kcVar.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && kcVar != null && (d2Var = kcVar.A0) != null && d2Var.l()) {
            if (!z10 || (i10 = kcVar.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
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
        org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) e6Var.f883e;
        if (l4Var != null && ((SurfaceView) e6Var.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) e6Var.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (l4Var != null && (textureView = (TextureView) e6Var.f884f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            b5 b5Var = this.f953c1;
            canvas.scale(i10 / b5Var.getMeasuredWidth(), i11 / b5Var.getMeasuredHeight());
            this.f961e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(ci.da daVar, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        y5 y5Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        ci.fa faVar = new ci.fa(context, i10, this.B0);
        faVar.r1(daVar);
        ci.h1 h1Var = faVar.f5092b;
        if (h1Var != null) {
            for (View view : h1Var.getViewPages()) {
                if (view instanceof ci.y9) {
                    ((ci.y9) view).e(false);
                }
            }
        }
        faVar.l1(true);
        faVar.T = new ah.b(1, this, storyItem);
        ((bc) y5Var).h(faVar);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        b5 b5Var = this.f953c1;
        float x11 = view.getX() + b5Var.getX() + x10;
        float y3 = view.getY() + b5Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        e9 e9Var;
        kc kcVar = this.J0;
        if (kcVar != null && (e9Var = kcVar.O0) != null && e9Var.f894e == 4) {
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

    public final void L0(zg.n0 n0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        d6 d6Var = this.O1;
        TL_stories.StoryItem storyItem = d6Var.f820a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && n0Var == null) {
            l0();
            this.S1.g0(this.B1, d6Var.f820a, null);
        } else if (n0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f994p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = zg.j0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f982l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f997q3 = true;
                this.S1.g0(this.B1, d6Var.f820a, zg.n0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, d6Var.f820a, n0Var);
        }
        TL_stories.StoryItem storyItem2 = d6Var.f820a;
        n4 n4Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(zg.n0.d(reaction));
            n4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            n4Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = d6Var.f820a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = d6Var.f820a.views;
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
        TL_stories.StoryItem storyItem4 = d6Var.f820a;
        zg.p0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        d2 d2Var;
        boolean z10;
        if (this.O3 == null) {
            kc kcVar = this.J0;
            if (kcVar != null && (d2Var = kcVar.A0) != null) {
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
            b4 b4Var = this.f950b2;
            if (b4Var != null && sendAsPeers != null) {
                b4Var.S1(true);
            }
        }
    }

    public final boolean N0() {
        b4 b4Var = this.f950b2;
        if (b4Var == null) {
            return false;
        }
        boolean z10 = b4Var.f23773z2;
        if (z10) {
            b4Var.u1();
        }
        AndroidUtilities.runOnUIThread(new d3(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        g3 g3Var;
        int i10;
        long j10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f950b2.getTextWithEntities();
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
        g3 g3Var2 = new g3(this, 1);
        d dVar = new d();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (org.telegram.ui.ActionBar.c6) dVar, false);
        e3Var.fixNavigationBar();
        e3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j12;
            g3Var = g3Var2;
            i10 = ((org.telegram.ui.Components.b6[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.b6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j12;
            g3Var = g3Var2;
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
        final gr[] grVarArr = new gr[1];
        final ci.d dVar2 = new ci.d(context, null, true);
        final ?? obj = new Object();
        obj.f1380c = clientUserId;
        obj.f1382f = textWithEntities;
        obj.f1383g = jArr[0];
        final h1 h1Var = new h1(i12, context, true);
        LinearLayout e7 = am.e(context, 0);
        final f0 f0Var = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), dVar);
        e7.addView(f0Var, w7.w5.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final f0 f0Var2 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), dVar);
        e7.addView(f0Var2, w7.w5.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final f0 f0Var3 = new f0(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), dVar);
        e7.addView(f0Var3, w7.w5.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final e0 e0Var = new e0(context, dVar, r6);
        final boolean[] zArr = {true};
        g3 g3Var3 = g3Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar2.g(yh.p7.W0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), grVarArr), true, true);
                long j14 = jArr2[0];
                m1 m1Var = obj;
                m1Var.f1383g = j14;
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
                ((org.telegram.ui.Components.r6) f0Var.f931b).c(formatString, true, true);
                ((org.telegram.ui.Components.r6) f0Var2.f931b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.r6) f0Var3.f931b).c(LocaleController.formatNumber(b12, ','), true, true);
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
        if (arrayList.isEmpty() || ((Integer) hg.c.h(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        e0Var.f52689e0 = iArr4;
        e0Var.setValue((int) jArr[0]);
        linearLayout.addView(e0Var, w7.w5.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(e7, w7.w5.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.h6.f20668j5;
        TextView b10 = w7.a6.b(context, 20.0f, i21, true, dVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.w5.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.a6.b(context, 14.0f, i21, false, dVar);
        b11.setGravity(17);
        am.r(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.w5.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(h1Var, w7.w5.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar2, w7.w5.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        e3Var.show();
        dVar2.setOnClickListener(new d0(g3Var3, jArr, e3Var, 0));
    }

    public final void P0() {
        if (this.f950b2 == null) {
            return;
        }
        t0();
        this.I2.f24350j0.f0();
        this.I2.N1(-1, true);
        h4 h4Var = this.I2;
        h4Var.Z = this.B1;
        h4Var.t1();
        this.I2.o1().setText(this.f950b2.getFieldText());
        ((bc) this.Q1).h(this.I2);
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
        this.J0.H(new eo(bundle));
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
        d6 d6Var;
        if (this.K1 != z10) {
            this.K1 = z10;
            ik0 ik0Var = this.f1024z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f1251a && Build.VERSION.SDK_INT < 33) {
                    kc kcVar = ((bc) this.Q1).d;
                    kcVar.l1 = true;
                    kcVar.P();
                    r4 r4Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(r4Var);
                    AndroidUtilities.runOnUIThread(r4Var, 100L);
                }
                R0(j3);
                g1();
                ik0Var.setAnimation(this.f1018x1.f775u);
                this.K1 = true;
                this.f989o1.f709a.getImageReceiver().setVisible(true, true);
                if (this.O1.f820a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + d6Var.f820a.f20042id + " " + d6.c(d6Var));
                }
            } else {
                p0();
                ik0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f953c1.invalidate();
                invalidate();
                q0();
                kc kcVar2 = ((bc) this.Q1).d;
                kcVar2.I0 = false;
                kcVar2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f961e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f964f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f967g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                m9 m9Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = m9Var.f1414m;
                tc tcVar = (tc) iVar.f(j10);
                if (tcVar == null) {
                    tcVar = new tc(m9Var.f1404a, j10, m9Var);
                    iVar.k(tcVar, j10);
                }
                tcVar.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            d6 d6Var = this.O1;
            d6Var.f821b = null;
            d6Var.f820a = null;
        }
        this.B1 = j3;
        this.f1025z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        m9 m9Var = this.S1;
        TL_stories.PeerStories y3 = m9Var.y(j3);
        if (y3 == null) {
            y3 = m9Var.z(j3);
        } else {
            z10 = false;
        }
        m9Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        b6 b6Var = this.f989o1;
        if (i10 >= 0) {
            if (this.C1 && !z11) {
                b6Var.f710b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                b6Var.f710b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                hr hrVar = new hr(mutate, null);
                hrVar.f26883w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                hrVar.h = dp;
                hrVar.f26880n = dp2;
                b6Var.f710b.i(hrVar);
            } else {
                b6Var.f710b.i(null);
            }
            if (user != null) {
                b6Var.f710b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), b6Var.f710b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            b6Var.f710b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
        a6 a6Var = b6Var.f710b;
        a6 a6Var2 = b6Var.f710b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        a6Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            hr hrVar2 = new hr(mutate2, null);
            hrVar2.f26883w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            hrVar2.h = dp3;
            hrVar2.f26880n = dp4;
            a6Var2.i(hrVar2);
            return;
        }
        a6Var2.i(null);
    }

    public final void X0(float f7, float f10, m6 m6Var) {
        this.f983m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != m6Var) {
            this.l1 = m6Var;
            if (m6Var != null) {
                ImageReceiver imageReceiver = m6Var.f1394a;
                if (imageReceiver.getBitmap() != null) {
                    this.f961e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        d6 d6Var = this.O1;
        if (d6Var.f820a != null) {
            kc kcVar = this.J0;
            if (kcVar.f1265f != null) {
                String e7 = d6Var.e();
                if (z10) {
                    y3 y3Var = new y3(2, this.B0);
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
                    k4 k4Var = new k4(this, kcVar.f1265f.getContext(), e7, e7, z11, y3Var);
                    this.Z2 = k4Var;
                    k4Var.f30644i0 = true;
                    TL_stories.StoryItem storyItem = d6Var.f820a;
                    storyItem.dialogId = this.B1;
                    k4Var.F0 = storyItem;
                    k4Var.f30656s0 = new xa.c(this, 2);
                    ((bc) this.Q1).h(k4Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e7);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        b5 b5Var = this.f953c1;
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        am.q(R.string.UnsupportedAttachment, new zc(b5Var, c6Var), c6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
        a2Var.T = string;
        ((bc) this.Q1).h(a2Var);
    }

    public final void b1(boolean z10) {
        if (this.f1003s3 != z10) {
            d6 d6Var = this.O1;
            if (d6Var.f820a != null) {
                this.f1003s3 = z10;
                if (z10) {
                    this.f1000r3.setVisibility(0);
                }
                this.f1000r3.setStoryItem(d6Var.f820a);
                kc kcVar = ((bc) this.Q1).d;
                kcVar.f1286p1 = z10;
                kcVar.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f1006t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f1000r3.setTransitionProgress(this.f1006t3);
                    ofFloat.addUpdateListener(new e3(this, 1));
                    ofFloat.addListener(new v3(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(js.f27635g);
                    ofFloat.start();
                    return;
                }
                if (this.f1000r3.getReactionsWindow() != null) {
                    this.f1000r3.getReactionsWindow().e();
                }
                this.f1000r3.animate().alpha(0.0f).setDuration(150L).setListener(new w3(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            ci.d4 d4Var = new ci.d4(getContext(), 1);
            d4Var.l(1.0f, -56.0f);
            this.G0 = d4Var;
            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f953c1.addView(this.G0, w7.w5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
        }
        ci.d4 d4Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        d4Var2.s(LocaleController.getString(i10));
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
        kc kcVar = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || kcVar.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f1967b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                g9 o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o9 != null && o9.a(this.C2, 1) && this.Q1 != null) {
                    z3 z3Var = new z3(this, 0);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.G1;
                    }
                    ((bc) this.Q1).h(new rg.j0(o9.b(), this.C2, findActivity, z3Var, null));
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
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f19804id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (kcVar != null && (d2Var = kcVar.A0) != null && d2Var.g() == longValue) {
                    f1(false);
                    b4 b4Var = this.f950b2;
                    if (b4Var != null) {
                        b4Var.L(true);
                        this.f950b2.S1(true);
                        r0(true);
                    }
                    s3 s3Var = this.L0;
                    if (s3Var != null) {
                        d2 d2Var2 = s3Var.P;
                        if (d2Var2 != null) {
                            j3 = d2Var2.j();
                        }
                        if (s3Var.H != j3) {
                            s3Var.f1510e.N(true);
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
        if (y5Var == null || !((bc) y5Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((bc) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f1010v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f1014w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = kcVar.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j10 = this.B1;
                if (j10 != 0) {
                    m9 m9Var = this.S1;
                    TL_stories.PeerStories y3 = m9Var.y(j10);
                    if (y3 == null) {
                        y3 = m9Var.z(j10);
                        z11 = true;
                    }
                    m9Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.e1 e1Var = this.f1001s1;
            if (e1Var != null) {
                ViewPropertyAnimator animate = e1Var.animate();
                if (this.S1.K(this.B1) && this.O1.f823e && !SharedConfig.allowPreparingHevcPlayers()) {
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
        ne neVar;
        Canvas canvas2;
        org.telegram.ui.Components.q6 q6Var;
        org.telegram.ui.Components.q6 q6Var2;
        l1();
        if (this.D1 && (q6Var2 = this.Q0) != null) {
            q6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (q6Var = this.R0) != null) {
            q6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f1009u3;
        LinearLayout linearLayout = this.O0;
        n4 n4Var = this.D0;
        if (z10) {
            float measuredWidth = (n4Var.getMeasuredWidth() / 2.0f) + n4Var.getX() + linearLayout.getX();
            float measuredHeight = (n4Var.getMeasuredHeight() / 2.0f) + n4Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f1016w3, measuredWidth - f7, js.f27635g.getInterpolation(this.f1012v3));
            float lerp2 = AndroidUtilities.lerp(this.f1020x3, measuredHeight - f7, this.f1012v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f1012v3);
            if (this.f994p3) {
                org.telegram.ui.Components.s5 s5Var = this.f991o3;
                if (s5Var != null) {
                    float f10 = lerp3;
                    s5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f991o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f988n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f997q3) {
            float measuredWidth2 = (n4Var.getMeasuredWidth() / 2.0f) + n4Var.getX() + linearLayout.getX();
            float measuredHeight2 = (n4Var.getMeasuredHeight() / 2.0f) + n4Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f994p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f982l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f997q3 = false;
                }
            } else {
                zg.d dVar = this.f985m3;
                if (dVar != null) {
                    float f16 = dp2 / 2.0f;
                    dVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f985m3.b(canvas);
                    if (this.f985m3.c()) {
                        this.f985m3.d(this);
                        this.f985m3 = null;
                        this.f997q3 = false;
                    }
                } else {
                    this.f997q3 = false;
                }
            }
        }
        b4 b4Var = this.f950b2;
        if (b4Var != null) {
            pe peVar = b4Var.f23767y1;
            ne neVar2 = b4Var.f23772z1;
            if (b4Var.getAlpha() != 0.0f && (neVar = b4Var.f23645e1) != null && neVar.getParent() != null && b4Var.f23645e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(b4Var.f23645e1.getX() + peVar.getX() + neVar2.getX() + b4Var.getX(), b4Var.f23645e1.getY() + peVar.getY() + neVar2.getY() + b4Var.getY());
                if (b4Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, b4Var.getMeasuredWidth(), b4Var.getMeasuredHeight(), (int) (b4Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                b4Var.f23645e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nl0 nl0Var;
        nl0 nl0Var2;
        fh.d dVar;
        float dp;
        float f7;
        if (view == this.f959d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f959d3.getY(), getMeasuredWidth(), this.f959d3.getY() + this.f959d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        b4 b4Var = this.f950b2;
        Paint paint = this.f987n2;
        n4 n4Var = this.D0;
        c6 c6Var = this.f1018x1;
        if (view == b4Var) {
            float f10 = this.f996q2;
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            d6 d6Var = this.O1;
            if (i10 > 0 && !d6Var.f824f) {
                c6Var.f766l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), c6Var.f766l);
            }
            RectF rectF = c6Var.h;
            RectF rectF2 = c6Var.f763i;
            RectF rectF3 = c6Var.f764j;
            rectF.set(this.f950b2.getX(), this.f950b2.getY() + this.f950b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f950b2.getX() + this.f950b2.getMeasuredWidth(), this.f950b2.getY() + this.f950b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!d6Var.f824f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (n4Var != null && n4Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + n4Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                s2 s2Var = this.a2;
                if (s2Var != null && s2Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f950b2.getY() + this.f950b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f950b2.getY() + this.f950b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f950b2.setTranslationX((1.0f - this.f996q2) * dp);
            if (this.f950b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f996q2) * (this.f950b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f950b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.y(1.0f, this.f996q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, c6Var.h, this.f996q2, rectF3);
            ch.d dVar2 = this.f981l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.q(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f960d4) * (1.0f - this.f999r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f996q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (b4Var != null && b4Var.v0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = c6Var.f765k;
            RectF rectF5 = c6Var.f765k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f948a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            ch.d dVar3 = this.f984m2;
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
            if (view == this.f965f2 && this.f950b2 != null) {
                view.setTranslationY(((this.f950b2.getY() + this.f950b2.getAnimatedTop()) + (-nl0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f1000r3) {
                    view.setTranslationY((this.O0.getY() + (n4Var.getY() + (-(nl0Var2.getMeasuredHeight() - this.f1000r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    b5 b5Var = this.f953c1;
                    if (view == b5Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f9937n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(b5Var.getX(), b5Var.getY());
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
            k4 k4Var = this.Z2;
            if (k4Var != null) {
                k4Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new d3(this, 8), 120L);
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
        return this.f1025z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        b5 b5Var = this.f953c1;
        Bitmap createBitmap = Bitmap.createBitmap(b5Var.getWidth(), b5Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public m9 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f1010v1.size()) + this.f1014w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f1010v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f971h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f974i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f971h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f974i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f974i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f1025z1;
        kc kcVar = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f1014w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((l9) arrayList2.get(i11)).f1347a;
                    if (((int) (j3 ^ (j3 >>> 32))) == kcVar.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f1025z1.indexOf(Integer.valueOf(kcVar.P0));
            if (indexOf < 0 && !this.f1025z1.isEmpty()) {
                if (kcVar.P0 > ((Integer) this.f1025z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (kcVar.P0 < ((Integer) hg.c.h(1, this.f1025z1)).intValue()) {
                    indexOf = this.f1025z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = kcVar.f1264e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !kcVar.N0 && (peerStories = this.f1007u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1010v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f20042id > this.f1007u1.max_read_id) {
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
        e9 e9Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f1010v1;
        arrayList.clear();
        kc kcVar = this.J0;
        if (kcVar.N0) {
            if (!kcVar.S0) {
                arrayList.add(kcVar.T0);
            }
        } else {
            ArrayList arrayList2 = this.f1025z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f1014w1;
            if (arrayList2 != null && (e9Var = kcVar.O0) != null) {
                if (e9Var instanceof v8) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((v8) kcVar.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            l9 l9Var = (l9) E.get(i11);
                            ci.l8 l8Var = l9Var.f1349c;
                            if (l8Var != null && !l8Var.f5408g && TextUtils.equals(l8Var.K0, str)) {
                                arrayList3.add(l9Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f1025z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = kcVar.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (kcVar.O0 != null) {
                while (i10 < kcVar.O0.f897i.size()) {
                    arrayList.add(((MessageObject) kcVar.O0.f897i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = kcVar.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f1007u1 = kcVar.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f1007u1 = y3;
                    if (y3 == null) {
                        this.f1007u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f1007u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f1007u1.stories);
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
        w60 w60Var = this.J2;
        if (w60Var != null) {
            w60Var.f32284f0 = null;
            w60Var.a(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f820a;
        kc kcVar = this.J0;
        kcVar.getClass();
        if (j3 != 0 && storyItem != null) {
            kc.E1.remove(j3 + (j3 >> 16) + (storyItem.f20042id << 16));
        }
        this.f975i3 = true;
        ac acVar = kcVar.f1281n0;
        if (acVar != null && (currentPeerView = acVar.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            org.telegram.ui.Components.sc I = new zc(this.f953c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new d3(this, 2));
            I.f30544r = false;
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
        TL_stories.StoryItem storyItem = d6Var.f820a;
        if (storyItem == null) {
            storyItem = d6Var.f822c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                kc kcVar = this.J0;
                n4 n4Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.q6 q6Var = this.R0;
                    if (q6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        q6Var.t(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.q6 q6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        q6Var2.t(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.g6 g6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        g6Var.d(f10, true);
                        org.telegram.ui.Components.g6 g6Var2 = this.T0;
                        if (g6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            g6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (kcVar.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new gr(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = n4Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + n4Var.getLayoutParams().width;
                    n4 n4Var2 = this.P0;
                    if (n4Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = n4Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += n4Var2.getLayoutParams().width;
                        n4Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    n4Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = d6Var.f820a;
                    w4 w4Var = this.f976j1;
                    if (storyItem2 == null) {
                        w4Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < w4Var.getChildCount(); i14++) {
                        if (w4Var.getChildAt(i14) instanceof qb) {
                            ((qb) w4Var.getChildAt(i14)).c(storyItem2.views, z10);
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
                        gr grVar = new gr(R.drawable.mini_views_likes, 0);
                        grVar.setOverrideColor(-53704);
                        grVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(grVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        gr grVar2 = new gr(R.drawable.mini_repost_story, 0);
                        grVar2.setOverrideColor(-14161823);
                        grVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(grVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + hg.c.g(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (kcVar.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                n4Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        r9 r9Var = this.E0;
        r9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new x3(0, r9Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        r9 r9Var2 = new r9(getContext(), this.f1018x1);
        this.E0 = r9Var2;
        r9Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.w5.e(40, 40, 3));
        this.f997q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10;
        b4 b4Var;
        float heightWithTopView;
        float f14;
        float f15;
        float f16;
        float dp;
        int i10;
        float f17;
        float f18;
        int i11;
        n4 n4Var;
        ImageView imageView;
        h5 h5Var;
        n4 n4Var2;
        boolean z11;
        float f19;
        nl0 nl0Var;
        float f20;
        int i12;
        float f21;
        float f22;
        float f23 = ((bc) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var = this.O2;
        g6Var.d(f7, false);
        int i13 = this.f1005t2;
        if (i13 != 0 && this.f1008u2) {
            f10 = w7.n.a(this.H2 / i13, 0.0f, 1.0f);
        } else if (this.f1011v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.g6 g6Var2 = this.W3;
        float f24 = g6Var2.f26301c;
        org.telegram.ui.Components.g6 g6Var3 = this.X3;
        float f25 = g6Var3.f26301c;
        org.telegram.ui.Components.g6 g6Var4 = this.Y3;
        float f26 = g6Var4.f26301c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        g6Var2.d(f11, false);
        if (!this.f975i3) {
            b4 b4Var2 = this.f950b2;
            if (b4Var2 != null && !TextUtils.isEmpty(b4Var2.getFieldText())) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            g6Var3.d(f22, false);
        }
        b4 b4Var3 = this.f950b2;
        if (b4Var3 != null && b4Var3.f23628b4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        g6Var4.d(f12, false);
        final b4 b4Var4 = this.f950b2;
        if (b4Var4 != null) {
            f6 f6Var = b4Var4.X5;
            f13 = 1.0f;
            int backgroundTop = b4Var4.getBackgroundTop();
            int i14 = b4Var4.U5;
            if (i14 != 0 && backgroundTop != i14) {
                int i15 = (b4Var4.T1 + i14) - backgroundTop;
                b4Var4.setAnimatedTop(i15);
                f6Var.V2 = true;
                ValueAnimator valueAnimator = f6Var.f962e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    f6Var.f962e2.cancel();
                }
                View view = b4Var4.G1;
                if (view != null && view.getVisibility() == 0) {
                    b4Var4.G1.setTranslationY(((1.0f - b4Var4.getTopViewEnterProgress()) * b4Var4.G1.getLayoutParams().height) + b4Var4.T1);
                }
                f6Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i15, 0.0f);
                f6Var.f962e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                b4 b4Var5 = b4Var4;
                                b4Var5.getClass();
                                b4Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f6 f6Var2 = b4Var5.X5;
                                f6Var2.V2 = true;
                                f6Var2.invalidate();
                                b4Var5.invalidate();
                                return;
                            default:
                                b4Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                f6Var.f962e2.addListener(new b(b4Var4, 4));
                f6Var.f962e2.setDuration(250L);
                f6Var.f962e2.setInterpolator(ji.n.V);
                f6Var.f962e2.start();
                b4Var4.U5 = 0;
            }
            if (b4Var4.P3) {
                float scrollY = (b4Var4.W5 - b4Var4.E0.getScrollY()) + (b4Var4.V5 - b4Var4.E0.getMeasuredHeight());
                uf ufVar = b4Var4.E0;
                ufVar.setOffsetY(ufVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(b4Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                b4 b4Var5 = b4Var4;
                                b4Var5.getClass();
                                b4Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                f6 f6Var2 = b4Var5.X5;
                                f6Var2.V2 = true;
                                f6Var2.invalidate();
                                b4Var5.invalidate();
                                return;
                            default:
                                b4Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = b4Var4.T5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                b4Var4.T5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ji.n.V);
                ofFloat2.start();
                b4Var4.P3 = false;
                f6Var.l1();
            }
            b4Var4.getMeasuredHeight();
        } else {
            f13 = 1.0f;
        }
        b4 b4Var5 = this.f950b2;
        if (b4Var5 != null && b4Var5.u0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f1019x2;
        Paint paint = this.f987n2;
        if (z12) {
            paint.setColor(i0.a.d(this.f996q2, -14933463, org.telegram.ui.ActionBar.h6.m1(0.44f, -16777216)));
            float f27 = f13;
            paint.setAlpha((int) ((f27 - this.f960d4) * org.telegram.messenger.v0.A(f27, this.f999r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((f13 - this.f960d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        kc kcVar = this.J0;
        if (z13 || this.Z3 != kcVar.f1260d0 || g6Var.f26301c != this.Q2 || this.f1002s2 != this.H2 || f10 != this.f996q2 || f23 != this.f999r2 || f24 != g6Var2.f26301c || z10 || f26 != g6Var4.f26301c || f25 != g6Var3.f26301c) {
            this.V2 = false;
            this.f1002s2 = this.H2;
            int i16 = (g6Var.f26301c > this.Q2 ? 1 : (g6Var.f26301c == this.Q2 ? 0 : -1));
            b5 b5Var = this.f953c1;
            if (i16 != 0) {
                b5Var.invalidate();
            }
            if (f23 != 0.0f) {
                b5Var.setLayerType(2, null);
            } else {
                b5Var.setLayerType(0, null);
            }
            this.Q2 = g6Var.f26301c;
            this.f999r2 = f23;
            this.f996q2 = f10;
            this.Z3 = kcVar.f1260d0;
            float height = this.H2 - (getHeight() - b5Var.getBottom());
            if (this.f950b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = b4Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f990o2 - (getHeight() - b5Var.getBottom());
            b4 b4Var6 = this.f950b2;
            if (b4Var6 == null) {
                f15 = 0.0f;
            } else {
                float heightWithTopView2 = b4Var6.getHeightWithTopView();
                if (this.f1011v2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                f15 = heightWithTopView2 * f14;
            }
            float max2 = Math.max(0.0f, height2 + f15);
            b4 b4Var7 = this.f950b2;
            if (b4Var7 != null) {
                if (this.f958d2 != null) {
                    ImageView suggestButton = b4Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f958d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f958d2.setTranslationY(-((getHeight() - this.f950b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                uu editField = this.f950b2.getEditField();
                hq0 senderSelectView = this.f950b2.getSenderSelectView();
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
            if (this.f1019x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f1019x2 && !this.f1011v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f16) * f10) + max3;
            s3 s3Var = this.L0;
            w0 w0Var = s3Var.f1507c;
            s3Var.K = dp2;
            if (Math.abs(s3Var.L - max4) > 0.1f) {
                s3Var.L = max4;
                f17 = 0.8f;
                i11 = 0;
                f18 = 8.0f;
                w0Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - w0Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!w0Var.canScrollVertically(1)) {
                    s3Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f17 = 0.8f;
                f18 = 8.0f;
                i11 = 0;
            }
            s3Var.setTranslationY(-s3Var.K);
            s3Var.invalidate();
            ci.j4 j4Var = kcVar.D0;
            if (j4Var != null) {
                j4Var.setKeyboardOffset(max);
            }
            nl0 nl0Var2 = this.f965f2;
            d6 d6Var = this.O1;
            if (nl0Var2 != null) {
                if (this.f996q2 > 0.0f && (d6Var == null || !d6Var.f824f)) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                nl0Var2.setVisibility(i12);
            }
            int i17 = i11;
            while (true) {
                int childCount = getChildCount();
                n4Var = this.P0;
                imageView = this.N0;
                h5Var = this.K0;
                n4Var2 = this.D0;
                if (i17 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != h5Var.W.n(getContext())) {
                    b4 b4Var8 = this.f950b2;
                    if (b4Var8 != null && childAt == b4Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f950b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof c50) {
                        c50 c50Var = (c50) childAt;
                        View view2 = c50Var.f24817e;
                        if (view2 != null) {
                            c50Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != b5Var && childAt != imageView && childAt != this.O0 && childAt != n4Var && childAt != this.W2 && childAt != this.f958d2 && childAt != n4Var2 && ((nl0Var = this.f1000r3) == null || nl0Var.getReactionsWindow() == null || childAt != this.f1000r3.getReactionsWindow().f54683c)) {
                        float f28 = this.f996q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f18) * f29)) - (AndroidUtilities.dp(20.0f) * kcVar.f1260d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f1019x2) {
                            f20 = (1.0f - this.f999r2) * hideInterfaceAlpha;
                        } else {
                            f20 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f951b3) {
                            dp3 = kcVar.f1260d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f959d3) {
                            dp3 -= this.f950b2.getMeasuredHeight() - this.f950b2.getAnimatedTop();
                            f20 = this.f996q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f954c2) {
                            dp3 -= this.f950b2.getMeasuredHeight() - this.f950b2.getAnimatedTop();
                            f20 *= this.f996q2;
                        }
                        if (childAt == this.f965f2) {
                            float f30 = (1.0f - g6Var3.f26301c) * (1.0f - f26) * (1.0f - g6Var2.f26301c) * this.f996q2;
                            float f31 = f20 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f965f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            b4 b4Var9 = this.f950b2;
                            if (b4Var9 == null || childAt != b4Var9.O1) {
                                childAt.setAlpha(f20);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f1019x2) {
                        childAt.setAlpha((1.0f - this.f960d4) * (1.0f - this.f999r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f960d4) * hideInterfaceAlpha);
                    }
                    i17++;
                }
                i17++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f23) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f960d4) * f34);
            n4Var2.setAlpha((1.0f - this.f960d4) * f34);
            if (n4Var != null) {
                n4Var.setAlpha((1.0f - this.f960d4) * f34);
            }
            for (int i18 = 0; i18 < b5Var.getChildCount(); i18++) {
                View childAt2 = b5Var.getChildAt(i18);
                if (childAt2 != null && childAt2 != this.M0) {
                    b6 b6Var = this.f989o1;
                    x5 x5Var = this.f1021y0;
                    if (childAt2 != b6Var && childAt2 != this.f1013w0 && childAt2 != this.f1017x0 && childAt2 != x5Var && childAt2 != this.W1 && childAt2 != h5Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == x5Var) {
                            f19 = this.f963e3;
                        } else {
                            f19 = 1.0f;
                        }
                        if (childAt2 == h5Var) {
                            childAt2.setAlpha((1.0f - this.f960d4) * f19 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f960d4) * f19 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f950b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!d6Var.f824f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (n4Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + n4Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    s2 s2Var = this.a2;
                    if (s2Var != null && s2Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                b4 b4Var10 = this.f950b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f996q2;
                if ((this.S2 || this.E1) && !d6Var.f824f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var10.j1(f35, f36, f37, z11);
                if (this.f950b2.getEmojiView() != null) {
                    this.f950b2.getEmojiView().setAlpha(this.f996q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f956c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f960d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f956c4 = ofFloat;
        ofFloat.addUpdateListener(new e3(this, 2));
        this.f956c4.addListener(new v3(this, z10, 1));
        this.f956c4.setDuration(420L);
        this.f956c4.setInterpolator(js.h);
        this.f956c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f980k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 0, this.B0);
            a2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            a2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            a1.c cVar = new a1.c(runnable, 5);
            a2Var.f20169l0 = string;
            a2Var.m0 = cVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            w1 w1Var = new w1(5);
            a2Var.f20171n0 = string2;
            a2Var.f20172o0 = w1Var;
            a2Var.show();
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
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        b6 b6Var = this.f989o1;
        org.telegram.ui.Components.j9 j9Var = this.f986n1;
        if (i13 >= 0) {
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
            j9Var.m(this.C2, user);
            b6Var.f709a.getImageReceiver().setForUserOrChat(user, j9Var);
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
            j9Var.k(this.C2, chat);
            b6Var.f709a.getImageReceiver().setForUserOrChat(chat, j9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            m9 m9Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = m9Var.f1414m;
            tc tcVar = (tc) iVar.f(j10);
            if (tcVar == null) {
                tcVar = new tc(m9Var.f1404a, j10, m9Var);
                iVar.k(tcVar, j10);
            }
            tcVar.b(true);
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
        b5 b5Var = this.f953c1;
        kc kcVar = this.J0;
        int i14 = 8;
        d6 d6Var = this.O1;
        if (z16) {
            B0();
            if (this.f950b2 == null && (this.E1 || d6Var.f824f)) {
                v0();
            }
            if (this.f950b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                b4 b4Var = this.f950b2;
                if (d6Var.f824f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i14 = 0;
                }
                b4Var.setVisibility(i14);
                b4 b4Var2 = this.f950b2;
                boolean z17 = d6Var.f824f;
                D0(true);
                b4Var2.k1(z17);
                b4 b4Var3 = this.f950b2;
                if (d6Var.f824f && !D0(true) && (this.f1011v2 || this.f950b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b4Var3.q1(z13, true);
                uu editField = this.f950b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = d6Var.f820a;
                kcVar.getClass();
                editField.setText(kc.u(j11, storyItem));
                this.f950b2.d1(this.C2, this.B1);
                this.f950b2.N1(chat2, null);
            }
            org.telegram.ui.Components.q6 q6Var = this.Q0;
            org.telegram.ui.ActionBar.c6 c6Var = this.B0;
            if (q6Var == null) {
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(false, false, false);
                this.Q0 = q6Var2;
                n4 n4Var = this.D0;
                q6Var2.setCallback(n4Var);
                this.Q0.u(c6Var.x0(org.telegram.ui.ActionBar.h6.G6));
                this.Q0.w(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.g6(n4Var);
            }
            n4 n4Var2 = this.P0;
            if (n4Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(false, false, false);
                this.R0 = q6Var3;
                q6Var3.setCallback(n4Var2);
                this.R0.u(c6Var.x0(org.telegram.ui.ActionBar.h6.G6));
                this.R0.w(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.g6(n4Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            b5Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (d6Var.f824f) {
                this.W1.setVisibility(8);
                if (this.f950b2 == null) {
                    v0();
                }
                this.f950b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                b4 b4Var4 = this.f950b2;
                if (b4Var4 != null) {
                    b4Var4.setVisibility(8);
                }
            }
            b4 b4Var5 = this.f950b2;
            if (b4Var5 != null) {
                boolean z18 = d6Var.f824f;
                D0(true);
                b4Var5.k1(z18);
                b4 b4Var6 = this.f950b2;
                if (d6Var.f824f && !D0(true) && (this.f1011v2 || this.f950b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var6.q1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f1025z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(kcVar.P0));
                    if (indexOf < 0 && !this.f1025z1.isEmpty()) {
                        if (kcVar.P0 > ((Integer) this.f1025z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (kcVar.P0 < ((Integer) hg.c.h(1, this.f1025z1)).intValue()) {
                            indexOf = this.f1025z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f1014w1.isEmpty();
                    ArrayList arrayList2 = this.f1010v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i15)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i15)).f20042id > this.S1.f1408f.get(this.B1)) {
                                this.J1 = i15;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            b5Var.invalidate();
            invalidate();
        } else {
            if (this.f950b2 == null) {
                v0();
            }
            if (this.F1 && this.f968g2 == null) {
                z0();
            }
            if (this.f968g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f968g2;
                if ((this.F1 && !d6Var.f824f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            hb hbVar = this.f977j2;
            if (hbVar != null) {
                hbVar.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            b4 b4Var7 = this.f950b2;
            if (b4Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                b4Var7.setVisibility(i11);
                b4 b4Var8 = this.f950b2;
                boolean z19 = d6Var.f824f;
                D0(true);
                b4Var8.k1(z19);
                b4 b4Var9 = this.f950b2;
                if (d6Var.f824f && !D0(true) && (this.f1011v2 || this.f950b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var9.q1(z11, true);
                uu editField2 = this.f950b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = d6Var.f820a;
                kcVar.getClass();
                editField2.setText(kc.u(j12, storyItem2));
                this.f950b2.d1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f950b2.N1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f1026z2, false);
                }
            }
            this.A1 = getStoriesCount();
            n4 n4Var3 = this.W1;
            if (n4Var3 != null) {
                n4Var3.setVisibility(8);
            }
            b5Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f946a1 = true;
        this.f961e1.onAttachedToWindow();
        this.f967g1.onAttachedToWindow();
        this.f964f1.onAttachedToWindow();
        this.f982l3.onAttachedToWindow();
        this.f988n3.onAttachedToWindow();
        b4 b4Var = this.f950b2;
        if (b4Var != null) {
            b4Var.G0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f970h1;
            if (i10 < arrayList.size()) {
                ((zg.e0) arrayList.get(i10)).b(true);
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
        this.f946a1 = false;
        this.f961e1.onDetachedFromWindow();
        this.f967g1.onDetachedFromWindow();
        this.f964f1.onDetachedFromWindow();
        this.f982l3.onDetachedFromWindow();
        this.f988n3.onDetachedFromWindow();
        b4 b4Var = this.f950b2;
        if (b4Var != null) {
            b4Var.F0();
        }
        org.telegram.ui.Components.s5 s5Var = this.f991o3;
        if (s5Var != null) {
            s5Var.o(this);
            this.f991o3 = null;
        }
        zg.d dVar = this.f985m3;
        if (dVar != null) {
            dVar.d(this);
            this.f985m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f970h1;
            if (i10 < arrayList.size()) {
                ((zg.e0) arrayList.get(i10)).b(false);
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
        this.f1018x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f6.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f996q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        h5 h5Var = this.K0;
        if (h5Var.W.x()) {
            h5Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((bc) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f950b2 != null && this.f966f3 && this.f946a1) {
            d3 d3Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(d3Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f950b2.L(true);
            boolean z11 = this.F1;
            d6 d6Var = this.O1;
            if ((z11 && !d6Var.f824f) || this.G1) {
                this.f980k3 = false;
                this.f950b2.setEnabled(false);
                this.f950b2.l1(" ", z10);
            } else if (this.H1 > 0) {
                this.f980k3 = false;
                this.f950b2.setEnabled(true);
                this.f950b2.l1(yh.p7.R0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!d6Var.f824f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f980k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f950b2.setEnabled(true);
                        if (((int) this.f950b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f950b2.getEditField().getMeasuredWidth()) {
                            b4 b4Var = this.f950b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            b4Var.f23643e = formatString2;
                            b4Var.f23650f = format;
                            b4Var.J1(z10);
                        } else {
                            this.f950b2.l1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(d3Var, 1000L);
                        return;
                    }
                }
                this.f980k3 = false;
                this.f950b2.setEnabled(true);
                if (d6Var.f824f) {
                    long starsPrice = this.f950b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f950b2.l1(yh.p7.W0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f950b2.f23725r5), z10);
                        gr grVar = this.f950b2.f23725r5[0];
                        if (grVar != null) {
                            grVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f950b2.l1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                b4 b4Var2 = this.f950b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                b4Var2.l1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f1003s3) {
            if (this.f1000r3.getReactionsWindow() != null) {
                if (this.f1023y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f1000r3.getReactionsWindow().f54683c);
                    return true;
                }
                this.f1000r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        w4 w4Var = this.f976j1;
        if (w4Var != null) {
            ci.d4 d4Var = w4Var.f1491c;
            if (d4Var != null) {
                d4Var.e(true);
                w4Var.f1491c = null;
            }
            w4Var.f1490b = null;
            w4Var.invalidate();
            w4Var.b(false);
        }
        h5 h5Var = this.K0;
        if (h5Var.W.x()) {
            h5Var.W.f(false);
            return true;
        }
        ci.d4 d4Var2 = this.F0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        ci.d4 d4Var3 = this.G0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        c50 c50Var = this.W2;
        if (c50Var != null) {
            c50Var.b(true);
        }
        w5 w5Var = this.f1004t1;
        if (w5Var != null && w5Var.f29560b) {
            w5Var.a();
            return true;
        }
        b4 b4Var = this.f950b2;
        if (b4Var != null && b4Var.w0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f950b2.f23632c1) {
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new z2(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((bc) this.Q1).h(alertDialog$Builder.f20142a);
            return true;
        }
        nl0 nl0Var = this.f965f2;
        if (nl0Var != null && nl0Var.getReactionsWindow() != null && !this.f965f2.getReactionsWindow().f54695q) {
            this.f965f2.getReactionsWindow().d();
            return true;
        }
        b4 b4Var2 = this.f950b2;
        if (b4Var2 != null && b4Var2.u0()) {
            if (this.f1023y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f950b2.getEmojiView());
                return true;
            }
            this.f950b2.o0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            b4 b4Var3 = this.f950b2;
            if (b4Var3 != null) {
                long j3 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f820a;
                Editable editText = b4Var3.getEditText();
                this.J0.getClass();
                kc.J(j3, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f950b2);
            return true;
        } else if (h5Var.getVisibility() != 0 || h5Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            h5Var.C();
            this.f969g3 = false;
            this.f953c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f978k1.f38565b = i10;
        nl0 nl0Var = this.f965f2;
        if (nl0Var != null) {
            nl0Var.setCurrentAccount(i10);
            this.f965f2.p(null, null, true);
        }
        nl0 nl0Var2 = this.f1000r3;
        if (nl0Var2 != null) {
            nl0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(y5 y5Var) {
        this.Q1 = y5Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f966f3 != z10) {
            this.f966f3 = z10;
            if (z10) {
                this.f961e1.setCurrentAlpha(1.0f);
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
        if (this.f949b1 != z10) {
            this.f949b1 = z10;
            this.f953c1.invalidate();
            if (this.K1 && this.J0.f1251a && Build.VERSION.SDK_INT < 33) {
                r4 r4Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(r4Var);
                    AndroidUtilities.runOnUIThread(r4Var, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(r4Var);
                kc kcVar = ((bc) this.Q1).d;
                kcVar.l1 = true;
                kcVar.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            m4 m4Var = this.f961e1;
            if (z10) {
                m4Var.stopAnimation();
                m4Var.setAllowStartAnimation(false);
            } else {
                m4Var.startAnimation();
                m4Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f953c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            h4 h4Var = new h4(this, getContext(), this.B0);
            this.I2 = h4Var;
            h4Var.f24329c2 = new i4(this);
            h4Var.f24350j0.f0();
            h4 h4Var2 = this.I2;
            h4Var2.W = true;
            h4Var2.t1();
            h4 h4Var3 = this.I2;
            h4Var3.X = new j4(this);
            h4Var3.o1().setText(this.f950b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            c cVar = new c(getContext(), this.I3);
            this.X1 = cVar;
            cVar.setOnClickListener(new f3(this, 1));
            addView(this.X1, w7.w5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 83));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.c6 c6Var = this.B0;
        b4 b4Var = new b4(this, AndroidUtilities.findActivity(getContext()), this, new y3(1, c6Var));
        this.f950b2 = b4Var;
        b4Var.getEditField().useAnimatedTextDrawable();
        this.f950b2.getEditField().setScaleX(0.0f);
        this.f950b2.setOverrideKeyboardAnimation(true);
        this.f950b2.setClipChildren(false);
        this.f950b2.setDelegate(new c4(this));
        setDelegate(this.f950b2);
        b4 b4Var2 = this.f950b2;
        b4Var2.f23629b5 = false;
        b4Var2.f23636c5 = true;
        if (this.O1.f824f) {
            b4Var2.X0(false, false, false);
        } else {
            b4Var2.X0(true, true, false);
        }
        this.f950b2.e();
        b4 b4Var3 = this.f950b2;
        b4Var3.f23642d5 = true;
        addView(b4Var3, w7.w5.a(-2.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 83));
        if (this.O3 != null) {
            this.f950b2.S1(false);
        }
        this.f950b2.G2 = this.f1026z2;
        e6 e6Var = this.M2;
        ((ArrayList) e6Var.f885g).add(this.f953c1);
        ((ArrayList) e6Var.f885g).add(this);
        if (this.f946a1) {
            this.f950b2.G0();
        }
        r0(false);
        if (I0()) {
            this.f950b2.setVisibility(8);
        }
        jh.h hVar = new jh.h(getContext(), c6Var, this.I3, this.F3);
        this.f954c2 = hVar;
        hVar.setOnClickListener(new z2(this, 1));
        addView(this.f954c2, w7.w5.e(57, 300, 85));
        this.f954c2.setVisibility(8);
        this.f950b2.setSideButtonsForAttach(this.f954c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f977j2 != null) {
            return;
        }
        hb hbVar = new hb(getContext(), this.B0);
        this.f977j2 = hbVar;
        hbVar.setOnClickListener(new f3(this, 4));
        this.f977j2.setAlpha(0.0f);
        this.f977j2.setVisibility(8);
        addView(this.f977j2, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 83));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            s2 s2Var = new s2(getContext(), this.I3);
            this.a2 = s2Var;
            s2Var.setOnClickListener(new f3(this, 5));
            s2 s2Var2 = this.a2;
            d2 d2Var = d2.W;
            boolean z11 = true;
            if (d2Var != null && d2Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var2.b(z10, false);
            s2 s2Var3 = this.a2;
            d2 d2Var2 = d2.W;
            if (d2Var2 != null && !d2Var2.m()) {
                z11 = false;
            }
            s2Var3.a(z11, false);
            addView(this.a2, w7.w5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new x2(getContext(), this.C2);
            y2 y2Var = new y2(getContext(), this.Y1, this.I3);
            this.Z1 = y2Var;
            y2Var.setOnClickListener(new f3(this, 6));
            this.Z1.setOnLongClickListener(new c3(this, 1));
            addView(this.Z1, w7.w5.a(42.0f, 7.0f, 0.0f, 7.0f, 3.0f, 46, 85));
            addView(this.Y1, w7.w5.a(200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200, 85));
        }
    }

    public final void z0() {
        int i10;
        if (this.f968g2 != null) {
            return;
        }
        if (this.f950b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f968g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f971h2 = textView;
        textView.setTextColor(-8026747);
        this.f971h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f971h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f974i2 = textView3;
        textView3.setTextColor(-1);
        this.f974i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f974i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f974i2.setGravity(17);
        w7.y5.a(this.f974i2);
        this.f974i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f974i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f968g2.addView(imageView, w7.w5.t(22, 22, 16, 12, 1, 4, 0));
        this.f968g2.addView(this.f971h2, w7.w5.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f968g2.addView(this.f974i2, w7.w5.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f950b2.addView(this.f968g2, w7.w5.a(-1.0f, 14.0f, 0.0f, 8.0f, 0.0f, -1, 119));
    }
}
