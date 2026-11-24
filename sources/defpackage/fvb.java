package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class fvb extends i49 {
    public final byte a;
    public final qvb b;

    public fvb(qvb qvbVar, byte b) {
        this.a = b;
        this.b = qvbVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        cq3 cq3Var;
        byte b = this.a;
        qvb qvbVar = this.b;
        switch (b) {
            case 0:
                qvbVar.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (cq3Var = qvbVar.i1) != null) {
                    cq3Var.f(i, i2);
                    qvbVar.x0();
                    return;
                }
                return;
        }
    }
}
