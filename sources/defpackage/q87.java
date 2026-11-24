package defpackage;

import org.telegram.tgnet.TLRPC;
public final class q87 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TLRPC.Dialog c;

    public q87(na7 na7Var, TLRPC.Dialog dialog, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = dialog;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Dialog dialog = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                if (w01.a) {
                    fa4.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                if (na7Var.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7Var.R.f(dialog.id);
                    if (dialog2 == null) {
                        if (w01.a) {
                            fa4.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        ad7 messagesStorage = na7Var.getMessagesStorage();
                        messagesStorage.a.c(new go6(messagesStorage, dialog.id, new q87(na7Var, dialog, (byte) 2), (byte) 18));
                        return;
                    }
                    if (w01.a) {
                        StringBuilder sb = new StringBuilder("checkLastDialogMessage for ");
                        sb.append(dialog.id);
                        sb.append(" current dialog top message ");
                        b00.p(dialog2.top_message, sb);
                    }
                    if (dialog2.top_message == 0) {
                        na7Var.T(3, dialog.id, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                na7Var.U0.e(dialog.id);
                return;
            default:
                na7Var.T(3, dialog.id, false);
                return;
        }
    }
}
