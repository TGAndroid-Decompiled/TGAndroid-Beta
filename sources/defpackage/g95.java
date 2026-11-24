package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class g95 extends my0 implements jm7, VoIPService.StateListener, g94 {
    public static g95 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final m75 A1;
    public final ArrayList A2;
    public boolean A3;
    public final View A4;
    public final ImageView B1;
    public final ArrayList B2;
    public final Paint B3;
    public GradientDrawable B4;
    public final ImageView C1;
    public int C2;
    public final Paint C3;
    public final int[] C4;
    public v29 D1;
    public final p09 D2;
    public final f95[] D3;
    public final z65 D4;
    public final n85 E1;
    public final p09 E2;
    public float E3;
    public boolean E4;
    public final io F1;
    public boolean F2;
    public f95 F3;
    public boolean F4;
    public final v65 G1;
    public final fl0 G2;
    public f95 G3;
    public RenderNode G4;
    public final a85 H1;
    public final fl0 H2;
    public long H3;
    public float H4;
    public final b95 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final p85 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final v75 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final q75 L4;
    public final t75 M1;
    public final Matrix M2;
    public int M3;
    public wb5 M4;
    public final lka N1;
    public final Paint N2;
    public float N3;
    public n95 N4;
    public final o85 O1;
    public float O2;
    public int O3;
    public ha5 O4;
    public final lka P1;
    public float P2;
    public boolean P3;
    public l95 P4;
    public final w85 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final vd4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public qd2 T2;
    public final c75 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final i75 U3;
    public k85 U4;
    public final aa5 V1;
    public final String V2;
    public final w75 V3;
    public int V4;
    public final int W1;
    public final c95 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final t65 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final w65 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public wn5 a4;
    public int a5;
    public LaunchActivity b2;
    public final r7 b3;
    public r85 b4;
    public int b5;
    public final UndoView[] c2;
    public final r7 c3;
    public int c4;
    public int c5;
    public final k5 d2;
    public final r7 d3;
    public boolean d4;
    public int d5;
    public boolean e2;
    public final a8 e3;
    public final y65 e4;
    public int e5;
    public ig5 f2;
    public final a8 f3;
    public final r59 f4;
    public int f5;
    public ig5 g2;
    public final a8 g3;
    public final pb5 g4;
    public int g5;
    public int h2;
    public final a8 h3;
    public final m95 h4;
    public int h5;
    public pd i2;
    public final a8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final r86 j3;
    public final ef1 j4;
    public int j5;
    public h85 k2;
    public final t86 k3;
    public boolean k4;
    public int k5;
    public final e75 l1;
    public boolean l2;
    public final q86 l3;
    public final ArrayList l4;
    public final l85 l5;
    public final j65 m1;
    public long m2;
    public final a8 m3;
    public boolean m4;
    public Boolean m5;
    public final j5 n1;
    public boolean n2;
    public final a8 n3;
    public final v55 n4;
    public Integer n5;
    public final p65 o1;
    public boolean o2;
    public final a8 o3;
    public final u65 o4;
    public final fn0 o5;
    public final dkc p1;
    public final RectF p2;
    public final a8 p3;
    public final bn3 p4;
    public final fn0 p5;
    public final dkc q1;
    public boolean q2;
    public final a8 q3;
    public final v55 q4;
    public final h94 q5;
    public final dkc r1;
    public boolean r2;
    public final a8 r3;
    public final LongSparseIntArray r4;
    public final fn0 r5;
    public final dkc s1;
    public float s2;
    public final a8 s3;
    public final g75 s4;
    public final dkc t1;
    public y75 t2;
    public final a8 t3;
    public final d75 t4;
    public final dkc u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final dkc v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final q65 w1;
    public final Paint w2;
    public final g0d w3;
    public final p09 w4;
    public final Paint x1;
    public final ArrayList x2;
    public v55 x3;
    public byte x4;
    public final p75 y1;
    public final ArrayList y2;
    public pd5 y3;
    public boolean y4;
    public final o75 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public g95(final LaunchActivity launchActivity, j5 j5Var, qd2 qd2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((ylb) null, (Context) launchActivity, true, true);
        int i;
        final LaunchActivity launchActivity2;
        final g95 g95Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.x1 = new Paint(1);
        this.c2 = new UndoView[2];
        this.j2 = new ArrayList();
        this.p2 = new RectF();
        this.w2 = new Paint(1);
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.z2 = new ArrayList();
        this.A2 = new ArrayList();
        this.B2 = new ArrayList();
        this.w3 = new g0d(new v55(this, (byte) 4));
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new f95[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new ef1();
        this.l4 = new ArrayList();
        this.n4 = new v55(this, (byte) 0);
        this.o4 = new u65(this);
        this.p4 = new bn3((byte) 11);
        this.q4 = new v55(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new l85(this);
        d53 d53Var = d53.f;
        this.o5 = new fn0(2, this, d53Var, 350L);
        this.p5 = new fn0(3, this, d53Var, 220L, true);
        this.q5 = new h94(4, this, d53Var, 350L);
        this.r5 = new fn0(5, this, d53Var, 350L);
        gm.S(getWindow());
        this.S0 = true;
        this.n1 = j5Var;
        this.T2 = qd2Var;
        this.R2 = inputPeer;
        this.S2 = chat;
        this.V2 = str;
        this.a = j5Var.a;
        this.U2 = z;
        this.J0 = new q63();
        this.Q0 = true;
        this.R0 = true;
        this.W1 = oc7.r1(this.a).l4.B.f();
        this.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        this.z0 = new f75(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.L4 = new q75(this);
        setOnDismissListener(new a65(this, (byte) 0));
        this.q0 = (byte) 75;
        b95 b95Var = new b95(this, launchActivity);
        this.I1 = b95Var;
        di2 di2Var = new di2(true);
        int i2 = cmb.gh;
        di2Var.b(cmb.u0(i2));
        di2Var.d();
        a85 a85Var = new a85(this, launchActivity, di2Var);
        this.H1 = a85Var;
        a85Var.setSubtitle("");
        a85Var.getSubtitleTextView().setVisibility(0);
        a85Var.r();
        a85Var.getAdditionalSubtitleTextView().setPadding(gm.L(24.0f), 0, 0, 0);
        gm.Q3(1.0f, a85Var.getAdditionalSubtitleTextView(), this.m4, false);
        a85Var.getAdditionalSubtitleTextView().setTextColor(cmb.u0(i2));
        int i3 = cmb.bh;
        anb.l(a85Var, 6, i3, null);
        a85Var.setBackButtonImage(2131231244);
        a85Var.setOccupyStatusBar(false);
        a85Var.setAllowOverlayTitle(false);
        int i4 = cmb.Xg;
        anb.l(a85Var, 1, i4, null);
        anb.l(a85Var, 3, cmb.y8, null);
        anb.c(a85Var, i4);
        anb.l(a85Var, 6, i3, null);
        a85Var.setActionBarMenuOnItemClick(new i85(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.u2 = tL_peerUser;
            i = i4;
            tL_peerUser.user_id = j5Var.e().e();
        } else {
            i = i4;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.u2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.u2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new w55(this, (byte) 2);
        j5Var.c().b(this, nm7.w2);
        j5Var.c().b(this, nm7.M0);
        j5Var.c().b(this, nm7.T);
        j5Var.c().b(this, nm7.u1);
        j5Var.c().b(this, nm7.B2);
        j5Var.c().b(this, nm7.E0);
        j5Var.c().b(this, nm7.j0);
        j5Var.c().b(this, 2);
        j5Var.c().b(this, nm7.z2);
        j5Var.c().b(this, nm7.y2);
        j5Var.c().b(this, nm7.U3);
        nm7.e().b(this, nm7.R4);
        nm7.e().b(this, nm7.D2);
        this.Y1 = launchActivity.getResources().getDrawable(2131232745).mutate();
        p09 p09Var = new p09(2131624340, gm.L(46.0f), gm.L(46.0f), true, null);
        this.D2 = p09Var;
        this.E2 = new p09(2131624045, gm.L(46.0f), gm.L(46.0f), true, null);
        n85 n85Var = new n85(this, launchActivity);
        this.E1 = n85Var;
        this.b = n85Var;
        n85Var.setClipToPadding(false);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        this.b.setKeepScreenOn(true);
        this.b.setClipChildren(false);
        this.S1 = new ImageReceiver(this.b);
        if (inputPeer != null) {
            lka lkaVar = new lka(launchActivity);
            this.N1 = lkaVar;
            lkaVar.setGravity(17);
            lkaVar.setTextColor(-1);
            lkaVar.setTypeface(gm.o());
            lkaVar.setTextSize(18);
            lkaVar.k(jb6.L0(2131743119));
            this.b.addView(lkaVar, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            o85 o85Var = new o85(this, launchActivity);
            this.O1 = o85Var;
            o85Var.setGravity(17);
            o85Var.setTextColor(-1);
            o85Var.setTypeface(gm.o());
            o85Var.setTextSize(60);
            this.b.addView(o85Var, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            lka lkaVar2 = new lka(launchActivity);
            this.P1 = lkaVar2;
            lkaVar2.setGravity(17);
            lkaVar2.setTextColor(-1);
            lkaVar2.setTypeface(gm.o());
            lkaVar2.setTextSize(18);
            this.b.addView(lkaVar2, qoe.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        p85 p85Var = new p85(this, launchActivity);
        this.J1 = p85Var;
        p85Var.setClipToPadding(false);
        p85Var.setClipChildren(false);
        w85 w85Var = new w85(this);
        this.Q1 = w85Var;
        w85Var.o = d53Var;
        w85Var.d = (short) 350;
        w85Var.c = (short) 350;
        w85Var.e = (short) 350;
        w85Var.C = false;
        p85Var.setItemAnimator(w85Var);
        p85Var.setOnScrollListener(new q85(this));
        p85Var.setVerticalScrollBarEnabled(false);
        getContext();
        vd4 vd4Var = new vd4(u5 ? 6 : 2, p85Var);
        this.R1 = vd4Var;
        p85Var.setLayoutManager(vd4Var);
        j65 j65Var = new j65(this);
        this.m1 = j65Var;
        vd4Var.O = j65Var;
        p85Var.i(new k65(this));
        vd4Var.W = false;
        this.b.addView(p85Var, qoe.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        p85Var.setAdapter(b95Var);
        p85Var.setTopBottomSelectorRadius(13);
        anb.I(cmb.Ug, p85Var);
        p85Var.setOnItemClickListener(new wu2(this, launchActivity, qd2Var, (byte) 13));
        p85Var.setOnItemLongClickListener(new w55(this, (byte) 3));
        r59 r59Var = new r59(launchActivity);
        this.f4 = r59Var;
        this.b.addView(r59Var, qoe.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        pb5 pb5Var = new pb5(qd2Var, this.a, this);
        this.g4 = pb5Var;
        r59Var.setAdapter(pb5Var);
        q55 q55Var = new q55(6, false);
        r59Var.setLayoutManager(q55Var);
        q55Var.O = new m65(this);
        r59Var.setOnItemClickListener(new f59(this) {
            public final g95 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i6, View view) {
                byte b = r2;
                g95 g95Var2 = this.b;
                switch (b) {
                    case 0:
                        l95 l95Var = (l95) view;
                        if (l95Var.getVideoParticipant() == null) {
                            g95Var2.V0(new rd2(l95Var.getParticipant(), false));
                            return;
                        } else {
                            g95Var2.V0(l95Var.getVideoParticipant());
                            return;
                        }
                    default:
                        n95 n95Var = (n95) view;
                        if (n95Var.getParticipant() != null) {
                            g95Var2.V0(n95Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.o = d53Var;
        sc3Var.d = (short) 350;
        sc3Var.c = (short) 350;
        sc3Var.e = (short) 350;
        r59Var.setItemAnimator(new n65(this));
        r59Var.setOnScrollListener(new o65(this));
        pb5Var.H(r59Var, false, false);
        r59Var.setVisibility(8);
        p65 p65Var = new p65(this, launchActivity);
        this.o1 = p65Var;
        int u0 = cmb.u0(cmb.zh);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, gm.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        fl0 fl0Var = new fl0(9);
        this.G2 = fl0Var;
        fl0 fl0Var2 = new fl0(12);
        this.H2 = fl0Var2;
        fl0Var.a = gm.L(62.0f) * 0.45454547f;
        fl0Var.b = gm.L(72.0f) * 0.45454547f;
        fl0Var.b();
        fl0Var2.a = gm.L(65.0f) * 0.45454547f;
        fl0Var2.b = gm.L(75.0f) * 0.45454547f;
        fl0Var2.b();
        int i6 = cmb.yh;
        fl0Var.d.setColor(on2.p(cmb.u0(i6), 38));
        fl0Var2.d.setColor(on2.p(cmb.u0(i6), 76));
        dkc dkcVar = new dkc(launchActivity, 50.0f);
        this.s1 = dkcVar;
        dkcVar.setCheckable(true);
        dkcVar.setTextSize(12);
        p65Var.a(dkcVar);
        dkcVar.setOnClickListener(new t55(this, (byte) 6));
        dkc dkcVar2 = new dkc(launchActivity, 50.0f);
        this.r1 = dkcVar2;
        dkcVar2.setCheckable(true);
        dkcVar2.setTextSize(12);
        dkcVar2.d(false, false);
        dkcVar2.setCrossOffset(-gm.N(3.5f));
        dkcVar2.c(2131230927, -1, 0, 1.0f, true, jb6.L0(2131743173), false, false);
        dkc dkcVar3 = new dkc(launchActivity, 50.0f);
        this.p1 = dkcVar3;
        dkcVar3.setCheckable(true);
        dkcVar3.setTextSize(12);
        dkcVar3.d(false, false);
        ?? imageView = new ImageView(launchActivity);
        dkcVar3.addView((View) imageView, qoe.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        p09 p09Var2 = new p09(2131623962, gm.L(24.0f), gm.L(24.0f), true, null);
        this.w4 = p09Var2;
        imageView.setAnimation(p09Var2);
        dkcVar3.setOnClickListener(new t55(this, (byte) 7));
        p65Var.a(dkcVar3);
        dkc dkcVar4 = new dkc(launchActivity, 50.0f);
        this.q1 = dkcVar4;
        dkcVar4.setCheckable(true);
        dkcVar4.setTextSize(12);
        dkcVar4.d(false, false);
        ImageView imageView2 = new ImageView(launchActivity);
        this.U1 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.T1 = 2131231174;
        imageView2.setImageResource(2131231174);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView2.setScaleX(1.11f);
        imageView2.setScaleY(1.11f);
        dkcVar4.addView(imageView2, qoe.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        dkcVar4.setOnClickListener(new t55(this, (byte) 10));
        p65Var.a(dkcVar4);
        p65Var.a(dkcVar2);
        dkc dkcVar5 = new dkc(launchActivity, 50.0f);
        this.t1 = dkcVar5;
        dkcVar5.setTextSize(12);
        dkcVar5.c(2131230919, -1, cmb.u0(cmb.th), 0.3f, false, jb6.L0(2131743048), false, false);
        dkcVar5.setOnClickListener(new View.OnClickListener(this) {
            public final g95 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                boolean z2 = true;
                LaunchActivity launchActivity3 = launchActivity;
                g95 g95Var2 = this.b;
                switch (b) {
                    case 0:
                        LaunchActivity launchActivity4 = g95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            g95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                g95Var2.c2[0].d(1, false);
                                if (g95Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z2 = false;
                                    }
                                    y75 y75Var = new y75(g95Var2, launchActivity3, z2);
                                    g95Var2.t2 = y75Var;
                                    y75Var.setBottomPadding(g95Var2.b.getPaddingBottom());
                                    g95Var2.c.addView(g95Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            g95Var2.L1(true, false);
                            g95Var2.K1(false);
                            g95Var2.T2.B();
                            g95Var2.D0(true);
                            g95Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c75 c75Var = g95Var2.T3;
                        o04 o04Var = c75Var.i0;
                        if (c75Var.h0) {
                            gm.r(o04Var);
                        }
                        gm.d3(o04Var, 3000L);
                        c75Var.h0 = true;
                        qd2 qd2Var2 = g95Var2.T2;
                        if (qd2Var2 != null && !qd2Var2.k()) {
                            g95Var2.E1();
                            g95.l1(launchActivity3, new v55(g95Var2, (byte) 6), false, false);
                            return;
                        }
                        g95Var2.dismiss();
                        return;
                }
            }
        });
        dkc dkcVar6 = new dkc(launchActivity, 50.0f);
        this.u1 = dkcVar6;
        dkcVar6.setCheckable(true);
        dkcVar6.b(true, false);
        dkcVar6.setTextSize(12);
        dkcVar6.c(2131231189, -1, 0, 1.0f, true, jb6.L0(2131742978), false, false);
        q65 q65Var = new q65(this, launchActivity);
        this.w1 = q65Var;
        q65Var.setAnimation(p09Var);
        q65Var.setScaleType(ImageView.ScaleType.CENTER);
        dkc dkcVar7 = new dkc(launchActivity, 50.0f);
        this.v1 = dkcVar7;
        dkcVar7.setDrawBackground(false);
        dkcVar7.setTextSize(12);
        dkcVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        dkcVar7.addView(q65Var, qoe.e(50, 50, 49));
        p65Var.a(dkcVar7);
        dkcVar7.setOnClickListener(new s65(this));
        p65Var.a(dkcVar6);
        p65Var.a(dkcVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.X1 = radialProgressView;
        radialProgressView.setSize(gm.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(cmb.u0(cmb.Eh));
        a85Var.setAlpha(0.0f);
        a85Var.getBackButton().setScaleX(0.9f);
        a85Var.getBackButton().setScaleY(0.9f);
        a85Var.getBackButton().setTranslationX(-gm.L(14.0f));
        a85Var.getTitleTextView().setTranslationY(gm.L(23.0f));
        a85Var.getSubtitleTextView().setTranslationY(gm.L(20.0f));
        a85Var.getAdditionalSubtitleTextView().setTranslationY(gm.L(20.0f));
        r7 r7Var = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.b3 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setIcon(2131231248);
        r7Var.setContentDescription(jb6.L0(2131754838));
        r7Var.setSubMenuOpenSide(2);
        r7Var.setDelegate(new w55(this, (byte) 5));
        int i7 = cmb.Yg;
        anb.Q(r7Var, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var.setOnClickListener(new t55(this, (byte) 11));
        r7Var.O(cmb.u0(i), false);
        r7Var.O(cmb.u0(i), true);
        r7 r7Var2 = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.c3 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(2131232435);
        r7Var2.setContentDescription(jb6.L0(2131754807));
        anb.Q(r7Var2, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var2.setOnClickListener(new t55(this, (byte) 12));
        r7 r7Var3 = new r7(launchActivity, (r6) null, cmb.u0(i));
        this.d3 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        r7Var3.setIcon(2131232358);
        r7Var3.setContentDescription(jb6.L0(2131754807));
        anb.Q(r7Var3, cmb.e0(cmb.u0(i7), 6), null, anb.M(i7));
        r7Var3.setOnClickListener(new t55(this, (byte) 0));
        t65 t65Var = new t65(this, launchActivity, launchActivity);
        this.X2 = t65Var;
        ?? view = new View(launchActivity);
        this.G1 = view;
        view.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Z2 = paint2;
        paint2.setColor(-12761513);
        w65 w65Var = new w65(this, getContext());
        this.Y2 = w65Var;
        anb.X(w65Var, i, this.J0);
        w65Var.setTextSize(1, 11.0f);
        w65Var.setText(jb6.L0(2131743158));
        w65Var.setMaxLines(1);
        w65Var.setGravity(17);
        w65Var.setTypeface(gm.o());
        w65Var.setPadding(gm.L(8.0f), gm.L(0.0f), gm.L(8.0f), gm.L(0.0f));
        if (!i1()) {
            w65Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(t65Var, qoe.l(1.0f, 0, -2));
        linearLayout.addView(w65Var, qoe.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView((View) view, qoe.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, qoe.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(a85Var, qoe.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r7Var3, qoe.o(48, 48));
        linearLayout2.addView(r7Var2, qoe.o(48, 48));
        linearLayout2.addView(r7Var, qoe.o(48, 48));
        this.b.addView(linearLayout2, qoe.e(-2, 48, 53));
        View view2 = new View(launchActivity);
        this.Z1 = view2;
        view2.setAlpha(0.0f);
        anb.h(cmb.U5, null, view2);
        this.b.addView(view2, qoe.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            this.c2[i8] = new x65(this, launchActivity);
            this.c2[i8].setAdditionalTranslationY(gm.L(10.0f));
            this.c2[i8].setTranslationZ(gm.L(5.0f));
            this.b.addView(this.c2[i8], qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        k5 k5Var = new k5(launchActivity, true);
        this.d2 = k5Var;
        k5Var.setTag(2131296439, 240);
        this.b3.h(k5Var, gm.L(48.0f));
        this.b3.setShowSubmenuByMove(false);
        int i9 = cmb.Ug;
        anb.Q(k5Var, cmb.Y(cmb.u0(i9), 6, 6), null, anb.M(i9));
        r7 r7Var4 = this.b3;
        a8 d = r7Var4.d(1, 0, null, jb6.L0(2131743085), true, true, r7Var4.n0);
        this.p3 = d;
        d.m(true, false);
        r7 r7Var5 = this.b3;
        a8 d2 = r7Var5.d(2, 0, null, jb6.L0(2131743038), true, true, r7Var5.n0);
        this.q3 = d2;
        d2.m(false, true);
        int i10 = cmb.mh;
        d.setCheckColor(i10);
        d.d(cmb.u0(i10), cmb.u0(i10));
        d2.setCheckColor(i10);
        d2.d(cmb.u0(i10), cmb.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(cmb.u0(cmb.Xg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gm.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        a8 f = this.b3.f(null, jb6.L0(2131743083), 10, true, 2131232436);
        this.g3 = f;
        f.setItemHeight(56);
        a8 f2 = this.b3.f(null, jb6.L0(2131742966), 11, true, 2131232267);
        this.h3 = f2;
        f2.setItemHeight(56);
        r86 r86Var = new r86(q86.a());
        this.j3 = r86Var;
        a8 f3 = this.b3.f(r86Var, jb6.L0(2131744985), 14, false, 0);
        this.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(2131232366);
        f3.setSubtext(jb6.L0(q86.a() ? 2131744983 : 2131744984));
        f3.getRightIcon().setBackground(cmb.e0(cmb.u0(i9), 1));
        int i11 = (jb6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = jb6.a0;
        rightIcon.setLayoutParams(qoe.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view3 = new View(launchActivity);
        view3.setBackgroundColor(on2.f(0.3f, cmb.u0(cmb.Wg), -16777216));
        boolean z3 = jb6.a0;
        FrameLayout.LayoutParams d3 = qoe.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view3.setLayoutParams(d3);
        f3.addView(view3);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view4 = viewArr[i12];
            if (view4 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view4.getLayoutParams();
                layoutParams.leftMargin = jb6.a0 ? gm.L(60.0f) : 0;
                layoutParams.rightMargin = jb6.a0 ? 0 : gm.L(60.0f);
                view4.setLayoutParams(layoutParams);
            }
        }
        this.i3.getRightIcon().setContentDescription(jb6.L0(2131744967));
        this.i3.getRightIcon().setOnClickListener(new t55(this, (byte) 1));
        TextView b = this.b3.b(on2.f(0.3f, cmb.u0(cmb.Wg), -16777216));
        this.v3 = b;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).bottomMargin = 0;
        a8 f4 = this.b3.f(this.W2, jb6.L0(sd2.W(this.S2) ? 2131743169 : 2131743068), 6, true, 2131232122);
        this.f3 = f4;
        a8 f5 = this.b3.f(this.W2, jb6.L0(2131743069), 7, false, 2131232282);
        this.m3 = f5;
        a8 e = this.b3.e(3, 2131232209, jb6.L0(2131743021));
        this.e3 = e;
        c95 c95Var = new c95();
        this.W2 = c95Var;
        a8 e2 = this.b3.e(9, 2131232358, jb6.L0(2131743120));
        this.o3 = e2;
        a8 f6 = this.b3.f(c95Var, jb6.L0(2131743032), 5, true, 0);
        this.n3 = f6;
        c95Var.g = f6.getImageView();
        a8 e3 = this.b3.e(12, 2131231900, jb6.L0(2131743168));
        this.s3 = e3;
        a8 e4 = this.b3.e(13, 2131230781, jb6.L0(2131743170));
        this.t3 = e4;
        a8 e5 = this.b3.e(4, 2131232093, jb6.L0(g1() ? 2131743063 : sd2.W(this.S2) ? 2131743165 : 2131743064));
        this.r3 = e5;
        this.b3.setPopupItemsSelectorColor(cmb.u0(cmb.Ug));
        this.b3.getPopupLayout().setFitItems(true);
        int i13 = cmb.Xg;
        e3.d(cmb.u0(i13), cmb.u0(i13));
        e4.d(cmb.u0(i13), cmb.u0(i13));
        this.g3.d(cmb.u0(i13), cmb.u0(i13));
        this.h3.d(cmb.u0(i13), cmb.u0(i13));
        z1(this.i3, cmb.u0(i13));
        int i14 = cmb.lh;
        e5.d(cmb.u0(i14), cmb.u0(i14));
        e.d(cmb.u0(i13), cmb.u0(i13));
        f4.d(cmb.u0(i13), cmb.u0(i13));
        f5.d(cmb.u0(i13), cmb.u0(i13));
        f6.d(cmb.u0(i13), cmb.u0(i13));
        e2.d(cmb.u0(i13), cmb.u0(i13));
        if (this.T2 != null) {
            d1();
        }
        if (g1()) {
            this.i2 = new pd();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        N1(false);
        this.H1.getTitleTextView().setOnClickListener(new t55(this, (byte) 2));
        y65 y65Var = new y65(this, launchActivity);
        this.e4 = y65Var;
        z65 z65Var = new z65(this);
        this.D4 = z65Var;
        y65Var.setClipToPadding(false);
        z65Var.C = false;
        z65Var.o = d53.f;
        z65Var.d = (short) 350;
        z65Var.c = (short) 350;
        z65Var.e = (short) 350;
        y65Var.setItemAnimator(z65Var);
        y65Var.setOnScrollListener(new a75(this));
        y65Var.setClipChildren(false);
        u46 u46Var = new u46();
        u46Var.i1(0);
        y65Var.setLayoutManager(u46Var);
        m95 m95Var = new m95(qd2Var, this.a, this);
        this.h4 = m95Var;
        y65Var.setAdapter(m95Var);
        m95Var.F(y65Var, false);
        y65Var.setOnItemClickListener(new f59(this) {
            public final g95 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i62, View view5) {
                byte b2 = r2;
                g95 g95Var2 = this.b;
                switch (b2) {
                    case 0:
                        l95 l95Var = (l95) view5;
                        if (l95Var.getVideoParticipant() == null) {
                            g95Var2.V0(new rd2(l95Var.getParticipant(), false));
                            return;
                        } else {
                            g95Var2.V0(l95Var.getVideoParticipant());
                            return;
                        }
                    default:
                        n95 n95Var = (n95) view5;
                        if (n95Var.getParticipant() != null) {
                            g95Var2.V0(n95Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        y65Var.setOnItemLongClickListener(new w55(this, (byte) 0));
        y65Var.setVisibility(8);
        y65Var.i(new Object());
        c75 c75Var = new c75(this, launchActivity, this.J1, y65Var, this.R3, this.T2, this);
        this.T3 = c75Var;
        c75Var.setClipChildren(false);
        m95Var.E(this.R3, c75Var);
        if (this.f4 != null) {
            this.g4.G(this.R3, c75Var);
        }
        d75 d75Var = new d75(this, launchActivity);
        this.t4 = d75Var;
        e75 e75Var = new e75(this, launchActivity, this.H1, this.J1, d75Var);
        this.l1 = e75Var;
        e75Var.setImagesLayerNum(Integer.MAX_VALUE);
        e75Var.setInvalidateWithParent(true);
        d75Var.setProfileGalleryView(e75Var);
        g75 g75Var = new g75(this, launchActivity);
        this.s4 = g75Var;
        g75Var.setVisibility(8);
        e75Var.setVisibility(0);
        e75Var.b(new h75(this));
        i75 i75Var = new i75(this, launchActivity);
        this.U3 = i75Var;
        this.b.addView(c75Var);
        c75Var.addView(y65Var, qoe.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.o1.setWillNotDraw(false);
        View view5 = new View(launchActivity);
        this.z4 = view5;
        int[] iArr = this.C4;
        iArr[0] = this.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.C4);
        this.B4 = gradientDrawable;
        view5.setBackground(gradientDrawable);
        this.b.addView(view5, qoe.e(-1, 60, 83));
        View view6 = new View(launchActivity);
        this.A4 = view6;
        view6.setBackgroundColor(this.C4[0]);
        this.b.addView(view6, qoe.e(-1, 0, 83));
        aa5 aa5Var = new aa5(launchActivity);
        this.V1 = aa5Var;
        aa5Var.setDelegate(new j75(this));
        aa5Var.setClickCellDelegate(new k75(this));
        qd2 qd2Var2 = this.T2;
        if (qd2Var2 != null) {
            aa5Var.E0(this.n1.a, qd2Var2.h(false));
        }
        this.b.addView(aa5Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        t86 t86Var = new t86(launchActivity);
        this.k3 = t86Var;
        t86Var.setOnContentHeightChanged(new v55(this, (byte) 1));
        this.b.addView(t86Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l3 = new q86(new l75(this));
        io ioVar = new io(launchActivity, false, true, true);
        this.F1 = ioVar;
        ioVar.setGravity(17);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(-1);
        ioVar.b(0.4f, 320L, d53.h);
        ioVar.setTypeface(gm.o());
        this.b.addView(this.o1);
        m75 m75Var = new m75(this, launchActivity, this.E1, LaunchActivity.Q(), this.J0);
        this.A1 = m75Var;
        m75Var.K = true;
        m75Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.W1)});
        m75Var.getEditText().setLinkTextColor(-11683585);
        m75Var.setHint(jb6.L0(2131743615));
        m75Var.getEditText().addTextChangedListener(new n75(this));
        m75Var.s();
        o75 o75Var = new o75(this, launchActivity);
        this.z1 = o75Var;
        this.b.addView(o75Var, qoe.c(-1.0f, -1));
        ?? frameLayout = new FrameLayout(launchActivity);
        this.y1 = frameLayout;
        frameLayout.addView(m75Var, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        frameLayout.addView(ioVar, qoe.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        ioVar.setTranslationY(-gm.L(20.0f));
        this.b.addView((View) frameLayout, qoe.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.C1 = imageView3;
        int i15 = cmb.h6;
        anb.R(imageView3, cmb.f0(S(i15), 1, -1), null, anb.M(i15), this.J0);
        int i16 = cmb.e7;
        ylb ylbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView3, i16, ylbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230872);
        imageView3.setOnClickListener(new t55(this, (byte) 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.B1 = imageView4;
        anb.R(imageView4, cmb.f0(S(i15), 1, -1), null, anb.M(i15), this.J0);
        anb.s(imageView4, cmb.u6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231464);
        imageView4.setOnClickListener(new t55(this, (byte) 4));
        frameLayout.addView(imageView3, qoe.e(48, 48, 85));
        frameLayout.addView(imageView4, qoe.e(48, 48, 85));
        this.b.addView(i75Var);
        g75Var.addView(e75Var, qoe.c(-1.0f, -1));
        g75Var.addView(d75Var, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(g75Var, qoe.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        D0(false);
        this.I1.f();
        if (v5) {
            this.g4.I(this.f4, false);
        }
        this.C2 = this.I1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.L1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (sd2.T(this.S2) && (chat2 = this.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, qoe.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            lp7 lp7Var = new lp7(launchActivity);
            lp7Var.setTextColor(-1);
            lp7Var.setSelectorColor(-9598483);
            lp7Var.setTextOffset(gm.L(10.0f));
            lp7Var.setItemCount(5);
            ?? lp7Var2 = new lp7(launchActivity);
            lp7Var2.setItemCount(5);
            lp7Var2.setTextColor(-1);
            lp7Var2.setSelectorColor(-9598483);
            lp7Var2.setTextOffset(-gm.L(10.0f));
            ?? lp7Var3 = new lp7(launchActivity);
            lp7Var3.setItemCount(5);
            lp7Var3.setTextColor(-1);
            lp7Var3.setSelectorColor(-9598483);
            lp7Var3.setTextOffset(-gm.L(34.0f));
            t75 t75Var = new t75(launchActivity);
            this.M1 = t75Var;
            t75Var.setLines(1);
            t75Var.setSingleLine(true);
            t75Var.setEllipsize(TextUtils.TruncateAt.END);
            t75Var.setGravity(17);
            t75Var.setTextColor(-1);
            t75Var.setTypeface(gm.o());
            t75Var.setTextSize(1, 14.0f);
            this.b.addView(t75Var, qoe.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            t75Var.setOnClickListener(new x55(this, lp7Var, lp7Var2, lp7Var3, chat, j5Var, inputPeer2, (byte) 0));
            v75 v75Var = new v75(launchActivity2, lp7Var, lp7Var2, lp7Var3);
            this.K1 = v75Var;
            v75Var.setWeightSum(1.0f);
            v75Var.setOrientation(0);
            this.b.addView(v75Var, qoe.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            v75Var.addView(lp7Var, qoe.l(0.5f, 0, 270));
            lp7Var.setMinValue(0);
            lp7Var.setMaxValue(365);
            lp7Var.setWrapSelectorWheel(false);
            lp7Var.setFormatter(new on0(currentTimeMillis, calendar, i17, (byte) 1));
            lu luVar = new lu(this, lp7Var, (Object) lp7Var2, (Object) lp7Var3, (byte) 12);
            g95Var = this;
            lp7Var.setOnValueChangedListener(luVar);
            lp7Var2.setMinValue(0);
            lp7Var2.setMaxValue(23);
            v75Var.addView((View) lp7Var2, qoe.l(0.2f, 0, 270));
            lp7Var2.setFormatter(new zo4((byte) 10));
            lp7Var2.setOnValueChangedListener(luVar);
            lp7Var3.setMinValue(0);
            lp7Var3.setMaxValue(59);
            lp7Var3.setValue(0);
            lp7Var3.setFormatter(new zo4((byte) 11));
            v75Var.addView((View) lp7Var3, qoe.l(0.3f, 0, 270));
            lp7Var3.setOnValueChangedListener(luVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            lp7Var.setValue(i18 != i19 ? 1 : 0);
            lp7Var3.setValue(i20);
            lp7Var2.setValue(i21);
            ik.g(t75Var, textView, 0L, 604800L, 2, lp7Var, lp7Var2, lp7Var3);
        } else {
            launchActivity2 = launchActivity;
            g95Var = this;
        }
        w75 w75Var = new w75(g95Var, (ViewGroup) g95Var.getWindow().getDecorView(), g95Var.b);
        g95Var.V3 = w75Var;
        w75Var.E = new x75(g95Var);
        e75Var.setPinchToZoomHelper(w75Var);
        g95Var.r1.setOnClickListener(new View.OnClickListener(g95Var) {
            public final g95 b;

            {
                this.b = g95Var;
            }

            @Override
            public final void onClick(View view7) {
                byte b2 = r3;
                boolean z22 = true;
                LaunchActivity launchActivity3 = launchActivity2;
                g95 g95Var2 = this.b;
                switch (b2) {
                    case 0:
                        LaunchActivity launchActivity4 = g95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            g95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                g95Var2.c2[0].d(1, false);
                                if (g95Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z22 = false;
                                    }
                                    y75 y75Var = new y75(g95Var2, launchActivity3, z22);
                                    g95Var2.t2 = y75Var;
                                    y75Var.setBottomPadding(g95Var2.b.getPaddingBottom());
                                    g95Var2.c.addView(g95Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            g95Var2.L1(true, false);
                            g95Var2.K1(false);
                            g95Var2.T2.B();
                            g95Var2.D0(true);
                            g95Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        c75 c75Var2 = g95Var2.T3;
                        o04 o04Var = c75Var2.i0;
                        if (c75Var2.h0) {
                            gm.r(o04Var);
                        }
                        gm.d3(o04Var, 3000L);
                        c75Var2.h0 = true;
                        qd2 qd2Var22 = g95Var2.T2;
                        if (qd2Var22 != null && !qd2Var22.k()) {
                            g95Var2.E1();
                            g95.l1(launchActivity3, new v55(g95Var2, (byte) 6), false, false);
                            return;
                        }
                        g95Var2.dismiss();
                        return;
                }
            }
        });
        g95Var.J1(false);
        g95Var.E1();
        g95Var.K1(false);
        g95Var.L1(false, false);
        g95Var.u1(0.0f);
        g95Var.M1();
        g95Var.b.addView(new FrameLayout(launchActivity2), qoe.e(-1, 200, 87));
        g95Var.u1.setOnClickListener(new t55(g95Var, (byte) 5));
        g95Var.J0();
        rve.a(g95Var.r1);
        rve.a(g95Var.s1);
        rve.a(g95Var.p1);
        rve.a(g95Var.q1);
        rve.a(g95Var.v1);
        rve.a(g95Var.t1);
        rve.a(g95Var.u1);
        ViewGroup viewGroup2 = g95Var.b;
        w55 w55Var = new w55(g95Var, (byte) 1);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(viewGroup2, w55Var);
    }

    public static void S0(LaunchActivity launchActivity, j5 j5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        g95 g95Var;
        TLRPC.GroupCall groupCall;
        qd2 qd2Var;
        if (s5 == null && pp9.Q0 == null) {
            if (inputPeer == null) {
                if (VoIPService.getSharedInstance() != null && (qd2Var = VoIPService.getSharedInstance().groupCall) != null) {
                    TLRPC.GroupCall groupCall2 = qd2Var.b;
                    if (groupCall2 != null && groupCall2.rtmp_stream && !qd2Var.k()) {
                        if (pp9.Q0 == null && launchActivity != null) {
                            pp9 pp9Var = new pp9(launchActivity, j5Var, qd2Var, oc7.r1(j5Var.a).L0(Long.valueOf(qd2Var.c)));
                            pp9.Q0 = pp9Var;
                            pp9Var.show();
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(qd2Var.c));
                    qd2Var.b(true);
                    g95Var = new g95(launchActivity, j5Var, qd2Var, L0, null, z, str);
                    s5 = g95Var;
                    launchActivity2 = launchActivity;
                } else {
                    return;
                }
            } else {
                qd2 f1 = oc7.r1(j5Var.a).f1(chat.id, false, null);
                if (f1 == null || (groupCall = f1.b) == null || !groupCall.rtmp_stream || f1.k()) {
                    launchActivity2 = launchActivity;
                    g95 g95Var2 = new g95(launchActivity2, j5Var, f1, chat, inputPeer, z, str);
                    s5 = g95Var2;
                    g95Var = g95Var2;
                } else {
                    return;
                }
            }
            g95Var.b2 = launchActivity2;
            gm.c3(new bn3((byte) 10));
        }
    }

    public static String W0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return jb6.M0(2131743187, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return jb6.M0(2131743185, null);
            } else {
                return jb6.M0(2131743184, null);
            }
        }
        return jb6.M0(2131743183, null);
    }

    public static String X0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return jb6.a0(null, null, 2131743181, str);
            }
            return jb6.M0(2131743182, null);
        } else if (i == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return jb6.M0(2131743180, null);
            }
            return jb6.M0(2131743179, null);
        } else {
            return jb6.M0(2131743178, null);
        }
    }

    public static String b1() {
        String[] strArr = zx3.i[(int) Math.floor(Math.random() * 8.0d)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static boolean h1(int i) {
        if (i != 2 && i != 4 && i != 5 && i != 6 && i != 7) {
            return false;
        }
        return true;
    }

    public static void l1(Context context, Runnable runnable, boolean z, boolean z2) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            qd2 qd2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z2 && sd2.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                he heVar = alertDialog$Builder.a;
                if (isConference) {
                    heVar.S = jb6.M0(2131743152, null);
                    heVar.U = jb6.M0(2131743153, null);
                } else if (sd2.W(chat)) {
                    heVar.S = jb6.M0(2131743155, null);
                    heVar.U = jb6.M0(2131743156, null);
                } else {
                    heVar.S = jb6.M0(2131743045, null);
                    heVar.U = jb6.M0(2131743046, null);
                }
                sharedInstance.getAccount();
                oh2[] oh2VarArr = new oh2[1];
                LinearLayout i = hg9.i(context, 1);
                if (!sharedInstance.isConference() || (qd2Var != null && (groupCall = qd2Var.b) != null && groupCall.creator)) {
                    oh2 oh2Var = new oh2(context, 1);
                    oh2VarArr[0] = oh2Var;
                    oh2Var.setBackground(cmb.L0(false));
                    if (z) {
                        oh2VarArr[0].setTextColor(cmb.w0(null, cmb.i5, false));
                    } else {
                        oh2VarArr[0].setTextColor(cmb.w0(null, cmb.Xg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) oh2VarArr[0].getCheckBoxView();
                        int i2 = cmb.hh;
                        int i3 = cmb.fh;
                        int i4 = cmb.dh;
                        checkBoxSquare.s = i2;
                        checkBoxSquare.w = i3;
                        checkBoxSquare.x = i4;
                        checkBoxSquare.invalidate();
                    }
                    oh2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        oh2VarArr[0].e(jb6.M0(2131743154, null), "", false, false, false);
                    } else if (sd2.W(chat)) {
                        oh2VarArr[0].e(jb6.M0(2131743157, null), "", false, false, false);
                    } else {
                        oh2VarArr[0].e(jb6.M0(2131743047, null), "", false, false, false);
                    }
                    oh2 oh2Var2 = oh2VarArr[0];
                    if (jb6.a0) {
                        L = gm.L(16.0f);
                    } else {
                        L = gm.L(8.0f);
                    }
                    if (jb6.a0) {
                        L2 = gm.L(8.0f);
                    } else {
                        L2 = gm.L(16.0f);
                    }
                    oh2Var2.setPadding(L, 0, L2, 0);
                    i.addView(oh2VarArr[0], qoe.o(-1, -2));
                    oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, (byte) 2));
                }
                alertDialog$Builder.n(i);
                heVar.J = cmb.fh;
                alertDialog$Builder.j(jb6.M0(2131743048, null), new zn1(qd2Var, oh2VarArr, selfId, runnable, (byte) 4));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                if (z) {
                    heVar.Q0 = false;
                }
                if (z) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        heVar.getWindow().setType(2038);
                    } else {
                        heVar.getWindow().setType(2003);
                    }
                    heVar.getWindow().clearFlags(2);
                }
                if (!z) {
                    heVar.j(cmb.w0(null, cmb.kh, false));
                }
                heVar.show();
                if (!z) {
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.lh, null);
                    }
                    heVar.o(cmb.w0(null, cmb.Xg, false));
                    return;
                }
                return;
            }
            q1(qd2Var, false, selfId, runnable);
        }
    }

    public static void q1(qd2 qd2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (qd2Var != null) {
            ArrayList arrayList = qd2Var.f;
            ArrayList arrayList2 = qd2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(j);
            if (groupCallParticipant != null) {
                qd2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                qd2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (k47.B1(((rd2) arrayList.get(i)).a.peer) == k47.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = qd2Var.b;
                groupCall.participants_count--;
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i2);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        nm7.e().k(nm7.v2, new Object[0]);
    }

    public static void z1(a8 a8Var, int i) {
        if (a8Var != null) {
            a8Var.d(i, i);
            if (a8Var.getRightIcon() != null) {
                a8Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final boolean A1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.A1(android.view.View):boolean");
    }

    public final void B1(View view) {
        if (this.f2 == null) {
            ig5 ig5Var = new ig5(8, null, getContext(), true);
            this.f2 = ig5Var;
            ig5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, qoe.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = sd2.W(this.S2);
            ig5 ig5Var2 = this.f2;
            if (W) {
                ig5Var2.setText(jb6.M0(2131743149, null));
            } else {
                ig5Var2.setText(jb6.M0(2131743031, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-gm.m);
        this.f2.c(view);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C1() {
        qd2 qd2Var = this.T2;
        if (qd2Var != null && qd2Var.b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            qd2 qd2Var2 = this.T2;
            togglegroupcallsettings.call = qd2Var2.h(qd2Var2.a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
            mp3 mp3Var = Utilities.d;
            Objects.requireNonNull(mp3Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new rf2(mp3Var, (byte) 0), new f65(this, (byte) 1));
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 2) {
            O0();
            M0();
            N0();
            float f3 = 1.0f - this.o5.e;
            p65 p65Var = this.o1;
            p65Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            p65Var.invalidate();
        }
        if (i == 3) {
            P0();
            O0();
            Q0();
            L0();
            this.b.invalidate();
        }
        if (i == 4) {
            O0();
            this.z1.invalidate();
            this.A1.invalidate();
        }
        if (i == 5) {
            O0();
            this.b.invalidate();
        }
    }

    public final void D0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.D0(boolean):void");
    }

    public final void D1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        qd2 qd2Var = this.T2;
        dkc dkcVar = this.u1;
        dkc dkcVar2 = this.q1;
        dkc dkcVar3 = this.s1;
        dkc dkcVar4 = this.p1;
        dkc dkcVar5 = this.r1;
        dkc dkcVar6 = this.t1;
        dkc dkcVar7 = this.v1;
        boolean z11 = true;
        p65 p65Var = this.o1;
        boolean z12 = false;
        if (qd2Var != null && !qd2Var.k()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !G0()) {
                z5 = true;
            } else {
                z5 = false;
            }
            Boolean bool = this.m5;
            if (bool != null) {
                z6 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.T2.b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if ((!z5 && this.T2.c()) || z4) {
                z8 = true;
                z7 = false;
            } else {
                z7 = true;
                z8 = false;
            }
            if (z4) {
                z10 = true;
                z9 = false;
            } else {
                z9 = !z5;
                z10 = false;
            }
            if (u5) {
                z9 = false;
            } else {
                z12 = z10;
            }
            p65Var.c(dkcVar7, true, z);
            p65Var.c(dkcVar6, true, z);
            p65Var.c(dkcVar5, z8, z);
            p65Var.c(dkcVar4, z12, z);
            p65Var.c(dkcVar3, z7, z);
            p65Var.c(dkcVar2, z9, z);
            p65Var.c(dkcVar, z6, z);
            return;
        }
        if (this.O2 > 0.1f) {
            z2 = true;
        } else {
            z2 = false;
        }
        p65Var.c(dkcVar7, z2, z);
        if (this.O2 > 0.1f) {
            z3 = true;
        } else {
            z3 = false;
        }
        p65Var.c(dkcVar6, z3, z);
        if (this.O2 <= 0.1f) {
            z11 = false;
        }
        p65Var.c(dkcVar3, z11, z);
        p65Var.c(dkcVar5, false, z);
        p65Var.c(dkcVar4, false, z);
        p65Var.c(dkcVar2, false, z);
        p65Var.c(dkcVar, false, z);
    }

    @Override
    public final boolean E() {
        return !this.T3.b;
    }

    public final void E0(n95 n95Var, boolean z) {
        if (!this.J) {
            if (z) {
                if (n95Var.getRenderer() == null) {
                    n95Var.setRenderer(ha5.c(this.R3, this.T3, n95Var, null, null, n95Var.getParticipant(), this.T2, this));
                }
            } else if (n95Var.getRenderer() != null) {
                n95Var.getRenderer().setPrimaryView(null);
                n95Var.setRenderer(null);
            }
        }
    }

    public final void E1() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        TLObject L0;
        qd2 qd2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i5;
        int i6;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        qd2 qd2Var2 = this.T2;
        r7 r7Var = this.b3;
        r7 r7Var2 = this.d3;
        if (qd2Var2 == null || qd2Var2.k()) {
            this.c3.setVisibility(4);
            r7Var2.setVisibility(8);
            if (this.T2 == null) {
                r7Var.setVisibility(8);
                return;
            }
        }
        if (this.e2) {
            return;
        }
        j5 j5Var = this.n1;
        TLRPC.Chat L02 = oc7.r1(j5Var.a).L0(Long.valueOf(Z0()));
        if (L02 != null) {
            this.S2 = L02;
        }
        boolean y = sd2.y(3, this.S2);
        a8 a8Var = this.e3;
        if (!y && (((sd2.T(this.S2) && ((chat2 = this.S2) == null || !chat2.megagroup)) || (!sd2.t0(this.S2) && !sd2.y(3, this.S2))) && (!sd2.T(this.S2) || (chat = this.S2) == null || chat.megagroup || !sd2.t0(chat)))) {
            a8Var.setVisibility(8);
        } else {
            a8Var.setVisibility(0);
        }
        qd2 qd2Var3 = this.T2;
        a8 a8Var2 = this.t3;
        a8 a8Var3 = this.s3;
        if (qd2Var3 != null && (groupCall2 = qd2Var3.b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            a8Var3.setVisibility(i5);
            if (this.T2.b.messages_enabled) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            a8Var2.setVisibility(i6);
        } else {
            a8Var3.setVisibility(8);
            a8Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k47.B1(this.u2));
        qd2 qd2Var4 = this.T2;
        a8 a8Var4 = this.h3;
        if (qd2Var4 != null && !qd2Var4.k() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            a8Var4.setVisibility(0);
        } else {
            a8Var4.setVisibility(8);
        }
        if (gda.E0) {
            i = 2131232267;
        } else {
            i = 2131232266;
        }
        a8Var4.setIcon(i);
        if (gda.E0) {
            i2 = 2131742964;
        } else {
            i2 = 2131742965;
        }
        a8Var4.setSubtext(jb6.M0(i2, null));
        qd2 qd2Var5 = this.T2;
        if (qd2Var5 != null && !qd2Var5.k() && DictationAsr.E()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        a8 a8Var5 = this.i3;
        a8Var5.setVisibility(i3);
        boolean a = q86.a();
        this.j3.a(a, false);
        if (a) {
            i4 = 2131744983;
        } else {
            i4 = 2131744984;
        }
        a8Var5.setSubtext(jb6.M0(i4, null));
        G1();
        boolean G0 = G0();
        a8 a8Var6 = this.r3;
        a8 a8Var7 = this.f3;
        a8 a8Var8 = this.n3;
        a8 a8Var9 = this.o3;
        if (G0) {
            a8Var6.setVisibility(0);
            a8Var7.setVisibility(0);
            if (i1()) {
                a8Var8.setVisibility(0);
                a8Var9.setVisibility(8);
            } else if (this.T2.k()) {
                a8Var8.setVisibility(8);
                a8Var9.setVisibility(8);
            } else {
                a8Var8.setVisibility(0);
            }
            if (g1()) {
                a8Var8.setVisibility(8);
                a8Var7.setVisibility(8);
            }
            if (this.T2.c() && !this.T2.k()) {
                a8Var9.setVisibility(0);
            } else {
                a8Var9.setVisibility(8);
            }
            r7Var2.setVisibility(8);
            boolean z4 = this.T2.w;
            c95 c95Var = this.W2;
            c95Var.f = z4;
            c95Var.d = 1.0f;
            c95Var.invalidateSelf();
            boolean z5 = this.T2.w;
            v55 v55Var = this.x3;
            if (z5) {
                if (v55Var == null) {
                    v55 v55Var2 = new v55(this, (byte) 7);
                    this.x3 = v55Var2;
                    gm.d3(v55Var2, 1000L);
                }
                a8Var8.setText(jb6.M0(2131743007, null));
            } else {
                if (v55Var != null) {
                    gm.r(v55Var);
                    this.x3 = null;
                }
                a8Var8.setText(jb6.M0(2131743032, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                a8Var9.j(jb6.M0(2131743118, null), 2131232359, null);
            } else {
                a8Var9.j(jb6.M0(2131743120, null), 2131232358, null);
            }
            I1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !G0()) {
                z = true;
            } else {
                z = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && ((this.T2.c() || z2) && !this.T2.k())) {
                if (z2) {
                    r7Var2.setVisibility(8);
                    a8Var9.setVisibility(0);
                    a8Var9.j(jb6.M0(2131743118, null), 2131232359, null);
                    a8Var9.setContentDescription(jb6.M0(2131743118, null));
                } else {
                    a8Var9.j(jb6.M0(2131743120, null), 2131232358, null);
                    a8Var9.setContentDescription(jb6.M0(2131743120, null));
                    r7Var2.setVisibility(8);
                    a8Var9.setVisibility(0);
                }
            } else {
                r7Var2.setVisibility(8);
                a8Var9.setVisibility(8);
            }
            a8Var6.setVisibility(8);
            a8Var7.setVisibility(8);
            a8Var8.setVisibility(8);
        }
        boolean G02 = G0();
        a8 a8Var10 = this.m3;
        if (G02 && this.T2.b.can_change_join_muted && !g1()) {
            a8Var10.setVisibility(0);
        } else {
            a8Var10.setVisibility(8);
        }
        if (g1() && ((qd2Var = this.T2) == null || (groupCall = qd2Var.b) == null || !groupCall.creator)) {
            z3 = false;
        } else {
            z3 = true;
        }
        r7Var.Q(4, z3);
        this.g3.setVisibility(0);
        int visibility = a8Var7.getVisibility();
        TextView textView = this.v3;
        if (visibility != 0 && a8Var10.getVisibility() != 0 && a8Var.getVisibility() != 0 && a8Var9.getVisibility() != 0 && a8Var8.getVisibility() != 0 && a8Var6.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        k5 k5Var = this.d2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.U2) && !i1() && this.u2 != null) {
            k5Var.setVisibility(0);
            long B1 = k47.B1(this.u2);
            boolean D = pg3.D(B1);
            int i7 = j5Var.a;
            if (D) {
                L0 = oc7.r1(i7).W1(Long.valueOf(B1));
            } else {
                L0 = oc7.r1(i7).L0(Long.valueOf(-B1));
            }
            k5Var.setObject(L0);
        } else {
            k5Var.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 != null && !sd2.W(chat3) && i1() && a8Var.getVisibility() == 8) {
            r7Var.setVisibility(8);
        } else {
            r7Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != gm.L(96.0f)) {
            layoutParams.rightMargin = gm.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(gm.L(48.0f) << 1);
    }

    public final int F0() {
        p85 p85Var = this.J1;
        int childCount = p85Var.getChildCount();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = p85Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0) {
                i = Math.min(i, childAt.getTop());
            }
        }
        return i;
    }

    public final void F1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.F1():void");
    }

    public final boolean G0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            qd2 qd2Var = this.T2;
            if (qd2Var != null && (groupCall = qd2Var.b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return sd2.w(14, this.S2);
    }

    public final void G1() {
        boolean z;
        long j;
        String str;
        qd2 qd2Var;
        if (this.l3 != null) {
            int i = 0;
            if (q86.a() && (qd2Var = this.T2) != null && !qd2Var.k() && s5 == this) {
                z = true;
            } else {
                z = false;
            }
            q86 q86Var = this.l3;
            if (z) {
                if (!q86Var.d) {
                    final q86 q86Var2 = this.l3;
                    Context context = getContext();
                    int i2 = this.n1.a;
                    TLRPC.Chat chat = this.S2;
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = 0;
                    }
                    if (!q86Var2.d) {
                        q86Var2.d = true;
                        final in3 V = DictationAsr.V(bo3.c(context, j));
                        boolean x = DictationAsr.x();
                        q86Var2.c = x;
                        if (x) {
                            ExecutorService executorService = DictationLid.a;
                            if (DictationAsr.x()) {
                                DictationLid.a(context);
                            }
                        }
                        StringBuilder sb = new StringBuilder("live captions: ");
                        sb.append(V);
                        if (q86Var2.c) {
                            str = ", tinylid";
                        } else {
                            str = "";
                        }
                        ts2.w(sb, str, "Dictation");
                        DictationAsr.i0((gn3) V.b, false, new hn3() {
                            @Override
                            public final void a(boolean z2) {
                                q86 q86Var3 = q86.this;
                                in3 in3Var = V;
                                if (!q86Var3.d) {
                                    return;
                                }
                                if (!z2) {
                                    q86Var3.d = false;
                                    return;
                                }
                                NativeInstance.setIncomingAudioCapture(true);
                                Thread thread = new Thread(new k16(q86Var3, in3Var, (byte) 8), "LiveCaptions");
                                q86Var3.e = thread;
                                thread.start();
                            }
                        });
                    }
                }
            } else if (q86Var.d) {
                q86 q86Var3 = this.l3;
                if (q86Var3.d) {
                    q86Var3.d = false;
                    Thread thread = q86Var3.e;
                    if (thread != null) {
                        thread.interrupt();
                        q86Var3.e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                t86 t86Var = this.k3;
                t86Var.getClass();
                ArrayList arrayList = new ArrayList(t86Var.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    s86 s86Var = (s86) obj;
                    t86Var.a.remove(s86Var);
                    t86Var.removeView(s86Var);
                }
            }
        }
    }

    @Override
    public final void H() {
        LaunchActivity launchActivity;
        qd2 qd2Var;
        qd2 qd2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        c75 c75Var = this.T3;
        if (c75Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((ha5) arrayList2.get(i)).f();
                c75Var.removeView((View) arrayList2.get(i));
                ((ha5) arrayList2.get(i)).e();
                ((ha5) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (c75Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(c75Var);
            }
        }
        q86 q86Var = this.l3;
        if (q86Var.d) {
            q86Var.d = false;
            Thread thread = q86Var.e;
            if (thread != null) {
                thread.interrupt();
                q86Var.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.H();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (s5 == this) {
            s5 = null;
        }
        t5 = false;
        VoIPService.audioLevelsCallback = null;
        oa5.k(getContext());
        qd2 qd2Var3 = this.T2;
        if (qd2Var3 != null) {
            ArrayList arrayList3 = qd2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            qd2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (this.o2 && (launchActivity = this.b2) != null && !launchActivity.isFinishing() && (qd2Var = this.T2) != null) {
            LaunchActivity launchActivity2 = this.b2;
            j5 j5Var = this.n1;
            long j = qd2Var.b.id;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (qd2Var2 = sharedInstance.groupCall) != null && (groupCall = qd2Var2.b) != null && groupCall.id == j) {
                S0(launchActivity2, j5Var, null, null, false, null);
            } else {
                nm7.e().a(new g85(j, launchActivity2, j5Var), nm7.v2);
            }
        }
    }

    public final void H0() {
        if (this.K3) {
            this.K3 = false;
            gm.r(this.q4);
        }
        if (this.L3) {
            this.L3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.v1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void H1(int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.H1(int, boolean):void");
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.I0():void");
    }

    public final void I1() {
        if (this.T2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        qd2 qd2Var = this.T2;
        int i = currentTime - qd2Var.b.record_start_date;
        boolean z = qd2Var.w;
        a8 a8Var = this.n3;
        if (z) {
            a8Var.setSubtext(gm.g0(i, false, false));
        } else {
            a8Var.setSubtext(null);
        }
    }

    public final void J0() {
        this.y1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom());
        this.z1.invalidate();
        P0();
        O0();
        M0();
        N0();
        Q0();
        this.o1.setAlpha(1.0f - this.o5.e);
        K0();
        L0();
    }

    public final void J1(boolean z) {
        float interpolation;
        float f;
        v75 v75Var = this.K1;
        if ((v75Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (v75Var == null) {
                return;
            }
        }
        int i = 4;
        if (!z) {
            u65 u65Var = this.o4;
            gm.r(u65Var);
            u65Var.run();
            qd2 qd2Var = this.T2;
            p85 p85Var = this.J1;
            if (qd2Var != null && !qd2Var.k()) {
                p85Var.setVisibility(0);
            } else {
                p85Var.setVisibility(4);
            }
            boolean W = sd2.W(this.S2);
            a8 a8Var = this.r3;
            if (W) {
                a8Var.setText(jb6.M0(2131743172, null));
            } else {
                a8Var.setText(jb6.M0(2131743079, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (d53.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            d53 d53Var = d53.f;
            this.P2 = d53Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * d53Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        D1(true);
        float f3 = 1.0f - f;
        v75Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        o85 o85Var = this.O1;
        o85Var.setAlpha(f);
        o85Var.setScaleX(interpolation);
        o85Var.setScaleY(interpolation);
        t75 t75Var = this.M1;
        t75Var.setScaleX(f3);
        t75Var.setScaleY(f3);
        t75Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        if (f3 != 0.0f) {
            i = 0;
        }
        if (i != v75Var.getVisibility()) {
            v75Var.setVisibility(i);
            t75Var.setVisibility(i);
        }
    }

    public final void K0() {
        int i;
        float f = this.w3.b.a;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        p75 p75Var = this.y1;
        p75Var.setAlpha(f);
        o75 o75Var = this.z1;
        o75Var.setAlpha(f);
        if (p75Var.getVisibility() != i) {
            p75Var.setVisibility(i);
            o75Var.setVisibility(i);
            if (i == 8) {
                m75 m75Var = this.A1;
                if (m75Var.isFocused()) {
                    m75Var.clearFocus();
                }
            }
        }
    }

    public final void K1(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        dkc dkcVar = this.s1;
        if (dkcVar != null && dkcVar.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            p65 p65Var = this.o1;
            boolean z5 = false;
            if (sharedInstance == null) {
                dkcVar.c(2131232441, -1, 0, 0.3f, true, jb6.M0(2131743121, null), false, z);
                if (!sd2.t0(this.S2) && (!sd2.N(this.S2) || !sd2.w(3, this.S2))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                h95 h95Var = (h95) p65Var.c.get(dkcVar);
                if (h95Var != null) {
                    h95Var.d.a(z4, z);
                    dkcVar.setEnabled(z4);
                }
                dkcVar.b(true, false);
                return;
            }
            h95 h95Var2 = (h95) p65Var.c.get(dkcVar);
            if (h95Var2 != null) {
                h95Var2.d.a(true, z);
                dkcVar.setEnabled(true);
            }
            if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && sharedInstance.isSpeakerphoneOn()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                dkcVar.c(2131230917, -1, 0, 0.1f, true, jb6.M0(2131743187, null), false, z);
            } else if (z3) {
                dkcVar.c(2131230925, -1, 0, 0.3f, true, jb6.M0(2131742923, null), false, z);
            } else if (sharedInstance.isHeadsetPlugged()) {
                dkcVar.c(2131230920, -1, 0, 0.1f, true, jb6.M0(2131743185, null), false, z);
            } else {
                dkcVar.c(2131230925, -1, 0, 0.1f, true, jb6.M0(2131742923, null), false, z);
            }
            dkcVar.b(z3, z);
            Y0();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                i = 2131231092;
            } else {
                i = 2131231174;
            }
            if (this.T1 != i) {
                this.T1 = i;
                gm.L3(this.U1, i);
            }
            dkc dkcVar2 = this.q1;
            if (dkcVar2.getVisibility() == 0) {
                dkcVar2.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
                if (Y0() != 1) {
                    z5 = true;
                }
                dkcVar2.b(z5, z);
            }
        }
    }

    public final void L0() {
        int i;
        v29 v29Var = this.D1;
        if (v29Var != null) {
            float f = this.w3.b.a * this.p5.e;
            v29Var.setAlpha(f);
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            if (this.D1.getVisibility() != i) {
                this.D1.setVisibility(i);
                if (i == 8) {
                    this.D1.k();
                }
            }
            v29 v29Var2 = this.D1;
            if (!v29Var2.O0 && f == 1.0f) {
                v29Var2.O0 = true;
            }
        }
    }

    public final void L1(boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.L1(boolean, boolean):void");
    }

    public final void M0() {
        boolean z = v5;
        p65 p65Var = this.o1;
        if (z) {
            p65Var.setTranslationX(0.0f);
            p65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fn0 fn0Var = this.o5;
        if (z2) {
            p65Var.setTranslationX(fn0Var.e * gm.L(94.0f));
            p65Var.setTranslationY(0.0f);
            return;
        }
        p65Var.setTranslationX(0.0f);
        p65Var.setTranslationY(fn0Var.e * gm.L(94.0f));
    }

    public final void M1() {
        boolean z;
        String str;
        float f;
        float f2;
        TLRPC.Chat L0;
        TLRPC.User user;
        a85 a85Var = this.H1;
        if (a85Var != null && this.T2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i = 0;
            for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
                long j = this.T2.P.j(i2);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
                if (!groupCallParticipant.self) {
                    c75 c75Var = this.T3;
                    c75Var.getClass();
                    if (c75Var.x.get(k47.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                        long B1 = k47.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i < 2) {
                            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            int i4 = this.a;
                            if (i3 > 0) {
                                user = oc7.r1(i4).W1(Long.valueOf(B1));
                                L0 = null;
                            } else {
                                L0 = oc7.r1(i4).L0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || L0 != null) {
                                if (i != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(m9c.k(user, true), new z5c(gm.o()), 0);
                                } else {
                                    spannableStringBuilder.append(L0.title, new z5c(gm.o()), 0);
                                }
                            }
                        }
                        i++;
                        if (i == 2) {
                            break;
                        }
                    }
                }
            }
            if (i > 0) {
                String J0 = jb6.J0(i, "MembersAreSpeakingToast");
                int indexOf = J0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                a85Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z = true;
            } else {
                z = false;
            }
            lka subtitleTextView = a85Var.getSubtitleTextView();
            if (i1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            subtitleTextView.k(jb6.G(this.T2.b.participants_count + ((!this.I1.M && VoIPService.getSharedInstance() != null) ? !VoIPService.getSharedInstance().isJoined() : 0), str, new Object[0]));
            if (z != this.m4) {
                this.m4 = z;
                a85Var.invalidate();
                float f3 = 0.0f;
                a85Var.getSubtitleTextView().setPivotX(0.0f);
                a85Var.getSubtitleTextView().setPivotY(a85Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = a85Var.getSubtitleTextView().animate();
                if (this.m4) {
                    f = 0.98f;
                } else {
                    f = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f);
                if (this.m4) {
                    f2 = 0.9f;
                } else {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
                if (!this.m4) {
                    f3 = 1.0f;
                }
                scaleY.alpha(f3).setDuration(150L);
                gm.R3(a85Var.getAdditionalSubtitleTextView(), this.m4);
            }
        }
    }

    public final void N0() {
        boolean z = v5;
        y65 y65Var = this.e4;
        if (z) {
            y65Var.setTranslationX(0.0f);
            y65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fn0 fn0Var = this.o5;
        if (z2) {
            y65Var.setTranslationX(fn0Var.e * gm.L(94.0f));
            y65Var.setTranslationY(0.0f);
            return;
        }
        y65Var.setTranslationX(0.0f);
        y65Var.setTranslationY(fn0Var.e * gm.L(94.0f));
    }

    public final void N1(boolean z) {
        qd2 qd2Var = this.T2;
        t65 t65Var = this.X2;
        if (qd2Var == null) {
            if (sd2.W(this.S2)) {
                t65Var.b(jb6.M0(2131743146, null), z);
                return;
            } else {
                t65Var.b(jb6.M0(2131743025, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(qd2Var.b.title);
        a85 a85Var = this.H1;
        if (!isEmpty) {
            if (!this.T2.b.title.equals(a85Var.getTitle())) {
                qd2 qd2Var2 = this.T2;
                a85 a85Var2 = this.H1;
                if (z) {
                    a85Var2.N(qd2Var2.b.title, true, 180L, null);
                    a85Var.getTitleTextView().setOnClickListener(new t55(this, (byte) 8));
                } else {
                    a85Var2.setTitle(qd2Var2.b.title);
                }
                t65Var.b(this.T2.b.title, z);
            }
        } else {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(a85Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                a85 a85Var3 = this.H1;
                if (z) {
                    a85Var3.N(chat2.title, true, 180L, null);
                    a85Var.getTitleTextView().setOnClickListener(new t55(this, (byte) 9));
                } else {
                    a85Var3.setTitle(chat2.title);
                }
                if (sd2.W(this.S2)) {
                    if (i1()) {
                        t65Var.b(this.S2.title, z);
                    } else {
                        t65Var.b(jb6.M0(2131743131, null), z);
                    }
                } else {
                    t65Var.b(jb6.M0(2131742990, null), z);
                }
            } else if (this.S2 == null) {
                a85Var.setTitle(jb6.M0(2131751760, null));
                t65Var.b(jb6.M0(2131751760, null), z);
            }
        }
        lka titleTextView = a85Var.getTitleTextView();
        if (this.T2.w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new d95(titleTextView));
                TextView textView = t65Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new d95(textView), (Drawable) null);
                TextView nextTextView = t65Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new d95(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            t65Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            t65Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void O0() {
        float L;
        int i;
        float f = this.q5.f;
        g0d g0dVar = this.w3;
        float f2 = -((g0dVar.d() - this.b.getPaddingBottom()) + f + (gm.L(68.0f) * this.p5.e) + gm.L(10.0f));
        if (v5) {
            L = (1.0f - this.r5.e) * gm.L(-91.0f);
        } else if (u5) {
            L = 0.0f;
        } else {
            L = ((this.o5.e * gm.L(94.0f)) - (gm.L(104.0f) * this.T3.c)) - gm.L(91.0f);
        }
        float R1 = gm.R1(L, f2, g0dVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - gm.L(250.0f));
        t86 t86Var = this.k3;
        if (t86Var != null) {
            i = t86Var.getContentHeight();
            t86Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f3 = i;
        aa5 aa5Var = this.V1;
        aa5Var.setTranslationY(R1 - f3);
        aa5Var.setVisibleHeight((int) Math.max(0.0f, max - f3));
    }

    public final void O1() {
        float f;
        y21 y21Var;
        boolean z;
        if (this.F != null) {
            int L = gm.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                int L2 = (L - this.t0) - gm.L(14.0f);
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / L2);
                f2 -= (int) ((a.getCurrentActionBarHeight() - L2) * f);
            } else {
                f = 0.0f;
            }
            float paddingTop = f2 + this.b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            a85 a85Var = this.H1;
            frameLayout.setTranslationY(gm.R1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + gm.L(10.0f), a85Var.getY() + (-this.F.getTop()) + a85Var.getHeight(), f));
            u31 u31Var = u31.x;
            if (u31Var != null && (y21Var = u31Var.e) != null && y21Var.getParent() != null && y21Var.getParent().getParent() == this.F) {
                if (f > 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                y21Var.setTop(z);
            }
        }
    }

    public final void P0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * gm.L(64.0f)));
        }
    }

    public final void Q0() {
        boolean z;
        float f = this.p5.e;
        float R1 = gm.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(gm.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        boolean z2 = false;
        if (f > 0.9f) {
            z = true;
        } else {
            z = false;
        }
        imageView.setClickable(z);
        float f2 = 1.0f - f;
        float R12 = gm.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(gm.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        if (f2 > 0.9f) {
            z2 = true;
        }
        imageView2.setClickable(z2);
    }

    @Override
    public final ArrayList R() {
        return new ArrayList();
    }

    public final void R0() {
        ha5 ha5Var = this.O4;
        if (ha5Var != null) {
            ha5Var.a.setRoundCorners(gm.L(8.0f));
            ha5 ha5Var2 = this.O4;
            ha5Var2.h = false;
            ha5Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        wb5 wb5Var = this.M4;
        if (wb5Var != null && !this.Q4 && wb5Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        wb5 wb5Var2 = this.M4;
        if (wb5Var2 != null) {
            wb5Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        l95 l95Var = this.P4;
        if (l95Var != null) {
            l95Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    public final void T0(boolean z) {
        if (!this.R4 && this.Y3) {
            if (z) {
                this.R4 = true;
                s1(false, this.M4);
                return;
            }
            R0();
            this.b.removeView(this.X3);
            this.X3 = null;
            this.s4.setVisibility(8);
            this.b.invalidate();
            this.Y3 = false;
            this.R1.X = true;
            this.J1.invalidate();
            this.U3.setVisibility(8);
            if (this.l2) {
                this.l2 = false;
                D0(true);
            }
            I0();
        }
    }

    public final void U0(int[] iArr, int i) {
        if (i1()) {
            int i2 = cmb.Ah;
            iArr[0] = cmb.w0(null, i2, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.Bh, false), cmb.w0(null, cmb.ph, false));
            iArr[2] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = cmb.w0(null, cmb.zh, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.oh, false), cmb.w0(null, cmb.ph, false));
            iArr[2] = cmb.w0(null, cmb.nh, false);
        } else if (i == 1) {
            iArr[0] = cmb.w0(null, cmb.wh, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.rh, false), cmb.w0(null, cmb.sh, false));
            iArr[2] = cmb.w0(null, cmb.qh, false);
        } else if (h1(i)) {
            iArr[0] = cmb.w0(null, cmb.ai, false);
            iArr[1] = cmb.w0(null, cmb.bi, false);
            iArr[2] = cmb.w0(null, cmb.ci, false);
        } else {
            int i3 = cmb.Ah;
            iArr[0] = cmb.w0(null, i3, false);
            iArr[1] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.Ch, false), cmb.w0(null, cmb.Dh, false));
            iArr[2] = gm.R0(this.N3, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, i3, false));
        }
        if (h1(i)) {
            iArr[3] = on2.f(0.5f, cmb.w0(null, cmb.Yh, false), cmb.w0(null, cmb.ai, false));
        } else if (i == 1) {
            iArr[3] = on2.f(0.75f, cmb.w0(null, cmb.rh, false), on2.f(0.5f, cmb.w0(null, cmb.vh, false), cmb.w0(null, cmb.xh, false)));
        } else {
            iArr[3] = on2.f(0.5f, cmb.w0(null, cmb.zh, false), cmb.w0(null, cmb.yh, false));
        }
    }

    public final void V0(rd2 rd2Var) {
        rd2 rd2Var2;
        if (rd2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            c75 c75Var = this.T3;
            if (c75Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            p85 p85Var = this.J1;
            int i = 0;
            if (z) {
                if (onPreDrawListener != null) {
                    p85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                ArrayList arrayList = new ArrayList();
                pb5 pb5Var = this.g4;
                ArrayList arrayList2 = this.R3;
                ArrayList arrayList3 = this.S3;
                if (rd2Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        ha5 ha5Var = (ha5) arrayList3.get(i2);
                        n95 n95Var = ha5Var.c;
                        if (n95Var != null) {
                            n95Var.setRenderer(null);
                            l95 l95Var = ha5Var.d;
                            if (l95Var != null) {
                                l95Var.setRenderer(null);
                            }
                            n95 n95Var2 = ha5Var.e;
                            if (n95Var2 != null) {
                                n95Var2.setRenderer(null);
                            }
                            arrayList.add(ha5Var.x);
                            ha5Var.b(false);
                            ha5Var.animate().alpha(0.0f).setListener(new z75(this, ha5Var, (byte) 0));
                        }
                    }
                    this.F4 = false;
                    pb5Var.H(this.f4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ha5 ha5Var2 = (ha5) arrayList3.get(i3);
                        if (ha5Var2.e != null && ((rd2Var2 = ha5Var2.x) == null || !rd2Var2.equals(rd2Var))) {
                            arrayList.add(ha5Var2.x);
                            ha5Var2.b(false);
                            l95 l95Var2 = ha5Var2.d;
                            if (l95Var2 != null) {
                                l95Var2.setRenderer(null);
                            }
                            n95 n95Var3 = ha5Var2.c;
                            if (n95Var3 != null) {
                                n95Var3.setRenderer(null);
                            }
                            ha5Var2.animate().alpha(0.0f).setListener(new z75(this, ha5Var2, (byte) 1));
                        }
                    }
                    this.F4 = true;
                    pb5Var.r = false;
                    if (!arrayList.isEmpty()) {
                        gm.c3(new ve4(this, arrayList, (byte) 24));
                    }
                }
                ViewTreeObserver viewTreeObserver = p85Var.getViewTreeObserver();
                fq1 fq1Var = new fq1(this, rd2Var, !c75Var.b);
                this.i4 = fq1Var;
                viewTreeObserver.addOnPreDrawListener(fq1Var);
                return;
            }
            if (onPreDrawListener != null) {
                p85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            if (rd2Var != null) {
                y65 y65Var = this.e4;
                if (y65Var.getVisibility() != 0) {
                    y65Var.setVisibility(0);
                    m95 m95Var = this.h4;
                    m95Var.G(y65Var, false);
                    this.l2 = true;
                    if (!c75Var.b) {
                        ArrayList arrayList4 = m95Var.e;
                        u46 u46Var = (u46) y65Var.getLayoutManager();
                        if (u46Var != null) {
                            while (true) {
                                if (i >= arrayList4.size()) {
                                    break;
                                } else if (((rd2) arrayList4.get(i)).equals(rd2Var)) {
                                    u46Var.g1(i, gm.L(13.0f));
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = p85Var.getViewTreeObserver();
                    xj3 xj3Var = new xj3(this, rd2Var, (byte) 1);
                    this.i4 = xj3Var;
                    viewTreeObserver2.addOnPreDrawListener(xj3Var);
                    return;
                }
                c75Var.h(rd2Var);
                gm.V3(y65Var);
            } else if (p85Var.getVisibility() != 0) {
                p85Var.setVisibility(0);
                D0(false);
                this.l2 = true;
                ViewTreeObserver viewTreeObserver3 = p85Var.getViewTreeObserver();
                e85 e85Var = new e85(this, (byte) 0);
                this.i4 = e85Var;
                viewTreeObserver3.addOnPreDrawListener(e85Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = p85Var.getViewTreeObserver();
                e85 e85Var2 = new e85(this, (byte) 1);
                this.i4 = e85Var2;
                viewTreeObserver4.addOnPreDrawListener(e85Var2);
            }
        }
    }

    public final int Y0() {
        Integer num = this.n5;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute == 0) {
            return 1;
        }
        if (currentAudioRoute == 1) {
            return 0;
        }
        return 2;
    }

    public final long Z0() {
        TLRPC.Chat chat = this.S2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void a1(boolean z) {
        boolean z2;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(Z0()));
        if (L0 != null && !sd2.t0(L0)) {
            TLRPC.ChatFull M0 = oc7.r1(i2).M0(Z0());
            String K = sd2.K(this.S2, false);
            if (!TextUtils.isEmpty(K)) {
                str = kt6.p(oc7.r1(i2).N2, "/", K, new StringBuilder());
            } else if (M0 != null && (tL_chatInviteExported = M0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = oc7.k1(this.S2);
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new vj1(this, M0, z, (byte) 4));
                return;
            }
            o1(null, str, true, z);
        } else if (this.T2 != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                qd2 qd2Var = this.T2;
                exportgroupcallinvite.call = qd2Var.h(qd2Var.a);
                if (i3 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                exportgroupcallinvite.can_self_unmute = z2;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new b65(this, i3, z, (byte) 0));
            }
        }
    }

    public final UndoView c1() {
        if (!v5) {
            c75 c75Var = this.T3;
            if (c75Var.b) {
                return c75Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.c2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.b.removeView(undoViewArr[0]);
            this.b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void d1() {
        VoIPService sharedInstance;
        int i;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.n2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.n2 = true;
            this.x2.addAll(this.T2.g);
            this.y2.addAll(this.j2);
            this.z2.addAll(this.T2.j);
            this.A2.addAll(this.T2.m);
            this.B2.addAll(this.T2.l);
            this.M3 = sharedInstance.getCallState();
            qd2 qd2Var = this.T2;
            if (qd2Var == null) {
                qd2 qd2Var2 = sharedInstance.groupCall;
                this.T2 = qd2Var2;
                this.h4.c = qd2Var2;
                this.T3.setGroupCall(qd2Var2);
                qd2Var = this.T2;
                this.g4.c = qd2Var;
            }
            aa5 aa5Var = this.V1;
            if (aa5Var != null) {
                aa5Var.E0(this.n1.a, qd2Var.h(false));
            }
            this.H1.setTitleRightMargin(gm.L(48.0f) << 1);
            ArrayList arrayList = this.T2.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i2)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            o85 o85Var = this.O1;
            if (o85Var != null && o85Var.getVisibility() == 0) {
                this.t1.c(2131230919, -1, cmb.w0(null, cmb.th, false), 0.3f, false, jb6.M0(2131743048, null), false, true);
                K1(true);
                if (sd2.W(this.S2)) {
                    i = 2131743165;
                } else {
                    i = 2131743064;
                }
                this.r3.setText(jb6.M0(i, null));
                p85 p85Var = this.J1;
                p85Var.setVisibility(0);
                r7 r7Var = this.c3;
                r7Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(p85Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(p85Var, View.TRANSLATION_Y, gm.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o85Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o85Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o85Var, property, 0.0f);
                lka lkaVar = this.N1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lkaVar, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(lkaVar, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(lkaVar, property, 0.0f);
                lka lkaVar2 = this.P1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(lkaVar2, property2, 0.0f), ObjectAnimator.ofFloat(lkaVar2, property3, 0.0f), ObjectAnimator.ofFloat(lkaVar2, property, 0.0f), ObjectAnimator.ofFloat(r7Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(d53.g);
                animatorSet.addListener(new f85(this, (byte) 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i3;
        int i4;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i5;
        int i6;
        String M0;
        rd2 rd2Var;
        boolean z;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i7 = nm7.w2;
        p85 p85Var = this.J1;
        String[] strArr = null;
        int i8 = 0;
        if (i == i7) {
            Long l = (Long) objArr[1];
            qd2 qd2Var = this.T2;
            if (qd2Var != null && qd2Var.b.id == l.longValue()) {
                qd2 qd2Var2 = this.T2;
                if (qd2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i9 = (this.m2 > 0L ? 1 : (this.m2 == 0L ? 0 : -1));
                j5 j5Var = this.n1;
                if (i9 == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !qd2Var2.k())) {
                    try {
                        Intent intent = new Intent(this.b2, VoIPService.class);
                        intent.putExtra("chat_id", Z0());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.U2);
                        intent.putExtra("peerChannelId", this.R2.channel_id);
                        intent.putExtra("peerChatId", this.R2.chat_id);
                        intent.putExtra("peerUserId", this.R2.user_id);
                        intent.putExtra("hash", this.V2);
                        intent.putExtra("peerAccessHash", this.R2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", j5Var.a);
                        intent.putExtra("scheduleDate", this.c4);
                        this.b2.startService(intent);
                    } catch (Throwable th) {
                        fc4.g(th, true);
                    }
                    this.m2 = SystemClock.elapsedRealtime();
                    gm.d3(new v55(this, (byte) 3), 3000L);
                }
                if (i1() && !this.T2.k()) {
                    if (!this.o2) {
                        this.o2 = true;
                        dismiss();
                        return;
                    }
                    return;
                }
                if (!this.n2 && VoIPService.getSharedInstance() != null) {
                    this.T2.b(false);
                    d1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                E1();
                int childCount = p85Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = p85Var.getChildAt(i10);
                    if (childAt instanceof wb5) {
                        ((wb5) childAt).a(true, false);
                    }
                }
                if (this.M4 != null) {
                    this.l2 = true;
                } else {
                    D0(true);
                }
                M1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.z3 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                L1(true, booleanValue);
                N1(true);
                if (z && ((b = this.z3) == 1 || b == 0)) {
                    c1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l2 = (Long) objArr[3];
                    long longValue = l2.longValue();
                    if (longValue != 0) {
                        if (!g1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = oc7.r1(j5Var.a).y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        if (((TLRPC.Dialog) obj).id == longValue) {
                                            i8 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (pg3.D(longValue)) {
                                TLRPC.User W1 = oc7.r1(j5Var.a).W1(l2);
                                if (W1 != null) {
                                    if (this.T2.b.participants_count < 250 || m9c.y(W1) || W1.verified || i8 != 0) {
                                        c1().k(0L, 44, W1, this.S2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(-longValue));
                            if (L0 != null) {
                                if (this.T2.b.participants_count < 250 || !sd2.r0(L0) || L0.verified || i8 != 0) {
                                    c1().k(0L, 44, L0, this.S2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i == nm7.y2) {
            c75 c75Var = this.T3;
            if (c75Var.b && this.T2 != null) {
                boolean c = c75Var.c();
                qd2 qd2Var3 = this.T2;
                if (qd2Var3 != null && c75Var.b && (rd2Var = c75Var.e) != null && qd2Var3.d.f(k47.B1(rd2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    rd2 rd2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i8 >= arrayList2.size()) {
                            break;
                        }
                        rd2 rd2Var3 = (rd2) arrayList2.get(i8);
                        if (this.T2.P.g(null, k47.B1(rd2Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = rd2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && c75Var.d != k47.B1(groupCallParticipant3.peer)) {
                                rd2Var2 = rd2Var3;
                            }
                        }
                        i8++;
                    }
                    if (rd2Var2 != null) {
                        V0(rd2Var2);
                    }
                }
            }
            c75Var.setVisibleParticipant(true);
            M1();
        } else if (i == nm7.R4) {
            w1(((Float) objArr[0]).floatValue());
        } else if (i == nm7.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (sd2.W(this.S2)) {
                        M0 = jb6.M0(2131743136, null);
                    } else {
                        M0 = jb6.M0(2131743003, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = b10.j(new StringBuilder(jb6.M0(2131751042, null)), "\n", str);
                } else if (sd2.W(this.S2)) {
                    M0 = jb6.M0(2131743162, null);
                } else {
                    M0 = jb6.M0(2131743054, null);
                }
                AlertDialog$Builder K = ik.K(getContext(), jb6.M0(2131742990, null), M0);
                K.i(new a65(this, (byte) 1));
                try {
                    K.o();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else if (i == nm7.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == Z0()) {
                E1();
                L1(isShowing(), false);
            }
            long B1 = k47.B1(this.u2);
            qd2 qd2Var4 = this.T2;
            if (qd2Var4 != null && chatFull.id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) qd2Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                D0(true);
                gm.V3(p85Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt2 = this.u4.getChildAt(i8);
                        if ((childAt2 instanceof a8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            a8 a8Var = (a8) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i5 = 2131743190;
                            } else {
                                i5 = 2131743100;
                            }
                            String M02 = jb6.M0(i5, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i6 = 2131232049;
                            } else {
                                i6 = 2131232191;
                            }
                            a8Var.j(M02, i6, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == nm7.u1) {
            if (((Long) objArr[0]).longValue() == Z0()) {
                E1();
                L1(isShowing(), false);
            }
        } else if (i == nm7.B2) {
            int childCount2 = p85Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i8 < childCount2) {
                u69 G = p85Var.G(p85Var.getChildAt(i8));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof wb5) {
                        wb5 wb5Var = (wb5) view;
                        if (wb5Var.getParticipant() != null) {
                            wb5Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i8++;
            }
        } else if (i == nm7.E0) {
            Long l3 = (Long) objArr[0];
            long B12 = k47.B1(this.u2);
            if (this.T2 != null && B12 == l3.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                D0(true);
                gm.V3(p85Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt3 = this.u4.getChildAt(i8);
                        if ((childAt3 instanceof a8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            a8 a8Var2 = (a8) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i3 = 2131743191;
                            } else {
                                i3 = 2131743101;
                            }
                            String M03 = jb6.M0(i3, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i4 = 2131232049;
                            } else {
                                i4 = 2131232191;
                            }
                            a8Var2.j(M03, i4, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == nm7.j0) {
            D0(true);
            gm.V3(p85Var);
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = oc7.s5;
            if ((intValue & 16) != 0) {
                D0(true);
            } else if ((intValue & 524288) == 0) {
                return;
            }
            gm.V3(p85Var);
        } else if (i == nm7.z2) {
            y75 y75Var = this.t2;
            if (y75Var != null) {
                y75Var.a(true, true);
            }
            E1();
        } else if (i == nm7.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            pd pdVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            pdVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        pd5 pd5Var = this.y3;
        if (pd5Var != null) {
            pd5Var.dismiss();
        }
        this.l2 = true;
        nm7.e().k(nm7.F2, new Object[0]);
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        nm7.f(i).n(this, nm7.M0);
        nm7.f(i2).n(this, nm7.w2);
        nm7.f(i2).n(this, nm7.T);
        nm7.f(i2).n(this, nm7.u1);
        nm7.f(i2).n(this, nm7.B2);
        nm7.f(i2).n(this, nm7.E0);
        nm7.f(i2).n(this, nm7.j0);
        nm7.f(i2).n(this, 2);
        nm7.f(i2).n(this, nm7.z2);
        nm7.f(i2).n(this, nm7.y2);
        nm7.f(i2).n(this, nm7.U3);
        nm7.e().n(this, nm7.R4);
        nm7.e().n(this, nm7.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (this.b2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.b2.getSystemService("audio");
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView c1 = c1();
                if (z) {
                    i = 42;
                } else {
                    i = 43;
                }
                c1.j(i, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(long j, boolean z) {
        if (this.T2 != null) {
            j5 j5Var = this.n1;
            TLRPC.User W1 = oc7.r1(j5Var.a).W1(Long.valueOf(j));
            if (W1 != null) {
                he[] heVarArr = {new he(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                qd2 qd2Var = this.T2;
                invitetogroupcall.call = qd2Var.h(qd2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = W1.id;
                tL_inputUser.access_hash = W1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(j5Var.a).sendRequest(invitetogroupcall, new g65(this, j, heVarArr, W1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    gm.d3(new h65(this, heVarArr, sendRequest, (byte) 0), 500L);
                }
            }
        }
    }

    public final boolean f1() {
        float f;
        int L = gm.L(74.0f);
        float f2 = this.s2 - L;
        if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - gm.L(14.0f)));
        } else {
            f = 0.0f;
        }
        if (f > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean g1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        qd2 qd2Var = this.T2;
        if (qd2Var != null && qd2Var.b.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j0() {
        t5 = true;
        nm7.e().k(nm7.F2, new Object[0]);
        oa5.k(getContext());
        return false;
    }

    public final void j1(LaunchActivity launchActivity, qd2 qd2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final pd2 pd2Var;
        if (view instanceof n95) {
            V0(((n95) view).getParticipant());
        } else if (view instanceof wb5) {
            A1((wb5) view);
        } else {
            boolean z2 = view instanceof o95;
            Collection collection = null;
            b95 b95Var = this.I1;
            if (z2) {
                o95 o95Var = (o95) view;
                if (o95Var.getUser() != null) {
                    if (g1()) {
                        int i2 = i - b95Var.n;
                        if (i2 >= 0 && i2 < this.T2.m.size()) {
                            l = (Long) this.T2.m.get(i - b95Var.n);
                        } else {
                            int i3 = i - b95Var.s;
                            if (i3 >= 0 && i3 < this.T2.l.size()) {
                                l = (Long) this.T2.l.get(i - b95Var.s);
                            } else {
                                int i4 = i - b95Var.f;
                                if (this.l2) {
                                    if (i4 >= 0) {
                                        ArrayList arrayList = this.z2;
                                        if (i4 < arrayList.size()) {
                                            l = (Long) arrayList.get(i4);
                                            z = false;
                                        }
                                    }
                                    l = null;
                                    z = false;
                                } else {
                                    if (i4 >= 0 && i4 < this.T2.j.size()) {
                                        l = (Long) this.T2.j.get(i4);
                                        z = false;
                                    }
                                    l = null;
                                    z = false;
                                }
                                if (z && (pd2Var = (pd2) this.T2.k.get(l)) != null) {
                                    bu5 G = bu5.G(this.c, this.J0, o95Var);
                                    G.k(2131232135, jb6.M0(2131749217, null), new Runnable(this) {
                                        public final g95 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            pd2 pd2Var2 = pd2Var;
                                            final g95 g95Var = this.b;
                                            g95Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = pd2Var2.a;
                                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            g95 g95Var2 = g95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    qd2 qd2Var2 = g95Var.T2;
                                                    if (qd2Var2 != null) {
                                                        pd2Var2.b = false;
                                                        qd2Var2.k.put(l2, pd2Var2);
                                                        g95Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = pd2Var2.a;
                                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            g95 g95Var2 = g95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(pd2Var2.a));
                                                    oc7.r1(g95Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                                    qd2 qd2Var3 = g95Var.T2;
                                                    if (qd2Var3 != null) {
                                                        qd2Var3.j.remove(l2);
                                                        g95Var.T2.n.remove(l2);
                                                        g95Var.T2.k.remove(l2);
                                                        g95Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, pd2Var.a());
                                    G.b(2131232334, jb6.M0(2131749228, null), new Runnable(this) {
                                        public final g95 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            pd2 pd2Var2 = pd2Var;
                                            final g95 g95Var = this.b;
                                            g95Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = pd2Var2.a;
                                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            g95 g95Var2 = g95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    qd2 qd2Var2 = g95Var.T2;
                                                    if (qd2Var2 != null) {
                                                        pd2Var2.b = false;
                                                        qd2Var2.k.put(l2, pd2Var2);
                                                        g95Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = pd2Var2.a;
                                                    ConnectionsManager.getInstance(g95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            g95 g95Var2 = g95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        oc7.r1(g95Var2.a).T3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        g95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(pd2Var2.a));
                                                    oc7.r1(g95Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                                    qd2 qd2Var3 = g95Var.T2;
                                                    if (qd2Var3 != null) {
                                                        qd2Var3.j.remove(l2);
                                                        g95Var.T2.n.remove(l2);
                                                        g95Var.T2.k.remove(l2);
                                                        g95Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    G.X(cmb.c0(gm.L(8.0f), gm.L(8.0f), this.w2.getColor()));
                                    G.s = (short) 96;
                                    G.a0();
                                    return;
                                }
                                return;
                            }
                        }
                        z = true;
                        if (z) {
                            return;
                        }
                        return;
                    }
                    this.b2.N0(this.a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", o95Var.getUser().id);
                    if (o95Var.a.getImageReceiver().E()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    this.b2.t0(new ProfileActivity(bundle, null));
                    dismiss();
                }
            } else if (i == b95Var.x) {
                if (sd2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && sd2.t0(chat)) {
                    a1(false);
                    return;
                }
                j5 j5Var = this.n1;
                TLRPC.ChatFull M0 = oc7.r1(j5Var.a).M0(Z0());
                if (M0 != null) {
                    this.q2 = false;
                    Context context = getContext();
                    int i5 = j5Var.a;
                    TLRPC.Chat chat2 = this.S2;
                    qd2 qd2Var2 = this.T2;
                    pd5 pd5Var = new pd5(context, i5, chat2, M0, qd2Var2.d, qd2Var2.n);
                    this.y3 = pd5Var;
                    pd5Var.setOnDismissListener(new a65(this, (byte) 2));
                    pd5 pd5Var2 = this.y3;
                    pd5Var2.a2 = new l65(this);
                    pd5Var2.show();
                }
            } else if (i == b95Var.y) {
                qd2 qd2Var3 = this.T2;
                if (qd2Var3 != null && qd2Var3.b != null) {
                    t9c t9cVar = new t9c(launchActivity, this.a, new q63());
                    qd2 qd2Var4 = this.T2;
                    if (qd2Var4 != null) {
                        collection = (Collection) Collection.EL.stream(qd2Var4.e).map(new x00((byte) 8)).collect(Collectors.toSet());
                    }
                    t9cVar.s2.addAll(collection);
                    t9cVar.f1(false, true);
                    t9cVar.r2 = new v55(this, (byte) 5);
                    t9cVar.f1(false, true);
                    t9cVar.t2 = new lf2(this, qd2Var, (byte) 27);
                    t9cVar.show();
                }
            } else if (i == b95Var.E) {
                p1();
            }
        }
    }

    public final void k1(my0 my0Var, he heVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        long j;
        if (!this.q2) {
            d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (dVar instanceof yv1) {
                boolean ea = ((yv1) dVar).ea();
                this.q2 = true;
                this.r2 = true;
                rh rhVar = new rh(my0Var, editTextBoldCursor, z, heVar, (byte) 19);
                if (ea) {
                    j = 200;
                } else {
                    j = 0;
                }
                gm.d3(rhVar, j);
                return;
            }
            this.q2 = true;
            this.r2 = true;
            if (my0Var != null) {
                my0Var.v0(true);
            } else if (heVar != null) {
                heVar.k(true);
            }
            if (z) {
                gm.d3(new l(editTextBoldCursor, (byte) 5), 100L);
            }
        }
    }

    public final void m1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(false);
        }
        n85 n85Var = this.E1;
        dtc dtcVar = n85Var.w;
        if (dtcVar != null) {
            dtcVar.b(false);
        }
        n85Var.G = true;
        this.A1.r();
    }

    public final void n1() {
        w5 = false;
        this.I1.f();
        y65 y65Var = this.e4;
        if (y65Var.getVisibility() == 0) {
            this.h4.G(y65Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
        n85 n85Var = this.E1;
        dtc dtcVar = n85Var.w;
        if (dtcVar != null) {
            dtcVar.b(true);
        }
        n85Var.G = false;
        this.A1.s();
    }

    public final void o1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.o1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void onAudioSettingsChanged() {
        K1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            w1(0.0f);
        }
        p85 p85Var = this.J1;
        if (p85Var.getVisibility() == 0) {
            gm.V3(p85Var);
        }
        y65 y65Var = this.e4;
        if (y65Var.getVisibility() == 0) {
            gm.V3(y65Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        y75 y75Var = this.t2;
        if (y75Var != null) {
            y75Var.a(false, false);
        } else if (this.Y3) {
            T0(true);
        } else if (this.T3.b) {
            V0(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ha5) arrayList.get(i)).j(true);
        }
        y75 y75Var = this.t2;
        if (y75Var != null && VoIPService.getSharedInstance() != null) {
            y75Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.add(this.n4);
    }

    @Override
    public final void onStateChanged(int i) {
        this.M3 = i;
        L1(isShowing(), false);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(cmb.w0(null, cmb.Eh, false));
            }
            r7 r7Var = this.b3;
            if (r7Var != null) {
                int i = cmb.Xg;
                r7Var.O(cmb.w0(null, i, false), false);
                r7Var.O(cmb.w0(null, i, false), true);
                r7Var.setPopupItemsSelectorColor(cmb.w0(null, cmb.Ug, false));
            }
            int w0 = cmb.w0(null, cmb.Xg, false);
            z1(this.s3, w0);
            z1(this.t3, w0);
            z1(this.g3, w0);
            z1(this.h3, w0);
            z1(this.i3, w0);
            z1(this.r3, cmb.w0(null, cmb.lh, false));
            z1(this.e3, w0);
            z1(this.f3, w0);
            z1(this.m3, w0);
            z1(this.n3, w0);
            z1(this.o3, w0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p1() {
        qd2 qd2Var = this.T2;
        if (qd2Var != null && qd2Var.b != null) {
            he heVar = new he(3, null, getContext());
            heVar.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.T2.b;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new eo0(this, heVar, exportgroupcallinvite, (byte) 29));
        }
    }

    public final void r1(org.telegram.tgnet.TLRPC.GroupCallParticipant r34, final long r35, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.r1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void s1(boolean r18, defpackage.wb5 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g95.s1(boolean, wb5):void");
    }

    @Override
    public final void show() {
        super.show();
        G1();
    }

    public final void t1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall h;
        long j;
        this.A1.setText("");
        qd2 qd2Var = this.T2;
        if (qd2Var != null && qd2Var.b != null && (h = qd2Var.h(qd2Var.a)) != null) {
            qd2 qd2Var2 = this.T2;
            long j2 = qd2Var2.b.id;
            TLRPC.Peer peer = qd2Var2.J;
            if (peer != null) {
                j = pg3.n(peer);
            } else {
                j = z8c.h(this.a).n;
            }
            GroupCallMessagesController.getInstance(this.a).sendCallMessage(j, tL_textWithEntities, j2, h);
        }
    }

    public final void u1(float f) {
        float f2;
        int i;
        int i2;
        this.N3 = f;
        c75 c75Var = this.T3;
        if (c75Var == null) {
            f2 = 0.0f;
        } else {
            f2 = c75Var.c;
        }
        float max = Math.max(f, f2);
        int i3 = cmb.Zg;
        int w0 = cmb.w0(null, i3, false);
        int i4 = cmb.Wg;
        int R0 = gm.R0(f, 1.0f, w0, cmb.w0(null, i4, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = gm.R0(max, 1.0f, cmb.w0(null, i3, false), cmb.w0(null, i4, false));
        int R02 = gm.R0(f, 1.0f, cmb.w0(null, cmb.ah, false), cmb.w0(null, cmb.jh, false));
        pd pdVar = this.i2;
        if (pdVar != null) {
            pdVar.b = R02;
            sb sbVar = (sb) pdVar.i;
            if (sbVar != null) {
                sbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        p85 p85Var = this.J1;
        p85Var.setGlowColor(R02);
        byte b = this.z3;
        if (b == 3 || h1(b)) {
            this.v1.invalidate();
        }
        View view = this.z4;
        if (view != null) {
            int i5 = this.O3;
            int[] iArr = this.C4;
            iArr[0] = i5;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.B4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.B4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.A4.setBackgroundColor(iArr[0]);
        }
        int R03 = gm.R0(f, 1.0f, cmb.w0(null, cmb.th, false), cmb.w0(null, cmb.uh, false));
        this.t1.a(R03, R03);
        int R04 = gm.R0(f, 1.0f, cmb.w0(null, cmb.bh, false), cmb.w0(null, cmb.eh, false));
        int R05 = gm.R0(f, 1.0f, cmb.w0(null, cmb.ch, false), cmb.w0(null, cmb.hh, false));
        int v0 = cmb.v0(cmb.Ei, this.J0);
        int childCount = p85Var.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = p85Var.getChildAt(i6);
            if (childAt instanceof qb5) {
                qb5 qb5Var = (qb5) childAt;
                if (g1()) {
                    qb5Var.a(v0, v0);
                } else {
                    qb5Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof wb5;
                a85 a85Var = this.H1;
                if (z) {
                    wb5 wb5Var = (wb5) childAt;
                    if (a85Var.getTag() != null) {
                        i2 = cmb.hh;
                    } else {
                        i2 = cmb.ch;
                    }
                    wb5Var.f(i2, R05);
                } else if (childAt instanceof o95) {
                    o95 o95Var = (o95) childAt;
                    if (a85Var.getTag() != null) {
                        i = cmb.hh;
                    } else {
                        i = cmb.ch;
                    }
                    o95Var.a(i, R05);
                }
            }
        }
        this.b.invalidate();
        p85Var.invalidate();
        this.c.invalidate();
    }

    public final void v1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        qd2 qd2Var = this.T2;
        togglegroupcallsettings.call = qd2Var.h(qd2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        D1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        mp3 mp3Var = Utilities.d;
        Objects.requireNonNull(mp3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new rf2(mp3Var, (byte) 0), new f65(this, (byte) 0));
    }

    public final void w1(float f) {
        p85 p85Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        u69 K;
        f = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        qd2 qd2Var = this.T2;
        if (qd2Var != null && (p85Var = this.J1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) qd2Var.d.f(k47.B1(this.u2))) != null) {
            c75 c75Var = this.T3;
            if (!c75Var.b) {
                if (this.l2) {
                    arrayList = this.x2;
                } else {
                    arrayList = this.T2.g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = p85Var.K(indexOf + this.I1.d)) != null) {
                    View view = K.a;
                    if (view instanceof wb5) {
                        ((wb5) view).setAmplitude(f * 15.0f);
                        if (view == this.M4 && !this.d4) {
                            this.b.invalidate();
                        }
                    }
                }
            } else {
                int i = 0;
                while (true) {
                    y65 y65Var = this.e4;
                    if (i >= y65Var.getChildCount()) {
                        break;
                    }
                    l95 l95Var = (l95) y65Var.getChildAt(i);
                    if (k47.B1(l95Var.getParticipant().peer) == k47.B1(groupCallParticipant.peer)) {
                        l95Var.setAmplitude(f * 15.0f);
                    }
                    i++;
                }
            }
            c75Var.i(groupCallParticipant, f * 15.0f);
        }
    }

    public final void x1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.V4 = i;
        this.W4 = i2;
        this.X4 = i3;
        this.Y4 = i4;
        this.Z4 = i5;
        this.a5 = i6;
        this.b5 = i7;
        this.c5 = i8;
        this.d5 = i9;
        this.e5 = i10;
        this.f5 = i11;
        this.g5 = i12;
        this.h5 = i13;
        this.i5 = i14;
        this.j5 = i15;
        this.k5 = i16;
    }

    public final void y1(float f) {
        p85 p85Var;
        int L;
        int i;
        float f2;
        this.s2 = f;
        this.J1.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) p85Var.getLayoutParams()).topMargin));
        float L2 = f - gm.L(74.0f);
        int i2 = ((this.t0 + L2) > (a.getCurrentActionBarHeight() << 1) ? 1 : ((this.t0 + L2) == (a.getCurrentActionBarHeight() << 1) ? 0 : -1));
        c75 c75Var = this.T3;
        w65 w65Var = this.Y2;
        t65 t65Var = this.X2;
        if (i2 < 0) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L2) - this.t0) / (a.getCurrentActionBarHeight() + ((L - this.t0) - gm.L(14.0f))));
            if (gm.O1()) {
                f2 = 17.0f;
            } else {
                f2 = 13.0f;
            }
            i = (int) (gm.L(f2) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                u1(Math.min(1.0f, min));
            }
            float v = aq1.v(min, 0.1f, 1.2f, 1.0f);
            t65Var.setScaleX(Math.max(0.9f, v));
            t65Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            t65Var.setAlpha((1.0f - c75Var.c) * Math.max(0.0f, f3));
            w65Var.setScaleX(Math.max(0.9f, v));
            w65Var.setScaleY(Math.max(0.9f, v));
            w65Var.setAlpha((1.0f - c75Var.c) * Math.max(0.0f, f3));
        } else {
            t65Var.setScaleX(1.0f);
            t65Var.setScaleY(1.0f);
            t65Var.setAlpha(1.0f - c75Var.c);
            w65Var.setScaleX(1.0f);
            w65Var.setScaleY(1.0f);
            w65Var.setAlpha(1.0f - c75Var.c);
            if (this.N3 > 1.0E-4f) {
                u1(0.0f);
            }
            i = 0;
        }
        O0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(44.0f)) - f4));
        v75 v75Var = this.K1;
        if (v75Var != null) {
            v75Var.setTranslationY(Math.max(gm.L(4.0f), (f - gm.L(44.0f)) - f4));
        }
        this.b.invalidate();
        O1();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
    }

    @Override
    public final void onScreenOnChange(boolean z) {
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
