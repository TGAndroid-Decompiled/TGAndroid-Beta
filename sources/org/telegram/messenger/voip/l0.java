package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lt;
public final class l0 implements RequestDelegate {
    public final int f19579a;
    public final int f19580b;
    public final boolean f19581c;
    public final Object d;
    public final Object f19582e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19579a = 0;
        this.d = voIPService;
        this.f19580b = i10;
        this.f19581c = z10;
        this.f19582e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19579a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19580b, this.f19581c, (String) this.f19582e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.f0((jt) this.d, this.f19580b, (TLRPC.TL_messages_searchGlobal) this.f19582e, this.f19581c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.f0((lt) this.d, this.f19580b, (TLRPC.TL_messages_searchGlobal) this.f19582e, this.f19581c, tLObject, 3));
                return;
        }
    }

    public l0(e71 e71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19579a = i11;
        this.d = e71Var;
        this.f19580b = i10;
        this.f19582e = tL_messages_searchGlobal;
        this.f19581c = z10;
    }
}
