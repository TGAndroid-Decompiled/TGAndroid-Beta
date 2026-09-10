package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class x0 implements RequestDelegate {
    public final int f16929a;
    public final boolean f16930b;
    public final Object f16931c;
    public final Object d;

    public x0(Object obj, Object obj2, boolean z10, int i10) {
        this.f16929a = i10;
        this.f16931c = obj;
        this.d = obj2;
        this.f16930b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16929a) {
            case 0:
                ((ChatObject.Call) this.f16931c).lambda$loadMembers$3(this.f16930b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f16931c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f16930b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f16931c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f16930b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f16931c).lambda$getBlockedPeers$113(this.f16930b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f16931c).lambda$load$1((int[]) this.d, this.f16930b, tLObject, tL_error);
                return;
        }
    }

    public x0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f16929a = i10;
        this.f16931c = obj;
        this.f16930b = z10;
        this.d = tLObject;
    }
}
