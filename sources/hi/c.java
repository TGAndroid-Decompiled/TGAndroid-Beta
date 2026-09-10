package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.hl0;
public final class c implements View.OnClickListener {
    public final int f9478a;
    public final Object f9479b;
    public final Object f9480c;
    public final Object d;
    public final Object e;
    public final Object f9481f;

    public c(Context context, String str, String[] strArr, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        this.f9478a = 2;
        this.f9479b = context;
        this.f9480c = str;
        this.e = strArr;
        this.d = f6Var;
        this.f9481f = h3Var;
    }

    @Override
    public final void onClick(android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.c.onClick(android.view.View):void");
    }

    public c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f9478a = i10;
        this.f9479b = obj;
        this.f9480c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f9481f = obj5;
    }

    public c(org.telegram.ui.ActionBar.h3 h3Var, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, hl0 hl0Var) {
        this.f9478a = 11;
        this.f9481f = h3Var;
        this.f9479b = frameLayout;
        this.f9480c = arrayList;
        this.d = iArr;
        this.e = hl0Var;
    }
}
