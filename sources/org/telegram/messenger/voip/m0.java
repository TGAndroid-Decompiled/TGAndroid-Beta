package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.z61;
public final class m0 implements RequestDelegate {
    public final int f18828a;
    public final int f18829b;
    public final boolean f18830c;
    public final Object d;
    public final Object e;

    public m0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f18828a = 0;
        this.d = voIPService;
        this.f18829b = i10;
        this.f18830c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18828a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18829b, this.f18830c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.l0((et) this.d, this.f18829b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18830c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.l0((gt) this.d, this.f18829b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18830c, tLObject, 3));
                return;
        }
    }

    public m0(z61 z61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18828a = i11;
        this.d = z61Var;
        this.f18829b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18830c = z10;
    }
}
