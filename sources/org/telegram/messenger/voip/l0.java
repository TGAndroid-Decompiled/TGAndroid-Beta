package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.ws;
public final class l0 implements RequestDelegate {
    public final int f19574a;
    public final int f19575b;
    public final boolean f19576c;
    public final Object d;
    public final Object f19577e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19574a = 0;
        this.d = voIPService;
        this.f19575b = i10;
        this.f19576c = z10;
        this.f19577e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19574a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19575b, this.f19576c, (String) this.f19577e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f19575b, (TLRPC.TL_messages_searchGlobal) this.f19577e, this.f19576c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ws) this.d, this.f19575b, (TLRPC.TL_messages_searchGlobal) this.f19577e, this.f19576c, tLObject, 3));
                return;
        }
    }

    public l0(w61 w61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19574a = i11;
        this.d = w61Var;
        this.f19575b = i10;
        this.f19577e = tL_messages_searchGlobal;
        this.f19576c = z10;
    }
}
