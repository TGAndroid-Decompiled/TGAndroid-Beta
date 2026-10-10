package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lt;
public final class m0 implements RequestDelegate {
    public final int f19591a;
    public final int f19592b;
    public final boolean f19593c;
    public final Object d;
    public final Object f19594e;

    public m0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19591a = 0;
        this.d = voIPService;
        this.f19592b = i10;
        this.f19593c = z10;
        this.f19594e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19591a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19592b, this.f19593c, (String) this.f19594e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.f0((jt) this.d, this.f19592b, (TLRPC.TL_messages_searchGlobal) this.f19594e, this.f19593c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.f0((lt) this.d, this.f19592b, (TLRPC.TL_messages_searchGlobal) this.f19594e, this.f19593c, tLObject, 3));
                return;
        }
    }

    public m0(d71 d71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19591a = i11;
        this.d = d71Var;
        this.f19592b = i10;
        this.f19594e = tL_messages_searchGlobal;
        this.f19593c = z10;
    }
}
