package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class z6a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLRPC.TL_error c;
    public final e d;
    public final TLRPC.TL_messages_editMessage e;

    public z6a(r7a r7aVar, TLRPC.TL_error tL_error, e eVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tL_error;
        this.d = eVar;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = this.e;
        e eVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                jj.c0(r7aVar.currentAccount, tL_error, eVar, tL_messages_editMessage, new Object[0]);
                return;
            default:
                jj.c0(r7aVar.currentAccount, tL_error, eVar, tL_messages_editMessage, new Object[0]);
                return;
        }
    }
}
