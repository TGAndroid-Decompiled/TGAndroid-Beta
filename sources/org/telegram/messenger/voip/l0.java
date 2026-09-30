package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.vs;
public final class l0 implements RequestDelegate {
    public final int f17925a;
    public final int f17926b;
    public final boolean f17927c;
    public final Object d;
    public final Object e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17925a = 0;
        this.d = voIPService;
        this.f17926b = i10;
        this.f17927c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17925a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17926b, this.f17927c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.f17926b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17927c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((vs) this.d, this.f17926b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17927c, tLObject, 3));
                return;
        }
    }

    public l0(l61 l61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17925a = i11;
        this.d = l61Var;
        this.f17926b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17927c = z10;
    }
}
