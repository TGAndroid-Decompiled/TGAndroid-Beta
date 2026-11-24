package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public final class et6 extends s49 {
    public final View v;
    public final ImageView w;
    public final ProgressBar x;
    public final TextView y;
    public final ft6 z;

    public et6(ft6 ft6Var, View view) {
        super(view);
        this.z = ft6Var;
        this.v = view;
        this.w = (ImageView) view.findViewById(2131296570);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296572);
        this.x = progressBar;
        this.y = (TextView) view.findViewById(2131296571);
        voe.i(ft6Var.r.n, progressBar);
    }
}
