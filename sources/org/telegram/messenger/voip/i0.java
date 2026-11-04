package org.telegram.messenger.voip;

import ci.ka;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
public final class i0 implements RequestDelegate {
    public final int f26011a;
    public final int f26012b;
    public final boolean f26013c;
    public final Object d;
    public final Object f26014e;

    public i0(int i3, String str, VoIPService voIPService, boolean z10) {
        this.f26011a = 0;
        this.d = voIPService;
        this.f26012b = i3;
        this.f26013c = z10;
        this.f26014e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26011a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f26012b, this.f26013c, (String) this.f26014e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ka((vr) this.d, this.f26012b, (TLRPC.TL_messages_searchGlobal) this.f26014e, this.f26013c, tLObject, 4));
                return;
            default:
                org.telegram.messenger.g0.h3(new ka((xr) this.d, this.f26012b, (TLRPC.TL_messages_searchGlobal) this.f26014e, this.f26013c, tLObject, 5));
                return;
        }
    }

    public i0(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f26011a = i10;
        this.d = f41Var;
        this.f26012b = i3;
        this.f26014e = tL_messages_searchGlobal;
        this.f26013c = z10;
    }
}
