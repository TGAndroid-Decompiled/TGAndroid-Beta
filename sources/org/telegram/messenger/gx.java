package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class gx implements Runnable {
    public final int f15973a;
    public final rz f15974b;
    public final TLRPC.TL_error f15975c;
    public final org.telegram.ui.ActionBar.k2 d;
    public final TLRPC.TL_messages_editMessage e;

    public gx(rz rzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f15973a = i10;
        this.f15974b = rzVar;
        this.f15975c = tL_error;
        this.d = k2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f15973a) {
            case 0:
                org.telegram.ui.Components.s4.e0(this.f15974b.currentAccount, this.f15975c, this.d, this.e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.s4.e0(this.f15974b.currentAccount, this.f15975c, this.d, this.e, new Object[0]);
                return;
        }
    }
}
