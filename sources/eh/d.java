package eh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.v0;
import jf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class d extends v0 {
    public final b0 f6214a = new b0(2);
    public final c6 f6215b;
    public final f f6216c;

    public d(f fVar, c6 c6Var) {
        this.f6216c = fVar;
        this.f6215b = c6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f6216c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f6221c0.getTranslationY()) + ((int) fVar.T.f49510e));
        int v02 = g6.v0(g6.f23133h5, this.f6215b);
        b0 b0Var = this.f6214a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
