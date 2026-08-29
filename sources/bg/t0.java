package bg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ws0;
public final class t0 extends ag.t1 {
    public final Bitmap A;
    public final ws0 B;

    public t0(ws0 ws0Var, Context context, ag.f1 f1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, f1Var, bitmap, null, null);
        this.B = ws0Var;
        this.A = bitmap2;
    }

    @Override
    public final void g(ag.m mVar) {
        int indexOf = ag.m.f584a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.A != null) {
            indexOf = i10;
        }
        ws0 ws0Var = this.B;
        ws0Var.f2247p1.b(indexOf);
        ws0Var.q(mVar);
    }
}
