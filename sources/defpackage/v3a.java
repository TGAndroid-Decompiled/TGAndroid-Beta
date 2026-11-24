package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class v3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLRPC.TL_error c;
    public final d d;
    public final TLRPC.TL_messages_editMessage e;

    public v3a(a6a a6aVar, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_error;
        this.d = dVar;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = this.e;
        d dVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                ik.c0(a6aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                return;
            default:
                ik.c0(a6aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                return;
        }
    }
}
