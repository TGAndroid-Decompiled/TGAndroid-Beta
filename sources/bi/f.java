package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.pj0;
public final class f implements gt0, r0.m {
    public final int f3839a;
    public final FrameLayout f3840b;

    public f(int i7, FrameLayout frameLayout) {
        this.f3839a = i7;
        this.f3840b = frameLayout;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.f54202a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = h1Var.f(527);
            rect.set(f10.f15120a, f10.f15121b, f10.f15122c, f10.d);
        } else {
            rect.set(h1Var.i().f15120a, h1Var.i().f15121b, h1Var.i().f15122c, h1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f22558n;
        FrameLayout frameLayout = this.f3840b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return k1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f3839a) {
            case 0:
                pj0 pj0Var = (pj0) recyclerView;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, this.f3840b);
                return;
            case 1:
                pj0 pj0Var2 = (pj0) recyclerView;
                ih.d.a(pj0Var2, canvas, rectF, pj0Var2, this.f3840b);
                return;
            default:
                pj0 pj0Var3 = (pj0) recyclerView;
                ih.d.a(pj0Var3, canvas, rectF, pj0Var3, this.f3840b);
                return;
        }
    }
}
