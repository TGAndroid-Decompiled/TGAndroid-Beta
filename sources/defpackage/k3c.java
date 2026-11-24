package defpackage;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k3c implements Runnable {
    public final byte a;
    public final p3c b;
    public final TLRPC.TL_error c;

    public k3c(p3c p3cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = p3cVar;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.A0();
                if (tL_error == null) {
                    p3cVar.getMessagesController().m4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                    alertDialog$Builder.j(k96.M0(2131747638, null), new g3c(p3cVar, (byte) 3));
                    String M0 = k96.M0(2131747243, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.U = M0;
                    hdVar.S = k96.M0(2131743692, null);
                    Dialog showDialog = p3cVar.showDialog(hdVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = k96.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = k96.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    p3cVar.K0(k96.M0(2131743692, null), k96.a0("FloodWaitTime", null, 2131750669, G));
                    return;
                } else {
                    p3cVar.K0(k96.M0(2131743692, null), tL_error.text);
                    return;
                }
            case 1:
                p3cVar.A0();
                if (tL_error == null) {
                    if (p3cVar.getParentActivity() != null) {
                        p3cVar.k0(new f3c(p3cVar, (byte) 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    p3cVar.C0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = k96.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = k96.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    p3cVar.K0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G2));
                    return;
                } else {
                    p3cVar.K0(k96.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                p3cVar.v0(tL_error);
                return;
            default:
                p3cVar.q0(tL_error);
                return;
        }
    }
}
