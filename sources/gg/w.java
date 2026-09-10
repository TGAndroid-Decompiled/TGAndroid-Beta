package gg;

import android.text.TextUtils;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.tl.TL_account;
public final class w {
    public TL_account.TL_businessChatLink f9061a;

    public final boolean equals(Object obj) {
        TL_account.TL_businessChatLink tL_businessChatLink = this.f9061a;
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = ((w) obj).f9061a;
            if (tL_businessChatLink.views == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && MediaDataController.entitiesEqual(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                return true;
            }
        }
        return false;
    }
}
