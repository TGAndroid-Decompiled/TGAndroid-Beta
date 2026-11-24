package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class gh implements jp7, bj0, kac, ee, OnFailureListener, es6 {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gh(int i, lp7 lp7Var, kj kjVar, lj ljVar, TextView textView) {
        this.a = i;
        this.b = lp7Var;
        this.c = kjVar;
        this.d = ljVar;
        this.e = textView;
    }

    @Override
    public final void b(fj0 fj0Var, List list) {
        gm.c3(new qu((wg6) this.b, (String) this.c, fj0Var, list, (String) this.d, (String) this.e, this.a));
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        fdb fdbVar = (fdb) this.b;
        String str2 = (String) this.c;
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        if (this.a == fdbVar.L) {
            fdbVar.J = (byte) 1;
            fdbVar.K = str2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ds6 ds6Var = (ds6) obj;
                if (!hashSet.contains(ds6Var.a)) {
                    hashSet.add(ds6Var.a);
                    arrayList2.add(ds6Var);
                }
            }
            if (!arrayList2.isEmpty()) {
                fdbVar.y = false;
                fdbVar.w = false;
                fdbVar.b();
                bdb bdbVar = fdbVar.d;
                if (bdbVar != null) {
                    bdbVar.setVisibility(0);
                }
                fdbVar.a0 = gm.L(10.0f);
                fdbVar.x = arrayList;
                fdbVar.b0 = 0;
                fdbVar.c0 = Integer.valueOf(str2.length());
                bdb bdbVar2 = fdbVar.d;
                if (bdbVar2 != null) {
                    bdbVar2.invalidate();
                }
                s30 s30Var = fdbVar.f;
                if (s30Var != null) {
                    s30Var.f();
                    return;
                }
                return;
            }
            fdbVar.x = null;
            fdbVar.y = true;
            fdbVar.e();
        }
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        lp7 lp7Var2 = (lp7) this.b;
        kj kjVar = (kj) this.c;
        lj ljVar = (lj) this.d;
        ik.g(null, null, 0L, this.a, 3, lp7Var2, kjVar, ljVar);
        ik.e((TextView) this.e, lp7Var2, kjVar, ljVar);
    }

    @Override
    public final Object j(Integer num, Object obj) {
        int i;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        lea leaVar = (lea) this.b;
        d dVar = (d) this.c;
        Context context = (Context) this.d;
        ylb ylbVar = (ylb) this.e;
        View view = (View) obj;
        yua yuaVar = leaVar.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !leaVar.P) {
            int i2 = 0;
            while (true) {
                if (i2 < yuaVar.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) yuaVar.d().get(i2)).collection_id == num.intValue()) {
                        i = i2;
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) yuaVar.d().get(i2);
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            int i3 = this.a;
            String q = pg3.q(oc7.r1(i3).a2(leaVar.c));
            boolean h = yuaVar.h();
            if (TextUtils.isEmpty(q) && !h) {
                return Boolean.FALSE;
            }
            bu5 I = bu5.I(dVar, view);
            I.X(new ds8(leaVar));
            I.k(2131231833, jb6.M0(2131750171, null), new ur8(leaVar, (byte) 2), h);
            I.k(2131232369, jb6.M0(2131750167, null), new qu(leaVar, i3, q, tL_starGiftCollection, context, ylbVar, dVar), !TextUtils.isEmpty(q));
            I.k(2131232122, jb6.M0(2131750169, null), new mn8(leaVar, tL_starGiftCollection, (byte) 19), h);
            I.k(2131232791, jb6.M0(2131750168, null), new ur8(leaVar, (byte) 1), h);
            I.l(2131232114, new h65(leaVar, i, tL_starGiftCollection, (byte) 27), jb6.M0(2131750170, null), h, true);
            leaVar.J = I;
            I.a0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void onFailure(Exception exc) {
        n1b n1bVar = (n1b) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        int i = this.a;
        t88 t88Var = (t88) this.d;
        h71 h71Var = (h71) this.e;
        n1bVar.y = false;
        fc4.g(exc, true);
        if ((exc instanceof dg7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1bVar.isAttachedToWindow()) {
            gm.d3(new tda(n1bVar, bitmap, i, t88Var, (byte) 4), 2000L);
        } else {
            h71Var.a(new ArrayList());
        }
    }

    @Override
    public final void r(he heVar, int i) {
        nk nkVar;
        asa asaVar = (asa) this.b;
        Context context = (Context) this.c;
        ylb ylbVar = (ylb) this.d;
        jac jacVar = (jac) this.e;
        yra yraVar = (yra) asaVar.q.get(asaVar.s);
        if (yraVar != null) {
            nk nkVar2 = yraVar.c;
            jva u = jva.u(this.a, asaVar.s);
            if (u.e) {
                nkVar = nk.m(u.m());
            } else {
                nkVar = null;
            }
            if (nkVar != null && nkVar2.b > nkVar.b) {
                ok okVar = asaVar.s;
                if (okVar == ok.a) {
                    new dxa(context, ylbVar, nkVar2.a(), 14, null, null, 0L).show();
                    return;
                } else if (okVar == ok.b) {
                    new xfb(context, ylbVar, nkVar2, null).show();
                    return;
                } else {
                    return;
                }
            }
            k11 k11Var = asaVar.n;
            if (k11Var != null) {
                k11Var.a(false);
                asaVar.n = null;
            }
            jacVar.a(yraVar, heVar.g(i, true, true));
        }
    }

    public gh(wg6 wg6Var, String str, String str2, String str3, int i) {
        this.b = wg6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.a = i;
    }

    public gh(n1b n1bVar, Bitmap bitmap, int i, t88 t88Var, h71 h71Var) {
        this.b = n1bVar;
        this.c = bitmap;
        this.a = i;
        this.d = t88Var;
        this.e = h71Var;
    }

    public gh(Object obj, int i, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
