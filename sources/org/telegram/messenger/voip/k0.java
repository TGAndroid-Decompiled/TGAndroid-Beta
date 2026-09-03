package org.telegram.messenger.voip;

import cg.b1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.w51;
public final class k0 implements RequestDelegate {
    public final int f18778a;
    public final int f18779b;
    public final boolean f18780c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z4) {
        this.f18778a = 0;
        this.d = voIPService;
        this.f18779b = i10;
        this.f18780c = z4;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18778a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18779b, this.f18780c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new b1((os) this.d, this.f18779b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18780c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b1((qs) this.d, this.f18779b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18780c, tLObject, 4));
                return;
        }
    }

    public k0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f18778a = i11;
        this.d = w51Var;
        this.f18779b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18780c = z4;
    }
}
