package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.qj0;
public final class f implements it0, r0.m {
    public final int f3839a;
    public final FrameLayout f3840b;

    public f(int i7, FrameLayout frameLayout) {
        this.f3839a = i7;
        this.f3840b = frameLayout;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.f54214a;
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
                qj0 qj0Var = (qj0) recyclerView;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, this.f3840b);
                return;
            case 1:
                qj0 qj0Var2 = (qj0) recyclerView;
                ih.d.a(qj0Var2, canvas, rectF, qj0Var2, this.f3840b);
                return;
            default:
                qj0 qj0Var3 = (qj0) recyclerView;
                ih.d.a(qj0Var3, canvas, rectF, qj0Var3, this.f3840b);
                return;
        }
    }
}
