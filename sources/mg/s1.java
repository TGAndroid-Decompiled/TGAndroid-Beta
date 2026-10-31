package mg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;
public final class s1 implements q20 {
    public final int f13231a;
    public final v1 f13232b;
    public final boolean f13233c;

    public s1(v1 v1Var, boolean z10, int i10) {
        this.f13231a = i10;
        this.f13232b = v1Var;
        this.f13233c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f13231a) {
            case 0:
                List list = (List) obj;
                v1 v1Var = this.f13232b;
                ArrayList arrayList = v1Var.Y1;
                if (this.f13233c) {
                    v1Var.Z1.addAll(list);
                }
                if (v1Var.f13257j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    v1Var.n1(true, true);
                    v1Var.j1(true);
                    return;
                }
                return;
            default:
                v1.d1(this.f13232b, this.f13233c, (Pair) obj);
                return;
        }
    }
}
