package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class a39 extends c49 implements wg5 {
    public final q8c a;
    public final o39 b;
    public final int c;
    public final boolean d;

    public a39(o39 o39Var, q8c q8cVar, int i, boolean z) {
        this.b = o39Var;
        this.a = q8cVar;
        this.c = i;
        this.d = z;
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        tabVar.b = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int b;
        boolean z;
        int L;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i = this.c;
            rect.right = i;
            rect.left = i;
            s49 T = recyclerView.T(view);
            w39 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b = T.b()) != -1) {
                boolean z2 = false;
                if (b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (b == adapter.b() - 1) {
                    z2 = true;
                }
                if (z) {
                    if (this.d) {
                        L = i;
                    } else {
                        L = gl.L(4.0f);
                    }
                    rect.top = L;
                }
                if (z2) {
                    rect.bottom = i;
                }
            }
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof o39) {
            ((o39) recyclerView).Q0(canvas);
        }
    }
}
