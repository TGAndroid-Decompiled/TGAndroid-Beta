package ch;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.w0;
import gf.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class f extends w0 {

    public final c0 f2911a = new c0(2);

    public final c6 f2912b;

    public final h f2913c;

    public f(h hVar, c6 c6Var) {
        this.f2913c = hVar;
        this.f2912b = c6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        h hVar = this.f2913c;
        int iMax = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) hVar.f2918c0.getTranslationY()) + ((int) hVar.T.f48502e));
        int iV0 = g6.v0(g6.f23124h5, this.f2912b);
        c0 c0Var = this.f2911a;
        c0Var.b(iV0);
        c0Var.setBounds(0, iMax, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + iMax);
        c0Var.draw(canvas);
        hVar.Q();
        hVar.R();
    }
}
