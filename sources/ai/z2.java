package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rq;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;
public final class z2 extends e51 {
    public y2 f1649e;
    public y2[] f1650f = new y2[0];
    public String[] h = new String[0];
    public final v2 f1651n = new v2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        ClickableSpan[] clickableSpanArr;
        int i7 = 0;
        if (DictationAsr.w(this.currentAccount) && l1.h()) {
            o41 i10 = o41.i(2, gd.N0(2131745049, null));
            i10.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i10);
            String N0 = gd.N0(2131745048, null);
            v2 v2Var = new v2(this, 1);
            String N02 = gd.N0(2131745055, null);
            int i11 = m6.f29618q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i11, 0, v2Var, null);
            SpannableString spannableString = new SpannableString(">");
            nq nqVar = new nq(2131232061, 0);
            nqVar.a(i11);
            nqVar.c(org.telegram.messenger.g0.L(18.0f));
            nqVar.F = org.telegram.messenger.g0.L(11.0f);
            nqVar.f37946r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(o41.C(TextUtils.concat(N0, " ", K2)));
        }
        i5.c.s(2131745056, null, arrayList);
        y2 y2Var = this.f1649e;
        if (y2Var != null) {
            arrayList.add(o41.j(1, y2Var));
        }
        while (true) {
            y2[] y2VarArr = this.f1650f;
            if (i7 < y2VarArr.length) {
                y2 y2Var2 = y2VarArr[i7];
                if (y2Var2 != null) {
                    arrayList.add(o41.j(i7 + 100, y2Var2));
                }
                i7++;
            } else {
                arrayList.add(o41.C(null));
                o41 i12 = o41.i(3, gd.N0(2131745058, null));
                i12.L(DictationAsr.z());
                arrayList.add(i12);
                arrayList.add(o41.C(gd.N0(2131745057, null)));
                boolean z10 = org.telegram.messenger.s2.f26749a;
                o41 e10 = o41.e(4, gd.N0(2131745067, null));
                e10.f38104s = true;
                arrayList.add(e10);
                o41 e11 = o41.e(5, gd.N0(2131745066, null));
                e11.f38104s = true;
                arrayList.add(e11);
                arrayList.add(o41.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.N0(2131745035, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        String str;
        boolean z10;
        int i7 = o41Var.d;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 == 5) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (j10.i(i10).p()) {
                                if (i10 == this.currentAccount) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                tr a02 = tr.a0(i10);
                                a02.f27080a.c(new rq(0, a02, new w2(0, this, z10)));
                            }
                        }
                        return;
                    }
                    return;
                }
                DictationAsr.r();
                e0();
                return;
            }
            mp.g1().edit().putBoolean("asr_google", !DictationAsr.z()).apply();
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.B(i11);
            SharedPreferences.Editor edit = mp.g1().edit();
            if (j10.i(i11).q()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z11).apply();
            for (int i12 = 0; i12 < 4; i12++) {
                if (j10.i(i12).p()) {
                    ks.f(i12).k(ks.E1, new Object[0]);
                }
            }
        }
        this.f34683a.f35796g3.O(true);
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        y2 y2Var = new y2(context, null, gd.N0(2131745068, null), null, true);
        this.f1649e = y2Var;
        y2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f34683a.r1();
        this.f34683a.setSectionsDrawBackground(true);
        DictationAsr.f43069g.add(this.f1651n);
        l1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] E = DictationAsr.E();
        this.h = E;
        this.f1650f = new y2[E.length];
        for (int i7 = 0; i7 < E.length; i7++) {
            t J = DictationAsr.J(E[i7]);
            if (i7 != 0 && DictationAsr.J(E[i7 - 1]) == J) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i7 < E.length - 1 && DictationAsr.J(E[i7 + 1]) != J) {
                z11 = true;
            } else {
                z11 = false;
            }
            String q10 = p0.q(E[i7]);
            y2[] y2VarArr = this.f1650f;
            String str3 = E[i7];
            if (q10 != null) {
                str = q10;
            } else {
                str = str3;
            }
            if (z10 && J.f1511e > 0) {
                str2 = org.telegram.messenger.g0.i0(J.f1511e, false, false);
            } else {
                str2 = null;
            }
            y2 y2Var = new y2(context, str3, str, str2, z11);
            y2VarArr[i7] = y2Var;
            y2Var.f1624a0 = new a1.e(19, this, y2Var);
            y2Var.setOnClickListener(new x2(0, this, y2Var));
        }
    }

    public final void e0() {
        y2[] y2VarArr;
        y2 y2Var = this.f1649e;
        if (y2Var != null) {
            y2Var.c();
        }
        for (y2 y2Var2 : this.f1650f) {
            if (y2Var2 != null) {
                y2Var2.c();
            }
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34683a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.R(this.f1651n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
