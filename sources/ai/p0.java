package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
public final class p0 implements Runnable {
    public final int f1556a = 3;
    public final long f1557b;
    public final long f1558c;
    public final int d;
    public final Object f1559e;
    public final Object f1560f;
    public final Object h;

    public p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = i10;
        this.f1559e = context;
        this.f1557b = j3;
        this.f1558c = j10;
        this.f1560f = e3VarArr;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1556a) {
            case 0:
                o1 o1Var = (o1) this.f1559e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1560f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                o1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = o1Var.getContext();
                    d dVar = new d();
                    long j3 = this.f1558c;
                    long j10 = this.f1557b;
                    new yh.e7(context, dVar, j10, 17, "", new a3.g0(o1Var, j3, tL_textWithEntities, j10, 1), o1Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    d2 d2Var = o1Var.P;
                    if (d2Var != null) {
                        d2Var.w();
                        return;
                    }
                    return;
                } else {
                    new zc(o1Var.f1505b, new d()).f0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.f1559e).lambda$deleteSavedDialog$143(this.f1557b, this.f1558c, (TLRPC.InputPeer) this.f1560f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f1560f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                ((s80) this.f1559e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j11 = this.f1557b;
                long j12 = this.f1558c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i12).muteDialog(j11, j12, !isDialogMuted);
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
                Context context2 = (Context) this.f1559e;
                int i13 = this.d;
                yh.o g10 = yh.o.g(i13);
                long j13 = this.f1557b;
                g10.f(context2, j13, this.f1558c, new ei.q3((org.telegram.ui.ActionBar.e3[]) this.f1560f, context2, i13, j13, (org.telegram.ui.ActionBar.c6) this.h, 2));
                return;
        }
    }

    public p0(o1 o1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1559e = o1Var;
        this.d = i10;
        this.f1560f = tL_error;
        this.f1557b = j3;
        this.f1558c = j10;
        this.h = tL_textWithEntities;
    }

    public p0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f1559e = messagesController;
        this.f1557b = j3;
        this.f1558c = j10;
        this.f1560f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public p0(s80 s80Var, int i10, long j3, long j10, eo eoVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f1559e = s80Var;
        this.d = i10;
        this.f1557b = j3;
        this.f1558c = j10;
        this.f1560f = eoVar;
        this.h = c6Var;
    }
}
