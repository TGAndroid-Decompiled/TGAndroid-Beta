package org.telegram.messenger.voip;

import dg.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.w51;
public final class k0 implements RequestDelegate {
    public final int f20426a;
    public final int f20427b;
    public final boolean f20428c;
    public final Object d;
    public final Object f20429e;

    public k0(int i10, String str, VoIPService voIPService, boolean z4) {
        this.f20426a = 0;
        this.d = voIPService;
        this.f20427b = i10;
        this.f20428c = z4;
        this.f20429e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20426a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f20427b, this.f20428c, (String) this.f20429e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1((rs) this.d, this.f20427b, (TLRPC.TL_messages_searchGlobal) this.f20429e, this.f20428c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a1((ts) this.d, this.f20427b, (TLRPC.TL_messages_searchGlobal) this.f20429e, this.f20428c, tLObject, 4));
                return;
        }
    }

    public k0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f20426a = i11;
        this.d = w51Var;
        this.f20427b = i10;
        this.f20429e = tL_messages_searchGlobal;
        this.f20428c = z4;
    }
}
