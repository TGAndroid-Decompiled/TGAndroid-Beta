package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class kv6 extends u69 {
    public ew6 A;
    public final pv6 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    public kv6(pv6 pv6Var, View view) {
        super(view);
        this.B = pv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296522);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296524);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296523);
        rv6 rv6Var = pv6Var.x;
        this.z = yqe.c(rv6Var.E);
        yqe.i(rv6Var.E, progressBar);
    }
}
