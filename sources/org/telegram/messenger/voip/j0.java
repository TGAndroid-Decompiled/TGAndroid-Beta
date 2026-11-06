package org.telegram.messenger.voip;

import bi.nb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
public final class j0 implements RequestDelegate {
    public final int f26116a;
    public final int f26117b;
    public final boolean f26118c;
    public final Object d;
    public final Object f26119e;

    public j0(int i7, String str, VoIPService voIPService, boolean z9) {
        this.f26116a = 0;
        this.d = voIPService;
        this.f26117b = i7;
        this.f26118c = z9;
        this.f26119e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26116a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f26117b, this.f26118c, (String) this.f26119e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nb((vr) this.d, this.f26117b, (TLRPC.TL_messages_searchGlobal) this.f26119e, this.f26118c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new nb((xr) this.d, this.f26117b, (TLRPC.TL_messages_searchGlobal) this.f26119e, this.f26118c, tLObject, 4));
                return;
        }
    }

    public j0(k41 k41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26116a = i10;
        this.d = k41Var;
        this.f26117b = i7;
        this.f26119e = tL_messages_searchGlobal;
        this.f26118c = z9;
    }
}
