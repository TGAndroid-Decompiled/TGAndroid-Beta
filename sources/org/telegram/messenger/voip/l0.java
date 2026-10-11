package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lt;
public final class l0 implements RequestDelegate {
    public final int f19615a;
    public final int f19616b;
    public final boolean f19617c;
    public final Object d;
    public final Object f19618e;

    public l0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19615a = 0;
        this.d = voIPService;
        this.f19616b = i10;
        this.f19617c = z10;
        this.f19618e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19615a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19616b, this.f19617c, (String) this.f19618e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.f0((jt) this.d, this.f19616b, (TLRPC.TL_messages_searchGlobal) this.f19618e, this.f19617c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.f0((lt) this.d, this.f19616b, (TLRPC.TL_messages_searchGlobal) this.f19618e, this.f19617c, tLObject, 3));
                return;
        }
    }

    public l0(d71 d71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19615a = i11;
        this.d = d71Var;
        this.f19616b = i10;
        this.f19618e = tL_messages_searchGlobal;
        this.f19617c = z10;
    }
}
