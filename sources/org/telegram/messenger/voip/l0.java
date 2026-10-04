package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.ws;
public final class l0 implements RequestDelegate {
    public final int f19577a;
    public final int f19578b;
    public final boolean f19579c;
    public final Object d;
    public final Object f19580e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19577a = 0;
        this.d = voIPService;
        this.f19578b = i10;
        this.f19579c = z10;
        this.f19580e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19577a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19578b, this.f19579c, (String) this.f19580e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f19578b, (TLRPC.TL_messages_searchGlobal) this.f19580e, this.f19579c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ws) this.d, this.f19578b, (TLRPC.TL_messages_searchGlobal) this.f19580e, this.f19579c, tLObject, 3));
                return;
        }
    }

    public l0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19577a = i11;
        this.d = u61Var;
        this.f19578b = i10;
        this.f19580e = tL_messages_searchGlobal;
        this.f19579c = z10;
    }
}
