package hg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.lm0;
public class b0 extends lm0 {
    public final Context f10504c;
    public final int d;
    public final boolean e;
    public final boolean f10505f;
    public final c6 h;

    public b0(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.f10504c = context;
        this.d = i10;
        this.f10505f = z11;
        this.h = c6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(s4.b1 b1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        n4 n4Var = (n4) b1Var.f44838a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        n4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = og.d.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        n4Var.a(j10, str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        n4 n4Var = new n4(this.f10504c, this.h, z10);
        if (this.f10505f && !n4Var.f21269x) {
            n4Var.f21269x = true;
            NotificationCenter.getInstance(n4Var.h).listen(n4Var, NotificationCenter.userIsPremiumBlockedUpadted, new j2(n4Var, 1));
        }
        n4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new s4.b1(n4Var);
    }
}
