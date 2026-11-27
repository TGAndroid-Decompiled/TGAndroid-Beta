package defpackage;

import android.content.Context;
import android.widget.TextView;
public abstract class zze {
    public static p66 a(Context context, float f, int i, boolean z, vnb vnbVar) {
        int i2 = aob.Xc;
        p66 p66Var = new p66(context, null);
        p66Var.setTextSize(1, f);
        yob.X(p66Var, i, vnbVar);
        yob.G(p66Var, i2, vnbVar);
        if (z) {
            p66Var.setTypeface(hl.o());
        }
        return p66Var;
    }

    public static TextView b(Context context, float f, int i, boolean z, vnb vnbVar) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f);
        yob.X(textView, i, vnbVar);
        if (z) {
            textView.setTypeface(hl.o());
        }
        return textView;
    }
}
