package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class kd implements nr7, vka {
    public final byte a;
    public final FrameLayout b;

    public kd(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        Rect rect = new Rect();
        int i = Build.VERSION.SDK_INT;
        i2d i2dVar = l2dVar.a;
        if (i >= 30) {
            mq5 f = i2dVar.f(527);
            rect.set(f.a, f.b, f.c, f.d);
        } else {
            rect.set(i2dVar.i().a, i2dVar.i().b, i2dVar.i().c, i2dVar.i().d);
        }
        FrameLayout frameLayout = this.b;
        frameLayout.setPadding(rect.left, rect.top, rect.right, rect.bottom + hl.n);
        frameLayout.requestLayout();
        return l2dVar;
    }

    @Override
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 1:
                d79 d79Var = (d79) recyclerView;
                uk0.a(d79Var, canvas, rectF, d79Var, frameLayout);
                return;
            default:
                d79 d79Var2 = (d79) recyclerView;
                uk0.a(d79Var2, canvas, rectF, d79Var2, frameLayout);
                return;
        }
    }
}
