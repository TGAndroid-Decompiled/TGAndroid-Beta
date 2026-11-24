package defpackage;

import android.view.View;
import android.widget.Toast;
import org.telegram.ui.PhotoViewer;
public final class oba implements View.OnClickListener {
    public final byte a;
    public final tca b;

    public oba(tca tcaVar, byte b) {
        this.a = b;
        this.b = tcaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        tca tcaVar = this.b;
        switch (b) {
            case 0:
                tcaVar.P0(true);
                return;
            case 1:
                jh2 jh2Var = tcaVar.Z1;
                jh2Var.a(!jh2Var.a.q, true);
                tcaVar.V0();
                return;
            case 2:
                m8 m8Var = tcaVar.E2;
                if (m8Var != null && m8Var.isShowing()) {
                    tcaVar.E2.d(true);
                }
                tcaVar.P0(false);
                return;
            case 3:
                m8 m8Var2 = tcaVar.E2;
                if (m8Var2 != null && m8Var2.isShowing()) {
                    tcaVar.E2.d(true);
                }
                tcaVar.P0(true);
                return;
            case 4:
                String[] strArr = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr[0] != null) {
                        tcaVar.dismiss();
                        PhotoViewer.r0().A(true, false);
                        if (strArr[0] == null && tcaVar.g2) {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            return;
                        }
                        tcaVar.getContext();
                        tcaVar.F0();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String[] strArr2 = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr2[0] != null) {
                        tcaVar.dismiss();
                        if (strArr2[0] == null && tcaVar.g2) {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            return;
                        }
                        tcaVar.getContext();
                        tcaVar.F0();
                        return;
                    }
                    return;
                }
                return;
            default:
                String[] strArr3 = tcaVar.j2;
                if (tcaVar.P1.m() == 0) {
                    if (tcaVar.i2 || strArr3[0] != null) {
                        tcaVar.dismiss();
                        if (strArr3[0] == null && tcaVar.g2) {
                            tcaVar.h2 = true;
                            Toast.makeText(tcaVar.getContext(), jb6.M0(2131748536, null), 0).show();
                            return;
                        }
                        tcaVar.getContext();
                        tcaVar.F0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
