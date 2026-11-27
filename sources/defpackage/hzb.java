package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hzb extends v79 {
    public final byte a;
    public final tzb b;

    public hzb(tzb tzbVar, byte b) {
        this.a = b;
        this.b = tzbVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        tq3 tq3Var;
        byte b = this.a;
        tzb tzbVar = this.b;
        switch (b) {
            case 0:
                tzbVar.z0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (tq3Var = tzbVar.i1) != null) {
                    tq3Var.f(i, i2);
                    tzbVar.y0();
                    return;
                }
                return;
        }
    }
}
