package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Dictation.DictationAsr;
public final class v2 extends r41 {
    public u2 f1596e;
    public u2[] f1597f = new u2[0];
    public String[] h = new String[0];
    public final s2 f1598n = new s2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        int i7 = 0;
        if (DictationAsr.A()) {
            b41 i10 = b41.i(2, "On-device transcription");
            i10.L(DictationAsr.z(this.currentAccount));
            arrayList.add(i10);
            s2 s2Var = new s2(this, 1);
            int i11 = j6.f29089q6;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2("**Learn more** >", i11, 0, s2Var, null);
            SpannableString spannableString = new SpannableString(">");
            eq eqVar = new eq(2131232060, 0);
            eqVar.a(i11);
            eqVar.c(org.telegram.messenger.g0.L(18.0f));
            eqVar.F = org.telegram.messenger.g0.L(11.0f);
            eqVar.f34415r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            arrayList.add(b41.C(TextUtils.concat("Voice messages are transcribed on this phone. Private: nothing leaves it. ", org.telegram.messenger.g0.K2(S2, spannableString, ">"))));
        }
        arrayList.add(b41.u("Languages"));
        u2 u2Var = this.f1596e;
        if (u2Var != null) {
            arrayList.add(b41.j(1, u2Var));
        }
        while (true) {
            u2[] u2VarArr = this.f1597f;
            if (i7 < u2VarArr.length) {
                u2 u2Var2 = u2VarArr[i7];
                if (u2Var2 != null) {
                    arrayList.add(b41.j(i7 + 100, u2Var2));
                }
                i7++;
            } else {
                arrayList.add(b41.C(null));
                b41 i12 = b41.i(3, "Fallback to Google");
                i12.L(DictationAsr.x());
                arrayList.add(i12);
                arrayList.add(b41.C("For other languages, app can use system speech recognition. This might send your voice data to Google or other vendor servers."));
                boolean z10 = org.telegram.messenger.r2.f26198a;
                b41 e10 = b41.e(4, "Delete all models");
                e10.f33187r = true;
                arrayList.add(e10);
                arrayList.add(b41.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return "Speech to Text";
    }

    @Override
    public final void b0(b41 b41Var, View view) {
        String str;
        int i7 = b41Var.d;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    return;
                }
                DictationAsr.q();
                e0();
                return;
            }
            np.e1().edit().putBoolean("asr_google", !DictationAsr.x()).apply();
        } else {
            int i10 = this.currentAccount;
            boolean z10 = !DictationAsr.z(i10);
            SharedPreferences.Editor edit = np.e1().edit();
            if (m10.i(i10).q()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z10).apply();
            for (int i11 = 0; i11 < 4; i11++) {
                if (m10.i(i11).p()) {
                    ns.f(i11).k(ns.E1, new Object[0]);
                }
            }
        }
        this.f38882a.f39895g3.O(true);
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        u2 u2Var = new u2(context, null, "Auto-Detect", null, true);
        this.f1596e = u2Var;
        u2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f38882a.r1();
        this.f38882a.setSectionsDrawBackground(true);
        DictationAsr.f42584g.add(this.f1598n);
        CountDownLatch e10 = i1.e();
        if (e10 != null) {
            new Thread(new e1(e10, 0), "DictationModels").start();
        }
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String[] C = DictationAsr.C();
        this.h = C;
        this.f1597f = new u2[C.length];
        for (int i7 = 0; i7 < C.length; i7++) {
            s H = DictationAsr.H(C[i7]);
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
            String P0 = p21.P0(C[i7]);
            u2[] u2VarArr = this.f1597f;
            String str3 = C[i7];
            if (P0 != null) {
                str = P0;
            } else {
                str = str3;
            }
            if (z10 && H.f1532c > 0) {
                str2 = org.telegram.messenger.g0.i0(H.f1532c, false, false);
            } else {
                str2 = null;
            }
            u2 u2Var = new u2(context, str3, str, str2, z11);
            u2VarArr[i7] = u2Var;
            u2Var.setOnClickListener(new t2(0, this, u2Var));
        }
    }

    public final void e0() {
        u2[] u2VarArr;
        u2 u2Var = this.f1596e;
        if (u2Var != null) {
            u2Var.b();
        }
        for (u2 u2Var2 : this.f1597f) {
            if (u2Var2 != null) {
                u2Var2.b();
            }
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f38882a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.N(this.f1598n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
