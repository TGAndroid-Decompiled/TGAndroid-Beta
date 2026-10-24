package org.telegram.messenger.voip;

import ai.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ys;
public final class j0 implements RequestDelegate {
    public final int f19951a;
    public final int f19952b;
    public final boolean f19953c;
    public final Object d;
    public final Object e;

    public j0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19951a = 0;
        this.d = voIPService;
        this.f19952b = i10;
        this.f19953c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19951a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19952b, this.f19953c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new eb((ys) this.d, this.f19952b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19953c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new eb((at) this.d, this.f19952b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19953c, tLObject, 4));
                return;
        }
    }

    public j0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19951a = i11;
        this.d = a71Var;
        this.f19952b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19953c = z10;
    }
}
