package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
public final class gua implements cha {
    public final byte a;
    public final hz4 b;

    public gua(hz4 hz4Var, byte b) {
        this.a = b;
        this.b = hz4Var;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        byte b = this.a;
        hz4 hz4Var = this.b;
        switch (b) {
            case 0:
                o39 o39Var = (o39) recyclerView;
                tk0.a(o39Var, canvas, rectF, o39Var, hz4Var);
                return;
            default:
                o39 o39Var2 = (o39) recyclerView;
                tk0.a(o39Var2, canvas, rectF, o39Var2, hz4Var);
                return;
        }
    }
}
