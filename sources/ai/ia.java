package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.sn;
public final class ia implements Runnable {
    public final int f1498a = 0;
    public final int f1499b;
    public final long f1500c;
    public final long d;
    public final Object e;
    public final Object f1501f;
    public final Object h;

    public ia(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1499b = i10;
        this.e = context;
        this.f1500c = j10;
        this.d = j11;
        this.f1501f = f3VarArr;
        this.h = d6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1498a) {
            case 0:
                Context context = (Context) this.e;
                int i12 = this.f1499b;
                k0 g10 = k0.g(i12);
                long j10 = this.f1500c;
                g10.f(context, j10, this.d, new gi.g3((org.telegram.ui.ActionBar.f3[]) this.f1501f, context, i12, j10, (org.telegram.ui.ActionBar.d6) this.h, 2));
                return;
            case 1:
                ci.x0 x0Var = (ci.x0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1501f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x0Var.c(this.f1499b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = x0Var.getContext();
                    ci.b bVar = new ci.b();
                    long j11 = this.d;
                    long j12 = this.f1500c;
                    new cd(context2, bVar, j12, 17, "", new a3.h0(x0Var, j11, tL_textWithEntities, j12, 2), x0Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    ci.h1 h1Var = x0Var.P;
                    if (h1Var != null) {
                        h1Var.w();
                        return;
                    }
                    return;
                } else {
                    new org.telegram.ui.Components.xc(x0Var.f6074b, new ci.b()).f0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.f1500c, this.d, (TLRPC.InputPeer) this.f1501f, this.f1499b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1501f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
                ((i80) this.e).u();
                int i13 = this.f1499b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f1500c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i13).muteDialog(j13, j14, !isDialogMuted);
                if (org.telegram.ui.Components.xc.a(n2Var)) {
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
                    org.telegram.ui.Components.xc.z(n2Var, i10, i11, d6Var).j();
                    return;
                }
                return;
        }
    }

    public ia(ci.x0 x0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = x0Var;
        this.f1499b = i10;
        this.f1501f = tL_error;
        this.f1500c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public ia(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f1500c = j10;
        this.d = j11;
        this.f1501f = inputPeer;
        this.f1499b = i10;
        this.h = iArr;
    }

    public ia(i80 i80Var, int i10, long j10, long j11, sn snVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = i80Var;
        this.f1499b = i10;
        this.f1500c = j10;
        this.d = j11;
        this.f1501f = snVar;
        this.h = d6Var;
    }
}
