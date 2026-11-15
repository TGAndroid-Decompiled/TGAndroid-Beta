package org.telegram.messenger.voip;

import di.aa;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.p41;
public final class k0 implements RequestDelegate {
    public final int f27141a;
    public final int f27142b;
    public final boolean f27143c;
    public final Object d;
    public final Object f27144e;

    public k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.f27141a = 0;
        this.d = voIPService;
        this.f27142b = i7;
        this.f27143c = z10;
        this.f27144e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27141a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f27142b, this.f27143c, (String) this.f27144e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new aa((bs) this.d, this.f27142b, (TLRPC.TL_messages_searchGlobal) this.f27144e, this.f27143c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new aa((ds) this.d, this.f27142b, (TLRPC.TL_messages_searchGlobal) this.f27144e, this.f27143c, tLObject, 4));
                return;
        }
    }

    public k0(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27141a = i10;
        this.d = p41Var;
        this.f27142b = i7;
        this.f27144e = tL_messages_searchGlobal;
        this.f27143c = z10;
    }
}
