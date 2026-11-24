package defpackage;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;
public final class y08 implements OnCompleteListener, ee, zy2 {
    public final byte a;
    public final p b;

    public y08(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void g(wy2 wy2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = wy2Var;
                pVar.f[4].setText(wy2Var.a);
                return;
            default:
                pVar.B0 = wy2Var;
                pVar.f[4].setText(wy2Var.a);
                pVar.C0 = wy2Var.d;
                return;
        }
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
        fc4.e("isReadyToPay failed", task.getException());
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 1:
                pVar.O0(pVar.S0[0]);
                return;
            case 2:
            default:
                pVar.J0(true);
                pVar.E0();
                return;
            case 3:
                pVar.G0(true);
                return;
        }
    }
}
