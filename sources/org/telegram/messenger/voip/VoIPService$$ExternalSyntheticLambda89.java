package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.DialogsChannelsAdapter;
import org.telegram.ui.Components.UniversalAdapter;

public final class VoIPService$$ExternalSyntheticLambda89 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final boolean f$2;
    public final Object f$3;

    public VoIPService$$ExternalSyntheticLambda89(int i, String str, VoIPService voIPService, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = voIPService;
        this.f$1 = i;
        this.f$2 = z;
        this.f$3 = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$54(this.f$1, this.f$2, (String) this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((DialogsBotsAdapter) this.f$0).lambda$searchMessages$4(this.f$1, (TLRPC.TL_messages_searchGlobal) this.f$3, this.f$2, tLObject, tL_error);
                break;
            default:
                ((DialogsChannelsAdapter) this.f$0).lambda$searchMessages$1(this.f$1, (TLRPC.TL_messages_searchGlobal) this.f$3, this.f$2, tLObject, tL_error);
                break;
        }
    }

    public VoIPService$$ExternalSyntheticLambda89(UniversalAdapter universalAdapter, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = universalAdapter;
        this.f$1 = i;
        this.f$3 = tL_messages_searchGlobal;
        this.f$2 = z;
    }
}
