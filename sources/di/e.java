package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.uj0;
public final class e implements ht0, r0.m {
    public final int f8430a;
    public final FrameLayout f8431b;

    public e(int i7, FrameLayout frameLayout) {
        this.f8430a = i7;
        this.f8431b = frameLayout;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.f55682a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.c f10 = h1Var.f(527);
            rect.set(f10.f15574a, f10.f15575b, f10.f15576c, f10.d);
        } else {
            rect.set(h1Var.i().f15574a, h1Var.i().f15575b, h1Var.i().f15576c, h1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f23604n;
        FrameLayout frameLayout = this.f8431b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return k1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8430a) {
            case 0:
                uj0 uj0Var = (uj0) recyclerView;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, this.f8431b);
                return;
            case 1:
                uj0 uj0Var2 = (uj0) recyclerView;
                ih.d.a(uj0Var2, canvas, rectF, uj0Var2, this.f8431b);
                return;
            default:
                uj0 uj0Var3 = (uj0) recyclerView;
                ih.d.a(uj0Var3, canvas, rectF, uj0Var3, this.f8431b);
                return;
        }
    }
}
