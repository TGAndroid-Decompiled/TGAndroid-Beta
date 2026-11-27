package defpackage;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
public final class h0c extends v79 {
    public final int a;
    public final long b;
    public final n0c c;

    public h0c(n0c n0cVar, int i, long j) {
        this.c = n0cVar;
        this.a = i;
        this.b = j;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        EditText editText = this.c.w;
        if (i == 1 && editText.hasFocus()) {
            hl.t1(editText);
            editText.clearFocus();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        n0c n0cVar = this.c;
        n0cVar.o();
        x46 x46Var = (x46) recyclerView.getLayoutManager();
        if (x46Var != null && x46Var.M0() >= n0cVar.s.c.size() - 3) {
            if (n0cVar.i()) {
                n0cVar.j();
                return;
            }
            boolean z = n0cVar.d;
            int i3 = this.a;
            if (z) {
                uc7.s1(i3).F1().g(false);
                return;
            }
            qyb qybVar = uc7.s1(i3).g4;
            long j = -this.b;
            if (!qybVar.e(j)) {
                qybVar.o(j);
            }
        }
    }
}
