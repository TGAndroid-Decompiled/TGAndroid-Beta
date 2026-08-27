package hh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

public final class v7 implements Runnable {

    public final int f10242a = 0;

    public final int f10243b;

    public final long f10244c;
    public final long d;

    public final Object f10245e;

    public final Object f10246f;
    public final Object h;

    public v7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f10243b = i10;
        this.f10245e = context;
        this.f10244c = j10;
        this.d = j11;
        this.f10246f = e3VarArr;
        this.h = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f10242a) {
            case 0:
                Context context = (Context) this.f10245e;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f10246f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                int i10 = this.f10243b;
                c0 c0VarG = c0.g(i10);
                long j10 = this.f10244c;
                c0VarG.f(context, j10, this.d, new nh.e3(e3VarArr, context, i10, j10, c6Var, 2));
                break;
            case 1:
                jh.u0 u0Var = (jh.u0) this.f10245e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f10246f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                u0Var.c(this.f10243b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = u0Var.getContext();
                    jh.b bVar = new jh.b();
                    long j11 = this.d;
                    long j12 = this.f10244c;
                    new ea(context2, bVar, j12, 17, "", new e5.w(u0Var, j11, tL_textWithEntities, j12, 3), u0Var.I).show();
                } else if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new mc(u0Var.f14010b, new jh.b()).d0(tL_error, true);
                } else {
                    jh.d1 d1Var = u0Var.L;
                    if (d1Var != null) {
                        d1Var.w();
                    }
                }
                break;
            case 2:
                ((MessagesController) this.f10245e).lambda$deleteSavedDialog$144(this.f10244c, this.d, (TLRPC.InputPeer) this.f10246f, this.f10243b, (int[]) this.h);
                break;
            default:
                b70 b70Var = (b70) this.f10245e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f10246f;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.h;
                b70Var.u();
                int i11 = this.f10243b;
                MessagesController messagesController = MessagesController.getInstance(i11);
                long j13 = this.f10244c;
                long j14 = this.d;
                boolean zIsDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i11).muteDialog(j13, j14, !zIsDialogMuted);
                if (mc.a(n2Var)) {
                    mc.z(n2Var, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, c6Var2).j();
                }
                break;
        }
    }

    public v7(jh.u0 u0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f10245e = u0Var;
        this.f10243b = i10;
        this.f10246f = tL_error;
        this.f10244c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public v7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.f10245e = messagesController;
        this.f10244c = j10;
        this.d = j11;
        this.f10246f = inputPeer;
        this.f10243b = i10;
        this.h = iArr;
    }

    public v7(b70 b70Var, int i10, long j10, long j11, rn rnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f10245e = b70Var;
        this.f10243b = i10;
        this.f10244c = j10;
        this.d = j11;
        this.f10246f = rnVar;
        this.h = c6Var;
    }
}
