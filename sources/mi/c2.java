package mi;

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
import b8.mf;
import b8.pf;
import ci.ba;
import gi.j8;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.messenger.zv;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mj;
import org.telegram.ui.mm;
import org.telegram.ui.s51;
import org.telegram.ui.vf0;
import org.telegram.ui.wm;
import org.telegram.ui.xp0;
public final class c2 extends org.telegram.ui.ActionBar.d2 implements cs {
    public fa.f A0;
    public ey B0;
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
    public ii.z1 I0;
    public float J;
    public int J0;
    public wm K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public o1 O0;
    public u1 P;
    public vf0 P0;
    public t3 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public h1 S0;
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
    public final CharSequence f19506a;
    public FrameLayout f19507a0;
    public boolean f19508a1;
    public final TL_iv.RichMessage f19509b;
    public LinearLayout f19510b0;
    public int f19511c;
    public hg f19512c0;
    public int d;
    public ImageView f19513d0;
    public boolean f19514e;
    public v1 f19515e0;
    public final String f19516f;
    public LinearLayout f19517f0;
    public final ArrayList f19518g0;
    public CharSequence h;
    public ImageView f19519h0;
    public s51 f19520i0;
    public LinearLayout f19521j0;
    public w1 f19522k0;
    public int f19523l0;
    public final ArrayList m0;
    public CharSequence f19524n;
    public LinearLayout f19525n0;
    public LinearLayout f19526o0;
    public LinearLayout f19527p0;
    public y1 f19528q0;
    public zi f19529r;
    public y1 f19530r0;
    public kh.f f19531s;
    public y1 f19532s0;
    public y1 f19533t0;
    public y1 f19534u0;
    public y1 f19535v0;
    public mj f19536w;
    public FrameLayout f19537w0;
    public final Rect f19538x;
    public fh0 f19539x0;
    public gh.g f19540y;
    public f60 f19541y0;
    public x1 f19542z0;

    public c2(Editable editable) {
        super(null);
        this.f19511c = -1;
        this.d = -1;
        this.f19538x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f19518g0 = new ArrayList();
        this.f19523l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new i1(this, 0);
        this.f19506a = editable;
    }

    public static void Z(c2 c2Var) {
        h3 h3Var = c2Var.Q.f19928v3;
        if (h3Var != null && h3Var.x()) {
            c2Var.s0();
            return;
        }
        Activity parentActivity = c2Var.getParentActivity();
        new v(c2Var.currentAccount, parentActivity, new j8(c2Var, 14), c2Var.getResourceProvider()).show();
    }

