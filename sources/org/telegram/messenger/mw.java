package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class mw implements Runnable {
    public final int f25843a;
    public final zy f25844b;
    public final TLRPC.TL_error f25845c;
    public final org.telegram.ui.ActionBar.h2 d;
    public final TLRPC.TL_messages_editMessage f25846e;

    public mw(zy zyVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25843a = i7;
        this.f25844b = zyVar;
        this.f25845c = tL_error;
        this.d = h2Var;
        this.f25846e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25843a) {
            case 0:
                org.telegram.ui.Components.b5.c0(this.f25844b.currentAccount, this.f25845c, this.d, this.f25846e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.b5.c0(this.f25844b.currentAccount, this.f25845c, this.d, this.f25846e, new Object[0]);
                return;
        }
    }
}
