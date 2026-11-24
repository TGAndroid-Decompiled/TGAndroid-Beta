package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class h29 implements qac {
    public final byte a;
    public final v29 b;

    public h29(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override
    public final void a(Object obj) {
        float f;
        byte b = this.a;
        v29 v29Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                ArrayList arrayList = v29Var.d;
                v29Var.b.getClass();
                int R = RecyclerView.R(view);
                if (R >= 0 && R < arrayList.size() && (view instanceof t29)) {
                    ((t29) view).f(((l29) arrayList.get(R)).c, true);
                    return;
                }
                return;
            default:
                if (view instanceof t29) {
                    t29 t29Var = (t29) view;
                    s29 s29Var = t29Var.b;
                    t29Var.O = false;
                    float f2 = 1.0f;
                    s29Var.setAlpha(1.0f);
                    if (v29Var.O0) {
                        float f3 = t29Var.J;
                        if (t29Var.x) {
                            f = 0.76f;
                        } else {
                            f = 1.0f;
                        }
                        s29Var.setScaleX(f3 * f);
                        float f4 = t29Var.J;
                        if (t29Var.x) {
                            f2 = 0.76f;
                        }
                        s29Var.setScaleY(f4 * f2);
                        return;
                    }
                    t29Var.c();
                    return;
                }
                return;
        }
    }
}
