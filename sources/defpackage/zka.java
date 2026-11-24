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
public final class zka extends n5c {
    public yka e;
    public yka[] f = new yka[0];
    public String[] h = new String[0];
    public final xka n = new xka(this, (byte) 0);

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        ClickableSpan[] clickableSpanArr;
        c4c i = c4c.i(6, k96.M0(2131745056, null));
        i.L(na7.c1().getBoolean("asr_live_text", true));
        arrayList.add(i);
        arrayList.add(c4c.C(k96.M0(2131745055, null)));
        int i2 = 0;
        if (DictationAsr.C(this.currentAccount)) {
            c4c i3 = c4c.i(2, k96.M0(2131745053, null));
            i3.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i3);
            String M0 = k96.M0(2131745052, null);
            xka xkaVar = new xka(this, (byte) 1);
            String M02 = k96.M0(2131745061, null);
            int i4 = bkb.p6;
            SpannableStringBuilder N2 = gl.N2(M02, i4, 0, xkaVar, null);
            SpannableString spannableString = new SpannableString(">");
            cm2 cm2Var = new cm2(2131232064, 0);
            cm2Var.a(i4);
            cm2Var.c(gl.L(18.0f));
            cm2Var.F = gl.L(11.0f);
            cm2Var.r = -gl.L(5.0f);
            spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder G2 = gl.G2(N2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) G2.getSpans(0, G2.length(), ClickableSpan.class)) {
                int spanStart = G2.getSpanStart(clickableSpan);
                int spanFlags = G2.getSpanFlags(clickableSpan);
                G2.removeSpan(clickableSpan);
                G2.setSpan(clickableSpan, spanStart, G2.length(), spanFlags);
            }
            arrayList.add(c4c.C(TextUtils.concat(M0, " ", G2)));
        }
        oo1.o(2131745062, null, arrayList);
        yka ykaVar = this.e;
        if (ykaVar != null) {
            arrayList.add(c4c.j(1, ykaVar));
        }
        while (true) {
            yka[] ykaVarArr = this.f;
            if (i2 < ykaVarArr.length) {
                yka ykaVar2 = ykaVarArr[i2];
                if (ykaVar2 != null) {
                    arrayList.add(c4c.j(i2 + 100, ykaVar2));
                }
                i2++;
            } else {
                arrayList.add(c4c.C(null));
                boolean z = w01.a;
                c4c e = c4c.e(4, k96.M0(2131745071, null));
                e.s = true;
                arrayList.add(e);
                c4c e2 = c4c.e(5, k96.M0(2131745070, null));
                e2.s = true;
                arrayList.add(e2);
                arrayList.add(c4c.C(null));
                d0();
                return;
            }
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131745039, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        String str;
        boolean z;
        int i = c4cVar.d;
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        na7.c1().edit().putBoolean("asr_live_text", !na7.c1().getBoolean("asr_live_text", true)).apply();
                    } else {
                        return;
                    }
                } else {
                    for (int i2 = 0; i2 < 4; i2++) {
                        if (y6c.h(i2).o()) {
                            if (i2 == this.currentAccount) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ad7 Y = ad7.Y(i2);
                            Y.a.c(new t67(Y, new ra((byte) 6, this, z), (byte) 18));
                        }
                    }
                    return;
                }
            } else {
                DictationAsr.p();
                d0();
                return;
            }
        } else {
            int i3 = this.currentAccount;
            boolean z2 = !DictationAsr.B(i3);
            SharedPreferences.Editor edit = na7.c1().edit();
            if (y6c.h(i3).p()) {
                str = "asr_local_premium";
            } else {
                str = "asr_local_free";
            }
            edit.putBoolean(str, z2).apply();
            for (int i4 = 0; i4 < 4; i4++) {
                if (y6c.h(i4).o()) {
                    kk7.f(i4).k(kk7.D1, new Object[0]);
                }
            }
        }
        this.a.g3.O(true);
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0(Context context) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String[] G = DictationAsr.G();
        this.h = G;
        this.f = new yka[G.length];
        for (int i = 0; i < G.length; i++) {
            vl3 L = DictationAsr.L(G[i]);
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
            String r = jm3.r(G[i]);
            yka[] ykaVarArr = this.f;
            String str3 = G[i];
            if (r != null) {
                str = r;
            } else {
                str = str3;
            }
            if (z && L.e > 0) {
                str2 = gl.i0(L.e, false, false);
            } else {
                str2 = null;
            }
            yka ykaVar = new yka(context, str3, str, str2, z2);
            ykaVarArr[i] = ykaVar;
            ykaVar.a0 = new t7a(this, ykaVar, (byte) 8);
            ykaVar.setOnClickListener(new b99(this, ykaVar, (byte) 9));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        yka ykaVar = new yka(context, null, k96.M0(2131745072, null), null, true);
        this.e = ykaVar;
        ykaVar.setOnClickListener(new ik8(this, (byte) 29));
        c0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.i(this.n);
        zm3.j();
        return this.fragmentView;
    }

    public final void d0() {
        yka[] ykaVarArr;
        yka ykaVar = this.e;
        if (ykaVar != null) {
            ykaVar.c();
        }
        for (yka ykaVar2 : this.f) {
            if (ykaVar2 != null) {
                ykaVar2.c();
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
