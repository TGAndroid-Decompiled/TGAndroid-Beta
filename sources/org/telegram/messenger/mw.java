package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f24273a;
    public final yy f24274b;
    public final TLRPC.TL_error f24275c;
    public final org.telegram.ui.ActionBar.d2 d;
    public final TLRPC.TL_messages_editMessage f24276e;

    public mw(yy yyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i3) {
        this.f24273a = i3;
        this.f24274b = yyVar;
        this.f24275c = tL_error;
        this.d = d2Var;
        this.f24276e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f24273a) {
            case 0:
                org.telegram.ui.Components.t4.e0(this.f24274b.currentAccount, this.f24275c, this.d, this.f24276e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.t4.e0(this.f24274b.currentAccount, this.f24275c, this.d, this.f24276e, new Object[0]);
                return;
        }
    }
}
