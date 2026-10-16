package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
public final class l0 implements RequestDelegate {
    public final int f18519a;
    public final int f18520b;
    public final boolean f18521c;
    public final Object d;
    public final Object e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f18519a = 0;
        this.d = voIPService;
        this.f18520b = i10;
        this.f18521c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18519a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18520b, this.f18521c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.k0((et) this.d, this.f18520b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18521c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.k0((gt) this.d, this.f18520b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18521c, tLObject, 3));
                return;
        }
    }

    public l0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18519a = i11;
        this.d = a71Var;
        this.f18520b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18521c = z10;
    }
}
