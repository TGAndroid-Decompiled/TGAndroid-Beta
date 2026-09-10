package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zs;
public final class n0 implements RequestDelegate {
    public final int f16756a;
    public final int f16757b;
    public final boolean f16758c;
    public final Object d;
    public final Object e;

    public n0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f16756a = 0;
        this.d = voIPService;
        this.f16757b = i10;
        this.f16758c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16756a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f16757b, this.f16758c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.f0((xs) this.d, this.f16757b, (TLRPC.TL_messages_searchGlobal) this.e, this.f16758c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.f0((zs) this.d, this.f16757b, (TLRPC.TL_messages_searchGlobal) this.e, this.f16758c, tLObject, 4));
                return;
        }
    }

    public n0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f16756a = i11;
        this.d = j61Var;
        this.f16757b = i10;
        this.e = tL_messages_searchGlobal;
        this.f16758c = z10;
    }
}
