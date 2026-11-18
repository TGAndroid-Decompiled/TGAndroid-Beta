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
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.fk0;
import org.telegram.ui.hk0;
import org.telegram.ui.md0;
import org.telegram.ui.on0;
public final class i5 implements r10, org.telegram.ui.ActionBar.r1, qb0, oi, org.telegram.messenger.q1, OnFailureListener {
    public final int f3695a;
    public final int f3696b;
    public final Object f3697c;
    public final Object d;
    public final Object f3698e;
    public final Object f3699f;

    public i5(int i7, sb0 sb0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.f3695a = 2;
        this.f3696b = i7;
        this.f3698e = sb0Var;
        this.f3699f = f4Var;
        this.f3697c = g4Var;
        this.d = textView;
    }

    @Override
    public void a(f5.f fVar, List list) {
        org.telegram.messenger.g0.g3(new c5((md0) this.f3698e, (String) this.f3699f, fVar, list, (String) this.f3697c, (String) this.d, this.f3696b));
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        yw0 yw0Var = (yw0) this.f3698e;
        String str2 = (String) this.f3699f;
        HashSet hashSet = (HashSet) this.f3697c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f3696b == yw0Var.L) {
            yw0Var.J = 1;
            yw0Var.K = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ni niVar = (ni) obj;
                    if (!hashSet.contains(niVar.f25927a)) {
                        hashSet.add(niVar.f25927a);
                        arrayList2.add(niVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                yw0Var.f42660y = false;
                yw0Var.f42658w = false;
                yw0Var.c();
                a3 a3Var = yw0Var.d;
                if (a3Var != null) {
                    a3Var.setVisibility(0);
                }
                yw0Var.f42644a0 = org.telegram.messenger.g0.L(10.0f);
                yw0Var.f42659x = arrayList;
                yw0Var.f42646b0 = 0;
                yw0Var.f42648c0 = Integer.valueOf(str2.length());
                a3 a3Var2 = yw0Var.d;
                if (a3Var2 != null) {
                    a3Var2.invalidate();
                }
                org.telegram.ui.l4 l4Var = yw0Var.f42652f;
                if (l4Var != null) {
                    l4Var.f();
                    return;
                }
                return;
            }
            yw0Var.f42659x = null;
            yw0Var.f42660y = true;
            yw0Var.f();
        }
    }

    @Override
    public Object g(Number number, Object obj) {
        int i7;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        eq0 eq0Var = (eq0) this.f3698e;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f3699f;
        Context context = (Context) this.f3697c;
        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        di.m8 m8Var = eq0Var.f3944e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !eq0Var.P) {
            int i10 = 0;
            while (true) {
                if (i10 < m8Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) m8Var.d().get(i10)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) m8Var.d().get(i10);
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
            int i11 = this.f3696b;
            String r10 = org.telegram.messenger.n5.r(mp.u1(i11).g2(eq0Var.f3943c));
            boolean h = m8Var.h();
            if (TextUtils.isEmpty(r10) && !h) {
                return Boolean.FALSE;
            }
            y60 I = y60.I(h2Var, view);
            I.X(new o5(eq0Var));
            I.l(2131231829, gd.M0(2131750222, null), new b5(eq0Var, 2), h);
            I.l(2131232365, gd.M0(2131750218, null), new c5(eq0Var, i11, r10, tL_starGiftCollection, context, i6Var, h2Var, 0), !TextUtils.isEmpty(r10));
            I.l(2131232118, gd.M0(2131750220, null), new a1.e(26, eq0Var, tL_starGiftCollection), h);
            I.l(2131232775, gd.M0(2131750219, null), new b5(eq0Var, 1), h);
            I.m(2131232110, new ai.a1(eq0Var, i7, tL_starGiftCollection, 3), gd.M0(2131750221, null), h, true);
            eq0Var.J = I;
            I.a0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cg.a aVar;
        switch (this.f3695a) {
            case 1:
                di.h5 h5Var = (di.h5) this.f3698e;
                Context context = (Context) this.f3697c;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.d;
                q10 q10Var = (q10) this.f3699f;
                di.f5 f5Var = (di.f5) h5Var.f8935q.get(h5Var.f8937s);
                if (f5Var != null) {
                    cg.a aVar2 = f5Var.f8766c;
                    di.x8 x10 = di.x8.x(this.f3696b, h5Var.f8937s);
                    if (x10.f10018e) {
                        aVar = cg.a.m(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f5272b > aVar.f5272b) {
                        cg.b bVar = h5Var.f8937s;
                        if (bVar == cg.b.f5273a) {
                            new fb(context, i6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == cg.b.f5274b) {
                            new ii.s(context, i6Var, f5Var.f8766c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    vf.b bVar2 = h5Var.f8932n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        h5Var.f8932n = null;
                    }
                    q10Var.a(f5Var, u1Var.h(i7, true, true));
                    return;
                }
                return;
            default:
                yv yvVar = (yv) this.f3699f;
                fk0 fk0Var = (fk0) this.f3697c;
                hk0.e0(this.f3696b, (String) this.d, yvVar, fk0Var, (hk0) this.f3698e);
                return;
        }
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        sb0 sb0Var2 = (sb0) this.f3698e;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.f3699f;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.f3697c;
        org.telegram.ui.Components.b5.g(null, null, 0L, this.f3696b, 3, sb0Var2, f4Var, g4Var);
        org.telegram.ui.Components.b5.e((TextView) this.d, sb0Var2, f4Var, g4Var);
    }

    @Override
    public void onFailure(Exception exc) {
        tg.e2 e2Var = (tg.e2) this.f3698e;
        Bitmap bitmap = (Bitmap) this.f3699f;
        int i7 = this.f3696b;
        on0 on0Var = (on0) this.f3697c;
        d5 d5Var = (d5) this.d;
        e2Var.f57828y = false;
        org.telegram.messenger.a8.g(exc, true);
        if ((exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && e2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.h3(new kp0(e2Var, bitmap, i7, on0Var, 24), 2000L);
        } else {
            d5Var.a(new ArrayList());
        }
    }

    public i5(FrameLayout frameLayout, int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.f3695a = i10;
        this.f3698e = frameLayout;
        this.f3696b = i7;
        this.f3699f = obj;
        this.f3697c = obj2;
        this.d = obj3;
    }

    public i5(di.h5 h5Var, int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, q10 q10Var) {
        this.f3695a = 1;
        this.f3698e = h5Var;
        this.f3696b = i7;
        this.f3697c = context;
        this.d = i6Var;
        this.f3699f = q10Var;
    }

    public i5(fs fsVar, Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f3695a = i10;
        this.f3698e = fsVar;
        this.f3699f = obj;
        this.f3696b = i7;
        this.f3697c = obj2;
        this.d = obj3;
    }

    public i5(md0 md0Var, String str, String str2, String str3, int i7) {
        this.f3695a = 4;
        this.f3698e = md0Var;
        this.f3699f = str;
        this.f3697c = str2;
        this.d = str3;
        this.f3696b = i7;
    }
}
