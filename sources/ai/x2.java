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
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Dictation.DictationAsr;
public final class x2 extends b51 {
    public w2 f1612e;
    public w2[] f1613f = new w2[0];
    public String[] h = new String[0];
    public final t2 f1614n = new t2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, z41 z41Var) {
        ClickableSpan[] clickableSpanArr;
        int i7 = 0;
        if (DictationAsr.u(this.currentAccount) && j1.h()) {
            l41 i10 = l41.i(2, gd.M0(2131745055, null));
            i10.L(DictationAsr.z(this.currentAccount));
            arrayList.add(i10);
            String M0 = gd.M0(2131745054, null);
            t2 t2Var = new t2(this, 1);
            String M02 = gd.M0(2131745061, null);
            int i11 = n6.f29636q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(M02, i11, 0, t2Var, null);
            SpannableString spannableString = new SpannableString(">");
            lq lqVar = new lq(2131232061, 0);
            lqVar.a(i11);
            lqVar.c(org.telegram.messenger.g0.L(18.0f));
            lqVar.F = org.telegram.messenger.g0.L(11.0f);
            lqVar.f37198r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(l41.C(TextUtils.concat(M0, " ", K2)));
        }
        i5.c.s(2131745062, null, arrayList);
        w2 w2Var = this.f1612e;
        if (w2Var != null) {
            arrayList.add(l41.j(1, w2Var));
        }
        while (true) {
            w2[] w2VarArr = this.f1613f;
            if (i7 < w2VarArr.length) {
                w2 w2Var2 = w2VarArr[i7];
                if (w2Var2 != null) {
                    arrayList.add(l41.j(i7 + 100, w2Var2));
                }
                i7++;
            } else {
                arrayList.add(l41.C(null));
                l41 i12 = l41.i(3, gd.M0(2131745064, null));
                i12.L(DictationAsr.x());
                arrayList.add(i12);
                arrayList.add(l41.C(gd.M0(2131745063, null)));
                boolean z10 = org.telegram.messenger.s2.f26723a;
                l41 e10 = l41.e(4, gd.M0(2131745073, null));
                e10.f37024s = true;
                arrayList.add(e10);
                l41 e11 = l41.e(5, gd.M0(2131745072, null));
                e11.f37024s = true;
                arrayList.add(e11);
                arrayList.add(l41.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return gd.M0(2131745041, null);
    }

    @Override
    public final void b0(l41 l41Var, View view) {
        String str;
        boolean z10;
        int i7 = l41Var.d;
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
                                a02.f27054a.c(new rq(0, a02, new u2(0, this, z10)));
                            }
                        }
                        return;
                    }
                    return;
                }
                DictationAsr.p();
                e0();
                return;
            }
            mp.g1().edit().putBoolean("asr_google", !DictationAsr.x()).apply();
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.z(i11);
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
        this.f33530a.f34607g3.O(true);
    }

    @Override
    public final boolean c0(l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        w2 w2Var = new w2(context, null, gd.M0(2131745074, null), null, true);
        this.f1612e = w2Var;
        w2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f33530a.r1();
        this.f33530a.setSectionsDrawBackground(true);
        DictationAsr.f43028g.add(this.f1614n);
        j1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] C = DictationAsr.C();
        this.h = C;
        this.f1613f = new w2[C.length];
        for (int i7 = 0; i7 < C.length; i7++) {
            t H = DictationAsr.H(C[i7]);
            if (i7 != 0 && DictationAsr.H(C[i7 - 1]) == H) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i7 < C.length - 1 && DictationAsr.H(C[i7 + 1]) != H) {
                z11 = true;
            } else {
                z11 = false;
            }
            String Q0 = y21.Q0(C[i7]);
            w2[] w2VarArr = this.f1613f;
            String str3 = C[i7];
            if (Q0 != null) {
                str = Q0;
            } else {
                str = str3;
            }
            if (z10 && H.f1532c > 0) {
                str2 = org.telegram.messenger.g0.i0(H.f1532c, false, false);
            } else {
                str2 = null;
            }
            w2 w2Var = new w2(context, str3, str, str2, z11);
            w2VarArr[i7] = w2Var;
            w2Var.setOnClickListener(new v2(0, this, w2Var));
        }
    }

    public final void e0() {
        w2[] w2VarArr;
        w2 w2Var = this.f1612e;
        if (w2Var != null) {
            w2Var.b();
        }
        for (w2 w2Var2 : this.f1613f) {
            if (w2Var2 != null) {
                w2Var2.b();
            }
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f33530a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.N(this.f1614n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
