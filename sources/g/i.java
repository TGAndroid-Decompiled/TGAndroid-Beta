package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;

public final class i implements Runnable {

    public final int f6265a;

    public final r f6266b;

    public i(r rVar, int i10) {
        this.f6265a = i10;
        this.f6266b = rVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f6265a;
        r rVar = this.f6266b;
        int i11 = 0;
        switch (i10) {
            case 0:
                if ((rVar.f6297e0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.f6297e0 & 4096) != 0) {
                    rVar.j(108);
                }
                rVar.f6295d0 = false;
                rVar.f6297e0 = 0;
                break;
            default:
                rVar.A.showAtLocation(rVar.f6311y, 55, 0, 0);
                m0 m0Var = rVar.C;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (rVar.E && (viewGroup = rVar.F) != null) {
                    WeakHashMap weakHashMap = j0.f46605a;
                    if (viewGroup.isLaidOut()) {
                        rVar.f6311y.setAlpha(0.0f);
                        m0 m0VarA = j0.a(rVar.f6311y);
                        m0VarA.a(1.0f);
                        rVar.C = m0VarA;
                        m0VarA.d(new j(this, i11));
                    }
                }
                rVar.f6311y.setAlpha(1.0f);
                rVar.f6311y.setVisibility(0);
                break;
        }
    }
}
