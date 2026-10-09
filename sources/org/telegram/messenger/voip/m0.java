package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kt;
public final class m0 implements RequestDelegate {
    public final int f19587a;
    public final int f19588b;
    public final boolean f19589c;
    public final Object d;
    public final Object f19590e;

    public m0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19587a = 0;
        this.d = voIPService;
        this.f19588b = i10;
        this.f19589c = z10;
        this.f19590e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19587a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19588b, this.f19589c, (String) this.f19590e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.f0((ht) this.d, this.f19588b, (TLRPC.TL_messages_searchGlobal) this.f19590e, this.f19589c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.f0((kt) this.d, this.f19588b, (TLRPC.TL_messages_searchGlobal) this.f19590e, this.f19589c, tLObject, 3));
                return;
        }
    }

    public m0(c71 c71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19587a = i11;
        this.d = c71Var;
        this.f19588b = i10;
        this.f19590e = tL_messages_searchGlobal;
        this.f19589c = z10;
    }
}
