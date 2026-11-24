package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class gxb extends k69 {
    public final byte a;
    public final sxb b;

    public gxb(sxb sxbVar, byte b) {
        this.a = b;
        this.b = sxbVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        mr3 mr3Var;
        byte b = this.a;
        sxb sxbVar = this.b;
        switch (b) {
            case 0:
                sxbVar.z0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (mr3Var = sxbVar.i1) != null) {
                    mr3Var.f(i, i2);
                    sxbVar.y0();
                    return;
                }
                return;
        }
    }
}
