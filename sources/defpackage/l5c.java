package defpackage;

import android.app.Dialog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l5c implements Runnable {
    public final byte a;
    public final p5c b;
    public final TLRPC.TL_error c;

    public l5c(p5c p5cVar, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = p5cVar;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        String G;
        String G2;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        p5c p5cVar = this.b;
        switch (b) {
            case 0:
                p5cVar.B0();
                if (tL_error == null) {
                    p5cVar.getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new h5c(p5cVar, (byte) 3));
                    String M0 = jb6.M0(2131747169, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    heVar.S = jb6.M0(2131743618, null);
                    Dialog showDialog = p5cVar.showDialog(heVar);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = jb6.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = jb6.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    p5cVar.L0(jb6.M0(2131743618, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
                    return;
                } else {
                    p5cVar.L0(jb6.M0(2131743618, null), tL_error.text);
                    return;
                }
            case 1:
                p5cVar.B0();
                if (tL_error == null) {
                    if (p5cVar.getParentActivity() != null) {
                        p5cVar.l0(new g5c(p5cVar, (byte) 5));
                        return;
                    }
                    return;
                } else if (tL_error.text.startsWith("CODE_INVALID")) {
                    p5cVar.D0();
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue2 = Utilities.z(tL_error.text).intValue();
                    if (intValue2 < 60) {
                        G2 = jb6.G(intValue2, "Seconds", new Object[0]);
                    } else {
                        G2 = jb6.G(intValue2 / 60, "Minutes", new Object[0]);
                    }
                    p5cVar.L0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G2));
                    return;
                } else {
                    p5cVar.L0(jb6.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 2:
                p5cVar.w0(tL_error);
                return;
            default:
                p5cVar.r0(tL_error);
                return;
        }
    }
}
