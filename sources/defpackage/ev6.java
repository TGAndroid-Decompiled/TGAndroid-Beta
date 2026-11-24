package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class ev6 extends u69 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final fv6 z;

    public ev6(fv6 fv6Var, View view) {
        super(view);
        this.z = fv6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296570);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296572);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296571);
        yqe.i(fv6Var.r.n, progressBar);
    }
}
