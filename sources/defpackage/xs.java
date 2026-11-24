package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class xs implements View.OnClickListener {
    public final byte a;
    public final o b;

    public xs(o oVar, byte b) {
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
                wt wtVar = oVar.i0;
                if (wtVar.U) {
                    wtVar.h(false);
                    return;
                } else if (wtVar.a0) {
                    wtVar.k(false);
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
                    sw swVar = oVar.L;
                    if (swVar != null) {
                        swVar.a(false);
                        return;
                    } else {
                        oVar.l(true, true);
                        return;
                    }
                }
            case 3:
                sw swVar2 = oVar.L;
                if (swVar2 != null) {
                    swVar2.a(true);
                    return;
                }
                return;
            case 4:
                int intValue = ((Integer) view.getTag()).intValue();
                oVar.a = intValue;
                for (int i2 = 0; i2 < 2; i2++) {
                    yc ycVar = oVar.U0[i2];
                    if (i2 == intValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((RadioButton) ycVar.b).a(z, true);
                }
                nw nwVar = o.h1;
                int i3 = oVar.a;
                nwVar.getClass();
                a.b.getSharedPreferences("articles", 0).edit().putInt("font_type", i3).commit();
                if (i3 == 0) {
                    typeface = Typeface.DEFAULT;
                    Typeface n1 = gl.n1("fonts/ritalic.ttf");
                    Typeface o = gl.o();
                    create = gl.n1("fonts/rmediumitalic.ttf");
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
                for (int i4 = 0; i4 < nwVar.t.size(); i4++) {
                    nw.b(nwVar.t.keyAt(i4), (TextPaint) nwVar.t.valueAt(i4), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i5 = 0; i5 < nwVar.s.size(); i5++) {
                    nw.b(nwVar.s.keyAt(i5), (TextPaint) nwVar.s.valueAt(i5), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i6 = 0; i6 < nwVar.q.size(); i6++) {
                    nw.b(nwVar.q.keyAt(i6), (TextPaint) nwVar.q.valueAt(i6), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i7 = 0; i7 < nwVar.r.size(); i7++) {
                    nw.b(nwVar.r.keyAt(i7), (TextPaint) nwVar.r.valueAt(i7), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i8 = 0; i8 < nwVar.u.size(); i8++) {
                    nw.b(nwVar.u.keyAt(i8), (TextPaint) nwVar.u.valueAt(i8), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i9 = 0; i9 < nwVar.w.size(); i9++) {
                    nw.b(nwVar.w.keyAt(i9), (TextPaint) nwVar.w.valueAt(i9), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i10 = 0; i10 < nwVar.x.size(); i10++) {
                    nw.b(nwVar.x.keyAt(i10), (TextPaint) nwVar.x.valueAt(i10), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i11 = 0; i11 < nwVar.b.size(); i11++) {
                    nw.b(nwVar.b.keyAt(i11), (TextPaint) nwVar.b.valueAt(i11), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i12 = 0; i12 < nwVar.c.size(); i12++) {
                    nw.b(nwVar.c.keyAt(i12), (TextPaint) nwVar.c.valueAt(i12), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i13 = 0; i13 < nwVar.o.size(); i13++) {
                    nw.b(nwVar.o.keyAt(i13), (TextPaint) nwVar.o.valueAt(i13), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i14 = 0; i14 < nwVar.p.size(); i14++) {
                    nw.b(nwVar.p.keyAt(i14), (TextPaint) nwVar.p.valueAt(i14), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i15 = 0; i15 < nwVar.v.size(); i15++) {
                    nw.b(nwVar.v.keyAt(i15), (TextPaint) nwVar.v.valueAt(i15), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i16 = 0; i16 < nwVar.y.size(); i16++) {
                    nw.b(nwVar.y.keyAt(i16), (TextPaint) nwVar.y.valueAt(i16), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i17 = 0; i17 < nwVar.z.size(); i17++) {
                    nw.b(nwVar.z.keyAt(i17), (TextPaint) nwVar.z.valueAt(i17), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i18 = 0; i18 < nwVar.A.size(); i18++) {
                    nw.b(nwVar.A.keyAt(i18), (TextPaint) nwVar.A.valueAt(i18), typeface4, typeface5, typeface2, typeface3);
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
                bw bwVar = oVar.d;
                if (bwVar != null) {
                    gl.g(bwVar.d.getText());
                    if (gl.D3()) {
                        Toast.makeText(oVar.M, k96.M0(2131743953, null), 0).show();
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
