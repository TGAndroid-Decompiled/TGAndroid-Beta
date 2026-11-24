package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class yt implements View.OnClickListener {
    public final byte a;
    public final o b;

    public yt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void onClick(View view) {
        Typeface typeface;
        Typeface create;
        Typeface typeface2;
        Typeface typeface3;
        boolean z;
        byte b = this.a;
        int i = 0;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (oVar.v0[0].e()) {
                    if (oVar.v0[0].getWebView() != null) {
                        oVar.v0[0].getWebView().findNext(false);
                        return;
                    }
                    return;
                }
                oVar.U(oVar.H - 1);
                return;
            case 1:
                if (oVar.v0[0].e()) {
                    if (oVar.v0[0].getWebView() != null) {
                        oVar.v0[0].getWebView().findNext(true);
                        return;
                    }
                    return;
                }
                oVar.U(oVar.H + 1);
                return;
            case 2:
                wu wuVar = oVar.i0;
                if (wuVar.U) {
                    wuVar.h(false);
                    return;
                } else if (wuVar.a0) {
                    wuVar.k(false);
                    return;
                } else {
                    if (oVar.G()) {
                        m mVar = oVar.v0[0];
                        if (mVar.s) {
                            if (mVar.e() && mVar.getWebView() != null) {
                                mVar.getWebView().goBack();
                                return;
                            }
                            return;
                        }
                    }
                    if (oVar.e0.size() > 1) {
                        oVar.D();
                        return;
                    }
                    sx sxVar = oVar.L;
                    if (sxVar != null) {
                        sxVar.a(false);
                        return;
                    } else {
                        oVar.l(true, true);
                        return;
                    }
                }
            case 3:
                sx sxVar2 = oVar.L;
                if (sxVar2 != null) {
                    sxVar2.a(true);
                    return;
                }
                return;
            case 4:
                int intValue = ((Integer) view.getTag()).intValue();
                oVar.a = intValue;
                for (int i2 = 0; i2 < 2; i2++) {
                    yd ydVar = oVar.U0[i2];
                    if (i2 == intValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((RadioButton) ydVar.b).a(z, true);
                }
                nx nxVar = o.h1;
                int i3 = oVar.a;
                nxVar.getClass();
                a.b.getSharedPreferences("articles", 0).edit().putInt("font_type", i3).commit();
                if (i3 == 0) {
                    typeface = Typeface.DEFAULT;
                    Typeface n1 = gm.n1("fonts/ritalic.ttf");
                    Typeface o = gm.o();
                    create = gm.n1("fonts/rmediumitalic.ttf");
                    typeface3 = n1;
                    typeface2 = o;
                } else {
                    typeface = Typeface.SERIF;
                    Typeface create2 = Typeface.create("serif", 2);
                    Typeface create3 = Typeface.create("serif", 1);
                    create = Typeface.create("serif", 3);
                    typeface2 = create3;
                    typeface3 = create2;
                }
                Typeface typeface4 = typeface;
                Typeface typeface5 = create;
                for (int i4 = 0; i4 < nxVar.t.size(); i4++) {
                    nx.b(nxVar.t.keyAt(i4), (TextPaint) nxVar.t.valueAt(i4), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i5 = 0; i5 < nxVar.s.size(); i5++) {
                    nx.b(nxVar.s.keyAt(i5), (TextPaint) nxVar.s.valueAt(i5), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i6 = 0; i6 < nxVar.q.size(); i6++) {
                    nx.b(nxVar.q.keyAt(i6), (TextPaint) nxVar.q.valueAt(i6), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i7 = 0; i7 < nxVar.r.size(); i7++) {
                    nx.b(nxVar.r.keyAt(i7), (TextPaint) nxVar.r.valueAt(i7), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i8 = 0; i8 < nxVar.u.size(); i8++) {
                    nx.b(nxVar.u.keyAt(i8), (TextPaint) nxVar.u.valueAt(i8), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i9 = 0; i9 < nxVar.w.size(); i9++) {
                    nx.b(nxVar.w.keyAt(i9), (TextPaint) nxVar.w.valueAt(i9), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i10 = 0; i10 < nxVar.x.size(); i10++) {
                    nx.b(nxVar.x.keyAt(i10), (TextPaint) nxVar.x.valueAt(i10), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i11 = 0; i11 < nxVar.b.size(); i11++) {
                    nx.b(nxVar.b.keyAt(i11), (TextPaint) nxVar.b.valueAt(i11), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i12 = 0; i12 < nxVar.c.size(); i12++) {
                    nx.b(nxVar.c.keyAt(i12), (TextPaint) nxVar.c.valueAt(i12), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i13 = 0; i13 < nxVar.o.size(); i13++) {
                    nx.b(nxVar.o.keyAt(i13), (TextPaint) nxVar.o.valueAt(i13), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i14 = 0; i14 < nxVar.p.size(); i14++) {
                    nx.b(nxVar.p.keyAt(i14), (TextPaint) nxVar.p.valueAt(i14), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i15 = 0; i15 < nxVar.v.size(); i15++) {
                    nx.b(nxVar.v.keyAt(i15), (TextPaint) nxVar.v.valueAt(i15), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i16 = 0; i16 < nxVar.y.size(); i16++) {
                    nx.b(nxVar.y.keyAt(i16), (TextPaint) nxVar.y.valueAt(i16), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i17 = 0; i17 < nxVar.z.size(); i17++) {
                    nx.b(nxVar.z.keyAt(i17), (TextPaint) nxVar.z.valueAt(i17), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i18 = 0; i18 < nxVar.A.size(); i18++) {
                    nx.b(nxVar.A.keyAt(i18), (TextPaint) nxVar.A.valueAt(i18), typeface4, typeface5, typeface2, typeface3);
                }
                while (true) {
                    m[] mVarArr = oVar.v0;
                    if (i < mVarArr.length) {
                        mVarArr[i].c.f();
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                bx bxVar = oVar.d;
                if (bxVar != null) {
                    gm.g(bxVar.d.getText());
                    if (gm.C3()) {
                        Toast.makeText(oVar.M, jb6.M0(2131743879, null), 0).show();
                    }
                }
                m8 m8Var = oVar.I;
                if (m8Var != null && m8Var.isShowing()) {
                    oVar.I.d(true);
                    return;
                }
                return;
        }
    }
}
