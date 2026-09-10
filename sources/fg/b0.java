package fg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.ul0;
public class b0 extends ul0 {
    public final Context f7954c;
    public final int d;
    public final boolean e;
    public final boolean f7955f;
    public final f6 h;

    public b0(int i10, Context context, f6 f6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.f7954c = context;
        this.d = i10;
        this.f7955f = z11;
        this.h = f6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        n4 n4Var = (n4) c1Var.f41610a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        n4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = mg.d.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        n4Var.a(j3, str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        n4 n4Var = new n4(this.f7954c, this.h, z10);
        if (this.f7955f && !n4Var.f19567x) {
            n4Var.f19567x = true;
            NotificationCenter.getInstance(n4Var.h).listen(n4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(n4Var, 1));
        }
        n4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new s4.c1(n4Var);
    }
}
