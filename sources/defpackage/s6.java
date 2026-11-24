package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class s6 implements View.OnClickListener {
    public final byte a;
    public final r7 b;

    public s6(r7 r7Var, byte b) {
        this.a = b;
        this.b = r7Var;
    }

    @Override
    public final void onClick(View view) {
        n7 n7Var;
        m8 m8Var;
        byte b = this.a;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = r7Var.h0;
                if (r7Var.e.length() != 0) {
                    r7Var.e.setText("");
                } else if (r7Var.s()) {
                    r7Var.e.m();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (r7Var.I != null && ((rf4) arrayList.get(i)).h) {
                            r7Var.I.j((rf4) arrayList.get(i));
                        }
                    }
                    r7Var.n();
                } else {
                    TextView textView = r7Var.h;
                    if (textView != null && textView.getVisibility() == 0 && ((n7Var = r7Var.I) == null || n7Var.a())) {
                        r7Var.h.setVisibility(8);
                        n7 n7Var2 = r7Var.I;
                        if (n7Var2 != null) {
                            n7Var2.f();
                        }
                    }
                }
                r7Var.e.requestFocus();
                gl.E3(r7Var.e);
                return;
            case 1:
                if (r7Var.y()) {
                    if (!r7Var.U) {
                        r7Var.U = true;
                        r7Var.r();
                    } else {
                        return;
                    }
                }
                r6 r6Var = r7Var.c;
                if (r6Var != null) {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m7 m7Var = r7Var.Q;
                if (m7Var != null) {
                    m7Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 2:
                r6 r6Var2 = r7Var.c;
                if (r6Var2 != null) {
                    r6Var2.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m7 m7Var2 = r7Var.Q;
                if (m7Var2 != null) {
                    m7Var2.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            default:
                if (r7Var.y()) {
                    if (!r7Var.U) {
                        r7Var.U = true;
                        if (!r7Var.S && (m8Var = r7Var.d) != null) {
                            m8Var.setAnimationStyle(2131755191);
                        }
                        r7Var.r();
                    } else {
                        return;
                    }
                }
                r6 r6Var3 = r7Var.c;
                if (r6Var3 != null) {
                    r6Var3.o(((Integer) view.getTag()).intValue());
                    return;
                }
                m7 m7Var3 = r7Var.Q;
                if (m7Var3 != null) {
                    m7Var3.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
        }
    }
}
