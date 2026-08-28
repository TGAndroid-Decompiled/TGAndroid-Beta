package org.telegram.messenger.voip;

import gh.m8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.z41;
public final class i0 implements RequestDelegate {
    public final int f21893a;
    public final int f21894b;
    public final boolean f21895c;
    public final Object d;
    public final Object f21896e;

    public i0(int i9, String str, VoIPService voIPService, boolean z10) {
        this.f21893a = 0;
        this.d = voIPService;
        this.f21894b = i9;
        this.f21895c = z10;
        this.f21896e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21893a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f21894b, this.f21895c, (String) this.f21896e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m8((hs) this.d, this.f21894b, (TLRPC.TL_messages_searchGlobal) this.f21896e, this.f21895c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m8((js) this.d, this.f21894b, (TLRPC.TL_messages_searchGlobal) this.f21896e, this.f21895c, tLObject, 3));
                return;
        }
    }

    public i0(z41 z41Var, int i9, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f21893a = i10;
        this.d = z41Var;
        this.f21894b = i9;
        this.f21896e = tL_messages_searchGlobal;
        this.f21895c = z10;
    }
}
