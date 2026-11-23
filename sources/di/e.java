package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.rt0;
public final class e implements rt0, r0.m {
    public final int f8676a;
    public final FrameLayout f8677b;

    public e(int i7, FrameLayout frameLayout) {
        this.f8676a = i7;
        this.f8677b = frameLayout;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8676a) {
            case 0:
                ek0 ek0Var = (ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.f8677b);
                return;
            case 1:
                ek0 ek0Var2 = (ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.f8677b);
                return;
            default:
                ek0 ek0Var3 = (ek0) recyclerView;
                ih.d.a(ek0Var3, canvas, rectF, ek0Var3, this.f8677b);
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.f56381a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = i1Var.f(527);
            rect.set(f10.f15978a, f10.f15979b, f10.f15980c, f10.d);
        } else {
            rect.set(i1Var.i().f15978a, i1Var.i().f15979b, i1Var.i().f15980c, i1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f24221n;
        FrameLayout frameLayout = this.f8677b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return l1Var;
    }
}
