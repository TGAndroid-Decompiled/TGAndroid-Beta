package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.st0;
public final class e implements st0, r0.m {
    public final int f8715a;
    public final FrameLayout f8716b;

    public e(int i7, FrameLayout frameLayout) {
        this.f8715a = i7;
        this.f8716b = frameLayout;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.f56303a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = i1Var.f(527);
            rect.set(f10.f15917a, f10.f15918b, f10.f15919c, f10.d);
        } else {
            rect.set(i1Var.i().f15917a, i1Var.i().f15918b, i1Var.i().f15919c, i1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f24041n;
        FrameLayout frameLayout = this.f8716b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return l1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8715a) {
            case 0:
                ek0 ek0Var = (ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.f8716b);
                return;
            case 1:
                ek0 ek0Var2 = (ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.f8716b);
                return;
            default:
                ek0 ek0Var3 = (ek0) recyclerView;
                ih.d.a(ek0Var3, canvas, rectF, ek0Var3, this.f8716b);
                return;
        }
    }
}
