package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25845a;
    public final zy f25846b;
    public final TLRPC.TL_error f25847c;
    public final org.telegram.ui.ActionBar.h2 d;
    public final TLRPC.TL_messages_editMessage f25848e;

    public mw(zy zyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25845a = i7;
        this.f25846b = zyVar;
        this.f25847c = tL_error;
        this.d = h2Var;
        this.f25848e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25845a) {
            case 0:
                org.telegram.ui.Components.b5.c0(this.f25846b.currentAccount, this.f25847c, this.d, this.f25848e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.b5.c0(this.f25846b.currentAccount, this.f25847c, this.d, this.f25848e, new Object[0]);
                return;
        }
    }
}
