package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class jv6 extends f89 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final kv6 z;

    public jv6(kv6 kv6Var, View view) {
        super(view);
        this.z = kv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296570);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296572);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296571);
        nte.i(kv6Var.r.n, progressBar);
    }
}
