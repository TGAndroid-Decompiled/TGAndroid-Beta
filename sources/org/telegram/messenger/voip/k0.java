package org.telegram.messenger.voip;

import di.da;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
public final class k0 implements RequestDelegate {
    public final int f27604a;
    public final int f27605b;
    public final boolean f27606c;
    public final Object d;
    public final Object f27607e;

    public k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.f27604a = 0;
        this.d = voIPService;
        this.f27605b = i7;
        this.f27606c = z10;
        this.f27607e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27604a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f27605b, this.f27606c, (String) this.f27607e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.g3(new da((hs) this.d, this.f27605b, (TLRPC.TL_messages_searchGlobal) this.f27607e, this.f27606c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new da((js) this.d, this.f27605b, (TLRPC.TL_messages_searchGlobal) this.f27607e, this.f27606c, tLObject, 4));
                return;
        }
    }

    public k0(b51 b51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27604a = i10;
        this.d = b51Var;
        this.f27605b = i7;
        this.f27607e = tL_messages_searchGlobal;
        this.f27606c = z10;
    }
}
