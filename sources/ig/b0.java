package ig;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Components.lm0;
public class b0 extends lm0 {
    public final Context f14004c;
    public final int d;
    public final boolean e;
    public final boolean f14005f;
    public final u6 h;

    public b0(int i10, Context context, u6 u6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.f14004c = context;
        this.d = i10;
        this.f14005f = z11;
        this.h = u6Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override
    public void v(s4.e1 e1Var, int i10) {
        TLRPC.Chat chat;
        String str;
        r4 r4Var = (r4) e1Var.f47735a;
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
        r4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = UserObject.getFirstName(user);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = pg.d.i(chat, i11, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        r4Var.a(j10, true, str);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        r4 r4Var = new r4(this.f14004c, this.h, z10);
        if (this.f14005f && !r4Var.f24967x) {
            r4Var.f24967x = true;
            NotificationCenter.getInstance(r4Var.h).listen(r4Var, NotificationCenter.userIsPremiumBlockedUpadted, new h2(r4Var, 1));
        }
        r4Var.setLayoutParams(new s4.q0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new s4.e1(r4Var);
    }
}
