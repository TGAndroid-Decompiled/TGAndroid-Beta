package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g91;
public final class i1 extends g91 {
    public final boolean f5190a;
    public final Context f5191b;
    public final r2 f5192c;

    public i1(r2 r2Var, boolean z10, Context context) {
        this.f5192c = r2Var;
        this.f5190a = z10;
        this.f5191b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        z1 z1Var = (z1) view;
        if (this.f5190a) {
            i10 = 1;
        }
        z1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f5191b;
        r2 r2Var = this.f5192c;
        if (i10 == 1) {
            return new y1(r2Var, context);
        }
        return new d2(r2Var, context);
    }

    @Override
    public final int e() {
        if (this.f5190a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (i10 != 0 && i10 != 1) {
            return 1;
        }
        return 0;
    }
}
