package defpackage;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class fda implements View.OnClickListener {
    public final byte a;
    public final kea b;

    public fda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                keaVar.Q0(true);
                return;
            case 1:
                og2 og2Var = keaVar.Z1;
                og2Var.a(!og2Var.a.q, true);
                keaVar.W0();
                return;
            case 2:
                n8 n8Var = keaVar.E2;
                if (n8Var != null && n8Var.isShowing()) {
                    keaVar.E2.d(true);
                }
                keaVar.Q0(false);
                return;
            case 3:
                n8 n8Var2 = keaVar.E2;
                if (n8Var2 != null && n8Var2.isShowing()) {
                    keaVar.E2.d(true);
                }
                keaVar.Q0(true);
                return;
            case 4:
                String[] strArr = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr[0] != null) {
                        keaVar.dismiss();
                        PhotoViewer.q0().A(true, false);
                        if (strArr[0] == null && keaVar.g2) {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            return;
                        }
                        keaVar.getContext();
                        keaVar.G0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr2[0] != null) {
                        keaVar.dismiss();
                        if (strArr2[0] == null && keaVar.g2) {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            return;
                        }
                        keaVar.getContext();
                        keaVar.G0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = keaVar.j2;
                if (keaVar.P1.m() == 0) {
                    if (keaVar.i2 || strArr3[0] != null) {
                        keaVar.dismiss();
                        if (strArr3[0] == null && keaVar.g2) {
                            keaVar.h2 = true;
                            Toast.makeText(keaVar.getContext(), ob6.M0(2131748533, null), 0).show();
                            return;
                        }
                        keaVar.getContext();
                        keaVar.G0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
