package defpackage;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class o9a implements View.OnClickListener {
    public final byte a;
    public final taa b;

    public o9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 0:
                taaVar.P0(true);
                return;
            case 1:
                wf2 wf2Var = taaVar.Z1;
                wf2Var.a(!wf2Var.a.q, true);
                taaVar.V0();
                return;
            case 2:
                m8 m8Var = taaVar.E2;
                if (m8Var != null && m8Var.isShowing()) {
                    taaVar.E2.d(true);
                }
                taaVar.P0(false);
                return;
            case 3:
                m8 m8Var2 = taaVar.E2;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    taaVar.E2.d(true);
                }
                taaVar.P0(true);
                return;
            case 4:
                String[] strArr = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr[0] != null) {
                        taaVar.dismiss();
                        PhotoViewer.r0().B(true, false);
                        if (strArr[0] == null && taaVar.g2) {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            return;
                        }
                        taaVar.getContext();
                        taaVar.F0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr2[0] != null) {
                        taaVar.dismiss();
                        if (strArr2[0] == null && taaVar.g2) {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            return;
                        }
                        taaVar.getContext();
                        taaVar.F0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = taaVar.j2;
                if (taaVar.P1.m() == 0) {
                    if (taaVar.i2 || strArr3[0] != null) {
                        taaVar.dismiss();
                        if (strArr3[0] == null && taaVar.g2) {
                            taaVar.h2 = true;
                            Toast.makeText(taaVar.getContext(), k96.M0(2131748587, null), 0).show();
                            return;
                        }
                        taaVar.getContext();
                        taaVar.F0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
