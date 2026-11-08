package org.telegram.messenger.voip;

import bi.nb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
public final class j0 implements RequestDelegate {
    public final int f26130a;
    public final int f26131b;
    public final boolean f26132c;
    public final Object d;
    public final Object f26133e;

    public j0(int i7, String str, VoIPService voIPService, boolean z9) {
        this.f26130a = 0;
        this.d = voIPService;
        this.f26131b = i7;
        this.f26132c = z9;
        this.f26133e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26130a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f26131b, this.f26132c, (String) this.f26133e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nb((vr) this.d, this.f26131b, (TLRPC.TL_messages_searchGlobal) this.f26133e, this.f26132c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new nb((xr) this.d, this.f26131b, (TLRPC.TL_messages_searchGlobal) this.f26133e, this.f26132c, tLObject, 4));
                return;
        }
    }

    public j0(l41 l41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26130a = i10;
        this.d = l41Var;
        this.f26131b = i7;
        this.f26133e = tL_messages_searchGlobal;
        this.f26132c = z9;
    }
}
