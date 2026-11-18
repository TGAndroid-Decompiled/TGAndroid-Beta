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
import c8.ma;
import c8.ra;
import di.t9;
import hi.t6;
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
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yg;
import org.telegram.ui.bn;
import org.telegram.ui.d61;
import org.telegram.ui.eg0;
import org.telegram.ui.hq0;
import org.telegram.ui.rj;
import org.telegram.ui.rm;
public final class z1 extends org.telegram.ui.ActionBar.h2 implements fs {
    public ga.d A0;
    public ry B0;
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
    public ki.v1 I0;
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
    public l1 O0;
    public r1 P;
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
    public final CharSequence f22514a;
    public FrameLayout f22515a0;
    public boolean f22516a1;
    public final TL_iv.RichMessage f22517b;
    public LinearLayout f22518b0;
    public int f22519c;
    public yg f22520c0;
    public int d;
    public ImageView f22521d0;
    public boolean f22522e;
    public s1 f22523e0;
    public final String f22524f;
    public LinearLayout f22525f0;
    public final ArrayList f22526g0;
    public CharSequence h;
    public ImageView f22527h0;
    public d61 f22528i0;
    public LinearLayout f22529j0;
    public t1 f22530k0;
    public int f22531l0;
    public final ArrayList m0;
    public CharSequence f22532n;
    public LinearLayout f22533n0;
    public LinearLayout f22534o0;
    public LinearLayout f22535p0;
    public v1 f22536q0;
    public fj f22537r;
    public v1 f22538r0;
    public jh.f f22539s;
    public v1 f22540s0;
    public v1 f22541t0;
    public v1 f22542u0;
    public v1 f22543v0;
    public rj f22544w;
    public FrameLayout f22545w0;
    public final Rect f22546x;
    public ph0 f22547x0;
    public fh.g f22548y;
    public y60 f22549y0;
    public u1 f22550z0;

    public z1(Editable editable) {
        super(null);
        this.f22519c = -1;
        this.d = -1;
        this.f22546x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22526g0 = new ArrayList();
        this.f22531l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22514a = editable;
    }

