package defpackage;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class fwb extends i49 {
    public final int a;
    public final long b;
    public final lwb c;

    public fwb(lwb lwbVar, int i, long j) {
        this.c = lwbVar;
        this.a = i;
        this.b = j;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        EditText editText = this.c.w;
        if (i == 1 && editText.hasFocus()) {
            gl.t1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        lwb lwbVar = this.c;
        lwbVar.o();
        t26 t26Var = (t26) recyclerView.getLayoutManager();
        if (t26Var != null && t26Var.M0() >= lwbVar.s.c.size() - 3) {
            if (lwbVar.i()) {
                lwbVar.j();
                return;
            }
            boolean z = lwbVar.d;
            int i3 = this.a;
            if (z) {
                na7.q1(i3).D1().g(false);
                return;
            }
            pub pubVar = na7.q1(i3).g4;
            long j = -this.b;
            if (!pubVar.e(j)) {
                pubVar.o(j);
            }
        }
    }
}
