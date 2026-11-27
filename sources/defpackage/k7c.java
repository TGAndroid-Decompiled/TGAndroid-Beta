package defpackage;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k7c implements Runnable {
    public final byte a;
    public final o7c b;
    public final TLRPC.TL_error c;

    public k7c(o7c o7cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = o7cVar;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.B0();
                if (tL_error == null) {
                    o7cVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o7cVar.getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new g7c(o7cVar, (byte) 3));
                    String M0 = ob6.M0(2131747163, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    idVar.S = ob6.M0(2131743586, null);
                    Dialog showDialog = o7cVar.showDialog(idVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = ob6.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = ob6.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    o7cVar.L0(ob6.M0(2131743586, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
                    return;
                } else {
                    o7cVar.L0(ob6.M0(2131743586, null), tL_error.text);
                    return;
                }
            case 1:
                o7cVar.B0();
                if (tL_error == null) {
                    if (o7cVar.getParentActivity() != null) {
                        o7cVar.k0(new f7c(o7cVar, (byte) 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    o7cVar.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = ob6.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = ob6.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    o7cVar.L0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G2));
                    return;
                } else {
                    o7cVar.L0(ob6.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                o7cVar.w0(tL_error);
                return;
            default:
                o7cVar.q0(tL_error);
                return;
        }
    }
}
