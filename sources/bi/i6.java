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
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.bk0;
import org.telegram.ui.d10;
import org.telegram.ui.jn0;
import org.telegram.ui.ld0;
import org.telegram.ui.zj0;
public final class i6 implements org.telegram.ui.ActionBar.r1, fb0, ri, org.telegram.messenger.q1, OnFailureListener, w10 {
    public final int f4044a;
    public final int f4045b;
    public final Object f4046c;
    public final Object d;
    public final Object f4047e;
    public final Object f4048f;

    public i6(int i7, hb0 hb0Var, org.telegram.ui.Components.z3 z3Var, org.telegram.ui.Components.a4 a4Var, TextView textView) {
        this.f4044a = 1;
        this.f4045b = i7;
        this.f4046c = hb0Var;
        this.d = z3Var;
        this.f4047e = a4Var;
        this.f4048f = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new jg.c1((ld0) this.f4046c, (String) this.d, fVar, list, (String) this.f4047e, (String) this.f4048f, this.f4045b));
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        up0 up0Var = (up0) this.f4046c;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f4048f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f4047e;
        Integer num = (Integer) number;
        View view = (View) obj;
        t9 t9Var = up0Var.f60190e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !up0Var.O) {
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
            String r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(up0Var.f60189c));
            boolean h = t9Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            k60 H = k60.H(f2Var, view);
            H.W(new wp0(up0Var));
            H.l(2131231828, org.telegram.messenger.hd.M0(2131750237, null), new zh.i1(up0Var, 2), h);
            H.l(2131232363, org.telegram.messenger.hd.M0(2131750233, null), new jg.c1(up0Var, i11, r10, tL_starGiftCollection, context, f6Var, f2Var, 18), !TextUtils.isEmpty(r10));
            H.l(2131232116, org.telegram.messenger.hd.M0(2131750235, null), new wi.q(13, up0Var, tL_starGiftCollection), h);
            H.l(2131232773, org.telegram.messenger.hd.M0(2131750234, null), new zh.i1(up0Var, 1), h);
            H.m(2131232108, new d10(up0Var, i7, tL_starGiftCollection, 26), org.telegram.messenger.hd.M0(2131750236, null), h, true);
            up0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ow0 ow0Var = (ow0) this.f4046c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f4047e;
        ArrayList arrayList2 = (ArrayList) this.f4048f;
        if (this.f4045b == ow0Var.K) {
            ow0Var.I = 1;
            ow0Var.J = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    qi qiVar = (qi) obj;
                    if (!hashSet.contains(qiVar.f24690a)) {
                        hashSet.add(qiVar.f24690a);
                        arrayList2.add(qiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ow0Var.f36805y = false;
                ow0Var.f36803w = false;
                ow0Var.c();
                e5 e5Var = ow0Var.d;
                if (e5Var != null) {
                    e5Var.setVisibility(0);
                }
                ow0Var.W = org.telegram.messenger.g0.L(10.0f);
                ow0Var.f36804x = arrayList;
                ow0Var.f36790a0 = 0;
                ow0Var.f36792b0 = Integer.valueOf(str2.length());
                e5 e5Var2 = ow0Var.d;
                if (e5Var2 != null) {
                    e5Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = ow0Var.f36798f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            ow0Var.f36804x = null;
            ow0Var.f36805y = true;
            ow0Var.f();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cg.a aVar;
        switch (this.f4044a) {
            case 0:
                k6 k6Var = (k6) this.f4046c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f4047e;
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
                    if (aVar != null && aVar2.f6161b > aVar.f6161b) {
                        cg.b bVar = k6Var.f4161q;
                        if (bVar == cg.b.f6162a) {
                            new tc(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f6163b) {
                            new gi.e(context, f6Var, h6Var.f3999c, true, null).show();
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
                zj0 zj0Var = (zj0) this.f4047e;
                bk0.e0(this.f4045b, (String) this.f4048f, ewVar, zj0Var, (bk0) this.f4046c);
                return;
        }
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        hb0 hb0Var2 = (hb0) this.f4046c;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.d;
        org.telegram.ui.Components.a4 a4Var = (org.telegram.ui.Components.a4) this.f4047e;
        org.telegram.ui.Components.v4.g(null, null, 0L, this.f4045b, 3, hb0Var2, z3Var, a4Var);
        org.telegram.ui.Components.v4.e((TextView) this.f4048f, hb0Var2, z3Var, a4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.c2 c2Var = (tg.c2) this.f4046c;
        Bitmap bitmap = (Bitmap) this.d;
        int i7 = this.f4045b;
        jn0 jn0Var = (jn0) this.f4047e;
        hi.d4 d4Var = (hi.d4) this.f4048f;
        c2Var.f55498y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new pp0(c2Var, bitmap, i7, jn0Var, 23), 2000L);
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

    public i6(up0 up0Var, int i7, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f4044a = 6;
        this.f4046c = up0Var;
        this.f4045b = i7;
        this.f4048f = f2Var;
        this.d = context;
        this.f4047e = f6Var;
    }

    public i6(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.f4044a = 3;
        this.f4046c = ld0Var;
        this.d = str;
        this.f4047e = str2;
        this.f4048f = str3;
        this.f4045b = i7;
    }
}
