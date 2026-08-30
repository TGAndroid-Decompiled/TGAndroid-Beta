package gh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.u0;
import lf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d extends u0 {
    public final b0 f6834a = new b0(2);
    public final f6 f6835b;
    public final f f6836c;

    public d(f fVar, f6 f6Var) {
        this.f6836c = fVar;
        this.f6835b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f6836c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f6842d0.getTranslationY()) + ((int) fVar.U.e));
        int v02 = j6.v0(j6.f19977h5, this.f6835b);
        b0 b0Var = this.f6834a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
