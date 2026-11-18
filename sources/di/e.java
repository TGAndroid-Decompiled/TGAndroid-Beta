package di;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.pt0;
public final class e implements pt0, r0.m {
    public final int f8681a;
    public final FrameLayout f8682b;

    public e(int i7, FrameLayout frameLayout) {
        this.f8681a = i7;
        this.f8682b = frameLayout;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        r0.i1 i1Var = l1Var.f56258a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = i1Var.f(527);
            rect.set(f10.f15892a, f10.f15893b, f10.f15894c, f10.d);
        } else {
            rect.set(i1Var.i().f15892a, i1Var.i().f15893b, i1Var.i().f15894c, i1Var.i().d);
        }
        int i7 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f24116n;
        FrameLayout frameLayout = this.f8682b;
        frameLayout.setPadding(i7, i10, i11, i12);
        frameLayout.requestLayout();
        return l1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f8681a) {
            case 0:
                ck0 ck0Var = (ck0) recyclerView;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this.f8682b);
                return;
            case 1:
                ck0 ck0Var2 = (ck0) recyclerView;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, this.f8682b);
                return;
            default:
                ck0 ck0Var3 = (ck0) recyclerView;
                ih.d.a(ck0Var3, canvas, rectF, ck0Var3, this.f8682b);
                return;
        }
    }
}