    public static void a0(c2 c2Var) {
        if (!h10.i(c2Var.currentAccount).q()) {
            c2Var.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) c2Var, 43, true));
        }
    }

    public static boolean b0(c2 c2Var, View view) {
        int i3;
        wm wmVar = c2Var.K;
        if (wmVar != null && c2Var.f19529r == null && !wmVar.c() && c2Var.Q.n3() && !c2Var.Q.p3()) {
            if (!c2Var.Q.P3()) {
                c2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = c2Var.Q.c3();
            if (!c32.isEmpty()) {
                vf0 vf0Var = c2Var.P0;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    c2Var.P0 = null;
                }
                vf0 vf0Var2 = new vf0(c2Var.getParentActivity(), c2Var.getResourceProvider());
                c2Var.P0 = vf0Var2;
                vf0Var2.setOnDismissListener(new ba(c2Var, 8));
                long a10 = c2Var.K.a();
                zi ziVar = c2Var.K.E5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f27022id = 0;
                tL_message.out = true;
                tL_message.peer_id = hp.s1(c2Var.currentAccount).z1(a10);
                tL_message.from_id = hp.s1(c2Var.currentAccount).z1(h10.i(c2Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = c2Var.Q.E2();
                tL_message.rich_message.documents = c2Var.Q.B2();
                if (ziVar != null && !ziVar.f26885p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = ziVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                zi ziVar2 = new zi(c2Var.currentAccount, tL_message, false, false);
                if (ziVar != null && !ziVar.f26885p) {
                    ziVar2.C = ziVar;
                }
                ziVar2.f26925z0 = true;
                ziVar2.U2 = Boolean.TRUE;
                ziVar2.n0(null);
                ziVar2.f26907u1 = true;
                c2Var.P0.p(org.telegram.messenger.k5.k(ziVar2));
                c2Var.f19542z0.setScaleX(1.0f);
                c2Var.f19542z0.setScaleY(1.0f);
                bg q10 = c2Var.P0.q(c2Var.f19542z0, true, new j1(c2Var, 10));
                if (q10 != null) {
                    q10.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), c2Var.getThemedColor(k6.Ci))));
                    vf0 vf0Var3 = c2Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    vf0Var3.m0 = true;
                    vf0Var3.Y = L;
                }
                f60 H = f60.H(c2Var, c2Var.f19542z0);
                boolean B = l10.B(c2Var.K.j());
                if (c2Var.K.R6()) {
                    if (B) {
                        i3 = 2131745524;
                    } else {
                        i3 = 2131745869;
                    }
                    H.c(2131232077, bd.M0(i3, null), new ci.e3(c2Var, a10, 15), false);
                    if (!B && a10 > 0) {
                        H.c(2131232264, bd.M0(2131745596, null), new i1(c2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(2131231508, bd.M0(2131745593, null), new i1(c2Var, 6), false);
                }
                H.Y();
                c2Var.P0.o(H);
                c2Var.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final c2 c2Var, Context context, View view) {
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
        f60 f60Var = c2Var.f19541y0;
        if (f60Var != null) {
            f60Var.u();
            c2Var.f19541y0 = null;
        }
        if (!hp.s1(c2Var.currentAccount).s4() && !h10.i(c2Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = c2Var.Q.T2();
        final f60 I = f60.I(c2Var, view);
        I.Q = true;
        f60 J = I.J();
        J.c(2131231240, bd.M0(2131753756, null), new ai.g4(I, 8), false);
        J.k();
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, 2131231558, null, bd.M0(2131754030, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0 + 2);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, 2131231559, null, bd.M0(2131754029, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0 + 1);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, 2131231560, null, bd.M0(2131754028, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, 2131231561, null, bd.M0(2131754027, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0 - 1);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, 2131231562, null, bd.M0(2131754026, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0 - 2);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, 2131231563, null, bd.M0(2131754025, null), new Runnable(c2Var) {
            public final c2 f19756b;

            {
                this.f19756b = c2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f19756b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28812a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28812a.setTextSize(1, az.W0 - 3);
        if (T2 != null && t3.F3(T2.f19431b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        a2 a2Var = new a2(context, 2131231557);
        a2Var.a(z10);
        int i3 = k6.G8;
        a2Var.d = i3;
        I.j(z17, 0, a2Var, bd.M0(2131754031, null), new ai.y3(I, J, 3));
        I.y().f28812a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.y0 y9 = I.y();
        float f15 = 9.0f;
        if (bd.f21784a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (bd.f21784a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        y9.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, 2131231596, null, bd.M0(2131753988, null), new m1(c2Var, T2, 3));
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, 2131231580, null, bd.M0(2131753996, null), new m1(c2Var, T2, 4));
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        a2 a2Var2 = new a2(context, 2131231579);
        a2Var2.a(z10);
        a2Var2.d = i3;
        I.j(z20, 0, a2Var2, bd.M0(2131753997, null), new m1(c2Var, T2, 0));
        org.telegram.ui.ActionBar.y0 y10 = I.y();
        if (bd.f21784a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (bd.f21784a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        y10.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, 2131231551, null, bd.M0(2131754055, null), new m1(c2Var, T2, 1));
        if (T2 != null && (T2.f19431b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        a2 a2Var3 = new a2(context, 2131231554);
        a2Var3.a(z10);
        a2Var3.d = i3;
        I.j(z22, 0, a2Var3, bd.M0(2131754032, null), new m1(c2Var, T2, 2));
        org.telegram.ui.ActionBar.y0 y11 = I.y();
        if (bd.f21784a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!bd.f21784a0) {
            f15 = 18.0f;
        }
        y11.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        I.Z();
        c2Var.f19541y0 = I;
    }

    public static void d0(c2 c2Var, zi ziVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, zi ziVar2, zi ziVar3, mm mmVar, boolean z10, int i3, int i10, zv zvVar, long j11) {
        if (ziVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(c2Var.currentAccount);
            wm wmVar = c2Var.K;
            org.telegram.messenger.p5 p5Var = yy.J;
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
                yy.j(pageBlock2, identityHashMap);
            }
            yy.C(a10.f21919a).v(ziVar, richMessage, arrayList4, wmVar, false);
            return;
        }
        yy.R(org.telegram.messenger.c.a(c2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j10, ziVar2, ziVar3, mmVar, z10, i3, i10, zvVar, 0L, j11, 0L);
    }

    public static void e0(c2 c2Var, boolean z10, boolean z11) {
        float f10;
        int i3;
        if (c2Var.K0 != z10 || !z11) {
            c2Var.K0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z11) {
                c2Var.f19539x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
            } else {
                c2Var.f19539x0.animate().cancel();
                c2Var.f19539x0.setScaleX(f10);
                c2Var.f19539x0.setScaleY(f10);
            }
            fh0 fh0Var = c2Var.f19539x0;
            if (z10) {
                i3 = k6.f28122q7;
            } else {
                i3 = k6.G6;
            }
            r6.t(fh0Var, i3, c2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            ch0 animatedDrawable = c2Var.f19539x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f32721b0 > 34) {
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

    public static h1 f0(c2 c2Var) {
        h1 focusedEditTextOrNull = c2Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            c2Var.S0 = focusedEditTextOrNull;
            c2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        h1 h1Var = c2Var.S0;
        if (h1Var != null) {
            return h1Var;
        }
        return c2Var.Q.S2();
    }

    public static int g0(c2 c2Var, h1 h1Var) {
        if (h1Var == c2Var.S0 && c2Var.Q.getFocusedEditTextOrNull() != h1Var) {
            return Math.min(c2Var.T0, h1Var.length());
        }
        return Math.max(0, h1Var.getSelectionEnd());
    }

    public static String l0(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 7) {
                        if (i3 != 9) {
                            return null;
                        }
                        return bd.M0(2131754869, null);
                    }
                    return bd.M0(2131754864, null);
                }
                return bd.M0(2131754855, null);
            }
            return bd.M0(2131754860, null);
        }
        return bd.M0(2131754854, null);
    }

    public static String n0(int i3) {
        if (i3 == 1) {
            return bd.M0(2131753671, null);
        }
        if (i3 == 2) {
            return bd.M0(2131749095, null);
        }
        if (i3 == 16) {
            return bd.M0(2131743899, null);
        }
        if (i3 == 8) {
            return bd.M0(2131744447, null);
        }
        if (i3 == 256) {
            return bd.M0(2131745272, null);
        }
        if (i3 == 4) {
            return bd.M0(2131748358, null);
        }
        if (i3 == 65536) {
            return bd.M0(2131749311, null);
        }
        if (i3 == 16384) {
            return bd.M0(2131744435, null);
        }
        if (i3 != 32768) {
            return null;
        }
        return bd.M0(2131744337, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.e6 e6Var) {
        final org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231602);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i3 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.w0(i3, e6Var));
        n6 N = r6.N(i3);
        e10.setBackground(L2);
        r6.k(e10, L2, N, null, e6Var);
        f10.addView(e10, mf.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = k6.G6;
        r6.V(textView, i10, e6Var);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, mf.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(bd.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        r6.V(f11, i10, e6Var);
        f10.addView(f11, mf.t(-1, -2, 49, 25, 11, 25, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(bd.M0(2131754043, null));
        f10.addView(h, mf.t(-1, 48, 49, 14, 31, 14, 0));
        gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, false);
        h7.setText(bd.M0(2131754044, null));
        f10.addView(h7, mf.t(-1, 48, 49, 14, 2, 14, 6));
        l10.show();
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        l10.dismiss();
                        runnable2.run();
                        return;
                    default:
                        l10.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        l10.dismiss();
                        runnable.run();
                        return;
                    default:
                        l10.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        kh.f fVar = this.f19531s;
        int[] iArr = this.G;
        fVar.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.f19540y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.f19536w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr2 = this.I;
        iArr2[0] = (int) (iArr2[0] - (this.f19536w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: mi.c2.B0():void");
    }

    public final void C0(int i3, boolean z10) {
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
        if (this.L0 == i3) {
            return;
        }
        this.L0 = i3;
        int i12 = 0;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z10) {
            this.f19510b0.setVisibility(0);
            ViewPropertyAnimator animate = this.f19510b0.animate();
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
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new i1(this, 1)).start();
            this.f19520i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f19520i0.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(xqVar).withEndAction(new i1(this, 2)).start();
            this.f19537w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f19537w0.animate();
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(xqVar).withEndAction(new i1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f19510b0;
        if (i3 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f19510b0;
        if (i3 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f19510b0;
        if (i3 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f19510b0;
        if (i3 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f19510b0;
        if (i3 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        s51 s51Var = this.f19520i0;
        if (i3 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        s51Var.setVisibility(i11);
        s51 s51Var2 = this.f19520i0;
        if (i3 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        s51Var2.setAlpha(f13);
        s51 s51Var3 = this.f19520i0;
        if (i3 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        s51Var3.setScaleX(f14);
        s51 s51Var4 = this.f19520i0;
        if (i3 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        s51Var4.setScaleY(f15);
        s51 s51Var5 = this.f19520i0;
        if (i3 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        s51Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f19537w0;
        if (i3 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f19537w0;
        if (i3 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f19537w0;
        if (i3 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f19537w0;
        if (i3 == 2) {
            f25 = 1.0f;
        }
        frameLayout4.setScaleY(f25);
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        boolean g7;
        boolean z12;
        boolean h;
        boolean z13;
        int max;
        int max2;
        boolean z14;
        boolean z15;
        boolean z16;
        h1 h1Var;
        int max3;
        boolean z17;
        boolean z18;
        h9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            y1 y1Var = this.f19535v0;
            boolean z19 = false;
            if (y1Var != null) {
                t3 t3Var = this.Q;
                int[] E4 = t3Var.E4();
                if (E4 != null && t3Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                y1Var.setSelected(z18);
            }
            if (this.Q.O3()) {
                h9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
                int i3 = textSelectionHelper2.f29352p0;
                int i10 = textSelectionHelper2.f29353q0;
                int i11 = textSelectionHelper2.f29356t0;
                int i12 = textSelectionHelper2.f29354r0;
                int i13 = textSelectionHelper2.f29357u0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    y1 y1Var2 = (y1) obj;
                    y1Var2.setSelected(this.Q.N3(((Integer) y1Var2.getTag()).intValue(), i3, i10, i12, i11, i13));
                }
                if (i10 == i11) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    h1Var = this.Q.Q4(i3, i10);
                } else {
                    h1Var = null;
                }
                int max4 = Math.max(0, Math.min(i12, i13));
                if (h1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i12, i13), h1Var.length()));
                }
                y1 y1Var3 = this.f19530r0;
                if (y1Var3 != null) {
                    if (h1Var != null && max4 < max3 && d6.h(h1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    y1Var3.setSelected(z17);
                }
                y1 y1Var4 = this.f19533t0;
                if (y1Var4 != null) {
                    if (h1Var != null && max4 < max3 && d6.g(h1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    y1Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.Q.o2());
            } else if (this.Q.z3()) {
                h9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
                h1 v22 = this.Q.v2(textSelectionHelper3.f29352p0);
                int i15 = textSelectionHelper3.f29354r0;
                int i16 = textSelectionHelper3.f29357u0;
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
                    y1 y1Var5 = (y1) obj2;
                    int intValue = ((Integer) y1Var5.getTag()).intValue();
                    if (v22 != null && max < max2 && (intValue & v22.c(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    y1Var5.setSelected(z15);
                }
                y1 y1Var6 = this.f19530r0;
                if (y1Var6 != null) {
                    if (v22 != null && max < max2 && d6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    y1Var6.setSelected(z14);
                }
                y1 y1Var7 = this.f19533t0;
                if (y1Var7 != null) {
                    if (v22 != null && max < max2 && d6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    y1Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.Q.o2());
            } else {
                int i18 = textSelectionHelper.f29352p0;
                int i19 = textSelectionHelper.f29355s0;
                int i20 = textSelectionHelper.f29354r0;
                int i21 = textSelectionHelper.f29357u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.f19933x4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    y1 y1Var8 = (y1) arrayList.get(i22);
                    int intValue2 = ((Integer) y1Var8.getTag()).intValue();
                    if (z10 && this.Q.M3(intValue2, i18, i20, i19, i21)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    y1Var8.setSelected(z13);
                    i22 = i23;
                }
                y0(!this.Q.L3());
                y1 y1Var9 = this.f19530r0;
                if (y1Var9 != null) {
                    if (z10) {
                        Editable K4 = this.Q.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = d6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            y1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    y1Var9.setSelected(z12);
                }
                y1 y1Var10 = this.f19533t0;
                if (y1Var10 != null) {
                    if (z10) {
                        Editable K42 = this.Q.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g7 = false;
                        } else {
                            g7 = d6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g7) {
                            z11 = true;
                            y1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    y1Var10.setSelected(z11);
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
        g2 g2Var = this.Q.R3;
        if (g2Var != null && !g2Var.f19624c.isEmpty()) {
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
        int i3 = 0;
        if (!hp.s1(this.currentAccount).s4() && !h10.i(this.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((y1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        float f10;
        if (this.f19542z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.f19542z0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f19542z0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 150L);
    }

    public final void H0() {
        x1 x1Var = this.f19542z0;
        if (x1Var == null) {
            return;
        }
        x1Var.setLocked(r0());
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new u1(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ii.z1 z1Var = new ii.z1(this, 1);
        this.I0 = z1Var;
        this.P.f37537r.add(z1Var);
        t3 t3Var = new t3(context, this.currentAccount, getResourceProvider(), new hi.d(this, 14));
        this.Q = t3Var;
        t3Var.setFileRefParentObject(this.f19529r);
        this.P.addView(this.Q, mf.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), mf.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f19509b;
        if (richMessage != null) {
            t3 t3Var2 = this.Q;
            ArrayList arrayList2 = t3Var2.f19924t3;
            t3Var2.f19922s3 = richMessage;
            t3.Z2(arrayList2, richMessage.blocks, t3Var2.f19926u3);
            t3Var2.Y3();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                t3Var2.y4((a) arrayList2.get(i3));
            }
            t3Var2.f35594g3.O(false);
        } else {
            String str = this.f19516f;
            if (str != null) {
                t3 t3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f19524n;
                HashMap hashMap = t3Var3.f19926u3;
                ArrayList arrayList3 = t3Var3.f19924t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    t3.Z2(arrayList3, b5.b(charSequence), hashMap);
                }
                arrayList3.addAll(t3Var3.z4(b4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    t3.Z2(arrayList3, b5.b(charSequence2), hashMap);
                }
                t3Var3.Y3();
                t3Var3.f35594g3.O(false);
            } else {
                CharSequence charSequence3 = this.f19506a;
                if (charSequence3 != null) {
                    this.Q.setInitialText(charSequence3);
                }
            }
        }
        g2 g2Var = this.Q.R3;
        if (g2Var != null) {
            g2Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = k6.f27878d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i10), k6.r1(0.0f, getThemedColor(i10))}));
        this.P.addView(this.R, mf.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{k6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
        this.P.addView(this.S, mf.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, mf.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231240);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(i10);
        int i11 = k6.f27972i6;
        imageView3.setBackground(new b2(k6.b0(themedColor, k6.w(themedColor2, getThemedColor(i11)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i12 = k6.G6;
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView4, i12, resourceProvider, mode);
        pf.a(this.U);
        this.U.setContentDescription(bd.M0(2131754878, null));
        this.U.setOnClickListener(new j1(this, 1));
        this.T.addView(this.U, mf.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.T.addView(this.V, mf.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231598);
        this.W.setScaleType(scaleType);
        r6.R(this.W, k6.h0(getThemedColor(i11), 1, -1), null, r6.N(i11), getResourceProvider());
        r6.t(this.W, i12, getResourceProvider(), mode);
        pf.a(this.W);
        this.W.setContentDescription(bd.M0(2131743897, null));
        this.W.setOnClickListener(new j1(this, 2));
        this.V.addView(this.W, mf.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231581);
        this.X.setScaleType(scaleType);
        r6.R(this.X, k6.h0(getThemedColor(i11), 1, -1), null, r6.N(i11), getResourceProvider());
        r6.t(this.X, i12, getResourceProvider(), mode);
        pf.a(this.X);
        this.X.setContentDescription(bd.M0(2131746350, null));
        this.X.setOnClickListener(new j1(this, 3));
        this.V.addView(this.X, mf.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, mf.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f19507a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f19507a0.setClipToPadding(false);
        this.Z.addView(this.f19507a0, mf.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f19510b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f19510b0.setClipChildren(false);
        this.f19510b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f19507a0.addView(this.f19510b0, mf.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.f19507a0.addView(frameLayout4, mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f19513d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        this.f19513d0.setScaleType(scaleType);
        r6.t(this.f19513d0, i12, getResourceProvider(), mode);
        this.f19513d0.setBackground(new b2(k6.b0(getThemedColor(i10), k6.w(getThemedColor(i10), getThemedColor(i11)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f19510b0.addView(this.f19513d0, mf.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        pf.a(this.f19513d0);
        this.f19513d0.setContentDescription(bd.M0(2131755006, null));
        this.f19513d0.setOnClickListener(new j1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        frameLayout5.addView(frameLayout6, mf.e(-2, 44, 81));
        v1 v1Var = new v1(context, 0);
        this.f19515e0 = v1Var;
        v1Var.setClipToOutline(true);
        this.f19515e0.setOutlineProvider(new cg.p0(5));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f19517f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f19517f0.setOrientation(0);
        this.f19515e0.addView(this.f19517f0);
        frameLayout6.addView(this.f19515e0, mf.c(-1.0f, -1));
        hg hgVar = new hg(context, 24);
        this.f19512c0 = hgVar;
        hgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(this.f19512c0, i12, getResourceProvider(), mode);
        r6.R(this.f19512c0, k6.b0(getThemedColor(i10), getThemedColor(i11), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i10), r6.N(i11), getResourceProvider());
        this.f19512c0.j(fg.f33793e, false);
        this.f19517f0.addView(this.f19512c0, mf.r(38, 38, 16));
        pf.a(this.f19512c0);
        this.f19512c0.setContentDescription(bd.M0(2131754884, null));
        this.f19512c0.setOnClickListener(new j1(this, 5));
        h0(2131231595, 1, false).setOnClickListener(new ai.d(28, this, context));
        h0(2131231567, 2, true).setOnClickListener(new j1(this, 6));
        h0(2131231584, 4, true).setOnClickListener(new j1(this, 7));
        h0(2131231569, 7, true).setOnClickListener(new j1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f19519h0 = imageView8;
        imageView8.setImageResource(2131232489);
        this.f19519h0.setScaleType(scaleType);
        r6.t(this.f19519h0, i12, getResourceProvider(), mode);
        r6.R(this.f19519h0, k6.b0(getThemedColor(i10), getThemedColor(i11), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i10), r6.N(i11), getResourceProvider());
        this.f19517f0.addView(this.f19519h0, mf.t(38, 38, 16, 2, 0, 0, 0));
        pf.a(this.f19519h0);
        this.f19519h0.setContentDescription(bd.M0(2131754921, null));
        this.f19519h0.setOnClickListener(new j1(this, 9));
        this.f19510b0.addView(frameLayout5, mf.l(1.0f, 0, 44));
        s51 s51Var = new s51(7, context, this);
        this.f19520i0 = s51Var;
        s51Var.setOrientation(0);
        this.f19520i0.setClipToPadding(false);
        this.f19520i0.setClipChildren(false);
        this.f19520i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f19520i0, mf.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f19537w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f19537w0.setClipToPadding(false);
        this.f19537w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f19537w0, mf.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f19539x0 = imageView9;
        imageView9.f(2131624042, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        ch0 animatedDrawable = this.f19539x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f19539x0.setScaleType(scaleType);
        r6.t(this.f19539x0, i12, getResourceProvider(), mode);
        this.f19539x0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.f19537w0.addView(this.f19539x0, mf.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.f19520i0.addView(frameLayout8, mf.c(44.0f, -2));
        w1 w1Var = new w1(this, context);
        this.f19522k0 = w1Var;
        w1Var.setHorizontalScrollBarEnabled(false);
        this.f19522k0.setClipToOutline(true);
        this.f19522k0.setOutlineProvider(new cg.p0(6));
        frameLayout8.addView(this.f19522k0, mf.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f19521j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f19521j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f19522k0.addView(this.f19521j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231551, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231582, 16384, true);
        i0(context, 2131231583, 32768, true);
        y1 y1Var = new y1(2131231580, context, getResourceProvider());
        this.f19535v0 = y1Var;
        y1Var.setContentDescription(bd.M0(2131746448, null));
        this.f19535v0.setOnClickListener(new j1(this, 11));
        LinearLayout linearLayout5 = this.f19521j0;
        linearLayout5.addView(this.f19535v0, mf.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        y1 y1Var2 = new y1(2131231548, context, getResourceProvider());
        this.f19532s0 = y1Var2;
        y1Var2.setContentDescription(bd.M0(2131746021, null));
        this.f19532s0.setOnClickListener(new j1(this, 12));
        LinearLayout linearLayout6 = this.f19521j0;
        linearLayout6.addView(this.f19532s0, mf.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f19526o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f19526o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f19526o0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.f19520i0.addView(this.f19526o0, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var3 = new y1(2131231745, context, getResourceProvider());
        this.f19530r0 = y1Var3;
        y1Var3.setContentDescription(bd.M0(2131751745, null));
        this.f19530r0.setOnClickListener(new j1(this, 13));
        this.f19526o0.addView(this.f19530r0, mf.r(38, 38, 16));
        y1 y1Var4 = new y1(2131232077, context, getResourceProvider());
        this.f19533t0 = y1Var4;
        y1Var4.setContentDescription(bd.M0(2131754862, null));
        this.f19533t0.setOnClickListener(new j1(this, 14));
        this.f19526o0.addView(this.f19533t0, mf.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f19527p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f19527p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f19527p0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.f19520i0.addView(this.f19527p0, mf.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        y1 y1Var5 = new y1(2131231569, context, getResourceProvider());
        this.f19534u0 = y1Var5;
        y1Var5.d();
        arrayList.add(this.f19534u0);
        this.f19534u0.setContentDescription(bd.M0(2131754864, null));
        this.f19534u0.setOnClickListener(new j1(this, 15));
        this.f19527p0.addView(this.f19534u0, mf.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f19525n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f19525n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f19525n0.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i10))));
        this.f19520i0.addView(this.f19525n0, 0, mf.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        y1 y1Var6 = new y1(0, context, getResourceProvider());
        this.f19528q0 = y1Var6;
        y1Var6.setImageDrawable(new org.telegram.ui.ActionBar.s2(context));
        this.f19528q0.setContentDescription(bd.M0(2131755006, null));
        this.f19528q0.setOnClickListener(new j1(this, 16));
        this.f19525n0.addView(this.f19528q0, mf.r(38, 38, 16));
        x1 x1Var = new x1(this, context, this.f19529r != null ? 2131231501 : q0() ? 2131231511 : 2131232692, getResourceProvider());
        this.f19542z0 = x1Var;
        x1Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(k6.Me))));
        pf.a(this.f19542z0);
        this.f19510b0.addView(this.f19542z0, mf.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f19542z0.setContentDescription(bd.M0(2131745650, null));
        this.f19542z0.setOnClickListener(new j1(this, 0));
        this.f19542z0.setOnLongClickListener(new gi.p4(this, 3));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.f22602m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        F0();
        if (this.f19514e) {
            this.Q.F2();
            this.f19514e = false;
        }
        u1 u1Var = this.P;
        this.fragmentView = u1Var;
        return u1Var;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23230f5) {
            H0();
            F0();
        }
    }

    public final y1 h0(int i3, int i10, boolean z10) {
        int i11;
        y1 y1Var = new y1(i3, this.f19517f0.getContext(), getResourceProvider());
        if (z10) {
            y1Var.d();
            this.O.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(l0(i10));
        this.f19518g0.add(y1Var);
        LinearLayout linearLayout = this.f19517f0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(y1Var, mf.t(38, 38, 16, i11, 0, 0, 0));
        return y1Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i3, int i10, boolean z10) {
        int i11;
        y1 y1Var = new y1(i3, context, getResourceProvider());
        if (z10) {
            y1Var.d();
            this.O.add(y1Var);
        }
        y1Var.setTag(Integer.valueOf(i10));
        y1Var.setContentDescription(n0(i10));
        y1Var.setOnClickListener(new bi.q(this, i10, 7));
        this.m0.add(y1Var);
        LinearLayout linearLayout = this.f19521j0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(y1Var, mf.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t3 t3Var = this.Q;
        if (t3Var != null && t3Var.f19928v3.x()) {
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
        ofFloat.addUpdateListener(new k1(this, 0));
        this.Q0.setInterpolator(xq.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        ey eyVar = this.B0;
        if (eyVar != null && (layoutParams = (FrameLayout.LayoutParams) eyVar.getLayoutParams()) != null) {
            int o02 = o0();
            u1 u1Var = this.P;
            if (u1Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((u1Var.getMeasuredHeight() - this.P.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.U0);
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
        ey eyVar = this.B0;
        if (eyVar != null && (layoutParams = (FrameLayout.LayoutParams) eyVar.getLayoutParams()) != null) {
            int i3 = layoutParams.bottomMargin;
            int i10 = this.U0;
            if (i3 != i10) {
                layoutParams.bottomMargin = i10;
                this.B0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.E0, this.U0), this.V0);
        this.Q.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        t3 t3Var = this.Q;
        int i11 = this.U0;
        int i12 = this.V0;
        int i13 = this.E0;
        t3Var.W3 = i11;
        t3Var.X3 = i12;
        t3Var.Y3 = i13;
        int i14 = -max;
        this.Z.setTranslationY(i14);
        this.S.setTranslationY(i14 + this.U0);
    }

    public final int o0() {
        int i3;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            i3 = this.G0;
        } else {
            i3 = this.F0;
        }
        if (i3 <= 0) {
            return org.telegram.messenger.g0.L(200.0f);
        }
        return i3;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        if (i10 == -1 && i3 == 21) {
            if (intent != null && intent.getData() != null) {
                t3 t3Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    t3Var.getClass();
                } else if (t3Var.getContext() != null) {
                    Utilities.f21387e.c(new m2.s(5, t3Var, data));
                }
            }
        } else if (i10 == -1 && (i3 == 1 || i3 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.Q.h2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i3, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.D0;
        if (z11) {
            if (z11) {
                this.D0 = false;
                ey eyVar = this.B0;
                if (eyVar != null) {
                    eyVar.t(false);
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
        if (!org.telegram.messenger.g0.Q1() && this.f19531s != null && this.f19536w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            kh.f fVar = this.f19531s;
            this.f19540y = fVar.f17284f;
            fVar.f17283e = false;
            fVar.invalidate();
            this.f19536w.setAlpha(0.0f);
            this.f19536w.B1.setVisibility(4);
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
            ofFloat.addUpdateListener(new k1(this, 1));
            ofFloat.addListener(new bh.j(10, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.T;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.f19507a0, property, 0.0f), ObjectAnimator.ofFloat(this.f19507a0, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.T;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.f19507a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f19507a0, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(xq.h);
            this.P.post(new xp0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.f23230f5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ii.z1 z1Var;
        hs.f(this.currentAccount).n(this, hs.f23230f5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        o1 o1Var = this.O0;
        if (o1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.h3(o1Var);
        }
        vf0 vf0Var = this.P0;
        if (vf0Var != null) {
            vf0Var.h();
            this.P0 = null;
        }
        t3 t3Var = this.Q;
        if (t3Var != null) {
            t3Var.J2();
        }
        fa.f fVar = this.A0;
        if (fVar != null) {
            fVar.c();
        }
        super.onFragmentDestroy();
        ey eyVar = this.B0;
        if (eyVar != null) {
            eyVar.B();
        }
        u1 u1Var = this.P;
        if (u1Var != null && (z1Var = this.I0) != null) {
            u1Var.f37537r.remove(z1Var);
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.U0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.U0;
        this.S.setLayoutParams(layoutParams);
        m0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        boolean z10;
        f60 f60Var;
        i0.b f10 = k1Var.f54026a.f(3);
        int i3 = k1Var.f54026a.f(8).d;
        this.V0 = i3;
        int i10 = i3 - f10.d;
        boolean z11 = this.H0;
        if (i10 > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = z10;
        if (z10 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                this.G0 = i10;
                hp.d1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                hp.d1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z11 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z11 && (f60Var = this.f19541y0) != null) {
            f60Var.u();
            this.f19541y0 = null;
        }
        onInsets(f10.f14495a, f10.f14496b, f10.f14497c, f10.d);
        return r0.k1.f54025b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i3 = k6.f27878d6;
            int themedColor = getThemedColor(i3);
            int i10 = k6.f27972i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = k6.Me;
            int themedColor3 = getThemedColor(i11);
            if (!this.f19508a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.f19508a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i3), k6.r1(0.0f, getThemedColor(i3))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, getThemedColor(i3)), getThemedColor(i3)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new b2(k6.b0(getThemedColor(i3), k6.w(getThemedColor(i3), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
                }
                ImageView imageView2 = this.f19513d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new b2(k6.b0(getThemedColor(i3), k6.w(getThemedColor(i3), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                fh0 fh0Var = this.f19539x0;
                if (fh0Var != null) {
                    fh0Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
                }
                LinearLayout linearLayout2 = this.f19526o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
                }
                LinearLayout linearLayout3 = this.f19527p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
                }
                LinearLayout linearLayout4 = this.f19525n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i3))));
                }
                x1 x1Var = this.f19542z0;
                if (x1Var != null) {
                    x1Var.setBackground(new b2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        t3 t3Var;
        int i3;
        t3 t3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i3 = this.f19511c) >= 0 && (t3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f19511c = -1;
            if (!t3Var2.c2(i3, i10)) {
                t3Var2.post(new o2(t3Var2, i3, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f19509b != null || this.f19516f != null) && (t3Var = this.Q) != null && !t3Var.d3()) {
                t3Var.post(new b(t3Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ey eyVar = this.B0;
            if (eyVar != null) {
                eyVar.t(false);
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
        ey eyVar2 = this.B0;
        if (eyVar2 != null) {
            eyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        hg hgVar = this.f19512c0;
        if (hgVar != null) {
            hgVar.j(fg.f33793e, z10);
        }
    }

    public final boolean q0() {
        wm wmVar;
        if (this.f19529r == null && (wmVar = this.K) != null && wmVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!hp.s1(this.currentAccount).s4() && !h10.i(this.currentAccount).q()) {
            t3 t3Var = this.Q;
            if (b5.d(t3Var.f19924t3, t3Var.f19926u3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s0() {
        k3 k22 = this.Q.k2();
        if (k22 != null) {
            TL_iv.RichMessage a10 = k22.a();
            if (a10.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
            e0Var.s1(a10);
            e0Var.f33236d2 = new j8(k22, 12);
            e0Var.show();
        }
    }

    public final void t0(int i3, int i10) {
        t3 t3Var = this.Q;
        t3Var.f19910k4 = t3Var.T2();
        bi biVar = new bi(getParentActivity(), this, false, false, true, getResourceProvider());
        biVar.U3 = new r1(this, biVar);
        biVar.f32215b2.setIncludeVideosInGallery(true);
        biVar.f32215b2.i0();
        biVar.y1(1, true);
        biVar.V0(i3);
        biVar.f32269r4 = new q1(this, biVar);
        biVar.Q1 = new q1(this, biVar);
        biVar.P1 = new s1(this, biVar);
        biVar.e1();
        if (i10 != 0) {
            biVar.o1(i10);
        }
        biVar.A0(true);
        biVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.K == null || this.f19529r != null || !this.Q.u2()) {
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
        mj mjVar = this.K.f51237a0;
        if (m22 != null && !this.N) {
            t3 t3Var = this.Q;
            if (t3Var.n3() && !b5.d(t3Var.f19924t3, t3Var.f19926u3) && mjVar != null) {
                SpannableStringBuilder g7 = b5.g(this.Q.f19924t3);
                wm wmVar = mjVar.Q2;
                if (mjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g7);
                i6.m(spannableStringBuilder, mjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.p5.class);
                if (p5VarArr != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        p5Var.applyFontMetrics(mjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.g5.f());
                    }
                }
                xg0.a(spannableStringBuilder);
                if (wmVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    li.b0(mjVar.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), charSequenceArr[0], li.b0(mjVar.R).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mjVar.setRichDraftPreview(null);
                if (mjVar.F0.getText() != null) {
                    mjVar.F0.getText().clear();
                }
                mjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        li mediaDataController = getMediaDataController();
        long a10 = this.K.a();
        wm wmVar2 = this.K;
        mediaDataController.Q1(a10, wmVar2.P7(wmVar2.E5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (mjVar == null) {
            return true;
        }
        mjVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new i1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.t4.L(getParentActivity(), this.K.a(), new gi.w5(this, 15), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i3, final int i10, final boolean z10) {
        mj mjVar;
        uf ufVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new i1(this, 4), getResourceProvider());
        } else if (this.K != null && this.Q.n3() && !this.Q.p3()) {
            if (!this.Q.P3()) {
                G0();
            } else if (!hp.s1(this.currentAccount).s4()) {
                mj mjVar2 = this.K.f51237a0;
                if (mjVar2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mjVar2.Q0(b5.g(this.Q.f19924t3), z10, i3, i10);
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
                final ArrayList a10 = a5.a(this.currentAccount, c32);
                final long a11 = this.K.a();
                wm wmVar = this.K;
                final zi ziVar = wmVar.E5;
                final zi ziVar2 = wmVar.f51397m4;
                final mm mmVar = wmVar.C5;
                final long h92 = wmVar.h9();
                final zv W8 = this.K.W8();
                final zi ziVar3 = this.f19529r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        c2.d0(c2.this, ziVar3, c32, E2, B2, a10, a11, ziVar, ziVar2, mmVar, z10, i3, i10, W8, h92);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (ziVar3 == null && (mjVar = this.K.f51237a0) != null && (ufVar = mjVar.f31087a3) != null) {
                    ufVar.G(null, z10, i3, i10, 0L);
                }
                if (i3 != 0 && ziVar3 == null) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            y1 y1Var = (y1) obj;
            if (((Integer) y1Var.getTag()).intValue() == 1) {
                y1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        y1 y1Var = this.f19530r0;
        if (y1Var != null) {
            y1Var.setEnabled(z10);
        }
        y1 y1Var2 = this.f19532s0;
        if (y1Var2 != null) {
            y1Var2.setEnabled(z11);
        }
        y1 y1Var3 = this.f19533t0;
        if (y1Var3 != null) {
            y1Var3.setEnabled(z10);
        }
        y1 y1Var4 = this.f19534u0;
        if (y1Var4 != null) {
            y1Var4.setEnabled(z10);
        }
    }

    public c2(String str) {
        super(null);
        this.f19511c = -1;
        this.d = -1;
        this.f19538x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f19518g0 = new ArrayList();
        this.f19523l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new i1(this, 0);
        this.f19516f = str;
    }

    public c2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f19511c = -1;
        this.d = -1;
        this.f19538x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f19518g0 = new ArrayList();
        this.f19523l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new i1(this, 0);
        this.f19509b = richMessage;
    }
}
