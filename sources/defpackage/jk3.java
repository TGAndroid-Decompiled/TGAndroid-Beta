package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jk3 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;

    public jk3(int i, String str, VoIPService voIPService, boolean z) {
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
                hl.c3(new hk3((nk3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 0));
                return;
            case 1:
                hl.c3(new hk3((pk3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 1));
                return;
            case 2:
                hl.c3(new hk3((r7a) obj2, tLObject, (d7a) obj, this.d, this.b));
                return;
            default:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$57(this.b, this.d, (String) obj, tLObject, tL_error);
                return;
        }
    }

    public jk3(r7a r7aVar, d7a d7aVar, boolean z, int i) {
        this.a = (byte) 2;
        this.e = r7aVar;
        this.c = d7aVar;
        this.d = z;
        this.b = i;
    }

    public jk3(l9c l9cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, byte b) {
        this.a = b;
        this.e = l9cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
    }
}
