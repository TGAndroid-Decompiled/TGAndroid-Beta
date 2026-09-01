package hh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.v0;
import lf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class d extends v0 {
    public final b0 f7694a = new b0(2);
    public final g6 f7695b;
    public final f f7696c;

    public d(f fVar, g6 g6Var) {
        this.f7696c = fVar;
        this.f7695b = g6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f7696c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f7702d0.getTranslationY()) + ((int) fVar.U.f50510e));
        int v02 = k6.v0(k6.f21731h5, this.f7695b);
        b0 b0Var = this.f7694a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
