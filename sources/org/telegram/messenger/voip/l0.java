package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
public final class l0 implements RequestDelegate {
    public final int f19355a;
    public final int f19356b;
    public final boolean f19357c;
    public final Object d;
    public final Object f19358e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19355a = 0;
        this.d = voIPService;
        this.f19356b = i10;
        this.f19357c = z10;
        this.f19358e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19355a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19356b, this.f19357c, (String) this.f19358e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.g0((kt) this.d, this.f19356b, (TLRPC.TL_messages_searchGlobal) this.f19358e, this.f19357c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.g0((mt) this.d, this.f19356b, (TLRPC.TL_messages_searchGlobal) this.f19358e, this.f19357c, tLObject, 3));
                return;
        }
    }

    public l0(h71 h71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19355a = i11;
        this.d = h71Var;
        this.f19356b = i10;
        this.f19358e = tL_messages_searchGlobal;
        this.f19357c = z10;
    }
}
