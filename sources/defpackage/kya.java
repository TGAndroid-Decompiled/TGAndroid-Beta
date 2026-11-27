package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
public final class kya implements vka {
    public final byte a;
    public final l15 b;

    public kya(l15 l15Var, byte b) {
        this.a = b;
        this.b = l15Var;
    }

    @Override
    public final void c(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        l15 l15Var = this.b;
        switch (b) {
            case 0:
                d79 d79Var = (d79) recyclerView;
                uk0.a(d79Var, canvas, rectF, d79Var, l15Var);
                return;
            default:
                d79 d79Var2 = (d79) recyclerView;
                uk0.a(d79Var2, canvas, rectF, d79Var2, l15Var);
                return;
        }
    }
}
