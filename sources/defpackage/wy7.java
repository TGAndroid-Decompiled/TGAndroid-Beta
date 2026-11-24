package defpackage;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;
public final class wy7 implements OnCompleteListener, ed, px2 {
    public final byte a;
    public final p b;

    public wy7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            FrameLayout frameLayout = this.b.P;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        fa4.e("isReadyToPay failed", task.getException());
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 1:
                pVar.N0(pVar.S0[0]);
                return;
            case 2:
            default:
                pVar.I0(true);
                pVar.D0();
                return;
            case 3:
                pVar.F0(true);
                return;
        }
    }

    @Override
    public final void y(mx2 mx2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = mx2Var;
                pVar.f[4].setText(mx2Var.a);
                return;
            default:
                pVar.B0 = mx2Var;
                pVar.f[4].setText(mx2Var.a);
                pVar.C0 = mx2Var.d;
                return;
        }
    }
}
