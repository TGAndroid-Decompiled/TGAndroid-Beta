package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class pv6 extends f89 {
    public jw6 A;
    public final uv6 B;
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final float z;

    public pv6(uv6 uv6Var, View view) {
        super(view);
        this.B = uv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296522);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296524);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296523);
        wv6 wv6Var = uv6Var.x;
        this.z = nte.c(wv6Var.E);
        nte.i(wv6Var.E, progressBar);
    }
}
