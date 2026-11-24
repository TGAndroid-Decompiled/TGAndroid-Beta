package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ra7 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLRPC.Dialog c;

    public ra7(oc7 oc7Var, TLRPC.Dialog dialog, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = dialog;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Dialog dialog = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                if (e21.a) {
                    fc4.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                if (oc7Var.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7Var.R.f(dialog.id);
                    if (dialog2 == null) {
                        if (e21.a) {
                            fc4.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        cf7 messagesStorage = oc7Var.getMessagesStorage();
                        messagesStorage.a.c(new hq6(messagesStorage, dialog.id, new ra7(oc7Var, dialog, (byte) 2), (byte) 18));
                        return;
                    }
                    if (e21.a) {
                        StringBuilder sb = new StringBuilder("checkLastDialogMessage for ");
                        sb.append(dialog.id);
                        sb.append(" current dialog top message ");
                        b10.p(dialog2.top_message, sb);
                    }
                    if (dialog2.top_message == 0) {
                        oc7Var.T(3, dialog.id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                oc7Var.U0.e(dialog.id);
                return;
            default:
                oc7Var.T(3, dialog.id, false);
                return;
        }
    }
}
