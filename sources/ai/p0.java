package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class p0 implements Runnable {
    public final int f1379a = 3;
    public final long f1380b;
    public final long f1381c;
    public final int d;
    public final Object e;
    public final Object f1382f;
    public final Object h;

    public p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i10;
        this.e = context;
        this.f1380b = j3;
        this.f1381c = j10;
        this.f1382f = g3VarArr;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1379a) {
            case 0:
                o1 o1Var = (o1) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1382f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                o1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = o1Var.getContext();
                    d dVar = new d();
                    long j3 = this.f1381c;
                    long j10 = this.f1380b;
                    new yh.n7(context, dVar, j10, 17, "", new a3.g0(o1Var, j3, tL_textWithEntities, j10, 1), o1Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    d2 d2Var = o1Var.P;
                    if (d2Var != null) {
                        d2Var.w();
                        return;
                    }
                    return;
                } else {
                    new vc(o1Var.f1328b, new d()).d0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.f1380b, this.f1381c, (TLRPC.InputPeer) this.f1382f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f1382f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                ((n70) this.e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j11 = this.f1380b;
                long j12 = this.f1381c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i12).muteDialog(j11, j12, !isDialogMuted);
                if (vc.a(o2Var)) {
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
                    vc.z(o2Var, i10, i11, f6Var).j();
                    return;
                }
                return;
            default:
                Context context2 = (Context) this.e;
                int i13 = this.d;
                yh.o g10 = yh.o.g(i13);
                long j13 = this.f1380b;
                g10.f(context2, j13, this.f1381c, new ei.q3((org.telegram.ui.ActionBar.g3[]) this.f1382f, context2, i13, j13, (org.telegram.ui.ActionBar.f6) this.h, 2));
                return;
        }
    }

    public p0(o1 o1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = o1Var;
        this.d = i10;
        this.f1382f = tL_error;
        this.f1380b = j3;
        this.f1381c = j10;
        this.h = tL_textWithEntities;
    }

    public p0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f1380b = j3;
        this.f1381c = j10;
        this.f1382f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public p0(n70 n70Var, int i10, long j3, long j10, bo boVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = n70Var;
        this.d = i10;
        this.f1380b = j3;
        this.f1381c = j10;
        this.f1382f = boVar;
        this.h = f6Var;
    }
}
