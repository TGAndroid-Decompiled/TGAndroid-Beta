package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class w0 implements RequestDelegate {
    public final int f19652a;
    public final boolean f19653b;
    public final Object f19654c;
    public final Object d;

    public w0(Object obj, Object obj2, boolean z10, int i10) {
        this.f19652a = i10;
        this.f19654c = obj;
        this.d = obj2;
        this.f19653b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19652a) {
            case 0:
                ((ChatObject.Call) this.f19654c).lambda$loadMembers$3(this.f19653b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19654c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f19653b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19654c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f19653b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19654c).lambda$getBlockedPeers$112(this.f19653b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f19654c).lambda$load$1((int[]) this.d, this.f19653b, tLObject, tL_error);
                return;
        }
    }

    public w0(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f19652a = i10;
        this.f19654c = obj;
        this.f19653b = z10;
        this.d = tLObject;
    }
}
