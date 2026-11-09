package di;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.wp;
public final class r implements c20 {
    public final int f9650a = 1;
    public final int f9651b;
    public final Object f9652c;
    public final View d;
    public final Object f9653e;
    public final Object f9654f;
    public final Object f9655g;
    public final ViewGroup h;
    public final Object f9656i;
    public final Object f9657j;
    public final Object f9658k;
    public final Object f9659l;

    public r(LinearLayout linearLayout, org.telegram.ui.Wallet.z4 z4Var, org.telegram.ui.ActionBar.g6 g6Var, int i7, TextView textView, org.telegram.ui.Wallet.y2[] y2VarArr, ux0 ux0Var, x10 x10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.f9652c = linearLayout;
        this.d = z4Var;
        this.f9653e = g6Var;
        this.f9651b = i7;
        this.f9654f = textView;
        this.f9655g = y2VarArr;
        this.h = ux0Var;
        this.f9656i = x10Var;
        this.f9657j = context;
        this.f9658k = textViewArr;
        this.f9659l = spannableStringArr;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.r.a(java.lang.Object):void");
    }

    public r(long[] jArr, fi.d dVar, wp[] wpVarArr, s0 s0Var, n0 n0Var, int i7, bi.e5 e5Var, bi.e5 e5Var2, bi.e5 e5Var3, s sVar, boolean[] zArr) {
        this.f9652c = jArr;
        this.d = dVar;
        this.f9653e = wpVarArr;
        this.f9654f = s0Var;
        this.f9655g = n0Var;
        this.f9651b = i7;
        this.h = e5Var;
        this.f9656i = e5Var2;
        this.f9657j = e5Var3;
        this.f9658k = sVar;
        this.f9659l = zArr;
    }
}
