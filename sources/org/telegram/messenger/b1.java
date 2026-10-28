package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class b1 implements RequestDelegate {
    public final int f19662a;
    public final boolean f19663b;
    public final Object f19664c;
    public final Object d;

    public b1(Object obj, Object obj2, boolean z10, int i10) {
        this.f19662a = i10;
        this.f19664c = obj;
        this.d = obj2;
        this.f19663b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19662a) {
            case 0:
                ((ChatObject.Call) this.f19664c).lambda$loadMembers$3(this.f19663b, (TL_phone.getGroupParticipants) this.d, tLObject, tL_error);
                return;
            case 1:
                ((MediaDataController) this.f19664c).lambda$loadAvatarConstructor$243((SharedPreferences) this.d, this.f19663b, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19664c).lambda$loadStickersByEmojiOrName$85((String) this.d, this.f19663b, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19664c).lambda$getBlockedPeers$112(this.f19663b, (TLRPC.TL_contacts_getBlocked) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController.CommonChatsList) this.f19664c).lambda$load$1((int[]) this.d, this.f19663b, tLObject, tL_error);
                return;
        }
    }

    public b1(Object obj, boolean z10, TLObject tLObject, int i10) {
        this.f19662a = i10;
        this.f19664c = obj;
        this.f19663b = z10;
        this.d = tLObject;
    }
}
