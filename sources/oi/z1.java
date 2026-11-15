package oi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import di.q9;
import hi.g7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ez;
import org.telegram.messenger.fw;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.fq0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;
import org.telegram.ui.z51;
public final class z1 extends org.telegram.ui.ActionBar.e2 implements is {
    public ga.d A0;
    public ly B0;
    public boolean C0;
    public boolean D0;
    public RectF E;
    public int E0;
    public boolean F;
    public int F0;
    public final int[] G;
    public int G0;
    public int[] H;
    public boolean H0;
    public int[] I;
    public ki.z1 I0;
    public float J;
    public int J0;
    public an K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public l1 O0;
    public r1 P;
    public bg0 P0;
    public q3 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public e1 S0;
    public FrameLayout T;
    public int T0;
    public ImageView U;
    public int U0;
    public LinearLayout V;
    public int V0;
    public ImageView W;
    public boolean W0;
    public ImageView X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public int Z0;
    public final CharSequence f22155a;
    public FrameLayout f22156a0;
    public boolean f22157a1;
    public final TL_iv.RichMessage f22158b;
    public LinearLayout f22159b0;
    public int f22160c;
    public pg f22161c0;
    public int d;
    public ImageView f22162d0;
    public boolean f22163e;
    public s1 f22164e0;
    public final String f22165f;
    public LinearLayout f22166f0;
    public final ArrayList f22167g0;
    public CharSequence h;
    public ImageView f22168h0;
    public z51 f22169i0;
    public LinearLayout f22170j0;
    public t1 f22171k0;
    public int f22172l0;
    public final ArrayList m0;
    public CharSequence f22173n;
    public LinearLayout f22174n0;
    public LinearLayout f22175o0;
    public LinearLayout f22176p0;
    public v1 f22177q0;
    public gj f22178r;
    public v1 f22179r0;
    public jh.f f22180s;
    public v1 f22181s0;
    public v1 f22182t0;
    public v1 f22183u0;
    public v1 f22184v0;
    public qj f22185w;
    public FrameLayout f22186w0;
    public final Rect f22187x;
    public fh0 f22188x0;
    public fh.g f22189y;
    public m60 f22190y0;
    public u1 f22191z0;

    public z1(Editable editable) {
        super(null);
        this.f22160c = -1;
        this.d = -1;
        this.f22187x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22167g0 = new ArrayList();
        this.f22172l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22155a = editable;
    }

