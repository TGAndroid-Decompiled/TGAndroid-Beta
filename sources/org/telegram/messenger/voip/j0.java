package org.telegram.messenger.voip;

import ai.db;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.t61;
public final class j0 implements RequestDelegate {
    public final int f19873a;
    public final int f19874b;
    public final boolean f19875c;
    public final Object d;
    public final Object e;

    public j0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f19873a = 0;
        this.d = voIPService;
        this.f19874b = i10;
        this.f19875c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19873a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f19874b, this.f19875c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new db((at) this.d, this.f19874b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19875c, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new db((ct) this.d, this.f19874b, (TLRPC.TL_messages_searchGlobal) this.e, this.f19875c, tLObject, 4));
                return;
        }
    }

    public j0(t61 t61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19873a = i11;
        this.d = t61Var;
        this.f19874b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19875c = z10;
    }
}
