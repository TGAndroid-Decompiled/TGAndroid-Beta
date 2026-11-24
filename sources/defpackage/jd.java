package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class jd implements no7, cha {
    public final byte a;
    public final FrameLayout b;

    public jd(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        sxc sxcVar = vxcVar.a;
        if (i >= 30) {
            io5 f = sxcVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(sxcVar.i().a, sxcVar.i().b, sxcVar.i().c, sxcVar.i().d);
        }
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + gl.n);
        frameLayout.requestLayout();
        return vxcVar;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                o39 o39Var = (o39) recyclerView;
                tk0.a(o39Var, canvas, rectF, o39Var, frameLayout);
                return;
            default:
                o39 o39Var2 = (o39) recyclerView;
                tk0.a(o39Var2, canvas, rectF, o39Var2, frameLayout);
                return;
        }
    }
}
