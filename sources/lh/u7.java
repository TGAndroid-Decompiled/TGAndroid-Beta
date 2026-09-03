package lh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;
public final class u7 implements Runnable {
    public final int f13202a = 0;
    public final int f13203b;
    public final long f13204c;
    public final long d;
    public final Object e;
    public final Object f13205f;
    public final Object h;

    public u7(int i10, Context context, long j10, long j11, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f13203b = i10;
        this.e = context;
        this.f13204c = j10;
        this.d = j11;
        this.f13205f = g3VarArr;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f13202a) {
            case 0:
                Context context = (Context) this.e;
                int i12 = this.f13203b;
                b0 g10 = b0.g(i12);
                long j10 = this.f13204c;
                g10.f(context, j10, this.d, new rh.s2((org.telegram.ui.ActionBar.g3[]) this.f13205f, context, i12, j10, (org.telegram.ui.ActionBar.f6) this.h, 2));
                return;
            case 1:
                nh.v0 v0Var = (nh.v0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13205f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                v0Var.c(this.f13203b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = v0Var.getContext();
                    nh.b bVar = new nh.b();
                    long j11 = this.d;
                    long j12 = this.f13204c;
                    new z9(context2, bVar, j12, 17, "", new i5.x(v0Var, j11, tL_textWithEntities, j12, 3), v0Var.J).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    nh.e1 e1Var = v0Var.M;
                    if (e1Var != null) {
                        e1Var.w();
                        return;
                    }
                    return;
                } else {
                    new qc(v0Var.f15951b, new nh.b()).d0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.f13204c, this.d, (TLRPC.InputPeer) this.f13205f, this.f13203b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f13205f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                ((p70) this.e).u();
                int i13 = this.f13203b;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j13 = this.f13204c;
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
                    qc.z(p2Var, i10, i11, f6Var).j();
                    return;
                }
                return;
        }
    }

    public u7(nh.v0 v0Var, int i10, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = v0Var;
        this.f13203b = i10;
        this.f13205f = tL_error;
        this.f13204c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public u7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f13204c = j10;
        this.d = j11;
        this.f13205f = inputPeer;
        this.f13203b = i10;
        this.h = iArr;
    }

    public u7(p70 p70Var, int i10, long j10, long j11, zn znVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = p70Var;
        this.f13203b = i10;
        this.f13204c = j10;
        this.d = j11;
        this.f13205f = znVar;
        this.h = f6Var;
    }
}
