package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v0 implements RequestDelegate {
    public final int f20239a;
    public final boolean f20240b;
    public final Object f20241c;
    public final Object d;

    public v0(Object obj, Object obj2, boolean z4, int i10) {
        this.f20239a = i10;
        this.f20241c = obj;
        this.d = obj2;
        this.f20240b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20239a) {
            case 0:
                ((ChatObject.Call) this.f20241c).lambda$loadMembers$3(this.f20240b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f20241c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f20240b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20241c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f20240b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20241c).lambda$getBlockedPeers$113(this.f20240b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f20241c).lambda$load$1((int[]) this.d, this.f20240b, tLObject, tL_error);
                return;
        }
    }

    public v0(Object obj, boolean z4, TLObject tLObject, int i10) {
        this.f20239a = i10;
        this.f20241c = obj;
        this.f20240b = z4;
        this.d = tLObject;
    }
}
