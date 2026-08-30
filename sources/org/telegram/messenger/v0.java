package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v0 implements RequestDelegate {
    public final int f18623a;
    public final boolean f18624b;
    public final Object f18625c;
    public final Object d;

    public v0(Object obj, Object obj2, boolean z4, int i10) {
        this.f18623a = i10;
        this.f18625c = obj;
        this.d = obj2;
        this.f18624b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18623a) {
            case 0:
                ((ChatObject.Call) this.f18625c).lambda$loadMembers$3(this.f18624b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18625c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f18624b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18625c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f18624b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18625c).lambda$getBlockedPeers$113(this.f18624b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f18625c).lambda$load$1((int[]) this.d, this.f18624b, tLObject, tL_error);
                return;
        }
    }

    public v0(Object obj, boolean z4, TLObject tLObject, int i10) {
        this.f18623a = i10;
        this.f18625c = obj;
        this.f18624b = z4;
        this.d = tLObject;
    }
}
