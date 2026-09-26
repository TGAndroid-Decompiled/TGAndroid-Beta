package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.vs;
public final class k0 implements RequestDelegate {
    public final int f17912a;
    public final int f17913b;
    public final boolean f17914c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17912a = 0;
        this.d = voIPService;
        this.f17913b = i10;
        this.f17914c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17912a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17913b, this.f17914c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.f17913b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17914c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((vs) this.d, this.f17913b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17914c, tLObject, 3));
                return;
        }
    }

    public k0(k61 k61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17912a = i11;
        this.d = k61Var;
        this.f17913b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17914c = z10;
    }
}
