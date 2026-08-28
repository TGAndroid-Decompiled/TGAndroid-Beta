package of;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.vk0;
public class z extends vk0 {
    public final Context f19559c;
    public final int d;
    public final boolean f19560e;
    public final boolean f19561f;
    public final b6 h;

    public z(int i9, Context context, b6 b6Var, boolean z10, boolean z11) {
        this.f19560e = z10;
        this.f19559c = context;
        this.d = i9;
        this.f19561f = z11;
        this.h = b6Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(f2.q1 q1Var, int i9) {
        TLRPC.Chat chat;
        String str;
        n4 n4Var = (n4) q1Var.f5501a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i10).hints.get(i9);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(i10).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        n4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = vf.c.i(chat, i10, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        n4Var.a(j10, str);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        boolean z10 = this.f19560e;
        n4 n4Var = new n4(this.f19559c, this.h, z10);
        if (this.f19561f && !n4Var.f24756x) {
            n4Var.f24756x = true;
            NotificationCenter.getInstance(n4Var.h).listen(n4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(n4Var, 1));
        }
        n4Var.setLayoutParams(new f2.a1(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new f2.q1(n4Var);
    }
}
