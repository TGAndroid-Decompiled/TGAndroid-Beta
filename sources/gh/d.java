package gh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.u0;
import kf.b0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d extends u0 {
    public final b0 f6821a = new b0(2);
    public final f6 f6822b;
    public final f f6823c;

    public d(f fVar, f6 f6Var) {
        this.f6823c = fVar;
        this.f6822b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f6823c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f6829d0.getTranslationY()) + ((int) fVar.U.e));
        int v02 = j6.v0(j6.f19952h5, this.f6822b);
        b0 b0Var = this.f6821a;
        b0Var.b(v02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        b0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
