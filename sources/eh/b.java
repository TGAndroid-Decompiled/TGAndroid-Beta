package eh;

import android.view.View;
import android.view.WindowInsets;
import cg.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y10;
import r0.m1;
import r0.o;
public final class b implements y10, o {
    public final f f6210a;

    public b(f fVar) {
        this.f6210a = fVar;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        boolean z10;
        WindowInsets g10 = m1Var.g();
        f fVar = this.f6210a;
        fVar.processLegacyContainerInsets(g10);
        vd.a aVar = fVar.U;
        if (m1Var.f46843a.f(8).d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        return m1.f46842b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f6210a;
        if (fVar.f6226h0 != min) {
            fVar.f6226h0 = min;
            fVar.T.a(min);
            fVar.f6222d0.postOnAnimation(new m2(fVar, 13));
        }
    }
}
