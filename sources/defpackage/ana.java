package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
public final class ana extends n7c {
    public zma e;
    public zma[] f = new zma[0];
    public String[] h = new String[0];
    public final yma n = new yma(this, (byte) 0);

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        ClickableSpan[] clickableSpanArr;
        c6c i = c6c.i(6, jb6.M0(2131744982, null));
        i.L(oc7.d1().getBoolean("asr_live_text", true));
        arrayList.add(i);
        arrayList.add(c6c.C(jb6.M0(2131744981, null)));
        int i2 = 0;
        if (DictationAsr.C(this.currentAccount)) {
            c6c i3 = c6c.i(2, jb6.M0(2131744979, null));
            i3.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i3);
            String M0 = jb6.M0(2131744978, null);
            yma ymaVar = new yma(this, (byte) 1);
            String M02 = jb6.M0(2131744987, null);
            int i4 = cmb.p6;
            SpannableStringBuilder N2 = gm.N2(M02, i4, 0, ymaVar, null);
            SpannableString spannableString = new SpannableString(">");
            pn2 pn2Var = new pn2(2131232065, 0);
            pn2Var.a(i4);
            pn2Var.c(gm.L(18.0f));
            pn2Var.F = gm.L(11.0f);
            pn2Var.r = -gm.L(5.0f);
            spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder G2 = gm.G2(N2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) G2.getSpans(0, G2.length(), ClickableSpan.class)) {
                int spanStart = G2.getSpanStart(clickableSpan);
                int spanFlags = G2.getSpanFlags(clickableSpan);
                G2.removeSpan(clickableSpan);
                G2.setSpan(clickableSpan, spanStart, G2.length(), spanFlags);
            }
            arrayList.add(c6c.C(TextUtils.concat(M0, " ", G2)));
        }
        aq1.o(2131744988, null, arrayList);
        zma zmaVar = this.e;
        if (zmaVar != null) {
            arrayList.add(c6c.j(1, zmaVar));
        }
        while (true) {
            zma[] zmaVarArr = this.f;
            if (i2 < zmaVarArr.length) {
                zma zmaVar2 = zmaVarArr[i2];
                if (zmaVar2 != null) {
                    arrayList.add(c6c.j(i2 + 100, zmaVar2));
                }
                i2++;
            } else {
                arrayList.add(c6c.C(null));
                boolean z = e21.a;
                c6c e = c6c.e(4, jb6.M0(2131744997, null));
                e.s = true;
                arrayList.add(e);
                c6c e2 = c6c.e(5, jb6.M0(2131744996, null));
                e2.s = true;
                arrayList.add(e2);
                arrayList.add(c6c.C(null));
                e0();
                return;
            }
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131744965, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        String str;
        boolean z;
        int i = c6cVar.d;
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        oc7.d1().edit().putBoolean("asr_live_text", !oc7.d1().getBoolean("asr_live_text", true)).apply();
                    } else {
                        return;
                    }
                } else {
                    for (int i2 = 0; i2 < 4; i2++) {
                        if (z8c.h(i2).o()) {
                            if (i2 == this.currentAccount) {
                                z = true;
                            } else {
                                z = false;
                            }
                            cf7 Y = cf7.Y(i2);
                            Y.a.c(new q87(Y, new ra((byte) 6, this, z), (byte) 19));
                        }
                    }
                    return;
                }
            } else {
                DictationAsr.p();
                e0();
                return;
            }
        } else {
            int i3 = this.currentAccount;
            boolean z2 = !DictationAsr.B(i3);
            SharedPreferences.Editor edit = oc7.d1().edit();
            if (z8c.h(i3).p()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z2).apply();
            for (int i4 = 0; i4 < 4; i4++) {
                if (z8c.h(i4).o()) {
                    nm7.f(i4).k(nm7.E1, new Object[0]);
                }
            }
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        zma zmaVar = new zma(context, null, jb6.M0(2131744998, null), null, true);
        this.e = zmaVar;
        zmaVar.setOnClickListener(new oha(this, (byte) 2));
        d0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.i(this.n);
        jo3.j();
        return this.fragmentView;
    }

    public final void d0(Context context) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String[] G = DictationAsr.G();
        this.h = G;
        this.f = new zma[G.length];
        for (int i = 0; i < G.length; i++) {
            gn3 L = DictationAsr.L(G[i]);
            if (i != 0 && DictationAsr.L(G[i - 1]) == L) {
                z = false;
            } else {
                z = true;
            }
            if (i < G.length - 1 && DictationAsr.L(G[i + 1]) != L) {
                z2 = true;
            } else {
                z2 = false;
            }
            String r = un3.r(G[i]);
            zma[] zmaVarArr = this.f;
            String str3 = G[i];
            if (r != null) {
                str = r;
            } else {
                str = str3;
            }
            if (z && L.e > 0) {
                str2 = gm.i0(L.e, false, false);
            } else {
                str2 = null;
            }
            zma zmaVar = new zma(context, str3, str, str2, z2);
            zmaVarArr[i] = zmaVar;
            zmaVar.a0 = new e6a(this, zmaVar, (byte) 10);
            zmaVar.setOnClickListener(new r39(this, zmaVar, (byte) 10));
        }
    }

    public final void e0() {
        zma[] zmaVarArr;
        zma zmaVar = this.e;
        if (zmaVar != null) {
            zmaVar.c();
        }
        for (zma zmaVar2 : this.f) {
            if (zmaVar2 != null) {
                zmaVar2.c();
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        DictationAsr.T(this.n);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
