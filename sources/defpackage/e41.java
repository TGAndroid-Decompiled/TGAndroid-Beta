package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
public final class e41 {
    public TL_account.TL_businessChatLink a;

    public final boolean equals(Object obj) {
        TL_account.TL_businessChatLink tL_businessChatLink = this.a;
        if (this == obj) {
            return true;
        }
        if (obj != null && e41.class == obj.getClass()) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = ((e41) obj).a;
            if (tL_businessChatLink.views == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && hq6.M(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                return true;
            }
        }
        return false;
    }
}
