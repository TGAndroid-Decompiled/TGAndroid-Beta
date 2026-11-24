package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
public final class qq8 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        wjb wjbVar;
        l46 l46Var = (l46) view;
        l46Var.setGravity(c4cVar.A);
        Object obj = c4cVar.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = c4cVar.H;
            if (obj2 instanceof wjb) {
                wjbVar = (wjb) obj2;
            } else {
                wjbVar = null;
            }
            zkb.X(l46Var, intValue, wjbVar);
        } else {
            ykb ykbVar = zkb.a;
            l46Var.setTag(2131296711, null);
            l46Var.setTextColor((int) c4cVar.C);
        }
        l46Var.setTextSize(1, c4cVar.B);
        if (c4cVar.r) {
            typeface = gl.o();
        }
        l46Var.setTypeface(typeface);
        int i = c4cVar.i;
        l46Var.setPadding(i, 0, i, c4cVar.k);
        l46Var.setText(c4cVar.m);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new s11(context, null, (byte) 7);
    }
}
