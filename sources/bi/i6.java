package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ew;
import org.telegram.messenger.ls;
import org.telegram.messenger.qi;
import org.telegram.messenger.qp;
import org.telegram.messenger.ri;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.bk0;
import org.telegram.ui.dk0;
import org.telegram.ui.f10;
import org.telegram.ui.ln0;
import org.telegram.ui.nd0;
public final class i6 implements org.telegram.ui.ActionBar.r1, gb0, ri, org.telegram.messenger.q1, OnFailureListener, w10 {
    public final int f4044a;
    public final int f4045b;
    public final Object f4046c;
    public final Object d;
    public final Object f4047e;
    public final Object f4048f;

    public i6(int i7, ib0 ib0Var, org.telegram.ui.Components.z3 z3Var, org.telegram.ui.Components.a4 a4Var, TextView textView) {
        this.f4044a = 1;
        this.f4045b = i7;
        this.f4046c = ib0Var;
        this.d = z3Var;
        this.f4047e = a4Var;
        this.f4048f = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new jg.c1((nd0) this.f4046c, (String) this.d, fVar, list, (String) this.f4047e, (String) this.f4048f, this.f4045b));
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vp0 vp0Var = (vp0) this.f4046c;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f4048f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f4047e;
        Integer num = (Integer) number;
        View view = (View) obj;
        t9 t9Var = vp0Var.f60295e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vp0Var.O) {
            int i10 = 0;
            while (true) {
                if (i10 < t9Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) t9Var.d().get(i10)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) t9Var.d().get(i10);
                        i7 = i10;
                        break;
                    }
                    i10++;
                } else {
                    i7 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            int i11 = this.f4045b;
            String r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(vp0Var.f60294c));
            boolean h = t9Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            l60 H = l60.H(f2Var, view);
            H.W(new xp0(vp0Var));
            H.l(2131231828, org.telegram.messenger.id.M0(2131750238, null), new zh.h1(vp0Var, 2), h);
            H.l(2131232363, org.telegram.messenger.id.M0(2131750234, null), new jg.c1(vp0Var, i11, r10, tL_starGiftCollection, context, g6Var, f2Var, 18), !TextUtils.isEmpty(r10));
            H.l(2131232116, org.telegram.messenger.id.M0(2131750236, null), new yf.b(9, vp0Var, tL_starGiftCollection), h);
            H.l(2131232773, org.telegram.messenger.id.M0(2131750235, null), new zh.h1(vp0Var, 1), h);
            H.m(2131232108, new f10(vp0Var, i7, tL_starGiftCollection, 25), org.telegram.messenger.id.M0(2131750237, null), h, true);
            vp0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        pw0 pw0Var = (pw0) this.f4046c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f4047e;
        ArrayList arrayList2 = (ArrayList) this.f4048f;
        if (this.f4045b == pw0Var.K) {
            pw0Var.I = 1;
            pw0Var.J = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    qi qiVar = (qi) obj;
                    if (!hashSet.contains(qiVar.f24701a)) {
                        hashSet.add(qiVar.f24701a);
                        arrayList2.add(qiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                pw0Var.f37118y = false;
                pw0Var.f37116w = false;
                pw0Var.c();
                e5 e5Var = pw0Var.d;
                if (e5Var != null) {
                    e5Var.setVisibility(0);
                }
                pw0Var.W = org.telegram.messenger.g0.L(10.0f);
                pw0Var.f37117x = arrayList;
                pw0Var.f37103a0 = 0;
                pw0Var.f37105b0 = Integer.valueOf(str2.length());
                e5 e5Var2 = pw0Var.d;
                if (e5Var2 != null) {
                    e5Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = pw0Var.f37111f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            pw0Var.f37117x = null;
            pw0Var.f37118y = true;
            pw0Var.f();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cg.a aVar;
        switch (this.f4044a) {
            case 0:
                k6 k6Var = (k6) this.f4046c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f4047e;
                v10 v10Var = (v10) this.f4048f;
                h6 h6Var = (h6) k6Var.f4159o.get(k6Var.f4161q);
                if (h6Var != null) {
                    cg.a aVar2 = h6Var.f3999c;
                    ea x10 = ea.x(this.f4045b, k6Var.f4161q);
                    if (x10.f3810e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f6159b > aVar.f6159b) {
                        cg.b bVar = k6Var.f4161q;
                        if (bVar == cg.b.f6160a) {
                            new tc(context, g6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f6161b) {
                            new gi.e(context, g6Var, h6Var.f3999c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = k6Var.f4158n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        k6Var.f4158n = null;
                    }
                    v10Var.a(h6Var, u1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                ew ewVar = (ew) this.d;
                bk0 bk0Var = (bk0) this.f4047e;
                dk0.e0(this.f4045b, (String) this.f4048f, ewVar, bk0Var, (dk0) this.f4046c);
                return;
        }
    }

    @Override
    public void n(ib0 ib0Var, int i7) {
        ib0 ib0Var2 = (ib0) this.f4046c;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.d;
        org.telegram.ui.Components.a4 a4Var = (org.telegram.ui.Components.a4) this.f4047e;
        org.telegram.ui.Components.v4.g(null, null, 0L, this.f4045b, 3, ib0Var2, z3Var, a4Var);
        org.telegram.ui.Components.v4.e((TextView) this.f4048f, ib0Var2, z3Var, a4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.c2 c2Var = (tg.c2) this.f4046c;
        Bitmap bitmap = (Bitmap) this.d;
        int i7 = this.f4045b;
        ln0 ln0Var = (ln0) this.f4047e;
        hi.d4 d4Var = (hi.d4) this.f4048f;
        c2Var.f55627y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new qp0(c2Var, bitmap, i7, ln0Var, 23), 2000L);
        } else {
            d4Var.a(new ArrayList());
        }
    }

    public i6(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4044a = i10;
        this.f4046c = obj;
        this.f4045b = i7;
        this.d = obj2;
        this.f4047e = obj3;
        this.f4048f = obj4;
    }

    public i6(ls lsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f4044a = i10;
        this.f4046c = lsVar;
        this.d = obj;
        this.f4045b = i7;
        this.f4047e = obj2;
        this.f4048f = obj3;
    }

    public i6(vp0 vp0Var, int i7, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f4044a = 6;
        this.f4046c = vp0Var;
        this.f4045b = i7;
        this.f4048f = f2Var;
        this.d = context;
        this.f4047e = g6Var;
    }

    public i6(nd0 nd0Var, String str, String str2, String str3, int i7) {
        this.f4044a = 3;
        this.f4046c = nd0Var;
        this.d = str;
        this.f4047e = str2;
        this.f4048f = str3;
        this.f4045b = i7;
    }
}
