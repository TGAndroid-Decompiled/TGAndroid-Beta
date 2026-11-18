package org.telegram.messenger.voip;

import di.ca;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.z41;
public final class k0 implements RequestDelegate {
    public final int f27510a;
    public final int f27511b;
    public final boolean f27512c;
    public final Object d;
    public final Object f27513e;

    public k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.f27510a = 0;
        this.d = voIPService;
        this.f27511b = i7;
        this.f27512c = z10;
        this.f27513e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27510a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f27511b, this.f27512c, (String) this.f27513e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ca((is) this.d, this.f27511b, (TLRPC.TL_messages_searchGlobal) this.f27513e, this.f27512c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.g3(new ca((ks) this.d, this.f27511b, (TLRPC.TL_messages_searchGlobal) this.f27513e, this.f27512c, tLObject, 4));
                return;
        }
    }

    public k0(z41 z41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27510a = i10;
        this.d = z41Var;
        this.f27511b = i7;
        this.f27513e = tL_messages_searchGlobal;
        this.f27512c = z10;
    }
}
