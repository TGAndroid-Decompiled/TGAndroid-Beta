package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.v51;
public final class k0 implements RequestDelegate {
    public final int f17653a;
    public final int f17654b;
    public final boolean f17655c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17653a = 0;
        this.d = voIPService;
        this.f17654b = i10;
        this.f17655c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17653a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17654b, this.f17655c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((ss) this.d, this.f17654b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17655c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((us) this.d, this.f17654b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17655c, tLObject, 3));
                return;
        }
    }

    public k0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17653a = i11;
        this.d = v51Var;
        this.f17654b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17655c = z10;
    }
}
