package ci;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.tj0;
public final class f implements ft0, r0.m {
    public final int f5058a;
    public final FrameLayout f5059b;

    public f(int i3, FrameLayout frameLayout) {
        this.f5058a = i3;
        this.f5059b = frameLayout;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.f54026a;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            i0.b f10 = h1Var.f(527);
            rect.set(f10.f14495a, f10.f14496b, f10.f14497c, f10.d);
        } else {
            rect.set(h1Var.i().f14495a, h1Var.i().f14496b, h1Var.i().f14497c, h1Var.i().d);
        }
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom + org.telegram.messenger.g0.f22603n;
        FrameLayout frameLayout = this.f5059b;
        frameLayout.setPadding(i3, i10, i11, i12);
        frameLayout.requestLayout();
        return k1Var;
    }

    @Override
    public void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.f5058a) {
            case 0:
                tj0 tj0Var = (tj0) recyclerView;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, this.f5059b);
                return;
            case 1:
                tj0 tj0Var2 = (tj0) recyclerView;
                jh.d.a(tj0Var2, canvas, rectF, tj0Var2, this.f5059b);
                return;
            default:
                tj0 tj0Var3 = (tj0) recyclerView;
                jh.d.a(tj0Var3, canvas, rectF, tj0Var3, this.f5059b);
                return;
        }
    }
}
