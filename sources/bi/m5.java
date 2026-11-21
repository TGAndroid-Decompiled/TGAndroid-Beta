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
import org.telegram.messenger.q10;
import org.telegram.messenger.r10;
import org.telegram.messenger.yv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.fk0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.on0;
public final class m5 implements r10, org.telegram.ui.ActionBar.q1, rb0, oi, org.telegram.messenger.q1, OnFailureListener {
    public final int f3880a;
    public final int f3881b;
    public final Object f3882c;
    public final Object d;
    public final Object f3883e;
    public final Object f3884f;

    public m5(int i7, tb0 tb0Var, org.telegram.ui.Components.g4 g4Var, org.telegram.ui.Components.h4 h4Var, TextView textView) {
        this.f3880a = 2;
        this.f3881b = i7;
        this.f3883e = tb0Var;
        this.f3884f = g4Var;
        this.f3882c = h4Var;
        this.d = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new g5((ld0) this.f3883e, (String) this.f3884f, fVar, list, (String) this.f3882c, (String) this.d, this.f3881b));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ax0 ax0Var = (ax0) this.f3883e;
        String str2 = (String) this.f3884f;
        HashSet hashSet = (HashSet) this.f3882c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f3881b == ax0Var.L) {
            ax0Var.J = 1;
            ax0Var.K = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ni niVar = (ni) obj;
                    if (!hashSet.contains(niVar.f25955a)) {
                        hashSet.add(niVar.f25955a);
                        arrayList2.add(niVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ax0Var.f33656y = false;
                ax0Var.f33654w = false;
                ax0Var.c();
                e3 e3Var = ax0Var.d;
                if (e3Var != null) {
                    e3Var.setVisibility(0);
                }
                ax0Var.f33640a0 = org.telegram.messenger.g0.L(10.0f);
                ax0Var.f33655x = arrayList;
                ax0Var.f33642b0 = 0;
                ax0Var.f33644c0 = Integer.valueOf(str2.length());
                e3 e3Var2 = ax0Var.d;
                if (e3Var2 != null) {
                    e3Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = ax0Var.f33648f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            ax0Var.f33655x = null;
            ax0Var.f33656y = true;
            ax0Var.f();
        }
    }

    @Override
    public Object g(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        gq0 gq0Var = (gq0) this.f3883e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f3884f;
        Context context = (Context) this.f3882c;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.n8 n8Var = gq0Var.f4117e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !gq0Var.P) {
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
            int i11 = this.f3881b;
            String r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(gq0Var.f4116c));
            boolean h = n8Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            a70 I = a70.I(g2Var, view);
            I.X(new s5(gq0Var));
            I.l(2131231829, gd.N0(2131750221, null), new f5(gq0Var, 2), h);
            I.l(2131232365, gd.N0(2131750217, null), new g5(gq0Var, i11, r10, tL_starGiftCollection, context, h6Var, g2Var, 0), !TextUtils.isEmpty(r10));
            I.l(2131232118, gd.N0(2131750219, null), new a1.e(28, gq0Var, tL_starGiftCollection), h);
            I.l(2131232775, gd.N0(2131750218, null), new f5(gq0Var, 1), h);
            I.m(2131232110, new ai.c1(gq0Var, i7, tL_starGiftCollection, 3), gd.N0(2131750220, null), h, true);
            gq0Var.J = I;
            I.a0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        cg.a aVar;
        switch (this.f3880a) {
            case 1:
                di.h5 h5Var = (di.h5) this.f3883e;
                Context context = (Context) this.f3882c;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
                q10 q10Var = (q10) this.f3884f;
                di.f5 f5Var = (di.f5) h5Var.f8966q.get(h5Var.f8968s);
                if (f5Var != null) {
                    cg.a aVar2 = f5Var.f8790c;
                    di.y8 x10 = di.y8.x(this.f3881b, h5Var.f8968s);
                    if (x10.f10085e) {
                        aVar = cg.a.m(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f5301b > aVar.f5301b) {
                        cg.b bVar = h5Var.f8968s;
                        if (bVar == cg.b.f5302a) {
                            new fb(context, h6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f5303b) {
                            new ii.s(context, h6Var, f5Var.f8790c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = h5Var.f8963n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        h5Var.f8963n = null;
                    }
                    q10Var.a(f5Var, t1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                yv yvVar = (yv) this.f3884f;
                fk0 fk0Var = (fk0) this.f3882c;
                hk0.e0(this.f3881b, (String) this.d, yvVar, fk0Var, (hk0) this.f3883e);
                return;
        }
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        tb0 tb0Var2 = (tb0) this.f3883e;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.f3884f;
        org.telegram.ui.Components.h4 h4Var = (org.telegram.ui.Components.h4) this.f3882c;
        org.telegram.ui.Components.c5.g(null, null, 0L, this.f3881b, 3, tb0Var2, g4Var, h4Var);
        org.telegram.ui.Components.c5.e((TextView) this.d, tb0Var2, g4Var, h4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.f2 f2Var = (tg.f2) this.f3883e;
        Bitmap bitmap = (Bitmap) this.f3884f;
        int i7 = this.f3881b;
        on0 on0Var = (on0) this.f3882c;
        h5 h5Var = (h5) this.d;
        f2Var.f57884y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && f2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new mp0(f2Var, bitmap, i7, on0Var, 24), 2000L);
        } else {
            h5Var.a(new ArrayList());
        }
    }

    public m5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f3880a = i10;
        this.f3883e = frameLayout;
        this.f3881b = i7;
        this.f3884f = obj;
        this.f3882c = obj2;
        this.d = obj3;
    }

    public m5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, q10 q10Var) {
        this.f3880a = 1;
        this.f3883e = h5Var;
        this.f3881b = i7;
        this.f3882c = context;
        this.d = h6Var;
        this.f3884f = q10Var;
    }

    public m5(fs fsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3880a = i10;
        this.f3883e = fsVar;
        this.f3884f = obj;
        this.f3881b = i7;
        this.f3882c = obj2;
        this.d = obj3;
    }

    public m5(ld0 ld0Var, String str, String str2, String str3, int i7) {
        this.f3880a = 4;
        this.f3883e = ld0Var;
        this.f3884f = str;
        this.f3882c = str2;
        this.d = str3;
        this.f3881b = i7;
    }
}
