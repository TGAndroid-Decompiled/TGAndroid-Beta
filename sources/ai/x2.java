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
import org.telegram.messenger.pq;
import org.telegram.messenger.vr;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Dictation.DictationAsr;
public final class x2 extends r41 {
    public w2 f1621e;
    public w2[] f1622f = new w2[0];
    public String[] h = new String[0];
    public final t2 f1623n = new t2(this, 0);

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
        int i7 = 0;
        if (DictationAsr.A()) {
            b41 i10 = b41.i(2, "On-device transcription");
            i10.L(DictationAsr.z(this.currentAccount));
            arrayList.add(i10);
            t2 t2Var = new t2(this, 1);
            int i11 = j6.f29089q6;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2("**Learn more** >", i11, 0, t2Var, null);
            SpannableString spannableString = new SpannableString(">");
            eq eqVar = new eq(2131232060, 0);
            eqVar.a(i11);
            eqVar.c(org.telegram.messenger.g0.L(18.0f));
            eqVar.F = org.telegram.messenger.g0.L(11.0f);
            eqVar.f34414r = -org.telegram.messenger.g0.L(5.0f);
            spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            arrayList.add(b41.C(TextUtils.concat("Voice messages are transcribed on this phone. Private: nothing leaves it. ", org.telegram.messenger.g0.K2(S2, spannableString, ">"))));
        }
        arrayList.add(b41.u("Languages"));
        w2 w2Var = this.f1621e;
        if (w2Var != null) {
            arrayList.add(b41.j(1, w2Var));
        }
        while (true) {
            w2[] w2VarArr = this.f1622f;
            if (i7 < w2VarArr.length) {
                w2 w2Var2 = w2VarArr[i7];
                if (w2Var2 != null) {
                    arrayList.add(b41.j(i7 + 100, w2Var2));
                }
                i7++;
            } else {
                arrayList.add(b41.C(null));
                b41 i12 = b41.i(3, "Fallback to Google");
                i12.L(DictationAsr.x());
                arrayList.add(i12);
                arrayList.add(b41.C("For other languages, app can use system speech recognition. This might send your voice data to Google or other vendor servers."));
                boolean z10 = org.telegram.messenger.r2.f26206a;
                b41 e10 = b41.e(4, "Delete all models");
                e10.f33190r = true;
                arrayList.add(e10);
                b41 e11 = b41.e(5, "Delete all local transcriptions");
                e11.f33190r = true;
                arrayList.add(e11);
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
        boolean z10;
        int i7 = b41Var.d;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 == 5) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (m10.i(i10).p()) {
                                if (i10 == this.currentAccount) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                vr a02 = vr.a0(i10);
                                a02.f27219a.c(new pq(0, a02, new u2(0, this, z10)));
                            }
                        }
                        return;
                    }
                    return;
                }
                DictationAsr.q();
                e0();
                return;
            }
            np.e1().edit().putBoolean("asr_google", !DictationAsr.x()).apply();
        } else {
            int i11 = this.currentAccount;
            boolean z11 = !DictationAsr.z(i11);
            SharedPreferences.Editor edit = np.e1().edit();
            if (m10.i(i11).q()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z11).apply();
            for (int i12 = 0; i12 < 4; i12++) {
                if (m10.i(i12).p()) {
                    ns.f(i12).k(ns.E1, new Object[0]);
                }
            }
        }
        this.f38880a.f39892g3.O(true);
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        w2 w2Var = new w2(context, null, "Auto-Detect", null, true);
        this.f1621e = w2Var;
        w2Var.setOnClickListener(new ah.d(this, 1));
        d0(context);
        this.fragmentView = super.createView(context);
        this.f38880a.r1();
        this.f38880a.setSectionsDrawBackground(true);
        DictationAsr.f42584g.add(this.f1623n);
        CountDownLatch e10 = j1.e();
        if (e10 != null) {
            new Thread(new f1(e10, 0), "DictationModels").start();
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
        this.f1622f = new w2[C.length];
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
            String P0 = p21.P0(C[i7]);
            w2[] w2VarArr = this.f1622f;
            String str3 = C[i7];
            if (P0 != null) {
                str = P0;
            } else {
                str = str3;
            }
            if (z10 && H.f1541c > 0) {
                str2 = org.telegram.messenger.g0.i0(H.f1541c, false, false);
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
        w2 w2Var = this.f1621e;
        if (w2Var != null) {
            w2Var.b();
        }
        for (w2 w2Var2 : this.f1622f) {
            if (w2Var2 != null) {
                w2Var2.b();
            }
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f38880a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.N(this.f1623n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
