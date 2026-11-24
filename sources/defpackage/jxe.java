package defpackage;

import android.content.Context;
import android.widget.TextView;
public abstract class jxe {
    public static l66 a(Context context, float f, int i, boolean z, ylb ylbVar) {
        int i2 = cmb.Wc;
        l66 l66Var = new l66(context, null);
        l66Var.setTextSize(1, f);
        anb.X(l66Var, i, ylbVar);
        anb.G(l66Var, i2, ylbVar);
        if (z) {
            l66Var.setTypeface(gm.o());
        }
        return l66Var;
    }

    public static TextView b(Context context, float f, int i, boolean z, ylb ylbVar) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f);
        anb.X(textView, i, ylbVar);
        if (z) {
            textView.setTypeface(gm.o());
        }
        return textView;
    }
}
