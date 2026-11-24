package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl3 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;

    public cl3(int i, String str, VoIPService voIPService, boolean z) {
        this.a = (byte) 3;
        this.e = voIPService;
        this.b = i;
        this.d = z;
        this.c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                gm.c3(new al3((gl3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 0));
                return;
            case 1:
                gm.c3(new al3((il3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 1));
                return;
            case 2:
                gm.c3(new al3((a6a) obj2, tLObject, (m5a) obj, this.d, this.b));
                return;
            default:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$57(this.b, this.d, (String) obj, tLObject, tL_error);
                return;
        }
    }

    public cl3(a6a a6aVar, m5a m5aVar, boolean z, int i) {
        this.a = (byte) 2;
        this.e = a6aVar;
        this.c = m5aVar;
        this.d = z;
        this.b = i;
    }

    public cl3(l7c l7cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, byte b) {
        this.a = b;
        this.e = l7cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
    }
}
