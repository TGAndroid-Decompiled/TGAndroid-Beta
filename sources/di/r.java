package di;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.wp;
public final class r implements c20 {
    public final int f9663a = 1;
    public final int f9664b;
    public final Object f9665c;
    public final View d;
    public final Object f9666e;
    public final Object f9667f;
    public final Object f9668g;
    public final ViewGroup h;
    public final Object f9669i;
    public final Object f9670j;
    public final Object f9671k;
    public final Object f9672l;

    public r(LinearLayout linearLayout, org.telegram.ui.Wallet.a5 a5Var, org.telegram.ui.ActionBar.f6 f6Var, int i7, TextView textView, org.telegram.ui.Wallet.z2[] z2VarArr, tx0 tx0Var, x10 x10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.f9665c = linearLayout;
        this.d = a5Var;
        this.f9666e = f6Var;
        this.f9664b = i7;
        this.f9667f = textView;
        this.f9668g = z2VarArr;
        this.h = tx0Var;
        this.f9669i = x10Var;
        this.f9670j = context;
        this.f9671k = textViewArr;
        this.f9672l = spannableStringArr;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.r.a(java.lang.Object):void");
    }

    public r(long[] jArr, fi.d dVar, wp[] wpVarArr, s0 s0Var, n0 n0Var, int i7, bi.e5 e5Var, bi.e5 e5Var2, bi.e5 e5Var3, s sVar, boolean[] zArr) {
        this.f9665c = jArr;
        this.d = dVar;
        this.f9666e = wpVarArr;
        this.f9667f = s0Var;
        this.f9668g = n0Var;
        this.f9664b = i7;
        this.h = e5Var;
        this.f9669i = e5Var2;
        this.f9670j = e5Var3;
        this.f9671k = sVar;
        this.f9672l = zArr;
    }
}
