package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class u0 implements RequestDelegate {
    public final int f19108a;
    public final boolean f19109b;
    public final Object f19110c;
    public final Object d;

    public u0(Object obj, Object obj2, boolean z10, int i10) {
        this.f19108a = i10;
        this.f19110c = obj;
        this.d = obj2;
        this.f19109b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19108a) {
            case 0:
                ((ChatObject.Call) this.f19110c).lambda$loadMembers$3(this.f19109b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19110c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f19109b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19110c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f19109b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19110c).lambda$getBlockedPeers$113(this.f19109b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f19110c).lambda$load$1((int[]) this.d, this.f19109b, tLObject, tL_error);
                return;
        }
    }

    public u0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f19108a = i10;
        this.f19110c = obj;
        this.f19109b = z10;
        this.d = tLObject;
    }
}
