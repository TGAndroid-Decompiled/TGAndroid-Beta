package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
public final class ss8 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ylb ylbVar;
        l66 l66Var = (l66) view;
        l66Var.setGravity(c6cVar.A);
        Object obj = c6cVar.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = c6cVar.H;
            if (obj2 instanceof ylb) {
                ylbVar = (ylb) obj2;
            } else {
                ylbVar = null;
            }
            anb.X(l66Var, intValue, ylbVar);
        } else {
            zmb zmbVar = anb.a;
            l66Var.setTag(2131296711, null);
            l66Var.setTextColor((int) c6cVar.C);
        }
        l66Var.setTextSize(1, c6cVar.B);
        if (c6cVar.r) {
            typeface = gm.o();
        }
        l66Var.setTypeface(typeface);
        int i = c6cVar.i;
        l66Var.setPadding(i, 0, i, c6cVar.k);
        l66Var.setText(c6cVar.m);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new a31(context, null, (byte) 7);
    }
}
