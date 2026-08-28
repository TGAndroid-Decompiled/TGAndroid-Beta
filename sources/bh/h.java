package bh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import f2.y0;
import ff.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class h extends y0 {
    public final c0 f2030a = new c0(2);
    public final b6 f2031b;
    public final j f2032c;

    public h(j jVar, b6 b6Var) {
        this.f2032c = jVar;
        this.f2031b = b6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        j jVar = this.f2032c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) jVar.f2037c0.getTranslationY()) + ((int) jVar.T.f47780e));
        int v02 = f6.v0(f6.f23072h5, this.f2031b);
        c0 c0Var = this.f2030a;
        c0Var.b(v02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        c0Var.draw(canvas);
        jVar.P();
        jVar.Q();
    }
}
