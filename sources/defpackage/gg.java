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
public final class gg implements fn7, bi0, j8c, ed, OnFailureListener, eq6 {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gg(int i, hn7 hn7Var, ki kiVar, li liVar, TextView textView) {
        this.a = i;
        this.b = hn7Var;
        this.c = kiVar;
        this.d = liVar;
        this.e = textView;
    }

    @Override
    public final void b(fi0 fi0Var, List list) {
        gl.d3(new qt((ve6) this.b, (String) this.c, fi0Var, list, (String) this.d, (String) this.e, this.a));
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
        dbb dbbVar = (dbb) this.b;
        String str2 = (String) this.c;
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        if (this.a == dbbVar.L) {
            dbbVar.J = (byte) 1;
            dbbVar.K = str2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                dq6 dq6Var = (dq6) obj;
                if (!hashSet.contains(dq6Var.a)) {
                    hashSet.add(dq6Var.a);
                    arrayList2.add(dq6Var);
                }
            }
            if (!arrayList2.isEmpty()) {
                dbbVar.y = false;
                dbbVar.w = false;
                dbbVar.b();
                zab zabVar = dbbVar.d;
                if (zabVar != null) {
                    zabVar.setVisibility(0);
                }
                dbbVar.a0 = gl.L(10.0f);
                dbbVar.x = arrayList;
                dbbVar.b0 = 0;
                dbbVar.c0 = Integer.valueOf(str2.length());
                zab zabVar2 = dbbVar.d;
                if (zabVar2 != null) {
                    zabVar2.invalidate();
                }
                s20 s20Var = dbbVar.f;
                if (s20Var != null) {
                    s20Var.f();
                    return;
                }
                return;
            }
            dbbVar.x = null;
            dbbVar.y = true;
            dbbVar.e();
        }
    }

    @Override
    public final Object g(Integer num, Object obj) {
        int i;
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        lca lcaVar = (lca) this.b;
        d dVar = (d) this.c;
        Context context = (Context) this.d;
        wjb wjbVar = (wjb) this.e;
        View view = (View) obj;
        wsa wsaVar = lcaVar.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !lcaVar.P) {
            int i2 = 0;
            while (true) {
                if (i2 < wsaVar.d().size()) {
                    if (((TL_stars.TL_starGiftCollection) wsaVar.d().get(i2)).collection_id == num.intValue()) {
                        i = i2;
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) wsaVar.d().get(i2);
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
            String q = cf3.q(na7.q1(i3).Z1(lcaVar.c));
            boolean h = wsaVar.h();
            if (TextUtils.isEmpty(q) && !h) {
                return Boolean.FALSE;
            }
            cs5 I = cs5.I(dVar, view);
            I.X(new bq8(lcaVar));
            I.k(2131231832, k96.M0(2131750222, null), new tp8(lcaVar, (byte) 2), h);
            I.k(2131232368, k96.M0(2131750218, null), new qt(lcaVar, i3, q, tL_starGiftCollection, context, wjbVar, dVar), !TextUtils.isEmpty(q));
            I.k(2131232121, k96.M0(2131750220, null), new ll8(lcaVar, tL_starGiftCollection, (byte) 17), h);
            I.k(2131232778, k96.M0(2131750219, null), new tp8(lcaVar, (byte) 1), h);
            I.l(2131232113, new j45(lcaVar, i, tL_starGiftCollection, (byte) 27), k96.M0(2131750221, null), h, true);
            lcaVar.J = I;
            I.a0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        hn7 hn7Var2 = (hn7) this.b;
        ki kiVar = (ki) this.c;
        li liVar = (li) this.d;
        ij.g(null, null, 0L, this.a, 3, hn7Var2, kiVar, liVar);
        ij.e((TextView) this.e, hn7Var2, kiVar, liVar);
    }

    @Override
    public final void onFailure(Exception exc) {
        mza mzaVar = (mza) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        int i = this.a;
        q68 q68Var = (q68) this.d;
        a61 a61Var = (a61) this.e;
        mzaVar.y = false;
        fa4.g(exc, true);
        if ((exc instanceof be7) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && mzaVar.isAttachedToWindow()) {
            gl.e3(new ica(mzaVar, bitmap, i, q68Var, (byte) 3), 2000L);
        } else {
            a61Var.a(new ArrayList());
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        nj njVar;
        aqa aqaVar = (aqa) this.b;
        Context context = (Context) this.c;
        wjb wjbVar = (wjb) this.d;
        i8c i8cVar = (i8c) this.e;
        ypa ypaVar = (ypa) aqaVar.q.get(aqaVar.s);
        if (ypaVar != null) {
            nj njVar2 = ypaVar.c;
            gta u = gta.u(this.a, aqaVar.s);
            if (u.e) {
                njVar = nj.m(u.m());
            } else {
                njVar = null;
            }
            if (njVar != null && njVar2.b > njVar.b) {
                oj ojVar = aqaVar.s;
                if (ojVar == oj.a) {
                    new zua(context, wjbVar, njVar2.a(), 14, null, null, 0L).show();
                    return;
                } else if (ojVar == oj.b) {
                    new xdb(context, wjbVar, njVar2, null).show();
                    return;
                } else {
                    return;
                }
            }
            c01 c01Var = aqaVar.n;
            if (c01Var != null) {
                c01Var.a(false);
                aqaVar.n = null;
            }
            i8cVar.a(ypaVar, hdVar.g(i, true, true));
        }
    }

    public gg(ve6 ve6Var, String str, String str2, String str3, int i) {
        this.b = ve6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.a = i;
    }

    public gg(mza mzaVar, Bitmap bitmap, int i, q68 q68Var, a61 a61Var) {
        this.b = mzaVar;
        this.c = bitmap;
        this.a = i;
        this.d = q68Var;
        this.e = a61Var;
    }

    public gg(Object obj, int i, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
