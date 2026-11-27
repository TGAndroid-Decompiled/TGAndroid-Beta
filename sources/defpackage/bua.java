package defpackage;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bua {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final vnb g;
    public final id h;
    public final zh5 i;
    public final TextView j;
    public us0 k;
    public ie0 l;
    public TextView m;
    public FrameLayout n;
    public l01 o;
    public TLRPC.TL_textWithEntities p;
    public boolean q = true;
    public final HashMap r;
    public final HashSet s;
    public pj t;
    public kg5 u;

    public bua(Context context, vnb vnbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, zta ztaVar, int i, long j, String str, boolean z, icc iccVar) {
        TLObject M0;
        HashMap hashMap = new HashMap();
        this.r = hashMap;
        this.s = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j;
        this.c = i;
        pj pjVar = ztaVar.a;
        this.t = pjVar;
        hashMap.put(pjVar, ztaVar);
        this.g = vnbVar;
        this.e = str;
        boolean z2 = tL_starGiftUnique.resale_ton_only;
        this.f = !z2;
        if (j >= 0) {
            M0 = uc7.s1(i).X1(Long.valueOf(j));
        } else {
            M0 = uc7.s1(i).M0(Long.valueOf(-j));
        }
        LinearLayout j2 = uh9.j(context, 1);
        aua auaVar = new aua(this, context);
        auaVar.addView(j2, tre.c(-2.0f, -1));
        if (!z2) {
            zh5 zh5Var = new zh5(context, vnbVar);
            this.i = zh5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ob6.M0(2131750238, null));
            arrayList.add(ob6.M0(2131750237, null));
            zh5Var.b(arrayList, new ze1(this, (byte) 6));
            j2.addView(zh5Var, tre.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.i = null;
            TextView textView = new TextView(context);
            yob.X(textView, aob.y6, vnbVar);
            bs2.r(14.0f, 1, 2131750236, textView, null);
            textView.setGravity(17);
            j2.addView(textView, tre.t(-2, -2, 17, 24, 4, 24, 4));
        }
        j2.addView(new xta(context, tL_starGiftUnique, M0), tre.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        yob.X(textView2, aob.j5, vnbVar);
        textView2.setTextSize(1, 16.0f);
        j2.addView(textView2, tre.t(-1, -2, 48, 24, 4, 24, 4));
        if (z) {
            hjb hjbVar = new hjb(context, vnbVar);
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            wua.a1(hjbVar, jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                di0.h();
                hjbVar.f(ob6.M0(2131749362, null), c00.i("~", di0.f(tL_starGiftUnique.value_currency, di0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, true)), null, null);
            }
            j2.addView(hjbVar, tre.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        alertDialog$Builder.n(auaVar);
        alertDialog$Builder.j("_", new eg(this, context, i, vnbVar, iccVar));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z) {
        boolean z2;
        zta ztaVar;
        float f;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String a0;
        String K;
        boolean z7;
        String a02;
        kg5 kg5Var;
        int i;
        pj pjVar = this.t;
        us0 us0Var = this.k;
        pj pjVar2 = pj.b;
        if (us0Var != null && pjVar == pjVar2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ztaVar = null;
        } else {
            ztaVar = (zta) this.r.get(pjVar);
        }
        TextView textView = this.j;
        ViewPropertyAnimator animate = textView.animate();
        if (ztaVar == null && !z2) {
            f = 0.25f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).start();
        if (ztaVar == null && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        textView.setEnabled(z3);
        TextView textView2 = this.m;
        if (ztaVar == null && !z2) {
            z4 = false;
        } else {
            z4 = true;
        }
        textView2.setEnabled(z4);
        ie0 ie0Var = this.l;
        if (this.k != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ie0Var.n != z5) {
            ie0Var.n = z5;
            ie0Var.b();
        }
        ie0 ie0Var2 = this.l;
        if (ie0Var2.e != pjVar) {
            ie0Var2.e = pjVar;
            ie0Var2.b();
        }
        zh5 zh5Var = this.i;
        if (zh5Var != null) {
            if (pjVar == pjVar2) {
                i = 1;
            } else {
                i = 0;
            }
            zh5Var.a(i, z);
        }
        if (pjVar == pjVar2 && (kg5Var = this.u) != null && kg5Var.W) {
            kg5Var.f(true);
        }
        ie0 ie0Var3 = this.l;
        pj pjVar3 = pj.a;
        if (ie0Var3 != null) {
            if (pjVar == pjVar3) {
                ie0Var3.setOnClickListener(new kla(this, (byte) 4));
            } else {
                ie0Var3.setOnClickListener(new y00((byte) 1));
            }
        }
        l01 l01Var = this.o;
        if (l01Var != null) {
            l01Var.a(false);
            this.o = null;
        }
        int i2 = this.c;
        String str = this.e;
        long j = this.d;
        if (z2) {
            String d = this.a.getResellAmount(pjVar2).d();
            if (j == yac.h(i2).e()) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.m.setText(nza.V0(ob6.a0(null, null, 2131750241, d), true));
            if (z7) {
                a02 = ob6.a0(null, null, 2131750233, d, str);
            } else {
                a02 = ob6.a0(null, null, 2131750229, d, str, wf3.s(j));
            }
            textView.setText(hl.S2(a02));
        } else if (ztaVar != null) {
            pj pjVar4 = ztaVar.a;
            oj ojVar = ztaVar.c;
            if (j == yac.h(i2).e()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (pjVar4 == pjVar3) {
                this.m.setText(nza.T0(ob6.H(',', "Gift2BuyDoPrice2", (int) ojVar.a())));
                if (z6) {
                    K = ob6.K("Gift2BuyPriceSelfText", (int) ojVar.a(), ',', str);
                } else {
                    K = ob6.K("Gift2BuyPriceText", (int) ojVar.a(), ',', str, wf3.s(j));
                }
                textView.setText(hl.S2(K));
            }
            if (pjVar4 == pjVar2) {
                this.m.setText(nza.V0(ob6.a0(null, null, 2131750241, ojVar.d()), true));
                if (z6) {
                    a0 = ob6.a0(null, null, 2131750233, ojVar.d(), str);
                } else {
                    a0 = ob6.a0(null, null, 2131750229, ojVar.d(), str, wf3.s(j));
                }
                textView.setText(hl.S2(a0));
            }
        } else {
            l01 g = this.h.g(-1, false, false);
            this.o = g;
            g.d();
            if (this.s.add(pjVar)) {
                jxa.u(i2, pjVar).E(this.a, this.d, this.p, this.q, new ku9(this, pjVar, (byte) 11));
            }
        }
    }

    public final void b() {
        id idVar = this.h;
        idVar.Y0 = true;
        idVar.show();
        this.m = (TextView) idVar.c(-1);
        this.l = idVar.a1;
        this.n = idVar.Z0;
        zh5 zh5Var = this.i;
        if (zh5Var != null && this.k == null) {
            zh5Var.setVisibility(8);
            this.t = pj.a;
        }
        if (this.n != null && this.f && this.k != null) {
            kg5 kg5Var = new kg5(this.b, 3);
            kg5Var.p(true);
            kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
            kg5Var.d = 5000L;
            kg5Var.t(ob6.M0(2131750235, null));
            kg5Var.v();
            this.u = kg5Var;
            kg5Var.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
            this.n.addView(this.u, tre.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
