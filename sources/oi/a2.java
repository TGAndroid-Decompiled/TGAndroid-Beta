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
import hi.t6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.cw;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.yg;
import org.telegram.ui.bn;
import org.telegram.ui.d61;
import org.telegram.ui.eg0;
import org.telegram.ui.iq0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class a2 extends org.telegram.ui.ActionBar.g2 implements gs {
    public ga.d A0;
    public ty B0;
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
    public m1 O0;
    public s1 P;
    public eg0 P0;
    public s3 Q;
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
    public final CharSequence f21924a;
    public FrameLayout f21925a0;
    public boolean f21926a1;
    public final TL_iv.RichMessage f21927b;
    public LinearLayout f21928b0;
    public int f21929c;
    public ah f21930c0;
    public int d;
    public ImageView f21931d0;
    public boolean f21932e;
    public t1 f21933e0;
    public final String f21934f;
    public LinearLayout f21935f0;
    public final ArrayList f21936g0;
    public CharSequence h;
    public ImageView f21937h0;
    public d61 f21938i0;
    public LinearLayout f21939j0;
    public u1 f21940k0;
    public int f21941l0;
    public final ArrayList m0;
    public CharSequence f21942n;
    public LinearLayout f21943n0;
    public LinearLayout f21944o0;
    public LinearLayout f21945p0;
    public w1 f21946q0;
    public gj f21947r;
    public w1 f21948r0;
    public jh.f f21949s;
    public w1 f21950s0;
    public w1 f21951t0;
    public w1 f21952u0;
    public w1 f21953v0;
    public rj f21954w;
    public FrameLayout f21955w0;
    public final Rect f21956x;
    public rh0 f21957x0;
    public fh.g f21958y;
    public a70 f21959y0;
    public v1 f21960z0;

    public a2(Editable editable) {
        super(null);
        this.f21929c = -1;
        this.d = -1;
        this.f21956x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f21936g0 = new ArrayList();
        this.f21941l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f21924a = editable;
    }

    public static void Z(a2 a2Var) {
        g3 g3Var = a2Var.Q.f22377v3;
        if (g3Var != null && g3Var.x()) {
            a2Var.s0();
            return;
        }
        Activity parentActivity = a2Var.getParentActivity();
        new u(a2Var.currentAccount, parentActivity, new t6(a2Var, 17), a2Var.getResourceProvider()).show();
    }

    public static void a0(a2 a2Var) {
        if (!k10.i(a2Var.currentAccount).q()) {
            a2Var.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) a2Var, 43, true));
        }
    }

    public static boolean b0(a2 a2Var, View view) {
        int i7;
        bn bnVar = a2Var.K;
        if (bnVar != null && a2Var.f21947r == null && !bnVar.c() && a2Var.Q.n3() && !a2Var.Q.p3()) {
            if (!a2Var.Q.P3()) {
                a2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = a2Var.Q.c3();
            if (!c32.isEmpty()) {
                eg0 eg0Var = a2Var.P0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    a2Var.P0 = null;
                }
                eg0 eg0Var2 = new eg0(a2Var.getParentActivity(), a2Var.getResourceProvider());
                a2Var.P0 = eg0Var2;
                eg0Var2.setOnDismissListener(new u9(a2Var, 8));
                long a10 = a2Var.K.a();
                gj gjVar = a2Var.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28419id = 0;
                tL_message.out = true;
                tL_message.peer_id = np.u1(a2Var.currentAccount).B1(a10);
                tL_message.from_id = np.u1(a2Var.currentAccount).B1(k10.i(a2Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = a2Var.Q.E2();
                tL_message.rich_message.documents = a2Var.Q.B2();
                if (gjVar != null && !gjVar.f24196p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = gjVar.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                gj gjVar2 = new gj(a2Var.currentAccount, tL_message, false, false);
                if (gjVar != null && !gjVar.f24196p) {
                    gjVar2.C = gjVar;
                }
                gjVar2.B0 = true;
                gjVar2.W2 = Boolean.TRUE;
                gjVar2.n0(null);
                gjVar2.f24225w1 = true;
                a2Var.P0.r(org.telegram.messenger.f3.i(gjVar2));
                a2Var.f21960z0.setScaleX(1.0f);
                a2Var.f21960z0.setScaleY(1.0f);
                ug s5 = a2Var.P0.s(a2Var.f21960z0, true, new g1(a2Var, 10));
                if (s5 != null) {
                    s5.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), a2Var.getThemedColor(m6.Fi))));
                    eg0 eg0Var3 = a2Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    eg0Var3.f47252p0 = true;
                    eg0Var3.Y = L;
                }
                a70 I = a70.I(a2Var, a2Var.f21960z0);
                boolean C = p10.C(a2Var.K.j());
                if (a2Var.K.S6()) {
                    if (C) {
                        i7 = 2131745318;
                    } else {
                        i7 = 2131745663;
                    }
                    I.c(2131232079, hd.N0(i7, null), new bi.e4(a2Var, a10, 16), false);
                    if (!C && a10 > 0) {
                        I.c(2131232266, hd.N0(2131745390, null), new f1(a2Var, 5), false);
                    }
                }
                if (!C) {
                    I.c(2131231509, hd.N0(2131745387, null), new f1(a2Var, 6), false);
                }
                I.Z();
                a2Var.P0.q(I);
                a2Var.P0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final a2 a2Var, Context context, View view) {
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
        a70 a70Var = a2Var.f21959y0;
        if (a70Var != null) {
            a70Var.v();
            a2Var.f21959y0 = null;
        }
        if (!np.u1(a2Var.currentAccount).B4() && !k10.i(a2Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = a2Var.Q.T2();
        final a70 J = a70.J(a2Var, view);
        J.T = true;
        a70 K = J.K();
        K.c(2131231240, hd.N0(2131753753, null), new h6(J, 8), false);
        K.k();
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        K.j(z11, 2131231559, null, hd.N0(2131754027, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0 + 2);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        K.j(z12, 2131231560, null, hd.N0(2131754026, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0 + 1);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        K.j(z13, 2131231561, null, hd.N0(2131754025, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        K.j(z14, 2131231562, null, hd.N0(2131754024, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0 - 1);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        K.j(z15, 2131231563, null, hd.N0(2131754023, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0 - 2);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        K.j(z16, 2131231564, null, hd.N0(2131754022, null), new Runnable(a2Var) {
            public final a2 f22171b;

            {
                this.f22171b = a2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22171b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30253a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30253a.setTextSize(1, cz.W0 - 3);
        if (T2 != null && s3.F3(T2.f21901b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        y1 y1Var = new y1(context, 2131231558);
        y1Var.a(z10);
        int i7 = m6.G8;
        y1Var.d = i7;
        J.j(z17, 0, y1Var, hd.N0(2131754028, null), new bi.a6(J, K, 3));
        J.z().f30253a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.y0 z23 = J.z();
        float f15 = 9.0f;
        if (hd.f24408a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (hd.f24408a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        z23.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        J.j(z18, 2131231597, null, hd.N0(2131753985, null), new k1(a2Var, T2, 3));
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        J.j(z19, 2131231581, null, hd.N0(2131753993, null), new k1(a2Var, T2, 4));
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        y1 y1Var2 = new y1(context, 2131231580);
        y1Var2.a(z10);
        y1Var2.d = i7;
        J.j(z20, 0, y1Var2, hd.N0(2131753994, null), new k1(a2Var, T2, 0));
        org.telegram.ui.ActionBar.y0 z24 = J.z();
        if (hd.f24408a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (hd.f24408a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        z24.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        J.j(z21, 2131231552, null, hd.N0(2131754052, null), new k1(a2Var, T2, 1));
        if (T2 != null && (T2.f21901b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        y1 y1Var3 = new y1(context, 2131231555);
        y1Var3.a(z10);
        y1Var3.d = i7;
        J.j(z22, 0, y1Var3, hd.N0(2131754029, null), new k1(a2Var, T2, 2));
        org.telegram.ui.ActionBar.y0 z25 = J.z();
        if (hd.f24408a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!hd.f24408a0) {
            f15 = 18.0f;
        }
        z25.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        J.a0();
        a2Var.f21959y0 = J;
    }

    public static void d0(a2 a2Var, gj gjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, gj gjVar2, gj gjVar3, rm rmVar, boolean z10, int i7, int i10, cw cwVar, long j10) {
        if (gjVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(a2Var.currentAccount);
            bn bnVar = a2Var.K;
            org.telegram.messenger.q5 q5Var = az.J;
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
                az.j(pageBlock2, identityHashMap);
            }
            az.C(a10.f23166a).v(gjVar, richMessage, arrayList4, bnVar, false);
            return;
        }
        az.R(org.telegram.messenger.c.a(a2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, gjVar2, gjVar3, rmVar, z10, i7, i10, cwVar, 0L, j10, 0L);
    }

    public static void e0(a2 a2Var, boolean z10, boolean z11) {
        float f10;
        int i7;
        if (a2Var.K0 != z10 || !z11) {
            a2Var.K0 = z10;
            if (z10) {
                f10 = 1.15f;
            } else {
                f10 = 1.0f;
            }
            if (z11) {
                a2Var.f21957x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(nr.h).start();
            } else {
                a2Var.f21957x0.animate().cancel();
                a2Var.f21957x0.setScaleX(f10);
                a2Var.f21957x0.setScaleY(f10);
            }
            rh0 rh0Var = a2Var.f21957x0;
            if (z10) {
                i7 = m6.f29588q7;
            } else {
                i7 = m6.G6;
            }
            org.telegram.ui.ActionBar.t6.s(rh0Var, i7, a2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            oh0 animatedDrawable = a2Var.f21957x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f38175b0 > 34) {
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

    public static e1 f0(a2 a2Var) {
        e1 focusedEditTextOrNull = a2Var.Q.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            a2Var.S0 = focusedEditTextOrNull;
            a2Var.T0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = a2Var.S0;
        if (e1Var != null) {
            return e1Var;
        }
        return a2Var.Q.S2();
    }

    public static int g0(a2 a2Var, e1 e1Var) {
        if (e1Var == a2Var.S0 && a2Var.Q.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(a2Var.T0, e1Var.length());
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
                        return hd.N0(2131754868, null);
                    }
                    return hd.N0(2131754863, null);
                }
                return hd.N0(2131754854, null);
            }
            return hd.N0(2131754859, null);
        }
        return hd.N0(2131754853, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return hd.N0(2131753668, null);
        }
        if (i7 == 2) {
            return hd.N0(2131748894, null);
        }
        if (i7 == 16) {
            return hd.N0(2131743646, null);
        }
        if (i7 == 8) {
            return hd.N0(2131744196, null);
        }
        if (i7 == 256) {
            return hd.N0(2131745021, null);
        }
        if (i7 == 4) {
            return hd.N0(2131748157, null);
        }
        if (i7 == 65536) {
            return hd.N0(2131749110, null);
        }
        if (i7 == 16384) {
            return hd.N0(2131744184, null);
        }
        if (i7 != 32768) {
            return null;
        }
        return hd.N0(2131744086, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.h6 h6Var) {
        final org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j3.O = g10;
        ImageView e10 = o10.e(context, 2131231603);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = m6.Fi;
        ShapeDrawable L2 = m6.L(L, m6.w0(i7, h6Var));
        p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        e10.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(e10, L2, M, null, h6Var);
        g10.addView(e10, na.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131754038, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        TextView f10 = o10.f(g10, textView, na.t(-1, -2, 49, 25, 16, 25, 0), context);
        f10.setText(org.telegram.messenger.g0.W2(hd.N0(2131754039, null)));
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(f10, i10, h6Var);
        g10.addView(f10, na.t(-1, -2, 49, 25, 11, 25, 0));
        hi.d g11 = o10.g(24, context, h6Var, true);
        g11.setText(hd.N0(2131754040, null));
        g10.addView(g11, na.t(-1, 48, 49, 14, 31, 14, 0));
        hi.d g12 = o10.g(24, context, h6Var, false);
        g12.setText(hd.N0(2131754041, null));
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
        jh.f fVar = this.f21949s;
        int[] iArr = this.G;
        fVar.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.f21958y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.f21954w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr2 = this.I;
        iArr2[0] = (int) (iArr2[0] - (this.f21954w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: oi.a2.B0():void");
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
            this.f21928b0.setVisibility(0);
            ViewPropertyAnimator animate = this.f21928b0.animate();
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
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).withEndAction(new f1(this, 1)).start();
            this.f21938i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f21938i0.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(nrVar).withEndAction(new f1(this, 2)).start();
            this.f21955w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f21955w0.animate();
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(nrVar).withEndAction(new f1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f21928b0;
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f21928b0;
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f21928b0;
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f21928b0;
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f21928b0;
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        d61 d61Var = this.f21938i0;
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d61Var.setVisibility(i11);
        d61 d61Var2 = this.f21938i0;
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        d61Var2.setAlpha(f13);
        d61 d61Var3 = this.f21938i0;
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        d61Var3.setScaleX(f14);
        d61 d61Var4 = this.f21938i0;
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        d61Var4.setScaleY(f15);
        d61 d61Var5 = this.f21938i0;
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        d61Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f21955w0;
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f21955w0;
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f21955w0;
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f21955w0;
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
        j9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            w1 w1Var = this.f21953v0;
            boolean z19 = false;
            if (w1Var != null) {
                s3 s3Var = this.Q;
                int[] E4 = s3Var.E4();
                if (E4 != null && s3Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                w1Var.setSelected(z18);
            }
            if (this.Q.O3()) {
                j9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
                int i7 = textSelectionHelper2.f30889p0;
                int i10 = textSelectionHelper2.f30890q0;
                int i11 = textSelectionHelper2.f30893t0;
                int i12 = textSelectionHelper2.f30891r0;
                int i13 = textSelectionHelper2.f30894u0;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    w1 w1Var2 = (w1) obj;
                    w1Var2.setSelected(this.Q.N3(((Integer) w1Var2.getTag()).intValue(), i7, i10, i12, i11, i13));
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
                w1 w1Var3 = this.f21948r0;
                if (w1Var3 != null) {
                    if (e1Var != null && max4 < max3 && b6.h(e1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    w1Var3.setSelected(z17);
                }
                w1 w1Var4 = this.f21951t0;
                if (w1Var4 != null) {
                    if (e1Var != null && max4 < max3 && b6.g(e1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    w1Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.Q.o2());
            } else if (this.Q.z3()) {
                j9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
                e1 v22 = this.Q.v2(textSelectionHelper3.f30889p0);
                int i15 = textSelectionHelper3.f30891r0;
                int i16 = textSelectionHelper3.f30894u0;
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
                    w1 w1Var5 = (w1) obj2;
                    int intValue = ((Integer) w1Var5.getTag()).intValue();
                    if (v22 != null && max < max2 && (intValue & v22.c(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    w1Var5.setSelected(z15);
                }
                w1 w1Var6 = this.f21948r0;
                if (w1Var6 != null) {
                    if (v22 != null && max < max2 && b6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    w1Var6.setSelected(z14);
                }
                w1 w1Var7 = this.f21951t0;
                if (w1Var7 != null) {
                    if (v22 != null && max < max2 && b6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    w1Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.Q.o2());
            } else {
                int i18 = textSelectionHelper.f30889p0;
                int i19 = textSelectionHelper.f30892s0;
                int i20 = textSelectionHelper.f30891r0;
                int i21 = textSelectionHelper.f30894u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.f22382x4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i22 = 0;
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    w1 w1Var8 = (w1) arrayList.get(i22);
                    int intValue2 = ((Integer) w1Var8.getTag()).intValue();
                    if (z10 && this.Q.M3(intValue2, i18, i20, i19, i21)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    w1Var8.setSelected(z13);
                    i22 = i23;
                }
                y0(!this.Q.L3());
                w1 w1Var9 = this.f21948r0;
                if (w1Var9 != null) {
                    if (z10) {
                        Editable K4 = this.Q.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = b6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            w1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    w1Var9.setSelected(z12);
                }
                w1 w1Var10 = this.f21951t0;
                if (w1Var10 != null) {
                    if (z10) {
                        Editable K42 = this.Q.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = b6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (g10) {
                            z11 = true;
                            w1Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    w1Var10.setSelected(z11);
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
        e2 e2Var = this.Q.R3;
        if (e2Var != null && !e2Var.f22060c.isEmpty()) {
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
        if (!np.u1(this.currentAccount).B4() && !k10.i(this.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.O;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((w1) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        float f10;
        if (this.f21960z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.f21960z0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f21960z0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        o10.n(animate, f10, 150L);
    }

    public final void H0() {
        v1 v1Var = this.f21960z0;
        if (v1Var == null) {
            return;
        }
        v1Var.setLocked(r0());
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
        this.P = new s1(this, context);
        setHasOwnBackground(true);
        this.P.setFocusable(true);
        this.P.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.P.setDefaultFocusHighlightEnabled(false);
        }
        this.F0 = np.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = np.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ki.u1 u1Var = new ki.u1(this, 1);
        this.I0 = u1Var;
        this.P.f34564r.add(u1Var);
        s3 s3Var = new s3(context, this.currentAccount, getResourceProvider(), new hi.u5(this, 20));
        this.Q = s3Var;
        s3Var.setFileRefParentObject(this.f21947r);
        this.P.addView(this.Q, na.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), na.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f21927b;
        if (richMessage != null) {
            s3 s3Var2 = this.Q;
            ArrayList arrayList2 = s3Var2.f22373t3;
            s3Var2.f22371s3 = richMessage;
            s3.Z2(arrayList2, richMessage.blocks, s3Var2.f22375u3);
            s3Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                s3Var2.y4((a) arrayList2.get(i12));
            }
            s3Var2.f35742g3.O(false);
        } else {
            String str = this.f21934f;
            if (str != null) {
                s3 s3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f21942n;
                HashMap hashMap = s3Var3.f22375u3;
                ArrayList arrayList3 = s3Var3.f22373t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    s3.Z2(arrayList3, z4.b(charSequence), hashMap);
                }
                arrayList3.addAll(s3Var3.z4(a4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    s3.Z2(arrayList3, z4.b(charSequence2), hashMap);
                }
                s3Var3.Y3();
                s3Var3.f35742g3.O(false);
            } else {
                CharSequence charSequence3 = this.f21924a;
                if (charSequence3 != null) {
                    this.Q.setInitialText(charSequence3);
                }
            }
        }
        e2 e2Var = this.Q.R3;
        if (e2Var != null) {
            e2Var.j();
        }
        View view = new View(context);
        this.R = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = m6.f29347d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), m6.r1(0.0f, getThemedColor(i13))}));
        this.P.addView(this.R, na.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{m6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.P.addView(this.S, na.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, na.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231240);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = m6.f29439i6;
        imageView3.setBackground(new z1(m6.b0(themedColor, m6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i15 = m6.G6;
        org.telegram.ui.ActionBar.h6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView4, i15, resourceProvider, mode);
        sa.a(this.U);
        this.U.setContentDescription(hd.N0(2131754878, null));
        this.U.setOnClickListener(new g1(this, 1));
        this.T.addView(this.U, na.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.T.addView(this.V, na.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231599);
        this.W.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.Q(this.W, m6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
        org.telegram.ui.ActionBar.t6.s(this.W, i15, getResourceProvider(), mode);
        sa.a(this.W);
        this.W.setContentDescription(hd.N0(2131743644, null));
        this.W.setOnClickListener(new g1(this, 2));
        this.V.addView(this.W, na.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231582);
        this.X.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.Q(this.X, m6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
        org.telegram.ui.ActionBar.t6.s(this.X, i15, getResourceProvider(), mode);
        sa.a(this.X);
        this.X.setContentDescription(hd.N0(2131746146, null));
        this.X.setOnClickListener(new g1(this, 3));
        this.V.addView(this.X, na.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, na.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f21925a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f21925a0.setClipToPadding(false);
        this.Z.addView(this.f21925a0, na.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f21928b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f21928b0.setClipChildren(false);
        this.f21928b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f21925a0.addView(this.f21928b0, na.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.f21925a0.addView(frameLayout4, na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f21931d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        this.f21931d0.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(this.f21931d0, i15, getResourceProvider(), mode);
        this.f21931d0.setBackground(new z1(m6.b0(getThemedColor(i13), m6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f21928b0.addView(this.f21931d0, na.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        sa.a(this.f21931d0);
        this.f21931d0.setContentDescription(hd.N0(2131755006, null));
        this.f21931d0.setOnClickListener(new g1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, na.e(-2, 44, 81));
        t1 t1Var = new t1(context, 0);
        this.f21933e0 = t1Var;
        t1Var.setClipToOutline(true);
        this.f21933e0.setOutlineProvider(new bg.q0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f21935f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f21935f0.setOrientation(0);
        this.f21933e0.addView(this.f21935f0);
        frameLayout6.addView(this.f21933e0, na.c(-1.0f, -1));
        ah ahVar = new ah(context, 24);
        this.f21930c0 = ahVar;
        ahVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.ActionBar.t6.s(this.f21930c0, i15, getResourceProvider(), mode);
        org.telegram.ui.ActionBar.t6.Q(this.f21930c0, m6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
        this.f21930c0.j(yg.f42410e, false);
        this.f21935f0.addView(this.f21930c0, na.r(38, 38, 16));
        sa.a(this.f21930c0);
        this.f21930c0.setContentDescription(hd.N0(2131754884, null));
        this.f21930c0.setOnClickListener(new g1(this, 5));
        h0(2131231596, 1, false).setOnClickListener(new h1(0, this, context));
        h0(2131231568, 2, true).setOnClickListener(new g1(this, 6));
        h0(2131231585, 4, true).setOnClickListener(new g1(this, 7));
        h0(2131231570, 7, true).setOnClickListener(new g1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f21937h0 = imageView8;
        imageView8.setImageResource(2131232491);
        this.f21937h0.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(this.f21937h0, i15, getResourceProvider(), mode);
        org.telegram.ui.ActionBar.t6.Q(this.f21937h0, m6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), getResourceProvider());
        this.f21935f0.addView(this.f21937h0, na.t(38, 38, 16, 2, 0, 0, 0));
        sa.a(this.f21937h0);
        this.f21937h0.setContentDescription(hd.N0(2131754921, null));
        this.f21937h0.setOnClickListener(new g1(this, 9));
        this.f21928b0.addView(frameLayout5, na.l(1.0f, 0, 44));
        d61 d61Var = new d61(6, context, this);
        this.f21938i0 = d61Var;
        d61Var.setOrientation(0);
        this.f21938i0.setClipToPadding(false);
        this.f21938i0.setClipChildren(false);
        this.f21938i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f21938i0, na.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f21955w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f21955w0.setClipToPadding(false);
        this.f21955w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f21955w0, na.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f21957x0 = imageView9;
        imageView9.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        oh0 animatedDrawable = this.f21957x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f21957x0.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(this.f21957x0, i15, getResourceProvider(), mode);
        this.f21957x0.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f21955w0.addView(this.f21957x0, na.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f21938i0.addView(frameLayout8, na.c(44.0f, -2));
        u1 u1Var2 = new u1(this, context);
        this.f21940k0 = u1Var2;
        u1Var2.setHorizontalScrollBarEnabled(false);
        this.f21940k0.setClipToOutline(true);
        this.f21940k0.setOutlineProvider(new bg.q0(5));
        frameLayout8.addView(this.f21940k0, na.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f21939j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f21939j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f21940k0.addView(this.f21939j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231552, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231583, 16384, true);
        i0(context, 2131231584, 32768, true);
        w1 w1Var = new w1(2131231581, context, getResourceProvider());
        this.f21953v0 = w1Var;
        w1Var.setContentDescription(hd.N0(2131746244, null));
        this.f21953v0.setOnClickListener(new g1(this, 11));
        LinearLayout linearLayout5 = this.f21939j0;
        w1 w1Var2 = this.f21953v0;
        if (linearLayout5.getChildCount() > 0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        linearLayout5.addView(w1Var2, na.t(38, 38, 16, i7, 0, 0, 0));
        w1 w1Var3 = new w1(2131231549, context, getResourceProvider());
        this.f21950s0 = w1Var3;
        w1Var3.setContentDescription(hd.N0(2131745815, null));
        this.f21950s0.setOnClickListener(new g1(this, 12));
        LinearLayout linearLayout6 = this.f21939j0;
        w1 w1Var4 = this.f21950s0;
        if (linearLayout6.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout6.addView(w1Var4, na.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f21944o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f21944o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f21944o0.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f21938i0.addView(this.f21944o0, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        w1 w1Var5 = new w1(2131231746, context, getResourceProvider());
        this.f21948r0 = w1Var5;
        w1Var5.setContentDescription(hd.N0(2131751732, null));
        this.f21948r0.setOnClickListener(new g1(this, 13));
        this.f21944o0.addView(this.f21948r0, na.r(38, 38, 16));
        w1 w1Var6 = new w1(2131232079, context, getResourceProvider());
        this.f21951t0 = w1Var6;
        w1Var6.setContentDescription(hd.N0(2131754861, null));
        this.f21951t0.setOnClickListener(new g1(this, 14));
        this.f21944o0.addView(this.f21951t0, na.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f21945p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f21945p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f21945p0.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f21938i0.addView(this.f21945p0, na.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        w1 w1Var7 = new w1(2131231570, context, getResourceProvider());
        this.f21952u0 = w1Var7;
        w1Var7.d();
        arrayList.add(this.f21952u0);
        this.f21952u0.setContentDescription(hd.N0(2131754863, null));
        this.f21952u0.setOnClickListener(new g1(this, 15));
        this.f21945p0.addView(this.f21952u0, na.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f21943n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f21943n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f21943n0.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f21938i0.addView(this.f21943n0, 0, na.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        w1 w1Var8 = new w1(0, context, getResourceProvider());
        this.f21946q0 = w1Var8;
        w1Var8.setImageDrawable(new org.telegram.ui.ActionBar.v2(context));
        this.f21946q0.setContentDescription(hd.N0(2131755006, null));
        this.f21946q0.setOnClickListener(new g1(this, 16));
        this.f21943n0.addView(this.f21946q0, na.r(38, 38, 16));
        if (this.f21947r != null) {
            i11 = 2131231502;
        } else if (q0()) {
            i11 = 2131231512;
        } else {
            i11 = 2131232696;
        }
        v1 v1Var = new v1(this, context, i11, getResourceProvider());
        this.f21960z0 = v1Var;
        v1Var.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(m6.Pe))));
        sa.a(this.f21960z0);
        this.f21928b0.addView(this.f21960z0, na.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f21960z0.setContentDescription(hd.N0(2131745444, null));
        this.f21960z0.setOnClickListener(new g1(this, 0));
        this.f21960z0.setOnLongClickListener(new hi.o4(this, 4));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.f24004m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        F0();
        if (this.f21932e) {
            this.Q.F2();
            this.f21932e = false;
        }
        s1 s1Var = this.P;
        this.fragmentView = s1Var;
        return s1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25291i5) {
            H0();
            F0();
        }
    }

    public final w1 h0(int i7, int i10, boolean z10) {
        int i11;
        w1 w1Var = new w1(i7, this.f21935f0.getContext(), getResourceProvider());
        if (z10) {
            w1Var.d();
            this.O.add(w1Var);
        }
        w1Var.setTag(Integer.valueOf(i10));
        w1Var.setContentDescription(l0(i10));
        this.f21936g0.add(w1Var);
        LinearLayout linearLayout = this.f21935f0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(w1Var, na.t(38, 38, 16, i11, 0, 0, 0));
        return w1Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i7, int i10, boolean z10) {
        int i11;
        w1 w1Var = new w1(i7, context, getResourceProvider());
        if (z10) {
            w1Var.d();
            this.O.add(w1Var);
        }
        w1Var.setTag(Integer.valueOf(i10));
        w1Var.setContentDescription(n0(i10));
        w1Var.setOnClickListener(new ci.q(this, i10, 7));
        this.m0.add(w1Var);
        LinearLayout linearLayout = this.f21939j0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(w1Var, na.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        s3 s3Var = this.Q;
        if (s3Var != null && s3Var.f22377v3.x()) {
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
        ofFloat.addUpdateListener(new i1(this, 0));
        this.Q0.setInterpolator(nr.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        ty tyVar = this.B0;
        if (tyVar != null && (layoutParams = (FrameLayout.LayoutParams) tyVar.getLayoutParams()) != null) {
            int o02 = o0();
            s1 s1Var = this.P;
            if (s1Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((s1Var.getMeasuredHeight() - this.P.getPaddingTop()) - org.telegram.messenger.g0.L(240.0f)) - this.U0);
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
        ty tyVar = this.B0;
        if (tyVar != null && (layoutParams = (FrameLayout.LayoutParams) tyVar.getLayoutParams()) != null) {
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
        s3 s3Var = this.Q;
        int i11 = this.U0;
        int i12 = this.V0;
        int i13 = this.E0;
        s3Var.W3 = i11;
        s3Var.X3 = i12;
        s3Var.Y3 = i13;
        int i14 = -max;
        this.Z.setTranslationY(i14);
        this.S.setTranslationY(i14 + this.U0);
    }

    public final int o0() {
        int i7;
        Point point = org.telegram.messenger.g0.f24010q;
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
                s3 s3Var = this.Q;
                Uri data = intent.getData();
                if (data == null) {
                    s3Var.getClass();
                } else if (s3Var.getContext() != null) {
                    Utilities.f22774e.c(new kg.i0(29, s3Var, data));
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
                ty tyVar = this.B0;
                if (tyVar != null) {
                    tyVar.t(false);
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
        if (!org.telegram.messenger.g0.Q1() && this.f21949s != null && this.f21954w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            jh.f fVar = this.f21949s;
            this.f21958y = fVar.f17772n;
            fVar.f17770e = false;
            fVar.invalidate();
            this.f21954w.setAlpha(0.0f);
            this.f21954w.f32664q2.setVisibility(4);
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
            ofFloat.addUpdateListener(new i1(this, 1));
            ofFloat.addListener(new ah.l(11, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.T;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.T;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.f21925a0, property, 0.0f), ObjectAnimator.ofFloat(this.f21925a0, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.T;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.f21925a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f21925a0, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(nr.h);
            this.P.post(new iq0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        ls.f(this.currentAccount).c(this, ls.f25291i5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ki.u1 u1Var;
        ls.f(this.currentAccount).n(this, ls.f25291i5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        m1 m1Var = this.O0;
        if (m1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.g3(m1Var);
        }
        eg0 eg0Var = this.P0;
        if (eg0Var != null) {
            eg0Var.i();
            this.P0 = null;
        }
        s3 s3Var = this.Q;
        if (s3Var != null) {
            s3Var.J2();
        }
        ga.d dVar = this.A0;
        if (dVar != null) {
            dVar.c();
        }
        super.onFragmentDestroy();
        ty tyVar = this.B0;
        if (tyVar != null) {
            tyVar.B();
        }
        s1 s1Var = this.P;
        if (s1Var != null && (u1Var = this.I0) != null) {
            s1Var.f34564r.remove(u1Var);
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
        a70 a70Var;
        i0.b f10 = l1Var.f56268a.f(3);
        int i7 = l1Var.f56268a.f(8).d;
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
            Point point = org.telegram.messenger.g0.f24010q;
            if (point.x > point.y) {
                this.G0 = i10;
                np.f1().edit().putInt("kbd_height_land3", this.G0).commit();
            } else {
                this.F0 = i10;
                np.f1().edit().putInt("kbd_height", this.F0).commit();
            }
        }
        if (this.H0 && !z11 && this.C0 && !this.D0) {
            p0(false);
        }
        if (!this.H0 && z11 && (a70Var = this.f21959y0) != null) {
            a70Var.v();
            this.f21959y0 = null;
        }
        onInsets(f10.f15883a, f10.f15884b, f10.f15885c, f10.d);
        return r0.l1.f56267b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = m6.f29347d6;
            int themedColor = getThemedColor(i7);
            int i10 = m6.f29439i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = m6.Pe;
            int themedColor3 = getThemedColor(i11);
            if (!this.f21926a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.f21926a1 = true;
                this.X0 = themedColor;
                this.Y0 = themedColor2;
                this.Z0 = themedColor3;
                View view = this.R;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i7), m6.r1(0.0f, getThemedColor(i7))}));
                }
                View view2 = this.S;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7)}));
                }
                ImageView imageView = this.U;
                if (imageView != null) {
                    imageView.setBackground(new z1(m6.b0(getThemedColor(i7), m6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                ImageView imageView2 = this.f21931d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new z1(m6.b0(getThemedColor(i7), m6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                rh0 rh0Var = this.f21957x0;
                if (rh0Var != null) {
                    rh0Var.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout2 = this.f21944o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout3 = this.f21945p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout4 = this.f21943n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                v1 v1Var = this.f21960z0;
                if (v1Var != null) {
                    v1Var.setBackground(new z1(m6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        s3 s3Var;
        int i7;
        s3 s3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i7 = this.f21929c) >= 0 && (s3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f21929c = -1;
            if (!s3Var2.c2(i7, i10)) {
                s3Var2.post(new m2(s3Var2, i7, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f21927b != null || this.f21934f != null) && (s3Var = this.Q) != null && !s3Var.d3()) {
                s3Var.post(new b(s3Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ty tyVar = this.B0;
            if (tyVar != null) {
                tyVar.t(false);
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
        ty tyVar2 = this.B0;
        if (tyVar2 != null) {
            tyVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        ah ahVar = this.f21930c0;
        if (ahVar != null) {
            ahVar.j(yg.f42410e, z10);
        }
    }

    public final boolean q0() {
        bn bnVar;
        if (this.f21947r == null && (bnVar = this.K) != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!np.u1(this.currentAccount).B4() && !k10.i(this.currentAccount).q()) {
            s3 s3Var = this.Q;
            if (z4.d(s3Var.f22373t3, s3Var.f22375u3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s0() {
        j3 k22 = this.Q.k2();
        if (k22 != null) {
            TL_iv.RichMessage a10 = k22.a();
            if (a10.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(getParentActivity(), getResourceProvider());
            n0Var.w1(a10);
            n0Var.f37642g2 = new t6(k22, 15);
            n0Var.show();
        }
    }

    public final void t0(int i7, int i10) {
        s3 s3Var = this.Q;
        s3Var.f22359k4 = s3Var.T2();
        ui uiVar = new ui(getParentActivity(), this, false, false, true, getResourceProvider());
        uiVar.X3 = new p1(this, uiVar);
        uiVar.f40363e2.setIncludeVideosInGallery(true);
        uiVar.f40363e2.i0();
        uiVar.z1(1, true);
        uiVar.W0(i7);
        uiVar.f40419u4 = new o1(this, uiVar);
        uiVar.T1 = new o1(this, uiVar);
        uiVar.S1 = new q1(this, uiVar);
        uiVar.f1();
        if (i10 != 0) {
            uiVar.p1(i10);
        }
        uiVar.A0(true);
        uiVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.K == null || this.f21947r != null || !this.Q.u2()) {
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
        rj rjVar = this.K.f45903a0;
        if (m22 != null && !this.N) {
            s3 s3Var = this.Q;
            if (s3Var.n3() && !z4.d(s3Var.f22373t3, s3Var.f22375u3) && rjVar != null) {
                SpannableStringBuilder g10 = z4.g(this.Q.f22373t3);
                bn bnVar = rjVar.F3;
                if (rjVar.F0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                j6.m(spannableStringBuilder, rjVar.F0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class);
                if (y5VarArr != null) {
                    for (org.telegram.ui.Components.y5 y5Var : y5VarArr) {
                        y5Var.applyFontMetrics(rjVar.F0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.p5.f());
                    }
                }
                jh0.a(spannableStringBuilder);
                if (bnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    si.d0(rjVar.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), charSequenceArr[0], si.d0(rjVar.R).Y(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                rjVar.setRichDraftPreview(null);
                if (rjVar.F0.getText() != null) {
                    rjVar.F0.getText().clear();
                }
                rjVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        si mediaDataController = getMediaDataController();
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
            s3 s3Var = this.Q;
            Objects.requireNonNull(s3Var);
            u0(parentActivity, new b(s3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.c5.J(getParentActivity(), this.K.a(), new h9.g1(this, 18), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i7, final int i10, final boolean z10) {
        rj rjVar;
        mg mgVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            s3 s3Var = this.Q;
            Objects.requireNonNull(s3Var);
            u0(parentActivity, new b(s3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (this.K != null && this.Q.n3() && !this.Q.p3()) {
            if (!this.Q.P3()) {
                G0();
            } else if (!np.u1(this.currentAccount).B4()) {
                rj rjVar2 = this.K.f45903a0;
                if (rjVar2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    rjVar2.u1(z4.g(this.Q.f22373t3), z10, i7, i10);
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
                final ArrayList a10 = y4.a(this.currentAccount, c32);
                final long a11 = this.K.a();
                bn bnVar = this.K;
                final gj gjVar = bnVar.F5;
                final gj gjVar2 = bnVar.f46067m4;
                final rm rmVar = bnVar.D5;
                final long j92 = bnVar.j9();
                final cw Y8 = this.K.Y8();
                final gj gjVar3 = this.f21947r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        a2.d0(a2.this, gjVar3, c32, E2, B2, a10, a11, gjVar, gjVar2, rmVar, z10, i7, i10, Y8, j92);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (gjVar3 == null && (rjVar = this.K.f45903a0) != null && (mgVar = rjVar.P3) != null) {
                    mgVar.H(null, z10, i7, i10, 0L);
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
            w1 w1Var = (w1) obj;
            if (((Integer) w1Var.getTag()).intValue() == 1) {
                w1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        w1 w1Var = this.f21948r0;
        if (w1Var != null) {
            w1Var.setEnabled(z10);
        }
        w1 w1Var2 = this.f21950s0;
        if (w1Var2 != null) {
            w1Var2.setEnabled(z11);
        }
        w1 w1Var3 = this.f21951t0;
        if (w1Var3 != null) {
            w1Var3.setEnabled(z10);
        }
        w1 w1Var4 = this.f21952u0;
        if (w1Var4 != null) {
            w1Var4.setEnabled(z10);
        }
    }

    public a2(String str) {
        super(null);
        this.f21929c = -1;
        this.d = -1;
        this.f21956x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f21936g0 = new ArrayList();
        this.f21941l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f21934f = str;
    }

    public a2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f21929c = -1;
        this.d = -1;
        this.f21956x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f21936g0 = new ArrayList();
        this.f21941l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f21927b = richMessage;
    }
}
