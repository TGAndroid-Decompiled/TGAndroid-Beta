package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class g09 implements p8c {
    public final byte a;
    public final t09 b;

    public g09(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override
    public final void a(Object obj) {
        float f;
        byte b = this.a;
        t09 t09Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = t09Var.d;
                t09Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof r09)) {
                    ((r09) view).f(((k09) arrayList.get(R)).c, true);
                    return;
                }
                return;
            default:
                if (view instanceof r09) {
                    r09 r09Var = (r09) view;
                    q09 q09Var = r09Var.b;
                    r09Var.O = false;
                    float f2 = 1.0f;
                    q09Var.setAlpha(1.0f);
                    if (t09Var.O0) {
                        float f3 = r09Var.J;
                        if (r09Var.x) {
                            f = 0.76f;
                        } else {
                            f = 1.0f;
                        }
                        q09Var.setScaleX(f3 * f);
                        float f4 = r09Var.J;
                        if (r09Var.x) {
                            f2 = 0.76f;
                        }
                        q09Var.setScaleY(f4 * f2);
                        return;
                    }
                    r09Var.c();
                    return;
                }
                return;
        }
    }
}
