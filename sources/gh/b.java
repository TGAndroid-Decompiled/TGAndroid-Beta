package gh;

import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d20;
import r0.m1;
import r0.o;
public final class b implements d20, o {
    public final f f6830a;

    public b(f fVar) {
        this.f6830a = fVar;
    }

    @Override
    public m1 N0(View view, m1 m1Var) {
        boolean z4;
        WindowInsets g10 = m1Var.g();
        f fVar = this.f6830a;
        fVar.processLegacyContainerInsets(g10);
        xd.a aVar = fVar.V;
        if (m1Var.f43130a.f(8).d > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        return m1.f43129b;
    }

    @Override
    public void a(int i10) {
        int min = Math.min(i10, AndroidUtilities.dp(144.0f));
        if (i10 > 0) {
            min -= AndroidUtilities.dp(8.0f);
        }
        f fVar = this.f6830a;
        if (fVar.f6847i0 != min) {
            fVar.f6847i0 = min;
            fVar.U.a(min);
            fVar.f6843e0.postOnAnimation(new ef.e(fVar, 15));
        }
    }
}
