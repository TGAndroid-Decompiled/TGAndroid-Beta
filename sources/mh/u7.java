package mh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
public final class u7 implements Runnable {
    public final int f14896a = 0;
    public final int f14897b;
    public final long f14898c;
    public final long d;
    public final Object f14899e;
    public final Object f14900f;
    public final Object h;

    public u7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14897b = i10;
        this.f14899e = context;
        this.f14898c = j10;
        this.d = j11;
        this.f14900f = h3VarArr;
        this.h = g6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f14896a) {
            case 0:
                Context context = (Context) this.f14899e;
                int i12 = this.f14897b;
                a0 g10 = a0.g(i12);
                long j10 = this.f14898c;
                g10.f(context, j10, this.d, new sh.s2((org.telegram.ui.ActionBar.h3[]) this.f14900f, context, i12, j10, (org.telegram.ui.ActionBar.g6) this.h, 2));
                return;
            case 1:
                oh.v0 v0Var = (oh.v0) this.f14899e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f14900f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                v0Var.c(this.f14897b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = v0Var.getContext();
                    oh.b bVar = new oh.b();
                    long j11 = this.d;
                    long j12 = this.f14898c;
                    new z9(context2, bVar, j12, 17, "", new i5.x(v0Var, j11, tL_textWithEntities, j12, 3), v0Var.J).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    oh.e1 e1Var = v0Var.M;
                    if (e1Var != null) {
                        e1Var.w();
                        return;
                    }
                    return;
                } else {
                    new qc(v0Var.f17831b, new oh.b()).d0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.f14899e).lambda$deleteSavedDialog$144(this.f14898c, this.d, (TLRPC.InputPeer) this.f14900f, this.f14897b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f14900f;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.h;
                ((q70) this.f14899e).u();
                int i13 = this.f14897b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f14898c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i13).muteDialog(j13, j14, !isDialogMuted);
                if (qc.a(p2Var)) {
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
                    qc.z(p2Var, i10, i11, g6Var).j();
                    return;
                }
                return;
        }
    }

    public u7(oh.v0 v0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f14899e = v0Var;
        this.f14897b = i10;
        this.f14900f = tL_error;
        this.f14898c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public u7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f14899e = messagesController;
        this.f14898c = j10;
        this.d = j11;
        this.f14900f = inputPeer;
        this.f14897b = i10;
        this.h = iArr;
    }

    public u7(q70 q70Var, int i10, long j10, long j11, xn xnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f14899e = q70Var;
        this.f14897b = i10;
        this.f14898c = j10;
        this.d = j11;
        this.f14900f = xnVar;
        this.h = g6Var;
    }
}
