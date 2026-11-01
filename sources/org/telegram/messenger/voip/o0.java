package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q51;
public final class o0 implements RequestDelegate {
    public final int f18845a;
    public final int f18846b;
    public final boolean f18847c;
    public final Object d;
    public final Object e;

    public o0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f18845a = 0;
        this.d = voIPService;
        this.f18846b = i10;
        this.f18847c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18845a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18846b, this.f18847c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ig.o0((gs) this.d, this.f18846b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18847c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.i0.g3(new ig.o0((is) this.d, this.f18846b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18847c, tLObject, 4));
                return;
        }
    }

    public o0(q51 q51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18845a = i11;
        this.d = q51Var;
        this.f18846b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18847c = z10;
    }
}
