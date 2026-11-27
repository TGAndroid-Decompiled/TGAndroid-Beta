package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class t6 implements View.OnClickListener {
    public final byte a;
    public final s7 b;

    public t6(s7 s7Var, byte b) {
        this.a = b;
        this.b = s7Var;
    }

    @Override
    public final void onClick(View view) {
        o7 o7Var;
        n8 n8Var;
        byte b = this.a;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = s7Var.h0;
                if (s7Var.e.length() != 0) {
                    s7Var.e.setText("");
                } else if (s7Var.s()) {
                    s7Var.e.m();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (s7Var.I != null && ((ph4) arrayList.get(i)).h) {
                            s7Var.I.j((ph4) arrayList.get(i));
                        }
                    }
                    s7Var.n();
                } else {
                    TextView textView = s7Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((o7Var = s7Var.I) == null || o7Var.a())) {
                        s7Var.h.setVisibility(8);
                        o7 o7Var2 = s7Var.I;
                        if (o7Var2 != null) {
                            o7Var2.f();
                        }
                    }
                }
                s7Var.e.requestFocus();
                hl.E3(s7Var.e);
                return;
            case 1:
                if (s7Var.y()) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        s7Var.r();
                    } else {
                        return;
                    }
                }
                s6 s6Var = s7Var.c;
                if (s6Var != null) {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                n7 n7Var = s7Var.Q;
                if (n7Var != null) {
                    n7Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                if (s7Var.y()) {
                    if (!s7Var.U) {
                        s7Var.U = true;
                        if (!s7Var.S && (n8Var = s7Var.d) != null) {
                            n8Var.setAnimationStyle(2131755191);
                        }
                        s7Var.r();
                    } else {
                        return;
                    }
                }
                s6 s6Var2 = s7Var.c;
                if (s6Var2 != null) {
                    s6Var2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                n7 n7Var2 = s7Var.Q;
                if (n7Var2 != null) {
                    n7Var2.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                s6 s6Var3 = s7Var.c;
                if (s6Var3 != null) {
                    s6Var3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                n7 n7Var3 = s7Var.Q;
                if (n7Var3 != null) {
                    n7Var3.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
