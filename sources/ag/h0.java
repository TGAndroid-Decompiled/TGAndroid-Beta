package ag;

import android.text.TextUtils;
import org.telegram.messenger.vi;
import org.telegram.tgnet.tl.TL_account;
public final class h0 {
    public TL_account.TL_businessChatLink f539a;

    public final boolean equals(Object obj) {
        TL_account.TL_businessChatLink tL_businessChatLink = this.f539a;
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = ((h0) obj).f539a;
            if (tL_businessChatLink.views == tL_businessChatLink2.views && TextUtils.equals(tL_businessChatLink.link, tL_businessChatLink2.link) && TextUtils.equals(tL_businessChatLink.title, tL_businessChatLink2.title) && TextUtils.equals(tL_businessChatLink.message, tL_businessChatLink2.message) && vi.K(tL_businessChatLink.entities, tL_businessChatLink2.entities)) {
                return true;
            }
        }
        return false;
    }
}
