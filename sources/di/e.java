package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.zl0;
public final class e implements aw0 {
    public final int f8367a;
    public final FrameLayout f8368b;

    public e(int i10, FrameLayout frameLayout) {
        this.f8367a = i10;
        this.f8368b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8367a) {
            case 0:
                zl0 zl0Var = (zl0) recyclerView;
                gh.d.a(zl0Var, canvas, rectF, zl0Var, this.f8368b);
                return;
            case 1:
                zl0 zl0Var2 = (zl0) recyclerView;
                gh.d.a(zl0Var2, canvas, rectF, zl0Var2, this.f8368b);
                return;
            default:
                zl0 zl0Var3 = (zl0) recyclerView;
                gh.d.a(zl0Var3, canvas, rectF, zl0Var3, this.f8368b);
                return;
        }
    }
}
