package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class p0 implements Runnable {
    public final int f1492a = 3;
    public final long f1493b;
    public final long f1494c;
    public final int d;
    public final Object f1495e;
    public final Object f1496f;
    public final Object h;

    public p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = i10;
        this.f1495e = context;
        this.f1493b = j3;
        this.f1494c = j10;
        this.f1496f = f3VarArr;
        this.h = d6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1492a) {
            case 0:
                o1 o1Var = (o1) this.f1495e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1496f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                o1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = o1Var.getContext();
                    d dVar = new d();
                    long j3 = this.f1494c;
                    long j10 = this.f1493b;
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
                    new yc(o1Var.f1437b, new d()).d0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.f1495e).lambda$deleteSavedDialog$144(this.f1493b, this.f1494c, (TLRPC.InputPeer) this.f1496f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1496f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
                ((b80) this.f1495e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j11 = this.f1493b;
                long j12 = this.f1494c;
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
                    yc.z(n2Var, i10, i11, d6Var).j();
                    return;
                }
                return;
            default:
                Context context2 = (Context) this.f1495e;
                int i13 = this.d;
                yh.p g10 = yh.p.g(i13);
                long j13 = this.f1493b;
                g10.f(context2, j13, this.f1494c, new ei.r3((org.telegram.ui.ActionBar.f3[]) this.f1496f, context2, i13, j13, (org.telegram.ui.ActionBar.d6) this.h, 2));
                return;
        }
    }

    public p0(o1 o1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1495e = o1Var;
        this.d = i10;
        this.f1496f = tL_error;
        this.f1493b = j3;
        this.f1494c = j10;
        this.h = tL_textWithEntities;
    }

    public p0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f1495e = messagesController;
        this.f1493b = j3;
        this.f1494c = j10;
        this.f1496f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public p0(b80 b80Var, int i10, long j3, long j10, yn ynVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1495e = b80Var;
        this.d = i10;
        this.f1493b = j3;
        this.f1494c = j10;
        this.f1496f = ynVar;
        this.h = d6Var;
    }
}
