package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class u0 implements RequestDelegate {

    public final int f21669a;

    public final boolean f21670b;

    public final Object f21671c;
    public final Object d;

    public u0(Object obj, Object obj2, boolean z10, int i10) {
        this.f21669a = i10;
        this.f21671c = obj;
        this.d = obj2;
        this.f21670b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21669a) {
            case 0:
                ((ChatObject.Call) this.f21671c).lambda$loadMembers$3(this.f21670b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.f21671c).lambda$loadAvatarConstructor$242((SharedPreferences) this.d, this.f21670b, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f21671c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f21670b, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f21671c).lambda$getBlockedPeers$113(this.f21670b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController.CommonChatsList) this.f21671c).lambda$load$1((int[]) this.d, this.f21670b, tLObject, tL_error);
                break;
        }
    }

    public u0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f21669a = i10;
        this.f21671c = obj;
        this.f21670b = z10;
        this.d = tLObject;
    }
}