    public static void Z(z1 z1Var) {
        e3 e3Var = z1Var.Q.f21943v3;
        if (e3Var != null && e3Var.x()) {
            z1Var.s0();
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        new u(z1Var.currentAccount, parentActivity, new g7(z1Var, 16), z1Var.getResourceProvider()).show();
    }

    public static void a0(z1 z1Var) {
        if (!m10.i(z1Var.currentAccount).q()) {
            z1Var.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) z1Var, 43, true));
        }
    }

    public static boolean b0(z1 z1Var, View view) {
        int i7;
        an anVar = z1Var.K;
        if (anVar != null && z1Var.f22178r == null && !anVar.c() && z1Var.Q.n3() && !z1Var.Q.p3()) {
            if (!z1Var.Q.P3()) {
                z1Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = z1Var.Q.c3();
            if (!c32.isEmpty()) {
                bg0 bg0Var = z1Var.P0;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    z1Var.P0 = null;
                }
                bg0 bg0Var2 = new bg0(z1Var.getParentActivity(), z1Var.getResourceProvider());
                z1Var.P0 = bg0Var2;
                bg0Var2.setOnDismissListener(new q9(z1Var, 8));
                long a10 = z1Var.K.a();
                gj gjVar = z1Var.K.E5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28072id = 0;
                tL_message.out = true;
                tL_message.peer_id = np.s1(z1Var.currentAccount).z1(a10);
                tL_message.from_id = np.s1(z1Var.currentAccount).z1(m10.i(z1Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = z1Var.Q.E2();
                tL_message.rich_message.documents = z1Var.Q.B2();
                if (gjVar != null && !gjVar.f23838p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                gj gjVar2 = new gj(z1Var.currentAccount, tL_message, false, false);
                if (gjVar != null && !gjVar.f23838p) {
                    gjVar2.C = gjVar;
                }
                gjVar2.B0 = true;
                gjVar2.W2 = Boolean.TRUE;
                gjVar2.n0(null);
                gjVar2.f23867w1 = true;
                z1Var.P0.r(org.telegram.messenger.k5.j(gjVar2));
                z1Var.f22191z0.setScaleX(1.0f);
                z1Var.f22191z0.setScaleY(1.0f);
                jg s5 = z1Var.P0.s(z1Var.f22191z0, true, new g1(z1Var, 10));
                if (s5 != null) {
                    s5.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), z1Var.getThemedColor(j6.Fi))));
                    bg0 bg0Var3 = z1Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    bg0Var3.f45726p0 = true;
                    bg0Var3.Y = L;
                }
                m60 H = m60.H(z1Var, z1Var.f22191z0);
                boolean B = q10.B(z1Var.K.j());
                if (z1Var.K.S6()) {
                    if (B) {
                        i7 = 2131745514;
                    } else {
                        i7 = 2131745859;
                    }
                    H.c(2131232078, hd.M0(i7, null), new di.x2(z1Var, a10, 15), false);
                    if (!B && a10 > 0) {
                        H.c(2131232265, hd.M0(2131745586, null), new f1(z1Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(2131231508, hd.M0(2131745583, null), new f1(z1Var, 6), false);
                }
                H.Y();
                z1Var.P0.q(H);
                z1Var.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final z1 z1Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        float f10;
        float f11;
        boolean z18;
        boolean z19;
        boolean z20;
        float f12;
        float f13;
        boolean z21;
        boolean z22;
        float f14;
        m60 m60Var = z1Var.f22190y0;
        if (m60Var != null) {
            m60Var.u();
            z1Var.f22190y0 = null;
        }
        if (!np.s1(z1Var.currentAccount).s4() && !m10.i(z1Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = z1Var.Q.T2();
        final m60 I = m60.I(z1Var, view);
        I.Q = true;
        m60 J = I.J();
        J.c(2131231240, hd.M0(2131753756, null), new bi.u3(I, 8), false);
        J.k();
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, 2131231558, null, hd.M0(2131754030, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0 + 2);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, 2131231559, null, hd.M0(2131754029, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0 + 1);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, 2131231560, null, hd.M0(2131754028, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, 2131231561, null, hd.M0(2131754027, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0 - 1);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, 2131231562, null, hd.M0(2131754026, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0 - 2);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, 2131231563, null, hd.M0(2131754025, null), new Runnable(z1Var) {
            public final z1 f21768b;

            {
                this.f21768b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f21768b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f29899a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f29899a.setTextSize(1, gz.W0 - 3);
        if (T2 != null && q3.F3(T2.f21544b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        x1 x1Var = new x1(context, 2131231557);
        x1Var.a(z10);
        int i7 = j6.G8;
        x1Var.d = i7;
        I.j(z17, 0, x1Var, hd.M0(2131754031, null), new bi.n3(I, J, 3));
        I.y().f29899a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        float f15 = 9.0f;
        if (hd.f24104a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (hd.f24104a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        y10.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, 2131231596, null, hd.M0(2131753988, null), new j1(z1Var, T2, 3));
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, 2131231580, null, hd.M0(2131753996, null), new j1(z1Var, T2, 4));
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        x1 x1Var2 = new x1(context, 2131231579);
        x1Var2.a(z10);
        x1Var2.d = i7;
        I.j(z20, 0, x1Var2, hd.M0(2131753997, null), new j1(z1Var, T2, 0));
        org.telegram.ui.ActionBar.z0 y11 = I.y();
        if (hd.f24104a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (hd.f24104a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        y11.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, 2131231551, null, hd.M0(2131754055, null), new j1(z1Var, T2, 1));
        if (T2 != null && (T2.f21544b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        x1 x1Var3 = new x1(context, 2131231554);
        x1Var3.a(z10);
        x1Var3.d = i7;
        I.j(z22, 0, x1Var3, hd.M0(2131754032, null), new j1(z1Var, T2, 2));
        org.telegram.ui.ActionBar.z0 y12 = I.y();
        if (hd.f24104a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!hd.f24104a0) {
            f15 = 18.0f;
        }
        y12.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        I.Z();
        z1Var.f22190y0 = I;
    }

    public static void d0(z1 z1Var, gj gjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, gj gjVar2, gj gjVar3, qm qmVar, boolean z10, int i7, int i10, fw fwVar, long j10) {
        if (gjVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(z1Var.currentAccount);
            an anVar = z1Var.K;
            org.telegram.messenger.p5 p5Var = ez.J;
            if (arrayList.isEmpty()) {
                return;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            int i11 = 0;
            richMessage.rtl = false;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock != null) {
                    richMessage.blocks.add(pageBlock);
                }
            }
            if (richMessage.blocks.isEmpty()) {
                return;
            }
            if (!arrayList2.isEmpty()) {
                richMessage.photos.addAll(arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                richMessage.documents.addAll(arrayList3);
            }
            IdentityHashMap identityHashMap = new IdentityHashMap();
            ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
            int size2 = arrayList5.size();
            while (i11 < size2) {
                TL_iv.PageBlock pageBlock2 = arrayList5.get(i11);
                i11++;
                ez.j(pageBlock2, identityHashMap);
            }
            ez.C(a10.f22782a).v(gjVar, richMessage, arrayList4, anVar, false);
            return;
        }
        ez.R(org.telegram.messenger.c.a(z1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, gjVar2, gjVar3, qmVar, z10, i7, i10, fwVar, 0L, j10, 0L);
    }

    public static void e0(z1 z1Var, boolean z10, boolean z11) {
        float f10;
        int i7;
        if (z1Var.K0 != z10 || !z11) {
            z1Var.K0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z11) {
                z1Var.f22188x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(er.h).start();
            } else {
                z1Var.f22188x0.animate().cancel();
                z1Var.f22188x0.setScaleX(f10);
                z1Var.f22188x0.setScaleY(f10);
            }
            fh0 fh0Var = z1Var.f22188x0;
            if (z10) {
                i7 = j6.f29090q7;
            } else {
                i7 = j6.G6;
            }
            q6.s(fh0Var, i7, z1Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            ch0 animatedDrawable = z1Var.f22188x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f33575b0 > 34) {
                        animatedDrawable.N(0, false, false);
                    }
                    animatedDrawable.P(33);
                } else {
                    animatedDrawable.P(0);
                }
                animatedDrawable.start();
            }
        }
    }

    public static e1 f0(z1 z1Var) {
        e1 focusedEditTextOrNull = z1Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            z1Var.S0 = focusedEditTextOrNull;
            z1Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = z1Var.S0;
        if (e1Var != null) {
            return e1Var;
        }
        return z1Var.Q.S2();
    }

    public static int g0(z1 z1Var, e1 e1Var) {
        if (e1Var == z1Var.S0 && z1Var.Q.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(z1Var.T0, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static String l0(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 7) {
                        if (i7 != 9) {
                            return null;
                        }
                        return hd.M0(2131754869, null);
                    }
                    return hd.M0(2131754864, null);
                }
                return hd.M0(2131754855, null);
            }
            return hd.M0(2131754860, null);
        }
        return hd.M0(2131754854, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return hd.M0(2131753671, null);
        }
        if (i7 == 2) {
            return hd.M0(2131749087, null);
        }
        if (i7 == 16) {
            return hd.M0(2131743889, null);
        }
        if (i7 == 8) {
            return hd.M0(2131744437, null);
        }
        if (i7 == 256) {
            return hd.M0(2131745262, null);
        }
        if (i7 == 4) {
            return hd.M0(2131748350, null);
        }
        if (i7 == 65536) {
            return hd.M0(2131749303, null);
        }
        if (i7 == 16384) {
            return hd.M0(2131744425, null);
        }
        if (i7 != 32768) {
            return null;
        }
        return hd.M0(2131744327, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, e6 e6Var) {
        final org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        k10.O = f10;
        ImageView e10 = i20.e(context, 2131231602);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = j6.Fi;
        ShapeDrawable L2 = j6.L(L, j6.w0(i7, e6Var));
        m6 M = q6.M(i7);
        e10.setBackground(L2);
        q6.j(e10, L2, M, null, e6Var);
        f10.addView(e10, ja.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = j6.G6;
        q6.U(textView, i10, e6Var);
        TextView f11 = i20.f(f10, textView, ja.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(hd.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        q6.U(f11, i10, e6Var);
        f10.addView(f11, ja.t(-1, -2, 49, 25, 11, 25, 0));
        hi.d g10 = i20.g(24, context, e6Var, true);
        g10.setText(hd.M0(2131754043, null));
        f10.addView(g10, ja.t(-1, 48, 49, 14, 31, 14, 0));
        hi.d g11 = i20.g(24, context, e6Var, false);
        g11.setText(hd.M0(2131754044, null));
        f10.addView(g11, ja.t(-1, 48, 49, 14, 2, 14, 6));
        k10.show();
        g10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k10.dismiss();
                        runnable2.run();
                        return;
                    default:
                        k10.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        k10.dismiss();
                        runnable.run();
                        return;
                    default:
                        k10.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        jh.f fVar = this.f22180s;
        int[] iArr = this.G;
        fVar.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.f22189y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.f22185w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr2 = this.I;
        iArr2[0] = (int) (iArr2[0] - (this.f22185w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: oi.z1.B0():void");
    }

    public final void C0(int i7, boolean z10) {
        int i10;
        float f10;
        float f11;
        float f12;
        float L;
        int i11;
        float f13;
        float f14;
        float f15;
        float L2;
        float f16;
        float f17;
        float f18;
        float f19;
        float L3;
        float f20;
        float f21;
        float f22;
        float L4;
        float f23;
        if (this.L0 == i7) {
            return;
        }
        this.L0 = i7;
        int i12 = 0;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            this.f22159b0.setVisibility(0);
            ViewPropertyAnimator animate = this.f22159b0.animate();
            if (this.L0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (this.L0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (this.L0 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (this.L0 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            er erVar = er.h;
            duration.setInterpolator(erVar).withEndAction(new f1(this, 1)).start();
            this.f22169i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f22169i0.animate();
            if (this.L0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (this.L0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (this.L0 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (this.L0 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(erVar).withEndAction(new f1(this, 2)).start();
            this.f22186w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f22186w0.animate();
            if (this.L0 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (this.L0 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (this.L0 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(erVar).withEndAction(new f1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f22159b0;
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f22159b0;
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f22159b0;
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f22159b0;
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f22159b0;
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        z51 z51Var = this.f22169i0;
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        z51Var.setVisibility(i11);
        z51 z51Var2 = this.f22169i0;
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        z51Var2.setAlpha(f13);
        z51 z51Var3 = this.f22169i0;
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        z51Var3.setScaleX(f14);
        z51 z51Var4 = this.f22169i0;
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        z51Var4.setScaleY(f15);
        z51 z51Var5 = this.f22169i0;
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        z51Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f22186w0;
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f22186w0;
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f22186w0;
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f22186w0;
        if (i7 == 2) {
            f25 = 1.0f;
        }
        frameLayout4.setScaleY(f25);
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        boolean g10;
        boolean z12;
        boolean h;
        boolean z13;
        int max;
        int max2;
        boolean z14;
        boolean z15;
        boolean z16;
        e1 e1Var;
        int max3;
        boolean z17;
        boolean z18;
        h9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            v1 v1Var = this.f22184v0;
            boolean z19 = false;
            if (v1Var != null) {
                q3 q3Var = this.Q;
                int[] E4 = q3Var.E4();
                if (E4 != null && q3Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                v1Var.setSelected(z18);
            }
            if (this.Q.O3()) {
                h9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
                int i7 = textSelectionHelper2.f30411p0;
                int i10 = textSelectionHelper2.f30412q0;
                int i11 = textSelectionHelper2.f30415t0;
                int i12 = textSelectionHelper2.f30413r0;
                int i13 = textSelectionHelper2.f30416u0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    v1 v1Var2 = (v1) obj;
                    v1Var2.setSelected(this.Q.N3(((Integer) v1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
                }
                if (i10 == i11) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    e1Var = this.Q.Q4(i7, i10);
                } else {
                    e1Var = null;
                }
                int max4 = Math.max(0, Math.min(i12, i13));
                if (e1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i12, i13), e1Var.length()));
                }
                v1 v1Var3 = this.f22179r0;
                if (v1Var3 != null) {
                    if (e1Var != null && max4 < max3 && a6.h(e1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    v1Var3.setSelected(z17);
                }
                v1 v1Var4 = this.f22182t0;
                if (v1Var4 != null) {
                    if (e1Var != null && max4 < max3 && a6.g(e1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    v1Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.Q.o2());
            } else if (this.Q.z3()) {
                h9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
                e1 v22 = this.Q.v2(textSelectionHelper3.f30411p0);
                int i15 = textSelectionHelper3.f30413r0;
                int i16 = textSelectionHelper3.f30416u0;
                if (v22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i15, i16), v22.length()));
                }
                if (v22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i15, i16), v22.length()));
                }
                int size2 = arrayList.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj2 = arrayList.get(i17);
                    i17++;
                    v1 v1Var5 = (v1) obj2;
                    int intValue = ((Integer) v1Var5.getTag()).intValue();
                    if (v22 != null && max < max2 && (intValue & v22.c(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    v1Var5.setSelected(z15);
                }
                v1 v1Var6 = this.f22179r0;
                if (v1Var6 != null) {
                    if (v22 != null && max < max2 && a6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    v1Var6.setSelected(z14);
                }
                v1 v1Var7 = this.f22182t0;
                if (v1Var7 != null) {
                    if (v22 != null && max < max2 && a6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    v1Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.Q.o2());
            } else {
                int i18 = textSelectionHelper.f30411p0;
                int i19 = textSelectionHelper.f30414s0;
                int i20 = textSelectionHelper.f30413r0;
                int i21 = textSelectionHelper.f30416u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.f21948x4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    v1 v1Var8 = (v1) arrayList.get(i22);
                    int intValue2 = ((Integer) v1Var8.getTag()).intValue();
                    if (z10 && this.Q.M3(intValue2, i18, i20, i19, i21)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v1Var8.setSelected(z13);
                    i22 = i23;
                }
                y0(!this.Q.L3());
                v1 v1Var9 = this.f22179r0;
                if (v1Var9 != null) {
                    if (z10) {
                        Editable K4 = this.Q.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = a6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            v1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    v1Var9.setSelected(z12);
                }
                v1 v1Var10 = this.f22182t0;
                if (v1Var10 != null) {
                    if (z10) {
                        Editable K42 = this.Q.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = a6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g10) {
                            z11 = true;
                            v1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    v1Var10.setSelected(z11);
                }
                if (z10 && i18 == i19) {
                    z19 = true;
                }
                z0(z19, this.Q.o2());
            }
        }
    }

    public final void E0() {
        boolean z10;
        float f10;
        boolean u22 = this.Q.u2();
        d2 d2Var = this.Q.R3;
        if (d2Var != null && !d2Var.f21634c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.W;
        float f11 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(u22);
            ImageView imageView2 = this.W;
            if (u22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
        }
        ImageView imageView3 = this.X;
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
            ImageView imageView4 = this.X;
            if (z10) {
                f11 = 1.0f;
            }
            imageView4.setAlpha(f11);
        }
    }

    public final void F0() {
        boolean z10;
        int i7 = 0;
        if (!np.s1(this.currentAccount).s4() && !m10.i(this.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((v1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        float f10;
        if (this.f22191z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.f22191z0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f22191z0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        i20.m(animate, f10, 150L);
    }

    public final void H0() {
        u1 u1Var = this.f22191z0;
        if (u1Var == null) {
            return;
        }
        u1Var.setLocked(r0());
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new r1(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ki.z1 z1Var = new ki.z1(this, 1);
        this.I0 = z1Var;
        this.P.f39419r.add(z1Var);
        q3 q3Var = new q3(context, this.currentAccount, getResourceProvider(), new ia.d(this, 17));
        this.Q = q3Var;
        q3Var.setFileRefParentObject(this.f22178r);
        this.P.addView(this.Q, ja.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), ja.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f22158b;
        if (richMessage != null) {
            q3 q3Var2 = this.Q;
            ArrayList arrayList2 = q3Var2.f21939t3;
            q3Var2.f21937s3 = richMessage;
            q3.Z2(arrayList2, richMessage.blocks, q3Var2.f21941u3);
            q3Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                q3Var2.y4((a) arrayList2.get(i12));
            }
            q3Var2.f39892g3.O(false);
        } else {
            String str = this.f22165f;
            if (str != null) {
                q3 q3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f22173n;
                HashMap hashMap = q3Var3.f21941u3;
                ArrayList arrayList3 = q3Var3.f21939t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    q3.Z2(arrayList3, y4.b(charSequence), hashMap);
                }
                arrayList3.addAll(q3Var3.z4(y3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    q3.Z2(arrayList3, y4.b(charSequence2), hashMap);
                }
                q3Var3.Y3();
                q3Var3.f39892g3.O(false);
            } else {
                CharSequence charSequence3 = this.f22155a;
                if (charSequence3 != null) {
                    this.Q.setInitialText(charSequence3);
                }
            }
        }
        d2 d2Var = this.Q.R3;
        if (d2Var != null) {
            d2Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = j6.f28849d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), j6.r1(0.0f, getThemedColor(i13))}));
        this.P.addView(this.R, ja.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{j6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.P.addView(this.S, ja.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, ja.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231240);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = j6.f28941i6;
        imageView3.setBackground(new y1(j6.b0(themedColor, j6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i15 = j6.G6;
        e6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView4, i15, resourceProvider, mode);
        na.a(this.U);
        this.U.setContentDescription(hd.M0(2131754878, null));
        this.U.setOnClickListener(new g1(this, 1));
        this.T.addView(this.U, ja.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.T.addView(this.V, ja.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231598);
        this.W.setScaleType(scaleType);
        q6.Q(this.W, j6.h0(getThemedColor(i14), 1, -1), null, q6.M(i14), getResourceProvider());
        q6.s(this.W, i15, getResourceProvider(), mode);
        na.a(this.W);
        this.W.setContentDescription(hd.M0(2131743887, null));
        this.W.setOnClickListener(new g1(this, 2));
        this.V.addView(this.W, ja.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231581);
        this.X.setScaleType(scaleType);
        q6.Q(this.X, j6.h0(getThemedColor(i14), 1, -1), null, q6.M(i14), getResourceProvider());
        q6.s(this.X, i15, getResourceProvider(), mode);
        na.a(this.X);
        this.X.setContentDescription(hd.M0(2131746342, null));
        this.X.setOnClickListener(new g1(this, 3));
        this.V.addView(this.X, ja.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, ja.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22156a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f22156a0.setClipToPadding(false);
        this.Z.addView(this.f22156a0, ja.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22159b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f22159b0.setClipChildren(false);
        this.f22159b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f22156a0.addView(this.f22159b0, ja.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.f22156a0.addView(frameLayout4, ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f22162d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        this.f22162d0.setScaleType(scaleType);
        q6.s(this.f22162d0, i15, getResourceProvider(), mode);
        this.f22162d0.setBackground(new y1(j6.b0(getThemedColor(i13), j6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f22159b0.addView(this.f22162d0, ja.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        na.a(this.f22162d0);
        this.f22162d0.setContentDescription(hd.M0(2131755006, null));
        this.f22162d0.setOnClickListener(new g1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, ja.e(-2, 44, 81));
        s1 s1Var = new s1(context, 0);
        this.f22164e0 = s1Var;
        s1Var.setClipToOutline(true);
        this.f22164e0.setOutlineProvider(new bg.p0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f22166f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22166f0.setOrientation(0);
        this.f22164e0.addView(this.f22166f0);
        frameLayout6.addView(this.f22164e0, ja.c(-1.0f, -1));
        pg pgVar = new pg(context, 24);
        this.f22161c0 = pgVar;
        pgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        q6.s(this.f22161c0, i15, getResourceProvider(), mode);
        q6.Q(this.f22161c0, j6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), q6.M(i13), q6.M(i14), getResourceProvider());
        this.f22161c0.j(ng.f37572e, false);
        this.f22166f0.addView(this.f22161c0, ja.r(38, 38, 16));
        na.a(this.f22161c0);
        this.f22161c0.setContentDescription(hd.M0(2131754884, null));
        this.f22161c0.setOnClickListener(new g1(this, 5));
        h0(2131231595, 1, false).setOnClickListener(new ai.v2(29, this, context));
        h0(2131231567, 2, true).setOnClickListener(new g1(this, 6));
        h0(2131231584, 4, true).setOnClickListener(new g1(this, 7));
        h0(2131231569, 7, true).setOnClickListener(new g1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f22168h0 = imageView8;
        imageView8.setImageResource(2131232490);
        this.f22168h0.setScaleType(scaleType);
        q6.s(this.f22168h0, i15, getResourceProvider(), mode);
        q6.Q(this.f22168h0, j6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), q6.M(i13), q6.M(i14), getResourceProvider());
        this.f22166f0.addView(this.f22168h0, ja.t(38, 38, 16, 2, 0, 0, 0));
        na.a(this.f22168h0);
        this.f22168h0.setContentDescription(hd.M0(2131754921, null));
        this.f22168h0.setOnClickListener(new g1(this, 9));
        this.f22159b0.addView(frameLayout5, ja.l(1.0f, 0, 44));
        z51 z51Var = new z51(7, context, this);
        this.f22169i0 = z51Var;
        z51Var.setOrientation(0);
        this.f22169i0.setClipToPadding(false);
        this.f22169i0.setClipChildren(false);
        this.f22169i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22169i0, ja.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f22186w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f22186w0.setClipToPadding(false);
        this.f22186w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22186w0, ja.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f22188x0 = imageView9;
        imageView9.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = this.f22188x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f22188x0.setScaleType(scaleType);
        q6.s(this.f22188x0, i15, getResourceProvider(), mode);
        this.f22188x0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22186w0.addView(this.f22188x0, ja.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22169i0.addView(frameLayout8, ja.c(44.0f, -2));
        t1 t1Var = new t1(this, context);
        this.f22171k0 = t1Var;
        t1Var.setHorizontalScrollBarEnabled(false);
        this.f22171k0.setClipToOutline(true);
        this.f22171k0.setOutlineProvider(new bg.p0(5));
        frameLayout8.addView(this.f22171k0, ja.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f22170j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f22170j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22171k0.addView(this.f22170j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231551, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231582, 16384, true);
        i0(context, 2131231583, 32768, true);
        v1 v1Var = new v1(2131231580, context, getResourceProvider());
        this.f22184v0 = v1Var;
        v1Var.setContentDescription(hd.M0(2131746440, null));
        this.f22184v0.setOnClickListener(new g1(this, 11));
        LinearLayout linearLayout5 = this.f22170j0;
        v1 v1Var2 = this.f22184v0;
        if (linearLayout5.getChildCount() > 0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        linearLayout5.addView(v1Var2, ja.t(38, 38, 16, i7, 0, 0, 0));
        v1 v1Var3 = new v1(2131231548, context, getResourceProvider());
        this.f22181s0 = v1Var3;
        v1Var3.setContentDescription(hd.M0(2131746011, null));
        this.f22181s0.setOnClickListener(new g1(this, 12));
        LinearLayout linearLayout6 = this.f22170j0;
        v1 v1Var4 = this.f22181s0;
        if (linearLayout6.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout6.addView(v1Var4, ja.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f22175o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f22175o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22175o0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22169i0.addView(this.f22175o0, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var5 = new v1(2131231745, context, getResourceProvider());
        this.f22179r0 = v1Var5;
        v1Var5.setContentDescription(hd.M0(2131751744, null));
        this.f22179r0.setOnClickListener(new g1(this, 13));
        this.f22175o0.addView(this.f22179r0, ja.r(38, 38, 16));
        v1 v1Var6 = new v1(2131232078, context, getResourceProvider());
        this.f22182t0 = v1Var6;
        v1Var6.setContentDescription(hd.M0(2131754862, null));
        this.f22182t0.setOnClickListener(new g1(this, 14));
        this.f22175o0.addView(this.f22182t0, ja.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f22176p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f22176p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22176p0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22169i0.addView(this.f22176p0, ja.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var7 = new v1(2131231569, context, getResourceProvider());
        this.f22183u0 = v1Var7;
        v1Var7.d();
        arrayList.add(this.f22183u0);
        this.f22183u0.setContentDescription(hd.M0(2131754864, null));
        this.f22183u0.setOnClickListener(new g1(this, 15));
        this.f22176p0.addView(this.f22183u0, ja.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f22174n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f22174n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22174n0.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22169i0.addView(this.f22174n0, 0, ja.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var8 = new v1(0, context, getResourceProvider());
        this.f22177q0 = v1Var8;
        v1Var8.setImageDrawable(new org.telegram.ui.ActionBar.t2(context));
        this.f22177q0.setContentDescription(hd.M0(2131755006, null));
        this.f22177q0.setOnClickListener(new g1(this, 16));
        this.f22174n0.addView(this.f22177q0, ja.r(38, 38, 16));
        if (this.f22178r != null) {
            i11 = 2131231501;
        } else if (q0()) {
            i11 = 2131231511;
        } else {
            i11 = 2131232695;
        }
        u1 u1Var = new u1(this, context, i11, getResourceProvider());
        this.f22191z0 = u1Var;
        u1Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(j6.Pe))));
        na.a(this.f22191z0);
        this.f22159b0.addView(this.f22191z0, ja.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f22191z0.setContentDescription(hd.M0(2131745640, null));
        this.f22191z0.setOnClickListener(new g1(this, 0));
        this.f22191z0.setOnLongClickListener(new hi.p4(this, 4));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.f23605m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        F0();
        if (this.f22163e) {
            this.Q.F2();
            this.f22163e = false;
        }
        r1 r1Var = this.P;
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25498f5) {
            H0();
            F0();
        }
    }

    public final v1 h0(int i7, int i10, boolean z10) {
        int i11;
        v1 v1Var = new v1(i7, this.f22166f0.getContext(), getResourceProvider());
        if (z10) {
            v1Var.d();
            this.O.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(l0(i10));
        this.f22167g0.add(v1Var);
        LinearLayout linearLayout = this.f22166f0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ja.t(38, 38, 16, i11, 0, 0, 0));
        return v1Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z10) {
        int i11;
        v1 v1Var = new v1(i7, context, getResourceProvider());
        if (z10) {
            v1Var.d();
            this.O.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(n0(i10));
        v1Var.setOnClickListener(new ci.q(this, i10, 7));
        this.m0.add(v1Var);
        LinearLayout linearLayout = this.f22170j0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(v1Var, ja.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        q3 q3Var = this.Q;
        if (q3Var != null && q3Var.f21943v3.x()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R0, f10);
        this.Q0 = ofFloat;
        ofFloat.addUpdateListener(new h1(this, 0));
        this.Q0.setInterpolator(er.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        ly lyVar = this.B0;
        if (lyVar != null && (layoutParams = (FrameLayout.LayoutParams) lyVar.getLayoutParams()) != null) {
            int o02 = o0();
            r1 r1Var = this.P;
            if (r1Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((r1Var.getMeasuredHeight() - this.P.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.U0);
            }
            int round = Math.round(((max - o02) * this.R0) + o02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.B0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void m0() {
        FrameLayout.LayoutParams layoutParams;
        ly lyVar = this.B0;
        if (lyVar != null && (layoutParams = (FrameLayout.LayoutParams) lyVar.getLayoutParams()) != null) {
            int i7 = layoutParams.bottomMargin;
            int i10 = this.U0;
            if (i7 != i10) {
                layoutParams.bottomMargin = i10;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        q3 q3Var = this.Q;
        int i11 = this.U0;
        int i12 = this.V0;
        int i13 = this.E0;
        q3Var.W3 = i11;
        q3Var.X3 = i12;
        q3Var.Y3 = i13;
        int i14 = -max;
        this.Z.setTranslationY(i14);
        this.S.setTranslationY(i14 + this.U0);
    }

    public final int o0() {
        int i7;
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.x > point.y) {
            i7 = this.G0;
        } else {
            i7 = this.F0;
        }
        if (i7 <= 0) {
            return org.telegram.messenger.g0.L(200.0f);
        }
        return i7;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i10 == -1 && i7 == 21) {
            if (intent != null && intent.getData() != null) {
                q3 q3Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    q3Var.getClass();
                } else if (q3Var.getContext() != null) {
                    Utilities.f22416e.c(new kg.t1(26, q3Var, data));
                }
            }
        } else if (i10 == -1 && (i7 == 1 || i7 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.Q.h2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.D0;
        if (z11) {
            if (z11) {
                this.D0 = false;
                ly lyVar = this.B0;
                if (lyVar != null) {
                    lyVar.t(false);
                    this.B0.A();
                }
                j0(false);
                return false;
            }
        } else if (this.C0) {
            p0(true);
            return false;
        } else if (!this.Q.I2()) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f10;
        if (!z10 && !this.W0) {
            v0();
            this.W0 = true;
        }
        if (!org.telegram.messenger.g0.Q1() && this.f22180s != null && this.f22185w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            jh.f fVar = this.f22180s;
            this.f22189y = fVar.h;
            fVar.f17393e = false;
            fVar.invalidate();
            this.f22185w.setAlpha(0.0f);
            this.f22185w.f32215i2.setVisibility(4);
            A0();
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.J = f10;
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.F = true;
            this.P.invalidate();
            ofFloat.addUpdateListener(new h1(this, 1));
            ofFloat.addListener(new ah.l(11, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.T;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.f22156a0, property, 0.0f), ObjectAnimator.ofFloat(this.f22156a0, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.T;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.f22156a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f22156a0, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(er.h);
            this.P.post(new fq0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.f25498f5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ki.z1 z1Var;
        ns.f(this.currentAccount).n(this, ns.f25498f5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        l1 l1Var = this.O0;
        if (l1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.h3(l1Var);
        }
        bg0 bg0Var = this.P0;
        if (bg0Var != null) {
            bg0Var.i();
            this.P0 = null;
        }
        q3 q3Var = this.Q;
        if (q3Var != null) {
            q3Var.J2();
        }
        ga.d dVar = this.A0;
        if (dVar != null) {
            dVar.c();
        }
        super.onFragmentDestroy();
        ly lyVar = this.B0;
        if (lyVar != null) {
            lyVar.B();
        }
        r1 r1Var = this.P;
        if (r1Var != null && (z1Var = this.I0) != null) {
            r1Var.f39419r.remove(z1Var);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.U0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        m0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        boolean z10;
        m60 m60Var;
        i0.c f10 = k1Var.f55682a.f(3);
        int i7 = k1Var.f55682a.f(8).d;
        this.V0 = i7;
        int i10 = i7 - f10.d;
        boolean z11 = this.H0;
        if (i10 > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = z10;
        if (z10 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f23611q;
            if (point.x > point.y) {
                this.G0 = i10;
                np.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                np.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z11 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z11 && (m60Var = this.f22190y0) != null) {
            m60Var.u();
            this.f22190y0 = null;
        }
        onInsets(f10.f15574a, f10.f15575b, f10.f15576c, f10.d);
        return r0.k1.f55681b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = j6.f28849d6;
            int themedColor = getThemedColor(i7);
            int i10 = j6.f28941i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = j6.Pe;
            int themedColor3 = getThemedColor(i11);
            if (!this.f22157a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.f22157a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), j6.r1(0.0f, getThemedColor(i7))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new y1(j6.b0(getThemedColor(i7), j6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                ImageView imageView2 = this.f22162d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new y1(j6.b0(getThemedColor(i7), j6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                fh0 fh0Var = this.f22188x0;
                if (fh0Var != null) {
                    fh0Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout2 = this.f22175o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout3 = this.f22176p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout4 = this.f22174n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                u1 u1Var = this.f22191z0;
                if (u1Var != null) {
                    u1Var.setBackground(new y1(j6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        q3 q3Var;
        int i7;
        q3 q3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i7 = this.f22160c) >= 0 && (q3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f22160c = -1;
            if (!q3Var2.c2(i7, i10)) {
                q3Var2.post(new l2(q3Var2, i7, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f22158b != null || this.f22165f != null) && (q3Var = this.Q) != null && !q3Var.d3()) {
                q3Var.post(new b(q3Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ly lyVar = this.B0;
            if (lyVar != null) {
                lyVar.t(false);
                this.B0.A();
            }
        }
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q0 = null;
        }
        this.R0 = 0.0f;
        this.S0 = null;
        ly lyVar2 = this.B0;
        if (lyVar2 != null) {
            lyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        pg pgVar = this.f22161c0;
        if (pgVar != null) {
            pgVar.j(ng.f37572e, z10);
        }
    }

    public final boolean q0() {
        an anVar;
        if (this.f22178r == null && (anVar = this.K) != null && anVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!np.s1(this.currentAccount).s4() && !m10.i(this.currentAccount).q()) {
            q3 q3Var = this.Q;
            if (y4.d(q3Var.f21939t3, q3Var.f21941u3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s0() {
        h3 k22 = this.Q.k2();
        if (k22 != null) {
            TL_iv.RichMessage a10 = k22.a();
            if (a10.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(getParentActivity(), getResourceProvider());
            d0Var.r1(a10);
            d0Var.f33754g2 = new g7(k22, 14);
            d0Var.show();
        }
    }

    public final void t0(int i7, int i10) {
        q3 q3Var = this.Q;
        q3Var.f21925k4 = q3Var.T2();
        ki kiVar = new ki(getParentActivity(), this, false, false, true, getResourceProvider());
        kiVar.X3 = new o1(this, kiVar);
        kiVar.f36435e2.setIncludeVideosInGallery(true);
        kiVar.f36435e2.i0();
        kiVar.y1(1, true);
        kiVar.V0(i7);
        kiVar.f36491u4 = new n1(this, kiVar);
        kiVar.T1 = new n1(this, kiVar);
        kiVar.S1 = new p1(this, kiVar);
        kiVar.e1();
        if (i10 != 0) {
            kiVar.o1(i10);
        }
        kiVar.A0(true);
        kiVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.K == null || this.f22178r != null || !this.Q.u2()) {
            return false;
        }
        if (this.N) {
            m22 = null;
        } else {
            m22 = this.Q.m2();
        }
        if (m22 == null && (runnable = this.M) != null) {
            runnable.run();
        }
        qj qjVar = this.K.f45117a0;
        if (m22 != null && !this.N) {
            q3 q3Var = this.Q;
            if (q3Var.n3() && !y4.d(q3Var.f21939t3, q3Var.f21941u3) && qjVar != null) {
                SpannableStringBuilder g10 = y4.g(this.Q.f21939t3);
                an anVar = qjVar.f32319x3;
                if (qjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                org.telegram.messenger.j6.m(spannableStringBuilder, qjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p5.class);
                if (p5VarArr != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        p5Var.applyFontMetrics(qjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.g5.f());
                    }
                }
                xg0.a(spannableStringBuilder);
                if (anVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    si.b0(qjVar.R).Q1(anVar.a(), anVar.Q7(anVar.E5), charSequenceArr[0], si.b0(qjVar.R).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                qjVar.setRichDraftPreview(null);
                if (qjVar.F0.getText() != null) {
                    qjVar.F0.getText().clear();
                }
                qjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        si mediaDataController = getMediaDataController();
        long a10 = this.K.a();
        an anVar2 = this.K;
        mediaDataController.Q1(a10, anVar2.Q7(anVar2.E5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (qjVar == null) {
            return true;
        }
        qjVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            q3 q3Var = this.Q;
            Objects.requireNonNull(q3Var);
            u0(parentActivity, new b(q3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.t4.J(getParentActivity(), this.K.a(), new hi.l0(this, 18), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i7, final int i10, final boolean z10) {
        qj qjVar;
        cg cgVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            q3 q3Var = this.Q;
            Objects.requireNonNull(q3Var);
            u0(parentActivity, new b(q3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (this.K != null && this.Q.n3() && !this.Q.p3()) {
            if (!this.Q.P3()) {
                G0();
            } else if (!np.s1(this.currentAccount).s4()) {
                qj qjVar2 = this.K.f45117a0;
                if (qjVar2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    qjVar2.i1(y4.g(this.Q.f21939t3), z10, i7, i10);
                    finishFragment();
                }
            } else {
                this.N = true;
                final ArrayList c32 = this.Q.c3();
                if (c32.isEmpty()) {
                    return;
                }
                final ArrayList E2 = this.Q.E2();
                final ArrayList B2 = this.Q.B2();
                final ArrayList a10 = x4.a(this.currentAccount, c32);
                final long a11 = this.K.a();
                an anVar = this.K;
                final gj gjVar = anVar.E5;
                final gj gjVar2 = anVar.f45280m4;
                final qm qmVar = anVar.C5;
                final long j92 = anVar.j9();
                final fw Y8 = this.K.Y8();
                final gj gjVar3 = this.f22178r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        z1.d0(z1.this, gjVar3, c32, E2, B2, a10, a11, gjVar, gjVar2, qmVar, z10, i7, i10, Y8, j92);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (gjVar3 == null && (qjVar = this.K.f45117a0) != null && (cgVar = qjVar.H3) != null) {
                    cgVar.M(null, z10, i7, i10, 0L);
                }
                if (i7 != 0 && gjVar3 == null) {
                    this.O0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void y0(boolean z10) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v1 v1Var = (v1) obj;
            if (((Integer) v1Var.getTag()).intValue() == 1) {
                v1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        v1 v1Var = this.f22179r0;
        if (v1Var != null) {
            v1Var.setEnabled(z10);
        }
        v1 v1Var2 = this.f22181s0;
        if (v1Var2 != null) {
            v1Var2.setEnabled(z11);
        }
        v1 v1Var3 = this.f22182t0;
        if (v1Var3 != null) {
            v1Var3.setEnabled(z10);
        }
        v1 v1Var4 = this.f22183u0;
        if (v1Var4 != null) {
            v1Var4.setEnabled(z10);
        }
    }

    public z1(String str) {
        super(null);
        this.f22160c = -1;
        this.d = -1;
        this.f22187x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22167g0 = new ArrayList();
        this.f22172l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22165f = str;
    }

    public z1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f22160c = -1;
        this.d = -1;
        this.f22187x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22167g0 = new ArrayList();
        this.f22172l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22158b = richMessage;
    }
}
