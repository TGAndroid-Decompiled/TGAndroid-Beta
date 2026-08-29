package jh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
public final class t7 implements Runnable {
    public final int f12854a = 0;
    public final int f12855b;
    public final long f12856c;
    public final long d;
    public final Object f12857e;
    public final Object f12858f;
    public final Object h;

    public t7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f12855b = i10;
        this.f12857e = context;
        this.f12856c = j10;
        this.d = j11;
        this.f12858f = f3VarArr;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f12854a) {
            case 0:
                Context context = (Context) this.f12857e;
                int i12 = this.f12855b;
                b0 g10 = b0.g(i12);
                long j10 = this.f12856c;
                g10.f(context, j10, this.d, new ph.s2((org.telegram.ui.ActionBar.f3[]) this.f12858f, context, i12, j10, (org.telegram.ui.ActionBar.c6) this.h, 2));
                return;
            case 1:
                lh.u0 u0Var = (lh.u0) this.f12857e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12858f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.f12855b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = u0Var.getContext();
                    lh.b bVar = new lh.b();
                    long j11 = this.d;
                    long j12 = this.f12856c;
                    new y9(context2, bVar, j12, 17, "", new g5.x(u0Var, j11, tL_textWithEntities, j12, 3), u0Var.I).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    lh.d1 d1Var = u0Var.L;
                    if (d1Var != null) {
                        d1Var.w();
                        return;
                    }
                    return;
                } else {
                    new tc(u0Var.f16277b, new lh.b()).d0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.f12857e).lambda$deleteSavedDialog$144(this.f12856c, this.d, (TLRPC.InputPeer) this.f12858f, this.f12855b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f12858f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                ((j70) this.f12857e).u();
                int i13 = this.f12855b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f12856c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i13).muteDialog(j13, j14, !isDialogMuted);
                if (tc.a(o2Var)) {
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
                    tc.z(o2Var, i10, i11, c6Var).j();
                    return;
                }
                return;
        }
    }

    public t7(lh.u0 u0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f12857e = u0Var;
        this.f12855b = i10;
        this.f12858f = tL_error;
        this.f12856c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public t7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f12857e = messagesController;
        this.f12856c = j10;
        this.d = j11;
        this.f12858f = inputPeer;
        this.f12855b = i10;
        this.h = iArr;
    }

    public t7(j70 j70Var, int i10, long j10, long j11, tn tnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f12857e = j70Var;
        this.f12855b = i10;
        this.f12856c = j10;
        this.d = j11;
        this.f12858f = tnVar;
        this.h = c6Var;
    }
}
