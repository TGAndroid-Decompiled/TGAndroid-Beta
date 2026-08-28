package gh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.qn;
public final class w7 implements Runnable {
    public final int f9108a = 0;
    public final int f9109b;
    public final long f9110c;
    public final long d;
    public final Object f9111e;
    public final Object f9112f;
    public final Object h;

    public w7(int i9, Context context, long j10, long j11, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f9109b = i9;
        this.f9111e = context;
        this.f9110c = j10;
        this.d = j11;
        this.f9112f = f3VarArr;
        this.h = b6Var;
    }

    @Override
    public final void run() {
        int i9;
        int i10;
        switch (this.f9108a) {
            case 0:
                Context context = (Context) this.f9111e;
                int i11 = this.f9109b;
                c0 g10 = c0.g(i11);
                long j10 = this.f9110c;
                g10.f(context, j10, this.d, new mh.f3((org.telegram.ui.ActionBar.f3[]) this.f9112f, context, i11, j10, (org.telegram.ui.ActionBar.b6) this.h, 2));
                return;
            case 1:
                ih.w0 w0Var = (ih.w0) this.f9111e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9112f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                w0Var.c(this.f9109b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = w0Var.getContext();
                    ih.b bVar = new ih.b();
                    long j11 = this.d;
                    long j12 = this.f9110c;
                    new ea(context2, bVar, j12, 17, "", new e5.y(w0Var, j11, tL_textWithEntities, j12, 2), w0Var.I).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    ih.f1 f1Var = w0Var.L;
                    if (f1Var != null) {
                        f1Var.w();
                        return;
                    }
                    return;
                } else {
                    new oc(w0Var.f12274b, new ih.b()).d0(tL_error, true);
                    return;
                }
            case 2:
                ((MessagesController) this.f9111e).lambda$deleteSavedDialog$144(this.f9110c, this.d, (TLRPC.InputPeer) this.f9112f, this.f9109b, (int[]) this.h);
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f9112f;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.h;
                ((x60) this.f9111e).u();
                int i12 = this.f9109b;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j13 = this.f9110c;
                long j14 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j13, j14);
                NotificationsController.getInstance(i12).muteDialog(j13, j14, !isDialogMuted);
                if (oc.a(o2Var)) {
                    if (!isDialogMuted) {
                        i9 = 3;
                    } else {
                        i9 = 4;
                    }
                    if (!isDialogMuted) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = 0;
                    }
                    oc.z(o2Var, i9, i10, b6Var).j();
                    return;
                }
                return;
        }
    }

    public w7(ih.w0 w0Var, int i9, TLRPC.TL_error tL_error, long j10, long j11, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f9111e = w0Var;
        this.f9109b = i9;
        this.f9112f = tL_error;
        this.f9110c = j10;
        this.d = j11;
        this.h = tL_textWithEntities;
    }

    public w7(MessagesController messagesController, long j10, long j11, TLRPC.InputPeer inputPeer, int i9, int[] iArr) {
        this.f9111e = messagesController;
        this.f9110c = j10;
        this.d = j11;
        this.f9112f = inputPeer;
        this.f9109b = i9;
        this.h = iArr;
    }

    public w7(x60 x60Var, int i9, long j10, long j11, qn qnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f9111e = x60Var;
        this.f9109b = i9;
        this.f9110c = j10;
        this.d = j11;
        this.f9112f = qnVar;
        this.h = b6Var;
    }
}
