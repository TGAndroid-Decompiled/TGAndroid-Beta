package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import di.fb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.ni;
import org.telegram.messenger.oi;
import org.telegram.messenger.p10;
import org.telegram.messenger.q10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.dk0;
import org.telegram.ui.fk0;
import org.telegram.ui.ld0;
import org.telegram.ui.pn0;
public final class o5 implements q10, org.telegram.ui.ActionBar.q1, ob0, oi, org.telegram.messenger.q1, OnFailureListener {
    public final int f3905a;
    public final int f3906b;
    public final Object f3907c;
    public final Object d;
    public final Object f3908e;
    public final Object f3909f;

    public o5(int i7, qb0 qb0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.f3905a = 2;
        this.f3906b = i7;
        this.f3908e = qb0Var;
        this.f3909f = f4Var;
        this.f3907c = g4Var;
        this.d = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new i5((ld0) this.f3908e, (String) this.f3909f, fVar, list, (String) this.f3907c, (String) this.d, this.f3906b));
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        zw0 zw0Var = (zw0) this.f3908e;
        String str2 = (String) this.f3909f;
        HashSet hashSet = (HashSet) this.f3907c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f3906b == zw0Var.L) {
            zw0Var.J = 1;
            zw0Var.K = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ni niVar = (ni) obj;
                    if (!hashSet.contains(niVar.f26023a)) {
                        hashSet.add(niVar.f26023a);
                        arrayList2.add(niVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                zw0Var.f43071y = false;
                zw0Var.f43069w = false;
                zw0Var.c();
                g3 g3Var = zw0Var.d;
                if (g3Var != null) {
                    g3Var.setVisibility(0);
                }
                zw0Var.f43055a0 = org.telegram.messenger.g0.L(10.0f);
                zw0Var.f43070x = arrayList;
                zw0Var.f43057b0 = 0;
                zw0Var.f43059c0 = Integer.valueOf(str2.length());
                g3 g3Var2 = zw0Var.d;
                if (g3Var2 != null) {
                    g3Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = zw0Var.f43063f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            zw0Var.f43070x = null;
            zw0Var.f43071y = true;
            zw0Var.f();
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        fq0 fq0Var = (fq0) this.f3908e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f3909f;
        Context context = (Context) this.f3907c;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.n8 n8Var = fq0Var.f4151e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !fq0Var.P) {
            int i10 = 0;
            while (true) {
                if (i10 < n8Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) n8Var.d().get(i10)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) n8Var.d().get(i10);
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
            int i11 = this.f3906b;
            String r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(fq0Var.f4150c));
            boolean h = n8Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            x60 I = x60.I(g2Var, view);
            I.X(new u5(fq0Var));
            I.l(2131231832, gd.N0(2131750221, null), new h5(fq0Var, 2), h);
            I.l(2131232368, gd.N0(2131750217, null), new i5(fq0Var, i11, r10, tL_starGiftCollection, context, i6Var, g2Var, 0), !TextUtils.isEmpty(r10));
            I.l(2131232121, gd.N0(2131750219, null), new a1.e(28, fq0Var, tL_starGiftCollection), h);
            I.l(2131232778, gd.N0(2131750218, null), new h5(fq0Var, 1), h);
            I.m(2131232113, new ai.e1(fq0Var, i7, tL_starGiftCollection, 2), gd.N0(2131750220, null), h, true);
            fq0Var.J = I;
            I.a0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        cg.a aVar;
        switch (this.f3905a) {
            case 1:
                di.h5 h5Var = (di.h5) this.f3908e;
                Context context = (Context) this.f3907c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                p10 p10Var = (p10) this.f3909f;
                di.f5 f5Var = (di.f5) h5Var.f8930q.get(h5Var.f8932s);
                if (f5Var != null) {
                    cg.a aVar2 = f5Var.f8754c;
                    di.y8 x10 = di.y8.x(this.f3906b, h5Var.f8932s);
                    if (x10.f10049e) {
                        aVar = cg.a.m(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f5267b > aVar.f5267b) {
                        cg.b bVar = h5Var.f8932s;
                        if (bVar == cg.b.f5268a) {
                            new fb(context, i6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f5269b) {
                            new ii.s(context, i6Var, f5Var.f8754c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = h5Var.f8927n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        h5Var.f8927n = null;
                    }
                    p10Var.a(f5Var, t1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                yv yvVar = (yv) this.f3909f;
                dk0 dk0Var = (dk0) this.f3907c;
                fk0.e0(this.f3906b, (String) this.d, yvVar, dk0Var, (fk0) this.f3908e);
                return;
        }
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        qb0 qb0Var2 = (qb0) this.f3908e;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f3909f;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.f3907c;
        org.telegram.ui.Components.b5.g(null, null, 0L, this.f3906b, 3, qb0Var2, f4Var, g4Var);
        org.telegram.ui.Components.b5.e((TextView) this.d, qb0Var2, f4Var, g4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.i2 i2Var = (tg.i2) this.f3908e;
        Bitmap bitmap = (Bitmap) this.f3909f;
        int i7 = this.f3906b;
        pn0 pn0Var = (pn0) this.f3907c;
        j5 j5Var = (j5) this.d;
        i2Var.f57985y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && i2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new kp0(i2Var, bitmap, i7, pn0Var, 25), 2000L);
        } else {
            j5Var.a(new ArrayList());
        }
    }

    public o5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f3905a = i10;
        this.f3908e = frameLayout;
        this.f3906b = i7;
        this.f3909f = obj;
        this.f3907c = obj2;
        this.d = obj3;
    }

    public o5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, p10 p10Var) {
        this.f3905a = 1;
        this.f3908e = h5Var;
        this.f3906b = i7;
        this.f3907c = context;
        this.d = i6Var;
        this.f3909f = p10Var;
    }

    public o5(fs fsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3905a = i10;
        this.f3908e = fsVar;
        this.f3909f = obj;
        this.f3906b = i7;
        this.f3907c = obj2;
        this.d = obj3;
    }

    public o5(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.f3905a = 4;
        this.f3908e = ld0Var;
        this.f3909f = str;
        this.f3907c = str2;
        this.d = str3;
        this.f3906b = i7;
    }
}
