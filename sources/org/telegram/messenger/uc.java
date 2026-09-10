package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.eo;
public final class uc implements Runnable {
    public final int f16490a = 2;
    public final int f16491b;
    public final long f16492c;
    public final long d;
    public final Object e;
    public final Object f16493f;
    public final Object h;

    public uc(int i10, Context context, long j3, long j10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f16491b = i10;
        this.e = context;
        this.f16492c = j3;
        this.d = j10;
        this.f16493f = h3VarArr;
        this.h = f6Var;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f16490a) {
            case 0:
                ((MessagesController) this.e).lambda$deleteSavedDialog$144(this.f16492c, this.d, (TLRPC.InputPeer) this.f16493f, this.f16491b, (int[]) this.h);
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f16493f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                ((w70) this.e).u();
                int i12 = this.f16491b;
                MessagesController messagesController = MessagesController.getInstance(i12);
                long j3 = this.f16492c;
                long j10 = this.d;
                boolean isDialogMuted = messagesController.isDialogMuted(j3, j10);
                NotificationsController.getInstance(i12).muteDialog(j3, j10, !isDialogMuted);
                if (org.telegram.ui.Components.wc.a(p2Var)) {
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
                    org.telegram.ui.Components.wc.z(p2Var, i10, i11, f6Var).j();
                    return;
                }
                return;
            case 2:
                Context context = (Context) this.e;
                int i13 = this.f16491b;
                xh.p g10 = xh.p.g(i13);
                long j11 = this.f16492c;
                g10.f(context, j11, this.d, new di.t3((org.telegram.ui.ActionBar.h3[]) this.f16493f, context, i13, j11, (org.telegram.ui.ActionBar.f6) this.h, 2));
                return;
            default:
                zh.m0 m0Var = (zh.m0) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f16493f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                m0Var.c(this.f16491b);
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = m0Var.getContext();
                    zh.b bVar = new zh.b();
                    long j12 = this.d;
                    long j13 = this.f16492c;
                    new xh.o7(context2, bVar, j13, 17, "", new a3.g0(m0Var, j12, tL_textWithEntities, j13, 14), m0Var.M).show();
                    return;
                } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    zh.t0 t0Var = m0Var.P;
                    if (t0Var != null) {
                        t0Var.w();
                        return;
                    }
                    return;
                } else {
                    new org.telegram.ui.Components.wc(m0Var.f48663b, new zh.b()).d0(tL_error, true);
                    return;
                }
        }
    }

    public uc(MessagesController messagesController, long j3, long j10, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        this.e = messagesController;
        this.f16492c = j3;
        this.d = j10;
        this.f16493f = inputPeer;
        this.f16491b = i10;
        this.h = iArr;
    }

    public uc(w70 w70Var, int i10, long j3, long j10, eo eoVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = w70Var;
        this.f16491b = i10;
        this.f16492c = j3;
        this.d = j10;
        this.f16493f = eoVar;
        this.h = f6Var;
    }

    public uc(zh.m0 m0Var, int i10, TLRPC.TL_error tL_error, long j3, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = m0Var;
        this.f16491b = i10;
        this.f16493f = tL_error;
        this.f16492c = j3;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
