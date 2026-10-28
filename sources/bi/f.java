package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.nm0;
public final class f implements lw0 {
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
                nm0 nm0Var = (nm0) recyclerView;
                ih.d.a(nm0Var, canvas, rectF, nm0Var, this.f4589b);
                return;
            case 1:
                nm0 nm0Var2 = (nm0) recyclerView;
                ih.d.a(nm0Var2, canvas, rectF, nm0Var2, this.f4589b);
                return;
            default:
                nm0 nm0Var3 = (nm0) recyclerView;
                ih.d.a(nm0Var3, canvas, rectF, nm0Var3, this.f4589b);
                return;
        }
    }
}
