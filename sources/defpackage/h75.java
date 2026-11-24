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
public final class h75 extends fx0 implements gk7, VoIPService.StateListener, x74 {
    public static h75 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final o55 A1;
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
    public t09 D1;
    public final oy8 D2;
    public final g75[] D3;
    public final b55 D4;
    public final p65 E1;
    public final oy8 E2;
    public float E3;
    public boolean E4;
    public final hn F1;
    public boolean F2;
    public g75 F3;
    public boolean F4;
    public final x45 G1;
    public final fk0 G2;
    public g75 G3;
    public RenderNode G4;
    public final c65 H1;
    public final fk0 H2;
    public long H3;
    public float H4;
    public final c75 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final r65 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final x55 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final s55 L4;
    public final v55 M1;
    public final Matrix M2;
    public int M3;
    public y95 M4;
    public final jia N1;
    public final Paint N2;
    public float N3;
    public o75 N4;
    public final q65 O1;
    public float O2;
    public int O3;
    public h85 O4;
    public final jia P1;
    public float P2;
    public boolean P3;
    public m75 P4;
    public final x65 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final vb4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public fc2 T2;
    public final e55 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final k55 U3;
    public m65 U4;
    public final b85 V1;
    public final String V2;
    public final y55 V3;
    public int V4;
    public final int W1;
    public final d75 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final v45 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final y45 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public wl5 a4;
    public int a5;
    public LaunchActivity b2;
    public final r7 b3;
    public t65 b4;
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
    public final a55 e4;
    public int e5;
    public ke5 f2;
    public final a8 f3;
    public final o39 f4;
    public int f5;
    public ke5 g2;
    public final a8 g3;
    public final r95 g4;
    public int g5;
    public int h2;
    public final a8 h3;
    public final n75 h4;
    public int h5;
    public pc i2;
    public final a8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final r66 j3;
    public final wd1 j4;
    public int j5;
    public j65 k2;
    public final t66 k3;
    public boolean k4;
    public int k5;
    public final g55 l1;
    public boolean l2;
    public final q66 l3;
    public final ArrayList l4;
    public final n65 l5;
    public final l45 m1;
    public long m2;
    public final a8 m3;
    public boolean m4;
    public Boolean m5;
    public final j5 n1;
    public boolean n2;
    public final a8 n3;
    public final w35 n4;
    public Integer n5;
    public final r45 o1;
    public boolean o2;
    public final a8 o3;
    public final w45 o4;
    public final fm0 o5;
    public final dic p1;
    public final RectF p2;
    public final a8 p3;
    public final ql3 p4;
    public final fm0 p5;
    public final dic q1;
    public boolean q2;
    public final a8 q3;
    public final w35 q4;
    public final y74 q5;
    public final dic r1;
    public boolean r2;
    public final a8 r3;
    public final LongSparseIntArray r4;
    public final fm0 r5;
    public final dic s1;
    public float s2;
    public final a8 s3;
    public final i55 s4;
    public final dic t1;
    public a65 t2;
    public final a8 t3;
    public final f55 t4;
    public final dic u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final dic v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final s45 w1;
    public final Paint w2;
    public final fyc w3;
    public final oy8 w4;
    public final Paint x1;
    public final ArrayList x2;
    public w35 x3;
    public byte x4;
    public final r55 y1;
    public final ArrayList y2;
    public rb5 y3;
    public boolean y4;
    public final q55 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public h75(final LaunchActivity launchActivity, j5 j5Var, fc2 fc2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((wjb) null, (Context) launchActivity, true, true);
        int i;
        final h75 h75Var;
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
        this.w3 = new fyc(new w35(this, (byte) 4));
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new g75[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new wd1();
        this.l4 = new ArrayList();
        this.n4 = new w35(this, (byte) 0);
        this.o4 = new w45(this);
        this.p4 = new ql3((byte) 11);
        this.q4 = new w35(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new n65(this);
        s33 s33Var = s33.f;
        this.o5 = new fm0(2, this, s33Var, 350L);
        this.p5 = new fm0(3, this, s33Var, 220L, true);
        this.q5 = new y74(4, this, s33Var, 350L);
        this.r5 = new fm0(5, this, s33Var, 350L);
        gl.S(getWindow());
        this.S0 = true;
        this.n1 = j5Var;
        this.T2 = fc2Var;
        this.R2 = inputPeer;
        this.S2 = chat;
        this.V2 = str;
        this.a = j5Var.a;
        this.U2 = z;
        this.J0 = new e53();
        this.Q0 = true;
        this.R0 = true;
        this.W1 = na7.q1(this.a).k4.B.f();
        this.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        this.z0 = new h55(this);
        this.s = true;
        this.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.w = true;
        this.G0 = -1;
        this.L4 = new s55(this);
        setOnDismissListener(new b45(this, (byte) 0));
        this.q0 = (byte) 75;
        c75 c75Var = new c75(this, launchActivity);
        this.I1 = c75Var;
        pg2 pg2Var = new pg2(true);
        int i2 = bkb.gh;
        pg2Var.b(bkb.u0(i2));
        pg2Var.d();
        c65 c65Var = new c65(this, launchActivity, pg2Var);
        this.H1 = c65Var;
        c65Var.setSubtitle("");
        c65Var.getSubtitleTextView().setVisibility(0);
        c65Var.r();
        c65Var.getAdditionalSubtitleTextView().setPadding(gl.L(24.0f), 0, 0, 0);
        gl.Q3(1.0f, c65Var.getAdditionalSubtitleTextView(), this.m4, false);
        c65Var.getAdditionalSubtitleTextView().setTextColor(bkb.u0(i2));
        int i3 = bkb.bh;
        zkb.l(c65Var, 6, i3, null);
        c65Var.setBackButtonImage(2131231243);
        c65Var.setOccupyStatusBar(false);
        c65Var.setAllowOverlayTitle(false);
        int i4 = bkb.Xg;
        zkb.l(c65Var, 1, i4, null);
        zkb.l(c65Var, 3, bkb.y8, null);
        zkb.c(c65Var, i4);
        zkb.l(c65Var, 6, i3, null);
        c65Var.setActionBarMenuOnItemClick(new k65(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new x35(this, (byte) 2);
        j5Var.c().b(this, kk7.v2);
        j5Var.c().b(this, kk7.L0);
        j5Var.c().b(this, kk7.S);
        j5Var.c().b(this, kk7.t1);
        j5Var.c().b(this, kk7.A2);
        j5Var.c().b(this, kk7.D0);
        j5Var.c().b(this, kk7.i0);
        j5Var.c().b(this, 2);
        j5Var.c().b(this, kk7.y2);
        j5Var.c().b(this, kk7.x2);
        j5Var.c().b(this, kk7.T3);
        kk7.e().b(this, kk7.P4);
        kk7.e().b(this, kk7.C2);
        this.Y1 = launchActivity.getResources().getDrawable(2131232733).mutate();
        oy8 oy8Var = new oy8(2131624339, gl.L(46.0f), gl.L(46.0f), true, null);
        this.D2 = oy8Var;
        this.E2 = new oy8(2131624045, gl.L(46.0f), gl.L(46.0f), true, null);
        p65 p65Var = new p65(this, launchActivity);
        this.E1 = p65Var;
        this.b = p65Var;
        p65Var.setClipToPadding(false);
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
            jia jiaVar = new jia(launchActivity);
            this.N1 = jiaVar;
            jiaVar.setGravity(17);
            jiaVar.setTextColor(-1);
            jiaVar.setTypeface(gl.o());
            jiaVar.setTextSize(18);
            jiaVar.k(k96.L0(2131743193));
            this.b.addView(jiaVar, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            q65 q65Var = new q65(this, launchActivity);
            this.O1 = q65Var;
            q65Var.setGravity(17);
            q65Var.setTextColor(-1);
            q65Var.setTypeface(gl.o());
            q65Var.setTextSize(60);
            this.b.addView(q65Var, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            jia jiaVar2 = new jia(launchActivity);
            this.P1 = jiaVar2;
            jiaVar2.setGravity(17);
            jiaVar2.setTextColor(-1);
            jiaVar2.setTypeface(gl.o());
            jiaVar2.setTextSize(18);
            this.b.addView(jiaVar2, nme.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        r65 r65Var = new r65(this, launchActivity);
        this.J1 = r65Var;
        r65Var.setClipToPadding(false);
        r65Var.setClipChildren(false);
        x65 x65Var = new x65(this);
        this.Q1 = x65Var;
        x65Var.o = s33Var;
        x65Var.d = (short) 350;
        x65Var.c = (short) 350;
        x65Var.e = (short) 350;
        x65Var.C = false;
        r65Var.setItemAnimator(x65Var);
        r65Var.setOnScrollListener(new s65(this));
        r65Var.setVerticalScrollBarEnabled(false);
        getContext();
        vb4 vb4Var = new vb4(u5 ? 6 : 2, r65Var);
        this.R1 = vb4Var;
        r65Var.setLayoutManager(vb4Var);
        l45 l45Var = new l45(this);
        this.m1 = l45Var;
        vb4Var.O = l45Var;
        r65Var.i(new m45(this));
        vb4Var.W = false;
        this.b.addView(r65Var, nme.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        r65Var.setAdapter(c75Var);
        r65Var.setTopBottomSelectorRadius(13);
        zkb.I(bkb.Ug, r65Var);
        r65Var.setOnItemClickListener(new lt2(this, launchActivity, fc2Var, (byte) 13));
        r65Var.setOnItemLongClickListener(new x35(this, (byte) 3));
        o39 o39Var = new o39(launchActivity);
        this.f4 = o39Var;
        this.b.addView(o39Var, nme.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        r95 r95Var = new r95(fc2Var, this.a, this);
        this.g4 = r95Var;
        o39Var.setAdapter(r95Var);
        r35 r35Var = new r35(6, false);
        o39Var.setLayoutManager(r35Var);
        r35Var.O = new o45(this);
        o39Var.setOnItemClickListener(new c39(this) {
            public final h75 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i6, View view) {
                byte b = r2;
                h75 h75Var2 = this.b;
                switch (b) {
                    case 0:
                        m75 m75Var = (m75) view;
                        if (m75Var.getVideoParticipant() == null) {
                            h75Var2.V0(new gc2(m75Var.getParticipant(), false));
                            return;
                        } else {
                            h75Var2.V0(m75Var.getVideoParticipant());
                            return;
                        }
                    default:
                        o75 o75Var = (o75) view;
                        if (o75Var.getParticipant() != null) {
                            h75Var2.V0(o75Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        gb3 gb3Var = new gb3();
        gb3Var.C = false;
        gb3Var.o = s33Var;
        gb3Var.d = (short) 350;
        gb3Var.c = (short) 350;
        gb3Var.e = (short) 350;
        o39Var.setItemAnimator(new p45(this));
        o39Var.setOnScrollListener(new q45(this));
        r95Var.H(o39Var, false, false);
        o39Var.setVisibility(8);
        r45 r45Var = new r45(this, launchActivity);
        this.o1 = r45Var;
        int u0 = bkb.u0(bkb.zh);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        this.M2 = new Matrix();
        this.L2 = new RadialGradient(0.0f, 0.0f, gl.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.N2 = paint;
        paint.setShader(this.L2);
        fk0 fk0Var = new fk0(9);
        this.G2 = fk0Var;
        fk0 fk0Var2 = new fk0(12);
        this.H2 = fk0Var2;
        fk0Var.a = gl.L(62.0f) * 0.45454547f;
        fk0Var.b = gl.L(72.0f) * 0.45454547f;
        fk0Var.b();
        fk0Var2.a = gl.L(65.0f) * 0.45454547f;
        fk0Var2.b = gl.L(75.0f) * 0.45454547f;
        fk0Var2.b();
        int i6 = bkb.yh;
        fk0Var.d.setColor(bm2.o(bkb.u0(i6), 38));
        fk0Var2.d.setColor(bm2.o(bkb.u0(i6), 76));
        dic dicVar = new dic(launchActivity, 50.0f);
        this.s1 = dicVar;
        dicVar.setCheckable(true);
        dicVar.setTextSize(12);
        r45Var.a(dicVar);
        dicVar.setOnClickListener(new u35(this, (byte) 6));
        dic dicVar2 = new dic(launchActivity, 50.0f);
        this.r1 = dicVar2;
        dicVar2.setCheckable(true);
        dicVar2.setTextSize(12);
        dicVar2.d(false, false);
        dicVar2.setCrossOffset(-gl.N(3.5f));
        dicVar2.c(2131230926, -1, 0, 1.0f, true, k96.L0(2131743247), false, false);
        dic dicVar3 = new dic(launchActivity, 50.0f);
        this.p1 = dicVar3;
        dicVar3.setCheckable(true);
        dicVar3.setTextSize(12);
        dicVar3.d(false, false);
        ?? imageView = new ImageView(launchActivity);
        dicVar3.addView((View) imageView, nme.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        oy8 oy8Var2 = new oy8(2131623962, gl.L(24.0f), gl.L(24.0f), true, null);
        this.w4 = oy8Var2;
        imageView.setAnimation(oy8Var2);
        dicVar3.setOnClickListener(new u35(this, (byte) 7));
        r45Var.a(dicVar3);
        dic dicVar4 = new dic(launchActivity, 50.0f);
        this.q1 = dicVar4;
        dicVar4.setCheckable(true);
        dicVar4.setTextSize(12);
        dicVar4.d(false, false);
        ImageView imageView2 = new ImageView(launchActivity);
        this.U1 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.T1 = 2131231173;
        imageView2.setImageResource(2131231173);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView2.setScaleX(1.11f);
        imageView2.setScaleY(1.11f);
        dicVar4.addView(imageView2, nme.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        dicVar4.setOnClickListener(new u35(this, (byte) 10));
        r45Var.a(dicVar4);
        r45Var.a(dicVar2);
        dic dicVar5 = new dic(launchActivity, 50.0f);
        this.t1 = dicVar5;
        dicVar5.setTextSize(12);
        dicVar5.c(2131230918, -1, bkb.u0(bkb.th), 0.3f, false, k96.L0(2131743122), false, false);
        dicVar5.setOnClickListener(new View.OnClickListener(this) {
            public final h75 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                boolean z2 = true;
                LaunchActivity launchActivity2 = launchActivity;
                h75 h75Var2 = this.b;
                switch (b) {
                    case 0:
                        LaunchActivity launchActivity3 = h75Var2.b2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            h75Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                h75Var2.c2[0].d(1, false);
                                if (h75Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z2 = false;
                                    }
                                    a65 a65Var = new a65(h75Var2, launchActivity2, z2);
                                    h75Var2.t2 = a65Var;
                                    a65Var.setBottomPadding(h75Var2.b.getPaddingBottom());
                                    h75Var2.c.addView(h75Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            h75Var2.L1(true, false);
                            h75Var2.K1(false);
                            h75Var2.T2.B();
                            h75Var2.D0(true);
                            h75Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e55 e55Var = h75Var2.T3;
                        ez3 ez3Var = e55Var.i0;
                        if (e55Var.h0) {
                            gl.r(ez3Var);
                        }
                        gl.d3(ez3Var, 3000L);
                        e55Var.h0 = true;
                        fc2 fc2Var2 = h75Var2.T2;
                        if (fc2Var2 != null && !fc2Var2.k()) {
                            h75Var2.E1();
                            h75.l1(launchActivity2, new w35(h75Var2, (byte) 6), false, false);
                            return;
                        }
                        h75Var2.dismiss();
                        return;
                }
            }
        });
        dic dicVar6 = new dic(launchActivity, 50.0f);
        this.u1 = dicVar6;
        dicVar6.setCheckable(true);
        dicVar6.b(true, false);
        dicVar6.setTextSize(12);
        dicVar6.c(2131231188, -1, 0, 1.0f, true, k96.L0(2131743052), false, false);
        s45 s45Var = new s45(this, launchActivity);
        this.w1 = s45Var;
        s45Var.setAnimation(oy8Var);
        s45Var.setScaleType(ImageView.ScaleType.CENTER);
        dic dicVar7 = new dic(launchActivity, 50.0f);
        this.v1 = dicVar7;
        dicVar7.setDrawBackground(false);
        dicVar7.setTextSize(12);
        dicVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        dicVar7.addView(s45Var, nme.e(50, 50, 49));
        r45Var.a(dicVar7);
        dicVar7.setOnClickListener(new u45(this));
        r45Var.a(dicVar6);
        r45Var.a(dicVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.X1 = radialProgressView;
        radialProgressView.setSize(gl.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(bkb.u0(bkb.Eh));
        c65Var.setAlpha(0.0f);
        c65Var.getBackButton().setScaleX(0.9f);
        c65Var.getBackButton().setScaleY(0.9f);
        c65Var.getBackButton().setTranslationX(-gl.L(14.0f));
        c65Var.getTitleTextView().setTranslationY(gl.L(23.0f));
        c65Var.getSubtitleTextView().setTranslationY(gl.L(20.0f));
        c65Var.getAdditionalSubtitleTextView().setTranslationY(gl.L(20.0f));
        r7 r7Var = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.b3 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setIcon(2131231247);
        r7Var.setContentDescription(k96.L0(2131754838));
        r7Var.setSubMenuOpenSide(2);
        r7Var.setDelegate(new x35(this, (byte) 5));
        int i7 = bkb.Yg;
        zkb.Q(r7Var, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var.setOnClickListener(new u35(this, (byte) 11));
        r7Var.O(bkb.u0(i), false);
        r7Var.O(bkb.u0(i), true);
        r7 r7Var2 = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.c3 = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setIcon(2131232434);
        r7Var2.setContentDescription(k96.L0(2131754807));
        zkb.Q(r7Var2, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var2.setOnClickListener(new u35(this, (byte) 12));
        r7 r7Var3 = new r7(launchActivity, (r6) null, bkb.u0(i));
        this.d3 = r7Var3;
        r7Var3.setLongClickEnabled(false);
        r7Var3.setIcon(2131232357);
        r7Var3.setContentDescription(k96.L0(2131754807));
        zkb.Q(r7Var3, bkb.e0(bkb.u0(i7), 6), null, zkb.M(i7));
        r7Var3.setOnClickListener(new u35(this, (byte) 0));
        v45 v45Var = new v45(this, launchActivity, launchActivity);
        this.X2 = v45Var;
        ?? view = new View(launchActivity);
        this.G1 = view;
        view.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Z2 = paint2;
        paint2.setColor(-12761513);
        y45 y45Var = new y45(this, getContext());
        this.Y2 = y45Var;
        zkb.X(y45Var, i, this.J0);
        y45Var.setTextSize(1, 11.0f);
        y45Var.setText(k96.L0(2131743232));
        y45Var.setMaxLines(1);
        y45Var.setGravity(17);
        y45Var.setTypeface(gl.o());
        y45Var.setPadding(gl.L(8.0f), gl.L(0.0f), gl.L(8.0f), gl.L(0.0f));
        if (!i1()) {
            y45Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(v45Var, nme.l(1.0f, 0, -2));
        linearLayout.addView(y45Var, nme.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.b.addView((View) view, nme.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(linearLayout, nme.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.b.addView(c65Var, nme.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(r7Var3, nme.o(48, 48));
        linearLayout2.addView(r7Var2, nme.o(48, 48));
        linearLayout2.addView(r7Var, nme.o(48, 48));
        this.b.addView(linearLayout2, nme.e(-2, 48, 53));
        View view2 = new View(launchActivity);
        this.Z1 = view2;
        view2.setAlpha(0.0f);
        zkb.h(bkb.U5, null, view2);
        this.b.addView(view2, nme.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            this.c2[i8] = new z45(this, launchActivity);
            this.c2[i8].setAdditionalTranslationY(gl.L(10.0f));
            this.c2[i8].setTranslationZ(gl.L(5.0f));
            this.b.addView(this.c2[i8], nme.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        k5 k5Var = new k5(launchActivity, true);
        this.d2 = k5Var;
        k5Var.setTag(2131296439, 240);
        this.b3.h(k5Var, gl.L(48.0f));
        this.b3.setShowSubmenuByMove(false);
        int i9 = bkb.Ug;
        zkb.Q(k5Var, bkb.Y(bkb.u0(i9), 6, 6), null, zkb.M(i9));
        r7 r7Var4 = this.b3;
        a8 d = r7Var4.d(1, 0, null, k96.L0(2131743159), true, true, r7Var4.n0);
        this.p3 = d;
        d.m(true, false);
        r7 r7Var5 = this.b3;
        a8 d2 = r7Var5.d(2, 0, null, k96.L0(2131743112), true, true, r7Var5.n0);
        this.q3 = d2;
        d2.m(false, true);
        int i10 = bkb.mh;
        d.setCheckColor(i10);
        d.d(bkb.u0(i10), bkb.u0(i10));
        d2.setCheckColor(i10);
        d2.d(bkb.u0(i10), bkb.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(bkb.u0(bkb.Xg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gl.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        a8 f = this.b3.f(null, k96.L0(2131743157), 10, true, 2131232435);
        this.g3 = f;
        f.setItemHeight(56);
        a8 f2 = this.b3.f(null, k96.L0(2131743040), 11, true, 2131232266);
        this.h3 = f2;
        f2.setItemHeight(56);
        r66 r66Var = new r66(q66.a());
        this.j3 = r66Var;
        a8 f3 = this.b3.f(r66Var, k96.L0(2131745059), 14, false, 0);
        this.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(2131232365);
        f3.setSubtext(k96.L0(q66.a() ? 2131745057 : 2131745058));
        f3.getRightIcon().setBackground(bkb.e0(bkb.u0(i9), 1));
        int i11 = (k96.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = k96.a0;
        rightIcon.setLayoutParams(nme.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view3 = new View(launchActivity);
        view3.setBackgroundColor(bm2.f(0.3f, bkb.u0(bkb.Wg), -16777216));
        boolean z3 = k96.a0;
        FrameLayout.LayoutParams d3 = nme.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view3.setLayoutParams(d3);
        f3.addView(view3);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view4 = viewArr[i12];
            if (view4 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view4.getLayoutParams();
                layoutParams.leftMargin = k96.a0 ? gl.L(60.0f) : 0;
                layoutParams.rightMargin = k96.a0 ? 0 : gl.L(60.0f);
                view4.setLayoutParams(layoutParams);
            }
        }
        this.i3.getRightIcon().setContentDescription(k96.L0(2131745041));
        this.i3.getRightIcon().setOnClickListener(new u35(this, (byte) 1));
        TextView b = this.b3.b(bm2.f(0.3f, bkb.u0(bkb.Wg), -16777216));
        this.v3 = b;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).bottomMargin = 0;
        a8 f4 = this.b3.f(this.W2, k96.L0(hc2.W(this.S2) ? 2131743243 : 2131743142), 6, true, 2131232121);
        this.f3 = f4;
        a8 f5 = this.b3.f(this.W2, k96.L0(2131743143), 7, false, 2131232281);
        this.m3 = f5;
        a8 e = this.b3.e(3, 2131232208, k96.L0(2131743095));
        this.e3 = e;
        d75 d75Var = new d75();
        this.W2 = d75Var;
        a8 e2 = this.b3.e(9, 2131232357, k96.L0(2131743194));
        this.o3 = e2;
        a8 f6 = this.b3.f(d75Var, k96.L0(2131743106), 5, true, 0);
        this.n3 = f6;
        d75Var.g = f6.getImageView();
        a8 e3 = this.b3.e(12, 2131231899, k96.L0(2131743242));
        this.s3 = e3;
        a8 e4 = this.b3.e(13, 2131230781, k96.L0(2131743244));
        this.t3 = e4;
        a8 e5 = this.b3.e(4, 2131232092, k96.L0(g1() ? 2131743137 : hc2.W(this.S2) ? 2131743239 : 2131743138));
        this.r3 = e5;
        this.b3.setPopupItemsSelectorColor(bkb.u0(bkb.Ug));
        this.b3.getPopupLayout().setFitItems(true);
        int i13 = bkb.Xg;
        e3.d(bkb.u0(i13), bkb.u0(i13));
        e4.d(bkb.u0(i13), bkb.u0(i13));
        this.g3.d(bkb.u0(i13), bkb.u0(i13));
        this.h3.d(bkb.u0(i13), bkb.u0(i13));
        z1(this.i3, bkb.u0(i13));
        int i14 = bkb.lh;
        e5.d(bkb.u0(i14), bkb.u0(i14));
        e.d(bkb.u0(i13), bkb.u0(i13));
        f4.d(bkb.u0(i13), bkb.u0(i13));
        f5.d(bkb.u0(i13), bkb.u0(i13));
        f6.d(bkb.u0(i13), bkb.u0(i13));
        e2.d(bkb.u0(i13), bkb.u0(i13));
        if (this.T2 != null) {
            d1();
        }
        if (g1()) {
            this.i2 = new pc();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        N1(false);
        this.H1.getTitleTextView().setOnClickListener(new u35(this, (byte) 2));
        a55 a55Var = new a55(this, launchActivity);
        this.e4 = a55Var;
        b55 b55Var = new b55(this);
        this.D4 = b55Var;
        a55Var.setClipToPadding(false);
        b55Var.C = false;
        b55Var.o = s33.f;
        b55Var.d = (short) 350;
        b55Var.c = (short) 350;
        b55Var.e = (short) 350;
        a55Var.setItemAnimator(b55Var);
        a55Var.setOnScrollListener(new c55(this));
        a55Var.setClipChildren(false);
        t26 t26Var = new t26();
        t26Var.i1(0);
        a55Var.setLayoutManager(t26Var);
        n75 n75Var = new n75(fc2Var, this.a, this);
        this.h4 = n75Var;
        a55Var.setAdapter(n75Var);
        n75Var.F(a55Var, false);
        a55Var.setOnItemClickListener(new c39(this) {
            public final h75 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i62, View view5) {
                byte b2 = r2;
                h75 h75Var2 = this.b;
                switch (b2) {
                    case 0:
                        m75 m75Var = (m75) view5;
                        if (m75Var.getVideoParticipant() == null) {
                            h75Var2.V0(new gc2(m75Var.getParticipant(), false));
                            return;
                        } else {
                            h75Var2.V0(m75Var.getVideoParticipant());
                            return;
                        }
                    default:
                        o75 o75Var = (o75) view5;
                        if (o75Var.getParticipant() != null) {
                            h75Var2.V0(o75Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        a55Var.setOnItemLongClickListener(new x35(this, (byte) 0));
        a55Var.setVisibility(8);
        a55Var.i(new Object());
        e55 e55Var = new e55(this, launchActivity, this.J1, a55Var, this.R3, this.T2, this);
        this.T3 = e55Var;
        e55Var.setClipChildren(false);
        n75Var.E(this.R3, e55Var);
        if (this.f4 != null) {
            this.g4.G(this.R3, e55Var);
        }
        f55 f55Var = new f55(this, launchActivity);
        this.t4 = f55Var;
        g55 g55Var = new g55(this, launchActivity, this.H1, this.J1, f55Var);
        this.l1 = g55Var;
        g55Var.setImagesLayerNum(Integer.MAX_VALUE);
        g55Var.setInvalidateWithParent(true);
        f55Var.setProfileGalleryView(g55Var);
        i55 i55Var = new i55(this, launchActivity);
        this.s4 = i55Var;
        i55Var.setVisibility(8);
        g55Var.setVisibility(0);
        g55Var.b(new j55(this));
        k55 k55Var = new k55(this, launchActivity);
        this.U3 = k55Var;
        this.b.addView(e55Var);
        e55Var.addView(a55Var, nme.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.o1.setWillNotDraw(false);
        View view5 = new View(launchActivity);
        this.z4 = view5;
        int[] iArr = this.C4;
        iArr[0] = this.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.C4);
        this.B4 = gradientDrawable;
        view5.setBackground(gradientDrawable);
        this.b.addView(view5, nme.e(-1, 60, 83));
        View view6 = new View(launchActivity);
        this.A4 = view6;
        view6.setBackgroundColor(this.C4[0]);
        this.b.addView(view6, nme.e(-1, 0, 83));
        b85 b85Var = new b85(launchActivity);
        this.V1 = b85Var;
        b85Var.setDelegate(new l55(this));
        b85Var.setClickCellDelegate(new m55(this));
        fc2 fc2Var2 = this.T2;
        if (fc2Var2 != null) {
            b85Var.E0(this.n1.a, fc2Var2.h(false));
        }
        this.b.addView(b85Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        t66 t66Var = new t66(launchActivity);
        this.k3 = t66Var;
        t66Var.setOnContentHeightChanged(new w35(this, (byte) 1));
        this.b.addView(t66Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.l3 = new q66(new n55(this));
        hn hnVar = new hn(launchActivity, false, true, true);
        this.F1 = hnVar;
        hnVar.setGravity(17);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTextColor(-1);
        hnVar.b(0.4f, 320L, s33.h);
        hnVar.setTypeface(gl.o());
        this.b.addView(this.o1);
        o55 o55Var = new o55(this, launchActivity, this.E1, LaunchActivity.Q(), this.J0);
        this.A1 = o55Var;
        o55Var.K = true;
        o55Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.W1)});
        o55Var.getEditText().setLinkTextColor(-11683585);
        o55Var.setHint(k96.L0(2131743689));
        o55Var.getEditText().addTextChangedListener(new p55(this));
        o55Var.s();
        q55 q55Var = new q55(this, launchActivity);
        this.z1 = q55Var;
        this.b.addView(q55Var, nme.c(-1.0f, -1));
        ?? frameLayout = new FrameLayout(launchActivity);
        this.y1 = frameLayout;
        frameLayout.addView(o55Var, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        frameLayout.addView(hnVar, nme.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        hnVar.setTranslationY(-gl.L(20.0f));
        this.b.addView((View) frameLayout, nme.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.C1 = imageView3;
        int i15 = bkb.h6;
        zkb.R(imageView3, bkb.f0(T(i15), 1, -1), null, zkb.M(i15), this.J0);
        int i16 = bkb.e7;
        wjb wjbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView3, i16, wjbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new u35(this, (byte) 3));
        ImageView imageView4 = new ImageView(launchActivity);
        this.B1 = imageView4;
        zkb.R(imageView4, bkb.f0(T(i15), 1, -1), null, zkb.M(i15), this.J0);
        zkb.s(imageView4, bkb.u6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231463);
        imageView4.setOnClickListener(new u35(this, (byte) 4));
        frameLayout.addView(imageView3, nme.e(48, 48, 85));
        frameLayout.addView(imageView4, nme.e(48, 48, 85));
        this.b.addView(k55Var);
        i55Var.addView(g55Var, nme.c(-1.0f, -1));
        i55Var.addView(f55Var, nme.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b.addView(i55Var, nme.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
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
            if (hc2.T(this.S2) && (chat2 = this.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.b.addView(textView, nme.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            hn7 hn7Var = new hn7(launchActivity);
            hn7Var.setTextColor(-1);
            hn7Var.setSelectorColor(-9598483);
            hn7Var.setTextOffset(gl.L(10.0f));
            hn7Var.setItemCount(5);
            ?? hn7Var2 = new hn7(launchActivity);
            hn7Var2.setItemCount(5);
            hn7Var2.setTextColor(-1);
            hn7Var2.setSelectorColor(-9598483);
            hn7Var2.setTextOffset(-gl.L(10.0f));
            ?? hn7Var3 = new hn7(launchActivity);
            hn7Var3.setItemCount(5);
            hn7Var3.setTextColor(-1);
            hn7Var3.setSelectorColor(-9598483);
            hn7Var3.setTextOffset(-gl.L(34.0f));
            v55 v55Var = new v55(launchActivity);
            this.M1 = v55Var;
            v55Var.setLines(1);
            v55Var.setSingleLine(true);
            v55Var.setEllipsize(TextUtils.TruncateAt.END);
            v55Var.setGravity(17);
            v55Var.setTextColor(-1);
            v55Var.setTypeface(gl.o());
            v55Var.setTextSize(1, 14.0f);
            this.b.addView(v55Var, nme.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            v55Var.setOnClickListener(new y35(this, hn7Var, hn7Var2, hn7Var3, chat, j5Var, inputPeer2, (byte) 0));
            x55 x55Var = new x55(launchActivity, hn7Var, hn7Var2, hn7Var3);
            this.K1 = x55Var;
            x55Var.setWeightSum(1.0f);
            x55Var.setOrientation(0);
            this.b.addView(x55Var, nme.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            x55Var.addView(hn7Var, nme.l(0.5f, 0, 270));
            hn7Var.setMinValue(0);
            hn7Var.setMaxValue(365);
            hn7Var.setWrapSelectorWheel(false);
            hn7Var.setFormatter(new om0(currentTimeMillis, calendar, i17, (byte) 1));
            lt ltVar = new lt(this, hn7Var, (Object) hn7Var2, (Object) hn7Var3, (byte) 12);
            hn7Var.setOnValueChangedListener(ltVar);
            hn7Var2.setMinValue(0);
            hn7Var2.setMaxValue(23);
            x55Var.addView((View) hn7Var2, nme.l(0.2f, 0, 270));
            hn7Var2.setFormatter(new wn4((byte) 8));
            hn7Var2.setOnValueChangedListener(ltVar);
            hn7Var3.setMinValue(0);
            hn7Var3.setMaxValue(59);
            hn7Var3.setValue(0);
            hn7Var3.setFormatter(new wn4((byte) 9));
            x55Var.addView((View) hn7Var3, nme.l(0.3f, 0, 270));
            hn7Var3.setOnValueChangedListener(ltVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            hn7Var.setValue(i18 != i19 ? 1 : 0);
            hn7Var3.setValue(i20);
            hn7Var2.setValue(i21);
            h75Var = this;
            ij.g(v55Var, textView, 0L, 604800L, 2, hn7Var, hn7Var2, hn7Var3);
        } else {
            h75Var = this;
        }
        y55 y55Var = new y55(h75Var, (ViewGroup) h75Var.getWindow().getDecorView(), h75Var.b);
        h75Var.V3 = y55Var;
        y55Var.E = new z55(h75Var);
        g55Var.setPinchToZoomHelper(y55Var);
        h75Var.r1.setOnClickListener(new View.OnClickListener(h75Var) {
            public final h75 b;

            {
                this.b = h75Var;
            }

            @Override
            public final void onClick(View view7) {
                byte b2 = r3;
                boolean z22 = true;
                LaunchActivity launchActivity2 = launchActivity;
                h75 h75Var2 = this.b;
                switch (b2) {
                    case 0:
                        LaunchActivity launchActivity3 = h75Var2.b2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            h75Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                h75Var2.c2[0].d(1, false);
                                if (h75Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z22 = false;
                                    }
                                    a65 a65Var = new a65(h75Var2, launchActivity2, z22);
                                    h75Var2.t2 = a65Var;
                                    a65Var.setBottomPadding(h75Var2.b.getPaddingBottom());
                                    h75Var2.c.addView(h75Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            h75Var2.L1(true, false);
                            h75Var2.K1(false);
                            h75Var2.T2.B();
                            h75Var2.D0(true);
                            h75Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        e55 e55Var2 = h75Var2.T3;
                        ez3 ez3Var = e55Var2.i0;
                        if (e55Var2.h0) {
                            gl.r(ez3Var);
                        }
                        gl.d3(ez3Var, 3000L);
                        e55Var2.h0 = true;
                        fc2 fc2Var22 = h75Var2.T2;
                        if (fc2Var22 != null && !fc2Var22.k()) {
                            h75Var2.E1();
                            h75.l1(launchActivity2, new w35(h75Var2, (byte) 6), false, false);
                            return;
                        }
                        h75Var2.dismiss();
                        return;
                }
            }
        });
        h75Var.J1(false);
        h75Var.E1();
        h75Var.K1(false);
        h75Var.L1(false, false);
        h75Var.u1(0.0f);
        h75Var.M1();
        h75Var.b.addView(new FrameLayout(launchActivity), nme.e(-1, 200, 87));
        h75Var.u1.setOnClickListener(new u35(h75Var, (byte) 5));
        h75Var.J0();
        ote.a(h75Var.r1);
        ote.a(h75Var.s1);
        ote.a(h75Var.p1);
        ote.a(h75Var.q1);
        ote.a(h75Var.v1);
        ote.a(h75Var.t1);
        ote.a(h75Var.u1);
        ViewGroup viewGroup2 = h75Var.b;
        x35 x35Var = new x35(h75Var, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(viewGroup2, x35Var);
    }

    public static void S0(LaunchActivity launchActivity, j5 j5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        h75 h75Var;
        TLRPC.GroupCall groupCall;
        fc2 fc2Var;
        if (s5 == null && on9.Q0 == null) {
            if (inputPeer == null) {
                if (VoIPService.getSharedInstance() != null && (fc2Var = VoIPService.getSharedInstance().groupCall) != null) {
                    TLRPC.GroupCall groupCall2 = fc2Var.b;
                    if (groupCall2 != null && groupCall2.rtmp_stream && !fc2Var.k()) {
                        if (on9.Q0 == null && launchActivity != null) {
                            on9 on9Var = new on9(launchActivity, j5Var, fc2Var, na7.q1(j5Var.a).K0(Long.valueOf(fc2Var.c)));
                            on9.Q0 = on9Var;
                            on9Var.show();
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(fc2Var.c));
                    fc2Var.b(true);
                    h75Var = new h75(launchActivity, j5Var, fc2Var, K0, null, z, str);
                    s5 = h75Var;
                    launchActivity2 = launchActivity;
                } else {
                    return;
                }
            } else {
                fc2 e1 = na7.q1(j5Var.a).e1(chat.id, false, null);
                if (e1 == null || (groupCall = e1.b) == null || !groupCall.rtmp_stream || e1.k()) {
                    launchActivity2 = launchActivity;
                    h75 h75Var2 = new h75(launchActivity2, j5Var, e1, chat, inputPeer, z, str);
                    s5 = h75Var2;
                    h75Var = h75Var2;
                } else {
                    return;
                }
            }
            h75Var.b2 = launchActivity2;
            gl.c3(new ql3((byte) 10));
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
                return k96.M0(2131743261, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return k96.M0(2131743259, null);
            } else {
                return k96.M0(2131743258, null);
            }
        }
        return k96.M0(2131743257, null);
    }

    public static String X0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return k96.a0(null, null, 2131743255, str);
            }
            return k96.M0(2131743256, null);
        } else if (i == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return k96.M0(2131743254, null);
            }
            return k96.M0(2131743253, null);
        } else {
            return k96.M0(2131743252, null);
        }
    }

    public static String b1() {
        String[] strArr = ow3.i[(int) Math.floor(Math.random() * 8.0d)];
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
            fc2 fc2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z2 && hc2.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                hd hdVar = alertDialog$Builder.a;
                if (isConference) {
                    hdVar.S = k96.M0(2131743226, null);
                    hdVar.U = k96.M0(2131743227, null);
                } else if (hc2.W(chat)) {
                    hdVar.S = k96.M0(2131743229, null);
                    hdVar.U = k96.M0(2131743230, null);
                } else {
                    hdVar.S = k96.M0(2131743119, null);
                    hdVar.U = k96.M0(2131743120, null);
                }
                sharedInstance.getAccount();
                ag2[] ag2VarArr = new ag2[1];
                LinearLayout j = de9.j(context, 1);
                if (!sharedInstance.isConference() || (fc2Var != null && (groupCall = fc2Var.b) != null && groupCall.creator)) {
                    ag2 ag2Var = new ag2(context, 1);
                    ag2VarArr[0] = ag2Var;
                    ag2Var.setBackground(bkb.L0(false));
                    if (z) {
                        ag2VarArr[0].setTextColor(bkb.w0(null, bkb.i5, false));
                    } else {
                        ag2VarArr[0].setTextColor(bkb.w0(null, bkb.Xg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) ag2VarArr[0].getCheckBoxView();
                        int i = bkb.hh;
                        int i2 = bkb.fh;
                        int i3 = bkb.dh;
                        checkBoxSquare.s = i;
                        checkBoxSquare.w = i2;
                        checkBoxSquare.x = i3;
                        checkBoxSquare.invalidate();
                    }
                    ag2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        ag2VarArr[0].e(k96.M0(2131743228, null), "", false, false, false);
                    } else if (hc2.W(chat)) {
                        ag2VarArr[0].e(k96.M0(2131743231, null), "", false, false, false);
                    } else {
                        ag2VarArr[0].e(k96.M0(2131743121, null), "", false, false, false);
                    }
                    ag2 ag2Var2 = ag2VarArr[0];
                    if (k96.a0) {
                        L = gl.L(16.0f);
                    } else {
                        L = gl.L(8.0f);
                    }
                    if (k96.a0) {
                        L2 = gl.L(8.0f);
                    } else {
                        L2 = gl.L(16.0f);
                    }
                    ag2Var2.setPadding(L, 0, L2, 0);
                    j.addView(ag2VarArr[0], nme.o(-1, -2));
                    ag2VarArr[0].setOnClickListener(new yd(ag2VarArr, (byte) 2));
                }
                alertDialog$Builder.n(j);
                hdVar.J = bkb.fh;
                alertDialog$Builder.j(k96.M0(2131743122, null), new qm1(fc2Var, ag2VarArr, selfId, runnable, (byte) 4));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                if (z) {
                    hdVar.Q0 = false;
                }
                if (z) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        hdVar.getWindow().setType(2038);
                    } else {
                        hdVar.getWindow().setType(2003);
                    }
                    hdVar.getWindow().clearFlags(2);
                }
                if (!z) {
                    hdVar.j(bkb.w0(null, bkb.kh, false));
                }
                hdVar.show();
                if (!z) {
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.lh, null);
                    }
                    hdVar.o(bkb.w0(null, bkb.Xg, false));
                    return;
                }
                return;
            }
            q1(fc2Var, false, selfId, runnable);
        }
    }

    public static void q1(fc2 fc2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (fc2Var != null) {
            ArrayList arrayList = fc2Var.f;
            ArrayList arrayList2 = fc2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(j);
            if (groupCallParticipant != null) {
                fc2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                fc2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (k27.B1(((gc2) arrayList.get(i)).a.peer) == k27.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = fc2Var.b;
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
        kk7.e().k(kk7.u2, new Object[0]);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.A1(android.view.View):boolean");
    }

    public final void B1(View view) {
        if (this.f2 == null) {
            ke5 ke5Var = new ke5(8, null, getContext(), true);
            this.f2 = ke5Var;
            ke5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, nme.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = hc2.W(this.S2);
            ke5 ke5Var2 = this.f2;
            if (W) {
                ke5Var2.setText(k96.M0(2131743223, null));
            } else {
                ke5Var2.setText(k96.M0(2131743105, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-gl.m);
        this.f2.c(view);
    }

    public final void C1() {
        fc2 fc2Var = this.T2;
        if (fc2Var != null && fc2Var.b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            fc2 fc2Var2 = this.T2;
            togglegroupcallsettings.call = fc2Var2.h(fc2Var2.a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
            co3 co3Var = Utilities.d;
            Objects.requireNonNull(co3Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new ge2(co3Var, (byte) 0), new g45(this, (byte) 1));
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.D0(boolean):void");
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
        fc2 fc2Var = this.T2;
        dic dicVar = this.u1;
        dic dicVar2 = this.q1;
        dic dicVar3 = this.s1;
        dic dicVar4 = this.p1;
        dic dicVar5 = this.r1;
        dic dicVar6 = this.t1;
        dic dicVar7 = this.v1;
        boolean z11 = true;
        r45 r45Var = this.o1;
        boolean z12 = false;
        if (fc2Var != null && !fc2Var.k()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
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
            r45Var.c(dicVar7, true, z);
            r45Var.c(dicVar6, true, z);
            r45Var.c(dicVar5, z8, z);
            r45Var.c(dicVar4, z12, z);
            r45Var.c(dicVar3, z7, z);
            r45Var.c(dicVar2, z9, z);
            r45Var.c(dicVar, z6, z);
            return;
        }
        if (this.O2 > 0.1f) {
            z2 = true;
        } else {
            z2 = false;
        }
        r45Var.c(dicVar7, z2, z);
        if (this.O2 > 0.1f) {
            z3 = true;
        } else {
            z3 = false;
        }
        r45Var.c(dicVar6, z3, z);
        if (this.O2 <= 0.1f) {
            z11 = false;
        }
        r45Var.c(dicVar3, z11, z);
        r45Var.c(dicVar5, false, z);
        r45Var.c(dicVar4, false, z);
        r45Var.c(dicVar2, false, z);
        r45Var.c(dicVar, false, z);
    }

    @Override
    public final boolean E() {
        return !this.T3.b;
    }

    public final void E0(o75 o75Var, boolean z) {
        if (!this.J) {
            if (z) {
                if (o75Var.getRenderer() == null) {
                    o75Var.setRenderer(h85.c(this.R3, this.T3, o75Var, null, null, o75Var.getParticipant(), this.T2, this));
                }
            } else if (o75Var.getRenderer() != null) {
                o75Var.getRenderer().setPrimaryView(null);
                o75Var.setRenderer(null);
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
        TLObject K0;
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i5;
        int i6;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        fc2 fc2Var2 = this.T2;
        r7 r7Var = this.b3;
        r7 r7Var2 = this.d3;
        if (fc2Var2 == null || fc2Var2.k()) {
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
        TLRPC.Chat K02 = na7.q1(j5Var.a).K0(Long.valueOf(Z0()));
        if (K02 != null) {
            this.S2 = K02;
        }
        boolean y = hc2.y(3, this.S2);
        a8 a8Var = this.e3;
        if (!y && (((hc2.T(this.S2) && ((chat2 = this.S2) == null || !chat2.megagroup)) || (!hc2.t0(this.S2) && !hc2.y(3, this.S2))) && (!hc2.T(this.S2) || (chat = this.S2) == null || chat.megagroup || !hc2.t0(chat)))) {
            a8Var.setVisibility(8);
        } else {
            a8Var.setVisibility(0);
        }
        fc2 fc2Var3 = this.T2;
        a8 a8Var2 = this.t3;
        a8 a8Var3 = this.s3;
        if (fc2Var3 != null && (groupCall2 = fc2Var3.b) != null && groupCall2.can_change_messages_enabled) {
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
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(k27.B1(this.u2));
        fc2 fc2Var4 = this.T2;
        a8 a8Var4 = this.h3;
        if (fc2Var4 != null && !fc2Var4.k() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            a8Var4.setVisibility(0);
        } else {
            a8Var4.setVisibility(8);
        }
        if (gba.E0) {
            i = 2131232266;
        } else {
            i = 2131232265;
        }
        a8Var4.setIcon(i);
        if (gba.E0) {
            i2 = 2131743038;
        } else {
            i2 = 2131743039;
        }
        a8Var4.setSubtext(k96.M0(i2, null));
        fc2 fc2Var5 = this.T2;
        if (fc2Var5 != null && !fc2Var5.k() && DictationAsr.E()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        a8 a8Var5 = this.i3;
        a8Var5.setVisibility(i3);
        boolean a = q66.a();
        this.j3.a(a, false);
        if (a) {
            i4 = 2131745057;
        } else {
            i4 = 2131745058;
        }
        a8Var5.setSubtext(k96.M0(i4, null));
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
            d75 d75Var = this.W2;
            d75Var.f = z4;
            d75Var.d = 1.0f;
            d75Var.invalidateSelf();
            boolean z5 = this.T2.w;
            w35 w35Var = this.x3;
            if (z5) {
                if (w35Var == null) {
                    w35 w35Var2 = new w35(this, (byte) 7);
                    this.x3 = w35Var2;
                    gl.d3(w35Var2, 1000L);
                }
                a8Var8.setText(k96.M0(2131743081, null));
            } else {
                if (w35Var != null) {
                    gl.r(w35Var);
                    this.x3 = null;
                }
                a8Var8.setText(k96.M0(2131743106, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                a8Var9.j(k96.M0(2131743192, null), 2131232358, null);
            } else {
                a8Var9.j(k96.M0(2131743194, null), 2131232357, null);
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
                    a8Var9.j(k96.M0(2131743192, null), 2131232358, null);
                    a8Var9.setContentDescription(k96.M0(2131743192, null));
                } else {
                    a8Var9.j(k96.M0(2131743194, null), 2131232357, null);
                    a8Var9.setContentDescription(k96.M0(2131743194, null));
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
        if (g1() && ((fc2Var = this.T2) == null || (groupCall = fc2Var.b) == null || !groupCall.creator)) {
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
            long B1 = k27.B1(this.u2);
            boolean D = cf3.D(B1);
            int i7 = j5Var.a;
            if (D) {
                K0 = na7.q1(i7).V1(Long.valueOf(B1));
            } else {
                K0 = na7.q1(i7).K0(Long.valueOf(-B1));
            }
            k5Var.setObject(K0);
        } else {
            k5Var.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 != null && !hc2.W(chat3) && i1() && a8Var.getVisibility() == 8) {
            r7Var.setVisibility(8);
        } else {
            r7Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != gl.L(96.0f)) {
            layoutParams.rightMargin = gl.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(gl.L(48.0f) << 1);
    }

    public final int F0() {
        r65 r65Var = this.J1;
        int childCount = r65Var.getChildCount();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = r65Var.getChildAt(i2);
            if (RecyclerView.R(childAt) >= 0) {
                i = Math.min(i, childAt.getTop());
            }
        }
        return i;
    }

    public final void F1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.F1():void");
    }

    public final boolean G0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            fc2 fc2Var = this.T2;
            if (fc2Var != null && (groupCall = fc2Var.b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return hc2.w(14, this.S2);
    }

    public final void G1() {
        boolean z;
        long j;
        String str;
        fc2 fc2Var;
        if (this.l3 != null) {
            int i = 0;
            if (q66.a() && (fc2Var = this.T2) != null && !fc2Var.k() && s5 == this) {
                z = true;
            } else {
                z = false;
            }
            q66 q66Var = this.l3;
            if (z) {
                if (!q66Var.d) {
                    final q66 q66Var2 = this.l3;
                    Context context = getContext();
                    int i2 = this.n1.a;
                    TLRPC.Chat chat = this.S2;
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = 0;
                    }
                    if (!q66Var2.d) {
                        q66Var2.d = true;
                        final xl3 V = DictationAsr.V(qm3.c(context, j));
                        boolean x = DictationAsr.x();
                        q66Var2.c = x;
                        if (x) {
                            ExecutorService executorService = DictationLid.a;
                            if (DictationAsr.x()) {
                                DictationLid.a(context);
                            }
                        }
                        StringBuilder sb = new StringBuilder("live captions: ");
                        sb.append(V);
                        if (q66Var2.c) {
                            str = ", tinylid";
                        } else {
                            str = "";
                        }
                        ir2.x(sb, str, "Dictation");
                        DictationAsr.i0((vl3) V.b, false, new wl3() {
                            @Override
                            public final void a(boolean z2) {
                                q66 q66Var3 = q66.this;
                                xl3 xl3Var = V;
                                if (!q66Var3.d) {
                                    return;
                                }
                                if (!z2) {
                                    q66Var3.d = false;
                                    return;
                                }
                                NativeInstance.setIncomingAudioCapture(true);
                                Thread thread = new Thread(new kz5(q66Var3, xl3Var, (byte) 7), "LiveCaptions");
                                q66Var3.e = thread;
                                thread.start();
                            }
                        });
                    }
                }
            } else if (q66Var.d) {
                q66 q66Var3 = this.l3;
                if (q66Var3.d) {
                    q66Var3.d = false;
                    Thread thread = q66Var3.e;
                    if (thread != null) {
                        thread.interrupt();
                        q66Var3.e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                t66 t66Var = this.k3;
                t66Var.getClass();
                ArrayList arrayList = new ArrayList(t66Var.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    s66 s66Var = (s66) obj;
                    t66Var.a.remove(s66Var);
                    t66Var.removeView(s66Var);
                }
            }
        }
    }

    public final void H0() {
        if (this.K3) {
            this.K3 = false;
            gl.r(this.q4);
        }
        if (this.L3) {
            this.L3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.v1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void H1(int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.H1(int, boolean):void");
    }

    @Override
    public final void I() {
        LaunchActivity launchActivity;
        fc2 fc2Var;
        fc2 fc2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        e55 e55Var = this.T3;
        if (e55Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((h85) arrayList2.get(i)).f();
                e55Var.removeView((View) arrayList2.get(i));
                ((h85) arrayList2.get(i)).e();
                ((h85) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (e55Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(e55Var);
            }
        }
        q66 q66Var = this.l3;
        if (q66Var.d) {
            q66Var.d = false;
            Thread thread = q66Var.e;
            if (thread != null) {
                thread.interrupt();
                q66Var.e = null;
            }
            try {
                NativeInstance.setIncomingAudioCapture(false);
            } catch (Throwable unused) {
            }
        }
        super.I();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (s5 == this) {
            s5 = null;
        }
        t5 = false;
        VoIPService.audioLevelsCallback = null;
        o85.k(getContext());
        fc2 fc2Var3 = this.T2;
        if (fc2Var3 != null) {
            ArrayList arrayList3 = fc2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            fc2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (this.o2 && (launchActivity = this.b2) != null && !launchActivity.isFinishing() && (fc2Var = this.T2) != null) {
            LaunchActivity launchActivity2 = this.b2;
            j5 j5Var = this.n1;
            long j = fc2Var.b.id;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (fc2Var2 = sharedInstance.groupCall) != null && (groupCall = fc2Var2.b) != null && groupCall.id == j) {
                S0(launchActivity2, j5Var, null, null, false, null);
            } else {
                kk7.e().a(new i65(j, launchActivity2, j5Var), kk7.u2);
            }
        }
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.I0():void");
    }

    public final void I1() {
        if (this.T2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        fc2 fc2Var = this.T2;
        int i = currentTime - fc2Var.b.record_start_date;
        boolean z = fc2Var.w;
        a8 a8Var = this.n3;
        if (z) {
            a8Var.setSubtext(gl.g0(i, false, false));
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
        x55 x55Var = this.K1;
        if ((x55Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (x55Var == null) {
                return;
            }
        }
        int i = 4;
        if (!z) {
            w45 w45Var = this.o4;
            gl.r(w45Var);
            w45Var.run();
            fc2 fc2Var = this.T2;
            r65 r65Var = this.J1;
            if (fc2Var != null && !fc2Var.k()) {
                r65Var.setVisibility(0);
            } else {
                r65Var.setVisibility(4);
            }
            boolean W = hc2.W(this.S2);
            a8 a8Var = this.r3;
            if (W) {
                a8Var.setText(k96.M0(2131743246, null));
            } else {
                a8Var.setText(k96.M0(2131743153, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (s33.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            s33 s33Var = s33.f;
            this.P2 = s33Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * s33Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        D1(true);
        float f3 = 1.0f - f;
        x55Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        q65 q65Var = this.O1;
        q65Var.setAlpha(f);
        q65Var.setScaleX(interpolation);
        q65Var.setScaleY(interpolation);
        v55 v55Var = this.M1;
        v55Var.setScaleX(f3);
        v55Var.setScaleY(f3);
        v55Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        if (f3 != 0.0f) {
            i = 0;
        }
        if (i != x55Var.getVisibility()) {
            x55Var.setVisibility(i);
            v55Var.setVisibility(i);
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
        r55 r55Var = this.y1;
        r55Var.setAlpha(f);
        q55 q55Var = this.z1;
        q55Var.setAlpha(f);
        if (r55Var.getVisibility() != i) {
            r55Var.setVisibility(i);
            q55Var.setVisibility(i);
            if (i == 8) {
                o55 o55Var = this.A1;
                if (o55Var.isFocused()) {
                    o55Var.clearFocus();
                }
            }
        }
    }

    public final void K1(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        dic dicVar = this.s1;
        if (dicVar != null && dicVar.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            r45 r45Var = this.o1;
            boolean z5 = false;
            if (sharedInstance == null) {
                dicVar.c(2131232440, -1, 0, 0.3f, true, k96.M0(2131743195, null), false, z);
                if (!hc2.t0(this.S2) && (!hc2.N(this.S2) || !hc2.w(3, this.S2))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                i75 i75Var = (i75) r45Var.c.get(dicVar);
                if (i75Var != null) {
                    i75Var.d.a(z4, z);
                    dicVar.setEnabled(z4);
                }
                dicVar.b(true, false);
                return;
            }
            i75 i75Var2 = (i75) r45Var.c.get(dicVar);
            if (i75Var2 != null) {
                i75Var2.d.a(true, z);
                dicVar.setEnabled(true);
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
                dicVar.c(2131230916, -1, 0, 0.1f, true, k96.M0(2131743261, null), false, z);
            } else if (z3) {
                dicVar.c(2131230924, -1, 0, 0.3f, true, k96.M0(2131742997, null), false, z);
            } else if (sharedInstance.isHeadsetPlugged()) {
                dicVar.c(2131230919, -1, 0, 0.1f, true, k96.M0(2131743259, null), false, z);
            } else {
                dicVar.c(2131230924, -1, 0, 0.1f, true, k96.M0(2131742997, null), false, z);
            }
            dicVar.b(z3, z);
            Y0();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                i = 2131231091;
            } else {
                i = 2131231173;
            }
            if (this.T1 != i) {
                this.T1 = i;
                gl.L3(this.U1, i);
            }
            dic dicVar2 = this.q1;
            if (dicVar2.getVisibility() == 0) {
                dicVar2.c(0, -1, 0, 1.0f, true, W0(Y0()), false, z);
                if (Y0() != 1) {
                    z5 = true;
                }
                dicVar2.b(z5, z);
            }
        }
    }

    public final void L0() {
        int i;
        t09 t09Var = this.D1;
        if (t09Var != null) {
            float f = this.w3.b.a * this.p5.e;
            t09Var.setAlpha(f);
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
            t09 t09Var2 = this.D1;
            if (!t09Var2.O0 && f == 1.0f) {
                t09Var2.O0 = true;
            }
        }
    }

    public final void L1(boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.L1(boolean, boolean):void");
    }

    public final void M0() {
        boolean z = v5;
        r45 r45Var = this.o1;
        if (z) {
            r45Var.setTranslationX(0.0f);
            r45Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            r45Var.setTranslationX(fm0Var.e * gl.L(94.0f));
            r45Var.setTranslationY(0.0f);
            return;
        }
        r45Var.setTranslationX(0.0f);
        r45Var.setTranslationY(fm0Var.e * gl.L(94.0f));
    }

    public final void M1() {
        boolean z;
        String str;
        float f;
        float f2;
        TLRPC.Chat K0;
        TLRPC.User user;
        c65 c65Var = this.H1;
        if (c65Var != null && this.T2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i = 0;
            for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
                long j = this.T2.P.j(i2);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
                if (!groupCallParticipant.self) {
                    e55 e55Var = this.T3;
                    e55Var.getClass();
                    if (e55Var.x.get(k27.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                        long B1 = k27.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i < 2) {
                            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            int i4 = this.a;
                            if (i3 > 0) {
                                user = na7.q1(i4).V1(Long.valueOf(B1));
                                K0 = null;
                            } else {
                                K0 = na7.q1(i4).K0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || K0 != null) {
                                if (i != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(l7c.k(user, true), new z3c(gl.o()), 0);
                                } else {
                                    spannableStringBuilder.append(K0.title, new z3c(gl.o()), 0);
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
                String J0 = k96.J0(i, "MembersAreSpeakingToast");
                int indexOf = J0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                c65Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z = true;
            } else {
                z = false;
            }
            jia subtitleTextView = c65Var.getSubtitleTextView();
            if (i1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            subtitleTextView.k(k96.G(this.T2.b.participants_count + ((!this.I1.M && VoIPService.getSharedInstance() != null) ? !VoIPService.getSharedInstance().isJoined() : 0), str, new Object[0]));
            if (z != this.m4) {
                this.m4 = z;
                c65Var.invalidate();
                float f3 = 0.0f;
                c65Var.getSubtitleTextView().setPivotX(0.0f);
                c65Var.getSubtitleTextView().setPivotY(c65Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = c65Var.getSubtitleTextView().animate();
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
                gl.R3(c65Var.getAdditionalSubtitleTextView(), this.m4);
            }
        }
    }

    public final void N0() {
        boolean z = v5;
        a55 a55Var = this.e4;
        if (z) {
            a55Var.setTranslationX(0.0f);
            a55Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            a55Var.setTranslationX(fm0Var.e * gl.L(94.0f));
            a55Var.setTranslationY(0.0f);
            return;
        }
        a55Var.setTranslationX(0.0f);
        a55Var.setTranslationY(fm0Var.e * gl.L(94.0f));
    }

    public final void N1(boolean z) {
        fc2 fc2Var = this.T2;
        v45 v45Var = this.X2;
        if (fc2Var == null) {
            if (hc2.W(this.S2)) {
                v45Var.b(k96.M0(2131743220, null), z);
                return;
            } else {
                v45Var.b(k96.M0(2131743099, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(fc2Var.b.title);
        c65 c65Var = this.H1;
        if (!isEmpty) {
            if (!this.T2.b.title.equals(c65Var.getTitle())) {
                fc2 fc2Var2 = this.T2;
                c65 c65Var2 = this.H1;
                if (z) {
                    c65Var2.N(fc2Var2.b.title, true, 180L, null);
                    c65Var.getTitleTextView().setOnClickListener(new u35(this, (byte) 8));
                } else {
                    c65Var2.setTitle(fc2Var2.b.title);
                }
                v45Var.b(this.T2.b.title, z);
            }
        } else {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(c65Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                c65 c65Var3 = this.H1;
                if (z) {
                    c65Var3.N(chat2.title, true, 180L, null);
                    c65Var.getTitleTextView().setOnClickListener(new u35(this, (byte) 9));
                } else {
                    c65Var3.setTitle(chat2.title);
                }
                if (hc2.W(this.S2)) {
                    if (i1()) {
                        v45Var.b(this.S2.title, z);
                    } else {
                        v45Var.b(k96.M0(2131743205, null), z);
                    }
                } else {
                    v45Var.b(k96.M0(2131743064, null), z);
                }
            } else if (this.S2 == null) {
                c65Var.setTitle(k96.M0(2131751811, null));
                v45Var.b(k96.M0(2131751811, null), z);
            }
        }
        jia titleTextView = c65Var.getTitleTextView();
        if (this.T2.w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new e75(titleTextView));
                TextView textView = v45Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new e75(textView), (Drawable) null);
                TextView nextTextView = v45Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new e75(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            v45Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            v45Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void O0() {
        float L;
        int i;
        float f = this.q5.f;
        fyc fycVar = this.w3;
        float f2 = -((fycVar.d() - this.b.getPaddingBottom()) + f + (gl.L(68.0f) * this.p5.e) + gl.L(10.0f));
        if (v5) {
            L = (1.0f - this.r5.e) * gl.L(-91.0f);
        } else if (u5) {
            L = 0.0f;
        } else {
            L = ((this.o5.e * gl.L(94.0f)) - (gl.L(104.0f) * this.T3.c)) - gl.L(91.0f);
        }
        float R1 = gl.R1(L, f2, fycVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - gl.L(250.0f));
        t66 t66Var = this.k3;
        if (t66Var != null) {
            i = t66Var.getContentHeight();
            t66Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f3 = i;
        b85 b85Var = this.V1;
        b85Var.setTranslationY(R1 - f3);
        b85Var.setVisibleHeight((int) Math.max(0.0f, max - f3));
    }

    public final void O1() {
        float f;
        q11 q11Var;
        boolean z;
        if (this.F != null) {
            int L = gl.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                int L2 = (L - this.t0) - gl.L(14.0f);
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / L2);
                f2 -= (int) ((a.getCurrentActionBarHeight() - L2) * f);
            } else {
                f = 0.0f;
            }
            float paddingTop = f2 + this.b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            c65 c65Var = this.H1;
            frameLayout.setTranslationY(gl.R1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + gl.L(10.0f), c65Var.getY() + (-this.F.getTop()) + c65Var.getHeight(), f));
            m21 m21Var = m21.w;
            if (m21Var != null && (q11Var = m21Var.e) != null && q11Var.getParent() != null && q11Var.getParent().getParent() == this.F) {
                if (f > 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                q11Var.setTop(z);
            }
        }
    }

    public final void P0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * gl.L(64.0f)));
        }
    }

    public final void Q0() {
        boolean z;
        float f = this.p5.e;
        float R1 = gl.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(gl.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        boolean z2 = false;
        if (f > 0.9f) {
            z = true;
        } else {
            z = false;
        }
        imageView.setClickable(z);
        float f2 = 1.0f - f;
        float R12 = gl.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(gl.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        if (f2 > 0.9f) {
            z2 = true;
        }
        imageView2.setClickable(z2);
    }

    public final void R0() {
        h85 h85Var = this.O4;
        if (h85Var != null) {
            h85Var.a.setRoundCorners(gl.L(8.0f));
            h85 h85Var2 = this.O4;
            h85Var2.h = false;
            h85Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        y95 y95Var = this.M4;
        if (y95Var != null && !this.Q4 && y95Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        y95 y95Var2 = this.M4;
        if (y95Var2 != null) {
            y95Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        m75 m75Var = this.P4;
        if (m75Var != null) {
            m75Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    @Override
    public final ArrayList S() {
        return new ArrayList();
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
            int i2 = bkb.Ah;
            iArr[0] = bkb.w0(null, i2, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.Bh, false), bkb.w0(null, bkb.ph, false));
            iArr[2] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = bkb.w0(null, bkb.zh, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.oh, false), bkb.w0(null, bkb.ph, false));
            iArr[2] = bkb.w0(null, bkb.nh, false);
        } else if (i == 1) {
            iArr[0] = bkb.w0(null, bkb.wh, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.rh, false), bkb.w0(null, bkb.sh, false));
            iArr[2] = bkb.w0(null, bkb.qh, false);
        } else if (h1(i)) {
            iArr[0] = bkb.w0(null, bkb.ai, false);
            iArr[1] = bkb.w0(null, bkb.bi, false);
            iArr[2] = bkb.w0(null, bkb.ci, false);
        } else {
            int i3 = bkb.Ah;
            iArr[0] = bkb.w0(null, i3, false);
            iArr[1] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.Ch, false), bkb.w0(null, bkb.Dh, false));
            iArr[2] = gl.R0(this.N3, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, i3, false));
        }
        if (h1(i)) {
            iArr[3] = bm2.f(0.5f, bkb.w0(null, bkb.Yh, false), bkb.w0(null, bkb.ai, false));
        } else if (i == 1) {
            iArr[3] = bm2.f(0.75f, bkb.w0(null, bkb.rh, false), bm2.f(0.5f, bkb.w0(null, bkb.vh, false), bkb.w0(null, bkb.xh, false)));
        } else {
            iArr[3] = bm2.f(0.5f, bkb.w0(null, bkb.zh, false), bkb.w0(null, bkb.yh, false));
        }
    }

    public final void V0(gc2 gc2Var) {
        gc2 gc2Var2;
        if (gc2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            e55 e55Var = this.T3;
            if (e55Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            r65 r65Var = this.J1;
            int i = 0;
            if (z) {
                if (onPreDrawListener != null) {
                    r65Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                ArrayList arrayList = new ArrayList();
                r95 r95Var = this.g4;
                ArrayList arrayList2 = this.R3;
                ArrayList arrayList3 = this.S3;
                if (gc2Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        h85 h85Var = (h85) arrayList3.get(i2);
                        o75 o75Var = h85Var.c;
                        if (o75Var != null) {
                            o75Var.setRenderer(null);
                            m75 m75Var = h85Var.d;
                            if (m75Var != null) {
                                m75Var.setRenderer(null);
                            }
                            o75 o75Var2 = h85Var.e;
                            if (o75Var2 != null) {
                                o75Var2.setRenderer(null);
                            }
                            arrayList.add(h85Var.x);
                            h85Var.b(false);
                            h85Var.animate().alpha(0.0f).setListener(new b65(this, h85Var, (byte) 0));
                        }
                    }
                    this.F4 = false;
                    r95Var.H(this.f4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        h85 h85Var2 = (h85) arrayList3.get(i3);
                        if (h85Var2.e != null && ((gc2Var2 = h85Var2.x) == null || !gc2Var2.equals(gc2Var))) {
                            arrayList.add(h85Var2.x);
                            h85Var2.b(false);
                            m75 m75Var2 = h85Var2.d;
                            if (m75Var2 != null) {
                                m75Var2.setRenderer(null);
                            }
                            o75 o75Var3 = h85Var2.c;
                            if (o75Var3 != null) {
                                o75Var3.setRenderer(null);
                            }
                            h85Var2.animate().alpha(0.0f).setListener(new b65(this, h85Var2, (byte) 1));
                        }
                    }
                    this.F4 = true;
                    r95Var.r = false;
                    if (!arrayList.isEmpty()) {
                        gl.c3(new vc4(this, arrayList, (byte) 23));
                    }
                }
                ViewTreeObserver viewTreeObserver = r65Var.getViewTreeObserver();
                so1 so1Var = new so1(this, gc2Var, !e55Var.b);
                this.i4 = so1Var;
                viewTreeObserver.addOnPreDrawListener(so1Var);
                return;
            }
            if (onPreDrawListener != null) {
                r65Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            if (gc2Var != null) {
                a55 a55Var = this.e4;
                if (a55Var.getVisibility() != 0) {
                    a55Var.setVisibility(0);
                    n75 n75Var = this.h4;
                    n75Var.G(a55Var, false);
                    this.l2 = true;
                    if (!e55Var.b) {
                        ArrayList arrayList4 = n75Var.e;
                        t26 t26Var = (t26) a55Var.getLayoutManager();
                        if (t26Var != null) {
                            while (true) {
                                if (i >= arrayList4.size()) {
                                    break;
                                } else if (((gc2) arrayList4.get(i)).equals(gc2Var)) {
                                    t26Var.g1(i, gl.L(13.0f));
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = r65Var.getViewTreeObserver();
                    ni3 ni3Var = new ni3(this, gc2Var, (byte) 1);
                    this.i4 = ni3Var;
                    viewTreeObserver2.addOnPreDrawListener(ni3Var);
                    return;
                }
                e55Var.h(gc2Var);
                gl.V3(a55Var);
            } else if (r65Var.getVisibility() != 0) {
                r65Var.setVisibility(0);
                D0(false);
                this.l2 = true;
                ViewTreeObserver viewTreeObserver3 = r65Var.getViewTreeObserver();
                g65 g65Var = new g65(this, (byte) 0);
                this.i4 = g65Var;
                viewTreeObserver3.addOnPreDrawListener(g65Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = r65Var.getViewTreeObserver();
                g65 g65Var2 = new g65(this, (byte) 1);
                this.i4 = g65Var2;
                viewTreeObserver4.addOnPreDrawListener(g65Var2);
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
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(Z0()));
        if (K0 != null && !hc2.t0(K0)) {
            TLRPC.ChatFull L0 = na7.q1(i2).L0(Z0());
            String K = hc2.K(this.S2, false);
            if (!TextUtils.isEmpty(K)) {
                str = ls6.o(na7.q1(i2).N2, "/", K, new StringBuilder());
            } else if (L0 != null && (tL_chatInviteExported = L0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = na7.j1(this.S2);
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new mi1(this, L0, z, (byte) 4));
                return;
            }
            o1(null, str, true, z);
        } else if (this.T2 != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                fc2 fc2Var = this.T2;
                exportgroupcallinvite.call = fc2Var.h(fc2Var.a);
                if (i3 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                exportgroupcallinvite.can_self_unmute = z2;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new c45(this, i3, z, (byte) 0));
            }
        }
    }

    public final UndoView c1() {
        if (!v5) {
            e55 e55Var = this.T3;
            if (e55Var.b) {
                return e55Var.getUndoView();
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
            fc2 fc2Var = this.T2;
            if (fc2Var == null) {
                fc2 fc2Var2 = sharedInstance.groupCall;
                this.T2 = fc2Var2;
                this.h4.c = fc2Var2;
                this.T3.setGroupCall(fc2Var2);
                fc2Var = this.T2;
                this.g4.c = fc2Var;
            }
            b85 b85Var = this.V1;
            if (b85Var != null) {
                b85Var.E0(this.n1.a, fc2Var.h(false));
            }
            this.H1.setTitleRightMargin(gl.L(48.0f) << 1);
            ArrayList arrayList = this.T2.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i2)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            q65 q65Var = this.O1;
            if (q65Var != null && q65Var.getVisibility() == 0) {
                this.t1.c(2131230918, -1, bkb.w0(null, bkb.th, false), 0.3f, false, k96.M0(2131743122, null), false, true);
                K1(true);
                if (hc2.W(this.S2)) {
                    i = 2131743239;
                } else {
                    i = 2131743138;
                }
                this.r3.setText(k96.M0(i, null));
                r65 r65Var = this.J1;
                r65Var.setVisibility(0);
                r7 r7Var = this.c3;
                r7Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r65Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r65Var, View.TRANSLATION_Y, gl.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(q65Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q65Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q65Var, property, 0.0f);
                jia jiaVar = this.N1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(jiaVar, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(jiaVar, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jiaVar, property, 0.0f);
                jia jiaVar2 = this.P1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(jiaVar2, property2, 0.0f), ObjectAnimator.ofFloat(jiaVar2, property3, 0.0f), ObjectAnimator.ofFloat(jiaVar2, property, 0.0f), ObjectAnimator.ofFloat(r7Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(r7Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(s33.g);
                animatorSet.addListener(new h65(this, (byte) 0));
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
        gc2 gc2Var;
        boolean z;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i7 = kk7.v2;
        r65 r65Var = this.J1;
        String[] strArr = null;
        int i8 = 0;
        if (i == i7) {
            Long l = (Long) objArr[1];
            fc2 fc2Var = this.T2;
            if (fc2Var != null && fc2Var.b.id == l.longValue()) {
                fc2 fc2Var2 = this.T2;
                if (fc2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i9 = (this.m2 > 0L ? 1 : (this.m2 == 0L ? 0 : -1));
                j5 j5Var = this.n1;
                if (i9 == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !fc2Var2.k())) {
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
                        fa4.g(th, true);
                    }
                    this.m2 = SystemClock.elapsedRealtime();
                    gl.d3(new w35(this, (byte) 3), 3000L);
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
                int childCount = r65Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = r65Var.getChildAt(i10);
                    if (childAt instanceof y95) {
                        ((y95) childAt).a(true, false);
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
                                ArrayList arrayList = na7.q1(j5Var.a).y;
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
                            if (cf3.D(longValue)) {
                                TLRPC.User V1 = na7.q1(j5Var.a).V1(l2);
                                if (V1 != null) {
                                    if (this.T2.b.participants_count < 250 || l7c.y(V1) || V1.verified || i8 != 0) {
                                        c1().k(0L, 44, V1, this.S2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-longValue));
                            if (K0 != null) {
                                if (this.T2.b.participants_count < 250 || !hc2.r0(K0) || K0.verified || i8 != 0) {
                                    c1().k(0L, 44, K0, this.S2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i == kk7.x2) {
            e55 e55Var = this.T3;
            if (e55Var.b && this.T2 != null) {
                boolean c = e55Var.c();
                fc2 fc2Var3 = this.T2;
                if (fc2Var3 != null && e55Var.b && (gc2Var = e55Var.e) != null && fc2Var3.d.f(k27.B1(gc2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    gc2 gc2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i8 >= arrayList2.size()) {
                            break;
                        }
                        gc2 gc2Var3 = (gc2) arrayList2.get(i8);
                        if (this.T2.P.g(null, k27.B1(gc2Var3.a.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = gc2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && e55Var.d != k27.B1(groupCallParticipant3.peer)) {
                                gc2Var2 = gc2Var3;
                            }
                        }
                        i8++;
                    }
                    if (gc2Var2 != null) {
                        V0(gc2Var2);
                    }
                }
            }
            e55Var.setVisibleParticipant(true);
            M1();
        } else if (i == kk7.P4) {
            w1(((Float) objArr[0]).floatValue());
        } else if (i == kk7.L0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (hc2.W(this.S2)) {
                        M0 = k96.M0(2131743210, null);
                    } else {
                        M0 = k96.M0(2131743077, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = b00.j(new StringBuilder(k96.M0(2131751093, null)), "\n", str);
                } else if (hc2.W(this.S2)) {
                    M0 = k96.M0(2131743236, null);
                } else {
                    M0 = k96.M0(2131743128, null);
                }
                AlertDialog$Builder K = ij.K(getContext(), k96.M0(2131743064, null), M0);
                K.i(new b45(this, (byte) 1));
                try {
                    K.o();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        } else if (i == kk7.C2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == Z0()) {
                E1();
                L1(isShowing(), false);
            }
            long B1 = k27.B1(this.u2);
            fc2 fc2Var4 = this.T2;
            if (fc2Var4 != null && chatFull.id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) fc2Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                D0(true);
                gl.V3(r65Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt2 = this.u4.getChildAt(i8);
                        if ((childAt2 instanceof a8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            a8 a8Var = (a8) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i5 = 2131743264;
                            } else {
                                i5 = 2131743174;
                            }
                            String M02 = k96.M0(i5, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i6 = 2131232048;
                            } else {
                                i6 = 2131232190;
                            }
                            a8Var.j(M02, i6, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == kk7.t1) {
            if (((Long) objArr[0]).longValue() == Z0()) {
                E1();
                L1(isShowing(), false);
            }
        } else if (i == kk7.A2) {
            int childCount2 = r65Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i8 < childCount2) {
                s49 G = r65Var.G(r65Var.getChildAt(i8));
                if (G != null) {
                    View view = G.a;
                    if (view instanceof y95) {
                        y95 y95Var = (y95) view;
                        if (y95Var.getParticipant() != null) {
                            y95Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i8++;
            }
        } else if (i == kk7.D0) {
            Long l3 = (Long) objArr[0];
            long B12 = k27.B1(this.u2);
            if (this.T2 != null && B12 == l3.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                D0(true);
                gl.V3(r65Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt3 = this.u4.getChildAt(i8);
                        if ((childAt3 instanceof a8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            a8 a8Var2 = (a8) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i3 = 2131743265;
                            } else {
                                i3 = 2131743175;
                            }
                            String M03 = k96.M0(i3, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i4 = 2131232048;
                            } else {
                                i4 = 2131232190;
                            }
                            a8Var2.j(M03, i4, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == kk7.i0) {
            D0(true);
            gl.V3(r65Var);
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = na7.q5;
            if ((intValue & 16) != 0) {
                D0(true);
            } else if ((intValue & 524288) == 0) {
                return;
            }
            gl.V3(r65Var);
        } else if (i == kk7.y2) {
            a65 a65Var = this.t2;
            if (a65Var != null) {
                a65Var.a(true, true);
            }
            E1();
        } else if (i == kk7.T3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            pc pcVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            pcVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        rb5 rb5Var = this.y3;
        if (rb5Var != null) {
            rb5Var.dismiss();
        }
        this.l2 = true;
        kk7.e().k(kk7.E2, new Object[0]);
        j5 j5Var = this.n1;
        int i = j5Var.a;
        int i2 = j5Var.a;
        kk7.f(i).n(this, kk7.L0);
        kk7.f(i2).n(this, kk7.v2);
        kk7.f(i2).n(this, kk7.S);
        kk7.f(i2).n(this, kk7.t1);
        kk7.f(i2).n(this, kk7.A2);
        kk7.f(i2).n(this, kk7.D0);
        kk7.f(i2).n(this, kk7.i0);
        kk7.f(i2).n(this, 2);
        kk7.f(i2).n(this, kk7.y2);
        kk7.f(i2).n(this, kk7.x2);
        kk7.f(i2).n(this, kk7.T3);
        kk7.e().n(this, kk7.P4);
        kk7.e().n(this, kk7.C2);
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
            TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(j));
            if (V1 != null) {
                hd[] hdVarArr = {new hd(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                fc2 fc2Var = this.T2;
                invitetogroupcall.call = fc2Var.h(fc2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = V1.id;
                tL_inputUser.access_hash = V1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(j5Var.a).sendRequest(invitetogroupcall, new i45(this, j, hdVarArr, V1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    gl.d3(new j45(this, hdVarArr, sendRequest, (byte) 0), 500L);
                }
            }
        }
    }

    public final boolean f1() {
        float f;
        int L = gl.L(74.0f);
        float f2 = this.s2 - L;
        if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - gl.L(14.0f)));
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
        fc2 fc2Var = this.T2;
        if (fc2Var != null && fc2Var.b.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j0() {
        t5 = true;
        kk7.e().k(kk7.E2, new Object[0]);
        o85.k(getContext());
        return false;
    }

    public final void j1(LaunchActivity launchActivity, fc2 fc2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final ec2 ec2Var;
        if (view instanceof o75) {
            V0(((o75) view).getParticipant());
        } else if (view instanceof y95) {
            A1((y95) view);
        } else {
            boolean z2 = view instanceof p75;
            Collection collection = null;
            c75 c75Var = this.I1;
            if (z2) {
                p75 p75Var = (p75) view;
                if (p75Var.getUser() != null) {
                    if (g1()) {
                        int i2 = i - c75Var.n;
                        if (i2 >= 0 && i2 < this.T2.m.size()) {
                            l = (Long) this.T2.m.get(i - c75Var.n);
                        } else {
                            int i3 = i - c75Var.s;
                            if (i3 >= 0 && i3 < this.T2.l.size()) {
                                l = (Long) this.T2.l.get(i - c75Var.s);
                            } else {
                                int i4 = i - c75Var.f;
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
                                if (z && (ec2Var = (ec2) this.T2.k.get(l)) != null) {
                                    cs5 G = cs5.G(this.c, this.J0, p75Var);
                                    G.k(2131232134, k96.M0(2131749268, null), new Runnable(this) {
                                        public final h75 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            ec2 ec2Var2 = ec2Var;
                                            final h75 h75Var = this.b;
                                            h75Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = ec2Var2.a;
                                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            h75 h75Var2 = h75Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    fc2 fc2Var2 = h75Var.T2;
                                                    if (fc2Var2 != null) {
                                                        ec2Var2.b = false;
                                                        fc2Var2.k.put(l2, ec2Var2);
                                                        h75Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = ec2Var2.a;
                                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            h75 h75Var2 = h75Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(ec2Var2.a));
                                                    na7.q1(h75Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                                    fc2 fc2Var3 = h75Var.T2;
                                                    if (fc2Var3 != null) {
                                                        fc2Var3.j.remove(l2);
                                                        h75Var.T2.n.remove(l2);
                                                        h75Var.T2.k.remove(l2);
                                                        h75Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, ec2Var.a());
                                    G.b(2131232333, k96.M0(2131749279, null), new Runnable(this) {
                                        public final h75 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            ec2 ec2Var2 = ec2Var;
                                            final h75 h75Var = this.b;
                                            h75Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = ec2Var2.a;
                                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            h75 h75Var2 = h75Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    fc2 fc2Var2 = h75Var.T2;
                                                    if (fc2Var2 != null) {
                                                        ec2Var2.b = false;
                                                        fc2Var2.k.put(l2, ec2Var2);
                                                        h75Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = ec2Var2.a;
                                                    ConnectionsManager.getInstance(h75Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            h75 h75Var2 = h75Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        na7.q1(h75Var2.a).R3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        h75Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(ec2Var2.a));
                                                    na7.q1(h75Var.a).V(arrayList2, null, null, 0L, 0, true, 0);
                                                    fc2 fc2Var3 = h75Var.T2;
                                                    if (fc2Var3 != null) {
                                                        fc2Var3.j.remove(l2);
                                                        h75Var.T2.n.remove(l2);
                                                        h75Var.T2.k.remove(l2);
                                                        h75Var.D0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    G.X(bkb.c0(gl.L(8.0f), gl.L(8.0f), this.w2.getColor()));
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
                    bundle.putLong("user_id", p75Var.getUser().id);
                    if (p75Var.a.getImageReceiver().E()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    this.b2.t0(new ProfileActivity(bundle, null));
                    dismiss();
                }
            } else if (i == c75Var.x) {
                if (hc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && hc2.t0(chat)) {
                    a1(false);
                    return;
                }
                j5 j5Var = this.n1;
                TLRPC.ChatFull L0 = na7.q1(j5Var.a).L0(Z0());
                if (L0 != null) {
                    this.q2 = false;
                    Context context = getContext();
                    int i5 = j5Var.a;
                    TLRPC.Chat chat2 = this.S2;
                    fc2 fc2Var2 = this.T2;
                    rb5 rb5Var = new rb5(context, i5, chat2, L0, fc2Var2.d, fc2Var2.n);
                    this.y3 = rb5Var;
                    rb5Var.setOnDismissListener(new b45(this, (byte) 2));
                    rb5 rb5Var2 = this.y3;
                    rb5Var2.a2 = new n45(this);
                    rb5Var2.show();
                }
            } else if (i == c75Var.y) {
                fc2 fc2Var3 = this.T2;
                if (fc2Var3 != null && fc2Var3.b != null) {
                    s7c s7cVar = new s7c(launchActivity, this.a, new e53());
                    fc2 fc2Var4 = this.T2;
                    if (fc2Var4 != null) {
                        collection = (Collection) Collection.EL.stream(fc2Var4.e).map(new xz((byte) 8)).collect(Collectors.toSet());
                    }
                    s7cVar.s2.addAll(collection);
                    s7cVar.f1(false, true);
                    s7cVar.r2 = new w35(this, (byte) 5);
                    s7cVar.f1(false, true);
                    s7cVar.t2 = new ae2(this, fc2Var, (byte) 25);
                    s7cVar.show();
                }
            } else if (i == c75Var.E) {
                p1();
            }
        }
    }

    public final void k1(fx0 fx0Var, hd hdVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        long j;
        if (!this.q2) {
            d dVar = (d) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (dVar instanceof mu1) {
                boolean U9 = ((mu1) dVar).U9();
                this.q2 = true;
                this.r2 = true;
                rg rgVar = new rg(fx0Var, editTextBoldCursor, z, hdVar, (byte) 19);
                if (U9) {
                    j = 200;
                } else {
                    j = 0;
                }
                gl.d3(rgVar, j);
                return;
            }
            this.q2 = true;
            this.r2 = true;
            if (fx0Var != null) {
                fx0Var.v0(true);
            } else if (hdVar != null) {
                hdVar.k(true);
            }
            if (z) {
                gl.d3(new l(editTextBoldCursor, (byte) 5), 100L);
            }
        }
    }

    public final void m1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(false);
        }
        p65 p65Var = this.E1;
        brc brcVar = p65Var.w;
        if (brcVar != null) {
            brcVar.b(false);
        }
        p65Var.G = true;
        this.A1.r();
    }

    public final void n1() {
        w5 = false;
        this.I1.f();
        a55 a55Var = this.e4;
        if (a55Var.getVisibility() == 0) {
            this.h4.G(a55Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(true);
        }
        p65 p65Var = this.E1;
        brc brcVar = p65Var.w;
        if (brcVar != null) {
            brcVar.b(true);
        }
        p65Var.G = false;
        this.A1.s();
    }

    public final void o1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.o1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override
    public final void onAudioSettingsChanged() {
        K1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            w1(0.0f);
        }
        r65 r65Var = this.J1;
        if (r65Var.getVisibility() == 0) {
            gl.V3(r65Var);
        }
        a55 a55Var = this.e4;
        if (a55Var.getVisibility() == 0) {
            gl.V3(a55Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((h85) arrayList.get(i)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        a65 a65Var = this.t2;
        if (a65Var != null) {
            a65Var.a(false, false);
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
            ((h85) arrayList.get(i)).j(true);
        }
        a65 a65Var = this.t2;
        if (a65Var != null && VoIPService.getSharedInstance() != null) {
            a65Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 2) {
            O0();
            M0();
            N0();
            float f3 = 1.0f - this.o5.e;
            r45 r45Var = this.o1;
            r45Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            r45Var.invalidate();
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

    @Override
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(bkb.w0(null, bkb.Eh, false));
            }
            r7 r7Var = this.b3;
            if (r7Var != null) {
                int i = bkb.Xg;
                r7Var.O(bkb.w0(null, i, false), false);
                r7Var.O(bkb.w0(null, i, false), true);
                r7Var.setPopupItemsSelectorColor(bkb.w0(null, bkb.Ug, false));
            }
            int w0 = bkb.w0(null, bkb.Xg, false);
            z1(this.s3, w0);
            z1(this.t3, w0);
            z1(this.g3, w0);
            z1(this.h3, w0);
            z1(this.i3, w0);
            z1(this.r3, bkb.w0(null, bkb.lh, false));
            z1(this.e3, w0);
            z1(this.f3, w0);
            z1(this.m3, w0);
            z1(this.n3, w0);
            z1(this.o3, w0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p1() {
        fc2 fc2Var = this.T2;
        if (fc2Var != null && fc2Var.b != null) {
            hd hdVar = new hd(3, null, getContext());
            hdVar.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.T2.b;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new en0(this, hdVar, exportgroupcallinvite, (byte) 29));
        }
    }

    public final void r1(org.telegram.tgnet.TLRPC.GroupCallParticipant r34, final long r35, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.r1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void s1(boolean r18, defpackage.y95 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.s1(boolean, y95):void");
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
        fc2 fc2Var = this.T2;
        if (fc2Var != null && fc2Var.b != null && (h = fc2Var.h(fc2Var.a)) != null) {
            fc2 fc2Var2 = this.T2;
            long j2 = fc2Var2.b.id;
            TLRPC.Peer peer = fc2Var2.J;
            if (peer != null) {
                j = cf3.n(peer);
            } else {
                j = y6c.h(this.a).n;
            }
            GroupCallMessagesController.getInstance(this.a).sendCallMessage(j, tL_textWithEntities, j2, h);
        }
    }

    public final void u1(float f) {
        float f2;
        int i;
        int i2;
        this.N3 = f;
        e55 e55Var = this.T3;
        if (e55Var == null) {
            f2 = 0.0f;
        } else {
            f2 = e55Var.c;
        }
        float max = Math.max(f, f2);
        int i3 = bkb.Zg;
        int w0 = bkb.w0(null, i3, false);
        int i4 = bkb.Wg;
        int R0 = gl.R0(f, 1.0f, w0, bkb.w0(null, i4, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = gl.R0(max, 1.0f, bkb.w0(null, i3, false), bkb.w0(null, i4, false));
        int R02 = gl.R0(f, 1.0f, bkb.w0(null, bkb.ah, false), bkb.w0(null, bkb.jh, false));
        pc pcVar = this.i2;
        if (pcVar != null) {
            pcVar.b = R02;
            sb sbVar = (sb) pcVar.i;
            if (sbVar != null) {
                sbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        r65 r65Var = this.J1;
        r65Var.setGlowColor(R02);
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
        int R03 = gl.R0(f, 1.0f, bkb.w0(null, bkb.th, false), bkb.w0(null, bkb.uh, false));
        this.t1.a(R03, R03);
        int R04 = gl.R0(f, 1.0f, bkb.w0(null, bkb.bh, false), bkb.w0(null, bkb.eh, false));
        int R05 = gl.R0(f, 1.0f, bkb.w0(null, bkb.ch, false), bkb.w0(null, bkb.hh, false));
        int v0 = bkb.v0(bkb.Ei, this.J0);
        int childCount = r65Var.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = r65Var.getChildAt(i6);
            if (childAt instanceof s95) {
                s95 s95Var = (s95) childAt;
                if (g1()) {
                    s95Var.a(v0, v0);
                } else {
                    s95Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof y95;
                c65 c65Var = this.H1;
                if (z) {
                    y95 y95Var = (y95) childAt;
                    if (c65Var.getTag() != null) {
                        i2 = bkb.hh;
                    } else {
                        i2 = bkb.ch;
                    }
                    y95Var.f(i2, R05);
                } else if (childAt instanceof p75) {
                    p75 p75Var = (p75) childAt;
                    if (c65Var.getTag() != null) {
                        i = bkb.hh;
                    } else {
                        i = bkb.ch;
                    }
                    p75Var.a(i, R05);
                }
            }
        }
        this.b.invalidate();
        r65Var.invalidate();
        this.c.invalidate();
    }

    public final void v1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        fc2 fc2Var = this.T2;
        togglegroupcallsettings.call = fc2Var.h(fc2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        D1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        co3 co3Var = Utilities.d;
        Objects.requireNonNull(co3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new ge2(co3Var, (byte) 0), new g45(this, (byte) 0));
    }

    public final void w1(float f) {
        r65 r65Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        s49 K;
        f = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        fc2 fc2Var = this.T2;
        if (fc2Var != null && (r65Var = this.J1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(k27.B1(this.u2))) != null) {
            e55 e55Var = this.T3;
            if (!e55Var.b) {
                if (this.l2) {
                    arrayList = this.x2;
                } else {
                    arrayList = this.T2.g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = r65Var.K(indexOf + this.I1.d)) != null) {
                    View view = K.a;
                    if (view instanceof y95) {
                        ((y95) view).setAmplitude(f * 15.0f);
                        if (view == this.M4 && !this.d4) {
                            this.b.invalidate();
                        }
                    }
                }
            } else {
                int i = 0;
                while (true) {
                    a55 a55Var = this.e4;
                    if (i >= a55Var.getChildCount()) {
                        break;
                    }
                    m75 m75Var = (m75) a55Var.getChildAt(i);
                    if (k27.B1(m75Var.getParticipant().peer) == k27.B1(groupCallParticipant.peer)) {
                        m75Var.setAmplitude(f * 15.0f);
                    }
                    i++;
                }
            }
            e55Var.i(groupCallParticipant, f * 15.0f);
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
        r65 r65Var;
        int L;
        int i;
        float f2;
        this.s2 = f;
        this.J1.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) r65Var.getLayoutParams()).topMargin));
        float L2 = f - gl.L(74.0f);
        int i2 = ((this.t0 + L2) > (a.getCurrentActionBarHeight() << 1) ? 1 : ((this.t0 + L2) == (a.getCurrentActionBarHeight() << 1) ? 0 : -1));
        e55 e55Var = this.T3;
        y45 y45Var = this.Y2;
        v45 v45Var = this.X2;
        if (i2 < 0) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L2) - this.t0) / (a.getCurrentActionBarHeight() + ((L - this.t0) - gl.L(14.0f))));
            if (gl.O1()) {
                f2 = 17.0f;
            } else {
                f2 = 13.0f;
            }
            i = (int) (gl.L(f2) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                u1(Math.min(1.0f, min));
            }
            float v = oo1.v(min, 0.1f, 1.2f, 1.0f);
            v45Var.setScaleX(Math.max(0.9f, v));
            v45Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            v45Var.setAlpha((1.0f - e55Var.c) * Math.max(0.0f, f3));
            y45Var.setScaleX(Math.max(0.9f, v));
            y45Var.setScaleY(Math.max(0.9f, v));
            y45Var.setAlpha((1.0f - e55Var.c) * Math.max(0.0f, f3));
        } else {
            v45Var.setScaleX(1.0f);
            v45Var.setScaleY(1.0f);
            v45Var.setAlpha(1.0f - e55Var.c);
            y45Var.setScaleX(1.0f);
            y45Var.setScaleY(1.0f);
            y45Var.setAlpha(1.0f - e55Var.c);
            if (this.N3 > 1.0E-4f) {
                u1(0.0f);
            }
            i = 0;
        }
        O0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(44.0f)) - f4));
        x55 x55Var = this.K1;
        if (x55Var != null) {
            x55Var.setTranslationY(Math.max(gl.L(4.0f), (f - gl.L(44.0f)) - f4));
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
    public final void F(float f, int i) {
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
