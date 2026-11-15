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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.yi;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class ic extends org.telegram.ui.ActionBar.u2 implements is {
    public long A1;
    public final fi.s0 B1;
    public final fi.n0 C1;
    public final View D1;
    public final fp E1;
    public final xb F1;
    public final gj G1;
    public final ArrayList H1;
    public final b I1;
    public int J1;
    public fi.c2 K1;
    public int L1;
    public z6 M1;
    public final eq[] N1;
    public boolean O1;
    public boolean P1;
    public an Q1;
    public View R1;
    public ValueAnimator S1;
    public final org.telegram.ui.ActionBar.e6 f8821m1;
    public final int n1;
    public final boolean f8822o1;
    public final boolean f8823p1;
    public final LinearLayout f8824q1;
    public final FrameLayout f8825r1;
    public final LinearLayout f8826s1;
    public final sb f8827t1;
    public final FrameLayout f8828u1;
    public final FrameLayout f8829v1;
    public final org.telegram.ui.Components.i9 f8830w1;
    public final hi.d f8831x1;
    public final hc f8832y1;
    public long f8833z1;

    public ic(Context context, final int i7, final long j3, an anVar, gj gjVar, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
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
        this.N1 = new eq[1];
        this.P1 = false;
        this.f8821m1 = e6Var;
        this.n1 = i7;
        this.G1 = gjVar;
        this.H1 = arrayList;
        this.f8822o1 = z11;
        this.f8823p1 = z10;
        b bVar = new b(i7, context, e6Var);
        this.I1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.f29685c.addView(bVar, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.na.a(bVar);
        bVar.setOnClickListener(new bi.p(1, context, e6Var));
        long e10 = m10.i(i7).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o4 = org.telegram.messenger.m5.o(messageReactor4.peer_id);
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
            this.f8833z1 = j10;
        } else {
            j11 = e10;
            this.f8833z1 = u8.y(i7, false).B(gjVar);
        }
        long j12 = this.f8833z1;
        this.A1 = j12 == 2666000 ? j11 : j12;
        P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, e6Var));
        this.J1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8824q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8825r1 = frameLayout;
        linearLayout.addView(frameLayout, c8.ja.o(-1, -2));
        this.f8827t1 = new sb(this, context, e6Var, z11, i7);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = np.s1(i7).f25234a6;
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
        sb sbVar = this.f8827t1;
        sbVar.f8579f0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                sbVar.setAlpha(0.5f);
            }
            FrameLayout frameLayout2 = this.f8825r1;
            sb sbVar2 = this.f8827t1;
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
            frameLayout2.addView(sbVar2, c8.ja.d(-1, -2.0f, 55, 0.0f, f10, 0.0f, f11));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8826s1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.f8825r1.addView(linearLayout2, c8.ja.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8828u1 = frameLayout3;
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f8829v1 = frameLayout4;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.j6.f28940i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i18);
        frameLayout4.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout4, d02, M, null, e6Var);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f8830w1 = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        i9Var.getImageReceiver().B0 = true;
        M0();
        frameLayout4.addView(i9Var, c8.ja.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i19 = org.telegram.ui.ActionBar.j6.f29107r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i19, e6Var, mode);
        imageView.setImageResource(2131230873);
        frameLayout4.addView(imageView, c8.ja.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout3.addView(frameLayout4, c8.ja.e(52, 28, 17));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout3, c8.ja.q(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        c8.na.a(frameLayout3);
        e0.g(i7).o();
        tb tbVar = new tb(context, 0);
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(tbVar, i20, e6Var);
        tbVar.setTextSize(1, 20.0f);
        tbVar.setGravity(17);
        tbVar.setText(hd.M0(2131745038, null));
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(tbVar, c8.ja.q(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231269);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.W5, e6Var, mode);
        c8.na.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ic f9186b;

            {
                this.f9186b = this;
            }

            @Override
            public final void onClick(View view) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f9186b.dismiss();
                        return;
                    default:
                        ic icVar = this.f9186b;
                        fp fpVar = icVar.E1;
                        fpVar.a(!fpVar.f34667a.f32441q, true);
                        if (fpVar.f34667a.f32441q) {
                            j14 = icVar.A1;
                        } else {
                            j14 = 2666000;
                        }
                        icVar.f8833z1 = j14;
                        icVar.M0();
                        hc hcVar = icVar.f8832y1;
                        if (hcVar != null) {
                            hcVar.setMyPrivacy(icVar.f8833z1);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView2, c8.ja.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout5 = this.f8825r1;
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
        frameLayout5.addView(linearLayout3, c8.ja.d(-1, -2.0f, 55, 0.0f, f13, 0.0f, 15.0f));
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView, i20, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = hd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            if (M0 == null) {
                str = "";
            } else {
                str = M0.title;
            }
            iArr = null;
            a02 = hd.a0(null, null, 2131745043, str);
        }
        textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.X2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, c8.ja.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z13) {
            if (!z11) {
                linearLayout3.addView(new ub(context, e6Var), c8.ja.t(-1, 30, 55, 0, 20, 0, 0));
            }
            hc hcVar = new hc(this, context, z11);
            this.f8832y1 = hcVar;
            hcVar.setOnSenderClickListener(new z10() {
                @Override
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    int i21 = (l10.longValue() > 0L ? 1 : (l10.longValue() == 0L ? 0 : -1));
                    ic icVar = ic.this;
                    boolean z15 = z11;
                    if (i21 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == m10.i(i7).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new vb(icVar, bundle, z15));
                        icVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new wb(icVar, bundle2, z15));
                    }
                    icVar.dismiss();
                }
            });
            LinearLayout linearLayout4 = this.f8824q1;
            if (z11) {
                f14 = -50.0f;
            } else {
                f14 = 0.0f;
            }
            linearLayout4.addView(hcVar, c8.ja.k(0.0f, f14, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.D1 = view;
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, e6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.f8824q1.addView(view, c8.ja.n(1.0f / org.telegram.messenger.g0.f23610p, -1, 7, 24, 0, 24, 0));
            }
            str2 = null;
        } else {
            str2 = null;
            this.f8832y1 = null;
            this.D1 = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.j6.f28957j5;
            TextView b10 = c8.sa.b(context, 20.0f, i21, true, e6Var);
            b10.setGravity(17);
            if (z10) {
                i11 = 2131748791;
            } else {
                i11 = 2131748793;
            }
            b10.setText(hd.M0(i11, str2));
            this.f8824q1.addView(b10, c8.ja.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = c8.sa.b(context, 14.0f, i21, false, e6Var);
            b11.setGravity(17);
            if (z10) {
                i12 = 2131748792;
            } else if (z13) {
                i12 = 2131748794;
            } else {
                i12 = 2131748795;
            }
            org.telegram.messenger.k5.q(null, null, i12, new Object[]{org.telegram.messenger.m5.l(m10.f24940t0, j3)}, b11);
            this.f8824q1.addView(b11, c8.ja.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ?? obj2 = new Object();
            this.B1 = obj2;
            messageReactor2 = messageReactor;
            obj2.f12299c = this.f8833z1;
            obj2.f12302g = 50L;
            obj2.f12300e = true;
            fi.n0 n0Var = new fi.n0(i7, context, true);
            this.C1 = n0Var;
            n0Var.set(obj2);
            this.f8824q1.addView(n0Var, c8.ja.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        fp fpVar = new fp(21, context, e6Var);
        this.E1 = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(true);
        if (this.f8833z1 != 2666000) {
            z14 = true;
        } else {
            z14 = false;
        }
        fpVar.a(z14, false);
        hc hcVar2 = this.f8832y1;
        if (hcVar2 != null) {
            hcVar2.setMyPrivacy(this.f8833z1);
        }
        fpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView2, i20, e6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(hd.M0(2131745046, null));
        LinearLayout f15 = org.telegram.messenger.k5.f(context, 0);
        f15.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        f15.addView(fpVar, c8.ja.t(21, 21, 16, 0, 0, 9, 0));
        f15.addView(textView2, c8.ja.r(-2, -2, 16));
        f15.setOnClickListener(new View.OnClickListener(this) {
            public final ic f9186b;

            {
                this.f9186b = this;
            }

            @Override
            public final void onClick(View view2) {
                long j14;
                switch (r2) {
                    case 0:
                        this.f9186b.dismiss();
                        return;
                    default:
                        ic icVar = this.f9186b;
                        fp fpVar2 = icVar.E1;
                        fpVar2.a(!fpVar2.f34667a.f32441q, true);
                        if (fpVar2.f34667a.f32441q) {
                            j14 = icVar.A1;
                        } else {
                            j14 = 2666000;
                        }
                        icVar.f8833z1 = j14;
                        icVar.M0();
                        hc hcVar3 = icVar.f8832y1;
                        if (hcVar3 != null) {
                            hcVar3.setMyPrivacy(icVar.f8833z1);
                            return;
                        }
                        return;
                }
            }
        });
        c8.na.b(f15, 0.05f, 1.2f);
        int i22 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i22, e6Var), 6, 6);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i22);
        f15.setBackground(a03);
        org.telegram.ui.ActionBar.q6.j(f15, a03, null, M2, e6Var);
        if (!z11 && (z10 || messageReactor2 != null)) {
            LinearLayout linearLayout5 = this.f8824q1;
            if (z13) {
                i10 = 10;
            } else {
                i10 = 4;
            }
            linearLayout5.addView(f15, c8.ja.t(-2, -2, 1, 0, i10, 0, 10));
        }
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f8831x1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f8824q1.addView(dVar, c8.ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(lb.Y0(false, hd.a0(null, null, 2131745047, hd.E(50L, ',')), this.N1), true, true);
        if (z10) {
            context2 = context;
            dVar.setOnClickListener(new u9(this, gjVar, anVar, i7, z11, context, e6Var, j3, M0));
        } else {
            context2 = context;
        }
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                long j14;
                boolean z15;
                int i23 = i7;
                e0 g10 = e0.g(i23);
                g10.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g10.f8439l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, m10.i(i23).f());
                ic icVar = ic.this;
                m60 F = m60.F(icVar.f29682b, e6Var, icVar.f8829v1);
                int size2 = arrayList3.size();
                int i24 = 0;
                while (i24 < size2) {
                    int i25 = i24 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i24);
                    if (tLObject instanceof TLRPC.User) {
                        j14 = ((TLRPC.User) tLObject).f28200id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.t3.V(chat)) {
                                j14 = -chat.f28051id;
                            }
                        }
                        i24 = i25;
                    }
                    if (j14 != j3) {
                        long j15 = icVar.f8833z1;
                        if (j14 != j15 && (j15 != 0 || j14 != m10.i(i23).e())) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        F.g(tLObject, z15, new rb(icVar, j14, z11, 0));
                    }
                    i24 = i25;
                }
                F.f37112t = false;
                F.Y = true;
                F.f37111s = 0;
                F.V(5);
                F.Z();
            }
        });
        z70 z70Var = new z70(context2, e6Var);
        z70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        if (z11 && !z10) {
            z70Var.setText(hd.M0(2131748796, null));
        } else {
            z70Var.setText(org.telegram.messenger.g0.U2(hd.M0(2131745045, null), new ai.a(context2, 8)));
        }
        z70Var.setGravity(17);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.f28977k5, e6Var);
        if (z10 || z11) {
            this.f8824q1.addView(z70Var, c8.ja.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.O = this.f8824q1;
        xb xbVar = new xb(context2, 1, 2, 0);
        this.F1 = xbVar;
        vg.f fVar = xbVar.f58893b;
        fVar.f58877z = org.telegram.ui.ActionBar.j6.Wk;
        fVar.A = org.telegram.ui.ActionBar.j6.Xk;
        fVar.b();
        xbVar.f58893b.f58863k = 1.0f;
        xbVar.setVisibility(4);
        xbVar.setPaused(true);
        this.f29685c.addView(xbVar, c8.ja.c(150.0f, 150));
        this.f8827t1.setValue(50);
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
                this.f8827t1.setStarsTop(j14 + 1);
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
    public final boolean H() {
        if (this.f8827t1.f8585l0) {
            return false;
        }
        return this.f29686c0;
    }

    public final void J0(final q8 q8Var) {
        ch.n0 n0Var;
        View view;
        ch.q0 q0Var;
        fi.c2 c2Var;
        View view2;
        ch.q0 q0Var2;
        ch.n0 n0Var2;
        gj gjVar;
        sb sbVar = this.f8827t1;
        xb xbVar = this.F1;
        gj gjVar2 = this.G1;
        if (gjVar2 != null && (view2 = this.Q1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.R1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                q0Var2 = ((org.telegram.ui.Cells.q1) view3).O;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                q0Var2 = ((org.telegram.ui.Cells.t0) view3).F0;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else {
                q0Var2 = null;
                n0Var2 = null;
            }
            if (n0Var2 == null && q0Var2 != null) {
                bj u92 = this.Q1.u9(gjVar2);
                if (u92 != null && !u92.f22710e.isEmpty()) {
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
                                int i10 = d.f27755l;
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
                    if (view3 instanceof org.telegram.ui.Cells.q1) {
                        q0Var2 = ((org.telegram.ui.Cells.q1) view3).O;
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
        sbVar.getLocationInWindow(iArr);
        rectF.set(sbVar.H.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        mb mbVar = new mb(this, 2);
        xbVar.f58894b0 = mbVar;
        if (xbVar.f58892a0) {
            xbVar.f58894b0 = null;
            mbVar.run();
        }
        if (n0Var != null) {
            n0Var.f5156k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ch.n0 n0Var3 = n0Var;
        fi.n0[] n0VarArr = new fi.n0[1];
        if (this.f8822o1 && (c2Var = this.K1) != null) {
            n0VarArr[0] = c2Var.d(this.L1);
        }
        final RectF rectF2 = new RectF();
        final j6 j6Var = new j6(this, n0VarArr, iArr, rectF2, view, q0Var, n0Var3, 3);
        View view4 = view;
        j6Var.run();
        xbVar.setPaused(false);
        xbVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        xbVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        xbVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        xbVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        xbVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
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
                j6Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                ic icVar = ic.this;
                xb xbVar2 = icVar.F1;
                xbVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                xbVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                xbVar2.setScaleX(T1);
                xbVar2.setScaleY(T1);
                vg.f fVar = xbVar2.f58893b;
                fVar.d = 360.0f * floatValue;
                fVar.f58863k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (!zArr2[0] && floatValue > 0.95f) {
                    zArr2[0] = true;
                    LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                    try {
                        icVar.f29685c.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    Runnable runnable = q8Var;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        this.S1.addListener(new yb(this, n0Var3, view4, n0VarArr, zArr, rectF2, q8Var));
        this.S1.setDuration(800L);
        this.S1.setInterpolator(new c5.c(1));
        this.S1.start();
    }

    public final boolean K0() {
        if (!this.f8822o1) {
            e0 g10 = e0.g(this.n1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.f8439l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.t3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void L() {
        ValueAnimator valueAnimator = this.S1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.L();
    }

    public final void L0(boolean z10) {
        boolean z11;
        FrameLayout frameLayout = this.f8828u1;
        int i7 = 0;
        if (frameLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != K0()) {
            if (!K0()) {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            if (z10) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.f8826s1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.f39598p = 0.42f;
        long j3 = this.f8833z1;
        int i7 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        org.telegram.ui.Components.i9 i9Var = this.f8830w1;
        if (i7 == 0) {
            t8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.j6.f28833c8;
            org.telegram.ui.ActionBar.e6 e6Var = this.f8821m1;
            t8Var.i(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            i9Var.f(null, t8Var);
            return;
        }
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.n1;
        if (i11 >= 0) {
            TLRPC.User a22 = np.s1(i12).a2(Long.valueOf(this.f8833z1));
            t8Var.r(a22);
            i9Var.f(a22, t8Var);
            return;
        }
        TLRPC.Chat M0 = np.s1(i12).M0(Long.valueOf(-this.f8833z1));
        t8Var.q(M0);
        i9Var.f(M0, t8Var);
    }

    public final void N0(long j3) {
        hc hcVar;
        long j10;
        long j11;
        boolean z10;
        long j12 = 0;
        if ((!this.f8822o1 || this.f8823p1 || j3 <= 0) && (hcVar = this.f8832y1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = m10.i(this.n1).e();
            int i7 = 1;
            ArrayList arrayList2 = this.H1;
            if (arrayList2 != null) {
                j11 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o4 = org.telegram.messenger.m5.o(messageReactor.peer_id);
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
                        obj.f8277a = z11;
                        obj.f8278b = false;
                        obj.f8279c = o4;
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
                if (this.f8833z1 == 2666000) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? obj2 = new Object();
                obj2.f8277a = z10;
                obj2.f8278b = true;
                obj2.f8279c = e10;
                obj2.d = j15;
                arrayList.add(obj2);
            }
            Collections.sort(arrayList, new a3.c(17));
            hcVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
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
        if (i7 == ns.M3) {
            L0(true);
        }
    }

    @Override
    public final void dismiss() {
        Long z12;
        if (!this.O1 && !this.P1) {
            this.P1 = true;
            gj gjVar = this.G1;
            if (gjVar != null && ((z12 = gjVar.z1()) == null || z12.longValue() != this.f8833z1)) {
                gjVar.J5(this.f8833z1);
                n8 b10 = n8.b(gjVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i7 = this.n1;
                np s12 = np.s1(i7);
                long j3 = b10.f9113a;
                int i10 = b10.f9114b;
                tL_messages_togglePaidReactionPrivacy.peer = s12.j1(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j10 = this.f8833z1;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = np.s1(i7).j1(this.f8833z1);
                }
                ns.f(i7).k(ns.I1, Long.valueOf(b10.f9113a), Integer.valueOf(i10), Long.valueOf(this.f8833z1));
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_togglePaidReactionPrivacy, new ai.e1(this, 5));
            }
        }
        super.dismiss();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.n1).c(this, ns.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.n1).n(this, ns.M3);
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.J1 && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.f8821m1)) != this.H0) {
                this.H0 = w02;
                this.J1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
