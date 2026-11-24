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
public final class asa {
    public final TL_stars.TL_starGiftUnique a;
    public final Context b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final ylb g;
    public final he h;
    public final wh5 i;
    public final TextView j;
    public gf0 k;
    public TextView l;
    public FrameLayout m;
    public k11 n;
    public TLRPC.TL_textWithEntities o;
    public boolean p = true;
    public final HashMap q;
    public final HashSet r;
    public ok s;
    public hg5 t;

    public asa(Context context, ylb ylbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, yra yraVar, int i, long j, String str, boolean z, jac jacVar) {
        TLObject L0;
        HashMap hashMap = new HashMap();
        this.q = hashMap;
        this.r = new HashSet();
        this.b = context;
        this.a = tL_starGiftUnique;
        this.d = j;
        this.c = i;
        ok okVar = yraVar.a;
        this.s = okVar;
        hashMap.put(okVar, yraVar);
        this.g = ylbVar;
        this.e = str;
        boolean z2 = tL_starGiftUnique.resale_ton_only;
        this.f = !z2;
        if (j >= 0) {
            L0 = oc7.r1(i).W1(Long.valueOf(j));
        } else {
            L0 = oc7.r1(i).L0(Long.valueOf(-j));
        }
        LinearLayout i2 = hg9.i(context, 1);
        zra zraVar = new zra(this, context);
        zraVar.addView(i2, qoe.c(-2.0f, -1));
        if (!z2) {
            wh5 wh5Var = new wh5(context, ylbVar);
            this.i = wh5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(jb6.M0(2131750212, null));
            arrayList.add(jb6.M0(2131750211, null));
            wh5Var.b(arrayList, new zf1(this, (byte) 6));
            i2.addView(wh5Var, qoe.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.i = null;
            TextView textView = new TextView(context);
            anb.X(textView, cmb.x6, ylbVar);
            ts2.q(14.0f, 1, 2131750210, textView, null);
            textView.setGravity(17);
            i2.addView(textView, qoe.t(-2, -2, 17, 24, 4, 24, 4));
        }
        i2.addView(new wra(context, tL_starGiftUnique, L0), qoe.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.j = textView2;
        anb.X(textView2, cmb.i5, ylbVar);
        textView2.setTextSize(1, 16.0f);
        i2.addView(textView2, qoe.t(-1, -2, 48, 24, 4, 24, 4));
        if (z) {
            mhb mhbVar = new mhb(context, ylbVar);
            wsa.Z0(mhbVar, jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            wsa.Z0(mhbVar, jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            wsa.Z0(mhbVar, jva.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                cj0.h();
                mhbVar.f(jb6.M0(2131749365, null), b10.h("~", cj0.f(tL_starGiftUnique.value_currency, cj0.h().g(tL_starGiftUnique.value_currency), tL_starGiftUnique.value_amount, true)), null, null);
            }
            i2.addView(mhbVar, qoe.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        alertDialog$Builder.n(zraVar);
        alertDialog$Builder.j("_", new gh(this, i, context, ylbVar, jacVar));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        this.h = alertDialog$Builder.a;
    }

    public final void a(boolean z) {
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        String a0;
        String K;
        hg5 hg5Var;
        int i;
        ok okVar = this.s;
        yra yraVar = (yra) this.q.get(okVar);
        TextView textView = this.j;
        ViewPropertyAnimator animate = textView.animate();
        if (yraVar != null) {
            f = 1.0f;
        } else {
            f = 0.25f;
        }
        animate.alpha(f).start();
        if (yraVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        textView.setEnabled(z2);
        TextView textView2 = this.l;
        if (yraVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        textView2.setEnabled(z3);
        gf0 gf0Var = this.k;
        if (gf0Var.e != okVar) {
            gf0Var.e = okVar;
            gf0Var.b();
        }
        ok okVar2 = ok.b;
        wh5 wh5Var = this.i;
        if (wh5Var != null) {
            if (okVar == okVar2) {
                i = 1;
            } else {
                i = 0;
            }
            wh5Var.a(i, z);
        }
        if (okVar == okVar2 && (hg5Var = this.t) != null && hg5Var.W) {
            hg5Var.f(true);
        }
        gf0 gf0Var2 = this.k;
        ok okVar3 = ok.a;
        if (gf0Var2 != null) {
            if (okVar == okVar3) {
                gf0Var2.setOnClickListener(new oha(this, (byte) 6));
            } else {
                gf0Var2.setOnClickListener(new x10((byte) 1));
            }
        }
        k11 k11Var = this.n;
        if (k11Var != null) {
            k11Var.a(false);
            this.n = null;
        }
        int i2 = this.c;
        if (yraVar != null) {
            ok okVar4 = yraVar.a;
            nk nkVar = yraVar.c;
            long e = z8c.h(i2).e();
            long j = this.d;
            if (j == e) {
                z4 = true;
            } else {
                z4 = false;
            }
            String str = this.e;
            if (okVar4 == okVar3) {
                c = 0;
                this.l.setText(nxa.T0(jb6.H(',', "Gift2BuyDoPrice2", (int) nkVar.a())));
                if (z4) {
                    K = jb6.K("Gift2BuyPriceSelfText", (int) nkVar.a(), ',', str);
                } else {
                    K = jb6.K("Gift2BuyPriceText", (int) nkVar.a(), ',', str, pg3.s(j));
                }
                textView.setText(gm.S2(K));
            } else {
                c = 0;
            }
            if (okVar4 == okVar2) {
                TextView textView3 = this.l;
                Object[] objArr = new Object[1];
                objArr[c] = nkVar.d();
                textView3.setText(nxa.V0(jb6.a0(null, null, 2131750215, objArr), true));
                if (z4) {
                    Object[] objArr2 = new Object[2];
                    objArr2[c] = nkVar.d();
                    objArr2[1] = str;
                    a0 = jb6.a0(null, null, 2131750207, objArr2);
                } else {
                    String d = nkVar.d();
                    String s = pg3.s(j);
                    Object[] objArr3 = new Object[3];
                    objArr3[c] = d;
                    objArr3[1] = str;
                    objArr3[2] = s;
                    a0 = jb6.a0(null, null, 2131750203, objArr3);
                }
                textView.setText(gm.S2(a0));
                return;
            }
            return;
        }
        k11 g = this.h.g(-1, false, false);
        this.n = g;
        g.d();
        if (this.r.add(okVar)) {
            jva.u(i2, okVar).E(this.a, this.d, this.o, this.p, new ts9(this, okVar, (byte) 12));
        }
    }

    public final void b() {
        he heVar = this.h;
        heVar.Y0 = true;
        heVar.show();
        this.l = (TextView) heVar.c(-1);
        this.k = heVar.a1;
        FrameLayout frameLayout = heVar.Z0;
        this.m = frameLayout;
        if (frameLayout != null && this.f) {
            hg5 hg5Var = new hg5(this.b, 3);
            hg5Var.p(true);
            hg5Var.L = Layout.Alignment.ALIGN_NORMAL;
            hg5Var.d = 5000L;
            hg5Var.t(jb6.M0(2131750209, null));
            hg5Var.v();
            this.t = hg5Var;
            hg5Var.setPadding(gm.L(7.33f), 0, gm.L(7.33f), 0);
            this.m.addView(this.t, qoe.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
