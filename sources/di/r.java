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
    public final int f9655a = 1;
    public final int f9656b;
    public final Object f9657c;
    public final View d;
    public final Object f9658e;
    public final Object f9659f;
    public final Object f9660g;
    public final ViewGroup h;
    public final Object f9661i;
    public final Object f9662j;
    public final Object f9663k;
    public final Object f9664l;

    public r(LinearLayout linearLayout, org.telegram.ui.Wallet.c5 c5Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, TextView textView, org.telegram.ui.Wallet.y2[] y2VarArr, tx0 tx0Var, x10 x10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.f9657c = linearLayout;
        this.d = c5Var;
        this.f9658e = h6Var;
        this.f9656b = i7;
        this.f9659f = textView;
        this.f9660g = y2VarArr;
        this.h = tx0Var;
        this.f9661i = x10Var;
        this.f9662j = context;
        this.f9663k = textViewArr;
        this.f9664l = spannableStringArr;
    }

    @Override
    public final void a(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: di.r.a(java.lang.Object):void");
    }

    public r(long[] jArr, fi.d dVar, wp[] wpVarArr, s0 s0Var, n0 n0Var, int i7, bi.e5 e5Var, bi.e5 e5Var2, bi.e5 e5Var3, s sVar, boolean[] zArr) {
        this.f9657c = jArr;
        this.d = dVar;
        this.f9658e = wpVarArr;
        this.f9659f = s0Var;
        this.f9660g = n0Var;
        this.f9656b = i7;
        this.h = e5Var;
        this.f9661i = e5Var2;
        this.f9662j = e5Var3;
        this.f9663k = sVar;
        this.f9664l = zArr;
    }
}
