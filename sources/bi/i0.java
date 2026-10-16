package bi;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class i0 implements Runnable {
    public final int f3160a = 3;
    public final long f3161b;
    public final long f3162c;
    public final int d;
    public final Object e;
    public final Object f3163f;
    public final Object h;

    public i0(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = i10;
        this.e = context;
        this.f3161b = j10;
        this.f3162c = j11;
        this.f3163f = e3VarArr;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f3160a) {
            case 0:
                g1 g1Var = (g1) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3163f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                g1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = g1Var.getContext();
                    b bVar = new b();
                    long j10 = this.f3162c;
                    long j11 = this.f3161b;
                    new zh.e7(context, bVar, j11, 17, "", new a3.h0(g1Var, j10, tL_textWithEntities, j11, 1), g1Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    t1 t1Var = g1Var.P;
                    if (t1Var != null) {
                        t1Var.w();
                        return;
                    }
                    return;
                } else {
                    new zc(g1Var.f3056b, new b()).f0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$143(this.f3161b, this.f3162c, (TLRPC.InputPeer) this.f3163f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f3163f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                ((l80) this.e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j12 = this.f3161b;
                long j13 = this.f3162c;
                boolean isDialogMuted = messagesController.isDialogMuted(j12, j13);
                NotificationsController.getInstance(i12).muteDialog(j12, j13, !isDialogMuted);
                if (zc.a(m2Var)) {
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
                    zc.z(m2Var, i10, i11, c6Var).j();
                    return;
                }
                return;
            default:
                Context context2 = (Context) this.e;
                int i13 = this.d;
                zh.p g10 = zh.p.g(i13);
                long j14 = this.f3161b;
                g10.f(context2, j14, this.f3162c, new fi.r3((org.telegram.ui.ActionBar.e3[]) this.f3163f, context2, i13, j14, (org.telegram.ui.ActionBar.c6) this.h, 2));
                return;
        }
    }

    public i0(g1 g1Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = g1Var;
        this.d = i10;
        this.f3163f = tL_error;
        this.f3161b = j10;
        this.f3162c = j11;
        this.h = tL_textWithEntities;
    }

    public i0(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f3161b = j10;
        this.f3162c = j11;
        this.f3163f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public i0(l80 l80Var, int i10, long j10, long j11, fo foVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = l80Var;
        this.d = i10;
        this.f3161b = j10;
        this.f3162c = j11;
        this.f3163f = foVar;
        this.h = c6Var;
    }
}
