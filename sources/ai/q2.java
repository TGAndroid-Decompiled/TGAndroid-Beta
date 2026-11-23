package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.s2;
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;
public final class q2 extends e51 {
    public p2 f1498e;
    public p2[] f1499f = new p2[0];
    public String[] h = new String[0];
    public final m2 f1500n = new m2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        ClickableSpan[] clickableSpanArr;
        o41 i7 = o41.i(6, hd.N0(2131745052, null));
        i7.L(np.g1().getBoolean("asr_live_text", true));
        arrayList.add(i7);
        arrayList.add(o41.C(hd.N0(2131745051, null)));
        int i10 = 0;
        if (DictationAsr.w(this.currentAccount) && g1.h()) {
            o41 i11 = o41.i(2, hd.N0(2131745049, null));
            i11.L(DictationAsr.A(this.currentAccount));
            arrayList.add(i11);
            String N0 = hd.N0(2131745048, null);
            m2 m2Var = new m2(this, 1);
            String N02 = hd.N0(2131745057, null);
            int i12 = m6.f29587q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i12, 0, m2Var, null);
            SpannableString spannableString = new SpannableString(">");
            nq nqVar = new nq(2131232061, 0);
            nqVar.a(i12);
            nqVar.c(org.telegram.messenger.g0.L(18.0f));
            nqVar.F = org.telegram.messenger.g0.L(11.0f);
            nqVar.f37907r = -org.telegram.messenger.g0.L(5.0f);
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
        i5.c.s(2131745058, null, arrayList);
        p2 p2Var = this.f1498e;
        if (p2Var != null) {
            arrayList.add(o41.j(1, p2Var));
        }
        while (true) {
            p2[] p2VarArr = this.f1499f;
            if (i10 < p2VarArr.length) {
                p2 p2Var2 = p2VarArr[i10];
                if (p2Var2 != null) {
                    arrayList.add(o41.j(i10 + 100, p2Var2));
                }
                i10++;
            } else {
                arrayList.add(o41.C(null));
                boolean z10 = s2.f26694a;
                o41 e10 = o41.e(4, hd.N0(2131745067, null));
                e10.f38064s = true;
                arrayList.add(e10);
                o41 e11 = o41.e(5, hd.N0(2131745066, null));
                e11.f38064s = true;
                arrayList.add(e11);
                arrayList.add(o41.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131745035, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        String str;
        boolean z10;
        int i7 = o41Var.d;
        if (i7 != 2) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        np.g1().edit().putBoolean("asr_live_text", !np.g1().getBoolean("asr_live_text", true)).apply();
                    } else {
                        return;
                    }
                } else {
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (k10.i(i10).p()) {
                            if (i10 == this.currentAccount) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ur a02 = ur.a0(i10);
                            a02.f27214a.c(new sq(0, a02, new n2(0, this, z10)));
                        }
                    }
                    return;
                }
            } else {
                DictationAsr.r();
                e0();
                return;
            }
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.A(i11);
            SharedPreferences.Editor edit = np.g1().edit();
            if (k10.i(i11).q()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z11).apply();
            for (int i12 = 0; i12 < 4; i12++) {
                if (k10.i(i12).p()) {
                    ls.f(i12).k(ls.E1, new Object[0]);
                }
            }
        }
        this.f34671a.f35742g3.O(true);
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        p2 p2Var = new p2(context, null, hd.N0(2131745068, null), null, true);
        this.f1498e = p2Var;
        p2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f34671a.r1();
        this.f34671a.setSectionsDrawBackground(true);
        DictationAsr.f43038g.add(this.f1500n);
        g1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] D = DictationAsr.D();
        this.h = D;
        this.f1499f = new p2[D.length];
        for (int i7 = 0; i7 < D.length; i7++) {
            p I = DictationAsr.I(D[i7]);
            if (i7 != 0 && DictationAsr.I(D[i7 - 1]) == I) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i7 < D.length - 1 && DictationAsr.I(D[i7 + 1]) != I) {
                z11 = true;
            } else {
                z11 = false;
            }
            String q10 = k0.q(D[i7]);
            p2[] p2VarArr = this.f1499f;
            String str3 = D[i7];
            if (q10 != null) {
                str = q10;
            } else {
                str = str3;
            }
            if (z10 && I.f1445e > 0) {
                str2 = org.telegram.messenger.g0.i0(I.f1445e, false, false);
            } else {
                str2 = null;
            }
            p2 p2Var = new p2(context, str3, str, str2, z11);
            p2VarArr[i7] = p2Var;
            p2Var.f1478a0 = new a1.e(17, this, p2Var);
            p2Var.setOnClickListener(new o2(0, this, p2Var));
        }
    }

    public final void e0() {
        p2[] p2VarArr;
        p2 p2Var = this.f1498e;
        if (p2Var != null) {
            p2Var.c();
        }
        for (p2 p2Var2 : this.f1499f) {
            if (p2Var2 != null) {
                p2Var2.c();
            }
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34671a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.Q(this.f1500n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
