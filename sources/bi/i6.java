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
import org.telegram.ui.ck0;
import org.telegram.ui.ek0;
import org.telegram.ui.h10;
import org.telegram.ui.mn0;
import org.telegram.ui.od0;
public final class i6 implements org.telegram.ui.ActionBar.r1, fb0, ri, org.telegram.messenger.q1, OnFailureListener, w10 {
    public final int f4041a;
    public final int f4042b;
    public final Object f4043c;
    public final Object d;
    public final Object f4044e;
    public final Object f4045f;

    public i6(int i7, hb0 hb0Var, org.telegram.ui.Components.y3 y3Var, org.telegram.ui.Components.z3 z3Var, TextView textView) {
        this.f4041a = 1;
        this.f4042b = i7;
        this.f4043c = hb0Var;
        this.d = y3Var;
        this.f4044e = z3Var;
        this.f4045f = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new jg.c1((od0) this.f4043c, (String) this.d, fVar, list, (String) this.f4044e, (String) this.f4045f, this.f4042b));
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        up0 up0Var = (up0) this.f4043c;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f4045f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f4044e;
        Integer num = (Integer) number;
        View view = (View) obj;
        t9 t9Var = up0Var.f60297e;
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
            int i11 = this.f4042b;
            String r10 = org.telegram.messenger.m5.r(qp.s1(i11).e2(up0Var.f60296c));
            boolean h = t9Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            k60 H = k60.H(f2Var, view);
            H.W(new wp0(up0Var));
            H.l(2131231828, org.telegram.messenger.id.M0(2131750238, null), new zh.h1(up0Var, 2), h);
            H.l(2131232363, org.telegram.messenger.id.M0(2131750234, null), new jg.c1(up0Var, i11, r10, tL_starGiftCollection, context, h6Var, f2Var, 18), !TextUtils.isEmpty(r10));
            H.l(2131232116, org.telegram.messenger.id.M0(2131750236, null), new yf.b(9, up0Var, tL_starGiftCollection), h);
            H.l(2131232773, org.telegram.messenger.id.M0(2131750235, null), new zh.h1(up0Var, 1), h);
            H.m(2131232108, new h10(up0Var, i7, tL_starGiftCollection, 25), org.telegram.messenger.id.M0(2131750237, null), h, true);
            up0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ow0 ow0Var = (ow0) this.f4043c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f4044e;
        ArrayList arrayList2 = (ArrayList) this.f4045f;
        if (this.f4042b == ow0Var.K) {
            ow0Var.I = 1;
            ow0Var.J = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    qi qiVar = (qi) obj;
                    if (!hashSet.contains(qiVar.f24705a)) {
                        hashSet.add(qiVar.f24705a);
                        arrayList2.add(qiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ow0Var.f36717y = false;
                ow0Var.f36715w = false;
                ow0Var.c();
                e5 e5Var = ow0Var.d;
                if (e5Var != null) {
                    e5Var.setVisibility(0);
                }
                ow0Var.W = org.telegram.messenger.g0.L(10.0f);
                ow0Var.f36716x = arrayList;
                ow0Var.f36702a0 = 0;
                ow0Var.f36704b0 = Integer.valueOf(str2.length());
                e5 e5Var2 = ow0Var.d;
                if (e5Var2 != null) {
                    e5Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = ow0Var.f36710f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            ow0Var.f36716x = null;
            ow0Var.f36717y = true;
            ow0Var.f();
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cg.a aVar;
        switch (this.f4041a) {
            case 0:
                k6 k6Var = (k6) this.f4043c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f4044e;
                v10 v10Var = (v10) this.f4045f;
                h6 h6Var2 = (h6) k6Var.f4156o.get(k6Var.f4158q);
                if (h6Var2 != null) {
                    cg.a aVar2 = h6Var2.f3996c;
                    ea x10 = ea.x(this.f4042b, k6Var.f4158q);
                    if (x10.f3807e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f6164b > aVar.f6164b) {
                        cg.b bVar = k6Var.f4158q;
                        if (bVar == cg.b.f6165a) {
                            new tc(context, h6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f6166b) {
                            new gi.e(context, h6Var, h6Var2.f3996c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = k6Var.f4155n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        k6Var.f4155n = null;
                    }
                    v10Var.a(h6Var2, u1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                ew ewVar = (ew) this.d;
                ck0 ck0Var = (ck0) this.f4044e;
                ek0.e0(this.f4042b, (String) this.f4045f, ewVar, ck0Var, (ek0) this.f4043c);
                return;
        }
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        hb0 hb0Var2 = (hb0) this.f4043c;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.d;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.f4044e;
        org.telegram.ui.Components.u4.g(null, null, 0L, this.f4042b, 3, hb0Var2, y3Var, z3Var);
        org.telegram.ui.Components.u4.e((TextView) this.f4045f, hb0Var2, y3Var, z3Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.c2 c2Var = (tg.c2) this.f4043c;
        Bitmap bitmap = (Bitmap) this.d;
        int i7 = this.f4042b;
        mn0 mn0Var = (mn0) this.f4044e;
        hi.d4 d4Var = (hi.d4) this.f4045f;
        c2Var.f55626y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new pp0(c2Var, bitmap, i7, mn0Var, 23), 2000L);
        } else {
            d4Var.a(new ArrayList());
        }
    }

    public i6(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4041a = i10;
        this.f4043c = obj;
        this.f4042b = i7;
        this.d = obj2;
        this.f4044e = obj3;
        this.f4045f = obj4;
    }

    public i6(ls lsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f4041a = i10;
        this.f4043c = lsVar;
        this.d = obj;
        this.f4042b = i7;
        this.f4044e = obj2;
        this.f4045f = obj3;
    }

    public i6(up0 up0Var, int i7, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f4041a = 6;
        this.f4043c = up0Var;
        this.f4042b = i7;
        this.f4045f = f2Var;
        this.d = context;
        this.f4044e = h6Var;
    }

    public i6(od0 od0Var, String str, String str2, String str3, int i7) {
        this.f4041a = 3;
        this.f4043c = od0Var;
        this.d = str;
        this.f4044e = str2;
        this.f4045f = str3;
        this.f4042b = i7;
    }
}
