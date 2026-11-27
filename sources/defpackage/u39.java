package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class u39 implements pcc {
    public final byte a;
    public final i49 b;

    public u39(i49 i49Var, byte b) {
        this.a = b;
        this.b = i49Var;
    }

    @Override
    public final void a(Object obj) {
        float f;
        byte b = this.a;
        i49 i49Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = i49Var.d;
                i49Var.b.getClass();
                int S = RecyclerView.S(view);
                if (S >= 0 && S < arrayList.size() && (view instanceof g49)) {
                    ((g49) view).f(((y39) arrayList.get(S)).c, true);
                    return;
                }
                return;
            default:
                if (view instanceof g49) {
                    g49 g49Var = (g49) view;
                    f49 f49Var = g49Var.b;
                    g49Var.O = false;
                    float f2 = 1.0f;
                    f49Var.setAlpha(1.0f);
                    if (i49Var.O0) {
                        float f3 = g49Var.J;
                        if (g49Var.x) {
                            f = 0.76f;
                        } else {
                            f = 1.0f;
                        }
                        f49Var.setScaleX(f3 * f);
                        float f4 = g49Var.J;
                        if (g49Var.x) {
                            f2 = 0.76f;
                        }
                        f49Var.setScaleY(f4 * f2);
                        return;
                    }
                    g49Var.c();
                    return;
                }
                return;
        }
    }
}
