package defpackage;

import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.p;
public final class b28 implements OnCompleteListener, fd, jy2 {
    public final byte a;
    public final p b;

    public b28(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void B(gy2 gy2Var) {
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 2:
                pVar.B0 = gy2Var;
                pVar.f[4].setText(gy2Var.a);
                return;
            default:
                pVar.B0 = gy2Var;
                pVar.f[4].setText(gy2Var.a);
                pVar.C0 = gy2Var.d;
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
        cc4.e("isReadyToPay failed", task.getException());
    }

    @Override
    public final void w(id idVar, int i) {
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
