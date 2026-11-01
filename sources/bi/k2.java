package bi;

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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.rz;
import org.telegram.messenger.tw;
import org.telegram.messenger.uz;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zf;
import org.telegram.ui.ih0;
import org.telegram.ui.kn;
import org.telegram.ui.mk;
import org.telegram.ui.qr0;
import org.telegram.ui.s71;
import org.telegram.ui.un;
public final class k2 extends org.telegram.ui.ActionBar.k2 implements vs {
    public vy A0;
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
    public s1 H0;
    public float I;
    public int I0;
    public un J;
    public boolean J0;
    public Runnable K;
    public int K0;
    public Runnable L;
    public boolean L0;
    public boolean M;
    public final Runnable M0;
    public final ArrayList N;
    public v1 N0;
    public b2 O;
    public ih0 O0;
    public d4 P;
    public ValueAnimator P0;
    public View Q;
    public float Q0;
    public View R;
    public n1 R0;
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
    public final CharSequence f3134a;
    public LinearLayout f3135a0;
    public final TL_iv.RichMessage f3136b;
    public fg f3137b0;
    public int f3138c;
    public ImageView f3139c0;
    public int d;
    public c2 f3140d0;
    public boolean e;
    public LinearLayout f3141e0;
    public final String f3142f;
    public final ArrayList f3143f0;
    public ImageView f3144g0;
    public CharSequence h;
    public s71 f3145h0;
    public LinearLayout f3146i0;
    public e2 f3147j0;
    public int f3148k0;
    public final ArrayList f3149l0;
    public LinearLayout m0;
    public CharSequence f3150n;
    public LinearLayout f3151n0;
    public LinearLayout f3152o0;
    public g2 f3153p0;
    public g2 f3154q0;
    public kj f3155r;
    public g2 f3156r0;
    public zg.e f3157s;
    public g2 f3158s0;
    public g2 f3159t0;
    public g2 f3160u0;
    public FrameLayout f3161v0;
    public mk f3162w;
    public fi0 f3163w0;
    public final Rect f3164x;
    public z60 f3165x0;
    public vg.f f3166y;
    public f2 f3167y0;
    public m.p3 f3168z0;

    public k2(Editable editable) {
        super(null);
        this.f3138c = -1;
        this.d = -1;
        this.f3164x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f3143f0 = new ArrayList();
        this.f3148k0 = Integer.MAX_VALUE;
        this.f3149l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.f3134a = editable;
    }

