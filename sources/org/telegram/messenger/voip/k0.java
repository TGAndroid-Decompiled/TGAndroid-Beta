package org.telegram.messenger.voip;

import ai.db;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.s61;
public final class k0 implements RequestDelegate {
    public final int f19881a;
    public final int f19882b;
    public final boolean f19883c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19881a = 0;
        this.d = voIPService;
        this.f19882b = i10;
        this.f19883c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19881a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19882b, this.f19883c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new db((at) this.d, this.f19882b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19883c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new db((ct) this.d, this.f19882b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19883c, tLObject, 4));
                return;
        }
    }

    public k0(s61 s61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19881a = i11;
        this.d = s61Var;
        this.f19882b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19883c = z10;
    }
}
