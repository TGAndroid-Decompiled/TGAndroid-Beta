package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fx implements Runnable {
    public final int f15632a;
    public final qz f15633b;
    public final TLRPC.TL_error f15634c;
    public final org.telegram.ui.ActionBar.k2 d;
    public final TLRPC.TL_messages_editMessage e;

    public fx(qz qzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f15632a = i10;
        this.f15633b = qzVar;
        this.f15634c = tL_error;
        this.d = k2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f15632a) {
            case 0:
                org.telegram.ui.Components.s4.e0(this.f15633b.currentAccount, this.f15634c, this.d, this.e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.s4.e0(this.f15633b.currentAccount, this.f15634c, this.d, this.e, new Object[0]);
                return;
        }
    }
}
