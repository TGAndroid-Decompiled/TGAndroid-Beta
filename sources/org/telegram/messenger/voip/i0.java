package org.telegram.messenger.voip;

import hh.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.hs;

public final class i0 implements RequestDelegate {

    public final int f21917a;

    public final int f21918b;

    public final boolean f21919c;
    public final Object d;

    public final Object f21920e;

    public i0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f21917a = 0;
        this.d = voIPService;
        this.f21918b = i10;
        this.f21919c = z10;
        this.f21920e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21917a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f21918b, this.f21919c, (String) this.f21920e, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new l8((fs) this.d, this.f21918b, (TLRPC.TL_messages_searchGlobal) this.f21920e, this.f21919c, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new l8((hs) this.d, this.f21918b, (TLRPC.TL_messages_searchGlobal) this.f21920e, this.f21919c, tLObject, 3));
                break;
        }
    }

    public i0(b51 b51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21917a = i11;
        this.d = b51Var;
        this.f21918b = i10;
        this.f21920e = tL_messages_searchGlobal;
        this.f21919c = z10;
    }
}
