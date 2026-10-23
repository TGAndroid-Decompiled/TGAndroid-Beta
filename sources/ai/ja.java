package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j80;
import org.telegram.ui.sn;
public final class ja implements Runnable {
    public final int f1561a = 0;
    public final int f1562b;
    public final long f1563c;
    public final long d;
    public final Object e;
    public final Object f1564f;
    public final Object h;

    public ja(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f1562b = i10;
        this.e = context;
        this.f1563c = j10;
        this.d = j11;
        this.f1564f = h3VarArr;
        this.h = g6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1561a) {
            case 0:
                Context context = (Context) this.e;
                int i12 = this.f1562b;
                k0 g10 = k0.g(i12);
                long j10 = this.f1563c;
                g10.f(context, j10, this.d, new gi.g3((org.telegram.ui.ActionBar.h3[]) this.f1564f, context, i12, j10, (org.telegram.ui.ActionBar.g6) this.h, 2));
                return;
            case 1:
                ci.x0 x0Var = (ci.x0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1564f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x0Var.c(this.f1562b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = x0Var.getContext();
                    ci.b bVar = new ci.b();
                    long j11 = this.d;
                    long j12 = this.f1563c;
                    new dd(context2, bVar, j12, 17, "", new a3.h0(x0Var, j11, tL_textWithEntities, j12, 2), x0Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    ci.h1 h1Var = x0Var.P;
                    if (h1Var != null) {
                        h1Var.w();
                        return;
                    }
                    return;
                } else {
                    new org.telegram.ui.Components.xc(x0Var.f6081b, new ci.b()).f0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.f1563c, this.d, (TLRPC.InputPeer) this.f1564f, this.f1562b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f1564f;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.h;
                ((j80) this.e).u();
                int i13 = this.f1562b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f1563c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i13).muteDialog(j13, j14, !isDialogMuted);
                if (org.telegram.ui.Components.xc.a(o2Var)) {
                    if (!isDialogMuted) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                    if (!isDialogMuted) {
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i11 = 0;
                    }
                    org.telegram.ui.Components.xc.z(o2Var, i10, i11, g6Var).j();
                    return;
                }
                return;
        }
    }

    public ja(ci.x0 x0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = x0Var;
        this.f1562b = i10;
        this.f1564f = tL_error;
        this.f1563c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public ja(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f1563c = j10;
        this.d = j11;
        this.f1564f = inputPeer;
        this.f1562b = i10;
        this.h = iArr;
    }

    public ja(j80 j80Var, int i10, long j10, long j11, sn snVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.e = j80Var;
        this.f1562b = i10;
        this.f1563c = j10;
        this.d = j11;
        this.f1564f = snVar;
        this.h = g6Var;
    }
}