    public static void Z(k2 k2Var) {
        q3 q3Var = k2Var.P.f2950u3;
        if (q3Var != null && q3Var.x()) {
            k2Var.s0();
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        new z(k2Var.currentAccount, parentActivity, new ag.l(k2Var, 8), k2Var.getResourceProvider()).show();
    }

    public static void a0(k2 k2Var) {
        if (!e20.i(k2Var.currentAccount).q()) {
            k2Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) k2Var, 43, true));
        }
    }

    public static boolean b0(k2 k2Var, View view) {
        int i10;
        un unVar = k2Var.J;
        if (unVar != null && k2Var.f3155r == null && !unVar.c() && k2Var.P.n3() && !k2Var.P.p3()) {
            if (!k2Var.P.P3()) {
                k2Var.G0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> c32 = k2Var.P.c3();
            if (!c32.isEmpty()) {
                ih0 ih0Var = k2Var.O0;
                if (ih0Var != null) {
                    ih0Var.g(false);
                    k2Var.O0 = null;
                }
                ih0 ih0Var2 = new ih0(k2Var.getParentActivity(), k2Var.getResourceProvider());
                k2Var.O0 = ih0Var2;
                ih0Var2.setOnDismissListener(new ag.x(k2Var, 3));
                long a2 = k2Var.J.a();
                kj kjVar = k2Var.J.D5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19815id = 0;
                tL_message.out = true;
                tL_message.peer_id = wp.r1(k2Var.currentAccount).y1(a2);
                tL_message.from_id = wp.r1(k2Var.currentAccount).y1(e20.i(k2Var.currentAccount).e());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = c32;
                richMessage.photos = k2Var.P.E2();
                tL_message.rich_message.documents = k2Var.P.B2();
                if (kjVar != null && !kjVar.f16708p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = kjVar.f1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                kj kjVar2 = new kj(k2Var.currentAccount, tL_message, false, false);
                if (kjVar != null && !kjVar.f16708p) {
                    kjVar2.C = kjVar;
                }
                kjVar2.f16748z0 = true;
                kjVar2.R2 = Boolean.TRUE;
                kjVar2.n0(null);
                kjVar2.f16730u1 = true;
                k2Var.O0.p(org.telegram.messenger.m5.j(kjVar2));
                k2Var.f3167y0.setScaleX(1.0f);
                k2Var.f3167y0.setScaleY(1.0f);
                zf q6 = k2Var.O0.q(k2Var.f3167y0, true, new p1(k2Var, 10));
                if (q6 != null) {
                    q6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci))));
                    ih0 ih0Var3 = k2Var.O0;
                    int L = org.telegram.messenger.i0.L(44.0f);
                    ih0Var3.f38073l0 = true;
                    ih0Var3.X = L;
                }
                z60 H = z60.H(k2Var, k2Var.f3167y0);
                boolean B = i20.B(k2Var.J.j());
                if (k2Var.J.P6()) {
                    if (B) {
                        i10 = 2131745531;
                    } else {
                        i10 = 2131745876;
                    }
                    H.c(2131232076, dd.L0(i10, null), new e(k2Var, a2, 1), false);
                    if (!B && a2 > 0) {
                        H.c(2131232263, dd.L0(2131745603, null), new o1(k2Var, 5), false);
                    }
                }
                if (!B) {
                    H.c(2131231509, dd.L0(2131745600, null), new o1(k2Var, 6), false);
                }
                H.Y();
                k2Var.O0.o(H);
                k2Var.O0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static void c0(final k2 k2Var, Context context, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        float f7;
        float f10;
        boolean z18;
        boolean z19;
        boolean z20;
        float f11;
        float f12;
        boolean z21;
        boolean z22;
        float f13;
        z60 z60Var = k2Var.f3165x0;
        if (z60Var != null) {
            z60Var.u();
            k2Var.f3165x0 = null;
        }
        if (!wp.r1(k2Var.currentAccount).p4() && !e20.i(k2Var.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        final a T2 = k2Var.P.T2();
        final z60 I = z60.I(k2Var, view);
        I.Q = true;
        z60 J = I.J();
        J.c(2131231241, dd.L0(2131753756, null), new j(I, 1), false);
        J.k();
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        J.j(z11, 2131231559, null, dd.L0(2131754030, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0 + 2);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading2)) {
            z12 = true;
        } else {
            z12 = false;
        }
        J.j(z12, 2131231560, null, dd.L0(2131754029, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0 + 1);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading3)) {
            z13 = true;
        } else {
            z13 = false;
        }
        J.j(z13, 2131231561, null, dd.L0(2131754028, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        J.j(z14, 2131231562, null, dd.L0(2131754027, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0 - 1);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading5)) {
            z15 = true;
        } else {
            z15 = false;
        }
        J.j(z15, 2131231563, null, dd.L0(2131754026, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0 - 2);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockHeading6)) {
            z16 = true;
        } else {
            z16 = false;
        }
        J.j(z16, 2131231564, null, dd.L0(2131754025, null), new Runnable(k2Var) {
            public final k2 f3377b;

            {
                this.f3377b = k2Var;
            }

            @Override
            public final void run() {
                switch (r4) {
                    case 0:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading1());
                        I.u();
                        return;
                    case 1:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading2());
                        I.u();
                        return;
                    case 2:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading3());
                        I.u();
                        return;
                    case 3:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading4());
                        I.u();
                        return;
                    case 4:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading5());
                        I.u();
                        return;
                    default:
                        this.f3377b.P.Y4(T2, new TL_iv.pageBlockHeading6());
                        I.u();
                        return;
                }
            }
        });
        J.y().f20165a.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
        J.y().f20165a.setTextSize(1, uz.W0 - 3);
        if (T2 != null && d4.F3(T2.f2818b)) {
            z17 = true;
        } else {
            z17 = false;
        }
        i2 i2Var = new i2(context, 2131231558);
        i2Var.a(z10);
        int i10 = org.telegram.ui.ActionBar.t6.G8;
        i2Var.d = i10;
        I.j(z17, 0, i2Var, dd.L0(2131754031, null), new k(I, J, 1));
        I.y().f20165a.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.b1 y3 = I.y();
        float f14 = 9.0f;
        if (dd.X) {
            f7 = 18.0f;
        } else {
            f7 = 9.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (dd.X) {
            f10 = 9.0f;
        } else {
            f10 = 18.0f;
        }
        y3.setPadding(L, 0, org.telegram.messenger.i0.L(f10), 0);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockParagraph)) {
            z18 = true;
        } else {
            z18 = false;
        }
        I.j(z18, 2131231597, null, dd.L0(2131753988, null), new t1(k2Var, T2, 3));
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockBlockquote)) {
            z19 = true;
        } else {
            z19 = false;
        }
        I.j(z19, 2131231581, null, dd.L0(2131753996, null), new t1(k2Var, T2, 4));
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockPullquote)) {
            z20 = true;
        } else {
            z20 = false;
        }
        i2 i2Var2 = new i2(context, 2131231580);
        i2Var2.a(z10);
        i2Var2.d = i10;
        I.j(z20, 0, i2Var2, dd.L0(2131753997, null), new t1(k2Var, T2, 0));
        org.telegram.ui.ActionBar.b1 y10 = I.y();
        if (dd.X) {
            f11 = 18.0f;
        } else {
            f11 = 9.0f;
        }
        int L2 = org.telegram.messenger.i0.L(f11);
        if (dd.X) {
            f12 = 9.0f;
        } else {
            f12 = 18.0f;
        }
        y10.setPadding(L2, 0, org.telegram.messenger.i0.L(f12), 0);
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockPreformatted)) {
            z21 = true;
        } else {
            z21 = false;
        }
        I.j(z21, 2131231552, null, dd.L0(2131754055, null), new t1(k2Var, T2, 1));
        if (T2 != null && (T2.f2818b instanceof TL_iv.pageBlockFooter)) {
            z22 = true;
        } else {
            z22 = false;
        }
        i2 i2Var3 = new i2(context, 2131231555);
        i2Var3.a(z10);
        i2Var3.d = i10;
        I.j(z22, 0, i2Var3, dd.L0(2131754032, null), new t1(k2Var, T2, 2));
        org.telegram.ui.ActionBar.b1 y11 = I.y();
        if (dd.X) {
            f13 = 18.0f;
        } else {
            f13 = 9.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f13);
        if (!dd.X) {
            f14 = 18.0f;
        }
        y11.setPadding(L3, 0, org.telegram.messenger.i0.L(f14), 0);
        I.Z();
        k2Var.f3165x0 = I;
    }

    public static void d0(k2 k2Var, kj kjVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, kj kjVar2, kj kjVar3, kn knVar, boolean z10, int i10, int i11, tw twVar, long j11) {
        if (kjVar != null) {
            org.telegram.messenger.c a2 = org.telegram.messenger.c.a(k2Var.currentAccount);
            un unVar = k2Var.J;
            org.telegram.messenger.r5 r5Var = rz.I;
            if (arrayList.isEmpty()) {
                return;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            int i12 = 0;
            richMessage.rtl = false;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
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
            while (i12 < size2) {
                TL_iv.PageBlock pageBlock2 = arrayList5.get(i12);
                i12++;
                rz.j(pageBlock2, identityHashMap);
            }
            rz.C(a2.f15043a).v(kjVar, richMessage, arrayList4, unVar, false);
            return;
        }
        rz.R(org.telegram.messenger.c.a(k2Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, j10, kjVar2, kjVar3, knVar, z10, i10, i11, twVar, 0L, j11, 0L);
    }

    public static void e0(k2 k2Var, boolean z10, boolean z11) {
        float f7;
        int i10;
        if (k2Var.J0 != z10 || !z11) {
            k2Var.J0 = z10;
            if (z10) {
                f7 = 1.15f;
            } else {
                f7 = 1.0f;
            }
            if (z11) {
                k2Var.f3163w0.animate().scaleX(f7).scaleY(f7).setDuration(180L).setInterpolator(gr.h).start();
            } else {
                k2Var.f3163w0.animate().cancel();
                k2Var.f3163w0.setScaleX(f7);
                k2Var.f3163w0.setScaleY(f7);
            }
            fi0 fi0Var = k2Var.f3163w0;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.t6.f21171q7;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.G6;
            }
            a7.t(fi0Var, i10, k2Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
            ci0 animatedDrawable = k2Var.f3163w0.getAnimatedDrawable();
            if (animatedDrawable != null) {
                if (z10) {
                    if (animatedDrawable.f25131a0 > 34) {
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

    public static n1 f0(k2 k2Var) {
        n1 focusedEditTextOrNull = k2Var.P.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            k2Var.R0 = focusedEditTextOrNull;
            k2Var.S0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        n1 n1Var = k2Var.R0;
        if (n1Var != null) {
            return n1Var;
        }
        return k2Var.P.S2();
    }

    public static int g0(k2 k2Var, n1 n1Var) {
        if (n1Var == k2Var.R0 && k2Var.P.getFocusedEditTextOrNull() != n1Var) {
            return Math.min(k2Var.S0, n1Var.length());
        }
        return Math.max(0, n1Var.getSelectionEnd());
    }

    public static String l0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 7) {
                        if (i10 != 9) {
                            return null;
                        }
                        return dd.L0(2131754869, null);
                    }
                    return dd.L0(2131754864, null);
                }
                return dd.L0(2131754855, null);
            }
            return dd.L0(2131754860, null);
        }
        return dd.L0(2131754854, null);
    }

    public static String n0(int i10) {
        if (i10 == 1) {
            return dd.L0(2131753671, null);
        }
        if (i10 == 2) {
            return dd.L0(2131749097, null);
        }
        if (i10 == 16) {
            return dd.L0(2131743914, null);
        }
        if (i10 == 8) {
            return dd.L0(2131744463, null);
        }
        if (i10 == 256) {
            return dd.L0(2131745280, null);
        }
        if (i10 == 4) {
            return dd.L0(2131748365, null);
        }
        if (i10 == 65536) {
            return dd.L0(2131749312, null);
        }
        if (i10 == 16384) {
            return dd.L0(2131744451, null);
        }
        if (i10 != 32768) {
            return null;
        }
        return dd.L0(2131744353, null);
    }

    public static void u0(Context context, final Runnable runnable, final Runnable runnable2, org.telegram.ui.ActionBar.p6 p6Var) {
        final org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        k10.N = f7;
        ImageView e = a30.e(context, 2131231603);
        e.setScaleType(ImageView.ScaleType.CENTER);
        int L = org.telegram.messenger.i0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N = a7.N(i10);
        e.setBackground(L2);
        a7.k(e, L2, N, null, p6Var);
        f7.addView(e, w7.b6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(dd.L0(2131754041, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        a7.V(textView, i11, p6Var);
        TextView f10 = a30.f(f7, textView, w7.b6.t(-1, -2, 49, 25, 16, 25, 0), context);
        f10.setText(org.telegram.messenger.i0.W2(dd.L0(2131754042, null)));
        f10.setTextSize(1, 14.0f);
        f10.setGravity(17);
        a7.V(f10, i11, p6Var);
        f7.addView(f10, w7.b6.t(-1, -2, 49, 25, 11, 25, 0));
        vh.d i12 = a30.i(24, context, p6Var, true);
        i12.setText(dd.L0(2131754043, null));
        f7.addView(i12, w7.b6.t(-1, 48, 49, 14, 31, 14, 0));
        vh.d i13 = a30.i(24, context, p6Var, false);
        i13.setText(dd.L0(2131754044, null));
        f7.addView(i13, w7.b6.t(-1, 48, 49, 14, 2, 14, 6));
        k10.show();
        i12.setOnClickListener(new View.OnClickListener() {
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
        i13.setOnClickListener(new View.OnClickListener() {
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
        zg.e eVar = this.f3157s;
        int[] iArr = this.F;
        eVar.getLocationInWindow(iArr);
        if (this.D == null) {
            this.D = new RectF();
        }
        RectF rectF = new RectF(this.f3166y.getBounds());
        this.D = rectF;
        rectF.offset(iArr[0], iArr[1]);
        if (this.G == null) {
            this.G = new int[2];
        }
        this.f3162w.getLocationInWindow(this.G);
        if (this.H == null) {
            this.H = new int[2];
        }
        this.H[0] = this.P.getPaddingLeft();
        this.H[1] = this.P.getPaddingTop();
        int[] iArr2 = this.H;
        iArr2[0] = (int) (iArr2[0] - (this.f3162w.E0.getX() - org.telegram.messenger.i0.L(16.0f)));
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k2.B0():void");
    }

    public final void C0(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        float f11;
        float L;
        int i12;
        float f12;
        float f13;
        float f14;
        float L2;
        float f15;
        float f16;
        float f17;
        float f18;
        float L3;
        float f19;
        float f20;
        float f21;
        float L4;
        float f22;
        if (this.K0 == i10) {
            return;
        }
        this.K0 = i10;
        int i13 = 0;
        float f23 = 0.0f;
        float f24 = 0.8f;
        if (z10) {
            this.f3135a0.setVisibility(0);
            ViewPropertyAnimator animate = this.f3135a0.animate();
            if (this.K0 == 0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f16);
            if (this.K0 == 0) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f17);
            if (this.K0 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.8f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
            if (this.K0 == 0) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.i0.L(30.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationY(L3).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new o1(this, 1)).start();
            this.f3145h0.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f3145h0.animate();
            if (this.K0 == 1) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f19);
            if (this.K0 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.8f;
            }
            ViewPropertyAnimator scaleX2 = alpha2.scaleX(f20);
            if (this.K0 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.8f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f21);
            if (this.K0 == 1) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.i0.L(30.0f);
            }
            scaleY2.translationY(L4).setDuration(420L).setInterpolator(grVar).withEndAction(new o1(this, 2)).start();
            this.f3161v0.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f3161v0.animate();
            if (this.K0 == 2) {
                f23 = 1.0f;
            }
            ViewPropertyAnimator alpha3 = animate3.alpha(f23);
            if (this.K0 == 2) {
                f22 = 1.0f;
            } else {
                f22 = 0.8f;
            }
            ViewPropertyAnimator scaleX3 = alpha3.scaleX(f22);
            if (this.K0 == 2) {
                f24 = 1.0f;
            }
            scaleX3.scaleY(f24).setDuration(420L).setInterpolator(grVar).withEndAction(new o1(this, 3)).start();
            return;
        }
        LinearLayout linearLayout = this.f3135a0;
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        LinearLayout linearLayout2 = this.f3135a0;
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        linearLayout2.setAlpha(f7);
        LinearLayout linearLayout3 = this.f3135a0;
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        linearLayout3.setScaleX(f10);
        LinearLayout linearLayout4 = this.f3135a0;
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        linearLayout4.setScaleY(f11);
        LinearLayout linearLayout5 = this.f3135a0;
        if (i10 == 0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(30.0f);
        }
        linearLayout5.setTranslationY(L);
        s71 s71Var = this.f3145h0;
        if (i10 == 1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        s71Var.setVisibility(i12);
        s71 s71Var2 = this.f3145h0;
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        s71Var2.setAlpha(f12);
        s71 s71Var3 = this.f3145h0;
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        s71Var3.setScaleX(f13);
        s71 s71Var4 = this.f3145h0;
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.8f;
        }
        s71Var4.setScaleY(f14);
        s71 s71Var5 = this.f3145h0;
        if (i10 == 1) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.i0.L(30.0f);
        }
        s71Var5.setTranslationY(L2);
        FrameLayout frameLayout = this.f3161v0;
        if (i10 != 2) {
            i13 = 8;
        }
        frameLayout.setVisibility(i13);
        FrameLayout frameLayout2 = this.f3161v0;
        if (i10 == 2) {
            f23 = 1.0f;
        }
        frameLayout2.setAlpha(f23);
        FrameLayout frameLayout3 = this.f3161v0;
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.8f;
        }
        frameLayout3.setScaleX(f15);
        FrameLayout frameLayout4 = this.f3161v0;
        if (i10 == 2) {
            f24 = 1.0f;
        }
        frameLayout4.setScaleY(f24);
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
        n1 n1Var;
        int max3;
        boolean z17;
        boolean z18;
        k9 textSelectionHelper = this.P.getTextSelectionHelper();
        ArrayList arrayList = this.f3149l0;
        if (!arrayList.isEmpty() && textSelectionHelper != null && textSelectionHelper.x()) {
            g2 g2Var = this.f3160u0;
            boolean z19 = false;
            if (g2Var != null) {
                d4 d4Var = this.P;
                int[] E4 = d4Var.E4();
                if (E4 != null && d4Var.K3(E4[0], E4[1])) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                g2Var.setSelected(z18);
            }
            if (this.P.O3()) {
                k9 textSelectionHelper2 = this.P.getTextSelectionHelper();
                int i10 = textSelectionHelper2.f22187p0;
                int i11 = textSelectionHelper2.f22188q0;
                int i12 = textSelectionHelper2.f22191t0;
                int i13 = textSelectionHelper2.f22189r0;
                int i14 = textSelectionHelper2.f22192u0;
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    g2 g2Var2 = (g2) obj;
                    g2Var2.setSelected(this.P.N3(((Integer) g2Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
                }
                if (i11 == i12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    n1Var = this.P.Q4(i10, i11);
                } else {
                    n1Var = null;
                }
                int max4 = Math.max(0, Math.min(i13, i14));
                if (n1Var == null) {
                    max3 = 0;
                } else {
                    max3 = Math.max(0, Math.min(Math.max(i13, i14), n1Var.length()));
                }
                g2 g2Var3 = this.f3154q0;
                if (g2Var3 != null) {
                    if (n1Var != null && max4 < max3 && s6.h(n1Var.getText(), max4, max3)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    g2Var3.setSelected(z17);
                }
                g2 g2Var4 = this.f3158s0;
                if (g2Var4 != null) {
                    if (n1Var != null && max4 < max3 && s6.g(n1Var.getText(), max4, max3)) {
                        z19 = true;
                    }
                    g2Var4.setSelected(z19);
                }
                y0(true);
                z0(z16, this.P.o2());
            } else if (this.P.z3()) {
                k9 textSelectionHelper3 = this.P.getTextSelectionHelper();
                n1 v22 = this.P.v2(textSelectionHelper3.f22187p0);
                int i16 = textSelectionHelper3.f22189r0;
                int i17 = textSelectionHelper3.f22192u0;
                if (v22 == null) {
                    max = 0;
                } else {
                    max = Math.max(0, Math.min(Math.min(i16, i17), v22.length()));
                }
                if (v22 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0, Math.min(Math.max(i16, i17), v22.length()));
                }
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList.get(i18);
                    i18++;
                    g2 g2Var5 = (g2) obj2;
                    int intValue = ((Integer) g2Var5.getTag()).intValue();
                    if (v22 != null && max < max2 && (intValue & v22.c(max, max2)) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    g2Var5.setSelected(z15);
                }
                g2 g2Var6 = this.f3154q0;
                if (g2Var6 != null) {
                    if (v22 != null && max < max2 && s6.h(v22.getText(), max, max2)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    g2Var6.setSelected(z14);
                }
                g2 g2Var7 = this.f3158s0;
                if (g2Var7 != null) {
                    if (v22 != null && max < max2 && s6.g(v22.getText(), max, max2)) {
                        z19 = true;
                    }
                    g2Var7.setSelected(z19);
                }
                y0(true);
                z0(true, this.P.o2());
            } else {
                int i19 = textSelectionHelper.f22187p0;
                int i20 = textSelectionHelper.f22190s0;
                int i21 = textSelectionHelper.f22189r0;
                int i22 = textSelectionHelper.f22192u0;
                if (i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.P.f2955w4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int size3 = arrayList.size();
                int i23 = 0;
                while (i23 < size3) {
                    int i24 = i23 + 1;
                    g2 g2Var8 = (g2) arrayList.get(i23);
                    int intValue2 = ((Integer) g2Var8.getTag()).intValue();
                    if (z10 && this.P.M3(intValue2, i19, i21, i20, i22)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    g2Var8.setSelected(z13);
                    i23 = i24;
                }
                y0(!this.P.L3());
                g2 g2Var9 = this.f3154q0;
                if (g2Var9 != null) {
                    if (z10) {
                        Editable K4 = this.P.K4(i19, i21, i20, i22);
                        if (K4 == null) {
                            h = false;
                        } else {
                            h = s6.h(K4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (h) {
                            z12 = true;
                            g2Var9.setSelected(z12);
                        }
                    }
                    z12 = false;
                    g2Var9.setSelected(z12);
                }
                g2 g2Var10 = this.f3158s0;
                if (g2Var10 != null) {
                    if (z10) {
                        Editable K42 = this.P.K4(i19, i21, i20, i22);
                        if (K42 == null) {
                            g10 = false;
                        } else {
                            g10 = s6.g(K42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22));
                        }
                        if (g10) {
                            z11 = true;
                            g2Var10.setSelected(z11);
                        }
                    }
                    z11 = false;
                    g2Var10.setSelected(z11);
                }
                if (z10 && i19 == i20) {
                    z19 = true;
                }
                z0(z19, this.P.o2());
            }
        }
    }

    public final void E0() {
        boolean z10;
        float f7;
        boolean u22 = this.P.u2();
        o2 o2Var = this.P.Q3;
        if (o2Var != null && !o2Var.f3258c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.V;
        float f10 = 0.35f;
        if (imageView != null) {
            imageView.setEnabled(u22);
            ImageView imageView2 = this.V;
            if (u22) {
                f7 = 1.0f;
            } else {
                f7 = 0.35f;
            }
            imageView2.setAlpha(f7);
        }
        ImageView imageView3 = this.W;
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
            ImageView imageView4 = this.W;
            if (z10) {
                f10 = 1.0f;
            }
            imageView4.setAlpha(f10);
        }
    }

    public final void F0() {
        boolean z10;
        int i10 = 0;
        if (!wp.r1(this.currentAccount).p4() && !e20.i(this.currentAccount).q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((g2) obj).setPremiumLocked(z10);
        }
    }

    public final void G0() {
        float f7;
        if (this.f3167y0 == null) {
            return;
        }
        boolean P3 = this.P.P3();
        this.f3167y0.setEnabled(P3);
        ViewPropertyAnimator animate = this.f3167y0.animate();
        if (P3) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        a30.l(animate, f7, 150L);
    }

    public final void H0() {
        f2 f2Var = this.f3167y0;
        if (f2Var == null) {
            return;
        }
        f2Var.setLocked(r0());
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.N;
        arrayList.clear();
        this.O = new b2(this, context);
        setHasOwnBackground(true);
        this.O.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.O.setDefaultFocusHighlightEnabled(false);
        }
        this.E0 = wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        this.F0 = wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
        s1 s1Var = new s1(this, 0);
        this.H0 = s1Var;
        this.O.f31918r.add(s1Var);
        d4 d4Var = new d4(context, this.currentAccount, getResourceProvider(), new a6.i(this, 10));
        this.P = d4Var;
        d4Var.setFileRefParentObject(this.f3155r);
        this.O.addView(this.P, w7.b6.e(-1, -1, 119));
        this.O.addView(this.P.getOverlayView(), w7.b6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.f3136b;
        if (richMessage != null) {
            d4 d4Var2 = this.P;
            ArrayList arrayList2 = d4Var2.f2946s3;
            d4Var2.f2944r3 = richMessage;
            d4.Z2(arrayList2, richMessage.blocks, d4Var2.f2948t3);
            d4Var2.Y3();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                d4Var2.y4((a) arrayList2.get(i10));
            }
            d4Var2.f31183f3.O(false);
        } else {
            String str = this.f3142f;
            if (str != null) {
                d4 d4Var3 = this.P;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.f3150n;
                HashMap hashMap = d4Var3.f2948t3;
                ArrayList arrayList3 = d4Var3.f2946s3;
                if (!TextUtils.isEmpty(charSequence)) {
                    d4.Z2(arrayList3, n5.b(charSequence), hashMap);
                }
                arrayList3.addAll(d4Var3.z4(l4.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    d4.Z2(arrayList3, n5.b(charSequence2), hashMap);
                }
                d4Var3.Y3();
                d4Var3.f31183f3.O(false);
            } else {
                CharSequence charSequence3 = this.f3134a;
                if (charSequence3 != null) {
                    this.P.setInitialText(charSequence3);
                }
            }
        }
        o2 o2Var = this.P.Q3;
        if (o2Var != null) {
            o2Var.j();
        }
        View view = new View(context);
        this.Q = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i11))}));
        this.O.addView(this.Q, w7.b6.e(-1, 68, 55));
        View view2 = new View(context);
        this.R = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.O.addView(this.R, w7.b6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClipChildren(false);
        this.S.setClipToPadding(false);
        this.O.addView(this.S, w7.b6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.T = imageView;
        imageView.setImageResource(2131231241);
        ImageView imageView2 = this.T;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.T;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        imageView3.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(themedColor, org.telegram.ui.ActionBar.t6.w(themedColor2, getThemedColor(i12)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
        ImageView imageView4 = this.T;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView4, i13, resourceProvider, mode);
        w7.e6.a(this.T);
        this.T.setContentDescription(dd.L0(2131754878, null));
        this.T.setOnClickListener(new p1(this, 1));
        this.S.addView(this.T, w7.b6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(0);
        this.U.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.S.addView(this.U, w7.b6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.V = imageView5;
        imageView5.setImageResource(2131231599);
        this.V.setScaleType(scaleType);
        a7.R(this.V, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 1, -1), null, a7.N(i12), getResourceProvider());
        a7.t(this.V, i13, getResourceProvider(), mode);
        w7.e6.a(this.V);
        this.V.setContentDescription(dd.L0(2131743912, null));
        this.V.setOnClickListener(new p1(this, 2));
        this.U.addView(this.V, w7.b6.r(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.W = imageView6;
        imageView6.setImageResource(2131231582);
        this.W.setScaleType(scaleType);
        a7.R(this.W, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 1, -1), null, a7.N(i12), getResourceProvider());
        a7.t(this.W, i13, getResourceProvider(), mode);
        w7.e6.a(this.W);
        this.W.setContentDescription(dd.L0(2131746357, null));
        this.W.setOnClickListener(new p1(this, 3));
        this.U.addView(this.W, w7.b6.r(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.Y.setClipToPadding(false);
        this.O.addView(this.Y, w7.b6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Y.addView(this.Z, w7.b6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f3135a0 = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.f3135a0.setClipChildren(false);
        this.f3135a0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Z.addView(this.f3135a0, w7.b6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X = frameLayout4;
        this.Z.addView(frameLayout4, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.f3139c0 = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        this.f3139c0.setScaleType(scaleType);
        a7.t(this.f3139c0, i13, getResourceProvider(), mode);
        this.f3139c0.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i11), org.telegram.ui.ActionBar.t6.w(getThemedColor(i11), getThemedColor(i12)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
        this.f3135a0.addView(this.f3139c0, w7.b6.q(44, 44, 0.0f, 19, 0, 0, 8, 0));
        w7.e6.a(this.f3139c0);
        this.f3139c0.setContentDescription(dd.L0(2131755006, null));
        this.f3139c0.setOnClickListener(new p1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, w7.b6.e(-2, 44, 81));
        c2 c2Var = new c2(context, 0);
        this.f3140d0 = c2Var;
        c2Var.setClipToOutline(true);
        this.f3140d0.setOutlineProvider(new d2(0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f3141e0 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.f3141e0.setOrientation(0);
        this.f3140d0.addView(this.f3141e0);
        frameLayout6.addView(this.f3140d0, w7.b6.c(-1.0f, -1));
        fg fgVar = new fg(context, 24);
        this.f3137b0 = fgVar;
        fgVar.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        a7.t(this.f3137b0, i13, getResourceProvider(), mode);
        a7.R(this.f3137b0, org.telegram.ui.ActionBar.t6.b0(getThemedColor(i11), getThemedColor(i12), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f)), a7.N(i11), a7.N(i12), getResourceProvider());
        this.f3137b0.j(dg.e, false);
        this.f3141e0.addView(this.f3137b0, w7.b6.r(38, 38, 16));
        w7.e6.a(this.f3137b0);
        this.f3137b0.setContentDescription(dd.L0(2131754884, null));
        this.f3137b0.setOnClickListener(new p1(this, 5));
        h0(2131231596, 1, false).setOnClickListener(new ag.t0(3, this, context));
        h0(2131231568, 2, true).setOnClickListener(new p1(this, 6));
        h0(2131231585, 4, true).setOnClickListener(new p1(this, 7));
        h0(2131231570, 7, true).setOnClickListener(new p1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.f3144g0 = imageView8;
        imageView8.setImageResource(2131232488);
        this.f3144g0.setScaleType(scaleType);
        a7.t(this.f3144g0, i13, getResourceProvider(), mode);
        a7.R(this.f3144g0, org.telegram.ui.ActionBar.t6.b0(getThemedColor(i11), getThemedColor(i12), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f)), a7.N(i11), a7.N(i12), getResourceProvider());
        this.f3141e0.addView(this.f3144g0, w7.b6.t(38, 38, 16, 2, 0, 0, 0));
        w7.e6.a(this.f3144g0);
        this.f3144g0.setContentDescription(dd.L0(2131754921, null));
        this.f3144g0.setOnClickListener(new p1(this, 9));
        this.f3135a0.addView(frameLayout5, w7.b6.l(1.0f, 0, 44));
        s71 s71Var = new s71(this, context, 1);
        this.f3145h0 = s71Var;
        s71Var.setOrientation(0);
        this.f3145h0.setClipToPadding(false);
        this.f3145h0.setClipChildren(false);
        this.f3145h0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Y.addView(this.f3145h0, w7.b6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.f3161v0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.f3161v0.setClipToPadding(false);
        this.f3161v0.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.Y.addView(this.f3161v0, w7.b6.e(80, 60, 81));
        ?? imageView9 = new ImageView(context);
        this.f3163w0 = imageView9;
        imageView9.f(2131624041, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), null);
        ci0 animatedDrawable = this.f3163w0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.K(0);
            animatedDrawable.P(0);
        }
        this.f3163w0.setScaleType(scaleType);
        a7.t(this.f3163w0, i13, getResourceProvider(), mode);
        this.f3163w0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.f3161v0.addView(this.f3163w0, w7.b6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.f3145h0.addView(frameLayout8, w7.b6.c(44.0f, -2));
        e2 e2Var = new e2(this, context);
        this.f3147j0 = e2Var;
        e2Var.setHorizontalScrollBarEnabled(false);
        this.f3147j0.setClipToOutline(true);
        this.f3147j0.setOutlineProvider(new d2(1));
        frameLayout8.addView(this.f3147j0, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f3146i0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f3146i0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.f3147j0.addView(this.f3146i0, new FrameLayout.LayoutParams(-2, -1));
        i0(context, 2131231199, 1, false);
        i0(context, 2131231201, 2, false);
        i0(context, 2131231207, 16, false);
        i0(context, 2131231206, 8, false);
        i0(context, 2131231205, 256, false);
        i0(context, 2131231552, 4, false);
        i0(context, 2131231202, 65536, true);
        i0(context, 2131231583, 16384, true);
        i0(context, 2131231584, 32768, true);
        g2 g2Var = new g2(2131231581, context, getResourceProvider());
        this.f3160u0 = g2Var;
        g2Var.setContentDescription(dd.L0(2131746455, null));
        this.f3160u0.setOnClickListener(new p1(this, 11));
        LinearLayout linearLayout5 = this.f3146i0;
        linearLayout5.addView(this.f3160u0, w7.b6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        g2 g2Var2 = new g2(2131231549, context, getResourceProvider());
        this.f3156r0 = g2Var2;
        g2Var2.setContentDescription(dd.L0(2131746028, null));
        this.f3156r0.setOnClickListener(new p1(this, 12));
        LinearLayout linearLayout6 = this.f3146i0;
        linearLayout6.addView(this.f3156r0, w7.b6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.f3151n0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.f3151n0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.f3151n0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.f3145h0.addView(this.f3151n0, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var3 = new g2(2131231744, context, getResourceProvider());
        this.f3154q0 = g2Var3;
        g2Var3.setContentDescription(dd.L0(2131751745, null));
        this.f3154q0.setOnClickListener(new p1(this, 13));
        this.f3151n0.addView(this.f3154q0, w7.b6.r(38, 38, 16));
        g2 g2Var4 = new g2(2131232076, context, getResourceProvider());
        this.f3158s0 = g2Var4;
        g2Var4.setContentDescription(dd.L0(2131754862, null));
        this.f3158s0.setOnClickListener(new p1(this, 14));
        this.f3151n0.addView(this.f3158s0, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.f3152o0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.f3152o0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.f3152o0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.f3145h0.addView(this.f3152o0, w7.b6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        g2 g2Var5 = new g2(2131231570, context, getResourceProvider());
        this.f3159t0 = g2Var5;
        g2Var5.d();
        arrayList.add(this.f3159t0);
        this.f3159t0.setContentDescription(dd.L0(2131754864, null));
        this.f3159t0.setOnClickListener(new p1(this, 15));
        this.f3152o0.addView(this.f3159t0, w7.b6.r(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.m0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.m0.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        this.m0.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i11))));
        this.f3145h0.addView(this.m0, 0, w7.b6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        g2 g2Var6 = new g2(0, context, getResourceProvider());
        this.f3153p0 = g2Var6;
        g2Var6.setImageDrawable(new org.telegram.ui.ActionBar.y2(context));
        this.f3153p0.setContentDescription(dd.L0(2131755006, null));
        this.f3153p0.setOnClickListener(new p1(this, 16));
        this.m0.addView(this.f3153p0, w7.b6.r(38, 38, 16));
        f2 f2Var = new f2(this, context, this.f3155r != null ? 2131231502 : q0() ? 2131231512 : 2131232691, getResourceProvider());
        this.f3167y0 = f2Var;
        f2Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(org.telegram.ui.ActionBar.t6.Me))));
        w7.e6.a(this.f3167y0);
        this.f3135a0.addView(this.f3167y0, w7.b6.q(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.f3167y0.setContentDescription(dd.L0(2131745657, null));
        this.f3167y0.setOnClickListener(new p1(this, 0));
        this.f3167y0.setOnLongClickListener(new h1(this, 1));
        H0();
        this.O.setPadding(0, org.telegram.messenger.i0.f16166m, 0, 0);
        m0();
        C0(0, false);
        E0();
        this.O.getViewTreeObserver().addOnGlobalFocusChangeListener(new l(this, 1));
        F0();
        if (this.e) {
            this.P.F2();
            this.e = false;
        }
        b2 b2Var = this.O;
        this.fragmentView = b2Var;
        return b2Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14709f5) {
            H0();
            F0();
        }
    }

    public final g2 h0(int i10, int i11, boolean z10) {
        int i12;
        g2 g2Var = new g2(i10, this.f3141e0.getContext(), getResourceProvider());
        if (z10) {
            g2Var.d();
            this.N.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(l0(i11));
        this.f3143f0.add(g2Var);
        LinearLayout linearLayout = this.f3141e0;
        if (linearLayout.getChildCount() == 0) {
            i12 = 0;
        } else {
            i12 = 2;
        }
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, i12, 0, 0, 0));
        return g2Var;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final void i0(Context context, int i10, int i11, boolean z10) {
        int i12;
        g2 g2Var = new g2(i10, context, getResourceProvider());
        if (z10) {
            g2Var.d();
            this.N.add(g2Var);
        }
        g2Var.setTag(Integer.valueOf(i11));
        g2Var.setContentDescription(n0(i11));
        g2Var.setOnClickListener(new bh.f(this, i11, 2));
        this.f3149l0.add(g2Var);
        LinearLayout linearLayout = this.f3146i0;
        if (linearLayout.getChildCount() > 0) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        linearLayout.addView(g2Var, w7.b6.t(38, 38, 16, i12, 0, 0, 0));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        d4 d4Var = this.P;
        if (d4Var != null && d4Var.f2950u3.x()) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q0, f7);
        this.P0 = ofFloat;
        ofFloat.addUpdateListener(new q1(this, 0));
        this.P0.setInterpolator(gr.h);
        this.P0.setDuration(250L);
        this.P0.start();
    }

    public final void k0() {
        FrameLayout.LayoutParams layoutParams;
        int max;
        vy vyVar = this.A0;
        if (vyVar != null && (layoutParams = (FrameLayout.LayoutParams) vyVar.getLayoutParams()) != null) {
            int o02 = o0();
            b2 b2Var = this.O;
            if (b2Var == null) {
                max = o0();
            } else {
                max = Math.max(o0(), ((b2Var.getMeasuredHeight() - this.O.getPaddingTop()) - org.telegram.messenger.i0.L(240.0f)) - this.T0);
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
        vy vyVar = this.A0;
        if (vyVar != null && (layoutParams = (FrameLayout.LayoutParams) vyVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.T0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.A0.setLayoutParams(layoutParams);
            }
        }
        k0();
        int max = Math.max(Math.max(this.D0, this.T0), this.U0);
        this.P.setPadding(0, org.telegram.messenger.i0.L(60.0f), 0, org.telegram.messenger.i0.L(110.0f) + max);
        d4 d4Var = this.P;
        int i12 = this.T0;
        int i13 = this.U0;
        int i14 = this.D0;
        d4Var.V3 = i12;
        d4Var.W3 = i13;
        d4Var.X3 = i14;
        int i15 = -max;
        this.Y.setTranslationY(i15);
        this.R.setTranslationY(i15 + this.T0);
    }

    public final int o0() {
        int i10;
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            i10 = this.F0;
        } else {
            i10 = this.E0;
        }
        if (i10 <= 0) {
            return org.telegram.messenger.i0.L(200.0f);
        }
        return i10;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1 && i10 == 21) {
            if (intent != null && intent.getData() != null) {
                d4 d4Var = this.P;
                Uri data = intent.getData();
                if (data == null) {
                    d4Var.getClass();
                } else if (d4Var.getContext() != null) {
                    Utilities.e.c(new a1.f(19, d4Var, data));
                }
            }
        } else if (i11 == -1 && (i10 == 1 || i10 == 14)) {
            if (intent != null && intent.getData() != null) {
                this.P.h2(intent.getData());
            }
        } else {
            super.onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.C0;
        if (z11) {
            if (z11) {
                this.C0 = false;
                vy vyVar = this.A0;
                if (vyVar != null) {
                    vyVar.t(false);
                    this.A0.B();
                }
                j0(false);
                return false;
            }
        } else if (this.B0) {
            p0(true);
            return false;
        } else if (!this.P.I2()) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        float f7;
        if (!z10 && !this.V0) {
            v0();
            this.V0 = true;
        }
        if (!org.telegram.messenger.i0.Q1() && this.f3157s != null && this.f3162w != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            zg.e eVar = this.f3157s;
            this.f3166y = eVar.f55762f;
            eVar.e = false;
            eVar.invalidate();
            this.f3162w.setAlpha(0.0f);
            this.f3162w.A1.setVisibility(4);
            A0();
            float f10 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            this.I = f7;
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            this.E = true;
            this.O.invalidate();
            ofFloat.addUpdateListener(new q1(this, 1));
            ofFloat.addListener(new bg.f(2, this, runnable));
            if (!z10) {
                FrameLayout frameLayout = this.S;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, property, 0.0f);
                FrameLayout frameLayout2 = this.S;
                Property property2 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, property2, -org.telegram.messenger.i0.L(16.0f)), ObjectAnimator.ofFloat(this.Z, property, 0.0f), ObjectAnimator.ofFloat(this.Z, property2, org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.Q, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.R, property, 1.0f, 0.0f));
            } else {
                FrameLayout frameLayout3 = this.S;
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, property3, 0.0f, 1.0f);
                FrameLayout frameLayout4 = this.S;
                Property property4 = View.TRANSLATION_Y;
                animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, property4, -org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.Z, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, property4, org.telegram.messenger.i0.L(16.0f), 0.0f), ObjectAnimator.ofFloat(this.P, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Q, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.R, property3, 0.0f, 1.0f));
            }
            animatorSet.setDuration(420L);
            animatorSet.setInterpolator(gr.h);
            this.O.post(new qr0(animatorSet, 4));
            return animatorSet;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.f14709f5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        s1 s1Var;
        at.f(this.currentAccount).n(this, at.f14709f5);
        if (!this.V0) {
            v0();
            this.V0 = true;
        }
        v1 v1Var = this.N0;
        if (v1Var != null) {
            this.N0 = null;
            org.telegram.messenger.i0.g3(v1Var);
        }
        ih0 ih0Var = this.O0;
        if (ih0Var != null) {
            ih0Var.h();
            this.O0 = null;
        }
        d4 d4Var = this.P;
        if (d4Var != null) {
            d4Var.J2();
        }
        m.p3 p3Var = this.f3168z0;
        if (p3Var != null) {
            p3Var.a();
        }
        super.onFragmentDestroy();
        vy vyVar = this.A0;
        if (vyVar != null) {
            vyVar.C();
        }
        b2 b2Var = this.O;
        if (b2Var != null && (s1Var = this.H0) != null) {
            b2Var.f31918r.remove(s1Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.T0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
        layoutParams.height = org.telegram.messenger.i0.L(68.0f) + this.T0;
        this.R.setLayoutParams(layoutParams);
        m0();
    }

    @Override
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        boolean z10;
        z60 z60Var;
        i0.c f7 = j1Var.f46143a.f(3);
        int i10 = j1Var.f46143a.f(8).d;
        this.U0 = i10;
        int i11 = i10 - f7.d;
        boolean z11 = this.G0;
        if (i11 > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G0 = z10;
        if (z10 && i11 > org.telegram.messenger.i0.L(50.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                this.F0 = i11;
                wp.c1().edit().putInt("kbd_height_land3", this.F0).commit();
            } else {
                this.E0 = i11;
                wp.c1().edit().putInt("kbd_height", this.E0).commit();
            }
        }
        if (this.G0 && !z11 && this.B0 && !this.C0) {
            p0(false);
        }
        if (!this.G0 && z11 && (z60Var = this.f3165x0) != null) {
            z60Var.u();
            this.f3165x0 = null;
        }
        onInsets(f7.f7766a, f7.f7767b, f7.f7768c, f7.d);
        return r0.j1.f46142b;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
            int themedColor = getThemedColor(i10);
            int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.t6.Me;
            int themedColor3 = getThemedColor(i12);
            if (!this.Z0 || themedColor != this.W0 || themedColor2 != this.X0 || themedColor3 != this.Y0) {
                this.Z0 = true;
                this.W0 = themedColor;
                this.X0 = themedColor2;
                this.Y0 = themedColor3;
                View view = this.Q;
                if (view != null) {
                    view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getThemedColor(i10), org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i10))}));
                }
                View view2 = this.R;
                if (view2 != null) {
                    view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
                }
                ImageView imageView = this.T;
                if (imageView != null) {
                    imageView.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i10), org.telegram.ui.ActionBar.t6.w(getThemedColor(i10), getThemedColor(i11)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
                }
                LinearLayout linearLayout = this.U;
                if (linearLayout != null) {
                    linearLayout.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
                }
                ImageView imageView2 = this.f3139c0;
                if (imageView2 != null) {
                    imageView2.setBackground(new j2(org.telegram.ui.ActionBar.t6.b0(getThemedColor(i10), org.telegram.ui.ActionBar.t6.w(getThemedColor(i10), getThemedColor(i11)), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f))));
                }
                fi0 fi0Var = this.f3163w0;
                if (fi0Var != null) {
                    fi0Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
                }
                LinearLayout linearLayout2 = this.f3151n0;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
                }
                LinearLayout linearLayout3 = this.f3152o0;
                if (linearLayout3 != null) {
                    linearLayout3.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
                }
                LinearLayout linearLayout4 = this.m0;
                if (linearLayout4 != null) {
                    linearLayout4.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i10))));
                }
                f2 f2Var = this.f3167y0;
                if (f2Var != null) {
                    f2Var.setBackground(new j2(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), getThemedColor(i12))));
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        d4 d4Var;
        int i10;
        d4 d4Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i10 = this.f3138c) >= 0 && (d4Var2 = this.P) != null) {
            int i11 = this.d;
            this.d = -1;
            this.f3138c = -1;
            if (!d4Var2.b2(i10, i11)) {
                d4Var2.post(new w2(d4Var2, i10, i11, 0));
            }
        } else if (z10 && !z11) {
            if ((this.f3136b != null || this.f3142f != null) && (d4Var = this.P) != null && !d4Var.d3()) {
                d4Var.post(new b(d4Var, 5));
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.C0) {
            this.C0 = false;
            vy vyVar = this.A0;
            if (vyVar != null) {
                vyVar.t(false);
                this.A0.B();
            }
        }
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P0 = null;
        }
        this.Q0 = 0.0f;
        this.R0 = null;
        vy vyVar2 = this.A0;
        if (vyVar2 != null) {
            vyVar2.setTranslationY(0.0f);
            this.A0.setVisibility(8);
        }
        if (this.B0 || this.D0 != 0) {
            this.B0 = false;
            this.D0 = 0;
            m0();
        }
        fg fgVar = this.f3137b0;
        if (fgVar != null) {
            fgVar.j(dg.e, z10);
        }
    }

    public final boolean q0() {
        un unVar;
        if (this.f3155r == null && (unVar = this.J) != null && unVar.c()) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if (!wp.r1(this.currentAccount).p4() && !e20.i(this.currentAccount).q()) {
            d4 d4Var = this.P;
            if (n5.d(d4Var.f2946s3, d4Var.f2948t3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s0() {
        u3 k22 = this.P.k2();
        if (k22 != null) {
            TL_iv.RichMessage a2 = k22.a();
            if (a2.blocks.isEmpty()) {
                return;
            }
            org.telegram.ui.Components.g0 g0Var = new org.telegram.ui.Components.g0(getParentActivity(), getResourceProvider());
            g0Var.s1(a2);
            g0Var.f26241c2 = new ag.l(k22, 6);
            g0Var.show();
        }
    }

    public final void t0(int i10, int i11) {
        d4 d4Var = this.P;
        d4Var.f2932j4 = d4Var.T2();
        bi biVar = new bi(getParentActivity(), this, false, false, true, getResourceProvider());
        biVar.T3 = new y1(this, biVar);
        biVar.a2.setIncludeVideosInGallery(true);
        biVar.a2.g0();
        biVar.x1(1, true);
        biVar.U0(i10);
        biVar.f24806q4 = new x1(this, biVar);
        biVar.P1 = new x1(this, biVar);
        biVar.O1 = new z1(this, biVar);
        biVar.d1();
        if (i11 != 0) {
            biVar.n1(i11);
        }
        biVar.A0(true);
        biVar.show();
    }

    public final boolean v0() {
        TL_iv.RichMessage m22;
        Runnable runnable;
        if (this.J == null || this.f3155r != null || !this.P.u2()) {
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
        mk mkVar = this.J.Z;
        if (m22 != null && !this.M) {
            d4 d4Var = this.P;
            if (d4Var.n3() && !n5.d(d4Var.f2946s3, d4Var.f2948t3) && mkVar != null) {
                SpannableStringBuilder g10 = n5.g(this.P.f2946s3);
                un unVar = mkVar.P2;
                if (mkVar.E0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g10);
                org.telegram.messenger.k6.m(spannableStringBuilder, mkVar.E0.getPaint().getFontMetricsInt(), false, null, 0);
                org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.o5.class);
                if (o5VarArr != null) {
                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                        o5Var.applyFontMetrics(mkVar.E0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.f5.f());
                    }
                }
                xh0.a(spannableStringBuilder);
                if (unVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    vi.b0(mkVar.Q).Q1(unVar.a(), unVar.N7(unVar.D5), charSequenceArr[0], vi.b0(mkVar.Q).W(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                mkVar.setRichDraftPreview(null);
                if (mkVar.E0.getText() != null) {
                    mkVar.E0.getText().clear();
                }
                mkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        vi mediaDataController = getMediaDataController();
        long a2 = this.J.a();
        un unVar2 = this.J;
        mediaDataController.Q1(a2, unVar2.N7(unVar2.D5), "", null, null, null, null, 0L, false, false, m22);
        TL_iv.RichMessage richMessage = m22;
        if (mkVar == null) {
            return true;
        }
        mkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void w0() {
        if (r0()) {
            Activity parentActivity = getParentActivity();
            d4 d4Var = this.P;
            Objects.requireNonNull(d4Var);
            u0(parentActivity, new b(d4Var, 0), new o1(this, 4), getResourceProvider());
        } else if (q0()) {
            org.telegram.ui.Components.s4.L(getParentActivity(), this.J.a(), new k6.h(this, 11), getResourceProvider());
        } else {
            x0(0, 0, true);
        }
    }

    public final void x0(final int i10, final int i11, final boolean z10) {
        mk mkVar;
        sf sfVar;
        if (r0()) {
            Activity parentActivity = getParentActivity();
            d4 d4Var = this.P;
            Objects.requireNonNull(d4Var);
            u0(parentActivity, new b(d4Var, 0), new o1(this, 4), getResourceProvider());
        } else if (this.J != null && this.P.n3() && !this.P.p3()) {
            if (!this.P.P3()) {
                G0();
            } else if (!wp.r1(this.currentAccount).p4()) {
                mk mkVar2 = this.J.Z;
                if (mkVar2 != null) {
                    this.M = true;
                    Runnable runnable = this.K;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mkVar2.P0(n5.g(this.P.f2946s3), z10, i10, i11);
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
                final ArrayList a2 = m5.a(this.currentAccount, c32);
                final long a10 = this.J.a();
                un unVar = this.J;
                final kj kjVar = unVar.D5;
                final kj kjVar2 = unVar.l4;
                final kn knVar = unVar.B5;
                final long e92 = unVar.e9();
                final tw T8 = this.J.T8();
                final kj kjVar3 = this.f3155r;
                ?? r02 = new Runnable() {
                    @Override
                    public final void run() {
                        k2.d0(k2.this, kjVar3, c32, E2, B2, a2, a10, kjVar, kjVar2, knVar, z10, i10, i11, T8, e92);
                    }
                };
                Runnable runnable2 = this.K;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (kjVar3 == null && (mkVar = this.J.Z) != null && (sfVar = mkVar.Z2) != null) {
                    sfVar.E(null, z10, i10, i11, 0L);
                }
                if (i10 != 0 && kjVar3 == null) {
                    this.N0 = r02;
                    finishFragment();
                    return;
                }
                r02.run();
                finishFragment();
            }
        }
    }

    public final void y0(boolean z10) {
        ArrayList arrayList = this.f3149l0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g2 g2Var = (g2) obj;
            if (((Integer) g2Var.getTag()).intValue() == 1) {
                g2Var.setEnabled(z10);
            }
        }
    }

    public final void z0(boolean z10, boolean z11) {
        g2 g2Var = this.f3154q0;
        if (g2Var != null) {
            g2Var.setEnabled(z10);
        }
        g2 g2Var2 = this.f3156r0;
        if (g2Var2 != null) {
            g2Var2.setEnabled(z11);
        }
        g2 g2Var3 = this.f3158s0;
        if (g2Var3 != null) {
            g2Var3.setEnabled(z10);
        }
        g2 g2Var4 = this.f3159t0;
        if (g2Var4 != null) {
            g2Var4.setEnabled(z10);
        }
    }

    public k2(String str) {
        super(null);
        this.f3138c = -1;
        this.d = -1;
        this.f3164x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f3143f0 = new ArrayList();
        this.f3148k0 = Integer.MAX_VALUE;
        this.f3149l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.f3142f = str;
    }

    public k2(TL_iv.RichMessage richMessage) {
        super(null);
        this.f3138c = -1;
        this.d = -1;
        this.f3164x = new Rect();
        this.F = new int[2];
        this.I = 1.0f;
        this.N = new ArrayList();
        this.f3143f0 = new ArrayList();
        this.f3148k0 = Integer.MAX_VALUE;
        this.f3149l0 = new ArrayList();
        this.I0 = 0;
        this.K0 = -1;
        this.M0 = new o1(this, 0);
        this.f3136b = richMessage;
    }
}
