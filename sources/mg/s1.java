package mg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.r20;
public final class s1 implements r20 {
    public final int f13232a;
    public final v1 f13233b;
    public final boolean f13234c;

    public s1(v1 v1Var, boolean z10, int i10) {
        this.f13232a = i10;
        this.f13233b = v1Var;
        this.f13234c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f13232a) {
            case 0:
                List list = (List) obj;
                v1 v1Var = this.f13233b;
                ArrayList arrayList = v1Var.Y1;
                if (this.f13234c) {
                    v1Var.Z1.addAll(list);
                }
                if (v1Var.f13258j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    v1Var.n1(true, true);
                    v1Var.j1(true);
                    return;
                }
                return;
            default:
                v1.d1(this.f13233b, this.f13234c, (Pair) obj);
                return;
        }
    }
}
