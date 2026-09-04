package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class i0 implements Runnable {
    public final int f3082a = 3;
    public final long f3083b;
    public final long f3084c;
    public final int d;
    public final Object f3085e;
    public final Object f3086f;
    public final Object h;

    public i0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i10;
        this.f3085e = context;
        this.f3083b = j3;
        this.f3084c = j10;
        this.f3086f = f3VarArr;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f3082a) {
            case 0:
                g1 g1Var = (g1) this.f3085e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3086f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                g1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = g1Var.getContext();
                    b bVar = new b();
                    long j3 = this.f3084c;
                    long j10 = this.f3083b;
                    new zh.k7(context, bVar, j10, 17, "", new a3.f0(g1Var, j3, tL_textWithEntities, j10, 1), g1Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    t1 t1Var = g1Var.P;
                    if (t1Var != null) {
                        t1Var.w();
                        return;
                    }
                    return;
                } else {
                    new yc(g1Var.f3002b, new b()).d0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.f3085e).lambda$deleteSavedDialog$144(this.f3083b, this.f3084c, (TLRPC.InputPeer) this.f3086f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f3086f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                ((n70) this.f3085e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j11 = this.f3083b;
                long j12 = this.f3084c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i12).muteDialog(j11, j12, !isDialogMuted);
                if (yc.a(n2Var)) {
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
                    yc.z(n2Var, i10, i11, f6Var).j();
                    return;
                }
                return;
            default:
                Context context2 = (Context) this.f3085e;
                int i13 = this.d;
                zh.o g10 = zh.o.g(i13);
                long j13 = this.f3083b;
                g10.f(context2, j13, this.f3084c, new fi.q3((org.telegram.ui.ActionBar.f3[]) this.f3086f, context2, i13, j13, (org.telegram.ui.ActionBar.f6) this.h, 2));
                return;
        }
    }

    public i0(g1 g1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f3085e = g1Var;
        this.d = i10;
        this.f3086f = tL_error;
        this.f3083b = j3;
        this.f3084c = j10;
        this.h = tL_textWithEntities;
    }

    public i0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f3085e = messagesController;
        this.f3083b = j3;
        this.f3084c = j10;
        this.f3086f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public i0(n70 n70Var, int i10, long j3, long j10, co coVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3085e = n70Var;
        this.d = i10;
        this.f3083b = j3;
        this.f3084c = j10;
        this.f3086f = coVar;
        this.h = f6Var;
    }
}
