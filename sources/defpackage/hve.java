package defpackage;

import android.content.Context;
import android.widget.TextView;
public abstract class hve {
    public static l46 a(Context context, float f, int i, boolean z, wjb wjbVar) {
        int i2 = bkb.Wc;
        l46 l46Var = new l46(context, null);
        l46Var.setTextSize(1, f);
        zkb.X(l46Var, i, wjbVar);
        zkb.G(l46Var, i2, wjbVar);
        if (z) {
            l46Var.setTypeface(gl.o());
        }
        return l46Var;
    }

    public static TextView b(Context context, float f, int i, boolean z, wjb wjbVar) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f);
        zkb.X(textView, i, wjbVar);
        if (z) {
            textView.setTypeface(gl.o());
        }
        return textView;
    }
}
