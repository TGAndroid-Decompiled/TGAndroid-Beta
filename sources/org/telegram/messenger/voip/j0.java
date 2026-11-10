package org.telegram.messenger.voip;

import bi.nb;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.wr;
public final class j0 implements RequestDelegate {
    public final int f26134a;
    public final int f26135b;
    public final boolean f26136c;
    public final Object d;
    public final Object f26137e;

    public j0(int i7, String str, VoIPService voIPService, boolean z9) {
        this.f26134a = 0;
        this.d = voIPService;
        this.f26135b = i7;
        this.f26136c = z9;
        this.f26137e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26134a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f26135b, this.f26136c, (String) this.f26137e, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.g0.h3(new nb((ur) this.d, this.f26135b, (TLRPC.TL_messages_searchGlobal) this.f26137e, this.f26136c, tLObject, 3));
                return;
            default:
                org.telegram.messenger.g0.h3(new nb((wr) this.d, this.f26135b, (TLRPC.TL_messages_searchGlobal) this.f26137e, this.f26136c, tLObject, 4));
                return;
        }
    }

    public j0(m41 m41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26134a = i10;
        this.d = m41Var;
        this.f26135b = i7;
        this.f26137e = tL_messages_searchGlobal;
        this.f26136c = z9;
    }
}
