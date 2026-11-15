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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.vx0;
public final class e5 {
    public final TL_stars.TL_starGiftUnique f8453a;
    public final Context f8454b;
    public final int f8455c;
    public final long d;
    public final String f8456e;
    public final boolean f8457f;
    public final org.telegram.ui.ActionBar.e6 f8458g;
    public final org.telegram.ui.ActionBar.t1 h;
    public final e30 f8459i;
    public final TextView f8460j;
    public b f8461k;
    public TextView f8462l;
    public FrameLayout f8463m;
    public vf.b f8464n;
    public final HashMap f8465o;
    public final HashSet f8466p;
    public cg.b f8467q;
    public hi.l3 f8468r;

    public e5(Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, c5 c5Var, int i7, long j3, String str, boolean z10, s10 s10Var) {
        TLObject M0;
        HashMap hashMap = new HashMap();
        this.f8465o = hashMap;
        this.f8466p = new HashSet();
        this.f8454b = context;
        this.f8453a = tL_starGiftUnique;
        this.d = j3;
        this.f8455c = i7;
        cg.b bVar = c5Var.f8303a;
        this.f8467q = bVar;
        hashMap.put(bVar, c5Var);
        this.f8458g = e6Var;
        this.f8456e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f8457f = !z11;
        if (j3 >= 0) {
            M0 = np.s1(i7).a2(Long.valueOf(j3));
        } else {
            M0 = np.s1(i7).M0(Long.valueOf(-j3));
        }
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        d5 d5Var = new d5(this, context);
        d5Var.addView(f10, c8.ja.c(-2.0f, -1));
        if (!z11) {
            e30 e30Var = new e30(context, e6Var);
            this.f8459i = e30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.M0(2131750279, null));
            arrayList.add(hd.M0(2131750278, null));
            e30Var.b(arrayList, new l0(this, 2));
            f10.addView(e30Var, c8.ja.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f8459i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
            i5.c.w(textView, 1, 14.0f, null, 2131750277);
            textView.setGravity(17);
            f10.addView(textView, c8.ja.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new a5(context, tL_starGiftUnique, M0), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8460j = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            vx0 vx0Var = new vx0(context, e6Var);
            c6.k1(vx0Var, v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            c6.k1(vx0Var, v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            c6.k1(vx0Var, v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                vx0Var.c(hd.M0(2131749591, null), r.b.k("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            f10.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        alertDialog$Builder.o(d5Var);
        alertDialog$Builder.k("_", new bi.b3(this, i7, context, e6Var, s10Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        this.h = alertDialog$Builder.f28392a;
    }

    public final void a(boolean z10) {
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        char c10;
        String a02;
        String K;
        hi.l3 l3Var;
        int i7;
        cg.b bVar = this.f8467q;
        c5 c5Var = (c5) this.f8465o.get(bVar);
        TextView textView = this.f8460j;
        ViewPropertyAnimator animate = textView.animate();
        if (c5Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (c5Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView.setEnabled(z11);
        TextView textView2 = this.f8462l;
        if (c5Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        b bVar2 = this.f8461k;
        if (bVar2.f8230e != bVar) {
            bVar2.f8230e = bVar;
            bVar2.a();
        }
        cg.b bVar3 = cg.b.f4988b;
        e30 e30Var = this.f8459i;
        if (e30Var != null) {
            if (bVar == bVar3) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            e30Var.a(i7, z10);
        }
        if (bVar == bVar3 && (l3Var = this.f8468r) != null && l3Var.W) {
            l3Var.f(true);
        }
        b bVar4 = this.f8461k;
        cg.b bVar5 = cg.b.f4987a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ah.d(this, 16));
            } else {
                bVar4.setOnClickListener(new bi.o(22));
            }
        }
        vf.b bVar6 = this.f8464n;
        if (bVar6 != null) {
            bVar6.a(false);
            this.f8464n = null;
        }
        int i10 = this.f8455c;
        long j3 = this.d;
        if (c5Var != null) {
            cg.b bVar7 = c5Var.f8303a;
            cg.a aVar = c5Var.f8305c;
            if (j3 == m10.i(i10).e()) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f8456e;
            if (bVar7 == bVar5) {
                c10 = 0;
                this.f8462l.setText(mb.T0(hd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    K = hd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str);
                } else {
                    K = hd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j3));
                }
                textView.setText(org.telegram.messenger.g0.X2(K));
            } else {
                c10 = 0;
            }
            if (bVar7 == bVar3) {
                TextView textView3 = this.f8462l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar.d();
                textView3.setText(mb.V0(hd.a0(null, null, 2131750282, objArr), true));
                if (z13) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = hd.a0(null, null, 2131750274, objArr2);
                } else {
                    String d2 = aVar.d();
                    String t6 = org.telegram.messenger.m5.t(j3);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d2;
                    objArr3[1] = str;
                    objArr3[2] = t6;
                    a02 = hd.a0(null, null, 2131750270, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.X2(a02));
                return;
            }
            return;
        }
        vf.b h = this.h.h(-1, false, false);
        this.f8464n = h;
        h.d();
        if (this.f8466p.add(bVar)) {
            v8.x(i10, bVar).H(this.f8453a, j3, null, true, new ai.u1(10, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        t1Var.Y0 = true;
        t1Var.show();
        this.f8462l = (TextView) t1Var.d(-1);
        this.f8461k = t1Var.f29616a1;
        FrameLayout frameLayout = t1Var.Z0;
        this.f8463m = frameLayout;
        if (frameLayout != null && this.f8457f) {
            hi.l3 l3Var = new hi.l3(this.f8454b, 3);
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var.d = 5000L;
            l3Var.u(hd.M0(2131750276, null));
            l3Var.w();
            this.f8468r = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f8463m.addView(this.f8468r, c8.ja.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
