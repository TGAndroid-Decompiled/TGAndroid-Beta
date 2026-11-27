package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class p69 extends p79 implements yi5 {
    public final qcc a;
    public final d79 b;
    public final int c;
    public final boolean d;

    public p69(d79 d79Var, qcc qccVar, int i, boolean z) {
        this.b = d79Var;
        this.a = qccVar;
        this.c = i;
        this.d = z;
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        qebVar.b = true;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int b;
        boolean z;
        int L;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i = this.c;
            rect.right = i;
            rect.left = i;
            f89 U = recyclerView.U(view);
            j79 adapter = recyclerView.getAdapter();
            if (U != null && adapter != null && (b = U.b()) != -1) {
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
                        L = hl.L(4.0f);
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
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof d79) {
            ((d79) recyclerView).R0(canvas);
        }
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.R0(canvas);
        canvas.restore();
    }
}
