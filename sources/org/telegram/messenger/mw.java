package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25871a;
    public final zy f25872b;
    public final TLRPC.TL_error f25873c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final TLRPC.TL_messages_editMessage f25874e;

    public mw(zy zyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25871a = i7;
        this.f25872b = zyVar;
        this.f25873c = tL_error;
        this.d = g2Var;
        this.f25874e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25871a) {
            case 0:
                org.telegram.ui.Components.c5.c0(this.f25872b.currentAccount, this.f25873c, this.d, this.f25874e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.c5.c0(this.f25872b.currentAccount, this.f25873c, this.d, this.f25874e, new Object[0]);
                return;
        }
    }
}
