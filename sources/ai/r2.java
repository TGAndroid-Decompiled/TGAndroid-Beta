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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.rq;
import org.telegram.messenger.s2;
import org.telegram.messenger.tr;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Dictation.DictationAsr;
public final class r2 extends d51 {
    public q2 f1510e;
    public q2[] f1511f = new q2[0];
    public String[] h = new String[0];
    public final n2 f1512n = new n2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, b51 b51Var) {
        ClickableSpan[] clickableSpanArr;
        n41 i7 = n41.i(6, gd.N0(2131745052, null));
        i7.L(mp.g1().getBoolean("asr_live_text", true));
        arrayList.add(i7);
        arrayList.add(n41.C(gd.N0(2131745051, null)));
        int i10 = 0;
        if (DictationAsr.E(this.currentAccount)) {
            n41 i11 = n41.i(2, gd.N0(2131745049, null));
            i11.L(DictationAsr.D(this.currentAccount));
            arrayList.add(i11);
            String N0 = gd.N0(2131745048, null);
            n2 n2Var = new n2(this, 1);
            String N02 = gd.N0(2131745057, null);
            int i12 = n6.f29691q6;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(N02, i12, 0, n2Var, null);
            SpannableString spannableString = new SpannableString(">");
            kq kqVar = new kq(2131232064, 0);
            kqVar.a(i12);
            kqVar.c(org.telegram.messenger.g0.L(18.0f));
            kqVar.F = org.telegram.messenger.g0.L(11.0f);
            kqVar.f36853r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
            SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(R2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) K2.getSpans(0, K2.length(), ClickableSpan.class)) {
                int spanStart = K2.getSpanStart(clickableSpan);
                int spanFlags = K2.getSpanFlags(clickableSpan);
                K2.removeSpan(clickableSpan);
                K2.setSpan(clickableSpan, spanStart, K2.length(), spanFlags);
            }
            arrayList.add(n41.C(TextUtils.concat(N0, " ", K2)));
        }
        i5.c.s(2131745058, null, arrayList);
        q2 q2Var = this.f1510e;
        if (q2Var != null) {
            arrayList.add(n41.j(1, q2Var));
        }
        while (true) {
            q2[] q2VarArr = this.f1511f;
            if (i10 < q2VarArr.length) {
                q2 q2Var2 = q2VarArr[i10];
                if (q2Var2 != null) {
                    arrayList.add(n41.j(i10 + 100, q2Var2));
                }
                i10++;
            } else {
                arrayList.add(n41.C(null));
                boolean z10 = s2.f26829a;
                n41 e10 = n41.e(4, gd.N0(2131745067, null));
                e10.f37661s = true;
                arrayList.add(e10);
                n41 e11 = n41.e(5, gd.N0(2131745066, null));
                e11.f37661s = true;
                arrayList.add(e11);
                arrayList.add(n41.C(null));
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
    public final void b0(n41 n41Var, View view) {
        String str;
        boolean z10;
        int i7 = n41Var.d;
        if (i7 != 2) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        mp.g1().edit().putBoolean("asr_live_text", !mp.g1().getBoolean("asr_live_text", true)).apply();
                    } else {
                        return;
                    }
                } else {
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10.i(i10).p()) {
                            if (i10 == this.currentAccount) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            tr a02 = tr.a0(i10);
                            a02.f27149a.c(new rq(0, a02, new o2(0, this, z10)));
                        }
                    }
                    return;
                }
            } else {
                DictationAsr.s();
                e0();
                return;
            }
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.D(i11);
            SharedPreferences.Editor edit = mp.g1().edit();
            if (i10.i(i11).q()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z11).apply();
            for (int i12 = 0; i12 < 4; i12++) {
                if (i10.i(i12).p()) {
                    ks.f(i12).k(ks.E1, new Object[0]);
                }
            }
        }
        this.f34213a.f35323g3.O(true);
    }

    @Override
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        q2 q2Var = new q2(context, null, gd.N0(2131745068, null), null, true);
        this.f1510e = q2Var;
        q2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f34213a.r1();
        this.f34213a.setSectionsDrawBackground(true);
        DictationAsr.l(this.f1512n);
        h1.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] H = DictationAsr.H();
        this.h = H;
        this.f1511f = new q2[H.length];
        for (int i7 = 0; i7 < H.length; i7++) {
            q M = DictationAsr.M(H[i7]);
            if (i7 != 0 && DictationAsr.M(H[i7 - 1]) == M) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i7 < H.length - 1 && DictationAsr.M(H[i7 + 1]) != M) {
                z11 = true;
            } else {
                z11 = false;
            }
            String o4 = l0.o(H[i7]);
            q2[] q2VarArr = this.f1511f;
            String str3 = H[i7];
            if (o4 != null) {
                str = o4;
            } else {
                str = str3;
            }
            if (z10 && M.f1457e > 0) {
                str2 = org.telegram.messenger.g0.i0(M.f1457e, false, false);
            } else {
                str2 = null;
            }
            q2 q2Var = new q2(context, str3, str, str2, z11);
            q2VarArr[i7] = q2Var;
            q2Var.f1490a0 = new a1.e(19, this, q2Var);
            q2Var.setOnClickListener(new p2(0, this, q2Var));
        }
    }

    public final void e0() {
        q2[] q2VarArr;
        q2 q2Var = this.f1510e;
        if (q2Var != null) {
            q2Var.c();
        }
        for (q2 q2Var2 : this.f1511f) {
            if (q2Var2 != null) {
                q2Var2.c();
            }
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f34213a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.U(this.f1512n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
