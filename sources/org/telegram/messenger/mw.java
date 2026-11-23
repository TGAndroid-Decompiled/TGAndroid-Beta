package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25938a;
    public final zy f25939b;
    public final TLRPC.TL_error f25940c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final TLRPC.TL_messages_editMessage f25941e;

    public mw(zy zyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25938a = i7;
        this.f25939b = zyVar;
        this.f25940c = tL_error;
        this.d = g2Var;
        this.f25941e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25938a) {
            case 0:
                org.telegram.ui.Components.b5.c0(this.f25939b.currentAccount, this.f25940c, this.d, this.f25941e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.b5.c0(this.f25939b.currentAccount, this.f25940c, this.d, this.f25941e, new Object[0]);
                return;
        }
    }
}
