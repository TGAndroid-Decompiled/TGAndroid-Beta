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
import android.widget.EditText;
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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.CallAudioDevice;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j95 extends nx0 implements fn7, VoIPService.StateListener, s84 {
    public static j95 s5;
    public static boolean t5;
    public static boolean u5;
    public static boolean v5;
    public static boolean w5;
    public final q75 A1;
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
    public i49 D1;
    public final b29 D2;
    public final i95[] D3;
    public final d75 D4;
    public final r85 E1;
    public final b29 E2;
    public float E3;
    public boolean E4;
    public final in F1;
    public boolean F2;
    public i95 F3;
    public boolean F4;
    public final z65 G1;
    public final gk0 G2;
    public i95 G3;
    public RenderNode G4;
    public final e85 H1;
    public final gk0 H2;
    public long H3;
    public float H4;
    public final e95 I1;
    public float I2;
    public float I3;
    public final String[] I4;
    public final t85 J1;
    public float J2;
    public float J3;
    public ObjectAnimator J4;
    public final z75 K1;
    public float K2;
    public boolean K3;
    public ObjectAnimator K4;
    public final TextView L1;
    public RadialGradient L2;
    public boolean L3;
    public final u75 L4;
    public final x75 M1;
    public final Matrix M2;
    public int M3;
    public zb5 M4;
    public final ema N1;
    public final Paint N2;
    public float N3;
    public q95 N4;
    public final s85 O1;
    public float O2;
    public int O3;
    public ka5 O4;
    public final ema P1;
    public float P2;
    public boolean P3;
    public o95 P4;
    public final z85 Q1;
    public ValueAnimator Q2;
    public final int[] Q3;
    public boolean Q4;
    public final sd4 R1;
    public TLRPC.InputPeer R2;
    public final ArrayList R3;
    public boolean R4;
    public final ImageReceiver S1;
    public TLRPC.Chat S2;
    public final ArrayList S3;
    public int S4;
    public int T1;
    public vc2 T2;
    public final g75 T3;
    public AnimatorSet T4;
    public final ImageView U1;
    public final boolean U2;
    public final m75 U3;
    public o85 U4;
    public final da5 V1;
    public final String V2;
    public final a85 V3;
    public int V4;
    public final int W1;
    public final f95 W2;
    public float W3;
    public int W4;
    public final RadialProgressView X1;
    public final x65 X2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout X3;
    public int X4;
    public final Drawable Y1;
    public final a75 Y2;
    public boolean Y3;
    public int Y4;
    public final View Z1;
    public final Paint Z2;
    public boolean Z3;
    public int Z4;
    public AnimatorSet a2;
    public final LinearLayout a3;
    public zn5 a4;
    public int a5;
    public LaunchActivity b2;
    public final s7 b3;
    public v85 b4;
    public int b5;
    public final UndoView[] c2;
    public final s7 c3;
    public int c4;
    public int c5;
    public final l5 d2;
    public final s7 d3;
    public boolean d4;
    public int d5;
    public boolean e2;
    public final b8 e3;
    public final c75 e4;
    public int e5;
    public lg5 f2;
    public final b8 f3;
    public final d79 f4;
    public int f5;
    public lg5 g2;
    public final b8 g3;
    public final sb5 g4;
    public int g5;
    public int h2;
    public final b8 h3;
    public final p95 h4;
    public int h5;
    public qc i2;
    public final b8 i3;
    public ViewTreeObserver.OnPreDrawListener i4;
    public int i5;
    public final ArrayList j2;
    public final v86 j3;
    public final fe1 j4;
    public int j5;
    public l85 k2;
    public final x86 k3;
    public boolean k4;
    public int k5;
    public final i75 l1;
    public boolean l2;
    public final u86 l3;
    public final ArrayList l4;
    public final p85 l5;
    public final n65 m1;
    public long m2;
    public final b8 m3;
    public boolean m4;
    public Boolean m5;
    public final k5 n1;
    public boolean n2;
    public final b8 n3;
    public final z55 n4;
    public Integer n5;
    public final t65 o1;
    public boolean o2;
    public final b8 o3;
    public final y65 o4;
    public final fm0 o5;
    public final kmc p1;
    public final RectF p2;
    public final b8 p3;
    public final jm3 p4;
    public final fm0 p5;
    public final kmc q1;
    public boolean q2;
    public final b8 q3;
    public final z55 q4;
    public final t84 q5;
    public final kmc r1;
    public boolean r2;
    public final b8 r3;
    public final LongSparseIntArray r4;
    public final fm0 r5;
    public final kmc s1;
    public float s2;
    public final b8 s3;
    public final k75 s4;
    public final kmc t1;
    public c85 t2;
    public final b8 t3;
    public final h75 t4;
    public final kmc u1;
    public TLRPC.Peer u2;
    public final LinearLayout u3;
    public LinearLayout u4;
    public final kmc v1;
    public TLObject v2;
    public final TextView v3;
    public boolean v4;
    public final u65 w1;
    public final Paint w2;
    public final v2d w3;
    public final b29 w4;
    public final Paint x1;
    public final ArrayList x2;
    public z55 x3;
    public byte x4;
    public final t75 y1;
    public final ArrayList y2;
    public sd5 y3;
    public boolean y4;
    public final s75 z1;
    public final ArrayList z2;
    public byte z3;
    public final View z4;

    public j95(final LaunchActivity launchActivity, k5 k5Var, vc2 vc2Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        super((vnb) null, (Context) launchActivity, true, true);
        int i;
        final LaunchActivity launchActivity2;
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
        this.w3 = new v2d(new z55(this, (byte) 4));
        this.z3 = (byte) 0;
        this.B3 = new Paint(7);
        this.C3 = new Paint(7);
        this.D3 = new i95[8];
        this.E3 = 1.0f;
        this.P3 = true;
        this.Q3 = new int[4];
        this.R3 = new ArrayList();
        this.S3 = new ArrayList();
        this.j4 = new fe1();
        this.l4 = new ArrayList();
        this.n4 = new z55(this, (byte) 0);
        this.o4 = new y65(this);
        this.p4 = new jm3((byte) 13);
        this.q4 = new z55(this, (byte) 2);
        this.r4 = new LongSparseIntArray();
        this.C4 = new int[2];
        this.F4 = true;
        this.I4 = new String[2];
        this.S4 = -1;
        this.l5 = new p85(this);
        k43 k43Var = k43.f;
        this.o5 = new fm0(2, this, k43Var, 350L);
        this.p5 = new fm0(3, this, k43Var, 220L, true);
        this.q5 = new t84(4, this, k43Var, 350L);
        final j95 j95Var = this;
        j95Var.r5 = new fm0(5, this, k43Var, 350L);
        hl.S(j95Var.getWindow());
        j95Var.S0 = true;
        j95Var.n1 = k5Var;
        j95Var.T2 = vc2Var;
        j95Var.R2 = inputPeer;
        j95Var.S2 = chat;
        j95Var.V2 = str;
        j95Var.a = k5Var.a;
        j95Var.U2 = z;
        j95Var.J0 = new w53();
        j95Var.Q0 = true;
        j95Var.R0 = true;
        j95Var.W1 = uc7.s1(j95Var.a).k4.D.f();
        j95Var.V = true;
        v5 = false;
        u5 = false;
        w5 = false;
        j95Var.z0 = new j75(j95Var);
        j95Var.s = true;
        j95Var.n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            j95Var.getWindow().setNavigationBarColor(-16777216);
        }
        j95Var.w = true;
        j95Var.G0 = -1;
        j95Var.L4 = new u75(j95Var);
        j95Var.setOnDismissListener(new e65(j95Var, (byte) 0));
        j95Var.q0 = (byte) 75;
        e95 e95Var = new e95(j95Var, launchActivity);
        j95Var.I1 = e95Var;
        hh2 hh2Var = new hh2(true);
        int i2 = aob.hh;
        hh2Var.b(aob.u0(i2));
        hh2Var.d();
        e85 e85Var = new e85(j95Var, launchActivity, hh2Var);
        j95Var.H1 = e85Var;
        e85Var.setSubtitle("");
        e85Var.getSubtitleTextView().setVisibility(0);
        e85Var.r();
        e85Var.getAdditionalSubtitleTextView().setPadding(hl.L(24.0f), 0, 0, 0);
        hl.Q3(1.0f, e85Var.getAdditionalSubtitleTextView(), j95Var.m4, false);
        e85Var.getAdditionalSubtitleTextView().setTextColor(aob.u0(i2));
        int i3 = aob.ch;
        yob.l(e85Var, 6, i3, null);
        e85Var.setBackButtonImage(2131231243);
        e85Var.setOccupyStatusBar(false);
        e85Var.setAllowOverlayTitle(false);
        int i4 = aob.Yg;
        yob.l(e85Var, 1, i4, null);
        yob.l(e85Var, 3, aob.z8, null);
        yob.c(e85Var, i4);
        yob.l(e85Var, 6, i3, null);
        e85Var.setActionBarMenuOnItemClick(new m85(j95Var, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            j95Var.u2 = tL_peerUser;
            i = i4;
            tL_peerUser.user_id = k5Var.e().e();
        } else {
            i = i4;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                j95Var.u2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                j95Var.u2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                j95Var.u2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new a65(j95Var, (byte) 2);
        k5Var.c().b(j95Var, jn7.w2);
        k5Var.c().b(j95Var, jn7.M0);
        k5Var.c().b(j95Var, jn7.T);
        k5Var.c().b(j95Var, jn7.u1);
        k5Var.c().b(j95Var, jn7.B2);
        k5Var.c().b(j95Var, jn7.E0);
        k5Var.c().b(j95Var, jn7.j0);
        k5Var.c().b(j95Var, 2);
        k5Var.c().b(j95Var, jn7.z2);
        k5Var.c().b(j95Var, jn7.y2);
        k5Var.c().b(j95Var, jn7.U3);
        jn7.e().b(j95Var, jn7.Q4);
        jn7.e().b(j95Var, jn7.D2);
        j95Var.Y1 = launchActivity.getResources().getDrawable(2131232744).mutate();
        b29 b29Var = new b29(2131624340, hl.L(46.0f), hl.L(46.0f), true, null);
        j95Var.D2 = b29Var;
        j95Var.E2 = new b29(2131624045, hl.L(46.0f), hl.L(46.0f), true, null);
        r85 r85Var = new r85(j95Var, launchActivity);
        j95Var.E1 = r85Var;
        j95Var.b = r85Var;
        r85Var.setClipToPadding(false);
        j95Var.b.setFocusable(true);
        j95Var.b.setFocusableInTouchMode(true);
        j95Var.b.setWillNotDraw(false);
        ViewGroup viewGroup = j95Var.b;
        int i5 = j95Var.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        j95Var.b.setKeepScreenOn(true);
        j95Var.b.setClipChildren(false);
        j95Var.S1 = new ImageReceiver(j95Var.b);
        if (inputPeer != null) {
            ema emaVar = new ema(launchActivity);
            j95Var.N1 = emaVar;
            emaVar.setGravity(17);
            emaVar.setTextColor(-1);
            emaVar.setTypeface(hl.o());
            emaVar.setTextSize(18);
            emaVar.k(ob6.L0(2131743087));
            j95Var.b.addView(emaVar, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            s85 s85Var = new s85(j95Var, launchActivity);
            j95Var.O1 = s85Var;
            s85Var.setGravity(17);
            s85Var.setTextColor(-1);
            s85Var.setTypeface(hl.o());
            s85Var.setTextSize(60);
            j95Var.b.addView(s85Var, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            ema emaVar2 = new ema(launchActivity);
            j95Var.P1 = emaVar2;
            emaVar2.setGravity(17);
            emaVar2.setTextColor(-1);
            emaVar2.setTypeface(hl.o());
            emaVar2.setTextSize(18);
            j95Var.b.addView(emaVar2, tre.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        t85 t85Var = new t85(j95Var, launchActivity);
        j95Var.J1 = t85Var;
        t85Var.setClipToPadding(false);
        t85Var.setClipChildren(false);
        z85 z85Var = new z85(j95Var);
        j95Var.Q1 = z85Var;
        z85Var.o = k43Var;
        z85Var.d = (short) 350;
        z85Var.c = (short) 350;
        z85Var.e = (short) 350;
        z85Var.C = false;
        t85Var.setItemAnimator(z85Var);
        t85Var.setOnScrollListener(new u85(j95Var));
        t85Var.setVerticalScrollBarEnabled(false);
        j95Var.getContext();
        sd4 sd4Var = new sd4(u5 ? 6 : 2, t85Var);
        j95Var.R1 = sd4Var;
        t85Var.setLayoutManager(sd4Var);
        n65 n65Var = new n65(j95Var);
        j95Var.m1 = n65Var;
        sd4Var.O = n65Var;
        t85Var.i(new o65(j95Var));
        sd4Var.W = false;
        j95Var.b.addView(t85Var, tre.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        t85Var.setAdapter(e95Var);
        t85Var.setTopBottomSelectorRadius(13);
        yob.I(aob.Vg, t85Var);
        t85Var.setOnItemClickListener(new fu2(j95Var, launchActivity, vc2Var, (byte) 13));
        t85Var.setOnItemLongClickListener(new a65(j95Var, (byte) 3));
        d79 d79Var = new d79(launchActivity);
        j95Var.f4 = d79Var;
        j95Var.b.addView(d79Var, tre.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        sb5 sb5Var = new sb5(vc2Var, j95Var.a, j95Var);
        j95Var.g4 = sb5Var;
        d79Var.setAdapter(sb5Var);
        u55 u55Var = new u55(6, false);
        d79Var.setLayoutManager(u55Var);
        u55Var.O = new q65(j95Var);
        d79Var.setOnItemClickListener(new r69(j95Var) {
            public final j95 b;

            {
                this.b = j95Var;
            }

            @Override
            public final void e(int i6, View view) {
                byte b = r2;
                j95 j95Var2 = this.b;
                switch (b) {
                    case 0:
                        o95 o95Var = (o95) view;
                        if (o95Var.getVideoParticipant() == null) {
                            j95Var2.W0(new wc2(o95Var.getParticipant(), false));
                            return;
                        } else {
                            j95Var2.W0(o95Var.getVideoParticipant());
                            return;
                        }
                    default:
                        q95 q95Var = (q95) view;
                        if (q95Var.getParticipant() != null) {
                            j95Var2.W0(q95Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        zb3 zb3Var = new zb3();
        zb3Var.C = false;
        zb3Var.o = k43Var;
        zb3Var.d = (short) 350;
        zb3Var.c = (short) 350;
        zb3Var.e = (short) 350;
        d79Var.setItemAnimator(new r65(j95Var));
        d79Var.setOnScrollListener(new s65(j95Var));
        sb5Var.H(d79Var, false, false);
        d79Var.setVisibility(8);
        t65 t65Var = new t65(j95Var, launchActivity);
        j95Var.o1 = t65Var;
        int u0 = aob.u0(aob.Ah);
        int red = Color.red(u0);
        int green = Color.green(u0);
        int blue = Color.blue(u0);
        j95Var.M2 = new Matrix();
        j95Var.L2 = new RadialGradient(0.0f, 0.0f, hl.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        j95Var.N2 = paint;
        paint.setShader(j95Var.L2);
        gk0 gk0Var = new gk0(9);
        j95Var.G2 = gk0Var;
        gk0 gk0Var2 = new gk0(12);
        j95Var.H2 = gk0Var2;
        gk0Var.a = hl.L(62.0f) * 0.45454547f;
        gk0Var.b = hl.L(72.0f) * 0.45454547f;
        gk0Var.b();
        gk0Var2.a = hl.L(65.0f) * 0.45454547f;
        gk0Var2.b = hl.L(75.0f) * 0.45454547f;
        gk0Var2.b();
        int i6 = aob.zh;
        gk0Var.d.setColor(vm2.o(aob.u0(i6), 38));
        gk0Var2.d.setColor(vm2.o(aob.u0(i6), 76));
        kmc kmcVar = new kmc(launchActivity, 50.0f);
        j95Var.s1 = kmcVar;
        kmcVar.setCheckable(true);
        kmcVar.setTextSize(12);
        t65Var.a(kmcVar);
        kmcVar.setOnClickListener(new x55(j95Var, (byte) 6));
        kmc kmcVar2 = new kmc(launchActivity, 50.0f);
        j95Var.r1 = kmcVar2;
        kmcVar2.setCheckable(true);
        kmcVar2.setTextSize(12);
        kmcVar2.d(false, false);
        kmcVar2.setCrossOffset(-hl.N(3.5f));
        kmcVar2.c(2131230926, -1, 0, 1.0f, true, ob6.L0(2131743141), false, false);
        kmc kmcVar3 = new kmc(launchActivity, 50.0f);
        j95Var.p1 = kmcVar3;
        kmcVar3.setCheckable(true);
        kmcVar3.setTextSize(12);
        kmcVar3.d(false, false);
        ?? imageView = new ImageView(launchActivity);
        kmcVar3.addView((View) imageView, tre.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        b29 b29Var2 = new b29(2131623962, hl.L(24.0f), hl.L(24.0f), true, null);
        j95Var.w4 = b29Var2;
        imageView.setAnimation(b29Var2);
        kmcVar3.setOnClickListener(new x55(j95Var, (byte) 9));
        t65Var.a(kmcVar3);
        kmc kmcVar4 = new kmc(launchActivity, 50.0f);
        j95Var.q1 = kmcVar4;
        kmcVar4.setCheckable(true);
        kmcVar4.setTextSize(12);
        kmcVar4.d(false, false);
        ImageView imageView2 = new ImageView(launchActivity);
        j95Var.U1 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        j95Var.T1 = 2131231173;
        imageView2.setImageResource(2131231173);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView2.setScaleX(1.11f);
        imageView2.setScaleY(1.11f);
        kmcVar4.addView(imageView2, tre.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        kmcVar4.setOnClickListener(new x55(j95Var, (byte) 10));
        t65Var.a(kmcVar4);
        t65Var.a(kmcVar2);
        kmc kmcVar5 = new kmc(launchActivity, 50.0f);
        j95Var.t1 = kmcVar5;
        kmcVar5.setTextSize(12);
        kmcVar5.c(2131230918, -1, aob.u0(aob.uh), 0.3f, false, ob6.L0(2131743016), false, false);
        kmcVar5.setOnClickListener(new View.OnClickListener(j95Var) {
            public final j95 b;

            {
                this.b = j95Var;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                boolean z2 = true;
                LaunchActivity launchActivity3 = launchActivity;
                j95 j95Var2 = this.b;
                switch (b) {
                    case 0:
                        LaunchActivity launchActivity4 = j95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            j95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                j95Var2.c2[0].d(1, false);
                                if (j95Var2.t2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z2 = false;
                                    }
                                    c85 c85Var = new c85(j95Var2, launchActivity3, z2);
                                    j95Var2.t2 = c85Var;
                                    c85Var.setBottomPadding(j95Var2.b.getPaddingBottom());
                                    j95Var2.c.addView(j95Var2.t2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            j95Var2.M1(true, false);
                            j95Var2.L1(false);
                            j95Var2.T2.B();
                            j95Var2.E0(true);
                            j95Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        g75 g75Var = j95Var2.T3;
                        zz3 zz3Var = g75Var.i0;
                        if (g75Var.h0) {
                            hl.r(zz3Var);
                        }
                        hl.d3(zz3Var, 3000L);
                        g75Var.h0 = true;
                        vc2 vc2Var2 = j95Var2.T2;
                        if (vc2Var2 != null && !vc2Var2.k()) {
                            j95Var2.F1();
                            j95.m1(launchActivity3, new z55(j95Var2, (byte) 5), false, false);
                            return;
                        }
                        j95Var2.dismiss();
                        return;
                }
            }
        });
        kmc kmcVar6 = new kmc(launchActivity, 50.0f);
        j95Var.u1 = kmcVar6;
        kmcVar6.setCheckable(true);
        kmcVar6.b(true, false);
        kmcVar6.setTextSize(12);
        kmcVar6.c(2131231188, -1, 0, 1.0f, true, ob6.L0(2131742946), false, false);
        u65 u65Var = new u65(j95Var, launchActivity);
        j95Var.w1 = u65Var;
        u65Var.setAnimation(b29Var);
        u65Var.setScaleType(ImageView.ScaleType.CENTER);
        kmc kmcVar7 = new kmc(launchActivity, 50.0f);
        j95Var.v1 = kmcVar7;
        kmcVar7.setDrawBackground(false);
        kmcVar7.setTextSize(12);
        kmcVar7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        kmcVar7.addView(u65Var, tre.e(50, 50, 49));
        t65Var.a(kmcVar7);
        kmcVar7.setOnClickListener(new w65(j95Var));
        t65Var.a(kmcVar6);
        t65Var.a(kmcVar5);
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        j95Var.X1 = radialProgressView;
        radialProgressView.setSize(hl.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(aob.u0(aob.Fh));
        e85Var.setAlpha(0.0f);
        e85Var.getBackButton().setScaleX(0.9f);
        e85Var.getBackButton().setScaleY(0.9f);
        e85Var.getBackButton().setTranslationX(-hl.L(14.0f));
        e85Var.getTitleTextView().setTranslationY(hl.L(23.0f));
        e85Var.getSubtitleTextView().setTranslationY(hl.L(20.0f));
        e85Var.getAdditionalSubtitleTextView().setTranslationY(hl.L(20.0f));
        s7 s7Var = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.b3 = s7Var;
        s7Var.setLongClickEnabled(false);
        s7Var.setIcon(2131231247);
        s7Var.setContentDescription(ob6.L0(2131754834));
        s7Var.setSubMenuOpenSide(2);
        s7Var.setDelegate(new a65(j95Var, (byte) 5));
        int i7 = aob.Zg;
        yob.Q(s7Var, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var.setOnClickListener(new x55(j95Var, (byte) 11));
        s7Var.O(aob.u0(i), false);
        s7Var.O(aob.u0(i), true);
        s7 s7Var2 = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.c3 = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setIcon(2131232434);
        s7Var2.setContentDescription(ob6.L0(2131754803));
        yob.Q(s7Var2, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var2.setOnClickListener(new x55(j95Var, (byte) 12));
        s7 s7Var3 = new s7(launchActivity, (s6) null, aob.u0(i));
        j95Var.d3 = s7Var3;
        s7Var3.setLongClickEnabled(false);
        s7Var3.setIcon(2131232357);
        s7Var3.setContentDescription(ob6.L0(2131754803));
        yob.Q(s7Var3, aob.e0(aob.u0(i7), 6), null, yob.M(i7));
        s7Var3.setOnClickListener(new x55(j95Var, (byte) 0));
        x65 x65Var = new x65(j95Var, launchActivity, launchActivity);
        j95Var.X2 = x65Var;
        ?? view = new View(launchActivity);
        j95Var.G1 = view;
        view.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        j95Var.Z2 = paint2;
        paint2.setColor(-12761513);
        a75 a75Var = new a75(j95Var, j95Var.getContext());
        j95Var.Y2 = a75Var;
        yob.X(a75Var, i, j95Var.J0);
        a75Var.setTextSize(1, 11.0f);
        a75Var.setText(ob6.L0(2131743126));
        a75Var.setMaxLines(1);
        a75Var.setGravity(17);
        a75Var.setTypeface(hl.o());
        a75Var.setPadding(hl.L(8.0f), hl.L(0.0f), hl.L(8.0f), hl.L(0.0f));
        if (!j95Var.j1()) {
            a75Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(j95Var.getContext());
        j95Var.a3 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(x65Var, tre.l(1.0f, 0, -2));
        linearLayout.addView(a75Var, tre.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        j95Var.b.addView((View) view, tre.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.b.addView(linearLayout, tre.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        j95Var.b.addView(e85Var, tre.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        j95Var.u3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(s7Var3, tre.o(48, 48));
        linearLayout2.addView(s7Var2, tre.o(48, 48));
        linearLayout2.addView(s7Var, tre.o(48, 48));
        j95Var.b.addView(linearLayout2, tre.e(-2, 48, 53));
        View view2 = new View(launchActivity);
        j95Var.Z1 = view2;
        view2.setAlpha(0.0f);
        yob.h(aob.V5, null, view2);
        j95Var.b.addView(view2, tre.c(1.0f, -1));
        for (int i8 = 0; i8 < 2; i8++) {
            j95Var.c2[i8] = new b75(j95Var, launchActivity);
            j95Var.c2[i8].setAdditionalTranslationY(hl.L(10.0f));
            j95Var.c2[i8].setTranslationZ(hl.L(5.0f));
            j95Var.b.addView(j95Var.c2[i8], tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        l5 l5Var = new l5(launchActivity, true);
        j95Var.d2 = l5Var;
        l5Var.setTag(2131296439, 240);
        j95Var.b3.h(l5Var, hl.L(48.0f));
        j95Var.b3.setShowSubmenuByMove(false);
        int i9 = aob.Vg;
        yob.Q(l5Var, aob.Y(aob.u0(i9), 6, 6), null, yob.M(i9));
        s7 s7Var4 = j95Var.b3;
        b8 d = s7Var4.d(1, 0, null, ob6.L0(2131743053), true, true, s7Var4.n0);
        j95Var.p3 = d;
        d.m(true, false);
        s7 s7Var5 = j95Var.b3;
        b8 d2 = s7Var5.d(2, 0, null, ob6.L0(2131743006), true, true, s7Var5.n0);
        j95Var.q3 = d2;
        d2.m(false, true);
        int i10 = aob.nh;
        d.setCheckColor(i10);
        d.d(aob.u0(i10), aob.u0(i10));
        d2.setCheckColor(i10);
        d2.d(aob.u0(i10), aob.u0(i10));
        Paint paint3 = new Paint(1);
        paint3.setColor(aob.u0(aob.Yg));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(hl.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        b8 f = j95Var.b3.f(null, ob6.L0(2131743051), 10, true, 2131232435);
        j95Var.g3 = f;
        f.setItemHeight(56);
        b8 f2 = j95Var.b3.f(null, ob6.L0(2131742934), 11, true, 2131232266);
        j95Var.h3 = f2;
        f2.setItemHeight(56);
        v86 v86Var = new v86(u86.a());
        j95Var.j3 = v86Var;
        b8 f3 = j95Var.b3.f(v86Var, ob6.L0(2131744966), 14, false, 0);
        j95Var.i3 = f3;
        f3.setItemHeight(56);
        f3.setRightIcon(2131232365);
        f3.setSubtext(ob6.L0(u86.a() ? 2131744964 : 2131744965));
        f3.getRightIcon().setBackground(aob.e0(aob.u0(i9), 1));
        int i11 = (ob6.a0 ? 3 : 5) | 16;
        ImageView rightIcon = f3.getRightIcon();
        boolean z2 = ob6.a0;
        rightIcon.setLayoutParams(tre.d(40, 40.0f, i11, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
        View view3 = new View(launchActivity);
        view3.setBackgroundColor(vm2.f(0.3f, aob.u0(aob.Xg), -16777216));
        boolean z3 = ob6.a0;
        FrameLayout.LayoutParams d3 = tre.d(-1, 28.0f, i11, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
        d3.width = 1;
        view3.setLayoutParams(d3);
        f3.addView(view3);
        View[] viewArr = {f3.getTextView(), f3.getSubtextView()};
        for (int i12 = 0; i12 < 2; i12++) {
            View view4 = viewArr[i12];
            if (view4 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view4.getLayoutParams();
                layoutParams.leftMargin = ob6.a0 ? hl.L(60.0f) : 0;
                layoutParams.rightMargin = ob6.a0 ? 0 : hl.L(60.0f);
                view4.setLayoutParams(layoutParams);
            }
        }
        j95Var.i3.getRightIcon().setContentDescription(ob6.L0(2131744940));
        j95Var.i3.getRightIcon().setOnClickListener(new x55(j95Var, (byte) 1));
        TextView b = j95Var.b3.b(vm2.f(0.3f, aob.u0(aob.Xg), -16777216));
        j95Var.v3 = b;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b.getLayoutParams()).bottomMargin = 0;
        b8 f4 = j95Var.b3.f(j95Var.W2, ob6.L0(xc2.W(j95Var.S2) ? 2131743137 : 2131743036), 6, true, 2131232121);
        j95Var.f3 = f4;
        b8 f5 = j95Var.b3.f(j95Var.W2, ob6.L0(2131743037), 7, false, 2131232281);
        j95Var.m3 = f5;
        b8 e = j95Var.b3.e(3, 2131232208, ob6.L0(2131742989));
        j95Var.e3 = e;
        f95 f95Var = new f95();
        j95Var.W2 = f95Var;
        b8 e2 = j95Var.b3.e(9, 2131232357, ob6.L0(2131743088));
        j95Var.o3 = e2;
        b8 f6 = j95Var.b3.f(f95Var, ob6.L0(2131743000), 5, true, 0);
        j95Var.n3 = f6;
        f95Var.g = f6.getImageView();
        b8 e3 = j95Var.b3.e(12, 2131231899, ob6.L0(2131743136));
        j95Var.s3 = e3;
        b8 e4 = j95Var.b3.e(13, 2131230781, ob6.L0(2131743138));
        j95Var.t3 = e4;
        b8 e5 = j95Var.b3.e(4, 2131232092, ob6.L0(j95Var.h1() ? 2131743031 : xc2.W(j95Var.S2) ? 2131743133 : 2131743032));
        j95Var.r3 = e5;
        j95Var.b3.setPopupItemsSelectorColor(aob.u0(aob.Vg));
        j95Var.b3.getPopupLayout().setFitItems(true);
        int i13 = aob.Yg;
        e3.d(aob.u0(i13), aob.u0(i13));
        e4.d(aob.u0(i13), aob.u0(i13));
        j95Var.g3.d(aob.u0(i13), aob.u0(i13));
        j95Var.h3.d(aob.u0(i13), aob.u0(i13));
        A1(j95Var.i3, aob.u0(i13));
        int i14 = aob.mh;
        e5.d(aob.u0(i14), aob.u0(i14));
        e.d(aob.u0(i13), aob.u0(i13));
        f4.d(aob.u0(i13), aob.u0(i13));
        f5.d(aob.u0(i13), aob.u0(i13));
        f6.d(aob.u0(i13), aob.u0(i13));
        e2.d(aob.u0(i13), aob.u0(i13));
        if (j95Var.T2 != null) {
            j95Var.e1();
        }
        if (j95Var.h1()) {
            j95Var.i2 = new qc();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            j95Var.i2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        j95Var.O1(false);
        j95Var.H1.getTitleTextView().setOnClickListener(new x55(j95Var, (byte) 2));
        c75 c75Var = new c75(j95Var, launchActivity);
        j95Var.e4 = c75Var;
        d75 d75Var = new d75(j95Var);
        j95Var.D4 = d75Var;
        c75Var.setClipToPadding(false);
        d75Var.C = false;
        d75Var.o = k43.f;
        d75Var.d = (short) 350;
        d75Var.c = (short) 350;
        d75Var.e = (short) 350;
        c75Var.setItemAnimator(d75Var);
        c75Var.setOnScrollListener(new e75(j95Var));
        c75Var.setClipChildren(false);
        x46 x46Var = new x46();
        x46Var.i1(0);
        c75Var.setLayoutManager(x46Var);
        p95 p95Var = new p95(vc2Var, j95Var.a, j95Var);
        j95Var.h4 = p95Var;
        c75Var.setAdapter(p95Var);
        p95Var.F(c75Var, false);
        c75Var.setOnItemClickListener(new r69(j95Var) {
            public final j95 b;

            {
                this.b = j95Var;
            }

            @Override
            public final void e(int i62, View view5) {
                byte b2 = r2;
                j95 j95Var2 = this.b;
                switch (b2) {
                    case 0:
                        o95 o95Var = (o95) view5;
                        if (o95Var.getVideoParticipant() == null) {
                            j95Var2.W0(new wc2(o95Var.getParticipant(), false));
                            return;
                        } else {
                            j95Var2.W0(o95Var.getVideoParticipant());
                            return;
                        }
                    default:
                        q95 q95Var = (q95) view5;
                        if (q95Var.getParticipant() != null) {
                            j95Var2.W0(q95Var.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        c75Var.setOnItemLongClickListener(new a65(j95Var, (byte) 0));
        c75Var.setVisibility(8);
        c75Var.i(new Object());
        g75 g75Var = new g75(j95Var, launchActivity, j95Var.J1, c75Var, j95Var.R3, j95Var.T2, this);
        j95Var.T3 = g75Var;
        g75Var.setClipChildren(false);
        p95Var.E(j95Var.R3, g75Var);
        if (j95Var.f4 != null) {
            j95Var.g4.G(j95Var.R3, g75Var);
        }
        h75 h75Var = new h75(j95Var, launchActivity);
        j95Var.t4 = h75Var;
        i75 i75Var = new i75(j95Var, launchActivity, j95Var.H1, j95Var.J1, h75Var);
        j95Var.l1 = i75Var;
        i75Var.setImagesLayerNum(Integer.MAX_VALUE);
        i75Var.setInvalidateWithParent(true);
        h75Var.setProfileGalleryView(i75Var);
        k75 k75Var = new k75(j95Var, launchActivity);
        j95Var.s4 = k75Var;
        k75Var.setVisibility(8);
        i75Var.setVisibility(0);
        i75Var.b(new l75(j95Var));
        m75 m75Var = new m75(j95Var, launchActivity);
        j95Var.U3 = m75Var;
        j95Var.b.addView(g75Var);
        g75Var.addView(c75Var, tre.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        j95Var.o1.setWillNotDraw(false);
        View view5 = new View(launchActivity);
        j95Var.z4 = view5;
        int[] iArr = j95Var.C4;
        iArr[0] = j95Var.O3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, j95Var.C4);
        j95Var.B4 = gradientDrawable;
        view5.setBackground(gradientDrawable);
        j95Var.b.addView(view5, tre.e(-1, 60, 83));
        View view6 = new View(launchActivity);
        j95Var.A4 = view6;
        view6.setBackgroundColor(j95Var.C4[0]);
        j95Var.b.addView(view6, tre.e(-1, 0, 83));
        da5 da5Var = new da5(launchActivity);
        j95Var.V1 = da5Var;
        da5Var.setDelegate(new n75(j95Var));
        da5Var.setClickCellDelegate(new o75(j95Var));
        vc2 vc2Var2 = j95Var.T2;
        if (vc2Var2 != null) {
            da5Var.F0(j95Var.n1.a, vc2Var2.h(false));
        }
        j95Var.b.addView(da5Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        x86 x86Var = new x86(launchActivity);
        j95Var.k3 = x86Var;
        x86Var.setOnContentHeightChanged(new z55(j95Var, (byte) 1));
        j95Var.b.addView(x86Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.l3 = new u86(new p75(j95Var));
        in inVar = new in(launchActivity, false, true, true);
        j95Var.F1 = inVar;
        inVar.setGravity(17);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTextColor(-1);
        inVar.b(0.4f, 320L, k43.h);
        inVar.setTypeface(hl.o());
        j95Var.b.addView(j95Var.o1);
        q75 q75Var = new q75(j95Var, launchActivity, j95Var.E1, LaunchActivity.Q(), j95Var.J0);
        j95Var.A1 = q75Var;
        q75Var.K = true;
        q75Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(j95Var.W1)});
        q75Var.getEditText().setLinkTextColor(-11683585);
        q75Var.setHint(ob6.L0(2131743583));
        q75Var.getEditText().addTextChangedListener(new r75(j95Var));
        q75Var.s();
        s75 s75Var = new s75(j95Var, launchActivity);
        j95Var.z1 = s75Var;
        j95Var.b.addView(s75Var, tre.c(-1.0f, -1));
        ?? frameLayout = new FrameLayout(launchActivity);
        j95Var.y1 = frameLayout;
        frameLayout.addView(q75Var, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        frameLayout.addView(inVar, tre.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        inVar.setTranslationY(-hl.L(20.0f));
        j95Var.b.addView((View) frameLayout, tre.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        j95Var.C1 = imageView3;
        int i15 = aob.i6;
        yob.R(imageView3, aob.f0(j95Var.T(i15), 1, -1), null, yob.M(i15), j95Var.J0);
        int i16 = aob.f7;
        vnb vnbVar = j95Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView3, i16, vnbVar, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new x55(j95Var, (byte) 3));
        ImageView imageView4 = new ImageView(launchActivity);
        j95Var.B1 = imageView4;
        yob.R(imageView4, aob.f0(j95Var.T(i15), 1, -1), null, yob.M(i15), j95Var.J0);
        yob.s(imageView4, aob.v6, j95Var.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231463);
        imageView4.setOnClickListener(new x55(j95Var, (byte) 4));
        frameLayout.addView(imageView3, tre.e(48, 48, 85));
        frameLayout.addView(imageView4, tre.e(48, 48, 85));
        j95Var.b.addView(m75Var);
        k75Var.addView(i75Var, tre.c(-1.0f, -1));
        k75Var.addView(h75Var, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        j95Var.b.addView(k75Var, tre.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        j95Var.E0(false);
        j95Var.I1.f();
        if (v5) {
            j95Var.g4.I(j95Var.f4, false);
        }
        j95Var.C2 = j95Var.I1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            j95Var.L1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (xc2.T(j95Var.S2) && (chat2 = j95Var.S2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            j95Var.b.addView(textView, tre.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            hq7 hq7Var = new hq7(launchActivity);
            hq7Var.setTextColor(-1);
            hq7Var.setSelectorColor(-9598483);
            hq7Var.setTextOffset(hl.L(10.0f));
            hq7Var.setItemCount(5);
            ?? hq7Var2 = new hq7(launchActivity);
            hq7Var2.setItemCount(5);
            hq7Var2.setTextColor(-1);
            hq7Var2.setSelectorColor(-9598483);
            hq7Var2.setTextOffset(-hl.L(10.0f));
            ?? hq7Var3 = new hq7(launchActivity);
            hq7Var3.setItemCount(5);
            hq7Var3.setTextColor(-1);
            hq7Var3.setSelectorColor(-9598483);
            hq7Var3.setTextOffset(-hl.L(34.0f));
            x75 x75Var = new x75(launchActivity);
            j95Var.M1 = x75Var;
            x75Var.setLines(1);
            x75Var.setSingleLine(true);
            x75Var.setEllipsize(TextUtils.TruncateAt.END);
            x75Var.setGravity(17);
            x75Var.setTextColor(-1);
            x75Var.setTypeface(hl.o());
            x75Var.setTextSize(1, 14.0f);
            j95Var.b.addView(x75Var, tre.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            x75Var.setOnClickListener(new b65(j95Var, hq7Var, hq7Var2, hq7Var3, chat, k5Var, inputPeer2, (byte) 0));
            z75 z75Var = new z75(launchActivity2, hq7Var, hq7Var2, hq7Var3);
            j95Var.K1 = z75Var;
            z75Var.setWeightSum(1.0f);
            z75Var.setOrientation(0);
            j95Var.b.addView(z75Var, tre.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            int i18 = calendar.get(6);
            z75Var.addView(hq7Var, tre.l(0.5f, 0, 270));
            hq7Var.setMinValue(0);
            hq7Var.setMaxValue(365);
            hq7Var.setWrapSelectorWheel(false);
            hq7Var.setFormatter(new pm0(currentTimeMillis, calendar, i17, (byte) 1));
            pt ptVar = new pt(this, hq7Var, (Object) hq7Var2, (Object) hq7Var3, (byte) 12);
            hq7Var.setOnValueChangedListener(ptVar);
            hq7Var2.setMinValue(0);
            hq7Var2.setMaxValue(23);
            z75Var.addView((View) hq7Var2, tre.l(0.2f, 0, 270));
            hq7Var2.setFormatter(new xi4((byte) 20));
            hq7Var2.setOnValueChangedListener(ptVar);
            hq7Var3.setMinValue(0);
            hq7Var3.setMaxValue(59);
            hq7Var3.setValue(0);
            hq7Var3.setFormatter(new xi4((byte) 21));
            z75Var.addView((View) hq7Var3, tre.l(0.3f, 0, 270));
            hq7Var3.setOnValueChangedListener(ptVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i19 = calendar.get(6);
            int i20 = calendar.get(12);
            int i21 = calendar.get(11);
            hq7Var.setValue(i18 != i19 ? 1 : 0);
            hq7Var3.setValue(i20);
            hq7Var2.setValue(i21);
            j95Var = this;
            jj.g(x75Var, textView, 0L, 604800L, 2, hq7Var, hq7Var2, hq7Var3);
        } else {
            launchActivity2 = launchActivity;
        }
        a85 a85Var = new a85(j95Var, (ViewGroup) j95Var.getWindow().getDecorView(), j95Var.b);
        j95Var.V3 = a85Var;
        a85Var.E = new b85(j95Var);
        i75Var.setPinchToZoomHelper(a85Var);
        j95Var.r1.setOnClickListener(new View.OnClickListener(j95Var) {
            public final j95 b;

            {
                this.b = j95Var;
            }

            @Override
            public final void onClick(View view7) {
                byte b2 = r3;
                boolean z22 = true;
                LaunchActivity launchActivity3 = launchActivity2;
                j95 j95Var2 = this.b;
                switch (b2) {
                    case 0:
                        LaunchActivity launchActivity4 = j95Var2.b2;
                        if (launchActivity4 != null && launchActivity4.checkSelfPermission("android.permission.CAMERA") != 0) {
                            j95Var2.b2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                j95Var2.c2[0].d(1, false);
                                if (j95Var2.t2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) == 2) {
                                        z22 = false;
                                    }
                                    c85 c85Var = new c85(j95Var2, launchActivity3, z22);
                                    j95Var2.t2 = c85Var;
                                    c85Var.setBottomPadding(j95Var2.b.getPaddingBottom());
                                    j95Var2.c.addView(j95Var2.t2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            j95Var2.M1(true, false);
                            j95Var2.L1(false);
                            j95Var2.T2.B();
                            j95Var2.E0(true);
                            j95Var2.o1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        g75 g75Var2 = j95Var2.T3;
                        zz3 zz3Var = g75Var2.i0;
                        if (g75Var2.h0) {
                            hl.r(zz3Var);
                        }
                        hl.d3(zz3Var, 3000L);
                        g75Var2.h0 = true;
                        vc2 vc2Var22 = j95Var2.T2;
                        if (vc2Var22 != null && !vc2Var22.k()) {
                            j95Var2.F1();
                            j95.m1(launchActivity3, new z55(j95Var2, (byte) 5), false, false);
                            return;
                        }
                        j95Var2.dismiss();
                        return;
                }
            }
        });
        j95Var.K1(false);
        j95Var.F1();
        j95Var.L1(false);
        j95Var.M1(false, false);
        j95Var.v1(0.0f);
        j95Var.N1();
        j95Var.b.addView(new FrameLayout(launchActivity2), tre.e(-1, 200, 87));
        j95Var.u1.setOnClickListener(new x55(j95Var, (byte) 5));
        j95Var.K0();
        iye.a(j95Var.r1);
        iye.a(j95Var.s1);
        iye.a(j95Var.p1);
        iye.a(j95Var.q1);
        iye.a(j95Var.v1);
        iye.a(j95Var.t1);
        iye.a(j95Var.u1);
        ViewGroup viewGroup2 = j95Var.b;
        a65 a65Var = new a65(j95Var, (byte) 1);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(viewGroup2, a65Var);
    }

    public static void A1(b8 b8Var, int i) {
        if (b8Var != null) {
            b8Var.d(i, i);
            if (b8Var.getRightIcon() != null) {
                b8Var.getRightIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static void T0(LaunchActivity launchActivity, k5 k5Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z, String str) {
        LaunchActivity launchActivity2;
        j95 j95Var;
        TLRPC.GroupCall groupCall;
        vc2 vc2Var;
        if (s5 == null && er9.Q0 == null) {
            if (inputPeer == null) {
                if (VoIPService.getSharedInstance() != null && (vc2Var = VoIPService.getSharedInstance().groupCall) != null) {
                    TLRPC.GroupCall groupCall2 = vc2Var.b;
                    if (groupCall2 != null && groupCall2.rtmp_stream && !vc2Var.k()) {
                        if (er9.Q0 == null && launchActivity != null) {
                            er9 er9Var = new er9(launchActivity, k5Var, vc2Var, uc7.s1(k5Var.a).M0(Long.valueOf(vc2Var.c)));
                            er9.Q0 = er9Var;
                            er9Var.show();
                            return;
                        }
                        return;
                    }
                    TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(vc2Var.c));
                    vc2Var.b(true);
                    j95Var = new j95(launchActivity, k5Var, vc2Var, M0, null, z, str);
                    s5 = j95Var;
                    launchActivity2 = launchActivity;
                } else {
                    return;
                }
            } else {
                vc2 g1 = uc7.s1(k5Var.a).g1(chat.id, false, null);
                if (g1 == null || (groupCall = g1.b) == null || !groupCall.rtmp_stream || g1.k()) {
                    launchActivity2 = launchActivity;
                    j95 j95Var2 = new j95(launchActivity2, k5Var, g1, chat, inputPeer, z, str);
                    s5 = j95Var2;
                    j95Var = j95Var2;
                } else {
                    return;
                }
            }
            j95Var.b2 = launchActivity2;
            hl.c3(new jm3((byte) 12));
        }
    }

    public static String X0(int i) {
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
                return ob6.M0(2131743155, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return ob6.M0(2131743153, null);
            } else {
                return ob6.M0(2131743152, null);
            }
        }
        return ob6.M0(2131743151, null);
    }

    public static String Y0(int i) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return ob6.a0(null, null, 2131743149, str);
            }
            return ob6.M0(2131743150, null);
        } else if (i == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return ob6.M0(2131743148, null);
            }
            return ob6.M0(2131743147, null);
        } else {
            return ob6.M0(2131743146, null);
        }
    }

    public static String c1() {
        String[] strArr = jx3.i[(int) Math.floor(Math.random() * 8.0d)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static boolean i1(int i) {
        if (i != 2 && i != 4 && i != 5 && i != 6 && i != 7) {
            return false;
        }
        return true;
    }

    public static void m1(Context context, Runnable runnable, boolean z, boolean z2) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            vc2 vc2Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z2 && xc2.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                id idVar = alertDialog$Builder.a;
                if (isConference) {
                    idVar.S = ob6.M0(2131743120, null);
                    idVar.U = ob6.M0(2131743121, null);
                } else if (xc2.W(chat)) {
                    idVar.S = ob6.M0(2131743123, null);
                    idVar.U = ob6.M0(2131743124, null);
                } else {
                    idVar.S = ob6.M0(2131743013, null);
                    idVar.U = ob6.M0(2131743014, null);
                }
                sharedInstance.getAccount();
                sg2[] sg2VarArr = new sg2[1];
                LinearLayout j = uh9.j(context, 1);
                if (!sharedInstance.isConference() || (vc2Var != null && (groupCall = vc2Var.b) != null && groupCall.creator)) {
                    sg2 sg2Var = new sg2(context, 1);
                    sg2VarArr[0] = sg2Var;
                    sg2Var.setBackground(aob.L0(false));
                    if (z) {
                        sg2VarArr[0].setTextColor(aob.w0(null, aob.j5, false));
                    } else {
                        sg2VarArr[0].setTextColor(aob.w0(null, aob.Yg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) sg2VarArr[0].getCheckBoxView();
                        int i = aob.ih;
                        int i2 = aob.gh;
                        int i3 = aob.eh;
                        checkBoxSquare.s = i;
                        checkBoxSquare.w = i2;
                        checkBoxSquare.x = i3;
                        checkBoxSquare.invalidate();
                    }
                    sg2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        sg2VarArr[0].e(ob6.M0(2131743122, null), "", false, false, false);
                    } else if (xc2.W(chat)) {
                        sg2VarArr[0].e(ob6.M0(2131743125, null), "", false, false, false);
                    } else {
                        sg2VarArr[0].e(ob6.M0(2131743015, null), "", false, false, false);
                    }
                    sg2 sg2Var2 = sg2VarArr[0];
                    if (ob6.a0) {
                        L = hl.L(16.0f);
                    } else {
                        L = hl.L(8.0f);
                    }
                    if (ob6.a0) {
                        L2 = hl.L(8.0f);
                    } else {
                        L2 = hl.L(16.0f);
                    }
                    sg2Var2.setPadding(L, 0, L2, 0);
                    j.addView(sg2VarArr[0], tre.o(-1, -2));
                    sg2VarArr[0].setOnClickListener(new je(sg2VarArr, (byte) 2));
                }
                alertDialog$Builder.n(j);
                idVar.J = aob.gh;
                alertDialog$Builder.j(ob6.M0(2131743016, null), new jn1(vc2Var, sg2VarArr, selfId, runnable, (byte) 4));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                if (z) {
                    idVar.Q0 = false;
                }
                if (z) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        idVar.getWindow().setType(2038);
                    } else {
                        idVar.getWindow().setType(2003);
                    }
                    idVar.getWindow().clearFlags(2);
                }
                if (!z) {
                    idVar.j(aob.w0(null, aob.lh, false));
                }
                idVar.show();
                if (!z) {
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.mh, null);
                    }
                    idVar.o(aob.w0(null, aob.Yg, false));
                    return;
                }
                return;
            }
            r1(vc2Var, false, selfId, runnable);
        }
    }

    public static void r1(vc2 vc2Var, boolean z, long j, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z ? 1 : 0);
        }
        if (vc2Var != null) {
            ArrayList arrayList = vc2Var.f;
            ArrayList arrayList2 = vc2Var.e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(j);
            if (groupCallParticipant != null) {
                vc2Var.d.e(j);
                arrayList2.remove(groupCallParticipant);
                vc2Var.g.remove(groupCallParticipant);
                int i = 0;
                while (i < arrayList.size()) {
                    if (r47.B1(((wc2) arrayList.get(i)).a.peer) == r47.B1(groupCallParticipant.peer)) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                TLRPC.GroupCall groupCall = vc2Var.b;
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
        jn7.e().k(jn7.v2, new Object[0]);
    }

    public final boolean B1(android.view.View r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.B1(android.view.View):boolean");
    }

    public final void C1(View view) {
        if (this.f2 == null) {
            lg5 lg5Var = new lg5(8, null, getContext(), true);
            this.f2 = lg5Var;
            lg5Var.setAlpha(0.0f);
            this.f2.setVisibility(4);
            this.f2.setShowingDuration(3000L);
            this.b.addView(this.f2, tre.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            boolean W = xc2.W(this.S2);
            lg5 lg5Var2 = this.f2;
            if (W) {
                lg5Var2.setText(ob6.M0(2131743117, null));
            } else {
                lg5Var2.setText(ob6.M0(2131742999, null));
            }
            this.f2.b();
        }
        this.f2.setExtraTranslationY(-hl.m);
        this.f2.c(view);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D1() {
        vc2 vc2Var = this.T2;
        if (vc2Var != null && vc2Var.b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            vc2 vc2Var2 = this.T2;
            togglegroupcallsettings.call = vc2Var2.h(vc2Var2.a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(this.T2.b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
            to3 to3Var = Utilities.d;
            Objects.requireNonNull(to3Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new pe2(to3Var, (byte) 0), new h65(this, (byte) 1));
        }
    }

    @Override
    public final boolean E() {
        return !this.T3.b;
    }

    public final void E0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.E0(boolean):void");
    }

    public final void E1(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        vc2 vc2Var = this.T2;
        kmc kmcVar = this.u1;
        kmc kmcVar2 = this.q1;
        kmc kmcVar3 = this.s1;
        kmc kmcVar4 = this.p1;
        kmc kmcVar5 = this.r1;
        kmc kmcVar6 = this.t1;
        kmc kmcVar7 = this.v1;
        boolean z11 = true;
        t65 t65Var = this.o1;
        boolean z12 = false;
        if (vc2Var != null && !vc2Var.k()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !H0()) {
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
            t65Var.c(kmcVar7, true, z);
            t65Var.c(kmcVar6, true, z);
            t65Var.c(kmcVar5, z8, z);
            t65Var.c(kmcVar4, z12, z);
            t65Var.c(kmcVar3, z7, z);
            t65Var.c(kmcVar2, z9, z);
            t65Var.c(kmcVar, z6, z);
            return;
        }
        if (this.O2 > 0.1f) {
            z2 = true;
        } else {
            z2 = false;
        }
        t65Var.c(kmcVar7, z2, z);
        if (this.O2 > 0.1f) {
            z3 = true;
        } else {
            z3 = false;
        }
        t65Var.c(kmcVar6, z3, z);
        if (this.O2 <= 0.1f) {
            z11 = false;
        }
        t65Var.c(kmcVar3, z11, z);
        t65Var.c(kmcVar5, false, z);
        t65Var.c(kmcVar4, false, z);
        t65Var.c(kmcVar2, false, z);
        t65Var.c(kmcVar, false, z);
    }

    public final void F0(q95 q95Var, boolean z) {
        if (!this.J) {
            if (z) {
                if (q95Var.getRenderer() == null) {
                    q95Var.setRenderer(ka5.c(this.R3, this.T3, q95Var, null, null, q95Var.getParticipant(), this.T2, this));
                }
            } else if (q95Var.getRenderer() != null) {
                q95Var.getRenderer().setPrimaryView(null);
                q95Var.setRenderer(null);
            }
        }
    }

    public final void F1() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        TLObject M0;
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i5;
        int i6;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        vc2 vc2Var2 = this.T2;
        s7 s7Var = this.b3;
        s7 s7Var2 = this.d3;
        if (vc2Var2 == null || vc2Var2.k()) {
            this.c3.setVisibility(4);
            s7Var2.setVisibility(8);
            if (this.T2 == null) {
                s7Var.setVisibility(8);
                return;
            }
        }
        if (this.e2) {
            return;
        }
        k5 k5Var = this.n1;
        TLRPC.Chat M02 = uc7.s1(k5Var.a).M0(Long.valueOf(a1()));
        if (M02 != null) {
            this.S2 = M02;
        }
        boolean y = xc2.y(3, this.S2);
        b8 b8Var = this.e3;
        if (!y && (((xc2.T(this.S2) && ((chat2 = this.S2) == null || !chat2.megagroup)) || (!xc2.t0(this.S2) && !xc2.y(3, this.S2))) && (!xc2.T(this.S2) || (chat = this.S2) == null || chat.megagroup || !xc2.t0(chat)))) {
            b8Var.setVisibility(8);
        } else {
            b8Var.setVisibility(0);
        }
        vc2 vc2Var3 = this.T2;
        b8 b8Var2 = this.t3;
        b8 b8Var3 = this.s3;
        if (vc2Var3 != null && (groupCall2 = vc2Var3.b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            b8Var3.setVisibility(i5);
            if (this.T2.b.messages_enabled) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            b8Var2.setVisibility(i6);
        } else {
            b8Var3.setVisibility(8);
            b8Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(r47.B1(this.u2));
        vc2 vc2Var4 = this.T2;
        b8 b8Var4 = this.h3;
        if (vc2Var4 != null && !vc2Var4.k() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            b8Var4.setVisibility(0);
        } else {
            b8Var4.setVisibility(8);
        }
        if (xea.E0) {
            i = 2131232266;
        } else {
            i = 2131232265;
        }
        b8Var4.setIcon(i);
        if (xea.E0) {
            i2 = 2131742932;
        } else {
            i2 = 2131742933;
        }
        b8Var4.setSubtext(ob6.M0(i2, null));
        vc2 vc2Var5 = this.T2;
        if (vc2Var5 != null && !vc2Var5.k() && DictationAsr.G()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        b8 b8Var5 = this.i3;
        b8Var5.setVisibility(i3);
        boolean a = u86.a();
        this.j3.a(a, false);
        if (a) {
            i4 = 2131744964;
        } else {
            i4 = 2131744965;
        }
        b8Var5.setSubtext(ob6.M0(i4, null));
        H1();
        boolean H0 = H0();
        b8 b8Var6 = this.r3;
        b8 b8Var7 = this.f3;
        b8 b8Var8 = this.n3;
        b8 b8Var9 = this.o3;
        if (H0) {
            b8Var6.setVisibility(0);
            b8Var7.setVisibility(0);
            if (j1()) {
                b8Var8.setVisibility(0);
                b8Var9.setVisibility(8);
            } else if (this.T2.k()) {
                b8Var8.setVisibility(8);
                b8Var9.setVisibility(8);
            } else {
                b8Var8.setVisibility(0);
            }
            if (h1()) {
                b8Var8.setVisibility(8);
                b8Var7.setVisibility(8);
            }
            if (this.T2.c() && !this.T2.k()) {
                b8Var9.setVisibility(0);
            } else {
                b8Var9.setVisibility(8);
            }
            s7Var2.setVisibility(8);
            boolean z4 = this.T2.w;
            f95 f95Var = this.W2;
            f95Var.f = z4;
            f95Var.d = 1.0f;
            f95Var.invalidateSelf();
            boolean z5 = this.T2.w;
            z55 z55Var = this.x3;
            if (z5) {
                if (z55Var == null) {
                    z55 z55Var2 = new z55(this, (byte) 6);
                    this.x3 = z55Var2;
                    hl.d3(z55Var2, 1000L);
                }
                b8Var8.setText(ob6.M0(2131742975, null));
            } else {
                if (z55Var != null) {
                    hl.r(z55Var);
                    this.x3 = null;
                }
                b8Var8.setText(ob6.M0(2131743000, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                b8Var9.j(ob6.M0(2131743086, null), 2131232358, null);
            } else {
                b8Var9.j(ob6.M0(2131743088, null), 2131232357, null);
            }
            J1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !H0()) {
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
                    s7Var2.setVisibility(8);
                    b8Var9.setVisibility(0);
                    b8Var9.j(ob6.M0(2131743086, null), 2131232358, null);
                    b8Var9.setContentDescription(ob6.M0(2131743086, null));
                } else {
                    b8Var9.j(ob6.M0(2131743088, null), 2131232357, null);
                    b8Var9.setContentDescription(ob6.M0(2131743088, null));
                    s7Var2.setVisibility(8);
                    b8Var9.setVisibility(0);
                }
            } else {
                s7Var2.setVisibility(8);
                b8Var9.setVisibility(8);
            }
            b8Var6.setVisibility(8);
            b8Var7.setVisibility(8);
            b8Var8.setVisibility(8);
        }
        boolean H02 = H0();
        b8 b8Var10 = this.m3;
        if (H02 && this.T2.b.can_change_join_muted && !h1()) {
            b8Var10.setVisibility(0);
        } else {
            b8Var10.setVisibility(8);
        }
        if (h1() && ((vc2Var = this.T2) == null || (groupCall = vc2Var.b) == null || !groupCall.creator)) {
            z3 = false;
        } else {
            z3 = true;
        }
        s7Var.Q(4, z3);
        this.g3.setVisibility(0);
        int visibility = b8Var7.getVisibility();
        TextView textView = this.v3;
        if (visibility != 0 && b8Var10.getVisibility() != 0 && b8Var.getVisibility() != 0 && b8Var9.getVisibility() != 0 && b8Var8.getVisibility() != 0 && b8Var6.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        l5 l5Var = this.d2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.U2) && !j1() && this.u2 != null) {
            l5Var.setVisibility(0);
            long B1 = r47.B1(this.u2);
            boolean D = wf3.D(B1);
            int i7 = k5Var.a;
            if (D) {
                M0 = uc7.s1(i7).X1(Long.valueOf(B1));
            } else {
                M0 = uc7.s1(i7).M0(Long.valueOf(-B1));
            }
            l5Var.setObject(M0);
        } else {
            l5Var.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.S2;
        if (chat3 != null && !xc2.W(chat3) && j1() && b8Var.getVisibility() == 8) {
            s7Var.setVisibility(8);
        } else {
            s7Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.a3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams.rightMargin != hl.L(96.0f)) {
            layoutParams.rightMargin = hl.L(96.0f);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.u3.getLayoutParams()).rightMargin = 0;
        this.H1.setTitleRightMargin(hl.L(48.0f) << 1);
    }

    public final int G0() {
        t85 t85Var = this.J1;
        int childCount = t85Var.getChildCount();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = t85Var.getChildAt(i2);
            if (RecyclerView.S(childAt) >= 0) {
                i = Math.min(i, childAt.getTop());
            }
        }
        return i;
    }

    public final void G1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.G1():void");
    }

    @Override
    public final void H() {
        LaunchActivity launchActivity;
        vc2 vc2Var;
        vc2 vc2Var2;
        TLRPC.GroupCall groupCall;
        ArrayList arrayList = this.R3;
        ArrayList arrayList2 = this.S3;
        g75 g75Var = this.T3;
        if (g75Var != null) {
            if (this.i4 != null) {
                this.J1.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                ((ka5) arrayList2.get(i)).f();
                g75Var.removeView((View) arrayList2.get(i));
                ((ka5) arrayList2.get(i)).e();
                ((ka5) arrayList2.get(i)).b(true);
            }
            arrayList.clear();
            if (g75Var.getParent() != null) {
                arrayList.clear();
                this.b.removeView(g75Var);
            }
        }
        u86 u86Var = this.l3;
        if (u86Var.d) {
            u86Var.d = false;
            Thread thread = u86Var.e;
            if (thread != null) {
                thread.interrupt();
                u86Var.e = null;
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
        ra5.k(getContext());
        vc2 vc2Var3 = this.T2;
        if (vc2Var3 != null) {
            ArrayList arrayList3 = vc2Var3.e;
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i2)).videoIndex = 0;
            }
            vc2Var3.B();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
        if (this.o2 && (launchActivity = this.b2) != null && !launchActivity.isFinishing() && (vc2Var = this.T2) != null) {
            LaunchActivity launchActivity2 = this.b2;
            k5 k5Var = this.n1;
            long j = vc2Var.b.id;
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (vc2Var2 = sharedInstance.groupCall) != null && (groupCall = vc2Var2.b) != null && groupCall.id == j) {
                T0(launchActivity2, k5Var, null, null, false, null);
            } else {
                jn7.e().a(new k85(j, launchActivity2, k5Var), jn7.v2);
            }
        }
    }

    public final boolean H0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            vc2 vc2Var = this.T2;
            if (vc2Var != null && (groupCall = vc2Var.b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return xc2.w(14, this.S2);
    }

    public final void H1() {
        boolean z;
        long j;
        String str;
        vc2 vc2Var;
        if (this.l3 != null) {
            int i = 0;
            if (u86.a() && (vc2Var = this.T2) != null && !vc2Var.k() && s5 == this) {
                z = true;
            } else {
                z = false;
            }
            u86 u86Var = this.l3;
            if (z) {
                if (!u86Var.d) {
                    final u86 u86Var2 = this.l3;
                    Context context = getContext();
                    int i2 = this.n1.a;
                    TLRPC.Chat chat = this.S2;
                    if (chat != null) {
                        j = -chat.id;
                    } else {
                        j = 0;
                    }
                    if (!u86Var2.d) {
                        u86Var2.d = true;
                        final pm3 X = DictationAsr.X(in3.c(context, j));
                        boolean y = DictationAsr.y();
                        u86Var2.c = y;
                        if (y) {
                            ExecutorService executorService = DictationLid.a;
                            if (DictationAsr.y()) {
                                DictationLid.a(context);
                            }
                        }
                        StringBuilder sb = new StringBuilder("live captions: ");
                        sb.append(X);
                        if (u86Var2.c) {
                            str = ", tinylid";
                        } else {
                            str = "";
                        }
                        bs2.x(sb, str, "Dictation");
                        DictationAsr.k0((nm3) X.b, false, new om3() {
                            @Override
                            public final void a(boolean z2) {
                                u86 u86Var3 = u86.this;
                                pm3 pm3Var = X;
                                if (!u86Var3.d) {
                                    return;
                                }
                                if (!z2) {
                                    u86Var3.d = false;
                                    return;
                                }
                                NativeInstance.setIncomingAudioCapture(true);
                                Thread thread = new Thread(new z56(u86Var3, pm3Var, (byte) 4), "LiveCaptions");
                                u86Var3.e = thread;
                                thread.start();
                            }
                        });
                    }
                }
            } else if (u86Var.d) {
                u86 u86Var3 = this.l3;
                if (u86Var3.d) {
                    u86Var3.d = false;
                    Thread thread = u86Var3.e;
                    if (thread != null) {
                        thread.interrupt();
                        u86Var3.e = null;
                    }
                    try {
                        NativeInstance.setIncomingAudioCapture(false);
                    } catch (Throwable unused) {
                    }
                }
                x86 x86Var = this.k3;
                x86Var.getClass();
                ArrayList arrayList = new ArrayList(x86Var.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    w86 w86Var = (w86) obj;
                    x86Var.a.remove(w86Var);
                    x86Var.removeView(w86Var);
                }
            }
        }
    }

    public final void I0() {
        if (this.K3) {
            this.K3 = false;
            hl.r(this.q4);
        }
        if (this.L3) {
            this.L3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.v1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void I1(int r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.I1(int, boolean):void");
    }

    public final void J0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.J0():void");
    }

    public final void J1() {
        if (this.T2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.n1.a).getCurrentTime();
        vc2 vc2Var = this.T2;
        int i = currentTime - vc2Var.b.record_start_date;
        boolean z = vc2Var.w;
        b8 b8Var = this.n3;
        if (z) {
            b8Var.setSubtext(hl.g0(i, false, false));
        } else {
            b8Var.setSubtext(null);
        }
    }

    public final void K0() {
        this.y1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom());
        this.z1.invalidate();
        Q0();
        P0();
        N0();
        O0();
        R0();
        this.o1.setAlpha(1.0f - this.o5.e);
        L0();
        M0();
    }

    public final void K1(boolean z) {
        float interpolation;
        float f;
        z75 z75Var = this.K1;
        if ((z75Var == null || this.T2 != null) && this.Q2 == null) {
            this.P2 = 1.0f;
            this.O2 = 1.0f;
            if (z75Var == null) {
                return;
            }
        }
        int i = 4;
        if (!z) {
            y65 y65Var = this.o4;
            hl.r(y65Var);
            y65Var.run();
            vc2 vc2Var = this.T2;
            t85 t85Var = this.J1;
            if (vc2Var != null && !vc2Var.k()) {
                t85Var.setVisibility(0);
            } else {
                t85Var.setVisibility(4);
            }
            boolean W = xc2.W(this.S2);
            b8 b8Var = this.r3;
            if (W) {
                b8Var.setText(ob6.M0(2131743140, null));
            } else {
                b8Var.setText(ob6.M0(2131743047, null));
            }
        }
        float f2 = this.O2;
        if (f2 > 0.6f) {
            interpolation = 1.05f - (k43.f.getInterpolation((f2 - 0.6f) / 0.4f) * 0.05f);
            this.P2 = 1.0f;
            f = 1.0f;
        } else {
            k43 k43Var = k43.f;
            this.P2 = k43Var.getInterpolation(f2 / 0.6f);
            interpolation = 1.05f * k43Var.getInterpolation(this.O2 / 0.6f);
            f = this.O2 / 0.6f;
        }
        E1(true);
        float f3 = 1.0f - f;
        z75Var.setAlpha(f3);
        this.N1.setAlpha(f);
        this.P1.setAlpha(f);
        s85 s85Var = this.O1;
        s85Var.setAlpha(f);
        s85Var.setScaleX(interpolation);
        s85Var.setScaleY(interpolation);
        x75 x75Var = this.M1;
        x75Var.setScaleX(f3);
        x75Var.setScaleY(f3);
        x75Var.setAlpha(f3);
        this.L1.setAlpha(f3);
        this.b3.setAlpha(f);
        if (f3 != 0.0f) {
            i = 0;
        }
        if (i != z75Var.getVisibility()) {
            z75Var.setVisibility(i);
            x75Var.setVisibility(i);
        }
    }

    public final void L0() {
        int i;
        float f = this.w3.b.a;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        t75 t75Var = this.y1;
        t75Var.setAlpha(f);
        s75 s75Var = this.z1;
        s75Var.setAlpha(f);
        if (t75Var.getVisibility() != i) {
            t75Var.setVisibility(i);
            s75Var.setVisibility(i);
            if (i == 8) {
                q75 q75Var = this.A1;
                if (q75Var.isFocused()) {
                    q75Var.clearFocus();
                }
            }
        }
    }

    public final void L1(boolean z) {
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        kmc kmcVar = this.s1;
        if (kmcVar != null && kmcVar.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            t65 t65Var = this.o1;
            boolean z5 = false;
            if (sharedInstance == null) {
                kmcVar.c(2131232440, -1, 0, 0.3f, true, ob6.M0(2131743089, null), false, z);
                if (!xc2.t0(this.S2) && (!xc2.N(this.S2) || !xc2.w(3, this.S2))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                k95 k95Var = (k95) t65Var.c.get(kmcVar);
                if (k95Var != null) {
                    k95Var.d.a(z4, z);
                    kmcVar.setEnabled(z4);
                }
                kmcVar.b(true, false);
                return;
            }
            k95 k95Var2 = (k95) t65Var.c.get(kmcVar);
            if (k95Var2 != null) {
                k95Var2.d.a(true, z);
                kmcVar.setEnabled(true);
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
                kmcVar.c(2131230916, -1, 0, 0.1f, true, ob6.M0(2131743155, null), false, z);
            } else if (z3) {
                kmcVar.c(2131230924, -1, 0, 0.3f, true, ob6.M0(2131742891, null), false, z);
            } else if (sharedInstance.isHeadsetPlugged()) {
                kmcVar.c(2131230919, -1, 0, 0.1f, true, ob6.M0(2131743153, null), false, z);
            } else {
                kmcVar.c(2131230924, -1, 0, 0.1f, true, ob6.M0(2131742891, null), false, z);
            }
            kmcVar.b(z3, z);
            Z0();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                i = 2131231091;
            } else {
                i = 2131231173;
            }
            if (this.T1 != i) {
                this.T1 = i;
                hl.L3(this.U1, i);
            }
            kmc kmcVar2 = this.q1;
            if (kmcVar2.getVisibility() == 0) {
                kmcVar2.c(0, -1, 0, 1.0f, true, X0(Z0()), false, z);
                if (Z0() != 1) {
                    z5 = true;
                }
                kmcVar2.b(z5, z);
            }
        }
    }

    public final void M0() {
        int i;
        i49 i49Var = this.D1;
        if (i49Var != null) {
            float f = this.w3.b.a * this.p5.e;
            i49Var.setAlpha(f);
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
            i49 i49Var2 = this.D1;
            if (!i49Var2.O0 && f == 1.0f) {
                i49Var2.O0 = true;
            }
        }
    }

    public final void M1(boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.M1(boolean, boolean):void");
    }

    public final void N0() {
        boolean z = v5;
        t65 t65Var = this.o1;
        if (z) {
            t65Var.setTranslationX(0.0f);
            t65Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            t65Var.setTranslationX(fm0Var.e * hl.L(94.0f));
            t65Var.setTranslationY(0.0f);
            return;
        }
        t65Var.setTranslationX(0.0f);
        t65Var.setTranslationY(fm0Var.e * hl.L(94.0f));
    }

    public final void N1() {
        boolean z;
        String str;
        float f;
        float f2;
        TLRPC.Chat M0;
        TLRPC.User user;
        e85 e85Var = this.H1;
        if (e85Var != null && this.T2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i = 0;
            for (int i2 = 0; i2 < this.T2.P.m(); i2++) {
                long j = this.T2.P.j(i2);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.P.f(j);
                if (!groupCallParticipant.self) {
                    g75 g75Var = this.T3;
                    g75Var.getClass();
                    if (g75Var.x.get(r47.B1(groupCallParticipant.peer)) <= 0 && this.r4.get(j, 0) != 1) {
                        long B1 = r47.B1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i < 2) {
                            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                            int i4 = this.a;
                            if (i3 > 0) {
                                user = uc7.s1(i4).X1(Long.valueOf(B1));
                                M0 = null;
                            } else {
                                M0 = uc7.s1(i4).M0(Long.valueOf(B1));
                                user = null;
                            }
                            if (user != null || M0 != null) {
                                if (i != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(lbc.k(user, true), new y7c(hl.o()), 0);
                                } else {
                                    spannableStringBuilder.append(M0.title, new y7c(hl.o()), 0);
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
                String J0 = ob6.J0(i, "MembersAreSpeakingToast");
                int indexOf = J0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                e85Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z = true;
            } else {
                z = false;
            }
            ema subtitleTextView = e85Var.getSubtitleTextView();
            if (j1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            subtitleTextView.k(ob6.G(this.T2.b.participants_count + ((!this.I1.M && VoIPService.getSharedInstance() != null) ? !VoIPService.getSharedInstance().isJoined() : 0), str, new Object[0]));
            if (z != this.m4) {
                this.m4 = z;
                e85Var.invalidate();
                float f3 = 0.0f;
                e85Var.getSubtitleTextView().setPivotX(0.0f);
                e85Var.getSubtitleTextView().setPivotY(e85Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = e85Var.getSubtitleTextView().animate();
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
                hl.R3(e85Var.getAdditionalSubtitleTextView(), this.m4);
            }
        }
    }

    public final void O0() {
        boolean z = v5;
        c75 c75Var = this.e4;
        if (z) {
            c75Var.setTranslationX(0.0f);
            c75Var.setTranslationY(0.0f);
            return;
        }
        boolean z2 = u5;
        fm0 fm0Var = this.o5;
        if (z2) {
            c75Var.setTranslationX(fm0Var.e * hl.L(94.0f));
            c75Var.setTranslationY(0.0f);
            return;
        }
        c75Var.setTranslationX(0.0f);
        c75Var.setTranslationY(fm0Var.e * hl.L(94.0f));
    }

    public final void O1(boolean z) {
        vc2 vc2Var = this.T2;
        x65 x65Var = this.X2;
        if (vc2Var == null) {
            if (xc2.W(this.S2)) {
                x65Var.b(ob6.M0(2131743114, null), z);
                return;
            } else {
                x65Var.b(ob6.M0(2131742993, null), z);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(vc2Var.b.title);
        e85 e85Var = this.H1;
        if (!isEmpty) {
            if (!this.T2.b.title.equals(e85Var.getTitle())) {
                vc2 vc2Var2 = this.T2;
                e85 e85Var2 = this.H1;
                if (z) {
                    e85Var2.N(vc2Var2.b.title, true, 180L, null);
                    e85Var.getTitleTextView().setOnClickListener(new x55(this, (byte) 7));
                } else {
                    e85Var2.setTitle(vc2Var2.b.title);
                }
                x65Var.b(this.T2.b.title, z);
            }
        } else {
            TLRPC.Chat chat = this.S2;
            if (chat != null && !chat.title.equals(e85Var.getTitle())) {
                TLRPC.Chat chat2 = this.S2;
                e85 e85Var3 = this.H1;
                if (z) {
                    e85Var3.N(chat2.title, true, 180L, null);
                    e85Var.getTitleTextView().setOnClickListener(new x55(this, (byte) 8));
                } else {
                    e85Var3.setTitle(chat2.title);
                }
                if (xc2.W(this.S2)) {
                    if (j1()) {
                        x65Var.b(this.S2.title, z);
                    } else {
                        x65Var.b(ob6.M0(2131743099, null), z);
                    }
                } else {
                    x65Var.b(ob6.M0(2131742958, null), z);
                }
            } else if (this.S2 == null) {
                e85Var.setTitle(ob6.M0(2131751788, null));
                x65Var.b(ob6.M0(2131751788, null), z);
            }
        }
        ema titleTextView = e85Var.getTitleTextView();
        if (this.T2.w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new g95(titleTextView));
                TextView textView = x65Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g95(textView), (Drawable) null);
                TextView nextTextView = x65Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new g95(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            x65Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            x65Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void P0() {
        float L;
        int i;
        float f = this.q5.f;
        v2d v2dVar = this.w3;
        float f2 = -((v2dVar.d() - this.b.getPaddingBottom()) + f + (hl.L(68.0f) * this.p5.e) + hl.L(10.0f));
        if (v5) {
            L = (1.0f - this.r5.e) * hl.L(-91.0f);
        } else if (u5) {
            L = 0.0f;
        } else {
            L = ((this.o5.e * hl.L(94.0f)) - (hl.L(104.0f) * this.T3.c)) - hl.L(91.0f);
        }
        float R1 = hl.R1(L, f2, v2dVar.b.a);
        float measuredHeight = ((this.b.getMeasuredHeight() - this.s2) + R1) - this.t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - hl.L(250.0f));
        x86 x86Var = this.k3;
        if (x86Var != null) {
            i = x86Var.getContentHeight();
            x86Var.setTranslationY(R1);
        } else {
            i = 0;
        }
        float f3 = i;
        da5 da5Var = this.V1;
        da5Var.setTranslationY(R1 - f3);
        da5Var.setVisibleHeight((int) Math.max(0.0f, max - f3));
    }

    public final void P1() {
        float f;
        z11 z11Var;
        boolean z;
        if (this.F != null) {
            int L = hl.L(74.0f);
            float f2 = this.s2 - L;
            if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
                int L2 = (L - this.t0) - hl.L(14.0f);
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / L2);
                f2 -= (int) ((a.getCurrentActionBarHeight() - L2) * f);
            } else {
                f = 0.0f;
            }
            float paddingTop = f2 + this.b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            e85 e85Var = this.H1;
            frameLayout.setTranslationY(hl.R1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + hl.L(10.0f), e85Var.getY() + (-this.F.getTop()) + e85Var.getHeight(), f));
            v21 v21Var = v21.x;
            if (v21Var != null && (z11Var = v21Var.e) != null && z11Var.getParent() != null && z11Var.getParent().getParent() == this.F) {
                if (f > 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                z11Var.setTop(z);
            }
        }
    }

    public final void Q0() {
        if (this.D1 != null) {
            this.D1.setTranslationY((-this.w3.d()) + this.b.getPaddingBottom() + ((-this.p5.e) * hl.L(64.0f)));
        }
    }

    public final void R0() {
        boolean z;
        float f = this.p5.e;
        float R1 = hl.R1(0.25f, 1.0f, f);
        ImageView imageView = this.C1;
        imageView.setScaleX(R1);
        imageView.setScaleY(hl.R1(0.25f, 1.0f, f));
        imageView.setAlpha(f);
        boolean z2 = false;
        if (f > 0.9f) {
            z = true;
        } else {
            z = false;
        }
        imageView.setClickable(z);
        float f2 = 1.0f - f;
        float R12 = hl.R1(0.25f, 1.0f, f2);
        ImageView imageView2 = this.B1;
        imageView2.setScaleX(R12);
        imageView2.setScaleY(hl.R1(0.25f, 1.0f, f2));
        imageView2.setAlpha(f2);
        if (f2 > 0.9f) {
            z2 = true;
        }
        imageView2.setClickable(z2);
    }

    @Override
    public final ArrayList S() {
        return new ArrayList();
    }

    public final void S0() {
        ka5 ka5Var = this.O4;
        if (ka5Var != null) {
            ka5Var.a.setRoundCorners(hl.L(8.0f));
            ka5 ka5Var2 = this.O4;
            ka5Var2.h = false;
            ka5Var2.j(false);
            this.O4.invalidate();
            this.T3.invalidate();
        }
        zb5 zb5Var = this.M4;
        if (zb5Var != null && !this.Q4 && zb5Var.getParent() != null) {
            this.b.removeView(this.M4);
        }
        zb5 zb5Var2 = this.M4;
        if (zb5Var2 != null) {
            zb5Var2.setProgressToAvatarPreview(0.0f);
            this.M4.setAboutVisible(false);
            this.M4.getAvatarImageView().setAlpha(1.0f);
        }
        o95 o95Var = this.P4;
        if (o95Var != null) {
            o95Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.M4 = null;
        this.N4 = null;
        this.P4 = null;
        this.O4 = null;
    }

    public final void U0(boolean z) {
        if (!this.R4 && this.Y3) {
            if (z) {
                this.R4 = true;
                t1(false, this.M4);
                return;
            }
            S0();
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
                E0(true);
            }
            J0();
        }
    }

    public final void V0(int[] iArr, int i) {
        if (j1()) {
            int i2 = aob.Bh;
            iArr[0] = aob.w0(null, i2, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.Ch, false), aob.w0(null, aob.qh, false));
            iArr[2] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, i2, false));
        } else if (i == 0) {
            iArr[0] = aob.w0(null, aob.Ah, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.ph, false), aob.w0(null, aob.qh, false));
            iArr[2] = aob.w0(null, aob.oh, false);
        } else if (i == 1) {
            iArr[0] = aob.w0(null, aob.xh, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.sh, false), aob.w0(null, aob.th, false));
            iArr[2] = aob.w0(null, aob.rh, false);
        } else if (i1(i)) {
            iArr[0] = aob.w0(null, aob.bi, false);
            iArr[1] = aob.w0(null, aob.ci, false);
            iArr[2] = aob.w0(null, aob.di, false);
        } else {
            int i3 = aob.Bh;
            iArr[0] = aob.w0(null, i3, false);
            iArr[1] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.Dh, false), aob.w0(null, aob.Eh, false));
            iArr[2] = hl.R0(this.N3, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, i3, false));
        }
        if (i1(i)) {
            iArr[3] = vm2.f(0.5f, aob.w0(null, aob.Zh, false), aob.w0(null, aob.bi, false));
        } else if (i == 1) {
            iArr[3] = vm2.f(0.75f, aob.w0(null, aob.sh, false), vm2.f(0.5f, aob.w0(null, aob.wh, false), aob.w0(null, aob.yh, false)));
        } else {
            iArr[3] = vm2.f(0.5f, aob.w0(null, aob.Ah, false), aob.w0(null, aob.zh, false));
        }
    }

    public final void W0(wc2 wc2Var) {
        wc2 wc2Var2;
        if (wc2Var == null) {
            this.b2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            g75 g75Var = this.T3;
            if (g75Var.r != null) {
                return;
            }
            boolean z = v5;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.i4;
            t85 t85Var = this.J1;
            int i = 0;
            if (z) {
                if (onPreDrawListener != null) {
                    t85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                    this.i4 = null;
                }
                ArrayList arrayList = new ArrayList();
                sb5 sb5Var = this.g4;
                ArrayList arrayList2 = this.R3;
                ArrayList arrayList3 = this.S3;
                if (wc2Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        ka5 ka5Var = (ka5) arrayList3.get(i2);
                        q95 q95Var = ka5Var.c;
                        if (q95Var != null) {
                            q95Var.setRenderer(null);
                            o95 o95Var = ka5Var.d;
                            if (o95Var != null) {
                                o95Var.setRenderer(null);
                            }
                            q95 q95Var2 = ka5Var.e;
                            if (q95Var2 != null) {
                                q95Var2.setRenderer(null);
                            }
                            arrayList.add(ka5Var.x);
                            ka5Var.b(false);
                            ka5Var.animate().alpha(0.0f).setListener(new d85(this, ka5Var, (byte) 0));
                        }
                    }
                    this.F4 = false;
                    sb5Var.H(this.f4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ka5 ka5Var2 = (ka5) arrayList3.get(i3);
                        if (ka5Var2.e != null && ((wc2Var2 = ka5Var2.x) == null || !wc2Var2.equals(wc2Var))) {
                            arrayList.add(ka5Var2.x);
                            ka5Var2.b(false);
                            o95 o95Var2 = ka5Var2.d;
                            if (o95Var2 != null) {
                                o95Var2.setRenderer(null);
                            }
                            q95 q95Var3 = ka5Var2.c;
                            if (q95Var3 != null) {
                                q95Var3.setRenderer(null);
                            }
                            ka5Var2.animate().alpha(0.0f).setListener(new d85(this, ka5Var2, (byte) 1));
                        }
                    }
                    this.F4 = true;
                    sb5Var.r = false;
                    if (!arrayList.isEmpty()) {
                        hl.c3(new se4(this, arrayList, (byte) 20));
                    }
                }
                ViewTreeObserver viewTreeObserver = t85Var.getViewTreeObserver();
                gp1 gp1Var = new gp1(this, wc2Var, !g75Var.b);
                this.i4 = gp1Var;
                viewTreeObserver.addOnPreDrawListener(gp1Var);
                return;
            }
            if (onPreDrawListener != null) {
                t85Var.getViewTreeObserver().removeOnPreDrawListener(this.i4);
                this.i4 = null;
            }
            if (wc2Var != null) {
                c75 c75Var = this.e4;
                if (c75Var.getVisibility() != 0) {
                    c75Var.setVisibility(0);
                    p95 p95Var = this.h4;
                    p95Var.G(c75Var, false);
                    this.l2 = true;
                    if (!g75Var.b) {
                        ArrayList arrayList4 = p95Var.e;
                        x46 x46Var = (x46) c75Var.getLayoutManager();
                        if (x46Var != null) {
                            while (true) {
                                if (i >= arrayList4.size()) {
                                    break;
                                } else if (((wc2) arrayList4.get(i)).equals(wc2Var)) {
                                    x46Var.g1(i, hl.L(13.0f));
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = t85Var.getViewTreeObserver();
                    z zVar = new z(this, wc2Var, (byte) 3);
                    this.i4 = zVar;
                    viewTreeObserver2.addOnPreDrawListener(zVar);
                    return;
                }
                g75Var.h(wc2Var);
                hl.V3(c75Var);
            } else if (t85Var.getVisibility() != 0) {
                t85Var.setVisibility(0);
                E0(false);
                this.l2 = true;
                ViewTreeObserver viewTreeObserver3 = t85Var.getViewTreeObserver();
                i85 i85Var = new i85(this, (byte) 0);
                this.i4 = i85Var;
                viewTreeObserver3.addOnPreDrawListener(i85Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = t85Var.getViewTreeObserver();
                i85 i85Var2 = new i85(this, (byte) 1);
                this.i4 = i85Var2;
                viewTreeObserver4.addOnPreDrawListener(i85Var2);
            }
        }
    }

    public final int Z0() {
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

    public final long a1() {
        TLRPC.Chat chat = this.S2;
        if (chat == null) {
            return 0L;
        }
        return chat.id;
    }

    public final void b1(boolean z) {
        boolean z2;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        k5 k5Var = this.n1;
        int i = k5Var.a;
        int i2 = k5Var.a;
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(a1()));
        if (M0 != null && !xc2.t0(M0)) {
            TLRPC.ChatFull N0 = uc7.s1(i2).N0(a1());
            String K = xc2.K(this.S2, false);
            if (!TextUtils.isEmpty(K)) {
                str = qu6.o(uc7.s1(i2).N2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = uc7.l1(this.S2);
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_exportChatInvite, new vi1(this, N0, z, (byte) 4));
                return;
            }
            p1(null, str, true, z);
        } else if (this.T2 != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                vc2 vc2Var = this.T2;
                exportgroupcallinvite.call = vc2Var.h(vc2Var.a);
                if (i3 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                exportgroupcallinvite.can_self_unmute = z2;
                ConnectionsManager.getInstance(i2).sendRequest(exportgroupcallinvite, new f65(this, i3, z, (byte) 0));
            }
        }
    }

    public final UndoView d1() {
        if (!v5) {
            g75 g75Var = this.T3;
            if (g75Var.b) {
                return g75Var.getUndoView();
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
        wc2 wc2Var;
        boolean z;
        VoIPService sharedInstance;
        byte b;
        byte b2;
        int i7 = jn7.w2;
        t85 t85Var = this.J1;
        String[] strArr = null;
        int i8 = 0;
        if (i == i7) {
            Long l = (Long) objArr[1];
            vc2 vc2Var = this.T2;
            if (vc2Var != null && vc2Var.b.id == l.longValue()) {
                vc2 vc2Var2 = this.T2;
                if (vc2Var2.b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i9 = (this.m2 > 0L ? 1 : (this.m2 == 0L ? 0 : -1));
                k5 k5Var = this.n1;
                if (i9 == 0 && (((b2 = this.z3) == 7 || b2 == 5 || b2 == 6) && !vc2Var2.k())) {
                    try {
                        Intent intent = new Intent(this.b2, VoIPService.class);
                        intent.putExtra("chat_id", a1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.U2);
                        intent.putExtra("peerChannelId", this.R2.channel_id);
                        intent.putExtra("peerChatId", this.R2.chat_id);
                        intent.putExtra("peerUserId", this.R2.user_id);
                        intent.putExtra("hash", this.V2);
                        intent.putExtra("peerAccessHash", this.R2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", k5Var.a);
                        intent.putExtra("scheduleDate", this.c4);
                        this.b2.startService(intent);
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                    this.m2 = SystemClock.elapsedRealtime();
                    hl.d3(new z55(this, (byte) 3), 3000L);
                }
                if (j1() && !this.T2.k()) {
                    if (!this.o2) {
                        this.o2 = true;
                        dismiss();
                        return;
                    }
                    return;
                }
                if (!this.n2 && VoIPService.getSharedInstance() != null) {
                    this.T2.b(false);
                    e1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                F1();
                int childCount = t85Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = t85Var.getChildAt(i10);
                    if (childAt instanceof zb5) {
                        ((zb5) childAt).a(true, false);
                    }
                }
                if (this.M4 != null) {
                    this.l2 = true;
                } else {
                    E0(true);
                }
                N1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.z3 == 4) {
                    z = true;
                } else {
                    z = false;
                }
                M1(true, booleanValue);
                O1(true);
                if (z && ((b = this.z3) == 1 || b == 0)) {
                    d1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l2 = (Long) objArr[3];
                    long longValue = l2.longValue();
                    if (longValue != 0) {
                        if (!h1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = uc7.s1(k5Var.a).y;
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
                            if (wf3.D(longValue)) {
                                TLRPC.User X1 = uc7.s1(k5Var.a).X1(l2);
                                if (X1 != null) {
                                    if (this.T2.b.participants_count < 250 || lbc.y(X1) || X1.verified || i8 != 0) {
                                        d1().k(0L, 44, X1, this.S2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = uc7.s1(k5Var.a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.T2.b.participants_count < 250 || !xc2.r0(M02) || M02.verified || i8 != 0) {
                                    d1().k(0L, 44, M02, this.S2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i == jn7.y2) {
            g75 g75Var = this.T3;
            if (g75Var.b && this.T2 != null) {
                boolean c = g75Var.c();
                vc2 vc2Var3 = this.T2;
                if (vc2Var3 != null && g75Var.b && (wc2Var = g75Var.e) != null && vc2Var3.d.f(r47.B1(wc2Var.a.peer)) == null) {
                    c = true;
                }
                if (c) {
                    wc2 wc2Var2 = null;
                    while (true) {
                        ArrayList arrayList2 = this.j2;
                        if (i8 >= arrayList2.size()) {
                            break;
                        }
                        wc2 wc2Var3 = (wc2) arrayList2.get(i8);
                        if (this.T2.P.g(r47.B1(wc2Var3.a.peer), null) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = wc2Var3.a;
                            if (!groupCallParticipant3.muted_by_you && g75Var.d != r47.B1(groupCallParticipant3.peer)) {
                                wc2Var2 = wc2Var3;
                            }
                        }
                        i8++;
                    }
                    if (wc2Var2 != null) {
                        W0(wc2Var2);
                    }
                }
            }
            g75Var.setVisibleParticipant(true);
            N1();
        } else if (i == jn7.Q4) {
            x1(((Float) objArr[0]).floatValue());
        } else if (i == jn7.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (xc2.W(this.S2)) {
                        M0 = ob6.M0(2131743104, null);
                    } else {
                        M0 = ob6.M0(2131742971, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = c00.k(new StringBuilder(ob6.M0(2131751070, null)), "\n", str);
                } else if (xc2.W(this.S2)) {
                    M0 = ob6.M0(2131743130, null);
                } else {
                    M0 = ob6.M0(2131743022, null);
                }
                AlertDialog$Builder K = jj.K(getContext(), ob6.M0(2131742958, null), M0);
                K.i(new e65(this, (byte) 1));
                try {
                    K.o();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        } else if (i == jn7.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == a1()) {
                F1();
                M1(isShowing(), false);
            }
            long B1 = r47.B1(this.u2);
            vc2 vc2Var4 = this.T2;
            if (vc2Var4 != null && chatFull.id == (-B1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) vc2Var4.d.f(B1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                E0(true);
                hl.V3(t85Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt2 = this.u4.getChildAt(i8);
                        if ((childAt2 instanceof b8) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            b8 b8Var = (b8) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i5 = 2131743158;
                            } else {
                                i5 = 2131743068;
                            }
                            String M03 = ob6.M0(i5, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i6 = 2131232048;
                            } else {
                                i6 = 2131232190;
                            }
                            b8Var.j(M03, i6, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == jn7.u1) {
            if (((Long) objArr[0]).longValue() == a1()) {
                F1();
                M1(isShowing(), false);
            }
        } else if (i == jn7.B2) {
            int childCount2 = t85Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i8 < childCount2) {
                f89 H = t85Var.H(t85Var.getChildAt(i8));
                if (H != null) {
                    View view = H.a;
                    if (view instanceof zb5) {
                        zb5 zb5Var = (zb5) view;
                        if (zb5Var.getParticipant() != null) {
                            zb5Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i8++;
            }
        } else if (i == jn7.E0) {
            Long l3 = (Long) objArr[0];
            long B12 = r47.B1(this.u2);
            if (this.T2 != null && B12 == l3.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.T2.d.f(B12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                E0(true);
                hl.V3(t85Var);
                if (this.u4 != null) {
                    while (i8 < this.u4.getChildCount()) {
                        View childAt3 = this.u4.getChildAt(i8);
                        if ((childAt3 instanceof b8) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            b8 b8Var2 = (b8) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i3 = 2131743159;
                            } else {
                                i3 = 2131743069;
                            }
                            String M04 = ob6.M0(i3, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i4 = 2131232048;
                            } else {
                                i4 = 2131232190;
                            }
                            b8Var2.j(M04, i4, null);
                        }
                        i8++;
                    }
                }
            }
        } else if (i == jn7.j0) {
            E0(true);
            hl.V3(t85Var);
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = uc7.r5;
            if ((intValue & 16) != 0) {
                E0(true);
            } else if ((intValue & 524288) == 0) {
                return;
            }
            hl.V3(t85Var);
        } else if (i == jn7.z2) {
            c85 c85Var = this.t2;
            if (c85Var != null) {
                c85Var.a(true, true);
            }
            F1();
        } else if (i == jn7.U3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            qc qcVar = this.i2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            qcVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.b2;
        launchActivity.a1.remove(this.n4);
        this.b2.setRequestedOrientation(-1);
        t5 = false;
        sd5 sd5Var = this.y3;
        if (sd5Var != null) {
            sd5Var.dismiss();
        }
        this.l2 = true;
        jn7.e().k(jn7.F2, new Object[0]);
        k5 k5Var = this.n1;
        int i = k5Var.a;
        int i2 = k5Var.a;
        jn7.f(i).n(this, jn7.M0);
        jn7.f(i2).n(this, jn7.w2);
        jn7.f(i2).n(this, jn7.T);
        jn7.f(i2).n(this, jn7.u1);
        jn7.f(i2).n(this, jn7.B2);
        jn7.f(i2).n(this, jn7.E0);
        jn7.f(i2).n(this, jn7.j0);
        jn7.f(i2).n(this, 2);
        jn7.f(i2).n(this, jn7.z2);
        jn7.f(i2).n(this, jn7.y2);
        jn7.f(i2).n(this, jn7.U3);
        jn7.e().n(this, jn7.Q4);
        jn7.e().n(this, jn7.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        if (this.b2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = CallAudioDevice.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.b2.getSystemService("audio");
            boolean z = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z = true;
            }
            CallAudioDevice.setSpeakerMute(z);
            if (isSpeakerMuted != CallAudioDevice.isSpeakerMuted()) {
                UndoView d1 = d1();
                if (z) {
                    i = 42;
                } else {
                    i = 43;
                }
                d1.j(i, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
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
            vc2 vc2Var = this.T2;
            if (vc2Var == null) {
                vc2 vc2Var2 = sharedInstance.groupCall;
                this.T2 = vc2Var2;
                this.h4.c = vc2Var2;
                this.T3.setGroupCall(vc2Var2);
                vc2Var = this.T2;
                this.g4.c = vc2Var;
            }
            da5 da5Var = this.V1;
            if (da5Var != null) {
                da5Var.F0(this.n1.a, vc2Var.h(false));
            }
            this.H1.setTitleRightMargin(hl.L(48.0f) << 1);
            ArrayList arrayList = this.T2.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i2)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            s85 s85Var = this.O1;
            if (s85Var != null && s85Var.getVisibility() == 0) {
                this.t1.c(2131230918, -1, aob.w0(null, aob.uh, false), 0.3f, false, ob6.M0(2131743016, null), false, true);
                L1(true);
                if (xc2.W(this.S2)) {
                    i = 2131743133;
                } else {
                    i = 2131743032;
                }
                this.r3.setText(ob6.M0(i, null));
                t85 t85Var = this.J1;
                t85Var.setVisibility(0);
                s7 s7Var = this.c3;
                s7Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t85Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(t85Var, View.TRANSLATION_Y, hl.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(s85Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s85Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s85Var, property, 0.0f);
                ema emaVar = this.N1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(emaVar, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(emaVar, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(emaVar, property, 0.0f);
                ema emaVar2 = this.P1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(emaVar2, property2, 0.0f), ObjectAnimator.ofFloat(emaVar2, property3, 0.0f), ObjectAnimator.ofFloat(emaVar2, property, 0.0f), ObjectAnimator.ofFloat(s7Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(s7Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(s7Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(k43.g);
                animatorSet.addListener(new j85(this, (byte) 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void f1(long j, boolean z) {
        if (this.T2 != null) {
            k5 k5Var = this.n1;
            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(j));
            if (X1 != null) {
                id[] idVarArr = {new id(3, null, getContext())};
                TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                vc2 vc2Var = this.T2;
                invitetogroupcall.call = vc2Var.h(vc2Var.a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = X1.id;
                tL_inputUser.access_hash = X1.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(k5Var.a).sendRequest(invitetogroupcall, new k65(this, j, idVarArr, X1, z, invitetogroupcall));
                if (sendRequest != 0) {
                    hl.d3(new l65(this, idVarArr, sendRequest, (byte) 0), 500L);
                }
            }
        }
    }

    public final boolean g1() {
        float f;
        int L = hl.L(74.0f);
        float f2 = this.s2 - L;
        if (this.t0 + f2 < a.getCurrentActionBarHeight()) {
            f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - this.t0) / ((L - this.t0) - hl.L(14.0f)));
        } else {
            f = 0.0f;
        }
        if (f > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean h1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j0() {
        t5 = true;
        jn7.e().k(jn7.F2, new Object[0]);
        ra5.k(getContext());
        return false;
    }

    public final boolean j1() {
        vc2 vc2Var = this.T2;
        if (vc2Var != null && vc2Var.b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void k1(LaunchActivity launchActivity, vc2 vc2Var, View view, int i) {
        TLRPC.Chat chat;
        final Long l;
        boolean z;
        final uc2 uc2Var;
        if (view instanceof q95) {
            W0(((q95) view).getParticipant());
        } else if (view instanceof zb5) {
            B1((zb5) view);
        } else {
            boolean z2 = view instanceof r95;
            Collection collection = null;
            e95 e95Var = this.I1;
            if (z2) {
                r95 r95Var = (r95) view;
                if (r95Var.getUser() != null) {
                    if (h1()) {
                        int i2 = i - e95Var.n;
                        if (i2 >= 0 && i2 < this.T2.m.size()) {
                            l = (Long) this.T2.m.get(i - e95Var.n);
                        } else {
                            int i3 = i - e95Var.s;
                            if (i3 >= 0 && i3 < this.T2.l.size()) {
                                l = (Long) this.T2.l.get(i - e95Var.s);
                            } else {
                                int i4 = i - e95Var.f;
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
                                if (z && (uc2Var = (uc2) this.T2.k.get(l)) != null) {
                                    fu5 G = fu5.G(this.c, this.J0, r95Var);
                                    G.k(2131232134, ob6.M0(2131749214, null), new Runnable(this) {
                                        public final j95 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            uc2 uc2Var2 = uc2Var;
                                            final j95 j95Var = this.b;
                                            j95Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = uc2Var2.a;
                                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            j95 j95Var2 = j95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    vc2 vc2Var2 = j95Var.T2;
                                                    if (vc2Var2 != null) {
                                                        uc2Var2.b = false;
                                                        vc2Var2.k.put(l2, uc2Var2);
                                                        j95Var.E0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = uc2Var2.a;
                                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            j95 j95Var2 = j95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(uc2Var2.a));
                                                    uc7.s1(j95Var.a).X(arrayList2, null, null, 0L, 0, true, 0);
                                                    vc2 vc2Var3 = j95Var.T2;
                                                    if (vc2Var3 != null) {
                                                        vc2Var3.j.remove(l2);
                                                        j95Var.T2.n.remove(l2);
                                                        j95Var.T2.k.remove(l2);
                                                        j95Var.E0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, uc2Var.a());
                                    G.b(2131232333, ob6.M0(2131749225, null), new Runnable(this) {
                                        public final j95 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r4;
                                            Long l2 = l;
                                            uc2 uc2Var2 = uc2Var;
                                            final j95 j95Var = this.b;
                                            j95Var.getClass();
                                            switch (b) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite.msg_id = uc2Var2.a;
                                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            j95 j95Var2 = j95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    vc2 vc2Var2 = j95Var.T2;
                                                    if (vc2Var2 != null) {
                                                        uc2Var2.b = false;
                                                        vc2Var2.k.put(l2, uc2Var2);
                                                        j95Var.E0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    declineconferencecallinvite2.msg_id = uc2Var2.a;
                                                    ConnectionsManager.getInstance(j95Var.a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            byte b2 = r2;
                                                            j95 j95Var2 = j95Var;
                                                            switch (b2) {
                                                                case 0:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    if (tLObject instanceof TLRPC.Updates) {
                                                                        uc7.s1(j95Var2.a).Y3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        j95Var2.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(uc2Var2.a));
                                                    uc7.s1(j95Var.a).X(arrayList2, null, null, 0L, 0, true, 0);
                                                    vc2 vc2Var3 = j95Var.T2;
                                                    if (vc2Var3 != null) {
                                                        vc2Var3.j.remove(l2);
                                                        j95Var.T2.n.remove(l2);
                                                        j95Var.T2.k.remove(l2);
                                                        j95Var.E0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    G.X(aob.c0(hl.L(8.0f), hl.L(8.0f), this.w2.getColor()));
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
                    bundle.putLong("user_id", r95Var.getUser().id);
                    if (r95Var.a.getImageReceiver().E()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    this.b2.t0(new ProfileActivity(bundle, null));
                    dismiss();
                }
            } else if (i == e95Var.x) {
                if (xc2.T(this.S2) && (chat = this.S2) != null && !chat.megagroup && xc2.t0(chat)) {
                    b1(false);
                    return;
                }
                k5 k5Var = this.n1;
                TLRPC.ChatFull N0 = uc7.s1(k5Var.a).N0(a1());
                if (N0 != null) {
                    this.q2 = false;
                    Context context = getContext();
                    int i5 = k5Var.a;
                    TLRPC.Chat chat2 = this.S2;
                    vc2 vc2Var2 = this.T2;
                    sd5 sd5Var = new sd5(context, i5, chat2, N0, vc2Var2.d, vc2Var2.n);
                    this.y3 = sd5Var;
                    sd5Var.setOnDismissListener(new e65(this, (byte) 3));
                    sd5 sd5Var2 = this.y3;
                    sd5Var2.a2 = new p65(this);
                    sd5Var2.show();
                }
            } else if (i == e95Var.y) {
                vc2 vc2Var3 = this.T2;
                if (vc2Var3 != null && vc2Var3.b != null) {
                    sbc sbcVar = new sbc(launchActivity, this.a, new w53());
                    vc2 vc2Var4 = this.T2;
                    if (vc2Var4 != null) {
                        collection = (Collection) Collection.EL.stream(vc2Var4.e).map(new yz((byte) 8)).collect(Collectors.toSet());
                    }
                    sbcVar.s2.addAll(collection);
                    sbcVar.g1(false, true);
                    sbcVar.r2 = new z55(this, (byte) 9);
                    sbcVar.g1(false, true);
                    sbcVar.t2 = new qe2(this, vc2Var, (byte) 25);
                    sbcVar.show();
                }
            } else if (i == e95Var.E) {
                q1();
            }
        }
    }

    public final void l1(nx0 nx0Var, id idVar, EditTextBoldCursor editTextBoldCursor, boolean z) {
        long j;
        if (!this.q2) {
            e eVar = (e) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
            if (eVar instanceof zu1) {
                boolean fa = ((zu1) eVar).fa();
                this.q2 = true;
                this.r2 = true;
                lg lgVar = new lg(nx0Var, editTextBoldCursor, z, idVar, (byte) 19);
                if (fa) {
                    j = 200;
                } else {
                    j = 0;
                }
                hl.d3(lgVar, j);
                return;
            }
            this.q2 = true;
            this.r2 = true;
            if (nx0Var != null) {
                nx0Var.w0(true);
            } else if (idVar != null) {
                idVar.k(true);
            }
            if (z) {
                hl.d3(new l(editTextBoldCursor, (byte) 5), 100L);
            }
        }
    }

    public final void n1() {
        w5 = true;
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(false);
        }
        r85 r85Var = this.E1;
        pvc pvcVar = r85Var.w;
        if (pvcVar != null) {
            pvcVar.b(false);
        }
        r85Var.G = true;
        this.A1.r();
    }

    public final void o1() {
        w5 = false;
        this.I1.f();
        c75 c75Var = this.e4;
        if (c75Var.getVisibility() == 0) {
            this.h4.G(c75Var, false);
        }
        if (v5) {
            this.g4.I(this.f4, false);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(true);
        }
        r85 r85Var = this.E1;
        pvc pvcVar = r85Var.w;
        if (pvcVar != null) {
            pvcVar.b(true);
        }
        r85Var.G = false;
        this.A1.s();
    }

    @Override
    public final void onAudioSettingsChanged() {
        L1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            x1(0.0f);
        }
        t85 t85Var = this.J1;
        if (t85Var.getVisibility() == 0) {
            hl.V3(t85Var);
        }
        c75 c75Var = this.e4;
        if (c75Var.getVisibility() == 0) {
            hl.V3(c75Var);
        }
        ArrayList arrayList = this.S3;
        arrayList.clear();
        arrayList.addAll(this.R3);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ka5) arrayList.get(i)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        c85 c85Var = this.t2;
        if (c85Var != null) {
            c85Var.a(false, false);
        } else if (this.Y3) {
            U0(true);
        } else if (this.T3.b) {
            W0(null);
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
            ((ka5) arrayList.get(i)).j(true);
        }
        c85 c85Var = this.t2;
        if (c85Var != null && VoIPService.getSharedInstance() != null) {
            c85Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
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
        M1(isShowing(), false);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            RadialProgressView radialProgressView = this.X1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(aob.w0(null, aob.Fh, false));
            }
            s7 s7Var = this.b3;
            if (s7Var != null) {
                int i = aob.Yg;
                s7Var.O(aob.w0(null, i, false), false);
                s7Var.O(aob.w0(null, i, false), true);
                s7Var.setPopupItemsSelectorColor(aob.w0(null, aob.Vg, false));
            }
            int w0 = aob.w0(null, aob.Yg, false);
            A1(this.s3, w0);
            A1(this.t3, w0);
            A1(this.g3, w0);
            A1(this.h3, w0);
            A1(this.i3, w0);
            A1(this.r3, aob.w0(null, aob.mh, false));
            A1(this.e3, w0);
            A1(this.f3, w0);
            A1(this.m3, w0);
            A1(this.n3, w0);
            A1(this.o3, w0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.p1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void q1() {
        vc2 vc2Var = this.T2;
        if (vc2Var != null && vc2Var.b != null) {
            id idVar = new id(3, null, getContext());
            idVar.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.T2.b;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.a).sendRequest(exportgroupcallinvite, new fn0(this, idVar, exportgroupcallinvite, (byte) 29));
        }
    }

    public final void s1(TLRPC.GroupCallParticipant groupCallParticipant, final long j, int i) {
        TLObject M0;
        int i2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        ?? r12;
        TextView textView;
        int i8;
        int i9;
        String str3;
        String str4;
        ?? r15;
        int i10;
        int i11;
        int i12;
        String str5;
        int i13;
        EditText editText;
        int i14;
        String M02;
        int i15;
        ?? r23;
        FrameLayout frameLayout;
        String M03;
        int i16;
        int i17;
        int i18;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i19 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            k5 k5Var = this.n1;
            if (i19 > 0) {
                M0 = uc7.s1(k5Var.a).X1(Long.valueOf(j));
            } else {
                M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-j));
            }
            TLObject tLObject = M0;
            boolean z = true;
            if (i != 0 && i != 2 && i != 3) {
                if (i == 6) {
                    this.b2.N0(this.a);
                    Bundle bundle = new Bundle();
                    if (i19 > 0) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    this.b2.t0(new zu1(bundle));
                    dismiss();
                } else if (i == 8) {
                    this.b2.N0(this.a);
                    e eVar = (e) this.b2.N().getFragmentStack().get(this.b2.N().getFragmentStack().size() - 1);
                    if ((eVar instanceof zu1) && ((zu1) eVar).a() == j) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i19 > 0) {
                        bundle2.putLong("user_id", j);
                    } else {
                        bundle2.putLong("chat_id", -j);
                    }
                    this.b2.t0(new zu1(bundle2));
                    dismiss();
                } else if (i == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    I1(2, true);
                } else if (i == 9) {
                    zn5 zn5Var = this.a4;
                    if (zn5Var == null || !zn5Var.g()) {
                        TLRPC.User f = yac.h(k5Var.a).f();
                        zn5 zn5Var2 = new zn5(0, true, true);
                        this.a4 = zn5Var2;
                        zn5Var2.I = true;
                        zn5Var2.S = true;
                        zn5Var2.H = true;
                        zn5Var2.K = true;
                        zn5Var2.T = true;
                        zn5Var2.a = this.b2.N().getLastFragment();
                        zn5 zn5Var3 = this.a4;
                        v85 v85Var = new v85(this, j);
                        this.b4 = v85Var;
                        zn5Var3.b = v85Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z = false;
                        }
                        zn5Var3.n(z, new z55(this, (byte) 10), new h5((byte) 6), 0);
                    }
                } else if (i == 10) {
                    String str6 = groupCallParticipant.about;
                    Context context = getContext();
                    int i20 = this.a;
                    Pattern pattern = jj.a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    if (i19 > 0) {
                        M02 = ob6.M0(2131743420, null);
                    } else {
                        M02 = ob6.M0(2131751424, null);
                    }
                    String str7 = M02;
                    final id idVar = alertDialog$Builder.a;
                    idVar.S = str7;
                    if (i19 > 0) {
                        i15 = 2131743048;
                    } else {
                        i15 = 2131751427;
                    }
                    idVar.U = ob6.M0(i15, null);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout2.setClipChildren(false);
                    if (i19 < 0) {
                        frameLayout = frameLayout2;
                        long j2 = -j;
                        r23 = false;
                        if (uc7.s1(i20).N0(j2) == null) {
                            uc7.s1(i20).e3(ConnectionsManager.generateClassGuid(), j2, true);
                            r23 = false;
                        }
                    } else {
                        r23 = 0;
                        frameLayout = frameLayout2;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i21 = aob.Yg;
                    yob.X(editText2, i21, null);
                    if (i19 > 0) {
                        M03 = ob6.M0(2131743420, null);
                    } else {
                        M03 = ob6.M0(2131751424, null);
                    }
                    editText2.setHint(M03);
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(aob.T(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i19 > 0) {
                        i16 = 70;
                    } else {
                        i16 = 255;
                    }
                    wh whVar = new wh(i16, context, numberTextView);
                    InputFilter[] inputFilterArr = new InputFilter[1];
                    inputFilterArr[r23] = whVar;
                    editText2.setFilters(inputFilterArr);
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(aob.w0(null, aob.B6, r23));
                    numberTextView.setImportantForAccessibility(2);
                    if (ob6.a0) {
                        i17 = 3;
                    } else {
                        i17 = 5;
                    }
                    FrameLayout frameLayout3 = frameLayout;
                    frameLayout3.addView(numberTextView, tre.d(20, 20.0f, i17, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (ob6.a0) {
                        i18 = hl.L(24.0f);
                    } else {
                        i18 = 0;
                    }
                    int L2 = hl.L(8.0f);
                    if (ob6.a0) {
                        L = 0;
                    } else {
                        L = hl.L(24.0f);
                    }
                    editText2.setPadding(i18, L2, L, hl.L(8.0f));
                    editText2.addTextChangedListener(new xh(i16, numberTextView));
                    hl.T3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str6);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.n(frameLayout3);
                    final lf lfVar = new lf(j, i20, editText2, (byte) 0);
                    alertDialog$Builder.j(ob6.M0(2131745674, null), lfVar);
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    idVar.O = new we(editText2, (byte) 1);
                    frameLayout3.addView(editText2, tre.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    hl.E3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i22, KeyEvent keyEvent) {
                            if (i22 == 6 || (j > 0 && keyEvent.getKeyCode() == 66)) {
                                id idVar2 = idVar;
                                if (idVar2.isShowing()) {
                                    lfVar.w(idVar2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    idVar.j(aob.w0(null, aob.lh, false));
                    idVar.show();
                    idVar.o(aob.w0(null, i21, false));
                } else if (i == 11) {
                    Context context2 = getContext();
                    int i22 = this.a;
                    Pattern pattern2 = jj.a;
                    if (wf3.D(j)) {
                        TLRPC.User X1 = uc7.s1(i22).X1(Long.valueOf(j));
                        str3 = X1.first_name;
                        str4 = X1.last_name;
                    } else {
                        str3 = uc7.s1(i22).M0(Long.valueOf(-j)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i19 > 0) {
                        i10 = 2131743067;
                        r15 = 0;
                    } else {
                        r15 = 0;
                        i10 = 2131743066;
                    }
                    String M04 = ob6.M0(i10, r15);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M04;
                    LinearLayout j3 = uh9.j(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i23 = aob.Yg;
                    yob.X(editText3, i23, r15);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (ob6.a0) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    editText3.setGravity(i11);
                    editText3.setInputType(49152);
                    if (i19 > 0) {
                        i12 = 5;
                    } else {
                        i12 = 6;
                    }
                    editText3.setImeOptions(i12);
                    if (i19 > 0) {
                        i13 = 2131750654;
                        str5 = null;
                    } else {
                        str5 = null;
                        i13 = 2131743065;
                    }
                    editText3.setHint(ob6.M0(i13, str5));
                    editText3.setBackground(aob.T(context2));
                    editText3.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                    editText3.requestFocus();
                    if (i19 > 0) {
                        editText = new EditText(context2);
                        yob.X(editText, i23, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (ob6.a0) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        editText.setGravity(i14);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(ob6.M0(2131748786, null));
                        editText.setBackground(aob.T(context2));
                        editText.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                    } else {
                        editText = null;
                    }
                    hl.E3(editText3);
                    j3.addView(editText3, tre.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        j3.addView(editText, tre.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.n(j3);
                    EditText editText4 = editText;
                    ff ffVar = new ff(editText3, j, i22, editText4);
                    alertDialog$Builder2.j(ob6.M0(2131745674, null), ffVar);
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                    idVar2.O = new gf(editText3, editText4, (byte) 0);
                    idVar2.j(aob.w0(null, aob.lh, false));
                    idVar2.show();
                    idVar2.o(aob.w0(null, i23, false));
                    hf hfVar = new hf(idVar2, ffVar, (byte) 0);
                    if (editText4 != null) {
                        editText4.setOnEditorActionListener(hfVar);
                    } else {
                        editText3.setOnEditorActionListener(hfVar);
                    }
                } else if (i == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    d1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        i8 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        i8 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, xc2.H(groupCallParticipant));
                    UndoView d1 = d1();
                    if (i == i8) {
                        i9 = 31;
                    } else {
                        i9 = 36;
                    }
                    d1.k(0L, i9, tLObject, null, null, null);
                }
            } else if (i == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    d1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                ?? alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i24 = aob.gh;
                id idVar3 = alertDialog$Builder3.a;
                idVar3.J = i24;
                TextView textView2 = new TextView(getContext());
                int i25 = aob.Yg;
                yob.X(textView2, i25, null);
                textView2.setTextSize(1, 16.0f);
                if (ob6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView2.setGravity(i2 | 48);
                ?? frameLayout4 = new FrameLayout(getContext());
                alertDialog$Builder3.n(frameLayout4);
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.s(hl.L(12.0f));
                de0 de0Var = new de0(getContext());
                de0Var.setRoundRadius(hl.L(20.0f));
                if (ob6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                frameLayout4.addView(de0Var, tre.d(40, 40.0f, i3 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                rb0Var.o(tLObject);
                boolean z2 = tLObject instanceof TLRPC.User;
                if (z2) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    de0Var.f(user, rb0Var);
                    str = lbc.k(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    de0Var.f(chat, rb0Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                qd4.w(textView3, i25, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (ob6.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                textView3.setGravity(i4 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.S2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i == 2) {
                    if (h1()) {
                        textView3.setText(ob6.M0(2131743073, null));
                        uh9.r(null, null, 2131743074, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(ob6.M0(2131742997, null));
                        if (xc2.W(this.S2)) {
                            uh9.r(null, null, 2131743116, new Object[]{str, str2}, textView2);
                        } else {
                            uh9.r(null, null, 2131742998, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(ob6.M0(2131743054, null));
                    uh9.r(null, null, 2131743055, new Object[]{str, str2}, textView2);
                }
                boolean z3 = ob6.a0;
                if (z3) {
                    i5 = 5;
                } else {
                    i5 = 3;
                }
                int i26 = i5 | 48;
                int i27 = 76;
                if (z3) {
                    i6 = 21;
                } else {
                    i6 = 76;
                }
                float f2 = i6;
                if (!z3) {
                    i27 = 21;
                }
                frameLayout4.addView(textView3, tre.d(-1, -2.0f, i26, f2, 11.0f, i27, 0.0f));
                if (ob6.a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                frameLayout4.addView(textView2, tre.d(-2, -2.0f, i7 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i == 2) {
                    r12 = 0;
                    alertDialog$Builder3.j(ob6.M0(2131742963, null), new u34(this, tLObject, (byte) 5));
                } else {
                    r12 = 0;
                    r12 = 0;
                    if (z2) {
                        alertDialog$Builder3.j(ob6.M0(2131743056, null), new ps0(this, (TLRPC.User) tLObject, j, (byte) 4));
                    }
                }
                alertDialog$Builder3.g(ob6.M0(2131752570, r12), r12);
                idVar3.j(aob.w0(r12, aob.lh, false));
                idVar3.show();
                if (i == 2 && (textView = (TextView) idVar3.c(-1)) != null) {
                    yob.X(textView, aob.mh, r12);
                }
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        H1();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 2) {
            P0();
            N0();
            O0();
            float f3 = 1.0f - this.o5.e;
            t65 t65Var = this.o1;
            t65Var.setAlpha(f3);
            this.T3.setProgressToHideUi(f);
            this.e4.invalidate();
            this.b.invalidate();
            t65Var.invalidate();
        }
        if (i == 3) {
            Q0();
            P0();
            R0();
            M0();
            this.b.invalidate();
        }
        if (i == 4) {
            P0();
            this.z1.invalidate();
            this.A1.invalidate();
        }
        if (i == 5) {
            P0();
            this.b.invalidate();
        }
    }

    public final void t1(boolean r18, defpackage.zb5 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j95.t1(boolean, zb5):void");
    }

    public final void u1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall h;
        long j;
        this.A1.setText("");
        vc2 vc2Var = this.T2;
        if (vc2Var != null && vc2Var.b != null && (h = vc2Var.h(vc2Var.a)) != null) {
            vc2 vc2Var2 = this.T2;
            long j2 = vc2Var2.b.id;
            TLRPC.Peer peer = vc2Var2.J;
            if (peer != null) {
                j = wf3.n(peer);
            } else {
                j = yac.h(this.a).n;
            }
            GroupCallMessagesController.getInstance(this.a).sendCallMessage(j, tL_textWithEntities, j2, h);
        }
    }

    public final void v1(float f) {
        float f2;
        int i;
        int i2;
        this.N3 = f;
        g75 g75Var = this.T3;
        if (g75Var == null) {
            f2 = 0.0f;
        } else {
            f2 = g75Var.c;
        }
        float max = Math.max(f, f2);
        int i3 = aob.ah;
        int w0 = aob.w0(null, i3, false);
        int i4 = aob.Xg;
        int R0 = hl.R0(f, 1.0f, w0, aob.w0(null, i4, false));
        this.O3 = R0;
        this.G1.setBackgroundColor(R0);
        this.b3.I(-14472653);
        this.Y1.setColorFilter(new PorterDuffColorFilter(this.O3, PorterDuff.Mode.MULTIPLY));
        this.H0 = hl.R0(max, 1.0f, aob.w0(null, i3, false), aob.w0(null, i4, false));
        int R02 = hl.R0(f, 1.0f, aob.w0(null, aob.bh, false), aob.w0(null, aob.kh, false));
        qc qcVar = this.i2;
        if (qcVar != null) {
            qcVar.b = R02;
            tb tbVar = (tb) qcVar.i;
            if (tbVar != null) {
                tbVar.invalidate();
            }
        }
        this.w2.setColor(R02);
        this.x1.setColor(R02);
        this.y1.invalidate();
        t85 t85Var = this.J1;
        t85Var.setGlowColor(R02);
        byte b = this.z3;
        if (b == 3 || i1(b)) {
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
        int R03 = hl.R0(f, 1.0f, aob.w0(null, aob.uh, false), aob.w0(null, aob.vh, false));
        this.t1.a(R03, R03);
        int R04 = hl.R0(f, 1.0f, aob.w0(null, aob.ch, false), aob.w0(null, aob.fh, false));
        int R05 = hl.R0(f, 1.0f, aob.w0(null, aob.dh, false), aob.w0(null, aob.ih, false));
        int v0 = aob.v0(aob.Fi, this.J0);
        int childCount = t85Var.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = t85Var.getChildAt(i6);
            if (childAt instanceof tb5) {
                tb5 tb5Var = (tb5) childAt;
                if (h1()) {
                    tb5Var.a(v0, v0);
                } else {
                    tb5Var.a(R05, R04);
                }
            } else {
                boolean z = childAt instanceof zb5;
                e85 e85Var = this.H1;
                if (z) {
                    zb5 zb5Var = (zb5) childAt;
                    if (e85Var.getTag() != null) {
                        i2 = aob.ih;
                    } else {
                        i2 = aob.dh;
                    }
                    zb5Var.f(i2, R05);
                } else if (childAt instanceof r95) {
                    r95 r95Var = (r95) childAt;
                    if (e85Var.getTag() != null) {
                        i = aob.ih;
                    } else {
                        i = aob.dh;
                    }
                    r95Var.a(i, R05);
                }
            }
        }
        this.b.invalidate();
        t85Var.invalidate();
        this.c.invalidate();
    }

    public final void w1(boolean z) {
        if (this.T2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        vc2 vc2Var = this.T2;
        togglegroupcallsettings.call = vc2Var.h(vc2Var.a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
        this.m5 = Boolean.valueOf(z);
        E1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.n1.a);
        to3 to3Var = Utilities.d;
        Objects.requireNonNull(to3Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new pe2(to3Var, (byte) 0), new h65(this, (byte) 0));
    }

    public final void x1(float f) {
        t85 t85Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        f89 L;
        f = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f) / 8500.0d);
        this.J2 = min;
        this.K2 = (min - this.I2) / 265.0f;
        vc2 vc2Var = this.T2;
        if (vc2Var != null && (t85Var = this.J1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(r47.B1(this.u2))) != null) {
            g75 g75Var = this.T3;
            if (!g75Var.b) {
                if (this.l2) {
                    arrayList = this.x2;
                } else {
                    arrayList = this.T2.g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (L = t85Var.L(indexOf + this.I1.d)) != null) {
                    View view = L.a;
                    if (view instanceof zb5) {
                        ((zb5) view).setAmplitude(f * 15.0f);
                        if (view == this.M4 && !this.d4) {
                            this.b.invalidate();
                        }
                    }
                }
            } else {
                int i = 0;
                while (true) {
                    c75 c75Var = this.e4;
                    if (i >= c75Var.getChildCount()) {
                        break;
                    }
                    o95 o95Var = (o95) c75Var.getChildAt(i);
                    if (r47.B1(o95Var.getParticipant().peer) == r47.B1(groupCallParticipant.peer)) {
                        o95Var.setAmplitude(f * 15.0f);
                    }
                    i++;
                }
            }
            g75Var.i(groupCallParticipant, f * 15.0f);
        }
    }

    public final void y1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
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

    public final void z1(float f) {
        t85 t85Var;
        int L;
        int i;
        float f2;
        this.s2 = f;
        this.J1.setTopGlowOffset((int) (f - ((FrameLayout.LayoutParams) t85Var.getLayoutParams()).topMargin));
        float L2 = f - hl.L(74.0f);
        int i2 = ((this.t0 + L2) > (a.getCurrentActionBarHeight() << 1) ? 1 : ((this.t0 + L2) == (a.getCurrentActionBarHeight() << 1) ? 0 : -1));
        g75 g75Var = this.T3;
        a75 a75Var = this.Y2;
        x65 x65Var = this.X2;
        if (i2 < 0) {
            float min = Math.min(1.0f, (((a.getCurrentActionBarHeight() << 1) - L2) - this.t0) / (a.getCurrentActionBarHeight() + ((L - this.t0) - hl.L(14.0f))));
            if (hl.O1()) {
                f2 = 17.0f;
            } else {
                f2 = 13.0f;
            }
            i = (int) (hl.L(f2) * min);
            if (Math.abs(Math.min(1.0f, min) - this.N3) > 1.0E-4f) {
                v1(Math.min(1.0f, min));
            }
            float v = bp1.v(min, 0.1f, 1.2f, 1.0f);
            x65Var.setScaleX(Math.max(0.9f, v));
            x65Var.setScaleY(Math.max(0.9f, v));
            float f3 = 1.0f - (min * 1.2f);
            x65Var.setAlpha((1.0f - g75Var.c) * Math.max(0.0f, f3));
            a75Var.setScaleX(Math.max(0.9f, v));
            a75Var.setScaleY(Math.max(0.9f, v));
            a75Var.setAlpha((1.0f - g75Var.c) * Math.max(0.0f, f3));
        } else {
            x65Var.setScaleX(1.0f);
            x65Var.setScaleY(1.0f);
            x65Var.setAlpha(1.0f - g75Var.c);
            a75Var.setScaleX(1.0f);
            a75Var.setScaleY(1.0f);
            a75Var.setAlpha(1.0f - g75Var.c);
            if (this.N3 > 1.0E-4f) {
                v1(0.0f);
            }
            i = 0;
        }
        P0();
        float f4 = i;
        this.u3.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(53.0f)) - f4));
        this.a3.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(44.0f)) - f4));
        z75 z75Var = this.K1;
        if (z75Var != null) {
            z75Var.setTranslationY(Math.max(hl.L(4.0f), (f - hl.L(44.0f)) - f4));
        }
        this.b.invalidate();
        P1();
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
    public final void onMediaStateUpdated(int i, int i2) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
