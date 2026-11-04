package ci;

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
import b8.mf;
import b8.pf;
import b8.rf;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ri;
import org.telegram.messenger.u10;
import org.telegram.messenger.ui;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class tc extends org.telegram.ui.ActionBar.t2 implements cs {
    public final View A1;
    public final wo B1;
    public final ic C1;
    public final zi D1;
    public final ArrayList E1;
    public final c F1;
    public int G1;
    public ei.k2 H1;
    public int I1;
    public a1.c J1;
    public final wp[] K1;
    public boolean L1;
    public boolean M1;
    public wm N1;
    public View O1;
    public ValueAnimator P1;
    public final org.telegram.ui.ActionBar.e6 f6054j1;
    public final int k1;
    public final boolean f6055l1;
    public final boolean m1;
    public final LinearLayout f6056n1;
    public final FrameLayout f6057o1;
    public final LinearLayout f6058p1;
    public final dc f6059q1;
    public final FrameLayout f6060r1;
    public final FrameLayout f6061s1;
    public final org.telegram.ui.Components.k9 f6062t1;
    public final gi.d f6063u1;
    public final sc f6064v1;
    public long f6065w1;
    public long f6066x1;
    public final ei.u0 f6067y1;
    public final ei.p0 f6068z1;

    public tc(Context context, final int i3, final long j10, wm wmVar, zi ziVar, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        long j12;
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
        this.K1 = new wp[1];
        this.M1 = false;
        this.f6054j1 = e6Var;
        this.k1 = i3;
        this.D1 = ziVar;
        this.E1 = arrayList;
        this.f6055l1 = z11;
        this.m1 = z10;
        c cVar = new c(i3, context, e6Var);
        this.F1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.f28589c.addView(cVar, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        pf.a(cVar);
        cVar.setOnClickListener(new ai.u(1, context, e6Var));
        long e10 = h10.i(i3).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o10 = org.telegram.messenger.m5.o(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    o10 = e10;
                }
                if (messageReactor4.my || o10 == e10) {
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
            j12 = e10;
            this.f6065w1 = j11;
        } else {
            j12 = e10;
            this.f6065w1 = e9.y(i3, false).B(ziVar);
        }
        long j13 = this.f6065w1;
        this.f6066x1 = j13 == 2666000 ? j12 : j13;
        O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
        this.G1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f6056n1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6057o1 = frameLayout;
        linearLayout.addView(frameLayout, mf.o(-1, -2));
        this.f6059q1 = new dc(this, context, e6Var, z11, i3);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = hp.s1(i3).Z5;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 < 9) {
                int i16 = iArr2[i15];
                z13 = z12;
                if (i16 > j14) {
                    arrayList2.add(Integer.valueOf((int) j14));
                    break;
                }
                arrayList2.add(Integer.valueOf(i16));
                if (iArr2[i15] == j14) {
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
        dc dcVar = this.f6059q1;
        dcVar.f5866f0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                dcVar.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.f6057o1;
            dc dcVar2 = this.f6059q1;
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
            frameLayout2.addView(dcVar2, mf.d(-1, -2.0f, 55, 0.0f, f10, 0.0f, f11));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f6058p1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.f6057o1.addView(linearLayout2, mf.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f6060r1 = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f6061s1 = frameLayout4;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.k6.f27971i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i18, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i18);
        frameLayout4.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout4, d02, N, null, e6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f6062t1 = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        k9Var.getImageReceiver().B0 = true;
        M0();
        frameLayout4.addView(k9Var, mf.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i19 = org.telegram.ui.ActionBar.k6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i19, e6Var, mode);
        imageView.setImageResource(2131230873);
        frameLayout4.addView(imageView, mf.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, mf.e(52, 28, 17));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout3, mf.q(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        pf.a(frameLayout3);
        i0.g(i3).o();
        ec ecVar = new ec(context, 0);
        int i20 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(ecVar, i20, e6Var);
        ecVar.setTextSize(1, 20.0f);
        ecVar.setGravity(17);
        ecVar.setText(bd.M0(2131745048, null));
        ecVar.setTypeface(org.telegram.messenger.g0.o());
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(ecVar, mf.q(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231269);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, e6Var, mode);
        pf.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final tc f6493b;

            {
                this.f6493b = this;
            }

            @Override
            public final void onClick(View view) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f6493b.dismiss();
                        return;
                    default:
                        tc tcVar = this.f6493b;
                        wo woVar = tcVar.B1;
                        woVar.a(!woVar.f40035a.f31334q, true);
                        if (woVar.f40035a.f31334q) {
                            j15 = tcVar.f6066x1;
                        } else {
                            j15 = 2666000;
                        }
                        tcVar.f6065w1 = j15;
                        tcVar.M0();
                        sc scVar = tcVar.f6064v1;
                        if (scVar != null) {
                            scVar.setMyPrivacy(tcVar.f6065w1);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, mf.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.f6057o1;
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
        frameLayout5.addView(linearLayout3, mf.d(-1, -2.0f, 55, 0.0f, f13, 0.0f, 15.0f));
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView, i20, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = bd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            iArr = null;
            a02 = bd.a0(null, null, 2131745053, str);
        }
        textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, mf.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z13) {
            if (!z11) {
                linearLayout3.addView(new fc(context, e6Var), mf.t(-1, 30, 55, 0, 20, 0, 0));
            }
            sc scVar = new sc(this, context, z11);
            this.f6064v1 = scVar;
            scVar.setOnSenderClickListener(new u10() {
                @Override
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    int i21 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                    tc tcVar = tc.this;
                    boolean z15 = z11;
                    if (i21 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == h10.i(i3).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new gc(tcVar, bundle, z15));
                        tcVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new hc(tcVar, bundle2, z15));
                    }
                    tcVar.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f6056n1;
            if (z11) {
                f14 = -50.0f;
            } else {
                f14 = 0.0f;
            }
            linearLayout4.addView(scVar, mf.k(0.0f, f14, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.A1 = view;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, e6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f6056n1.addView(view, mf.n(1.0f / org.telegram.messenger.g0.f22607p, -1, 7, 24, 0, 24, 0));
            }
            str2 = null;
        } else {
            str2 = null;
            this.f6064v1 = null;
            this.A1 = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.k6.f27988j5;
            TextView b10 = rf.b(context, 20.0f, i21, true, e6Var);
            b10.setGravity(17);
            if (z10) {
                i11 = 2131748799;
            } else {
                i11 = 2131748801;
            }
            b10.setText(bd.M0(i11, str2));
            this.f6056n1.addView(b10, mf.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = rf.b(context, 14.0f, i21, false, e6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = 2131748800;
            } else if (z13) {
                i12 = 2131748802;
            } else {
                i12 = 2131748803;
            }
            org.telegram.messenger.k5.r(null, null, i12, new Object[]{org.telegram.messenger.m5.l(h10.f22829t0, j10)}, b11);
            this.f6056n1.addView(b11, mf.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.f6067y1 = obj2;
            messageReactor2 = messageReactor;
            obj2.f11071c = this.f6065w1;
            obj2.f11074g = 50L;
            obj2.f11072e = true;
            ei.p0 p0Var = new ei.p0(i3, context, true);
            this.f6068z1 = p0Var;
            p0Var.set(obj2);
            this.f6056n1.addView(p0Var, mf.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        wo woVar = new wo(21, context, e6Var);
        this.B1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.f28008k7);
        woVar.setDrawUnchecked(true);
        if (this.f6065w1 != 2666000) {
            z14 = true;
        } else {
            z14 = false;
        }
        woVar.a(z14, false);
        sc scVar2 = this.f6064v1;
        if (scVar2 != null) {
            scVar2.setMyPrivacy(this.f6065w1);
        }
        woVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView2, i20, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(bd.M0(2131745056, null));
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        f15.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        f15.addView(woVar, mf.t(21, 21, 16, 0, 0, 9, 0));
        f15.addView(textView2, mf.r(-2, -2, 16));
        f15.setOnClickListener(new View.OnClickListener(this) {
            public final tc f6493b;

            {
                this.f6493b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j15;
                switch (r2) {
                    case 0:
                        this.f6493b.dismiss();
                        return;
                    default:
                        tc tcVar = this.f6493b;
                        wo woVar2 = tcVar.B1;
                        woVar2.a(!woVar2.f40035a.f31334q, true);
                        if (woVar2.f40035a.f31334q) {
                            j15 = tcVar.f6066x1;
                        } else {
                            j15 = 2666000;
                        }
                        tcVar.f6065w1 = j15;
                        tcVar.M0();
                        sc scVar3 = tcVar.f6064v1;
                        if (scVar3 != null) {
                            scVar3.setMyPrivacy(tcVar.f6065w1);
                            return;
                        }
                        return;
                }
            }
        });
        pf.b(f15, 0.05f, 1.2f);
        int i22 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i22, e6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i22);
        f15.setBackground(a03);
        org.telegram.ui.ActionBar.r6.k(f15, a03, null, N2, e6Var);
        if (!z11 && (z10 || messageReactor2 != null)) {
            LinearLayout linearLayout5 = this.f6056n1;
            if (z13) {
                i10 = 10;
            } else {
                i10 = 4;
            }
            linearLayout5.addView(f15, mf.t(-2, -2, 1, 0, i10, 0, 10));
        }
        gi.d dVar = new gi.d(context, e6Var, true);
        this.f6063u1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f6056n1.addView(dVar, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(wb.Y0(false, bd.a0(null, null, 2131745057, bd.E(50L, ',')), this.K1), true, true);
        if (z10) {
            context2 = context;
            dVar.setOnClickListener(new fa(this, ziVar, wmVar, i3, z11, context, e6Var, j10, M0));
        } else {
            context2 = context;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                long j15;
                boolean z15;
                int i23 = i3;
                i0 g7 = i0.g(i23);
                g7.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g7.f5277l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, h10.i(i23).f());
                tc tcVar = tc.this;
                f60 F = f60.F(tcVar.f28586b, e6Var, tcVar.f6061s1);
                int size2 = arrayList3.size();
                int i24 = 0;
                while (i24 < size2) {
                    int i25 = i24 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i24);
                    if (tLObject instanceof TLRPC.User) {
                        j15 = ((TLRPC.User) tLObject).f27150id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.t3.V(chat)) {
                                j15 = -chat.f27001id;
                            }
                        }
                        i24 = i25;
                    }
                    if (j15 != j10) {
                        long j16 = tcVar.f6065w1;
                        if (j15 != j16 && (j16 != 0 || j15 != h10.i(i23).e())) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        F.g(tLObject, z15, new cc(tcVar, j15, z11, 0));
                    }
                    i24 = i25;
                }
                F.f33748t = false;
                F.Y = true;
                F.f33747s = 0;
                F.V(5);
                F.Z();
            }
        });
        s70 s70Var = new s70(context2, e6Var);
        s70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        if (z11 && !z10) {
            s70Var.setText(bd.M0(2131748804, null));
        } else {
            s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131745055, null), new ai.s1(context2, 7)));
        }
        s70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.f28006k5, e6Var);
        if (z10 || z11) {
            this.f6056n1.addView(s70Var, mf.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.O = this.f6056n1;
        ic icVar = new ic(context2, 1, 2, 0);
        this.C1 = icVar;
        wg.f fVar = icVar.f57666b;
        fVar.f57650z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        icVar.f57666b.f57636k = 1.0f;
        icVar.setVisibility(4);
        icVar.setPaused(true);
        this.f28589c.addView(icVar, mf.c(150.0f, 150));
        this.f6059q1.setValue(50);
        if (arrayList != null) {
            long j15 = 0;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor2 != null ? j15 - messageReactor2.count : j15;
            if (j15 > 0) {
                this.f6059q1.setStarsTop(j15 + 1);
            }
        }
    }

    @Override
    public final void E(ArrayList arrayList, boolean z10) {
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
        c cVar = this.F1;
        arrayList.add(ObjectAnimator.ofFloat(cVar, property, fArr));
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property2, f11));
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.6f;
        }
        arrayList.add(ObjectAnimator.ofFloat(cVar, property3, f12));
    }

    @Override
    public final boolean G() {
        if (this.f6059q1.f5872l0) {
            return false;
        }
        return this.f28590c0;
    }

    public final void J0(final a9 a9Var) {
        dh.l0 l0Var;
        View view;
        dh.o0 o0Var;
        ei.k2 k2Var;
        View view2;
        dh.o0 o0Var2;
        dh.l0 l0Var2;
        zi ziVar;
        dc dcVar = this.f6059q1;
        ic icVar = this.C1;
        zi ziVar2 = this.D1;
        if (ziVar2 != null && (view2 = this.N1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.O1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                o0Var2 = ((org.telegram.ui.Cells.q1) view3).O;
                o0Var2.getClass();
                l0Var2 = o0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                o0Var2 = ((org.telegram.ui.Cells.t0) view3).F0;
                o0Var2.getClass();
                l0Var2 = o0Var2.l("stars");
            } else {
                o0Var2 = null;
                l0Var2 = null;
            }
            if (l0Var2 == null && o0Var2 != null) {
                ui s92 = this.N1.s9(ziVar2);
                if (s92 != null && !s92.f25702e.isEmpty()) {
                    ArrayList arrayList = s92.d;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            ziVar = (zi) obj;
                            ri d = s92.d(ziVar);
                            if (d != null) {
                                int i10 = d.f25149l;
                                if ((i10 & 1) != 0 && (i10 & 8) != 0) {
                                    break;
                                }
                            }
                        } else {
                            ziVar = null;
                            break;
                        }
                    }
                    if (ziVar != null) {
                        view3 = this.N1.H8(ziVar.f1(), false);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                        o0Var2 = ((org.telegram.ui.Cells.q1) view3).O;
                        o0Var2.getClass();
                        l0Var2 = o0Var2.l("stars");
                    }
                } else {
                    return;
                }
            }
            if (l0Var2 != null) {
                o0Var = o0Var2;
                l0Var = l0Var2;
                view = view3;
            } else {
                return;
            }
        } else if (this.H1 == null) {
            return;
        } else {
            l0Var = null;
            view = null;
            o0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        dcVar.getLocationInWindow(iArr);
        rectF.set(dcVar.H.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        xb xbVar = new xb(this, 2);
        icVar.f57667b0 = xbVar;
        if (icVar.f57665a0) {
            icVar.f57667b0 = null;
            xbVar.run();
        }
        if (l0Var != null) {
            l0Var.f9074k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        dh.l0 l0Var3 = l0Var;
        ei.p0[] p0VarArr = new ei.p0[1];
        if (this.f6055l1 && (k2Var = this.H1) != null) {
            p0VarArr[0] = k2Var.d(this.I1);
        }
        final RectF rectF2 = new RectF();
        final s6 s6Var = new s6(this, p0VarArr, iArr, rectF2, view, o0Var, l0Var3, 3);
        View view4 = view;
        s6Var.run();
        icVar.setPaused(false);
        icVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        icVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        icVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        icVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        icVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
        ValueAnimator valueAnimator = this.P1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.P1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                s6Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                tc tcVar = tc.this;
                ic icVar2 = tcVar.C1;
                icVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                icVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                icVar2.setScaleX(T1);
                icVar2.setScaleY(T1);
                wg.f fVar = icVar2.f57666b;
                fVar.d = 360.0f * floatValue;
                fVar.f57636k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        tcVar.f28589c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = a9Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.P1.addListener(new jc(this, l0Var3, view4, p0VarArr, zArr, rectF2, a9Var));
        this.P1.setDuration(800L);
        this.P1.setInterpolator(new b5.c(1));
        this.P1.start();
    }

    @Override
    public final void K() {
        ValueAnimator valueAnimator = this.P1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.K();
    }

    public final boolean K0() {
        if (!this.f6055l1) {
            i0 g7 = i0.g(this.k1);
            g7.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g7.f5277l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.t3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L0(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f6060r1;
        int i3 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != K0()) {
            if (!K0()) {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            if (z10) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f6058p1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.f38691p = 0.42f;
        long j10 = this.f6065w1;
        int i3 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.k9 k9Var = this.f6062t1;
        if (i3 == 0) {
            u8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.k6.f27863c8;
            org.telegram.ui.ActionBar.e6 e6Var = this.f6054j1;
            u8Var.i(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            k9Var.e(null, u8Var);
            return;
        }
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i12 = this.k1;
        if (i11 >= 0) {
            TLRPC.User a22 = hp.s1(i12).a2(Long.valueOf(this.f6065w1));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            return;
        }
        TLRPC.Chat M0 = hp.s1(i12).M0(Long.valueOf(-this.f6065w1));
        u8Var.q(M0);
        k9Var.e(M0, u8Var);
    }

    public final void N0(long j10) {
        sc scVar;
        long j11;
        long j12;
        boolean z10;
        long j13 = 0;
        if ((!this.f6055l1 || this.m1 || j10 <= 0) && (scVar = this.f6064v1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = h10.i(this.k1).e();
            int i3 = 1;
            ArrayList arrayList2 = this.E1;
            if (arrayList2 != null) {
                j12 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o10 = org.telegram.messenger.m5.o(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z11 = messageReactor.anonymous;
                    if (z11) {
                        if (messageReactor.my) {
                            o10 = e10;
                        } else {
                            o10 = (-i10) - i3;
                        }
                    }
                    if (!messageReactor.my && o10 != e10) {
                        long j15 = messageReactor.count;
                        ?? obj = new Object();
                        obj.f5564a = z11;
                        obj.f5565b = false;
                        obj.f5566c = o10;
                        obj.d = j15;
                        arrayList.add(obj);
                    } else {
                        j12 = messageReactor.count;
                    }
                    i10++;
                    j13 = j14;
                    i3 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                if (this.f6065w1 == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f5564a = z10;
                obj2.f5565b = true;
                obj2.f5566c = e10;
                obj2.d = j16;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a3.u(5));
            scVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar = this.F1;
        if (f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.M3) {
            L0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long A1;
        if (!this.L1 && !this.M1) {
            this.M1 = true;
            zi ziVar = this.D1;
            if (ziVar != null && ((A1 = ziVar.A1()) == null || A1.longValue() != this.f6065w1)) {
                ziVar.K5(this.f6065w1);
                x8 b10 = x8.b(ziVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i3 = this.k1;
                hp s12 = hp.s1(i3);
                long j10 = b10.f6364a;
                int i10 = b10.f6365b;
                tL_messages_togglePaidReactionPrivacy.peer = s12.j1(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j11 = this.f6065w1;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = hp.s1(i3).j1(this.f6065w1);
                }
                hs.f(i3).k(hs.I1, Long.valueOf(b10.f6364a), Integer.valueOf(i10), Long.valueOf(this.f6065w1));
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_togglePaidReactionPrivacy, new d0(this, 4));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.k1).c(this, hs.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.k1).n(this, hs.M3);
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.G1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.f6054j1)) != this.H0) {
                this.H0 = w02;
                this.G1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
