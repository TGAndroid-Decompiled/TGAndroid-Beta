package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nt;
public final class l0 implements RequestDelegate {
    public final int f19356a;
    public final int f19357b;
    public final boolean f19358c;
    public final Object d;
    public final Object f19359e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19356a = 0;
        this.d = voIPService;
        this.f19357b = i10;
        this.f19358c = z10;
        this.f19359e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19356a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19357b, this.f19358c, (String) this.f19359e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.g0((lt) this.d, this.f19357b, (TLRPC.TL_messages_searchGlobal) this.f19359e, this.f19358c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.g0((nt) this.d, this.f19357b, (TLRPC.TL_messages_searchGlobal) this.f19359e, this.f19358c, tLObject, 3));
                return;
        }
    }

    public l0(h71 h71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19356a = i11;
        this.d = h71Var;
        this.f19357b = i10;
        this.f19359e = tL_messages_searchGlobal;
        this.f19358c = z10;
    }
}
