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
import bi.h6;
import c8.na;
import c8.sa;
import di.u9;
import hi.c7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bw;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.zg;
import org.telegram.ui.b61;
import org.telegram.ui.bn;
import org.telegram.ui.dg0;
import org.telegram.ui.hq0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class b2 extends org.telegram.ui.ActionBar.g2 implements fs {
    public m.o3 A0;
    public qy B0;
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
    public ki.u1 I0;
    public float J;
    public int J0;
    public bn K;
    public boolean K0;
    public Runnable L;
    public int L0;
    public Runnable M;
    public boolean M0;
    public boolean N;
    public final Runnable N0;
    public final ArrayList O;
    public n1 O0;
    public t1 P;
    public dg0 P0;
    public t3 Q;
    public ValueAnimator Q0;
    public View R;
    public float R0;
    public View S;
    public f1 S0;
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
    public final CharSequence f22053a;
    public FrameLayout f22054a0;
    public boolean f22055a1;
    public final TL_iv.RichMessage f22056b;
    public LinearLayout f22057b0;
    public int f22058c;
    public zg f22059c0;
    public int d;
    public ImageView f22060d0;
    public boolean f22061e;
    public u1 f22062e0;
    public final String f22063f;
    public LinearLayout f22064f0;
    public final ArrayList f22065g0;
    public CharSequence h;
    public ImageView f22066h0;
    public b61 f22067i0;
    public LinearLayout f22068j0;
    public v1 f22069k0;
    public int f22070l0;
    public final ArrayList m0;
    public CharSequence f22071n;
    public LinearLayout f22072n0;
    public LinearLayout f22073o0;
    public LinearLayout f22074p0;
    public x1 f22075q0;
    public fj f22076r;
    public x1 f22077r0;
    public jh.f f22078s;
    public x1 f22079s0;
    public x1 f22080t0;
    public x1 f22081u0;
    public x1 f22082v0;
    public rj f22083w;
    public FrameLayout f22084w0;
    public final Rect f22085x;
    public qh0 f22086x0;
    public fh.g f22087y;
    public x60 f22088y0;
    public w1 f22089z0;

    public b2(Editable editable) {
        super(null);
        this.f22058c = -1;
        this.d = -1;
        this.f22085x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22065g0 = new ArrayList();
        this.f22070l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new g1(this, 0);
        this.f22053a = editable;
    }

    public static void Z(b2 b2Var) {
        h3 h3Var = b2Var.Q.f22507v3;
        if (h3Var != null && h3Var.x()) {
            b2Var.s0();
            return;
        }
        Activity parentActivity = b2Var.getParentActivity();
        new v(b2Var.currentAccount, parentActivity, new c7(b2Var, 17), b2Var.getResourceProvider()).show();
    }

    public static void a0(b2 b2Var) {
        if (!i10.i(b2Var.currentAccount).q()) {
            b2Var.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) b2Var, 43, true));
        }
    }

    public static boolean b0(b2 b2Var, View view) {
        int i7;
        bn bnVar = b2Var.K;
        if (bnVar != null && b2Var.f22076r == null && !bnVar.c() && b2Var.Q.n3() && !b2Var.Q.p3()) {
            if (!b2Var.Q.P3()) {
                b2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = b2Var.Q.c3();
            if (!c32.isEmpty()) {
                dg0 dg0Var = b2Var.P0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    b2Var.P0 = null;
                }
                dg0 dg0Var2 = new dg0(b2Var.getParentActivity(), b2Var.getResourceProvider());
                b2Var.P0 = dg0Var2;
                dg0Var2.setOnDismissListener(new u9(b2Var, 8));
                long a10 = b2Var.K.a();
                fj fjVar = b2Var.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28513id = 0;
                tL_message.out = true;
                tL_message.peer_id = mp.u1(b2Var.currentAccount).B1(a10);
                tL_message.from_id = mp.u1(b2Var.currentAccount).B1(i10.i(b2Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = b2Var.Q.E2();
                tL_message.rich_message.documents = b2Var.Q.B2();
                if (fjVar != null && !fjVar.f24092p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = fjVar.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                fj fjVar2 = new fj(b2Var.currentAccount, tL_message, false, false);
                if (fjVar != null && !fjVar.f24092p) {
                    fjVar2.C = fjVar;
                }
                fjVar2.B0 = true;
                fjVar2.W2 = Boolean.TRUE;
                fjVar2.n0(null);
                fjVar2.f24121w1 = true;
                b2Var.P0.r(org.telegram.messenger.f3.i(fjVar2));
                b2Var.f22089z0.setScaleX(1.0f);
                b2Var.f22089z0.setScaleY(1.0f);
                tg s5 = b2Var.P0.s(b2Var.f22089z0, true, new h1(b2Var, 10));
                if (s5 != null) {
                    s5.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), b2Var.getThemedColor(n6.Fi))));
                    dg0 dg0Var3 = b2Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    dg0Var3.f47111p0 = true;
                    dg0Var3.Y = L;
                }
                x60 I = x60.I(b2Var, b2Var.f22089z0);
                boolean C = n10.C(b2Var.K.j());
                if (b2Var.K.S6()) {
                    if (C) {
                        i7 = 2131745318;
                    } else {
                        i7 = 2131745663;
                    }
                    I.c(2131232082, gd.N0(i7, null), new bi.e4(b2Var, a10, 16), false);
                    if (!C && a10 > 0) {
                        I.c(2131232269, gd.N0(2131745390, null), new g1(b2Var, 5), false);
                    }
                }
                if (!C) {
                    I.c(2131231512, gd.N0(2131745387, null), new g1(b2Var, 6), false);
                }
                I.Z();
                b2Var.P0.q(I);
                b2Var.P0.show();
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
        x60 x60Var = b2Var.f22088y0;
        if (x60Var != null) {
            x60Var.v();
            b2Var.f22088y0 = null;
        }
        if (!mp.u1(b2Var.currentAccount).B4() && !i10.i(b2Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = b2Var.Q.T2();
        final x60 J = x60.J(b2Var, view);
        J.T = true;
        x60 K = J.K();
        K.c(2131231243, gd.N0(2131753753, null), new h6(J, 8), false);
        K.k();
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        K.j(z11, 2131231562, null, gd.N0(2131754027, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0 + 2);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        K.j(z12, 2131231563, null, gd.N0(2131754026, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0 + 1);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        K.j(z13, 2131231564, null, gd.N0(2131754025, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        K.j(z14, 2131231565, null, gd.N0(2131754024, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0 - 1);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        K.j(z15, 2131231566, null, gd.N0(2131754023, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0 - 2);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        K.j(z16, 2131231567, null, gd.N0(2131754022, null), new Runnable(b2Var) {
            public final b2 f22300b;

            {
                this.f22300b = b2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22300b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30344a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30344a.setTextSize(1, bz.W0 - 3);
        if (T2 != null && t3.F3(T2.f22001b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        z1 z1Var = new z1(context, 2131231561);
        z1Var.a(z10);
        int i7 = n6.G8;
        z1Var.d = i7;
        J.j(z17, 0, z1Var, gd.N0(2131754028, null), new bi.a6(J, K, 3));
        J.z().f30344a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.y0 z23 = J.z();
        float f15 = 9.0f;
        if (gd.f24314a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (gd.f24314a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        z23.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        J.j(z18, 2131231600, null, gd.N0(2131753985, null), new l1(b2Var, T2, 3));
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        J.j(z19, 2131231584, null, gd.N0(2131753993, null), new l1(b2Var, T2, 4));
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        z1 z1Var2 = new z1(context, 2131231583);
        z1Var2.a(z10);
        z1Var2.d = i7;
        J.j(z20, 0, z1Var2, gd.N0(2131753994, null), new l1(b2Var, T2, 0));
        org.telegram.ui.ActionBar.y0 z24 = J.z();
        if (gd.f24314a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (gd.f24314a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        z24.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        J.j(z21, 2131231555, null, gd.N0(2131754052, null), new l1(b2Var, T2, 1));
        if (T2 != null && (T2.f22001b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        z1 z1Var3 = new z1(context, 2131231558);
        z1Var3.a(z10);
        z1Var3.d = i7;
        J.j(z22, 0, z1Var3, gd.N0(2131754029, null), new l1(b2Var, T2, 2));
        org.telegram.ui.ActionBar.y0 z25 = J.z();
        if (gd.f24314a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!gd.f24314a0) {
            f15 = 18.0f;
        }
        z25.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        J.a0();
        b2Var.f22088y0 = J;
    }

    public static void d0(b2 b2Var, fj fjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, fj fjVar2, fj fjVar3, rm rmVar, boolean z10, int i7, int i10, bw bwVar, long j10) {
        if (fjVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(b2Var.currentAccount);
            bn bnVar = b2Var.K;
            org.telegram.messenger.q5 q5Var = zy.J;
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
                zy.j(pageBlock2, identityHashMap);
            }
            zy.C(a10.f23343a).v(fjVar, richMessage, arrayList4, bnVar, false);
            return;
        }
        zy.R(org.telegram.messenger.c.a(b2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, fjVar2, fjVar3, rmVar, z10, i7, i10, bwVar, 0L, j10, 0L);
    }

    public static void e0(b2 b2Var, boolean z10, boolean z11) {
        float f10;
        int i7;
        if (b2Var.K0 != z10 || !z11) {
            b2Var.K0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z11) {
                b2Var.f22086x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(kr.h).start();
            } else {
                b2Var.f22086x0.animate().cancel();
                b2Var.f22086x0.setScaleX(f10);
                b2Var.f22086x0.setScaleY(f10);
            }
            qh0 qh0Var = b2Var.f22086x0;
            if (z10) {
                i7 = n6.f29692q7;
            } else {
                i7 = n6.G6;
            }
            u6.s(qh0Var, i7, b2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            nh0 animatedDrawable = b2Var.f22086x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f37801b0 > 34) {
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

    public static f1 f0(b2 b2Var) {
        f1 focusedEditTextOrNull = b2Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            b2Var.S0 = focusedEditTextOrNull;
            b2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        f1 f1Var = b2Var.S0;
        if (f1Var != null) {
            return f1Var;
        }
        return b2Var.Q.S2();
    }

    public static int g0(b2 b2Var, f1 f1Var) {
        if (f1Var == b2Var.S0 && b2Var.Q.getFocusedEditTextOrNull() != f1Var) {
            return Math.min(b2Var.T0, f1Var.length());
        }
        return Math.max(0, f1Var.getSelectionEnd());
    }

    public static String l0(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 7) {
                        if (i7 != 9) {
                            return null;
                        }
                        return gd.N0(2131754868, null);
                    }
                    return gd.N0(2131754863, null);
                }
                return gd.N0(2131754854, null);
            }
            return gd.N0(2131754859, null);
        }
        return gd.N0(2131754853, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return gd.N0(2131753668, null);
        }
        if (i7 == 2) {
            return gd.N0(2131748894, null);
        }
        if (i7 == 16) {
            return gd.N0(2131743642, null);
        }
        if (i7 == 8) {
            return gd.N0(2131744192, null);
        }
        if (i7 == 256) {
            return gd.N0(2131745021, null);
        }
        if (i7 == 4) {
            return gd.N0(2131748157, null);
        }
        if (i7 == 65536) {
            return gd.N0(2131749110, null);
        }
        if (i7 == 16384) {
            return gd.N0(2131744180, null);
        }
        if (i7 != 32768) {
            return null;
        }
        return gd.N0(2131744082, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, i6 i6Var) {
        final org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j3.O = g10;
        ImageView e10 = m10.e(context, 2131231606);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = n6.Fi;
        ShapeDrawable L2 = n6.L(L, n6.w0(i7, i6Var));
        q6 M = u6.M(i7);
        e10.setBackground(L2);
        u6.j(e10, L2, M, null, i6Var);
        g10.addView(e10, na.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131754038, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = n6.G6;
        u6.U(textView, i10, i6Var);
        TextView f10 = m10.f(g10, textView, na.t(-1, -2, 49, 25, 16, 25, 0), context);
        f10.setText(org.telegram.messenger.g0.W2(gd.N0(2131754039, null)));
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        u6.U(f10, i10, i6Var);
        g10.addView(f10, na.t(-1, -2, 49, 25, 11, 25, 0));
        hi.e g11 = m10.g(24, context, i6Var, true);
        g11.setText(gd.N0(2131754040, null));
        g10.addView(g11, na.t(-1, 48, 49, 14, 31, 14, 0));
        hi.e g12 = m10.g(24, context, i6Var, false);
        g12.setText(gd.N0(2131754041, null));
        g10.addView(g12, na.t(-1, 48, 49, 14, 2, 14, 6));
        j3.show();
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j3.dismiss();
                        runnable2.run();
                        return;
                    default:
                        j3.dismiss();
                        runnable2.run();
                        return;
                }
            }
        });
        g12.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        j3.dismiss();
                        runnable.run();
                        return;
                    default:
                        j3.dismiss();
                        runnable.run();
                        return;
                }
            }
        });
    }

    public final void A0() {
        jh.f fVar = this.f22078s;
        int[] iArr = this.G;
        fVar.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.f22087y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.f22083w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr2 = this.I;
        iArr2[0] = (int) (iArr2[0] - (this.f22083w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: oi.b2.B0():void");
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
            this.f22057b0.setVisibility(0);
            ViewPropertyAnimator animate = this.f22057b0.animate();
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
            kr krVar = kr.h;
            duration.setInterpolator(krVar).withEndAction(new g1(this, 1)).start();
            this.f22067i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f22067i0.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(krVar).withEndAction(new g1(this, 2)).start();
            this.f22084w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f22084w0.animate();
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(krVar).withEndAction(new g1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f22057b0;
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f22057b0;
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f22057b0;
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f22057b0;
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f22057b0;
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        b61 b61Var = this.f22067i0;
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        b61Var.setVisibility(i11);
        b61 b61Var2 = this.f22067i0;
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        b61Var2.setAlpha(f13);
        b61 b61Var3 = this.f22067i0;
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        b61Var3.setScaleX(f14);
        b61 b61Var4 = this.f22067i0;
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        b61Var4.setScaleY(f15);
        b61 b61Var5 = this.f22067i0;
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        b61Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f22084w0;
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f22084w0;
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f22084w0;
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f22084w0;
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
        f1 f1Var;
        int max3;
        boolean z17;
        boolean z18;
        i9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            x1 x1Var = this.f22082v0;
            boolean z19 = false;
            if (x1Var != null) {
                t3 t3Var = this.Q;
                int[] E4 = t3Var.E4();
                if (E4 != null && t3Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                x1Var.setSelected(z18);
            }
            if (this.Q.O3()) {
                i9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
                int i7 = textSelectionHelper2.f30923p0;
                int i10 = textSelectionHelper2.f30924q0;
                int i11 = textSelectionHelper2.f30927t0;
                int i12 = textSelectionHelper2.f30925r0;
                int i13 = textSelectionHelper2.f30928u0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    x1 x1Var2 = (x1) obj;
                    x1Var2.setSelected(this.Q.N3(((Integer) x1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
                }
                if (i10 == i11) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    f1Var = this.Q.Q4(i7, i10);
                } else {
                    f1Var = null;
                }
                int max4 = Math.max(0, Math.min(i12, i13));
                if (f1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i12, i13), f1Var.length()));
                }
                x1 x1Var3 = this.f22077r0;
                if (x1Var3 != null) {
                    if (f1Var != null && max4 < max3 && c6.h(f1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    x1Var3.setSelected(z17);
                }
                x1 x1Var4 = this.f22080t0;
                if (x1Var4 != null) {
                    if (f1Var != null && max4 < max3 && c6.g(f1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    x1Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.Q.o2());
            } else if (this.Q.z3()) {
                i9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
                f1 v22 = this.Q.v2(textSelectionHelper3.f30923p0);
                int i15 = textSelectionHelper3.f30925r0;
                int i16 = textSelectionHelper3.f30928u0;
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
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    x1Var5.setSelected(z15);
                }
                x1 x1Var6 = this.f22077r0;
                if (x1Var6 != null) {
                    if (v22 != null && max < max2 && c6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    x1Var6.setSelected(z14);
                }
                x1 x1Var7 = this.f22080t0;
                if (x1Var7 != null) {
                    if (v22 != null && max < max2 && c6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    x1Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.Q.o2());
            } else {
                int i18 = textSelectionHelper.f30923p0;
                int i19 = textSelectionHelper.f30926s0;
                int i20 = textSelectionHelper.f30925r0;
                int i21 = textSelectionHelper.f30928u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.f22512x4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    x1 x1Var8 = (x1) arrayList.get(i22);
                    int intValue2 = ((Integer) x1Var8.getTag()).intValue();
                    if (z10 && this.Q.M3(intValue2, i18, i20, i19, i21)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    x1Var8.setSelected(z13);
                    i22 = i23;
                }
                y0(!this.Q.L3());
                x1 x1Var9 = this.f22077r0;
                if (x1Var9 != null) {
                    if (z10) {
                        Editable K4 = this.Q.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = c6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            x1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    x1Var9.setSelected(z12);
                }
                x1 x1Var10 = this.f22080t0;
                if (x1Var10 != null) {
                    if (z10) {
                        Editable K42 = this.Q.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = c6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g10) {
                            z11 = true;
                            x1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    x1Var10.setSelected(z11);
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
        if (g2Var != null && !g2Var.f22212c.isEmpty()) {
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
        if (!mp.u1(this.currentAccount).B4() && !i10.i(this.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((x1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        float f10;
        if (this.f22089z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.f22089z0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f22089z0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        m10.n(animate, f10, 150L);
    }

    public final void H0() {
        w1 w1Var = this.f22089z0;
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
        ArrayList arrayList = this.O;
        arrayList.clear();
        this.P = new t1(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ki.u1 u1Var = new ki.u1(this, 1);
        this.I0 = u1Var;
        this.P.f34144r.add(u1Var);
        t3 t3Var = new t3(context, this.currentAccount, getResourceProvider(), new hi.u0(this, 21));
        this.Q = t3Var;
        t3Var.setFileRefParentObject(this.f22076r);
        this.P.addView(this.Q, na.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), na.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f22056b;
        if (richMessage != null) {
            t3 t3Var2 = this.Q;
            ArrayList arrayList2 = t3Var2.f22503t3;
            t3Var2.f22501s3 = richMessage;
            t3.Z2(arrayList2, richMessage.blocks, t3Var2.f22505u3);
            t3Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                t3Var2.y4((a) arrayList2.get(i12));
            }
            t3Var2.f35323g3.O(false);
        } else {
            String str = this.f22063f;
            if (str != null) {
                t3 t3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f22071n;
                HashMap hashMap = t3Var3.f22505u3;
                ArrayList arrayList3 = t3Var3.f22503t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    t3.Z2(arrayList3, a5.b(charSequence), hashMap);
                }
                arrayList3.addAll(t3Var3.z4(b4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    t3.Z2(arrayList3, a5.b(charSequence2), hashMap);
                }
                t3Var3.Y3();
                t3Var3.f35323g3.O(false);
            } else {
                CharSequence charSequence3 = this.f22053a;
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
        int i13 = n6.f29451d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), n6.r1(0.0f, getThemedColor(i13))}));
        this.P.addView(this.R, na.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{n6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.P.addView(this.S, na.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, na.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231243);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = n6.f29543i6;
        imageView3.setBackground(new a2(n6.b0(themedColor, n6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i15 = n6.G6;
        i6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView4, i15, resourceProvider, mode);
        sa.a(this.U);
        this.U.setContentDescription(gd.N0(2131754878, null));
        this.U.setOnClickListener(new h1(this, 1));
        this.T.addView(this.U, na.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.T.addView(this.V, na.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231602);
        this.W.setScaleType(scaleType);
        u6.Q(this.W, n6.h0(getThemedColor(i14), 1, -1), null, u6.M(i14), getResourceProvider());
        u6.s(this.W, i15, getResourceProvider(), mode);
        sa.a(this.W);
        this.W.setContentDescription(gd.N0(2131743640, null));
        this.W.setOnClickListener(new h1(this, 2));
        this.V.addView(this.W, na.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231585);
        this.X.setScaleType(scaleType);
        u6.Q(this.X, n6.h0(getThemedColor(i14), 1, -1), null, u6.M(i14), getResourceProvider());
        u6.s(this.X, i15, getResourceProvider(), mode);
        sa.a(this.X);
        this.X.setContentDescription(gd.N0(2131746146, null));
        this.X.setOnClickListener(new h1(this, 3));
        this.V.addView(this.X, na.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, na.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22054a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f22054a0.setClipToPadding(false);
        this.Z.addView(this.f22054a0, na.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22057b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f22057b0.setClipChildren(false);
        this.f22057b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f22054a0.addView(this.f22057b0, na.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.f22054a0.addView(frameLayout4, na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f22060d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        this.f22060d0.setScaleType(scaleType);
        u6.s(this.f22060d0, i15, getResourceProvider(), mode);
        this.f22060d0.setBackground(new a2(n6.b0(getThemedColor(i13), n6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f22057b0.addView(this.f22060d0, na.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        sa.a(this.f22060d0);
        this.f22060d0.setContentDescription(gd.N0(2131755006, null));
        this.f22060d0.setOnClickListener(new h1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, na.e(-2, 44, 81));
        u1 u1Var2 = new u1(context, 0);
        this.f22062e0 = u1Var2;
        u1Var2.setClipToOutline(true);
        this.f22062e0.setOutlineProvider(new bg.q0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f22064f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22064f0.setOrientation(0);
        this.f22062e0.addView(this.f22064f0);
        frameLayout6.addView(this.f22062e0, na.c(-1.0f, -1));
        zg zgVar = new zg(context, 24);
        this.f22059c0 = zgVar;
        zgVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        u6.s(this.f22059c0, i15, getResourceProvider(), mode);
        u6.Q(this.f22059c0, n6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), u6.M(i13), u6.M(i14), getResourceProvider());
        this.f22059c0.j(xg.f41996e, false);
        this.f22064f0.addView(this.f22059c0, na.r(38, 38, 16));
        sa.a(this.f22059c0);
        this.f22059c0.setContentDescription(gd.N0(2131754884, null));
        this.f22059c0.setOnClickListener(new h1(this, 5));
        h0(2131231599, 1, false).setOnClickListener(new i1(0, this, context));
        h0(2131231571, 2, true).setOnClickListener(new h1(this, 6));
        h0(2131231588, 4, true).setOnClickListener(new h1(this, 7));
        h0(2131231573, 7, true).setOnClickListener(new h1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f22066h0 = imageView8;
        imageView8.setImageResource(2131232494);
        this.f22066h0.setScaleType(scaleType);
        u6.s(this.f22066h0, i15, getResourceProvider(), mode);
        u6.Q(this.f22066h0, n6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), u6.M(i13), u6.M(i14), getResourceProvider());
        this.f22064f0.addView(this.f22066h0, na.t(38, 38, 16, 2, 0, 0, 0));
        sa.a(this.f22066h0);
        this.f22066h0.setContentDescription(gd.N0(2131754921, null));
        this.f22066h0.setOnClickListener(new h1(this, 9));
        this.f22057b0.addView(frameLayout5, na.l(1.0f, 0, 44));
        b61 b61Var = new b61(6, context, this);
        this.f22067i0 = b61Var;
        b61Var.setOrientation(0);
        this.f22067i0.setClipToPadding(false);
        this.f22067i0.setClipChildren(false);
        this.f22067i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22067i0, na.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f22084w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f22084w0.setClipToPadding(false);
        this.f22084w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22084w0, na.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f22086x0 = imageView9;
        imageView9.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        nh0 animatedDrawable = this.f22086x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f22086x0.setScaleType(scaleType);
        u6.s(this.f22086x0, i15, getResourceProvider(), mode);
        this.f22086x0.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22084w0.addView(this.f22086x0, na.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22067i0.addView(frameLayout8, na.c(44.0f, -2));
        v1 v1Var = new v1(this, context);
        this.f22069k0 = v1Var;
        v1Var.setHorizontalScrollBarEnabled(false);
        this.f22069k0.setClipToOutline(true);
        this.f22069k0.setOutlineProvider(new bg.q0(5));
        frameLayout8.addView(this.f22069k0, na.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f22068j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f22068j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22069k0.addView(this.f22068j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231202, 1, false);
        i0(context, 2131231204, 2, false);
        i0(context, 2131231210, 16, false);
        i0(context, 2131231209, 8, false);
        i0(context, 2131231208, 256, false);
        i0(context, 2131231555, 4, false);
        i0(context, 2131231205, 65536, true);
        i0(context, 2131231586, 16384, true);
        i0(context, 2131231587, 32768, true);
        x1 x1Var = new x1(2131231584, context, getResourceProvider());
        this.f22082v0 = x1Var;
        x1Var.setContentDescription(gd.N0(2131746244, null));
        this.f22082v0.setOnClickListener(new h1(this, 11));
        LinearLayout linearLayout5 = this.f22068j0;
        x1 x1Var2 = this.f22082v0;
        if (linearLayout5.getChildCount() > 0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        linearLayout5.addView(x1Var2, na.t(38, 38, 16, i7, 0, 0, 0));
        x1 x1Var3 = new x1(2131231552, context, getResourceProvider());
        this.f22079s0 = x1Var3;
        x1Var3.setContentDescription(gd.N0(2131745815, null));
        this.f22079s0.setOnClickListener(new h1(this, 12));
        LinearLayout linearLayout6 = this.f22068j0;
        x1 x1Var4 = this.f22079s0;
        if (linearLayout6.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout6.addView(x1Var4, na.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f22073o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f22073o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22073o0.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22067i0.addView(this.f22073o0, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var5 = new x1(2131231749, context, getResourceProvider());
        this.f22077r0 = x1Var5;
        x1Var5.setContentDescription(gd.N0(2131751732, null));
        this.f22077r0.setOnClickListener(new h1(this, 13));
        this.f22073o0.addView(this.f22077r0, na.r(38, 38, 16));
        x1 x1Var6 = new x1(2131232082, context, getResourceProvider());
        this.f22080t0 = x1Var6;
        x1Var6.setContentDescription(gd.N0(2131754861, null));
        this.f22080t0.setOnClickListener(new h1(this, 14));
        this.f22073o0.addView(this.f22080t0, na.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f22074p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f22074p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22074p0.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22067i0.addView(this.f22074p0, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        x1 x1Var7 = new x1(2131231573, context, getResourceProvider());
        this.f22081u0 = x1Var7;
        x1Var7.d();
        arrayList.add(this.f22081u0);
        this.f22081u0.setContentDescription(gd.N0(2131754863, null));
        this.f22081u0.setOnClickListener(new h1(this, 15));
        this.f22074p0.addView(this.f22081u0, na.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f22072n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f22072n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22072n0.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22067i0.addView(this.f22072n0, 0, na.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        x1 x1Var8 = new x1(0, context, getResourceProvider());
        this.f22075q0 = x1Var8;
        x1Var8.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        this.f22075q0.setContentDescription(gd.N0(2131755006, null));
        this.f22075q0.setOnClickListener(new h1(this, 16));
        this.f22072n0.addView(this.f22075q0, na.r(38, 38, 16));
        if (this.f22076r != null) {
            i11 = 2131231505;
        } else if (q0()) {
            i11 = 2131231515;
        } else {
            i11 = 2131232699;
        }
        w1 w1Var = new w1(this, context, i11, getResourceProvider());
        this.f22089z0 = w1Var;
        w1Var.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(n6.Pe))));
        sa.a(this.f22089z0);
        this.f22057b0.addView(this.f22089z0, na.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f22089z0.setContentDescription(gd.N0(2131745444, null));
        this.f22089z0.setOnClickListener(new h1(this, 0));
        this.f22089z0.setOnLongClickListener(new hi.y4(this, 4));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.f24220m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        F0();
        if (this.f22061e) {
            this.Q.F2();
            this.f22061e = false;
        }
        t1 t1Var = this.P;
        this.fragmentView = t1Var;
        return t1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25232i5) {
            H0();
            F0();
        }
    }

    public final x1 h0(int i7, int i10, boolean z10) {
        int i11;
        x1 x1Var = new x1(i7, this.f22064f0.getContext(), getResourceProvider());
        if (z10) {
            x1Var.d();
            this.O.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(l0(i10));
        this.f22065g0.add(x1Var);
        LinearLayout linearLayout = this.f22064f0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(x1Var, na.t(38, 38, 16, i11, 0, 0, 0));
        return x1Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z10) {
        int i11;
        x1 x1Var = new x1(i7, context, getResourceProvider());
        if (z10) {
            x1Var.d();
            this.O.add(x1Var);
        }
        x1Var.setTag(Integer.valueOf(i10));
        x1Var.setContentDescription(n0(i10));
        x1Var.setOnClickListener(new ci.q(this, i10, 7));
        this.m0.add(x1Var);
        LinearLayout linearLayout = this.f22068j0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(x1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        t3 t3Var = this.Q;
        if (t3Var != null && t3Var.f22507v3.x()) {
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
        ofFloat.addUpdateListener(new j1(this, 0));
        this.Q0.setInterpolator(kr.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        qy qyVar = this.B0;
        if (qyVar != null && (layoutParams = (FrameLayout.LayoutParams) qyVar.getLayoutParams()) != null) {
            int o02 = o0();
            t1 t1Var = this.P;
            if (t1Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((t1Var.getMeasuredHeight() - this.P.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.U0);
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
        qy qyVar = this.B0;
        if (qyVar != null && (layoutParams = (FrameLayout.LayoutParams) qyVar.getLayoutParams()) != null) {
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
        int i7;
        Point point = org.telegram.messenger.g0.f24226q;
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
                t3 t3Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    t3Var.getClass();
                } else if (t3Var.getContext() != null) {
                    Utilities.f22877e.c(new n2.c0(3, t3Var, data));
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
                qy qyVar = this.B0;
                if (qyVar != null) {
                    qyVar.t(false);
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
        if (!org.telegram.messenger.g0.Q1() && this.f22078s != null && this.f22083w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            jh.f fVar = this.f22078s;
            this.f22087y = fVar.f17874n;
            fVar.f17872e = false;
            fVar.invalidate();
            this.f22083w.setAlpha(0.0f);
            this.f22083w.f32762q2.setVisibility(4);
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
            ofFloat.addUpdateListener(new j1(this, 1));
            ofFloat.addListener(new ah.l(11, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.T;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.f22054a0, property, 0.0f), ObjectAnimator.ofFloat(this.f22054a0, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.T;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.f22054a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f22054a0, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(kr.h);
            this.P.post(new hq0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.f25232i5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ki.u1 u1Var;
        ks.f(this.currentAccount).n(this, ks.f25232i5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        n1 n1Var = this.O0;
        if (n1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.g3(n1Var);
        }
        dg0 dg0Var = this.P0;
        if (dg0Var != null) {
            dg0Var.i();
            this.P0 = null;
        }
        t3 t3Var = this.Q;
        if (t3Var != null) {
            t3Var.J2();
        }
        m.o3 o3Var = this.A0;
        if (o3Var != null) {
            o3Var.a();
        }
        super.onFragmentDestroy();
        qy qyVar = this.B0;
        if (qyVar != null) {
            qyVar.B();
        }
        t1 t1Var = this.P;
        if (t1Var != null && (u1Var = this.I0) != null) {
            t1Var.f34144r.remove(u1Var);
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
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        boolean z10;
        x60 x60Var;
        i0.b f10 = l1Var.f56381a.f(3);
        int i7 = l1Var.f56381a.f(8).d;
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
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                this.G0 = i10;
                mp.f1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                mp.f1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z11 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z11 && (x60Var = this.f22088y0) != null) {
            x60Var.v();
            this.f22088y0 = null;
        }
        onInsets(f10.f15978a, f10.f15979b, f10.f15980c, f10.d);
        return r0.l1.f56380b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = n6.f29451d6;
            int themedColor = getThemedColor(i7);
            int i10 = n6.f29543i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = n6.Pe;
            int themedColor3 = getThemedColor(i11);
            if (!this.f22055a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.f22055a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), n6.r1(0.0f, getThemedColor(i7))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new a2(n6.b0(getThemedColor(i7), n6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                ImageView imageView2 = this.f22060d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new a2(n6.b0(getThemedColor(i7), n6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                qh0 qh0Var = this.f22086x0;
                if (qh0Var != null) {
                    qh0Var.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout2 = this.f22073o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout3 = this.f22074p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout4 = this.f22072n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                w1 w1Var = this.f22089z0;
                if (w1Var != null) {
                    w1Var.setBackground(new a2(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        t3 t3Var;
        int i7;
        t3 t3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i7 = this.f22058c) >= 0 && (t3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f22058c = -1;
            if (!t3Var2.c2(i7, i10)) {
                t3Var2.post(new o2(t3Var2, i7, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f22056b != null || this.f22063f != null) && (t3Var = this.Q) != null && !t3Var.d3()) {
                t3Var.post(new b(t3Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            qy qyVar = this.B0;
            if (qyVar != null) {
                qyVar.t(false);
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
        qy qyVar2 = this.B0;
        if (qyVar2 != null) {
            qyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        zg zgVar = this.f22059c0;
        if (zgVar != null) {
            zgVar.j(xg.f41996e, z10);
        }
    }

    public final boolean q0() {
        bn bnVar;
        if (this.f22076r == null && (bnVar = this.K) != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!mp.u1(this.currentAccount).B4() && !i10.i(this.currentAccount).q()) {
            t3 t3Var = this.Q;
            if (a5.d(t3Var.f22503t3, t3Var.f22505u3)) {
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
            org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(getParentActivity(), getResourceProvider());
            m0Var.w1(a10);
            m0Var.f37286g2 = new c7(k22, 15);
            m0Var.show();
        }
    }

    public final void t0(int i7, int i10) {
        t3 t3Var = this.Q;
        t3Var.f22489k4 = t3Var.T2();
        ti tiVar = new ti(getParentActivity(), this, false, false, true, getResourceProvider());
        tiVar.X3 = new q1(this, tiVar);
        tiVar.f39967e2.setIncludeVideosInGallery(true);
        tiVar.f39967e2.i0();
        tiVar.z1(1, true);
        tiVar.W0(i7);
        tiVar.f40023u4 = new p1(this, tiVar);
        tiVar.T1 = new p1(this, tiVar);
        tiVar.S1 = new r1(this, tiVar);
        tiVar.f1();
        if (i10 != 0) {
            tiVar.p1(i10);
        }
        tiVar.A0(true);
        tiVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.K == null || this.f22076r != null || !this.Q.u2()) {
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
        rj rjVar = this.K.f46118a0;
        if (m22 != null && !this.N) {
            t3 t3Var = this.Q;
            if (t3Var.n3() && !a5.d(t3Var.f22503t3, t3Var.f22505u3) && rjVar != null) {
                SpannableStringBuilder g10 = a5.g(this.Q.f22503t3);
                bn bnVar = rjVar.F3;
                if (rjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                j6.m(spannableStringBuilder, rjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.x5.class);
                if (x5VarArr != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        x5Var.applyFontMetrics(rjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.o5.f());
                    }
                }
                ih0.a(spannableStringBuilder);
                if (bnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    ri.d0(rjVar.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), charSequenceArr[0], ri.d0(rjVar.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                rjVar.setRichDraftPreview(null);
                if (rjVar.F0.getText() != null) {
                    rjVar.F0.getText().clear();
                }
                rjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        ri mediaDataController = getMediaDataController();
        long a10 = this.K.a();
        bn bnVar2 = this.K;
        mediaDataController.V1(a10, bnVar2.Q7(bnVar2.F5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (rjVar == null) {
            return true;
        }
        rjVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new g1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.b5.J(getParentActivity(), this.K.a(), new j6.r(this, 14), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i7, final int i10, final boolean z10) {
        rj rjVar;
        mg mgVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            t3 t3Var = this.Q;
            Objects.requireNonNull(t3Var);
            u0(parentActivity, new b(t3Var, 0), new g1(this, 4), getResourceProvider());
        } else if (this.K != null && this.Q.n3() && !this.Q.p3()) {
            if (!this.Q.P3()) {
                G0();
            } else if (!mp.u1(this.currentAccount).B4()) {
                rj rjVar2 = this.K.f46118a0;
                if (rjVar2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    rjVar2.v1(a5.g(this.Q.f22503t3), z10, i7, i10);
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
                final ArrayList a10 = z4.a(this.currentAccount, c32);
                final long a11 = this.K.a();
                bn bnVar = this.K;
                final fj fjVar = bnVar.F5;
                final fj fjVar2 = bnVar.f46282m4;
                final rm rmVar = bnVar.D5;
                final long j92 = bnVar.j9();
                final bw Y8 = this.K.Y8();
                final fj fjVar3 = this.f22076r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        b2.d0(b2.this, fjVar3, c32, E2, B2, a10, a11, fjVar, fjVar2, rmVar, z10, i7, i10, Y8, j92);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (fjVar3 == null && (rjVar = this.K.f46118a0) != null && (mgVar = rjVar.P3) != null) {
                    mgVar.G(null, z10, i7, i10, 0L);
                }
                if (i7 != 0 && fjVar3 == null) {
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
            x1 x1Var = (x1) obj;
            if (((Integer) x1Var.getTag()).intValue() == 1) {
                x1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        x1 x1Var = this.f22077r0;
        if (x1Var != null) {
            x1Var.setEnabled(z10);
        }
        x1 x1Var2 = this.f22079s0;
        if (x1Var2 != null) {
            x1Var2.setEnabled(z11);
        }
        x1 x1Var3 = this.f22080t0;
        if (x1Var3 != null) {
            x1Var3.setEnabled(z10);
        }
        x1 x1Var4 = this.f22081u0;
        if (x1Var4 != null) {
            x1Var4.setEnabled(z10);
        }
    }

    public b2(String str) {
        super(null);
        this.f22058c = -1;
        this.d = -1;
        this.f22085x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22065g0 = new ArrayList();
        this.f22070l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new g1(this, 0);
        this.f22063f = str;
    }

    public b2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f22058c = -1;
        this.d = -1;
        this.f22085x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22065g0 = new ArrayList();
        this.f22070l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new g1(this, 0);
        this.f22056b = richMessage;
    }
}