    public static void Z(z1 z1Var) {
        g3 g3Var = z1Var.Q.f22349v3;
        if (g3Var != null && g3Var.x()) {
            z1Var.s0();
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        new u(z1Var.currentAccount, parentActivity, new t6(z1Var, 17), z1Var.getResourceProvider()).show();
    }

    public static void a0(z1 z1Var) {
        if (!j10.i(z1Var.currentAccount).q()) {
            z1Var.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) z1Var, 43, true));
        }
    }

    public static boolean b0(z1 z1Var, View view) {
        int i7;
        bn bnVar = z1Var.K;
        if (bnVar != null && z1Var.f22537r == null && !bnVar.c() && z1Var.Q.n3() && !z1Var.Q.p3()) {
            if (!z1Var.Q.P3()) {
                z1Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = z1Var.Q.c3();
            if (!c32.isEmpty()) {
                eg0 eg0Var = z1Var.P0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    z1Var.P0 = null;
                }
                eg0 eg0Var2 = new eg0(z1Var.getParentActivity(), z1Var.getResourceProvider());
                z1Var.P0 = eg0Var2;
                eg0Var2.setOnDismissListener(new t9(z1Var, 8));
                long a10 = z1Var.K.a();
                fj fjVar = z1Var.K.F5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28426id = 0;
                tL_message.out = true;
                tL_message.peer_id = mp.u1(z1Var.currentAccount).B1(a10);
                tL_message.from_id = mp.u1(z1Var.currentAccount).B1(j10.i(z1Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = z1Var.Q.E2();
                tL_message.rich_message.documents = z1Var.Q.B2();
                if (fjVar != null && !fjVar.f23987p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = fjVar.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                fj fjVar2 = new fj(z1Var.currentAccount, tL_message, false, false);
                if (fjVar != null && !fjVar.f23987p) {
                    fjVar2.C = fjVar;
                }
                fjVar2.B0 = true;
                fjVar2.W2 = Boolean.TRUE;
                fjVar2.n0(null);
                fjVar2.f24016w1 = true;
                z1Var.P0.r(org.telegram.messenger.f3.i(fjVar2));
                z1Var.f22550z0.setScaleX(1.0f);
                z1Var.f22550z0.setScaleY(1.0f);
                sg s5 = z1Var.P0.s(z1Var.f22550z0, true, new g1(z1Var, 10));
                if (s5 != null) {
                    s5.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), z1Var.getThemedColor(n6.Fi))));
                    eg0 eg0Var3 = z1Var.P0;
                    int L = org.telegram.messenger.g0.L(44.0f);
                    eg0Var3.f47243p0 = true;
                    eg0Var3.Y = L;
                }
                y60 I = y60.I(z1Var, z1Var.f22550z0);
                boolean C = o10.C(z1Var.K.j());
                if (z1Var.K.S6()) {
                    if (C) {
                        i7 = 2131745319;
                    } else {
                        i7 = 2131745664;
                    }
                    I.c(2131232079, gd.M0(i7, null), new bi.y3(z1Var, a10, 16), false);
                    if (!C && a10 > 0) {
                        I.c(2131232266, gd.M0(2131745391, null), new f1(z1Var, 5), false);
                    }
                }
                if (!C) {
                    I.c(2131231509, gd.M0(2131745388, null), new f1(z1Var, 6), false);
                }
                I.Z();
                z1Var.P0.q(I);
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
        y60 y60Var = z1Var.f22549y0;
        if (y60Var != null) {
            y60Var.v();
            z1Var.f22549y0 = null;
        }
        if (!mp.u1(z1Var.currentAccount).B4() && !j10.i(z1Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = z1Var.Q.T2();
        final y60 J = y60.J(z1Var, view);
        J.T = true;
        y60 K = J.K();
        K.c(2131231240, gd.M0(2131753754, null), new bi.c6(J, 8), false);
        K.k();
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        K.j(z11, 2131231559, null, gd.M0(2131754028, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0 + 2);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        K.j(z12, 2131231560, null, gd.M0(2131754027, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0 + 1);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        K.j(z13, 2131231561, null, gd.M0(2131754026, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        K.j(z14, 2131231562, null, gd.M0(2131754025, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0 - 1);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        K.j(z15, 2131231563, null, gd.M0(2131754024, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0 - 2);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        K.j(z16, 2131231564, null, gd.M0(2131754023, null), new Runnable(z1Var) {
            public final z1 f22131b;

            {
                this.f22131b = z1Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading1());
                        J.v();
                        return;
                    case 1:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading2());
                        J.v();
                        return;
                    case 2:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading3());
                        J.v();
                        return;
                    case 3:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading4());
                        J.v();
                        return;
                    case 4:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading5());
                        J.v();
                        return;
                    default:
                        this.f22131b.Q.Y4(T2, new TL_iv.pageBlockHeading6());
                        J.v();
                        return;
                }
            }
        });
        K.z().f30303a.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
        K.z().f30303a.setTextSize(1, bz.W0 - 3);
        if (T2 != null && s3.F3(T2.f21910b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        x1 x1Var = new x1(context, 2131231558);
        x1Var.a(z10);
        int i7 = n6.G8;
        x1Var.d = i7;
        J.j(z17, 0, x1Var, gd.M0(2131754029, null), new bi.v5(J, K, 3));
        J.z().f30303a.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.z0 z23 = J.z();
        float f15 = 9.0f;
        if (gd.f24216a0) {
            f10 = 18.0f;
        } else {
            f10 = 9.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (gd.f24216a0) {
            f11 = 9.0f;
        } else {
            f11 = 18.0f;
        }
        z23.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        J.j(z18, 2131231597, null, gd.M0(2131753986, null), new j1(z1Var, T2, 3));
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        J.j(z19, 2131231581, null, gd.M0(2131753994, null), new j1(z1Var, T2, 4));
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        x1 x1Var2 = new x1(context, 2131231580);
        x1Var2.a(z10);
        x1Var2.d = i7;
        J.j(z20, 0, x1Var2, gd.M0(2131753995, null), new j1(z1Var, T2, 0));
        org.telegram.ui.ActionBar.z0 z24 = J.z();
        if (gd.f24216a0) {
            f12 = 18.0f;
        } else {
            f12 = 9.0f;
        }
        int L2 = org.telegram.messenger.g0.L(f12);
        if (gd.f24216a0) {
            f13 = 9.0f;
        } else {
            f13 = 18.0f;
        }
        z24.setPadding(L2, 0, org.telegram.messenger.g0.L(f13), 0);
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        J.j(z21, 2131231552, null, gd.M0(2131754053, null), new j1(z1Var, T2, 1));
        if (T2 != null && (T2.f21910b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        x1 x1Var3 = new x1(context, 2131231555);
        x1Var3.a(z10);
        x1Var3.d = i7;
        J.j(z22, 0, x1Var3, gd.M0(2131754030, null), new j1(z1Var, T2, 2));
        org.telegram.ui.ActionBar.z0 z25 = J.z();
        if (gd.f24216a0) {
            f14 = 18.0f;
        } else {
            f14 = 9.0f;
        }
        int L3 = org.telegram.messenger.g0.L(f14);
        if (!gd.f24216a0) {
            f15 = 18.0f;
        }
        z25.setPadding(L3, 0, org.telegram.messenger.g0.L(f15), 0);
        J.a0();
        z1Var.f22549y0 = J;
    }

    public static void d0(z1 z1Var, fj fjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, fj fjVar2, fj fjVar3, rm rmVar, boolean z10, int i7, int i10, bw bwVar, long j10) {
        if (fjVar != null) {
            org.telegram.messenger.c a10 = org.telegram.messenger.c.a(z1Var.currentAccount);
            bn bnVar = z1Var.K;
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
            zy.C(a10.f23221a).v(fjVar, richMessage, arrayList4, bnVar, false);
            return;
        }
        zy.R(org.telegram.messenger.c.a(z1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j3, fjVar2, fjVar3, rmVar, z10, i7, i10, bwVar, 0L, j10, 0L);
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
                z1Var.f22547x0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(lr.h).start();
            } else {
                z1Var.f22547x0.animate().cancel();
                z1Var.f22547x0.setScaleX(f10);
                z1Var.f22547x0.setScaleY(f10);
            }
            ph0 ph0Var = z1Var.f22547x0;
            if (z10) {
                i7 = n6.f29637q7;
            } else {
                i7 = n6.G6;
            }
            u6.s(ph0Var, i7, z1Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            mh0 animatedDrawable = z1Var.f22547x0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f37482b0 > 34) {
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
                        return gd.M0(2131754869, null);
                    }
                    return gd.M0(2131754864, null);
                }
                return gd.M0(2131754855, null);
            }
            return gd.M0(2131754860, null);
        }
        return gd.M0(2131754854, null);
    }

    public static String n0(int i7) {
        if (i7 == 1) {
            return gd.M0(2131753669, null);
        }
        if (i7 == 2) {
            return gd.M0(2131748895, null);
        }
        if (i7 == 16) {
            return gd.M0(2131743652, null);
        }
        if (i7 == 8) {
            return gd.M0(2131744202, null);
        }
        if (i7 == 256) {
            return gd.M0(2131745027, null);
        }
        if (i7 == 4) {
            return gd.M0(2131748158, null);
        }
        if (i7 == 65536) {
            return gd.M0(2131749111, null);
        }
        if (i7 == 16384) {
            return gd.M0(2131744190, null);
        }
        if (i7 != 32768) {
            return null;
        }
        return gd.M0(2131744092, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, i6 i6Var) {
        final org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        j3.O = g10;
        ImageView e10 = n10.e(context, 2131231603);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i7 = n6.Fi;
        ShapeDrawable L2 = n6.L(L, n6.w0(i7, i6Var));
        q6 M = u6.M(i7);
        e10.setBackground(L2);
        u6.j(e10, L2, M, null, i6Var);
        g10.addView(e10, ma.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131754039, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i10 = n6.G6;
        u6.U(textView, i10, i6Var);
        TextView f10 = n10.f(g10, textView, ma.t(-1, -2, 49, 25, 16, 25, 0), context);
        f10.setText(org.telegram.messenger.g0.W2(gd.M0(2131754040, null)));
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        u6.U(f10, i10, i6Var);
        g10.addView(f10, ma.t(-1, -2, 49, 25, 11, 25, 0));
        hi.d g11 = n10.g(24, context, i6Var, true);
        g11.setText(gd.M0(2131754041, null));
        g10.addView(g11, ma.t(-1, 48, 49, 14, 31, 14, 0));
        hi.d g12 = n10.g(24, context, i6Var, false);
        g12.setText(gd.M0(2131754042, null));
        g10.addView(g12, ma.t(-1, 48, 49, 14, 2, 14, 6));
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
        jh.f fVar = this.f22539s;
        int[] iArr = this.G;
        fVar.getLocationInWindow(iArr);
        if (this.E == null) {
            this.E = new RectF();
        }
        RectF rectF = new RectF(this.f22548y.getBounds());
        this.E = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.f22544w.getLocationInWindow(this.H);
        if (this.I == null) {
            this.I = new int[2];
        }
        this.I[0] = this.Q.getPaddingLeft();
        this.I[1] = this.Q.getPaddingTop();
        int[] iArr2 = this.I;
        iArr2[0] = (int) (iArr2[0] - (this.f22544w.F0.getX() - org.telegram.messenger.g0.L(16.0f)));
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
            this.f22518b0.setVisibility(0);
            ViewPropertyAnimator animate = this.f22518b0.animate();
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
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).withEndAction(new f1(this, 1)).start();
            this.f22528i0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f22528i0.animate();
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
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(lrVar).withEndAction(new f1(this, 2)).start();
            this.f22545w0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f22545w0.animate();
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
            scaleX3.scaleY(f25).setDuration(420L).setInterpolator(lrVar).withEndAction(new f1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f22518b0;
        if (i7 == 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f22518b0;
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        linearLayout2.setAlpha(f10);
        LinearLayout linearLayout3 = this.f22518b0;
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout3.setScaleX(f11);
        LinearLayout linearLayout4 = this.f22518b0;
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        linearLayout4.setScaleY(f12);
        LinearLayout linearLayout5 = this.f22518b0;
        if (i7 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        d61 d61Var = this.f22528i0;
        if (i7 == 1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d61Var.setVisibility(i11);
        d61 d61Var2 = this.f22528i0;
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        d61Var2.setAlpha(f13);
        d61 d61Var3 = this.f22528i0;
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        d61Var3.setScaleX(f14);
        d61 d61Var4 = this.f22528i0;
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        d61Var4.setScaleY(f15);
        d61 d61Var5 = this.f22528i0;
        if (i7 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(30.0f);
        }
        d61Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f22545w0;
        if (i7 != 2) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        FrameLayout frameLayout2 = this.f22545w0;
        if (i7 == 2) {
            f24 = 1.0f;
        }
        frameLayout2.setAlpha(f24);
        FrameLayout frameLayout3 = this.f22545w0;
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.8f;
        }
        frameLayout3.setScaleX(f16);
        FrameLayout frameLayout4 = this.f22545w0;
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
        i9 textSelectionHelper = this.Q.getTextSelectionHelper();
        ArrayList arrayList = this.m0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            v1 v1Var = this.f22543v0;
            boolean z19 = false;
            if (v1Var != null) {
                s3 s3Var = this.Q;
                int[] E4 = s3Var.E4();
                if (E4 != null && s3Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                v1Var.setSelected(z18);
            }
            if (this.Q.O3()) {
                i9 textSelectionHelper2 = this.Q.getTextSelectionHelper();
                int i7 = textSelectionHelper2.f30828p0;
                int i10 = textSelectionHelper2.f30829q0;
                int i11 = textSelectionHelper2.f30832t0;
                int i12 = textSelectionHelper2.f30830r0;
                int i13 = textSelectionHelper2.f30833u0;
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
                v1 v1Var3 = this.f22538r0;
                if (v1Var3 != null) {
                    if (e1Var != null && max4 < max3 && b6.h(e1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    v1Var3.setSelected(z17);
                }
                v1 v1Var4 = this.f22541t0;
                if (v1Var4 != null) {
                    if (e1Var != null && max4 < max3 && b6.g(e1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    v1Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.Q.o2());
            } else if (this.Q.z3()) {
                i9 textSelectionHelper3 = this.Q.getTextSelectionHelper();
                e1 v22 = this.Q.v2(textSelectionHelper3.f30828p0);
                int i15 = textSelectionHelper3.f30830r0;
                int i16 = textSelectionHelper3.f30833u0;
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
                v1 v1Var6 = this.f22538r0;
                if (v1Var6 != null) {
                    if (v22 != null && max < max2 && b6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    v1Var6.setSelected(z14);
                }
                v1 v1Var7 = this.f22541t0;
                if (v1Var7 != null) {
                    if (v22 != null && max < max2 && b6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    v1Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.Q.o2());
            } else {
                int i18 = textSelectionHelper.f30828p0;
                int i19 = textSelectionHelper.f30831s0;
                int i20 = textSelectionHelper.f30830r0;
                int i21 = textSelectionHelper.f30833u0;
                if (i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.Q.f22354x4.size()) {
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
                v1 v1Var9 = this.f22538r0;
                if (v1Var9 != null) {
                    if (z10) {
                        Editable K4 = this.Q.K4(i18, i20, i19, i21);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = b6.h(K4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
                        }
                        if (h) {
                            z12 = true;
                            v1Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    v1Var9.setSelected(z12);
                }
                v1 v1Var10 = this.f22541t0;
                if (v1Var10 != null) {
                    if (z10) {
                        Editable K42 = this.Q.K4(i18, i20, i19, i21);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = b6.g(K42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21));
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
        e2 e2Var = this.Q.R3;
        if (e2Var != null && !e2Var.f22034c.isEmpty()) {
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
        if (!mp.u1(this.currentAccount).B4() && !j10.i(this.currentAccount).q()) {
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
        if (this.f22550z0 == null) {
            return;
        }
        boolean P3 = this.Q.P3();
        this.f22550z0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f22550z0.animate();
        if (P3) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        n10.n(animate, f10, 150L);
    }

    public final void H0() {
        u1 u1Var = this.f22550z0;
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
        this.F0 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.G0 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        ki.v1 v1Var = new ki.v1(this, 1);
        this.I0 = v1Var;
        this.P.f33465r.add(v1Var);
        s3 s3Var = new s3(context, this.currentAccount, getResourceProvider(), new hi.u5(this, 20));
        this.Q = s3Var;
        s3Var.setFileRefParentObject(this.f22537r);
        this.P.addView(this.Q, ma.e(-1, -1, 119));
        this.P.addView(this.Q.getOverlayView(), ma.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f22517b;
        if (richMessage != null) {
            s3 s3Var2 = this.Q;
            ArrayList arrayList2 = s3Var2.f22345t3;
            s3Var2.f22343s3 = richMessage;
            s3.Z2(arrayList2, richMessage.blocks, s3Var2.f22347u3);
            s3Var2.Y3();
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                s3Var2.y4((a) arrayList2.get(i12));
            }
            s3Var2.f34607g3.O(false);
        } else {
            String str = this.f22524f;
            if (str != null) {
                s3 s3Var3 = this.Q;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f22532n;
                HashMap hashMap = s3Var3.f22347u3;
                ArrayList arrayList3 = s3Var3.f22345t3;
                if (!TextUtils.isEmpty(charSequence)) {
                    s3.Z2(arrayList3, z4.b(charSequence), hashMap);
                }
                arrayList3.addAll(s3Var3.z4(a4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    s3.Z2(arrayList3, z4.b(charSequence2), hashMap);
                }
                s3Var3.Y3();
                s3Var3.f34607g3.O(false);
            } else {
                CharSequence charSequence3 = this.f22514a;
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
        int i13 = n6.f29396d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i13), n6.r1(0.0f, getThemedColor(i13))}));
        this.P.addView(this.R, ma.e(-1, 68, 55));
        View view2 = new View(context);
        this.S = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{n6.r1(0.0f, getThemedColor(i13)), getThemedColor(i13)}));
        this.P.addView(this.S, ma.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        frameLayout.setClipChildren(false);
        this.T.setClipToPadding(false);
        this.P.addView(this.T, ma.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(2131231240);
        ImageView imageView2 = this.U;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.U;
        int themedColor = getThemedColor(i13);
        int themedColor2 = getThemedColor(i13);
        int i14 = n6.f29488i6;
        imageView3.setBackground(new y1(n6.b0(themedColor, n6.w(themedColor2, getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        ImageView imageView4 = this.U;
        int i15 = n6.G6;
        i6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView4, i15, resourceProvider, mode);
        ra.a(this.U);
        this.U.setContentDescription(gd.M0(2131754878, null));
        this.U.setOnClickListener(new g1(this, 1));
        this.T.addView(this.U, ma.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(0);
        this.V.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.T.addView(this.V, ma.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.W = imageView5;
        imageView5.setImageResource(2131231599);
        this.W.setScaleType(scaleType);
        u6.Q(this.W, n6.h0(getThemedColor(i14), 1, -1), null, u6.M(i14), getResourceProvider());
        u6.s(this.W, i15, getResourceProvider(), mode);
        ra.a(this.W);
        this.W.setContentDescription(gd.M0(2131743650, null));
        this.W.setOnClickListener(new g1(this, 2));
        this.V.addView(this.W, ma.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.X = imageView6;
        imageView6.setImageResource(2131231582);
        this.X.setScaleType(scaleType);
        u6.Q(this.X, n6.h0(getThemedColor(i14), 1, -1), null, u6.M(i14), getResourceProvider());
        u6.s(this.X, i15, getResourceProvider(), mode);
        ra.a(this.X);
        this.X.setContentDescription(gd.M0(2131746147, null));
        this.X.setOnClickListener(new g1(this, 3));
        this.V.addView(this.X, ma.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Z = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.P.addView(this.Z, ma.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f22515a0 = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.f22515a0.setClipToPadding(false);
        this.Z.addView(this.f22515a0, ma.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f22518b0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f22518b0.setClipChildren(false);
        this.f22518b0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.f22515a0.addView(this.f22518b0, ma.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Y = frameLayout4;
        this.f22515a0.addView(frameLayout4, ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f22521d0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        this.f22521d0.setScaleType(scaleType);
        u6.s(this.f22521d0, i15, getResourceProvider(), mode);
        this.f22521d0.setBackground(new y1(n6.b0(getThemedColor(i13), n6.w(getThemedColor(i13), getThemedColor(i14)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
        this.f22518b0.addView(this.f22521d0, ma.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        ra.a(this.f22521d0);
        this.f22521d0.setContentDescription(gd.M0(2131755006, null));
        this.f22521d0.setOnClickListener(new g1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        frameLayout5.addView(frameLayout6, ma.e(-2, 44, 81));
        s1 s1Var = new s1(context, 0);
        this.f22523e0 = s1Var;
        s1Var.setClipToOutline(true);
        this.f22523e0.setOutlineProvider(new bg.q0(4));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f22525f0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22525f0.setOrientation(0);
        this.f22523e0.addView(this.f22525f0);
        frameLayout6.addView(this.f22523e0, ma.c(-1.0f, -1));
        yg ygVar = new yg(context, 24);
        this.f22520c0 = ygVar;
        ygVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        u6.s(this.f22520c0, i15, getResourceProvider(), mode);
        u6.Q(this.f22520c0, n6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), u6.M(i13), u6.M(i14), getResourceProvider());
        this.f22520c0.j(wg.f41711e, false);
        this.f22525f0.addView(this.f22520c0, ma.r(38, 38, 16));
        ra.a(this.f22520c0);
        this.f22520c0.setContentDescription(gd.M0(2131754884, null));
        this.f22520c0.setOnClickListener(new g1(this, 5));
        h0(2131231596, 1, false).setOnClickListener(new ni.b(1, this, context));
        h0(2131231568, 2, true).setOnClickListener(new g1(this, 6));
        h0(2131231585, 4, true).setOnClickListener(new g1(this, 7));
        h0(2131231570, 7, true).setOnClickListener(new g1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f22527h0 = imageView8;
        imageView8.setImageResource(2131232491);
        this.f22527h0.setScaleType(scaleType);
        u6.s(this.f22527h0, i15, getResourceProvider(), mode);
        u6.Q(this.f22527h0, n6.b0(getThemedColor(i13), getThemedColor(i14), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f)), u6.M(i13), u6.M(i14), getResourceProvider());
        this.f22525f0.addView(this.f22527h0, ma.t(38, 38, 16, 2, 0, 0, 0));
        ra.a(this.f22527h0);
        this.f22527h0.setContentDescription(gd.M0(2131754921, null));
        this.f22527h0.setOnClickListener(new g1(this, 9));
        this.f22518b0.addView(frameLayout5, ma.l(1.0f, 0, 44));
        d61 d61Var = new d61(6, context, this);
        this.f22528i0 = d61Var;
        d61Var.setOrientation(0);
        this.f22528i0.setClipToPadding(false);
        this.f22528i0.setClipChildren(false);
        this.f22528i0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22528i0, ma.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f22545w0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f22545w0.setClipToPadding(false);
        this.f22545w0.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.Z.addView(this.f22545w0, ma.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f22547x0 = imageView9;
        imageView9.f(2131624043, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), null);
        mh0 animatedDrawable = this.f22547x0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f22547x0.setScaleType(scaleType);
        u6.s(this.f22547x0, i15, getResourceProvider(), mode);
        this.f22547x0.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22545w0.addView(this.f22547x0, ma.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22528i0.addView(frameLayout8, ma.c(44.0f, -2));
        t1 t1Var = new t1(this, context);
        this.f22530k0 = t1Var;
        t1Var.setHorizontalScrollBarEnabled(false);
        this.f22530k0.setClipToOutline(true);
        this.f22530k0.setOutlineProvider(new bg.q0(5));
        frameLayout8.addView(this.f22530k0, ma.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f22529j0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f22529j0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22530k0.addView(this.f22529j0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231552, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231583, 16384, true);
        i0(context, 2131231584, 32768, true);
        v1 v1Var2 = new v1(2131231581, context, getResourceProvider());
        this.f22543v0 = v1Var2;
        v1Var2.setContentDescription(gd.M0(2131746245, null));
        this.f22543v0.setOnClickListener(new g1(this, 11));
        LinearLayout linearLayout5 = this.f22529j0;
        v1 v1Var3 = this.f22543v0;
        if (linearLayout5.getChildCount() > 0) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        linearLayout5.addView(v1Var3, ma.t(38, 38, 16, i7, 0, 0, 0));
        v1 v1Var4 = new v1(2131231549, context, getResourceProvider());
        this.f22540s0 = v1Var4;
        v1Var4.setContentDescription(gd.M0(2131745816, null));
        this.f22540s0.setOnClickListener(new g1(this, 12));
        LinearLayout linearLayout6 = this.f22529j0;
        v1 v1Var5 = this.f22540s0;
        if (linearLayout6.getChildCount() > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        linearLayout6.addView(v1Var5, ma.t(38, 38, 16, i10, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f22534o0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f22534o0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22534o0.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22528i0.addView(this.f22534o0, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var6 = new v1(2131231746, context, getResourceProvider());
        this.f22538r0 = v1Var6;
        v1Var6.setContentDescription(gd.M0(2131751733, null));
        this.f22538r0.setOnClickListener(new g1(this, 13));
        this.f22534o0.addView(this.f22538r0, ma.r(38, 38, 16));
        v1 v1Var7 = new v1(2131232079, context, getResourceProvider());
        this.f22541t0 = v1Var7;
        v1Var7.setContentDescription(gd.M0(2131754862, null));
        this.f22541t0.setOnClickListener(new g1(this, 14));
        this.f22534o0.addView(this.f22541t0, ma.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f22535p0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f22535p0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22535p0.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22528i0.addView(this.f22535p0, ma.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        v1 v1Var8 = new v1(2131231570, context, getResourceProvider());
        this.f22542u0 = v1Var8;
        v1Var8.d();
        arrayList.add(this.f22542u0);
        this.f22542u0.setContentDescription(gd.M0(2131754864, null));
        this.f22542u0.setOnClickListener(new g1(this, 15));
        this.f22535p0.addView(this.f22542u0, ma.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.f22533n0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.f22533n0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        this.f22533n0.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i13))));
        this.f22528i0.addView(this.f22533n0, 0, ma.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        v1 v1Var9 = new v1(0, context, getResourceProvider());
        this.f22536q0 = v1Var9;
        v1Var9.setImageDrawable(new org.telegram.ui.ActionBar.w2(context));
        this.f22536q0.setContentDescription(gd.M0(2131755006, null));
        this.f22536q0.setOnClickListener(new g1(this, 16));
        this.f22533n0.addView(this.f22536q0, ma.r(38, 38, 16));
        if (this.f22537r != null) {
            i11 = 2131231502;
        } else if (q0()) {
            i11 = 2131231512;
        } else {
            i11 = 2131232696;
        }
        u1 u1Var = new u1(this, context, i11, getResourceProvider());
        this.f22550z0 = u1Var;
        u1Var.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(n6.Pe))));
        ra.a(this.f22550z0);
        this.f22518b0.addView(this.f22550z0, ma.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f22550z0.setContentDescription(gd.M0(2131745445, null));
        this.f22550z0.setOnClickListener(new g1(this, 0));
        this.f22550z0.setOnLongClickListener(new hi.o4(this, 4));
        H0();
        this.P.setPadding(0, org.telegram.messenger.g0.f24115m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.P.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        F0();
        if (this.f22522e) {
            this.Q.F2();
            this.f22522e = false;
        }
        r1 r1Var = this.P;
        this.fragmentView = r1Var;
        return r1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25129h5) {
            H0();
            F0();
        }
    }

    public final v1 h0(int i7, int i10, boolean z10) {
        int i11;
        v1 v1Var = new v1(i7, this.f22525f0.getContext(), getResourceProvider());
        if (z10) {
            v1Var.d();
            this.O.add(v1Var);
        }
        v1Var.setTag(Integer.valueOf(i10));
        v1Var.setContentDescription(l0(i10));
        this.f22526g0.add(v1Var);
        LinearLayout linearLayout = this.f22525f0;
        if (linearLayout.getChildCount() == 0) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        linearLayout.addView(v1Var, ma.t(38, 38, 16, i11, 0, 0, 0));
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
        LinearLayout linearLayout = this.f22529j0;
        if (linearLayout.getChildCount() > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        linearLayout.addView(v1Var, ma.t(38, 38, 16, i11, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        s3 s3Var = this.Q;
        if (s3Var != null && s3Var.f22349v3.x()) {
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
        this.Q0.setInterpolator(lr.h);
        this.Q0.setDuration(250L);
        this.Q0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        ry ryVar = this.B0;
        if (ryVar != null && (layoutParams = (FrameLayout.LayoutParams) ryVar.getLayoutParams()) != null) {
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
        ry ryVar = this.B0;
        if (ryVar != null && (layoutParams = (FrameLayout.LayoutParams) ryVar.getLayoutParams()) != null) {
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
        Point point = org.telegram.messenger.g0.f24121q;
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
                    Utilities.f22782e.c(new kg.h0(29, s3Var, data));
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
                ry ryVar = this.B0;
                if (ryVar != null) {
                    ryVar.t(false);
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
        if (!org.telegram.messenger.g0.Q1() && this.f22539s != null && this.f22544w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            jh.f fVar = this.f22539s;
            this.f22548y = fVar.f17781n;
            fVar.f17779e = false;
            fVar.invalidate();
            this.f22544w.setAlpha(0.0f);
            this.f22544w.f32651o2.setVisibility(4);
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
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.g0.L(16.0f)), ObjectAnimator.ofFloat(this.f22515a0, property, 0.0f), ObjectAnimator.ofFloat(this.f22515a0, property2, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.S, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.T;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.T;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.f22515a0, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f22515a0, property4, org.telegram.messenger.g0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.S, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(lr.h);
            this.P.post(new hq0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.f25129h5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ki.v1 v1Var;
        ks.f(this.currentAccount).n(this, ks.f25129h5);
        if (!this.W0) {
            v0();
            this.W0 = true;
        }
        l1 l1Var = this.O0;
        if (l1Var != null) {
            this.O0 = null;
            org.telegram.messenger.g0.g3(l1Var);
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
        ry ryVar = this.B0;
        if (ryVar != null) {
            ryVar.B();
        }
        r1 r1Var = this.P;
        if (r1Var != null && (v1Var = this.I0) != null) {
            r1Var.f33465r.remove(v1Var);
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
        y60 y60Var;
        i0.b f10 = l1Var.f56258a.f(3);
        int i7 = l1Var.f56258a.f(8).d;
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
            Point point = org.telegram.messenger.g0.f24121q;
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
        if (!this.H0 && z11 && (y60Var = this.f22549y0) != null) {
            y60Var.v();
            this.f22549y0 = null;
        }
        onInsets(f10.f15892a, f10.f15893b, f10.f15894c, f10.d);
        return r0.l1.f56257b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i7 = n6.f29396d6;
            int themedColor = getThemedColor(i7);
            int i10 = n6.f29488i6;
            int themedColor2 = getThemedColor(i10);
            int i11 = n6.Pe;
            int themedColor3 = getThemedColor(i11);
            if (!this.f22516a1 || themedColor != this.X0 || themedColor2 != this.Y0 || themedColor3 != this.Z0) {
                this.f22516a1 = true;
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
                    imageView.setBackground(new y1(n6.b0(getThemedColor(i7), n6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                LinearLayout linearLayout = this.V;
                if (linearLayout != null) {
                    linearLayout.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                ImageView imageView2 = this.f22521d0;
                if (imageView2 != null) {
                    imageView2.setBackground(new y1(n6.b0(getThemedColor(i7), n6.w(getThemedColor(i7), getThemedColor(i10)), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f))));
                }
                ph0 ph0Var = this.f22547x0;
                if (ph0Var != null) {
                    ph0Var.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout2 = this.f22534o0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout3 = this.f22535p0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                LinearLayout linearLayout4 = this.f22533n0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i7))));
                }
                u1 u1Var = this.f22550z0;
                if (u1Var != null) {
                    u1Var.setBackground(new y1(n6.d0(org.telegram.messenger.g0.L(22.0f), getThemedColor(i11))));
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
        if (z10 && !z11 && (i7 = this.f22519c) >= 0 && (s3Var2 = this.Q) != null) {
            int i10 = this.d;
            this.d = -1;
            this.f22519c = -1;
            if (!s3Var2.c2(i7, i10)) {
                s3Var2.post(new m2(s3Var2, i7, i10, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f22517b != null || this.f22524f != null) && (s3Var = this.Q) != null && !s3Var.d3()) {
                s3Var.post(new b(s3Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D0) {
            this.D0 = false;
            ry ryVar = this.B0;
            if (ryVar != null) {
                ryVar.t(false);
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
        ry ryVar2 = this.B0;
        if (ryVar2 != null) {
            ryVar2.setTranslationY(0.0f);
            this.B0.setVisibility(8);
        }
        if (this.C0 || this.E0 != 0) {
            this.C0 = false;
            this.E0 = 0;
            m0();
        }
        yg ygVar = this.f22520c0;
        if (ygVar != null) {
            ygVar.j(wg.f41711e, z10);
        }
    }

    public final boolean q0() {
        bn bnVar;
        if (this.f22537r == null && (bnVar = this.K) != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!mp.u1(this.currentAccount).B4() && !j10.i(this.currentAccount).q()) {
            s3 s3Var = this.Q;
            if (z4.d(s3Var.f22345t3, s3Var.f22347u3)) {
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
            org.telegram.ui.Components.m0 m0Var = new org.telegram.ui.Components.m0(getParentActivity(), getResourceProvider());
            m0Var.w1(a10);
            m0Var.f37286g2 = new t6(k22, 15);
            m0Var.show();
        }
    }

    public final void t0(int i7, int i10) {
        s3 s3Var = this.Q;
        s3Var.f22331k4 = s3Var.T2();
        si siVar = new si(getParentActivity(), this, false, false, true, getResourceProvider());
        siVar.X3 = new o1(this, siVar);
        siVar.f39670e2.setIncludeVideosInGallery(true);
        siVar.f39670e2.i0();
        siVar.z1(1, true);
        siVar.W0(i7);
        siVar.f39726u4 = new n1(this, siVar);
        siVar.T1 = new n1(this, siVar);
        siVar.S1 = new p1(this, siVar);
        siVar.f1();
        if (i10 != 0) {
            siVar.p1(i10);
        }
        siVar.A0(true);
        siVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.K == null || this.f22537r != null || !this.Q.u2()) {
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
        rj rjVar = this.K.f45932a0;
        if (m22 != null && !this.N) {
            s3 s3Var = this.Q;
            if (s3Var.n3() && !z4.d(s3Var.f22345t3, s3Var.f22347u3) && rjVar != null) {
                SpannableStringBuilder g10 = z4.g(this.Q.f22345t3);
                bn bnVar = rjVar.D3;
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
                hh0.a(spannableStringBuilder);
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
            s3 s3Var = this.Q;
            Objects.requireNonNull(s3Var);
            u0(parentActivity, new b(s3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.b5.J(getParentActivity(), this.K.a(), new h9.g1(this, 18), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i7, final int i10, final boolean z10) {
        rj rjVar;
        kg kgVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            s3 s3Var = this.Q;
            Objects.requireNonNull(s3Var);
            u0(parentActivity, new b(s3Var, 0), new f1(this, 4), getResourceProvider());
        } else if (this.K != null && this.Q.n3() && !this.Q.p3()) {
            if (!this.Q.P3()) {
                G0();
            } else if (!mp.u1(this.currentAccount).B4()) {
                rj rjVar2 = this.K.f45932a0;
                if (rjVar2 != null) {
                    this.N = true;
                    Runnable runnable = this.L;
                    if (runnable != null) {
                        runnable.run();
                    }
                    rjVar2.q1(z4.g(this.Q.f22345t3), z10, i7, i10);
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
                final fj fjVar = bnVar.F5;
                final fj fjVar2 = bnVar.f46096m4;
                final rm rmVar = bnVar.D5;
                final long j92 = bnVar.j9();
                final bw Y8 = this.K.Y8();
                final fj fjVar3 = this.f22537r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        z1.d0(z1.this, fjVar3, c32, E2, B2, a10, a11, fjVar, fjVar2, rmVar, z10, i7, i10, Y8, j92);
                    }
                };
                Runnable runnable2 = this.L;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (fjVar3 == null && (rjVar = this.K.f45932a0) != null && (kgVar = rjVar.N3) != null) {
                    kgVar.H(null, z10, i7, i10, 0L);
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
            v1 v1Var = (v1) obj;
            if (((Integer) v1Var.getTag()).intValue() == 1) {
                v1Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        v1 v1Var = this.f22538r0;
        if (v1Var != null) {
            v1Var.setEnabled(z10);
        }
        v1 v1Var2 = this.f22540s0;
        if (v1Var2 != null) {
            v1Var2.setEnabled(z11);
        }
        v1 v1Var3 = this.f22541t0;
        if (v1Var3 != null) {
            v1Var3.setEnabled(z10);
        }
        v1 v1Var4 = this.f22542u0;
        if (v1Var4 != null) {
            v1Var4.setEnabled(z10);
        }
    }

    public z1(String str) {
        super(null);
        this.f22519c = -1;
        this.d = -1;
        this.f22546x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22526g0 = new ArrayList();
        this.f22531l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22524f = str;
    }

    public z1(TL_iv.RichMessage richMessage) {
        super(null);
        this.f22519c = -1;
        this.d = -1;
        this.f22546x = new Rect();
        this.G = new int[2];
        this.J = 1.0f;
        this.O = new ArrayList();
        this.f22526g0 = new ArrayList();
        this.f22531l0 = Integer.MAX_VALUE;
        this.m0 = new ArrayList();
        this.J0 = 0;
        this.L0 = -1;
        this.N0 = new f1(this, 0);
        this.f22517b = richMessage;
    }
}
