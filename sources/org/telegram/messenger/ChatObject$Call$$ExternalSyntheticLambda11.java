package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

public final class ChatObject$Call$$ExternalSyntheticLambda11 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public ChatObject$Call$$ExternalSyntheticLambda11(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatObject.Call) this.f$0).lambda$loadMembers$3(this.f$1, (TL_phone.getGroupParticipants) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadAvatarConstructor$242((SharedPreferences) this.f$2, this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadStickersByEmojiOrName$85((String) this.f$2, this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$getBlockedPeers$113(this.f$1, (TLRPC.TL_contacts_getBlocked) this.f$2, tLObject, tL_error);
                break;
            default:
                ((MessagesController.CommonChatsList) this.f$0).lambda$load$1((int[]) this.f$2, this.f$1, tLObject, tL_error);
                break;
        }
    }

    public ChatObject$Call$$ExternalSyntheticLambda11(Object obj, boolean z, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = tLObject;
    }
}
