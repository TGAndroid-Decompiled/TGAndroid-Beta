package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ProfileActivity;
public final class or8 extends ClickableSpan {
    public final TLRPC.TL_username a;
    public final String b;
    public final wr8 c;

    public or8(wr8 wr8Var, TLRPC.TL_username tL_username, String str) {
        this.c = wr8Var;
        this.a = tL_username;
        this.b = str;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.TL_username tL_username = this.a;
        boolean z = tL_username.editable;
        ProfileActivity profileActivity = this.c.e;
        if (!z) {
            if (profileActivity.o5 != this) {
                profileActivity.w3(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new pl7(this, tL_username, (byte) 15)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.w3(null);
        String str = profileActivity.getMessagesController().N2 + "/" + this.b;
        TLRPC.Chat chat = profileActivity.F2;
        if (chat != null && chat.noforwards) {
            return;
        }
        hl.g(str);
        profileActivity.M.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
