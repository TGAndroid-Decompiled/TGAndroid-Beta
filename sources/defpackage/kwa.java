package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
public final class kwa implements eja {
    public final byte a;
    public final g15 b;

    public kwa(g15 g15Var, byte b) {
        this.a = b;
        this.b = g15Var;
    }

    @Override
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        g15 g15Var = this.b;
        switch (b) {
            case 0:
                r59 r59Var = (r59) recyclerView;
                tl0.a(r59Var, canvas, rectF, r59Var, g15Var);
                return;
            default:
                r59 r59Var2 = (r59) recyclerView;
                tl0.a(r59Var2, canvas, rectF, r59Var2, g15Var);
                return;
        }
    }
}
