package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import di.bb;
import di.j8;
import di.u8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.cw;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.oi;
import org.telegram.messenger.pi;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ck0;
import org.telegram.ui.ek0;
import org.telegram.ui.kd0;
import org.telegram.ui.ln0;
public final class b3 implements t10, org.telegram.ui.ActionBar.q1, gb0, pi, org.telegram.messenger.q1, OnFailureListener {
    public final int f3395a;
    public final int f3396b;
    public final Object f3397c;
    public final Object d;
    public final Object f3398e;
    public final Object f3399f;

    public b3(int i7, ib0 ib0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.f3395a = 2;
        this.f3396b = i7;
        this.f3398e = ib0Var;
        this.f3399f = x3Var;
        this.f3397c = y3Var;
        this.d = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new u2((kd0) this.f3398e, (String) this.f3399f, fVar, list, (String) this.f3397c, (String) this.d, this.f3396b));
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        rw0 rw0Var = (rw0) this.f3398e;
        String str2 = (String) this.f3399f;
        HashSet hashSet = (HashSet) this.f3397c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f3396b == rw0Var.L) {
            rw0Var.J = 1;
            rw0Var.K = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    oi oiVar = (oi) obj;
                    if (!hashSet.contains(oiVar.f25765a)) {
                        hashSet.add(oiVar.f25765a);
                        arrayList2.add(oiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                rw0Var.f39086y = false;
                rw0Var.f39084w = false;
                rw0Var.c();
                g2 g2Var = rw0Var.d;
                if (g2Var != null) {
                    g2Var.setVisibility(0);
                }
                rw0Var.f39070a0 = org.telegram.messenger.g0.L(10.0f);
                rw0Var.f39085x = arrayList;
                rw0Var.f39072b0 = 0;
                rw0Var.f39074c0 = Integer.valueOf(str2.length());
                g2 g2Var2 = rw0Var.d;
                if (g2Var2 != null) {
                    g2Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = rw0Var.f39078f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            rw0Var.f39085x = null;
            rw0Var.f39086y = true;
            rw0Var.f();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        wp0 wp0Var = (wp0) this.f3398e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f3399f;
        Context context = (Context) this.f3397c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        j8 j8Var = wp0Var.f3613e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !wp0Var.P) {
            int i10 = 0;
            while (true) {
                if (i10 < j8Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) j8Var.d().get(i10)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) j8Var.d().get(i10);
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
            int i11 = this.f3396b;
            String r10 = org.telegram.messenger.m5.r(np.s1(i11).e2(wp0Var.f3612c));
            boolean h = j8Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            m60 H = m60.H(e2Var, view);
            H.W(new h3(wp0Var));
            H.l(2131231828, hd.M0(2131750238, null), new t2(wp0Var, 2), h);
            H.l(2131232364, hd.M0(2131750234, null), new u2(wp0Var, i11, r10, tL_starGiftCollection, context, e6Var, e2Var, 0), !TextUtils.isEmpty(r10));
            H.l(2131232117, hd.M0(2131750236, null), new a1.e(27, wp0Var, tL_starGiftCollection), h);
            H.l(2131232774, hd.M0(2131750235, null), new t2(wp0Var, 1), h);
            H.m(2131232109, new ai.a1(wp0Var, i7, tL_starGiftCollection, 2), hd.M0(2131750237, null), h, true);
            wp0Var.J = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        cg.a aVar;
        switch (this.f3395a) {
            case 1:
                di.e5 e5Var = (di.e5) this.f3398e;
                Context context = (Context) this.f3397c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                s10 s10Var = (s10) this.f3399f;
                di.c5 c5Var = (di.c5) e5Var.f8461o.get(e5Var.f8463q);
                if (c5Var != null) {
                    cg.a aVar2 = c5Var.f8306c;
                    u8 x10 = u8.x(this.f3396b, e5Var.f8463q);
                    if (x10.f9532e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f4989b > aVar.f4989b) {
                        cg.b bVar = e5Var.f8463q;
                        if (bVar == cg.b.f4990a) {
                            new bb(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f4991b) {
                            new ii.e(context, e6Var, c5Var.f8306c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = e5Var.f8460n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        e5Var.f8460n = null;
                    }
                    s10Var.a(c5Var, t1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                cw cwVar = (cw) this.f3399f;
                ck0 ck0Var = (ck0) this.f3397c;
                ek0.e0(this.f3396b, (String) this.d, cwVar, ck0Var, (ek0) this.f3398e);
                return;
        }
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        ib0 ib0Var2 = (ib0) this.f3398e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f3399f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.f3397c;
        org.telegram.ui.Components.t4.g(null, null, 0L, this.f3396b, 3, ib0Var2, x3Var, y3Var);
        org.telegram.ui.Components.t4.e((TextView) this.d, ib0Var2, x3Var, y3Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.e2 e2Var = (tg.e2) this.f3398e;
        Bitmap bitmap = (Bitmap) this.f3399f;
        int i7 = this.f3396b;
        ln0 ln0Var = (ln0) this.f3397c;
        w2 w2Var = (w2) this.d;
        e2Var.f57256y = false;
        a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new sp0(e2Var, bitmap, i7, ln0Var, 23), 2000L);
        } else {
            w2Var.a(new ArrayList());
        }
    }

    public b3(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f3395a = i10;
        this.f3398e = frameLayout;
        this.f3396b = i7;
        this.f3399f = obj;
        this.f3397c = obj2;
        this.d = obj3;
    }

    public b3(di.e5 e5Var, int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, s10 s10Var) {
        this.f3395a = 1;
        this.f3398e = e5Var;
        this.f3396b = i7;
        this.f3397c = context;
        this.d = e6Var;
        this.f3399f = s10Var;
    }

    public b3(is isVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3395a = i10;
        this.f3398e = isVar;
        this.f3399f = obj;
        this.f3396b = i7;
        this.f3397c = obj2;
        this.d = obj3;
    }

    public b3(kd0 kd0Var, String str, String str2, String str3, int i7) {
        this.f3395a = 4;
        this.f3398e = kd0Var;
        this.f3399f = str;
        this.f3397c = str2;
        this.d = str3;
        this.f3396b = i7;
    }
}
