package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v0 implements RequestDelegate {
    public final int f21711a;
    public final boolean f21712b;
    public final Object f21713c;
    public final Object d;

    public v0(Object obj, Object obj2, boolean z10, int i9) {
        this.f21711a = i9;
        this.f21713c = obj;
        this.d = obj2;
        this.f21712b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21711a) {
            case 0:
                ((ChatObject.Call) this.f21713c).lambda$loadMembers$3(this.f21712b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f21713c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f21712b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f21713c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f21712b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f21713c).lambda$getBlockedPeers$113(this.f21712b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f21713c).lambda$load$1((int[]) this.d, this.f21712b, tLObject, tL_error);
                return;
        }
    }

    public v0(Object obj, boolean z10, TLObject tLObject, int i9) {
        this.f21711a = i9;
        this.f21713c = obj;
        this.f21712b = z10;
        this.d = tLObject;
    }
}
