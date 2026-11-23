package di;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bj;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.messenger.yi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.op;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class mc extends org.telegram.ui.ActionBar.w2 implements gs {
    public long A1;
    public final fi.r0 B1;
    public final fi.m0 C1;
    public final View D1;
    public final op E1;
    public final bc F1;
    public final gj G1;
    public final ArrayList H1;
    public final b I1;
    public int J1;
    public fi.a2 K1;
    public int L1;
    public v6 M1;
    public final nq[] N1;
    public boolean O1;
    public boolean P1;
    public bn Q1;
    public View R1;
    public ValueAnimator S1;
    public final org.telegram.ui.ActionBar.h6 f9333m1;
    public final int n1;
    public final boolean f9334o1;
    public final boolean f9335p1;
    public final LinearLayout f9336q1;
    public final FrameLayout f9337r1;
    public final LinearLayout f9338s1;
    public final wb f9339t1;
    public final FrameLayout f9340u1;
    public final FrameLayout f9341v1;
    public final org.telegram.ui.Components.q9 f9342w1;
    public final hi.d f9343x1;
    public final lc f9344y1;
    public long f9345z1;

    public mc(Context context, final int i7, final long j3, bn bnVar, gj gjVar, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        long j11;
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        String str;
        int[] iArr;
        String a02;
        String str2;
        TLRPC.MessageReactor messageReactor2;
        boolean z14;
        Context context2;
        int i10;
        int i11;
        int i12;
        float f14;
        this.N1 = new nq[1];
        this.P1 = false;
        this.f9333m1 = h6Var;
        this.n1 = i7;
        this.G1 = gjVar;
        this.H1 = arrayList;
        this.f9334o1 = z11;
        this.f9335p1 = z10;
        b bVar = new b(i7, context, h6Var);
        this.I1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.f30145c.addView(bVar, c8.na.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.sa.a(bVar);
        bVar.setOnClickListener(new bi.p(1, context, h6Var));
        long e10 = k10.i(i7).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o4 = org.telegram.messenger.n5.o(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    o4 = e10;
                }
                if (messageReactor4.my || o4 == e10) {
                    messageReactor3 = messageReactor4;
                }
            }
            messageReactor = messageReactor3;
        } else {
            messageReactor = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (arrayList != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    } else if (((TLRPC.MessageReactor) arrayList.get(i14)).my) {
                        TLRPC.MessageReactor messageReactor5 = (TLRPC.MessageReactor) arrayList.get(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            j11 = e10;
            this.f9345z1 = j10;
        } else {
            j11 = e10;
            this.f9345z1 = y8.y(i7, false).B(gjVar);
        }
        long j12 = this.f9345z1;
        this.A1 = j12 == 2666000 ? j11 : j12;
        P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, h6Var));
        this.J1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9336q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9337r1 = frameLayout;
        linearLayout.addView(frameLayout, c8.na.o(-1, -2));
        this.f9339t1 = new wb(this, context, h6Var, z11, i7);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = np.u1(i7).f25783c6;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 < 9) {
                int i16 = iArr2[i15];
                z13 = z12;
                if (i16 > j13) {
                    arrayList2.add(Integer.valueOf((int) j13));
                    break;
                }
                arrayList2.add(Integer.valueOf(i16));
                if (iArr2[i15] == j13) {
                    break;
                }
                i15++;
                z12 = z13;
            } else {
                z13 = z12;
                break;
            }
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            iArr3[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        wb wbVar = this.f9339t1;
        wbVar.f9106f0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                wbVar.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.f9337r1;
            wb wbVar2 = this.f9339t1;
            if (z11) {
                f10 = -50.0f;
            } else {
                f10 = 0.0f;
            }
            if (z11 && !z13) {
                f11 = -40.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout2.addView(wbVar2, c8.na.d(-1, -2.0f, 55, 0.0f, f10, 0.0f, f11));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9338s1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.f9337r1.addView(linearLayout2, c8.na.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9340u1 = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f9341v1 = frameLayout4;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.m6.f29438i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i18);
        frameLayout4.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout4, d02, M, null, h6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f9342w1 = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        q9Var.getImageReceiver().B0 = true;
        N0();
        frameLayout4.addView(q9Var, c8.na.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i19 = org.telegram.ui.ActionBar.m6.f29605r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i19, h6Var, mode);
        imageView.setImageResource(2131230873);
        frameLayout4.addView(imageView, c8.na.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, c8.na.e(52, 28, 17));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout3, c8.na.q(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        c8.sa.a(frameLayout3);
        e0.g(i7).o();
        xb xbVar = new xb(context, 0);
        int i20 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(xbVar, i20, h6Var);
        xbVar.setTextSize(1, 20.0f);
        xbVar.setGravity(17);
        xbVar.setText(hd.N0(2131744797, null));
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(xbVar, c8.na.q(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        M0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231269);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, mode);
        c8.sa.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final mc f9731b;

            {
                this.f9731b = this;
            }

            @Override
            public final void onClick(View view) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f9731b.dismiss();
                        return;
                    default:
                        mc mcVar = this.f9731b;
                        op opVar = mcVar.E1;
                        opVar.a(!opVar.f38291a.f32840q, true);
                        if (opVar.f38291a.f32840q) {
                            j14 = mcVar.A1;
                        } else {
                            j14 = 2666000;
                        }
                        mcVar.f9345z1 = j14;
                        mcVar.N0();
                        lc lcVar = mcVar.f9344y1;
                        if (lcVar != null) {
                            lcVar.setMyPrivacy(mcVar.f9345z1);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, c8.na.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.f9337r1;
        if (z11) {
            f13 = 0.0f;
        } else {
            if (z10) {
                f12 = 179.0f;
            } else {
                f12 = 45.0f;
            }
            f13 = f12;
        }
        frameLayout5.addView(linearLayout3, c8.na.d(-1, -2.0f, 55, 0.0f, f13, 0.0f, 15.0f));
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, i20, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = hd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            if (O0 == null) {
                str = "";
            } else {
                str = O0.title;
            }
            iArr = null;
            a02 = hd.a0(null, null, 2131744802, str);
        }
        textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, c8.na.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z13) {
            if (!z11) {
                linearLayout3.addView(new yb(context, h6Var), c8.na.t(-1, 30, 55, 0, 20, 0, 0));
            }
            lc lcVar = new lc(this, context, z11);
            this.f9344y1 = lcVar;
            lcVar.setOnSenderClickListener(new y10() {
                @Override
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    int i21 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                    mc mcVar = mc.this;
                    boolean z15 = z11;
                    if (i21 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == k10.i(i7).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new zb(mcVar, bundle, z15));
                        mcVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new ac(mcVar, bundle2, z15));
                    }
                    mcVar.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f9336q1;
            if (z11) {
                f14 = -50.0f;
            } else {
                f14 = 0.0f;
            }
            linearLayout4.addView(lcVar, c8.na.k(0.0f, f14, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.D1 = view;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29348d7, view, h6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f9336q1.addView(view, c8.na.n(1.0f / org.telegram.messenger.g0.f24009p, -1, 7, 24, 0, 24, 0));
            }
            str2 = null;
        } else {
            str2 = null;
            this.f9344y1 = null;
            this.D1 = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.m6.f29455j5;
            TextView b10 = c8.wa.b(context, 20.0f, i21, true, h6Var);
            b10.setGravity(17);
            if (z10) {
                i11 = 2131748598;
            } else {
                i11 = 2131748600;
            }
            b10.setText(hd.N0(i11, str2));
            this.f9336q1.addView(b10, c8.na.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = c8.wa.b(context, 14.0f, i21, false, h6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = 2131748599;
            } else if (z13) {
                i12 = 2131748601;
            } else {
                i12 = 2131748602;
            }
            org.telegram.messenger.f3.q(null, null, i12, new Object[]{org.telegram.messenger.n5.l(k10.f24932t0, j3)}, b11);
            this.f9336q1.addView(b11, c8.na.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.B1 = obj2;
            messageReactor2 = messageReactor;
            obj2.f12480c = this.f9345z1;
            obj2.f12483g = 50L;
            obj2.f12481e = true;
            fi.m0 m0Var = new fi.m0(i7, context, true);
            this.C1 = m0Var;
            m0Var.set(obj2);
            this.f9336q1.addView(m0Var, c8.na.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        op opVar = new op(21, context, h6Var);
        this.E1 = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29457j7, org.telegram.ui.ActionBar.m6.f29477k7);
        opVar.setDrawUnchecked(true);
        if (this.f9345z1 != 2666000) {
            z14 = true;
        } else {
            z14 = false;
        }
        opVar.a(z14, false);
        lc lcVar2 = this.f9344y1;
        if (lcVar2 != null) {
            lcVar2.setMyPrivacy(this.f9345z1);
        }
        opVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i20, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(hd.N0(2131744805, null));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        g10.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        g10.addView(opVar, c8.na.t(21, 21, 16, 0, 0, 9, 0));
        g10.addView(textView2, c8.na.r(-2, -2, 16));
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final mc f9731b;

            {
                this.f9731b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f9731b.dismiss();
                        return;
                    default:
                        mc mcVar = this.f9731b;
                        op opVar2 = mcVar.E1;
                        opVar2.a(!opVar2.f38291a.f32840q, true);
                        if (opVar2.f38291a.f32840q) {
                            j14 = mcVar.A1;
                        } else {
                            j14 = 2666000;
                        }
                        mcVar.f9345z1 = j14;
                        mcVar.N0();
                        lc lcVar3 = mcVar.f9344y1;
                        if (lcVar3 != null) {
                            lcVar3.setMyPrivacy(mcVar.f9345z1);
                            return;
                        }
                        return;
                }
            }
        });
        c8.sa.b(g10, 0.05f, 1.2f);
        int i22 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i22, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i22);
        g10.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(g10, a03, null, M2, h6Var);
        if (!z11 && (z10 || messageReactor2 != null)) {
            LinearLayout linearLayout5 = this.f9336q1;
            if (z13) {
                i10 = 10;
            } else {
                i10 = 4;
            }
            linearLayout5.addView(g10, c8.na.t(-2, -2, 1, 0, i10, 0, 10));
        }
        hi.d dVar = new hi.d(context, h6Var, true);
        this.f9343x1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f9336q1.addView(dVar, c8.na.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        O0(0L);
        dVar.i(pb.Z0(false, hd.a0(null, null, 2131744806, hd.E(50L, ',')), this.N1), true, true);
        if (z10) {
            context2 = context;
            dVar.setOnClickListener(new y9(this, gjVar, bnVar, i7, z11, context, h6Var, j3, O0));
        } else {
            context2 = context;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                long j14;
                boolean z15;
                int i23 = i7;
                e0 g11 = e0.g(i23);
                g11.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g11.f8691l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, k10.i(i23).f());
                mc mcVar = mc.this;
                a70 G = a70.G(mcVar.f30142b, h6Var, mcVar.f9341v1);
                int size2 = arrayList3.size();
                int i24 = 0;
                while (i24 < size2) {
                    int i25 = i24 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i24);
                    if (tLObject instanceof TLRPC.User) {
                        j14 = ((TLRPC.User) tLObject).f28547id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.v3.V(chat)) {
                                j14 = -chat.f28398id;
                            }
                        }
                        i24 = i25;
                    }
                    if (j14 != j3) {
                        long j15 = mcVar.f9345z1;
                        if (j14 != j15 && (j15 != 0 || j14 != k10.i(i23).e())) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        G.g(tLObject, z15, new vb(mcVar, j14, z11, 0));
                    }
                    i24 = i25;
                }
                G.f33365t = false;
                G.f33333b0 = true;
                G.f33363s = 0;
                G.W(5);
                G.a0();
            }
        });
        m80 m80Var = new m80(context2, h6Var);
        m80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29758z6, h6Var);
        if (z11 && !z10) {
            m80Var.setText(hd.N0(2131748603, null));
        } else {
            m80Var.setText(org.telegram.messenger.g0.T2(hd.N0(2131744804, null), new bi.h2(context2, 7)));
        }
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.f29475k5, h6Var);
        if (z10 || z11) {
            this.f9336q1.addView(m80Var, c8.na.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.O = this.f9336q1;
        bc bcVar = new bc(context2, 1, 2, 0);
        this.F1 = bcVar;
        vg.g gVar = bcVar.f59470b;
        gVar.f59454z = org.telegram.ui.ActionBar.m6.Wk;
        gVar.A = org.telegram.ui.ActionBar.m6.Xk;
        gVar.b();
        bcVar.f59470b.f59440k = 1.0f;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        this.f30145c.addView(bcVar, c8.na.c(150.0f, 150));
        this.f9339t1.setValue(50);
        if (arrayList != null) {
            long j14 = 0;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > 0) {
                this.f9339t1.setStarsTop(j14 + 1);
            }
        }
    }

    @Override
    public final void F(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float[] fArr = {f10};
        b bVar = this.I1;
        arrayList.add(ObjectAnimator.ofFloat(bVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property2, f11));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(bVar, property3, f12));
    }

    @Override
    public final boolean G() {
        if (this.f9339t1.f9112l0) {
            return false;
        }
        return this.f30146c0;
    }

    public final void K0(final u8 u8Var) {
        ch.n0 n0Var;
        View view;
        ch.q0 q0Var;
        fi.a2 a2Var;
        View view2;
        ch.q0 q0Var2;
        ch.n0 n0Var2;
        gj gjVar;
        wb wbVar = this.f9339t1;
        bc bcVar = this.F1;
        gj gjVar2 = this.G1;
        if (gjVar2 != null && (view2 = this.Q1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.R1;
            if (view3 instanceof org.telegram.ui.Cells.r1) {
                q0Var2 = ((org.telegram.ui.Cells.r1) view3).O;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                q0Var2 = ((org.telegram.ui.Cells.v0) view3).F0;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else {
                q0Var2 = null;
                n0Var2 = null;
            }
            if (n0Var2 == null && q0Var2 != null) {
                bj u92 = this.Q1.u9(gjVar2);
                if (u92 != null && !u92.f23077e.isEmpty()) {
                    ArrayList arrayList = u92.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            gjVar = (gj) obj;
                            yi d = u92.d(gjVar);
                            if (d != null) {
                                int i10 = d.f28065l;
                                if ((i10 & 1) != 0 && (i10 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            gjVar = null;
                            break;
                        }
                    }
                    if (gjVar != null) {
                        view3 = this.Q1.J8(gjVar.e1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.r1) {
                        q0Var2 = ((org.telegram.ui.Cells.r1) view3).O;
                        q0Var2.getClass();
                        n0Var2 = q0Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (n0Var2 != null) {
                q0Var = q0Var2;
                n0Var = n0Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.K1 == null) {
            return;
        } else {
            n0Var = null;
            view = null;
            q0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        wbVar.getLocationInWindow(iArr);
        rectF.set(wbVar.H.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        qb qbVar = new qb(this, 2);
        bcVar.f59471b0 = qbVar;
        if (bcVar.f59469a0) {
            bcVar.f59471b0 = null;
            qbVar.run();
        }
        if (n0Var != null) {
            n0Var.f5436k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ch.n0 n0Var3 = n0Var;
        fi.m0[] m0VarArr = new fi.m0[1];
        if (this.f9334o1 && (a2Var = this.K1) != null) {
            m0VarArr[0] = a2Var.d(this.L1);
        }
        final RectF rectF2 = new RectF();
        final m6 m6Var = new m6(this, m0VarArr, iArr, rectF2, view, q0Var, n0Var3, 3);
        View view4 = view;
        m6Var.run();
        bcVar.setPaused(false);
        bcVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        bcVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        bcVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        bcVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        bcVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
        ValueAnimator valueAnimator = this.S1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m6Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                mc mcVar = mc.this;
                bc bcVar2 = mcVar.F1;
                bcVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                bcVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                bcVar2.setScaleX(T1);
                bcVar2.setScaleY(T1);
                vg.g gVar = bcVar2.f59470b;
                gVar.d = 360.0f * floatValue;
                gVar.f59440k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        mcVar.f30145c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = u8Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.S1.addListener(new cc(this, n0Var3, view4, m0VarArr, zArr, rectF2, u8Var));
        this.S1.setDuration(800L);
        this.S1.setInterpolator(new c5.c(1));
        this.S1.start();
    }

    @Override
    public final void L() {
        ValueAnimator valueAnimator = this.S1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.L();
    }

    public final boolean L0() {
        if (!this.f9334o1) {
            e0 g10 = e0.g(this.n1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f8691l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.v3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void M0(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f9340u1;
        int i7 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != L0()) {
            if (!L0()) {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z10) {
                if (L0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f9338s1, changeBounds);
            }
        }
    }

    public final void N0() {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.f33779p = 0.42f;
        long j3 = this.f9345z1;
        int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.q9 q9Var = this.f9342w1;
        if (i7 == 0) {
            b9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.m6.f29331c8;
            org.telegram.ui.ActionBar.h6 h6Var = this.f9333m1;
            b9Var.i(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
            q9Var.f(null, b9Var);
            return;
        }
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.n1;
        if (i11 >= 0) {
            TLRPC.User c22 = np.u1(i12).c2(Long.valueOf(this.f9345z1));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
            return;
        }
        TLRPC.Chat O0 = np.u1(i12).O0(Long.valueOf(-this.f9345z1));
        b9Var.q(O0);
        q9Var.f(O0, b9Var);
    }

    public final void O0(long j3) {
        lc lcVar;
        long j10;
        long j11;
        boolean z10;
        long j12 = 0;
        if ((!this.f9334o1 || this.f9335p1 || j3 <= 0) && (lcVar = this.f9344y1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = k10.i(this.n1).e();
            int i7 = 1;
            ArrayList arrayList2 = this.H1;
            if (arrayList2 != null) {
                j11 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o4 = org.telegram.messenger.n5.o(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            o4 = e10;
                        } else {
                            o4 = (-i10) - i7;
                        }
                    }
                    if (!messageReactor.my && o4 != e10) {
                        long j14 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f8837a = z11;
                        obj.f8838b = false;
                        obj.f8839c = o4;
                        obj.d = j14;
                        arrayList.add(obj);
                    } else {
                        j11 = messageReactor.count;
                    }
                    i10++;
                    j12 = j13;
                    i7 = 1;
                }
                j10 = j12;
            } else {
                j10 = 0;
                j11 = 0;
            }
            long j15 = j11 + j3;
            if (j15 > j10) {
                if (this.f9345z1 == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f8837a = z10;
                obj2.f8838b = true;
                obj2.f8839c = e10;
                obj2.d = j15;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a3.c(17));
            lcVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean Y(float f10, float f11) {
        b bVar = this.I1;
        if (f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.P3) {
            M0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z12;
        if (!this.O1 && !this.P1) {
            this.P1 = true;
            gj gjVar = this.G1;
            if (gjVar != null && ((z12 = gjVar.z1()) == null || z12.longValue() != this.f9345z1)) {
                gjVar.J5(this.f9345z1);
                r8 b10 = r8.b(gjVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i7 = this.n1;
                np u12 = np.u1(i7);
                long j3 = b10.f9663a;
                int i10 = b10.f9664b;
                tL_messages_togglePaidReactionPrivacy.peer = u12.l1(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j10 = this.f9345z1;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = np.u1(i7).l1(this.f9345z1);
                }
                ls.f(i7).k(ls.I1, Long.valueOf(b10.f9663a), Integer.valueOf(i10), Long.valueOf(this.f9345z1));
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_togglePaidReactionPrivacy, new ai.a1(this, 5));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.n1).c(this, ls.P3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.n1).n(this, ls.P3);
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.J1 && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, this.f9333m1)) != this.H0) {
                this.H0 = w02;
                this.J1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
