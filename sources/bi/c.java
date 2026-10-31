package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.gj0;
public final class c implements View.OnClickListener {
    public final int f2877a;
    public final Object f2878b;
    public final Object f2879c;
    public final Object d;
    public final Object e;
    public final Object f2880f;

    public c(Context context, String str, String[] strArr, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f2877a = 2;
        this.f2878b = context;
        this.f2879c = str;
        this.e = strArr;
        this.d = p6Var;
        this.f2880f = z2Var;
    }

    @Override
    public final void onClick(android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c.onClick(android.view.View):void");
    }

    public c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2877a = i10;
        this.f2878b = obj;
        this.f2879c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f2880f = obj5;
    }

    public c(org.telegram.ui.ActionBar.z2 z2Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, gj0 gj0Var) {
        this.f2877a = 11;
        this.f2880f = z2Var;
        this.f2878b = frameLayout;
        this.f2879c = arrayList;
        this.d = iArr;
        this.e = gj0Var;
    }
}
