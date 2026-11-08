package bi;

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
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.tx0;
public final class k6 {
    public final TL_stars.TL_starGiftUnique f4147a;
    public final Context f4148b;
    public final int f4149c;
    public final long d;
    public final String f4150e;
    public final boolean f4151f;
    public final org.telegram.ui.ActionBar.f6 f4152g;
    public final org.telegram.ui.ActionBar.u1 h;
    public final b30 f4153i;
    public final TextView f4154j;
    public c f4155k;
    public TextView f4156l;
    public FrameLayout f4157m;
    public vf.b f4158n;
    public final HashMap f4159o;
    public final HashSet f4160p;
    public cg.b f4161q;
    public fi.m3 f4162r;

    public k6(Context context, org.telegram.ui.ActionBar.f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, h6 h6Var, int i7, long j3, String str, boolean z9, v10 v10Var) {
        TLObject M0;
        HashMap hashMap = new HashMap();
        this.f4159o = hashMap;
        this.f4160p = new HashSet();
        this.f4148b = context;
        this.f4147a = tL_starGiftUnique;
        this.d = j3;
        this.f4149c = i7;
        cg.b bVar = h6Var.f3997a;
        this.f4161q = bVar;
        hashMap.put(bVar, h6Var);
        this.f4152g = f6Var;
        this.f4150e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f4151f = !z10;
        if (j3 >= 0) {
            M0 = qp.s1(i7).a2(Long.valueOf(j3));
        } else {
            M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        }
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        j6 j6Var = new j6(this, context);
        j6Var.addView(f10, c8.ha.c(-2.0f, -1));
        if (!z10) {
            b30 b30Var = new b30(context, f6Var);
            this.f4153i = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131750280, null));
            arrayList.add(org.telegram.messenger.id.M0(2131750279, null));
            b30Var.b(arrayList, new w0(this, 2));
            f10.addView(b30Var, c8.ha.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f4153i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28244y6, f6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131750278);
            textView.setGravity(17);
            f10.addView(textView, c8.ha.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new f6(context, tL_starGiftUnique, M0), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4154j = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        if (z9) {
            tx0 tx0Var = new tx0(context, f6Var);
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k7.k1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                tx0Var.c(org.telegram.messenger.id.M0(2131749592, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            f10.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        alertDialog$Builder.o(j6Var);
        alertDialog$Builder.k("_", new i6(this, i7, context, f6Var, v10Var, 0));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        this.h = alertDialog$Builder.f27296a;
    }

    public final void a(boolean z9) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        char c10;
        String a02;
        String K;
        fi.m3 m3Var;
        int i7;
        cg.b bVar = this.f4161q;
        h6 h6Var = (h6) this.f4159o.get(bVar);
        TextView textView = this.f4154j;
        ViewPropertyAnimator animate = textView.animate();
        if (h6Var != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.25f;
        }
        animate.alpha(f10).start();
        if (h6Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setEnabled(z10);
        TextView textView2 = this.f4156l;
        if (h6Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView2.setEnabled(z11);
        c cVar = this.f4155k;
        if (cVar.f3547e != bVar) {
            cVar.f3547e = bVar;
            cVar.a();
        }
        cg.b bVar2 = cg.b.f6163b;
        b30 b30Var = this.f4153i;
        if (b30Var != null) {
            if (bVar == bVar2) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            b30Var.a(i7, z9);
        }
        if (bVar == bVar2 && (m3Var = this.f4162r) != null && m3Var.V) {
            m3Var.f(true);
        }
        c cVar2 = this.f4155k;
        cg.b bVar3 = cg.b.f6162a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.d(this, 9));
            } else {
                cVar2.setOnClickListener(new l1(19));
            }
        }
        vf.b bVar4 = this.f4158n;
        if (bVar4 != null) {
            bVar4.a(false);
            this.f4158n = null;
        }
        int i10 = this.f4149c;
        long j3 = this.d;
        if (h6Var != null) {
            cg.b bVar5 = h6Var.f3997a;
            cg.a aVar = h6Var.f3999c;
            if (j3 == p10.i(i10).e()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str = this.f4150e;
            if (bVar5 == bVar3) {
                c10 = 0;
                this.f4156l.setText(dd.T0(org.telegram.messenger.id.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
                if (z12) {
                    K = org.telegram.messenger.id.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str);
                } else {
                    K = org.telegram.messenger.id.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.m5.t(j3));
                }
                textView.setText(org.telegram.messenger.g0.X2(K));
            } else {
                c10 = 0;
            }
            if (bVar5 == bVar2) {
                TextView textView3 = this.f4156l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar.d();
                textView3.setText(dd.V0(org.telegram.messenger.id.a0(null, null, 2131750283, objArr), true));
                if (z12) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750275, objArr2);
                } else {
                    String d2 = aVar.d();
                    String t6 = org.telegram.messenger.m5.t(j3);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d2;
                    objArr3[1] = str;
                    objArr3[2] = t6;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750271, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.X2(a02));
                return;
            }
            return;
        }
        vf.b h = this.h.h(-1, false, false);
        this.f4158n = h;
        h.d();
        if (this.f4160p.add(bVar)) {
            ea.x(i10, bVar).H(this.f4147a, j3, null, true, new ai.f1(5, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        u1Var.X0 = true;
        u1Var.show();
        this.f4156l = (TextView) u1Var.d(-1);
        this.f4155k = u1Var.Z0;
        FrameLayout frameLayout = u1Var.Y0;
        this.f4157m = frameLayout;
        if (frameLayout != null && this.f4151f) {
            fi.m3 m3Var = new fi.m3(this.f4148b, 3);
            m3Var.r(true);
            m3Var.K = Layout.Alignment.ALIGN_NORMAL;
            m3Var.d = 5000L;
            m3Var.u(org.telegram.messenger.id.M0(2131750277, null));
            m3Var.w();
            this.f4162r = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f4157m.addView(this.f4162r, c8.ha.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
