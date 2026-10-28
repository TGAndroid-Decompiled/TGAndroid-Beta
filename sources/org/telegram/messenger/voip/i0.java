package org.telegram.messenger.voip;

import bi.db;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.k71;
public final class i0 implements RequestDelegate {
    public final int f21636a;
    public final int f21637b;
    public final boolean f21638c;
    public final Object d;
    public final Object e;

    public i0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f21636a = 0;
        this.d = voIPService;
        this.f21637b = i10;
        this.f21638c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21636a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f21637b, this.f21638c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new db((ct) this.d, this.f21637b, (TLRPC.TL_messages_searchGlobal) this.e, this.f21638c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new db((et) this.d, this.f21637b, (TLRPC.TL_messages_searchGlobal) this.e, this.f21638c, tLObject, 4));
                return;
        }
    }

    public i0(k71 k71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21636a = i11;
        this.d = k71Var;
        this.f21637b = i10;
        this.e = tL_messages_searchGlobal;
        this.f21638c = z10;
    }
}
