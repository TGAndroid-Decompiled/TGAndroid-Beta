package org.telegram.messenger.voip;

import di.z9;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.p41;
public final class k0 implements RequestDelegate {
    public final int f27142a;
    public final int f27143b;
    public final boolean f27144c;
    public final Object d;
    public final Object f27145e;

    public k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.f27142a = 0;
        this.d = voIPService;
        this.f27143b = i7;
        this.f27144c = z10;
        this.f27145e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f27142a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f27143b, this.f27144c, (String) this.f27145e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new z9((bs) this.d, this.f27143b, (TLRPC.TL_messages_searchGlobal) this.f27145e, this.f27144c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new z9((ds) this.d, this.f27143b, (TLRPC.TL_messages_searchGlobal) this.f27145e, this.f27144c, tLObject, 4));
                return;
        }
    }

    public k0(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27142a = i10;
        this.d = p41Var;
        this.f27143b = i7;
        this.f27145e = tL_messages_searchGlobal;
        this.f27144c = z10;
    }
}
