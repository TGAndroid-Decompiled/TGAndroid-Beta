package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.e9;
import ci.mb;
import ci.s8;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hi;
import org.telegram.messenger.hp;
import org.telegram.messenger.ii;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.wv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.en0;
import org.telegram.ui.id0;
import org.telegram.ui.wj0;
import org.telegram.ui.yj0;
public final class m3 implements o10, org.telegram.ui.ActionBar.p1, ab0, ii, org.telegram.messenger.q1, OnFailureListener {
    public final int f821a;
    public final int f822b;
    public final Object f823c;
    public final Object d;
    public final Object f824e;
    public final Object f825f;

    public m3(int i3, cb0 cb0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.f821a = 2;
        this.f822b = i3;
        this.f824e = cb0Var;
        this.f825f = x3Var;
        this.f823c = y3Var;
        this.d = textView;
    }

    @Override
    public Object d(Number number, Object obj) {
        int i3;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vp0 vp0Var = (vp0) this.f824e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f825f;
        Context context = (Context) this.f823c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        Integer num = (Integer) number;
        View view = (View) obj;
        s8 s8Var = vp0Var.f1013e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vp0Var.P) {
            int i10 = 0;
            while (true) {
                if (i10 < s8Var.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) s8Var.d().get(i10)).collection_id == num.intValue()) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) s8Var.d().get(i10);
                        i3 = i10;
                        break;
                    }
                    i10++;
                } else {
                    i3 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            int i11 = this.f822b;
            String r5 = org.telegram.messenger.m5.r(hp.s1(i11).e2(vp0Var.f1012c));
            boolean h = s8Var.h();
            if (TextUtils.isEmpty(r5) && !h) {
                return Boolean.FALSE;
            }
            f60 H = f60.H(d2Var, view);
            H.W(new s3(vp0Var));
            H.l(2131231828, bd.M0(2131750246, null), new c3(vp0Var, 2), h);
            H.l(2131232363, bd.M0(2131750242, null), new d3(vp0Var, i11, r5, tL_starGiftCollection, context, e6Var, d2Var, 0), !TextUtils.isEmpty(r5));
            H.l(2131232116, bd.M0(2131750244, null), new a1.f(5, vp0Var, tL_starGiftCollection), h);
            H.l(2131232771, bd.M0(2131750243, null), new c3(vp0Var, 1), h);
            H.m(2131232108, new e3(vp0Var, i3, tL_starGiftCollection, 0), bd.M0(2131750245, null), h, true);
            vp0Var.J = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        dg.a aVar;
        switch (this.f821a) {
            case 1:
                ci.n5 n5Var = (ci.n5) this.f824e;
                Context context = (Context) this.f823c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                n10 n10Var = (n10) this.f825f;
                ci.l5 l5Var = (ci.l5) n5Var.f5605o.get(n5Var.f5607q);
                if (l5Var != null) {
                    dg.a aVar2 = l5Var.f5444c;
                    e9 x10 = e9.x(this.f822b, n5Var.f5607q);
                    if (x10.f5032e) {
                        aVar = dg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f8924b > aVar.f8924b) {
                        dg.b bVar = n5Var.f5607q;
                        if (bVar == dg.b.f8925a) {
                            new mb(context, e6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == dg.b.f8926b) {
                            new hi.f(context, e6Var, l5Var.f5444c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    sf.b bVar2 = n5Var.f5604n;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        n5Var.f5604n = null;
                    }
                    n10Var.a(l5Var, s1Var.h(i3, true, true));
                    return;
                }
                return;
            default:
                wv wvVar = (wv) this.f825f;
                wj0 wj0Var = (wj0) this.f823c;
                yj0.e0(this.f822b, (String) this.d, wvVar, wj0Var, (yj0) this.f824e);
                return;
        }
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        ow0 ow0Var = (ow0) this.f824e;
        String str2 = (String) this.f825f;
        HashSet hashSet = (HashSet) this.f823c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f822b == ow0Var.L) {
            ow0Var.J = 1;
            ow0Var.K = str2;
            if (arrayList != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    hi hiVar = (hi) obj;
                    if (!hashSet.contains(hiVar.f22931a)) {
                        hashSet.add(hiVar.f22931a);
                        arrayList2.add(hiVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ow0Var.f36975y = false;
                ow0Var.f36973w = false;
                ow0Var.c();
                kw0 kw0Var = ow0Var.d;
                if (kw0Var != null) {
                    kw0Var.setVisibility(0);
                }
                ow0Var.f36959a0 = org.telegram.messenger.g0.L(10.0f);
                ow0Var.f36974x = arrayList;
                ow0Var.f36961b0 = 0;
                ow0Var.f36963c0 = Integer.valueOf(str2.length());
                kw0 kw0Var2 = ow0Var.d;
                if (kw0Var2 != null) {
                    kw0Var2.invalidate();
                }
                org.telegram.ui.n4 n4Var = ow0Var.f36967f;
                if (n4Var != null) {
                    n4Var.f();
                    return;
                }
                return;
            }
            ow0Var.f36974x = null;
            ow0Var.f36975y = true;
            ow0Var.f();
        }
    }

    @Override
    public void k(e5.f fVar, List list) {
        org.telegram.messenger.g0.h3(new d3((id0) this.f824e, (String) this.f825f, fVar, list, (String) this.f823c, (String) this.d, this.f822b));
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        cb0 cb0Var2 = (cb0) this.f824e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f825f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.f823c;
        org.telegram.ui.Components.t4.g(null, null, 0L, this.f822b, 3, cb0Var2, x3Var, y3Var);
        org.telegram.ui.Components.t4.e((TextView) this.d, cb0Var2, x3Var, y3Var);
    }

    @Override
    public void onFailure(Exception exc) {
        ug.c2 c2Var = (ug.c2) this.f824e;
        Bitmap bitmap = (Bitmap) this.f825f;
        int i3 = this.f822b;
        en0 en0Var = (en0) this.f823c;
        g3 g3Var = (g3) this.d;
        c2Var.f55922y = false;
        a8.g(exc, true);
        if ((exc instanceof ib.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && c2Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new zo0(c2Var, bitmap, i3, en0Var, 24), 2000L);
        } else {
            g3Var.a(new ArrayList());
        }
    }

    public m3(FrameLayout frameLayout, int i3, Object obj, Object obj2, Object obj3, int i10) {
        this.f821a = i10;
        this.f824e = frameLayout;
        this.f822b = i3;
        this.f825f = obj;
        this.f823c = obj2;
        this.d = obj3;
    }

    public m3(ci.n5 n5Var, int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, n10 n10Var) {
        this.f821a = 1;
        this.f824e = n5Var;
        this.f822b = i3;
        this.f823c = context;
        this.d = e6Var;
        this.f825f = n10Var;
    }

    public m3(cs csVar, Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f821a = i10;
        this.f824e = csVar;
        this.f825f = obj;
        this.f822b = i3;
        this.f823c = obj2;
        this.d = obj3;
    }

    public m3(id0 id0Var, String str, String str2, String str3, int i3) {
        this.f821a = 4;
        this.f824e = id0Var;
        this.f825f = str;
        this.f823c = str2;
        this.d = str3;
        this.f822b = i3;
    }
}
