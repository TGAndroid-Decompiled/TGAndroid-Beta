package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.ws;
public final class k0 implements RequestDelegate {
    public final int f17939a;
    public final int f17940b;
    public final boolean f17941c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17939a = 0;
        this.d = voIPService;
        this.f17940b = i10;
        this.f17941c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17939a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17940b, this.f17941c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f17940b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17941c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ws) this.d, this.f17940b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17941c, tLObject, 3));
                return;
        }
    }

    public k0(m61 m61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17939a = i11;
        this.d = m61Var;
        this.f17940b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17941c = z10;
    }
}
