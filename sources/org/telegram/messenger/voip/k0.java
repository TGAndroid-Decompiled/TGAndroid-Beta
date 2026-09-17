package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.v51;
public final class k0 implements RequestDelegate {
    public final int f19389a;
    public final int f19390b;
    public final boolean f19391c;
    public final Object d;
    public final Object f19392e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19389a = 0;
        this.d = voIPService;
        this.f19390b = i10;
        this.f19391c = z10;
        this.f19392e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19389a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19390b, this.f19391c, (String) this.f19392e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((qs) this.d, this.f19390b, (TLRPC.TL_messages_searchGlobal) this.f19392e, this.f19391c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ss) this.d, this.f19390b, (TLRPC.TL_messages_searchGlobal) this.f19392e, this.f19391c, tLObject, 3));
                return;
        }
    }

    public k0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19389a = i11;
        this.d = v51Var;
        this.f19390b = i10;
        this.f19392e = tL_messages_searchGlobal;
        this.f19391c = z10;
    }
}
