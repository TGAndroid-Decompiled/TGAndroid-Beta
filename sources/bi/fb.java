package bi;

import android.content.Context;
import java.util.ArrayList;
public final class fb extends c0 {
    public final pb Q0;

    public fb(pb pbVar, int i10, Context context, pb pbVar2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = pbVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 9);
        this.O0 = -1;
        this.f3830y0 = i10;
        this.H0 = new l5(context);
        this.N0 = pbVar2;
        r9 r9Var = new r9(this, context, pbVar2, bVar);
        this.f3831z0 = r9Var;
        setAdapter(r9Var);
        a1.c cVar = new a1.c(this, 8);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.f50749o0 = 1;
        this.f50748n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new s9(this, pbVar2));
        setOverScrollMode(2);
    }
}
