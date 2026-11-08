package li;

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
import bi.eb;
import c8.ha;
import c8.ka;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gz;
import org.telegram.messenger.hw;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.c61;
import org.telegram.ui.gq0;
import org.telegram.ui.qj;
import org.telegram.ui.qm;
public final class b2 extends org.telegram.ui.ActionBar.f2 implements ls {
    public hy A0;
    public boolean B0;
    public boolean C0;
    public RectF D;
    public int D0;
    public boolean E;
    public int E0;
    public final int[] F;
    public int F0;
    public int[] G;
    public boolean G0;
    public int[] H;
    public hi.z1 H0;
    public float I;
    public int I0;
    public an J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public n1 N0;
    public t1 O;
    public bg0 O0;
    public t3 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public g1 R0;
    public FrameLayout S;
    public int S0;
    public ImageView T;
    public int T0;
    public LinearLayout U;
    public int U0;
    public ImageView V;
    public boolean V0;
    public ImageView W;
    public int W0;
    public FrameLayout X;
    public int X0;
    public FrameLayout Y;
    public int Y0;
    public FrameLayout Z;
    public boolean Z0;
    public final CharSequence f18441a;
    public LinearLayout f18442a0;
    public final TL_iv.RichMessage f18443b;
    public jg f18444b0;
    public int f18445c;
    public ImageView f18446c0;
    public int d;
    public u1 f18447d0;
    public boolean f18448e;
    public LinearLayout f18449e0;
    public final String f18450f;
    public final ArrayList f18451f0;
    public ImageView f18452g0;
    public CharSequence h;
    public c61 f18453h0;
    public LinearLayout f18454i0;
    public v1 f18455j0;
    public int f18456k0;
    public final ArrayList f18457l0;
    public LinearLayout m0;
    public CharSequence f18458n;
    public LinearLayout f18459n0;
    public LinearLayout f18460o0;
    public x1 f18461p0;
    public x1 f18462q0;
    public ij f18463r;
    public x1 f18464r0;
    public jh.f f18465s;
    public x1 f18466s0;
    public x1 f18467t0;
    public x1 f18468u0;
    public FrameLayout f18469v0;
    public qj f18470w;
    public ch0 f18471w0;
    public final Rect f18472x;
    public k60 f18473x0;
    public fh.g f18474y;
    public w1 f18475y0;
    public ga.d f18476z0;

    public b2(Editable editable) {
        super(null);
        this.f18445c = -1;
        this.d = -1;
        this.f18472x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f18451f0 = new ArrayList();
        this.f18456k0 = Integer.MAX_VALUE;
        this.f18457l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new h1(this, 0);
        this.f18441a = editable;
    }

    public static void Z(b2 b2Var) {
        g3 g3Var = b2Var.P.f18901u3;
        if (g3Var != null && g3Var.x()) {
            b2Var.s0();
            return;
        }
        Activity parentActivity = b2Var.getParentActivity();
        new v(b2Var.currentAccount, parentActivity, new ii.c(b2Var, 11), b2Var.getResourceProvider()).show();
    }

