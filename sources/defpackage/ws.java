package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class ws implements View.OnClickListener {
    public final byte a;
    public final o b;

    public ws(o oVar, byte b) {
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
                xt xtVar = oVar.i0;
                if (xtVar.U) {
                    xtVar.h(false);
                    return;
                } else if (xtVar.a0) {
                    xtVar.k(false);
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
                    tw twVar = oVar.L;
                    if (twVar != null) {
                        twVar.a(false);
                        return;
                    } else {
                        oVar.l(true, true);
                        return;
                    }
                }
            case 3:
                tw twVar2 = oVar.L;
                if (twVar2 != null) {
                    twVar2.a(true);
                    return;
                }
                return;
            case 4:
                int intValue = ((Integer) view.getTag()).intValue();
                oVar.a = intValue;
                for (int i2 = 0; i2 < 2; i2++) {
                    zc zcVar = oVar.U0[i2];
                    if (i2 == intValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((RadioButton) zcVar.b).a(z, true);
                }
                ow owVar = o.h1;
                int i3 = oVar.a;
                owVar.getClass();
                a.b.getSharedPreferences("articles", 0).edit().putInt("font_type", i3).commit();
                if (i3 == 0) {
                    typeface = Typeface.DEFAULT;
                    Typeface n1 = hl.n1("fonts/ritalic.ttf");
                    Typeface o = hl.o();
                    create = hl.n1("fonts/rmediumitalic.ttf");
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
                for (int i4 = 0; i4 < owVar.t.size(); i4++) {
                    ow.b(owVar.t.keyAt(i4), (TextPaint) owVar.t.valueAt(i4), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i5 = 0; i5 < owVar.s.size(); i5++) {
                    ow.b(owVar.s.keyAt(i5), (TextPaint) owVar.s.valueAt(i5), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i6 = 0; i6 < owVar.q.size(); i6++) {
                    ow.b(owVar.q.keyAt(i6), (TextPaint) owVar.q.valueAt(i6), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i7 = 0; i7 < owVar.r.size(); i7++) {
                    ow.b(owVar.r.keyAt(i7), (TextPaint) owVar.r.valueAt(i7), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i8 = 0; i8 < owVar.u.size(); i8++) {
                    ow.b(owVar.u.keyAt(i8), (TextPaint) owVar.u.valueAt(i8), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i9 = 0; i9 < owVar.w.size(); i9++) {
                    ow.b(owVar.w.keyAt(i9), (TextPaint) owVar.w.valueAt(i9), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i10 = 0; i10 < owVar.x.size(); i10++) {
                    ow.b(owVar.x.keyAt(i10), (TextPaint) owVar.x.valueAt(i10), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i11 = 0; i11 < owVar.b.size(); i11++) {
                    ow.b(owVar.b.keyAt(i11), (TextPaint) owVar.b.valueAt(i11), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i12 = 0; i12 < owVar.c.size(); i12++) {
                    ow.b(owVar.c.keyAt(i12), (TextPaint) owVar.c.valueAt(i12), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i13 = 0; i13 < owVar.o.size(); i13++) {
                    ow.b(owVar.o.keyAt(i13), (TextPaint) owVar.o.valueAt(i13), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i14 = 0; i14 < owVar.p.size(); i14++) {
                    ow.b(owVar.p.keyAt(i14), (TextPaint) owVar.p.valueAt(i14), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i15 = 0; i15 < owVar.v.size(); i15++) {
                    ow.b(owVar.v.keyAt(i15), (TextPaint) owVar.v.valueAt(i15), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i16 = 0; i16 < owVar.y.size(); i16++) {
                    ow.b(owVar.y.keyAt(i16), (TextPaint) owVar.y.valueAt(i16), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i17 = 0; i17 < owVar.z.size(); i17++) {
                    ow.b(owVar.z.keyAt(i17), (TextPaint) owVar.z.valueAt(i17), typeface4, typeface5, typeface2, typeface3);
                }
                for (int i18 = 0; i18 < owVar.A.size(); i18++) {
                    ow.b(owVar.A.keyAt(i18), (TextPaint) owVar.A.valueAt(i18), typeface4, typeface5, typeface2, typeface3);
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
                cw cwVar = oVar.d;
                if (cwVar != null) {
                    hl.g(cwVar.d.getText());
                    if (hl.C3()) {
                        Toast.makeText(oVar.M, ob6.M0(2131743847, null), 0).show();
                    }
                }
                n8 n8Var = oVar.I;
                if (n8Var != null && n8Var.isShowing()) {
                    oVar.I.d(true);
                    return;
                }
                return;
        }
    }
}
