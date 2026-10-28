package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.wn;
public final class ka implements Runnable {
    public final int f4986a = 0;
    public final int f4987b;
    public final long f4988c;
    public final long d;
    public final Object e;
    public final Object f4989f;
    public final Object h;

    public ka(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4987b = i10;
        this.e = context;
        this.f4988c = j10;
        this.d = j11;
        this.f4989f = k3VarArr;
        this.h = u6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f4986a) {
            case 0:
                Context context = (Context) this.e;
                int i12 = this.f4987b;
                m0 g7 = m0.g(i12);
                long j10 = this.f4988c;
                g7.f(context, j10, this.d, new hi.p3((org.telegram.ui.ActionBar.k3[]) this.f4989f, context, i12, j10, (org.telegram.ui.ActionBar.u6) this.h, 2));
                return;
            case 1:
                di.x0 x0Var = (di.x0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4989f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x0Var.c(this.f4987b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = x0Var.getContext();
                    di.b bVar = new di.b();
                    long j11 = this.d;
                    long j12 = this.f4988c;
                    new tc(context2, bVar, j12, 17, "", new a3.h0(x0Var, j11, tL_textWithEntities, j12, 2), x0Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    di.h1 h1Var = x0Var.P;
                    if (h1Var != null) {
                        h1Var.w();
                        return;
                    }
                    return;
                } else {
                    new org.telegram.ui.Components.wc(x0Var.f9341b, new di.b()).g0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.f4988c, this.d, (TLRPC.InputPeer) this.f4989f, this.f4987b, (int[]) this.h);
                return;
            case 3:
                ((MessagesStorage) this.e).lambda$updateMessageWidgetData$107(this.f4987b, this.f4988c, (String) this.f4989f, this.d, (String) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f4989f;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.h;
                ((l80) this.e).u();
                int i13 = this.f4987b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f4988c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i13).muteDialog(j13, j14, !isDialogMuted);
                if (org.telegram.ui.Components.wc.a(r2Var)) {
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
                    org.telegram.ui.Components.wc.z(r2Var, i10, i11, u6Var).j();
                    return;
                }
                return;
        }
    }

    public ka(di.x0 x0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = x0Var;
        this.f4987b = i10;
        this.f4989f = tL_error;
        this.f4988c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public ka(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f4988c = j10;
        this.d = j11;
        this.f4989f = inputPeer;
        this.f4987b = i10;
        this.h = iArr;
    }

    public ka(MessagesStorage messagesStorage, int i10, long j10, String str, long j11, String str2) {
        this.e = messagesStorage;
        this.f4987b = i10;
        this.f4988c = j10;
        this.f4989f = str;
        this.d = j11;
        this.h = str2;
    }

    public ka(l80 l80Var, int i10, long j10, long j11, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.e = l80Var;
        this.f4987b = i10;
        this.f4988c = j10;
        this.d = j11;
        this.f4989f = wnVar;
        this.h = u6Var;
    }
}
