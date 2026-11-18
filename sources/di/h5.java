package di;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.m30;
public final class h5 {
    public final TL_stars.TL_starGiftUnique f8921a;
    public final Context f8922b;
    public final int f8923c;
    public final long d;
    public final String f8924e;
    public final boolean f8925f;
    public final org.telegram.ui.ActionBar.i6 f8926g;
    public final org.telegram.ui.ActionBar.u1 h;
    public final m30 f8927i;
    public final TextView f8928j;
    public b f8929k;
    public TextView f8930l;
    public FrameLayout f8931m;
    public vf.b f8932n;
    public TLRPC.TL_textWithEntities f8933o;
    public boolean f8934p = true;
    public final HashMap f8935q;
    public final HashSet f8936r;
    public cg.b f8937s;
    public hi.m3 f8938t;

    public h5(Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, f5 f5Var, int i7, long j3, String str, boolean z10, q10 q10Var) {
        TLObject O0;
        HashMap hashMap = new HashMap();
        this.f8935q = hashMap;
        this.f8936r = new HashSet();
        this.f8922b = context;
        this.f8921a = tL_starGiftUnique;
        this.d = j3;
        this.f8923c = i7;
        cg.b bVar = f5Var.f8764a;
        this.f8937s = bVar;
        hashMap.put(bVar, f5Var);
        this.f8926g = i6Var;
        this.f8924e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f8925f = !z11;
        if (j3 >= 0) {
            O0 = mp.u1(i7).c2(Long.valueOf(j3));
        } else {
            O0 = mp.u1(i7).O0(Long.valueOf(-j3));
        }
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g5 g5Var = new g5(this, context);
        g5Var.addView(g10, c8.ma.c(-2.0f, -1));
        if (!z11) {
            m30 m30Var = new m30(context, i6Var);
            this.f8927i = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.M0(2131750263, null));
            arrayList.add(gd.M0(2131750262, null));
            m30Var.b(arrayList, new k0(this, 2));
            g10.addView(m30Var, c8.ma.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f8927i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
            i5.c.r(14.0f, 1, 2131750261, textView, null);
            textView.setGravity(17);
            g10.addView(textView, c8.ma.t(-2, -2, 17, 24, 4, 24, 4));
        }
        g10.addView(new d5(context, tL_starGiftUnique, O0), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8928j = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29502j5, i6Var);
        textView2.setTextSize(1, 16.0f);
        g10.addView(textView2, c8.ma.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            cy0 cy0Var = new cy0(context, i6Var);
            f6.m1(cy0Var, x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            f6.m1(cy0Var, x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            f6.m1(cy0Var, x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                cy0Var.e(gd.M0(2131749416, null), p5.c.k("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            g10.addView(cy0Var, c8.ma.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        alertDialog$Builder.o(g5Var);
        alertDialog$Builder.k("_", new bi.i5(this, i7, context, i6Var, q10Var));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        this.h = alertDialog$Builder.f28744a;
    }

    public final void a(boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        String a02;
        String K;
        hi.m3 m3Var;
        int i7;
        cg.b bVar = this.f8937s;
        f5 f5Var = (f5) this.f8935q.get(bVar);
        TextView textView = this.f8928j;
        ViewPropertyAnimator animate = textView.animate();
        if (f5Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (f5Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f8930l;
        if (f5Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        b bVar2 = this.f8929k;
        if (bVar2.f8511e != bVar) {
            bVar2.f8511e = bVar;
            bVar2.b();
        }
        cg.b bVar3 = cg.b.f5274b;
        m30 m30Var = this.f8927i;
        if (m30Var != null) {
            if (bVar == bVar3) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            m30Var.a(i7, z10);
        }
        if (bVar == bVar3 && (m3Var = this.f8938t) != null && m3Var.W) {
            m3Var.f(true);
        }
        b bVar4 = this.f8929k;
        cg.b bVar5 = cg.b.f5273a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ah.d(this, 18));
            } else {
                bVar4.setOnClickListener(new bi.o(24));
            }
        }
        vf.b bVar6 = this.f8932n;
        if (bVar6 != null) {
            bVar6.a(false);
            this.f8932n = null;
        }
        int i10 = this.f8923c;
        if (f5Var != null) {
            cg.b bVar7 = f5Var.f8764a;
            cg.a aVar = f5Var.f8766c;
            long e10 = j10.i(i10).e();
            long j3 = this.d;
            if (j3 == e10) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f8924e;
            if (bVar7 == bVar5) {
                c10 = 0;
                this.f8930l.setText(pb.T0(gd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    K = gd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str);
                } else {
                    K = gd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.n5.t(j3));
                }
                textView.setText(org.telegram.messenger.g0.W2(K));
            } else {
                c10 = 0;
            }
            if (bVar7 == bVar3) {
                TextView textView3 = this.f8930l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar.d();
                textView3.setText(pb.V0(gd.a0(null, null, 2131750266, objArr), true));
                if (z13) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = gd.a0(null, null, 2131750258, objArr2);
                } else {
                    String d2 = aVar.d();
                    String t6 = org.telegram.messenger.n5.t(j3);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d2;
                    objArr3[1] = str;
                    objArr3[2] = t6;
                    a02 = gd.a0(null, null, 2131750254, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.W2(a02));
                return;
            }
            return;
        }
        vf.b h = this.h.h(-1, false, false);
        this.f8932n = h;
        h.d();
        if (this.f8936r.add(bVar)) {
            x8.x(i10, bVar).H(this.f8921a, this.d, this.f8933o, this.f8934p, new ai.v1(12, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        u1Var.Y0 = true;
        u1Var.show();
        this.f8930l = (TextView) u1Var.d(-1);
        this.f8929k = u1Var.f30026a1;
        FrameLayout frameLayout = u1Var.Z0;
        this.f8931m = frameLayout;
        if (frameLayout != null && this.f8925f) {
            hi.m3 m3Var = new hi.m3(this.f8922b, 3);
            m3Var.r(true);
            m3Var.L = Layout.Alignment.ALIGN_NORMAL;
            m3Var.d = 5000L;
            m3Var.v(gd.M0(2131750260, null));
            m3Var.x();
            this.f8938t = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f8931m.addView(this.f8938t, c8.ma.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
