package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.us;
public final class k0 implements RequestDelegate {
    public final int f17897a;
    public final int f17898b;
    public final boolean f17899c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17897a = 0;
        this.d = voIPService;
        this.f17898b = i10;
        this.f17899c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17897a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17898b, this.f17899c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((ss) this.d, this.f17898b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17899c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f17898b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17899c, tLObject, 3));
                return;
        }
    }

    public k0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17897a = i11;
        this.d = j61Var;
        this.f17898b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17899c = z10;
    }
}
