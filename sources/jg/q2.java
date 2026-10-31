package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.fe;
import org.telegram.messenger.j20;
import org.telegram.messenger.k20;
import org.telegram.messenger.o5;
import org.telegram.messenger.pw;
import org.telegram.messenger.qi;
import org.telegram.messenger.ri;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.x3;
import org.telegram.ui.Components.xq0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.jl0;
import org.telegram.ui.ll0;
import org.telegram.ui.se0;
import org.telegram.ui.wo0;
import rh.e6;
import rh.u5;
import rh.x7;
public final class q2 implements OnFailureListener, yb0, ri, org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1, k20 {
    public final int f10157a;
    public final int f10158b;
    public final Object f10159c;
    public final Object d;
    public final Object e;
    public final Object f10160f;

    public q2(int i10, ac0 ac0Var, w3 w3Var, x3 x3Var, TextView textView) {
        this.f10157a = 1;
        this.f10158b = i10;
        this.f10159c = ac0Var;
        this.d = w3Var;
        this.e = x3Var;
        this.f10160f = textView;
    }

    @Override
    public void a(c5.g gVar, List list) {
        org.telegram.messenger.i0.g3(new fe((se0) this.f10159c, (String) this.d, gVar, list, (String) this.e, (String) this.f10160f, this.f10158b));
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        sx0 sx0Var = (sx0) this.f10159c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f10160f;
        if (this.f10158b == sx0Var.K) {
            sx0Var.I = 1;
            sx0Var.J = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    qi qiVar = (qi) obj;
                    if (!hashSet.contains(qiVar.f17590a)) {
                        hashSet.add(qiVar.f17590a);
                        arrayList2.add(qiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                sx0Var.f30383y = false;
                sx0Var.f30381w = false;
                sx0Var.c();
                l0 l0Var = sx0Var.d;
                if (l0Var != null) {
                    l0Var.setVisibility(0);
                }
                sx0Var.W = org.telegram.messenger.i0.L(10.0f);
                sx0Var.f30382x = arrayList;
                sx0Var.f30369a0 = 0;
                sx0Var.f30371b0 = Integer.valueOf(str2.length());
                l0 l0Var2 = sx0Var.d;
                if (l0Var2 != null) {
                    l0Var2.invalidate();
                }
                fg.j jVar = sx0Var.f30376f;
                if (jVar != null) {
                    jVar.f();
                    return;
                }
                return;
            }
            sx0Var.f30382x = null;
            sx0Var.f30383y = true;
            sx0Var.f();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        int i10;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vq0 vq0Var = (vq0) this.f10159c;
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
        Context context = (Context) this.e;
        p6 p6Var = (p6) this.f10160f;
        Integer num = (Integer) number;
        View view = (View) obj;
        u5 u5Var = vq0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vq0Var.O) {
            int i11 = 0;
            while (true) {
                if (i11 < u5Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) u5Var.d().get(i11)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) u5Var.d().get(i11);
                        i10 = i11;
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            int i12 = this.f10158b;
            String r10 = o5.r(vp.r1(i12).d2(vq0Var.f45130c));
            boolean h = u5Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            z60 H = z60.H(k2Var, view);
            H.W(new xq0(vq0Var));
            H.l(2131231827, cd.L0(2131750247, null), new ph.m1(vq0Var, 2), h);
            H.l(2131232362, cd.L0(2131750243, null), new fe(vq0Var, i12, r10, tL_starGiftCollection, context, p6Var, k2Var, 17), !TextUtils.isEmpty(r10));
            H.l(2131232115, cd.L0(2131750245, null), new org.telegram.ui.web.v1(10, vq0Var, tL_starGiftCollection), h);
            H.l(2131232770, cd.L0(2131750244, null), new ph.m1(vq0Var, 1), h);
            H.m(2131232107, new org.telegram.ui.Wallet.x0(vq0Var, i10, tL_starGiftCollection, 8), cd.L0(2131750246, null), h, true);
            vq0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        sf.a aVar;
        switch (this.f10157a) {
            case 4:
                pw pwVar = (pw) this.d;
                jl0 jl0Var = (jl0) this.e;
                ll0.d0(this.f10158b, (String) this.f10160f, pwVar, jl0Var, (ll0) this.f10159c);
                return;
            default:
                rh.g3 g3Var = (rh.g3) this.f10159c;
                Context context = (Context) this.d;
                p6 p6Var = (p6) this.e;
                j20 j20Var = (j20) this.f10160f;
                rh.d3 d3Var = (rh.d3) g3Var.f46949o.get(g3Var.f46951q);
                if (d3Var != null) {
                    sf.a aVar2 = d3Var.f46758c;
                    e6 x10 = e6.x(this.f10158b, g3Var.f46951q);
                    if (x10.e) {
                        aVar = sf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f48255b > aVar.f48255b) {
                        sf.b bVar = g3Var.f46951q;
                        if (bVar == sf.b.f48256a) {
                            new x7(context, p6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == sf.b.f48257b) {
                            new wh.f(context, p6Var, d3Var.f46758c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    gf.e eVar = g3Var.f46948n;
                    if (eVar != null) {
                        eVar.a(false);
                        g3Var.f46948n = null;
                    }
                    j20Var.a(d3Var, x1Var.h(i10, true, true));
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        v2 v2Var = (v2) this.f10159c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f10158b;
        wo0 wo0Var = (wo0) this.e;
        o2 o2Var = (o2) this.f10160f;
        v2Var.f10333y = false;
        f8.g(exc, true);
        if ((exc instanceof fb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && v2Var.isAttachedToWindow()) {
            org.telegram.messenger.i0.h3(new ag.g3(v2Var, bitmap, i10, wo0Var, 2), 2000L);
        } else {
            o2Var.a(new ArrayList());
        }
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        ac0 ac0Var2 = (ac0) this.f10159c;
        w3 w3Var = (w3) this.d;
        x3 x3Var = (x3) this.e;
        s4.g(null, null, 0L, this.f10158b, 3, ac0Var2, w3Var, x3Var);
        s4.e((TextView) this.f10160f, ac0Var2, w3Var, x3Var);
    }

    public q2(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f10157a = i11;
        this.f10159c = obj;
        this.f10158b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f10160f = obj4;
    }

    public q2(us usVar, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f10157a = i11;
        this.f10159c = usVar;
        this.d = obj;
        this.f10158b = i10;
        this.e = obj2;
        this.f10160f = obj3;
    }

    public q2(se0 se0Var, String str, String str2, String str3, int i10) {
        this.f10157a = 3;
        this.f10159c = se0Var;
        this.d = str;
        this.e = str2;
        this.f10160f = str3;
        this.f10158b = i10;
    }
}
