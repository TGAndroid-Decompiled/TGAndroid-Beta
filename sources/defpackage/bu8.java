package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
public final class bu8 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        vnb vnbVar;
        p66 p66Var = (p66) view;
        p66Var.setGravity(b8cVar.A);
        Object obj = b8cVar.I;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b8cVar.H;
            if (obj2 instanceof vnb) {
                vnbVar = (vnb) obj2;
            } else {
                vnbVar = null;
            }
            yob.X(p66Var, intValue, vnbVar);
        } else {
            xob xobVar = yob.a;
            p66Var.setTag(2131296711, null);
            p66Var.setTextColor((int) b8cVar.C);
        }
        p66Var.setTextSize(1, b8cVar.B);
        if (b8cVar.r) {
            typeface = hl.o();
        }
        p66Var.setTypeface(typeface);
        int i = b8cVar.i;
        p66Var.setPadding(i, 0, i, b8cVar.k);
        p66Var.setText(b8cVar.m);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new b21(context, null, (byte) 8);
    }
}
