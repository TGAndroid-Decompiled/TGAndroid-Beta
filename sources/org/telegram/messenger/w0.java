package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class w0 implements RequestDelegate {
    public final int f18007a;
    public final boolean f18008b;
    public final Object f18009c;
    public final Object d;

    public w0(Object obj, Object obj2, boolean z10, int i10) {
        this.f18007a = i10;
        this.f18009c = obj;
        this.d = obj2;
        this.f18008b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18007a) {
            case 0:
                ((ChatObject.Call) this.f18009c).lambda$loadMembers$3(this.f18008b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18009c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f18008b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18009c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f18008b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18009c).lambda$getBlockedPeers$113(this.f18008b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f18009c).lambda$load$1((int[]) this.d, this.f18008b, tLObject, tL_error);
                return;
        }
    }

    public w0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f18007a = i10;
        this.f18009c = obj;
        this.f18008b = z10;
        this.d = tLObject;
    }
}
