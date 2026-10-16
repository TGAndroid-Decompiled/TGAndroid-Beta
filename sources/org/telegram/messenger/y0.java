package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class y0 implements RequestDelegate {
    public final int f18754a;
    public final boolean f18755b;
    public final Object f18756c;
    public final Object d;

    public y0(Object obj, Object obj2, boolean z10, int i10) {
        this.f18754a = i10;
        this.f18756c = obj;
        this.d = obj2;
        this.f18755b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18754a) {
            case 0:
                ((ChatObject.Call) this.f18756c).lambda$loadMembers$3(this.f18755b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f18756c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f18755b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18756c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f18755b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18756c).lambda$getBlockedPeers$112(this.f18755b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f18756c).lambda$load$1((int[]) this.d, this.f18755b, tLObject, tL_error);
                return;
        }
    }

    public y0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f18754a = i10;
        this.f18756c = obj;
        this.f18755b = z10;
        this.d = tLObject;
    }
}
