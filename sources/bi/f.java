package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mm0;
public final class f implements kw0 {
    public final int f4588a;
    public final FrameLayout f4589b;

    public f(int i10, FrameLayout frameLayout) {
        this.f4588a = i10;
        this.f4589b = frameLayout;
    }

    @Override
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f4588a) {
            case 0:
                mm0 mm0Var = (mm0) recyclerView;
                ih.d.a(mm0Var, canvas, rectF, mm0Var, this.f4589b);
                return;
            case 1:
                mm0 mm0Var2 = (mm0) recyclerView;
                ih.d.a(mm0Var2, canvas, rectF, mm0Var2, this.f4589b);
                return;
            default:
                mm0 mm0Var3 = (mm0) recyclerView;
                ih.d.a(mm0Var3, canvas, rectF, mm0Var3, this.f4589b);
                return;
        }
    }
}
