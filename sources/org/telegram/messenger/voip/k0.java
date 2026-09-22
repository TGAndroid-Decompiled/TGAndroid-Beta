package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
public final class k0 implements RequestDelegate {
    public final int f17908a;
    public final int f17909b;
    public final boolean f17910c;
    public final Object d;
    public final Object e;

    public k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.f17908a = 0;
        this.d = voIPService;
        this.f17909b = i10;
        this.f17910c = z10;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17908a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.f17909b, this.f17910c, (String) this.e, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((rs) this.d, this.f17909b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17910c, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.f17909b, (TLRPC.TL_messages_searchGlobal) this.e, this.f17910c, tLObject, 3));
                return;
        }
    }

    public k0(m61 m61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17908a = i11;
        this.d = m61Var;
        this.f17909b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17910c = z10;
    }
}
