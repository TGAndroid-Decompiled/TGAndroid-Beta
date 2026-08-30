package org.telegram.messenger.voip;

import cg.b1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.w51;
public final class k0 implements RequestDelegate {
    public final int f18796a;
    public final int f18797b;
    public final boolean f18798c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z4) {
        this.f18796a = 0;
        this.d = voIPService;
        this.f18797b = i10;
        this.f18798c = z4;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18796a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18797b, this.f18798c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new b1((ps) this.d, this.f18797b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18798c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b1((rs) this.d, this.f18797b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18798c, tLObject, 4));
                return;
        }
    }

    public k0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f18796a = i11;
        this.d = w51Var;
        this.f18797b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18798c = z4;
    }
}
