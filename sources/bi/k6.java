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
    public final TL_stars.TL_starGiftUnique f4144a;
    public final Context f4145b;
    public final int f4146c;
    public final long d;
    public final String f4147e;
    public final boolean f4148f;
    public final org.telegram.ui.ActionBar.h6 f4149g;
    public final org.telegram.ui.ActionBar.u1 h;
    public final b30 f4150i;
    public final TextView f4151j;
    public c f4152k;
    public TextView f4153l;
    public FrameLayout f4154m;
    public vf.b f4155n;
    public final HashMap f4156o;
    public final HashSet f4157p;
    public cg.b f4158q;
    public fi.m3 f4159r;

    public k6(Context context, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, h6 h6Var2, int i7, long j3, String str, boolean z9, v10 v10Var) {
        TLObject M0;
        HashMap hashMap = new HashMap();
        this.f4156o = hashMap;
        this.f4157p = new HashSet();
        this.f4145b = context;
        this.f4144a = tL_starGiftUnique;
        this.d = j3;
        this.f4146c = i7;
        cg.b bVar = h6Var2.f3994a;
        this.f4158q = bVar;
        hashMap.put(bVar, h6Var2);
        this.f4149g = h6Var;
        this.f4147e = str;
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        this.f4148f = !z10;
        if (j3 >= 0) {
            M0 = qp.s1(i7).a2(Long.valueOf(j3));
        } else {
            M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        }
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        j6 j6Var = new j6(this, context);
        j6Var.addView(f10, c8.ha.c(-2.0f, -1));
        if (!z10) {
            b30 b30Var = new b30(context, h6Var);
            this.f4150i = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131750279, null));
            arrayList.add(org.telegram.messenger.id.M0(2131750278, null));
            b30Var.b(arrayList, new w0(this, 2));
            f10.addView(b30Var, c8.ha.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f4150i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131750277);
            textView.setGravity(17);
            f10.addView(textView, c8.ha.t(-2, -2, 17, 24, 4, 24, 4));
        }
        f10.addView(new f6(context, tL_starGiftUnique, M0), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4151j = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        textView2.setTextSize(1, 16.0f);
        f10.addView(textView2, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        if (z9) {
            tx0 tx0Var = new tx0(context, h6Var);
            k7.j1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            k7.j1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            k7.j1(tx0Var, ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                tx0Var.c(org.telegram.messenger.id.M0(2131749591, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            f10.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        alertDialog$Builder.o(j6Var);
        alertDialog$Builder.k("_", new i6(this, i7, context, h6Var, v10Var, 0));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        this.h = alertDialog$Builder.f27300a;
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
        cg.b bVar = this.f4158q;
        h6 h6Var = (h6) this.f4156o.get(bVar);
        TextView textView = this.f4151j;
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
        TextView textView2 = this.f4153l;
        if (h6Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        textView2.setEnabled(z11);
        c cVar = this.f4152k;
        if (cVar.f3550e != bVar) {
            cVar.f3550e = bVar;
            cVar.a();
        }
        cg.b bVar2 = cg.b.f6166b;
        b30 b30Var = this.f4150i;
        if (b30Var != null) {
            if (bVar == bVar2) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            b30Var.a(i7, z9);
        }
        if (bVar == bVar2 && (m3Var = this.f4159r) != null && m3Var.V) {
            m3Var.f(true);
        }
        c cVar2 = this.f4152k;
        cg.b bVar3 = cg.b.f6165a;
        if (cVar2 != null) {
            if (bVar == bVar3) {
                cVar2.setOnClickListener(new ah.d(this, 9));
            } else {
                cVar2.setOnClickListener(new l1(19));
            }
        }
        vf.b bVar4 = this.f4155n;
        if (bVar4 != null) {
            bVar4.a(false);
            this.f4155n = null;
        }
        int i10 = this.f4146c;
        long j3 = this.d;
        if (h6Var != null) {
            cg.b bVar5 = h6Var.f3994a;
            cg.a aVar = h6Var.f3996c;
            if (j3 == p10.i(i10).e()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str = this.f4147e;
            if (bVar5 == bVar3) {
                c10 = 0;
                this.f4153l.setText(dd.T0(org.telegram.messenger.id.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
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
                TextView textView3 = this.f4153l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar.d();
                textView3.setText(dd.V0(org.telegram.messenger.id.a0(null, null, 2131750282, objArr), true));
                if (z12) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750274, objArr2);
                } else {
                    String d2 = aVar.d();
                    String t6 = org.telegram.messenger.m5.t(j3);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d2;
                    objArr3[1] = str;
                    objArr3[2] = t6;
                    a02 = org.telegram.messenger.id.a0(null, null, 2131750270, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.X2(a02));
                return;
            }
            return;
        }
        vf.b h = this.h.h(-1, false, false);
        this.f4155n = h;
        h.d();
        if (this.f4157p.add(bVar)) {
            ea.x(i10, bVar).H(this.f4144a, j3, null, true, new ai.f1(5, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        u1Var.X0 = true;
        u1Var.show();
        this.f4153l = (TextView) u1Var.d(-1);
        this.f4152k = u1Var.Z0;
        FrameLayout frameLayout = u1Var.Y0;
        this.f4154m = frameLayout;
        if (frameLayout != null && this.f4148f) {
            fi.m3 m3Var = new fi.m3(this.f4145b, 3);
            m3Var.r(true);
            m3Var.K = Layout.Alignment.ALIGN_NORMAL;
            m3Var.d = 5000L;
            m3Var.u(org.telegram.messenger.id.M0(2131750276, null));
            m3Var.w();
            this.f4159r = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f4154m.addView(this.f4159r, c8.ha.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
