package ai;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.wn;
public final class p0 implements Runnable {
    public final int f1377a = 3;
    public final long f1378b;
    public final long f1379c;
    public final int d;
    public final Object e;
    public final Object f1380f;
    public final Object h;

    public p0(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.d = i10;
        this.e = context;
        this.f1378b = j3;
        this.f1379c = j10;
        this.f1380f = e3VarArr;
        this.h = d6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f1377a) {
            case 0:
                o1 o1Var = (o1) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1380f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                o1Var.c(this.d);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context = o1Var.getContext();
                    d dVar = new d();
                    long j3 = this.f1379c;
                    long j10 = this.f1378b;
                    new yh.l7(context, dVar, j10, 17, "", new a3.g0(o1Var, j3, tL_textWithEntities, j10, 1), o1Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    d2 d2Var = o1Var.P;
                    if (d2Var != null) {
                        d2Var.w();
                        return;
                    }
                    return;
                } else {
                    new xc(o1Var.f1329b, new d()).d0(tL_error, true);
                    return;
                }
            case 1:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.f1378b, this.f1379c, (TLRPC.InputPeer) this.f1380f, this.d, (int[]) this.h);
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f1380f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
                ((y70) this.e).u();
                int i12 = this.d;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j11 = this.f1378b;
                long j12 = this.f1379c;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, j12);
                NotificationsController.getInstance(i12).muteDialog(j11, j12, !isDialogMuted);
                if (xc.a(m2Var)) {
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
                    xc.z(m2Var, i10, i11, d6Var).j();
                    return;
                }
                return;
            default:
                Context context2 = (Context) this.e;
                int i13 = this.d;
                yh.o g10 = yh.o.g(i13);
                long j13 = this.f1378b;
                g10.f(context2, j13, this.f1379c, new ei.q3((org.telegram.ui.ActionBar.e3[]) this.f1380f, context2, i13, j13, (org.telegram.ui.ActionBar.d6) this.h, 2));
                return;
        }
    }

    public p0(o1 o1Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = o1Var;
        this.d = i10;
        this.f1380f = tL_error;
        this.f1378b = j3;
        this.f1379c = j10;
        this.h = tL_textWithEntities;
    }

    public p0(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f1378b = j3;
        this.f1379c = j10;
        this.f1380f = inputPeer;
        this.d = i10;
        this.h = iArr;
    }

    public p0(y70 y70Var, int i10, long j3, long j10, wn wnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = y70Var;
        this.d = i10;
        this.f1378b = j3;
        this.f1379c = j10;
        this.f1380f = wnVar;
        this.h = d6Var;
    }
}
