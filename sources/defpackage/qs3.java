package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class qs3 extends a49 {
    public final ps3[] a = new ps3[4];
    public final ArrayList b = new ArrayList();

    @Override
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        ps3 ps3Var = new ps3(recyclerView, i, new os3(this, (byte) 0));
        this.a[i] = ps3Var;
        return ps3Var;
    }

    public final float b(int i) {
        ps3 ps3Var = this.a[i];
        if (Build.VERSION.SDK_INT >= 31 && ps3Var != null && !ps3Var.isFinished()) {
            return ps3Var.getDistance();
        }
        return 0.0f;
    }
}
