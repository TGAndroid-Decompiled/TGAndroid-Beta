package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
public final class k0 implements RequestDelegate {
    public final int f17855a;
    public final int f17856b;
    public final boolean f17857c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17855a = 0;
        this.d = voIPService;
        this.f17856b = i10;
        this.f17857c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17855a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17856b, this.f17857c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((rs) this.d, this.f17856b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17857c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.f17856b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17857c, tLObject, 3));
                return;
        }
    }

    public k0(l61 l61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17855a = i11;
        this.d = l61Var;
        this.f17856b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17857c = z10;
    }
}
