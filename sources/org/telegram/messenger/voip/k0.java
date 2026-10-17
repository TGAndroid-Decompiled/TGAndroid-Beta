package org.telegram.messenger.voip;

import ai.cb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.s61;
public final class k0 implements RequestDelegate {
    public final int f19870a;
    public final int f19871b;
    public final boolean f19872c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19870a = 0;
        this.d = voIPService;
        this.f19871b = i10;
        this.f19872c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19870a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19871b, this.f19872c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new cb((at) this.d, this.f19871b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19872c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cb((ct) this.d, this.f19871b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19872c, tLObject, 4));
                return;
        }
    }

    public k0(s61 s61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19870a = i11;
        this.d = s61Var;
        this.f19871b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19872c = z10;
    }
}
