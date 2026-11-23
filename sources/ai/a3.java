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
import org.telegram.messenger.sq;
import org.telegram.messenger.ur;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Dictation.DictationAsr;
public final class a3 extends e51 {
    public z2 f1119e;
    public z2[] f1120f = new z2[0];
    public String[] h = new String[0];
    public final w2 f1121n = new w2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
        ClickableSpan[] clickableSpanArr;
        o41 i7 = o41.i(6, hd.N0(2131745050, null));
        i7.L(np.g1().getBoolean("asr_live_text", true));
        arrayList.add(i7);
        arrayList.add(o41.C(hd.N0(2131745049, null)));
        if (DictationAsr.w(this.currentAccount) && m1.h()) {
            o41 i10 = o41.i(2, hd.N0(2131745047, null));
            i10.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i10);
            String N0 = hd.N0(2131745046, null);
            w2 w2Var = new w2(this, 1);
            String N02 = hd.N0(2131745055, null);
            int i11 = m6.f29621q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i11, 0, w2Var, null);
            SpannableString spannableString = new SpannableString(">");
            nq nqVar = new nq(2131232061, 0);
            nqVar.a(i11);
            nqVar.c(org.telegram.messenger.g0.L(18.0f));
            nqVar.F = org.telegram.messenger.g0.L(11.0f);
            nqVar.f37950r = -org.telegram.messenger.g0.L(5.0f);
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
        z2 z2Var = this.f1119e;
        if (z2Var != null) {
            arrayList.add(o41.j(1, z2Var));
        }
        int i12 = 0;
        while (true) {
            z2[] z2VarArr = this.f1120f;
            if (i12 < z2VarArr.length) {
                z2 z2Var2 = z2VarArr[i12];
                if (z2Var2 != null) {
                    arrayList.add(o41.j(i12 + 100, z2Var2));
                }
                i12++;
            } else {
                arrayList.add(o41.C(null));
                o41 i13 = o41.i(3, hd.N0(2131745058, null));
                i13.L(np.g1().getBoolean("asr_google", false));
                arrayList.add(i13);
                arrayList.add(o41.C(hd.N0(2131745057, null)));
                boolean z10 = org.telegram.messenger.s2.f26730a;
                o41 e10 = o41.e(4, hd.N0(2131745067, null));
                e10.f38097s = true;
                arrayList.add(e10);
                o41 e11 = o41.e(5, hd.N0(2131745066, null));
                e11.f38097s = true;
                arrayList.add(e11);
                arrayList.add(o41.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131745033, null);
    }

    @Override
    public final void b0(o41 o41Var, View view) {
        String str;
        boolean z10;
        int i7 = o41Var.d;
        if (i7 != 2) {
            if (i7 != 3) {
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
                                a02.f27250a.c(new sq(0, a02, new x2(0, this, z10)));
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
                t[] tVarArr = DictationAsr.f43067a;
                np.g1().edit().putBoolean("asr_google", !np.g1().getBoolean("asr_google", false)).apply();
            }
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.B(i11);
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
        this.f34681a.f35789g3.O(true);
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        z2 z2Var = new z2(context, null, hd.N0(2131745068, null), null, true);
        this.f1119e = z2Var;
        z2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f34681a.r1();
        this.f34681a.setSectionsDrawBackground(true);
        DictationAsr.f43072g.add(this.f1121n);
        m1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] E = DictationAsr.E();
        this.h = E;
        this.f1120f = new z2[E.length];
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
            z2[] z2VarArr = this.f1120f;
            String str3 = E[i7];
            if (q10 != null) {
                str = q10;
            } else {
                str = str3;
            }
            if (z10 && J.f1519e > 0) {
                str2 = org.telegram.messenger.g0.i0(J.f1519e, false, false);
            } else {
                str2 = null;
            }
            z2 z2Var = new z2(context, str3, str, str2, z11);
            z2VarArr[i7] = z2Var;
            z2Var.f1648a0 = new a1.e(19, this, z2Var);
            z2Var.setOnClickListener(new y2(0, this, z2Var));
        }
    }

    public final void e0() {
        z2[] z2VarArr;
        z2 z2Var = this.f1119e;
        if (z2Var != null) {
            z2Var.c();
        }
        for (z2 z2Var2 : this.f1120f) {
            if (z2Var2 != null) {
                z2Var2.c();
            }
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34681a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.R(this.f1121n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
