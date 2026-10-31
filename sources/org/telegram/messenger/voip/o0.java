package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p51;
public final class o0 implements RequestDelegate {
    public final int f18685a;
    public final int f18686b;
    public final boolean f18687c;
    public final Object d;
    public final Object e;

    public o0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f18685a = 0;
        this.d = voIPService;
        this.f18686b = i10;
        this.f18687c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18685a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f18686b, this.f18687c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ig.o0((gs) this.d, this.f18686b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18687c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.i0.g3(new ig.o0((is) this.d, this.f18686b, (TLRPC.TL_messages_searchGlobal) this.e, this.f18687c, tLObject, 4));
                return;
        }
    }

    public o0(p51 p51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18685a = i11;
        this.d = p51Var;
        this.f18686b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18687c = z10;
    }
}
