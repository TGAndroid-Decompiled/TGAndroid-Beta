package org.telegram.messenger.voip;

import di.da;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.ms;
public final class k0 implements RequestDelegate {
    public final int f27499a;
    public final int f27500b;
    public final boolean f27501c;
    public final Object d;
    public final Object f27502e;

    public k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.f27499a = 0;
        this.d = voIPService;
        this.f27500b = i7;
        this.f27501c = z10;
        this.f27502e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27499a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f27500b, this.f27501c, (String) this.f27502e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.g3(new da((ks) this.d, this.f27500b, (TLRPC.TL_messages_searchGlobal) this.f27502e, this.f27501c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new da((ms) this.d, this.f27500b, (TLRPC.TL_messages_searchGlobal) this.f27502e, this.f27501c, tLObject, 4));
                return;
        }
    }

    public k0(c51 c51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27499a = i10;
        this.d = c51Var;
        this.f27500b = i7;
        this.f27502e = tL_messages_searchGlobal;
        this.f27501c = z10;
    }
}
