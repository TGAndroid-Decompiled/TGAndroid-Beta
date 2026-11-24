package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class kt6 extends s49 {
    public eu6 A;
    public final pt6 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    public kt6(pt6 pt6Var, View view) {
        super(view);
        this.B = pt6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296522);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296524);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296523);
        rt6 rt6Var = pt6Var.x;
        this.z = voe.c(rt6Var.E);
        voe.i(rt6Var.E, progressBar);
    }
}
