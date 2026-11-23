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
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.p30;
public final class h5 {
    public final TL_stars.TL_starGiftUnique f8918a;
    public final Context f8919b;
    public final int f8920c;
    public final long d;
    public final String f8921e;
    public final boolean f8922f;
    public final org.telegram.ui.ActionBar.h6 f8923g;
    public final org.telegram.ui.ActionBar.t1 h;
    public final p30 f8924i;
    public final TextView f8925j;
    public b f8926k;
    public TextView f8927l;
    public FrameLayout f8928m;
    public vf.b f8929n;
    public TLRPC.TL_textWithEntities f8930o;
    public boolean f8931p = true;
    public final HashMap f8932q;
    public final HashSet f8933r;
    public cg.b f8934s;
    public hi.l3 f8935t;

    public h5(Context context, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, f5 f5Var, int i7, long j3, String str, boolean z10, r10 r10Var) {
        TLObject O0;
        HashMap hashMap = new HashMap();
        this.f8932q = hashMap;
        this.f8933r = new HashSet();
        this.f8919b = context;
        this.f8918a = tL_starGiftUnique;
        this.d = j3;
        this.f8920c = i7;
        cg.b bVar = f5Var.f8753a;
        this.f8934s = bVar;
        hashMap.put(bVar, f5Var);
        this.f8923g = h6Var;
        this.f8921e = str;
        boolean z11 = tL_starGiftUnique.resale_ton_only;
        this.f8922f = !z11;
        if (j3 >= 0) {
            O0 = np.u1(i7).c2(Long.valueOf(j3));
        } else {
            O0 = np.u1(i7).O0(Long.valueOf(-j3));
        }
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g5 g5Var = new g5(this, context);
        g5Var.addView(g10, c8.na.c(-2.0f, -1));
        if (!z11) {
            p30 p30Var = new p30(context, h6Var);
            this.f8924i = p30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.N0(2131750262, null));
            arrayList.add(hd.N0(2131750261, null));
            p30Var.b(arrayList, new k0(this, 2));
            g10.addView(p30Var, c8.na.t(-2, -2, 1, 18, 0, 18, 12));
        } else {
            this.f8924i = null;
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29739y6, h6Var);
            i5.c.r(14.0f, 1, 2131750260, textView, null);
            textView.setGravity(17);
            g10.addView(textView, c8.na.t(-2, -2, 17, 24, 4, 24, 4));
        }
        g10.addView(new d5(context, tL_starGiftUnique, O0), c8.na.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8925j = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29455j5, h6Var);
        textView2.setTextSize(1, 16.0f);
        g10.addView(textView2, c8.na.t(-1, -2, 48, 24, 4, 24, 4));
        if (z10) {
            ey0 ey0Var = new ey0(context, h6Var);
            f6.m1(ey0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            f6.m1(ey0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            f6.m1(ey0Var, y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                long j10 = tL_starGiftUnique.value_amount;
                String str2 = tL_starGiftUnique.value_currency;
                int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                i10.getClass();
                ey0Var.e(hd.N0(2131749415, null), p5.c.k("~", org.telegram.messenger.r1.g(str2, h, j10, true)), null, null);
            }
            g10.addView(ey0Var, c8.na.t(-1, -2, 48, 23, 16, 23, 4));
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        alertDialog$Builder.o(g5Var);
        alertDialog$Builder.k("_", new bi.o5(this, i7, context, h6Var, r10Var));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        this.h = alertDialog$Builder.f28743a;
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
        cg.b bVar = this.f8934s;
        f5 f5Var = (f5) this.f8932q.get(bVar);
        TextView textView = this.f8925j;
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
        TextView textView2 = this.f8927l;
        if (f5Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        textView2.setEnabled(z12);
        b bVar2 = this.f8926k;
        if (bVar2.f8498e != bVar) {
            bVar2.f8498e = bVar;
            bVar2.b();
        }
        cg.b bVar3 = cg.b.f5269b;
        p30 p30Var = this.f8924i;
        if (p30Var != null) {
            if (bVar == bVar3) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            p30Var.a(i7, z10);
        }
        if (bVar == bVar3 && (l3Var = this.f8935t) != null && l3Var.W) {
            l3Var.f(true);
        }
        b bVar4 = this.f8926k;
        cg.b bVar5 = cg.b.f5268a;
        if (bVar4 != null) {
            if (bVar == bVar5) {
                bVar4.setOnClickListener(new ah.d(this, 17));
            } else {
                bVar4.setOnClickListener(new bi.o(24));
            }
        }
        vf.b bVar6 = this.f8929n;
        if (bVar6 != null) {
            bVar6.a(false);
            this.f8929n = null;
        }
        int i10 = this.f8920c;
        if (f5Var != null) {
            cg.b bVar7 = f5Var.f8753a;
            cg.a aVar = f5Var.f8755c;
            long e10 = k10.i(i10).e();
            long j3 = this.d;
            if (j3 == e10) {
                z13 = true;
            } else {
                z13 = false;
            }
            String str = this.f8921e;
            if (bVar7 == bVar5) {
                c10 = 0;
                this.f8927l.setText(pb.T0(hd.H(',', "Gift2BuyDoPrice2", (int) aVar.a())));
                if (z13) {
                    K = hd.K("Gift2BuyPriceSelfText", (int) aVar.a(), ',', str);
                } else {
                    K = hd.K("Gift2BuyPriceText", (int) aVar.a(), ',', str, org.telegram.messenger.n5.t(j3));
                }
                textView.setText(org.telegram.messenger.g0.W2(K));
            } else {
                c10 = 0;
            }
            if (bVar7 == bVar3) {
                TextView textView3 = this.f8927l;
                Object[] objArr = new Object[1];
                objArr[c10] = aVar.d();
                textView3.setText(pb.V0(hd.a0(null, null, 2131750265, objArr), true));
                if (z13) {
                    String d = aVar.d();
                    Object[] objArr2 = new Object[2];
                    objArr2[c10] = d;
                    objArr2[1] = str;
                    a02 = hd.a0(null, null, 2131750257, objArr2);
                } else {
                    String d2 = aVar.d();
                    String t6 = org.telegram.messenger.n5.t(j3);
                    Object[] objArr3 = new Object[3];
                    objArr3[c10] = d2;
                    objArr3[1] = str;
                    objArr3[2] = t6;
                    a02 = hd.a0(null, null, 2131750253, objArr3);
                }
                textView.setText(org.telegram.messenger.g0.W2(a02));
                return;
            }
            return;
        }
        vf.b h = this.h.h(-1, false, false);
        this.f8929n = h;
        h.d();
        if (this.f8933r.add(bVar)) {
            y8.x(i10, bVar).H(this.f8918a, this.d, this.f8930o, this.f8931p, new ai.r1(12, this, bVar));
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        t1Var.Y0 = true;
        t1Var.show();
        this.f8927l = (TextView) t1Var.d(-1);
        this.f8926k = t1Var.f29978a1;
        FrameLayout frameLayout = t1Var.Z0;
        this.f8928m = frameLayout;
        if (frameLayout != null && this.f8922f) {
            hi.l3 l3Var = new hi.l3(this.f8919b, 3);
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var.d = 5000L;
            l3Var.v(hd.N0(2131750259, null));
            l3Var.x();
            this.f8935t = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
            this.f8928m.addView(this.f8935t, c8.na.d(-2, 100.0f, 48, 0.0f, 26.0f, 0.0f, 0.0f));
        }
        a(false);
    }
}
