package ci;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.x20;
public final class n5 {
    public final TL_stars.TL_starGiftUnique f5593a;
    public final Context f5594b;
    public final int f5595c;
    public final long d;
    public final String f5596e;
    public final boolean f5597f;
    public final org.telegram.ui.ActionBar.e6 f5598g;
    public final org.telegram.ui.ActionBar.s1 h;
    public final x20 f5599i;
    public final TextView f5600j;
    public c f5601k;
    public TextView f5602l;
    public FrameLayout f5603m;
    public sf.b f5604n;
    public final HashMap f5605o;
    public final HashSet f5606p;
    public dg.b f5607q;
    public gi.l3 f5608r;

    public n5(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, l5 l5Var, int i3, long j10, String str, boolean z10, n10 n10Var) {
        TLObject M0;
        HashMap hashMap = new HashMap();
        this.f5605o = hashMap;
        this.f5606p = new HashSet();
        this.f5594b = context;
        this.f5593a = tL_starGiftUnique;
        this.d = j10;
        this.f5595c = i3;
        dg.b bVar = l5Var.f5442a;
        this.f5607q = bVar;
        hashMap.put(bVar, l5Var);
        this.f5598g = e6Var;
        this.f5596e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f5597f = !z11;
        if (j10 >= 0) {
            M0 = hp.s1(i3).a2(Long.valueOf(j10));
        } else {
            M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        }
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        m5 m5Var = new m5(this, context);
        m5Var.addView(f10, mf.c(-2.0f, -1));
        if (!z11) {
            x20 x20Var = new x20(context, e6Var);
            this.f5599i = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131750287, null));
            arrayList.add(bd.M0(2131750286, null));
            x20Var.b(arrayList, new p0(this, 2));
            f10.addView(x20Var, mf.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f5599i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
            k2.p1.u(textView, 1, 14.0f, null, 2131750285);
            textView.setGravity(17);
            f10.addView(textView, mf.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new j5(context, tL_starGiftUnique, M0), mf.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f5600j = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, mf.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            rx0 rx0Var = new rx0(context, e6Var);
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            l6.k1(rx0Var, e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j11 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                rx0Var.c(bd.M0(2131749599, null), t4.c.f("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
            }
            f10.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(m5Var);
        alertDialog$Builder.k("_", new ai.m3(this, i3, context, e6Var, n10Var));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        this.h = alertDialog$Builder.f27343a;
    }

    public final void a(boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c2;
        String a02;
        String K;
        gi.l3 l3Var;
        int i3;
        dg.b bVar = this.f5607q;
        l5 l5Var = (l5) this.f5605o.get(bVar);
        TextView textView = this.f5600j;
        ViewPropertyAnimator animate = textView.animate();
        if (l5Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (l5Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f5602l;
        if (l5Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        c cVar = this.f5601k;
        if (cVar.f4900e != bVar) {
            cVar.f4900e = bVar;
            cVar.a();
        }
        dg.b bVar2 = dg.b.f8926b;
        x20 x20Var = this.f5599i;
        if (x20Var != null) {
            if (bVar == bVar2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            x20Var.a(i3, z10);
        }
        if (bVar == bVar2 && (l3Var = this.f5608r) != null && l3Var.W) {
            l3Var.f(true);
        }
        c cVar2 = this.f5601k;
        dg.b bVar3 = dg.b.f8925a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ai.b(this, 12));
            } else {
                cVar2.setOnClickListener(new ai.t(25));
            }
        }
        sf.b bVar4 = this.f5604n;
        if (bVar4 != null) {
            bVar4.a(false);
            this.f5604n = null;
        }
        int i10 = this.f5595c;
        long j10 = this.d;
        if (l5Var != null) {
            dg.b bVar5 = l5Var.f5442a;
            dg.a aVar = l5Var.f5444c;
            if (j10 == h10.i(i10).e()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f5596e;
            if (bVar5 == bVar3) {
                c2 = 0;
                this.f5602l.setText(wb.T0(bd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    K = bd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str);
                } else {
                    K = bd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j10));
                }
                textView.setText(org.telegram.messenger.g0.X2(K));
            } else {
                c2 = 0;
            }
            if (bVar5 == bVar2) {
                TextView textView3 = this.f5602l;
                Object[] objArr = new Object[1];
                objArr[c2] = aVar.d();
                textView3.setText(wb.V0(bd.a0(null, null, 2131750290, objArr), true));
                if (z13) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = d;
                    objArr2[1] = str;
                    a02 = bd.a0(null, null, 2131750282, objArr2);
                } else {
                    String d10 = aVar.d();
                    String t10 = org.telegram.messenger.m5.t(j10);
                    Object[] objArr3 = new Object[3];
                    objArr3[c2] = d10;
                    objArr3[1] = str;
                    objArr3[2] = t10;
                    a02 = bd.a0(null, null, 2131750278, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.X2(a02));
                return;
            }
            return;
        }
        sf.b h = this.h.h(-1, false, false);
        this.f5604n = h;
        h.d();
        if (this.f5606p.add(bVar)) {
            e9.x(i10, bVar).H(this.f5593a, j10, null, true, new ai.o1(9, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.s1 s1Var = this.h;
        s1Var.f28525a1 = true;
        s1Var.show();
        this.f5602l = (TextView) s1Var.d(-1);
        this.f5601k = s1Var.f28531c1;
        FrameLayout frameLayout = s1Var.f28528b1;
        this.f5603m = frameLayout;
        if (frameLayout != null && this.f5597f) {
            gi.l3 l3Var = new gi.l3(this.f5594b, 3);
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var.d = 5000L;
            l3Var.u(bd.M0(2131750284, null));
            l3Var.w();
            this.f5608r = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f5603m.addView(this.f5608r, mf.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
