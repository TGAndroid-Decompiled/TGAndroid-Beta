package defpackage;

import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class m07 extends x07 {
    public final byte E = 1;
    public final Object F;

    public m07(qv0 qv0Var, qv0 qv0Var2, FrameLayout frameLayout, long j) {
        super(qv0Var2, frameLayout, j, true);
        this.F = qv0Var;
    }

    @Override
    public final void f(String str, boolean z, boolean z2) {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                if (z2) {
                    qv0.Z((qv0) obj).setSearchFieldText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
            default:
                i02 i02Var = (i02) obj;
                a1b a1bVar = i02Var.Q1;
                if (this.e.isEmpty()) {
                    if (a1bVar.getVisibility() != 4) {
                        a1bVar.setVisibility(4);
                        return;
                    }
                    return;
                } else if (z2) {
                    i02Var.v1.K.setText("");
                    return;
                } else {
                    super.f(str, z, z2);
                    return;
                }
        }
    }

    public m07(i02 i02Var, d dVar, dy0 dy0Var, long j) {
        super(dVar, dy0Var, j, false);
        this.F = i02Var;
    }
}
