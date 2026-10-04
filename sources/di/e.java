package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.q20;
public final class e implements zv0 {
    public final int f8367a;
    public final FrameLayout f8368b;

    public e(q20 q20Var, int i10) {
        this.f8367a = i10;
        this.f8368b = q20Var;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8367a) {
            case 0:
                zl0 zl0Var = (zl0) recyclerView;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this.f8368b);
                return;
            default:
                zl0 zl0Var2 = (zl0) recyclerView;
                gh.d.a(zl0Var2, canvas, rectF, zl0Var2, this.f8368b);
                return;
        }
    }
}
