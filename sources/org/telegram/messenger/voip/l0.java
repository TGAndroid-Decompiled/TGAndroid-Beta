package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.ws;
public final class l0 implements RequestDelegate {
    public final int f19569a;
    public final int f19570b;
    public final boolean f19571c;
    public final Object d;
    public final Object f19572e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19569a = 0;
        this.d = voIPService;
        this.f19570b = i10;
        this.f19571c = z10;
        this.f19572e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19569a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19570b, this.f19571c, (String) this.f19572e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f19570b, (TLRPC.TL_messages_searchGlobal) this.f19572e, this.f19571c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ws) this.d, this.f19570b, (TLRPC.TL_messages_searchGlobal) this.f19572e, this.f19571c, tLObject, 3));
                return;
        }
    }

    public l0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19569a = i11;
        this.d = u61Var;
        this.f19570b = i10;
        this.f19572e = tL_messages_searchGlobal;
        this.f19571c = z10;
    }
}
