package org.telegram.messenger.voip;

import bi.nb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
public final class j0 implements RequestDelegate {
    public final int f26124a;
    public final int f26125b;
    public final boolean f26126c;
    public final Object d;
    public final Object f26127e;

    public j0(int i7, String str, VoIPService voIPService, boolean z9) {
        this.f26124a = 0;
        this.d = voIPService;
        this.f26125b = i7;
        this.f26126c = z9;
        this.f26127e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26124a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f26125b, this.f26126c, (String) this.f26127e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nb((vr) this.d, this.f26125b, (TLRPC.TL_messages_searchGlobal) this.f26127e, this.f26126c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new nb((xr) this.d, this.f26125b, (TLRPC.TL_messages_searchGlobal) this.f26127e, this.f26126c, tLObject, 4));
                return;
        }
    }

    public j0(l41 l41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26124a = i10;
        this.d = l41Var;
        this.f26125b = i7;
        this.f26127e = tL_messages_searchGlobal;
        this.f26126c = z9;
    }
}
