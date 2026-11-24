package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj3 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;

    public rj3(int i, String str, VoIPService voIPService, boolean z) {
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
                gl.c3(new pj3((vj3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 0));
                return;
            case 1:
                gl.c3(new pj3((xj3) obj2, this.b, (TLRPC.TL_messages_searchGlobal) obj, this.d, tLObject, (byte) 1));
                return;
            case 2:
                gl.c3(new pj3((z3a) obj2, tLObject, (k3a) obj, this.d, this.b));
                return;
            default:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$57(this.b, this.d, (String) obj, tLObject, tL_error);
                return;
        }
    }

    public rj3(z3a z3aVar, k3a k3aVar, boolean z, int i) {
        this.a = (byte) 2;
        this.e = z3aVar;
        this.c = k3aVar;
        this.d = z;
        this.b = i;
    }

    public rj3(l5c l5cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, byte b) {
        this.a = b;
        this.e = l5cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
    }
}
