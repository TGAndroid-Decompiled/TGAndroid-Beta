package org.telegram.messenger.voip;

import ag.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.ns;
public final class j0 implements RequestDelegate {
    public final int f21961a;
    public final int f21962b;
    public final boolean f21963c;
    public final Object d;
    public final Object f21964e;

    public j0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f21961a = 0;
        this.d = voIPService;
        this.f21962b = i10;
        this.f21963c = z10;
        this.f21964e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21961a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f21962b, this.f21963c, (String) this.f21964e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new d1((ls) this.d, this.f21962b, (TLRPC.TL_messages_searchGlobal) this.f21964e, this.f21963c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new d1((ns) this.d, this.f21962b, (TLRPC.TL_messages_searchGlobal) this.f21964e, this.f21963c, tLObject, 4));
                return;
        }
    }

    public j0(k51 k51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21961a = i11;
        this.d = k51Var;
        this.f21962b = i10;
        this.f21964e = tL_messages_searchGlobal;
        this.f21963c = z10;
    }
}
