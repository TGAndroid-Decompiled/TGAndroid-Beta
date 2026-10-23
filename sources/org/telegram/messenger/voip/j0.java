package org.telegram.messenger.voip;

import ai.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ct;
public final class j0 implements RequestDelegate {
    public final int f19956a;
    public final int f19957b;
    public final boolean f19958c;
    public final Object d;
    public final Object e;

    public j0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19956a = 0;
        this.d = voIPService;
        this.f19957b = i10;
        this.f19958c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19956a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19957b, this.f19958c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new eb((at) this.d, this.f19957b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19958c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new eb((ct) this.d, this.f19957b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19958c, tLObject, 4));
                return;
        }
    }

    public j0(b71 b71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19956a = i11;
        this.d = b71Var;
        this.f19957b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19958c = z10;
    }
}
