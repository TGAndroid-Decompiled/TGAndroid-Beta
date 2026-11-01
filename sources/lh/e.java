package lh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import rf.w;
import s4.m0;
public final class e extends m0 {
    public final w f12013a = new w(2);
    public final p6 f12014b;
    public final g f12015c;

    public e(g gVar, p6 p6Var) {
        this.f12015c = gVar;
        this.f12014b = p6Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f12015c;
        int max = Math.max(0, i0.L(80.0f) + ((int) gVar.Y1.getTranslationY()) + ((int) gVar.P1.f7032f));
        int w02 = t6.w0(t6.f21002h5, this.f12014b);
        w wVar = this.f12013a;
        wVar.b(w02);
        wVar.setBounds(0, max, recyclerView.getWidth(), i0.L(8.0f) + max);
        wVar.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
