package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ya7 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLRPC.Dialog c;

    public ya7(uc7 uc7Var, TLRPC.Dialog dialog, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = dialog;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Dialog dialog = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                if (f11.a) {
                    cc4.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                if (uc7Var.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7Var.R.f(dialog.id);
                    if (dialog2 == null) {
                        if (f11.a) {
                            cc4.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        kf7 messagesStorage = uc7Var.getMessagesStorage();
                        messagesStorage.a.c(new cq6(messagesStorage, dialog.id, new ya7(uc7Var, dialog, (byte) 2), (byte) 19));
                        return;
                    }
                    if (f11.a) {
                        StringBuilder sb = new StringBuilder("checkLastDialogMessage for ");
                        sb.append(dialog.id);
                        sb.append(" current dialog top message ");
                        c00.q(dialog2.top_message, sb);
                    }
                    if (dialog2.top_message == 0) {
                        uc7Var.V(3, dialog.id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                uc7Var.U0.e(dialog.id);
                return;
            default:
                uc7Var.V(3, dialog.id, false);
                return;
        }
    }
}
