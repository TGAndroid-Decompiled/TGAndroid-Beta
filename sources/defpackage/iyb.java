package defpackage;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class iyb extends k69 {
    public final int a;
    public final long b;
    public final oyb c;

    public iyb(oyb oybVar, int i, long j) {
        this.c = oybVar;
        this.a = i;
        this.b = j;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        EditText editText = this.c.w;
        if (i == 1 && editText.hasFocus()) {
            gm.t1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        oyb oybVar = this.c;
        oybVar.o();
        u46 u46Var = (u46) recyclerView.getLayoutManager();
        if (u46Var != null && u46Var.M0() >= oybVar.s.c.size() - 3) {
            if (oybVar.i()) {
                oybVar.j();
                return;
            }
            boolean z = oybVar.d;
            int i3 = this.a;
            if (z) {
                oc7.r1(i3).E1().g(false);
                return;
            }
            qwb qwbVar = oc7.r1(i3).g4;
            long j = -this.b;
            if (!qwbVar.e(j)) {
                qwbVar.o(j);
            }
        }
    }
}