    public static void a0(b2 b2Var) {
        if (!p10.i(b2Var.currentAccount).q()) {
            b2Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) b2Var, 43, true));
        }
    }

    public static boolean b0(b2 b2Var, View view) {
        int i7;
        an anVar = b2Var.J;
        if (anVar != null && b2Var.f18463r == null && !anVar.c() && b2Var.P.n3() && !b2Var.P.p3()) {
            if (!b2Var.P.P3()) {
                b2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = b2Var.P.c3();
            if (!c32.isEmpty()) {
                bg0 bg0Var = b2Var.O0;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    b2Var.O0 = null;
                }
                bg0 bg0Var2 = new bg0(b2Var.getParentActivity(), b2Var.getResourceProvider());
                b2Var.O0 = bg0Var2;
                bg0Var2.setOnDismissListener(new eb(b2Var, 8));
                long a10 = b2Var.J.a();
                ij ijVar = b2Var.J.D5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f26977id = 0;
                tL_message.out = true;
                tL_message.peer_id = qp.s1(b2Var.currentAccount).z1(a10);
                tL_message.from_id = qp.s1(b2Var.currentAccount).z1(p10.i(b2Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = b2Var.P.E2();
                tL_message.rich_message.documents = b2Var.P.B2();
                if (ijVar != null && !ijVar.f23279p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = ijVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                ij ijVar2 = new ij(b2Var.currentAccount, tL_message, false, false);
                if (ijVar != null && !ijVar.f23279p) {
                    ijVar2.C = ijVar;
                }
                ijVar2.f23319z0 = true;
                ijVar2.U2 = Boolean.TRUE;
                ijVar2.n0(null);
                ijVar2.f23301u1 = true;
                b2Var.O0.p(org.telegram.messenger.k5.k(ijVar2));
                b2Var.f18475y0.setScaleX(1.0f);
                b2Var.f18475y0.setScaleY(1.0f);
                dg q10 = b2Var.O0.q(b2Var.f18475y0, true, new i1(b2Var, 10));
                if (q10 != null) {
                    q10.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), b2Var.getThemedColor(k6.Ci))));
                    bg0 bg0Var3 = b2Var.O0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    bg0Var3.f44334l0 = true;
                    bg0Var3.X = L;
                }
                k60 H = k60.H(b2Var, b2Var.f18475y0);
                boolean B = t10.B(b2Var.J.j());
                if (b2Var.J.R6()) {
                    if (B) {
                        i7 = 2131745517;
                    } else {
                        i7 = 2131745862;
                    }
                    H.c(2131232077, id.M0(i7, null), new bi.r3(b2Var, a10, 14), false);
                    if (!B && a10 > 0) {
                        H.c(2131232264, id.M0(2131745589, null), new h1(b2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(2131231508, id.M0(2131745586, null), new h1(b2Var, 6), false);
                }
                H.Y();
                b2Var.O0.o(H);
                b2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final b2 b2Var, Context context, View view) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f10;
        float f11;
        boolean z17;
        boolean z18;
        boolean z19;
        float f12;
        float f13;
        boolean z20;
        boolean z21;
        float f14;
        k60 k60Var = b2Var.f18473x0;
        if (k60Var != null) {
            k60Var.u();
            b2Var.f18473x0 = null;
        }
        if (!qp.s1(b2Var.currentAccount).s4() && !p10.i(b2Var.currentAccount).q()) {
            z9 = true;
        } else {
            z9 = false;
        }
        final a T2 = b2Var.P.T2();
        final k60 I = k60.I(b2Var, view);
        I.Q = true;
        k60 J = I.J();
        J.c(2131231240, id.M0(2131753756, null), new h(I, 1), false);
        J.k();
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        J.j(z10, 2131231558, null, id.M0(2131754030, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0 + 2);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, 2131231559, null, id.M0(2131754029, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0 + 1);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, 2131231560, null, id.M0(2131754028, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading4)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, 2131231561, null, id.M0(2131754027, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0 - 1);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading5)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, 2131231562, null, id.M0(2131754026, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0 - 2);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockHeading6)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, 2131231563, null, id.M0(2131754025, null), new Runnable(b2Var) {
            public final b2 f18696b;

            {
                this.f18696b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f18696b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f28814a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        J.y().f28814a.setTextSize(1, iz.W0 - 3);
        if (T2 != null && t3.F3(T2.f18392b)) {
            z16 = true;
        } else {
            z16 = false;
        }
        z1 z1Var = new z1(context, 2131231557);
        z1Var.a(z9);
        int i7 = k6.G8;
        z1Var.d = i7;
        I.j(z16, 0, z1Var, id.M0(2131754031, null), new hi.h2(I, J, 2));
        I.y().f28814a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.z0 y10 = I.y();
        float f15 = 9.0f;
        if (id.f23157a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (id.f23157a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        y10.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockParagraph)) {
            z17 = true;
        } else {
            z17 = false;
        }
        I.j(z17, 2131231596, null, id.M0(2131753988, null), new l1(b2Var, T2, 3));
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockBlockquote)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, 2131231580, null, id.M0(2131753996, null), new l1(b2Var, T2, 4));
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockPullquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        z1 z1Var2 = new z1(context, 2131231579);
        z1Var2.a(z9);
        z1Var2.d = i7;
        I.j(z19, 0, z1Var2, id.M0(2131753997, null), new l1(b2Var, T2, 0));
        org.telegram.ui.ActionBar.z0 y11 = I.y();
        if (id.f23157a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (id.f23157a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        y11.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockPreformatted)) {
            z20 = true;
        } else {
            z20 = false;
        }
        I.j(z20, 2131231551, null, id.M0(2131754055, null), new l1(b2Var, T2, 1));
        if (T2 != null && (T2.f18392b instanceof TL_iv.pageBlockFooter)) {
            z21 = true;
        } else {
            z21 = false;
        }
        z1 z1Var3 = new z1(context, 2131231554);
        z1Var3.a(z9);
        z1Var3.d = i7;
        I.j(z21, 0, z1Var3, id.M0(2131754032, null), new l1(b2Var, T2, 2));
        org.telegram.ui.ActionBar.z0 y12 = I.y();
        if (id.f23157a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!id.f23157a0) {
            f15 = 18.0f;
        }
        y12.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        I.Z();
        b2Var.f18473x0 = I;
    }

    public static void d0(b2 b2Var, ij ijVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, ij ijVar2, ij ijVar3, qm qmVar, boolean z9, int i7, int i10, hw hwVar, long j10) {
        if (ijVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(b2Var.currentAccount);
            an anVar = b2Var.J;
            org.telegram.messenger.p5 p5Var = gz.I;
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
                gz.j(pageBlock2, identityHashMap);
            }
            gz.C(a10.f21765a).v(ijVar, richMessage, arrayList4, anVar, false);
            return;
        }
        gz.R(org.telegram.messenger.c.a(b2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, ijVar2, ijVar3, qmVar, z9, i7, i10, hwVar, 0L, j10, 0L);
    }

    public static void e0(b2 b2Var, boolean z9, boolean z10) {
        float f10;
        int i7;
        if (b2Var.J0 != z9 || !z10) {
            b2Var.J0 = z9;
            if (z9) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                b2Var.f18471w0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(xq.h).start();
            } else {
                b2Var.f18471w0.animate().cancel();
                b2Var.f18471w0.setScaleX(f10);
                b2Var.f18471w0.setScaleY(f10);
            }
            ch0 ch0Var = b2Var.f18471w0;
            if (z9) {
                i7 = k6.f28093q7;
            } else {
                i7 = k6.G6;
            }
            r6.t(ch0Var, i7, b2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            zg0 animatedDrawable = b2Var.f18471w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z9) {
                    if (animatedDrawable.f40989a0 > 34) {
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

    public static g1 f0(b2 b2Var) {
        g1 focusedEditTextOrNull = b2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            b2Var.R0 = focusedEditTextOrNull;
            b2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        g1 g1Var = b2Var.R0;
        if (g1Var != null) {
            return g1Var;
        }
        return b2Var.P.S2();
    }

    public static int g0(b2 b2Var, g1 g1Var) {
        if (g1Var == b2Var.R0 && b2Var.P.getFocusedEditTextOrNull() != g1Var) {
            return Math.min(b2Var.S0, g1Var.length());
        }
        return Math.max(0, g1Var.getSelectionEnd());
    }

    public static String l0(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 7) {
                        if (i7 != 9) {
                            return null;
                        }
                        return id.M0(2131754869, null);
                    }
                    return id.M0(2131754864, null);
                }
                return id.M0(2131754855, null);
            }
            return id.M0(2131754860, null);
        }
        return id.M0(2131754854, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return id.M0(2131753671, null);
        }
        if (i7 == 2) {
            return id.M0(2131749088, null);
        }
        if (i7 == 16) {
            return id.M0(2131743892, null);
        }
        if (i7 == 8) {
            return id.M0(2131744440, null);
        }
        if (i7 == 256) {
            return id.M0(2131745265, null);
        }
        if (i7 == 4) {
            return id.M0(2131748351, null);
        }
        if (i7 == 65536) {
            return id.M0(2131749304, null);
        }
        if (i7 == 16384) {
            return id.M0(2131744428, null);
        }
        if (i7 != 32768) {
            return null;
        }
        return id.M0(2131744330, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, f6 f6Var) {
        final org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.N = f10;
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231602);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = k6.Ci;
        ShapeDrawable L2 = k6.L(L, k6.w0(i7, f6Var));
        n6 N = r6.N(i7);
        e10.setBackground(L2);
        r6.k(e10, L2, N, null, f6Var);
        f10.addView(e10, ha.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = k6.G6;
        r6.V(textView, i10, f6Var);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, ha.t(-1, -2, 49, 25, 16, 25, 0), context);
        f11.setText(org.telegram.messenger.g0.X2(id.M0(2131754042, null)));
        f11.setTextSize(1, 14.0f);
        f11.setGravity(17);
        r6.V(f11, i10, f6Var);
        f10.addView(f11, ha.t(-1, -2, 49, 25, 11, 25, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(id.M0(2131754043, null));
        f10.addView(h, ha.t(-1, 48, 49, 14, 31, 14, 0));
        fi.d h7 = org.telegram.messenger.k5.h(24, context, f6Var, false);
        h7.setText(id.M0(2131754044, null));
        f10.addView(h7, ha.t(-1, 48, 49, 14, 2, 14, 6));
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
        jh.f fVar = this.f18465s;
        int[] iArr = this.F;
        fVar.getLocationInWindow(iArr);
        if (this.D == null) {
            this.D = new RectF();
        }
        RectF rectF = new RectF(this.f18474y.getBounds());
        this.D = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.G == null) {
            this.G = new int[2];
        }
        this.f18470w.getLocationInWindow(this.G);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.H[0] = this.P.getPaddingLeft();
        this.H[1] = this.P.getPaddingTop();
        int[] iArr2 = this.H;
        iArr2[0] = (int) (iArr2[0] - (this.f18470w.E0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: li.b2.B0():void");
    }

    public final void C0(int i7, boolean z9) {
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
        if (this.K0 == i7) {
            return;
        }
        this.K0 = i7;
        int i12 = 0;
        float f24 = 0.0f;
        float f25 = 0.8f;
        if (z9) {
            this.f18442a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f18442a0.animate();
            if (this.K0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f17);
            if (this.K0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f18);
            if (this.K0 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f19);
            if (this.K0 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).withEndAction(new h1(this, 1)).start();
            this.f18453h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f18453h0.animate();
            if (this.K0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f20);
            if (this.K0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f21);
            if (this.K0 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f22);
            if (this.K0 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(xqVar).withEndAction(new h1(this, 2)).start();
            this.f18469v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f18469v0.animate();
            if (this.K0 == 2) {
                f24 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f24);
            if (this.K0 == 2) {
                f23 = 1.0f;
            } else {
                f23 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f23);
            if (this.K0 == 2) {
                f25 = 1.0f;
            }
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(xqVar).withEndAction(new h1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f18442a0;
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f18442a0;
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f18442a0;
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f18442a0;
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f18442a0;
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        c61 c61Var = this.f18453h0;
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c61Var.setVisibility(i11);
        c61 c61Var2 = this.f18453h0;
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        c61Var2.setAlpha(f13);
        c61 c61Var3 = this.f18453h0;
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        c61Var3.setScaleX(f14);
        c61 c61Var4 = this.f18453h0;
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        c61Var4.setScaleY(f15);
        c61 c61Var5 = this.f18453h0;
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        c61Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f18469v0;
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f18469v0;
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f18469v0;
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f18469v0;
        if (i7 == 2) {
            f25 = 1.0f;
        }
        frameLayout4.setScaleY(f25);
    }

    public final void D0() {
        boolean z9;
        boolean z10;
        boolean g10;
        boolean z11;
        boolean h;
        boolean z12;
        int max;
        int max2;
        boolean z13;
        boolean z14;
        boolean z15;
        g1 g1Var;
        int max3;
        boolean z16;
        boolean z17;
        i9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.f18457l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            x1 x1Var = this.f18468u0;
            boolean z18 = false;
            if (x1Var != null) {
                t3 t3Var = this.P;
                int[] E4 = t3Var.E4();
                if (E4 != null && t3Var.K3(E4[0], E4[1])) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                x1Var.setSelected(z17);
            }
            if (this.P.O3()) {
                i9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i7 = textSelectionHelper2.f29317p0;
                int i10 = textSelectionHelper2.f29318q0;
                int i11 = textSelectionHelper2.f29321t0;
                int i12 = textSelectionHelper2.f29319r0;
                int i13 = textSelectionHelper2.f29322u0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    x1 x1Var2 = (x1) obj;
                    x1Var2.setSelected(this.P.N3(((Integer) x1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
                }
                if (i10 == i11) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    g1Var = this.P.Q4(i7, i10);
                } else {
                    g1Var = null;
                }
                int max4 = Math.max(0, Math.min(i12, i13));
                if (g1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i12, i13), g1Var.length()));
                }
                x1 x1Var3 = this.f18462q0;
                if (x1Var3 != null) {
                    if (g1Var != null && max4 < max3 && c6.h(g1Var.getText(), max4, max3)) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    x1Var3.setSelected(z16);
                }
                x1 x1Var4 = this.f18466s0;
                if (x1Var4 != null) {
                    if (g1Var != null && max4 < max3 && c6.g(g1Var.getText(), max4, max3)) {
                        z18 = true;
                    }
                    x1Var4.setSelected(z18);
                }
                y0(true);
                z0(z15, this.P.o2());
            } else if (this.P.z3()) {
                i9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                g1 v22 = this.P.v2(textSelectionHelper3.f29317p0);
                int i15 = textSelectionHelper3.f29319r0;
                int i16 = textSelectionHelper3.f29322u0;
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
                    x1 x1Var5 = (x1) obj2;
                    int intValue = ((Integer) x1Var5.getTag()).intValue();
                    if (v22 != null && max < max2 && (intValue & v22.c(max, max2)) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    x1Var5.setSelected(z14);
                }
                x1 x1Var6 = this.f18462q0;
                if (x1Var6 != null) {
                    if (v22 != null && max < max2 && c6.h(v22.getText(), max, max2)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    x1Var6.setSelected(z13);
                }
                x1 x1Var7 = this.f18466s0;
                if (x1Var7 != null) {
                    if (v22 != null && max < max2 && c6.g(v22.getText(), max, max2)) {
                        z18 = true;
                    }
                    x1Var7.setSelected(z18);
                }
                y0(true);
                z0(true, this.P.o2());
            } else {
                int i18 = textSelectionHelper.f29317p0;
                int i19 = textSelectionHelper.f29320s0;
                int i20 = textSelectionHelper.f29319r0;
                int i21 = textSelectionHelper.f29322u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.P.f18906w4.size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    x1 x1Var8 = (x1) arrayList.get(i22);
                    int intValue2 = ((Integer) x1Var8.getTag()).intValue();
                    if (z9 && this.P.M3(intValue2, i18, i20, i19, i21)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    x1Var8.setSelected(z12);
                    i22 = i23;
                }
                y0(!this.P.L3());
                x1 x1Var9 = this.f18462q0;
                if (x1Var9 != null) {
                    if (z9) {
                        Editable K4 = this.P.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = c6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z11 = true;
                            x1Var9.setSelected(z11);
                        }
                    }
                    z11 = false;
                    x1Var9.setSelected(z11);
                }
                x1 x1Var10 = this.f18466s0;
                if (x1Var10 != null) {
                    if (z9) {
                        Editable K42 = this.P.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = c6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g10) {
                            z10 = true;
                            x1Var10.setSelected(z10);
                        }
                    }
                    z10 = false;
                    x1Var10.setSelected(z10);
                }
                if (z9 && i18 == i19) {
                    z18 = true;
                }
                z0(z18, this.P.o2());
            }
        }
    }

    public final void E0() {
        boolean z9;
        float f10;
        boolean u22 = this.P.u2();
        f2 f2Var = this.P.Q3;
        if (f2Var != null && !f2Var.f18560c.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ImageView imageView = this.V;
        float f11 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(u22);
            ImageView imageView2 = this.V;
            if (u22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
        }
        ImageView imageView3 = this.W;
        if (imageView3 != null) {
            imageView3.setEnabled(z9);
            ImageView imageView4 = this.W;
            if (z9) {
                f11 = 1.0f;
            }
            imageView4.setAlpha(f11);
        }
    }

    public final void F0() {
        boolean z9;
        int i7 = 0;
        if (!qp.s1(this.currentAccount).s4() && !p10.i(this.currentAccount).q()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z9);
        }
    }

    public final void G0() {
        float f10;
        if (this.f18475y0 == null) {
            return;
        }
        boolean P3 = this.P.P3();
        this.f18475y0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f18475y0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 150L);
    }

    public final void H0() {
        w1 w1Var = this.f18475y0;
        if (w1Var == null) {
            return;
        }
        w1Var.setLocked(r0());
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new t1(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.F0 = qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        hi.z1 z1Var = new hi.z1(this, 1);
        this.H0 = z1Var;
        this.O.f37770r.add(z1Var);
        t3 t3Var = new t3(context, this.currentAccount, getResourceProvider(), new g6.d0(this, 13));
        this.P = t3Var;
        t3Var.setFileRefParentObject(this.f18463r);
        this.O.addView(this.P, ha.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), ha.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f18443b;
        if (richMessage != null) {
            t3 t3Var2 = this.P;
            ArrayList arrayList2 = t3Var2.f18897s3;
            t3Var2.f18895r3 = richMessage;
            t3.Z2(arrayList2, richMessage.blocks, t3Var2.f18899t3);
            t3Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                t3Var2.y4((a) arrayList2.get(i12));
            }
            t3Var2.f37190f3.O(false);
        } else {
            String str = this.f18450f;
            if (str != null) {
                t3 t3Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f18458n;
                HashMap hashMap = t3Var3.f18899t3;
                ArrayList arrayList3 = t3Var3.f18897s3;
                if (!TextUtils.isEmpty(charSequence)) {
                    t3.Z2(arrayList3, a5.b(charSequence), hashMap);
                }
                arrayList3.addAll(t3Var3.z4(b4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    t3.Z2(arrayList3, a5.b(charSequence2), hashMap);
                }
                t3Var3.Y3();
                t3Var3.f37190f3.O(false);
            } else {
                CharSequence charSequence3 = this.f18441a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        f2 f2Var = this.P.Q3;
        if (f2Var != null) {
            f2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = k6.f27852d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), k6.r1(0.0f, getThemedColor(i13))}));
        this.O.addView(this.Q, ha.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{k6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.O.addView(this.R, ha.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, ha.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(2131231240);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = k6.f27944i6;
        imageView3.setBackground(new a2(k6.b0(themedColor, k6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.T;
        int i15 = k6.G6;
        f6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView4, i15, resourceProvider, mode);
        ka.a(this.T);
        this.T.setContentDescription(id.M0(2131754878, null));
        this.T.setOnClickListener(new i1(this, 1));
        this.S.addView(this.T, ha.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.S.addView(this.U, ha.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(2131231598);
        this.V.setScaleType(scaleType);
        r6.R(this.V, k6.h0(getThemedColor(i14), 1, -1), null, r6.N(i14), getResourceProvider());
        r6.t(this.V, i15, getResourceProvider(), mode);
        ka.a(this.V);
        this.V.setContentDescription(id.M0(2131743890, null));
        this.V.setOnClickListener(new i1(this, 2));
        this.U.addView(this.V, ha.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(2131231581);
        this.W.setScaleType(scaleType);
        r6.R(this.W, k6.h0(getThemedColor(i14), 1, -1), null, r6.N(i14), getResourceProvider());
        r6.t(this.W, i15, getResourceProvider(), mode);
        ka.a(this.W);
        this.W.setContentDescription(id.M0(2131746343, null));
        this.W.setOnClickListener(new i1(this, 3));
        this.U.addView(this.W, ha.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, ha.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, ha.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f18442a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f18442a0.setClipChildren(false);
        this.f18442a0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f18442a0, ha.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f18446c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        this.f18446c0.setScaleType(scaleType);
        r6.t(this.f18446c0, i15, getResourceProvider(), mode);
        this.f18446c0.setBackground(new a2(k6.b0(getThemedColor(i13), k6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f18442a0.addView(this.f18446c0, ha.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ka.a(this.f18446c0);
        this.f18446c0.setContentDescription(id.M0(2131755006, null));
        this.f18446c0.setOnClickListener(new i1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, ha.e(-2, 44, 81));
        u1 u1Var = new u1(context, 0);
        this.f18447d0 = u1Var;
        u1Var.setClipToOutline(true);
        this.f18447d0.setOutlineProvider(new bg.q0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f18449e0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f18449e0.setOrientation(0);
        this.f18447d0.addView(this.f18449e0);
        frameLayout6.addView(this.f18447d0, ha.c(-1.0f, -1));
        jg jgVar = new jg(context, 24);
        this.f18444b0 = jgVar;
        jgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        r6.t(this.f18444b0, i15, getResourceProvider(), mode);
        r6.R(this.f18444b0, k6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i13), r6.N(i14), getResourceProvider());
        this.f18444b0.j(hg.f34251e, false);
        this.f18449e0.addView(this.f18444b0, ha.r(38, 38, 16));
        ka.a(this.f18444b0);
        this.f18444b0.setContentDescription(id.M0(2131754884, null));
        this.f18444b0.setOnClickListener(new i1(this, 5));
        h0(2131231595, 1, false).setOnClickListener(new bi.r(22, this, context));
        h0(2131231567, 2, true).setOnClickListener(new i1(this, 6));
        h0(2131231584, 4, true).setOnClickListener(new i1(this, 7));
        h0(2131231569, 7, true).setOnClickListener(new i1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f18452g0 = imageView8;
        imageView8.setImageResource(2131232489);
        this.f18452g0.setScaleType(scaleType);
        r6.t(this.f18452g0, i15, getResourceProvider(), mode);
        r6.R(this.f18452g0, k6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), r6.N(i13), r6.N(i14), getResourceProvider());
        this.f18449e0.addView(this.f18452g0, ha.t(38, 38, 16, 2, 0, 0, 0));
        ka.a(this.f18452g0);
        this.f18452g0.setContentDescription(id.M0(2131754921, null));
        this.f18452g0.setOnClickListener(new i1(this, 9));
        this.f18442a0.addView(frameLayout5, ha.l(1.0f, 0, 44));
        c61 c61Var = new c61(6, context, this);
        this.f18453h0 = c61Var;
        c61Var.setOrientation(0);
        this.f18453h0.setClipToPadding(false);
        this.f18453h0.setClipChildren(false);
        this.f18453h0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Y.addView(this.f18453h0, ha.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f18469v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f18469v0.setClipToPadding(false);
        this.f18469v0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Y.addView(this.f18469v0, ha.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f18471w0 = imageView9;
        imageView9.f(2131624042, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        zg0 animatedDrawable = this.f18471w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f18471w0.setScaleType(scaleType);
        r6.t(this.f18471w0, i15, getResourceProvider(), mode);
        this.f18471w0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f18469v0.addView(this.f18471w0, ha.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f18453h0.addView(frameLayout8, ha.c(44.0f, -2));
        v1 v1Var = new v1(this, context);
        this.f18455j0 = v1Var;
        v1Var.setHorizontalScrollBarEnabled(false);
        this.f18455j0.setClipToOutline(true);
        this.f18455j0.setOutlineProvider(new bg.q0(5));
        frameLayout8.addView(this.f18455j0, ha.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f18454i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f18454i0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f18455j0.addView(this.f18454i0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231551, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231582, 16384, true);
        i0(context, 2131231583, 32768, true);
        x1 x1Var = new x1(2131231580, context, getResourceProvider());
        this.f18468u0 = x1Var;
        x1Var.setContentDescription(id.M0(2131746441, null));
        this.f18468u0.setOnClickListener(new i1(this, 11));
        LinearLayout linearLayout5 = this.f18454i0;
        x1 x1Var2 = this.f18468u0;
        if (linearLayout5.getChildCount() > 0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        linearLayout5.addView(x1Var2, ha.t(38, 38, 16, i7, 0, 0, 0));
        x1 x1Var3 = new x1(2131231548, context, getResourceProvider());
        this.f18464r0 = x1Var3;
        x1Var3.setContentDescription(id.M0(2131746014, null));
        this.f18464r0.setOnClickListener(new i1(this, 12));
        LinearLayout linearLayout6 = this.f18454i0;
        x1 x1Var4 = this.f18464r0;
        if (linearLayout6.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout6.addView(x1Var4, ha.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f18459n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f18459n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f18459n0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f18453h0.addView(this.f18459n0, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(2131231745, context, getResourceProvider());
        this.f18462q0 = x1Var5;
        x1Var5.setContentDescription(id.M0(2131751745, null));
        this.f18462q0.setOnClickListener(new i1(this, 13));
        this.f18459n0.addView(this.f18462q0, ha.r(38, 38, 16));
        x1 x1Var6 = new x1(2131232077, context, getResourceProvider());
        this.f18466s0 = x1Var6;
        x1Var6.setContentDescription(id.M0(2131754862, null));
        this.f18466s0.setOnClickListener(new i1(this, 14));
        this.f18459n0.addView(this.f18466s0, ha.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f18460o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f18460o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f18460o0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f18453h0.addView(this.f18460o0, ha.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var7 = new x1(2131231569, context, getResourceProvider());
        this.f18467t0 = x1Var7;
        x1Var7.d();
        arrayList.add(this.f18467t0);
        this.f18467t0.setContentDescription(id.M0(2131754864, null));
        this.f18467t0.setOnClickListener(new i1(this, 15));
        this.f18460o0.addView(this.f18467t0, ha.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.m0.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f18453h0.addView(this.m0, 0, ha.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var8 = new x1(0, context, getResourceProvider());
        this.f18461p0 = x1Var8;
        x1Var8.setImageDrawable(new org.telegram.ui.ActionBar.u2(context));
        this.f18461p0.setContentDescription(id.M0(2131755006, null));
        this.f18461p0.setOnClickListener(new i1(this, 16));
        this.m0.addView(this.f18461p0, ha.r(38, 38, 16));
        if (this.f18463r != null) {
            i11 = 2131231501;
        } else if (q0()) {
            i11 = 2131231511;
        } else {
            i11 = 2131232694;
        }
        w1 w1Var = new w1(this, context, i11, getResourceProvider());
        this.f18475y0 = w1Var;
        w1Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(k6.Me))));
        ka.a(this.f18475y0);
        this.f18442a0.addView(this.f18475y0, ha.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f18475y0.setContentDescription(id.M0(2131745643, null));
        this.f18475y0.setOnClickListener(new i1(this, 0));
        this.f18475y0.setOnLongClickListener(new fi.s4(this, 3));
        H0();
        this.O.setPadding(0, org.telegram.messenger.g0.f22557m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        F0();
        if (this.f18448e) {
            this.P.F2();
            this.f18448e = false;
        }
        t1 t1Var = this.O;
        this.fragmentView = t1Var;
        return t1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25001f5) {
            H0();
            F0();
        }
    }

    public final x1 h0(int i7, int i10, boolean z9) {
        int i11;
        x1 x1Var = new x1(i7, this.f18449e0.getContext(), getResourceProvider());
        if (z9) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(l0(i10));
        this.f18451f0.add(x1Var);
        LinearLayout linearLayout = this.f18449e0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, ha.t(38, 38, 16, i11, 0, 0, 0));
        return x1Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z9) {
        int i11;
        x1 x1Var = new x1(i7, context, getResourceProvider());
        if (z9) {
            x1Var.d();
            this.N.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(n0(i10));
        x1Var.setOnClickListener(new ai.v(this, i10, 7));
        this.f18457l0.add(x1Var);
        LinearLayout linearLayout = this.f18454i0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(x1Var, ha.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t3 t3Var = this.P;
        if (t3Var != null && t3Var.f18901u3.x()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f10);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 0));
        this.P0.setInterpolator(xq.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        hy hyVar = this.A0;
        if (hyVar != null && (layoutParams = (FrameLayout.LayoutParams) hyVar.getLayoutParams()) != null) {
            int o02 = o0();
            t1 t1Var = this.O;
            if (t1Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((t1Var.getMeasuredHeight() - this.O.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.T0);
            }
            int round = Math.round(((max - o02) * this.Q0) + o02);
            if (layoutParams.height != round) {
                layoutParams.height = round;
                this.A0.setLayoutParams(layoutParams);
            }
        }
    }

    public final void m0() {
        FrameLayout.LayoutParams layoutParams;
        hy hyVar = this.A0;
        if (hyVar != null && (layoutParams = (FrameLayout.LayoutParams) hyVar.getLayoutParams()) != null) {
            int i7 = layoutParams.bottomMargin;
            int i10 = this.T0;
            if (i7 != i10) {
                layoutParams.bottomMargin = i10;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, org.telegram.messenger.g0.L(60.0f), 0, org.telegram.messenger.g0.L(110.0f) + max);
        t3 t3Var = this.P;
        int i11 = this.T0;
        int i12 = this.U0;
        int i13 = this.D0;
        t3Var.V3 = i11;
        t3Var.W3 = i12;
        t3Var.X3 = i13;
        int i14 = -max;
        this.Y.setTranslationY(i14);
        this.R.setTranslationY(i14 + this.T0);
    }

    public final int o0() {
        int i7;
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            i7 = this.F0;
        } else {
            i7 = this.E0;
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
                t3 t3Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    t3Var.getClass();
                } else if (t3Var.getContext() != null) {
                    Utilities.f21336e.c(new ha.b(27, t3Var, data));
                }
            }
        } else if (i10 == -1 && (i7 == 1 || i7 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.P.h2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        boolean z10 = this.C0;
        if (z10) {
            if (z10) {
                this.C0 = false;
                hy hyVar = this.A0;
                if (hyVar != null) {
                    hyVar.t(false);
                    this.A0.A();
                }
                j0(false);
                return false;
            }
        } else if (this.B0) {
            p0(true);
            return false;
        } else if (!this.P.I2()) {
            return super.onBackPressed(z9);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        float f10;
        if (!z9 && !this.V0) {
            v0();
            this.V0 = true;
        }
        if (!org.telegram.messenger.g0.Q1() && this.f18465s != null && this.f18470w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            jh.f fVar = this.f18465s;
            this.f18474y = fVar.f17042f;
            fVar.f17041e = false;
            fVar.invalidate();
            this.f18470w.setAlpha(0.0f);
            this.f18470w.A1.setVisibility(4);
            A0();
            float f11 = 1.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            this.I = f10;
            if (!z9) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.E = true;
            this.O.invalidate();
            ofFloat.addUpdateListener(new j1(this, 1));
            ofFloat.addListener(new ah.l(10, this, runnable));
            if (!z9) {
                FrameLayout frameLayout = this.S;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.S;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.Z, property, 0.0f), ObjectAnimator.ofFloat(this.Z, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.S;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.S;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(xq.h);
            this.O.post(new gq0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z9, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.f25001f5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        hi.z1 z1Var;
        qs.f(this.currentAccount).n(this, qs.f25001f5);
        if (!this.V0) {
            v0();
            this.V0 = true;
        }
        n1 n1Var = this.N0;
        if (n1Var != null) {
            this.N0 = null;
            org.telegram.messenger.g0.h3(n1Var);
        }
        bg0 bg0Var = this.O0;
        if (bg0Var != null) {
            bg0Var.h();
            this.O0 = null;
        }
        t3 t3Var = this.P;
        if (t3Var != null) {
            t3Var.J2();
        }
        ga.d dVar = this.f18476z0;
        if (dVar != null) {
            dVar.c();
        }
        super.onFragmentDestroy();
        hy hyVar = this.A0;
        if (hyVar != null) {
            hyVar.B();
        }
        t1 t1Var = this.O;
        if (t1Var != null && (z1Var = this.H0) != null) {
            t1Var.f37770r.remove(z1Var);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.T0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        m0();
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        boolean z9;
        k60 k60Var;
        i0.b f10 = k1Var.f54202a.f(3);
        int i7 = k1Var.f54202a.f(8).d;
        this.U0 = i7;
        int i10 = i7 - f10.d;
        boolean z10 = this.G0;
        if (i10 > org.telegram.messenger.g0.L(20.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.G0 = z9;
        if (z9 && i10 > org.telegram.messenger.g0.L(50.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                this.F0 = i10;
                qp.d1().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i10;
                qp.d1().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z10 && this.B0 && !this.C0) {
            p0(false);
        }
        if (!this.G0 && z10 && (k60Var = this.f18473x0) != null) {
            k60Var.u();
            this.f18473x0 = null;
        }
        onInsets(f10.f15120a, f10.f15121b, f10.f15122c, f10.d);
        return r0.k1.f54201b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = k6.f27852d6;
            int themedColor = getThemedColor(i7);
            int i10 = k6.f27944i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = k6.Me;
            int themedColor3 = getThemedColor(i11);
            if (!this.Z0 || themedColor != this.W0 || themedColor2 != this.X0 || themedColor3 != this.Y0) {
                this.Z0 = true;
                this.W0 = themedColor;
                this.X0 = themedColor2;
                this.Y0 = themedColor3;
                View view = this.Q;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), k6.r1(0.0f, getThemedColor(i7))}));
                }
                View view2 = this.R;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
                }
                ImageView imageView = this.T;
                if (imageView != null) {
                    imageView.setBackground(new a2(k6.b0(getThemedColor(i7), k6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.U;
                if (linearLayout != null) {
                    linearLayout.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                ImageView imageView2 = this.f18446c0;
                if (imageView2 != null) {
                    imageView2.setBackground(new a2(k6.b0(getThemedColor(i7), k6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                ch0 ch0Var = this.f18471w0;
                if (ch0Var != null) {
                    ch0Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout2 = this.f18459n0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout3 = this.f18460o0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout4 = this.m0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                w1 w1Var = this.f18475y0;
                if (w1Var != null) {
                    w1Var.setBackground(new a2(k6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        t3 t3Var;
        int i7;
        t3 t3Var2;
        super.onTransitionAnimationStart(z9, z10);
        if (z9 && !z10 && (i7 = this.f18445c) >= 0 && (t3Var2 = this.P) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f18445c = -1;
            if (!t3Var2.c2(i7, i10)) {
                t3Var2.post(new n2(t3Var2, i7, i10, 0));
            }
        } else if (z9 && !z10) {
            if ((this.f18443b != null || this.f18450f != null) && (t3Var = this.P) != null && !t3Var.d3()) {
                t3Var.post(new b(t3Var, 5));
            }
        }
    }

    public final void p0(boolean z9) {
        if (this.C0) {
            this.C0 = false;
            hy hyVar = this.A0;
            if (hyVar != null) {
                hyVar.t(false);
                this.A0.A();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        hy hyVar2 = this.A0;
        if (hyVar2 != null) {
            hyVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            m0();
        }
        jg jgVar = this.f18444b0;
        if (jgVar != null) {
            jgVar.j(hg.f34251e, z9);
        }
    }

    public final boolean q0() {
        an anVar;
        if (this.f18463r == null && (anVar = this.J) != null && anVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!qp.s1(this.currentAccount).s4() && !p10.i(this.currentAccount).q()) {
            t3 t3Var = this.P;
            if (a5.d(t3Var.f18897s3, t3Var.f18899t3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s0() {
        k3 k22 = this.P.k2();
        if (k22 != null) {
            TL_iv.RichMessage a10 = k22.a();
            if (a10.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
            g0Var.s1(a10);
            g0Var.f33739c2 = new ii.c(k22, 9);
            g0Var.show();
        }
    }

    public final void t0(int i7, int i10) {
        t3 t3Var = this.P;
        t3Var.f18883j4 = t3Var.T2();
        di diVar = new di(getParentActivity(), this, false, false, true, getResourceProvider());
        diVar.T3 = new q1(this, diVar);
        diVar.f32932a2.setIncludeVideosInGallery(true);
        diVar.f32932a2.i0();
        diVar.y1(1, true);
        diVar.V0(i7);
        diVar.f32986q4 = new p1(this, diVar);
        diVar.P1 = new p1(this, diVar);
        diVar.O1 = new r1(this, diVar);
        diVar.e1();
        if (i10 != 0) {
            diVar.o1(i10);
        }
        diVar.A0(true);
        diVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.J == null || this.f18463r != null || !this.P.u2()) {
            return false;
        }
        if (this.M) {
            m22 = null;
        } else {
            m22 = this.P.m2();
        }
        if (m22 == null && (runnable = this.L) != null) {
            runnable.run();
        }
        qj qjVar = this.J.Z;
        if (m22 != null && !this.M) {
            t3 t3Var = this.P;
            if (t3Var.n3() && !a5.d(t3Var.f18897s3, t3Var.f18899t3) && qjVar != null) {
                SpannableStringBuilder g10 = a5.g(this.P.f18897s3);
                an anVar = qjVar.P2;
                if (qjVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                i6.m(spannableStringBuilder, qjVar.E0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.r5[] r5VarArr = (org.telegram.ui.Components.r5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.r5.class);
                if (r5VarArr != null) {
                    for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                        r5Var.applyFontMetrics(qjVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.i5.f());
                    }
                }
                ug0.a(spannableStringBuilder);
                if (anVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ui.b0(qjVar.Q).Q1(anVar.a(), anVar.P7(anVar.D5), charSequenceArr[0], ui.b0(qjVar.Q).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                qjVar.setRichDraftPreview(null);
                if (qjVar.E0.getText() != null) {
                    qjVar.E0.getText().clear();
                }
                qjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ui mediaDataController = getMediaDataController();
        long a10 = this.J.a();
        an anVar2 = this.J;
        mediaDataController.Q1(a10, anVar2.P7(anVar2.D5), "", null, null, null, null, 0L, false, false, m22);
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
            t3 t3Var = this.P;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new h1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.v4.J(getParentActivity(), this.J.a(), new gf.g(this, 12), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i7, final int i10, final boolean z9) {
        qj qjVar;
        wf wfVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.P;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new h1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.n3() && !this.P.p3()) {
            if (!this.P.P3()) {
                G0();
            } else if (!qp.s1(this.currentAccount).s4()) {
                qj qjVar2 = this.J.Z;
                if (qjVar2 != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    qjVar2.R0(a5.g(this.P.f18897s3), z9, i7, i10);
                    finishFragment();
                }
            } else {
                this.M = true;
                final ArrayList c32 = this.P.c3();
                if (c32.isEmpty()) {
                    return;
                }
                final ArrayList E2 = this.P.E2();
                final ArrayList B2 = this.P.B2();
                final ArrayList a10 = z4.a(this.currentAccount, c32);
                final long a11 = this.J.a();
                an anVar = this.J;
                final ij ijVar = anVar.D5;
                final ij ijVar2 = anVar.f43870l4;
                final qm qmVar = anVar.B5;
                final long h92 = anVar.h9();
                final hw W8 = this.J.W8();
                final ij ijVar3 = this.f18463r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        b2.d0(b2.this, ijVar3, c32, E2, B2, a10, a11, ijVar, ijVar2, qmVar, z9, i7, i10, W8, h92);
                    }
                };
                Runnable runnable2 = this.K;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (ijVar3 == null && (qjVar = this.J.Z) != null && (wfVar = qjVar.Z2) != null) {
                    wfVar.F(null, z9, i7, i10, 0L);
                }
                if (i7 != 0 && ijVar3 == null) {
                    this.N0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void y0(boolean z9) {
        ArrayList arrayList = this.f18457l0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x1 x1Var = (x1) obj;
            if (((Integer) x1Var.getTag()).intValue() == 1) {
                x1Var.setEnabled(z9);
            }
        }
    }

    public final void z0(boolean z9, boolean z10) {
        x1 x1Var = this.f18462q0;
        if (x1Var != null) {
            x1Var.setEnabled(z9);
        }
        x1 x1Var2 = this.f18464r0;
        if (x1Var2 != null) {
            x1Var2.setEnabled(z10);
        }
        x1 x1Var3 = this.f18466s0;
        if (x1Var3 != null) {
            x1Var3.setEnabled(z9);
        }
        x1 x1Var4 = this.f18467t0;
        if (x1Var4 != null) {
            x1Var4.setEnabled(z9);
        }
    }

    public b2(String str) {
        super(null);
        this.f18445c = -1;
        this.d = -1;
        this.f18472x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f18451f0 = new ArrayList();
        this.f18456k0 = Integer.MAX_VALUE;
        this.f18457l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new h1(this, 0);
        this.f18450f = str;
    }

    public b2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f18445c = -1;
        this.d = -1;
        this.f18472x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f18451f0 = new ArrayList();
        this.f18456k0 = Integer.MAX_VALUE;
        this.f18457l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new h1(this, 0);
        this.f18443b = richMessage;
    }
}
